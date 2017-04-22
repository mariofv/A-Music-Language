package music;

import exceptions.AmlMusicException;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;

import java.util.Arrays;

import static music.AmlNote.Figure.*;
import static music.AmlNote.Note.*;

public class AmlTrack {

    private int currentTick;

    private int metric;
    private int tone;
    private int channel;
    private AmlNote lastNote;
    private Track track;

    public AmlTrack(Track track, int channel, int metric, int tone) {
        this.track = track;
        this.metric = metric;
        this.tone = tone;
        this.channel = channel;
        currentTick = 0;
        lastNote = new AmlNote(NoFigure, 0, false);
        lastNote.setDuration(AmlNote.PPQ);
    }

    public int getLastNoteDuration() {
        return lastNote.getDuration();
    }

    public void addCompas(AmlCompas compas) throws AmlMusicException {
        for(AmlNote note : compas.getNotes()) {
            if (lastNote.isTied() && !Arrays.equals(lastNote.getSortedPitches().toArray(), note.getSortedPitches().toArray())){
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
        track.add(new MidiEvent(instrument.getMessage(channel), 0));
    }

    public Track getTrack() {
        return track;
    }

    public int getMetric() {
        return metric;
    }

    @Override
    public String toString() {
        return  "Track Details:" + "\n" +
                "=============================" + "\n" +
                "CurrentTick = " + currentTick + "\n" +
                "Metric = " + metric + "\n" +
                "Tone = " + tone + "\n";
    }
}
