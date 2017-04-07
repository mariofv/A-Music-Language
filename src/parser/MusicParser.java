// $ANTLR 3.4 src/parser/Music.g 2017-04-07 13:04:22

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ASSIG", "ATTR_ACCESS", "BAR", "BEAT", "BEMOL", "BOOL", "BOOLEAN", "CHORD", "COMMENT", "COMPAS", "COMPAS_LIST", "DECR", "DIMINUTION", "DIV", "DIVIDE_ASSIG", "DOT", "DOUBLE_BAR", "ELSE", "ELSEIF", "END_REPETITION", "EQUAL", "ESC_SEQ", "FALSE", "FIGURE", "FOR", "FRAGMENT", "FUNCALL", "FUNCTION", "GE", "GT", "ID", "IF", "INCR", "INSTRUMENT", "INT", "LE", "LETTER_X", "LIST_ARGUMENTS", "LIST_ASSIG", "LIST_FUNCTIONS", "LIST_INSTRUCTIONS", "LIST_MUSIC_INST", "LT", "MAJ7", "MINOR", "MINUS", "MINUS_ASSIG", "MOD", "MOD_ASSIG", "NOT", "NOTE", "NOTES", "NOTE_LIST", "NOTE_TYPE", "NOT_EQUAL", "NUM", "OR", "PLUS", "PLUS_ASSIG", "POST", "PRE", "PROD_ASSIG", "REPETITION", "RETURN", "SEVENTH", "SONG", "SPEED", "START_REPETITION", "STRING", "SUSTAIN", "TIE", "TONE", "TRACK", "TRANSPORT", "TRUE", "VAR_FUNCALL", "VOID", "WHILE", "WS", "'('", "')'", "','", "'.'", "':'", "';'", "'{'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__90=90;
    public static final int T__91=91;
    public static final int AND=4;
    public static final int ASSIG=5;
    public static final int ATTR_ACCESS=6;
    public static final int BAR=7;
    public static final int BEAT=8;
    public static final int BEMOL=9;
    public static final int BOOL=10;
    public static final int BOOLEAN=11;
    public static final int CHORD=12;
    public static final int COMMENT=13;
    public static final int COMPAS=14;
    public static final int COMPAS_LIST=15;
    public static final int DECR=16;
    public static final int DIMINUTION=17;
    public static final int DIV=18;
    public static final int DIVIDE_ASSIG=19;
    public static final int DOT=20;
    public static final int DOUBLE_BAR=21;
    public static final int ELSE=22;
    public static final int ELSEIF=23;
    public static final int END_REPETITION=24;
    public static final int EQUAL=25;
    public static final int ESC_SEQ=26;
    public static final int FALSE=27;
    public static final int FIGURE=28;
    public static final int FOR=29;
    public static final int FRAGMENT=30;
    public static final int FUNCALL=31;
    public static final int FUNCTION=32;
    public static final int GE=33;
    public static final int GT=34;
    public static final int ID=35;
    public static final int IF=36;
    public static final int INCR=37;
    public static final int INSTRUMENT=38;
    public static final int INT=39;
    public static final int LE=40;
    public static final int LETTER_X=41;
    public static final int LIST_ARGUMENTS=42;
    public static final int LIST_ASSIG=43;
    public static final int LIST_FUNCTIONS=44;
    public static final int LIST_INSTRUCTIONS=45;
    public static final int LIST_MUSIC_INST=46;
    public static final int LT=47;
    public static final int MAJ7=48;
    public static final int MINOR=49;
    public static final int MINUS=50;
    public static final int MINUS_ASSIG=51;
    public static final int MOD=52;
    public static final int MOD_ASSIG=53;
    public static final int NOT=54;
    public static final int NOTE=55;
    public static final int NOTES=56;
    public static final int NOTE_LIST=57;
    public static final int NOTE_TYPE=58;
    public static final int NOT_EQUAL=59;
    public static final int NUM=60;
    public static final int OR=61;
    public static final int PLUS=62;
    public static final int PLUS_ASSIG=63;
    public static final int POST=64;
    public static final int PRE=65;
    public static final int PROD_ASSIG=66;
    public static final int REPETITION=67;
    public static final int RETURN=68;
    public static final int SEVENTH=69;
    public static final int SONG=70;
    public static final int SPEED=71;
    public static final int START_REPETITION=72;
    public static final int STRING=73;
    public static final int SUSTAIN=74;
    public static final int TIE=75;
    public static final int TONE=76;
    public static final int TRACK=77;
    public static final int TRANSPORT=78;
    public static final int TRUE=79;
    public static final int VAR_FUNCALL=80;
    public static final int VOID=81;
    public static final int WHILE=82;
    public static final int WS=83;

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
    // src/parser/Music.g:40:1: prog : ( global_stmt )+ EOF -> ^( LIST_FUNCTIONS ( global_stmt )+ ) ;
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
            // src/parser/Music.g:40:10: ( ( global_stmt )+ EOF -> ^( LIST_FUNCTIONS ( global_stmt )+ ) )
            // src/parser/Music.g:40:14: ( global_stmt )+ EOF
            {
            // src/parser/Music.g:40:14: ( global_stmt )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==BOOL||LA1_0==CHORD||LA1_0==FRAGMENT||LA1_0==INT||LA1_0==NOTE_TYPE||LA1_0==SONG||LA1_0==VOID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // src/parser/Music.g:40:15: global_stmt
            	    {
            	    pushFollow(FOLLOW_global_stmt_in_prog186);
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


            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_prog190);  
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
            // 40:33: -> ^( LIST_FUNCTIONS ( global_stmt )+ )
            {
                // src/parser/Music.g:40:36: ^( LIST_FUNCTIONS ( global_stmt )+ )
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
    // src/parser/Music.g:43:1: global_stmt : ( function | frag | song );
    public final MusicParser.global_stmt_return global_stmt() throws RecognitionException {
        MusicParser.global_stmt_return retval = new MusicParser.global_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        MusicParser.function_return function3 =null;

        MusicParser.frag_return frag4 =null;

        MusicParser.song_return song5 =null;



        try {
            // src/parser/Music.g:43:13: ( function | frag | song )
            int alt2=3;
            switch ( input.LA(1) ) {
            case BOOL:
            case CHORD:
            case INT:
            case NOTE_TYPE:
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
                    // src/parser/Music.g:43:17: function
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_function_in_global_stmt222);
                    function3=function();

                    state._fsp--;

                    adaptor.addChild(root_0, function3.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:44:17: frag
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_frag_in_global_stmt240);
                    frag4=frag();

                    state._fsp--;

                    adaptor.addChild(root_0, frag4.getTree());

                    }
                    break;
                case 3 :
                    // src/parser/Music.g:45:17: song
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_song_in_global_stmt258);
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
    // src/parser/Music.g:48:1: var_funcall : id= id_rule '.' id2= id_rule '(' ( params )? ')' ';' -> ^( VAR_FUNCALL[$id.text] $id2 ( params )? ) ;
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
        RewriteRuleTokenStream stream_89=new RewriteRuleTokenStream(adaptor,"token 89");
        RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");
        RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
        RewriteRuleTokenStream stream_87=new RewriteRuleTokenStream(adaptor,"token 87");
        RewriteRuleSubtreeStream stream_id_rule=new RewriteRuleSubtreeStream(adaptor,"rule id_rule");
        RewriteRuleSubtreeStream stream_params=new RewriteRuleSubtreeStream(adaptor,"rule params");
        try {
            // src/parser/Music.g:48:13: (id= id_rule '.' id2= id_rule '(' ( params )? ')' ';' -> ^( VAR_FUNCALL[$id.text] $id2 ( params )? ) )
            // src/parser/Music.g:48:17: id= id_rule '.' id2= id_rule '(' ( params )? ')' ';'
            {
            pushFollow(FOLLOW_id_rule_in_var_funcall283);
            id=id_rule();

            state._fsp--;

            stream_id_rule.add(id.getTree());

            char_literal6=(Token)match(input,87,FOLLOW_87_in_var_funcall285);  
            stream_87.add(char_literal6);


            pushFollow(FOLLOW_id_rule_in_var_funcall289);
            id2=id_rule();

            state._fsp--;

            stream_id_rule.add(id2.getTree());

            char_literal7=(Token)match(input,84,FOLLOW_84_in_var_funcall291);  
            stream_84.add(char_literal7);


            // src/parser/Music.g:48:48: ( params )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==BEMOL||LA3_0==CHORD||LA3_0==FALSE||LA3_0==ID||LA3_0==LETTER_X||LA3_0==MINUS||(LA3_0 >= NOT && LA3_0 <= NOTE)||LA3_0==NUM||LA3_0==PLUS||LA3_0==SUSTAIN||LA3_0==TRUE||LA3_0==84) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // src/parser/Music.g:48:48: params
                    {
                    pushFollow(FOLLOW_params_in_var_funcall293);
                    params8=params();

                    state._fsp--;

                    stream_params.add(params8.getTree());

                    }
                    break;

            }


            char_literal9=(Token)match(input,85,FOLLOW_85_in_var_funcall296);  
            stream_85.add(char_literal9);


            char_literal10=(Token)match(input,89,FOLLOW_89_in_var_funcall298);  
            stream_89.add(char_literal10);


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
            // 48:65: -> ^( VAR_FUNCALL[$id.text] $id2 ( params )? )
            {
                // src/parser/Music.g:48:69: ^( VAR_FUNCALL[$id.text] $id2 ( params )? )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(VAR_FUNCALL, (id!=null?input.toString(id.start,id.stop):null))
                , root_1);

                adaptor.addChild(root_1, stream_id2.nextTree());

                // src/parser/Music.g:48:98: ( params )?
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
    // src/parser/Music.g:51:1: var_access : (id1= id_rule ( '.' id2= id_rule ) -> ^( ATTR_ACCESS[$id1.text] $id2) | id_rule );
    public final MusicParser.var_access_return var_access() throws RecognitionException {
        MusicParser.var_access_return retval = new MusicParser.var_access_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal11=null;
        MusicParser.id_rule_return id1 =null;

        MusicParser.id_rule_return id2 =null;

        MusicParser.id_rule_return id_rule12 =null;


        AmlTree char_literal11_tree=null;
        RewriteRuleTokenStream stream_87=new RewriteRuleTokenStream(adaptor,"token 87");
        RewriteRuleSubtreeStream stream_id_rule=new RewriteRuleSubtreeStream(adaptor,"rule id_rule");
        try {
            // src/parser/Music.g:51:13: (id1= id_rule ( '.' id2= id_rule ) -> ^( ATTR_ACCESS[$id1.text] $id2) | id_rule )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==ID||LA4_0==LETTER_X) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==87) ) {
                    alt4=1;
                }
                else if ( ((LA4_1 >= AND && LA4_1 <= ASSIG)||LA4_1==DECR||(LA4_1 >= DIV && LA4_1 <= DOT)||LA4_1==EQUAL||(LA4_1 >= GE && LA4_1 <= GT)||LA4_1==INCR||LA4_1==LE||LA4_1==LT||(LA4_1 >= MINUS && LA4_1 <= MOD_ASSIG)||LA4_1==NOT_EQUAL||(LA4_1 >= OR && LA4_1 <= PLUS_ASSIG)||LA4_1==PROD_ASSIG||(LA4_1 >= 85 && LA4_1 <= 86)||LA4_1==89) ) {
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
                    // src/parser/Music.g:51:17: id1= id_rule ( '.' id2= id_rule )
                    {
                    pushFollow(FOLLOW_id_rule_in_var_access339);
                    id1=id_rule();

                    state._fsp--;

                    stream_id_rule.add(id1.getTree());

                    // src/parser/Music.g:51:29: ( '.' id2= id_rule )
                    // src/parser/Music.g:51:30: '.' id2= id_rule
                    {
                    char_literal11=(Token)match(input,87,FOLLOW_87_in_var_access342);  
                    stream_87.add(char_literal11);


                    pushFollow(FOLLOW_id_rule_in_var_access346);
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
                    // 51:47: -> ^( ATTR_ACCESS[$id1.text] $id2)
                    {
                        // src/parser/Music.g:51:50: ^( ATTR_ACCESS[$id1.text] $id2)
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
                    // src/parser/Music.g:52:17: id_rule
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_id_rule_in_var_access375);
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
    // src/parser/Music.g:55:1: id_rule : ( ID | LETTER_X );
    public final MusicParser.id_rule_return id_rule() throws RecognitionException {
        MusicParser.id_rule_return retval = new MusicParser.id_rule_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token set13=null;

        AmlTree set13_tree=null;

        try {
            // src/parser/Music.g:55:13: ( ID | LETTER_X )
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
    // src/parser/Music.g:59:1: function : type_void id= id_rule '(' list_arguments ')' '{' listInst '}' -> ^( FUNCTION[$id.text] type_void list_arguments listInst ) ;
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
        RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
        RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
        RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");
        RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
        RewriteRuleSubtreeStream stream_id_rule=new RewriteRuleSubtreeStream(adaptor,"rule id_rule");
        RewriteRuleSubtreeStream stream_listInst=new RewriteRuleSubtreeStream(adaptor,"rule listInst");
        RewriteRuleSubtreeStream stream_type_void=new RewriteRuleSubtreeStream(adaptor,"rule type_void");
        RewriteRuleSubtreeStream stream_list_arguments=new RewriteRuleSubtreeStream(adaptor,"rule list_arguments");
        try {
            // src/parser/Music.g:59:13: ( type_void id= id_rule '(' list_arguments ')' '{' listInst '}' -> ^( FUNCTION[$id.text] type_void list_arguments listInst ) )
            // src/parser/Music.g:59:16: type_void id= id_rule '(' list_arguments ')' '{' listInst '}'
            {
            pushFollow(FOLLOW_type_void_in_function445);
            type_void14=type_void();

            state._fsp--;

            stream_type_void.add(type_void14.getTree());

            pushFollow(FOLLOW_id_rule_in_function449);
            id=id_rule();

            state._fsp--;

            stream_id_rule.add(id.getTree());

            char_literal15=(Token)match(input,84,FOLLOW_84_in_function451);  
            stream_84.add(char_literal15);


            pushFollow(FOLLOW_list_arguments_in_function453);
            list_arguments16=list_arguments();

            state._fsp--;

            stream_list_arguments.add(list_arguments16.getTree());

            char_literal17=(Token)match(input,85,FOLLOW_85_in_function455);  
            stream_85.add(char_literal17);


            char_literal18=(Token)match(input,90,FOLLOW_90_in_function457);  
            stream_90.add(char_literal18);


            pushFollow(FOLLOW_listInst_in_function459);
            listInst19=listInst();

            state._fsp--;

            stream_listInst.add(listInst19.getTree());

            char_literal20=(Token)match(input,91,FOLLOW_91_in_function461);  
            stream_91.add(char_literal20);


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
    // src/parser/Music.g:62:1: funcall : id= id_rule '(' ( params )? ')' ';' -> ^( FUNCALL[$id.text] ( params )? ) ;
    public final MusicParser.funcall_return funcall() throws RecognitionException {
        MusicParser.funcall_return retval = new MusicParser.funcall_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal21=null;
        Token char_literal23=null;
        Token char_literal24=null;
        MusicParser.id_rule_return id =null;

        MusicParser.params_return params22 =null;


        AmlTree char_literal21_tree=null;
        AmlTree char_literal23_tree=null;
        AmlTree char_literal24_tree=null;
        RewriteRuleTokenStream stream_89=new RewriteRuleTokenStream(adaptor,"token 89");
        RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");
        RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
        RewriteRuleSubtreeStream stream_id_rule=new RewriteRuleSubtreeStream(adaptor,"rule id_rule");
        RewriteRuleSubtreeStream stream_params=new RewriteRuleSubtreeStream(adaptor,"rule params");
        try {
            // src/parser/Music.g:62:13: (id= id_rule '(' ( params )? ')' ';' -> ^( FUNCALL[$id.text] ( params )? ) )
            // src/parser/Music.g:62:17: id= id_rule '(' ( params )? ')' ';'
            {
            pushFollow(FOLLOW_id_rule_in_funcall508);
            id=id_rule();

            state._fsp--;

            stream_id_rule.add(id.getTree());

            char_literal21=(Token)match(input,84,FOLLOW_84_in_funcall510);  
            stream_84.add(char_literal21);


            // src/parser/Music.g:62:32: ( params )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==BEMOL||LA5_0==CHORD||LA5_0==FALSE||LA5_0==ID||LA5_0==LETTER_X||LA5_0==MINUS||(LA5_0 >= NOT && LA5_0 <= NOTE)||LA5_0==NUM||LA5_0==PLUS||LA5_0==SUSTAIN||LA5_0==TRUE||LA5_0==84) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // src/parser/Music.g:62:32: params
                    {
                    pushFollow(FOLLOW_params_in_funcall512);
                    params22=params();

                    state._fsp--;

                    stream_params.add(params22.getTree());

                    }
                    break;

            }


            char_literal23=(Token)match(input,85,FOLLOW_85_in_funcall515);  
            stream_85.add(char_literal23);


            char_literal24=(Token)match(input,89,FOLLOW_89_in_funcall517);  
            stream_89.add(char_literal24);


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
            // 62:48: -> ^( FUNCALL[$id.text] ( params )? )
            {
                // src/parser/Music.g:62:51: ^( FUNCALL[$id.text] ( params )? )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(FUNCALL, (id!=null?input.toString(id.start,id.stop):null))
                , root_1);

                // src/parser/Music.g:62:71: ( params )?
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

        Token FRAGMENT25=null;
        Token char_literal27=null;
        Token char_literal29=null;
        Token char_literal30=null;
        Token char_literal32=null;
        MusicParser.id_rule_return id_rule26 =null;

        MusicParser.list_arguments_return list_arguments28 =null;

        MusicParser.list_music_inst_return list_music_inst31 =null;


        AmlTree FRAGMENT25_tree=null;
        AmlTree char_literal27_tree=null;
        AmlTree char_literal29_tree=null;
        AmlTree char_literal30_tree=null;
        AmlTree char_literal32_tree=null;

        try {
            // src/parser/Music.g:65:9: ( FRAGMENT ^ id_rule '(' ! list_arguments ')' ! '{' ! list_music_inst '}' !)
            // src/parser/Music.g:65:11: FRAGMENT ^ id_rule '(' ! list_arguments ')' ! '{' ! list_music_inst '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            FRAGMENT25=(Token)match(input,FRAGMENT,FOLLOW_FRAGMENT_in_frag551); 
            FRAGMENT25_tree = 
            (AmlTree)adaptor.create(FRAGMENT25)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(FRAGMENT25_tree, root_0);


            pushFollow(FOLLOW_id_rule_in_frag554);
            id_rule26=id_rule();

            state._fsp--;

            adaptor.addChild(root_0, id_rule26.getTree());

            char_literal27=(Token)match(input,84,FOLLOW_84_in_frag556); 

            pushFollow(FOLLOW_list_arguments_in_frag559);
            list_arguments28=list_arguments();

            state._fsp--;

            adaptor.addChild(root_0, list_arguments28.getTree());

            char_literal29=(Token)match(input,85,FOLLOW_85_in_frag561); 

            char_literal30=(Token)match(input,90,FOLLOW_90_in_frag564); 

            pushFollow(FOLLOW_list_music_inst_in_frag567);
            list_music_inst31=list_music_inst();

            state._fsp--;

            adaptor.addChild(root_0, list_music_inst31.getTree());

            char_literal32=(Token)match(input,91,FOLLOW_91_in_frag569); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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

        Token char_literal34=null;
        MusicParser.argument_return argument33 =null;

        MusicParser.argument_return argument35 =null;


        AmlTree char_literal34_tree=null;
        RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
        RewriteRuleSubtreeStream stream_argument=new RewriteRuleSubtreeStream(adaptor,"rule argument");
        try {
            // src/parser/Music.g:68:17: ( ( argument ( ',' argument )* )? -> ^( LIST_ARGUMENTS ( argument )* ) )
            // src/parser/Music.g:68:19: ( argument ( ',' argument )* )?
            {
            // src/parser/Music.g:68:19: ( argument ( ',' argument )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==BOOL||LA7_0==CHORD||LA7_0==INT||LA7_0==NOTE_TYPE) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // src/parser/Music.g:68:20: argument ( ',' argument )*
                    {
                    pushFollow(FOLLOW_argument_in_list_arguments589);
                    argument33=argument();

                    state._fsp--;

                    stream_argument.add(argument33.getTree());

                    // src/parser/Music.g:68:29: ( ',' argument )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==86) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // src/parser/Music.g:68:30: ',' argument
                    	    {
                    	    char_literal34=(Token)match(input,86,FOLLOW_86_in_list_arguments592);  
                    	    stream_86.add(char_literal34);


                    	    pushFollow(FOLLOW_argument_in_list_arguments594);
                    	    argument35=argument();

                    	    state._fsp--;

                    	    stream_argument.add(argument35.getTree());

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

        MusicParser.type_return type36 =null;

        MusicParser.id_rule_return id_rule37 =null;



        try {
            // src/parser/Music.g:71:11: ( type ^ id_rule )
            // src/parser/Music.g:71:15: type ^ id_rule
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_type_in_argument635);
            type36=type();

            state._fsp--;

            root_0 = (AmlTree)adaptor.becomeRoot(type36.getTree(), root_0);

            pushFollow(FOLLOW_id_rule_in_argument638);
            id_rule37=id_rule();

            state._fsp--;

            adaptor.addChild(root_0, id_rule37.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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

        Token char_literal40=null;
        MusicParser.expr_return expr38 =null;

        MusicParser.notes_variable_return notes_variable39 =null;

        MusicParser.expr_return expr41 =null;

        MusicParser.notes_variable_return notes_variable42 =null;


        AmlTree char_literal40_tree=null;

        try {
            // src/parser/Music.g:74:13: ( ( expr | notes_variable ) ( ',' ! ( expr | notes_variable ) )* )
            // src/parser/Music.g:74:17: ( expr | notes_variable ) ( ',' ! ( expr | notes_variable ) )*
            {
            root_0 = (AmlTree)adaptor.nil();


            // src/parser/Music.g:74:17: ( expr | notes_variable )
            int alt8=2;
            switch ( input.LA(1) ) {
            case FALSE:
            case ID:
            case LETTER_X:
            case MINUS:
            case NOT:
            case NUM:
            case PLUS:
            case TRUE:
                {
                alt8=1;
                }
                break;
            case 84:
                {
                int LA8_2 = input.LA(2);

                if ( (LA8_2==FALSE||LA8_2==ID||LA8_2==LETTER_X||LA8_2==MINUS||LA8_2==NOT||LA8_2==NUM||LA8_2==PLUS||LA8_2==TRUE||LA8_2==84) ) {
                    alt8=1;
                }
                else if ( (LA8_2==BEMOL||LA8_2==NOTE||LA8_2==SUSTAIN) ) {
                    alt8=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 2, input);

                    throw nvae;

                }
                }
                break;
            case BEMOL:
            case CHORD:
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
                    // src/parser/Music.g:74:18: expr
                    {
                    pushFollow(FOLLOW_expr_in_params665);
                    expr38=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr38.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:74:25: notes_variable
                    {
                    pushFollow(FOLLOW_notes_variable_in_params669);
                    notes_variable39=notes_variable();

                    state._fsp--;

                    adaptor.addChild(root_0, notes_variable39.getTree());

                    }
                    break;

            }


            // src/parser/Music.g:74:41: ( ',' ! ( expr | notes_variable ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==86) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // src/parser/Music.g:74:42: ',' ! ( expr | notes_variable )
            	    {
            	    char_literal40=(Token)match(input,86,FOLLOW_86_in_params673); 

            	    // src/parser/Music.g:74:47: ( expr | notes_variable )
            	    int alt9=2;
            	    switch ( input.LA(1) ) {
            	    case FALSE:
            	    case ID:
            	    case LETTER_X:
            	    case MINUS:
            	    case NOT:
            	    case NUM:
            	    case PLUS:
            	    case TRUE:
            	        {
            	        alt9=1;
            	        }
            	        break;
            	    case 84:
            	        {
            	        int LA9_2 = input.LA(2);

            	        if ( (LA9_2==FALSE||LA9_2==ID||LA9_2==LETTER_X||LA9_2==MINUS||LA9_2==NOT||LA9_2==NUM||LA9_2==PLUS||LA9_2==TRUE||LA9_2==84) ) {
            	            alt9=1;
            	        }
            	        else if ( (LA9_2==BEMOL||LA9_2==NOTE||LA9_2==SUSTAIN) ) {
            	            alt9=2;
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 9, 2, input);

            	            throw nvae;

            	        }
            	        }
            	        break;
            	    case BEMOL:
            	    case CHORD:
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
            	            // src/parser/Music.g:74:48: expr
            	            {
            	            pushFollow(FOLLOW_expr_in_params677);
            	            expr41=expr();

            	            state._fsp--;

            	            adaptor.addChild(root_0, expr41.getTree());

            	            }
            	            break;
            	        case 2 :
            	            // src/parser/Music.g:74:55: notes_variable
            	            {
            	            pushFollow(FOLLOW_notes_variable_in_params681);
            	            notes_variable42=notes_variable();

            	            state._fsp--;

            	            adaptor.addChild(root_0, notes_variable42.getTree());

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
    // src/parser/Music.g:77:1: listInst : ( inst )+ -> ^( LIST_INSTRUCTIONS ( inst )+ ) ;
    public final MusicParser.listInst_return listInst() throws RecognitionException {
        MusicParser.listInst_return retval = new MusicParser.listInst_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        MusicParser.inst_return inst43 =null;


        RewriteRuleSubtreeStream stream_inst=new RewriteRuleSubtreeStream(adaptor,"rule inst");
        try {
            // src/parser/Music.g:77:13: ( ( inst )+ -> ^( LIST_INSTRUCTIONS ( inst )+ ) )
            // src/parser/Music.g:77:16: ( inst )+
            {
            // src/parser/Music.g:77:16: ( inst )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==BEAT||LA11_0==BOOL||LA11_0==CHORD||LA11_0==DECR||LA11_0==DOUBLE_BAR||LA11_0==FOR||(LA11_0 >= ID && LA11_0 <= INT)||LA11_0==LETTER_X||LA11_0==NOTE_TYPE||LA11_0==NUM||(LA11_0 >= SONG && LA11_0 <= START_REPETITION)||LA11_0==TONE||LA11_0==WHILE) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // src/parser/Music.g:77:16: inst
            	    {
            	    pushFollow(FOLLOW_inst_in_listInst709);
            	    inst43=inst();

            	    state._fsp--;

            	    stream_inst.add(inst43.getTree());

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

        MusicParser.music_inst_return music_inst44 =null;


        RewriteRuleSubtreeStream stream_music_inst=new RewriteRuleSubtreeStream(adaptor,"rule music_inst");
        try {
            // src/parser/Music.g:80:17: ( ( music_inst )+ -> ^( LIST_MUSIC_INST ( music_inst )+ ) )
            // src/parser/Music.g:80:21: ( music_inst )+
            {
            // src/parser/Music.g:80:21: ( music_inst )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0 >= BEAT && LA12_0 <= BOOL)||LA12_0==CHORD||LA12_0==DECR||LA12_0==FOR||(LA12_0 >= ID && LA12_0 <= INT)||LA12_0==LETTER_X||LA12_0==NOTE||LA12_0==NOTE_TYPE||(LA12_0 >= SONG && LA12_0 <= SPEED)||LA12_0==SUSTAIN||LA12_0==TONE||LA12_0==WHILE||LA12_0==84) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // src/parser/Music.g:80:21: music_inst
            	    {
            	    pushFollow(FOLLOW_music_inst_in_list_music_inst743);
            	    music_inst44=music_inst();

            	    state._fsp--;

            	    stream_music_inst.add(music_inst44.getTree());

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
    // src/parser/Music.g:83:1: inst : ( declaration | var_funcall | tone ';' !| beat ';' !| speed ';' !| instrument ';' !| assignation | while_stmt | funcall | for_stmt | if_stmt | song | compas_list );
    public final MusicParser.inst_return inst() throws RecognitionException {
        MusicParser.inst_return retval = new MusicParser.inst_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal48=null;
        Token char_literal50=null;
        Token char_literal52=null;
        Token char_literal54=null;
        MusicParser.declaration_return declaration45 =null;

        MusicParser.var_funcall_return var_funcall46 =null;

        MusicParser.tone_return tone47 =null;

        MusicParser.beat_return beat49 =null;

        MusicParser.speed_return speed51 =null;

        MusicParser.instrument_return instrument53 =null;

        MusicParser.assignation_return assignation55 =null;

        MusicParser.while_stmt_return while_stmt56 =null;

        MusicParser.funcall_return funcall57 =null;

        MusicParser.for_stmt_return for_stmt58 =null;

        MusicParser.if_stmt_return if_stmt59 =null;

        MusicParser.song_return song60 =null;

        MusicParser.compas_list_return compas_list61 =null;


        AmlTree char_literal48_tree=null;
        AmlTree char_literal50_tree=null;
        AmlTree char_literal52_tree=null;
        AmlTree char_literal54_tree=null;

        try {
            // src/parser/Music.g:83:13: ( declaration | var_funcall | tone ';' !| beat ';' !| speed ';' !| instrument ';' !| assignation | while_stmt | funcall | for_stmt | if_stmt | song | compas_list )
            int alt13=13;
            switch ( input.LA(1) ) {
            case BOOL:
            case CHORD:
            case INT:
            case NOTE_TYPE:
                {
                alt13=1;
                }
                break;
            case ID:
            case LETTER_X:
                {
                switch ( input.LA(2) ) {
                case 87:
                    {
                    int LA13_13 = input.LA(3);

                    if ( (LA13_13==ID||LA13_13==LETTER_X) ) {
                        int LA13_15 = input.LA(4);

                        if ( (LA13_15==84) ) {
                            alt13=2;
                        }
                        else if ( (LA13_15==ASSIG||LA13_15==DECR||LA13_15==DIVIDE_ASSIG||LA13_15==INCR||LA13_15==MINUS_ASSIG||LA13_15==MOD_ASSIG||LA13_15==PLUS_ASSIG||LA13_15==PROD_ASSIG) ) {
                            alt13=7;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 13, 15, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 13, input);

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
                    alt13=7;
                    }
                    break;
                case 84:
                    {
                    alt13=9;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 2, input);

                    throw nvae;

                }

                }
                break;
            case TONE:
                {
                alt13=3;
                }
                break;
            case BEAT:
                {
                alt13=4;
                }
                break;
            case SPEED:
                {
                alt13=5;
                }
                break;
            case INSTRUMENT:
                {
                alt13=6;
                }
                break;
            case DECR:
            case INCR:
                {
                alt13=7;
                }
                break;
            case WHILE:
                {
                alt13=8;
                }
                break;
            case FOR:
                {
                alt13=10;
                }
                break;
            case IF:
                {
                alt13=11;
                }
                break;
            case SONG:
                {
                alt13=12;
                }
                break;
            case DOUBLE_BAR:
            case NUM:
            case START_REPETITION:
                {
                alt13=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }

            switch (alt13) {
                case 1 :
                    // src/parser/Music.g:83:17: declaration
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_declaration_in_inst787);
                    declaration45=declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, declaration45.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:84:17: var_funcall
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_var_funcall_in_inst805);
                    var_funcall46=var_funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, var_funcall46.getTree());

                    }
                    break;
                case 3 :
                    // src/parser/Music.g:85:17: tone ';' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_tone_in_inst823);
                    tone47=tone();

                    state._fsp--;

                    adaptor.addChild(root_0, tone47.getTree());

                    char_literal48=(Token)match(input,89,FOLLOW_89_in_inst825); 

                    }
                    break;
                case 4 :
                    // src/parser/Music.g:86:17: beat ';' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_beat_in_inst844);
                    beat49=beat();

                    state._fsp--;

                    adaptor.addChild(root_0, beat49.getTree());

                    char_literal50=(Token)match(input,89,FOLLOW_89_in_inst846); 

                    }
                    break;
                case 5 :
                    // src/parser/Music.g:87:17: speed ';' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_speed_in_inst865);
                    speed51=speed();

                    state._fsp--;

                    adaptor.addChild(root_0, speed51.getTree());

                    char_literal52=(Token)match(input,89,FOLLOW_89_in_inst867); 

                    }
                    break;
                case 6 :
                    // src/parser/Music.g:88:17: instrument ';' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_instrument_in_inst886);
                    instrument53=instrument();

                    state._fsp--;

                    adaptor.addChild(root_0, instrument53.getTree());

                    char_literal54=(Token)match(input,89,FOLLOW_89_in_inst888); 

                    }
                    break;
                case 7 :
                    // src/parser/Music.g:89:17: assignation
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_assignation_in_inst907);
                    assignation55=assignation();

                    state._fsp--;

                    adaptor.addChild(root_0, assignation55.getTree());

                    }
                    break;
                case 8 :
                    // src/parser/Music.g:90:17: while_stmt
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_while_stmt_in_inst925);
                    while_stmt56=while_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, while_stmt56.getTree());

                    }
                    break;
                case 9 :
                    // src/parser/Music.g:91:17: funcall
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_inst943);
                    funcall57=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall57.getTree());

                    }
                    break;
                case 10 :
                    // src/parser/Music.g:92:17: for_stmt
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_for_stmt_in_inst961);
                    for_stmt58=for_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, for_stmt58.getTree());

                    }
                    break;
                case 11 :
                    // src/parser/Music.g:93:17: if_stmt
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_if_stmt_in_inst979);
                    if_stmt59=if_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, if_stmt59.getTree());

                    }
                    break;
                case 12 :
                    // src/parser/Music.g:94:17: song
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_song_in_inst997);
                    song60=song();

                    state._fsp--;

                    adaptor.addChild(root_0, song60.getTree());

                    }
                    break;
                case 13 :
                    // src/parser/Music.g:95:17: compas_list
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_compas_list_in_inst1015);
                    compas_list61=compas_list();

                    state._fsp--;

                    adaptor.addChild(root_0, compas_list61.getTree());

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
    // src/parser/Music.g:98:1: music_inst : ( declaration | tone ';' !| beat ';' !| speed ';' !| instrument ';' !| var_funcall | assignation | while_music_stmt | funcall | for_music_stmt | if_music_stmt | song | ( options {greedy=true; } : notes_group )+ ( ';' !)? );
    public final MusicParser.music_inst_return music_inst() throws RecognitionException {
        MusicParser.music_inst_return retval = new MusicParser.music_inst_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal64=null;
        Token char_literal66=null;
        Token char_literal68=null;
        Token char_literal70=null;
        Token char_literal79=null;
        MusicParser.declaration_return declaration62 =null;

        MusicParser.tone_return tone63 =null;

        MusicParser.beat_return beat65 =null;

        MusicParser.speed_return speed67 =null;

        MusicParser.instrument_return instrument69 =null;

        MusicParser.var_funcall_return var_funcall71 =null;

        MusicParser.assignation_return assignation72 =null;

        MusicParser.while_music_stmt_return while_music_stmt73 =null;

        MusicParser.funcall_return funcall74 =null;

        MusicParser.for_music_stmt_return for_music_stmt75 =null;

        MusicParser.if_music_stmt_return if_music_stmt76 =null;

        MusicParser.song_return song77 =null;

        MusicParser.notes_group_return notes_group78 =null;


        AmlTree char_literal64_tree=null;
        AmlTree char_literal66_tree=null;
        AmlTree char_literal68_tree=null;
        AmlTree char_literal70_tree=null;
        AmlTree char_literal79_tree=null;

        try {
            // src/parser/Music.g:98:13: ( declaration | tone ';' !| beat ';' !| speed ';' !| instrument ';' !| var_funcall | assignation | while_music_stmt | funcall | for_music_stmt | if_music_stmt | song | ( options {greedy=true; } : notes_group )+ ( ';' !)? )
            int alt16=13;
            switch ( input.LA(1) ) {
            case CHORD:
                {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==84) ) {
                    alt16=13;
                }
                else if ( (LA16_1==ID||LA16_1==LETTER_X) ) {
                    alt16=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;

                }
                }
                break;
            case TONE:
                {
                alt16=2;
                }
                break;
            case BEAT:
                {
                alt16=3;
                }
                break;
            case SPEED:
                {
                alt16=4;
                }
                break;
            case INSTRUMENT:
                {
                alt16=5;
                }
                break;
            case ID:
            case LETTER_X:
                {
                switch ( input.LA(2) ) {
                case 87:
                    {
                    int LA16_14 = input.LA(3);

                    if ( (LA16_14==ID||LA16_14==LETTER_X) ) {
                        int LA16_16 = input.LA(4);

                        if ( (LA16_16==84) ) {
                            alt16=6;
                        }
                        else if ( (LA16_16==ASSIG||LA16_16==DECR||LA16_16==DIVIDE_ASSIG||LA16_16==INCR||LA16_16==MINUS_ASSIG||LA16_16==MOD_ASSIG||LA16_16==PLUS_ASSIG||LA16_16==PROD_ASSIG) ) {
                            alt16=7;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 16, 16, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 14, input);

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
                    alt16=7;
                    }
                    break;
                case 84:
                    {
                    alt16=9;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 6, input);

                    throw nvae;

                }

                }
                break;
            case DECR:
            case INCR:
                {
                alt16=7;
                }
                break;
            case WHILE:
                {
                alt16=8;
                }
                break;
            case FOR:
                {
                alt16=10;
                }
                break;
            case IF:
                {
                alt16=11;
                }
                break;
            case SONG:
                {
                alt16=12;
                }
                break;
            case BOOL:
            case INT:
            case NOTE_TYPE:
                {
                alt16=1;
                }
                break;
            case BEMOL:
            case NOTE:
            case SUSTAIN:
            case 84:
                {
                alt16=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }

            switch (alt16) {
                case 1 :
                    // src/parser/Music.g:98:17: declaration
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_declaration_in_music_inst1039);
                    declaration62=declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, declaration62.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:99:17: tone ';' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_tone_in_music_inst1057);
                    tone63=tone();

                    state._fsp--;

                    adaptor.addChild(root_0, tone63.getTree());

                    char_literal64=(Token)match(input,89,FOLLOW_89_in_music_inst1059); 

                    }
                    break;
                case 3 :
                    // src/parser/Music.g:100:17: beat ';' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_beat_in_music_inst1078);
                    beat65=beat();

                    state._fsp--;

                    adaptor.addChild(root_0, beat65.getTree());

                    char_literal66=(Token)match(input,89,FOLLOW_89_in_music_inst1080); 

                    }
                    break;
                case 4 :
                    // src/parser/Music.g:101:17: speed ';' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_speed_in_music_inst1099);
                    speed67=speed();

                    state._fsp--;

                    adaptor.addChild(root_0, speed67.getTree());

                    char_literal68=(Token)match(input,89,FOLLOW_89_in_music_inst1101); 

                    }
                    break;
                case 5 :
                    // src/parser/Music.g:102:17: instrument ';' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_instrument_in_music_inst1120);
                    instrument69=instrument();

                    state._fsp--;

                    adaptor.addChild(root_0, instrument69.getTree());

                    char_literal70=(Token)match(input,89,FOLLOW_89_in_music_inst1122); 

                    }
                    break;
                case 6 :
                    // src/parser/Music.g:103:17: var_funcall
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_var_funcall_in_music_inst1141);
                    var_funcall71=var_funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, var_funcall71.getTree());

                    }
                    break;
                case 7 :
                    // src/parser/Music.g:104:17: assignation
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_assignation_in_music_inst1159);
                    assignation72=assignation();

                    state._fsp--;

                    adaptor.addChild(root_0, assignation72.getTree());

                    }
                    break;
                case 8 :
                    // src/parser/Music.g:105:17: while_music_stmt
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_while_music_stmt_in_music_inst1177);
                    while_music_stmt73=while_music_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, while_music_stmt73.getTree());

                    }
                    break;
                case 9 :
                    // src/parser/Music.g:106:17: funcall
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_music_inst1195);
                    funcall74=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall74.getTree());

                    }
                    break;
                case 10 :
                    // src/parser/Music.g:107:17: for_music_stmt
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_for_music_stmt_in_music_inst1213);
                    for_music_stmt75=for_music_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, for_music_stmt75.getTree());

                    }
                    break;
                case 11 :
                    // src/parser/Music.g:108:17: if_music_stmt
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_if_music_stmt_in_music_inst1231);
                    if_music_stmt76=if_music_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, if_music_stmt76.getTree());

                    }
                    break;
                case 12 :
                    // src/parser/Music.g:109:17: song
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_song_in_music_inst1249);
                    song77=song();

                    state._fsp--;

                    adaptor.addChild(root_0, song77.getTree());

                    }
                    break;
                case 13 :
                    // src/parser/Music.g:110:16: ( options {greedy=true; } : notes_group )+ ( ';' !)?
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    // src/parser/Music.g:110:16: ( options {greedy=true; } : notes_group )+
                    int cnt14=0;
                    loop14:
                    do {
                        int alt14=2;
                        switch ( input.LA(1) ) {
                        case CHORD:
                            {
                            alt14=1;
                            }
                            break;
                        case 84:
                            {
                            alt14=1;
                            }
                            break;
                        case BEMOL:
                        case SUSTAIN:
                            {
                            alt14=1;
                            }
                            break;
                        case NOTE:
                            {
                            alt14=1;
                            }
                            break;

                        }

                        switch (alt14) {
                    	case 1 :
                    	    // src/parser/Music.g:110:42: notes_group
                    	    {
                    	    pushFollow(FOLLOW_notes_group_in_music_inst1276);
                    	    notes_group78=notes_group();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, notes_group78.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt14 >= 1 ) break loop14;
                                EarlyExitException eee =
                                    new EarlyExitException(14, input);
                                throw eee;
                        }
                        cnt14++;
                    } while (true);


                    // src/parser/Music.g:110:59: ( ';' !)?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==89) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // src/parser/Music.g:110:59: ';' !
                            {
                            char_literal79=(Token)match(input,89,FOLLOW_89_in_music_inst1280); 

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
    // src/parser/Music.g:113:1: declaration : type ^ assig_opt ( ',' ! assig_opt )* ';' !;
    public final MusicParser.declaration_return declaration() throws RecognitionException {
        MusicParser.declaration_return retval = new MusicParser.declaration_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal82=null;
        Token char_literal84=null;
        MusicParser.type_return type80 =null;

        MusicParser.assig_opt_return assig_opt81 =null;

        MusicParser.assig_opt_return assig_opt83 =null;


        AmlTree char_literal82_tree=null;
        AmlTree char_literal84_tree=null;

        try {
            // src/parser/Music.g:113:13: ( type ^ assig_opt ( ',' ! assig_opt )* ';' !)
            // src/parser/Music.g:113:17: type ^ assig_opt ( ',' ! assig_opt )* ';' !
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_type_in_declaration1305);
            type80=type();

            state._fsp--;

            root_0 = (AmlTree)adaptor.becomeRoot(type80.getTree(), root_0);

            pushFollow(FOLLOW_assig_opt_in_declaration1308);
            assig_opt81=assig_opt();

            state._fsp--;

            adaptor.addChild(root_0, assig_opt81.getTree());

            // src/parser/Music.g:113:33: ( ',' ! assig_opt )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==86) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // src/parser/Music.g:113:34: ',' ! assig_opt
            	    {
            	    char_literal82=(Token)match(input,86,FOLLOW_86_in_declaration1311); 

            	    pushFollow(FOLLOW_assig_opt_in_declaration1314);
            	    assig_opt83=assig_opt();

            	    state._fsp--;

            	    adaptor.addChild(root_0, assig_opt83.getTree());

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            char_literal84=(Token)match(input,89,FOLLOW_89_in_declaration1318); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:116:1: type : ( INT | BOOL | NOTE_TYPE | CHORD );
    public final MusicParser.type_return type() throws RecognitionException {
        MusicParser.type_return retval = new MusicParser.type_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token set85=null;

        AmlTree set85_tree=null;

        try {
            // src/parser/Music.g:116:13: ( INT | BOOL | NOTE_TYPE | CHORD )
            // src/parser/Music.g:
            {
            root_0 = (AmlTree)adaptor.nil();


            set85=(Token)input.LT(1);

            if ( input.LA(1)==BOOL||input.LA(1)==CHORD||input.LA(1)==INT||input.LA(1)==NOTE_TYPE ) {
                input.consume();
                adaptor.addChild(root_0, 
                (AmlTree)adaptor.create(set85)
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
    // src/parser/Music.g:122:1: type_void : ( type | VOID );
    public final MusicParser.type_void_return type_void() throws RecognitionException {
        MusicParser.type_void_return retval = new MusicParser.type_void_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token VOID87=null;
        MusicParser.type_return type86 =null;


        AmlTree VOID87_tree=null;

        try {
            // src/parser/Music.g:122:13: ( type | VOID )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==BOOL||LA18_0==CHORD||LA18_0==INT||LA18_0==NOTE_TYPE) ) {
                alt18=1;
            }
            else if ( (LA18_0==VOID) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }
            switch (alt18) {
                case 1 :
                    // src/parser/Music.g:122:17: type
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_type_in_type_void1428);
                    type86=type();

                    state._fsp--;

                    adaptor.addChild(root_0, type86.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:123:17: VOID
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    VOID87=(Token)match(input,VOID,FOLLOW_VOID_in_type_void1446); 
                    VOID87_tree = 
                    (AmlTree)adaptor.create(VOID87)
                    ;
                    adaptor.addChild(root_0, VOID87_tree);


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
    // src/parser/Music.g:126:1: assig_opt : id_rule ( ASSIG ^ ( expr | notes_variable ) )? ;
    public final MusicParser.assig_opt_return assig_opt() throws RecognitionException {
        MusicParser.assig_opt_return retval = new MusicParser.assig_opt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token ASSIG89=null;
        MusicParser.id_rule_return id_rule88 =null;

        MusicParser.expr_return expr90 =null;

        MusicParser.notes_variable_return notes_variable91 =null;


        AmlTree ASSIG89_tree=null;

        try {
            // src/parser/Music.g:126:13: ( id_rule ( ASSIG ^ ( expr | notes_variable ) )? )
            // src/parser/Music.g:126:17: id_rule ( ASSIG ^ ( expr | notes_variable ) )?
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_id_rule_in_assig_opt1471);
            id_rule88=id_rule();

            state._fsp--;

            adaptor.addChild(root_0, id_rule88.getTree());

            // src/parser/Music.g:126:25: ( ASSIG ^ ( expr | notes_variable ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==ASSIG) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // src/parser/Music.g:126:26: ASSIG ^ ( expr | notes_variable )
                    {
                    ASSIG89=(Token)match(input,ASSIG,FOLLOW_ASSIG_in_assig_opt1474); 
                    ASSIG89_tree = 
                    (AmlTree)adaptor.create(ASSIG89)
                    ;
                    root_0 = (AmlTree)adaptor.becomeRoot(ASSIG89_tree, root_0);


                    // src/parser/Music.g:126:33: ( expr | notes_variable )
                    int alt19=2;
                    switch ( input.LA(1) ) {
                    case FALSE:
                    case ID:
                    case LETTER_X:
                    case MINUS:
                    case NOT:
                    case NUM:
                    case PLUS:
                    case TRUE:
                        {
                        alt19=1;
                        }
                        break;
                    case 84:
                        {
                        int LA19_2 = input.LA(2);

                        if ( (LA19_2==FALSE||LA19_2==ID||LA19_2==LETTER_X||LA19_2==MINUS||LA19_2==NOT||LA19_2==NUM||LA19_2==PLUS||LA19_2==TRUE||LA19_2==84) ) {
                            alt19=1;
                        }
                        else if ( (LA19_2==BEMOL||LA19_2==NOTE||LA19_2==SUSTAIN) ) {
                            alt19=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 19, 2, input);

                            throw nvae;

                        }
                        }
                        break;
                    case BEMOL:
                    case CHORD:
                    case NOTE:
                    case SUSTAIN:
                        {
                        alt19=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 0, input);

                        throw nvae;

                    }

                    switch (alt19) {
                        case 1 :
                            // src/parser/Music.g:126:34: expr
                            {
                            pushFollow(FOLLOW_expr_in_assig_opt1478);
                            expr90=expr();

                            state._fsp--;

                            adaptor.addChild(root_0, expr90.getTree());

                            }
                            break;
                        case 2 :
                            // src/parser/Music.g:126:41: notes_variable
                            {
                            pushFollow(FOLLOW_notes_variable_in_assig_opt1482);
                            notes_variable91=notes_variable();

                            state._fsp--;

                            adaptor.addChild(root_0, notes_variable91.getTree());

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
    // src/parser/Music.g:129:1: assignation : assig ';' !;
    public final MusicParser.assignation_return assignation() throws RecognitionException {
        MusicParser.assignation_return retval = new MusicParser.assignation_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal93=null;
        MusicParser.assig_return assig92 =null;


        AmlTree char_literal93_tree=null;

        try {
            // src/parser/Music.g:129:13: ( assig ';' !)
            // src/parser/Music.g:129:17: assig ';' !
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_assig_in_assignation1508);
            assig92=assig();

            state._fsp--;

            adaptor.addChild(root_0, assig92.getTree());

            char_literal93=(Token)match(input,89,FOLLOW_89_in_assignation1510); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:132:1: assig : ( var_access ( ASSIG | PLUS_ASSIG | MINUS_ASSIG | PROD_ASSIG | DIVIDE_ASSIG | MOD_ASSIG ) ^ ( expr | notes_variable | FIGURE ) | post | pre );
    public final MusicParser.assig_return assig() throws RecognitionException {
        MusicParser.assig_return retval = new MusicParser.assig_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token set95=null;
        Token FIGURE98=null;
        MusicParser.var_access_return var_access94 =null;

        MusicParser.expr_return expr96 =null;

        MusicParser.notes_variable_return notes_variable97 =null;

        MusicParser.post_return post99 =null;

        MusicParser.pre_return pre100 =null;


        AmlTree set95_tree=null;
        AmlTree FIGURE98_tree=null;

        try {
            // src/parser/Music.g:132:13: ( var_access ( ASSIG | PLUS_ASSIG | MINUS_ASSIG | PROD_ASSIG | DIVIDE_ASSIG | MOD_ASSIG ) ^ ( expr | notes_variable | FIGURE ) | post | pre )
            int alt22=3;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==ID||LA22_0==LETTER_X) ) {
                switch ( input.LA(2) ) {
                case 87:
                    {
                    int LA22_3 = input.LA(3);

                    if ( (LA22_3==ID||LA22_3==LETTER_X) ) {
                        int LA22_6 = input.LA(4);

                        if ( (LA22_6==ASSIG||LA22_6==DIVIDE_ASSIG||LA22_6==MINUS_ASSIG||LA22_6==MOD_ASSIG||LA22_6==PLUS_ASSIG||LA22_6==PROD_ASSIG) ) {
                            alt22=1;
                        }
                        else if ( (LA22_6==DECR||LA22_6==INCR) ) {
                            alt22=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 22, 6, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 3, input);

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
                    alt22=1;
                    }
                    break;
                case DECR:
                case INCR:
                    {
                    alt22=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 1, input);

                    throw nvae;

                }

            }
            else if ( (LA22_0==DECR||LA22_0==INCR) ) {
                alt22=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }
            switch (alt22) {
                case 1 :
                    // src/parser/Music.g:132:17: var_access ( ASSIG | PLUS_ASSIG | MINUS_ASSIG | PROD_ASSIG | DIVIDE_ASSIG | MOD_ASSIG ) ^ ( expr | notes_variable | FIGURE )
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_var_access_in_assig1540);
                    var_access94=var_access();

                    state._fsp--;

                    adaptor.addChild(root_0, var_access94.getTree());

                    set95=(Token)input.LT(1);

                    set95=(Token)input.LT(1);

                    if ( input.LA(1)==ASSIG||input.LA(1)==DIVIDE_ASSIG||input.LA(1)==MINUS_ASSIG||input.LA(1)==MOD_ASSIG||input.LA(1)==PLUS_ASSIG||input.LA(1)==PROD_ASSIG ) {
                        input.consume();
                        root_0 = (AmlTree)adaptor.becomeRoot(
                        (AmlTree)adaptor.create(set95)
                        , root_0);
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    // src/parser/Music.g:132:94: ( expr | notes_variable | FIGURE )
                    int alt21=3;
                    switch ( input.LA(1) ) {
                    case FALSE:
                    case ID:
                    case LETTER_X:
                    case MINUS:
                    case NOT:
                    case NUM:
                    case PLUS:
                    case TRUE:
                        {
                        alt21=1;
                        }
                        break;
                    case 84:
                        {
                        int LA21_2 = input.LA(2);

                        if ( (LA21_2==FALSE||LA21_2==ID||LA21_2==LETTER_X||LA21_2==MINUS||LA21_2==NOT||LA21_2==NUM||LA21_2==PLUS||LA21_2==TRUE||LA21_2==84) ) {
                            alt21=1;
                        }
                        else if ( (LA21_2==BEMOL||LA21_2==NOTE||LA21_2==SUSTAIN) ) {
                            alt21=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 21, 2, input);

                            throw nvae;

                        }
                        }
                        break;
                    case BEMOL:
                    case CHORD:
                    case NOTE:
                    case SUSTAIN:
                        {
                        alt21=2;
                        }
                        break;
                    case FIGURE:
                        {
                        alt21=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 0, input);

                        throw nvae;

                    }

                    switch (alt21) {
                        case 1 :
                            // src/parser/Music.g:132:95: expr
                            {
                            pushFollow(FOLLOW_expr_in_assig1558);
                            expr96=expr();

                            state._fsp--;

                            adaptor.addChild(root_0, expr96.getTree());

                            }
                            break;
                        case 2 :
                            // src/parser/Music.g:132:102: notes_variable
                            {
                            pushFollow(FOLLOW_notes_variable_in_assig1562);
                            notes_variable97=notes_variable();

                            state._fsp--;

                            adaptor.addChild(root_0, notes_variable97.getTree());

                            }
                            break;
                        case 3 :
                            // src/parser/Music.g:132:119: FIGURE
                            {
                            FIGURE98=(Token)match(input,FIGURE,FOLLOW_FIGURE_in_assig1566); 
                            FIGURE98_tree = 
                            (AmlTree)adaptor.create(FIGURE98)
                            ;
                            adaptor.addChild(root_0, FIGURE98_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // src/parser/Music.g:133:17: post
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_post_in_assig1585);
                    post99=post();

                    state._fsp--;

                    adaptor.addChild(root_0, post99.getTree());

                    }
                    break;
                case 3 :
                    // src/parser/Music.g:134:17: pre
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_pre_in_assig1603);
                    pre100=pre();

                    state._fsp--;

                    adaptor.addChild(root_0, pre100.getTree());

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
    // src/parser/Music.g:137:1: post : var_access (x= INCR |x= DECR ) -> ^( POST var_access $x) ;
    public final MusicParser.post_return post() throws RecognitionException {
        MusicParser.post_return retval = new MusicParser.post_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token x=null;
        MusicParser.var_access_return var_access101 =null;


        AmlTree x_tree=null;
        RewriteRuleTokenStream stream_INCR=new RewriteRuleTokenStream(adaptor,"token INCR");
        RewriteRuleTokenStream stream_DECR=new RewriteRuleTokenStream(adaptor,"token DECR");
        RewriteRuleSubtreeStream stream_var_access=new RewriteRuleSubtreeStream(adaptor,"rule var_access");
        try {
            // src/parser/Music.g:137:13: ( var_access (x= INCR |x= DECR ) -> ^( POST var_access $x) )
            // src/parser/Music.g:137:17: var_access (x= INCR |x= DECR )
            {
            pushFollow(FOLLOW_var_access_in_post1633);
            var_access101=var_access();

            state._fsp--;

            stream_var_access.add(var_access101.getTree());

            // src/parser/Music.g:137:28: (x= INCR |x= DECR )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==INCR) ) {
                alt23=1;
            }
            else if ( (LA23_0==DECR) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }
            switch (alt23) {
                case 1 :
                    // src/parser/Music.g:137:29: x= INCR
                    {
                    x=(Token)match(input,INCR,FOLLOW_INCR_in_post1638);  
                    stream_INCR.add(x);


                    }
                    break;
                case 2 :
                    // src/parser/Music.g:137:38: x= DECR
                    {
                    x=(Token)match(input,DECR,FOLLOW_DECR_in_post1644);  
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
            // 137:46: -> ^( POST var_access $x)
            {
                // src/parser/Music.g:137:50: ^( POST var_access $x)
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
    // src/parser/Music.g:140:1: pre : (x= INCR |x= DECR ) var_access -> ^( PRE var_access $x) ;
    public final MusicParser.pre_return pre() throws RecognitionException {
        MusicParser.pre_return retval = new MusicParser.pre_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token x=null;
        MusicParser.var_access_return var_access102 =null;


        AmlTree x_tree=null;
        RewriteRuleTokenStream stream_INCR=new RewriteRuleTokenStream(adaptor,"token INCR");
        RewriteRuleTokenStream stream_DECR=new RewriteRuleTokenStream(adaptor,"token DECR");
        RewriteRuleSubtreeStream stream_var_access=new RewriteRuleSubtreeStream(adaptor,"rule var_access");
        try {
            // src/parser/Music.g:140:13: ( (x= INCR |x= DECR ) var_access -> ^( PRE var_access $x) )
            // src/parser/Music.g:140:17: (x= INCR |x= DECR ) var_access
            {
            // src/parser/Music.g:140:17: (x= INCR |x= DECR )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==INCR) ) {
                alt24=1;
            }
            else if ( (LA24_0==DECR) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;

            }
            switch (alt24) {
                case 1 :
                    // src/parser/Music.g:140:18: x= INCR
                    {
                    x=(Token)match(input,INCR,FOLLOW_INCR_in_pre1691);  
                    stream_INCR.add(x);


                    }
                    break;
                case 2 :
                    // src/parser/Music.g:140:27: x= DECR
                    {
                    x=(Token)match(input,DECR,FOLLOW_DECR_in_pre1697);  
                    stream_DECR.add(x);


                    }
                    break;

            }


            pushFollow(FOLLOW_var_access_in_pre1700);
            var_access102=var_access();

            state._fsp--;

            stream_var_access.add(var_access102.getTree());

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
            // 140:47: -> ^( PRE var_access $x)
            {
                // src/parser/Music.g:140:50: ^( PRE var_access $x)
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
    // src/parser/Music.g:143:1: beat : BEAT ^ NUM ':' ! NUM ;
    public final MusicParser.beat_return beat() throws RecognitionException {
        MusicParser.beat_return retval = new MusicParser.beat_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token BEAT103=null;
        Token NUM104=null;
        Token char_literal105=null;
        Token NUM106=null;

        AmlTree BEAT103_tree=null;
        AmlTree NUM104_tree=null;
        AmlTree char_literal105_tree=null;
        AmlTree NUM106_tree=null;

        try {
            // src/parser/Music.g:143:13: ( BEAT ^ NUM ':' ! NUM )
            // src/parser/Music.g:143:17: BEAT ^ NUM ':' ! NUM
            {
            root_0 = (AmlTree)adaptor.nil();


            BEAT103=(Token)match(input,BEAT,FOLLOW_BEAT_in_beat1743); 
            BEAT103_tree = 
            (AmlTree)adaptor.create(BEAT103)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(BEAT103_tree, root_0);


            NUM104=(Token)match(input,NUM,FOLLOW_NUM_in_beat1746); 
            NUM104_tree = 
            (AmlTree)adaptor.create(NUM104)
            ;
            adaptor.addChild(root_0, NUM104_tree);


            char_literal105=(Token)match(input,88,FOLLOW_88_in_beat1748); 

            NUM106=(Token)match(input,NUM,FOLLOW_NUM_in_beat1751); 
            NUM106_tree = 
            (AmlTree)adaptor.create(NUM106)
            ;
            adaptor.addChild(root_0, NUM106_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:146:1: speed : SPEED ^ NUM ;
    public final MusicParser.speed_return speed() throws RecognitionException {
        MusicParser.speed_return retval = new MusicParser.speed_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token SPEED107=null;
        Token NUM108=null;

        AmlTree SPEED107_tree=null;
        AmlTree NUM108_tree=null;

        try {
            // src/parser/Music.g:146:13: ( SPEED ^ NUM )
            // src/parser/Music.g:146:17: SPEED ^ NUM
            {
            root_0 = (AmlTree)adaptor.nil();


            SPEED107=(Token)match(input,SPEED,FOLLOW_SPEED_in_speed1780); 
            SPEED107_tree = 
            (AmlTree)adaptor.create(SPEED107)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(SPEED107_tree, root_0);


            NUM108=(Token)match(input,NUM,FOLLOW_NUM_in_speed1783); 
            NUM108_tree = 
            (AmlTree)adaptor.create(NUM108)
            ;
            adaptor.addChild(root_0, NUM108_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:149:1: transport : TRANSPORT ^ NUM ';' ;
    public final MusicParser.transport_return transport() throws RecognitionException {
        MusicParser.transport_return retval = new MusicParser.transport_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token TRANSPORT109=null;
        Token NUM110=null;
        Token char_literal111=null;

        AmlTree TRANSPORT109_tree=null;
        AmlTree NUM110_tree=null;
        AmlTree char_literal111_tree=null;

        try {
            // src/parser/Music.g:149:13: ( TRANSPORT ^ NUM ';' )
            // src/parser/Music.g:149:17: TRANSPORT ^ NUM ';'
            {
            root_0 = (AmlTree)adaptor.nil();


            TRANSPORT109=(Token)match(input,TRANSPORT,FOLLOW_TRANSPORT_in_transport1808); 
            TRANSPORT109_tree = 
            (AmlTree)adaptor.create(TRANSPORT109)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(TRANSPORT109_tree, root_0);


            NUM110=(Token)match(input,NUM,FOLLOW_NUM_in_transport1811); 
            NUM110_tree = 
            (AmlTree)adaptor.create(NUM110)
            ;
            adaptor.addChild(root_0, NUM110_tree);


            char_literal111=(Token)match(input,89,FOLLOW_89_in_transport1813); 
            char_literal111_tree = 
            (AmlTree)adaptor.create(char_literal111)
            ;
            adaptor.addChild(root_0, char_literal111_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:152:1: instrument : INSTRUMENT ^ STRING ';' ;
    public final MusicParser.instrument_return instrument() throws RecognitionException {
        MusicParser.instrument_return retval = new MusicParser.instrument_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token INSTRUMENT112=null;
        Token STRING113=null;
        Token char_literal114=null;

        AmlTree INSTRUMENT112_tree=null;
        AmlTree STRING113_tree=null;
        AmlTree char_literal114_tree=null;

        try {
            // src/parser/Music.g:152:13: ( INSTRUMENT ^ STRING ';' )
            // src/parser/Music.g:152:17: INSTRUMENT ^ STRING ';'
            {
            root_0 = (AmlTree)adaptor.nil();


            INSTRUMENT112=(Token)match(input,INSTRUMENT,FOLLOW_INSTRUMENT_in_instrument1837); 
            INSTRUMENT112_tree = 
            (AmlTree)adaptor.create(INSTRUMENT112)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(INSTRUMENT112_tree, root_0);


            STRING113=(Token)match(input,STRING,FOLLOW_STRING_in_instrument1840); 
            STRING113_tree = 
            (AmlTree)adaptor.create(STRING113)
            ;
            adaptor.addChild(root_0, STRING113_tree);


            char_literal114=(Token)match(input,89,FOLLOW_89_in_instrument1842); 
            char_literal114_tree = 
            (AmlTree)adaptor.create(char_literal114)
            ;
            adaptor.addChild(root_0, char_literal114_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:155:1: while_stmt : WHILE ^ '(' ! expr ')' ! '{' ! listInst '}' !;
    public final MusicParser.while_stmt_return while_stmt() throws RecognitionException {
        MusicParser.while_stmt_return retval = new MusicParser.while_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token WHILE115=null;
        Token char_literal116=null;
        Token char_literal118=null;
        Token char_literal119=null;
        Token char_literal121=null;
        MusicParser.expr_return expr117 =null;

        MusicParser.listInst_return listInst120 =null;


        AmlTree WHILE115_tree=null;
        AmlTree char_literal116_tree=null;
        AmlTree char_literal118_tree=null;
        AmlTree char_literal119_tree=null;
        AmlTree char_literal121_tree=null;

        try {
            // src/parser/Music.g:155:13: ( WHILE ^ '(' ! expr ')' ! '{' ! listInst '}' !)
            // src/parser/Music.g:155:17: WHILE ^ '(' ! expr ')' ! '{' ! listInst '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            WHILE115=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_stmt1866); 
            WHILE115_tree = 
            (AmlTree)adaptor.create(WHILE115)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(WHILE115_tree, root_0);


            char_literal116=(Token)match(input,84,FOLLOW_84_in_while_stmt1869); 

            pushFollow(FOLLOW_expr_in_while_stmt1872);
            expr117=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr117.getTree());

            char_literal118=(Token)match(input,85,FOLLOW_85_in_while_stmt1874); 

            char_literal119=(Token)match(input,90,FOLLOW_90_in_while_stmt1877); 

            pushFollow(FOLLOW_listInst_in_while_stmt1880);
            listInst120=listInst();

            state._fsp--;

            adaptor.addChild(root_0, listInst120.getTree());

            char_literal121=(Token)match(input,91,FOLLOW_91_in_while_stmt1882); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:158:1: while_music_stmt : WHILE ^ '(' ! expr ')' ! '{' ! list_music_inst '}' !;
    public final MusicParser.while_music_stmt_return while_music_stmt() throws RecognitionException {
        MusicParser.while_music_stmt_return retval = new MusicParser.while_music_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token WHILE122=null;
        Token char_literal123=null;
        Token char_literal125=null;
        Token char_literal126=null;
        Token char_literal128=null;
        MusicParser.expr_return expr124 =null;

        MusicParser.list_music_inst_return list_music_inst127 =null;


        AmlTree WHILE122_tree=null;
        AmlTree char_literal123_tree=null;
        AmlTree char_literal125_tree=null;
        AmlTree char_literal126_tree=null;
        AmlTree char_literal128_tree=null;

        try {
            // src/parser/Music.g:158:21: ( WHILE ^ '(' ! expr ')' ! '{' ! list_music_inst '}' !)
            // src/parser/Music.g:158:25: WHILE ^ '(' ! expr ')' ! '{' ! list_music_inst '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            WHILE122=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_music_stmt1909); 
            WHILE122_tree = 
            (AmlTree)adaptor.create(WHILE122)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(WHILE122_tree, root_0);


            char_literal123=(Token)match(input,84,FOLLOW_84_in_while_music_stmt1912); 

            pushFollow(FOLLOW_expr_in_while_music_stmt1915);
            expr124=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr124.getTree());

            char_literal125=(Token)match(input,85,FOLLOW_85_in_while_music_stmt1917); 

            char_literal126=(Token)match(input,90,FOLLOW_90_in_while_music_stmt1920); 

            pushFollow(FOLLOW_list_music_inst_in_while_music_stmt1923);
            list_music_inst127=list_music_inst();

            state._fsp--;

            adaptor.addChild(root_0, list_music_inst127.getTree());

            char_literal128=(Token)match(input,91,FOLLOW_91_in_while_music_stmt1925); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:161:1: for_stmt : FOR ^ '(' ! ( declaration | list_assig ';' !) expr ';' ! list_assig ')' ! '{' ! listInst '}' !;
    public final MusicParser.for_stmt_return for_stmt() throws RecognitionException {
        MusicParser.for_stmt_return retval = new MusicParser.for_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token FOR129=null;
        Token char_literal130=null;
        Token char_literal133=null;
        Token char_literal135=null;
        Token char_literal137=null;
        Token char_literal138=null;
        Token char_literal140=null;
        MusicParser.declaration_return declaration131 =null;

        MusicParser.list_assig_return list_assig132 =null;

        MusicParser.expr_return expr134 =null;

        MusicParser.list_assig_return list_assig136 =null;

        MusicParser.listInst_return listInst139 =null;


        AmlTree FOR129_tree=null;
        AmlTree char_literal130_tree=null;
        AmlTree char_literal133_tree=null;
        AmlTree char_literal135_tree=null;
        AmlTree char_literal137_tree=null;
        AmlTree char_literal138_tree=null;
        AmlTree char_literal140_tree=null;

        try {
            // src/parser/Music.g:161:13: ( FOR ^ '(' ! ( declaration | list_assig ';' !) expr ';' ! list_assig ')' ! '{' ! listInst '}' !)
            // src/parser/Music.g:161:17: FOR ^ '(' ! ( declaration | list_assig ';' !) expr ';' ! list_assig ')' ! '{' ! listInst '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            FOR129=(Token)match(input,FOR,FOLLOW_FOR_in_for_stmt1960); 
            FOR129_tree = 
            (AmlTree)adaptor.create(FOR129)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(FOR129_tree, root_0);


            char_literal130=(Token)match(input,84,FOLLOW_84_in_for_stmt1963); 

            // src/parser/Music.g:161:27: ( declaration | list_assig ';' !)
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==BOOL||LA25_0==CHORD||LA25_0==INT||LA25_0==NOTE_TYPE) ) {
                alt25=1;
            }
            else if ( (LA25_0==DECR||LA25_0==ID||LA25_0==INCR||LA25_0==LETTER_X) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;

            }
            switch (alt25) {
                case 1 :
                    // src/parser/Music.g:161:28: declaration
                    {
                    pushFollow(FOLLOW_declaration_in_for_stmt1967);
                    declaration131=declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, declaration131.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:161:42: list_assig ';' !
                    {
                    pushFollow(FOLLOW_list_assig_in_for_stmt1971);
                    list_assig132=list_assig();

                    state._fsp--;

                    adaptor.addChild(root_0, list_assig132.getTree());

                    char_literal133=(Token)match(input,89,FOLLOW_89_in_for_stmt1973); 

                    }
                    break;

            }


            pushFollow(FOLLOW_expr_in_for_stmt1977);
            expr134=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr134.getTree());

            char_literal135=(Token)match(input,89,FOLLOW_89_in_for_stmt1979); 

            pushFollow(FOLLOW_list_assig_in_for_stmt1982);
            list_assig136=list_assig();

            state._fsp--;

            adaptor.addChild(root_0, list_assig136.getTree());

            char_literal137=(Token)match(input,85,FOLLOW_85_in_for_stmt1984); 

            char_literal138=(Token)match(input,90,FOLLOW_90_in_for_stmt1987); 

            pushFollow(FOLLOW_listInst_in_for_stmt1990);
            listInst139=listInst();

            state._fsp--;

            adaptor.addChild(root_0, listInst139.getTree());

            char_literal140=(Token)match(input,91,FOLLOW_91_in_for_stmt1992); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:164:1: for_music_stmt : FOR ^ '(' ! ( declaration | list_assig ';' !) expr ';' ! list_assig ')' ! '{' ! list_music_inst '}' !;
    public final MusicParser.for_music_stmt_return for_music_stmt() throws RecognitionException {
        MusicParser.for_music_stmt_return retval = new MusicParser.for_music_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token FOR141=null;
        Token char_literal142=null;
        Token char_literal145=null;
        Token char_literal147=null;
        Token char_literal149=null;
        Token char_literal150=null;
        Token char_literal152=null;
        MusicParser.declaration_return declaration143 =null;

        MusicParser.list_assig_return list_assig144 =null;

        MusicParser.expr_return expr146 =null;

        MusicParser.list_assig_return list_assig148 =null;

        MusicParser.list_music_inst_return list_music_inst151 =null;


        AmlTree FOR141_tree=null;
        AmlTree char_literal142_tree=null;
        AmlTree char_literal145_tree=null;
        AmlTree char_literal147_tree=null;
        AmlTree char_literal149_tree=null;
        AmlTree char_literal150_tree=null;
        AmlTree char_literal152_tree=null;

        try {
            // src/parser/Music.g:164:17: ( FOR ^ '(' ! ( declaration | list_assig ';' !) expr ';' ! list_assig ')' ! '{' ! list_music_inst '}' !)
            // src/parser/Music.g:164:21: FOR ^ '(' ! ( declaration | list_assig ';' !) expr ';' ! list_assig ')' ! '{' ! list_music_inst '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            FOR141=(Token)match(input,FOR,FOLLOW_FOR_in_for_music_stmt2017); 
            FOR141_tree = 
            (AmlTree)adaptor.create(FOR141)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(FOR141_tree, root_0);


            char_literal142=(Token)match(input,84,FOLLOW_84_in_for_music_stmt2020); 

            // src/parser/Music.g:164:31: ( declaration | list_assig ';' !)
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==BOOL||LA26_0==CHORD||LA26_0==INT||LA26_0==NOTE_TYPE) ) {
                alt26=1;
            }
            else if ( (LA26_0==DECR||LA26_0==ID||LA26_0==INCR||LA26_0==LETTER_X) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;

            }
            switch (alt26) {
                case 1 :
                    // src/parser/Music.g:164:32: declaration
                    {
                    pushFollow(FOLLOW_declaration_in_for_music_stmt2024);
                    declaration143=declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, declaration143.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:164:46: list_assig ';' !
                    {
                    pushFollow(FOLLOW_list_assig_in_for_music_stmt2028);
                    list_assig144=list_assig();

                    state._fsp--;

                    adaptor.addChild(root_0, list_assig144.getTree());

                    char_literal145=(Token)match(input,89,FOLLOW_89_in_for_music_stmt2030); 

                    }
                    break;

            }


            pushFollow(FOLLOW_expr_in_for_music_stmt2034);
            expr146=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr146.getTree());

            char_literal147=(Token)match(input,89,FOLLOW_89_in_for_music_stmt2036); 

            pushFollow(FOLLOW_list_assig_in_for_music_stmt2039);
            list_assig148=list_assig();

            state._fsp--;

            adaptor.addChild(root_0, list_assig148.getTree());

            char_literal149=(Token)match(input,85,FOLLOW_85_in_for_music_stmt2041); 

            char_literal150=(Token)match(input,90,FOLLOW_90_in_for_music_stmt2044); 

            pushFollow(FOLLOW_list_music_inst_in_for_music_stmt2047);
            list_music_inst151=list_music_inst();

            state._fsp--;

            adaptor.addChild(root_0, list_music_inst151.getTree());

            char_literal152=(Token)match(input,91,FOLLOW_91_in_for_music_stmt2049); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:167:1: list_assig : assig ( ',' assig )* -> ^( LIST_ASSIG ( assig )+ ) ;
    public final MusicParser.list_assig_return list_assig() throws RecognitionException {
        MusicParser.list_assig_return retval = new MusicParser.list_assig_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal154=null;
        MusicParser.assig_return assig153 =null;

        MusicParser.assig_return assig155 =null;


        AmlTree char_literal154_tree=null;
        RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
        RewriteRuleSubtreeStream stream_assig=new RewriteRuleSubtreeStream(adaptor,"rule assig");
        try {
            // src/parser/Music.g:167:13: ( assig ( ',' assig )* -> ^( LIST_ASSIG ( assig )+ ) )
            // src/parser/Music.g:167:17: assig ( ',' assig )*
            {
            pushFollow(FOLLOW_assig_in_list_assig2078);
            assig153=assig();

            state._fsp--;

            stream_assig.add(assig153.getTree());

            // src/parser/Music.g:167:23: ( ',' assig )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==86) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // src/parser/Music.g:167:24: ',' assig
            	    {
            	    char_literal154=(Token)match(input,86,FOLLOW_86_in_list_assig2081);  
            	    stream_86.add(char_literal154);


            	    pushFollow(FOLLOW_assig_in_list_assig2083);
            	    assig155=assig();

            	    state._fsp--;

            	    stream_assig.add(assig155.getTree());

            	    }
            	    break;

            	default :
            	    break loop27;
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
            // 167:36: -> ^( LIST_ASSIG ( assig )+ )
            {
                // src/parser/Music.g:167:39: ^( LIST_ASSIG ( assig )+ )
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
    // src/parser/Music.g:170:1: if_stmt : IF ^ '(' ! expr ')' ! '{' ! listInst '}' ! ( elseif_stmt )* ( else_stmt )? ;
    public final MusicParser.if_stmt_return if_stmt() throws RecognitionException {
        MusicParser.if_stmt_return retval = new MusicParser.if_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token IF156=null;
        Token char_literal157=null;
        Token char_literal159=null;
        Token char_literal160=null;
        Token char_literal162=null;
        MusicParser.expr_return expr158 =null;

        MusicParser.listInst_return listInst161 =null;

        MusicParser.elseif_stmt_return elseif_stmt163 =null;

        MusicParser.else_stmt_return else_stmt164 =null;


        AmlTree IF156_tree=null;
        AmlTree char_literal157_tree=null;
        AmlTree char_literal159_tree=null;
        AmlTree char_literal160_tree=null;
        AmlTree char_literal162_tree=null;

        try {
            // src/parser/Music.g:170:13: ( IF ^ '(' ! expr ')' ! '{' ! listInst '}' ! ( elseif_stmt )* ( else_stmt )? )
            // src/parser/Music.g:170:17: IF ^ '(' ! expr ')' ! '{' ! listInst '}' ! ( elseif_stmt )* ( else_stmt )?
            {
            root_0 = (AmlTree)adaptor.nil();


            IF156=(Token)match(input,IF,FOLLOW_IF_in_if_stmt2121); 
            IF156_tree = 
            (AmlTree)adaptor.create(IF156)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(IF156_tree, root_0);


            char_literal157=(Token)match(input,84,FOLLOW_84_in_if_stmt2124); 

            pushFollow(FOLLOW_expr_in_if_stmt2127);
            expr158=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr158.getTree());

            char_literal159=(Token)match(input,85,FOLLOW_85_in_if_stmt2129); 

            char_literal160=(Token)match(input,90,FOLLOW_90_in_if_stmt2132); 

            pushFollow(FOLLOW_listInst_in_if_stmt2135);
            listInst161=listInst();

            state._fsp--;

            adaptor.addChild(root_0, listInst161.getTree());

            char_literal162=(Token)match(input,91,FOLLOW_91_in_if_stmt2137); 

            // src/parser/Music.g:170:55: ( elseif_stmt )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==ELSE) ) {
                    int LA28_1 = input.LA(2);

                    if ( (LA28_1==IF) ) {
                        alt28=1;
                    }


                }


                switch (alt28) {
            	case 1 :
            	    // src/parser/Music.g:170:55: elseif_stmt
            	    {
            	    pushFollow(FOLLOW_elseif_stmt_in_if_stmt2140);
            	    elseif_stmt163=elseif_stmt();

            	    state._fsp--;

            	    adaptor.addChild(root_0, elseif_stmt163.getTree());

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            // src/parser/Music.g:170:68: ( else_stmt )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==ELSE) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // src/parser/Music.g:170:68: else_stmt
                    {
                    pushFollow(FOLLOW_else_stmt_in_if_stmt2143);
                    else_stmt164=else_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, else_stmt164.getTree());

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
    // src/parser/Music.g:173:1: elseif_stmt : ELSE IF '(' expr ')' '{' listInst '}' -> ^( ELSEIF expr listInst ) ;
    public final MusicParser.elseif_stmt_return elseif_stmt() throws RecognitionException {
        MusicParser.elseif_stmt_return retval = new MusicParser.elseif_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token ELSE165=null;
        Token IF166=null;
        Token char_literal167=null;
        Token char_literal169=null;
        Token char_literal170=null;
        Token char_literal172=null;
        MusicParser.expr_return expr168 =null;

        MusicParser.listInst_return listInst171 =null;


        AmlTree ELSE165_tree=null;
        AmlTree IF166_tree=null;
        AmlTree char_literal167_tree=null;
        AmlTree char_literal169_tree=null;
        AmlTree char_literal170_tree=null;
        AmlTree char_literal172_tree=null;
        RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
        RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");
        RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_listInst=new RewriteRuleSubtreeStream(adaptor,"rule listInst");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // src/parser/Music.g:173:13: ( ELSE IF '(' expr ')' '{' listInst '}' -> ^( ELSEIF expr listInst ) )
            // src/parser/Music.g:173:17: ELSE IF '(' expr ')' '{' listInst '}'
            {
            ELSE165=(Token)match(input,ELSE,FOLLOW_ELSE_in_elseif_stmt2167);  
            stream_ELSE.add(ELSE165);


            IF166=(Token)match(input,IF,FOLLOW_IF_in_elseif_stmt2169);  
            stream_IF.add(IF166);


            char_literal167=(Token)match(input,84,FOLLOW_84_in_elseif_stmt2171);  
            stream_84.add(char_literal167);


            pushFollow(FOLLOW_expr_in_elseif_stmt2173);
            expr168=expr();

            state._fsp--;

            stream_expr.add(expr168.getTree());

            char_literal169=(Token)match(input,85,FOLLOW_85_in_elseif_stmt2175);  
            stream_85.add(char_literal169);


            char_literal170=(Token)match(input,90,FOLLOW_90_in_elseif_stmt2177);  
            stream_90.add(char_literal170);


            pushFollow(FOLLOW_listInst_in_elseif_stmt2179);
            listInst171=listInst();

            state._fsp--;

            stream_listInst.add(listInst171.getTree());

            char_literal172=(Token)match(input,91,FOLLOW_91_in_elseif_stmt2181);  
            stream_91.add(char_literal172);


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
            // 173:55: -> ^( ELSEIF expr listInst )
            {
                // src/parser/Music.g:173:58: ^( ELSEIF expr listInst )
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
    // src/parser/Music.g:176:1: else_stmt : ELSE ^ '{' ! listInst '}' !;
    public final MusicParser.else_stmt_return else_stmt() throws RecognitionException {
        MusicParser.else_stmt_return retval = new MusicParser.else_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token ELSE173=null;
        Token char_literal174=null;
        Token char_literal176=null;
        MusicParser.listInst_return listInst175 =null;


        AmlTree ELSE173_tree=null;
        AmlTree char_literal174_tree=null;
        AmlTree char_literal176_tree=null;

        try {
            // src/parser/Music.g:176:13: ( ELSE ^ '{' ! listInst '}' !)
            // src/parser/Music.g:176:17: ELSE ^ '{' ! listInst '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            ELSE173=(Token)match(input,ELSE,FOLLOW_ELSE_in_else_stmt2216); 
            ELSE173_tree = 
            (AmlTree)adaptor.create(ELSE173)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(ELSE173_tree, root_0);


            char_literal174=(Token)match(input,90,FOLLOW_90_in_else_stmt2219); 

            pushFollow(FOLLOW_listInst_in_else_stmt2222);
            listInst175=listInst();

            state._fsp--;

            adaptor.addChild(root_0, listInst175.getTree());

            char_literal176=(Token)match(input,91,FOLLOW_91_in_else_stmt2224); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:179:1: if_music_stmt : IF ^ '(' ! expr ')' ! '{' ! list_music_inst '}' ! ( elseif_music_stmt )* ( else_music_stmt )? ;
    public final MusicParser.if_music_stmt_return if_music_stmt() throws RecognitionException {
        MusicParser.if_music_stmt_return retval = new MusicParser.if_music_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token IF177=null;
        Token char_literal178=null;
        Token char_literal180=null;
        Token char_literal181=null;
        Token char_literal183=null;
        MusicParser.expr_return expr179 =null;

        MusicParser.list_music_inst_return list_music_inst182 =null;

        MusicParser.elseif_music_stmt_return elseif_music_stmt184 =null;

        MusicParser.else_music_stmt_return else_music_stmt185 =null;


        AmlTree IF177_tree=null;
        AmlTree char_literal178_tree=null;
        AmlTree char_literal180_tree=null;
        AmlTree char_literal181_tree=null;
        AmlTree char_literal183_tree=null;

        try {
            // src/parser/Music.g:179:17: ( IF ^ '(' ! expr ')' ! '{' ! list_music_inst '}' ! ( elseif_music_stmt )* ( else_music_stmt )? )
            // src/parser/Music.g:179:21: IF ^ '(' ! expr ')' ! '{' ! list_music_inst '}' ! ( elseif_music_stmt )* ( else_music_stmt )?
            {
            root_0 = (AmlTree)adaptor.nil();


            IF177=(Token)match(input,IF,FOLLOW_IF_in_if_music_stmt2250); 
            IF177_tree = 
            (AmlTree)adaptor.create(IF177)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(IF177_tree, root_0);


            char_literal178=(Token)match(input,84,FOLLOW_84_in_if_music_stmt2253); 

            pushFollow(FOLLOW_expr_in_if_music_stmt2256);
            expr179=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr179.getTree());

            char_literal180=(Token)match(input,85,FOLLOW_85_in_if_music_stmt2258); 

            char_literal181=(Token)match(input,90,FOLLOW_90_in_if_music_stmt2261); 

            pushFollow(FOLLOW_list_music_inst_in_if_music_stmt2264);
            list_music_inst182=list_music_inst();

            state._fsp--;

            adaptor.addChild(root_0, list_music_inst182.getTree());

            char_literal183=(Token)match(input,91,FOLLOW_91_in_if_music_stmt2266); 

            // src/parser/Music.g:179:66: ( elseif_music_stmt )*
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
            	    // src/parser/Music.g:179:66: elseif_music_stmt
            	    {
            	    pushFollow(FOLLOW_elseif_music_stmt_in_if_music_stmt2269);
            	    elseif_music_stmt184=elseif_music_stmt();

            	    state._fsp--;

            	    adaptor.addChild(root_0, elseif_music_stmt184.getTree());

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            // src/parser/Music.g:179:85: ( else_music_stmt )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==ELSE) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // src/parser/Music.g:179:85: else_music_stmt
                    {
                    pushFollow(FOLLOW_else_music_stmt_in_if_music_stmt2272);
                    else_music_stmt185=else_music_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, else_music_stmt185.getTree());

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
    // src/parser/Music.g:182:1: elseif_music_stmt : ELSE IF '(' expr ')' '{' list_music_inst '}' -> ^( ELSEIF expr list_music_inst ) ;
    public final MusicParser.elseif_music_stmt_return elseif_music_stmt() throws RecognitionException {
        MusicParser.elseif_music_stmt_return retval = new MusicParser.elseif_music_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token ELSE186=null;
        Token IF187=null;
        Token char_literal188=null;
        Token char_literal190=null;
        Token char_literal191=null;
        Token char_literal193=null;
        MusicParser.expr_return expr189 =null;

        MusicParser.list_music_inst_return list_music_inst192 =null;


        AmlTree ELSE186_tree=null;
        AmlTree IF187_tree=null;
        AmlTree char_literal188_tree=null;
        AmlTree char_literal190_tree=null;
        AmlTree char_literal191_tree=null;
        AmlTree char_literal193_tree=null;
        RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
        RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");
        RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_list_music_inst=new RewriteRuleSubtreeStream(adaptor,"rule list_music_inst");
        try {
            // src/parser/Music.g:182:21: ( ELSE IF '(' expr ')' '{' list_music_inst '}' -> ^( ELSEIF expr list_music_inst ) )
            // src/parser/Music.g:182:25: ELSE IF '(' expr ')' '{' list_music_inst '}'
            {
            ELSE186=(Token)match(input,ELSE,FOLLOW_ELSE_in_elseif_music_stmt2302);  
            stream_ELSE.add(ELSE186);


            IF187=(Token)match(input,IF,FOLLOW_IF_in_elseif_music_stmt2304);  
            stream_IF.add(IF187);


            char_literal188=(Token)match(input,84,FOLLOW_84_in_elseif_music_stmt2306);  
            stream_84.add(char_literal188);


            pushFollow(FOLLOW_expr_in_elseif_music_stmt2308);
            expr189=expr();

            state._fsp--;

            stream_expr.add(expr189.getTree());

            char_literal190=(Token)match(input,85,FOLLOW_85_in_elseif_music_stmt2310);  
            stream_85.add(char_literal190);


            char_literal191=(Token)match(input,90,FOLLOW_90_in_elseif_music_stmt2312);  
            stream_90.add(char_literal191);


            pushFollow(FOLLOW_list_music_inst_in_elseif_music_stmt2314);
            list_music_inst192=list_music_inst();

            state._fsp--;

            stream_list_music_inst.add(list_music_inst192.getTree());

            char_literal193=(Token)match(input,91,FOLLOW_91_in_elseif_music_stmt2316);  
            stream_91.add(char_literal193);


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
            // 182:70: -> ^( ELSEIF expr list_music_inst )
            {
                // src/parser/Music.g:182:73: ^( ELSEIF expr list_music_inst )
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
    // src/parser/Music.g:185:1: else_music_stmt : ELSE ^ '{' ! list_music_inst '}' !;
    public final MusicParser.else_music_stmt_return else_music_stmt() throws RecognitionException {
        MusicParser.else_music_stmt_return retval = new MusicParser.else_music_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token ELSE194=null;
        Token char_literal195=null;
        Token char_literal197=null;
        MusicParser.list_music_inst_return list_music_inst196 =null;


        AmlTree ELSE194_tree=null;
        AmlTree char_literal195_tree=null;
        AmlTree char_literal197_tree=null;

        try {
            // src/parser/Music.g:185:17: ( ELSE ^ '{' ! list_music_inst '}' !)
            // src/parser/Music.g:185:21: ELSE ^ '{' ! list_music_inst '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            ELSE194=(Token)match(input,ELSE,FOLLOW_ELSE_in_else_music_stmt2357); 
            ELSE194_tree = 
            (AmlTree)adaptor.create(ELSE194)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(ELSE194_tree, root_0);


            char_literal195=(Token)match(input,90,FOLLOW_90_in_else_music_stmt2360); 

            pushFollow(FOLLOW_list_music_inst_in_else_music_stmt2363);
            list_music_inst196=list_music_inst();

            state._fsp--;

            adaptor.addChild(root_0, list_music_inst196.getTree());

            char_literal197=(Token)match(input,91,FOLLOW_91_in_else_music_stmt2365); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:188:1: song : SONG ^ ( id_rule )? '{' ! ( beat )? ( speed )? ( transport )? ( track )+ '}' !;
    public final MusicParser.song_return song() throws RecognitionException {
        MusicParser.song_return retval = new MusicParser.song_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token SONG198=null;
        Token char_literal200=null;
        Token char_literal205=null;
        MusicParser.id_rule_return id_rule199 =null;

        MusicParser.beat_return beat201 =null;

        MusicParser.speed_return speed202 =null;

        MusicParser.transport_return transport203 =null;

        MusicParser.track_return track204 =null;


        AmlTree SONG198_tree=null;
        AmlTree char_literal200_tree=null;
        AmlTree char_literal205_tree=null;

        try {
            // src/parser/Music.g:188:13: ( SONG ^ ( id_rule )? '{' ! ( beat )? ( speed )? ( transport )? ( track )+ '}' !)
            // src/parser/Music.g:188:17: SONG ^ ( id_rule )? '{' ! ( beat )? ( speed )? ( transport )? ( track )+ '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            SONG198=(Token)match(input,SONG,FOLLOW_SONG_in_song2400); 
            SONG198_tree = 
            (AmlTree)adaptor.create(SONG198)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(SONG198_tree, root_0);


            // src/parser/Music.g:188:23: ( id_rule )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==ID||LA32_0==LETTER_X) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // src/parser/Music.g:188:23: id_rule
                    {
                    pushFollow(FOLLOW_id_rule_in_song2403);
                    id_rule199=id_rule();

                    state._fsp--;

                    adaptor.addChild(root_0, id_rule199.getTree());

                    }
                    break;

            }


            char_literal200=(Token)match(input,90,FOLLOW_90_in_song2406); 

            // src/parser/Music.g:188:37: ( beat )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==BEAT) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // src/parser/Music.g:188:37: beat
                    {
                    pushFollow(FOLLOW_beat_in_song2409);
                    beat201=beat();

                    state._fsp--;

                    adaptor.addChild(root_0, beat201.getTree());

                    }
                    break;

            }


            // src/parser/Music.g:188:43: ( speed )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==SPEED) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // src/parser/Music.g:188:43: speed
                    {
                    pushFollow(FOLLOW_speed_in_song2412);
                    speed202=speed();

                    state._fsp--;

                    adaptor.addChild(root_0, speed202.getTree());

                    }
                    break;

            }


            // src/parser/Music.g:188:50: ( transport )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==TRANSPORT) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // src/parser/Music.g:188:50: transport
                    {
                    pushFollow(FOLLOW_transport_in_song2415);
                    transport203=transport();

                    state._fsp--;

                    adaptor.addChild(root_0, transport203.getTree());

                    }
                    break;

            }


            // src/parser/Music.g:188:61: ( track )+
            int cnt36=0;
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==TRACK) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // src/parser/Music.g:188:62: track
            	    {
            	    pushFollow(FOLLOW_track_in_song2419);
            	    track204=track();

            	    state._fsp--;

            	    adaptor.addChild(root_0, track204.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt36 >= 1 ) break loop36;
                        EarlyExitException eee =
                            new EarlyExitException(36, input);
                        throw eee;
                }
                cnt36++;
            } while (true);


            char_literal205=(Token)match(input,91,FOLLOW_91_in_song2423); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:191:1: track : TRACK ^ ( id_rule )? ( STRING )? compas_aux ;
    public final MusicParser.track_return track() throws RecognitionException {
        MusicParser.track_return retval = new MusicParser.track_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token TRACK206=null;
        Token STRING208=null;
        MusicParser.id_rule_return id_rule207 =null;

        MusicParser.compas_aux_return compas_aux209 =null;


        AmlTree TRACK206_tree=null;
        AmlTree STRING208_tree=null;

        try {
            // src/parser/Music.g:191:13: ( TRACK ^ ( id_rule )? ( STRING )? compas_aux )
            // src/parser/Music.g:191:17: TRACK ^ ( id_rule )? ( STRING )? compas_aux
            {
            root_0 = (AmlTree)adaptor.nil();


            TRACK206=(Token)match(input,TRACK,FOLLOW_TRACK_in_track2453); 
            TRACK206_tree = 
            (AmlTree)adaptor.create(TRACK206)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(TRACK206_tree, root_0);


            // src/parser/Music.g:191:24: ( id_rule )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==ID||LA37_0==LETTER_X) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // src/parser/Music.g:191:24: id_rule
                    {
                    pushFollow(FOLLOW_id_rule_in_track2456);
                    id_rule207=id_rule();

                    state._fsp--;

                    adaptor.addChild(root_0, id_rule207.getTree());

                    }
                    break;

            }


            // src/parser/Music.g:191:33: ( STRING )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==STRING) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // src/parser/Music.g:191:33: STRING
                    {
                    STRING208=(Token)match(input,STRING,FOLLOW_STRING_in_track2459); 
                    STRING208_tree = 
                    (AmlTree)adaptor.create(STRING208)
                    ;
                    adaptor.addChild(root_0, STRING208_tree);


                    }
                    break;

            }


            pushFollow(FOLLOW_compas_aux_in_track2462);
            compas_aux209=compas_aux();

            state._fsp--;

            adaptor.addChild(root_0, compas_aux209.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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


    public static class compas_aux_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "compas_aux"
    // src/parser/Music.g:194:1: compas_aux : compas_list -> ^( COMPAS_LIST compas_list ) ;
    public final MusicParser.compas_aux_return compas_aux() throws RecognitionException {
        MusicParser.compas_aux_return retval = new MusicParser.compas_aux_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        MusicParser.compas_list_return compas_list210 =null;


        RewriteRuleSubtreeStream stream_compas_list=new RewriteRuleSubtreeStream(adaptor,"rule compas_list");
        try {
            // src/parser/Music.g:194:13: ( compas_list -> ^( COMPAS_LIST compas_list ) )
            // src/parser/Music.g:194:17: compas_list
            {
            pushFollow(FOLLOW_compas_list_in_compas_aux2486);
            compas_list210=compas_list();

            state._fsp--;

            stream_compas_list.add(compas_list210.getTree());

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
            // 194:29: -> ^( COMPAS_LIST compas_list )
            {
                // src/parser/Music.g:194:32: ^( COMPAS_LIST compas_list )
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
    // src/parser/Music.g:197:1: compas_list : ( DOUBLE_BAR !| repetition ) ( compasses | repetition )* ( DOUBLE_BAR !) ;
    public final MusicParser.compas_list_return compas_list() throws RecognitionException {
        MusicParser.compas_list_return retval = new MusicParser.compas_list_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token DOUBLE_BAR211=null;
        Token DOUBLE_BAR215=null;
        MusicParser.repetition_return repetition212 =null;

        MusicParser.compasses_return compasses213 =null;

        MusicParser.repetition_return repetition214 =null;


        AmlTree DOUBLE_BAR211_tree=null;
        AmlTree DOUBLE_BAR215_tree=null;

        try {
            // src/parser/Music.g:197:13: ( ( DOUBLE_BAR !| repetition ) ( compasses | repetition )* ( DOUBLE_BAR !) )
            // src/parser/Music.g:197:15: ( DOUBLE_BAR !| repetition ) ( compasses | repetition )* ( DOUBLE_BAR !)
            {
            root_0 = (AmlTree)adaptor.nil();


            // src/parser/Music.g:197:15: ( DOUBLE_BAR !| repetition )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==DOUBLE_BAR) ) {
                alt39=1;
            }
            else if ( (LA39_0==NUM||LA39_0==START_REPETITION) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;

            }
            switch (alt39) {
                case 1 :
                    // src/parser/Music.g:197:16: DOUBLE_BAR !
                    {
                    DOUBLE_BAR211=(Token)match(input,DOUBLE_BAR,FOLLOW_DOUBLE_BAR_in_compas_list2516); 

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:197:30: repetition
                    {
                    pushFollow(FOLLOW_repetition_in_compas_list2521);
                    repetition212=repetition();

                    state._fsp--;

                    adaptor.addChild(root_0, repetition212.getTree());

                    }
                    break;

            }


            // src/parser/Music.g:197:42: ( compasses | repetition )*
            loop40:
            do {
                int alt40=3;
                int LA40_0 = input.LA(1);

                if ( ((LA40_0 >= BEAT && LA40_0 <= BOOL)||LA40_0==CHORD||LA40_0==DECR||LA40_0==FOR||(LA40_0 >= ID && LA40_0 <= INT)||LA40_0==LETTER_X||LA40_0==NOTE||LA40_0==NOTE_TYPE||(LA40_0 >= SONG && LA40_0 <= SPEED)||LA40_0==SUSTAIN||LA40_0==TONE||LA40_0==WHILE||LA40_0==84) ) {
                    alt40=1;
                }
                else if ( (LA40_0==NUM||LA40_0==START_REPETITION) ) {
                    alt40=2;
                }


                switch (alt40) {
            	case 1 :
            	    // src/parser/Music.g:197:43: compasses
            	    {
            	    pushFollow(FOLLOW_compasses_in_compas_list2525);
            	    compasses213=compasses();

            	    state._fsp--;

            	    adaptor.addChild(root_0, compasses213.getTree());

            	    }
            	    break;
            	case 2 :
            	    // src/parser/Music.g:197:55: repetition
            	    {
            	    pushFollow(FOLLOW_repetition_in_compas_list2529);
            	    repetition214=repetition();

            	    state._fsp--;

            	    adaptor.addChild(root_0, repetition214.getTree());

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);


            // src/parser/Music.g:197:68: ( DOUBLE_BAR !)
            // src/parser/Music.g:197:69: DOUBLE_BAR !
            {
            DOUBLE_BAR215=(Token)match(input,DOUBLE_BAR,FOLLOW_DOUBLE_BAR_in_compas_list2534); 

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
    // src/parser/Music.g:200:1: compasses : compas ( BAR ! compas )* ;
    public final MusicParser.compasses_return compasses() throws RecognitionException {
        MusicParser.compasses_return retval = new MusicParser.compasses_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token BAR217=null;
        MusicParser.compas_return compas216 =null;

        MusicParser.compas_return compas218 =null;


        AmlTree BAR217_tree=null;

        try {
            // src/parser/Music.g:200:13: ( compas ( BAR ! compas )* )
            // src/parser/Music.g:200:17: compas ( BAR ! compas )*
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_compas_in_compasses2561);
            compas216=compas();

            state._fsp--;

            adaptor.addChild(root_0, compas216.getTree());

            // src/parser/Music.g:200:24: ( BAR ! compas )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==BAR) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // src/parser/Music.g:200:25: BAR ! compas
            	    {
            	    BAR217=(Token)match(input,BAR,FOLLOW_BAR_in_compasses2564); 

            	    pushFollow(FOLLOW_compas_in_compasses2567);
            	    compas218=compas();

            	    state._fsp--;

            	    adaptor.addChild(root_0, compas218.getTree());

            	    }
            	    break;

            	default :
            	    break loop41;
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
    // src/parser/Music.g:203:1: repetition : ( NUM LETTER_X )? START_REPETITION compasses END_REPETITION -> ^( REPETITION NUM compasses ) ;
    public final MusicParser.repetition_return repetition() throws RecognitionException {
        MusicParser.repetition_return retval = new MusicParser.repetition_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token NUM219=null;
        Token LETTER_X220=null;
        Token START_REPETITION221=null;
        Token END_REPETITION223=null;
        MusicParser.compasses_return compasses222 =null;


        AmlTree NUM219_tree=null;
        AmlTree LETTER_X220_tree=null;
        AmlTree START_REPETITION221_tree=null;
        AmlTree END_REPETITION223_tree=null;
        RewriteRuleTokenStream stream_LETTER_X=new RewriteRuleTokenStream(adaptor,"token LETTER_X");
        RewriteRuleTokenStream stream_NUM=new RewriteRuleTokenStream(adaptor,"token NUM");
        RewriteRuleTokenStream stream_END_REPETITION=new RewriteRuleTokenStream(adaptor,"token END_REPETITION");
        RewriteRuleTokenStream stream_START_REPETITION=new RewriteRuleTokenStream(adaptor,"token START_REPETITION");
        RewriteRuleSubtreeStream stream_compasses=new RewriteRuleSubtreeStream(adaptor,"rule compasses");
        try {
            // src/parser/Music.g:203:13: ( ( NUM LETTER_X )? START_REPETITION compasses END_REPETITION -> ^( REPETITION NUM compasses ) )
            // src/parser/Music.g:203:17: ( NUM LETTER_X )? START_REPETITION compasses END_REPETITION
            {
            // src/parser/Music.g:203:17: ( NUM LETTER_X )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==NUM) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // src/parser/Music.g:203:18: NUM LETTER_X
                    {
                    NUM219=(Token)match(input,NUM,FOLLOW_NUM_in_repetition2594);  
                    stream_NUM.add(NUM219);


                    LETTER_X220=(Token)match(input,LETTER_X,FOLLOW_LETTER_X_in_repetition2596);  
                    stream_LETTER_X.add(LETTER_X220);


                    }
                    break;

            }


            START_REPETITION221=(Token)match(input,START_REPETITION,FOLLOW_START_REPETITION_in_repetition2600);  
            stream_START_REPETITION.add(START_REPETITION221);


            pushFollow(FOLLOW_compasses_in_repetition2602);
            compasses222=compasses();

            state._fsp--;

            stream_compasses.add(compasses222.getTree());

            END_REPETITION223=(Token)match(input,END_REPETITION,FOLLOW_END_REPETITION_in_repetition2604);  
            stream_END_REPETITION.add(END_REPETITION223);


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
            // 203:78: -> ^( REPETITION NUM compasses )
            {
                // src/parser/Music.g:203:81: ^( REPETITION NUM compasses )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(REPETITION, "REPETITION")
                , root_1);

                adaptor.addChild(root_1, 
                stream_NUM.nextNode()
                );

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
    // src/parser/Music.g:206:1: compas : ( options {greedy=true; } : music_inst )+ -> ^( COMPAS ( music_inst )+ ) ;
    public final MusicParser.compas_return compas() throws RecognitionException {
        MusicParser.compas_return retval = new MusicParser.compas_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        MusicParser.music_inst_return music_inst224 =null;


        RewriteRuleSubtreeStream stream_music_inst=new RewriteRuleSubtreeStream(adaptor,"rule music_inst");
        try {
            // src/parser/Music.g:206:13: ( ( options {greedy=true; } : music_inst )+ -> ^( COMPAS ( music_inst )+ ) )
            // src/parser/Music.g:206:16: ( options {greedy=true; } : music_inst )+
            {
            // src/parser/Music.g:206:16: ( options {greedy=true; } : music_inst )+
            int cnt43=0;
            loop43:
            do {
                int alt43=2;
                switch ( input.LA(1) ) {
                case CHORD:
                    {
                    alt43=1;
                    }
                    break;
                case TONE:
                    {
                    alt43=1;
                    }
                    break;
                case BEAT:
                    {
                    alt43=1;
                    }
                    break;
                case SPEED:
                    {
                    alt43=1;
                    }
                    break;
                case INSTRUMENT:
                    {
                    alt43=1;
                    }
                    break;
                case ID:
                case LETTER_X:
                    {
                    alt43=1;
                    }
                    break;
                case INCR:
                    {
                    alt43=1;
                    }
                    break;
                case DECR:
                    {
                    alt43=1;
                    }
                    break;
                case WHILE:
                    {
                    alt43=1;
                    }
                    break;
                case FOR:
                    {
                    alt43=1;
                    }
                    break;
                case IF:
                    {
                    alt43=1;
                    }
                    break;
                case SONG:
                    {
                    alt43=1;
                    }
                    break;
                case BOOL:
                case INT:
                case NOTE_TYPE:
                    {
                    alt43=1;
                    }
                    break;
                case 84:
                    {
                    alt43=1;
                    }
                    break;
                case BEMOL:
                case SUSTAIN:
                    {
                    alt43=1;
                    }
                    break;
                case NOTE:
                    {
                    alt43=1;
                    }
                    break;

                }

                switch (alt43) {
            	case 1 :
            	    // src/parser/Music.g:206:42: music_inst
            	    {
            	    pushFollow(FOLLOW_music_inst_in_compas2654);
            	    music_inst224=music_inst();

            	    state._fsp--;

            	    stream_music_inst.add(music_inst224.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt43 >= 1 ) break loop43;
                        EarlyExitException eee =
                            new EarlyExitException(43, input);
                        throw eee;
                }
                cnt43++;
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
            // 206:58: -> ^( COMPAS ( music_inst )+ )
            {
                // src/parser/Music.g:206:61: ^( COMPAS ( music_inst )+ )
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
    // src/parser/Music.g:209:1: tone : TONE ^ NUM ( SUSTAIN | BEMOL ) ;
    public final MusicParser.tone_return tone() throws RecognitionException {
        MusicParser.tone_return retval = new MusicParser.tone_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token TONE225=null;
        Token NUM226=null;
        Token set227=null;

        AmlTree TONE225_tree=null;
        AmlTree NUM226_tree=null;
        AmlTree set227_tree=null;

        try {
            // src/parser/Music.g:209:13: ( TONE ^ NUM ( SUSTAIN | BEMOL ) )
            // src/parser/Music.g:209:17: TONE ^ NUM ( SUSTAIN | BEMOL )
            {
            root_0 = (AmlTree)adaptor.nil();


            TONE225=(Token)match(input,TONE,FOLLOW_TONE_in_tone2698); 
            TONE225_tree = 
            (AmlTree)adaptor.create(TONE225)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(TONE225_tree, root_0);


            NUM226=(Token)match(input,NUM,FOLLOW_NUM_in_tone2701); 
            NUM226_tree = 
            (AmlTree)adaptor.create(NUM226)
            ;
            adaptor.addChild(root_0, NUM226_tree);


            set227=(Token)input.LT(1);

            if ( input.LA(1)==BEMOL||input.LA(1)==SUSTAIN ) {
                input.consume();
                adaptor.addChild(root_0, 
                (AmlTree)adaptor.create(set227)
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
    // src/parser/Music.g:212:1: notes_group : notes_type ( '.' FIGURE ( DOT )? )? ( TIE )? -> ^( NOTE_LIST notes_type ( FIGURE )? ( DOT )? ( TIE )? ) ;
    public final MusicParser.notes_group_return notes_group() throws RecognitionException {
        MusicParser.notes_group_return retval = new MusicParser.notes_group_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal229=null;
        Token FIGURE230=null;
        Token DOT231=null;
        Token TIE232=null;
        MusicParser.notes_type_return notes_type228 =null;


        AmlTree char_literal229_tree=null;
        AmlTree FIGURE230_tree=null;
        AmlTree DOT231_tree=null;
        AmlTree TIE232_tree=null;
        RewriteRuleTokenStream stream_TIE=new RewriteRuleTokenStream(adaptor,"token TIE");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_FIGURE=new RewriteRuleTokenStream(adaptor,"token FIGURE");
        RewriteRuleTokenStream stream_87=new RewriteRuleTokenStream(adaptor,"token 87");
        RewriteRuleSubtreeStream stream_notes_type=new RewriteRuleSubtreeStream(adaptor,"rule notes_type");
        try {
            // src/parser/Music.g:212:13: ( notes_type ( '.' FIGURE ( DOT )? )? ( TIE )? -> ^( NOTE_LIST notes_type ( FIGURE )? ( DOT )? ( TIE )? ) )
            // src/parser/Music.g:212:17: notes_type ( '.' FIGURE ( DOT )? )? ( TIE )?
            {
            pushFollow(FOLLOW_notes_type_in_notes_group2732);
            notes_type228=notes_type();

            state._fsp--;

            stream_notes_type.add(notes_type228.getTree());

            // src/parser/Music.g:212:28: ( '.' FIGURE ( DOT )? )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==87) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // src/parser/Music.g:212:29: '.' FIGURE ( DOT )?
                    {
                    char_literal229=(Token)match(input,87,FOLLOW_87_in_notes_group2735);  
                    stream_87.add(char_literal229);


                    FIGURE230=(Token)match(input,FIGURE,FOLLOW_FIGURE_in_notes_group2737);  
                    stream_FIGURE.add(FIGURE230);


                    // src/parser/Music.g:212:40: ( DOT )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==DOT) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // src/parser/Music.g:212:40: DOT
                            {
                            DOT231=(Token)match(input,DOT,FOLLOW_DOT_in_notes_group2739);  
                            stream_DOT.add(DOT231);


                            }
                            break;

                    }


                    }
                    break;

            }


            // src/parser/Music.g:212:47: ( TIE )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==TIE) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // src/parser/Music.g:212:47: TIE
                    {
                    TIE232=(Token)match(input,TIE,FOLLOW_TIE_in_notes_group2744);  
                    stream_TIE.add(TIE232);


                    }
                    break;

            }


            // AST REWRITE
            // elements: FIGURE, notes_type, TIE, DOT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AmlTree)adaptor.nil();
            // 212:52: -> ^( NOTE_LIST notes_type ( FIGURE )? ( DOT )? ( TIE )? )
            {
                // src/parser/Music.g:212:55: ^( NOTE_LIST notes_type ( FIGURE )? ( DOT )? ( TIE )? )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(NOTE_LIST, "NOTE_LIST")
                , root_1);

                adaptor.addChild(root_1, stream_notes_type.nextTree());

                // src/parser/Music.g:212:78: ( FIGURE )?
                if ( stream_FIGURE.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_FIGURE.nextNode()
                    );

                }
                stream_FIGURE.reset();

                // src/parser/Music.g:212:86: ( DOT )?
                if ( stream_DOT.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_DOT.nextNode()
                    );

                }
                stream_DOT.reset();

                // src/parser/Music.g:212:91: ( TIE )?
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
    // src/parser/Music.g:215:1: notes_variable : notes_type ( '.' FIGURE ( DOT )? )? -> ^( NOTE_LIST notes_type ( FIGURE )? ( DOT )? ) ;
    public final MusicParser.notes_variable_return notes_variable() throws RecognitionException {
        MusicParser.notes_variable_return retval = new MusicParser.notes_variable_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal234=null;
        Token FIGURE235=null;
        Token DOT236=null;
        MusicParser.notes_type_return notes_type233 =null;


        AmlTree char_literal234_tree=null;
        AmlTree FIGURE235_tree=null;
        AmlTree DOT236_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_FIGURE=new RewriteRuleTokenStream(adaptor,"token FIGURE");
        RewriteRuleTokenStream stream_87=new RewriteRuleTokenStream(adaptor,"token 87");
        RewriteRuleSubtreeStream stream_notes_type=new RewriteRuleSubtreeStream(adaptor,"rule notes_type");
        try {
            // src/parser/Music.g:215:17: ( notes_type ( '.' FIGURE ( DOT )? )? -> ^( NOTE_LIST notes_type ( FIGURE )? ( DOT )? ) )
            // src/parser/Music.g:215:21: notes_type ( '.' FIGURE ( DOT )? )?
            {
            pushFollow(FOLLOW_notes_type_in_notes_variable2786);
            notes_type233=notes_type();

            state._fsp--;

            stream_notes_type.add(notes_type233.getTree());

            // src/parser/Music.g:215:32: ( '.' FIGURE ( DOT )? )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==87) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // src/parser/Music.g:215:33: '.' FIGURE ( DOT )?
                    {
                    char_literal234=(Token)match(input,87,FOLLOW_87_in_notes_variable2789);  
                    stream_87.add(char_literal234);


                    FIGURE235=(Token)match(input,FIGURE,FOLLOW_FIGURE_in_notes_variable2791);  
                    stream_FIGURE.add(FIGURE235);


                    // src/parser/Music.g:215:44: ( DOT )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==DOT) ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // src/parser/Music.g:215:44: DOT
                            {
                            DOT236=(Token)match(input,DOT,FOLLOW_DOT_in_notes_variable2793);  
                            stream_DOT.add(DOT236);


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
            // 215:51: -> ^( NOTE_LIST notes_type ( FIGURE )? ( DOT )? )
            {
                // src/parser/Music.g:215:54: ^( NOTE_LIST notes_type ( FIGURE )? ( DOT )? )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(NOTE_LIST, "NOTE_LIST")
                , root_1);

                adaptor.addChild(root_1, stream_notes_type.nextTree());

                // src/parser/Music.g:215:77: ( FIGURE )?
                if ( stream_FIGURE.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_FIGURE.nextNode()
                    );

                }
                stream_FIGURE.reset();

                // src/parser/Music.g:215:85: ( DOT )?
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
    // src/parser/Music.g:218:1: notes_type : ( chord | notes );
    public final MusicParser.notes_type_return notes_type() throws RecognitionException {
        MusicParser.notes_type_return retval = new MusicParser.notes_type_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        MusicParser.chord_return chord237 =null;

        MusicParser.notes_return notes238 =null;



        try {
            // src/parser/Music.g:218:13: ( chord | notes )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==CHORD) ) {
                alt49=1;
            }
            else if ( (LA49_0==BEMOL||LA49_0==NOTE||LA49_0==SUSTAIN||LA49_0==84) ) {
                alt49=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;

            }
            switch (alt49) {
                case 1 :
                    // src/parser/Music.g:218:15: chord
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_chord_in_notes_type2836);
                    chord237=chord();

                    state._fsp--;

                    adaptor.addChild(root_0, chord237.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:218:23: notes
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_notes_in_notes_type2840);
                    notes238=notes();

                    state._fsp--;

                    adaptor.addChild(root_0, notes238.getTree());

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
    // src/parser/Music.g:221:1: chord : CHORD ^ '(' ! NOTE ( MINOR | PLUS | DIMINUTION )? ( SEVENTH | MAJ7 )? ')' !;
    public final MusicParser.chord_return chord() throws RecognitionException {
        MusicParser.chord_return retval = new MusicParser.chord_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token CHORD239=null;
        Token char_literal240=null;
        Token NOTE241=null;
        Token set242=null;
        Token set243=null;
        Token char_literal244=null;

        AmlTree CHORD239_tree=null;
        AmlTree char_literal240_tree=null;
        AmlTree NOTE241_tree=null;
        AmlTree set242_tree=null;
        AmlTree set243_tree=null;
        AmlTree char_literal244_tree=null;

        try {
            // src/parser/Music.g:221:13: ( CHORD ^ '(' ! NOTE ( MINOR | PLUS | DIMINUTION )? ( SEVENTH | MAJ7 )? ')' !)
            // src/parser/Music.g:221:17: CHORD ^ '(' ! NOTE ( MINOR | PLUS | DIMINUTION )? ( SEVENTH | MAJ7 )? ')' !
            {
            root_0 = (AmlTree)adaptor.nil();


            CHORD239=(Token)match(input,CHORD,FOLLOW_CHORD_in_chord2869); 
            CHORD239_tree = 
            (AmlTree)adaptor.create(CHORD239)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(CHORD239_tree, root_0);


            char_literal240=(Token)match(input,84,FOLLOW_84_in_chord2872); 

            NOTE241=(Token)match(input,NOTE,FOLLOW_NOTE_in_chord2875); 
            NOTE241_tree = 
            (AmlTree)adaptor.create(NOTE241)
            ;
            adaptor.addChild(root_0, NOTE241_tree);


            // src/parser/Music.g:221:34: ( MINOR | PLUS | DIMINUTION )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==DIMINUTION||LA50_0==MINOR||LA50_0==PLUS) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // src/parser/Music.g:
                    {
                    set242=(Token)input.LT(1);

                    if ( input.LA(1)==DIMINUTION||input.LA(1)==MINOR||input.LA(1)==PLUS ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (AmlTree)adaptor.create(set242)
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


            // src/parser/Music.g:221:59: ( SEVENTH | MAJ7 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==MAJ7||LA51_0==SEVENTH) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // src/parser/Music.g:
                    {
                    set243=(Token)input.LT(1);

                    if ( input.LA(1)==MAJ7||input.LA(1)==SEVENTH ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (AmlTree)adaptor.create(set243)
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


            char_literal244=(Token)match(input,85,FOLLOW_85_in_chord2895); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:224:1: notes : ( '(' ( note )+ ')' | note ) -> ^( NOTES ( note )+ ) ;
    public final MusicParser.notes_return notes() throws RecognitionException {
        MusicParser.notes_return retval = new MusicParser.notes_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal245=null;
        Token char_literal247=null;
        MusicParser.note_return note246 =null;

        MusicParser.note_return note248 =null;


        AmlTree char_literal245_tree=null;
        AmlTree char_literal247_tree=null;
        RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");
        RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
        RewriteRuleSubtreeStream stream_note=new RewriteRuleSubtreeStream(adaptor,"rule note");
        try {
            // src/parser/Music.g:224:13: ( ( '(' ( note )+ ')' | note ) -> ^( NOTES ( note )+ ) )
            // src/parser/Music.g:224:17: ( '(' ( note )+ ')' | note )
            {
            // src/parser/Music.g:224:17: ( '(' ( note )+ ')' | note )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==84) ) {
                alt53=1;
            }
            else if ( (LA53_0==BEMOL||LA53_0==NOTE||LA53_0==SUSTAIN) ) {
                alt53=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;

            }
            switch (alt53) {
                case 1 :
                    // src/parser/Music.g:224:19: '(' ( note )+ ')'
                    {
                    char_literal245=(Token)match(input,84,FOLLOW_84_in_notes2927);  
                    stream_84.add(char_literal245);


                    // src/parser/Music.g:224:23: ( note )+
                    int cnt52=0;
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==BEMOL||LA52_0==NOTE||LA52_0==SUSTAIN) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // src/parser/Music.g:224:24: note
                    	    {
                    	    pushFollow(FOLLOW_note_in_notes2930);
                    	    note246=note();

                    	    state._fsp--;

                    	    stream_note.add(note246.getTree());

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


                    char_literal247=(Token)match(input,85,FOLLOW_85_in_notes2934);  
                    stream_85.add(char_literal247);


                    }
                    break;
                case 2 :
                    // src/parser/Music.g:224:38: note
                    {
                    pushFollow(FOLLOW_note_in_notes2939);
                    note248=note();

                    state._fsp--;

                    stream_note.add(note248.getTree());

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
            // 224:44: -> ^( NOTES ( note )+ )
            {
                // src/parser/Music.g:224:47: ^( NOTES ( note )+ )
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


    public static class note_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "note"
    // src/parser/Music.g:227:1: note : ( BEMOL | SUSTAIN )? NOTE ^ ( '-' ! NUM )? ;
    public final MusicParser.note_return note() throws RecognitionException {
        MusicParser.note_return retval = new MusicParser.note_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token set249=null;
        Token NOTE250=null;
        Token char_literal251=null;
        Token NUM252=null;

        AmlTree set249_tree=null;
        AmlTree NOTE250_tree=null;
        AmlTree char_literal251_tree=null;
        AmlTree NUM252_tree=null;

        try {
            // src/parser/Music.g:227:13: ( ( BEMOL | SUSTAIN )? NOTE ^ ( '-' ! NUM )? )
            // src/parser/Music.g:227:17: ( BEMOL | SUSTAIN )? NOTE ^ ( '-' ! NUM )?
            {
            root_0 = (AmlTree)adaptor.nil();


            // src/parser/Music.g:227:17: ( BEMOL | SUSTAIN )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==BEMOL||LA54_0==SUSTAIN) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // src/parser/Music.g:
                    {
                    set249=(Token)input.LT(1);

                    if ( input.LA(1)==BEMOL||input.LA(1)==SUSTAIN ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (AmlTree)adaptor.create(set249)
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


            NOTE250=(Token)match(input,NOTE,FOLLOW_NOTE_in_note2988); 
            NOTE250_tree = 
            (AmlTree)adaptor.create(NOTE250)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(NOTE250_tree, root_0);


            // src/parser/Music.g:227:42: ( '-' ! NUM )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==MINUS) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // src/parser/Music.g:227:43: '-' ! NUM
                    {
                    char_literal251=(Token)match(input,MINUS,FOLLOW_MINUS_in_note2992); 

                    NUM252=(Token)match(input,NUM,FOLLOW_NUM_in_note2995); 
                    NUM252_tree = 
                    (AmlTree)adaptor.create(NUM252)
                    ;
                    adaptor.addChild(root_0, NUM252_tree);


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
    // src/parser/Music.g:231:1: expr : boolterm ( OR ^ boolterm )* ;
    public final MusicParser.expr_return expr() throws RecognitionException {
        MusicParser.expr_return retval = new MusicParser.expr_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token OR254=null;
        MusicParser.boolterm_return boolterm253 =null;

        MusicParser.boolterm_return boolterm255 =null;


        AmlTree OR254_tree=null;

        try {
            // src/parser/Music.g:231:9: ( boolterm ( OR ^ boolterm )* )
            // src/parser/Music.g:231:13: boolterm ( OR ^ boolterm )*
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_boolterm_in_expr3024);
            boolterm253=boolterm();

            state._fsp--;

            adaptor.addChild(root_0, boolterm253.getTree());

            // src/parser/Music.g:231:22: ( OR ^ boolterm )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==OR) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // src/parser/Music.g:231:23: OR ^ boolterm
            	    {
            	    OR254=(Token)match(input,OR,FOLLOW_OR_in_expr3027); 
            	    OR254_tree = 
            	    (AmlTree)adaptor.create(OR254)
            	    ;
            	    root_0 = (AmlTree)adaptor.becomeRoot(OR254_tree, root_0);


            	    pushFollow(FOLLOW_boolterm_in_expr3030);
            	    boolterm255=boolterm();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolterm255.getTree());

            	    }
            	    break;

            	default :
            	    break loop56;
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
    // src/parser/Music.g:234:1: boolterm : boolfact ( AND ^ boolfact )* ;
    public final MusicParser.boolterm_return boolterm() throws RecognitionException {
        MusicParser.boolterm_return retval = new MusicParser.boolterm_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token AND257=null;
        MusicParser.boolfact_return boolfact256 =null;

        MusicParser.boolfact_return boolfact258 =null;


        AmlTree AND257_tree=null;

        try {
            // src/parser/Music.g:234:13: ( boolfact ( AND ^ boolfact )* )
            // src/parser/Music.g:234:17: boolfact ( AND ^ boolfact )*
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_boolfact_in_boolterm3048);
            boolfact256=boolfact();

            state._fsp--;

            adaptor.addChild(root_0, boolfact256.getTree());

            // src/parser/Music.g:234:26: ( AND ^ boolfact )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==AND) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // src/parser/Music.g:234:27: AND ^ boolfact
            	    {
            	    AND257=(Token)match(input,AND,FOLLOW_AND_in_boolterm3051); 
            	    AND257_tree = 
            	    (AmlTree)adaptor.create(AND257)
            	    ;
            	    root_0 = (AmlTree)adaptor.becomeRoot(AND257_tree, root_0);


            	    pushFollow(FOLLOW_boolfact_in_boolterm3054);
            	    boolfact258=boolfact();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolfact258.getTree());

            	    }
            	    break;

            	default :
            	    break loop57;
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
    // src/parser/Music.g:237:1: boolfact : num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? ;
    public final MusicParser.boolfact_return boolfact() throws RecognitionException {
        MusicParser.boolfact_return retval = new MusicParser.boolfact_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token EQUAL260=null;
        Token NOT_EQUAL261=null;
        Token LT262=null;
        Token LE263=null;
        Token GT264=null;
        Token GE265=null;
        MusicParser.num_expr_return num_expr259 =null;

        MusicParser.num_expr_return num_expr266 =null;


        AmlTree EQUAL260_tree=null;
        AmlTree NOT_EQUAL261_tree=null;
        AmlTree LT262_tree=null;
        AmlTree LE263_tree=null;
        AmlTree GT264_tree=null;
        AmlTree GE265_tree=null;

        try {
            // src/parser/Music.g:237:13: ( num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? )
            // src/parser/Music.g:237:17: num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_num_expr_in_boolfact3076);
            num_expr259=num_expr();

            state._fsp--;

            adaptor.addChild(root_0, num_expr259.getTree());

            // src/parser/Music.g:237:26: ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==EQUAL||(LA59_0 >= GE && LA59_0 <= GT)||LA59_0==LE||LA59_0==LT||LA59_0==NOT_EQUAL) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // src/parser/Music.g:237:27: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr
                    {
                    // src/parser/Music.g:237:27: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^)
                    int alt58=6;
                    switch ( input.LA(1) ) {
                    case EQUAL:
                        {
                        alt58=1;
                        }
                        break;
                    case NOT_EQUAL:
                        {
                        alt58=2;
                        }
                        break;
                    case LT:
                        {
                        alt58=3;
                        }
                        break;
                    case LE:
                        {
                        alt58=4;
                        }
                        break;
                    case GT:
                        {
                        alt58=5;
                        }
                        break;
                    case GE:
                        {
                        alt58=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 58, 0, input);

                        throw nvae;

                    }

                    switch (alt58) {
                        case 1 :
                            // src/parser/Music.g:237:28: EQUAL ^
                            {
                            EQUAL260=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_boolfact3080); 
                            EQUAL260_tree = 
                            (AmlTree)adaptor.create(EQUAL260)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(EQUAL260_tree, root_0);


                            }
                            break;
                        case 2 :
                            // src/parser/Music.g:237:37: NOT_EQUAL ^
                            {
                            NOT_EQUAL261=(Token)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_boolfact3085); 
                            NOT_EQUAL261_tree = 
                            (AmlTree)adaptor.create(NOT_EQUAL261)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(NOT_EQUAL261_tree, root_0);


                            }
                            break;
                        case 3 :
                            // src/parser/Music.g:237:50: LT ^
                            {
                            LT262=(Token)match(input,LT,FOLLOW_LT_in_boolfact3090); 
                            LT262_tree = 
                            (AmlTree)adaptor.create(LT262)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(LT262_tree, root_0);


                            }
                            break;
                        case 4 :
                            // src/parser/Music.g:237:56: LE ^
                            {
                            LE263=(Token)match(input,LE,FOLLOW_LE_in_boolfact3095); 
                            LE263_tree = 
                            (AmlTree)adaptor.create(LE263)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(LE263_tree, root_0);


                            }
                            break;
                        case 5 :
                            // src/parser/Music.g:237:62: GT ^
                            {
                            GT264=(Token)match(input,GT,FOLLOW_GT_in_boolfact3100); 
                            GT264_tree = 
                            (AmlTree)adaptor.create(GT264)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(GT264_tree, root_0);


                            }
                            break;
                        case 6 :
                            // src/parser/Music.g:237:68: GE ^
                            {
                            GE265=(Token)match(input,GE,FOLLOW_GE_in_boolfact3105); 
                            GE265_tree = 
                            (AmlTree)adaptor.create(GE265)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(GE265_tree, root_0);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_num_expr_in_boolfact3109);
                    num_expr266=num_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, num_expr266.getTree());

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
    // src/parser/Music.g:240:1: num_expr : term ( ( PLUS ^| MINUS ^) term )* ;
    public final MusicParser.num_expr_return num_expr() throws RecognitionException {
        MusicParser.num_expr_return retval = new MusicParser.num_expr_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token PLUS268=null;
        Token MINUS269=null;
        MusicParser.term_return term267 =null;

        MusicParser.term_return term270 =null;


        AmlTree PLUS268_tree=null;
        AmlTree MINUS269_tree=null;

        try {
            // src/parser/Music.g:240:13: ( term ( ( PLUS ^| MINUS ^) term )* )
            // src/parser/Music.g:240:17: term ( ( PLUS ^| MINUS ^) term )*
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_term_in_num_expr3131);
            term267=term();

            state._fsp--;

            adaptor.addChild(root_0, term267.getTree());

            // src/parser/Music.g:240:22: ( ( PLUS ^| MINUS ^) term )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==MINUS||LA61_0==PLUS) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // src/parser/Music.g:240:24: ( PLUS ^| MINUS ^) term
            	    {
            	    // src/parser/Music.g:240:24: ( PLUS ^| MINUS ^)
            	    int alt60=2;
            	    int LA60_0 = input.LA(1);

            	    if ( (LA60_0==PLUS) ) {
            	        alt60=1;
            	    }
            	    else if ( (LA60_0==MINUS) ) {
            	        alt60=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 60, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt60) {
            	        case 1 :
            	            // src/parser/Music.g:240:25: PLUS ^
            	            {
            	            PLUS268=(Token)match(input,PLUS,FOLLOW_PLUS_in_num_expr3136); 
            	            PLUS268_tree = 
            	            (AmlTree)adaptor.create(PLUS268)
            	            ;
            	            root_0 = (AmlTree)adaptor.becomeRoot(PLUS268_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // src/parser/Music.g:240:33: MINUS ^
            	            {
            	            MINUS269=(Token)match(input,MINUS,FOLLOW_MINUS_in_num_expr3141); 
            	            MINUS269_tree = 
            	            (AmlTree)adaptor.create(MINUS269)
            	            ;
            	            root_0 = (AmlTree)adaptor.becomeRoot(MINUS269_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_term_in_num_expr3145);
            	    term270=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term270.getTree());

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
    // $ANTLR end "num_expr"


    public static class term_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "term"
    // src/parser/Music.g:243:1: term : factor ( ( DOT ^| DIV ^| MOD ^) factor )* ;
    public final MusicParser.term_return term() throws RecognitionException {
        MusicParser.term_return retval = new MusicParser.term_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token DOT272=null;
        Token DIV273=null;
        Token MOD274=null;
        MusicParser.factor_return factor271 =null;

        MusicParser.factor_return factor275 =null;


        AmlTree DOT272_tree=null;
        AmlTree DIV273_tree=null;
        AmlTree MOD274_tree=null;

        try {
            // src/parser/Music.g:243:9: ( factor ( ( DOT ^| DIV ^| MOD ^) factor )* )
            // src/parser/Music.g:243:13: factor ( ( DOT ^| DIV ^| MOD ^) factor )*
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term3167);
            factor271=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor271.getTree());

            // src/parser/Music.g:243:20: ( ( DOT ^| DIV ^| MOD ^) factor )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==DIV||LA63_0==DOT||LA63_0==MOD) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // src/parser/Music.g:243:22: ( DOT ^| DIV ^| MOD ^) factor
            	    {
            	    // src/parser/Music.g:243:22: ( DOT ^| DIV ^| MOD ^)
            	    int alt62=3;
            	    switch ( input.LA(1) ) {
            	    case DOT:
            	        {
            	        alt62=1;
            	        }
            	        break;
            	    case DIV:
            	        {
            	        alt62=2;
            	        }
            	        break;
            	    case MOD:
            	        {
            	        alt62=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 62, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt62) {
            	        case 1 :
            	            // src/parser/Music.g:243:23: DOT ^
            	            {
            	            DOT272=(Token)match(input,DOT,FOLLOW_DOT_in_term3172); 
            	            DOT272_tree = 
            	            (AmlTree)adaptor.create(DOT272)
            	            ;
            	            root_0 = (AmlTree)adaptor.becomeRoot(DOT272_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // src/parser/Music.g:243:30: DIV ^
            	            {
            	            DIV273=(Token)match(input,DIV,FOLLOW_DIV_in_term3177); 
            	            DIV273_tree = 
            	            (AmlTree)adaptor.create(DIV273)
            	            ;
            	            root_0 = (AmlTree)adaptor.becomeRoot(DIV273_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // src/parser/Music.g:243:37: MOD ^
            	            {
            	            MOD274=(Token)match(input,MOD,FOLLOW_MOD_in_term3182); 
            	            MOD274_tree = 
            	            (AmlTree)adaptor.create(MOD274)
            	            ;
            	            root_0 = (AmlTree)adaptor.becomeRoot(MOD274_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_factor_in_term3186);
            	    factor275=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor275.getTree());

            	    }
            	    break;

            	default :
            	    break loop63;
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
    // src/parser/Music.g:246:1: factor : ( NOT ^| PLUS ^| MINUS ^)? atom ;
    public final MusicParser.factor_return factor() throws RecognitionException {
        MusicParser.factor_return retval = new MusicParser.factor_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token NOT276=null;
        Token PLUS277=null;
        Token MINUS278=null;
        MusicParser.atom_return atom279 =null;


        AmlTree NOT276_tree=null;
        AmlTree PLUS277_tree=null;
        AmlTree MINUS278_tree=null;

        try {
            // src/parser/Music.g:246:9: ( ( NOT ^| PLUS ^| MINUS ^)? atom )
            // src/parser/Music.g:246:13: ( NOT ^| PLUS ^| MINUS ^)? atom
            {
            root_0 = (AmlTree)adaptor.nil();


            // src/parser/Music.g:246:13: ( NOT ^| PLUS ^| MINUS ^)?
            int alt64=4;
            switch ( input.LA(1) ) {
                case NOT:
                    {
                    alt64=1;
                    }
                    break;
                case PLUS:
                    {
                    alt64=2;
                    }
                    break;
                case MINUS:
                    {
                    alt64=3;
                    }
                    break;
            }

            switch (alt64) {
                case 1 :
                    // src/parser/Music.g:246:14: NOT ^
                    {
                    NOT276=(Token)match(input,NOT,FOLLOW_NOT_in_factor3203); 
                    NOT276_tree = 
                    (AmlTree)adaptor.create(NOT276)
                    ;
                    root_0 = (AmlTree)adaptor.becomeRoot(NOT276_tree, root_0);


                    }
                    break;
                case 2 :
                    // src/parser/Music.g:246:21: PLUS ^
                    {
                    PLUS277=(Token)match(input,PLUS,FOLLOW_PLUS_in_factor3208); 
                    PLUS277_tree = 
                    (AmlTree)adaptor.create(PLUS277)
                    ;
                    root_0 = (AmlTree)adaptor.becomeRoot(PLUS277_tree, root_0);


                    }
                    break;
                case 3 :
                    // src/parser/Music.g:246:29: MINUS ^
                    {
                    MINUS278=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor3213); 
                    MINUS278_tree = 
                    (AmlTree)adaptor.create(MINUS278)
                    ;
                    root_0 = (AmlTree)adaptor.becomeRoot(MINUS278_tree, root_0);


                    }
                    break;

            }


            pushFollow(FOLLOW_atom_in_factor3218);
            atom279=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom279.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:249:1: atom : ( var_access | NUM | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | '(' ! expr ')' !);
    public final MusicParser.atom_return atom() throws RecognitionException {
        MusicParser.atom_return retval = new MusicParser.atom_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token b=null;
        Token NUM281=null;
        Token char_literal282=null;
        Token char_literal284=null;
        MusicParser.var_access_return var_access280 =null;

        MusicParser.expr_return expr283 =null;


        AmlTree b_tree=null;
        AmlTree NUM281_tree=null;
        AmlTree char_literal282_tree=null;
        AmlTree char_literal284_tree=null;
        RewriteRuleTokenStream stream_TRUE=new RewriteRuleTokenStream(adaptor,"token TRUE");
        RewriteRuleTokenStream stream_FALSE=new RewriteRuleTokenStream(adaptor,"token FALSE");

        try {
            // src/parser/Music.g:249:9: ( var_access | NUM | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | '(' ! expr ')' !)
            int alt66=4;
            switch ( input.LA(1) ) {
            case ID:
            case LETTER_X:
                {
                alt66=1;
                }
                break;
            case NUM:
                {
                alt66=2;
                }
                break;
            case FALSE:
            case TRUE:
                {
                alt66=3;
                }
                break;
            case 84:
                {
                alt66=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;

            }

            switch (alt66) {
                case 1 :
                    // src/parser/Music.g:249:13: var_access
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_var_access_in_atom3234);
                    var_access280=var_access();

                    state._fsp--;

                    adaptor.addChild(root_0, var_access280.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:250:7: NUM
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    NUM281=(Token)match(input,NUM,FOLLOW_NUM_in_atom3242); 
                    NUM281_tree = 
                    (AmlTree)adaptor.create(NUM281)
                    ;
                    adaptor.addChild(root_0, NUM281_tree);


                    }
                    break;
                case 3 :
                    // src/parser/Music.g:251:7: (b= TRUE |b= FALSE )
                    {
                    // src/parser/Music.g:251:7: (b= TRUE |b= FALSE )
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==TRUE) ) {
                        alt65=1;
                    }
                    else if ( (LA65_0==FALSE) ) {
                        alt65=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 65, 0, input);

                        throw nvae;

                    }
                    switch (alt65) {
                        case 1 :
                            // src/parser/Music.g:251:8: b= TRUE
                            {
                            b=(Token)match(input,TRUE,FOLLOW_TRUE_in_atom3253);  
                            stream_TRUE.add(b);


                            }
                            break;
                        case 2 :
                            // src/parser/Music.g:251:17: b= FALSE
                            {
                            b=(Token)match(input,FALSE,FOLLOW_FALSE_in_atom3259);  
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
                    // 251:27: -> ^( BOOLEAN[$b,$b.text] )
                    {
                        // src/parser/Music.g:251:30: ^( BOOLEAN[$b,$b.text] )
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
                case 4 :
                    // src/parser/Music.g:252:7: '(' ! expr ')' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    char_literal282=(Token)match(input,84,FOLLOW_84_in_atom3276); 

                    pushFollow(FOLLOW_expr_in_atom3279);
                    expr283=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr283.getTree());

                    char_literal284=(Token)match(input,85,FOLLOW_85_in_atom3281); 

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


 

    public static final BitSet FOLLOW_global_stmt_in_prog186 = new BitSet(new long[]{0x0400008040001400L,0x0000000000020040L});
    public static final BitSet FOLLOW_EOF_in_prog190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_global_stmt222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_frag_in_global_stmt240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_song_in_global_stmt258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_rule_in_var_funcall283 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_var_funcall285 = new BitSet(new long[]{0x0000020800000000L});
    public static final BitSet FOLLOW_id_rule_in_var_funcall289 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_var_funcall291 = new BitSet(new long[]{0x50C4020808001200L,0x0000000000308400L});
    public static final BitSet FOLLOW_params_in_var_funcall293 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_var_funcall296 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_var_funcall298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_rule_in_var_access339 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_var_access342 = new BitSet(new long[]{0x0000020800000000L});
    public static final BitSet FOLLOW_id_rule_in_var_access346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_rule_in_var_access375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_void_in_function445 = new BitSet(new long[]{0x0000020800000000L});
    public static final BitSet FOLLOW_id_rule_in_function449 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_function451 = new BitSet(new long[]{0x0400008000001400L,0x0000000000200000L});
    public static final BitSet FOLLOW_list_arguments_in_function453 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_function455 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_function457 = new BitSet(new long[]{0x140002F820211500L,0x00000000000411C0L});
    public static final BitSet FOLLOW_listInst_in_function459 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_function461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_rule_in_funcall508 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_funcall510 = new BitSet(new long[]{0x50C4020808001200L,0x0000000000308400L});
    public static final BitSet FOLLOW_params_in_funcall512 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_funcall515 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_funcall517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FRAGMENT_in_frag551 = new BitSet(new long[]{0x0000020800000000L});
    public static final BitSet FOLLOW_id_rule_in_frag554 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_frag556 = new BitSet(new long[]{0x0400008000001400L,0x0000000000200000L});
    public static final BitSet FOLLOW_list_arguments_in_frag559 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_frag561 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_frag564 = new BitSet(new long[]{0x048002F820011700L,0x00000000001414C0L});
    public static final BitSet FOLLOW_list_music_inst_in_frag567 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_frag569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_argument_in_list_arguments589 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_list_arguments592 = new BitSet(new long[]{0x0400008000001400L});
    public static final BitSet FOLLOW_argument_in_list_arguments594 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_type_in_argument635 = new BitSet(new long[]{0x0000020800000000L});
    public static final BitSet FOLLOW_id_rule_in_argument638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_params665 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_notes_variable_in_params669 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_params673 = new BitSet(new long[]{0x50C4020808001200L,0x0000000000108400L});
    public static final BitSet FOLLOW_expr_in_params677 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_notes_variable_in_params681 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_inst_in_listInst709 = new BitSet(new long[]{0x140002F820211502L,0x00000000000411C0L});
    public static final BitSet FOLLOW_music_inst_in_list_music_inst743 = new BitSet(new long[]{0x048002F820011702L,0x00000000001414C0L});
    public static final BitSet FOLLOW_declaration_in_inst787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_funcall_in_inst805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tone_in_inst823 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_inst825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_beat_in_inst844 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_inst846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_speed_in_inst865 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_inst867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instrument_in_inst886 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_inst888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignation_in_inst907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_stmt_in_inst925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_inst943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_stmt_in_inst961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_stmt_in_inst979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_song_in_inst997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compas_list_in_inst1015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_music_inst1039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tone_in_music_inst1057 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_music_inst1059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_beat_in_music_inst1078 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_music_inst1080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_speed_in_music_inst1099 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_music_inst1101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instrument_in_music_inst1120 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_music_inst1122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_funcall_in_music_inst1141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignation_in_music_inst1159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_music_stmt_in_music_inst1177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_music_inst1195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_music_stmt_in_music_inst1213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_music_stmt_in_music_inst1231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_song_in_music_inst1249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notes_group_in_music_inst1276 = new BitSet(new long[]{0x0080000000001202L,0x0000000002100400L});
    public static final BitSet FOLLOW_89_in_music_inst1280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_declaration1305 = new BitSet(new long[]{0x0000020800000000L});
    public static final BitSet FOLLOW_assig_opt_in_declaration1308 = new BitSet(new long[]{0x0000000000000000L,0x0000000002400000L});
    public static final BitSet FOLLOW_86_in_declaration1311 = new BitSet(new long[]{0x0000020800000000L});
    public static final BitSet FOLLOW_assig_opt_in_declaration1314 = new BitSet(new long[]{0x0000000000000000L,0x0000000002400000L});
    public static final BitSet FOLLOW_89_in_declaration1318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_type_void1428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOID_in_type_void1446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_rule_in_assig_opt1471 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ASSIG_in_assig_opt1474 = new BitSet(new long[]{0x50C4020808001200L,0x0000000000108400L});
    public static final BitSet FOLLOW_expr_in_assig_opt1478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notes_variable_in_assig_opt1482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assig_in_assignation1508 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_assignation1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_access_in_assig1540 = new BitSet(new long[]{0x8028000000080020L,0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_assig1542 = new BitSet(new long[]{0x50C4020818001200L,0x0000000000108400L});
    public static final BitSet FOLLOW_expr_in_assig1558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notes_variable_in_assig1562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIGURE_in_assig1566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_post_in_assig1585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pre_in_assig1603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_access_in_post1633 = new BitSet(new long[]{0x0000002000010000L});
    public static final BitSet FOLLOW_INCR_in_post1638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECR_in_post1644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INCR_in_pre1691 = new BitSet(new long[]{0x0000020800000000L});
    public static final BitSet FOLLOW_DECR_in_pre1697 = new BitSet(new long[]{0x0000020800000000L});
    public static final BitSet FOLLOW_var_access_in_pre1700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BEAT_in_beat1743 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_NUM_in_beat1746 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_beat1748 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_NUM_in_beat1751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SPEED_in_speed1780 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_NUM_in_speed1783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRANSPORT_in_transport1808 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_NUM_in_transport1811 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_transport1813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUMENT_in_instrument1837 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_STRING_in_instrument1840 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_instrument1842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_stmt1866 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_while_stmt1869 = new BitSet(new long[]{0x5044020808000000L,0x0000000000108000L});
    public static final BitSet FOLLOW_expr_in_while_stmt1872 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_while_stmt1874 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_while_stmt1877 = new BitSet(new long[]{0x140002F820211500L,0x00000000000411C0L});
    public static final BitSet FOLLOW_listInst_in_while_stmt1880 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_while_stmt1882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_music_stmt1909 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_while_music_stmt1912 = new BitSet(new long[]{0x5044020808000000L,0x0000000000108000L});
    public static final BitSet FOLLOW_expr_in_while_music_stmt1915 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_while_music_stmt1917 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_while_music_stmt1920 = new BitSet(new long[]{0x048002F820011700L,0x00000000001414C0L});
    public static final BitSet FOLLOW_list_music_inst_in_while_music_stmt1923 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_while_music_stmt1925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_for_stmt1960 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_for_stmt1963 = new BitSet(new long[]{0x040002A800011400L});
    public static final BitSet FOLLOW_declaration_in_for_stmt1967 = new BitSet(new long[]{0x5044020808000000L,0x0000000000108000L});
    public static final BitSet FOLLOW_list_assig_in_for_stmt1971 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_for_stmt1973 = new BitSet(new long[]{0x5044020808000000L,0x0000000000108000L});
    public static final BitSet FOLLOW_expr_in_for_stmt1977 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_for_stmt1979 = new BitSet(new long[]{0x0000022800010000L});
    public static final BitSet FOLLOW_list_assig_in_for_stmt1982 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_for_stmt1984 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_for_stmt1987 = new BitSet(new long[]{0x140002F820211500L,0x00000000000411C0L});
    public static final BitSet FOLLOW_listInst_in_for_stmt1990 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_for_stmt1992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_for_music_stmt2017 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_for_music_stmt2020 = new BitSet(new long[]{0x040002A800011400L});
    public static final BitSet FOLLOW_declaration_in_for_music_stmt2024 = new BitSet(new long[]{0x5044020808000000L,0x0000000000108000L});
    public static final BitSet FOLLOW_list_assig_in_for_music_stmt2028 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_for_music_stmt2030 = new BitSet(new long[]{0x5044020808000000L,0x0000000000108000L});
    public static final BitSet FOLLOW_expr_in_for_music_stmt2034 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_for_music_stmt2036 = new BitSet(new long[]{0x0000022800010000L});
    public static final BitSet FOLLOW_list_assig_in_for_music_stmt2039 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_for_music_stmt2041 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_for_music_stmt2044 = new BitSet(new long[]{0x048002F820011700L,0x00000000001414C0L});
    public static final BitSet FOLLOW_list_music_inst_in_for_music_stmt2047 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_for_music_stmt2049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assig_in_list_assig2078 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_list_assig2081 = new BitSet(new long[]{0x0000022800010000L});
    public static final BitSet FOLLOW_assig_in_list_assig2083 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_IF_in_if_stmt2121 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_if_stmt2124 = new BitSet(new long[]{0x5044020808000000L,0x0000000000108000L});
    public static final BitSet FOLLOW_expr_in_if_stmt2127 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_if_stmt2129 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_if_stmt2132 = new BitSet(new long[]{0x140002F820211500L,0x00000000000411C0L});
    public static final BitSet FOLLOW_listInst_in_if_stmt2135 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_if_stmt2137 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_elseif_stmt_in_if_stmt2140 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_else_stmt_in_if_stmt2143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_elseif_stmt2167 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_IF_in_elseif_stmt2169 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_elseif_stmt2171 = new BitSet(new long[]{0x5044020808000000L,0x0000000000108000L});
    public static final BitSet FOLLOW_expr_in_elseif_stmt2173 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_elseif_stmt2175 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_elseif_stmt2177 = new BitSet(new long[]{0x140002F820211500L,0x00000000000411C0L});
    public static final BitSet FOLLOW_listInst_in_elseif_stmt2179 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_elseif_stmt2181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_else_stmt2216 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_else_stmt2219 = new BitSet(new long[]{0x140002F820211500L,0x00000000000411C0L});
    public static final BitSet FOLLOW_listInst_in_else_stmt2222 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_else_stmt2224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_if_music_stmt2250 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_if_music_stmt2253 = new BitSet(new long[]{0x5044020808000000L,0x0000000000108000L});
    public static final BitSet FOLLOW_expr_in_if_music_stmt2256 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_if_music_stmt2258 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_if_music_stmt2261 = new BitSet(new long[]{0x048002F820011700L,0x00000000001414C0L});
    public static final BitSet FOLLOW_list_music_inst_in_if_music_stmt2264 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_if_music_stmt2266 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_elseif_music_stmt_in_if_music_stmt2269 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_else_music_stmt_in_if_music_stmt2272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_elseif_music_stmt2302 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_IF_in_elseif_music_stmt2304 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_elseif_music_stmt2306 = new BitSet(new long[]{0x5044020808000000L,0x0000000000108000L});
    public static final BitSet FOLLOW_expr_in_elseif_music_stmt2308 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_elseif_music_stmt2310 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_elseif_music_stmt2312 = new BitSet(new long[]{0x048002F820011700L,0x00000000001414C0L});
    public static final BitSet FOLLOW_list_music_inst_in_elseif_music_stmt2314 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_elseif_music_stmt2316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_else_music_stmt2357 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_else_music_stmt2360 = new BitSet(new long[]{0x048002F820011700L,0x00000000001414C0L});
    public static final BitSet FOLLOW_list_music_inst_in_else_music_stmt2363 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_else_music_stmt2365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SONG_in_song2400 = new BitSet(new long[]{0x0000020800000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_id_rule_in_song2403 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_song2406 = new BitSet(new long[]{0x0000000000000100L,0x0000000000006080L});
    public static final BitSet FOLLOW_beat_in_song2409 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006080L});
    public static final BitSet FOLLOW_speed_in_song2412 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006000L});
    public static final BitSet FOLLOW_transport_in_song2415 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_track_in_song2419 = new BitSet(new long[]{0x0000000000000000L,0x0000000008002000L});
    public static final BitSet FOLLOW_91_in_song2423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRACK_in_track2453 = new BitSet(new long[]{0x1000020800200000L,0x0000000000000300L});
    public static final BitSet FOLLOW_id_rule_in_track2456 = new BitSet(new long[]{0x1000000000200000L,0x0000000000000300L});
    public static final BitSet FOLLOW_STRING_in_track2459 = new BitSet(new long[]{0x1000000000200000L,0x0000000000000100L});
    public static final BitSet FOLLOW_compas_aux_in_track2462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compas_list_in_compas_aux2486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_BAR_in_compas_list2516 = new BitSet(new long[]{0x148002F820211700L,0x00000000001415C0L});
    public static final BitSet FOLLOW_repetition_in_compas_list2521 = new BitSet(new long[]{0x148002F820211700L,0x00000000001415C0L});
    public static final BitSet FOLLOW_compasses_in_compas_list2525 = new BitSet(new long[]{0x148002F820211700L,0x00000000001415C0L});
    public static final BitSet FOLLOW_repetition_in_compas_list2529 = new BitSet(new long[]{0x148002F820211700L,0x00000000001415C0L});
    public static final BitSet FOLLOW_DOUBLE_BAR_in_compas_list2534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compas_in_compasses2561 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_BAR_in_compasses2564 = new BitSet(new long[]{0x048002F820011700L,0x00000000001414C0L});
    public static final BitSet FOLLOW_compas_in_compasses2567 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_NUM_in_repetition2594 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_LETTER_X_in_repetition2596 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_START_REPETITION_in_repetition2600 = new BitSet(new long[]{0x048002F820011700L,0x00000000001414C0L});
    public static final BitSet FOLLOW_compasses_in_repetition2602 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_END_REPETITION_in_repetition2604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_music_inst_in_compas2654 = new BitSet(new long[]{0x048002F820011702L,0x00000000001414C0L});
    public static final BitSet FOLLOW_TONE_in_tone2698 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_NUM_in_tone2701 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000400L});
    public static final BitSet FOLLOW_set_in_tone2703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notes_type_in_notes_group2732 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800800L});
    public static final BitSet FOLLOW_87_in_notes_group2735 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_FIGURE_in_notes_group2737 = new BitSet(new long[]{0x0000000000100002L,0x0000000000000800L});
    public static final BitSet FOLLOW_DOT_in_notes_group2739 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_TIE_in_notes_group2744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notes_type_in_notes_variable2786 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_notes_variable2789 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_FIGURE_in_notes_variable2791 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_DOT_in_notes_variable2793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_chord_in_notes_type2836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notes_in_notes_type2840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHORD_in_chord2869 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_chord2872 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_NOTE_in_chord2875 = new BitSet(new long[]{0x4003000000020000L,0x0000000000200020L});
    public static final BitSet FOLLOW_85_in_chord2895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_notes2927 = new BitSet(new long[]{0x0080000000000200L,0x0000000000000400L});
    public static final BitSet FOLLOW_note_in_notes2930 = new BitSet(new long[]{0x0080000000000200L,0x0000000000200400L});
    public static final BitSet FOLLOW_85_in_notes2934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_note_in_notes2939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOTE_in_note2988 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_MINUS_in_note2992 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_NUM_in_note2995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolterm_in_expr3024 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_OR_in_expr3027 = new BitSet(new long[]{0x5044020808000000L,0x0000000000108000L});
    public static final BitSet FOLLOW_boolterm_in_expr3030 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_boolfact_in_boolterm3048 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_boolterm3051 = new BitSet(new long[]{0x5044020808000000L,0x0000000000108000L});
    public static final BitSet FOLLOW_boolfact_in_boolterm3054 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_num_expr_in_boolfact3076 = new BitSet(new long[]{0x0800810602000002L});
    public static final BitSet FOLLOW_EQUAL_in_boolfact3080 = new BitSet(new long[]{0x5044020808000000L,0x0000000000108000L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_boolfact3085 = new BitSet(new long[]{0x5044020808000000L,0x0000000000108000L});
    public static final BitSet FOLLOW_LT_in_boolfact3090 = new BitSet(new long[]{0x5044020808000000L,0x0000000000108000L});
    public static final BitSet FOLLOW_LE_in_boolfact3095 = new BitSet(new long[]{0x5044020808000000L,0x0000000000108000L});
    public static final BitSet FOLLOW_GT_in_boolfact3100 = new BitSet(new long[]{0x5044020808000000L,0x0000000000108000L});
    public static final BitSet FOLLOW_GE_in_boolfact3105 = new BitSet(new long[]{0x5044020808000000L,0x0000000000108000L});
    public static final BitSet FOLLOW_num_expr_in_boolfact3109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_num_expr3131 = new BitSet(new long[]{0x4004000000000002L});
    public static final BitSet FOLLOW_PLUS_in_num_expr3136 = new BitSet(new long[]{0x5044020808000000L,0x0000000000108000L});
    public static final BitSet FOLLOW_MINUS_in_num_expr3141 = new BitSet(new long[]{0x5044020808000000L,0x0000000000108000L});
    public static final BitSet FOLLOW_term_in_num_expr3145 = new BitSet(new long[]{0x4004000000000002L});
    public static final BitSet FOLLOW_factor_in_term3167 = new BitSet(new long[]{0x0010000000140002L});
    public static final BitSet FOLLOW_DOT_in_term3172 = new BitSet(new long[]{0x5044020808000000L,0x0000000000108000L});
    public static final BitSet FOLLOW_DIV_in_term3177 = new BitSet(new long[]{0x5044020808000000L,0x0000000000108000L});
    public static final BitSet FOLLOW_MOD_in_term3182 = new BitSet(new long[]{0x5044020808000000L,0x0000000000108000L});
    public static final BitSet FOLLOW_factor_in_term3186 = new BitSet(new long[]{0x0010000000140002L});
    public static final BitSet FOLLOW_NOT_in_factor3203 = new BitSet(new long[]{0x1000020808000000L,0x0000000000108000L});
    public static final BitSet FOLLOW_PLUS_in_factor3208 = new BitSet(new long[]{0x1000020808000000L,0x0000000000108000L});
    public static final BitSet FOLLOW_MINUS_in_factor3213 = new BitSet(new long[]{0x1000020808000000L,0x0000000000108000L});
    public static final BitSet FOLLOW_atom_in_factor3218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_access_in_atom3234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUM_in_atom3242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_atom3253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_atom3259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_atom3276 = new BitSet(new long[]{0x5044020808000000L,0x0000000000108000L});
    public static final BitSet FOLLOW_expr_in_atom3279 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_atom3281 = new BitSet(new long[]{0x0000000000000002L});

}