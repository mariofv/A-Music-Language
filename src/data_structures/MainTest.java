package data_structures;

import services.ChannelManager;

public class MainTest {

    public static Node createGraph() {
        Node graph = new Node();
        graph.addChildren(new Node(1,10));
        graph.addChildren(new Node(5,6));
        graph.addChildren(new Node(1,4));
        graph.addChildren(new Node(2,3));
        return graph;
    }

    public static Node createGraph2() {
        Node graph = new Node();
        graph.addChildren(new Node(6,9));
        graph.addChildren(new Node(1,3));
        graph.addChildren(new Node(1,7));

        return graph;
    }

    public static void main(String[] args) throws Exception {
        ChannelManager channelManager = new ChannelManager();
        channelManager.graph = createGraph2();
        System.out.println(channelManager.graph.toString());
    }
}
