package music;

import aml.Aml;
import exceptions.AmlMusicException;

import javax.sound.midi.MidiEvent;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static music.AmlFigure.Figure.*;

public class AmlTrack {

    int currentTick;

    private int[] metricArray;
    int metric;
    int channel;
    private int transport;
    AmlFigure lastFigure;
    Track track;
    private AmlInstrument instrument;
    private AmlTone tone;

    public AmlTrack(Track track, int channel, AmlTrack parentTrack) {
        this.track = track;
        metric = parentTrack.metric;
        metricArray = parentTrack.metricArray;
        tone =  parentTrack.getTone().clone();
        this.channel = channel;
        instrument = parentTrack.instrument;
        transport = parentTrack.transport;
        currentTick = parentTrack.currentTick;
        lastFigure = new AmlFigure(Negra, 0, false);

        setInstrument(instrument);
    }

    public AmlTrack(Track track, int tick, int channel, int[] metric, AmlTone tone, int transport, AmlInstrument instrument) {
        this.track = track;
        this.metric = codifyMetric(metric);
        metricArray = metric;
        this.channel = channel;
        this.instrument = instrument;
        currentTick = tick;
        lastFigure = new AmlFigure(Negra, 0, false);
        this.tone = tone;
        this.transport = transport;
        setInstrument(instrument);
    }

    public AmlTrack(){}

    public static int codifyMetric(int[] metric) {
        return metric[0]*AmlFigure.PPQ*4/metric[1];
    }

    public void setMetric(int[] beat) {
        metricArray = beat;
        metric = codifyMetric(beat);
    }

    public AmlTone getTone() {
        return tone;
    }

    public int getLastFigureDuration() {
        return lastFigure.getDuration();
    }

    public void addCompas(AmlCompas compas) throws AmlMusicException {
        for(AmlFigure figure : compas.getFigures()) {
            ArrayList<Integer> noteSortedPitches = (ArrayList<Integer>)figure.getPitches().clone();
            ArrayList<Integer> lastNoteSortedPitches = (ArrayList<Integer>)figure.getPitches().clone();
            Collections.sort(lastNoteSortedPitches);
            Collections.sort(noteSortedPitches);
            if (lastFigure.isTied() && !Arrays.equals(noteSortedPitches.toArray(), lastNoteSortedPitches.toArray())){
                throw new AmlMusicException(
                        "The pitch of two tied figures is different. " +
                        "The notes are:\n" + lastFigure.toString() +
                        "," + figure.toString()
                );
            }
            addOnMessages(figure);
            currentTick += figure.getDuration();
            addOffMessages(figure);
            lastFigure = figure;
        }
    }


    void addOnMessages(AmlFigure figure) {
        if (lastFigure.isTied()) {
            return;
        }
        for (ShortMessage onMessage : figure.getOnMessages(channel)) {
            track.add(new MidiEvent(onMessage, currentTick));
        }
    }

    void addOffMessages(AmlFigure figure) {
        if (figure.isTied()) {
            return;
        }
        for (ShortMessage offMessage : figure.getOffMessages(channel)) {
            track.add(new MidiEvent(offMessage, currentTick));
        }
    }

    public void setInstrument(AmlInstrument instrument) {
        this.instrument = instrument;
        track.add(new MidiEvent(instrument.getMessage(channel), currentTick));
    }

    public void setTone(AmlTone tone) {
        this.tone = tone;
    }

    public Track getTrack() {
        return track;
    }

    public int getMetric() {
        return metric;
    }

    public int[] getMetricArray() {
        return metricArray;
    }

    public int getCurrentTick() {
        return currentTick;
    }

    @Override
    public String toString() {
        return  "Track Details:" + "\n" +
                "=============================" + "\n" +
                "CurrentTick = " + currentTick + "\n" +
                "Metric = " + metric + "\n" +
                "Instrument = " + instrument.toString() + "\n" +
                "Tone = " + tone.toString() + "\n";
    }

    public AmlInstrument getInstrument() {
        return instrument;
    }

    public int getTransport() {
        return transport;
    }

    public void setTransport(int transport) {
        this.transport = transport;
    }
}
