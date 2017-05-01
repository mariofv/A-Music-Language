package interpreter;

import exceptions.AmlSemanticException;
import parser.MusicLexer;

import java.util.*;

import static parser.MusicParser.*;

public class SemanticAnalyzer {

    private class SymbolInfo {
        private int line;
        private int type;
        private int index;

        public SymbolInfo(int line, int type, int index) {
            this.line = line;
            this.type = type;
            this.index = index;
        }

        public int getIndex() {
            return index;
        }

        public int getLine() {
            return line;
        }

        public int getType() {
            return type;
        }
    }

    private HashMap<String, AmlTree> functionMap;
    private HashMap<String, AmlTree> fragmentMap;
    private HashMap<String, AmlTree> songMap;
    private LinkedList<HashMap<String, SymbolInfo>> symbolTable;
    private int index;

    private static String mapType(int type) {
        switch (type) {
            case SONG:
                return "song";
            case VOID:
                return "void";
            case BOOL:
                return "bool";
            case INT:
                return "int";
            case CHORD:
                return "chord";
            case NOTE_TYPE:
                return "note";
            case DRUMS_NOTE_TYPE:
                return "drum";
            case NOT:
                return "not";
            case PLUS:
                return "+";
            case MINUS:
                return "-";
            case ASSIG:
                return "=";
            case PLUS_ASSIG:
                return "+=";
            case MINUS_ASSIG:
                return "-=";
            case PROD_ASSIG:
                return "*=";
            case DIVIDE_ASSIG:
                return "/=";
            case MOD_ASSIG:
                return "%=";
            case INCR:
                return "++";
            case DECR:
                return "--";
            default:
                return "unknown";
        }
    }

    public SemanticAnalyzer(Interpreter interpreter) {
        functionMap = interpreter.functionMap;
        fragmentMap = interpreter.fragmentMap;
        songMap = interpreter.songMap;
        symbolTable = new LinkedList<>();
    }

    public void analyze(AmlTree tree) throws AmlSemanticException {
        symbolTable.addFirst(new HashMap<>());
        analyzeInitialScope(tree);
        symbolTable.removeFirst();
    }

    private void analyzeListInstructions(AmlTree tree) throws AmlSemanticException {
        for (AmlTree instruction : tree.getArrayChildren()) {
            analyzeInstruction(instruction);
        }
    }

    private void analyzeListMusicInstructions(AmlTree tree) throws AmlSemanticException {
        for (AmlTree musicInstruction : tree.getArrayChildren()) {
            analyzeMusicInstruction(musicInstruction);
        }
    }

    private int getLType(AmlTree tree) throws AmlSemanticException {
        switch (tree.getType()) {
            case ID:
                return getSymbol(tree).getType();
            case ATTR_ACCESS:
                return INT;
            default:
                throw new Error("This should never happen");
        }
    }

    private boolean analyzeCommonInstruction(AmlTree commonInstruction) throws AmlSemanticException {
        //TODO: var_funcall
        switch (commonInstruction.getType()) {
            //Declaration
            case INT:
            case BOOL:
            case NOTE_TYPE:
            case DRUMS_NOTE_TYPE:
            case CHORD:
            case STRING_TYPE:
                for (AmlTree declaration : commonInstruction.getArrayChildren()) {
                    checkDeclaration(declaration, commonInstruction.getType());
                }
                return true;
            //Assignation
            case ASSIG:
            case PLUS_ASSIG:
            case MINUS_ASSIG:
            case PROD_ASSIG:
            case DIVIDE_ASSIG:
            case MOD_ASSIG:
                int lType = getLType(commonInstruction.getChild(0));
                int rType = getRType(commonInstruction.getChild(1));
                if (lType != rType) {
                    throw new AmlSemanticException("Type error in " + mapType(commonInstruction.getType()) +
                            " operation: " + mapType(lType) + ", " + mapType(rType), commonInstruction.getLine());
                }
                return true;
            case POST:
            case PRE:
                int type = getLType(commonInstruction.getChild(0));
                if (type != INT)
                    throw new AmlSemanticException("Type error in " + mapType(commonInstruction.getChild(1).getType()) +
                            " operation: " + mapType(type) + ". Expected int", commonInstruction.getLine());
                return true;
            case TONE:
                int toneType = checkExpression(commonInstruction.getChild(0));
                if (toneType != INT)
                    throw new AmlSemanticException("Type error, tone argument must be int type, but " +
                            mapType(toneType) + " was provided.", commonInstruction.getLine());
                return true;
            case BEAT:
                int beatLeftType = checkExpression(commonInstruction.getChild(0));
                int beatRightType = checkExpression(commonInstruction.getChild(1));
                if (beatLeftType != INT || beatRightType != INT)
                    throw new AmlSemanticException("Type error, beat arguments must be int type, but " +
                            mapType(beatLeftType) + ":" + mapType(beatRightType) +
                            " was provided.", commonInstruction.getLine());
                return true;
            case SPEED:
                int speedType = checkExpression(commonInstruction.getChild(0));
                if (speedType != INT)
                    throw new AmlSemanticException("Type error, speed argument must be int type, but " +
                            mapType(speedType) + " was provided.", commonInstruction.getLine());
                return true;
            case TRANSPORT:
                int transportType = checkExpression(commonInstruction.getChild(0));
                if (transportType != INT)
                    throw new AmlSemanticException("Type error, speed argument must be int type, but " +
                            mapType(transportType) + " was provided.", commonInstruction.getLine());
            case INSTRUMENT:
                commonInstruction.getChild(0).setInstrumentValue();
                return true;
            case FUNCALL:
                AmlTree funcDeclaration = functionMap.get(commonInstruction.getText());
                if (funcDeclaration == null) throw new AmlSemanticException(
                        "Function " + commonInstruction.getText() + " not declared.", commonInstruction.getLine());
                checkArguments(funcDeclaration, commonInstruction);
                return true;
        }
        return false;
    }

