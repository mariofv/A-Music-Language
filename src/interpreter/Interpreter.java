package interpreter;

import java.lang.reflect.Field;
import java.sql.Struct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.AttributeSetMethodGenerator;
import data.*;
import data.Void;
import exceptions.AmlMusicException;
import exceptions.AmlRunTimeException;
import music.*;
import parser.MusicLexer;
import services.ControlChange;
import sun.nio.cs.ext.IBM037;
import sun.plugin.dom.core.NamedNodeMap;
import sun.plugin.dom.core.Text;

public class Interpreter {

    HashMap<String, AmlTree> functionMap;
    HashMap<String, AmlTree> fragmentMap;
    HashMap<String, AmlTree> songMap;
    private Scanner scanner;
    private int currentIteration;
    private AmlStack stack;
    private AmlSequence sequence;
    private AmlTrack currentTrack;

    public AmlSequence getSequence() {
        return sequence;
    }

    public Interpreter() {
        scanner = new Scanner(System.in);
        sequence = new AmlSequence(120);
        functionMap = new HashMap<>();
        fragmentMap = new HashMap<>();
        stack = new AmlStack();
        currentTrack = sequence.addFirstTrack();
        currentIteration = 1;
    }

    public Data executeFunction(String functionName, ArrayList<Data> arguments) throws AmlRunTimeException {
        AmlTree function = functionMap.get(functionName);
        AmlTrack newTrack = sequence.addTrack(currentTrack);
        stack.push(function, newTrack);
        if (arguments != null) {
            ArrayList<Data> localVariables = stack.getLocalVariables();
            int i = 0;
            for (Data argument : arguments) {
                localVariables.set(i, argument.clone());
                ++i;
            }
        }
        AmlTrack lastTrack = currentTrack;
        currentTrack = newTrack;

        sequence.saveTrack(lastTrack);
        Data ret = executeListInstruction(function.getChild(2));
        sequence.saveTrack(currentTrack);

        currentTrack = lastTrack;
        currentTrack.setCurrentTick(newTrack.getCurrentTick());
        stack.pop();
        return ret;
    }

    public void executeFragment(String fragmentName, ArrayList<Data> arguments, AmlCompas compas) throws AmlRunTimeException {
        AmlTree fragment = fragmentMap.get(fragmentName);
        stack.push(fragment, compas.getTrack());
        if (arguments != null) {
            ArrayList<Data> localVariables = stack.getLocalVariables();
            int i = 0;
            for (Data argument : arguments) {
                localVariables.set(i, argument.clone());
                ++i;
            }
        }
        executeListMusicInstruction(fragment.getChild(2), compas);
        stack.pop();
    }

    private Data executeListInstruction(AmlTree tree) throws AmlRunTimeException {
        for(AmlTree child : tree.getArrayChildren()) {
            Data returnData = executeInstruction(child);
            if (returnData != null) return returnData;
        }
        return null;
    }

    private Data executeInstruction(AmlTree tree) throws AmlRunTimeException {
        if(executeCommonInstruction(tree)) return null ;
        switch(tree.getType()) {
            case MusicLexer.VAR_FUNCALL:
                executeVarFunCall(tree);
                break;
            case MusicLexer.RETURN:
                if (tree.getChildCount() > 0) {
                    return evaluateExpression(tree.getChild(0));
                }
                return Void.getInstance();
            case MusicLexer.FUNCALL:
                ArrayList<Data> arguments = new ArrayList<>(tree.getChildCount());
                if (tree.getChildren() != null) {
                    for (AmlTree argument : tree.getArrayChildren()) {
                        Data expressionResult = evaluateExpression(argument);
                        arguments.add(expressionResult);
                    }
                }
                executeFunction(tree.getText(), arguments);
                break;
            case MusicLexer.SONG:
                createSong(tree);
                break;
            case MusicLexer.TONE:
                AmlTone tone = createTone(tree);
                currentTrack.setTone(tone);
                break;
            case MusicLexer.WHILE:
                while((boolean)evaluateExpression(tree.getChild(0)).getValue()) {
                    Data returnData = executeListInstruction(tree.getChild(1));
                    if (returnData != null) return returnData;
                }
                break;
            case MusicLexer.FOR: {
                initializeFor(tree.getChild(0));
                //Parte central del for:
                while((boolean)evaluateExpression(tree.getChild(1)).getValue()) {
                    Data returnData = executeListInstruction(tree.getChild(3));
                    if (returnData != null) return returnData;
                    //increment For
                    for(AmlTree childAssig : tree.getChild(2).getArrayChildren()) {
                        executeCommonInstruction(childAssig);
                    }
                }
                break;
            }
            case MusicLexer.IF: {
                Data returnData = null;
                if ((boolean)evaluateExpression(tree.getChild(0)).getValue()) {
                    returnData = executeListInstruction(tree.getChild(1));
                } else {
                    for (int i = 2; i < tree.getChildCount(); ++i) {
                        AmlTree child = tree.getChild(i);
                        if (child.getType() == MusicLexer.ELSEIF) {
                            if ((boolean)evaluateExpression(child.getChild(0)).getValue()) {
                                returnData = executeListInstruction(child.getChild(1));
                                break;
                            }
                        } else {
                            returnData = executeListInstruction(child.getChild(0));
                        }
                    }
                }
                if (returnData != null) return returnData;
                break;
            }
            case MusicLexer.COMPAS_LIST:
                addCompasList(tree, currentTrack);
                break;
            default:

        }
        return null;
    }

