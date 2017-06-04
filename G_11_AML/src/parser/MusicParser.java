// $ANTLR 3.4 src/parser/Music.g 2017-06-02 21:45:13

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ARMOR", "ASSIG", "ATTR_ACCESS", "BAR", "BEAT", "BEMOL", "BOOL", "BOOLEAN", "CHORD", "COMMENT", "COMPAS", "COMPAS_LIST", "DECR", "DIMINUTION", "DIV", "DIVIDE_ASSIG", "DN", "DOT", "DOUBLE_BAR", "DRUMS", "DRUMS_NOTE_TYPE", "DRUMS_TRACK", "DRUM_FIGURE", "DRUM_NOTE", "DRUM_NOTES", "ELSE", "ELSEIF", "END_REPETITION", "EQUAL", "ESC_SEQ", "FALSE", "FIGURE", "FIGURE_NAME", "FIGURE_TYPE", "FOR", "FRAGCALL", "FRAGMENT", "FUNCALL", "FUNCTION", "GE", "GT", "ID", "ID_", "IF", "INCR", "INSTRUMENT", "INT", "LE", "LETTER_X", "LIST_ARGUMENTS", "LIST_ASSIG", "LIST_FUNCTIONS", "LIST_INSTRUCTIONS", "LIST_MUSIC_INST", "LT", "MAJ7", "MINOR", "MINUS", "MINUS_ASSIG", "MOD", "MOD_ASSIG", "NEG_NUM", "NOT", "NOTE", "NOTES", "NOTE_TYPE", "NOT_EQUAL", "NUM", "OR", "PLUS", "PLUS_ASSIG", "POST", "POS_NUM", "PRE", "PROD_ASSIG", "READ", "REPETITION", "RETURN", "SEVENTH", "SONG", "SPEED", "START_REPETITION", "STRING", "STRING_TYPE", "SUSTAIN", "TIE", "TONE", "TRACK", "TRANSPORT", "TRIPLET", "TRUE", "VAR_FUNCALL", "VOID", "VOLUME", "WHILE", "WRITE", "WS", "'('", "')'", "','", "'.'", "':'", "';'", "'DN:'", "'F:'", "'N:'", "'['", "']'", "'{'", "'}'"
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
    public static final int T__114=114;
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
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
        RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
        RewriteRuleTokenStream stream_103=new RewriteRuleTokenStream(adaptor,"token 103");
        RewriteRuleSubtreeStream stream_id_rule=new RewriteRuleSubtreeStream(adaptor,"rule id_rule");
        RewriteRuleSubtreeStream stream_listInst=new RewriteRuleSubtreeStream(adaptor,"rule listInst");
        RewriteRuleSubtreeStream stream_type_void=new RewriteRuleSubtreeStream(adaptor,"rule type_void");
        RewriteRuleSubtreeStream stream_list_arguments=new RewriteRuleSubtreeStream(adaptor,"rule list_arguments");
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


            char_literal10=(Token)match(input,113,FOLLOW_113_in_function344);  
            stream_113.add(char_literal10);


            pushFollow(FOLLOW_listInst_in_function346);
            listInst11=listInst();

            state._fsp--;

            stream_listInst.add(listInst11.getTree());

            char_literal12=(Token)match(input,114,FOLLOW_114_in_function348);  
            stream_114.add(char_literal12);


            // AST REWRITE
            // elements: listInst, list_arguments, type_void
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
        RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
        RewriteRuleTokenStream stream_103=new RewriteRuleTokenStream(adaptor,"token 103");
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

            if ( (LA3_0==ARMOR||LA3_0==BEMOL||LA3_0==CHORD||LA3_0==DN||LA3_0==FALSE||LA3_0==ID_||LA3_0==LETTER_X||LA3_0==MINUS||(LA3_0 >= NEG_NUM && LA3_0 <= NOTE)||LA3_0==PLUS||LA3_0==POS_NUM||LA3_0==STRING||LA3_0==SUSTAIN||LA3_0==TRUE||LA3_0==102||LA3_0==108||LA3_0==110) ) {
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
        RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
        RewriteRuleTokenStream stream_103=new RewriteRuleTokenStream(adaptor,"token 103");
        RewriteRuleTokenStream stream_109=new RewriteRuleTokenStream(adaptor,"token 109");
        RewriteRuleSubtreeStream stream_id_rule=new RewriteRuleSubtreeStream(adaptor,"rule id_rule");
        RewriteRuleSubtreeStream stream_params=new RewriteRuleSubtreeStream(adaptor,"rule params");
        try {
            // src/parser/Music.g:61:14: ( 'F:' id= id_rule '(' ( params )? ')' -> ^( FRAGCALL[$id.text] ( params )? ) )
            // src/parser/Music.g:61:18: 'F:' id= id_rule '(' ( params )? ')'
            {
            string_literal16=(Token)match(input,109,FOLLOW_109_in_fragcall438);  
            stream_109.add(string_literal16);


            pushFollow(FOLLOW_id_rule_in_fragcall442);
            id=id_rule();

            state._fsp--;

            stream_id_rule.add(id.getTree());

            char_literal17=(Token)match(input,102,FOLLOW_102_in_fragcall444);  
            stream_102.add(char_literal17);


            // src/parser/Music.g:61:38: ( params )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==ARMOR||LA4_0==BEMOL||LA4_0==CHORD||LA4_0==DN||LA4_0==FALSE||LA4_0==ID_||LA4_0==LETTER_X||LA4_0==MINUS||(LA4_0 >= NEG_NUM && LA4_0 <= NOTE)||LA4_0==PLUS||LA4_0==POS_NUM||LA4_0==STRING||LA4_0==SUSTAIN||LA4_0==TRUE||LA4_0==102||LA4_0==108||LA4_0==110) ) {
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

            char_literal25=(Token)match(input,113,FOLLOW_113_in_frag496); 

            pushFollow(FOLLOW_list_music_inst_in_frag499);
            list_music_inst26=list_music_inst();

            state._fsp--;

            adaptor.addChild(root_0, list_music_inst26.getTree());

            char_literal27=(Token)match(input,114,FOLLOW_114_in_frag501); 

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
    // src/parser/Music.g:73:1: params : ( expr | notes_variable ) ( ',' ! ( expr | notes_variable ) )* ;
    public final MusicParser.params_return params() throws RecognitionException {
        MusicParser.params_return retval = new MusicParser.params_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal35=null;
        MusicParser.expr_return expr33 =null;

        MusicParser.notes_variable_return notes_variable34 =null;

        MusicParser.expr_return expr36 =null;

        MusicParser.notes_variable_return notes_variable37 =null;


        AmlTree char_literal35_tree=null;

        try {
            // src/parser/Music.g:73:13: ( ( expr | notes_variable ) ( ',' ! ( expr | notes_variable ) )* )
            // src/parser/Music.g:73:17: ( expr | notes_variable ) ( ',' ! ( expr | notes_variable ) )*
            {
            root_0 = (AmlTree)adaptor.nil();


            // src/parser/Music.g:73:17: ( expr | notes_variable )
            int alt7=2;
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
            case 110:
                {
                int LA7_2 = input.LA(2);

                if ( (LA7_2==ARMOR||LA7_2==BEMOL||LA7_2==NOTE||LA7_2==SUSTAIN) ) {
                    alt7=1;
                }
                else if ( (LA7_2==ID_||LA7_2==LETTER_X) ) {
                    alt7=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 2, input);

                    throw nvae;

                }
                }
                break;
            case 108:
                {
                int LA7_3 = input.LA(2);

                if ( (LA7_3==DN) ) {
                    alt7=1;
                }
                else if ( (LA7_3==ID_||LA7_3==LETTER_X) ) {
                    alt7=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 3, input);

                    throw nvae;

                }
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
                case 110:
                    {
                    int LA7_6 = input.LA(3);

                    if ( (LA7_6==ARMOR||LA7_6==BEMOL||LA7_6==NOTE||LA7_6==SUSTAIN) ) {
                        alt7=1;
                    }
                    else if ( (LA7_6==ID_||LA7_6==LETTER_X) ) {
                        alt7=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 6, input);

                        throw nvae;

                    }
                    }
                    break;
                case 108:
                    {
                    int LA7_7 = input.LA(3);

                    if ( (LA7_7==DN) ) {
                        alt7=1;
                    }
                    else if ( (LA7_7==ID_||LA7_7==LETTER_X) ) {
                        alt7=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 7, input);

                        throw nvae;

                    }
                    }
                    break;
                case ARMOR:
                case BEMOL:
                case DN:
                case NOTE:
                case SUSTAIN:
                    {
                    alt7=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 4, input);

                    throw nvae;

                }

                }
                break;
            case ARMOR:
            case BEMOL:
            case CHORD:
            case DN:
            case NOTE:
            case SUSTAIN:
                {
                alt7=2;
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

            }


            // src/parser/Music.g:73:41: ( ',' ! ( expr | notes_variable ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==104) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // src/parser/Music.g:73:42: ',' ! ( expr | notes_variable )
            	    {
            	    char_literal35=(Token)match(input,104,FOLLOW_104_in_params605); 

            	    // src/parser/Music.g:73:47: ( expr | notes_variable )
            	    int alt8=2;
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
            	    case 110:
            	        {
            	        int LA8_2 = input.LA(2);

            	        if ( (LA8_2==ARMOR||LA8_2==BEMOL||LA8_2==NOTE||LA8_2==SUSTAIN) ) {
            	            alt8=1;
            	        }
            	        else if ( (LA8_2==ID_||LA8_2==LETTER_X) ) {
            	            alt8=2;
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 8, 2, input);

            	            throw nvae;

            	        }
            	        }
            	        break;
            	    case 108:
            	        {
            	        int LA8_3 = input.LA(2);

            	        if ( (LA8_3==DN) ) {
            	            alt8=1;
            	        }
            	        else if ( (LA8_3==ID_||LA8_3==LETTER_X) ) {
            	            alt8=2;
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 8, 3, input);

            	            throw nvae;

            	        }
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
            	        case 110:
            	            {
            	            int LA8_6 = input.LA(3);

            	            if ( (LA8_6==ARMOR||LA8_6==BEMOL||LA8_6==NOTE||LA8_6==SUSTAIN) ) {
            	                alt8=1;
            	            }
            	            else if ( (LA8_6==ID_||LA8_6==LETTER_X) ) {
            	                alt8=2;
            	            }
            	            else {
            	                NoViableAltException nvae =
            	                    new NoViableAltException("", 8, 6, input);

            	                throw nvae;

            	            }
            	            }
            	            break;
            	        case 108:
            	            {
            	            int LA8_7 = input.LA(3);

            	            if ( (LA8_7==DN) ) {
            	                alt8=1;
            	            }
            	            else if ( (LA8_7==ID_||LA8_7==LETTER_X) ) {
            	                alt8=2;
            	            }
            	            else {
            	                NoViableAltException nvae =
            	                    new NoViableAltException("", 8, 7, input);

            	                throw nvae;

            	            }
            	            }
            	            break;
            	        case ARMOR:
            	        case BEMOL:
            	        case DN:
            	        case NOTE:
            	        case SUSTAIN:
            	            {
            	            alt8=2;
            	            }
            	            break;
            	        default:
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 8, 4, input);

            	            throw nvae;

            	        }

            	        }
            	        break;
            	    case ARMOR:
            	    case BEMOL:
            	    case CHORD:
            	    case DN:
            	    case NOTE:
            	    case SUSTAIN:
            	        {
            	        alt8=2;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 8, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt8) {
            	        case 1 :
            	            // src/parser/Music.g:73:48: expr
            	            {
            	            pushFollow(FOLLOW_expr_in_params609);
            	            expr36=expr();

            	            state._fsp--;

            	            adaptor.addChild(root_0, expr36.getTree());

            	            }
            	            break;
            	        case 2 :
            	            // src/parser/Music.g:73:55: notes_variable
            	            {
            	            pushFollow(FOLLOW_notes_variable_in_params613);
            	            notes_variable37=notes_variable();

            	            state._fsp--;

            	            adaptor.addChild(root_0, notes_variable37.getTree());

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

        MusicParser.inst_return inst38 =null;


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
            	    pushFollow(FOLLOW_inst_in_listInst641);
            	    inst38=inst();

            	    state._fsp--;

            	    stream_inst.add(inst38.getTree());

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

        MusicParser.music_inst_return music_inst39 =null;


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

                if ( (LA11_0==ARMOR||(LA11_0 >= BEAT && LA11_0 <= BOOL)||LA11_0==CHORD||LA11_0==DECR||LA11_0==DN||LA11_0==DRUMS_NOTE_TYPE||(LA11_0 >= FIGURE_TYPE && LA11_0 <= FOR)||(LA11_0 >= ID_ && LA11_0 <= INT)||LA11_0==LETTER_X||LA11_0==NOTE||LA11_0==NOTE_TYPE||LA11_0==READ||LA11_0==SPEED||(LA11_0 >= STRING_TYPE && LA11_0 <= SUSTAIN)||LA11_0==TONE||LA11_0==TRANSPORT||(LA11_0 >= VOLUME && LA11_0 <= WRITE)||LA11_0==102||LA11_0==106||(LA11_0 >= 108 && LA11_0 <= 111)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // src/parser/Music.g:79:21: music_inst
            	    {
            	    pushFollow(FOLLOW_music_inst_in_list_music_inst675);
            	    music_inst39=music_inst();

            	    state._fsp--;

            	    stream_music_inst.add(music_inst39.getTree());

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
    // src/parser/Music.g:82:1: inst : ( declaration | volume ';' | 'return' ^ ( expr | notes_variable ) ';' !| READ ^ var_access ';' | WRITE ^ ( expr | notes_variable ) ';' | var_funcall ';' | tone ';' !| beat ';' !| speed ';' !| instrument ';' !| transport ';' !| assignation | while_stmt | funcall ';' !| for_stmt | if_stmt | song | compas_aux );
    public final MusicParser.inst_return inst() throws RecognitionException {
        MusicParser.inst_return retval = new MusicParser.inst_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal42=null;
        Token string_literal43=null;
        Token char_literal46=null;
        Token READ47=null;
        Token char_literal49=null;
        Token WRITE50=null;
        Token char_literal53=null;
        Token char_literal55=null;
        Token char_literal57=null;
        Token char_literal59=null;
        Token char_literal61=null;
        Token char_literal63=null;
        Token char_literal65=null;
        Token char_literal69=null;
        MusicParser.declaration_return declaration40 =null;

        MusicParser.volume_return volume41 =null;

        MusicParser.expr_return expr44 =null;

        MusicParser.notes_variable_return notes_variable45 =null;

        MusicParser.var_access_return var_access48 =null;

        MusicParser.expr_return expr51 =null;

        MusicParser.notes_variable_return notes_variable52 =null;

        MusicParser.var_funcall_return var_funcall54 =null;

        MusicParser.tone_return tone56 =null;

        MusicParser.beat_return beat58 =null;

        MusicParser.speed_return speed60 =null;

        MusicParser.instrument_return instrument62 =null;

        MusicParser.transport_return transport64 =null;

        MusicParser.assignation_return assignation66 =null;

        MusicParser.while_stmt_return while_stmt67 =null;

        MusicParser.funcall_return funcall68 =null;

        MusicParser.for_stmt_return for_stmt70 =null;

        MusicParser.if_stmt_return if_stmt71 =null;

        MusicParser.song_return song72 =null;

        MusicParser.compas_aux_return compas_aux73 =null;


        AmlTree char_literal42_tree=null;
        AmlTree string_literal43_tree=null;
        AmlTree char_literal46_tree=null;
        AmlTree READ47_tree=null;
        AmlTree char_literal49_tree=null;
        AmlTree WRITE50_tree=null;
        AmlTree char_literal53_tree=null;
        AmlTree char_literal55_tree=null;
        AmlTree char_literal57_tree=null;
        AmlTree char_literal59_tree=null;
        AmlTree char_literal61_tree=null;
        AmlTree char_literal63_tree=null;
        AmlTree char_literal65_tree=null;
        AmlTree char_literal69_tree=null;

        try {
            // src/parser/Music.g:82:13: ( declaration | volume ';' | 'return' ^ ( expr | notes_variable ) ';' !| READ ^ var_access ';' | WRITE ^ ( expr | notes_variable ) ';' | var_funcall ';' | tone ';' !| beat ';' !| speed ';' !| instrument ';' !| transport ';' !| assignation | while_stmt | funcall ';' !| for_stmt | if_stmt | song | compas_aux )
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


                    pushFollow(FOLLOW_declaration_in_inst719);
                    declaration40=declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, declaration40.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:83:17: volume ';'
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_volume_in_inst737);
                    volume41=volume();

                    state._fsp--;

                    adaptor.addChild(root_0, volume41.getTree());

                    char_literal42=(Token)match(input,107,FOLLOW_107_in_inst739); 
                    char_literal42_tree = 
                    (AmlTree)adaptor.create(char_literal42)
                    ;
                    adaptor.addChild(root_0, char_literal42_tree);


                    }
                    break;
                case 3 :
                    // src/parser/Music.g:84:17: 'return' ^ ( expr | notes_variable ) ';' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    string_literal43=(Token)match(input,RETURN,FOLLOW_RETURN_in_inst757); 
                    string_literal43_tree = 
                    (AmlTree)adaptor.create(string_literal43)
                    ;
                    root_0 = (AmlTree)adaptor.becomeRoot(string_literal43_tree, root_0);


                    // src/parser/Music.g:84:27: ( expr | notes_variable )
                    int alt12=2;
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
                    case 110:
                        {
                        int LA12_2 = input.LA(2);

                        if ( (LA12_2==ARMOR||LA12_2==BEMOL||LA12_2==NOTE||LA12_2==SUSTAIN) ) {
                            alt12=1;
                        }
                        else if ( (LA12_2==ID_||LA12_2==LETTER_X) ) {
                            alt12=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 12, 2, input);

                            throw nvae;

                        }
                        }
                        break;
                    case 108:
                        {
                        int LA12_3 = input.LA(2);

                        if ( (LA12_3==DN) ) {
                            alt12=1;
                        }
                        else if ( (LA12_3==ID_||LA12_3==LETTER_X) ) {
                            alt12=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 12, 3, input);

                            throw nvae;

                        }
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
                        case 110:
                            {
                            int LA12_6 = input.LA(3);

                            if ( (LA12_6==ARMOR||LA12_6==BEMOL||LA12_6==NOTE||LA12_6==SUSTAIN) ) {
                                alt12=1;
                            }
                            else if ( (LA12_6==ID_||LA12_6==LETTER_X) ) {
                                alt12=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 12, 6, input);

                                throw nvae;

                            }
                            }
                            break;
                        case 108:
                            {
                            int LA12_7 = input.LA(3);

                            if ( (LA12_7==DN) ) {
                                alt12=1;
                            }
                            else if ( (LA12_7==ID_||LA12_7==LETTER_X) ) {
                                alt12=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 12, 7, input);

                                throw nvae;

                            }
                            }
                            break;
                        case ARMOR:
                        case BEMOL:
                        case DN:
                        case NOTE:
                        case SUSTAIN:
                            {
                            alt12=2;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 12, 4, input);

                            throw nvae;

                        }

                        }
                        break;
                    case ARMOR:
                    case BEMOL:
                    case CHORD:
                    case DN:
                    case NOTE:
                    case SUSTAIN:
                        {
                        alt12=2;
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
                            pushFollow(FOLLOW_expr_in_inst761);
                            expr44=expr();

                            state._fsp--;

                            adaptor.addChild(root_0, expr44.getTree());

                            }
                            break;
                        case 2 :
                            // src/parser/Music.g:84:35: notes_variable
                            {
                            pushFollow(FOLLOW_notes_variable_in_inst765);
                            notes_variable45=notes_variable();

                            state._fsp--;

                            adaptor.addChild(root_0, notes_variable45.getTree());

                            }
                            break;

                    }


                    char_literal46=(Token)match(input,107,FOLLOW_107_in_inst768); 

                    }
                    break;
                case 4 :
                    // src/parser/Music.g:85:17: READ ^ var_access ';'
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    READ47=(Token)match(input,READ,FOLLOW_READ_in_inst787); 
                    READ47_tree = 
                    (AmlTree)adaptor.create(READ47)
                    ;
                    root_0 = (AmlTree)adaptor.becomeRoot(READ47_tree, root_0);


                    pushFollow(FOLLOW_var_access_in_inst790);
                    var_access48=var_access();

                    state._fsp--;

                    adaptor.addChild(root_0, var_access48.getTree());

                    char_literal49=(Token)match(input,107,FOLLOW_107_in_inst792); 
                    char_literal49_tree = 
                    (AmlTree)adaptor.create(char_literal49)
                    ;
                    adaptor.addChild(root_0, char_literal49_tree);


                    }
                    break;
                case 5 :
                    // src/parser/Music.g:86:17: WRITE ^ ( expr | notes_variable ) ';'
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    WRITE50=(Token)match(input,WRITE,FOLLOW_WRITE_in_inst810); 
                    WRITE50_tree = 
                    (AmlTree)adaptor.create(WRITE50)
                    ;
                    root_0 = (AmlTree)adaptor.becomeRoot(WRITE50_tree, root_0);


                    // src/parser/Music.g:86:24: ( expr | notes_variable )
                    int alt13=2;
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
                    case 110:
                        {
                        int LA13_2 = input.LA(2);

                        if ( (LA13_2==ARMOR||LA13_2==BEMOL||LA13_2==NOTE||LA13_2==SUSTAIN) ) {
                            alt13=1;
                        }
                        else if ( (LA13_2==ID_||LA13_2==LETTER_X) ) {
                            alt13=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 13, 2, input);

                            throw nvae;

                        }
                        }
                        break;
                    case 108:
                        {
                        int LA13_3 = input.LA(2);

                        if ( (LA13_3==DN) ) {
                            alt13=1;
                        }
                        else if ( (LA13_3==ID_||LA13_3==LETTER_X) ) {
                            alt13=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 13, 3, input);

                            throw nvae;

                        }
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
                        case 110:
                            {
                            int LA13_6 = input.LA(3);

                            if ( (LA13_6==ARMOR||LA13_6==BEMOL||LA13_6==NOTE||LA13_6==SUSTAIN) ) {
                                alt13=1;
                            }
                            else if ( (LA13_6==ID_||LA13_6==LETTER_X) ) {
                                alt13=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 13, 6, input);

                                throw nvae;

                            }
                            }
                            break;
                        case 108:
                            {
                            int LA13_7 = input.LA(3);

                            if ( (LA13_7==DN) ) {
                                alt13=1;
                            }
                            else if ( (LA13_7==ID_||LA13_7==LETTER_X) ) {
                                alt13=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 13, 7, input);

                                throw nvae;

                            }
                            }
                            break;
                        case ARMOR:
                        case BEMOL:
                        case DN:
                        case NOTE:
                        case SUSTAIN:
                            {
                            alt13=2;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 13, 4, input);

                            throw nvae;

                        }

                        }
                        break;
                    case ARMOR:
                    case BEMOL:
                    case CHORD:
                    case DN:
                    case NOTE:
                    case SUSTAIN:
                        {
                        alt13=2;
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
                            pushFollow(FOLLOW_expr_in_inst814);
                            expr51=expr();

                            state._fsp--;

                            adaptor.addChild(root_0, expr51.getTree());

                            }
                            break;
                        case 2 :
                            // src/parser/Music.g:86:32: notes_variable
                            {
                            pushFollow(FOLLOW_notes_variable_in_inst818);
                            notes_variable52=notes_variable();

                            state._fsp--;

                            adaptor.addChild(root_0, notes_variable52.getTree());

                            }
                            break;

                    }


                    char_literal53=(Token)match(input,107,FOLLOW_107_in_inst821); 
                    char_literal53_tree = 
                    (AmlTree)adaptor.create(char_literal53)
                    ;
                    adaptor.addChild(root_0, char_literal53_tree);


                    }
                    break;
                case 6 :
                    // src/parser/Music.g:87:17: var_funcall ';'
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_var_funcall_in_inst839);
                    var_funcall54=var_funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, var_funcall54.getTree());

                    char_literal55=(Token)match(input,107,FOLLOW_107_in_inst841); 
                    char_literal55_tree = 
                    (AmlTree)adaptor.create(char_literal55)
                    ;
                    adaptor.addChild(root_0, char_literal55_tree);


                    }
                    break;
                case 7 :
                    // src/parser/Music.g:88:17: tone ';' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_tone_in_inst859);
                    tone56=tone();

                    state._fsp--;

                    adaptor.addChild(root_0, tone56.getTree());

                    char_literal57=(Token)match(input,107,FOLLOW_107_in_inst861); 

                    }
                    break;
                case 8 :
                    // src/parser/Music.g:89:17: beat ';' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_beat_in_inst880);
                    beat58=beat();

                    state._fsp--;

                    adaptor.addChild(root_0, beat58.getTree());

                    char_literal59=(Token)match(input,107,FOLLOW_107_in_inst882); 

                    }
                    break;
                case 9 :
                    // src/parser/Music.g:90:17: speed ';' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_speed_in_inst901);
                    speed60=speed();

                    state._fsp--;

                    adaptor.addChild(root_0, speed60.getTree());

                    char_literal61=(Token)match(input,107,FOLLOW_107_in_inst903); 

                    }
                    break;
                case 10 :
                    // src/parser/Music.g:91:17: instrument ';' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_instrument_in_inst922);
                    instrument62=instrument();

                    state._fsp--;

                    adaptor.addChild(root_0, instrument62.getTree());

                    char_literal63=(Token)match(input,107,FOLLOW_107_in_inst924); 

                    }
                    break;
                case 11 :
                    // src/parser/Music.g:92:17: transport ';' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_transport_in_inst943);
                    transport64=transport();

                    state._fsp--;

                    adaptor.addChild(root_0, transport64.getTree());

                    char_literal65=(Token)match(input,107,FOLLOW_107_in_inst945); 

                    }
                    break;
                case 12 :
                    // src/parser/Music.g:93:17: assignation
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_assignation_in_inst964);
                    assignation66=assignation();

                    state._fsp--;

                    adaptor.addChild(root_0, assignation66.getTree());

                    }
                    break;
                case 13 :
                    // src/parser/Music.g:94:17: while_stmt
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_while_stmt_in_inst982);
                    while_stmt67=while_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, while_stmt67.getTree());

                    }
                    break;
                case 14 :
                    // src/parser/Music.g:95:17: funcall ';' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_inst1000);
                    funcall68=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall68.getTree());

                    char_literal69=(Token)match(input,107,FOLLOW_107_in_inst1002); 

                    }
                    break;
                case 15 :
                    // src/parser/Music.g:96:17: for_stmt
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_for_stmt_in_inst1021);
                    for_stmt70=for_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, for_stmt70.getTree());

                    }
                    break;
                case 16 :
                    // src/parser/Music.g:97:17: if_stmt
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_if_stmt_in_inst1039);
                    if_stmt71=if_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, if_stmt71.getTree());

                    }
                    break;
                case 17 :
                    // src/parser/Music.g:98:17: song
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_song_in_inst1057);
                    song72=song();

                    state._fsp--;

                    adaptor.addChild(root_0, song72.getTree());

                    }
                    break;
                case 18 :
                    // src/parser/Music.g:99:17: compas_aux
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_compas_aux_in_inst1075);
                    compas_aux73=compas_aux();

                    state._fsp--;

                    adaptor.addChild(root_0, compas_aux73.getTree());

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
    // src/parser/Music.g:102:1: music_inst : ( declaration | READ ^ var_access ';' | WRITE ^ ( expr | notes_variable ) ';' | volume ';' !| tone ';' !| beat ';' !| speed ';' !| instrument ';' !| transport ';' !| var_funcall ';' | assignation | while_music_stmt | funcall ';' !| fragcall ';' !| for_music_stmt | if_music_stmt | ( options {greedy=true; } : notes_group )+ ( ';' !)? | triplet );
    public final MusicParser.music_inst_return music_inst() throws RecognitionException {
        MusicParser.music_inst_return retval = new MusicParser.music_inst_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token READ75=null;
        Token char_literal77=null;
        Token WRITE78=null;
        Token char_literal81=null;
        Token char_literal83=null;
        Token char_literal85=null;
        Token char_literal87=null;
        Token char_literal89=null;
        Token char_literal91=null;
        Token char_literal93=null;
        Token char_literal95=null;
        Token char_literal99=null;
        Token char_literal101=null;
        Token char_literal105=null;
        MusicParser.declaration_return declaration74 =null;

        MusicParser.var_access_return var_access76 =null;

        MusicParser.expr_return expr79 =null;

        MusicParser.notes_variable_return notes_variable80 =null;

        MusicParser.volume_return volume82 =null;

        MusicParser.tone_return tone84 =null;

        MusicParser.beat_return beat86 =null;

        MusicParser.speed_return speed88 =null;

        MusicParser.instrument_return instrument90 =null;

        MusicParser.transport_return transport92 =null;

        MusicParser.var_funcall_return var_funcall94 =null;

        MusicParser.assignation_return assignation96 =null;

        MusicParser.while_music_stmt_return while_music_stmt97 =null;

        MusicParser.funcall_return funcall98 =null;

        MusicParser.fragcall_return fragcall100 =null;

        MusicParser.for_music_stmt_return for_music_stmt102 =null;

        MusicParser.if_music_stmt_return if_music_stmt103 =null;

        MusicParser.notes_group_return notes_group104 =null;

        MusicParser.triplet_return triplet106 =null;


        AmlTree READ75_tree=null;
        AmlTree char_literal77_tree=null;
        AmlTree WRITE78_tree=null;
        AmlTree char_literal81_tree=null;
        AmlTree char_literal83_tree=null;
        AmlTree char_literal85_tree=null;
        AmlTree char_literal87_tree=null;
        AmlTree char_literal89_tree=null;
        AmlTree char_literal91_tree=null;
        AmlTree char_literal93_tree=null;
        AmlTree char_literal95_tree=null;
        AmlTree char_literal99_tree=null;
        AmlTree char_literal101_tree=null;
        AmlTree char_literal105_tree=null;

        try {
            // src/parser/Music.g:102:13: ( declaration | READ ^ var_access ';' | WRITE ^ ( expr | notes_variable ) ';' | volume ';' !| tone ';' !| beat ';' !| speed ';' !| instrument ';' !| transport ';' !| var_funcall ';' | assignation | while_music_stmt | funcall ';' !| fragcall ';' !| for_music_stmt | if_music_stmt | ( options {greedy=true; } : notes_group )+ ( ';' !)? | triplet )
            int alt18=18;
            switch ( input.LA(1) ) {
            case CHORD:
                {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==102) ) {
                    alt18=17;
                }
                else if ( (LA18_1==ID_||LA18_1==LETTER_X) ) {
                    alt18=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;

                }
                }
                break;
            case READ:
                {
                alt18=2;
                }
                break;
            case WRITE:
                {
                alt18=3;
                }
                break;
            case VOLUME:
                {
                alt18=4;
                }
                break;
            case TONE:
                {
                alt18=5;
                }
                break;
            case BEAT:
                {
                alt18=6;
                }
                break;
            case SPEED:
                {
                alt18=7;
                }
                break;
            case INSTRUMENT:
                {
                alt18=8;
                }
                break;
            case TRANSPORT:
                {
                alt18=9;
                }
                break;
            case ID_:
                {
                switch ( input.LA(2) ) {
                case 105:
                    {
                    int LA18_20 = input.LA(3);

                    if ( (LA18_20==ID_) ) {
                        int LA18_22 = input.LA(4);

                        if ( (LA18_22==102) ) {
                            alt18=10;
                        }
                        else if ( (LA18_22==ASSIG||LA18_22==DECR||LA18_22==DIVIDE_ASSIG||LA18_22==INCR||LA18_22==MINUS_ASSIG||LA18_22==MOD_ASSIG||LA18_22==PLUS_ASSIG||LA18_22==PROD_ASSIG) ) {
                            alt18=11;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 18, 22, input);

                            throw nvae;

                        }
                    }
                    else if ( (LA18_20==LETTER_X) ) {
                        int LA18_23 = input.LA(4);

                        if ( (LA18_23==102) ) {
                            alt18=10;
                        }
                        else if ( (LA18_23==ASSIG||LA18_23==DECR||LA18_23==DIVIDE_ASSIG||LA18_23==INCR||LA18_23==MINUS_ASSIG||LA18_23==MOD_ASSIG||LA18_23==PLUS_ASSIG||LA18_23==PROD_ASSIG) ) {
                            alt18=11;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 18, 23, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 20, input);

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
                    alt18=11;
                    }
                    break;
                case 102:
                    {
                    alt18=13;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 10, input);

                    throw nvae;

                }

                }
                break;
            case LETTER_X:
                {
                switch ( input.LA(2) ) {
                case 105:
                    {
                    int LA18_20 = input.LA(3);

                    if ( (LA18_20==ID_) ) {
                        int LA18_22 = input.LA(4);

                        if ( (LA18_22==102) ) {
                            alt18=10;
                        }
                        else if ( (LA18_22==ASSIG||LA18_22==DECR||LA18_22==DIVIDE_ASSIG||LA18_22==INCR||LA18_22==MINUS_ASSIG||LA18_22==MOD_ASSIG||LA18_22==PLUS_ASSIG||LA18_22==PROD_ASSIG) ) {
                            alt18=11;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 18, 22, input);

                            throw nvae;

                        }
                    }
                    else if ( (LA18_20==LETTER_X) ) {
                        int LA18_23 = input.LA(4);

                        if ( (LA18_23==102) ) {
                            alt18=10;
                        }
                        else if ( (LA18_23==ASSIG||LA18_23==DECR||LA18_23==DIVIDE_ASSIG||LA18_23==INCR||LA18_23==MINUS_ASSIG||LA18_23==MOD_ASSIG||LA18_23==PLUS_ASSIG||LA18_23==PROD_ASSIG) ) {
                            alt18=11;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 18, 23, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 20, input);

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
                    alt18=11;
                    }
                    break;
                case 102:
                    {
                    alt18=13;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 11, input);

                    throw nvae;

                }

                }
                break;
            case DECR:
            case INCR:
                {
                alt18=11;
                }
                break;
            case WHILE:
                {
                alt18=12;
                }
                break;
            case 109:
                {
                alt18=14;
                }
                break;
            case FOR:
                {
                alt18=15;
                }
                break;
            case IF:
                {
                alt18=16;
                }
                break;
            case BOOL:
            case DRUMS_NOTE_TYPE:
            case FIGURE_TYPE:
            case INT:
            case NOTE_TYPE:
            case STRING_TYPE:
                {
                alt18=1;
                }
                break;
            case ARMOR:
            case BEMOL:
            case DN:
            case NOTE:
            case SUSTAIN:
            case 102:
            case 106:
            case 108:
            case 110:
                {
                alt18=17;
                }
                break;
            case 111:
                {
                alt18=18;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }

            switch (alt18) {
                case 1 :
                    // src/parser/Music.g:102:17: declaration
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_declaration_in_music_inst1099);
                    declaration74=declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, declaration74.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:103:17: READ ^ var_access ';'
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    READ75=(Token)match(input,READ,FOLLOW_READ_in_music_inst1117); 
                    READ75_tree = 
                    (AmlTree)adaptor.create(READ75)
                    ;
                    root_0 = (AmlTree)adaptor.becomeRoot(READ75_tree, root_0);


                    pushFollow(FOLLOW_var_access_in_music_inst1120);
                    var_access76=var_access();

                    state._fsp--;

                    adaptor.addChild(root_0, var_access76.getTree());

                    char_literal77=(Token)match(input,107,FOLLOW_107_in_music_inst1122); 
                    char_literal77_tree = 
                    (AmlTree)adaptor.create(char_literal77)
                    ;
                    adaptor.addChild(root_0, char_literal77_tree);


                    }
                    break;
                case 3 :
                    // src/parser/Music.g:104:17: WRITE ^ ( expr | notes_variable ) ';'
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    WRITE78=(Token)match(input,WRITE,FOLLOW_WRITE_in_music_inst1140); 
                    WRITE78_tree = 
                    (AmlTree)adaptor.create(WRITE78)
                    ;
                    root_0 = (AmlTree)adaptor.becomeRoot(WRITE78_tree, root_0);


                    // src/parser/Music.g:104:24: ( expr | notes_variable )
                    int alt15=2;
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
                    case 110:
                        {
                        int LA15_2 = input.LA(2);

                        if ( (LA15_2==ARMOR||LA15_2==BEMOL||LA15_2==NOTE||LA15_2==SUSTAIN) ) {
                            alt15=1;
                        }
                        else if ( (LA15_2==ID_||LA15_2==LETTER_X) ) {
                            alt15=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 15, 2, input);

                            throw nvae;

                        }
                        }
                        break;
                    case 108:
                        {
                        int LA15_3 = input.LA(2);

                        if ( (LA15_3==DN) ) {
                            alt15=1;
                        }
                        else if ( (LA15_3==ID_||LA15_3==LETTER_X) ) {
                            alt15=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 15, 3, input);

                            throw nvae;

                        }
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
                        case 110:
                            {
                            int LA15_6 = input.LA(3);

                            if ( (LA15_6==ARMOR||LA15_6==BEMOL||LA15_6==NOTE||LA15_6==SUSTAIN) ) {
                                alt15=1;
                            }
                            else if ( (LA15_6==ID_||LA15_6==LETTER_X) ) {
                                alt15=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 15, 6, input);

                                throw nvae;

                            }
                            }
                            break;
                        case 108:
                            {
                            int LA15_7 = input.LA(3);

                            if ( (LA15_7==DN) ) {
                                alt15=1;
                            }
                            else if ( (LA15_7==ID_||LA15_7==LETTER_X) ) {
                                alt15=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 15, 7, input);

                                throw nvae;

                            }
                            }
                            break;
                        case ARMOR:
                        case BEMOL:
                        case DN:
                        case NOTE:
                        case SUSTAIN:
                            {
                            alt15=2;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 15, 4, input);

                            throw nvae;

                        }

                        }
                        break;
                    case ARMOR:
                    case BEMOL:
                    case CHORD:
                    case DN:
                    case NOTE:
                    case SUSTAIN:
                        {
                        alt15=2;
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
                            pushFollow(FOLLOW_expr_in_music_inst1144);
                            expr79=expr();

                            state._fsp--;

                            adaptor.addChild(root_0, expr79.getTree());

                            }
                            break;
                        case 2 :
                            // src/parser/Music.g:104:32: notes_variable
                            {
                            pushFollow(FOLLOW_notes_variable_in_music_inst1148);
                            notes_variable80=notes_variable();

                            state._fsp--;

                            adaptor.addChild(root_0, notes_variable80.getTree());

                            }
                            break;

                    }


                    char_literal81=(Token)match(input,107,FOLLOW_107_in_music_inst1151); 
                    char_literal81_tree = 
                    (AmlTree)adaptor.create(char_literal81)
                    ;
                    adaptor.addChild(root_0, char_literal81_tree);


                    }
                    break;
                case 4 :
                    // src/parser/Music.g:105:17: volume ';' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_volume_in_music_inst1169);
                    volume82=volume();

                    state._fsp--;

                    adaptor.addChild(root_0, volume82.getTree());

                    char_literal83=(Token)match(input,107,FOLLOW_107_in_music_inst1171); 

                    }
                    break;
                case 5 :
                    // src/parser/Music.g:106:17: tone ';' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_tone_in_music_inst1190);
                    tone84=tone();

                    state._fsp--;

                    adaptor.addChild(root_0, tone84.getTree());

                    char_literal85=(Token)match(input,107,FOLLOW_107_in_music_inst1192); 

                    }
                    break;
                case 6 :
                    // src/parser/Music.g:107:17: beat ';' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_beat_in_music_inst1211);
                    beat86=beat();

                    state._fsp--;

                    adaptor.addChild(root_0, beat86.getTree());

                    char_literal87=(Token)match(input,107,FOLLOW_107_in_music_inst1213); 

                    }
                    break;
                case 7 :
                    // src/parser/Music.g:108:17: speed ';' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_speed_in_music_inst1232);
                    speed88=speed();

                    state._fsp--;

                    adaptor.addChild(root_0, speed88.getTree());

                    char_literal89=(Token)match(input,107,FOLLOW_107_in_music_inst1234); 

                    }
                    break;
                case 8 :
                    // src/parser/Music.g:109:17: instrument ';' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_instrument_in_music_inst1253);
                    instrument90=instrument();

                    state._fsp--;

                    adaptor.addChild(root_0, instrument90.getTree());

                    char_literal91=(Token)match(input,107,FOLLOW_107_in_music_inst1255); 

                    }
                    break;
                case 9 :
                    // src/parser/Music.g:110:17: transport ';' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_transport_in_music_inst1274);
                    transport92=transport();

                    state._fsp--;

                    adaptor.addChild(root_0, transport92.getTree());

                    char_literal93=(Token)match(input,107,FOLLOW_107_in_music_inst1276); 

                    }
                    break;
                case 10 :
                    // src/parser/Music.g:111:17: var_funcall ';'
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_var_funcall_in_music_inst1295);
                    var_funcall94=var_funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, var_funcall94.getTree());

                    char_literal95=(Token)match(input,107,FOLLOW_107_in_music_inst1297); 
                    char_literal95_tree = 
                    (AmlTree)adaptor.create(char_literal95)
                    ;
                    adaptor.addChild(root_0, char_literal95_tree);


                    }
                    break;
                case 11 :
                    // src/parser/Music.g:112:17: assignation
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_assignation_in_music_inst1315);
                    assignation96=assignation();

                    state._fsp--;

                    adaptor.addChild(root_0, assignation96.getTree());

                    }
                    break;
                case 12 :
                    // src/parser/Music.g:113:17: while_music_stmt
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_while_music_stmt_in_music_inst1333);
                    while_music_stmt97=while_music_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, while_music_stmt97.getTree());

                    }
                    break;
                case 13 :
                    // src/parser/Music.g:114:17: funcall ';' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_music_inst1351);
                    funcall98=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall98.getTree());

                    char_literal99=(Token)match(input,107,FOLLOW_107_in_music_inst1353); 

                    }
                    break;
                case 14 :
                    // src/parser/Music.g:115:17: fragcall ';' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_fragcall_in_music_inst1372);
                    fragcall100=fragcall();

                    state._fsp--;

                    adaptor.addChild(root_0, fragcall100.getTree());

                    char_literal101=(Token)match(input,107,FOLLOW_107_in_music_inst1374); 

                    }
                    break;
                case 15 :
                    // src/parser/Music.g:116:17: for_music_stmt
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_for_music_stmt_in_music_inst1393);
                    for_music_stmt102=for_music_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, for_music_stmt102.getTree());

                    }
                    break;
                case 16 :
                    // src/parser/Music.g:117:17: if_music_stmt
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_if_music_stmt_in_music_inst1411);
                    if_music_stmt103=if_music_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, if_music_stmt103.getTree());

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
                        case 110:
                            {
                            alt16=1;
                            }
                            break;
                        case DN:
                            {
                            alt16=1;
                            }
                            break;
                        case 108:
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
                    	    pushFollow(FOLLOW_notes_group_in_music_inst1438);
                    	    notes_group104=notes_group();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, notes_group104.getTree());

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
                            char_literal105=(Token)match(input,107,FOLLOW_107_in_music_inst1442); 

                            }
                            break;

                    }


                    }
                    break;
                case 18 :
                    // src/parser/Music.g:119:17: triplet
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_triplet_in_music_inst1462);
                    triplet106=triplet();

                    state._fsp--;

                    adaptor.addChild(root_0, triplet106.getTree());

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
    // src/parser/Music.g:122:1: declaration : type ^ assig_opt ( ',' ! assig_opt )* ';' !;
    public final MusicParser.declaration_return declaration() throws RecognitionException {
        MusicParser.declaration_return retval = new MusicParser.declaration_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal109=null;
        Token char_literal111=null;
        MusicParser.type_return type107 =null;

        MusicParser.assig_opt_return assig_opt108 =null;

        MusicParser.assig_opt_return assig_opt110 =null;


        AmlTree char_literal109_tree=null;
        AmlTree char_literal111_tree=null;

        try {
            // src/parser/Music.g:122:13: ( type ^ assig_opt ( ',' ! assig_opt )* ';' !)
            // src/parser/Music.g:122:17: type ^ assig_opt ( ',' ! assig_opt )* ';' !
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_type_in_declaration1485);
            type107=type();

            state._fsp--;

            root_0 = (AmlTree)adaptor.becomeRoot(type107.getTree(), root_0);

            pushFollow(FOLLOW_assig_opt_in_declaration1488);
            assig_opt108=assig_opt();

            state._fsp--;

            adaptor.addChild(root_0, assig_opt108.getTree());

            // src/parser/Music.g:122:33: ( ',' ! assig_opt )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==104) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // src/parser/Music.g:122:34: ',' ! assig_opt
            	    {
            	    char_literal109=(Token)match(input,104,FOLLOW_104_in_declaration1491); 

            	    pushFollow(FOLLOW_assig_opt_in_declaration1494);
            	    assig_opt110=assig_opt();

            	    state._fsp--;

            	    adaptor.addChild(root_0, assig_opt110.getTree());

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            char_literal111=(Token)match(input,107,FOLLOW_107_in_declaration1498); 

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
    // src/parser/Music.g:125:1: type : ( INT | BOOL | NOTE_TYPE | DRUMS_NOTE_TYPE | CHORD | STRING_TYPE | FIGURE_TYPE );
    public final MusicParser.type_return type() throws RecognitionException {
        MusicParser.type_return retval = new MusicParser.type_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token set112=null;

        AmlTree set112_tree=null;

        try {
            // src/parser/Music.g:125:13: ( INT | BOOL | NOTE_TYPE | DRUMS_NOTE_TYPE | CHORD | STRING_TYPE | FIGURE_TYPE )
            // src/parser/Music.g:
            {
            root_0 = (AmlTree)adaptor.nil();


            set112=(Token)input.LT(1);

            if ( input.LA(1)==BOOL||input.LA(1)==CHORD||input.LA(1)==DRUMS_NOTE_TYPE||input.LA(1)==FIGURE_TYPE||input.LA(1)==INT||input.LA(1)==NOTE_TYPE||input.LA(1)==STRING_TYPE ) {
                input.consume();
                adaptor.addChild(root_0, 
                (AmlTree)adaptor.create(set112)
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
    // src/parser/Music.g:134:1: type_void : ( type | VOID );
    public final MusicParser.type_void_return type_void() throws RecognitionException {
        MusicParser.type_void_return retval = new MusicParser.type_void_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token VOID114=null;
        MusicParser.type_return type113 =null;


        AmlTree VOID114_tree=null;

        try {
            // src/parser/Music.g:134:13: ( type | VOID )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==BOOL||LA20_0==CHORD||LA20_0==DRUMS_NOTE_TYPE||LA20_0==FIGURE_TYPE||LA20_0==INT||LA20_0==NOTE_TYPE||LA20_0==STRING_TYPE) ) {
                alt20=1;
            }
            else if ( (LA20_0==VOID) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }
            switch (alt20) {
                case 1 :
                    // src/parser/Music.g:134:17: type
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_type_in_type_void1662);
                    type113=type();

                    state._fsp--;

                    adaptor.addChild(root_0, type113.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:135:17: VOID
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    VOID114=(Token)match(input,VOID,FOLLOW_VOID_in_type_void1680); 
                    VOID114_tree = 
                    (AmlTree)adaptor.create(VOID114)
                    ;
                    adaptor.addChild(root_0, VOID114_tree);


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
    // src/parser/Music.g:138:1: assig_opt : id_rule ( ASSIG ^ ( expr | notes_variable ) )? ;
    public final MusicParser.assig_opt_return assig_opt() throws RecognitionException {
        MusicParser.assig_opt_return retval = new MusicParser.assig_opt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token ASSIG116=null;
        MusicParser.id_rule_return id_rule115 =null;

        MusicParser.expr_return expr117 =null;

        MusicParser.notes_variable_return notes_variable118 =null;


        AmlTree ASSIG116_tree=null;

        try {
            // src/parser/Music.g:138:13: ( id_rule ( ASSIG ^ ( expr | notes_variable ) )? )
            // src/parser/Music.g:138:17: id_rule ( ASSIG ^ ( expr | notes_variable ) )?
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_id_rule_in_assig_opt1705);
            id_rule115=id_rule();

            state._fsp--;

            adaptor.addChild(root_0, id_rule115.getTree());

            // src/parser/Music.g:138:25: ( ASSIG ^ ( expr | notes_variable ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==ASSIG) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // src/parser/Music.g:138:26: ASSIG ^ ( expr | notes_variable )
                    {
                    ASSIG116=(Token)match(input,ASSIG,FOLLOW_ASSIG_in_assig_opt1708); 
                    ASSIG116_tree = 
                    (AmlTree)adaptor.create(ASSIG116)
                    ;
                    root_0 = (AmlTree)adaptor.becomeRoot(ASSIG116_tree, root_0);


                    // src/parser/Music.g:138:33: ( expr | notes_variable )
                    int alt21=2;
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
                        alt21=1;
                        }
                        break;
                    case 110:
                        {
                        int LA21_2 = input.LA(2);

                        if ( (LA21_2==ARMOR||LA21_2==BEMOL||LA21_2==NOTE||LA21_2==SUSTAIN) ) {
                            alt21=1;
                        }
                        else if ( (LA21_2==ID_||LA21_2==LETTER_X) ) {
                            alt21=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 21, 2, input);

                            throw nvae;

                        }
                        }
                        break;
                    case 108:
                        {
                        int LA21_3 = input.LA(2);

                        if ( (LA21_3==DN) ) {
                            alt21=1;
                        }
                        else if ( (LA21_3==ID_||LA21_3==LETTER_X) ) {
                            alt21=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 21, 3, input);

                            throw nvae;

                        }
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
                            alt21=1;
                            }
                            break;
                        case 110:
                            {
                            int LA21_6 = input.LA(3);

                            if ( (LA21_6==ARMOR||LA21_6==BEMOL||LA21_6==NOTE||LA21_6==SUSTAIN) ) {
                                alt21=1;
                            }
                            else if ( (LA21_6==ID_||LA21_6==LETTER_X) ) {
                                alt21=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 21, 6, input);

                                throw nvae;

                            }
                            }
                            break;
                        case 108:
                            {
                            int LA21_7 = input.LA(3);

                            if ( (LA21_7==DN) ) {
                                alt21=1;
                            }
                            else if ( (LA21_7==ID_||LA21_7==LETTER_X) ) {
                                alt21=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 21, 7, input);

                                throw nvae;

                            }
                            }
                            break;
                        case ARMOR:
                        case BEMOL:
                        case DN:
                        case NOTE:
                        case SUSTAIN:
                            {
                            alt21=2;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 21, 4, input);

                            throw nvae;

                        }

                        }
                        break;
                    case ARMOR:
                    case BEMOL:
                    case CHORD:
                    case DN:
                    case NOTE:
                    case SUSTAIN:
                        {
                        alt21=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 0, input);

                        throw nvae;

                    }

                    switch (alt21) {
                        case 1 :
                            // src/parser/Music.g:138:34: expr
                            {
                            pushFollow(FOLLOW_expr_in_assig_opt1712);
                            expr117=expr();

                            state._fsp--;

                            adaptor.addChild(root_0, expr117.getTree());

                            }
                            break;
                        case 2 :
                            // src/parser/Music.g:138:41: notes_variable
                            {
                            pushFollow(FOLLOW_notes_variable_in_assig_opt1716);
                            notes_variable118=notes_variable();

                            state._fsp--;

                            adaptor.addChild(root_0, notes_variable118.getTree());

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
    // src/parser/Music.g:141:1: assignation : assig ';' !;
    public final MusicParser.assignation_return assignation() throws RecognitionException {
        MusicParser.assignation_return retval = new MusicParser.assignation_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal120=null;
        MusicParser.assig_return assig119 =null;


        AmlTree char_literal120_tree=null;

        try {
            // src/parser/Music.g:141:13: ( assig ';' !)
            // src/parser/Music.g:141:17: assig ';' !
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_assig_in_assignation1742);
            assig119=assig();

            state._fsp--;

            adaptor.addChild(root_0, assig119.getTree());

            char_literal120=(Token)match(input,107,FOLLOW_107_in_assignation1744); 

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
    // src/parser/Music.g:144:1: assig : ( var_access ( ASSIG | PLUS_ASSIG | MINUS_ASSIG | PROD_ASSIG | DIVIDE_ASSIG | MOD_ASSIG ) ^ ( expr | notes_variable | FIGURE_NAME ) | post | pre );
    public final MusicParser.assig_return assig() throws RecognitionException {
        MusicParser.assig_return retval = new MusicParser.assig_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token set122=null;
        Token FIGURE_NAME125=null;
        MusicParser.var_access_return var_access121 =null;

        MusicParser.expr_return expr123 =null;

        MusicParser.notes_variable_return notes_variable124 =null;

        MusicParser.post_return post126 =null;

        MusicParser.pre_return pre127 =null;


        AmlTree set122_tree=null;
        AmlTree FIGURE_NAME125_tree=null;

        try {
            // src/parser/Music.g:144:13: ( var_access ( ASSIG | PLUS_ASSIG | MINUS_ASSIG | PROD_ASSIG | DIVIDE_ASSIG | MOD_ASSIG ) ^ ( expr | notes_variable | FIGURE_NAME ) | post | pre )
            int alt24=3;
            switch ( input.LA(1) ) {
            case ID_:
                {
                switch ( input.LA(2) ) {
                case 105:
                    {
                    int LA24_4 = input.LA(3);

                    if ( (LA24_4==ID_) ) {
                        int LA24_7 = input.LA(4);

                        if ( (LA24_7==ASSIG||LA24_7==DIVIDE_ASSIG||LA24_7==MINUS_ASSIG||LA24_7==MOD_ASSIG||LA24_7==PLUS_ASSIG||LA24_7==PROD_ASSIG) ) {
                            alt24=1;
                        }
                        else if ( (LA24_7==DECR||LA24_7==INCR) ) {
                            alt24=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 24, 7, input);

                            throw nvae;

                        }
                    }
                    else if ( (LA24_4==LETTER_X) ) {
                        int LA24_8 = input.LA(4);

                        if ( (LA24_8==ASSIG||LA24_8==DIVIDE_ASSIG||LA24_8==MINUS_ASSIG||LA24_8==MOD_ASSIG||LA24_8==PLUS_ASSIG||LA24_8==PROD_ASSIG) ) {
                            alt24=1;
                        }
                        else if ( (LA24_8==DECR||LA24_8==INCR) ) {
                            alt24=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 24, 8, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 4, input);

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
                    alt24=1;
                    }
                    break;
                case DECR:
                case INCR:
                    {
                    alt24=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 1, input);

                    throw nvae;

                }

                }
                break;
            case LETTER_X:
                {
                switch ( input.LA(2) ) {
                case 105:
                    {
                    int LA24_4 = input.LA(3);

                    if ( (LA24_4==ID_) ) {
                        int LA24_7 = input.LA(4);

                        if ( (LA24_7==ASSIG||LA24_7==DIVIDE_ASSIG||LA24_7==MINUS_ASSIG||LA24_7==MOD_ASSIG||LA24_7==PLUS_ASSIG||LA24_7==PROD_ASSIG) ) {
                            alt24=1;
                        }
                        else if ( (LA24_7==DECR||LA24_7==INCR) ) {
                            alt24=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 24, 7, input);

                            throw nvae;

                        }
                    }
                    else if ( (LA24_4==LETTER_X) ) {
                        int LA24_8 = input.LA(4);

                        if ( (LA24_8==ASSIG||LA24_8==DIVIDE_ASSIG||LA24_8==MINUS_ASSIG||LA24_8==MOD_ASSIG||LA24_8==PLUS_ASSIG||LA24_8==PROD_ASSIG) ) {
                            alt24=1;
                        }
                        else if ( (LA24_8==DECR||LA24_8==INCR) ) {
                            alt24=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 24, 8, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 4, input);

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
                    alt24=1;
                    }
                    break;
                case DECR:
                case INCR:
                    {
                    alt24=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 2, input);

                    throw nvae;

                }

                }
                break;
            case DECR:
            case INCR:
                {
                alt24=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;

            }

            switch (alt24) {
                case 1 :
                    // src/parser/Music.g:144:17: var_access ( ASSIG | PLUS_ASSIG | MINUS_ASSIG | PROD_ASSIG | DIVIDE_ASSIG | MOD_ASSIG ) ^ ( expr | notes_variable | FIGURE_NAME )
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_var_access_in_assig1774);
                    var_access121=var_access();

                    state._fsp--;

                    adaptor.addChild(root_0, var_access121.getTree());

                    set122=(Token)input.LT(1);

                    set122=(Token)input.LT(1);

                    if ( input.LA(1)==ASSIG||input.LA(1)==DIVIDE_ASSIG||input.LA(1)==MINUS_ASSIG||input.LA(1)==MOD_ASSIG||input.LA(1)==PLUS_ASSIG||input.LA(1)==PROD_ASSIG ) {
                        input.consume();
                        root_0 = (AmlTree)adaptor.becomeRoot(
                        (AmlTree)adaptor.create(set122)
                        , root_0);
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    // src/parser/Music.g:144:94: ( expr | notes_variable | FIGURE_NAME )
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
                    case 110:
                        {
                        int LA23_2 = input.LA(2);

                        if ( (LA23_2==ARMOR||LA23_2==BEMOL||LA23_2==NOTE||LA23_2==SUSTAIN) ) {
                            alt23=1;
                        }
                        else if ( (LA23_2==ID_||LA23_2==LETTER_X) ) {
                            alt23=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 23, 2, input);

                            throw nvae;

                        }
                        }
                        break;
                    case 108:
                        {
                        int LA23_3 = input.LA(2);

                        if ( (LA23_3==DN) ) {
                            alt23=1;
                        }
                        else if ( (LA23_3==ID_||LA23_3==LETTER_X) ) {
                            alt23=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 23, 3, input);

                            throw nvae;

                        }
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
                        case 110:
                            {
                            int LA23_7 = input.LA(3);

                            if ( (LA23_7==ARMOR||LA23_7==BEMOL||LA23_7==NOTE||LA23_7==SUSTAIN) ) {
                                alt23=1;
                            }
                            else if ( (LA23_7==ID_||LA23_7==LETTER_X) ) {
                                alt23=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 23, 7, input);

                                throw nvae;

                            }
                            }
                            break;
                        case 108:
                            {
                            int LA23_8 = input.LA(3);

                            if ( (LA23_8==DN) ) {
                                alt23=1;
                            }
                            else if ( (LA23_8==ID_||LA23_8==LETTER_X) ) {
                                alt23=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 23, 8, input);

                                throw nvae;

                            }
                            }
                            break;
                        case ARMOR:
                        case BEMOL:
                        case DN:
                        case NOTE:
                        case SUSTAIN:
                            {
                            alt23=2;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 23, 4, input);

                            throw nvae;

                        }

                        }
                        break;
                    case ARMOR:
                    case BEMOL:
                    case CHORD:
                    case DN:
                    case NOTE:
                    case SUSTAIN:
                        {
                        alt23=2;
                        }
                        break;
                    case FIGURE_NAME:
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
                            // src/parser/Music.g:144:95: expr
                            {
                            pushFollow(FOLLOW_expr_in_assig1792);
                            expr123=expr();

                            state._fsp--;

                            adaptor.addChild(root_0, expr123.getTree());

                            }
                            break;
                        case 2 :
                            // src/parser/Music.g:144:102: notes_variable
                            {
                            pushFollow(FOLLOW_notes_variable_in_assig1796);
                            notes_variable124=notes_variable();

                            state._fsp--;

                            adaptor.addChild(root_0, notes_variable124.getTree());

                            }
                            break;
                        case 3 :
                            // src/parser/Music.g:144:119: FIGURE_NAME
                            {
                            FIGURE_NAME125=(Token)match(input,FIGURE_NAME,FOLLOW_FIGURE_NAME_in_assig1800); 
                            FIGURE_NAME125_tree = 
                            (AmlTree)adaptor.create(FIGURE_NAME125)
                            ;
                            adaptor.addChild(root_0, FIGURE_NAME125_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // src/parser/Music.g:145:17: post
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_post_in_assig1819);
                    post126=post();

                    state._fsp--;

                    adaptor.addChild(root_0, post126.getTree());

                    }
                    break;
                case 3 :
                    // src/parser/Music.g:146:17: pre
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_pre_in_assig1837);
                    pre127=pre();

                    state._fsp--;

                    adaptor.addChild(root_0, pre127.getTree());

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
    // src/parser/Music.g:149:1: var_funcall : id= id_rule '.' id2= id_rule '(' ( params )? ')' -> ^( VAR_FUNCALL[$id.text] $id2 ( params )? ) ;
    public final MusicParser.var_funcall_return var_funcall() throws RecognitionException {
        MusicParser.var_funcall_return retval = new MusicParser.var_funcall_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal128=null;
        Token char_literal129=null;
        Token char_literal131=null;
        MusicParser.id_rule_return id =null;

        MusicParser.id_rule_return id2 =null;

        MusicParser.params_return params130 =null;


        AmlTree char_literal128_tree=null;
        AmlTree char_literal129_tree=null;
        AmlTree char_literal131_tree=null;
        RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
        RewriteRuleTokenStream stream_103=new RewriteRuleTokenStream(adaptor,"token 103");
        RewriteRuleTokenStream stream_105=new RewriteRuleTokenStream(adaptor,"token 105");
        RewriteRuleSubtreeStream stream_id_rule=new RewriteRuleSubtreeStream(adaptor,"rule id_rule");
        RewriteRuleSubtreeStream stream_params=new RewriteRuleSubtreeStream(adaptor,"rule params");
        try {
            // src/parser/Music.g:149:13: (id= id_rule '.' id2= id_rule '(' ( params )? ')' -> ^( VAR_FUNCALL[$id.text] $id2 ( params )? ) )
            // src/parser/Music.g:149:17: id= id_rule '.' id2= id_rule '(' ( params )? ')'
            {
            pushFollow(FOLLOW_id_rule_in_var_funcall1862);
            id=id_rule();

            state._fsp--;

            stream_id_rule.add(id.getTree());

            char_literal128=(Token)match(input,105,FOLLOW_105_in_var_funcall1864);  
            stream_105.add(char_literal128);


            pushFollow(FOLLOW_id_rule_in_var_funcall1868);
            id2=id_rule();

            state._fsp--;

            stream_id_rule.add(id2.getTree());

            char_literal129=(Token)match(input,102,FOLLOW_102_in_var_funcall1870);  
            stream_102.add(char_literal129);


            // src/parser/Music.g:149:48: ( params )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==ARMOR||LA25_0==BEMOL||LA25_0==CHORD||LA25_0==DN||LA25_0==FALSE||LA25_0==ID_||LA25_0==LETTER_X||LA25_0==MINUS||(LA25_0 >= NEG_NUM && LA25_0 <= NOTE)||LA25_0==PLUS||LA25_0==POS_NUM||LA25_0==STRING||LA25_0==SUSTAIN||LA25_0==TRUE||LA25_0==102||LA25_0==108||LA25_0==110) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // src/parser/Music.g:149:48: params
                    {
                    pushFollow(FOLLOW_params_in_var_funcall1872);
                    params130=params();

                    state._fsp--;

                    stream_params.add(params130.getTree());

                    }
                    break;

            }


            char_literal131=(Token)match(input,103,FOLLOW_103_in_var_funcall1875);  
            stream_103.add(char_literal131);


            // AST REWRITE
            // elements: id2, params
            // token labels: 
            // rule labels: id2, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_id2=new RewriteRuleSubtreeStream(adaptor,"rule id2",id2!=null?id2.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AmlTree)adaptor.nil();
            // 149:61: -> ^( VAR_FUNCALL[$id.text] $id2 ( params )? )
            {
                // src/parser/Music.g:149:65: ^( VAR_FUNCALL[$id.text] $id2 ( params )? )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(VAR_FUNCALL, (id!=null?input.toString(id.start,id.stop):null))
                , root_1);

                adaptor.addChild(root_1, stream_id2.nextTree());

                // src/parser/Music.g:149:94: ( params )?
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
    // src/parser/Music.g:152:1: var_access : (id1= id_rule ( '.' id2= id_rule ) -> ^( ATTR_ACCESS[$id1.text] $id2) | id_rule );
    public final MusicParser.var_access_return var_access() throws RecognitionException {
        MusicParser.var_access_return retval = new MusicParser.var_access_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal132=null;
        MusicParser.id_rule_return id1 =null;

        MusicParser.id_rule_return id2 =null;

        MusicParser.id_rule_return id_rule133 =null;


        AmlTree char_literal132_tree=null;
        RewriteRuleTokenStream stream_105=new RewriteRuleTokenStream(adaptor,"token 105");
        RewriteRuleSubtreeStream stream_id_rule=new RewriteRuleSubtreeStream(adaptor,"rule id_rule");
        try {
            // src/parser/Music.g:152:13: (id1= id_rule ( '.' id2= id_rule ) -> ^( ATTR_ACCESS[$id1.text] $id2) | id_rule )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==ID_) ) {
                int LA26_1 = input.LA(2);

                if ( (LA26_1==105) ) {
                    alt26=1;
                }
                else if ( (LA26_1==AND||LA26_1==ASSIG||LA26_1==BEMOL||LA26_1==DECR||(LA26_1 >= DIV && LA26_1 <= DIVIDE_ASSIG)||LA26_1==DOT||LA26_1==EQUAL||(LA26_1 >= GE && LA26_1 <= GT)||LA26_1==INCR||LA26_1==LE||LA26_1==LT||(LA26_1 >= MINUS && LA26_1 <= MOD_ASSIG)||LA26_1==NOT_EQUAL||(LA26_1 >= OR && LA26_1 <= PLUS_ASSIG)||LA26_1==PROD_ASSIG||LA26_1==SUSTAIN||(LA26_1 >= 103 && LA26_1 <= 104)||(LA26_1 >= 106 && LA26_1 <= 107)) ) {
                    alt26=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA26_0==LETTER_X) ) {
                int LA26_2 = input.LA(2);

                if ( (LA26_2==105) ) {
                    alt26=1;
                }
                else if ( (LA26_2==AND||LA26_2==ASSIG||LA26_2==BEMOL||LA26_2==DECR||(LA26_2 >= DIV && LA26_2 <= DIVIDE_ASSIG)||LA26_2==DOT||LA26_2==EQUAL||(LA26_2 >= GE && LA26_2 <= GT)||LA26_2==INCR||LA26_2==LE||LA26_2==LT||(LA26_2 >= MINUS && LA26_2 <= MOD_ASSIG)||LA26_2==NOT_EQUAL||(LA26_2 >= OR && LA26_2 <= PLUS_ASSIG)||LA26_2==PROD_ASSIG||LA26_2==SUSTAIN||(LA26_2 >= 103 && LA26_2 <= 104)||(LA26_2 >= 106 && LA26_2 <= 107)) ) {
                    alt26=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 2, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;

            }
            switch (alt26) {
                case 1 :
                    // src/parser/Music.g:152:17: id1= id_rule ( '.' id2= id_rule )
                    {
                    pushFollow(FOLLOW_id_rule_in_var_access1916);
                    id1=id_rule();

                    state._fsp--;

                    stream_id_rule.add(id1.getTree());

                    // src/parser/Music.g:152:29: ( '.' id2= id_rule )
                    // src/parser/Music.g:152:30: '.' id2= id_rule
                    {
                    char_literal132=(Token)match(input,105,FOLLOW_105_in_var_access1919);  
                    stream_105.add(char_literal132);


                    pushFollow(FOLLOW_id_rule_in_var_access1923);
                    id2=id_rule();

                    state._fsp--;

                    stream_id_rule.add(id2.getTree());

                    }


                    // AST REWRITE
                    // elements: id2
                    // token labels: 
                    // rule labels: id2, retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_id2=new RewriteRuleSubtreeStream(adaptor,"rule id2",id2!=null?id2.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AmlTree)adaptor.nil();
                    // 152:47: -> ^( ATTR_ACCESS[$id1.text] $id2)
                    {
                        // src/parser/Music.g:152:50: ^( ATTR_ACCESS[$id1.text] $id2)
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
                    // src/parser/Music.g:153:17: id_rule
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_id_rule_in_var_access1952);
                    id_rule133=id_rule();

                    state._fsp--;

                    adaptor.addChild(root_0, id_rule133.getTree());

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
    // src/parser/Music.g:156:1: id_rule : (id= ID_ |id= LETTER_X ) -> ^( ID[$id] ) ;
    public final MusicParser.id_rule_return id_rule() throws RecognitionException {
        MusicParser.id_rule_return retval = new MusicParser.id_rule_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token id=null;

        AmlTree id_tree=null;
        RewriteRuleTokenStream stream_LETTER_X=new RewriteRuleTokenStream(adaptor,"token LETTER_X");
        RewriteRuleTokenStream stream_ID_=new RewriteRuleTokenStream(adaptor,"token ID_");

        try {
            // src/parser/Music.g:156:13: ( (id= ID_ |id= LETTER_X ) -> ^( ID[$id] ) )
            // src/parser/Music.g:156:17: (id= ID_ |id= LETTER_X )
            {
            // src/parser/Music.g:156:17: (id= ID_ |id= LETTER_X )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==ID_) ) {
                alt27=1;
            }
            else if ( (LA27_0==LETTER_X) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;

            }
            switch (alt27) {
                case 1 :
                    // src/parser/Music.g:156:18: id= ID_
                    {
                    id=(Token)match(input,ID_,FOLLOW_ID__in_id_rule1982);  
                    stream_ID_.add(id);


                    }
                    break;
                case 2 :
                    // src/parser/Music.g:156:29: id= LETTER_X
                    {
                    id=(Token)match(input,LETTER_X,FOLLOW_LETTER_X_in_id_rule1990);  
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
            // 156:42: -> ^( ID[$id] )
            {
                // src/parser/Music.g:156:45: ^( ID[$id] )
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
    // src/parser/Music.g:160:1: post : var_access (x= INCR |x= DECR ) -> ^( POST var_access $x) ;
    public final MusicParser.post_return post() throws RecognitionException {
        MusicParser.post_return retval = new MusicParser.post_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token x=null;
        MusicParser.var_access_return var_access134 =null;


        AmlTree x_tree=null;
        RewriteRuleTokenStream stream_INCR=new RewriteRuleTokenStream(adaptor,"token INCR");
        RewriteRuleTokenStream stream_DECR=new RewriteRuleTokenStream(adaptor,"token DECR");
        RewriteRuleSubtreeStream stream_var_access=new RewriteRuleSubtreeStream(adaptor,"rule var_access");
        try {
            // src/parser/Music.g:160:13: ( var_access (x= INCR |x= DECR ) -> ^( POST var_access $x) )
            // src/parser/Music.g:160:17: var_access (x= INCR |x= DECR )
            {
            pushFollow(FOLLOW_var_access_in_post2029);
            var_access134=var_access();

            state._fsp--;

            stream_var_access.add(var_access134.getTree());

            // src/parser/Music.g:160:28: (x= INCR |x= DECR )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==INCR) ) {
                alt28=1;
            }
            else if ( (LA28_0==DECR) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;

            }
            switch (alt28) {
                case 1 :
                    // src/parser/Music.g:160:29: x= INCR
                    {
                    x=(Token)match(input,INCR,FOLLOW_INCR_in_post2034);  
                    stream_INCR.add(x);


                    }
                    break;
                case 2 :
                    // src/parser/Music.g:160:38: x= DECR
                    {
                    x=(Token)match(input,DECR,FOLLOW_DECR_in_post2040);  
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
            // 160:46: -> ^( POST var_access $x)
            {
                // src/parser/Music.g:160:50: ^( POST var_access $x)
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
    // src/parser/Music.g:163:1: pre : (x= INCR |x= DECR ) var_access -> ^( PRE var_access $x) ;
    public final MusicParser.pre_return pre() throws RecognitionException {
        MusicParser.pre_return retval = new MusicParser.pre_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token x=null;
        MusicParser.var_access_return var_access135 =null;


        AmlTree x_tree=null;
        RewriteRuleTokenStream stream_INCR=new RewriteRuleTokenStream(adaptor,"token INCR");
        RewriteRuleTokenStream stream_DECR=new RewriteRuleTokenStream(adaptor,"token DECR");
        RewriteRuleSubtreeStream stream_var_access=new RewriteRuleSubtreeStream(adaptor,"rule var_access");
        try {
            // src/parser/Music.g:163:13: ( (x= INCR |x= DECR ) var_access -> ^( PRE var_access $x) )
            // src/parser/Music.g:163:17: (x= INCR |x= DECR ) var_access
            {
            // src/parser/Music.g:163:17: (x= INCR |x= DECR )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==INCR) ) {
                alt29=1;
            }
            else if ( (LA29_0==DECR) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;

            }
            switch (alt29) {
                case 1 :
                    // src/parser/Music.g:163:18: x= INCR
                    {
                    x=(Token)match(input,INCR,FOLLOW_INCR_in_pre2087);  
                    stream_INCR.add(x);


                    }
                    break;
                case 2 :
                    // src/parser/Music.g:163:27: x= DECR
                    {
                    x=(Token)match(input,DECR,FOLLOW_DECR_in_pre2093);  
                    stream_DECR.add(x);


                    }
                    break;

            }


            pushFollow(FOLLOW_var_access_in_pre2096);
            var_access135=var_access();

            state._fsp--;

            stream_var_access.add(var_access135.getTree());

            // AST REWRITE
            // elements: x, var_access
            // token labels: x
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_x=new RewriteRuleTokenStream(adaptor,"token x",x);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AmlTree)adaptor.nil();
            // 163:47: -> ^( PRE var_access $x)
            {
                // src/parser/Music.g:163:50: ^( PRE var_access $x)
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
    // src/parser/Music.g:166:1: beat : BEAT ^ num_expr ':' ! num_expr ;
    public final MusicParser.beat_return beat() throws RecognitionException {
        MusicParser.beat_return retval = new MusicParser.beat_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token BEAT136=null;
        Token char_literal138=null;
        MusicParser.num_expr_return num_expr137 =null;

        MusicParser.num_expr_return num_expr139 =null;


        AmlTree BEAT136_tree=null;
        AmlTree char_literal138_tree=null;

        try {
            // src/parser/Music.g:166:13: ( BEAT ^ num_expr ':' ! num_expr )
            // src/parser/Music.g:166:17: BEAT ^ num_expr ':' ! num_expr
            {
            root_0 = (AmlTree)adaptor.nil();


            BEAT136=(Token)match(input,BEAT,FOLLOW_BEAT_in_beat2139); 
            BEAT136_tree = 
            (AmlTree)adaptor.create(BEAT136)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(BEAT136_tree, root_0);


            pushFollow(FOLLOW_num_expr_in_beat2142);
            num_expr137=num_expr();

            state._fsp--;

            adaptor.addChild(root_0, num_expr137.getTree());

            char_literal138=(Token)match(input,106,FOLLOW_106_in_beat2144); 

            pushFollow(FOLLOW_num_expr_in_beat2147);
            num_expr139=num_expr();

            state._fsp--;

            adaptor.addChild(root_0, num_expr139.getTree());

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
    // src/parser/Music.g:169:1: speed : SPEED ^ num_expr ;
    public final MusicParser.speed_return speed() throws RecognitionException {
        MusicParser.speed_return retval = new MusicParser.speed_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token SPEED140=null;
        MusicParser.num_expr_return num_expr141 =null;


        AmlTree SPEED140_tree=null;

        try {
            // src/parser/Music.g:169:13: ( SPEED ^ num_expr )
            // src/parser/Music.g:169:17: SPEED ^ num_expr
            {
            root_0 = (AmlTree)adaptor.nil();


            SPEED140=(Token)match(input,SPEED,FOLLOW_SPEED_in_speed2176); 
            SPEED140_tree = 
            (AmlTree)adaptor.create(SPEED140)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(SPEED140_tree, root_0);


            pushFollow(FOLLOW_num_expr_in_speed2179);
            num_expr141=num_expr();

            state._fsp--;

            adaptor.addChild(root_0, num_expr141.getTree());

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
    // src/parser/Music.g:172:1: volume : VOLUME ^ num_expr ;
    public final MusicParser.volume_return volume() throws RecognitionException {
        MusicParser.volume_return retval = new MusicParser.volume_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token VOLUME142=null;
        MusicParser.num_expr_return num_expr143 =null;


        AmlTree VOLUME142_tree=null;

        try {
            // src/parser/Music.g:172:13: ( VOLUME ^ num_expr )
            // src/parser/Music.g:172:17: VOLUME ^ num_expr
            {
            root_0 = (AmlTree)adaptor.nil();


            VOLUME142=(Token)match(input,VOLUME,FOLLOW_VOLUME_in_volume2207); 
            VOLUME142_tree = 
            (AmlTree)adaptor.create(VOLUME142)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(VOLUME142_tree, root_0);


            pushFollow(FOLLOW_num_expr_in_volume2210);
            num_expr143=num_expr();

            state._fsp--;

            adaptor.addChild(root_0, num_expr143.getTree());

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
    // src/parser/Music.g:174:1: transport : TRANSPORT ^ num_expr ;
    public final MusicParser.transport_return transport() throws RecognitionException {
        MusicParser.transport_return retval = new MusicParser.transport_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token TRANSPORT144=null;
        MusicParser.num_expr_return num_expr145 =null;


        AmlTree TRANSPORT144_tree=null;

        try {
            // src/parser/Music.g:174:13: ( TRANSPORT ^ num_expr )
            // src/parser/Music.g:174:17: TRANSPORT ^ num_expr
            {
            root_0 = (AmlTree)adaptor.nil();


            TRANSPORT144=(Token)match(input,TRANSPORT,FOLLOW_TRANSPORT_in_transport2222); 
            TRANSPORT144_tree = 
            (AmlTree)adaptor.create(TRANSPORT144)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(TRANSPORT144_tree, root_0);


            pushFollow(FOLLOW_num_expr_in_transport2225);
            num_expr145=num_expr();

            state._fsp--;

            adaptor.addChild(root_0, num_expr145.getTree());

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
    // src/parser/Music.g:177:1: instrument : INSTRUMENT ^ STRING ;
    public final MusicParser.instrument_return instrument() throws RecognitionException {
        MusicParser.instrument_return retval = new MusicParser.instrument_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token INSTRUMENT146=null;
        Token STRING147=null;

        AmlTree INSTRUMENT146_tree=null;
        AmlTree STRING147_tree=null;

        try {
            // src/parser/Music.g:177:13: ( INSTRUMENT ^ STRING )
            // src/parser/Music.g:177:17: INSTRUMENT ^ STRING
            {
            root_0 = (AmlTree)adaptor.nil();


            INSTRUMENT146=(Token)match(input,INSTRUMENT,FOLLOW_INSTRUMENT_in_instrument2249); 
            INSTRUMENT146_tree = 
            (AmlTree)adaptor.create(INSTRUMENT146)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(INSTRUMENT146_tree, root_0);


            STRING147=(Token)match(input,STRING,FOLLOW_STRING_in_instrument2252); 
            STRING147_tree = 
            (AmlTree)adaptor.create(STRING147)
            ;
            adaptor.addChild(root_0, STRING147_tree);


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
    // src/parser/Music.g:180:1: while_stmt : WHILE ^ '(' ! expr ')' ! '{' ! listInst '}' !;
    public final MusicParser.while_stmt_return while_stmt() throws RecognitionException {
        MusicParser.while_stmt_return retval = new MusicParser.while_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token WHILE148=null;
        Token char_literal149=null;
        Token char_literal151=null;
        Token char_literal152=null;
        Token char_literal154=null;
        MusicParser.expr_return expr150 =null;

        MusicParser.listInst_return listInst153 =null;


        AmlTree WHILE148_tree=null;
        AmlTree char_literal149_tree=null;
        AmlTree char_literal151_tree=null;
        AmlTree char_literal152_tree=null;
        AmlTree char_literal154_tree=null;

        try {
            // src/parser/Music.g:180:13: ( WHILE ^ '(' ! expr ')' ! '{' ! listInst '}' !)
            // src/parser/Music.g:180:17: WHILE ^ '(' ! expr ')' ! '{' ! listInst '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            WHILE148=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_stmt2276); 
            WHILE148_tree = 
            (AmlTree)adaptor.create(WHILE148)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(WHILE148_tree, root_0);


            char_literal149=(Token)match(input,102,FOLLOW_102_in_while_stmt2279); 

            pushFollow(FOLLOW_expr_in_while_stmt2282);
            expr150=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr150.getTree());

            char_literal151=(Token)match(input,103,FOLLOW_103_in_while_stmt2284); 

            char_literal152=(Token)match(input,113,FOLLOW_113_in_while_stmt2287); 

            pushFollow(FOLLOW_listInst_in_while_stmt2290);
            listInst153=listInst();

            state._fsp--;

            adaptor.addChild(root_0, listInst153.getTree());

            char_literal154=(Token)match(input,114,FOLLOW_114_in_while_stmt2292); 

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
    // src/parser/Music.g:183:1: while_music_stmt : WHILE ^ '(' ! expr ')' ! '{' ! list_music_inst '}' !;
    public final MusicParser.while_music_stmt_return while_music_stmt() throws RecognitionException {
        MusicParser.while_music_stmt_return retval = new MusicParser.while_music_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token WHILE155=null;
        Token char_literal156=null;
        Token char_literal158=null;
        Token char_literal159=null;
        Token char_literal161=null;
        MusicParser.expr_return expr157 =null;

        MusicParser.list_music_inst_return list_music_inst160 =null;


        AmlTree WHILE155_tree=null;
        AmlTree char_literal156_tree=null;
        AmlTree char_literal158_tree=null;
        AmlTree char_literal159_tree=null;
        AmlTree char_literal161_tree=null;

        try {
            // src/parser/Music.g:183:21: ( WHILE ^ '(' ! expr ')' ! '{' ! list_music_inst '}' !)
            // src/parser/Music.g:183:25: WHILE ^ '(' ! expr ')' ! '{' ! list_music_inst '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            WHILE155=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_music_stmt2319); 
            WHILE155_tree = 
            (AmlTree)adaptor.create(WHILE155)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(WHILE155_tree, root_0);


            char_literal156=(Token)match(input,102,FOLLOW_102_in_while_music_stmt2322); 

            pushFollow(FOLLOW_expr_in_while_music_stmt2325);
            expr157=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr157.getTree());

            char_literal158=(Token)match(input,103,FOLLOW_103_in_while_music_stmt2327); 

            char_literal159=(Token)match(input,113,FOLLOW_113_in_while_music_stmt2330); 

            pushFollow(FOLLOW_list_music_inst_in_while_music_stmt2333);
            list_music_inst160=list_music_inst();

            state._fsp--;

            adaptor.addChild(root_0, list_music_inst160.getTree());

            char_literal161=(Token)match(input,114,FOLLOW_114_in_while_music_stmt2335); 

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
    // src/parser/Music.g:186:1: for_stmt : FOR ^ '(' ! ( declaration | list_assig ';' !) expr ';' ! list_assig ')' ! '{' ! listInst '}' !;
    public final MusicParser.for_stmt_return for_stmt() throws RecognitionException {
        MusicParser.for_stmt_return retval = new MusicParser.for_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token FOR162=null;
        Token char_literal163=null;
        Token char_literal166=null;
        Token char_literal168=null;
        Token char_literal170=null;
        Token char_literal171=null;
        Token char_literal173=null;
        MusicParser.declaration_return declaration164 =null;

        MusicParser.list_assig_return list_assig165 =null;

        MusicParser.expr_return expr167 =null;

        MusicParser.list_assig_return list_assig169 =null;

        MusicParser.listInst_return listInst172 =null;


        AmlTree FOR162_tree=null;
        AmlTree char_literal163_tree=null;
        AmlTree char_literal166_tree=null;
        AmlTree char_literal168_tree=null;
        AmlTree char_literal170_tree=null;
        AmlTree char_literal171_tree=null;
        AmlTree char_literal173_tree=null;

        try {
            // src/parser/Music.g:186:13: ( FOR ^ '(' ! ( declaration | list_assig ';' !) expr ';' ! list_assig ')' ! '{' ! listInst '}' !)
            // src/parser/Music.g:186:17: FOR ^ '(' ! ( declaration | list_assig ';' !) expr ';' ! list_assig ')' ! '{' ! listInst '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            FOR162=(Token)match(input,FOR,FOLLOW_FOR_in_for_stmt2370); 
            FOR162_tree = 
            (AmlTree)adaptor.create(FOR162)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(FOR162_tree, root_0);


            char_literal163=(Token)match(input,102,FOLLOW_102_in_for_stmt2373); 

            // src/parser/Music.g:186:27: ( declaration | list_assig ';' !)
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==BOOL||LA30_0==CHORD||LA30_0==DRUMS_NOTE_TYPE||LA30_0==FIGURE_TYPE||LA30_0==INT||LA30_0==NOTE_TYPE||LA30_0==STRING_TYPE) ) {
                alt30=1;
            }
            else if ( (LA30_0==DECR||LA30_0==ID_||LA30_0==INCR||LA30_0==LETTER_X) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;

            }
            switch (alt30) {
                case 1 :
                    // src/parser/Music.g:186:28: declaration
                    {
                    pushFollow(FOLLOW_declaration_in_for_stmt2377);
                    declaration164=declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, declaration164.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:186:42: list_assig ';' !
                    {
                    pushFollow(FOLLOW_list_assig_in_for_stmt2381);
                    list_assig165=list_assig();

                    state._fsp--;

                    adaptor.addChild(root_0, list_assig165.getTree());

                    char_literal166=(Token)match(input,107,FOLLOW_107_in_for_stmt2383); 

                    }
                    break;

            }


            pushFollow(FOLLOW_expr_in_for_stmt2387);
            expr167=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr167.getTree());

            char_literal168=(Token)match(input,107,FOLLOW_107_in_for_stmt2389); 

            pushFollow(FOLLOW_list_assig_in_for_stmt2392);
            list_assig169=list_assig();

            state._fsp--;

            adaptor.addChild(root_0, list_assig169.getTree());

            char_literal170=(Token)match(input,103,FOLLOW_103_in_for_stmt2394); 

            char_literal171=(Token)match(input,113,FOLLOW_113_in_for_stmt2397); 

            pushFollow(FOLLOW_listInst_in_for_stmt2400);
            listInst172=listInst();

            state._fsp--;

            adaptor.addChild(root_0, listInst172.getTree());

            char_literal173=(Token)match(input,114,FOLLOW_114_in_for_stmt2402); 

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
    // src/parser/Music.g:189:1: for_music_stmt : FOR ^ '(' ! ( declaration | list_assig ';' !) expr ';' ! list_assig ')' ! '{' ! list_music_inst '}' !;
    public final MusicParser.for_music_stmt_return for_music_stmt() throws RecognitionException {
        MusicParser.for_music_stmt_return retval = new MusicParser.for_music_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token FOR174=null;
        Token char_literal175=null;
        Token char_literal178=null;
        Token char_literal180=null;
        Token char_literal182=null;
        Token char_literal183=null;
        Token char_literal185=null;
        MusicParser.declaration_return declaration176 =null;

        MusicParser.list_assig_return list_assig177 =null;

        MusicParser.expr_return expr179 =null;

        MusicParser.list_assig_return list_assig181 =null;

        MusicParser.list_music_inst_return list_music_inst184 =null;


        AmlTree FOR174_tree=null;
        AmlTree char_literal175_tree=null;
        AmlTree char_literal178_tree=null;
        AmlTree char_literal180_tree=null;
        AmlTree char_literal182_tree=null;
        AmlTree char_literal183_tree=null;
        AmlTree char_literal185_tree=null;

        try {
            // src/parser/Music.g:189:17: ( FOR ^ '(' ! ( declaration | list_assig ';' !) expr ';' ! list_assig ')' ! '{' ! list_music_inst '}' !)
            // src/parser/Music.g:189:21: FOR ^ '(' ! ( declaration | list_assig ';' !) expr ';' ! list_assig ')' ! '{' ! list_music_inst '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            FOR174=(Token)match(input,FOR,FOLLOW_FOR_in_for_music_stmt2427); 
            FOR174_tree = 
            (AmlTree)adaptor.create(FOR174)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(FOR174_tree, root_0);


            char_literal175=(Token)match(input,102,FOLLOW_102_in_for_music_stmt2430); 

            // src/parser/Music.g:189:31: ( declaration | list_assig ';' !)
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==BOOL||LA31_0==CHORD||LA31_0==DRUMS_NOTE_TYPE||LA31_0==FIGURE_TYPE||LA31_0==INT||LA31_0==NOTE_TYPE||LA31_0==STRING_TYPE) ) {
                alt31=1;
            }
            else if ( (LA31_0==DECR||LA31_0==ID_||LA31_0==INCR||LA31_0==LETTER_X) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;

            }
            switch (alt31) {
                case 1 :
                    // src/parser/Music.g:189:32: declaration
                    {
                    pushFollow(FOLLOW_declaration_in_for_music_stmt2434);
                    declaration176=declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, declaration176.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:189:46: list_assig ';' !
                    {
                    pushFollow(FOLLOW_list_assig_in_for_music_stmt2438);
                    list_assig177=list_assig();

                    state._fsp--;

                    adaptor.addChild(root_0, list_assig177.getTree());

                    char_literal178=(Token)match(input,107,FOLLOW_107_in_for_music_stmt2440); 

                    }
                    break;

            }


            pushFollow(FOLLOW_expr_in_for_music_stmt2444);
            expr179=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr179.getTree());

            char_literal180=(Token)match(input,107,FOLLOW_107_in_for_music_stmt2446); 

            pushFollow(FOLLOW_list_assig_in_for_music_stmt2449);
            list_assig181=list_assig();

            state._fsp--;

            adaptor.addChild(root_0, list_assig181.getTree());

            char_literal182=(Token)match(input,103,FOLLOW_103_in_for_music_stmt2451); 

            char_literal183=(Token)match(input,113,FOLLOW_113_in_for_music_stmt2454); 

            pushFollow(FOLLOW_list_music_inst_in_for_music_stmt2457);
            list_music_inst184=list_music_inst();

            state._fsp--;

            adaptor.addChild(root_0, list_music_inst184.getTree());

            char_literal185=(Token)match(input,114,FOLLOW_114_in_for_music_stmt2459); 

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
    // src/parser/Music.g:192:1: list_assig : assig ( ',' assig )* -> ^( LIST_ASSIG ( assig )+ ) ;
    public final MusicParser.list_assig_return list_assig() throws RecognitionException {
        MusicParser.list_assig_return retval = new MusicParser.list_assig_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal187=null;
        MusicParser.assig_return assig186 =null;

        MusicParser.assig_return assig188 =null;


        AmlTree char_literal187_tree=null;
        RewriteRuleTokenStream stream_104=new RewriteRuleTokenStream(adaptor,"token 104");
        RewriteRuleSubtreeStream stream_assig=new RewriteRuleSubtreeStream(adaptor,"rule assig");
        try {
            // src/parser/Music.g:192:13: ( assig ( ',' assig )* -> ^( LIST_ASSIG ( assig )+ ) )
            // src/parser/Music.g:192:17: assig ( ',' assig )*
            {
            pushFollow(FOLLOW_assig_in_list_assig2488);
            assig186=assig();

            state._fsp--;

            stream_assig.add(assig186.getTree());

            // src/parser/Music.g:192:23: ( ',' assig )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==104) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // src/parser/Music.g:192:24: ',' assig
            	    {
            	    char_literal187=(Token)match(input,104,FOLLOW_104_in_list_assig2491);  
            	    stream_104.add(char_literal187);


            	    pushFollow(FOLLOW_assig_in_list_assig2493);
            	    assig188=assig();

            	    state._fsp--;

            	    stream_assig.add(assig188.getTree());

            	    }
            	    break;

            	default :
            	    break loop32;
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
            // 192:36: -> ^( LIST_ASSIG ( assig )+ )
            {
                // src/parser/Music.g:192:39: ^( LIST_ASSIG ( assig )+ )
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
    // src/parser/Music.g:195:1: if_stmt : IF ^ '(' ! expr ')' ! '{' ! listInst '}' ! ( elseif_stmt )* ( else_stmt )? ;
    public final MusicParser.if_stmt_return if_stmt() throws RecognitionException {
        MusicParser.if_stmt_return retval = new MusicParser.if_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token IF189=null;
        Token char_literal190=null;
        Token char_literal192=null;
        Token char_literal193=null;
        Token char_literal195=null;
        MusicParser.expr_return expr191 =null;

        MusicParser.listInst_return listInst194 =null;

        MusicParser.elseif_stmt_return elseif_stmt196 =null;

        MusicParser.else_stmt_return else_stmt197 =null;


        AmlTree IF189_tree=null;
        AmlTree char_literal190_tree=null;
        AmlTree char_literal192_tree=null;
        AmlTree char_literal193_tree=null;
        AmlTree char_literal195_tree=null;

        try {
            // src/parser/Music.g:195:13: ( IF ^ '(' ! expr ')' ! '{' ! listInst '}' ! ( elseif_stmt )* ( else_stmt )? )
            // src/parser/Music.g:195:17: IF ^ '(' ! expr ')' ! '{' ! listInst '}' ! ( elseif_stmt )* ( else_stmt )?
            {
            root_0 = (AmlTree)adaptor.nil();


            IF189=(Token)match(input,IF,FOLLOW_IF_in_if_stmt2531); 
            IF189_tree = 
            (AmlTree)adaptor.create(IF189)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(IF189_tree, root_0);


            char_literal190=(Token)match(input,102,FOLLOW_102_in_if_stmt2534); 

            pushFollow(FOLLOW_expr_in_if_stmt2537);
            expr191=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr191.getTree());

            char_literal192=(Token)match(input,103,FOLLOW_103_in_if_stmt2539); 

            char_literal193=(Token)match(input,113,FOLLOW_113_in_if_stmt2542); 

            pushFollow(FOLLOW_listInst_in_if_stmt2545);
            listInst194=listInst();

            state._fsp--;

            adaptor.addChild(root_0, listInst194.getTree());

            char_literal195=(Token)match(input,114,FOLLOW_114_in_if_stmt2547); 

            // src/parser/Music.g:195:55: ( elseif_stmt )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==ELSE) ) {
                    int LA33_1 = input.LA(2);

                    if ( (LA33_1==IF) ) {
                        alt33=1;
                    }


                }


                switch (alt33) {
            	case 1 :
            	    // src/parser/Music.g:195:55: elseif_stmt
            	    {
            	    pushFollow(FOLLOW_elseif_stmt_in_if_stmt2550);
            	    elseif_stmt196=elseif_stmt();

            	    state._fsp--;

            	    adaptor.addChild(root_0, elseif_stmt196.getTree());

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            // src/parser/Music.g:195:68: ( else_stmt )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==ELSE) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // src/parser/Music.g:195:68: else_stmt
                    {
                    pushFollow(FOLLOW_else_stmt_in_if_stmt2553);
                    else_stmt197=else_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, else_stmt197.getTree());

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
    // src/parser/Music.g:198:1: elseif_stmt : ELSE IF '(' expr ')' '{' listInst '}' -> ^( ELSEIF expr listInst ) ;
    public final MusicParser.elseif_stmt_return elseif_stmt() throws RecognitionException {
        MusicParser.elseif_stmt_return retval = new MusicParser.elseif_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token ELSE198=null;
        Token IF199=null;
        Token char_literal200=null;
        Token char_literal202=null;
        Token char_literal203=null;
        Token char_literal205=null;
        MusicParser.expr_return expr201 =null;

        MusicParser.listInst_return listInst204 =null;


        AmlTree ELSE198_tree=null;
        AmlTree IF199_tree=null;
        AmlTree char_literal200_tree=null;
        AmlTree char_literal202_tree=null;
        AmlTree char_literal203_tree=null;
        AmlTree char_literal205_tree=null;
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
        RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
        RewriteRuleTokenStream stream_103=new RewriteRuleTokenStream(adaptor,"token 103");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_listInst=new RewriteRuleSubtreeStream(adaptor,"rule listInst");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // src/parser/Music.g:198:13: ( ELSE IF '(' expr ')' '{' listInst '}' -> ^( ELSEIF expr listInst ) )
            // src/parser/Music.g:198:17: ELSE IF '(' expr ')' '{' listInst '}'
            {
            ELSE198=(Token)match(input,ELSE,FOLLOW_ELSE_in_elseif_stmt2577);  
            stream_ELSE.add(ELSE198);


            IF199=(Token)match(input,IF,FOLLOW_IF_in_elseif_stmt2579);  
            stream_IF.add(IF199);


            char_literal200=(Token)match(input,102,FOLLOW_102_in_elseif_stmt2581);  
            stream_102.add(char_literal200);


            pushFollow(FOLLOW_expr_in_elseif_stmt2583);
            expr201=expr();

            state._fsp--;

            stream_expr.add(expr201.getTree());

            char_literal202=(Token)match(input,103,FOLLOW_103_in_elseif_stmt2585);  
            stream_103.add(char_literal202);


            char_literal203=(Token)match(input,113,FOLLOW_113_in_elseif_stmt2587);  
            stream_113.add(char_literal203);


            pushFollow(FOLLOW_listInst_in_elseif_stmt2589);
            listInst204=listInst();

            state._fsp--;

            stream_listInst.add(listInst204.getTree());

            char_literal205=(Token)match(input,114,FOLLOW_114_in_elseif_stmt2591);  
            stream_114.add(char_literal205);


            // AST REWRITE
            // elements: listInst, expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AmlTree)adaptor.nil();
            // 198:55: -> ^( ELSEIF expr listInst )
            {
                // src/parser/Music.g:198:58: ^( ELSEIF expr listInst )
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
    // src/parser/Music.g:201:1: else_stmt : ELSE ^ '{' ! listInst '}' !;
    public final MusicParser.else_stmt_return else_stmt() throws RecognitionException {
        MusicParser.else_stmt_return retval = new MusicParser.else_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token ELSE206=null;
        Token char_literal207=null;
        Token char_literal209=null;
        MusicParser.listInst_return listInst208 =null;


        AmlTree ELSE206_tree=null;
        AmlTree char_literal207_tree=null;
        AmlTree char_literal209_tree=null;

        try {
            // src/parser/Music.g:201:13: ( ELSE ^ '{' ! listInst '}' !)
            // src/parser/Music.g:201:17: ELSE ^ '{' ! listInst '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            ELSE206=(Token)match(input,ELSE,FOLLOW_ELSE_in_else_stmt2626); 
            ELSE206_tree = 
            (AmlTree)adaptor.create(ELSE206)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(ELSE206_tree, root_0);


            char_literal207=(Token)match(input,113,FOLLOW_113_in_else_stmt2629); 

            pushFollow(FOLLOW_listInst_in_else_stmt2632);
            listInst208=listInst();

            state._fsp--;

            adaptor.addChild(root_0, listInst208.getTree());

            char_literal209=(Token)match(input,114,FOLLOW_114_in_else_stmt2634); 

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
    // src/parser/Music.g:204:1: if_music_stmt : IF ^ '(' ! expr ')' ! '{' ! list_music_inst '}' ! ( elseif_music_stmt )* ( else_music_stmt )? ;
    public final MusicParser.if_music_stmt_return if_music_stmt() throws RecognitionException {
        MusicParser.if_music_stmt_return retval = new MusicParser.if_music_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token IF210=null;
        Token char_literal211=null;
        Token char_literal213=null;
        Token char_literal214=null;
        Token char_literal216=null;
        MusicParser.expr_return expr212 =null;

        MusicParser.list_music_inst_return list_music_inst215 =null;

        MusicParser.elseif_music_stmt_return elseif_music_stmt217 =null;

        MusicParser.else_music_stmt_return else_music_stmt218 =null;


        AmlTree IF210_tree=null;
        AmlTree char_literal211_tree=null;
        AmlTree char_literal213_tree=null;
        AmlTree char_literal214_tree=null;
        AmlTree char_literal216_tree=null;

        try {
            // src/parser/Music.g:204:17: ( IF ^ '(' ! expr ')' ! '{' ! list_music_inst '}' ! ( elseif_music_stmt )* ( else_music_stmt )? )
            // src/parser/Music.g:204:21: IF ^ '(' ! expr ')' ! '{' ! list_music_inst '}' ! ( elseif_music_stmt )* ( else_music_stmt )?
            {
            root_0 = (AmlTree)adaptor.nil();


            IF210=(Token)match(input,IF,FOLLOW_IF_in_if_music_stmt2660); 
            IF210_tree = 
            (AmlTree)adaptor.create(IF210)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(IF210_tree, root_0);


            char_literal211=(Token)match(input,102,FOLLOW_102_in_if_music_stmt2663); 

            pushFollow(FOLLOW_expr_in_if_music_stmt2666);
            expr212=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr212.getTree());

            char_literal213=(Token)match(input,103,FOLLOW_103_in_if_music_stmt2668); 

            char_literal214=(Token)match(input,113,FOLLOW_113_in_if_music_stmt2671); 

            pushFollow(FOLLOW_list_music_inst_in_if_music_stmt2674);
            list_music_inst215=list_music_inst();

            state._fsp--;

            adaptor.addChild(root_0, list_music_inst215.getTree());

            char_literal216=(Token)match(input,114,FOLLOW_114_in_if_music_stmt2676); 

            // src/parser/Music.g:204:66: ( elseif_music_stmt )*
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
            	    // src/parser/Music.g:204:66: elseif_music_stmt
            	    {
            	    pushFollow(FOLLOW_elseif_music_stmt_in_if_music_stmt2679);
            	    elseif_music_stmt217=elseif_music_stmt();

            	    state._fsp--;

            	    adaptor.addChild(root_0, elseif_music_stmt217.getTree());

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


            // src/parser/Music.g:204:85: ( else_music_stmt )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==ELSE) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // src/parser/Music.g:204:85: else_music_stmt
                    {
                    pushFollow(FOLLOW_else_music_stmt_in_if_music_stmt2682);
                    else_music_stmt218=else_music_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, else_music_stmt218.getTree());

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
    // src/parser/Music.g:207:1: elseif_music_stmt : ELSE IF '(' expr ')' '{' list_music_inst '}' -> ^( ELSEIF expr list_music_inst ) ;
    public final MusicParser.elseif_music_stmt_return elseif_music_stmt() throws RecognitionException {
        MusicParser.elseif_music_stmt_return retval = new MusicParser.elseif_music_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token ELSE219=null;
        Token IF220=null;
        Token char_literal221=null;
        Token char_literal223=null;
        Token char_literal224=null;
        Token char_literal226=null;
        MusicParser.expr_return expr222 =null;

        MusicParser.list_music_inst_return list_music_inst225 =null;


        AmlTree ELSE219_tree=null;
        AmlTree IF220_tree=null;
        AmlTree char_literal221_tree=null;
        AmlTree char_literal223_tree=null;
        AmlTree char_literal224_tree=null;
        AmlTree char_literal226_tree=null;
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
        RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
        RewriteRuleTokenStream stream_103=new RewriteRuleTokenStream(adaptor,"token 103");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_list_music_inst=new RewriteRuleSubtreeStream(adaptor,"rule list_music_inst");
        try {
            // src/parser/Music.g:207:21: ( ELSE IF '(' expr ')' '{' list_music_inst '}' -> ^( ELSEIF expr list_music_inst ) )
            // src/parser/Music.g:207:25: ELSE IF '(' expr ')' '{' list_music_inst '}'
            {
            ELSE219=(Token)match(input,ELSE,FOLLOW_ELSE_in_elseif_music_stmt2712);  
            stream_ELSE.add(ELSE219);


            IF220=(Token)match(input,IF,FOLLOW_IF_in_elseif_music_stmt2714);  
            stream_IF.add(IF220);


            char_literal221=(Token)match(input,102,FOLLOW_102_in_elseif_music_stmt2716);  
            stream_102.add(char_literal221);


            pushFollow(FOLLOW_expr_in_elseif_music_stmt2718);
            expr222=expr();

            state._fsp--;

            stream_expr.add(expr222.getTree());

            char_literal223=(Token)match(input,103,FOLLOW_103_in_elseif_music_stmt2720);  
            stream_103.add(char_literal223);


            char_literal224=(Token)match(input,113,FOLLOW_113_in_elseif_music_stmt2722);  
            stream_113.add(char_literal224);


            pushFollow(FOLLOW_list_music_inst_in_elseif_music_stmt2724);
            list_music_inst225=list_music_inst();

            state._fsp--;

            stream_list_music_inst.add(list_music_inst225.getTree());

            char_literal226=(Token)match(input,114,FOLLOW_114_in_elseif_music_stmt2726);  
            stream_114.add(char_literal226);


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
            // 207:70: -> ^( ELSEIF expr list_music_inst )
            {
                // src/parser/Music.g:207:73: ^( ELSEIF expr list_music_inst )
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
    // src/parser/Music.g:210:1: else_music_stmt : ELSE ^ '{' ! list_music_inst '}' !;
    public final MusicParser.else_music_stmt_return else_music_stmt() throws RecognitionException {
        MusicParser.else_music_stmt_return retval = new MusicParser.else_music_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token ELSE227=null;
        Token char_literal228=null;
        Token char_literal230=null;
        MusicParser.list_music_inst_return list_music_inst229 =null;


        AmlTree ELSE227_tree=null;
        AmlTree char_literal228_tree=null;
        AmlTree char_literal230_tree=null;

        try {
            // src/parser/Music.g:210:17: ( ELSE ^ '{' ! list_music_inst '}' !)
            // src/parser/Music.g:210:21: ELSE ^ '{' ! list_music_inst '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            ELSE227=(Token)match(input,ELSE,FOLLOW_ELSE_in_else_music_stmt2767); 
            ELSE227_tree = 
            (AmlTree)adaptor.create(ELSE227)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(ELSE227_tree, root_0);


            char_literal228=(Token)match(input,113,FOLLOW_113_in_else_music_stmt2770); 

            pushFollow(FOLLOW_list_music_inst_in_else_music_stmt2773);
            list_music_inst229=list_music_inst();

            state._fsp--;

            adaptor.addChild(root_0, list_music_inst229.getTree());

            char_literal230=(Token)match(input,114,FOLLOW_114_in_else_music_stmt2775); 

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
    // src/parser/Music.g:213:1: song : SONG ^ ( id_rule )? '{' ! ( beat ';' !)? ( speed ';' !)? ( tone ';' !)? ( transport ';' !)? ( track )* ( drums_track )? '}' !;
    public final MusicParser.song_return song() throws RecognitionException {
        MusicParser.song_return retval = new MusicParser.song_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token SONG231=null;
        Token char_literal233=null;
        Token char_literal235=null;
        Token char_literal237=null;
        Token char_literal239=null;
        Token char_literal241=null;
        Token char_literal244=null;
        MusicParser.id_rule_return id_rule232 =null;

        MusicParser.beat_return beat234 =null;

        MusicParser.speed_return speed236 =null;

        MusicParser.tone_return tone238 =null;

        MusicParser.transport_return transport240 =null;

        MusicParser.track_return track242 =null;

        MusicParser.drums_track_return drums_track243 =null;


        AmlTree SONG231_tree=null;
        AmlTree char_literal233_tree=null;
        AmlTree char_literal235_tree=null;
        AmlTree char_literal237_tree=null;
        AmlTree char_literal239_tree=null;
        AmlTree char_literal241_tree=null;
        AmlTree char_literal244_tree=null;

        try {
            // src/parser/Music.g:213:13: ( SONG ^ ( id_rule )? '{' ! ( beat ';' !)? ( speed ';' !)? ( tone ';' !)? ( transport ';' !)? ( track )* ( drums_track )? '}' !)
            // src/parser/Music.g:213:17: SONG ^ ( id_rule )? '{' ! ( beat ';' !)? ( speed ';' !)? ( tone ';' !)? ( transport ';' !)? ( track )* ( drums_track )? '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            SONG231=(Token)match(input,SONG,FOLLOW_SONG_in_song2810); 
            SONG231_tree = 
            (AmlTree)adaptor.create(SONG231)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(SONG231_tree, root_0);


            // src/parser/Music.g:213:23: ( id_rule )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==ID_||LA37_0==LETTER_X) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // src/parser/Music.g:213:23: id_rule
                    {
                    pushFollow(FOLLOW_id_rule_in_song2813);
                    id_rule232=id_rule();

                    state._fsp--;

                    adaptor.addChild(root_0, id_rule232.getTree());

                    }
                    break;

            }


            char_literal233=(Token)match(input,113,FOLLOW_113_in_song2816); 

            // src/parser/Music.g:213:37: ( beat ';' !)?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==BEAT) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // src/parser/Music.g:213:38: beat ';' !
                    {
                    pushFollow(FOLLOW_beat_in_song2820);
                    beat234=beat();

                    state._fsp--;

                    adaptor.addChild(root_0, beat234.getTree());

                    char_literal235=(Token)match(input,107,FOLLOW_107_in_song2822); 

                    }
                    break;

            }


            // src/parser/Music.g:213:50: ( speed ';' !)?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==SPEED) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // src/parser/Music.g:213:51: speed ';' !
                    {
                    pushFollow(FOLLOW_speed_in_song2828);
                    speed236=speed();

                    state._fsp--;

                    adaptor.addChild(root_0, speed236.getTree());

                    char_literal237=(Token)match(input,107,FOLLOW_107_in_song2830); 

                    }
                    break;

            }


            // src/parser/Music.g:213:64: ( tone ';' !)?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==TONE) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // src/parser/Music.g:213:65: tone ';' !
                    {
                    pushFollow(FOLLOW_tone_in_song2836);
                    tone238=tone();

                    state._fsp--;

                    adaptor.addChild(root_0, tone238.getTree());

                    char_literal239=(Token)match(input,107,FOLLOW_107_in_song2838); 

                    }
                    break;

            }


            // src/parser/Music.g:213:77: ( transport ';' !)?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==TRANSPORT) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // src/parser/Music.g:213:78: transport ';' !
                    {
                    pushFollow(FOLLOW_transport_in_song2844);
                    transport240=transport();

                    state._fsp--;

                    adaptor.addChild(root_0, transport240.getTree());

                    char_literal241=(Token)match(input,107,FOLLOW_107_in_song2846); 

                    }
                    break;

            }


            // src/parser/Music.g:213:96: ( track )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==TRACK) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // src/parser/Music.g:213:97: track
            	    {
            	    pushFollow(FOLLOW_track_in_song2853);
            	    track242=track();

            	    state._fsp--;

            	    adaptor.addChild(root_0, track242.getTree());

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);


            // src/parser/Music.g:213:105: ( drums_track )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==DRUMS) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // src/parser/Music.g:213:105: drums_track
                    {
                    pushFollow(FOLLOW_drums_track_in_song2857);
                    drums_track243=drums_track();

                    state._fsp--;

                    adaptor.addChild(root_0, drums_track243.getTree());

                    }
                    break;

            }


            char_literal244=(Token)match(input,114,FOLLOW_114_in_song2860); 

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
    // src/parser/Music.g:216:1: track : TRACK ^ ( id_rule !)? ( STRING )? compas_aux ;
    public final MusicParser.track_return track() throws RecognitionException {
        MusicParser.track_return retval = new MusicParser.track_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token TRACK245=null;
        Token STRING247=null;
        MusicParser.id_rule_return id_rule246 =null;

        MusicParser.compas_aux_return compas_aux248 =null;


        AmlTree TRACK245_tree=null;
        AmlTree STRING247_tree=null;

        try {
            // src/parser/Music.g:216:13: ( TRACK ^ ( id_rule !)? ( STRING )? compas_aux )
            // src/parser/Music.g:216:17: TRACK ^ ( id_rule !)? ( STRING )? compas_aux
            {
            root_0 = (AmlTree)adaptor.nil();


            TRACK245=(Token)match(input,TRACK,FOLLOW_TRACK_in_track2890); 
            TRACK245_tree = 
            (AmlTree)adaptor.create(TRACK245)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(TRACK245_tree, root_0);


            // src/parser/Music.g:216:31: ( id_rule !)?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==ID_||LA44_0==LETTER_X) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // src/parser/Music.g:216:31: id_rule !
                    {
                    pushFollow(FOLLOW_id_rule_in_track2893);
                    id_rule246=id_rule();

                    state._fsp--;


                    }
                    break;

            }


            // src/parser/Music.g:216:34: ( STRING )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==STRING) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // src/parser/Music.g:216:34: STRING
                    {
                    STRING247=(Token)match(input,STRING,FOLLOW_STRING_in_track2897); 
                    STRING247_tree = 
                    (AmlTree)adaptor.create(STRING247)
                    ;
                    adaptor.addChild(root_0, STRING247_tree);


                    }
                    break;

            }


            pushFollow(FOLLOW_compas_aux_in_track2900);
            compas_aux248=compas_aux();

            state._fsp--;

            adaptor.addChild(root_0, compas_aux248.getTree());

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
    // src/parser/Music.g:219:1: drums_track : DRUMS ^ compas_aux ;
    public final MusicParser.drums_track_return drums_track() throws RecognitionException {
        MusicParser.drums_track_return retval = new MusicParser.drums_track_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token DRUMS249=null;
        MusicParser.compas_aux_return compas_aux250 =null;


        AmlTree DRUMS249_tree=null;

        try {
            // src/parser/Music.g:219:13: ( DRUMS ^ compas_aux )
            // src/parser/Music.g:219:17: DRUMS ^ compas_aux
            {
            root_0 = (AmlTree)adaptor.nil();


            DRUMS249=(Token)match(input,DRUMS,FOLLOW_DRUMS_in_drums_track2923); 
            DRUMS249_tree = 
            (AmlTree)adaptor.create(DRUMS249)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(DRUMS249_tree, root_0);


            pushFollow(FOLLOW_compas_aux_in_drums_track2926);
            compas_aux250=compas_aux();

            state._fsp--;

            adaptor.addChild(root_0, compas_aux250.getTree());

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
    // src/parser/Music.g:222:1: compas_aux : compas_list -> ^( COMPAS_LIST compas_list ) ;
    public final MusicParser.compas_aux_return compas_aux() throws RecognitionException {
        MusicParser.compas_aux_return retval = new MusicParser.compas_aux_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        MusicParser.compas_list_return compas_list251 =null;


        RewriteRuleSubtreeStream stream_compas_list=new RewriteRuleSubtreeStream(adaptor,"rule compas_list");
        try {
            // src/parser/Music.g:222:13: ( compas_list -> ^( COMPAS_LIST compas_list ) )
            // src/parser/Music.g:222:17: compas_list
            {
            pushFollow(FOLLOW_compas_list_in_compas_aux2950);
            compas_list251=compas_list();

            state._fsp--;

            stream_compas_list.add(compas_list251.getTree());

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
            // 222:29: -> ^( COMPAS_LIST compas_list )
            {
                // src/parser/Music.g:222:32: ^( COMPAS_LIST compas_list )
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
    // src/parser/Music.g:225:1: compas_list : ( DOUBLE_BAR !| repetition ) compas_or_repetition ( DOUBLE_BAR !) ;
    public final MusicParser.compas_list_return compas_list() throws RecognitionException {
        MusicParser.compas_list_return retval = new MusicParser.compas_list_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token DOUBLE_BAR252=null;
        Token DOUBLE_BAR255=null;
        MusicParser.repetition_return repetition253 =null;

        MusicParser.compas_or_repetition_return compas_or_repetition254 =null;


        AmlTree DOUBLE_BAR252_tree=null;
        AmlTree DOUBLE_BAR255_tree=null;

        try {
            // src/parser/Music.g:225:13: ( ( DOUBLE_BAR !| repetition ) compas_or_repetition ( DOUBLE_BAR !) )
            // src/parser/Music.g:225:15: ( DOUBLE_BAR !| repetition ) compas_or_repetition ( DOUBLE_BAR !)
            {
            root_0 = (AmlTree)adaptor.nil();


            // src/parser/Music.g:225:15: ( DOUBLE_BAR !| repetition )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==DOUBLE_BAR) ) {
                alt46=1;
            }
            else if ( (LA46_0==POS_NUM||LA46_0==START_REPETITION) ) {
                alt46=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;

            }
            switch (alt46) {
                case 1 :
                    // src/parser/Music.g:225:16: DOUBLE_BAR !
                    {
                    DOUBLE_BAR252=(Token)match(input,DOUBLE_BAR,FOLLOW_DOUBLE_BAR_in_compas_list2980); 

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:225:30: repetition
                    {
                    pushFollow(FOLLOW_repetition_in_compas_list2985);
                    repetition253=repetition();

                    state._fsp--;

                    adaptor.addChild(root_0, repetition253.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_compas_or_repetition_in_compas_list2988);
            compas_or_repetition254=compas_or_repetition();

            state._fsp--;

            adaptor.addChild(root_0, compas_or_repetition254.getTree());

            // src/parser/Music.g:225:63: ( DOUBLE_BAR !)
            // src/parser/Music.g:225:64: DOUBLE_BAR !
            {
            DOUBLE_BAR255=(Token)match(input,DOUBLE_BAR,FOLLOW_DOUBLE_BAR_in_compas_list2991); 

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
    // src/parser/Music.g:228:1: compasses : compas ( BAR ! compas )* ;
    public final MusicParser.compasses_return compasses() throws RecognitionException {
        MusicParser.compasses_return retval = new MusicParser.compasses_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token BAR257=null;
        MusicParser.compas_return compas256 =null;

        MusicParser.compas_return compas258 =null;


        AmlTree BAR257_tree=null;

        try {
            // src/parser/Music.g:228:13: ( compas ( BAR ! compas )* )
            // src/parser/Music.g:228:17: compas ( BAR ! compas )*
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_compas_in_compasses3018);
            compas256=compas();

            state._fsp--;

            adaptor.addChild(root_0, compas256.getTree());

            // src/parser/Music.g:228:24: ( BAR ! compas )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==BAR) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // src/parser/Music.g:228:25: BAR ! compas
            	    {
            	    BAR257=(Token)match(input,BAR,FOLLOW_BAR_in_compasses3021); 

            	    pushFollow(FOLLOW_compas_in_compasses3024);
            	    compas258=compas();

            	    state._fsp--;

            	    adaptor.addChild(root_0, compas258.getTree());

            	    }
            	    break;

            	default :
            	    break loop47;
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
    // src/parser/Music.g:231:1: repetition : ( POS_NUM LETTER_X )? START_REPETITION repetition_aux END_REPETITION -> ^( REPETITION ( POS_NUM )? repetition_aux ) ;
    public final MusicParser.repetition_return repetition() throws RecognitionException {
        MusicParser.repetition_return retval = new MusicParser.repetition_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token POS_NUM259=null;
        Token LETTER_X260=null;
        Token START_REPETITION261=null;
        Token END_REPETITION263=null;
        MusicParser.repetition_aux_return repetition_aux262 =null;


        AmlTree POS_NUM259_tree=null;
        AmlTree LETTER_X260_tree=null;
        AmlTree START_REPETITION261_tree=null;
        AmlTree END_REPETITION263_tree=null;
        RewriteRuleTokenStream stream_LETTER_X=new RewriteRuleTokenStream(adaptor,"token LETTER_X");
        RewriteRuleTokenStream stream_POS_NUM=new RewriteRuleTokenStream(adaptor,"token POS_NUM");
        RewriteRuleTokenStream stream_END_REPETITION=new RewriteRuleTokenStream(adaptor,"token END_REPETITION");
        RewriteRuleTokenStream stream_START_REPETITION=new RewriteRuleTokenStream(adaptor,"token START_REPETITION");
        RewriteRuleSubtreeStream stream_repetition_aux=new RewriteRuleSubtreeStream(adaptor,"rule repetition_aux");
        try {
            // src/parser/Music.g:231:13: ( ( POS_NUM LETTER_X )? START_REPETITION repetition_aux END_REPETITION -> ^( REPETITION ( POS_NUM )? repetition_aux ) )
            // src/parser/Music.g:231:17: ( POS_NUM LETTER_X )? START_REPETITION repetition_aux END_REPETITION
            {
            // src/parser/Music.g:231:17: ( POS_NUM LETTER_X )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==POS_NUM) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // src/parser/Music.g:231:18: POS_NUM LETTER_X
                    {
                    POS_NUM259=(Token)match(input,POS_NUM,FOLLOW_POS_NUM_in_repetition3051);  
                    stream_POS_NUM.add(POS_NUM259);


                    LETTER_X260=(Token)match(input,LETTER_X,FOLLOW_LETTER_X_in_repetition3053);  
                    stream_LETTER_X.add(LETTER_X260);


                    }
                    break;

            }


            START_REPETITION261=(Token)match(input,START_REPETITION,FOLLOW_START_REPETITION_in_repetition3057);  
            stream_START_REPETITION.add(START_REPETITION261);


            pushFollow(FOLLOW_repetition_aux_in_repetition3059);
            repetition_aux262=repetition_aux();

            state._fsp--;

            stream_repetition_aux.add(repetition_aux262.getTree());

            END_REPETITION263=(Token)match(input,END_REPETITION,FOLLOW_END_REPETITION_in_repetition3061);  
            stream_END_REPETITION.add(END_REPETITION263);


            // AST REWRITE
            // elements: POS_NUM, repetition_aux
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AmlTree)adaptor.nil();
            // 231:87: -> ^( REPETITION ( POS_NUM )? repetition_aux )
            {
                // src/parser/Music.g:231:90: ^( REPETITION ( POS_NUM )? repetition_aux )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(REPETITION, "REPETITION")
                , root_1);

                // src/parser/Music.g:231:103: ( POS_NUM )?
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
    // src/parser/Music.g:234:1: repetition_aux : compas_or_repetition -> ^( COMPAS_LIST compas_or_repetition ) ;
    public final MusicParser.repetition_aux_return repetition_aux() throws RecognitionException {
        MusicParser.repetition_aux_return retval = new MusicParser.repetition_aux_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        MusicParser.compas_or_repetition_return compas_or_repetition264 =null;


        RewriteRuleSubtreeStream stream_compas_or_repetition=new RewriteRuleSubtreeStream(adaptor,"rule compas_or_repetition");
        try {
            // src/parser/Music.g:234:16: ( compas_or_repetition -> ^( COMPAS_LIST compas_or_repetition ) )
            // src/parser/Music.g:234:18: compas_or_repetition
            {
            pushFollow(FOLLOW_compas_or_repetition_in_repetition_aux3096);
            compas_or_repetition264=compas_or_repetition();

            state._fsp--;

            stream_compas_or_repetition.add(compas_or_repetition264.getTree());

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
            // 234:39: -> ^( COMPAS_LIST compas_or_repetition )
            {
                // src/parser/Music.g:234:42: ^( COMPAS_LIST compas_or_repetition )
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
    // src/parser/Music.g:236:1: compas_or_repetition : ( compasses | repetition )* ;
    public final MusicParser.compas_or_repetition_return compas_or_repetition() throws RecognitionException {
        MusicParser.compas_or_repetition_return retval = new MusicParser.compas_or_repetition_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        MusicParser.compasses_return compasses265 =null;

        MusicParser.repetition_return repetition266 =null;



        try {
            // src/parser/Music.g:236:22: ( ( compasses | repetition )* )
            // src/parser/Music.g:236:24: ( compasses | repetition )*
            {
            root_0 = (AmlTree)adaptor.nil();


            // src/parser/Music.g:236:24: ( compasses | repetition )*
            loop49:
            do {
                int alt49=3;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==ARMOR||(LA49_0 >= BEAT && LA49_0 <= BOOL)||LA49_0==CHORD||LA49_0==DECR||LA49_0==DN||LA49_0==DRUMS_NOTE_TYPE||(LA49_0 >= FIGURE_TYPE && LA49_0 <= FOR)||(LA49_0 >= ID_ && LA49_0 <= INT)||LA49_0==LETTER_X||LA49_0==NOTE||LA49_0==NOTE_TYPE||LA49_0==READ||LA49_0==SPEED||(LA49_0 >= STRING_TYPE && LA49_0 <= SUSTAIN)||LA49_0==TONE||LA49_0==TRANSPORT||(LA49_0 >= VOLUME && LA49_0 <= WRITE)||LA49_0==102||LA49_0==106||(LA49_0 >= 108 && LA49_0 <= 111)) ) {
                    alt49=1;
                }
                else if ( (LA49_0==POS_NUM||LA49_0==START_REPETITION) ) {
                    alt49=2;
                }


                switch (alt49) {
            	case 1 :
            	    // src/parser/Music.g:236:25: compasses
            	    {
            	    pushFollow(FOLLOW_compasses_in_compas_or_repetition3113);
            	    compasses265=compasses();

            	    state._fsp--;

            	    adaptor.addChild(root_0, compasses265.getTree());

            	    }
            	    break;
            	case 2 :
            	    // src/parser/Music.g:236:37: repetition
            	    {
            	    pushFollow(FOLLOW_repetition_in_compas_or_repetition3117);
            	    repetition266=repetition();

            	    state._fsp--;

            	    adaptor.addChild(root_0, repetition266.getTree());

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
    // $ANTLR end "compas_or_repetition"


    public static class compas_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "compas"
    // src/parser/Music.g:238:1: compas : ( options {greedy=true; } : music_inst )+ -> ^( COMPAS ( music_inst )+ ) ;
    public final MusicParser.compas_return compas() throws RecognitionException {
        MusicParser.compas_return retval = new MusicParser.compas_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        MusicParser.music_inst_return music_inst267 =null;


        RewriteRuleSubtreeStream stream_music_inst=new RewriteRuleSubtreeStream(adaptor,"rule music_inst");
        try {
            // src/parser/Music.g:238:13: ( ( options {greedy=true; } : music_inst )+ -> ^( COMPAS ( music_inst )+ ) )
            // src/parser/Music.g:238:16: ( options {greedy=true; } : music_inst )+
            {
            // src/parser/Music.g:238:16: ( options {greedy=true; } : music_inst )+
            int cnt50=0;
            loop50:
            do {
                int alt50=2;
                switch ( input.LA(1) ) {
                case CHORD:
                    {
                    alt50=1;
                    }
                    break;
                case READ:
                    {
                    alt50=1;
                    }
                    break;
                case WRITE:
                    {
                    alt50=1;
                    }
                    break;
                case VOLUME:
                    {
                    alt50=1;
                    }
                    break;
                case TONE:
                    {
                    alt50=1;
                    }
                    break;
                case BEAT:
                    {
                    alt50=1;
                    }
                    break;
                case SPEED:
                    {
                    alt50=1;
                    }
                    break;
                case INSTRUMENT:
                    {
                    alt50=1;
                    }
                    break;
                case TRANSPORT:
                    {
                    alt50=1;
                    }
                    break;
                case ID_:
                    {
                    alt50=1;
                    }
                    break;
                case LETTER_X:
                    {
                    alt50=1;
                    }
                    break;
                case INCR:
                    {
                    alt50=1;
                    }
                    break;
                case DECR:
                    {
                    alt50=1;
                    }
                    break;
                case WHILE:
                    {
                    alt50=1;
                    }
                    break;
                case 109:
                    {
                    alt50=1;
                    }
                    break;
                case FOR:
                    {
                    alt50=1;
                    }
                    break;
                case IF:
                    {
                    alt50=1;
                    }
                    break;
                case BOOL:
                case DRUMS_NOTE_TYPE:
                case FIGURE_TYPE:
                case INT:
                case NOTE_TYPE:
                case STRING_TYPE:
                    {
                    alt50=1;
                    }
                    break;
                case 102:
                    {
                    alt50=1;
                    }
                    break;
                case ARMOR:
                case BEMOL:
                case SUSTAIN:
                    {
                    alt50=1;
                    }
                    break;
                case NOTE:
                    {
                    alt50=1;
                    }
                    break;
                case 110:
                    {
                    alt50=1;
                    }
                    break;
                case DN:
                    {
                    alt50=1;
                    }
                    break;
                case 108:
                    {
                    alt50=1;
                    }
                    break;
                case 106:
                    {
                    alt50=1;
                    }
                    break;
                case 111:
                    {
                    alt50=1;
                    }
                    break;

                }

                switch (alt50) {
            	case 1 :
            	    // src/parser/Music.g:238:42: music_inst
            	    {
            	    pushFollow(FOLLOW_music_inst_in_compas3143);
            	    music_inst267=music_inst();

            	    state._fsp--;

            	    stream_music_inst.add(music_inst267.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt50 >= 1 ) break loop50;
                        EarlyExitException eee =
                            new EarlyExitException(50, input);
                        throw eee;
                }
                cnt50++;
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
            // 238:58: -> ^( COMPAS ( music_inst )+ )
            {
                // src/parser/Music.g:238:61: ^( COMPAS ( music_inst )+ )
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
    // src/parser/Music.g:241:1: tone : TONE ^ expr ( SUSTAIN | BEMOL ) ;
    public final MusicParser.tone_return tone() throws RecognitionException {
        MusicParser.tone_return retval = new MusicParser.tone_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token TONE268=null;
        Token set270=null;
        MusicParser.expr_return expr269 =null;


        AmlTree TONE268_tree=null;
        AmlTree set270_tree=null;

        try {
            // src/parser/Music.g:241:13: ( TONE ^ expr ( SUSTAIN | BEMOL ) )
            // src/parser/Music.g:241:17: TONE ^ expr ( SUSTAIN | BEMOL )
            {
            root_0 = (AmlTree)adaptor.nil();


            TONE268=(Token)match(input,TONE,FOLLOW_TONE_in_tone3187); 
            TONE268_tree = 
            (AmlTree)adaptor.create(TONE268)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(TONE268_tree, root_0);


            pushFollow(FOLLOW_expr_in_tone3190);
            expr269=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr269.getTree());

            set270=(Token)input.LT(1);

            if ( input.LA(1)==BEMOL||input.LA(1)==SUSTAIN ) {
                input.consume();
                adaptor.addChild(root_0, 
                (AmlTree)adaptor.create(set270)
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


    public static class notes_group_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "notes_group"
    // src/parser/Music.g:245:1: notes_group : ( notes_type ( '.' ( FIGURE_NAME ( POS_NUM )? ) ( DOT )? )? ( TIE )? -> ^( FIGURE notes_type ( FIGURE_NAME )? ( DOT )? ( TIE )? ) | ':' ! id_rule );
    public final MusicParser.notes_group_return notes_group() throws RecognitionException {
        MusicParser.notes_group_return retval = new MusicParser.notes_group_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal272=null;
        Token FIGURE_NAME273=null;
        Token POS_NUM274=null;
        Token DOT275=null;
        Token TIE276=null;
        Token char_literal277=null;
        MusicParser.notes_type_return notes_type271 =null;

        MusicParser.id_rule_return id_rule278 =null;


        AmlTree char_literal272_tree=null;
        AmlTree FIGURE_NAME273_tree=null;
        AmlTree POS_NUM274_tree=null;
        AmlTree DOT275_tree=null;
        AmlTree TIE276_tree=null;
        AmlTree char_literal277_tree=null;
        RewriteRuleTokenStream stream_TIE=new RewriteRuleTokenStream(adaptor,"token TIE");
        RewriteRuleTokenStream stream_FIGURE_NAME=new RewriteRuleTokenStream(adaptor,"token FIGURE_NAME");
        RewriteRuleTokenStream stream_POS_NUM=new RewriteRuleTokenStream(adaptor,"token POS_NUM");
        RewriteRuleTokenStream stream_105=new RewriteRuleTokenStream(adaptor,"token 105");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_notes_type=new RewriteRuleSubtreeStream(adaptor,"rule notes_type");
        try {
            // src/parser/Music.g:245:13: ( notes_type ( '.' ( FIGURE_NAME ( POS_NUM )? ) ( DOT )? )? ( TIE )? -> ^( FIGURE notes_type ( FIGURE_NAME )? ( DOT )? ( TIE )? ) | ':' ! id_rule )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==ARMOR||LA55_0==BEMOL||LA55_0==CHORD||LA55_0==DN||LA55_0==NOTE||LA55_0==SUSTAIN||LA55_0==102||LA55_0==108||LA55_0==110) ) {
                alt55=1;
            }
            else if ( (LA55_0==106) ) {
                alt55=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;

            }
            switch (alt55) {
                case 1 :
                    // src/parser/Music.g:245:17: notes_type ( '.' ( FIGURE_NAME ( POS_NUM )? ) ( DOT )? )? ( TIE )?
                    {
                    pushFollow(FOLLOW_notes_type_in_notes_group3222);
                    notes_type271=notes_type();

                    state._fsp--;

                    stream_notes_type.add(notes_type271.getTree());

                    // src/parser/Music.g:245:28: ( '.' ( FIGURE_NAME ( POS_NUM )? ) ( DOT )? )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==105) ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // src/parser/Music.g:245:29: '.' ( FIGURE_NAME ( POS_NUM )? ) ( DOT )?
                            {
                            char_literal272=(Token)match(input,105,FOLLOW_105_in_notes_group3225);  
                            stream_105.add(char_literal272);


                            // src/parser/Music.g:245:33: ( FIGURE_NAME ( POS_NUM )? )
                            // src/parser/Music.g:245:34: FIGURE_NAME ( POS_NUM )?
                            {
                            FIGURE_NAME273=(Token)match(input,FIGURE_NAME,FOLLOW_FIGURE_NAME_in_notes_group3228);  
                            stream_FIGURE_NAME.add(FIGURE_NAME273);


                            // src/parser/Music.g:245:46: ( POS_NUM )?
                            int alt51=2;
                            int LA51_0 = input.LA(1);

                            if ( (LA51_0==POS_NUM) ) {
                                int LA51_1 = input.LA(2);

                                if ( (LA51_1==LETTER_X) ) {
                                    int LA51_3 = input.LA(3);

                                    if ( (LA51_3==ASSIG||LA51_3==DECR||LA51_3==DIVIDE_ASSIG||LA51_3==INCR||LA51_3==MINUS_ASSIG||LA51_3==MOD_ASSIG||LA51_3==PLUS_ASSIG||LA51_3==PROD_ASSIG||LA51_3==102||LA51_3==105) ) {
                                        alt51=1;
                                    }
                                }
                                else if ( (LA51_1==ARMOR||(LA51_1 >= BAR && LA51_1 <= BOOL)||LA51_1==CHORD||LA51_1==DECR||(LA51_1 >= DN && LA51_1 <= DOUBLE_BAR)||LA51_1==DRUMS_NOTE_TYPE||LA51_1==END_REPETITION||(LA51_1 >= FIGURE_TYPE && LA51_1 <= FOR)||(LA51_1 >= ID_ && LA51_1 <= INT)||LA51_1==NOTE||LA51_1==NOTE_TYPE||LA51_1==POS_NUM||LA51_1==READ||(LA51_1 >= SPEED && LA51_1 <= START_REPETITION)||(LA51_1 >= STRING_TYPE && LA51_1 <= TONE)||LA51_1==TRANSPORT||(LA51_1 >= VOLUME && LA51_1 <= WRITE)||LA51_1==102||(LA51_1 >= 106 && LA51_1 <= 111)||LA51_1==114) ) {
                                    alt51=1;
                                }
                            }
                            switch (alt51) {
                                case 1 :
                                    // src/parser/Music.g:245:46: POS_NUM
                                    {
                                    POS_NUM274=(Token)match(input,POS_NUM,FOLLOW_POS_NUM_in_notes_group3230);  
                                    stream_POS_NUM.add(POS_NUM274);


                                    }
                                    break;

                            }


                            }


                            // src/parser/Music.g:245:56: ( DOT )?
                            int alt52=2;
                            int LA52_0 = input.LA(1);

                            if ( (LA52_0==DOT) ) {
                                alt52=1;
                            }
                            switch (alt52) {
                                case 1 :
                                    // src/parser/Music.g:245:56: DOT
                                    {
                                    DOT275=(Token)match(input,DOT,FOLLOW_DOT_in_notes_group3234);  
                                    stream_DOT.add(DOT275);


                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    // src/parser/Music.g:245:63: ( TIE )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==TIE) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // src/parser/Music.g:245:63: TIE
                            {
                            TIE276=(Token)match(input,TIE,FOLLOW_TIE_in_notes_group3239);  
                            stream_TIE.add(TIE276);


                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: notes_type, FIGURE_NAME, TIE, DOT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AmlTree)adaptor.nil();
                    // 245:68: -> ^( FIGURE notes_type ( FIGURE_NAME )? ( DOT )? ( TIE )? )
                    {
                        // src/parser/Music.g:245:71: ^( FIGURE notes_type ( FIGURE_NAME )? ( DOT )? ( TIE )? )
                        {
                        AmlTree root_1 = (AmlTree)adaptor.nil();
                        root_1 = (AmlTree)adaptor.becomeRoot(
                        (AmlTree)adaptor.create(FIGURE, "FIGURE")
                        , root_1);

                        adaptor.addChild(root_1, stream_notes_type.nextTree());

                        // src/parser/Music.g:245:91: ( FIGURE_NAME )?
                        if ( stream_FIGURE_NAME.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_FIGURE_NAME.nextNode()
                            );

                        }
                        stream_FIGURE_NAME.reset();

                        // src/parser/Music.g:245:104: ( DOT )?
                        if ( stream_DOT.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_DOT.nextNode()
                            );

                        }
                        stream_DOT.reset();

                        // src/parser/Music.g:245:109: ( TIE )?
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
                    // src/parser/Music.g:246:13: ':' ! id_rule
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    char_literal277=(Token)match(input,106,FOLLOW_106_in_notes_group3271); 

                    pushFollow(FOLLOW_id_rule_in_notes_group3274);
                    id_rule278=id_rule();

                    state._fsp--;

                    adaptor.addChild(root_0, id_rule278.getTree());

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


    public static class notes_variable_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "notes_variable"
    // src/parser/Music.g:249:1: notes_variable : notes_type ( '.' ( FIGURE_NAME ( POS_NUM )? ) ( DOT )? )? ( TIE )? -> ^( FIGURE notes_type ( FIGURE_NAME )? ( DOT )? ( TIE )? ) ;
    public final MusicParser.notes_variable_return notes_variable() throws RecognitionException {
        MusicParser.notes_variable_return retval = new MusicParser.notes_variable_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal280=null;
        Token FIGURE_NAME281=null;
        Token POS_NUM282=null;
        Token DOT283=null;
        Token TIE284=null;
        MusicParser.notes_type_return notes_type279 =null;


        AmlTree char_literal280_tree=null;
        AmlTree FIGURE_NAME281_tree=null;
        AmlTree POS_NUM282_tree=null;
        AmlTree DOT283_tree=null;
        AmlTree TIE284_tree=null;
        RewriteRuleTokenStream stream_TIE=new RewriteRuleTokenStream(adaptor,"token TIE");
        RewriteRuleTokenStream stream_FIGURE_NAME=new RewriteRuleTokenStream(adaptor,"token FIGURE_NAME");
        RewriteRuleTokenStream stream_POS_NUM=new RewriteRuleTokenStream(adaptor,"token POS_NUM");
        RewriteRuleTokenStream stream_105=new RewriteRuleTokenStream(adaptor,"token 105");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_notes_type=new RewriteRuleSubtreeStream(adaptor,"rule notes_type");
        try {
            // src/parser/Music.g:249:17: ( notes_type ( '.' ( FIGURE_NAME ( POS_NUM )? ) ( DOT )? )? ( TIE )? -> ^( FIGURE notes_type ( FIGURE_NAME )? ( DOT )? ( TIE )? ) )
            // src/parser/Music.g:249:21: notes_type ( '.' ( FIGURE_NAME ( POS_NUM )? ) ( DOT )? )? ( TIE )?
            {
            pushFollow(FOLLOW_notes_type_in_notes_variable3298);
            notes_type279=notes_type();

            state._fsp--;

            stream_notes_type.add(notes_type279.getTree());

            // src/parser/Music.g:249:32: ( '.' ( FIGURE_NAME ( POS_NUM )? ) ( DOT )? )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==105) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // src/parser/Music.g:249:33: '.' ( FIGURE_NAME ( POS_NUM )? ) ( DOT )?
                    {
                    char_literal280=(Token)match(input,105,FOLLOW_105_in_notes_variable3301);  
                    stream_105.add(char_literal280);


                    // src/parser/Music.g:249:37: ( FIGURE_NAME ( POS_NUM )? )
                    // src/parser/Music.g:249:38: FIGURE_NAME ( POS_NUM )?
                    {
                    FIGURE_NAME281=(Token)match(input,FIGURE_NAME,FOLLOW_FIGURE_NAME_in_notes_variable3304);  
                    stream_FIGURE_NAME.add(FIGURE_NAME281);


                    // src/parser/Music.g:249:50: ( POS_NUM )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==POS_NUM) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // src/parser/Music.g:249:50: POS_NUM
                            {
                            POS_NUM282=(Token)match(input,POS_NUM,FOLLOW_POS_NUM_in_notes_variable3306);  
                            stream_POS_NUM.add(POS_NUM282);


                            }
                            break;

                    }


                    }


                    // src/parser/Music.g:249:60: ( DOT )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==DOT) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // src/parser/Music.g:249:60: DOT
                            {
                            DOT283=(Token)match(input,DOT,FOLLOW_DOT_in_notes_variable3310);  
                            stream_DOT.add(DOT283);


                            }
                            break;

                    }


                    }
                    break;

            }


            // src/parser/Music.g:249:67: ( TIE )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==TIE) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // src/parser/Music.g:249:67: TIE
                    {
                    TIE284=(Token)match(input,TIE,FOLLOW_TIE_in_notes_variable3315);  
                    stream_TIE.add(TIE284);


                    }
                    break;

            }


            // AST REWRITE
            // elements: FIGURE_NAME, DOT, TIE, notes_type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AmlTree)adaptor.nil();
            // 249:72: -> ^( FIGURE notes_type ( FIGURE_NAME )? ( DOT )? ( TIE )? )
            {
                // src/parser/Music.g:249:75: ^( FIGURE notes_type ( FIGURE_NAME )? ( DOT )? ( TIE )? )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(FIGURE, "FIGURE")
                , root_1);

                adaptor.addChild(root_1, stream_notes_type.nextTree());

                // src/parser/Music.g:249:95: ( FIGURE_NAME )?
                if ( stream_FIGURE_NAME.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_FIGURE_NAME.nextNode()
                    );

                }
                stream_FIGURE_NAME.reset();

                // src/parser/Music.g:249:108: ( DOT )?
                if ( stream_DOT.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_DOT.nextNode()
                    );

                }
                stream_DOT.reset();

                // src/parser/Music.g:249:113: ( TIE )?
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
    // $ANTLR end "notes_variable"


    public static class notes_type_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "notes_type"
    // src/parser/Music.g:252:1: notes_type : ( chord | notes );
    public final MusicParser.notes_type_return notes_type() throws RecognitionException {
        MusicParser.notes_type_return retval = new MusicParser.notes_type_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        MusicParser.chord_return chord285 =null;

        MusicParser.notes_return notes286 =null;



        try {
            // src/parser/Music.g:252:13: ( chord | notes )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==CHORD) ) {
                alt60=1;
            }
            else if ( (LA60_0==ARMOR||LA60_0==BEMOL||LA60_0==DN||LA60_0==NOTE||LA60_0==SUSTAIN||LA60_0==102||LA60_0==108||LA60_0==110) ) {
                alt60=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;

            }
            switch (alt60) {
                case 1 :
                    // src/parser/Music.g:252:15: chord
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_chord_in_notes_type3359);
                    chord285=chord();

                    state._fsp--;

                    adaptor.addChild(root_0, chord285.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:252:23: notes
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_notes_in_notes_type3363);
                    notes286=notes();

                    state._fsp--;

                    adaptor.addChild(root_0, notes286.getTree());

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
    // src/parser/Music.g:255:1: chord : CHORD ^ '(' ! note ( MINOR | PLUS | DIMINUTION )? ( SEVENTH | MAJ7 )? ')' !;
    public final MusicParser.chord_return chord() throws RecognitionException {
        MusicParser.chord_return retval = new MusicParser.chord_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token CHORD287=null;
        Token char_literal288=null;
        Token set290=null;
        Token set291=null;
        Token char_literal292=null;
        MusicParser.note_return note289 =null;


        AmlTree CHORD287_tree=null;
        AmlTree char_literal288_tree=null;
        AmlTree set290_tree=null;
        AmlTree set291_tree=null;
        AmlTree char_literal292_tree=null;

        try {
            // src/parser/Music.g:255:13: ( CHORD ^ '(' ! note ( MINOR | PLUS | DIMINUTION )? ( SEVENTH | MAJ7 )? ')' !)
            // src/parser/Music.g:255:17: CHORD ^ '(' ! note ( MINOR | PLUS | DIMINUTION )? ( SEVENTH | MAJ7 )? ')' !
            {
            root_0 = (AmlTree)adaptor.nil();


            CHORD287=(Token)match(input,CHORD,FOLLOW_CHORD_in_chord3392); 
            CHORD287_tree = 
            (AmlTree)adaptor.create(CHORD287)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(CHORD287_tree, root_0);


            char_literal288=(Token)match(input,102,FOLLOW_102_in_chord3395); 

            pushFollow(FOLLOW_note_in_chord3398);
            note289=note();

            state._fsp--;

            adaptor.addChild(root_0, note289.getTree());

            // src/parser/Music.g:255:34: ( MINOR | PLUS | DIMINUTION )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==DIMINUTION||LA61_0==MINOR||LA61_0==PLUS) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // src/parser/Music.g:
                    {
                    set290=(Token)input.LT(1);

                    if ( input.LA(1)==DIMINUTION||input.LA(1)==MINOR||input.LA(1)==PLUS ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (AmlTree)adaptor.create(set290)
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


            // src/parser/Music.g:255:59: ( SEVENTH | MAJ7 )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==MAJ7||LA62_0==SEVENTH) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // src/parser/Music.g:
                    {
                    set291=(Token)input.LT(1);

                    if ( input.LA(1)==MAJ7||input.LA(1)==SEVENTH ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (AmlTree)adaptor.create(set291)
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


            char_literal292=(Token)match(input,103,FOLLOW_103_in_chord3418); 

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
    // src/parser/Music.g:258:1: notes : ( '(' ( note )+ ')' | note ) -> ^( NOTES ( note )+ ) ;
    public final MusicParser.notes_return notes() throws RecognitionException {
        MusicParser.notes_return retval = new MusicParser.notes_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal293=null;
        Token char_literal295=null;
        MusicParser.note_return note294 =null;

        MusicParser.note_return note296 =null;


        AmlTree char_literal293_tree=null;
        AmlTree char_literal295_tree=null;
        RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
        RewriteRuleTokenStream stream_103=new RewriteRuleTokenStream(adaptor,"token 103");
        RewriteRuleSubtreeStream stream_note=new RewriteRuleSubtreeStream(adaptor,"rule note");
        try {
            // src/parser/Music.g:258:13: ( ( '(' ( note )+ ')' | note ) -> ^( NOTES ( note )+ ) )
            // src/parser/Music.g:258:17: ( '(' ( note )+ ')' | note )
            {
            // src/parser/Music.g:258:17: ( '(' ( note )+ ')' | note )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==102) ) {
                alt64=1;
            }
            else if ( (LA64_0==ARMOR||LA64_0==BEMOL||LA64_0==DN||LA64_0==NOTE||LA64_0==SUSTAIN||LA64_0==108||LA64_0==110) ) {
                alt64=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;

            }
            switch (alt64) {
                case 1 :
                    // src/parser/Music.g:258:19: '(' ( note )+ ')'
                    {
                    char_literal293=(Token)match(input,102,FOLLOW_102_in_notes3450);  
                    stream_102.add(char_literal293);


                    // src/parser/Music.g:258:23: ( note )+
                    int cnt63=0;
                    loop63:
                    do {
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( (LA63_0==ARMOR||LA63_0==BEMOL||LA63_0==DN||LA63_0==NOTE||LA63_0==SUSTAIN||LA63_0==108||LA63_0==110) ) {
                            alt63=1;
                        }


                        switch (alt63) {
                    	case 1 :
                    	    // src/parser/Music.g:258:24: note
                    	    {
                    	    pushFollow(FOLLOW_note_in_notes3453);
                    	    note294=note();

                    	    state._fsp--;

                    	    stream_note.add(note294.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt63 >= 1 ) break loop63;
                                EarlyExitException eee =
                                    new EarlyExitException(63, input);
                                throw eee;
                        }
                        cnt63++;
                    } while (true);


                    char_literal295=(Token)match(input,103,FOLLOW_103_in_notes3457);  
                    stream_103.add(char_literal295);


                    }
                    break;
                case 2 :
                    // src/parser/Music.g:258:38: note
                    {
                    pushFollow(FOLLOW_note_in_notes3462);
                    note296=note();

                    state._fsp--;

                    stream_note.add(note296.getTree());

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
            // 258:44: -> ^( NOTES ( note )+ )
            {
                // src/parser/Music.g:258:47: ^( NOTES ( note )+ )
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
    // src/parser/Music.g:261:1: triplet : '[' notes_type notes_type notes_type ']' ( '.' FIGURE_NAME ) -> ^( TRIPLET FIGURE_NAME notes_type notes_type notes_type ) ;
    public final MusicParser.triplet_return triplet() throws RecognitionException {
        MusicParser.triplet_return retval = new MusicParser.triplet_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal297=null;
        Token char_literal301=null;
        Token char_literal302=null;
        Token FIGURE_NAME303=null;
        MusicParser.notes_type_return notes_type298 =null;

        MusicParser.notes_type_return notes_type299 =null;

        MusicParser.notes_type_return notes_type300 =null;


        AmlTree char_literal297_tree=null;
        AmlTree char_literal301_tree=null;
        AmlTree char_literal302_tree=null;
        AmlTree FIGURE_NAME303_tree=null;
        RewriteRuleTokenStream stream_111=new RewriteRuleTokenStream(adaptor,"token 111");
        RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
        RewriteRuleTokenStream stream_FIGURE_NAME=new RewriteRuleTokenStream(adaptor,"token FIGURE_NAME");
        RewriteRuleTokenStream stream_105=new RewriteRuleTokenStream(adaptor,"token 105");
        RewriteRuleSubtreeStream stream_notes_type=new RewriteRuleSubtreeStream(adaptor,"rule notes_type");
        try {
            // src/parser/Music.g:261:13: ( '[' notes_type notes_type notes_type ']' ( '.' FIGURE_NAME ) -> ^( TRIPLET FIGURE_NAME notes_type notes_type notes_type ) )
            // src/parser/Music.g:261:17: '[' notes_type notes_type notes_type ']' ( '.' FIGURE_NAME )
            {
            char_literal297=(Token)match(input,111,FOLLOW_111_in_triplet3499);  
            stream_111.add(char_literal297);


            pushFollow(FOLLOW_notes_type_in_triplet3501);
            notes_type298=notes_type();

            state._fsp--;

            stream_notes_type.add(notes_type298.getTree());

            pushFollow(FOLLOW_notes_type_in_triplet3503);
            notes_type299=notes_type();

            state._fsp--;

            stream_notes_type.add(notes_type299.getTree());

            pushFollow(FOLLOW_notes_type_in_triplet3505);
            notes_type300=notes_type();

            state._fsp--;

            stream_notes_type.add(notes_type300.getTree());

            char_literal301=(Token)match(input,112,FOLLOW_112_in_triplet3507);  
            stream_112.add(char_literal301);


            // src/parser/Music.g:261:58: ( '.' FIGURE_NAME )
            // src/parser/Music.g:261:59: '.' FIGURE_NAME
            {
            char_literal302=(Token)match(input,105,FOLLOW_105_in_triplet3510);  
            stream_105.add(char_literal302);


            FIGURE_NAME303=(Token)match(input,FIGURE_NAME,FOLLOW_FIGURE_NAME_in_triplet3512);  
            stream_FIGURE_NAME.add(FIGURE_NAME303);


            }


            // AST REWRITE
            // elements: FIGURE_NAME, notes_type, notes_type, notes_type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AmlTree)adaptor.nil();
            // 261:76: -> ^( TRIPLET FIGURE_NAME notes_type notes_type notes_type )
            {
                // src/parser/Music.g:261:79: ^( TRIPLET FIGURE_NAME notes_type notes_type notes_type )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(TRIPLET, "TRIPLET")
                , root_1);

                adaptor.addChild(root_1, 
                stream_FIGURE_NAME.nextNode()
                );

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


    public static class drum_note_aux_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "drum_note_aux"
    // src/parser/Music.g:264:1: drum_note_aux : DN '(' num_expr ')' -> ^( DRUM_NOTE num_expr ) ;
    public final MusicParser.drum_note_aux_return drum_note_aux() throws RecognitionException {
        MusicParser.drum_note_aux_return retval = new MusicParser.drum_note_aux_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token DN304=null;
        Token char_literal305=null;
        Token char_literal307=null;
        MusicParser.num_expr_return num_expr306 =null;


        AmlTree DN304_tree=null;
        AmlTree char_literal305_tree=null;
        AmlTree char_literal307_tree=null;
        RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
        RewriteRuleTokenStream stream_103=new RewriteRuleTokenStream(adaptor,"token 103");
        RewriteRuleTokenStream stream_DN=new RewriteRuleTokenStream(adaptor,"token DN");
        RewriteRuleSubtreeStream stream_num_expr=new RewriteRuleSubtreeStream(adaptor,"rule num_expr");
        try {
            // src/parser/Music.g:264:15: ( DN '(' num_expr ')' -> ^( DRUM_NOTE num_expr ) )
            // src/parser/Music.g:264:17: DN '(' num_expr ')'
            {
            DN304=(Token)match(input,DN,FOLLOW_DN_in_drum_note_aux3548);  
            stream_DN.add(DN304);


            char_literal305=(Token)match(input,102,FOLLOW_102_in_drum_note_aux3550);  
            stream_102.add(char_literal305);


            pushFollow(FOLLOW_num_expr_in_drum_note_aux3552);
            num_expr306=num_expr();

            state._fsp--;

            stream_num_expr.add(num_expr306.getTree());

            char_literal307=(Token)match(input,103,FOLLOW_103_in_drum_note_aux3554);  
            stream_103.add(char_literal307);


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
            // 264:37: -> ^( DRUM_NOTE num_expr )
            {
                // src/parser/Music.g:264:40: ^( DRUM_NOTE num_expr )
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
    // $ANTLR end "drum_note_aux"


    public static class note_aux_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "note_aux"
    // src/parser/Music.g:267:1: note_aux : ( BEMOL | SUSTAIN | ARMOR )? NOTE ^ ( NEG_NUM )? ;
    public final MusicParser.note_aux_return note_aux() throws RecognitionException {
        MusicParser.note_aux_return retval = new MusicParser.note_aux_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token set308=null;
        Token NOTE309=null;
        Token NEG_NUM310=null;

        AmlTree set308_tree=null;
        AmlTree NOTE309_tree=null;
        AmlTree NEG_NUM310_tree=null;

        try {
            // src/parser/Music.g:267:13: ( ( BEMOL | SUSTAIN | ARMOR )? NOTE ^ ( NEG_NUM )? )
            // src/parser/Music.g:267:17: ( BEMOL | SUSTAIN | ARMOR )? NOTE ^ ( NEG_NUM )?
            {
            root_0 = (AmlTree)adaptor.nil();


            // src/parser/Music.g:267:17: ( BEMOL | SUSTAIN | ARMOR )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==ARMOR||LA65_0==BEMOL||LA65_0==SUSTAIN) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // src/parser/Music.g:
                    {
                    set308=(Token)input.LT(1);

                    if ( input.LA(1)==ARMOR||input.LA(1)==BEMOL||input.LA(1)==SUSTAIN ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (AmlTree)adaptor.create(set308)
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


            NOTE309=(Token)match(input,NOTE,FOLLOW_NOTE_in_note_aux3589); 
            NOTE309_tree = 
            (AmlTree)adaptor.create(NOTE309)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(NOTE309_tree, root_0);


            // src/parser/Music.g:267:50: ( NEG_NUM )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==NEG_NUM) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // src/parser/Music.g:267:51: NEG_NUM
                    {
                    NEG_NUM310=(Token)match(input,NEG_NUM,FOLLOW_NEG_NUM_in_note_aux3593); 
                    NEG_NUM310_tree = 
                    (AmlTree)adaptor.create(NEG_NUM310)
                    ;
                    adaptor.addChild(root_0, NEG_NUM310_tree);


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
    // $ANTLR end "note_aux"


    public static class note_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "note"
    // src/parser/Music.g:270:1: note : ( note_aux | 'N:' ! id_rule | drum_note_aux | 'DN:' ! id_rule );
    public final MusicParser.note_return note() throws RecognitionException {
        MusicParser.note_return retval = new MusicParser.note_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token string_literal312=null;
        Token string_literal315=null;
        MusicParser.note_aux_return note_aux311 =null;

        MusicParser.id_rule_return id_rule313 =null;

        MusicParser.drum_note_aux_return drum_note_aux314 =null;

        MusicParser.id_rule_return id_rule316 =null;


        AmlTree string_literal312_tree=null;
        AmlTree string_literal315_tree=null;

        try {
            // src/parser/Music.g:270:13: ( note_aux | 'N:' ! id_rule | drum_note_aux | 'DN:' ! id_rule )
            int alt67=4;
            switch ( input.LA(1) ) {
            case ARMOR:
            case BEMOL:
            case NOTE:
            case SUSTAIN:
                {
                alt67=1;
                }
                break;
            case 110:
                {
                alt67=2;
                }
                break;
            case DN:
                {
                alt67=3;
                }
                break;
            case 108:
                {
                alt67=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;

            }

            switch (alt67) {
                case 1 :
                    // src/parser/Music.g:270:17: note_aux
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_note_aux_in_note3625);
                    note_aux311=note_aux();

                    state._fsp--;

                    adaptor.addChild(root_0, note_aux311.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:271:17: 'N:' ! id_rule
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    string_literal312=(Token)match(input,110,FOLLOW_110_in_note3643); 

                    pushFollow(FOLLOW_id_rule_in_note3646);
                    id_rule313=id_rule();

                    state._fsp--;

                    adaptor.addChild(root_0, id_rule313.getTree());

                    }
                    break;
                case 3 :
                    // src/parser/Music.g:272:15: drum_note_aux
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_drum_note_aux_in_note3662);
                    drum_note_aux314=drum_note_aux();

                    state._fsp--;

                    adaptor.addChild(root_0, drum_note_aux314.getTree());

                    }
                    break;
                case 4 :
                    // src/parser/Music.g:273:17: 'DN:' ! id_rule
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    string_literal315=(Token)match(input,108,FOLLOW_108_in_note3680); 

                    pushFollow(FOLLOW_id_rule_in_note3683);
                    id_rule316=id_rule();

                    state._fsp--;

                    adaptor.addChild(root_0, id_rule316.getTree());

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
    // $ANTLR end "note"


    public static class expr_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // src/parser/Music.g:277:1: expr : boolterm ( OR ^ boolterm )* ;
    public final MusicParser.expr_return expr() throws RecognitionException {
        MusicParser.expr_return retval = new MusicParser.expr_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token OR318=null;
        MusicParser.boolterm_return boolterm317 =null;

        MusicParser.boolterm_return boolterm319 =null;


        AmlTree OR318_tree=null;

        try {
            // src/parser/Music.g:277:9: ( boolterm ( OR ^ boolterm )* )
            // src/parser/Music.g:277:13: boolterm ( OR ^ boolterm )*
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_boolterm_in_expr3710);
            boolterm317=boolterm();

            state._fsp--;

            adaptor.addChild(root_0, boolterm317.getTree());

            // src/parser/Music.g:277:22: ( OR ^ boolterm )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==OR) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // src/parser/Music.g:277:23: OR ^ boolterm
            	    {
            	    OR318=(Token)match(input,OR,FOLLOW_OR_in_expr3713); 
            	    OR318_tree = 
            	    (AmlTree)adaptor.create(OR318)
            	    ;
            	    root_0 = (AmlTree)adaptor.becomeRoot(OR318_tree, root_0);


            	    pushFollow(FOLLOW_boolterm_in_expr3716);
            	    boolterm319=boolterm();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolterm319.getTree());

            	    }
            	    break;

            	default :
            	    break loop68;
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
    // src/parser/Music.g:280:1: boolterm : boolfact ( AND ^ boolfact )* ;
    public final MusicParser.boolterm_return boolterm() throws RecognitionException {
        MusicParser.boolterm_return retval = new MusicParser.boolterm_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token AND321=null;
        MusicParser.boolfact_return boolfact320 =null;

        MusicParser.boolfact_return boolfact322 =null;


        AmlTree AND321_tree=null;

        try {
            // src/parser/Music.g:280:13: ( boolfact ( AND ^ boolfact )* )
            // src/parser/Music.g:280:17: boolfact ( AND ^ boolfact )*
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_boolfact_in_boolterm3734);
            boolfact320=boolfact();

            state._fsp--;

            adaptor.addChild(root_0, boolfact320.getTree());

            // src/parser/Music.g:280:26: ( AND ^ boolfact )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==AND) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // src/parser/Music.g:280:27: AND ^ boolfact
            	    {
            	    AND321=(Token)match(input,AND,FOLLOW_AND_in_boolterm3737); 
            	    AND321_tree = 
            	    (AmlTree)adaptor.create(AND321)
            	    ;
            	    root_0 = (AmlTree)adaptor.becomeRoot(AND321_tree, root_0);


            	    pushFollow(FOLLOW_boolfact_in_boolterm3740);
            	    boolfact322=boolfact();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolfact322.getTree());

            	    }
            	    break;

            	default :
            	    break loop69;
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
    // src/parser/Music.g:283:1: boolfact : num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? ;
    public final MusicParser.boolfact_return boolfact() throws RecognitionException {
        MusicParser.boolfact_return retval = new MusicParser.boolfact_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token EQUAL324=null;
        Token NOT_EQUAL325=null;
        Token LT326=null;
        Token LE327=null;
        Token GT328=null;
        Token GE329=null;
        MusicParser.num_expr_return num_expr323 =null;

        MusicParser.num_expr_return num_expr330 =null;


        AmlTree EQUAL324_tree=null;
        AmlTree NOT_EQUAL325_tree=null;
        AmlTree LT326_tree=null;
        AmlTree LE327_tree=null;
        AmlTree GT328_tree=null;
        AmlTree GE329_tree=null;

        try {
            // src/parser/Music.g:283:13: ( num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? )
            // src/parser/Music.g:283:17: num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_num_expr_in_boolfact3762);
            num_expr323=num_expr();

            state._fsp--;

            adaptor.addChild(root_0, num_expr323.getTree());

            // src/parser/Music.g:283:26: ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==EQUAL||(LA71_0 >= GE && LA71_0 <= GT)||LA71_0==LE||LA71_0==LT||LA71_0==NOT_EQUAL) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // src/parser/Music.g:283:27: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr
                    {
                    // src/parser/Music.g:283:27: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^)
                    int alt70=6;
                    switch ( input.LA(1) ) {
                    case EQUAL:
                        {
                        alt70=1;
                        }
                        break;
                    case NOT_EQUAL:
                        {
                        alt70=2;
                        }
                        break;
                    case LT:
                        {
                        alt70=3;
                        }
                        break;
                    case LE:
                        {
                        alt70=4;
                        }
                        break;
                    case GT:
                        {
                        alt70=5;
                        }
                        break;
                    case GE:
                        {
                        alt70=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 70, 0, input);

                        throw nvae;

                    }

                    switch (alt70) {
                        case 1 :
                            // src/parser/Music.g:283:28: EQUAL ^
                            {
                            EQUAL324=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_boolfact3766); 
                            EQUAL324_tree = 
                            (AmlTree)adaptor.create(EQUAL324)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(EQUAL324_tree, root_0);


                            }
                            break;
                        case 2 :
                            // src/parser/Music.g:283:37: NOT_EQUAL ^
                            {
                            NOT_EQUAL325=(Token)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_boolfact3771); 
                            NOT_EQUAL325_tree = 
                            (AmlTree)adaptor.create(NOT_EQUAL325)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(NOT_EQUAL325_tree, root_0);


                            }
                            break;
                        case 3 :
                            // src/parser/Music.g:283:50: LT ^
                            {
                            LT326=(Token)match(input,LT,FOLLOW_LT_in_boolfact3776); 
                            LT326_tree = 
                            (AmlTree)adaptor.create(LT326)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(LT326_tree, root_0);


                            }
                            break;
                        case 4 :
                            // src/parser/Music.g:283:56: LE ^
                            {
                            LE327=(Token)match(input,LE,FOLLOW_LE_in_boolfact3781); 
                            LE327_tree = 
                            (AmlTree)adaptor.create(LE327)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(LE327_tree, root_0);


                            }
                            break;
                        case 5 :
                            // src/parser/Music.g:283:62: GT ^
                            {
                            GT328=(Token)match(input,GT,FOLLOW_GT_in_boolfact3786); 
                            GT328_tree = 
                            (AmlTree)adaptor.create(GT328)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(GT328_tree, root_0);


                            }
                            break;
                        case 6 :
                            // src/parser/Music.g:283:68: GE ^
                            {
                            GE329=(Token)match(input,GE,FOLLOW_GE_in_boolfact3791); 
                            GE329_tree = 
                            (AmlTree)adaptor.create(GE329)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(GE329_tree, root_0);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_num_expr_in_boolfact3795);
                    num_expr330=num_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, num_expr330.getTree());

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
    // src/parser/Music.g:286:1: num_expr : term ( ( PLUS ^| MINUS ^) term )* ;
    public final MusicParser.num_expr_return num_expr() throws RecognitionException {
        MusicParser.num_expr_return retval = new MusicParser.num_expr_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token PLUS332=null;
        Token MINUS333=null;
        MusicParser.term_return term331 =null;

        MusicParser.term_return term334 =null;


        AmlTree PLUS332_tree=null;
        AmlTree MINUS333_tree=null;

        try {
            // src/parser/Music.g:286:13: ( term ( ( PLUS ^| MINUS ^) term )* )
            // src/parser/Music.g:286:17: term ( ( PLUS ^| MINUS ^) term )*
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_term_in_num_expr3817);
            term331=term();

            state._fsp--;

            adaptor.addChild(root_0, term331.getTree());

            // src/parser/Music.g:286:22: ( ( PLUS ^| MINUS ^) term )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==MINUS||LA73_0==PLUS) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // src/parser/Music.g:286:24: ( PLUS ^| MINUS ^) term
            	    {
            	    // src/parser/Music.g:286:24: ( PLUS ^| MINUS ^)
            	    int alt72=2;
            	    int LA72_0 = input.LA(1);

            	    if ( (LA72_0==PLUS) ) {
            	        alt72=1;
            	    }
            	    else if ( (LA72_0==MINUS) ) {
            	        alt72=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 72, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt72) {
            	        case 1 :
            	            // src/parser/Music.g:286:25: PLUS ^
            	            {
            	            PLUS332=(Token)match(input,PLUS,FOLLOW_PLUS_in_num_expr3822); 
            	            PLUS332_tree = 
            	            (AmlTree)adaptor.create(PLUS332)
            	            ;
            	            root_0 = (AmlTree)adaptor.becomeRoot(PLUS332_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // src/parser/Music.g:286:33: MINUS ^
            	            {
            	            MINUS333=(Token)match(input,MINUS,FOLLOW_MINUS_in_num_expr3827); 
            	            MINUS333_tree = 
            	            (AmlTree)adaptor.create(MINUS333)
            	            ;
            	            root_0 = (AmlTree)adaptor.becomeRoot(MINUS333_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_term_in_num_expr3831);
            	    term334=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term334.getTree());

            	    }
            	    break;

            	default :
            	    break loop73;
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
    // src/parser/Music.g:289:1: term : factor ( ( DOT ^| DIV ^| MOD ^) factor )* ;
    public final MusicParser.term_return term() throws RecognitionException {
        MusicParser.term_return retval = new MusicParser.term_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token DOT336=null;
        Token DIV337=null;
        Token MOD338=null;
        MusicParser.factor_return factor335 =null;

        MusicParser.factor_return factor339 =null;


        AmlTree DOT336_tree=null;
        AmlTree DIV337_tree=null;
        AmlTree MOD338_tree=null;

        try {
            // src/parser/Music.g:289:9: ( factor ( ( DOT ^| DIV ^| MOD ^) factor )* )
            // src/parser/Music.g:289:13: factor ( ( DOT ^| DIV ^| MOD ^) factor )*
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term3853);
            factor335=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor335.getTree());

            // src/parser/Music.g:289:20: ( ( DOT ^| DIV ^| MOD ^) factor )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==DIV||LA75_0==DOT||LA75_0==MOD) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // src/parser/Music.g:289:22: ( DOT ^| DIV ^| MOD ^) factor
            	    {
            	    // src/parser/Music.g:289:22: ( DOT ^| DIV ^| MOD ^)
            	    int alt74=3;
            	    switch ( input.LA(1) ) {
            	    case DOT:
            	        {
            	        alt74=1;
            	        }
            	        break;
            	    case DIV:
            	        {
            	        alt74=2;
            	        }
            	        break;
            	    case MOD:
            	        {
            	        alt74=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 74, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt74) {
            	        case 1 :
            	            // src/parser/Music.g:289:23: DOT ^
            	            {
            	            DOT336=(Token)match(input,DOT,FOLLOW_DOT_in_term3858); 
            	            DOT336_tree = 
            	            (AmlTree)adaptor.create(DOT336)
            	            ;
            	            root_0 = (AmlTree)adaptor.becomeRoot(DOT336_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // src/parser/Music.g:289:30: DIV ^
            	            {
            	            DIV337=(Token)match(input,DIV,FOLLOW_DIV_in_term3863); 
            	            DIV337_tree = 
            	            (AmlTree)adaptor.create(DIV337)
            	            ;
            	            root_0 = (AmlTree)adaptor.becomeRoot(DIV337_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // src/parser/Music.g:289:37: MOD ^
            	            {
            	            MOD338=(Token)match(input,MOD,FOLLOW_MOD_in_term3868); 
            	            MOD338_tree = 
            	            (AmlTree)adaptor.create(MOD338)
            	            ;
            	            root_0 = (AmlTree)adaptor.becomeRoot(MOD338_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_factor_in_term3872);
            	    factor339=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor339.getTree());

            	    }
            	    break;

            	default :
            	    break loop75;
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
    // src/parser/Music.g:292:1: factor : ( NOT ^| PLUS ^| MINUS ^)? atom ;
    public final MusicParser.factor_return factor() throws RecognitionException {
        MusicParser.factor_return retval = new MusicParser.factor_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token NOT340=null;
        Token PLUS341=null;
        Token MINUS342=null;
        MusicParser.atom_return atom343 =null;


        AmlTree NOT340_tree=null;
        AmlTree PLUS341_tree=null;
        AmlTree MINUS342_tree=null;

        try {
            // src/parser/Music.g:292:9: ( ( NOT ^| PLUS ^| MINUS ^)? atom )
            // src/parser/Music.g:292:13: ( NOT ^| PLUS ^| MINUS ^)? atom
            {
            root_0 = (AmlTree)adaptor.nil();


            // src/parser/Music.g:292:13: ( NOT ^| PLUS ^| MINUS ^)?
            int alt76=4;
            switch ( input.LA(1) ) {
                case NOT:
                    {
                    alt76=1;
                    }
                    break;
                case PLUS:
                    {
                    alt76=2;
                    }
                    break;
                case MINUS:
                    {
                    alt76=3;
                    }
                    break;
            }

            switch (alt76) {
                case 1 :
                    // src/parser/Music.g:292:14: NOT ^
                    {
                    NOT340=(Token)match(input,NOT,FOLLOW_NOT_in_factor3889); 
                    NOT340_tree = 
                    (AmlTree)adaptor.create(NOT340)
                    ;
                    root_0 = (AmlTree)adaptor.becomeRoot(NOT340_tree, root_0);


                    }
                    break;
                case 2 :
                    // src/parser/Music.g:292:21: PLUS ^
                    {
                    PLUS341=(Token)match(input,PLUS,FOLLOW_PLUS_in_factor3894); 
                    PLUS341_tree = 
                    (AmlTree)adaptor.create(PLUS341)
                    ;
                    root_0 = (AmlTree)adaptor.becomeRoot(PLUS341_tree, root_0);


                    }
                    break;
                case 3 :
                    // src/parser/Music.g:292:29: MINUS ^
                    {
                    MINUS342=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor3899); 
                    MINUS342_tree = 
                    (AmlTree)adaptor.create(MINUS342)
                    ;
                    root_0 = (AmlTree)adaptor.becomeRoot(MINUS342_tree, root_0);


                    }
                    break;

            }


            pushFollow(FOLLOW_atom_in_factor3904);
            atom343=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom343.getTree());

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
    // src/parser/Music.g:295:1: atom : ( var_access | nnum | 'N:' ! note_aux | 'DN:' ! drum_note_aux | STRING | funcall | var_funcall | TRUE | FALSE | '(' ! expr ')' !);
    public final MusicParser.atom_return atom() throws RecognitionException {
        MusicParser.atom_return retval = new MusicParser.atom_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token string_literal346=null;
        Token string_literal348=null;
        Token STRING350=null;
        Token TRUE353=null;
        Token FALSE354=null;
        Token char_literal355=null;
        Token char_literal357=null;
        MusicParser.var_access_return var_access344 =null;

        MusicParser.nnum_return nnum345 =null;

        MusicParser.note_aux_return note_aux347 =null;

        MusicParser.drum_note_aux_return drum_note_aux349 =null;

        MusicParser.funcall_return funcall351 =null;

        MusicParser.var_funcall_return var_funcall352 =null;

        MusicParser.expr_return expr356 =null;


        AmlTree string_literal346_tree=null;
        AmlTree string_literal348_tree=null;
        AmlTree STRING350_tree=null;
        AmlTree TRUE353_tree=null;
        AmlTree FALSE354_tree=null;
        AmlTree char_literal355_tree=null;
        AmlTree char_literal357_tree=null;

        try {
            // src/parser/Music.g:295:9: ( var_access | nnum | 'N:' ! note_aux | 'DN:' ! drum_note_aux | STRING | funcall | var_funcall | TRUE | FALSE | '(' ! expr ')' !)
            int alt77=10;
            switch ( input.LA(1) ) {
            case ID_:
                {
                switch ( input.LA(2) ) {
                case 105:
                    {
                    int LA77_10 = input.LA(3);

                    if ( (LA77_10==ID_) ) {
                        int LA77_13 = input.LA(4);

                        if ( (LA77_13==AND||LA77_13==BEMOL||LA77_13==DIV||LA77_13==DOT||LA77_13==EQUAL||(LA77_13 >= GE && LA77_13 <= GT)||LA77_13==LE||LA77_13==LT||LA77_13==MINUS||LA77_13==MOD||LA77_13==NOT_EQUAL||(LA77_13 >= OR && LA77_13 <= PLUS)||LA77_13==SUSTAIN||(LA77_13 >= 103 && LA77_13 <= 104)||(LA77_13 >= 106 && LA77_13 <= 107)) ) {
                            alt77=1;
                        }
                        else if ( (LA77_13==102) ) {
                            alt77=7;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 77, 13, input);

                            throw nvae;

                        }
                    }
                    else if ( (LA77_10==LETTER_X) ) {
                        int LA77_14 = input.LA(4);

                        if ( (LA77_14==AND||LA77_14==BEMOL||LA77_14==DIV||LA77_14==DOT||LA77_14==EQUAL||(LA77_14 >= GE && LA77_14 <= GT)||LA77_14==LE||LA77_14==LT||LA77_14==MINUS||LA77_14==MOD||LA77_14==NOT_EQUAL||(LA77_14 >= OR && LA77_14 <= PLUS)||LA77_14==SUSTAIN||(LA77_14 >= 103 && LA77_14 <= 104)||(LA77_14 >= 106 && LA77_14 <= 107)) ) {
                            alt77=1;
                        }
                        else if ( (LA77_14==102) ) {
                            alt77=7;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 77, 14, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 77, 10, input);

                        throw nvae;

                    }
                    }
                    break;
                case AND:
                case BEMOL:
                case DIV:
                case DOT:
                case EQUAL:
                case GE:
                case GT:
                case LE:
                case LT:
                case MINUS:
                case MOD:
                case NOT_EQUAL:
                case OR:
                case PLUS:
                case SUSTAIN:
                case 103:
                case 104:
                case 106:
                case 107:
                    {
                    alt77=1;
                    }
                    break;
                case 102:
                    {
                    alt77=6;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 77, 1, input);

                    throw nvae;

                }

                }
                break;
            case LETTER_X:
                {
                switch ( input.LA(2) ) {
                case 105:
                    {
                    int LA77_10 = input.LA(3);

                    if ( (LA77_10==ID_) ) {
                        int LA77_13 = input.LA(4);

                        if ( (LA77_13==AND||LA77_13==BEMOL||LA77_13==DIV||LA77_13==DOT||LA77_13==EQUAL||(LA77_13 >= GE && LA77_13 <= GT)||LA77_13==LE||LA77_13==LT||LA77_13==MINUS||LA77_13==MOD||LA77_13==NOT_EQUAL||(LA77_13 >= OR && LA77_13 <= PLUS)||LA77_13==SUSTAIN||(LA77_13 >= 103 && LA77_13 <= 104)||(LA77_13 >= 106 && LA77_13 <= 107)) ) {
                            alt77=1;
                        }
                        else if ( (LA77_13==102) ) {
                            alt77=7;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 77, 13, input);

                            throw nvae;

                        }
                    }
                    else if ( (LA77_10==LETTER_X) ) {
                        int LA77_14 = input.LA(4);

                        if ( (LA77_14==AND||LA77_14==BEMOL||LA77_14==DIV||LA77_14==DOT||LA77_14==EQUAL||(LA77_14 >= GE && LA77_14 <= GT)||LA77_14==LE||LA77_14==LT||LA77_14==MINUS||LA77_14==MOD||LA77_14==NOT_EQUAL||(LA77_14 >= OR && LA77_14 <= PLUS)||LA77_14==SUSTAIN||(LA77_14 >= 103 && LA77_14 <= 104)||(LA77_14 >= 106 && LA77_14 <= 107)) ) {
                            alt77=1;
                        }
                        else if ( (LA77_14==102) ) {
                            alt77=7;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 77, 14, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 77, 10, input);

                        throw nvae;

                    }
                    }
                    break;
                case AND:
                case BEMOL:
                case DIV:
                case DOT:
                case EQUAL:
                case GE:
                case GT:
                case LE:
                case LT:
                case MINUS:
                case MOD:
                case NOT_EQUAL:
                case OR:
                case PLUS:
                case SUSTAIN:
                case 103:
                case 104:
                case 106:
                case 107:
                    {
                    alt77=1;
                    }
                    break;
                case 102:
                    {
                    alt77=6;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 77, 2, input);

                    throw nvae;

                }

                }
                break;
            case NEG_NUM:
            case POS_NUM:
                {
                alt77=2;
                }
                break;
            case 110:
                {
                alt77=3;
                }
                break;
            case 108:
                {
                alt77=4;
                }
                break;
            case STRING:
                {
                alt77=5;
                }
                break;
            case TRUE:
                {
                alt77=8;
                }
                break;
            case FALSE:
                {
                alt77=9;
                }
                break;
            case 102:
                {
                alt77=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;

            }

            switch (alt77) {
                case 1 :
                    // src/parser/Music.g:295:13: var_access
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_var_access_in_atom3920);
                    var_access344=var_access();

                    state._fsp--;

                    adaptor.addChild(root_0, var_access344.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:296:7: nnum
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_nnum_in_atom3928);
                    nnum345=nnum();

                    state._fsp--;

                    adaptor.addChild(root_0, nnum345.getTree());

                    }
                    break;
                case 3 :
                    // src/parser/Music.g:297:7: 'N:' ! note_aux
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    string_literal346=(Token)match(input,110,FOLLOW_110_in_atom3936); 

                    pushFollow(FOLLOW_note_aux_in_atom3939);
                    note_aux347=note_aux();

                    state._fsp--;

                    adaptor.addChild(root_0, note_aux347.getTree());

                    }
                    break;
                case 4 :
                    // src/parser/Music.g:298:7: 'DN:' ! drum_note_aux
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    string_literal348=(Token)match(input,108,FOLLOW_108_in_atom3947); 

                    pushFollow(FOLLOW_drum_note_aux_in_atom3950);
                    drum_note_aux349=drum_note_aux();

                    state._fsp--;

                    adaptor.addChild(root_0, drum_note_aux349.getTree());

                    }
                    break;
                case 5 :
                    // src/parser/Music.g:299:7: STRING
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    STRING350=(Token)match(input,STRING,FOLLOW_STRING_in_atom3958); 
                    STRING350_tree = 
                    (AmlTree)adaptor.create(STRING350)
                    ;
                    adaptor.addChild(root_0, STRING350_tree);


                    }
                    break;
                case 6 :
                    // src/parser/Music.g:300:7: funcall
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_atom3966);
                    funcall351=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall351.getTree());

                    }
                    break;
                case 7 :
                    // src/parser/Music.g:301:7: var_funcall
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_var_funcall_in_atom3974);
                    var_funcall352=var_funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, var_funcall352.getTree());

                    }
                    break;
                case 8 :
                    // src/parser/Music.g:302:7: TRUE
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    TRUE353=(Token)match(input,TRUE,FOLLOW_TRUE_in_atom3982); 
                    TRUE353_tree = 
                    (AmlTree)adaptor.create(TRUE353)
                    ;
                    adaptor.addChild(root_0, TRUE353_tree);


                    }
                    break;
                case 9 :
                    // src/parser/Music.g:303:7: FALSE
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    FALSE354=(Token)match(input,FALSE,FOLLOW_FALSE_in_atom3990); 
                    FALSE354_tree = 
                    (AmlTree)adaptor.create(FALSE354)
                    ;
                    adaptor.addChild(root_0, FALSE354_tree);


                    }
                    break;
                case 10 :
                    // src/parser/Music.g:304:7: '(' ! expr ')' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    char_literal355=(Token)match(input,102,FOLLOW_102_in_atom3998); 

                    pushFollow(FOLLOW_expr_in_atom4001);
                    expr356=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr356.getTree());

                    char_literal357=(Token)match(input,103,FOLLOW_103_in_atom4003); 

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
    // src/parser/Music.g:307:1: nnum : (x= POS_NUM |x= NEG_NUM ) -> ^( NUM[$x] ) ;
    public final MusicParser.nnum_return nnum() throws RecognitionException {
        MusicParser.nnum_return retval = new MusicParser.nnum_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token x=null;

        AmlTree x_tree=null;
        RewriteRuleTokenStream stream_POS_NUM=new RewriteRuleTokenStream(adaptor,"token POS_NUM");
        RewriteRuleTokenStream stream_NEG_NUM=new RewriteRuleTokenStream(adaptor,"token NEG_NUM");

        try {
            // src/parser/Music.g:307:10: ( (x= POS_NUM |x= NEG_NUM ) -> ^( NUM[$x] ) )
            // src/parser/Music.g:307:14: (x= POS_NUM |x= NEG_NUM )
            {
            // src/parser/Music.g:307:14: (x= POS_NUM |x= NEG_NUM )
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==POS_NUM) ) {
                alt78=1;
            }
            else if ( (LA78_0==NEG_NUM) ) {
                alt78=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;

            }
            switch (alt78) {
                case 1 :
                    // src/parser/Music.g:307:15: x= POS_NUM
                    {
                    x=(Token)match(input,POS_NUM,FOLLOW_POS_NUM_in_nnum4024);  
                    stream_POS_NUM.add(x);


                    }
                    break;
                case 2 :
                    // src/parser/Music.g:307:27: x= NEG_NUM
                    {
                    x=(Token)match(input,NEG_NUM,FOLLOW_NEG_NUM_in_nnum4030);  
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
            // 307:38: -> ^( NUM[$x] )
            {
                // src/parser/Music.g:307:41: ^( NUM[$x] )
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
    public static final BitSet FOLLOW_103_in_function342 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_function344 = new BitSet(new long[]{0x002F80C002822A00L,0x0000001C29752040L});
    public static final BitSet FOLLOW_listInst_in_function346 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_function348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_rule_in_funcall394 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_funcall396 = new BitSet(new long[]{0x4020800800202420L,0x000050C08280241CL});
    public static final BitSet FOLLOW_params_in_funcall398 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_103_in_funcall401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_fragcall438 = new BitSet(new long[]{0x0020800000000000L});
    public static final BitSet FOLLOW_id_rule_in_fragcall442 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_fragcall444 = new BitSet(new long[]{0x4020800800202420L,0x000050C08280241CL});
    public static final BitSet FOLLOW_params_in_fragcall446 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_103_in_fragcall449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FRAGMENT_in_frag483 = new BitSet(new long[]{0x0020800000000000L});
    public static final BitSet FOLLOW_id_rule_in_frag486 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_frag488 = new BitSet(new long[]{0x0008004002002800L,0x0000008001000040L});
    public static final BitSet FOLLOW_list_arguments_in_frag491 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_103_in_frag493 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_frag496 = new BitSet(new long[]{0x002F80C002222E20L,0x0000F45C2B210050L});
    public static final BitSet FOLLOW_list_music_inst_in_frag499 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_frag501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_argument_in_list_arguments521 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
    public static final BitSet FOLLOW_104_in_list_arguments524 = new BitSet(new long[]{0x0008004002002800L,0x0000000001000040L});
    public static final BitSet FOLLOW_argument_in_list_arguments526 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
    public static final BitSet FOLLOW_type_in_argument567 = new BitSet(new long[]{0x0020800000000000L});
    public static final BitSet FOLLOW_id_rule_in_argument570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_params597 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
    public static final BitSet FOLLOW_notes_variable_in_params601 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
    public static final BitSet FOLLOW_104_in_params605 = new BitSet(new long[]{0x4020800800202420L,0x000050408280241CL});
    public static final BitSet FOLLOW_expr_in_params609 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
    public static final BitSet FOLLOW_notes_variable_in_params613 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
    public static final BitSet FOLLOW_inst_in_listInst641 = new BitSet(new long[]{0x002F80C002822A02L,0x0000001C29752040L});
    public static final BitSet FOLLOW_music_inst_in_list_music_inst675 = new BitSet(new long[]{0x002F80C002222E22L,0x0000F45C2B210050L});
    public static final BitSet FOLLOW_declaration_in_inst719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_volume_in_inst737 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_inst739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_inst757 = new BitSet(new long[]{0x4020800800202420L,0x000050408280241CL});
    public static final BitSet FOLLOW_expr_in_inst761 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_notes_variable_in_inst765 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_inst768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_READ_in_inst787 = new BitSet(new long[]{0x0020800000000000L});
    public static final BitSet FOLLOW_var_access_in_inst790 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_inst792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WRITE_in_inst810 = new BitSet(new long[]{0x4020800800202420L,0x000050408280241CL});
    public static final BitSet FOLLOW_expr_in_inst814 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_notes_variable_in_inst818 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_inst821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_funcall_in_inst839 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_inst841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tone_in_inst859 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_inst861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_beat_in_inst880 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_inst882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_speed_in_inst901 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_inst903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instrument_in_inst922 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_inst924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_transport_in_inst943 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_inst945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignation_in_inst964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_stmt_in_inst982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_inst1000 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_inst1002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_stmt_in_inst1021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_stmt_in_inst1039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_song_in_inst1057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compas_aux_in_inst1075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_music_inst1099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_READ_in_music_inst1117 = new BitSet(new long[]{0x0020800000000000L});
    public static final BitSet FOLLOW_var_access_in_music_inst1120 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_music_inst1122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WRITE_in_music_inst1140 = new BitSet(new long[]{0x4020800800202420L,0x000050408280241CL});
    public static final BitSet FOLLOW_expr_in_music_inst1144 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_notes_variable_in_music_inst1148 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_music_inst1151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_volume_in_music_inst1169 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_music_inst1171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tone_in_music_inst1190 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_music_inst1192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_beat_in_music_inst1211 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_music_inst1213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_speed_in_music_inst1232 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_music_inst1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instrument_in_music_inst1253 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_music_inst1255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_transport_in_music_inst1274 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_music_inst1276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_funcall_in_music_inst1295 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_music_inst1297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignation_in_music_inst1315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_music_stmt_in_music_inst1333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_music_inst1351 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_music_inst1353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fragcall_in_music_inst1372 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_music_inst1374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_music_stmt_in_music_inst1393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_music_stmt_in_music_inst1411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notes_group_in_music_inst1438 = new BitSet(new long[]{0x0000000000202422L,0x00005C4002000010L});
    public static final BitSet FOLLOW_107_in_music_inst1442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_triplet_in_music_inst1462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_declaration1485 = new BitSet(new long[]{0x0020800000000000L});
    public static final BitSet FOLLOW_assig_opt_in_declaration1488 = new BitSet(new long[]{0x0000000000000000L,0x0000090000000000L});
    public static final BitSet FOLLOW_104_in_declaration1491 = new BitSet(new long[]{0x0020800000000000L});
    public static final BitSet FOLLOW_assig_opt_in_declaration1494 = new BitSet(new long[]{0x0000000000000000L,0x0000090000000000L});
    public static final BitSet FOLLOW_107_in_declaration1498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_type_void1662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOID_in_type_void1680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_rule_in_assig_opt1705 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ASSIG_in_assig_opt1708 = new BitSet(new long[]{0x4020800800202420L,0x000050408280241CL});
    public static final BitSet FOLLOW_expr_in_assig_opt1712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notes_variable_in_assig_opt1716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assig_in_assignation1742 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_assignation1744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_access_in_assig1774 = new BitSet(new long[]{0x8000000000100040L,0x0000000000008802L});
    public static final BitSet FOLLOW_set_in_assig1776 = new BitSet(new long[]{0x4020802800202420L,0x000050408280241CL});
    public static final BitSet FOLLOW_expr_in_assig1792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notes_variable_in_assig1796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIGURE_NAME_in_assig1800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_post_in_assig1819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pre_in_assig1837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_rule_in_var_funcall1862 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_105_in_var_funcall1864 = new BitSet(new long[]{0x0020800000000000L});
    public static final BitSet FOLLOW_id_rule_in_var_funcall1868 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_var_funcall1870 = new BitSet(new long[]{0x4020800800202420L,0x000050C08280241CL});
    public static final BitSet FOLLOW_params_in_var_funcall1872 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_103_in_var_funcall1875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_rule_in_var_access1916 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_105_in_var_access1919 = new BitSet(new long[]{0x0020800000000000L});
    public static final BitSet FOLLOW_id_rule_in_var_access1923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_rule_in_var_access1952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID__in_id_rule1982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LETTER_X_in_id_rule1990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_access_in_post2029 = new BitSet(new long[]{0x0002000000020000L});
    public static final BitSet FOLLOW_INCR_in_post2034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECR_in_post2040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INCR_in_pre2087 = new BitSet(new long[]{0x0020800000000000L});
    public static final BitSet FOLLOW_DECR_in_pre2093 = new BitSet(new long[]{0x0020800000000000L});
    public static final BitSet FOLLOW_var_access_in_pre2096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BEAT_in_beat2139 = new BitSet(new long[]{0x4020800800000000L,0x000050408080240CL});
    public static final BitSet FOLLOW_num_expr_in_beat2142 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_106_in_beat2144 = new BitSet(new long[]{0x4020800800000000L,0x000050408080240CL});
    public static final BitSet FOLLOW_num_expr_in_beat2147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SPEED_in_speed2176 = new BitSet(new long[]{0x4020800800000000L,0x000050408080240CL});
    public static final BitSet FOLLOW_num_expr_in_speed2179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOLUME_in_volume2207 = new BitSet(new long[]{0x4020800800000000L,0x000050408080240CL});
    public static final BitSet FOLLOW_num_expr_in_volume2210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRANSPORT_in_transport2222 = new BitSet(new long[]{0x4020800800000000L,0x000050408080240CL});
    public static final BitSet FOLLOW_num_expr_in_transport2225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUMENT_in_instrument2249 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_STRING_in_instrument2252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_stmt2276 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_while_stmt2279 = new BitSet(new long[]{0x4020800800000000L,0x000050408080240CL});
    public static final BitSet FOLLOW_expr_in_while_stmt2282 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_103_in_while_stmt2284 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_while_stmt2287 = new BitSet(new long[]{0x002F80C002822A00L,0x0000001C29752040L});
    public static final BitSet FOLLOW_listInst_in_while_stmt2290 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_while_stmt2292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_music_stmt2319 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_while_music_stmt2322 = new BitSet(new long[]{0x4020800800000000L,0x000050408080240CL});
    public static final BitSet FOLLOW_expr_in_while_music_stmt2325 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_103_in_while_music_stmt2327 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_while_music_stmt2330 = new BitSet(new long[]{0x002F80C002222E20L,0x0000F45C2B210050L});
    public static final BitSet FOLLOW_list_music_inst_in_while_music_stmt2333 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_while_music_stmt2335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_for_stmt2370 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_for_stmt2373 = new BitSet(new long[]{0x002A804002022800L,0x0000000001000040L});
    public static final BitSet FOLLOW_declaration_in_for_stmt2377 = new BitSet(new long[]{0x4020800800000000L,0x000050408080240CL});
    public static final BitSet FOLLOW_list_assig_in_for_stmt2381 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_for_stmt2383 = new BitSet(new long[]{0x4020800800000000L,0x000050408080240CL});
    public static final BitSet FOLLOW_expr_in_for_stmt2387 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_for_stmt2389 = new BitSet(new long[]{0x0022800000020000L});
    public static final BitSet FOLLOW_list_assig_in_for_stmt2392 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_103_in_for_stmt2394 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_for_stmt2397 = new BitSet(new long[]{0x002F80C002822A00L,0x0000001C29752040L});
    public static final BitSet FOLLOW_listInst_in_for_stmt2400 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_for_stmt2402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_for_music_stmt2427 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_for_music_stmt2430 = new BitSet(new long[]{0x002A804002022800L,0x0000000001000040L});
    public static final BitSet FOLLOW_declaration_in_for_music_stmt2434 = new BitSet(new long[]{0x4020800800000000L,0x000050408080240CL});
    public static final BitSet FOLLOW_list_assig_in_for_music_stmt2438 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_for_music_stmt2440 = new BitSet(new long[]{0x4020800800000000L,0x000050408080240CL});
    public static final BitSet FOLLOW_expr_in_for_music_stmt2444 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_for_music_stmt2446 = new BitSet(new long[]{0x0022800000020000L});
    public static final BitSet FOLLOW_list_assig_in_for_music_stmt2449 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_103_in_for_music_stmt2451 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_for_music_stmt2454 = new BitSet(new long[]{0x002F80C002222E20L,0x0000F45C2B210050L});
    public static final BitSet FOLLOW_list_music_inst_in_for_music_stmt2457 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_for_music_stmt2459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assig_in_list_assig2488 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
    public static final BitSet FOLLOW_104_in_list_assig2491 = new BitSet(new long[]{0x0022800000020000L});
    public static final BitSet FOLLOW_assig_in_list_assig2493 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
    public static final BitSet FOLLOW_IF_in_if_stmt2531 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_if_stmt2534 = new BitSet(new long[]{0x4020800800000000L,0x000050408080240CL});
    public static final BitSet FOLLOW_expr_in_if_stmt2537 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_103_in_if_stmt2539 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_if_stmt2542 = new BitSet(new long[]{0x002F80C002822A00L,0x0000001C29752040L});
    public static final BitSet FOLLOW_listInst_in_if_stmt2545 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_if_stmt2547 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_elseif_stmt_in_if_stmt2550 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_else_stmt_in_if_stmt2553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_elseif_stmt2577 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_IF_in_elseif_stmt2579 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_elseif_stmt2581 = new BitSet(new long[]{0x4020800800000000L,0x000050408080240CL});
    public static final BitSet FOLLOW_expr_in_elseif_stmt2583 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_103_in_elseif_stmt2585 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_elseif_stmt2587 = new BitSet(new long[]{0x002F80C002822A00L,0x0000001C29752040L});
    public static final BitSet FOLLOW_listInst_in_elseif_stmt2589 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_elseif_stmt2591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_else_stmt2626 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_else_stmt2629 = new BitSet(new long[]{0x002F80C002822A00L,0x0000001C29752040L});
    public static final BitSet FOLLOW_listInst_in_else_stmt2632 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_else_stmt2634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_if_music_stmt2660 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_if_music_stmt2663 = new BitSet(new long[]{0x4020800800000000L,0x000050408080240CL});
    public static final BitSet FOLLOW_expr_in_if_music_stmt2666 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_103_in_if_music_stmt2668 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_if_music_stmt2671 = new BitSet(new long[]{0x002F80C002222E20L,0x0000F45C2B210050L});
    public static final BitSet FOLLOW_list_music_inst_in_if_music_stmt2674 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_if_music_stmt2676 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_elseif_music_stmt_in_if_music_stmt2679 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_else_music_stmt_in_if_music_stmt2682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_elseif_music_stmt2712 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_IF_in_elseif_music_stmt2714 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_elseif_music_stmt2716 = new BitSet(new long[]{0x4020800800000000L,0x000050408080240CL});
    public static final BitSet FOLLOW_expr_in_elseif_music_stmt2718 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_103_in_elseif_music_stmt2720 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_elseif_music_stmt2722 = new BitSet(new long[]{0x002F80C002222E20L,0x0000F45C2B210050L});
    public static final BitSet FOLLOW_list_music_inst_in_elseif_music_stmt2724 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_elseif_music_stmt2726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_else_music_stmt2767 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_else_music_stmt2770 = new BitSet(new long[]{0x002F80C002222E20L,0x0000F45C2B210050L});
    public static final BitSet FOLLOW_list_music_inst_in_else_music_stmt2773 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_else_music_stmt2775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SONG_in_song2810 = new BitSet(new long[]{0x0020800000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_id_rule_in_song2813 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_song2816 = new BitSet(new long[]{0x0000000001000200L,0x0004000038200000L});
    public static final BitSet FOLLOW_beat_in_song2820 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_song2822 = new BitSet(new long[]{0x0000000001000000L,0x0004000038200000L});
    public static final BitSet FOLLOW_speed_in_song2828 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_song2830 = new BitSet(new long[]{0x0000000001000000L,0x0004000038000000L});
    public static final BitSet FOLLOW_tone_in_song2836 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_song2838 = new BitSet(new long[]{0x0000000001000000L,0x0004000030000000L});
    public static final BitSet FOLLOW_transport_in_song2844 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_song2846 = new BitSet(new long[]{0x0000000001000000L,0x0004000010000000L});
    public static final BitSet FOLLOW_track_in_song2853 = new BitSet(new long[]{0x0000000001000000L,0x0004000010000000L});
    public static final BitSet FOLLOW_drums_track_in_song2857 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_song2860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRACK_in_track2890 = new BitSet(new long[]{0x0020800000800000L,0x0000000000C02000L});
    public static final BitSet FOLLOW_id_rule_in_track2893 = new BitSet(new long[]{0x0000000000800000L,0x0000000000C02000L});
    public static final BitSet FOLLOW_STRING_in_track2897 = new BitSet(new long[]{0x0000000000800000L,0x0000000000402000L});
    public static final BitSet FOLLOW_compas_aux_in_track2900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DRUMS_in_drums_track2923 = new BitSet(new long[]{0x0000000000800000L,0x0000000000402000L});
    public static final BitSet FOLLOW_compas_aux_in_drums_track2926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compas_list_in_compas_aux2950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_BAR_in_compas_list2980 = new BitSet(new long[]{0x002F80C002A22E20L,0x0000F45C2B612050L});
    public static final BitSet FOLLOW_repetition_in_compas_list2985 = new BitSet(new long[]{0x002F80C002A22E20L,0x0000F45C2B612050L});
    public static final BitSet FOLLOW_compas_or_repetition_in_compas_list2988 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_DOUBLE_BAR_in_compas_list2991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compas_in_compasses3018 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_BAR_in_compasses3021 = new BitSet(new long[]{0x002F80C002222E20L,0x0000F45C2B210050L});
    public static final BitSet FOLLOW_compas_in_compasses3024 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_POS_NUM_in_repetition3051 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_LETTER_X_in_repetition3053 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_START_REPETITION_in_repetition3057 = new BitSet(new long[]{0x002F80C002222E20L,0x0000F45C2B612050L});
    public static final BitSet FOLLOW_repetition_aux_in_repetition3059 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_END_REPETITION_in_repetition3061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compas_or_repetition_in_repetition_aux3096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compasses_in_compas_or_repetition3113 = new BitSet(new long[]{0x002F80C002222E22L,0x0000F45C2B612050L});
    public static final BitSet FOLLOW_repetition_in_compas_or_repetition3117 = new BitSet(new long[]{0x002F80C002222E22L,0x0000F45C2B612050L});
    public static final BitSet FOLLOW_music_inst_in_compas3143 = new BitSet(new long[]{0x002F80C002222E22L,0x0000F45C2B210050L});
    public static final BitSet FOLLOW_TONE_in_tone3187 = new BitSet(new long[]{0x4020800800000000L,0x000050408080240CL});
    public static final BitSet FOLLOW_expr_in_tone3190 = new BitSet(new long[]{0x0000000000000400L,0x0000000002000000L});
    public static final BitSet FOLLOW_set_in_tone3192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notes_type_in_notes_group3222 = new BitSet(new long[]{0x0000000000000002L,0x0000020004000000L});
    public static final BitSet FOLLOW_105_in_notes_group3225 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_FIGURE_NAME_in_notes_group3228 = new BitSet(new long[]{0x0000000000400002L,0x0000000004002000L});
    public static final BitSet FOLLOW_POS_NUM_in_notes_group3230 = new BitSet(new long[]{0x0000000000400002L,0x0000000004000000L});
    public static final BitSet FOLLOW_DOT_in_notes_group3234 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_TIE_in_notes_group3239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_notes_group3271 = new BitSet(new long[]{0x0020800000000000L});
    public static final BitSet FOLLOW_id_rule_in_notes_group3274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notes_type_in_notes_variable3298 = new BitSet(new long[]{0x0000000000000002L,0x0000020004000000L});
    public static final BitSet FOLLOW_105_in_notes_variable3301 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_FIGURE_NAME_in_notes_variable3304 = new BitSet(new long[]{0x0000000000400002L,0x0000000004002000L});
    public static final BitSet FOLLOW_POS_NUM_in_notes_variable3306 = new BitSet(new long[]{0x0000000000400002L,0x0000000004000000L});
    public static final BitSet FOLLOW_DOT_in_notes_variable3310 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_TIE_in_notes_variable3315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_chord_in_notes_type3359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notes_in_notes_type3363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHORD_in_chord3392 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_chord3395 = new BitSet(new long[]{0x0000000000200420L,0x0000500002000010L});
    public static final BitSet FOLLOW_note_in_chord3398 = new BitSet(new long[]{0x3000000000040000L,0x0000008000080400L});
    public static final BitSet FOLLOW_103_in_chord3418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_notes3450 = new BitSet(new long[]{0x0000000000200420L,0x0000500002000010L});
    public static final BitSet FOLLOW_note_in_notes3453 = new BitSet(new long[]{0x0000000000200420L,0x0000508002000010L});
    public static final BitSet FOLLOW_103_in_notes3457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_note_in_notes3462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_triplet3499 = new BitSet(new long[]{0x0000000000202420L,0x0000504002000010L});
    public static final BitSet FOLLOW_notes_type_in_triplet3501 = new BitSet(new long[]{0x0000000000202420L,0x0000504002000010L});
    public static final BitSet FOLLOW_notes_type_in_triplet3503 = new BitSet(new long[]{0x0000000000202420L,0x0000504002000010L});
    public static final BitSet FOLLOW_notes_type_in_triplet3505 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_triplet3507 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_105_in_triplet3510 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_FIGURE_NAME_in_triplet3512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DN_in_drum_note_aux3548 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_drum_note_aux3550 = new BitSet(new long[]{0x4020800800000000L,0x000050408080240CL});
    public static final BitSet FOLLOW_num_expr_in_drum_note_aux3552 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_103_in_drum_note_aux3554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOTE_in_note_aux3589 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_NEG_NUM_in_note_aux3593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_note_aux_in_note3625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_note3643 = new BitSet(new long[]{0x0020800000000000L});
    public static final BitSet FOLLOW_id_rule_in_note3646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_drum_note_aux_in_note3662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_note3680 = new BitSet(new long[]{0x0020800000000000L});
    public static final BitSet FOLLOW_id_rule_in_note3683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolterm_in_expr3710 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_OR_in_expr3713 = new BitSet(new long[]{0x4020800800000000L,0x000050408080240CL});
    public static final BitSet FOLLOW_boolterm_in_expr3716 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_boolfact_in_boolterm3734 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_boolterm3737 = new BitSet(new long[]{0x4020800800000000L,0x000050408080240CL});
    public static final BitSet FOLLOW_boolfact_in_boolterm3740 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_num_expr_in_boolfact3762 = new BitSet(new long[]{0x0810300200000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_EQUAL_in_boolfact3766 = new BitSet(new long[]{0x4020800800000000L,0x000050408080240CL});
    public static final BitSet FOLLOW_NOT_EQUAL_in_boolfact3771 = new BitSet(new long[]{0x4020800800000000L,0x000050408080240CL});
    public static final BitSet FOLLOW_LT_in_boolfact3776 = new BitSet(new long[]{0x4020800800000000L,0x000050408080240CL});
    public static final BitSet FOLLOW_LE_in_boolfact3781 = new BitSet(new long[]{0x4020800800000000L,0x000050408080240CL});
    public static final BitSet FOLLOW_GT_in_boolfact3786 = new BitSet(new long[]{0x4020800800000000L,0x000050408080240CL});
    public static final BitSet FOLLOW_GE_in_boolfact3791 = new BitSet(new long[]{0x4020800800000000L,0x000050408080240CL});
    public static final BitSet FOLLOW_num_expr_in_boolfact3795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_num_expr3817 = new BitSet(new long[]{0x4000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_PLUS_in_num_expr3822 = new BitSet(new long[]{0x4020800800000000L,0x000050408080240CL});
    public static final BitSet FOLLOW_MINUS_in_num_expr3827 = new BitSet(new long[]{0x4020800800000000L,0x000050408080240CL});
    public static final BitSet FOLLOW_term_in_num_expr3831 = new BitSet(new long[]{0x4000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_factor_in_term3853 = new BitSet(new long[]{0x0000000000480002L,0x0000000000000001L});
    public static final BitSet FOLLOW_DOT_in_term3858 = new BitSet(new long[]{0x4020800800000000L,0x000050408080240CL});
    public static final BitSet FOLLOW_DIV_in_term3863 = new BitSet(new long[]{0x4020800800000000L,0x000050408080240CL});
    public static final BitSet FOLLOW_MOD_in_term3868 = new BitSet(new long[]{0x4020800800000000L,0x000050408080240CL});
    public static final BitSet FOLLOW_factor_in_term3872 = new BitSet(new long[]{0x0000000000480002L,0x0000000000000001L});
    public static final BitSet FOLLOW_NOT_in_factor3889 = new BitSet(new long[]{0x0020800800000000L,0x0000504080802004L});
    public static final BitSet FOLLOW_PLUS_in_factor3894 = new BitSet(new long[]{0x0020800800000000L,0x0000504080802004L});
    public static final BitSet FOLLOW_MINUS_in_factor3899 = new BitSet(new long[]{0x0020800800000000L,0x0000504080802004L});
    public static final BitSet FOLLOW_atom_in_factor3904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_access_in_atom3920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nnum_in_atom3928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_atom3936 = new BitSet(new long[]{0x0000000000000420L,0x0000000002000010L});
    public static final BitSet FOLLOW_note_aux_in_atom3939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_atom3947 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_drum_note_aux_in_atom3950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_atom3958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_atom3966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_funcall_in_atom3974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_atom3982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_atom3990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_atom3998 = new BitSet(new long[]{0x4020800800000000L,0x000050408080240CL});
    public static final BitSet FOLLOW_expr_in_atom4001 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_103_in_atom4003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POS_NUM_in_nnum4024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEG_NUM_in_nnum4030 = new BitSet(new long[]{0x0000000000000002L});

}