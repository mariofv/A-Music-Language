package data;

import music.AmlDrumNote;

public class DrumNote extends AttributeData {

    private AmlDrumNote dataDrumNote;

    public DrumNote(){}

    public DrumNote(AmlDrumNote dataDrumNoteValue) {
        dataDrumNote = dataDrumNoteValue;
    }

    public AmlDrumNote getValue() {
        return dataDrumNote;
    }

    public void setValue(AmlDrumNote value) { dataDrumNote = value; }

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