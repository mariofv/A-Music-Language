package data_structures;

import music.AmlTrack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class ChannelManager {

    private ArrayList<LinkedList<IntervalTrack>> channels;
    private LinkedList<IntervalTrack> tracks;

    public ChannelManager() {
        channels = new ArrayList<>(16);
        for (int i = 0; i < 16; ++i) channels.add(new LinkedList<>());
        tracks = new LinkedList<>();
    }

    private static int nextChannel(int channel) {
        return channel == 8 ? channel+2 : channel+1;
    }

    public void addTrack(int channel, IntervalTrack node) {
        ListIterator<IntervalTrack> iterator = channels.get(channel).listIterator();
        while(iterator.hasNext()) {
            IntervalTrack child = iterator.next();
            if (child.intersect(node)) {
                if (child.included(node)) {
                    addTrack(nextChannel(channel), node);
                    return;
                }
                else if (node.included(child)) {
                    addTrack(nextChannel(channel), node);
                    return;
                }
                else {
                    addTrack(nextChannel(channel), node);
                    return;
                }
            }
            else if (node.end <= child.start) {
                ListIterator<IntervalTrack> tracksIterator = tracks.listIterator();
                while (tracksIterator.hasNext()) {
                    IntervalTrack interval = tracksIterator.next();
                    if (node.end <= interval.start) break;
                }
                tracksIterator.add(node);
                iterator.add(node);
                return;
            }
        }
        ListIterator<IntervalTrack> tracksIterator = tracks.listIterator();
        while (tracksIterator.hasNext()) {
            IntervalTrack interval = tracksIterator.next();
            if (node.end <= interval.start) break;
        }
        tracksIterator.add(node);
        iterator.add(node);
    }
}