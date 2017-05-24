package music;


import data_structures.AmlList;
import data_structures.Node;
import exceptions.AmlRunTimeException;

import javax.sound.midi.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import static music.AmlInstrument.Instruments.*;

public class AmlSequence {

    private Sequence sequence;
    private Track referenceTrack;
    private int bpm;
    private Node tracks;
    private Node drumTracks;


    public static byte[] intToByteArray(int number) {
        return new byte[]{(byte)(number >>> 16), (byte)(number >>> 8), (byte)number};
    }

    public void saveTrack(AmlTrack track) {
        Node n = new  Node(track);
        if (n.isCorrect()) {
            track.newInterval();
            tracks.addChildren(n);
        }
    }

    public void saveDrumsTrack(AmlDrumsTrack track) {
        Node n = new  Node(track);
        if (n.isCorrect()) {
            drumTracks.addChildren(n);
        }
    }

    public AmlSequence(int bpm) {
        tracks = new Node();
        drumTracks = new Node();
        this.bpm = bpm;
        try {
            sequence = new Sequence(Sequence.PPQ, AmlFigure.PPQ);
        } catch (InvalidMidiDataException e) {
            throw new Error(e);
        }
    }

    public void setSpeed(int bpm, int tick) {
        this.bpm = bpm;
        MetaMessage tempo;
        try {
            byte[] number = intToByteArray(60000000 / bpm);
            tempo = new MetaMessage(0x51, number, 3);
        } catch (Exception e) {
            throw new Error(e);
        }
        referenceTrack.add(new MidiEvent(tempo, tick));
    }

    public AmlTrack addFirstTrack() {
        referenceTrack = createTrack();
        return new AmlTrack(referenceTrack,0, new int[]{4,4}, new AmlTone(0), 0, new AmlInstrument(Acoustic_Grand_Piano));
    }

    public AmlTrack addTrack(AmlInstrument instrument, int[] metric, AmlTone tone, int transport, int tick) {
        return new AmlTrack(createTrack(), tick, metric, tone, transport, instrument);
    }

    public AmlTrack addTrack(AmlTrack parentTrack) {
        return new AmlTrack(createTrack(), parentTrack);
    }

    private Track createTrack() {
        return sequence.createTrack();
    }

    public AmlDrumsTrack addDrumsTrack(int[] metric, AmlTrack parentTrack) {
        AmlDrumsTrack track = new AmlDrumsTrack(createTrack(), parentTrack);
        track.setMetric(metric);
        return track;
    }

    public Sequence getSequence() throws  AmlRunTimeException {
        Queue<Node> queue = new LinkedList<>();
        AmlList<Node> children = tracks.getChildren();
        System.out.print(tracks);
        for (AmlList<Node>.Iterator iterator = children.getFirst(); !iterator.end(); iterator.next()) {
            Node child = iterator.getElement();
            child.setDepth(0);
            queue.add(child);
        }
        while (!queue.isEmpty()) {
            Node n = queue.remove();
            n.getTrack().addEvents(n.getLocalDepth(), n.getStart(), n.getEnd());
            children = n.getChildren();
            for (AmlList<Node>.Iterator iterator = children.getFirst(); !iterator.end(); iterator.next()) {
                Node child = iterator.getElement();
                child.setDepth( n.getLocalDepth() == 8 ? n.getLocalDepth() + 2 : n.getLocalDepth()+1);
                if (child.getLocalDepth() >= 16) {
                    throw new AmlRunTimeException("The recursion level of tracks is too damn high!");
                }
                queue.add(child);
            }
        }

        AmlList<Node> childrenDrums = drumTracks.getChildren();
        for (AmlList<Node>.Iterator iterator = childrenDrums.getFirst(); !iterator.end(); iterator.next()) {
            Node child = iterator.getElement();
            child.getTrack().addEvents(9, child.getStart(), child.getEnd());
            if (child.getChildren().size() != 0) {
                throw new AmlRunTimeException("The recursion level of drum tracks is too damn high!");
            }
        }

        return sequence;
    }

    @Override
    public String toString() {
        return "Bpm: " + bpm;
    }
}