    private void checkDeclaration(AmlTree declaration, int type) throws AmlSemanticException {
        switch (declaration.getType()) {
            case ID:
                insertId(declaration, type);
                break;
            case ASSIG:
                int rType = getRType(declaration.getChild(1));
                if (type != rType) throw new AmlSemanticException(
                        "Type error in declaration: " + mapType(type) + ", " + mapType(rType), declaration.getLine());
                insertId(declaration.getChild(0), type);
                break;
            default: throw new Error("This should never happen");
        }
    }

    private int getRType(AmlTree child) throws AmlSemanticException {
        switch (child.getType()) {
            case DRUMSNOTES:
                return DRUMS_NOTE_TYPE;
            case NOTES:
                switch (child.getChild(0).getType()) {
                    case CHORD:
                        return CHORD;
                    case NOTE_LIST:
                        return NOTE_TYPE;
                    default: throw new Error("This should never happen");
                }
            case FIGURE:
                return INT;
            default:
                return checkExpression(child);
        }
    }

    private SymbolInfo getSymbol(AmlTree tree) throws AmlSemanticException {
        assert tree.getType() == ID;
        String id = tree.getText();
        if (id.equals("Time")) return new SymbolInfo(-1, INT, -1);
        for (HashMap<String, SymbolInfo> scope : symbolTable) {
            SymbolInfo data = scope.get(id);
            if (data != null) {
                tree.setIndex(data.getIndex());
                return data;
            }
        }
        throw new AmlSemanticException("Variable " + id + " not declared", tree.getLine());
    }

    private int checkExpression(AmlTree expression) throws AmlSemanticException {
        //Atoms
        switch (expression.getType()) {
            //var_access
            case ATTR_ACCESS:
                //TODO: THIS
                return INT;
            //var_access
            case ID:
                return getSymbol(expression).getType();
            case NUM:
                expression.setIntValue();
                return INT;
            case STRING:
                expression.setStringValue();
                return STRING;
            case FUNCALL:
                AmlTree funcDeclaration = functionMap.get(expression.getText());
                if (funcDeclaration == null) throw new AmlSemanticException(
                        "Function " + expression.getText() + " not declared", expression.getLine());
                checkArguments(funcDeclaration, expression);
                return funcDeclaration.getChild(0).getType();
            case BOOLEAN:
                expression.setBooleanValue();
                return BOOL;
        }
        //Unary operators
        if (expression.getChildCount() == 1) {
            int operatorType;
            switch (expression.getType()) {
                case NOT:
                    operatorType = BOOL;
                    break;
                case PLUS:
                    operatorType = INT;
                    break;
                case MINUS:
                    operatorType = INT;
                    break;
                default: throw new Error("This should never happen");
            }
            int returnType = checkExpression(expression.getChild(0));
            if (returnType != operatorType)
                throw new AmlSemanticException("Invalid type " + mapType(returnType) +
                        " applied to unary operator " + mapType(expression.getType()) +
                        ". Expected type: " + mapType(operatorType), expression.getLine());
            return operatorType;
        }
        //Binary operators
        else {
            int operatorType;
            int returnType;
            switch (expression.getType()) {
                case OR:
                case AND:
                    returnType = operatorType = BOOL;
                    break;
                case PLUS:
                case MINUS:
                case DOT:
                case DIV:
                case MOD:
                    returnType = operatorType = INT;
                    break;
                case GT:
                case LT:
                case EQUAL:
                case NOT_EQUAL:
                    operatorType = INT;
                    returnType = BOOL;
                    break;
                default: throw new Error("This should never happen");
            }
            int returnType1 = checkExpression(expression.getChild(0));
            int returnType2 = checkExpression(expression.getChild(1));
            if (returnType1 != operatorType || returnType2 != operatorType) {
                throw new AmlSemanticException("Invalid types: " + mapType(returnType1) + ", " + mapType(returnType2) +
                " applied to binary operator " + mapType(expression.getType()) +
                ". Expected type: " + mapType(operatorType), expression.getLine());
            }
            return returnType;
        }
    }

