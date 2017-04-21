package music;

import javax.sound.midi.*;

public class AmlInstrument {

    public enum Instruments {
        // Piano Family
        Acoustic_Grand_Piano,
        Bright_Acoustic_Piano,
        Electric_Grand_Piano,
        Honky_Tonk_Piano,
        Electric_Piano_1,
        Electric_Piano_2,
        Harpsichord,
        Clavinet,

        // Chromatic Percussion Family:
        Celesta,
        Glockenspiel,
        Music_Box,
        Vibraphone,
        Marimba,
        Xylophone,
        Tubular_Bells,
        Dulcimer,

        // Organ Family:
        Drawbar_Organ,
        Percussive_Organ,
        Rock_Organ,
        Church_Organ,
        Reed_Organ,
        Accordion,
        Harmonica,
        Tango_Accordion,

        // Guitar Family:
        Acoustic_Guitar_nylon,
        Acoustic_Guitar_steel,
        Electric_Guitar_jazz,
        Electric_Guitar_clean,
        Electric_Guitar_muted,
        Overdriven_Guitar,
        Distortion_Guitar,
        Guitar_harmonics,

        //_Bass Family:
        Acoustic_Bass,
        Electric_Bass_finger,
        Electric_Bass_pick,
        Fretless_Bass,
        Slap_Bass_1,
        Slap_Bass_2,
        Synth_Bass_1,
        Synth_Bass_2,

        //_Strings Family:
        Violin,
        Viola,
        Cello,
        Contrabass,
        Tremolo_Strings,
        Pizzicato_Strings,
        Orchestral_Harp,
        Timpani,

        // Ensemble Family:
        String_Ensemble_1,
        String_Ensemble_2,
        Synth_Strings_1,
        Synth_Strings_2,
        Choir_Aahs,
        Voice_Oohs,
        Synth_Voice,
        Orchestra_Hit,

        // Brass Family:
        Trumpet,
        Trombone,
        Tuba,
        Muted_Trumpet,
        French_Horn,
        Brass_Section,
        Synth_Brass_1,
        Synth_Brass_2,

        // Reed Family:
        Soprano_Sax,
        Alto_Sax,
        Tenor_Sax,
        Baritone_Sax,
        Oboe,
        English_Horn,
        Bassoon,
        Clarinet,

        // Pipe Family:
        Piccolo,
        Flute,
        Recorder,
        Pan_Flute,
        Blown_Bottle,
        Shakuhachi,
        Whistle,
        Ocarina,

        // Synth Lead Family:
        Lead_1,
        Lead_2,
        Lead_3,
        Lead_4,
        Lead_5,
        Lead_6,
        Lead_7,
        Lead_8,

        // Synth Pad Family:
        Pad_1,
        Pad_2,
        Pad_3,
        Pad_4,
        Pad_5,
        Pad_6,
        Pad_7,
        Pad_8,

        // Synth Effects Family:
        FX_1,
        FX_2,
        FX_3,
        FX_4,
        FX_5,
        FX_6,
        FX_7,
        FX_8,

        // Ethnic Family:
        Sitar,
        Banjo,
        Shamisen,
        Koto,
        Kalimba,
        Bag_pipe,
        Fiddle,
        Shanai,

        // Percussive Family:
        Tinkle_Bell,
        Agogo,
        Steel_Drums,
        Woodblock,
        Taiko_Drum,
        Melodic_Tom,
        Synth_Drum,
        Reverse_Cymbal,

        // Sound Effects Family:
        Guitar_Fret_Noise,
        Breath_Noise,
        Seashore,
        Bird_Tweet,
        Telephone_Ring,
        Helicopter,
        Applause,
        Gunshot
    }

    //private Soundbank soundBank;
    //private static Instrument[] instrumentSet;
    private Instruments name;
    private int program;

