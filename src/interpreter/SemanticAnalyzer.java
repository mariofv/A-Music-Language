package interpreter;

import com.sun.org.apache.xerces.internal.util.SymbolTable;
import exceptions.AmlException;
import exceptions.AmlSemanticException;
import parser.MusicLexer;
import sun.awt.Symbol;

import java.util.*;

import static parser.MusicParser.*;

public class SemanticAnalyzer {

    private class SymbolInfo {
        private int line;
        private int type;

        public SymbolInfo(int line, int type) {
            this.line = line;
            this.type = type;
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

    public static String mapType(int type) {
        switch (type) {
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
        }
        return "unknown";
    }

    public SemanticAnalyzer(Interpreter interpreter) {
        functionMap = interpreter.functionMap;
        fragmentMap = interpreter.fragmentMap;
        songMap = interpreter.songMap;
        symbolTable = new LinkedList<>();
    }

    public void analyze(AmlTree tree) throws AmlSemanticException {
        analyze(tree, 0);
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
            analyzeMusicInstrucion(musicInstruction);
        }
    }

    private boolean analyzeCommonInstructions(AmlTree commonInstruction) throws AmlSemanticException {
        switch (commonInstruction.getType()) {
            case INT:
            case BOOL:
            case NOTE_TYPE:
            case DRUMS_NOTE_TYPE:
            case CHORD:
            case STRING_TYPE:
                for (AmlTree declaration : commonInstruction.getArrayChildren()) {
                    checkDeclaration(declaration, commonInstruction.getType());
                }
                break;
        }
        return false;
    }

    private void checkDeclaration(AmlTree declaration, int type) throws AmlSemanticException {
        switch (declaration.getType()) {
            case ID:
                insertId(declaration, type);
                break;
            case ASSIG:
                checkTypes(type, declaration.getChild(1));
                insertId(declaration.getChild(0), type);
                break;
            default: throw new Error("This should never happen");
        }
    }

    private void checkTypes(int type, AmlTree child) throws AmlSemanticException {
        int returnType;
        switch (child.getType()) {
            case DRUMSNOTES:
                returnType = DRUMS_NOTE_TYPE;
                break;
            case NOTES:
                switch (child.getChild(0).getType()) {
                    case CHORD:
                        returnType = CHORD;
                        break;
                    case NOTE_LIST:
                        returnType = NOTE_TYPE;
                        break;
                    default: throw new Error("This should never happen");
                }
                break;
            default:
                returnType = checkExpression(child);
        }
        if (type != returnType) throw new AmlSemanticException(
                "Type error: " + mapType(type) + ", " + mapType(returnType), child.getLine());
    }

    private SymbolInfo getSymbol(AmlTree tree) throws AmlSemanticException {
        assert tree.getType() == ID;
        String id = tree.getText();
        for (HashMap<String, SymbolInfo> scope : symbolTable) {
            SymbolInfo data = scope.get(id);
            if (data != null) return data;
        }
        throw new AmlSemanticException("Variable " + id + " not declared", tree.getLine());
    }

