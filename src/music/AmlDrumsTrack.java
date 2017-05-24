package music;


import exceptions.AmlMusicException;
import midi.AmlShortMessage;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static music.AmlFigure.Figure.Negra;

/**
 * Created by mario.fernandez on 28/04/2017.
 */
public class AmlDrumsTrack extends AmlTrack {

    /*public AmlDrumsTrack(Track track, int metric) {
        events = new ArrayList<>();

        this.track = track;
        try {
            events.add(new MidiEvent(new AmlShortMessage(ShortMessage.PROGRAM_CHANGE,  0, 0), 0));
        } catch (InvalidMidiDataException e) {
            throw new Error(e);
        }
        this.metric = metric;
        this.channel = 9;
        currentTick = 0;
        lastFigure = new AmlFigure(Negra, 0, false);
    }*/


    public AmlDrumsTrack(Track track, AmlTrack parentTrack) {
        events = new ArrayList<>();
        this.track = track;
        this.metric = parentTrack.getMetric();
        this.channel = 9;
        currentTick = parentTrack.currentTick;
        lastFigure = new AmlFigure(Negra, 0, false);
    }

}
