// $ANTLR 3.4 src/parser/Music.g 2017-04-25 20:05:47

    package parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class MusicLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__89=89;
    public static final int T__90=90;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__95=95;
    public static final int T__96=96;
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
    public static final int DOT=21;
    public static final int DOUBLE_BAR=22;
    public static final int DRUMS=23;
    public static final int DRUMS_NOTE_TYPE=24;
    public static final int DRUMS_TRACK=25;
    public static final int ELSE=26;
    public static final int ELSEIF=27;
    public static final int END_REPETITION=28;
    public static final int EQUAL=29;
    public static final int ESC_SEQ=30;
    public static final int FALSE=31;
    public static final int FIGURE=32;
    public static final int FOR=33;
    public static final int FRAGMENT=34;
    public static final int FUNCALL=35;
    public static final int FUNCTION=36;
    public static final int GE=37;
    public static final int GT=38;
    public static final int ID=39;
    public static final int IF=40;
    public static final int INCR=41;
    public static final int INSTRUMENT=42;
    public static final int INT=43;
    public static final int LE=44;
    public static final int LETTER_X=45;
    public static final int LIST_ARGUMENTS=46;
    public static final int LIST_ASSIG=47;
    public static final int LIST_FUNCTIONS=48;
    public static final int LIST_INSTRUCTIONS=49;
    public static final int LIST_MUSIC_INST=50;
    public static final int LT=51;
    public static final int MAJ7=52;
    public static final int MINOR=53;
    public static final int MINUS=54;
    public static final int MINUS_ASSIG=55;
    public static final int MOD=56;
    public static final int MOD_ASSIG=57;
    public static final int NOT=58;
    public static final int NOTE=59;
    public static final int NOTES=60;
    public static final int NOTE_LIST=61;
    public static final int NOTE_TYPE=62;
    public static final int NOT_EQUAL=63;
    public static final int NUM=64;
    public static final int OR=65;
    public static final int PLUS=66;
    public static final int PLUS_ASSIG=67;
    public static final int POST=68;
    public static final int PRE=69;
    public static final int PROD_ASSIG=70;
    public static final int REPETITION=71;
    public static final int RETURN=72;
    public static final int SEVENTH=73;
    public static final int SONG=74;
    public static final int SPEED=75;
    public static final int START_REPETITION=76;
    public static final int STRING=77;
    public static final int STRING_TYPE=78;
    public static final int SUSTAIN=79;
    public static final int TIE=80;
    public static final int TONE=81;
    public static final int TRACK=82;
    public static final int TRANSPORT=83;
    public static final int TRUE=84;
    public static final int VAR_FUNCALL=85;
    public static final int VOID=86;
    public static final int WHILE=87;
    public static final int WS=88;

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

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:6:7: ( '(' )
            // src/parser/Music.g:6:9: '('
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
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:7:7: ( ')' )
            // src/parser/Music.g:7:9: ')'
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
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:8:7: ( ',' )
            // src/parser/Music.g:8:9: ','
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
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:9:7: ( '.' )
            // src/parser/Music.g:9:9: '.'
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
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:10:7: ( ':' )
            // src/parser/Music.g:10:9: ':'
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
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:11:7: ( ';' )
            // src/parser/Music.g:11:9: ';'
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
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:12:7: ( '{' )
            // src/parser/Music.g:12:9: '{'
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
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:13:7: ( '}' )
            // src/parser/Music.g:13:9: '}'
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
    // $ANTLR end "T__96"

    // $ANTLR start "TONE"
    public final void mTONE() throws RecognitionException {
        try {
            int _type = TONE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:267:21: ( 'Tone' )
            // src/parser/Music.g:267:23: 'Tone'
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
            // src/parser/Music.g:268:21: ( '|' )
            // src/parser/Music.g:268:23: '|'
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
            // src/parser/Music.g:269:22: ( '||' )
            // src/parser/Music.g:269:24: '||'
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
            // src/parser/Music.g:270:21: ( '||:' )
            // src/parser/Music.g:270:23: '||:'
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
            // src/parser/Music.g:271:21: ( ':||' )
            // src/parser/Music.g:271:23: ':||'
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
            // src/parser/Music.g:272:21: ( 'Chord' )
            // src/parser/Music.g:272:23: 'Chord'
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
            // src/parser/Music.g:273:21: ( 'Transport' )
            // src/parser/Music.g:273:23: 'Transport'
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

    // $ANTLR start "MINOR"
    public final void mMINOR() throws RecognitionException {
        try {
            int _type = MINOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:274:21: ( 'm' )
            // src/parser/Music.g:274:23: 'm'
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
            // src/parser/Music.g:275:21: ( 'º' )
            // src/parser/Music.g:275:23: 'º'
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
            // src/parser/Music.g:276:21: ( 'maj7' )
            // src/parser/Music.g:276:23: 'maj7'
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
            // src/parser/Music.g:277:21: ( '7th' )
            // src/parser/Music.g:277:23: '7th'
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
            // src/parser/Music.g:278:21: ( 'Note' )
            // src/parser/Music.g:278:23: 'Note'
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
            // src/parser/Music.g:279:21: ( 'DrumsNote' )
            // src/parser/Music.g:279:23: 'DrumsNote'
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

    // $ANTLR start "NOTE"
    public final void mNOTE() throws RecognitionException {
        try {
            int _type = NOTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:280:21: ( ( 'Do' | 'Re' | 'Mi' | 'Fa' | 'Sol' | 'La' | 'Si' | 'Silence' ) )
            // src/parser/Music.g:280:23: ( 'Do' | 'Re' | 'Mi' | 'Fa' | 'Sol' | 'La' | 'Si' | 'Silence' )
            {
            // src/parser/Music.g:280:23: ( 'Do' | 'Re' | 'Mi' | 'Fa' | 'Sol' | 'La' | 'Si' | 'Silence' )
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
                    // src/parser/Music.g:280:24: 'Do'
                    {
                    match("Do"); 



                    }
                    break;
                case 2 :
                    // src/parser/Music.g:280:29: 'Re'
                    {
                    match("Re"); 



                    }
                    break;
                case 3 :
                    // src/parser/Music.g:280:34: 'Mi'
                    {
                    match("Mi"); 



                    }
                    break;
                case 4 :
                    // src/parser/Music.g:280:39: 'Fa'
                    {
                    match("Fa"); 



                    }
                    break;
                case 5 :
                    // src/parser/Music.g:280:44: 'Sol'
                    {
                    match("Sol"); 



                    }
                    break;
                case 6 :
                    // src/parser/Music.g:280:50: 'La'
                    {
                    match("La"); 



                    }
                    break;
                case 7 :
                    // src/parser/Music.g:280:55: 'Si'
                    {
                    match("Si"); 



                    }
                    break;
                case 8 :
                    // src/parser/Music.g:280:60: 'Silence'
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
            // src/parser/Music.g:281:21: ( 'Drums' )
            // src/parser/Music.g:281:23: 'Drums'
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
            // src/parser/Music.g:282:21: ( '#' )
            // src/parser/Music.g:282:23: '#'
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
            // src/parser/Music.g:283:21: ( '&' )
            // src/parser/Music.g:283:23: '&'
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
            // src/parser/Music.g:284:21: ( '$' )
            // src/parser/Music.g:284:23: '$'
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

    // $ANTLR start "FIGURE"
    public final void mFIGURE() throws RecognitionException {
        try {
            int _type = FIGURE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:285:21: ( ( 'r' | 'b' | 'n' | 'c' | 'sc' | 'f' | 'sf' ) )
            // src/parser/Music.g:285:23: ( 'r' | 'b' | 'n' | 'c' | 'sc' | 'f' | 'sf' )
            {
            // src/parser/Music.g:285:23: ( 'r' | 'b' | 'n' | 'c' | 'sc' | 'f' | 'sf' )
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
                    // src/parser/Music.g:285:24: 'r'
                    {
                    match('r'); 

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:285:28: 'b'
                    {
                    match('b'); 

                    }
                    break;
                case 3 :
                    // src/parser/Music.g:285:32: 'n'
                    {
                    match('n'); 

                    }
                    break;
                case 4 :
                    // src/parser/Music.g:285:36: 'c'
                    {
                    match('c'); 

                    }
                    break;
                case 5 :
                    // src/parser/Music.g:285:40: 'sc'
                    {
                    match("sc"); 



                    }
                    break;
                case 6 :
                    // src/parser/Music.g:285:45: 'f'
                    {
                    match('f'); 

                    }
                    break;
                case 7 :
                    // src/parser/Music.g:285:49: 'sf'
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
    // $ANTLR end "FIGURE"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:286:21: ( '*' )
            // src/parser/Music.g:286:23: '*'
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
            // src/parser/Music.g:287:21: ( '~' )
            // src/parser/Music.g:287:23: '~'
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
            // src/parser/Music.g:288:21: ( 'Beat' )
            // src/parser/Music.g:288:23: 'Beat'
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
            // src/parser/Music.g:289:21: ( 'Speed' )
            // src/parser/Music.g:289:23: 'Speed'
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
            // src/parser/Music.g:290:21: ( 'Song' )
            // src/parser/Music.g:290:23: 'Song'
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
            // src/parser/Music.g:291:21: ( 'Track' )
            // src/parser/Music.g:291:23: 'Track'
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
            // src/parser/Music.g:292:21: ( 'Drums_Track' )
            // src/parser/Music.g:292:23: 'Drums_Track'
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
            // src/parser/Music.g:293:21: ( 'Instrument' )
            // src/parser/Music.g:293:23: 'Instrument'
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

    // $ANTLR start "LETTER_X"
    public final void mLETTER_X() throws RecognitionException {
        try {
            int _type = LETTER_X;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:296:9: ( 'x' )
            // src/parser/Music.g:296:13: 'x'
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
            // src/parser/Music.g:297:9: ( 'fragment' )
            // src/parser/Music.g:297:11: 'fragment'
            {
            match("fragment"); 



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
            // src/parser/Music.g:298:9: ( 'void' )
            // src/parser/Music.g:298:11: 'void'
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
            // src/parser/Music.g:299:7: ( '==' )
            // src/parser/Music.g:299:9: '=='
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
            // src/parser/Music.g:300:10: ( '!=' )
            // src/parser/Music.g:300:12: '!='
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
            // src/parser/Music.g:301:6: ( '=' )
            // src/parser/Music.g:301:9: '='
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
            // src/parser/Music.g:302:11: ( '+=' )
            // src/parser/Music.g:302:13: '+='
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
            // src/parser/Music.g:303:12: ( '-=' )
            // src/parser/Music.g:303:14: '-='
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
            // src/parser/Music.g:304:11: ( '*=' )
            // src/parser/Music.g:304:13: '*='
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
            // src/parser/Music.g:305:13: ( '/=' )
            // src/parser/Music.g:305:15: '/='
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
            // src/parser/Music.g:306:10: ( '%=' )
            // src/parser/Music.g:306:12: '%='
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
            // src/parser/Music.g:307:8: ( '<' )
            // src/parser/Music.g:307:10: '<'
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
            // src/parser/Music.g:308:8: ( '<=' )
            // src/parser/Music.g:308:10: '<='
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
            // src/parser/Music.g:309:8: ( '>' )
            // src/parser/Music.g:309:10: '>'
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
            // src/parser/Music.g:310:8: ( '>=' )
            // src/parser/Music.g:310:10: '>='
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
            // src/parser/Music.g:311:6: ( '+' )
            // src/parser/Music.g:311:8: '+'
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
            // src/parser/Music.g:312:9: ( '++' )
            // src/parser/Music.g:312:11: '++'
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
            // src/parser/Music.g:313:7: ( '-' )
            // src/parser/Music.g:313:9: '-'
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
            // src/parser/Music.g:314:9: ( '--' )
            // src/parser/Music.g:314:11: '--'
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
            // src/parser/Music.g:315:9: ( '/' )
            // src/parser/Music.g:315:11: '/'
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
            // src/parser/Music.g:316:9: ( '%' )
            // src/parser/Music.g:316:11: '%'
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
            // src/parser/Music.g:317:9: ( 'not' )
            // src/parser/Music.g:317:11: 'not'
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
            // src/parser/Music.g:318:9: ( 'and' )
            // src/parser/Music.g:318:11: 'and'
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
            // src/parser/Music.g:319:8: ( 'or' )
            // src/parser/Music.g:319:10: 'or'
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
            // src/parser/Music.g:320:6: ( 'if' )
            // src/parser/Music.g:320:8: 'if'
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
            // src/parser/Music.g:321:6: ( 'else' )
            // src/parser/Music.g:321:8: 'else'
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
            // src/parser/Music.g:322:7: ( 'while' )
            // src/parser/Music.g:322:9: 'while'
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
            // src/parser/Music.g:323:9: ( 'for' )
            // src/parser/Music.g:323:11: 'for'
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
            // src/parser/Music.g:324:8: ( 'return' )
            // src/parser/Music.g:324:10: 'return'
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
            // src/parser/Music.g:325:9: ( 'true' )
            // src/parser/Music.g:325:11: 'true'
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
            // src/parser/Music.g:326:9: ( 'false' )
            // src/parser/Music.g:326:11: 'false'
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
            // src/parser/Music.g:327:9: ( 'int' )
            // src/parser/Music.g:327:11: 'int'
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
            // src/parser/Music.g:328:9: ( 'bool' )
            // src/parser/Music.g:328:11: 'bool'
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
            // src/parser/Music.g:329:13: ( 'string' )
            // src/parser/Music.g:329:15: 'string'
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

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:330:6: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // src/parser/Music.g:330:8: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // src/parser/Music.g:330:32: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
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
    // $ANTLR end "ID"

    // $ANTLR start "NUM"
    public final void mNUM() throws RecognitionException {
        try {
            int _type = NUM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:331:6: ( ( '-' )? ( '0' .. '9' )+ )
            // src/parser/Music.g:331:8: ( '-' )? ( '0' .. '9' )+
            {
            // src/parser/Music.g:331:8: ( '-' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='-') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // src/parser/Music.g:331:8: '-'
                    {
                    match('-'); 

                    }
                    break;

            }


            // src/parser/Music.g:331:13: ( '0' .. '9' )+
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
    // $ANTLR end "NUM"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:334:9: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
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
                    // src/parser/Music.g:334:11: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 



                    // src/parser/Music.g:334:16: (~ ( '\\n' | '\\r' ) )*
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


                    // src/parser/Music.g:334:30: ( '\\r' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='\r') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // src/parser/Music.g:334:30: '\\r'
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
                    // src/parser/Music.g:335:5: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 



                    // src/parser/Music.g:335:10: ( options {greedy=false; } : . )*
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
                    	    // src/parser/Music.g:335:38: .
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
            // src/parser/Music.g:339:9: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
            // src/parser/Music.g:339:12: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 

            // src/parser/Music.g:339:16: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
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
            	    // src/parser/Music.g:339:18: ESC_SEQ
            	    {
            	    mESC_SEQ(); 


            	    }
            	    break;
            	case 2 :
            	    // src/parser/Music.g:339:28: ~ ( '\\\\' | '\"' )
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
            // src/parser/Music.g:345:2: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
            // src/parser/Music.g:345:6: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
            // src/parser/Music.g:348:6: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // src/parser/Music.g:348:8: ( ' ' | '\\t' | '\\r' | '\\n' )
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
        // src/parser/Music.g:1:8: ( T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | TONE | BAR | DOUBLE_BAR | START_REPETITION | END_REPETITION | CHORD | TRANSPORT | MINOR | DIMINUTION | MAJ7 | SEVENTH | NOTE_TYPE | DRUMS_NOTE_TYPE | NOTE | DRUMS | SUSTAIN | BEMOL | ARMOR | FIGURE | DOT | TIE | BEAT | SPEED | SONG | TRACK | DRUMS_TRACK | INSTRUMENT | LETTER_X | FRAGMENT | VOID | EQUAL | NOT_EQUAL | ASSIG | PLUS_ASSIG | MINUS_ASSIG | PROD_ASSIG | DIVIDE_ASSIG | MOD_ASSIG | LT | LE | GT | GE | PLUS | INCR | MINUS | DECR | DIV | MOD | NOT | AND | OR | IF | ELSE | WHILE | FOR | RETURN | TRUE | FALSE | INT | BOOL | STRING_TYPE | ID | NUM | COMMENT | STRING | WS )
        int alt11=74;
        alt11 = dfa11.predict(input);
        switch (alt11) {
            case 1 :
                // src/parser/Music.g:1:10: T__89
                {
                mT__89(); 


                }
                break;
            case 2 :
                // src/parser/Music.g:1:16: T__90
                {
                mT__90(); 


                }
                break;
            case 3 :
                // src/parser/Music.g:1:22: T__91
                {
                mT__91(); 


                }
                break;
            case 4 :
                // src/parser/Music.g:1:28: T__92
                {
                mT__92(); 


                }
                break;
            case 5 :
                // src/parser/Music.g:1:34: T__93
                {
                mT__93(); 


                }
                break;
            case 6 :
                // src/parser/Music.g:1:40: T__94
                {
                mT__94(); 


                }
                break;
            case 7 :
                // src/parser/Music.g:1:46: T__95
                {
                mT__95(); 


                }
                break;
            case 8 :
                // src/parser/Music.g:1:52: T__96
                {
                mT__96(); 


                }
                break;
            case 9 :
                // src/parser/Music.g:1:58: TONE
                {
                mTONE(); 


                }
                break;
            case 10 :
                // src/parser/Music.g:1:63: BAR
                {
                mBAR(); 


                }
                break;
            case 11 :
                // src/parser/Music.g:1:67: DOUBLE_BAR
                {
                mDOUBLE_BAR(); 


                }
                break;
            case 12 :
                // src/parser/Music.g:1:78: START_REPETITION
                {
                mSTART_REPETITION(); 


                }
                break;
            case 13 :
                // src/parser/Music.g:1:95: END_REPETITION
                {
                mEND_REPETITION(); 


                }
                break;
            case 14 :
                // src/parser/Music.g:1:110: CHORD
                {
                mCHORD(); 


                }
                break;
            case 15 :
                // src/parser/Music.g:1:116: TRANSPORT
                {
                mTRANSPORT(); 


                }
                break;
            case 16 :
                // src/parser/Music.g:1:126: MINOR
                {
                mMINOR(); 


                }
                break;
            case 17 :
                // src/parser/Music.g:1:132: DIMINUTION
                {
                mDIMINUTION(); 


                }
                break;
            case 18 :
                // src/parser/Music.g:1:143: MAJ7
                {
                mMAJ7(); 


                }
                break;
            case 19 :
                // src/parser/Music.g:1:148: SEVENTH
                {
                mSEVENTH(); 


                }
                break;
            case 20 :
                // src/parser/Music.g:1:156: NOTE_TYPE
                {
                mNOTE_TYPE(); 


                }
                break;
            case 21 :
                // src/parser/Music.g:1:166: DRUMS_NOTE_TYPE
                {
                mDRUMS_NOTE_TYPE(); 


                }
                break;
            case 22 :
                // src/parser/Music.g:1:182: NOTE
                {
                mNOTE(); 


                }
                break;
            case 23 :
                // src/parser/Music.g:1:187: DRUMS
                {
                mDRUMS(); 


                }
                break;
            case 24 :
                // src/parser/Music.g:1:193: SUSTAIN
                {
                mSUSTAIN(); 


                }
                break;
            case 25 :
                // src/parser/Music.g:1:201: BEMOL
                {
                mBEMOL(); 


                }
                break;
            case 26 :
                // src/parser/Music.g:1:207: ARMOR
                {
                mARMOR(); 


                }
                break;
            case 27 :
                // src/parser/Music.g:1:213: FIGURE
                {
                mFIGURE(); 


                }
                break;
            case 28 :
                // src/parser/Music.g:1:220: DOT
                {
                mDOT(); 


                }
                break;
            case 29 :
                // src/parser/Music.g:1:224: TIE
                {
                mTIE(); 


                }
                break;
            case 30 :
                // src/parser/Music.g:1:228: BEAT
                {
                mBEAT(); 


                }
                break;
            case 31 :
                // src/parser/Music.g:1:233: SPEED
                {
                mSPEED(); 


                }
                break;
            case 32 :
                // src/parser/Music.g:1:239: SONG
                {
                mSONG(); 


                }
                break;
            case 33 :
                // src/parser/Music.g:1:244: TRACK
                {
                mTRACK(); 


                }
                break;
            case 34 :
                // src/parser/Music.g:1:250: DRUMS_TRACK
                {
                mDRUMS_TRACK(); 


                }
                break;
            case 35 :
                // src/parser/Music.g:1:262: INSTRUMENT
                {
                mINSTRUMENT(); 


                }
                break;
            case 36 :
                // src/parser/Music.g:1:273: LETTER_X
                {
                mLETTER_X(); 


                }
                break;
            case 37 :
                // src/parser/Music.g:1:282: FRAGMENT
                {
                mFRAGMENT(); 


                }
                break;
            case 38 :
                // src/parser/Music.g:1:291: VOID
                {
                mVOID(); 


                }
                break;
            case 39 :
                // src/parser/Music.g:1:296: EQUAL
                {
                mEQUAL(); 


                }
                break;
            case 40 :
                // src/parser/Music.g:1:302: NOT_EQUAL
                {
                mNOT_EQUAL(); 


                }
                break;
            case 41 :
                // src/parser/Music.g:1:312: ASSIG
                {
                mASSIG(); 


                }
                break;
            case 42 :
                // src/parser/Music.g:1:318: PLUS_ASSIG
                {
                mPLUS_ASSIG(); 


                }
                break;
            case 43 :
                // src/parser/Music.g:1:329: MINUS_ASSIG
                {
                mMINUS_ASSIG(); 


                }
                break;
            case 44 :
                // src/parser/Music.g:1:341: PROD_ASSIG
                {
                mPROD_ASSIG(); 


                }
                break;
            case 45 :
                // src/parser/Music.g:1:352: DIVIDE_ASSIG
                {
                mDIVIDE_ASSIG(); 


                }
                break;
            case 46 :
                // src/parser/Music.g:1:365: MOD_ASSIG
                {
                mMOD_ASSIG(); 


                }
                break;
            case 47 :
                // src/parser/Music.g:1:375: LT
                {
                mLT(); 


                }
                break;
            case 48 :
                // src/parser/Music.g:1:378: LE
                {
                mLE(); 


                }
                break;
            case 49 :
                // src/parser/Music.g:1:381: GT
                {
                mGT(); 


                }
                break;
            case 50 :
                // src/parser/Music.g:1:384: GE
                {
                mGE(); 


                }
                break;
            case 51 :
                // src/parser/Music.g:1:387: PLUS
                {
                mPLUS(); 


                }
                break;
            case 52 :
                // src/parser/Music.g:1:392: INCR
                {
                mINCR(); 


                }
                break;
            case 53 :
                // src/parser/Music.g:1:397: MINUS
                {
                mMINUS(); 


                }
                break;
            case 54 :
                // src/parser/Music.g:1:403: DECR
                {
                mDECR(); 


                }
                break;
            case 55 :
                // src/parser/Music.g:1:408: DIV
                {
                mDIV(); 


                }
                break;
            case 56 :
                // src/parser/Music.g:1:412: MOD
                {
                mMOD(); 


                }
                break;
            case 57 :
                // src/parser/Music.g:1:416: NOT
                {
                mNOT(); 


                }
                break;
            case 58 :
                // src/parser/Music.g:1:420: AND
                {
                mAND(); 


                }
                break;
            case 59 :
                // src/parser/Music.g:1:424: OR
                {
                mOR(); 


                }
                break;
            case 60 :
                // src/parser/Music.g:1:427: IF
                {
                mIF(); 


                }
                break;
            case 61 :
                // src/parser/Music.g:1:430: ELSE
                {
                mELSE(); 


                }
                break;
            case 62 :
                // src/parser/Music.g:1:435: WHILE
                {
                mWHILE(); 


                }
                break;
            case 63 :
                // src/parser/Music.g:1:441: FOR
                {
                mFOR(); 


                }
                break;
            case 64 :
                // src/parser/Music.g:1:445: RETURN
                {
                mRETURN(); 


                }
                break;
            case 65 :
                // src/parser/Music.g:1:452: TRUE
                {
                mTRUE(); 


                }
                break;
            case 66 :
                // src/parser/Music.g:1:457: FALSE
                {
                mFALSE(); 


                }
                break;
            case 67 :
                // src/parser/Music.g:1:463: INT
                {
                mINT(); 


                }
                break;
            case 68 :
                // src/parser/Music.g:1:467: BOOL
                {
                mBOOL(); 


                }
                break;
            case 69 :
                // src/parser/Music.g:1:472: STRING_TYPE
                {
                mSTRING_TYPE(); 


                }
                break;
            case 70 :
                // src/parser/Music.g:1:484: ID
                {
                mID(); 


                }
                break;
            case 71 :
                // src/parser/Music.g:1:487: NUM
                {
                mNUM(); 


                }
                break;
            case 72 :
                // src/parser/Music.g:1:491: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 73 :
                // src/parser/Music.g:1:499: STRING
                {
                mSTRING(); 


                }
                break;
            case 74 :
                // src/parser/Music.g:1:506: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA11_eotS =
        "\5\uffff\1\70\3\uffff\1\63\1\74\1\63\1\77\1\uffff\1\64\7\63\3\uffff"+
        "\4\114\1\63\1\114\1\126\1\uffff\2\63\1\131\1\63\1\134\1\uffff\1"+
        "\137\1\142\1\145\1\147\1\151\1\153\6\63\6\uffff\2\63\1\166\1\uffff"+
        "\2\63\2\uffff\2\63\4\173\1\63\1\173\1\63\1\173\1\63\1\uffff\2\63"+
        "\2\114\4\63\2\uffff\2\63\1\uffff\1\63\21\uffff\1\63\1\u008b\1\u008c"+
        "\6\63\2\uffff\4\63\1\uffff\1\173\5\63\1\u009d\2\63\1\u00a0\4\63"+
        "\1\u00a5\2\uffff\1\u00a6\3\63\1\u00aa\3\63\1\u00ae\1\u00af\1\63"+
        "\1\u00b1\3\63\1\u00b5\1\uffff\2\63\1\uffff\1\63\1\u00b9\1\63\1\u00bb"+
        "\2\uffff\1\u00bc\1\63\1\u00be\1\uffff\1\63\1\u00c0\1\u00c1\2\uffff"+
        "\1\u00c4\1\uffff\1\63\1\u00c6\1\63\1\uffff\2\63\1\u00ca\1\uffff"+
        "\1\63\2\uffff\1\u00cc\1\uffff\1\63\2\uffff\2\63\1\uffff\1\63\1\uffff"+
        "\1\u00d1\1\u00d2\1\63\1\uffff\1\63\1\uffff\3\63\1\173\2\uffff\5"+
        "\63\1\u00dd\1\63\1\u00df\1\u00e0\1\63\1\uffff\1\63\2\uffff\1\63"+
        "\1\u00e4\1\u00e5\2\uffff";
    static final String DFA11_eofS =
        "\u00e6\uffff";
    static final String DFA11_minS =
        "\1\11\4\uffff\1\174\3\uffff\1\157\1\174\1\150\1\60\1\uffff\1\164"+
        "\2\157\1\145\1\151\1\141\1\151\1\141\3\uffff\4\60\1\143\1\60\1\75"+
        "\1\uffff\1\145\1\156\1\60\1\157\1\75\1\uffff\1\53\1\55\1\52\3\75"+
        "\1\156\1\162\1\146\1\154\1\150\1\162\6\uffff\1\156\1\141\1\72\1"+
        "\uffff\1\157\1\152\2\uffff\1\164\1\165\4\60\1\154\1\60\1\145\1\60"+
        "\1\164\1\uffff\1\157\1\164\2\60\1\162\1\141\1\162\1\154\2\uffff"+
        "\1\141\1\163\1\uffff\1\151\21\uffff\1\144\2\60\1\164\1\163\1\151"+
        "\1\165\1\145\1\143\2\uffff\1\162\1\67\1\145\1\155\1\uffff\1\60\1"+
        "\147\2\145\1\165\1\154\1\60\1\151\1\147\1\60\1\163\2\164\1\144\1"+
        "\60\2\uffff\1\60\1\145\1\154\1\145\1\60\1\163\1\153\1\144\2\60\1"+
        "\163\1\60\1\156\1\144\1\162\1\60\1\uffff\1\156\1\155\1\uffff\1\145"+
        "\1\60\1\162\1\60\2\uffff\1\60\1\145\1\60\1\uffff\1\160\2\60\2\uffff"+
        "\1\60\1\uffff\1\143\1\60\1\156\1\uffff\1\147\1\145\1\60\1\uffff"+
        "\1\165\2\uffff\1\60\1\uffff\1\157\2\uffff\1\157\1\124\1\uffff\1"+
        "\145\1\uffff\2\60\1\156\1\uffff\1\155\1\uffff\1\162\1\164\1\162"+
        "\1\60\2\uffff\1\164\1\145\1\164\1\145\1\141\1\60\1\156\2\60\1\143"+
        "\1\uffff\1\164\2\uffff\1\153\2\60\2\uffff";
    static final String DFA11_maxS =
        "\1\u00c2\4\uffff\1\174\3\uffff\1\162\1\174\1\150\1\172\1\uffff\1"+
        "\164\1\157\1\162\1\145\1\151\1\141\1\160\1\141\3\uffff\4\172\1\164"+
        "\1\172\1\75\1\uffff\1\145\1\156\1\172\1\157\1\75\1\uffff\6\75\1"+
        "\156\1\162\1\156\1\154\1\150\1\162\6\uffff\1\156\1\141\1\72\1\uffff"+
        "\1\157\1\152\2\uffff\1\164\1\165\4\172\1\156\1\172\1\145\1\172\1"+
        "\164\1\uffff\1\157\1\164\2\172\1\162\1\141\1\162\1\154\2\uffff\1"+
        "\141\1\163\1\uffff\1\151\21\uffff\1\144\2\172\1\164\1\163\1\151"+
        "\1\165\1\145\1\156\2\uffff\1\162\1\67\1\145\1\155\1\uffff\1\172"+
        "\1\147\2\145\1\165\1\154\1\172\1\151\1\147\1\172\1\163\2\164\1\144"+
        "\1\172\2\uffff\1\172\1\145\1\154\1\145\1\172\1\163\1\153\1\144\2"+
        "\172\1\163\1\172\1\156\1\144\1\162\1\172\1\uffff\1\156\1\155\1\uffff"+
        "\1\145\1\172\1\162\1\172\2\uffff\1\172\1\145\1\172\1\uffff\1\160"+
        "\2\172\2\uffff\1\172\1\uffff\1\143\1\172\1\156\1\uffff\1\147\1\145"+
        "\1\172\1\uffff\1\165\2\uffff\1\172\1\uffff\1\157\2\uffff\1\157\1"+
        "\124\1\uffff\1\145\1\uffff\2\172\1\156\1\uffff\1\155\1\uffff\1\162"+
        "\1\164\1\162\1\172\2\uffff\1\164\1\145\1\164\1\145\1\141\1\172\1"+
        "\156\2\172\1\143\1\uffff\1\164\2\uffff\1\153\2\172\2\uffff";
    static final String DFA11_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\6\1\7\1\10\4\uffff\1\21\10\uffff"+
        "\1\30\1\31\1\32\7\uffff\1\35\5\uffff\1\50\14\uffff\1\106\1\107\1"+
        "\111\1\112\1\15\1\5\3\uffff\1\12\2\uffff\1\20\1\23\13\uffff\1\33"+
        "\10\uffff\1\54\1\34\2\uffff\1\44\1\uffff\1\47\1\51\1\52\1\64\1\63"+
        "\1\53\1\66\1\65\1\55\1\110\1\67\1\56\1\70\1\60\1\57\1\62\1\61\11"+
        "\uffff\1\14\1\13\4\uffff\1\26\17\uffff\1\73\1\74\20\uffff\1\71\2"+
        "\uffff\1\77\4\uffff\1\72\1\103\3\uffff\1\11\3\uffff\1\22\1\24\1"+
        "\uffff\1\40\3\uffff\1\104\3\uffff\1\36\1\uffff\1\46\1\75\1\uffff"+
        "\1\101\1\uffff\1\41\1\16\2\uffff\1\27\1\uffff\1\37\3\uffff\1\102"+
        "\1\uffff\1\76\4\uffff\1\100\1\105\12\uffff\1\45\1\uffff\1\17\1\25"+
        "\3\uffff\1\43\1\42";
    static final String DFA11_specialS =
        "\u00e6\uffff}>";
    static final String[] DFA11_transitionS = {
            "\2\66\2\uffff\1\66\22\uffff\1\66\1\46\1\65\1\26\1\30\1\52\1"+
            "\27\1\uffff\1\1\1\2\1\37\1\47\1\3\1\50\1\4\1\51\7\64\1\16\2"+
            "\64\1\5\1\6\1\53\1\45\1\54\2\uffff\1\63\1\41\1\13\1\20\1\63"+
            "\1\23\2\63\1\42\2\63\1\25\1\22\1\17\3\63\1\21\1\24\1\11\6\63"+
            "\4\uffff\1\63\1\uffff\1\55\1\32\1\34\1\63\1\60\1\36\2\63\1\57"+
            "\3\63\1\14\1\33\1\56\2\63\1\31\1\35\1\62\1\63\1\44\1\61\1\43"+
            "\2\63\1\7\1\12\1\10\1\40\103\uffff\1\15",
            "",
            "",
            "",
            "",
            "\1\67",
            "",
            "",
            "",
            "\1\71\2\uffff\1\72",
            "\1\73",
            "\1\75",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\1\76\31\63",
            "",
            "\1\100",
            "\1\101",
            "\1\103\2\uffff\1\102",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\110\5\uffff\1\107\1\111",
            "\1\112",
            "",
            "",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\4\63\1\113\25\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\16\63\1\115\13\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\16\63\1\116\13\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\117\2\uffff\1\120\15\uffff\1\121",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\1\124\15\63\1\123"+
            "\2\63\1\122\10\63",
            "\1\125",
            "",
            "\1\127",
            "\1\130",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\132",
            "\1\133",
            "",
            "\1\136\21\uffff\1\135",
            "\1\141\2\uffff\12\64\3\uffff\1\140",
            "\1\144\4\uffff\1\144\15\uffff\1\143",
            "\1\146",
            "\1\150",
            "\1\152",
            "\1\154",
            "\1\155",
            "\1\156\7\uffff\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\163",
            "\1\164",
            "\1\165",
            "",
            "\1\167",
            "\1\170",
            "",
            "",
            "\1\171",
            "\1\172",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\174\1\uffff\1\175",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\13\63\1\176\16\63",
            "\1\177",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0080",
            "",
            "\1\u0081",
            "\1\u0082",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "",
            "",
            "\1\u0087",
            "\1\u0088",
            "",
            "\1\u0089",
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
            "\1\u008a",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0093\12\uffff\1\u0092",
            "",
            "",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u009e",
            "\1\u009f",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00b0",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\u00b6",
            "\1\u00b7",
            "",
            "\1\u00b8",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00ba",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00bd",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\u00bf",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "",
            "\12\63\7\uffff\15\63\1\u00c2\14\63\4\uffff\1\u00c3\1\uffff"+
            "\32\63",
            "",
            "\1\u00c5",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00c7",
            "",
            "\1\u00c8",
            "\1\u00c9",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\u00cb",
            "",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\u00cd",
            "",
            "",
            "\1\u00ce",
            "\1\u00cf",
            "",
            "\1\u00d0",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00d3",
            "",
            "\1\u00d4",
            "",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00de",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00e1",
            "",
            "\1\u00e2",
            "",
            "",
            "\1\u00e3",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
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
            return "1:1: Tokens : ( T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | TONE | BAR | DOUBLE_BAR | START_REPETITION | END_REPETITION | CHORD | TRANSPORT | MINOR | DIMINUTION | MAJ7 | SEVENTH | NOTE_TYPE | DRUMS_NOTE_TYPE | NOTE | DRUMS | SUSTAIN | BEMOL | ARMOR | FIGURE | DOT | TIE | BEAT | SPEED | SONG | TRACK | DRUMS_TRACK | INSTRUMENT | LETTER_X | FRAGMENT | VOID | EQUAL | NOT_EQUAL | ASSIG | PLUS_ASSIG | MINUS_ASSIG | PROD_ASSIG | DIVIDE_ASSIG | MOD_ASSIG | LT | LE | GT | GE | PLUS | INCR | MINUS | DECR | DIV | MOD | NOT | AND | OR | IF | ELSE | WHILE | FOR | RETURN | TRUE | FALSE | INT | BOOL | STRING_TYPE | ID | NUM | COMMENT | STRING | WS );";
        }
    }
 

}