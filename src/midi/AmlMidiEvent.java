package midi;

import javax.sound.midi.MidiEvent;
import javax.sound.midi.MidiMessage;

public class AmlMidiEvent extends MidiEvent {

    private boolean inclusive;
    private String info;

    public AmlMidiEvent(MidiMessage message, long tick, boolean inclusive) {
        super(message, tick);
        this.inclusive = inclusive;
        info = "unknown";
    }

    public AmlMidiEvent(MidiMessage message, long tick, boolean inclusive, String info) {
        super(message, tick);
        this.inclusive = inclusive;
        this.info = info;
    }

    public boolean isInclusive() {
        return inclusive;
    }

    @Override
    public String toString() {
        return "MidiEvent info: " + info + ". It is " + (inclusive ? "":"not ") + "inclusive. Tick: " + getTick();
    }
}
