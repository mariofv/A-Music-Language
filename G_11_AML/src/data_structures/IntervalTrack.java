package data_structures;

import music.AmlTrack;

public class IntervalTrack {

    int start;
    int end;

    private AmlTrack track;
    private int channel;

    public IntervalTrack(AmlTrack track) {
        start = track.getFirstTick();
        end = track.getCurrentTick();
        this.track = track;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public boolean isCorrect() {
        return end-start > 0;
    }

    public boolean intersect(IntervalTrack node) {
        return !(end <= node.start || node.end <= start);
    }

    public boolean included(IntervalTrack node) {
        return (start <= node.start && node.end <= end);
    }

    public AmlTrack getTrack() {
        return track;
    }

    public void dispatchTrackEvents() {
        track.addEvents(channel, start, end);
    }

    @Override
    public String toString() {
        return channel +"[" + start + "," + end + "]";
    }
}
