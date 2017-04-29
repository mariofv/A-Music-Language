/**
 * Copyright (c) 2011, Jordi Cortadella
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *    * Redistributions of source code must retain the above copyright
 *      notice, this list of conditions and the following disclaimer.
 *    * Redistributions in binary form must reproduce the above copyright
 *      notice, this list of conditions and the following disclaimer in the
 *      documentation and/or other materials provided with the distribution.
 *    * Neither the name of the <organization> nor the
 *      names of its contributors may be used to endorse or promote products
 *      derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL <COPYRIGHT HOLDER> BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/

package interpreter;

import exceptions.AmlSemanticException;
import music.AmlInstrument;
import music.AmlNote;
import org.antlr.runtime.tree.*;
import org.antlr.runtime.Token;

import java.util.ArrayList;

import static music.AmlNote.Figure.*;
import static music.AmlNote.Note.*;

/**
 * Class to extend the nodes of the AST. It includes two fields
 * to store the value of literals and strings.
 * This class is not strictly necessary, since the literals could
 * be extracted from the "text" fields of the tokens.
 * However, it helps to understand how to extend AST nodes in ANTLR.
 */
 
public class AmlTree extends CommonTree {
    /** Field to store integer literals */
    private int intValue;


    /** Field to store string literals (without the enclosing quotes) */
    private String strValue;

    private AmlNote.Note noteValue;
    private AmlNote.Figure figureValue;
    private AmlInstrument.Instruments instrumentValue;

    /** Constructor of the class */
    public AmlTree(Token t) {
        super(t);
    }

    /** Function to get the child of the node. */
    public AmlTree getChild(int i) {
        return (AmlTree) super.getChild(i);
    }

    public ArrayList<AmlTree> getArrayChildren() {
        return (ArrayList<AmlTree>) children;
    }

    /** Get the integer value of the node. */
    public int getIntValue() { return intValue;}

