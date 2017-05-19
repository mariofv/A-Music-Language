package data_structures;

import sun.awt.image.ImageWatched;

import javax.sound.midi.Track;
import java.util.LinkedList;
import java.util.ListIterator;

public class Node {
    private int start, end;

    private int channel;

    //private LinkedList<Node> children;
    private AmlList<Node> children;

    public Node() {
        //children = new LinkedList<>();
        start = end = 0;
        children = new AmlList<>();
    }

    public Node(int start, int end) {
        //children = new LinkedList<>();
        children = new AmlList<>();
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

    /*public LinkedList<Node> getChildren() {
        return children;
    }*/

    public void addChildren(Node node) {
        LinkedList<Node> childNodes = new LinkedList<>();
        boolean partitioned = false;
        for (AmlList<Node>.Iterator iterator = children.getFirst(); !iterator.end(); iterator.next()) {
            Node child = iterator.getElement();
            if (node.start == node.end) return;
            //System.out.println("CHILD: " + child.start + "," + child.end);
            //System.out.println("NODE: " + node.start + "," + node.end);
            if (child.intersect(node)) {
                if (child.included(node)) {
                    child.addChildren(node);
                    return;
                }
                else if (node.included(child)) {
                    children.remove(iterator);
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
                    break;
                }
            }
        }
        if (!partitioned) children.add(node);
        for (Node node1 : childNodes) {
            addChildren(node1);
        }
    }

    public void checkGraph() throws Exception {
        for (AmlList<Node>.Iterator iterator = children.getFirst(); !iterator.end(); iterator.next()) {
            Node child = iterator.getElement();
            if ((start != 0 || end != 0) && !intersect(child) && !included(child)) {
                throw new Exception("Node (" + start + "," + end +") has an invalid child: (" + child.start + "," + child.end + ")");
            }
            for (AmlList<Node>.Iterator iterator2 = children.getFirst(); !iterator2.equals(iterator); iterator2.next()) {
                Node child2 = iterator2.getElement();
                if (child.intersect(child2)) {
                    throw new Exception("Node (" + start + "," + end+") has invalid brothers: (" + child.start + "," + child.end + ") (" + child2.start + "," + child2.end);
                }
            }
            child.checkGraph();
        }
    }

    @Override
    public String toString() {
        return toStringGuay("");
    }

    private String toStringGuay(String identation) {
        StringBuilder builder = new StringBuilder(identation + "NODE [" + start + "," + end + "] with children: \n");
        for (AmlList<Node>.Iterator iterator = children.getFirst(); !iterator.end(); iterator.next()) {
            Node n = iterator.getElement();
            builder.append(n.toStringGuay(identation + "    "));
            builder.append('\n');
        }
        return builder.toString();
    }
}