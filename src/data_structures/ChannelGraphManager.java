package data_structures;

import exceptions.AmlRunTimeException;
import music.AmlTrack;

public class ChannelGraphManager extends ChannelManager {
    private Node root;

    public ChannelGraphManager(int maxChannels) {
        super(maxChannels);
        root = new Node();
    }

    @Override
    public void addTrack(IntervalTrack track) throws AmlRunTimeException {
        Node node = new Node(track.getTrack(), track.start, track.end);
        root.addChildren(node, 0, maxChannels);
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
