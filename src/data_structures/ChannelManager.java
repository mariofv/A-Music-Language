package data_structures;

import exceptions.AmlRunTimeException;

public abstract class ChannelManager {
    int maxChannels;

    public ChannelManager(int maxChannels) {
        this.maxChannels = maxChannels;
    }

    public abstract void addTrack(IntervalTrack track) throws AmlRunTimeException;
    public abstract void dispatchEvents();
}
