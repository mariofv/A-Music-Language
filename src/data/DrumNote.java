package data;

import com.sun.corba.se.spi.ior.ObjectKey;
import exceptions.AmlRunTimeException;
import music.AmlDrumNote;

import java.util.ArrayList;
import java.util.Random;

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
        switch (funcName) {
            case makeSilence:
                dataDrumNote.setPitch(-1);
                return Void.getInstance();
            case randomize:
                Random r = new Random(System.currentTimeMillis());
                int random = r.nextInt(44) + 36;
                dataDrumNote.setPitch(random);
            case pam:
                dataDrumNote.setPitch(47);
                return Void.getInstance();
            case bom:
                dataDrumNote.setPitch(36);
                return Void.getInstance();
            case bum:
                dataDrumNote.setPitch(43);
                return Void.getInstance();
            case cling:
                dataDrumNote.setPitch(51);
                return Void.getInstance();
            case tsss:
                dataDrumNote.setPitch(42);
                return Void.getInstance();
            default:
                throw new Error("This should never happen.");
        }
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