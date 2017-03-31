package music;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.ShortMessage;

public class AmlNote {

    public enum Note {
        Do,Re,Mi,Fa,Sol,La,Si,Silence
    }

    public enum Figure {
        Redonda ,
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
    private int pitch, octave;

    public ShortMessage getOffMessage() throws InvalidMidiDataException {
        return new ShortMessage(ShortMessage.NOTE_OFF, 0, pitch, 100);

    }

    public ShortMessage getOnMessage() throws InvalidMidiDataException {
        return new ShortMessage(ShortMessage.NOTE_ON, 0, pitch, 100);
    }

    public int getDuration() {
        return duration;
    }

    private int duration;


    public AmlNote(Note note, Figure figure, int octave) {
        this.note = note;
        this.figure = figure;
        this.octave = octave;
        duration = mapDuration();
        pitch = mapNote();


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
            case Silence:
            default:
                 return -1;
        }
        return pitch + (octave-5)*12;
    }

    public boolean isSilence() {
        return note == Note.Silence;
    }

    @Override
    public String toString() {
        return "Note " + note + " with figure " + figure;
    }

}
