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

    public AmlDrumsTrack(Track track, int metric) throws InvalidMidiDataException {
        this.track = track;
        track.add(new MidiEvent(new ShortMessage(ShortMessage.PROGRAM_CHANGE, 9, 0, 0), 0));
        this.metric = metric;
        this.channel = 9;
        currentTick = 0;
        lastNote = new AmlDrumNote(Negra, 0, false);
    }


}
