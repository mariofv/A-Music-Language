// $ANTLR 3.4 src/parser/Music.g 2017-04-26 19:45:25

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ARMOR", "ASSIG", "ATTR_ACCESS", "BAR", "BEAT", "BEMOL", "BOOL", "BOOLEAN", "CHORD", "COMMENT", "COMPAS", "COMPAS_LIST", "DECR", "DIMINUTION", "DIV", "DIVIDE_ASSIG", "DOT", "DOUBLE_BAR", "DRUMS", "DRUMS_NOTE_TYPE", "DRUMS_TRACK", "ELSE", "ELSEIF", "END_REPETITION", "EQUAL", "ESC_SEQ", "FALSE", "FIGURE", "FOR", "FRAGMENT", "FUNCALL", "FUNCTION", "GE", "GT", "ID", "ID_", "IF", "INCR", "INSTRUMENT", "INT", "LE", "LETTER_X", "LIST_ARGUMENTS", "LIST_ASSIG", "LIST_FUNCTIONS", "LIST_INSTRUCTIONS", "LIST_MUSIC_INST", "LT", "MAJ7", "MINOR", "MINUS", "MINUS_ASSIG", "MOD", "MOD_ASSIG", "NOT", "NOTE", "NOTES", "NOTE_LIST", "NOTE_TYPE", "NOT_EQUAL", "NUM", "OR", "PLUS", "PLUS_ASSIG", "POST", "PRE", "PROD_ASSIG", "REPETITION", "RETURN", "SEVENTH", "SONG", "SPEED", "START_REPETITION", "STRING", "STRING_TYPE", "SUSTAIN", "TIE", "TONE", "TRACK", "TRANSPORT", "TRUE", "VAR_FUNCALL", "VOID", "WHILE", "WS", "'('", "')'", "','", "'.'", "':'", "';'", "'{'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__90=90;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
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
    public static final int ID_=40;
    public static final int IF=41;
    public static final int INCR=42;
    public static final int INSTRUMENT=43;
    public static final int INT=44;
    public static final int LE=45;
    public static final int LETTER_X=46;
    public static final int LIST_ARGUMENTS=47;
    public static final int LIST_ASSIG=48;
    public static final int LIST_FUNCTIONS=49;
    public static final int LIST_INSTRUCTIONS=50;
    public static final int LIST_MUSIC_INST=51;
    public static final int LT=52;
    public static final int MAJ7=53;
    public static final int MINOR=54;
    public static final int MINUS=55;
    public static final int MINUS_ASSIG=56;
    public static final int MOD=57;
    public static final int MOD_ASSIG=58;
    public static final int NOT=59;
    public static final int NOTE=60;
    public static final int NOTES=61;
    public static final int NOTE_LIST=62;
    public static final int NOTE_TYPE=63;
    public static final int NOT_EQUAL=64;
    public static final int NUM=65;
    public static final int OR=66;
    public static final int PLUS=67;
    public static final int PLUS_ASSIG=68;
    public static final int POST=69;
    public static final int PRE=70;
    public static final int PROD_ASSIG=71;
    public static final int REPETITION=72;
    public static final int RETURN=73;
    public static final int SEVENTH=74;
    public static final int SONG=75;
    public static final int SPEED=76;
    public static final int START_REPETITION=77;
    public static final int STRING=78;
    public static final int STRING_TYPE=79;
    public static final int SUSTAIN=80;
    public static final int TIE=81;
    public static final int TONE=82;
    public static final int TRACK=83;
    public static final int TRANSPORT=84;
    public static final int TRUE=85;
    public static final int VAR_FUNCALL=86;
    public static final int VOID=87;
    public static final int WHILE=88;
    public static final int WS=89;

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
    // src/parser/Music.g:41:1: prog : ( global_stmt )+ EOF -> ^( LIST_FUNCTIONS ( global_stmt )+ ) ;
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
            // src/parser/Music.g:41:10: ( ( global_stmt )+ EOF -> ^( LIST_FUNCTIONS ( global_stmt )+ ) )
            // src/parser/Music.g:41:14: ( global_stmt )+ EOF
            {
            // src/parser/Music.g:41:14: ( global_stmt )+
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
            	    // src/parser/Music.g:41:15: global_stmt
            	    {
            	    pushFollow(FOLLOW_global_stmt_in_prog193);
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


            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_prog197);  
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
            // 41:33: -> ^( LIST_FUNCTIONS ( global_stmt )+ )
            {
                // src/parser/Music.g:41:36: ^( LIST_FUNCTIONS ( global_stmt )+ )
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
    // src/parser/Music.g:44:1: global_stmt : ( function | frag | song );
    public final MusicParser.global_stmt_return global_stmt() throws RecognitionException {
        MusicParser.global_stmt_return retval = new MusicParser.global_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        MusicParser.function_return function3 =null;

        MusicParser.frag_return frag4 =null;

        MusicParser.song_return song5 =null;



        try {
            // src/parser/Music.g:44:13: ( function | frag | song )
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
                    // src/parser/Music.g:44:17: function
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_function_in_global_stmt229);
                    function3=function();

                    state._fsp--;

                    adaptor.addChild(root_0, function3.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:45:17: frag
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_frag_in_global_stmt247);
                    frag4=frag();

                    state._fsp--;

                    adaptor.addChild(root_0, frag4.getTree());

                    }
                    break;
                case 3 :
                    // src/parser/Music.g:46:17: song
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_song_in_global_stmt265);
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
    // src/parser/Music.g:49:1: var_funcall : id= id_rule '.' id2= id_rule '(' ( params )? ')' ';' -> ^( VAR_FUNCALL[$id.text] $id2 ( params )? ) ;
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
        RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
        RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
        RewriteRuleTokenStream stream_93=new RewriteRuleTokenStream(adaptor,"token 93");
        RewriteRuleTokenStream stream_95=new RewriteRuleTokenStream(adaptor,"token 95");
        RewriteRuleSubtreeStream stream_id_rule=new RewriteRuleSubtreeStream(adaptor,"rule id_rule");
        RewriteRuleSubtreeStream stream_params=new RewriteRuleSubtreeStream(adaptor,"rule params");
        try {
            // src/parser/Music.g:49:13: (id= id_rule '.' id2= id_rule '(' ( params )? ')' ';' -> ^( VAR_FUNCALL[$id.text] $id2 ( params )? ) )
            // src/parser/Music.g:49:17: id= id_rule '.' id2= id_rule '(' ( params )? ')' ';'
            {
            pushFollow(FOLLOW_id_rule_in_var_funcall290);
            id=id_rule();

            state._fsp--;

            stream_id_rule.add(id.getTree());

            char_literal6=(Token)match(input,93,FOLLOW_93_in_var_funcall292);  
            stream_93.add(char_literal6);


            pushFollow(FOLLOW_id_rule_in_var_funcall296);
            id2=id_rule();

            state._fsp--;

            stream_id_rule.add(id2.getTree());

            char_literal7=(Token)match(input,90,FOLLOW_90_in_var_funcall298);  
            stream_90.add(char_literal7);


            // src/parser/Music.g:49:48: ( params )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==ARMOR||LA3_0==BEMOL||LA3_0==CHORD||LA3_0==DRUMS||LA3_0==FALSE||LA3_0==ID_||LA3_0==LETTER_X||LA3_0==MINUS||(LA3_0 >= NOT && LA3_0 <= NOTE)||LA3_0==NUM||LA3_0==PLUS||LA3_0==STRING||LA3_0==SUSTAIN||LA3_0==TRUE||LA3_0==90) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // src/parser/Music.g:49:48: params
                    {
                    pushFollow(FOLLOW_params_in_var_funcall300);
                    params8=params();

                    state._fsp--;

                    stream_params.add(params8.getTree());

                    }
                    break;

            }


            char_literal9=(Token)match(input,91,FOLLOW_91_in_var_funcall303);  
            stream_91.add(char_literal9);


            char_literal10=(Token)match(input,95,FOLLOW_95_in_var_funcall305);  
            stream_95.add(char_literal10);


            // AST REWRITE
            // elements: params, id2
            // token labels: 
            // rule labels: id2, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_id2=new RewriteRuleSubtreeStream(adaptor,"rule id2",id2!=null?id2.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AmlTree)adaptor.nil();
            // 49:65: -> ^( VAR_FUNCALL[$id.text] $id2 ( params )? )
            {
                // src/parser/Music.g:49:69: ^( VAR_FUNCALL[$id.text] $id2 ( params )? )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(VAR_FUNCALL, (id!=null?input.toString(id.start,id.stop):null))
                , root_1);

                adaptor.addChild(root_1, stream_id2.nextTree());

                // src/parser/Music.g:49:98: ( params )?
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
    // src/parser/Music.g:52:1: var_access : (id1= id_rule ( '.' id2= id_rule ) -> ^( ATTR_ACCESS[$id1.text] $id2) | id_rule );
    public final MusicParser.var_access_return var_access() throws RecognitionException {
        MusicParser.var_access_return retval = new MusicParser.var_access_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal11=null;
        MusicParser.id_rule_return id1 =null;

        MusicParser.id_rule_return id2 =null;

        MusicParser.id_rule_return id_rule12 =null;


        AmlTree char_literal11_tree=null;
        RewriteRuleTokenStream stream_93=new RewriteRuleTokenStream(adaptor,"token 93");
        RewriteRuleSubtreeStream stream_id_rule=new RewriteRuleSubtreeStream(adaptor,"rule id_rule");
        try {
            // src/parser/Music.g:52:13: (id1= id_rule ( '.' id2= id_rule ) -> ^( ATTR_ACCESS[$id1.text] $id2) | id_rule )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==ID_) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==93) ) {
                    alt4=1;
                }
                else if ( (LA4_1==AND||LA4_1==ASSIG||LA4_1==DECR||(LA4_1 >= DIV && LA4_1 <= DOT)||LA4_1==EQUAL||(LA4_1 >= GE && LA4_1 <= GT)||LA4_1==INCR||LA4_1==LE||LA4_1==LT||(LA4_1 >= MINUS && LA4_1 <= MOD_ASSIG)||LA4_1==NOT_EQUAL||(LA4_1 >= OR && LA4_1 <= PLUS_ASSIG)||LA4_1==PROD_ASSIG||(LA4_1 >= 91 && LA4_1 <= 92)||LA4_1==95) ) {
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

                if ( (LA4_2==93) ) {
                    alt4=1;
                }
                else if ( (LA4_2==AND||LA4_2==ASSIG||LA4_2==DECR||(LA4_2 >= DIV && LA4_2 <= DOT)||LA4_2==EQUAL||(LA4_2 >= GE && LA4_2 <= GT)||LA4_2==INCR||LA4_2==LE||LA4_2==LT||(LA4_2 >= MINUS && LA4_2 <= MOD_ASSIG)||LA4_2==NOT_EQUAL||(LA4_2 >= OR && LA4_2 <= PLUS_ASSIG)||LA4_2==PROD_ASSIG||(LA4_2 >= 91 && LA4_2 <= 92)||LA4_2==95) ) {
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
                    // src/parser/Music.g:52:17: id1= id_rule ( '.' id2= id_rule )
                    {
                    pushFollow(FOLLOW_id_rule_in_var_access346);
                    id1=id_rule();

                    state._fsp--;

                    stream_id_rule.add(id1.getTree());

                    // src/parser/Music.g:52:29: ( '.' id2= id_rule )
                    // src/parser/Music.g:52:30: '.' id2= id_rule
                    {
                    char_literal11=(Token)match(input,93,FOLLOW_93_in_var_access349);  
                    stream_93.add(char_literal11);


                    pushFollow(FOLLOW_id_rule_in_var_access353);
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
                    // 52:47: -> ^( ATTR_ACCESS[$id1.text] $id2)
                    {
                        // src/parser/Music.g:52:50: ^( ATTR_ACCESS[$id1.text] $id2)
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
                    // src/parser/Music.g:53:17: id_rule
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_id_rule_in_var_access382);
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
    // src/parser/Music.g:56:1: id_rule : (id= ID_ |id= LETTER_X ) -> ^( ID[$id] ) ;
    public final MusicParser.id_rule_return id_rule() throws RecognitionException {
        MusicParser.id_rule_return retval = new MusicParser.id_rule_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token id=null;

        AmlTree id_tree=null;
        RewriteRuleTokenStream stream_LETTER_X=new RewriteRuleTokenStream(adaptor,"token LETTER_X");
        RewriteRuleTokenStream stream_ID_=new RewriteRuleTokenStream(adaptor,"token ID_");

        try {
            // src/parser/Music.g:56:13: ( (id= ID_ |id= LETTER_X ) -> ^( ID[$id] ) )
            // src/parser/Music.g:56:17: (id= ID_ |id= LETTER_X )
            {
            // src/parser/Music.g:56:17: (id= ID_ |id= LETTER_X )
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
                    // src/parser/Music.g:56:18: id= ID_
                    {
                    id=(Token)match(input,ID_,FOLLOW_ID__in_id_rule412);  
                    stream_ID_.add(id);


                    }
                    break;
                case 2 :
                    // src/parser/Music.g:56:29: id= LETTER_X
                    {
                    id=(Token)match(input,LETTER_X,FOLLOW_LETTER_X_in_id_rule420);  
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
            // 56:42: -> ^( ID[$id] )
            {
                // src/parser/Music.g:56:45: ^( ID[$id] )
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
    // src/parser/Music.g:59:1: function : type_void id= id_rule '(' list_arguments ')' '{' listInst '}' -> ^( FUNCTION[$id.text] type_void list_arguments listInst ) ;
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
        RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
        RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
        RewriteRuleTokenStream stream_96=new RewriteRuleTokenStream(adaptor,"token 96");
        RewriteRuleTokenStream stream_97=new RewriteRuleTokenStream(adaptor,"token 97");
        RewriteRuleSubtreeStream stream_id_rule=new RewriteRuleSubtreeStream(adaptor,"rule id_rule");
        RewriteRuleSubtreeStream stream_listInst=new RewriteRuleSubtreeStream(adaptor,"rule listInst");
        RewriteRuleSubtreeStream stream_type_void=new RewriteRuleSubtreeStream(adaptor,"rule type_void");
        RewriteRuleSubtreeStream stream_list_arguments=new RewriteRuleSubtreeStream(adaptor,"rule list_arguments");
        try {
            // src/parser/Music.g:59:13: ( type_void id= id_rule '(' list_arguments ')' '{' listInst '}' -> ^( FUNCTION[$id.text] type_void list_arguments listInst ) )
            // src/parser/Music.g:59:16: type_void id= id_rule '(' list_arguments ')' '{' listInst '}'
            {
            pushFollow(FOLLOW_type_void_in_function453);
            type_void13=type_void();

            state._fsp--;

            stream_type_void.add(type_void13.getTree());

            pushFollow(FOLLOW_id_rule_in_function457);
            id=id_rule();

            state._fsp--;

            stream_id_rule.add(id.getTree());

            char_literal14=(Token)match(input,90,FOLLOW_90_in_function459);  
            stream_90.add(char_literal14);


            pushFollow(FOLLOW_list_arguments_in_function461);
            list_arguments15=list_arguments();

            state._fsp--;

            stream_list_arguments.add(list_arguments15.getTree());

            char_literal16=(Token)match(input,91,FOLLOW_91_in_function463);  
            stream_91.add(char_literal16);


            char_literal17=(Token)match(input,96,FOLLOW_96_in_function465);  
            stream_96.add(char_literal17);


            pushFollow(FOLLOW_listInst_in_function467);
            listInst18=listInst();

            state._fsp--;

            stream_listInst.add(listInst18.getTree());

            char_literal19=(Token)match(input,97,FOLLOW_97_in_function469);  
            stream_97.add(char_literal19);


            // AST REWRITE
            // elements: type_void, list_arguments, listInst
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AmlTree)adaptor.nil();
            // 59:80: -> ^( FUNCTION[$id.text] type_void list_arguments listInst )
            {
                // src/parser/Music.g:59:85: ^( FUNCTION[$id.text] type_void list_arguments listInst )
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
    // src/parser/Music.g:62:1: funcall : id= id_rule '(' ( params )? ')' -> ^( FUNCALL[$id.text] ( params )? ) ;
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
        RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
        RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
        RewriteRuleSubtreeStream stream_id_rule=new RewriteRuleSubtreeStream(adaptor,"rule id_rule");
        RewriteRuleSubtreeStream stream_params=new RewriteRuleSubtreeStream(adaptor,"rule params");
        try {
            // src/parser/Music.g:62:13: (id= id_rule '(' ( params )? ')' -> ^( FUNCALL[$id.text] ( params )? ) )
            // src/parser/Music.g:62:17: id= id_rule '(' ( params )? ')'
            {
            pushFollow(FOLLOW_id_rule_in_funcall516);
            id=id_rule();

            state._fsp--;

            stream_id_rule.add(id.getTree());

            char_literal20=(Token)match(input,90,FOLLOW_90_in_funcall518);  
            stream_90.add(char_literal20);


            // src/parser/Music.g:62:32: ( params )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==ARMOR||LA6_0==BEMOL||LA6_0==CHORD||LA6_0==DRUMS||LA6_0==FALSE||LA6_0==ID_||LA6_0==LETTER_X||LA6_0==MINUS||(LA6_0 >= NOT && LA6_0 <= NOTE)||LA6_0==NUM||LA6_0==PLUS||LA6_0==STRING||LA6_0==SUSTAIN||LA6_0==TRUE||LA6_0==90) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // src/parser/Music.g:62:32: params
                    {
                    pushFollow(FOLLOW_params_in_funcall520);
                    params21=params();

                    state._fsp--;

                    stream_params.add(params21.getTree());

                    }
                    break;

            }


            char_literal22=(Token)match(input,91,FOLLOW_91_in_funcall523);  
            stream_91.add(char_literal22);


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
            // 62:44: -> ^( FUNCALL[$id.text] ( params )? )
            {
                // src/parser/Music.g:62:47: ^( FUNCALL[$id.text] ( params )? )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(FUNCALL, (id!=null?input.toString(id.start,id.stop):null))
                , root_1);

                // src/parser/Music.g:62:67: ( params )?
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
    // src/parser/Music.g:65:1: frag : FRAGMENT ^ id_rule '(' ! list_arguments ')' ! '{' ! list_music_inst '}' !;
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
            // src/parser/Music.g:65:9: ( FRAGMENT ^ id_rule '(' ! list_arguments ')' ! '{' ! list_music_inst '}' !)
            // src/parser/Music.g:65:11: FRAGMENT ^ id_rule '(' ! list_arguments ')' ! '{' ! list_music_inst '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            FRAGMENT23=(Token)match(input,FRAGMENT,FOLLOW_FRAGMENT_in_frag557); 
            FRAGMENT23_tree = 
            (AmlTree)adaptor.create(FRAGMENT23)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(FRAGMENT23_tree, root_0);


            pushFollow(FOLLOW_id_rule_in_frag560);
            id_rule24=id_rule();

            state._fsp--;

            adaptor.addChild(root_0, id_rule24.getTree());

            char_literal25=(Token)match(input,90,FOLLOW_90_in_frag562); 

            pushFollow(FOLLOW_list_arguments_in_frag565);
            list_arguments26=list_arguments();

            state._fsp--;

            adaptor.addChild(root_0, list_arguments26.getTree());

            char_literal27=(Token)match(input,91,FOLLOW_91_in_frag567); 

            char_literal28=(Token)match(input,96,FOLLOW_96_in_frag570); 

            pushFollow(FOLLOW_list_music_inst_in_frag573);
            list_music_inst29=list_music_inst();

            state._fsp--;

            adaptor.addChild(root_0, list_music_inst29.getTree());

            char_literal30=(Token)match(input,97,FOLLOW_97_in_frag575); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:68:1: list_arguments : ( argument ( ',' argument )* )? -> ^( LIST_ARGUMENTS ( argument )* ) ;
    public final MusicParser.list_arguments_return list_arguments() throws RecognitionException {
        MusicParser.list_arguments_return retval = new MusicParser.list_arguments_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal32=null;
        MusicParser.argument_return argument31 =null;

        MusicParser.argument_return argument33 =null;


        AmlTree char_literal32_tree=null;
        RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
        RewriteRuleSubtreeStream stream_argument=new RewriteRuleSubtreeStream(adaptor,"rule argument");
        try {
            // src/parser/Music.g:68:17: ( ( argument ( ',' argument )* )? -> ^( LIST_ARGUMENTS ( argument )* ) )
            // src/parser/Music.g:68:19: ( argument ( ',' argument )* )?
            {
            // src/parser/Music.g:68:19: ( argument ( ',' argument )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==BOOL||LA8_0==CHORD||LA8_0==DRUMS_NOTE_TYPE||LA8_0==INT||LA8_0==NOTE_TYPE||LA8_0==STRING_TYPE) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // src/parser/Music.g:68:20: argument ( ',' argument )*
                    {
                    pushFollow(FOLLOW_argument_in_list_arguments595);
                    argument31=argument();

                    state._fsp--;

                    stream_argument.add(argument31.getTree());

                    // src/parser/Music.g:68:29: ( ',' argument )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==92) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // src/parser/Music.g:68:30: ',' argument
                    	    {
                    	    char_literal32=(Token)match(input,92,FOLLOW_92_in_list_arguments598);  
                    	    stream_92.add(char_literal32);


                    	    pushFollow(FOLLOW_argument_in_list_arguments600);
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
            // 68:47: -> ^( LIST_ARGUMENTS ( argument )* )
            {
                // src/parser/Music.g:68:50: ^( LIST_ARGUMENTS ( argument )* )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(LIST_ARGUMENTS, "LIST_ARGUMENTS")
                , root_1);

                // src/parser/Music.g:68:67: ( argument )*
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
    // src/parser/Music.g:71:1: argument : type ^ id_rule ;
    public final MusicParser.argument_return argument() throws RecognitionException {
        MusicParser.argument_return retval = new MusicParser.argument_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        MusicParser.type_return type34 =null;

        MusicParser.id_rule_return id_rule35 =null;



        try {
            // src/parser/Music.g:71:11: ( type ^ id_rule )
            // src/parser/Music.g:71:15: type ^ id_rule
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_type_in_argument641);
            type34=type();

            state._fsp--;

            root_0 = (AmlTree)adaptor.becomeRoot(type34.getTree(), root_0);

            pushFollow(FOLLOW_id_rule_in_argument644);
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
    // src/parser/Music.g:74:1: params : ( expr | notes_variable ) ( ',' ! ( expr | notes_variable ) )* ;
    public final MusicParser.params_return params() throws RecognitionException {
        MusicParser.params_return retval = new MusicParser.params_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal38=null;
        MusicParser.expr_return expr36 =null;

        MusicParser.notes_variable_return notes_variable37 =null;

        MusicParser.expr_return expr39 =null;

        MusicParser.notes_variable_return notes_variable40 =null;


        AmlTree char_literal38_tree=null;

        try {
            // src/parser/Music.g:74:13: ( ( expr | notes_variable ) ( ',' ! ( expr | notes_variable ) )* )
            // src/parser/Music.g:74:17: ( expr | notes_variable ) ( ',' ! ( expr | notes_variable ) )*
            {
            root_0 = (AmlTree)adaptor.nil();


            // src/parser/Music.g:74:17: ( expr | notes_variable )
            int alt9=2;
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
            case 90:
                {
                int LA9_2 = input.LA(2);

                if ( (LA9_2==FALSE||LA9_2==ID_||LA9_2==LETTER_X||LA9_2==MINUS||LA9_2==NOT||LA9_2==NUM||LA9_2==PLUS||LA9_2==STRING||LA9_2==TRUE||LA9_2==90) ) {
                    alt9=1;
                }
                else if ( (LA9_2==ARMOR||LA9_2==BEMOL||LA9_2==NOTE||LA9_2==SUSTAIN) ) {
                    alt9=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 2, input);

                    throw nvae;

                }
                }
                break;
            case ARMOR:
            case BEMOL:
            case CHORD:
            case DRUMS:
            case NOTE:
            case SUSTAIN:
                {
                alt9=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }

            switch (alt9) {
                case 1 :
                    // src/parser/Music.g:74:18: expr
                    {
                    pushFollow(FOLLOW_expr_in_params671);
                    expr36=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr36.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:74:25: notes_variable
                    {
                    pushFollow(FOLLOW_notes_variable_in_params675);
                    notes_variable37=notes_variable();

                    state._fsp--;

                    adaptor.addChild(root_0, notes_variable37.getTree());

                    }
                    break;

            }


            // src/parser/Music.g:74:41: ( ',' ! ( expr | notes_variable ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==92) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // src/parser/Music.g:74:42: ',' ! ( expr | notes_variable )
            	    {
            	    char_literal38=(Token)match(input,92,FOLLOW_92_in_params679); 

            	    // src/parser/Music.g:74:47: ( expr | notes_variable )
            	    int alt10=2;
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
            	    case 90:
            	        {
            	        int LA10_2 = input.LA(2);

            	        if ( (LA10_2==FALSE||LA10_2==ID_||LA10_2==LETTER_X||LA10_2==MINUS||LA10_2==NOT||LA10_2==NUM||LA10_2==PLUS||LA10_2==STRING||LA10_2==TRUE||LA10_2==90) ) {
            	            alt10=1;
            	        }
            	        else if ( (LA10_2==ARMOR||LA10_2==BEMOL||LA10_2==NOTE||LA10_2==SUSTAIN) ) {
            	            alt10=2;
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 10, 2, input);

            	            throw nvae;

            	        }
            	        }
            	        break;
            	    case ARMOR:
            	    case BEMOL:
            	    case CHORD:
            	    case DRUMS:
            	    case NOTE:
            	    case SUSTAIN:
            	        {
            	        alt10=2;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 10, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt10) {
            	        case 1 :
            	            // src/parser/Music.g:74:48: expr
            	            {
            	            pushFollow(FOLLOW_expr_in_params683);
            	            expr39=expr();

            	            state._fsp--;

            	            adaptor.addChild(root_0, expr39.getTree());

            	            }
            	            break;
            	        case 2 :
            	            // src/parser/Music.g:74:55: notes_variable
            	            {
            	            pushFollow(FOLLOW_notes_variable_in_params687);
            	            notes_variable40=notes_variable();

            	            state._fsp--;

            	            adaptor.addChild(root_0, notes_variable40.getTree());

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
    // src/parser/Music.g:77:1: listInst : ( inst )+ -> ^( LIST_INSTRUCTIONS ( inst )+ ) ;
    public final MusicParser.listInst_return listInst() throws RecognitionException {
        MusicParser.listInst_return retval = new MusicParser.listInst_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        MusicParser.inst_return inst41 =null;


        RewriteRuleSubtreeStream stream_inst=new RewriteRuleSubtreeStream(adaptor,"rule inst");
        try {
            // src/parser/Music.g:77:13: ( ( inst )+ -> ^( LIST_INSTRUCTIONS ( inst )+ ) )
            // src/parser/Music.g:77:16: ( inst )+
            {
            // src/parser/Music.g:77:16: ( inst )+
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
            	    // src/parser/Music.g:77:16: inst
            	    {
            	    pushFollow(FOLLOW_inst_in_listInst715);
            	    inst41=inst();

            	    state._fsp--;

            	    stream_inst.add(inst41.getTree());

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
            // 77:23: -> ^( LIST_INSTRUCTIONS ( inst )+ )
            {
                // src/parser/Music.g:77:26: ^( LIST_INSTRUCTIONS ( inst )+ )
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
    // src/parser/Music.g:80:1: list_music_inst : ( music_inst )+ -> ^( LIST_MUSIC_INST ( music_inst )+ ) ;
    public final MusicParser.list_music_inst_return list_music_inst() throws RecognitionException {
        MusicParser.list_music_inst_return retval = new MusicParser.list_music_inst_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        MusicParser.music_inst_return music_inst42 =null;


        RewriteRuleSubtreeStream stream_music_inst=new RewriteRuleSubtreeStream(adaptor,"rule music_inst");
        try {
            // src/parser/Music.g:80:17: ( ( music_inst )+ -> ^( LIST_MUSIC_INST ( music_inst )+ ) )
            // src/parser/Music.g:80:21: ( music_inst )+
            {
            // src/parser/Music.g:80:21: ( music_inst )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==ARMOR||(LA13_0 >= BEAT && LA13_0 <= BOOL)||LA13_0==CHORD||LA13_0==DECR||(LA13_0 >= DRUMS && LA13_0 <= DRUMS_NOTE_TYPE)||LA13_0==FOR||(LA13_0 >= ID_ && LA13_0 <= INT)||LA13_0==LETTER_X||LA13_0==NOTE||LA13_0==NOTE_TYPE||(LA13_0 >= SONG && LA13_0 <= SPEED)||(LA13_0 >= STRING_TYPE && LA13_0 <= SUSTAIN)||LA13_0==TONE||LA13_0==WHILE||LA13_0==90) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // src/parser/Music.g:80:21: music_inst
            	    {
            	    pushFollow(FOLLOW_music_inst_in_list_music_inst749);
            	    music_inst42=music_inst();

            	    state._fsp--;

            	    stream_music_inst.add(music_inst42.getTree());

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
            // 80:33: -> ^( LIST_MUSIC_INST ( music_inst )+ )
            {
                // src/parser/Music.g:80:36: ^( LIST_MUSIC_INST ( music_inst )+ )
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
    // src/parser/Music.g:83:1: inst : ( declaration | 'return' ^ ( expr | notes_group ) ';' !| var_funcall | tone ';' !| beat ';' !| speed ';' !| instrument ';' !| assignation | while_stmt | funcall ';' !| for_stmt | if_stmt | song | compas_list );
    public final MusicParser.inst_return inst() throws RecognitionException {
        MusicParser.inst_return retval = new MusicParser.inst_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token string_literal44=null;
        Token char_literal47=null;
        Token char_literal50=null;
        Token char_literal52=null;
        Token char_literal54=null;
        Token char_literal56=null;
        Token char_literal60=null;
        MusicParser.declaration_return declaration43 =null;

        MusicParser.expr_return expr45 =null;

        MusicParser.notes_group_return notes_group46 =null;

        MusicParser.var_funcall_return var_funcall48 =null;

        MusicParser.tone_return tone49 =null;

        MusicParser.beat_return beat51 =null;

        MusicParser.speed_return speed53 =null;

        MusicParser.instrument_return instrument55 =null;

        MusicParser.assignation_return assignation57 =null;

        MusicParser.while_stmt_return while_stmt58 =null;

        MusicParser.funcall_return funcall59 =null;

        MusicParser.for_stmt_return for_stmt61 =null;

        MusicParser.if_stmt_return if_stmt62 =null;

        MusicParser.song_return song63 =null;

        MusicParser.compas_list_return compas_list64 =null;


        AmlTree string_literal44_tree=null;
        AmlTree char_literal47_tree=null;
        AmlTree char_literal50_tree=null;
        AmlTree char_literal52_tree=null;
        AmlTree char_literal54_tree=null;
        AmlTree char_literal56_tree=null;
        AmlTree char_literal60_tree=null;

        try {
            // src/parser/Music.g:83:13: ( declaration | 'return' ^ ( expr | notes_group ) ';' !| var_funcall | tone ';' !| beat ';' !| speed ';' !| instrument ';' !| assignation | while_stmt | funcall ';' !| for_stmt | if_stmt | song | compas_list )
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
                case 93:
                    {
                    int LA15_15 = input.LA(3);

                    if ( (LA15_15==ID_) ) {
                        int LA15_17 = input.LA(4);

                        if ( (LA15_17==90) ) {
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

                        if ( (LA15_18==90) ) {
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
                case 90:
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
                case 93:
                    {
                    int LA15_15 = input.LA(3);

                    if ( (LA15_15==ID_) ) {
                        int LA15_17 = input.LA(4);

                        if ( (LA15_17==90) ) {
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

                        if ( (LA15_18==90) ) {
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
                case 90:
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
                    // src/parser/Music.g:83:17: declaration
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_declaration_in_inst793);
                    declaration43=declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, declaration43.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:84:17: 'return' ^ ( expr | notes_group ) ';' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    string_literal44=(Token)match(input,RETURN,FOLLOW_RETURN_in_inst811); 
                    string_literal44_tree = 
                    (AmlTree)adaptor.create(string_literal44)
                    ;
                    root_0 = (AmlTree)adaptor.becomeRoot(string_literal44_tree, root_0);


                    // src/parser/Music.g:84:27: ( expr | notes_group )
                    int alt14=2;
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
                    case 90:
                        {
                        int LA14_2 = input.LA(2);

                        if ( (LA14_2==FALSE||LA14_2==ID_||LA14_2==LETTER_X||LA14_2==MINUS||LA14_2==NOT||LA14_2==NUM||LA14_2==PLUS||LA14_2==STRING||LA14_2==TRUE||LA14_2==90) ) {
                            alt14=1;
                        }
                        else if ( (LA14_2==ARMOR||LA14_2==BEMOL||LA14_2==NOTE||LA14_2==SUSTAIN) ) {
                            alt14=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 14, 2, input);

                            throw nvae;

                        }
                        }
                        break;
                    case ARMOR:
                    case BEMOL:
                    case CHORD:
                    case DRUMS:
                    case NOTE:
                    case SUSTAIN:
                        {
                        alt14=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 0, input);

                        throw nvae;

                    }

                    switch (alt14) {
                        case 1 :
                            // src/parser/Music.g:84:28: expr
                            {
                            pushFollow(FOLLOW_expr_in_inst815);
                            expr45=expr();

                            state._fsp--;

                            adaptor.addChild(root_0, expr45.getTree());

                            }
                            break;
                        case 2 :
                            // src/parser/Music.g:84:35: notes_group
                            {
                            pushFollow(FOLLOW_notes_group_in_inst819);
                            notes_group46=notes_group();

                            state._fsp--;

                            adaptor.addChild(root_0, notes_group46.getTree());

                            }
                            break;

                    }


                    char_literal47=(Token)match(input,95,FOLLOW_95_in_inst822); 

                    }
                    break;
                case 3 :
                    // src/parser/Music.g:85:17: var_funcall
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_var_funcall_in_inst841);
                    var_funcall48=var_funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, var_funcall48.getTree());

                    }
                    break;
                case 4 :
                    // src/parser/Music.g:86:17: tone ';' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_tone_in_inst859);
                    tone49=tone();

                    state._fsp--;

                    adaptor.addChild(root_0, tone49.getTree());

                    char_literal50=(Token)match(input,95,FOLLOW_95_in_inst861); 

                    }
                    break;
                case 5 :
                    // src/parser/Music.g:87:17: beat ';' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_beat_in_inst880);
                    beat51=beat();

                    state._fsp--;

                    adaptor.addChild(root_0, beat51.getTree());

                    char_literal52=(Token)match(input,95,FOLLOW_95_in_inst882); 

                    }
                    break;
                case 6 :
                    // src/parser/Music.g:88:17: speed ';' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_speed_in_inst901);
                    speed53=speed();

                    state._fsp--;

                    adaptor.addChild(root_0, speed53.getTree());

                    char_literal54=(Token)match(input,95,FOLLOW_95_in_inst903); 

                    }
                    break;
                case 7 :
                    // src/parser/Music.g:89:17: instrument ';' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_instrument_in_inst922);
                    instrument55=instrument();

                    state._fsp--;

                    adaptor.addChild(root_0, instrument55.getTree());

                    char_literal56=(Token)match(input,95,FOLLOW_95_in_inst924); 

                    }
                    break;
                case 8 :
                    // src/parser/Music.g:90:17: assignation
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_assignation_in_inst943);
                    assignation57=assignation();

                    state._fsp--;

                    adaptor.addChild(root_0, assignation57.getTree());

                    }
                    break;
                case 9 :
                    // src/parser/Music.g:91:17: while_stmt
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_while_stmt_in_inst961);
                    while_stmt58=while_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, while_stmt58.getTree());

                    }
                    break;
                case 10 :
                    // src/parser/Music.g:92:17: funcall ';' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_inst979);
                    funcall59=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall59.getTree());

                    char_literal60=(Token)match(input,95,FOLLOW_95_in_inst981); 

                    }
                    break;
                case 11 :
                    // src/parser/Music.g:93:17: for_stmt
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_for_stmt_in_inst1000);
                    for_stmt61=for_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, for_stmt61.getTree());

                    }
                    break;
                case 12 :
                    // src/parser/Music.g:94:17: if_stmt
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_if_stmt_in_inst1018);
                    if_stmt62=if_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, if_stmt62.getTree());

                    }
                    break;
                case 13 :
                    // src/parser/Music.g:95:17: song
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_song_in_inst1036);
                    song63=song();

                    state._fsp--;

                    adaptor.addChild(root_0, song63.getTree());

                    }
                    break;
                case 14 :
                    // src/parser/Music.g:96:17: compas_list
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_compas_list_in_inst1054);
                    compas_list64=compas_list();

                    state._fsp--;

                    adaptor.addChild(root_0, compas_list64.getTree());

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
    // src/parser/Music.g:99:1: music_inst : ( declaration | tone ';' !| beat ';' !| speed ';' !| instrument ';' !| var_funcall | assignation | while_music_stmt | funcall ';' !| for_music_stmt | if_music_stmt | song | ( options {greedy=true; } : notes_group )+ ( ';' !)? );
    public final MusicParser.music_inst_return music_inst() throws RecognitionException {
        MusicParser.music_inst_return retval = new MusicParser.music_inst_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal67=null;
        Token char_literal69=null;
        Token char_literal71=null;
        Token char_literal73=null;
        Token char_literal78=null;
        Token char_literal83=null;
        MusicParser.declaration_return declaration65 =null;

        MusicParser.tone_return tone66 =null;

        MusicParser.beat_return beat68 =null;

        MusicParser.speed_return speed70 =null;

        MusicParser.instrument_return instrument72 =null;

        MusicParser.var_funcall_return var_funcall74 =null;

        MusicParser.assignation_return assignation75 =null;

        MusicParser.while_music_stmt_return while_music_stmt76 =null;

        MusicParser.funcall_return funcall77 =null;

        MusicParser.for_music_stmt_return for_music_stmt79 =null;

        MusicParser.if_music_stmt_return if_music_stmt80 =null;

        MusicParser.song_return song81 =null;

        MusicParser.notes_group_return notes_group82 =null;


        AmlTree char_literal67_tree=null;
        AmlTree char_literal69_tree=null;
        AmlTree char_literal71_tree=null;
        AmlTree char_literal73_tree=null;
        AmlTree char_literal78_tree=null;
        AmlTree char_literal83_tree=null;

        try {
            // src/parser/Music.g:99:13: ( declaration | tone ';' !| beat ';' !| speed ';' !| instrument ';' !| var_funcall | assignation | while_music_stmt | funcall ';' !| for_music_stmt | if_music_stmt | song | ( options {greedy=true; } : notes_group )+ ( ';' !)? )
            int alt18=13;
            switch ( input.LA(1) ) {
            case CHORD:
                {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==90) ) {
                    alt18=13;
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
            case TONE:
                {
                alt18=2;
                }
                break;
            case BEAT:
                {
                alt18=3;
                }
                break;
            case SPEED:
                {
                alt18=4;
                }
                break;
            case INSTRUMENT:
                {
                alt18=5;
                }
                break;
            case ID_:
                {
                switch ( input.LA(2) ) {
                case 93:
                    {
                    int LA18_15 = input.LA(3);

                    if ( (LA18_15==ID_) ) {
                        int LA18_17 = input.LA(4);

                        if ( (LA18_17==90) ) {
                            alt18=6;
                        }
                        else if ( (LA18_17==ASSIG||LA18_17==DECR||LA18_17==DIVIDE_ASSIG||LA18_17==INCR||LA18_17==MINUS_ASSIG||LA18_17==MOD_ASSIG||LA18_17==PLUS_ASSIG||LA18_17==PROD_ASSIG) ) {
                            alt18=7;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 18, 17, input);

                            throw nvae;

                        }
                    }
                    else if ( (LA18_15==LETTER_X) ) {
                        int LA18_18 = input.LA(4);

                        if ( (LA18_18==90) ) {
                            alt18=6;
                        }
                        else if ( (LA18_18==ASSIG||LA18_18==DECR||LA18_18==DIVIDE_ASSIG||LA18_18==INCR||LA18_18==MINUS_ASSIG||LA18_18==MOD_ASSIG||LA18_18==PLUS_ASSIG||LA18_18==PROD_ASSIG) ) {
                            alt18=7;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 18, 18, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 15, input);

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
                    alt18=7;
                    }
                    break;
                case 90:
                    {
                    alt18=9;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 6, input);

                    throw nvae;

                }

                }
                break;
            case LETTER_X:
                {
                switch ( input.LA(2) ) {
                case 93:
                    {
                    int LA18_15 = input.LA(3);

                    if ( (LA18_15==ID_) ) {
                        int LA18_17 = input.LA(4);

                        if ( (LA18_17==90) ) {
                            alt18=6;
                        }
                        else if ( (LA18_17==ASSIG||LA18_17==DECR||LA18_17==DIVIDE_ASSIG||LA18_17==INCR||LA18_17==MINUS_ASSIG||LA18_17==MOD_ASSIG||LA18_17==PLUS_ASSIG||LA18_17==PROD_ASSIG) ) {
                            alt18=7;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 18, 17, input);

                            throw nvae;

                        }
                    }
                    else if ( (LA18_15==LETTER_X) ) {
                        int LA18_18 = input.LA(4);

                        if ( (LA18_18==90) ) {
                            alt18=6;
                        }
                        else if ( (LA18_18==ASSIG||LA18_18==DECR||LA18_18==DIVIDE_ASSIG||LA18_18==INCR||LA18_18==MINUS_ASSIG||LA18_18==MOD_ASSIG||LA18_18==PLUS_ASSIG||LA18_18==PROD_ASSIG) ) {
                            alt18=7;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 18, 18, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 15, input);

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
                    alt18=7;
                    }
                    break;
                case 90:
                    {
                    alt18=9;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 7, input);

                    throw nvae;

                }

                }
                break;
            case DECR:
            case INCR:
                {
                alt18=7;
                }
                break;
            case WHILE:
                {
                alt18=8;
                }
                break;
            case FOR:
                {
                alt18=10;
                }
                break;
            case IF:
                {
                alt18=11;
                }
                break;
            case SONG:
                {
                alt18=12;
                }
                break;
            case BOOL:
            case DRUMS_NOTE_TYPE:
            case INT:
            case NOTE_TYPE:
            case STRING_TYPE:
                {
                alt18=1;
                }
                break;
            case ARMOR:
            case BEMOL:
            case DRUMS:
            case NOTE:
            case SUSTAIN:
            case 90:
                {
                alt18=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }

            switch (alt18) {
                case 1 :
                    // src/parser/Music.g:99:17: declaration
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_declaration_in_music_inst1078);
                    declaration65=declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, declaration65.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:100:17: tone ';' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_tone_in_music_inst1096);
                    tone66=tone();

                    state._fsp--;

                    adaptor.addChild(root_0, tone66.getTree());

                    char_literal67=(Token)match(input,95,FOLLOW_95_in_music_inst1098); 

                    }
                    break;
                case 3 :
                    // src/parser/Music.g:101:17: beat ';' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_beat_in_music_inst1117);
                    beat68=beat();

                    state._fsp--;

                    adaptor.addChild(root_0, beat68.getTree());

                    char_literal69=(Token)match(input,95,FOLLOW_95_in_music_inst1119); 

                    }
                    break;
                case 4 :
                    // src/parser/Music.g:102:17: speed ';' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_speed_in_music_inst1138);
                    speed70=speed();

                    state._fsp--;

                    adaptor.addChild(root_0, speed70.getTree());

                    char_literal71=(Token)match(input,95,FOLLOW_95_in_music_inst1140); 

                    }
                    break;
                case 5 :
                    // src/parser/Music.g:103:17: instrument ';' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_instrument_in_music_inst1159);
                    instrument72=instrument();

                    state._fsp--;

                    adaptor.addChild(root_0, instrument72.getTree());

                    char_literal73=(Token)match(input,95,FOLLOW_95_in_music_inst1161); 

                    }
                    break;
                case 6 :
                    // src/parser/Music.g:104:17: var_funcall
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_var_funcall_in_music_inst1180);
                    var_funcall74=var_funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, var_funcall74.getTree());

                    }
                    break;
                case 7 :
                    // src/parser/Music.g:105:17: assignation
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_assignation_in_music_inst1198);
                    assignation75=assignation();

                    state._fsp--;

                    adaptor.addChild(root_0, assignation75.getTree());

                    }
                    break;
                case 8 :
                    // src/parser/Music.g:106:17: while_music_stmt
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_while_music_stmt_in_music_inst1216);
                    while_music_stmt76=while_music_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, while_music_stmt76.getTree());

                    }
                    break;
                case 9 :
                    // src/parser/Music.g:107:17: funcall ';' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_music_inst1234);
                    funcall77=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall77.getTree());

                    char_literal78=(Token)match(input,95,FOLLOW_95_in_music_inst1236); 

                    }
                    break;
                case 10 :
                    // src/parser/Music.g:108:17: for_music_stmt
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_for_music_stmt_in_music_inst1255);
                    for_music_stmt79=for_music_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, for_music_stmt79.getTree());

                    }
                    break;
                case 11 :
                    // src/parser/Music.g:109:17: if_music_stmt
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_if_music_stmt_in_music_inst1273);
                    if_music_stmt80=if_music_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, if_music_stmt80.getTree());

                    }
                    break;
                case 12 :
                    // src/parser/Music.g:110:17: song
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_song_in_music_inst1291);
                    song81=song();

                    state._fsp--;

                    adaptor.addChild(root_0, song81.getTree());

                    }
                    break;
                case 13 :
                    // src/parser/Music.g:111:16: ( options {greedy=true; } : notes_group )+ ( ';' !)?
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    // src/parser/Music.g:111:16: ( options {greedy=true; } : notes_group )+
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
                        case 90:
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
                        case DRUMS:
                            {
                            alt16=1;
                            }
                            break;

                        }

                        switch (alt16) {
                    	case 1 :
                    	    // src/parser/Music.g:111:42: notes_group
                    	    {
                    	    pushFollow(FOLLOW_notes_group_in_music_inst1318);
                    	    notes_group82=notes_group();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, notes_group82.getTree());

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


                    // src/parser/Music.g:111:59: ( ';' !)?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==95) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // src/parser/Music.g:111:59: ';' !
                            {
                            char_literal83=(Token)match(input,95,FOLLOW_95_in_music_inst1322); 

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
    // src/parser/Music.g:114:1: declaration : type ^ assig_opt ( ',' ! assig_opt )* ';' !;
    public final MusicParser.declaration_return declaration() throws RecognitionException {
        MusicParser.declaration_return retval = new MusicParser.declaration_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal86=null;
        Token char_literal88=null;
        MusicParser.type_return type84 =null;

        MusicParser.assig_opt_return assig_opt85 =null;

        MusicParser.assig_opt_return assig_opt87 =null;


        AmlTree char_literal86_tree=null;
        AmlTree char_literal88_tree=null;

        try {
            // src/parser/Music.g:114:13: ( type ^ assig_opt ( ',' ! assig_opt )* ';' !)
            // src/parser/Music.g:114:17: type ^ assig_opt ( ',' ! assig_opt )* ';' !
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_type_in_declaration1347);
            type84=type();

            state._fsp--;

            root_0 = (AmlTree)adaptor.becomeRoot(type84.getTree(), root_0);

            pushFollow(FOLLOW_assig_opt_in_declaration1350);
            assig_opt85=assig_opt();

            state._fsp--;

            adaptor.addChild(root_0, assig_opt85.getTree());

            // src/parser/Music.g:114:33: ( ',' ! assig_opt )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==92) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // src/parser/Music.g:114:34: ',' ! assig_opt
            	    {
            	    char_literal86=(Token)match(input,92,FOLLOW_92_in_declaration1353); 

            	    pushFollow(FOLLOW_assig_opt_in_declaration1356);
            	    assig_opt87=assig_opt();

            	    state._fsp--;

            	    adaptor.addChild(root_0, assig_opt87.getTree());

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            char_literal88=(Token)match(input,95,FOLLOW_95_in_declaration1360); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:117:1: type : ( INT | BOOL | NOTE_TYPE | DRUMS_NOTE_TYPE | CHORD | STRING_TYPE );
    public final MusicParser.type_return type() throws RecognitionException {
        MusicParser.type_return retval = new MusicParser.type_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token set89=null;

        AmlTree set89_tree=null;

        try {
            // src/parser/Music.g:117:13: ( INT | BOOL | NOTE_TYPE | DRUMS_NOTE_TYPE | CHORD | STRING_TYPE )
            // src/parser/Music.g:
            {
            root_0 = (AmlTree)adaptor.nil();


            set89=(Token)input.LT(1);

            if ( input.LA(1)==BOOL||input.LA(1)==CHORD||input.LA(1)==DRUMS_NOTE_TYPE||input.LA(1)==INT||input.LA(1)==NOTE_TYPE||input.LA(1)==STRING_TYPE ) {
                input.consume();
                adaptor.addChild(root_0, 
                (AmlTree)adaptor.create(set89)
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
    // src/parser/Music.g:125:1: type_void : ( type | VOID );
    public final MusicParser.type_void_return type_void() throws RecognitionException {
        MusicParser.type_void_return retval = new MusicParser.type_void_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token VOID91=null;
        MusicParser.type_return type90 =null;


        AmlTree VOID91_tree=null;

        try {
            // src/parser/Music.g:125:13: ( type | VOID )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==BOOL||LA20_0==CHORD||LA20_0==DRUMS_NOTE_TYPE||LA20_0==INT||LA20_0==NOTE_TYPE||LA20_0==STRING_TYPE) ) {
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
                    // src/parser/Music.g:125:17: type
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_type_in_type_void1506);
                    type90=type();

                    state._fsp--;

                    adaptor.addChild(root_0, type90.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:126:17: VOID
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    VOID91=(Token)match(input,VOID,FOLLOW_VOID_in_type_void1524); 
                    VOID91_tree = 
                    (AmlTree)adaptor.create(VOID91)
                    ;
                    adaptor.addChild(root_0, VOID91_tree);


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
    // src/parser/Music.g:129:1: assig_opt : id_rule ( ASSIG ^ ( expr | notes_variable ) )? ;
    public final MusicParser.assig_opt_return assig_opt() throws RecognitionException {
        MusicParser.assig_opt_return retval = new MusicParser.assig_opt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token ASSIG93=null;
        MusicParser.id_rule_return id_rule92 =null;

        MusicParser.expr_return expr94 =null;

        MusicParser.notes_variable_return notes_variable95 =null;


        AmlTree ASSIG93_tree=null;

        try {
            // src/parser/Music.g:129:13: ( id_rule ( ASSIG ^ ( expr | notes_variable ) )? )
            // src/parser/Music.g:129:17: id_rule ( ASSIG ^ ( expr | notes_variable ) )?
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_id_rule_in_assig_opt1549);
            id_rule92=id_rule();

            state._fsp--;

            adaptor.addChild(root_0, id_rule92.getTree());

            // src/parser/Music.g:129:25: ( ASSIG ^ ( expr | notes_variable ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==ASSIG) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // src/parser/Music.g:129:26: ASSIG ^ ( expr | notes_variable )
                    {
                    ASSIG93=(Token)match(input,ASSIG,FOLLOW_ASSIG_in_assig_opt1552); 
                    ASSIG93_tree = 
                    (AmlTree)adaptor.create(ASSIG93)
                    ;
                    root_0 = (AmlTree)adaptor.becomeRoot(ASSIG93_tree, root_0);


                    // src/parser/Music.g:129:33: ( expr | notes_variable )
                    int alt21=2;
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
                        alt21=1;
                        }
                        break;
                    case 90:
                        {
                        int LA21_2 = input.LA(2);

                        if ( (LA21_2==FALSE||LA21_2==ID_||LA21_2==LETTER_X||LA21_2==MINUS||LA21_2==NOT||LA21_2==NUM||LA21_2==PLUS||LA21_2==STRING||LA21_2==TRUE||LA21_2==90) ) {
                            alt21=1;
                        }
                        else if ( (LA21_2==ARMOR||LA21_2==BEMOL||LA21_2==NOTE||LA21_2==SUSTAIN) ) {
                            alt21=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 21, 2, input);

                            throw nvae;

                        }
                        }
                        break;
                    case ARMOR:
                    case BEMOL:
                    case CHORD:
                    case DRUMS:
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
                            // src/parser/Music.g:129:34: expr
                            {
                            pushFollow(FOLLOW_expr_in_assig_opt1556);
                            expr94=expr();

                            state._fsp--;

                            adaptor.addChild(root_0, expr94.getTree());

                            }
                            break;
                        case 2 :
                            // src/parser/Music.g:129:41: notes_variable
                            {
                            pushFollow(FOLLOW_notes_variable_in_assig_opt1560);
                            notes_variable95=notes_variable();

                            state._fsp--;

                            adaptor.addChild(root_0, notes_variable95.getTree());

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
    // src/parser/Music.g:132:1: assignation : assig ';' !;
    public final MusicParser.assignation_return assignation() throws RecognitionException {
        MusicParser.assignation_return retval = new MusicParser.assignation_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal97=null;
        MusicParser.assig_return assig96 =null;


        AmlTree char_literal97_tree=null;

        try {
            // src/parser/Music.g:132:13: ( assig ';' !)
            // src/parser/Music.g:132:17: assig ';' !
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_assig_in_assignation1586);
            assig96=assig();

            state._fsp--;

            adaptor.addChild(root_0, assig96.getTree());

            char_literal97=(Token)match(input,95,FOLLOW_95_in_assignation1588); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:135:1: assig : ( var_access ( ASSIG | PLUS_ASSIG | MINUS_ASSIG | PROD_ASSIG | DIVIDE_ASSIG | MOD_ASSIG ) ^ ( expr | notes_variable | FIGURE ) | post | pre );
    public final MusicParser.assig_return assig() throws RecognitionException {
        MusicParser.assig_return retval = new MusicParser.assig_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token set99=null;
        Token FIGURE102=null;
        MusicParser.var_access_return var_access98 =null;

        MusicParser.expr_return expr100 =null;

        MusicParser.notes_variable_return notes_variable101 =null;

        MusicParser.post_return post103 =null;

        MusicParser.pre_return pre104 =null;


        AmlTree set99_tree=null;
        AmlTree FIGURE102_tree=null;

        try {
            // src/parser/Music.g:135:13: ( var_access ( ASSIG | PLUS_ASSIG | MINUS_ASSIG | PROD_ASSIG | DIVIDE_ASSIG | MOD_ASSIG ) ^ ( expr | notes_variable | FIGURE ) | post | pre )
            int alt24=3;
            switch ( input.LA(1) ) {
            case ID_:
                {
                switch ( input.LA(2) ) {
                case 93:
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
                case 93:
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
                    // src/parser/Music.g:135:17: var_access ( ASSIG | PLUS_ASSIG | MINUS_ASSIG | PROD_ASSIG | DIVIDE_ASSIG | MOD_ASSIG ) ^ ( expr | notes_variable | FIGURE )
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_var_access_in_assig1618);
                    var_access98=var_access();

                    state._fsp--;

                    adaptor.addChild(root_0, var_access98.getTree());

                    set99=(Token)input.LT(1);

                    set99=(Token)input.LT(1);

                    if ( input.LA(1)==ASSIG||input.LA(1)==DIVIDE_ASSIG||input.LA(1)==MINUS_ASSIG||input.LA(1)==MOD_ASSIG||input.LA(1)==PLUS_ASSIG||input.LA(1)==PROD_ASSIG ) {
                        input.consume();
                        root_0 = (AmlTree)adaptor.becomeRoot(
                        (AmlTree)adaptor.create(set99)
                        , root_0);
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    // src/parser/Music.g:135:94: ( expr | notes_variable | FIGURE )
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
                    case 90:
                        {
                        int LA23_2 = input.LA(2);

                        if ( (LA23_2==FALSE||LA23_2==ID_||LA23_2==LETTER_X||LA23_2==MINUS||LA23_2==NOT||LA23_2==NUM||LA23_2==PLUS||LA23_2==STRING||LA23_2==TRUE||LA23_2==90) ) {
                            alt23=1;
                        }
                        else if ( (LA23_2==ARMOR||LA23_2==BEMOL||LA23_2==NOTE||LA23_2==SUSTAIN) ) {
                            alt23=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 23, 2, input);

                            throw nvae;

                        }
                        }
                        break;
                    case ARMOR:
                    case BEMOL:
                    case CHORD:
                    case DRUMS:
                    case NOTE:
                    case SUSTAIN:
                        {
                        alt23=2;
                        }
                        break;
                    case FIGURE:
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
                            // src/parser/Music.g:135:95: expr
                            {
                            pushFollow(FOLLOW_expr_in_assig1636);
                            expr100=expr();

                            state._fsp--;

                            adaptor.addChild(root_0, expr100.getTree());

                            }
                            break;
                        case 2 :
                            // src/parser/Music.g:135:102: notes_variable
                            {
                            pushFollow(FOLLOW_notes_variable_in_assig1640);
                            notes_variable101=notes_variable();

                            state._fsp--;

                            adaptor.addChild(root_0, notes_variable101.getTree());

                            }
                            break;
                        case 3 :
                            // src/parser/Music.g:135:119: FIGURE
                            {
                            FIGURE102=(Token)match(input,FIGURE,FOLLOW_FIGURE_in_assig1644); 
                            FIGURE102_tree = 
                            (AmlTree)adaptor.create(FIGURE102)
                            ;
                            adaptor.addChild(root_0, FIGURE102_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // src/parser/Music.g:136:17: post
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_post_in_assig1663);
                    post103=post();

                    state._fsp--;

                    adaptor.addChild(root_0, post103.getTree());

                    }
                    break;
                case 3 :
                    // src/parser/Music.g:137:17: pre
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_pre_in_assig1681);
                    pre104=pre();

                    state._fsp--;

                    adaptor.addChild(root_0, pre104.getTree());

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
    // src/parser/Music.g:140:1: post : var_access (x= INCR |x= DECR ) -> ^( POST var_access $x) ;
    public final MusicParser.post_return post() throws RecognitionException {
        MusicParser.post_return retval = new MusicParser.post_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token x=null;
        MusicParser.var_access_return var_access105 =null;


        AmlTree x_tree=null;
        RewriteRuleTokenStream stream_INCR=new RewriteRuleTokenStream(adaptor,"token INCR");
        RewriteRuleTokenStream stream_DECR=new RewriteRuleTokenStream(adaptor,"token DECR");
        RewriteRuleSubtreeStream stream_var_access=new RewriteRuleSubtreeStream(adaptor,"rule var_access");
        try {
            // src/parser/Music.g:140:13: ( var_access (x= INCR |x= DECR ) -> ^( POST var_access $x) )
            // src/parser/Music.g:140:17: var_access (x= INCR |x= DECR )
            {
            pushFollow(FOLLOW_var_access_in_post1711);
            var_access105=var_access();

            state._fsp--;

            stream_var_access.add(var_access105.getTree());

            // src/parser/Music.g:140:28: (x= INCR |x= DECR )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==INCR) ) {
                alt25=1;
            }
            else if ( (LA25_0==DECR) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;

            }
            switch (alt25) {
                case 1 :
                    // src/parser/Music.g:140:29: x= INCR
                    {
                    x=(Token)match(input,INCR,FOLLOW_INCR_in_post1716);  
                    stream_INCR.add(x);


                    }
                    break;
                case 2 :
                    // src/parser/Music.g:140:38: x= DECR
                    {
                    x=(Token)match(input,DECR,FOLLOW_DECR_in_post1722);  
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
            // 140:46: -> ^( POST var_access $x)
            {
                // src/parser/Music.g:140:50: ^( POST var_access $x)
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
    // src/parser/Music.g:143:1: pre : (x= INCR |x= DECR ) var_access -> ^( PRE var_access $x) ;
    public final MusicParser.pre_return pre() throws RecognitionException {
        MusicParser.pre_return retval = new MusicParser.pre_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token x=null;
        MusicParser.var_access_return var_access106 =null;


        AmlTree x_tree=null;
        RewriteRuleTokenStream stream_INCR=new RewriteRuleTokenStream(adaptor,"token INCR");
        RewriteRuleTokenStream stream_DECR=new RewriteRuleTokenStream(adaptor,"token DECR");
        RewriteRuleSubtreeStream stream_var_access=new RewriteRuleSubtreeStream(adaptor,"rule var_access");
        try {
            // src/parser/Music.g:143:13: ( (x= INCR |x= DECR ) var_access -> ^( PRE var_access $x) )
            // src/parser/Music.g:143:17: (x= INCR |x= DECR ) var_access
            {
            // src/parser/Music.g:143:17: (x= INCR |x= DECR )
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
                    // src/parser/Music.g:143:18: x= INCR
                    {
                    x=(Token)match(input,INCR,FOLLOW_INCR_in_pre1769);  
                    stream_INCR.add(x);


                    }
                    break;
                case 2 :
                    // src/parser/Music.g:143:27: x= DECR
                    {
                    x=(Token)match(input,DECR,FOLLOW_DECR_in_pre1775);  
                    stream_DECR.add(x);


                    }
                    break;

            }


            pushFollow(FOLLOW_var_access_in_pre1778);
            var_access106=var_access();

            state._fsp--;

            stream_var_access.add(var_access106.getTree());

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
            // 143:47: -> ^( PRE var_access $x)
            {
                // src/parser/Music.g:143:50: ^( PRE var_access $x)
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
    // src/parser/Music.g:146:1: beat : BEAT ^ NUM ':' ! NUM ;
    public final MusicParser.beat_return beat() throws RecognitionException {
        MusicParser.beat_return retval = new MusicParser.beat_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token BEAT107=null;
        Token NUM108=null;
        Token char_literal109=null;
        Token NUM110=null;

        AmlTree BEAT107_tree=null;
        AmlTree NUM108_tree=null;
        AmlTree char_literal109_tree=null;
        AmlTree NUM110_tree=null;

        try {
            // src/parser/Music.g:146:13: ( BEAT ^ NUM ':' ! NUM )
            // src/parser/Music.g:146:17: BEAT ^ NUM ':' ! NUM
            {
            root_0 = (AmlTree)adaptor.nil();


            BEAT107=(Token)match(input,BEAT,FOLLOW_BEAT_in_beat1821); 
            BEAT107_tree = 
            (AmlTree)adaptor.create(BEAT107)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(BEAT107_tree, root_0);


            NUM108=(Token)match(input,NUM,FOLLOW_NUM_in_beat1824); 
            NUM108_tree = 
            (AmlTree)adaptor.create(NUM108)
            ;
            adaptor.addChild(root_0, NUM108_tree);


            char_literal109=(Token)match(input,94,FOLLOW_94_in_beat1826); 

            NUM110=(Token)match(input,NUM,FOLLOW_NUM_in_beat1829); 
            NUM110_tree = 
            (AmlTree)adaptor.create(NUM110)
            ;
            adaptor.addChild(root_0, NUM110_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:149:1: speed : SPEED ^ NUM ;
    public final MusicParser.speed_return speed() throws RecognitionException {
        MusicParser.speed_return retval = new MusicParser.speed_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token SPEED111=null;
        Token NUM112=null;

        AmlTree SPEED111_tree=null;
        AmlTree NUM112_tree=null;

        try {
            // src/parser/Music.g:149:13: ( SPEED ^ NUM )
            // src/parser/Music.g:149:17: SPEED ^ NUM
            {
            root_0 = (AmlTree)adaptor.nil();


            SPEED111=(Token)match(input,SPEED,FOLLOW_SPEED_in_speed1858); 
            SPEED111_tree = 
            (AmlTree)adaptor.create(SPEED111)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(SPEED111_tree, root_0);


            NUM112=(Token)match(input,NUM,FOLLOW_NUM_in_speed1861); 
            NUM112_tree = 
            (AmlTree)adaptor.create(NUM112)
            ;
            adaptor.addChild(root_0, NUM112_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:152:1: transport : TRANSPORT ^ expr ;
    public final MusicParser.transport_return transport() throws RecognitionException {
        MusicParser.transport_return retval = new MusicParser.transport_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token TRANSPORT113=null;
        MusicParser.expr_return expr114 =null;


        AmlTree TRANSPORT113_tree=null;

        try {
            // src/parser/Music.g:152:13: ( TRANSPORT ^ expr )
            // src/parser/Music.g:152:17: TRANSPORT ^ expr
            {
            root_0 = (AmlTree)adaptor.nil();


            TRANSPORT113=(Token)match(input,TRANSPORT,FOLLOW_TRANSPORT_in_transport1886); 
            TRANSPORT113_tree = 
            (AmlTree)adaptor.create(TRANSPORT113)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(TRANSPORT113_tree, root_0);


            pushFollow(FOLLOW_expr_in_transport1889);
            expr114=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr114.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:155:1: instrument : INSTRUMENT ^ STRING ';' ;
    public final MusicParser.instrument_return instrument() throws RecognitionException {
        MusicParser.instrument_return retval = new MusicParser.instrument_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token INSTRUMENT115=null;
        Token STRING116=null;
        Token char_literal117=null;

        AmlTree INSTRUMENT115_tree=null;
        AmlTree STRING116_tree=null;
        AmlTree char_literal117_tree=null;

        try {
            // src/parser/Music.g:155:13: ( INSTRUMENT ^ STRING ';' )
            // src/parser/Music.g:155:17: INSTRUMENT ^ STRING ';'
            {
            root_0 = (AmlTree)adaptor.nil();


            INSTRUMENT115=(Token)match(input,INSTRUMENT,FOLLOW_INSTRUMENT_in_instrument1913); 
            INSTRUMENT115_tree = 
            (AmlTree)adaptor.create(INSTRUMENT115)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(INSTRUMENT115_tree, root_0);


            STRING116=(Token)match(input,STRING,FOLLOW_STRING_in_instrument1916); 
            STRING116_tree = 
            (AmlTree)adaptor.create(STRING116)
            ;
            adaptor.addChild(root_0, STRING116_tree);


            char_literal117=(Token)match(input,95,FOLLOW_95_in_instrument1918); 
            char_literal117_tree = 
            (AmlTree)adaptor.create(char_literal117)
            ;
            adaptor.addChild(root_0, char_literal117_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:158:1: while_stmt : WHILE ^ '(' ! expr ')' ! '{' ! listInst '}' !;
    public final MusicParser.while_stmt_return while_stmt() throws RecognitionException {
        MusicParser.while_stmt_return retval = new MusicParser.while_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token WHILE118=null;
        Token char_literal119=null;
        Token char_literal121=null;
        Token char_literal122=null;
        Token char_literal124=null;
        MusicParser.expr_return expr120 =null;

        MusicParser.listInst_return listInst123 =null;


        AmlTree WHILE118_tree=null;
        AmlTree char_literal119_tree=null;
        AmlTree char_literal121_tree=null;
        AmlTree char_literal122_tree=null;
        AmlTree char_literal124_tree=null;

        try {
            // src/parser/Music.g:158:13: ( WHILE ^ '(' ! expr ')' ! '{' ! listInst '}' !)
            // src/parser/Music.g:158:17: WHILE ^ '(' ! expr ')' ! '{' ! listInst '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            WHILE118=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_stmt1942); 
            WHILE118_tree = 
            (AmlTree)adaptor.create(WHILE118)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(WHILE118_tree, root_0);


            char_literal119=(Token)match(input,90,FOLLOW_90_in_while_stmt1945); 

            pushFollow(FOLLOW_expr_in_while_stmt1948);
            expr120=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr120.getTree());

            char_literal121=(Token)match(input,91,FOLLOW_91_in_while_stmt1950); 

            char_literal122=(Token)match(input,96,FOLLOW_96_in_while_stmt1953); 

            pushFollow(FOLLOW_listInst_in_while_stmt1956);
            listInst123=listInst();

            state._fsp--;

            adaptor.addChild(root_0, listInst123.getTree());

            char_literal124=(Token)match(input,97,FOLLOW_97_in_while_stmt1958); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:161:1: while_music_stmt : WHILE ^ '(' ! expr ')' ! '{' ! list_music_inst '}' !;
    public final MusicParser.while_music_stmt_return while_music_stmt() throws RecognitionException {
        MusicParser.while_music_stmt_return retval = new MusicParser.while_music_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token WHILE125=null;
        Token char_literal126=null;
        Token char_literal128=null;
        Token char_literal129=null;
        Token char_literal131=null;
        MusicParser.expr_return expr127 =null;

        MusicParser.list_music_inst_return list_music_inst130 =null;


        AmlTree WHILE125_tree=null;
        AmlTree char_literal126_tree=null;
        AmlTree char_literal128_tree=null;
        AmlTree char_literal129_tree=null;
        AmlTree char_literal131_tree=null;

        try {
            // src/parser/Music.g:161:21: ( WHILE ^ '(' ! expr ')' ! '{' ! list_music_inst '}' !)
            // src/parser/Music.g:161:25: WHILE ^ '(' ! expr ')' ! '{' ! list_music_inst '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            WHILE125=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_music_stmt1985); 
            WHILE125_tree = 
            (AmlTree)adaptor.create(WHILE125)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(WHILE125_tree, root_0);


            char_literal126=(Token)match(input,90,FOLLOW_90_in_while_music_stmt1988); 

            pushFollow(FOLLOW_expr_in_while_music_stmt1991);
            expr127=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr127.getTree());

            char_literal128=(Token)match(input,91,FOLLOW_91_in_while_music_stmt1993); 

            char_literal129=(Token)match(input,96,FOLLOW_96_in_while_music_stmt1996); 

            pushFollow(FOLLOW_list_music_inst_in_while_music_stmt1999);
            list_music_inst130=list_music_inst();

            state._fsp--;

            adaptor.addChild(root_0, list_music_inst130.getTree());

            char_literal131=(Token)match(input,97,FOLLOW_97_in_while_music_stmt2001); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:164:1: for_stmt : FOR ^ '(' ! ( declaration | list_assig ';' !) expr ';' ! list_assig ')' ! '{' ! listInst '}' !;
    public final MusicParser.for_stmt_return for_stmt() throws RecognitionException {
        MusicParser.for_stmt_return retval = new MusicParser.for_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token FOR132=null;
        Token char_literal133=null;
        Token char_literal136=null;
        Token char_literal138=null;
        Token char_literal140=null;
        Token char_literal141=null;
        Token char_literal143=null;
        MusicParser.declaration_return declaration134 =null;

        MusicParser.list_assig_return list_assig135 =null;

        MusicParser.expr_return expr137 =null;

        MusicParser.list_assig_return list_assig139 =null;

        MusicParser.listInst_return listInst142 =null;


        AmlTree FOR132_tree=null;
        AmlTree char_literal133_tree=null;
        AmlTree char_literal136_tree=null;
        AmlTree char_literal138_tree=null;
        AmlTree char_literal140_tree=null;
        AmlTree char_literal141_tree=null;
        AmlTree char_literal143_tree=null;

        try {
            // src/parser/Music.g:164:13: ( FOR ^ '(' ! ( declaration | list_assig ';' !) expr ';' ! list_assig ')' ! '{' ! listInst '}' !)
            // src/parser/Music.g:164:17: FOR ^ '(' ! ( declaration | list_assig ';' !) expr ';' ! list_assig ')' ! '{' ! listInst '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            FOR132=(Token)match(input,FOR,FOLLOW_FOR_in_for_stmt2036); 
            FOR132_tree = 
            (AmlTree)adaptor.create(FOR132)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(FOR132_tree, root_0);


            char_literal133=(Token)match(input,90,FOLLOW_90_in_for_stmt2039); 

            // src/parser/Music.g:164:27: ( declaration | list_assig ';' !)
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==BOOL||LA27_0==CHORD||LA27_0==DRUMS_NOTE_TYPE||LA27_0==INT||LA27_0==NOTE_TYPE||LA27_0==STRING_TYPE) ) {
                alt27=1;
            }
            else if ( (LA27_0==DECR||LA27_0==ID_||LA27_0==INCR||LA27_0==LETTER_X) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;

            }
            switch (alt27) {
                case 1 :
                    // src/parser/Music.g:164:28: declaration
                    {
                    pushFollow(FOLLOW_declaration_in_for_stmt2043);
                    declaration134=declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, declaration134.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:164:42: list_assig ';' !
                    {
                    pushFollow(FOLLOW_list_assig_in_for_stmt2047);
                    list_assig135=list_assig();

                    state._fsp--;

                    adaptor.addChild(root_0, list_assig135.getTree());

                    char_literal136=(Token)match(input,95,FOLLOW_95_in_for_stmt2049); 

                    }
                    break;

            }


            pushFollow(FOLLOW_expr_in_for_stmt2053);
            expr137=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr137.getTree());

            char_literal138=(Token)match(input,95,FOLLOW_95_in_for_stmt2055); 

            pushFollow(FOLLOW_list_assig_in_for_stmt2058);
            list_assig139=list_assig();

            state._fsp--;

            adaptor.addChild(root_0, list_assig139.getTree());

            char_literal140=(Token)match(input,91,FOLLOW_91_in_for_stmt2060); 

            char_literal141=(Token)match(input,96,FOLLOW_96_in_for_stmt2063); 

            pushFollow(FOLLOW_listInst_in_for_stmt2066);
            listInst142=listInst();

            state._fsp--;

            adaptor.addChild(root_0, listInst142.getTree());

            char_literal143=(Token)match(input,97,FOLLOW_97_in_for_stmt2068); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:167:1: for_music_stmt : FOR ^ '(' ! ( declaration | list_assig ';' !) expr ';' ! list_assig ')' ! '{' ! list_music_inst '}' !;
    public final MusicParser.for_music_stmt_return for_music_stmt() throws RecognitionException {
        MusicParser.for_music_stmt_return retval = new MusicParser.for_music_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token FOR144=null;
        Token char_literal145=null;
        Token char_literal148=null;
        Token char_literal150=null;
        Token char_literal152=null;
        Token char_literal153=null;
        Token char_literal155=null;
        MusicParser.declaration_return declaration146 =null;

        MusicParser.list_assig_return list_assig147 =null;

        MusicParser.expr_return expr149 =null;

        MusicParser.list_assig_return list_assig151 =null;

        MusicParser.list_music_inst_return list_music_inst154 =null;


        AmlTree FOR144_tree=null;
        AmlTree char_literal145_tree=null;
        AmlTree char_literal148_tree=null;
        AmlTree char_literal150_tree=null;
        AmlTree char_literal152_tree=null;
        AmlTree char_literal153_tree=null;
        AmlTree char_literal155_tree=null;

        try {
            // src/parser/Music.g:167:17: ( FOR ^ '(' ! ( declaration | list_assig ';' !) expr ';' ! list_assig ')' ! '{' ! list_music_inst '}' !)
            // src/parser/Music.g:167:21: FOR ^ '(' ! ( declaration | list_assig ';' !) expr ';' ! list_assig ')' ! '{' ! list_music_inst '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            FOR144=(Token)match(input,FOR,FOLLOW_FOR_in_for_music_stmt2093); 
            FOR144_tree = 
            (AmlTree)adaptor.create(FOR144)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(FOR144_tree, root_0);


            char_literal145=(Token)match(input,90,FOLLOW_90_in_for_music_stmt2096); 

            // src/parser/Music.g:167:31: ( declaration | list_assig ';' !)
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==BOOL||LA28_0==CHORD||LA28_0==DRUMS_NOTE_TYPE||LA28_0==INT||LA28_0==NOTE_TYPE||LA28_0==STRING_TYPE) ) {
                alt28=1;
            }
            else if ( (LA28_0==DECR||LA28_0==ID_||LA28_0==INCR||LA28_0==LETTER_X) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;

            }
            switch (alt28) {
                case 1 :
                    // src/parser/Music.g:167:32: declaration
                    {
                    pushFollow(FOLLOW_declaration_in_for_music_stmt2100);
                    declaration146=declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, declaration146.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:167:46: list_assig ';' !
                    {
                    pushFollow(FOLLOW_list_assig_in_for_music_stmt2104);
                    list_assig147=list_assig();

                    state._fsp--;

                    adaptor.addChild(root_0, list_assig147.getTree());

                    char_literal148=(Token)match(input,95,FOLLOW_95_in_for_music_stmt2106); 

                    }
                    break;

            }


            pushFollow(FOLLOW_expr_in_for_music_stmt2110);
            expr149=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr149.getTree());

            char_literal150=(Token)match(input,95,FOLLOW_95_in_for_music_stmt2112); 

            pushFollow(FOLLOW_list_assig_in_for_music_stmt2115);
            list_assig151=list_assig();

            state._fsp--;

            adaptor.addChild(root_0, list_assig151.getTree());

            char_literal152=(Token)match(input,91,FOLLOW_91_in_for_music_stmt2117); 

            char_literal153=(Token)match(input,96,FOLLOW_96_in_for_music_stmt2120); 

            pushFollow(FOLLOW_list_music_inst_in_for_music_stmt2123);
            list_music_inst154=list_music_inst();

            state._fsp--;

            adaptor.addChild(root_0, list_music_inst154.getTree());

            char_literal155=(Token)match(input,97,FOLLOW_97_in_for_music_stmt2125); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:170:1: list_assig : assig ( ',' assig )* -> ^( LIST_ASSIG ( assig )+ ) ;
    public final MusicParser.list_assig_return list_assig() throws RecognitionException {
        MusicParser.list_assig_return retval = new MusicParser.list_assig_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal157=null;
        MusicParser.assig_return assig156 =null;

        MusicParser.assig_return assig158 =null;


        AmlTree char_literal157_tree=null;
        RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
        RewriteRuleSubtreeStream stream_assig=new RewriteRuleSubtreeStream(adaptor,"rule assig");
        try {
            // src/parser/Music.g:170:13: ( assig ( ',' assig )* -> ^( LIST_ASSIG ( assig )+ ) )
            // src/parser/Music.g:170:17: assig ( ',' assig )*
            {
            pushFollow(FOLLOW_assig_in_list_assig2154);
            assig156=assig();

            state._fsp--;

            stream_assig.add(assig156.getTree());

            // src/parser/Music.g:170:23: ( ',' assig )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==92) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // src/parser/Music.g:170:24: ',' assig
            	    {
            	    char_literal157=(Token)match(input,92,FOLLOW_92_in_list_assig2157);  
            	    stream_92.add(char_literal157);


            	    pushFollow(FOLLOW_assig_in_list_assig2159);
            	    assig158=assig();

            	    state._fsp--;

            	    stream_assig.add(assig158.getTree());

            	    }
            	    break;

            	default :
            	    break loop29;
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
            // 170:36: -> ^( LIST_ASSIG ( assig )+ )
            {
                // src/parser/Music.g:170:39: ^( LIST_ASSIG ( assig )+ )
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
    // src/parser/Music.g:173:1: if_stmt : IF ^ '(' ! expr ')' ! '{' ! listInst '}' ! ( elseif_stmt )* ( else_stmt )? ;
    public final MusicParser.if_stmt_return if_stmt() throws RecognitionException {
        MusicParser.if_stmt_return retval = new MusicParser.if_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token IF159=null;
        Token char_literal160=null;
        Token char_literal162=null;
        Token char_literal163=null;
        Token char_literal165=null;
        MusicParser.expr_return expr161 =null;

        MusicParser.listInst_return listInst164 =null;

        MusicParser.elseif_stmt_return elseif_stmt166 =null;

        MusicParser.else_stmt_return else_stmt167 =null;


        AmlTree IF159_tree=null;
        AmlTree char_literal160_tree=null;
        AmlTree char_literal162_tree=null;
        AmlTree char_literal163_tree=null;
        AmlTree char_literal165_tree=null;

        try {
            // src/parser/Music.g:173:13: ( IF ^ '(' ! expr ')' ! '{' ! listInst '}' ! ( elseif_stmt )* ( else_stmt )? )
            // src/parser/Music.g:173:17: IF ^ '(' ! expr ')' ! '{' ! listInst '}' ! ( elseif_stmt )* ( else_stmt )?
            {
            root_0 = (AmlTree)adaptor.nil();


            IF159=(Token)match(input,IF,FOLLOW_IF_in_if_stmt2197); 
            IF159_tree = 
            (AmlTree)adaptor.create(IF159)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(IF159_tree, root_0);


            char_literal160=(Token)match(input,90,FOLLOW_90_in_if_stmt2200); 

            pushFollow(FOLLOW_expr_in_if_stmt2203);
            expr161=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr161.getTree());

            char_literal162=(Token)match(input,91,FOLLOW_91_in_if_stmt2205); 

            char_literal163=(Token)match(input,96,FOLLOW_96_in_if_stmt2208); 

            pushFollow(FOLLOW_listInst_in_if_stmt2211);
            listInst164=listInst();

            state._fsp--;

            adaptor.addChild(root_0, listInst164.getTree());

            char_literal165=(Token)match(input,97,FOLLOW_97_in_if_stmt2213); 

            // src/parser/Music.g:173:55: ( elseif_stmt )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==ELSE) ) {
                    int LA30_1 = input.LA(2);

                    if ( (LA30_1==IF) ) {
                        alt30=1;
                    }


                }


                switch (alt30) {
            	case 1 :
            	    // src/parser/Music.g:173:55: elseif_stmt
            	    {
            	    pushFollow(FOLLOW_elseif_stmt_in_if_stmt2216);
            	    elseif_stmt166=elseif_stmt();

            	    state._fsp--;

            	    adaptor.addChild(root_0, elseif_stmt166.getTree());

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            // src/parser/Music.g:173:68: ( else_stmt )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==ELSE) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // src/parser/Music.g:173:68: else_stmt
                    {
                    pushFollow(FOLLOW_else_stmt_in_if_stmt2219);
                    else_stmt167=else_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, else_stmt167.getTree());

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
    // src/parser/Music.g:176:1: elseif_stmt : ELSE IF '(' expr ')' '{' listInst '}' -> ^( ELSEIF expr listInst ) ;
    public final MusicParser.elseif_stmt_return elseif_stmt() throws RecognitionException {
        MusicParser.elseif_stmt_return retval = new MusicParser.elseif_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token ELSE168=null;
        Token IF169=null;
        Token char_literal170=null;
        Token char_literal172=null;
        Token char_literal173=null;
        Token char_literal175=null;
        MusicParser.expr_return expr171 =null;

        MusicParser.listInst_return listInst174 =null;


        AmlTree ELSE168_tree=null;
        AmlTree IF169_tree=null;
        AmlTree char_literal170_tree=null;
        AmlTree char_literal172_tree=null;
        AmlTree char_literal173_tree=null;
        AmlTree char_literal175_tree=null;
        RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
        RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleTokenStream stream_96=new RewriteRuleTokenStream(adaptor,"token 96");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_97=new RewriteRuleTokenStream(adaptor,"token 97");
        RewriteRuleSubtreeStream stream_listInst=new RewriteRuleSubtreeStream(adaptor,"rule listInst");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // src/parser/Music.g:176:13: ( ELSE IF '(' expr ')' '{' listInst '}' -> ^( ELSEIF expr listInst ) )
            // src/parser/Music.g:176:17: ELSE IF '(' expr ')' '{' listInst '}'
            {
            ELSE168=(Token)match(input,ELSE,FOLLOW_ELSE_in_elseif_stmt2243);  
            stream_ELSE.add(ELSE168);


            IF169=(Token)match(input,IF,FOLLOW_IF_in_elseif_stmt2245);  
            stream_IF.add(IF169);


            char_literal170=(Token)match(input,90,FOLLOW_90_in_elseif_stmt2247);  
            stream_90.add(char_literal170);


            pushFollow(FOLLOW_expr_in_elseif_stmt2249);
            expr171=expr();

            state._fsp--;

            stream_expr.add(expr171.getTree());

            char_literal172=(Token)match(input,91,FOLLOW_91_in_elseif_stmt2251);  
            stream_91.add(char_literal172);


            char_literal173=(Token)match(input,96,FOLLOW_96_in_elseif_stmt2253);  
            stream_96.add(char_literal173);


            pushFollow(FOLLOW_listInst_in_elseif_stmt2255);
            listInst174=listInst();

            state._fsp--;

            stream_listInst.add(listInst174.getTree());

            char_literal175=(Token)match(input,97,FOLLOW_97_in_elseif_stmt2257);  
            stream_97.add(char_literal175);


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
            // 176:55: -> ^( ELSEIF expr listInst )
            {
                // src/parser/Music.g:176:58: ^( ELSEIF expr listInst )
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
    // src/parser/Music.g:179:1: else_stmt : ELSE ^ '{' ! listInst '}' !;
    public final MusicParser.else_stmt_return else_stmt() throws RecognitionException {
        MusicParser.else_stmt_return retval = new MusicParser.else_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token ELSE176=null;
        Token char_literal177=null;
        Token char_literal179=null;
        MusicParser.listInst_return listInst178 =null;


        AmlTree ELSE176_tree=null;
        AmlTree char_literal177_tree=null;
        AmlTree char_literal179_tree=null;

        try {
            // src/parser/Music.g:179:13: ( ELSE ^ '{' ! listInst '}' !)
            // src/parser/Music.g:179:17: ELSE ^ '{' ! listInst '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            ELSE176=(Token)match(input,ELSE,FOLLOW_ELSE_in_else_stmt2292); 
            ELSE176_tree = 
            (AmlTree)adaptor.create(ELSE176)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(ELSE176_tree, root_0);


            char_literal177=(Token)match(input,96,FOLLOW_96_in_else_stmt2295); 

            pushFollow(FOLLOW_listInst_in_else_stmt2298);
            listInst178=listInst();

            state._fsp--;

            adaptor.addChild(root_0, listInst178.getTree());

            char_literal179=(Token)match(input,97,FOLLOW_97_in_else_stmt2300); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:182:1: if_music_stmt : IF ^ '(' ! expr ')' ! '{' ! list_music_inst '}' ! ( elseif_music_stmt )* ( else_music_stmt )? ;
    public final MusicParser.if_music_stmt_return if_music_stmt() throws RecognitionException {
        MusicParser.if_music_stmt_return retval = new MusicParser.if_music_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token IF180=null;
        Token char_literal181=null;
        Token char_literal183=null;
        Token char_literal184=null;
        Token char_literal186=null;
        MusicParser.expr_return expr182 =null;

        MusicParser.list_music_inst_return list_music_inst185 =null;

        MusicParser.elseif_music_stmt_return elseif_music_stmt187 =null;

        MusicParser.else_music_stmt_return else_music_stmt188 =null;


        AmlTree IF180_tree=null;
        AmlTree char_literal181_tree=null;
        AmlTree char_literal183_tree=null;
        AmlTree char_literal184_tree=null;
        AmlTree char_literal186_tree=null;

        try {
            // src/parser/Music.g:182:17: ( IF ^ '(' ! expr ')' ! '{' ! list_music_inst '}' ! ( elseif_music_stmt )* ( else_music_stmt )? )
            // src/parser/Music.g:182:21: IF ^ '(' ! expr ')' ! '{' ! list_music_inst '}' ! ( elseif_music_stmt )* ( else_music_stmt )?
            {
            root_0 = (AmlTree)adaptor.nil();


            IF180=(Token)match(input,IF,FOLLOW_IF_in_if_music_stmt2326); 
            IF180_tree = 
            (AmlTree)adaptor.create(IF180)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(IF180_tree, root_0);


            char_literal181=(Token)match(input,90,FOLLOW_90_in_if_music_stmt2329); 

            pushFollow(FOLLOW_expr_in_if_music_stmt2332);
            expr182=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr182.getTree());

            char_literal183=(Token)match(input,91,FOLLOW_91_in_if_music_stmt2334); 

            char_literal184=(Token)match(input,96,FOLLOW_96_in_if_music_stmt2337); 

            pushFollow(FOLLOW_list_music_inst_in_if_music_stmt2340);
            list_music_inst185=list_music_inst();

            state._fsp--;

            adaptor.addChild(root_0, list_music_inst185.getTree());

            char_literal186=(Token)match(input,97,FOLLOW_97_in_if_music_stmt2342); 

            // src/parser/Music.g:182:66: ( elseif_music_stmt )*
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
            	    // src/parser/Music.g:182:66: elseif_music_stmt
            	    {
            	    pushFollow(FOLLOW_elseif_music_stmt_in_if_music_stmt2345);
            	    elseif_music_stmt187=elseif_music_stmt();

            	    state._fsp--;

            	    adaptor.addChild(root_0, elseif_music_stmt187.getTree());

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);


            // src/parser/Music.g:182:85: ( else_music_stmt )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==ELSE) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // src/parser/Music.g:182:85: else_music_stmt
                    {
                    pushFollow(FOLLOW_else_music_stmt_in_if_music_stmt2348);
                    else_music_stmt188=else_music_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, else_music_stmt188.getTree());

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
    // src/parser/Music.g:185:1: elseif_music_stmt : ELSE IF '(' expr ')' '{' list_music_inst '}' -> ^( ELSEIF expr list_music_inst ) ;
    public final MusicParser.elseif_music_stmt_return elseif_music_stmt() throws RecognitionException {
        MusicParser.elseif_music_stmt_return retval = new MusicParser.elseif_music_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token ELSE189=null;
        Token IF190=null;
        Token char_literal191=null;
        Token char_literal193=null;
        Token char_literal194=null;
        Token char_literal196=null;
        MusicParser.expr_return expr192 =null;

        MusicParser.list_music_inst_return list_music_inst195 =null;


        AmlTree ELSE189_tree=null;
        AmlTree IF190_tree=null;
        AmlTree char_literal191_tree=null;
        AmlTree char_literal193_tree=null;
        AmlTree char_literal194_tree=null;
        AmlTree char_literal196_tree=null;
        RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
        RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleTokenStream stream_96=new RewriteRuleTokenStream(adaptor,"token 96");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_97=new RewriteRuleTokenStream(adaptor,"token 97");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_list_music_inst=new RewriteRuleSubtreeStream(adaptor,"rule list_music_inst");
        try {
            // src/parser/Music.g:185:21: ( ELSE IF '(' expr ')' '{' list_music_inst '}' -> ^( ELSEIF expr list_music_inst ) )
            // src/parser/Music.g:185:25: ELSE IF '(' expr ')' '{' list_music_inst '}'
            {
            ELSE189=(Token)match(input,ELSE,FOLLOW_ELSE_in_elseif_music_stmt2378);  
            stream_ELSE.add(ELSE189);


            IF190=(Token)match(input,IF,FOLLOW_IF_in_elseif_music_stmt2380);  
            stream_IF.add(IF190);


            char_literal191=(Token)match(input,90,FOLLOW_90_in_elseif_music_stmt2382);  
            stream_90.add(char_literal191);


            pushFollow(FOLLOW_expr_in_elseif_music_stmt2384);
            expr192=expr();

            state._fsp--;

            stream_expr.add(expr192.getTree());

            char_literal193=(Token)match(input,91,FOLLOW_91_in_elseif_music_stmt2386);  
            stream_91.add(char_literal193);


            char_literal194=(Token)match(input,96,FOLLOW_96_in_elseif_music_stmt2388);  
            stream_96.add(char_literal194);


            pushFollow(FOLLOW_list_music_inst_in_elseif_music_stmt2390);
            list_music_inst195=list_music_inst();

            state._fsp--;

            stream_list_music_inst.add(list_music_inst195.getTree());

            char_literal196=(Token)match(input,97,FOLLOW_97_in_elseif_music_stmt2392);  
            stream_97.add(char_literal196);


            // AST REWRITE
            // elements: expr, list_music_inst
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AmlTree)adaptor.nil();
            // 185:70: -> ^( ELSEIF expr list_music_inst )
            {
                // src/parser/Music.g:185:73: ^( ELSEIF expr list_music_inst )
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
    // src/parser/Music.g:188:1: else_music_stmt : ELSE ^ '{' ! list_music_inst '}' !;
    public final MusicParser.else_music_stmt_return else_music_stmt() throws RecognitionException {
        MusicParser.else_music_stmt_return retval = new MusicParser.else_music_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token ELSE197=null;
        Token char_literal198=null;
        Token char_literal200=null;
        MusicParser.list_music_inst_return list_music_inst199 =null;


        AmlTree ELSE197_tree=null;
        AmlTree char_literal198_tree=null;
        AmlTree char_literal200_tree=null;

        try {
            // src/parser/Music.g:188:17: ( ELSE ^ '{' ! list_music_inst '}' !)
            // src/parser/Music.g:188:21: ELSE ^ '{' ! list_music_inst '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            ELSE197=(Token)match(input,ELSE,FOLLOW_ELSE_in_else_music_stmt2433); 
            ELSE197_tree = 
            (AmlTree)adaptor.create(ELSE197)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(ELSE197_tree, root_0);


            char_literal198=(Token)match(input,96,FOLLOW_96_in_else_music_stmt2436); 

            pushFollow(FOLLOW_list_music_inst_in_else_music_stmt2439);
            list_music_inst199=list_music_inst();

            state._fsp--;

            adaptor.addChild(root_0, list_music_inst199.getTree());

            char_literal200=(Token)match(input,97,FOLLOW_97_in_else_music_stmt2441); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:191:1: song : SONG ^ ( id_rule )? '{' ! ( beat ';' !)? ( speed ';' !)? ( tone ';' !)? ( transport ';' !)? ( track )+ ( drums_track )? '}' !;
    public final MusicParser.song_return song() throws RecognitionException {
        MusicParser.song_return retval = new MusicParser.song_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token SONG201=null;
        Token char_literal203=null;
        Token char_literal205=null;
        Token char_literal207=null;
        Token char_literal209=null;
        Token char_literal211=null;
        Token char_literal214=null;
        MusicParser.id_rule_return id_rule202 =null;

        MusicParser.beat_return beat204 =null;

        MusicParser.speed_return speed206 =null;

        MusicParser.tone_return tone208 =null;

        MusicParser.transport_return transport210 =null;

        MusicParser.track_return track212 =null;

        MusicParser.drums_track_return drums_track213 =null;


        AmlTree SONG201_tree=null;
        AmlTree char_literal203_tree=null;
        AmlTree char_literal205_tree=null;
        AmlTree char_literal207_tree=null;
        AmlTree char_literal209_tree=null;
        AmlTree char_literal211_tree=null;
        AmlTree char_literal214_tree=null;

        try {
            // src/parser/Music.g:191:13: ( SONG ^ ( id_rule )? '{' ! ( beat ';' !)? ( speed ';' !)? ( tone ';' !)? ( transport ';' !)? ( track )+ ( drums_track )? '}' !)
            // src/parser/Music.g:191:17: SONG ^ ( id_rule )? '{' ! ( beat ';' !)? ( speed ';' !)? ( tone ';' !)? ( transport ';' !)? ( track )+ ( drums_track )? '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            SONG201=(Token)match(input,SONG,FOLLOW_SONG_in_song2476); 
            SONG201_tree = 
            (AmlTree)adaptor.create(SONG201)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(SONG201_tree, root_0);


            // src/parser/Music.g:191:23: ( id_rule )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==ID_||LA34_0==LETTER_X) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // src/parser/Music.g:191:23: id_rule
                    {
                    pushFollow(FOLLOW_id_rule_in_song2479);
                    id_rule202=id_rule();

                    state._fsp--;

                    adaptor.addChild(root_0, id_rule202.getTree());

                    }
                    break;

            }


            char_literal203=(Token)match(input,96,FOLLOW_96_in_song2482); 

            // src/parser/Music.g:191:37: ( beat ';' !)?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==BEAT) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // src/parser/Music.g:191:38: beat ';' !
                    {
                    pushFollow(FOLLOW_beat_in_song2486);
                    beat204=beat();

                    state._fsp--;

                    adaptor.addChild(root_0, beat204.getTree());

                    char_literal205=(Token)match(input,95,FOLLOW_95_in_song2488); 

                    }
                    break;

            }


            // src/parser/Music.g:191:50: ( speed ';' !)?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==SPEED) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // src/parser/Music.g:191:51: speed ';' !
                    {
                    pushFollow(FOLLOW_speed_in_song2494);
                    speed206=speed();

                    state._fsp--;

                    adaptor.addChild(root_0, speed206.getTree());

                    char_literal207=(Token)match(input,95,FOLLOW_95_in_song2496); 

                    }
                    break;

            }


            // src/parser/Music.g:191:64: ( tone ';' !)?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==TONE) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // src/parser/Music.g:191:65: tone ';' !
                    {
                    pushFollow(FOLLOW_tone_in_song2502);
                    tone208=tone();

                    state._fsp--;

                    adaptor.addChild(root_0, tone208.getTree());

                    char_literal209=(Token)match(input,95,FOLLOW_95_in_song2504); 

                    }
                    break;

            }


            // src/parser/Music.g:191:77: ( transport ';' !)?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==TRANSPORT) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // src/parser/Music.g:191:78: transport ';' !
                    {
                    pushFollow(FOLLOW_transport_in_song2510);
                    transport210=transport();

                    state._fsp--;

                    adaptor.addChild(root_0, transport210.getTree());

                    char_literal211=(Token)match(input,95,FOLLOW_95_in_song2512); 

                    }
                    break;

            }


            // src/parser/Music.g:191:96: ( track )+
            int cnt39=0;
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==TRACK) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // src/parser/Music.g:191:97: track
            	    {
            	    pushFollow(FOLLOW_track_in_song2519);
            	    track212=track();

            	    state._fsp--;

            	    adaptor.addChild(root_0, track212.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt39 >= 1 ) break loop39;
                        EarlyExitException eee =
                            new EarlyExitException(39, input);
                        throw eee;
                }
                cnt39++;
            } while (true);


            // src/parser/Music.g:191:105: ( drums_track )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==DRUMS) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // src/parser/Music.g:191:105: drums_track
                    {
                    pushFollow(FOLLOW_drums_track_in_song2523);
                    drums_track213=drums_track();

                    state._fsp--;

                    adaptor.addChild(root_0, drums_track213.getTree());

                    }
                    break;

            }


            char_literal214=(Token)match(input,97,FOLLOW_97_in_song2526); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:194:1: track : TRACK ^ ( id_rule )? ( STRING )? compas_aux ;
    public final MusicParser.track_return track() throws RecognitionException {
        MusicParser.track_return retval = new MusicParser.track_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token TRACK215=null;
        Token STRING217=null;
        MusicParser.id_rule_return id_rule216 =null;

        MusicParser.compas_aux_return compas_aux218 =null;


        AmlTree TRACK215_tree=null;
        AmlTree STRING217_tree=null;

        try {
            // src/parser/Music.g:194:13: ( TRACK ^ ( id_rule )? ( STRING )? compas_aux )
            // src/parser/Music.g:194:17: TRACK ^ ( id_rule )? ( STRING )? compas_aux
            {
            root_0 = (AmlTree)adaptor.nil();


            TRACK215=(Token)match(input,TRACK,FOLLOW_TRACK_in_track2556); 
            TRACK215_tree = 
            (AmlTree)adaptor.create(TRACK215)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(TRACK215_tree, root_0);


            // src/parser/Music.g:194:24: ( id_rule )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==ID_||LA41_0==LETTER_X) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // src/parser/Music.g:194:24: id_rule
                    {
                    pushFollow(FOLLOW_id_rule_in_track2559);
                    id_rule216=id_rule();

                    state._fsp--;

                    adaptor.addChild(root_0, id_rule216.getTree());

                    }
                    break;

            }


            // src/parser/Music.g:194:33: ( STRING )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==STRING) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // src/parser/Music.g:194:33: STRING
                    {
                    STRING217=(Token)match(input,STRING,FOLLOW_STRING_in_track2562); 
                    STRING217_tree = 
                    (AmlTree)adaptor.create(STRING217)
                    ;
                    adaptor.addChild(root_0, STRING217_tree);


                    }
                    break;

            }


            pushFollow(FOLLOW_compas_aux_in_track2565);
            compas_aux218=compas_aux();

            state._fsp--;

            adaptor.addChild(root_0, compas_aux218.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:197:1: drums_track : DRUMS ^ TRACK compas_aux ;
    public final MusicParser.drums_track_return drums_track() throws RecognitionException {
        MusicParser.drums_track_return retval = new MusicParser.drums_track_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token DRUMS219=null;
        Token TRACK220=null;
        MusicParser.compas_aux_return compas_aux221 =null;


        AmlTree DRUMS219_tree=null;
        AmlTree TRACK220_tree=null;

        try {
            // src/parser/Music.g:197:13: ( DRUMS ^ TRACK compas_aux )
            // src/parser/Music.g:197:17: DRUMS ^ TRACK compas_aux
            {
            root_0 = (AmlTree)adaptor.nil();


            DRUMS219=(Token)match(input,DRUMS,FOLLOW_DRUMS_in_drums_track2588); 
            DRUMS219_tree = 
            (AmlTree)adaptor.create(DRUMS219)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(DRUMS219_tree, root_0);


            TRACK220=(Token)match(input,TRACK,FOLLOW_TRACK_in_drums_track2591); 
            TRACK220_tree = 
            (AmlTree)adaptor.create(TRACK220)
            ;
            adaptor.addChild(root_0, TRACK220_tree);


            pushFollow(FOLLOW_compas_aux_in_drums_track2593);
            compas_aux221=compas_aux();

            state._fsp--;

            adaptor.addChild(root_0, compas_aux221.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:200:1: compas_aux : compas_list -> ^( COMPAS_LIST compas_list ) ;
    public final MusicParser.compas_aux_return compas_aux() throws RecognitionException {
        MusicParser.compas_aux_return retval = new MusicParser.compas_aux_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        MusicParser.compas_list_return compas_list222 =null;


        RewriteRuleSubtreeStream stream_compas_list=new RewriteRuleSubtreeStream(adaptor,"rule compas_list");
        try {
            // src/parser/Music.g:200:13: ( compas_list -> ^( COMPAS_LIST compas_list ) )
            // src/parser/Music.g:200:17: compas_list
            {
            pushFollow(FOLLOW_compas_list_in_compas_aux2617);
            compas_list222=compas_list();

            state._fsp--;

            stream_compas_list.add(compas_list222.getTree());

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
            // 200:29: -> ^( COMPAS_LIST compas_list )
            {
                // src/parser/Music.g:200:32: ^( COMPAS_LIST compas_list )
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
    // src/parser/Music.g:203:1: compas_list : ( DOUBLE_BAR !| repetition ) ( compasses | repetition )* ( DOUBLE_BAR !) ;
    public final MusicParser.compas_list_return compas_list() throws RecognitionException {
        MusicParser.compas_list_return retval = new MusicParser.compas_list_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token DOUBLE_BAR223=null;
        Token DOUBLE_BAR227=null;
        MusicParser.repetition_return repetition224 =null;

        MusicParser.compasses_return compasses225 =null;

        MusicParser.repetition_return repetition226 =null;


        AmlTree DOUBLE_BAR223_tree=null;
        AmlTree DOUBLE_BAR227_tree=null;

        try {
            // src/parser/Music.g:203:13: ( ( DOUBLE_BAR !| repetition ) ( compasses | repetition )* ( DOUBLE_BAR !) )
            // src/parser/Music.g:203:15: ( DOUBLE_BAR !| repetition ) ( compasses | repetition )* ( DOUBLE_BAR !)
            {
            root_0 = (AmlTree)adaptor.nil();


            // src/parser/Music.g:203:15: ( DOUBLE_BAR !| repetition )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==DOUBLE_BAR) ) {
                alt43=1;
            }
            else if ( (LA43_0==NUM||LA43_0==START_REPETITION) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;

            }
            switch (alt43) {
                case 1 :
                    // src/parser/Music.g:203:16: DOUBLE_BAR !
                    {
                    DOUBLE_BAR223=(Token)match(input,DOUBLE_BAR,FOLLOW_DOUBLE_BAR_in_compas_list2647); 

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:203:30: repetition
                    {
                    pushFollow(FOLLOW_repetition_in_compas_list2652);
                    repetition224=repetition();

                    state._fsp--;

                    adaptor.addChild(root_0, repetition224.getTree());

                    }
                    break;

            }


            // src/parser/Music.g:203:42: ( compasses | repetition )*
            loop44:
            do {
                int alt44=3;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==ARMOR||(LA44_0 >= BEAT && LA44_0 <= BOOL)||LA44_0==CHORD||LA44_0==DECR||(LA44_0 >= DRUMS && LA44_0 <= DRUMS_NOTE_TYPE)||LA44_0==FOR||(LA44_0 >= ID_ && LA44_0 <= INT)||LA44_0==LETTER_X||LA44_0==NOTE||LA44_0==NOTE_TYPE||(LA44_0 >= SONG && LA44_0 <= SPEED)||(LA44_0 >= STRING_TYPE && LA44_0 <= SUSTAIN)||LA44_0==TONE||LA44_0==WHILE||LA44_0==90) ) {
                    alt44=1;
                }
                else if ( (LA44_0==NUM||LA44_0==START_REPETITION) ) {
                    alt44=2;
                }


                switch (alt44) {
            	case 1 :
            	    // src/parser/Music.g:203:43: compasses
            	    {
            	    pushFollow(FOLLOW_compasses_in_compas_list2656);
            	    compasses225=compasses();

            	    state._fsp--;

            	    adaptor.addChild(root_0, compasses225.getTree());

            	    }
            	    break;
            	case 2 :
            	    // src/parser/Music.g:203:55: repetition
            	    {
            	    pushFollow(FOLLOW_repetition_in_compas_list2660);
            	    repetition226=repetition();

            	    state._fsp--;

            	    adaptor.addChild(root_0, repetition226.getTree());

            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);


            // src/parser/Music.g:203:68: ( DOUBLE_BAR !)
            // src/parser/Music.g:203:69: DOUBLE_BAR !
            {
            DOUBLE_BAR227=(Token)match(input,DOUBLE_BAR,FOLLOW_DOUBLE_BAR_in_compas_list2665); 

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
    // src/parser/Music.g:206:1: compasses : compas ( BAR ! compas )* ;
    public final MusicParser.compasses_return compasses() throws RecognitionException {
        MusicParser.compasses_return retval = new MusicParser.compasses_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token BAR229=null;
        MusicParser.compas_return compas228 =null;

        MusicParser.compas_return compas230 =null;


        AmlTree BAR229_tree=null;

        try {
            // src/parser/Music.g:206:13: ( compas ( BAR ! compas )* )
            // src/parser/Music.g:206:17: compas ( BAR ! compas )*
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_compas_in_compasses2692);
            compas228=compas();

            state._fsp--;

            adaptor.addChild(root_0, compas228.getTree());

            // src/parser/Music.g:206:24: ( BAR ! compas )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==BAR) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // src/parser/Music.g:206:25: BAR ! compas
            	    {
            	    BAR229=(Token)match(input,BAR,FOLLOW_BAR_in_compasses2695); 

            	    pushFollow(FOLLOW_compas_in_compasses2698);
            	    compas230=compas();

            	    state._fsp--;

            	    adaptor.addChild(root_0, compas230.getTree());

            	    }
            	    break;

            	default :
            	    break loop45;
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
    // src/parser/Music.g:209:1: repetition : ( NUM LETTER_X )? START_REPETITION compasses END_REPETITION -> ^( REPETITION ( NUM )? compasses ) ;
    public final MusicParser.repetition_return repetition() throws RecognitionException {
        MusicParser.repetition_return retval = new MusicParser.repetition_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token NUM231=null;
        Token LETTER_X232=null;
        Token START_REPETITION233=null;
        Token END_REPETITION235=null;
        MusicParser.compasses_return compasses234 =null;


        AmlTree NUM231_tree=null;
        AmlTree LETTER_X232_tree=null;
        AmlTree START_REPETITION233_tree=null;
        AmlTree END_REPETITION235_tree=null;
        RewriteRuleTokenStream stream_LETTER_X=new RewriteRuleTokenStream(adaptor,"token LETTER_X");
        RewriteRuleTokenStream stream_NUM=new RewriteRuleTokenStream(adaptor,"token NUM");
        RewriteRuleTokenStream stream_END_REPETITION=new RewriteRuleTokenStream(adaptor,"token END_REPETITION");
        RewriteRuleTokenStream stream_START_REPETITION=new RewriteRuleTokenStream(adaptor,"token START_REPETITION");
        RewriteRuleSubtreeStream stream_compasses=new RewriteRuleSubtreeStream(adaptor,"rule compasses");
        try {
            // src/parser/Music.g:209:13: ( ( NUM LETTER_X )? START_REPETITION compasses END_REPETITION -> ^( REPETITION ( NUM )? compasses ) )
            // src/parser/Music.g:209:17: ( NUM LETTER_X )? START_REPETITION compasses END_REPETITION
            {
            // src/parser/Music.g:209:17: ( NUM LETTER_X )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==NUM) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // src/parser/Music.g:209:18: NUM LETTER_X
                    {
                    NUM231=(Token)match(input,NUM,FOLLOW_NUM_in_repetition2725);  
                    stream_NUM.add(NUM231);


                    LETTER_X232=(Token)match(input,LETTER_X,FOLLOW_LETTER_X_in_repetition2727);  
                    stream_LETTER_X.add(LETTER_X232);


                    }
                    break;

            }


            START_REPETITION233=(Token)match(input,START_REPETITION,FOLLOW_START_REPETITION_in_repetition2731);  
            stream_START_REPETITION.add(START_REPETITION233);


            pushFollow(FOLLOW_compasses_in_repetition2733);
            compasses234=compasses();

            state._fsp--;

            stream_compasses.add(compasses234.getTree());

            END_REPETITION235=(Token)match(input,END_REPETITION,FOLLOW_END_REPETITION_in_repetition2735);  
            stream_END_REPETITION.add(END_REPETITION235);


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
            // 209:78: -> ^( REPETITION ( NUM )? compasses )
            {
                // src/parser/Music.g:209:81: ^( REPETITION ( NUM )? compasses )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(REPETITION, "REPETITION")
                , root_1);

                // src/parser/Music.g:209:94: ( NUM )?
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
    // src/parser/Music.g:212:1: compas : ( options {greedy=true; } : music_inst )+ -> ^( COMPAS ( music_inst )+ ) ;
    public final MusicParser.compas_return compas() throws RecognitionException {
        MusicParser.compas_return retval = new MusicParser.compas_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        MusicParser.music_inst_return music_inst236 =null;


        RewriteRuleSubtreeStream stream_music_inst=new RewriteRuleSubtreeStream(adaptor,"rule music_inst");
        try {
            // src/parser/Music.g:212:13: ( ( options {greedy=true; } : music_inst )+ -> ^( COMPAS ( music_inst )+ ) )
            // src/parser/Music.g:212:16: ( options {greedy=true; } : music_inst )+
            {
            // src/parser/Music.g:212:16: ( options {greedy=true; } : music_inst )+
            int cnt47=0;
            loop47:
            do {
                int alt47=2;
                switch ( input.LA(1) ) {
                case CHORD:
                    {
                    alt47=1;
                    }
                    break;
                case TONE:
                    {
                    alt47=1;
                    }
                    break;
                case BEAT:
                    {
                    alt47=1;
                    }
                    break;
                case SPEED:
                    {
                    alt47=1;
                    }
                    break;
                case INSTRUMENT:
                    {
                    alt47=1;
                    }
                    break;
                case ID_:
                    {
                    alt47=1;
                    }
                    break;
                case LETTER_X:
                    {
                    alt47=1;
                    }
                    break;
                case INCR:
                    {
                    alt47=1;
                    }
                    break;
                case DECR:
                    {
                    alt47=1;
                    }
                    break;
                case WHILE:
                    {
                    alt47=1;
                    }
                    break;
                case FOR:
                    {
                    alt47=1;
                    }
                    break;
                case IF:
                    {
                    alt47=1;
                    }
                    break;
                case SONG:
                    {
                    alt47=1;
                    }
                    break;
                case BOOL:
                case DRUMS_NOTE_TYPE:
                case INT:
                case NOTE_TYPE:
                case STRING_TYPE:
                    {
                    alt47=1;
                    }
                    break;
                case 90:
                    {
                    alt47=1;
                    }
                    break;
                case ARMOR:
                case BEMOL:
                case SUSTAIN:
                    {
                    alt47=1;
                    }
                    break;
                case NOTE:
                    {
                    alt47=1;
                    }
                    break;
                case DRUMS:
                    {
                    alt47=1;
                    }
                    break;

                }

                switch (alt47) {
            	case 1 :
            	    // src/parser/Music.g:212:42: music_inst
            	    {
            	    pushFollow(FOLLOW_music_inst_in_compas2786);
            	    music_inst236=music_inst();

            	    state._fsp--;

            	    stream_music_inst.add(music_inst236.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt47 >= 1 ) break loop47;
                        EarlyExitException eee =
                            new EarlyExitException(47, input);
                        throw eee;
                }
                cnt47++;
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
            // 212:58: -> ^( COMPAS ( music_inst )+ )
            {
                // src/parser/Music.g:212:61: ^( COMPAS ( music_inst )+ )
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
    // src/parser/Music.g:215:1: tone : TONE ^ NUM ( SUSTAIN | BEMOL ) ;
    public final MusicParser.tone_return tone() throws RecognitionException {
        MusicParser.tone_return retval = new MusicParser.tone_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token TONE237=null;
        Token NUM238=null;
        Token set239=null;

        AmlTree TONE237_tree=null;
        AmlTree NUM238_tree=null;
        AmlTree set239_tree=null;

        try {
            // src/parser/Music.g:215:13: ( TONE ^ NUM ( SUSTAIN | BEMOL ) )
            // src/parser/Music.g:215:17: TONE ^ NUM ( SUSTAIN | BEMOL )
            {
            root_0 = (AmlTree)adaptor.nil();


            TONE237=(Token)match(input,TONE,FOLLOW_TONE_in_tone2830); 
            TONE237_tree = 
            (AmlTree)adaptor.create(TONE237)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(TONE237_tree, root_0);


            NUM238=(Token)match(input,NUM,FOLLOW_NUM_in_tone2833); 
            NUM238_tree = 
            (AmlTree)adaptor.create(NUM238)
            ;
            adaptor.addChild(root_0, NUM238_tree);


            set239=(Token)input.LT(1);

            if ( input.LA(1)==BEMOL||input.LA(1)==SUSTAIN ) {
                input.consume();
                adaptor.addChild(root_0, 
                (AmlTree)adaptor.create(set239)
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
    // src/parser/Music.g:218:1: notes_group : notes_type ( '.' FIGURE ( DOT )? )? ( TIE )? -> ^( NOTES notes_type ( FIGURE )? ( DOT )? ( TIE )? ) ;
    public final MusicParser.notes_group_return notes_group() throws RecognitionException {
        MusicParser.notes_group_return retval = new MusicParser.notes_group_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal241=null;
        Token FIGURE242=null;
        Token DOT243=null;
        Token TIE244=null;
        MusicParser.notes_type_return notes_type240 =null;


        AmlTree char_literal241_tree=null;
        AmlTree FIGURE242_tree=null;
        AmlTree DOT243_tree=null;
        AmlTree TIE244_tree=null;
        RewriteRuleTokenStream stream_TIE=new RewriteRuleTokenStream(adaptor,"token TIE");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_93=new RewriteRuleTokenStream(adaptor,"token 93");
        RewriteRuleTokenStream stream_FIGURE=new RewriteRuleTokenStream(adaptor,"token FIGURE");
        RewriteRuleSubtreeStream stream_notes_type=new RewriteRuleSubtreeStream(adaptor,"rule notes_type");
        try {
            // src/parser/Music.g:218:13: ( notes_type ( '.' FIGURE ( DOT )? )? ( TIE )? -> ^( NOTES notes_type ( FIGURE )? ( DOT )? ( TIE )? ) )
            // src/parser/Music.g:218:17: notes_type ( '.' FIGURE ( DOT )? )? ( TIE )?
            {
            pushFollow(FOLLOW_notes_type_in_notes_group2864);
            notes_type240=notes_type();

            state._fsp--;

            stream_notes_type.add(notes_type240.getTree());

            // src/parser/Music.g:218:28: ( '.' FIGURE ( DOT )? )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==93) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // src/parser/Music.g:218:29: '.' FIGURE ( DOT )?
                    {
                    char_literal241=(Token)match(input,93,FOLLOW_93_in_notes_group2867);  
                    stream_93.add(char_literal241);


                    FIGURE242=(Token)match(input,FIGURE,FOLLOW_FIGURE_in_notes_group2869);  
                    stream_FIGURE.add(FIGURE242);


                    // src/parser/Music.g:218:40: ( DOT )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==DOT) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // src/parser/Music.g:218:40: DOT
                            {
                            DOT243=(Token)match(input,DOT,FOLLOW_DOT_in_notes_group2871);  
                            stream_DOT.add(DOT243);


                            }
                            break;

                    }


                    }
                    break;

            }


            // src/parser/Music.g:218:47: ( TIE )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==TIE) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // src/parser/Music.g:218:47: TIE
                    {
                    TIE244=(Token)match(input,TIE,FOLLOW_TIE_in_notes_group2876);  
                    stream_TIE.add(TIE244);


                    }
                    break;

            }


            // AST REWRITE
            // elements: FIGURE, notes_type, DOT, TIE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AmlTree)adaptor.nil();
            // 218:52: -> ^( NOTES notes_type ( FIGURE )? ( DOT )? ( TIE )? )
            {
                // src/parser/Music.g:218:55: ^( NOTES notes_type ( FIGURE )? ( DOT )? ( TIE )? )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(NOTES, "NOTES")
                , root_1);

                adaptor.addChild(root_1, stream_notes_type.nextTree());

                // src/parser/Music.g:218:74: ( FIGURE )?
                if ( stream_FIGURE.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_FIGURE.nextNode()
                    );

                }
                stream_FIGURE.reset();

                // src/parser/Music.g:218:82: ( DOT )?
                if ( stream_DOT.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_DOT.nextNode()
                    );

                }
                stream_DOT.reset();

                // src/parser/Music.g:218:87: ( TIE )?
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


    public static class notes_variable_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "notes_variable"
    // src/parser/Music.g:221:1: notes_variable : notes_type ( '.' FIGURE ( DOT )? )? -> ^( NOTES notes_type ( FIGURE )? ( DOT )? ) ;
    public final MusicParser.notes_variable_return notes_variable() throws RecognitionException {
        MusicParser.notes_variable_return retval = new MusicParser.notes_variable_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal246=null;
        Token FIGURE247=null;
        Token DOT248=null;
        MusicParser.notes_type_return notes_type245 =null;


        AmlTree char_literal246_tree=null;
        AmlTree FIGURE247_tree=null;
        AmlTree DOT248_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_93=new RewriteRuleTokenStream(adaptor,"token 93");
        RewriteRuleTokenStream stream_FIGURE=new RewriteRuleTokenStream(adaptor,"token FIGURE");
        RewriteRuleSubtreeStream stream_notes_type=new RewriteRuleSubtreeStream(adaptor,"rule notes_type");
        try {
            // src/parser/Music.g:221:17: ( notes_type ( '.' FIGURE ( DOT )? )? -> ^( NOTES notes_type ( FIGURE )? ( DOT )? ) )
            // src/parser/Music.g:221:21: notes_type ( '.' FIGURE ( DOT )? )?
            {
            pushFollow(FOLLOW_notes_type_in_notes_variable2918);
            notes_type245=notes_type();

            state._fsp--;

            stream_notes_type.add(notes_type245.getTree());

            // src/parser/Music.g:221:32: ( '.' FIGURE ( DOT )? )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==93) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // src/parser/Music.g:221:33: '.' FIGURE ( DOT )?
                    {
                    char_literal246=(Token)match(input,93,FOLLOW_93_in_notes_variable2921);  
                    stream_93.add(char_literal246);


                    FIGURE247=(Token)match(input,FIGURE,FOLLOW_FIGURE_in_notes_variable2923);  
                    stream_FIGURE.add(FIGURE247);


                    // src/parser/Music.g:221:44: ( DOT )?
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==DOT) ) {
                        alt51=1;
                    }
                    switch (alt51) {
                        case 1 :
                            // src/parser/Music.g:221:44: DOT
                            {
                            DOT248=(Token)match(input,DOT,FOLLOW_DOT_in_notes_variable2925);  
                            stream_DOT.add(DOT248);


                            }
                            break;

                    }


                    }
                    break;

            }


            // AST REWRITE
            // elements: notes_type, DOT, FIGURE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AmlTree)adaptor.nil();
            // 221:51: -> ^( NOTES notes_type ( FIGURE )? ( DOT )? )
            {
                // src/parser/Music.g:221:54: ^( NOTES notes_type ( FIGURE )? ( DOT )? )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(NOTES, "NOTES")
                , root_1);

                adaptor.addChild(root_1, stream_notes_type.nextTree());

                // src/parser/Music.g:221:73: ( FIGURE )?
                if ( stream_FIGURE.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_FIGURE.nextNode()
                    );

                }
                stream_FIGURE.reset();

                // src/parser/Music.g:221:81: ( DOT )?
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
    // src/parser/Music.g:224:1: notes_type : ( chord | notes | drums );
    public final MusicParser.notes_type_return notes_type() throws RecognitionException {
        MusicParser.notes_type_return retval = new MusicParser.notes_type_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        MusicParser.chord_return chord249 =null;

        MusicParser.notes_return notes250 =null;

        MusicParser.drums_return drums251 =null;



        try {
            // src/parser/Music.g:224:13: ( chord | notes | drums )
            int alt53=3;
            switch ( input.LA(1) ) {
            case CHORD:
                {
                alt53=1;
                }
                break;
            case ARMOR:
            case BEMOL:
            case NOTE:
            case SUSTAIN:
            case 90:
                {
                alt53=2;
                }
                break;
            case DRUMS:
                {
                alt53=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;

            }

            switch (alt53) {
                case 1 :
                    // src/parser/Music.g:224:15: chord
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_chord_in_notes_type2968);
                    chord249=chord();

                    state._fsp--;

                    adaptor.addChild(root_0, chord249.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:224:23: notes
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_notes_in_notes_type2972);
                    notes250=notes();

                    state._fsp--;

                    adaptor.addChild(root_0, notes250.getTree());

                    }
                    break;
                case 3 :
                    // src/parser/Music.g:224:31: drums
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_drums_in_notes_type2976);
                    drums251=drums();

                    state._fsp--;

                    adaptor.addChild(root_0, drums251.getTree());

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
    // src/parser/Music.g:227:1: chord : CHORD ^ '(' ! note ( MINOR | PLUS | DIMINUTION )? ( SEVENTH | MAJ7 )? ')' !;
    public final MusicParser.chord_return chord() throws RecognitionException {
        MusicParser.chord_return retval = new MusicParser.chord_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token CHORD252=null;
        Token char_literal253=null;
        Token set255=null;
        Token set256=null;
        Token char_literal257=null;
        MusicParser.note_return note254 =null;


        AmlTree CHORD252_tree=null;
        AmlTree char_literal253_tree=null;
        AmlTree set255_tree=null;
        AmlTree set256_tree=null;
        AmlTree char_literal257_tree=null;

        try {
            // src/parser/Music.g:227:13: ( CHORD ^ '(' ! note ( MINOR | PLUS | DIMINUTION )? ( SEVENTH | MAJ7 )? ')' !)
            // src/parser/Music.g:227:17: CHORD ^ '(' ! note ( MINOR | PLUS | DIMINUTION )? ( SEVENTH | MAJ7 )? ')' !
            {
            root_0 = (AmlTree)adaptor.nil();


            CHORD252=(Token)match(input,CHORD,FOLLOW_CHORD_in_chord3005); 
            CHORD252_tree = 
            (AmlTree)adaptor.create(CHORD252)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(CHORD252_tree, root_0);


            char_literal253=(Token)match(input,90,FOLLOW_90_in_chord3008); 

            pushFollow(FOLLOW_note_in_chord3011);
            note254=note();

            state._fsp--;

            adaptor.addChild(root_0, note254.getTree());

            // src/parser/Music.g:227:34: ( MINOR | PLUS | DIMINUTION )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==DIMINUTION||LA54_0==MINOR||LA54_0==PLUS) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // src/parser/Music.g:
                    {
                    set255=(Token)input.LT(1);

                    if ( input.LA(1)==DIMINUTION||input.LA(1)==MINOR||input.LA(1)==PLUS ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (AmlTree)adaptor.create(set255)
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


            // src/parser/Music.g:227:59: ( SEVENTH | MAJ7 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==MAJ7||LA55_0==SEVENTH) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // src/parser/Music.g:
                    {
                    set256=(Token)input.LT(1);

                    if ( input.LA(1)==MAJ7||input.LA(1)==SEVENTH ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (AmlTree)adaptor.create(set256)
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


            char_literal257=(Token)match(input,91,FOLLOW_91_in_chord3031); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:230:1: notes : ( '(' ( note )+ ')' | note ) -> ^( NOTE_LIST ( note )+ ) ;
    public final MusicParser.notes_return notes() throws RecognitionException {
        MusicParser.notes_return retval = new MusicParser.notes_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal258=null;
        Token char_literal260=null;
        MusicParser.note_return note259 =null;

        MusicParser.note_return note261 =null;


        AmlTree char_literal258_tree=null;
        AmlTree char_literal260_tree=null;
        RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
        RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
        RewriteRuleSubtreeStream stream_note=new RewriteRuleSubtreeStream(adaptor,"rule note");
        try {
            // src/parser/Music.g:230:13: ( ( '(' ( note )+ ')' | note ) -> ^( NOTE_LIST ( note )+ ) )
            // src/parser/Music.g:230:17: ( '(' ( note )+ ')' | note )
            {
            // src/parser/Music.g:230:17: ( '(' ( note )+ ')' | note )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==90) ) {
                alt57=1;
            }
            else if ( (LA57_0==ARMOR||LA57_0==BEMOL||LA57_0==NOTE||LA57_0==SUSTAIN) ) {
                alt57=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;

            }
            switch (alt57) {
                case 1 :
                    // src/parser/Music.g:230:19: '(' ( note )+ ')'
                    {
                    char_literal258=(Token)match(input,90,FOLLOW_90_in_notes3063);  
                    stream_90.add(char_literal258);


                    // src/parser/Music.g:230:23: ( note )+
                    int cnt56=0;
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==ARMOR||LA56_0==BEMOL||LA56_0==NOTE||LA56_0==SUSTAIN) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // src/parser/Music.g:230:24: note
                    	    {
                    	    pushFollow(FOLLOW_note_in_notes3066);
                    	    note259=note();

                    	    state._fsp--;

                    	    stream_note.add(note259.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt56 >= 1 ) break loop56;
                                EarlyExitException eee =
                                    new EarlyExitException(56, input);
                                throw eee;
                        }
                        cnt56++;
                    } while (true);


                    char_literal260=(Token)match(input,91,FOLLOW_91_in_notes3070);  
                    stream_91.add(char_literal260);


                    }
                    break;
                case 2 :
                    // src/parser/Music.g:230:38: note
                    {
                    pushFollow(FOLLOW_note_in_notes3075);
                    note261=note();

                    state._fsp--;

                    stream_note.add(note261.getTree());

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
            // 230:44: -> ^( NOTE_LIST ( note )+ )
            {
                // src/parser/Music.g:230:47: ^( NOTE_LIST ( note )+ )
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


    public static class drums_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "drums"
    // src/parser/Music.g:233:1: drums : DRUMS ^ '(' ! num_expr ')' !;
    public final MusicParser.drums_return drums() throws RecognitionException {
        MusicParser.drums_return retval = new MusicParser.drums_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token DRUMS262=null;
        Token char_literal263=null;
        Token char_literal265=null;
        MusicParser.num_expr_return num_expr264 =null;


        AmlTree DRUMS262_tree=null;
        AmlTree char_literal263_tree=null;
        AmlTree char_literal265_tree=null;

        try {
            // src/parser/Music.g:233:13: ( DRUMS ^ '(' ! num_expr ')' !)
            // src/parser/Music.g:233:17: DRUMS ^ '(' ! num_expr ')' !
            {
            root_0 = (AmlTree)adaptor.nil();


            DRUMS262=(Token)match(input,DRUMS,FOLLOW_DRUMS_in_drums3114); 
            DRUMS262_tree = 
            (AmlTree)adaptor.create(DRUMS262)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(DRUMS262_tree, root_0);


            char_literal263=(Token)match(input,90,FOLLOW_90_in_drums3117); 

            pushFollow(FOLLOW_num_expr_in_drums3120);
            num_expr264=num_expr();

            state._fsp--;

            adaptor.addChild(root_0, num_expr264.getTree());

            char_literal265=(Token)match(input,91,FOLLOW_91_in_drums3122); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:236:1: note : ( BEMOL | SUSTAIN | ARMOR )? NOTE ^ ( NUM )? ;
    public final MusicParser.note_return note() throws RecognitionException {
        MusicParser.note_return retval = new MusicParser.note_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token set266=null;
        Token NOTE267=null;
        Token NUM268=null;

        AmlTree set266_tree=null;
        AmlTree NOTE267_tree=null;
        AmlTree NUM268_tree=null;

        try {
            // src/parser/Music.g:236:13: ( ( BEMOL | SUSTAIN | ARMOR )? NOTE ^ ( NUM )? )
            // src/parser/Music.g:236:17: ( BEMOL | SUSTAIN | ARMOR )? NOTE ^ ( NUM )?
            {
            root_0 = (AmlTree)adaptor.nil();


            // src/parser/Music.g:236:17: ( BEMOL | SUSTAIN | ARMOR )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==ARMOR||LA58_0==BEMOL||LA58_0==SUSTAIN) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // src/parser/Music.g:
                    {
                    set266=(Token)input.LT(1);

                    if ( input.LA(1)==ARMOR||input.LA(1)==BEMOL||input.LA(1)==SUSTAIN ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (AmlTree)adaptor.create(set266)
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


            NOTE267=(Token)match(input,NOTE,FOLLOW_NOTE_in_note3166); 
            NOTE267_tree = 
            (AmlTree)adaptor.create(NOTE267)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(NOTE267_tree, root_0);


            // src/parser/Music.g:236:50: ( NUM )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==NUM) ) {
                int LA59_1 = input.LA(2);

                if ( (LA59_1==LETTER_X) ) {
                    int LA59_3 = input.LA(3);

                    if ( (LA59_3==ASSIG||LA59_3==DECR||LA59_3==DIVIDE_ASSIG||LA59_3==INCR||LA59_3==MINUS_ASSIG||LA59_3==MOD_ASSIG||LA59_3==PLUS_ASSIG||LA59_3==PROD_ASSIG||LA59_3==90||LA59_3==93) ) {
                        alt59=1;
                    }
                }
                else if ( (LA59_1==ARMOR||(LA59_1 >= BAR && LA59_1 <= BOOL)||LA59_1==CHORD||(LA59_1 >= DECR && LA59_1 <= DIMINUTION)||(LA59_1 >= DOUBLE_BAR && LA59_1 <= DRUMS_NOTE_TYPE)||LA59_1==END_REPETITION||LA59_1==FOR||(LA59_1 >= ID_ && LA59_1 <= INT)||(LA59_1 >= MAJ7 && LA59_1 <= MINOR)||LA59_1==NOTE||LA59_1==NOTE_TYPE||LA59_1==NUM||LA59_1==PLUS||(LA59_1 >= SEVENTH && LA59_1 <= START_REPETITION)||(LA59_1 >= STRING_TYPE && LA59_1 <= TONE)||LA59_1==WHILE||(LA59_1 >= 90 && LA59_1 <= 93)||LA59_1==95||LA59_1==97) ) {
                    alt59=1;
                }
            }
            switch (alt59) {
                case 1 :
                    // src/parser/Music.g:236:51: NUM
                    {
                    NUM268=(Token)match(input,NUM,FOLLOW_NUM_in_note3170); 
                    NUM268_tree = 
                    (AmlTree)adaptor.create(NUM268)
                    ;
                    adaptor.addChild(root_0, NUM268_tree);


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
    // src/parser/Music.g:240:1: expr : boolterm ( OR ^ boolterm )* ;
    public final MusicParser.expr_return expr() throws RecognitionException {
        MusicParser.expr_return retval = new MusicParser.expr_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token OR270=null;
        MusicParser.boolterm_return boolterm269 =null;

        MusicParser.boolterm_return boolterm271 =null;


        AmlTree OR270_tree=null;

        try {
            // src/parser/Music.g:240:9: ( boolterm ( OR ^ boolterm )* )
            // src/parser/Music.g:240:13: boolterm ( OR ^ boolterm )*
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_boolterm_in_expr3199);
            boolterm269=boolterm();

            state._fsp--;

            adaptor.addChild(root_0, boolterm269.getTree());

            // src/parser/Music.g:240:22: ( OR ^ boolterm )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==OR) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // src/parser/Music.g:240:23: OR ^ boolterm
            	    {
            	    OR270=(Token)match(input,OR,FOLLOW_OR_in_expr3202); 
            	    OR270_tree = 
            	    (AmlTree)adaptor.create(OR270)
            	    ;
            	    root_0 = (AmlTree)adaptor.becomeRoot(OR270_tree, root_0);


            	    pushFollow(FOLLOW_boolterm_in_expr3205);
            	    boolterm271=boolterm();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolterm271.getTree());

            	    }
            	    break;

            	default :
            	    break loop60;
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
    // src/parser/Music.g:243:1: boolterm : boolfact ( AND ^ boolfact )* ;
    public final MusicParser.boolterm_return boolterm() throws RecognitionException {
        MusicParser.boolterm_return retval = new MusicParser.boolterm_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token AND273=null;
        MusicParser.boolfact_return boolfact272 =null;

        MusicParser.boolfact_return boolfact274 =null;


        AmlTree AND273_tree=null;

        try {
            // src/parser/Music.g:243:13: ( boolfact ( AND ^ boolfact )* )
            // src/parser/Music.g:243:17: boolfact ( AND ^ boolfact )*
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_boolfact_in_boolterm3223);
            boolfact272=boolfact();

            state._fsp--;

            adaptor.addChild(root_0, boolfact272.getTree());

            // src/parser/Music.g:243:26: ( AND ^ boolfact )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==AND) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // src/parser/Music.g:243:27: AND ^ boolfact
            	    {
            	    AND273=(Token)match(input,AND,FOLLOW_AND_in_boolterm3226); 
            	    AND273_tree = 
            	    (AmlTree)adaptor.create(AND273)
            	    ;
            	    root_0 = (AmlTree)adaptor.becomeRoot(AND273_tree, root_0);


            	    pushFollow(FOLLOW_boolfact_in_boolterm3229);
            	    boolfact274=boolfact();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolfact274.getTree());

            	    }
            	    break;

            	default :
            	    break loop61;
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
    // src/parser/Music.g:246:1: boolfact : num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? ;
    public final MusicParser.boolfact_return boolfact() throws RecognitionException {
        MusicParser.boolfact_return retval = new MusicParser.boolfact_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token EQUAL276=null;
        Token NOT_EQUAL277=null;
        Token LT278=null;
        Token LE279=null;
        Token GT280=null;
        Token GE281=null;
        MusicParser.num_expr_return num_expr275 =null;

        MusicParser.num_expr_return num_expr282 =null;


        AmlTree EQUAL276_tree=null;
        AmlTree NOT_EQUAL277_tree=null;
        AmlTree LT278_tree=null;
        AmlTree LE279_tree=null;
        AmlTree GT280_tree=null;
        AmlTree GE281_tree=null;

        try {
            // src/parser/Music.g:246:13: ( num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? )
            // src/parser/Music.g:246:17: num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_num_expr_in_boolfact3251);
            num_expr275=num_expr();

            state._fsp--;

            adaptor.addChild(root_0, num_expr275.getTree());

            // src/parser/Music.g:246:26: ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==EQUAL||(LA63_0 >= GE && LA63_0 <= GT)||LA63_0==LE||LA63_0==LT||LA63_0==NOT_EQUAL) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // src/parser/Music.g:246:27: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr
                    {
                    // src/parser/Music.g:246:27: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^)
                    int alt62=6;
                    switch ( input.LA(1) ) {
                    case EQUAL:
                        {
                        alt62=1;
                        }
                        break;
                    case NOT_EQUAL:
                        {
                        alt62=2;
                        }
                        break;
                    case LT:
                        {
                        alt62=3;
                        }
                        break;
                    case LE:
                        {
                        alt62=4;
                        }
                        break;
                    case GT:
                        {
                        alt62=5;
                        }
                        break;
                    case GE:
                        {
                        alt62=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 62, 0, input);

                        throw nvae;

                    }

                    switch (alt62) {
                        case 1 :
                            // src/parser/Music.g:246:28: EQUAL ^
                            {
                            EQUAL276=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_boolfact3255); 
                            EQUAL276_tree = 
                            (AmlTree)adaptor.create(EQUAL276)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(EQUAL276_tree, root_0);


                            }
                            break;
                        case 2 :
                            // src/parser/Music.g:246:37: NOT_EQUAL ^
                            {
                            NOT_EQUAL277=(Token)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_boolfact3260); 
                            NOT_EQUAL277_tree = 
                            (AmlTree)adaptor.create(NOT_EQUAL277)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(NOT_EQUAL277_tree, root_0);


                            }
                            break;
                        case 3 :
                            // src/parser/Music.g:246:50: LT ^
                            {
                            LT278=(Token)match(input,LT,FOLLOW_LT_in_boolfact3265); 
                            LT278_tree = 
                            (AmlTree)adaptor.create(LT278)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(LT278_tree, root_0);


                            }
                            break;
                        case 4 :
                            // src/parser/Music.g:246:56: LE ^
                            {
                            LE279=(Token)match(input,LE,FOLLOW_LE_in_boolfact3270); 
                            LE279_tree = 
                            (AmlTree)adaptor.create(LE279)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(LE279_tree, root_0);


                            }
                            break;
                        case 5 :
                            // src/parser/Music.g:246:62: GT ^
                            {
                            GT280=(Token)match(input,GT,FOLLOW_GT_in_boolfact3275); 
                            GT280_tree = 
                            (AmlTree)adaptor.create(GT280)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(GT280_tree, root_0);


                            }
                            break;
                        case 6 :
                            // src/parser/Music.g:246:68: GE ^
                            {
                            GE281=(Token)match(input,GE,FOLLOW_GE_in_boolfact3280); 
                            GE281_tree = 
                            (AmlTree)adaptor.create(GE281)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(GE281_tree, root_0);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_num_expr_in_boolfact3284);
                    num_expr282=num_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, num_expr282.getTree());

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
    // src/parser/Music.g:249:1: num_expr : term ( ( PLUS ^| MINUS ^) term )* ;
    public final MusicParser.num_expr_return num_expr() throws RecognitionException {
        MusicParser.num_expr_return retval = new MusicParser.num_expr_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token PLUS284=null;
        Token MINUS285=null;
        MusicParser.term_return term283 =null;

        MusicParser.term_return term286 =null;


        AmlTree PLUS284_tree=null;
        AmlTree MINUS285_tree=null;

        try {
            // src/parser/Music.g:249:13: ( term ( ( PLUS ^| MINUS ^) term )* )
            // src/parser/Music.g:249:17: term ( ( PLUS ^| MINUS ^) term )*
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_term_in_num_expr3306);
            term283=term();

            state._fsp--;

            adaptor.addChild(root_0, term283.getTree());

            // src/parser/Music.g:249:22: ( ( PLUS ^| MINUS ^) term )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==MINUS||LA65_0==PLUS) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // src/parser/Music.g:249:24: ( PLUS ^| MINUS ^) term
            	    {
            	    // src/parser/Music.g:249:24: ( PLUS ^| MINUS ^)
            	    int alt64=2;
            	    int LA64_0 = input.LA(1);

            	    if ( (LA64_0==PLUS) ) {
            	        alt64=1;
            	    }
            	    else if ( (LA64_0==MINUS) ) {
            	        alt64=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 64, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt64) {
            	        case 1 :
            	            // src/parser/Music.g:249:25: PLUS ^
            	            {
            	            PLUS284=(Token)match(input,PLUS,FOLLOW_PLUS_in_num_expr3311); 
            	            PLUS284_tree = 
            	            (AmlTree)adaptor.create(PLUS284)
            	            ;
            	            root_0 = (AmlTree)adaptor.becomeRoot(PLUS284_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // src/parser/Music.g:249:33: MINUS ^
            	            {
            	            MINUS285=(Token)match(input,MINUS,FOLLOW_MINUS_in_num_expr3316); 
            	            MINUS285_tree = 
            	            (AmlTree)adaptor.create(MINUS285)
            	            ;
            	            root_0 = (AmlTree)adaptor.becomeRoot(MINUS285_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_term_in_num_expr3320);
            	    term286=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term286.getTree());

            	    }
            	    break;

            	default :
            	    break loop65;
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
    // src/parser/Music.g:252:1: term : factor ( ( DOT ^| DIV ^| MOD ^) factor )* ;
    public final MusicParser.term_return term() throws RecognitionException {
        MusicParser.term_return retval = new MusicParser.term_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token DOT288=null;
        Token DIV289=null;
        Token MOD290=null;
        MusicParser.factor_return factor287 =null;

        MusicParser.factor_return factor291 =null;


        AmlTree DOT288_tree=null;
        AmlTree DIV289_tree=null;
        AmlTree MOD290_tree=null;

        try {
            // src/parser/Music.g:252:9: ( factor ( ( DOT ^| DIV ^| MOD ^) factor )* )
            // src/parser/Music.g:252:13: factor ( ( DOT ^| DIV ^| MOD ^) factor )*
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term3342);
            factor287=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor287.getTree());

            // src/parser/Music.g:252:20: ( ( DOT ^| DIV ^| MOD ^) factor )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==DIV||LA67_0==DOT||LA67_0==MOD) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // src/parser/Music.g:252:22: ( DOT ^| DIV ^| MOD ^) factor
            	    {
            	    // src/parser/Music.g:252:22: ( DOT ^| DIV ^| MOD ^)
            	    int alt66=3;
            	    switch ( input.LA(1) ) {
            	    case DOT:
            	        {
            	        alt66=1;
            	        }
            	        break;
            	    case DIV:
            	        {
            	        alt66=2;
            	        }
            	        break;
            	    case MOD:
            	        {
            	        alt66=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 66, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt66) {
            	        case 1 :
            	            // src/parser/Music.g:252:23: DOT ^
            	            {
            	            DOT288=(Token)match(input,DOT,FOLLOW_DOT_in_term3347); 
            	            DOT288_tree = 
            	            (AmlTree)adaptor.create(DOT288)
            	            ;
            	            root_0 = (AmlTree)adaptor.becomeRoot(DOT288_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // src/parser/Music.g:252:30: DIV ^
            	            {
            	            DIV289=(Token)match(input,DIV,FOLLOW_DIV_in_term3352); 
            	            DIV289_tree = 
            	            (AmlTree)adaptor.create(DIV289)
            	            ;
            	            root_0 = (AmlTree)adaptor.becomeRoot(DIV289_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // src/parser/Music.g:252:37: MOD ^
            	            {
            	            MOD290=(Token)match(input,MOD,FOLLOW_MOD_in_term3357); 
            	            MOD290_tree = 
            	            (AmlTree)adaptor.create(MOD290)
            	            ;
            	            root_0 = (AmlTree)adaptor.becomeRoot(MOD290_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_factor_in_term3361);
            	    factor291=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor291.getTree());

            	    }
            	    break;

            	default :
            	    break loop67;
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
    // src/parser/Music.g:255:1: factor : ( NOT ^| PLUS ^| MINUS ^)? atom ;
    public final MusicParser.factor_return factor() throws RecognitionException {
        MusicParser.factor_return retval = new MusicParser.factor_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token NOT292=null;
        Token PLUS293=null;
        Token MINUS294=null;
        MusicParser.atom_return atom295 =null;


        AmlTree NOT292_tree=null;
        AmlTree PLUS293_tree=null;
        AmlTree MINUS294_tree=null;

        try {
            // src/parser/Music.g:255:9: ( ( NOT ^| PLUS ^| MINUS ^)? atom )
            // src/parser/Music.g:255:13: ( NOT ^| PLUS ^| MINUS ^)? atom
            {
            root_0 = (AmlTree)adaptor.nil();


            // src/parser/Music.g:255:13: ( NOT ^| PLUS ^| MINUS ^)?
            int alt68=4;
            switch ( input.LA(1) ) {
                case NOT:
                    {
                    alt68=1;
                    }
                    break;
                case PLUS:
                    {
                    alt68=2;
                    }
                    break;
                case MINUS:
                    {
                    alt68=3;
                    }
                    break;
            }

            switch (alt68) {
                case 1 :
                    // src/parser/Music.g:255:14: NOT ^
                    {
                    NOT292=(Token)match(input,NOT,FOLLOW_NOT_in_factor3378); 
                    NOT292_tree = 
                    (AmlTree)adaptor.create(NOT292)
                    ;
                    root_0 = (AmlTree)adaptor.becomeRoot(NOT292_tree, root_0);


                    }
                    break;
                case 2 :
                    // src/parser/Music.g:255:21: PLUS ^
                    {
                    PLUS293=(Token)match(input,PLUS,FOLLOW_PLUS_in_factor3383); 
                    PLUS293_tree = 
                    (AmlTree)adaptor.create(PLUS293)
                    ;
                    root_0 = (AmlTree)adaptor.becomeRoot(PLUS293_tree, root_0);


                    }
                    break;
                case 3 :
                    // src/parser/Music.g:255:29: MINUS ^
                    {
                    MINUS294=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor3388); 
                    MINUS294_tree = 
                    (AmlTree)adaptor.create(MINUS294)
                    ;
                    root_0 = (AmlTree)adaptor.becomeRoot(MINUS294_tree, root_0);


                    }
                    break;

            }


            pushFollow(FOLLOW_atom_in_factor3393);
            atom295=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom295.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:258:1: atom : ( var_access | NUM | STRING | funcall | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | '(' ! expr ')' !);
    public final MusicParser.atom_return atom() throws RecognitionException {
        MusicParser.atom_return retval = new MusicParser.atom_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token b=null;
        Token NUM297=null;
        Token STRING298=null;
        Token char_literal300=null;
        Token char_literal302=null;
        MusicParser.var_access_return var_access296 =null;

        MusicParser.funcall_return funcall299 =null;

        MusicParser.expr_return expr301 =null;


        AmlTree b_tree=null;
        AmlTree NUM297_tree=null;
        AmlTree STRING298_tree=null;
        AmlTree char_literal300_tree=null;
        AmlTree char_literal302_tree=null;
        RewriteRuleTokenStream stream_TRUE=new RewriteRuleTokenStream(adaptor,"token TRUE");
        RewriteRuleTokenStream stream_FALSE=new RewriteRuleTokenStream(adaptor,"token FALSE");

        try {
            // src/parser/Music.g:258:9: ( var_access | NUM | STRING | funcall | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | '(' ! expr ')' !)
            int alt70=6;
            switch ( input.LA(1) ) {
            case ID_:
                {
                int LA70_1 = input.LA(2);

                if ( (LA70_1==AND||LA70_1==DIV||LA70_1==DOT||LA70_1==EQUAL||(LA70_1 >= GE && LA70_1 <= GT)||LA70_1==LE||LA70_1==LT||LA70_1==MINUS||LA70_1==MOD||LA70_1==NOT_EQUAL||(LA70_1 >= OR && LA70_1 <= PLUS)||(LA70_1 >= 91 && LA70_1 <= 93)||LA70_1==95) ) {
                    alt70=1;
                }
                else if ( (LA70_1==90) ) {
                    alt70=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 70, 1, input);

                    throw nvae;

                }
                }
                break;
            case LETTER_X:
                {
                int LA70_2 = input.LA(2);

                if ( (LA70_2==AND||LA70_2==DIV||LA70_2==DOT||LA70_2==EQUAL||(LA70_2 >= GE && LA70_2 <= GT)||LA70_2==LE||LA70_2==LT||LA70_2==MINUS||LA70_2==MOD||LA70_2==NOT_EQUAL||(LA70_2 >= OR && LA70_2 <= PLUS)||(LA70_2 >= 91 && LA70_2 <= 93)||LA70_2==95) ) {
                    alt70=1;
                }
                else if ( (LA70_2==90) ) {
                    alt70=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 70, 2, input);

                    throw nvae;

                }
                }
                break;
            case NUM:
                {
                alt70=2;
                }
                break;
            case STRING:
                {
                alt70=3;
                }
                break;
            case FALSE:
            case TRUE:
                {
                alt70=5;
                }
                break;
            case 90:
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
                    // src/parser/Music.g:258:13: var_access
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_var_access_in_atom3409);
                    var_access296=var_access();

                    state._fsp--;

                    adaptor.addChild(root_0, var_access296.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:259:7: NUM
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    NUM297=(Token)match(input,NUM,FOLLOW_NUM_in_atom3417); 
                    NUM297_tree = 
                    (AmlTree)adaptor.create(NUM297)
                    ;
                    adaptor.addChild(root_0, NUM297_tree);


                    }
                    break;
                case 3 :
                    // src/parser/Music.g:260:7: STRING
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    STRING298=(Token)match(input,STRING,FOLLOW_STRING_in_atom3425); 
                    STRING298_tree = 
                    (AmlTree)adaptor.create(STRING298)
                    ;
                    adaptor.addChild(root_0, STRING298_tree);


                    }
                    break;
                case 4 :
                    // src/parser/Music.g:261:7: funcall
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_atom3433);
                    funcall299=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall299.getTree());

                    }
                    break;
                case 5 :
                    // src/parser/Music.g:262:7: (b= TRUE |b= FALSE )
                    {
                    // src/parser/Music.g:262:7: (b= TRUE |b= FALSE )
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==TRUE) ) {
                        alt69=1;
                    }
                    else if ( (LA69_0==FALSE) ) {
                        alt69=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 69, 0, input);

                        throw nvae;

                    }
                    switch (alt69) {
                        case 1 :
                            // src/parser/Music.g:262:8: b= TRUE
                            {
                            b=(Token)match(input,TRUE,FOLLOW_TRUE_in_atom3444);  
                            stream_TRUE.add(b);


                            }
                            break;
                        case 2 :
                            // src/parser/Music.g:262:17: b= FALSE
                            {
                            b=(Token)match(input,FALSE,FOLLOW_FALSE_in_atom3450);  
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
                    // 262:27: -> ^( BOOLEAN[$b,$b.text] )
                    {
                        // src/parser/Music.g:262:30: ^( BOOLEAN[$b,$b.text] )
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
                    // src/parser/Music.g:263:7: '(' ! expr ')' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    char_literal300=(Token)match(input,90,FOLLOW_90_in_atom3467); 

                    pushFollow(FOLLOW_expr_in_atom3470);
                    expr301=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr301.getTree());

                    char_literal302=(Token)match(input,91,FOLLOW_91_in_atom3472); 

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


 

    public static final BitSet FOLLOW_global_stmt_in_prog193 = new BitSet(new long[]{0x8000100401002800L,0x0000000000808800L});
    public static final BitSet FOLLOW_EOF_in_prog197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_global_stmt229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_frag_in_global_stmt247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_song_in_global_stmt265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_rule_in_var_funcall290 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_var_funcall292 = new BitSet(new long[]{0x0000410000000000L});
    public static final BitSet FOLLOW_id_rule_in_var_funcall296 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_var_funcall298 = new BitSet(new long[]{0x1880410080802420L,0x000000000C21400AL});
    public static final BitSet FOLLOW_params_in_var_funcall300 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_var_funcall303 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_var_funcall305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_rule_in_var_access346 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_var_access349 = new BitSet(new long[]{0x0000410000000000L});
    public static final BitSet FOLLOW_id_rule_in_var_access353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_rule_in_var_access382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID__in_id_rule412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LETTER_X_in_id_rule420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_void_in_function453 = new BitSet(new long[]{0x0000410000000000L});
    public static final BitSet FOLLOW_id_rule_in_function457 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_function459 = new BitSet(new long[]{0x8000100001002800L,0x0000000008008000L});
    public static final BitSet FOLLOW_list_arguments_in_function461 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_function463 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_function465 = new BitSet(new long[]{0x80005F0201422A00L,0x000000000104BA02L});
    public static final BitSet FOLLOW_listInst_in_function467 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_function469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_rule_in_funcall516 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_funcall518 = new BitSet(new long[]{0x1880410080802420L,0x000000000C21400AL});
    public static final BitSet FOLLOW_params_in_funcall520 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_funcall523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FRAGMENT_in_frag557 = new BitSet(new long[]{0x0000410000000000L});
    public static final BitSet FOLLOW_id_rule_in_frag560 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_frag562 = new BitSet(new long[]{0x8000100001002800L,0x0000000008008000L});
    public static final BitSet FOLLOW_list_arguments_in_frag565 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_frag567 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_frag570 = new BitSet(new long[]{0x90005F0201822E20L,0x0000000005059800L});
    public static final BitSet FOLLOW_list_music_inst_in_frag573 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_frag575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_argument_in_list_arguments595 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_list_arguments598 = new BitSet(new long[]{0x8000100001002800L,0x0000000000008000L});
    public static final BitSet FOLLOW_argument_in_list_arguments600 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_type_in_argument641 = new BitSet(new long[]{0x0000410000000000L});
    public static final BitSet FOLLOW_id_rule_in_argument644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_params671 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_notes_variable_in_params675 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_params679 = new BitSet(new long[]{0x1880410080802420L,0x000000000421400AL});
    public static final BitSet FOLLOW_expr_in_params683 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_notes_variable_in_params687 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_inst_in_listInst715 = new BitSet(new long[]{0x80005F0201422A02L,0x000000000104BA02L});
    public static final BitSet FOLLOW_music_inst_in_list_music_inst749 = new BitSet(new long[]{0x90005F0201822E22L,0x0000000005059800L});
    public static final BitSet FOLLOW_declaration_in_inst793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_inst811 = new BitSet(new long[]{0x1880410080802420L,0x000000000421400AL});
    public static final BitSet FOLLOW_expr_in_inst815 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_notes_group_in_inst819 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_inst822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_funcall_in_inst841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tone_in_inst859 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_inst861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_beat_in_inst880 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_inst882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_speed_in_inst901 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_inst903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instrument_in_inst922 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_inst924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignation_in_inst943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_stmt_in_inst961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_inst979 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_inst981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_stmt_in_inst1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_stmt_in_inst1018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_song_in_inst1036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compas_list_in_inst1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_music_inst1078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tone_in_music_inst1096 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_music_inst1098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_beat_in_music_inst1117 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_music_inst1119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_speed_in_music_inst1138 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_music_inst1140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instrument_in_music_inst1159 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_music_inst1161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_funcall_in_music_inst1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignation_in_music_inst1198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_music_stmt_in_music_inst1216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_music_inst1234 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_music_inst1236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_music_stmt_in_music_inst1255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_music_stmt_in_music_inst1273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_song_in_music_inst1291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notes_group_in_music_inst1318 = new BitSet(new long[]{0x1000000000802422L,0x0000000084010000L});
    public static final BitSet FOLLOW_95_in_music_inst1322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_declaration1347 = new BitSet(new long[]{0x0000410000000000L});
    public static final BitSet FOLLOW_assig_opt_in_declaration1350 = new BitSet(new long[]{0x0000000000000000L,0x0000000090000000L});
    public static final BitSet FOLLOW_92_in_declaration1353 = new BitSet(new long[]{0x0000410000000000L});
    public static final BitSet FOLLOW_assig_opt_in_declaration1356 = new BitSet(new long[]{0x0000000000000000L,0x0000000090000000L});
    public static final BitSet FOLLOW_95_in_declaration1360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_type_void1506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOID_in_type_void1524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_rule_in_assig_opt1549 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ASSIG_in_assig_opt1552 = new BitSet(new long[]{0x1880410080802420L,0x000000000421400AL});
    public static final BitSet FOLLOW_expr_in_assig_opt1556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notes_variable_in_assig_opt1560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assig_in_assignation1586 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_assignation1588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_access_in_assig1618 = new BitSet(new long[]{0x0500000000100040L,0x0000000000000090L});
    public static final BitSet FOLLOW_set_in_assig1620 = new BitSet(new long[]{0x1880410180802420L,0x000000000421400AL});
    public static final BitSet FOLLOW_expr_in_assig1636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notes_variable_in_assig1640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIGURE_in_assig1644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_post_in_assig1663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pre_in_assig1681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_access_in_post1711 = new BitSet(new long[]{0x0000040000020000L});
    public static final BitSet FOLLOW_INCR_in_post1716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECR_in_post1722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INCR_in_pre1769 = new BitSet(new long[]{0x0000410000000000L});
    public static final BitSet FOLLOW_DECR_in_pre1775 = new BitSet(new long[]{0x0000410000000000L});
    public static final BitSet FOLLOW_var_access_in_pre1778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BEAT_in_beat1821 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_NUM_in_beat1824 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_beat1826 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_NUM_in_beat1829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SPEED_in_speed1858 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_NUM_in_speed1861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRANSPORT_in_transport1886 = new BitSet(new long[]{0x0880410080000000L,0x000000000420400AL});
    public static final BitSet FOLLOW_expr_in_transport1889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUMENT_in_instrument1913 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_STRING_in_instrument1916 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_instrument1918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_stmt1942 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_while_stmt1945 = new BitSet(new long[]{0x0880410080000000L,0x000000000420400AL});
    public static final BitSet FOLLOW_expr_in_while_stmt1948 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_while_stmt1950 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_while_stmt1953 = new BitSet(new long[]{0x80005F0201422A00L,0x000000000104BA02L});
    public static final BitSet FOLLOW_listInst_in_while_stmt1956 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_while_stmt1958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_music_stmt1985 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_while_music_stmt1988 = new BitSet(new long[]{0x0880410080000000L,0x000000000420400AL});
    public static final BitSet FOLLOW_expr_in_while_music_stmt1991 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_while_music_stmt1993 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_while_music_stmt1996 = new BitSet(new long[]{0x90005F0201822E20L,0x0000000005059800L});
    public static final BitSet FOLLOW_list_music_inst_in_while_music_stmt1999 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_while_music_stmt2001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_for_stmt2036 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_for_stmt2039 = new BitSet(new long[]{0x8000550001022800L,0x0000000000008000L});
    public static final BitSet FOLLOW_declaration_in_for_stmt2043 = new BitSet(new long[]{0x0880410080000000L,0x000000000420400AL});
    public static final BitSet FOLLOW_list_assig_in_for_stmt2047 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_for_stmt2049 = new BitSet(new long[]{0x0880410080000000L,0x000000000420400AL});
    public static final BitSet FOLLOW_expr_in_for_stmt2053 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_for_stmt2055 = new BitSet(new long[]{0x0000450000020000L});
    public static final BitSet FOLLOW_list_assig_in_for_stmt2058 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_for_stmt2060 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_for_stmt2063 = new BitSet(new long[]{0x80005F0201422A00L,0x000000000104BA02L});
    public static final BitSet FOLLOW_listInst_in_for_stmt2066 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_for_stmt2068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_for_music_stmt2093 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_for_music_stmt2096 = new BitSet(new long[]{0x8000550001022800L,0x0000000000008000L});
    public static final BitSet FOLLOW_declaration_in_for_music_stmt2100 = new BitSet(new long[]{0x0880410080000000L,0x000000000420400AL});
    public static final BitSet FOLLOW_list_assig_in_for_music_stmt2104 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_for_music_stmt2106 = new BitSet(new long[]{0x0880410080000000L,0x000000000420400AL});
    public static final BitSet FOLLOW_expr_in_for_music_stmt2110 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_for_music_stmt2112 = new BitSet(new long[]{0x0000450000020000L});
    public static final BitSet FOLLOW_list_assig_in_for_music_stmt2115 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_for_music_stmt2117 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_for_music_stmt2120 = new BitSet(new long[]{0x90005F0201822E20L,0x0000000005059800L});
    public static final BitSet FOLLOW_list_music_inst_in_for_music_stmt2123 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_for_music_stmt2125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assig_in_list_assig2154 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_list_assig2157 = new BitSet(new long[]{0x0000450000020000L});
    public static final BitSet FOLLOW_assig_in_list_assig2159 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_IF_in_if_stmt2197 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_if_stmt2200 = new BitSet(new long[]{0x0880410080000000L,0x000000000420400AL});
    public static final BitSet FOLLOW_expr_in_if_stmt2203 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_if_stmt2205 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_if_stmt2208 = new BitSet(new long[]{0x80005F0201422A00L,0x000000000104BA02L});
    public static final BitSet FOLLOW_listInst_in_if_stmt2211 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_if_stmt2213 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_elseif_stmt_in_if_stmt2216 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_else_stmt_in_if_stmt2219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_elseif_stmt2243 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_IF_in_elseif_stmt2245 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_elseif_stmt2247 = new BitSet(new long[]{0x0880410080000000L,0x000000000420400AL});
    public static final BitSet FOLLOW_expr_in_elseif_stmt2249 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_elseif_stmt2251 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_elseif_stmt2253 = new BitSet(new long[]{0x80005F0201422A00L,0x000000000104BA02L});
    public static final BitSet FOLLOW_listInst_in_elseif_stmt2255 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_elseif_stmt2257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_else_stmt2292 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_else_stmt2295 = new BitSet(new long[]{0x80005F0201422A00L,0x000000000104BA02L});
    public static final BitSet FOLLOW_listInst_in_else_stmt2298 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_else_stmt2300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_if_music_stmt2326 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_if_music_stmt2329 = new BitSet(new long[]{0x0880410080000000L,0x000000000420400AL});
    public static final BitSet FOLLOW_expr_in_if_music_stmt2332 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_if_music_stmt2334 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_if_music_stmt2337 = new BitSet(new long[]{0x90005F0201822E20L,0x0000000005059800L});
    public static final BitSet FOLLOW_list_music_inst_in_if_music_stmt2340 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_if_music_stmt2342 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_elseif_music_stmt_in_if_music_stmt2345 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_else_music_stmt_in_if_music_stmt2348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_elseif_music_stmt2378 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_IF_in_elseif_music_stmt2380 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_elseif_music_stmt2382 = new BitSet(new long[]{0x0880410080000000L,0x000000000420400AL});
    public static final BitSet FOLLOW_expr_in_elseif_music_stmt2384 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_elseif_music_stmt2386 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_elseif_music_stmt2388 = new BitSet(new long[]{0x90005F0201822E20L,0x0000000005059800L});
    public static final BitSet FOLLOW_list_music_inst_in_elseif_music_stmt2390 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_elseif_music_stmt2392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_else_music_stmt2433 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_else_music_stmt2436 = new BitSet(new long[]{0x90005F0201822E20L,0x0000000005059800L});
    public static final BitSet FOLLOW_list_music_inst_in_else_music_stmt2439 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_else_music_stmt2441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SONG_in_song2476 = new BitSet(new long[]{0x0000410000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_id_rule_in_song2479 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_song2482 = new BitSet(new long[]{0x0000000000000200L,0x00000000001C1000L});
    public static final BitSet FOLLOW_beat_in_song2486 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_song2488 = new BitSet(new long[]{0x0000000000000000L,0x00000000001C1000L});
    public static final BitSet FOLLOW_speed_in_song2494 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_song2496 = new BitSet(new long[]{0x0000000000000000L,0x00000000001C0000L});
    public static final BitSet FOLLOW_tone_in_song2502 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_song2504 = new BitSet(new long[]{0x0000000000000000L,0x0000000000180000L});
    public static final BitSet FOLLOW_transport_in_song2510 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_song2512 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_track_in_song2519 = new BitSet(new long[]{0x0000000000800000L,0x0000000200080000L});
    public static final BitSet FOLLOW_drums_track_in_song2523 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_song2526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRACK_in_track2556 = new BitSet(new long[]{0x0000410000400000L,0x0000000000006002L});
    public static final BitSet FOLLOW_id_rule_in_track2559 = new BitSet(new long[]{0x0000000000400000L,0x0000000000006002L});
    public static final BitSet FOLLOW_STRING_in_track2562 = new BitSet(new long[]{0x0000000000400000L,0x0000000000002002L});
    public static final BitSet FOLLOW_compas_aux_in_track2565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DRUMS_in_drums_track2588 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_TRACK_in_drums_track2591 = new BitSet(new long[]{0x0000000000400000L,0x0000000000002002L});
    public static final BitSet FOLLOW_compas_aux_in_drums_track2593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compas_list_in_compas_aux2617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_BAR_in_compas_list2647 = new BitSet(new long[]{0x90005F0201C22E20L,0x000000000505B802L});
    public static final BitSet FOLLOW_repetition_in_compas_list2652 = new BitSet(new long[]{0x90005F0201C22E20L,0x000000000505B802L});
    public static final BitSet FOLLOW_compasses_in_compas_list2656 = new BitSet(new long[]{0x90005F0201C22E20L,0x000000000505B802L});
    public static final BitSet FOLLOW_repetition_in_compas_list2660 = new BitSet(new long[]{0x90005F0201C22E20L,0x000000000505B802L});
    public static final BitSet FOLLOW_DOUBLE_BAR_in_compas_list2665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compas_in_compasses2692 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_BAR_in_compasses2695 = new BitSet(new long[]{0x90005F0201822E20L,0x0000000005059800L});
    public static final BitSet FOLLOW_compas_in_compasses2698 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_NUM_in_repetition2725 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_LETTER_X_in_repetition2727 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_START_REPETITION_in_repetition2731 = new BitSet(new long[]{0x90005F0201822E20L,0x0000000005059800L});
    public static final BitSet FOLLOW_compasses_in_repetition2733 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_END_REPETITION_in_repetition2735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_music_inst_in_compas2786 = new BitSet(new long[]{0x90005F0201822E22L,0x0000000005059800L});
    public static final BitSet FOLLOW_TONE_in_tone2830 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_NUM_in_tone2833 = new BitSet(new long[]{0x0000000000000400L,0x0000000000010000L});
    public static final BitSet FOLLOW_set_in_tone2835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notes_type_in_notes_group2864 = new BitSet(new long[]{0x0000000000000002L,0x0000000020020000L});
    public static final BitSet FOLLOW_93_in_notes_group2867 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_FIGURE_in_notes_group2869 = new BitSet(new long[]{0x0000000000200002L,0x0000000000020000L});
    public static final BitSet FOLLOW_DOT_in_notes_group2871 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_TIE_in_notes_group2876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notes_type_in_notes_variable2918 = new BitSet(new long[]{0x0000000000000002L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_notes_variable2921 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_FIGURE_in_notes_variable2923 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_DOT_in_notes_variable2925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_chord_in_notes_type2968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notes_in_notes_type2972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_drums_in_notes_type2976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHORD_in_chord3005 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_chord3008 = new BitSet(new long[]{0x1000000000000420L,0x0000000000010000L});
    public static final BitSet FOLLOW_note_in_chord3011 = new BitSet(new long[]{0x0060000000040000L,0x0000000008000408L});
    public static final BitSet FOLLOW_91_in_chord3031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_notes3063 = new BitSet(new long[]{0x1000000000000420L,0x0000000000010000L});
    public static final BitSet FOLLOW_note_in_notes3066 = new BitSet(new long[]{0x1000000000000420L,0x0000000008010000L});
    public static final BitSet FOLLOW_91_in_notes3070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_note_in_notes3075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DRUMS_in_drums3114 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_drums3117 = new BitSet(new long[]{0x0880410080000000L,0x000000000420400AL});
    public static final BitSet FOLLOW_num_expr_in_drums3120 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_drums3122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOTE_in_note3166 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_NUM_in_note3170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolterm_in_expr3199 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_OR_in_expr3202 = new BitSet(new long[]{0x0880410080000000L,0x000000000420400AL});
    public static final BitSet FOLLOW_boolterm_in_expr3205 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_boolfact_in_boolterm3223 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_boolterm3226 = new BitSet(new long[]{0x0880410080000000L,0x000000000420400AL});
    public static final BitSet FOLLOW_boolfact_in_boolterm3229 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_num_expr_in_boolfact3251 = new BitSet(new long[]{0x0010206020000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_EQUAL_in_boolfact3255 = new BitSet(new long[]{0x0880410080000000L,0x000000000420400AL});
    public static final BitSet FOLLOW_NOT_EQUAL_in_boolfact3260 = new BitSet(new long[]{0x0880410080000000L,0x000000000420400AL});
    public static final BitSet FOLLOW_LT_in_boolfact3265 = new BitSet(new long[]{0x0880410080000000L,0x000000000420400AL});
    public static final BitSet FOLLOW_LE_in_boolfact3270 = new BitSet(new long[]{0x0880410080000000L,0x000000000420400AL});
    public static final BitSet FOLLOW_GT_in_boolfact3275 = new BitSet(new long[]{0x0880410080000000L,0x000000000420400AL});
    public static final BitSet FOLLOW_GE_in_boolfact3280 = new BitSet(new long[]{0x0880410080000000L,0x000000000420400AL});
    public static final BitSet FOLLOW_num_expr_in_boolfact3284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_num_expr3306 = new BitSet(new long[]{0x0080000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_PLUS_in_num_expr3311 = new BitSet(new long[]{0x0880410080000000L,0x000000000420400AL});
    public static final BitSet FOLLOW_MINUS_in_num_expr3316 = new BitSet(new long[]{0x0880410080000000L,0x000000000420400AL});
    public static final BitSet FOLLOW_term_in_num_expr3320 = new BitSet(new long[]{0x0080000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_factor_in_term3342 = new BitSet(new long[]{0x0200000000280002L});
    public static final BitSet FOLLOW_DOT_in_term3347 = new BitSet(new long[]{0x0880410080000000L,0x000000000420400AL});
    public static final BitSet FOLLOW_DIV_in_term3352 = new BitSet(new long[]{0x0880410080000000L,0x000000000420400AL});
    public static final BitSet FOLLOW_MOD_in_term3357 = new BitSet(new long[]{0x0880410080000000L,0x000000000420400AL});
    public static final BitSet FOLLOW_factor_in_term3361 = new BitSet(new long[]{0x0200000000280002L});
    public static final BitSet FOLLOW_NOT_in_factor3378 = new BitSet(new long[]{0x0000410080000000L,0x0000000004204002L});
    public static final BitSet FOLLOW_PLUS_in_factor3383 = new BitSet(new long[]{0x0000410080000000L,0x0000000004204002L});
    public static final BitSet FOLLOW_MINUS_in_factor3388 = new BitSet(new long[]{0x0000410080000000L,0x0000000004204002L});
    public static final BitSet FOLLOW_atom_in_factor3393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_access_in_atom3409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUM_in_atom3417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_atom3425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_atom3433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_atom3444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_atom3450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_atom3467 = new BitSet(new long[]{0x0880410080000000L,0x000000000420400AL});
    public static final BitSet FOLLOW_expr_in_atom3470 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_atom3472 = new BitSet(new long[]{0x0000000000000002L});

}