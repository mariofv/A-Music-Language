package data_structures;

import sun.awt.image.ImageWatched;

import javax.sound.midi.Track;
import java.util.LinkedList;
import java.util.ListIterator;

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
        return !(end <= node.start || node.end <= start);
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
        LinkedList<Node> childNodes = new LinkedList<>();
        boolean added = false;
        boolean partitioned = false;
        ListIterator<Node> iterator = children.listIterator();
        while (iterator.hasNext()) {
            Node child = iterator.next();
            if (node.start == node.end) return;
            System.out.println("CHILD: " + child.start + "," + child.end);
            System.out.println("NODE: " + node.start + "," + node.end);
            if (child.intersect(node)) {
                if (child.included(node)) {
                    child.addChildren(node);
                    return;
                }
                else if (node.included(child)) {
                    iterator.remove();
                    if (!added) {
                        added = true;
                        children.add(node);
                    }
                    childNodes.add(child);
                }
                else {
                    partitioned = true;
                    if (node.end < child.end) {
                        Node partition = new Node(child.start, node.end);
                        child.addChildren(partition);
                        Node rest = new Node(node.start, child.start);
                        addChildren(rest);
                    }
                    else {
                        Node partition = new Node(node.start, child.end);
                        child.addChildren(partition);
                        Node rest = new Node(child.end, node.end);
                        addChildren(rest);
                    }
                }
            }
        }
        for (Node node1 : childNodes) {
            addChildren(node1);
        }
        if (!partitioned) children.add(node);
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
