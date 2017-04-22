package music;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.ShortMessage;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

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

    ArrayList<Integer> pitches;
    private Figure figure;
    private int figureModifier;
    private int duration;
    private boolean tie;

    public ArrayList<ShortMessage> getOffMessages(int channel) {
        ArrayList<ShortMessage> offMessages = new ArrayList<>(pitches.size());
        for (int pitch : pitches ) {
            ShortMessage offMessage = null;
            try {
                offMessage = new ShortMessage(ShortMessage.NOTE_OFF, channel, pitch, 100);
            } catch (InvalidMidiDataException e) {
                e.printStackTrace();
                throw new Error();
            }
            offMessages.add(offMessage);
        }
        return offMessages;
    }

    public ArrayList<ShortMessage> getOnMessages(int channel) {
        ArrayList<ShortMessage> onMessages = new ArrayList<>(pitches.size());
        for (int pitch : pitches ) {
            ShortMessage onMessage = null;
            try {
                onMessage = new ShortMessage(ShortMessage.NOTE_ON, channel, pitch, 100);
            } catch (InvalidMidiDataException e) {
                e.printStackTrace();
                throw new Error();
            }
            onMessages.add(onMessage);
        }
        return onMessages;
    }

    public void addNotePitch(Note noteName, int octave, int semiToneModifier) {
        pitches.add(mapNote(noteName, octave, semiToneModifier));
    }

    public ArrayList<Integer> getSortedPitches() {
        Collections.sort(pitches);
        return pitches;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public boolean isTied() { return tie; }

    public AmlNote(){};

    public AmlNote(Figure figure, int figureModifier, boolean tie) {
        this.figure = figure;
        this.figureModifier = figureModifier;
        this.tie = tie;
        mapDuration();
        pitches = new ArrayList<>();
    }

    private void mapDuration() {
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
                duration = -1;
            default:
                return;
        }
        duration = value + value*figureModifier/2;
    }

    int mapNote(Note note, int octave, int semiToneModifier) {
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

    //TODO: Esta funcion se puede evitar, haciendo que los silencios no se añadan al vector pitches
    public boolean isSilence() {
        return pitches.size() ==  1 && pitches.get(0) == -1;
    }
    public boolean hasFigure() { return figure != Figure.NoFigure; }

    @Override
    public String toString() {
        return pitches.size() + " notes " + " with figure " + figure;
    }

}
