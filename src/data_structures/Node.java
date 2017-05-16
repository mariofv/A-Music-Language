package data_structures;

import javax.sound.midi.Track;
import java.util.LinkedList;

/**
 * Created by juanm on 16/05/2017.
 */
public class Node {
    private int start, end;

    private int channel;

    private LinkedList<Node> children;

    public Node() {
        children = new LinkedList<>();
    }

    public Node(int start, int end) {
        children = new LinkedList<>();
        this.start = start;
        this.end = end;
    }

    public boolean intersect(Node node) {
        return !(end < node.start || node.end < start);
    }

    public boolean included(Node node) {
        return (start <= node.start && node.end <= end);
    }

    public int getStart(){return start;}

    public int getEnd(){return end;}

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public LinkedList<Node> getChildren() {
        return children;
    }

    public void addChildren(Node node) {
        for (Node child: getChildren()) {
            if (child.intersect(node)) {
                if (child.included(node)) {
                    child.addChildren(node);
                    return;
                }
                else if (node.included(child)) {
                    children.remove(child);
                    children.add(node);
                    node.children.add(child);
                    return;
                }
                else {

                }
            }
        }
        children.add(node);
    }

    @Override
    public String toString() {
        return toStringGuay("");
    }

    private String toStringGuay(String identation) {
        StringBuilder builder = new StringBuilder(identation + "NODE [" + start + "," + end + "] with children: \n");
        for (Node n : children) {
            builder.append(n.toStringGuay(identation + "    "));
            builder.append('\n');
        }
        return builder.toString();
    }
}
