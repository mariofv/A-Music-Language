package data_structures;

import aml.Aml;
import exceptions.AmlRunTimeException;
import music.AmlTrack;
import sun.awt.image.ImageWatched;

import javax.sound.midi.Track;
import java.util.LinkedList;
import java.util.ListIterator;

public class Node {
    private int start, end;

    private AmlTrack track;

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
        children = new AmlList<>();
    }

    public boolean isCorrect() {
        return end-start > 0;
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

    public  AmlList<Node> getChildren(){ return children;}

    public void addChildren(Node node, int depth, int maxDepth) throws AmlRunTimeException {
        if (depth > maxDepth) throw new AmlRunTimeException("Channel usage limit reached");

        LinkedList<Node> childNodes = new LinkedList<>();
        boolean addAtEnd = true;
        AmlList<Node>.AmlIterator iterator = children.listIterator();
        while (!iterator.isEnd()) {
            Node child = iterator.getElement();
            if (node.start == node.end) throw new Error("Invalid interval " + node.start + " " + node.end);
            if (child.intersect(node)) {
                if (child.included(node)) {
                    child.addChildren(node, depth+1, maxDepth);
                    return;
                }
                else if (node.included(child)) {
                    iterator.remove();
                    childNodes.add(child);
                    continue;
                }
                else {
                    addAtEnd = false;
                    if (node.end < child.end) {
                        int start = node.track.getClosest(child.start);
                        Node partition = new Node(node.track, start, node.end);
                        child.addChildren(partition, depth+1, maxDepth);
                        Node rest = new Node(node.track, node.start, start);
                        addChildren(rest, depth, maxDepth);
                    }
                    else {
                        int end = node.track.getNextClosest(child.end);
                        Node partition = new Node(node.track, node.start, end);
                        child.addChildren(partition, depth+1, maxDepth);
                        Node rest = new Node(node.track, end, node.end);
                        addChildren(rest, depth, maxDepth);
                    }
                    break;
                }
            }
            else if (node.end <= child.start) {
                addAtEnd = false;
                iterator.addLeft(node);
                break;
            }
            iterator.next();
        }
        if (addAtEnd) children.add(node);
        for (Node node1 : childNodes) {
            addChildren(node1, depth, maxDepth);
        }
    }

    public void checkGraph() throws Exception {
        for (Node child : children) {
            if ((start != 0 || end != 0) && (!intersect(child) || !included(child))) {
                throw new Exception("Node (" + start + "," + end +") has an invalid child: (" + child.start + "," + child.end + ")");
            }
            for (AmlList<Node>.AmlIterator iterator = children.listIterator(); child != iterator.getElement(); iterator.next()) {
                Node child2 = iterator.getElement();
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
        for (Node node : children) {
            sum += node.size();
        }
        return sum;
    }

    public int getMaxNumChildren() {
        int max = children.size();
        for (Node node : children) {
            max = Math.max(node.getMaxNumChildren(), max);
        }
        return max;
    }

    public int getDepth() {
        int maxDepth = 0;
        for (Node node : children) {
            maxDepth = Math.max(node.getDepth(), maxDepth);
        }
        return maxDepth+1;
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