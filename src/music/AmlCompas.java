package music;

import exceptions.AmlMusicException;

import java.util.ArrayList;
import java.util.Collections;

public class AmlCompas {
    private AmlTrack track;

    private ArrayList<AmlNote> notes;


    private AmlTone tone;

    private int actualTicks, ticksPerCompas, lastNoteDuration;

    public AmlCompas(AmlTrack track) {
        this.track = track;
        if (track.getClass() != AmlDrumsTrack.class) tone = track.getTone().clone();
        lastNoteDuration = track.getLastNoteDuration();
        notes = new ArrayList<>();
        actualTicks = 0;
        ticksPerCompas = track.getMetric();
    }

    public void addNote(AmlNote note) throws AmlMusicException {
        for (int i = 0; i < note.getPitches().size(); ++i) {
            AmlNote.AmlNoteInfo noteInfo = note.getNotes().get(i);
            tone.alterNote(noteInfo);
            note.getPitches().set(i, note.getPitches().get(i) + tone.getAccident(noteInfo) + track.getTransport());
        }


        if (!note.hasFigure()) note.setDuration(lastNoteDuration);
        actualTicks += note.getDuration();
        if (actualTicks > ticksPerCompas) {
            throw new AmlMusicException("The compass is incorrect because you are overflowing the metric.\n" + toString());
        }
        lastNoteDuration = note.getDuration();
        notes.add(note);
    }

    public void addNote(AmlDrumNote note) throws AmlMusicException {
        if (!note.hasFigure()) note.setDuration(lastNoteDuration);
        actualTicks += note.getDuration();
        if (actualTicks > ticksPerCompas) {
            throw new AmlMusicException("The compass is incorrect because you are overflowing the metric.\n" + toString());
        }
        lastNoteDuration = note.getDuration();
        notes.add(note);
    }

    public void changeTrackTone(AmlTone tone) {
        this.tone = tone.clone();
        track.setTone(tone);
    }

    public void transportTrack(int transport) {
        track.setTransport(transport);
    }

    public void changeTrackBeat(int[] beat) {
        track.setMetric(beat);
        ticksPerCompas = track.getMetric();
    }

    public AmlTrack getTrack() { return track; }

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
        if (ticksPerCompas != actualTicks && actualTicks != 0) {
            throw new AmlMusicException("The duration of the compas is incorrect beacuse it needs more figures. " + ticksPerCompas + " " + actualTicks +"\n" + toString());
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
