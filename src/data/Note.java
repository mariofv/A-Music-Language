package data;

import music.AmlNote;

public class Note extends Data {

    private AmlNote dataNote;

    public Note(){};

    public Note(AmlNote dataNoteValue) {
        dataNote = dataNoteValue;
    }

    public AmlNote getValue() {
        return dataNote;
    }

    public void setValue(AmlNote value) { dataNote = value; }

    @Override
    public Data clone() {
        return new Note(dataNote);
    }
}
