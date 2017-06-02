package music;

import midi.AmlShortMessage;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.ShortMessage;

public class AmlNote {

    public enum Note {
        Do,Re,Mi,Fa,Sol,La,Si,Silence
    }

    public enum Accident {
        Sustain, DoubleSustain, Bemol, DoubleBemol, Natural, Armor
    }

    int pitch;
    Note note;

    public void setNote(Note note) {
        this.note = note;
    }

    public Note getNote() {
        return note;
    }

    public int getOctave() {
        return octave;
    }

    Accident accident;
    private int octave;

    AmlNote(){}

    public AmlNote(Note note, Accident accident, int octave) {
        this.note = note;
        this.accident = accident;
        this.octave = octave;
        pitch = mapNote(note, octave);

    }

    public AmlShortMessage getOffMessage() {
        AmlShortMessage offMessage;
        try {
            offMessage = new AmlShortMessage(ShortMessage.NOTE_OFF, pitch, 100);
        } catch (InvalidMidiDataException e) {
            throw new Error(e);
        }
        return offMessage;
    }

    public AmlShortMessage getOnMessage() {
        AmlShortMessage onMessage;
        try {
            onMessage = new AmlShortMessage(ShortMessage.NOTE_ON, pitch, 100);
        } catch (InvalidMidiDataException e) {
            throw new Error(e);
        }
        return onMessage;
    }

    public int getPitch() {
        return pitch;
    }

    public void setPitch(int pitch) {
        this.pitch = pitch;
    }

    public Accident getAccident() { return  accident;}

    public void setOctave(int octave) { this.octave = octave; }

    public boolean isSilence(){return note == Note.Silence;}

    public int mapNote(Note note, int octave) {
        System.out.println(note + " " + octave);
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
        System.out.println("Default pitch " + pitch + ", returning " + (pitch + (octave-5)*12));
        return pitch + (octave-5)*12;
    }

    public static Note mapPitch(int pitch) {
        switch(pitch%12) {
            case 0:
                return Note.Do;
            case 2:
                return Note.Re;
            case 4:
                return Note.Mi;
            case 5:
                return Note.Fa;
            case 7:
                return Note.Sol;
            case 9:
                return Note.La;
            case 11:
                return Note.Si;
            default:
                throw new Error("This is mathematically impossible: ");
        }
    }

    public void raiseAccident() {
        switch (accident) {
            case Natural:
                accident = Accident.Sustain;
                return;
            case Bemol:
                accident = Accident.Natural;
                return;
            case DoubleBemol:
                accident = Accident.Bemol;
                return;
            case Sustain:
                accident = Accident.DoubleSustain;
                return;
            default:
                throw new Error("The accident is over 9000!");
        }
    }

    public void lowerAccident() {
        switch (accident) {
            case Natural:
                accident = Accident.Bemol;
                return;
            case Bemol:
                accident = Accident.DoubleBemol;
                return;
            case Sustain:
                accident = Accident.Natural;
                return;
            case DoubleSustain:
                accident = Accident.Sustain;
                return;
            default:
                throw new Error("The accident is too low!");
        }
    }

    public void setAccident(String value) {
        accident = Accident.valueOf(value);
    }

    public void setAccident(Accident value) {
        accident = value;
    }


    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(note.toString());
        if (accident == Accident.Sustain) {
            builder.append('#');
        }
        else if (accident == Accident.DoubleSustain) {
            builder.append("##");
        }
        else if (accident == Accident.Bemol) {
            builder.append('&');
        }
        else if (accident == Accident.DoubleBemol) {
            builder.append("&&");
        }
        builder.append("-" + octave);
        return builder.toString();
    }

    @Override
    public AmlNote clone() {
        return new AmlNote(note, accident, octave);
    }


}