    private void checkArguments(AmlTree funcDeclaration, AmlTree funcCall) throws AmlSemanticException {
        int numParameters = funcDeclaration.getChild(1).getChildCount();
        int numArguments = funcCall.getChildCount();
        if (numParameters != numArguments)
            throw new AmlSemanticException("Argument size does not match with parameters in function " +
                    funcCall.getText() + " declaration. Expecting " +
                    numParameters + ", provided " + numArguments, funcCall.getLine());
        AmlTree parameters = funcDeclaration.getChild(1);
        for (int i = 0; i < numArguments; ++i) {
            AmlTree declaration = parameters.getChild(i);
            AmlTree argumentExpr = funcCall.getChild(i);
            int decType = declaration.getType();
            int exprType = getRType(argumentExpr);
            if (decType != exprType)
                throw new AmlSemanticException("Type error. Argument " + i + " does not match with declaration of function" +
                funcCall.getText() + ". Expecting " + mapType(decType) + ", provided " + mapType(exprType), funcCall.getLine());
        }
    }

    private void analyzeInstruction(AmlTree instruction) throws AmlSemanticException {
        if (analyzeCommonInstruction(instruction)) return;
        switch (instruction.getType()) {
            case IF: {
                int type = checkExpression(instruction.getChild(0));
                if (type != BOOL)
                    throw new AmlSemanticException("If condition must have boolean type, but "
                            + type + " was provided instead.", instruction.getLine());
                symbolTable.addFirst(new HashMap<>());
                analyzeListInstructions(instruction.getChild(1));
                symbolTable.removeFirst();
                for (int i = 2; i < instruction.getChildCount(); ++i) {
                    AmlTree child = instruction.getChild(i);
                    if (child.getType() == ELSEIF) {
                        type = checkExpression(child.getChild(0));
                        if (type != BOOL)
                            throw new AmlSemanticException("If condition must have boolean type, but "
                                    + type + " was provided instead.", child.getLine());
                        symbolTable.addFirst(new HashMap<>());
                        analyzeListInstructions(child.getChild(1));
                        symbolTable.removeFirst();
                    } else if (child.getType() == ELSE) {
                        symbolTable.addFirst(new HashMap<>());
                        analyzeListInstructions(child.getChild(0));
                        symbolTable.removeFirst();
                    } else throw new Error("This should never happen");
                }
                break;
            }
            case WHILE: {
                int type = checkExpression(instruction.getChild(0));
                if (type != BOOL)
                    throw new AmlSemanticException("While condition must have boolean type, but "
                            + type + " was provided instead.", instruction.getLine());
                symbolTable.addFirst(new HashMap<>());
                analyzeListInstructions(instruction.getChild(1));
                symbolTable.removeFirst();
                break;
            }
            case FOR:
                symbolTable.addFirst(new HashMap<>());
                AmlTree initial = instruction.getChild(0);
                switch (initial.getType()) {
                    case INT:
                    case BOOL:
                    case NOTE_TYPE:
                    case DRUMS_NOTE_TYPE:
                    case CHORD:
                    case STRING_TYPE:
                        for (AmlTree declaration : initial.getArrayChildren()) {
                            checkDeclaration(declaration, initial.getType());
                        }
                        break;
                    case LIST_ASSIG:
                        for (AmlTree assignation : initial.getArrayChildren()) {
                            analyzeCommonInstruction(assignation);
                        }
                        break;
                    default:
                        throw new Error("This should never happen");
                }
                AmlTree condition = instruction.getChild(1);
                int type = checkExpression(condition);
                if (type != BOOL)
                    throw new AmlSemanticException("For condition must have boolean type, but "
                            + mapType(type) + " was provided instead.", condition.getLine());
                AmlTree thirdChild = instruction.getChild(2);
                for (AmlTree assignation : thirdChild.getArrayChildren()) {
                    analyzeCommonInstruction(assignation);
                }
                analyzeListInstructions(instruction.getChild(3));
                symbolTable.removeFirst();
                break;
            case SONG:
                analyzeSong(instruction);
                break;
        }
    }

