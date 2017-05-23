package services;

import exceptions.AmlMusicException;
import midi.AmlShortMessage;
import music.AmlTrack;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.ShortMessage;

public abstract class ControlChange {

    public static void setVolume(AmlTrack track,  int volume) throws AmlMusicException{
        try {
            AmlShortMessage message = new AmlShortMessage(ShortMessage.CONTROL_CHANGE,  7, volume);
            track.addEvent(new MidiEvent(message, track.getCurrentTick()));
        } catch (InvalidMidiDataException e) {
            throw new Error(e);
        }
    }
}
