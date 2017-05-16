package data;

import music.AmlDrumNote;

public class DrumNote extends Data {

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
    public Data clone() {
        return new DrumNote(dataDrumNote.clone());
    }
}