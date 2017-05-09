package music;


import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;

import static music.AmlNote.Figure.Negra;

/**
 * Created by mario.fernandez on 28/04/2017.
 */
public class AmlDrumsTrack extends AmlTrack {

    public AmlDrumsTrack(Track track, int metric) {
        this.track = track;
        try {
            track.add(new MidiEvent(new ShortMessage(ShortMessage.PROGRAM_CHANGE, 9, 0, 0), 0));
        } catch (InvalidMidiDataException e) {
            throw new Error(e);
        }
        this.metric = metric;
        this.channel = 9;
        currentTick = 0;
        lastNote = new AmlDrumNote(Negra, 0, false);
    }


    public AmlDrumsTrack(Track track, AmlTrack parentTrack) {
        this.track = track;
        try {
            track.add(new MidiEvent(new ShortMessage(ShortMessage.PROGRAM_CHANGE, 9, 0, 0), 0));
        } catch (InvalidMidiDataException e) {
            throw new Error(e);
        }
        this.metric = parentTrack.getMetric();
        this.channel = 9;
        currentTick = parentTrack.currentTick;
        lastNote = new AmlDrumNote(Negra, 0, false);
    }
}
