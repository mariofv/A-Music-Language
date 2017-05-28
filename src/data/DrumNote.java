package data;

import com.sun.corba.se.spi.ior.ObjectKey;
import music.AmlDrumNote;

import java.util.ArrayList;

public class DrumNote extends AttributeData {

    public static final String makeSilence = "makeSilence";
    public static final String randomize = "randomize";
    public static final String pam = "pam";
    public static final String bom = "bom";
    public static final String bum = "bum";
    public static final String cling = "cling";
    public static final String tsss = "tsss";


    private AmlDrumNote dataDrumNote;

    public DrumNote(){}

    public DrumNote(AmlDrumNote dataDrumNoteValue) {
        dataDrumNote = dataDrumNoteValue;
    }

    @Override
    public AmlDrumNote getValue() {
        return dataDrumNote;
    }

    @Override
    public void setValue(Object value) { dataDrumNote = (AmlDrumNote)value; }

    @Override
    public Data method(String funcName, ArrayList<Data> arguments) {

        return null;
    }

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
    public Data getAttributeValue(String attribute) {
        switch (attribute) {
            case "pitch" :
                return new Int(dataDrumNote.getPitch());
            default:
                throw new Error("This should never happen!");

        }
    }

    @Override
    public Data clone() {
        return new DrumNote(dataDrumNote.clone());
    }
}