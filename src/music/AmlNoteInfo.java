package music;

public class AmlNoteInfo {
    private AmlNote.Note note;
    private int octave;
    private int semiToneModifier;
    private static final int defaultOctave = 5;

    public AmlNoteInfo(AmlNote.Note note, int octave, int semiToneModifier) {
        this.note = note;
        this.octave = octave;
        this.semiToneModifier = semiToneModifier;
    }

    @Override
    public String toString() {
        String semiTone;
        if (semiToneModifier > 0) semiTone = "#";
        else if (semiToneModifier < 0) semiTone = "&";
        else semiTone = "";
        String octaveString;
        if (octave == defaultOctave) octaveString = "";
        else octaveString = "-" + octave;
        return semiTone + note.toString() + octaveString;
    }
}
