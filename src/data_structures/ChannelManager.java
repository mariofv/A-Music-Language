package data_structures;

import exceptions.AmlRunTimeException;

public interface ChannelManager {
    void addTrack(IntervalTrack track) throws AmlRunTimeException;
    void dispatchEvents();
}
