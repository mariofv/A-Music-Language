// $ANTLR 3.4 src/parser/Music.g 2017-04-28 17:45:21

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ARMOR", "ASSIG", "ATTR_ACCESS", "BAR", "BEAT", "BEMOL", "BOOL", "BOOLEAN", "CHORD", "COMMENT", "COMPAS", "COMPAS_LIST", "DECR", "DIMINUTION", "DIV", "DIVIDE_ASSIG", "DOT", "DOUBLE_BAR", "DRUMS", "DRUMSNOTES", "DRUMSNOTE_LIST", "DRUMS_NOTE_TYPE", "DRUMS_TRACK", "ELSE", "ELSEIF", "END_REPETITION", "EQUAL", "ESC_SEQ", "FALSE", "FIGURE", "FOR", "FRAGMENT", "FUNCALL", "FUNCTION", "GE", "GT", "ID", "IF", "INCR", "INSTRUMENT", "INT", "LE", "LETTER_X", "LIST_ARGUMENTS", "LIST_ASSIG", "LIST_FUNCTIONS", "LIST_INSTRUCTIONS", "LIST_MUSIC_INST", "LT", "MAJ7", "MINOR", "MINUS", "MINUS_ASSIG", "MOD", "MOD_ASSIG", "NOT", "NOTE", "NOTES", "NOTE_LIST", "NOTE_TYPE", "NOT_EQUAL", "NUM", "OR", "PLUS", "PLUS_ASSIG", "POST", "PRE", "PROD_ASSIG", "REPETITION", "RETURN", "SEVENTH", "SONG", "SPEED", "START_REPETITION", "STRING", "STRING_TYPE", "SUSTAIN", "TIE", "TONE", "TRACK", "TRANSPORT", "TRUE", "VAR_FUNCALL", "VOID", "WHILE", "WS", "'('", "')'", "','", "'.'", "':'", "';'", "'{'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
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
    public static final int IF=42;
    public static final int INCR=43;
    public static final int INSTRUMENT=44;
    public static final int INT=45;
    public static final int LE=46;
    public static final int LETTER_X=47;
    public static final int LIST_ARGUMENTS=48;
    public static final int LIST_ASSIG=49;
    public static final int LIST_FUNCTIONS=50;
    public static final int LIST_INSTRUCTIONS=51;
    public static final int LIST_MUSIC_INST=52;
    public static final int LT=53;
    public static final int MAJ7=54;
    public static final int MINOR=55;
    public static final int MINUS=56;
    public static final int MINUS_ASSIG=57;
    public static final int MOD=58;
    public static final int MOD_ASSIG=59;
    public static final int NOT=60;
    public static final int NOTE=61;
    public static final int NOTES=62;
    public static final int NOTE_LIST=63;
    public static final int NOTE_TYPE=64;
    public static final int NOT_EQUAL=65;
    public static final int NUM=66;
    public static final int OR=67;
    public static final int PLUS=68;
    public static final int PLUS_ASSIG=69;
    public static final int POST=70;
    public static final int PRE=71;
    public static final int PROD_ASSIG=72;
    public static final int REPETITION=73;
    public static final int RETURN=74;
    public static final int SEVENTH=75;
    public static final int SONG=76;
    public static final int SPEED=77;
    public static final int START_REPETITION=78;
    public static final int STRING=79;
    public static final int STRING_TYPE=80;
    public static final int SUSTAIN=81;
    public static final int TIE=82;
    public static final int TONE=83;
    public static final int TRACK=84;
    public static final int TRANSPORT=85;
    public static final int TRUE=86;
    public static final int VAR_FUNCALL=87;
    public static final int VOID=88;
    public static final int WHILE=89;
    public static final int WS=90;

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
    // src/parser/Music.g:42:1: prog : ( global_stmt )+ EOF -> ^( LIST_FUNCTIONS ( global_stmt )+ ) ;
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
            // src/parser/Music.g:42:10: ( ( global_stmt )+ EOF -> ^( LIST_FUNCTIONS ( global_stmt )+ ) )
            // src/parser/Music.g:42:14: ( global_stmt )+ EOF
            {
            // src/parser/Music.g:42:14: ( global_stmt )+
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
            	    // src/parser/Music.g:42:15: global_stmt
            	    {
            	    pushFollow(FOLLOW_global_stmt_in_prog200);
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


            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_prog204);  
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
            // 42:33: -> ^( LIST_FUNCTIONS ( global_stmt )+ )
            {
                // src/parser/Music.g:42:36: ^( LIST_FUNCTIONS ( global_stmt )+ )
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
    // src/parser/Music.g:45:1: global_stmt : ( function | frag | song );
    public final MusicParser.global_stmt_return global_stmt() throws RecognitionException {
        MusicParser.global_stmt_return retval = new MusicParser.global_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        MusicParser.function_return function3 =null;

        MusicParser.frag_return frag4 =null;

        MusicParser.song_return song5 =null;



        try {
            // src/parser/Music.g:45:13: ( function | frag | song )
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
                    // src/parser/Music.g:45:17: function
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_function_in_global_stmt236);
                    function3=function();

                    state._fsp--;

                    adaptor.addChild(root_0, function3.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:46:17: frag
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_frag_in_global_stmt254);
                    frag4=frag();

                    state._fsp--;

                    adaptor.addChild(root_0, frag4.getTree());

                    }
                    break;
                case 3 :
                    // src/parser/Music.g:47:17: song
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_song_in_global_stmt272);
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
    // src/parser/Music.g:50:1: var_funcall : id= id_rule '.' id2= id_rule '(' ( params )? ')' ';' -> ^( VAR_FUNCALL[$id.text] $id2 ( params )? ) ;
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
        RewriteRuleTokenStream stream_96=new RewriteRuleTokenStream(adaptor,"token 96");
        RewriteRuleTokenStream stream_94=new RewriteRuleTokenStream(adaptor,"token 94");
        RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
        RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
        RewriteRuleSubtreeStream stream_id_rule=new RewriteRuleSubtreeStream(adaptor,"rule id_rule");
        RewriteRuleSubtreeStream stream_params=new RewriteRuleSubtreeStream(adaptor,"rule params");
        try {
            // src/parser/Music.g:50:13: (id= id_rule '.' id2= id_rule '(' ( params )? ')' ';' -> ^( VAR_FUNCALL[$id.text] $id2 ( params )? ) )
            // src/parser/Music.g:50:17: id= id_rule '.' id2= id_rule '(' ( params )? ')' ';'
            {
            pushFollow(FOLLOW_id_rule_in_var_funcall297);
            id=id_rule();

            state._fsp--;

            stream_id_rule.add(id.getTree());

            char_literal6=(Token)match(input,94,FOLLOW_94_in_var_funcall299);  
            stream_94.add(char_literal6);


            pushFollow(FOLLOW_id_rule_in_var_funcall303);
            id2=id_rule();

            state._fsp--;

            stream_id_rule.add(id2.getTree());

            char_literal7=(Token)match(input,91,FOLLOW_91_in_var_funcall305);  
            stream_91.add(char_literal7);


            // src/parser/Music.g:50:48: ( params )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==ARMOR||LA3_0==BEMOL||LA3_0==CHORD||LA3_0==DRUMS_NOTE_TYPE||LA3_0==FALSE||LA3_0==ID||LA3_0==LETTER_X||LA3_0==MINUS||(LA3_0 >= NOT && LA3_0 <= NOTE)||LA3_0==NUM||LA3_0==PLUS||LA3_0==STRING||LA3_0==SUSTAIN||LA3_0==TRUE||LA3_0==91) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // src/parser/Music.g:50:48: params
                    {
                    pushFollow(FOLLOW_params_in_var_funcall307);
                    params8=params();

                    state._fsp--;

                    stream_params.add(params8.getTree());

                    }
                    break;

            }


            char_literal9=(Token)match(input,92,FOLLOW_92_in_var_funcall310);  
            stream_92.add(char_literal9);


            char_literal10=(Token)match(input,96,FOLLOW_96_in_var_funcall312);  
            stream_96.add(char_literal10);


            // AST REWRITE
            // elements: id2, params
            // token labels: 
            // rule labels: retval, id2
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_id2=new RewriteRuleSubtreeStream(adaptor,"rule id2",id2!=null?id2.tree:null);

            root_0 = (AmlTree)adaptor.nil();
            // 50:65: -> ^( VAR_FUNCALL[$id.text] $id2 ( params )? )
            {
                // src/parser/Music.g:50:69: ^( VAR_FUNCALL[$id.text] $id2 ( params )? )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(VAR_FUNCALL, (id!=null?input.toString(id.start,id.stop):null))
                , root_1);

                adaptor.addChild(root_1, stream_id2.nextTree());

                // src/parser/Music.g:50:98: ( params )?
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
    // src/parser/Music.g:53:1: var_access : (id1= id_rule ( '.' id2= id_rule ) -> ^( ATTR_ACCESS[$id1.text] $id2) | id_rule );
    public final MusicParser.var_access_return var_access() throws RecognitionException {
        MusicParser.var_access_return retval = new MusicParser.var_access_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal11=null;
        MusicParser.id_rule_return id1 =null;

        MusicParser.id_rule_return id2 =null;

        MusicParser.id_rule_return id_rule12 =null;


        AmlTree char_literal11_tree=null;
        RewriteRuleTokenStream stream_94=new RewriteRuleTokenStream(adaptor,"token 94");
        RewriteRuleSubtreeStream stream_id_rule=new RewriteRuleSubtreeStream(adaptor,"rule id_rule");
        try {
            // src/parser/Music.g:53:13: (id1= id_rule ( '.' id2= id_rule ) -> ^( ATTR_ACCESS[$id1.text] $id2) | id_rule )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==ID||LA4_0==LETTER_X) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==94) ) {
                    alt4=1;
                }
                else if ( (LA4_1==AND||LA4_1==ASSIG||LA4_1==DECR||(LA4_1 >= DIV && LA4_1 <= DOT)||LA4_1==EQUAL||(LA4_1 >= GE && LA4_1 <= GT)||LA4_1==INCR||LA4_1==LE||LA4_1==LT||(LA4_1 >= MINUS && LA4_1 <= MOD_ASSIG)||LA4_1==NOT_EQUAL||(LA4_1 >= OR && LA4_1 <= PLUS_ASSIG)||LA4_1==PROD_ASSIG||(LA4_1 >= 92 && LA4_1 <= 93)||LA4_1==96) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

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
                    // src/parser/Music.g:53:17: id1= id_rule ( '.' id2= id_rule )
                    {
                    pushFollow(FOLLOW_id_rule_in_var_access353);
                    id1=id_rule();

                    state._fsp--;

                    stream_id_rule.add(id1.getTree());

                    // src/parser/Music.g:53:29: ( '.' id2= id_rule )
                    // src/parser/Music.g:53:30: '.' id2= id_rule
                    {
                    char_literal11=(Token)match(input,94,FOLLOW_94_in_var_access356);  
                    stream_94.add(char_literal11);


                    pushFollow(FOLLOW_id_rule_in_var_access360);
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
                    // 53:47: -> ^( ATTR_ACCESS[$id1.text] $id2)
                    {
                        // src/parser/Music.g:53:50: ^( ATTR_ACCESS[$id1.text] $id2)
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
                    // src/parser/Music.g:54:17: id_rule
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_id_rule_in_var_access389);
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
    // src/parser/Music.g:57:1: id_rule : ( ID | LETTER_X );
    public final MusicParser.id_rule_return id_rule() throws RecognitionException {
        MusicParser.id_rule_return retval = new MusicParser.id_rule_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token set13=null;

        AmlTree set13_tree=null;

        try {
            // src/parser/Music.g:57:13: ( ID | LETTER_X )
            // src/parser/Music.g:
            {
            root_0 = (AmlTree)adaptor.nil();


            set13=(Token)input.LT(1);

            if ( input.LA(1)==ID||input.LA(1)==LETTER_X ) {
                input.consume();
                adaptor.addChild(root_0, 
                (AmlTree)adaptor.create(set13)
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

        Token char_literal15=null;
        Token char_literal17=null;
        Token char_literal18=null;
        Token char_literal20=null;
        MusicParser.id_rule_return id =null;

        MusicParser.type_void_return type_void14 =null;

        MusicParser.list_arguments_return list_arguments16 =null;

        MusicParser.listInst_return listInst19 =null;


        AmlTree char_literal15_tree=null;
        AmlTree char_literal17_tree=null;
        AmlTree char_literal18_tree=null;
        AmlTree char_literal20_tree=null;
        RewriteRuleTokenStream stream_98=new RewriteRuleTokenStream(adaptor,"token 98");
        RewriteRuleTokenStream stream_97=new RewriteRuleTokenStream(adaptor,"token 97");
        RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
        RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
        RewriteRuleSubtreeStream stream_listInst=new RewriteRuleSubtreeStream(adaptor,"rule listInst");
        RewriteRuleSubtreeStream stream_list_arguments=new RewriteRuleSubtreeStream(adaptor,"rule list_arguments");
        RewriteRuleSubtreeStream stream_type_void=new RewriteRuleSubtreeStream(adaptor,"rule type_void");
        RewriteRuleSubtreeStream stream_id_rule=new RewriteRuleSubtreeStream(adaptor,"rule id_rule");
        try {
            // src/parser/Music.g:61:13: ( type_void id= id_rule '(' list_arguments ')' '{' listInst '}' -> ^( FUNCTION[$id.text] type_void list_arguments listInst ) )
            // src/parser/Music.g:61:16: type_void id= id_rule '(' list_arguments ')' '{' listInst '}'
            {
            pushFollow(FOLLOW_type_void_in_function459);
            type_void14=type_void();

            state._fsp--;

            stream_type_void.add(type_void14.getTree());

            pushFollow(FOLLOW_id_rule_in_function463);
            id=id_rule();

            state._fsp--;

            stream_id_rule.add(id.getTree());

            char_literal15=(Token)match(input,91,FOLLOW_91_in_function465);  
            stream_91.add(char_literal15);


            pushFollow(FOLLOW_list_arguments_in_function467);
            list_arguments16=list_arguments();

            state._fsp--;

            stream_list_arguments.add(list_arguments16.getTree());

            char_literal17=(Token)match(input,92,FOLLOW_92_in_function469);  
            stream_92.add(char_literal17);


            char_literal18=(Token)match(input,97,FOLLOW_97_in_function471);  
            stream_97.add(char_literal18);


            pushFollow(FOLLOW_listInst_in_function473);
            listInst19=listInst();

            state._fsp--;

            stream_listInst.add(listInst19.getTree());

            char_literal20=(Token)match(input,98,FOLLOW_98_in_function475);  
            stream_98.add(char_literal20);


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

        Token char_literal21=null;
        Token char_literal23=null;
        MusicParser.id_rule_return id =null;

        MusicParser.params_return params22 =null;


        AmlTree char_literal21_tree=null;
        AmlTree char_literal23_tree=null;
        RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
        RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
        RewriteRuleSubtreeStream stream_id_rule=new RewriteRuleSubtreeStream(adaptor,"rule id_rule");
        RewriteRuleSubtreeStream stream_params=new RewriteRuleSubtreeStream(adaptor,"rule params");
        try {
            // src/parser/Music.g:64:13: (id= id_rule '(' ( params )? ')' -> ^( FUNCALL[$id.text] ( params )? ) )
            // src/parser/Music.g:64:17: id= id_rule '(' ( params )? ')'
            {
            pushFollow(FOLLOW_id_rule_in_funcall522);
            id=id_rule();

            state._fsp--;

            stream_id_rule.add(id.getTree());

            char_literal21=(Token)match(input,91,FOLLOW_91_in_funcall524);  
            stream_91.add(char_literal21);


            // src/parser/Music.g:64:32: ( params )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==ARMOR||LA5_0==BEMOL||LA5_0==CHORD||LA5_0==DRUMS_NOTE_TYPE||LA5_0==FALSE||LA5_0==ID||LA5_0==LETTER_X||LA5_0==MINUS||(LA5_0 >= NOT && LA5_0 <= NOTE)||LA5_0==NUM||LA5_0==PLUS||LA5_0==STRING||LA5_0==SUSTAIN||LA5_0==TRUE||LA5_0==91) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // src/parser/Music.g:64:32: params
                    {
                    pushFollow(FOLLOW_params_in_funcall526);
                    params22=params();

                    state._fsp--;

                    stream_params.add(params22.getTree());

                    }
                    break;

            }


            char_literal23=(Token)match(input,92,FOLLOW_92_in_funcall529);  
            stream_92.add(char_literal23);


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

        Token FRAGMENT24=null;
        Token char_literal26=null;
        Token char_literal28=null;
        Token char_literal29=null;
        Token char_literal31=null;
        MusicParser.id_rule_return id_rule25 =null;

        MusicParser.list_arguments_return list_arguments27 =null;

        MusicParser.list_music_inst_return list_music_inst30 =null;


        AmlTree FRAGMENT24_tree=null;
        AmlTree char_literal26_tree=null;
        AmlTree char_literal28_tree=null;
        AmlTree char_literal29_tree=null;
        AmlTree char_literal31_tree=null;

        try {
            // src/parser/Music.g:67:9: ( FRAGMENT ^ id_rule '(' ! list_arguments ')' ! '{' ! list_music_inst '}' !)
            // src/parser/Music.g:67:11: FRAGMENT ^ id_rule '(' ! list_arguments ')' ! '{' ! list_music_inst '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            FRAGMENT24=(Token)match(input,FRAGMENT,FOLLOW_FRAGMENT_in_frag563); 
            FRAGMENT24_tree = 
            (AmlTree)adaptor.create(FRAGMENT24)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(FRAGMENT24_tree, root_0);


            pushFollow(FOLLOW_id_rule_in_frag566);
            id_rule25=id_rule();

            state._fsp--;

            adaptor.addChild(root_0, id_rule25.getTree());

            char_literal26=(Token)match(input,91,FOLLOW_91_in_frag568); 

            pushFollow(FOLLOW_list_arguments_in_frag571);
            list_arguments27=list_arguments();

            state._fsp--;

            adaptor.addChild(root_0, list_arguments27.getTree());

            char_literal28=(Token)match(input,92,FOLLOW_92_in_frag573); 

            char_literal29=(Token)match(input,97,FOLLOW_97_in_frag576); 

            pushFollow(FOLLOW_list_music_inst_in_frag579);
            list_music_inst30=list_music_inst();

            state._fsp--;

            adaptor.addChild(root_0, list_music_inst30.getTree());

            char_literal31=(Token)match(input,98,FOLLOW_98_in_frag581); 

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

        Token char_literal33=null;
        MusicParser.argument_return argument32 =null;

        MusicParser.argument_return argument34 =null;


        AmlTree char_literal33_tree=null;
        RewriteRuleTokenStream stream_93=new RewriteRuleTokenStream(adaptor,"token 93");
        RewriteRuleSubtreeStream stream_argument=new RewriteRuleSubtreeStream(adaptor,"rule argument");
        try {
            // src/parser/Music.g:70:17: ( ( argument ( ',' argument )* )? -> ^( LIST_ARGUMENTS ( argument )* ) )
            // src/parser/Music.g:70:19: ( argument ( ',' argument )* )?
            {
            // src/parser/Music.g:70:19: ( argument ( ',' argument )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==BOOL||LA7_0==CHORD||LA7_0==DRUMS_NOTE_TYPE||LA7_0==INT||LA7_0==NOTE_TYPE||LA7_0==STRING_TYPE) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // src/parser/Music.g:70:20: argument ( ',' argument )*
                    {
                    pushFollow(FOLLOW_argument_in_list_arguments601);
                    argument32=argument();

                    state._fsp--;

                    stream_argument.add(argument32.getTree());

                    // src/parser/Music.g:70:29: ( ',' argument )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==93) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // src/parser/Music.g:70:30: ',' argument
                    	    {
                    	    char_literal33=(Token)match(input,93,FOLLOW_93_in_list_arguments604);  
                    	    stream_93.add(char_literal33);


                    	    pushFollow(FOLLOW_argument_in_list_arguments606);
                    	    argument34=argument();

                    	    state._fsp--;

                    	    stream_argument.add(argument34.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
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

        MusicParser.type_return type35 =null;

        MusicParser.id_rule_return id_rule36 =null;



        try {
            // src/parser/Music.g:73:11: ( type ^ id_rule )
            // src/parser/Music.g:73:15: type ^ id_rule
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_type_in_argument647);
            type35=type();

            state._fsp--;

            root_0 = (AmlTree)adaptor.becomeRoot(type35.getTree(), root_0);

            pushFollow(FOLLOW_id_rule_in_argument650);
            id_rule36=id_rule();

            state._fsp--;

            adaptor.addChild(root_0, id_rule36.getTree());

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

        Token char_literal40=null;
        MusicParser.expr_return expr37 =null;

        MusicParser.notes_variable_return notes_variable38 =null;

        MusicParser.drumsnotes_variable_return drumsnotes_variable39 =null;

        MusicParser.expr_return expr41 =null;

        MusicParser.notes_variable_return notes_variable42 =null;

        MusicParser.drumsnotes_variable_return drumsnotes_variable43 =null;


        AmlTree char_literal40_tree=null;

        try {
            // src/parser/Music.g:76:13: ( ( expr | notes_variable | drumsnotes_variable ) ( ',' ! ( expr | notes_variable | drumsnotes_variable ) )* )
            // src/parser/Music.g:76:17: ( expr | notes_variable | drumsnotes_variable ) ( ',' ! ( expr | notes_variable | drumsnotes_variable ) )*
            {
            root_0 = (AmlTree)adaptor.nil();


            // src/parser/Music.g:76:17: ( expr | notes_variable | drumsnotes_variable )
            int alt8=3;
            switch ( input.LA(1) ) {
            case FALSE:
            case ID:
            case LETTER_X:
            case MINUS:
            case NOT:
            case NUM:
            case PLUS:
            case STRING:
            case TRUE:
                {
                alt8=1;
                }
                break;
            case 91:
                {
                switch ( input.LA(2) ) {
                case FALSE:
                case ID:
                case LETTER_X:
                case MINUS:
                case NOT:
                case NUM:
                case PLUS:
                case STRING:
                case TRUE:
                case 91:
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
                case DRUMS_NOTE_TYPE:
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
                {
                alt8=2;
                }
                break;
            case DRUMS_NOTE_TYPE:
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
                    // src/parser/Music.g:76:18: expr
                    {
                    pushFollow(FOLLOW_expr_in_params677);
                    expr37=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr37.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:76:25: notes_variable
                    {
                    pushFollow(FOLLOW_notes_variable_in_params681);
                    notes_variable38=notes_variable();

                    state._fsp--;

                    adaptor.addChild(root_0, notes_variable38.getTree());

                    }
                    break;
                case 3 :
                    // src/parser/Music.g:76:42: drumsnotes_variable
                    {
                    pushFollow(FOLLOW_drumsnotes_variable_in_params685);
                    drumsnotes_variable39=drumsnotes_variable();

                    state._fsp--;

                    adaptor.addChild(root_0, drumsnotes_variable39.getTree());

                    }
                    break;

            }


            // src/parser/Music.g:76:63: ( ',' ! ( expr | notes_variable | drumsnotes_variable ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==93) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // src/parser/Music.g:76:64: ',' ! ( expr | notes_variable | drumsnotes_variable )
            	    {
            	    char_literal40=(Token)match(input,93,FOLLOW_93_in_params689); 

            	    // src/parser/Music.g:76:69: ( expr | notes_variable | drumsnotes_variable )
            	    int alt9=3;
            	    switch ( input.LA(1) ) {
            	    case FALSE:
            	    case ID:
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
            	    case 91:
            	        {
            	        switch ( input.LA(2) ) {
            	        case FALSE:
            	        case ID:
            	        case LETTER_X:
            	        case MINUS:
            	        case NOT:
            	        case NUM:
            	        case PLUS:
            	        case STRING:
            	        case TRUE:
            	        case 91:
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
            	            // src/parser/Music.g:76:70: expr
            	            {
            	            pushFollow(FOLLOW_expr_in_params693);
            	            expr41=expr();

            	            state._fsp--;

            	            adaptor.addChild(root_0, expr41.getTree());

            	            }
            	            break;
            	        case 2 :
            	            // src/parser/Music.g:76:77: notes_variable
            	            {
            	            pushFollow(FOLLOW_notes_variable_in_params697);
            	            notes_variable42=notes_variable();

            	            state._fsp--;

            	            adaptor.addChild(root_0, notes_variable42.getTree());

            	            }
            	            break;
            	        case 3 :
            	            // src/parser/Music.g:76:94: drumsnotes_variable
            	            {
            	            pushFollow(FOLLOW_drumsnotes_variable_in_params701);
            	            drumsnotes_variable43=drumsnotes_variable();

            	            state._fsp--;

            	            adaptor.addChild(root_0, drumsnotes_variable43.getTree());

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
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

        MusicParser.inst_return inst44 =null;


        RewriteRuleSubtreeStream stream_inst=new RewriteRuleSubtreeStream(adaptor,"rule inst");
        try {
            // src/parser/Music.g:79:13: ( ( inst )+ -> ^( LIST_INSTRUCTIONS ( inst )+ ) )
            // src/parser/Music.g:79:16: ( inst )+
            {
            // src/parser/Music.g:79:16: ( inst )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==BEAT||LA11_0==BOOL||LA11_0==CHORD||LA11_0==DECR||LA11_0==DOUBLE_BAR||LA11_0==DRUMS_NOTE_TYPE||LA11_0==FOR||(LA11_0 >= ID && LA11_0 <= INT)||LA11_0==LETTER_X||LA11_0==NOTE_TYPE||LA11_0==NUM||LA11_0==RETURN||(LA11_0 >= SONG && LA11_0 <= START_REPETITION)||LA11_0==STRING_TYPE||LA11_0==TONE||LA11_0==WHILE) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // src/parser/Music.g:79:16: inst
            	    {
            	    pushFollow(FOLLOW_inst_in_listInst729);
            	    inst44=inst();

            	    state._fsp--;

            	    stream_inst.add(inst44.getTree());

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

        MusicParser.music_inst_return music_inst45 =null;


        RewriteRuleSubtreeStream stream_music_inst=new RewriteRuleSubtreeStream(adaptor,"rule music_inst");
        try {
            // src/parser/Music.g:82:17: ( ( music_inst )+ -> ^( LIST_MUSIC_INST ( music_inst )+ ) )
            // src/parser/Music.g:82:21: ( music_inst )+
            {
            // src/parser/Music.g:82:21: ( music_inst )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==ARMOR||(LA12_0 >= BEAT && LA12_0 <= BOOL)||LA12_0==CHORD||LA12_0==DECR||LA12_0==DRUMS_NOTE_TYPE||LA12_0==FOR||(LA12_0 >= ID && LA12_0 <= INT)||LA12_0==LETTER_X||LA12_0==NOTE||LA12_0==NOTE_TYPE||(LA12_0 >= SONG && LA12_0 <= SPEED)||(LA12_0 >= STRING_TYPE && LA12_0 <= SUSTAIN)||LA12_0==TONE||LA12_0==WHILE||LA12_0==91) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // src/parser/Music.g:82:21: music_inst
            	    {
            	    pushFollow(FOLLOW_music_inst_in_list_music_inst763);
            	    music_inst45=music_inst();

            	    state._fsp--;

            	    stream_music_inst.add(music_inst45.getTree());

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

        Token string_literal47=null;
        Token char_literal51=null;
        Token char_literal54=null;
        Token char_literal56=null;
        Token char_literal58=null;
        Token char_literal60=null;
        Token char_literal64=null;
        MusicParser.declaration_return declaration46 =null;

        MusicParser.expr_return expr48 =null;

        MusicParser.notes_group_return notes_group49 =null;

        MusicParser.drumsnotes_group_return drumsnotes_group50 =null;

        MusicParser.var_funcall_return var_funcall52 =null;

        MusicParser.tone_return tone53 =null;

        MusicParser.beat_return beat55 =null;

        MusicParser.speed_return speed57 =null;

        MusicParser.instrument_return instrument59 =null;

        MusicParser.assignation_return assignation61 =null;

        MusicParser.while_stmt_return while_stmt62 =null;

        MusicParser.funcall_return funcall63 =null;

        MusicParser.for_stmt_return for_stmt65 =null;

        MusicParser.if_stmt_return if_stmt66 =null;

        MusicParser.song_return song67 =null;

        MusicParser.compas_list_return compas_list68 =null;


        AmlTree string_literal47_tree=null;
        AmlTree char_literal51_tree=null;
        AmlTree char_literal54_tree=null;
        AmlTree char_literal56_tree=null;
        AmlTree char_literal58_tree=null;
        AmlTree char_literal60_tree=null;
        AmlTree char_literal64_tree=null;

        try {
            // src/parser/Music.g:85:13: ( declaration | 'return' ^ ( expr | notes_group | drumsnotes_group ) ';' !| var_funcall | tone ';' !| beat ';' !| speed ';' !| instrument ';' !| assignation | while_stmt | funcall ';' !| for_stmt | if_stmt | song | compas_list )
            int alt14=14;
            switch ( input.LA(1) ) {
            case BOOL:
            case CHORD:
            case DRUMS_NOTE_TYPE:
            case INT:
            case NOTE_TYPE:
            case STRING_TYPE:
                {
                alt14=1;
                }
                break;
            case RETURN:
                {
                alt14=2;
                }
                break;
            case ID:
            case LETTER_X:
                {
                switch ( input.LA(2) ) {
                case 94:
                    {
                    int LA14_14 = input.LA(3);

                    if ( (LA14_14==ID||LA14_14==LETTER_X) ) {
                        int LA14_16 = input.LA(4);

                        if ( (LA14_16==91) ) {
                            alt14=3;
                        }
                        else if ( (LA14_16==ASSIG||LA14_16==DECR||LA14_16==DIVIDE_ASSIG||LA14_16==INCR||LA14_16==MINUS_ASSIG||LA14_16==MOD_ASSIG||LA14_16==PLUS_ASSIG||LA14_16==PROD_ASSIG) ) {
                            alt14=8;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 14, 16, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 14, input);

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
                    alt14=8;
                    }
                    break;
                case 91:
                    {
                    alt14=10;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 3, input);

                    throw nvae;

                }

                }
                break;
            case TONE:
                {
                alt14=4;
                }
                break;
            case BEAT:
                {
                alt14=5;
                }
                break;
            case SPEED:
                {
                alt14=6;
                }
                break;
            case INSTRUMENT:
                {
                alt14=7;
                }
                break;
            case DECR:
            case INCR:
                {
                alt14=8;
                }
                break;
            case WHILE:
                {
                alt14=9;
                }
                break;
            case FOR:
                {
                alt14=11;
                }
                break;
            case IF:
                {
                alt14=12;
                }
                break;
            case SONG:
                {
                alt14=13;
                }
                break;
            case DOUBLE_BAR:
            case NUM:
            case START_REPETITION:
                {
                alt14=14;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }

            switch (alt14) {
                case 1 :
                    // src/parser/Music.g:85:17: declaration
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_declaration_in_inst807);
                    declaration46=declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, declaration46.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:86:17: 'return' ^ ( expr | notes_group | drumsnotes_group ) ';' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    string_literal47=(Token)match(input,RETURN,FOLLOW_RETURN_in_inst825); 
                    string_literal47_tree = 
                    (AmlTree)adaptor.create(string_literal47)
                    ;
                    root_0 = (AmlTree)adaptor.becomeRoot(string_literal47_tree, root_0);


                    // src/parser/Music.g:86:27: ( expr | notes_group | drumsnotes_group )
                    int alt13=3;
                    switch ( input.LA(1) ) {
                    case FALSE:
                    case ID:
                    case LETTER_X:
                    case MINUS:
                    case NOT:
                    case NUM:
                    case PLUS:
                    case STRING:
                    case TRUE:
                        {
                        alt13=1;
                        }
                        break;
                    case 91:
                        {
                        switch ( input.LA(2) ) {
                        case FALSE:
                        case ID:
                        case LETTER_X:
                        case MINUS:
                        case NOT:
                        case NUM:
                        case PLUS:
                        case STRING:
                        case TRUE:
                        case 91:
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
                        case DRUMS_NOTE_TYPE:
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
                        {
                        alt13=2;
                        }
                        break;
                    case DRUMS_NOTE_TYPE:
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
                            // src/parser/Music.g:86:28: expr
                            {
                            pushFollow(FOLLOW_expr_in_inst829);
                            expr48=expr();

                            state._fsp--;

                            adaptor.addChild(root_0, expr48.getTree());

                            }
                            break;
                        case 2 :
                            // src/parser/Music.g:86:35: notes_group
                            {
                            pushFollow(FOLLOW_notes_group_in_inst833);
                            notes_group49=notes_group();

                            state._fsp--;

                            adaptor.addChild(root_0, notes_group49.getTree());

                            }
                            break;
                        case 3 :
                            // src/parser/Music.g:86:49: drumsnotes_group
                            {
                            pushFollow(FOLLOW_drumsnotes_group_in_inst837);
                            drumsnotes_group50=drumsnotes_group();

                            state._fsp--;

                            adaptor.addChild(root_0, drumsnotes_group50.getTree());

                            }
                            break;

                    }


                    char_literal51=(Token)match(input,96,FOLLOW_96_in_inst840); 

                    }
                    break;
                case 3 :
                    // src/parser/Music.g:87:17: var_funcall
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_var_funcall_in_inst859);
                    var_funcall52=var_funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, var_funcall52.getTree());

                    }
                    break;
                case 4 :
                    // src/parser/Music.g:88:17: tone ';' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_tone_in_inst877);
                    tone53=tone();

                    state._fsp--;

                    adaptor.addChild(root_0, tone53.getTree());

                    char_literal54=(Token)match(input,96,FOLLOW_96_in_inst879); 

                    }
                    break;
                case 5 :
                    // src/parser/Music.g:89:17: beat ';' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_beat_in_inst898);
                    beat55=beat();

                    state._fsp--;

                    adaptor.addChild(root_0, beat55.getTree());

                    char_literal56=(Token)match(input,96,FOLLOW_96_in_inst900); 

                    }
                    break;
                case 6 :
                    // src/parser/Music.g:90:17: speed ';' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_speed_in_inst919);
                    speed57=speed();

                    state._fsp--;

                    adaptor.addChild(root_0, speed57.getTree());

                    char_literal58=(Token)match(input,96,FOLLOW_96_in_inst921); 

                    }
                    break;
                case 7 :
                    // src/parser/Music.g:91:17: instrument ';' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_instrument_in_inst940);
                    instrument59=instrument();

                    state._fsp--;

                    adaptor.addChild(root_0, instrument59.getTree());

                    char_literal60=(Token)match(input,96,FOLLOW_96_in_inst942); 

                    }
                    break;
                case 8 :
                    // src/parser/Music.g:92:17: assignation
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_assignation_in_inst961);
                    assignation61=assignation();

                    state._fsp--;

                    adaptor.addChild(root_0, assignation61.getTree());

                    }
                    break;
                case 9 :
                    // src/parser/Music.g:93:17: while_stmt
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_while_stmt_in_inst979);
                    while_stmt62=while_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, while_stmt62.getTree());

                    }
                    break;
                case 10 :
                    // src/parser/Music.g:94:17: funcall ';' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_inst997);
                    funcall63=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall63.getTree());

                    char_literal64=(Token)match(input,96,FOLLOW_96_in_inst999); 

                    }
                    break;
                case 11 :
                    // src/parser/Music.g:95:17: for_stmt
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_for_stmt_in_inst1018);
                    for_stmt65=for_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, for_stmt65.getTree());

                    }
                    break;
                case 12 :
                    // src/parser/Music.g:96:17: if_stmt
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_if_stmt_in_inst1036);
                    if_stmt66=if_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, if_stmt66.getTree());

                    }
                    break;
                case 13 :
                    // src/parser/Music.g:97:17: song
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_song_in_inst1054);
                    song67=song();

                    state._fsp--;

                    adaptor.addChild(root_0, song67.getTree());

                    }
                    break;
                case 14 :
                    // src/parser/Music.g:98:17: compas_list
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_compas_list_in_inst1072);
                    compas_list68=compas_list();

                    state._fsp--;

                    adaptor.addChild(root_0, compas_list68.getTree());

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

        Token char_literal71=null;
        Token char_literal73=null;
        Token char_literal75=null;
        Token char_literal77=null;
        Token char_literal82=null;
        Token char_literal87=null;
        Token char_literal89=null;
        MusicParser.declaration_return declaration69 =null;

        MusicParser.tone_return tone70 =null;

        MusicParser.beat_return beat72 =null;

        MusicParser.speed_return speed74 =null;

        MusicParser.instrument_return instrument76 =null;

        MusicParser.var_funcall_return var_funcall78 =null;

        MusicParser.assignation_return assignation79 =null;

        MusicParser.while_music_stmt_return while_music_stmt80 =null;

        MusicParser.funcall_return funcall81 =null;

        MusicParser.for_music_stmt_return for_music_stmt83 =null;

        MusicParser.if_music_stmt_return if_music_stmt84 =null;

        MusicParser.song_return song85 =null;

        MusicParser.notes_group_return notes_group86 =null;

        MusicParser.drumsnotes_group_return drumsnotes_group88 =null;


        AmlTree char_literal71_tree=null;
        AmlTree char_literal73_tree=null;
        AmlTree char_literal75_tree=null;
        AmlTree char_literal77_tree=null;
        AmlTree char_literal82_tree=null;
        AmlTree char_literal87_tree=null;
        AmlTree char_literal89_tree=null;

        try {
            // src/parser/Music.g:101:13: ( declaration | tone ';' !| beat ';' !| speed ';' !| instrument ';' !| var_funcall | assignation | while_music_stmt | funcall ';' !| for_music_stmt | if_music_stmt | song | ( options {greedy=true; } : notes_group )+ ( ';' !)? | ( options {greedy=true; } : drumsnotes_group )+ ( ';' !)? )
            int alt19=14;
            switch ( input.LA(1) ) {
            case CHORD:
                {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==91) ) {
                    alt19=13;
                }
                else if ( (LA19_1==ID||LA19_1==LETTER_X) ) {
                    alt19=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;

                }
                }
                break;
            case TONE:
                {
                alt19=2;
                }
                break;
            case BEAT:
                {
                alt19=3;
                }
                break;
            case SPEED:
                {
                alt19=4;
                }
                break;
            case INSTRUMENT:
                {
                alt19=5;
                }
                break;
            case ID:
            case LETTER_X:
                {
                switch ( input.LA(2) ) {
                case 94:
                    {
                    int LA19_16 = input.LA(3);

                    if ( (LA19_16==ID||LA19_16==LETTER_X) ) {
                        int LA19_19 = input.LA(4);

                        if ( (LA19_19==91) ) {
                            alt19=6;
                        }
                        else if ( (LA19_19==ASSIG||LA19_19==DECR||LA19_19==DIVIDE_ASSIG||LA19_19==INCR||LA19_19==MINUS_ASSIG||LA19_19==MOD_ASSIG||LA19_19==PLUS_ASSIG||LA19_19==PROD_ASSIG) ) {
                            alt19=7;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 19, 19, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 16, input);

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
                    alt19=7;
                    }
                    break;
                case 91:
                    {
                    alt19=9;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 6, input);

                    throw nvae;

                }

                }
                break;
            case DECR:
            case INCR:
                {
                alt19=7;
                }
                break;
            case WHILE:
                {
                alt19=8;
                }
                break;
            case FOR:
                {
                alt19=10;
                }
                break;
            case IF:
                {
                alt19=11;
                }
                break;
            case SONG:
                {
                alt19=12;
                }
                break;
            case DRUMS_NOTE_TYPE:
                {
                int LA19_12 = input.LA(2);

                if ( (LA19_12==91) ) {
                    alt19=14;
                }
                else if ( (LA19_12==ID||LA19_12==LETTER_X) ) {
                    alt19=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 12, input);

                    throw nvae;

                }
                }
                break;
            case 91:
                {
                int LA19_13 = input.LA(2);

                if ( (LA19_13==ARMOR||LA19_13==BEMOL||LA19_13==NOTE||LA19_13==SUSTAIN) ) {
                    alt19=13;
                }
                else if ( (LA19_13==DRUMS_NOTE_TYPE) ) {
                    alt19=14;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 13, input);

                    throw nvae;

                }
                }
                break;
            case ARMOR:
            case BEMOL:
            case NOTE:
            case SUSTAIN:
                {
                alt19=13;
                }
                break;
            case BOOL:
            case INT:
            case NOTE_TYPE:
            case STRING_TYPE:
                {
                alt19=1;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }

            switch (alt19) {
                case 1 :
                    // src/parser/Music.g:101:17: declaration
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_declaration_in_music_inst1096);
                    declaration69=declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, declaration69.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:102:17: tone ';' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_tone_in_music_inst1114);
                    tone70=tone();

                    state._fsp--;

                    adaptor.addChild(root_0, tone70.getTree());

                    char_literal71=(Token)match(input,96,FOLLOW_96_in_music_inst1116); 

                    }
                    break;
                case 3 :
                    // src/parser/Music.g:103:17: beat ';' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_beat_in_music_inst1135);
                    beat72=beat();

                    state._fsp--;

                    adaptor.addChild(root_0, beat72.getTree());

                    char_literal73=(Token)match(input,96,FOLLOW_96_in_music_inst1137); 

                    }
                    break;
                case 4 :
                    // src/parser/Music.g:104:17: speed ';' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_speed_in_music_inst1156);
                    speed74=speed();

                    state._fsp--;

                    adaptor.addChild(root_0, speed74.getTree());

                    char_literal75=(Token)match(input,96,FOLLOW_96_in_music_inst1158); 

                    }
                    break;
                case 5 :
                    // src/parser/Music.g:105:17: instrument ';' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_instrument_in_music_inst1177);
                    instrument76=instrument();

                    state._fsp--;

                    adaptor.addChild(root_0, instrument76.getTree());

                    char_literal77=(Token)match(input,96,FOLLOW_96_in_music_inst1179); 

                    }
                    break;
                case 6 :
                    // src/parser/Music.g:106:17: var_funcall
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_var_funcall_in_music_inst1198);
                    var_funcall78=var_funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, var_funcall78.getTree());

                    }
                    break;
                case 7 :
                    // src/parser/Music.g:107:17: assignation
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_assignation_in_music_inst1216);
                    assignation79=assignation();

                    state._fsp--;

                    adaptor.addChild(root_0, assignation79.getTree());

                    }
                    break;
                case 8 :
                    // src/parser/Music.g:108:17: while_music_stmt
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_while_music_stmt_in_music_inst1234);
                    while_music_stmt80=while_music_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, while_music_stmt80.getTree());

                    }
                    break;
                case 9 :
                    // src/parser/Music.g:109:17: funcall ';' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_music_inst1252);
                    funcall81=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall81.getTree());

                    char_literal82=(Token)match(input,96,FOLLOW_96_in_music_inst1254); 

                    }
                    break;
                case 10 :
                    // src/parser/Music.g:110:17: for_music_stmt
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_for_music_stmt_in_music_inst1273);
                    for_music_stmt83=for_music_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, for_music_stmt83.getTree());

                    }
                    break;
                case 11 :
                    // src/parser/Music.g:111:17: if_music_stmt
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_if_music_stmt_in_music_inst1291);
                    if_music_stmt84=if_music_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, if_music_stmt84.getTree());

                    }
                    break;
                case 12 :
                    // src/parser/Music.g:112:17: song
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_song_in_music_inst1309);
                    song85=song();

                    state._fsp--;

                    adaptor.addChild(root_0, song85.getTree());

                    }
                    break;
                case 13 :
                    // src/parser/Music.g:113:16: ( options {greedy=true; } : notes_group )+ ( ';' !)?
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    // src/parser/Music.g:113:16: ( options {greedy=true; } : notes_group )+
                    int cnt15=0;
                    loop15:
                    do {
                        int alt15=2;
                        switch ( input.LA(1) ) {
                        case CHORD:
                            {
                            alt15=1;
                            }
                            break;
                        case 91:
                            {
                            alt15=1;
                            }
                            break;
                        case ARMOR:
                        case BEMOL:
                        case SUSTAIN:
                            {
                            alt15=1;
                            }
                            break;
                        case NOTE:
                            {
                            alt15=1;
                            }
                            break;

                        }

                        switch (alt15) {
                    	case 1 :
                    	    // src/parser/Music.g:113:42: notes_group
                    	    {
                    	    pushFollow(FOLLOW_notes_group_in_music_inst1336);
                    	    notes_group86=notes_group();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, notes_group86.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt15 >= 1 ) break loop15;
                                EarlyExitException eee =
                                    new EarlyExitException(15, input);
                                throw eee;
                        }
                        cnt15++;
                    } while (true);


                    // src/parser/Music.g:113:59: ( ';' !)?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==96) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // src/parser/Music.g:113:59: ';' !
                            {
                            char_literal87=(Token)match(input,96,FOLLOW_96_in_music_inst1340); 

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
                    int cnt17=0;
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==DRUMS_NOTE_TYPE) ) {
                            alt17=1;
                        }
                        else if ( (LA17_0==91) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // src/parser/Music.g:114:42: drumsnotes_group
                    	    {
                    	    pushFollow(FOLLOW_drumsnotes_group_in_music_inst1369);
                    	    drumsnotes_group88=drumsnotes_group();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, drumsnotes_group88.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt17 >= 1 ) break loop17;
                                EarlyExitException eee =
                                    new EarlyExitException(17, input);
                                throw eee;
                        }
                        cnt17++;
                    } while (true);


                    // src/parser/Music.g:114:64: ( ';' !)?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==96) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // src/parser/Music.g:114:64: ';' !
                            {
                            char_literal89=(Token)match(input,96,FOLLOW_96_in_music_inst1373); 

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

        Token char_literal92=null;
        Token char_literal94=null;
        MusicParser.type_return type90 =null;

        MusicParser.assig_opt_return assig_opt91 =null;

        MusicParser.assig_opt_return assig_opt93 =null;


        AmlTree char_literal92_tree=null;
        AmlTree char_literal94_tree=null;

        try {
            // src/parser/Music.g:117:13: ( type ^ assig_opt ( ',' ! assig_opt )* ';' !)
            // src/parser/Music.g:117:17: type ^ assig_opt ( ',' ! assig_opt )* ';' !
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_type_in_declaration1398);
            type90=type();

            state._fsp--;

            root_0 = (AmlTree)adaptor.becomeRoot(type90.getTree(), root_0);

            pushFollow(FOLLOW_assig_opt_in_declaration1401);
            assig_opt91=assig_opt();

            state._fsp--;

            adaptor.addChild(root_0, assig_opt91.getTree());

            // src/parser/Music.g:117:33: ( ',' ! assig_opt )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==93) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // src/parser/Music.g:117:34: ',' ! assig_opt
            	    {
            	    char_literal92=(Token)match(input,93,FOLLOW_93_in_declaration1404); 

            	    pushFollow(FOLLOW_assig_opt_in_declaration1407);
            	    assig_opt93=assig_opt();

            	    state._fsp--;

            	    adaptor.addChild(root_0, assig_opt93.getTree());

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            char_literal94=(Token)match(input,96,FOLLOW_96_in_declaration1411); 

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

        Token set95=null;

        AmlTree set95_tree=null;

        try {
            // src/parser/Music.g:120:13: ( INT | BOOL | NOTE_TYPE | DRUMS_NOTE_TYPE | CHORD | STRING_TYPE )
            // src/parser/Music.g:
            {
            root_0 = (AmlTree)adaptor.nil();


            set95=(Token)input.LT(1);

            if ( input.LA(1)==BOOL||input.LA(1)==CHORD||input.LA(1)==DRUMS_NOTE_TYPE||input.LA(1)==INT||input.LA(1)==NOTE_TYPE||input.LA(1)==STRING_TYPE ) {
                input.consume();
                adaptor.addChild(root_0, 
                (AmlTree)adaptor.create(set95)
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

        Token VOID97=null;
        MusicParser.type_return type96 =null;


        AmlTree VOID97_tree=null;

        try {
            // src/parser/Music.g:128:13: ( type | VOID )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==BOOL||LA21_0==CHORD||LA21_0==DRUMS_NOTE_TYPE||LA21_0==INT||LA21_0==NOTE_TYPE||LA21_0==STRING_TYPE) ) {
                alt21=1;
            }
            else if ( (LA21_0==VOID) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }
            switch (alt21) {
                case 1 :
                    // src/parser/Music.g:128:17: type
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_type_in_type_void1557);
                    type96=type();

                    state._fsp--;

                    adaptor.addChild(root_0, type96.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:129:17: VOID
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    VOID97=(Token)match(input,VOID,FOLLOW_VOID_in_type_void1575); 
                    VOID97_tree = 
                    (AmlTree)adaptor.create(VOID97)
                    ;
                    adaptor.addChild(root_0, VOID97_tree);


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

        Token ASSIG99=null;
        MusicParser.id_rule_return id_rule98 =null;

        MusicParser.expr_return expr100 =null;

        MusicParser.notes_variable_return notes_variable101 =null;

        MusicParser.drumsnotes_variable_return drumsnotes_variable102 =null;


        AmlTree ASSIG99_tree=null;

        try {
            // src/parser/Music.g:132:13: ( id_rule ( ASSIG ^ ( expr | notes_variable | drumsnotes_variable ) )? )
            // src/parser/Music.g:132:17: id_rule ( ASSIG ^ ( expr | notes_variable | drumsnotes_variable ) )?
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_id_rule_in_assig_opt1600);
            id_rule98=id_rule();

            state._fsp--;

            adaptor.addChild(root_0, id_rule98.getTree());

            // src/parser/Music.g:132:25: ( ASSIG ^ ( expr | notes_variable | drumsnotes_variable ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==ASSIG) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // src/parser/Music.g:132:26: ASSIG ^ ( expr | notes_variable | drumsnotes_variable )
                    {
                    ASSIG99=(Token)match(input,ASSIG,FOLLOW_ASSIG_in_assig_opt1603); 
                    ASSIG99_tree = 
                    (AmlTree)adaptor.create(ASSIG99)
                    ;
                    root_0 = (AmlTree)adaptor.becomeRoot(ASSIG99_tree, root_0);


                    // src/parser/Music.g:132:33: ( expr | notes_variable | drumsnotes_variable )
                    int alt22=3;
                    switch ( input.LA(1) ) {
                    case FALSE:
                    case ID:
                    case LETTER_X:
                    case MINUS:
                    case NOT:
                    case NUM:
                    case PLUS:
                    case STRING:
                    case TRUE:
                        {
                        alt22=1;
                        }
                        break;
                    case 91:
                        {
                        switch ( input.LA(2) ) {
                        case FALSE:
                        case ID:
                        case LETTER_X:
                        case MINUS:
                        case NOT:
                        case NUM:
                        case PLUS:
                        case STRING:
                        case TRUE:
                        case 91:
                            {
                            alt22=1;
                            }
                            break;
                        case ARMOR:
                        case BEMOL:
                        case NOTE:
                        case SUSTAIN:
                            {
                            alt22=2;
                            }
                            break;
                        case DRUMS_NOTE_TYPE:
                            {
                            alt22=3;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 22, 2, input);

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
                        alt22=2;
                        }
                        break;
                    case DRUMS_NOTE_TYPE:
                        {
                        alt22=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 0, input);

                        throw nvae;

                    }

                    switch (alt22) {
                        case 1 :
                            // src/parser/Music.g:132:34: expr
                            {
                            pushFollow(FOLLOW_expr_in_assig_opt1607);
                            expr100=expr();

                            state._fsp--;

                            adaptor.addChild(root_0, expr100.getTree());

                            }
                            break;
                        case 2 :
                            // src/parser/Music.g:132:41: notes_variable
                            {
                            pushFollow(FOLLOW_notes_variable_in_assig_opt1611);
                            notes_variable101=notes_variable();

                            state._fsp--;

                            adaptor.addChild(root_0, notes_variable101.getTree());

                            }
                            break;
                        case 3 :
                            // src/parser/Music.g:132:58: drumsnotes_variable
                            {
                            pushFollow(FOLLOW_drumsnotes_variable_in_assig_opt1615);
                            drumsnotes_variable102=drumsnotes_variable();

                            state._fsp--;

                            adaptor.addChild(root_0, drumsnotes_variable102.getTree());

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

        Token char_literal104=null;
        MusicParser.assig_return assig103 =null;


        AmlTree char_literal104_tree=null;

        try {
            // src/parser/Music.g:135:13: ( assig ';' !)
            // src/parser/Music.g:135:17: assig ';' !
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_assig_in_assignation1641);
            assig103=assig();

            state._fsp--;

            adaptor.addChild(root_0, assig103.getTree());

            char_literal104=(Token)match(input,96,FOLLOW_96_in_assignation1643); 

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

        Token set106=null;
        Token FIGURE110=null;
        MusicParser.var_access_return var_access105 =null;

        MusicParser.expr_return expr107 =null;

        MusicParser.notes_variable_return notes_variable108 =null;

        MusicParser.drumsnotes_variable_return drumsnotes_variable109 =null;

        MusicParser.post_return post111 =null;

        MusicParser.pre_return pre112 =null;


        AmlTree set106_tree=null;
        AmlTree FIGURE110_tree=null;

        try {
            // src/parser/Music.g:138:13: ( var_access ( ASSIG | PLUS_ASSIG | MINUS_ASSIG | PROD_ASSIG | DIVIDE_ASSIG | MOD_ASSIG ) ^ ( expr | notes_variable | drumsnotes_variable | FIGURE ) | post | pre )
            int alt25=3;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==ID||LA25_0==LETTER_X) ) {
                switch ( input.LA(2) ) {
                case 94:
                    {
                    int LA25_3 = input.LA(3);

                    if ( (LA25_3==ID||LA25_3==LETTER_X) ) {
                        int LA25_6 = input.LA(4);

                        if ( (LA25_6==ASSIG||LA25_6==DIVIDE_ASSIG||LA25_6==MINUS_ASSIG||LA25_6==MOD_ASSIG||LA25_6==PLUS_ASSIG||LA25_6==PROD_ASSIG) ) {
                            alt25=1;
                        }
                        else if ( (LA25_6==DECR||LA25_6==INCR) ) {
                            alt25=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 25, 6, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 3, input);

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
                    alt25=1;
                    }
                    break;
                case DECR:
                case INCR:
                    {
                    alt25=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 1, input);

                    throw nvae;

                }

            }
            else if ( (LA25_0==DECR||LA25_0==INCR) ) {
                alt25=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;

            }
            switch (alt25) {
                case 1 :
                    // src/parser/Music.g:138:17: var_access ( ASSIG | PLUS_ASSIG | MINUS_ASSIG | PROD_ASSIG | DIVIDE_ASSIG | MOD_ASSIG ) ^ ( expr | notes_variable | drumsnotes_variable | FIGURE )
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_var_access_in_assig1673);
                    var_access105=var_access();

                    state._fsp--;

                    adaptor.addChild(root_0, var_access105.getTree());

                    set106=(Token)input.LT(1);

                    set106=(Token)input.LT(1);

                    if ( input.LA(1)==ASSIG||input.LA(1)==DIVIDE_ASSIG||input.LA(1)==MINUS_ASSIG||input.LA(1)==MOD_ASSIG||input.LA(1)==PLUS_ASSIG||input.LA(1)==PROD_ASSIG ) {
                        input.consume();
                        root_0 = (AmlTree)adaptor.becomeRoot(
                        (AmlTree)adaptor.create(set106)
                        , root_0);
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    // src/parser/Music.g:138:94: ( expr | notes_variable | drumsnotes_variable | FIGURE )
                    int alt24=4;
                    switch ( input.LA(1) ) {
                    case FALSE:
                    case ID:
                    case LETTER_X:
                    case MINUS:
                    case NOT:
                    case NUM:
                    case PLUS:
                    case STRING:
                    case TRUE:
                        {
                        alt24=1;
                        }
                        break;
                    case 91:
                        {
                        switch ( input.LA(2) ) {
                        case FALSE:
                        case ID:
                        case LETTER_X:
                        case MINUS:
                        case NOT:
                        case NUM:
                        case PLUS:
                        case STRING:
                        case TRUE:
                        case 91:
                            {
                            alt24=1;
                            }
                            break;
                        case ARMOR:
                        case BEMOL:
                        case NOTE:
                        case SUSTAIN:
                            {
                            alt24=2;
                            }
                            break;
                        case DRUMS_NOTE_TYPE:
                            {
                            alt24=3;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 24, 2, input);

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
                        alt24=2;
                        }
                        break;
                    case DRUMS_NOTE_TYPE:
                        {
                        alt24=3;
                        }
                        break;
                    case FIGURE:
                        {
                        alt24=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 0, input);

                        throw nvae;

                    }

                    switch (alt24) {
                        case 1 :
                            // src/parser/Music.g:138:95: expr
                            {
                            pushFollow(FOLLOW_expr_in_assig1691);
                            expr107=expr();

                            state._fsp--;

                            adaptor.addChild(root_0, expr107.getTree());

                            }
                            break;
                        case 2 :
                            // src/parser/Music.g:138:102: notes_variable
                            {
                            pushFollow(FOLLOW_notes_variable_in_assig1695);
                            notes_variable108=notes_variable();

                            state._fsp--;

                            adaptor.addChild(root_0, notes_variable108.getTree());

                            }
                            break;
                        case 3 :
                            // src/parser/Music.g:138:119: drumsnotes_variable
                            {
                            pushFollow(FOLLOW_drumsnotes_variable_in_assig1699);
                            drumsnotes_variable109=drumsnotes_variable();

                            state._fsp--;

                            adaptor.addChild(root_0, drumsnotes_variable109.getTree());

                            }
                            break;
                        case 4 :
                            // src/parser/Music.g:138:141: FIGURE
                            {
                            FIGURE110=(Token)match(input,FIGURE,FOLLOW_FIGURE_in_assig1703); 
                            FIGURE110_tree = 
                            (AmlTree)adaptor.create(FIGURE110)
                            ;
                            adaptor.addChild(root_0, FIGURE110_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // src/parser/Music.g:139:17: post
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_post_in_assig1722);
                    post111=post();

                    state._fsp--;

                    adaptor.addChild(root_0, post111.getTree());

                    }
                    break;
                case 3 :
                    // src/parser/Music.g:140:17: pre
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_pre_in_assig1740);
                    pre112=pre();

                    state._fsp--;

                    adaptor.addChild(root_0, pre112.getTree());

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
        MusicParser.var_access_return var_access113 =null;


        AmlTree x_tree=null;
        RewriteRuleTokenStream stream_DECR=new RewriteRuleTokenStream(adaptor,"token DECR");
        RewriteRuleTokenStream stream_INCR=new RewriteRuleTokenStream(adaptor,"token INCR");
        RewriteRuleSubtreeStream stream_var_access=new RewriteRuleSubtreeStream(adaptor,"rule var_access");
        try {
            // src/parser/Music.g:143:13: ( var_access (x= INCR |x= DECR ) -> ^( POST var_access $x) )
            // src/parser/Music.g:143:17: var_access (x= INCR |x= DECR )
            {
            pushFollow(FOLLOW_var_access_in_post1770);
            var_access113=var_access();

            state._fsp--;

            stream_var_access.add(var_access113.getTree());

            // src/parser/Music.g:143:28: (x= INCR |x= DECR )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==INCR) ) {
                alt26=1;
            }
            else if ( (LA26_0==DECR) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;

            }
            switch (alt26) {
                case 1 :
                    // src/parser/Music.g:143:29: x= INCR
                    {
                    x=(Token)match(input,INCR,FOLLOW_INCR_in_post1775);  
                    stream_INCR.add(x);


                    }
                    break;
                case 2 :
                    // src/parser/Music.g:143:38: x= DECR
                    {
                    x=(Token)match(input,DECR,FOLLOW_DECR_in_post1781);  
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
        MusicParser.var_access_return var_access114 =null;


        AmlTree x_tree=null;
        RewriteRuleTokenStream stream_DECR=new RewriteRuleTokenStream(adaptor,"token DECR");
        RewriteRuleTokenStream stream_INCR=new RewriteRuleTokenStream(adaptor,"token INCR");
        RewriteRuleSubtreeStream stream_var_access=new RewriteRuleSubtreeStream(adaptor,"rule var_access");
        try {
            // src/parser/Music.g:146:13: ( (x= INCR |x= DECR ) var_access -> ^( PRE var_access $x) )
            // src/parser/Music.g:146:17: (x= INCR |x= DECR ) var_access
            {
            // src/parser/Music.g:146:17: (x= INCR |x= DECR )
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
                    // src/parser/Music.g:146:18: x= INCR
                    {
                    x=(Token)match(input,INCR,FOLLOW_INCR_in_pre1828);  
                    stream_INCR.add(x);


                    }
                    break;
                case 2 :
                    // src/parser/Music.g:146:27: x= DECR
                    {
                    x=(Token)match(input,DECR,FOLLOW_DECR_in_pre1834);  
                    stream_DECR.add(x);


                    }
                    break;

            }


            pushFollow(FOLLOW_var_access_in_pre1837);
            var_access114=var_access();

            state._fsp--;

            stream_var_access.add(var_access114.getTree());

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

        Token BEAT115=null;
        Token NUM116=null;
        Token char_literal117=null;
        Token NUM118=null;

        AmlTree BEAT115_tree=null;
        AmlTree NUM116_tree=null;
        AmlTree char_literal117_tree=null;
        AmlTree NUM118_tree=null;

        try {
            // src/parser/Music.g:149:13: ( BEAT ^ NUM ':' ! NUM )
            // src/parser/Music.g:149:17: BEAT ^ NUM ':' ! NUM
            {
            root_0 = (AmlTree)adaptor.nil();


            BEAT115=(Token)match(input,BEAT,FOLLOW_BEAT_in_beat1880); 
            BEAT115_tree = 
            (AmlTree)adaptor.create(BEAT115)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(BEAT115_tree, root_0);


            NUM116=(Token)match(input,NUM,FOLLOW_NUM_in_beat1883); 
            NUM116_tree = 
            (AmlTree)adaptor.create(NUM116)
            ;
            adaptor.addChild(root_0, NUM116_tree);


            char_literal117=(Token)match(input,95,FOLLOW_95_in_beat1885); 

            NUM118=(Token)match(input,NUM,FOLLOW_NUM_in_beat1888); 
            NUM118_tree = 
            (AmlTree)adaptor.create(NUM118)
            ;
            adaptor.addChild(root_0, NUM118_tree);


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

        Token SPEED119=null;
        Token NUM120=null;

        AmlTree SPEED119_tree=null;
        AmlTree NUM120_tree=null;

        try {
            // src/parser/Music.g:152:13: ( SPEED ^ NUM )
            // src/parser/Music.g:152:17: SPEED ^ NUM
            {
            root_0 = (AmlTree)adaptor.nil();


            SPEED119=(Token)match(input,SPEED,FOLLOW_SPEED_in_speed1917); 
            SPEED119_tree = 
            (AmlTree)adaptor.create(SPEED119)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(SPEED119_tree, root_0);


            NUM120=(Token)match(input,NUM,FOLLOW_NUM_in_speed1920); 
            NUM120_tree = 
            (AmlTree)adaptor.create(NUM120)
            ;
            adaptor.addChild(root_0, NUM120_tree);


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

        Token TRANSPORT121=null;
        MusicParser.expr_return expr122 =null;


        AmlTree TRANSPORT121_tree=null;

        try {
            // src/parser/Music.g:155:13: ( TRANSPORT ^ expr )
            // src/parser/Music.g:155:17: TRANSPORT ^ expr
            {
            root_0 = (AmlTree)adaptor.nil();


            TRANSPORT121=(Token)match(input,TRANSPORT,FOLLOW_TRANSPORT_in_transport1945); 
            TRANSPORT121_tree = 
            (AmlTree)adaptor.create(TRANSPORT121)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(TRANSPORT121_tree, root_0);


            pushFollow(FOLLOW_expr_in_transport1948);
            expr122=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr122.getTree());

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

        Token INSTRUMENT123=null;
        Token STRING124=null;
        Token char_literal125=null;

        AmlTree INSTRUMENT123_tree=null;
        AmlTree STRING124_tree=null;
        AmlTree char_literal125_tree=null;

        try {
            // src/parser/Music.g:158:13: ( INSTRUMENT ^ STRING ';' )
            // src/parser/Music.g:158:17: INSTRUMENT ^ STRING ';'
            {
            root_0 = (AmlTree)adaptor.nil();


            INSTRUMENT123=(Token)match(input,INSTRUMENT,FOLLOW_INSTRUMENT_in_instrument1972); 
            INSTRUMENT123_tree = 
            (AmlTree)adaptor.create(INSTRUMENT123)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(INSTRUMENT123_tree, root_0);


            STRING124=(Token)match(input,STRING,FOLLOW_STRING_in_instrument1975); 
            STRING124_tree = 
            (AmlTree)adaptor.create(STRING124)
            ;
            adaptor.addChild(root_0, STRING124_tree);


            char_literal125=(Token)match(input,96,FOLLOW_96_in_instrument1977); 
            char_literal125_tree = 
            (AmlTree)adaptor.create(char_literal125)
            ;
            adaptor.addChild(root_0, char_literal125_tree);


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

        Token WHILE126=null;
        Token char_literal127=null;
        Token char_literal129=null;
        Token char_literal130=null;
        Token char_literal132=null;
        MusicParser.expr_return expr128 =null;

        MusicParser.listInst_return listInst131 =null;


        AmlTree WHILE126_tree=null;
        AmlTree char_literal127_tree=null;
        AmlTree char_literal129_tree=null;
        AmlTree char_literal130_tree=null;
        AmlTree char_literal132_tree=null;

        try {
            // src/parser/Music.g:161:13: ( WHILE ^ '(' ! expr ')' ! '{' ! listInst '}' !)
            // src/parser/Music.g:161:17: WHILE ^ '(' ! expr ')' ! '{' ! listInst '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            WHILE126=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_stmt2001); 
            WHILE126_tree = 
            (AmlTree)adaptor.create(WHILE126)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(WHILE126_tree, root_0);


            char_literal127=(Token)match(input,91,FOLLOW_91_in_while_stmt2004); 

            pushFollow(FOLLOW_expr_in_while_stmt2007);
            expr128=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr128.getTree());

            char_literal129=(Token)match(input,92,FOLLOW_92_in_while_stmt2009); 

            char_literal130=(Token)match(input,97,FOLLOW_97_in_while_stmt2012); 

            pushFollow(FOLLOW_listInst_in_while_stmt2015);
            listInst131=listInst();

            state._fsp--;

            adaptor.addChild(root_0, listInst131.getTree());

            char_literal132=(Token)match(input,98,FOLLOW_98_in_while_stmt2017); 

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

        Token WHILE133=null;
        Token char_literal134=null;
        Token char_literal136=null;
        Token char_literal137=null;
        Token char_literal139=null;
        MusicParser.expr_return expr135 =null;

        MusicParser.list_music_inst_return list_music_inst138 =null;


        AmlTree WHILE133_tree=null;
        AmlTree char_literal134_tree=null;
        AmlTree char_literal136_tree=null;
        AmlTree char_literal137_tree=null;
        AmlTree char_literal139_tree=null;

        try {
            // src/parser/Music.g:164:21: ( WHILE ^ '(' ! expr ')' ! '{' ! list_music_inst '}' !)
            // src/parser/Music.g:164:25: WHILE ^ '(' ! expr ')' ! '{' ! list_music_inst '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            WHILE133=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_music_stmt2044); 
            WHILE133_tree = 
            (AmlTree)adaptor.create(WHILE133)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(WHILE133_tree, root_0);


            char_literal134=(Token)match(input,91,FOLLOW_91_in_while_music_stmt2047); 

            pushFollow(FOLLOW_expr_in_while_music_stmt2050);
            expr135=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr135.getTree());

            char_literal136=(Token)match(input,92,FOLLOW_92_in_while_music_stmt2052); 

            char_literal137=(Token)match(input,97,FOLLOW_97_in_while_music_stmt2055); 

            pushFollow(FOLLOW_list_music_inst_in_while_music_stmt2058);
            list_music_inst138=list_music_inst();

            state._fsp--;

            adaptor.addChild(root_0, list_music_inst138.getTree());

            char_literal139=(Token)match(input,98,FOLLOW_98_in_while_music_stmt2060); 

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

        Token FOR140=null;
        Token char_literal141=null;
        Token char_literal144=null;
        Token char_literal146=null;
        Token char_literal148=null;
        Token char_literal149=null;
        Token char_literal151=null;
        MusicParser.declaration_return declaration142 =null;

        MusicParser.list_assig_return list_assig143 =null;

        MusicParser.expr_return expr145 =null;

        MusicParser.list_assig_return list_assig147 =null;

        MusicParser.listInst_return listInst150 =null;


        AmlTree FOR140_tree=null;
        AmlTree char_literal141_tree=null;
        AmlTree char_literal144_tree=null;
        AmlTree char_literal146_tree=null;
        AmlTree char_literal148_tree=null;
        AmlTree char_literal149_tree=null;
        AmlTree char_literal151_tree=null;

        try {
            // src/parser/Music.g:167:13: ( FOR ^ '(' ! ( declaration | list_assig ';' !) expr ';' ! list_assig ')' ! '{' ! listInst '}' !)
            // src/parser/Music.g:167:17: FOR ^ '(' ! ( declaration | list_assig ';' !) expr ';' ! list_assig ')' ! '{' ! listInst '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            FOR140=(Token)match(input,FOR,FOLLOW_FOR_in_for_stmt2095); 
            FOR140_tree = 
            (AmlTree)adaptor.create(FOR140)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(FOR140_tree, root_0);


            char_literal141=(Token)match(input,91,FOLLOW_91_in_for_stmt2098); 

            // src/parser/Music.g:167:27: ( declaration | list_assig ';' !)
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==BOOL||LA28_0==CHORD||LA28_0==DRUMS_NOTE_TYPE||LA28_0==INT||LA28_0==NOTE_TYPE||LA28_0==STRING_TYPE) ) {
                alt28=1;
            }
            else if ( (LA28_0==DECR||LA28_0==ID||LA28_0==INCR||LA28_0==LETTER_X) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;

            }
            switch (alt28) {
                case 1 :
                    // src/parser/Music.g:167:28: declaration
                    {
                    pushFollow(FOLLOW_declaration_in_for_stmt2102);
                    declaration142=declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, declaration142.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:167:42: list_assig ';' !
                    {
                    pushFollow(FOLLOW_list_assig_in_for_stmt2106);
                    list_assig143=list_assig();

                    state._fsp--;

                    adaptor.addChild(root_0, list_assig143.getTree());

                    char_literal144=(Token)match(input,96,FOLLOW_96_in_for_stmt2108); 

                    }
                    break;

            }


            pushFollow(FOLLOW_expr_in_for_stmt2112);
            expr145=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr145.getTree());

            char_literal146=(Token)match(input,96,FOLLOW_96_in_for_stmt2114); 

            pushFollow(FOLLOW_list_assig_in_for_stmt2117);
            list_assig147=list_assig();

            state._fsp--;

            adaptor.addChild(root_0, list_assig147.getTree());

            char_literal148=(Token)match(input,92,FOLLOW_92_in_for_stmt2119); 

            char_literal149=(Token)match(input,97,FOLLOW_97_in_for_stmt2122); 

            pushFollow(FOLLOW_listInst_in_for_stmt2125);
            listInst150=listInst();

            state._fsp--;

            adaptor.addChild(root_0, listInst150.getTree());

            char_literal151=(Token)match(input,98,FOLLOW_98_in_for_stmt2127); 

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

        Token FOR152=null;
        Token char_literal153=null;
        Token char_literal156=null;
        Token char_literal158=null;
        Token char_literal160=null;
        Token char_literal161=null;
        Token char_literal163=null;
        MusicParser.declaration_return declaration154 =null;

        MusicParser.list_assig_return list_assig155 =null;

        MusicParser.expr_return expr157 =null;

        MusicParser.list_assig_return list_assig159 =null;

        MusicParser.list_music_inst_return list_music_inst162 =null;


        AmlTree FOR152_tree=null;
        AmlTree char_literal153_tree=null;
        AmlTree char_literal156_tree=null;
        AmlTree char_literal158_tree=null;
        AmlTree char_literal160_tree=null;
        AmlTree char_literal161_tree=null;
        AmlTree char_literal163_tree=null;

        try {
            // src/parser/Music.g:170:17: ( FOR ^ '(' ! ( declaration | list_assig ';' !) expr ';' ! list_assig ')' ! '{' ! list_music_inst '}' !)
            // src/parser/Music.g:170:21: FOR ^ '(' ! ( declaration | list_assig ';' !) expr ';' ! list_assig ')' ! '{' ! list_music_inst '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            FOR152=(Token)match(input,FOR,FOLLOW_FOR_in_for_music_stmt2152); 
            FOR152_tree = 
            (AmlTree)adaptor.create(FOR152)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(FOR152_tree, root_0);


            char_literal153=(Token)match(input,91,FOLLOW_91_in_for_music_stmt2155); 

            // src/parser/Music.g:170:31: ( declaration | list_assig ';' !)
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==BOOL||LA29_0==CHORD||LA29_0==DRUMS_NOTE_TYPE||LA29_0==INT||LA29_0==NOTE_TYPE||LA29_0==STRING_TYPE) ) {
                alt29=1;
            }
            else if ( (LA29_0==DECR||LA29_0==ID||LA29_0==INCR||LA29_0==LETTER_X) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;

            }
            switch (alt29) {
                case 1 :
                    // src/parser/Music.g:170:32: declaration
                    {
                    pushFollow(FOLLOW_declaration_in_for_music_stmt2159);
                    declaration154=declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, declaration154.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:170:46: list_assig ';' !
                    {
                    pushFollow(FOLLOW_list_assig_in_for_music_stmt2163);
                    list_assig155=list_assig();

                    state._fsp--;

                    adaptor.addChild(root_0, list_assig155.getTree());

                    char_literal156=(Token)match(input,96,FOLLOW_96_in_for_music_stmt2165); 

                    }
                    break;

            }


            pushFollow(FOLLOW_expr_in_for_music_stmt2169);
            expr157=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr157.getTree());

            char_literal158=(Token)match(input,96,FOLLOW_96_in_for_music_stmt2171); 

            pushFollow(FOLLOW_list_assig_in_for_music_stmt2174);
            list_assig159=list_assig();

            state._fsp--;

            adaptor.addChild(root_0, list_assig159.getTree());

            char_literal160=(Token)match(input,92,FOLLOW_92_in_for_music_stmt2176); 

            char_literal161=(Token)match(input,97,FOLLOW_97_in_for_music_stmt2179); 

            pushFollow(FOLLOW_list_music_inst_in_for_music_stmt2182);
            list_music_inst162=list_music_inst();

            state._fsp--;

            adaptor.addChild(root_0, list_music_inst162.getTree());

            char_literal163=(Token)match(input,98,FOLLOW_98_in_for_music_stmt2184); 

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

        Token char_literal165=null;
        MusicParser.assig_return assig164 =null;

        MusicParser.assig_return assig166 =null;


        AmlTree char_literal165_tree=null;
        RewriteRuleTokenStream stream_93=new RewriteRuleTokenStream(adaptor,"token 93");
        RewriteRuleSubtreeStream stream_assig=new RewriteRuleSubtreeStream(adaptor,"rule assig");
        try {
            // src/parser/Music.g:173:13: ( assig ( ',' assig )* -> ^( LIST_ASSIG ( assig )+ ) )
            // src/parser/Music.g:173:17: assig ( ',' assig )*
            {
            pushFollow(FOLLOW_assig_in_list_assig2213);
            assig164=assig();

            state._fsp--;

            stream_assig.add(assig164.getTree());

            // src/parser/Music.g:173:23: ( ',' assig )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==93) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // src/parser/Music.g:173:24: ',' assig
            	    {
            	    char_literal165=(Token)match(input,93,FOLLOW_93_in_list_assig2216);  
            	    stream_93.add(char_literal165);


            	    pushFollow(FOLLOW_assig_in_list_assig2218);
            	    assig166=assig();

            	    state._fsp--;

            	    stream_assig.add(assig166.getTree());

            	    }
            	    break;

            	default :
            	    break loop30;
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

        Token IF167=null;
        Token char_literal168=null;
        Token char_literal170=null;
        Token char_literal171=null;
        Token char_literal173=null;
        MusicParser.expr_return expr169 =null;

        MusicParser.listInst_return listInst172 =null;

        MusicParser.elseif_stmt_return elseif_stmt174 =null;

        MusicParser.else_stmt_return else_stmt175 =null;


        AmlTree IF167_tree=null;
        AmlTree char_literal168_tree=null;
        AmlTree char_literal170_tree=null;
        AmlTree char_literal171_tree=null;
        AmlTree char_literal173_tree=null;

        try {
            // src/parser/Music.g:176:13: ( IF ^ '(' ! expr ')' ! '{' ! listInst '}' ! ( elseif_stmt )* ( else_stmt )? )
            // src/parser/Music.g:176:17: IF ^ '(' ! expr ')' ! '{' ! listInst '}' ! ( elseif_stmt )* ( else_stmt )?
            {
            root_0 = (AmlTree)adaptor.nil();


            IF167=(Token)match(input,IF,FOLLOW_IF_in_if_stmt2256); 
            IF167_tree = 
            (AmlTree)adaptor.create(IF167)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(IF167_tree, root_0);


            char_literal168=(Token)match(input,91,FOLLOW_91_in_if_stmt2259); 

            pushFollow(FOLLOW_expr_in_if_stmt2262);
            expr169=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr169.getTree());

            char_literal170=(Token)match(input,92,FOLLOW_92_in_if_stmt2264); 

            char_literal171=(Token)match(input,97,FOLLOW_97_in_if_stmt2267); 

            pushFollow(FOLLOW_listInst_in_if_stmt2270);
            listInst172=listInst();

            state._fsp--;

            adaptor.addChild(root_0, listInst172.getTree());

            char_literal173=(Token)match(input,98,FOLLOW_98_in_if_stmt2272); 

            // src/parser/Music.g:176:55: ( elseif_stmt )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==ELSE) ) {
                    int LA31_1 = input.LA(2);

                    if ( (LA31_1==IF) ) {
                        alt31=1;
                    }


                }


                switch (alt31) {
            	case 1 :
            	    // src/parser/Music.g:176:55: elseif_stmt
            	    {
            	    pushFollow(FOLLOW_elseif_stmt_in_if_stmt2275);
            	    elseif_stmt174=elseif_stmt();

            	    state._fsp--;

            	    adaptor.addChild(root_0, elseif_stmt174.getTree());

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            // src/parser/Music.g:176:68: ( else_stmt )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==ELSE) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // src/parser/Music.g:176:68: else_stmt
                    {
                    pushFollow(FOLLOW_else_stmt_in_if_stmt2278);
                    else_stmt175=else_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, else_stmt175.getTree());

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

        Token ELSE176=null;
        Token IF177=null;
        Token char_literal178=null;
        Token char_literal180=null;
        Token char_literal181=null;
        Token char_literal183=null;
        MusicParser.expr_return expr179 =null;

        MusicParser.listInst_return listInst182 =null;


        AmlTree ELSE176_tree=null;
        AmlTree IF177_tree=null;
        AmlTree char_literal178_tree=null;
        AmlTree char_literal180_tree=null;
        AmlTree char_literal181_tree=null;
        AmlTree char_literal183_tree=null;
        RewriteRuleTokenStream stream_98=new RewriteRuleTokenStream(adaptor,"token 98");
        RewriteRuleTokenStream stream_97=new RewriteRuleTokenStream(adaptor,"token 97");
        RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
        RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_listInst=new RewriteRuleSubtreeStream(adaptor,"rule listInst");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // src/parser/Music.g:179:13: ( ELSE IF '(' expr ')' '{' listInst '}' -> ^( ELSEIF expr listInst ) )
            // src/parser/Music.g:179:17: ELSE IF '(' expr ')' '{' listInst '}'
            {
            ELSE176=(Token)match(input,ELSE,FOLLOW_ELSE_in_elseif_stmt2302);  
            stream_ELSE.add(ELSE176);


            IF177=(Token)match(input,IF,FOLLOW_IF_in_elseif_stmt2304);  
            stream_IF.add(IF177);


            char_literal178=(Token)match(input,91,FOLLOW_91_in_elseif_stmt2306);  
            stream_91.add(char_literal178);


            pushFollow(FOLLOW_expr_in_elseif_stmt2308);
            expr179=expr();

            state._fsp--;

            stream_expr.add(expr179.getTree());

            char_literal180=(Token)match(input,92,FOLLOW_92_in_elseif_stmt2310);  
            stream_92.add(char_literal180);


            char_literal181=(Token)match(input,97,FOLLOW_97_in_elseif_stmt2312);  
            stream_97.add(char_literal181);


            pushFollow(FOLLOW_listInst_in_elseif_stmt2314);
            listInst182=listInst();

            state._fsp--;

            stream_listInst.add(listInst182.getTree());

            char_literal183=(Token)match(input,98,FOLLOW_98_in_elseif_stmt2316);  
            stream_98.add(char_literal183);


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

        Token ELSE184=null;
        Token char_literal185=null;
        Token char_literal187=null;
        MusicParser.listInst_return listInst186 =null;


        AmlTree ELSE184_tree=null;
        AmlTree char_literal185_tree=null;
        AmlTree char_literal187_tree=null;

        try {
            // src/parser/Music.g:182:13: ( ELSE ^ '{' ! listInst '}' !)
            // src/parser/Music.g:182:17: ELSE ^ '{' ! listInst '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            ELSE184=(Token)match(input,ELSE,FOLLOW_ELSE_in_else_stmt2351); 
            ELSE184_tree = 
            (AmlTree)adaptor.create(ELSE184)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(ELSE184_tree, root_0);


            char_literal185=(Token)match(input,97,FOLLOW_97_in_else_stmt2354); 

            pushFollow(FOLLOW_listInst_in_else_stmt2357);
            listInst186=listInst();

            state._fsp--;

            adaptor.addChild(root_0, listInst186.getTree());

            char_literal187=(Token)match(input,98,FOLLOW_98_in_else_stmt2359); 

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

        Token IF188=null;
        Token char_literal189=null;
        Token char_literal191=null;
        Token char_literal192=null;
        Token char_literal194=null;
        MusicParser.expr_return expr190 =null;

        MusicParser.list_music_inst_return list_music_inst193 =null;

        MusicParser.elseif_music_stmt_return elseif_music_stmt195 =null;

        MusicParser.else_music_stmt_return else_music_stmt196 =null;


        AmlTree IF188_tree=null;
        AmlTree char_literal189_tree=null;
        AmlTree char_literal191_tree=null;
        AmlTree char_literal192_tree=null;
        AmlTree char_literal194_tree=null;

        try {
            // src/parser/Music.g:185:17: ( IF ^ '(' ! expr ')' ! '{' ! list_music_inst '}' ! ( elseif_music_stmt )* ( else_music_stmt )? )
            // src/parser/Music.g:185:21: IF ^ '(' ! expr ')' ! '{' ! list_music_inst '}' ! ( elseif_music_stmt )* ( else_music_stmt )?
            {
            root_0 = (AmlTree)adaptor.nil();


            IF188=(Token)match(input,IF,FOLLOW_IF_in_if_music_stmt2385); 
            IF188_tree = 
            (AmlTree)adaptor.create(IF188)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(IF188_tree, root_0);


            char_literal189=(Token)match(input,91,FOLLOW_91_in_if_music_stmt2388); 

            pushFollow(FOLLOW_expr_in_if_music_stmt2391);
            expr190=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr190.getTree());

            char_literal191=(Token)match(input,92,FOLLOW_92_in_if_music_stmt2393); 

            char_literal192=(Token)match(input,97,FOLLOW_97_in_if_music_stmt2396); 

            pushFollow(FOLLOW_list_music_inst_in_if_music_stmt2399);
            list_music_inst193=list_music_inst();

            state._fsp--;

            adaptor.addChild(root_0, list_music_inst193.getTree());

            char_literal194=(Token)match(input,98,FOLLOW_98_in_if_music_stmt2401); 

            // src/parser/Music.g:185:66: ( elseif_music_stmt )*
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
            	    // src/parser/Music.g:185:66: elseif_music_stmt
            	    {
            	    pushFollow(FOLLOW_elseif_music_stmt_in_if_music_stmt2404);
            	    elseif_music_stmt195=elseif_music_stmt();

            	    state._fsp--;

            	    adaptor.addChild(root_0, elseif_music_stmt195.getTree());

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            // src/parser/Music.g:185:85: ( else_music_stmt )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==ELSE) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // src/parser/Music.g:185:85: else_music_stmt
                    {
                    pushFollow(FOLLOW_else_music_stmt_in_if_music_stmt2407);
                    else_music_stmt196=else_music_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, else_music_stmt196.getTree());

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

        Token ELSE197=null;
        Token IF198=null;
        Token char_literal199=null;
        Token char_literal201=null;
        Token char_literal202=null;
        Token char_literal204=null;
        MusicParser.expr_return expr200 =null;

        MusicParser.list_music_inst_return list_music_inst203 =null;


        AmlTree ELSE197_tree=null;
        AmlTree IF198_tree=null;
        AmlTree char_literal199_tree=null;
        AmlTree char_literal201_tree=null;
        AmlTree char_literal202_tree=null;
        AmlTree char_literal204_tree=null;
        RewriteRuleTokenStream stream_98=new RewriteRuleTokenStream(adaptor,"token 98");
        RewriteRuleTokenStream stream_97=new RewriteRuleTokenStream(adaptor,"token 97");
        RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
        RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_list_music_inst=new RewriteRuleSubtreeStream(adaptor,"rule list_music_inst");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // src/parser/Music.g:188:21: ( ELSE IF '(' expr ')' '{' list_music_inst '}' -> ^( ELSEIF expr list_music_inst ) )
            // src/parser/Music.g:188:25: ELSE IF '(' expr ')' '{' list_music_inst '}'
            {
            ELSE197=(Token)match(input,ELSE,FOLLOW_ELSE_in_elseif_music_stmt2437);  
            stream_ELSE.add(ELSE197);


            IF198=(Token)match(input,IF,FOLLOW_IF_in_elseif_music_stmt2439);  
            stream_IF.add(IF198);


            char_literal199=(Token)match(input,91,FOLLOW_91_in_elseif_music_stmt2441);  
            stream_91.add(char_literal199);


            pushFollow(FOLLOW_expr_in_elseif_music_stmt2443);
            expr200=expr();

            state._fsp--;

            stream_expr.add(expr200.getTree());

            char_literal201=(Token)match(input,92,FOLLOW_92_in_elseif_music_stmt2445);  
            stream_92.add(char_literal201);


            char_literal202=(Token)match(input,97,FOLLOW_97_in_elseif_music_stmt2447);  
            stream_97.add(char_literal202);


            pushFollow(FOLLOW_list_music_inst_in_elseif_music_stmt2449);
            list_music_inst203=list_music_inst();

            state._fsp--;

            stream_list_music_inst.add(list_music_inst203.getTree());

            char_literal204=(Token)match(input,98,FOLLOW_98_in_elseif_music_stmt2451);  
            stream_98.add(char_literal204);


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

        Token ELSE205=null;
        Token char_literal206=null;
        Token char_literal208=null;
        MusicParser.list_music_inst_return list_music_inst207 =null;


        AmlTree ELSE205_tree=null;
        AmlTree char_literal206_tree=null;
        AmlTree char_literal208_tree=null;

        try {
            // src/parser/Music.g:191:17: ( ELSE ^ '{' ! list_music_inst '}' !)
            // src/parser/Music.g:191:21: ELSE ^ '{' ! list_music_inst '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            ELSE205=(Token)match(input,ELSE,FOLLOW_ELSE_in_else_music_stmt2492); 
            ELSE205_tree = 
            (AmlTree)adaptor.create(ELSE205)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(ELSE205_tree, root_0);


            char_literal206=(Token)match(input,97,FOLLOW_97_in_else_music_stmt2495); 

            pushFollow(FOLLOW_list_music_inst_in_else_music_stmt2498);
            list_music_inst207=list_music_inst();

            state._fsp--;

            adaptor.addChild(root_0, list_music_inst207.getTree());

            char_literal208=(Token)match(input,98,FOLLOW_98_in_else_music_stmt2500); 

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

        Token SONG209=null;
        Token char_literal211=null;
        Token char_literal213=null;
        Token char_literal215=null;
        Token char_literal217=null;
        Token char_literal219=null;
        Token char_literal222=null;
        MusicParser.id_rule_return id_rule210 =null;

        MusicParser.beat_return beat212 =null;

        MusicParser.speed_return speed214 =null;

        MusicParser.tone_return tone216 =null;

        MusicParser.transport_return transport218 =null;

        MusicParser.track_return track220 =null;

        MusicParser.drums_track_return drums_track221 =null;


        AmlTree SONG209_tree=null;
        AmlTree char_literal211_tree=null;
        AmlTree char_literal213_tree=null;
        AmlTree char_literal215_tree=null;
        AmlTree char_literal217_tree=null;
        AmlTree char_literal219_tree=null;
        AmlTree char_literal222_tree=null;

        try {
            // src/parser/Music.g:194:13: ( SONG ^ ( id_rule )? '{' ! ( beat ';' !)? ( speed ';' !)? ( tone ';' !)? ( transport ';' !)? ( track )+ ( drums_track )? '}' !)
            // src/parser/Music.g:194:17: SONG ^ ( id_rule )? '{' ! ( beat ';' !)? ( speed ';' !)? ( tone ';' !)? ( transport ';' !)? ( track )+ ( drums_track )? '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            SONG209=(Token)match(input,SONG,FOLLOW_SONG_in_song2535); 
            SONG209_tree = 
            (AmlTree)adaptor.create(SONG209)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(SONG209_tree, root_0);


            // src/parser/Music.g:194:23: ( id_rule )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==ID||LA35_0==LETTER_X) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // src/parser/Music.g:194:23: id_rule
                    {
                    pushFollow(FOLLOW_id_rule_in_song2538);
                    id_rule210=id_rule();

                    state._fsp--;

                    adaptor.addChild(root_0, id_rule210.getTree());

                    }
                    break;

            }


            char_literal211=(Token)match(input,97,FOLLOW_97_in_song2541); 

            // src/parser/Music.g:194:37: ( beat ';' !)?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==BEAT) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // src/parser/Music.g:194:38: beat ';' !
                    {
                    pushFollow(FOLLOW_beat_in_song2545);
                    beat212=beat();

                    state._fsp--;

                    adaptor.addChild(root_0, beat212.getTree());

                    char_literal213=(Token)match(input,96,FOLLOW_96_in_song2547); 

                    }
                    break;

            }


            // src/parser/Music.g:194:50: ( speed ';' !)?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==SPEED) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // src/parser/Music.g:194:51: speed ';' !
                    {
                    pushFollow(FOLLOW_speed_in_song2553);
                    speed214=speed();

                    state._fsp--;

                    adaptor.addChild(root_0, speed214.getTree());

                    char_literal215=(Token)match(input,96,FOLLOW_96_in_song2555); 

                    }
                    break;

            }


            // src/parser/Music.g:194:64: ( tone ';' !)?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==TONE) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // src/parser/Music.g:194:65: tone ';' !
                    {
                    pushFollow(FOLLOW_tone_in_song2561);
                    tone216=tone();

                    state._fsp--;

                    adaptor.addChild(root_0, tone216.getTree());

                    char_literal217=(Token)match(input,96,FOLLOW_96_in_song2563); 

                    }
                    break;

            }


            // src/parser/Music.g:194:77: ( transport ';' !)?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==TRANSPORT) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // src/parser/Music.g:194:78: transport ';' !
                    {
                    pushFollow(FOLLOW_transport_in_song2569);
                    transport218=transport();

                    state._fsp--;

                    adaptor.addChild(root_0, transport218.getTree());

                    char_literal219=(Token)match(input,96,FOLLOW_96_in_song2571); 

                    }
                    break;

            }


            // src/parser/Music.g:194:96: ( track )+
            int cnt40=0;
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==TRACK) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // src/parser/Music.g:194:97: track
            	    {
            	    pushFollow(FOLLOW_track_in_song2578);
            	    track220=track();

            	    state._fsp--;

            	    adaptor.addChild(root_0, track220.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt40 >= 1 ) break loop40;
                        EarlyExitException eee =
                            new EarlyExitException(40, input);
                        throw eee;
                }
                cnt40++;
            } while (true);


            // src/parser/Music.g:194:105: ( drums_track )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==DRUMS) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // src/parser/Music.g:194:105: drums_track
                    {
                    pushFollow(FOLLOW_drums_track_in_song2582);
                    drums_track221=drums_track();

                    state._fsp--;

                    adaptor.addChild(root_0, drums_track221.getTree());

                    }
                    break;

            }


            char_literal222=(Token)match(input,98,FOLLOW_98_in_song2585); 

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

        Token TRACK223=null;
        Token STRING225=null;
        MusicParser.id_rule_return id_rule224 =null;

        MusicParser.compas_aux_return compas_aux226 =null;


        AmlTree TRACK223_tree=null;
        AmlTree STRING225_tree=null;

        try {
            // src/parser/Music.g:197:13: ( TRACK ^ ( id_rule )? ( STRING )? compas_aux )
            // src/parser/Music.g:197:17: TRACK ^ ( id_rule )? ( STRING )? compas_aux
            {
            root_0 = (AmlTree)adaptor.nil();


            TRACK223=(Token)match(input,TRACK,FOLLOW_TRACK_in_track2615); 
            TRACK223_tree = 
            (AmlTree)adaptor.create(TRACK223)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(TRACK223_tree, root_0);


            // src/parser/Music.g:197:24: ( id_rule )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==ID||LA42_0==LETTER_X) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // src/parser/Music.g:197:24: id_rule
                    {
                    pushFollow(FOLLOW_id_rule_in_track2618);
                    id_rule224=id_rule();

                    state._fsp--;

                    adaptor.addChild(root_0, id_rule224.getTree());

                    }
                    break;

            }


            // src/parser/Music.g:197:33: ( STRING )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==STRING) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // src/parser/Music.g:197:33: STRING
                    {
                    STRING225=(Token)match(input,STRING,FOLLOW_STRING_in_track2621); 
                    STRING225_tree = 
                    (AmlTree)adaptor.create(STRING225)
                    ;
                    adaptor.addChild(root_0, STRING225_tree);


                    }
                    break;

            }


            pushFollow(FOLLOW_compas_aux_in_track2624);
            compas_aux226=compas_aux();

            state._fsp--;

            adaptor.addChild(root_0, compas_aux226.getTree());

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

        Token DRUMS227=null;
        MusicParser.compas_aux_return compas_aux228 =null;


        AmlTree DRUMS227_tree=null;

        try {
            // src/parser/Music.g:200:13: ( DRUMS ^ compas_aux )
            // src/parser/Music.g:200:17: DRUMS ^ compas_aux
            {
            root_0 = (AmlTree)adaptor.nil();


            DRUMS227=(Token)match(input,DRUMS,FOLLOW_DRUMS_in_drums_track2647); 
            DRUMS227_tree = 
            (AmlTree)adaptor.create(DRUMS227)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(DRUMS227_tree, root_0);


            pushFollow(FOLLOW_compas_aux_in_drums_track2650);
            compas_aux228=compas_aux();

            state._fsp--;

            adaptor.addChild(root_0, compas_aux228.getTree());

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

        MusicParser.compas_list_return compas_list229 =null;


        RewriteRuleSubtreeStream stream_compas_list=new RewriteRuleSubtreeStream(adaptor,"rule compas_list");
        try {
            // src/parser/Music.g:203:13: ( compas_list -> ^( COMPAS_LIST compas_list ) )
            // src/parser/Music.g:203:17: compas_list
            {
            pushFollow(FOLLOW_compas_list_in_compas_aux2674);
            compas_list229=compas_list();

            state._fsp--;

            stream_compas_list.add(compas_list229.getTree());

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

        Token DOUBLE_BAR230=null;
        Token DOUBLE_BAR234=null;
        MusicParser.repetition_return repetition231 =null;

        MusicParser.compasses_return compasses232 =null;

        MusicParser.repetition_return repetition233 =null;


        AmlTree DOUBLE_BAR230_tree=null;
        AmlTree DOUBLE_BAR234_tree=null;

        try {
            // src/parser/Music.g:206:13: ( ( DOUBLE_BAR !| repetition ) ( compasses | repetition )* ( DOUBLE_BAR !) )
            // src/parser/Music.g:206:15: ( DOUBLE_BAR !| repetition ) ( compasses | repetition )* ( DOUBLE_BAR !)
            {
            root_0 = (AmlTree)adaptor.nil();


            // src/parser/Music.g:206:15: ( DOUBLE_BAR !| repetition )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==DOUBLE_BAR) ) {
                alt44=1;
            }
            else if ( (LA44_0==NUM||LA44_0==START_REPETITION) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;

            }
            switch (alt44) {
                case 1 :
                    // src/parser/Music.g:206:16: DOUBLE_BAR !
                    {
                    DOUBLE_BAR230=(Token)match(input,DOUBLE_BAR,FOLLOW_DOUBLE_BAR_in_compas_list2704); 

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:206:30: repetition
                    {
                    pushFollow(FOLLOW_repetition_in_compas_list2709);
                    repetition231=repetition();

                    state._fsp--;

                    adaptor.addChild(root_0, repetition231.getTree());

                    }
                    break;

            }


            // src/parser/Music.g:206:42: ( compasses | repetition )*
            loop45:
            do {
                int alt45=3;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==ARMOR||(LA45_0 >= BEAT && LA45_0 <= BOOL)||LA45_0==CHORD||LA45_0==DECR||LA45_0==DRUMS_NOTE_TYPE||LA45_0==FOR||(LA45_0 >= ID && LA45_0 <= INT)||LA45_0==LETTER_X||LA45_0==NOTE||LA45_0==NOTE_TYPE||(LA45_0 >= SONG && LA45_0 <= SPEED)||(LA45_0 >= STRING_TYPE && LA45_0 <= SUSTAIN)||LA45_0==TONE||LA45_0==WHILE||LA45_0==91) ) {
                    alt45=1;
                }
                else if ( (LA45_0==NUM||LA45_0==START_REPETITION) ) {
                    alt45=2;
                }


                switch (alt45) {
            	case 1 :
            	    // src/parser/Music.g:206:43: compasses
            	    {
            	    pushFollow(FOLLOW_compasses_in_compas_list2713);
            	    compasses232=compasses();

            	    state._fsp--;

            	    adaptor.addChild(root_0, compasses232.getTree());

            	    }
            	    break;
            	case 2 :
            	    // src/parser/Music.g:206:55: repetition
            	    {
            	    pushFollow(FOLLOW_repetition_in_compas_list2717);
            	    repetition233=repetition();

            	    state._fsp--;

            	    adaptor.addChild(root_0, repetition233.getTree());

            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);


            // src/parser/Music.g:206:68: ( DOUBLE_BAR !)
            // src/parser/Music.g:206:69: DOUBLE_BAR !
            {
            DOUBLE_BAR234=(Token)match(input,DOUBLE_BAR,FOLLOW_DOUBLE_BAR_in_compas_list2722); 

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

        Token BAR236=null;
        MusicParser.compas_return compas235 =null;

        MusicParser.compas_return compas237 =null;


        AmlTree BAR236_tree=null;

        try {
            // src/parser/Music.g:209:13: ( compas ( BAR ! compas )* )
            // src/parser/Music.g:209:17: compas ( BAR ! compas )*
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_compas_in_compasses2749);
            compas235=compas();

            state._fsp--;

            adaptor.addChild(root_0, compas235.getTree());

            // src/parser/Music.g:209:24: ( BAR ! compas )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==BAR) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // src/parser/Music.g:209:25: BAR ! compas
            	    {
            	    BAR236=(Token)match(input,BAR,FOLLOW_BAR_in_compasses2752); 

            	    pushFollow(FOLLOW_compas_in_compasses2755);
            	    compas237=compas();

            	    state._fsp--;

            	    adaptor.addChild(root_0, compas237.getTree());

            	    }
            	    break;

            	default :
            	    break loop46;
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

        Token NUM238=null;
        Token LETTER_X239=null;
        Token START_REPETITION240=null;
        Token END_REPETITION242=null;
        MusicParser.compasses_return compasses241 =null;


        AmlTree NUM238_tree=null;
        AmlTree LETTER_X239_tree=null;
        AmlTree START_REPETITION240_tree=null;
        AmlTree END_REPETITION242_tree=null;
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
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==NUM) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // src/parser/Music.g:212:18: NUM LETTER_X
                    {
                    NUM238=(Token)match(input,NUM,FOLLOW_NUM_in_repetition2782);  
                    stream_NUM.add(NUM238);


                    LETTER_X239=(Token)match(input,LETTER_X,FOLLOW_LETTER_X_in_repetition2784);  
                    stream_LETTER_X.add(LETTER_X239);


                    }
                    break;

            }


            START_REPETITION240=(Token)match(input,START_REPETITION,FOLLOW_START_REPETITION_in_repetition2788);  
            stream_START_REPETITION.add(START_REPETITION240);


            pushFollow(FOLLOW_compasses_in_repetition2790);
            compasses241=compasses();

            state._fsp--;

            stream_compasses.add(compasses241.getTree());

            END_REPETITION242=(Token)match(input,END_REPETITION,FOLLOW_END_REPETITION_in_repetition2792);  
            stream_END_REPETITION.add(END_REPETITION242);


            // AST REWRITE
            // elements: NUM, compasses
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

        MusicParser.music_inst_return music_inst243 =null;


        RewriteRuleSubtreeStream stream_music_inst=new RewriteRuleSubtreeStream(adaptor,"rule music_inst");
        try {
            // src/parser/Music.g:215:13: ( ( options {greedy=true; } : music_inst )+ -> ^( COMPAS ( music_inst )+ ) )
            // src/parser/Music.g:215:16: ( options {greedy=true; } : music_inst )+
            {
            // src/parser/Music.g:215:16: ( options {greedy=true; } : music_inst )+
            int cnt48=0;
            loop48:
            do {
                int alt48=2;
                switch ( input.LA(1) ) {
                case CHORD:
                    {
                    alt48=1;
                    }
                    break;
                case TONE:
                    {
                    alt48=1;
                    }
                    break;
                case BEAT:
                    {
                    alt48=1;
                    }
                    break;
                case SPEED:
                    {
                    alt48=1;
                    }
                    break;
                case INSTRUMENT:
                    {
                    alt48=1;
                    }
                    break;
                case ID:
                case LETTER_X:
                    {
                    alt48=1;
                    }
                    break;
                case INCR:
                    {
                    alt48=1;
                    }
                    break;
                case DECR:
                    {
                    alt48=1;
                    }
                    break;
                case WHILE:
                    {
                    alt48=1;
                    }
                    break;
                case FOR:
                    {
                    alt48=1;
                    }
                    break;
                case IF:
                    {
                    alt48=1;
                    }
                    break;
                case SONG:
                    {
                    alt48=1;
                    }
                    break;
                case DRUMS_NOTE_TYPE:
                    {
                    alt48=1;
                    }
                    break;
                case 91:
                    {
                    alt48=1;
                    }
                    break;
                case ARMOR:
                case BEMOL:
                case SUSTAIN:
                    {
                    alt48=1;
                    }
                    break;
                case NOTE:
                    {
                    alt48=1;
                    }
                    break;
                case BOOL:
                case INT:
                case NOTE_TYPE:
                case STRING_TYPE:
                    {
                    alt48=1;
                    }
                    break;

                }

                switch (alt48) {
            	case 1 :
            	    // src/parser/Music.g:215:42: music_inst
            	    {
            	    pushFollow(FOLLOW_music_inst_in_compas2843);
            	    music_inst243=music_inst();

            	    state._fsp--;

            	    stream_music_inst.add(music_inst243.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt48 >= 1 ) break loop48;
                        EarlyExitException eee =
                            new EarlyExitException(48, input);
                        throw eee;
                }
                cnt48++;
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

        Token TONE244=null;
        Token NUM245=null;
        Token set246=null;

        AmlTree TONE244_tree=null;
        AmlTree NUM245_tree=null;
        AmlTree set246_tree=null;

        try {
            // src/parser/Music.g:218:13: ( TONE ^ NUM ( SUSTAIN | BEMOL ) )
            // src/parser/Music.g:218:17: TONE ^ NUM ( SUSTAIN | BEMOL )
            {
            root_0 = (AmlTree)adaptor.nil();


            TONE244=(Token)match(input,TONE,FOLLOW_TONE_in_tone2887); 
            TONE244_tree = 
            (AmlTree)adaptor.create(TONE244)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(TONE244_tree, root_0);


            NUM245=(Token)match(input,NUM,FOLLOW_NUM_in_tone2890); 
            NUM245_tree = 
            (AmlTree)adaptor.create(NUM245)
            ;
            adaptor.addChild(root_0, NUM245_tree);


            set246=(Token)input.LT(1);

            if ( input.LA(1)==BEMOL||input.LA(1)==SUSTAIN ) {
                input.consume();
                adaptor.addChild(root_0, 
                (AmlTree)adaptor.create(set246)
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

        Token char_literal248=null;
        Token FIGURE249=null;
        Token DOT250=null;
        Token TIE251=null;
        MusicParser.drumsnotes_return drumsnotes247 =null;


        AmlTree char_literal248_tree=null;
        AmlTree FIGURE249_tree=null;
        AmlTree DOT250_tree=null;
        AmlTree TIE251_tree=null;
        RewriteRuleTokenStream stream_94=new RewriteRuleTokenStream(adaptor,"token 94");
        RewriteRuleTokenStream stream_FIGURE=new RewriteRuleTokenStream(adaptor,"token FIGURE");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_TIE=new RewriteRuleTokenStream(adaptor,"token TIE");
        RewriteRuleSubtreeStream stream_drumsnotes=new RewriteRuleSubtreeStream(adaptor,"rule drumsnotes");
        try {
            // src/parser/Music.g:221:18: ( drumsnotes ( '.' FIGURE ( DOT )? )? ( TIE )? -> ^( DRUMSNOTES drumsnotes ( FIGURE )? ( DOT )? ( TIE )? ) )
            // src/parser/Music.g:221:20: drumsnotes ( '.' FIGURE ( DOT )? )? ( TIE )?
            {
            pushFollow(FOLLOW_drumsnotes_in_drumsnotes_group2919);
            drumsnotes247=drumsnotes();

            state._fsp--;

            stream_drumsnotes.add(drumsnotes247.getTree());

            // src/parser/Music.g:221:31: ( '.' FIGURE ( DOT )? )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==94) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // src/parser/Music.g:221:32: '.' FIGURE ( DOT )?
                    {
                    char_literal248=(Token)match(input,94,FOLLOW_94_in_drumsnotes_group2922);  
                    stream_94.add(char_literal248);


                    FIGURE249=(Token)match(input,FIGURE,FOLLOW_FIGURE_in_drumsnotes_group2924);  
                    stream_FIGURE.add(FIGURE249);


                    // src/parser/Music.g:221:43: ( DOT )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==DOT) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // src/parser/Music.g:221:43: DOT
                            {
                            DOT250=(Token)match(input,DOT,FOLLOW_DOT_in_drumsnotes_group2926);  
                            stream_DOT.add(DOT250);


                            }
                            break;

                    }


                    }
                    break;

            }


            // src/parser/Music.g:221:50: ( TIE )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==TIE) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // src/parser/Music.g:221:50: TIE
                    {
                    TIE251=(Token)match(input,TIE,FOLLOW_TIE_in_drumsnotes_group2931);  
                    stream_TIE.add(TIE251);


                    }
                    break;

            }


            // AST REWRITE
            // elements: DOT, TIE, drumsnotes, FIGURE
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

        Token char_literal253=null;
        Token FIGURE254=null;
        Token DOT255=null;
        Token TIE256=null;
        MusicParser.notes_type_return notes_type252 =null;


        AmlTree char_literal253_tree=null;
        AmlTree FIGURE254_tree=null;
        AmlTree DOT255_tree=null;
        AmlTree TIE256_tree=null;
        RewriteRuleTokenStream stream_94=new RewriteRuleTokenStream(adaptor,"token 94");
        RewriteRuleTokenStream stream_FIGURE=new RewriteRuleTokenStream(adaptor,"token FIGURE");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_TIE=new RewriteRuleTokenStream(adaptor,"token TIE");
        RewriteRuleSubtreeStream stream_notes_type=new RewriteRuleSubtreeStream(adaptor,"rule notes_type");
        try {
            // src/parser/Music.g:224:13: ( notes_type ( '.' FIGURE ( DOT )? )? ( TIE )? -> ^( NOTES notes_type ( FIGURE )? ( DOT )? ( TIE )? ) )
            // src/parser/Music.g:224:17: notes_type ( '.' FIGURE ( DOT )? )? ( TIE )?
            {
            pushFollow(FOLLOW_notes_type_in_notes_group2972);
            notes_type252=notes_type();

            state._fsp--;

            stream_notes_type.add(notes_type252.getTree());

            // src/parser/Music.g:224:28: ( '.' FIGURE ( DOT )? )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==94) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // src/parser/Music.g:224:29: '.' FIGURE ( DOT )?
                    {
                    char_literal253=(Token)match(input,94,FOLLOW_94_in_notes_group2975);  
                    stream_94.add(char_literal253);


                    FIGURE254=(Token)match(input,FIGURE,FOLLOW_FIGURE_in_notes_group2977);  
                    stream_FIGURE.add(FIGURE254);


                    // src/parser/Music.g:224:40: ( DOT )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==DOT) ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // src/parser/Music.g:224:40: DOT
                            {
                            DOT255=(Token)match(input,DOT,FOLLOW_DOT_in_notes_group2979);  
                            stream_DOT.add(DOT255);


                            }
                            break;

                    }


                    }
                    break;

            }


            // src/parser/Music.g:224:47: ( TIE )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==TIE) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // src/parser/Music.g:224:47: TIE
                    {
                    TIE256=(Token)match(input,TIE,FOLLOW_TIE_in_notes_group2984);  
                    stream_TIE.add(TIE256);


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

        Token char_literal258=null;
        Token FIGURE259=null;
        Token DOT260=null;
        MusicParser.drumsnotes_return drumsnotes257 =null;


        AmlTree char_literal258_tree=null;
        AmlTree FIGURE259_tree=null;
        AmlTree DOT260_tree=null;
        RewriteRuleTokenStream stream_94=new RewriteRuleTokenStream(adaptor,"token 94");
        RewriteRuleTokenStream stream_FIGURE=new RewriteRuleTokenStream(adaptor,"token FIGURE");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_drumsnotes=new RewriteRuleSubtreeStream(adaptor,"rule drumsnotes");
        try {
            // src/parser/Music.g:227:22: ( drumsnotes ( '.' FIGURE ( DOT )? )? -> ^( DRUMSNOTES drumsnotes ( FIGURE )? ( DOT )? ) )
            // src/parser/Music.g:227:26: drumsnotes ( '.' FIGURE ( DOT )? )?
            {
            pushFollow(FOLLOW_drumsnotes_in_drumsnotes_variable3026);
            drumsnotes257=drumsnotes();

            state._fsp--;

            stream_drumsnotes.add(drumsnotes257.getTree());

            // src/parser/Music.g:227:37: ( '.' FIGURE ( DOT )? )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==94) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // src/parser/Music.g:227:38: '.' FIGURE ( DOT )?
                    {
                    char_literal258=(Token)match(input,94,FOLLOW_94_in_drumsnotes_variable3029);  
                    stream_94.add(char_literal258);


                    FIGURE259=(Token)match(input,FIGURE,FOLLOW_FIGURE_in_drumsnotes_variable3031);  
                    stream_FIGURE.add(FIGURE259);


                    // src/parser/Music.g:227:49: ( DOT )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==DOT) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // src/parser/Music.g:227:49: DOT
                            {
                            DOT260=(Token)match(input,DOT,FOLLOW_DOT_in_drumsnotes_variable3033);  
                            stream_DOT.add(DOT260);


                            }
                            break;

                    }


                    }
                    break;

            }


            // AST REWRITE
            // elements: DOT, drumsnotes, FIGURE
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

        Token char_literal262=null;
        Token FIGURE263=null;
        Token DOT264=null;
        MusicParser.notes_type_return notes_type261 =null;


        AmlTree char_literal262_tree=null;
        AmlTree FIGURE263_tree=null;
        AmlTree DOT264_tree=null;
        RewriteRuleTokenStream stream_94=new RewriteRuleTokenStream(adaptor,"token 94");
        RewriteRuleTokenStream stream_FIGURE=new RewriteRuleTokenStream(adaptor,"token FIGURE");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_notes_type=new RewriteRuleSubtreeStream(adaptor,"rule notes_type");
        try {
            // src/parser/Music.g:230:17: ( notes_type ( '.' FIGURE ( DOT )? )? -> ^( NOTES notes_type ( FIGURE )? ( DOT )? ) )
            // src/parser/Music.g:230:21: notes_type ( '.' FIGURE ( DOT )? )?
            {
            pushFollow(FOLLOW_notes_type_in_notes_variable3078);
            notes_type261=notes_type();

            state._fsp--;

            stream_notes_type.add(notes_type261.getTree());

            // src/parser/Music.g:230:32: ( '.' FIGURE ( DOT )? )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==94) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // src/parser/Music.g:230:33: '.' FIGURE ( DOT )?
                    {
                    char_literal262=(Token)match(input,94,FOLLOW_94_in_notes_variable3081);  
                    stream_94.add(char_literal262);


                    FIGURE263=(Token)match(input,FIGURE,FOLLOW_FIGURE_in_notes_variable3083);  
                    stream_FIGURE.add(FIGURE263);


                    // src/parser/Music.g:230:44: ( DOT )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==DOT) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // src/parser/Music.g:230:44: DOT
                            {
                            DOT264=(Token)match(input,DOT,FOLLOW_DOT_in_notes_variable3085);  
                            stream_DOT.add(DOT264);


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

        MusicParser.chord_return chord265 =null;

        MusicParser.notes_return notes266 =null;



        try {
            // src/parser/Music.g:233:13: ( chord | notes )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==CHORD) ) {
                alt59=1;
            }
            else if ( (LA59_0==ARMOR||LA59_0==BEMOL||LA59_0==NOTE||LA59_0==SUSTAIN||LA59_0==91) ) {
                alt59=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;

            }
            switch (alt59) {
                case 1 :
                    // src/parser/Music.g:233:15: chord
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_chord_in_notes_type3128);
                    chord265=chord();

                    state._fsp--;

                    adaptor.addChild(root_0, chord265.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:233:23: notes
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_notes_in_notes_type3132);
                    notes266=notes();

                    state._fsp--;

                    adaptor.addChild(root_0, notes266.getTree());

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

        Token CHORD267=null;
        Token char_literal268=null;
        Token set270=null;
        Token set271=null;
        Token char_literal272=null;
        MusicParser.note_return note269 =null;


        AmlTree CHORD267_tree=null;
        AmlTree char_literal268_tree=null;
        AmlTree set270_tree=null;
        AmlTree set271_tree=null;
        AmlTree char_literal272_tree=null;

        try {
            // src/parser/Music.g:236:13: ( CHORD ^ '(' ! note ( MINOR | PLUS | DIMINUTION )? ( SEVENTH | MAJ7 )? ')' !)
            // src/parser/Music.g:236:17: CHORD ^ '(' ! note ( MINOR | PLUS | DIMINUTION )? ( SEVENTH | MAJ7 )? ')' !
            {
            root_0 = (AmlTree)adaptor.nil();


            CHORD267=(Token)match(input,CHORD,FOLLOW_CHORD_in_chord3161); 
            CHORD267_tree = 
            (AmlTree)adaptor.create(CHORD267)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(CHORD267_tree, root_0);


            char_literal268=(Token)match(input,91,FOLLOW_91_in_chord3164); 

            pushFollow(FOLLOW_note_in_chord3167);
            note269=note();

            state._fsp--;

            adaptor.addChild(root_0, note269.getTree());

            // src/parser/Music.g:236:34: ( MINOR | PLUS | DIMINUTION )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==DIMINUTION||LA60_0==MINOR||LA60_0==PLUS) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // src/parser/Music.g:
                    {
                    set270=(Token)input.LT(1);

                    if ( input.LA(1)==DIMINUTION||input.LA(1)==MINOR||input.LA(1)==PLUS ) {
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


            // src/parser/Music.g:236:59: ( SEVENTH | MAJ7 )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==MAJ7||LA61_0==SEVENTH) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // src/parser/Music.g:
                    {
                    set271=(Token)input.LT(1);

                    if ( input.LA(1)==MAJ7||input.LA(1)==SEVENTH ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (AmlTree)adaptor.create(set271)
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


            char_literal272=(Token)match(input,92,FOLLOW_92_in_chord3187); 

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

        Token char_literal273=null;
        Token char_literal275=null;
        MusicParser.note_return note274 =null;

        MusicParser.note_return note276 =null;


        AmlTree char_literal273_tree=null;
        AmlTree char_literal275_tree=null;
        RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
        RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
        RewriteRuleSubtreeStream stream_note=new RewriteRuleSubtreeStream(adaptor,"rule note");
        try {
            // src/parser/Music.g:239:13: ( ( '(' ( note )+ ')' | note ) -> ^( NOTE_LIST ( note )+ ) )
            // src/parser/Music.g:239:17: ( '(' ( note )+ ')' | note )
            {
            // src/parser/Music.g:239:17: ( '(' ( note )+ ')' | note )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==91) ) {
                alt63=1;
            }
            else if ( (LA63_0==ARMOR||LA63_0==BEMOL||LA63_0==NOTE||LA63_0==SUSTAIN) ) {
                alt63=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;

            }
            switch (alt63) {
                case 1 :
                    // src/parser/Music.g:239:19: '(' ( note )+ ')'
                    {
                    char_literal273=(Token)match(input,91,FOLLOW_91_in_notes3219);  
                    stream_91.add(char_literal273);


                    // src/parser/Music.g:239:23: ( note )+
                    int cnt62=0;
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( (LA62_0==ARMOR||LA62_0==BEMOL||LA62_0==NOTE||LA62_0==SUSTAIN) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // src/parser/Music.g:239:24: note
                    	    {
                    	    pushFollow(FOLLOW_note_in_notes3222);
                    	    note274=note();

                    	    state._fsp--;

                    	    stream_note.add(note274.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt62 >= 1 ) break loop62;
                                EarlyExitException eee =
                                    new EarlyExitException(62, input);
                                throw eee;
                        }
                        cnt62++;
                    } while (true);


                    char_literal275=(Token)match(input,92,FOLLOW_92_in_notes3226);  
                    stream_92.add(char_literal275);


                    }
                    break;
                case 2 :
                    // src/parser/Music.g:239:38: note
                    {
                    pushFollow(FOLLOW_note_in_notes3231);
                    note276=note();

                    state._fsp--;

                    stream_note.add(note276.getTree());

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

        Token char_literal277=null;
        Token char_literal279=null;
        MusicParser.drums_return drums278 =null;

        MusicParser.drums_return drums280 =null;


        AmlTree char_literal277_tree=null;
        AmlTree char_literal279_tree=null;
        RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
        RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
        RewriteRuleSubtreeStream stream_drums=new RewriteRuleSubtreeStream(adaptor,"rule drums");
        try {
            // src/parser/Music.g:242:13: ( ( '(' ( drums )+ ')' | drums ) -> ^( DRUMSNOTE_LIST ( drums )+ ) )
            // src/parser/Music.g:242:17: ( '(' ( drums )+ ')' | drums )
            {
            // src/parser/Music.g:242:17: ( '(' ( drums )+ ')' | drums )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==91) ) {
                alt65=1;
            }
            else if ( (LA65_0==DRUMS_NOTE_TYPE) ) {
                alt65=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;

            }
            switch (alt65) {
                case 1 :
                    // src/parser/Music.g:242:19: '(' ( drums )+ ')'
                    {
                    char_literal277=(Token)match(input,91,FOLLOW_91_in_drumsnotes3267);  
                    stream_91.add(char_literal277);


                    // src/parser/Music.g:242:23: ( drums )+
                    int cnt64=0;
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( (LA64_0==DRUMS_NOTE_TYPE) ) {
                            alt64=1;
                        }


                        switch (alt64) {
                    	case 1 :
                    	    // src/parser/Music.g:242:24: drums
                    	    {
                    	    pushFollow(FOLLOW_drums_in_drumsnotes3270);
                    	    drums278=drums();

                    	    state._fsp--;

                    	    stream_drums.add(drums278.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt64 >= 1 ) break loop64;
                                EarlyExitException eee =
                                    new EarlyExitException(64, input);
                                throw eee;
                        }
                        cnt64++;
                    } while (true);


                    char_literal279=(Token)match(input,92,FOLLOW_92_in_drumsnotes3274);  
                    stream_92.add(char_literal279);


                    }
                    break;
                case 2 :
                    // src/parser/Music.g:242:39: drums
                    {
                    pushFollow(FOLLOW_drums_in_drumsnotes3279);
                    drums280=drums();

                    state._fsp--;

                    stream_drums.add(drums280.getTree());

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

        Token DRUMS_NOTE_TYPE281=null;
        Token char_literal282=null;
        Token char_literal284=null;
        MusicParser.num_expr_return num_expr283 =null;


        AmlTree DRUMS_NOTE_TYPE281_tree=null;
        AmlTree char_literal282_tree=null;
        AmlTree char_literal284_tree=null;

        try {
            // src/parser/Music.g:245:13: ( DRUMS_NOTE_TYPE ! '(' ! num_expr ^ ')' !)
            // src/parser/Music.g:245:17: DRUMS_NOTE_TYPE ! '(' ! num_expr ^ ')' !
            {
            root_0 = (AmlTree)adaptor.nil();


            DRUMS_NOTE_TYPE281=(Token)match(input,DRUMS_NOTE_TYPE,FOLLOW_DRUMS_NOTE_TYPE_in_drums3318); 

            char_literal282=(Token)match(input,91,FOLLOW_91_in_drums3321); 

            pushFollow(FOLLOW_num_expr_in_drums3324);
            num_expr283=num_expr();

            state._fsp--;

            root_0 = (AmlTree)adaptor.becomeRoot(num_expr283.getTree(), root_0);

            char_literal284=(Token)match(input,92,FOLLOW_92_in_drums3327); 

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

        Token set285=null;
        Token NOTE286=null;
        Token NUM287=null;

        AmlTree set285_tree=null;
        AmlTree NOTE286_tree=null;
        AmlTree NUM287_tree=null;

        try {
            // src/parser/Music.g:248:13: ( ( BEMOL | SUSTAIN | ARMOR )? NOTE ^ ( NUM )? )
            // src/parser/Music.g:248:17: ( BEMOL | SUSTAIN | ARMOR )? NOTE ^ ( NUM )?
            {
            root_0 = (AmlTree)adaptor.nil();


            // src/parser/Music.g:248:17: ( BEMOL | SUSTAIN | ARMOR )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==ARMOR||LA66_0==BEMOL||LA66_0==SUSTAIN) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // src/parser/Music.g:
                    {
                    set285=(Token)input.LT(1);

                    if ( input.LA(1)==ARMOR||input.LA(1)==BEMOL||input.LA(1)==SUSTAIN ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (AmlTree)adaptor.create(set285)
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


            NOTE286=(Token)match(input,NOTE,FOLLOW_NOTE_in_note3371); 
            NOTE286_tree = 
            (AmlTree)adaptor.create(NOTE286)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(NOTE286_tree, root_0);


            // src/parser/Music.g:248:50: ( NUM )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==NUM) ) {
                int LA67_1 = input.LA(2);

                if ( (LA67_1==LETTER_X) ) {
                    int LA67_3 = input.LA(3);

                    if ( (LA67_3==ASSIG||LA67_3==DECR||LA67_3==DIVIDE_ASSIG||LA67_3==INCR||LA67_3==MINUS_ASSIG||LA67_3==MOD_ASSIG||LA67_3==PLUS_ASSIG||LA67_3==PROD_ASSIG||LA67_3==91||LA67_3==94) ) {
                        alt67=1;
                    }
                }
                else if ( (LA67_1==ARMOR||(LA67_1 >= BAR && LA67_1 <= BOOL)||LA67_1==CHORD||(LA67_1 >= DECR && LA67_1 <= DIMINUTION)||LA67_1==DOUBLE_BAR||LA67_1==DRUMS_NOTE_TYPE||LA67_1==END_REPETITION||LA67_1==FOR||(LA67_1 >= ID && LA67_1 <= INT)||(LA67_1 >= MAJ7 && LA67_1 <= MINOR)||LA67_1==NOTE||LA67_1==NOTE_TYPE||LA67_1==NUM||LA67_1==PLUS||(LA67_1 >= SEVENTH && LA67_1 <= START_REPETITION)||(LA67_1 >= STRING_TYPE && LA67_1 <= TONE)||LA67_1==WHILE||(LA67_1 >= 91 && LA67_1 <= 94)||LA67_1==96||LA67_1==98) ) {
                    alt67=1;
                }
            }
            switch (alt67) {
                case 1 :
                    // src/parser/Music.g:248:51: NUM
                    {
                    NUM287=(Token)match(input,NUM,FOLLOW_NUM_in_note3375); 
                    NUM287_tree = 
                    (AmlTree)adaptor.create(NUM287)
                    ;
                    adaptor.addChild(root_0, NUM287_tree);


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

        Token OR289=null;
        MusicParser.boolterm_return boolterm288 =null;

        MusicParser.boolterm_return boolterm290 =null;


        AmlTree OR289_tree=null;

        try {
            // src/parser/Music.g:252:9: ( boolterm ( OR ^ boolterm )* )
            // src/parser/Music.g:252:13: boolterm ( OR ^ boolterm )*
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_boolterm_in_expr3404);
            boolterm288=boolterm();

            state._fsp--;

            adaptor.addChild(root_0, boolterm288.getTree());

            // src/parser/Music.g:252:22: ( OR ^ boolterm )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==OR) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // src/parser/Music.g:252:23: OR ^ boolterm
            	    {
            	    OR289=(Token)match(input,OR,FOLLOW_OR_in_expr3407); 
            	    OR289_tree = 
            	    (AmlTree)adaptor.create(OR289)
            	    ;
            	    root_0 = (AmlTree)adaptor.becomeRoot(OR289_tree, root_0);


            	    pushFollow(FOLLOW_boolterm_in_expr3410);
            	    boolterm290=boolterm();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolterm290.getTree());

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
    // src/parser/Music.g:255:1: boolterm : boolfact ( AND ^ boolfact )* ;
    public final MusicParser.boolterm_return boolterm() throws RecognitionException {
        MusicParser.boolterm_return retval = new MusicParser.boolterm_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token AND292=null;
        MusicParser.boolfact_return boolfact291 =null;

        MusicParser.boolfact_return boolfact293 =null;


        AmlTree AND292_tree=null;

        try {
            // src/parser/Music.g:255:13: ( boolfact ( AND ^ boolfact )* )
            // src/parser/Music.g:255:17: boolfact ( AND ^ boolfact )*
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_boolfact_in_boolterm3428);
            boolfact291=boolfact();

            state._fsp--;

            adaptor.addChild(root_0, boolfact291.getTree());

            // src/parser/Music.g:255:26: ( AND ^ boolfact )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==AND) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // src/parser/Music.g:255:27: AND ^ boolfact
            	    {
            	    AND292=(Token)match(input,AND,FOLLOW_AND_in_boolterm3431); 
            	    AND292_tree = 
            	    (AmlTree)adaptor.create(AND292)
            	    ;
            	    root_0 = (AmlTree)adaptor.becomeRoot(AND292_tree, root_0);


            	    pushFollow(FOLLOW_boolfact_in_boolterm3434);
            	    boolfact293=boolfact();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolfact293.getTree());

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
    // src/parser/Music.g:258:1: boolfact : num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? ;
    public final MusicParser.boolfact_return boolfact() throws RecognitionException {
        MusicParser.boolfact_return retval = new MusicParser.boolfact_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token EQUAL295=null;
        Token NOT_EQUAL296=null;
        Token LT297=null;
        Token LE298=null;
        Token GT299=null;
        Token GE300=null;
        MusicParser.num_expr_return num_expr294 =null;

        MusicParser.num_expr_return num_expr301 =null;


        AmlTree EQUAL295_tree=null;
        AmlTree NOT_EQUAL296_tree=null;
        AmlTree LT297_tree=null;
        AmlTree LE298_tree=null;
        AmlTree GT299_tree=null;
        AmlTree GE300_tree=null;

        try {
            // src/parser/Music.g:258:13: ( num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? )
            // src/parser/Music.g:258:17: num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_num_expr_in_boolfact3456);
            num_expr294=num_expr();

            state._fsp--;

            adaptor.addChild(root_0, num_expr294.getTree());

            // src/parser/Music.g:258:26: ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==EQUAL||(LA71_0 >= GE && LA71_0 <= GT)||LA71_0==LE||LA71_0==LT||LA71_0==NOT_EQUAL) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // src/parser/Music.g:258:27: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr
                    {
                    // src/parser/Music.g:258:27: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^)
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
                            // src/parser/Music.g:258:28: EQUAL ^
                            {
                            EQUAL295=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_boolfact3460); 
                            EQUAL295_tree = 
                            (AmlTree)adaptor.create(EQUAL295)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(EQUAL295_tree, root_0);


                            }
                            break;
                        case 2 :
                            // src/parser/Music.g:258:37: NOT_EQUAL ^
                            {
                            NOT_EQUAL296=(Token)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_boolfact3465); 
                            NOT_EQUAL296_tree = 
                            (AmlTree)adaptor.create(NOT_EQUAL296)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(NOT_EQUAL296_tree, root_0);


                            }
                            break;
                        case 3 :
                            // src/parser/Music.g:258:50: LT ^
                            {
                            LT297=(Token)match(input,LT,FOLLOW_LT_in_boolfact3470); 
                            LT297_tree = 
                            (AmlTree)adaptor.create(LT297)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(LT297_tree, root_0);


                            }
                            break;
                        case 4 :
                            // src/parser/Music.g:258:56: LE ^
                            {
                            LE298=(Token)match(input,LE,FOLLOW_LE_in_boolfact3475); 
                            LE298_tree = 
                            (AmlTree)adaptor.create(LE298)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(LE298_tree, root_0);


                            }
                            break;
                        case 5 :
                            // src/parser/Music.g:258:62: GT ^
                            {
                            GT299=(Token)match(input,GT,FOLLOW_GT_in_boolfact3480); 
                            GT299_tree = 
                            (AmlTree)adaptor.create(GT299)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(GT299_tree, root_0);


                            }
                            break;
                        case 6 :
                            // src/parser/Music.g:258:68: GE ^
                            {
                            GE300=(Token)match(input,GE,FOLLOW_GE_in_boolfact3485); 
                            GE300_tree = 
                            (AmlTree)adaptor.create(GE300)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(GE300_tree, root_0);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_num_expr_in_boolfact3489);
                    num_expr301=num_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, num_expr301.getTree());

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

        Token PLUS303=null;
        Token MINUS304=null;
        MusicParser.term_return term302 =null;

        MusicParser.term_return term305 =null;


        AmlTree PLUS303_tree=null;
        AmlTree MINUS304_tree=null;

        try {
            // src/parser/Music.g:261:13: ( term ( ( PLUS ^| MINUS ^) term )* )
            // src/parser/Music.g:261:17: term ( ( PLUS ^| MINUS ^) term )*
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_term_in_num_expr3511);
            term302=term();

            state._fsp--;

            adaptor.addChild(root_0, term302.getTree());

            // src/parser/Music.g:261:22: ( ( PLUS ^| MINUS ^) term )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==MINUS||LA73_0==PLUS) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // src/parser/Music.g:261:24: ( PLUS ^| MINUS ^) term
            	    {
            	    // src/parser/Music.g:261:24: ( PLUS ^| MINUS ^)
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
            	            // src/parser/Music.g:261:25: PLUS ^
            	            {
            	            PLUS303=(Token)match(input,PLUS,FOLLOW_PLUS_in_num_expr3516); 
            	            PLUS303_tree = 
            	            (AmlTree)adaptor.create(PLUS303)
            	            ;
            	            root_0 = (AmlTree)adaptor.becomeRoot(PLUS303_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // src/parser/Music.g:261:33: MINUS ^
            	            {
            	            MINUS304=(Token)match(input,MINUS,FOLLOW_MINUS_in_num_expr3521); 
            	            MINUS304_tree = 
            	            (AmlTree)adaptor.create(MINUS304)
            	            ;
            	            root_0 = (AmlTree)adaptor.becomeRoot(MINUS304_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_term_in_num_expr3525);
            	    term305=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term305.getTree());

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
    // src/parser/Music.g:264:1: term : factor ( ( DOT ^| DIV ^| MOD ^) factor )* ;
    public final MusicParser.term_return term() throws RecognitionException {
        MusicParser.term_return retval = new MusicParser.term_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token DOT307=null;
        Token DIV308=null;
        Token MOD309=null;
        MusicParser.factor_return factor306 =null;

        MusicParser.factor_return factor310 =null;


        AmlTree DOT307_tree=null;
        AmlTree DIV308_tree=null;
        AmlTree MOD309_tree=null;

        try {
            // src/parser/Music.g:264:9: ( factor ( ( DOT ^| DIV ^| MOD ^) factor )* )
            // src/parser/Music.g:264:13: factor ( ( DOT ^| DIV ^| MOD ^) factor )*
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term3547);
            factor306=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor306.getTree());

            // src/parser/Music.g:264:20: ( ( DOT ^| DIV ^| MOD ^) factor )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==DIV||LA75_0==DOT||LA75_0==MOD) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // src/parser/Music.g:264:22: ( DOT ^| DIV ^| MOD ^) factor
            	    {
            	    // src/parser/Music.g:264:22: ( DOT ^| DIV ^| MOD ^)
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
            	            // src/parser/Music.g:264:23: DOT ^
            	            {
            	            DOT307=(Token)match(input,DOT,FOLLOW_DOT_in_term3552); 
            	            DOT307_tree = 
            	            (AmlTree)adaptor.create(DOT307)
            	            ;
            	            root_0 = (AmlTree)adaptor.becomeRoot(DOT307_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // src/parser/Music.g:264:30: DIV ^
            	            {
            	            DIV308=(Token)match(input,DIV,FOLLOW_DIV_in_term3557); 
            	            DIV308_tree = 
            	            (AmlTree)adaptor.create(DIV308)
            	            ;
            	            root_0 = (AmlTree)adaptor.becomeRoot(DIV308_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // src/parser/Music.g:264:37: MOD ^
            	            {
            	            MOD309=(Token)match(input,MOD,FOLLOW_MOD_in_term3562); 
            	            MOD309_tree = 
            	            (AmlTree)adaptor.create(MOD309)
            	            ;
            	            root_0 = (AmlTree)adaptor.becomeRoot(MOD309_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_factor_in_term3566);
            	    factor310=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor310.getTree());

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
    // src/parser/Music.g:267:1: factor : ( NOT ^| PLUS ^| MINUS ^)? atom ;
    public final MusicParser.factor_return factor() throws RecognitionException {
        MusicParser.factor_return retval = new MusicParser.factor_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token NOT311=null;
        Token PLUS312=null;
        Token MINUS313=null;
        MusicParser.atom_return atom314 =null;


        AmlTree NOT311_tree=null;
        AmlTree PLUS312_tree=null;
        AmlTree MINUS313_tree=null;

        try {
            // src/parser/Music.g:267:9: ( ( NOT ^| PLUS ^| MINUS ^)? atom )
            // src/parser/Music.g:267:13: ( NOT ^| PLUS ^| MINUS ^)? atom
            {
            root_0 = (AmlTree)adaptor.nil();


            // src/parser/Music.g:267:13: ( NOT ^| PLUS ^| MINUS ^)?
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
                    // src/parser/Music.g:267:14: NOT ^
                    {
                    NOT311=(Token)match(input,NOT,FOLLOW_NOT_in_factor3583); 
                    NOT311_tree = 
                    (AmlTree)adaptor.create(NOT311)
                    ;
                    root_0 = (AmlTree)adaptor.becomeRoot(NOT311_tree, root_0);


                    }
                    break;
                case 2 :
                    // src/parser/Music.g:267:21: PLUS ^
                    {
                    PLUS312=(Token)match(input,PLUS,FOLLOW_PLUS_in_factor3588); 
                    PLUS312_tree = 
                    (AmlTree)adaptor.create(PLUS312)
                    ;
                    root_0 = (AmlTree)adaptor.becomeRoot(PLUS312_tree, root_0);


                    }
                    break;
                case 3 :
                    // src/parser/Music.g:267:29: MINUS ^
                    {
                    MINUS313=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor3593); 
                    MINUS313_tree = 
                    (AmlTree)adaptor.create(MINUS313)
                    ;
                    root_0 = (AmlTree)adaptor.becomeRoot(MINUS313_tree, root_0);


                    }
                    break;

            }


            pushFollow(FOLLOW_atom_in_factor3598);
            atom314=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom314.getTree());

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
        Token NUM316=null;
        Token STRING317=null;
        Token char_literal319=null;
        Token char_literal321=null;
        MusicParser.var_access_return var_access315 =null;

        MusicParser.funcall_return funcall318 =null;

        MusicParser.expr_return expr320 =null;


        AmlTree b_tree=null;
        AmlTree NUM316_tree=null;
        AmlTree STRING317_tree=null;
        AmlTree char_literal319_tree=null;
        AmlTree char_literal321_tree=null;
        RewriteRuleTokenStream stream_FALSE=new RewriteRuleTokenStream(adaptor,"token FALSE");
        RewriteRuleTokenStream stream_TRUE=new RewriteRuleTokenStream(adaptor,"token TRUE");

        try {
            // src/parser/Music.g:270:9: ( var_access | NUM | STRING | funcall | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | '(' ! expr ')' !)
            int alt78=6;
            switch ( input.LA(1) ) {
            case ID:
            case LETTER_X:
                {
                int LA78_1 = input.LA(2);

                if ( (LA78_1==AND||LA78_1==DIV||LA78_1==DOT||LA78_1==EQUAL||(LA78_1 >= GE && LA78_1 <= GT)||LA78_1==LE||LA78_1==LT||LA78_1==MINUS||LA78_1==MOD||LA78_1==NOT_EQUAL||(LA78_1 >= OR && LA78_1 <= PLUS)||(LA78_1 >= 92 && LA78_1 <= 94)||LA78_1==96) ) {
                    alt78=1;
                }
                else if ( (LA78_1==91) ) {
                    alt78=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 78, 1, input);

                    throw nvae;

                }
                }
                break;
            case NUM:
                {
                alt78=2;
                }
                break;
            case STRING:
                {
                alt78=3;
                }
                break;
            case FALSE:
            case TRUE:
                {
                alt78=5;
                }
                break;
            case 91:
                {
                alt78=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;

            }

            switch (alt78) {
                case 1 :
                    // src/parser/Music.g:270:13: var_access
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_var_access_in_atom3614);
                    var_access315=var_access();

                    state._fsp--;

                    adaptor.addChild(root_0, var_access315.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:271:7: NUM
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    NUM316=(Token)match(input,NUM,FOLLOW_NUM_in_atom3622); 
                    NUM316_tree = 
                    (AmlTree)adaptor.create(NUM316)
                    ;
                    adaptor.addChild(root_0, NUM316_tree);


                    }
                    break;
                case 3 :
                    // src/parser/Music.g:272:7: STRING
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    STRING317=(Token)match(input,STRING,FOLLOW_STRING_in_atom3630); 
                    STRING317_tree = 
                    (AmlTree)adaptor.create(STRING317)
                    ;
                    adaptor.addChild(root_0, STRING317_tree);


                    }
                    break;
                case 4 :
                    // src/parser/Music.g:273:7: funcall
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_atom3638);
                    funcall318=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall318.getTree());

                    }
                    break;
                case 5 :
                    // src/parser/Music.g:274:7: (b= TRUE |b= FALSE )
                    {
                    // src/parser/Music.g:274:7: (b= TRUE |b= FALSE )
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==TRUE) ) {
                        alt77=1;
                    }
                    else if ( (LA77_0==FALSE) ) {
                        alt77=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 77, 0, input);

                        throw nvae;

                    }
                    switch (alt77) {
                        case 1 :
                            // src/parser/Music.g:274:8: b= TRUE
                            {
                            b=(Token)match(input,TRUE,FOLLOW_TRUE_in_atom3649);  
                            stream_TRUE.add(b);


                            }
                            break;
                        case 2 :
                            // src/parser/Music.g:274:17: b= FALSE
                            {
                            b=(Token)match(input,FALSE,FOLLOW_FALSE_in_atom3655);  
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


                    char_literal319=(Token)match(input,91,FOLLOW_91_in_atom3672); 

                    pushFollow(FOLLOW_expr_in_atom3675);
                    expr320=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr320.getTree());

                    char_literal321=(Token)match(input,92,FOLLOW_92_in_atom3677); 

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


 

    public static final BitSet FOLLOW_global_stmt_in_prog200 = new BitSet(new long[]{0x0000201004002800L,0x0000000001011001L});
    public static final BitSet FOLLOW_EOF_in_prog204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_global_stmt236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_frag_in_global_stmt254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_song_in_global_stmt272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_rule_in_var_funcall297 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_var_funcall299 = new BitSet(new long[]{0x0000820000000000L});
    public static final BitSet FOLLOW_id_rule_in_var_funcall303 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_var_funcall305 = new BitSet(new long[]{0x3100820204002420L,0x0000000018428014L});
    public static final BitSet FOLLOW_params_in_var_funcall307 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_var_funcall310 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_var_funcall312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_rule_in_var_access353 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_var_access356 = new BitSet(new long[]{0x0000820000000000L});
    public static final BitSet FOLLOW_id_rule_in_var_access360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_rule_in_var_access389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_void_in_function459 = new BitSet(new long[]{0x0000820000000000L});
    public static final BitSet FOLLOW_id_rule_in_function463 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_function465 = new BitSet(new long[]{0x0000200004002800L,0x0000000010010001L});
    public static final BitSet FOLLOW_list_arguments_in_function467 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_function469 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_function471 = new BitSet(new long[]{0x0000BE0804422A00L,0x0000000002097405L});
    public static final BitSet FOLLOW_listInst_in_function473 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_function475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_rule_in_funcall522 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_funcall524 = new BitSet(new long[]{0x3100820204002420L,0x0000000018428014L});
    public static final BitSet FOLLOW_params_in_funcall526 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_funcall529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FRAGMENT_in_frag563 = new BitSet(new long[]{0x0000820000000000L});
    public static final BitSet FOLLOW_id_rule_in_frag566 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_frag568 = new BitSet(new long[]{0x0000200004002800L,0x0000000010010001L});
    public static final BitSet FOLLOW_list_arguments_in_frag571 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_frag573 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_frag576 = new BitSet(new long[]{0x2000BE0804022E20L,0x000000000A0B3001L});
    public static final BitSet FOLLOW_list_music_inst_in_frag579 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_frag581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_argument_in_list_arguments601 = new BitSet(new long[]{0x0000000000000002L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_list_arguments604 = new BitSet(new long[]{0x0000200004002800L,0x0000000000010001L});
    public static final BitSet FOLLOW_argument_in_list_arguments606 = new BitSet(new long[]{0x0000000000000002L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_argument647 = new BitSet(new long[]{0x0000820000000000L});
    public static final BitSet FOLLOW_id_rule_in_argument650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_params677 = new BitSet(new long[]{0x0000000000000002L,0x0000000020000000L});
    public static final BitSet FOLLOW_notes_variable_in_params681 = new BitSet(new long[]{0x0000000000000002L,0x0000000020000000L});
    public static final BitSet FOLLOW_drumsnotes_variable_in_params685 = new BitSet(new long[]{0x0000000000000002L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_params689 = new BitSet(new long[]{0x3100820204002420L,0x0000000008428014L});
    public static final BitSet FOLLOW_expr_in_params693 = new BitSet(new long[]{0x0000000000000002L,0x0000000020000000L});
    public static final BitSet FOLLOW_notes_variable_in_params697 = new BitSet(new long[]{0x0000000000000002L,0x0000000020000000L});
    public static final BitSet FOLLOW_drumsnotes_variable_in_params701 = new BitSet(new long[]{0x0000000000000002L,0x0000000020000000L});
    public static final BitSet FOLLOW_inst_in_listInst729 = new BitSet(new long[]{0x0000BE0804422A02L,0x0000000002097405L});
    public static final BitSet FOLLOW_music_inst_in_list_music_inst763 = new BitSet(new long[]{0x2000BE0804022E22L,0x000000000A0B3001L});
    public static final BitSet FOLLOW_declaration_in_inst807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_inst825 = new BitSet(new long[]{0x3100820204002420L,0x0000000008428014L});
    public static final BitSet FOLLOW_expr_in_inst829 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_notes_group_in_inst833 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_drumsnotes_group_in_inst837 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_inst840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_funcall_in_inst859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tone_in_inst877 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_inst879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_beat_in_inst898 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_inst900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_speed_in_inst919 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_inst921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instrument_in_inst940 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_inst942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignation_in_inst961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_stmt_in_inst979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_inst997 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_inst999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_stmt_in_inst1018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_stmt_in_inst1036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_song_in_inst1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compas_list_in_inst1072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_music_inst1096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tone_in_music_inst1114 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_music_inst1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_beat_in_music_inst1135 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_music_inst1137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_speed_in_music_inst1156 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_music_inst1158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instrument_in_music_inst1177 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_music_inst1179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_funcall_in_music_inst1198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignation_in_music_inst1216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_music_stmt_in_music_inst1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_music_inst1252 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_music_inst1254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_music_stmt_in_music_inst1273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_music_stmt_in_music_inst1291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_song_in_music_inst1309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notes_group_in_music_inst1336 = new BitSet(new long[]{0x2000000000002422L,0x0000000108020000L});
    public static final BitSet FOLLOW_96_in_music_inst1340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_drumsnotes_group_in_music_inst1369 = new BitSet(new long[]{0x0000000004000002L,0x0000000108000000L});
    public static final BitSet FOLLOW_96_in_music_inst1373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_declaration1398 = new BitSet(new long[]{0x0000820000000000L});
    public static final BitSet FOLLOW_assig_opt_in_declaration1401 = new BitSet(new long[]{0x0000000000000000L,0x0000000120000000L});
    public static final BitSet FOLLOW_93_in_declaration1404 = new BitSet(new long[]{0x0000820000000000L});
    public static final BitSet FOLLOW_assig_opt_in_declaration1407 = new BitSet(new long[]{0x0000000000000000L,0x0000000120000000L});
    public static final BitSet FOLLOW_96_in_declaration1411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_type_void1557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOID_in_type_void1575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_rule_in_assig_opt1600 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ASSIG_in_assig_opt1603 = new BitSet(new long[]{0x3100820204002420L,0x0000000008428014L});
    public static final BitSet FOLLOW_expr_in_assig_opt1607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notes_variable_in_assig_opt1611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_drumsnotes_variable_in_assig_opt1615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assig_in_assignation1641 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_assignation1643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_access_in_assig1673 = new BitSet(new long[]{0x0A00000000100040L,0x0000000000000120L});
    public static final BitSet FOLLOW_set_in_assig1675 = new BitSet(new long[]{0x3100820604002420L,0x0000000008428014L});
    public static final BitSet FOLLOW_expr_in_assig1691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notes_variable_in_assig1695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_drumsnotes_variable_in_assig1699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIGURE_in_assig1703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_post_in_assig1722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pre_in_assig1740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_access_in_post1770 = new BitSet(new long[]{0x0000080000020000L});
    public static final BitSet FOLLOW_INCR_in_post1775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECR_in_post1781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INCR_in_pre1828 = new BitSet(new long[]{0x0000820000000000L});
    public static final BitSet FOLLOW_DECR_in_pre1834 = new BitSet(new long[]{0x0000820000000000L});
    public static final BitSet FOLLOW_var_access_in_pre1837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BEAT_in_beat1880 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_NUM_in_beat1883 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_beat1885 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_NUM_in_beat1888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SPEED_in_speed1917 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_NUM_in_speed1920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRANSPORT_in_transport1945 = new BitSet(new long[]{0x1100820200000000L,0x0000000008408014L});
    public static final BitSet FOLLOW_expr_in_transport1948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUMENT_in_instrument1972 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_STRING_in_instrument1975 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_instrument1977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_stmt2001 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_while_stmt2004 = new BitSet(new long[]{0x1100820200000000L,0x0000000008408014L});
    public static final BitSet FOLLOW_expr_in_while_stmt2007 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_while_stmt2009 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_while_stmt2012 = new BitSet(new long[]{0x0000BE0804422A00L,0x0000000002097405L});
    public static final BitSet FOLLOW_listInst_in_while_stmt2015 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_while_stmt2017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_music_stmt2044 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_while_music_stmt2047 = new BitSet(new long[]{0x1100820200000000L,0x0000000008408014L});
    public static final BitSet FOLLOW_expr_in_while_music_stmt2050 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_while_music_stmt2052 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_while_music_stmt2055 = new BitSet(new long[]{0x2000BE0804022E20L,0x000000000A0B3001L});
    public static final BitSet FOLLOW_list_music_inst_in_while_music_stmt2058 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_while_music_stmt2060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_for_stmt2095 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_for_stmt2098 = new BitSet(new long[]{0x0000AA0004022800L,0x0000000000010001L});
    public static final BitSet FOLLOW_declaration_in_for_stmt2102 = new BitSet(new long[]{0x1100820200000000L,0x0000000008408014L});
    public static final BitSet FOLLOW_list_assig_in_for_stmt2106 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_for_stmt2108 = new BitSet(new long[]{0x1100820200000000L,0x0000000008408014L});
    public static final BitSet FOLLOW_expr_in_for_stmt2112 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_for_stmt2114 = new BitSet(new long[]{0x00008A0000020000L});
    public static final BitSet FOLLOW_list_assig_in_for_stmt2117 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_for_stmt2119 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_for_stmt2122 = new BitSet(new long[]{0x0000BE0804422A00L,0x0000000002097405L});
    public static final BitSet FOLLOW_listInst_in_for_stmt2125 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_for_stmt2127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_for_music_stmt2152 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_for_music_stmt2155 = new BitSet(new long[]{0x0000AA0004022800L,0x0000000000010001L});
    public static final BitSet FOLLOW_declaration_in_for_music_stmt2159 = new BitSet(new long[]{0x1100820200000000L,0x0000000008408014L});
    public static final BitSet FOLLOW_list_assig_in_for_music_stmt2163 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_for_music_stmt2165 = new BitSet(new long[]{0x1100820200000000L,0x0000000008408014L});
    public static final BitSet FOLLOW_expr_in_for_music_stmt2169 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_for_music_stmt2171 = new BitSet(new long[]{0x00008A0000020000L});
    public static final BitSet FOLLOW_list_assig_in_for_music_stmt2174 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_for_music_stmt2176 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_for_music_stmt2179 = new BitSet(new long[]{0x2000BE0804022E20L,0x000000000A0B3001L});
    public static final BitSet FOLLOW_list_music_inst_in_for_music_stmt2182 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_for_music_stmt2184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assig_in_list_assig2213 = new BitSet(new long[]{0x0000000000000002L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_list_assig2216 = new BitSet(new long[]{0x00008A0000020000L});
    public static final BitSet FOLLOW_assig_in_list_assig2218 = new BitSet(new long[]{0x0000000000000002L,0x0000000020000000L});
    public static final BitSet FOLLOW_IF_in_if_stmt2256 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_if_stmt2259 = new BitSet(new long[]{0x1100820200000000L,0x0000000008408014L});
    public static final BitSet FOLLOW_expr_in_if_stmt2262 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_if_stmt2264 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_if_stmt2267 = new BitSet(new long[]{0x0000BE0804422A00L,0x0000000002097405L});
    public static final BitSet FOLLOW_listInst_in_if_stmt2270 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_if_stmt2272 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_elseif_stmt_in_if_stmt2275 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_else_stmt_in_if_stmt2278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_elseif_stmt2302 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IF_in_elseif_stmt2304 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_elseif_stmt2306 = new BitSet(new long[]{0x1100820200000000L,0x0000000008408014L});
    public static final BitSet FOLLOW_expr_in_elseif_stmt2308 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_elseif_stmt2310 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_elseif_stmt2312 = new BitSet(new long[]{0x0000BE0804422A00L,0x0000000002097405L});
    public static final BitSet FOLLOW_listInst_in_elseif_stmt2314 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_elseif_stmt2316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_else_stmt2351 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_else_stmt2354 = new BitSet(new long[]{0x0000BE0804422A00L,0x0000000002097405L});
    public static final BitSet FOLLOW_listInst_in_else_stmt2357 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_else_stmt2359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_if_music_stmt2385 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_if_music_stmt2388 = new BitSet(new long[]{0x1100820200000000L,0x0000000008408014L});
    public static final BitSet FOLLOW_expr_in_if_music_stmt2391 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_if_music_stmt2393 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_if_music_stmt2396 = new BitSet(new long[]{0x2000BE0804022E20L,0x000000000A0B3001L});
    public static final BitSet FOLLOW_list_music_inst_in_if_music_stmt2399 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_if_music_stmt2401 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_elseif_music_stmt_in_if_music_stmt2404 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_else_music_stmt_in_if_music_stmt2407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_elseif_music_stmt2437 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IF_in_elseif_music_stmt2439 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_elseif_music_stmt2441 = new BitSet(new long[]{0x1100820200000000L,0x0000000008408014L});
    public static final BitSet FOLLOW_expr_in_elseif_music_stmt2443 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_elseif_music_stmt2445 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_elseif_music_stmt2447 = new BitSet(new long[]{0x2000BE0804022E20L,0x000000000A0B3001L});
    public static final BitSet FOLLOW_list_music_inst_in_elseif_music_stmt2449 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_elseif_music_stmt2451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_else_music_stmt2492 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_else_music_stmt2495 = new BitSet(new long[]{0x2000BE0804022E20L,0x000000000A0B3001L});
    public static final BitSet FOLLOW_list_music_inst_in_else_music_stmt2498 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_else_music_stmt2500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SONG_in_song2535 = new BitSet(new long[]{0x0000820000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_id_rule_in_song2538 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_song2541 = new BitSet(new long[]{0x0000000000000200L,0x0000000000382000L});
    public static final BitSet FOLLOW_beat_in_song2545 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_song2547 = new BitSet(new long[]{0x0000000000000000L,0x0000000000382000L});
    public static final BitSet FOLLOW_speed_in_song2553 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_song2555 = new BitSet(new long[]{0x0000000000000000L,0x0000000000380000L});
    public static final BitSet FOLLOW_tone_in_song2561 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_song2563 = new BitSet(new long[]{0x0000000000000000L,0x0000000000300000L});
    public static final BitSet FOLLOW_transport_in_song2569 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_song2571 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_track_in_song2578 = new BitSet(new long[]{0x0000000000800000L,0x0000000400100000L});
    public static final BitSet FOLLOW_drums_track_in_song2582 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_song2585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRACK_in_track2615 = new BitSet(new long[]{0x0000820000400000L,0x000000000000C004L});
    public static final BitSet FOLLOW_id_rule_in_track2618 = new BitSet(new long[]{0x0000000000400000L,0x000000000000C004L});
    public static final BitSet FOLLOW_STRING_in_track2621 = new BitSet(new long[]{0x0000000000400000L,0x0000000000004004L});
    public static final BitSet FOLLOW_compas_aux_in_track2624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DRUMS_in_drums_track2647 = new BitSet(new long[]{0x0000000000400000L,0x0000000000004004L});
    public static final BitSet FOLLOW_compas_aux_in_drums_track2650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compas_list_in_compas_aux2674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_BAR_in_compas_list2704 = new BitSet(new long[]{0x2000BE0804422E20L,0x000000000A0B7005L});
    public static final BitSet FOLLOW_repetition_in_compas_list2709 = new BitSet(new long[]{0x2000BE0804422E20L,0x000000000A0B7005L});
    public static final BitSet FOLLOW_compasses_in_compas_list2713 = new BitSet(new long[]{0x2000BE0804422E20L,0x000000000A0B7005L});
    public static final BitSet FOLLOW_repetition_in_compas_list2717 = new BitSet(new long[]{0x2000BE0804422E20L,0x000000000A0B7005L});
    public static final BitSet FOLLOW_DOUBLE_BAR_in_compas_list2722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compas_in_compasses2749 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_BAR_in_compasses2752 = new BitSet(new long[]{0x2000BE0804022E20L,0x000000000A0B3001L});
    public static final BitSet FOLLOW_compas_in_compasses2755 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_NUM_in_repetition2782 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_LETTER_X_in_repetition2784 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_START_REPETITION_in_repetition2788 = new BitSet(new long[]{0x2000BE0804022E20L,0x000000000A0B3001L});
    public static final BitSet FOLLOW_compasses_in_repetition2790 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_END_REPETITION_in_repetition2792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_music_inst_in_compas2843 = new BitSet(new long[]{0x2000BE0804022E22L,0x000000000A0B3001L});
    public static final BitSet FOLLOW_TONE_in_tone2887 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_NUM_in_tone2890 = new BitSet(new long[]{0x0000000000000400L,0x0000000000020000L});
    public static final BitSet FOLLOW_set_in_tone2892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_drumsnotes_in_drumsnotes_group2919 = new BitSet(new long[]{0x0000000000000002L,0x0000000040040000L});
    public static final BitSet FOLLOW_94_in_drumsnotes_group2922 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_FIGURE_in_drumsnotes_group2924 = new BitSet(new long[]{0x0000000000200002L,0x0000000000040000L});
    public static final BitSet FOLLOW_DOT_in_drumsnotes_group2926 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_TIE_in_drumsnotes_group2931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notes_type_in_notes_group2972 = new BitSet(new long[]{0x0000000000000002L,0x0000000040040000L});
    public static final BitSet FOLLOW_94_in_notes_group2975 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_FIGURE_in_notes_group2977 = new BitSet(new long[]{0x0000000000200002L,0x0000000000040000L});
    public static final BitSet FOLLOW_DOT_in_notes_group2979 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_TIE_in_notes_group2984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_drumsnotes_in_drumsnotes_variable3026 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_drumsnotes_variable3029 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_FIGURE_in_drumsnotes_variable3031 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_DOT_in_drumsnotes_variable3033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notes_type_in_notes_variable3078 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_notes_variable3081 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_FIGURE_in_notes_variable3083 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_DOT_in_notes_variable3085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_chord_in_notes_type3128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notes_in_notes_type3132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHORD_in_chord3161 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_chord3164 = new BitSet(new long[]{0x2000000000000420L,0x0000000000020000L});
    public static final BitSet FOLLOW_note_in_chord3167 = new BitSet(new long[]{0x00C0000000040000L,0x0000000010000810L});
    public static final BitSet FOLLOW_92_in_chord3187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_notes3219 = new BitSet(new long[]{0x2000000000000420L,0x0000000000020000L});
    public static final BitSet FOLLOW_note_in_notes3222 = new BitSet(new long[]{0x2000000000000420L,0x0000000010020000L});
    public static final BitSet FOLLOW_92_in_notes3226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_note_in_notes3231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_drumsnotes3267 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_drums_in_drumsnotes3270 = new BitSet(new long[]{0x0000000004000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_drumsnotes3274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_drums_in_drumsnotes3279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DRUMS_NOTE_TYPE_in_drums3318 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_drums3321 = new BitSet(new long[]{0x1100820200000000L,0x0000000008408014L});
    public static final BitSet FOLLOW_num_expr_in_drums3324 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_drums3327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOTE_in_note3371 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_NUM_in_note3375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolterm_in_expr3404 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_expr3407 = new BitSet(new long[]{0x1100820200000000L,0x0000000008408014L});
    public static final BitSet FOLLOW_boolterm_in_expr3410 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_boolfact_in_boolterm3428 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_boolterm3431 = new BitSet(new long[]{0x1100820200000000L,0x0000000008408014L});
    public static final BitSet FOLLOW_boolfact_in_boolterm3434 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_num_expr_in_boolfact3456 = new BitSet(new long[]{0x0020418080000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_EQUAL_in_boolfact3460 = new BitSet(new long[]{0x1100820200000000L,0x0000000008408014L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_boolfact3465 = new BitSet(new long[]{0x1100820200000000L,0x0000000008408014L});
    public static final BitSet FOLLOW_LT_in_boolfact3470 = new BitSet(new long[]{0x1100820200000000L,0x0000000008408014L});
    public static final BitSet FOLLOW_LE_in_boolfact3475 = new BitSet(new long[]{0x1100820200000000L,0x0000000008408014L});
    public static final BitSet FOLLOW_GT_in_boolfact3480 = new BitSet(new long[]{0x1100820200000000L,0x0000000008408014L});
    public static final BitSet FOLLOW_GE_in_boolfact3485 = new BitSet(new long[]{0x1100820200000000L,0x0000000008408014L});
    public static final BitSet FOLLOW_num_expr_in_boolfact3489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_num_expr3511 = new BitSet(new long[]{0x0100000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_PLUS_in_num_expr3516 = new BitSet(new long[]{0x1100820200000000L,0x0000000008408014L});
    public static final BitSet FOLLOW_MINUS_in_num_expr3521 = new BitSet(new long[]{0x1100820200000000L,0x0000000008408014L});
    public static final BitSet FOLLOW_term_in_num_expr3525 = new BitSet(new long[]{0x0100000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_factor_in_term3547 = new BitSet(new long[]{0x0400000000280002L});
    public static final BitSet FOLLOW_DOT_in_term3552 = new BitSet(new long[]{0x1100820200000000L,0x0000000008408014L});
    public static final BitSet FOLLOW_DIV_in_term3557 = new BitSet(new long[]{0x1100820200000000L,0x0000000008408014L});
    public static final BitSet FOLLOW_MOD_in_term3562 = new BitSet(new long[]{0x1100820200000000L,0x0000000008408014L});
    public static final BitSet FOLLOW_factor_in_term3566 = new BitSet(new long[]{0x0400000000280002L});
    public static final BitSet FOLLOW_NOT_in_factor3583 = new BitSet(new long[]{0x0000820200000000L,0x0000000008408004L});
    public static final BitSet FOLLOW_PLUS_in_factor3588 = new BitSet(new long[]{0x0000820200000000L,0x0000000008408004L});
    public static final BitSet FOLLOW_MINUS_in_factor3593 = new BitSet(new long[]{0x0000820200000000L,0x0000000008408004L});
    public static final BitSet FOLLOW_atom_in_factor3598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_access_in_atom3614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUM_in_atom3622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_atom3630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_atom3638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_atom3649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_atom3655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_atom3672 = new BitSet(new long[]{0x1100820200000000L,0x0000000008408014L});
    public static final BitSet FOLLOW_expr_in_atom3675 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_atom3677 = new BitSet(new long[]{0x0000000000000002L});

}