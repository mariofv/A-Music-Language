package music;

import aml.Aml;
import data.Int;

import javax.sound.midi.ShortMessage;
import java.util.ArrayList;

import static music.AmlFigure.Figure.NoFigure;

public class AmlFigure {
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

    Figure figure;
    int figureModifier;
    boolean tie;
    ArrayList<AmlNote> notes;


    private int duration;

    public AmlFigure(Figure figure, int figureModifier, boolean tie) {
        this.figure = figure;
        this.figureModifier = figureModifier;
        this.tie = tie;
        notes = new ArrayList<>();
        computeDuration();
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public ArrayList<AmlNote> getNotes(){return notes;}

    public boolean isTied() { return tie; }

    public static int mapFigureDuration(Figure figure) {
        switch (figure) {
            case Redonda:
                return PPQ*4;
            case Blanca :
                return PPQ*2;
            case Negra :
                return   PPQ;
            case Corchera :
                return   PPQ/2;
            case Semicorchera:
                return PPQ/4;
            case Fusa:
                return PPQ/8;
            case SemiFusa:
                return PPQ/16;
            case NoFigure:
                return -1;
            default:
                throw new Error("This is literally impossible");
        }
    }

    public boolean hasFigure() {
        return figure != NoFigure;
    }


    public static String mapFigureName(Figure figure) {
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

    private void computeDuration() {
        int figureDuration = mapFigureDuration(figure);
        if (duration == -1) return;
        duration = figureDuration + figureDuration*figureModifier/2;
    }

    public void addNote(AmlNote note) {
        notes.add(note);
    }

    public ArrayList<Integer> getPitches() {
        ArrayList<Integer> pitches = new ArrayList<>();
        for (AmlNote note: notes) {
            pitches.add(note.getPitch());
        }
        return pitches;
    }

    public ArrayList<ShortMessage> getOffMessages(int channel) {
        ArrayList<ShortMessage> offMessages = new ArrayList<>();
        for (AmlNote note : notes) {
            if (!note.isSilence()) {
                offMessages.add(note.getOffMessage(channel));
            }
        }
        return offMessages;
    }

    public ArrayList<ShortMessage> getOnMessages(int channel) {
        ArrayList<ShortMessage> onMessages = new ArrayList<>();
        for (AmlNote note : notes) {
            if (!note.isSilence()) {
                onMessages.add(note.getOnMessage(channel));
            }
        }
        return onMessages;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("[");
        builder.append(figure);
        builder.append(":(");
        for (AmlNote note:notes) {
            builder.append(" ");
            builder.append(note.toString());
        }
        builder.append(") ]");
        return builder.toString();
    }

}
