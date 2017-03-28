package music;

import javax.sound.midi.Track;

public class AmlTrack {

    private int currentTick;
    private int[] metric;
    private int tone;
    private Track track;

    public AmlTrack(Track track) {

    }

    public Track getTrack() {
        return track;
    }

    public void setTrack(Track track) {
        this.track = track;
    }

    public int getCurrentTick() {
        return currentTick;
    }

    public void setCurrentTick(int currentTick) {
        this.currentTick = currentTick;
    }

    public int[] getMetric() {
        return metric;
    }

    public void setMetric(int[] metric) {
        this.metric = metric;
    }

    public int getTone() {
        return tone;
    }

    public void setTone(int tone) {
        this.tone = tone;
    }



}
