package data;

import com.sun.org.apache.xpath.internal.operations.Neg;
import exceptions.AmlRunTimeException;
import music.AmlChord;
import music.AmlFigure;
import music.AmlNote;

import javax.xml.soap.Text;
import java.util.ArrayList;

public class Chord extends AttributeData {

    public static final String alterQuality =  "alterQuality";
    public static final String alterInterval =  "alterInterval";
    public static final String setRoot =  "setRoot";
    public static final String setAccident = "setAccident";
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
                AmlNote rootNote = ((Note)arguments.get(0)).getValue();
                return setRoot(rootNote);
            case setAccident:
                String accident = ((TextVar)arguments.get(0)).getValue();
                return setAccident(accident);
            case setOctave:
                int octave = ((Int)arguments.get(0)).getValue();
                if (octave <= 0) throw new AmlRunTimeException("The octave must be a positive integer");
                dataChord.setOctave(octave);
                dataChord.constructChord();
                return Void.getInstance();
            case tie:
                dataChord.setTie(true);
                return Void.getInstance();
            case untie:
                dataChord.setTie(false);
                return Void.getInstance();
            case isTied:
                return new Bool(dataChord.isTied());
            default:
                throw new Error("This should never happen.");
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

    private Void alterQuality(String alteration) throws AmlRunTimeException {
        switch (alteration) {
            case "Major":
                dataChord.setQuality(AmlChord.Quality.Mayor);
                break;
            case "Minor":
                dataChord.setQuality(AmlChord.Quality.Menor);
                break;
            case "+":
                dataChord.setQuality(AmlChord.Quality.Aumentado);
                break;
            case "º":
                dataChord.setQuality(AmlChord.Quality.Disminuido);
                break;
            default:
                throw new AmlRunTimeException("The given parameter is not correct. Please give one of this parameters:\n" +
                                            "[Major, Minor, Augmented, Diminuted]");
        }
        dataChord.constructChord();
        return Void.getInstance();
    }

    private Void alterInterval(String invertal) throws AmlRunTimeException {
        switch (invertal) {
            case "7th":
                dataChord.setInterval(AmlChord.Interval.Septima);
                break;
            case "maj7":
                dataChord.setInterval(AmlChord.Interval.Maj7);
                break;
            case "NoInterval":
                dataChord.setInterval(AmlChord.Interval.NoInterval);
                break;
            default:
                throw new AmlRunTimeException("The given parameter is not correct. Please give one of this parameters:\n" +
                        "[Seventh, Maj7, NoInterval]");
        }
        dataChord.constructChord();
        return Void.getInstance();
    }

    private Void setRoot(AmlNote rootNote) {
        dataChord.setOctave(rootNote.getOctave());
        dataChord.setAccident(rootNote.getAccident());
        dataChord.setRoot(rootNote.getNote());
        dataChord.constructChord();
        return Void.getInstance();
    }

    private Void setAccident(String accident) throws AmlRunTimeException {
        switch (accident) {
            case "#":
                dataChord.setAccident(AmlNote.Accident.Sustain);
                break;
            case "&":
                dataChord.setAccident(AmlNote.Accident.Bemol);
                break;
            case "$":
                dataChord.setAccident(AmlNote.Accident.Armor);
                break;
            case "Natural":
                dataChord.setAccident(AmlNote.Accident.Natural);
                break;
            default:
                throw new AmlRunTimeException("The given parameter is not correct. Please give one of this parameters:\n" +
                        "[#, &, $, Natural]");
        }
        dataChord.constructChord();
        return Void.getInstance();
    }
}


