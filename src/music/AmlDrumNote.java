package music;

import java.util.ArrayList;

/**
 * Created by mario.fernandez on 28/04/2017.
 */
public class AmlDrumNote extends AmlNote {
    public AmlDrumNote(Figure figure, int figureModifier, boolean tie) {
        this.figure = figure;
        this.figureModifier = figureModifier;
        this.tie = tie;
        mapDuration();
        pitches = new ArrayList<>();
    }

    public void addDrumNotePitch(int pitch) {
        if (pitch >= 1) pitches.add(pitch);
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        if (pitches.size() > 1) string.append("(");
        for (int pitch : pitches) {
            string.append(pitch);
        }
        if (pitches.size() > 1) string.append(")");
        if (figure != Figure.NoFigure) {
            string.append(".").append(mapNoteFigure(figure));
            if (figureModifier != 0) string.append("*");
        }
        if (tie) string.append("~");
        return string.toString();
    }
}
