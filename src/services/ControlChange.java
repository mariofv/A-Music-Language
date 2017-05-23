package services;

import music.AmlTrack;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.ShortMessage;

public abstract class ControlChange {

    public static void setVolume(AmlTrack track, int channel, int volume) {
        try {
            ShortMessage message = new ShortMessage(ShortMessage.CONTROL_CHANGE, channel, 7, volume);
            track.getTrack().add(new MidiEvent(message, track.getCurrentTick()));
        } catch (InvalidMidiDataException e) {
            throw new Error(e);
        }
    }
}
