package interpreter;

import javax.sound.midi.*;
import java.io.File;

public class Main {

    static public class MIDIMessage
    {
        private int pitch;
        private int velocity;
        private int channel;

        public MIDIMessage(int p, int v, int c)
        {
            pitch = p;
            velocity = v;
            channel = c;
        }

        public int GetPitch()
        {
            return this.pitch;
        }

        public int GetVelocity()
        {
            return this.velocity;
        }

        public int GetChannel()
        {
            return this.channel;
        }
    }

    /*public static void main(TextVar[] args) {

        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();
            Sequence sequence = new Sequence(Sequence.PPQ, 1);
            Track track = sequence.createTrack();


            ShortMessage laOn =new ShortMessage();
            ShortMessage siOn =new ShortMessage();
            ShortMessage reOn = new ShortMessage();
            ShortMessage faOn = new ShortMessage();

            ShortMessage laOf =new ShortMessage();
            ShortMessage siOf =new ShortMessage();
            ShortMessage reOf = new ShortMessage();
            ShortMessage faOf = new ShortMessage();

            laOn.setMessage(ShortMessage.NOTE_ON,0,69,100);
            siOn.setMessage(ShortMessage.NOTE_ON,0,71,100);
            reOn.setMessage(ShortMessage.NOTE_ON,0,74,100);
            faOn.setMessage(ShortMessage.NOTE_ON,0,78,100);

            laOf.setMessage(ShortMessage.NOTE_OFF,0,69,100);
            siOf.setMessage(ShortMessage.NOTE_OFF,0,71,100);
            reOf.setMessage(ShortMessage.NOTE_OFF,0,74,100);
            faOf.setMessage(ShortMessage.NOTE_OFF,0,78,100);

            ShortMessage noteOnMsg = new ShortMessage();
            //Signal/Channel/Pitch/Velocity

            ShortMessage noteOffMsg = new ShortMessage();
            //Signal/Channel/Pitch/Velocity
            byte[] num = new byte[]{(byte)0x03,(byte)0xd0,(byte)0x90};
            byte[] num2 = new byte[]{(byte)0x90, (byte)0xd0, (byte)0x03,(byte)0x03,(byte)0x51};
            System.out.println("Hola");
            MetaMessage tempo = new MetaMessage(0x51, num, 3);
            System.out.println("Adios");
            track.add(new MidiEvent(tempo, 0));
            track.add(new MidiEvent(laOn, 0));
            track.add(new MidiEvent(laOf, 1));
            track.add(new MidiEvent(reOn, 1));
            track.add(new MidiEvent(reOf, 2));
            track.add(new MidiEvent(faOn, 2));
            track.add(new MidiEvent(faOf, 3));
            track.add(new MidiEvent(reOn, 3));
            track.add(new MidiEvent(reOf, 4));

            track.add(new MidiEvent(siOn, 4));
            track.add(new MidiEvent(siOf, 5));
            track.add(new MidiEvent(reOn, 5));
            track.add(new MidiEvent(reOf, 6));
            track.add(new MidiEvent(faOn, 6));
            track.add(new MidiEvent(faOf, 7));
            track.add(new MidiEvent(reOn, 7));
            track.add(new MidiEvent(reOf, 8));


            //track.add(new MidiEvent(noteOffMsg, 15));
            sequencer.setSequence(sequence);
            //sequencer.setTempoInBPM(120);
            sequencer.setLoopCount(2);
            sequencer.start();

            File f = new File("midifile.mid");
            MidiSystem.write(sequencer.getSequence(),1,f);
            Thread.sleep(30000);
            sequencer.close();
        } catch (Exception e) {


        }

    }*/
}