    private void defineLocalVariable(AmlTree tree) throws AmlRunTimeException {
        for (AmlTree assigChild : tree.getArrayChildren()) {
            if(assigChild.getType() == MusicLexer.ASSIG) {
                int index = assigChild.getChild(0).getVariableIndex();
                Data value =  evaluateExpression(assigChild.getChild(1)).clone();
                stack.getLocalVariables().set(index, value);
            } else {
                int index = assigChild.getVariableIndex();
                stack.getLocalVariables().set(index, createInstance(tree.getType()));
            }
        }
    }

    private Data createInstance(int type) {
        switch (type) {
            case MusicLexer.INT:
                return new Int();
            case MusicLexer.BOOL:
                return new Bool();
            case MusicLexer.CHORD:
                return new Chord();
            case MusicLexer.NOTE_TYPE:
                return new Note();
            case MusicLexer.DRUMS_NOTE_TYPE:
                return new DrumNote();
            case MusicLexer.STRING_TYPE:
                return new TextVar();
            default:
                throw new Error("This should never happen");
        }
    }

    private boolean executeCommonInstruction(AmlTree tree) throws AmlRunTimeException {

        switch (tree.getType()) {
            case MusicLexer.NOTE_TYPE:
            case MusicLexer.INT:
            case MusicLexer.STRING_TYPE:
            case MusicLexer.FIGURE_TYPE:
            case MusicLexer.CHORD:
            case MusicLexer.DRUMS_NOTE_TYPE:
                defineLocalVariable(tree);
                return true;
            case MusicLexer.READ: {
                int index = tree.getChild(0).getVariableIndex();
                Data currentVar = stack.getLocalVariables().get(index);
                AmlTree attribute = null;
                Object value = null;
                try {
                    if (tree.getChild(0).getType() == MusicLexer.ATTR_ACCESS) {
                        String attributeName = attribute.getText();
                        if (((AttributeData)currentVar).getAttributeValue(attributeName) instanceof Int) {
                            value = scanner.nextInt();
                        }
                        else if (((AttributeData)currentVar).getAttributeValue(attributeName)instanceof TextVar) {
                            value = scanner.next();
                        }
                        else if (((AttributeData)currentVar).getAttributeValue(attributeName) instanceof Bool) {
                            value = scanner.nextBoolean();
                        }
                        ((AttributeData)currentVar).setAttribute(attributeName, value);
                    }
                    else {
                        if (currentVar instanceof Int) {
                            value = scanner.nextInt();
                        }
                        else if (currentVar instanceof TextVar) {
                            value = scanner.next();
                        }
                        else if (currentVar instanceof Bool) {
                            value = scanner.nextBoolean();
                        }
                        currentVar.setValue(value);
                    }
                }
                catch (InputMismatchException e) {
                    throw new AmlRunTimeException("Input mismatch.", tree.getLine());
                }
                //TODO: ESTUDIAR IMPLEMENTAR MAS TIPOS.

                return true;
            }
            case MusicLexer.WRITE:
                Data valueToPrint = evaluateExpression(tree.getChild(0));
                //TODO: HACER QUE SE PUEDAN CONCATENAR COSAS QUE NO SON STRING CON STRING PARA EVITAR ESTE NEW LINE.
                System.out.println(valueToPrint);
                return true;
            case MusicLexer.BOOL:
                for (AmlTree assigChild : tree.getArrayChildren()) {
                    if(assigChild.getType() == MusicLexer.ASSIG) {
                        int index = assigChild.getChild(0).getVariableIndex();
                        Bool value = (Bool)evaluateExpression(assigChild.getChild(1));
                        stack.getLocalVariables().set(index, value);
                    } else {
                        int index = assigChild.getVariableIndex();
                        stack.getLocalVariables().set(index, new Bool());
                    }
                }
                return true;
            case MusicLexer.ASSIG: {
                int index = tree.getChild(0).getVariableIndex();
                Data currentVar = stack.getLocalVariables().get(index);
                Object value = evaluateExpression(tree.getChild(1)).clone().getValue();
                if (tree.getChild(0).getChildCount() > 0) {
                    AmlTree attribute = tree.getChild(0).getChild(0);
                    ((AttributeData)currentVar).setAttribute(attribute.getText(), value);
                }
                else {
                    currentVar.setValue(value);
                }
                return true;
            }
            case MusicLexer.PLUS_ASSIG: {
                int index = tree.getChild(0).getVariableIndex();
                Data currentVar = stack.getLocalVariables().get(index);
                int value = ((Int) evaluateExpression(tree.getChild(1))).getValue();
                if (tree.getChild(0).getChildCount() > 0) {
                    AmlTree attribute = tree.getChild(0).getChild(0);
                    ((AttributeData)currentVar).setAttribute(
                            attribute.getText(),
                            (int)(((AttributeData)currentVar).getAttributeValue(attribute.getText())).getValue() + value
                    );
                }
                else {
                    currentVar.setValue(((Int)currentVar).getValue() + value);
                }
                return true;
            }
            case MusicLexer.MINUS_ASSIG: {
                int index = tree.getChild(0).getVariableIndex();
                Data currentVar = stack.getLocalVariables().get(index);
                int value = ((Int) evaluateExpression(tree.getChild(1))).getValue();
                if (tree.getChild(0).getChildCount() > 0) {
                    AmlTree attribute = tree.getChild(0).getChild(0);
                    ((AttributeData)currentVar).setAttribute(
                            attribute.getText(),
                            (int)(((AttributeData)currentVar).getAttributeValue(attribute.getText())).getValue() - value
                    );
                }
                else {
                    currentVar.setValue(((Int)currentVar).getValue() - value);
                }
                return true;
            }
            case MusicLexer.PROD_ASSIG: {
                int index = tree.getChild(0).getVariableIndex();
                Data currentVar = stack.getLocalVariables().get(index);
                int value = ((Int) evaluateExpression(tree.getChild(1))).getValue();
                if (tree.getChild(0).getChildCount() > 0) {
                    AmlTree attribute = tree.getChild(0).getChild(0);
                    ((AttributeData)currentVar).setAttribute(
                            attribute.getText(),
                            (int)(((AttributeData)currentVar).getAttributeValue(attribute.getText())).getValue() * value
                    );
                }
                else {
                    currentVar.setValue(((Int)currentVar).getValue() * value);
                }
                return true;
            }
            case MusicLexer.DIVIDE_ASSIG: {
                int index = tree.getChild(0).getVariableIndex();
                Data currentVar = stack.getLocalVariables().get(index);
                int value = ((Int) evaluateExpression(tree.getChild(1))).getValue();
                if (tree.getChild(0).getChildCount() > 0) {
                    AmlTree attribute = tree.getChild(0).getChild(0);
                    ((AttributeData)currentVar).setAttribute(
                            attribute.getText(),
                            (int)(((AttributeData)currentVar).getAttributeValue(attribute.getText())).getValue() / value
                    );
                }
                else {
                    currentVar.setValue(((Int)currentVar).getValue() / value);
                }
                return true;
            }
            case MusicLexer.MOD_ASSIG: {
                int index = tree.getChild(0).getVariableIndex();
                Data currentVar = stack.getLocalVariables().get(index);
                int value = ((Int) evaluateExpression(tree.getChild(1))).getValue();
                if (tree.getChild(0).getChildCount() > 0) {
                    AmlTree attribute = tree.getChild(0).getChild(0);
                    ((AttributeData)currentVar).setAttribute(
                            attribute.getText(),
                            (int)(((AttributeData)currentVar).getAttributeValue(attribute.getText())).getValue() % value
                    );
                }
                else {
                    currentVar.setValue(((Int)currentVar).getValue() % value);
                }
                return true;
            }
            case MusicLexer.PRE:
            case MusicLexer.POST:
                int index = tree.getChild(0).getVariableIndex();
                Data currentVar = stack.getLocalVariables().get(index);
                AmlTree attribute = null;
                if (tree.getChild(0).getChildCount() > 0) attribute = tree.getChild(0).getChild(0);
                switch (tree.getChild(1).getType()) {
                    case MusicLexer.DECR:
                        if (attribute != null) {
                            ((AttributeData)currentVar).setAttribute(
                                    attribute.getText(),
                                    (int)(((AttributeData)currentVar).getAttributeValue(attribute.getText())).getValue() - 1
                            );
                        }
                        else {
                            currentVar.setValue((int)currentVar.getValue()-1);
                        }
                        break;
                    case MusicLexer.INCR:
                        if (attribute != null) {
                            ((AttributeData)currentVar).setAttribute(
                                    attribute.getText(),
                                    (int)(((AttributeData)currentVar).getAttributeValue(attribute.getText())).getValue() + 1
                            );
                        }
                        else {
                            currentVar.setValue(((Int)currentVar).getValue() + 1);
                        }
                        break;
                }
                return true;
            case MusicLexer.VOLUME:
                Int volumeValue = (Int)evaluateExpression(tree.getChild(0));
                ControlChange.setVolume(currentTrack, volumeValue.getValue());
                return true;
            case MusicLexer.TRANSPORT:
                Int num = (Int)evaluateExpression(tree.getChild(0));
                currentTrack.setTransport(num.getValue());
                return true;
            case MusicLexer.BEAT:
                int[] metric = createMetric(tree);
                currentTrack.setMetric(metric);
                return true;
            case MusicLexer.SPEED:
                int bpm = createBPM(tree);
                sequence.setSpeed(bpm, currentTrack.getCurrentTick());
                return true;
            case MusicLexer.INSTRUMENT:
                AmlInstrument.Instruments instrument = tree.getChild(0).getInstrumentValue();
                currentTrack.setInstrument(new AmlInstrument(instrument));
                return true;
        }
        return false;
    }

