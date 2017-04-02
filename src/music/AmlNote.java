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
        SemiFusa,
        NoFigure
    }

    public final static  int PPQ = 16;

    private ShortMessage onMessage, offMessage;
    private Note note;
    private Figure figure;
    private int pitch, octave, semiToneModifier, figureModifier;
    private int duration;

    public ShortMessage getOffMessage(int channel) throws InvalidMidiDataException {
        return new ShortMessage(ShortMessage.NOTE_OFF, channel, pitch, 100);
    }

    public ShortMessage getOnMessage(int channel) throws InvalidMidiDataException {
        return new ShortMessage(ShortMessage.NOTE_ON, channel, pitch, 100);
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public AmlNote(Note note, Figure figure, int octave, int semiToneModifier, int figureModifier) {
        this.note = note;
        this.figure = figure;
        this.octave = octave;
        this.semiToneModifier = semiToneModifier;
        this.figureModifier = figureModifier;
        duration = mapDuration();
        pitch = mapNote();
    }

    private int mapDuration() {
        if (figure == null) return 0;
        int value;
        switch (figure) {
            case Redonda:
                value = PPQ*4;
                break;
            case Blanca :
                value =   PPQ*2;
                break;
            case Negra :
                value =   PPQ;
                break;
            case Corchera :
                value =   PPQ/2;
                break;
            case Semicorchera:
                value =   PPQ/4;
                break;
            case Fusa:
                value =   PPQ/8;
                break;
            case SemiFusa:
                value =   PPQ/16;
                break;
            case NoFigure:
            default:
                return -1;
        }
        return value + value*figureModifier/2;
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
        return pitch + (octave-5)*12 + semiToneModifier;
    }

    public boolean isSilence() {
        return note == Note.Silence;
    }
    public boolean hasFigure() { return figure != Figure.NoFigure; }

    @Override
    public String toString() {
        return "Note " + note + " with figure " + figure;
    }

}
