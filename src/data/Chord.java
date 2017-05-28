package data;

import music.AmlChord;
import music.AmlFigure;

import java.util.ArrayList;

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
    public Data method(String funcName, ArrayList<Data> arguments) {
        switch (funcName) {
            case "alterMode":

            break;

            case "setRoot":
                break;

        }
    }

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


