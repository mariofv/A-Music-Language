package interpreter;

import data.Chord;
import data.DrumNote;
import data.Figure;
import data.Note;
import exceptions.AmlException;
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
    private int index, numVars;
    private AmlTree currentFunction;

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
            case STRING_TYPE:
                return "string";
            case FIGURE_TYPE:
                return "figure";
            case DOT:
                return "*";
            default:
                return "unknown " + type;
        }
    }

    public SemanticAnalyzer(Interpreter interpreter) {
        functionMap = interpreter.functionMap;
        fragmentMap = interpreter.fragmentMap;
        songMap = interpreter.songMap;
        symbolTable = new LinkedList<>();
    }

    public void analyze(AmlTree tree) throws AmlSemanticException {
        symbolTable.addFirst(new HashMap<String, SymbolInfo>());
        symbolTable.getFirst().put("Time", new SymbolInfo(-1, INT, -1));
        analyzeInitialScope(tree);
        symbolTable.removeFirst();
    }

    private int pushScope() {
        symbolTable.addFirst(new HashMap<String, SymbolInfo>());
        return index;
    }

    private void popSoce(int index) {
        symbolTable.removeFirst();
        this.index = index;
    }

    private void analyzeInitialScope(AmlTree tree) throws AmlSemanticException {
        for (AmlTree globalStatement : tree.getArrayChildren()) {
            index = 0;
            numVars = 0;
            switch (globalStatement.getType()) {
                case FUNCTION: {
                    String functionName = globalStatement.getText();
                    AmlTree previousValue = functionMap.put(functionName, globalStatement);
                    if (previousValue != null) {
                        throw new AmlSemanticException("The function " + functionName + " has already been declared.", globalStatement.getLine());
                    }
                    AmlTree arguments = globalStatement.getChild(1);
                    if (arguments.getChildren() != null) {
                        for (AmlTree child : arguments.getArrayChildren()) {
                            insertId(child.getChild(0), child.getType());
                        }
                    }
                    int lastIndex = pushScope();
                    currentFunction = globalStatement;
                    analyzeListInstructions(globalStatement.getChild(2));
                    popSoce(lastIndex);
                    globalStatement.setNumVariables(numVars);
                    break;
                }
                case FRAGMENT: {
                    String fragmentName = globalStatement.getChild(0).getText();
                    AmlTree previousValue = fragmentMap.put(fragmentName, globalStatement);
                    if (previousValue != null) {
                        throw new AmlSemanticException("The fragment " + fragmentName + " has already been declared.", globalStatement.getLine());
                    }
                    AmlTree arguments = globalStatement.getChild(1);
                    if (arguments.getChildren() != null) {
                        for (AmlTree child : arguments.getArrayChildren()) {
                            insertId(child.getChild(0), child.getType());
                        }
                    }
                    int lastIndex = pushScope();
                    analyzeListMusicInstructions(globalStatement.getChild(2));
                    popSoce(lastIndex);
                    globalStatement.setNumVariables(numVars);
                    break;
                }
                case SONG: {
                    AmlTree firstChild = globalStatement.getChild(0);
                    if (firstChild.getType() != ID)
                        throw new AmlSemanticException("Global song must have a name", globalStatement.getLine());
                    AmlTree previousValue = songMap.put(firstChild.getText(), globalStatement);
                    if (previousValue != null)
                        throw new AmlSemanticException("The global song " + firstChild.getText() + " has already been declared.", globalStatement.getLine());
                    int lastIndex = pushScope();
                    analyzeSong(globalStatement);
                    popSoce(lastIndex);
                    break;
                }
                default:
                    throw new Error("This should never happen");
            }
        }
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
                return checkExpression(tree);
            default:
                throw new Error("This should never happen");
        }
    }

    private int checkVarFuncall(int type, AmlTree funcall) throws AmlSemanticException {
        LinkedList<Integer> parameters = null;
        int returnType = -1;
        switch (type) {
            case NOTE_TYPE:
                switch (funcall.getChild(0).getText()) {
                    case Note.isSilence:
                    case Note.isBemol:
                    case Note.isNatural:
                    case Note.isSustain:
                    case Note.isArmor:
                        parameters = new LinkedList<>();
                        returnType = BOOL;
                        break;
                    case Note.randomize:
                    case Note.makeSilence:
                        parameters = new LinkedList<>();
                        returnType = VOID;
                        break;
                }
                break;
            case FIGURE_TYPE:
                switch (funcall.getChild(0).getText()) {
                    case Figure.isTied:
                    case Figure.tie:
                    case Figure.untie:
                        parameters = new LinkedList<>();
                        returnType = BOOL;
                        break;
                }
                break;
            case CHORD:
                switch (funcall.getChild(0).getText()) {
                    case Chord.isTied:
                        parameters = new LinkedList<>();
                        returnType = BOOL;
                        break;
                    case Chord.setAccident:
                    case Chord.alterInterval:
                    case Chord.alterQuality:
                        parameters = new LinkedList<>();
                        parameters.add(STRING_TYPE);
                        returnType = VOID;
                        break;
                    case Chord.setOctave:
                        parameters = new LinkedList<>();
                        parameters.add(INT);
                        returnType = VOID;
                        break;
                    case Chord.setRoot:
                        parameters = new LinkedList<>();
                        parameters.add(NOTE_TYPE);
                        returnType = VOID;
                        break;
                    case Chord.tie:
                    case Chord.untie:
                        parameters = new LinkedList<>();
                        returnType = VOID;
                        break;
                }
            case DRUMS_NOTE_TYPE:
                switch (funcall.getChild(0).getText()) {
                    case DrumNote.makeSilence:
                    case DrumNote.bom:
                    case DrumNote.bum:
                    case DrumNote.cling:
                    case DrumNote.pam:
                    case DrumNote.randomize:
                    case DrumNote.tsss:
                        parameters = new LinkedList<>();
                        returnType = VOID;
                        break;
                }
        }
        if (parameters == null)
            throw new AmlSemanticException("Type " + mapType(type) + " does not have method called " + funcall.getChild(0).getText(), funcall.getLine());
        if (parameters.size() != funcall.getChildCount() - 1)
            throw new AmlSemanticException("Argument size does not match with parameters in function " +
                    funcall.getChild(0).getText() + ". Expecting " +
                    (funcall.getChildCount() - 1) + ", provided " + (funcall.getChildCount() - 1), funcall.getLine());
        int i = 1;
        for (int parameterType : parameters) {
            int argumentType = checkExpression(funcall.getChild(i));
            if (parameterType != argumentType)
                throw new AmlSemanticException("Type error. Argument " + (i-1) + " does not match with declaration of function" +
                        funcall.getChild(0).getText() + ". Expecting " + mapType(parameterType) + ", provided " + mapType(argumentType), funcall.getLine());
            ++i;
        }
        return returnType;
    }

    private boolean analyzeCommonInstruction(AmlTree commonInstruction) throws AmlSemanticException {
        //TODO: var_funcall
        switch (commonInstruction.getType()) {
            case VAR_FUNCALL: {
                int type = getSymbol(commonInstruction).getType();
                checkVarFuncall(type, commonInstruction);
                return true;
            }
            case RETURN: {
                int type = VOID;
                if (commonInstruction.getChildCount() > 0) {
                    type = checkExpression(commonInstruction.getChild(0));
                }
                if (type != currentFunction.getChild(0).getType()) throw new AmlSemanticException(
                        "Return type does not match with the function declaration, found " + mapType(type) + " but "
                        + mapType(currentFunction.getChild(0).getType()) + " expected", commonInstruction.getLine()
                );
                return true;
            }
            case READ: {
                int type = getSymbol(commonInstruction.getChild(0)).getType();
                if (type != INT && type != STRING_TYPE && type != BOOL) {
                    throw new AmlSemanticException("Read instruction can only read integers, strings and booleans, but " + mapType(type) + " was provided", commonInstruction.getLine());
                }
                return true;
            }
            case WRITE:
                checkExpression(commonInstruction.getChild(0));
                return true;
            //Declaration
            case INT:
            case BOOL:
            case NOTE_TYPE:
            case DRUMS_NOTE_TYPE:
            case CHORD:
            case STRING_TYPE:
            case FIGURE_TYPE:
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
                else if (commonInstruction.getType() != ASSIG && lType != INT) {
                    throw new AmlSemanticException("Type error, operation " + mapType(commonInstruction.getType()) +
                            " can only be applied with integer type, but found " + mapType(lType) + ", " + mapType(rType)
                            , commonInstruction.getLine());
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
                return true;
            case INSTRUMENT:
                commonInstruction.getChild(0).setInstrumentValue();
                return true;
            case VOLUME:
                int volumeType = checkExpression(commonInstruction.getChild(0));
                if (volumeType != INT)
                    throw new AmlSemanticException("Type error, volume argument must be int type, but " +
                            mapType(volumeType) + " was provided.", commonInstruction.getLine());
                return true;
            case FUNCALL:
            case FRAGCALL:
                AmlTree funcDeclaration = commonInstruction.getType() == FUNCALL ? functionMap.get(commonInstruction.getText()) : fragmentMap.get(commonInstruction.getText());
                if (funcDeclaration == null) throw new AmlSemanticException(
                        (commonInstruction.getType() == FUNCALL ? "Function " : "Fragment ") + commonInstruction.getText() + " not declared.", commonInstruction.getLine());
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
            case DRUM_FIGURE:
                analyzeNote(child);
                return DRUMS_NOTE_TYPE;
            case FIGURE:
                analyzeNote(child);
                switch (child.getChild(0).getType()) {
                    case CHORD:
                        return CHORD;
                    case NOTES:
                        return FIGURE_TYPE;
                    default: throw new Error("This should never happen");
                }
            case FIGURE_NAME:
                child.setFigureValue();
                return INT;
            default:
                return checkExpression(child);
        }
    }

    private SymbolInfo getSymbol(AmlTree tree) throws AmlSemanticException {
        assert tree.getType() == ID || tree.getType() == ATTR_ACCESS || tree.getType() == VAR_FUNCALL;
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

    private static int attrType(int type, String attr) {
        switch (type) {
            case FIGURE:
                switch (attr) {
                    case "duration":
                        return INT;
                }
            case NOTE_TYPE:
                switch (attr) {
                    case "pitch":
                        return INT;
                    case "octave":
                        return INT;
                    case "accident":
                        return INT;
                }
            case DRUMS_NOTE_TYPE:
                switch (attr) {
                    case "pitch":
                        return INT;
                }
            case CHORD:
                switch (attr) {
                    case "duration":
                        return INT;
                }
        }
        return -1;
    }

    private int checkExpression(AmlTree expression) throws AmlSemanticException {
        //Atoms
        switch (expression.getType()) {
            case VAR_FUNCALL: {
                int type = getSymbol(expression).getType();
                return checkVarFuncall(type, expression);
            }
            //var_access
            case ATTR_ACCESS:
                int type = getSymbol(expression).getType();
                int attrType = attrType(type, expression.getChild(1).getText());
                if (attrType == -1)
                    throw new AmlSemanticException("Variable " + expression.getText() + " of type " + mapType(type) +
                            " does not have attribute " + expression.getChild(1).getText(), expression.getLine());
                return attrType;
            //var_access
            case ID:
                return getSymbol(expression).getType();
            case NUM:
                expression.setIntValue();
                return INT;
            case STRING:
                expression.setStringValue();
                return STRING_TYPE;
            case FUNCALL:
                AmlTree funcDeclaration = functionMap.get(expression.getText());
                if (funcDeclaration == null) throw new AmlSemanticException(
                        "Function " + expression.getText() + " not declared", expression.getLine());
                checkArguments(funcDeclaration, expression);
                return funcDeclaration.getChild(0).getType();
            case TRUE:
            case FALSE:
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
            LinkedList<int[]> compatiblePairs = new LinkedList<>();
            switch (expression.getType()) {
                case OR:
                case AND:
                    compatiblePairs.add(new int[]{BOOL, BOOL, BOOL});
                    break;
                case PLUS:
                    compatiblePairs.add(new int[]{STRING_TYPE,STRING_TYPE,STRING_TYPE});
                    compatiblePairs.add(new int[]{INT,BOOL,INT});
                    compatiblePairs.add(new int[]{BOOL,INT,INT});
                    compatiblePairs.add(new int[]{INT,INT,INT});
                    compatiblePairs.add(new int[]{BOOL,BOOL,INT});
                    break;
                case MINUS:
                case DOT:
                case DIV:
                case MOD:
                    compatiblePairs.add(new int[]{INT,BOOL,INT});
                    compatiblePairs.add(new int[]{BOOL,INT,INT});
                    compatiblePairs.add(new int[]{INT,INT,INT});
                    compatiblePairs.add(new int[]{BOOL,BOOL,INT});
                    break;
                case GT:
                case LT:
                case GE:
                case LE:
                    compatiblePairs.add(new int[]{STRING_TYPE,STRING_TYPE,STRING_TYPE});
                    compatiblePairs.add(new int[]{INT,INT,INT});
                    break;
                case EQUAL:
                case NOT_EQUAL:
                    compatiblePairs.add(new int[]{INT,INT,INT});
                    compatiblePairs.add(new int[]{STRING_TYPE,STRING_TYPE,STRING_TYPE});
                    compatiblePairs.add(new int[]{BOOL,BOOL,INT});
                    break;
                default: throw new Error("This should never happen " + mapType(expression.getType()));
            }
            int returnTypeLeft = checkExpression(expression.getChild(0));
            int returnTypeRight = checkExpression(expression.getChild(1));
            boolean found = false;
            int returnType = -1;
            for(int[] pair : compatiblePairs) {
                if (returnTypeLeft == pair[0] && returnTypeRight == pair[1]) {
                    found = true;
                    returnType = pair[2];
                    break;
                }
            }
            if (!found) {
                throw new AmlSemanticException("Invalid types: " + mapType(returnTypeLeft) + ", " + mapType(returnTypeRight) +
                " applied to binary operator " + mapType(expression.getType()), expression.getLine());
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
                throw new AmlSemanticException("Type error. Argument " + i + " does not match with declaration of function " +
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
                            + mapType(type) + " was provided instead.", instruction.getLine());
                int lastIndex = pushScope();
                analyzeListInstructions(instruction.getChild(1));
                popSoce(lastIndex);
                for (int i = 2; i < instruction.getChildCount(); ++i) {
                    AmlTree child = instruction.getChild(i);
                    if (child.getType() == ELSEIF) {
                        type = checkExpression(child.getChild(0));
                        if (type != BOOL)
                            throw new AmlSemanticException("If condition must have boolean type, but "
                                    + mapType(type) + " was provided instead.", child.getLine());
                        lastIndex = pushScope();
                        analyzeListInstructions(child.getChild(1));
                        popSoce(lastIndex);
                    } else if (child.getType() == ELSE) {
                        lastIndex = pushScope();
                        analyzeListInstructions(child.getChild(0));
                        popSoce(lastIndex);
                    } else throw new Error("This should never happen");
                }
                break;
            }
            case WHILE: {
                int type = checkExpression(instruction.getChild(0));
                if (type != BOOL)
                    throw new AmlSemanticException("While condition must have boolean type, but "
                            + type + " was provided instead.", instruction.getLine());
                int lastIndex = pushScope();
                analyzeListInstructions(instruction.getChild(1));
                popSoce(lastIndex);
                break;
            }
            case FOR:
                int lastIndex = pushScope();
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
                popSoce(lastIndex);
                break;
            case SONG:
                analyzeSong(instruction);
                break;
            case COMPAS_LIST:
                lastIndex = pushScope();
                analyzeCompasList(instruction);
                popSoce(lastIndex);
                break;
        }
    }

    private void analyzeNote(AmlTree notes) throws AmlSemanticException {
        switch (notes.getType()) {
            case FIGURE:
                if (notes.getChildCount() > 1 && notes.getChild(1).getType() == FIGURE_NAME) {
                    notes.getChild(1).setFigureValue();
                }
                if (notes.getChild(0).getType() == NOTES) {
                    for (AmlTree note : notes.getChild(0).getArrayChildren()) {
                        note.setNoteValue();
                        if (note.getChildCount() > 0 && note.getChild(0).getType() == NEG_NUM) note.getChild(0).setIntValue();
                        else if (note.getChildCount() > 1 && note.getChild(1).getType() == NEG_NUM) note.getChild(1).setIntValue();
                    }
                }
                else {
                    AmlTree note = notes.getChild(0).getChild(0);
                    note.setNoteValue();
                    if (note.getChildCount() > 0 && note.getChild(0).getType() == NEG_NUM) note.getChild(0).setIntValue();
                    else if (note.getChildCount() > 1 && note.getChild(1).getType() == NEG_NUM) note.getChild(1).setIntValue();
                }
                break;
            case DRUM_FIGURE:
                if (notes.getChildCount() > 1 && notes.getChild(1).getType() == FIGURE_NAME) {
                    notes.getChild(1).setFigureValue();
                }
                for (AmlTree drumNote : notes.getChild(0).getArrayChildren()) {
                    int type = checkExpression(drumNote.getChild(0));
                    if (type != INT)
                        throw new AmlSemanticException("Type error, drum note expressions mus be int type, " +
                                " but " + mapType(type) + " was provided instead.", notes.getLine());
                }
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
                            + mapType(type) + " was provided instead.", musicInstruction.getLine());
                int lastIndex = pushScope();
                analyzeListMusicInstructions(musicInstruction.getChild(1));
                popSoce(lastIndex);
                for (int i = 2; i < musicInstruction.getChildCount(); ++i) {
                    AmlTree child = musicInstruction.getChild(i);
                    if (child.getType() == ELSEIF) {
                        type = checkExpression(child.getChild(0));
                        if (type != BOOL)
                            throw new AmlSemanticException("If condition must have boolean type, but "
                                    + mapType(type) + " was provided instead.", child.getLine());
                        lastIndex = pushScope();
                        analyzeListMusicInstructions(child.getChild(1));
                        popSoce(lastIndex);
                    } else if (child.getType() == ELSE) {
                        lastIndex = pushScope();
                        analyzeListMusicInstructions(child.getChild(0));
                        popSoce(lastIndex);
                    } else throw new Error("This should never happen");
                }
                break;
            }
            case WHILE: {
                int type = checkExpression(musicInstruction.getChild(0));
                if (type != BOOL)
                    throw new AmlSemanticException("While condition must have boolean type, but "
                            + type + " was provided instead.", musicInstruction.getLine());
                int lastIndex = pushScope();
                analyzeListMusicInstructions(musicInstruction.getChild(1));
                popSoce(lastIndex);
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
                int lastIndex = pushScope();
                analyzeListMusicInstructions(musicInstruction.getChild(3));
                popSoce(lastIndex);
                break;
            }
            case FIGURE:
            case DRUM_FIGURE:
                analyzeNote(musicInstruction);
                break;
            case TRIPLET:
                break;
            case ID:
                int type = getSymbol(musicInstruction).getType();
                if (type != FIGURE_TYPE && type != CHORD)
                    throw new AmlSemanticException("Variable " + musicInstruction.getText() + " must be a note, but it has type: " + mapType(type), musicInstruction.getLine());
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

        int lastIndex = pushScope();
        analyzeCompasList(compasList);
        popSoce(lastIndex);
    }

    private void analyzeCompasList(AmlTree compasList) throws AmlSemanticException {
        for(AmlTree child : compasList.getArrayChildren()) {
            switch (child.getType()) {
                case MusicLexer.COMPAS:
                    analyzeCompas(child);
                    break;
                case MusicLexer.REPETITION:
                    int i = 0;
                    if (child.getChild(0).getType() == POS_NUM) {
                        child.getChild(0).setIntValue();
                        if (child.getChild(0).getIntValue() < 0)
                            throw new AmlSemanticException("The number of iterations of a repetition mus be positive", child.getChild(0).getLine());
                        ++i;
                    }
                    analyzeCompasList(child.getChild(i));
                    break;
            }
        }
    }

    private void analyzeCompas(AmlTree compas) throws AmlSemanticException {
        for (AmlTree musicInst : compas.getArrayChildren()) {
            analyzeMusicInstruction(musicInst);
        }
    }

    private void insertId(AmlTree tree, int type) throws AmlSemanticException {
        assert tree.getType() == ID;
        String id = tree.getText();
        SymbolInfo previousValue = symbolTable.getFirst().put(id, new SymbolInfo(tree.getLine(), type, index));
        if (previousValue != null) {
            throw new AmlSemanticException("Variable " + id + " already declared in line " + previousValue.getLine(), tree.getLine());
        }
        tree.setIndex(index);
        ++index;
        ++numVars;
    }
}