package data;

import music.AmlDrumNote;

public class DrumNote extends AttributeData {

    private AmlDrumNote dataDrumNote;

    public DrumNote(){}

    public DrumNote(AmlDrumNote dataDrumNoteValue) {
        dataDrumNote = dataDrumNoteValue;
    }

    @Override
    public AmlDrumNote getValue() {
        return dataDrumNote;
    }

    @Override
    public void setValue(Object value) { dataDrumNote = (AmlDrumNote)value; }

    @Override
    public void setAttribute(String attribute, Object value) {
        switch (attribute) {
            case "pitch" :
                dataDrumNote.setPitch((Integer) value);
                break;
            default:
                throw new Error("This should never happen!");

        }
    }

    @Override
    public Data clone() {
        return new DrumNote(dataDrumNote.clone());
    }
}