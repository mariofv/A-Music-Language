package data_structures;

import exceptions.AmlRunTimeException;
import music.AmlTrack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class ChannelManager {

    private ArrayList<LinkedList<IntervalTrack>> channels;
    private AmlList<IntervalTrack> tracks;

    public ChannelManager(int numChannels) {
        channels = new ArrayList<>(numChannels);
        for (int i = 0; i < 16; ++i) channels.add(new LinkedList<>());
        tracks = new AmlList<>();
    }

    private static int nextChannel(int channel) {
        return channel == 8 ? channel+2 : channel+1;
    }

    private void insertTrack(IntervalTrack node) {
        System.out.println("I want to insert " + node + " into");
        System.out.println(toString());
        AmlList<IntervalTrack>.AmlIterator tracksIterator = tracks.listIterator();
        for (; !tracksIterator.isLast(); tracksIterator.next()) {
            IntervalTrack interval = tracksIterator.getElement();
            if (node.start <= interval.start) {
                System.out.println("Stopped at " + interval + " because " + node.start + "<=" + interval.start);
                break;
            }
        }
        tracksIterator.addLeft(node);
        System.out.println("Result:");
        System.out.println(toString());
        System.out.println("-------------------------------------------");
    }

    public void addTrack(int channel, IntervalTrack node) throws AmlRunTimeException {
        if (channel > channels.size()) throw new AmlRunTimeException("Channel usage limit reached");
        ListIterator<IntervalTrack> iterator = channels.get(channel).listIterator();
        while(iterator.hasNext()) {
            IntervalTrack child = iterator.next();
            if (child.intersect(node)) {
                addTrack(nextChannel(channel), node);
                return;
            }
            else if (node.end <= child.start) {
                break;
            }
        }
        node.setChannel(channel);
        insertTrack(node);
        iterator.add(node);
    }

    public void dispatchEvents() {
        for (IntervalTrack interval : tracks) {
            interval.dispatchTrackEvents();
        }
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder("Channel Mannager has this tracks in order\n");
        for (IntervalTrack interval : tracks) {
            string.append(interval).append(" ");
        }
        return string.toString();
    }
}