package music;


import aml.Aml;

import java.util.ArrayList;

/**
 * Created by juanm on 28/03/2017.
 */
public class AmlCompas {
    ArrayList<AmlNote> notes;

    private int actualFigures, maxValue;

    public AmlCompas(int maxValue) {
        notes = new ArrayList<>();
        actualFigures = 0;
        this.maxValue = maxValue;
    }

    public boolean addNote(AmlNote note) throws Exception {
        actualFigures += note.getDuration();
        if (actualFigures > maxValue) {
            throw new Exception("The compass is incorrect because you are overflowing the metric.");
        }
        notes.add(note);
        return true;
    }

    public ArrayList<AmlNote> getNotes() {
        return notes;
    }

}
