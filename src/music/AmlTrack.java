package music;

import aml.Aml;
import data_structures.Interval;
import exceptions.AmlMusicException;
import midi.AmlMidiEvent;
import midi.AmlShortMessage;

import javax.sound.midi.*;

import java.util.*;

import static music.AmlFigure.Figure.*;

public class AmlTrack {

    private int firstTick;
    int currentTick;

    private int[] metricArray;
    int metric;

    private int transport;
    AmlFigure lastFigure;
    Track track;
    private AmlInstrument instrument;
    private AmlTone tone;
    ArrayList<AmlMidiEvent> events;
    private Deque<Interval> intervals;

    public AmlTrack(Track track, AmlTrack parentTrack) {
        events = new ArrayList<>();
        this.track = track;
        metric = parentTrack.metric;
        metricArray = parentTrack.metricArray;
        tone =  parentTrack.getTone().clone();
        instrument = parentTrack.instrument;
        transport = parentTrack.transport;
        lastFigure = new AmlFigure(Negra, 0, false);
        intervals = new LinkedList<>();

        setCurrentTick(parentTrack.currentTick);
        setInstrument(instrument);
    }

    public AmlTrack(Track track, int tick, int[] metric, AmlTone tone, int transport, AmlInstrument instrument) {
        events = new ArrayList<>();
        this.track = track;
        this.metric = codifyMetric(metric);
        metricArray = metric;
        this.instrument = instrument;
        lastFigure = new AmlFigure(Negra, 0, false);
        this.tone = tone;
        this.transport = transport;
        intervals = new LinkedList<>();

        setCurrentTick(tick);
        setInstrument(instrument);
    }

    AmlTrack(){}

    public static int codifyMetric(int[] metric) {
        return metric[0]*AmlFigure.PPQ*4/metric[1];
    }

    public void setMetric(int[] beat) {
        metricArray = beat;
        metric = codifyMetric(beat);
    }

    public int getFirstTick() {
        return firstTick;
    }

    public AmlTone getTone() {
        return tone;
    }

    public int getLastFigureDuration() {
        return lastFigure.getDuration();
    }

    public void addEvent(AmlMidiEvent event) throws AmlMusicException {
        events.add(event);
    }

    public void addCompas(AmlCompas compas) throws AmlMusicException {
        for(AmlFigure figure : compas.getFigures()) {
            addFigure(figure);
        }
    }

    public void addFigure(AmlFigure figure) throws AmlMusicException {
        ArrayList<Integer> noteSortedPitches = (ArrayList<Integer>)figure.getPitches().clone();
        ArrayList<Integer> lastNoteSortedPitches = (ArrayList<Integer>)figure.getPitches().clone();
        Collections.sort(lastNoteSortedPitches);
        Collections.sort(noteSortedPitches);
        if (lastFigure.isTied() && !Arrays.equals(noteSortedPitches.toArray(), lastNoteSortedPitches.toArray())){
            throw new AmlMusicException(
                    "The pitch of two tied figures is different. " +
                            "The notes are:\n" + lastFigure.toString() +
                            "," + figure.toString()
            );
        }
        addOnMessages(figure);
        currentTick += figure.getDuration();
        addOffMessages(figure);
        lastFigure = figure;
    }

    private void addOnMessages(AmlFigure figure) {
        if (lastFigure.isTied()) {
            return;
        }
        for (ShortMessage onMessage : figure.getOnMessages()) {
            events.add(new AmlMidiEvent(onMessage, currentTick, false, "OnMessage", AmlMidiEvent.Other));
        }
    }

    private void addOffMessages(AmlFigure figure) {
        if (figure.isTied()) {
            return;
        }
        for (ShortMessage offMessage : figure.getOffMessages()) {
            events.add(new AmlMidiEvent(offMessage, currentTick, true, "OffMessage", AmlMidiEvent.Other));
        }
    }

    private ArrayList<AmlMidiEvent> lastEvent = new ArrayList<>(Collections.nCopies(AmlMidiEvent.mustSaveTypes, null));

    private static boolean isInsideInterval(AmlMidiEvent event, int start, int end) {
        return (event.getTick() == start && !event.isInclusive()) || (event.getTick() > start && event.getTick() < end) || (event.getTick() == end && event.isInclusive());
    }

    public void addEvents(int channel, int start, int end) {
        System.out.println("Adding events in interval " + start + " " + end + " on channel " + channel);
        //Interval firstInterval = intervals.getFirst();
        for (AmlMidiEvent event : lastEvent) {
            if (event != null) {
                try {
                    ((AmlShortMessage) event.getMessage()).setChannel(channel);
                } catch (InvalidMidiDataException e) {
                    throw new Error(e);
                }
                event.setTick(start);
                System.out.println("Setting initial event " + event);
                if (!track.add(event)) throw new Error("Event " + event + " is repeated");
            }
        }
        for (AmlMidiEvent event : events) {
            if (isInsideInterval(event, start, end)) {
                if (event.mustSave()) {
                    lastEvent.set(event.getType(), event.clone());
                }
                try {
                    System.out.println("Setting event " + event);
                    ((AmlShortMessage) event.getMessage()).setChannel(channel);
                } catch (InvalidMidiDataException e) {
                    throw new Error(e);
                }
                track.add(event);
            }
        }
    }

    public void setInstrument(AmlInstrument instrument) {
        this.instrument = instrument;
        events.add(new AmlMidiEvent(instrument.getMessage(), currentTick, false, "Instrument", AmlMidiEvent.Instrument));
    }

    public void setTone(AmlTone tone) {
        this.tone = tone;
    }

    public Track getTrack() {
        return track;
    }

    public int getMetric() {
        return metric;
    }

    public int[] getMetricArray() {
        return metricArray;
    }

    public int getCurrentTick() {
        return currentTick;
    }

    public void setCurrentTick(int tick) {
        firstTick = tick;
        currentTick =  tick;
    }

    @Override
    public String toString() {
        return  "Track Details:" + "\n" +
                "=============================" + "\n" +
                "CurrentTick = " + currentTick + "\n" +
                "Metric = " + metric + "\n" +
                "Instrument = " + instrument.toString() + "\n" +
                "Tone = " + tone.toString() + "\n";
    }

    public AmlInstrument getInstrument() {
        return instrument;
    }

    public int getTransport() {
        return transport;
    }

    public void setTransport(int transport) {
        this.transport = transport;
    }

    private static MidiEvent dummy = new MidiEvent(null, 0);

    public int getClosest(int start) {
        Comparator<MidiEvent> comparator = (o1, o2) -> Long.compareUnsigned(o1.getTick(), o2.getTick());
        dummy.setTick(start);
        int indexFound = Collections.binarySearch(events, dummy, comparator);
        if (indexFound < 0) {
            indexFound = -indexFound;
            while (events.get(indexFound).getTick() > start) --indexFound;
            System.out.println(events.get(indexFound));
        }
        return (int)events.get(indexFound).getTick();
    }

    public int getNextClosest(int end) {
        Comparator<MidiEvent> comparator = (o1, o2) -> Long.compareUnsigned(o1.getTick(), o2.getTick());
        dummy.setTick(end);
        int indexFound = Collections.binarySearch(events, dummy, comparator);
        if (indexFound < 0) indexFound = -indexFound;
        return (int)events.get(indexFound).getTick();
    }

    void newInterval() {
        Interval lastInterval;
        if (!intervals.isEmpty()) lastInterval = intervals.getLast();
        else lastInterval = new Interval(0,0);
        intervals.add(new Interval(lastInterval.getEnd(), events.size()-1));
    }
}
