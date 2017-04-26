package interpreter;

import exceptions.AmlSemanticException;
import parser.MusicLexer;

import java.util.*;

public class SemanticAnalyzer {

    private HashMap<String, AmlTree> functionMap;
    private HashMap<String, AmlTree> fragmentMap;
    private HashMap<String, AmlTree> songMap;

    private Interpreter interpreter;

    public SemanticAnalyzer(Interpreter interpreter) {
        functionMap = interpreter.functionMap;
        fragmentMap = interpreter.fragmentMap;
        songMap = interpreter.songMap;
    }

    public boolean analyzeDeclaration(AmlTree tree, LinkedList<HashMap<String, Integer>> scope) throws AmlSemanticException {
        switch (tree.getType()) {
            case MusicLexer.INT:
                break;
            case MusicLexer.BOOL:
                break;
            case MusicLexer.NOTE_TYPE:
                break;
            case MusicLexer.DRUMS_NOTE_TYPE:
                break;
            case MusicLexer.CHORD:
                break;
            case MusicLexer.STRING_TYPE:
                break;
            default:
                return false;
        }
        for (AmlTree child : (ArrayList<AmlTree>) tree.getChildren()) {
            switch (child.getType()) {
                case MusicLexer.ASSIG:
                    break;
                case MusicLexer.ID:
                    String id = child.getText();
                    for (HashMap scopeLevel : scope) {
                        if (scopeLevel.containsKey(id)) {
                            throw new AmlSemanticException("Variable " + id + " already declared in line " + scopeLevel.get(id), tree.getLine());
                        }
                    }
                    scope.getFirst().put(id, tree.getLine());
                    break;
            }
        }
        return true;
    }

    public void analyze(AmlTree tree, LinkedList<HashMap<String, Integer>> scope, int depth) throws AmlSemanticException {
        boolean newScope = false;
        boolean analyzeChilds = true;
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
            case MusicLexer.FUNCTION:
            {
                newScope = true;
                String functionName = tree.getText();
                AmlTree previousValue = functionMap.put(functionName, tree);
                if (previousValue != null) {
                    throw new AmlSemanticException("The function " + functionName + " has already been declared.", tree.getLine());
                }
                break;
            }
            case MusicLexer.FRAGMENT: {
                newScope = true;
                String fragmentName = tree.getText();
                AmlTree previousValue = functionMap.put(fragmentName, tree);
                if (previousValue != null) {
                    throw new AmlSemanticException("The fragment " + fragmentName + " has already been declared.", tree.getLine());
                }
                break;
            }
            case MusicLexer.SONG:
                if (depth == 0) {
                    //AmlTree firstChild =
                }
                break;
            default:
                analyzeChilds = !analyzeDeclaration(tree, scope);
        }

        if (tree.getChildren() == null || !analyzeChilds) return;
        if (newScope) scope.addFirst(new HashMap<>());
        for (AmlTree child : (List<AmlTree>)tree.getChildren()) {
            analyze(child, scope, depth+1);
        }
        if (newScope) scope.removeFirst();
    }
}