    public AmlInstrument(Instruments instrument) {
        program = mapInstrument(instrument);
        name = instrument;
        /*
        try {
            soundBank = MidiSystem.getSynthesizer().getDefaultSoundbank();
            instrumentSet = MidiSystem.getSynthesizer().getAvailableInstruments();
            Instrument instrument = instrumentSet[index];
            System.out.println(instrument.getName());
        } catch(Exception e){

        }
        */
    }

    public ShortMessage getMessage(int channel) {
        try {
            return new ShortMessage(ShortMessage.PROGRAM_CHANGE, channel, program, 0);
        } catch (InvalidMidiDataException e) {
            e.printStackTrace();
            throw new Error();
        }
    }

    private static int mapInstrument(Instruments instrument) {
        int index = 0;
        switch (instrument) {
            case Acoustic_Grand_Piano:
                index = 0;
                break;
            case Bright_Acoustic_Piano:
                index = 1;
                break;
            case Electric_Grand_Piano:
                index = 2;
                break;
            case Honky_Tonk_Piano:
                index = 3;
                break;
            case Electric_Piano_1:
                index = 4;
                break;
            case Electric_Piano_2:
                index = 5;
                break;
            case Harpsichord:
                index = 6;
                break;
            case Clavinet:
                index = 7;
                break;
            case Celesta:
                index = 8;
                break;
            case Glockenspiel:
                index = 9;
                break;
            case Music_Box:
                index = 10;
                break;
            case Vibraphone:
                index = 11;
                break;
            case Marimba:
                index = 12;
                break;
            case Xylophone:
                index = 13;
                break;
            case Tubular_Bells:
                index = 14;
                break;
            case Dulcimer:
                index = 15;
                break;
            case Drawbar_Organ:
                index = 16;
                break;
            case Percussive_Organ:
                index = 17;
                break;
            case Rock_Organ:
                index = 18;
                break;
            case Church_Organ:
                index = 19;
                break;
            case Reed_Organ:
                index = 20;
                break;
            case Accordion:
                index = 21;
                break;
            case Harmonica:
                index = 22;
                break;
            case Tango_Accordion:
                index = 23;
                break;
            case Acoustic_Guitar_nylon:
                index = 24;
                break;
            case Acoustic_Guitar_steel:
                index = 25;
                break;
            case Electric_Guitar_jazz:
                index = 26;
                break;
            case Electric_Guitar_clean:
                index = 27;
                break;
            case Electric_Guitar_muted:
                index = 28;
                break;
            case Overdriven_Guitar:
                index = 29;
                break;
            case Distortion_Guitar:
                index = 30;
                break;
            case Guitar_harmonics:
                index = 31;
                break;
            case Acoustic_Bass:
                index = 32;
                break;
            case Electric_Bass_finger:
                index = 33;
                break;
            case Electric_Bass_pick:
                index = 34;
                break;
            case Fretless_Bass:
                index = 35;
                break;
            case Slap_Bass_1:
                index = 36;
                break;
            case Slap_Bass_2:
                index = 37;
                break;
            case Synth_Bass_1:
                index = 38;
                break;
            case Synth_Bass_2:
                index = 39;
                break;
            case Violin:
                index = 40;
                break;
            case Viola:
                index = 41;
                break;
            case Cello:
                index = 42;
                break;
            case Contrabass:
                index = 43;
                break;
            case Tremolo_Strings:
                index = 44;
                break;
            case Pizzicato_Strings:
                index = 45;
                break;
            case Orchestral_Harp:
                index = 46;
                break;
            case Timpani:
                index = 47;
                break;
            case String_Ensemble_1:
                index = 48;
                break;
            case String_Ensemble_2:
                index = 49;
                break;
            case Synth_Strings_1:
                index = 50;
                break;
            case Synth_Strings_2:
                index = 51;
                break;
            case Choir_Aahs:
                index = 52;
                break;
            case Voice_Oohs:
                index = 53;
                break;
            case Synth_Voice:
                index = 54;
                break;
            case Orchestra_Hit:
                index = 55;
                break;
            case Trumpet:
                index = 56;
                break;
            case Trombone:
                index = 57;
                break;
            case Tuba:
                index = 58;
                break;
            case Muted_Trumpet:
                index = 59;
                break;
            case French_Horn:
                index = 60;
                break;
            case Brass_Section:
                index = 61;
                break;
            case Synth_Brass_1:
                index = 62;
                break;
            case Synth_Brass_2:
                index = 63;
                break;
            case Soprano_Sax:
                index = 64;
                break;
            case Alto_Sax:
                index = 65;
                break;
            case Tenor_Sax:
                index = 66;
                break;
            case Baritone_Sax:
                index = 67;
                break;
            case Oboe:
                index = 68;
                break;
            case English_Horn:
                index = 69;
                break;
            case Bassoon:
                index = 70;
                break;
            case Clarinet:
                index = 71;
                break;
            case Piccolo:
                index = 72;
                break;
            case Flute:
                index = 73;
                break;
            case Recorder:
                index = 74;
                break;
            case Pan_Flute:
                index = 75;
                break;
            case Blown_Bottle:
                index = 76;
                break;
            case Shakuhachi:
                index = 77;
                break;
            case Whistle:
                index = 78;
                break;
            case Ocarina:
                index = 79;
                break;
            case Lead_1:
                index = 80;
                break;
            case Lead_2:
                index = 81;
                break;
            case Lead_3:
                index = 82;
                break;
            case Lead_4:
                index = 83;
                break;
            case Lead_5:
                index = 84;
                break;
            case Lead_6:
                index = 85;
                break;
            case Lead_7:
                index = 86;
                break;
            case Lead_8:
                index = 87;
                break;
            case Pad_1:
                index = 88;
                break;
            case Pad_2:
                index = 89;
                break;
            case Pad_3:
                index = 90;
                break;
            case Pad_4:
                index = 91;
                break;
            case Pad_5:
                index = 92;
                break;
            case Pad_6:
                index = 93;
                break;
            case Pad_7:
                index = 94;
                break;
            case Pad_8:
                index = 95;
                break;
            case FX_1:
                index = 96;
                break;
            case FX_2:
                index = 97;
                break;
            case FX_3:
                index = 98;
                break;
            case FX_4:
                index = 99;
                break;
            case FX_5:
                index = 100;
                break;
            case FX_6:
                index = 101;
                break;
            case FX_7:
                index = 102;
                break;
            case FX_8:
                index = 103;
                break;
            case Sitar:
                index = 104;
                break;
            case Banjo:
                index = 105;
                break;
            case Shamisen:
                index = 106;
                break;
            case Koto:
                index = 107;
                break;
            case Kalimba:
                index = 108;
                break;
            case Bag_pipe:
                index = 109;
                break;
            case Fiddle:
                index = 110;
                break;
            case Shanai:
                index = 111;
                break;
            case Tinkle_Bell:
                index = 112;
                break;
            case Agogo:
                index = 113;
                break;
            case Steel_Drums:
                index = 114;
                break;
            case Woodblock:
                index = 115;
                break;
            case Taiko_Drum:
                index = 116;
                break;
            case Melodic_Tom:
                index = 117;
                break;
            case Synth_Drum:
                index = 118;
                break;
            case Reverse_Cymbal:
                index = 119;
                break;
            case Guitar_Fret_Noise:
                index = 120;
                break;
            case Breath_Noise:
                index = 121;
                break;
            case Seashore:
                index = 122;
                break;
            case Bird_Tweet:
                index = 123;
                break;
            case Telephone_Ring:
                index = 124;
                break;
            case Helicopter:
                index = 125;
                break;
            case Applause:
                index = 126;
                break;
            case Gunshot:
                index = 127;
                break;
        }
        return index;
    }
}
