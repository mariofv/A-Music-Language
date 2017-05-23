package music;


import data_structures.AmlList;
import data_structures.Node;

import javax.sound.midi.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import static music.AmlInstrument.Instruments.*;

public class AmlSequence {

    private Sequence sequence;
    private Track referenceTrack;
    private int bpm;
    private int actualChannel;
    private Node tracks;

    public static byte[] intToByteArray(int number) {
        return new byte[]{(byte)(number >>> 16), (byte)(number >>> 8), (byte)number};
    }

    public void saveTrack(AmlTrack track) {
        Node n = new  Node(track);
        if (n.isCorrect()) {
            tracks.addChildren(n);
        }

    }

    public AmlSequence(int bpm) {
        tracks = new Node();
        actualChannel = -1;
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
        return new AmlTrack(referenceTrack,0,  0, new int[]{4,4}, new AmlTone(0), 0, new AmlInstrument(Acoustic_Grand_Piano));
    }

    public AmlTrack addTrack(AmlInstrument instrument, int[] metric, AmlTone tone, int transport, AmlTrack parentTrack) {
        return new AmlTrack(createTrack(), parentTrack.getCurrentTick(), actualChannel, metric, tone, transport, instrument);
    }

    public AmlTrack addTrack(AmlTrack parentTrack) {
        return new AmlTrack(createTrack(), actualChannel, parentTrack);
    }

    private Track createTrack() {
        Track track = sequence.createTrack();
        ++actualChannel;
        if (actualChannel == 9) ++actualChannel;
        return track;
    }

    public AmlDrumsTrack addDrumsTrack(int[] metric, AmlTrack parentTrack) {
        AmlDrumsTrack track = new AmlDrumsTrack(createTrack(), parentTrack);
        track.setMetric(metric);
        return track;
    }

    public Sequence getSequence() {
        int channel = 0;
        System.out.print(tracks);
        LinkedList<Node> queue = new LinkedList<>();
        AmlList<Node> children = tracks.getChildren();
        for (AmlList<Node>.Iterator iterator = children.getFirst(); !iterator.end(); iterator.next()) {
            Node child = iterator.getElement();
            child.setDepth(0);
            queue.push(iterator.getElement());
        }
        while (!queue.isEmpty()) {
            Node n = queue.pop();
            System.out.println(n.getDepth());
            n.getTrack().addEvents(n.getDepth(), n.getStart(), n.getEnd());
            children = n.getChildren();
            for (AmlList<Node>.Iterator iterator = children.getFirst(); !iterator.end(); iterator.next()) {
                Node child = iterator.getElement();
                child.setDepth( n.getDepth() == 8 ? n.getDepth() + 2 : n.getDepth()+1);
                queue.push(child);
            }
        }
        return sequence;
    }

    @Override
    public String toString() {
        return "Bpm: " + bpm;
    }
}
