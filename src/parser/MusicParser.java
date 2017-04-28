// $ANTLR 3.4 src/parser/Music.g 2017-04-28 18:04:38

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ARMOR", "ASSIG", "ATTR_ACCESS", "BAR", "BEAT", "BEMOL", "BOOL", "BOOLEAN", "CHORD", "COMMENT", "COMPAS", "COMPAS_LIST", "DECR", "DIMINUTION", "DIV", "DIVIDE_ASSIG", "DOT", "DOUBLE_BAR", "DRUMS", "DRUMSNOTES", "DRUMSNOTE_LIST", "DRUMS_NOTE_TYPE", "DRUMS_TRACK", "ELSE", "ELSEIF", "END_REPETITION", "EQUAL", "ESC_SEQ", "FALSE", "FIGURE", "FOR", "FRAGMENT", "FUNCALL", "FUNCTION", "GE", "GT", "ID", "ID_", "IF", "INCR", "INSTRUMENT", "INT", "LE", "LETTER_X", "LIST_ARGUMENTS", "LIST_ASSIG", "LIST_FUNCTIONS", "LIST_INSTRUCTIONS", "LIST_MUSIC_INST", "LT", "MAJ7", "MINOR", "MINUS", "MINUS_ASSIG", "MOD", "MOD_ASSIG", "NOT", "NOTE", "NOTES", "NOTE_LIST", "NOTE_TYPE", "NOT_EQUAL", "NUM", "OR", "PLUS", "PLUS_ASSIG", "POST", "PRE", "PROD_ASSIG", "REPETITION", "RETURN", "SEVENTH", "SONG", "SPEED", "START_REPETITION", "STRING", "STRING_TYPE", "SUSTAIN", "TIE", "TONE", "TRACK", "TRANSPORT", "TRUE", "VAR_FUNCALL", "VOID", "WHILE", "WS", "'('", "')'", "','", "'.'", "':'", "';'", "'{'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__99=99;
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
    public static final int DRUMSNOTES=24;
    public static final int DRUMSNOTE_LIST=25;
    public static final int DRUMS_NOTE_TYPE=26;
    public static final int DRUMS_TRACK=27;
    public static final int ELSE=28;
    public static final int ELSEIF=29;
    public static final int END_REPETITION=30;
    public static final int EQUAL=31;
    public static final int ESC_SEQ=32;
    public static final int FALSE=33;
    public static final int FIGURE=34;
    public static final int FOR=35;
    public static final int FRAGMENT=36;
    public static final int FUNCALL=37;
    public static final int FUNCTION=38;
    public static final int GE=39;
    public static final int GT=40;
    public static final int ID=41;
    public static final int ID_=42;
    public static final int IF=43;
    public static final int INCR=44;
    public static final int INSTRUMENT=45;
    public static final int INT=46;
    public static final int LE=47;
    public static final int LETTER_X=48;
    public static final int LIST_ARGUMENTS=49;
    public static final int LIST_ASSIG=50;
    public static final int LIST_FUNCTIONS=51;
    public static final int LIST_INSTRUCTIONS=52;
    public static final int LIST_MUSIC_INST=53;
    public static final int LT=54;
    public static final int MAJ7=55;
    public static final int MINOR=56;
    public static final int MINUS=57;
    public static final int MINUS_ASSIG=58;
    public static final int MOD=59;
    public static final int MOD_ASSIG=60;
    public static final int NOT=61;
    public static final int NOTE=62;
    public static final int NOTES=63;
    public static final int NOTE_LIST=64;
    public static final int NOTE_TYPE=65;
    public static final int NOT_EQUAL=66;
    public static final int NUM=67;
    public static final int OR=68;
    public static final int PLUS=69;
    public static final int PLUS_ASSIG=70;
    public static final int POST=71;
    public static final int PRE=72;
    public static final int PROD_ASSIG=73;
    public static final int REPETITION=74;
    public static final int RETURN=75;
    public static final int SEVENTH=76;
    public static final int SONG=77;
    public static final int SPEED=78;
    public static final int START_REPETITION=79;
    public static final int STRING=80;
    public static final int STRING_TYPE=81;
    public static final int SUSTAIN=82;
    public static final int TIE=83;
    public static final int TONE=84;
    public static final int TRACK=85;
    public static final int TRANSPORT=86;
    public static final int TRUE=87;
    public static final int VAR_FUNCALL=88;
    public static final int VOID=89;
    public static final int WHILE=90;
    public static final int WS=91;

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
    // src/parser/Music.g:43:1: prog : ( global_stmt )+ EOF -> ^( LIST_FUNCTIONS ( global_stmt )+ ) ;
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
            // src/parser/Music.g:43:10: ( ( global_stmt )+ EOF -> ^( LIST_FUNCTIONS ( global_stmt )+ ) )
            // src/parser/Music.g:43:14: ( global_stmt )+ EOF
            {
            // src/parser/Music.g:43:14: ( global_stmt )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==BOOL||LA1_0==CHORD||LA1_0==DRUMS_NOTE_TYPE||LA1_0==FRAGMENT||LA1_0==INT||LA1_0==NOTE_TYPE||LA1_0==SONG||LA1_0==STRING_TYPE||LA1_0==VOID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // src/parser/Music.g:43:15: global_stmt
            	    {
            	    pushFollow(FOLLOW_global_stmt_in_prog207);
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


            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_prog211);  
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
            // 43:33: -> ^( LIST_FUNCTIONS ( global_stmt )+ )
            {
                // src/parser/Music.g:43:36: ^( LIST_FUNCTIONS ( global_stmt )+ )
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
    // src/parser/Music.g:46:1: global_stmt : ( function | frag | song );
    public final MusicParser.global_stmt_return global_stmt() throws RecognitionException {
        MusicParser.global_stmt_return retval = new MusicParser.global_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        MusicParser.function_return function3 =null;

        MusicParser.frag_return frag4 =null;

        MusicParser.song_return song5 =null;



        try {
            // src/parser/Music.g:46:13: ( function | frag | song )
            int alt2=3;
            switch ( input.LA(1) ) {
            case BOOL:
            case CHORD:
            case DRUMS_NOTE_TYPE:
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
                    // src/parser/Music.g:46:17: function
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_function_in_global_stmt243);
                    function3=function();

                    state._fsp--;

                    adaptor.addChild(root_0, function3.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:47:17: frag
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_frag_in_global_stmt261);
                    frag4=frag();

                    state._fsp--;

                    adaptor.addChild(root_0, frag4.getTree());

                    }
                    break;
                case 3 :
                    // src/parser/Music.g:48:17: song
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_song_in_global_stmt279);
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


    public static class var_funcall_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "var_funcall"
    // src/parser/Music.g:51:1: var_funcall : id= id_rule '.' id2= id_rule '(' ( params )? ')' ';' -> ^( VAR_FUNCALL[$id.text] $id2 ( params )? ) ;
    public final MusicParser.var_funcall_return var_funcall() throws RecognitionException {
        MusicParser.var_funcall_return retval = new MusicParser.var_funcall_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal6=null;
        Token char_literal7=null;
        Token char_literal9=null;
        Token char_literal10=null;
        MusicParser.id_rule_return id =null;

        MusicParser.id_rule_return id2 =null;

        MusicParser.params_return params8 =null;


        AmlTree char_literal6_tree=null;
        AmlTree char_literal7_tree=null;
        AmlTree char_literal9_tree=null;
        AmlTree char_literal10_tree=null;
        RewriteRuleTokenStream stream_97=new RewriteRuleTokenStream(adaptor,"token 97");
        RewriteRuleTokenStream stream_95=new RewriteRuleTokenStream(adaptor,"token 95");
        RewriteRuleTokenStream stream_93=new RewriteRuleTokenStream(adaptor,"token 93");
        RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
        RewriteRuleSubtreeStream stream_id_rule=new RewriteRuleSubtreeStream(adaptor,"rule id_rule");
        RewriteRuleSubtreeStream stream_params=new RewriteRuleSubtreeStream(adaptor,"rule params");
        try {
            // src/parser/Music.g:51:13: (id= id_rule '.' id2= id_rule '(' ( params )? ')' ';' -> ^( VAR_FUNCALL[$id.text] $id2 ( params )? ) )
            // src/parser/Music.g:51:17: id= id_rule '.' id2= id_rule '(' ( params )? ')' ';'
            {
            pushFollow(FOLLOW_id_rule_in_var_funcall304);
            id=id_rule();

            state._fsp--;

            stream_id_rule.add(id.getTree());

            char_literal6=(Token)match(input,95,FOLLOW_95_in_var_funcall306);  
            stream_95.add(char_literal6);


            pushFollow(FOLLOW_id_rule_in_var_funcall310);
            id2=id_rule();

            state._fsp--;

            stream_id_rule.add(id2.getTree());

            char_literal7=(Token)match(input,92,FOLLOW_92_in_var_funcall312);  
            stream_92.add(char_literal7);


            // src/parser/Music.g:51:48: ( params )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==ARMOR||LA3_0==BEMOL||LA3_0==CHORD||LA3_0==DRUMS_NOTE_TYPE||LA3_0==FALSE||LA3_0==ID_||LA3_0==LETTER_X||LA3_0==MINUS||(LA3_0 >= NOT && LA3_0 <= NOTE)||LA3_0==NUM||LA3_0==PLUS||LA3_0==STRING||LA3_0==SUSTAIN||LA3_0==TRUE||LA3_0==92) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // src/parser/Music.g:51:48: params
                    {
                    pushFollow(FOLLOW_params_in_var_funcall314);
                    params8=params();

                    state._fsp--;

                    stream_params.add(params8.getTree());

                    }
                    break;

            }


            char_literal9=(Token)match(input,93,FOLLOW_93_in_var_funcall317);  
            stream_93.add(char_literal9);


            char_literal10=(Token)match(input,97,FOLLOW_97_in_var_funcall319);  
            stream_97.add(char_literal10);


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
            // 51:65: -> ^( VAR_FUNCALL[$id.text] $id2 ( params )? )
            {
                // src/parser/Music.g:51:69: ^( VAR_FUNCALL[$id.text] $id2 ( params )? )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(VAR_FUNCALL, (id!=null?input.toString(id.start,id.stop):null))
                , root_1);

                adaptor.addChild(root_1, stream_id2.nextTree());

                // src/parser/Music.g:51:98: ( params )?
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
    // src/parser/Music.g:54:1: var_access : (id1= id_rule ( '.' id2= id_rule ) -> ^( ATTR_ACCESS[$id1.text] $id2) | id_rule );
    public final MusicParser.var_access_return var_access() throws RecognitionException {
        MusicParser.var_access_return retval = new MusicParser.var_access_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal11=null;
        MusicParser.id_rule_return id1 =null;

        MusicParser.id_rule_return id2 =null;

        MusicParser.id_rule_return id_rule12 =null;


        AmlTree char_literal11_tree=null;
        RewriteRuleTokenStream stream_95=new RewriteRuleTokenStream(adaptor,"token 95");
        RewriteRuleSubtreeStream stream_id_rule=new RewriteRuleSubtreeStream(adaptor,"rule id_rule");
        try {
            // src/parser/Music.g:54:13: (id1= id_rule ( '.' id2= id_rule ) -> ^( ATTR_ACCESS[$id1.text] $id2) | id_rule )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==ID_) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==95) ) {
                    alt4=1;
                }
                else if ( (LA4_1==AND||LA4_1==ASSIG||LA4_1==DECR||(LA4_1 >= DIV && LA4_1 <= DOT)||LA4_1==EQUAL||(LA4_1 >= GE && LA4_1 <= GT)||LA4_1==INCR||LA4_1==LE||LA4_1==LT||(LA4_1 >= MINUS && LA4_1 <= MOD_ASSIG)||LA4_1==NOT_EQUAL||(LA4_1 >= OR && LA4_1 <= PLUS_ASSIG)||LA4_1==PROD_ASSIG||(LA4_1 >= 93 && LA4_1 <= 94)||LA4_1==97) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA4_0==LETTER_X) ) {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==95) ) {
                    alt4=1;
                }
                else if ( (LA4_2==AND||LA4_2==ASSIG||LA4_2==DECR||(LA4_2 >= DIV && LA4_2 <= DOT)||LA4_2==EQUAL||(LA4_2 >= GE && LA4_2 <= GT)||LA4_2==INCR||LA4_2==LE||LA4_2==LT||(LA4_2 >= MINUS && LA4_2 <= MOD_ASSIG)||LA4_2==NOT_EQUAL||(LA4_2 >= OR && LA4_2 <= PLUS_ASSIG)||LA4_2==PROD_ASSIG||(LA4_2 >= 93 && LA4_2 <= 94)||LA4_2==97) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // src/parser/Music.g:54:17: id1= id_rule ( '.' id2= id_rule )
                    {
                    pushFollow(FOLLOW_id_rule_in_var_access360);
                    id1=id_rule();

                    state._fsp--;

                    stream_id_rule.add(id1.getTree());

                    // src/parser/Music.g:54:29: ( '.' id2= id_rule )
                    // src/parser/Music.g:54:30: '.' id2= id_rule
                    {
                    char_literal11=(Token)match(input,95,FOLLOW_95_in_var_access363);  
                    stream_95.add(char_literal11);


                    pushFollow(FOLLOW_id_rule_in_var_access367);
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
                    // 54:47: -> ^( ATTR_ACCESS[$id1.text] $id2)
                    {
                        // src/parser/Music.g:54:50: ^( ATTR_ACCESS[$id1.text] $id2)
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
                    // src/parser/Music.g:55:17: id_rule
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_id_rule_in_var_access396);
                    id_rule12=id_rule();

                    state._fsp--;

                    adaptor.addChild(root_0, id_rule12.getTree());

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
    // src/parser/Music.g:58:1: id_rule : (id= ID_ |id= LETTER_X ) -> ^( ID[$id] ) ;
    public final MusicParser.id_rule_return id_rule() throws RecognitionException {
        MusicParser.id_rule_return retval = new MusicParser.id_rule_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token id=null;

        AmlTree id_tree=null;
        RewriteRuleTokenStream stream_LETTER_X=new RewriteRuleTokenStream(adaptor,"token LETTER_X");
        RewriteRuleTokenStream stream_ID_=new RewriteRuleTokenStream(adaptor,"token ID_");

        try {
            // src/parser/Music.g:58:13: ( (id= ID_ |id= LETTER_X ) -> ^( ID[$id] ) )
            // src/parser/Music.g:58:17: (id= ID_ |id= LETTER_X )
            {
            // src/parser/Music.g:58:17: (id= ID_ |id= LETTER_X )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==ID_) ) {
                alt5=1;
            }
            else if ( (LA5_0==LETTER_X) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // src/parser/Music.g:58:18: id= ID_
                    {
                    id=(Token)match(input,ID_,FOLLOW_ID__in_id_rule426);  
                    stream_ID_.add(id);


                    }
                    break;
                case 2 :
                    // src/parser/Music.g:58:29: id= LETTER_X
                    {
                    id=(Token)match(input,LETTER_X,FOLLOW_LETTER_X_in_id_rule434);  
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
            // 58:42: -> ^( ID[$id] )
            {
                // src/parser/Music.g:58:45: ^( ID[$id] )
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


    public static class function_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "function"
    // src/parser/Music.g:61:1: function : type_void id= id_rule '(' list_arguments ')' '{' listInst '}' -> ^( FUNCTION[$id.text] type_void list_arguments listInst ) ;
    public final MusicParser.function_return function() throws RecognitionException {
        MusicParser.function_return retval = new MusicParser.function_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal14=null;
        Token char_literal16=null;
        Token char_literal17=null;
        Token char_literal19=null;
        MusicParser.id_rule_return id =null;

        MusicParser.type_void_return type_void13 =null;

        MusicParser.list_arguments_return list_arguments15 =null;

        MusicParser.listInst_return listInst18 =null;


        AmlTree char_literal14_tree=null;
        AmlTree char_literal16_tree=null;
        AmlTree char_literal17_tree=null;
        AmlTree char_literal19_tree=null;
        RewriteRuleTokenStream stream_98=new RewriteRuleTokenStream(adaptor,"token 98");
        RewriteRuleTokenStream stream_93=new RewriteRuleTokenStream(adaptor,"token 93");
        RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
        RewriteRuleTokenStream stream_99=new RewriteRuleTokenStream(adaptor,"token 99");
        RewriteRuleSubtreeStream stream_listInst=new RewriteRuleSubtreeStream(adaptor,"rule listInst");
        RewriteRuleSubtreeStream stream_list_arguments=new RewriteRuleSubtreeStream(adaptor,"rule list_arguments");
        RewriteRuleSubtreeStream stream_type_void=new RewriteRuleSubtreeStream(adaptor,"rule type_void");
        RewriteRuleSubtreeStream stream_id_rule=new RewriteRuleSubtreeStream(adaptor,"rule id_rule");
        try {
            // src/parser/Music.g:61:13: ( type_void id= id_rule '(' list_arguments ')' '{' listInst '}' -> ^( FUNCTION[$id.text] type_void list_arguments listInst ) )
            // src/parser/Music.g:61:16: type_void id= id_rule '(' list_arguments ')' '{' listInst '}'
            {
            pushFollow(FOLLOW_type_void_in_function467);
            type_void13=type_void();

            state._fsp--;

            stream_type_void.add(type_void13.getTree());

            pushFollow(FOLLOW_id_rule_in_function471);
            id=id_rule();

            state._fsp--;

            stream_id_rule.add(id.getTree());

            char_literal14=(Token)match(input,92,FOLLOW_92_in_function473);  
            stream_92.add(char_literal14);


            pushFollow(FOLLOW_list_arguments_in_function475);
            list_arguments15=list_arguments();

            state._fsp--;

            stream_list_arguments.add(list_arguments15.getTree());

            char_literal16=(Token)match(input,93,FOLLOW_93_in_function477);  
            stream_93.add(char_literal16);


            char_literal17=(Token)match(input,98,FOLLOW_98_in_function479);  
            stream_98.add(char_literal17);


            pushFollow(FOLLOW_listInst_in_function481);
            listInst18=listInst();

            state._fsp--;

            stream_listInst.add(listInst18.getTree());

            char_literal19=(Token)match(input,99,FOLLOW_99_in_function483);  
            stream_99.add(char_literal19);


            // AST REWRITE
            // elements: list_arguments, type_void, listInst
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AmlTree)adaptor.nil();
            // 61:80: -> ^( FUNCTION[$id.text] type_void list_arguments listInst )
            {
                // src/parser/Music.g:61:85: ^( FUNCTION[$id.text] type_void list_arguments listInst )
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
    // src/parser/Music.g:64:1: funcall : id= id_rule '(' ( params )? ')' -> ^( FUNCALL[$id.text] ( params )? ) ;
    public final MusicParser.funcall_return funcall() throws RecognitionException {
        MusicParser.funcall_return retval = new MusicParser.funcall_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal20=null;
        Token char_literal22=null;
        MusicParser.id_rule_return id =null;

        MusicParser.params_return params21 =null;


        AmlTree char_literal20_tree=null;
        AmlTree char_literal22_tree=null;
        RewriteRuleTokenStream stream_93=new RewriteRuleTokenStream(adaptor,"token 93");
        RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
        RewriteRuleSubtreeStream stream_id_rule=new RewriteRuleSubtreeStream(adaptor,"rule id_rule");
        RewriteRuleSubtreeStream stream_params=new RewriteRuleSubtreeStream(adaptor,"rule params");
        try {
            // src/parser/Music.g:64:13: (id= id_rule '(' ( params )? ')' -> ^( FUNCALL[$id.text] ( params )? ) )
            // src/parser/Music.g:64:17: id= id_rule '(' ( params )? ')'
            {
            pushFollow(FOLLOW_id_rule_in_funcall530);
            id=id_rule();

            state._fsp--;

            stream_id_rule.add(id.getTree());

            char_literal20=(Token)match(input,92,FOLLOW_92_in_funcall532);  
            stream_92.add(char_literal20);


            // src/parser/Music.g:64:32: ( params )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==ARMOR||LA6_0==BEMOL||LA6_0==CHORD||LA6_0==DRUMS_NOTE_TYPE||LA6_0==FALSE||LA6_0==ID_||LA6_0==LETTER_X||LA6_0==MINUS||(LA6_0 >= NOT && LA6_0 <= NOTE)||LA6_0==NUM||LA6_0==PLUS||LA6_0==STRING||LA6_0==SUSTAIN||LA6_0==TRUE||LA6_0==92) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // src/parser/Music.g:64:32: params
                    {
                    pushFollow(FOLLOW_params_in_funcall534);
                    params21=params();

                    state._fsp--;

                    stream_params.add(params21.getTree());

                    }
                    break;

            }


            char_literal22=(Token)match(input,93,FOLLOW_93_in_funcall537);  
            stream_93.add(char_literal22);


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
            // 64:44: -> ^( FUNCALL[$id.text] ( params )? )
            {
                // src/parser/Music.g:64:47: ^( FUNCALL[$id.text] ( params )? )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(FUNCALL, (id!=null?input.toString(id.start,id.stop):null))
                , root_1);

                // src/parser/Music.g:64:67: ( params )?
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


    public static class frag_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "frag"
    // src/parser/Music.g:67:1: frag : FRAGMENT ^ id_rule '(' ! list_arguments ')' ! '{' ! list_music_inst '}' !;
    public final MusicParser.frag_return frag() throws RecognitionException {
        MusicParser.frag_return retval = new MusicParser.frag_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token FRAGMENT23=null;
        Token char_literal25=null;
        Token char_literal27=null;
        Token char_literal28=null;
        Token char_literal30=null;
        MusicParser.id_rule_return id_rule24 =null;

        MusicParser.list_arguments_return list_arguments26 =null;

        MusicParser.list_music_inst_return list_music_inst29 =null;


        AmlTree FRAGMENT23_tree=null;
        AmlTree char_literal25_tree=null;
        AmlTree char_literal27_tree=null;
        AmlTree char_literal28_tree=null;
        AmlTree char_literal30_tree=null;

        try {
            // src/parser/Music.g:67:9: ( FRAGMENT ^ id_rule '(' ! list_arguments ')' ! '{' ! list_music_inst '}' !)
            // src/parser/Music.g:67:11: FRAGMENT ^ id_rule '(' ! list_arguments ')' ! '{' ! list_music_inst '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            FRAGMENT23=(Token)match(input,FRAGMENT,FOLLOW_FRAGMENT_in_frag571); 
            FRAGMENT23_tree = 
            (AmlTree)adaptor.create(FRAGMENT23)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(FRAGMENT23_tree, root_0);


            pushFollow(FOLLOW_id_rule_in_frag574);
            id_rule24=id_rule();

            state._fsp--;

            adaptor.addChild(root_0, id_rule24.getTree());

            char_literal25=(Token)match(input,92,FOLLOW_92_in_frag576); 

            pushFollow(FOLLOW_list_arguments_in_frag579);
            list_arguments26=list_arguments();

            state._fsp--;

            adaptor.addChild(root_0, list_arguments26.getTree());

            char_literal27=(Token)match(input,93,FOLLOW_93_in_frag581); 

            char_literal28=(Token)match(input,98,FOLLOW_98_in_frag584); 

            pushFollow(FOLLOW_list_music_inst_in_frag587);
            list_music_inst29=list_music_inst();

            state._fsp--;

            adaptor.addChild(root_0, list_music_inst29.getTree());

            char_literal30=(Token)match(input,99,FOLLOW_99_in_frag589); 

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
    // src/parser/Music.g:70:1: list_arguments : ( argument ( ',' argument )* )? -> ^( LIST_ARGUMENTS ( argument )* ) ;
    public final MusicParser.list_arguments_return list_arguments() throws RecognitionException {
        MusicParser.list_arguments_return retval = new MusicParser.list_arguments_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal32=null;
        MusicParser.argument_return argument31 =null;

        MusicParser.argument_return argument33 =null;


        AmlTree char_literal32_tree=null;
        RewriteRuleTokenStream stream_94=new RewriteRuleTokenStream(adaptor,"token 94");
        RewriteRuleSubtreeStream stream_argument=new RewriteRuleSubtreeStream(adaptor,"rule argument");
        try {
            // src/parser/Music.g:70:17: ( ( argument ( ',' argument )* )? -> ^( LIST_ARGUMENTS ( argument )* ) )
            // src/parser/Music.g:70:19: ( argument ( ',' argument )* )?
            {
            // src/parser/Music.g:70:19: ( argument ( ',' argument )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==BOOL||LA8_0==CHORD||LA8_0==DRUMS_NOTE_TYPE||LA8_0==INT||LA8_0==NOTE_TYPE||LA8_0==STRING_TYPE) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // src/parser/Music.g:70:20: argument ( ',' argument )*
                    {
                    pushFollow(FOLLOW_argument_in_list_arguments609);
                    argument31=argument();

                    state._fsp--;

                    stream_argument.add(argument31.getTree());

                    // src/parser/Music.g:70:29: ( ',' argument )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==94) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // src/parser/Music.g:70:30: ',' argument
                    	    {
                    	    char_literal32=(Token)match(input,94,FOLLOW_94_in_list_arguments612);  
                    	    stream_94.add(char_literal32);


                    	    pushFollow(FOLLOW_argument_in_list_arguments614);
                    	    argument33=argument();

                    	    state._fsp--;

                    	    stream_argument.add(argument33.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
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
            // 70:47: -> ^( LIST_ARGUMENTS ( argument )* )
            {
                // src/parser/Music.g:70:50: ^( LIST_ARGUMENTS ( argument )* )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(LIST_ARGUMENTS, "LIST_ARGUMENTS")
                , root_1);

                // src/parser/Music.g:70:67: ( argument )*
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
    // src/parser/Music.g:73:1: argument : type ^ id_rule ;
    public final MusicParser.argument_return argument() throws RecognitionException {
        MusicParser.argument_return retval = new MusicParser.argument_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        MusicParser.type_return type34 =null;

        MusicParser.id_rule_return id_rule35 =null;



        try {
            // src/parser/Music.g:73:11: ( type ^ id_rule )
            // src/parser/Music.g:73:15: type ^ id_rule
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_type_in_argument655);
            type34=type();

            state._fsp--;

            root_0 = (AmlTree)adaptor.becomeRoot(type34.getTree(), root_0);

            pushFollow(FOLLOW_id_rule_in_argument658);
            id_rule35=id_rule();

            state._fsp--;

            adaptor.addChild(root_0, id_rule35.getTree());

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
    // src/parser/Music.g:76:1: params : ( expr | notes_variable | drumsnotes_variable ) ( ',' ! ( expr | notes_variable | drumsnotes_variable ) )* ;
    public final MusicParser.params_return params() throws RecognitionException {
        MusicParser.params_return retval = new MusicParser.params_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal39=null;
        MusicParser.expr_return expr36 =null;

        MusicParser.notes_variable_return notes_variable37 =null;

        MusicParser.drumsnotes_variable_return drumsnotes_variable38 =null;

        MusicParser.expr_return expr40 =null;

        MusicParser.notes_variable_return notes_variable41 =null;

        MusicParser.drumsnotes_variable_return drumsnotes_variable42 =null;


        AmlTree char_literal39_tree=null;

        try {
            // src/parser/Music.g:76:13: ( ( expr | notes_variable | drumsnotes_variable ) ( ',' ! ( expr | notes_variable | drumsnotes_variable ) )* )
            // src/parser/Music.g:76:17: ( expr | notes_variable | drumsnotes_variable ) ( ',' ! ( expr | notes_variable | drumsnotes_variable ) )*
            {
            root_0 = (AmlTree)adaptor.nil();


            // src/parser/Music.g:76:17: ( expr | notes_variable | drumsnotes_variable )
            int alt9=3;
            switch ( input.LA(1) ) {
            case FALSE:
            case ID_:
            case LETTER_X:
            case MINUS:
            case NOT:
            case NUM:
            case PLUS:
            case STRING:
            case TRUE:
                {
                alt9=1;
                }
                break;
            case 92:
                {
                switch ( input.LA(2) ) {
                case FALSE:
                case ID_:
                case LETTER_X:
                case MINUS:
                case NOT:
                case NUM:
                case PLUS:
                case STRING:
                case TRUE:
                case 92:
                    {
                    alt9=1;
                    }
                    break;
                case ARMOR:
                case BEMOL:
                case NOTE:
                case SUSTAIN:
                    {
                    alt9=2;
                    }
                    break;
                case DRUMS_NOTE_TYPE:
                    {
                    alt9=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 2, input);

                    throw nvae;

                }

                }
                break;
            case ARMOR:
            case BEMOL:
            case CHORD:
            case NOTE:
            case SUSTAIN:
                {
                alt9=2;
                }
                break;
            case DRUMS_NOTE_TYPE:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }

            switch (alt9) {
                case 1 :
                    // src/parser/Music.g:76:18: expr
                    {
                    pushFollow(FOLLOW_expr_in_params685);
                    expr36=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr36.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:76:25: notes_variable
                    {
                    pushFollow(FOLLOW_notes_variable_in_params689);
                    notes_variable37=notes_variable();

                    state._fsp--;

                    adaptor.addChild(root_0, notes_variable37.getTree());

                    }
                    break;
                case 3 :
                    // src/parser/Music.g:76:42: drumsnotes_variable
                    {
                    pushFollow(FOLLOW_drumsnotes_variable_in_params693);
                    drumsnotes_variable38=drumsnotes_variable();

                    state._fsp--;

                    adaptor.addChild(root_0, drumsnotes_variable38.getTree());

                    }
                    break;

            }


            // src/parser/Music.g:76:63: ( ',' ! ( expr | notes_variable | drumsnotes_variable ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==94) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // src/parser/Music.g:76:64: ',' ! ( expr | notes_variable | drumsnotes_variable )
            	    {
            	    char_literal39=(Token)match(input,94,FOLLOW_94_in_params697); 

            	    // src/parser/Music.g:76:69: ( expr | notes_variable | drumsnotes_variable )
            	    int alt10=3;
            	    switch ( input.LA(1) ) {
            	    case FALSE:
            	    case ID_:
            	    case LETTER_X:
            	    case MINUS:
            	    case NOT:
            	    case NUM:
            	    case PLUS:
            	    case STRING:
            	    case TRUE:
            	        {
            	        alt10=1;
            	        }
            	        break;
            	    case 92:
            	        {
            	        switch ( input.LA(2) ) {
            	        case FALSE:
            	        case ID_:
            	        case LETTER_X:
            	        case MINUS:
            	        case NOT:
            	        case NUM:
            	        case PLUS:
            	        case STRING:
            	        case TRUE:
            	        case 92:
            	            {
            	            alt10=1;
            	            }
            	            break;
            	        case ARMOR:
            	        case BEMOL:
            	        case NOTE:
            	        case SUSTAIN:
            	            {
            	            alt10=2;
            	            }
            	            break;
            	        case DRUMS_NOTE_TYPE:
            	            {
            	            alt10=3;
            	            }
            	            break;
            	        default:
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 10, 2, input);

            	            throw nvae;

            	        }

            	        }
            	        break;
            	    case ARMOR:
            	    case BEMOL:
            	    case CHORD:
            	    case NOTE:
            	    case SUSTAIN:
            	        {
            	        alt10=2;
            	        }
            	        break;
            	    case DRUMS_NOTE_TYPE:
            	        {
            	        alt10=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 10, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt10) {
            	        case 1 :
            	            // src/parser/Music.g:76:70: expr
            	            {
            	            pushFollow(FOLLOW_expr_in_params701);
            	            expr40=expr();

            	            state._fsp--;

            	            adaptor.addChild(root_0, expr40.getTree());

            	            }
            	            break;
            	        case 2 :
            	            // src/parser/Music.g:76:77: notes_variable
            	            {
            	            pushFollow(FOLLOW_notes_variable_in_params705);
            	            notes_variable41=notes_variable();

            	            state._fsp--;

            	            adaptor.addChild(root_0, notes_variable41.getTree());

            	            }
            	            break;
            	        case 3 :
            	            // src/parser/Music.g:76:94: drumsnotes_variable
            	            {
            	            pushFollow(FOLLOW_drumsnotes_variable_in_params709);
            	            drumsnotes_variable42=drumsnotes_variable();

            	            state._fsp--;

            	            adaptor.addChild(root_0, drumsnotes_variable42.getTree());

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // src/parser/Music.g:79:1: listInst : ( inst )+ -> ^( LIST_INSTRUCTIONS ( inst )+ ) ;
    public final MusicParser.listInst_return listInst() throws RecognitionException {
        MusicParser.listInst_return retval = new MusicParser.listInst_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        MusicParser.inst_return inst43 =null;


        RewriteRuleSubtreeStream stream_inst=new RewriteRuleSubtreeStream(adaptor,"rule inst");
        try {
            // src/parser/Music.g:79:13: ( ( inst )+ -> ^( LIST_INSTRUCTIONS ( inst )+ ) )
            // src/parser/Music.g:79:16: ( inst )+
            {
            // src/parser/Music.g:79:16: ( inst )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==BEAT||LA12_0==BOOL||LA12_0==CHORD||LA12_0==DECR||LA12_0==DOUBLE_BAR||LA12_0==DRUMS_NOTE_TYPE||LA12_0==FOR||(LA12_0 >= ID_ && LA12_0 <= INT)||LA12_0==LETTER_X||LA12_0==NOTE_TYPE||LA12_0==NUM||LA12_0==RETURN||(LA12_0 >= SONG && LA12_0 <= START_REPETITION)||LA12_0==STRING_TYPE||LA12_0==TONE||LA12_0==WHILE) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // src/parser/Music.g:79:16: inst
            	    {
            	    pushFollow(FOLLOW_inst_in_listInst737);
            	    inst43=inst();

            	    state._fsp--;

            	    stream_inst.add(inst43.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
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
            // 79:23: -> ^( LIST_INSTRUCTIONS ( inst )+ )
            {
                // src/parser/Music.g:79:26: ^( LIST_INSTRUCTIONS ( inst )+ )
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
    // src/parser/Music.g:82:1: list_music_inst : ( music_inst )+ -> ^( LIST_MUSIC_INST ( music_inst )+ ) ;
    public final MusicParser.list_music_inst_return list_music_inst() throws RecognitionException {
        MusicParser.list_music_inst_return retval = new MusicParser.list_music_inst_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        MusicParser.music_inst_return music_inst44 =null;


        RewriteRuleSubtreeStream stream_music_inst=new RewriteRuleSubtreeStream(adaptor,"rule music_inst");
        try {
            // src/parser/Music.g:82:17: ( ( music_inst )+ -> ^( LIST_MUSIC_INST ( music_inst )+ ) )
            // src/parser/Music.g:82:21: ( music_inst )+
            {
            // src/parser/Music.g:82:21: ( music_inst )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==ARMOR||(LA13_0 >= BEAT && LA13_0 <= BOOL)||LA13_0==CHORD||LA13_0==DECR||LA13_0==DRUMS_NOTE_TYPE||LA13_0==FOR||(LA13_0 >= ID_ && LA13_0 <= INT)||LA13_0==LETTER_X||LA13_0==NOTE||LA13_0==NOTE_TYPE||(LA13_0 >= SONG && LA13_0 <= SPEED)||(LA13_0 >= STRING_TYPE && LA13_0 <= SUSTAIN)||LA13_0==TONE||LA13_0==WHILE||LA13_0==92) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // src/parser/Music.g:82:21: music_inst
            	    {
            	    pushFollow(FOLLOW_music_inst_in_list_music_inst771);
            	    music_inst44=music_inst();

            	    state._fsp--;

            	    stream_music_inst.add(music_inst44.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
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
            // 82:33: -> ^( LIST_MUSIC_INST ( music_inst )+ )
            {
                // src/parser/Music.g:82:36: ^( LIST_MUSIC_INST ( music_inst )+ )
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
    // src/parser/Music.g:85:1: inst : ( declaration | 'return' ^ ( expr | notes_group | drumsnotes_group ) ';' !| var_funcall | tone ';' !| beat ';' !| speed ';' !| instrument ';' !| assignation | while_stmt | funcall ';' !| for_stmt | if_stmt | song | compas_list );
    public final MusicParser.inst_return inst() throws RecognitionException {
        MusicParser.inst_return retval = new MusicParser.inst_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token string_literal46=null;
        Token char_literal50=null;
        Token char_literal53=null;
        Token char_literal55=null;
        Token char_literal57=null;
        Token char_literal59=null;
        Token char_literal63=null;
        MusicParser.declaration_return declaration45 =null;

        MusicParser.expr_return expr47 =null;

        MusicParser.notes_group_return notes_group48 =null;

        MusicParser.drumsnotes_group_return drumsnotes_group49 =null;

        MusicParser.var_funcall_return var_funcall51 =null;

        MusicParser.tone_return tone52 =null;

        MusicParser.beat_return beat54 =null;

        MusicParser.speed_return speed56 =null;

        MusicParser.instrument_return instrument58 =null;

        MusicParser.assignation_return assignation60 =null;

        MusicParser.while_stmt_return while_stmt61 =null;

        MusicParser.funcall_return funcall62 =null;

        MusicParser.for_stmt_return for_stmt64 =null;

        MusicParser.if_stmt_return if_stmt65 =null;

        MusicParser.song_return song66 =null;

        MusicParser.compas_list_return compas_list67 =null;


        AmlTree string_literal46_tree=null;
        AmlTree char_literal50_tree=null;
        AmlTree char_literal53_tree=null;
        AmlTree char_literal55_tree=null;
        AmlTree char_literal57_tree=null;
        AmlTree char_literal59_tree=null;
        AmlTree char_literal63_tree=null;

        try {
            // src/parser/Music.g:85:13: ( declaration | 'return' ^ ( expr | notes_group | drumsnotes_group ) ';' !| var_funcall | tone ';' !| beat ';' !| speed ';' !| instrument ';' !| assignation | while_stmt | funcall ';' !| for_stmt | if_stmt | song | compas_list )
            int alt15=14;
            switch ( input.LA(1) ) {
            case BOOL:
            case CHORD:
            case DRUMS_NOTE_TYPE:
            case INT:
            case NOTE_TYPE:
            case STRING_TYPE:
                {
                alt15=1;
                }
                break;
            case RETURN:
                {
                alt15=2;
                }
                break;
            case ID_:
                {
                switch ( input.LA(2) ) {
                case 95:
                    {
                    int LA15_15 = input.LA(3);

                    if ( (LA15_15==ID_) ) {
                        int LA15_17 = input.LA(4);

                        if ( (LA15_17==92) ) {
                            alt15=3;
                        }
                        else if ( (LA15_17==ASSIG||LA15_17==DECR||LA15_17==DIVIDE_ASSIG||LA15_17==INCR||LA15_17==MINUS_ASSIG||LA15_17==MOD_ASSIG||LA15_17==PLUS_ASSIG||LA15_17==PROD_ASSIG) ) {
                            alt15=8;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 15, 17, input);

                            throw nvae;

                        }
                    }
                    else if ( (LA15_15==LETTER_X) ) {
                        int LA15_18 = input.LA(4);

                        if ( (LA15_18==92) ) {
                            alt15=3;
                        }
                        else if ( (LA15_18==ASSIG||LA15_18==DECR||LA15_18==DIVIDE_ASSIG||LA15_18==INCR||LA15_18==MINUS_ASSIG||LA15_18==MOD_ASSIG||LA15_18==PLUS_ASSIG||LA15_18==PROD_ASSIG) ) {
                            alt15=8;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 15, 18, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 15, input);

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
                    alt15=8;
                    }
                    break;
                case 92:
                    {
                    alt15=10;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 3, input);

                    throw nvae;

                }

                }
                break;
            case LETTER_X:
                {
                switch ( input.LA(2) ) {
                case 95:
                    {
                    int LA15_15 = input.LA(3);

                    if ( (LA15_15==ID_) ) {
                        int LA15_17 = input.LA(4);

                        if ( (LA15_17==92) ) {
                            alt15=3;
                        }
                        else if ( (LA15_17==ASSIG||LA15_17==DECR||LA15_17==DIVIDE_ASSIG||LA15_17==INCR||LA15_17==MINUS_ASSIG||LA15_17==MOD_ASSIG||LA15_17==PLUS_ASSIG||LA15_17==PROD_ASSIG) ) {
                            alt15=8;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 15, 17, input);

                            throw nvae;

                        }
                    }
                    else if ( (LA15_15==LETTER_X) ) {
                        int LA15_18 = input.LA(4);

                        if ( (LA15_18==92) ) {
                            alt15=3;
                        }
                        else if ( (LA15_18==ASSIG||LA15_18==DECR||LA15_18==DIVIDE_ASSIG||LA15_18==INCR||LA15_18==MINUS_ASSIG||LA15_18==MOD_ASSIG||LA15_18==PLUS_ASSIG||LA15_18==PROD_ASSIG) ) {
                            alt15=8;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 15, 18, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 15, input);

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
                    alt15=8;
                    }
                    break;
                case 92:
                    {
                    alt15=10;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 4, input);

                    throw nvae;

                }

                }
                break;
            case TONE:
                {
                alt15=4;
                }
                break;
            case BEAT:
                {
                alt15=5;
                }
                break;
            case SPEED:
                {
                alt15=6;
                }
                break;
            case INSTRUMENT:
                {
                alt15=7;
                }
                break;
            case DECR:
            case INCR:
                {
                alt15=8;
                }
                break;
            case WHILE:
                {
                alt15=9;
                }
                break;
            case FOR:
                {
                alt15=11;
                }
                break;
            case IF:
                {
                alt15=12;
                }
                break;
            case SONG:
                {
                alt15=13;
                }
                break;
            case DOUBLE_BAR:
            case NUM:
            case START_REPETITION:
                {
                alt15=14;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }

            switch (alt15) {
                case 1 :
                    // src/parser/Music.g:85:17: declaration
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_declaration_in_inst815);
                    declaration45=declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, declaration45.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:86:17: 'return' ^ ( expr | notes_group | drumsnotes_group ) ';' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    string_literal46=(Token)match(input,RETURN,FOLLOW_RETURN_in_inst833); 
                    string_literal46_tree = 
                    (AmlTree)adaptor.create(string_literal46)
                    ;
                    root_0 = (AmlTree)adaptor.becomeRoot(string_literal46_tree, root_0);


                    // src/parser/Music.g:86:27: ( expr | notes_group | drumsnotes_group )
                    int alt14=3;
                    switch ( input.LA(1) ) {
                    case FALSE:
                    case ID_:
                    case LETTER_X:
                    case MINUS:
                    case NOT:
                    case NUM:
                    case PLUS:
                    case STRING:
                    case TRUE:
                        {
                        alt14=1;
                        }
                        break;
                    case 92:
                        {
                        switch ( input.LA(2) ) {
                        case FALSE:
                        case ID_:
                        case LETTER_X:
                        case MINUS:
                        case NOT:
                        case NUM:
                        case PLUS:
                        case STRING:
                        case TRUE:
                        case 92:
                            {
                            alt14=1;
                            }
                            break;
                        case ARMOR:
                        case BEMOL:
                        case NOTE:
                        case SUSTAIN:
                            {
                            alt14=2;
                            }
                            break;
                        case DRUMS_NOTE_TYPE:
                            {
                            alt14=3;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 14, 2, input);

                            throw nvae;

                        }

                        }
                        break;
                    case ARMOR:
                    case BEMOL:
                    case CHORD:
                    case NOTE:
                    case SUSTAIN:
                        {
                        alt14=2;
                        }
                        break;
                    case DRUMS_NOTE_TYPE:
                        {
                        alt14=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 0, input);

                        throw nvae;

                    }

                    switch (alt14) {
                        case 1 :
                            // src/parser/Music.g:86:28: expr
                            {
                            pushFollow(FOLLOW_expr_in_inst837);
                            expr47=expr();

                            state._fsp--;

                            adaptor.addChild(root_0, expr47.getTree());

                            }
                            break;
                        case 2 :
                            // src/parser/Music.g:86:35: notes_group
                            {
                            pushFollow(FOLLOW_notes_group_in_inst841);
                            notes_group48=notes_group();

                            state._fsp--;

                            adaptor.addChild(root_0, notes_group48.getTree());

                            }
                            break;
                        case 3 :
                            // src/parser/Music.g:86:49: drumsnotes_group
                            {
                            pushFollow(FOLLOW_drumsnotes_group_in_inst845);
                            drumsnotes_group49=drumsnotes_group();

                            state._fsp--;

                            adaptor.addChild(root_0, drumsnotes_group49.getTree());

                            }
                            break;

                    }


                    char_literal50=(Token)match(input,97,FOLLOW_97_in_inst848); 

                    }
                    break;
                case 3 :
                    // src/parser/Music.g:87:17: var_funcall
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_var_funcall_in_inst867);
                    var_funcall51=var_funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, var_funcall51.getTree());

                    }
                    break;
                case 4 :
                    // src/parser/Music.g:88:17: tone ';' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_tone_in_inst885);
                    tone52=tone();

                    state._fsp--;

                    adaptor.addChild(root_0, tone52.getTree());

                    char_literal53=(Token)match(input,97,FOLLOW_97_in_inst887); 

                    }
                    break;
                case 5 :
                    // src/parser/Music.g:89:17: beat ';' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_beat_in_inst906);
                    beat54=beat();

                    state._fsp--;

                    adaptor.addChild(root_0, beat54.getTree());

                    char_literal55=(Token)match(input,97,FOLLOW_97_in_inst908); 

                    }
                    break;
                case 6 :
                    // src/parser/Music.g:90:17: speed ';' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_speed_in_inst927);
                    speed56=speed();

                    state._fsp--;

                    adaptor.addChild(root_0, speed56.getTree());

                    char_literal57=(Token)match(input,97,FOLLOW_97_in_inst929); 

                    }
                    break;
                case 7 :
                    // src/parser/Music.g:91:17: instrument ';' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_instrument_in_inst948);
                    instrument58=instrument();

                    state._fsp--;

                    adaptor.addChild(root_0, instrument58.getTree());

                    char_literal59=(Token)match(input,97,FOLLOW_97_in_inst950); 

                    }
                    break;
                case 8 :
                    // src/parser/Music.g:92:17: assignation
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_assignation_in_inst969);
                    assignation60=assignation();

                    state._fsp--;

                    adaptor.addChild(root_0, assignation60.getTree());

                    }
                    break;
                case 9 :
                    // src/parser/Music.g:93:17: while_stmt
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_while_stmt_in_inst987);
                    while_stmt61=while_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, while_stmt61.getTree());

                    }
                    break;
                case 10 :
                    // src/parser/Music.g:94:17: funcall ';' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_inst1005);
                    funcall62=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall62.getTree());

                    char_literal63=(Token)match(input,97,FOLLOW_97_in_inst1007); 

                    }
                    break;
                case 11 :
                    // src/parser/Music.g:95:17: for_stmt
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_for_stmt_in_inst1026);
                    for_stmt64=for_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, for_stmt64.getTree());

                    }
                    break;
                case 12 :
                    // src/parser/Music.g:96:17: if_stmt
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_if_stmt_in_inst1044);
                    if_stmt65=if_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, if_stmt65.getTree());

                    }
                    break;
                case 13 :
                    // src/parser/Music.g:97:17: song
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_song_in_inst1062);
                    song66=song();

                    state._fsp--;

                    adaptor.addChild(root_0, song66.getTree());

                    }
                    break;
                case 14 :
                    // src/parser/Music.g:98:17: compas_list
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_compas_list_in_inst1080);
                    compas_list67=compas_list();

                    state._fsp--;

                    adaptor.addChild(root_0, compas_list67.getTree());

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
    // src/parser/Music.g:101:1: music_inst : ( declaration | tone ';' !| beat ';' !| speed ';' !| instrument ';' !| var_funcall | assignation | while_music_stmt | funcall ';' !| for_music_stmt | if_music_stmt | song | ( options {greedy=true; } : notes_group )+ ( ';' !)? | ( options {greedy=true; } : drumsnotes_group )+ ( ';' !)? );
    public final MusicParser.music_inst_return music_inst() throws RecognitionException {
        MusicParser.music_inst_return retval = new MusicParser.music_inst_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal70=null;
        Token char_literal72=null;
        Token char_literal74=null;
        Token char_literal76=null;
        Token char_literal81=null;
        Token char_literal86=null;
        Token char_literal88=null;
        MusicParser.declaration_return declaration68 =null;

        MusicParser.tone_return tone69 =null;

        MusicParser.beat_return beat71 =null;

        MusicParser.speed_return speed73 =null;

        MusicParser.instrument_return instrument75 =null;

        MusicParser.var_funcall_return var_funcall77 =null;

        MusicParser.assignation_return assignation78 =null;

        MusicParser.while_music_stmt_return while_music_stmt79 =null;

        MusicParser.funcall_return funcall80 =null;

        MusicParser.for_music_stmt_return for_music_stmt82 =null;

        MusicParser.if_music_stmt_return if_music_stmt83 =null;

        MusicParser.song_return song84 =null;

        MusicParser.notes_group_return notes_group85 =null;

        MusicParser.drumsnotes_group_return drumsnotes_group87 =null;


        AmlTree char_literal70_tree=null;
        AmlTree char_literal72_tree=null;
        AmlTree char_literal74_tree=null;
        AmlTree char_literal76_tree=null;
        AmlTree char_literal81_tree=null;
        AmlTree char_literal86_tree=null;
        AmlTree char_literal88_tree=null;

        try {
            // src/parser/Music.g:101:13: ( declaration | tone ';' !| beat ';' !| speed ';' !| instrument ';' !| var_funcall | assignation | while_music_stmt | funcall ';' !| for_music_stmt | if_music_stmt | song | ( options {greedy=true; } : notes_group )+ ( ';' !)? | ( options {greedy=true; } : drumsnotes_group )+ ( ';' !)? )
            int alt20=14;
            switch ( input.LA(1) ) {
            case CHORD:
                {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==92) ) {
                    alt20=13;
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
            case TONE:
                {
                alt20=2;
                }
                break;
            case BEAT:
                {
                alt20=3;
                }
                break;
            case SPEED:
                {
                alt20=4;
                }
                break;
            case INSTRUMENT:
                {
                alt20=5;
                }
                break;
            case ID_:
                {
                switch ( input.LA(2) ) {
                case 95:
                    {
                    int LA20_17 = input.LA(3);

                    if ( (LA20_17==ID_) ) {
                        int LA20_20 = input.LA(4);

                        if ( (LA20_20==92) ) {
                            alt20=6;
                        }
                        else if ( (LA20_20==ASSIG||LA20_20==DECR||LA20_20==DIVIDE_ASSIG||LA20_20==INCR||LA20_20==MINUS_ASSIG||LA20_20==MOD_ASSIG||LA20_20==PLUS_ASSIG||LA20_20==PROD_ASSIG) ) {
                            alt20=7;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 20, 20, input);

                            throw nvae;

                        }
                    }
                    else if ( (LA20_17==LETTER_X) ) {
                        int LA20_21 = input.LA(4);

                        if ( (LA20_21==92) ) {
                            alt20=6;
                        }
                        else if ( (LA20_21==ASSIG||LA20_21==DECR||LA20_21==DIVIDE_ASSIG||LA20_21==INCR||LA20_21==MINUS_ASSIG||LA20_21==MOD_ASSIG||LA20_21==PLUS_ASSIG||LA20_21==PROD_ASSIG) ) {
                            alt20=7;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 20, 21, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 17, input);

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
                    alt20=7;
                    }
                    break;
                case 92:
                    {
                    alt20=9;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 6, input);

                    throw nvae;

                }

                }
                break;
            case LETTER_X:
                {
                switch ( input.LA(2) ) {
                case 95:
                    {
                    int LA20_17 = input.LA(3);

                    if ( (LA20_17==ID_) ) {
                        int LA20_20 = input.LA(4);

                        if ( (LA20_20==92) ) {
                            alt20=6;
                        }
                        else if ( (LA20_20==ASSIG||LA20_20==DECR||LA20_20==DIVIDE_ASSIG||LA20_20==INCR||LA20_20==MINUS_ASSIG||LA20_20==MOD_ASSIG||LA20_20==PLUS_ASSIG||LA20_20==PROD_ASSIG) ) {
                            alt20=7;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 20, 20, input);

                            throw nvae;

                        }
                    }
                    else if ( (LA20_17==LETTER_X) ) {
                        int LA20_21 = input.LA(4);

                        if ( (LA20_21==92) ) {
                            alt20=6;
                        }
                        else if ( (LA20_21==ASSIG||LA20_21==DECR||LA20_21==DIVIDE_ASSIG||LA20_21==INCR||LA20_21==MINUS_ASSIG||LA20_21==MOD_ASSIG||LA20_21==PLUS_ASSIG||LA20_21==PROD_ASSIG) ) {
                            alt20=7;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 20, 21, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 17, input);

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
                    alt20=7;
                    }
                    break;
                case 92:
                    {
                    alt20=9;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 7, input);

                    throw nvae;

                }

                }
                break;
            case DECR:
            case INCR:
                {
                alt20=7;
                }
                break;
            case WHILE:
                {
                alt20=8;
                }
                break;
            case FOR:
                {
                alt20=10;
                }
                break;
            case IF:
                {
                alt20=11;
                }
                break;
            case SONG:
                {
                alt20=12;
                }
                break;
            case DRUMS_NOTE_TYPE:
                {
                int LA20_13 = input.LA(2);

                if ( (LA20_13==92) ) {
                    alt20=14;
                }
                else if ( (LA20_13==ID_||LA20_13==LETTER_X) ) {
                    alt20=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 13, input);

                    throw nvae;

                }
                }
                break;
            case 92:
                {
                int LA20_14 = input.LA(2);

                if ( (LA20_14==ARMOR||LA20_14==BEMOL||LA20_14==NOTE||LA20_14==SUSTAIN) ) {
                    alt20=13;
                }
                else if ( (LA20_14==DRUMS_NOTE_TYPE) ) {
                    alt20=14;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 14, input);

                    throw nvae;

                }
                }
                break;
            case ARMOR:
            case BEMOL:
            case NOTE:
            case SUSTAIN:
                {
                alt20=13;
                }
                break;
            case BOOL:
            case INT:
            case NOTE_TYPE:
            case STRING_TYPE:
                {
                alt20=1;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }

            switch (alt20) {
                case 1 :
                    // src/parser/Music.g:101:17: declaration
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_declaration_in_music_inst1104);
                    declaration68=declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, declaration68.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:102:17: tone ';' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_tone_in_music_inst1122);
                    tone69=tone();

                    state._fsp--;

                    adaptor.addChild(root_0, tone69.getTree());

                    char_literal70=(Token)match(input,97,FOLLOW_97_in_music_inst1124); 

                    }
                    break;
                case 3 :
                    // src/parser/Music.g:103:17: beat ';' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_beat_in_music_inst1143);
                    beat71=beat();

                    state._fsp--;

                    adaptor.addChild(root_0, beat71.getTree());

                    char_literal72=(Token)match(input,97,FOLLOW_97_in_music_inst1145); 

                    }
                    break;
                case 4 :
                    // src/parser/Music.g:104:17: speed ';' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_speed_in_music_inst1164);
                    speed73=speed();

                    state._fsp--;

                    adaptor.addChild(root_0, speed73.getTree());

                    char_literal74=(Token)match(input,97,FOLLOW_97_in_music_inst1166); 

                    }
                    break;
                case 5 :
                    // src/parser/Music.g:105:17: instrument ';' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_instrument_in_music_inst1185);
                    instrument75=instrument();

                    state._fsp--;

                    adaptor.addChild(root_0, instrument75.getTree());

                    char_literal76=(Token)match(input,97,FOLLOW_97_in_music_inst1187); 

                    }
                    break;
                case 6 :
                    // src/parser/Music.g:106:17: var_funcall
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_var_funcall_in_music_inst1206);
                    var_funcall77=var_funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, var_funcall77.getTree());

                    }
                    break;
                case 7 :
                    // src/parser/Music.g:107:17: assignation
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_assignation_in_music_inst1224);
                    assignation78=assignation();

                    state._fsp--;

                    adaptor.addChild(root_0, assignation78.getTree());

                    }
                    break;
                case 8 :
                    // src/parser/Music.g:108:17: while_music_stmt
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_while_music_stmt_in_music_inst1242);
                    while_music_stmt79=while_music_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, while_music_stmt79.getTree());

                    }
                    break;
                case 9 :
                    // src/parser/Music.g:109:17: funcall ';' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_music_inst1260);
                    funcall80=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall80.getTree());

                    char_literal81=(Token)match(input,97,FOLLOW_97_in_music_inst1262); 

                    }
                    break;
                case 10 :
                    // src/parser/Music.g:110:17: for_music_stmt
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_for_music_stmt_in_music_inst1281);
                    for_music_stmt82=for_music_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, for_music_stmt82.getTree());

                    }
                    break;
                case 11 :
                    // src/parser/Music.g:111:17: if_music_stmt
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_if_music_stmt_in_music_inst1299);
                    if_music_stmt83=if_music_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, if_music_stmt83.getTree());

                    }
                    break;
                case 12 :
                    // src/parser/Music.g:112:17: song
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_song_in_music_inst1317);
                    song84=song();

                    state._fsp--;

                    adaptor.addChild(root_0, song84.getTree());

                    }
                    break;
                case 13 :
                    // src/parser/Music.g:113:16: ( options {greedy=true; } : notes_group )+ ( ';' !)?
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    // src/parser/Music.g:113:16: ( options {greedy=true; } : notes_group )+
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
                        case 92:
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

                        }

                        switch (alt16) {
                    	case 1 :
                    	    // src/parser/Music.g:113:42: notes_group
                    	    {
                    	    pushFollow(FOLLOW_notes_group_in_music_inst1344);
                    	    notes_group85=notes_group();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, notes_group85.getTree());

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


                    // src/parser/Music.g:113:59: ( ';' !)?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==97) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // src/parser/Music.g:113:59: ';' !
                            {
                            char_literal86=(Token)match(input,97,FOLLOW_97_in_music_inst1348); 

                            }
                            break;

                    }


                    }
                    break;
                case 14 :
                    // src/parser/Music.g:114:16: ( options {greedy=true; } : drumsnotes_group )+ ( ';' !)?
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    // src/parser/Music.g:114:16: ( options {greedy=true; } : drumsnotes_group )+
                    int cnt18=0;
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==DRUMS_NOTE_TYPE) ) {
                            alt18=1;
                        }
                        else if ( (LA18_0==92) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // src/parser/Music.g:114:42: drumsnotes_group
                    	    {
                    	    pushFollow(FOLLOW_drumsnotes_group_in_music_inst1377);
                    	    drumsnotes_group87=drumsnotes_group();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, drumsnotes_group87.getTree());

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


                    // src/parser/Music.g:114:64: ( ';' !)?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==97) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // src/parser/Music.g:114:64: ';' !
                            {
                            char_literal88=(Token)match(input,97,FOLLOW_97_in_music_inst1381); 

                            }
                            break;

                    }


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
    // src/parser/Music.g:117:1: declaration : type ^ assig_opt ( ',' ! assig_opt )* ';' !;
    public final MusicParser.declaration_return declaration() throws RecognitionException {
        MusicParser.declaration_return retval = new MusicParser.declaration_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal91=null;
        Token char_literal93=null;
        MusicParser.type_return type89 =null;

        MusicParser.assig_opt_return assig_opt90 =null;

        MusicParser.assig_opt_return assig_opt92 =null;


        AmlTree char_literal91_tree=null;
        AmlTree char_literal93_tree=null;

        try {
            // src/parser/Music.g:117:13: ( type ^ assig_opt ( ',' ! assig_opt )* ';' !)
            // src/parser/Music.g:117:17: type ^ assig_opt ( ',' ! assig_opt )* ';' !
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_type_in_declaration1406);
            type89=type();

            state._fsp--;

            root_0 = (AmlTree)adaptor.becomeRoot(type89.getTree(), root_0);

            pushFollow(FOLLOW_assig_opt_in_declaration1409);
            assig_opt90=assig_opt();

            state._fsp--;

            adaptor.addChild(root_0, assig_opt90.getTree());

            // src/parser/Music.g:117:33: ( ',' ! assig_opt )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==94) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // src/parser/Music.g:117:34: ',' ! assig_opt
            	    {
            	    char_literal91=(Token)match(input,94,FOLLOW_94_in_declaration1412); 

            	    pushFollow(FOLLOW_assig_opt_in_declaration1415);
            	    assig_opt92=assig_opt();

            	    state._fsp--;

            	    adaptor.addChild(root_0, assig_opt92.getTree());

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            char_literal93=(Token)match(input,97,FOLLOW_97_in_declaration1419); 

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
    // src/parser/Music.g:120:1: type : ( INT | BOOL | NOTE_TYPE | DRUMS_NOTE_TYPE | CHORD | STRING_TYPE );
    public final MusicParser.type_return type() throws RecognitionException {
        MusicParser.type_return retval = new MusicParser.type_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token set94=null;

        AmlTree set94_tree=null;

        try {
            // src/parser/Music.g:120:13: ( INT | BOOL | NOTE_TYPE | DRUMS_NOTE_TYPE | CHORD | STRING_TYPE )
            // src/parser/Music.g:
            {
            root_0 = (AmlTree)adaptor.nil();


            set94=(Token)input.LT(1);

            if ( input.LA(1)==BOOL||input.LA(1)==CHORD||input.LA(1)==DRUMS_NOTE_TYPE||input.LA(1)==INT||input.LA(1)==NOTE_TYPE||input.LA(1)==STRING_TYPE ) {
                input.consume();
                adaptor.addChild(root_0, 
                (AmlTree)adaptor.create(set94)
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
    // src/parser/Music.g:128:1: type_void : ( type | VOID );
    public final MusicParser.type_void_return type_void() throws RecognitionException {
        MusicParser.type_void_return retval = new MusicParser.type_void_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token VOID96=null;
        MusicParser.type_return type95 =null;


        AmlTree VOID96_tree=null;

        try {
            // src/parser/Music.g:128:13: ( type | VOID )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==BOOL||LA22_0==CHORD||LA22_0==DRUMS_NOTE_TYPE||LA22_0==INT||LA22_0==NOTE_TYPE||LA22_0==STRING_TYPE) ) {
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
                    // src/parser/Music.g:128:17: type
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_type_in_type_void1565);
                    type95=type();

                    state._fsp--;

                    adaptor.addChild(root_0, type95.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:129:17: VOID
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    VOID96=(Token)match(input,VOID,FOLLOW_VOID_in_type_void1583); 
                    VOID96_tree = 
                    (AmlTree)adaptor.create(VOID96)
                    ;
                    adaptor.addChild(root_0, VOID96_tree);


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
    // src/parser/Music.g:132:1: assig_opt : id_rule ( ASSIG ^ ( expr | notes_variable | drumsnotes_variable ) )? ;
    public final MusicParser.assig_opt_return assig_opt() throws RecognitionException {
        MusicParser.assig_opt_return retval = new MusicParser.assig_opt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token ASSIG98=null;
        MusicParser.id_rule_return id_rule97 =null;

        MusicParser.expr_return expr99 =null;

        MusicParser.notes_variable_return notes_variable100 =null;

        MusicParser.drumsnotes_variable_return drumsnotes_variable101 =null;


        AmlTree ASSIG98_tree=null;

        try {
            // src/parser/Music.g:132:13: ( id_rule ( ASSIG ^ ( expr | notes_variable | drumsnotes_variable ) )? )
            // src/parser/Music.g:132:17: id_rule ( ASSIG ^ ( expr | notes_variable | drumsnotes_variable ) )?
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_id_rule_in_assig_opt1608);
            id_rule97=id_rule();

            state._fsp--;

            adaptor.addChild(root_0, id_rule97.getTree());

            // src/parser/Music.g:132:25: ( ASSIG ^ ( expr | notes_variable | drumsnotes_variable ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==ASSIG) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // src/parser/Music.g:132:26: ASSIG ^ ( expr | notes_variable | drumsnotes_variable )
                    {
                    ASSIG98=(Token)match(input,ASSIG,FOLLOW_ASSIG_in_assig_opt1611); 
                    ASSIG98_tree = 
                    (AmlTree)adaptor.create(ASSIG98)
                    ;
                    root_0 = (AmlTree)adaptor.becomeRoot(ASSIG98_tree, root_0);


                    // src/parser/Music.g:132:33: ( expr | notes_variable | drumsnotes_variable )
                    int alt23=3;
                    switch ( input.LA(1) ) {
                    case FALSE:
                    case ID_:
                    case LETTER_X:
                    case MINUS:
                    case NOT:
                    case NUM:
                    case PLUS:
                    case STRING:
                    case TRUE:
                        {
                        alt23=1;
                        }
                        break;
                    case 92:
                        {
                        switch ( input.LA(2) ) {
                        case FALSE:
                        case ID_:
                        case LETTER_X:
                        case MINUS:
                        case NOT:
                        case NUM:
                        case PLUS:
                        case STRING:
                        case TRUE:
                        case 92:
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
                        case DRUMS_NOTE_TYPE:
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
                        {
                        alt23=2;
                        }
                        break;
                    case DRUMS_NOTE_TYPE:
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
                            // src/parser/Music.g:132:34: expr
                            {
                            pushFollow(FOLLOW_expr_in_assig_opt1615);
                            expr99=expr();

                            state._fsp--;

                            adaptor.addChild(root_0, expr99.getTree());

                            }
                            break;
                        case 2 :
                            // src/parser/Music.g:132:41: notes_variable
                            {
                            pushFollow(FOLLOW_notes_variable_in_assig_opt1619);
                            notes_variable100=notes_variable();

                            state._fsp--;

                            adaptor.addChild(root_0, notes_variable100.getTree());

                            }
                            break;
                        case 3 :
                            // src/parser/Music.g:132:58: drumsnotes_variable
                            {
                            pushFollow(FOLLOW_drumsnotes_variable_in_assig_opt1623);
                            drumsnotes_variable101=drumsnotes_variable();

                            state._fsp--;

                            adaptor.addChild(root_0, drumsnotes_variable101.getTree());

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
    // src/parser/Music.g:135:1: assignation : assig ';' !;
    public final MusicParser.assignation_return assignation() throws RecognitionException {
        MusicParser.assignation_return retval = new MusicParser.assignation_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal103=null;
        MusicParser.assig_return assig102 =null;


        AmlTree char_literal103_tree=null;

        try {
            // src/parser/Music.g:135:13: ( assig ';' !)
            // src/parser/Music.g:135:17: assig ';' !
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_assig_in_assignation1649);
            assig102=assig();

            state._fsp--;

            adaptor.addChild(root_0, assig102.getTree());

            char_literal103=(Token)match(input,97,FOLLOW_97_in_assignation1651); 

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
    // src/parser/Music.g:138:1: assig : ( var_access ( ASSIG | PLUS_ASSIG | MINUS_ASSIG | PROD_ASSIG | DIVIDE_ASSIG | MOD_ASSIG ) ^ ( expr | notes_variable | drumsnotes_variable | FIGURE ) | post | pre );
    public final MusicParser.assig_return assig() throws RecognitionException {
        MusicParser.assig_return retval = new MusicParser.assig_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token set105=null;
        Token FIGURE109=null;
        MusicParser.var_access_return var_access104 =null;

        MusicParser.expr_return expr106 =null;

        MusicParser.notes_variable_return notes_variable107 =null;

        MusicParser.drumsnotes_variable_return drumsnotes_variable108 =null;

        MusicParser.post_return post110 =null;

        MusicParser.pre_return pre111 =null;


        AmlTree set105_tree=null;
        AmlTree FIGURE109_tree=null;

        try {
            // src/parser/Music.g:138:13: ( var_access ( ASSIG | PLUS_ASSIG | MINUS_ASSIG | PROD_ASSIG | DIVIDE_ASSIG | MOD_ASSIG ) ^ ( expr | notes_variable | drumsnotes_variable | FIGURE ) | post | pre )
            int alt26=3;
            switch ( input.LA(1) ) {
            case ID_:
                {
                switch ( input.LA(2) ) {
                case 95:
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
                case 95:
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
                    // src/parser/Music.g:138:17: var_access ( ASSIG | PLUS_ASSIG | MINUS_ASSIG | PROD_ASSIG | DIVIDE_ASSIG | MOD_ASSIG ) ^ ( expr | notes_variable | drumsnotes_variable | FIGURE )
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_var_access_in_assig1681);
                    var_access104=var_access();

                    state._fsp--;

                    adaptor.addChild(root_0, var_access104.getTree());

                    set105=(Token)input.LT(1);

                    set105=(Token)input.LT(1);

                    if ( input.LA(1)==ASSIG||input.LA(1)==DIVIDE_ASSIG||input.LA(1)==MINUS_ASSIG||input.LA(1)==MOD_ASSIG||input.LA(1)==PLUS_ASSIG||input.LA(1)==PROD_ASSIG ) {
                        input.consume();
                        root_0 = (AmlTree)adaptor.becomeRoot(
                        (AmlTree)adaptor.create(set105)
                        , root_0);
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    // src/parser/Music.g:138:94: ( expr | notes_variable | drumsnotes_variable | FIGURE )
                    int alt25=4;
                    switch ( input.LA(1) ) {
                    case FALSE:
                    case ID_:
                    case LETTER_X:
                    case MINUS:
                    case NOT:
                    case NUM:
                    case PLUS:
                    case STRING:
                    case TRUE:
                        {
                        alt25=1;
                        }
                        break;
                    case 92:
                        {
                        switch ( input.LA(2) ) {
                        case FALSE:
                        case ID_:
                        case LETTER_X:
                        case MINUS:
                        case NOT:
                        case NUM:
                        case PLUS:
                        case STRING:
                        case TRUE:
                        case 92:
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
                        case DRUMS_NOTE_TYPE:
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
                        {
                        alt25=2;
                        }
                        break;
                    case DRUMS_NOTE_TYPE:
                        {
                        alt25=3;
                        }
                        break;
                    case FIGURE:
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
                            // src/parser/Music.g:138:95: expr
                            {
                            pushFollow(FOLLOW_expr_in_assig1699);
                            expr106=expr();

                            state._fsp--;

                            adaptor.addChild(root_0, expr106.getTree());

                            }
                            break;
                        case 2 :
                            // src/parser/Music.g:138:102: notes_variable
                            {
                            pushFollow(FOLLOW_notes_variable_in_assig1703);
                            notes_variable107=notes_variable();

                            state._fsp--;

                            adaptor.addChild(root_0, notes_variable107.getTree());

                            }
                            break;
                        case 3 :
                            // src/parser/Music.g:138:119: drumsnotes_variable
                            {
                            pushFollow(FOLLOW_drumsnotes_variable_in_assig1707);
                            drumsnotes_variable108=drumsnotes_variable();

                            state._fsp--;

                            adaptor.addChild(root_0, drumsnotes_variable108.getTree());

                            }
                            break;
                        case 4 :
                            // src/parser/Music.g:138:141: FIGURE
                            {
                            FIGURE109=(Token)match(input,FIGURE,FOLLOW_FIGURE_in_assig1711); 
                            FIGURE109_tree = 
                            (AmlTree)adaptor.create(FIGURE109)
                            ;
                            adaptor.addChild(root_0, FIGURE109_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // src/parser/Music.g:139:17: post
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_post_in_assig1730);
                    post110=post();

                    state._fsp--;

                    adaptor.addChild(root_0, post110.getTree());

                    }
                    break;
                case 3 :
                    // src/parser/Music.g:140:17: pre
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_pre_in_assig1748);
                    pre111=pre();

                    state._fsp--;

                    adaptor.addChild(root_0, pre111.getTree());

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


    public static class post_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "post"
    // src/parser/Music.g:143:1: post : var_access (x= INCR |x= DECR ) -> ^( POST var_access $x) ;
    public final MusicParser.post_return post() throws RecognitionException {
        MusicParser.post_return retval = new MusicParser.post_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token x=null;
        MusicParser.var_access_return var_access112 =null;


        AmlTree x_tree=null;
        RewriteRuleTokenStream stream_DECR=new RewriteRuleTokenStream(adaptor,"token DECR");
        RewriteRuleTokenStream stream_INCR=new RewriteRuleTokenStream(adaptor,"token INCR");
        RewriteRuleSubtreeStream stream_var_access=new RewriteRuleSubtreeStream(adaptor,"rule var_access");
        try {
            // src/parser/Music.g:143:13: ( var_access (x= INCR |x= DECR ) -> ^( POST var_access $x) )
            // src/parser/Music.g:143:17: var_access (x= INCR |x= DECR )
            {
            pushFollow(FOLLOW_var_access_in_post1778);
            var_access112=var_access();

            state._fsp--;

            stream_var_access.add(var_access112.getTree());

            // src/parser/Music.g:143:28: (x= INCR |x= DECR )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==INCR) ) {
                alt27=1;
            }
            else if ( (LA27_0==DECR) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;

            }
            switch (alt27) {
                case 1 :
                    // src/parser/Music.g:143:29: x= INCR
                    {
                    x=(Token)match(input,INCR,FOLLOW_INCR_in_post1783);  
                    stream_INCR.add(x);


                    }
                    break;
                case 2 :
                    // src/parser/Music.g:143:38: x= DECR
                    {
                    x=(Token)match(input,DECR,FOLLOW_DECR_in_post1789);  
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
            // 143:46: -> ^( POST var_access $x)
            {
                // src/parser/Music.g:143:50: ^( POST var_access $x)
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
    // src/parser/Music.g:146:1: pre : (x= INCR |x= DECR ) var_access -> ^( PRE var_access $x) ;
    public final MusicParser.pre_return pre() throws RecognitionException {
        MusicParser.pre_return retval = new MusicParser.pre_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token x=null;
        MusicParser.var_access_return var_access113 =null;


        AmlTree x_tree=null;
        RewriteRuleTokenStream stream_DECR=new RewriteRuleTokenStream(adaptor,"token DECR");
        RewriteRuleTokenStream stream_INCR=new RewriteRuleTokenStream(adaptor,"token INCR");
        RewriteRuleSubtreeStream stream_var_access=new RewriteRuleSubtreeStream(adaptor,"rule var_access");
        try {
            // src/parser/Music.g:146:13: ( (x= INCR |x= DECR ) var_access -> ^( PRE var_access $x) )
            // src/parser/Music.g:146:17: (x= INCR |x= DECR ) var_access
            {
            // src/parser/Music.g:146:17: (x= INCR |x= DECR )
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
                    // src/parser/Music.g:146:18: x= INCR
                    {
                    x=(Token)match(input,INCR,FOLLOW_INCR_in_pre1836);  
                    stream_INCR.add(x);


                    }
                    break;
                case 2 :
                    // src/parser/Music.g:146:27: x= DECR
                    {
                    x=(Token)match(input,DECR,FOLLOW_DECR_in_pre1842);  
                    stream_DECR.add(x);


                    }
                    break;

            }


            pushFollow(FOLLOW_var_access_in_pre1845);
            var_access113=var_access();

            state._fsp--;

            stream_var_access.add(var_access113.getTree());

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
            // 146:47: -> ^( PRE var_access $x)
            {
                // src/parser/Music.g:146:50: ^( PRE var_access $x)
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
    // src/parser/Music.g:149:1: beat : BEAT ^ NUM ':' ! NUM ;
    public final MusicParser.beat_return beat() throws RecognitionException {
        MusicParser.beat_return retval = new MusicParser.beat_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token BEAT114=null;
        Token NUM115=null;
        Token char_literal116=null;
        Token NUM117=null;

        AmlTree BEAT114_tree=null;
        AmlTree NUM115_tree=null;
        AmlTree char_literal116_tree=null;
        AmlTree NUM117_tree=null;

        try {
            // src/parser/Music.g:149:13: ( BEAT ^ NUM ':' ! NUM )
            // src/parser/Music.g:149:17: BEAT ^ NUM ':' ! NUM
            {
            root_0 = (AmlTree)adaptor.nil();


            BEAT114=(Token)match(input,BEAT,FOLLOW_BEAT_in_beat1888); 
            BEAT114_tree = 
            (AmlTree)adaptor.create(BEAT114)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(BEAT114_tree, root_0);


            NUM115=(Token)match(input,NUM,FOLLOW_NUM_in_beat1891); 
            NUM115_tree = 
            (AmlTree)adaptor.create(NUM115)
            ;
            adaptor.addChild(root_0, NUM115_tree);


            char_literal116=(Token)match(input,96,FOLLOW_96_in_beat1893); 

            NUM117=(Token)match(input,NUM,FOLLOW_NUM_in_beat1896); 
            NUM117_tree = 
            (AmlTree)adaptor.create(NUM117)
            ;
            adaptor.addChild(root_0, NUM117_tree);


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
    // src/parser/Music.g:152:1: speed : SPEED ^ NUM ;
    public final MusicParser.speed_return speed() throws RecognitionException {
        MusicParser.speed_return retval = new MusicParser.speed_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token SPEED118=null;
        Token NUM119=null;

        AmlTree SPEED118_tree=null;
        AmlTree NUM119_tree=null;

        try {
            // src/parser/Music.g:152:13: ( SPEED ^ NUM )
            // src/parser/Music.g:152:17: SPEED ^ NUM
            {
            root_0 = (AmlTree)adaptor.nil();


            SPEED118=(Token)match(input,SPEED,FOLLOW_SPEED_in_speed1925); 
            SPEED118_tree = 
            (AmlTree)adaptor.create(SPEED118)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(SPEED118_tree, root_0);


            NUM119=(Token)match(input,NUM,FOLLOW_NUM_in_speed1928); 
            NUM119_tree = 
            (AmlTree)adaptor.create(NUM119)
            ;
            adaptor.addChild(root_0, NUM119_tree);


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


    public static class transport_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "transport"
    // src/parser/Music.g:155:1: transport : TRANSPORT ^ expr ;
    public final MusicParser.transport_return transport() throws RecognitionException {
        MusicParser.transport_return retval = new MusicParser.transport_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token TRANSPORT120=null;
        MusicParser.expr_return expr121 =null;


        AmlTree TRANSPORT120_tree=null;

        try {
            // src/parser/Music.g:155:13: ( TRANSPORT ^ expr )
            // src/parser/Music.g:155:17: TRANSPORT ^ expr
            {
            root_0 = (AmlTree)adaptor.nil();


            TRANSPORT120=(Token)match(input,TRANSPORT,FOLLOW_TRANSPORT_in_transport1953); 
            TRANSPORT120_tree = 
            (AmlTree)adaptor.create(TRANSPORT120)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(TRANSPORT120_tree, root_0);


            pushFollow(FOLLOW_expr_in_transport1956);
            expr121=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr121.getTree());

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
    // src/parser/Music.g:158:1: instrument : INSTRUMENT ^ STRING ';' ;
    public final MusicParser.instrument_return instrument() throws RecognitionException {
        MusicParser.instrument_return retval = new MusicParser.instrument_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token INSTRUMENT122=null;
        Token STRING123=null;
        Token char_literal124=null;

        AmlTree INSTRUMENT122_tree=null;
        AmlTree STRING123_tree=null;
        AmlTree char_literal124_tree=null;

        try {
            // src/parser/Music.g:158:13: ( INSTRUMENT ^ STRING ';' )
            // src/parser/Music.g:158:17: INSTRUMENT ^ STRING ';'
            {
            root_0 = (AmlTree)adaptor.nil();


            INSTRUMENT122=(Token)match(input,INSTRUMENT,FOLLOW_INSTRUMENT_in_instrument1980); 
            INSTRUMENT122_tree = 
            (AmlTree)adaptor.create(INSTRUMENT122)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(INSTRUMENT122_tree, root_0);


            STRING123=(Token)match(input,STRING,FOLLOW_STRING_in_instrument1983); 
            STRING123_tree = 
            (AmlTree)adaptor.create(STRING123)
            ;
            adaptor.addChild(root_0, STRING123_tree);


            char_literal124=(Token)match(input,97,FOLLOW_97_in_instrument1985); 
            char_literal124_tree = 
            (AmlTree)adaptor.create(char_literal124)
            ;
            adaptor.addChild(root_0, char_literal124_tree);


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
    // src/parser/Music.g:161:1: while_stmt : WHILE ^ '(' ! expr ')' ! '{' ! listInst '}' !;
    public final MusicParser.while_stmt_return while_stmt() throws RecognitionException {
        MusicParser.while_stmt_return retval = new MusicParser.while_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token WHILE125=null;
        Token char_literal126=null;
        Token char_literal128=null;
        Token char_literal129=null;
        Token char_literal131=null;
        MusicParser.expr_return expr127 =null;

        MusicParser.listInst_return listInst130 =null;


        AmlTree WHILE125_tree=null;
        AmlTree char_literal126_tree=null;
        AmlTree char_literal128_tree=null;
        AmlTree char_literal129_tree=null;
        AmlTree char_literal131_tree=null;

        try {
            // src/parser/Music.g:161:13: ( WHILE ^ '(' ! expr ')' ! '{' ! listInst '}' !)
            // src/parser/Music.g:161:17: WHILE ^ '(' ! expr ')' ! '{' ! listInst '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            WHILE125=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_stmt2009); 
            WHILE125_tree = 
            (AmlTree)adaptor.create(WHILE125)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(WHILE125_tree, root_0);


            char_literal126=(Token)match(input,92,FOLLOW_92_in_while_stmt2012); 

            pushFollow(FOLLOW_expr_in_while_stmt2015);
            expr127=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr127.getTree());

            char_literal128=(Token)match(input,93,FOLLOW_93_in_while_stmt2017); 

            char_literal129=(Token)match(input,98,FOLLOW_98_in_while_stmt2020); 

            pushFollow(FOLLOW_listInst_in_while_stmt2023);
            listInst130=listInst();

            state._fsp--;

            adaptor.addChild(root_0, listInst130.getTree());

            char_literal131=(Token)match(input,99,FOLLOW_99_in_while_stmt2025); 

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
    // src/parser/Music.g:164:1: while_music_stmt : WHILE ^ '(' ! expr ')' ! '{' ! list_music_inst '}' !;
    public final MusicParser.while_music_stmt_return while_music_stmt() throws RecognitionException {
        MusicParser.while_music_stmt_return retval = new MusicParser.while_music_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token WHILE132=null;
        Token char_literal133=null;
        Token char_literal135=null;
        Token char_literal136=null;
        Token char_literal138=null;
        MusicParser.expr_return expr134 =null;

        MusicParser.list_music_inst_return list_music_inst137 =null;


        AmlTree WHILE132_tree=null;
        AmlTree char_literal133_tree=null;
        AmlTree char_literal135_tree=null;
        AmlTree char_literal136_tree=null;
        AmlTree char_literal138_tree=null;

        try {
            // src/parser/Music.g:164:21: ( WHILE ^ '(' ! expr ')' ! '{' ! list_music_inst '}' !)
            // src/parser/Music.g:164:25: WHILE ^ '(' ! expr ')' ! '{' ! list_music_inst '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            WHILE132=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_music_stmt2052); 
            WHILE132_tree = 
            (AmlTree)adaptor.create(WHILE132)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(WHILE132_tree, root_0);


            char_literal133=(Token)match(input,92,FOLLOW_92_in_while_music_stmt2055); 

            pushFollow(FOLLOW_expr_in_while_music_stmt2058);
            expr134=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr134.getTree());

            char_literal135=(Token)match(input,93,FOLLOW_93_in_while_music_stmt2060); 

            char_literal136=(Token)match(input,98,FOLLOW_98_in_while_music_stmt2063); 

            pushFollow(FOLLOW_list_music_inst_in_while_music_stmt2066);
            list_music_inst137=list_music_inst();

            state._fsp--;

            adaptor.addChild(root_0, list_music_inst137.getTree());

            char_literal138=(Token)match(input,99,FOLLOW_99_in_while_music_stmt2068); 

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
    // src/parser/Music.g:167:1: for_stmt : FOR ^ '(' ! ( declaration | list_assig ';' !) expr ';' ! list_assig ')' ! '{' ! listInst '}' !;
    public final MusicParser.for_stmt_return for_stmt() throws RecognitionException {
        MusicParser.for_stmt_return retval = new MusicParser.for_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token FOR139=null;
        Token char_literal140=null;
        Token char_literal143=null;
        Token char_literal145=null;
        Token char_literal147=null;
        Token char_literal148=null;
        Token char_literal150=null;
        MusicParser.declaration_return declaration141 =null;

        MusicParser.list_assig_return list_assig142 =null;

        MusicParser.expr_return expr144 =null;

        MusicParser.list_assig_return list_assig146 =null;

        MusicParser.listInst_return listInst149 =null;


        AmlTree FOR139_tree=null;
        AmlTree char_literal140_tree=null;
        AmlTree char_literal143_tree=null;
        AmlTree char_literal145_tree=null;
        AmlTree char_literal147_tree=null;
        AmlTree char_literal148_tree=null;
        AmlTree char_literal150_tree=null;

        try {
            // src/parser/Music.g:167:13: ( FOR ^ '(' ! ( declaration | list_assig ';' !) expr ';' ! list_assig ')' ! '{' ! listInst '}' !)
            // src/parser/Music.g:167:17: FOR ^ '(' ! ( declaration | list_assig ';' !) expr ';' ! list_assig ')' ! '{' ! listInst '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            FOR139=(Token)match(input,FOR,FOLLOW_FOR_in_for_stmt2103); 
            FOR139_tree = 
            (AmlTree)adaptor.create(FOR139)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(FOR139_tree, root_0);


            char_literal140=(Token)match(input,92,FOLLOW_92_in_for_stmt2106); 

            // src/parser/Music.g:167:27: ( declaration | list_assig ';' !)
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==BOOL||LA29_0==CHORD||LA29_0==DRUMS_NOTE_TYPE||LA29_0==INT||LA29_0==NOTE_TYPE||LA29_0==STRING_TYPE) ) {
                alt29=1;
            }
            else if ( (LA29_0==DECR||LA29_0==ID_||LA29_0==INCR||LA29_0==LETTER_X) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;

            }
            switch (alt29) {
                case 1 :
                    // src/parser/Music.g:167:28: declaration
                    {
                    pushFollow(FOLLOW_declaration_in_for_stmt2110);
                    declaration141=declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, declaration141.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:167:42: list_assig ';' !
                    {
                    pushFollow(FOLLOW_list_assig_in_for_stmt2114);
                    list_assig142=list_assig();

                    state._fsp--;

                    adaptor.addChild(root_0, list_assig142.getTree());

                    char_literal143=(Token)match(input,97,FOLLOW_97_in_for_stmt2116); 

                    }
                    break;

            }


            pushFollow(FOLLOW_expr_in_for_stmt2120);
            expr144=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr144.getTree());

            char_literal145=(Token)match(input,97,FOLLOW_97_in_for_stmt2122); 

            pushFollow(FOLLOW_list_assig_in_for_stmt2125);
            list_assig146=list_assig();

            state._fsp--;

            adaptor.addChild(root_0, list_assig146.getTree());

            char_literal147=(Token)match(input,93,FOLLOW_93_in_for_stmt2127); 

            char_literal148=(Token)match(input,98,FOLLOW_98_in_for_stmt2130); 

            pushFollow(FOLLOW_listInst_in_for_stmt2133);
            listInst149=listInst();

            state._fsp--;

            adaptor.addChild(root_0, listInst149.getTree());

            char_literal150=(Token)match(input,99,FOLLOW_99_in_for_stmt2135); 

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
    // src/parser/Music.g:170:1: for_music_stmt : FOR ^ '(' ! ( declaration | list_assig ';' !) expr ';' ! list_assig ')' ! '{' ! list_music_inst '}' !;
    public final MusicParser.for_music_stmt_return for_music_stmt() throws RecognitionException {
        MusicParser.for_music_stmt_return retval = new MusicParser.for_music_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token FOR151=null;
        Token char_literal152=null;
        Token char_literal155=null;
        Token char_literal157=null;
        Token char_literal159=null;
        Token char_literal160=null;
        Token char_literal162=null;
        MusicParser.declaration_return declaration153 =null;

        MusicParser.list_assig_return list_assig154 =null;

        MusicParser.expr_return expr156 =null;

        MusicParser.list_assig_return list_assig158 =null;

        MusicParser.list_music_inst_return list_music_inst161 =null;


        AmlTree FOR151_tree=null;
        AmlTree char_literal152_tree=null;
        AmlTree char_literal155_tree=null;
        AmlTree char_literal157_tree=null;
        AmlTree char_literal159_tree=null;
        AmlTree char_literal160_tree=null;
        AmlTree char_literal162_tree=null;

        try {
            // src/parser/Music.g:170:17: ( FOR ^ '(' ! ( declaration | list_assig ';' !) expr ';' ! list_assig ')' ! '{' ! list_music_inst '}' !)
            // src/parser/Music.g:170:21: FOR ^ '(' ! ( declaration | list_assig ';' !) expr ';' ! list_assig ')' ! '{' ! list_music_inst '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            FOR151=(Token)match(input,FOR,FOLLOW_FOR_in_for_music_stmt2160); 
            FOR151_tree = 
            (AmlTree)adaptor.create(FOR151)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(FOR151_tree, root_0);


            char_literal152=(Token)match(input,92,FOLLOW_92_in_for_music_stmt2163); 

            // src/parser/Music.g:170:31: ( declaration | list_assig ';' !)
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==BOOL||LA30_0==CHORD||LA30_0==DRUMS_NOTE_TYPE||LA30_0==INT||LA30_0==NOTE_TYPE||LA30_0==STRING_TYPE) ) {
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
                    // src/parser/Music.g:170:32: declaration
                    {
                    pushFollow(FOLLOW_declaration_in_for_music_stmt2167);
                    declaration153=declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, declaration153.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:170:46: list_assig ';' !
                    {
                    pushFollow(FOLLOW_list_assig_in_for_music_stmt2171);
                    list_assig154=list_assig();

                    state._fsp--;

                    adaptor.addChild(root_0, list_assig154.getTree());

                    char_literal155=(Token)match(input,97,FOLLOW_97_in_for_music_stmt2173); 

                    }
                    break;

            }


            pushFollow(FOLLOW_expr_in_for_music_stmt2177);
            expr156=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr156.getTree());

            char_literal157=(Token)match(input,97,FOLLOW_97_in_for_music_stmt2179); 

            pushFollow(FOLLOW_list_assig_in_for_music_stmt2182);
            list_assig158=list_assig();

            state._fsp--;

            adaptor.addChild(root_0, list_assig158.getTree());

            char_literal159=(Token)match(input,93,FOLLOW_93_in_for_music_stmt2184); 

            char_literal160=(Token)match(input,98,FOLLOW_98_in_for_music_stmt2187); 

            pushFollow(FOLLOW_list_music_inst_in_for_music_stmt2190);
            list_music_inst161=list_music_inst();

            state._fsp--;

            adaptor.addChild(root_0, list_music_inst161.getTree());

            char_literal162=(Token)match(input,99,FOLLOW_99_in_for_music_stmt2192); 

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
    // src/parser/Music.g:173:1: list_assig : assig ( ',' assig )* -> ^( LIST_ASSIG ( assig )+ ) ;
    public final MusicParser.list_assig_return list_assig() throws RecognitionException {
        MusicParser.list_assig_return retval = new MusicParser.list_assig_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal164=null;
        MusicParser.assig_return assig163 =null;

        MusicParser.assig_return assig165 =null;


        AmlTree char_literal164_tree=null;
        RewriteRuleTokenStream stream_94=new RewriteRuleTokenStream(adaptor,"token 94");
        RewriteRuleSubtreeStream stream_assig=new RewriteRuleSubtreeStream(adaptor,"rule assig");
        try {
            // src/parser/Music.g:173:13: ( assig ( ',' assig )* -> ^( LIST_ASSIG ( assig )+ ) )
            // src/parser/Music.g:173:17: assig ( ',' assig )*
            {
            pushFollow(FOLLOW_assig_in_list_assig2221);
            assig163=assig();

            state._fsp--;

            stream_assig.add(assig163.getTree());

            // src/parser/Music.g:173:23: ( ',' assig )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==94) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // src/parser/Music.g:173:24: ',' assig
            	    {
            	    char_literal164=(Token)match(input,94,FOLLOW_94_in_list_assig2224);  
            	    stream_94.add(char_literal164);


            	    pushFollow(FOLLOW_assig_in_list_assig2226);
            	    assig165=assig();

            	    state._fsp--;

            	    stream_assig.add(assig165.getTree());

            	    }
            	    break;

            	default :
            	    break loop31;
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
            // 173:36: -> ^( LIST_ASSIG ( assig )+ )
            {
                // src/parser/Music.g:173:39: ^( LIST_ASSIG ( assig )+ )
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
    // src/parser/Music.g:176:1: if_stmt : IF ^ '(' ! expr ')' ! '{' ! listInst '}' ! ( elseif_stmt )* ( else_stmt )? ;
    public final MusicParser.if_stmt_return if_stmt() throws RecognitionException {
        MusicParser.if_stmt_return retval = new MusicParser.if_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token IF166=null;
        Token char_literal167=null;
        Token char_literal169=null;
        Token char_literal170=null;
        Token char_literal172=null;
        MusicParser.expr_return expr168 =null;

        MusicParser.listInst_return listInst171 =null;

        MusicParser.elseif_stmt_return elseif_stmt173 =null;

        MusicParser.else_stmt_return else_stmt174 =null;


        AmlTree IF166_tree=null;
        AmlTree char_literal167_tree=null;
        AmlTree char_literal169_tree=null;
        AmlTree char_literal170_tree=null;
        AmlTree char_literal172_tree=null;

        try {
            // src/parser/Music.g:176:13: ( IF ^ '(' ! expr ')' ! '{' ! listInst '}' ! ( elseif_stmt )* ( else_stmt )? )
            // src/parser/Music.g:176:17: IF ^ '(' ! expr ')' ! '{' ! listInst '}' ! ( elseif_stmt )* ( else_stmt )?
            {
            root_0 = (AmlTree)adaptor.nil();


            IF166=(Token)match(input,IF,FOLLOW_IF_in_if_stmt2264); 
            IF166_tree = 
            (AmlTree)adaptor.create(IF166)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(IF166_tree, root_0);


            char_literal167=(Token)match(input,92,FOLLOW_92_in_if_stmt2267); 

            pushFollow(FOLLOW_expr_in_if_stmt2270);
            expr168=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr168.getTree());

            char_literal169=(Token)match(input,93,FOLLOW_93_in_if_stmt2272); 

            char_literal170=(Token)match(input,98,FOLLOW_98_in_if_stmt2275); 

            pushFollow(FOLLOW_listInst_in_if_stmt2278);
            listInst171=listInst();

            state._fsp--;

            adaptor.addChild(root_0, listInst171.getTree());

            char_literal172=(Token)match(input,99,FOLLOW_99_in_if_stmt2280); 

            // src/parser/Music.g:176:55: ( elseif_stmt )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==ELSE) ) {
                    int LA32_1 = input.LA(2);

                    if ( (LA32_1==IF) ) {
                        alt32=1;
                    }


                }


                switch (alt32) {
            	case 1 :
            	    // src/parser/Music.g:176:55: elseif_stmt
            	    {
            	    pushFollow(FOLLOW_elseif_stmt_in_if_stmt2283);
            	    elseif_stmt173=elseif_stmt();

            	    state._fsp--;

            	    adaptor.addChild(root_0, elseif_stmt173.getTree());

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);


            // src/parser/Music.g:176:68: ( else_stmt )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==ELSE) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // src/parser/Music.g:176:68: else_stmt
                    {
                    pushFollow(FOLLOW_else_stmt_in_if_stmt2286);
                    else_stmt174=else_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, else_stmt174.getTree());

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
    // src/parser/Music.g:179:1: elseif_stmt : ELSE IF '(' expr ')' '{' listInst '}' -> ^( ELSEIF expr listInst ) ;
    public final MusicParser.elseif_stmt_return elseif_stmt() throws RecognitionException {
        MusicParser.elseif_stmt_return retval = new MusicParser.elseif_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token ELSE175=null;
        Token IF176=null;
        Token char_literal177=null;
        Token char_literal179=null;
        Token char_literal180=null;
        Token char_literal182=null;
        MusicParser.expr_return expr178 =null;

        MusicParser.listInst_return listInst181 =null;


        AmlTree ELSE175_tree=null;
        AmlTree IF176_tree=null;
        AmlTree char_literal177_tree=null;
        AmlTree char_literal179_tree=null;
        AmlTree char_literal180_tree=null;
        AmlTree char_literal182_tree=null;
        RewriteRuleTokenStream stream_98=new RewriteRuleTokenStream(adaptor,"token 98");
        RewriteRuleTokenStream stream_93=new RewriteRuleTokenStream(adaptor,"token 93");
        RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
        RewriteRuleTokenStream stream_99=new RewriteRuleTokenStream(adaptor,"token 99");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_listInst=new RewriteRuleSubtreeStream(adaptor,"rule listInst");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // src/parser/Music.g:179:13: ( ELSE IF '(' expr ')' '{' listInst '}' -> ^( ELSEIF expr listInst ) )
            // src/parser/Music.g:179:17: ELSE IF '(' expr ')' '{' listInst '}'
            {
            ELSE175=(Token)match(input,ELSE,FOLLOW_ELSE_in_elseif_stmt2310);  
            stream_ELSE.add(ELSE175);


            IF176=(Token)match(input,IF,FOLLOW_IF_in_elseif_stmt2312);  
            stream_IF.add(IF176);


            char_literal177=(Token)match(input,92,FOLLOW_92_in_elseif_stmt2314);  
            stream_92.add(char_literal177);


            pushFollow(FOLLOW_expr_in_elseif_stmt2316);
            expr178=expr();

            state._fsp--;

            stream_expr.add(expr178.getTree());

            char_literal179=(Token)match(input,93,FOLLOW_93_in_elseif_stmt2318);  
            stream_93.add(char_literal179);


            char_literal180=(Token)match(input,98,FOLLOW_98_in_elseif_stmt2320);  
            stream_98.add(char_literal180);


            pushFollow(FOLLOW_listInst_in_elseif_stmt2322);
            listInst181=listInst();

            state._fsp--;

            stream_listInst.add(listInst181.getTree());

            char_literal182=(Token)match(input,99,FOLLOW_99_in_elseif_stmt2324);  
            stream_99.add(char_literal182);


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
            // 179:55: -> ^( ELSEIF expr listInst )
            {
                // src/parser/Music.g:179:58: ^( ELSEIF expr listInst )
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
    // src/parser/Music.g:182:1: else_stmt : ELSE ^ '{' ! listInst '}' !;
    public final MusicParser.else_stmt_return else_stmt() throws RecognitionException {
        MusicParser.else_stmt_return retval = new MusicParser.else_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token ELSE183=null;
        Token char_literal184=null;
        Token char_literal186=null;
        MusicParser.listInst_return listInst185 =null;


        AmlTree ELSE183_tree=null;
        AmlTree char_literal184_tree=null;
        AmlTree char_literal186_tree=null;

        try {
            // src/parser/Music.g:182:13: ( ELSE ^ '{' ! listInst '}' !)
            // src/parser/Music.g:182:17: ELSE ^ '{' ! listInst '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            ELSE183=(Token)match(input,ELSE,FOLLOW_ELSE_in_else_stmt2359); 
            ELSE183_tree = 
            (AmlTree)adaptor.create(ELSE183)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(ELSE183_tree, root_0);


            char_literal184=(Token)match(input,98,FOLLOW_98_in_else_stmt2362); 

            pushFollow(FOLLOW_listInst_in_else_stmt2365);
            listInst185=listInst();

            state._fsp--;

            adaptor.addChild(root_0, listInst185.getTree());

            char_literal186=(Token)match(input,99,FOLLOW_99_in_else_stmt2367); 

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
    // src/parser/Music.g:185:1: if_music_stmt : IF ^ '(' ! expr ')' ! '{' ! list_music_inst '}' ! ( elseif_music_stmt )* ( else_music_stmt )? ;
    public final MusicParser.if_music_stmt_return if_music_stmt() throws RecognitionException {
        MusicParser.if_music_stmt_return retval = new MusicParser.if_music_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token IF187=null;
        Token char_literal188=null;
        Token char_literal190=null;
        Token char_literal191=null;
        Token char_literal193=null;
        MusicParser.expr_return expr189 =null;

        MusicParser.list_music_inst_return list_music_inst192 =null;

        MusicParser.elseif_music_stmt_return elseif_music_stmt194 =null;

        MusicParser.else_music_stmt_return else_music_stmt195 =null;


        AmlTree IF187_tree=null;
        AmlTree char_literal188_tree=null;
        AmlTree char_literal190_tree=null;
        AmlTree char_literal191_tree=null;
        AmlTree char_literal193_tree=null;

        try {
            // src/parser/Music.g:185:17: ( IF ^ '(' ! expr ')' ! '{' ! list_music_inst '}' ! ( elseif_music_stmt )* ( else_music_stmt )? )
            // src/parser/Music.g:185:21: IF ^ '(' ! expr ')' ! '{' ! list_music_inst '}' ! ( elseif_music_stmt )* ( else_music_stmt )?
            {
            root_0 = (AmlTree)adaptor.nil();


            IF187=(Token)match(input,IF,FOLLOW_IF_in_if_music_stmt2393); 
            IF187_tree = 
            (AmlTree)adaptor.create(IF187)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(IF187_tree, root_0);


            char_literal188=(Token)match(input,92,FOLLOW_92_in_if_music_stmt2396); 

            pushFollow(FOLLOW_expr_in_if_music_stmt2399);
            expr189=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr189.getTree());

            char_literal190=(Token)match(input,93,FOLLOW_93_in_if_music_stmt2401); 

            char_literal191=(Token)match(input,98,FOLLOW_98_in_if_music_stmt2404); 

            pushFollow(FOLLOW_list_music_inst_in_if_music_stmt2407);
            list_music_inst192=list_music_inst();

            state._fsp--;

            adaptor.addChild(root_0, list_music_inst192.getTree());

            char_literal193=(Token)match(input,99,FOLLOW_99_in_if_music_stmt2409); 

            // src/parser/Music.g:185:66: ( elseif_music_stmt )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==ELSE) ) {
                    int LA34_1 = input.LA(2);

                    if ( (LA34_1==IF) ) {
                        alt34=1;
                    }


                }


                switch (alt34) {
            	case 1 :
            	    // src/parser/Music.g:185:66: elseif_music_stmt
            	    {
            	    pushFollow(FOLLOW_elseif_music_stmt_in_if_music_stmt2412);
            	    elseif_music_stmt194=elseif_music_stmt();

            	    state._fsp--;

            	    adaptor.addChild(root_0, elseif_music_stmt194.getTree());

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            // src/parser/Music.g:185:85: ( else_music_stmt )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==ELSE) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // src/parser/Music.g:185:85: else_music_stmt
                    {
                    pushFollow(FOLLOW_else_music_stmt_in_if_music_stmt2415);
                    else_music_stmt195=else_music_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, else_music_stmt195.getTree());

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
    // src/parser/Music.g:188:1: elseif_music_stmt : ELSE IF '(' expr ')' '{' list_music_inst '}' -> ^( ELSEIF expr list_music_inst ) ;
    public final MusicParser.elseif_music_stmt_return elseif_music_stmt() throws RecognitionException {
        MusicParser.elseif_music_stmt_return retval = new MusicParser.elseif_music_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token ELSE196=null;
        Token IF197=null;
        Token char_literal198=null;
        Token char_literal200=null;
        Token char_literal201=null;
        Token char_literal203=null;
        MusicParser.expr_return expr199 =null;

        MusicParser.list_music_inst_return list_music_inst202 =null;


        AmlTree ELSE196_tree=null;
        AmlTree IF197_tree=null;
        AmlTree char_literal198_tree=null;
        AmlTree char_literal200_tree=null;
        AmlTree char_literal201_tree=null;
        AmlTree char_literal203_tree=null;
        RewriteRuleTokenStream stream_98=new RewriteRuleTokenStream(adaptor,"token 98");
        RewriteRuleTokenStream stream_93=new RewriteRuleTokenStream(adaptor,"token 93");
        RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
        RewriteRuleTokenStream stream_99=new RewriteRuleTokenStream(adaptor,"token 99");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_list_music_inst=new RewriteRuleSubtreeStream(adaptor,"rule list_music_inst");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // src/parser/Music.g:188:21: ( ELSE IF '(' expr ')' '{' list_music_inst '}' -> ^( ELSEIF expr list_music_inst ) )
            // src/parser/Music.g:188:25: ELSE IF '(' expr ')' '{' list_music_inst '}'
            {
            ELSE196=(Token)match(input,ELSE,FOLLOW_ELSE_in_elseif_music_stmt2445);  
            stream_ELSE.add(ELSE196);


            IF197=(Token)match(input,IF,FOLLOW_IF_in_elseif_music_stmt2447);  
            stream_IF.add(IF197);


            char_literal198=(Token)match(input,92,FOLLOW_92_in_elseif_music_stmt2449);  
            stream_92.add(char_literal198);


            pushFollow(FOLLOW_expr_in_elseif_music_stmt2451);
            expr199=expr();

            state._fsp--;

            stream_expr.add(expr199.getTree());

            char_literal200=(Token)match(input,93,FOLLOW_93_in_elseif_music_stmt2453);  
            stream_93.add(char_literal200);


            char_literal201=(Token)match(input,98,FOLLOW_98_in_elseif_music_stmt2455);  
            stream_98.add(char_literal201);


            pushFollow(FOLLOW_list_music_inst_in_elseif_music_stmt2457);
            list_music_inst202=list_music_inst();

            state._fsp--;

            stream_list_music_inst.add(list_music_inst202.getTree());

            char_literal203=(Token)match(input,99,FOLLOW_99_in_elseif_music_stmt2459);  
            stream_99.add(char_literal203);


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
            // 188:70: -> ^( ELSEIF expr list_music_inst )
            {
                // src/parser/Music.g:188:73: ^( ELSEIF expr list_music_inst )
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
    // src/parser/Music.g:191:1: else_music_stmt : ELSE ^ '{' ! list_music_inst '}' !;
    public final MusicParser.else_music_stmt_return else_music_stmt() throws RecognitionException {
        MusicParser.else_music_stmt_return retval = new MusicParser.else_music_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token ELSE204=null;
        Token char_literal205=null;
        Token char_literal207=null;
        MusicParser.list_music_inst_return list_music_inst206 =null;


        AmlTree ELSE204_tree=null;
        AmlTree char_literal205_tree=null;
        AmlTree char_literal207_tree=null;

        try {
            // src/parser/Music.g:191:17: ( ELSE ^ '{' ! list_music_inst '}' !)
            // src/parser/Music.g:191:21: ELSE ^ '{' ! list_music_inst '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            ELSE204=(Token)match(input,ELSE,FOLLOW_ELSE_in_else_music_stmt2500); 
            ELSE204_tree = 
            (AmlTree)adaptor.create(ELSE204)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(ELSE204_tree, root_0);


            char_literal205=(Token)match(input,98,FOLLOW_98_in_else_music_stmt2503); 

            pushFollow(FOLLOW_list_music_inst_in_else_music_stmt2506);
            list_music_inst206=list_music_inst();

            state._fsp--;

            adaptor.addChild(root_0, list_music_inst206.getTree());

            char_literal207=(Token)match(input,99,FOLLOW_99_in_else_music_stmt2508); 

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
    // src/parser/Music.g:194:1: song : SONG ^ ( id_rule )? '{' ! ( beat ';' !)? ( speed ';' !)? ( tone ';' !)? ( transport ';' !)? ( track )+ ( drums_track )? '}' !;
    public final MusicParser.song_return song() throws RecognitionException {
        MusicParser.song_return retval = new MusicParser.song_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token SONG208=null;
        Token char_literal210=null;
        Token char_literal212=null;
        Token char_literal214=null;
        Token char_literal216=null;
        Token char_literal218=null;
        Token char_literal221=null;
        MusicParser.id_rule_return id_rule209 =null;

        MusicParser.beat_return beat211 =null;

        MusicParser.speed_return speed213 =null;

        MusicParser.tone_return tone215 =null;

        MusicParser.transport_return transport217 =null;

        MusicParser.track_return track219 =null;

        MusicParser.drums_track_return drums_track220 =null;


        AmlTree SONG208_tree=null;
        AmlTree char_literal210_tree=null;
        AmlTree char_literal212_tree=null;
        AmlTree char_literal214_tree=null;
        AmlTree char_literal216_tree=null;
        AmlTree char_literal218_tree=null;
        AmlTree char_literal221_tree=null;

        try {
            // src/parser/Music.g:194:13: ( SONG ^ ( id_rule )? '{' ! ( beat ';' !)? ( speed ';' !)? ( tone ';' !)? ( transport ';' !)? ( track )+ ( drums_track )? '}' !)
            // src/parser/Music.g:194:17: SONG ^ ( id_rule )? '{' ! ( beat ';' !)? ( speed ';' !)? ( tone ';' !)? ( transport ';' !)? ( track )+ ( drums_track )? '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            SONG208=(Token)match(input,SONG,FOLLOW_SONG_in_song2543); 
            SONG208_tree = 
            (AmlTree)adaptor.create(SONG208)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(SONG208_tree, root_0);


            // src/parser/Music.g:194:23: ( id_rule )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==ID_||LA36_0==LETTER_X) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // src/parser/Music.g:194:23: id_rule
                    {
                    pushFollow(FOLLOW_id_rule_in_song2546);
                    id_rule209=id_rule();

                    state._fsp--;

                    adaptor.addChild(root_0, id_rule209.getTree());

                    }
                    break;

            }


            char_literal210=(Token)match(input,98,FOLLOW_98_in_song2549); 

            // src/parser/Music.g:194:37: ( beat ';' !)?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==BEAT) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // src/parser/Music.g:194:38: beat ';' !
                    {
                    pushFollow(FOLLOW_beat_in_song2553);
                    beat211=beat();

                    state._fsp--;

                    adaptor.addChild(root_0, beat211.getTree());

                    char_literal212=(Token)match(input,97,FOLLOW_97_in_song2555); 

                    }
                    break;

            }


            // src/parser/Music.g:194:50: ( speed ';' !)?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==SPEED) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // src/parser/Music.g:194:51: speed ';' !
                    {
                    pushFollow(FOLLOW_speed_in_song2561);
                    speed213=speed();

                    state._fsp--;

                    adaptor.addChild(root_0, speed213.getTree());

                    char_literal214=(Token)match(input,97,FOLLOW_97_in_song2563); 

                    }
                    break;

            }


            // src/parser/Music.g:194:64: ( tone ';' !)?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==TONE) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // src/parser/Music.g:194:65: tone ';' !
                    {
                    pushFollow(FOLLOW_tone_in_song2569);
                    tone215=tone();

                    state._fsp--;

                    adaptor.addChild(root_0, tone215.getTree());

                    char_literal216=(Token)match(input,97,FOLLOW_97_in_song2571); 

                    }
                    break;

            }


            // src/parser/Music.g:194:77: ( transport ';' !)?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==TRANSPORT) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // src/parser/Music.g:194:78: transport ';' !
                    {
                    pushFollow(FOLLOW_transport_in_song2577);
                    transport217=transport();

                    state._fsp--;

                    adaptor.addChild(root_0, transport217.getTree());

                    char_literal218=(Token)match(input,97,FOLLOW_97_in_song2579); 

                    }
                    break;

            }


            // src/parser/Music.g:194:96: ( track )+
            int cnt41=0;
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==TRACK) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // src/parser/Music.g:194:97: track
            	    {
            	    pushFollow(FOLLOW_track_in_song2586);
            	    track219=track();

            	    state._fsp--;

            	    adaptor.addChild(root_0, track219.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt41 >= 1 ) break loop41;
                        EarlyExitException eee =
                            new EarlyExitException(41, input);
                        throw eee;
                }
                cnt41++;
            } while (true);


            // src/parser/Music.g:194:105: ( drums_track )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==DRUMS) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // src/parser/Music.g:194:105: drums_track
                    {
                    pushFollow(FOLLOW_drums_track_in_song2590);
                    drums_track220=drums_track();

                    state._fsp--;

                    adaptor.addChild(root_0, drums_track220.getTree());

                    }
                    break;

            }


            char_literal221=(Token)match(input,99,FOLLOW_99_in_song2593); 

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
    // src/parser/Music.g:197:1: track : TRACK ^ ( id_rule )? ( STRING )? compas_aux ;
    public final MusicParser.track_return track() throws RecognitionException {
        MusicParser.track_return retval = new MusicParser.track_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token TRACK222=null;
        Token STRING224=null;
        MusicParser.id_rule_return id_rule223 =null;

        MusicParser.compas_aux_return compas_aux225 =null;


        AmlTree TRACK222_tree=null;
        AmlTree STRING224_tree=null;

        try {
            // src/parser/Music.g:197:13: ( TRACK ^ ( id_rule )? ( STRING )? compas_aux )
            // src/parser/Music.g:197:17: TRACK ^ ( id_rule )? ( STRING )? compas_aux
            {
            root_0 = (AmlTree)adaptor.nil();


            TRACK222=(Token)match(input,TRACK,FOLLOW_TRACK_in_track2623); 
            TRACK222_tree = 
            (AmlTree)adaptor.create(TRACK222)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(TRACK222_tree, root_0);


            // src/parser/Music.g:197:24: ( id_rule )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==ID_||LA43_0==LETTER_X) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // src/parser/Music.g:197:24: id_rule
                    {
                    pushFollow(FOLLOW_id_rule_in_track2626);
                    id_rule223=id_rule();

                    state._fsp--;

                    adaptor.addChild(root_0, id_rule223.getTree());

                    }
                    break;

            }


            // src/parser/Music.g:197:33: ( STRING )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==STRING) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // src/parser/Music.g:197:33: STRING
                    {
                    STRING224=(Token)match(input,STRING,FOLLOW_STRING_in_track2629); 
                    STRING224_tree = 
                    (AmlTree)adaptor.create(STRING224)
                    ;
                    adaptor.addChild(root_0, STRING224_tree);


                    }
                    break;

            }


            pushFollow(FOLLOW_compas_aux_in_track2632);
            compas_aux225=compas_aux();

            state._fsp--;

            adaptor.addChild(root_0, compas_aux225.getTree());

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
    // src/parser/Music.g:200:1: drums_track : DRUMS ^ compas_aux ;
    public final MusicParser.drums_track_return drums_track() throws RecognitionException {
        MusicParser.drums_track_return retval = new MusicParser.drums_track_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token DRUMS226=null;
        MusicParser.compas_aux_return compas_aux227 =null;


        AmlTree DRUMS226_tree=null;

        try {
            // src/parser/Music.g:200:13: ( DRUMS ^ compas_aux )
            // src/parser/Music.g:200:17: DRUMS ^ compas_aux
            {
            root_0 = (AmlTree)adaptor.nil();


            DRUMS226=(Token)match(input,DRUMS,FOLLOW_DRUMS_in_drums_track2655); 
            DRUMS226_tree = 
            (AmlTree)adaptor.create(DRUMS226)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(DRUMS226_tree, root_0);


            pushFollow(FOLLOW_compas_aux_in_drums_track2658);
            compas_aux227=compas_aux();

            state._fsp--;

            adaptor.addChild(root_0, compas_aux227.getTree());

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
    // src/parser/Music.g:203:1: compas_aux : compas_list -> ^( COMPAS_LIST compas_list ) ;
    public final MusicParser.compas_aux_return compas_aux() throws RecognitionException {
        MusicParser.compas_aux_return retval = new MusicParser.compas_aux_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        MusicParser.compas_list_return compas_list228 =null;


        RewriteRuleSubtreeStream stream_compas_list=new RewriteRuleSubtreeStream(adaptor,"rule compas_list");
        try {
            // src/parser/Music.g:203:13: ( compas_list -> ^( COMPAS_LIST compas_list ) )
            // src/parser/Music.g:203:17: compas_list
            {
            pushFollow(FOLLOW_compas_list_in_compas_aux2682);
            compas_list228=compas_list();

            state._fsp--;

            stream_compas_list.add(compas_list228.getTree());

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
            // 203:29: -> ^( COMPAS_LIST compas_list )
            {
                // src/parser/Music.g:203:32: ^( COMPAS_LIST compas_list )
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
    // src/parser/Music.g:206:1: compas_list : ( DOUBLE_BAR !| repetition ) ( compasses | repetition )* ( DOUBLE_BAR !) ;
    public final MusicParser.compas_list_return compas_list() throws RecognitionException {
        MusicParser.compas_list_return retval = new MusicParser.compas_list_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token DOUBLE_BAR229=null;
        Token DOUBLE_BAR233=null;
        MusicParser.repetition_return repetition230 =null;

        MusicParser.compasses_return compasses231 =null;

        MusicParser.repetition_return repetition232 =null;


        AmlTree DOUBLE_BAR229_tree=null;
        AmlTree DOUBLE_BAR233_tree=null;

        try {
            // src/parser/Music.g:206:13: ( ( DOUBLE_BAR !| repetition ) ( compasses | repetition )* ( DOUBLE_BAR !) )
            // src/parser/Music.g:206:15: ( DOUBLE_BAR !| repetition ) ( compasses | repetition )* ( DOUBLE_BAR !)
            {
            root_0 = (AmlTree)adaptor.nil();


            // src/parser/Music.g:206:15: ( DOUBLE_BAR !| repetition )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==DOUBLE_BAR) ) {
                alt45=1;
            }
            else if ( (LA45_0==NUM||LA45_0==START_REPETITION) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;

            }
            switch (alt45) {
                case 1 :
                    // src/parser/Music.g:206:16: DOUBLE_BAR !
                    {
                    DOUBLE_BAR229=(Token)match(input,DOUBLE_BAR,FOLLOW_DOUBLE_BAR_in_compas_list2712); 

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:206:30: repetition
                    {
                    pushFollow(FOLLOW_repetition_in_compas_list2717);
                    repetition230=repetition();

                    state._fsp--;

                    adaptor.addChild(root_0, repetition230.getTree());

                    }
                    break;

            }


            // src/parser/Music.g:206:42: ( compasses | repetition )*
            loop46:
            do {
                int alt46=3;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==ARMOR||(LA46_0 >= BEAT && LA46_0 <= BOOL)||LA46_0==CHORD||LA46_0==DECR||LA46_0==DRUMS_NOTE_TYPE||LA46_0==FOR||(LA46_0 >= ID_ && LA46_0 <= INT)||LA46_0==LETTER_X||LA46_0==NOTE||LA46_0==NOTE_TYPE||(LA46_0 >= SONG && LA46_0 <= SPEED)||(LA46_0 >= STRING_TYPE && LA46_0 <= SUSTAIN)||LA46_0==TONE||LA46_0==WHILE||LA46_0==92) ) {
                    alt46=1;
                }
                else if ( (LA46_0==NUM||LA46_0==START_REPETITION) ) {
                    alt46=2;
                }


                switch (alt46) {
            	case 1 :
            	    // src/parser/Music.g:206:43: compasses
            	    {
            	    pushFollow(FOLLOW_compasses_in_compas_list2721);
            	    compasses231=compasses();

            	    state._fsp--;

            	    adaptor.addChild(root_0, compasses231.getTree());

            	    }
            	    break;
            	case 2 :
            	    // src/parser/Music.g:206:55: repetition
            	    {
            	    pushFollow(FOLLOW_repetition_in_compas_list2725);
            	    repetition232=repetition();

            	    state._fsp--;

            	    adaptor.addChild(root_0, repetition232.getTree());

            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);


            // src/parser/Music.g:206:68: ( DOUBLE_BAR !)
            // src/parser/Music.g:206:69: DOUBLE_BAR !
            {
            DOUBLE_BAR233=(Token)match(input,DOUBLE_BAR,FOLLOW_DOUBLE_BAR_in_compas_list2730); 

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
    // src/parser/Music.g:209:1: compasses : compas ( BAR ! compas )* ;
    public final MusicParser.compasses_return compasses() throws RecognitionException {
        MusicParser.compasses_return retval = new MusicParser.compasses_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token BAR235=null;
        MusicParser.compas_return compas234 =null;

        MusicParser.compas_return compas236 =null;


        AmlTree BAR235_tree=null;

        try {
            // src/parser/Music.g:209:13: ( compas ( BAR ! compas )* )
            // src/parser/Music.g:209:17: compas ( BAR ! compas )*
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_compas_in_compasses2757);
            compas234=compas();

            state._fsp--;

            adaptor.addChild(root_0, compas234.getTree());

            // src/parser/Music.g:209:24: ( BAR ! compas )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==BAR) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // src/parser/Music.g:209:25: BAR ! compas
            	    {
            	    BAR235=(Token)match(input,BAR,FOLLOW_BAR_in_compasses2760); 

            	    pushFollow(FOLLOW_compas_in_compasses2763);
            	    compas236=compas();

            	    state._fsp--;

            	    adaptor.addChild(root_0, compas236.getTree());

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
    // src/parser/Music.g:212:1: repetition : ( NUM LETTER_X )? START_REPETITION compasses END_REPETITION -> ^( REPETITION ( NUM )? compasses ) ;
    public final MusicParser.repetition_return repetition() throws RecognitionException {
        MusicParser.repetition_return retval = new MusicParser.repetition_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token NUM237=null;
        Token LETTER_X238=null;
        Token START_REPETITION239=null;
        Token END_REPETITION241=null;
        MusicParser.compasses_return compasses240 =null;


        AmlTree NUM237_tree=null;
        AmlTree LETTER_X238_tree=null;
        AmlTree START_REPETITION239_tree=null;
        AmlTree END_REPETITION241_tree=null;
        RewriteRuleTokenStream stream_LETTER_X=new RewriteRuleTokenStream(adaptor,"token LETTER_X");
        RewriteRuleTokenStream stream_END_REPETITION=new RewriteRuleTokenStream(adaptor,"token END_REPETITION");
        RewriteRuleTokenStream stream_START_REPETITION=new RewriteRuleTokenStream(adaptor,"token START_REPETITION");
        RewriteRuleTokenStream stream_NUM=new RewriteRuleTokenStream(adaptor,"token NUM");
        RewriteRuleSubtreeStream stream_compasses=new RewriteRuleSubtreeStream(adaptor,"rule compasses");
        try {
            // src/parser/Music.g:212:13: ( ( NUM LETTER_X )? START_REPETITION compasses END_REPETITION -> ^( REPETITION ( NUM )? compasses ) )
            // src/parser/Music.g:212:17: ( NUM LETTER_X )? START_REPETITION compasses END_REPETITION
            {
            // src/parser/Music.g:212:17: ( NUM LETTER_X )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==NUM) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // src/parser/Music.g:212:18: NUM LETTER_X
                    {
                    NUM237=(Token)match(input,NUM,FOLLOW_NUM_in_repetition2790);  
                    stream_NUM.add(NUM237);


                    LETTER_X238=(Token)match(input,LETTER_X,FOLLOW_LETTER_X_in_repetition2792);  
                    stream_LETTER_X.add(LETTER_X238);


                    }
                    break;

            }


            START_REPETITION239=(Token)match(input,START_REPETITION,FOLLOW_START_REPETITION_in_repetition2796);  
            stream_START_REPETITION.add(START_REPETITION239);


            pushFollow(FOLLOW_compasses_in_repetition2798);
            compasses240=compasses();

            state._fsp--;

            stream_compasses.add(compasses240.getTree());

            END_REPETITION241=(Token)match(input,END_REPETITION,FOLLOW_END_REPETITION_in_repetition2800);  
            stream_END_REPETITION.add(END_REPETITION241);


            // AST REWRITE
            // elements: compasses, NUM
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AmlTree)adaptor.nil();
            // 212:78: -> ^( REPETITION ( NUM )? compasses )
            {
                // src/parser/Music.g:212:81: ^( REPETITION ( NUM )? compasses )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(REPETITION, "REPETITION")
                , root_1);

                // src/parser/Music.g:212:94: ( NUM )?
                if ( stream_NUM.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_NUM.nextNode()
                    );

                }
                stream_NUM.reset();

                adaptor.addChild(root_1, stream_compasses.nextTree());

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


    public static class compas_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "compas"
    // src/parser/Music.g:215:1: compas : ( options {greedy=true; } : music_inst )+ -> ^( COMPAS ( music_inst )+ ) ;
    public final MusicParser.compas_return compas() throws RecognitionException {
        MusicParser.compas_return retval = new MusicParser.compas_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        MusicParser.music_inst_return music_inst242 =null;


        RewriteRuleSubtreeStream stream_music_inst=new RewriteRuleSubtreeStream(adaptor,"rule music_inst");
        try {
            // src/parser/Music.g:215:13: ( ( options {greedy=true; } : music_inst )+ -> ^( COMPAS ( music_inst )+ ) )
            // src/parser/Music.g:215:16: ( options {greedy=true; } : music_inst )+
            {
            // src/parser/Music.g:215:16: ( options {greedy=true; } : music_inst )+
            int cnt49=0;
            loop49:
            do {
                int alt49=2;
                switch ( input.LA(1) ) {
                case CHORD:
                    {
                    alt49=1;
                    }
                    break;
                case TONE:
                    {
                    alt49=1;
                    }
                    break;
                case BEAT:
                    {
                    alt49=1;
                    }
                    break;
                case SPEED:
                    {
                    alt49=1;
                    }
                    break;
                case INSTRUMENT:
                    {
                    alt49=1;
                    }
                    break;
                case ID_:
                    {
                    alt49=1;
                    }
                    break;
                case LETTER_X:
                    {
                    alt49=1;
                    }
                    break;
                case INCR:
                    {
                    alt49=1;
                    }
                    break;
                case DECR:
                    {
                    alt49=1;
                    }
                    break;
                case WHILE:
                    {
                    alt49=1;
                    }
                    break;
                case FOR:
                    {
                    alt49=1;
                    }
                    break;
                case IF:
                    {
                    alt49=1;
                    }
                    break;
                case SONG:
                    {
                    alt49=1;
                    }
                    break;
                case DRUMS_NOTE_TYPE:
                    {
                    alt49=1;
                    }
                    break;
                case 92:
                    {
                    alt49=1;
                    }
                    break;
                case ARMOR:
                case BEMOL:
                case SUSTAIN:
                    {
                    alt49=1;
                    }
                    break;
                case NOTE:
                    {
                    alt49=1;
                    }
                    break;
                case BOOL:
                case INT:
                case NOTE_TYPE:
                case STRING_TYPE:
                    {
                    alt49=1;
                    }
                    break;

                }

                switch (alt49) {
            	case 1 :
            	    // src/parser/Music.g:215:42: music_inst
            	    {
            	    pushFollow(FOLLOW_music_inst_in_compas2851);
            	    music_inst242=music_inst();

            	    state._fsp--;

            	    stream_music_inst.add(music_inst242.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt49 >= 1 ) break loop49;
                        EarlyExitException eee =
                            new EarlyExitException(49, input);
                        throw eee;
                }
                cnt49++;
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
            // 215:58: -> ^( COMPAS ( music_inst )+ )
            {
                // src/parser/Music.g:215:61: ^( COMPAS ( music_inst )+ )
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
    // src/parser/Music.g:218:1: tone : TONE ^ NUM ( SUSTAIN | BEMOL ) ;
    public final MusicParser.tone_return tone() throws RecognitionException {
        MusicParser.tone_return retval = new MusicParser.tone_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token TONE243=null;
        Token NUM244=null;
        Token set245=null;

        AmlTree TONE243_tree=null;
        AmlTree NUM244_tree=null;
        AmlTree set245_tree=null;

        try {
            // src/parser/Music.g:218:13: ( TONE ^ NUM ( SUSTAIN | BEMOL ) )
            // src/parser/Music.g:218:17: TONE ^ NUM ( SUSTAIN | BEMOL )
            {
            root_0 = (AmlTree)adaptor.nil();


            TONE243=(Token)match(input,TONE,FOLLOW_TONE_in_tone2895); 
            TONE243_tree = 
            (AmlTree)adaptor.create(TONE243)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(TONE243_tree, root_0);


            NUM244=(Token)match(input,NUM,FOLLOW_NUM_in_tone2898); 
            NUM244_tree = 
            (AmlTree)adaptor.create(NUM244)
            ;
            adaptor.addChild(root_0, NUM244_tree);


            set245=(Token)input.LT(1);

            if ( input.LA(1)==BEMOL||input.LA(1)==SUSTAIN ) {
                input.consume();
                adaptor.addChild(root_0, 
                (AmlTree)adaptor.create(set245)
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
    // src/parser/Music.g:221:1: drumsnotes_group : drumsnotes ( '.' FIGURE ( DOT )? )? ( TIE )? -> ^( DRUMSNOTES drumsnotes ( FIGURE )? ( DOT )? ( TIE )? ) ;
    public final MusicParser.drumsnotes_group_return drumsnotes_group() throws RecognitionException {
        MusicParser.drumsnotes_group_return retval = new MusicParser.drumsnotes_group_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal247=null;
        Token FIGURE248=null;
        Token DOT249=null;
        Token TIE250=null;
        MusicParser.drumsnotes_return drumsnotes246 =null;


        AmlTree char_literal247_tree=null;
        AmlTree FIGURE248_tree=null;
        AmlTree DOT249_tree=null;
        AmlTree TIE250_tree=null;
        RewriteRuleTokenStream stream_95=new RewriteRuleTokenStream(adaptor,"token 95");
        RewriteRuleTokenStream stream_FIGURE=new RewriteRuleTokenStream(adaptor,"token FIGURE");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_TIE=new RewriteRuleTokenStream(adaptor,"token TIE");
        RewriteRuleSubtreeStream stream_drumsnotes=new RewriteRuleSubtreeStream(adaptor,"rule drumsnotes");
        try {
            // src/parser/Music.g:221:18: ( drumsnotes ( '.' FIGURE ( DOT )? )? ( TIE )? -> ^( DRUMSNOTES drumsnotes ( FIGURE )? ( DOT )? ( TIE )? ) )
            // src/parser/Music.g:221:20: drumsnotes ( '.' FIGURE ( DOT )? )? ( TIE )?
            {
            pushFollow(FOLLOW_drumsnotes_in_drumsnotes_group2927);
            drumsnotes246=drumsnotes();

            state._fsp--;

            stream_drumsnotes.add(drumsnotes246.getTree());

            // src/parser/Music.g:221:31: ( '.' FIGURE ( DOT )? )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==95) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // src/parser/Music.g:221:32: '.' FIGURE ( DOT )?
                    {
                    char_literal247=(Token)match(input,95,FOLLOW_95_in_drumsnotes_group2930);  
                    stream_95.add(char_literal247);


                    FIGURE248=(Token)match(input,FIGURE,FOLLOW_FIGURE_in_drumsnotes_group2932);  
                    stream_FIGURE.add(FIGURE248);


                    // src/parser/Music.g:221:43: ( DOT )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==DOT) ) {
                        alt50=1;
                    }
                    switch (alt50) {
                        case 1 :
                            // src/parser/Music.g:221:43: DOT
                            {
                            DOT249=(Token)match(input,DOT,FOLLOW_DOT_in_drumsnotes_group2934);  
                            stream_DOT.add(DOT249);


                            }
                            break;

                    }


                    }
                    break;

            }


            // src/parser/Music.g:221:50: ( TIE )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==TIE) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // src/parser/Music.g:221:50: TIE
                    {
                    TIE250=(Token)match(input,TIE,FOLLOW_TIE_in_drumsnotes_group2939);  
                    stream_TIE.add(TIE250);


                    }
                    break;

            }


            // AST REWRITE
            // elements: TIE, FIGURE, DOT, drumsnotes
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AmlTree)adaptor.nil();
            // 221:55: -> ^( DRUMSNOTES drumsnotes ( FIGURE )? ( DOT )? ( TIE )? )
            {
                // src/parser/Music.g:221:58: ^( DRUMSNOTES drumsnotes ( FIGURE )? ( DOT )? ( TIE )? )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(DRUMSNOTES, "DRUMSNOTES")
                , root_1);

                adaptor.addChild(root_1, stream_drumsnotes.nextTree());

                // src/parser/Music.g:221:82: ( FIGURE )?
                if ( stream_FIGURE.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_FIGURE.nextNode()
                    );

                }
                stream_FIGURE.reset();

                // src/parser/Music.g:221:90: ( DOT )?
                if ( stream_DOT.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_DOT.nextNode()
                    );

                }
                stream_DOT.reset();

                // src/parser/Music.g:221:95: ( TIE )?
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
    // src/parser/Music.g:224:1: notes_group : notes_type ( '.' FIGURE ( DOT )? )? ( TIE )? -> ^( NOTES notes_type ( FIGURE )? ( DOT )? ( TIE )? ) ;
    public final MusicParser.notes_group_return notes_group() throws RecognitionException {
        MusicParser.notes_group_return retval = new MusicParser.notes_group_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal252=null;
        Token FIGURE253=null;
        Token DOT254=null;
        Token TIE255=null;
        MusicParser.notes_type_return notes_type251 =null;


        AmlTree char_literal252_tree=null;
        AmlTree FIGURE253_tree=null;
        AmlTree DOT254_tree=null;
        AmlTree TIE255_tree=null;
        RewriteRuleTokenStream stream_95=new RewriteRuleTokenStream(adaptor,"token 95");
        RewriteRuleTokenStream stream_FIGURE=new RewriteRuleTokenStream(adaptor,"token FIGURE");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_TIE=new RewriteRuleTokenStream(adaptor,"token TIE");
        RewriteRuleSubtreeStream stream_notes_type=new RewriteRuleSubtreeStream(adaptor,"rule notes_type");
        try {
            // src/parser/Music.g:224:13: ( notes_type ( '.' FIGURE ( DOT )? )? ( TIE )? -> ^( NOTES notes_type ( FIGURE )? ( DOT )? ( TIE )? ) )
            // src/parser/Music.g:224:17: notes_type ( '.' FIGURE ( DOT )? )? ( TIE )?
            {
            pushFollow(FOLLOW_notes_type_in_notes_group2980);
            notes_type251=notes_type();

            state._fsp--;

            stream_notes_type.add(notes_type251.getTree());

            // src/parser/Music.g:224:28: ( '.' FIGURE ( DOT )? )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==95) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // src/parser/Music.g:224:29: '.' FIGURE ( DOT )?
                    {
                    char_literal252=(Token)match(input,95,FOLLOW_95_in_notes_group2983);  
                    stream_95.add(char_literal252);


                    FIGURE253=(Token)match(input,FIGURE,FOLLOW_FIGURE_in_notes_group2985);  
                    stream_FIGURE.add(FIGURE253);


                    // src/parser/Music.g:224:40: ( DOT )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==DOT) ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // src/parser/Music.g:224:40: DOT
                            {
                            DOT254=(Token)match(input,DOT,FOLLOW_DOT_in_notes_group2987);  
                            stream_DOT.add(DOT254);


                            }
                            break;

                    }


                    }
                    break;

            }


            // src/parser/Music.g:224:47: ( TIE )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==TIE) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // src/parser/Music.g:224:47: TIE
                    {
                    TIE255=(Token)match(input,TIE,FOLLOW_TIE_in_notes_group2992);  
                    stream_TIE.add(TIE255);


                    }
                    break;

            }


            // AST REWRITE
            // elements: TIE, DOT, FIGURE, notes_type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AmlTree)adaptor.nil();
            // 224:52: -> ^( NOTES notes_type ( FIGURE )? ( DOT )? ( TIE )? )
            {
                // src/parser/Music.g:224:55: ^( NOTES notes_type ( FIGURE )? ( DOT )? ( TIE )? )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(NOTES, "NOTES")
                , root_1);

                adaptor.addChild(root_1, stream_notes_type.nextTree());

                // src/parser/Music.g:224:74: ( FIGURE )?
                if ( stream_FIGURE.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_FIGURE.nextNode()
                    );

                }
                stream_FIGURE.reset();

                // src/parser/Music.g:224:82: ( DOT )?
                if ( stream_DOT.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_DOT.nextNode()
                    );

                }
                stream_DOT.reset();

                // src/parser/Music.g:224:87: ( TIE )?
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
    // $ANTLR end "notes_group"


    public static class drumsnotes_variable_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "drumsnotes_variable"
    // src/parser/Music.g:227:1: drumsnotes_variable : drumsnotes ( '.' FIGURE ( DOT )? )? -> ^( DRUMSNOTES drumsnotes ( FIGURE )? ( DOT )? ) ;
    public final MusicParser.drumsnotes_variable_return drumsnotes_variable() throws RecognitionException {
        MusicParser.drumsnotes_variable_return retval = new MusicParser.drumsnotes_variable_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal257=null;
        Token FIGURE258=null;
        Token DOT259=null;
        MusicParser.drumsnotes_return drumsnotes256 =null;


        AmlTree char_literal257_tree=null;
        AmlTree FIGURE258_tree=null;
        AmlTree DOT259_tree=null;
        RewriteRuleTokenStream stream_95=new RewriteRuleTokenStream(adaptor,"token 95");
        RewriteRuleTokenStream stream_FIGURE=new RewriteRuleTokenStream(adaptor,"token FIGURE");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_drumsnotes=new RewriteRuleSubtreeStream(adaptor,"rule drumsnotes");
        try {
            // src/parser/Music.g:227:22: ( drumsnotes ( '.' FIGURE ( DOT )? )? -> ^( DRUMSNOTES drumsnotes ( FIGURE )? ( DOT )? ) )
            // src/parser/Music.g:227:26: drumsnotes ( '.' FIGURE ( DOT )? )?
            {
            pushFollow(FOLLOW_drumsnotes_in_drumsnotes_variable3034);
            drumsnotes256=drumsnotes();

            state._fsp--;

            stream_drumsnotes.add(drumsnotes256.getTree());

            // src/parser/Music.g:227:37: ( '.' FIGURE ( DOT )? )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==95) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // src/parser/Music.g:227:38: '.' FIGURE ( DOT )?
                    {
                    char_literal257=(Token)match(input,95,FOLLOW_95_in_drumsnotes_variable3037);  
                    stream_95.add(char_literal257);


                    FIGURE258=(Token)match(input,FIGURE,FOLLOW_FIGURE_in_drumsnotes_variable3039);  
                    stream_FIGURE.add(FIGURE258);


                    // src/parser/Music.g:227:49: ( DOT )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==DOT) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // src/parser/Music.g:227:49: DOT
                            {
                            DOT259=(Token)match(input,DOT,FOLLOW_DOT_in_drumsnotes_variable3041);  
                            stream_DOT.add(DOT259);


                            }
                            break;

                    }


                    }
                    break;

            }


            // AST REWRITE
            // elements: FIGURE, DOT, drumsnotes
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AmlTree)adaptor.nil();
            // 227:56: -> ^( DRUMSNOTES drumsnotes ( FIGURE )? ( DOT )? )
            {
                // src/parser/Music.g:227:59: ^( DRUMSNOTES drumsnotes ( FIGURE )? ( DOT )? )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(DRUMSNOTES, "DRUMSNOTES")
                , root_1);

                adaptor.addChild(root_1, stream_drumsnotes.nextTree());

                // src/parser/Music.g:227:83: ( FIGURE )?
                if ( stream_FIGURE.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_FIGURE.nextNode()
                    );

                }
                stream_FIGURE.reset();

                // src/parser/Music.g:227:91: ( DOT )?
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
    // src/parser/Music.g:230:1: notes_variable : notes_type ( '.' FIGURE ( DOT )? )? -> ^( NOTES notes_type ( FIGURE )? ( DOT )? ) ;
    public final MusicParser.notes_variable_return notes_variable() throws RecognitionException {
        MusicParser.notes_variable_return retval = new MusicParser.notes_variable_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal261=null;
        Token FIGURE262=null;
        Token DOT263=null;
        MusicParser.notes_type_return notes_type260 =null;


        AmlTree char_literal261_tree=null;
        AmlTree FIGURE262_tree=null;
        AmlTree DOT263_tree=null;
        RewriteRuleTokenStream stream_95=new RewriteRuleTokenStream(adaptor,"token 95");
        RewriteRuleTokenStream stream_FIGURE=new RewriteRuleTokenStream(adaptor,"token FIGURE");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_notes_type=new RewriteRuleSubtreeStream(adaptor,"rule notes_type");
        try {
            // src/parser/Music.g:230:17: ( notes_type ( '.' FIGURE ( DOT )? )? -> ^( NOTES notes_type ( FIGURE )? ( DOT )? ) )
            // src/parser/Music.g:230:21: notes_type ( '.' FIGURE ( DOT )? )?
            {
            pushFollow(FOLLOW_notes_type_in_notes_variable3086);
            notes_type260=notes_type();

            state._fsp--;

            stream_notes_type.add(notes_type260.getTree());

            // src/parser/Music.g:230:32: ( '.' FIGURE ( DOT )? )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==95) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // src/parser/Music.g:230:33: '.' FIGURE ( DOT )?
                    {
                    char_literal261=(Token)match(input,95,FOLLOW_95_in_notes_variable3089);  
                    stream_95.add(char_literal261);


                    FIGURE262=(Token)match(input,FIGURE,FOLLOW_FIGURE_in_notes_variable3091);  
                    stream_FIGURE.add(FIGURE262);


                    // src/parser/Music.g:230:44: ( DOT )?
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==DOT) ) {
                        alt58=1;
                    }
                    switch (alt58) {
                        case 1 :
                            // src/parser/Music.g:230:44: DOT
                            {
                            DOT263=(Token)match(input,DOT,FOLLOW_DOT_in_notes_variable3093);  
                            stream_DOT.add(DOT263);


                            }
                            break;

                    }


                    }
                    break;

            }


            // AST REWRITE
            // elements: notes_type, FIGURE, DOT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AmlTree)adaptor.nil();
            // 230:51: -> ^( NOTES notes_type ( FIGURE )? ( DOT )? )
            {
                // src/parser/Music.g:230:54: ^( NOTES notes_type ( FIGURE )? ( DOT )? )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(NOTES, "NOTES")
                , root_1);

                adaptor.addChild(root_1, stream_notes_type.nextTree());

                // src/parser/Music.g:230:73: ( FIGURE )?
                if ( stream_FIGURE.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_FIGURE.nextNode()
                    );

                }
                stream_FIGURE.reset();

                // src/parser/Music.g:230:81: ( DOT )?
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
    // $ANTLR end "notes_variable"


    public static class notes_type_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "notes_type"
    // src/parser/Music.g:233:1: notes_type : ( chord | notes );
    public final MusicParser.notes_type_return notes_type() throws RecognitionException {
        MusicParser.notes_type_return retval = new MusicParser.notes_type_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        MusicParser.chord_return chord264 =null;

        MusicParser.notes_return notes265 =null;



        try {
            // src/parser/Music.g:233:13: ( chord | notes )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==CHORD) ) {
                alt60=1;
            }
            else if ( (LA60_0==ARMOR||LA60_0==BEMOL||LA60_0==NOTE||LA60_0==SUSTAIN||LA60_0==92) ) {
                alt60=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;

            }
            switch (alt60) {
                case 1 :
                    // src/parser/Music.g:233:15: chord
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_chord_in_notes_type3136);
                    chord264=chord();

                    state._fsp--;

                    adaptor.addChild(root_0, chord264.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:233:23: notes
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_notes_in_notes_type3140);
                    notes265=notes();

                    state._fsp--;

                    adaptor.addChild(root_0, notes265.getTree());

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
    // src/parser/Music.g:236:1: chord : CHORD ^ '(' ! note ( MINOR | PLUS | DIMINUTION )? ( SEVENTH | MAJ7 )? ')' !;
    public final MusicParser.chord_return chord() throws RecognitionException {
        MusicParser.chord_return retval = new MusicParser.chord_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token CHORD266=null;
        Token char_literal267=null;
        Token set269=null;
        Token set270=null;
        Token char_literal271=null;
        MusicParser.note_return note268 =null;


        AmlTree CHORD266_tree=null;
        AmlTree char_literal267_tree=null;
        AmlTree set269_tree=null;
        AmlTree set270_tree=null;
        AmlTree char_literal271_tree=null;

        try {
            // src/parser/Music.g:236:13: ( CHORD ^ '(' ! note ( MINOR | PLUS | DIMINUTION )? ( SEVENTH | MAJ7 )? ')' !)
            // src/parser/Music.g:236:17: CHORD ^ '(' ! note ( MINOR | PLUS | DIMINUTION )? ( SEVENTH | MAJ7 )? ')' !
            {
            root_0 = (AmlTree)adaptor.nil();


            CHORD266=(Token)match(input,CHORD,FOLLOW_CHORD_in_chord3169); 
            CHORD266_tree = 
            (AmlTree)adaptor.create(CHORD266)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(CHORD266_tree, root_0);


            char_literal267=(Token)match(input,92,FOLLOW_92_in_chord3172); 

            pushFollow(FOLLOW_note_in_chord3175);
            note268=note();

            state._fsp--;

            adaptor.addChild(root_0, note268.getTree());

            // src/parser/Music.g:236:34: ( MINOR | PLUS | DIMINUTION )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==DIMINUTION||LA61_0==MINOR||LA61_0==PLUS) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // src/parser/Music.g:
                    {
                    set269=(Token)input.LT(1);

                    if ( input.LA(1)==DIMINUTION||input.LA(1)==MINOR||input.LA(1)==PLUS ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (AmlTree)adaptor.create(set269)
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


            // src/parser/Music.g:236:59: ( SEVENTH | MAJ7 )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==MAJ7||LA62_0==SEVENTH) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // src/parser/Music.g:
                    {
                    set270=(Token)input.LT(1);

                    if ( input.LA(1)==MAJ7||input.LA(1)==SEVENTH ) {
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
                    break;

            }


            char_literal271=(Token)match(input,93,FOLLOW_93_in_chord3195); 

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
    // src/parser/Music.g:239:1: notes : ( '(' ( note )+ ')' | note ) -> ^( NOTE_LIST ( note )+ ) ;
    public final MusicParser.notes_return notes() throws RecognitionException {
        MusicParser.notes_return retval = new MusicParser.notes_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal272=null;
        Token char_literal274=null;
        MusicParser.note_return note273 =null;

        MusicParser.note_return note275 =null;


        AmlTree char_literal272_tree=null;
        AmlTree char_literal274_tree=null;
        RewriteRuleTokenStream stream_93=new RewriteRuleTokenStream(adaptor,"token 93");
        RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
        RewriteRuleSubtreeStream stream_note=new RewriteRuleSubtreeStream(adaptor,"rule note");
        try {
            // src/parser/Music.g:239:13: ( ( '(' ( note )+ ')' | note ) -> ^( NOTE_LIST ( note )+ ) )
            // src/parser/Music.g:239:17: ( '(' ( note )+ ')' | note )
            {
            // src/parser/Music.g:239:17: ( '(' ( note )+ ')' | note )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==92) ) {
                alt64=1;
            }
            else if ( (LA64_0==ARMOR||LA64_0==BEMOL||LA64_0==NOTE||LA64_0==SUSTAIN) ) {
                alt64=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;

            }
            switch (alt64) {
                case 1 :
                    // src/parser/Music.g:239:19: '(' ( note )+ ')'
                    {
                    char_literal272=(Token)match(input,92,FOLLOW_92_in_notes3227);  
                    stream_92.add(char_literal272);


                    // src/parser/Music.g:239:23: ( note )+
                    int cnt63=0;
                    loop63:
                    do {
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( (LA63_0==ARMOR||LA63_0==BEMOL||LA63_0==NOTE||LA63_0==SUSTAIN) ) {
                            alt63=1;
                        }


                        switch (alt63) {
                    	case 1 :
                    	    // src/parser/Music.g:239:24: note
                    	    {
                    	    pushFollow(FOLLOW_note_in_notes3230);
                    	    note273=note();

                    	    state._fsp--;

                    	    stream_note.add(note273.getTree());

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


                    char_literal274=(Token)match(input,93,FOLLOW_93_in_notes3234);  
                    stream_93.add(char_literal274);


                    }
                    break;
                case 2 :
                    // src/parser/Music.g:239:38: note
                    {
                    pushFollow(FOLLOW_note_in_notes3239);
                    note275=note();

                    state._fsp--;

                    stream_note.add(note275.getTree());

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
            // 239:44: -> ^( NOTE_LIST ( note )+ )
            {
                // src/parser/Music.g:239:47: ^( NOTE_LIST ( note )+ )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(NOTE_LIST, "NOTE_LIST")
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


    public static class drumsnotes_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "drumsnotes"
    // src/parser/Music.g:242:1: drumsnotes : ( '(' ( drums )+ ')' | drums ) -> ^( DRUMSNOTE_LIST ( drums )+ ) ;
    public final MusicParser.drumsnotes_return drumsnotes() throws RecognitionException {
        MusicParser.drumsnotes_return retval = new MusicParser.drumsnotes_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal276=null;
        Token char_literal278=null;
        MusicParser.drums_return drums277 =null;

        MusicParser.drums_return drums279 =null;


        AmlTree char_literal276_tree=null;
        AmlTree char_literal278_tree=null;
        RewriteRuleTokenStream stream_93=new RewriteRuleTokenStream(adaptor,"token 93");
        RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
        RewriteRuleSubtreeStream stream_drums=new RewriteRuleSubtreeStream(adaptor,"rule drums");
        try {
            // src/parser/Music.g:242:13: ( ( '(' ( drums )+ ')' | drums ) -> ^( DRUMSNOTE_LIST ( drums )+ ) )
            // src/parser/Music.g:242:17: ( '(' ( drums )+ ')' | drums )
            {
            // src/parser/Music.g:242:17: ( '(' ( drums )+ ')' | drums )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==92) ) {
                alt66=1;
            }
            else if ( (LA66_0==DRUMS_NOTE_TYPE) ) {
                alt66=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;

            }
            switch (alt66) {
                case 1 :
                    // src/parser/Music.g:242:19: '(' ( drums )+ ')'
                    {
                    char_literal276=(Token)match(input,92,FOLLOW_92_in_drumsnotes3275);  
                    stream_92.add(char_literal276);


                    // src/parser/Music.g:242:23: ( drums )+
                    int cnt65=0;
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==DRUMS_NOTE_TYPE) ) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // src/parser/Music.g:242:24: drums
                    	    {
                    	    pushFollow(FOLLOW_drums_in_drumsnotes3278);
                    	    drums277=drums();

                    	    state._fsp--;

                    	    stream_drums.add(drums277.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt65 >= 1 ) break loop65;
                                EarlyExitException eee =
                                    new EarlyExitException(65, input);
                                throw eee;
                        }
                        cnt65++;
                    } while (true);


                    char_literal278=(Token)match(input,93,FOLLOW_93_in_drumsnotes3282);  
                    stream_93.add(char_literal278);


                    }
                    break;
                case 2 :
                    // src/parser/Music.g:242:39: drums
                    {
                    pushFollow(FOLLOW_drums_in_drumsnotes3287);
                    drums279=drums();

                    state._fsp--;

                    stream_drums.add(drums279.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: drums
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AmlTree)adaptor.nil();
            // 242:46: -> ^( DRUMSNOTE_LIST ( drums )+ )
            {
                // src/parser/Music.g:242:49: ^( DRUMSNOTE_LIST ( drums )+ )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(DRUMSNOTE_LIST, "DRUMSNOTE_LIST")
                , root_1);

                if ( !(stream_drums.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_drums.hasNext() ) {
                    adaptor.addChild(root_1, stream_drums.nextTree());

                }
                stream_drums.reset();

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


    public static class drums_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "drums"
    // src/parser/Music.g:245:1: drums : DRUMS_NOTE_TYPE ! '(' ! num_expr ^ ')' !;
    public final MusicParser.drums_return drums() throws RecognitionException {
        MusicParser.drums_return retval = new MusicParser.drums_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token DRUMS_NOTE_TYPE280=null;
        Token char_literal281=null;
        Token char_literal283=null;
        MusicParser.num_expr_return num_expr282 =null;


        AmlTree DRUMS_NOTE_TYPE280_tree=null;
        AmlTree char_literal281_tree=null;
        AmlTree char_literal283_tree=null;

        try {
            // src/parser/Music.g:245:13: ( DRUMS_NOTE_TYPE ! '(' ! num_expr ^ ')' !)
            // src/parser/Music.g:245:17: DRUMS_NOTE_TYPE ! '(' ! num_expr ^ ')' !
            {
            root_0 = (AmlTree)adaptor.nil();


            DRUMS_NOTE_TYPE280=(Token)match(input,DRUMS_NOTE_TYPE,FOLLOW_DRUMS_NOTE_TYPE_in_drums3326); 

            char_literal281=(Token)match(input,92,FOLLOW_92_in_drums3329); 

            pushFollow(FOLLOW_num_expr_in_drums3332);
            num_expr282=num_expr();

            state._fsp--;

            root_0 = (AmlTree)adaptor.becomeRoot(num_expr282.getTree(), root_0);

            char_literal283=(Token)match(input,93,FOLLOW_93_in_drums3335); 

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
    // $ANTLR end "drums"


    public static class note_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "note"
    // src/parser/Music.g:248:1: note : ( BEMOL | SUSTAIN | ARMOR )? NOTE ^ ( NUM )? ;
    public final MusicParser.note_return note() throws RecognitionException {
        MusicParser.note_return retval = new MusicParser.note_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token set284=null;
        Token NOTE285=null;
        Token NUM286=null;

        AmlTree set284_tree=null;
        AmlTree NOTE285_tree=null;
        AmlTree NUM286_tree=null;

        try {
            // src/parser/Music.g:248:13: ( ( BEMOL | SUSTAIN | ARMOR )? NOTE ^ ( NUM )? )
            // src/parser/Music.g:248:17: ( BEMOL | SUSTAIN | ARMOR )? NOTE ^ ( NUM )?
            {
            root_0 = (AmlTree)adaptor.nil();


            // src/parser/Music.g:248:17: ( BEMOL | SUSTAIN | ARMOR )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==ARMOR||LA67_0==BEMOL||LA67_0==SUSTAIN) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // src/parser/Music.g:
                    {
                    set284=(Token)input.LT(1);

                    if ( input.LA(1)==ARMOR||input.LA(1)==BEMOL||input.LA(1)==SUSTAIN ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (AmlTree)adaptor.create(set284)
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


            NOTE285=(Token)match(input,NOTE,FOLLOW_NOTE_in_note3379); 
            NOTE285_tree = 
            (AmlTree)adaptor.create(NOTE285)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(NOTE285_tree, root_0);


            // src/parser/Music.g:248:50: ( NUM )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==NUM) ) {
                int LA68_1 = input.LA(2);

                if ( (LA68_1==LETTER_X) ) {
                    int LA68_3 = input.LA(3);

                    if ( (LA68_3==ASSIG||LA68_3==DECR||LA68_3==DIVIDE_ASSIG||LA68_3==INCR||LA68_3==MINUS_ASSIG||LA68_3==MOD_ASSIG||LA68_3==PLUS_ASSIG||LA68_3==PROD_ASSIG||LA68_3==92||LA68_3==95) ) {
                        alt68=1;
                    }
                }
                else if ( (LA68_1==ARMOR||(LA68_1 >= BAR && LA68_1 <= BOOL)||LA68_1==CHORD||(LA68_1 >= DECR && LA68_1 <= DIMINUTION)||LA68_1==DOUBLE_BAR||LA68_1==DRUMS_NOTE_TYPE||LA68_1==END_REPETITION||LA68_1==FOR||(LA68_1 >= ID_ && LA68_1 <= INT)||(LA68_1 >= MAJ7 && LA68_1 <= MINOR)||LA68_1==NOTE||LA68_1==NOTE_TYPE||LA68_1==NUM||LA68_1==PLUS||(LA68_1 >= SEVENTH && LA68_1 <= START_REPETITION)||(LA68_1 >= STRING_TYPE && LA68_1 <= TONE)||LA68_1==WHILE||(LA68_1 >= 92 && LA68_1 <= 95)||LA68_1==97||LA68_1==99) ) {
                    alt68=1;
                }
            }
            switch (alt68) {
                case 1 :
                    // src/parser/Music.g:248:51: NUM
                    {
                    NUM286=(Token)match(input,NUM,FOLLOW_NUM_in_note3383); 
                    NUM286_tree = 
                    (AmlTree)adaptor.create(NUM286)
                    ;
                    adaptor.addChild(root_0, NUM286_tree);


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
    // src/parser/Music.g:252:1: expr : boolterm ( OR ^ boolterm )* ;
    public final MusicParser.expr_return expr() throws RecognitionException {
        MusicParser.expr_return retval = new MusicParser.expr_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token OR288=null;
        MusicParser.boolterm_return boolterm287 =null;

        MusicParser.boolterm_return boolterm289 =null;


        AmlTree OR288_tree=null;

        try {
            // src/parser/Music.g:252:9: ( boolterm ( OR ^ boolterm )* )
            // src/parser/Music.g:252:13: boolterm ( OR ^ boolterm )*
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_boolterm_in_expr3412);
            boolterm287=boolterm();

            state._fsp--;

            adaptor.addChild(root_0, boolterm287.getTree());

            // src/parser/Music.g:252:22: ( OR ^ boolterm )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==OR) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // src/parser/Music.g:252:23: OR ^ boolterm
            	    {
            	    OR288=(Token)match(input,OR,FOLLOW_OR_in_expr3415); 
            	    OR288_tree = 
            	    (AmlTree)adaptor.create(OR288)
            	    ;
            	    root_0 = (AmlTree)adaptor.becomeRoot(OR288_tree, root_0);


            	    pushFollow(FOLLOW_boolterm_in_expr3418);
            	    boolterm289=boolterm();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolterm289.getTree());

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
    // $ANTLR end "expr"


    public static class boolterm_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolterm"
    // src/parser/Music.g:255:1: boolterm : boolfact ( AND ^ boolfact )* ;
    public final MusicParser.boolterm_return boolterm() throws RecognitionException {
        MusicParser.boolterm_return retval = new MusicParser.boolterm_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token AND291=null;
        MusicParser.boolfact_return boolfact290 =null;

        MusicParser.boolfact_return boolfact292 =null;


        AmlTree AND291_tree=null;

        try {
            // src/parser/Music.g:255:13: ( boolfact ( AND ^ boolfact )* )
            // src/parser/Music.g:255:17: boolfact ( AND ^ boolfact )*
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_boolfact_in_boolterm3436);
            boolfact290=boolfact();

            state._fsp--;

            adaptor.addChild(root_0, boolfact290.getTree());

            // src/parser/Music.g:255:26: ( AND ^ boolfact )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==AND) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // src/parser/Music.g:255:27: AND ^ boolfact
            	    {
            	    AND291=(Token)match(input,AND,FOLLOW_AND_in_boolterm3439); 
            	    AND291_tree = 
            	    (AmlTree)adaptor.create(AND291)
            	    ;
            	    root_0 = (AmlTree)adaptor.becomeRoot(AND291_tree, root_0);


            	    pushFollow(FOLLOW_boolfact_in_boolterm3442);
            	    boolfact292=boolfact();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolfact292.getTree());

            	    }
            	    break;

            	default :
            	    break loop70;
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
    // src/parser/Music.g:258:1: boolfact : num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? ;
    public final MusicParser.boolfact_return boolfact() throws RecognitionException {
        MusicParser.boolfact_return retval = new MusicParser.boolfact_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token EQUAL294=null;
        Token NOT_EQUAL295=null;
        Token LT296=null;
        Token LE297=null;
        Token GT298=null;
        Token GE299=null;
        MusicParser.num_expr_return num_expr293 =null;

        MusicParser.num_expr_return num_expr300 =null;


        AmlTree EQUAL294_tree=null;
        AmlTree NOT_EQUAL295_tree=null;
        AmlTree LT296_tree=null;
        AmlTree LE297_tree=null;
        AmlTree GT298_tree=null;
        AmlTree GE299_tree=null;

        try {
            // src/parser/Music.g:258:13: ( num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? )
            // src/parser/Music.g:258:17: num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_num_expr_in_boolfact3464);
            num_expr293=num_expr();

            state._fsp--;

            adaptor.addChild(root_0, num_expr293.getTree());

            // src/parser/Music.g:258:26: ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==EQUAL||(LA72_0 >= GE && LA72_0 <= GT)||LA72_0==LE||LA72_0==LT||LA72_0==NOT_EQUAL) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // src/parser/Music.g:258:27: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr
                    {
                    // src/parser/Music.g:258:27: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^)
                    int alt71=6;
                    switch ( input.LA(1) ) {
                    case EQUAL:
                        {
                        alt71=1;
                        }
                        break;
                    case NOT_EQUAL:
                        {
                        alt71=2;
                        }
                        break;
                    case LT:
                        {
                        alt71=3;
                        }
                        break;
                    case LE:
                        {
                        alt71=4;
                        }
                        break;
                    case GT:
                        {
                        alt71=5;
                        }
                        break;
                    case GE:
                        {
                        alt71=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 71, 0, input);

                        throw nvae;

                    }

                    switch (alt71) {
                        case 1 :
                            // src/parser/Music.g:258:28: EQUAL ^
                            {
                            EQUAL294=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_boolfact3468); 
                            EQUAL294_tree = 
                            (AmlTree)adaptor.create(EQUAL294)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(EQUAL294_tree, root_0);


                            }
                            break;
                        case 2 :
                            // src/parser/Music.g:258:37: NOT_EQUAL ^
                            {
                            NOT_EQUAL295=(Token)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_boolfact3473); 
                            NOT_EQUAL295_tree = 
                            (AmlTree)adaptor.create(NOT_EQUAL295)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(NOT_EQUAL295_tree, root_0);


                            }
                            break;
                        case 3 :
                            // src/parser/Music.g:258:50: LT ^
                            {
                            LT296=(Token)match(input,LT,FOLLOW_LT_in_boolfact3478); 
                            LT296_tree = 
                            (AmlTree)adaptor.create(LT296)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(LT296_tree, root_0);


                            }
                            break;
                        case 4 :
                            // src/parser/Music.g:258:56: LE ^
                            {
                            LE297=(Token)match(input,LE,FOLLOW_LE_in_boolfact3483); 
                            LE297_tree = 
                            (AmlTree)adaptor.create(LE297)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(LE297_tree, root_0);


                            }
                            break;
                        case 5 :
                            // src/parser/Music.g:258:62: GT ^
                            {
                            GT298=(Token)match(input,GT,FOLLOW_GT_in_boolfact3488); 
                            GT298_tree = 
                            (AmlTree)adaptor.create(GT298)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(GT298_tree, root_0);


                            }
                            break;
                        case 6 :
                            // src/parser/Music.g:258:68: GE ^
                            {
                            GE299=(Token)match(input,GE,FOLLOW_GE_in_boolfact3493); 
                            GE299_tree = 
                            (AmlTree)adaptor.create(GE299)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(GE299_tree, root_0);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_num_expr_in_boolfact3497);
                    num_expr300=num_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, num_expr300.getTree());

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
    // src/parser/Music.g:261:1: num_expr : term ( ( PLUS ^| MINUS ^) term )* ;
    public final MusicParser.num_expr_return num_expr() throws RecognitionException {
        MusicParser.num_expr_return retval = new MusicParser.num_expr_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token PLUS302=null;
        Token MINUS303=null;
        MusicParser.term_return term301 =null;

        MusicParser.term_return term304 =null;


        AmlTree PLUS302_tree=null;
        AmlTree MINUS303_tree=null;

        try {
            // src/parser/Music.g:261:13: ( term ( ( PLUS ^| MINUS ^) term )* )
            // src/parser/Music.g:261:17: term ( ( PLUS ^| MINUS ^) term )*
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_term_in_num_expr3519);
            term301=term();

            state._fsp--;

            adaptor.addChild(root_0, term301.getTree());

            // src/parser/Music.g:261:22: ( ( PLUS ^| MINUS ^) term )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==MINUS||LA74_0==PLUS) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // src/parser/Music.g:261:24: ( PLUS ^| MINUS ^) term
            	    {
            	    // src/parser/Music.g:261:24: ( PLUS ^| MINUS ^)
            	    int alt73=2;
            	    int LA73_0 = input.LA(1);

            	    if ( (LA73_0==PLUS) ) {
            	        alt73=1;
            	    }
            	    else if ( (LA73_0==MINUS) ) {
            	        alt73=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 73, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt73) {
            	        case 1 :
            	            // src/parser/Music.g:261:25: PLUS ^
            	            {
            	            PLUS302=(Token)match(input,PLUS,FOLLOW_PLUS_in_num_expr3524); 
            	            PLUS302_tree = 
            	            (AmlTree)adaptor.create(PLUS302)
            	            ;
            	            root_0 = (AmlTree)adaptor.becomeRoot(PLUS302_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // src/parser/Music.g:261:33: MINUS ^
            	            {
            	            MINUS303=(Token)match(input,MINUS,FOLLOW_MINUS_in_num_expr3529); 
            	            MINUS303_tree = 
            	            (AmlTree)adaptor.create(MINUS303)
            	            ;
            	            root_0 = (AmlTree)adaptor.becomeRoot(MINUS303_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_term_in_num_expr3533);
            	    term304=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term304.getTree());

            	    }
            	    break;

            	default :
            	    break loop74;
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
    // src/parser/Music.g:264:1: term : factor ( ( DOT ^| DIV ^| MOD ^) factor )* ;
    public final MusicParser.term_return term() throws RecognitionException {
        MusicParser.term_return retval = new MusicParser.term_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token DOT306=null;
        Token DIV307=null;
        Token MOD308=null;
        MusicParser.factor_return factor305 =null;

        MusicParser.factor_return factor309 =null;


        AmlTree DOT306_tree=null;
        AmlTree DIV307_tree=null;
        AmlTree MOD308_tree=null;

        try {
            // src/parser/Music.g:264:9: ( factor ( ( DOT ^| DIV ^| MOD ^) factor )* )
            // src/parser/Music.g:264:13: factor ( ( DOT ^| DIV ^| MOD ^) factor )*
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term3555);
            factor305=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor305.getTree());

            // src/parser/Music.g:264:20: ( ( DOT ^| DIV ^| MOD ^) factor )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==DIV||LA76_0==DOT||LA76_0==MOD) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // src/parser/Music.g:264:22: ( DOT ^| DIV ^| MOD ^) factor
            	    {
            	    // src/parser/Music.g:264:22: ( DOT ^| DIV ^| MOD ^)
            	    int alt75=3;
            	    switch ( input.LA(1) ) {
            	    case DOT:
            	        {
            	        alt75=1;
            	        }
            	        break;
            	    case DIV:
            	        {
            	        alt75=2;
            	        }
            	        break;
            	    case MOD:
            	        {
            	        alt75=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 75, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt75) {
            	        case 1 :
            	            // src/parser/Music.g:264:23: DOT ^
            	            {
            	            DOT306=(Token)match(input,DOT,FOLLOW_DOT_in_term3560); 
            	            DOT306_tree = 
            	            (AmlTree)adaptor.create(DOT306)
            	            ;
            	            root_0 = (AmlTree)adaptor.becomeRoot(DOT306_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // src/parser/Music.g:264:30: DIV ^
            	            {
            	            DIV307=(Token)match(input,DIV,FOLLOW_DIV_in_term3565); 
            	            DIV307_tree = 
            	            (AmlTree)adaptor.create(DIV307)
            	            ;
            	            root_0 = (AmlTree)adaptor.becomeRoot(DIV307_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // src/parser/Music.g:264:37: MOD ^
            	            {
            	            MOD308=(Token)match(input,MOD,FOLLOW_MOD_in_term3570); 
            	            MOD308_tree = 
            	            (AmlTree)adaptor.create(MOD308)
            	            ;
            	            root_0 = (AmlTree)adaptor.becomeRoot(MOD308_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_factor_in_term3574);
            	    factor309=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor309.getTree());

            	    }
            	    break;

            	default :
            	    break loop76;
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
    // src/parser/Music.g:267:1: factor : ( NOT ^| PLUS ^| MINUS ^)? atom ;
    public final MusicParser.factor_return factor() throws RecognitionException {
        MusicParser.factor_return retval = new MusicParser.factor_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token NOT310=null;
        Token PLUS311=null;
        Token MINUS312=null;
        MusicParser.atom_return atom313 =null;


        AmlTree NOT310_tree=null;
        AmlTree PLUS311_tree=null;
        AmlTree MINUS312_tree=null;

        try {
            // src/parser/Music.g:267:9: ( ( NOT ^| PLUS ^| MINUS ^)? atom )
            // src/parser/Music.g:267:13: ( NOT ^| PLUS ^| MINUS ^)? atom
            {
            root_0 = (AmlTree)adaptor.nil();


            // src/parser/Music.g:267:13: ( NOT ^| PLUS ^| MINUS ^)?
            int alt77=4;
            switch ( input.LA(1) ) {
                case NOT:
                    {
                    alt77=1;
                    }
                    break;
                case PLUS:
                    {
                    alt77=2;
                    }
                    break;
                case MINUS:
                    {
                    alt77=3;
                    }
                    break;
            }

            switch (alt77) {
                case 1 :
                    // src/parser/Music.g:267:14: NOT ^
                    {
                    NOT310=(Token)match(input,NOT,FOLLOW_NOT_in_factor3591); 
                    NOT310_tree = 
                    (AmlTree)adaptor.create(NOT310)
                    ;
                    root_0 = (AmlTree)adaptor.becomeRoot(NOT310_tree, root_0);


                    }
                    break;
                case 2 :
                    // src/parser/Music.g:267:21: PLUS ^
                    {
                    PLUS311=(Token)match(input,PLUS,FOLLOW_PLUS_in_factor3596); 
                    PLUS311_tree = 
                    (AmlTree)adaptor.create(PLUS311)
                    ;
                    root_0 = (AmlTree)adaptor.becomeRoot(PLUS311_tree, root_0);


                    }
                    break;
                case 3 :
                    // src/parser/Music.g:267:29: MINUS ^
                    {
                    MINUS312=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor3601); 
                    MINUS312_tree = 
                    (AmlTree)adaptor.create(MINUS312)
                    ;
                    root_0 = (AmlTree)adaptor.becomeRoot(MINUS312_tree, root_0);


                    }
                    break;

            }


            pushFollow(FOLLOW_atom_in_factor3606);
            atom313=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom313.getTree());

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
    // src/parser/Music.g:270:1: atom : ( var_access | NUM | STRING | funcall | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | '(' ! expr ')' !);
    public final MusicParser.atom_return atom() throws RecognitionException {
        MusicParser.atom_return retval = new MusicParser.atom_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token b=null;
        Token NUM315=null;
        Token STRING316=null;
        Token char_literal318=null;
        Token char_literal320=null;
        MusicParser.var_access_return var_access314 =null;

        MusicParser.funcall_return funcall317 =null;

        MusicParser.expr_return expr319 =null;


        AmlTree b_tree=null;
        AmlTree NUM315_tree=null;
        AmlTree STRING316_tree=null;
        AmlTree char_literal318_tree=null;
        AmlTree char_literal320_tree=null;
        RewriteRuleTokenStream stream_FALSE=new RewriteRuleTokenStream(adaptor,"token FALSE");
        RewriteRuleTokenStream stream_TRUE=new RewriteRuleTokenStream(adaptor,"token TRUE");

        try {
            // src/parser/Music.g:270:9: ( var_access | NUM | STRING | funcall | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | '(' ! expr ')' !)
            int alt79=6;
            switch ( input.LA(1) ) {
            case ID_:
                {
                int LA79_1 = input.LA(2);

                if ( (LA79_1==AND||LA79_1==DIV||LA79_1==DOT||LA79_1==EQUAL||(LA79_1 >= GE && LA79_1 <= GT)||LA79_1==LE||LA79_1==LT||LA79_1==MINUS||LA79_1==MOD||LA79_1==NOT_EQUAL||(LA79_1 >= OR && LA79_1 <= PLUS)||(LA79_1 >= 93 && LA79_1 <= 95)||LA79_1==97) ) {
                    alt79=1;
                }
                else if ( (LA79_1==92) ) {
                    alt79=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 79, 1, input);

                    throw nvae;

                }
                }
                break;
            case LETTER_X:
                {
                int LA79_2 = input.LA(2);

                if ( (LA79_2==AND||LA79_2==DIV||LA79_2==DOT||LA79_2==EQUAL||(LA79_2 >= GE && LA79_2 <= GT)||LA79_2==LE||LA79_2==LT||LA79_2==MINUS||LA79_2==MOD||LA79_2==NOT_EQUAL||(LA79_2 >= OR && LA79_2 <= PLUS)||(LA79_2 >= 93 && LA79_2 <= 95)||LA79_2==97) ) {
                    alt79=1;
                }
                else if ( (LA79_2==92) ) {
                    alt79=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 79, 2, input);

                    throw nvae;

                }
                }
                break;
            case NUM:
                {
                alt79=2;
                }
                break;
            case STRING:
                {
                alt79=3;
                }
                break;
            case FALSE:
            case TRUE:
                {
                alt79=5;
                }
                break;
            case 92:
                {
                alt79=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;

            }

            switch (alt79) {
                case 1 :
                    // src/parser/Music.g:270:13: var_access
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_var_access_in_atom3622);
                    var_access314=var_access();

                    state._fsp--;

                    adaptor.addChild(root_0, var_access314.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:271:7: NUM
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    NUM315=(Token)match(input,NUM,FOLLOW_NUM_in_atom3630); 
                    NUM315_tree = 
                    (AmlTree)adaptor.create(NUM315)
                    ;
                    adaptor.addChild(root_0, NUM315_tree);


                    }
                    break;
                case 3 :
                    // src/parser/Music.g:272:7: STRING
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    STRING316=(Token)match(input,STRING,FOLLOW_STRING_in_atom3638); 
                    STRING316_tree = 
                    (AmlTree)adaptor.create(STRING316)
                    ;
                    adaptor.addChild(root_0, STRING316_tree);


                    }
                    break;
                case 4 :
                    // src/parser/Music.g:273:7: funcall
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_atom3646);
                    funcall317=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall317.getTree());

                    }
                    break;
                case 5 :
                    // src/parser/Music.g:274:7: (b= TRUE |b= FALSE )
                    {
                    // src/parser/Music.g:274:7: (b= TRUE |b= FALSE )
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==TRUE) ) {
                        alt78=1;
                    }
                    else if ( (LA78_0==FALSE) ) {
                        alt78=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 78, 0, input);

                        throw nvae;

                    }
                    switch (alt78) {
                        case 1 :
                            // src/parser/Music.g:274:8: b= TRUE
                            {
                            b=(Token)match(input,TRUE,FOLLOW_TRUE_in_atom3657);  
                            stream_TRUE.add(b);


                            }
                            break;
                        case 2 :
                            // src/parser/Music.g:274:17: b= FALSE
                            {
                            b=(Token)match(input,FALSE,FOLLOW_FALSE_in_atom3663);  
                            stream_FALSE.add(b);


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
                    // 274:27: -> ^( BOOLEAN[$b,$b.text] )
                    {
                        // src/parser/Music.g:274:30: ^( BOOLEAN[$b,$b.text] )
                        {
                        AmlTree root_1 = (AmlTree)adaptor.nil();
                        root_1 = (AmlTree)adaptor.becomeRoot(
                        (AmlTree)adaptor.create(BOOLEAN, b, (b!=null?b.getText():null))
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 6 :
                    // src/parser/Music.g:275:7: '(' ! expr ')' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    char_literal318=(Token)match(input,92,FOLLOW_92_in_atom3680); 

                    pushFollow(FOLLOW_expr_in_atom3683);
                    expr319=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr319.getTree());

                    char_literal320=(Token)match(input,93,FOLLOW_93_in_atom3685); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_global_stmt_in_prog207 = new BitSet(new long[]{0x0000401004002800L,0x0000000002022002L});
    public static final BitSet FOLLOW_EOF_in_prog211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_global_stmt243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_frag_in_global_stmt261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_song_in_global_stmt279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_rule_in_var_funcall304 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_var_funcall306 = new BitSet(new long[]{0x0001040000000000L});
    public static final BitSet FOLLOW_id_rule_in_var_funcall310 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_var_funcall312 = new BitSet(new long[]{0x6201040204002420L,0x0000000030850028L});
    public static final BitSet FOLLOW_params_in_var_funcall314 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_var_funcall317 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_var_funcall319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_rule_in_var_access360 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_var_access363 = new BitSet(new long[]{0x0001040000000000L});
    public static final BitSet FOLLOW_id_rule_in_var_access367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_rule_in_var_access396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID__in_id_rule426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LETTER_X_in_id_rule434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_void_in_function467 = new BitSet(new long[]{0x0001040000000000L});
    public static final BitSet FOLLOW_id_rule_in_function471 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_function473 = new BitSet(new long[]{0x0000400004002800L,0x0000000020020002L});
    public static final BitSet FOLLOW_list_arguments_in_function475 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_function477 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_function479 = new BitSet(new long[]{0x00017C0804422A00L,0x000000000412E80AL});
    public static final BitSet FOLLOW_listInst_in_function481 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_function483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_rule_in_funcall530 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_funcall532 = new BitSet(new long[]{0x6201040204002420L,0x0000000030850028L});
    public static final BitSet FOLLOW_params_in_funcall534 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_funcall537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FRAGMENT_in_frag571 = new BitSet(new long[]{0x0001040000000000L});
    public static final BitSet FOLLOW_id_rule_in_frag574 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_frag576 = new BitSet(new long[]{0x0000400004002800L,0x0000000020020002L});
    public static final BitSet FOLLOW_list_arguments_in_frag579 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_frag581 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_frag584 = new BitSet(new long[]{0x40017C0804022E20L,0x0000000014166002L});
    public static final BitSet FOLLOW_list_music_inst_in_frag587 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_frag589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_argument_in_list_arguments609 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_list_arguments612 = new BitSet(new long[]{0x0000400004002800L,0x0000000000020002L});
    public static final BitSet FOLLOW_argument_in_list_arguments614 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_type_in_argument655 = new BitSet(new long[]{0x0001040000000000L});
    public static final BitSet FOLLOW_id_rule_in_argument658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_params685 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_notes_variable_in_params689 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_drumsnotes_variable_in_params693 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_params697 = new BitSet(new long[]{0x6201040204002420L,0x0000000010850028L});
    public static final BitSet FOLLOW_expr_in_params701 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_notes_variable_in_params705 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_drumsnotes_variable_in_params709 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_inst_in_listInst737 = new BitSet(new long[]{0x00017C0804422A02L,0x000000000412E80AL});
    public static final BitSet FOLLOW_music_inst_in_list_music_inst771 = new BitSet(new long[]{0x40017C0804022E22L,0x0000000014166002L});
    public static final BitSet FOLLOW_declaration_in_inst815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_inst833 = new BitSet(new long[]{0x6201040204002420L,0x0000000010850028L});
    public static final BitSet FOLLOW_expr_in_inst837 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_notes_group_in_inst841 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_drumsnotes_group_in_inst845 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_inst848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_funcall_in_inst867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tone_in_inst885 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_inst887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_beat_in_inst906 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_inst908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_speed_in_inst927 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_inst929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instrument_in_inst948 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_inst950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignation_in_inst969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_stmt_in_inst987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_inst1005 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_inst1007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_stmt_in_inst1026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_stmt_in_inst1044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_song_in_inst1062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compas_list_in_inst1080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_music_inst1104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tone_in_music_inst1122 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_music_inst1124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_beat_in_music_inst1143 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_music_inst1145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_speed_in_music_inst1164 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_music_inst1166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instrument_in_music_inst1185 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_music_inst1187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_funcall_in_music_inst1206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignation_in_music_inst1224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_music_stmt_in_music_inst1242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_music_inst1260 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_music_inst1262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_music_stmt_in_music_inst1281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_music_stmt_in_music_inst1299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_song_in_music_inst1317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notes_group_in_music_inst1344 = new BitSet(new long[]{0x4000000000002422L,0x0000000210040000L});
    public static final BitSet FOLLOW_97_in_music_inst1348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_drumsnotes_group_in_music_inst1377 = new BitSet(new long[]{0x0000000004000002L,0x0000000210000000L});
    public static final BitSet FOLLOW_97_in_music_inst1381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_declaration1406 = new BitSet(new long[]{0x0001040000000000L});
    public static final BitSet FOLLOW_assig_opt_in_declaration1409 = new BitSet(new long[]{0x0000000000000000L,0x0000000240000000L});
    public static final BitSet FOLLOW_94_in_declaration1412 = new BitSet(new long[]{0x0001040000000000L});
    public static final BitSet FOLLOW_assig_opt_in_declaration1415 = new BitSet(new long[]{0x0000000000000000L,0x0000000240000000L});
    public static final BitSet FOLLOW_97_in_declaration1419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_type_void1565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOID_in_type_void1583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_rule_in_assig_opt1608 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ASSIG_in_assig_opt1611 = new BitSet(new long[]{0x6201040204002420L,0x0000000010850028L});
    public static final BitSet FOLLOW_expr_in_assig_opt1615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notes_variable_in_assig_opt1619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_drumsnotes_variable_in_assig_opt1623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assig_in_assignation1649 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_assignation1651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_access_in_assig1681 = new BitSet(new long[]{0x1400000000100040L,0x0000000000000240L});
    public static final BitSet FOLLOW_set_in_assig1683 = new BitSet(new long[]{0x6201040604002420L,0x0000000010850028L});
    public static final BitSet FOLLOW_expr_in_assig1699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notes_variable_in_assig1703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_drumsnotes_variable_in_assig1707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIGURE_in_assig1711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_post_in_assig1730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pre_in_assig1748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_access_in_post1778 = new BitSet(new long[]{0x0000100000020000L});
    public static final BitSet FOLLOW_INCR_in_post1783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECR_in_post1789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INCR_in_pre1836 = new BitSet(new long[]{0x0001040000000000L});
    public static final BitSet FOLLOW_DECR_in_pre1842 = new BitSet(new long[]{0x0001040000000000L});
    public static final BitSet FOLLOW_var_access_in_pre1845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BEAT_in_beat1888 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_NUM_in_beat1891 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_beat1893 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_NUM_in_beat1896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SPEED_in_speed1925 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_NUM_in_speed1928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRANSPORT_in_transport1953 = new BitSet(new long[]{0x2201040200000000L,0x0000000010810028L});
    public static final BitSet FOLLOW_expr_in_transport1956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUMENT_in_instrument1980 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_STRING_in_instrument1983 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_instrument1985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_stmt2009 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_while_stmt2012 = new BitSet(new long[]{0x2201040200000000L,0x0000000010810028L});
    public static final BitSet FOLLOW_expr_in_while_stmt2015 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_while_stmt2017 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_while_stmt2020 = new BitSet(new long[]{0x00017C0804422A00L,0x000000000412E80AL});
    public static final BitSet FOLLOW_listInst_in_while_stmt2023 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_while_stmt2025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_music_stmt2052 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_while_music_stmt2055 = new BitSet(new long[]{0x2201040200000000L,0x0000000010810028L});
    public static final BitSet FOLLOW_expr_in_while_music_stmt2058 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_while_music_stmt2060 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_while_music_stmt2063 = new BitSet(new long[]{0x40017C0804022E20L,0x0000000014166002L});
    public static final BitSet FOLLOW_list_music_inst_in_while_music_stmt2066 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_while_music_stmt2068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_for_stmt2103 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_for_stmt2106 = new BitSet(new long[]{0x0001540004022800L,0x0000000000020002L});
    public static final BitSet FOLLOW_declaration_in_for_stmt2110 = new BitSet(new long[]{0x2201040200000000L,0x0000000010810028L});
    public static final BitSet FOLLOW_list_assig_in_for_stmt2114 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_for_stmt2116 = new BitSet(new long[]{0x2201040200000000L,0x0000000010810028L});
    public static final BitSet FOLLOW_expr_in_for_stmt2120 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_for_stmt2122 = new BitSet(new long[]{0x0001140000020000L});
    public static final BitSet FOLLOW_list_assig_in_for_stmt2125 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_for_stmt2127 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_for_stmt2130 = new BitSet(new long[]{0x00017C0804422A00L,0x000000000412E80AL});
    public static final BitSet FOLLOW_listInst_in_for_stmt2133 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_for_stmt2135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_for_music_stmt2160 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_for_music_stmt2163 = new BitSet(new long[]{0x0001540004022800L,0x0000000000020002L});
    public static final BitSet FOLLOW_declaration_in_for_music_stmt2167 = new BitSet(new long[]{0x2201040200000000L,0x0000000010810028L});
    public static final BitSet FOLLOW_list_assig_in_for_music_stmt2171 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_for_music_stmt2173 = new BitSet(new long[]{0x2201040200000000L,0x0000000010810028L});
    public static final BitSet FOLLOW_expr_in_for_music_stmt2177 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_for_music_stmt2179 = new BitSet(new long[]{0x0001140000020000L});
    public static final BitSet FOLLOW_list_assig_in_for_music_stmt2182 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_for_music_stmt2184 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_for_music_stmt2187 = new BitSet(new long[]{0x40017C0804022E20L,0x0000000014166002L});
    public static final BitSet FOLLOW_list_music_inst_in_for_music_stmt2190 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_for_music_stmt2192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assig_in_list_assig2221 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_list_assig2224 = new BitSet(new long[]{0x0001140000020000L});
    public static final BitSet FOLLOW_assig_in_list_assig2226 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_IF_in_if_stmt2264 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_if_stmt2267 = new BitSet(new long[]{0x2201040200000000L,0x0000000010810028L});
    public static final BitSet FOLLOW_expr_in_if_stmt2270 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_if_stmt2272 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_if_stmt2275 = new BitSet(new long[]{0x00017C0804422A00L,0x000000000412E80AL});
    public static final BitSet FOLLOW_listInst_in_if_stmt2278 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_if_stmt2280 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_elseif_stmt_in_if_stmt2283 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_else_stmt_in_if_stmt2286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_elseif_stmt2310 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_IF_in_elseif_stmt2312 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_elseif_stmt2314 = new BitSet(new long[]{0x2201040200000000L,0x0000000010810028L});
    public static final BitSet FOLLOW_expr_in_elseif_stmt2316 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_elseif_stmt2318 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_elseif_stmt2320 = new BitSet(new long[]{0x00017C0804422A00L,0x000000000412E80AL});
    public static final BitSet FOLLOW_listInst_in_elseif_stmt2322 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_elseif_stmt2324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_else_stmt2359 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_else_stmt2362 = new BitSet(new long[]{0x00017C0804422A00L,0x000000000412E80AL});
    public static final BitSet FOLLOW_listInst_in_else_stmt2365 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_else_stmt2367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_if_music_stmt2393 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_if_music_stmt2396 = new BitSet(new long[]{0x2201040200000000L,0x0000000010810028L});
    public static final BitSet FOLLOW_expr_in_if_music_stmt2399 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_if_music_stmt2401 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_if_music_stmt2404 = new BitSet(new long[]{0x40017C0804022E20L,0x0000000014166002L});
    public static final BitSet FOLLOW_list_music_inst_in_if_music_stmt2407 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_if_music_stmt2409 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_elseif_music_stmt_in_if_music_stmt2412 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_else_music_stmt_in_if_music_stmt2415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_elseif_music_stmt2445 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_IF_in_elseif_music_stmt2447 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_elseif_music_stmt2449 = new BitSet(new long[]{0x2201040200000000L,0x0000000010810028L});
    public static final BitSet FOLLOW_expr_in_elseif_music_stmt2451 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_elseif_music_stmt2453 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_elseif_music_stmt2455 = new BitSet(new long[]{0x40017C0804022E20L,0x0000000014166002L});
    public static final BitSet FOLLOW_list_music_inst_in_elseif_music_stmt2457 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_elseif_music_stmt2459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_else_music_stmt2500 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_else_music_stmt2503 = new BitSet(new long[]{0x40017C0804022E20L,0x0000000014166002L});
    public static final BitSet FOLLOW_list_music_inst_in_else_music_stmt2506 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_else_music_stmt2508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SONG_in_song2543 = new BitSet(new long[]{0x0001040000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_id_rule_in_song2546 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_song2549 = new BitSet(new long[]{0x0000000000000200L,0x0000000000704000L});
    public static final BitSet FOLLOW_beat_in_song2553 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_song2555 = new BitSet(new long[]{0x0000000000000000L,0x0000000000704000L});
    public static final BitSet FOLLOW_speed_in_song2561 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_song2563 = new BitSet(new long[]{0x0000000000000000L,0x0000000000700000L});
    public static final BitSet FOLLOW_tone_in_song2569 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_song2571 = new BitSet(new long[]{0x0000000000000000L,0x0000000000600000L});
    public static final BitSet FOLLOW_transport_in_song2577 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_song2579 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_track_in_song2586 = new BitSet(new long[]{0x0000000000800000L,0x0000000800200000L});
    public static final BitSet FOLLOW_drums_track_in_song2590 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_song2593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRACK_in_track2623 = new BitSet(new long[]{0x0001040000400000L,0x0000000000018008L});
    public static final BitSet FOLLOW_id_rule_in_track2626 = new BitSet(new long[]{0x0000000000400000L,0x0000000000018008L});
    public static final BitSet FOLLOW_STRING_in_track2629 = new BitSet(new long[]{0x0000000000400000L,0x0000000000008008L});
    public static final BitSet FOLLOW_compas_aux_in_track2632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DRUMS_in_drums_track2655 = new BitSet(new long[]{0x0000000000400000L,0x0000000000008008L});
    public static final BitSet FOLLOW_compas_aux_in_drums_track2658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compas_list_in_compas_aux2682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_BAR_in_compas_list2712 = new BitSet(new long[]{0x40017C0804422E20L,0x000000001416E00AL});
    public static final BitSet FOLLOW_repetition_in_compas_list2717 = new BitSet(new long[]{0x40017C0804422E20L,0x000000001416E00AL});
    public static final BitSet FOLLOW_compasses_in_compas_list2721 = new BitSet(new long[]{0x40017C0804422E20L,0x000000001416E00AL});
    public static final BitSet FOLLOW_repetition_in_compas_list2725 = new BitSet(new long[]{0x40017C0804422E20L,0x000000001416E00AL});
    public static final BitSet FOLLOW_DOUBLE_BAR_in_compas_list2730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compas_in_compasses2757 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_BAR_in_compasses2760 = new BitSet(new long[]{0x40017C0804022E20L,0x0000000014166002L});
    public static final BitSet FOLLOW_compas_in_compasses2763 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_NUM_in_repetition2790 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_LETTER_X_in_repetition2792 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_START_REPETITION_in_repetition2796 = new BitSet(new long[]{0x40017C0804022E20L,0x0000000014166002L});
    public static final BitSet FOLLOW_compasses_in_repetition2798 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_END_REPETITION_in_repetition2800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_music_inst_in_compas2851 = new BitSet(new long[]{0x40017C0804022E22L,0x0000000014166002L});
    public static final BitSet FOLLOW_TONE_in_tone2895 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_NUM_in_tone2898 = new BitSet(new long[]{0x0000000000000400L,0x0000000000040000L});
    public static final BitSet FOLLOW_set_in_tone2900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_drumsnotes_in_drumsnotes_group2927 = new BitSet(new long[]{0x0000000000000002L,0x0000000080080000L});
    public static final BitSet FOLLOW_95_in_drumsnotes_group2930 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_FIGURE_in_drumsnotes_group2932 = new BitSet(new long[]{0x0000000000200002L,0x0000000000080000L});
    public static final BitSet FOLLOW_DOT_in_drumsnotes_group2934 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_TIE_in_drumsnotes_group2939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notes_type_in_notes_group2980 = new BitSet(new long[]{0x0000000000000002L,0x0000000080080000L});
    public static final BitSet FOLLOW_95_in_notes_group2983 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_FIGURE_in_notes_group2985 = new BitSet(new long[]{0x0000000000200002L,0x0000000000080000L});
    public static final BitSet FOLLOW_DOT_in_notes_group2987 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_TIE_in_notes_group2992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_drumsnotes_in_drumsnotes_variable3034 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_drumsnotes_variable3037 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_FIGURE_in_drumsnotes_variable3039 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_DOT_in_drumsnotes_variable3041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notes_type_in_notes_variable3086 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_notes_variable3089 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_FIGURE_in_notes_variable3091 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_DOT_in_notes_variable3093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_chord_in_notes_type3136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notes_in_notes_type3140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHORD_in_chord3169 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_chord3172 = new BitSet(new long[]{0x4000000000000420L,0x0000000000040000L});
    public static final BitSet FOLLOW_note_in_chord3175 = new BitSet(new long[]{0x0180000000040000L,0x0000000020001020L});
    public static final BitSet FOLLOW_93_in_chord3195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_notes3227 = new BitSet(new long[]{0x4000000000000420L,0x0000000000040000L});
    public static final BitSet FOLLOW_note_in_notes3230 = new BitSet(new long[]{0x4000000000000420L,0x0000000020040000L});
    public static final BitSet FOLLOW_93_in_notes3234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_note_in_notes3239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_drumsnotes3275 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_drums_in_drumsnotes3278 = new BitSet(new long[]{0x0000000004000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_drumsnotes3282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_drums_in_drumsnotes3287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DRUMS_NOTE_TYPE_in_drums3326 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_drums3329 = new BitSet(new long[]{0x2201040200000000L,0x0000000010810028L});
    public static final BitSet FOLLOW_num_expr_in_drums3332 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_drums3335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOTE_in_note3379 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_NUM_in_note3383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolterm_in_expr3412 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_OR_in_expr3415 = new BitSet(new long[]{0x2201040200000000L,0x0000000010810028L});
    public static final BitSet FOLLOW_boolterm_in_expr3418 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_boolfact_in_boolterm3436 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_boolterm3439 = new BitSet(new long[]{0x2201040200000000L,0x0000000010810028L});
    public static final BitSet FOLLOW_boolfact_in_boolterm3442 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_num_expr_in_boolfact3464 = new BitSet(new long[]{0x0040818080000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_EQUAL_in_boolfact3468 = new BitSet(new long[]{0x2201040200000000L,0x0000000010810028L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_boolfact3473 = new BitSet(new long[]{0x2201040200000000L,0x0000000010810028L});
    public static final BitSet FOLLOW_LT_in_boolfact3478 = new BitSet(new long[]{0x2201040200000000L,0x0000000010810028L});
    public static final BitSet FOLLOW_LE_in_boolfact3483 = new BitSet(new long[]{0x2201040200000000L,0x0000000010810028L});
    public static final BitSet FOLLOW_GT_in_boolfact3488 = new BitSet(new long[]{0x2201040200000000L,0x0000000010810028L});
    public static final BitSet FOLLOW_GE_in_boolfact3493 = new BitSet(new long[]{0x2201040200000000L,0x0000000010810028L});
    public static final BitSet FOLLOW_num_expr_in_boolfact3497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_num_expr3519 = new BitSet(new long[]{0x0200000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_PLUS_in_num_expr3524 = new BitSet(new long[]{0x2201040200000000L,0x0000000010810028L});
    public static final BitSet FOLLOW_MINUS_in_num_expr3529 = new BitSet(new long[]{0x2201040200000000L,0x0000000010810028L});
    public static final BitSet FOLLOW_term_in_num_expr3533 = new BitSet(new long[]{0x0200000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_factor_in_term3555 = new BitSet(new long[]{0x0800000000280002L});
    public static final BitSet FOLLOW_DOT_in_term3560 = new BitSet(new long[]{0x2201040200000000L,0x0000000010810028L});
    public static final BitSet FOLLOW_DIV_in_term3565 = new BitSet(new long[]{0x2201040200000000L,0x0000000010810028L});
    public static final BitSet FOLLOW_MOD_in_term3570 = new BitSet(new long[]{0x2201040200000000L,0x0000000010810028L});
    public static final BitSet FOLLOW_factor_in_term3574 = new BitSet(new long[]{0x0800000000280002L});
    public static final BitSet FOLLOW_NOT_in_factor3591 = new BitSet(new long[]{0x0001040200000000L,0x0000000010810008L});
    public static final BitSet FOLLOW_PLUS_in_factor3596 = new BitSet(new long[]{0x0001040200000000L,0x0000000010810008L});
    public static final BitSet FOLLOW_MINUS_in_factor3601 = new BitSet(new long[]{0x0001040200000000L,0x0000000010810008L});
    public static final BitSet FOLLOW_atom_in_factor3606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_access_in_atom3622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUM_in_atom3630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_atom3638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_atom3646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_atom3657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_atom3663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_atom3680 = new BitSet(new long[]{0x2201040200000000L,0x0000000010810028L});
    public static final BitSet FOLLOW_expr_in_atom3683 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_atom3685 = new BitSet(new long[]{0x0000000000000002L});

}