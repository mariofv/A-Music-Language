package music;


import data_structures.ChannelManager;
import data_structures.ChannelVectorManager;
import data_structures.IntervalTrack;
import exceptions.AmlRunTimeException;

import javax.sound.midi.*;

import static music.AmlInstrument.Instruments.*;

public class AmlSequence {

    private Sequence sequence;
    private Track referenceTrack;
    private int bpm;
    private ChannelManager channelManager;
    private ChannelManager drumChannelManager;

    public static byte[] intToByteArray(int number) {
        return new byte[]{(byte)(number >>> 16), (byte)(number >>> 8), (byte)number};
    }

    public void saveTrack(AmlTrack track) throws AmlRunTimeException {
        IntervalTrack interval = new IntervalTrack(track);
        if (interval.isCorrect()) {
            track.newInterval();
            channelManager.addTrack(interval);
        }
    }

    public void saveDrumsTrack(AmlDrumsTrack track) throws AmlRunTimeException {
        IntervalTrack interval = new IntervalTrack(track);
        if (interval.isCorrect()) {
            track.newInterval();
            drumChannelManager.addTrack(interval);
        }
    }

    public AmlSequence(int bpm) {
        channelManager = new ChannelVectorManager(15);
        drumChannelManager = new ChannelVectorManager(1);
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
            byte[] number = intToByteArray(60000000 / bpm);
        try {
            tempo = new MetaMessage(0x51, number, 3);
        } catch (InvalidMidiDataException e) {
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
        System.out.println(channelManager);
        System.out.println(drumChannelManager);
        channelManager.dispatchEvents();
        drumChannelManager.dispatchEvents();

        return sequence;
    }

    @Override
    public String toString() {
        return "Bpm: " + bpm;
    }
}
