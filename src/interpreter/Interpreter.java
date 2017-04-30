package interpreter;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.sound.midi.*;

import data.Data;
import data.Int;
import exceptions.AmlException;
import exceptions.AmlMusicException;
import music.*;
import parser.MusicLexer;

public class Interpreter {

    HashMap<String, AmlTree> functionMap;
    HashMap<String, AmlTree> fragmentMap;
    HashMap<String, AmlTree> songMap;
    private int currentIteration;
    private AmlStack stack;

    public Interpreter() {
        functionMap = new HashMap<>();
        fragmentMap = new HashMap<>();
        stack = new AmlStack();
    }

    public void executeFunction(String functionName, ArrayList<Data> arguments) throws AmlException {
        AmlTree function = functionMap.get(functionName);
        stack.push(function);
        executeListInstruction(function.getChild(2));
        stack.pop();
    }

    public void executeListInstruction(AmlTree tree) throws AmlException {
        for(AmlTree child : (List<AmlTree>)tree.getChildren()) {
            executeInstruction(child);
        }
    }

    public void executeInstruction(AmlTree tree) throws AmlException {
        switch(tree.getType()) {
            case MusicLexer.SONG:
                //TODO: Crear secuencia
                createSong(tree);
                break;
            default:
                break;
        }
    }

    private Data evaluateExpression(AmlTree tree) {
        switch (tree.getType()) {
            case MusicLexer.NUM:
                return new Int(tree.getIntValue());
            case MusicLexer.ATTR_ACCESS:
                break;
            case MusicLexer.ID:
                if(tree.getText().equals("Time")) {
                    return new Int(currentIteration);
                }
                int index = tree.getVariableIndex();
                return stack.getLocalVariables().get(index);
        }
        return null;
    }

    private boolean evaluateBooleanExpression(AmlTree tree) {
        Int leftSide, rightSide;
        switch (tree.getType()){
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
        }
        return true;
    }

    public void executeListMusicInstruction(AmlTree tree, AmlCompas compas) throws AmlMusicException {
        for(AmlTree child : (List<AmlTree>)tree.getChildren()) {
            executeMusicInstruction(child, compas);
        }
    }

    private void executeMusicInstruction(AmlTree tree, AmlCompas compas) throws AmlMusicException {
        switch (tree.getType()) {
            case MusicLexer.TONE:
                compas.changeTrackTone(createTone(tree));
                break;
            case MusicLexer.SONG:
                break;
            case MusicLexer.IF:
                if(evaluateBooleanExpression(tree.getChild(0))) {
                    executeListMusicInstruction(tree.getChild(1), compas);
                } else {
                    for(int i = 2; i < tree.getChildCount(); ++i) {
                        AmlTree child = tree.getChild(i);
                        if(child.getType() == MusicLexer.ELSEIF) {
                            if(evaluateBooleanExpression(child.getChild(0))) {
                                executeListMusicInstruction(child.getChild(1), compas);
                                break;
                            }
                        } else {
                            executeListMusicInstruction(child.getChild(0), compas);
                        }
                    }
                }
                break;
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
                compas.addNote((AmlDrumNote) drumNote);

                break;
        }
    }

