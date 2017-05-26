package data_structures;

import java.util.Random;

public class MainTest {
//
//    public static Node createGraph() {
//        Node graph = new Node();
//        graph.addChildren(new Node(1,10));
//        graph.addChildren(new Node(5,6));
//        graph.addChildren(new Node(1,4));
//        graph.addChildren(new Node(2,3));
//        return graph;
//    }
//
//    public static Node createGraph2() {
//        Node graph = new Node();
//        graph.addChildren(new Node(6,9));
//        graph.addChildren(new Node(1,3));
//        graph.addChildren(new Node(1,7));
//
//        return graph;
//    }
//
//    public static Node createRandomGraph(int numNodes, int seed) {
//        Random random = new Random(seed);
//        Node graph = new Node();
//        for (int i = 0; i < numNodes; ++i) {
//            int one = random.nextInt(50000);
//            int two = random.nextInt(50000);
//            assert one != two;
//
//            int greater = Math.max(one, two);
//            int lesser = Math.min(one, two);
//
//            graph.addChildren(new Node(lesser, greater));
//        }
//        return graph;
//    }
//
//    public static void main(String[] args) throws Exception {
//        ChannelVectorManager channelManager = new ChannelVectorManager();
//        channelManager.graph = createRandomGraph(100, 1);
//        //System.out.println(channelManager.graph.toString());
//        System.out.println(channelManager.graph.numChildren());
//        System.out.println(channelManager.graph.size());
//        System.out.println(channelManager.graph.getMaxNumChildren());
//        System.out.println(channelManager.graph.getDepth());
//        channelManager.graph.checkGraph();
//    }
}
