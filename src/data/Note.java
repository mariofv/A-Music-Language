package data;

import exceptions.AmlException;
import exceptions.AmlRunTimeException;
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

    /*@Override
    public void setAttribute(String attribute, Object value) {
        switch (attribute) {
            case :

            default:
                throw new Error("This should never happen!");

        }
    }*/

    public void setValue(AmlFigure value) { dataNote = value; }

    @Override
    public Data clone() {
        return new Note(dataNote.clone());
    }
}