    private Data evaluateExpression(AmlTree tree) throws AmlRunTimeException {
        Int leftSide, rightSide;
        switch (tree.getType()) {
            case MusicLexer.NUM:
                return new Int(tree.getIntValue());
            case MusicLexer.STRING:
                return new TextVar(tree.getStringValue());
            case MusicLexer.FIGURE:
                if (tree.getChild(0).getType() == MusicLexer.CHORD) {
                    return new Chord((AmlChord) createFigure(tree));
                }
            case MusicLexer.DRUM_FIGURE:
                return new Figure(createFigure(tree));
            case MusicLexer.NOTE:
                return new Note(createNote(tree));
            case MusicLexer.DRUM_NOTE:
                return new DrumNote(createDrumNote(tree));
            case MusicLexer.FIGURE_NAME:
                return new Int(AmlFigure.mapFigureDuration(tree.getFigureValue()));
            case MusicLexer.PLUS: {
                Data ls = evaluateExpression(tree.getChild(0));
                Data rs = evaluateExpression(tree.getChild(1));
                return ls.sumOperator(rs);
            }
            case MusicLexer.MINUS: {
                Data ls = evaluateExpression(tree.getChild(0));
                Data rs = evaluateExpression(tree.getChild(1));
                return ls.substractOperator(rs);
            }
            case MusicLexer.DIV: {
                Data ls = evaluateExpression(tree.getChild(0));
                Data rs = evaluateExpression(tree.getChild(1));
                return ls.quotientOperator(rs);
            }
            case MusicLexer.DOT: {
                Data ls = evaluateExpression(tree.getChild(0));
                Data rs = evaluateExpression(tree.getChild(1));
                return ls.productOperator(rs);
            }
            case MusicLexer.MOD: {
                Data ls = evaluateExpression(tree.getChild(0));
                Data rs = evaluateExpression(tree.getChild(1));
                return ls.modOperator(rs);
            }
            case MusicLexer.ATTR_ACCESS:
                AttributeData currentVar = (AttributeData) stack.getLocalVariables().get(tree.getVariableIndex());
                String attributeName = tree.getChild(0).getText();
                return  currentVar.getAttributeValue(attributeName);
            case MusicLexer.ID:
                if(tree.getText().equals("Time")) {
                    return new Int(currentIteration);
                }
                int index = tree.getVariableIndex();
                return stack.getLocalVariables().get(index);
            case MusicLexer.FUNCALL:
                ArrayList<Data> arguments = new ArrayList<>(tree.getChildCount());
                if (tree.getChildren() != null) {
                    for (AmlTree argument : tree.getArrayChildren()) {
                        Data expressionResult = evaluateExpression(argument);
                        arguments.add(expressionResult);
                    }
                }
                return executeFunction(tree.getText(), arguments);
            case MusicLexer.VAR_FUNCALL:
                return executeVarFunCall(tree);
            case MusicLexer.TRUE:
                return new Bool(true);
            case MusicLexer.FALSE:
                return new Bool(false);
            case MusicLexer.EQUAL:
                leftSide = (Int) evaluateExpression(tree.getChild(0));
                rightSide = (Int) evaluateExpression(tree.getChild(1));
                return new Bool(leftSide.getValue() == rightSide.getValue());
            case MusicLexer.NOT_EQUAL:
                leftSide = (Int) evaluateExpression(tree.getChild(0));
                rightSide = (Int) evaluateExpression(tree.getChild(1));
                return new Bool(leftSide.getValue() != rightSide.getValue());
            case MusicLexer.GE:
                leftSide = (Int) evaluateExpression(tree.getChild(0));
                rightSide = (Int) evaluateExpression(tree.getChild(1));
                return new Bool(leftSide.getValue() >= rightSide.getValue());
            case MusicLexer.GT:
                leftSide = (Int) evaluateExpression(tree.getChild(0));
                rightSide = (Int) evaluateExpression(tree.getChild(1));
                return new Bool(leftSide.getValue() > rightSide.getValue());
            case MusicLexer.LE:
                leftSide = (Int) evaluateExpression(tree.getChild(0));
                rightSide = (Int) evaluateExpression(tree.getChild(1));
                return new Bool(leftSide.getValue() <= rightSide.getValue());
            case MusicLexer.LT:
                leftSide = (Int) evaluateExpression(tree.getChild(0));
                rightSide = (Int) evaluateExpression(tree.getChild(1));
                return new Bool(leftSide.getValue() < rightSide.getValue());

        }
        throw new Error("This should never happen");
    }


