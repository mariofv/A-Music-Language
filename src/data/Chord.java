package data;

import music.AmlChord;

public class Chord extends Data {

    private AmlChord dataChord;

    public Chord(){}

    public Chord(AmlChord dataChordValue) {
        dataChord = dataChordValue;
    }

    public AmlChord getValue() {
        return dataChord;
    }

    public void setValue(AmlChord value) { dataChord = value; }

    @Override
    public Data clone() {
        return new Chord(dataChord);
    }
}
