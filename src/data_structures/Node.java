package data_structures;

import aml.Aml;
import music.AmlTrack;
import sun.awt.image.ImageWatched;

import javax.sound.midi.Track;
import java.util.LinkedList;
import java.util.ListIterator;

public class Node {
    private int start, end;

    private AmlTrack track;

    private int depth;
    //private LinkedList<Node> children;
    private AmlList<Node> children;

    public Node(){
        children = new AmlList<>();
    }

    public Node(AmlTrack track) {
        this.track = track;
        start = track.getFirstTick();
        end = track.getCurrentTick();
        children = new AmlList<>();
    }

    public Node (AmlTrack track, int start, int end) {
        this.track = track;
        this.start = start;
        this.end = end;
    }

    public boolean isCorrect() {
        return end-start != 0;
    }

    public boolean intersect(Node node) {
        return !(end <= node.start || node.end <= start);
    }

    public boolean included(Node node) {
        return (start <= node.start && node.end <= end);
    }

    public int getStart(){return start;}

    public int getEnd(){return end;}

    public AmlTrack getTrack() {
        return track;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public  AmlList<Node> getChildren(){ return children;}

    public void addChildren(Node node) {
        LinkedList<Node> childNodes = new LinkedList<>();
        boolean partitioned = false;
        for (AmlList<Node>.Iterator iterator = children.getFirst(); !iterator.end(); iterator.next()) {
            Node child = iterator.getElement();
            if (node.start == node.end) return;
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
                        int start = node.track.getClosest(child.start);
                        Node partition = new Node(node.track, start, node.end);
                        child.addChildren(partition);
                        Node rest = new Node(node.track, node.start, start);
                        addChildren(rest);
                    }
                    else {
                        int end = node.track.getNextClosest(child.end);
                        Node partition = new Node(node.track, node.start, end);
                        child.addChildren(partition);
                        Node rest = new Node(node.track, end, node.end);
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
            if ((start != 0 || end != 0) && (!intersect(child) || !included(child))) {
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

    public int numChildren() {
        return children.size();
    }

    public int size() {
        int sum = 1;
        for (AmlList<Node>.Iterator iterator = children.getFirst(); !iterator.end(); iterator.next()) {
            sum += iterator.getElement().size();
        }
        return sum;
    }

    public int getMaxNumChildren() {
        int max = children.size();
        for (AmlList<Node>.Iterator iterator = children.getFirst(); !iterator.end(); iterator.next()) {
            max = Math.max(iterator.getElement().getMaxNumChildren(), max);
        }
        return max;
    }

    public int getDepth() {
        int maxDepth = 0;
        for (AmlList<Node>.Iterator iterator = children.getFirst(); !iterator.end(); iterator.next()) {
            maxDepth = Math.max(iterator.getElement().getDepth(), maxDepth);
        }
        return maxDepth+1;
    }

    public int getLocalDepth() {
        return depth;
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