    private void analyzeMusicInstruction(AmlTree musicInstruction) throws AmlSemanticException {
        if (analyzeCommonInstruction(musicInstruction)) return;
        switch (musicInstruction.getType()) {
            case IF: {
                int type = checkExpression(musicInstruction.getChild(0));
                if (type != BOOL)
                    throw new AmlSemanticException("If condition must have boolean type, but "
                            + type + " was provided instead.", musicInstruction.getLine());
                symbolTable.addFirst(new HashMap<>());
                analyzeListMusicInstructions(musicInstruction.getChild(1));
                symbolTable.removeFirst();
                for (int i = 2; i < musicInstruction.getChildCount(); ++i) {
                    AmlTree child = musicInstruction.getChild(i);
                    if (child.getType() == ELSEIF) {
                        type = checkExpression(child.getChild(0));
                        if (type != BOOL)
                            throw new AmlSemanticException("If condition must have boolean type, but "
                                    + type + " was provided instead.", child.getLine());
                        symbolTable.addFirst(new HashMap<>());
                        analyzeListMusicInstructions(child.getChild(1));
                        symbolTable.removeFirst();
                    } else if (child.getType() == ELSE) {
                        symbolTable.addFirst(new HashMap<>());
                        analyzeListMusicInstructions(child.getChild(0));
                        symbolTable.removeFirst();
                    } else throw new Error("This should never happen");
                }
                break;
            }
            case WHILE: {
                int type = checkExpression(musicInstruction.getChild(0));
                if (type != BOOL)
                    throw new AmlSemanticException("While condition must have boolean type, but "
                            + type + " was provided instead.", musicInstruction.getLine());
                symbolTable.addFirst(new HashMap<>());
                analyzeListMusicInstructions(musicInstruction.getChild(1));
                symbolTable.removeFirst();
                break;
            }
            case FOR: {
                AmlTree initial = musicInstruction.getChild(0);
                switch (initial.getType()) {
                    case INT:
                    case BOOL:
                    case NOTE_TYPE:
                    case DRUMS_NOTE_TYPE:
                    case CHORD:
                    case STRING_TYPE:
                        for (AmlTree declaration : initial.getArrayChildren()) {
                            checkDeclaration(declaration, initial.getType());
                        }
                        break;
                    case LIST_ASSIG:
                        for (AmlTree assignation : initial.getArrayChildren()) {
                            analyzeCommonInstruction(assignation);
                        }
                        break;
                    default:
                        throw new Error("This should never happen");
                }
                AmlTree condition = musicInstruction.getChild(1);
                int type = checkExpression(condition);
                if (type != BOOL)
                    throw new AmlSemanticException("For condition must have boolean type, but "
                            + type + " was provided instead.", condition.getLine());
                AmlTree thirdChild = musicInstruction.getChild(2);
                for (AmlTree assignation : thirdChild.getArrayChildren()) {
                    analyzeCommonInstruction(assignation);
                }
                symbolTable.addFirst(new HashMap<>());
                analyzeListMusicInstructions(musicInstruction.getChild(3));
                symbolTable.removeFirst();
                break;
            }
            case NOTES:
                if (musicInstruction.getChild(0).getType() == NOTE_LIST) {
                    if (musicInstruction.getChildCount() > 1 && musicInstruction.getChild(1).getType() == FIGURE) {
                        musicInstruction.getChild(1).setFigureValue();
                    }
                    for (AmlTree note : musicInstruction.getChild(0).getArrayChildren()) {
                        note.setNoteValue();
                        if (note.getChildCount() > 0 && note.getChild(0).getType() == NUM) note.getChild(0).setIntValue();
                        else if (note.getChildCount() > 1 && note.getChild(1).getType() == NUM) note.getChild(1).setIntValue();
                    }
                }
                break;
            case DRUMSNOTES: {
                for (AmlTree drumNote : musicInstruction.getChild(0).getArrayChildren()) {
                    if (musicInstruction.getChildCount() > 1 && musicInstruction.getChild(1).getType() == FIGURE) {
                        musicInstruction.getChild(1).setFigureValue();
                    }
                    int type = checkExpression(drumNote);
                    if (type != INT)
                        throw new AmlSemanticException("Type error, drum note expressions mus be int type, " +
                        " but " + mapType(type) + " was provided instead.", musicInstruction.getLine());
                }
                break;
            }
        }
    }

