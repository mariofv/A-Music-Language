package data_structures;

import exceptions.AmlRunTimeException;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class ChannelVectorManager extends ChannelManager {

    private ArrayList<LinkedList<IntervalTrack>> channels;
    private AmlList<IntervalTrack> tracks;

    public ChannelVectorManager(int numChannels) {
        super(numChannels);
        channels = new ArrayList<>(numChannels);
        for (int i = 0; i < numChannels; ++i) channels.add(new LinkedList<IntervalTrack>());
        tracks = new AmlList<>();
    }

    private void insertTrack(IntervalTrack node) {
        System.out.println("I want to insert " + node + " into");
        System.out.println(toString());
        AmlList<IntervalTrack>.AmlIterator tracksIterator = tracks.listIterator();
        while (!tracksIterator.isEnd()) {
            IntervalTrack interval = tracksIterator.getElement();
            if (node.start <= interval.start) {
                System.out.println("Stopped at " + interval + " because " + node.start + "<=" + interval.start);
                break;
            }
            tracksIterator.next();
        }
        tracksIterator.addLeft(node);
        System.out.println("Result:");
        System.out.println(toString());
        System.out.println("-------------------------------------------");
    }

    public void addTrack(IntervalTrack node) throws AmlRunTimeException {
        addTrack(0, node);
    }

    private void addTrack(int channel, IntervalTrack node) throws AmlRunTimeException {
        if (channel >= maxChannels) throw new AmlRunTimeException("Channel usage limit reached");

        ListIterator<IntervalTrack> iterator = channels.get(channel).listIterator();
        while(iterator.hasNext()) {
            IntervalTrack child = iterator.next();
            if (child.intersect(node)) {
                addTrack(channel+1, node);
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