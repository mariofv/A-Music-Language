package music;

import exceptions.AmlMusicException;

import java.util.ArrayList;

public class AmlCompas {
    private ArrayList<AmlNote> notes;

    private int actualTicks, ticksPerCompas, lastNoteDuration;

    public AmlCompas(int maxValue, int lastNoteDuration) {
        this.lastNoteDuration = lastNoteDuration;
        notes = new ArrayList<>();
        actualTicks = 0;
        this.ticksPerCompas = maxValue;
    }

    public void addNote(AmlNote note) throws AmlMusicException {
        if (!note.hasFigure()) note.setDuration(lastNoteDuration);
        actualTicks += note.getDuration();
        if (actualTicks > ticksPerCompas) {
            throw new AmlMusicException("The compass is incorrect because you are overflowing the metric.\n" + toString());
        }
        lastNoteDuration = note.getDuration();
        notes.add(note);
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
        StringBuilder message = new StringBuilder("Compas notes: \n");

        for (AmlNote note : notes) {
            message.append(note.toString()).append("\n");
        }

        return message.toString();
    }

}