    public void setInstrumentValue() throws AmlSemanticException {
        setStringValue();
        switch (strValue) {
            // Piano Family:
            case "Acoustic Grand Piano":
                instrumentValue = AmlInstrument.Instruments.Acoustic_Grand_Piano;
                break;
            case "Bright Acoustic Piano":
                instrumentValue = AmlInstrument.Instruments.Bright_Acoustic_Piano;
                break;
            case "Electric Grand Piano":
                instrumentValue = AmlInstrument.Instruments.Electric_Grand_Piano;
                break;
            case "Honky-tonk Piano":
                instrumentValue = AmlInstrument.Instruments.Honky_Tonk_Piano;
                break;
            case "Electric Piano 1":
                instrumentValue = AmlInstrument.Instruments.Electric_Piano_1;
                break;
            case "Electric Piano 2":
                instrumentValue = AmlInstrument.Instruments.Electric_Piano_2;
                break;
            case "Harpsichord":
                instrumentValue = AmlInstrument.Instruments.Harpsichord;
                break;
            case "Clavinet":
                instrumentValue = AmlInstrument.Instruments.Clavinet;
                break;
            // Chromatic Percussion Family:
            case "Celesta":
                instrumentValue = AmlInstrument.Instruments.Celesta;
                break;
            case "Glockenspiel":
                instrumentValue = AmlInstrument.Instruments.Glockenspiel;
                break;
            case "Music Box":
                instrumentValue = AmlInstrument.Instruments.Music_Box;
                break;
            case "Vibraphone":
                instrumentValue = AmlInstrument.Instruments.Vibraphone;
                break;
            case "Marimba":
                instrumentValue = AmlInstrument.Instruments.Marimba;
                break;
            case "Xylophone":
                instrumentValue = AmlInstrument.Instruments.Xylophone;
                break;
            case "Tubular Bells":
                instrumentValue = AmlInstrument.Instruments.Tubular_Bells;
                break;
            case "Dulcimer":
                instrumentValue = AmlInstrument.Instruments.Dulcimer;
                break;

            // Organ Family:
            case "Drawbar Organ":
                instrumentValue = AmlInstrument.Instruments.Drawbar_Organ;
                break;
            case "Percussive Organ":
                instrumentValue = AmlInstrument.Instruments.Percussive_Organ;
                break;
            case "Rock Organ":
                instrumentValue = AmlInstrument.Instruments.Rock_Organ;
                break;
            case "Church Organ":
                instrumentValue = AmlInstrument.Instruments.Church_Organ;
                break;
            case "Reed Organ":
                instrumentValue = AmlInstrument.Instruments.Reed_Organ;
                break;
            case "Accordion":
                instrumentValue = AmlInstrument.Instruments.Accordion;
                break;
            case "Harmonica":
                instrumentValue = AmlInstrument.Instruments.Harmonica;
                break;
            case "Tango Accordion":
                instrumentValue = AmlInstrument.Instruments.Tango_Accordion;
                break;

            // Guitar Family:
            case "Acoustic Guitar (nylon)":
                instrumentValue = AmlInstrument.Instruments.Acoustic_Guitar_nylon;
                break;
            case "Acoustic Guitar (steel)":
                instrumentValue = AmlInstrument.Instruments.Acoustic_Guitar_steel;
                break;
            case "Electric Guitar (jazz)":
                instrumentValue = AmlInstrument.Instruments.Electric_Guitar_jazz;
                break;
            case "Electric Guitar (clean)":
                instrumentValue = AmlInstrument.Instruments.Electric_Guitar_clean;
                break;
            case "Electric Guitar (muted)":
                instrumentValue = AmlInstrument.Instruments.Electric_Guitar_muted;
                break;
            case "Overdriven Guitar":
                instrumentValue = AmlInstrument.Instruments.Overdriven_Guitar;
                break;
            case "Distortion Guitar":
                instrumentValue = AmlInstrument.Instruments.Distortion_Guitar;
                break;
            case "Guitar harmonics":
                instrumentValue = AmlInstrument.Instruments.Guitar_harmonics;
                break;

            // Bass Family:
            case "Acoustic Bass":
                instrumentValue = AmlInstrument.Instruments.Acoustic_Bass;
                break;
            case "Electric Bass (finger)":
                instrumentValue = AmlInstrument.Instruments.Electric_Bass_finger;
                break;
            case "Electric Bass (pick)":
                instrumentValue = AmlInstrument.Instruments.Electric_Bass_pick;
                break;
            case "Fretless Bass":
                instrumentValue = AmlInstrument.Instruments.Fretless_Bass;
                break;
            case "Slap Bass 1":
                instrumentValue = AmlInstrument.Instruments.Slap_Bass_1;
                break;
            case "Slap Bass 2":
                instrumentValue = AmlInstrument.Instruments.Slap_Bass_2;
                break;
            case "Synth Bass 1":
                instrumentValue = AmlInstrument.Instruments.Synth_Bass_1;
                break;
            case "Synth Bass 2":
                instrumentValue = AmlInstrument.Instruments.Synth_Bass_2;
                break;

            // Strings Family:
            case "Violin":
                instrumentValue = AmlInstrument.Instruments.Violin;
                break;
            case "Viola":
                instrumentValue = AmlInstrument.Instruments.Viola;
                break;
            case "Cello":
                instrumentValue = AmlInstrument.Instruments.Cello;
                break;
            case "Contrabass":
                instrumentValue = AmlInstrument.Instruments.Contrabass;
                break;
            case "Tremolo Strings":
                instrumentValue = AmlInstrument.Instruments.Tremolo_Strings;
                break;
            case "Pizzicato Strings":
                instrumentValue = AmlInstrument.Instruments.Pizzicato_Strings;
                break;
            case "Orchestral Harp":
                instrumentValue = AmlInstrument.Instruments.Orchestral_Harp;
                break;
            case "Timpani":
                instrumentValue = AmlInstrument.Instruments.Timpani;
                break;

            // Ensemble Family:
            case "String Ensemble 1":
                instrumentValue = AmlInstrument.Instruments.String_Ensemble_1;
                break;
            case "String Ensemble 2":
                instrumentValue = AmlInstrument.Instruments.String_Ensemble_2;
                break;
            case "Synth Strings 1":
                instrumentValue = AmlInstrument.Instruments.Synth_Strings_1;
                break;
            case "Synth Strings 2":
                instrumentValue = AmlInstrument.Instruments.Synth_Strings_2;
                break;
            case "Choir Aahs":
                instrumentValue = AmlInstrument.Instruments.Choir_Aahs;
                break;
            case "Voice Oohs":
                instrumentValue = AmlInstrument.Instruments.Voice_Oohs;
                break;
            case "Synth Voice":
                instrumentValue = AmlInstrument.Instruments.Synth_Voice;
                break;
            case "Orchestra Hit":
                instrumentValue = AmlInstrument.Instruments.Orchestra_Hit;
                break;

            // Brass Family:
            case "Trumpet":
                instrumentValue = AmlInstrument.Instruments.Trumpet;
                break;
            case "Trombone":
                instrumentValue = AmlInstrument.Instruments.Trombone;
                break;
            case "Tuba":
                instrumentValue = AmlInstrument.Instruments.Tuba;
                break;
            case "Muted Trumpet":
                instrumentValue = AmlInstrument.Instruments.Muted_Trumpet;
                break;
            case "French Horn":
                instrumentValue = AmlInstrument.Instruments.French_Horn;
                break;
            case "Brass Section":
                instrumentValue = AmlInstrument.Instruments.Brass_Section;
                break;
            case "Synth Brass 1":
                instrumentValue = AmlInstrument.Instruments.Synth_Brass_1;
                break;
            case "Synth Brass 2":
                instrumentValue = AmlInstrument.Instruments.Synth_Brass_2;
                break;

            // Reed Family:
            case "Soprano Sax":
                instrumentValue = AmlInstrument.Instruments.Soprano_Sax;
                break;
            case "Alto Sax":
                instrumentValue = AmlInstrument.Instruments.Alto_Sax;
                break;
            case "Tenor Sax":
                instrumentValue = AmlInstrument.Instruments.Tenor_Sax;
                break;
            case "Baritone Sax":
                instrumentValue = AmlInstrument.Instruments.Baritone_Sax;
                break;
            case "Oboe":
                instrumentValue = AmlInstrument.Instruments.Oboe;
                break;
            case "English Horn":
                instrumentValue = AmlInstrument.Instruments.English_Horn;
                break;
            case "Bassoon":
                instrumentValue = AmlInstrument.Instruments.Bassoon;
                break;
            case "Clarinet":
                instrumentValue = AmlInstrument.Instruments.Clarinet;
                break;

            // Pipe Family:
            case "Piccolo":
                instrumentValue = AmlInstrument.Instruments.Piccolo;
                break;
            case "Flute":
                instrumentValue = AmlInstrument.Instruments.Flute;
                break;
            case "Recorder":
                instrumentValue = AmlInstrument.Instruments.Recorder;
                break;
            case "Pan Flute":
                instrumentValue = AmlInstrument.Instruments.Pan_Flute;
                break;
            case "Blown Bottle":
                instrumentValue = AmlInstrument.Instruments.Blown_Bottle;
                break;
            case "Shakuhachi":
                instrumentValue = AmlInstrument.Instruments.Shakuhachi;
                break;
            case "Whistle":
                instrumentValue = AmlInstrument.Instruments.Whistle;
                break;
            case "Ocarina":
                instrumentValue = AmlInstrument.Instruments.Ocarina;
                break;

            // Synth Lead Family:
            case "Lead 1 (square)":
                instrumentValue = AmlInstrument.Instruments.Lead_1;
                break;
            case "Lead 2 (sawtooth)":
                instrumentValue = AmlInstrument.Instruments.Lead_2;
                break;
            case "Lead 3 (calliope)":
                instrumentValue = AmlInstrument.Instruments.Lead_3;
                break;
            case "Lead 4 (chiff)":
                instrumentValue = AmlInstrument.Instruments.Lead_4;
                break;
            case "Lead 5 (charang)":
                instrumentValue = AmlInstrument.Instruments.Lead_5;
                break;
            case "Lead 6 (voice)":
                instrumentValue = AmlInstrument.Instruments.Lead_6;
                break;
            case "Lead 7 (fifths)":
                instrumentValue = AmlInstrument.Instruments.Lead_7;
                break;
            case "Lead 8 (bass + lead)":
                instrumentValue = AmlInstrument.Instruments.Lead_8;
                break;

            // Synth Pad Family:
            case "Pad 1 (new age)":
                instrumentValue = AmlInstrument.Instruments.Pad_1;
                break;
            case "Pad 2 (warm)":
                instrumentValue = AmlInstrument.Instruments.Pad_2;
                break;
            case "Pad 3 (polysynth)":
                instrumentValue = AmlInstrument.Instruments.Pad_3;
                break;
            case "Pad 4 (choir)":
                instrumentValue = AmlInstrument.Instruments.Pad_4;
                break;
            case "Pad 5 (bowed)":
                instrumentValue = AmlInstrument.Instruments.Pad_5;
                break;
            case "Pad 6 (metallic)":
                instrumentValue = AmlInstrument.Instruments.Pad_6;
                break;
            case "Pad 7 (halo)":
                instrumentValue = AmlInstrument.Instruments.Pad_7;
                break;
            case "Pad 8 (sweep)":
                instrumentValue = AmlInstrument.Instruments.Pad_8;
                break;

            // Synth Effects Family:
            case "FX 1 (rain)":
                instrumentValue = AmlInstrument.Instruments.FX_1;
                break;
            case "FX 2 (soundtrack)":
                instrumentValue = AmlInstrument.Instruments.FX_2;
                break;
            case "FX 3 (crystal)":
                instrumentValue = AmlInstrument.Instruments.FX_3;
                break;
            case "FX 4 (atmosphere)":
                instrumentValue = AmlInstrument.Instruments.FX_4;
                break;
            case "FX 5 (brightness)":
                instrumentValue = AmlInstrument.Instruments.FX_5;
                break;
            case "FX 6 (goblins)":
                instrumentValue = AmlInstrument.Instruments.FX_6;
                break;
            case "FX 7 (echoes)":
                instrumentValue = AmlInstrument.Instruments.FX_7;
                break;
            case "FX 8 (sci-fi)":
                instrumentValue = AmlInstrument.Instruments.FX_8;
                break;

            // Ethnic Family:
            case "Sitar":
                instrumentValue = AmlInstrument.Instruments.Sitar;
                break;
            case "Banjo":
                instrumentValue = AmlInstrument.Instruments.Banjo;
                break;
            case "Shamisen":
                instrumentValue = AmlInstrument.Instruments.Shamisen;
                break;
            case "Koto":
                instrumentValue = AmlInstrument.Instruments.Koto;
                break;
            case "Kalimba":
                instrumentValue = AmlInstrument.Instruments.Kalimba;
                break;
            case "Bag pipe":
                instrumentValue = AmlInstrument.Instruments.Bag_pipe;
                break;
            case "Fiddle":
                instrumentValue = AmlInstrument.Instruments.Fiddle;
                break;
            case "Shanai":
                instrumentValue = AmlInstrument.Instruments.Shanai;
                break;

            // Percussive Family:
            case "Tinkle Bell":
                instrumentValue = AmlInstrument.Instruments.Tinkle_Bell;
                break;
            case "Agogo":
                instrumentValue = AmlInstrument.Instruments.Agogo;
                break;
            case "Steel Drums":
                instrumentValue = AmlInstrument.Instruments.Steel_Drums;
                break;
            case "Woodblock":
                instrumentValue = AmlInstrument.Instruments.Woodblock;
                break;
            case "Taiko Drum":
                instrumentValue = AmlInstrument.Instruments.Taiko_Drum;
                break;
            case "Melodic Tom":
                instrumentValue = AmlInstrument.Instruments.Melodic_Tom;
                break;
            case "Synth Drum":
                instrumentValue = AmlInstrument.Instruments.Synth_Drum;
                break;
            case "Reverse Cymbal":
                instrumentValue = AmlInstrument.Instruments.Reverse_Cymbal;
                break;

            // Sound Effects Family:
            case "Guitar Fret Noise":
                instrumentValue = AmlInstrument.Instruments.Guitar_Fret_Noise;
                break;
            case "Breath Noise":
                instrumentValue = AmlInstrument.Instruments.Breath_Noise;
                break;
            case "Seashore":
                instrumentValue = AmlInstrument.Instruments.Seashore;
                break;
            case "Bird Tweet":
                instrumentValue = AmlInstrument.Instruments.Bird_Tweet;
                break;
            case "Telephone Ring":
                instrumentValue = AmlInstrument.Instruments.Telephone_Ring;
                break;
            case "Helicopter":
                instrumentValue = AmlInstrument.Instruments.Helicopter;
                break;
            case "Applause":
                instrumentValue = AmlInstrument.Instruments.Applause;
                break;
            case "Gunshot":
                instrumentValue = AmlInstrument.Instruments.Gunshot;
                break;
            default:
                throw new AmlSemanticException("Instrument " + strValue + " not found", getLine());
        }
    }

