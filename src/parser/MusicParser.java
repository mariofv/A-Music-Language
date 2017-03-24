// $ANTLR 3.4 F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g 2017-03-21 20:18:05

package parser;
    // interp.MusicTree;
    import interpreter.AslTree;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class MusicParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "BAR", "BEAT", "BEMOL", "BOOL", "BOOLEAN", "COMMENT", "COMPAS_LIST", "DIV", "DOT", "DOUBLE_BAR", "ELSE", "END_REPETITION", "EQUAL", "ESC_SEQ", "FALSE", "FIGURE", "FOR", "FUNCTION", "GE", "GT", "ID", "IF", "INT", "LE", "LIST_FUNCTIONS", "LT", "MINUS", "MOD", "NOT", "NOTE", "NOTE_LIST", "NOT_EQUAL", "NUM", "OR", "PLUS", "RETURN", "SONG", "SPEED", "START_REPETITION", "STRING", "SUSTAIN", "TIE", "TRACK", "TRUE", "WHILE", "WS", "'('", "')'", "','", "'.'", "':'", "';'", "'{'", "'}'"
    };

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
    public String getGrammarFileName() { return "F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g"; }


    public static class prog_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prog"
    // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:28:1: prog : ( function )+ EOF -> ^( LIST_FUNCTIONS ( function )+ ) ;
    public final MusicParser.prog_return prog() throws RecognitionException {
        MusicParser.prog_return retval = new MusicParser.prog_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token EOF2=null;
        MusicParser.function_return function1 =null;


        AslTree EOF2_tree=null;
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_function=new RewriteRuleSubtreeStream(adaptor,"rule function");
        try {
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:28:10: ( ( function )+ EOF -> ^( LIST_FUNCTIONS ( function )+ ) )
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:28:14: ( function )+ EOF
            {
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:28:14: ( function )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:28:14: function
            	    {
            	    pushFollow(FOLLOW_function_in_prog94);
            	    function1=function();

            	    state._fsp--;

            	    stream_function.add(function1.getTree());

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


            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_prog97);  
            stream_EOF.add(EOF2);


            // AST REWRITE
            // elements: function
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 28:28: -> ^( LIST_FUNCTIONS ( function )+ )
            {
                // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:28:31: ^( LIST_FUNCTIONS ( function )+ )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(LIST_FUNCTIONS, "LIST_FUNCTIONS")
                , root_1);

                if ( !(stream_function.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_function.hasNext() ) {
                    adaptor.addChild(root_1, stream_function.nextTree());

                }
                stream_function.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "prog"


    public static class function_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "function"
    // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:31:1: function : id= ID '(' ( params )? ')' '{' listInst '}' -> ^( FUNCTION[$id.text] ( params )? listInst ) ;
    public final MusicParser.function_return function() throws RecognitionException {
        MusicParser.function_return retval = new MusicParser.function_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token id=null;
        Token char_literal3=null;
        Token char_literal5=null;
        Token char_literal6=null;
        Token char_literal8=null;
        MusicParser.params_return params4 =null;

        MusicParser.listInst_return listInst7 =null;


        AslTree id_tree=null;
        AslTree char_literal3_tree=null;
        AslTree char_literal5_tree=null;
        AslTree char_literal6_tree=null;
        AslTree char_literal8_tree=null;
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleSubtreeStream stream_listInst=new RewriteRuleSubtreeStream(adaptor,"rule listInst");
        RewriteRuleSubtreeStream stream_params=new RewriteRuleSubtreeStream(adaptor,"rule params");
        try {
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:31:13: (id= ID '(' ( params )? ')' '{' listInst '}' -> ^( FUNCTION[$id.text] ( params )? listInst ) )
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:31:17: id= ID '(' ( params )? ')' '{' listInst '}'
            {
            id=(Token)match(input,ID,FOLLOW_ID_in_function134);  
            stream_ID.add(id);


            char_literal3=(Token)match(input,51,FOLLOW_51_in_function136);  
            stream_51.add(char_literal3);


            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:31:26: ( params )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==FALSE||LA2_0==ID||LA2_0==INT||LA2_0==MINUS||LA2_0==NOT||LA2_0==PLUS||LA2_0==TRUE||LA2_0==51) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:31:26: params
                    {
                    pushFollow(FOLLOW_params_in_function137);
                    params4=params();

                    state._fsp--;

                    stream_params.add(params4.getTree());

                    }
                    break;

            }


            char_literal5=(Token)match(input,52,FOLLOW_52_in_function139);  
            stream_52.add(char_literal5);


            char_literal6=(Token)match(input,57,FOLLOW_57_in_function141);  
            stream_57.add(char_literal6);


            pushFollow(FOLLOW_listInst_in_function143);
            listInst7=listInst();

            state._fsp--;

            stream_listInst.add(listInst7.getTree());

            char_literal8=(Token)match(input,58,FOLLOW_58_in_function145);  
            stream_58.add(char_literal8);


            // AST REWRITE
            // elements: listInst, params
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 31:57: -> ^( FUNCTION[$id.text] ( params )? listInst )
            {
                // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:31:62: ^( FUNCTION[$id.text] ( params )? listInst )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(FUNCTION, (id!=null?id.getText():null))
                , root_1);

                // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:31:83: ( params )?
                if ( stream_params.hasNext() ) {
                    adaptor.addChild(root_1, stream_params.nextTree());

                }
                stream_params.reset();

                adaptor.addChild(root_1, stream_listInst.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "function"


    public static class params_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "params"
    // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:34:1: params : expr ( ',' ! expr )* ;
    public final MusicParser.params_return params() throws RecognitionException {
        MusicParser.params_return retval = new MusicParser.params_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal10=null;
        MusicParser.expr_return expr9 =null;

        MusicParser.expr_return expr11 =null;


        AslTree char_literal10_tree=null;

        try {
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:34:13: ( expr ( ',' ! expr )* )
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:34:17: expr ( ',' ! expr )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_expr_in_params190);
            expr9=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr9.getTree());

            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:34:22: ( ',' ! expr )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==53) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:34:23: ',' ! expr
            	    {
            	    char_literal10=(Token)match(input,53,FOLLOW_53_in_params193); 

            	    pushFollow(FOLLOW_expr_in_params196);
            	    expr11=expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr11.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "params"


    public static class listInst_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "listInst"
    // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:36:1: listInst : ( inst )* ;
    public final MusicParser.listInst_return listInst() throws RecognitionException {
        MusicParser.listInst_return retval = new MusicParser.listInst_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        MusicParser.inst_return inst12 =null;



        try {
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:36:13: ( ( inst )* )
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:36:17: ( inst )*
            {
            root_0 = (AslTree)adaptor.nil();


            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:36:17: ( inst )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==BEAT||LA4_0==BOOL||LA4_0==FOR||(LA4_0 >= ID && LA4_0 <= INT)||(LA4_0 >= SONG && LA4_0 <= SPEED)||LA4_0==WHILE) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:36:18: inst
            	    {
            	    pushFollow(FOLLOW_inst_in_listInst212);
            	    inst12=inst();

            	    state._fsp--;

            	    adaptor.addChild(root_0, inst12.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "listInst"


    public static class inst_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "inst"
    // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:38:1: inst : ( declaration | assignation | beat | speed | while_stmt | for_stmt | if_stmt | song );
    public final MusicParser.inst_return inst() throws RecognitionException {
        MusicParser.inst_return retval = new MusicParser.inst_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        MusicParser.declaration_return declaration13 =null;

        MusicParser.assignation_return assignation14 =null;

        MusicParser.beat_return beat15 =null;

        MusicParser.speed_return speed16 =null;

        MusicParser.while_stmt_return while_stmt17 =null;

        MusicParser.for_stmt_return for_stmt18 =null;

        MusicParser.if_stmt_return if_stmt19 =null;

        MusicParser.song_return song20 =null;



        try {
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:38:13: ( declaration | assignation | beat | speed | while_stmt | for_stmt | if_stmt | song )
            int alt5=8;
            switch ( input.LA(1) ) {
            case BOOL:
            case INT:
                {
                alt5=1;
                }
                break;
            case ID:
                {
                alt5=2;
                }
                break;
            case BEAT:
                {
                alt5=3;
                }
                break;
            case SPEED:
                {
                alt5=4;
                }
                break;
            case WHILE:
                {
                alt5=5;
                }
                break;
            case FOR:
                {
                alt5=6;
                }
                break;
            case IF:
                {
                alt5=7;
                }
                break;
            case SONG:
                {
                alt5=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }

            switch (alt5) {
                case 1 :
                    // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:38:17: declaration
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_declaration_in_inst231);
                    declaration13=declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, declaration13.getTree());

                    }
                    break;
                case 2 :
                    // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:39:17: assignation
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_assignation_in_inst249);
                    assignation14=assignation();

                    state._fsp--;

                    adaptor.addChild(root_0, assignation14.getTree());

                    }
                    break;
                case 3 :
                    // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:40:17: beat
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_beat_in_inst267);
                    beat15=beat();

                    state._fsp--;

                    adaptor.addChild(root_0, beat15.getTree());

                    }
                    break;
                case 4 :
                    // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:41:17: speed
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_speed_in_inst285);
                    speed16=speed();

                    state._fsp--;

                    adaptor.addChild(root_0, speed16.getTree());

                    }
                    break;
                case 5 :
                    // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:42:17: while_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_while_stmt_in_inst303);
                    while_stmt17=while_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, while_stmt17.getTree());

                    }
                    break;
                case 6 :
                    // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:43:17: for_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_for_stmt_in_inst321);
                    for_stmt18=for_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, for_stmt18.getTree());

                    }
                    break;
                case 7 :
                    // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:44:17: if_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_if_stmt_in_inst339);
                    if_stmt19=if_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, if_stmt19.getTree());

                    }
                    break;
                case 8 :
                    // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:45:17: song
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_song_in_inst357);
                    song20=song();

                    state._fsp--;

                    adaptor.addChild(root_0, song20.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "inst"


    public static class declaration_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "declaration"
    // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:48:1: declaration : ( INT ^ ID ( EQUAL ! atom )? ';' !| BOOL ^ ID ( EQUAL ! atom )? ';' !);
    public final MusicParser.declaration_return declaration() throws RecognitionException {
        MusicParser.declaration_return retval = new MusicParser.declaration_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token INT21=null;
        Token ID22=null;
        Token EQUAL23=null;
        Token char_literal25=null;
        Token BOOL26=null;
        Token ID27=null;
        Token EQUAL28=null;
        Token char_literal30=null;
        MusicParser.atom_return atom24 =null;

        MusicParser.atom_return atom29 =null;


        AslTree INT21_tree=null;
        AslTree ID22_tree=null;
        AslTree EQUAL23_tree=null;
        AslTree char_literal25_tree=null;
        AslTree BOOL26_tree=null;
        AslTree ID27_tree=null;
        AslTree EQUAL28_tree=null;
        AslTree char_literal30_tree=null;

        try {
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:48:13: ( INT ^ ID ( EQUAL ! atom )? ';' !| BOOL ^ ID ( EQUAL ! atom )? ';' !)
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==INT) ) {
                alt8=1;
            }
            else if ( (LA8_0==BOOL) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
                    // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:48:17: INT ^ ID ( EQUAL ! atom )? ';' !
                    {
                    root_0 = (AslTree)adaptor.nil();


                    INT21=(Token)match(input,INT,FOLLOW_INT_in_declaration380); 
                    INT21_tree = 
                    (AslTree)adaptor.create(INT21)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(INT21_tree, root_0);


                    ID22=(Token)match(input,ID,FOLLOW_ID_in_declaration383); 
                    ID22_tree = 
                    (AslTree)adaptor.create(ID22)
                    ;
                    adaptor.addChild(root_0, ID22_tree);


                    // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:48:25: ( EQUAL ! atom )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==EQUAL) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:48:26: EQUAL ! atom
                            {
                            EQUAL23=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_declaration386); 

                            pushFollow(FOLLOW_atom_in_declaration389);
                            atom24=atom();

                            state._fsp--;

                            adaptor.addChild(root_0, atom24.getTree());

                            }
                            break;

                    }


                    char_literal25=(Token)match(input,56,FOLLOW_56_in_declaration393); 

                    }
                    break;
                case 2 :
                    // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:49:17: BOOL ^ ID ( EQUAL ! atom )? ';' !
                    {
                    root_0 = (AslTree)adaptor.nil();


                    BOOL26=(Token)match(input,BOOL,FOLLOW_BOOL_in_declaration412); 
                    BOOL26_tree = 
                    (AslTree)adaptor.create(BOOL26)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(BOOL26_tree, root_0);


                    ID27=(Token)match(input,ID,FOLLOW_ID_in_declaration415); 
                    ID27_tree = 
                    (AslTree)adaptor.create(ID27)
                    ;
                    adaptor.addChild(root_0, ID27_tree);


                    // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:49:26: ( EQUAL ! atom )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==EQUAL) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:49:27: EQUAL ! atom
                            {
                            EQUAL28=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_declaration418); 

                            pushFollow(FOLLOW_atom_in_declaration421);
                            atom29=atom();

                            state._fsp--;

                            adaptor.addChild(root_0, atom29.getTree());

                            }
                            break;

                    }


                    char_literal30=(Token)match(input,56,FOLLOW_56_in_declaration425); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "declaration"


    public static class assignation_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assignation"
    // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:52:1: assignation : ID EQUAL ^ atom ;
    public final MusicParser.assignation_return assignation() throws RecognitionException {
        MusicParser.assignation_return retval = new MusicParser.assignation_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token ID31=null;
        Token EQUAL32=null;
        MusicParser.atom_return atom33 =null;


        AslTree ID31_tree=null;
        AslTree EQUAL32_tree=null;

        try {
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:52:13: ( ID EQUAL ^ atom )
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:52:17: ID EQUAL ^ atom
            {
            root_0 = (AslTree)adaptor.nil();


            ID31=(Token)match(input,ID,FOLLOW_ID_in_assignation449); 
            ID31_tree = 
            (AslTree)adaptor.create(ID31)
            ;
            adaptor.addChild(root_0, ID31_tree);


            EQUAL32=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_assignation451); 
            EQUAL32_tree = 
            (AslTree)adaptor.create(EQUAL32)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(EQUAL32_tree, root_0);


            pushFollow(FOLLOW_atom_in_assignation454);
            atom33=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom33.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assignation"


    public static class beat_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "beat"
    // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:55:1: beat : BEAT ^ NUM ':' ! NUM ;
    public final MusicParser.beat_return beat() throws RecognitionException {
        MusicParser.beat_return retval = new MusicParser.beat_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token BEAT34=null;
        Token NUM35=null;
        Token char_literal36=null;
        Token NUM37=null;

        AslTree BEAT34_tree=null;
        AslTree NUM35_tree=null;
        AslTree char_literal36_tree=null;
        AslTree NUM37_tree=null;

        try {
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:55:13: ( BEAT ^ NUM ':' ! NUM )
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:55:17: BEAT ^ NUM ':' ! NUM
            {
            root_0 = (AslTree)adaptor.nil();


            BEAT34=(Token)match(input,BEAT,FOLLOW_BEAT_in_beat484); 
            BEAT34_tree = 
            (AslTree)adaptor.create(BEAT34)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(BEAT34_tree, root_0);


            NUM35=(Token)match(input,NUM,FOLLOW_NUM_in_beat487); 
            NUM35_tree = 
            (AslTree)adaptor.create(NUM35)
            ;
            adaptor.addChild(root_0, NUM35_tree);


            char_literal36=(Token)match(input,55,FOLLOW_55_in_beat489); 

            NUM37=(Token)match(input,NUM,FOLLOW_NUM_in_beat492); 
            NUM37_tree = 
            (AslTree)adaptor.create(NUM37)
            ;
            adaptor.addChild(root_0, NUM37_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "beat"


    public static class speed_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "speed"
    // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:58:1: speed : SPEED ^ NUM ;
    public final MusicParser.speed_return speed() throws RecognitionException {
        MusicParser.speed_return retval = new MusicParser.speed_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token SPEED38=null;
        Token NUM39=null;

        AslTree SPEED38_tree=null;
        AslTree NUM39_tree=null;

        try {
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:58:13: ( SPEED ^ NUM )
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:58:17: SPEED ^ NUM
            {
            root_0 = (AslTree)adaptor.nil();


            SPEED38=(Token)match(input,SPEED,FOLLOW_SPEED_in_speed521); 
            SPEED38_tree = 
            (AslTree)adaptor.create(SPEED38)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(SPEED38_tree, root_0);


            NUM39=(Token)match(input,NUM,FOLLOW_NUM_in_speed524); 
            NUM39_tree = 
            (AslTree)adaptor.create(NUM39)
            ;
            adaptor.addChild(root_0, NUM39_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "speed"


    public static class while_stmt_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "while_stmt"
    // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:62:1: while_stmt : WHILE ^;
    public final MusicParser.while_stmt_return while_stmt() throws RecognitionException {
        MusicParser.while_stmt_return retval = new MusicParser.while_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token WHILE40=null;

        AslTree WHILE40_tree=null;

        try {
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:62:18: ( WHILE ^)
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:62:22: WHILE ^
            {
            root_0 = (AslTree)adaptor.nil();


            WHILE40=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_stmt554); 
            WHILE40_tree = 
            (AslTree)adaptor.create(WHILE40)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(WHILE40_tree, root_0);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "while_stmt"


    public static class for_stmt_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "for_stmt"
    // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:65:1: for_stmt : FOR ^;
    public final MusicParser.for_stmt_return for_stmt() throws RecognitionException {
        MusicParser.for_stmt_return retval = new MusicParser.for_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token FOR41=null;

        AslTree FOR41_tree=null;

        try {
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:65:18: ( FOR ^)
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:65:22: FOR ^
            {
            root_0 = (AslTree)adaptor.nil();


            FOR41=(Token)match(input,FOR,FOLLOW_FOR_in_for_stmt586); 
            FOR41_tree = 
            (AslTree)adaptor.create(FOR41)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(FOR41_tree, root_0);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "for_stmt"


    public static class if_stmt_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "if_stmt"
    // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:68:1: if_stmt : IF ^;
    public final MusicParser.if_stmt_return if_stmt() throws RecognitionException {
        MusicParser.if_stmt_return retval = new MusicParser.if_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token IF42=null;

        AslTree IF42_tree=null;

        try {
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:68:18: ( IF ^)
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:68:22: IF ^
            {
            root_0 = (AslTree)adaptor.nil();


            IF42=(Token)match(input,IF,FOLLOW_IF_in_if_stmt619); 
            IF42_tree = 
            (AslTree)adaptor.create(IF42)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(IF42_tree, root_0);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "if_stmt"


    public static class song_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "song"
    // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:72:1: song : SONG ^ '{' ! ( track )+ '}' !;
    public final MusicParser.song_return song() throws RecognitionException {
        MusicParser.song_return retval = new MusicParser.song_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token SONG43=null;
        Token char_literal44=null;
        Token char_literal46=null;
        MusicParser.track_return track45 =null;


        AslTree SONG43_tree=null;
        AslTree char_literal44_tree=null;
        AslTree char_literal46_tree=null;

        try {
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:72:13: ( SONG ^ '{' ! ( track )+ '}' !)
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:72:17: SONG ^ '{' ! ( track )+ '}' !
            {
            root_0 = (AslTree)adaptor.nil();


            SONG43=(Token)match(input,SONG,FOLLOW_SONG_in_song651); 
            SONG43_tree = 
            (AslTree)adaptor.create(SONG43)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(SONG43_tree, root_0);


            char_literal44=(Token)match(input,57,FOLLOW_57_in_song654); 

            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:72:28: ( track )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==TRACK) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:72:29: track
            	    {
            	    pushFollow(FOLLOW_track_in_song658);
            	    track45=track();

            	    state._fsp--;

            	    adaptor.addChild(root_0, track45.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            char_literal46=(Token)match(input,58,FOLLOW_58_in_song662); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "song"


    public static class track_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "track"
    // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:76:1: track : TRACK ^ ID compas_list ;
    public final MusicParser.track_return track() throws RecognitionException {
        MusicParser.track_return retval = new MusicParser.track_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token TRACK47=null;
        Token ID48=null;
        MusicParser.compas_list_return compas_list49 =null;


        AslTree TRACK47_tree=null;
        AslTree ID48_tree=null;

        try {
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:76:13: ( TRACK ^ ID compas_list )
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:76:17: TRACK ^ ID compas_list
            {
            root_0 = (AslTree)adaptor.nil();


            TRACK47=(Token)match(input,TRACK,FOLLOW_TRACK_in_track693); 
            TRACK47_tree = 
            (AslTree)adaptor.create(TRACK47)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(TRACK47_tree, root_0);


            ID48=(Token)match(input,ID,FOLLOW_ID_in_track696); 
            ID48_tree = 
            (AslTree)adaptor.create(ID48)
            ;
            adaptor.addChild(root_0, ID48_tree);


            pushFollow(FOLLOW_compas_list_in_track698);
            compas_list49=compas_list();

            state._fsp--;

            adaptor.addChild(root_0, compas_list49.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "track"


    public static class compas_list_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "compas_list"
    // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:79:1: compas_list : ( DOUBLE_BAR compas ) ( BAR compas )* DOUBLE_BAR -> ^( COMPAS_LIST ( compas )+ ) ;
    public final MusicParser.compas_list_return compas_list() throws RecognitionException {
        MusicParser.compas_list_return retval = new MusicParser.compas_list_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token DOUBLE_BAR50=null;
        Token BAR52=null;
        Token DOUBLE_BAR54=null;
        MusicParser.compas_return compas51 =null;

        MusicParser.compas_return compas53 =null;


        AslTree DOUBLE_BAR50_tree=null;
        AslTree BAR52_tree=null;
        AslTree DOUBLE_BAR54_tree=null;
        RewriteRuleTokenStream stream_DOUBLE_BAR=new RewriteRuleTokenStream(adaptor,"token DOUBLE_BAR");
        RewriteRuleTokenStream stream_BAR=new RewriteRuleTokenStream(adaptor,"token BAR");
        RewriteRuleSubtreeStream stream_compas=new RewriteRuleSubtreeStream(adaptor,"rule compas");
        try {
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:79:13: ( ( DOUBLE_BAR compas ) ( BAR compas )* DOUBLE_BAR -> ^( COMPAS_LIST ( compas )+ ) )
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:79:17: ( DOUBLE_BAR compas ) ( BAR compas )* DOUBLE_BAR
            {
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:79:17: ( DOUBLE_BAR compas )
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:79:18: DOUBLE_BAR compas
            {
            DOUBLE_BAR50=(Token)match(input,DOUBLE_BAR,FOLLOW_DOUBLE_BAR_in_compas_list722);  
            stream_DOUBLE_BAR.add(DOUBLE_BAR50);


            pushFollow(FOLLOW_compas_in_compas_list724);
            compas51=compas();

            state._fsp--;

            stream_compas.add(compas51.getTree());

            }


            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:79:37: ( BAR compas )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==BAR) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:79:38: BAR compas
            	    {
            	    BAR52=(Token)match(input,BAR,FOLLOW_BAR_in_compas_list728);  
            	    stream_BAR.add(BAR52);


            	    pushFollow(FOLLOW_compas_in_compas_list730);
            	    compas53=compas();

            	    state._fsp--;

            	    stream_compas.add(compas53.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            DOUBLE_BAR54=(Token)match(input,DOUBLE_BAR,FOLLOW_DOUBLE_BAR_in_compas_list734);  
            stream_DOUBLE_BAR.add(DOUBLE_BAR54);


            // AST REWRITE
            // elements: compas
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 79:62: -> ^( COMPAS_LIST ( compas )+ )
            {
                // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:79:65: ^( COMPAS_LIST ( compas )+ )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(COMPAS_LIST, "COMPAS_LIST")
                , root_1);

                if ( !(stream_compas.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_compas.hasNext() ) {
                    adaptor.addChild(root_1, stream_compas.nextTree());

                }
                stream_compas.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "compas_list"


    public static class compas_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "compas"
    // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:82:1: compas : ( note )+ -> ^( NOTE_LIST ( note )+ ) ;
    public final MusicParser.compas_return compas() throws RecognitionException {
        MusicParser.compas_return retval = new MusicParser.compas_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        MusicParser.note_return note55 =null;


        RewriteRuleSubtreeStream stream_note=new RewriteRuleSubtreeStream(adaptor,"rule note");
        try {
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:82:13: ( ( note )+ -> ^( NOTE_LIST ( note )+ ) )
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:82:17: ( note )+
            {
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:82:17: ( note )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==BEMOL||LA11_0==NOTE||LA11_0==SUSTAIN) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:82:18: note
            	    {
            	    pushFollow(FOLLOW_note_in_compas772);
            	    note55=note();

            	    state._fsp--;

            	    stream_note.add(note55.getTree());

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
            // elements: note
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 82:28: -> ^( NOTE_LIST ( note )+ )
            {
                // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:82:31: ^( NOTE_LIST ( note )+ )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(NOTE_LIST, "NOTE_LIST")
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


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "compas"


    public static class note_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "note"
    // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:85:1: note : ( BEMOL | SUSTAIN )? NOTE ^ ( '.' ! FIGURE )? ( DOT )? ( TIE )? ;
    public final MusicParser.note_return note() throws RecognitionException {
        MusicParser.note_return retval = new MusicParser.note_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token set56=null;
        Token NOTE57=null;
        Token char_literal58=null;
        Token FIGURE59=null;
        Token DOT60=null;
        Token TIE61=null;

        AslTree set56_tree=null;
        AslTree NOTE57_tree=null;
        AslTree char_literal58_tree=null;
        AslTree FIGURE59_tree=null;
        AslTree DOT60_tree=null;
        AslTree TIE61_tree=null;

        try {
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:85:13: ( ( BEMOL | SUSTAIN )? NOTE ^ ( '.' ! FIGURE )? ( DOT )? ( TIE )? )
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:85:17: ( BEMOL | SUSTAIN )? NOTE ^ ( '.' ! FIGURE )? ( DOT )? ( TIE )?
            {
            root_0 = (AslTree)adaptor.nil();


            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:85:17: ( BEMOL | SUSTAIN )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==BEMOL||LA12_0==SUSTAIN) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:
                    {
                    set56=(Token)input.LT(1);

                    if ( input.LA(1)==BEMOL||input.LA(1)==SUSTAIN ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (AslTree)adaptor.create(set56)
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


            NOTE57=(Token)match(input,NOTE,FOLLOW_NOTE_in_note825); 
            NOTE57_tree = 
            (AslTree)adaptor.create(NOTE57)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(NOTE57_tree, root_0);


            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:85:42: ( '.' ! FIGURE )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==54) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:85:43: '.' ! FIGURE
                    {
                    char_literal58=(Token)match(input,54,FOLLOW_54_in_note829); 

                    FIGURE59=(Token)match(input,FIGURE,FOLLOW_FIGURE_in_note832); 
                    FIGURE59_tree = 
                    (AslTree)adaptor.create(FIGURE59)
                    ;
                    adaptor.addChild(root_0, FIGURE59_tree);


                    }
                    break;

            }


            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:85:57: ( DOT )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==DOT) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:85:57: DOT
                    {
                    DOT60=(Token)match(input,DOT,FOLLOW_DOT_in_note836); 
                    DOT60_tree = 
                    (AslTree)adaptor.create(DOT60)
                    ;
                    adaptor.addChild(root_0, DOT60_tree);


                    }
                    break;

            }


            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:85:62: ( TIE )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==TIE) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:85:62: TIE
                    {
                    TIE61=(Token)match(input,TIE,FOLLOW_TIE_in_note839); 
                    TIE61_tree = 
                    (AslTree)adaptor.create(TIE61)
                    ;
                    adaptor.addChild(root_0, TIE61_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "note"


    public static class expr_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:89:1: expr : boolterm ( OR ^ boolterm )* ;
    public final MusicParser.expr_return expr() throws RecognitionException {
        MusicParser.expr_return retval = new MusicParser.expr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token OR63=null;
        MusicParser.boolterm_return boolterm62 =null;

        MusicParser.boolterm_return boolterm64 =null;


        AslTree OR63_tree=null;

        try {
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:89:9: ( boolterm ( OR ^ boolterm )* )
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:89:13: boolterm ( OR ^ boolterm )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_boolterm_in_expr867);
            boolterm62=boolterm();

            state._fsp--;

            adaptor.addChild(root_0, boolterm62.getTree());

            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:89:22: ( OR ^ boolterm )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==OR) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:89:23: OR ^ boolterm
            	    {
            	    OR63=(Token)match(input,OR,FOLLOW_OR_in_expr870); 
            	    OR63_tree = 
            	    (AslTree)adaptor.create(OR63)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(OR63_tree, root_0);


            	    pushFollow(FOLLOW_boolterm_in_expr873);
            	    boolterm64=boolterm();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolterm64.getTree());

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr"


    public static class boolterm_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolterm"
    // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:92:1: boolterm : boolfact ( AND ^ boolfact )* ;
    public final MusicParser.boolterm_return boolterm() throws RecognitionException {
        MusicParser.boolterm_return retval = new MusicParser.boolterm_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token AND66=null;
        MusicParser.boolfact_return boolfact65 =null;

        MusicParser.boolfact_return boolfact67 =null;


        AslTree AND66_tree=null;

        try {
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:92:9: ( boolfact ( AND ^ boolfact )* )
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:92:13: boolfact ( AND ^ boolfact )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_boolfact_in_boolterm887);
            boolfact65=boolfact();

            state._fsp--;

            adaptor.addChild(root_0, boolfact65.getTree());

            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:92:22: ( AND ^ boolfact )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==AND) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:92:23: AND ^ boolfact
            	    {
            	    AND66=(Token)match(input,AND,FOLLOW_AND_in_boolterm890); 
            	    AND66_tree = 
            	    (AslTree)adaptor.create(AND66)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(AND66_tree, root_0);


            	    pushFollow(FOLLOW_boolfact_in_boolterm893);
            	    boolfact67=boolfact();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolfact67.getTree());

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "boolterm"


    public static class boolfact_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolfact"
    // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:95:1: boolfact : num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? ;
    public final MusicParser.boolfact_return boolfact() throws RecognitionException {
        MusicParser.boolfact_return retval = new MusicParser.boolfact_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token EQUAL69=null;
        Token NOT_EQUAL70=null;
        Token LT71=null;
        Token LE72=null;
        Token GT73=null;
        Token GE74=null;
        MusicParser.num_expr_return num_expr68 =null;

        MusicParser.num_expr_return num_expr75 =null;


        AslTree EQUAL69_tree=null;
        AslTree NOT_EQUAL70_tree=null;
        AslTree LT71_tree=null;
        AslTree LE72_tree=null;
        AslTree GT73_tree=null;
        AslTree GE74_tree=null;

        try {
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:95:9: ( num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? )
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:95:13: num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_num_expr_in_boolfact907);
            num_expr68=num_expr();

            state._fsp--;

            adaptor.addChild(root_0, num_expr68.getTree());

            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:95:22: ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==EQUAL||(LA19_0 >= GE && LA19_0 <= GT)||LA19_0==LE||LA19_0==LT||LA19_0==NOT_EQUAL) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:95:23: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr
                    {
                    // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:95:23: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^)
                    int alt18=6;
                    switch ( input.LA(1) ) {
                    case EQUAL:
                        {
                        alt18=1;
                        }
                        break;
                    case NOT_EQUAL:
                        {
                        alt18=2;
                        }
                        break;
                    case LT:
                        {
                        alt18=3;
                        }
                        break;
                    case LE:
                        {
                        alt18=4;
                        }
                        break;
                    case GT:
                        {
                        alt18=5;
                        }
                        break;
                    case GE:
                        {
                        alt18=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 0, input);

                        throw nvae;

                    }

                    switch (alt18) {
                        case 1 :
                            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:95:24: EQUAL ^
                            {
                            EQUAL69=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_boolfact911); 
                            EQUAL69_tree = 
                            (AslTree)adaptor.create(EQUAL69)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(EQUAL69_tree, root_0);


                            }
                            break;
                        case 2 :
                            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:95:33: NOT_EQUAL ^
                            {
                            NOT_EQUAL70=(Token)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_boolfact916); 
                            NOT_EQUAL70_tree = 
                            (AslTree)adaptor.create(NOT_EQUAL70)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(NOT_EQUAL70_tree, root_0);


                            }
                            break;
                        case 3 :
                            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:95:46: LT ^
                            {
                            LT71=(Token)match(input,LT,FOLLOW_LT_in_boolfact921); 
                            LT71_tree = 
                            (AslTree)adaptor.create(LT71)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(LT71_tree, root_0);


                            }
                            break;
                        case 4 :
                            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:95:52: LE ^
                            {
                            LE72=(Token)match(input,LE,FOLLOW_LE_in_boolfact926); 
                            LE72_tree = 
                            (AslTree)adaptor.create(LE72)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(LE72_tree, root_0);


                            }
                            break;
                        case 5 :
                            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:95:58: GT ^
                            {
                            GT73=(Token)match(input,GT,FOLLOW_GT_in_boolfact931); 
                            GT73_tree = 
                            (AslTree)adaptor.create(GT73)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(GT73_tree, root_0);


                            }
                            break;
                        case 6 :
                            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:95:64: GE ^
                            {
                            GE74=(Token)match(input,GE,FOLLOW_GE_in_boolfact936); 
                            GE74_tree = 
                            (AslTree)adaptor.create(GE74)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(GE74_tree, root_0);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_num_expr_in_boolfact940);
                    num_expr75=num_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, num_expr75.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "boolfact"


    public static class num_expr_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "num_expr"
    // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:98:1: num_expr : term ( ( PLUS ^| MINUS ^) term )* ;
    public final MusicParser.num_expr_return num_expr() throws RecognitionException {
        MusicParser.num_expr_return retval = new MusicParser.num_expr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token PLUS77=null;
        Token MINUS78=null;
        MusicParser.term_return term76 =null;

        MusicParser.term_return term79 =null;


        AslTree PLUS77_tree=null;
        AslTree MINUS78_tree=null;

        try {
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:98:9: ( term ( ( PLUS ^| MINUS ^) term )* )
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:98:13: term ( ( PLUS ^| MINUS ^) term )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_term_in_num_expr954);
            term76=term();

            state._fsp--;

            adaptor.addChild(root_0, term76.getTree());

            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:98:18: ( ( PLUS ^| MINUS ^) term )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==MINUS||LA21_0==PLUS) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:98:20: ( PLUS ^| MINUS ^) term
            	    {
            	    // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:98:20: ( PLUS ^| MINUS ^)
            	    int alt20=2;
            	    int LA20_0 = input.LA(1);

            	    if ( (LA20_0==PLUS) ) {
            	        alt20=1;
            	    }
            	    else if ( (LA20_0==MINUS) ) {
            	        alt20=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 20, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt20) {
            	        case 1 :
            	            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:98:21: PLUS ^
            	            {
            	            PLUS77=(Token)match(input,PLUS,FOLLOW_PLUS_in_num_expr959); 
            	            PLUS77_tree = 
            	            (AslTree)adaptor.create(PLUS77)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(PLUS77_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:98:29: MINUS ^
            	            {
            	            MINUS78=(Token)match(input,MINUS,FOLLOW_MINUS_in_num_expr964); 
            	            MINUS78_tree = 
            	            (AslTree)adaptor.create(MINUS78)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MINUS78_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_term_in_num_expr968);
            	    term79=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term79.getTree());

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "num_expr"


    public static class term_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "term"
    // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:101:1: term : factor ( ( DOT ^| DIV ^| MOD ^) factor )* ;
    public final MusicParser.term_return term() throws RecognitionException {
        MusicParser.term_return retval = new MusicParser.term_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token DOT81=null;
        Token DIV82=null;
        Token MOD83=null;
        MusicParser.factor_return factor80 =null;

        MusicParser.factor_return factor84 =null;


        AslTree DOT81_tree=null;
        AslTree DIV82_tree=null;
        AslTree MOD83_tree=null;

        try {
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:101:9: ( factor ( ( DOT ^| DIV ^| MOD ^) factor )* )
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:101:13: factor ( ( DOT ^| DIV ^| MOD ^) factor )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term986);
            factor80=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor80.getTree());

            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:101:20: ( ( DOT ^| DIV ^| MOD ^) factor )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0 >= DIV && LA23_0 <= DOT)||LA23_0==MOD) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:101:22: ( DOT ^| DIV ^| MOD ^) factor
            	    {
            	    // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:101:22: ( DOT ^| DIV ^| MOD ^)
            	    int alt22=3;
            	    switch ( input.LA(1) ) {
            	    case DOT:
            	        {
            	        alt22=1;
            	        }
            	        break;
            	    case DIV:
            	        {
            	        alt22=2;
            	        }
            	        break;
            	    case MOD:
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
            	            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:101:23: DOT ^
            	            {
            	            DOT81=(Token)match(input,DOT,FOLLOW_DOT_in_term991); 
            	            DOT81_tree = 
            	            (AslTree)adaptor.create(DOT81)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(DOT81_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:101:30: DIV ^
            	            {
            	            DIV82=(Token)match(input,DIV,FOLLOW_DIV_in_term996); 
            	            DIV82_tree = 
            	            (AslTree)adaptor.create(DIV82)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(DIV82_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:101:37: MOD ^
            	            {
            	            MOD83=(Token)match(input,MOD,FOLLOW_MOD_in_term1001); 
            	            MOD83_tree = 
            	            (AslTree)adaptor.create(MOD83)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MOD83_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_factor_in_term1005);
            	    factor84=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor84.getTree());

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "term"


    public static class factor_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "factor"
    // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:104:1: factor : ( NOT ^| PLUS ^| MINUS ^)? atom ;
    public final MusicParser.factor_return factor() throws RecognitionException {
        MusicParser.factor_return retval = new MusicParser.factor_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token NOT85=null;
        Token PLUS86=null;
        Token MINUS87=null;
        MusicParser.atom_return atom88 =null;


        AslTree NOT85_tree=null;
        AslTree PLUS86_tree=null;
        AslTree MINUS87_tree=null;

        try {
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:104:9: ( ( NOT ^| PLUS ^| MINUS ^)? atom )
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:104:13: ( NOT ^| PLUS ^| MINUS ^)? atom
            {
            root_0 = (AslTree)adaptor.nil();


            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:104:13: ( NOT ^| PLUS ^| MINUS ^)?
            int alt24=4;
            switch ( input.LA(1) ) {
                case NOT:
                    {
                    alt24=1;
                    }
                    break;
                case PLUS:
                    {
                    alt24=2;
                    }
                    break;
                case MINUS:
                    {
                    alt24=3;
                    }
                    break;
            }

            switch (alt24) {
                case 1 :
                    // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:104:14: NOT ^
                    {
                    NOT85=(Token)match(input,NOT,FOLLOW_NOT_in_factor1022); 
                    NOT85_tree = 
                    (AslTree)adaptor.create(NOT85)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(NOT85_tree, root_0);


                    }
                    break;
                case 2 :
                    // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:104:21: PLUS ^
                    {
                    PLUS86=(Token)match(input,PLUS,FOLLOW_PLUS_in_factor1027); 
                    PLUS86_tree = 
                    (AslTree)adaptor.create(PLUS86)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(PLUS86_tree, root_0);


                    }
                    break;
                case 3 :
                    // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:104:29: MINUS ^
                    {
                    MINUS87=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor1032); 
                    MINUS87_tree = 
                    (AslTree)adaptor.create(MINUS87)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(MINUS87_tree, root_0);


                    }
                    break;

            }


            pushFollow(FOLLOW_atom_in_factor1037);
            atom88=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom88.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "factor"


    public static class atom_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "atom"
    // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:107:1: atom : ( ID | INT | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | '(' ! expr ')' !);
    public final MusicParser.atom_return atom() throws RecognitionException {
        MusicParser.atom_return retval = new MusicParser.atom_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token b=null;
        Token ID89=null;
        Token INT90=null;
        Token char_literal91=null;
        Token char_literal93=null;
        MusicParser.expr_return expr92 =null;


        AslTree b_tree=null;
        AslTree ID89_tree=null;
        AslTree INT90_tree=null;
        AslTree char_literal91_tree=null;
        AslTree char_literal93_tree=null;
        RewriteRuleTokenStream stream_FALSE=new RewriteRuleTokenStream(adaptor,"token FALSE");
        RewriteRuleTokenStream stream_TRUE=new RewriteRuleTokenStream(adaptor,"token TRUE");

        try {
            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:107:9: ( ID | INT | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | '(' ! expr ')' !)
            int alt26=4;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt26=1;
                }
                break;
            case INT:
                {
                alt26=2;
                }
                break;
            case FALSE:
            case TRUE:
                {
                alt26=3;
                }
                break;
            case 51:
                {
                alt26=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;

            }

            switch (alt26) {
                case 1 :
                    // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:107:13: ID
                    {
                    root_0 = (AslTree)adaptor.nil();


                    ID89=(Token)match(input,ID,FOLLOW_ID_in_atom1053); 
                    ID89_tree = 
                    (AslTree)adaptor.create(ID89)
                    ;
                    adaptor.addChild(root_0, ID89_tree);


                    }
                    break;
                case 2 :
                    // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:108:7: INT
                    {
                    root_0 = (AslTree)adaptor.nil();


                    INT90=(Token)match(input,INT,FOLLOW_INT_in_atom1061); 
                    INT90_tree = 
                    (AslTree)adaptor.create(INT90)
                    ;
                    adaptor.addChild(root_0, INT90_tree);


                    }
                    break;
                case 3 :
                    // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:109:7: (b= TRUE |b= FALSE )
                    {
                    // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:109:7: (b= TRUE |b= FALSE )
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==TRUE) ) {
                        alt25=1;
                    }
                    else if ( (LA25_0==FALSE) ) {
                        alt25=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 0, input);

                        throw nvae;

                    }
                    switch (alt25) {
                        case 1 :
                            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:109:8: b= TRUE
                            {
                            b=(Token)match(input,TRUE,FOLLOW_TRUE_in_atom1072);  
                            stream_TRUE.add(b);


                            }
                            break;
                        case 2 :
                            // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:109:17: b= FALSE
                            {
                            b=(Token)match(input,FALSE,FOLLOW_FALSE_in_atom1078);  
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

                    root_0 = (AslTree)adaptor.nil();
                    // 109:27: -> ^( BOOLEAN[$b,$b.text] )
                    {
                        // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:109:30: ^( BOOLEAN[$b,$b.text] )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(BOOLEAN, b, (b!=null?b.getText():null))
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // F:\\Assig\\CL\\PRACTICA-CL\\src\\parser\\Music.g:110:7: '(' ! expr ')' !
                    {
                    root_0 = (AslTree)adaptor.nil();


                    char_literal91=(Token)match(input,51,FOLLOW_51_in_atom1095); 

                    pushFollow(FOLLOW_expr_in_atom1098);
                    expr92=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr92.getTree());

                    char_literal93=(Token)match(input,52,FOLLOW_52_in_atom1100); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "atom"

    // Delegated rules


 

    public static final BitSet FOLLOW_function_in_prog94 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_EOF_in_prog97 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_function134 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_function136 = new BitSet(new long[]{0x001900828A080000L});
    public static final BitSet FOLLOW_params_in_function137 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_function139 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_function141 = new BitSet(new long[]{0x040206000E200140L});
    public static final BitSet FOLLOW_listInst_in_function143 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_function145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_params190 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_params193 = new BitSet(new long[]{0x000900828A080000L});
    public static final BitSet FOLLOW_expr_in_params196 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_inst_in_listInst212 = new BitSet(new long[]{0x000206000E200142L});
    public static final BitSet FOLLOW_declaration_in_inst231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignation_in_inst249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_beat_in_inst267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_speed_in_inst285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_stmt_in_inst303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_stmt_in_inst321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_stmt_in_inst339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_song_in_inst357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_declaration380 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ID_in_declaration383 = new BitSet(new long[]{0x0100000000020000L});
    public static final BitSet FOLLOW_EQUAL_in_declaration386 = new BitSet(new long[]{0x000900000A080000L});
    public static final BitSet FOLLOW_atom_in_declaration389 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_declaration393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOL_in_declaration412 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ID_in_declaration415 = new BitSet(new long[]{0x0100000000020000L});
    public static final BitSet FOLLOW_EQUAL_in_declaration418 = new BitSet(new long[]{0x000900000A080000L});
    public static final BitSet FOLLOW_atom_in_declaration421 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_declaration425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assignation449 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_EQUAL_in_assignation451 = new BitSet(new long[]{0x000900000A080000L});
    public static final BitSet FOLLOW_atom_in_assignation454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BEAT_in_beat484 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_NUM_in_beat487 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_beat489 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_NUM_in_beat492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SPEED_in_speed521 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_NUM_in_speed524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_stmt554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_for_stmt586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_if_stmt619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SONG_in_song651 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_song654 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_track_in_song658 = new BitSet(new long[]{0x0400800000000000L});
    public static final BitSet FOLLOW_58_in_song662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRACK_in_track693 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ID_in_track696 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_compas_list_in_track698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_BAR_in_compas_list722 = new BitSet(new long[]{0x0000200400000080L});
    public static final BitSet FOLLOW_compas_in_compas_list724 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_BAR_in_compas_list728 = new BitSet(new long[]{0x0000200400000080L});
    public static final BitSet FOLLOW_compas_in_compas_list730 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_DOUBLE_BAR_in_compas_list734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_note_in_compas772 = new BitSet(new long[]{0x0000200400000082L});
    public static final BitSet FOLLOW_NOTE_in_note825 = new BitSet(new long[]{0x0040400000002002L});
    public static final BitSet FOLLOW_54_in_note829 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_FIGURE_in_note832 = new BitSet(new long[]{0x0000400000002002L});
    public static final BitSet FOLLOW_DOT_in_note836 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_TIE_in_note839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolterm_in_expr867 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_OR_in_expr870 = new BitSet(new long[]{0x000900828A080000L});
    public static final BitSet FOLLOW_boolterm_in_expr873 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_boolfact_in_boolterm887 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_boolterm890 = new BitSet(new long[]{0x000900828A080000L});
    public static final BitSet FOLLOW_boolfact_in_boolterm893 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_num_expr_in_boolfact907 = new BitSet(new long[]{0x0000001051820002L});
    public static final BitSet FOLLOW_EQUAL_in_boolfact911 = new BitSet(new long[]{0x000900828A080000L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_boolfact916 = new BitSet(new long[]{0x000900828A080000L});
    public static final BitSet FOLLOW_LT_in_boolfact921 = new BitSet(new long[]{0x000900828A080000L});
    public static final BitSet FOLLOW_LE_in_boolfact926 = new BitSet(new long[]{0x000900828A080000L});
    public static final BitSet FOLLOW_GT_in_boolfact931 = new BitSet(new long[]{0x000900828A080000L});
    public static final BitSet FOLLOW_GE_in_boolfact936 = new BitSet(new long[]{0x000900828A080000L});
    public static final BitSet FOLLOW_num_expr_in_boolfact940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_num_expr954 = new BitSet(new long[]{0x0000008080000002L});
    public static final BitSet FOLLOW_PLUS_in_num_expr959 = new BitSet(new long[]{0x000900828A080000L});
    public static final BitSet FOLLOW_MINUS_in_num_expr964 = new BitSet(new long[]{0x000900828A080000L});
    public static final BitSet FOLLOW_term_in_num_expr968 = new BitSet(new long[]{0x0000008080000002L});
    public static final BitSet FOLLOW_factor_in_term986 = new BitSet(new long[]{0x0000000100003002L});
    public static final BitSet FOLLOW_DOT_in_term991 = new BitSet(new long[]{0x000900828A080000L});
    public static final BitSet FOLLOW_DIV_in_term996 = new BitSet(new long[]{0x000900828A080000L});
    public static final BitSet FOLLOW_MOD_in_term1001 = new BitSet(new long[]{0x000900828A080000L});
    public static final BitSet FOLLOW_factor_in_term1005 = new BitSet(new long[]{0x0000000100003002L});
    public static final BitSet FOLLOW_NOT_in_factor1022 = new BitSet(new long[]{0x000900000A080000L});
    public static final BitSet FOLLOW_PLUS_in_factor1027 = new BitSet(new long[]{0x000900000A080000L});
    public static final BitSet FOLLOW_MINUS_in_factor1032 = new BitSet(new long[]{0x000900000A080000L});
    public static final BitSet FOLLOW_atom_in_factor1037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom1061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_atom1072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_atom1078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_atom1095 = new BitSet(new long[]{0x000900828A080000L});
    public static final BitSet FOLLOW_expr_in_atom1098 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_atom1100 = new BitSet(new long[]{0x0000000000000002L});

}