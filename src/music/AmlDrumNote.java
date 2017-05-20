package music;

public class AmlDrumNote extends AmlNote {

    public AmlDrumNote(int pitch) {
        this.pitch = pitch;
    }

    public boolean isSilence() {
        return pitch < 35 || pitch > 81;
    }

    @Override
    public AmlDrumNote clone() {
        return new AmlDrumNote(pitch);
    }
}