    private Data executeListMusicInstruction(AmlTree tree, AmlCompas compas) throws AmlRunTimeException {
        for(AmlTree child : tree.getArrayChildren()) {
            Data returnData = executeMusicInstruction(child, compas);
            if (returnData != null) return returnData;
        }
        return null;
    }

    private Data executeVarFunCall(AmlTree tree) throws AmlRunTimeException {
        int index = tree.getVariableIndex();
        AttributeData currentVar = (AttributeData)stack.getLocalVariables().get(index);
        String funcName  = tree.getChild(0).getText();
        ArrayList<Data> arguments = new ArrayList<>();
        for (int i = 1; i < tree.getChildCount(); ++i) {
            AmlTree argument = tree.getChild(1);
            Data expressionResult = evaluateExpression(argument).clone();
            arguments.add(expressionResult);
        }
        return  currentVar.method(funcName, arguments);
    }

    private Data executeMusicInstruction(AmlTree tree, AmlCompas compas) throws AmlRunTimeException {
        if(executeCommonInstruction(tree)) return null;
        switch (tree.getType()) {
            case MusicLexer.VAR_FUNCALL:
                return executeVarFunCall(tree);

            case MusicLexer.FUNCALL:
                ArrayList<Data> functionArguments = new ArrayList<>(tree.getChildCount());
                if (tree.getChildren() != null) {
                    for (AmlTree argument : tree.getArrayChildren()) {
                        Data expressionResult = evaluateExpression(argument);
                        functionArguments.add(expressionResult);
                    }
                }
                executeFunction(tree.getText(), functionArguments);
                break;
            case MusicLexer.FRAGCALL:
                ArrayList<Data> fragmentArguments = new ArrayList<>(tree.getChildCount());
                if (tree.getChildren() != null) {
                    for (AmlTree argument : tree.getArrayChildren()) {
                        Data expressionResult = evaluateExpression(argument);
                        fragmentArguments.add(expressionResult);
                    }
                }
                executeFragment(tree.getText(), fragmentArguments, compas);
                break;
            case MusicLexer.IF: {
                Data returnData = null;
                if ((boolean)evaluateExpression(tree.getChild(0)).getValue()) {
                    returnData = executeListMusicInstruction(tree.getChild(1), compas);
                } else {
                    for (int i = 2; i < tree.getChildCount(); ++i) {
                        AmlTree child = tree.getChild(i);
                        if (child.getType() == MusicLexer.ELSEIF) {
                            if ((boolean)evaluateExpression(child.getChild(0)).getValue()) {
                                returnData = executeListMusicInstruction(child.getChild(1), compas);
                                break;
                            }
                        } else {
                            returnData = executeListMusicInstruction(child.getChild(0), compas);
                        }
                    }
                }
                if (returnData != null) return returnData;
                break;
            }
            case MusicLexer.WHILE:
                while((boolean)evaluateExpression(tree.getChild(0)).getValue()) {
                    Data returnData = executeListMusicInstruction(tree.getChild(1),compas);
                    if (returnData != null) return returnData;
                }
                break;
            case MusicLexer.FOR: {
                initializeFor(tree.getChild(0));
                //Parte central del for:
                while((boolean)evaluateExpression(tree.getChild(1)).getValue()) {
                    Data returnData = executeListMusicInstruction(tree.getChild(3),compas);
                    if (returnData != null) return returnData;
                    for(AmlTree childAssig : tree.getChild(2).getArrayChildren()) {
                        executeCommonInstruction(childAssig);
                    }
                }
                break;
            }
            case MusicLexer.ID: {
                Data dataNote = stack.getLocalVariables().get(tree.getVariableIndex());
                AmlFigure note;
                if(dataNote instanceof Figure) {
                    note = ((Figure)dataNote).getValue();
                } else if (dataNote instanceof Chord) {
                    note = ((Chord)dataNote).getValue();
                }
                else throw new Error("This should never happen, the type is: " + dataNote.getClass());
                try {
                    compas.addFigure(note.clone());
                }
                catch (AmlMusicException exception) {
                    exception.setLine(tree.getLine());
                    throw exception;
                }
                break;
            }
            case MusicLexer.FIGURE:
                AmlFigure figure = createFigure(tree);
                try {
                    compas.addFigure(figure);
                }
                catch (AmlMusicException exception) {
                    exception.setLine(tree.getLine());
                    throw exception;
                }
                break;
            case MusicLexer.DRUM_FIGURE:
                AmlFigure drumFigure = createFigure(tree);
                try {
                    compas.addFigure(drumFigure);
                }
                catch (AmlMusicException exception) {
                    exception.setLine(tree.getLine());
                    throw exception;
                }
                break;
            case MusicLexer.TONE:
                AmlTone tone = createTone(tree);
                compas.changeTrackTone(tone);
                break;
        }
        return null;
    }

