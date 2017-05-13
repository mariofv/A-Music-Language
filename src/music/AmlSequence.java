package music;

import javax.sound.midi.*;

import static music.AmlInstrument.Instruments.*;

public class AmlSequence {

    private Sequence sequence;
    private Track referenceTrack;
    private int bpm;
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
        return new AmlTrack(referenceTrack,0,  0, 64, 0, new AmlInstrument(Acoustic_Grand_Piano));
    }

    public AmlTrack addTrack(AmlInstrument instrument, int[] metric, int tone, AmlTrack parentTrack) {
        AmlTrack track = new AmlTrack(createTrack(), instrument, actualChannel, parentTrack);
        track.setMetric(metric);
        track.setToneAccidents(tone);
        return track;
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
        return sequence;
    }

    @Override
    public String toString() {
        return "Bpm: " + bpm;
    }
}
