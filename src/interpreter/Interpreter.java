package interpreter;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.sound.midi.*;

import music.*;
import parser.MusicLexer;

public class Interpreter {

    private HashMap<String, AmlTree> functionMap;
    private HashMap<String, AmlTree> fragmentMap;

    public Interpreter() {
        functionMap = new HashMap<>();
        fragmentMap = new HashMap<>();
    }

    public void preprocessAst(AmlTree tree) throws Exception {
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
                    throw new Exception("The function " + functionName + " has already been declared.");
                }
                break;
            }
            case MusicLexer.FRAGMENT: {
                String fragmentName = tree.getText();
                AmlTree previousValue = functionMap.put(fragmentName, tree);
                if (previousValue != null) {
                    throw new Exception("The fragment " + fragmentName + " has already been declared.");
                }
                break;
            }

            /* TODO: Mirar como buscarlas fuera */
            case MusicLexer.SONG:
                break;

        }

        if (tree.getChildren() == null) return;
        for (AmlTree child : (List<AmlTree>)tree.getChildren()) {
            preprocessAst(child);
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

    public void executeFunction(String functionName, ArrayList<Data> arguments) throws Exception{
        AmlTree function = functionMap.get(functionName);
        if (function == null) {
            throw new Exception("The function " + functionName + " is not declared.");
        }
        checkParams(function.getChild(1), arguments);
        setParams(function.getChild(1), arguments);
        executeListInstruction(function.getChild(2));
    }

    public void executeListInstruction(AmlTree tree) throws Exception {
        for(AmlTree child : (List<AmlTree>)tree.getChildren()) {
            executeInstruction(child);
        }
    }

    public void executeInstruction(AmlTree tree) throws Exception {
        switch(tree.getType()) {
            case MusicLexer.SONG:
                //Crear secuencia
                createSong(tree);
                break;
            default:
                break;
        }
    }

    private void createSong(AmlTree tree) throws Exception {
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

    public void createTrack(AmlTree tree, AmlSequence sequence) throws Exception {
        tree.getChild(0).setInstrumentValue();
        AmlInstrument.Instruments instrumentEnum = tree.getChild(0).getInstrumentValue();


        AmlTrack track = sequence.addTrack();
        AmlInstrument instrument = new AmlInstrument(instrumentEnum);
        track.setInstrument(instrument);

        AmlTree listOfCompas = tree.getChild(1);
        for(AmlTree child : (List<AmlTree>) listOfCompas.getChildren()) {
            track.addCompas(createCompas(child, track.getMetric(), track.getLastNoteDuration()));
        }
    }

    public AmlCompas createCompas(AmlTree tree, int metric, int lastNoteDuration) throws Exception {
        AmlCompas compas = new AmlCompas(metric, lastNoteDuration);
        for(AmlTree child : (List<AmlTree>) tree.getChildren()) {
            AmlNote note = createNote(child);
            compas.addNote(note);
        }
        if (!compas.check()) {
            throw new Exception("The duration of the compas is incorrect!\n" + compas);
        }
        return compas;
    }

    public AmlNote createNote(AmlTree tree) throws Exception {
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

        AmlNote note = new AmlNote(figure, figureModifier, tie);

        /* Loops over the list of notes */
        for (AmlTree noteChild : (List<AmlTree>) noteList.getChildren()) {
            AmlNote.Note noteName = noteChild.getNoteValue();
            int octave = 5;
            int semiToneModifier = 0;

            if (noteChild.getChildren() != null) {
                for (AmlTree pitchModifier : (List<AmlTree>) noteChild.getChildren()) {
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

            note.addNotePitch(noteName, octave, semiToneModifier);
        }


        return note;
    }
}
