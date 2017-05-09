package music;

import javax.sound.midi.*;

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
        this.bpm = bpm;
        try {
            sequence = new Sequence(Sequence.PPQ, AmlNote.PPQ);
        } catch (InvalidMidiDataException e) {
            throw new Error(e);
        }
    }

    public AmlTrack addTrack(AmlTrack parentTrack) {
        Track track = sequence.createTrack();
        MetaMessage tempo;
        try {
            byte[] number = intToByteArray(60000000 / bpm);
            tempo = new MetaMessage(0x51, number, 3);
        }
        catch (Exception e) {
            throw new Error(e);
        }
        track.add(new MidiEvent(tempo, 0));
        ++actualChannel;
        if (actualChannel == 9) ++actualChannel;
        return new AmlTrack(track, actualChannel, parentTrack);
    }

    public AmlDrumsTrack addDrumsTrack(AmlTrack parentTrack) {
        Track track = sequence.createTrack();
        return new AmlDrumsTrack(track, parentTrack);
    }

    public Sequence getSequence() {
        return sequence;
    }

    @Override
    public String toString() {
        return "Bpm: " + bpm;
    }
}
