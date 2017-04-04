// $ANTLR 3.4 src/parser/Music.g 2017-04-05 00:03:35

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "BAR", "BEAT", "BEMOL", "BOOL", "BOOLEAN", "CHORD", "COMMENT", "COMPAS", "COMPAS_LIST", "DIMINUTION", "DIV", "DOT", "DOUBLE_BAR", "ELSE", "END_REPETITION", "EQUAL", "ESC_SEQ", "FALSE", "FIGURE", "FOR", "FUNCTION", "GE", "GT", "ID", "IF", "INT", "LE", "LIST_FUNCTIONS", "LT", "MAJ7", "MINOR", "MINUS", "MOD", "NOT", "NOTE", "NOTES", "NOTE_LIST", "NOT_EQUAL", "NUM", "OR", "PLUS", "REPETITION", "RETURN", "SEVENTH", "SONG", "SPEED", "START_REPETITION", "STRING", "SUSTAIN", "TIE", "TONE", "TRACK", "TRUE", "WHILE", "WS", "'('", "')'", "','", "'.'", "':'", "';'", "'x'", "'{'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__68=68;
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
    // src/parser/Music.g:31:1: prog : ( function )+ EOF -> ^( LIST_FUNCTIONS ( function )+ ) ;
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
            // src/parser/Music.g:31:10: ( ( function )+ EOF -> ^( LIST_FUNCTIONS ( function )+ ) )
            // src/parser/Music.g:31:14: ( function )+ EOF
            {
            // src/parser/Music.g:31:14: ( function )+
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
            	    // src/parser/Music.g:31:14: function
            	    {
            	    pushFollow(FOLLOW_function_in_prog122);
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


            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_prog125);  
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
            // 31:28: -> ^( LIST_FUNCTIONS ( function )+ )
            {
                // src/parser/Music.g:31:31: ^( LIST_FUNCTIONS ( function )+ )
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
    // src/parser/Music.g:34:1: function : id= ID '(' ( params )? ')' '{' listInst '}' -> ^( FUNCTION[$id.text] ( params )? listInst ) ;
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
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_listInst=new RewriteRuleSubtreeStream(adaptor,"rule listInst");
        RewriteRuleSubtreeStream stream_params=new RewriteRuleSubtreeStream(adaptor,"rule params");
        try {
            // src/parser/Music.g:34:13: (id= ID '(' ( params )? ')' '{' listInst '}' -> ^( FUNCTION[$id.text] ( params )? listInst ) )
            // src/parser/Music.g:34:17: id= ID '(' ( params )? ')' '{' listInst '}'
            {
            id=(Token)match(input,ID,FOLLOW_ID_in_function162);  
            stream_ID.add(id);


            char_literal3=(Token)match(input,60,FOLLOW_60_in_function164);  
            stream_60.add(char_literal3);


            // src/parser/Music.g:34:26: ( params )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==FALSE||LA2_0==ID||LA2_0==INT||LA2_0==MINUS||LA2_0==NOT||LA2_0==PLUS||LA2_0==TRUE||LA2_0==60) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // src/parser/Music.g:34:26: params
                    {
                    pushFollow(FOLLOW_params_in_function165);
                    params4=params();

                    state._fsp--;

                    stream_params.add(params4.getTree());

                    }
                    break;

            }


            char_literal5=(Token)match(input,61,FOLLOW_61_in_function167);  
            stream_61.add(char_literal5);


            char_literal6=(Token)match(input,67,FOLLOW_67_in_function169);  
            stream_67.add(char_literal6);


            pushFollow(FOLLOW_listInst_in_function171);
            listInst7=listInst();

            state._fsp--;

            stream_listInst.add(listInst7.getTree());

            char_literal8=(Token)match(input,68,FOLLOW_68_in_function173);  
            stream_68.add(char_literal8);


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
            // 34:57: -> ^( FUNCTION[$id.text] ( params )? listInst )
            {
                // src/parser/Music.g:34:62: ^( FUNCTION[$id.text] ( params )? listInst )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(FUNCTION, (id!=null?id.getText():null))
                , root_1);

                // src/parser/Music.g:34:83: ( params )?
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
    // src/parser/Music.g:37:1: params : expr ( ',' ! expr )* ;
    public final MusicParser.params_return params() throws RecognitionException {
        MusicParser.params_return retval = new MusicParser.params_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal10=null;
        MusicParser.expr_return expr9 =null;

        MusicParser.expr_return expr11 =null;


        AmlTree char_literal10_tree=null;

        try {
            // src/parser/Music.g:37:13: ( expr ( ',' ! expr )* )
            // src/parser/Music.g:37:17: expr ( ',' ! expr )*
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_expr_in_params218);
            expr9=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr9.getTree());

            // src/parser/Music.g:37:22: ( ',' ! expr )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==62) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // src/parser/Music.g:37:23: ',' ! expr
            	    {
            	    char_literal10=(Token)match(input,62,FOLLOW_62_in_params221); 

            	    pushFollow(FOLLOW_expr_in_params224);
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
    // src/parser/Music.g:39:1: listInst : ( inst )* ;
    public final MusicParser.listInst_return listInst() throws RecognitionException {
        MusicParser.listInst_return retval = new MusicParser.listInst_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        MusicParser.inst_return inst12 =null;



        try {
            // src/parser/Music.g:39:13: ( ( inst )* )
            // src/parser/Music.g:39:17: ( inst )*
            {
            root_0 = (AmlTree)adaptor.nil();


            // src/parser/Music.g:39:17: ( inst )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==BOOL||LA4_0==FOR||(LA4_0 >= ID && LA4_0 <= INT)||LA4_0==SONG||LA4_0==WHILE) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // src/parser/Music.g:39:18: inst
            	    {
            	    pushFollow(FOLLOW_inst_in_listInst240);
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
    // src/parser/Music.g:41:1: inst : ( declaration | assignation | while_stmt | for_stmt | if_stmt | song );
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
            // src/parser/Music.g:41:13: ( declaration | assignation | while_stmt | for_stmt | if_stmt | song )
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
                    // src/parser/Music.g:41:17: declaration
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_declaration_in_inst259);
                    declaration13=declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, declaration13.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:42:17: assignation
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_assignation_in_inst277);
                    assignation14=assignation();

                    state._fsp--;

                    adaptor.addChild(root_0, assignation14.getTree());

                    }
                    break;
                case 3 :
                    // src/parser/Music.g:43:17: while_stmt
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_while_stmt_in_inst295);
                    while_stmt15=while_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, while_stmt15.getTree());

                    }
                    break;
                case 4 :
                    // src/parser/Music.g:44:17: for_stmt
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_for_stmt_in_inst313);
                    for_stmt16=for_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, for_stmt16.getTree());

                    }
                    break;
                case 5 :
                    // src/parser/Music.g:45:17: if_stmt
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_if_stmt_in_inst331);
                    if_stmt17=if_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, if_stmt17.getTree());

                    }
                    break;
                case 6 :
                    // src/parser/Music.g:46:17: song
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_song_in_inst349);
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
    // src/parser/Music.g:49:1: declaration : ( INT ^ ID ( EQUAL ! atom )? ';' !| BOOL ^ ID ( EQUAL ! atom )? ';' !);
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
            // src/parser/Music.g:49:13: ( INT ^ ID ( EQUAL ! atom )? ';' !| BOOL ^ ID ( EQUAL ! atom )? ';' !)
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
                    // src/parser/Music.g:49:17: INT ^ ID ( EQUAL ! atom )? ';' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    INT19=(Token)match(input,INT,FOLLOW_INT_in_declaration372); 
                    INT19_tree = 
                    (AmlTree)adaptor.create(INT19)
                    ;
                    root_0 = (AmlTree)adaptor.becomeRoot(INT19_tree, root_0);


                    ID20=(Token)match(input,ID,FOLLOW_ID_in_declaration375); 
                    ID20_tree = 
                    (AmlTree)adaptor.create(ID20)
                    ;
                    adaptor.addChild(root_0, ID20_tree);


                    // src/parser/Music.g:49:25: ( EQUAL ! atom )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==EQUAL) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // src/parser/Music.g:49:26: EQUAL ! atom
                            {
                            EQUAL21=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_declaration378); 

                            pushFollow(FOLLOW_atom_in_declaration381);
                            atom22=atom();

                            state._fsp--;

                            adaptor.addChild(root_0, atom22.getTree());

                            }
                            break;

                    }


                    char_literal23=(Token)match(input,65,FOLLOW_65_in_declaration385); 

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:50:17: BOOL ^ ID ( EQUAL ! atom )? ';' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    BOOL24=(Token)match(input,BOOL,FOLLOW_BOOL_in_declaration404); 
                    BOOL24_tree = 
                    (AmlTree)adaptor.create(BOOL24)
                    ;
                    root_0 = (AmlTree)adaptor.becomeRoot(BOOL24_tree, root_0);


                    ID25=(Token)match(input,ID,FOLLOW_ID_in_declaration407); 
                    ID25_tree = 
                    (AmlTree)adaptor.create(ID25)
                    ;
                    adaptor.addChild(root_0, ID25_tree);


                    // src/parser/Music.g:50:26: ( EQUAL ! atom )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==EQUAL) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // src/parser/Music.g:50:27: EQUAL ! atom
                            {
                            EQUAL26=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_declaration410); 

                            pushFollow(FOLLOW_atom_in_declaration413);
                            atom27=atom();

                            state._fsp--;

                            adaptor.addChild(root_0, atom27.getTree());

                            }
                            break;

                    }


                    char_literal28=(Token)match(input,65,FOLLOW_65_in_declaration417); 

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
    // src/parser/Music.g:53:1: assignation : ID EQUAL ^ atom ;
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
            // src/parser/Music.g:53:13: ( ID EQUAL ^ atom )
            // src/parser/Music.g:53:17: ID EQUAL ^ atom
            {
            root_0 = (AmlTree)adaptor.nil();


            ID29=(Token)match(input,ID,FOLLOW_ID_in_assignation441); 
            ID29_tree = 
            (AmlTree)adaptor.create(ID29)
            ;
            adaptor.addChild(root_0, ID29_tree);


            EQUAL30=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_assignation443); 
            EQUAL30_tree = 
            (AmlTree)adaptor.create(EQUAL30)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(EQUAL30_tree, root_0);


            pushFollow(FOLLOW_atom_in_assignation446);
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
    // src/parser/Music.g:56:1: beat : BEAT ^ NUM ':' ! NUM ;
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
            // src/parser/Music.g:56:13: ( BEAT ^ NUM ':' ! NUM )
            // src/parser/Music.g:56:17: BEAT ^ NUM ':' ! NUM
            {
            root_0 = (AmlTree)adaptor.nil();


            BEAT32=(Token)match(input,BEAT,FOLLOW_BEAT_in_beat476); 
            BEAT32_tree = 
            (AmlTree)adaptor.create(BEAT32)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(BEAT32_tree, root_0);


            NUM33=(Token)match(input,NUM,FOLLOW_NUM_in_beat479); 
            NUM33_tree = 
            (AmlTree)adaptor.create(NUM33)
            ;
            adaptor.addChild(root_0, NUM33_tree);


            char_literal34=(Token)match(input,64,FOLLOW_64_in_beat481); 

            NUM35=(Token)match(input,NUM,FOLLOW_NUM_in_beat484); 
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
    // src/parser/Music.g:59:1: speed : SPEED ^ NUM ;
    public final MusicParser.speed_return speed() throws RecognitionException {
        MusicParser.speed_return retval = new MusicParser.speed_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token SPEED36=null;
        Token NUM37=null;

        AmlTree SPEED36_tree=null;
        AmlTree NUM37_tree=null;

        try {
            // src/parser/Music.g:59:13: ( SPEED ^ NUM )
            // src/parser/Music.g:59:17: SPEED ^ NUM
            {
            root_0 = (AmlTree)adaptor.nil();


            SPEED36=(Token)match(input,SPEED,FOLLOW_SPEED_in_speed513); 
            SPEED36_tree = 
            (AmlTree)adaptor.create(SPEED36)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(SPEED36_tree, root_0);


            NUM37=(Token)match(input,NUM,FOLLOW_NUM_in_speed516); 
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
    // src/parser/Music.g:63:1: while_stmt : WHILE ^;
    public final MusicParser.while_stmt_return while_stmt() throws RecognitionException {
        MusicParser.while_stmt_return retval = new MusicParser.while_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token WHILE38=null;

        AmlTree WHILE38_tree=null;

        try {
            // src/parser/Music.g:63:18: ( WHILE ^)
            // src/parser/Music.g:63:22: WHILE ^
            {
            root_0 = (AmlTree)adaptor.nil();


            WHILE38=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_stmt546); 
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
    // src/parser/Music.g:66:1: for_stmt : FOR ^;
    public final MusicParser.for_stmt_return for_stmt() throws RecognitionException {
        MusicParser.for_stmt_return retval = new MusicParser.for_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token FOR39=null;

        AmlTree FOR39_tree=null;

        try {
            // src/parser/Music.g:66:18: ( FOR ^)
            // src/parser/Music.g:66:22: FOR ^
            {
            root_0 = (AmlTree)adaptor.nil();


            FOR39=(Token)match(input,FOR,FOLLOW_FOR_in_for_stmt578); 
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
    // src/parser/Music.g:69:1: if_stmt : IF ^;
    public final MusicParser.if_stmt_return if_stmt() throws RecognitionException {
        MusicParser.if_stmt_return retval = new MusicParser.if_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token IF40=null;

        AmlTree IF40_tree=null;

        try {
            // src/parser/Music.g:69:18: ( IF ^)
            // src/parser/Music.g:69:22: IF ^
            {
            root_0 = (AmlTree)adaptor.nil();


            IF40=(Token)match(input,IF,FOLLOW_IF_in_if_stmt611); 
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
    // src/parser/Music.g:73:1: song : SONG ^ ( ID )? '{' ! beat speed ( track )+ '}' !;
    public final MusicParser.song_return song() throws RecognitionException {
        MusicParser.song_return retval = new MusicParser.song_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token SONG41=null;
        Token ID42=null;
        Token char_literal43=null;
        Token char_literal47=null;
        MusicParser.beat_return beat44 =null;

        MusicParser.speed_return speed45 =null;

        MusicParser.track_return track46 =null;


        AmlTree SONG41_tree=null;
        AmlTree ID42_tree=null;
        AmlTree char_literal43_tree=null;
        AmlTree char_literal47_tree=null;

        try {
            // src/parser/Music.g:73:13: ( SONG ^ ( ID )? '{' ! beat speed ( track )+ '}' !)
            // src/parser/Music.g:73:17: SONG ^ ( ID )? '{' ! beat speed ( track )+ '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            SONG41=(Token)match(input,SONG,FOLLOW_SONG_in_song643); 
            SONG41_tree = 
            (AmlTree)adaptor.create(SONG41)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(SONG41_tree, root_0);


            // src/parser/Music.g:73:23: ( ID )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==ID) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // src/parser/Music.g:73:23: ID
                    {
                    ID42=(Token)match(input,ID,FOLLOW_ID_in_song646); 
                    ID42_tree = 
                    (AmlTree)adaptor.create(ID42)
                    ;
                    adaptor.addChild(root_0, ID42_tree);


                    }
                    break;

            }


            char_literal43=(Token)match(input,67,FOLLOW_67_in_song649); 

            pushFollow(FOLLOW_beat_in_song652);
            beat44=beat();

            state._fsp--;

            adaptor.addChild(root_0, beat44.getTree());

            pushFollow(FOLLOW_speed_in_song654);
            speed45=speed();

            state._fsp--;

            adaptor.addChild(root_0, speed45.getTree());

            // src/parser/Music.g:73:43: ( track )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==TRACK) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // src/parser/Music.g:73:44: track
            	    {
            	    pushFollow(FOLLOW_track_in_song657);
            	    track46=track();

            	    state._fsp--;

            	    adaptor.addChild(root_0, track46.getTree());

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


            char_literal47=(Token)match(input,68,FOLLOW_68_in_song661); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:76:1: track : TRACK ^ ( ID )? STRING compas_aux ;
    public final MusicParser.track_return track() throws RecognitionException {
        MusicParser.track_return retval = new MusicParser.track_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token TRACK48=null;
        Token ID49=null;
        Token STRING50=null;
        MusicParser.compas_aux_return compas_aux51 =null;


        AmlTree TRACK48_tree=null;
        AmlTree ID49_tree=null;
        AmlTree STRING50_tree=null;

        try {
            // src/parser/Music.g:76:13: ( TRACK ^ ( ID )? STRING compas_aux )
            // src/parser/Music.g:76:17: TRACK ^ ( ID )? STRING compas_aux
            {
            root_0 = (AmlTree)adaptor.nil();


            TRACK48=(Token)match(input,TRACK,FOLLOW_TRACK_in_track691); 
            TRACK48_tree = 
            (AmlTree)adaptor.create(TRACK48)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(TRACK48_tree, root_0);


            // src/parser/Music.g:76:24: ( ID )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==ID) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // src/parser/Music.g:76:24: ID
                    {
                    ID49=(Token)match(input,ID,FOLLOW_ID_in_track694); 
                    ID49_tree = 
                    (AmlTree)adaptor.create(ID49)
                    ;
                    adaptor.addChild(root_0, ID49_tree);


                    }
                    break;

            }


            STRING50=(Token)match(input,STRING,FOLLOW_STRING_in_track697); 
            STRING50_tree = 
            (AmlTree)adaptor.create(STRING50)
            ;
            adaptor.addChild(root_0, STRING50_tree);


            pushFollow(FOLLOW_compas_aux_in_track699);
            compas_aux51=compas_aux();

            state._fsp--;

            adaptor.addChild(root_0, compas_aux51.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:79:1: compas_aux : compas_list -> ^( COMPAS_LIST compas_list ) ;
    public final MusicParser.compas_aux_return compas_aux() throws RecognitionException {
        MusicParser.compas_aux_return retval = new MusicParser.compas_aux_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        MusicParser.compas_list_return compas_list52 =null;


        RewriteRuleSubtreeStream stream_compas_list=new RewriteRuleSubtreeStream(adaptor,"rule compas_list");
        try {
            // src/parser/Music.g:79:13: ( compas_list -> ^( COMPAS_LIST compas_list ) )
            // src/parser/Music.g:79:17: compas_list
            {
            pushFollow(FOLLOW_compas_list_in_compas_aux723);
            compas_list52=compas_list();

            state._fsp--;

            stream_compas_list.add(compas_list52.getTree());

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
            // 79:29: -> ^( COMPAS_LIST compas_list )
            {
                // src/parser/Music.g:79:32: ^( COMPAS_LIST compas_list )
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
    // src/parser/Music.g:90:1: compas_list : ( DOUBLE_BAR !| repetition ) ( compasses | repetition )* ( DOUBLE_BAR !| repetition ) ;
    public final MusicParser.compas_list_return compas_list() throws RecognitionException {
        MusicParser.compas_list_return retval = new MusicParser.compas_list_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token DOUBLE_BAR53=null;
        Token DOUBLE_BAR57=null;
        MusicParser.repetition_return repetition54 =null;

        MusicParser.compasses_return compasses55 =null;

        MusicParser.repetition_return repetition56 =null;

        MusicParser.repetition_return repetition58 =null;


        AmlTree DOUBLE_BAR53_tree=null;
        AmlTree DOUBLE_BAR57_tree=null;

        try {
            // src/parser/Music.g:90:13: ( ( DOUBLE_BAR !| repetition ) ( compasses | repetition )* ( DOUBLE_BAR !| repetition ) )
            // src/parser/Music.g:90:15: ( DOUBLE_BAR !| repetition ) ( compasses | repetition )* ( DOUBLE_BAR !| repetition )
            {
            root_0 = (AmlTree)adaptor.nil();


            // src/parser/Music.g:90:15: ( DOUBLE_BAR !| repetition )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==DOUBLE_BAR) ) {
                alt12=1;
            }
            else if ( (LA12_0==NUM||LA12_0==START_REPETITION) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }
            switch (alt12) {
                case 1 :
                    // src/parser/Music.g:90:16: DOUBLE_BAR !
                    {
                    DOUBLE_BAR53=(Token)match(input,DOUBLE_BAR,FOLLOW_DOUBLE_BAR_in_compas_list761); 

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:90:30: repetition
                    {
                    pushFollow(FOLLOW_repetition_in_compas_list766);
                    repetition54=repetition();

                    state._fsp--;

                    adaptor.addChild(root_0, repetition54.getTree());

                    }
                    break;

            }


            // src/parser/Music.g:90:42: ( compasses | repetition )*
            loop13:
            do {
                int alt13=3;
                alt13 = dfa13.predict(input);
                switch (alt13) {
            	case 1 :
            	    // src/parser/Music.g:90:43: compasses
            	    {
            	    pushFollow(FOLLOW_compasses_in_compas_list770);
            	    compasses55=compasses();

            	    state._fsp--;

            	    adaptor.addChild(root_0, compasses55.getTree());

            	    }
            	    break;
            	case 2 :
            	    // src/parser/Music.g:90:55: repetition
            	    {
            	    pushFollow(FOLLOW_repetition_in_compas_list774);
            	    repetition56=repetition();

            	    state._fsp--;

            	    adaptor.addChild(root_0, repetition56.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            // src/parser/Music.g:90:68: ( DOUBLE_BAR !| repetition )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==DOUBLE_BAR) ) {
                alt14=1;
            }
            else if ( (LA14_0==NUM||LA14_0==START_REPETITION) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }
            switch (alt14) {
                case 1 :
                    // src/parser/Music.g:90:69: DOUBLE_BAR !
                    {
                    DOUBLE_BAR57=(Token)match(input,DOUBLE_BAR,FOLLOW_DOUBLE_BAR_in_compas_list779); 

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:90:83: repetition
                    {
                    pushFollow(FOLLOW_repetition_in_compas_list784);
                    repetition58=repetition();

                    state._fsp--;

                    adaptor.addChild(root_0, repetition58.getTree());

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
    // $ANTLR end "compas_list"


    public static class compasses_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "compasses"
    // src/parser/Music.g:96:1: compasses : compas ( BAR ! compas )* ;
    public final MusicParser.compasses_return compasses() throws RecognitionException {
        MusicParser.compasses_return retval = new MusicParser.compasses_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token BAR60=null;
        MusicParser.compas_return compas59 =null;

        MusicParser.compas_return compas61 =null;


        AmlTree BAR60_tree=null;

        try {
            // src/parser/Music.g:96:13: ( compas ( BAR ! compas )* )
            // src/parser/Music.g:96:17: compas ( BAR ! compas )*
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_compas_in_compasses813);
            compas59=compas();

            state._fsp--;

            adaptor.addChild(root_0, compas59.getTree());

            // src/parser/Music.g:96:24: ( BAR ! compas )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==BAR) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // src/parser/Music.g:96:25: BAR ! compas
            	    {
            	    BAR60=(Token)match(input,BAR,FOLLOW_BAR_in_compasses816); 

            	    pushFollow(FOLLOW_compas_in_compasses819);
            	    compas61=compas();

            	    state._fsp--;

            	    adaptor.addChild(root_0, compas61.getTree());

            	    }
            	    break;

            	default :
            	    break loop15;
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
    // src/parser/Music.g:98:1: repetition : ( NUM 'x' )? START_REPETITION compasses END_REPETITION -> ^( REPETITION NUM compasses ) ;
    public final MusicParser.repetition_return repetition() throws RecognitionException {
        MusicParser.repetition_return retval = new MusicParser.repetition_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token NUM62=null;
        Token char_literal63=null;
        Token START_REPETITION64=null;
        Token END_REPETITION66=null;
        MusicParser.compasses_return compasses65 =null;


        AmlTree NUM62_tree=null;
        AmlTree char_literal63_tree=null;
        AmlTree START_REPETITION64_tree=null;
        AmlTree END_REPETITION66_tree=null;
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleTokenStream stream_NUM=new RewriteRuleTokenStream(adaptor,"token NUM");
        RewriteRuleTokenStream stream_END_REPETITION=new RewriteRuleTokenStream(adaptor,"token END_REPETITION");
        RewriteRuleTokenStream stream_START_REPETITION=new RewriteRuleTokenStream(adaptor,"token START_REPETITION");
        RewriteRuleSubtreeStream stream_compasses=new RewriteRuleSubtreeStream(adaptor,"rule compasses");
        try {
            // src/parser/Music.g:98:13: ( ( NUM 'x' )? START_REPETITION compasses END_REPETITION -> ^( REPETITION NUM compasses ) )
            // src/parser/Music.g:98:17: ( NUM 'x' )? START_REPETITION compasses END_REPETITION
            {
            // src/parser/Music.g:98:17: ( NUM 'x' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==NUM) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // src/parser/Music.g:98:18: NUM 'x'
                    {
                    NUM62=(Token)match(input,NUM,FOLLOW_NUM_in_repetition833);  
                    stream_NUM.add(NUM62);


                    char_literal63=(Token)match(input,66,FOLLOW_66_in_repetition835);  
                    stream_66.add(char_literal63);


                    }
                    break;

            }


            START_REPETITION64=(Token)match(input,START_REPETITION,FOLLOW_START_REPETITION_in_repetition839);  
            stream_START_REPETITION.add(START_REPETITION64);


            pushFollow(FOLLOW_compasses_in_repetition841);
            compasses65=compasses();

            state._fsp--;

            stream_compasses.add(compasses65.getTree());

            END_REPETITION66=(Token)match(input,END_REPETITION,FOLLOW_END_REPETITION_in_repetition843);  
            stream_END_REPETITION.add(END_REPETITION66);


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
            // 98:73: -> ^( REPETITION NUM compasses )
            {
                // src/parser/Music.g:98:76: ^( REPETITION NUM compasses )
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
    // src/parser/Music.g:101:1: compas : ( tone )? ( options {greedy=true; } : notes_group )+ -> ^( COMPAS ( tone )? ( notes_group )+ ) ;
    public final MusicParser.compas_return compas() throws RecognitionException {
        MusicParser.compas_return retval = new MusicParser.compas_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        MusicParser.tone_return tone67 =null;

        MusicParser.notes_group_return notes_group68 =null;


        RewriteRuleSubtreeStream stream_tone=new RewriteRuleSubtreeStream(adaptor,"rule tone");
        RewriteRuleSubtreeStream stream_notes_group=new RewriteRuleSubtreeStream(adaptor,"rule notes_group");
        try {
            // src/parser/Music.g:101:13: ( ( tone )? ( options {greedy=true; } : notes_group )+ -> ^( COMPAS ( tone )? ( notes_group )+ ) )
            // src/parser/Music.g:101:17: ( tone )? ( options {greedy=true; } : notes_group )+
            {
            // src/parser/Music.g:101:17: ( tone )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==NUM) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // src/parser/Music.g:101:17: tone
                    {
                    pushFollow(FOLLOW_tone_in_compas884);
                    tone67=tone();

                    state._fsp--;

                    stream_tone.add(tone67.getTree());

                    }
                    break;

            }


            // src/parser/Music.g:101:23: ( options {greedy=true; } : notes_group )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                switch ( input.LA(1) ) {
                case CHORD:
                    {
                    alt18=1;
                    }
                    break;
                case 60:
                    {
                    alt18=1;
                    }
                    break;
                case BEMOL:
                case SUSTAIN:
                    {
                    alt18=1;
                    }
                    break;
                case NOTE:
                    {
                    alt18=1;
                    }
                    break;

                }

                switch (alt18) {
            	case 1 :
            	    // src/parser/Music.g:101:49: notes_group
            	    {
            	    pushFollow(FOLLOW_notes_group_in_compas897);
            	    notes_group68=notes_group();

            	    state._fsp--;

            	    stream_notes_group.add(notes_group68.getTree());

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


            // AST REWRITE
            // elements: tone, notes_group
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AmlTree)adaptor.nil();
            // 101:66: -> ^( COMPAS ( tone )? ( notes_group )+ )
            {
                // src/parser/Music.g:101:69: ^( COMPAS ( tone )? ( notes_group )+ )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(COMPAS, "COMPAS")
                , root_1);

                // src/parser/Music.g:101:78: ( tone )?
                if ( stream_tone.hasNext() ) {
                    adaptor.addChild(root_1, stream_tone.nextTree());

                }
                stream_tone.reset();

                if ( !(stream_notes_group.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_notes_group.hasNext() ) {
                    adaptor.addChild(root_1, stream_notes_group.nextTree());

                }
                stream_notes_group.reset();

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
    // src/parser/Music.g:104:1: tone : NUM (x= SUSTAIN |x= BEMOL ) -> ^( TONE NUM $x) ;
    public final MusicParser.tone_return tone() throws RecognitionException {
        MusicParser.tone_return retval = new MusicParser.tone_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token x=null;
        Token NUM69=null;

        AmlTree x_tree=null;
        AmlTree NUM69_tree=null;
        RewriteRuleTokenStream stream_BEMOL=new RewriteRuleTokenStream(adaptor,"token BEMOL");
        RewriteRuleTokenStream stream_NUM=new RewriteRuleTokenStream(adaptor,"token NUM");
        RewriteRuleTokenStream stream_SUSTAIN=new RewriteRuleTokenStream(adaptor,"token SUSTAIN");

        try {
            // src/parser/Music.g:104:13: ( NUM (x= SUSTAIN |x= BEMOL ) -> ^( TONE NUM $x) )
            // src/parser/Music.g:104:17: NUM (x= SUSTAIN |x= BEMOL )
            {
            NUM69=(Token)match(input,NUM,FOLLOW_NUM_in_tone944);  
            stream_NUM.add(NUM69);


            // src/parser/Music.g:104:21: (x= SUSTAIN |x= BEMOL )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==SUSTAIN) ) {
                alt19=1;
            }
            else if ( (LA19_0==BEMOL) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }
            switch (alt19) {
                case 1 :
                    // src/parser/Music.g:104:22: x= SUSTAIN
                    {
                    x=(Token)match(input,SUSTAIN,FOLLOW_SUSTAIN_in_tone949);  
                    stream_SUSTAIN.add(x);


                    }
                    break;
                case 2 :
                    // src/parser/Music.g:104:34: x= BEMOL
                    {
                    x=(Token)match(input,BEMOL,FOLLOW_BEMOL_in_tone955);  
                    stream_BEMOL.add(x);


                    }
                    break;

            }


            // AST REWRITE
            // elements: NUM, x
            // token labels: x
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_x=new RewriteRuleTokenStream(adaptor,"token x",x);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AmlTree)adaptor.nil();
            // 104:45: -> ^( TONE NUM $x)
            {
                // src/parser/Music.g:104:49: ^( TONE NUM $x)
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(TONE, "TONE")
                , root_1);

                adaptor.addChild(root_1, 
                stream_NUM.nextNode()
                );

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
    // $ANTLR end "tone"


    public static class notes_group_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "notes_group"
    // src/parser/Music.g:107:1: notes_group : notes_type ( '.' FIGURE )? ( DOT )? ( TIE )? -> ^( NOTE_LIST notes_type ( FIGURE )? ( DOT )? ( TIE )? ) ;
    public final MusicParser.notes_group_return notes_group() throws RecognitionException {
        MusicParser.notes_group_return retval = new MusicParser.notes_group_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal71=null;
        Token FIGURE72=null;
        Token DOT73=null;
        Token TIE74=null;
        MusicParser.notes_type_return notes_type70 =null;


        AmlTree char_literal71_tree=null;
        AmlTree FIGURE72_tree=null;
        AmlTree DOT73_tree=null;
        AmlTree TIE74_tree=null;
        RewriteRuleTokenStream stream_TIE=new RewriteRuleTokenStream(adaptor,"token TIE");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
        RewriteRuleTokenStream stream_FIGURE=new RewriteRuleTokenStream(adaptor,"token FIGURE");
        RewriteRuleSubtreeStream stream_notes_type=new RewriteRuleSubtreeStream(adaptor,"rule notes_type");
        try {
            // src/parser/Music.g:107:13: ( notes_type ( '.' FIGURE )? ( DOT )? ( TIE )? -> ^( NOTE_LIST notes_type ( FIGURE )? ( DOT )? ( TIE )? ) )
            // src/parser/Music.g:107:17: notes_type ( '.' FIGURE )? ( DOT )? ( TIE )?
            {
            pushFollow(FOLLOW_notes_type_in_notes_group993);
            notes_type70=notes_type();

            state._fsp--;

            stream_notes_type.add(notes_type70.getTree());

            // src/parser/Music.g:107:28: ( '.' FIGURE )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==63) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // src/parser/Music.g:107:29: '.' FIGURE
                    {
                    char_literal71=(Token)match(input,63,FOLLOW_63_in_notes_group996);  
                    stream_63.add(char_literal71);


                    FIGURE72=(Token)match(input,FIGURE,FOLLOW_FIGURE_in_notes_group998);  
                    stream_FIGURE.add(FIGURE72);


                    }
                    break;

            }


            // src/parser/Music.g:107:42: ( DOT )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==DOT) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // src/parser/Music.g:107:42: DOT
                    {
                    DOT73=(Token)match(input,DOT,FOLLOW_DOT_in_notes_group1002);  
                    stream_DOT.add(DOT73);


                    }
                    break;

            }


            // src/parser/Music.g:107:47: ( TIE )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==TIE) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // src/parser/Music.g:107:47: TIE
                    {
                    TIE74=(Token)match(input,TIE,FOLLOW_TIE_in_notes_group1005);  
                    stream_TIE.add(TIE74);


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
            // 107:52: -> ^( NOTE_LIST notes_type ( FIGURE )? ( DOT )? ( TIE )? )
            {
                // src/parser/Music.g:107:55: ^( NOTE_LIST notes_type ( FIGURE )? ( DOT )? ( TIE )? )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(NOTE_LIST, "NOTE_LIST")
                , root_1);

                adaptor.addChild(root_1, stream_notes_type.nextTree());

                // src/parser/Music.g:107:78: ( FIGURE )?
                if ( stream_FIGURE.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_FIGURE.nextNode()
                    );

                }
                stream_FIGURE.reset();

                // src/parser/Music.g:107:86: ( DOT )?
                if ( stream_DOT.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_DOT.nextNode()
                    );

                }
                stream_DOT.reset();

                // src/parser/Music.g:107:91: ( TIE )?
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


    public static class notes_type_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "notes_type"
    // src/parser/Music.g:110:1: notes_type : ( chord | notes );
    public final MusicParser.notes_type_return notes_type() throws RecognitionException {
        MusicParser.notes_type_return retval = new MusicParser.notes_type_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        MusicParser.chord_return chord75 =null;

        MusicParser.notes_return notes76 =null;



        try {
            // src/parser/Music.g:110:13: ( chord | notes )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==CHORD) ) {
                alt23=1;
            }
            else if ( (LA23_0==BEMOL||LA23_0==NOTE||LA23_0==SUSTAIN||LA23_0==60) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }
            switch (alt23) {
                case 1 :
                    // src/parser/Music.g:110:15: chord
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_chord_in_notes_type1045);
                    chord75=chord();

                    state._fsp--;

                    adaptor.addChild(root_0, chord75.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:110:23: notes
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_notes_in_notes_type1049);
                    notes76=notes();

                    state._fsp--;

                    adaptor.addChild(root_0, notes76.getTree());

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
    // src/parser/Music.g:112:1: chord : CHORD ^ '(' ! NOTE ( MINOR | PLUS | DIMINUTION )? ( SEVENTH | MAJ7 )? ')' !;
    public final MusicParser.chord_return chord() throws RecognitionException {
        MusicParser.chord_return retval = new MusicParser.chord_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token CHORD77=null;
        Token char_literal78=null;
        Token NOTE79=null;
        Token set80=null;
        Token set81=null;
        Token char_literal82=null;

        AmlTree CHORD77_tree=null;
        AmlTree char_literal78_tree=null;
        AmlTree NOTE79_tree=null;
        AmlTree set80_tree=null;
        AmlTree set81_tree=null;
        AmlTree char_literal82_tree=null;

        try {
            // src/parser/Music.g:112:13: ( CHORD ^ '(' ! NOTE ( MINOR | PLUS | DIMINUTION )? ( SEVENTH | MAJ7 )? ')' !)
            // src/parser/Music.g:112:17: CHORD ^ '(' ! NOTE ( MINOR | PLUS | DIMINUTION )? ( SEVENTH | MAJ7 )? ')' !
            {
            root_0 = (AmlTree)adaptor.nil();


            CHORD77=(Token)match(input,CHORD,FOLLOW_CHORD_in_chord1065); 
            CHORD77_tree = 
            (AmlTree)adaptor.create(CHORD77)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(CHORD77_tree, root_0);


            char_literal78=(Token)match(input,60,FOLLOW_60_in_chord1068); 

            NOTE79=(Token)match(input,NOTE,FOLLOW_NOTE_in_chord1071); 
            NOTE79_tree = 
            (AmlTree)adaptor.create(NOTE79)
            ;
            adaptor.addChild(root_0, NOTE79_tree);


            // src/parser/Music.g:112:34: ( MINOR | PLUS | DIMINUTION )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==DIMINUTION||LA24_0==MINOR||LA24_0==PLUS) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // src/parser/Music.g:
                    {
                    set80=(Token)input.LT(1);

                    if ( input.LA(1)==DIMINUTION||input.LA(1)==MINOR||input.LA(1)==PLUS ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (AmlTree)adaptor.create(set80)
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


            // src/parser/Music.g:112:59: ( SEVENTH | MAJ7 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==MAJ7||LA25_0==SEVENTH) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // src/parser/Music.g:
                    {
                    set81=(Token)input.LT(1);

                    if ( input.LA(1)==MAJ7||input.LA(1)==SEVENTH ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (AmlTree)adaptor.create(set81)
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


            char_literal82=(Token)match(input,61,FOLLOW_61_in_chord1089); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:115:1: notes : ( '(' ( note )+ ')' | note ) -> ^( NOTES ( note )+ ) ;
    public final MusicParser.notes_return notes() throws RecognitionException {
        MusicParser.notes_return retval = new MusicParser.notes_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal83=null;
        Token char_literal85=null;
        MusicParser.note_return note84 =null;

        MusicParser.note_return note86 =null;


        AmlTree char_literal83_tree=null;
        AmlTree char_literal85_tree=null;
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
        RewriteRuleSubtreeStream stream_note=new RewriteRuleSubtreeStream(adaptor,"rule note");
        try {
            // src/parser/Music.g:115:13: ( ( '(' ( note )+ ')' | note ) -> ^( NOTES ( note )+ ) )
            // src/parser/Music.g:115:17: ( '(' ( note )+ ')' | note )
            {
            // src/parser/Music.g:115:17: ( '(' ( note )+ ')' | note )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==60) ) {
                alt27=1;
            }
            else if ( (LA27_0==BEMOL||LA27_0==NOTE||LA27_0==SUSTAIN) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;

            }
            switch (alt27) {
                case 1 :
                    // src/parser/Music.g:115:19: '(' ( note )+ ')'
                    {
                    char_literal83=(Token)match(input,60,FOLLOW_60_in_notes1121);  
                    stream_60.add(char_literal83);


                    // src/parser/Music.g:115:23: ( note )+
                    int cnt26=0;
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==BEMOL||LA26_0==NOTE||LA26_0==SUSTAIN) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // src/parser/Music.g:115:24: note
                    	    {
                    	    pushFollow(FOLLOW_note_in_notes1124);
                    	    note84=note();

                    	    state._fsp--;

                    	    stream_note.add(note84.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt26 >= 1 ) break loop26;
                                EarlyExitException eee =
                                    new EarlyExitException(26, input);
                                throw eee;
                        }
                        cnt26++;
                    } while (true);


                    char_literal85=(Token)match(input,61,FOLLOW_61_in_notes1128);  
                    stream_61.add(char_literal85);


                    }
                    break;
                case 2 :
                    // src/parser/Music.g:115:38: note
                    {
                    pushFollow(FOLLOW_note_in_notes1133);
                    note86=note();

                    state._fsp--;

                    stream_note.add(note86.getTree());

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
            // 115:44: -> ^( NOTES ( note )+ )
            {
                // src/parser/Music.g:115:47: ^( NOTES ( note )+ )
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
    // src/parser/Music.g:118:1: note : ( BEMOL | SUSTAIN )? NOTE ^ ( '-' ! NUM )? ;
    public final MusicParser.note_return note() throws RecognitionException {
        MusicParser.note_return retval = new MusicParser.note_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token set87=null;
        Token NOTE88=null;
        Token char_literal89=null;
        Token NUM90=null;

        AmlTree set87_tree=null;
        AmlTree NOTE88_tree=null;
        AmlTree char_literal89_tree=null;
        AmlTree NUM90_tree=null;

        try {
            // src/parser/Music.g:118:13: ( ( BEMOL | SUSTAIN )? NOTE ^ ( '-' ! NUM )? )
            // src/parser/Music.g:118:17: ( BEMOL | SUSTAIN )? NOTE ^ ( '-' ! NUM )?
            {
            root_0 = (AmlTree)adaptor.nil();


            // src/parser/Music.g:118:17: ( BEMOL | SUSTAIN )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==BEMOL||LA28_0==SUSTAIN) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // src/parser/Music.g:
                    {
                    set87=(Token)input.LT(1);

                    if ( input.LA(1)==BEMOL||input.LA(1)==SUSTAIN ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (AmlTree)adaptor.create(set87)
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


            NOTE88=(Token)match(input,NOTE,FOLLOW_NOTE_in_note1182); 
            NOTE88_tree = 
            (AmlTree)adaptor.create(NOTE88)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(NOTE88_tree, root_0);


            // src/parser/Music.g:118:42: ( '-' ! NUM )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==MINUS) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // src/parser/Music.g:118:43: '-' ! NUM
                    {
                    char_literal89=(Token)match(input,MINUS,FOLLOW_MINUS_in_note1186); 

                    NUM90=(Token)match(input,NUM,FOLLOW_NUM_in_note1189); 
                    NUM90_tree = 
                    (AmlTree)adaptor.create(NUM90)
                    ;
                    adaptor.addChild(root_0, NUM90_tree);


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
    // src/parser/Music.g:122:1: expr : boolterm ( OR ^ boolterm )* ;
    public final MusicParser.expr_return expr() throws RecognitionException {
        MusicParser.expr_return retval = new MusicParser.expr_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token OR92=null;
        MusicParser.boolterm_return boolterm91 =null;

        MusicParser.boolterm_return boolterm93 =null;


        AmlTree OR92_tree=null;

        try {
            // src/parser/Music.g:122:9: ( boolterm ( OR ^ boolterm )* )
            // src/parser/Music.g:122:13: boolterm ( OR ^ boolterm )*
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_boolterm_in_expr1218);
            boolterm91=boolterm();

            state._fsp--;

            adaptor.addChild(root_0, boolterm91.getTree());

            // src/parser/Music.g:122:22: ( OR ^ boolterm )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==OR) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // src/parser/Music.g:122:23: OR ^ boolterm
            	    {
            	    OR92=(Token)match(input,OR,FOLLOW_OR_in_expr1221); 
            	    OR92_tree = 
            	    (AmlTree)adaptor.create(OR92)
            	    ;
            	    root_0 = (AmlTree)adaptor.becomeRoot(OR92_tree, root_0);


            	    pushFollow(FOLLOW_boolterm_in_expr1224);
            	    boolterm93=boolterm();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolterm93.getTree());

            	    }
            	    break;

            	default :
            	    break loop30;
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
    // src/parser/Music.g:125:1: boolterm : boolfact ( AND ^ boolfact )* ;
    public final MusicParser.boolterm_return boolterm() throws RecognitionException {
        MusicParser.boolterm_return retval = new MusicParser.boolterm_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token AND95=null;
        MusicParser.boolfact_return boolfact94 =null;

        MusicParser.boolfact_return boolfact96 =null;


        AmlTree AND95_tree=null;

        try {
            // src/parser/Music.g:125:9: ( boolfact ( AND ^ boolfact )* )
            // src/parser/Music.g:125:13: boolfact ( AND ^ boolfact )*
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_boolfact_in_boolterm1238);
            boolfact94=boolfact();

            state._fsp--;

            adaptor.addChild(root_0, boolfact94.getTree());

            // src/parser/Music.g:125:22: ( AND ^ boolfact )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==AND) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // src/parser/Music.g:125:23: AND ^ boolfact
            	    {
            	    AND95=(Token)match(input,AND,FOLLOW_AND_in_boolterm1241); 
            	    AND95_tree = 
            	    (AmlTree)adaptor.create(AND95)
            	    ;
            	    root_0 = (AmlTree)adaptor.becomeRoot(AND95_tree, root_0);


            	    pushFollow(FOLLOW_boolfact_in_boolterm1244);
            	    boolfact96=boolfact();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolfact96.getTree());

            	    }
            	    break;

            	default :
            	    break loop31;
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
    // src/parser/Music.g:128:1: boolfact : num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? ;
    public final MusicParser.boolfact_return boolfact() throws RecognitionException {
        MusicParser.boolfact_return retval = new MusicParser.boolfact_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token EQUAL98=null;
        Token NOT_EQUAL99=null;
        Token LT100=null;
        Token LE101=null;
        Token GT102=null;
        Token GE103=null;
        MusicParser.num_expr_return num_expr97 =null;

        MusicParser.num_expr_return num_expr104 =null;


        AmlTree EQUAL98_tree=null;
        AmlTree NOT_EQUAL99_tree=null;
        AmlTree LT100_tree=null;
        AmlTree LE101_tree=null;
        AmlTree GT102_tree=null;
        AmlTree GE103_tree=null;

        try {
            // src/parser/Music.g:128:9: ( num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? )
            // src/parser/Music.g:128:13: num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_num_expr_in_boolfact1258);
            num_expr97=num_expr();

            state._fsp--;

            adaptor.addChild(root_0, num_expr97.getTree());

            // src/parser/Music.g:128:22: ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==EQUAL||(LA33_0 >= GE && LA33_0 <= GT)||LA33_0==LE||LA33_0==LT||LA33_0==NOT_EQUAL) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // src/parser/Music.g:128:23: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr
                    {
                    // src/parser/Music.g:128:23: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^)
                    int alt32=6;
                    switch ( input.LA(1) ) {
                    case EQUAL:
                        {
                        alt32=1;
                        }
                        break;
                    case NOT_EQUAL:
                        {
                        alt32=2;
                        }
                        break;
                    case LT:
                        {
                        alt32=3;
                        }
                        break;
                    case LE:
                        {
                        alt32=4;
                        }
                        break;
                    case GT:
                        {
                        alt32=5;
                        }
                        break;
                    case GE:
                        {
                        alt32=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 0, input);

                        throw nvae;

                    }

                    switch (alt32) {
                        case 1 :
                            // src/parser/Music.g:128:24: EQUAL ^
                            {
                            EQUAL98=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_boolfact1262); 
                            EQUAL98_tree = 
                            (AmlTree)adaptor.create(EQUAL98)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(EQUAL98_tree, root_0);


                            }
                            break;
                        case 2 :
                            // src/parser/Music.g:128:33: NOT_EQUAL ^
                            {
                            NOT_EQUAL99=(Token)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_boolfact1267); 
                            NOT_EQUAL99_tree = 
                            (AmlTree)adaptor.create(NOT_EQUAL99)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(NOT_EQUAL99_tree, root_0);


                            }
                            break;
                        case 3 :
                            // src/parser/Music.g:128:46: LT ^
                            {
                            LT100=(Token)match(input,LT,FOLLOW_LT_in_boolfact1272); 
                            LT100_tree = 
                            (AmlTree)adaptor.create(LT100)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(LT100_tree, root_0);


                            }
                            break;
                        case 4 :
                            // src/parser/Music.g:128:52: LE ^
                            {
                            LE101=(Token)match(input,LE,FOLLOW_LE_in_boolfact1277); 
                            LE101_tree = 
                            (AmlTree)adaptor.create(LE101)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(LE101_tree, root_0);


                            }
                            break;
                        case 5 :
                            // src/parser/Music.g:128:58: GT ^
                            {
                            GT102=(Token)match(input,GT,FOLLOW_GT_in_boolfact1282); 
                            GT102_tree = 
                            (AmlTree)adaptor.create(GT102)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(GT102_tree, root_0);


                            }
                            break;
                        case 6 :
                            // src/parser/Music.g:128:64: GE ^
                            {
                            GE103=(Token)match(input,GE,FOLLOW_GE_in_boolfact1287); 
                            GE103_tree = 
                            (AmlTree)adaptor.create(GE103)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(GE103_tree, root_0);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_num_expr_in_boolfact1291);
                    num_expr104=num_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, num_expr104.getTree());

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
    // src/parser/Music.g:131:1: num_expr : term ( ( PLUS ^| MINUS ^) term )* ;
    public final MusicParser.num_expr_return num_expr() throws RecognitionException {
        MusicParser.num_expr_return retval = new MusicParser.num_expr_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token PLUS106=null;
        Token MINUS107=null;
        MusicParser.term_return term105 =null;

        MusicParser.term_return term108 =null;


        AmlTree PLUS106_tree=null;
        AmlTree MINUS107_tree=null;

        try {
            // src/parser/Music.g:131:9: ( term ( ( PLUS ^| MINUS ^) term )* )
            // src/parser/Music.g:131:13: term ( ( PLUS ^| MINUS ^) term )*
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_term_in_num_expr1305);
            term105=term();

            state._fsp--;

            adaptor.addChild(root_0, term105.getTree());

            // src/parser/Music.g:131:18: ( ( PLUS ^| MINUS ^) term )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==MINUS||LA35_0==PLUS) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // src/parser/Music.g:131:20: ( PLUS ^| MINUS ^) term
            	    {
            	    // src/parser/Music.g:131:20: ( PLUS ^| MINUS ^)
            	    int alt34=2;
            	    int LA34_0 = input.LA(1);

            	    if ( (LA34_0==PLUS) ) {
            	        alt34=1;
            	    }
            	    else if ( (LA34_0==MINUS) ) {
            	        alt34=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 34, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt34) {
            	        case 1 :
            	            // src/parser/Music.g:131:21: PLUS ^
            	            {
            	            PLUS106=(Token)match(input,PLUS,FOLLOW_PLUS_in_num_expr1310); 
            	            PLUS106_tree = 
            	            (AmlTree)adaptor.create(PLUS106)
            	            ;
            	            root_0 = (AmlTree)adaptor.becomeRoot(PLUS106_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // src/parser/Music.g:131:29: MINUS ^
            	            {
            	            MINUS107=(Token)match(input,MINUS,FOLLOW_MINUS_in_num_expr1315); 
            	            MINUS107_tree = 
            	            (AmlTree)adaptor.create(MINUS107)
            	            ;
            	            root_0 = (AmlTree)adaptor.becomeRoot(MINUS107_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_term_in_num_expr1319);
            	    term108=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term108.getTree());

            	    }
            	    break;

            	default :
            	    break loop35;
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
    // src/parser/Music.g:134:1: term : factor ( ( DOT ^| DIV ^| MOD ^) factor )* ;
    public final MusicParser.term_return term() throws RecognitionException {
        MusicParser.term_return retval = new MusicParser.term_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token DOT110=null;
        Token DIV111=null;
        Token MOD112=null;
        MusicParser.factor_return factor109 =null;

        MusicParser.factor_return factor113 =null;


        AmlTree DOT110_tree=null;
        AmlTree DIV111_tree=null;
        AmlTree MOD112_tree=null;

        try {
            // src/parser/Music.g:134:9: ( factor ( ( DOT ^| DIV ^| MOD ^) factor )* )
            // src/parser/Music.g:134:13: factor ( ( DOT ^| DIV ^| MOD ^) factor )*
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term1337);
            factor109=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor109.getTree());

            // src/parser/Music.g:134:20: ( ( DOT ^| DIV ^| MOD ^) factor )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( ((LA37_0 >= DIV && LA37_0 <= DOT)||LA37_0==MOD) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // src/parser/Music.g:134:22: ( DOT ^| DIV ^| MOD ^) factor
            	    {
            	    // src/parser/Music.g:134:22: ( DOT ^| DIV ^| MOD ^)
            	    int alt36=3;
            	    switch ( input.LA(1) ) {
            	    case DOT:
            	        {
            	        alt36=1;
            	        }
            	        break;
            	    case DIV:
            	        {
            	        alt36=2;
            	        }
            	        break;
            	    case MOD:
            	        {
            	        alt36=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 36, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt36) {
            	        case 1 :
            	            // src/parser/Music.g:134:23: DOT ^
            	            {
            	            DOT110=(Token)match(input,DOT,FOLLOW_DOT_in_term1342); 
            	            DOT110_tree = 
            	            (AmlTree)adaptor.create(DOT110)
            	            ;
            	            root_0 = (AmlTree)adaptor.becomeRoot(DOT110_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // src/parser/Music.g:134:30: DIV ^
            	            {
            	            DIV111=(Token)match(input,DIV,FOLLOW_DIV_in_term1347); 
            	            DIV111_tree = 
            	            (AmlTree)adaptor.create(DIV111)
            	            ;
            	            root_0 = (AmlTree)adaptor.becomeRoot(DIV111_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // src/parser/Music.g:134:37: MOD ^
            	            {
            	            MOD112=(Token)match(input,MOD,FOLLOW_MOD_in_term1352); 
            	            MOD112_tree = 
            	            (AmlTree)adaptor.create(MOD112)
            	            ;
            	            root_0 = (AmlTree)adaptor.becomeRoot(MOD112_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_factor_in_term1356);
            	    factor113=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor113.getTree());

            	    }
            	    break;

            	default :
            	    break loop37;
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
    // src/parser/Music.g:137:1: factor : ( NOT ^| PLUS ^| MINUS ^)? atom ;
    public final MusicParser.factor_return factor() throws RecognitionException {
        MusicParser.factor_return retval = new MusicParser.factor_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token NOT114=null;
        Token PLUS115=null;
        Token MINUS116=null;
        MusicParser.atom_return atom117 =null;


        AmlTree NOT114_tree=null;
        AmlTree PLUS115_tree=null;
        AmlTree MINUS116_tree=null;

        try {
            // src/parser/Music.g:137:9: ( ( NOT ^| PLUS ^| MINUS ^)? atom )
            // src/parser/Music.g:137:13: ( NOT ^| PLUS ^| MINUS ^)? atom
            {
            root_0 = (AmlTree)adaptor.nil();


            // src/parser/Music.g:137:13: ( NOT ^| PLUS ^| MINUS ^)?
            int alt38=4;
            switch ( input.LA(1) ) {
                case NOT:
                    {
                    alt38=1;
                    }
                    break;
                case PLUS:
                    {
                    alt38=2;
                    }
                    break;
                case MINUS:
                    {
                    alt38=3;
                    }
                    break;
            }

            switch (alt38) {
                case 1 :
                    // src/parser/Music.g:137:14: NOT ^
                    {
                    NOT114=(Token)match(input,NOT,FOLLOW_NOT_in_factor1373); 
                    NOT114_tree = 
                    (AmlTree)adaptor.create(NOT114)
                    ;
                    root_0 = (AmlTree)adaptor.becomeRoot(NOT114_tree, root_0);


                    }
                    break;
                case 2 :
                    // src/parser/Music.g:137:21: PLUS ^
                    {
                    PLUS115=(Token)match(input,PLUS,FOLLOW_PLUS_in_factor1378); 
                    PLUS115_tree = 
                    (AmlTree)adaptor.create(PLUS115)
                    ;
                    root_0 = (AmlTree)adaptor.becomeRoot(PLUS115_tree, root_0);


                    }
                    break;
                case 3 :
                    // src/parser/Music.g:137:29: MINUS ^
                    {
                    MINUS116=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor1383); 
                    MINUS116_tree = 
                    (AmlTree)adaptor.create(MINUS116)
                    ;
                    root_0 = (AmlTree)adaptor.becomeRoot(MINUS116_tree, root_0);


                    }
                    break;

            }


            pushFollow(FOLLOW_atom_in_factor1388);
            atom117=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom117.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:140:1: atom : ( ID | INT | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | '(' ! expr ')' !);
    public final MusicParser.atom_return atom() throws RecognitionException {
        MusicParser.atom_return retval = new MusicParser.atom_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token b=null;
        Token ID118=null;
        Token INT119=null;
        Token char_literal120=null;
        Token char_literal122=null;
        MusicParser.expr_return expr121 =null;


        AmlTree b_tree=null;
        AmlTree ID118_tree=null;
        AmlTree INT119_tree=null;
        AmlTree char_literal120_tree=null;
        AmlTree char_literal122_tree=null;
        RewriteRuleTokenStream stream_TRUE=new RewriteRuleTokenStream(adaptor,"token TRUE");
        RewriteRuleTokenStream stream_FALSE=new RewriteRuleTokenStream(adaptor,"token FALSE");

        try {
            // src/parser/Music.g:140:9: ( ID | INT | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | '(' ! expr ')' !)
            int alt40=4;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt40=1;
                }
                break;
            case INT:
                {
                alt40=2;
                }
                break;
            case FALSE:
            case TRUE:
                {
                alt40=3;
                }
                break;
            case 60:
                {
                alt40=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;

            }

            switch (alt40) {
                case 1 :
                    // src/parser/Music.g:140:13: ID
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    ID118=(Token)match(input,ID,FOLLOW_ID_in_atom1404); 
                    ID118_tree = 
                    (AmlTree)adaptor.create(ID118)
                    ;
                    adaptor.addChild(root_0, ID118_tree);


                    }
                    break;
                case 2 :
                    // src/parser/Music.g:141:7: INT
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    INT119=(Token)match(input,INT,FOLLOW_INT_in_atom1412); 
                    INT119_tree = 
                    (AmlTree)adaptor.create(INT119)
                    ;
                    adaptor.addChild(root_0, INT119_tree);


                    }
                    break;
                case 3 :
                    // src/parser/Music.g:142:7: (b= TRUE |b= FALSE )
                    {
                    // src/parser/Music.g:142:7: (b= TRUE |b= FALSE )
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==TRUE) ) {
                        alt39=1;
                    }
                    else if ( (LA39_0==FALSE) ) {
                        alt39=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 39, 0, input);

                        throw nvae;

                    }
                    switch (alt39) {
                        case 1 :
                            // src/parser/Music.g:142:8: b= TRUE
                            {
                            b=(Token)match(input,TRUE,FOLLOW_TRUE_in_atom1423);  
                            stream_TRUE.add(b);


                            }
                            break;
                        case 2 :
                            // src/parser/Music.g:142:17: b= FALSE
                            {
                            b=(Token)match(input,FALSE,FOLLOW_FALSE_in_atom1429);  
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
                    // 142:27: -> ^( BOOLEAN[$b,$b.text] )
                    {
                        // src/parser/Music.g:142:30: ^( BOOLEAN[$b,$b.text] )
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
                    // src/parser/Music.g:143:7: '(' ! expr ')' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    char_literal120=(Token)match(input,60,FOLLOW_60_in_atom1446); 

                    pushFollow(FOLLOW_expr_in_atom1449);
                    expr121=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr121.getTree());

                    char_literal122=(Token)match(input,61,FOLLOW_61_in_atom1451); 

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


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\67\uffff";
    static final String DFA13_eofS =
        "\67\uffff";
    static final String DFA13_minS =
        "\1\7\1\uffff\2\7\1\uffff\1\63\1\7\1\74\1\7\1\47\1\5\2\7\2\47\1\7"+
        "\1\53\1\27\2\5\2\7\1\16\1\53\3\5\1\7\1\74\1\7\1\47\1\5\1\uffff\1"+
        "\42\1\75\1\5\3\7\2\47\1\7\1\53\1\27\2\5\1\16\1\53\3\5\1\42\1\75"+
        "\1\5\1\7";
    static final String DFA13_maxS =
        "\1\74\1\uffff\1\102\1\74\1\uffff\1\63\1\65\1\74\1\65\1\47\1\77\2"+
        "\74\2\47\1\75\1\53\1\27\3\74\1\104\1\75\1\53\2\77\1\74\1\65\1\74"+
        "\1\65\1\47\1\77\1\uffff\2\75\1\77\1\75\2\74\2\47\1\75\1\53\1\27"+
        "\2\74\1\75\1\53\2\77\1\74\2\75\1\77\1\75";
    static final String DFA13_acceptS =
        "\1\uffff\1\3\2\uffff\1\1\33\uffff\1\2\26\uffff";
    static final String DFA13_specialS =
        "\67\uffff}>";
    static final String[] DFA13_transitionS = {
            "\1\4\2\uffff\1\4\6\uffff\1\1\25\uffff\1\4\3\uffff\1\2\7\uffff"+
            "\1\3\1\uffff\1\4\6\uffff\1\4",
            "",
            "\1\4\55\uffff\1\4\14\uffff\1\5",
            "\1\11\2\uffff\1\7\34\uffff\1\12\3\uffff\1\6\11\uffff\1\11\6"+
            "\uffff\1\10",
            "",
            "\1\3",
            "\1\14\55\uffff\1\13",
            "\1\15",
            "\1\16\37\uffff\1\17\15\uffff\1\16",
            "\1\12",
            "\1\24\1\uffff\1\11\2\uffff\1\7\5\uffff\1\22\2\uffff\1\25\20"+
            "\uffff\1\20\2\uffff\1\12\15\uffff\1\11\1\23\5\uffff\1\10\2\uffff"+
            "\1\21",
            "\1\11\2\uffff\1\7\34\uffff\1\12\15\uffff\1\11\6\uffff\1\10",
            "\1\11\2\uffff\1\7\34\uffff\1\12\15\uffff\1\11\6\uffff\1\10",
            "\1\26",
            "\1\17",
            "\1\16\34\uffff\1\27\2\uffff\1\17\15\uffff\1\16\7\uffff\1\30",
            "\1\31",
            "\1\32",
            "\1\24\1\uffff\1\11\2\uffff\1\7\10\uffff\1\25\23\uffff\1\12"+
            "\15\uffff\1\11\1\23\5\uffff\1\10",
            "\1\24\1\uffff\1\11\2\uffff\1\7\10\uffff\1\25\23\uffff\1\12"+
            "\15\uffff\1\11\6\uffff\1\10",
            "\1\36\2\uffff\1\34\34\uffff\1\37\3\uffff\1\33\11\uffff\1\36"+
            "\6\uffff\1\35",
            "\1\40\2\uffff\1\40\6\uffff\1\40\25\uffff\1\40\3\uffff\1\40"+
            "\7\uffff\1\40\1\uffff\1\40\2\uffff\1\1\3\uffff\1\40\7\uffff"+
            "\1\1",
            "\1\41\23\uffff\1\42\1\41\11\uffff\1\41\2\uffff\1\42\14\uffff"+
            "\1\43",
            "\1\44",
            "\1\24\1\uffff\1\11\2\uffff\1\7\5\uffff\1\22\2\uffff\1\25\23"+
            "\uffff\1\12\15\uffff\1\11\1\23\5\uffff\1\10\2\uffff\1\21",
            "\1\24\1\uffff\1\11\2\uffff\1\7\5\uffff\1\22\2\uffff\1\25\23"+
            "\uffff\1\12\15\uffff\1\11\1\23\5\uffff\1\10\2\uffff\1\21",
            "\1\24\1\uffff\1\11\2\uffff\1\7\5\uffff\1\22\2\uffff\1\25\23"+
            "\uffff\1\12\15\uffff\1\11\1\23\5\uffff\1\10",
            "\1\46\55\uffff\1\45",
            "\1\47",
            "\1\50\37\uffff\1\51\15\uffff\1\50",
            "\1\37",
            "\1\24\1\uffff\1\36\2\uffff\1\34\5\uffff\1\54\2\uffff\1\25\20"+
            "\uffff\1\52\2\uffff\1\37\15\uffff\1\36\1\55\5\uffff\1\35\2\uffff"+
            "\1\53",
            "",
            "\1\42\15\uffff\1\42\14\uffff\1\43",
            "\1\43",
            "\1\24\1\uffff\1\11\2\uffff\1\7\5\uffff\1\22\2\uffff\1\25\23"+
            "\uffff\1\12\15\uffff\1\11\1\23\5\uffff\1\10\2\uffff\1\21",
            "\1\16\37\uffff\1\17\15\uffff\1\16\7\uffff\1\30",
            "\1\36\2\uffff\1\34\34\uffff\1\37\15\uffff\1\36\6\uffff\1\35",
            "\1\36\2\uffff\1\34\34\uffff\1\37\15\uffff\1\36\6\uffff\1\35",
            "\1\56",
            "\1\51",
            "\1\50\34\uffff\1\57\2\uffff\1\51\15\uffff\1\50\7\uffff\1\60",
            "\1\61",
            "\1\62",
            "\1\24\1\uffff\1\36\2\uffff\1\34\10\uffff\1\25\23\uffff\1\37"+
            "\15\uffff\1\36\1\55\5\uffff\1\35",
            "\1\24\1\uffff\1\36\2\uffff\1\34\10\uffff\1\25\23\uffff\1\37"+
            "\15\uffff\1\36\6\uffff\1\35",
            "\1\63\23\uffff\1\64\1\63\11\uffff\1\63\2\uffff\1\64\14\uffff"+
            "\1\65",
            "\1\66",
            "\1\24\1\uffff\1\36\2\uffff\1\34\5\uffff\1\54\2\uffff\1\25\23"+
            "\uffff\1\37\15\uffff\1\36\1\55\5\uffff\1\35\2\uffff\1\53",
            "\1\24\1\uffff\1\36\2\uffff\1\34\5\uffff\1\54\2\uffff\1\25\23"+
            "\uffff\1\37\15\uffff\1\36\1\55\5\uffff\1\35\2\uffff\1\53",
            "\1\24\1\uffff\1\36\2\uffff\1\34\5\uffff\1\54\2\uffff\1\25\23"+
            "\uffff\1\37\15\uffff\1\36\1\55\5\uffff\1\35",
            "\1\64\15\uffff\1\64\14\uffff\1\65",
            "\1\65",
            "\1\24\1\uffff\1\36\2\uffff\1\34\5\uffff\1\54\2\uffff\1\25\23"+
            "\uffff\1\37\15\uffff\1\36\1\55\5\uffff\1\35\2\uffff\1\53",
            "\1\50\37\uffff\1\51\15\uffff\1\50\7\uffff\1\60"
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "()* loopback of 90:42: ( compasses | repetition )*";
        }
    }
 

    public static final BitSet FOLLOW_function_in_prog122 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_EOF_in_prog125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_function162 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_function164 = new BitSet(new long[]{0x3200205050400000L});
    public static final BitSet FOLLOW_params_in_function165 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_function167 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_function169 = new BitSet(new long[]{0x0402000071000100L,0x0000000000000010L});
    public static final BitSet FOLLOW_listInst_in_function171 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_function173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_params218 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_62_in_params221 = new BitSet(new long[]{0x1200205050400000L});
    public static final BitSet FOLLOW_expr_in_params224 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_inst_in_listInst240 = new BitSet(new long[]{0x0402000071000102L});
    public static final BitSet FOLLOW_declaration_in_inst259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignation_in_inst277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_stmt_in_inst295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_stmt_in_inst313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_stmt_in_inst331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_song_in_inst349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_declaration372 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ID_in_declaration375 = new BitSet(new long[]{0x0000000000100000L,0x0000000000000002L});
    public static final BitSet FOLLOW_EQUAL_in_declaration378 = new BitSet(new long[]{0x1200000050400000L});
    public static final BitSet FOLLOW_atom_in_declaration381 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_declaration385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOL_in_declaration404 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ID_in_declaration407 = new BitSet(new long[]{0x0000000000100000L,0x0000000000000002L});
    public static final BitSet FOLLOW_EQUAL_in_declaration410 = new BitSet(new long[]{0x1200000050400000L});
    public static final BitSet FOLLOW_atom_in_declaration413 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_declaration417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assignation441 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_EQUAL_in_assignation443 = new BitSet(new long[]{0x1200000050400000L});
    public static final BitSet FOLLOW_atom_in_assignation446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BEAT_in_beat476 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_NUM_in_beat479 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_beat481 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_NUM_in_beat484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SPEED_in_speed513 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_NUM_in_speed516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_stmt546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_for_stmt578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_if_stmt611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SONG_in_song643 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_ID_in_song646 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_song649 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_beat_in_song652 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_speed_in_song654 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_track_in_song657 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_song661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRACK_in_track691 = new BitSet(new long[]{0x0010000010000000L});
    public static final BitSet FOLLOW_ID_in_track694 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_STRING_in_track697 = new BitSet(new long[]{0x0008080000020000L});
    public static final BitSet FOLLOW_compas_aux_in_track699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compas_list_in_compas_aux723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_BAR_in_compas_list761 = new BitSet(new long[]{0x1028088000020480L});
    public static final BitSet FOLLOW_repetition_in_compas_list766 = new BitSet(new long[]{0x1028088000020480L});
    public static final BitSet FOLLOW_compasses_in_compas_list770 = new BitSet(new long[]{0x1028088000020480L});
    public static final BitSet FOLLOW_repetition_in_compas_list774 = new BitSet(new long[]{0x1028088000020480L});
    public static final BitSet FOLLOW_DOUBLE_BAR_in_compas_list779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_repetition_in_compas_list784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compas_in_compasses813 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_BAR_in_compasses816 = new BitSet(new long[]{0x1020088000000480L});
    public static final BitSet FOLLOW_compas_in_compasses819 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_NUM_in_repetition833 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_repetition835 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_START_REPETITION_in_repetition839 = new BitSet(new long[]{0x1020088000000480L});
    public static final BitSet FOLLOW_compasses_in_repetition841 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_END_REPETITION_in_repetition843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tone_in_compas884 = new BitSet(new long[]{0x1020008000000480L});
    public static final BitSet FOLLOW_notes_group_in_compas897 = new BitSet(new long[]{0x1020008000000482L});
    public static final BitSet FOLLOW_NUM_in_tone944 = new BitSet(new long[]{0x0020000000000080L});
    public static final BitSet FOLLOW_SUSTAIN_in_tone949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BEMOL_in_tone955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notes_type_in_notes_group993 = new BitSet(new long[]{0x8040000000010002L});
    public static final BitSet FOLLOW_63_in_notes_group996 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_FIGURE_in_notes_group998 = new BitSet(new long[]{0x0040000000010002L});
    public static final BitSet FOLLOW_DOT_in_notes_group1002 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_TIE_in_notes_group1005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_chord_in_notes_type1045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notes_in_notes_type1049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHORD_in_chord1065 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_chord1068 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_NOTE_in_chord1071 = new BitSet(new long[]{0x2001200C00004000L});
    public static final BitSet FOLLOW_61_in_chord1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_notes1121 = new BitSet(new long[]{0x0020008000000080L});
    public static final BitSet FOLLOW_note_in_notes1124 = new BitSet(new long[]{0x2020008000000080L});
    public static final BitSet FOLLOW_61_in_notes1128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_note_in_notes1133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOTE_in_note1182 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_MINUS_in_note1186 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_NUM_in_note1189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolterm_in_expr1218 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_OR_in_expr1221 = new BitSet(new long[]{0x1200205050400000L});
    public static final BitSet FOLLOW_boolterm_in_expr1224 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_boolfact_in_boolterm1238 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_boolterm1241 = new BitSet(new long[]{0x1200205050400000L});
    public static final BitSet FOLLOW_boolfact_in_boolterm1244 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_num_expr_in_boolfact1258 = new BitSet(new long[]{0x000004028C100002L});
    public static final BitSet FOLLOW_EQUAL_in_boolfact1262 = new BitSet(new long[]{0x1200205050400000L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_boolfact1267 = new BitSet(new long[]{0x1200205050400000L});
    public static final BitSet FOLLOW_LT_in_boolfact1272 = new BitSet(new long[]{0x1200205050400000L});
    public static final BitSet FOLLOW_LE_in_boolfact1277 = new BitSet(new long[]{0x1200205050400000L});
    public static final BitSet FOLLOW_GT_in_boolfact1282 = new BitSet(new long[]{0x1200205050400000L});
    public static final BitSet FOLLOW_GE_in_boolfact1287 = new BitSet(new long[]{0x1200205050400000L});
    public static final BitSet FOLLOW_num_expr_in_boolfact1291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_num_expr1305 = new BitSet(new long[]{0x0000201000000002L});
    public static final BitSet FOLLOW_PLUS_in_num_expr1310 = new BitSet(new long[]{0x1200205050400000L});
    public static final BitSet FOLLOW_MINUS_in_num_expr1315 = new BitSet(new long[]{0x1200205050400000L});
    public static final BitSet FOLLOW_term_in_num_expr1319 = new BitSet(new long[]{0x0000201000000002L});
    public static final BitSet FOLLOW_factor_in_term1337 = new BitSet(new long[]{0x0000002000018002L});
    public static final BitSet FOLLOW_DOT_in_term1342 = new BitSet(new long[]{0x1200205050400000L});
    public static final BitSet FOLLOW_DIV_in_term1347 = new BitSet(new long[]{0x1200205050400000L});
    public static final BitSet FOLLOW_MOD_in_term1352 = new BitSet(new long[]{0x1200205050400000L});
    public static final BitSet FOLLOW_factor_in_term1356 = new BitSet(new long[]{0x0000002000018002L});
    public static final BitSet FOLLOW_NOT_in_factor1373 = new BitSet(new long[]{0x1200000050400000L});
    public static final BitSet FOLLOW_PLUS_in_factor1378 = new BitSet(new long[]{0x1200000050400000L});
    public static final BitSet FOLLOW_MINUS_in_factor1383 = new BitSet(new long[]{0x1200000050400000L});
    public static final BitSet FOLLOW_atom_in_factor1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom1404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom1412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_atom1423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_atom1429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_atom1446 = new BitSet(new long[]{0x1200205050400000L});
    public static final BitSet FOLLOW_expr_in_atom1449 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_atom1451 = new BitSet(new long[]{0x0000000000000002L});

}