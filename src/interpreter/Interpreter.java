package interpreter;

import java.util.List;

import javax.sound.midi.*;

import music.AmlNote;
import parser.MusicLexer;

public class Interpreter {
    private final static int NEGRA_DURATION = 16;

    private Sequence sequence;
    private int actualTick;

    public Sequence getSequence() {
        return sequence;
    }

    public Interpreter() throws InvalidMidiDataException {
        sequence = new Sequence(Sequence.PPQ, NEGRA_DURATION);
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
                for(AmlTree child : (List<AmlTree>) tree.getChildren()) {
                    actualTick = 0;
                    createTrack(child.getChild(1));
                }
                break;
            default:
                break;
        }
    }

    public void createTrack(AmlTree tree) throws Exception {
        Track track = sequence.createTrack();
        byte[] num = new byte[]{(byte)0x01,(byte)0xe8,(byte)0x48};
        //MetaMessage tempo = new MetaMessage(0x51, num, 3);
        //track.add(new MidiEvent(tempo, 0));
        for(AmlTree child : (List<AmlTree>) tree.getChildren()) {
            addCompas(track, child);

        }
    }

    public void addCompas(Track track, AmlTree tree) throws Exception {
        for(AmlTree child : (List<AmlTree>) tree.getChildren()) {
            addNote(track, child);
        }
    }

    public void addNote(Track track, AmlTree tree) throws Exception {
        AmlNote note = new AmlNote(tree);

        track.add(new MidiEvent(note.getOnMessage(), actualTick));
        actualTick += note.getDuration();
        track.add(new MidiEvent(note.getOffMessage(), actualTick));
    }


}
