package interpreter;

import java.util.ArrayList;
import java.util.HashMap;

import data.*;
import exceptions.AmlMusicException;
import exceptions.AmlRunTimeException;
import music.*;
import parser.MusicLexer;
import sun.nio.cs.ext.IBM037;

public class Interpreter {

    HashMap<String, AmlTree> functionMap;
    HashMap<String, AmlTree> fragmentMap;
    HashMap<String, AmlTree> songMap;
    private int currentIteration;
    private AmlStack stack;
    private AmlSequence sequence;

    public AmlSequence getSequence() {
        return sequence;
    }

    public Interpreter() {
        sequence = new AmlSequence(120);
        functionMap = new HashMap<>();
        fragmentMap = new HashMap<>();
        stack = new AmlStack(sequence.addFirstTrack());
    }

    public Data executeFunction(String functionName, ArrayList<Data> arguments) throws AmlRunTimeException {
        AmlTree function = functionMap.get(functionName);
        AmlTrack copy = sequence.addTrack(stack.getTrack());
        stack.push(function, copy);
        if (arguments != null) {
            ArrayList<Data> localVariables = stack.getLocalVariables();
            int i = 0;
            for (Data argument : arguments) {
                localVariables.set(i, argument.clone());
                ++i;
            }
        }
        Data ret = executeListInstruction(function.getChild(2));
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
        Data ret = executeListMusicInstruction(fragment.getChild(2), compas);
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
        if(executeCommonInstruction(tree)) return null;
        switch(tree.getType()) {
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
            case MusicLexer.WHILE:
                while(evaluateBooleanExpression(tree.getChild(0))) {
                    Data returnData = executeListInstruction(tree.getChild(1));
                    if (returnData != null) return returnData;
                }
                break;
            case MusicLexer.FOR: {
                initializeFor(tree.getChild(0));
                //Parte central del for:
                while(evaluateBooleanExpression(tree.getChild(1))) {
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
                if (evaluateBooleanExpression(tree.getChild(0))) {
                    returnData = executeListInstruction(tree.getChild(1));
                } else {
                    for (int i = 2; i < tree.getChildCount(); ++i) {
                        AmlTree child = tree.getChild(i);
                        if (child.getType() == MusicLexer.ELSEIF) {
                            if (evaluateBooleanExpression(child.getChild(0))) {
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
                addCompasList(tree, stack.getTrack());
                break;
            default:

        }
        return null;
    }

    private boolean executeCommonInstruction(AmlTree tree) throws AmlRunTimeException {
        switch (tree.getType()) {
            case MusicLexer.INT:
                for (AmlTree assigChild : tree.getArrayChildren()) {
                    if(assigChild.getType() == MusicLexer.ASSIG) {
                        int index = assigChild.getChild(0).getVariableIndex();
                        Int value = (Int) evaluateExpression(assigChild.getChild(1));
                        stack.getLocalVariables().set(index, value);
                    } else {
                        int index = assigChild.getVariableIndex();
                        stack.getLocalVariables().set(index, new Int());
                    }
                }
                return true;
            case MusicLexer.BOOL:
                for (AmlTree assigChild : tree.getArrayChildren()) {
                    if(assigChild.getType() == MusicLexer.ASSIG) {
                        int index = assigChild.getChild(0).getVariableIndex();
                        Bool value = new Bool( evaluateBooleanExpression(assigChild.getChild(1)) );
                        stack.getLocalVariables().set(index, value);
                    } else {
                        int index = assigChild.getVariableIndex();
                        stack.getLocalVariables().set(index, new Bool());
                    }
                }
                return true;
            //TODO: Fix EvaluateExpression for Strings + Concat operation, change grammar
            case MusicLexer.STRING_TYPE:
                for (AmlTree assigChild : tree.getArrayChildren()) {
                    if(assigChild.getType() == MusicLexer.ASSIG) {
                        int index = assigChild.getChild(0).getVariableIndex();
                        TextVar value = (TextVar) evaluateExpression(assigChild.getChild(1));
                        stack.getLocalVariables().set(index, value);
                    } else {
                        int index = assigChild.getVariableIndex();
                        stack.getLocalVariables().set(index, new TextVar());
                    }
                }
                return true;
            case MusicLexer.ASSIG: {
                int index = tree.getChild(0).getVariableIndex();
                Data currentVar = stack.getLocalVariables().get(index);
                if(currentVar instanceof Bool) {
                    boolean value = evaluateBooleanExpression(tree.getChild(1));
                    ((Bool) currentVar).setValue(value);
                } else {
                    int value = ((Int) evaluateExpression(tree.getChild(1))).getValue();
                    ((Int) currentVar).setValue(value);
                }
                return true;
            }
            case MusicLexer.PLUS_ASSIG: {
                int index = tree.getChild(0).getVariableIndex();
                int value = ((Int) evaluateExpression(tree.getChild(1))).getValue();
                Int currentVar = ((Int) stack.getLocalVariables().get(index));
                currentVar.setValue(currentVar.getValue() + value);
                return true;
            }
            case MusicLexer.MINUS_ASSIG: {
                int index = tree.getChild(0).getVariableIndex();
                int value = ((Int) evaluateExpression(tree.getChild(1))).getValue();
                Int currentVar = (Int) stack.getLocalVariables().get(index);
                currentVar.setValue(currentVar.getValue() - value);
                return true;
            }
            case MusicLexer.PROD_ASSIG: {
                int index = tree.getChild(0).getVariableIndex();
                int value = ((Int) evaluateExpression(tree.getChild(1))).getValue();
                Int currentVar = ((Int) stack.getLocalVariables().get(index));
                currentVar.setValue(currentVar.getValue() * value);
                return true;
            }
            case MusicLexer.DIVIDE_ASSIG: {
                int index = tree.getChild(0).getVariableIndex();
                int value = ((Int) evaluateExpression(tree.getChild(1))).getValue();
                Int currentVar = ((Int) stack.getLocalVariables().get(index));
                currentVar.setValue(currentVar.getValue() / value);
                return true;
            }
            case MusicLexer.MOD_ASSIG: {
                int index = tree.getChild(0).getVariableIndex();
                int value = ((Int) evaluateExpression(tree.getChild(1))).getValue();
                Int currentVar = ((Int) stack.getLocalVariables().get(index));
                currentVar.setValue(currentVar.getValue() % value);
                return true;
            }
            case MusicLexer.PRE:
            case MusicLexer.POST:
                int index = tree.getChild(0).getVariableIndex();
                Int currentVar = ((Int) stack.getLocalVariables().get(index));
                switch (tree.getChild(1).getType()) {
                    case MusicLexer.DECR:
                        currentVar.setValue(currentVar.getValue()-1);
                        break;
                    case MusicLexer.INCR:
                        currentVar.setValue(currentVar.getValue()+1);
                        break;
                }
                return true;
        }
        return false;
    }

    private Data evaluateExpression(AmlTree tree) throws AmlRunTimeException {
        switch (tree.getType()) {


            case MusicLexer.NUM:
                return new Int(tree.getIntValue());
            case MusicLexer.PLUS: {
                int ls = ((Int) evaluateExpression(tree.getChild(0))).getValue();
                int rs = ((Int) evaluateExpression(tree.getChild(1))).getValue();
                return new Int(ls + rs);
            }
            case MusicLexer.MINUS: {
                int ls = ((Int) evaluateExpression(tree.getChild(0))).getValue();
                int rs = ((Int) evaluateExpression(tree.getChild(1))).getValue();
                return new Int(ls - rs);
            }
            case MusicLexer.DIV: {
                int ls = ((Int) evaluateExpression(tree.getChild(0))).getValue();
                int rs = ((Int) evaluateExpression(tree.getChild(1))).getValue();
                return new Int(ls / rs);
            }
            case MusicLexer.DOT: {
                int ls = ((Int) evaluateExpression(tree.getChild(0))).getValue();
                int rs = ((Int) evaluateExpression(tree.getChild(1))).getValue();
                return new Int(ls * rs);
            }
            case MusicLexer.MOD: {
                int ls = ((Int) evaluateExpression(tree.getChild(0))).getValue();
                int rs = ((Int) evaluateExpression(tree.getChild(1))).getValue();
                return new Int(ls % rs);
            }
            case MusicLexer.ATTR_ACCESS:
                break;
            case MusicLexer.ID:
                if(tree.getText().equals("Time")) {
                    return new Int(currentIteration);
                }
                int index = tree.getVariableIndex();
                return stack.getLocalVariables().get(index);
            case MusicLexer.FUNCALL:
                ArrayList<Data> arguments = new ArrayList<>(tree.getChildCount());
                if (tree.getChildren() != null) {
                    int i = 0;
                    for (AmlTree argument : tree.getArrayChildren()) {
                        Data expressionResult = evaluateExpression(argument);
                        arguments.set(i, expressionResult);
                    }
                }
                return executeFunction(tree.getText(), arguments);
        }
        throw new Error("This should never happen");
    }

    private boolean evaluateBooleanExpression(AmlTree tree) throws AmlRunTimeException {
        Int leftSide, rightSide;
        switch (tree.getType()){
            case MusicLexer.TRUE:
                return true;
            case MusicLexer.FALSE:
                return false;
            case MusicLexer.ID:
                int index = tree.getVariableIndex();
                return ((Bool) stack.getLocalVariables().get(index)).getValue();
            case MusicLexer.EQUAL:
                leftSide = (Int) evaluateExpression(tree.getChild(0));
                rightSide = (Int) evaluateExpression(tree.getChild(1));
                return leftSide.getValue() == rightSide.getValue();
            case MusicLexer.NOT_EQUAL:
                leftSide = (Int) evaluateExpression(tree.getChild(0));
                rightSide = (Int) evaluateExpression(tree.getChild(1));
                return leftSide.getValue() != rightSide.getValue();
            case MusicLexer.GE:
                leftSide = (Int) evaluateExpression(tree.getChild(0));
                rightSide = (Int) evaluateExpression(tree.getChild(1));
                return leftSide.getValue() >= rightSide.getValue();
            case MusicLexer.GT:
                leftSide = (Int) evaluateExpression(tree.getChild(0));
                rightSide = (Int) evaluateExpression(tree.getChild(1));
                return leftSide.getValue() > rightSide.getValue();
            case MusicLexer.LE:
                leftSide = (Int) evaluateExpression(tree.getChild(0));
                rightSide = (Int) evaluateExpression(tree.getChild(1));
                return leftSide.getValue() <= rightSide.getValue();
            case MusicLexer.LT:
                leftSide = (Int) evaluateExpression(tree.getChild(0));
                rightSide = (Int) evaluateExpression(tree.getChild(1));
                return leftSide.getValue() < rightSide.getValue();
            case MusicLexer.FUNCALL:
                ArrayList<Data> arguments = new ArrayList<>(tree.getChildCount());
                if (tree.getChildren() != null) {
                    int i = 0;
                    for (AmlTree argument : tree.getArrayChildren()) {
                        Data expressionResult = evaluateExpression(argument);
                        arguments.set(i, expressionResult);
                    }
                }
                return ((Bool)executeFunction(tree.getText(), arguments)).getValue();
            default:
                throw new Error("This should never happen");
        }
    }

    private Data executeListMusicInstruction(AmlTree tree, AmlCompas compas) throws AmlRunTimeException {
        for(AmlTree child : tree.getArrayChildren()) {
            Data returnData = executeMusicInstruction(child, compas);
            if (returnData != null) return returnData;
        }
        return null;
    }

    private Data executeMusicInstruction(AmlTree tree, AmlCompas compas) throws AmlRunTimeException {
        if(executeCommonInstruction(tree)) return null;
        switch (tree.getType()) {
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
            case MusicLexer.TONE:
                compas.changeTrackTone(createTone(tree));
                break;
            case MusicLexer.TRANSPORT:
                Int num = (Int)evaluateExpression(tree.getChild(0));
                compas.transportTrack(num.getValue());
                break;
            case MusicLexer.BEAT:
                int[] metric = createMetric(tree);
                compas.changeTrackBeat(metric);
                break;
            case MusicLexer.IF: {
                Data returnData = null;
                if (evaluateBooleanExpression(tree.getChild(0))) {
                    returnData = executeListMusicInstruction(tree.getChild(1), compas);
                } else {
                    for (int i = 2; i < tree.getChildCount(); ++i) {
                        AmlTree child = tree.getChild(i);
                        if (child.getType() == MusicLexer.ELSEIF) {
                            if (evaluateBooleanExpression(child.getChild(0))) {
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
                while(evaluateBooleanExpression(tree.getChild(0))) {
                    Data returnData = executeListMusicInstruction(tree.getChild(1),compas);
                    if (returnData != null) return returnData;
                }
                break;
            case MusicLexer.FOR: {
                initializeFor(tree.getChild(0));
                //Parte central del for:
                while(evaluateBooleanExpression(tree.getChild(1))) {
                    Data returnData = executeListMusicInstruction(tree.getChild(3),compas);
                    if (returnData != null) return returnData;
                    for(AmlTree childAssig : tree.getChild(2).getArrayChildren()) {
                        executeCommonInstruction(childAssig);
                    }
                }
                break;
            }
            case MusicLexer.NOTES:
                AmlNote note = createNote(tree);
                try {
                    compas.addNote(note);
                }
                catch (AmlMusicException exception) {
                    exception.setLine(tree.getLine());
                    throw exception;
                }
                break;
            case MusicLexer.DRUMSNOTES:
                AmlNote drumNote = createNote(tree);
                try {
                    compas.addNote((AmlDrumNote) drumNote);
                }
                catch (AmlMusicException exception) {
                    exception.setLine(tree.getLine());
                    throw exception;
                }
                break;
            case MusicLexer.SPEED:
                int bpm = createBPM(tree);
                sequence.setSpeed(bpm, compas.getTrack().getCurrentTick());
                break;
        }
        return null;
    }

    private void createSong(AmlTree tree) throws AmlRunTimeException {
        AmlTrack mainTrack =  stack.getTrack();
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
            sequence.setSpeed(bpm, stack.getTrack().getCurrentTick());
        }

        for(i = i-1; i < tree.getChildCount(); ++i) {
            if (tree.getChild(i).getType() == MusicLexer.TRACK) {
                createTrack(tree.getChild(i), metric, tone, transport);
            }
            else {
                createDrumsTrack(tree.getChild(i), metric);
            }
        }
    }

    private void createTrack(AmlTree child, int[] metric, AmlTone tone, int transport) throws AmlRunTimeException {
        AmlTree listOfCompas;
        AmlInstrument instrument;
        if (child.getChildCount() > 1) {
            AmlInstrument.Instruments instrumentEnum = child.getChild(0).getInstrumentValue();
            instrument = new AmlInstrument(instrumentEnum);
            listOfCompas = child.getChild(1);
        }
        else {
            instrument = stack.getTrack().getInstrument();
            listOfCompas = child.getChild(0);
        }

        AmlTrack track = sequence.addTrack(instrument, metric, tone, transport, stack.getTrack());
        addCompasList(listOfCompas, track);
    }

    private AmlTone createTone(AmlTree tree) throws AmlMusicException {
        int toneNumber = tree.getChild(0).getIntValue();
        if (Math.abs(toneNumber) >= 8) {
            throw new AmlMusicException("Tone in song " /*TODO: Introducir nombre de song */ + " is not correct." +
                    "\n Tone must be between -7 and 7.", tree.getLine());
        }
        AmlTree typeOfAccident = tree.getChild(1);
        if (typeOfAccident.getType() == MusicLexer.BEMOL) {
            toneNumber = -toneNumber;
        }
        return new AmlTone(toneNumber);
    }

    private int[] createMetric(AmlTree tree) throws AmlRunTimeException {
        int[] metric = new int[2];
        metric[0] = tree.getChild(0).getIntValue();
        metric[1] = tree.getChild(1).getIntValue();
        if (metric[0] < 0 || metric[1] < 0)
            throw new AmlRunTimeException("Metric values must be positive: " + metric[0] + ":" + metric[1], tree.getLine());
        return metric;
    }

    private int createBPM(AmlTree tree) throws AmlRunTimeException {
        int bpm = tree.getChild(0).getIntValue();
        if (bpm < 0)
            throw new AmlRunTimeException("Bpm value must be positive: " + bpm, tree.getLine());
        return tree.getChild(0).getIntValue();
    }

    private void createDrumsTrack(AmlTree tree, int[] metric) throws AmlRunTimeException {
        AmlDrumsTrack drumsTrack = sequence.addDrumsTrack(metric, stack.getTrack());
        AmlTree listOfCompas = tree.getChild(0);
        addCompasList(listOfCompas, drumsTrack);

    }

    private void addCompasList(AmlTree listOfCompas, AmlTrack track) throws AmlRunTimeException {
        for(AmlTree child : listOfCompas.getArrayChildren()) {
            switch (child.getType()) {
                case MusicLexer.COMPAS:
                    track.addCompas(createCompas(child, track));
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
        if (tree.getChild(0).getType() == MusicLexer.NUM) {
            iterations = tree.getChild(0).getIntValue();
            init = 1;
        }
        for (int i = 0; i < iterations; ++i) {
            currentIteration = i+1;
            for(int j = init; j < tree.getChildCount(); ++j) {
                track.addCompas(createCompas(tree.getChild(j), track));
            }
        }
        currentIteration = 1;
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

    private AmlNote createNote(AmlTree tree) {
        AmlTree noteList = tree.getChild(0);

        /* Loops over the metric modifiers */
        int figureModifier = 0;
        boolean tie = false;
        AmlNote.Figure figure = AmlNote.Figure.NoFigure;

        for (int i = 1; i < tree.getChildCount(); ++i) {
            AmlTree figureModifierNode = tree.getChild(i);

            switch (figureModifierNode.getType()) {
                case MusicLexer.FIGURE:
                    figure = figureModifierNode.getFigureValue();
                    break;
                case MusicLexer.DOT:
                    figureModifier = 1;
                    break;
                case MusicLexer.TIE:
                    tie = true;
                    break;
            }
        }

        if (noteList.getType() == MusicLexer.NOTE_LIST) {
            AmlNote note = new AmlNote(figure, figureModifier, tie);
            createNoteList(noteList, note);
            return note;
        }
        else if (noteList.getType() == MusicLexer.CHORD) {
            AmlChord chord = new AmlChord(figure, figureModifier, tie);
            createChord(noteList, chord);
            return chord;
        }
        else if (noteList.getType() == MusicLexer.DRUMSNOTE_LIST) {
            AmlDrumNote drumNote = new AmlDrumNote(figure, figureModifier, tie);
            /* Loops over the list of notes */
            for (AmlTree noteChild : noteList.getArrayChildren()) {
                drumNote.addDrumNotePitch(noteChild.getIntValue());
            }
            return drumNote;
        }
        return null;
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

    private void createNoteList(AmlTree noteList, AmlNote note) {
         /* Loops over the list of notes */
        for (AmlTree noteChild : noteList.getArrayChildren()) {
            AmlNote.Note noteName = noteChild.getNoteValue();
            int octave = 5;
            AmlNote.Accident accident = AmlNote.Accident.Natural;

            if (noteChild.getChildren() != null) {
                for (AmlTree pitchModifier : noteChild.getArrayChildren()) {
                    switch (pitchModifier.getType()) {
                        case MusicLexer.NUM:
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
            note.addNotePitch(noteName, octave, accident);
        }
    }

    private void createChord(AmlTree noteList, AmlChord chord) {
        AmlNote.Note rootNote = AmlNote.Note.Silence;
        int octave = 5;
        int semiToneModifier = 0;
        AmlChord.Quality quality = AmlChord.Quality.Mayor;
        AmlChord.Interval interval = AmlChord.Interval.NoInterval;
        for (AmlTree child : noteList.getArrayChildren()) {
            switch (child.getType()) {
                case MusicLexer.NOTE:
                    rootNote = child.getNoteValue();
                    if (child.getChildren() != null) {
                        for (AmlTree pitchModifier : child.getArrayChildren()) {
                            switch (pitchModifier.getType()) {
                                case MusicLexer.NUM:
                                    octave = pitchModifier.getIntValue();
                                    break;
                                case MusicLexer.BEMOL:
                                    semiToneModifier = -1;
                                    break;
                                case MusicLexer.SUSTAIN:
                                    semiToneModifier = 1;
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
        chord.setInterval(interval);
        chord.setOctave(octave);
        chord.setQuality(quality);
        chord.setRoot(rootNote);
        chord.setSemiToneModifier(semiToneModifier);
        chord.constructChord();
    }
}
