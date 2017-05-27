package data;

import music.AmlChord;
import music.AmlFigure;

public class Chord extends AttributeData {

    private AmlChord dataChord;

    public Chord(){}

    public Chord(AmlChord dataChordValue) {
        dataChord = dataChordValue;
    }

    @Override
    public AmlChord getValue() {
        return dataChord;
    }

    @Override
    public void setValue(Object value) { dataChord = (AmlChord)value; }

    @Override
    public void setAttribute(String attribute, Object value) {
        switch (attribute) {
            case "duration" :
                dataChord.setDuration((Integer) value);
                break;
            default:
                throw new Error("This should never happen!");
        }
    }

    @Override
    public Data getAttributeValue(String attribute) {
        switch (attribute) {
            case "duration" :
                return new Int(dataChord.getDuration());
            default:
                throw new Error("This should never happen!");
        }
    }

    @Override
    public Data clone() {
        return new Chord(dataChord);
    }
}
