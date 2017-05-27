package data;

import music.AmlFigure;
import music.AmlNote;

public class Note extends AttributeData {

    private AmlNote dataNote;

    public Note() {
        dataNote = null;
    }

    public Note(AmlNote dataNoteValue) {
        dataNote = dataNoteValue;
    }

    @Override
    public AmlNote getValue() {
        if (dataNote == null) {
            throw new NullPointerException();
        }
        return dataNote;
    }

    @Override
    public void setAttribute(String attribute, Object value) {
        switch (attribute) {
            case "note":
                dataNote = (AmlNote) value;
                break;
            case "pitch":
                dataNote.setPitch((Integer) value);
                break;
            case "accident":
                dataNote.setAccident((String) value);
                break;
            case "octave":
                dataNote.setOctave((Integer) value);
                break;
            default:
                throw new Error("This should never happen!");

        }
    }

    @Override
    public Data getAttributeValue(String attribute) {
        switch (attribute) {
            case "pitch":
                return new Int(dataNote.getPitch());
            case "octave":
                return new Int(dataNote.getOctave());
            default:
                throw new Error("This should never happen!");
        }
    }

    @Override
    public void setValue(Object value) { dataNote = (AmlNote)value; }

    @Override
    public Data clone() {
        return new Note(dataNote.clone());
    }
}
