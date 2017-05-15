package music;

import aml.Aml;
import exceptions.AmlMusicException;

import javax.sound.midi.MidiEvent;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static music.AmlNote.Figure.*;

public class AmlTrack {

    int currentTick;

    private int[] metricArray;
    int metric;
    int channel;
    AmlNote lastNote;
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

        currentTick = parentTrack.currentTick;
        lastNote = new AmlNote(Negra, 0, false);

        setInstrument(instrument);
    }

    public AmlTrack(Track track, int tick, int channel, int[] metric, AmlTone tone, AmlInstrument instrument) {
        this.track = track;
        this.metric = codifyMetric(metric);
        metricArray = metric;
        this.channel = channel;
        this.instrument = instrument;
        currentTick = tick;
        lastNote = new AmlNote(Negra, 0, false);
        this.tone = tone;
        setInstrument(instrument);
    }

    public AmlTrack(){}

    public static int codifyMetric(int[] metric) {
        return metric[0]*AmlNote.PPQ*4/metric[1];
    }

    public void setMetric(int[] beat) {
        metricArray = beat;
        metric = codifyMetric(beat);
    }

    public AmlTone getTone() {
        return tone;
    }

    public int getLastNoteDuration() {
        return lastNote.getDuration();
    }

    public void addCompas(AmlCompas compas) throws AmlMusicException {
        for(AmlNote note : compas.getNotes()) {
            ArrayList<Integer> noteSortedPitches = (ArrayList<Integer>)note.getPitches().clone();
            ArrayList<Integer> lastNoteSortedPitches = (ArrayList<Integer>)lastNote.getPitches().clone();
            Collections.sort(lastNoteSortedPitches);
            Collections.sort(noteSortedPitches);
            if (lastNote.isTied() && !Arrays.equals(noteSortedPitches.toArray(), lastNoteSortedPitches.toArray())){
                throw new AmlMusicException(
                        "The pitch of two tied notes is different. " +
                        "The notes are:\n" + lastNote.toString() +
                        "," + note.toString()
                );
            }
            addOnMessage(note);
            currentTick += note.getDuration();
            addOffMessage(note);
            lastNote = note;
        }
    }

    private void addOnMessage(AmlNote note) {
        if (lastNote.isTied()) {
            return;
        }
        for (ShortMessage onMessage : note.getOnMessages(channel)) {
            track.add(new MidiEvent(onMessage, currentTick));
        }
    }

    private void addOffMessage(AmlNote note) {
        if (note.isTied()) {
            return;
        }
        for (ShortMessage offMessage : note.getOffMessages(channel)) {
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

}
