package midi;

import javax.sound.midi.MidiEvent;
import javax.sound.midi.MidiMessage;

public class AmlMidiEvent extends MidiEvent {

    private boolean inclusive;

    public AmlMidiEvent(MidiMessage message, long tick, boolean inclusive) {
        super(message, tick);
        this.inclusive = inclusive;
    }

    public boolean isInclusive() {
        return inclusive;
    }
}
