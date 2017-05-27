package music;

import music.AmlNote.Accident;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class AmlChord  extends AmlFigure{

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
    private Accident accident;
    private Quality quality;
    private Interval interval;

    public AmlChord(Figure figure, int figureModifier, boolean tie) {
        super(figure, figureModifier, tie);
    }

    public void constructChord() {
        setChordNotes();
        mapQuality();
        mapInterval();
    }

    private void setChordNotes() {
        switch (root.getNote()) {
            case Do:
                third = new AmlNote(AmlNote.Note.Mi, Accident.Natural, octave);
                fifth = new AmlNote(AmlNote.Note.Sol, Accident.Natural, octave);
                seventh = new AmlNote(AmlNote.Note.Si, Accident.Natural, octave);
                break;
            case Re:
                third = new AmlNote(AmlNote.Note.Fa, Accident.Sustain, octave);
                fifth = new AmlNote(AmlNote.Note.La, Accident.Natural, octave);
                seventh = new AmlNote(AmlNote.Note.Do, Accident.Sustain, octave);
                break;
            case Mi:
                third = new AmlNote(AmlNote.Note.Sol, Accident.Sustain, octave);
                fifth = new AmlNote(AmlNote.Note.Si, Accident.Natural, octave);
                seventh = new AmlNote(AmlNote.Note.Re, Accident.Sustain, octave);
                break;
            case Fa:
                third = new AmlNote(AmlNote.Note.La, Accident.Natural, octave);
                fifth = new AmlNote(AmlNote.Note.Do, Accident.Natural, octave);
                seventh = new AmlNote(AmlNote.Note.Mi, Accident.Natural, octave);
                break;
            case Sol:
                third = new AmlNote(AmlNote.Note.Si, Accident.Natural, octave);
                fifth = new AmlNote(AmlNote.Note.Re, Accident.Natural, octave);
                seventh = new AmlNote(AmlNote.Note.Fa, Accident.Sustain, octave);
                break;
            case La:
                third = new AmlNote(AmlNote.Note.Do, Accident.Sustain, octave);
                fifth = new AmlNote(AmlNote.Note.Mi, Accident.Natural, octave);
                seventh = new AmlNote(AmlNote.Note.Sol, Accident.Sustain, octave);
                break;
            case Si:
                third = new AmlNote(AmlNote.Note.Re, Accident.Sustain, octave);
                fifth = new AmlNote(AmlNote.Note.Fa, Accident.Sustain, octave);
                seventh = new AmlNote(AmlNote.Note.La, Accident.Sustain, octave);
                break;
            default:
                throw new Error("A chord cannot be a silence.");
        }
        if (accident == Accident.Sustain) {
            third.raiseAccident();
            fifth.raiseAccident();
        }
        else if (accident == Accident.Bemol) {
            third.lowerAccident();
            fifth.lowerAccident();
        }
    }

    private void mapQuality() {
        switch(quality) {
            case Aumentado:
                fifth.raiseAccident();
                break;
            case Menor:
                third.lowerAccident();
                break;
            case Disminuido:
                third.lowerAccident();
                fifth.lowerAccident();
                break;
            default:
        }
        notes.add(third);
        notes.add(fifth);
    }

    private void mapInterval() {
        switch (interval) {
            case Septima:
                seventh.lowerAccident();
                break;
            case Maj7:
                break;
            case NoInterval:
                return;
        }
        notes.add(seventh);
    }

    public void setOctave(int octave) {
        this.octave = octave;
    }
    public void setRoot(AmlNote.Note root) {
        this.root = new AmlNote(root, accident, octave);
        notes.add(this.root);
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

    @Override
    public AmlChord clone() {
        AmlChord clone = new AmlChord(figure, figureModifier, tie);
        clone.root = root.clone();
        clone.third = third.clone();
        clone.fifth = fifth.clone();
        clone.octave = octave;
        clone.accident = accident;
        clone.quality = quality;
        clone.interval = interval;
        clone.notes = (ArrayList<AmlNote>)notes.clone();
        return clone;
    }
}
