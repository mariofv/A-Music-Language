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
        tone = track.getTone().clone();
        lastFigureDuration = track.getLastFigureDuration();
        figures = new ArrayList<>();
        actualTicks = 0;
        ticksPerCompas = track.getMetric();
    }

    private void alterNotePitches(AmlFigure figure) {
        for (AmlNote note : figure.getNotes()) {
            if (!note.isSilence() && !(note instanceof AmlDrumNote)) {
                tone.alterNote(note);
                note.setPitch(note.getPitch() + tone.getAccident(note) + track.getTransport());
            }
        }
    }

    public void addFigure(AmlFigure figure) throws AmlMusicException {
        if (!figure.hasFigure()) {
            figure.setDuration(lastFigureDuration);
        }
        alterNotePitches(figure);
        actualTicks += figure.getDuration();
        if (actualTicks > ticksPerCompas) {
            throw new AmlMusicException("The compass is incorrect because you are overflowing the metric.\n" + toString());
        }
        lastFigureDuration = figure.getDuration();

        figures.add(figure);
        track.addFigure(figure);
    }

    public void changeTrackTone(AmlTone tone) {
        this.tone = tone.clone();
        track.setTone(tone);
    }

    public AmlTrack getTrack() { return track; }

    public AmlTone getTone(){
        return tone;
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
