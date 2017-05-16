package data_structures;

import services.ChannelManager;

/**
 * Created by juanm on 16/05/2017.
 */
public class MainTest {
    public static void main(String[] args) throws Exception {
        ChannelManager channelManager = new ChannelManager();
        channelManager.graph.addChildren(new Node(1,10));
        channelManager.graph.addChildren(new Node(5,6));
        channelManager.graph.addChildren(new Node(1,4));
        channelManager.graph.addChildren(new Node(2,3));
        System.out.println(channelManager.graph.toString());
    }
}
