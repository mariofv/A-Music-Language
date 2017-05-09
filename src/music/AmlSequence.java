package music;

import javax.sound.midi.*;

import static music.AmlInstrument.Instruments.*;

public class AmlSequence {
    //TODO: MAKE THIS SINGLETON
    private Sequence sequence;
    private int bpm;
    private boolean first;
    private int actualChannel;

    public static byte[] intToByteArray(int number) {
        return new byte[]{(byte)(number >>> 16), (byte)(number >>> 8), (byte)number};
    }

    public AmlSequence(int bpm) {
        actualChannel = -1;
        this.bpm = bpm;
        try {
            sequence = new Sequence(Sequence.PPQ, AmlNote.PPQ);
        } catch (InvalidMidiDataException e) {
            throw new Error(e);
        }
    }

    public void setSpeed(int bpm) {
        this.bpm = bpm;
    }

    public AmlTrack addFirstTrack() {
        Track track = createTrack(0);
        return new AmlTrack(track,0,  0, 64, 0, new AmlInstrument(Acoustic_Grand_Piano));
    }

    public AmlTrack addTrack(int[] metric, int tone, AmlTrack parentTrack) {
        AmlTrack track = new AmlTrack(createTrack(parentTrack.currentTick), actualChannel, parentTrack);
        track.setMetric(metric);
        track.setToneAccidents(tone);
        return track;
    }

    public AmlTrack addTrack(AmlTrack parentTrack) {
        return new AmlTrack(createTrack(parentTrack.currentTick), actualChannel, parentTrack);
    }

    private Track createTrack(int tick) {
        Track track = sequence.createTrack();
        MetaMessage tempo;
        try {
            byte[] number = intToByteArray(60000000 / bpm);
            tempo = new MetaMessage(0x51, number, 3);
        } catch (Exception e) {
            throw new Error(e);
        }
        track.add(new MidiEvent(tempo, tick));
        ++actualChannel;
        if (actualChannel == 9) ++actualChannel;
        return track;
    }

    public AmlDrumsTrack addDrumsTrack(AmlTrack parentTrack) {
        Track track = createTrack(parentTrack.currentTick);
        return new AmlDrumsTrack(track, parentTrack);
    }

    public AmlDrumsTrack addDrumsTrack(int[] metric, AmlTrack parentTrack) {
        AmlDrumsTrack track = new AmlDrumsTrack(createTrack(parentTrack.currentTick), parentTrack);
        track.setMetric(metric);
        return track;
    }

    public Sequence getSequence() {
        return sequence;
    }

    @Override
    public String toString() {
        return "Bpm: " + bpm;
    }
}
