package music;


import aml.Aml;

import java.util.ArrayList;

/**
 * Created by juanm on 28/03/2017.
 */
public class AmlCompas {
    ArrayList<AmlNote> notes;

    private int actualTicks, ticksPerCompas;

    public AmlCompas(int maxValue) {
        notes = new ArrayList<>();
        actualTicks = 0;
        this.ticksPerCompas = maxValue;
    }

    public boolean addNote(AmlNote note) throws Exception {
        actualTicks += note.getDuration();
        if (actualTicks > ticksPerCompas) {
            throw new Exception("The compass is incorrect because you are overflowing the metric.");
        }
        return notes.add(note);
    }

    public AmlNote getFirstNote() {
        return notes.get(0);
    }

    public AmlNote getLastNote() {
        return notes.get(notes.size()-1);
    }

    public ArrayList<AmlNote> getNotes() {
        return notes;
    }

    public boolean check() { return ticksPerCompas == actualTicks; }

    @Override
    public String toString() {
        String message ="Compas notes: \n";

        for (AmlNote note : notes) {
            message += note.toString() + "\n";
        }

        return  message;
    }

}