    private void createSong(AmlTree tree) throws AmlRunTimeException {
        AmlTrack mainTrack =  currentTrack;
        int[] metric = mainTrack.getMetricArray();
        int bpm = -1;
        int transport = 0;
        AmlTone tone = mainTrack.getTone().clone();

        int i = 0;
        AmlTree songChild = tree.getChild(i++);
        while (songChild.getType() != MusicLexer.TRACK) {
            switch (songChild.getType()) {
                case MusicLexer.BEAT:
                    metric = createMetric(songChild);
                    break;
                case MusicLexer.SPEED:
                    bpm = createBPM(songChild);
                    break;
                case MusicLexer.TONE:
                    tone = createTone(songChild);
                    break;
                case MusicLexer.TRANSPORT:
                    Int num = (Int)evaluateExpression(songChild.getChild(0));
                    transport = num.getValue();
                    break;
            }
            songChild = tree.getChild(i++);
        }

        if (bpm != -1) {
            sequence.setSpeed(bpm, currentTrack.getCurrentTick());
        }
        int lastTick = currentTrack.getCurrentTick();
        sequence.saveTrack(currentTrack);
        for(i = i-1; i < tree.getChildCount(); ++i) {
            if (tree.getChild(i).getType() == MusicLexer.TRACK) {
                lastTick = Math.max(createTrack(tree.getChild(i), metric, tone, transport), lastTick);
            }
            else {
                lastTick =  Math.max(createDrumsTrack(tree.getChild(i), metric), lastTick);
            }
        }
        currentTrack.setCurrentTick(lastTick);
    }

