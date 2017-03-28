package music;

import interpreter.AmlTree;

import javax.sound.midi.MidiEvent;
import javax.sound.midi.ShortMessage;

public class AmlNote {

    final static  int PPQ = 16;

    private ShortMessage onMessage, offMessage;
    private String noteName, figureName;
    private int pitch;

    public ShortMessage getOffMessage() {
        return offMessage;
    }

    public ShortMessage getOnMessage() {
        return onMessage;
    }

    public int getDuration() {
        return duration;
    }

    private int duration;


    public AmlNote(AmlTree node) throws Exception {
        duration = getDuration(node.getChild(0));
        pitch = mapNote(node);

        onMessage = new ShortMessage();
        onMessage.setMessage(ShortMessage.NOTE_ON, 0, pitch, 100);
        offMessage = new ShortMessage();
        offMessage.setMessage(ShortMessage.NOTE_OFF, 0, pitch, 100);
    }

    private int getDuration(AmlTree node) throws Exception {
        String figure = node.getText();
        switch (figure) {
            case "r":
                figureName = "Redonda";
                return  PPQ*4;
            case "b" :
                figureName = "Blanca";
                return  PPQ*2;
            case "n" :
                figureName = "Negra";
                return  PPQ;
            case "c" :
                figureName = "Corchera";
                return  PPQ/2;
            case "sc" :
                figureName = "Semi-corchera";
                return  PPQ/4;
            case "f" :
                figureName = "Fusa";
                return  PPQ/8;
            case "sf" :
                figureName = "Semi-fusa";
                return  PPQ/16;
            default:
                figureName = "Error";
                throw new Exception("This shouldn't happen D: the figure is " + figure);
        }
    }

    private int mapNote(AmlTree node) throws Exception {
        noteName = node.getText();
        int pitch;
        switch(noteName) {
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
                throw new Exception("This shouldn't happen D: the note is " + noteName);
        }

        return pitch;
    }



    @Override
    public String toString() {
        return "Note " + noteName + " with figure " + figureName;
    }

}
