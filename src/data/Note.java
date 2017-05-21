package data;

import music.AmlFigure;
import music.AmlNote;

public class Note extends Data {

    private AmlFigure dataNote;

    public Note() {
        dataNote = null;
    }

    public Note(AmlFigure dataNoteValue) {
        dataNote = dataNoteValue;
    }

    public AmlFigure getValue() {
        if (dataNote == null) {
            throw new NullPointerException();
        }
        return dataNote;
    }

    public void setValue(AmlFigure value) { dataNote = value; }

    @Override
    public Data clone() {
        return new Note(dataNote.clone());
    }
}
