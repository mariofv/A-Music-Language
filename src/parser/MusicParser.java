// $ANTLR 3.4 src/parser/Music.g 2017-04-04 20:19:38

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "BAR", "BEAT", "BEMOL", "BOOL", "BOOLEAN", "CHORD", "COMMENT", "COMPAS", "COMPAS_LIST", "DIMINUTION", "DIV", "DOT", "DOUBLE_BAR", "ELSE", "END_REPETITION", "EQUAL", "ESC_SEQ", "FALSE", "FIGURE", "FOR", "FUNCTION", "GE", "GT", "ID", "IF", "INT", "LE", "LIST_FUNCTIONS", "LT", "MAJ7", "MINOR", "MINUS", "MOD", "NOT", "NOTE", "NOTES", "NOTE_LIST", "NOT_EQUAL", "NUM", "OR", "PLUS", "REPETITION", "RETURN", "SEVENTH", "SONG", "SPEED", "START_REPETITION", "STRING", "SUSTAIN", "TIE", "TONE", "TRACK", "TRUE", "WHILE", "WS", "'('", "')'", "','", "'.'", "':'", "';'", "'{'", "'}'"
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
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
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


            char_literal6=(Token)match(input,66,FOLLOW_66_in_function169);  
            stream_66.add(char_literal6);


            pushFollow(FOLLOW_listInst_in_function171);
            listInst7=listInst();

            state._fsp--;

            stream_listInst.add(listInst7.getTree());

            char_literal8=(Token)match(input,67,FOLLOW_67_in_function173);  
            stream_67.add(char_literal8);


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


            char_literal43=(Token)match(input,66,FOLLOW_66_in_song649); 

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


            char_literal47=(Token)match(input,67,FOLLOW_67_in_song661); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:76:1: track : TRACK ^ ( ID )? STRING compas_list ;
    public final MusicParser.track_return track() throws RecognitionException {
        MusicParser.track_return retval = new MusicParser.track_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token TRACK48=null;
        Token ID49=null;
        Token STRING50=null;
        MusicParser.compas_list_return compas_list51 =null;


        AmlTree TRACK48_tree=null;
        AmlTree ID49_tree=null;
        AmlTree STRING50_tree=null;

        try {
            // src/parser/Music.g:76:13: ( TRACK ^ ( ID )? STRING compas_list )
            // src/parser/Music.g:76:17: TRACK ^ ( ID )? STRING compas_list
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


            pushFollow(FOLLOW_compas_list_in_track699);
            compas_list51=compas_list();

            state._fsp--;

            adaptor.addChild(root_0, compas_list51.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:87:1: compas_list : ( DOUBLE_BAR compas ) ( BAR compas )* DOUBLE_BAR -> ^( COMPAS_LIST ( compas )+ ) ;
    public final MusicParser.compas_list_return compas_list() throws RecognitionException {
        MusicParser.compas_list_return retval = new MusicParser.compas_list_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token DOUBLE_BAR52=null;
        Token BAR54=null;
        Token DOUBLE_BAR56=null;
        MusicParser.compas_return compas53 =null;

        MusicParser.compas_return compas55 =null;


        AmlTree DOUBLE_BAR52_tree=null;
        AmlTree BAR54_tree=null;
        AmlTree DOUBLE_BAR56_tree=null;
        RewriteRuleTokenStream stream_DOUBLE_BAR=new RewriteRuleTokenStream(adaptor,"token DOUBLE_BAR");
        RewriteRuleTokenStream stream_BAR=new RewriteRuleTokenStream(adaptor,"token BAR");
        RewriteRuleSubtreeStream stream_compas=new RewriteRuleSubtreeStream(adaptor,"rule compas");
        try {
            // src/parser/Music.g:87:13: ( ( DOUBLE_BAR compas ) ( BAR compas )* DOUBLE_BAR -> ^( COMPAS_LIST ( compas )+ ) )
            // src/parser/Music.g:87:17: ( DOUBLE_BAR compas ) ( BAR compas )* DOUBLE_BAR
            {
            // src/parser/Music.g:87:17: ( DOUBLE_BAR compas )
            // src/parser/Music.g:87:18: DOUBLE_BAR compas
            {
            DOUBLE_BAR52=(Token)match(input,DOUBLE_BAR,FOLLOW_DOUBLE_BAR_in_compas_list731);  
            stream_DOUBLE_BAR.add(DOUBLE_BAR52);


            pushFollow(FOLLOW_compas_in_compas_list733);
            compas53=compas();

            state._fsp--;

            stream_compas.add(compas53.getTree());

            }


            // src/parser/Music.g:87:37: ( BAR compas )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==BAR) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // src/parser/Music.g:87:38: BAR compas
            	    {
            	    BAR54=(Token)match(input,BAR,FOLLOW_BAR_in_compas_list737);  
            	    stream_BAR.add(BAR54);


            	    pushFollow(FOLLOW_compas_in_compas_list739);
            	    compas55=compas();

            	    state._fsp--;

            	    stream_compas.add(compas55.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            DOUBLE_BAR56=(Token)match(input,DOUBLE_BAR,FOLLOW_DOUBLE_BAR_in_compas_list743);  
            stream_DOUBLE_BAR.add(DOUBLE_BAR56);


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
            // 87:62: -> ^( COMPAS_LIST ( compas )+ )
            {
                // src/parser/Music.g:87:65: ^( COMPAS_LIST ( compas )+ )
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
    // src/parser/Music.g:90:1: compas : ( tone )? ( notes_group )+ -> ^( COMPAS ( tone )? ( notes_group )+ ) ;
    public final MusicParser.compas_return compas() throws RecognitionException {
        MusicParser.compas_return retval = new MusicParser.compas_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        MusicParser.tone_return tone57 =null;

        MusicParser.notes_group_return notes_group58 =null;


        RewriteRuleSubtreeStream stream_notes_group=new RewriteRuleSubtreeStream(adaptor,"rule notes_group");
        RewriteRuleSubtreeStream stream_tone=new RewriteRuleSubtreeStream(adaptor,"rule tone");
        try {
            // src/parser/Music.g:90:13: ( ( tone )? ( notes_group )+ -> ^( COMPAS ( tone )? ( notes_group )+ ) )
            // src/parser/Music.g:90:17: ( tone )? ( notes_group )+
            {
            // src/parser/Music.g:90:17: ( tone )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==NUM) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // src/parser/Music.g:90:17: tone
                    {
                    pushFollow(FOLLOW_tone_in_compas780);
                    tone57=tone();

                    state._fsp--;

                    stream_tone.add(tone57.getTree());

                    }
                    break;

            }


            // src/parser/Music.g:90:23: ( notes_group )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==BEMOL||LA14_0==CHORD||LA14_0==NOTE||LA14_0==SUSTAIN||LA14_0==60) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // src/parser/Music.g:90:24: notes_group
            	    {
            	    pushFollow(FOLLOW_notes_group_in_compas784);
            	    notes_group58=notes_group();

            	    state._fsp--;

            	    stream_notes_group.add(notes_group58.getTree());

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
            // 90:41: -> ^( COMPAS ( tone )? ( notes_group )+ )
            {
                // src/parser/Music.g:90:44: ^( COMPAS ( tone )? ( notes_group )+ )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(COMPAS, "COMPAS")
                , root_1);

                // src/parser/Music.g:90:53: ( tone )?
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
    // src/parser/Music.g:93:1: tone : NUM (x= SUSTAIN |x= BEMOL ) -> ^( TONE NUM $x) ;
    public final MusicParser.tone_return tone() throws RecognitionException {
        MusicParser.tone_return retval = new MusicParser.tone_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token x=null;
        Token NUM59=null;

        AmlTree x_tree=null;
        AmlTree NUM59_tree=null;
        RewriteRuleTokenStream stream_SUSTAIN=new RewriteRuleTokenStream(adaptor,"token SUSTAIN");
        RewriteRuleTokenStream stream_BEMOL=new RewriteRuleTokenStream(adaptor,"token BEMOL");
        RewriteRuleTokenStream stream_NUM=new RewriteRuleTokenStream(adaptor,"token NUM");

        try {
            // src/parser/Music.g:93:13: ( NUM (x= SUSTAIN |x= BEMOL ) -> ^( TONE NUM $x) )
            // src/parser/Music.g:93:17: NUM (x= SUSTAIN |x= BEMOL )
            {
            NUM59=(Token)match(input,NUM,FOLLOW_NUM_in_tone831);  
            stream_NUM.add(NUM59);


            // src/parser/Music.g:93:21: (x= SUSTAIN |x= BEMOL )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==SUSTAIN) ) {
                alt15=1;
            }
            else if ( (LA15_0==BEMOL) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }
            switch (alt15) {
                case 1 :
                    // src/parser/Music.g:93:22: x= SUSTAIN
                    {
                    x=(Token)match(input,SUSTAIN,FOLLOW_SUSTAIN_in_tone836);  
                    stream_SUSTAIN.add(x);


                    }
                    break;
                case 2 :
                    // src/parser/Music.g:93:34: x= BEMOL
                    {
                    x=(Token)match(input,BEMOL,FOLLOW_BEMOL_in_tone842);  
                    stream_BEMOL.add(x);


                    }
                    break;

            }


            // AST REWRITE
            // elements: x, NUM
            // token labels: x
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_x=new RewriteRuleTokenStream(adaptor,"token x",x);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AmlTree)adaptor.nil();
            // 93:45: -> ^( TONE NUM $x)
            {
                // src/parser/Music.g:93:49: ^( TONE NUM $x)
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
    // src/parser/Music.g:96:1: notes_group : note_list ( '.' FIGURE )? ( DOT )? ( TIE )? -> ^( NOTE_LIST note_list ( FIGURE )? ( DOT )? ( TIE )? ) ;
    public final MusicParser.notes_group_return notes_group() throws RecognitionException {
        MusicParser.notes_group_return retval = new MusicParser.notes_group_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal61=null;
        Token FIGURE62=null;
        Token DOT63=null;
        Token TIE64=null;
        MusicParser.note_list_return note_list60 =null;


        AmlTree char_literal61_tree=null;
        AmlTree FIGURE62_tree=null;
        AmlTree DOT63_tree=null;
        AmlTree TIE64_tree=null;
        RewriteRuleTokenStream stream_FIGURE=new RewriteRuleTokenStream(adaptor,"token FIGURE");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_TIE=new RewriteRuleTokenStream(adaptor,"token TIE");
        RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
        RewriteRuleSubtreeStream stream_note_list=new RewriteRuleSubtreeStream(adaptor,"rule note_list");
        try {
            // src/parser/Music.g:96:13: ( note_list ( '.' FIGURE )? ( DOT )? ( TIE )? -> ^( NOTE_LIST note_list ( FIGURE )? ( DOT )? ( TIE )? ) )
            // src/parser/Music.g:96:17: note_list ( '.' FIGURE )? ( DOT )? ( TIE )?
            {
            pushFollow(FOLLOW_note_list_in_notes_group880);
            note_list60=note_list();

            state._fsp--;

            stream_note_list.add(note_list60.getTree());

            // src/parser/Music.g:96:27: ( '.' FIGURE )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==63) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // src/parser/Music.g:96:28: '.' FIGURE
                    {
                    char_literal61=(Token)match(input,63,FOLLOW_63_in_notes_group883);  
                    stream_63.add(char_literal61);


                    FIGURE62=(Token)match(input,FIGURE,FOLLOW_FIGURE_in_notes_group885);  
                    stream_FIGURE.add(FIGURE62);


                    }
                    break;

            }


            // src/parser/Music.g:96:41: ( DOT )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==DOT) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // src/parser/Music.g:96:41: DOT
                    {
                    DOT63=(Token)match(input,DOT,FOLLOW_DOT_in_notes_group889);  
                    stream_DOT.add(DOT63);


                    }
                    break;

            }


            // src/parser/Music.g:96:46: ( TIE )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==TIE) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // src/parser/Music.g:96:46: TIE
                    {
                    TIE64=(Token)match(input,TIE,FOLLOW_TIE_in_notes_group892);  
                    stream_TIE.add(TIE64);


                    }
                    break;

            }


            // AST REWRITE
            // elements: TIE, DOT, note_list, FIGURE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AmlTree)adaptor.nil();
            // 96:51: -> ^( NOTE_LIST note_list ( FIGURE )? ( DOT )? ( TIE )? )
            {
                // src/parser/Music.g:96:54: ^( NOTE_LIST note_list ( FIGURE )? ( DOT )? ( TIE )? )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(NOTE_LIST, "NOTE_LIST")
                , root_1);

                adaptor.addChild(root_1, stream_note_list.nextTree());

                // src/parser/Music.g:96:76: ( FIGURE )?
                if ( stream_FIGURE.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_FIGURE.nextNode()
                    );

                }
                stream_FIGURE.reset();

                // src/parser/Music.g:96:84: ( DOT )?
                if ( stream_DOT.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_DOT.nextNode()
                    );

                }
                stream_DOT.reset();

                // src/parser/Music.g:96:89: ( TIE )?
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


    public static class note_list_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "note_list"
    // src/parser/Music.g:99:1: note_list : ( chord | notes );
    public final MusicParser.note_list_return note_list() throws RecognitionException {
        MusicParser.note_list_return retval = new MusicParser.note_list_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        MusicParser.chord_return chord65 =null;

        MusicParser.notes_return notes66 =null;



        try {
            // src/parser/Music.g:99:13: ( chord | notes )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==CHORD) ) {
                alt19=1;
            }
            else if ( (LA19_0==BEMOL||LA19_0==NOTE||LA19_0==SUSTAIN||LA19_0==60) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }
            switch (alt19) {
                case 1 :
                    // src/parser/Music.g:99:17: chord
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_chord_in_note_list935);
                    chord65=chord();

                    state._fsp--;

                    adaptor.addChild(root_0, chord65.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:99:25: notes
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_notes_in_note_list939);
                    notes66=notes();

                    state._fsp--;

                    adaptor.addChild(root_0, notes66.getTree());

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
    // $ANTLR end "note_list"


    public static class chord_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "chord"
    // src/parser/Music.g:102:1: chord : CHORD ^ '(' ! NOTE ( MINOR | PLUS | DIMINUTION )? ( SEVENTH | MAJ7 )? ')' !;
    public final MusicParser.chord_return chord() throws RecognitionException {
        MusicParser.chord_return retval = new MusicParser.chord_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token CHORD67=null;
        Token char_literal68=null;
        Token NOTE69=null;
        Token set70=null;
        Token set71=null;
        Token char_literal72=null;

        AmlTree CHORD67_tree=null;
        AmlTree char_literal68_tree=null;
        AmlTree NOTE69_tree=null;
        AmlTree set70_tree=null;
        AmlTree set71_tree=null;
        AmlTree char_literal72_tree=null;

        try {
            // src/parser/Music.g:102:13: ( CHORD ^ '(' ! NOTE ( MINOR | PLUS | DIMINUTION )? ( SEVENTH | MAJ7 )? ')' !)
            // src/parser/Music.g:102:17: CHORD ^ '(' ! NOTE ( MINOR | PLUS | DIMINUTION )? ( SEVENTH | MAJ7 )? ')' !
            {
            root_0 = (AmlTree)adaptor.nil();


            CHORD67=(Token)match(input,CHORD,FOLLOW_CHORD_in_chord968); 
            CHORD67_tree = 
            (AmlTree)adaptor.create(CHORD67)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(CHORD67_tree, root_0);


            char_literal68=(Token)match(input,60,FOLLOW_60_in_chord971); 

            NOTE69=(Token)match(input,NOTE,FOLLOW_NOTE_in_chord974); 
            NOTE69_tree = 
            (AmlTree)adaptor.create(NOTE69)
            ;
            adaptor.addChild(root_0, NOTE69_tree);


            // src/parser/Music.g:102:34: ( MINOR | PLUS | DIMINUTION )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==DIMINUTION||LA20_0==MINOR||LA20_0==PLUS) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // src/parser/Music.g:
                    {
                    set70=(Token)input.LT(1);

                    if ( input.LA(1)==DIMINUTION||input.LA(1)==MINOR||input.LA(1)==PLUS ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (AmlTree)adaptor.create(set70)
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


            // src/parser/Music.g:102:59: ( SEVENTH | MAJ7 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==MAJ7||LA21_0==SEVENTH) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // src/parser/Music.g:
                    {
                    set71=(Token)input.LT(1);

                    if ( input.LA(1)==MAJ7||input.LA(1)==SEVENTH ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (AmlTree)adaptor.create(set71)
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


            char_literal72=(Token)match(input,61,FOLLOW_61_in_chord992); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:105:1: notes : ( '(' ( note )+ ')' | note ) -> ^( NOTES ( note )+ ) ;
    public final MusicParser.notes_return notes() throws RecognitionException {
        MusicParser.notes_return retval = new MusicParser.notes_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal73=null;
        Token char_literal75=null;
        MusicParser.note_return note74 =null;

        MusicParser.note_return note76 =null;


        AmlTree char_literal73_tree=null;
        AmlTree char_literal75_tree=null;
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
        RewriteRuleSubtreeStream stream_note=new RewriteRuleSubtreeStream(adaptor,"rule note");
        try {
            // src/parser/Music.g:105:13: ( ( '(' ( note )+ ')' | note ) -> ^( NOTES ( note )+ ) )
            // src/parser/Music.g:105:17: ( '(' ( note )+ ')' | note )
            {
            // src/parser/Music.g:105:17: ( '(' ( note )+ ')' | note )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==60) ) {
                alt23=1;
            }
            else if ( (LA23_0==BEMOL||LA23_0==NOTE||LA23_0==SUSTAIN) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }
            switch (alt23) {
                case 1 :
                    // src/parser/Music.g:105:19: '(' ( note )+ ')'
                    {
                    char_literal73=(Token)match(input,60,FOLLOW_60_in_notes1024);  
                    stream_60.add(char_literal73);


                    // src/parser/Music.g:105:23: ( note )+
                    int cnt22=0;
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==BEMOL||LA22_0==NOTE||LA22_0==SUSTAIN) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // src/parser/Music.g:105:24: note
                    	    {
                    	    pushFollow(FOLLOW_note_in_notes1027);
                    	    note74=note();

                    	    state._fsp--;

                    	    stream_note.add(note74.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt22 >= 1 ) break loop22;
                                EarlyExitException eee =
                                    new EarlyExitException(22, input);
                                throw eee;
                        }
                        cnt22++;
                    } while (true);


                    char_literal75=(Token)match(input,61,FOLLOW_61_in_notes1031);  
                    stream_61.add(char_literal75);


                    }
                    break;
                case 2 :
                    // src/parser/Music.g:105:38: note
                    {
                    pushFollow(FOLLOW_note_in_notes1036);
                    note76=note();

                    state._fsp--;

                    stream_note.add(note76.getTree());

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
            // 105:44: -> ^( NOTES ( note )+ )
            {
                // src/parser/Music.g:105:47: ^( NOTES ( note )+ )
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
    // src/parser/Music.g:108:1: note : ( BEMOL | SUSTAIN )? NOTE ^ ( '-' ! NUM )? ;
    public final MusicParser.note_return note() throws RecognitionException {
        MusicParser.note_return retval = new MusicParser.note_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token set77=null;
        Token NOTE78=null;
        Token char_literal79=null;
        Token NUM80=null;

        AmlTree set77_tree=null;
        AmlTree NOTE78_tree=null;
        AmlTree char_literal79_tree=null;
        AmlTree NUM80_tree=null;

        try {
            // src/parser/Music.g:108:13: ( ( BEMOL | SUSTAIN )? NOTE ^ ( '-' ! NUM )? )
            // src/parser/Music.g:108:17: ( BEMOL | SUSTAIN )? NOTE ^ ( '-' ! NUM )?
            {
            root_0 = (AmlTree)adaptor.nil();


            // src/parser/Music.g:108:17: ( BEMOL | SUSTAIN )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==BEMOL||LA24_0==SUSTAIN) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // src/parser/Music.g:
                    {
                    set77=(Token)input.LT(1);

                    if ( input.LA(1)==BEMOL||input.LA(1)==SUSTAIN ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (AmlTree)adaptor.create(set77)
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


            NOTE78=(Token)match(input,NOTE,FOLLOW_NOTE_in_note1085); 
            NOTE78_tree = 
            (AmlTree)adaptor.create(NOTE78)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(NOTE78_tree, root_0);


            // src/parser/Music.g:108:42: ( '-' ! NUM )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==MINUS) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // src/parser/Music.g:108:43: '-' ! NUM
                    {
                    char_literal79=(Token)match(input,MINUS,FOLLOW_MINUS_in_note1089); 

                    NUM80=(Token)match(input,NUM,FOLLOW_NUM_in_note1092); 
                    NUM80_tree = 
                    (AmlTree)adaptor.create(NUM80)
                    ;
                    adaptor.addChild(root_0, NUM80_tree);


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
    // src/parser/Music.g:112:1: expr : boolterm ( OR ^ boolterm )* ;
    public final MusicParser.expr_return expr() throws RecognitionException {
        MusicParser.expr_return retval = new MusicParser.expr_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token OR82=null;
        MusicParser.boolterm_return boolterm81 =null;

        MusicParser.boolterm_return boolterm83 =null;


        AmlTree OR82_tree=null;

        try {
            // src/parser/Music.g:112:9: ( boolterm ( OR ^ boolterm )* )
            // src/parser/Music.g:112:13: boolterm ( OR ^ boolterm )*
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_boolterm_in_expr1121);
            boolterm81=boolterm();

            state._fsp--;

            adaptor.addChild(root_0, boolterm81.getTree());

            // src/parser/Music.g:112:22: ( OR ^ boolterm )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==OR) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // src/parser/Music.g:112:23: OR ^ boolterm
            	    {
            	    OR82=(Token)match(input,OR,FOLLOW_OR_in_expr1124); 
            	    OR82_tree = 
            	    (AmlTree)adaptor.create(OR82)
            	    ;
            	    root_0 = (AmlTree)adaptor.becomeRoot(OR82_tree, root_0);


            	    pushFollow(FOLLOW_boolterm_in_expr1127);
            	    boolterm83=boolterm();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolterm83.getTree());

            	    }
            	    break;

            	default :
            	    break loop26;
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
    // src/parser/Music.g:115:1: boolterm : boolfact ( AND ^ boolfact )* ;
    public final MusicParser.boolterm_return boolterm() throws RecognitionException {
        MusicParser.boolterm_return retval = new MusicParser.boolterm_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token AND85=null;
        MusicParser.boolfact_return boolfact84 =null;

        MusicParser.boolfact_return boolfact86 =null;


        AmlTree AND85_tree=null;

        try {
            // src/parser/Music.g:115:9: ( boolfact ( AND ^ boolfact )* )
            // src/parser/Music.g:115:13: boolfact ( AND ^ boolfact )*
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_boolfact_in_boolterm1141);
            boolfact84=boolfact();

            state._fsp--;

            adaptor.addChild(root_0, boolfact84.getTree());

            // src/parser/Music.g:115:22: ( AND ^ boolfact )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==AND) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // src/parser/Music.g:115:23: AND ^ boolfact
            	    {
            	    AND85=(Token)match(input,AND,FOLLOW_AND_in_boolterm1144); 
            	    AND85_tree = 
            	    (AmlTree)adaptor.create(AND85)
            	    ;
            	    root_0 = (AmlTree)adaptor.becomeRoot(AND85_tree, root_0);


            	    pushFollow(FOLLOW_boolfact_in_boolterm1147);
            	    boolfact86=boolfact();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolfact86.getTree());

            	    }
            	    break;

            	default :
            	    break loop27;
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
    // src/parser/Music.g:118:1: boolfact : num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? ;
    public final MusicParser.boolfact_return boolfact() throws RecognitionException {
        MusicParser.boolfact_return retval = new MusicParser.boolfact_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token EQUAL88=null;
        Token NOT_EQUAL89=null;
        Token LT90=null;
        Token LE91=null;
        Token GT92=null;
        Token GE93=null;
        MusicParser.num_expr_return num_expr87 =null;

        MusicParser.num_expr_return num_expr94 =null;


        AmlTree EQUAL88_tree=null;
        AmlTree NOT_EQUAL89_tree=null;
        AmlTree LT90_tree=null;
        AmlTree LE91_tree=null;
        AmlTree GT92_tree=null;
        AmlTree GE93_tree=null;

        try {
            // src/parser/Music.g:118:9: ( num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? )
            // src/parser/Music.g:118:13: num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_num_expr_in_boolfact1161);
            num_expr87=num_expr();

            state._fsp--;

            adaptor.addChild(root_0, num_expr87.getTree());

            // src/parser/Music.g:118:22: ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==EQUAL||(LA29_0 >= GE && LA29_0 <= GT)||LA29_0==LE||LA29_0==LT||LA29_0==NOT_EQUAL) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // src/parser/Music.g:118:23: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr
                    {
                    // src/parser/Music.g:118:23: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^)
                    int alt28=6;
                    switch ( input.LA(1) ) {
                    case EQUAL:
                        {
                        alt28=1;
                        }
                        break;
                    case NOT_EQUAL:
                        {
                        alt28=2;
                        }
                        break;
                    case LT:
                        {
                        alt28=3;
                        }
                        break;
                    case LE:
                        {
                        alt28=4;
                        }
                        break;
                    case GT:
                        {
                        alt28=5;
                        }
                        break;
                    case GE:
                        {
                        alt28=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 28, 0, input);

                        throw nvae;

                    }

                    switch (alt28) {
                        case 1 :
                            // src/parser/Music.g:118:24: EQUAL ^
                            {
                            EQUAL88=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_boolfact1165); 
                            EQUAL88_tree = 
                            (AmlTree)adaptor.create(EQUAL88)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(EQUAL88_tree, root_0);


                            }
                            break;
                        case 2 :
                            // src/parser/Music.g:118:33: NOT_EQUAL ^
                            {
                            NOT_EQUAL89=(Token)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_boolfact1170); 
                            NOT_EQUAL89_tree = 
                            (AmlTree)adaptor.create(NOT_EQUAL89)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(NOT_EQUAL89_tree, root_0);


                            }
                            break;
                        case 3 :
                            // src/parser/Music.g:118:46: LT ^
                            {
                            LT90=(Token)match(input,LT,FOLLOW_LT_in_boolfact1175); 
                            LT90_tree = 
                            (AmlTree)adaptor.create(LT90)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(LT90_tree, root_0);


                            }
                            break;
                        case 4 :
                            // src/parser/Music.g:118:52: LE ^
                            {
                            LE91=(Token)match(input,LE,FOLLOW_LE_in_boolfact1180); 
                            LE91_tree = 
                            (AmlTree)adaptor.create(LE91)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(LE91_tree, root_0);


                            }
                            break;
                        case 5 :
                            // src/parser/Music.g:118:58: GT ^
                            {
                            GT92=(Token)match(input,GT,FOLLOW_GT_in_boolfact1185); 
                            GT92_tree = 
                            (AmlTree)adaptor.create(GT92)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(GT92_tree, root_0);


                            }
                            break;
                        case 6 :
                            // src/parser/Music.g:118:64: GE ^
                            {
                            GE93=(Token)match(input,GE,FOLLOW_GE_in_boolfact1190); 
                            GE93_tree = 
                            (AmlTree)adaptor.create(GE93)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(GE93_tree, root_0);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_num_expr_in_boolfact1194);
                    num_expr94=num_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, num_expr94.getTree());

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
    // src/parser/Music.g:121:1: num_expr : term ( ( PLUS ^| MINUS ^) term )* ;
    public final MusicParser.num_expr_return num_expr() throws RecognitionException {
        MusicParser.num_expr_return retval = new MusicParser.num_expr_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token PLUS96=null;
        Token MINUS97=null;
        MusicParser.term_return term95 =null;

        MusicParser.term_return term98 =null;


        AmlTree PLUS96_tree=null;
        AmlTree MINUS97_tree=null;

        try {
            // src/parser/Music.g:121:9: ( term ( ( PLUS ^| MINUS ^) term )* )
            // src/parser/Music.g:121:13: term ( ( PLUS ^| MINUS ^) term )*
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_term_in_num_expr1208);
            term95=term();

            state._fsp--;

            adaptor.addChild(root_0, term95.getTree());

            // src/parser/Music.g:121:18: ( ( PLUS ^| MINUS ^) term )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==MINUS||LA31_0==PLUS) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // src/parser/Music.g:121:20: ( PLUS ^| MINUS ^) term
            	    {
            	    // src/parser/Music.g:121:20: ( PLUS ^| MINUS ^)
            	    int alt30=2;
            	    int LA30_0 = input.LA(1);

            	    if ( (LA30_0==PLUS) ) {
            	        alt30=1;
            	    }
            	    else if ( (LA30_0==MINUS) ) {
            	        alt30=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 30, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt30) {
            	        case 1 :
            	            // src/parser/Music.g:121:21: PLUS ^
            	            {
            	            PLUS96=(Token)match(input,PLUS,FOLLOW_PLUS_in_num_expr1213); 
            	            PLUS96_tree = 
            	            (AmlTree)adaptor.create(PLUS96)
            	            ;
            	            root_0 = (AmlTree)adaptor.becomeRoot(PLUS96_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // src/parser/Music.g:121:29: MINUS ^
            	            {
            	            MINUS97=(Token)match(input,MINUS,FOLLOW_MINUS_in_num_expr1218); 
            	            MINUS97_tree = 
            	            (AmlTree)adaptor.create(MINUS97)
            	            ;
            	            root_0 = (AmlTree)adaptor.becomeRoot(MINUS97_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_term_in_num_expr1222);
            	    term98=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term98.getTree());

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
    // $ANTLR end "num_expr"


    public static class term_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "term"
    // src/parser/Music.g:124:1: term : factor ( ( DOT ^| DIV ^| MOD ^) factor )* ;
    public final MusicParser.term_return term() throws RecognitionException {
        MusicParser.term_return retval = new MusicParser.term_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token DOT100=null;
        Token DIV101=null;
        Token MOD102=null;
        MusicParser.factor_return factor99 =null;

        MusicParser.factor_return factor103 =null;


        AmlTree DOT100_tree=null;
        AmlTree DIV101_tree=null;
        AmlTree MOD102_tree=null;

        try {
            // src/parser/Music.g:124:9: ( factor ( ( DOT ^| DIV ^| MOD ^) factor )* )
            // src/parser/Music.g:124:13: factor ( ( DOT ^| DIV ^| MOD ^) factor )*
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term1240);
            factor99=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor99.getTree());

            // src/parser/Music.g:124:20: ( ( DOT ^| DIV ^| MOD ^) factor )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0 >= DIV && LA33_0 <= DOT)||LA33_0==MOD) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // src/parser/Music.g:124:22: ( DOT ^| DIV ^| MOD ^) factor
            	    {
            	    // src/parser/Music.g:124:22: ( DOT ^| DIV ^| MOD ^)
            	    int alt32=3;
            	    switch ( input.LA(1) ) {
            	    case DOT:
            	        {
            	        alt32=1;
            	        }
            	        break;
            	    case DIV:
            	        {
            	        alt32=2;
            	        }
            	        break;
            	    case MOD:
            	        {
            	        alt32=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 32, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt32) {
            	        case 1 :
            	            // src/parser/Music.g:124:23: DOT ^
            	            {
            	            DOT100=(Token)match(input,DOT,FOLLOW_DOT_in_term1245); 
            	            DOT100_tree = 
            	            (AmlTree)adaptor.create(DOT100)
            	            ;
            	            root_0 = (AmlTree)adaptor.becomeRoot(DOT100_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // src/parser/Music.g:124:30: DIV ^
            	            {
            	            DIV101=(Token)match(input,DIV,FOLLOW_DIV_in_term1250); 
            	            DIV101_tree = 
            	            (AmlTree)adaptor.create(DIV101)
            	            ;
            	            root_0 = (AmlTree)adaptor.becomeRoot(DIV101_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // src/parser/Music.g:124:37: MOD ^
            	            {
            	            MOD102=(Token)match(input,MOD,FOLLOW_MOD_in_term1255); 
            	            MOD102_tree = 
            	            (AmlTree)adaptor.create(MOD102)
            	            ;
            	            root_0 = (AmlTree)adaptor.becomeRoot(MOD102_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_factor_in_term1259);
            	    factor103=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor103.getTree());

            	    }
            	    break;

            	default :
            	    break loop33;
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
    // src/parser/Music.g:127:1: factor : ( NOT ^| PLUS ^| MINUS ^)? atom ;
    public final MusicParser.factor_return factor() throws RecognitionException {
        MusicParser.factor_return retval = new MusicParser.factor_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token NOT104=null;
        Token PLUS105=null;
        Token MINUS106=null;
        MusicParser.atom_return atom107 =null;


        AmlTree NOT104_tree=null;
        AmlTree PLUS105_tree=null;
        AmlTree MINUS106_tree=null;

        try {
            // src/parser/Music.g:127:9: ( ( NOT ^| PLUS ^| MINUS ^)? atom )
            // src/parser/Music.g:127:13: ( NOT ^| PLUS ^| MINUS ^)? atom
            {
            root_0 = (AmlTree)adaptor.nil();


            // src/parser/Music.g:127:13: ( NOT ^| PLUS ^| MINUS ^)?
            int alt34=4;
            switch ( input.LA(1) ) {
                case NOT:
                    {
                    alt34=1;
                    }
                    break;
                case PLUS:
                    {
                    alt34=2;
                    }
                    break;
                case MINUS:
                    {
                    alt34=3;
                    }
                    break;
            }

            switch (alt34) {
                case 1 :
                    // src/parser/Music.g:127:14: NOT ^
                    {
                    NOT104=(Token)match(input,NOT,FOLLOW_NOT_in_factor1276); 
                    NOT104_tree = 
                    (AmlTree)adaptor.create(NOT104)
                    ;
                    root_0 = (AmlTree)adaptor.becomeRoot(NOT104_tree, root_0);


                    }
                    break;
                case 2 :
                    // src/parser/Music.g:127:21: PLUS ^
                    {
                    PLUS105=(Token)match(input,PLUS,FOLLOW_PLUS_in_factor1281); 
                    PLUS105_tree = 
                    (AmlTree)adaptor.create(PLUS105)
                    ;
                    root_0 = (AmlTree)adaptor.becomeRoot(PLUS105_tree, root_0);


                    }
                    break;
                case 3 :
                    // src/parser/Music.g:127:29: MINUS ^
                    {
                    MINUS106=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor1286); 
                    MINUS106_tree = 
                    (AmlTree)adaptor.create(MINUS106)
                    ;
                    root_0 = (AmlTree)adaptor.becomeRoot(MINUS106_tree, root_0);


                    }
                    break;

            }


            pushFollow(FOLLOW_atom_in_factor1291);
            atom107=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom107.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:130:1: atom : ( ID | INT | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | '(' ! expr ')' !);
    public final MusicParser.atom_return atom() throws RecognitionException {
        MusicParser.atom_return retval = new MusicParser.atom_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token b=null;
        Token ID108=null;
        Token INT109=null;
        Token char_literal110=null;
        Token char_literal112=null;
        MusicParser.expr_return expr111 =null;


        AmlTree b_tree=null;
        AmlTree ID108_tree=null;
        AmlTree INT109_tree=null;
        AmlTree char_literal110_tree=null;
        AmlTree char_literal112_tree=null;
        RewriteRuleTokenStream stream_FALSE=new RewriteRuleTokenStream(adaptor,"token FALSE");
        RewriteRuleTokenStream stream_TRUE=new RewriteRuleTokenStream(adaptor,"token TRUE");

        try {
            // src/parser/Music.g:130:9: ( ID | INT | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | '(' ! expr ')' !)
            int alt36=4;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt36=1;
                }
                break;
            case INT:
                {
                alt36=2;
                }
                break;
            case FALSE:
            case TRUE:
                {
                alt36=3;
                }
                break;
            case 60:
                {
                alt36=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;

            }

            switch (alt36) {
                case 1 :
                    // src/parser/Music.g:130:13: ID
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    ID108=(Token)match(input,ID,FOLLOW_ID_in_atom1307); 
                    ID108_tree = 
                    (AmlTree)adaptor.create(ID108)
                    ;
                    adaptor.addChild(root_0, ID108_tree);


                    }
                    break;
                case 2 :
                    // src/parser/Music.g:131:7: INT
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    INT109=(Token)match(input,INT,FOLLOW_INT_in_atom1315); 
                    INT109_tree = 
                    (AmlTree)adaptor.create(INT109)
                    ;
                    adaptor.addChild(root_0, INT109_tree);


                    }
                    break;
                case 3 :
                    // src/parser/Music.g:132:7: (b= TRUE |b= FALSE )
                    {
                    // src/parser/Music.g:132:7: (b= TRUE |b= FALSE )
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==TRUE) ) {
                        alt35=1;
                    }
                    else if ( (LA35_0==FALSE) ) {
                        alt35=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 35, 0, input);

                        throw nvae;

                    }
                    switch (alt35) {
                        case 1 :
                            // src/parser/Music.g:132:8: b= TRUE
                            {
                            b=(Token)match(input,TRUE,FOLLOW_TRUE_in_atom1326);  
                            stream_TRUE.add(b);


                            }
                            break;
                        case 2 :
                            // src/parser/Music.g:132:17: b= FALSE
                            {
                            b=(Token)match(input,FALSE,FOLLOW_FALSE_in_atom1332);  
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
                    // 132:27: -> ^( BOOLEAN[$b,$b.text] )
                    {
                        // src/parser/Music.g:132:30: ^( BOOLEAN[$b,$b.text] )
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
                    // src/parser/Music.g:133:7: '(' ! expr ')' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    char_literal110=(Token)match(input,60,FOLLOW_60_in_atom1349); 

                    pushFollow(FOLLOW_expr_in_atom1352);
                    expr111=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr111.getTree());

                    char_literal112=(Token)match(input,61,FOLLOW_61_in_atom1354); 

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


 

    public static final BitSet FOLLOW_function_in_prog122 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_EOF_in_prog125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_function162 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_function164 = new BitSet(new long[]{0x3200205050400000L});
    public static final BitSet FOLLOW_params_in_function165 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_function167 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_function169 = new BitSet(new long[]{0x0402000071000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_listInst_in_function171 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_function173 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_SONG_in_song643 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_song646 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_song649 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_beat_in_song652 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_speed_in_song654 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_track_in_song657 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_song661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRACK_in_track691 = new BitSet(new long[]{0x0010000010000000L});
    public static final BitSet FOLLOW_ID_in_track694 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_STRING_in_track697 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_compas_list_in_track699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_BAR_in_compas_list731 = new BitSet(new long[]{0x1020088000000480L});
    public static final BitSet FOLLOW_compas_in_compas_list733 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_BAR_in_compas_list737 = new BitSet(new long[]{0x1020088000000480L});
    public static final BitSet FOLLOW_compas_in_compas_list739 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_DOUBLE_BAR_in_compas_list743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tone_in_compas780 = new BitSet(new long[]{0x1020008000000480L});
    public static final BitSet FOLLOW_notes_group_in_compas784 = new BitSet(new long[]{0x1020008000000482L});
    public static final BitSet FOLLOW_NUM_in_tone831 = new BitSet(new long[]{0x0020000000000080L});
    public static final BitSet FOLLOW_SUSTAIN_in_tone836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BEMOL_in_tone842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_note_list_in_notes_group880 = new BitSet(new long[]{0x8040000000010002L});
    public static final BitSet FOLLOW_63_in_notes_group883 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_FIGURE_in_notes_group885 = new BitSet(new long[]{0x0040000000010002L});
    public static final BitSet FOLLOW_DOT_in_notes_group889 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_TIE_in_notes_group892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_chord_in_note_list935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notes_in_note_list939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHORD_in_chord968 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_chord971 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_NOTE_in_chord974 = new BitSet(new long[]{0x2001200C00004000L});
    public static final BitSet FOLLOW_61_in_chord992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_notes1024 = new BitSet(new long[]{0x0020008000000080L});
    public static final BitSet FOLLOW_note_in_notes1027 = new BitSet(new long[]{0x2020008000000080L});
    public static final BitSet FOLLOW_61_in_notes1031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_note_in_notes1036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOTE_in_note1085 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_MINUS_in_note1089 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_NUM_in_note1092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolterm_in_expr1121 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_OR_in_expr1124 = new BitSet(new long[]{0x1200205050400000L});
    public static final BitSet FOLLOW_boolterm_in_expr1127 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_boolfact_in_boolterm1141 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_boolterm1144 = new BitSet(new long[]{0x1200205050400000L});
    public static final BitSet FOLLOW_boolfact_in_boolterm1147 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_num_expr_in_boolfact1161 = new BitSet(new long[]{0x000004028C100002L});
    public static final BitSet FOLLOW_EQUAL_in_boolfact1165 = new BitSet(new long[]{0x1200205050400000L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_boolfact1170 = new BitSet(new long[]{0x1200205050400000L});
    public static final BitSet FOLLOW_LT_in_boolfact1175 = new BitSet(new long[]{0x1200205050400000L});
    public static final BitSet FOLLOW_LE_in_boolfact1180 = new BitSet(new long[]{0x1200205050400000L});
    public static final BitSet FOLLOW_GT_in_boolfact1185 = new BitSet(new long[]{0x1200205050400000L});
    public static final BitSet FOLLOW_GE_in_boolfact1190 = new BitSet(new long[]{0x1200205050400000L});
    public static final BitSet FOLLOW_num_expr_in_boolfact1194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_num_expr1208 = new BitSet(new long[]{0x0000201000000002L});
    public static final BitSet FOLLOW_PLUS_in_num_expr1213 = new BitSet(new long[]{0x1200205050400000L});
    public static final BitSet FOLLOW_MINUS_in_num_expr1218 = new BitSet(new long[]{0x1200205050400000L});
    public static final BitSet FOLLOW_term_in_num_expr1222 = new BitSet(new long[]{0x0000201000000002L});
    public static final BitSet FOLLOW_factor_in_term1240 = new BitSet(new long[]{0x0000002000018002L});
    public static final BitSet FOLLOW_DOT_in_term1245 = new BitSet(new long[]{0x1200205050400000L});
    public static final BitSet FOLLOW_DIV_in_term1250 = new BitSet(new long[]{0x1200205050400000L});
    public static final BitSet FOLLOW_MOD_in_term1255 = new BitSet(new long[]{0x1200205050400000L});
    public static final BitSet FOLLOW_factor_in_term1259 = new BitSet(new long[]{0x0000002000018002L});
    public static final BitSet FOLLOW_NOT_in_factor1276 = new BitSet(new long[]{0x1200000050400000L});
    public static final BitSet FOLLOW_PLUS_in_factor1281 = new BitSet(new long[]{0x1200000050400000L});
    public static final BitSet FOLLOW_MINUS_in_factor1286 = new BitSet(new long[]{0x1200000050400000L});
    public static final BitSet FOLLOW_atom_in_factor1291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom1307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom1315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_atom1326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_atom1332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_atom1349 = new BitSet(new long[]{0x1200205050400000L});
    public static final BitSet FOLLOW_expr_in_atom1352 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_atom1354 = new BitSet(new long[]{0x0000000000000002L});

}