package music;

import music.AmlNote.Accident;

public class AmlChord  extends AmlFigure{
/*
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

    private AmlNote root;
    private AmlNote third;
    private AmlNote fifth;
    private AmlNote seventh;


    private int octave;

    public void setOctave(int octave) {
        this.octave = octave;
    }

    public void setRoot(AmlNote.Note root) {
        this.root = new AmlNote(root, accident, octave);
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



    public AmlChord(Figure figure, int figureModifier, boolean tie) {
        super(figure, figureModifier, tie);
    }

    public void constructChord() {
        notes.add(root);
        third = new AmlNote(root.pitch + );
        mapQuality();
        pitches.add(rootPitch+thirdPitch);
        notes.add(mapPitch(rootPitch+thirdPitch));
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
*/
}