    private int checkExpression(AmlTree expression) throws AmlSemanticException {
        //Atoms
        switch (expression.getType()) {
            //var_access
            case ATTR_ACCESS:
                break;
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
                break;
            case BOOLEAN:
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
            if (returnType != operatorType) {
                throw new AmlSemanticException("Invalid type " + mapType(returnType) +
                        " applied to unary operator " + mapType(expression.getType()) +
                        ". Expected type: " + mapType(operatorType), expression.getLine());
            }
            return operatorType;
        }
        //Binary operators
        else {
            int operatorType;
            switch (expression.getType()) {
                case OR:
                case AND:
                    operatorType = BOOL;
                    break;
                case GT:
                case LT:
                case EQUAL:
                    operatorType = INT;
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
            return operatorType;
        }
    }

    private void analyzeInstruction(AmlTree instruction) throws AmlSemanticException {
        if (analyzeCommonInstructions(instruction)) return;
        switch (instruction.getType()) {
        }
    }

    private void analyzeMusicInstrucion(AmlTree musicInstruction) throws AmlSemanticException {
        if (analyzeCommonInstructions(musicInstruction)) return;
    }

    private void analyzeSong(AmlTree tree) {

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
                    if (arguments.getChildren() != null) {
                        for (AmlTree child : arguments.getArrayChildren()) {
                            insertId(child.getChild(0), child.getType());
                        }
                    }
                    symbolTable.addFirst(new HashMap<>());
                    analyzeListInstructions(globalStatement.getChild(2));
                    symbolTable.removeFirst();
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
                    if (firstChild.getType() != MusicLexer.ID)
                        throw new AmlSemanticException("Global song must have a name", globalStatement.getLine());
                    AmlTree previousValue = songMap.put(firstChild.getText(), globalStatement);
                    if (previousValue != null)
                        throw new AmlSemanticException("The global song " + firstChild.getText() + " has already been declared.", globalStatement.getLine());
                    analyzeSong(globalStatement);
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
        SymbolInfo previousValue = symbolTable.getFirst().put(id, new SymbolInfo(tree.getLine(),type));
        if (previousValue != null) {
            throw new AmlSemanticException("Variable " + id + " already declared in line " + previousValue.getLine(), tree.getLine());
        }
    }

    public boolean analyzeDeclaration(AmlTree tree) throws AmlSemanticException {
        switch (tree.getType()) {
            case MusicLexer.INT:
            case MusicLexer.BOOL:
            case MusicLexer.NOTE_TYPE:
            case MusicLexer.DRUMS_NOTE_TYPE:
            case MusicLexer.CHORD:
            case MusicLexer.STRING_TYPE:
                break;
            default:
                return false;
        }
        for (AmlTree child : (ArrayList<AmlTree>) tree.getChildren()) {
            switch (child.getType()) {
                case MusicLexer.ASSIG:
                    //TODO: check types
                    switch (child.getChild(1).getType()) {
                        case MusicLexer.DRUMSNOTES:
                            if (tree.getType() != MusicLexer.DRUMSNOTES) throw new AmlSemanticException("Incompatible types", tree.getLine());
                            break;
                        case MusicLexer.NOTES:
                            if (tree.getType() != MusicLexer.NOTES) throw new AmlSemanticException("Incompatible types", tree.getLine());
                            break;
                        default: //Expression

                    }
                    insertId(child.getChild(0), tree.getType());
                    break;
                case MusicLexer.ID:
                    insertId(child, tree.getType());
                    break;
            }
        }
        return true;
    }

    private void analyze(AmlTree tree, int depth) throws AmlSemanticException {
        //boolean newScope = false;
        //boolean analyzeChilds = true;
        switch (tree.getType()) {
            case MusicLexer.FIGURE:
                tree.setFigureValue();
                break;
            case MusicLexer.NOTE:
                tree.setNoteValue();
                break;
            case MusicLexer.NUM:
                tree.setIntValue();
                break;
            /*case MusicLexer.FUNCTION:
            {
                newScope = true;
                String functionName = tree.getText();
                AmlTree previousValue = functionMap.put(functionName, tree);
                if (previousValue != null) {
                    throw new AmlSemanticException("The function " + functionName + " has already been declared.", tree.getLine());
                }
                AmlTree arguments = tree.getChild(1);
                if (arguments.getChildren() != null) {
                    for (AmlTree child : (ArrayList<AmlTree>) arguments.getChildren()) {
                        insertId(child.getChild(0), child.getType());
                    }
                }
                break;
            }
            case MusicLexer.FRAGMENT: {
                newScope = true;
                String fragmentName = tree.getText();
                AmlTree previousValue = fragmentMap.put(fragmentName, tree);
                if (previousValue != null) {
                    throw new AmlSemanticException("The fragment " + fragmentName + " has already been declared.", tree.getLine());
                }
                AmlTree arguments = tree.getChild(1);
                if (arguments.getChildren() != null) {
                    for (AmlTree child : (ArrayList<AmlTree>) arguments.getChildren()) {
                        insertId(child.getChild(0), child.getType());
                    }
                }
                break;
            }
            case MusicLexer.SONG:
                if (depth == 0) {
                    AmlTree firstChild = tree.getChild(0);
                    if (firstChild.getType() != MusicLexer.ID) throw new AmlSemanticException("Global song must have a name", tree.getLine());
                    AmlTree previousValue = songMap.put(firstChild.getText(), tree);
                    if (previousValue != null) throw new AmlSemanticException("The global song " + firstChild.getText() + " has already been declared.", tree.getLine());
                }
                break;
            default:
                analyzeChilds = !analyzeDeclaration(tree);*/
        }

        if (tree.getChildren() == null /*|| !analyzeChilds*/) return;
        //if (newScope) symbolTable.addFirst(new HashMap<>());
        for (AmlTree child : tree.getArrayChildren()) {
            analyze(child, depth+1);
        }
        //if (newScope) symbolTable.removeFirst();
    }
}