    private int createTrack(AmlTree child, int[] metric, AmlTone tone, int transport) throws AmlRunTimeException {
        AmlTree listOfCompas;
        AmlInstrument instrument;
        if (child.getChildCount() > 1) {
            AmlInstrument.Instruments instrumentEnum = child.getChild(0).getInstrumentValue();
            instrument = new AmlInstrument(instrumentEnum);
            listOfCompas = child.getChild(1);
        }
        else {
            instrument = currentTrack.getInstrument();
            listOfCompas = child.getChild(0);
        }

        AmlTrack track = sequence.addTrack(instrument, metric, tone, transport, currentTrack.getCurrentTick());
        AmlTrack lastTrack = currentTrack;
        currentTrack = track;
        addCompasList(listOfCompas, track);
        sequence.saveTrack(track);
        currentTrack = lastTrack;
        return track.getCurrentTick();
    }

    private int createDrumsTrack(AmlTree tree, int[] metric) throws AmlRunTimeException {
        AmlTree listOfCompas = tree.getChild(0);
        AmlDrumsTrack drumsTrack = sequence.addDrumsTrack(metric, currentTrack);
        AmlTrack lastTrack = currentTrack;
        currentTrack = drumsTrack;
        addCompasList(listOfCompas, drumsTrack);
        sequence.saveDrumsTrack(drumsTrack);
        currentTrack = lastTrack;
        return drumsTrack.getCurrentTick();
    }

