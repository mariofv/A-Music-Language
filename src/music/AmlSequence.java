package music;

import javax.sound.midi.*;

public class AmlSequence {
    private Sequence sequence;
    private int bpm;
    private int[] metric;
    private int tone;

    public static byte[] intToByteArray(int number) {
        return new byte[]{(byte)(number >>> 24), (byte)(number >>> 16), (byte)(number >>> 8), (byte)number};
    }

    public AmlSequence(int bpm, int[] metric, int tone) {
        this.bpm = bpm;
        this.metric = metric;
        this.tone = tone;

        try {
            sequence = new Sequence(Sequence.PPQ, AmlNote.PPQ);
        } catch (InvalidMidiDataException e) {
            e.printStackTrace();
            throw new Error();
        }
    }

    public AmlTrack addTrack() {
        Track track = sequence.createTrack();
        MetaMessage tempo;
        try {
            tempo = new MetaMessage(0x51, intToByteArray(bpm), 4);
        } catch (InvalidMidiDataException e) {
            e.printStackTrace();
            throw new Error();
        }
        track.add(new MidiEvent(tempo, 0));
        return new AmlTrack(track, metric, tone);
    }

}
