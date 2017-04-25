package music;

import exceptions.AmlMusicException;

import java.util.ArrayList;
import java.util.Collections;

public class AmlCompas {
    private AmlTrack track;

    private ArrayList<AmlNote> notes;

    private ArrayList<Integer> toneAccidents;

    private int actualTicks, ticksPerCompas, lastNoteDuration;

    public AmlCompas(AmlTrack track) {
        this.track = track;
        toneAccidents = new ArrayList<>(Collections.nCopies(7,0));
        lastNoteDuration = track.getLastNoteDuration();
        notes = new ArrayList<>();
        actualTicks = 0;
        ticksPerCompas = track.getMetric();
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

    public void check() throws AmlMusicException {
        if (ticksPerCompas != actualTicks) {
            throw new AmlMusicException("The duration of the compas is incorrect beacuse it needs more figures.\n" + toString());
        }
    }

    @Override
    public String toString() {
        StringBuilder message = new StringBuilder("Compas notes: \n| ");

        for (AmlNote note : notes) {
            message.append(note.toString()).append(" ");
        }

        return message.append(" |").toString();
    }

}
