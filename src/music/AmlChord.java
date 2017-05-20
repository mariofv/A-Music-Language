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

    public void setSemiToneModifier(int semiToneModifier) {
        this.semiToneModifier = semiToneModifier;
    }

    public void setQuality(Quality quality) {
        this.quality = quality;
    }

    public void setInterval(Interval interval) {
        this.interval = interval;
    }

    private int semiToneModifier;
    private Quality quality;
    private Interval interval;

    private int rootPitch;
    private int thirdPitch;
    private int fifthPitch;

    public AmlChord(Note root,  int octave, int semiToneModifier, Quality quality, Interval interval, Figure figure, int figureModifier, boolean tie) {
        super(figure, figureModifier, tie);
        this.root = root;
        this.octave = octave;
        this.semiToneModifier = semiToneModifier;
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
        notes.add(new AmlNote());

        mapQuality();
        pitches.add(rootPitch+thirdPitch);
        notes.add(new AmlNote());
        pitches.add(rootPitch+fifthPitch);
        notes.add(new AmlNote());

        mapInterval();
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
                pitches.add(rootPitch+10);
                break;
            case Maj7:
                pitches.add(rootPitch+11);
                break;
            case NoInterval:
                break;
        }
    }

    @Override
    public AmlChord clone() {
        //TODO: Esto petara por lo mismo que el clone de drumNote
        return (AmlChord) super.clone();
    }

}