    private void createSong(AmlTree tree) throws AmlException {
        int[] metric = {4,4};
        int bpm = 120;
        int tone = 0;

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
                    /* TODO: THIS */
                    break;
            }
            songChild = tree.getChild(i++);
        }

        AmlSequence sequence = new AmlSequence(bpm, metric, tone);

        for(i = i-1; i < tree.getChildCount(); ++i) {
            if (tree.getChild(i).getType() == MusicLexer.TRACK) {
                createTrack(tree.getChild(i), sequence);
            }
            else {
                createDrumsTrack(tree.getChild(i), sequence);
            }
        }

        File f = new File("midifile.mid");
        try {
            MidiSystem.write(sequence.getSequence(),1,f);
        } catch (IOException e) {
            throw new AmlException(e.getMessage());
        }
    }

    private int createTone(AmlTree tree) throws AmlMusicException {
        int tone = tree.getChild(0).getIntValue();
        if (Math.abs(tone) >= 8) {
            throw new AmlMusicException("Tone in song " /*TODO: Introducir nombre de song */ + " is not correct." +
                    "\n Tone must be between -7 and 7.", tree.getLine());
        }
        AmlTree typeOfAccident = tree.getChild(1);
        if (typeOfAccident.getType() == MusicLexer.BEMOL) {
            tone = -tone;
        }
        return tone;
    }

    private int[] createMetric(AmlTree tree) {
        int[] metric = new int[2];
        metric[0] = tree.getChild(0).getIntValue();
        metric[1] = tree.getChild(1).getIntValue();
        return metric;
    }

    private int createBPM(AmlTree tree) {
        return tree.getChild(0).getIntValue();
    }

    public void createDrumsTrack(AmlTree tree, AmlSequence sequence) throws AmlException {
        AmlDrumsTrack drumsTrack = sequence.addDrumsTrack();
        AmlTree listOfCompas = tree.getChild(0);
        //TODO: esto se puede hacer en una función
        for(AmlTree child : (List<AmlTree>) listOfCompas.getChildren()) {
            switch (child.getType()) {
                case MusicLexer.COMPAS:
                    drumsTrack.addCompas(createCompas(child, drumsTrack));
                    break;
                case MusicLexer.REPETITION:
                    repeat(child, drumsTrack);
                    break;
            }
        }
    }

    public void createTrack(AmlTree tree, AmlSequence sequence) throws AmlException {
        tree.getChild(0).setInstrumentValue();
        AmlInstrument.Instruments instrumentEnum = tree.getChild(0).getInstrumentValue();

        AmlTrack track = sequence.addTrack();
        AmlInstrument instrument = new AmlInstrument(instrumentEnum);
        track.setInstrument(instrument);

        AmlTree listOfCompas = tree.getChild(1);
        for(AmlTree child : (List<AmlTree>) listOfCompas.getChildren()) {
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

    public void repeat(AmlTree tree, AmlTrack track) throws AmlMusicException {
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

    public AmlCompas createCompas(AmlTree tree, AmlTrack track) throws AmlMusicException {
        AmlCompas compas = new AmlCompas(track);
        for(AmlTree child : (List<AmlTree>) tree.getChildren()) {
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

    public AmlNote createNote(AmlTree tree) {
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

            /* Loops over the list of notes */
            for (AmlTree noteChild : (List<AmlTree>) noteList.getChildren()) {
                AmlNote.Note noteName = noteChild.getNoteValue();
                int octave = 5;
                AmlNote.Accident accident = AmlNote.Accident.Natural;

                if (noteChild.getChildren() != null) {
                    for (AmlTree pitchModifier : (List<AmlTree>) noteChild.getChildren()) {
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
            return note;
        }
        else if (noteList.getType() == MusicLexer.CHORD) {
            AmlNote.Note rootNote = AmlNote.Note.Silence;
            int octave = 5;
            int semiToneModifier = 0;
            AmlChord.Quality quality = AmlChord.Quality.Mayor;
            AmlChord.Interval interval = AmlChord.Interval.NoInterval;
            for (AmlTree child : (List<AmlTree>) noteList.getChildren()) {
                switch (child.getType()) {
                    case MusicLexer.NOTE:
                        rootNote = child.getNoteValue();
                        if (child.getChildren() != null) {
                            for (AmlTree pitchModifier : (List<AmlTree>) child.getChildren()) {
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
            return new AmlChord(rootNote, octave, semiToneModifier, quality, interval, figure, figureModifier, tie);
        }
        else if (noteList.getType() == MusicLexer.DRUMSNOTE_LIST) {
            AmlDrumNote drumNote = new AmlDrumNote(figure, figureModifier, tie);

            /* Loops over the list of notes */
            for (AmlTree noteChild : (List<AmlTree>) noteList.getChildren()) {
                drumNote.addDrumNotePitch(noteChild.getIntValue());
            }
            return drumNote;
        }
        return null;
    }
}
