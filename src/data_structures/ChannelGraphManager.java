package data_structures;

import exceptions.AmlRunTimeException;
import music.AmlTrack;

import java.util.ArrayList;
//TODO:  VECTOR 16(channels) WITH INTERVALS, IF SOLAPED PONES SI No NO

public class ChannelGraphManager implements ChannelManager {
    private Node root;
    private int maxDepth;

    public ChannelGraphManager(int maxDepth) {
        root = new Node();
        this.maxDepth = maxDepth;
    }

    @Override
    public void addTrack(IntervalTrack track) throws AmlRunTimeException {
        Node node = new Node(track.getTrack(), track.start, track.end);
        root.addChildren(node, -1, maxDepth);
    }

    private void DFS(Node node, int depth) {
        AmlTrack track = node.getTrack();
        track.addEvents(depth, node.getStart(), node.getEnd());

        for (Node child : node.getChildren()) {
            DFS(child, depth+1);
        }
    }

    @Override
    public void dispatchEvents() {
        for (Node child : root.getChildren()) {
            DFS(child, 0);
        }
    }
}
