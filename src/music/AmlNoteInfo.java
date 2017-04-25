package music;

public class AmlNoteInfo {
    private AmlNote.Note note;
    private int octave;
    private AmlNote.Accident accident;
    private static final int defaultOctave = 5;

    public AmlNoteInfo(AmlNote.Note note, int octave, AmlNote.Accident accident) {
        this.note = note;
        this.octave = octave;
        this.accident = accident;
    }

    @Override
    public String toString() {
        String semiTone;
        if (accident == AmlNote.Accident.Sustain) semiTone = "#";
        else if (accident == AmlNote.Accident.Bemol) semiTone = "&";
        else semiTone = "";
        String octaveString;
        if (octave == defaultOctave) octaveString = "";
        else octaveString = "-" + octave;
        return semiTone + note.toString() + octaveString;
    }
}
