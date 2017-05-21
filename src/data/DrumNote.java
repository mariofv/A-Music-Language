package data;

import music.AmlDrumNote;
import music.AmlFigure;

public class DrumNote extends Data {

    private AmlFigure dataDrumNote;

    public DrumNote(){}

    public DrumNote(AmlFigure dataDrumNoteValue) {
        dataDrumNote = dataDrumNoteValue;
    }

    public AmlFigure getValue() {
        return dataDrumNote;
    }

    public void setValue(AmlFigure value) { dataDrumNote = value; }

    @Override
    public Data clone() {
        return new DrumNote(dataDrumNote.clone());
    }
}