package music;

import javax.sound.midi.*;

public class AmlSequence {

    private Sequence sequence;
    private boolean first;
    private int bpm;
    private int[] metric;
    private int tone;

    public static byte[] intToByteArray(int number) {
        return new byte[]{(byte)(number >>> 16), (byte)(number >>> 8), (byte)number};
    }

    public AmlSequence(int bpm, int[] metric, int tone) {
        this.bpm = bpm;
        this.metric = metric;
        this.tone = tone;
        first = true;
        try {
            sequence = new Sequence(Sequence.PPQ, AmlNote.PPQ);
        } catch (InvalidMidiDataException e) {
            e.printStackTrace();
            throw new Error();
        }
    }

    public AmlTrack addTrack() {
        Track track = sequence.createTrack();
        if (first) {
            MetaMessage tempo;
            try {
                byte[] number = intToByteArray(60000000 / bpm);
                tempo = new MetaMessage(0x51, number, 3);
            } catch (Exception e) {
                e.printStackTrace();
                throw new Error();
            }
            track.add(new MidiEvent(tempo, 0));
            first = false;
        }
        return new AmlTrack(track, metric[0]*AmlNote.PPQ*4/metric[1], tone);
    }

    public Sequence getSequence() {
        return sequence;
    }

    @Override
    public String toString() {
        return "Bpm: " + bpm + ", metric " + metric[0] + ":" + metric[1] + ", tone " + tone + ".";
    }
}
