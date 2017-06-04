package data;

import exceptions.AmlRunTimeException;
import music.AmlFigure;
import music.AmlNote;

import java.util.ArrayList;
import java.util.Random;

public class Note extends AttributeData {

    public static final String isSilence = "isSilence";
    public static final String isSustain = "isSustain";
    public static final String isBemol = "isBemol";
    public static final String isArmor = "isArmor";
    public static final String isNatural = "isNatural";
    public static final String makeSilence = "makeSilence";
    public static final String randomize = "randomize";
    public static final String setAccident = "accident";

    private AmlNote dataNote;

    public Note() {
        dataNote = null;
    }

    public Note(AmlNote dataNoteValue) {
        dataNote = dataNoteValue;
    }

    @Override
    public AmlNote getValue() {
        if (dataNote == null) {
            throw new NullPointerException();
        }
        return dataNote;
    }

    @Override
    public Data method(String funcName, ArrayList<Data> arguments) throws AmlRunTimeException {
        switch (funcName) {
            case isSilence:
                return new Bool(dataNote.isSilence());
            case isBemol:
                return new Bool(dataNote.getAccident() == AmlNote.Accident.Bemol);
            case isSustain:
                return new Bool(dataNote.getAccident() == AmlNote.Accident.Sustain);
            case isArmor:
                return new Bool(dataNote.getAccident() == AmlNote.Accident.Armor);
            case isNatural:
                return new Bool(dataNote.getAccident() == AmlNote.Accident.Natural);
            case makeSilence:
                makeSilence();
                return Void.getInstance();
            case randomize:
                dataNote = generateRandomNote();
                return Void.getInstance();
            case setAccident:
                String accident = ((TextVar)arguments.get(0)).getValue();
                return setAccident(accident);
        }
        return null;
    }

    private AmlNote generateRandomNote () {
        Random r = new Random();
        int low = 0;
        int high = 9;
        int result = r.nextInt(high-low) + low;
        AmlNote.Note note = AmlNote.Note.values()[result];
        high = 7;
        result = r.nextInt(high-low) + low;
        AmlNote.Accident accident= AmlNote.Accident.values()[result];
        low = 0;
        high = 11;
        int octave = r.nextInt(high-low) + low;
        return new AmlNote(note,accident,octave);
    }

    private void makeSilence(){
        dataNote.setNote(AmlNote.Note.Silence);
        dataNote.setPitch(dataNote.mapNote(dataNote.getNote(),dataNote.getOctave()));
    }

    private Void setAccident(String accident) throws AmlRunTimeException {
        switch (accident) {
            case "#":
                dataNote.setAccident(AmlNote.Accident.Sustain);
                break;
            case "&":
                dataNote.setAccident(AmlNote.Accident.Bemol);
                break;
            case "$":
                dataNote.setAccident(AmlNote.Accident.Armor);
                break;
            case "Natural":
                dataNote.setAccident(AmlNote.Accident.Natural);
                break;
            default:
                throw new AmlRunTimeException("The given parameter is not correct. Please give one of this parameters:\n" +
                        "[#, &, $, Natural]");
        }
    return Void.getInstance();
    }

    @Override
    public void setAttribute(String attribute, Object value) {
        switch (attribute) {
            case "note":
                dataNote = (AmlNote) value;
                break;
            case "pitch":
                dataNote.setPitch((Integer) value);
                break;
            case "accident":
                dataNote.setAccident((String) value);
                break;
            case "octave":
                dataNote.setOctave((Integer) value);
                break;
            default:
                throw new Error("This should never happen!");

        }
    }

    @Override
    public Data getAttributeValue(String attribute) {
        switch (attribute) {
            case "pitch":
                return new Int(dataNote.getPitch());
            case "octave":
                return new Int(dataNote.getOctave());
            default:
                throw new Error("This should never happen!");
        }
    }

    @Override
    public void setValue(Object value) { dataNote = (AmlNote)value; }

    @Override
    public Data clone() {
        return new Note(dataNote.clone());
    }
}