    public void setNoteValue() {
        switch (getText()) {
            case "Do":
                noteValue = Do;
                break;
            case "Re":
                noteValue = Re;
                break;
            case "Mi":
                noteValue = Mi;
                break;
            case "Fa":
                noteValue = Fa;
                break;
            case "Sol":
                noteValue = Sol;
                break;
            case "La":
                noteValue = La;
                break;
            case "Si":
                noteValue = Si;
                break;
            case "Silence":
                noteValue = Silence;
                break;
            default:
                throw new Error("This should never happen, found invalid note token: " + getText());
        }
    }

    public void setFigureValue() {
        switch (getText()) {
            case "r":
                figureValue = Redonda;
                break;
            case "b":
                figureValue = Blanca;
                break;
            case "n":
                figureValue = Negra;
                break;
            case "c":
                figureValue = Corchera;
                break;
            case "sc":
                figureValue = Semicorchera;
                break;
            case "f":
                figureValue = Fusa;
                break;
            case "sf":
                figureValue = SemiFusa;
                break;
            default:
                throw new Error("This should never happen, found invalid figure token: " + getText());
        }
    }

    /** Define the integer value of the node. */
    public void setIntValue() { intValue = Integer.parseInt(getText()); }

    /** Get the Boolean value of the node. */
    public boolean getBooleanValue() { return intValue != 0; }

    /** Define the Boolean value of the node. */
    public void setBooleanValue() {
        intValue = getText().equals("true") ? 1 : 0;
    }

    /** Get the string value of the node. */
    public String getStringValue() { return strValue; }

    public AmlNote.Note getNoteValue() {
        return noteValue;
    }

    public AmlNote.Figure getFigureValue() {
        return figureValue;
    }

    public AmlInstrument.Instruments getInstrumentValue() {
        return instrumentValue;
    }

    /**
     * Define the string value of the node. It removes the
     * enclosing quotes. In this way, it can be printed as it is.
     */
    public void setStringValue() {
        String s = getText();
        // Do not store the " at the extremes of the string
        strValue = s.substring(1,s.length()-1);
    }
}
