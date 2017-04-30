package music;

import exceptions.AmlMusicException;

import javax.sound.midi.MidiEvent;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static music.AmlNote.Figure.*;

public class AmlTrack {

    public static final int FaPos = 0;
    public static final int DoPos = 1;
    public static final int SolPos = 2;
    public static final int RePos = 3;
    public static final int LaPos = 4;
    public static final int MiPos = 5;
    public static final int SiPos = 6;


    protected int currentTick;

    int metric;
    int channel;
    AmlNote lastNote;
    Track track;
    private ArrayList<Integer> toneAccidents;
    private String tone;

    private ArrayList<Integer> computeTone(int tone) {
        ArrayList<Integer> toneAccidents = new ArrayList<>(Collections.nCopies(7,0));
        if (tone >= 0) {
            for (int i = 0; i < tone; ++i) {
                toneAccidents.set(i,1);
            }
            this.tone = tone + " #";
        }
        else {
            for (int i = 0; i < -tone ; ++i) {
                toneAccidents.set(6-i, -1);
            }
            this.tone = -tone + " &";
        }
        return toneAccidents;
    }

    public AmlTrack(){}

    public AmlTrack(Track track, int channel, int metric, int tone) {
        this.track = track;
        this.metric = metric;
        this.toneAccidents = computeTone(tone);
        this.channel = channel;
        currentTick = 0;
        lastNote = new AmlNote(Negra, 0, false);
    }

    public void setToneAccidents(int tone) {
        this.toneAccidents = computeTone(tone);

    }

    public ArrayList<Integer> getToneAccidents() {
        return toneAccidents;
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
