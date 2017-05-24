package music;

import javax.sound.midi.Track;

import java.util.ArrayList;

import static music.AmlFigure.Figure.Negra;

public class AmlDrumsTrack extends AmlTrack {

    public AmlDrumsTrack(Track track, AmlTrack parentTrack) {
        events = new ArrayList<>();
        this.track = track;
        this.metric = parentTrack.getMetric();
        currentTick = parentTrack.currentTick;
        lastFigure = new AmlFigure(Negra, 0, false);
    }
}
