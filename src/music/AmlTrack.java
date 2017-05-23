package music;

import aml.Aml;
import exceptions.AmlMusicException;
import midi.AmlShortMessage;

import javax.sound.midi.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static music.AmlFigure.Figure.*;

public class AmlTrack {

    int firstTick;
    int currentTick;

    private int[] metricArray;
    int metric;

    int channel;
    private int transport;
    AmlFigure lastFigure;
    Track track;
    private AmlInstrument instrument;
    private AmlTone tone;
    ArrayList<MidiEvent> events;


    public AmlTrack(Track track, int channel, AmlTrack parentTrack) {
        events = new ArrayList<>();
        this.track = track;
        metric = parentTrack.metric;
        metricArray = parentTrack.metricArray;
        tone =  parentTrack.getTone().clone();
        this.channel = channel;
        instrument = parentTrack.instrument;
        transport = parentTrack.transport;
        firstTick = currentTick = parentTrack.currentTick;
        lastFigure = new AmlFigure(Negra, 0, false);

        setInstrument(instrument);
    }

    public AmlTrack(Track track, int tick, int channel, int[] metric, AmlTone tone, int transport, AmlInstrument instrument) {
        events = new ArrayList<>();
        this.track = track;
        this.metric = codifyMetric(metric);
        metricArray = metric;
        this.channel = channel;
        this.instrument = instrument;
        firstTick = currentTick = tick;
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

    public int getFirstTick() {
        return firstTick;
    }

    public AmlTone getTone() {
        return tone;
    }

    public int getLastFigureDuration() {
        return lastFigure.getDuration();
    }

    public void addEvent(MidiEvent event) throws AmlMusicException {
        events.add(event);
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


    private void addOnMessages(AmlFigure figure) {
        if (lastFigure.isTied()) {
            return;
        }
        for (ShortMessage onMessage : figure.getOnMessages(channel)) {
            events.add(new MidiEvent(onMessage, currentTick));
        }
    }

    private void addOffMessages(AmlFigure figure) {
        if (figure.isTied()) {
            return;
        }
        for (ShortMessage offMessage : figure.getOffMessages(channel)) {
            events.add(new MidiEvent(offMessage, currentTick));
        }
    }

    public void addEvents(int channel) {
        for (MidiEvent event: events) {
            try {
                ((AmlShortMessage)event.getMessage()).setChannel(channel);
            } catch (InvalidMidiDataException e) {
                throw new Error(e);
            }
            track.add(event);
        }
    }

    public void addEvents(int channel, int start, int end) {
        for (MidiEvent event: events) {
            if (event.getTick() >= start && event.getTick() < end) {
                try {
                    ((AmlShortMessage) event.getMessage()).setChannel(channel);
                } catch (InvalidMidiDataException e) {
                    throw new Error(e);
                }
                track.add(event);
            }
        }
    }

    public void setInstrument(AmlInstrument instrument) {
        this.instrument = instrument;
        events.add(new MidiEvent(instrument.getMessage(), currentTick));
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

    public void setCurrentTick(int tick) {
        firstTick = tick;
        currentTick =  tick;
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

    public int getChannel() {
        return channel;
    }
}
