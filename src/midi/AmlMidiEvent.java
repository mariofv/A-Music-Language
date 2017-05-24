package midi;

import music.AmlInstrument;

import javax.sound.midi.MidiEvent;
import javax.sound.midi.MidiMessage;

public class AmlMidiEvent extends MidiEvent {

    private boolean inclusive;
    private String info;
    public final static int Instrument = 0;
    public final static int Volume = 1;
    public final static int Other = 2;
    public final static int mustSaveTypes = Other;
    private int type;

    public AmlMidiEvent(MidiMessage message, long tick, boolean inclusive, int type) {
        super(message, tick);
        this.inclusive = inclusive;
        info = "unknown";
    }

    public AmlMidiEvent(MidiMessage message, long tick, boolean inclusive, String info, int type) {
        super(message, tick);
        this.inclusive = inclusive;
        this.info = info;
        this.type = type;
    }

    public boolean isInclusive() {
        return inclusive;
    }

    public boolean mustSave() {
        return type < 2;
    }

    public int getType() {
        return type;
    }

    @Override
    public String toString() {
        return "MidiEvent info: " + info + ". It is " + (inclusive ? "":"not ") + "inclusive. Tick: " + getTick();
    }
}
