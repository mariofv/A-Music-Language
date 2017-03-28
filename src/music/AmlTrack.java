package music;

import javax.sound.midi.MidiEvent;
import javax.sound.midi.Track;

public class AmlTrack {

    private int currentTick;

    private int metric;
    private int tone;
    private Track track;

    public AmlTrack(Track track, int metric, int tone) {
        this.track = track;
        this.metric = metric;
        this.tone = tone;
        currentTick = 0;
    }

    public void addCompas(AmlCompas compas) {
        for(AmlNote note : compas.getNotes()){
            track.add(new MidiEvent(note.getOnMessage(), currentTick));
            currentTick += note.getDuration();
            track.add(new MidiEvent(note.getOffMessage(), currentTick));
        }
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
