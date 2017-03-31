// $ANTLR 3.4 src/parser/Music.g 2017-03-31 17:11:55

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
    public String getGrammarFileName() { return "src/parser/Music.g"; }


    public static class prog_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prog"
    // src/parser/Music.g:27:1: prog : ( function )+ EOF -> ^( LIST_FUNCTIONS ( function )+ ) ;
    public final MusicParser.prog_return prog() throws RecognitionException {
        MusicParser.prog_return retval = new MusicParser.prog_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token EOF2=null;
        MusicParser.function_return function1 =null;


        AmlTree EOF2_tree=null;
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_function=new RewriteRuleSubtreeStream(adaptor,"rule function");
        try {
            // src/parser/Music.g:27:10: ( ( function )+ EOF -> ^( LIST_FUNCTIONS ( function )+ ) )
            // src/parser/Music.g:27:14: ( function )+ EOF
            {
            // src/parser/Music.g:27:14: ( function )+
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
            	    // src/parser/Music.g:27:14: function
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

            root_0 = (AmlTree)adaptor.nil();
            // 27:28: -> ^( LIST_FUNCTIONS ( function )+ )
            {
                // src/parser/Music.g:27:31: ^( LIST_FUNCTIONS ( function )+ )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(LIST_FUNCTIONS, "LIST_FUNCTIONS")
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


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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


    public static class function_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "function"
    // src/parser/Music.g:30:1: function : id= ID '(' ( params )? ')' '{' listInst '}' -> ^( FUNCTION[$id.text] ( params )? listInst ) ;
    public final MusicParser.function_return function() throws RecognitionException {
        MusicParser.function_return retval = new MusicParser.function_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token id=null;
        Token char_literal3=null;
        Token char_literal5=null;
        Token char_literal6=null;
        Token char_literal8=null;
        MusicParser.params_return params4 =null;

        MusicParser.listInst_return listInst7 =null;


        AmlTree id_tree=null;
        AmlTree char_literal3_tree=null;
        AmlTree char_literal5_tree=null;
        AmlTree char_literal6_tree=null;
        AmlTree char_literal8_tree=null;
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleSubtreeStream stream_listInst=new RewriteRuleSubtreeStream(adaptor,"rule listInst");
        RewriteRuleSubtreeStream stream_params=new RewriteRuleSubtreeStream(adaptor,"rule params");
        try {
            // src/parser/Music.g:30:13: (id= ID '(' ( params )? ')' '{' listInst '}' -> ^( FUNCTION[$id.text] ( params )? listInst ) )
            // src/parser/Music.g:30:17: id= ID '(' ( params )? ')' '{' listInst '}'
            {
            id=(Token)match(input,ID,FOLLOW_ID_in_function134);  
            stream_ID.add(id);


            char_literal3=(Token)match(input,51,FOLLOW_51_in_function136);  
            stream_51.add(char_literal3);


            // src/parser/Music.g:30:26: ( params )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==FALSE||LA2_0==ID||LA2_0==INT||LA2_0==MINUS||LA2_0==NOT||LA2_0==PLUS||LA2_0==TRUE||LA2_0==51) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // src/parser/Music.g:30:26: params
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

            root_0 = (AmlTree)adaptor.nil();
            // 30:57: -> ^( FUNCTION[$id.text] ( params )? listInst )
            {
                // src/parser/Music.g:30:62: ^( FUNCTION[$id.text] ( params )? listInst )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(FUNCTION, (id!=null?id.getText():null))
                , root_1);

                // src/parser/Music.g:30:83: ( params )?
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


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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


    public static class params_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "params"
    // src/parser/Music.g:33:1: params : expr ( ',' ! expr )* ;
    public final MusicParser.params_return params() throws RecognitionException {
        MusicParser.params_return retval = new MusicParser.params_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal10=null;
        MusicParser.expr_return expr9 =null;

        MusicParser.expr_return expr11 =null;


        AmlTree char_literal10_tree=null;

        try {
            // src/parser/Music.g:33:13: ( expr ( ',' ! expr )* )
            // src/parser/Music.g:33:17: expr ( ',' ! expr )*
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_expr_in_params190);
            expr9=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr9.getTree());

            // src/parser/Music.g:33:22: ( ',' ! expr )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==53) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // src/parser/Music.g:33:23: ',' ! expr
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


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:35:1: listInst : ( inst )* ;
    public final MusicParser.listInst_return listInst() throws RecognitionException {
        MusicParser.listInst_return retval = new MusicParser.listInst_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        MusicParser.inst_return inst12 =null;



        try {
            // src/parser/Music.g:35:13: ( ( inst )* )
            // src/parser/Music.g:35:17: ( inst )*
            {
            root_0 = (AmlTree)adaptor.nil();


            // src/parser/Music.g:35:17: ( inst )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==BOOL||LA4_0==FOR||(LA4_0 >= ID && LA4_0 <= INT)||LA4_0==SONG||LA4_0==WHILE) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // src/parser/Music.g:35:18: inst
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


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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


    public static class inst_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "inst"
    // src/parser/Music.g:37:1: inst : ( declaration | assignation | while_stmt | for_stmt | if_stmt | song );
    public final MusicParser.inst_return inst() throws RecognitionException {
        MusicParser.inst_return retval = new MusicParser.inst_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        MusicParser.declaration_return declaration13 =null;

        MusicParser.assignation_return assignation14 =null;

        MusicParser.while_stmt_return while_stmt15 =null;

        MusicParser.for_stmt_return for_stmt16 =null;

        MusicParser.if_stmt_return if_stmt17 =null;

        MusicParser.song_return song18 =null;



        try {
            // src/parser/Music.g:37:13: ( declaration | assignation | while_stmt | for_stmt | if_stmt | song )
            int alt5=6;
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
            case WHILE:
                {
                alt5=3;
                }
                break;
            case FOR:
                {
                alt5=4;
                }
                break;
            case IF:
                {
                alt5=5;
                }
                break;
            case SONG:
                {
                alt5=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }

            switch (alt5) {
                case 1 :
                    // src/parser/Music.g:37:17: declaration
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_declaration_in_inst231);
                    declaration13=declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, declaration13.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:38:17: assignation
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_assignation_in_inst249);
                    assignation14=assignation();

                    state._fsp--;

                    adaptor.addChild(root_0, assignation14.getTree());

                    }
                    break;
                case 3 :
                    // src/parser/Music.g:39:17: while_stmt
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_while_stmt_in_inst267);
                    while_stmt15=while_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, while_stmt15.getTree());

                    }
                    break;
                case 4 :
                    // src/parser/Music.g:40:17: for_stmt
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_for_stmt_in_inst285);
                    for_stmt16=for_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, for_stmt16.getTree());

                    }
                    break;
                case 5 :
                    // src/parser/Music.g:41:17: if_stmt
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_if_stmt_in_inst303);
                    if_stmt17=if_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, if_stmt17.getTree());

                    }
                    break;
                case 6 :
                    // src/parser/Music.g:42:17: song
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_song_in_inst321);
                    song18=song();

                    state._fsp--;

                    adaptor.addChild(root_0, song18.getTree());

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


    public static class declaration_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "declaration"
    // src/parser/Music.g:45:1: declaration : ( INT ^ ID ( EQUAL ! atom )? ';' !| BOOL ^ ID ( EQUAL ! atom )? ';' !);
    public final MusicParser.declaration_return declaration() throws RecognitionException {
        MusicParser.declaration_return retval = new MusicParser.declaration_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token INT19=null;
        Token ID20=null;
        Token EQUAL21=null;
        Token char_literal23=null;
        Token BOOL24=null;
        Token ID25=null;
        Token EQUAL26=null;
        Token char_literal28=null;
        MusicParser.atom_return atom22 =null;

        MusicParser.atom_return atom27 =null;


        AmlTree INT19_tree=null;
        AmlTree ID20_tree=null;
        AmlTree EQUAL21_tree=null;
        AmlTree char_literal23_tree=null;
        AmlTree BOOL24_tree=null;
        AmlTree ID25_tree=null;
        AmlTree EQUAL26_tree=null;
        AmlTree char_literal28_tree=null;

        try {
            // src/parser/Music.g:45:13: ( INT ^ ID ( EQUAL ! atom )? ';' !| BOOL ^ ID ( EQUAL ! atom )? ';' !)
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
                    // src/parser/Music.g:45:17: INT ^ ID ( EQUAL ! atom )? ';' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    INT19=(Token)match(input,INT,FOLLOW_INT_in_declaration344); 
                    INT19_tree = 
                    (AmlTree)adaptor.create(INT19)
                    ;
                    root_0 = (AmlTree)adaptor.becomeRoot(INT19_tree, root_0);


                    ID20=(Token)match(input,ID,FOLLOW_ID_in_declaration347); 
                    ID20_tree = 
                    (AmlTree)adaptor.create(ID20)
                    ;
                    adaptor.addChild(root_0, ID20_tree);


                    // src/parser/Music.g:45:25: ( EQUAL ! atom )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==EQUAL) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // src/parser/Music.g:45:26: EQUAL ! atom
                            {
                            EQUAL21=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_declaration350); 

                            pushFollow(FOLLOW_atom_in_declaration353);
                            atom22=atom();

                            state._fsp--;

                            adaptor.addChild(root_0, atom22.getTree());

                            }
                            break;

                    }


                    char_literal23=(Token)match(input,56,FOLLOW_56_in_declaration357); 

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:46:17: BOOL ^ ID ( EQUAL ! atom )? ';' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    BOOL24=(Token)match(input,BOOL,FOLLOW_BOOL_in_declaration376); 
                    BOOL24_tree = 
                    (AmlTree)adaptor.create(BOOL24)
                    ;
                    root_0 = (AmlTree)adaptor.becomeRoot(BOOL24_tree, root_0);


                    ID25=(Token)match(input,ID,FOLLOW_ID_in_declaration379); 
                    ID25_tree = 
                    (AmlTree)adaptor.create(ID25)
                    ;
                    adaptor.addChild(root_0, ID25_tree);


                    // src/parser/Music.g:46:26: ( EQUAL ! atom )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==EQUAL) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // src/parser/Music.g:46:27: EQUAL ! atom
                            {
                            EQUAL26=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_declaration382); 

                            pushFollow(FOLLOW_atom_in_declaration385);
                            atom27=atom();

                            state._fsp--;

                            adaptor.addChild(root_0, atom27.getTree());

                            }
                            break;

                    }


                    char_literal28=(Token)match(input,56,FOLLOW_56_in_declaration389); 

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
    // $ANTLR end "declaration"


    public static class assignation_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assignation"
    // src/parser/Music.g:49:1: assignation : ID EQUAL ^ atom ;
    public final MusicParser.assignation_return assignation() throws RecognitionException {
        MusicParser.assignation_return retval = new MusicParser.assignation_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token ID29=null;
        Token EQUAL30=null;
        MusicParser.atom_return atom31 =null;


        AmlTree ID29_tree=null;
        AmlTree EQUAL30_tree=null;

        try {
            // src/parser/Music.g:49:13: ( ID EQUAL ^ atom )
            // src/parser/Music.g:49:17: ID EQUAL ^ atom
            {
            root_0 = (AmlTree)adaptor.nil();


            ID29=(Token)match(input,ID,FOLLOW_ID_in_assignation413); 
            ID29_tree = 
            (AmlTree)adaptor.create(ID29)
            ;
            adaptor.addChild(root_0, ID29_tree);


            EQUAL30=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_assignation415); 
            EQUAL30_tree = 
            (AmlTree)adaptor.create(EQUAL30)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(EQUAL30_tree, root_0);


            pushFollow(FOLLOW_atom_in_assignation418);
            atom31=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom31.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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


    public static class beat_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "beat"
    // src/parser/Music.g:52:1: beat : BEAT ^ NUM ':' ! NUM ;
    public final MusicParser.beat_return beat() throws RecognitionException {
        MusicParser.beat_return retval = new MusicParser.beat_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token BEAT32=null;
        Token NUM33=null;
        Token char_literal34=null;
        Token NUM35=null;

        AmlTree BEAT32_tree=null;
        AmlTree NUM33_tree=null;
        AmlTree char_literal34_tree=null;
        AmlTree NUM35_tree=null;

        try {
            // src/parser/Music.g:52:13: ( BEAT ^ NUM ':' ! NUM )
            // src/parser/Music.g:52:17: BEAT ^ NUM ':' ! NUM
            {
            root_0 = (AmlTree)adaptor.nil();


            BEAT32=(Token)match(input,BEAT,FOLLOW_BEAT_in_beat448); 
            BEAT32_tree = 
            (AmlTree)adaptor.create(BEAT32)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(BEAT32_tree, root_0);


            NUM33=(Token)match(input,NUM,FOLLOW_NUM_in_beat451); 
            NUM33_tree = 
            (AmlTree)adaptor.create(NUM33)
            ;
            adaptor.addChild(root_0, NUM33_tree);


            char_literal34=(Token)match(input,55,FOLLOW_55_in_beat453); 

            NUM35=(Token)match(input,NUM,FOLLOW_NUM_in_beat456); 
            NUM35_tree = 
            (AmlTree)adaptor.create(NUM35)
            ;
            adaptor.addChild(root_0, NUM35_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:55:1: speed : SPEED ^ NUM ;
    public final MusicParser.speed_return speed() throws RecognitionException {
        MusicParser.speed_return retval = new MusicParser.speed_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token SPEED36=null;
        Token NUM37=null;

        AmlTree SPEED36_tree=null;
        AmlTree NUM37_tree=null;

        try {
            // src/parser/Music.g:55:13: ( SPEED ^ NUM )
            // src/parser/Music.g:55:17: SPEED ^ NUM
            {
            root_0 = (AmlTree)adaptor.nil();


            SPEED36=(Token)match(input,SPEED,FOLLOW_SPEED_in_speed485); 
            SPEED36_tree = 
            (AmlTree)adaptor.create(SPEED36)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(SPEED36_tree, root_0);


            NUM37=(Token)match(input,NUM,FOLLOW_NUM_in_speed488); 
            NUM37_tree = 
            (AmlTree)adaptor.create(NUM37)
            ;
            adaptor.addChild(root_0, NUM37_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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


    public static class while_stmt_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "while_stmt"
    // src/parser/Music.g:59:1: while_stmt : WHILE ^;
    public final MusicParser.while_stmt_return while_stmt() throws RecognitionException {
        MusicParser.while_stmt_return retval = new MusicParser.while_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token WHILE38=null;

        AmlTree WHILE38_tree=null;

        try {
            // src/parser/Music.g:59:18: ( WHILE ^)
            // src/parser/Music.g:59:22: WHILE ^
            {
            root_0 = (AmlTree)adaptor.nil();


            WHILE38=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_stmt518); 
            WHILE38_tree = 
            (AmlTree)adaptor.create(WHILE38)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(WHILE38_tree, root_0);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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


    public static class for_stmt_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "for_stmt"
    // src/parser/Music.g:62:1: for_stmt : FOR ^;
    public final MusicParser.for_stmt_return for_stmt() throws RecognitionException {
        MusicParser.for_stmt_return retval = new MusicParser.for_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token FOR39=null;

        AmlTree FOR39_tree=null;

        try {
            // src/parser/Music.g:62:18: ( FOR ^)
            // src/parser/Music.g:62:22: FOR ^
            {
            root_0 = (AmlTree)adaptor.nil();


            FOR39=(Token)match(input,FOR,FOLLOW_FOR_in_for_stmt550); 
            FOR39_tree = 
            (AmlTree)adaptor.create(FOR39)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(FOR39_tree, root_0);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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


    public static class if_stmt_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "if_stmt"
    // src/parser/Music.g:65:1: if_stmt : IF ^;
    public final MusicParser.if_stmt_return if_stmt() throws RecognitionException {
        MusicParser.if_stmt_return retval = new MusicParser.if_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token IF40=null;

        AmlTree IF40_tree=null;

        try {
            // src/parser/Music.g:65:18: ( IF ^)
            // src/parser/Music.g:65:22: IF ^
            {
            root_0 = (AmlTree)adaptor.nil();


            IF40=(Token)match(input,IF,FOLLOW_IF_in_if_stmt583); 
            IF40_tree = 
            (AmlTree)adaptor.create(IF40)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(IF40_tree, root_0);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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


    public static class song_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "song"
    // src/parser/Music.g:69:1: song : SONG ^ '{' ! beat speed ( track )+ '}' !;
    public final MusicParser.song_return song() throws RecognitionException {
        MusicParser.song_return retval = new MusicParser.song_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token SONG41=null;
        Token char_literal42=null;
        Token char_literal46=null;
        MusicParser.beat_return beat43 =null;

        MusicParser.speed_return speed44 =null;

        MusicParser.track_return track45 =null;


        AmlTree SONG41_tree=null;
        AmlTree char_literal42_tree=null;
        AmlTree char_literal46_tree=null;

        try {
            // src/parser/Music.g:69:13: ( SONG ^ '{' ! beat speed ( track )+ '}' !)
            // src/parser/Music.g:69:17: SONG ^ '{' ! beat speed ( track )+ '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            SONG41=(Token)match(input,SONG,FOLLOW_SONG_in_song615); 
            SONG41_tree = 
            (AmlTree)adaptor.create(SONG41)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(SONG41_tree, root_0);


            char_literal42=(Token)match(input,57,FOLLOW_57_in_song618); 

            pushFollow(FOLLOW_beat_in_song621);
            beat43=beat();

            state._fsp--;

            adaptor.addChild(root_0, beat43.getTree());

            pushFollow(FOLLOW_speed_in_song623);
            speed44=speed();

            state._fsp--;

            adaptor.addChild(root_0, speed44.getTree());

            // src/parser/Music.g:69:39: ( track )+
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
            	    // src/parser/Music.g:69:40: track
            	    {
            	    pushFollow(FOLLOW_track_in_song626);
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


            char_literal46=(Token)match(input,58,FOLLOW_58_in_song630); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:73:1: track : TRACK ^ ID compas_list ;
    public final MusicParser.track_return track() throws RecognitionException {
        MusicParser.track_return retval = new MusicParser.track_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token TRACK47=null;
        Token ID48=null;
        MusicParser.compas_list_return compas_list49 =null;


        AmlTree TRACK47_tree=null;
        AmlTree ID48_tree=null;

        try {
            // src/parser/Music.g:73:13: ( TRACK ^ ID compas_list )
            // src/parser/Music.g:73:17: TRACK ^ ID compas_list
            {
            root_0 = (AmlTree)adaptor.nil();


            TRACK47=(Token)match(input,TRACK,FOLLOW_TRACK_in_track661); 
            TRACK47_tree = 
            (AmlTree)adaptor.create(TRACK47)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(TRACK47_tree, root_0);


            ID48=(Token)match(input,ID,FOLLOW_ID_in_track664); 
            ID48_tree = 
            (AmlTree)adaptor.create(ID48)
            ;
            adaptor.addChild(root_0, ID48_tree);


            pushFollow(FOLLOW_compas_list_in_track666);
            compas_list49=compas_list();

            state._fsp--;

            adaptor.addChild(root_0, compas_list49.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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


    public static class compas_list_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "compas_list"
    // src/parser/Music.g:76:1: compas_list : ( DOUBLE_BAR compas ) ( BAR compas )* DOUBLE_BAR -> ^( COMPAS_LIST ( compas )+ ) ;
    public final MusicParser.compas_list_return compas_list() throws RecognitionException {
        MusicParser.compas_list_return retval = new MusicParser.compas_list_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token DOUBLE_BAR50=null;
        Token BAR52=null;
        Token DOUBLE_BAR54=null;
        MusicParser.compas_return compas51 =null;

        MusicParser.compas_return compas53 =null;


        AmlTree DOUBLE_BAR50_tree=null;
        AmlTree BAR52_tree=null;
        AmlTree DOUBLE_BAR54_tree=null;
        RewriteRuleTokenStream stream_DOUBLE_BAR=new RewriteRuleTokenStream(adaptor,"token DOUBLE_BAR");
        RewriteRuleTokenStream stream_BAR=new RewriteRuleTokenStream(adaptor,"token BAR");
        RewriteRuleSubtreeStream stream_compas=new RewriteRuleSubtreeStream(adaptor,"rule compas");
        try {
            // src/parser/Music.g:76:13: ( ( DOUBLE_BAR compas ) ( BAR compas )* DOUBLE_BAR -> ^( COMPAS_LIST ( compas )+ ) )
            // src/parser/Music.g:76:17: ( DOUBLE_BAR compas ) ( BAR compas )* DOUBLE_BAR
            {
            // src/parser/Music.g:76:17: ( DOUBLE_BAR compas )
            // src/parser/Music.g:76:18: DOUBLE_BAR compas
            {
            DOUBLE_BAR50=(Token)match(input,DOUBLE_BAR,FOLLOW_DOUBLE_BAR_in_compas_list690);  
            stream_DOUBLE_BAR.add(DOUBLE_BAR50);


            pushFollow(FOLLOW_compas_in_compas_list692);
            compas51=compas();

            state._fsp--;

            stream_compas.add(compas51.getTree());

            }


            // src/parser/Music.g:76:37: ( BAR compas )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==BAR) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // src/parser/Music.g:76:38: BAR compas
            	    {
            	    BAR52=(Token)match(input,BAR,FOLLOW_BAR_in_compas_list696);  
            	    stream_BAR.add(BAR52);


            	    pushFollow(FOLLOW_compas_in_compas_list698);
            	    compas53=compas();

            	    state._fsp--;

            	    stream_compas.add(compas53.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            DOUBLE_BAR54=(Token)match(input,DOUBLE_BAR,FOLLOW_DOUBLE_BAR_in_compas_list702);  
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

            root_0 = (AmlTree)adaptor.nil();
            // 76:62: -> ^( COMPAS_LIST ( compas )+ )
            {
                // src/parser/Music.g:76:65: ^( COMPAS_LIST ( compas )+ )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(COMPAS_LIST, "COMPAS_LIST")
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


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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


    public static class compas_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "compas"
    // src/parser/Music.g:79:1: compas : ( note )+ -> ^( NOTE_LIST ( note )+ ) ;
    public final MusicParser.compas_return compas() throws RecognitionException {
        MusicParser.compas_return retval = new MusicParser.compas_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        MusicParser.note_return note55 =null;


        RewriteRuleSubtreeStream stream_note=new RewriteRuleSubtreeStream(adaptor,"rule note");
        try {
            // src/parser/Music.g:79:13: ( ( note )+ -> ^( NOTE_LIST ( note )+ ) )
            // src/parser/Music.g:79:17: ( note )+
            {
            // src/parser/Music.g:79:17: ( note )+
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
            	    // src/parser/Music.g:79:18: note
            	    {
            	    pushFollow(FOLLOW_note_in_compas740);
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

            root_0 = (AmlTree)adaptor.nil();
            // 79:28: -> ^( NOTE_LIST ( note )+ )
            {
                // src/parser/Music.g:79:31: ^( NOTE_LIST ( note )+ )
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
    // $ANTLR end "compas"


    public static class note_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "note"
    // src/parser/Music.g:82:1: note : ( BEMOL | SUSTAIN )? NOTE ^ ( '-' ! NUM )? ( '.' ! FIGURE )? ( DOT )? ( TIE )? ;
    public final MusicParser.note_return note() throws RecognitionException {
        MusicParser.note_return retval = new MusicParser.note_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token set56=null;
        Token NOTE57=null;
        Token char_literal58=null;
        Token NUM59=null;
        Token char_literal60=null;
        Token FIGURE61=null;
        Token DOT62=null;
        Token TIE63=null;

        AmlTree set56_tree=null;
        AmlTree NOTE57_tree=null;
        AmlTree char_literal58_tree=null;
        AmlTree NUM59_tree=null;
        AmlTree char_literal60_tree=null;
        AmlTree FIGURE61_tree=null;
        AmlTree DOT62_tree=null;
        AmlTree TIE63_tree=null;

        try {
            // src/parser/Music.g:82:13: ( ( BEMOL | SUSTAIN )? NOTE ^ ( '-' ! NUM )? ( '.' ! FIGURE )? ( DOT )? ( TIE )? )
            // src/parser/Music.g:82:17: ( BEMOL | SUSTAIN )? NOTE ^ ( '-' ! NUM )? ( '.' ! FIGURE )? ( DOT )? ( TIE )?
            {
            root_0 = (AmlTree)adaptor.nil();


            // src/parser/Music.g:82:17: ( BEMOL | SUSTAIN )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==BEMOL||LA12_0==SUSTAIN) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // src/parser/Music.g:
                    {
                    set56=(Token)input.LT(1);

                    if ( input.LA(1)==BEMOL||input.LA(1)==SUSTAIN ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (AmlTree)adaptor.create(set56)
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


            NOTE57=(Token)match(input,NOTE,FOLLOW_NOTE_in_note793); 
            NOTE57_tree = 
            (AmlTree)adaptor.create(NOTE57)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(NOTE57_tree, root_0);


            // src/parser/Music.g:82:42: ( '-' ! NUM )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==MINUS) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // src/parser/Music.g:82:43: '-' ! NUM
                    {
                    char_literal58=(Token)match(input,MINUS,FOLLOW_MINUS_in_note797); 

                    NUM59=(Token)match(input,NUM,FOLLOW_NUM_in_note800); 
                    NUM59_tree = 
                    (AmlTree)adaptor.create(NUM59)
                    ;
                    adaptor.addChild(root_0, NUM59_tree);


                    }
                    break;

            }


            // src/parser/Music.g:82:54: ( '.' ! FIGURE )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==54) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // src/parser/Music.g:82:55: '.' ! FIGURE
                    {
                    char_literal60=(Token)match(input,54,FOLLOW_54_in_note805); 

                    FIGURE61=(Token)match(input,FIGURE,FOLLOW_FIGURE_in_note808); 
                    FIGURE61_tree = 
                    (AmlTree)adaptor.create(FIGURE61)
                    ;
                    adaptor.addChild(root_0, FIGURE61_tree);


                    }
                    break;

            }


            // src/parser/Music.g:82:69: ( DOT )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==DOT) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // src/parser/Music.g:82:69: DOT
                    {
                    DOT62=(Token)match(input,DOT,FOLLOW_DOT_in_note812); 
                    DOT62_tree = 
                    (AmlTree)adaptor.create(DOT62)
                    ;
                    adaptor.addChild(root_0, DOT62_tree);


                    }
                    break;

            }


            // src/parser/Music.g:82:74: ( TIE )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==TIE) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // src/parser/Music.g:82:74: TIE
                    {
                    TIE63=(Token)match(input,TIE,FOLLOW_TIE_in_note815); 
                    TIE63_tree = 
                    (AmlTree)adaptor.create(TIE63)
                    ;
                    adaptor.addChild(root_0, TIE63_tree);


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
    // src/parser/Music.g:86:1: expr : boolterm ( OR ^ boolterm )* ;
    public final MusicParser.expr_return expr() throws RecognitionException {
        MusicParser.expr_return retval = new MusicParser.expr_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token OR65=null;
        MusicParser.boolterm_return boolterm64 =null;

        MusicParser.boolterm_return boolterm66 =null;


        AmlTree OR65_tree=null;

        try {
            // src/parser/Music.g:86:9: ( boolterm ( OR ^ boolterm )* )
            // src/parser/Music.g:86:13: boolterm ( OR ^ boolterm )*
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_boolterm_in_expr843);
            boolterm64=boolterm();

            state._fsp--;

            adaptor.addChild(root_0, boolterm64.getTree());

            // src/parser/Music.g:86:22: ( OR ^ boolterm )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==OR) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // src/parser/Music.g:86:23: OR ^ boolterm
            	    {
            	    OR65=(Token)match(input,OR,FOLLOW_OR_in_expr846); 
            	    OR65_tree = 
            	    (AmlTree)adaptor.create(OR65)
            	    ;
            	    root_0 = (AmlTree)adaptor.becomeRoot(OR65_tree, root_0);


            	    pushFollow(FOLLOW_boolterm_in_expr849);
            	    boolterm66=boolterm();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolterm66.getTree());

            	    }
            	    break;

            	default :
            	    break loop17;
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
    // src/parser/Music.g:89:1: boolterm : boolfact ( AND ^ boolfact )* ;
    public final MusicParser.boolterm_return boolterm() throws RecognitionException {
        MusicParser.boolterm_return retval = new MusicParser.boolterm_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token AND68=null;
        MusicParser.boolfact_return boolfact67 =null;

        MusicParser.boolfact_return boolfact69 =null;


        AmlTree AND68_tree=null;

        try {
            // src/parser/Music.g:89:9: ( boolfact ( AND ^ boolfact )* )
            // src/parser/Music.g:89:13: boolfact ( AND ^ boolfact )*
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_boolfact_in_boolterm863);
            boolfact67=boolfact();

            state._fsp--;

            adaptor.addChild(root_0, boolfact67.getTree());

            // src/parser/Music.g:89:22: ( AND ^ boolfact )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==AND) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // src/parser/Music.g:89:23: AND ^ boolfact
            	    {
            	    AND68=(Token)match(input,AND,FOLLOW_AND_in_boolterm866); 
            	    AND68_tree = 
            	    (AmlTree)adaptor.create(AND68)
            	    ;
            	    root_0 = (AmlTree)adaptor.becomeRoot(AND68_tree, root_0);


            	    pushFollow(FOLLOW_boolfact_in_boolterm869);
            	    boolfact69=boolfact();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolfact69.getTree());

            	    }
            	    break;

            	default :
            	    break loop18;
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
    // src/parser/Music.g:92:1: boolfact : num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? ;
    public final MusicParser.boolfact_return boolfact() throws RecognitionException {
        MusicParser.boolfact_return retval = new MusicParser.boolfact_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token EQUAL71=null;
        Token NOT_EQUAL72=null;
        Token LT73=null;
        Token LE74=null;
        Token GT75=null;
        Token GE76=null;
        MusicParser.num_expr_return num_expr70 =null;

        MusicParser.num_expr_return num_expr77 =null;


        AmlTree EQUAL71_tree=null;
        AmlTree NOT_EQUAL72_tree=null;
        AmlTree LT73_tree=null;
        AmlTree LE74_tree=null;
        AmlTree GT75_tree=null;
        AmlTree GE76_tree=null;

        try {
            // src/parser/Music.g:92:9: ( num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? )
            // src/parser/Music.g:92:13: num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_num_expr_in_boolfact883);
            num_expr70=num_expr();

            state._fsp--;

            adaptor.addChild(root_0, num_expr70.getTree());

            // src/parser/Music.g:92:22: ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==EQUAL||(LA20_0 >= GE && LA20_0 <= GT)||LA20_0==LE||LA20_0==LT||LA20_0==NOT_EQUAL) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // src/parser/Music.g:92:23: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr
                    {
                    // src/parser/Music.g:92:23: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^)
                    int alt19=6;
                    switch ( input.LA(1) ) {
                    case EQUAL:
                        {
                        alt19=1;
                        }
                        break;
                    case NOT_EQUAL:
                        {
                        alt19=2;
                        }
                        break;
                    case LT:
                        {
                        alt19=3;
                        }
                        break;
                    case LE:
                        {
                        alt19=4;
                        }
                        break;
                    case GT:
                        {
                        alt19=5;
                        }
                        break;
                    case GE:
                        {
                        alt19=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 0, input);

                        throw nvae;

                    }

                    switch (alt19) {
                        case 1 :
                            // src/parser/Music.g:92:24: EQUAL ^
                            {
                            EQUAL71=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_boolfact887); 
                            EQUAL71_tree = 
                            (AmlTree)adaptor.create(EQUAL71)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(EQUAL71_tree, root_0);


                            }
                            break;
                        case 2 :
                            // src/parser/Music.g:92:33: NOT_EQUAL ^
                            {
                            NOT_EQUAL72=(Token)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_boolfact892); 
                            NOT_EQUAL72_tree = 
                            (AmlTree)adaptor.create(NOT_EQUAL72)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(NOT_EQUAL72_tree, root_0);


                            }
                            break;
                        case 3 :
                            // src/parser/Music.g:92:46: LT ^
                            {
                            LT73=(Token)match(input,LT,FOLLOW_LT_in_boolfact897); 
                            LT73_tree = 
                            (AmlTree)adaptor.create(LT73)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(LT73_tree, root_0);


                            }
                            break;
                        case 4 :
                            // src/parser/Music.g:92:52: LE ^
                            {
                            LE74=(Token)match(input,LE,FOLLOW_LE_in_boolfact902); 
                            LE74_tree = 
                            (AmlTree)adaptor.create(LE74)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(LE74_tree, root_0);


                            }
                            break;
                        case 5 :
                            // src/parser/Music.g:92:58: GT ^
                            {
                            GT75=(Token)match(input,GT,FOLLOW_GT_in_boolfact907); 
                            GT75_tree = 
                            (AmlTree)adaptor.create(GT75)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(GT75_tree, root_0);


                            }
                            break;
                        case 6 :
                            // src/parser/Music.g:92:64: GE ^
                            {
                            GE76=(Token)match(input,GE,FOLLOW_GE_in_boolfact912); 
                            GE76_tree = 
                            (AmlTree)adaptor.create(GE76)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(GE76_tree, root_0);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_num_expr_in_boolfact916);
                    num_expr77=num_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, num_expr77.getTree());

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
    // src/parser/Music.g:95:1: num_expr : term ( ( PLUS ^| MINUS ^) term )* ;
    public final MusicParser.num_expr_return num_expr() throws RecognitionException {
        MusicParser.num_expr_return retval = new MusicParser.num_expr_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token PLUS79=null;
        Token MINUS80=null;
        MusicParser.term_return term78 =null;

        MusicParser.term_return term81 =null;


        AmlTree PLUS79_tree=null;
        AmlTree MINUS80_tree=null;

        try {
            // src/parser/Music.g:95:9: ( term ( ( PLUS ^| MINUS ^) term )* )
            // src/parser/Music.g:95:13: term ( ( PLUS ^| MINUS ^) term )*
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_term_in_num_expr930);
            term78=term();

            state._fsp--;

            adaptor.addChild(root_0, term78.getTree());

            // src/parser/Music.g:95:18: ( ( PLUS ^| MINUS ^) term )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==MINUS||LA22_0==PLUS) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // src/parser/Music.g:95:20: ( PLUS ^| MINUS ^) term
            	    {
            	    // src/parser/Music.g:95:20: ( PLUS ^| MINUS ^)
            	    int alt21=2;
            	    int LA21_0 = input.LA(1);

            	    if ( (LA21_0==PLUS) ) {
            	        alt21=1;
            	    }
            	    else if ( (LA21_0==MINUS) ) {
            	        alt21=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 21, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt21) {
            	        case 1 :
            	            // src/parser/Music.g:95:21: PLUS ^
            	            {
            	            PLUS79=(Token)match(input,PLUS,FOLLOW_PLUS_in_num_expr935); 
            	            PLUS79_tree = 
            	            (AmlTree)adaptor.create(PLUS79)
            	            ;
            	            root_0 = (AmlTree)adaptor.becomeRoot(PLUS79_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // src/parser/Music.g:95:29: MINUS ^
            	            {
            	            MINUS80=(Token)match(input,MINUS,FOLLOW_MINUS_in_num_expr940); 
            	            MINUS80_tree = 
            	            (AmlTree)adaptor.create(MINUS80)
            	            ;
            	            root_0 = (AmlTree)adaptor.becomeRoot(MINUS80_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_term_in_num_expr944);
            	    term81=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term81.getTree());

            	    }
            	    break;

            	default :
            	    break loop22;
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
    // src/parser/Music.g:98:1: term : factor ( ( DOT ^| DIV ^| MOD ^) factor )* ;
    public final MusicParser.term_return term() throws RecognitionException {
        MusicParser.term_return retval = new MusicParser.term_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token DOT83=null;
        Token DIV84=null;
        Token MOD85=null;
        MusicParser.factor_return factor82 =null;

        MusicParser.factor_return factor86 =null;


        AmlTree DOT83_tree=null;
        AmlTree DIV84_tree=null;
        AmlTree MOD85_tree=null;

        try {
            // src/parser/Music.g:98:9: ( factor ( ( DOT ^| DIV ^| MOD ^) factor )* )
            // src/parser/Music.g:98:13: factor ( ( DOT ^| DIV ^| MOD ^) factor )*
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term962);
            factor82=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor82.getTree());

            // src/parser/Music.g:98:20: ( ( DOT ^| DIV ^| MOD ^) factor )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0 >= DIV && LA24_0 <= DOT)||LA24_0==MOD) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // src/parser/Music.g:98:22: ( DOT ^| DIV ^| MOD ^) factor
            	    {
            	    // src/parser/Music.g:98:22: ( DOT ^| DIV ^| MOD ^)
            	    int alt23=3;
            	    switch ( input.LA(1) ) {
            	    case DOT:
            	        {
            	        alt23=1;
            	        }
            	        break;
            	    case DIV:
            	        {
            	        alt23=2;
            	        }
            	        break;
            	    case MOD:
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
            	            // src/parser/Music.g:98:23: DOT ^
            	            {
            	            DOT83=(Token)match(input,DOT,FOLLOW_DOT_in_term967); 
            	            DOT83_tree = 
            	            (AmlTree)adaptor.create(DOT83)
            	            ;
            	            root_0 = (AmlTree)adaptor.becomeRoot(DOT83_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // src/parser/Music.g:98:30: DIV ^
            	            {
            	            DIV84=(Token)match(input,DIV,FOLLOW_DIV_in_term972); 
            	            DIV84_tree = 
            	            (AmlTree)adaptor.create(DIV84)
            	            ;
            	            root_0 = (AmlTree)adaptor.becomeRoot(DIV84_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // src/parser/Music.g:98:37: MOD ^
            	            {
            	            MOD85=(Token)match(input,MOD,FOLLOW_MOD_in_term977); 
            	            MOD85_tree = 
            	            (AmlTree)adaptor.create(MOD85)
            	            ;
            	            root_0 = (AmlTree)adaptor.becomeRoot(MOD85_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_factor_in_term981);
            	    factor86=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor86.getTree());

            	    }
            	    break;

            	default :
            	    break loop24;
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
    // src/parser/Music.g:101:1: factor : ( NOT ^| PLUS ^| MINUS ^)? atom ;
    public final MusicParser.factor_return factor() throws RecognitionException {
        MusicParser.factor_return retval = new MusicParser.factor_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token NOT87=null;
        Token PLUS88=null;
        Token MINUS89=null;
        MusicParser.atom_return atom90 =null;


        AmlTree NOT87_tree=null;
        AmlTree PLUS88_tree=null;
        AmlTree MINUS89_tree=null;

        try {
            // src/parser/Music.g:101:9: ( ( NOT ^| PLUS ^| MINUS ^)? atom )
            // src/parser/Music.g:101:13: ( NOT ^| PLUS ^| MINUS ^)? atom
            {
            root_0 = (AmlTree)adaptor.nil();


            // src/parser/Music.g:101:13: ( NOT ^| PLUS ^| MINUS ^)?
            int alt25=4;
            switch ( input.LA(1) ) {
                case NOT:
                    {
                    alt25=1;
                    }
                    break;
                case PLUS:
                    {
                    alt25=2;
                    }
                    break;
                case MINUS:
                    {
                    alt25=3;
                    }
                    break;
            }

            switch (alt25) {
                case 1 :
                    // src/parser/Music.g:101:14: NOT ^
                    {
                    NOT87=(Token)match(input,NOT,FOLLOW_NOT_in_factor998); 
                    NOT87_tree = 
                    (AmlTree)adaptor.create(NOT87)
                    ;
                    root_0 = (AmlTree)adaptor.becomeRoot(NOT87_tree, root_0);


                    }
                    break;
                case 2 :
                    // src/parser/Music.g:101:21: PLUS ^
                    {
                    PLUS88=(Token)match(input,PLUS,FOLLOW_PLUS_in_factor1003); 
                    PLUS88_tree = 
                    (AmlTree)adaptor.create(PLUS88)
                    ;
                    root_0 = (AmlTree)adaptor.becomeRoot(PLUS88_tree, root_0);


                    }
                    break;
                case 3 :
                    // src/parser/Music.g:101:29: MINUS ^
                    {
                    MINUS89=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor1008); 
                    MINUS89_tree = 
                    (AmlTree)adaptor.create(MINUS89)
                    ;
                    root_0 = (AmlTree)adaptor.becomeRoot(MINUS89_tree, root_0);


                    }
                    break;

            }


            pushFollow(FOLLOW_atom_in_factor1013);
            atom90=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom90.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:104:1: atom : ( ID | INT | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | '(' ! expr ')' !);
    public final MusicParser.atom_return atom() throws RecognitionException {
        MusicParser.atom_return retval = new MusicParser.atom_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token b=null;
        Token ID91=null;
        Token INT92=null;
        Token char_literal93=null;
        Token char_literal95=null;
        MusicParser.expr_return expr94 =null;


        AmlTree b_tree=null;
        AmlTree ID91_tree=null;
        AmlTree INT92_tree=null;
        AmlTree char_literal93_tree=null;
        AmlTree char_literal95_tree=null;
        RewriteRuleTokenStream stream_FALSE=new RewriteRuleTokenStream(adaptor,"token FALSE");
        RewriteRuleTokenStream stream_TRUE=new RewriteRuleTokenStream(adaptor,"token TRUE");

        try {
            // src/parser/Music.g:104:9: ( ID | INT | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | '(' ! expr ')' !)
            int alt27=4;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt27=1;
                }
                break;
            case INT:
                {
                alt27=2;
                }
                break;
            case FALSE:
            case TRUE:
                {
                alt27=3;
                }
                break;
            case 51:
                {
                alt27=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;

            }

            switch (alt27) {
                case 1 :
                    // src/parser/Music.g:104:13: ID
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    ID91=(Token)match(input,ID,FOLLOW_ID_in_atom1029); 
                    ID91_tree = 
                    (AmlTree)adaptor.create(ID91)
                    ;
                    adaptor.addChild(root_0, ID91_tree);


                    }
                    break;
                case 2 :
                    // src/parser/Music.g:105:7: INT
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    INT92=(Token)match(input,INT,FOLLOW_INT_in_atom1037); 
                    INT92_tree = 
                    (AmlTree)adaptor.create(INT92)
                    ;
                    adaptor.addChild(root_0, INT92_tree);


                    }
                    break;
                case 3 :
                    // src/parser/Music.g:106:7: (b= TRUE |b= FALSE )
                    {
                    // src/parser/Music.g:106:7: (b= TRUE |b= FALSE )
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==TRUE) ) {
                        alt26=1;
                    }
                    else if ( (LA26_0==FALSE) ) {
                        alt26=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 26, 0, input);

                        throw nvae;

                    }
                    switch (alt26) {
                        case 1 :
                            // src/parser/Music.g:106:8: b= TRUE
                            {
                            b=(Token)match(input,TRUE,FOLLOW_TRUE_in_atom1048);  
                            stream_TRUE.add(b);


                            }
                            break;
                        case 2 :
                            // src/parser/Music.g:106:17: b= FALSE
                            {
                            b=(Token)match(input,FALSE,FOLLOW_FALSE_in_atom1054);  
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
                    // 106:27: -> ^( BOOLEAN[$b,$b.text] )
                    {
                        // src/parser/Music.g:106:30: ^( BOOLEAN[$b,$b.text] )
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
                    // src/parser/Music.g:107:7: '(' ! expr ')' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    char_literal93=(Token)match(input,51,FOLLOW_51_in_atom1071); 

                    pushFollow(FOLLOW_expr_in_atom1074);
                    expr94=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr94.getTree());

                    char_literal95=(Token)match(input,52,FOLLOW_52_in_atom1076); 

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


 

    public static final BitSet FOLLOW_function_in_prog94 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_EOF_in_prog97 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_function134 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_function136 = new BitSet(new long[]{0x001900828A080000L});
    public static final BitSet FOLLOW_params_in_function137 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_function139 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_function141 = new BitSet(new long[]{0x040202000E200100L});
    public static final BitSet FOLLOW_listInst_in_function143 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_function145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_params190 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_params193 = new BitSet(new long[]{0x000900828A080000L});
    public static final BitSet FOLLOW_expr_in_params196 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_inst_in_listInst212 = new BitSet(new long[]{0x000202000E200102L});
    public static final BitSet FOLLOW_declaration_in_inst231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignation_in_inst249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_stmt_in_inst267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_stmt_in_inst285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_stmt_in_inst303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_song_in_inst321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_declaration344 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ID_in_declaration347 = new BitSet(new long[]{0x0100000000020000L});
    public static final BitSet FOLLOW_EQUAL_in_declaration350 = new BitSet(new long[]{0x000900000A080000L});
    public static final BitSet FOLLOW_atom_in_declaration353 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_declaration357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOL_in_declaration376 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ID_in_declaration379 = new BitSet(new long[]{0x0100000000020000L});
    public static final BitSet FOLLOW_EQUAL_in_declaration382 = new BitSet(new long[]{0x000900000A080000L});
    public static final BitSet FOLLOW_atom_in_declaration385 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_declaration389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assignation413 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_EQUAL_in_assignation415 = new BitSet(new long[]{0x000900000A080000L});
    public static final BitSet FOLLOW_atom_in_assignation418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BEAT_in_beat448 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_NUM_in_beat451 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_beat453 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_NUM_in_beat456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SPEED_in_speed485 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_NUM_in_speed488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_stmt518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_for_stmt550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_if_stmt583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SONG_in_song615 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_song618 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_beat_in_song621 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_speed_in_song623 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_track_in_song626 = new BitSet(new long[]{0x0400800000000000L});
    public static final BitSet FOLLOW_58_in_song630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRACK_in_track661 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ID_in_track664 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_compas_list_in_track666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_BAR_in_compas_list690 = new BitSet(new long[]{0x0000200400000080L});
    public static final BitSet FOLLOW_compas_in_compas_list692 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_BAR_in_compas_list696 = new BitSet(new long[]{0x0000200400000080L});
    public static final BitSet FOLLOW_compas_in_compas_list698 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_DOUBLE_BAR_in_compas_list702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_note_in_compas740 = new BitSet(new long[]{0x0000200400000082L});
    public static final BitSet FOLLOW_NOTE_in_note793 = new BitSet(new long[]{0x0040400080002002L});
    public static final BitSet FOLLOW_MINUS_in_note797 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_NUM_in_note800 = new BitSet(new long[]{0x0040400000002002L});
    public static final BitSet FOLLOW_54_in_note805 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_FIGURE_in_note808 = new BitSet(new long[]{0x0000400000002002L});
    public static final BitSet FOLLOW_DOT_in_note812 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_TIE_in_note815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolterm_in_expr843 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_OR_in_expr846 = new BitSet(new long[]{0x000900828A080000L});
    public static final BitSet FOLLOW_boolterm_in_expr849 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_boolfact_in_boolterm863 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_boolterm866 = new BitSet(new long[]{0x000900828A080000L});
    public static final BitSet FOLLOW_boolfact_in_boolterm869 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_num_expr_in_boolfact883 = new BitSet(new long[]{0x0000001051820002L});
    public static final BitSet FOLLOW_EQUAL_in_boolfact887 = new BitSet(new long[]{0x000900828A080000L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_boolfact892 = new BitSet(new long[]{0x000900828A080000L});
    public static final BitSet FOLLOW_LT_in_boolfact897 = new BitSet(new long[]{0x000900828A080000L});
    public static final BitSet FOLLOW_LE_in_boolfact902 = new BitSet(new long[]{0x000900828A080000L});
    public static final BitSet FOLLOW_GT_in_boolfact907 = new BitSet(new long[]{0x000900828A080000L});
    public static final BitSet FOLLOW_GE_in_boolfact912 = new BitSet(new long[]{0x000900828A080000L});
    public static final BitSet FOLLOW_num_expr_in_boolfact916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_num_expr930 = new BitSet(new long[]{0x0000008080000002L});
    public static final BitSet FOLLOW_PLUS_in_num_expr935 = new BitSet(new long[]{0x000900828A080000L});
    public static final BitSet FOLLOW_MINUS_in_num_expr940 = new BitSet(new long[]{0x000900828A080000L});
    public static final BitSet FOLLOW_term_in_num_expr944 = new BitSet(new long[]{0x0000008080000002L});
    public static final BitSet FOLLOW_factor_in_term962 = new BitSet(new long[]{0x0000000100003002L});
    public static final BitSet FOLLOW_DOT_in_term967 = new BitSet(new long[]{0x000900828A080000L});
    public static final BitSet FOLLOW_DIV_in_term972 = new BitSet(new long[]{0x000900828A080000L});
    public static final BitSet FOLLOW_MOD_in_term977 = new BitSet(new long[]{0x000900828A080000L});
    public static final BitSet FOLLOW_factor_in_term981 = new BitSet(new long[]{0x0000000100003002L});
    public static final BitSet FOLLOW_NOT_in_factor998 = new BitSet(new long[]{0x000900000A080000L});
    public static final BitSet FOLLOW_PLUS_in_factor1003 = new BitSet(new long[]{0x000900000A080000L});
    public static final BitSet FOLLOW_MINUS_in_factor1008 = new BitSet(new long[]{0x000900000A080000L});
    public static final BitSet FOLLOW_atom_in_factor1013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom1037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_atom1048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_atom1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_atom1071 = new BitSet(new long[]{0x000900828A080000L});
    public static final BitSet FOLLOW_expr_in_atom1074 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_atom1076 = new BitSet(new long[]{0x0000000000000002L});

}