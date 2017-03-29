package music;

import javax.sound.midi.ShortMessage;

public class AmlNote {

    public enum Note {
        Do,Re,Mi,Fa,Sol,La,Si
    }

    public enum Figure {
        Redonda,
        Blanca,
        Negra,
        Corchera,
        Semicorchera,
        Fusa,
        SemiFusa
    }

    final static  int PPQ = 16;

    private ShortMessage onMessage, offMessage;
    private Note note;
    private Figure figure;
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


    public AmlNote(Note note, Figure figure) throws Exception {
        this.note = note;
        this.figure = figure;
        duration = mapDuration();
        pitch = mapNote();

        onMessage = new ShortMessage();
        onMessage.setMessage(ShortMessage.NOTE_ON, 0, pitch, 100);
        offMessage = new ShortMessage();
        offMessage.setMessage(ShortMessage.NOTE_OFF, 0, pitch, 100);
    }

    private int mapDuration() {
        switch (figure) {
            case Redonda:
                return  PPQ*4;
            case Blanca :
                return  PPQ*2;
            case Negra :
                return  PPQ;
            case Corchera :
                return  PPQ/2;
            case Semicorchera:
                return  PPQ/4;
            case Fusa:
                return  PPQ/8;
            case SemiFusa:
                return  PPQ/16;
            default:
                return PPQ;
        }
    }

    private int mapNote() {
        int pitch;
        switch(note) {
            case Do:
                pitch = 60;
                break;
            case Re:
                pitch = 62;
                break;
            case Mi:
                pitch = 64;
                break;
            case Fa:
                pitch = 65;
                break;
            case Sol:
                pitch = 67;
                break;
            case La:
                pitch = 69;
                break;
            case Si:
                pitch = 71;
                break;
            default:
                 pitch = -1;
        }
        return pitch;
    }

    @Override
    public String toString() {
        return "Note " + note + " with figure " + figure;
    }

}
