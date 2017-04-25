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
        //Se inicializa a -2 para tener un valor que indique que no hay accidente.
        toneAccidents = new ArrayList<>(Collections.nCopies(7,42));
        lastNoteDuration = track.getLastNoteDuration();
        notes = new ArrayList<>();
        actualTicks = 0;
        ticksPerCompas = track.getMetric();
    }

    public void addNote(AmlNote note) throws AmlMusicException {
        for (int i = 0; i < note.getPitches().size(); ++i) {
            AmlNote.AmlNoteInfo noteInfo = note.getNotes().get(i);
            int index = noteInfo.mapNoteNameInTone();
            switch (noteInfo.getAccident()) {
                case Sustain:
                    toneAccidents.set(index, 1);
                    break;
                case Bemol:
                    toneAccidents.set(index, -1);
                    break;
                case Armor:
                    toneAccidents.set(index, 0);
                    break;
            }

            if (toneAccidents.get(index) != 42 ) {
                note.getPitches().set(i, note.getPitches().get(i) + toneAccidents.get(index));
            }
            else {
                note.getPitches().set(i, note.getPitches().get(i) + track.getToneAccidents().get(index));
            }
        }


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
