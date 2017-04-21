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

    public AmlChord(Note root,  int octave, int semiToneModifier, Quality quality, Interval interval) {
        this.root = root;
        this.quality = quality;
        this.octave = octave;
        this.semiToneModifier = semiToneModifier;
        this.interval = interval;
        constructChord();
    }

    private void constructChord() {
        rootPitch = mapNote(root, octave, semiToneModifier);
        pitches.add(rootPitch);

        mapQuality();
        pitches.add(rootPitch+thirdPitch);
        pitches.add(rootPitch+fifthPitch);

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



}
