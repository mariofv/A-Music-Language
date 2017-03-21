package interpreter;

import javax.sound.midi.*;

public class Main {

    public static void main(String[] args){

        Synthesizer synth;
        try {
            synth = MidiSystem.getSynthesizer();
            synth.open();
        } catch (MidiUnavailableException e) {
            e.printStackTrace();
            return;
        }
        Instrument[] instr = synth.getAvailableInstruments();
        final MidiChannel[] mc = synth.getChannels();
        for(int i = 34; i < 81; ++i){
            //mc[0].programChange(0,instr[i].getPatch().getProgram());
            System.out.println("Estoy en canal " + i);
            mc[9].noteOn(i,50);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            mc[9].noteOff(i,50);
        }

    }

}