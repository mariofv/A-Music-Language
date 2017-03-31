package interpreter;

import java.io.File;
import java.util.List;

import javax.sound.midi.*;

import music.*;
import parser.MusicLexer;

public class Interpreter {

    public void preprocessAst(AmlTree tree) {
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
        }

        if (tree.getChildren() == null) return;
        for (AmlTree child : (List<AmlTree>)tree.getChildren()) {
            preprocessAst(child);
        }
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
                int[] metric = createMetric(tree.getChild(0));
                int bpm = createBPM(tree.getChild(1));
                AmlSequence sequence = new AmlSequence(bpm, metric, 0);
                for(int i =  2; i < tree.getChildCount(); ++i) {
                    AmlTree child  = tree.getChild(i);
                    createTrack(child.getChild(1),sequence);
                }
                File f = new File("midifile.mid");
                MidiSystem.write(sequence.getSequence(),1,f);
                break;
            default:
                break;
        }
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
        AmlTrack track = sequence.addTrack();

        for(AmlTree child : (List<AmlTree>) tree.getChildren()) {
            track.addCompas(createCompas(child, track.getMetric()));
        }
    }

    public AmlCompas createCompas(AmlTree tree, int metric) throws Exception {
        AmlCompas compas = new AmlCompas(metric);
        for(AmlTree child : (List<AmlTree>) tree.getChildren()) {
            compas.addNote(createNote(child));
        }
        if (!compas.check()) {
            throw new Exception("The duration of the compas is incorrect!");
        }
        return compas;
    }

    public AmlNote createNote(AmlTree tree) throws Exception {
        AmlNote.Note note = tree.getNoteValue();
        AmlNote.Figure figure = null;
        int octave = 5;
        for(AmlTree child : (List<AmlTree>) tree.getChildren()) {
            switch (child.getType()) {
                case MusicLexer.FIGURE:
                    figure = child.getFigureValue();
                    break;
                case MusicLexer.NUM:
                    octave = child.getIntValue();
                    break;
            }
        }
        return new AmlNote(note, figure, octave);
    }


}
