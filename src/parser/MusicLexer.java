// $ANTLR 3.4 F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g 2017-03-21 20:18:05

    package parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class MusicLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int AND=4;
    public static final int BAR=5;
    public static final int BEAT=6;
    public static final int BEMOL=7;
    public static final int BOOL=8;
    public static final int BOOLEAN=9;
    public static final int COMMENT=10;
    public static final int COMPAS_LIST=11;
    public static final int DIV=12;
    public static final int DOT=13;
    public static final int DOUBLE_BAR=14;
    public static final int ELSE=15;
    public static final int END_REPETITION=16;
    public static final int EQUAL=17;
    public static final int ESC_SEQ=18;
    public static final int FALSE=19;
    public static final int FIGURE=20;
    public static final int FOR=21;
    public static final int FUNCTION=22;
    public static final int GE=23;
    public static final int GT=24;
    public static final int ID=25;
    public static final int IF=26;
    public static final int INT=27;
    public static final int LE=28;
    public static final int LIST_FUNCTIONS=29;
    public static final int LT=30;
    public static final int MINUS=31;
    public static final int MOD=32;
    public static final int NOT=33;
    public static final int NOTE=34;
    public static final int NOTE_LIST=35;
    public static final int NOT_EQUAL=36;
    public static final int NUM=37;
    public static final int OR=38;
    public static final int PLUS=39;
    public static final int RETURN=40;
    public static final int SONG=41;
    public static final int SPEED=42;
    public static final int START_REPETITION=43;
    public static final int STRING=44;
    public static final int SUSTAIN=45;
    public static final int TIE=46;
    public static final int TRACK=47;
    public static final int TRUE=48;
    public static final int WHILE=49;
    public static final int WS=50;

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
    public String getGrammarFileName() { return "F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g"; }

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:6:7: ( '(' )
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:6:9: '('
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
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:7:7: ( ')' )
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:7:9: ')'
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
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:8:7: ( ',' )
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:8:9: ','
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
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:9:7: ( '.' )
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:9:9: '.'
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
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:10:7: ( ':' )
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:10:9: ':'
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
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:11:7: ( ';' )
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:11:9: ';'
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
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:12:7: ( '{' )
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:12:9: '{'
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
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:13:7: ( '}' )
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:13:9: '}'
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
    // $ANTLR end "T__58"

    // $ANTLR start "BAR"
    public final void mBAR() throws RecognitionException {
        try {
            int _type = BAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:114:21: ( '|' )
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:114:23: '|'
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
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:115:22: ( '||' )
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:115:24: '||'
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
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:116:21: ( '||:' )
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:116:23: '||:'
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
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:117:21: ( ':||' )
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:117:23: ':||'
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
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:118:21: ( '&' )
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:118:23: '&'
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

    // $ANTLR start "NOTE"
    public final void mNOTE() throws RecognitionException {
        try {
            int _type = NOTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:119:21: ( ( 'Do' | 'Re' | 'Mi' | 'Fa' | 'Sol' | 'La' | 'Si' ) )
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:119:23: ( 'Do' | 'Re' | 'Mi' | 'Fa' | 'Sol' | 'La' | 'Si' )
            {
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:119:23: ( 'Do' | 'Re' | 'Mi' | 'Fa' | 'Sol' | 'La' | 'Si' )
            int alt1=7;
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
                    alt1=7;
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
                    // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:119:24: 'Do'
                    {
                    match("Do"); 



                    }
                    break;
                case 2 :
                    // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:119:29: 'Re'
                    {
                    match("Re"); 



                    }
                    break;
                case 3 :
                    // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:119:34: 'Mi'
                    {
                    match("Mi"); 



                    }
                    break;
                case 4 :
                    // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:119:39: 'Fa'
                    {
                    match("Fa"); 



                    }
                    break;
                case 5 :
                    // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:119:44: 'Sol'
                    {
                    match("Sol"); 



                    }
                    break;
                case 6 :
                    // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:119:50: 'La'
                    {
                    match("La"); 



                    }
                    break;
                case 7 :
                    // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:119:55: 'Si'
                    {
                    match("Si"); 



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
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:120:21: ( '#' )
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:120:23: '#'
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
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:121:21: ( ( 'sb' | 'm' | 'c' | 'q' | 'sq' | 'dsq' | 'hdsq' ) )
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:121:23: ( 'sb' | 'm' | 'c' | 'q' | 'sq' | 'dsq' | 'hdsq' )
            {
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:121:23: ( 'sb' | 'm' | 'c' | 'q' | 'sq' | 'dsq' | 'hdsq' )
            int alt2=7;
            switch ( input.LA(1) ) {
            case 's':
                {
                int LA2_1 = input.LA(2);

                if ( (LA2_1=='b') ) {
                    alt2=1;
                }
                else if ( (LA2_1=='q') ) {
                    alt2=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;

                }
                }
                break;
            case 'm':
                {
                alt2=2;
                }
                break;
            case 'c':
                {
                alt2=3;
                }
                break;
            case 'q':
                {
                alt2=4;
                }
                break;
            case 'd':
                {
                alt2=6;
                }
                break;
            case 'h':
                {
                alt2=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:121:24: 'sb'
                    {
                    match("sb"); 



                    }
                    break;
                case 2 :
                    // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:121:29: 'm'
                    {
                    match('m'); 

                    }
                    break;
                case 3 :
                    // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:121:33: 'c'
                    {
                    match('c'); 

                    }
                    break;
                case 4 :
                    // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:121:37: 'q'
                    {
                    match('q'); 

                    }
                    break;
                case 5 :
                    // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:121:41: 'sq'
                    {
                    match("sq"); 



                    }
                    break;
                case 6 :
                    // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:121:46: 'dsq'
                    {
                    match("dsq"); 



                    }
                    break;
                case 7 :
                    // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:121:52: 'hdsq'
                    {
                    match("hdsq"); 



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
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:122:21: ( '*' )
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:122:23: '*'
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
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:123:21: ( '~' )
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:123:23: '~'
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
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:124:21: ( 'Beat' )
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:124:23: 'Beat'
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
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:125:21: ( 'Speed' )
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:125:23: 'Speed'
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
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:126:21: ( 'Song' )
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:126:23: 'Song'
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
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:127:21: ( 'Track' )
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:127:23: 'Track'
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
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:130:7: ( '=' )
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:130:9: '='
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
    // $ANTLR end "EQUAL"

    // $ANTLR start "NOT_EQUAL"
    public final void mNOT_EQUAL() throws RecognitionException {
        try {
            int _type = NOT_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:131:10: ( '!=' )
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:131:12: '!='
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

    // $ANTLR start "LT"
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:132:8: ( '<' )
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:132:10: '<'
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
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:133:8: ( '<=' )
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:133:10: '<='
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
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:134:8: ( '>' )
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:134:10: '>'
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
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:135:8: ( '>=' )
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:135:10: '>='
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
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:136:6: ( '+' )
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:136:8: '+'
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

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:137:7: ( '-' )
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:137:9: '-'
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

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:138:9: ( '/' )
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:138:11: '/'
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
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:139:9: ( '%' )
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:139:11: '%'
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
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:140:9: ( 'not' )
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:140:11: 'not'
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
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:141:9: ( 'and' )
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:141:11: 'and'
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
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:142:8: ( 'or' )
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:142:10: 'or'
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
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:143:6: ( 'if' )
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:143:8: 'if'
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
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:144:6: ( 'else' )
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:144:8: 'else'
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
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:145:7: ( 'while' )
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:145:9: 'while'
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
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:146:9: ( 'for' )
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:146:11: 'for'
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
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:147:8: ( 'return' )
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:147:10: 'return'
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
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:148:9: ( 'true' )
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:148:11: 'true'
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
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:149:9: ( 'false' )
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:149:11: 'false'
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
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:150:9: ( 'int' )
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:150:11: 'int'
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
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:151:9: ( 'bool' )
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:151:11: 'bool'
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
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:152:6: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:152:8: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:152:32: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'Z')||LA3_0=='_'||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:
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
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:153:6: ( ( '0' .. '9' )+ )
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:153:8: ( '0' .. '9' )+
            {
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:153:8: ( '0' .. '9' )+
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
            	    // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:
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
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:156:9: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
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
                    // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:156:11: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 



                    // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:156:16: (~ ( '\\n' | '\\r' ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0 >= '\u0000' && LA5_0 <= '\t')||(LA5_0 >= '\u000B' && LA5_0 <= '\f')||(LA5_0 >= '\u000E' && LA5_0 <= '\uFFFF')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:
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


                    // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:156:30: ( '\\r' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='\r') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:156:30: '\\r'
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
                    // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:157:5: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 



                    // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:157:10: ( options {greedy=false; } : . )*
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
                    	    // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:157:38: .
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
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:161:9: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:161:12: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 

            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:161:16: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
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
            	    // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:161:18: ESC_SEQ
            	    {
            	    mESC_SEQ(); 


            	    }
            	    break;
            	case 2 :
            	    // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:161:28: ~ ( '\\\\' | '\"' )
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
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:167:2: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:167:6: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:170:6: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:170:8: ( ' ' | '\\t' | '\\r' | '\\n' )
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
        // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:1:8: ( T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | BAR | DOUBLE_BAR | START_REPETITION | END_REPETITION | BEMOL | NOTE | SUSTAIN | FIGURE | DOT | TIE | BEAT | SPEED | SONG | TRACK | EQUAL | NOT_EQUAL | LT | LE | GT | GE | PLUS | MINUS | DIV | MOD | NOT | AND | OR | IF | ELSE | WHILE | FOR | RETURN | TRUE | FALSE | INT | BOOL | ID | NUM | COMMENT | STRING | WS )
        int alt10=49;
        alt10 = dfa10.predict(input);
        switch (alt10) {
            case 1 :
                // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:1:10: T__51
                {
                mT__51(); 


                }
                break;
            case 2 :
                // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:1:16: T__52
                {
                mT__52(); 


                }
                break;
            case 3 :
                // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:1:22: T__53
                {
                mT__53(); 


                }
                break;
            case 4 :
                // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:1:28: T__54
                {
                mT__54(); 


                }
                break;
            case 5 :
                // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:1:34: T__55
                {
                mT__55(); 


                }
                break;
            case 6 :
                // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:1:40: T__56
                {
                mT__56(); 


                }
                break;
            case 7 :
                // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:1:46: T__57
                {
                mT__57(); 


                }
                break;
            case 8 :
                // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:1:52: T__58
                {
                mT__58(); 


                }
                break;
            case 9 :
                // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:1:58: BAR
                {
                mBAR(); 


                }
                break;
            case 10 :
                // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:1:62: DOUBLE_BAR
                {
                mDOUBLE_BAR(); 


                }
                break;
            case 11 :
                // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:1:73: START_REPETITION
                {
                mSTART_REPETITION(); 


                }
                break;
            case 12 :
                // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:1:90: END_REPETITION
                {
                mEND_REPETITION(); 


                }
                break;
            case 13 :
                // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:1:105: BEMOL
                {
                mBEMOL(); 


                }
                break;
            case 14 :
                // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:1:111: NOTE
                {
                mNOTE(); 


                }
                break;
            case 15 :
                // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:1:116: SUSTAIN
                {
                mSUSTAIN(); 


                }
                break;
            case 16 :
                // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:1:124: FIGURE
                {
                mFIGURE(); 


                }
                break;
            case 17 :
                // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:1:131: DOT
                {
                mDOT(); 


                }
                break;
            case 18 :
                // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:1:135: TIE
                {
                mTIE(); 


                }
                break;
            case 19 :
                // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:1:139: BEAT
                {
                mBEAT(); 


                }
                break;
            case 20 :
                // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:1:144: SPEED
                {
                mSPEED(); 


                }
                break;
            case 21 :
                // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:1:150: SONG
                {
                mSONG(); 


                }
                break;
            case 22 :
                // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:1:155: TRACK
                {
                mTRACK(); 


                }
                break;
            case 23 :
                // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:1:161: EQUAL
                {
                mEQUAL(); 


                }
                break;
            case 24 :
                // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:1:167: NOT_EQUAL
                {
                mNOT_EQUAL(); 


                }
                break;
            case 25 :
                // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:1:177: LT
                {
                mLT(); 


                }
                break;
            case 26 :
                // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:1:180: LE
                {
                mLE(); 


                }
                break;
            case 27 :
                // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:1:183: GT
                {
                mGT(); 


                }
                break;
            case 28 :
                // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:1:186: GE
                {
                mGE(); 


                }
                break;
            case 29 :
                // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:1:189: PLUS
                {
                mPLUS(); 


                }
                break;
            case 30 :
                // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:1:194: MINUS
                {
                mMINUS(); 


                }
                break;
            case 31 :
                // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:1:200: DIV
                {
                mDIV(); 


                }
                break;
            case 32 :
                // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:1:204: MOD
                {
                mMOD(); 


                }
                break;
            case 33 :
                // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:1:208: NOT
                {
                mNOT(); 


                }
                break;
            case 34 :
                // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:1:212: AND
                {
                mAND(); 


                }
                break;
            case 35 :
                // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:1:216: OR
                {
                mOR(); 


                }
                break;
            case 36 :
                // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:1:219: IF
                {
                mIF(); 


                }
                break;
            case 37 :
                // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:1:222: ELSE
                {
                mELSE(); 


                }
                break;
            case 38 :
                // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:1:227: WHILE
                {
                mWHILE(); 


                }
                break;
            case 39 :
                // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:1:233: FOR
                {
                mFOR(); 


                }
                break;
            case 40 :
                // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:1:237: RETURN
                {
                mRETURN(); 


                }
                break;
            case 41 :
                // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:1:244: TRUE
                {
                mTRUE(); 


                }
                break;
            case 42 :
                // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:1:249: FALSE
                {
                mFALSE(); 


                }
                break;
            case 43 :
                // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:1:255: INT
                {
                mINT(); 


                }
                break;
            case 44 :
                // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:1:259: BOOL
                {
                mBOOL(); 


                }
                break;
            case 45 :
                // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:1:264: ID
                {
                mID(); 


                }
                break;
            case 46 :
                // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:1:267: NUM
                {
                mNUM(); 


                }
                break;
            case 47 :
                // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:1:271: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 48 :
                // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:1:279: STRING
                {
                mSTRING(); 


                }
                break;
            case 49 :
                // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:1:286: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA10_eotS =
        "\5\uffff\1\63\3\uffff\1\65\1\uffff\6\56\1\uffff\1\56\3\100\2\56"+
        "\2\uffff\2\56\2\uffff\1\106\1\110\2\uffff\1\112\1\uffff\12\56\6"+
        "\uffff\1\130\1\uffff\4\131\1\56\1\131\1\56\1\131\2\100\1\uffff\4"+
        "\56\6\uffff\2\56\1\143\1\144\10\56\3\uffff\1\131\2\56\1\100\3\56"+
        "\1\162\1\163\2\uffff\1\164\2\56\1\167\4\56\1\174\1\56\1\100\1\176"+
        "\1\56\3\uffff\1\u0080\1\56\1\uffff\2\56\1\u0084\1\u0085\1\uffff"+
        "\1\u0086\1\uffff\1\u0087\1\uffff\1\u0088\1\u0089\1\56\6\uffff\1"+
        "\u008b\1\uffff";
    static final String DFA10_eofS =
        "\u008c\uffff";
    static final String DFA10_minS =
        "\1\11\4\uffff\1\174\3\uffff\1\174\1\uffff\1\157\1\145\1\151\1\141"+
        "\1\151\1\141\1\uffff\1\142\3\60\1\163\1\144\2\uffff\1\145\1\162"+
        "\2\uffff\2\75\2\uffff\1\52\1\uffff\1\157\1\156\1\162\1\146\1\154"+
        "\1\150\1\141\1\145\1\162\1\157\6\uffff\1\72\1\uffff\4\60\1\154\1"+
        "\60\1\145\3\60\1\uffff\1\161\1\163\2\141\6\uffff\1\164\1\144\2\60"+
        "\1\164\1\163\1\151\1\162\1\154\1\164\1\165\1\157\3\uffff\1\60\1"+
        "\147\1\145\1\60\1\161\1\164\1\143\2\60\2\uffff\1\60\1\145\1\154"+
        "\1\60\1\163\1\165\1\145\1\154\1\60\1\144\2\60\1\153\3\uffff\1\60"+
        "\1\145\1\uffff\1\145\1\162\2\60\1\uffff\1\60\1\uffff\1\60\1\uffff"+
        "\2\60\1\156\6\uffff\1\60\1\uffff";
    static final String DFA10_maxS =
        "\1\176\4\uffff\1\174\3\uffff\1\174\1\uffff\1\157\1\145\1\151\1\141"+
        "\1\160\1\141\1\uffff\1\161\3\172\1\163\1\144\2\uffff\1\145\1\162"+
        "\2\uffff\2\75\2\uffff\1\57\1\uffff\1\157\1\156\1\162\1\156\1\154"+
        "\1\150\1\157\1\145\1\162\1\157\6\uffff\1\72\1\uffff\4\172\1\156"+
        "\1\172\1\145\3\172\1\uffff\1\161\1\163\2\141\6\uffff\1\164\1\144"+
        "\2\172\1\164\1\163\1\151\1\162\1\154\1\164\1\165\1\157\3\uffff\1"+
        "\172\1\147\1\145\1\172\1\161\1\164\1\143\2\172\2\uffff\1\172\1\145"+
        "\1\154\1\172\1\163\1\165\1\145\1\154\1\172\1\144\2\172\1\153\3\uffff"+
        "\1\172\1\145\1\uffff\1\145\1\162\2\172\1\uffff\1\172\1\uffff\1\172"+
        "\1\uffff\2\172\1\156\6\uffff\1\172\1\uffff";
    static final String DFA10_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\6\1\7\1\10\1\uffff\1\15\6\uffff"+
        "\1\17\6\uffff\1\21\1\22\2\uffff\1\27\1\30\2\uffff\1\35\1\36\1\uffff"+
        "\1\40\12\uffff\1\55\1\56\1\60\1\61\1\14\1\5\1\uffff\1\11\12\uffff"+
        "\1\20\4\uffff\1\32\1\31\1\34\1\33\1\57\1\37\14\uffff\1\13\1\12\1"+
        "\16\11\uffff\1\43\1\44\15\uffff\1\41\1\42\1\53\2\uffff\1\47\4\uffff"+
        "\1\25\1\uffff\1\23\1\uffff\1\45\3\uffff\1\51\1\54\1\24\1\26\1\46"+
        "\1\52\1\uffff\1\50";
    static final String DFA10_specialS =
        "\u008c\uffff}>";
    static final String[] DFA10_transitionS = {
            "\2\61\2\uffff\1\61\22\uffff\1\61\1\35\1\60\1\21\1\uffff\1\43"+
            "\1\12\1\uffff\1\1\1\2\1\30\1\40\1\3\1\41\1\4\1\42\12\57\1\5"+
            "\1\6\1\36\1\34\1\37\2\uffff\1\56\1\32\1\56\1\13\1\56\1\16\5"+
            "\56\1\20\1\15\4\56\1\14\1\17\1\33\6\56\4\uffff\1\56\1\uffff"+
            "\1\45\1\55\1\24\1\26\1\50\1\52\1\56\1\27\1\47\3\56\1\23\1\44"+
            "\1\46\1\56\1\25\1\53\1\22\1\54\2\56\1\51\3\56\1\7\1\11\1\10"+
            "\1\31",
            "",
            "",
            "",
            "",
            "\1\62",
            "",
            "",
            "",
            "\1\64",
            "",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\73\5\uffff\1\72\1\74",
            "\1\75",
            "",
            "\1\76\16\uffff\1\77",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\101",
            "\1\102",
            "",
            "",
            "\1\103",
            "\1\104",
            "",
            "",
            "\1\105",
            "\1\107",
            "",
            "",
            "\1\111\4\uffff\1\111",
            "",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116\7\uffff\1\117",
            "\1\120",
            "\1\121",
            "\1\123\15\uffff\1\122",
            "\1\124",
            "\1\125",
            "\1\126",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\127",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\132\1\uffff\1\133",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\134",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\141",
            "\1\142",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "",
            "",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\155",
            "\1\156",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\157",
            "\1\160",
            "\1\161",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\165",
            "\1\166",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\175",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\177",
            "",
            "",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0081",
            "",
            "\1\u0082",
            "\1\u0083",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u008a",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
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
            return "1:1: Tokens : ( T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | BAR | DOUBLE_BAR | START_REPETITION | END_REPETITION | BEMOL | NOTE | SUSTAIN | FIGURE | DOT | TIE | BEAT | SPEED | SONG | TRACK | EQUAL | NOT_EQUAL | LT | LE | GT | GE | PLUS | MINUS | DIV | MOD | NOT | AND | OR | IF | ELSE | WHILE | FOR | RETURN | TRUE | FALSE | INT | BOOL | ID | NUM | COMMENT | STRING | WS );";
        }
    }
 

}