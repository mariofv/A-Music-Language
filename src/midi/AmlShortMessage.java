package midi;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.ShortMessage;

public class AmlShortMessage extends ShortMessage {


    public AmlShortMessage(int command, int data1, int data2) throws InvalidMidiDataException {
        super(command, 0, data1, data2);
    }

    public void setChannel(int channel) throws InvalidMidiDataException {
        setMessage(getCommand(), channel, getData1(), getData2());
    }

    @Override
    public AmlShortMessage clone() {
        try {
            return new AmlShortMessage(getCommand(), getData1(), getData2());
        } catch (InvalidMidiDataException e) {
            throw new Error(e);
        }
    }
}
