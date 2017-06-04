package music;

import midi.AmlMidiEvent;
import midi.AmlShortMessage;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;

import java.util.ArrayList;
import java.util.Collections;

import static music.AmlFigure.Figure.Negra;

public class AmlDrumsTrack extends AmlTrack {

    public AmlDrumsTrack(Track track, AmlTrack parentTrack) {
        events = new ArrayList<>();
        this.track = track;
        this.metric = parentTrack.getMetric();
        setCurrentTick(parentTrack.getCurrentTick());
        lastFigure = new AmlFigure(Negra, 0, false);
        tone = new AmlTone(0);
        try {
            lastVolume = new AmlShortMessage(ShortMessage.CONTROL_CHANGE, 7, 100);
            if (channelVolume == null) {
                channelVolume = new ArrayList<>(Collections.nCopies(1, new AmlShortMessage(ShortMessage.CONTROL_CHANGE, 7, 100)));
            }
        } catch (InvalidMidiDataException e) {
            throw new Error(e);
        }
    }

    @Override
    int mapChannel(int channel) {
        return 9;
    }

    public void addEvents(int channel, int start, int end) {
        //System.out.println("Adding drum events in interval " + start + " " + end + " on channel " + mapChannel(channel));

        check(channel, start, lastVolume, channelVolume);

        for (AmlMidiEvent event : events) {
            if (isInsideInterval(event, start, end)) {
                switch (event.getType()) {
                    case AmlMidiEvent.Volume:
                        lastVolume = ((AmlShortMessage) event.getMessage()).clone();
                        break;
                }
                try {
                    //System.out.println("Setting event " + event);
                    ((AmlShortMessage) event.getMessage()).setChannel(mapChannel(channel));
                } catch (InvalidMidiDataException e) {
                    throw new Error(e);
                }
                track.add(event);
            }
        }
    }
}