    private AmlTone createTone(AmlTree tree) throws AmlRunTimeException {
        int toneNumber = ((Int)evaluateExpression(tree.getChild(0))).getValue();
        if (Math.abs(toneNumber) >= 8) {
            throw new AmlMusicException("Tone in song " /*TODO: Introducir nombre de song */ + " is not correct." +
                    "\nTone must be between -7 and 7, actual tone is " + toneNumber + ".", tree.getLine());
        }
        AmlTree typeOfAccident = tree.getChild(1);
        if (typeOfAccident.getType() == MusicLexer.BEMOL) {
            toneNumber = -toneNumber;
        }
        return new AmlTone(toneNumber);
    }

    private int[] createMetric(AmlTree tree) throws AmlRunTimeException {
        int[] metric = new int[2];
        metric[0] = ((Int)evaluateExpression(tree.getChild(0))).getValue();
        metric[1] = ((Int)evaluateExpression(tree.getChild(1))).getValue();
        if (metric[0] < 0 || metric[1] < 0)
            throw new AmlRunTimeException("Metric values must be positive: " + metric[0] + ":" + metric[1], tree.getLine());
        return metric;
    }

    private int createBPM(AmlTree tree) throws AmlRunTimeException {
        int bpm = ((Int)evaluateExpression(tree.getChild(0))).getValue();
        if (bpm < 0)
            throw new AmlRunTimeException("Bpm value must be positive: " + bpm, tree.getLine());
        return tree.getChild(0).getIntValue();
    }

    private void addCompasList(AmlTree listOfCompas, AmlTrack track) throws AmlRunTimeException {
        for(AmlTree child : listOfCompas.getArrayChildren()) {
            switch (child.getType()) {
                case MusicLexer.COMPAS:
                    //track.addCompas(createCompas(child, track));
                    createCompas(child, track);
                    break;
                case MusicLexer.REPETITION:
                    repeat(child, track);
                    break;
            }
        }
    }

    private void repeat(AmlTree tree, AmlTrack track) throws AmlRunTimeException {
        int iterations = 2;
        int init = 0;
        if (tree.getChild(0).getType() == MusicLexer.POS_NUM) {
            iterations = tree.getChild(0).getIntValue();
            init = 1;
        }
        int lastCurretnIteration = currentIteration;
        for (int i = 0; i < iterations; ++i) {
            currentIteration = i+1;
            addCompasList(tree.getChild(init), track);
            /*for(int j = init; j < tree.getChildCount(); ++j) {
                track.addCompas(createCompas(tree.getChild(j), track));
            }*/
        }
        currentIteration = lastCurretnIteration;
    }

    private AmlCompas createCompas(AmlTree tree, AmlTrack track) throws AmlRunTimeException {
        AmlCompas compas = new AmlCompas(track);
        for(AmlTree child : tree.getArrayChildren()) {
            executeMusicInstruction(child, compas);
        }
        try {
            compas.check();
        }
        catch (AmlMusicException exception) {
            exception.setLine(tree.getLine());
            throw exception;
        }
        return compas;
    }

