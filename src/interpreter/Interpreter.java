package interpreter;

import java.io.File;
import java.util.List;

import javax.sound.midi.*;

import music.AmlCompas;
import music.AmlNote;
import music.AmlSequence;
import music.AmlTrack;
import parser.MusicLexer;

public class Interpreter {

    public void preprocessAst(AmlTree tree) {
        if (tree.getType() == MusicLexer.FIGURE) tree.setFigureValue(tree.getText());
        else if (tree.getType() == MusicLexer.NOTE) tree.setNoteValue(tree.getText());

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
        metric[0] = Integer.parseInt(tree.getChild(0).getText());
        metric[1] = Integer.parseInt(tree.getChild(1).getText());
        return metric;
    }

    private int createBPM(AmlTree tree) {
        return Integer.parseInt(tree.getChild(0).getText());
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
        AmlNote.Note note = tree.getNoteValude();
        AmlNote.Figure figure = tree.getChild(0).getFigureValue();
        return new AmlNote(note, figure);
    }


}
