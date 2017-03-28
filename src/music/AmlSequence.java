package music;

import javax.sound.midi.*;

public class AmlSequence {

    private Sequence sequence;
    private boolean first;
    private int bpm;
    private int[] metric;
    private int tone;

    public static byte[] intToByteArray(int number) throws Exception {
        byte num = (byte)(number >>> 24);
        if (num != 0) return new byte[]{num, (byte)(num >>> 16), (byte)(number >>> 8), (byte)number};
        num = (byte)(number >>> 16);
        if (num != 0) return new byte[]{num, (byte)(number >>> 8), (byte)number};
        num = (byte)(number >>> 8);
        if (num != 0) return new byte[]{num, (byte)number};
        num = (byte)number;
        if (num != 0) return new byte[]{num};
        throw new Exception("BPM must be grater than zero!");
        //return new byte[]{(byte)(number >>> 24), (byte)(number >>> 16), (byte)(number >>> 8), (byte)number};
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
                tempo = new MetaMessage(0x51, number, number.length);
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
