package music;

import exceptions.AmlMusicException;

import java.util.ArrayList;
import java.util.Collections;

public class AmlCompas {
    private AmlTrack track;

    private ArrayList<AmlFigure> figures;


    private AmlTone tone;

    private int actualTicks, ticksPerCompas, lastFigureDuration;

    public AmlCompas(AmlTrack track) {
        this.track = track;
        if (track.getClass() != AmlDrumsTrack.class) tone = track.getTone().clone();
        lastFigureDuration = track.getLastFigureDuration();
        figures = new ArrayList<>();
        actualTicks = 0;
        ticksPerCompas = track.getMetric();
    }

    private void alterNotePitches(AmlFigure figure) {
        for (AmlNote note : figure.getNotes()) {
            if (!note.isSilence() && note.getClass() != AmlDrumNote.class) {
                tone.alterNote(note);
                note.setPitch(note.getPitch() + tone.getAccident(note) + track.getTransport());
            }
        }
    }

    public void addFigure(AmlFigure figure) throws AmlMusicException {
        if (!figure.hasFigure()){
            figure.setDuration(lastFigureDuration);
        }
        alterNotePitches(figure);
        actualTicks += figure.getDuration();
        if (actualTicks > ticksPerCompas) {
            throw new AmlMusicException("The compass is incorrect because you are overflowing the metric.\n" + toString());
        }
        lastFigureDuration = figure.getDuration();

        figures.add(figure);
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

    public int getCurrentTicks() {
        return actualTicks;
    }

    public AmlTrack getTrack() { return track; }

    public AmlTone getTone(){
        return tone;
    }

    public AmlFigure getFirstFigure() {
        return figures.get(0);
    }

    public AmlFigure getLastFigure() {
        return figures.get(figures.size()-1);
    }

    public ArrayList<AmlFigure> getFigures() {
        return figures;
    }

    public void check() throws AmlMusicException {
        if (ticksPerCompas != actualTicks && actualTicks != 0) {
            throw new AmlMusicException("The duration of the compas is incorrect beacuse it needs more figures. " + ticksPerCompas + " " + actualTicks +"\n" + toString());
        }
    }

    @Override
    public String toString() {
        StringBuilder message = new StringBuilder("Compas notes: \n| ");

        for (AmlFigure figure : figures) {
            message.append(figure.toString()).append(" ");
        }

        return message.append(" |").toString();
    }

}
