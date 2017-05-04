package music;

import javax.sound.midi.*;

public class AmlSequence {
    //TODO: MAKE THIS SINGLETON
    private Sequence sequence;
    private boolean first;
    private int bpm;
    private int[] metric;
    private int tone;
    private int actualChannel;

    public static byte[] intToByteArray(int number) {
        return new byte[]{(byte)(number >>> 16), (byte)(number >>> 8), (byte)number};
    }

    public AmlSequence(int bpm, int[] metric, int tone) {
        this.bpm = bpm;
        this.metric = metric;
        this.tone = tone;
        first = true;
        actualChannel = -1;
        try {
            sequence = new Sequence(Sequence.PPQ, AmlNote.PPQ);
        } catch (InvalidMidiDataException e) {
            throw new Error(e);
        }
    }

    public AmlTrack addTrack() {
        Track track = sequence.createTrack();
        if (first) {
            MetaMessage tempo;
            try {
                byte[] number = intToByteArray(60000000 / bpm);
                tempo = new MetaMessage(0x51, number, 3);
            }
            catch (Exception e) {
                throw new Error(e);
            }
            track.add(new MidiEvent(tempo, 0));
        first = false;
        }
        ++actualChannel;
        if (actualChannel == 9) ++actualChannel;
        return new AmlTrack(track, actualChannel, metric[0]*AmlNote.PPQ*4/metric[1], tone);
    }

    public AmlDrumsTrack addDrumsTrack() {
        Track track = sequence.createTrack();
        try {
            return new AmlDrumsTrack(track, metric[0]*AmlNote.PPQ*4/metric[1]);
        } catch (InvalidMidiDataException e) {
            throw new Error(e);
        }
    }

    public Sequence getSequence() {
        return sequence;
    }

    @Override
    public String toString() {
        return "Bpm: " + bpm + ", metric " + metric[0] + ":" + metric[1] + ", tone " + tone + ".";
    }
}
