package interpreter;

import exceptions.AmlSemanticException;
import parser.MusicLexer;

import java.util.*;

public class SemanticAnalyzer {

    private HashMap<String, AmlTree> functionMap;
    private HashMap<String, AmlTree> fragmentMap;
    private HashMap<String, AmlTree> songMap;
    private LinkedList<HashMap<String, Integer>> scope;

    public SemanticAnalyzer(Interpreter interpreter) {
        functionMap = interpreter.functionMap;
        fragmentMap = interpreter.fragmentMap;
        songMap = interpreter.songMap;
        scope = new LinkedList<>();
    }

    public void analyze(AmlTree tree) throws AmlSemanticException {
        scope.addFirst(new HashMap<String, Integer>());
        analyze(tree, 0);
        scope.removeFirst();
    }

    public void insertId(AmlTree tree) throws AmlSemanticException {
        String id = tree.getText();
        for (HashMap scopeLevel : scope) {
            if (scopeLevel.containsKey(id)) {
                throw new AmlSemanticException("Variable " + id + " already declared in line " + scopeLevel.get(id), tree.getLine());
            }
            scope.getFirst().put(id, tree.getLine());
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
                    insertId(child.getChild(0));
                    break;
                case MusicLexer.ID:
                    insertId(child);
                    break;
            }
        }
        return true;
    }

    public void analyze(AmlTree tree, int depth) throws AmlSemanticException {
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
                AmlTree arguments = tree.getChild(1);
                if (arguments.getChildren() != null) {
                    for (AmlTree child : (ArrayList<AmlTree>) arguments.getChildren()) {
                        insertId(child.getChild(0));
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
                break;
            }
            case MusicLexer.SONG:
                if (depth == 0) {
                    AmlTree firstChild = tree.getChild(0);
                    if (firstChild.getType() != MusicLexer.ID) throw new AmlSemanticException("Global song must have a name", tree.getLine());
                    AmlTree previoudValue = songMap.put(firstChild.getText(), tree);
                    if (previoudValue != null) throw new AmlSemanticException("The global song " + firstChild.getText() + " has already been declared.", tree.getLine());
                }
                break;
            default:
                analyzeChilds = !analyzeDeclaration(tree);
        }

        if (tree.getChildren() == null || !analyzeChilds) return;
        if (newScope) scope.addFirst(new HashMap<String, Integer>());
        for (AmlTree child : (List<AmlTree>)tree.getChildren()) {
            analyze(child, depth+1);
        }
        if (newScope) scope.removeFirst();
    }
}