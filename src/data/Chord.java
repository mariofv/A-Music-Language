package data;

import exceptions.AmlRunTimeException;
import music.AmlChord;
import music.AmlFigure;
import music.AmlNote;

import javax.xml.soap.Text;
import java.util.ArrayList;

public class Chord extends AttributeData {

    public static final String alterQuality =  "alterQuality";
    public static final String alterInterval =  "alterInterval";
    public static final String setAccident = "setAccident";
    public static final String setRoot =  "setRoot";
    public static final String setOctave =  "setOctave";
    public static final String tie =  "tie";
    public static final String untie =  "untie";
    public static final String isTied =  "isTied";

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
    public Data method(String funcName, ArrayList<Data> arguments) throws AmlRunTimeException{
        switch (funcName) {
            case alterQuality:
                String alteration = ((TextVar)arguments.get(0)).getValue();
                return alterQuality(alteration);
            case alterInterval:
                String interval  = ((TextVar)arguments.get(0)).getValue();
                return alterInterval(interval);
            case setRoot:

                break;

        }
        return null;
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

    private Void alterQuality(String alteration) throws AmlRunTimeException {
        switch (alteration) {
            case "Major":
                dataChord.setQuality(AmlChord.Quality.Mayor);
                break;
            case "Minor":
                dataChord.setQuality(AmlChord.Quality.Menor);
                break;
            case "Augmented":
                dataChord.setQuality(AmlChord.Quality.Aumentado);
                break;
            case "Diminuted":
                dataChord.setQuality(AmlChord.Quality.Disminuido);
                break;
        }
        dataChord.constructChord();
        return Void.getInstance();
    }

    private Void alterInterval(String invertal) throws AmlRunTimeException {
        switch (invertal) {
            case "Seventh":
                dataChord.setInterval(AmlChord.Interval.Septima);
                break;
            case "Maj7":
                dataChord.setInterval(AmlChord.Interval.Maj7);
                break;
            case "NoInterval":
                dataChord.setInterval(AmlChord.Interval.NoInterval);
                break;
        }
        dataChord.constructChord();
        return Void.getInstance();
    }
}


