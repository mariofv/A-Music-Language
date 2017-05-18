package data_structures;

import services.ChannelManager;

import java.util.Random;

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

    public static Node createRandomGraph(int numNodes, int seed) {
        Random random = new Random(seed);
        Node graph = new Node();
        for (int i = 0; i < numNodes; ++i) {
            int one = random.nextInt(100);
            int two = random.nextInt(100);
            assert one != two;

            int greater = Math.max(one, two);
            int lesser = Math.min(one, two);

            graph.addChildren(new Node(lesser, greater));
        }
        return graph;
    }

    public static void main(String[] args) throws Exception {
        ChannelManager channelManager = new ChannelManager();
        channelManager.graph = createRandomGraph(6000, 505);
        //System.out.println(channelManager.graph.toString());
        channelManager.graph.checkGraph();
    }
}