    private AmlFigure createFigure(AmlTree tree) {
        AmlTree noteList = tree.getChild(0);

        /* Loops over the metric modifiers */
        int figureModifier = 0;
        boolean tie = false;
        AmlFigure.Figure figureType = AmlFigure.Figure.NoFigure;

        for (int i = 1; i < tree.getChildCount(); ++i) {
            AmlTree figureModifierNode = tree.getChild(i);

            switch (figureModifierNode.getType()) {
                case MusicLexer.FIGURE_NAME:
                    figureType = figureModifierNode.getFigureValue();
                    break;
                case MusicLexer.DOT:
                    figureModifier = 1;
                    break;
                case MusicLexer.TIE:
                    tie = true;
                    break;
            }
        }

        AmlFigure figure = new AmlFigure(figureType, figureModifier, tie);

        if (noteList.getType() == MusicLexer.NOTES) {
            for (AmlTree noteChild : noteList.getArrayChildren()) {
                AmlNote note = createNote(noteChild);
                figure.addNote(note);
            }
        }
        else if (noteList.getType() == MusicLexer.CHORD) {
            AmlChord chord = new AmlChord(figureType, figureModifier, tie);
            createChord(noteList, chord);
            return chord;
        }
        else if (noteList.getType() == MusicLexer.DRUM_NOTES) {
            /* Loops over the list of notes */
            for (AmlTree noteChild : noteList.getArrayChildren()) {
                figure.addNote(createDrumNote(noteChild));
            }
        }
        return figure;
    }

    public AmlDrumNote createDrumNote(AmlTree tree){
        return new AmlDrumNote(tree.getChild(0).getIntValue());
    }

    private void initializeFor(AmlTree tree) throws AmlRunTimeException {
        switch(tree.getType()) {
            case MusicLexer.LIST_ASSIG:
                for(AmlTree childAssig : tree.getArrayChildren()) {
                    executeCommonInstruction(childAssig);
                }
                break;
            default:
                executeCommonInstruction(tree);
                break;
        }
    }

    private AmlNote createNote(AmlTree noteTree) {
        AmlNote.Note noteName = noteTree.getNoteValue();
        int octave = 5;
        AmlNote.Accident accident = AmlNote.Accident.Natural;

        if (noteTree.getChildren() != null) {
            for (AmlTree pitchModifier : noteTree.getArrayChildren()) {
                switch (pitchModifier.getType()) {
                    case MusicLexer.NEG_NUM:
                        octave = -pitchModifier.getIntValue();
                        break;
                    case MusicLexer.BEMOL:
                        accident = AmlNote.Accident.Bemol;
                        break;
                    case MusicLexer.SUSTAIN:
                        accident = AmlNote.Accident.Sustain;
                        break;
                    case MusicLexer.ARMOR:
                        accident = AmlNote.Accident.Armor;
                        break;
                }
            }
        }
        return new AmlNote(noteName, accident, octave);
    }

    private void createChord(AmlTree noteList, AmlChord chord) {
        AmlNote.Note rootNote = AmlNote.Note.Silence;
        int octave = 5;
        AmlNote.Accident accident = AmlNote.Accident.Natural;

        AmlChord.Quality quality = AmlChord.Quality.Mayor;
        AmlChord.Interval interval = AmlChord.Interval.NoInterval;
        for (AmlTree child : noteList.getArrayChildren()) {
            switch (child.getType()) {
                case MusicLexer.NOTE:
                    rootNote = child.getNoteValue();
                    if (child.getChildren() != null) {
                        for (AmlTree pitchModifier : child.getArrayChildren()) {
                            switch (pitchModifier.getType()) {
                                case MusicLexer.NEG_NUM:
                                    octave = -pitchModifier.getIntValue();
                                    break;
                                case MusicLexer.BEMOL:
                                    accident = AmlNote.Accident.Bemol;
                                    break;
                                case MusicLexer.SUSTAIN:
                                    accident = AmlNote.Accident.Sustain;
                                    break;
                            }
                        }
                    }
                    break;
                case MusicLexer.MINOR:
                    quality = AmlChord.Quality.Menor;
                    break;
                case MusicLexer.PLUS:
                    quality = AmlChord.Quality.Aumentado;
                    break;
                case MusicLexer.DIMINUTION:
                    quality = AmlChord.Quality.Disminuido;
                    break;
                case MusicLexer.SEVENTH:
                    interval = AmlChord.Interval.Septima;
                    break;
                case MusicLexer.MAJ7:
                    interval = AmlChord.Interval.Maj7;
                    break;
            }
        }
        chord.setOctave(octave);
        chord.setAccident(accident);
        chord.setRoot(rootNote);
        chord.setInterval(interval);
        chord.setQuality(quality);
        chord.constructChord();
    }

    public AmlStack getStack() {
        return stack;
    }

}
