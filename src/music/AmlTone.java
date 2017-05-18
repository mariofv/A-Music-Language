package music;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by mario.fernandez on 15/05/2017.
 */
public class AmlTone {

    private static final int FaPos = 0;
    private static final int DoPos = 1;
    private static final int SolPos = 2;
    private static final int RePos = 3;
    private static final int LaPos = 4;
    private static final int MiPos = 5;
    private static final int SiPos = 6;

    private ArrayList<Integer> toneAccidents;
    private String name;
    private int toneNumber;

    private AmlTone(){}

    public AmlTone(int tone) {
        toneNumber = tone;
        computeTone(tone);
    }

    private int mapNoteNameInTone(AmlNote.AmlNoteInfo noteInfo) {
        switch (noteInfo.getNoteName()) {
            case Do:
                return DoPos;
            case Re:
                return RePos;
            case Mi:
                return MiPos;
            case Fa:
                return FaPos;
            case Sol:
                return SolPos;
            case La:
                return LaPos;
            case Si:
                return SiPos;
            case Silence:
                return -1;
        }
        return 0;
    }

    private void computeTone(int tone) {
        toneAccidents = new ArrayList<>(Collections.nCopies(7,0));
        if (tone >= 0) {
            for (int i = 0; i < tone; ++i) {
                toneAccidents.set(i,1);
            }
            this.name = tone + " #";
        }
        else {
            for (int i = 0; i < -tone ; ++i) {
                toneAccidents.set(6-i, -1);
            }
            this.name = -tone + " &";
        }
    }

    public void alterNote(AmlNote.AmlNoteInfo noteInfo) {
        int index = mapNoteNameInTone(noteInfo);
        switch (noteInfo.getAccident()) {
            case Sustain:
                toneAccidents.set(index,  1);
                break;
            case Bemol:
                toneAccidents.set(index,  -1);
                break;
            case Armor:
                toneAccidents.set(index, 0);
                break;
        }
    }

    public int getAccident(AmlNote.AmlNoteInfo noteInfo) {
        int index = mapNoteNameInTone(noteInfo);
        return toneAccidents.get(index);
    }

    @Override
    public AmlTone clone() {
        AmlTone clone = new AmlTone();
        clone.toneAccidents = (ArrayList<Integer>) this.toneAccidents.clone();
        clone.name = this.name;
        clone.toneNumber = this.toneNumber;
        return clone;
    }

    @Override
    public String toString() {
        return name;
    }
}