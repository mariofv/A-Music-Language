// $ANTLR 3.4 src/parser/Music.g 2017-04-04 20:19:38

    package parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class MusicLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int AND=4;
    public static final int BAR=5;
    public static final int BEAT=6;
    public static final int BEMOL=7;
    public static final int BOOL=8;
    public static final int BOOLEAN=9;
    public static final int CHORD=10;
    public static final int COMMENT=11;
    public static final int COMPAS=12;
    public static final int COMPAS_LIST=13;
    public static final int DIMINUTION=14;
    public static final int DIV=15;
    public static final int DOT=16;
    public static final int DOUBLE_BAR=17;
    public static final int ELSE=18;
    public static final int END_REPETITION=19;
    public static final int EQUAL=20;
    public static final int ESC_SEQ=21;
    public static final int FALSE=22;
    public static final int FIGURE=23;
    public static final int FOR=24;
    public static final int FUNCTION=25;
    public static final int GE=26;
    public static final int GT=27;
    public static final int ID=28;
    public static final int IF=29;
    public static final int INT=30;
    public static final int LE=31;
    public static final int LIST_FUNCTIONS=32;
    public static final int LT=33;
    public static final int MAJ7=34;
    public static final int MINOR=35;
    public static final int MINUS=36;
    public static final int MOD=37;
    public static final int NOT=38;
    public static final int NOTE=39;
    public static final int NOTES=40;
    public static final int NOTE_LIST=41;
    public static final int NOT_EQUAL=42;
    public static final int NUM=43;
    public static final int OR=44;
    public static final int PLUS=45;
    public static final int REPETITION=46;
    public static final int RETURN=47;
    public static final int SEVENTH=48;
    public static final int SONG=49;
    public static final int SPEED=50;
    public static final int START_REPETITION=51;
    public static final int STRING=52;
    public static final int SUSTAIN=53;
    public static final int TIE=54;
    public static final int TONE=55;
    public static final int TRACK=56;
    public static final int TRUE=57;
    public static final int WHILE=58;
    public static final int WS=59;

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

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
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
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
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
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
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
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
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
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
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
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
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
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
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
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
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
    // $ANTLR end "T__67"

    // $ANTLR start "BAR"
    public final void mBAR() throws RecognitionException {
        try {
            int _type = BAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:137:21: ( '|' )
            // src/parser/Music.g:137:23: '|'
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
            // src/parser/Music.g:138:22: ( '||' )
            // src/parser/Music.g:138:24: '||'
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
            // src/parser/Music.g:139:21: ( '||:' )
            // src/parser/Music.g:139:23: '||:'
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
            // src/parser/Music.g:140:21: ( ':||' )
            // src/parser/Music.g:140:23: ':||'
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
            // src/parser/Music.g:141:21: ( '&' )
            // src/parser/Music.g:141:23: '&'
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
            // src/parser/Music.g:142:21: ( 'Chord' )
            // src/parser/Music.g:142:23: 'Chord'
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

    // $ANTLR start "MINOR"
    public final void mMINOR() throws RecognitionException {
        try {
            int _type = MINOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/parser/Music.g:143:21: ( 'm' )
            // src/parser/Music.g:143:23: 'm'
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
            // src/parser/Music.g:144:21: ( 'º' )
            // src/parser/Music.g:144:23: 'º'
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
            // src/parser/Music.g:145:21: ( 'maj7' )
            // src/parser/Music.g:145:23: 'maj7'
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
            // src/parser/Music.g:146:21: ( '7th' )
            // src/parser/Music.g:146:23: '7th'
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
            // src/parser/Music.g:148:21: ( ( 'Do' | 'Re' | 'Mi' | 'Fa' | 'Sol' | 'La' | 'Si' | 'Silence' ) )
            // src/parser/Music.g:148:23: ( 'Do' | 'Re' | 'Mi' | 'Fa' | 'Sol' | 'La' | 'Si' | 'Silence' )
            {
            // src/parser/Music.g:148:23: ( 'Do' | 'Re' | 'Mi' | 'Fa' | 'Sol' | 'La' | 'Si' | 'Silence' )
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
                    // src/parser/Music.g:148:24: 'Do'
                    {
                    match("Do"); 



                    }
                    break;
                case 2 :
                    // src/parser/Music.g:148:29: 'Re'
                    {
                    match("Re"); 



                    }
                    break;
                case 3 :
                    // src/parser/Music.g:148:34: 'Mi'
                    {
                    match("Mi"); 



                    }
                    break;
                case 4 :
                    // src/parser/Music.g:148:39: 'Fa'
                    {
                    match("Fa"); 



                    }
                    break;
                case 5 :
                    // src/parser/Music.g:148:44: 'Sol'
                    {
                    match("Sol"); 



                    }
                    break;
                case 6 :
                    // src/parser/Music.g:148:50: 'La'
                    {
                    match("La"); 



                    }
                    break;
                case 7 :
                    // src/parser/Music.g:148:55: 'Si'
                    {
                    match("Si"); 



                    }
                    break;
                case 8 :
                    // src/parser/Music.g:148:60: 'Silence'
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
            // src/parser/Music.g:149:21: ( '#' )
            // src/parser/Music.g:149:23: '#'
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
            // src/parser/Music.g:150:21: ( ( 'r' | 'b' | 'n' | 'c' | 'sc' | 'f' | 'sf' ) )
            // src/parser/Music.g:150:23: ( 'r' | 'b' | 'n' | 'c' | 'sc' | 'f' | 'sf' )
            {
            // src/parser/Music.g:150:23: ( 'r' | 'b' | 'n' | 'c' | 'sc' | 'f' | 'sf' )
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
                    // src/parser/Music.g:150:24: 'r'
                    {
                    match('r'); 

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:150:28: 'b'
                    {
                    match('b'); 

                    }
                    break;
                case 3 :
                    // src/parser/Music.g:150:32: 'n'
                    {
                    match('n'); 

                    }
                    break;
                case 4 :
                    // src/parser/Music.g:150:36: 'c'
                    {
                    match('c'); 

                    }
                    break;
                case 5 :
                    // src/parser/Music.g:150:40: 'sc'
                    {
                    match("sc"); 



                    }
                    break;
                case 6 :
                    // src/parser/Music.g:150:45: 'f'
                    {
                    match('f'); 

                    }
                    break;
                case 7 :
                    // src/parser/Music.g:150:49: 'sf'
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
            // src/parser/Music.g:151:21: ( '*' )
            // src/parser/Music.g:151:23: '*'
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
            // src/parser/Music.g:152:21: ( '~' )
            // src/parser/Music.g:152:23: '~'
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
            // src/parser/Music.g:153:21: ( 'Beat' )
            // src/parser/Music.g:153:23: 'Beat'
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
            // src/parser/Music.g:154:21: ( 'Speed' )
            // src/parser/Music.g:154:23: 'Speed'
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
            // src/parser/Music.g:155:21: ( 'Song' )
            // src/parser/Music.g:155:23: 'Song'
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
            // src/parser/Music.g:156:21: ( 'Track' )
            // src/parser/Music.g:156:23: 'Track'
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
            // src/parser/Music.g:159:7: ( '=' )
            // src/parser/Music.g:159:9: '='
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
            // src/parser/Music.g:160:10: ( '!=' )
            // src/parser/Music.g:160:12: '!='
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
            // src/parser/Music.g:161:8: ( '<' )
            // src/parser/Music.g:161:10: '<'
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
            // src/parser/Music.g:162:8: ( '<=' )
            // src/parser/Music.g:162:10: '<='
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
            // src/parser/Music.g:163:8: ( '>' )
            // src/parser/Music.g:163:10: '>'
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
            // src/parser/Music.g:164:8: ( '>=' )
            // src/parser/Music.g:164:10: '>='
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
            // src/parser/Music.g:165:6: ( '+' )
            // src/parser/Music.g:165:8: '+'
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
            // src/parser/Music.g:166:7: ( '-' )
            // src/parser/Music.g:166:9: '-'
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
            // src/parser/Music.g:167:9: ( '/' )
            // src/parser/Music.g:167:11: '/'
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
            // src/parser/Music.g:168:9: ( '%' )
            // src/parser/Music.g:168:11: '%'
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
            // src/parser/Music.g:169:9: ( 'not' )
            // src/parser/Music.g:169:11: 'not'
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
            // src/parser/Music.g:170:9: ( 'and' )
            // src/parser/Music.g:170:11: 'and'
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
            // src/parser/Music.g:171:8: ( 'or' )
            // src/parser/Music.g:171:10: 'or'
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
            // src/parser/Music.g:172:6: ( 'if' )
            // src/parser/Music.g:172:8: 'if'
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
            // src/parser/Music.g:173:6: ( 'else' )
            // src/parser/Music.g:173:8: 'else'
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
            // src/parser/Music.g:174:7: ( 'while' )
            // src/parser/Music.g:174:9: 'while'
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
            // src/parser/Music.g:175:9: ( 'for' )
            // src/parser/Music.g:175:11: 'for'
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
            // src/parser/Music.g:176:8: ( 'return' )
            // src/parser/Music.g:176:10: 'return'
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
            // src/parser/Music.g:177:9: ( 'true' )
            // src/parser/Music.g:177:11: 'true'
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
            // src/parser/Music.g:178:9: ( 'false' )
            // src/parser/Music.g:178:11: 'false'
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
            // src/parser/Music.g:179:9: ( 'int' )
            // src/parser/Music.g:179:11: 'int'
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
            // src/parser/Music.g:180:9: ( 'bool' )
            // src/parser/Music.g:180:11: 'bool'
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
            // src/parser/Music.g:181:6: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // src/parser/Music.g:181:8: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // src/parser/Music.g:181:32: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
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
            // src/parser/Music.g:182:6: ( ( '0' .. '9' )+ )
            // src/parser/Music.g:182:8: ( '0' .. '9' )+
            {
            // src/parser/Music.g:182:8: ( '0' .. '9' )+
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
            // src/parser/Music.g:185:9: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
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
                    // src/parser/Music.g:185:11: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 



                    // src/parser/Music.g:185:16: (~ ( '\\n' | '\\r' ) )*
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


                    // src/parser/Music.g:185:30: ( '\\r' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='\r') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // src/parser/Music.g:185:30: '\\r'
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
                    // src/parser/Music.g:186:5: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 



                    // src/parser/Music.g:186:10: ( options {greedy=false; } : . )*
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
                    	    // src/parser/Music.g:186:38: .
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
            // src/parser/Music.g:190:9: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
            // src/parser/Music.g:190:12: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 

            // src/parser/Music.g:190:16: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
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
            	    // src/parser/Music.g:190:18: ESC_SEQ
            	    {
            	    mESC_SEQ(); 


            	    }
            	    break;
            	case 2 :
            	    // src/parser/Music.g:190:28: ~ ( '\\\\' | '\"' )
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
            // src/parser/Music.g:196:2: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
            // src/parser/Music.g:196:6: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
            // src/parser/Music.g:199:6: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // src/parser/Music.g:199:8: ( ' ' | '\\t' | '\\r' | '\\n' )
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
        // src/parser/Music.g:1:8: ( T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | BAR | DOUBLE_BAR | START_REPETITION | END_REPETITION | BEMOL | CHORD | MINOR | DIMINUTION | MAJ7 | SEVENTH | NOTE | SUSTAIN | FIGURE | DOT | TIE | BEAT | SPEED | SONG | TRACK | EQUAL | NOT_EQUAL | LT | LE | GT | GE | PLUS | MINUS | DIV | MOD | NOT | AND | OR | IF | ELSE | WHILE | FOR | RETURN | TRUE | FALSE | INT | BOOL | ID | NUM | COMMENT | STRING | WS )
        int alt10=54;
        alt10 = dfa10.predict(input);
        switch (alt10) {
            case 1 :
                // src/parser/Music.g:1:10: T__60
                {
                mT__60(); 


                }
                break;
            case 2 :
                // src/parser/Music.g:1:16: T__61
                {
                mT__61(); 


                }
                break;
            case 3 :
                // src/parser/Music.g:1:22: T__62
                {
                mT__62(); 


                }
                break;
            case 4 :
                // src/parser/Music.g:1:28: T__63
                {
                mT__63(); 


                }
                break;
            case 5 :
                // src/parser/Music.g:1:34: T__64
                {
                mT__64(); 


                }
                break;
            case 6 :
                // src/parser/Music.g:1:40: T__65
                {
                mT__65(); 


                }
                break;
            case 7 :
                // src/parser/Music.g:1:46: T__66
                {
                mT__66(); 


                }
                break;
            case 8 :
                // src/parser/Music.g:1:52: T__67
                {
                mT__67(); 


                }
                break;
            case 9 :
                // src/parser/Music.g:1:58: BAR
                {
                mBAR(); 


                }
                break;
            case 10 :
                // src/parser/Music.g:1:62: DOUBLE_BAR
                {
                mDOUBLE_BAR(); 


                }
                break;
            case 11 :
                // src/parser/Music.g:1:73: START_REPETITION
                {
                mSTART_REPETITION(); 


                }
                break;
            case 12 :
                // src/parser/Music.g:1:90: END_REPETITION
                {
                mEND_REPETITION(); 


                }
                break;
            case 13 :
                // src/parser/Music.g:1:105: BEMOL
                {
                mBEMOL(); 


                }
                break;
            case 14 :
                // src/parser/Music.g:1:111: CHORD
                {
                mCHORD(); 


                }
                break;
            case 15 :
                // src/parser/Music.g:1:117: MINOR
                {
                mMINOR(); 


                }
                break;
            case 16 :
                // src/parser/Music.g:1:123: DIMINUTION
                {
                mDIMINUTION(); 


                }
                break;
            case 17 :
                // src/parser/Music.g:1:134: MAJ7
                {
                mMAJ7(); 


                }
                break;
            case 18 :
                // src/parser/Music.g:1:139: SEVENTH
                {
                mSEVENTH(); 


                }
                break;
            case 19 :
                // src/parser/Music.g:1:147: NOTE
                {
                mNOTE(); 


                }
                break;
            case 20 :
                // src/parser/Music.g:1:152: SUSTAIN
                {
                mSUSTAIN(); 


                }
                break;
            case 21 :
                // src/parser/Music.g:1:160: FIGURE
                {
                mFIGURE(); 


                }
                break;
            case 22 :
                // src/parser/Music.g:1:167: DOT
                {
                mDOT(); 


                }
                break;
            case 23 :
                // src/parser/Music.g:1:171: TIE
                {
                mTIE(); 


                }
                break;
            case 24 :
                // src/parser/Music.g:1:175: BEAT
                {
                mBEAT(); 


                }
                break;
            case 25 :
                // src/parser/Music.g:1:180: SPEED
                {
                mSPEED(); 


                }
                break;
            case 26 :
                // src/parser/Music.g:1:186: SONG
                {
                mSONG(); 


                }
                break;
            case 27 :
                // src/parser/Music.g:1:191: TRACK
                {
                mTRACK(); 


                }
                break;
            case 28 :
                // src/parser/Music.g:1:197: EQUAL
                {
                mEQUAL(); 


                }
                break;
            case 29 :
                // src/parser/Music.g:1:203: NOT_EQUAL
                {
                mNOT_EQUAL(); 


                }
                break;
            case 30 :
                // src/parser/Music.g:1:213: LT
                {
                mLT(); 


                }
                break;
            case 31 :
                // src/parser/Music.g:1:216: LE
                {
                mLE(); 


                }
                break;
            case 32 :
                // src/parser/Music.g:1:219: GT
                {
                mGT(); 


                }
                break;
            case 33 :
                // src/parser/Music.g:1:222: GE
                {
                mGE(); 


                }
                break;
            case 34 :
                // src/parser/Music.g:1:225: PLUS
                {
                mPLUS(); 


                }
                break;
            case 35 :
                // src/parser/Music.g:1:230: MINUS
                {
                mMINUS(); 


                }
                break;
            case 36 :
                // src/parser/Music.g:1:236: DIV
                {
                mDIV(); 


                }
                break;
            case 37 :
                // src/parser/Music.g:1:240: MOD
                {
                mMOD(); 


                }
                break;
            case 38 :
                // src/parser/Music.g:1:244: NOT
                {
                mNOT(); 


                }
                break;
            case 39 :
                // src/parser/Music.g:1:248: AND
                {
                mAND(); 


                }
                break;
            case 40 :
                // src/parser/Music.g:1:252: OR
                {
                mOR(); 


                }
                break;
            case 41 :
                // src/parser/Music.g:1:255: IF
                {
                mIF(); 


                }
                break;
            case 42 :
                // src/parser/Music.g:1:258: ELSE
                {
                mELSE(); 


                }
                break;
            case 43 :
                // src/parser/Music.g:1:263: WHILE
                {
                mWHILE(); 


                }
                break;
            case 44 :
                // src/parser/Music.g:1:269: FOR
                {
                mFOR(); 


                }
                break;
            case 45 :
                // src/parser/Music.g:1:273: RETURN
                {
                mRETURN(); 


                }
                break;
            case 46 :
                // src/parser/Music.g:1:280: TRUE
                {
                mTRUE(); 


                }
                break;
            case 47 :
                // src/parser/Music.g:1:285: FALSE
                {
                mFALSE(); 


                }
                break;
            case 48 :
                // src/parser/Music.g:1:291: INT
                {
                mINT(); 


                }
                break;
            case 49 :
                // src/parser/Music.g:1:295: BOOL
                {
                mBOOL(); 


                }
                break;
            case 50 :
                // src/parser/Music.g:1:300: ID
                {
                mID(); 


                }
                break;
            case 51 :
                // src/parser/Music.g:1:303: NUM
                {
                mNUM(); 


                }
                break;
            case 52 :
                // src/parser/Music.g:1:307: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 53 :
                // src/parser/Music.g:1:315: STRING
                {
                mSTRING(); 


                }
                break;
            case 54 :
                // src/parser/Music.g:1:322: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA10_eotS =
        "\5\uffff\1\63\3\uffff\1\65\1\uffff\1\56\1\70\1\uffff\1\57\6\56\1"+
        "\uffff\4\103\1\56\1\103\2\uffff\2\56\2\uffff\1\115\1\117\2\uffff"+
        "\1\121\1\uffff\6\56\6\uffff\1\132\1\uffff\2\56\2\uffff\4\135\1\56"+
        "\1\135\1\56\1\135\1\56\1\uffff\2\56\2\103\4\56\6\uffff\1\56\1\152"+
        "\1\153\4\56\2\uffff\2\56\1\uffff\1\135\5\56\1\167\1\170\3\56\1\174"+
        "\2\uffff\1\175\4\56\1\u0082\1\u0083\3\56\1\u0087\2\uffff\1\56\1"+
        "\u0089\1\56\2\uffff\1\u008b\1\56\1\u008d\1\u008e\2\uffff\1\56\1"+
        "\u0090\1\56\1\uffff\1\u0092\1\uffff\1\u0093\1\uffff\1\u0094\2\uffff"+
        "\1\56\1\uffff\1\u0096\3\uffff\1\135\1\uffff";
    static final String DFA10_eofS =
        "\u0097\uffff";
    static final String DFA10_minS =
        "\1\11\4\uffff\1\174\3\uffff\1\174\1\uffff\1\150\1\60\1\uffff\1\164"+
        "\1\157\1\145\1\151\1\141\1\151\1\141\1\uffff\4\60\1\143\1\60\2\uffff"+
        "\1\145\1\162\2\uffff\2\75\2\uffff\1\52\1\uffff\1\156\1\162\1\146"+
        "\1\154\1\150\1\162\6\uffff\1\72\1\uffff\1\157\1\152\2\uffff\4\60"+
        "\1\154\1\60\1\145\1\60\1\164\1\uffff\1\157\1\164\2\60\1\162\1\154"+
        "\2\141\6\uffff\1\144\2\60\1\164\1\163\1\151\1\165\2\uffff\1\162"+
        "\1\67\1\uffff\1\60\1\147\2\145\1\165\1\154\2\60\1\163\1\164\1\143"+
        "\1\60\2\uffff\1\60\1\145\1\154\1\145\1\144\2\60\1\156\1\144\1\162"+
        "\1\60\2\uffff\1\145\1\60\1\153\2\uffff\1\60\1\145\2\60\2\uffff\1"+
        "\143\1\60\1\156\1\uffff\1\60\1\uffff\1\60\1\uffff\1\60\2\uffff\1"+
        "\145\1\uffff\1\60\3\uffff\1\60\1\uffff";
    static final String DFA10_maxS =
        "\1\u00c2\4\uffff\1\174\3\uffff\1\174\1\uffff\1\150\1\172\1\uffff"+
        "\1\164\1\157\1\145\1\151\1\141\1\160\1\141\1\uffff\4\172\1\146\1"+
        "\172\2\uffff\1\145\1\162\2\uffff\2\75\2\uffff\1\57\1\uffff\1\156"+
        "\1\162\1\156\1\154\1\150\1\162\6\uffff\1\72\1\uffff\1\157\1\152"+
        "\2\uffff\4\172\1\156\1\172\1\145\1\172\1\164\1\uffff\1\157\1\164"+
        "\2\172\1\162\1\154\2\141\6\uffff\1\144\2\172\1\164\1\163\1\151\1"+
        "\165\2\uffff\1\162\1\67\1\uffff\1\172\1\147\2\145\1\165\1\154\2"+
        "\172\1\163\1\164\1\143\1\172\2\uffff\1\172\1\145\1\154\1\145\1\144"+
        "\2\172\1\156\1\144\1\162\1\172\2\uffff\1\145\1\172\1\153\2\uffff"+
        "\1\172\1\145\2\172\2\uffff\1\143\1\172\1\156\1\uffff\1\172\1\uffff"+
        "\1\172\1\uffff\1\172\2\uffff\1\145\1\uffff\1\172\3\uffff\1\172\1"+
        "\uffff";
    static final String DFA10_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\6\1\7\1\10\1\uffff\1\15\2\uffff"+
        "\1\20\7\uffff\1\24\6\uffff\1\26\1\27\2\uffff\1\34\1\35\2\uffff\1"+
        "\42\1\43\1\uffff\1\45\6\uffff\1\62\1\63\1\65\1\66\1\14\1\5\1\uffff"+
        "\1\11\2\uffff\1\17\1\22\11\uffff\1\25\10\uffff\1\37\1\36\1\41\1"+
        "\40\1\64\1\44\7\uffff\1\13\1\12\2\uffff\1\23\14\uffff\1\50\1\51"+
        "\13\uffff\1\46\1\54\3\uffff\1\47\1\60\4\uffff\1\21\1\32\3\uffff"+
        "\1\61\1\uffff\1\30\1\uffff\1\52\1\uffff\1\56\1\16\1\uffff\1\31\1"+
        "\uffff\1\57\1\33\1\53\1\uffff\1\55";
    static final String DFA10_specialS =
        "\u0097\uffff}>";
    static final String[] DFA10_transitionS = {
            "\2\61\2\uffff\1\61\22\uffff\1\61\1\41\1\60\1\25\1\uffff\1\47"+
            "\1\12\1\uffff\1\1\1\2\1\34\1\44\1\3\1\45\1\4\1\46\7\57\1\16"+
            "\2\57\1\5\1\6\1\42\1\40\1\43\2\uffff\1\56\1\36\1\13\1\17\1\56"+
            "\1\22\5\56\1\24\1\21\4\56\1\20\1\23\1\37\6\56\4\uffff\1\56\1"+
            "\uffff\1\50\1\27\1\31\1\56\1\53\1\33\2\56\1\52\3\56\1\14\1\30"+
            "\1\51\2\56\1\26\1\32\1\55\2\56\1\54\3\56\1\7\1\11\1\10\1\35"+
            "\103\uffff\1\15",
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
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\1\67\31\56",
            "",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\77\5\uffff\1\76\1\100",
            "\1\101",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\102\25\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\16\56\1\104\13\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\16\56\1\105\13\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\106\2\uffff\1\107",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\1\111\15\56\1\110"+
            "\13\56",
            "",
            "",
            "\1\112",
            "\1\113",
            "",
            "",
            "\1\114",
            "\1\116",
            "",
            "",
            "\1\120\4\uffff\1\120",
            "",
            "\1\122",
            "\1\123",
            "\1\124\7\uffff\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\131",
            "",
            "\1\133",
            "\1\134",
            "",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\136\1\uffff\1\137",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\13\56\1\140\16\56",
            "\1\141",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\142",
            "",
            "\1\143",
            "\1\144",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\151",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "",
            "",
            "\1\160",
            "\1\161",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\171",
            "\1\172",
            "\1\173",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "\1\u0088",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u008a",
            "",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u008c",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "\1\u008f",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0091",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "\1\u0095",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
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
            return "1:1: Tokens : ( T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | BAR | DOUBLE_BAR | START_REPETITION | END_REPETITION | BEMOL | CHORD | MINOR | DIMINUTION | MAJ7 | SEVENTH | NOTE | SUSTAIN | FIGURE | DOT | TIE | BEAT | SPEED | SONG | TRACK | EQUAL | NOT_EQUAL | LT | LE | GT | GE | PLUS | MINUS | DIV | MOD | NOT | AND | OR | IF | ELSE | WHILE | FOR | RETURN | TRUE | FALSE | INT | BOOL | ID | NUM | COMMENT | STRING | WS );";
        }
    }
 

}