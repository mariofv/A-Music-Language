package music;

public class AmlChord extends AmlNote {

    public enum Quality {
        Mayor,
        Menor,
        Aumentado,
        Disminuido
    }

    public enum Interval {
        Septima,
        Maj7,
        NoInterval,
    }

    private Note root;
    private int octave;

    public void setRoot(Note root) {
        this.root = root;
    }

    public void setOctave(int octave) {
        this.octave = octave;
    }

    public void setAccident(Accident accident) {
        this.accident = accident;
    }

    public void setQuality(Quality quality) {
        this.quality = quality;
    }

    public void setInterval(Interval interval) {
        this.interval = interval;
    }

    private Accident accident;
    private Quality quality;
    private Interval interval;

    private int rootPitch;
    private int thirdPitch;
    private int fifthPitch;
    private int seventhPitch;

    public AmlChord(Note root,  int octave, Accident accident, Quality quality, Interval interval, Figure figure, int figureModifier, boolean tie) {
        super(figure, figureModifier, tie);
        this.root = root;
        this.octave = octave;
        this.accident = accident;
        this.quality = quality;
        this.interval = interval;
        constructChord();
    }

    public AmlChord(Figure figure, int figureModifier, boolean tie) {
        super(figure, figureModifier, tie);
    }

    public void constructChord() {
        rootPitch = mapNote(root, octave);
        pitches.add(rootPitch);
        notes.add(new AmlNoteInfo(root, octave, accident));

        mapQuality();
        pitches.add(rootPitch+thirdPitch);
        Note thirdNote = mapPitch(rootPitch+thirdPitch);
        notes.add(new AmlNoteInfo(thirdNote, octave, accident));
        pitches.add(rootPitch+fifthPitch);
        Note fifthNote = mapPitch(rootPitch+fifthPitch);
        notes.add(new AmlNoteInfo(fifthNote, octave, accident));

        mapInterval();
        if (seventhPitch != -1) {
            pitches.add(rootPitch + seventhPitch);
            Note seventhNote = mapPitch(rootPitch+seventhPitch);
            notes.add(new AmlNoteInfo(seventhNote, octave, accident));
        }
    }

    private void mapQuality() {
        switch(quality) {
            case Mayor:
                thirdPitch = 4;
                fifthPitch = 7;
                break;
            case Aumentado:
                thirdPitch = 4;
                fifthPitch = 8;
                break;
            case Menor:
                thirdPitch = 3;
                fifthPitch = 7;
                break;
            case Disminuido:
                thirdPitch = 3;
                fifthPitch = 6;
                break;
            default:
        }
    }

    private void mapInterval() {
        switch (interval) {
            case Septima:
                seventhPitch = 10;
                break;
            case Maj7:
                seventhPitch = 11;
                break;
            case NoInterval:
                seventhPitch  = -1;
                break;
        }
    }

    @Override
    public AmlChord clone() {
        //TODO: Esto petara por lo mismo que el clone de drumNote
        return (AmlChord) super.clone();
    }

}
