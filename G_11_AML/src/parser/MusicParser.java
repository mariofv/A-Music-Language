// $ANTLR 3.4 src/parser/Music.g 2017-05-27 14:12:47

package parser;
    import interpreter.AmlTree;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class MusicParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ARMOR", "ASSIG", "ATTR_ACCESS", "BAR", "BEAT", "BEMOL", "BOOL", "BOOLEAN", "CHORD", "COMMENT", "COMPAS", "COMPAS_LIST", "DECR", "DIMINUTION", "DIV", "DIVIDE_ASSIG", "DN", "DOT", "DOUBLE_BAR", "DRUMS", "DRUMS_NOTE_TYPE", "DRUMS_TRACK", "DRUM_FIGURE", "DRUM_NOTE", "DRUM_NOTES", "ELSE", "ELSEIF", "END_REPETITION", "EQUAL", "ESC_SEQ", "FALSE", "FIGURE", "FIGURE_NAME", "FIGURE_TYPE", "FOR", "FRAGCALL", "FRAGMENT", "FUNCALL", "FUNCTION", "GE", "GT", "ID", "ID_", "IF", "INCR", "INSTRUMENT", "INT", "LE", "LETTER_X", "LIST_ARGUMENTS", "LIST_ASSIG", "LIST_FUNCTIONS", "LIST_INSTRUCTIONS", "LIST_MUSIC_INST", "LT", "MAJ7", "MINOR", "MINUS", "MINUS_ASSIG", "MOD", "MOD_ASSIG", "NEG_NUM", "NOT", "NOTE", "NOTES", "NOTE_TYPE", "NOT_EQUAL", "NUM", "OR", "PLUS", "PLUS_ASSIG", "POST", "POS_NUM", "PRE", "PROD_ASSIG", "READ", "REPETITION", "RETURN", "SEVENTH", "SONG", "SPEED", "START_REPETITION", "STRING", "STRING_TYPE", "SUSTAIN", "TIE", "TONE", "TRACK", "TRANSPORT", "TRIPLET", "TRUE", "VAR_FUNCALL", "VOID", "VOLUME", "WHILE", "WRITE", "WS", "'('", "')'", "','", "'.'", "':'", "';'", "'F:'", "'N:'", "'['", "']'", "'{'", "'}'"
    };

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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public MusicParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public MusicParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return MusicParser.tokenNames; }
    public String getGrammarFileName() { return "src/parser/Music.g"; }


    public static class prog_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prog"
    // src/parser/Music.g:47:1: prog : ( global_stmt )+ EOF -> ^( LIST_FUNCTIONS ( global_stmt )+ ) ;
    public final MusicParser.prog_return prog() throws RecognitionException {
        MusicParser.prog_return retval = new MusicParser.prog_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token EOF2=null;
        MusicParser.global_stmt_return global_stmt1 =null;


        AmlTree EOF2_tree=null;
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_global_stmt=new RewriteRuleSubtreeStream(adaptor,"rule global_stmt");
        try {
            // src/parser/Music.g:47:10: ( ( global_stmt )+ EOF -> ^( LIST_FUNCTIONS ( global_stmt )+ ) )
            // src/parser/Music.g:47:14: ( global_stmt )+ EOF
            {
            // src/parser/Music.g:47:14: ( global_stmt )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==BOOL||LA1_0==CHORD||LA1_0==DRUMS_NOTE_TYPE||LA1_0==FIGURE_TYPE||LA1_0==FRAGMENT||LA1_0==INT||LA1_0==NOTE_TYPE||LA1_0==SONG||LA1_0==STRING_TYPE||LA1_0==VOID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // src/parser/Music.g:47:15: global_stmt
            	    {
            	    pushFollow(FOLLOW_global_stmt_in_prog235);
            	    global_stmt1=global_stmt();

            	    state._fsp--;

            	    stream_global_stmt.add(global_stmt1.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_prog239);  
            stream_EOF.add(EOF2);


            // AST REWRITE
            // elements: global_stmt
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AmlTree)adaptor.nil();
            // 47:33: -> ^( LIST_FUNCTIONS ( global_stmt )+ )
            {
                // src/parser/Music.g:47:36: ^( LIST_FUNCTIONS ( global_stmt )+ )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(LIST_FUNCTIONS, "LIST_FUNCTIONS")
                , root_1);

                if ( !(stream_global_stmt.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_global_stmt.hasNext() ) {
                    adaptor.addChild(root_1, stream_global_stmt.nextTree());

                }
                stream_global_stmt.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "prog"


    public static class global_stmt_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "global_stmt"
    // src/parser/Music.g:50:1: global_stmt : ( function | frag | song );
    public final MusicParser.global_stmt_return global_stmt() throws RecognitionException {
        MusicParser.global_stmt_return retval = new MusicParser.global_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        MusicParser.function_return function3 =null;

        MusicParser.frag_return frag4 =null;

        MusicParser.song_return song5 =null;



        try {
            // src/parser/Music.g:50:13: ( function | frag | song )
            int alt2=3;
            switch ( input.LA(1) ) {
            case BOOL:
            case CHORD:
            case DRUMS_NOTE_TYPE:
            case FIGURE_TYPE:
            case INT:
            case NOTE_TYPE:
            case STRING_TYPE:
            case VOID:
                {
                alt2=1;
                }
                break;
            case FRAGMENT:
                {
                alt2=2;
                }
                break;
            case SONG:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // src/parser/Music.g:50:17: function
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_function_in_global_stmt271);
                    function3=function();

                    state._fsp--;

                    adaptor.addChild(root_0, function3.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:51:17: frag
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_frag_in_global_stmt289);
                    frag4=frag();

                    state._fsp--;

                    adaptor.addChild(root_0, frag4.getTree());

                    }
                    break;
                case 3 :
                    // src/parser/Music.g:52:17: song
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_song_in_global_stmt307);
                    song5=song();

                    state._fsp--;

                    adaptor.addChild(root_0, song5.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "global_stmt"


    public static class function_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "function"
    // src/parser/Music.g:55:1: function : type_void id= id_rule '(' list_arguments ')' '{' listInst '}' -> ^( FUNCTION[$id.text] type_void list_arguments listInst ) ;
    public final MusicParser.function_return function() throws RecognitionException {
        MusicParser.function_return retval = new MusicParser.function_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal7=null;
        Token char_literal9=null;
        Token char_literal10=null;
        Token char_literal12=null;
        MusicParser.id_rule_return id =null;

        MusicParser.type_void_return type_void6 =null;

        MusicParser.list_arguments_return list_arguments8 =null;

        MusicParser.listInst_return listInst11 =null;


        AmlTree char_literal7_tree=null;
        AmlTree char_literal9_tree=null;
        AmlTree char_literal10_tree=null;
        AmlTree char_literal12_tree=null;
        RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_103=new RewriteRuleTokenStream(adaptor,"token 103");
        RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
        RewriteRuleSubtreeStream stream_listInst=new RewriteRuleSubtreeStream(adaptor,"rule listInst");
        RewriteRuleSubtreeStream stream_list_arguments=new RewriteRuleSubtreeStream(adaptor,"rule list_arguments");
        RewriteRuleSubtreeStream stream_type_void=new RewriteRuleSubtreeStream(adaptor,"rule type_void");
        RewriteRuleSubtreeStream stream_id_rule=new RewriteRuleSubtreeStream(adaptor,"rule id_rule");
        try {
            // src/parser/Music.g:55:13: ( type_void id= id_rule '(' list_arguments ')' '{' listInst '}' -> ^( FUNCTION[$id.text] type_void list_arguments listInst ) )
            // src/parser/Music.g:55:16: type_void id= id_rule '(' list_arguments ')' '{' listInst '}'
            {
            pushFollow(FOLLOW_type_void_in_function332);
            type_void6=type_void();

            state._fsp--;

            stream_type_void.add(type_void6.getTree());

            pushFollow(FOLLOW_id_rule_in_function336);
            id=id_rule();

            state._fsp--;

            stream_id_rule.add(id.getTree());

            char_literal7=(Token)match(input,102,FOLLOW_102_in_function338);  
            stream_102.add(char_literal7);


            pushFollow(FOLLOW_list_arguments_in_function340);
            list_arguments8=list_arguments();

            state._fsp--;

            stream_list_arguments.add(list_arguments8.getTree());

            char_literal9=(Token)match(input,103,FOLLOW_103_in_function342);  
            stream_103.add(char_literal9);


            char_literal10=(Token)match(input,112,FOLLOW_112_in_function344);  
            stream_112.add(char_literal10);


            pushFollow(FOLLOW_listInst_in_function346);
            listInst11=listInst();

            state._fsp--;

            stream_listInst.add(listInst11.getTree());

            char_literal12=(Token)match(input,113,FOLLOW_113_in_function348);  
            stream_113.add(char_literal12);


            // AST REWRITE
            // elements: list_arguments, listInst, type_void
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AmlTree)adaptor.nil();
            // 55:80: -> ^( FUNCTION[$id.text] type_void list_arguments listInst )
            {
                // src/parser/Music.g:55:85: ^( FUNCTION[$id.text] type_void list_arguments listInst )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(FUNCTION, (id!=null?input.toString(id.start,id.stop):null))
                , root_1);

                adaptor.addChild(root_1, stream_type_void.nextTree());

                adaptor.addChild(root_1, stream_list_arguments.nextTree());

                adaptor.addChild(root_1, stream_listInst.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "function"


    public static class funcall_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "funcall"
    // src/parser/Music.g:58:1: funcall : id= id_rule '(' ( params )? ')' -> ^( FUNCALL[$id.text] ( params )? ) ;
    public final MusicParser.funcall_return funcall() throws RecognitionException {
        MusicParser.funcall_return retval = new MusicParser.funcall_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal13=null;
        Token char_literal15=null;
        MusicParser.id_rule_return id =null;

        MusicParser.params_return params14 =null;


        AmlTree char_literal13_tree=null;
        AmlTree char_literal15_tree=null;
        RewriteRuleTokenStream stream_103=new RewriteRuleTokenStream(adaptor,"token 103");
        RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
        RewriteRuleSubtreeStream stream_id_rule=new RewriteRuleSubtreeStream(adaptor,"rule id_rule");
        RewriteRuleSubtreeStream stream_params=new RewriteRuleSubtreeStream(adaptor,"rule params");
        try {
            // src/parser/Music.g:58:13: (id= id_rule '(' ( params )? ')' -> ^( FUNCALL[$id.text] ( params )? ) )
            // src/parser/Music.g:58:16: id= id_rule '(' ( params )? ')'
            {
            pushFollow(FOLLOW_id_rule_in_funcall394);
            id=id_rule();

            state._fsp--;

            stream_id_rule.add(id.getTree());

            char_literal13=(Token)match(input,102,FOLLOW_102_in_funcall396);  
            stream_102.add(char_literal13);


            // src/parser/Music.g:58:31: ( params )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==ARMOR||LA3_0==BEMOL||LA3_0==CHORD||LA3_0==DN||LA3_0==FALSE||LA3_0==ID_||LA3_0==LETTER_X||LA3_0==MINUS||(LA3_0 >= NEG_NUM && LA3_0 <= NOTE)||LA3_0==PLUS||LA3_0==POS_NUM||LA3_0==STRING||LA3_0==SUSTAIN||LA3_0==TRUE||LA3_0==102||LA3_0==109) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // src/parser/Music.g:58:31: params
                    {
                    pushFollow(FOLLOW_params_in_funcall398);
                    params14=params();

                    state._fsp--;

                    stream_params.add(params14.getTree());

                    }
                    break;

            }


            char_literal15=(Token)match(input,103,FOLLOW_103_in_funcall401);  
            stream_103.add(char_literal15);


            // AST REWRITE
            // elements: params
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AmlTree)adaptor.nil();
            // 58:43: -> ^( FUNCALL[$id.text] ( params )? )
            {
                // src/parser/Music.g:58:46: ^( FUNCALL[$id.text] ( params )? )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(FUNCALL, (id!=null?input.toString(id.start,id.stop):null))
                , root_1);

                // src/parser/Music.g:58:66: ( params )?
                if ( stream_params.hasNext() ) {
                    adaptor.addChild(root_1, stream_params.nextTree());

                }
                stream_params.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "funcall"


    public static class fragcall_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fragcall"
    // src/parser/Music.g:61:1: fragcall : 'F:' id= id_rule '(' ( params )? ')' -> ^( FRAGCALL[$id.text] ( params )? ) ;
    public final MusicParser.fragcall_return fragcall() throws RecognitionException {
        MusicParser.fragcall_return retval = new MusicParser.fragcall_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token string_literal16=null;
        Token char_literal17=null;
        Token char_literal19=null;
        MusicParser.id_rule_return id =null;

        MusicParser.params_return params18 =null;


        AmlTree string_literal16_tree=null;
        AmlTree char_literal17_tree=null;
        AmlTree char_literal19_tree=null;
        RewriteRuleTokenStream stream_108=new RewriteRuleTokenStream(adaptor,"token 108");
        RewriteRuleTokenStream stream_103=new RewriteRuleTokenStream(adaptor,"token 103");
        RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
        RewriteRuleSubtreeStream stream_id_rule=new RewriteRuleSubtreeStream(adaptor,"rule id_rule");
        RewriteRuleSubtreeStream stream_params=new RewriteRuleSubtreeStream(adaptor,"rule params");
        try {
            // src/parser/Music.g:61:14: ( 'F:' id= id_rule '(' ( params )? ')' -> ^( FRAGCALL[$id.text] ( params )? ) )
            // src/parser/Music.g:61:18: 'F:' id= id_rule '(' ( params )? ')'
            {
            string_literal16=(Token)match(input,108,FOLLOW_108_in_fragcall438);  
            stream_108.add(string_literal16);


            pushFollow(FOLLOW_id_rule_in_fragcall442);
            id=id_rule();

            state._fsp--;

            stream_id_rule.add(id.getTree());

            char_literal17=(Token)match(input,102,FOLLOW_102_in_fragcall444);  
            stream_102.add(char_literal17);


            // src/parser/Music.g:61:38: ( params )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==ARMOR||LA4_0==BEMOL||LA4_0==CHORD||LA4_0==DN||LA4_0==FALSE||LA4_0==ID_||LA4_0==LETTER_X||LA4_0==MINUS||(LA4_0 >= NEG_NUM && LA4_0 <= NOTE)||LA4_0==PLUS||LA4_0==POS_NUM||LA4_0==STRING||LA4_0==SUSTAIN||LA4_0==TRUE||LA4_0==102||LA4_0==109) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // src/parser/Music.g:61:38: params
                    {
                    pushFollow(FOLLOW_params_in_fragcall446);
                    params18=params();

                    state._fsp--;

                    stream_params.add(params18.getTree());

                    }
                    break;

            }


            char_literal19=(Token)match(input,103,FOLLOW_103_in_fragcall449);  
            stream_103.add(char_literal19);


            // AST REWRITE
            // elements: params
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AmlTree)adaptor.nil();
            // 61:50: -> ^( FRAGCALL[$id.text] ( params )? )
            {
                // src/parser/Music.g:61:53: ^( FRAGCALL[$id.text] ( params )? )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(FRAGCALL, (id!=null?input.toString(id.start,id.stop):null))
                , root_1);

                // src/parser/Music.g:61:74: ( params )?
                if ( stream_params.hasNext() ) {
                    adaptor.addChild(root_1, stream_params.nextTree());

                }
                stream_params.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "fragcall"


    public static class frag_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "frag"
    // src/parser/Music.g:64:1: frag : FRAGMENT ^ id_rule '(' ! list_arguments ')' ! '{' ! list_music_inst '}' !;
    public final MusicParser.frag_return frag() throws RecognitionException {
        MusicParser.frag_return retval = new MusicParser.frag_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token FRAGMENT20=null;
        Token char_literal22=null;
        Token char_literal24=null;
        Token char_literal25=null;
        Token char_literal27=null;
        MusicParser.id_rule_return id_rule21 =null;

        MusicParser.list_arguments_return list_arguments23 =null;

        MusicParser.list_music_inst_return list_music_inst26 =null;


        AmlTree FRAGMENT20_tree=null;
        AmlTree char_literal22_tree=null;
        AmlTree char_literal24_tree=null;
        AmlTree char_literal25_tree=null;
        AmlTree char_literal27_tree=null;

        try {
            // src/parser/Music.g:64:9: ( FRAGMENT ^ id_rule '(' ! list_arguments ')' ! '{' ! list_music_inst '}' !)
            // src/parser/Music.g:64:11: FRAGMENT ^ id_rule '(' ! list_arguments ')' ! '{' ! list_music_inst '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            FRAGMENT20=(Token)match(input,FRAGMENT,FOLLOW_FRAGMENT_in_frag483); 
            FRAGMENT20_tree = 
            (AmlTree)adaptor.create(FRAGMENT20)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(FRAGMENT20_tree, root_0);


            pushFollow(FOLLOW_id_rule_in_frag486);
            id_rule21=id_rule();

            state._fsp--;

            adaptor.addChild(root_0, id_rule21.getTree());

            char_literal22=(Token)match(input,102,FOLLOW_102_in_frag488); 

            pushFollow(FOLLOW_list_arguments_in_frag491);
            list_arguments23=list_arguments();

            state._fsp--;

            adaptor.addChild(root_0, list_arguments23.getTree());

            char_literal24=(Token)match(input,103,FOLLOW_103_in_frag493); 

            char_literal25=(Token)match(input,112,FOLLOW_112_in_frag496); 

            pushFollow(FOLLOW_list_music_inst_in_frag499);
            list_music_inst26=list_music_inst();

            state._fsp--;

            adaptor.addChild(root_0, list_music_inst26.getTree());

            char_literal27=(Token)match(input,113,FOLLOW_113_in_frag501); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "frag"


    public static class list_arguments_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "list_arguments"
    // src/parser/Music.g:67:1: list_arguments : ( argument ( ',' argument )* )? -> ^( LIST_ARGUMENTS ( argument )* ) ;
    public final MusicParser.list_arguments_return list_arguments() throws RecognitionException {
        MusicParser.list_arguments_return retval = new MusicParser.list_arguments_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal29=null;
        MusicParser.argument_return argument28 =null;

        MusicParser.argument_return argument30 =null;


        AmlTree char_literal29_tree=null;
        RewriteRuleTokenStream stream_104=new RewriteRuleTokenStream(adaptor,"token 104");
        RewriteRuleSubtreeStream stream_argument=new RewriteRuleSubtreeStream(adaptor,"rule argument");
        try {
            // src/parser/Music.g:67:17: ( ( argument ( ',' argument )* )? -> ^( LIST_ARGUMENTS ( argument )* ) )
            // src/parser/Music.g:67:19: ( argument ( ',' argument )* )?
            {
            // src/parser/Music.g:67:19: ( argument ( ',' argument )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==BOOL||LA6_0==CHORD||LA6_0==DRUMS_NOTE_TYPE||LA6_0==FIGURE_TYPE||LA6_0==INT||LA6_0==NOTE_TYPE||LA6_0==STRING_TYPE) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // src/parser/Music.g:67:20: argument ( ',' argument )*
                    {
                    pushFollow(FOLLOW_argument_in_list_arguments521);
                    argument28=argument();

                    state._fsp--;

                    stream_argument.add(argument28.getTree());

                    // src/parser/Music.g:67:29: ( ',' argument )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==104) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // src/parser/Music.g:67:30: ',' argument
                    	    {
                    	    char_literal29=(Token)match(input,104,FOLLOW_104_in_list_arguments524);  
                    	    stream_104.add(char_literal29);


                    	    pushFollow(FOLLOW_argument_in_list_arguments526);
                    	    argument30=argument();

                    	    state._fsp--;

                    	    stream_argument.add(argument30.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }


            // AST REWRITE
            // elements: argument
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AmlTree)adaptor.nil();
            // 67:47: -> ^( LIST_ARGUMENTS ( argument )* )
            {
                // src/parser/Music.g:67:50: ^( LIST_ARGUMENTS ( argument )* )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(LIST_ARGUMENTS, "LIST_ARGUMENTS")
                , root_1);

                // src/parser/Music.g:67:67: ( argument )*
                while ( stream_argument.hasNext() ) {
                    adaptor.addChild(root_1, stream_argument.nextTree());

                }
                stream_argument.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "list_arguments"


    public static class argument_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "argument"
    // src/parser/Music.g:70:1: argument : type ^ id_rule ;
    public final MusicParser.argument_return argument() throws RecognitionException {
        MusicParser.argument_return retval = new MusicParser.argument_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        MusicParser.type_return type31 =null;

        MusicParser.id_rule_return id_rule32 =null;



        try {
            // src/parser/Music.g:70:11: ( type ^ id_rule )
            // src/parser/Music.g:70:15: type ^ id_rule
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_type_in_argument567);
            type31=type();

            state._fsp--;

            root_0 = (AmlTree)adaptor.becomeRoot(type31.getTree(), root_0);

            pushFollow(FOLLOW_id_rule_in_argument570);
            id_rule32=id_rule();

            state._fsp--;

            adaptor.addChild(root_0, id_rule32.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "argument"


    public static class params_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "params"
    // src/parser/Music.g:73:1: params : ( expr | notes_variable | drumsnotes_variable ) ( ',' ! ( expr | notes_variable | drumsnotes_variable ) )* ;
    public final MusicParser.params_return params() throws RecognitionException {
        MusicParser.params_return retval = new MusicParser.params_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal36=null;
        MusicParser.expr_return expr33 =null;

        MusicParser.notes_variable_return notes_variable34 =null;

        MusicParser.drumsnotes_variable_return drumsnotes_variable35 =null;

        MusicParser.expr_return expr37 =null;

        MusicParser.notes_variable_return notes_variable38 =null;

        MusicParser.drumsnotes_variable_return drumsnotes_variable39 =null;


        AmlTree char_literal36_tree=null;

        try {
            // src/parser/Music.g:73:13: ( ( expr | notes_variable | drumsnotes_variable ) ( ',' ! ( expr | notes_variable | drumsnotes_variable ) )* )
            // src/parser/Music.g:73:17: ( expr | notes_variable | drumsnotes_variable ) ( ',' ! ( expr | notes_variable | drumsnotes_variable ) )*
            {
            root_0 = (AmlTree)adaptor.nil();


            // src/parser/Music.g:73:17: ( expr | notes_variable | drumsnotes_variable )
            int alt7=3;
            switch ( input.LA(1) ) {
            case FALSE:
            case ID_:
            case LETTER_X:
            case MINUS:
            case NEG_NUM:
            case NOT:
            case PLUS:
            case POS_NUM:
            case STRING:
            case TRUE:
                {
                alt7=1;
                }
                break;
            case 102:
                {
                switch ( input.LA(2) ) {
                case FALSE:
                case ID_:
                case LETTER_X:
                case MINUS:
                case NEG_NUM:
                case NOT:
                case PLUS:
                case POS_NUM:
                case STRING:
                case TRUE:
                case 102:
                    {
                    alt7=1;
                    }
                    break;
                case ARMOR:
                case BEMOL:
                case NOTE:
                case SUSTAIN:
                    {
                    alt7=2;
                    }
                    break;
                case DN:
                    {
                    alt7=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 2, input);

                    throw nvae;

                }

                }
                break;
            case ARMOR:
            case BEMOL:
            case CHORD:
            case NOTE:
            case SUSTAIN:
            case 109:
                {
                alt7=2;
                }
                break;
            case DN:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }

            switch (alt7) {
                case 1 :
                    // src/parser/Music.g:73:18: expr
                    {
                    pushFollow(FOLLOW_expr_in_params597);
                    expr33=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr33.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:73:25: notes_variable
                    {
                    pushFollow(FOLLOW_notes_variable_in_params601);
                    notes_variable34=notes_variable();

                    state._fsp--;

                    adaptor.addChild(root_0, notes_variable34.getTree());

                    }
                    break;
                case 3 :
                    // src/parser/Music.g:73:42: drumsnotes_variable
                    {
                    pushFollow(FOLLOW_drumsnotes_variable_in_params605);
                    drumsnotes_variable35=drumsnotes_variable();

                    state._fsp--;

                    adaptor.addChild(root_0, drumsnotes_variable35.getTree());

                    }
                    break;

            }


            // src/parser/Music.g:73:63: ( ',' ! ( expr | notes_variable | drumsnotes_variable ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==104) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // src/parser/Music.g:73:64: ',' ! ( expr | notes_variable | drumsnotes_variable )
            	    {
            	    char_literal36=(Token)match(input,104,FOLLOW_104_in_params609); 

            	    // src/parser/Music.g:73:69: ( expr | notes_variable | drumsnotes_variable )
            	    int alt8=3;
            	    switch ( input.LA(1) ) {
            	    case FALSE:
            	    case ID_:
            	    case LETTER_X:
            	    case MINUS:
            	    case NEG_NUM:
            	    case NOT:
            	    case PLUS:
            	    case POS_NUM:
            	    case STRING:
            	    case TRUE:
            	        {
            	        alt8=1;
            	        }
            	        break;
            	    case 102:
            	        {
            	        switch ( input.LA(2) ) {
            	        case FALSE:
            	        case ID_:
            	        case LETTER_X:
            	        case MINUS:
            	        case NEG_NUM:
            	        case NOT:
            	        case PLUS:
            	        case POS_NUM:
            	        case STRING:
            	        case TRUE:
            	        case 102:
            	            {
            	            alt8=1;
            	            }
            	            break;
            	        case ARMOR:
            	        case BEMOL:
            	        case NOTE:
            	        case SUSTAIN:
            	            {
            	            alt8=2;
            	            }
            	            break;
            	        case DN:
            	            {
            	            alt8=3;
            	            }
            	            break;
            	        default:
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 8, 2, input);

            	            throw nvae;

            	        }

            	        }
            	        break;
            	    case ARMOR:
            	    case BEMOL:
            	    case CHORD:
            	    case NOTE:
            	    case SUSTAIN:
            	    case 109:
            	        {
            	        alt8=2;
            	        }
            	        break;
            	    case DN:
            	        {
            	        alt8=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 8, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt8) {
            	        case 1 :
            	            // src/parser/Music.g:73:70: expr
            	            {
            	            pushFollow(FOLLOW_expr_in_params613);
            	            expr37=expr();

            	            state._fsp--;

            	            adaptor.addChild(root_0, expr37.getTree());

            	            }
            	            break;
            	        case 2 :
            	            // src/parser/Music.g:73:77: notes_variable
            	            {
            	            pushFollow(FOLLOW_notes_variable_in_params617);
            	            notes_variable38=notes_variable();

            	            state._fsp--;

            	            adaptor.addChild(root_0, notes_variable38.getTree());

            	            }
            	            break;
            	        case 3 :
            	            // src/parser/Music.g:73:94: drumsnotes_variable
            	            {
            	            pushFollow(FOLLOW_drumsnotes_variable_in_params621);
            	            drumsnotes_variable39=drumsnotes_variable();

            	            state._fsp--;

            	            adaptor.addChild(root_0, drumsnotes_variable39.getTree());

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "params"


    public static class listInst_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "listInst"
    // src/parser/Music.g:76:1: listInst : ( inst )+ -> ^( LIST_INSTRUCTIONS ( inst )+ ) ;
    public final MusicParser.listInst_return listInst() throws RecognitionException {
        MusicParser.listInst_return retval = new MusicParser.listInst_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        MusicParser.inst_return inst40 =null;


        RewriteRuleSubtreeStream stream_inst=new RewriteRuleSubtreeStream(adaptor,"rule inst");
        try {
            // src/parser/Music.g:76:13: ( ( inst )+ -> ^( LIST_INSTRUCTIONS ( inst )+ ) )
            // src/parser/Music.g:76:16: ( inst )+
            {
            // src/parser/Music.g:76:16: ( inst )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==BEAT||LA10_0==BOOL||LA10_0==CHORD||LA10_0==DECR||LA10_0==DOUBLE_BAR||LA10_0==DRUMS_NOTE_TYPE||(LA10_0 >= FIGURE_TYPE && LA10_0 <= FOR)||(LA10_0 >= ID_ && LA10_0 <= INT)||LA10_0==LETTER_X||LA10_0==NOTE_TYPE||LA10_0==POS_NUM||LA10_0==READ||LA10_0==RETURN||(LA10_0 >= SONG && LA10_0 <= START_REPETITION)||LA10_0==STRING_TYPE||LA10_0==TONE||LA10_0==TRANSPORT||(LA10_0 >= VOLUME && LA10_0 <= WRITE)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // src/parser/Music.g:76:16: inst
            	    {
            	    pushFollow(FOLLOW_inst_in_listInst649);
            	    inst40=inst();

            	    state._fsp--;

            	    stream_inst.add(inst40.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);


            // AST REWRITE
            // elements: inst
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AmlTree)adaptor.nil();
            // 76:23: -> ^( LIST_INSTRUCTIONS ( inst )+ )
            {
                // src/parser/Music.g:76:26: ^( LIST_INSTRUCTIONS ( inst )+ )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(LIST_INSTRUCTIONS, "LIST_INSTRUCTIONS")
                , root_1);

                if ( !(stream_inst.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_inst.hasNext() ) {
                    adaptor.addChild(root_1, stream_inst.nextTree());

                }
                stream_inst.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "listInst"


    public static class list_music_inst_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "list_music_inst"
    // src/parser/Music.g:79:1: list_music_inst : ( music_inst )+ -> ^( LIST_MUSIC_INST ( music_inst )+ ) ;
    public final MusicParser.list_music_inst_return list_music_inst() throws RecognitionException {
        MusicParser.list_music_inst_return retval = new MusicParser.list_music_inst_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        MusicParser.music_inst_return music_inst41 =null;


        RewriteRuleSubtreeStream stream_music_inst=new RewriteRuleSubtreeStream(adaptor,"rule music_inst");
        try {
            // src/parser/Music.g:79:17: ( ( music_inst )+ -> ^( LIST_MUSIC_INST ( music_inst )+ ) )
            // src/parser/Music.g:79:21: ( music_inst )+
            {
            // src/parser/Music.g:79:21: ( music_inst )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==ARMOR||(LA11_0 >= BEAT && LA11_0 <= BOOL)||LA11_0==CHORD||LA11_0==DECR||LA11_0==DN||LA11_0==DRUMS_NOTE_TYPE||(LA11_0 >= FIGURE_TYPE && LA11_0 <= FOR)||(LA11_0 >= ID_ && LA11_0 <= INT)||LA11_0==LETTER_X||LA11_0==NOTE||LA11_0==NOTE_TYPE||LA11_0==READ||LA11_0==SPEED||(LA11_0 >= STRING_TYPE && LA11_0 <= SUSTAIN)||LA11_0==TONE||LA11_0==TRANSPORT||(LA11_0 >= VOLUME && LA11_0 <= WRITE)||LA11_0==102||LA11_0==106||LA11_0==108||LA11_0==110) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // src/parser/Music.g:79:21: music_inst
            	    {
            	    pushFollow(FOLLOW_music_inst_in_list_music_inst683);
            	    music_inst41=music_inst();

            	    state._fsp--;

            	    stream_music_inst.add(music_inst41.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            // AST REWRITE
            // elements: music_inst
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AmlTree)adaptor.nil();
            // 79:33: -> ^( LIST_MUSIC_INST ( music_inst )+ )
            {
                // src/parser/Music.g:79:36: ^( LIST_MUSIC_INST ( music_inst )+ )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(LIST_MUSIC_INST, "LIST_MUSIC_INST")
                , root_1);

                if ( !(stream_music_inst.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_music_inst.hasNext() ) {
                    adaptor.addChild(root_1, stream_music_inst.nextTree());

                }
                stream_music_inst.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "list_music_inst"


    public static class inst_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "inst"
    // src/parser/Music.g:82:1: inst : ( declaration | volume ';' | 'return' ^ ( expr | notes_variable | drumsnotes_variable ) ';' !| READ ^ var_access ';' | WRITE ^ ( expr | notes_variable | drumsnotes_variable ) ';' | var_funcall | tone ';' !| beat ';' !| speed ';' !| instrument ';' !| transport ';' !| assignation | while_stmt | funcall ';' !| for_stmt | if_stmt | song | compas_aux );
    public final MusicParser.inst_return inst() throws RecognitionException {
        MusicParser.inst_return retval = new MusicParser.inst_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal44=null;
        Token string_literal45=null;
        Token char_literal49=null;
        Token READ50=null;
        Token char_literal52=null;
        Token WRITE53=null;
        Token char_literal57=null;
        Token char_literal60=null;
        Token char_literal62=null;
        Token char_literal64=null;
        Token char_literal66=null;
        Token char_literal68=null;
        Token char_literal72=null;
        MusicParser.declaration_return declaration42 =null;

        MusicParser.volume_return volume43 =null;

        MusicParser.expr_return expr46 =null;

        MusicParser.notes_variable_return notes_variable47 =null;

        MusicParser.drumsnotes_variable_return drumsnotes_variable48 =null;

        MusicParser.var_access_return var_access51 =null;

        MusicParser.expr_return expr54 =null;

        MusicParser.notes_variable_return notes_variable55 =null;

        MusicParser.drumsnotes_variable_return drumsnotes_variable56 =null;

        MusicParser.var_funcall_return var_funcall58 =null;

        MusicParser.tone_return tone59 =null;

        MusicParser.beat_return beat61 =null;

        MusicParser.speed_return speed63 =null;

        MusicParser.instrument_return instrument65 =null;

        MusicParser.transport_return transport67 =null;

        MusicParser.assignation_return assignation69 =null;

        MusicParser.while_stmt_return while_stmt70 =null;

        MusicParser.funcall_return funcall71 =null;

        MusicParser.for_stmt_return for_stmt73 =null;

        MusicParser.if_stmt_return if_stmt74 =null;

        MusicParser.song_return song75 =null;

        MusicParser.compas_aux_return compas_aux76 =null;


        AmlTree char_literal44_tree=null;
        AmlTree string_literal45_tree=null;
        AmlTree char_literal49_tree=null;
        AmlTree READ50_tree=null;
        AmlTree char_literal52_tree=null;
        AmlTree WRITE53_tree=null;
        AmlTree char_literal57_tree=null;
        AmlTree char_literal60_tree=null;
        AmlTree char_literal62_tree=null;
        AmlTree char_literal64_tree=null;
        AmlTree char_literal66_tree=null;
        AmlTree char_literal68_tree=null;
        AmlTree char_literal72_tree=null;

        try {
            // src/parser/Music.g:82:13: ( declaration | volume ';' | 'return' ^ ( expr | notes_variable | drumsnotes_variable ) ';' !| READ ^ var_access ';' | WRITE ^ ( expr | notes_variable | drumsnotes_variable ) ';' | var_funcall | tone ';' !| beat ';' !| speed ';' !| instrument ';' !| transport ';' !| assignation | while_stmt | funcall ';' !| for_stmt | if_stmt | song | compas_aux )
            int alt14=18;
            switch ( input.LA(1) ) {
            case BOOL:
            case CHORD:
            case DRUMS_NOTE_TYPE:
            case FIGURE_TYPE:
            case INT:
            case NOTE_TYPE:
            case STRING_TYPE:
                {
                alt14=1;
                }
                break;
            case VOLUME:
                {
                alt14=2;
                }
                break;
            case RETURN:
                {
                alt14=3;
                }
                break;
            case READ:
                {
                alt14=4;
                }
                break;
            case WRITE:
                {
                alt14=5;
                }
                break;
            case ID_:
                {
                switch ( input.LA(2) ) {
                case 105:
                    {
                    int LA14_19 = input.LA(3);

                    if ( (LA14_19==ID_) ) {
                        int LA14_21 = input.LA(4);

                        if ( (LA14_21==102) ) {
                            alt14=6;
                        }
                        else if ( (LA14_21==ASSIG||LA14_21==DECR||LA14_21==DIVIDE_ASSIG||LA14_21==INCR||LA14_21==MINUS_ASSIG||LA14_21==MOD_ASSIG||LA14_21==PLUS_ASSIG||LA14_21==PROD_ASSIG) ) {
                            alt14=12;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 14, 21, input);

                            throw nvae;

                        }
                    }
                    else if ( (LA14_19==LETTER_X) ) {
                        int LA14_22 = input.LA(4);

                        if ( (LA14_22==102) ) {
                            alt14=6;
                        }
                        else if ( (LA14_22==ASSIG||LA14_22==DECR||LA14_22==DIVIDE_ASSIG||LA14_22==INCR||LA14_22==MINUS_ASSIG||LA14_22==MOD_ASSIG||LA14_22==PLUS_ASSIG||LA14_22==PROD_ASSIG) ) {
                            alt14=12;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 14, 22, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 19, input);

                        throw nvae;

                    }
                    }
                    break;
                case ASSIG:
                case DECR:
                case DIVIDE_ASSIG:
                case INCR:
                case MINUS_ASSIG:
                case MOD_ASSIG:
                case PLUS_ASSIG:
                case PROD_ASSIG:
                    {
                    alt14=12;
                    }
                    break;
                case 102:
                    {
                    alt14=14;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 6, input);

                    throw nvae;

                }

                }
                break;
            case LETTER_X:
                {
                switch ( input.LA(2) ) {
                case 105:
                    {
                    int LA14_19 = input.LA(3);

                    if ( (LA14_19==ID_) ) {
                        int LA14_21 = input.LA(4);

                        if ( (LA14_21==102) ) {
                            alt14=6;
                        }
                        else if ( (LA14_21==ASSIG||LA14_21==DECR||LA14_21==DIVIDE_ASSIG||LA14_21==INCR||LA14_21==MINUS_ASSIG||LA14_21==MOD_ASSIG||LA14_21==PLUS_ASSIG||LA14_21==PROD_ASSIG) ) {
                            alt14=12;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 14, 21, input);

                            throw nvae;

                        }
                    }
                    else if ( (LA14_19==LETTER_X) ) {
                        int LA14_22 = input.LA(4);

                        if ( (LA14_22==102) ) {
                            alt14=6;
                        }
                        else if ( (LA14_22==ASSIG||LA14_22==DECR||LA14_22==DIVIDE_ASSIG||LA14_22==INCR||LA14_22==MINUS_ASSIG||LA14_22==MOD_ASSIG||LA14_22==PLUS_ASSIG||LA14_22==PROD_ASSIG) ) {
                            alt14=12;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 14, 22, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 19, input);

                        throw nvae;

                    }
                    }
                    break;
                case ASSIG:
                case DECR:
                case DIVIDE_ASSIG:
                case INCR:
                case MINUS_ASSIG:
                case MOD_ASSIG:
                case PLUS_ASSIG:
                case PROD_ASSIG:
                    {
                    alt14=12;
                    }
                    break;
                case 102:
                    {
                    alt14=14;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 7, input);

                    throw nvae;

                }

                }
                break;
            case TONE:
                {
                alt14=7;
                }
                break;
            case BEAT:
                {
                alt14=8;
                }
                break;
            case SPEED:
                {
                alt14=9;
                }
                break;
            case INSTRUMENT:
                {
                alt14=10;
                }
                break;
            case TRANSPORT:
                {
                alt14=11;
                }
                break;
            case DECR:
            case INCR:
                {
                alt14=12;
                }
                break;
            case WHILE:
                {
                alt14=13;
                }
                break;
            case FOR:
                {
                alt14=15;
                }
                break;
            case IF:
                {
                alt14=16;
                }
                break;
            case SONG:
                {
                alt14=17;
                }
                break;
            case DOUBLE_BAR:
            case POS_NUM:
            case START_REPETITION:
                {
                alt14=18;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }

            switch (alt14) {
                case 1 :
                    // src/parser/Music.g:82:17: declaration
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_declaration_in_inst727);
                    declaration42=declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, declaration42.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:83:17: volume ';'
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_volume_in_inst745);
                    volume43=volume();

                    state._fsp--;

                    adaptor.addChild(root_0, volume43.getTree());

                    char_literal44=(Token)match(input,107,FOLLOW_107_in_inst747); 
                    char_literal44_tree = 
                    (AmlTree)adaptor.create(char_literal44)
                    ;
                    adaptor.addChild(root_0, char_literal44_tree);


                    }
                    break;
                case 3 :
                    // src/parser/Music.g:84:17: 'return' ^ ( expr | notes_variable | drumsnotes_variable ) ';' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    string_literal45=(Token)match(input,RETURN,FOLLOW_RETURN_in_inst765); 
                    string_literal45_tree = 
                    (AmlTree)adaptor.create(string_literal45)
                    ;
                    root_0 = (AmlTree)adaptor.becomeRoot(string_literal45_tree, root_0);


                    // src/parser/Music.g:84:27: ( expr | notes_variable | drumsnotes_variable )
                    int alt12=3;
                    switch ( input.LA(1) ) {
                    case FALSE:
                    case ID_:
                    case LETTER_X:
                    case MINUS:
                    case NEG_NUM:
                    case NOT:
                    case PLUS:
                    case POS_NUM:
                    case STRING:
                    case TRUE:
                        {
                        alt12=1;
                        }
                        break;
                    case 102:
                        {
                        switch ( input.LA(2) ) {
                        case FALSE:
                        case ID_:
                        case LETTER_X:
                        case MINUS:
                        case NEG_NUM:
                        case NOT:
                        case PLUS:
                        case POS_NUM:
                        case STRING:
                        case TRUE:
                        case 102:
                            {
                            alt12=1;
                            }
                            break;
                        case ARMOR:
                        case BEMOL:
                        case NOTE:
                        case SUSTAIN:
                            {
                            alt12=2;
                            }
                            break;
                        case DN:
                            {
                            alt12=3;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 12, 2, input);

                            throw nvae;

                        }

                        }
                        break;
                    case ARMOR:
                    case BEMOL:
                    case CHORD:
                    case NOTE:
                    case SUSTAIN:
                    case 109:
                        {
                        alt12=2;
                        }
                        break;
                    case DN:
                        {
                        alt12=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 0, input);

                        throw nvae;

                    }

                    switch (alt12) {
                        case 1 :
                            // src/parser/Music.g:84:28: expr
                            {
                            pushFollow(FOLLOW_expr_in_inst769);
                            expr46=expr();

                            state._fsp--;

                            adaptor.addChild(root_0, expr46.getTree());

                            }
                            break;
                        case 2 :
                            // src/parser/Music.g:84:35: notes_variable
                            {
                            pushFollow(FOLLOW_notes_variable_in_inst773);
                            notes_variable47=notes_variable();

                            state._fsp--;

                            adaptor.addChild(root_0, notes_variable47.getTree());

                            }
                            break;
                        case 3 :
                            // src/parser/Music.g:84:52: drumsnotes_variable
                            {
                            pushFollow(FOLLOW_drumsnotes_variable_in_inst777);
                            drumsnotes_variable48=drumsnotes_variable();

                            state._fsp--;

                            adaptor.addChild(root_0, drumsnotes_variable48.getTree());

                            }
                            break;

                    }


                    char_literal49=(Token)match(input,107,FOLLOW_107_in_inst780); 

                    }
                    break;
                case 4 :
                    // src/parser/Music.g:85:17: READ ^ var_access ';'
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    READ50=(Token)match(input,READ,FOLLOW_READ_in_inst799); 
                    READ50_tree = 
                    (AmlTree)adaptor.create(READ50)
                    ;
                    root_0 = (AmlTree)adaptor.becomeRoot(READ50_tree, root_0);


                    pushFollow(FOLLOW_var_access_in_inst802);
                    var_access51=var_access();

                    state._fsp--;

                    adaptor.addChild(root_0, var_access51.getTree());

                    char_literal52=(Token)match(input,107,FOLLOW_107_in_inst804); 
                    char_literal52_tree = 
                    (AmlTree)adaptor.create(char_literal52)
                    ;
                    adaptor.addChild(root_0, char_literal52_tree);


                    }
                    break;
                case 5 :
                    // src/parser/Music.g:86:17: WRITE ^ ( expr | notes_variable | drumsnotes_variable ) ';'
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    WRITE53=(Token)match(input,WRITE,FOLLOW_WRITE_in_inst822); 
                    WRITE53_tree = 
                    (AmlTree)adaptor.create(WRITE53)
                    ;
                    root_0 = (AmlTree)adaptor.becomeRoot(WRITE53_tree, root_0);


                    // src/parser/Music.g:86:24: ( expr | notes_variable | drumsnotes_variable )
                    int alt13=3;
                    switch ( input.LA(1) ) {
                    case FALSE:
                    case ID_:
                    case LETTER_X:
                    case MINUS:
                    case NEG_NUM:
                    case NOT:
                    case PLUS:
                    case POS_NUM:
                    case STRING:
                    case TRUE:
                        {
                        alt13=1;
                        }
                        break;
                    case 102:
                        {
                        switch ( input.LA(2) ) {
                        case FALSE:
                        case ID_:
                        case LETTER_X:
                        case MINUS:
                        case NEG_NUM:
                        case NOT:
                        case PLUS:
                        case POS_NUM:
                        case STRING:
                        case TRUE:
                        case 102:
                            {
                            alt13=1;
                            }
                            break;
                        case ARMOR:
                        case BEMOL:
                        case NOTE:
                        case SUSTAIN:
                            {
                            alt13=2;
                            }
                            break;
                        case DN:
                            {
                            alt13=3;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 13, 2, input);

                            throw nvae;

                        }

                        }
                        break;
                    case ARMOR:
                    case BEMOL:
                    case CHORD:
                    case NOTE:
                    case SUSTAIN:
                    case 109:
                        {
                        alt13=2;
                        }
                        break;
                    case DN:
                        {
                        alt13=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        throw nvae;

                    }

                    switch (alt13) {
                        case 1 :
                            // src/parser/Music.g:86:25: expr
                            {
                            pushFollow(FOLLOW_expr_in_inst826);
                            expr54=expr();

                            state._fsp--;

                            adaptor.addChild(root_0, expr54.getTree());

                            }
                            break;
                        case 2 :
                            // src/parser/Music.g:86:32: notes_variable
                            {
                            pushFollow(FOLLOW_notes_variable_in_inst830);
                            notes_variable55=notes_variable();

                            state._fsp--;

                            adaptor.addChild(root_0, notes_variable55.getTree());

                            }
                            break;
                        case 3 :
                            // src/parser/Music.g:86:49: drumsnotes_variable
                            {
                            pushFollow(FOLLOW_drumsnotes_variable_in_inst834);
                            drumsnotes_variable56=drumsnotes_variable();

                            state._fsp--;

                            adaptor.addChild(root_0, drumsnotes_variable56.getTree());

                            }
                            break;

                    }


                    char_literal57=(Token)match(input,107,FOLLOW_107_in_inst837); 
                    char_literal57_tree = 
                    (AmlTree)adaptor.create(char_literal57)
                    ;
                    adaptor.addChild(root_0, char_literal57_tree);


                    }
                    break;
                case 6 :
                    // src/parser/Music.g:87:17: var_funcall
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_var_funcall_in_inst855);
                    var_funcall58=var_funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, var_funcall58.getTree());

                    }
                    break;
                case 7 :
                    // src/parser/Music.g:88:17: tone ';' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_tone_in_inst873);
                    tone59=tone();

                    state._fsp--;

                    adaptor.addChild(root_0, tone59.getTree());

                    char_literal60=(Token)match(input,107,FOLLOW_107_in_inst875); 

                    }
                    break;
                case 8 :
                    // src/parser/Music.g:89:17: beat ';' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_beat_in_inst894);
                    beat61=beat();

                    state._fsp--;

                    adaptor.addChild(root_0, beat61.getTree());

                    char_literal62=(Token)match(input,107,FOLLOW_107_in_inst896); 

                    }
                    break;
                case 9 :
                    // src/parser/Music.g:90:17: speed ';' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_speed_in_inst915);
                    speed63=speed();

                    state._fsp--;

                    adaptor.addChild(root_0, speed63.getTree());

                    char_literal64=(Token)match(input,107,FOLLOW_107_in_inst917); 

                    }
                    break;
                case 10 :
                    // src/parser/Music.g:91:17: instrument ';' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_instrument_in_inst936);
                    instrument65=instrument();

                    state._fsp--;

                    adaptor.addChild(root_0, instrument65.getTree());

                    char_literal66=(Token)match(input,107,FOLLOW_107_in_inst938); 

                    }
                    break;
                case 11 :
                    // src/parser/Music.g:92:17: transport ';' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_transport_in_inst957);
                    transport67=transport();

                    state._fsp--;

                    adaptor.addChild(root_0, transport67.getTree());

                    char_literal68=(Token)match(input,107,FOLLOW_107_in_inst959); 

                    }
                    break;
                case 12 :
                    // src/parser/Music.g:93:17: assignation
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_assignation_in_inst978);
                    assignation69=assignation();

                    state._fsp--;

                    adaptor.addChild(root_0, assignation69.getTree());

                    }
                    break;
                case 13 :
                    // src/parser/Music.g:94:17: while_stmt
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_while_stmt_in_inst996);
                    while_stmt70=while_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, while_stmt70.getTree());

                    }
                    break;
                case 14 :
                    // src/parser/Music.g:95:17: funcall ';' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_inst1014);
                    funcall71=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall71.getTree());

                    char_literal72=(Token)match(input,107,FOLLOW_107_in_inst1016); 

                    }
                    break;
                case 15 :
                    // src/parser/Music.g:96:17: for_stmt
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_for_stmt_in_inst1035);
                    for_stmt73=for_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, for_stmt73.getTree());

                    }
                    break;
                case 16 :
                    // src/parser/Music.g:97:17: if_stmt
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_if_stmt_in_inst1053);
                    if_stmt74=if_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, if_stmt74.getTree());

                    }
                    break;
                case 17 :
                    // src/parser/Music.g:98:17: song
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_song_in_inst1071);
                    song75=song();

                    state._fsp--;

                    adaptor.addChild(root_0, song75.getTree());

                    }
                    break;
                case 18 :
                    // src/parser/Music.g:99:17: compas_aux
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_compas_aux_in_inst1089);
                    compas_aux76=compas_aux();

                    state._fsp--;

                    adaptor.addChild(root_0, compas_aux76.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "inst"


    public static class music_inst_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "music_inst"
    // src/parser/Music.g:102:1: music_inst : ( declaration | READ ^ var_access ';' | WRITE ^ ( expr | notes_variable | drumsnotes_variable ) ';' | volume ';' !| tone ';' !| beat ';' !| speed ';' !| instrument ';' !| transport ';' !| var_funcall | assignation | while_music_stmt | funcall ';' !| fragcall ';' !| for_music_stmt | if_music_stmt | ( options {greedy=true; } : notes_group )+ ( ';' !)? | ( options {greedy=true; } : drumsnotes_group )+ ( ';' !)? | triplet );
    public final MusicParser.music_inst_return music_inst() throws RecognitionException {
        MusicParser.music_inst_return retval = new MusicParser.music_inst_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token READ78=null;
        Token char_literal80=null;
        Token WRITE81=null;
        Token char_literal85=null;
        Token char_literal87=null;
        Token char_literal89=null;
        Token char_literal91=null;
        Token char_literal93=null;
        Token char_literal95=null;
        Token char_literal97=null;
        Token char_literal102=null;
        Token char_literal104=null;
        Token char_literal108=null;
        Token char_literal110=null;
        MusicParser.declaration_return declaration77 =null;

        MusicParser.var_access_return var_access79 =null;

        MusicParser.expr_return expr82 =null;

        MusicParser.notes_variable_return notes_variable83 =null;

        MusicParser.drumsnotes_variable_return drumsnotes_variable84 =null;

        MusicParser.volume_return volume86 =null;

        MusicParser.tone_return tone88 =null;

        MusicParser.beat_return beat90 =null;

        MusicParser.speed_return speed92 =null;

        MusicParser.instrument_return instrument94 =null;

        MusicParser.transport_return transport96 =null;

        MusicParser.var_funcall_return var_funcall98 =null;

        MusicParser.assignation_return assignation99 =null;

        MusicParser.while_music_stmt_return while_music_stmt100 =null;

        MusicParser.funcall_return funcall101 =null;

        MusicParser.fragcall_return fragcall103 =null;

        MusicParser.for_music_stmt_return for_music_stmt105 =null;

        MusicParser.if_music_stmt_return if_music_stmt106 =null;

        MusicParser.notes_group_return notes_group107 =null;

        MusicParser.drumsnotes_group_return drumsnotes_group109 =null;

        MusicParser.triplet_return triplet111 =null;


        AmlTree READ78_tree=null;
        AmlTree char_literal80_tree=null;
        AmlTree WRITE81_tree=null;
        AmlTree char_literal85_tree=null;
        AmlTree char_literal87_tree=null;
        AmlTree char_literal89_tree=null;
        AmlTree char_literal91_tree=null;
        AmlTree char_literal93_tree=null;
        AmlTree char_literal95_tree=null;
        AmlTree char_literal97_tree=null;
        AmlTree char_literal102_tree=null;
        AmlTree char_literal104_tree=null;
        AmlTree char_literal108_tree=null;
        AmlTree char_literal110_tree=null;

        try {
            // src/parser/Music.g:102:13: ( declaration | READ ^ var_access ';' | WRITE ^ ( expr | notes_variable | drumsnotes_variable ) ';' | volume ';' !| tone ';' !| beat ';' !| speed ';' !| instrument ';' !| transport ';' !| var_funcall | assignation | while_music_stmt | funcall ';' !| fragcall ';' !| for_music_stmt | if_music_stmt | ( options {greedy=true; } : notes_group )+ ( ';' !)? | ( options {greedy=true; } : drumsnotes_group )+ ( ';' !)? | triplet )
            int alt20=19;
            switch ( input.LA(1) ) {
            case CHORD:
                {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==102) ) {
                    alt20=17;
                }
                else if ( (LA20_1==ID_||LA20_1==LETTER_X) ) {
                    alt20=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;

                }
                }
                break;
            case READ:
                {
                alt20=2;
                }
                break;
            case WRITE:
                {
                alt20=3;
                }
                break;
            case VOLUME:
                {
                alt20=4;
                }
                break;
            case TONE:
                {
                alt20=5;
                }
                break;
            case BEAT:
                {
                alt20=6;
                }
                break;
            case SPEED:
                {
                alt20=7;
                }
                break;
            case INSTRUMENT:
                {
                alt20=8;
                }
                break;
            case TRANSPORT:
                {
                alt20=9;
                }
                break;
            case ID_:
                {
                switch ( input.LA(2) ) {
                case 105:
                    {
                    int LA20_22 = input.LA(3);

                    if ( (LA20_22==ID_) ) {
                        int LA20_24 = input.LA(4);

                        if ( (LA20_24==102) ) {
                            alt20=10;
                        }
                        else if ( (LA20_24==ASSIG||LA20_24==DECR||LA20_24==DIVIDE_ASSIG||LA20_24==INCR||LA20_24==MINUS_ASSIG||LA20_24==MOD_ASSIG||LA20_24==PLUS_ASSIG||LA20_24==PROD_ASSIG) ) {
                            alt20=11;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 20, 24, input);

                            throw nvae;

                        }
                    }
                    else if ( (LA20_22==LETTER_X) ) {
                        int LA20_25 = input.LA(4);

                        if ( (LA20_25==102) ) {
                            alt20=10;
                        }
                        else if ( (LA20_25==ASSIG||LA20_25==DECR||LA20_25==DIVIDE_ASSIG||LA20_25==INCR||LA20_25==MINUS_ASSIG||LA20_25==MOD_ASSIG||LA20_25==PLUS_ASSIG||LA20_25==PROD_ASSIG) ) {
                            alt20=11;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 20, 25, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 22, input);

                        throw nvae;

                    }
                    }
                    break;
                case ASSIG:
                case DECR:
                case DIVIDE_ASSIG:
                case INCR:
                case MINUS_ASSIG:
                case MOD_ASSIG:
                case PLUS_ASSIG:
                case PROD_ASSIG:
                    {
                    alt20=11;
                    }
                    break;
                case 102:
                    {
                    alt20=13;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 10, input);

                    throw nvae;

                }

                }
                break;
            case LETTER_X:
                {
                switch ( input.LA(2) ) {
                case 105:
                    {
                    int LA20_22 = input.LA(3);

                    if ( (LA20_22==ID_) ) {
                        int LA20_24 = input.LA(4);

                        if ( (LA20_24==102) ) {
                            alt20=10;
                        }
                        else if ( (LA20_24==ASSIG||LA20_24==DECR||LA20_24==DIVIDE_ASSIG||LA20_24==INCR||LA20_24==MINUS_ASSIG||LA20_24==MOD_ASSIG||LA20_24==PLUS_ASSIG||LA20_24==PROD_ASSIG) ) {
                            alt20=11;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 20, 24, input);

                            throw nvae;

                        }
                    }
                    else if ( (LA20_22==LETTER_X) ) {
                        int LA20_25 = input.LA(4);

                        if ( (LA20_25==102) ) {
                            alt20=10;
                        }
                        else if ( (LA20_25==ASSIG||LA20_25==DECR||LA20_25==DIVIDE_ASSIG||LA20_25==INCR||LA20_25==MINUS_ASSIG||LA20_25==MOD_ASSIG||LA20_25==PLUS_ASSIG||LA20_25==PROD_ASSIG) ) {
                            alt20=11;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 20, 25, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 22, input);

                        throw nvae;

                    }
                    }
                    break;
                case ASSIG:
                case DECR:
                case DIVIDE_ASSIG:
                case INCR:
                case MINUS_ASSIG:
                case MOD_ASSIG:
                case PLUS_ASSIG:
                case PROD_ASSIG:
                    {
                    alt20=11;
                    }
                    break;
                case 102:
                    {
                    alt20=13;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 11, input);

                    throw nvae;

                }

                }
                break;
            case DECR:
            case INCR:
                {
                alt20=11;
                }
                break;
            case WHILE:
                {
                alt20=12;
                }
                break;
            case 108:
                {
                alt20=14;
                }
                break;
            case FOR:
                {
                alt20=15;
                }
                break;
            case IF:
                {
                alt20=16;
                }
                break;
            case BOOL:
            case DRUMS_NOTE_TYPE:
            case FIGURE_TYPE:
            case INT:
            case NOTE_TYPE:
            case STRING_TYPE:
                {
                alt20=1;
                }
                break;
            case 102:
                {
                int LA20_18 = input.LA(2);

                if ( (LA20_18==ARMOR||LA20_18==BEMOL||LA20_18==NOTE||LA20_18==SUSTAIN) ) {
                    alt20=17;
                }
                else if ( (LA20_18==DN) ) {
                    alt20=18;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 18, input);

                    throw nvae;

                }
                }
                break;
            case ARMOR:
            case BEMOL:
            case NOTE:
            case SUSTAIN:
            case 106:
                {
                alt20=17;
                }
                break;
            case DN:
                {
                alt20=18;
                }
                break;
            case 110:
                {
                alt20=19;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }

            switch (alt20) {
                case 1 :
                    // src/parser/Music.g:102:17: declaration
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_declaration_in_music_inst1113);
                    declaration77=declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, declaration77.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:103:17: READ ^ var_access ';'
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    READ78=(Token)match(input,READ,FOLLOW_READ_in_music_inst1131); 
                    READ78_tree = 
                    (AmlTree)adaptor.create(READ78)
                    ;
                    root_0 = (AmlTree)adaptor.becomeRoot(READ78_tree, root_0);


                    pushFollow(FOLLOW_var_access_in_music_inst1134);
                    var_access79=var_access();

                    state._fsp--;

                    adaptor.addChild(root_0, var_access79.getTree());

                    char_literal80=(Token)match(input,107,FOLLOW_107_in_music_inst1136); 
                    char_literal80_tree = 
                    (AmlTree)adaptor.create(char_literal80)
                    ;
                    adaptor.addChild(root_0, char_literal80_tree);


                    }
                    break;
                case 3 :
                    // src/parser/Music.g:104:17: WRITE ^ ( expr | notes_variable | drumsnotes_variable ) ';'
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    WRITE81=(Token)match(input,WRITE,FOLLOW_WRITE_in_music_inst1154); 
                    WRITE81_tree = 
                    (AmlTree)adaptor.create(WRITE81)
                    ;
                    root_0 = (AmlTree)adaptor.becomeRoot(WRITE81_tree, root_0);


                    // src/parser/Music.g:104:24: ( expr | notes_variable | drumsnotes_variable )
                    int alt15=3;
                    switch ( input.LA(1) ) {
                    case FALSE:
                    case ID_:
                    case LETTER_X:
                    case MINUS:
                    case NEG_NUM:
                    case NOT:
                    case PLUS:
                    case POS_NUM:
                    case STRING:
                    case TRUE:
                        {
                        alt15=1;
                        }
                        break;
                    case 102:
                        {
                        switch ( input.LA(2) ) {
                        case FALSE:
                        case ID_:
                        case LETTER_X:
                        case MINUS:
                        case NEG_NUM:
                        case NOT:
                        case PLUS:
                        case POS_NUM:
                        case STRING:
                        case TRUE:
                        case 102:
                            {
                            alt15=1;
                            }
                            break;
                        case ARMOR:
                        case BEMOL:
                        case NOTE:
                        case SUSTAIN:
                            {
                            alt15=2;
                            }
                            break;
                        case DN:
                            {
                            alt15=3;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 15, 2, input);

                            throw nvae;

                        }

                        }
                        break;
                    case ARMOR:
                    case BEMOL:
                    case CHORD:
                    case NOTE:
                    case SUSTAIN:
                    case 109:
                        {
                        alt15=2;
                        }
                        break;
                    case DN:
                        {
                        alt15=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 0, input);

                        throw nvae;

                    }

                    switch (alt15) {
                        case 1 :
                            // src/parser/Music.g:104:25: expr
                            {
                            pushFollow(FOLLOW_expr_in_music_inst1158);
                            expr82=expr();

                            state._fsp--;

                            adaptor.addChild(root_0, expr82.getTree());

                            }
                            break;
                        case 2 :
                            // src/parser/Music.g:104:32: notes_variable
                            {
                            pushFollow(FOLLOW_notes_variable_in_music_inst1162);
                            notes_variable83=notes_variable();

                            state._fsp--;

                            adaptor.addChild(root_0, notes_variable83.getTree());

                            }
                            break;
                        case 3 :
                            // src/parser/Music.g:104:49: drumsnotes_variable
                            {
                            pushFollow(FOLLOW_drumsnotes_variable_in_music_inst1166);
                            drumsnotes_variable84=drumsnotes_variable();

                            state._fsp--;

                            adaptor.addChild(root_0, drumsnotes_variable84.getTree());

                            }
                            break;

                    }


                    char_literal85=(Token)match(input,107,FOLLOW_107_in_music_inst1169); 
                    char_literal85_tree = 
                    (AmlTree)adaptor.create(char_literal85)
                    ;
                    adaptor.addChild(root_0, char_literal85_tree);


                    }
                    break;
                case 4 :
                    // src/parser/Music.g:105:17: volume ';' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_volume_in_music_inst1187);
                    volume86=volume();

                    state._fsp--;

                    adaptor.addChild(root_0, volume86.getTree());

                    char_literal87=(Token)match(input,107,FOLLOW_107_in_music_inst1189); 

                    }
                    break;
                case 5 :
                    // src/parser/Music.g:106:17: tone ';' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_tone_in_music_inst1208);
                    tone88=tone();

                    state._fsp--;

                    adaptor.addChild(root_0, tone88.getTree());

                    char_literal89=(Token)match(input,107,FOLLOW_107_in_music_inst1210); 

                    }
                    break;
                case 6 :
                    // src/parser/Music.g:107:17: beat ';' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_beat_in_music_inst1229);
                    beat90=beat();

                    state._fsp--;

                    adaptor.addChild(root_0, beat90.getTree());

                    char_literal91=(Token)match(input,107,FOLLOW_107_in_music_inst1231); 

                    }
                    break;
                case 7 :
                    // src/parser/Music.g:108:17: speed ';' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_speed_in_music_inst1250);
                    speed92=speed();

                    state._fsp--;

                    adaptor.addChild(root_0, speed92.getTree());

                    char_literal93=(Token)match(input,107,FOLLOW_107_in_music_inst1252); 

                    }
                    break;
                case 8 :
                    // src/parser/Music.g:109:17: instrument ';' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_instrument_in_music_inst1271);
                    instrument94=instrument();

                    state._fsp--;

                    adaptor.addChild(root_0, instrument94.getTree());

                    char_literal95=(Token)match(input,107,FOLLOW_107_in_music_inst1273); 

                    }
                    break;
                case 9 :
                    // src/parser/Music.g:110:17: transport ';' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_transport_in_music_inst1292);
                    transport96=transport();

                    state._fsp--;

                    adaptor.addChild(root_0, transport96.getTree());

                    char_literal97=(Token)match(input,107,FOLLOW_107_in_music_inst1294); 

                    }
                    break;
                case 10 :
                    // src/parser/Music.g:111:17: var_funcall
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_var_funcall_in_music_inst1313);
                    var_funcall98=var_funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, var_funcall98.getTree());

                    }
                    break;
                case 11 :
                    // src/parser/Music.g:112:17: assignation
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_assignation_in_music_inst1331);
                    assignation99=assignation();

                    state._fsp--;

                    adaptor.addChild(root_0, assignation99.getTree());

                    }
                    break;
                case 12 :
                    // src/parser/Music.g:113:17: while_music_stmt
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_while_music_stmt_in_music_inst1349);
                    while_music_stmt100=while_music_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, while_music_stmt100.getTree());

                    }
                    break;
                case 13 :
                    // src/parser/Music.g:114:17: funcall ';' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_music_inst1367);
                    funcall101=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall101.getTree());

                    char_literal102=(Token)match(input,107,FOLLOW_107_in_music_inst1369); 

                    }
                    break;
                case 14 :
                    // src/parser/Music.g:115:17: fragcall ';' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_fragcall_in_music_inst1388);
                    fragcall103=fragcall();

                    state._fsp--;

                    adaptor.addChild(root_0, fragcall103.getTree());

                    char_literal104=(Token)match(input,107,FOLLOW_107_in_music_inst1390); 

                    }
                    break;
                case 15 :
                    // src/parser/Music.g:116:17: for_music_stmt
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_for_music_stmt_in_music_inst1409);
                    for_music_stmt105=for_music_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, for_music_stmt105.getTree());

                    }
                    break;
                case 16 :
                    // src/parser/Music.g:117:17: if_music_stmt
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_if_music_stmt_in_music_inst1427);
                    if_music_stmt106=if_music_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, if_music_stmt106.getTree());

                    }
                    break;
                case 17 :
                    // src/parser/Music.g:118:16: ( options {greedy=true; } : notes_group )+ ( ';' !)?
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    // src/parser/Music.g:118:16: ( options {greedy=true; } : notes_group )+
                    int cnt16=0;
                    loop16:
                    do {
                        int alt16=2;
                        switch ( input.LA(1) ) {
                        case CHORD:
                            {
                            alt16=1;
                            }
                            break;
                        case 102:
                            {
                            alt16=1;
                            }
                            break;
                        case ARMOR:
                        case BEMOL:
                        case SUSTAIN:
                            {
                            alt16=1;
                            }
                            break;
                        case NOTE:
                            {
                            alt16=1;
                            }
                            break;
                        case 106:
                            {
                            alt16=1;
                            }
                            break;

                        }

                        switch (alt16) {
                    	case 1 :
                    	    // src/parser/Music.g:118:42: notes_group
                    	    {
                    	    pushFollow(FOLLOW_notes_group_in_music_inst1454);
                    	    notes_group107=notes_group();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, notes_group107.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt16 >= 1 ) break loop16;
                                EarlyExitException eee =
                                    new EarlyExitException(16, input);
                                throw eee;
                        }
                        cnt16++;
                    } while (true);


                    // src/parser/Music.g:118:59: ( ';' !)?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==107) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // src/parser/Music.g:118:59: ';' !
                            {
                            char_literal108=(Token)match(input,107,FOLLOW_107_in_music_inst1458); 

                            }
                            break;

                    }


                    }
                    break;
                case 18 :
                    // src/parser/Music.g:119:16: ( options {greedy=true; } : drumsnotes_group )+ ( ';' !)?
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    // src/parser/Music.g:119:16: ( options {greedy=true; } : drumsnotes_group )+
                    int cnt18=0;
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==102) ) {
                            alt18=1;
                        }
                        else if ( (LA18_0==DN) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // src/parser/Music.g:119:42: drumsnotes_group
                    	    {
                    	    pushFollow(FOLLOW_drumsnotes_group_in_music_inst1487);
                    	    drumsnotes_group109=drumsnotes_group();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, drumsnotes_group109.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt18 >= 1 ) break loop18;
                                EarlyExitException eee =
                                    new EarlyExitException(18, input);
                                throw eee;
                        }
                        cnt18++;
                    } while (true);


                    // src/parser/Music.g:119:64: ( ';' !)?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==107) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // src/parser/Music.g:119:64: ';' !
                            {
                            char_literal110=(Token)match(input,107,FOLLOW_107_in_music_inst1491); 

                            }
                            break;

                    }


                    }
                    break;
                case 19 :
                    // src/parser/Music.g:120:17: triplet
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_triplet_in_music_inst1511);
                    triplet111=triplet();

                    state._fsp--;

                    adaptor.addChild(root_0, triplet111.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "music_inst"


    public static class declaration_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "declaration"
    // src/parser/Music.g:123:1: declaration : type ^ assig_opt ( ',' ! assig_opt )* ';' !;
    public final MusicParser.declaration_return declaration() throws RecognitionException {
        MusicParser.declaration_return retval = new MusicParser.declaration_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal114=null;
        Token char_literal116=null;
        MusicParser.type_return type112 =null;

        MusicParser.assig_opt_return assig_opt113 =null;

        MusicParser.assig_opt_return assig_opt115 =null;


        AmlTree char_literal114_tree=null;
        AmlTree char_literal116_tree=null;

        try {
            // src/parser/Music.g:123:13: ( type ^ assig_opt ( ',' ! assig_opt )* ';' !)
            // src/parser/Music.g:123:17: type ^ assig_opt ( ',' ! assig_opt )* ';' !
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_type_in_declaration1534);
            type112=type();

            state._fsp--;

            root_0 = (AmlTree)adaptor.becomeRoot(type112.getTree(), root_0);

            pushFollow(FOLLOW_assig_opt_in_declaration1537);
            assig_opt113=assig_opt();

            state._fsp--;

            adaptor.addChild(root_0, assig_opt113.getTree());

            // src/parser/Music.g:123:33: ( ',' ! assig_opt )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==104) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // src/parser/Music.g:123:34: ',' ! assig_opt
            	    {
            	    char_literal114=(Token)match(input,104,FOLLOW_104_in_declaration1540); 

            	    pushFollow(FOLLOW_assig_opt_in_declaration1543);
            	    assig_opt115=assig_opt();

            	    state._fsp--;

            	    adaptor.addChild(root_0, assig_opt115.getTree());

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            char_literal116=(Token)match(input,107,FOLLOW_107_in_declaration1547); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "declaration"


    public static class type_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "type"
    // src/parser/Music.g:126:1: type : ( INT | BOOL | NOTE_TYPE | DRUMS_NOTE_TYPE | CHORD | STRING_TYPE | FIGURE_TYPE );
    public final MusicParser.type_return type() throws RecognitionException {
        MusicParser.type_return retval = new MusicParser.type_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token set117=null;

        AmlTree set117_tree=null;

        try {
            // src/parser/Music.g:126:13: ( INT | BOOL | NOTE_TYPE | DRUMS_NOTE_TYPE | CHORD | STRING_TYPE | FIGURE_TYPE )
            // src/parser/Music.g:
            {
            root_0 = (AmlTree)adaptor.nil();


            set117=(Token)input.LT(1);

            if ( input.LA(1)==BOOL||input.LA(1)==CHORD||input.LA(1)==DRUMS_NOTE_TYPE||input.LA(1)==FIGURE_TYPE||input.LA(1)==INT||input.LA(1)==NOTE_TYPE||input.LA(1)==STRING_TYPE ) {
                input.consume();
                adaptor.addChild(root_0, 
                (AmlTree)adaptor.create(set117)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "type"


    public static class type_void_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "type_void"
    // src/parser/Music.g:135:1: type_void : ( type | VOID );
    public final MusicParser.type_void_return type_void() throws RecognitionException {
        MusicParser.type_void_return retval = new MusicParser.type_void_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token VOID119=null;
        MusicParser.type_return type118 =null;


        AmlTree VOID119_tree=null;

        try {
            // src/parser/Music.g:135:13: ( type | VOID )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==BOOL||LA22_0==CHORD||LA22_0==DRUMS_NOTE_TYPE||LA22_0==FIGURE_TYPE||LA22_0==INT||LA22_0==NOTE_TYPE||LA22_0==STRING_TYPE) ) {
                alt22=1;
            }
            else if ( (LA22_0==VOID) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }
            switch (alt22) {
                case 1 :
                    // src/parser/Music.g:135:17: type
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_type_in_type_void1711);
                    type118=type();

                    state._fsp--;

                    adaptor.addChild(root_0, type118.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:136:17: VOID
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    VOID119=(Token)match(input,VOID,FOLLOW_VOID_in_type_void1729); 
                    VOID119_tree = 
                    (AmlTree)adaptor.create(VOID119)
                    ;
                    adaptor.addChild(root_0, VOID119_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "type_void"


    public static class assig_opt_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assig_opt"
    // src/parser/Music.g:139:1: assig_opt : id_rule ( ASSIG ^ ( expr | notes_variable | drumsnotes_variable ) )? ;
    public final MusicParser.assig_opt_return assig_opt() throws RecognitionException {
        MusicParser.assig_opt_return retval = new MusicParser.assig_opt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token ASSIG121=null;
        MusicParser.id_rule_return id_rule120 =null;

        MusicParser.expr_return expr122 =null;

        MusicParser.notes_variable_return notes_variable123 =null;

        MusicParser.drumsnotes_variable_return drumsnotes_variable124 =null;


        AmlTree ASSIG121_tree=null;

        try {
            // src/parser/Music.g:139:13: ( id_rule ( ASSIG ^ ( expr | notes_variable | drumsnotes_variable ) )? )
            // src/parser/Music.g:139:17: id_rule ( ASSIG ^ ( expr | notes_variable | drumsnotes_variable ) )?
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_id_rule_in_assig_opt1754);
            id_rule120=id_rule();

            state._fsp--;

            adaptor.addChild(root_0, id_rule120.getTree());

            // src/parser/Music.g:139:25: ( ASSIG ^ ( expr | notes_variable | drumsnotes_variable ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==ASSIG) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // src/parser/Music.g:139:26: ASSIG ^ ( expr | notes_variable | drumsnotes_variable )
                    {
                    ASSIG121=(Token)match(input,ASSIG,FOLLOW_ASSIG_in_assig_opt1757); 
                    ASSIG121_tree = 
                    (AmlTree)adaptor.create(ASSIG121)
                    ;
                    root_0 = (AmlTree)adaptor.becomeRoot(ASSIG121_tree, root_0);


                    // src/parser/Music.g:139:33: ( expr | notes_variable | drumsnotes_variable )
                    int alt23=3;
                    switch ( input.LA(1) ) {
                    case FALSE:
                    case ID_:
                    case LETTER_X:
                    case MINUS:
                    case NEG_NUM:
                    case NOT:
                    case PLUS:
                    case POS_NUM:
                    case STRING:
                    case TRUE:
                        {
                        alt23=1;
                        }
                        break;
                    case 102:
                        {
                        switch ( input.LA(2) ) {
                        case FALSE:
                        case ID_:
                        case LETTER_X:
                        case MINUS:
                        case NEG_NUM:
                        case NOT:
                        case PLUS:
                        case POS_NUM:
                        case STRING:
                        case TRUE:
                        case 102:
                            {
                            alt23=1;
                            }
                            break;
                        case ARMOR:
                        case BEMOL:
                        case NOTE:
                        case SUSTAIN:
                            {
                            alt23=2;
                            }
                            break;
                        case DN:
                            {
                            alt23=3;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 23, 2, input);

                            throw nvae;

                        }

                        }
                        break;
                    case ARMOR:
                    case BEMOL:
                    case CHORD:
                    case NOTE:
                    case SUSTAIN:
                    case 109:
                        {
                        alt23=2;
                        }
                        break;
                    case DN:
                        {
                        alt23=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 0, input);

                        throw nvae;

                    }

                    switch (alt23) {
                        case 1 :
                            // src/parser/Music.g:139:34: expr
                            {
                            pushFollow(FOLLOW_expr_in_assig_opt1761);
                            expr122=expr();

                            state._fsp--;

                            adaptor.addChild(root_0, expr122.getTree());

                            }
                            break;
                        case 2 :
                            // src/parser/Music.g:139:41: notes_variable
                            {
                            pushFollow(FOLLOW_notes_variable_in_assig_opt1765);
                            notes_variable123=notes_variable();

                            state._fsp--;

                            adaptor.addChild(root_0, notes_variable123.getTree());

                            }
                            break;
                        case 3 :
                            // src/parser/Music.g:139:58: drumsnotes_variable
                            {
                            pushFollow(FOLLOW_drumsnotes_variable_in_assig_opt1769);
                            drumsnotes_variable124=drumsnotes_variable();

                            state._fsp--;

                            adaptor.addChild(root_0, drumsnotes_variable124.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assig_opt"


    public static class assignation_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assignation"
    // src/parser/Music.g:142:1: assignation : assig ';' !;
    public final MusicParser.assignation_return assignation() throws RecognitionException {
        MusicParser.assignation_return retval = new MusicParser.assignation_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal126=null;
        MusicParser.assig_return assig125 =null;


        AmlTree char_literal126_tree=null;

        try {
            // src/parser/Music.g:142:13: ( assig ';' !)
            // src/parser/Music.g:142:17: assig ';' !
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_assig_in_assignation1795);
            assig125=assig();

            state._fsp--;

            adaptor.addChild(root_0, assig125.getTree());

            char_literal126=(Token)match(input,107,FOLLOW_107_in_assignation1797); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assignation"


    public static class assig_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assig"
    // src/parser/Music.g:145:1: assig : ( var_access ( ASSIG | PLUS_ASSIG | MINUS_ASSIG | PROD_ASSIG | DIVIDE_ASSIG | MOD_ASSIG ) ^ ( expr | notes_variable | drumsnotes_variable | FIGURE_NAME ) | post | pre );
    public final MusicParser.assig_return assig() throws RecognitionException {
        MusicParser.assig_return retval = new MusicParser.assig_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token set128=null;
        Token FIGURE_NAME132=null;
        MusicParser.var_access_return var_access127 =null;

        MusicParser.expr_return expr129 =null;

        MusicParser.notes_variable_return notes_variable130 =null;

        MusicParser.drumsnotes_variable_return drumsnotes_variable131 =null;

        MusicParser.post_return post133 =null;

        MusicParser.pre_return pre134 =null;


        AmlTree set128_tree=null;
        AmlTree FIGURE_NAME132_tree=null;

        try {
            // src/parser/Music.g:145:13: ( var_access ( ASSIG | PLUS_ASSIG | MINUS_ASSIG | PROD_ASSIG | DIVIDE_ASSIG | MOD_ASSIG ) ^ ( expr | notes_variable | drumsnotes_variable | FIGURE_NAME ) | post | pre )
            int alt26=3;
            switch ( input.LA(1) ) {
            case ID_:
                {
                switch ( input.LA(2) ) {
                case 105:
                    {
                    int LA26_4 = input.LA(3);

                    if ( (LA26_4==ID_) ) {
                        int LA26_7 = input.LA(4);

                        if ( (LA26_7==ASSIG||LA26_7==DIVIDE_ASSIG||LA26_7==MINUS_ASSIG||LA26_7==MOD_ASSIG||LA26_7==PLUS_ASSIG||LA26_7==PROD_ASSIG) ) {
                            alt26=1;
                        }
                        else if ( (LA26_7==DECR||LA26_7==INCR) ) {
                            alt26=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 26, 7, input);

                            throw nvae;

                        }
                    }
                    else if ( (LA26_4==LETTER_X) ) {
                        int LA26_8 = input.LA(4);

                        if ( (LA26_8==ASSIG||LA26_8==DIVIDE_ASSIG||LA26_8==MINUS_ASSIG||LA26_8==MOD_ASSIG||LA26_8==PLUS_ASSIG||LA26_8==PROD_ASSIG) ) {
                            alt26=1;
                        }
                        else if ( (LA26_8==DECR||LA26_8==INCR) ) {
                            alt26=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 26, 8, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 26, 4, input);

                        throw nvae;

                    }
                    }
                    break;
                case ASSIG:
                case DIVIDE_ASSIG:
                case MINUS_ASSIG:
                case MOD_ASSIG:
                case PLUS_ASSIG:
                case PROD_ASSIG:
                    {
                    alt26=1;
                    }
                    break;
                case DECR:
                case INCR:
                    {
                    alt26=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 1, input);

                    throw nvae;

                }

                }
                break;
            case LETTER_X:
                {
                switch ( input.LA(2) ) {
                case 105:
                    {
                    int LA26_4 = input.LA(3);

                    if ( (LA26_4==ID_) ) {
                        int LA26_7 = input.LA(4);

                        if ( (LA26_7==ASSIG||LA26_7==DIVIDE_ASSIG||LA26_7==MINUS_ASSIG||LA26_7==MOD_ASSIG||LA26_7==PLUS_ASSIG||LA26_7==PROD_ASSIG) ) {
                            alt26=1;
                        }
                        else if ( (LA26_7==DECR||LA26_7==INCR) ) {
                            alt26=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 26, 7, input);

                            throw nvae;

                        }
                    }
                    else if ( (LA26_4==LETTER_X) ) {
                        int LA26_8 = input.LA(4);

                        if ( (LA26_8==ASSIG||LA26_8==DIVIDE_ASSIG||LA26_8==MINUS_ASSIG||LA26_8==MOD_ASSIG||LA26_8==PLUS_ASSIG||LA26_8==PROD_ASSIG) ) {
                            alt26=1;
                        }
                        else if ( (LA26_8==DECR||LA26_8==INCR) ) {
                            alt26=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 26, 8, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 26, 4, input);

                        throw nvae;

                    }
                    }
                    break;
                case ASSIG:
                case DIVIDE_ASSIG:
                case MINUS_ASSIG:
                case MOD_ASSIG:
                case PLUS_ASSIG:
                case PROD_ASSIG:
                    {
                    alt26=1;
                    }
                    break;
                case DECR:
                case INCR:
                    {
                    alt26=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 2, input);

                    throw nvae;

                }

                }
                break;
            case DECR:
            case INCR:
                {
                alt26=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;

            }

            switch (alt26) {
                case 1 :
                    // src/parser/Music.g:145:17: var_access ( ASSIG | PLUS_ASSIG | MINUS_ASSIG | PROD_ASSIG | DIVIDE_ASSIG | MOD_ASSIG ) ^ ( expr | notes_variable | drumsnotes_variable | FIGURE_NAME )
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_var_access_in_assig1827);
                    var_access127=var_access();

                    state._fsp--;

                    adaptor.addChild(root_0, var_access127.getTree());

                    set128=(Token)input.LT(1);

                    set128=(Token)input.LT(1);

                    if ( input.LA(1)==ASSIG||input.LA(1)==DIVIDE_ASSIG||input.LA(1)==MINUS_ASSIG||input.LA(1)==MOD_ASSIG||input.LA(1)==PLUS_ASSIG||input.LA(1)==PROD_ASSIG ) {
                        input.consume();
                        root_0 = (AmlTree)adaptor.becomeRoot(
                        (AmlTree)adaptor.create(set128)
                        , root_0);
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    // src/parser/Music.g:145:94: ( expr | notes_variable | drumsnotes_variable | FIGURE_NAME )
                    int alt25=4;
                    switch ( input.LA(1) ) {
                    case FALSE:
                    case ID_:
                    case LETTER_X:
                    case MINUS:
                    case NEG_NUM:
                    case NOT:
                    case PLUS:
                    case POS_NUM:
                    case STRING:
                    case TRUE:
                        {
                        alt25=1;
                        }
                        break;
                    case 102:
                        {
                        switch ( input.LA(2) ) {
                        case FALSE:
                        case ID_:
                        case LETTER_X:
                        case MINUS:
                        case NEG_NUM:
                        case NOT:
                        case PLUS:
                        case POS_NUM:
                        case STRING:
                        case TRUE:
                        case 102:
                            {
                            alt25=1;
                            }
                            break;
                        case ARMOR:
                        case BEMOL:
                        case NOTE:
                        case SUSTAIN:
                            {
                            alt25=2;
                            }
                            break;
                        case DN:
                            {
                            alt25=3;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 25, 2, input);

                            throw nvae;

                        }

                        }
                        break;
                    case ARMOR:
                    case BEMOL:
                    case CHORD:
                    case NOTE:
                    case SUSTAIN:
                    case 109:
                        {
                        alt25=2;
                        }
                        break;
                    case DN:
                        {
                        alt25=3;
                        }
                        break;
                    case FIGURE_NAME:
                        {
                        alt25=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 0, input);

                        throw nvae;

                    }

                    switch (alt25) {
                        case 1 :
                            // src/parser/Music.g:145:95: expr
                            {
                            pushFollow(FOLLOW_expr_in_assig1845);
                            expr129=expr();

                            state._fsp--;

                            adaptor.addChild(root_0, expr129.getTree());

                            }
                            break;
                        case 2 :
                            // src/parser/Music.g:145:102: notes_variable
                            {
                            pushFollow(FOLLOW_notes_variable_in_assig1849);
                            notes_variable130=notes_variable();

                            state._fsp--;

                            adaptor.addChild(root_0, notes_variable130.getTree());

                            }
                            break;
                        case 3 :
                            // src/parser/Music.g:145:119: drumsnotes_variable
                            {
                            pushFollow(FOLLOW_drumsnotes_variable_in_assig1853);
                            drumsnotes_variable131=drumsnotes_variable();

                            state._fsp--;

                            adaptor.addChild(root_0, drumsnotes_variable131.getTree());

                            }
                            break;
                        case 4 :
                            // src/parser/Music.g:145:141: FIGURE_NAME
                            {
                            FIGURE_NAME132=(Token)match(input,FIGURE_NAME,FOLLOW_FIGURE_NAME_in_assig1857); 
                            FIGURE_NAME132_tree = 
                            (AmlTree)adaptor.create(FIGURE_NAME132)
                            ;
                            adaptor.addChild(root_0, FIGURE_NAME132_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // src/parser/Music.g:146:17: post
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_post_in_assig1876);
                    post133=post();

                    state._fsp--;

                    adaptor.addChild(root_0, post133.getTree());

                    }
                    break;
                case 3 :
                    // src/parser/Music.g:147:17: pre
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_pre_in_assig1894);
                    pre134=pre();

                    state._fsp--;

                    adaptor.addChild(root_0, pre134.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assig"


    public static class var_funcall_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "var_funcall"
    // src/parser/Music.g:150:1: var_funcall : id= id_rule '.' id2= id_rule '(' ( params )? ')' ';' -> ^( VAR_FUNCALL[$id.text] $id2 ( params )? ) ;
    public final MusicParser.var_funcall_return var_funcall() throws RecognitionException {
        MusicParser.var_funcall_return retval = new MusicParser.var_funcall_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal135=null;
        Token char_literal136=null;
        Token char_literal138=null;
        Token char_literal139=null;
        MusicParser.id_rule_return id =null;

        MusicParser.id_rule_return id2 =null;

        MusicParser.params_return params137 =null;


        AmlTree char_literal135_tree=null;
        AmlTree char_literal136_tree=null;
        AmlTree char_literal138_tree=null;
        AmlTree char_literal139_tree=null;
        RewriteRuleTokenStream stream_107=new RewriteRuleTokenStream(adaptor,"token 107");
        RewriteRuleTokenStream stream_105=new RewriteRuleTokenStream(adaptor,"token 105");
        RewriteRuleTokenStream stream_103=new RewriteRuleTokenStream(adaptor,"token 103");
        RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
        RewriteRuleSubtreeStream stream_id_rule=new RewriteRuleSubtreeStream(adaptor,"rule id_rule");
        RewriteRuleSubtreeStream stream_params=new RewriteRuleSubtreeStream(adaptor,"rule params");
        try {
            // src/parser/Music.g:150:13: (id= id_rule '.' id2= id_rule '(' ( params )? ')' ';' -> ^( VAR_FUNCALL[$id.text] $id2 ( params )? ) )
            // src/parser/Music.g:150:17: id= id_rule '.' id2= id_rule '(' ( params )? ')' ';'
            {
            pushFollow(FOLLOW_id_rule_in_var_funcall1919);
            id=id_rule();

            state._fsp--;

            stream_id_rule.add(id.getTree());

            char_literal135=(Token)match(input,105,FOLLOW_105_in_var_funcall1921);  
            stream_105.add(char_literal135);


            pushFollow(FOLLOW_id_rule_in_var_funcall1925);
            id2=id_rule();

            state._fsp--;

            stream_id_rule.add(id2.getTree());

            char_literal136=(Token)match(input,102,FOLLOW_102_in_var_funcall1927);  
            stream_102.add(char_literal136);


            // src/parser/Music.g:150:48: ( params )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==ARMOR||LA27_0==BEMOL||LA27_0==CHORD||LA27_0==DN||LA27_0==FALSE||LA27_0==ID_||LA27_0==LETTER_X||LA27_0==MINUS||(LA27_0 >= NEG_NUM && LA27_0 <= NOTE)||LA27_0==PLUS||LA27_0==POS_NUM||LA27_0==STRING||LA27_0==SUSTAIN||LA27_0==TRUE||LA27_0==102||LA27_0==109) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // src/parser/Music.g:150:48: params
                    {
                    pushFollow(FOLLOW_params_in_var_funcall1929);
                    params137=params();

                    state._fsp--;

                    stream_params.add(params137.getTree());

                    }
                    break;

            }


            char_literal138=(Token)match(input,103,FOLLOW_103_in_var_funcall1932);  
            stream_103.add(char_literal138);


            char_literal139=(Token)match(input,107,FOLLOW_107_in_var_funcall1934);  
            stream_107.add(char_literal139);


            // AST REWRITE
            // elements: params, id2
            // token labels: 
            // rule labels: retval, id2
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_id2=new RewriteRuleSubtreeStream(adaptor,"rule id2",id2!=null?id2.tree:null);

            root_0 = (AmlTree)adaptor.nil();
            // 150:65: -> ^( VAR_FUNCALL[$id.text] $id2 ( params )? )
            {
                // src/parser/Music.g:150:69: ^( VAR_FUNCALL[$id.text] $id2 ( params )? )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(VAR_FUNCALL, (id!=null?input.toString(id.start,id.stop):null))
                , root_1);

                adaptor.addChild(root_1, stream_id2.nextTree());

                // src/parser/Music.g:150:98: ( params )?
                if ( stream_params.hasNext() ) {
                    adaptor.addChild(root_1, stream_params.nextTree());

                }
                stream_params.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "var_funcall"


    public static class var_access_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "var_access"
    // src/parser/Music.g:153:1: var_access : (id1= id_rule ( '.' id2= id_rule ) -> ^( ATTR_ACCESS[$id1.text] $id2) | id_rule );
    public final MusicParser.var_access_return var_access() throws RecognitionException {
        MusicParser.var_access_return retval = new MusicParser.var_access_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal140=null;
        MusicParser.id_rule_return id1 =null;

        MusicParser.id_rule_return id2 =null;

        MusicParser.id_rule_return id_rule141 =null;


        AmlTree char_literal140_tree=null;
        RewriteRuleTokenStream stream_105=new RewriteRuleTokenStream(adaptor,"token 105");
        RewriteRuleSubtreeStream stream_id_rule=new RewriteRuleSubtreeStream(adaptor,"rule id_rule");
        try {
            // src/parser/Music.g:153:13: (id1= id_rule ( '.' id2= id_rule ) -> ^( ATTR_ACCESS[$id1.text] $id2) | id_rule )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==ID_) ) {
                int LA28_1 = input.LA(2);

                if ( (LA28_1==105) ) {
                    alt28=1;
                }
                else if ( (LA28_1==AND||LA28_1==ASSIG||LA28_1==BEMOL||LA28_1==DECR||(LA28_1 >= DIV && LA28_1 <= DIVIDE_ASSIG)||LA28_1==DOT||LA28_1==EQUAL||(LA28_1 >= GE && LA28_1 <= GT)||LA28_1==INCR||LA28_1==LE||LA28_1==LT||(LA28_1 >= MINUS && LA28_1 <= MOD_ASSIG)||LA28_1==NOT_EQUAL||(LA28_1 >= OR && LA28_1 <= PLUS_ASSIG)||LA28_1==PROD_ASSIG||LA28_1==SUSTAIN||(LA28_1 >= 103 && LA28_1 <= 104)||(LA28_1 >= 106 && LA28_1 <= 107)) ) {
                    alt28=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA28_0==LETTER_X) ) {
                int LA28_2 = input.LA(2);

                if ( (LA28_2==105) ) {
                    alt28=1;
                }
                else if ( (LA28_2==AND||LA28_2==ASSIG||LA28_2==BEMOL||LA28_2==DECR||(LA28_2 >= DIV && LA28_2 <= DIVIDE_ASSIG)||LA28_2==DOT||LA28_2==EQUAL||(LA28_2 >= GE && LA28_2 <= GT)||LA28_2==INCR||LA28_2==LE||LA28_2==LT||(LA28_2 >= MINUS && LA28_2 <= MOD_ASSIG)||LA28_2==NOT_EQUAL||(LA28_2 >= OR && LA28_2 <= PLUS_ASSIG)||LA28_2==PROD_ASSIG||LA28_2==SUSTAIN||(LA28_2 >= 103 && LA28_2 <= 104)||(LA28_2 >= 106 && LA28_2 <= 107)) ) {
                    alt28=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 2, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;

            }
            switch (alt28) {
                case 1 :
                    // src/parser/Music.g:153:17: id1= id_rule ( '.' id2= id_rule )
                    {
                    pushFollow(FOLLOW_id_rule_in_var_access1975);
                    id1=id_rule();

                    state._fsp--;

                    stream_id_rule.add(id1.getTree());

                    // src/parser/Music.g:153:29: ( '.' id2= id_rule )
                    // src/parser/Music.g:153:30: '.' id2= id_rule
                    {
                    char_literal140=(Token)match(input,105,FOLLOW_105_in_var_access1978);  
                    stream_105.add(char_literal140);


                    pushFollow(FOLLOW_id_rule_in_var_access1982);
                    id2=id_rule();

                    state._fsp--;

                    stream_id_rule.add(id2.getTree());

                    }


                    // AST REWRITE
                    // elements: id2
                    // token labels: 
                    // rule labels: retval, id2
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_id2=new RewriteRuleSubtreeStream(adaptor,"rule id2",id2!=null?id2.tree:null);

                    root_0 = (AmlTree)adaptor.nil();
                    // 153:47: -> ^( ATTR_ACCESS[$id1.text] $id2)
                    {
                        // src/parser/Music.g:153:50: ^( ATTR_ACCESS[$id1.text] $id2)
                        {
                        AmlTree root_1 = (AmlTree)adaptor.nil();
                        root_1 = (AmlTree)adaptor.becomeRoot(
                        (AmlTree)adaptor.create(ATTR_ACCESS, (id1!=null?input.toString(id1.start,id1.stop):null))
                        , root_1);

                        adaptor.addChild(root_1, stream_id2.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:154:17: id_rule
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_id_rule_in_var_access2011);
                    id_rule141=id_rule();

                    state._fsp--;

                    adaptor.addChild(root_0, id_rule141.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "var_access"


    public static class id_rule_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "id_rule"
    // src/parser/Music.g:157:1: id_rule : (id= ID_ |id= LETTER_X ) -> ^( ID[$id] ) ;
    public final MusicParser.id_rule_return id_rule() throws RecognitionException {
        MusicParser.id_rule_return retval = new MusicParser.id_rule_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token id=null;

        AmlTree id_tree=null;
        RewriteRuleTokenStream stream_LETTER_X=new RewriteRuleTokenStream(adaptor,"token LETTER_X");
        RewriteRuleTokenStream stream_ID_=new RewriteRuleTokenStream(adaptor,"token ID_");

        try {
            // src/parser/Music.g:157:13: ( (id= ID_ |id= LETTER_X ) -> ^( ID[$id] ) )
            // src/parser/Music.g:157:17: (id= ID_ |id= LETTER_X )
            {
            // src/parser/Music.g:157:17: (id= ID_ |id= LETTER_X )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==ID_) ) {
                alt29=1;
            }
            else if ( (LA29_0==LETTER_X) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;

            }
            switch (alt29) {
                case 1 :
                    // src/parser/Music.g:157:18: id= ID_
                    {
                    id=(Token)match(input,ID_,FOLLOW_ID__in_id_rule2041);  
                    stream_ID_.add(id);


                    }
                    break;
                case 2 :
                    // src/parser/Music.g:157:29: id= LETTER_X
                    {
                    id=(Token)match(input,LETTER_X,FOLLOW_LETTER_X_in_id_rule2049);  
                    stream_LETTER_X.add(id);


                    }
                    break;

            }


            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AmlTree)adaptor.nil();
            // 157:42: -> ^( ID[$id] )
            {
                // src/parser/Music.g:157:45: ^( ID[$id] )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(ID, id)
                , root_1);

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "id_rule"


    public static class post_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "post"
    // src/parser/Music.g:161:1: post : var_access (x= INCR |x= DECR ) -> ^( POST var_access $x) ;
    public final MusicParser.post_return post() throws RecognitionException {
        MusicParser.post_return retval = new MusicParser.post_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token x=null;
        MusicParser.var_access_return var_access142 =null;


        AmlTree x_tree=null;
        RewriteRuleTokenStream stream_DECR=new RewriteRuleTokenStream(adaptor,"token DECR");
        RewriteRuleTokenStream stream_INCR=new RewriteRuleTokenStream(adaptor,"token INCR");
        RewriteRuleSubtreeStream stream_var_access=new RewriteRuleSubtreeStream(adaptor,"rule var_access");
        try {
            // src/parser/Music.g:161:13: ( var_access (x= INCR |x= DECR ) -> ^( POST var_access $x) )
            // src/parser/Music.g:161:17: var_access (x= INCR |x= DECR )
            {
            pushFollow(FOLLOW_var_access_in_post2088);
            var_access142=var_access();

            state._fsp--;

            stream_var_access.add(var_access142.getTree());

            // src/parser/Music.g:161:28: (x= INCR |x= DECR )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==INCR) ) {
                alt30=1;
            }
            else if ( (LA30_0==DECR) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;

            }
            switch (alt30) {
                case 1 :
                    // src/parser/Music.g:161:29: x= INCR
                    {
                    x=(Token)match(input,INCR,FOLLOW_INCR_in_post2093);  
                    stream_INCR.add(x);


                    }
                    break;
                case 2 :
                    // src/parser/Music.g:161:38: x= DECR
                    {
                    x=(Token)match(input,DECR,FOLLOW_DECR_in_post2099);  
                    stream_DECR.add(x);


                    }
                    break;

            }


            // AST REWRITE
            // elements: var_access, x
            // token labels: x
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_x=new RewriteRuleTokenStream(adaptor,"token x",x);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AmlTree)adaptor.nil();
            // 161:46: -> ^( POST var_access $x)
            {
                // src/parser/Music.g:161:50: ^( POST var_access $x)
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(POST, "POST")
                , root_1);

                adaptor.addChild(root_1, stream_var_access.nextTree());

                adaptor.addChild(root_1, stream_x.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "post"


    public static class pre_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "pre"
    // src/parser/Music.g:164:1: pre : (x= INCR |x= DECR ) var_access -> ^( PRE var_access $x) ;
    public final MusicParser.pre_return pre() throws RecognitionException {
        MusicParser.pre_return retval = new MusicParser.pre_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token x=null;
        MusicParser.var_access_return var_access143 =null;


        AmlTree x_tree=null;
        RewriteRuleTokenStream stream_DECR=new RewriteRuleTokenStream(adaptor,"token DECR");
        RewriteRuleTokenStream stream_INCR=new RewriteRuleTokenStream(adaptor,"token INCR");
        RewriteRuleSubtreeStream stream_var_access=new RewriteRuleSubtreeStream(adaptor,"rule var_access");
        try {
            // src/parser/Music.g:164:13: ( (x= INCR |x= DECR ) var_access -> ^( PRE var_access $x) )
            // src/parser/Music.g:164:17: (x= INCR |x= DECR ) var_access
            {
            // src/parser/Music.g:164:17: (x= INCR |x= DECR )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==INCR) ) {
                alt31=1;
            }
            else if ( (LA31_0==DECR) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;

            }
            switch (alt31) {
                case 1 :
                    // src/parser/Music.g:164:18: x= INCR
                    {
                    x=(Token)match(input,INCR,FOLLOW_INCR_in_pre2146);  
                    stream_INCR.add(x);


                    }
                    break;
                case 2 :
                    // src/parser/Music.g:164:27: x= DECR
                    {
                    x=(Token)match(input,DECR,FOLLOW_DECR_in_pre2152);  
                    stream_DECR.add(x);


                    }
                    break;

            }


            pushFollow(FOLLOW_var_access_in_pre2155);
            var_access143=var_access();

            state._fsp--;

            stream_var_access.add(var_access143.getTree());

            // AST REWRITE
            // elements: var_access, x
            // token labels: x
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_x=new RewriteRuleTokenStream(adaptor,"token x",x);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AmlTree)adaptor.nil();
            // 164:47: -> ^( PRE var_access $x)
            {
                // src/parser/Music.g:164:50: ^( PRE var_access $x)
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(PRE, "PRE")
                , root_1);

                adaptor.addChild(root_1, stream_var_access.nextTree());

                adaptor.addChild(root_1, stream_x.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "pre"


    public static class beat_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "beat"
    // src/parser/Music.g:167:1: beat : BEAT ^ num_expr ':' ! num_expr ;
    public final MusicParser.beat_return beat() throws RecognitionException {
        MusicParser.beat_return retval = new MusicParser.beat_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token BEAT144=null;
        Token char_literal146=null;
        MusicParser.num_expr_return num_expr145 =null;

        MusicParser.num_expr_return num_expr147 =null;


        AmlTree BEAT144_tree=null;
        AmlTree char_literal146_tree=null;

        try {
            // src/parser/Music.g:167:13: ( BEAT ^ num_expr ':' ! num_expr )
            // src/parser/Music.g:167:17: BEAT ^ num_expr ':' ! num_expr
            {
            root_0 = (AmlTree)adaptor.nil();


            BEAT144=(Token)match(input,BEAT,FOLLOW_BEAT_in_beat2198); 
            BEAT144_tree = 
            (AmlTree)adaptor.create(BEAT144)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(BEAT144_tree, root_0);


            pushFollow(FOLLOW_num_expr_in_beat2201);
            num_expr145=num_expr();

            state._fsp--;

            adaptor.addChild(root_0, num_expr145.getTree());

            char_literal146=(Token)match(input,106,FOLLOW_106_in_beat2203); 

            pushFollow(FOLLOW_num_expr_in_beat2206);
            num_expr147=num_expr();

            state._fsp--;

            adaptor.addChild(root_0, num_expr147.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "beat"


    public static class speed_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "speed"
    // src/parser/Music.g:170:1: speed : SPEED ^ num_expr ;
    public final MusicParser.speed_return speed() throws RecognitionException {
        MusicParser.speed_return retval = new MusicParser.speed_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token SPEED148=null;
        MusicParser.num_expr_return num_expr149 =null;


        AmlTree SPEED148_tree=null;

        try {
            // src/parser/Music.g:170:13: ( SPEED ^ num_expr )
            // src/parser/Music.g:170:17: SPEED ^ num_expr
            {
            root_0 = (AmlTree)adaptor.nil();


            SPEED148=(Token)match(input,SPEED,FOLLOW_SPEED_in_speed2235); 
            SPEED148_tree = 
            (AmlTree)adaptor.create(SPEED148)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(SPEED148_tree, root_0);


            pushFollow(FOLLOW_num_expr_in_speed2238);
            num_expr149=num_expr();

            state._fsp--;

            adaptor.addChild(root_0, num_expr149.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "speed"


    public static class volume_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "volume"
    // src/parser/Music.g:173:1: volume : VOLUME ^ num_expr ;
    public final MusicParser.volume_return volume() throws RecognitionException {
        MusicParser.volume_return retval = new MusicParser.volume_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token VOLUME150=null;
        MusicParser.num_expr_return num_expr151 =null;


        AmlTree VOLUME150_tree=null;

        try {
            // src/parser/Music.g:173:13: ( VOLUME ^ num_expr )
            // src/parser/Music.g:173:17: VOLUME ^ num_expr
            {
            root_0 = (AmlTree)adaptor.nil();


            VOLUME150=(Token)match(input,VOLUME,FOLLOW_VOLUME_in_volume2266); 
            VOLUME150_tree = 
            (AmlTree)adaptor.create(VOLUME150)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(VOLUME150_tree, root_0);


            pushFollow(FOLLOW_num_expr_in_volume2269);
            num_expr151=num_expr();

            state._fsp--;

            adaptor.addChild(root_0, num_expr151.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "volume"


    public static class transport_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "transport"
    // src/parser/Music.g:175:1: transport : TRANSPORT ^ num_expr ;
    public final MusicParser.transport_return transport() throws RecognitionException {
        MusicParser.transport_return retval = new MusicParser.transport_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token TRANSPORT152=null;
        MusicParser.num_expr_return num_expr153 =null;


        AmlTree TRANSPORT152_tree=null;

        try {
            // src/parser/Music.g:175:13: ( TRANSPORT ^ num_expr )
            // src/parser/Music.g:175:17: TRANSPORT ^ num_expr
            {
            root_0 = (AmlTree)adaptor.nil();


            TRANSPORT152=(Token)match(input,TRANSPORT,FOLLOW_TRANSPORT_in_transport2281); 
            TRANSPORT152_tree = 
            (AmlTree)adaptor.create(TRANSPORT152)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(TRANSPORT152_tree, root_0);


            pushFollow(FOLLOW_num_expr_in_transport2284);
            num_expr153=num_expr();

            state._fsp--;

            adaptor.addChild(root_0, num_expr153.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "transport"


    public static class instrument_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "instrument"
    // src/parser/Music.g:178:1: instrument : INSTRUMENT ^ STRING ;
    public final MusicParser.instrument_return instrument() throws RecognitionException {
        MusicParser.instrument_return retval = new MusicParser.instrument_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token INSTRUMENT154=null;
        Token STRING155=null;

        AmlTree INSTRUMENT154_tree=null;
        AmlTree STRING155_tree=null;

        try {
            // src/parser/Music.g:178:13: ( INSTRUMENT ^ STRING )
            // src/parser/Music.g:178:17: INSTRUMENT ^ STRING
            {
            root_0 = (AmlTree)adaptor.nil();


            INSTRUMENT154=(Token)match(input,INSTRUMENT,FOLLOW_INSTRUMENT_in_instrument2308); 
            INSTRUMENT154_tree = 
            (AmlTree)adaptor.create(INSTRUMENT154)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(INSTRUMENT154_tree, root_0);


            STRING155=(Token)match(input,STRING,FOLLOW_STRING_in_instrument2311); 
            STRING155_tree = 
            (AmlTree)adaptor.create(STRING155)
            ;
            adaptor.addChild(root_0, STRING155_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "instrument"


    public static class while_stmt_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "while_stmt"
    // src/parser/Music.g:181:1: while_stmt : WHILE ^ '(' ! expr ')' ! '{' ! listInst '}' !;
    public final MusicParser.while_stmt_return while_stmt() throws RecognitionException {
        MusicParser.while_stmt_return retval = new MusicParser.while_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token WHILE156=null;
        Token char_literal157=null;
        Token char_literal159=null;
        Token char_literal160=null;
        Token char_literal162=null;
        MusicParser.expr_return expr158 =null;

        MusicParser.listInst_return listInst161 =null;


        AmlTree WHILE156_tree=null;
        AmlTree char_literal157_tree=null;
        AmlTree char_literal159_tree=null;
        AmlTree char_literal160_tree=null;
        AmlTree char_literal162_tree=null;

        try {
            // src/parser/Music.g:181:13: ( WHILE ^ '(' ! expr ')' ! '{' ! listInst '}' !)
            // src/parser/Music.g:181:17: WHILE ^ '(' ! expr ')' ! '{' ! listInst '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            WHILE156=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_stmt2335); 
            WHILE156_tree = 
            (AmlTree)adaptor.create(WHILE156)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(WHILE156_tree, root_0);


            char_literal157=(Token)match(input,102,FOLLOW_102_in_while_stmt2338); 

            pushFollow(FOLLOW_expr_in_while_stmt2341);
            expr158=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr158.getTree());

            char_literal159=(Token)match(input,103,FOLLOW_103_in_while_stmt2343); 

            char_literal160=(Token)match(input,112,FOLLOW_112_in_while_stmt2346); 

            pushFollow(FOLLOW_listInst_in_while_stmt2349);
            listInst161=listInst();

            state._fsp--;

            adaptor.addChild(root_0, listInst161.getTree());

            char_literal162=(Token)match(input,113,FOLLOW_113_in_while_stmt2351); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "while_stmt"


    public static class while_music_stmt_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "while_music_stmt"
    // src/parser/Music.g:184:1: while_music_stmt : WHILE ^ '(' ! expr ')' ! '{' ! list_music_inst '}' !;
    public final MusicParser.while_music_stmt_return while_music_stmt() throws RecognitionException {
        MusicParser.while_music_stmt_return retval = new MusicParser.while_music_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token WHILE163=null;
        Token char_literal164=null;
        Token char_literal166=null;
        Token char_literal167=null;
        Token char_literal169=null;
        MusicParser.expr_return expr165 =null;

        MusicParser.list_music_inst_return list_music_inst168 =null;


        AmlTree WHILE163_tree=null;
        AmlTree char_literal164_tree=null;
        AmlTree char_literal166_tree=null;
        AmlTree char_literal167_tree=null;
        AmlTree char_literal169_tree=null;

        try {
            // src/parser/Music.g:184:21: ( WHILE ^ '(' ! expr ')' ! '{' ! list_music_inst '}' !)
            // src/parser/Music.g:184:25: WHILE ^ '(' ! expr ')' ! '{' ! list_music_inst '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            WHILE163=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_music_stmt2378); 
            WHILE163_tree = 
            (AmlTree)adaptor.create(WHILE163)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(WHILE163_tree, root_0);


            char_literal164=(Token)match(input,102,FOLLOW_102_in_while_music_stmt2381); 

            pushFollow(FOLLOW_expr_in_while_music_stmt2384);
            expr165=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr165.getTree());

            char_literal166=(Token)match(input,103,FOLLOW_103_in_while_music_stmt2386); 

            char_literal167=(Token)match(input,112,FOLLOW_112_in_while_music_stmt2389); 

            pushFollow(FOLLOW_list_music_inst_in_while_music_stmt2392);
            list_music_inst168=list_music_inst();

            state._fsp--;

            adaptor.addChild(root_0, list_music_inst168.getTree());

            char_literal169=(Token)match(input,113,FOLLOW_113_in_while_music_stmt2394); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "while_music_stmt"


    public static class for_stmt_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "for_stmt"
    // src/parser/Music.g:187:1: for_stmt : FOR ^ '(' ! ( declaration | list_assig ';' !) expr ';' ! list_assig ')' ! '{' ! listInst '}' !;
    public final MusicParser.for_stmt_return for_stmt() throws RecognitionException {
        MusicParser.for_stmt_return retval = new MusicParser.for_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token FOR170=null;
        Token char_literal171=null;
        Token char_literal174=null;
        Token char_literal176=null;
        Token char_literal178=null;
        Token char_literal179=null;
        Token char_literal181=null;
        MusicParser.declaration_return declaration172 =null;

        MusicParser.list_assig_return list_assig173 =null;

        MusicParser.expr_return expr175 =null;

        MusicParser.list_assig_return list_assig177 =null;

        MusicParser.listInst_return listInst180 =null;


        AmlTree FOR170_tree=null;
        AmlTree char_literal171_tree=null;
        AmlTree char_literal174_tree=null;
        AmlTree char_literal176_tree=null;
        AmlTree char_literal178_tree=null;
        AmlTree char_literal179_tree=null;
        AmlTree char_literal181_tree=null;

        try {
            // src/parser/Music.g:187:13: ( FOR ^ '(' ! ( declaration | list_assig ';' !) expr ';' ! list_assig ')' ! '{' ! listInst '}' !)
            // src/parser/Music.g:187:17: FOR ^ '(' ! ( declaration | list_assig ';' !) expr ';' ! list_assig ')' ! '{' ! listInst '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            FOR170=(Token)match(input,FOR,FOLLOW_FOR_in_for_stmt2429); 
            FOR170_tree = 
            (AmlTree)adaptor.create(FOR170)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(FOR170_tree, root_0);


            char_literal171=(Token)match(input,102,FOLLOW_102_in_for_stmt2432); 

            // src/parser/Music.g:187:27: ( declaration | list_assig ';' !)
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==BOOL||LA32_0==CHORD||LA32_0==DRUMS_NOTE_TYPE||LA32_0==FIGURE_TYPE||LA32_0==INT||LA32_0==NOTE_TYPE||LA32_0==STRING_TYPE) ) {
                alt32=1;
            }
            else if ( (LA32_0==DECR||LA32_0==ID_||LA32_0==INCR||LA32_0==LETTER_X) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;

            }
            switch (alt32) {
                case 1 :
                    // src/parser/Music.g:187:28: declaration
                    {
                    pushFollow(FOLLOW_declaration_in_for_stmt2436);
                    declaration172=declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, declaration172.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:187:42: list_assig ';' !
                    {
                    pushFollow(FOLLOW_list_assig_in_for_stmt2440);
                    list_assig173=list_assig();

                    state._fsp--;

                    adaptor.addChild(root_0, list_assig173.getTree());

                    char_literal174=(Token)match(input,107,FOLLOW_107_in_for_stmt2442); 

                    }
                    break;

            }


            pushFollow(FOLLOW_expr_in_for_stmt2446);
            expr175=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr175.getTree());

            char_literal176=(Token)match(input,107,FOLLOW_107_in_for_stmt2448); 

            pushFollow(FOLLOW_list_assig_in_for_stmt2451);
            list_assig177=list_assig();

            state._fsp--;

            adaptor.addChild(root_0, list_assig177.getTree());

            char_literal178=(Token)match(input,103,FOLLOW_103_in_for_stmt2453); 

            char_literal179=(Token)match(input,112,FOLLOW_112_in_for_stmt2456); 

            pushFollow(FOLLOW_listInst_in_for_stmt2459);
            listInst180=listInst();

            state._fsp--;

            adaptor.addChild(root_0, listInst180.getTree());

            char_literal181=(Token)match(input,113,FOLLOW_113_in_for_stmt2461); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "for_stmt"


    public static class for_music_stmt_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "for_music_stmt"
    // src/parser/Music.g:190:1: for_music_stmt : FOR ^ '(' ! ( declaration | list_assig ';' !) expr ';' ! list_assig ')' ! '{' ! list_music_inst '}' !;
    public final MusicParser.for_music_stmt_return for_music_stmt() throws RecognitionException {
        MusicParser.for_music_stmt_return retval = new MusicParser.for_music_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token FOR182=null;
        Token char_literal183=null;
        Token char_literal186=null;
        Token char_literal188=null;
        Token char_literal190=null;
        Token char_literal191=null;
        Token char_literal193=null;
        MusicParser.declaration_return declaration184 =null;

        MusicParser.list_assig_return list_assig185 =null;

        MusicParser.expr_return expr187 =null;

        MusicParser.list_assig_return list_assig189 =null;

        MusicParser.list_music_inst_return list_music_inst192 =null;


        AmlTree FOR182_tree=null;
        AmlTree char_literal183_tree=null;
        AmlTree char_literal186_tree=null;
        AmlTree char_literal188_tree=null;
        AmlTree char_literal190_tree=null;
        AmlTree char_literal191_tree=null;
        AmlTree char_literal193_tree=null;

        try {
            // src/parser/Music.g:190:17: ( FOR ^ '(' ! ( declaration | list_assig ';' !) expr ';' ! list_assig ')' ! '{' ! list_music_inst '}' !)
            // src/parser/Music.g:190:21: FOR ^ '(' ! ( declaration | list_assig ';' !) expr ';' ! list_assig ')' ! '{' ! list_music_inst '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            FOR182=(Token)match(input,FOR,FOLLOW_FOR_in_for_music_stmt2486); 
            FOR182_tree = 
            (AmlTree)adaptor.create(FOR182)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(FOR182_tree, root_0);


            char_literal183=(Token)match(input,102,FOLLOW_102_in_for_music_stmt2489); 

            // src/parser/Music.g:190:31: ( declaration | list_assig ';' !)
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==BOOL||LA33_0==CHORD||LA33_0==DRUMS_NOTE_TYPE||LA33_0==FIGURE_TYPE||LA33_0==INT||LA33_0==NOTE_TYPE||LA33_0==STRING_TYPE) ) {
                alt33=1;
            }
            else if ( (LA33_0==DECR||LA33_0==ID_||LA33_0==INCR||LA33_0==LETTER_X) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;

            }
            switch (alt33) {
                case 1 :
                    // src/parser/Music.g:190:32: declaration
                    {
                    pushFollow(FOLLOW_declaration_in_for_music_stmt2493);
                    declaration184=declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, declaration184.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:190:46: list_assig ';' !
                    {
                    pushFollow(FOLLOW_list_assig_in_for_music_stmt2497);
                    list_assig185=list_assig();

                    state._fsp--;

                    adaptor.addChild(root_0, list_assig185.getTree());

                    char_literal186=(Token)match(input,107,FOLLOW_107_in_for_music_stmt2499); 

                    }
                    break;

            }


            pushFollow(FOLLOW_expr_in_for_music_stmt2503);
            expr187=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr187.getTree());

            char_literal188=(Token)match(input,107,FOLLOW_107_in_for_music_stmt2505); 

            pushFollow(FOLLOW_list_assig_in_for_music_stmt2508);
            list_assig189=list_assig();

            state._fsp--;

            adaptor.addChild(root_0, list_assig189.getTree());

            char_literal190=(Token)match(input,103,FOLLOW_103_in_for_music_stmt2510); 

            char_literal191=(Token)match(input,112,FOLLOW_112_in_for_music_stmt2513); 

            pushFollow(FOLLOW_list_music_inst_in_for_music_stmt2516);
            list_music_inst192=list_music_inst();

            state._fsp--;

            adaptor.addChild(root_0, list_music_inst192.getTree());

            char_literal193=(Token)match(input,113,FOLLOW_113_in_for_music_stmt2518); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "for_music_stmt"


    public static class list_assig_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "list_assig"
    // src/parser/Music.g:193:1: list_assig : assig ( ',' assig )* -> ^( LIST_ASSIG ( assig )+ ) ;
    public final MusicParser.list_assig_return list_assig() throws RecognitionException {
        MusicParser.list_assig_return retval = new MusicParser.list_assig_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal195=null;
        MusicParser.assig_return assig194 =null;

        MusicParser.assig_return assig196 =null;


        AmlTree char_literal195_tree=null;
        RewriteRuleTokenStream stream_104=new RewriteRuleTokenStream(adaptor,"token 104");
        RewriteRuleSubtreeStream stream_assig=new RewriteRuleSubtreeStream(adaptor,"rule assig");
        try {
            // src/parser/Music.g:193:13: ( assig ( ',' assig )* -> ^( LIST_ASSIG ( assig )+ ) )
            // src/parser/Music.g:193:17: assig ( ',' assig )*
            {
            pushFollow(FOLLOW_assig_in_list_assig2547);
            assig194=assig();

            state._fsp--;

            stream_assig.add(assig194.getTree());

            // src/parser/Music.g:193:23: ( ',' assig )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==104) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // src/parser/Music.g:193:24: ',' assig
            	    {
            	    char_literal195=(Token)match(input,104,FOLLOW_104_in_list_assig2550);  
            	    stream_104.add(char_literal195);


            	    pushFollow(FOLLOW_assig_in_list_assig2552);
            	    assig196=assig();

            	    state._fsp--;

            	    stream_assig.add(assig196.getTree());

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            // AST REWRITE
            // elements: assig
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AmlTree)adaptor.nil();
            // 193:36: -> ^( LIST_ASSIG ( assig )+ )
            {
                // src/parser/Music.g:193:39: ^( LIST_ASSIG ( assig )+ )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(LIST_ASSIG, "LIST_ASSIG")
                , root_1);

                if ( !(stream_assig.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_assig.hasNext() ) {
                    adaptor.addChild(root_1, stream_assig.nextTree());

                }
                stream_assig.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "list_assig"


    public static class if_stmt_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "if_stmt"
    // src/parser/Music.g:196:1: if_stmt : IF ^ '(' ! expr ')' ! '{' ! listInst '}' ! ( elseif_stmt )* ( else_stmt )? ;
    public final MusicParser.if_stmt_return if_stmt() throws RecognitionException {
        MusicParser.if_stmt_return retval = new MusicParser.if_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token IF197=null;
        Token char_literal198=null;
        Token char_literal200=null;
        Token char_literal201=null;
        Token char_literal203=null;
        MusicParser.expr_return expr199 =null;

        MusicParser.listInst_return listInst202 =null;

        MusicParser.elseif_stmt_return elseif_stmt204 =null;

        MusicParser.else_stmt_return else_stmt205 =null;


        AmlTree IF197_tree=null;
        AmlTree char_literal198_tree=null;
        AmlTree char_literal200_tree=null;
        AmlTree char_literal201_tree=null;
        AmlTree char_literal203_tree=null;

        try {
            // src/parser/Music.g:196:13: ( IF ^ '(' ! expr ')' ! '{' ! listInst '}' ! ( elseif_stmt )* ( else_stmt )? )
            // src/parser/Music.g:196:17: IF ^ '(' ! expr ')' ! '{' ! listInst '}' ! ( elseif_stmt )* ( else_stmt )?
            {
            root_0 = (AmlTree)adaptor.nil();


            IF197=(Token)match(input,IF,FOLLOW_IF_in_if_stmt2590); 
            IF197_tree = 
            (AmlTree)adaptor.create(IF197)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(IF197_tree, root_0);


            char_literal198=(Token)match(input,102,FOLLOW_102_in_if_stmt2593); 

            pushFollow(FOLLOW_expr_in_if_stmt2596);
            expr199=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr199.getTree());

            char_literal200=(Token)match(input,103,FOLLOW_103_in_if_stmt2598); 

            char_literal201=(Token)match(input,112,FOLLOW_112_in_if_stmt2601); 

            pushFollow(FOLLOW_listInst_in_if_stmt2604);
            listInst202=listInst();

            state._fsp--;

            adaptor.addChild(root_0, listInst202.getTree());

            char_literal203=(Token)match(input,113,FOLLOW_113_in_if_stmt2606); 

            // src/parser/Music.g:196:55: ( elseif_stmt )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==ELSE) ) {
                    int LA35_1 = input.LA(2);

                    if ( (LA35_1==IF) ) {
                        alt35=1;
                    }


                }


                switch (alt35) {
            	case 1 :
            	    // src/parser/Music.g:196:55: elseif_stmt
            	    {
            	    pushFollow(FOLLOW_elseif_stmt_in_if_stmt2609);
            	    elseif_stmt204=elseif_stmt();

            	    state._fsp--;

            	    adaptor.addChild(root_0, elseif_stmt204.getTree());

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


            // src/parser/Music.g:196:68: ( else_stmt )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==ELSE) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // src/parser/Music.g:196:68: else_stmt
                    {
                    pushFollow(FOLLOW_else_stmt_in_if_stmt2612);
                    else_stmt205=else_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, else_stmt205.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "if_stmt"


    public static class elseif_stmt_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "elseif_stmt"
    // src/parser/Music.g:199:1: elseif_stmt : ELSE IF '(' expr ')' '{' listInst '}' -> ^( ELSEIF expr listInst ) ;
    public final MusicParser.elseif_stmt_return elseif_stmt() throws RecognitionException {
        MusicParser.elseif_stmt_return retval = new MusicParser.elseif_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token ELSE206=null;
        Token IF207=null;
        Token char_literal208=null;
        Token char_literal210=null;
        Token char_literal211=null;
        Token char_literal213=null;
        MusicParser.expr_return expr209 =null;

        MusicParser.listInst_return listInst212 =null;


        AmlTree ELSE206_tree=null;
        AmlTree IF207_tree=null;
        AmlTree char_literal208_tree=null;
        AmlTree char_literal210_tree=null;
        AmlTree char_literal211_tree=null;
        AmlTree char_literal213_tree=null;
        RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_103=new RewriteRuleTokenStream(adaptor,"token 103");
        RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_listInst=new RewriteRuleSubtreeStream(adaptor,"rule listInst");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // src/parser/Music.g:199:13: ( ELSE IF '(' expr ')' '{' listInst '}' -> ^( ELSEIF expr listInst ) )
            // src/parser/Music.g:199:17: ELSE IF '(' expr ')' '{' listInst '}'
            {
            ELSE206=(Token)match(input,ELSE,FOLLOW_ELSE_in_elseif_stmt2636);  
            stream_ELSE.add(ELSE206);


            IF207=(Token)match(input,IF,FOLLOW_IF_in_elseif_stmt2638);  
            stream_IF.add(IF207);


            char_literal208=(Token)match(input,102,FOLLOW_102_in_elseif_stmt2640);  
            stream_102.add(char_literal208);


            pushFollow(FOLLOW_expr_in_elseif_stmt2642);
            expr209=expr();

            state._fsp--;

            stream_expr.add(expr209.getTree());

            char_literal210=(Token)match(input,103,FOLLOW_103_in_elseif_stmt2644);  
            stream_103.add(char_literal210);


            char_literal211=(Token)match(input,112,FOLLOW_112_in_elseif_stmt2646);  
            stream_112.add(char_literal211);


            pushFollow(FOLLOW_listInst_in_elseif_stmt2648);
            listInst212=listInst();

            state._fsp--;

            stream_listInst.add(listInst212.getTree());

            char_literal213=(Token)match(input,113,FOLLOW_113_in_elseif_stmt2650);  
            stream_113.add(char_literal213);


            // AST REWRITE
            // elements: expr, listInst
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AmlTree)adaptor.nil();
            // 199:55: -> ^( ELSEIF expr listInst )
            {
                // src/parser/Music.g:199:58: ^( ELSEIF expr listInst )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(ELSEIF, "ELSEIF")
                , root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());

                adaptor.addChild(root_1, stream_listInst.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "elseif_stmt"


    public static class else_stmt_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "else_stmt"
    // src/parser/Music.g:202:1: else_stmt : ELSE ^ '{' ! listInst '}' !;
    public final MusicParser.else_stmt_return else_stmt() throws RecognitionException {
        MusicParser.else_stmt_return retval = new MusicParser.else_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token ELSE214=null;
        Token char_literal215=null;
        Token char_literal217=null;
        MusicParser.listInst_return listInst216 =null;


        AmlTree ELSE214_tree=null;
        AmlTree char_literal215_tree=null;
        AmlTree char_literal217_tree=null;

        try {
            // src/parser/Music.g:202:13: ( ELSE ^ '{' ! listInst '}' !)
            // src/parser/Music.g:202:17: ELSE ^ '{' ! listInst '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            ELSE214=(Token)match(input,ELSE,FOLLOW_ELSE_in_else_stmt2685); 
            ELSE214_tree = 
            (AmlTree)adaptor.create(ELSE214)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(ELSE214_tree, root_0);


            char_literal215=(Token)match(input,112,FOLLOW_112_in_else_stmt2688); 

            pushFollow(FOLLOW_listInst_in_else_stmt2691);
            listInst216=listInst();

            state._fsp--;

            adaptor.addChild(root_0, listInst216.getTree());

            char_literal217=(Token)match(input,113,FOLLOW_113_in_else_stmt2693); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "else_stmt"


    public static class if_music_stmt_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "if_music_stmt"
    // src/parser/Music.g:205:1: if_music_stmt : IF ^ '(' ! expr ')' ! '{' ! list_music_inst '}' ! ( elseif_music_stmt )* ( else_music_stmt )? ;
    public final MusicParser.if_music_stmt_return if_music_stmt() throws RecognitionException {
        MusicParser.if_music_stmt_return retval = new MusicParser.if_music_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token IF218=null;
        Token char_literal219=null;
        Token char_literal221=null;
        Token char_literal222=null;
        Token char_literal224=null;
        MusicParser.expr_return expr220 =null;

        MusicParser.list_music_inst_return list_music_inst223 =null;

        MusicParser.elseif_music_stmt_return elseif_music_stmt225 =null;

        MusicParser.else_music_stmt_return else_music_stmt226 =null;


        AmlTree IF218_tree=null;
        AmlTree char_literal219_tree=null;
        AmlTree char_literal221_tree=null;
        AmlTree char_literal222_tree=null;
        AmlTree char_literal224_tree=null;

        try {
            // src/parser/Music.g:205:17: ( IF ^ '(' ! expr ')' ! '{' ! list_music_inst '}' ! ( elseif_music_stmt )* ( else_music_stmt )? )
            // src/parser/Music.g:205:21: IF ^ '(' ! expr ')' ! '{' ! list_music_inst '}' ! ( elseif_music_stmt )* ( else_music_stmt )?
            {
            root_0 = (AmlTree)adaptor.nil();


            IF218=(Token)match(input,IF,FOLLOW_IF_in_if_music_stmt2719); 
            IF218_tree = 
            (AmlTree)adaptor.create(IF218)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(IF218_tree, root_0);


            char_literal219=(Token)match(input,102,FOLLOW_102_in_if_music_stmt2722); 

            pushFollow(FOLLOW_expr_in_if_music_stmt2725);
            expr220=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr220.getTree());

            char_literal221=(Token)match(input,103,FOLLOW_103_in_if_music_stmt2727); 

            char_literal222=(Token)match(input,112,FOLLOW_112_in_if_music_stmt2730); 

            pushFollow(FOLLOW_list_music_inst_in_if_music_stmt2733);
            list_music_inst223=list_music_inst();

            state._fsp--;

            adaptor.addChild(root_0, list_music_inst223.getTree());

            char_literal224=(Token)match(input,113,FOLLOW_113_in_if_music_stmt2735); 

            // src/parser/Music.g:205:66: ( elseif_music_stmt )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==ELSE) ) {
                    int LA37_1 = input.LA(2);

                    if ( (LA37_1==IF) ) {
                        alt37=1;
                    }


                }


                switch (alt37) {
            	case 1 :
            	    // src/parser/Music.g:205:66: elseif_music_stmt
            	    {
            	    pushFollow(FOLLOW_elseif_music_stmt_in_if_music_stmt2738);
            	    elseif_music_stmt225=elseif_music_stmt();

            	    state._fsp--;

            	    adaptor.addChild(root_0, elseif_music_stmt225.getTree());

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);


            // src/parser/Music.g:205:85: ( else_music_stmt )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==ELSE) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // src/parser/Music.g:205:85: else_music_stmt
                    {
                    pushFollow(FOLLOW_else_music_stmt_in_if_music_stmt2741);
                    else_music_stmt226=else_music_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, else_music_stmt226.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "if_music_stmt"


    public static class elseif_music_stmt_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "elseif_music_stmt"
    // src/parser/Music.g:208:1: elseif_music_stmt : ELSE IF '(' expr ')' '{' list_music_inst '}' -> ^( ELSEIF expr list_music_inst ) ;
    public final MusicParser.elseif_music_stmt_return elseif_music_stmt() throws RecognitionException {
        MusicParser.elseif_music_stmt_return retval = new MusicParser.elseif_music_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token ELSE227=null;
        Token IF228=null;
        Token char_literal229=null;
        Token char_literal231=null;
        Token char_literal232=null;
        Token char_literal234=null;
        MusicParser.expr_return expr230 =null;

        MusicParser.list_music_inst_return list_music_inst233 =null;


        AmlTree ELSE227_tree=null;
        AmlTree IF228_tree=null;
        AmlTree char_literal229_tree=null;
        AmlTree char_literal231_tree=null;
        AmlTree char_literal232_tree=null;
        AmlTree char_literal234_tree=null;
        RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_103=new RewriteRuleTokenStream(adaptor,"token 103");
        RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_list_music_inst=new RewriteRuleSubtreeStream(adaptor,"rule list_music_inst");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // src/parser/Music.g:208:21: ( ELSE IF '(' expr ')' '{' list_music_inst '}' -> ^( ELSEIF expr list_music_inst ) )
            // src/parser/Music.g:208:25: ELSE IF '(' expr ')' '{' list_music_inst '}'
            {
            ELSE227=(Token)match(input,ELSE,FOLLOW_ELSE_in_elseif_music_stmt2771);  
            stream_ELSE.add(ELSE227);


            IF228=(Token)match(input,IF,FOLLOW_IF_in_elseif_music_stmt2773);  
            stream_IF.add(IF228);


            char_literal229=(Token)match(input,102,FOLLOW_102_in_elseif_music_stmt2775);  
            stream_102.add(char_literal229);


            pushFollow(FOLLOW_expr_in_elseif_music_stmt2777);
            expr230=expr();

            state._fsp--;

            stream_expr.add(expr230.getTree());

            char_literal231=(Token)match(input,103,FOLLOW_103_in_elseif_music_stmt2779);  
            stream_103.add(char_literal231);


            char_literal232=(Token)match(input,112,FOLLOW_112_in_elseif_music_stmt2781);  
            stream_112.add(char_literal232);


            pushFollow(FOLLOW_list_music_inst_in_elseif_music_stmt2783);
            list_music_inst233=list_music_inst();

            state._fsp--;

            stream_list_music_inst.add(list_music_inst233.getTree());

            char_literal234=(Token)match(input,113,FOLLOW_113_in_elseif_music_stmt2785);  
            stream_113.add(char_literal234);


            // AST REWRITE
            // elements: list_music_inst, expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AmlTree)adaptor.nil();
            // 208:70: -> ^( ELSEIF expr list_music_inst )
            {
                // src/parser/Music.g:208:73: ^( ELSEIF expr list_music_inst )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(ELSEIF, "ELSEIF")
                , root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());

                adaptor.addChild(root_1, stream_list_music_inst.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "elseif_music_stmt"


    public static class else_music_stmt_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "else_music_stmt"
    // src/parser/Music.g:211:1: else_music_stmt : ELSE ^ '{' ! list_music_inst '}' !;
    public final MusicParser.else_music_stmt_return else_music_stmt() throws RecognitionException {
        MusicParser.else_music_stmt_return retval = new MusicParser.else_music_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token ELSE235=null;
        Token char_literal236=null;
        Token char_literal238=null;
        MusicParser.list_music_inst_return list_music_inst237 =null;


        AmlTree ELSE235_tree=null;
        AmlTree char_literal236_tree=null;
        AmlTree char_literal238_tree=null;

        try {
            // src/parser/Music.g:211:17: ( ELSE ^ '{' ! list_music_inst '}' !)
            // src/parser/Music.g:211:21: ELSE ^ '{' ! list_music_inst '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            ELSE235=(Token)match(input,ELSE,FOLLOW_ELSE_in_else_music_stmt2826); 
            ELSE235_tree = 
            (AmlTree)adaptor.create(ELSE235)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(ELSE235_tree, root_0);


            char_literal236=(Token)match(input,112,FOLLOW_112_in_else_music_stmt2829); 

            pushFollow(FOLLOW_list_music_inst_in_else_music_stmt2832);
            list_music_inst237=list_music_inst();

            state._fsp--;

            adaptor.addChild(root_0, list_music_inst237.getTree());

            char_literal238=(Token)match(input,113,FOLLOW_113_in_else_music_stmt2834); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "else_music_stmt"


    public static class song_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "song"
    // src/parser/Music.g:214:1: song : SONG ^ ( id_rule )? '{' ! ( beat ';' !)? ( speed ';' !)? ( tone ';' !)? ( transport ';' !)? ( track )+ ( drums_track )? '}' !;
    public final MusicParser.song_return song() throws RecognitionException {
        MusicParser.song_return retval = new MusicParser.song_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token SONG239=null;
        Token char_literal241=null;
        Token char_literal243=null;
        Token char_literal245=null;
        Token char_literal247=null;
        Token char_literal249=null;
        Token char_literal252=null;
        MusicParser.id_rule_return id_rule240 =null;

        MusicParser.beat_return beat242 =null;

        MusicParser.speed_return speed244 =null;

        MusicParser.tone_return tone246 =null;

        MusicParser.transport_return transport248 =null;

        MusicParser.track_return track250 =null;

        MusicParser.drums_track_return drums_track251 =null;


        AmlTree SONG239_tree=null;
        AmlTree char_literal241_tree=null;
        AmlTree char_literal243_tree=null;
        AmlTree char_literal245_tree=null;
        AmlTree char_literal247_tree=null;
        AmlTree char_literal249_tree=null;
        AmlTree char_literal252_tree=null;

        try {
            // src/parser/Music.g:214:13: ( SONG ^ ( id_rule )? '{' ! ( beat ';' !)? ( speed ';' !)? ( tone ';' !)? ( transport ';' !)? ( track )+ ( drums_track )? '}' !)
            // src/parser/Music.g:214:17: SONG ^ ( id_rule )? '{' ! ( beat ';' !)? ( speed ';' !)? ( tone ';' !)? ( transport ';' !)? ( track )+ ( drums_track )? '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            SONG239=(Token)match(input,SONG,FOLLOW_SONG_in_song2869); 
            SONG239_tree = 
            (AmlTree)adaptor.create(SONG239)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(SONG239_tree, root_0);


            // src/parser/Music.g:214:23: ( id_rule )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==ID_||LA39_0==LETTER_X) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // src/parser/Music.g:214:23: id_rule
                    {
                    pushFollow(FOLLOW_id_rule_in_song2872);
                    id_rule240=id_rule();

                    state._fsp--;

                    adaptor.addChild(root_0, id_rule240.getTree());

                    }
                    break;

            }


            char_literal241=(Token)match(input,112,FOLLOW_112_in_song2875); 

            // src/parser/Music.g:214:37: ( beat ';' !)?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==BEAT) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // src/parser/Music.g:214:38: beat ';' !
                    {
                    pushFollow(FOLLOW_beat_in_song2879);
                    beat242=beat();

                    state._fsp--;

                    adaptor.addChild(root_0, beat242.getTree());

                    char_literal243=(Token)match(input,107,FOLLOW_107_in_song2881); 

                    }
                    break;

            }


            // src/parser/Music.g:214:50: ( speed ';' !)?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==SPEED) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // src/parser/Music.g:214:51: speed ';' !
                    {
                    pushFollow(FOLLOW_speed_in_song2887);
                    speed244=speed();

                    state._fsp--;

                    adaptor.addChild(root_0, speed244.getTree());

                    char_literal245=(Token)match(input,107,FOLLOW_107_in_song2889); 

                    }
                    break;

            }


            // src/parser/Music.g:214:64: ( tone ';' !)?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==TONE) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // src/parser/Music.g:214:65: tone ';' !
                    {
                    pushFollow(FOLLOW_tone_in_song2895);
                    tone246=tone();

                    state._fsp--;

                    adaptor.addChild(root_0, tone246.getTree());

                    char_literal247=(Token)match(input,107,FOLLOW_107_in_song2897); 

                    }
                    break;

            }


            // src/parser/Music.g:214:77: ( transport ';' !)?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==TRANSPORT) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // src/parser/Music.g:214:78: transport ';' !
                    {
                    pushFollow(FOLLOW_transport_in_song2903);
                    transport248=transport();

                    state._fsp--;

                    adaptor.addChild(root_0, transport248.getTree());

                    char_literal249=(Token)match(input,107,FOLLOW_107_in_song2905); 

                    }
                    break;

            }


            // src/parser/Music.g:214:96: ( track )+
            int cnt44=0;
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==TRACK) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // src/parser/Music.g:214:97: track
            	    {
            	    pushFollow(FOLLOW_track_in_song2912);
            	    track250=track();

            	    state._fsp--;

            	    adaptor.addChild(root_0, track250.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt44 >= 1 ) break loop44;
                        EarlyExitException eee =
                            new EarlyExitException(44, input);
                        throw eee;
                }
                cnt44++;
            } while (true);


            // src/parser/Music.g:214:105: ( drums_track )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==DRUMS) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // src/parser/Music.g:214:105: drums_track
                    {
                    pushFollow(FOLLOW_drums_track_in_song2916);
                    drums_track251=drums_track();

                    state._fsp--;

                    adaptor.addChild(root_0, drums_track251.getTree());

                    }
                    break;

            }


            char_literal252=(Token)match(input,113,FOLLOW_113_in_song2919); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "song"


    public static class track_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "track"
    // src/parser/Music.g:217:1: track : TRACK ^ ( id_rule !)? ( STRING )? compas_aux ;
    public final MusicParser.track_return track() throws RecognitionException {
        MusicParser.track_return retval = new MusicParser.track_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token TRACK253=null;
        Token STRING255=null;
        MusicParser.id_rule_return id_rule254 =null;

        MusicParser.compas_aux_return compas_aux256 =null;


        AmlTree TRACK253_tree=null;
        AmlTree STRING255_tree=null;

        try {
            // src/parser/Music.g:217:13: ( TRACK ^ ( id_rule !)? ( STRING )? compas_aux )
            // src/parser/Music.g:217:17: TRACK ^ ( id_rule !)? ( STRING )? compas_aux
            {
            root_0 = (AmlTree)adaptor.nil();


            TRACK253=(Token)match(input,TRACK,FOLLOW_TRACK_in_track2949); 
            TRACK253_tree = 
            (AmlTree)adaptor.create(TRACK253)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(TRACK253_tree, root_0);


            // src/parser/Music.g:217:31: ( id_rule !)?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==ID_||LA46_0==LETTER_X) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // src/parser/Music.g:217:31: id_rule !
                    {
                    pushFollow(FOLLOW_id_rule_in_track2952);
                    id_rule254=id_rule();

                    state._fsp--;


                    }
                    break;

            }


            // src/parser/Music.g:217:34: ( STRING )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==STRING) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // src/parser/Music.g:217:34: STRING
                    {
                    STRING255=(Token)match(input,STRING,FOLLOW_STRING_in_track2956); 
                    STRING255_tree = 
                    (AmlTree)adaptor.create(STRING255)
                    ;
                    adaptor.addChild(root_0, STRING255_tree);


                    }
                    break;

            }


            pushFollow(FOLLOW_compas_aux_in_track2959);
            compas_aux256=compas_aux();

            state._fsp--;

            adaptor.addChild(root_0, compas_aux256.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "track"


    public static class drums_track_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "drums_track"
    // src/parser/Music.g:220:1: drums_track : DRUMS ^ compas_aux ;
    public final MusicParser.drums_track_return drums_track() throws RecognitionException {
        MusicParser.drums_track_return retval = new MusicParser.drums_track_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token DRUMS257=null;
        MusicParser.compas_aux_return compas_aux258 =null;


        AmlTree DRUMS257_tree=null;

        try {
            // src/parser/Music.g:220:13: ( DRUMS ^ compas_aux )
            // src/parser/Music.g:220:17: DRUMS ^ compas_aux
            {
            root_0 = (AmlTree)adaptor.nil();


            DRUMS257=(Token)match(input,DRUMS,FOLLOW_DRUMS_in_drums_track2982); 
            DRUMS257_tree = 
            (AmlTree)adaptor.create(DRUMS257)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(DRUMS257_tree, root_0);


            pushFollow(FOLLOW_compas_aux_in_drums_track2985);
            compas_aux258=compas_aux();

            state._fsp--;

            adaptor.addChild(root_0, compas_aux258.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "drums_track"


    public static class compas_aux_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "compas_aux"
    // src/parser/Music.g:223:1: compas_aux : compas_list -> ^( COMPAS_LIST compas_list ) ;
    public final MusicParser.compas_aux_return compas_aux() throws RecognitionException {
        MusicParser.compas_aux_return retval = new MusicParser.compas_aux_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        MusicParser.compas_list_return compas_list259 =null;


        RewriteRuleSubtreeStream stream_compas_list=new RewriteRuleSubtreeStream(adaptor,"rule compas_list");
        try {
            // src/parser/Music.g:223:13: ( compas_list -> ^( COMPAS_LIST compas_list ) )
            // src/parser/Music.g:223:17: compas_list
            {
            pushFollow(FOLLOW_compas_list_in_compas_aux3009);
            compas_list259=compas_list();

            state._fsp--;

            stream_compas_list.add(compas_list259.getTree());

            // AST REWRITE
            // elements: compas_list
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AmlTree)adaptor.nil();
            // 223:29: -> ^( COMPAS_LIST compas_list )
            {
                // src/parser/Music.g:223:32: ^( COMPAS_LIST compas_list )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(COMPAS_LIST, "COMPAS_LIST")
                , root_1);

                adaptor.addChild(root_1, stream_compas_list.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "compas_aux"


    public static class compas_list_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "compas_list"
    // src/parser/Music.g:226:1: compas_list : ( DOUBLE_BAR !| repetition ) compas_or_repetition ( DOUBLE_BAR !) ;
    public final MusicParser.compas_list_return compas_list() throws RecognitionException {
        MusicParser.compas_list_return retval = new MusicParser.compas_list_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token DOUBLE_BAR260=null;
        Token DOUBLE_BAR263=null;
        MusicParser.repetition_return repetition261 =null;

        MusicParser.compas_or_repetition_return compas_or_repetition262 =null;


        AmlTree DOUBLE_BAR260_tree=null;
        AmlTree DOUBLE_BAR263_tree=null;

        try {
            // src/parser/Music.g:226:13: ( ( DOUBLE_BAR !| repetition ) compas_or_repetition ( DOUBLE_BAR !) )
            // src/parser/Music.g:226:15: ( DOUBLE_BAR !| repetition ) compas_or_repetition ( DOUBLE_BAR !)
            {
            root_0 = (AmlTree)adaptor.nil();


            // src/parser/Music.g:226:15: ( DOUBLE_BAR !| repetition )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==DOUBLE_BAR) ) {
                alt48=1;
            }
            else if ( (LA48_0==POS_NUM||LA48_0==START_REPETITION) ) {
                alt48=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;

            }
            switch (alt48) {
                case 1 :
                    // src/parser/Music.g:226:16: DOUBLE_BAR !
                    {
                    DOUBLE_BAR260=(Token)match(input,DOUBLE_BAR,FOLLOW_DOUBLE_BAR_in_compas_list3039); 

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:226:30: repetition
                    {
                    pushFollow(FOLLOW_repetition_in_compas_list3044);
                    repetition261=repetition();

                    state._fsp--;

                    adaptor.addChild(root_0, repetition261.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_compas_or_repetition_in_compas_list3047);
            compas_or_repetition262=compas_or_repetition();

            state._fsp--;

            adaptor.addChild(root_0, compas_or_repetition262.getTree());

            // src/parser/Music.g:226:63: ( DOUBLE_BAR !)
            // src/parser/Music.g:226:64: DOUBLE_BAR !
            {
            DOUBLE_BAR263=(Token)match(input,DOUBLE_BAR,FOLLOW_DOUBLE_BAR_in_compas_list3050); 

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "compas_list"


    public static class compasses_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "compasses"
    // src/parser/Music.g:229:1: compasses : compas ( BAR ! compas )* ;
    public final MusicParser.compasses_return compasses() throws RecognitionException {
        MusicParser.compasses_return retval = new MusicParser.compasses_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token BAR265=null;
        MusicParser.compas_return compas264 =null;

        MusicParser.compas_return compas266 =null;


        AmlTree BAR265_tree=null;

        try {
            // src/parser/Music.g:229:13: ( compas ( BAR ! compas )* )
            // src/parser/Music.g:229:17: compas ( BAR ! compas )*
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_compas_in_compasses3077);
            compas264=compas();

            state._fsp--;

            adaptor.addChild(root_0, compas264.getTree());

            // src/parser/Music.g:229:24: ( BAR ! compas )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==BAR) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // src/parser/Music.g:229:25: BAR ! compas
            	    {
            	    BAR265=(Token)match(input,BAR,FOLLOW_BAR_in_compasses3080); 

            	    pushFollow(FOLLOW_compas_in_compasses3083);
            	    compas266=compas();

            	    state._fsp--;

            	    adaptor.addChild(root_0, compas266.getTree());

            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "compasses"


    public static class repetition_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "repetition"
    // src/parser/Music.g:232:1: repetition : ( POS_NUM LETTER_X )? START_REPETITION repetition_aux END_REPETITION -> ^( REPETITION ( POS_NUM )? repetition_aux ) ;
    public final MusicParser.repetition_return repetition() throws RecognitionException {
        MusicParser.repetition_return retval = new MusicParser.repetition_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token POS_NUM267=null;
        Token LETTER_X268=null;
        Token START_REPETITION269=null;
        Token END_REPETITION271=null;
        MusicParser.repetition_aux_return repetition_aux270 =null;


        AmlTree POS_NUM267_tree=null;
        AmlTree LETTER_X268_tree=null;
        AmlTree START_REPETITION269_tree=null;
        AmlTree END_REPETITION271_tree=null;
        RewriteRuleTokenStream stream_POS_NUM=new RewriteRuleTokenStream(adaptor,"token POS_NUM");
        RewriteRuleTokenStream stream_LETTER_X=new RewriteRuleTokenStream(adaptor,"token LETTER_X");
        RewriteRuleTokenStream stream_END_REPETITION=new RewriteRuleTokenStream(adaptor,"token END_REPETITION");
        RewriteRuleTokenStream stream_START_REPETITION=new RewriteRuleTokenStream(adaptor,"token START_REPETITION");
        RewriteRuleSubtreeStream stream_repetition_aux=new RewriteRuleSubtreeStream(adaptor,"rule repetition_aux");
        try {
            // src/parser/Music.g:232:13: ( ( POS_NUM LETTER_X )? START_REPETITION repetition_aux END_REPETITION -> ^( REPETITION ( POS_NUM )? repetition_aux ) )
            // src/parser/Music.g:232:17: ( POS_NUM LETTER_X )? START_REPETITION repetition_aux END_REPETITION
            {
            // src/parser/Music.g:232:17: ( POS_NUM LETTER_X )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==POS_NUM) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // src/parser/Music.g:232:18: POS_NUM LETTER_X
                    {
                    POS_NUM267=(Token)match(input,POS_NUM,FOLLOW_POS_NUM_in_repetition3110);  
                    stream_POS_NUM.add(POS_NUM267);


                    LETTER_X268=(Token)match(input,LETTER_X,FOLLOW_LETTER_X_in_repetition3112);  
                    stream_LETTER_X.add(LETTER_X268);


                    }
                    break;

            }


            START_REPETITION269=(Token)match(input,START_REPETITION,FOLLOW_START_REPETITION_in_repetition3116);  
            stream_START_REPETITION.add(START_REPETITION269);


            pushFollow(FOLLOW_repetition_aux_in_repetition3118);
            repetition_aux270=repetition_aux();

            state._fsp--;

            stream_repetition_aux.add(repetition_aux270.getTree());

            END_REPETITION271=(Token)match(input,END_REPETITION,FOLLOW_END_REPETITION_in_repetition3120);  
            stream_END_REPETITION.add(END_REPETITION271);


            // AST REWRITE
            // elements: repetition_aux, POS_NUM
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AmlTree)adaptor.nil();
            // 232:87: -> ^( REPETITION ( POS_NUM )? repetition_aux )
            {
                // src/parser/Music.g:232:90: ^( REPETITION ( POS_NUM )? repetition_aux )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(REPETITION, "REPETITION")
                , root_1);

                // src/parser/Music.g:232:103: ( POS_NUM )?
                if ( stream_POS_NUM.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_POS_NUM.nextNode()
                    );

                }
                stream_POS_NUM.reset();

                adaptor.addChild(root_1, stream_repetition_aux.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "repetition"


    public static class repetition_aux_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "repetition_aux"
    // src/parser/Music.g:235:1: repetition_aux : compas_or_repetition -> ^( COMPAS_LIST compas_or_repetition ) ;
    public final MusicParser.repetition_aux_return repetition_aux() throws RecognitionException {
        MusicParser.repetition_aux_return retval = new MusicParser.repetition_aux_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        MusicParser.compas_or_repetition_return compas_or_repetition272 =null;


        RewriteRuleSubtreeStream stream_compas_or_repetition=new RewriteRuleSubtreeStream(adaptor,"rule compas_or_repetition");
        try {
            // src/parser/Music.g:235:16: ( compas_or_repetition -> ^( COMPAS_LIST compas_or_repetition ) )
            // src/parser/Music.g:235:18: compas_or_repetition
            {
            pushFollow(FOLLOW_compas_or_repetition_in_repetition_aux3155);
            compas_or_repetition272=compas_or_repetition();

            state._fsp--;

            stream_compas_or_repetition.add(compas_or_repetition272.getTree());

            // AST REWRITE
            // elements: compas_or_repetition
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AmlTree)adaptor.nil();
            // 235:39: -> ^( COMPAS_LIST compas_or_repetition )
            {
                // src/parser/Music.g:235:42: ^( COMPAS_LIST compas_or_repetition )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(COMPAS_LIST, "COMPAS_LIST")
                , root_1);

                adaptor.addChild(root_1, stream_compas_or_repetition.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "repetition_aux"


    public static class compas_or_repetition_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "compas_or_repetition"
    // src/parser/Music.g:237:1: compas_or_repetition : ( compasses | repetition )* ;
    public final MusicParser.compas_or_repetition_return compas_or_repetition() throws RecognitionException {
        MusicParser.compas_or_repetition_return retval = new MusicParser.compas_or_repetition_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        MusicParser.compasses_return compasses273 =null;

        MusicParser.repetition_return repetition274 =null;



        try {
            // src/parser/Music.g:237:22: ( ( compasses | repetition )* )
            // src/parser/Music.g:237:24: ( compasses | repetition )*
            {
            root_0 = (AmlTree)adaptor.nil();


            // src/parser/Music.g:237:24: ( compasses | repetition )*
            loop51:
            do {
                int alt51=3;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==ARMOR||(LA51_0 >= BEAT && LA51_0 <= BOOL)||LA51_0==CHORD||LA51_0==DECR||LA51_0==DN||LA51_0==DRUMS_NOTE_TYPE||(LA51_0 >= FIGURE_TYPE && LA51_0 <= FOR)||(LA51_0 >= ID_ && LA51_0 <= INT)||LA51_0==LETTER_X||LA51_0==NOTE||LA51_0==NOTE_TYPE||LA51_0==READ||LA51_0==SPEED||(LA51_0 >= STRING_TYPE && LA51_0 <= SUSTAIN)||LA51_0==TONE||LA51_0==TRANSPORT||(LA51_0 >= VOLUME && LA51_0 <= WRITE)||LA51_0==102||LA51_0==106||LA51_0==108||LA51_0==110) ) {
                    alt51=1;
                }
                else if ( (LA51_0==POS_NUM||LA51_0==START_REPETITION) ) {
                    alt51=2;
                }


                switch (alt51) {
            	case 1 :
            	    // src/parser/Music.g:237:25: compasses
            	    {
            	    pushFollow(FOLLOW_compasses_in_compas_or_repetition3172);
            	    compasses273=compasses();

            	    state._fsp--;

            	    adaptor.addChild(root_0, compasses273.getTree());

            	    }
            	    break;
            	case 2 :
            	    // src/parser/Music.g:237:37: repetition
            	    {
            	    pushFollow(FOLLOW_repetition_in_compas_or_repetition3176);
            	    repetition274=repetition();

            	    state._fsp--;

            	    adaptor.addChild(root_0, repetition274.getTree());

            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "compas_or_repetition"


    public static class compas_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "compas"
    // src/parser/Music.g:239:1: compas : ( options {greedy=true; } : music_inst )+ -> ^( COMPAS ( music_inst )+ ) ;
    public final MusicParser.compas_return compas() throws RecognitionException {
        MusicParser.compas_return retval = new MusicParser.compas_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        MusicParser.music_inst_return music_inst275 =null;


        RewriteRuleSubtreeStream stream_music_inst=new RewriteRuleSubtreeStream(adaptor,"rule music_inst");
        try {
            // src/parser/Music.g:239:13: ( ( options {greedy=true; } : music_inst )+ -> ^( COMPAS ( music_inst )+ ) )
            // src/parser/Music.g:239:16: ( options {greedy=true; } : music_inst )+
            {
            // src/parser/Music.g:239:16: ( options {greedy=true; } : music_inst )+
            int cnt52=0;
            loop52:
            do {
                int alt52=2;
                switch ( input.LA(1) ) {
                case CHORD:
                    {
                    alt52=1;
                    }
                    break;
                case READ:
                    {
                    alt52=1;
                    }
                    break;
                case WRITE:
                    {
                    alt52=1;
                    }
                    break;
                case VOLUME:
                    {
                    alt52=1;
                    }
                    break;
                case TONE:
                    {
                    alt52=1;
                    }
                    break;
                case BEAT:
                    {
                    alt52=1;
                    }
                    break;
                case SPEED:
                    {
                    alt52=1;
                    }
                    break;
                case INSTRUMENT:
                    {
                    alt52=1;
                    }
                    break;
                case TRANSPORT:
                    {
                    alt52=1;
                    }
                    break;
                case ID_:
                    {
                    alt52=1;
                    }
                    break;
                case LETTER_X:
                    {
                    alt52=1;
                    }
                    break;
                case INCR:
                    {
                    alt52=1;
                    }
                    break;
                case DECR:
                    {
                    alt52=1;
                    }
                    break;
                case WHILE:
                    {
                    alt52=1;
                    }
                    break;
                case 108:
                    {
                    alt52=1;
                    }
                    break;
                case FOR:
                    {
                    alt52=1;
                    }
                    break;
                case IF:
                    {
                    alt52=1;
                    }
                    break;
                case BOOL:
                case DRUMS_NOTE_TYPE:
                case FIGURE_TYPE:
                case INT:
                case NOTE_TYPE:
                case STRING_TYPE:
                    {
                    alt52=1;
                    }
                    break;
                case 102:
                    {
                    alt52=1;
                    }
                    break;
                case ARMOR:
                case BEMOL:
                case SUSTAIN:
                    {
                    alt52=1;
                    }
                    break;
                case NOTE:
                    {
                    alt52=1;
                    }
                    break;
                case 106:
                    {
                    alt52=1;
                    }
                    break;
                case DN:
                    {
                    alt52=1;
                    }
                    break;
                case 110:
                    {
                    alt52=1;
                    }
                    break;

                }

                switch (alt52) {
            	case 1 :
            	    // src/parser/Music.g:239:42: music_inst
            	    {
            	    pushFollow(FOLLOW_music_inst_in_compas3202);
            	    music_inst275=music_inst();

            	    state._fsp--;

            	    stream_music_inst.add(music_inst275.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt52 >= 1 ) break loop52;
                        EarlyExitException eee =
                            new EarlyExitException(52, input);
                        throw eee;
                }
                cnt52++;
            } while (true);


            // AST REWRITE
            // elements: music_inst
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AmlTree)adaptor.nil();
            // 239:58: -> ^( COMPAS ( music_inst )+ )
            {
                // src/parser/Music.g:239:61: ^( COMPAS ( music_inst )+ )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(COMPAS, "COMPAS")
                , root_1);

                if ( !(stream_music_inst.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_music_inst.hasNext() ) {
                    adaptor.addChild(root_1, stream_music_inst.nextTree());

                }
                stream_music_inst.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "compas"


    public static class tone_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "tone"
    // src/parser/Music.g:242:1: tone : TONE ^ expr ( SUSTAIN | BEMOL ) ;
    public final MusicParser.tone_return tone() throws RecognitionException {
        MusicParser.tone_return retval = new MusicParser.tone_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token TONE276=null;
        Token set278=null;
        MusicParser.expr_return expr277 =null;


        AmlTree TONE276_tree=null;
        AmlTree set278_tree=null;

        try {
            // src/parser/Music.g:242:13: ( TONE ^ expr ( SUSTAIN | BEMOL ) )
            // src/parser/Music.g:242:17: TONE ^ expr ( SUSTAIN | BEMOL )
            {
            root_0 = (AmlTree)adaptor.nil();


            TONE276=(Token)match(input,TONE,FOLLOW_TONE_in_tone3246); 
            TONE276_tree = 
            (AmlTree)adaptor.create(TONE276)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(TONE276_tree, root_0);


            pushFollow(FOLLOW_expr_in_tone3249);
            expr277=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr277.getTree());

            set278=(Token)input.LT(1);

            if ( input.LA(1)==BEMOL||input.LA(1)==SUSTAIN ) {
                input.consume();
                adaptor.addChild(root_0, 
                (AmlTree)adaptor.create(set278)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "tone"


    public static class drumsnotes_group_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "drumsnotes_group"
    // src/parser/Music.g:245:1: drumsnotes_group : drumsnotes ( '.' ( FIGURE_NAME ( POS_NUM )? ) ( DOT )? )? ( TIE )? -> ^( DRUM_FIGURE drumsnotes ( FIGURE_NAME )? ( DOT )? ( TIE )? ) ;
    public final MusicParser.drumsnotes_group_return drumsnotes_group() throws RecognitionException {
        MusicParser.drumsnotes_group_return retval = new MusicParser.drumsnotes_group_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal280=null;
        Token FIGURE_NAME281=null;
        Token POS_NUM282=null;
        Token DOT283=null;
        Token TIE284=null;
        MusicParser.drumsnotes_return drumsnotes279 =null;


        AmlTree char_literal280_tree=null;
        AmlTree FIGURE_NAME281_tree=null;
        AmlTree POS_NUM282_tree=null;
        AmlTree DOT283_tree=null;
        AmlTree TIE284_tree=null;
        RewriteRuleTokenStream stream_POS_NUM=new RewriteRuleTokenStream(adaptor,"token POS_NUM");
        RewriteRuleTokenStream stream_FIGURE_NAME=new RewriteRuleTokenStream(adaptor,"token FIGURE_NAME");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_105=new RewriteRuleTokenStream(adaptor,"token 105");
        RewriteRuleTokenStream stream_TIE=new RewriteRuleTokenStream(adaptor,"token TIE");
        RewriteRuleSubtreeStream stream_drumsnotes=new RewriteRuleSubtreeStream(adaptor,"rule drumsnotes");
        try {
            // src/parser/Music.g:245:18: ( drumsnotes ( '.' ( FIGURE_NAME ( POS_NUM )? ) ( DOT )? )? ( TIE )? -> ^( DRUM_FIGURE drumsnotes ( FIGURE_NAME )? ( DOT )? ( TIE )? ) )
            // src/parser/Music.g:245:20: drumsnotes ( '.' ( FIGURE_NAME ( POS_NUM )? ) ( DOT )? )? ( TIE )?
            {
            pushFollow(FOLLOW_drumsnotes_in_drumsnotes_group3278);
            drumsnotes279=drumsnotes();

            state._fsp--;

            stream_drumsnotes.add(drumsnotes279.getTree());

            // src/parser/Music.g:245:31: ( '.' ( FIGURE_NAME ( POS_NUM )? ) ( DOT )? )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==105) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // src/parser/Music.g:245:32: '.' ( FIGURE_NAME ( POS_NUM )? ) ( DOT )?
                    {
                    char_literal280=(Token)match(input,105,FOLLOW_105_in_drumsnotes_group3281);  
                    stream_105.add(char_literal280);


                    // src/parser/Music.g:245:36: ( FIGURE_NAME ( POS_NUM )? )
                    // src/parser/Music.g:245:37: FIGURE_NAME ( POS_NUM )?
                    {
                    FIGURE_NAME281=(Token)match(input,FIGURE_NAME,FOLLOW_FIGURE_NAME_in_drumsnotes_group3284);  
                    stream_FIGURE_NAME.add(FIGURE_NAME281);


                    // src/parser/Music.g:245:49: ( POS_NUM )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==POS_NUM) ) {
                        int LA53_1 = input.LA(2);

                        if ( (LA53_1==LETTER_X) ) {
                            int LA53_3 = input.LA(3);

                            if ( (LA53_3==ASSIG||LA53_3==DECR||LA53_3==DIVIDE_ASSIG||LA53_3==INCR||LA53_3==MINUS_ASSIG||LA53_3==MOD_ASSIG||LA53_3==PLUS_ASSIG||LA53_3==PROD_ASSIG||LA53_3==102||LA53_3==105) ) {
                                alt53=1;
                            }
                        }
                        else if ( (LA53_1==ARMOR||(LA53_1 >= BAR && LA53_1 <= BOOL)||LA53_1==CHORD||LA53_1==DECR||(LA53_1 >= DN && LA53_1 <= DOUBLE_BAR)||LA53_1==DRUMS_NOTE_TYPE||LA53_1==END_REPETITION||(LA53_1 >= FIGURE_TYPE && LA53_1 <= FOR)||(LA53_1 >= ID_ && LA53_1 <= INT)||LA53_1==NOTE||LA53_1==NOTE_TYPE||LA53_1==POS_NUM||LA53_1==READ||(LA53_1 >= SPEED && LA53_1 <= START_REPETITION)||(LA53_1 >= STRING_TYPE && LA53_1 <= TONE)||LA53_1==TRANSPORT||(LA53_1 >= VOLUME && LA53_1 <= WRITE)||LA53_1==102||(LA53_1 >= 106 && LA53_1 <= 108)||LA53_1==110||LA53_1==113) ) {
                            alt53=1;
                        }
                    }
                    switch (alt53) {
                        case 1 :
                            // src/parser/Music.g:245:49: POS_NUM
                            {
                            POS_NUM282=(Token)match(input,POS_NUM,FOLLOW_POS_NUM_in_drumsnotes_group3286);  
                            stream_POS_NUM.add(POS_NUM282);


                            }
                            break;

                    }


                    }


                    // src/parser/Music.g:245:59: ( DOT )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==DOT) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // src/parser/Music.g:245:59: DOT
                            {
                            DOT283=(Token)match(input,DOT,FOLLOW_DOT_in_drumsnotes_group3290);  
                            stream_DOT.add(DOT283);


                            }
                            break;

                    }


                    }
                    break;

            }


            // src/parser/Music.g:245:66: ( TIE )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==TIE) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // src/parser/Music.g:245:66: TIE
                    {
                    TIE284=(Token)match(input,TIE,FOLLOW_TIE_in_drumsnotes_group3295);  
                    stream_TIE.add(TIE284);


                    }
                    break;

            }


            // AST REWRITE
            // elements: FIGURE_NAME, DOT, drumsnotes, TIE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AmlTree)adaptor.nil();
            // 245:71: -> ^( DRUM_FIGURE drumsnotes ( FIGURE_NAME )? ( DOT )? ( TIE )? )
            {
                // src/parser/Music.g:245:74: ^( DRUM_FIGURE drumsnotes ( FIGURE_NAME )? ( DOT )? ( TIE )? )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(DRUM_FIGURE, "DRUM_FIGURE")
                , root_1);

                adaptor.addChild(root_1, stream_drumsnotes.nextTree());

                // src/parser/Music.g:245:99: ( FIGURE_NAME )?
                if ( stream_FIGURE_NAME.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_FIGURE_NAME.nextNode()
                    );

                }
                stream_FIGURE_NAME.reset();

                // src/parser/Music.g:245:112: ( DOT )?
                if ( stream_DOT.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_DOT.nextNode()
                    );

                }
                stream_DOT.reset();

                // src/parser/Music.g:245:117: ( TIE )?
                if ( stream_TIE.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_TIE.nextNode()
                    );

                }
                stream_TIE.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "drumsnotes_group"


    public static class notes_group_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "notes_group"
    // src/parser/Music.g:248:1: notes_group : ( notes_type ( '.' ( FIGURE_NAME ( POS_NUM )? ) ( DOT )? )? ( TIE )? -> ^( FIGURE notes_type ( FIGURE_NAME )? ( DOT )? ( TIE )? ) | ':' ! id_rule );
    public final MusicParser.notes_group_return notes_group() throws RecognitionException {
        MusicParser.notes_group_return retval = new MusicParser.notes_group_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal286=null;
        Token FIGURE_NAME287=null;
        Token POS_NUM288=null;
        Token DOT289=null;
        Token TIE290=null;
        Token char_literal291=null;
        MusicParser.notes_type_return notes_type285 =null;

        MusicParser.id_rule_return id_rule292 =null;


        AmlTree char_literal286_tree=null;
        AmlTree FIGURE_NAME287_tree=null;
        AmlTree POS_NUM288_tree=null;
        AmlTree DOT289_tree=null;
        AmlTree TIE290_tree=null;
        AmlTree char_literal291_tree=null;
        RewriteRuleTokenStream stream_POS_NUM=new RewriteRuleTokenStream(adaptor,"token POS_NUM");
        RewriteRuleTokenStream stream_FIGURE_NAME=new RewriteRuleTokenStream(adaptor,"token FIGURE_NAME");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_105=new RewriteRuleTokenStream(adaptor,"token 105");
        RewriteRuleTokenStream stream_TIE=new RewriteRuleTokenStream(adaptor,"token TIE");
        RewriteRuleSubtreeStream stream_notes_type=new RewriteRuleSubtreeStream(adaptor,"rule notes_type");
        try {
            // src/parser/Music.g:248:13: ( notes_type ( '.' ( FIGURE_NAME ( POS_NUM )? ) ( DOT )? )? ( TIE )? -> ^( FIGURE notes_type ( FIGURE_NAME )? ( DOT )? ( TIE )? ) | ':' ! id_rule )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==ARMOR||LA61_0==BEMOL||LA61_0==CHORD||LA61_0==NOTE||LA61_0==SUSTAIN||LA61_0==102) ) {
                alt61=1;
            }
            else if ( (LA61_0==106) ) {
                alt61=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;

            }
            switch (alt61) {
                case 1 :
                    // src/parser/Music.g:248:17: notes_type ( '.' ( FIGURE_NAME ( POS_NUM )? ) ( DOT )? )? ( TIE )?
                    {
                    pushFollow(FOLLOW_notes_type_in_notes_group3336);
                    notes_type285=notes_type();

                    state._fsp--;

                    stream_notes_type.add(notes_type285.getTree());

                    // src/parser/Music.g:248:28: ( '.' ( FIGURE_NAME ( POS_NUM )? ) ( DOT )? )?
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==105) ) {
                        alt59=1;
                    }
                    switch (alt59) {
                        case 1 :
                            // src/parser/Music.g:248:29: '.' ( FIGURE_NAME ( POS_NUM )? ) ( DOT )?
                            {
                            char_literal286=(Token)match(input,105,FOLLOW_105_in_notes_group3339);  
                            stream_105.add(char_literal286);


                            // src/parser/Music.g:248:33: ( FIGURE_NAME ( POS_NUM )? )
                            // src/parser/Music.g:248:34: FIGURE_NAME ( POS_NUM )?
                            {
                            FIGURE_NAME287=(Token)match(input,FIGURE_NAME,FOLLOW_FIGURE_NAME_in_notes_group3342);  
                            stream_FIGURE_NAME.add(FIGURE_NAME287);


                            // src/parser/Music.g:248:46: ( POS_NUM )?
                            int alt57=2;
                            int LA57_0 = input.LA(1);

                            if ( (LA57_0==POS_NUM) ) {
                                int LA57_1 = input.LA(2);

                                if ( (LA57_1==LETTER_X) ) {
                                    int LA57_3 = input.LA(3);

                                    if ( (LA57_3==ASSIG||LA57_3==DECR||LA57_3==DIVIDE_ASSIG||LA57_3==INCR||LA57_3==MINUS_ASSIG||LA57_3==MOD_ASSIG||LA57_3==PLUS_ASSIG||LA57_3==PROD_ASSIG||LA57_3==102||LA57_3==105) ) {
                                        alt57=1;
                                    }
                                }
                                else if ( (LA57_1==ARMOR||(LA57_1 >= BAR && LA57_1 <= BOOL)||LA57_1==CHORD||LA57_1==DECR||(LA57_1 >= DN && LA57_1 <= DOUBLE_BAR)||LA57_1==DRUMS_NOTE_TYPE||LA57_1==END_REPETITION||(LA57_1 >= FIGURE_TYPE && LA57_1 <= FOR)||(LA57_1 >= ID_ && LA57_1 <= INT)||LA57_1==NOTE||LA57_1==NOTE_TYPE||LA57_1==POS_NUM||LA57_1==READ||(LA57_1 >= SPEED && LA57_1 <= START_REPETITION)||(LA57_1 >= STRING_TYPE && LA57_1 <= TONE)||LA57_1==TRANSPORT||(LA57_1 >= VOLUME && LA57_1 <= WRITE)||LA57_1==102||(LA57_1 >= 106 && LA57_1 <= 108)||LA57_1==110||LA57_1==113) ) {
                                    alt57=1;
                                }
                            }
                            switch (alt57) {
                                case 1 :
                                    // src/parser/Music.g:248:46: POS_NUM
                                    {
                                    POS_NUM288=(Token)match(input,POS_NUM,FOLLOW_POS_NUM_in_notes_group3344);  
                                    stream_POS_NUM.add(POS_NUM288);


                                    }
                                    break;

                            }


                            }


                            // src/parser/Music.g:248:56: ( DOT )?
                            int alt58=2;
                            int LA58_0 = input.LA(1);

                            if ( (LA58_0==DOT) ) {
                                alt58=1;
                            }
                            switch (alt58) {
                                case 1 :
                                    // src/parser/Music.g:248:56: DOT
                                    {
                                    DOT289=(Token)match(input,DOT,FOLLOW_DOT_in_notes_group3348);  
                                    stream_DOT.add(DOT289);


                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    // src/parser/Music.g:248:63: ( TIE )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==TIE) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // src/parser/Music.g:248:63: TIE
                            {
                            TIE290=(Token)match(input,TIE,FOLLOW_TIE_in_notes_group3353);  
                            stream_TIE.add(TIE290);


                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: TIE, DOT, notes_type, FIGURE_NAME
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AmlTree)adaptor.nil();
                    // 248:68: -> ^( FIGURE notes_type ( FIGURE_NAME )? ( DOT )? ( TIE )? )
                    {
                        // src/parser/Music.g:248:71: ^( FIGURE notes_type ( FIGURE_NAME )? ( DOT )? ( TIE )? )
                        {
                        AmlTree root_1 = (AmlTree)adaptor.nil();
                        root_1 = (AmlTree)adaptor.becomeRoot(
                        (AmlTree)adaptor.create(FIGURE, "FIGURE")
                        , root_1);

                        adaptor.addChild(root_1, stream_notes_type.nextTree());

                        // src/parser/Music.g:248:91: ( FIGURE_NAME )?
                        if ( stream_FIGURE_NAME.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_FIGURE_NAME.nextNode()
                            );

                        }
                        stream_FIGURE_NAME.reset();

                        // src/parser/Music.g:248:104: ( DOT )?
                        if ( stream_DOT.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_DOT.nextNode()
                            );

                        }
                        stream_DOT.reset();

                        // src/parser/Music.g:248:109: ( TIE )?
                        if ( stream_TIE.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_TIE.nextNode()
                            );

                        }
                        stream_TIE.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:249:13: ':' ! id_rule
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    char_literal291=(Token)match(input,106,FOLLOW_106_in_notes_group3385); 

                    pushFollow(FOLLOW_id_rule_in_notes_group3388);
                    id_rule292=id_rule();

                    state._fsp--;

                    adaptor.addChild(root_0, id_rule292.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "notes_group"


    public static class drumsnotes_variable_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "drumsnotes_variable"
    // src/parser/Music.g:252:1: drumsnotes_variable : drumsnotes ( '.' ( FIGURE_NAME ( POS_NUM )? ) ( DOT )? )? -> ^( DRUM_FIGURE drumsnotes ( FIGURE_NAME )? ( DOT )? ) ;
    public final MusicParser.drumsnotes_variable_return drumsnotes_variable() throws RecognitionException {
        MusicParser.drumsnotes_variable_return retval = new MusicParser.drumsnotes_variable_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal294=null;
        Token FIGURE_NAME295=null;
        Token POS_NUM296=null;
        Token DOT297=null;
        MusicParser.drumsnotes_return drumsnotes293 =null;


        AmlTree char_literal294_tree=null;
        AmlTree FIGURE_NAME295_tree=null;
        AmlTree POS_NUM296_tree=null;
        AmlTree DOT297_tree=null;
        RewriteRuleTokenStream stream_POS_NUM=new RewriteRuleTokenStream(adaptor,"token POS_NUM");
        RewriteRuleTokenStream stream_FIGURE_NAME=new RewriteRuleTokenStream(adaptor,"token FIGURE_NAME");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_105=new RewriteRuleTokenStream(adaptor,"token 105");
        RewriteRuleSubtreeStream stream_drumsnotes=new RewriteRuleSubtreeStream(adaptor,"rule drumsnotes");
        try {
            // src/parser/Music.g:252:25: ( drumsnotes ( '.' ( FIGURE_NAME ( POS_NUM )? ) ( DOT )? )? -> ^( DRUM_FIGURE drumsnotes ( FIGURE_NAME )? ( DOT )? ) )
            // src/parser/Music.g:252:29: drumsnotes ( '.' ( FIGURE_NAME ( POS_NUM )? ) ( DOT )? )?
            {
            pushFollow(FOLLOW_drumsnotes_in_drumsnotes_variable3415);
            drumsnotes293=drumsnotes();

            state._fsp--;

            stream_drumsnotes.add(drumsnotes293.getTree());

            // src/parser/Music.g:252:40: ( '.' ( FIGURE_NAME ( POS_NUM )? ) ( DOT )? )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==105) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // src/parser/Music.g:252:41: '.' ( FIGURE_NAME ( POS_NUM )? ) ( DOT )?
                    {
                    char_literal294=(Token)match(input,105,FOLLOW_105_in_drumsnotes_variable3418);  
                    stream_105.add(char_literal294);


                    // src/parser/Music.g:252:45: ( FIGURE_NAME ( POS_NUM )? )
                    // src/parser/Music.g:252:46: FIGURE_NAME ( POS_NUM )?
                    {
                    FIGURE_NAME295=(Token)match(input,FIGURE_NAME,FOLLOW_FIGURE_NAME_in_drumsnotes_variable3421);  
                    stream_FIGURE_NAME.add(FIGURE_NAME295);


                    // src/parser/Music.g:252:58: ( POS_NUM )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==POS_NUM) ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // src/parser/Music.g:252:58: POS_NUM
                            {
                            POS_NUM296=(Token)match(input,POS_NUM,FOLLOW_POS_NUM_in_drumsnotes_variable3423);  
                            stream_POS_NUM.add(POS_NUM296);


                            }
                            break;

                    }


                    }


                    // src/parser/Music.g:252:68: ( DOT )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==DOT) ) {
                        alt63=1;
                    }
                    switch (alt63) {
                        case 1 :
                            // src/parser/Music.g:252:68: DOT
                            {
                            DOT297=(Token)match(input,DOT,FOLLOW_DOT_in_drumsnotes_variable3427);  
                            stream_DOT.add(DOT297);


                            }
                            break;

                    }


                    }
                    break;

            }


            // AST REWRITE
            // elements: DOT, FIGURE_NAME, drumsnotes
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AmlTree)adaptor.nil();
            // 252:75: -> ^( DRUM_FIGURE drumsnotes ( FIGURE_NAME )? ( DOT )? )
            {
                // src/parser/Music.g:252:78: ^( DRUM_FIGURE drumsnotes ( FIGURE_NAME )? ( DOT )? )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(DRUM_FIGURE, "DRUM_FIGURE")
                , root_1);

                adaptor.addChild(root_1, stream_drumsnotes.nextTree());

                // src/parser/Music.g:252:103: ( FIGURE_NAME )?
                if ( stream_FIGURE_NAME.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_FIGURE_NAME.nextNode()
                    );

                }
                stream_FIGURE_NAME.reset();

                // src/parser/Music.g:252:116: ( DOT )?
                if ( stream_DOT.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_DOT.nextNode()
                    );

                }
                stream_DOT.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "drumsnotes_variable"


    public static class notes_variable_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "notes_variable"
    // src/parser/Music.g:255:1: notes_variable : ( notes_type ( '.' ( FIGURE_NAME ( POS_NUM )? ) ( DOT )? )? ( TIE )? -> ^( FIGURE notes_type ( FIGURE_NAME )? ( DOT )? ( TIE )? ) | 'N:' ! note );
    public final MusicParser.notes_variable_return notes_variable() throws RecognitionException {
        MusicParser.notes_variable_return retval = new MusicParser.notes_variable_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal299=null;
        Token FIGURE_NAME300=null;
        Token POS_NUM301=null;
        Token DOT302=null;
        Token TIE303=null;
        Token string_literal304=null;
        MusicParser.notes_type_return notes_type298 =null;

        MusicParser.note_return note305 =null;


        AmlTree char_literal299_tree=null;
        AmlTree FIGURE_NAME300_tree=null;
        AmlTree POS_NUM301_tree=null;
        AmlTree DOT302_tree=null;
        AmlTree TIE303_tree=null;
        AmlTree string_literal304_tree=null;
        RewriteRuleTokenStream stream_POS_NUM=new RewriteRuleTokenStream(adaptor,"token POS_NUM");
        RewriteRuleTokenStream stream_FIGURE_NAME=new RewriteRuleTokenStream(adaptor,"token FIGURE_NAME");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_105=new RewriteRuleTokenStream(adaptor,"token 105");
        RewriteRuleTokenStream stream_TIE=new RewriteRuleTokenStream(adaptor,"token TIE");
        RewriteRuleSubtreeStream stream_notes_type=new RewriteRuleSubtreeStream(adaptor,"rule notes_type");
        try {
            // src/parser/Music.g:255:17: ( notes_type ( '.' ( FIGURE_NAME ( POS_NUM )? ) ( DOT )? )? ( TIE )? -> ^( FIGURE notes_type ( FIGURE_NAME )? ( DOT )? ( TIE )? ) | 'N:' ! note )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==ARMOR||LA69_0==BEMOL||LA69_0==CHORD||LA69_0==NOTE||LA69_0==SUSTAIN||LA69_0==102) ) {
                alt69=1;
            }
            else if ( (LA69_0==109) ) {
                alt69=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;

            }
            switch (alt69) {
                case 1 :
                    // src/parser/Music.g:255:21: notes_type ( '.' ( FIGURE_NAME ( POS_NUM )? ) ( DOT )? )? ( TIE )?
                    {
                    pushFollow(FOLLOW_notes_type_in_notes_variable3480);
                    notes_type298=notes_type();

                    state._fsp--;

                    stream_notes_type.add(notes_type298.getTree());

                    // src/parser/Music.g:255:32: ( '.' ( FIGURE_NAME ( POS_NUM )? ) ( DOT )? )?
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==105) ) {
                        alt67=1;
                    }
                    switch (alt67) {
                        case 1 :
                            // src/parser/Music.g:255:33: '.' ( FIGURE_NAME ( POS_NUM )? ) ( DOT )?
                            {
                            char_literal299=(Token)match(input,105,FOLLOW_105_in_notes_variable3483);  
                            stream_105.add(char_literal299);


                            // src/parser/Music.g:255:37: ( FIGURE_NAME ( POS_NUM )? )
                            // src/parser/Music.g:255:38: FIGURE_NAME ( POS_NUM )?
                            {
                            FIGURE_NAME300=(Token)match(input,FIGURE_NAME,FOLLOW_FIGURE_NAME_in_notes_variable3486);  
                            stream_FIGURE_NAME.add(FIGURE_NAME300);


                            // src/parser/Music.g:255:50: ( POS_NUM )?
                            int alt65=2;
                            int LA65_0 = input.LA(1);

                            if ( (LA65_0==POS_NUM) ) {
                                alt65=1;
                            }
                            switch (alt65) {
                                case 1 :
                                    // src/parser/Music.g:255:50: POS_NUM
                                    {
                                    POS_NUM301=(Token)match(input,POS_NUM,FOLLOW_POS_NUM_in_notes_variable3488);  
                                    stream_POS_NUM.add(POS_NUM301);


                                    }
                                    break;

                            }


                            }


                            // src/parser/Music.g:255:60: ( DOT )?
                            int alt66=2;
                            int LA66_0 = input.LA(1);

                            if ( (LA66_0==DOT) ) {
                                alt66=1;
                            }
                            switch (alt66) {
                                case 1 :
                                    // src/parser/Music.g:255:60: DOT
                                    {
                                    DOT302=(Token)match(input,DOT,FOLLOW_DOT_in_notes_variable3492);  
                                    stream_DOT.add(DOT302);


                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    // src/parser/Music.g:255:67: ( TIE )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==TIE) ) {
                        alt68=1;
                    }
                    switch (alt68) {
                        case 1 :
                            // src/parser/Music.g:255:67: TIE
                            {
                            TIE303=(Token)match(input,TIE,FOLLOW_TIE_in_notes_variable3497);  
                            stream_TIE.add(TIE303);


                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: DOT, notes_type, FIGURE_NAME, TIE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AmlTree)adaptor.nil();
                    // 255:72: -> ^( FIGURE notes_type ( FIGURE_NAME )? ( DOT )? ( TIE )? )
                    {
                        // src/parser/Music.g:255:75: ^( FIGURE notes_type ( FIGURE_NAME )? ( DOT )? ( TIE )? )
                        {
                        AmlTree root_1 = (AmlTree)adaptor.nil();
                        root_1 = (AmlTree)adaptor.becomeRoot(
                        (AmlTree)adaptor.create(FIGURE, "FIGURE")
                        , root_1);

                        adaptor.addChild(root_1, stream_notes_type.nextTree());

                        // src/parser/Music.g:255:95: ( FIGURE_NAME )?
                        if ( stream_FIGURE_NAME.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_FIGURE_NAME.nextNode()
                            );

                        }
                        stream_FIGURE_NAME.reset();

                        // src/parser/Music.g:255:108: ( DOT )?
                        if ( stream_DOT.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_DOT.nextNode()
                            );

                        }
                        stream_DOT.reset();

                        // src/parser/Music.g:255:113: ( TIE )?
                        if ( stream_TIE.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_TIE.nextNode()
                            );

                        }
                        stream_TIE.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:256:21: 'N:' ! note
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    string_literal304=(Token)match(input,109,FOLLOW_109_in_notes_variable3537); 

                    pushFollow(FOLLOW_note_in_notes_variable3540);
                    note305=note();

                    state._fsp--;

                    adaptor.addChild(root_0, note305.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "notes_variable"


    public static class notes_type_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "notes_type"
    // src/parser/Music.g:259:1: notes_type : ( chord | notes );
    public final MusicParser.notes_type_return notes_type() throws RecognitionException {
        MusicParser.notes_type_return retval = new MusicParser.notes_type_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        MusicParser.chord_return chord306 =null;

        MusicParser.notes_return notes307 =null;



        try {
            // src/parser/Music.g:259:13: ( chord | notes )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==CHORD) ) {
                alt70=1;
            }
            else if ( (LA70_0==ARMOR||LA70_0==BEMOL||LA70_0==NOTE||LA70_0==SUSTAIN||LA70_0==102) ) {
                alt70=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;

            }
            switch (alt70) {
                case 1 :
                    // src/parser/Music.g:259:15: chord
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_chord_in_notes_type3566);
                    chord306=chord();

                    state._fsp--;

                    adaptor.addChild(root_0, chord306.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:259:23: notes
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_notes_in_notes_type3570);
                    notes307=notes();

                    state._fsp--;

                    adaptor.addChild(root_0, notes307.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "notes_type"


    public static class chord_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "chord"
    // src/parser/Music.g:262:1: chord : CHORD ^ '(' ! note ( MINOR | PLUS | DIMINUTION )? ( SEVENTH | MAJ7 )? ')' !;
    public final MusicParser.chord_return chord() throws RecognitionException {
        MusicParser.chord_return retval = new MusicParser.chord_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token CHORD308=null;
        Token char_literal309=null;
        Token set311=null;
        Token set312=null;
        Token char_literal313=null;
        MusicParser.note_return note310 =null;


        AmlTree CHORD308_tree=null;
        AmlTree char_literal309_tree=null;
        AmlTree set311_tree=null;
        AmlTree set312_tree=null;
        AmlTree char_literal313_tree=null;

        try {
            // src/parser/Music.g:262:13: ( CHORD ^ '(' ! note ( MINOR | PLUS | DIMINUTION )? ( SEVENTH | MAJ7 )? ')' !)
            // src/parser/Music.g:262:17: CHORD ^ '(' ! note ( MINOR | PLUS | DIMINUTION )? ( SEVENTH | MAJ7 )? ')' !
            {
            root_0 = (AmlTree)adaptor.nil();


            CHORD308=(Token)match(input,CHORD,FOLLOW_CHORD_in_chord3599); 
            CHORD308_tree = 
            (AmlTree)adaptor.create(CHORD308)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(CHORD308_tree, root_0);


            char_literal309=(Token)match(input,102,FOLLOW_102_in_chord3602); 

            pushFollow(FOLLOW_note_in_chord3605);
            note310=note();

            state._fsp--;

            adaptor.addChild(root_0, note310.getTree());

            // src/parser/Music.g:262:34: ( MINOR | PLUS | DIMINUTION )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==DIMINUTION||LA71_0==MINOR||LA71_0==PLUS) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // src/parser/Music.g:
                    {
                    set311=(Token)input.LT(1);

                    if ( input.LA(1)==DIMINUTION||input.LA(1)==MINOR||input.LA(1)==PLUS ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (AmlTree)adaptor.create(set311)
                        );
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }


            // src/parser/Music.g:262:59: ( SEVENTH | MAJ7 )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==MAJ7||LA72_0==SEVENTH) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // src/parser/Music.g:
                    {
                    set312=(Token)input.LT(1);

                    if ( input.LA(1)==MAJ7||input.LA(1)==SEVENTH ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (AmlTree)adaptor.create(set312)
                        );
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }


            char_literal313=(Token)match(input,103,FOLLOW_103_in_chord3625); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "chord"


    public static class notes_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "notes"
    // src/parser/Music.g:265:1: notes : ( '(' ( note )+ ')' | note ) -> ^( NOTES ( note )+ ) ;
    public final MusicParser.notes_return notes() throws RecognitionException {
        MusicParser.notes_return retval = new MusicParser.notes_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal314=null;
        Token char_literal316=null;
        MusicParser.note_return note315 =null;

        MusicParser.note_return note317 =null;


        AmlTree char_literal314_tree=null;
        AmlTree char_literal316_tree=null;
        RewriteRuleTokenStream stream_103=new RewriteRuleTokenStream(adaptor,"token 103");
        RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
        RewriteRuleSubtreeStream stream_note=new RewriteRuleSubtreeStream(adaptor,"rule note");
        try {
            // src/parser/Music.g:265:13: ( ( '(' ( note )+ ')' | note ) -> ^( NOTES ( note )+ ) )
            // src/parser/Music.g:265:17: ( '(' ( note )+ ')' | note )
            {
            // src/parser/Music.g:265:17: ( '(' ( note )+ ')' | note )
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==102) ) {
                alt74=1;
            }
            else if ( (LA74_0==ARMOR||LA74_0==BEMOL||LA74_0==NOTE||LA74_0==SUSTAIN) ) {
                alt74=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;

            }
            switch (alt74) {
                case 1 :
                    // src/parser/Music.g:265:19: '(' ( note )+ ')'
                    {
                    char_literal314=(Token)match(input,102,FOLLOW_102_in_notes3657);  
                    stream_102.add(char_literal314);


                    // src/parser/Music.g:265:23: ( note )+
                    int cnt73=0;
                    loop73:
                    do {
                        int alt73=2;
                        int LA73_0 = input.LA(1);

                        if ( (LA73_0==ARMOR||LA73_0==BEMOL||LA73_0==NOTE||LA73_0==SUSTAIN) ) {
                            alt73=1;
                        }


                        switch (alt73) {
                    	case 1 :
                    	    // src/parser/Music.g:265:24: note
                    	    {
                    	    pushFollow(FOLLOW_note_in_notes3660);
                    	    note315=note();

                    	    state._fsp--;

                    	    stream_note.add(note315.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt73 >= 1 ) break loop73;
                                EarlyExitException eee =
                                    new EarlyExitException(73, input);
                                throw eee;
                        }
                        cnt73++;
                    } while (true);


                    char_literal316=(Token)match(input,103,FOLLOW_103_in_notes3664);  
                    stream_103.add(char_literal316);


                    }
                    break;
                case 2 :
                    // src/parser/Music.g:265:38: note
                    {
                    pushFollow(FOLLOW_note_in_notes3669);
                    note317=note();

                    state._fsp--;

                    stream_note.add(note317.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: note
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AmlTree)adaptor.nil();
            // 265:44: -> ^( NOTES ( note )+ )
            {
                // src/parser/Music.g:265:47: ^( NOTES ( note )+ )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(NOTES, "NOTES")
                , root_1);

                if ( !(stream_note.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_note.hasNext() ) {
                    adaptor.addChild(root_1, stream_note.nextTree());

                }
                stream_note.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "notes"


    public static class triplet_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "triplet"
    // src/parser/Music.g:268:1: triplet : '[' notes_type notes_type notes_type ']' ( FIGURE_NAME )? -> ^( TRIPLET ( FIGURE_NAME )? notes_type notes_type notes_type ) ;
    public final MusicParser.triplet_return triplet() throws RecognitionException {
        MusicParser.triplet_return retval = new MusicParser.triplet_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal318=null;
        Token char_literal322=null;
        Token FIGURE_NAME323=null;
        MusicParser.notes_type_return notes_type319 =null;

        MusicParser.notes_type_return notes_type320 =null;

        MusicParser.notes_type_return notes_type321 =null;


        AmlTree char_literal318_tree=null;
        AmlTree char_literal322_tree=null;
        AmlTree FIGURE_NAME323_tree=null;
        RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
        RewriteRuleTokenStream stream_111=new RewriteRuleTokenStream(adaptor,"token 111");
        RewriteRuleTokenStream stream_FIGURE_NAME=new RewriteRuleTokenStream(adaptor,"token FIGURE_NAME");
        RewriteRuleSubtreeStream stream_notes_type=new RewriteRuleSubtreeStream(adaptor,"rule notes_type");
        try {
            // src/parser/Music.g:268:13: ( '[' notes_type notes_type notes_type ']' ( FIGURE_NAME )? -> ^( TRIPLET ( FIGURE_NAME )? notes_type notes_type notes_type ) )
            // src/parser/Music.g:268:17: '[' notes_type notes_type notes_type ']' ( FIGURE_NAME )?
            {
            char_literal318=(Token)match(input,110,FOLLOW_110_in_triplet3706);  
            stream_110.add(char_literal318);


            pushFollow(FOLLOW_notes_type_in_triplet3708);
            notes_type319=notes_type();

            state._fsp--;

            stream_notes_type.add(notes_type319.getTree());

            pushFollow(FOLLOW_notes_type_in_triplet3710);
            notes_type320=notes_type();

            state._fsp--;

            stream_notes_type.add(notes_type320.getTree());

            pushFollow(FOLLOW_notes_type_in_triplet3712);
            notes_type321=notes_type();

            state._fsp--;

            stream_notes_type.add(notes_type321.getTree());

            char_literal322=(Token)match(input,111,FOLLOW_111_in_triplet3714);  
            stream_111.add(char_literal322);


            // src/parser/Music.g:268:58: ( FIGURE_NAME )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==FIGURE_NAME) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // src/parser/Music.g:268:58: FIGURE_NAME
                    {
                    FIGURE_NAME323=(Token)match(input,FIGURE_NAME,FOLLOW_FIGURE_NAME_in_triplet3716);  
                    stream_FIGURE_NAME.add(FIGURE_NAME323);


                    }
                    break;

            }


            // AST REWRITE
            // elements: notes_type, notes_type, notes_type, FIGURE_NAME
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AmlTree)adaptor.nil();
            // 268:71: -> ^( TRIPLET ( FIGURE_NAME )? notes_type notes_type notes_type )
            {
                // src/parser/Music.g:268:74: ^( TRIPLET ( FIGURE_NAME )? notes_type notes_type notes_type )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(TRIPLET, "TRIPLET")
                , root_1);

                // src/parser/Music.g:268:84: ( FIGURE_NAME )?
                if ( stream_FIGURE_NAME.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_FIGURE_NAME.nextNode()
                    );

                }
                stream_FIGURE_NAME.reset();

                adaptor.addChild(root_1, stream_notes_type.nextTree());

                adaptor.addChild(root_1, stream_notes_type.nextTree());

                adaptor.addChild(root_1, stream_notes_type.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "triplet"


    public static class drumsnotes_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "drumsnotes"
    // src/parser/Music.g:271:1: drumsnotes : ( '(' ( drum_note )+ ')' | drum_note ) -> ^( DRUM_NOTES ( drum_note )+ ) ;
    public final MusicParser.drumsnotes_return drumsnotes() throws RecognitionException {
        MusicParser.drumsnotes_return retval = new MusicParser.drumsnotes_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal324=null;
        Token char_literal326=null;
        MusicParser.drum_note_return drum_note325 =null;

        MusicParser.drum_note_return drum_note327 =null;


        AmlTree char_literal324_tree=null;
        AmlTree char_literal326_tree=null;
        RewriteRuleTokenStream stream_103=new RewriteRuleTokenStream(adaptor,"token 103");
        RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
        RewriteRuleSubtreeStream stream_drum_note=new RewriteRuleSubtreeStream(adaptor,"rule drum_note");
        try {
            // src/parser/Music.g:271:13: ( ( '(' ( drum_note )+ ')' | drum_note ) -> ^( DRUM_NOTES ( drum_note )+ ) )
            // src/parser/Music.g:271:17: ( '(' ( drum_note )+ ')' | drum_note )
            {
            // src/parser/Music.g:271:17: ( '(' ( drum_note )+ ')' | drum_note )
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==102) ) {
                alt77=1;
            }
            else if ( (LA77_0==DN) ) {
                alt77=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;

            }
            switch (alt77) {
                case 1 :
                    // src/parser/Music.g:271:19: '(' ( drum_note )+ ')'
                    {
                    char_literal324=(Token)match(input,102,FOLLOW_102_in_drumsnotes3758);  
                    stream_102.add(char_literal324);


                    // src/parser/Music.g:271:23: ( drum_note )+
                    int cnt76=0;
                    loop76:
                    do {
                        int alt76=2;
                        int LA76_0 = input.LA(1);

                        if ( (LA76_0==DN) ) {
                            alt76=1;
                        }


                        switch (alt76) {
                    	case 1 :
                    	    // src/parser/Music.g:271:24: drum_note
                    	    {
                    	    pushFollow(FOLLOW_drum_note_in_drumsnotes3761);
                    	    drum_note325=drum_note();

                    	    state._fsp--;

                    	    stream_drum_note.add(drum_note325.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt76 >= 1 ) break loop76;
                                EarlyExitException eee =
                                    new EarlyExitException(76, input);
                                throw eee;
                        }
                        cnt76++;
                    } while (true);


                    char_literal326=(Token)match(input,103,FOLLOW_103_in_drumsnotes3765);  
                    stream_103.add(char_literal326);


                    }
                    break;
                case 2 :
                    // src/parser/Music.g:271:43: drum_note
                    {
                    pushFollow(FOLLOW_drum_note_in_drumsnotes3770);
                    drum_note327=drum_note();

                    state._fsp--;

                    stream_drum_note.add(drum_note327.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: drum_note
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AmlTree)adaptor.nil();
            // 271:54: -> ^( DRUM_NOTES ( drum_note )+ )
            {
                // src/parser/Music.g:271:57: ^( DRUM_NOTES ( drum_note )+ )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(DRUM_NOTES, "DRUM_NOTES")
                , root_1);

                if ( !(stream_drum_note.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_drum_note.hasNext() ) {
                    adaptor.addChild(root_1, stream_drum_note.nextTree());

                }
                stream_drum_note.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "drumsnotes"


    public static class drum_note_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "drum_note"
    // src/parser/Music.g:274:1: drum_note : DN '(' num_expr ')' -> ^( DRUM_NOTE num_expr ) ;
    public final MusicParser.drum_note_return drum_note() throws RecognitionException {
        MusicParser.drum_note_return retval = new MusicParser.drum_note_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token DN328=null;
        Token char_literal329=null;
        Token char_literal331=null;
        MusicParser.num_expr_return num_expr330 =null;


        AmlTree DN328_tree=null;
        AmlTree char_literal329_tree=null;
        AmlTree char_literal331_tree=null;
        RewriteRuleTokenStream stream_DN=new RewriteRuleTokenStream(adaptor,"token DN");
        RewriteRuleTokenStream stream_103=new RewriteRuleTokenStream(adaptor,"token 103");
        RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
        RewriteRuleSubtreeStream stream_num_expr=new RewriteRuleSubtreeStream(adaptor,"rule num_expr");
        try {
            // src/parser/Music.g:274:13: ( DN '(' num_expr ')' -> ^( DRUM_NOTE num_expr ) )
            // src/parser/Music.g:274:17: DN '(' num_expr ')'
            {
            DN328=(Token)match(input,DN,FOLLOW_DN_in_drum_note3805);  
            stream_DN.add(DN328);


            char_literal329=(Token)match(input,102,FOLLOW_102_in_drum_note3807);  
            stream_102.add(char_literal329);


            pushFollow(FOLLOW_num_expr_in_drum_note3809);
            num_expr330=num_expr();

            state._fsp--;

            stream_num_expr.add(num_expr330.getTree());

            char_literal331=(Token)match(input,103,FOLLOW_103_in_drum_note3811);  
            stream_103.add(char_literal331);


            // AST REWRITE
            // elements: num_expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AmlTree)adaptor.nil();
            // 274:37: -> ^( DRUM_NOTE num_expr )
            {
                // src/parser/Music.g:274:40: ^( DRUM_NOTE num_expr )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(DRUM_NOTE, "DRUM_NOTE")
                , root_1);

                adaptor.addChild(root_1, stream_num_expr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "drum_note"


    public static class note_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "note"
    // src/parser/Music.g:277:1: note : ( BEMOL | SUSTAIN | ARMOR )? NOTE ^ ( NEG_NUM )? ;
    public final MusicParser.note_return note() throws RecognitionException {
        MusicParser.note_return retval = new MusicParser.note_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token set332=null;
        Token NOTE333=null;
        Token NEG_NUM334=null;

        AmlTree set332_tree=null;
        AmlTree NOTE333_tree=null;
        AmlTree NEG_NUM334_tree=null;

        try {
            // src/parser/Music.g:277:13: ( ( BEMOL | SUSTAIN | ARMOR )? NOTE ^ ( NEG_NUM )? )
            // src/parser/Music.g:277:17: ( BEMOL | SUSTAIN | ARMOR )? NOTE ^ ( NEG_NUM )?
            {
            root_0 = (AmlTree)adaptor.nil();


            // src/parser/Music.g:277:17: ( BEMOL | SUSTAIN | ARMOR )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==ARMOR||LA78_0==BEMOL||LA78_0==SUSTAIN) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // src/parser/Music.g:
                    {
                    set332=(Token)input.LT(1);

                    if ( input.LA(1)==ARMOR||input.LA(1)==BEMOL||input.LA(1)==SUSTAIN ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (AmlTree)adaptor.create(set332)
                        );
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }


            NOTE333=(Token)match(input,NOTE,FOLLOW_NOTE_in_note3862); 
            NOTE333_tree = 
            (AmlTree)adaptor.create(NOTE333)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(NOTE333_tree, root_0);


            // src/parser/Music.g:277:50: ( NEG_NUM )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==NEG_NUM) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // src/parser/Music.g:277:51: NEG_NUM
                    {
                    NEG_NUM334=(Token)match(input,NEG_NUM,FOLLOW_NEG_NUM_in_note3866); 
                    NEG_NUM334_tree = 
                    (AmlTree)adaptor.create(NEG_NUM334)
                    ;
                    adaptor.addChild(root_0, NEG_NUM334_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "note"


    public static class expr_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // src/parser/Music.g:281:1: expr : boolterm ( OR ^ boolterm )* ;
    public final MusicParser.expr_return expr() throws RecognitionException {
        MusicParser.expr_return retval = new MusicParser.expr_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token OR336=null;
        MusicParser.boolterm_return boolterm335 =null;

        MusicParser.boolterm_return boolterm337 =null;


        AmlTree OR336_tree=null;

        try {
            // src/parser/Music.g:281:9: ( boolterm ( OR ^ boolterm )* )
            // src/parser/Music.g:281:13: boolterm ( OR ^ boolterm )*
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_boolterm_in_expr3895);
            boolterm335=boolterm();

            state._fsp--;

            adaptor.addChild(root_0, boolterm335.getTree());

            // src/parser/Music.g:281:22: ( OR ^ boolterm )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==OR) ) {
                    alt80=1;
                }


                switch (alt80) {
            	case 1 :
            	    // src/parser/Music.g:281:23: OR ^ boolterm
            	    {
            	    OR336=(Token)match(input,OR,FOLLOW_OR_in_expr3898); 
            	    OR336_tree = 
            	    (AmlTree)adaptor.create(OR336)
            	    ;
            	    root_0 = (AmlTree)adaptor.becomeRoot(OR336_tree, root_0);


            	    pushFollow(FOLLOW_boolterm_in_expr3901);
            	    boolterm337=boolterm();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolterm337.getTree());

            	    }
            	    break;

            	default :
            	    break loop80;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr"


    public static class boolterm_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolterm"
    // src/parser/Music.g:284:1: boolterm : boolfact ( AND ^ boolfact )* ;
    public final MusicParser.boolterm_return boolterm() throws RecognitionException {
        MusicParser.boolterm_return retval = new MusicParser.boolterm_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token AND339=null;
        MusicParser.boolfact_return boolfact338 =null;

        MusicParser.boolfact_return boolfact340 =null;


        AmlTree AND339_tree=null;

        try {
            // src/parser/Music.g:284:13: ( boolfact ( AND ^ boolfact )* )
            // src/parser/Music.g:284:17: boolfact ( AND ^ boolfact )*
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_boolfact_in_boolterm3919);
            boolfact338=boolfact();

            state._fsp--;

            adaptor.addChild(root_0, boolfact338.getTree());

            // src/parser/Music.g:284:26: ( AND ^ boolfact )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==AND) ) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // src/parser/Music.g:284:27: AND ^ boolfact
            	    {
            	    AND339=(Token)match(input,AND,FOLLOW_AND_in_boolterm3922); 
            	    AND339_tree = 
            	    (AmlTree)adaptor.create(AND339)
            	    ;
            	    root_0 = (AmlTree)adaptor.becomeRoot(AND339_tree, root_0);


            	    pushFollow(FOLLOW_boolfact_in_boolterm3925);
            	    boolfact340=boolfact();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolfact340.getTree());

            	    }
            	    break;

            	default :
            	    break loop81;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "boolterm"


    public static class boolfact_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolfact"
    // src/parser/Music.g:287:1: boolfact : num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? ;
    public final MusicParser.boolfact_return boolfact() throws RecognitionException {
        MusicParser.boolfact_return retval = new MusicParser.boolfact_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token EQUAL342=null;
        Token NOT_EQUAL343=null;
        Token LT344=null;
        Token LE345=null;
        Token GT346=null;
        Token GE347=null;
        MusicParser.num_expr_return num_expr341 =null;

        MusicParser.num_expr_return num_expr348 =null;


        AmlTree EQUAL342_tree=null;
        AmlTree NOT_EQUAL343_tree=null;
        AmlTree LT344_tree=null;
        AmlTree LE345_tree=null;
        AmlTree GT346_tree=null;
        AmlTree GE347_tree=null;

        try {
            // src/parser/Music.g:287:13: ( num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? )
            // src/parser/Music.g:287:17: num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_num_expr_in_boolfact3947);
            num_expr341=num_expr();

            state._fsp--;

            adaptor.addChild(root_0, num_expr341.getTree());

            // src/parser/Music.g:287:26: ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==EQUAL||(LA83_0 >= GE && LA83_0 <= GT)||LA83_0==LE||LA83_0==LT||LA83_0==NOT_EQUAL) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // src/parser/Music.g:287:27: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr
                    {
                    // src/parser/Music.g:287:27: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^)
                    int alt82=6;
                    switch ( input.LA(1) ) {
                    case EQUAL:
                        {
                        alt82=1;
                        }
                        break;
                    case NOT_EQUAL:
                        {
                        alt82=2;
                        }
                        break;
                    case LT:
                        {
                        alt82=3;
                        }
                        break;
                    case LE:
                        {
                        alt82=4;
                        }
                        break;
                    case GT:
                        {
                        alt82=5;
                        }
                        break;
                    case GE:
                        {
                        alt82=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 82, 0, input);

                        throw nvae;

                    }

                    switch (alt82) {
                        case 1 :
                            // src/parser/Music.g:287:28: EQUAL ^
                            {
                            EQUAL342=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_boolfact3951); 
                            EQUAL342_tree = 
                            (AmlTree)adaptor.create(EQUAL342)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(EQUAL342_tree, root_0);


                            }
                            break;
                        case 2 :
                            // src/parser/Music.g:287:37: NOT_EQUAL ^
                            {
                            NOT_EQUAL343=(Token)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_boolfact3956); 
                            NOT_EQUAL343_tree = 
                            (AmlTree)adaptor.create(NOT_EQUAL343)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(NOT_EQUAL343_tree, root_0);


                            }
                            break;
                        case 3 :
                            // src/parser/Music.g:287:50: LT ^
                            {
                            LT344=(Token)match(input,LT,FOLLOW_LT_in_boolfact3961); 
                            LT344_tree = 
                            (AmlTree)adaptor.create(LT344)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(LT344_tree, root_0);


                            }
                            break;
                        case 4 :
                            // src/parser/Music.g:287:56: LE ^
                            {
                            LE345=(Token)match(input,LE,FOLLOW_LE_in_boolfact3966); 
                            LE345_tree = 
                            (AmlTree)adaptor.create(LE345)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(LE345_tree, root_0);


                            }
                            break;
                        case 5 :
                            // src/parser/Music.g:287:62: GT ^
                            {
                            GT346=(Token)match(input,GT,FOLLOW_GT_in_boolfact3971); 
                            GT346_tree = 
                            (AmlTree)adaptor.create(GT346)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(GT346_tree, root_0);


                            }
                            break;
                        case 6 :
                            // src/parser/Music.g:287:68: GE ^
                            {
                            GE347=(Token)match(input,GE,FOLLOW_GE_in_boolfact3976); 
                            GE347_tree = 
                            (AmlTree)adaptor.create(GE347)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(GE347_tree, root_0);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_num_expr_in_boolfact3980);
                    num_expr348=num_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, num_expr348.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "boolfact"


    public static class num_expr_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "num_expr"
    // src/parser/Music.g:290:1: num_expr : term ( ( PLUS ^| MINUS ^) term )* ;
    public final MusicParser.num_expr_return num_expr() throws RecognitionException {
        MusicParser.num_expr_return retval = new MusicParser.num_expr_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token PLUS350=null;
        Token MINUS351=null;
        MusicParser.term_return term349 =null;

        MusicParser.term_return term352 =null;


        AmlTree PLUS350_tree=null;
        AmlTree MINUS351_tree=null;

        try {
            // src/parser/Music.g:290:13: ( term ( ( PLUS ^| MINUS ^) term )* )
            // src/parser/Music.g:290:17: term ( ( PLUS ^| MINUS ^) term )*
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_term_in_num_expr4002);
            term349=term();

            state._fsp--;

            adaptor.addChild(root_0, term349.getTree());

            // src/parser/Music.g:290:22: ( ( PLUS ^| MINUS ^) term )*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==MINUS||LA85_0==PLUS) ) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // src/parser/Music.g:290:24: ( PLUS ^| MINUS ^) term
            	    {
            	    // src/parser/Music.g:290:24: ( PLUS ^| MINUS ^)
            	    int alt84=2;
            	    int LA84_0 = input.LA(1);

            	    if ( (LA84_0==PLUS) ) {
            	        alt84=1;
            	    }
            	    else if ( (LA84_0==MINUS) ) {
            	        alt84=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 84, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt84) {
            	        case 1 :
            	            // src/parser/Music.g:290:25: PLUS ^
            	            {
            	            PLUS350=(Token)match(input,PLUS,FOLLOW_PLUS_in_num_expr4007); 
            	            PLUS350_tree = 
            	            (AmlTree)adaptor.create(PLUS350)
            	            ;
            	            root_0 = (AmlTree)adaptor.becomeRoot(PLUS350_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // src/parser/Music.g:290:33: MINUS ^
            	            {
            	            MINUS351=(Token)match(input,MINUS,FOLLOW_MINUS_in_num_expr4012); 
            	            MINUS351_tree = 
            	            (AmlTree)adaptor.create(MINUS351)
            	            ;
            	            root_0 = (AmlTree)adaptor.becomeRoot(MINUS351_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_term_in_num_expr4016);
            	    term352=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term352.getTree());

            	    }
            	    break;

            	default :
            	    break loop85;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "num_expr"


    public static class term_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "term"
    // src/parser/Music.g:293:1: term : factor ( ( DOT ^| DIV ^| MOD ^) factor )* ;
    public final MusicParser.term_return term() throws RecognitionException {
        MusicParser.term_return retval = new MusicParser.term_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token DOT354=null;
        Token DIV355=null;
        Token MOD356=null;
        MusicParser.factor_return factor353 =null;

        MusicParser.factor_return factor357 =null;


        AmlTree DOT354_tree=null;
        AmlTree DIV355_tree=null;
        AmlTree MOD356_tree=null;

        try {
            // src/parser/Music.g:293:9: ( factor ( ( DOT ^| DIV ^| MOD ^) factor )* )
            // src/parser/Music.g:293:13: factor ( ( DOT ^| DIV ^| MOD ^) factor )*
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term4038);
            factor353=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor353.getTree());

            // src/parser/Music.g:293:20: ( ( DOT ^| DIV ^| MOD ^) factor )*
            loop87:
            do {
                int alt87=2;
                int LA87_0 = input.LA(1);

                if ( (LA87_0==DIV||LA87_0==DOT||LA87_0==MOD) ) {
                    alt87=1;
                }


                switch (alt87) {
            	case 1 :
            	    // src/parser/Music.g:293:22: ( DOT ^| DIV ^| MOD ^) factor
            	    {
            	    // src/parser/Music.g:293:22: ( DOT ^| DIV ^| MOD ^)
            	    int alt86=3;
            	    switch ( input.LA(1) ) {
            	    case DOT:
            	        {
            	        alt86=1;
            	        }
            	        break;
            	    case DIV:
            	        {
            	        alt86=2;
            	        }
            	        break;
            	    case MOD:
            	        {
            	        alt86=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 86, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt86) {
            	        case 1 :
            	            // src/parser/Music.g:293:23: DOT ^
            	            {
            	            DOT354=(Token)match(input,DOT,FOLLOW_DOT_in_term4043); 
            	            DOT354_tree = 
            	            (AmlTree)adaptor.create(DOT354)
            	            ;
            	            root_0 = (AmlTree)adaptor.becomeRoot(DOT354_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // src/parser/Music.g:293:30: DIV ^
            	            {
            	            DIV355=(Token)match(input,DIV,FOLLOW_DIV_in_term4048); 
            	            DIV355_tree = 
            	            (AmlTree)adaptor.create(DIV355)
            	            ;
            	            root_0 = (AmlTree)adaptor.becomeRoot(DIV355_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // src/parser/Music.g:293:37: MOD ^
            	            {
            	            MOD356=(Token)match(input,MOD,FOLLOW_MOD_in_term4053); 
            	            MOD356_tree = 
            	            (AmlTree)adaptor.create(MOD356)
            	            ;
            	            root_0 = (AmlTree)adaptor.becomeRoot(MOD356_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_factor_in_term4057);
            	    factor357=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor357.getTree());

            	    }
            	    break;

            	default :
            	    break loop87;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "term"


    public static class factor_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "factor"
    // src/parser/Music.g:296:1: factor : ( NOT ^| PLUS ^| MINUS ^)? atom ;
    public final MusicParser.factor_return factor() throws RecognitionException {
        MusicParser.factor_return retval = new MusicParser.factor_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token NOT358=null;
        Token PLUS359=null;
        Token MINUS360=null;
        MusicParser.atom_return atom361 =null;


        AmlTree NOT358_tree=null;
        AmlTree PLUS359_tree=null;
        AmlTree MINUS360_tree=null;

        try {
            // src/parser/Music.g:296:9: ( ( NOT ^| PLUS ^| MINUS ^)? atom )
            // src/parser/Music.g:296:13: ( NOT ^| PLUS ^| MINUS ^)? atom
            {
            root_0 = (AmlTree)adaptor.nil();


            // src/parser/Music.g:296:13: ( NOT ^| PLUS ^| MINUS ^)?
            int alt88=4;
            switch ( input.LA(1) ) {
                case NOT:
                    {
                    alt88=1;
                    }
                    break;
                case PLUS:
                    {
                    alt88=2;
                    }
                    break;
                case MINUS:
                    {
                    alt88=3;
                    }
                    break;
            }

            switch (alt88) {
                case 1 :
                    // src/parser/Music.g:296:14: NOT ^
                    {
                    NOT358=(Token)match(input,NOT,FOLLOW_NOT_in_factor4074); 
                    NOT358_tree = 
                    (AmlTree)adaptor.create(NOT358)
                    ;
                    root_0 = (AmlTree)adaptor.becomeRoot(NOT358_tree, root_0);


                    }
                    break;
                case 2 :
                    // src/parser/Music.g:296:21: PLUS ^
                    {
                    PLUS359=(Token)match(input,PLUS,FOLLOW_PLUS_in_factor4079); 
                    PLUS359_tree = 
                    (AmlTree)adaptor.create(PLUS359)
                    ;
                    root_0 = (AmlTree)adaptor.becomeRoot(PLUS359_tree, root_0);


                    }
                    break;
                case 3 :
                    // src/parser/Music.g:296:29: MINUS ^
                    {
                    MINUS360=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor4084); 
                    MINUS360_tree = 
                    (AmlTree)adaptor.create(MINUS360)
                    ;
                    root_0 = (AmlTree)adaptor.becomeRoot(MINUS360_tree, root_0);


                    }
                    break;

            }


            pushFollow(FOLLOW_atom_in_factor4089);
            atom361=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom361.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "factor"


    public static class atom_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "atom"
    // src/parser/Music.g:299:1: atom : ( var_access | nnum | STRING | funcall | TRUE | FALSE | '(' ! expr ')' !);
    public final MusicParser.atom_return atom() throws RecognitionException {
        MusicParser.atom_return retval = new MusicParser.atom_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token STRING364=null;
        Token TRUE366=null;
        Token FALSE367=null;
        Token char_literal368=null;
        Token char_literal370=null;
        MusicParser.var_access_return var_access362 =null;

        MusicParser.nnum_return nnum363 =null;

        MusicParser.funcall_return funcall365 =null;

        MusicParser.expr_return expr369 =null;


        AmlTree STRING364_tree=null;
        AmlTree TRUE366_tree=null;
        AmlTree FALSE367_tree=null;
        AmlTree char_literal368_tree=null;
        AmlTree char_literal370_tree=null;

        try {
            // src/parser/Music.g:299:9: ( var_access | nnum | STRING | funcall | TRUE | FALSE | '(' ! expr ')' !)
            int alt89=7;
            switch ( input.LA(1) ) {
            case ID_:
                {
                int LA89_1 = input.LA(2);

                if ( (LA89_1==AND||LA89_1==BEMOL||LA89_1==DIV||LA89_1==DOT||LA89_1==EQUAL||(LA89_1 >= GE && LA89_1 <= GT)||LA89_1==LE||LA89_1==LT||LA89_1==MINUS||LA89_1==MOD||LA89_1==NOT_EQUAL||(LA89_1 >= OR && LA89_1 <= PLUS)||LA89_1==SUSTAIN||(LA89_1 >= 103 && LA89_1 <= 107)) ) {
                    alt89=1;
                }
                else if ( (LA89_1==102) ) {
                    alt89=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 89, 1, input);

                    throw nvae;

                }
                }
                break;
            case LETTER_X:
                {
                int LA89_2 = input.LA(2);

                if ( (LA89_2==AND||LA89_2==BEMOL||LA89_2==DIV||LA89_2==DOT||LA89_2==EQUAL||(LA89_2 >= GE && LA89_2 <= GT)||LA89_2==LE||LA89_2==LT||LA89_2==MINUS||LA89_2==MOD||LA89_2==NOT_EQUAL||(LA89_2 >= OR && LA89_2 <= PLUS)||LA89_2==SUSTAIN||(LA89_2 >= 103 && LA89_2 <= 107)) ) {
                    alt89=1;
                }
                else if ( (LA89_2==102) ) {
                    alt89=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 89, 2, input);

                    throw nvae;

                }
                }
                break;
            case NEG_NUM:
            case POS_NUM:
                {
                alt89=2;
                }
                break;
            case STRING:
                {
                alt89=3;
                }
                break;
            case TRUE:
                {
                alt89=5;
                }
                break;
            case FALSE:
                {
                alt89=6;
                }
                break;
            case 102:
                {
                alt89=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;

            }

            switch (alt89) {
                case 1 :
                    // src/parser/Music.g:299:13: var_access
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_var_access_in_atom4105);
                    var_access362=var_access();

                    state._fsp--;

                    adaptor.addChild(root_0, var_access362.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:300:7: nnum
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_nnum_in_atom4113);
                    nnum363=nnum();

                    state._fsp--;

                    adaptor.addChild(root_0, nnum363.getTree());

                    }
                    break;
                case 3 :
                    // src/parser/Music.g:301:7: STRING
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    STRING364=(Token)match(input,STRING,FOLLOW_STRING_in_atom4121); 
                    STRING364_tree = 
                    (AmlTree)adaptor.create(STRING364)
                    ;
                    adaptor.addChild(root_0, STRING364_tree);


                    }
                    break;
                case 4 :
                    // src/parser/Music.g:302:7: funcall
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_atom4129);
                    funcall365=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall365.getTree());

                    }
                    break;
                case 5 :
                    // src/parser/Music.g:303:7: TRUE
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    TRUE366=(Token)match(input,TRUE,FOLLOW_TRUE_in_atom4137); 
                    TRUE366_tree = 
                    (AmlTree)adaptor.create(TRUE366)
                    ;
                    adaptor.addChild(root_0, TRUE366_tree);


                    }
                    break;
                case 6 :
                    // src/parser/Music.g:304:7: FALSE
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    FALSE367=(Token)match(input,FALSE,FOLLOW_FALSE_in_atom4145); 
                    FALSE367_tree = 
                    (AmlTree)adaptor.create(FALSE367)
                    ;
                    adaptor.addChild(root_0, FALSE367_tree);


                    }
                    break;
                case 7 :
                    // src/parser/Music.g:305:7: '(' ! expr ')' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    char_literal368=(Token)match(input,102,FOLLOW_102_in_atom4153); 

                    pushFollow(FOLLOW_expr_in_atom4156);
                    expr369=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr369.getTree());

                    char_literal370=(Token)match(input,103,FOLLOW_103_in_atom4158); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "atom"


    public static class nnum_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "nnum"
    // src/parser/Music.g:308:1: nnum : (x= POS_NUM |x= NEG_NUM ) -> ^( NUM[$x] ) ;
    public final MusicParser.nnum_return nnum() throws RecognitionException {
        MusicParser.nnum_return retval = new MusicParser.nnum_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token x=null;

        AmlTree x_tree=null;
        RewriteRuleTokenStream stream_POS_NUM=new RewriteRuleTokenStream(adaptor,"token POS_NUM");
        RewriteRuleTokenStream stream_NEG_NUM=new RewriteRuleTokenStream(adaptor,"token NEG_NUM");

        try {
            // src/parser/Music.g:308:10: ( (x= POS_NUM |x= NEG_NUM ) -> ^( NUM[$x] ) )
            // src/parser/Music.g:308:14: (x= POS_NUM |x= NEG_NUM )
            {
            // src/parser/Music.g:308:14: (x= POS_NUM |x= NEG_NUM )
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==POS_NUM) ) {
                alt90=1;
            }
            else if ( (LA90_0==NEG_NUM) ) {
                alt90=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;

            }
            switch (alt90) {
                case 1 :
                    // src/parser/Music.g:308:15: x= POS_NUM
                    {
                    x=(Token)match(input,POS_NUM,FOLLOW_POS_NUM_in_nnum4179);  
                    stream_POS_NUM.add(x);


                    }
                    break;
                case 2 :
                    // src/parser/Music.g:308:27: x= NEG_NUM
                    {
                    x=(Token)match(input,NEG_NUM,FOLLOW_NEG_NUM_in_nnum4185);  
                    stream_NEG_NUM.add(x);


                    }
                    break;

            }


            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AmlTree)adaptor.nil();
            // 308:38: -> ^( NUM[$x] )
            {
                // src/parser/Music.g:308:41: ^( NUM[$x] )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(NUM, x)
                , root_1);

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AmlTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "nnum"

    // Delegated rules


 

    public static final BitSet FOLLOW_global_stmt_in_prog235 = new BitSet(new long[]{0x0008024002002800L,0x0000000201100040L});
    public static final BitSet FOLLOW_EOF_in_prog239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_global_stmt271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_frag_in_global_stmt289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_song_in_global_stmt307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_void_in_function332 = new BitSet(new long[]{0x0020800000000000L});
    public static final BitSet FOLLOW_id_rule_in_function336 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_function338 = new BitSet(new long[]{0x0008004002002800L,0x0000008001000040L});
    public static final BitSet FOLLOW_list_arguments_in_function340 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_103_in_function342 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_function344 = new BitSet(new long[]{0x002F80C002822A00L,0x0000001C29752040L});
    public static final BitSet FOLLOW_listInst_in_function346 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_function348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_rule_in_funcall394 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_funcall396 = new BitSet(new long[]{0x4020800800202420L,0x000020C08280241CL});
    public static final BitSet FOLLOW_params_in_funcall398 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_103_in_funcall401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_fragcall438 = new BitSet(new long[]{0x0020800000000000L});
    public static final BitSet FOLLOW_id_rule_in_fragcall442 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_fragcall444 = new BitSet(new long[]{0x4020800800202420L,0x000020C08280241CL});
    public static final BitSet FOLLOW_params_in_fragcall446 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_103_in_fragcall449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FRAGMENT_in_frag483 = new BitSet(new long[]{0x0020800000000000L});
    public static final BitSet FOLLOW_id_rule_in_frag486 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_frag488 = new BitSet(new long[]{0x0008004002002800L,0x0000008001000040L});
    public static final BitSet FOLLOW_list_arguments_in_frag491 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_103_in_frag493 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_frag496 = new BitSet(new long[]{0x002F80C002222E20L,0x0000545C2B210050L});
    public static final BitSet FOLLOW_list_music_inst_in_frag499 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_frag501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_argument_in_list_arguments521 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
    public static final BitSet FOLLOW_104_in_list_arguments524 = new BitSet(new long[]{0x0008004002002800L,0x0000000001000040L});
    public static final BitSet FOLLOW_argument_in_list_arguments526 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
    public static final BitSet FOLLOW_type_in_argument567 = new BitSet(new long[]{0x0020800000000000L});
    public static final BitSet FOLLOW_id_rule_in_argument570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_params597 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
    public static final BitSet FOLLOW_notes_variable_in_params601 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
    public static final BitSet FOLLOW_drumsnotes_variable_in_params605 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
    public static final BitSet FOLLOW_104_in_params609 = new BitSet(new long[]{0x4020800800202420L,0x000020408280241CL});
    public static final BitSet FOLLOW_expr_in_params613 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
    public static final BitSet FOLLOW_notes_variable_in_params617 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
    public static final BitSet FOLLOW_drumsnotes_variable_in_params621 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
    public static final BitSet FOLLOW_inst_in_listInst649 = new BitSet(new long[]{0x002F80C002822A02L,0x0000001C29752040L});
    public static final BitSet FOLLOW_music_inst_in_list_music_inst683 = new BitSet(new long[]{0x002F80C002222E22L,0x0000545C2B210050L});
    public static final BitSet FOLLOW_declaration_in_inst727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_volume_in_inst745 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_inst747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_inst765 = new BitSet(new long[]{0x4020800800202420L,0x000020408280241CL});
    public static final BitSet FOLLOW_expr_in_inst769 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_notes_variable_in_inst773 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_drumsnotes_variable_in_inst777 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_inst780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_READ_in_inst799 = new BitSet(new long[]{0x0020800000000000L});
    public static final BitSet FOLLOW_var_access_in_inst802 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_inst804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WRITE_in_inst822 = new BitSet(new long[]{0x4020800800202420L,0x000020408280241CL});
    public static final BitSet FOLLOW_expr_in_inst826 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_notes_variable_in_inst830 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_drumsnotes_variable_in_inst834 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_inst837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_funcall_in_inst855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tone_in_inst873 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_inst875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_beat_in_inst894 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_inst896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_speed_in_inst915 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_inst917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instrument_in_inst936 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_inst938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_transport_in_inst957 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_inst959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignation_in_inst978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_stmt_in_inst996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_inst1014 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_inst1016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_stmt_in_inst1035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_stmt_in_inst1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_song_in_inst1071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compas_aux_in_inst1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_music_inst1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_READ_in_music_inst1131 = new BitSet(new long[]{0x0020800000000000L});
    public static final BitSet FOLLOW_var_access_in_music_inst1134 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_music_inst1136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WRITE_in_music_inst1154 = new BitSet(new long[]{0x4020800800202420L,0x000020408280241CL});
    public static final BitSet FOLLOW_expr_in_music_inst1158 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_notes_variable_in_music_inst1162 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_drumsnotes_variable_in_music_inst1166 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_music_inst1169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_volume_in_music_inst1187 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_music_inst1189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tone_in_music_inst1208 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_music_inst1210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_beat_in_music_inst1229 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_music_inst1231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_speed_in_music_inst1250 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_music_inst1252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instrument_in_music_inst1271 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_music_inst1273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_transport_in_music_inst1292 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_music_inst1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_funcall_in_music_inst1313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignation_in_music_inst1331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_music_stmt_in_music_inst1349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_music_inst1367 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_music_inst1369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fragcall_in_music_inst1388 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_music_inst1390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_music_stmt_in_music_inst1409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_music_stmt_in_music_inst1427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notes_group_in_music_inst1454 = new BitSet(new long[]{0x0000000000002422L,0x00000C4002000010L});
    public static final BitSet FOLLOW_107_in_music_inst1458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_drumsnotes_group_in_music_inst1487 = new BitSet(new long[]{0x0000000000200002L,0x0000084000000000L});
    public static final BitSet FOLLOW_107_in_music_inst1491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_triplet_in_music_inst1511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_declaration1534 = new BitSet(new long[]{0x0020800000000000L});
    public static final BitSet FOLLOW_assig_opt_in_declaration1537 = new BitSet(new long[]{0x0000000000000000L,0x0000090000000000L});
    public static final BitSet FOLLOW_104_in_declaration1540 = new BitSet(new long[]{0x0020800000000000L});
    public static final BitSet FOLLOW_assig_opt_in_declaration1543 = new BitSet(new long[]{0x0000000000000000L,0x0000090000000000L});
    public static final BitSet FOLLOW_107_in_declaration1547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_type_void1711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOID_in_type_void1729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_rule_in_assig_opt1754 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ASSIG_in_assig_opt1757 = new BitSet(new long[]{0x4020800800202420L,0x000020408280241CL});
    public static final BitSet FOLLOW_expr_in_assig_opt1761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notes_variable_in_assig_opt1765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_drumsnotes_variable_in_assig_opt1769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assig_in_assignation1795 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_assignation1797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_access_in_assig1827 = new BitSet(new long[]{0x8000000000100040L,0x0000000000008802L});
    public static final BitSet FOLLOW_set_in_assig1829 = new BitSet(new long[]{0x4020802800202420L,0x000020408280241CL});
    public static final BitSet FOLLOW_expr_in_assig1845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notes_variable_in_assig1849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_drumsnotes_variable_in_assig1853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIGURE_NAME_in_assig1857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_post_in_assig1876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pre_in_assig1894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_rule_in_var_funcall1919 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_105_in_var_funcall1921 = new BitSet(new long[]{0x0020800000000000L});
    public static final BitSet FOLLOW_id_rule_in_var_funcall1925 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_var_funcall1927 = new BitSet(new long[]{0x4020800800202420L,0x000020C08280241CL});
    public static final BitSet FOLLOW_params_in_var_funcall1929 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_103_in_var_funcall1932 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_var_funcall1934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_rule_in_var_access1975 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_105_in_var_access1978 = new BitSet(new long[]{0x0020800000000000L});
    public static final BitSet FOLLOW_id_rule_in_var_access1982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_rule_in_var_access2011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID__in_id_rule2041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LETTER_X_in_id_rule2049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_access_in_post2088 = new BitSet(new long[]{0x0002000000020000L});
    public static final BitSet FOLLOW_INCR_in_post2093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECR_in_post2099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INCR_in_pre2146 = new BitSet(new long[]{0x0020800000000000L});
    public static final BitSet FOLLOW_DECR_in_pre2152 = new BitSet(new long[]{0x0020800000000000L});
    public static final BitSet FOLLOW_var_access_in_pre2155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BEAT_in_beat2198 = new BitSet(new long[]{0x4020800800000000L,0x000000408080240CL});
    public static final BitSet FOLLOW_num_expr_in_beat2201 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_106_in_beat2203 = new BitSet(new long[]{0x4020800800000000L,0x000000408080240CL});
    public static final BitSet FOLLOW_num_expr_in_beat2206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SPEED_in_speed2235 = new BitSet(new long[]{0x4020800800000000L,0x000000408080240CL});
    public static final BitSet FOLLOW_num_expr_in_speed2238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOLUME_in_volume2266 = new BitSet(new long[]{0x4020800800000000L,0x000000408080240CL});
    public static final BitSet FOLLOW_num_expr_in_volume2269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRANSPORT_in_transport2281 = new BitSet(new long[]{0x4020800800000000L,0x000000408080240CL});
    public static final BitSet FOLLOW_num_expr_in_transport2284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUMENT_in_instrument2308 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_STRING_in_instrument2311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_stmt2335 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_while_stmt2338 = new BitSet(new long[]{0x4020800800000000L,0x000000408080240CL});
    public static final BitSet FOLLOW_expr_in_while_stmt2341 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_103_in_while_stmt2343 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_while_stmt2346 = new BitSet(new long[]{0x002F80C002822A00L,0x0000001C29752040L});
    public static final BitSet FOLLOW_listInst_in_while_stmt2349 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_while_stmt2351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_music_stmt2378 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_while_music_stmt2381 = new BitSet(new long[]{0x4020800800000000L,0x000000408080240CL});
    public static final BitSet FOLLOW_expr_in_while_music_stmt2384 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_103_in_while_music_stmt2386 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_while_music_stmt2389 = new BitSet(new long[]{0x002F80C002222E20L,0x0000545C2B210050L});
    public static final BitSet FOLLOW_list_music_inst_in_while_music_stmt2392 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_while_music_stmt2394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_for_stmt2429 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_for_stmt2432 = new BitSet(new long[]{0x002A804002022800L,0x0000000001000040L});
    public static final BitSet FOLLOW_declaration_in_for_stmt2436 = new BitSet(new long[]{0x4020800800000000L,0x000000408080240CL});
    public static final BitSet FOLLOW_list_assig_in_for_stmt2440 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_for_stmt2442 = new BitSet(new long[]{0x4020800800000000L,0x000000408080240CL});
    public static final BitSet FOLLOW_expr_in_for_stmt2446 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_for_stmt2448 = new BitSet(new long[]{0x0022800000020000L});
    public static final BitSet FOLLOW_list_assig_in_for_stmt2451 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_103_in_for_stmt2453 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_for_stmt2456 = new BitSet(new long[]{0x002F80C002822A00L,0x0000001C29752040L});
    public static final BitSet FOLLOW_listInst_in_for_stmt2459 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_for_stmt2461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_for_music_stmt2486 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_for_music_stmt2489 = new BitSet(new long[]{0x002A804002022800L,0x0000000001000040L});
    public static final BitSet FOLLOW_declaration_in_for_music_stmt2493 = new BitSet(new long[]{0x4020800800000000L,0x000000408080240CL});
    public static final BitSet FOLLOW_list_assig_in_for_music_stmt2497 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_for_music_stmt2499 = new BitSet(new long[]{0x4020800800000000L,0x000000408080240CL});
    public static final BitSet FOLLOW_expr_in_for_music_stmt2503 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_for_music_stmt2505 = new BitSet(new long[]{0x0022800000020000L});
    public static final BitSet FOLLOW_list_assig_in_for_music_stmt2508 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_103_in_for_music_stmt2510 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_for_music_stmt2513 = new BitSet(new long[]{0x002F80C002222E20L,0x0000545C2B210050L});
    public static final BitSet FOLLOW_list_music_inst_in_for_music_stmt2516 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_for_music_stmt2518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assig_in_list_assig2547 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
    public static final BitSet FOLLOW_104_in_list_assig2550 = new BitSet(new long[]{0x0022800000020000L});
    public static final BitSet FOLLOW_assig_in_list_assig2552 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
    public static final BitSet FOLLOW_IF_in_if_stmt2590 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_if_stmt2593 = new BitSet(new long[]{0x4020800800000000L,0x000000408080240CL});
    public static final BitSet FOLLOW_expr_in_if_stmt2596 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_103_in_if_stmt2598 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_if_stmt2601 = new BitSet(new long[]{0x002F80C002822A00L,0x0000001C29752040L});
    public static final BitSet FOLLOW_listInst_in_if_stmt2604 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_if_stmt2606 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_elseif_stmt_in_if_stmt2609 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_else_stmt_in_if_stmt2612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_elseif_stmt2636 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_IF_in_elseif_stmt2638 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_elseif_stmt2640 = new BitSet(new long[]{0x4020800800000000L,0x000000408080240CL});
    public static final BitSet FOLLOW_expr_in_elseif_stmt2642 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_103_in_elseif_stmt2644 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_elseif_stmt2646 = new BitSet(new long[]{0x002F80C002822A00L,0x0000001C29752040L});
    public static final BitSet FOLLOW_listInst_in_elseif_stmt2648 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_elseif_stmt2650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_else_stmt2685 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_else_stmt2688 = new BitSet(new long[]{0x002F80C002822A00L,0x0000001C29752040L});
    public static final BitSet FOLLOW_listInst_in_else_stmt2691 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_else_stmt2693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_if_music_stmt2719 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_if_music_stmt2722 = new BitSet(new long[]{0x4020800800000000L,0x000000408080240CL});
    public static final BitSet FOLLOW_expr_in_if_music_stmt2725 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_103_in_if_music_stmt2727 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_if_music_stmt2730 = new BitSet(new long[]{0x002F80C002222E20L,0x0000545C2B210050L});
    public static final BitSet FOLLOW_list_music_inst_in_if_music_stmt2733 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_if_music_stmt2735 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_elseif_music_stmt_in_if_music_stmt2738 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_else_music_stmt_in_if_music_stmt2741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_elseif_music_stmt2771 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_IF_in_elseif_music_stmt2773 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_elseif_music_stmt2775 = new BitSet(new long[]{0x4020800800000000L,0x000000408080240CL});
    public static final BitSet FOLLOW_expr_in_elseif_music_stmt2777 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_103_in_elseif_music_stmt2779 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_elseif_music_stmt2781 = new BitSet(new long[]{0x002F80C002222E20L,0x0000545C2B210050L});
    public static final BitSet FOLLOW_list_music_inst_in_elseif_music_stmt2783 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_elseif_music_stmt2785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_else_music_stmt2826 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_else_music_stmt2829 = new BitSet(new long[]{0x002F80C002222E20L,0x0000545C2B210050L});
    public static final BitSet FOLLOW_list_music_inst_in_else_music_stmt2832 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_else_music_stmt2834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SONG_in_song2869 = new BitSet(new long[]{0x0020800000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_id_rule_in_song2872 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_song2875 = new BitSet(new long[]{0x0000000000000200L,0x0000000038200000L});
    public static final BitSet FOLLOW_beat_in_song2879 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_song2881 = new BitSet(new long[]{0x0000000000000000L,0x0000000038200000L});
    public static final BitSet FOLLOW_speed_in_song2887 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_song2889 = new BitSet(new long[]{0x0000000000000000L,0x0000000038000000L});
    public static final BitSet FOLLOW_tone_in_song2895 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_song2897 = new BitSet(new long[]{0x0000000000000000L,0x0000000030000000L});
    public static final BitSet FOLLOW_transport_in_song2903 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_song2905 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_track_in_song2912 = new BitSet(new long[]{0x0000000001000000L,0x0002000010000000L});
    public static final BitSet FOLLOW_drums_track_in_song2916 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_song2919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRACK_in_track2949 = new BitSet(new long[]{0x0020800000800000L,0x0000000000C02000L});
    public static final BitSet FOLLOW_id_rule_in_track2952 = new BitSet(new long[]{0x0000000000800000L,0x0000000000C02000L});
    public static final BitSet FOLLOW_STRING_in_track2956 = new BitSet(new long[]{0x0000000000800000L,0x0000000000402000L});
    public static final BitSet FOLLOW_compas_aux_in_track2959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DRUMS_in_drums_track2982 = new BitSet(new long[]{0x0000000000800000L,0x0000000000402000L});
    public static final BitSet FOLLOW_compas_aux_in_drums_track2985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compas_list_in_compas_aux3009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_BAR_in_compas_list3039 = new BitSet(new long[]{0x002F80C002A22E20L,0x0000545C2B612050L});
    public static final BitSet FOLLOW_repetition_in_compas_list3044 = new BitSet(new long[]{0x002F80C002A22E20L,0x0000545C2B612050L});
    public static final BitSet FOLLOW_compas_or_repetition_in_compas_list3047 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_DOUBLE_BAR_in_compas_list3050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compas_in_compasses3077 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_BAR_in_compasses3080 = new BitSet(new long[]{0x002F80C002222E20L,0x0000545C2B210050L});
    public static final BitSet FOLLOW_compas_in_compasses3083 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_POS_NUM_in_repetition3110 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_LETTER_X_in_repetition3112 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_START_REPETITION_in_repetition3116 = new BitSet(new long[]{0x002F80C002222E20L,0x0000545C2B612050L});
    public static final BitSet FOLLOW_repetition_aux_in_repetition3118 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_END_REPETITION_in_repetition3120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compas_or_repetition_in_repetition_aux3155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compasses_in_compas_or_repetition3172 = new BitSet(new long[]{0x002F80C002222E22L,0x0000545C2B612050L});
    public static final BitSet FOLLOW_repetition_in_compas_or_repetition3176 = new BitSet(new long[]{0x002F80C002222E22L,0x0000545C2B612050L});
    public static final BitSet FOLLOW_music_inst_in_compas3202 = new BitSet(new long[]{0x002F80C002222E22L,0x0000545C2B210050L});
    public static final BitSet FOLLOW_TONE_in_tone3246 = new BitSet(new long[]{0x4020800800000000L,0x000000408080240CL});
    public static final BitSet FOLLOW_expr_in_tone3249 = new BitSet(new long[]{0x0000000000000400L,0x0000000002000000L});
    public static final BitSet FOLLOW_set_in_tone3251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_drumsnotes_in_drumsnotes_group3278 = new BitSet(new long[]{0x0000000000000002L,0x0000020004000000L});
    public static final BitSet FOLLOW_105_in_drumsnotes_group3281 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_FIGURE_NAME_in_drumsnotes_group3284 = new BitSet(new long[]{0x0000000000400002L,0x0000000004002000L});
    public static final BitSet FOLLOW_POS_NUM_in_drumsnotes_group3286 = new BitSet(new long[]{0x0000000000400002L,0x0000000004000000L});
    public static final BitSet FOLLOW_DOT_in_drumsnotes_group3290 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_TIE_in_drumsnotes_group3295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notes_type_in_notes_group3336 = new BitSet(new long[]{0x0000000000000002L,0x0000020004000000L});
    public static final BitSet FOLLOW_105_in_notes_group3339 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_FIGURE_NAME_in_notes_group3342 = new BitSet(new long[]{0x0000000000400002L,0x0000000004002000L});
    public static final BitSet FOLLOW_POS_NUM_in_notes_group3344 = new BitSet(new long[]{0x0000000000400002L,0x0000000004000000L});
    public static final BitSet FOLLOW_DOT_in_notes_group3348 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_TIE_in_notes_group3353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_notes_group3385 = new BitSet(new long[]{0x0020800000000000L});
    public static final BitSet FOLLOW_id_rule_in_notes_group3388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_drumsnotes_in_drumsnotes_variable3415 = new BitSet(new long[]{0x0000000000000002L,0x0000020000000000L});
    public static final BitSet FOLLOW_105_in_drumsnotes_variable3418 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_FIGURE_NAME_in_drumsnotes_variable3421 = new BitSet(new long[]{0x0000000000400002L,0x0000000000002000L});
    public static final BitSet FOLLOW_POS_NUM_in_drumsnotes_variable3423 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_DOT_in_drumsnotes_variable3427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notes_type_in_notes_variable3480 = new BitSet(new long[]{0x0000000000000002L,0x0000020004000000L});
    public static final BitSet FOLLOW_105_in_notes_variable3483 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_FIGURE_NAME_in_notes_variable3486 = new BitSet(new long[]{0x0000000000400002L,0x0000000004002000L});
    public static final BitSet FOLLOW_POS_NUM_in_notes_variable3488 = new BitSet(new long[]{0x0000000000400002L,0x0000000004000000L});
    public static final BitSet FOLLOW_DOT_in_notes_variable3492 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_TIE_in_notes_variable3497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_notes_variable3537 = new BitSet(new long[]{0x0000000000000420L,0x0000000002000010L});
    public static final BitSet FOLLOW_note_in_notes_variable3540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_chord_in_notes_type3566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notes_in_notes_type3570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHORD_in_chord3599 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_chord3602 = new BitSet(new long[]{0x0000000000000420L,0x0000000002000010L});
    public static final BitSet FOLLOW_note_in_chord3605 = new BitSet(new long[]{0x3000000000040000L,0x0000008000080400L});
    public static final BitSet FOLLOW_103_in_chord3625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_notes3657 = new BitSet(new long[]{0x0000000000000420L,0x0000000002000010L});
    public static final BitSet FOLLOW_note_in_notes3660 = new BitSet(new long[]{0x0000000000000420L,0x0000008002000010L});
    public static final BitSet FOLLOW_103_in_notes3664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_note_in_notes3669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_triplet3706 = new BitSet(new long[]{0x0000000000002420L,0x0000004002000010L});
    public static final BitSet FOLLOW_notes_type_in_triplet3708 = new BitSet(new long[]{0x0000000000002420L,0x0000004002000010L});
    public static final BitSet FOLLOW_notes_type_in_triplet3710 = new BitSet(new long[]{0x0000000000002420L,0x0000004002000010L});
    public static final BitSet FOLLOW_notes_type_in_triplet3712 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_triplet3714 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_FIGURE_NAME_in_triplet3716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_drumsnotes3758 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_drum_note_in_drumsnotes3761 = new BitSet(new long[]{0x0000000000200000L,0x0000008000000000L});
    public static final BitSet FOLLOW_103_in_drumsnotes3765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_drum_note_in_drumsnotes3770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DN_in_drum_note3805 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_drum_note3807 = new BitSet(new long[]{0x4020800800000000L,0x000000408080240CL});
    public static final BitSet FOLLOW_num_expr_in_drum_note3809 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_103_in_drum_note3811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOTE_in_note3862 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_NEG_NUM_in_note3866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolterm_in_expr3895 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_OR_in_expr3898 = new BitSet(new long[]{0x4020800800000000L,0x000000408080240CL});
    public static final BitSet FOLLOW_boolterm_in_expr3901 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_boolfact_in_boolterm3919 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_boolterm3922 = new BitSet(new long[]{0x4020800800000000L,0x000000408080240CL});
    public static final BitSet FOLLOW_boolfact_in_boolterm3925 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_num_expr_in_boolfact3947 = new BitSet(new long[]{0x0810300200000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_EQUAL_in_boolfact3951 = new BitSet(new long[]{0x4020800800000000L,0x000000408080240CL});
    public static final BitSet FOLLOW_NOT_EQUAL_in_boolfact3956 = new BitSet(new long[]{0x4020800800000000L,0x000000408080240CL});
    public static final BitSet FOLLOW_LT_in_boolfact3961 = new BitSet(new long[]{0x4020800800000000L,0x000000408080240CL});
    public static final BitSet FOLLOW_LE_in_boolfact3966 = new BitSet(new long[]{0x4020800800000000L,0x000000408080240CL});
    public static final BitSet FOLLOW_GT_in_boolfact3971 = new BitSet(new long[]{0x4020800800000000L,0x000000408080240CL});
    public static final BitSet FOLLOW_GE_in_boolfact3976 = new BitSet(new long[]{0x4020800800000000L,0x000000408080240CL});
    public static final BitSet FOLLOW_num_expr_in_boolfact3980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_num_expr4002 = new BitSet(new long[]{0x4000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_PLUS_in_num_expr4007 = new BitSet(new long[]{0x4020800800000000L,0x000000408080240CL});
    public static final BitSet FOLLOW_MINUS_in_num_expr4012 = new BitSet(new long[]{0x4020800800000000L,0x000000408080240CL});
    public static final BitSet FOLLOW_term_in_num_expr4016 = new BitSet(new long[]{0x4000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_factor_in_term4038 = new BitSet(new long[]{0x0000000000480002L,0x0000000000000001L});
    public static final BitSet FOLLOW_DOT_in_term4043 = new BitSet(new long[]{0x4020800800000000L,0x000000408080240CL});
    public static final BitSet FOLLOW_DIV_in_term4048 = new BitSet(new long[]{0x4020800800000000L,0x000000408080240CL});
    public static final BitSet FOLLOW_MOD_in_term4053 = new BitSet(new long[]{0x4020800800000000L,0x000000408080240CL});
    public static final BitSet FOLLOW_factor_in_term4057 = new BitSet(new long[]{0x0000000000480002L,0x0000000000000001L});
    public static final BitSet FOLLOW_NOT_in_factor4074 = new BitSet(new long[]{0x0020800800000000L,0x0000004080802004L});
    public static final BitSet FOLLOW_PLUS_in_factor4079 = new BitSet(new long[]{0x0020800800000000L,0x0000004080802004L});
    public static final BitSet FOLLOW_MINUS_in_factor4084 = new BitSet(new long[]{0x0020800800000000L,0x0000004080802004L});
    public static final BitSet FOLLOW_atom_in_factor4089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_access_in_atom4105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nnum_in_atom4113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_atom4121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_atom4129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_atom4137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_atom4145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_atom4153 = new BitSet(new long[]{0x4020800800000000L,0x000000408080240CL});
    public static final BitSet FOLLOW_expr_in_atom4156 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_103_in_atom4158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POS_NUM_in_nnum4179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEG_NUM_in_nnum4185 = new BitSet(new long[]{0x0000000000000002L});

}