package interpreter;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.sound.midi.*;

import exceptions.AmlSemanticException;
import exceptions.AmlException;
import exceptions.AmlMusicException;
import exceptions.AmlRunTimeException;
import music.*;
import parser.MusicLexer;

public class Interpreter {

    private HashMap<String, AmlTree> functionMap;
    private HashMap<String, AmlTree> fragmentMap;
    private HashMap<String, AmlTree> songMap;

    public Interpreter() {
        functionMap = new HashMap<>();
        fragmentMap = new HashMap<>();
    }

    public void preprocessAst(AmlTree tree, int depht) throws AmlSemanticException {
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
                String functionName = tree.getText();
                AmlTree previousValue = functionMap.put(functionName, tree);
                if (previousValue != null) {
                    throw new AmlSemanticException("The function " + functionName + " has already been declared.");
                }
                break;
            }
            case MusicLexer.FRAGMENT: {
                String fragmentName = tree.getText();
                AmlTree previousValue = functionMap.put(fragmentName, tree);
                if (previousValue != null) {
                    throw new AmlSemanticException("The fragment " + fragmentName + " has already been declared.");
                }
                break;
            }
            case MusicLexer.SONG:
                if (depht == 0) {
                    //TODO:
                }
                break;
        }

        if (tree.getChildren() == null) return;
        for (AmlTree child : (List<AmlTree>)tree.getChildren()) {
            preprocessAst(child, depht+1);
        }
    }

    public void checkParams(AmlTree params, ArrayList<Data> arguments) {
        //Stub!
        //TODO: THIS
    }

    public void setParams(AmlTree params, ArrayList<Data> arguments) {
        //Stub!
        //TODO: THIS
    }

    public void executeFunction(String functionName, ArrayList<Data> arguments) throws AmlException, IOException {
        AmlTree function = functionMap.get(functionName);
        if (function == null) {
            throw new AmlRunTimeException("The function " + functionName + " is not declared.");
        }
        checkParams(function.getChild(1), arguments);
        setParams(function.getChild(1), arguments);
        executeListInstruction(function.getChild(2));
    }

    public void executeListInstruction(AmlTree tree) throws AmlException, IOException {
        for(AmlTree child : (List<AmlTree>)tree.getChildren()) {
            executeInstruction(child);
        }
    }

    public void executeInstruction(AmlTree tree) throws AmlException, IOException {
        switch(tree.getType()) {
            case MusicLexer.SONG:
                //Crear secuencia
                createSong(tree);
                break;
            default:
                break;
        }
    }

    private void executeMusicInstruction(AmlTree tree) {
        switch (tree.getType()) {
            case MusicLexer.TONE:

                break;
            case MusicLexer.SONG:
                break;
        }
    }

    private void createSong(AmlTree tree) throws IOException, AmlException {
        int[] metric = {4,4};
        int bpm = 120;

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
                    /* TODO: THIS */
                    break;
                case MusicLexer.TRANSPORT:
                    /* TODO: THIS */
                    break;
            }
            songChild = tree.getChild(i++);
        }

        AmlSequence sequence = new AmlSequence(bpm, metric, 0);

        for(i = i-1; i < tree.getChildCount(); ++i) {
            createTrack(tree.getChild(i), sequence);
        }

        File f = new File("midifile.mid");
        MidiSystem.write(sequence.getSequence(),1,f);
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
            for(int j = init; j < tree.getChildCount(); ++j) {
                track.addCompas(createCompas(tree.getChild(j), track));
            }
        }
    }

    public AmlCompas createCompas(AmlTree tree, AmlTrack track) throws AmlMusicException {
        AmlCompas compas = new AmlCompas(track);
        for(AmlTree child : (List<AmlTree>) tree.getChildren()) {
            AmlNote note = createNote(child);
            compas.addNote(note);
        }
        compas.check();
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
                                octave = pitchModifier.getIntValue();
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
        return null;
    }
}
