// $ANTLR 3.4 src/parser/Music.g 2017-05-27 14:12:48

    package parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class MusicLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__102=102;
    public static final int T__103=103;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int T__110=110;
    public static final int T__111=111;
    public static final int T__112=112;
    public static final int T__113=113;
    public static final int AND=4;
    public static final int ARMOR=5;
    public static final int ASSIG=6;
    public static final int ATTR_ACCESS=7;
    public static final int BAR=8;
    public static final int BEAT=9;
    public static final int BEMOL=10;
    public static final int BOOL=11;
    public static final int BOOLEAN=12;
    public static final int CHORD=13;
    public static final int COMMENT=14;
    public static final int COMPAS=15;
    public static final int COMPAS_LIST=16;
    public static final int DECR=17;
    public static final int DIMINUTION=18;
    public static final int DIV=19;
    public static final int DIVIDE_ASSIG=20;
    public static final int DN=21;
    public static final int DOT=22;
    public static final int DOUBLE_BAR=23;
    public static final int DRUMS=24;
    public static final int DRUMS_NOTE_TYPE=25;
    public static final int DRUMS_TRACK=26;
    public static final int DRUM_FIGURE=27;
    public static final int DRUM_NOTE=28;
    public static final int DRUM_NOTES=29;
    public static final int ELSE=30;
    public static final int ELSEIF=31;
    public static final int END_REPETITION=32;
    public static final int EQUAL=33;
    public static final int ESC_SEQ=34;
    public static final int FALSE=35;
    public static final int FIGURE=36;
    public static final int FIGURE_NAME=37;
    public static final int FIGURE_TYPE=38;
    public static final int FOR=39;
    public static final int FRAGCALL=40;
    public static final int FRAGMENT=41;
    public static final int FUNCALL=42;
    public static final int FUNCTION=43;
    public static final int GE=44;
    public static final int GT=45;
    public static final int ID=46;
    public static final int ID_=47;
    public static final int IF=48;
    public static final int INCR=49;
    public static final int INSTRUMENT=50;
    public static final int INT=51;
    public static final int LE=52;
    public static final int LETTER_X=53;
    public static final int LIST_ARGUMENTS=54;
    public static final int LIST_ASSIG=55;
    public static final int LIST_FUNCTIONS=56;
    public static final int LIST_INSTRUCTIONS=57;
    public static final int LIST_MUSIC_INST=58;
    public static final int LT=59;
    public static final int MAJ7=60;
    public static final int MINOR=61;
    public static final int MINUS=62;
    public static final int MINUS_ASSIG=63;
    public static final int MOD=64;
    public static final int MOD_ASSIG=65;
    public static final int NEG_NUM=66;
    public static final int NOT=67;
    public static final int NOTE=68;
    public static final int NOTES=69;
    public static final int NOTE_TYPE=70;
    public static final int NOT_EQUAL=71;
    public static final int NUM=72;
    public static final int OR=73;
    public static final int PLUS=74;
    public static final int PLUS_ASSIG=75;
    public static final int POST=76;
    public static final int POS_NUM=77;
    public static final int PRE=78;
    public static final int PROD_ASSIG=79;
    public static final int READ=80;
    public static final int REPETITION=81;
    public static final int RETURN=82;
    public static final int SEVENTH=83;
    public static final int SONG=84;
    public static final int SPEED=85;
    public static final int START_REPETITION=86;
    public static final int STRING=87;
    public static final int STRING_TYPE=88;
    public static final int SUSTAIN=89;
    public static final int TIE=90;
    public static final int TONE=91;
    public static final int TRACK=92;
    public static final int TRANSPORT=93;
    public static final int TRIPLET=94;
    public static final int TRUE=95;
    public static final int VAR_FUNCALL=96;
    public static final int VOID=97;
    public static final int VOLUME=98;
    public static final int WHILE=99;
    public static final int WRITE=100;
    public static final int WS=101;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public MusicLexer() {} 
    public MusicLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public MusicLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "src/parser/Music.g"; }

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:6:8: ( '(' )
            // src/parser/Music.g:6:10: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__102"

    // $ANTLR start "T__103"
    public final void mT__103() throws RecognitionException {
        try {
            int _type = T__103;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:7:8: ( ')' )
            // src/parser/Music.g:7:10: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__103"

    // $ANTLR start "T__104"
    public final void mT__104() throws RecognitionException {
        try {
            int _type = T__104;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:8:8: ( ',' )
            // src/parser/Music.g:8:10: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__104"

    // $ANTLR start "T__105"
    public final void mT__105() throws RecognitionException {
        try {
            int _type = T__105;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:9:8: ( '.' )
            // src/parser/Music.g:9:10: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__105"

    // $ANTLR start "T__106"
    public final void mT__106() throws RecognitionException {
        try {
            int _type = T__106;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:10:8: ( ':' )
            // src/parser/Music.g:10:10: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__106"

    // $ANTLR start "T__107"
    public final void mT__107() throws RecognitionException {
        try {
            int _type = T__107;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:11:8: ( ';' )
            // src/parser/Music.g:11:10: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__107"

    // $ANTLR start "T__108"
    public final void mT__108() throws RecognitionException {
        try {
            int _type = T__108;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:12:8: ( 'F:' )
            // src/parser/Music.g:12:10: 'F:'
            {
            match("F:"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__108"

    // $ANTLR start "T__109"
    public final void mT__109() throws RecognitionException {
        try {
            int _type = T__109;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:13:8: ( 'N:' )
            // src/parser/Music.g:13:10: 'N:'
            {
            match("N:"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__109"

    // $ANTLR start "T__110"
    public final void mT__110() throws RecognitionException {
        try {
            int _type = T__110;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:14:8: ( '[' )
            // src/parser/Music.g:14:10: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__110"

    // $ANTLR start "T__111"
    public final void mT__111() throws RecognitionException {
        try {
            int _type = T__111;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:15:8: ( ']' )
            // src/parser/Music.g:15:10: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__111"

    // $ANTLR start "T__112"
    public final void mT__112() throws RecognitionException {
        try {
            int _type = T__112;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:16:8: ( '{' )
            // src/parser/Music.g:16:10: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__112"

    // $ANTLR start "T__113"
    public final void mT__113() throws RecognitionException {
        try {
            int _type = T__113;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:17:8: ( '}' )
            // src/parser/Music.g:17:10: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__113"

    // $ANTLR start "TONE"
    public final void mTONE() throws RecognitionException {
        try {
            int _type = TONE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:312:21: ( 'Tone' )
            // src/parser/Music.g:312:23: 'Tone'
            {
            match("Tone"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TONE"

    // $ANTLR start "BAR"
    public final void mBAR() throws RecognitionException {
        try {
            int _type = BAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:313:21: ( '|' )
            // src/parser/Music.g:313:23: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BAR"

    // $ANTLR start "DOUBLE_BAR"
    public final void mDOUBLE_BAR() throws RecognitionException {
        try {
            int _type = DOUBLE_BAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:314:22: ( '||' )
            // src/parser/Music.g:314:24: '||'
            {
            match("||"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOUBLE_BAR"

    // $ANTLR start "START_REPETITION"
    public final void mSTART_REPETITION() throws RecognitionException {
        try {
            int _type = START_REPETITION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:315:21: ( '||:' )
            // src/parser/Music.g:315:23: '||:'
            {
            match("||:"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "START_REPETITION"

    // $ANTLR start "END_REPETITION"
    public final void mEND_REPETITION() throws RecognitionException {
        try {
            int _type = END_REPETITION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:316:21: ( ':||' )
            // src/parser/Music.g:316:23: ':||'
            {
            match(":||"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "END_REPETITION"

    // $ANTLR start "CHORD"
    public final void mCHORD() throws RecognitionException {
        try {
            int _type = CHORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:317:21: ( 'Chord' )
            // src/parser/Music.g:317:23: 'Chord'
            {
            match("Chord"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHORD"

    // $ANTLR start "TRANSPORT"
    public final void mTRANSPORT() throws RecognitionException {
        try {
            int _type = TRANSPORT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:318:21: ( 'Transport' )
            // src/parser/Music.g:318:23: 'Transport'
            {
            match("Transport"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TRANSPORT"

    // $ANTLR start "VOLUME"
    public final void mVOLUME() throws RecognitionException {
        try {
            int _type = VOLUME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:319:21: ( 'Volume' )
            // src/parser/Music.g:319:23: 'Volume'
            {
            match("Volume"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VOLUME"

    // $ANTLR start "MINOR"
    public final void mMINOR() throws RecognitionException {
        try {
            int _type = MINOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:320:21: ( 'm' )
            // src/parser/Music.g:320:23: 'm'
            {
            match('m'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MINOR"

    // $ANTLR start "DIMINUTION"
    public final void mDIMINUTION() throws RecognitionException {
        try {
            int _type = DIMINUTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:321:21: ( 'º' )
            // src/parser/Music.g:321:23: 'º'
            {
            match("º"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIMINUTION"

    // $ANTLR start "MAJ7"
    public final void mMAJ7() throws RecognitionException {
        try {
            int _type = MAJ7;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:322:21: ( 'maj7' )
            // src/parser/Music.g:322:23: 'maj7'
            {
            match("maj7"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MAJ7"

    // $ANTLR start "SEVENTH"
    public final void mSEVENTH() throws RecognitionException {
        try {
            int _type = SEVENTH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:323:21: ( '7th' )
            // src/parser/Music.g:323:23: '7th'
            {
            match("7th"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SEVENTH"

    // $ANTLR start "NOTE_TYPE"
    public final void mNOTE_TYPE() throws RecognitionException {
        try {
            int _type = NOTE_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:324:21: ( 'Note' )
            // src/parser/Music.g:324:23: 'Note'
            {
            match("Note"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOTE_TYPE"

    // $ANTLR start "DRUMS_NOTE_TYPE"
    public final void mDRUMS_NOTE_TYPE() throws RecognitionException {
        try {
            int _type = DRUMS_NOTE_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:325:21: ( 'DrumsNote' )
            // src/parser/Music.g:325:23: 'DrumsNote'
            {
            match("DrumsNote"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DRUMS_NOTE_TYPE"

    // $ANTLR start "FIGURE_TYPE"
    public final void mFIGURE_TYPE() throws RecognitionException {
        try {
            int _type = FIGURE_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:326:21: ( 'Figure' )
            // src/parser/Music.g:326:23: 'Figure'
            {
            match("Figure"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FIGURE_TYPE"

    // $ANTLR start "DN"
    public final void mDN() throws RecognitionException {
        try {
            int _type = DN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:327:21: ( 'DN' )
            // src/parser/Music.g:327:24: 'DN'
            {
            match("DN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DN"

    // $ANTLR start "NOTE"
    public final void mNOTE() throws RecognitionException {
        try {
            int _type = NOTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:328:21: ( ( 'Do' | 'Re' | 'Mi' | 'Fa' | 'Sol' | 'La' | 'Si' | 'Silence' ) )
            // src/parser/Music.g:328:23: ( 'Do' | 'Re' | 'Mi' | 'Fa' | 'Sol' | 'La' | 'Si' | 'Silence' )
            {
            // src/parser/Music.g:328:23: ( 'Do' | 'Re' | 'Mi' | 'Fa' | 'Sol' | 'La' | 'Si' | 'Silence' )
            int alt1=8;
            switch ( input.LA(1) ) {
            case 'D':
                {
                alt1=1;
                }
                break;
            case 'R':
                {
                alt1=2;
                }
                break;
            case 'M':
                {
                alt1=3;
                }
                break;
            case 'F':
                {
                alt1=4;
                }
                break;
            case 'S':
                {
                int LA1_5 = input.LA(2);

                if ( (LA1_5=='o') ) {
                    alt1=5;
                }
                else if ( (LA1_5=='i') ) {
                    int LA1_8 = input.LA(3);

                    if ( (LA1_8=='l') ) {
                        alt1=8;
                    }
                    else {
                        alt1=7;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 5, input);

                    throw nvae;

                }
                }
                break;
            case 'L':
                {
                alt1=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }

            switch (alt1) {
                case 1 :
                    // src/parser/Music.g:328:24: 'Do'
                    {
                    match("Do"); 



                    }
                    break;
                case 2 :
                    // src/parser/Music.g:328:29: 'Re'
                    {
                    match("Re"); 



                    }
                    break;
                case 3 :
                    // src/parser/Music.g:328:34: 'Mi'
                    {
                    match("Mi"); 



                    }
                    break;
                case 4 :
                    // src/parser/Music.g:328:39: 'Fa'
                    {
                    match("Fa"); 



                    }
                    break;
                case 5 :
                    // src/parser/Music.g:328:44: 'Sol'
                    {
                    match("Sol"); 



                    }
                    break;
                case 6 :
                    // src/parser/Music.g:328:50: 'La'
                    {
                    match("La"); 



                    }
                    break;
                case 7 :
                    // src/parser/Music.g:328:55: 'Si'
                    {
                    match("Si"); 



                    }
                    break;
                case 8 :
                    // src/parser/Music.g:328:60: 'Silence'
                    {
                    match("Silence"); 



                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOTE"

    // $ANTLR start "DRUMS"
    public final void mDRUMS() throws RecognitionException {
        try {
            int _type = DRUMS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:329:21: ( 'Drums' )
            // src/parser/Music.g:329:23: 'Drums'
            {
            match("Drums"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DRUMS"

    // $ANTLR start "SUSTAIN"
    public final void mSUSTAIN() throws RecognitionException {
        try {
            int _type = SUSTAIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:330:21: ( '#' )
            // src/parser/Music.g:330:23: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SUSTAIN"

    // $ANTLR start "BEMOL"
    public final void mBEMOL() throws RecognitionException {
        try {
            int _type = BEMOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:331:21: ( '&' )
            // src/parser/Music.g:331:23: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BEMOL"

    // $ANTLR start "ARMOR"
    public final void mARMOR() throws RecognitionException {
        try {
            int _type = ARMOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:332:21: ( '$' )
            // src/parser/Music.g:332:23: '$'
            {
            match('$'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ARMOR"

    // $ANTLR start "FIGURE_NAME"
    public final void mFIGURE_NAME() throws RecognitionException {
        try {
            int _type = FIGURE_NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:333:26: ( ( 'r' | 'b' | 'n' | 'c' | 'sc' | 'f' | 'sf' ) )
            // src/parser/Music.g:333:28: ( 'r' | 'b' | 'n' | 'c' | 'sc' | 'f' | 'sf' )
            {
            // src/parser/Music.g:333:28: ( 'r' | 'b' | 'n' | 'c' | 'sc' | 'f' | 'sf' )
            int alt2=7;
            switch ( input.LA(1) ) {
            case 'r':
                {
                alt2=1;
                }
                break;
            case 'b':
                {
                alt2=2;
                }
                break;
            case 'n':
                {
                alt2=3;
                }
                break;
            case 'c':
                {
                alt2=4;
                }
                break;
            case 's':
                {
                int LA2_5 = input.LA(2);

                if ( (LA2_5=='c') ) {
                    alt2=5;
                }
                else if ( (LA2_5=='f') ) {
                    alt2=7;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 5, input);

                    throw nvae;

                }
                }
                break;
            case 'f':
                {
                alt2=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // src/parser/Music.g:333:29: 'r'
                    {
                    match('r'); 

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:333:33: 'b'
                    {
                    match('b'); 

                    }
                    break;
                case 3 :
                    // src/parser/Music.g:333:37: 'n'
                    {
                    match('n'); 

                    }
                    break;
                case 4 :
                    // src/parser/Music.g:333:41: 'c'
                    {
                    match('c'); 

                    }
                    break;
                case 5 :
                    // src/parser/Music.g:333:45: 'sc'
                    {
                    match("sc"); 



                    }
                    break;
                case 6 :
                    // src/parser/Music.g:333:50: 'f'
                    {
                    match('f'); 

                    }
                    break;
                case 7 :
                    // src/parser/Music.g:333:54: 'sf'
                    {
                    match("sf"); 



                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FIGURE_NAME"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:334:21: ( '*' )
            // src/parser/Music.g:334:23: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "TIE"
    public final void mTIE() throws RecognitionException {
        try {
            int _type = TIE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:335:21: ( '~' )
            // src/parser/Music.g:335:23: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TIE"

    // $ANTLR start "BEAT"
    public final void mBEAT() throws RecognitionException {
        try {
            int _type = BEAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:336:21: ( 'Beat' )
            // src/parser/Music.g:336:23: 'Beat'
            {
            match("Beat"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BEAT"

    // $ANTLR start "SPEED"
    public final void mSPEED() throws RecognitionException {
        try {
            int _type = SPEED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:337:21: ( 'Speed' )
            // src/parser/Music.g:337:23: 'Speed'
            {
            match("Speed"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SPEED"

    // $ANTLR start "SONG"
    public final void mSONG() throws RecognitionException {
        try {
            int _type = SONG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:338:21: ( 'Song' )
            // src/parser/Music.g:338:23: 'Song'
            {
            match("Song"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SONG"

    // $ANTLR start "TRACK"
    public final void mTRACK() throws RecognitionException {
        try {
            int _type = TRACK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:339:21: ( 'Track' )
            // src/parser/Music.g:339:23: 'Track'
            {
            match("Track"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TRACK"

    // $ANTLR start "DRUMS_TRACK"
    public final void mDRUMS_TRACK() throws RecognitionException {
        try {
            int _type = DRUMS_TRACK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:340:21: ( 'Drums_Track' )
            // src/parser/Music.g:340:23: 'Drums_Track'
            {
            match("Drums_Track"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DRUMS_TRACK"

    // $ANTLR start "INSTRUMENT"
    public final void mINSTRUMENT() throws RecognitionException {
        try {
            int _type = INSTRUMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:341:21: ( 'Instrument' )
            // src/parser/Music.g:341:23: 'Instrument'
            {
            match("Instrument"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INSTRUMENT"

    // $ANTLR start "READ"
    public final void mREAD() throws RecognitionException {
        try {
            int _type = READ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:344:9: ( 'Read' )
            // src/parser/Music.g:344:11: 'Read'
            {
            match("Read"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "READ"

    // $ANTLR start "WRITE"
    public final void mWRITE() throws RecognitionException {
        try {
            int _type = WRITE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:345:9: ( 'Write' )
            // src/parser/Music.g:345:11: 'Write'
            {
            match("Write"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WRITE"

    // $ANTLR start "LETTER_X"
    public final void mLETTER_X() throws RecognitionException {
        try {
            int _type = LETTER_X;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:346:9: ( 'x' )
            // src/parser/Music.g:346:13: 'x'
            {
            match('x'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LETTER_X"

    // $ANTLR start "FRAGMENT"
    public final void mFRAGMENT() throws RecognitionException {
        try {
            int _type = FRAGMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:347:9: ( 'Fragment' )
            // src/parser/Music.g:347:11: 'Fragment'
            {
            match("Fragment"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FRAGMENT"

    // $ANTLR start "VOID"
    public final void mVOID() throws RecognitionException {
        try {
            int _type = VOID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:348:9: ( 'void' )
            // src/parser/Music.g:348:11: 'void'
            {
            match("void"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VOID"

    // $ANTLR start "EQUAL"
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:349:7: ( '==' )
            // src/parser/Music.g:349:9: '=='
            {
            match("=="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQUAL"

    // $ANTLR start "NOT_EQUAL"
    public final void mNOT_EQUAL() throws RecognitionException {
        try {
            int _type = NOT_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:350:10: ( '!=' )
            // src/parser/Music.g:350:12: '!='
            {
            match("!="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOT_EQUAL"

    // $ANTLR start "ASSIG"
    public final void mASSIG() throws RecognitionException {
        try {
            int _type = ASSIG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:351:6: ( '=' )
            // src/parser/Music.g:351:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ASSIG"

    // $ANTLR start "PLUS_ASSIG"
    public final void mPLUS_ASSIG() throws RecognitionException {
        try {
            int _type = PLUS_ASSIG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:352:11: ( '+=' )
            // src/parser/Music.g:352:13: '+='
            {
            match("+="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLUS_ASSIG"

    // $ANTLR start "MINUS_ASSIG"
    public final void mMINUS_ASSIG() throws RecognitionException {
        try {
            int _type = MINUS_ASSIG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:353:12: ( '-=' )
            // src/parser/Music.g:353:14: '-='
            {
            match("-="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MINUS_ASSIG"

    // $ANTLR start "PROD_ASSIG"
    public final void mPROD_ASSIG() throws RecognitionException {
        try {
            int _type = PROD_ASSIG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:354:11: ( '*=' )
            // src/parser/Music.g:354:13: '*='
            {
            match("*="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PROD_ASSIG"

    // $ANTLR start "DIVIDE_ASSIG"
    public final void mDIVIDE_ASSIG() throws RecognitionException {
        try {
            int _type = DIVIDE_ASSIG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:355:13: ( '/=' )
            // src/parser/Music.g:355:15: '/='
            {
            match("/="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIVIDE_ASSIG"

    // $ANTLR start "MOD_ASSIG"
    public final void mMOD_ASSIG() throws RecognitionException {
        try {
            int _type = MOD_ASSIG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:356:10: ( '%=' )
            // src/parser/Music.g:356:12: '%='
            {
            match("%="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MOD_ASSIG"

    // $ANTLR start "LT"
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:357:8: ( '<' )
            // src/parser/Music.g:357:10: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LT"

    // $ANTLR start "LE"
    public final void mLE() throws RecognitionException {
        try {
            int _type = LE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:358:8: ( '<=' )
            // src/parser/Music.g:358:10: '<='
            {
            match("<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LE"

    // $ANTLR start "GT"
    public final void mGT() throws RecognitionException {
        try {
            int _type = GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:359:8: ( '>' )
            // src/parser/Music.g:359:10: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GT"

    // $ANTLR start "GE"
    public final void mGE() throws RecognitionException {
        try {
            int _type = GE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:360:8: ( '>=' )
            // src/parser/Music.g:360:10: '>='
            {
            match(">="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GE"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:361:6: ( '+' )
            // src/parser/Music.g:361:8: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "INCR"
    public final void mINCR() throws RecognitionException {
        try {
            int _type = INCR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:362:9: ( '++' )
            // src/parser/Music.g:362:11: '++'
            {
            match("++"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INCR"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:363:7: ( '-' )
            // src/parser/Music.g:363:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "DECR"
    public final void mDECR() throws RecognitionException {
        try {
            int _type = DECR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:364:9: ( '--' )
            // src/parser/Music.g:364:11: '--'
            {
            match("--"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DECR"

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:365:9: ( '/' )
            // src/parser/Music.g:365:11: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIV"

    // $ANTLR start "MOD"
    public final void mMOD() throws RecognitionException {
        try {
            int _type = MOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:366:9: ( '%' )
            // src/parser/Music.g:366:11: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MOD"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:367:9: ( 'not' )
            // src/parser/Music.g:367:11: 'not'
            {
            match("not"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:368:9: ( 'and' )
            // src/parser/Music.g:368:11: 'and'
            {
            match("and"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:369:8: ( 'or' )
            // src/parser/Music.g:369:10: 'or'
            {
            match("or"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:370:6: ( 'if' )
            // src/parser/Music.g:370:8: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:371:6: ( 'else' )
            // src/parser/Music.g:371:8: 'else'
            {
            match("else"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "WHILE"
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:372:7: ( 'while' )
            // src/parser/Music.g:372:9: 'while'
            {
            match("while"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHILE"

    // $ANTLR start "FOR"
    public final void mFOR() throws RecognitionException {
        try {
            int _type = FOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:373:9: ( 'for' )
            // src/parser/Music.g:373:11: 'for'
            {
            match("for"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FOR"

    // $ANTLR start "RETURN"
    public final void mRETURN() throws RecognitionException {
        try {
            int _type = RETURN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:374:8: ( 'return' )
            // src/parser/Music.g:374:10: 'return'
            {
            match("return"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RETURN"

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:375:9: ( 'true' )
            // src/parser/Music.g:375:11: 'true'
            {
            match("true"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TRUE"

    // $ANTLR start "FALSE"
    public final void mFALSE() throws RecognitionException {
        try {
            int _type = FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:376:9: ( 'false' )
            // src/parser/Music.g:376:11: 'false'
            {
            match("false"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FALSE"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:377:9: ( 'int' )
            // src/parser/Music.g:377:11: 'int'
            {
            match("int"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "BOOL"
    public final void mBOOL() throws RecognitionException {
        try {
            int _type = BOOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:378:9: ( 'bool' )
            // src/parser/Music.g:378:11: 'bool'
            {
            match("bool"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BOOL"

    // $ANTLR start "STRING_TYPE"
    public final void mSTRING_TYPE() throws RecognitionException {
        try {
            int _type = STRING_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:379:13: ( 'string' )
            // src/parser/Music.g:379:15: 'string'
            {
            match("string"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING_TYPE"

    // $ANTLR start "ID_"
    public final void mID_() throws RecognitionException {
        try {
            int _type = ID_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:380:7: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // src/parser/Music.g:380:9: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // src/parser/Music.g:380:33: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'Z')||LA3_0=='_'||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // src/parser/Music.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID_"

    // $ANTLR start "POS_NUM"
    public final void mPOS_NUM() throws RecognitionException {
        try {
            int _type = POS_NUM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:381:9: ( ( '0' .. '9' )+ )
            // src/parser/Music.g:381:11: ( '0' .. '9' )+
            {
            // src/parser/Music.g:381:11: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // src/parser/Music.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "POS_NUM"

    // $ANTLR start "NEG_NUM"
    public final void mNEG_NUM() throws RecognitionException {
        try {
            int _type = NEG_NUM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:382:9: ( '-' ( '0' .. '9' )+ )
            // src/parser/Music.g:382:13: '-' ( '0' .. '9' )+
            {
            match('-'); 

            // src/parser/Music.g:382:17: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // src/parser/Music.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NEG_NUM"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:385:9: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='/') ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1=='/') ) {
                    alt9=1;
                }
                else if ( (LA9_1=='*') ) {
                    alt9=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }
            switch (alt9) {
                case 1 :
                    // src/parser/Music.g:385:11: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 



                    // src/parser/Music.g:385:16: (~ ( '\\n' | '\\r' ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0 >= '\u0000' && LA6_0 <= '\t')||(LA6_0 >= '\u000B' && LA6_0 <= '\f')||(LA6_0 >= '\u000E' && LA6_0 <= '\uFFFF')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // src/parser/Music.g:
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    // src/parser/Music.g:385:30: ( '\\r' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='\r') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // src/parser/Music.g:385:30: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }


                    match('\n'); 

                    _channel=HIDDEN;

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:386:5: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 



                    // src/parser/Music.g:386:10: ( options {greedy=false; } : . )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='*') ) {
                            int LA8_1 = input.LA(2);

                            if ( (LA8_1=='/') ) {
                                alt8=2;
                            }
                            else if ( ((LA8_1 >= '\u0000' && LA8_1 <= '.')||(LA8_1 >= '0' && LA8_1 <= '\uFFFF')) ) {
                                alt8=1;
                            }


                        }
                        else if ( ((LA8_0 >= '\u0000' && LA8_0 <= ')')||(LA8_0 >= '+' && LA8_0 <= '\uFFFF')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // src/parser/Music.g:386:38: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    match("*/"); 



                    _channel=HIDDEN;

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:390:9: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
            // src/parser/Music.g:390:12: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 

            // src/parser/Music.g:390:16: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
            loop10:
            do {
                int alt10=3;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='\\') ) {
                    alt10=1;
                }
                else if ( ((LA10_0 >= '\u0000' && LA10_0 <= '!')||(LA10_0 >= '#' && LA10_0 <= '[')||(LA10_0 >= ']' && LA10_0 <= '\uFFFF')) ) {
                    alt10=2;
                }


                switch (alt10) {
            	case 1 :
            	    // src/parser/Music.g:390:18: ESC_SEQ
            	    {
            	    mESC_SEQ(); 


            	    }
            	    break;
            	case 2 :
            	    // src/parser/Music.g:390:28: ~ ( '\\\\' | '\"' )
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "ESC_SEQ"
    public final void mESC_SEQ() throws RecognitionException {
        try {
            // src/parser/Music.g:396:2: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
            // src/parser/Music.g:396:6: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
            {
            match('\\'); 

            if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ESC_SEQ"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:399:6: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // src/parser/Music.g:399:8: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // src/parser/Music.g:1:8: ( T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | TONE | BAR | DOUBLE_BAR | START_REPETITION | END_REPETITION | CHORD | TRANSPORT | VOLUME | MINOR | DIMINUTION | MAJ7 | SEVENTH | NOTE_TYPE | DRUMS_NOTE_TYPE | FIGURE_TYPE | DN | NOTE | DRUMS | SUSTAIN | BEMOL | ARMOR | FIGURE_NAME | DOT | TIE | BEAT | SPEED | SONG | TRACK | DRUMS_TRACK | INSTRUMENT | READ | WRITE | LETTER_X | FRAGMENT | VOID | EQUAL | NOT_EQUAL | ASSIG | PLUS_ASSIG | MINUS_ASSIG | PROD_ASSIG | DIVIDE_ASSIG | MOD_ASSIG | LT | LE | GT | GE | PLUS | INCR | MINUS | DECR | DIV | MOD | NOT | AND | OR | IF | ELSE | WHILE | FOR | RETURN | TRUE | FALSE | INT | BOOL | STRING_TYPE | ID_ | POS_NUM | NEG_NUM | COMMENT | STRING | WS )
        int alt11=84;
        alt11 = dfa11.predict(input);
        switch (alt11) {
            case 1 :
                // src/parser/Music.g:1:10: T__102
                {
                mT__102(); 


                }
                break;
            case 2 :
                // src/parser/Music.g:1:17: T__103
                {
                mT__103(); 


                }
                break;
            case 3 :
                // src/parser/Music.g:1:24: T__104
                {
                mT__104(); 


                }
                break;
            case 4 :
                // src/parser/Music.g:1:31: T__105
                {
                mT__105(); 


                }
                break;
            case 5 :
                // src/parser/Music.g:1:38: T__106
                {
                mT__106(); 


                }
                break;
            case 6 :
                // src/parser/Music.g:1:45: T__107
                {
                mT__107(); 


                }
                break;
            case 7 :
                // src/parser/Music.g:1:52: T__108
                {
                mT__108(); 


                }
                break;
            case 8 :
                // src/parser/Music.g:1:59: T__109
                {
                mT__109(); 


                }
                break;
            case 9 :
                // src/parser/Music.g:1:66: T__110
                {
                mT__110(); 


                }
                break;
            case 10 :
                // src/parser/Music.g:1:73: T__111
                {
                mT__111(); 


                }
                break;
            case 11 :
                // src/parser/Music.g:1:80: T__112
                {
                mT__112(); 


                }
                break;
            case 12 :
                // src/parser/Music.g:1:87: T__113
                {
                mT__113(); 


                }
                break;
            case 13 :
                // src/parser/Music.g:1:94: TONE
                {
                mTONE(); 


                }
                break;
            case 14 :
                // src/parser/Music.g:1:99: BAR
                {
                mBAR(); 


                }
                break;
            case 15 :
                // src/parser/Music.g:1:103: DOUBLE_BAR
                {
                mDOUBLE_BAR(); 


                }
                break;
            case 16 :
                // src/parser/Music.g:1:114: START_REPETITION
                {
                mSTART_REPETITION(); 


                }
                break;
            case 17 :
                // src/parser/Music.g:1:131: END_REPETITION
                {
                mEND_REPETITION(); 


                }
                break;
            case 18 :
                // src/parser/Music.g:1:146: CHORD
                {
                mCHORD(); 


                }
                break;
            case 19 :
                // src/parser/Music.g:1:152: TRANSPORT
                {
                mTRANSPORT(); 


                }
                break;
            case 20 :
                // src/parser/Music.g:1:162: VOLUME
                {
                mVOLUME(); 


                }
                break;
            case 21 :
                // src/parser/Music.g:1:169: MINOR
                {
                mMINOR(); 


                }
                break;
            case 22 :
                // src/parser/Music.g:1:175: DIMINUTION
                {
                mDIMINUTION(); 


                }
                break;
            case 23 :
                // src/parser/Music.g:1:186: MAJ7
                {
                mMAJ7(); 


                }
                break;
            case 24 :
                // src/parser/Music.g:1:191: SEVENTH
                {
                mSEVENTH(); 


                }
                break;
            case 25 :
                // src/parser/Music.g:1:199: NOTE_TYPE
                {
                mNOTE_TYPE(); 


                }
                break;
            case 26 :
                // src/parser/Music.g:1:209: DRUMS_NOTE_TYPE
                {
                mDRUMS_NOTE_TYPE(); 


                }
                break;
            case 27 :
                // src/parser/Music.g:1:225: FIGURE_TYPE
                {
                mFIGURE_TYPE(); 


                }
                break;
            case 28 :
                // src/parser/Music.g:1:237: DN
                {
                mDN(); 


                }
                break;
            case 29 :
                // src/parser/Music.g:1:240: NOTE
                {
                mNOTE(); 


                }
                break;
            case 30 :
                // src/parser/Music.g:1:245: DRUMS
                {
                mDRUMS(); 


                }
                break;
            case 31 :
                // src/parser/Music.g:1:251: SUSTAIN
                {
                mSUSTAIN(); 


                }
                break;
            case 32 :
                // src/parser/Music.g:1:259: BEMOL
                {
                mBEMOL(); 


                }
                break;
            case 33 :
                // src/parser/Music.g:1:265: ARMOR
                {
                mARMOR(); 


                }
                break;
            case 34 :
                // src/parser/Music.g:1:271: FIGURE_NAME
                {
                mFIGURE_NAME(); 


                }
                break;
            case 35 :
                // src/parser/Music.g:1:283: DOT
                {
                mDOT(); 


                }
                break;
            case 36 :
                // src/parser/Music.g:1:287: TIE
                {
                mTIE(); 


                }
                break;
            case 37 :
                // src/parser/Music.g:1:291: BEAT
                {
                mBEAT(); 


                }
                break;
            case 38 :
                // src/parser/Music.g:1:296: SPEED
                {
                mSPEED(); 


                }
                break;
            case 39 :
                // src/parser/Music.g:1:302: SONG
                {
                mSONG(); 


                }
                break;
            case 40 :
                // src/parser/Music.g:1:307: TRACK
                {
                mTRACK(); 


                }
                break;
            case 41 :
                // src/parser/Music.g:1:313: DRUMS_TRACK
                {
                mDRUMS_TRACK(); 


                }
                break;
            case 42 :
                // src/parser/Music.g:1:325: INSTRUMENT
                {
                mINSTRUMENT(); 


                }
                break;
            case 43 :
                // src/parser/Music.g:1:336: READ
                {
                mREAD(); 


                }
                break;
            case 44 :
                // src/parser/Music.g:1:341: WRITE
                {
                mWRITE(); 


                }
                break;
            case 45 :
                // src/parser/Music.g:1:347: LETTER_X
                {
                mLETTER_X(); 


                }
                break;
            case 46 :
                // src/parser/Music.g:1:356: FRAGMENT
                {
                mFRAGMENT(); 


                }
                break;
            case 47 :
                // src/parser/Music.g:1:365: VOID
                {
                mVOID(); 


                }
                break;
            case 48 :
                // src/parser/Music.g:1:370: EQUAL
                {
                mEQUAL(); 


                }
                break;
            case 49 :
                // src/parser/Music.g:1:376: NOT_EQUAL
                {
                mNOT_EQUAL(); 


                }
                break;
            case 50 :
                // src/parser/Music.g:1:386: ASSIG
                {
                mASSIG(); 


                }
                break;
            case 51 :
                // src/parser/Music.g:1:392: PLUS_ASSIG
                {
                mPLUS_ASSIG(); 


                }
                break;
            case 52 :
                // src/parser/Music.g:1:403: MINUS_ASSIG
                {
                mMINUS_ASSIG(); 


                }
                break;
            case 53 :
                // src/parser/Music.g:1:415: PROD_ASSIG
                {
                mPROD_ASSIG(); 


                }
                break;
            case 54 :
                // src/parser/Music.g:1:426: DIVIDE_ASSIG
                {
                mDIVIDE_ASSIG(); 


                }
                break;
            case 55 :
                // src/parser/Music.g:1:439: MOD_ASSIG
                {
                mMOD_ASSIG(); 


                }
                break;
            case 56 :
                // src/parser/Music.g:1:449: LT
                {
                mLT(); 


                }
                break;
            case 57 :
                // src/parser/Music.g:1:452: LE
                {
                mLE(); 


                }
                break;
            case 58 :
                // src/parser/Music.g:1:455: GT
                {
                mGT(); 


                }
                break;
            case 59 :
                // src/parser/Music.g:1:458: GE
                {
                mGE(); 


                }
                break;
            case 60 :
                // src/parser/Music.g:1:461: PLUS
                {
                mPLUS(); 


                }
                break;
            case 61 :
                // src/parser/Music.g:1:466: INCR
                {
                mINCR(); 


                }
                break;
            case 62 :
                // src/parser/Music.g:1:471: MINUS
                {
                mMINUS(); 


                }
                break;
            case 63 :
                // src/parser/Music.g:1:477: DECR
                {
                mDECR(); 


                }
                break;
            case 64 :
                // src/parser/Music.g:1:482: DIV
                {
                mDIV(); 


                }
                break;
            case 65 :
                // src/parser/Music.g:1:486: MOD
                {
                mMOD(); 


                }
                break;
            case 66 :
                // src/parser/Music.g:1:490: NOT
                {
                mNOT(); 


                }
                break;
            case 67 :
                // src/parser/Music.g:1:494: AND
                {
                mAND(); 


                }
                break;
            case 68 :
                // src/parser/Music.g:1:498: OR
                {
                mOR(); 


                }
                break;
            case 69 :
                // src/parser/Music.g:1:501: IF
                {
                mIF(); 


                }
                break;
            case 70 :
                // src/parser/Music.g:1:504: ELSE
                {
                mELSE(); 


                }
                break;
            case 71 :
                // src/parser/Music.g:1:509: WHILE
                {
                mWHILE(); 


                }
                break;
            case 72 :
                // src/parser/Music.g:1:515: FOR
                {
                mFOR(); 


                }
                break;
            case 73 :
                // src/parser/Music.g:1:519: RETURN
                {
                mRETURN(); 


                }
                break;
            case 74 :
                // src/parser/Music.g:1:526: TRUE
                {
                mTRUE(); 


                }
                break;
            case 75 :
                // src/parser/Music.g:1:531: FALSE
                {
                mFALSE(); 


                }
                break;
            case 76 :
                // src/parser/Music.g:1:537: INT
                {
                mINT(); 


                }
                break;
            case 77 :
                // src/parser/Music.g:1:541: BOOL
                {
                mBOOL(); 


                }
                break;
            case 78 :
                // src/parser/Music.g:1:546: STRING_TYPE
                {
                mSTRING_TYPE(); 


                }
                break;
            case 79 :
                // src/parser/Music.g:1:558: ID_
                {
                mID_(); 


                }
                break;
            case 80 :
                // src/parser/Music.g:1:562: POS_NUM
                {
                mPOS_NUM(); 


                }
                break;
            case 81 :
                // src/parser/Music.g:1:570: NEG_NUM
                {
                mNEG_NUM(); 


                }
                break;
            case 82 :
                // src/parser/Music.g:1:578: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 83 :
                // src/parser/Music.g:1:586: STRING
                {
                mSTRING(); 


                }
                break;
            case 84 :
                // src/parser/Music.g:1:593: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA11_eotS =
        "\5\uffff\1\74\1\uffff\2\67\4\uffff\1\67\1\106\2\67\1\112\1\uffff"+
        "\1\70\5\67\3\uffff\4\126\1\67\1\126\1\137\1\uffff\3\67\1\143\1\67"+
        "\1\146\1\uffff\1\151\1\154\1\160\1\162\1\164\1\166\6\67\7\uffff"+
        "\1\67\1\177\1\67\1\uffff\3\67\1\u0085\1\uffff\3\67\2\uffff\1\67"+
        "\1\u008a\3\177\1\67\1\177\1\67\1\177\1\67\1\uffff\2\67\2\126\3\67"+
        "\2\uffff\3\67\1\uffff\1\67\22\uffff\1\67\1\u009b\1\u009c\5\67\1"+
        "\uffff\4\67\2\uffff\4\67\1\uffff\1\67\1\177\5\67\1\u00b1\1\67\1"+
        "\u00b3\5\67\1\u00b9\2\uffff\1\u00ba\5\67\1\u00c0\1\u00c1\4\67\1"+
        "\u00c6\1\67\1\u00c8\1\u00c9\3\67\1\u00cd\1\uffff\1\67\1\uffff\1"+
        "\67\1\u00d0\2\67\1\u00d3\2\uffff\1\u00d4\1\67\1\u00d6\2\67\2\uffff"+
        "\1\67\1\u00da\1\u00db\1\67\1\uffff\1\u00df\2\uffff\1\67\1\u00e1"+
        "\1\67\1\uffff\1\67\1\u00e4\1\uffff\1\67\1\u00e6\2\uffff\1\u00e7"+
        "\1\uffff\1\u00e8\2\67\2\uffff\1\u00eb\2\67\1\uffff\1\67\1\uffff"+
        "\1\u00ef\1\u00f0\1\uffff\1\67\3\uffff\2\67\1\uffff\2\67\1\177\2"+
        "\uffff\1\67\1\u00f7\4\67\1\uffff\1\u00fc\1\u00fd\2\67\2\uffff\1"+
        "\67\1\u0101\1\u0102\2\uffff";
    static final String DFA11_eofS =
        "\u0103\uffff";
    static final String DFA11_minS =
        "\1\11\4\uffff\1\174\1\uffff\2\72\4\uffff\1\157\1\174\1\150\1\157"+
        "\1\60\1\uffff\1\164\1\116\1\145\2\151\1\141\3\uffff\4\60\1\143\1"+
        "\60\1\75\1\uffff\1\145\1\156\1\162\1\60\1\157\1\75\1\uffff\1\53"+
        "\1\55\1\52\3\75\1\156\1\162\1\146\1\154\1\150\1\162\7\uffff\1\147"+
        "\1\60\1\141\1\uffff\1\164\1\156\1\141\1\72\1\uffff\1\157\1\154\1"+
        "\152\2\uffff\1\165\4\60\1\154\1\60\1\145\1\60\1\164\1\uffff\1\157"+
        "\1\164\2\60\2\162\1\154\2\uffff\1\141\1\163\1\151\1\uffff\1\151"+
        "\22\uffff\1\144\2\60\1\164\1\163\1\151\2\165\1\uffff\1\147\2\145"+
        "\1\143\2\uffff\1\162\1\165\1\67\1\155\1\uffff\1\144\1\60\1\147\2"+
        "\145\1\165\1\154\1\60\1\151\1\60\1\163\3\164\1\144\1\60\2\uffff"+
        "\1\60\1\145\1\154\1\145\1\162\1\155\2\60\1\163\1\153\1\144\1\155"+
        "\1\60\1\163\2\60\1\156\1\144\1\162\1\60\1\uffff\1\156\1\uffff\1"+
        "\145\1\60\1\162\1\145\1\60\2\uffff\1\60\1\145\1\60\2\145\2\uffff"+
        "\1\160\2\60\1\145\1\uffff\1\60\2\uffff\1\143\1\60\1\156\1\uffff"+
        "\1\147\1\60\1\uffff\1\165\1\60\2\uffff\1\60\1\uffff\1\60\1\156\1"+
        "\157\2\uffff\1\60\1\157\1\124\1\uffff\1\145\1\uffff\2\60\1\uffff"+
        "\1\155\3\uffff\1\164\1\162\1\uffff\1\164\1\162\1\60\2\uffff\1\145"+
        "\1\60\1\164\1\145\1\141\1\156\1\uffff\2\60\1\143\1\164\2\uffff\1"+
        "\153\2\60\2\uffff";
    static final String DFA11_maxS =
        "\1\u00c2\4\uffff\1\174\1\uffff\1\162\1\157\4\uffff\1\162\1\174\1"+
        "\150\1\157\1\172\1\uffff\1\164\1\162\1\145\1\151\1\160\1\141\3\uffff"+
        "\4\172\1\164\1\172\1\75\1\uffff\1\145\1\156\1\162\1\172\1\157\1"+
        "\75\1\uffff\6\75\1\156\1\162\1\156\1\154\1\150\1\162\7\uffff\1\147"+
        "\1\172\1\141\1\uffff\1\164\1\156\1\141\1\72\1\uffff\1\157\1\154"+
        "\1\152\2\uffff\1\165\4\172\1\156\1\172\1\145\1\172\1\164\1\uffff"+
        "\1\157\1\164\2\172\2\162\1\154\2\uffff\1\141\1\163\1\151\1\uffff"+
        "\1\151\22\uffff\1\144\2\172\1\164\1\163\1\151\2\165\1\uffff\1\147"+
        "\2\145\1\156\2\uffff\1\162\1\165\1\67\1\155\1\uffff\1\144\1\172"+
        "\1\147\2\145\1\165\1\154\1\172\1\151\1\172\1\163\3\164\1\144\1\172"+
        "\2\uffff\1\172\1\145\1\154\1\145\1\162\1\155\2\172\1\163\1\153\1"+
        "\144\1\155\1\172\1\163\2\172\1\156\1\144\1\162\1\172\1\uffff\1\156"+
        "\1\uffff\1\145\1\172\1\162\1\145\1\172\2\uffff\1\172\1\145\1\172"+
        "\2\145\2\uffff\1\160\2\172\1\145\1\uffff\1\172\2\uffff\1\143\1\172"+
        "\1\156\1\uffff\1\147\1\172\1\uffff\1\165\1\172\2\uffff\1\172\1\uffff"+
        "\1\172\1\156\1\157\2\uffff\1\172\1\157\1\124\1\uffff\1\145\1\uffff"+
        "\2\172\1\uffff\1\155\3\uffff\1\164\1\162\1\uffff\1\164\1\162\1\172"+
        "\2\uffff\1\145\1\172\1\164\1\145\1\141\1\156\1\uffff\2\172\1\143"+
        "\1\164\2\uffff\1\153\2\172\2\uffff";
    static final String DFA11_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\6\2\uffff\1\11\1\12\1\13\1\14"+
        "\5\uffff\1\26\6\uffff\1\37\1\40\1\41\7\uffff\1\44\6\uffff\1\61\14"+
        "\uffff\1\117\1\120\1\123\1\124\1\21\1\5\1\7\3\uffff\1\10\4\uffff"+
        "\1\16\3\uffff\1\25\1\30\12\uffff\1\42\7\uffff\1\65\1\43\3\uffff"+
        "\1\55\1\uffff\1\60\1\62\1\63\1\75\1\74\1\64\1\77\1\76\1\121\1\66"+
        "\1\122\1\100\1\67\1\101\1\71\1\70\1\73\1\72\10\uffff\1\35\4\uffff"+
        "\1\20\1\17\4\uffff\1\34\20\uffff\1\104\1\105\24\uffff\1\102\1\uffff"+
        "\1\110\5\uffff\1\103\1\114\5\uffff\1\31\1\15\4\uffff\1\27\1\uffff"+
        "\1\53\1\47\3\uffff\1\115\2\uffff\1\45\2\uffff\1\57\1\106\1\uffff"+
        "\1\112\3\uffff\1\50\1\22\3\uffff\1\36\1\uffff\1\46\2\uffff\1\113"+
        "\1\uffff\1\54\1\107\1\33\2\uffff\1\24\3\uffff\1\111\1\116\6\uffff"+
        "\1\56\4\uffff\1\23\1\32\3\uffff\1\52\1\51";
    static final String DFA11_specialS =
        "\u0103\uffff}>";
    static final String[] DFA11_transitionS = {
            "\2\72\2\uffff\1\72\22\uffff\1\72\1\52\1\71\1\31\1\33\1\56\1"+
            "\32\1\uffff\1\1\1\2\1\42\1\53\1\3\1\54\1\4\1\55\7\70\1\23\2"+
            "\70\1\5\1\6\1\57\1\51\1\60\2\uffff\1\67\1\44\1\17\1\24\1\67"+
            "\1\7\2\67\1\45\2\67\1\30\1\26\1\10\3\67\1\25\1\27\1\15\1\67"+
            "\1\20\1\46\3\67\1\11\1\uffff\1\12\1\uffff\1\67\1\uffff\1\61"+
            "\1\35\1\37\1\67\1\64\1\41\2\67\1\63\3\67\1\21\1\36\1\62\2\67"+
            "\1\34\1\40\1\66\1\67\1\50\1\65\1\47\2\67\1\13\1\16\1\14\1\43"+
            "\103\uffff\1\22",
            "",
            "",
            "",
            "",
            "\1\73",
            "",
            "\1\75\46\uffff\1\77\7\uffff\1\76\10\uffff\1\100",
            "\1\101\64\uffff\1\102",
            "",
            "",
            "",
            "",
            "\1\103\2\uffff\1\104",
            "\1\105",
            "\1\107",
            "\1\110",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\1\111\31\67",
            "",
            "\1\113",
            "\1\115\40\uffff\1\116\2\uffff\1\114",
            "\1\117",
            "\1\120",
            "\1\122\5\uffff\1\121\1\123",
            "\1\124",
            "",
            "",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\4\67\1\125\25\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\16\67\1\127\13\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\16\67\1\130\13\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\131\2\uffff\1\132\15\uffff\1\133",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\1\135\15\67\1\134"+
            "\13\67",
            "\1\136",
            "",
            "\1\140",
            "\1\141",
            "\1\142",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\144",
            "\1\145",
            "",
            "\1\150\21\uffff\1\147",
            "\1\153\2\uffff\12\155\3\uffff\1\152",
            "\1\157\4\uffff\1\157\15\uffff\1\156",
            "\1\161",
            "\1\163",
            "\1\165",
            "\1\167",
            "\1\170",
            "\1\171\7\uffff\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\176",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u0080",
            "",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "",
            "",
            "\1\u0089",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\1\u008b\31\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u008c\1\uffff\1\u008d",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\13\67\1\u008e\16"+
            "\67",
            "\1\u008f",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u0090",
            "",
            "\1\u0091",
            "\1\u0092",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "",
            "",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "",
            "\1\u0099",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u009a",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a6\12\uffff\1\u00a5",
            "",
            "",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "",
            "\1\u00ab",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u00b2",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u00c7",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "\1\u00ce",
            "",
            "\1\u00cf",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u00d1",
            "\1\u00d2",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u00d5",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u00d7",
            "\1\u00d8",
            "",
            "",
            "\1\u00d9",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u00dc",
            "",
            "\12\67\7\uffff\15\67\1\u00dd\14\67\4\uffff\1\u00de\1\uffff"+
            "\32\67",
            "",
            "",
            "\1\u00e0",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u00e2",
            "",
            "\1\u00e3",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "\1\u00e5",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u00e9",
            "\1\u00ea",
            "",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u00ec",
            "\1\u00ed",
            "",
            "\1\u00ee",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "\1\u00f1",
            "",
            "",
            "",
            "\1\u00f2",
            "\1\u00f3",
            "",
            "\1\u00f4",
            "\1\u00f5",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "",
            "\1\u00f6",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u00fe",
            "\1\u00ff",
            "",
            "",
            "\1\u0100",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | TONE | BAR | DOUBLE_BAR | START_REPETITION | END_REPETITION | CHORD | TRANSPORT | VOLUME | MINOR | DIMINUTION | MAJ7 | SEVENTH | NOTE_TYPE | DRUMS_NOTE_TYPE | FIGURE_TYPE | DN | NOTE | DRUMS | SUSTAIN | BEMOL | ARMOR | FIGURE_NAME | DOT | TIE | BEAT | SPEED | SONG | TRACK | DRUMS_TRACK | INSTRUMENT | READ | WRITE | LETTER_X | FRAGMENT | VOID | EQUAL | NOT_EQUAL | ASSIG | PLUS_ASSIG | MINUS_ASSIG | PROD_ASSIG | DIVIDE_ASSIG | MOD_ASSIG | LT | LE | GT | GE | PLUS | INCR | MINUS | DECR | DIV | MOD | NOT | AND | OR | IF | ELSE | WHILE | FOR | RETURN | TRUE | FALSE | INT | BOOL | STRING_TYPE | ID_ | POS_NUM | NEG_NUM | COMMENT | STRING | WS );";
        }
    }
 

}