    private void analyzeSong(AmlTree song) throws AmlSemanticException {
        int i = 0;
        AmlTree songChild = song.getChild(i++);
        while (songChild.getType() != TRACK) {
            if (songChild.getType() == ID) insertId(songChild, SONG);
            else if (!analyzeCommonInstruction(songChild)) throw new Error("This should never happen");
            songChild = song.getChild(i++);
        }
        for(i = i-1; i < song.getChildCount(); ++i) {
            analyzeTrack(song.getChild(i));
        }
    }

    private void analyzeTrack(AmlTree track) throws AmlSemanticException {
        AmlTree compasList;
        if (track.getChildCount() > 1) {
            track.getChild(0).setInstrumentValue();
            compasList = track.getChild(1);
        }
        else compasList = track.getChild(0);
        analyzeCompasList(compasList);
    }

    private void analyzeCompasList(AmlTree compasList) throws AmlSemanticException {
        for(AmlTree child : compasList.getArrayChildren()) {
            switch (child.getType()) {
                case MusicLexer.COMPAS:
                    analyzeCompas(child);
                    break;
                case MusicLexer.REPETITION:
                    int i = 0;
                    if (child.getChild(0).getType() == MusicLexer.NUM) {
                        child.getChild(0).setIntValue();
                        ++i;
                    }
                    for(; i < child.getChildCount(); ++i) {
                        analyzeCompas(child.getChild(i));
                    }
                    break;
            }
        }
    }

    private void analyzeCompas(AmlTree compas) throws AmlSemanticException {
        for (AmlTree musicInst : compas.getArrayChildren()) {
            analyzeMusicInstruction(musicInst);
        }
    }

    private void analyzeInitialScope(AmlTree tree) throws AmlSemanticException {
        for (AmlTree globalStatement : tree.getArrayChildren()) {
            switch (globalStatement.getType()) {
                case FUNCTION: {
                    String functionName = globalStatement.getText();
                    AmlTree previousValue = functionMap.put(functionName, globalStatement);
                    if (previousValue != null) {
                        throw new AmlSemanticException("The function " + functionName + " has already been declared.", globalStatement.getLine());
                    }
                    AmlTree arguments = globalStatement.getChild(1);
                    index = 0;
                    if (arguments.getChildren() != null) {
                        for (AmlTree child : arguments.getArrayChildren()) {
                            insertId(child.getChild(0), child.getType());
                        }
                    }
                    symbolTable.addFirst(new HashMap<>());
                    analyzeListInstructions(globalStatement.getChild(2));
                    symbolTable.removeFirst();
                    globalStatement.setNumVariables(index);
                    break;
                }
                case FRAGMENT: {
                    String fragmentName = globalStatement.getText();
                    AmlTree previousValue = fragmentMap.put(fragmentName, globalStatement);
                    if (previousValue != null) {
                        throw new AmlSemanticException("The fragment " + fragmentName + " has already been declared.", globalStatement.getLine());
                    }
                    AmlTree arguments = globalStatement.getChild(0);
                    if (arguments.getChildren() != null) {
                        for (AmlTree child : arguments.getArrayChildren()) {
                            insertId(child.getChild(0), child.getType());
                        }
                    }
                    symbolTable.addFirst(new HashMap<>());
                    analyzeListMusicInstructions(globalStatement.getChild(1));
                    symbolTable.removeFirst();
                    break;
                }
                case SONG: {
                    AmlTree firstChild = globalStatement.getChild(0);
                    if (firstChild.getType() != ID)
                        throw new AmlSemanticException("Global song must have a name", globalStatement.getLine());
                    AmlTree previousValue = songMap.put(firstChild.getText(), globalStatement);
                    if (previousValue != null)
                        throw new AmlSemanticException("The global song " + firstChild.getText() + " has already been declared.", globalStatement.getLine());
                    symbolTable.add(new HashMap<>());
                    analyzeSong(globalStatement);
                    symbolTable.removeFirst();
                    break;
                }
                default:
                    throw new Error("This shouls never happen");
            }
        }
    }

    private void insertId(AmlTree tree, int type) throws AmlSemanticException {
        assert tree.getType() == ID;
        String id = tree.getText();
        SymbolInfo previousValue = symbolTable.getFirst().put(id, new SymbolInfo(tree.getLine(), type, index++));
        if (previousValue != null) {
            throw new AmlSemanticException("Variable " + id + " already declared in line " + previousValue.getLine(), tree.getLine());
        }
        tree.setIndex(index-1);
    }
}