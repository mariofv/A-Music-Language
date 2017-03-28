package interpreter;

import java.util.List;

import javax.sound.midi.*;

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
        String noteText = tree.getText();
        int pitch, duration;
        duration = getDuration(tree.getChild(0));
        switch(noteText) {
            case "Do":
                pitch = 60;
                break;
            case "Re":
                pitch = 62;
                break;
            case "Mi":
                pitch = 64;
                break;
            case "Fa":
                pitch = 65;
                break;
            case "Sol":
                pitch = 67;
                break;
            case "La":
                pitch = 69;
                break;
            case "Si":
                pitch = 71;
                break;
            default:
                throw new Exception("This shouldn't happen D: the note is " + noteText);
        }
        ShortMessage onMsg = new ShortMessage();
        onMsg.setMessage(ShortMessage.NOTE_ON, 0,pitch,100);
        ShortMessage offMsg = new ShortMessage();
        offMsg.setMessage(ShortMessage.NOTE_OFF, 0,pitch,100);

        track.add(new MidiEvent(onMsg, actualTick));
        actualTick += duration;
        track.add(new MidiEvent(offMsg, actualTick));
    }

    public int getDuration(AmlTree tree) throws Exception {
        String figure = tree.getText();
        switch (figure) {
            case "r":
                return  NEGRA_DURATION*4;
            case "b" :
                return  NEGRA_DURATION*2;
            case "n" :
                return  NEGRA_DURATION;
            case "c" :
                return  NEGRA_DURATION/2;
            case "sc" :
                return  NEGRA_DURATION/4;
            case "f" :
                return  NEGRA_DURATION/8;
            case "sf" :
                return  NEGRA_DURATION/16;
            default:
                throw new Exception("This shouldn't happen D: the figure is " + figure);
        }
    }

}
