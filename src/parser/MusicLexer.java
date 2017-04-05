// $ANTLR 3.4 src/parser/Music.g 2017-04-05 17:07:54

    package parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class MusicLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int AND=4;
    public static final int ASSIG=5;
    public static final int BAR=6;
    public static final int BEAT=7;
    public static final int BEMOL=8;
    public static final int BOOL=9;
    public static final int BOOLEAN=10;
    public static final int CHORD=11;
    public static final int COMMENT=12;
    public static final int COMPAS=13;
    public static final int COMPAS_LIST=14;
    public static final int DECR=15;
    public static final int DIMINUTION=16;
    public static final int DIV=17;
    public static final int DIVIDE_ASSIG=18;
    public static final int DOT=19;
    public static final int DOUBLE_BAR=20;
    public static final int ELSE=21;
    public static final int ELSEIF=22;
    public static final int END_REPETITION=23;
    public static final int EQUAL=24;
    public static final int ESC_SEQ=25;
    public static final int FALSE=26;
    public static final int FIGURE=27;
    public static final int FOR=28;
    public static final int FUNCALL=29;
    public static final int FUNCTION=30;
    public static final int GE=31;
    public static final int GT=32;
    public static final int ID=33;
    public static final int IF=34;
    public static final int INCR=35;
    public static final int INT=36;
    public static final int LE=37;
    public static final int LIST_ARGUMENTS=38;
    public static final int LIST_FUNCTIONS=39;
    public static final int LIST_INSTRUCTIONS=40;
    public static final int LT=41;
    public static final int MAJ7=42;
    public static final int MINOR=43;
    public static final int MINUS=44;
    public static final int MINUS_ASSIG=45;
    public static final int MOD=46;
    public static final int MOD_ASSIG=47;
    public static final int NOT=48;
    public static final int NOTE=49;
    public static final int NOTES=50;
    public static final int NOTE_LIST=51;
    public static final int NOT_EQUAL=52;
    public static final int NUM=53;
    public static final int OR=54;
    public static final int PLUS=55;
    public static final int PLUS_ASSIG=56;
    public static final int POST=57;
    public static final int PRE=58;
    public static final int PROD_ASSIG=59;
    public static final int REPETITION=60;
    public static final int RETURN=61;
    public static final int SEVENTH=62;
    public static final int SONG=63;
    public static final int SPEED=64;
    public static final int START_REPETITION=65;
    public static final int STRING=66;
    public static final int SUSTAIN=67;
    public static final int TIE=68;
    public static final int TONE=69;
    public static final int TRACK=70;
    public static final int TRANSPORT=71;
    public static final int TRUE=72;
    public static final int WHILE=73;
    public static final int WS=74;

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

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
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
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
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
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
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
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
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
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
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
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
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
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:12:7: ( 'x' )
            // src/parser/Music.g:12:9: 'x'
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
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:13:7: ( '{' )
            // src/parser/Music.g:13:9: '{'
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
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:14:7: ( '}' )
            // src/parser/Music.g:14:9: '}'
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
    // $ANTLR end "T__83"

    // $ANTLR start "BAR"
    public final void mBAR() throws RecognitionException {
        try {
            int _type = BAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:175:21: ( '|' )
            // src/parser/Music.g:175:23: '|'
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
            // src/parser/Music.g:176:22: ( '||' )
            // src/parser/Music.g:176:24: '||'
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
            // src/parser/Music.g:177:21: ( '||:' )
            // src/parser/Music.g:177:23: '||:'
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
            // src/parser/Music.g:178:21: ( ':||' )
            // src/parser/Music.g:178:23: ':||'
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

    // $ANTLR start "BEMOL"
    public final void mBEMOL() throws RecognitionException {
        try {
            int _type = BEMOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:179:21: ( '&' )
            // src/parser/Music.g:179:23: '&'
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

    // $ANTLR start "CHORD"
    public final void mCHORD() throws RecognitionException {
        try {
            int _type = CHORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:180:21: ( 'Chord' )
            // src/parser/Music.g:180:23: 'Chord'
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

    // $ANTLR start "TONE"
    public final void mTONE() throws RecognitionException {
        try {
            int _type = TONE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:181:21: ( 'Tone' )
            // src/parser/Music.g:181:23: 'Tone'
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

    // $ANTLR start "TRANSPORT"
    public final void mTRANSPORT() throws RecognitionException {
        try {
            int _type = TRANSPORT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:182:21: ( 'Transport' )
            // src/parser/Music.g:182:23: 'Transport'
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
            // src/parser/Music.g:183:21: ( 'm' )
            // src/parser/Music.g:183:23: 'm'
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
            // src/parser/Music.g:184:21: ( 'º' )
            // src/parser/Music.g:184:23: 'º'
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
            // src/parser/Music.g:185:21: ( 'maj7' )
            // src/parser/Music.g:185:23: 'maj7'
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
            // src/parser/Music.g:186:21: ( '7th' )
            // src/parser/Music.g:186:23: '7th'
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

    // $ANTLR start "NOTE"
    public final void mNOTE() throws RecognitionException {
        try {
            int _type = NOTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:188:21: ( ( 'Do' | 'Re' | 'Mi' | 'Fa' | 'Sol' | 'La' | 'Si' | 'Silence' ) )
            // src/parser/Music.g:188:23: ( 'Do' | 'Re' | 'Mi' | 'Fa' | 'Sol' | 'La' | 'Si' | 'Silence' )
            {
            // src/parser/Music.g:188:23: ( 'Do' | 'Re' | 'Mi' | 'Fa' | 'Sol' | 'La' | 'Si' | 'Silence' )
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
                    // src/parser/Music.g:188:24: 'Do'
                    {
                    match("Do"); 



                    }
                    break;
                case 2 :
                    // src/parser/Music.g:188:29: 'Re'
                    {
                    match("Re"); 



                    }
                    break;
                case 3 :
                    // src/parser/Music.g:188:34: 'Mi'
                    {
                    match("Mi"); 



                    }
                    break;
                case 4 :
                    // src/parser/Music.g:188:39: 'Fa'
                    {
                    match("Fa"); 



                    }
                    break;
                case 5 :
                    // src/parser/Music.g:188:44: 'Sol'
                    {
                    match("Sol"); 



                    }
                    break;
                case 6 :
                    // src/parser/Music.g:188:50: 'La'
                    {
                    match("La"); 



                    }
                    break;
                case 7 :
                    // src/parser/Music.g:188:55: 'Si'
                    {
                    match("Si"); 



                    }
                    break;
                case 8 :
                    // src/parser/Music.g:188:60: 'Silence'
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

    // $ANTLR start "SUSTAIN"
    public final void mSUSTAIN() throws RecognitionException {
        try {
            int _type = SUSTAIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:189:21: ( '#' )
            // src/parser/Music.g:189:23: '#'
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

    // $ANTLR start "FIGURE"
    public final void mFIGURE() throws RecognitionException {
        try {
            int _type = FIGURE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:190:21: ( ( 'r' | 'b' | 'n' | 'c' | 'sc' | 'f' | 'sf' ) )
            // src/parser/Music.g:190:23: ( 'r' | 'b' | 'n' | 'c' | 'sc' | 'f' | 'sf' )
            {
            // src/parser/Music.g:190:23: ( 'r' | 'b' | 'n' | 'c' | 'sc' | 'f' | 'sf' )
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
                    // src/parser/Music.g:190:24: 'r'
                    {
                    match('r'); 

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:190:28: 'b'
                    {
                    match('b'); 

                    }
                    break;
                case 3 :
                    // src/parser/Music.g:190:32: 'n'
                    {
                    match('n'); 

                    }
                    break;
                case 4 :
                    // src/parser/Music.g:190:36: 'c'
                    {
                    match('c'); 

                    }
                    break;
                case 5 :
                    // src/parser/Music.g:190:40: 'sc'
                    {
                    match("sc"); 



                    }
                    break;
                case 6 :
                    // src/parser/Music.g:190:45: 'f'
                    {
                    match('f'); 

                    }
                    break;
                case 7 :
                    // src/parser/Music.g:190:49: 'sf'
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
            // src/parser/Music.g:191:21: ( '*' )
            // src/parser/Music.g:191:23: '*'
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
            // src/parser/Music.g:192:21: ( '~' )
            // src/parser/Music.g:192:23: '~'
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
            // src/parser/Music.g:193:21: ( 'Beat' )
            // src/parser/Music.g:193:23: 'Beat'
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
            // src/parser/Music.g:194:21: ( 'Speed' )
            // src/parser/Music.g:194:23: 'Speed'
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
            // src/parser/Music.g:195:21: ( 'Song' )
            // src/parser/Music.g:195:23: 'Song'
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
            // src/parser/Music.g:196:21: ( 'Track' )
            // src/parser/Music.g:196:23: 'Track'
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

    // $ANTLR start "EQUAL"
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:199:7: ( '==' )
            // src/parser/Music.g:199:9: '=='
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
            // src/parser/Music.g:200:10: ( '!=' )
            // src/parser/Music.g:200:12: '!='
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
            // src/parser/Music.g:201:6: ( '=' )
            // src/parser/Music.g:201:9: '='
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
            // src/parser/Music.g:202:11: ( '+=' )
            // src/parser/Music.g:202:13: '+='
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
            // src/parser/Music.g:203:12: ( '-=' )
            // src/parser/Music.g:203:14: '-='
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
            // src/parser/Music.g:204:11: ( '*=' )
            // src/parser/Music.g:204:13: '*='
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
            // src/parser/Music.g:205:13: ( '/=' )
            // src/parser/Music.g:205:15: '/='
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
            // src/parser/Music.g:206:10: ( '%=' )
            // src/parser/Music.g:206:12: '%='
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
            // src/parser/Music.g:207:8: ( '<' )
            // src/parser/Music.g:207:10: '<'
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
            // src/parser/Music.g:208:8: ( '<=' )
            // src/parser/Music.g:208:10: '<='
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
            // src/parser/Music.g:209:8: ( '>' )
            // src/parser/Music.g:209:10: '>'
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
            // src/parser/Music.g:210:8: ( '>=' )
            // src/parser/Music.g:210:10: '>='
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
            // src/parser/Music.g:211:6: ( '+' )
            // src/parser/Music.g:211:8: '+'
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
            // src/parser/Music.g:212:9: ( '++' )
            // src/parser/Music.g:212:11: '++'
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
            // src/parser/Music.g:213:7: ( '-' )
            // src/parser/Music.g:213:9: '-'
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
            // src/parser/Music.g:214:9: ( '--' )
            // src/parser/Music.g:214:11: '--'
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
            // src/parser/Music.g:215:9: ( '/' )
            // src/parser/Music.g:215:11: '/'
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
            // src/parser/Music.g:216:9: ( '%' )
            // src/parser/Music.g:216:11: '%'
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
            // src/parser/Music.g:217:9: ( 'not' )
            // src/parser/Music.g:217:11: 'not'
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
            // src/parser/Music.g:218:9: ( 'and' )
            // src/parser/Music.g:218:11: 'and'
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
            // src/parser/Music.g:219:8: ( 'or' )
            // src/parser/Music.g:219:10: 'or'
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
            // src/parser/Music.g:220:6: ( 'if' )
            // src/parser/Music.g:220:8: 'if'
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
            // src/parser/Music.g:221:6: ( 'else' )
            // src/parser/Music.g:221:8: 'else'
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
            // src/parser/Music.g:222:7: ( 'while' )
            // src/parser/Music.g:222:9: 'while'
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
            // src/parser/Music.g:223:9: ( 'for' )
            // src/parser/Music.g:223:11: 'for'
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
            // src/parser/Music.g:224:8: ( 'return' )
            // src/parser/Music.g:224:10: 'return'
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
            // src/parser/Music.g:225:9: ( 'true' )
            // src/parser/Music.g:225:11: 'true'
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
            // src/parser/Music.g:226:9: ( 'false' )
            // src/parser/Music.g:226:11: 'false'
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
            // src/parser/Music.g:227:9: ( 'int' )
            // src/parser/Music.g:227:11: 'int'
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
            // src/parser/Music.g:228:9: ( 'bool' )
            // src/parser/Music.g:228:11: 'bool'
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

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:229:6: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // src/parser/Music.g:229:8: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // src/parser/Music.g:229:32: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
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
            // src/parser/Music.g:230:6: ( ( '0' .. '9' )+ )
            // src/parser/Music.g:230:8: ( '0' .. '9' )+
            {
            // src/parser/Music.g:230:8: ( '0' .. '9' )+
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
    // $ANTLR end "NUM"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:233:9: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='/') ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1=='/') ) {
                    alt8=1;
                }
                else if ( (LA8_1=='*') ) {
                    alt8=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
                    // src/parser/Music.g:233:11: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 



                    // src/parser/Music.g:233:16: (~ ( '\\n' | '\\r' ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0 >= '\u0000' && LA5_0 <= '\t')||(LA5_0 >= '\u000B' && LA5_0 <= '\f')||(LA5_0 >= '\u000E' && LA5_0 <= '\uFFFF')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
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
                    	    break loop5;
                        }
                    } while (true);


                    // src/parser/Music.g:233:30: ( '\\r' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='\r') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // src/parser/Music.g:233:30: '\\r'
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
                    // src/parser/Music.g:234:5: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 



                    // src/parser/Music.g:234:10: ( options {greedy=false; } : . )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='*') ) {
                            int LA7_1 = input.LA(2);

                            if ( (LA7_1=='/') ) {
                                alt7=2;
                            }
                            else if ( ((LA7_1 >= '\u0000' && LA7_1 <= '.')||(LA7_1 >= '0' && LA7_1 <= '\uFFFF')) ) {
                                alt7=1;
                            }


                        }
                        else if ( ((LA7_0 >= '\u0000' && LA7_0 <= ')')||(LA7_0 >= '+' && LA7_0 <= '\uFFFF')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // src/parser/Music.g:234:38: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
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
            // src/parser/Music.g:238:9: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
            // src/parser/Music.g:238:12: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 

            // src/parser/Music.g:238:16: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
            loop9:
            do {
                int alt9=3;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='\\') ) {
                    alt9=1;
                }
                else if ( ((LA9_0 >= '\u0000' && LA9_0 <= '!')||(LA9_0 >= '#' && LA9_0 <= '[')||(LA9_0 >= ']' && LA9_0 <= '\uFFFF')) ) {
                    alt9=2;
                }


                switch (alt9) {
            	case 1 :
            	    // src/parser/Music.g:238:18: ESC_SEQ
            	    {
            	    mESC_SEQ(); 


            	    }
            	    break;
            	case 2 :
            	    // src/parser/Music.g:238:28: ~ ( '\\\\' | '\"' )
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
            	    break loop9;
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
            // src/parser/Music.g:244:2: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
            // src/parser/Music.g:244:6: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
            // src/parser/Music.g:247:6: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // src/parser/Music.g:247:8: ( ' ' | '\\t' | '\\r' | '\\n' )
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
        // src/parser/Music.g:1:8: ( T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | BAR | DOUBLE_BAR | START_REPETITION | END_REPETITION | BEMOL | CHORD | TONE | TRANSPORT | MINOR | DIMINUTION | MAJ7 | SEVENTH | NOTE | SUSTAIN | FIGURE | DOT | TIE | BEAT | SPEED | SONG | TRACK | EQUAL | NOT_EQUAL | ASSIG | PLUS_ASSIG | MINUS_ASSIG | PROD_ASSIG | DIVIDE_ASSIG | MOD_ASSIG | LT | LE | GT | GE | PLUS | INCR | MINUS | DECR | DIV | MOD | NOT | AND | OR | IF | ELSE | WHILE | FOR | RETURN | TRUE | FALSE | INT | BOOL | ID | NUM | COMMENT | STRING | WS )
        int alt10=65;
        alt10 = dfa10.predict(input);
        switch (alt10) {
            case 1 :
                // src/parser/Music.g:1:10: T__75
                {
                mT__75(); 


                }
                break;
            case 2 :
                // src/parser/Music.g:1:16: T__76
                {
                mT__76(); 


                }
                break;
            case 3 :
                // src/parser/Music.g:1:22: T__77
                {
                mT__77(); 


                }
                break;
            case 4 :
                // src/parser/Music.g:1:28: T__78
                {
                mT__78(); 


                }
                break;
            case 5 :
                // src/parser/Music.g:1:34: T__79
                {
                mT__79(); 


                }
                break;
            case 6 :
                // src/parser/Music.g:1:40: T__80
                {
                mT__80(); 


                }
                break;
            case 7 :
                // src/parser/Music.g:1:46: T__81
                {
                mT__81(); 


                }
                break;
            case 8 :
                // src/parser/Music.g:1:52: T__82
                {
                mT__82(); 


                }
                break;
            case 9 :
                // src/parser/Music.g:1:58: T__83
                {
                mT__83(); 


                }
                break;
            case 10 :
                // src/parser/Music.g:1:64: BAR
                {
                mBAR(); 


                }
                break;
            case 11 :
                // src/parser/Music.g:1:68: DOUBLE_BAR
                {
                mDOUBLE_BAR(); 


                }
                break;
            case 12 :
                // src/parser/Music.g:1:79: START_REPETITION
                {
                mSTART_REPETITION(); 


                }
                break;
            case 13 :
                // src/parser/Music.g:1:96: END_REPETITION
                {
                mEND_REPETITION(); 


                }
                break;
            case 14 :
                // src/parser/Music.g:1:111: BEMOL
                {
                mBEMOL(); 


                }
                break;
            case 15 :
                // src/parser/Music.g:1:117: CHORD
                {
                mCHORD(); 


                }
                break;
            case 16 :
                // src/parser/Music.g:1:123: TONE
                {
                mTONE(); 


                }
                break;
            case 17 :
                // src/parser/Music.g:1:128: TRANSPORT
                {
                mTRANSPORT(); 


                }
                break;
            case 18 :
                // src/parser/Music.g:1:138: MINOR
                {
                mMINOR(); 


                }
                break;
            case 19 :
                // src/parser/Music.g:1:144: DIMINUTION
                {
                mDIMINUTION(); 


                }
                break;
            case 20 :
                // src/parser/Music.g:1:155: MAJ7
                {
                mMAJ7(); 


                }
                break;
            case 21 :
                // src/parser/Music.g:1:160: SEVENTH
                {
                mSEVENTH(); 


                }
                break;
            case 22 :
                // src/parser/Music.g:1:168: NOTE
                {
                mNOTE(); 


                }
                break;
            case 23 :
                // src/parser/Music.g:1:173: SUSTAIN
                {
                mSUSTAIN(); 


                }
                break;
            case 24 :
                // src/parser/Music.g:1:181: FIGURE
                {
                mFIGURE(); 


                }
                break;
            case 25 :
                // src/parser/Music.g:1:188: DOT
                {
                mDOT(); 


                }
                break;
            case 26 :
                // src/parser/Music.g:1:192: TIE
                {
                mTIE(); 


                }
                break;
            case 27 :
                // src/parser/Music.g:1:196: BEAT
                {
                mBEAT(); 


                }
                break;
            case 28 :
                // src/parser/Music.g:1:201: SPEED
                {
                mSPEED(); 


                }
                break;
            case 29 :
                // src/parser/Music.g:1:207: SONG
                {
                mSONG(); 


                }
                break;
            case 30 :
                // src/parser/Music.g:1:212: TRACK
                {
                mTRACK(); 


                }
                break;
            case 31 :
                // src/parser/Music.g:1:218: EQUAL
                {
                mEQUAL(); 


                }
                break;
            case 32 :
                // src/parser/Music.g:1:224: NOT_EQUAL
                {
                mNOT_EQUAL(); 


                }
                break;
            case 33 :
                // src/parser/Music.g:1:234: ASSIG
                {
                mASSIG(); 


                }
                break;
            case 34 :
                // src/parser/Music.g:1:240: PLUS_ASSIG
                {
                mPLUS_ASSIG(); 


                }
                break;
            case 35 :
                // src/parser/Music.g:1:251: MINUS_ASSIG
                {
                mMINUS_ASSIG(); 


                }
                break;
            case 36 :
                // src/parser/Music.g:1:263: PROD_ASSIG
                {
                mPROD_ASSIG(); 


                }
                break;
            case 37 :
                // src/parser/Music.g:1:274: DIVIDE_ASSIG
                {
                mDIVIDE_ASSIG(); 


                }
                break;
            case 38 :
                // src/parser/Music.g:1:287: MOD_ASSIG
                {
                mMOD_ASSIG(); 


                }
                break;
            case 39 :
                // src/parser/Music.g:1:297: LT
                {
                mLT(); 


                }
                break;
            case 40 :
                // src/parser/Music.g:1:300: LE
                {
                mLE(); 


                }
                break;
            case 41 :
                // src/parser/Music.g:1:303: GT
                {
                mGT(); 


                }
                break;
            case 42 :
                // src/parser/Music.g:1:306: GE
                {
                mGE(); 


                }
                break;
            case 43 :
                // src/parser/Music.g:1:309: PLUS
                {
                mPLUS(); 


                }
                break;
            case 44 :
                // src/parser/Music.g:1:314: INCR
                {
                mINCR(); 


                }
                break;
            case 45 :
                // src/parser/Music.g:1:319: MINUS
                {
                mMINUS(); 


                }
                break;
            case 46 :
                // src/parser/Music.g:1:325: DECR
                {
                mDECR(); 


                }
                break;
            case 47 :
                // src/parser/Music.g:1:330: DIV
                {
                mDIV(); 


                }
                break;
            case 48 :
                // src/parser/Music.g:1:334: MOD
                {
                mMOD(); 


                }
                break;
            case 49 :
                // src/parser/Music.g:1:338: NOT
                {
                mNOT(); 


                }
                break;
            case 50 :
                // src/parser/Music.g:1:342: AND
                {
                mAND(); 


                }
                break;
            case 51 :
                // src/parser/Music.g:1:346: OR
                {
                mOR(); 


                }
                break;
            case 52 :
                // src/parser/Music.g:1:349: IF
                {
                mIF(); 


                }
                break;
            case 53 :
                // src/parser/Music.g:1:352: ELSE
                {
                mELSE(); 


                }
                break;
            case 54 :
                // src/parser/Music.g:1:357: WHILE
                {
                mWHILE(); 


                }
                break;
            case 55 :
                // src/parser/Music.g:1:363: FOR
                {
                mFOR(); 


                }
                break;
            case 56 :
                // src/parser/Music.g:1:367: RETURN
                {
                mRETURN(); 


                }
                break;
            case 57 :
                // src/parser/Music.g:1:374: TRUE
                {
                mTRUE(); 


                }
                break;
            case 58 :
                // src/parser/Music.g:1:379: FALSE
                {
                mFALSE(); 


                }
                break;
            case 59 :
                // src/parser/Music.g:1:385: INT
                {
                mINT(); 


                }
                break;
            case 60 :
                // src/parser/Music.g:1:389: BOOL
                {
                mBOOL(); 


                }
                break;
            case 61 :
                // src/parser/Music.g:1:394: ID
                {
                mID(); 


                }
                break;
            case 62 :
                // src/parser/Music.g:1:397: NUM
                {
                mNUM(); 


                }
                break;
            case 63 :
                // src/parser/Music.g:1:401: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 64 :
                // src/parser/Music.g:1:409: STRING
                {
                mSTRING(); 


                }
                break;
            case 65 :
                // src/parser/Music.g:1:416: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA10_eotS =
        "\5\uffff\1\64\1\uffff\1\65\2\uffff\1\67\1\uffff\2\57\1\74\1\uffff"+
        "\1\60\6\57\1\uffff\4\107\1\57\1\107\1\117\1\uffff\1\57\1\122\1\uffff"+
        "\1\125\1\130\1\133\1\135\1\137\1\141\6\57\7\uffff\1\152\1\uffff"+
        "\4\57\2\uffff\4\157\1\57\1\157\1\57\1\157\1\57\1\uffff\2\57\2\107"+
        "\2\57\2\uffff\1\57\21\uffff\1\57\1\173\1\174\4\57\2\uffff\4\57\1"+
        "\uffff\1\157\5\57\1\u008b\1\u008c\2\57\1\u008f\2\uffff\1\u0090\4"+
        "\57\1\u0095\2\57\1\u0098\1\u0099\3\57\1\u009d\2\uffff\1\57\1\u009f"+
        "\2\uffff\1\u00a0\1\57\1\u00a2\1\u00a3\1\uffff\1\57\1\u00a5\2\uffff"+
        "\1\57\1\u00a7\1\57\1\uffff\1\u00a9\2\uffff\1\u00aa\2\uffff\1\57"+
        "\1\uffff\1\57\1\uffff\1\u00ad\2\uffff\1\57\1\157\1\uffff\1\57\1"+
        "\u00b0\1\uffff";
    static final String DFA10_eofS =
        "\u00b1\uffff";
    static final String DFA10_minS =
        "\1\11\4\uffff\1\174\1\uffff\1\60\2\uffff\1\174\1\uffff\1\150\1\157"+
        "\1\60\1\uffff\1\164\1\157\1\145\1\151\1\141\1\151\1\141\1\uffff"+
        "\4\60\1\143\1\60\1\75\1\uffff\1\145\1\75\1\uffff\1\53\1\55\1\52"+
        "\3\75\1\156\1\162\1\146\1\154\1\150\1\162\7\uffff\1\72\1\uffff\1"+
        "\157\1\156\1\141\1\152\2\uffff\4\60\1\154\1\60\1\145\1\60\1\164"+
        "\1\uffff\1\157\1\164\2\60\1\162\1\154\2\uffff\1\141\21\uffff\1\144"+
        "\2\60\1\164\1\163\1\151\1\165\2\uffff\1\162\1\145\1\143\1\67\1\uffff"+
        "\1\60\1\147\2\145\1\165\1\154\2\60\1\163\1\164\1\60\2\uffff\1\60"+
        "\1\145\1\154\1\145\1\144\1\60\1\163\1\153\2\60\1\156\1\144\1\162"+
        "\1\60\2\uffff\1\145\1\60\2\uffff\1\60\1\145\2\60\1\uffff\1\160\1"+
        "\60\2\uffff\1\143\1\60\1\156\1\uffff\1\60\2\uffff\1\60\2\uffff\1"+
        "\157\1\uffff\1\145\1\uffff\1\60\2\uffff\1\162\1\60\1\uffff\1\164"+
        "\1\60\1\uffff";
    static final String DFA10_maxS =
        "\1\u00c2\4\uffff\1\174\1\uffff\1\172\2\uffff\1\174\1\uffff\1\150"+
        "\1\162\1\172\1\uffff\1\164\1\157\1\145\1\151\1\141\1\160\1\141\1"+
        "\uffff\4\172\1\146\1\172\1\75\1\uffff\1\145\1\75\1\uffff\6\75\1"+
        "\156\1\162\1\156\1\154\1\150\1\162\7\uffff\1\72\1\uffff\1\157\1"+
        "\156\1\141\1\152\2\uffff\4\172\1\156\1\172\1\145\1\172\1\164\1\uffff"+
        "\1\157\1\164\2\172\1\162\1\154\2\uffff\1\141\21\uffff\1\144\2\172"+
        "\1\164\1\163\1\151\1\165\2\uffff\1\162\1\145\1\156\1\67\1\uffff"+
        "\1\172\1\147\2\145\1\165\1\154\2\172\1\163\1\164\1\172\2\uffff\1"+
        "\172\1\145\1\154\1\145\1\144\1\172\1\163\1\153\2\172\1\156\1\144"+
        "\1\162\1\172\2\uffff\1\145\1\172\2\uffff\1\172\1\145\2\172\1\uffff"+
        "\1\160\1\172\2\uffff\1\143\1\172\1\156\1\uffff\1\172\2\uffff\1\172"+
        "\2\uffff\1\157\1\uffff\1\145\1\uffff\1\172\2\uffff\1\162\1\172\1"+
        "\uffff\1\164\1\172\1\uffff";
    static final String DFA10_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\6\1\uffff\1\10\1\11\1\uffff\1"+
        "\16\3\uffff\1\23\7\uffff\1\27\7\uffff\1\32\2\uffff\1\40\14\uffff"+
        "\1\75\1\76\1\100\1\101\1\15\1\5\1\7\1\uffff\1\12\4\uffff\1\22\1"+
        "\25\11\uffff\1\30\6\uffff\1\44\1\31\1\uffff\1\37\1\41\1\42\1\54"+
        "\1\53\1\43\1\56\1\55\1\45\1\77\1\57\1\46\1\60\1\50\1\47\1\52\1\51"+
        "\7\uffff\1\14\1\13\4\uffff\1\26\13\uffff\1\63\1\64\16\uffff\1\61"+
        "\1\67\2\uffff\1\62\1\73\4\uffff\1\20\2\uffff\1\24\1\35\3\uffff\1"+
        "\74\1\uffff\1\33\1\65\1\uffff\1\71\1\17\1\uffff\1\36\1\uffff\1\34"+
        "\1\uffff\1\72\1\66\2\uffff\1\70\2\uffff\1\21";
    static final String DFA10_specialS =
        "\u00b1\uffff}>";
    static final String[] DFA10_transitionS = {
            "\2\62\2\uffff\1\62\22\uffff\1\62\1\42\1\61\1\27\1\uffff\1\46"+
            "\1\13\1\uffff\1\1\1\2\1\36\1\43\1\3\1\44\1\4\1\45\7\60\1\20"+
            "\2\60\1\5\1\6\1\47\1\41\1\50\2\uffff\1\57\1\40\1\14\1\21\1\57"+
            "\1\24\5\57\1\26\1\23\4\57\1\22\1\25\1\15\6\57\4\uffff\1\57\1"+
            "\uffff\1\51\1\31\1\33\1\57\1\54\1\35\2\57\1\53\3\57\1\16\1\32"+
            "\1\52\2\57\1\30\1\34\1\56\2\57\1\55\1\7\2\57\1\10\1\12\1\11"+
            "\1\37\103\uffff\1\17",
            "",
            "",
            "",
            "",
            "\1\63",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "\1\66",
            "",
            "\1\70",
            "\1\71\2\uffff\1\72",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\1\73\31\57",
            "",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\103\5\uffff\1\102\1\104",
            "\1\105",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\106\25\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\16\57\1\110\13\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\16\57\1\111\13\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\112\2\uffff\1\113",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\1\115\15\57\1\114"+
            "\13\57",
            "\1\116",
            "",
            "\1\120",
            "\1\121",
            "",
            "\1\124\21\uffff\1\123",
            "\1\127\17\uffff\1\126",
            "\1\132\4\uffff\1\132\15\uffff\1\131",
            "\1\134",
            "\1\136",
            "\1\140",
            "\1\142",
            "\1\143",
            "\1\144\7\uffff\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\151",
            "",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\160\1\uffff\1\161",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\13\57\1\162\16\57",
            "\1\163",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\164",
            "",
            "\1\165",
            "\1\166",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\167",
            "\1\170",
            "",
            "",
            "\1\171",
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
            "\1\172",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "",
            "",
            "\1\u0081",
            "\1\u0082",
            "\1\u0084\12\uffff\1\u0083",
            "\1\u0085",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u008d",
            "\1\u008e",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0096",
            "\1\u0097",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "\1\u009e",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00a1",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u00a4",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "\1\u00a6",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00a8",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "\1\u00ab",
            "",
            "\1\u00ac",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "\1\u00ae",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u00af",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | BAR | DOUBLE_BAR | START_REPETITION | END_REPETITION | BEMOL | CHORD | TONE | TRANSPORT | MINOR | DIMINUTION | MAJ7 | SEVENTH | NOTE | SUSTAIN | FIGURE | DOT | TIE | BEAT | SPEED | SONG | TRACK | EQUAL | NOT_EQUAL | ASSIG | PLUS_ASSIG | MINUS_ASSIG | PROD_ASSIG | DIVIDE_ASSIG | MOD_ASSIG | LT | LE | GT | GE | PLUS | INCR | MINUS | DECR | DIV | MOD | NOT | AND | OR | IF | ELSE | WHILE | FOR | RETURN | TRUE | FALSE | INT | BOOL | ID | NUM | COMMENT | STRING | WS );";
        }
    }
 

}