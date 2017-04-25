package music;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.ShortMessage;
import java.util.ArrayList;
import java.util.Collections;

public class AmlNote {

    public class AmlNoteInfo {
        private AmlNote.Note noteName;
        private int octave;
        private AmlNote.Accident accident;
        private static final int defaultOctave = 5;

        public AmlNoteInfo(AmlNote.Note note, int octave, AmlNote.Accident accident) {
            this.noteName = note;
            this.octave = octave;
            this.accident = accident;
        }

        public Note getNoteName() {
            return noteName;
        }

        public Accident getAccident() {
            return accident;
        }

        public int mapNoteNameInTone() {
            switch (noteName) {
                case Do:
                    return AmlTrack.DoPos;
                case Re:
                    return AmlTrack.RePos;
                case Mi:
                    return AmlTrack.MiPos;
                case Fa:
                    return AmlTrack.FaPos;
                case Sol:
                    return AmlTrack.SolPos;
                case La:
                    return AmlTrack.LaPos;
                case Si:
                    return AmlTrack.SiPos;
                case Silence:
                    return -1;
            }
            return 0;
        }

        @Override
        public String toString() {
            String accidentSymbol;
            if (accident == AmlNote.Accident.Sustain) accidentSymbol = "#";
            else if (accident == AmlNote.Accident.Bemol) accidentSymbol = "&";
            else if (accident == Accident.Armor) accidentSymbol = "¬";
            else accidentSymbol = "";
            String octaveString;
            if (octave == defaultOctave) octaveString = "";
            else octaveString = "-" + octave;
            return accidentSymbol + noteName.toString() + octaveString;
        }
    }



    public enum Note {
        Do,Re,Mi,Fa,Sol,La,Si,Silence
    }

    public enum Accident {
        Sustain, Bemol, Natural, Armor
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
    ArrayList<AmlNoteInfo> notes;
    private Figure figure;
    private int figureModifier;
    private int duration;
    private boolean tie;

    AmlNote(){}

    public AmlNote(Figure figure, int figureModifier, boolean tie) {
        this.figure = figure;
        this.figureModifier = figureModifier;
        this.tie = tie;
        mapDuration();
        pitches = new ArrayList<>();
        notes = new ArrayList<>();
    }

    public ArrayList<ShortMessage> getOffMessages(int channel) {
        ArrayList<ShortMessage> offMessages = new ArrayList<>(pitches.size());
        for (int pitch : pitches) {
            ShortMessage offMessage;
            try {
                offMessage = new ShortMessage(ShortMessage.NOTE_OFF, channel, pitch, 100);
            } catch (InvalidMidiDataException e) {
                throw new Error(e);
            }
            offMessages.add(offMessage);
        }
        return offMessages;
    }

    public ArrayList<ShortMessage> getOnMessages(int channel) {
        ArrayList<ShortMessage> onMessages = new ArrayList<>(pitches.size());
        for (int pitch : pitches) {
            ShortMessage onMessage;
            try {
                onMessage = new ShortMessage(ShortMessage.NOTE_ON, channel, pitch, 100);
            } catch (InvalidMidiDataException e) {
                throw new Error(e);
            }
            onMessages.add(onMessage);
        }
        return onMessages;
    }

    public void addNotePitch(Note noteName, int octave, Accident accident) {
        if (noteName != Note.Silence) pitches.add(mapNote(noteName, octave));
        notes.add(new AmlNoteInfo(noteName, octave, accident));
    }


    public ArrayList<Integer> getPitches() {
        Collections.sort(pitches);
        return pitches;
    }

    public ArrayList<AmlNoteInfo> getNotes() {
        return notes;
    }



    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }



    public boolean isTied() { return tie; }



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

    int mapNote(Note note, int octave) {
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

    public boolean hasFigure() { return figure != Figure.NoFigure; }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        if (notes.size() > 1) string.append("(");
        for (AmlNoteInfo note : notes) {
            string.append(note.toString());
        }
        if (notes.size() > 1) string.append(")");
        if (figure != Figure.NoFigure) {
            string.append(".").append(mapNoteFigure(figure));
            if (figureModifier != 0) string.append("*");
        }
        if (tie) string.append("~");
        return string.toString();
    }

    public static String mapNoteFigure(Figure figure) {
        switch (figure) {
            case Redonda:
                return "r";
            case Blanca:
                return "b";
            case Negra:
                return "n";
            case Corchera:
                return "c";
            case Semicorchera:
                return "sc";
            case Fusa:
                return "f";
            case SemiFusa:
                return "sf";
            case NoFigure:
        }
        return "";
    }
}
