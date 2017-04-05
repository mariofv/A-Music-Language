// $ANTLR 3.4 src/parser/Music.g 2017-04-05 23:32:27

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ASSIG", "BAR", "BEAT", "BEMOL", "BOOL", "BOOLEAN", "CHORD", "COMMENT", "COMPAS", "COMPAS_LIST", "DECR", "DIMINUTION", "DIV", "DIVIDE_ASSIG", "DOT", "DOUBLE_BAR", "ELSE", "ELSEIF", "END_REPETITION", "EQUAL", "ESC_SEQ", "FALSE", "FIGURE", "FOR", "FUNCALL", "FUNCTION", "GE", "GT", "ID", "IF", "INCR", "INT", "LE", "LIST_ARGUMENTS", "LIST_ASSIG", "LIST_FUNCTIONS", "LIST_INSTRUCTIONS", "LIST_MUSIC_INST", "LT", "MAJ7", "MINOR", "MINUS", "MINUS_ASSIG", "MOD", "MOD_ASSIG", "NOT", "NOTE", "NOTES", "NOTE_LIST", "NOT_EQUAL", "NUM", "OR", "PLUS", "PLUS_ASSIG", "POST", "PRE", "PROD_ASSIG", "REPETITION", "RETURN", "SEVENTH", "SONG", "SPEED", "START_REPETITION", "STRING", "SUSTAIN", "TIE", "TONE", "TRACK", "TRANSPORT", "TRUE", "WHILE", "WS", "'('", "')'", "','", "'.'", "':'", "';'", "'x'", "'{'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int AND=4;
    public static final int ASSIG=5;
    public static final int BAR=6;
    public static final int BEAT=7;
    public static final int BEMOL=8;
    public static final int BOOL=9;
    public static final int BOOLEAN=10;
    public static final int CHORD=11;
    public static final int COMMENT=12;
    public static final int COMPAS=13;
    public static final int COMPAS_LIST=14;
    public static final int DECR=15;
    public static final int DIMINUTION=16;
    public static final int DIV=17;
    public static final int DIVIDE_ASSIG=18;
    public static final int DOT=19;
    public static final int DOUBLE_BAR=20;
    public static final int ELSE=21;
    public static final int ELSEIF=22;
    public static final int END_REPETITION=23;
    public static final int EQUAL=24;
    public static final int ESC_SEQ=25;
    public static final int FALSE=26;
    public static final int FIGURE=27;
    public static final int FOR=28;
    public static final int FUNCALL=29;
    public static final int FUNCTION=30;
    public static final int GE=31;
    public static final int GT=32;
    public static final int ID=33;
    public static final int IF=34;
    public static final int INCR=35;
    public static final int INT=36;
    public static final int LE=37;
    public static final int LIST_ARGUMENTS=38;
    public static final int LIST_ASSIG=39;
    public static final int LIST_FUNCTIONS=40;
    public static final int LIST_INSTRUCTIONS=41;
    public static final int LIST_MUSIC_INST=42;
    public static final int LT=43;
    public static final int MAJ7=44;
    public static final int MINOR=45;
    public static final int MINUS=46;
    public static final int MINUS_ASSIG=47;
    public static final int MOD=48;
    public static final int MOD_ASSIG=49;
    public static final int NOT=50;
    public static final int NOTE=51;
    public static final int NOTES=52;
    public static final int NOTE_LIST=53;
    public static final int NOT_EQUAL=54;
    public static final int NUM=55;
    public static final int OR=56;
    public static final int PLUS=57;
    public static final int PLUS_ASSIG=58;
    public static final int POST=59;
    public static final int PRE=60;
    public static final int PROD_ASSIG=61;
    public static final int REPETITION=62;
    public static final int RETURN=63;
    public static final int SEVENTH=64;
    public static final int SONG=65;
    public static final int SPEED=66;
    public static final int START_REPETITION=67;
    public static final int STRING=68;
    public static final int SUSTAIN=69;
    public static final int TIE=70;
    public static final int TONE=71;
    public static final int TRACK=72;
    public static final int TRANSPORT=73;
    public static final int TRUE=74;
    public static final int WHILE=75;
    public static final int WS=76;

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
    // src/parser/Music.g:38:1: prog : ( function )+ EOF -> ^( LIST_FUNCTIONS ( function )+ ) ;
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
            // src/parser/Music.g:38:10: ( ( function )+ EOF -> ^( LIST_FUNCTIONS ( function )+ ) )
            // src/parser/Music.g:38:14: ( function )+ EOF
            {
            // src/parser/Music.g:38:14: ( function )+
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
            	    // src/parser/Music.g:38:14: function
            	    {
            	    pushFollow(FOLLOW_function_in_prog171);
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


            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_prog174);  
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
            // 38:28: -> ^( LIST_FUNCTIONS ( function )+ )
            {
                // src/parser/Music.g:38:31: ^( LIST_FUNCTIONS ( function )+ )
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
    // src/parser/Music.g:41:1: function : id= ID '(' list_arguments ')' '{' listInst '}' -> ^( FUNCTION[$id.text] list_arguments listInst ) ;
    public final MusicParser.function_return function() throws RecognitionException {
        MusicParser.function_return retval = new MusicParser.function_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token id=null;
        Token char_literal3=null;
        Token char_literal5=null;
        Token char_literal6=null;
        Token char_literal8=null;
        MusicParser.list_arguments_return list_arguments4 =null;

        MusicParser.listInst_return listInst7 =null;


        AmlTree id_tree=null;
        AmlTree char_literal3_tree=null;
        AmlTree char_literal5_tree=null;
        AmlTree char_literal6_tree=null;
        AmlTree char_literal8_tree=null;
        RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
        RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");
        RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
        RewriteRuleSubtreeStream stream_listInst=new RewriteRuleSubtreeStream(adaptor,"rule listInst");
        RewriteRuleSubtreeStream stream_list_arguments=new RewriteRuleSubtreeStream(adaptor,"rule list_arguments");
        try {
            // src/parser/Music.g:41:13: (id= ID '(' list_arguments ')' '{' listInst '}' -> ^( FUNCTION[$id.text] list_arguments listInst ) )
            // src/parser/Music.g:41:17: id= ID '(' list_arguments ')' '{' listInst '}'
            {
            id=(Token)match(input,ID,FOLLOW_ID_in_function211);  
            stream_ID.add(id);


            char_literal3=(Token)match(input,77,FOLLOW_77_in_function213);  
            stream_77.add(char_literal3);


            pushFollow(FOLLOW_list_arguments_in_function215);
            list_arguments4=list_arguments();

            state._fsp--;

            stream_list_arguments.add(list_arguments4.getTree());

            char_literal5=(Token)match(input,78,FOLLOW_78_in_function217);  
            stream_78.add(char_literal5);


            char_literal6=(Token)match(input,84,FOLLOW_84_in_function219);  
            stream_84.add(char_literal6);


            pushFollow(FOLLOW_listInst_in_function221);
            listInst7=listInst();

            state._fsp--;

            stream_listInst.add(listInst7.getTree());

            char_literal8=(Token)match(input,85,FOLLOW_85_in_function223);  
            stream_85.add(char_literal8);


            // AST REWRITE
            // elements: listInst, list_arguments
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AmlTree)adaptor.nil();
            // 41:66: -> ^( FUNCTION[$id.text] list_arguments listInst )
            {
                // src/parser/Music.g:41:71: ^( FUNCTION[$id.text] list_arguments listInst )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(FUNCTION, (id!=null?id.getText():null))
                , root_1);

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


    public static class list_arguments_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "list_arguments"
    // src/parser/Music.g:44:1: list_arguments : ( argument ( ',' argument )* )? -> ^( LIST_ARGUMENTS ( argument )* ) ;
    public final MusicParser.list_arguments_return list_arguments() throws RecognitionException {
        MusicParser.list_arguments_return retval = new MusicParser.list_arguments_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal10=null;
        MusicParser.argument_return argument9 =null;

        MusicParser.argument_return argument11 =null;


        AmlTree char_literal10_tree=null;
        RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
        RewriteRuleSubtreeStream stream_argument=new RewriteRuleSubtreeStream(adaptor,"rule argument");
        try {
            // src/parser/Music.g:44:17: ( ( argument ( ',' argument )* )? -> ^( LIST_ARGUMENTS ( argument )* ) )
            // src/parser/Music.g:44:19: ( argument ( ',' argument )* )?
            {
            // src/parser/Music.g:44:19: ( argument ( ',' argument )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==BOOL||LA3_0==INT) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // src/parser/Music.g:44:20: argument ( ',' argument )*
                    {
                    pushFollow(FOLLOW_argument_in_list_arguments262);
                    argument9=argument();

                    state._fsp--;

                    stream_argument.add(argument9.getTree());

                    // src/parser/Music.g:44:29: ( ',' argument )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==79) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // src/parser/Music.g:44:30: ',' argument
                    	    {
                    	    char_literal10=(Token)match(input,79,FOLLOW_79_in_list_arguments265);  
                    	    stream_79.add(char_literal10);


                    	    pushFollow(FOLLOW_argument_in_list_arguments267);
                    	    argument11=argument();

                    	    state._fsp--;

                    	    stream_argument.add(argument11.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop2;
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
            // 44:47: -> ^( LIST_ARGUMENTS ( argument )* )
            {
                // src/parser/Music.g:44:50: ^( LIST_ARGUMENTS ( argument )* )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(LIST_ARGUMENTS, "LIST_ARGUMENTS")
                , root_1);

                // src/parser/Music.g:44:67: ( argument )*
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
    // src/parser/Music.g:47:1: argument : ( ( INT | BOOL ) ^ ID ) ;
    public final MusicParser.argument_return argument() throws RecognitionException {
        MusicParser.argument_return retval = new MusicParser.argument_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token set12=null;
        Token ID13=null;

        AmlTree set12_tree=null;
        AmlTree ID13_tree=null;

        try {
            // src/parser/Music.g:47:11: ( ( ( INT | BOOL ) ^ ID ) )
            // src/parser/Music.g:47:15: ( ( INT | BOOL ) ^ ID )
            {
            root_0 = (AmlTree)adaptor.nil();


            // src/parser/Music.g:47:15: ( ( INT | BOOL ) ^ ID )
            // src/parser/Music.g:47:16: ( INT | BOOL ) ^ ID
            {
            set12=(Token)input.LT(1);

            set12=(Token)input.LT(1);

            if ( input.LA(1)==BOOL||input.LA(1)==INT ) {
                input.consume();
                root_0 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(set12)
                , root_0);
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            ID13=(Token)match(input,ID,FOLLOW_ID_in_argument316); 
            ID13_tree = 
            (AmlTree)adaptor.create(ID13)
            ;
            adaptor.addChild(root_0, ID13_tree);


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
    // $ANTLR end "argument"


    public static class params_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "params"
    // src/parser/Music.g:50:1: params : expr ( ',' ! expr )* ;
    public final MusicParser.params_return params() throws RecognitionException {
        MusicParser.params_return retval = new MusicParser.params_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal15=null;
        MusicParser.expr_return expr14 =null;

        MusicParser.expr_return expr16 =null;


        AmlTree char_literal15_tree=null;

        try {
            // src/parser/Music.g:50:13: ( expr ( ',' ! expr )* )
            // src/parser/Music.g:50:17: expr ( ',' ! expr )*
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_expr_in_params343);
            expr14=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr14.getTree());

            // src/parser/Music.g:50:22: ( ',' ! expr )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==79) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // src/parser/Music.g:50:23: ',' ! expr
            	    {
            	    char_literal15=(Token)match(input,79,FOLLOW_79_in_params346); 

            	    pushFollow(FOLLOW_expr_in_params349);
            	    expr16=expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr16.getTree());

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
    // $ANTLR end "params"


    public static class listInst_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "listInst"
    // src/parser/Music.g:52:1: listInst : ( inst )* -> ^( LIST_INSTRUCTIONS ( inst )* ) ;
    public final MusicParser.listInst_return listInst() throws RecognitionException {
        MusicParser.listInst_return retval = new MusicParser.listInst_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        MusicParser.inst_return inst17 =null;


        RewriteRuleSubtreeStream stream_inst=new RewriteRuleSubtreeStream(adaptor,"rule inst");
        try {
            // src/parser/Music.g:52:13: ( ( inst )* -> ^( LIST_INSTRUCTIONS ( inst )* ) )
            // src/parser/Music.g:52:16: ( inst )*
            {
            // src/parser/Music.g:52:16: ( inst )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==BOOL||LA5_0==DECR||LA5_0==DOUBLE_BAR||LA5_0==FOR||(LA5_0 >= ID && LA5_0 <= INT)||LA5_0==NUM||LA5_0==SONG||LA5_0==START_REPETITION||LA5_0==WHILE) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // src/parser/Music.g:52:16: inst
            	    {
            	    pushFollow(FOLLOW_inst_in_listInst363);
            	    inst17=inst();

            	    state._fsp--;

            	    stream_inst.add(inst17.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
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
            // 52:23: -> ^( LIST_INSTRUCTIONS ( inst )* )
            {
                // src/parser/Music.g:52:26: ^( LIST_INSTRUCTIONS ( inst )* )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(LIST_INSTRUCTIONS, "LIST_INSTRUCTIONS")
                , root_1);

                // src/parser/Music.g:52:46: ( inst )*
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
    // src/parser/Music.g:55:1: list_music_inst : ( music_inst )* -> ^( LIST_MUSIC_INST ( music_inst )* ) ;
    public final MusicParser.list_music_inst_return list_music_inst() throws RecognitionException {
        MusicParser.list_music_inst_return retval = new MusicParser.list_music_inst_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        MusicParser.music_inst_return music_inst18 =null;


        RewriteRuleSubtreeStream stream_music_inst=new RewriteRuleSubtreeStream(adaptor,"rule music_inst");
        try {
            // src/parser/Music.g:55:17: ( ( music_inst )* -> ^( LIST_MUSIC_INST ( music_inst )* ) )
            // src/parser/Music.g:55:21: ( music_inst )*
            {
            // src/parser/Music.g:55:21: ( music_inst )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= BEMOL && LA6_0 <= BOOL)||LA6_0==CHORD||LA6_0==DECR||LA6_0==FOR||(LA6_0 >= ID && LA6_0 <= INT)||LA6_0==NOTE||LA6_0==SONG||LA6_0==SUSTAIN||LA6_0==WHILE||LA6_0==77) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // src/parser/Music.g:55:21: music_inst
            	    {
            	    pushFollow(FOLLOW_music_inst_in_list_music_inst397);
            	    music_inst18=music_inst();

            	    state._fsp--;

            	    stream_music_inst.add(music_inst18.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
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
            // 55:33: -> ^( LIST_MUSIC_INST ( music_inst )* )
            {
                // src/parser/Music.g:55:36: ^( LIST_MUSIC_INST ( music_inst )* )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(LIST_MUSIC_INST, "LIST_MUSIC_INST")
                , root_1);

                // src/parser/Music.g:55:54: ( music_inst )*
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
    // src/parser/Music.g:58:1: inst : ( declaration | assignation | while_stmt | funcall | for_stmt | if_stmt | song | compas_list );
    public final MusicParser.inst_return inst() throws RecognitionException {
        MusicParser.inst_return retval = new MusicParser.inst_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        MusicParser.declaration_return declaration19 =null;

        MusicParser.assignation_return assignation20 =null;

        MusicParser.while_stmt_return while_stmt21 =null;

        MusicParser.funcall_return funcall22 =null;

        MusicParser.for_stmt_return for_stmt23 =null;

        MusicParser.if_stmt_return if_stmt24 =null;

        MusicParser.song_return song25 =null;

        MusicParser.compas_list_return compas_list26 =null;



        try {
            // src/parser/Music.g:58:13: ( declaration | assignation | while_stmt | funcall | for_stmt | if_stmt | song | compas_list )
            int alt7=8;
            switch ( input.LA(1) ) {
            case BOOL:
            case INT:
                {
                alt7=1;
                }
                break;
            case ID:
                {
                int LA7_2 = input.LA(2);

                if ( (LA7_2==ASSIG||LA7_2==DECR||LA7_2==DIVIDE_ASSIG||LA7_2==INCR||LA7_2==MINUS_ASSIG||LA7_2==MOD_ASSIG||LA7_2==PLUS_ASSIG||LA7_2==PROD_ASSIG) ) {
                    alt7=2;
                }
                else if ( (LA7_2==77) ) {
                    alt7=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 2, input);

                    throw nvae;

                }
                }
                break;
            case DECR:
            case INCR:
                {
                alt7=2;
                }
                break;
            case WHILE:
                {
                alt7=3;
                }
                break;
            case FOR:
                {
                alt7=5;
                }
                break;
            case IF:
                {
                alt7=6;
                }
                break;
            case SONG:
                {
                alt7=7;
                }
                break;
            case DOUBLE_BAR:
            case NUM:
            case START_REPETITION:
                {
                alt7=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }

            switch (alt7) {
                case 1 :
                    // src/parser/Music.g:58:17: declaration
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_declaration_in_inst441);
                    declaration19=declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, declaration19.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:59:17: assignation
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_assignation_in_inst459);
                    assignation20=assignation();

                    state._fsp--;

                    adaptor.addChild(root_0, assignation20.getTree());

                    }
                    break;
                case 3 :
                    // src/parser/Music.g:60:17: while_stmt
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_while_stmt_in_inst477);
                    while_stmt21=while_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, while_stmt21.getTree());

                    }
                    break;
                case 4 :
                    // src/parser/Music.g:61:17: funcall
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_inst495);
                    funcall22=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall22.getTree());

                    }
                    break;
                case 5 :
                    // src/parser/Music.g:62:17: for_stmt
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_for_stmt_in_inst513);
                    for_stmt23=for_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, for_stmt23.getTree());

                    }
                    break;
                case 6 :
                    // src/parser/Music.g:63:17: if_stmt
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_if_stmt_in_inst531);
                    if_stmt24=if_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, if_stmt24.getTree());

                    }
                    break;
                case 7 :
                    // src/parser/Music.g:64:17: song
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_song_in_inst549);
                    song25=song();

                    state._fsp--;

                    adaptor.addChild(root_0, song25.getTree());

                    }
                    break;
                case 8 :
                    // src/parser/Music.g:65:17: compas_list
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_compas_list_in_inst567);
                    compas_list26=compas_list();

                    state._fsp--;

                    adaptor.addChild(root_0, compas_list26.getTree());

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
    // src/parser/Music.g:68:1: music_inst : ( declaration | assignation | while_music_stmt | funcall | for_music_stmt | if_music_stmt | song | ( options {greedy=true; } : notes_group )+ ( ';' !)? );
    public final MusicParser.music_inst_return music_inst() throws RecognitionException {
        MusicParser.music_inst_return retval = new MusicParser.music_inst_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal35=null;
        MusicParser.declaration_return declaration27 =null;

        MusicParser.assignation_return assignation28 =null;

        MusicParser.while_music_stmt_return while_music_stmt29 =null;

        MusicParser.funcall_return funcall30 =null;

        MusicParser.for_music_stmt_return for_music_stmt31 =null;

        MusicParser.if_music_stmt_return if_music_stmt32 =null;

        MusicParser.song_return song33 =null;

        MusicParser.notes_group_return notes_group34 =null;


        AmlTree char_literal35_tree=null;

        try {
            // src/parser/Music.g:68:13: ( declaration | assignation | while_music_stmt | funcall | for_music_stmt | if_music_stmt | song | ( options {greedy=true; } : notes_group )+ ( ';' !)? )
            int alt10=8;
            switch ( input.LA(1) ) {
            case BOOL:
            case INT:
                {
                alt10=1;
                }
                break;
            case ID:
                {
                int LA10_2 = input.LA(2);

                if ( (LA10_2==ASSIG||LA10_2==DECR||LA10_2==DIVIDE_ASSIG||LA10_2==INCR||LA10_2==MINUS_ASSIG||LA10_2==MOD_ASSIG||LA10_2==PLUS_ASSIG||LA10_2==PROD_ASSIG) ) {
                    alt10=2;
                }
                else if ( (LA10_2==77) ) {
                    alt10=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 2, input);

                    throw nvae;

                }
                }
                break;
            case DECR:
            case INCR:
                {
                alt10=2;
                }
                break;
            case WHILE:
                {
                alt10=3;
                }
                break;
            case FOR:
                {
                alt10=5;
                }
                break;
            case IF:
                {
                alt10=6;
                }
                break;
            case SONG:
                {
                alt10=7;
                }
                break;
            case BEMOL:
            case CHORD:
            case NOTE:
            case SUSTAIN:
            case 77:
                {
                alt10=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }

            switch (alt10) {
                case 1 :
                    // src/parser/Music.g:68:17: declaration
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_declaration_in_music_inst591);
                    declaration27=declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, declaration27.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:69:17: assignation
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_assignation_in_music_inst609);
                    assignation28=assignation();

                    state._fsp--;

                    adaptor.addChild(root_0, assignation28.getTree());

                    }
                    break;
                case 3 :
                    // src/parser/Music.g:70:17: while_music_stmt
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_while_music_stmt_in_music_inst627);
                    while_music_stmt29=while_music_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, while_music_stmt29.getTree());

                    }
                    break;
                case 4 :
                    // src/parser/Music.g:71:17: funcall
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_music_inst645);
                    funcall30=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall30.getTree());

                    }
                    break;
                case 5 :
                    // src/parser/Music.g:72:17: for_music_stmt
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_for_music_stmt_in_music_inst663);
                    for_music_stmt31=for_music_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, for_music_stmt31.getTree());

                    }
                    break;
                case 6 :
                    // src/parser/Music.g:73:17: if_music_stmt
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_if_music_stmt_in_music_inst681);
                    if_music_stmt32=if_music_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, if_music_stmt32.getTree());

                    }
                    break;
                case 7 :
                    // src/parser/Music.g:74:17: song
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_song_in_music_inst699);
                    song33=song();

                    state._fsp--;

                    adaptor.addChild(root_0, song33.getTree());

                    }
                    break;
                case 8 :
                    // src/parser/Music.g:75:16: ( options {greedy=true; } : notes_group )+ ( ';' !)?
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    // src/parser/Music.g:75:16: ( options {greedy=true; } : notes_group )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        switch ( input.LA(1) ) {
                        case CHORD:
                            {
                            alt8=1;
                            }
                            break;
                        case 77:
                            {
                            alt8=1;
                            }
                            break;
                        case BEMOL:
                        case SUSTAIN:
                            {
                            alt8=1;
                            }
                            break;
                        case NOTE:
                            {
                            alt8=1;
                            }
                            break;

                        }

                        switch (alt8) {
                    	case 1 :
                    	    // src/parser/Music.g:75:42: notes_group
                    	    {
                    	    pushFollow(FOLLOW_notes_group_in_music_inst726);
                    	    notes_group34=notes_group();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, notes_group34.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt8 >= 1 ) break loop8;
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);


                    // src/parser/Music.g:75:59: ( ';' !)?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==82) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // src/parser/Music.g:75:59: ';' !
                            {
                            char_literal35=(Token)match(input,82,FOLLOW_82_in_music_inst730); 

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


    public static class funcall_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "funcall"
    // src/parser/Music.g:78:1: funcall : id= ID '(' ( params )? ')' ';' -> ^( FUNCALL[$id.text] ( params )? ) ;
    public final MusicParser.funcall_return funcall() throws RecognitionException {
        MusicParser.funcall_return retval = new MusicParser.funcall_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token id=null;
        Token char_literal36=null;
        Token char_literal38=null;
        Token char_literal39=null;
        MusicParser.params_return params37 =null;


        AmlTree id_tree=null;
        AmlTree char_literal36_tree=null;
        AmlTree char_literal38_tree=null;
        AmlTree char_literal39_tree=null;
        RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
        RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
        RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_params=new RewriteRuleSubtreeStream(adaptor,"rule params");
        try {
            // src/parser/Music.g:78:13: (id= ID '(' ( params )? ')' ';' -> ^( FUNCALL[$id.text] ( params )? ) )
            // src/parser/Music.g:78:17: id= ID '(' ( params )? ')' ';'
            {
            id=(Token)match(input,ID,FOLLOW_ID_in_funcall761);  
            stream_ID.add(id);


            char_literal36=(Token)match(input,77,FOLLOW_77_in_funcall763);  
            stream_77.add(char_literal36);


            // src/parser/Music.g:78:27: ( params )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==FALSE||LA11_0==ID||LA11_0==MINUS||LA11_0==NOT||LA11_0==NUM||LA11_0==PLUS||LA11_0==TRUE||LA11_0==77) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // src/parser/Music.g:78:27: params
                    {
                    pushFollow(FOLLOW_params_in_funcall765);
                    params37=params();

                    state._fsp--;

                    stream_params.add(params37.getTree());

                    }
                    break;

            }


            char_literal38=(Token)match(input,78,FOLLOW_78_in_funcall768);  
            stream_78.add(char_literal38);


            char_literal39=(Token)match(input,82,FOLLOW_82_in_funcall770);  
            stream_82.add(char_literal39);


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
            // 78:43: -> ^( FUNCALL[$id.text] ( params )? )
            {
                // src/parser/Music.g:78:46: ^( FUNCALL[$id.text] ( params )? )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(FUNCALL, (id!=null?id.getText():null))
                , root_1);

                // src/parser/Music.g:78:66: ( params )?
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


    public static class declaration_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "declaration"
    // src/parser/Music.g:81:1: declaration : ( INT | BOOL ) ^ assig_opt ( ',' ! assig_opt )* ';' !;
    public final MusicParser.declaration_return declaration() throws RecognitionException {
        MusicParser.declaration_return retval = new MusicParser.declaration_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token set40=null;
        Token char_literal42=null;
        Token char_literal44=null;
        MusicParser.assig_opt_return assig_opt41 =null;

        MusicParser.assig_opt_return assig_opt43 =null;


        AmlTree set40_tree=null;
        AmlTree char_literal42_tree=null;
        AmlTree char_literal44_tree=null;

        try {
            // src/parser/Music.g:81:13: ( ( INT | BOOL ) ^ assig_opt ( ',' ! assig_opt )* ';' !)
            // src/parser/Music.g:81:17: ( INT | BOOL ) ^ assig_opt ( ',' ! assig_opt )* ';' !
            {
            root_0 = (AmlTree)adaptor.nil();


            set40=(Token)input.LT(1);

            set40=(Token)input.LT(1);

            if ( input.LA(1)==BOOL||input.LA(1)==INT ) {
                input.consume();
                root_0 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(set40)
                , root_0);
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            pushFollow(FOLLOW_assig_opt_in_declaration812);
            assig_opt41=assig_opt();

            state._fsp--;

            adaptor.addChild(root_0, assig_opt41.getTree());

            // src/parser/Music.g:81:41: ( ',' ! assig_opt )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==79) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // src/parser/Music.g:81:42: ',' ! assig_opt
            	    {
            	    char_literal42=(Token)match(input,79,FOLLOW_79_in_declaration815); 

            	    pushFollow(FOLLOW_assig_opt_in_declaration818);
            	    assig_opt43=assig_opt();

            	    state._fsp--;

            	    adaptor.addChild(root_0, assig_opt43.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            char_literal44=(Token)match(input,82,FOLLOW_82_in_declaration822); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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


    public static class assig_opt_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assig_opt"
    // src/parser/Music.g:84:1: assig_opt : ID ( ASSIG ^ expr )? ;
    public final MusicParser.assig_opt_return assig_opt() throws RecognitionException {
        MusicParser.assig_opt_return retval = new MusicParser.assig_opt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token ID45=null;
        Token ASSIG46=null;
        MusicParser.expr_return expr47 =null;


        AmlTree ID45_tree=null;
        AmlTree ASSIG46_tree=null;

        try {
            // src/parser/Music.g:84:13: ( ID ( ASSIG ^ expr )? )
            // src/parser/Music.g:84:17: ID ( ASSIG ^ expr )?
            {
            root_0 = (AmlTree)adaptor.nil();


            ID45=(Token)match(input,ID,FOLLOW_ID_in_assig_opt848); 
            ID45_tree = 
            (AmlTree)adaptor.create(ID45)
            ;
            adaptor.addChild(root_0, ID45_tree);


            // src/parser/Music.g:84:20: ( ASSIG ^ expr )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==ASSIG) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // src/parser/Music.g:84:21: ASSIG ^ expr
                    {
                    ASSIG46=(Token)match(input,ASSIG,FOLLOW_ASSIG_in_assig_opt851); 
                    ASSIG46_tree = 
                    (AmlTree)adaptor.create(ASSIG46)
                    ;
                    root_0 = (AmlTree)adaptor.becomeRoot(ASSIG46_tree, root_0);


                    pushFollow(FOLLOW_expr_in_assig_opt854);
                    expr47=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr47.getTree());

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
    // src/parser/Music.g:87:1: assignation : assig ';' !;
    public final MusicParser.assignation_return assignation() throws RecognitionException {
        MusicParser.assignation_return retval = new MusicParser.assignation_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal49=null;
        MusicParser.assig_return assig48 =null;


        AmlTree char_literal49_tree=null;

        try {
            // src/parser/Music.g:87:13: ( assig ';' !)
            // src/parser/Music.g:87:17: assig ';' !
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_assig_in_assignation879);
            assig48=assig();

            state._fsp--;

            adaptor.addChild(root_0, assig48.getTree());

            char_literal49=(Token)match(input,82,FOLLOW_82_in_assignation881); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:90:1: assig : ( ID ( ASSIG | PLUS_ASSIG | MINUS_ASSIG | PROD_ASSIG | DIVIDE_ASSIG | MOD_ASSIG ) ^ expr | post | pre );
    public final MusicParser.assig_return assig() throws RecognitionException {
        MusicParser.assig_return retval = new MusicParser.assig_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token ID50=null;
        Token set51=null;
        MusicParser.expr_return expr52 =null;

        MusicParser.post_return post53 =null;

        MusicParser.pre_return pre54 =null;


        AmlTree ID50_tree=null;
        AmlTree set51_tree=null;

        try {
            // src/parser/Music.g:90:13: ( ID ( ASSIG | PLUS_ASSIG | MINUS_ASSIG | PROD_ASSIG | DIVIDE_ASSIG | MOD_ASSIG ) ^ expr | post | pre )
            int alt14=3;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==ID) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==ASSIG||LA14_1==DIVIDE_ASSIG||LA14_1==MINUS_ASSIG||LA14_1==MOD_ASSIG||LA14_1==PLUS_ASSIG||LA14_1==PROD_ASSIG) ) {
                    alt14=1;
                }
                else if ( (LA14_1==DECR||LA14_1==INCR) ) {
                    alt14=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA14_0==DECR||LA14_0==INCR) ) {
                alt14=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }
            switch (alt14) {
                case 1 :
                    // src/parser/Music.g:90:17: ID ( ASSIG | PLUS_ASSIG | MINUS_ASSIG | PROD_ASSIG | DIVIDE_ASSIG | MOD_ASSIG ) ^ expr
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    ID50=(Token)match(input,ID,FOLLOW_ID_in_assig911); 
                    ID50_tree = 
                    (AmlTree)adaptor.create(ID50)
                    ;
                    adaptor.addChild(root_0, ID50_tree);


                    set51=(Token)input.LT(1);

                    set51=(Token)input.LT(1);

                    if ( input.LA(1)==ASSIG||input.LA(1)==DIVIDE_ASSIG||input.LA(1)==MINUS_ASSIG||input.LA(1)==MOD_ASSIG||input.LA(1)==PLUS_ASSIG||input.LA(1)==PROD_ASSIG ) {
                        input.consume();
                        root_0 = (AmlTree)adaptor.becomeRoot(
                        (AmlTree)adaptor.create(set51)
                        , root_0);
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_expr_in_assig928);
                    expr52=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr52.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:91:17: post
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_post_in_assig946);
                    post53=post();

                    state._fsp--;

                    adaptor.addChild(root_0, post53.getTree());

                    }
                    break;
                case 3 :
                    // src/parser/Music.g:92:17: pre
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_pre_in_assig964);
                    pre54=pre();

                    state._fsp--;

                    adaptor.addChild(root_0, pre54.getTree());

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
    // src/parser/Music.g:95:1: post : ID (x= INCR |x= DECR ) -> ^( POST ID $x) ;
    public final MusicParser.post_return post() throws RecognitionException {
        MusicParser.post_return retval = new MusicParser.post_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token x=null;
        Token ID55=null;

        AmlTree x_tree=null;
        AmlTree ID55_tree=null;
        RewriteRuleTokenStream stream_INCR=new RewriteRuleTokenStream(adaptor,"token INCR");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_DECR=new RewriteRuleTokenStream(adaptor,"token DECR");

        try {
            // src/parser/Music.g:95:13: ( ID (x= INCR |x= DECR ) -> ^( POST ID $x) )
            // src/parser/Music.g:95:17: ID (x= INCR |x= DECR )
            {
            ID55=(Token)match(input,ID,FOLLOW_ID_in_post994);  
            stream_ID.add(ID55);


            // src/parser/Music.g:95:20: (x= INCR |x= DECR )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==INCR) ) {
                alt15=1;
            }
            else if ( (LA15_0==DECR) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }
            switch (alt15) {
                case 1 :
                    // src/parser/Music.g:95:21: x= INCR
                    {
                    x=(Token)match(input,INCR,FOLLOW_INCR_in_post999);  
                    stream_INCR.add(x);


                    }
                    break;
                case 2 :
                    // src/parser/Music.g:95:30: x= DECR
                    {
                    x=(Token)match(input,DECR,FOLLOW_DECR_in_post1005);  
                    stream_DECR.add(x);


                    }
                    break;

            }


            // AST REWRITE
            // elements: x, ID
            // token labels: x
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_x=new RewriteRuleTokenStream(adaptor,"token x",x);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AmlTree)adaptor.nil();
            // 95:38: -> ^( POST ID $x)
            {
                // src/parser/Music.g:95:42: ^( POST ID $x)
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(POST, "POST")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
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
    // $ANTLR end "post"


    public static class pre_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "pre"
    // src/parser/Music.g:98:1: pre : (x= INCR |x= DECR ) ID -> ^( PRE ID $x) ;
    public final MusicParser.pre_return pre() throws RecognitionException {
        MusicParser.pre_return retval = new MusicParser.pre_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token x=null;
        Token ID56=null;

        AmlTree x_tree=null;
        AmlTree ID56_tree=null;
        RewriteRuleTokenStream stream_INCR=new RewriteRuleTokenStream(adaptor,"token INCR");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_DECR=new RewriteRuleTokenStream(adaptor,"token DECR");

        try {
            // src/parser/Music.g:98:13: ( (x= INCR |x= DECR ) ID -> ^( PRE ID $x) )
            // src/parser/Music.g:98:17: (x= INCR |x= DECR ) ID
            {
            // src/parser/Music.g:98:17: (x= INCR |x= DECR )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==INCR) ) {
                alt16=1;
            }
            else if ( (LA16_0==DECR) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }
            switch (alt16) {
                case 1 :
                    // src/parser/Music.g:98:18: x= INCR
                    {
                    x=(Token)match(input,INCR,FOLLOW_INCR_in_pre1052);  
                    stream_INCR.add(x);


                    }
                    break;
                case 2 :
                    // src/parser/Music.g:98:27: x= DECR
                    {
                    x=(Token)match(input,DECR,FOLLOW_DECR_in_pre1058);  
                    stream_DECR.add(x);


                    }
                    break;

            }


            ID56=(Token)match(input,ID,FOLLOW_ID_in_pre1061);  
            stream_ID.add(ID56);


            // AST REWRITE
            // elements: x, ID
            // token labels: x
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_x=new RewriteRuleTokenStream(adaptor,"token x",x);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AmlTree)adaptor.nil();
            // 98:39: -> ^( PRE ID $x)
            {
                // src/parser/Music.g:98:42: ^( PRE ID $x)
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(PRE, "PRE")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
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
    // $ANTLR end "pre"


    public static class beat_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "beat"
    // src/parser/Music.g:101:1: beat : BEAT ^ NUM ':' ! NUM ;
    public final MusicParser.beat_return beat() throws RecognitionException {
        MusicParser.beat_return retval = new MusicParser.beat_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token BEAT57=null;
        Token NUM58=null;
        Token char_literal59=null;
        Token NUM60=null;

        AmlTree BEAT57_tree=null;
        AmlTree NUM58_tree=null;
        AmlTree char_literal59_tree=null;
        AmlTree NUM60_tree=null;

        try {
            // src/parser/Music.g:101:13: ( BEAT ^ NUM ':' ! NUM )
            // src/parser/Music.g:101:17: BEAT ^ NUM ':' ! NUM
            {
            root_0 = (AmlTree)adaptor.nil();


            BEAT57=(Token)match(input,BEAT,FOLLOW_BEAT_in_beat1104); 
            BEAT57_tree = 
            (AmlTree)adaptor.create(BEAT57)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(BEAT57_tree, root_0);


            NUM58=(Token)match(input,NUM,FOLLOW_NUM_in_beat1107); 
            NUM58_tree = 
            (AmlTree)adaptor.create(NUM58)
            ;
            adaptor.addChild(root_0, NUM58_tree);


            char_literal59=(Token)match(input,81,FOLLOW_81_in_beat1109); 

            NUM60=(Token)match(input,NUM,FOLLOW_NUM_in_beat1112); 
            NUM60_tree = 
            (AmlTree)adaptor.create(NUM60)
            ;
            adaptor.addChild(root_0, NUM60_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:104:1: speed : SPEED ^ NUM ;
    public final MusicParser.speed_return speed() throws RecognitionException {
        MusicParser.speed_return retval = new MusicParser.speed_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token SPEED61=null;
        Token NUM62=null;

        AmlTree SPEED61_tree=null;
        AmlTree NUM62_tree=null;

        try {
            // src/parser/Music.g:104:13: ( SPEED ^ NUM )
            // src/parser/Music.g:104:17: SPEED ^ NUM
            {
            root_0 = (AmlTree)adaptor.nil();


            SPEED61=(Token)match(input,SPEED,FOLLOW_SPEED_in_speed1141); 
            SPEED61_tree = 
            (AmlTree)adaptor.create(SPEED61)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(SPEED61_tree, root_0);


            NUM62=(Token)match(input,NUM,FOLLOW_NUM_in_speed1144); 
            NUM62_tree = 
            (AmlTree)adaptor.create(NUM62)
            ;
            adaptor.addChild(root_0, NUM62_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:107:1: transport : TRANSPORT ^ NUM ;
    public final MusicParser.transport_return transport() throws RecognitionException {
        MusicParser.transport_return retval = new MusicParser.transport_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token TRANSPORT63=null;
        Token NUM64=null;

        AmlTree TRANSPORT63_tree=null;
        AmlTree NUM64_tree=null;

        try {
            // src/parser/Music.g:107:13: ( TRANSPORT ^ NUM )
            // src/parser/Music.g:107:17: TRANSPORT ^ NUM
            {
            root_0 = (AmlTree)adaptor.nil();


            TRANSPORT63=(Token)match(input,TRANSPORT,FOLLOW_TRANSPORT_in_transport1169); 
            TRANSPORT63_tree = 
            (AmlTree)adaptor.create(TRANSPORT63)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(TRANSPORT63_tree, root_0);


            NUM64=(Token)match(input,NUM,FOLLOW_NUM_in_transport1172); 
            NUM64_tree = 
            (AmlTree)adaptor.create(NUM64)
            ;
            adaptor.addChild(root_0, NUM64_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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


    public static class while_stmt_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "while_stmt"
    // src/parser/Music.g:110:1: while_stmt : WHILE ^ '(' ! expr ')' ! '{' ! listInst '}' !;
    public final MusicParser.while_stmt_return while_stmt() throws RecognitionException {
        MusicParser.while_stmt_return retval = new MusicParser.while_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token WHILE65=null;
        Token char_literal66=null;
        Token char_literal68=null;
        Token char_literal69=null;
        Token char_literal71=null;
        MusicParser.expr_return expr67 =null;

        MusicParser.listInst_return listInst70 =null;


        AmlTree WHILE65_tree=null;
        AmlTree char_literal66_tree=null;
        AmlTree char_literal68_tree=null;
        AmlTree char_literal69_tree=null;
        AmlTree char_literal71_tree=null;

        try {
            // src/parser/Music.g:110:18: ( WHILE ^ '(' ! expr ')' ! '{' ! listInst '}' !)
            // src/parser/Music.g:110:22: WHILE ^ '(' ! expr ')' ! '{' ! listInst '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            WHILE65=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_stmt1201); 
            WHILE65_tree = 
            (AmlTree)adaptor.create(WHILE65)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(WHILE65_tree, root_0);


            char_literal66=(Token)match(input,77,FOLLOW_77_in_while_stmt1204); 

            pushFollow(FOLLOW_expr_in_while_stmt1207);
            expr67=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr67.getTree());

            char_literal68=(Token)match(input,78,FOLLOW_78_in_while_stmt1209); 

            char_literal69=(Token)match(input,84,FOLLOW_84_in_while_stmt1212); 

            pushFollow(FOLLOW_listInst_in_while_stmt1215);
            listInst70=listInst();

            state._fsp--;

            adaptor.addChild(root_0, listInst70.getTree());

            char_literal71=(Token)match(input,85,FOLLOW_85_in_while_stmt1217); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:113:1: while_music_stmt : WHILE ^ '(' ! expr ')' ! '{' ! list_music_inst '}' !;
    public final MusicParser.while_music_stmt_return while_music_stmt() throws RecognitionException {
        MusicParser.while_music_stmt_return retval = new MusicParser.while_music_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token WHILE72=null;
        Token char_literal73=null;
        Token char_literal75=null;
        Token char_literal76=null;
        Token char_literal78=null;
        MusicParser.expr_return expr74 =null;

        MusicParser.list_music_inst_return list_music_inst77 =null;


        AmlTree WHILE72_tree=null;
        AmlTree char_literal73_tree=null;
        AmlTree char_literal75_tree=null;
        AmlTree char_literal76_tree=null;
        AmlTree char_literal78_tree=null;

        try {
            // src/parser/Music.g:113:24: ( WHILE ^ '(' ! expr ')' ! '{' ! list_music_inst '}' !)
            // src/parser/Music.g:113:28: WHILE ^ '(' ! expr ')' ! '{' ! list_music_inst '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            WHILE72=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_music_stmt1247); 
            WHILE72_tree = 
            (AmlTree)adaptor.create(WHILE72)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(WHILE72_tree, root_0);


            char_literal73=(Token)match(input,77,FOLLOW_77_in_while_music_stmt1250); 

            pushFollow(FOLLOW_expr_in_while_music_stmt1253);
            expr74=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr74.getTree());

            char_literal75=(Token)match(input,78,FOLLOW_78_in_while_music_stmt1255); 

            char_literal76=(Token)match(input,84,FOLLOW_84_in_while_music_stmt1258); 

            pushFollow(FOLLOW_list_music_inst_in_while_music_stmt1261);
            list_music_inst77=list_music_inst();

            state._fsp--;

            adaptor.addChild(root_0, list_music_inst77.getTree());

            char_literal78=(Token)match(input,85,FOLLOW_85_in_while_music_stmt1263); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:116:1: for_stmt : FOR ^ '(' ! ( declaration | list_assig ';' !) expr ';' ! list_assig ')' ! '{' ! listInst '}' !;
    public final MusicParser.for_stmt_return for_stmt() throws RecognitionException {
        MusicParser.for_stmt_return retval = new MusicParser.for_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token FOR79=null;
        Token char_literal80=null;
        Token char_literal83=null;
        Token char_literal85=null;
        Token char_literal87=null;
        Token char_literal88=null;
        Token char_literal90=null;
        MusicParser.declaration_return declaration81 =null;

        MusicParser.list_assig_return list_assig82 =null;

        MusicParser.expr_return expr84 =null;

        MusicParser.list_assig_return list_assig86 =null;

        MusicParser.listInst_return listInst89 =null;


        AmlTree FOR79_tree=null;
        AmlTree char_literal80_tree=null;
        AmlTree char_literal83_tree=null;
        AmlTree char_literal85_tree=null;
        AmlTree char_literal87_tree=null;
        AmlTree char_literal88_tree=null;
        AmlTree char_literal90_tree=null;

        try {
            // src/parser/Music.g:116:13: ( FOR ^ '(' ! ( declaration | list_assig ';' !) expr ';' ! list_assig ')' ! '{' ! listInst '}' !)
            // src/parser/Music.g:116:17: FOR ^ '(' ! ( declaration | list_assig ';' !) expr ';' ! list_assig ')' ! '{' ! listInst '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            FOR79=(Token)match(input,FOR,FOLLOW_FOR_in_for_stmt1290); 
            FOR79_tree = 
            (AmlTree)adaptor.create(FOR79)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(FOR79_tree, root_0);


            char_literal80=(Token)match(input,77,FOLLOW_77_in_for_stmt1293); 

            // src/parser/Music.g:116:27: ( declaration | list_assig ';' !)
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==BOOL||LA17_0==INT) ) {
                alt17=1;
            }
            else if ( (LA17_0==DECR||LA17_0==ID||LA17_0==INCR) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;

            }
            switch (alt17) {
                case 1 :
                    // src/parser/Music.g:116:28: declaration
                    {
                    pushFollow(FOLLOW_declaration_in_for_stmt1297);
                    declaration81=declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, declaration81.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:116:42: list_assig ';' !
                    {
                    pushFollow(FOLLOW_list_assig_in_for_stmt1301);
                    list_assig82=list_assig();

                    state._fsp--;

                    adaptor.addChild(root_0, list_assig82.getTree());

                    char_literal83=(Token)match(input,82,FOLLOW_82_in_for_stmt1303); 

                    }
                    break;

            }


            pushFollow(FOLLOW_expr_in_for_stmt1307);
            expr84=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr84.getTree());

            char_literal85=(Token)match(input,82,FOLLOW_82_in_for_stmt1309); 

            pushFollow(FOLLOW_list_assig_in_for_stmt1312);
            list_assig86=list_assig();

            state._fsp--;

            adaptor.addChild(root_0, list_assig86.getTree());

            char_literal87=(Token)match(input,78,FOLLOW_78_in_for_stmt1314); 

            char_literal88=(Token)match(input,84,FOLLOW_84_in_for_stmt1317); 

            pushFollow(FOLLOW_listInst_in_for_stmt1320);
            listInst89=listInst();

            state._fsp--;

            adaptor.addChild(root_0, listInst89.getTree());

            char_literal90=(Token)match(input,85,FOLLOW_85_in_for_stmt1322); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:119:1: for_music_stmt : FOR ^ '(' ! ( declaration | list_assig ';' !) expr ';' ! list_assig ')' ! '{' ! list_music_inst '}' !;
    public final MusicParser.for_music_stmt_return for_music_stmt() throws RecognitionException {
        MusicParser.for_music_stmt_return retval = new MusicParser.for_music_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token FOR91=null;
        Token char_literal92=null;
        Token char_literal95=null;
        Token char_literal97=null;
        Token char_literal99=null;
        Token char_literal100=null;
        Token char_literal102=null;
        MusicParser.declaration_return declaration93 =null;

        MusicParser.list_assig_return list_assig94 =null;

        MusicParser.expr_return expr96 =null;

        MusicParser.list_assig_return list_assig98 =null;

        MusicParser.list_music_inst_return list_music_inst101 =null;


        AmlTree FOR91_tree=null;
        AmlTree char_literal92_tree=null;
        AmlTree char_literal95_tree=null;
        AmlTree char_literal97_tree=null;
        AmlTree char_literal99_tree=null;
        AmlTree char_literal100_tree=null;
        AmlTree char_literal102_tree=null;

        try {
            // src/parser/Music.g:119:19: ( FOR ^ '(' ! ( declaration | list_assig ';' !) expr ';' ! list_assig ')' ! '{' ! list_music_inst '}' !)
            // src/parser/Music.g:119:23: FOR ^ '(' ! ( declaration | list_assig ';' !) expr ';' ! list_assig ')' ! '{' ! list_music_inst '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            FOR91=(Token)match(input,FOR,FOLLOW_FOR_in_for_music_stmt1349); 
            FOR91_tree = 
            (AmlTree)adaptor.create(FOR91)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(FOR91_tree, root_0);


            char_literal92=(Token)match(input,77,FOLLOW_77_in_for_music_stmt1352); 

            // src/parser/Music.g:119:33: ( declaration | list_assig ';' !)
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==BOOL||LA18_0==INT) ) {
                alt18=1;
            }
            else if ( (LA18_0==DECR||LA18_0==ID||LA18_0==INCR) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }
            switch (alt18) {
                case 1 :
                    // src/parser/Music.g:119:34: declaration
                    {
                    pushFollow(FOLLOW_declaration_in_for_music_stmt1356);
                    declaration93=declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, declaration93.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:119:48: list_assig ';' !
                    {
                    pushFollow(FOLLOW_list_assig_in_for_music_stmt1360);
                    list_assig94=list_assig();

                    state._fsp--;

                    adaptor.addChild(root_0, list_assig94.getTree());

                    char_literal95=(Token)match(input,82,FOLLOW_82_in_for_music_stmt1362); 

                    }
                    break;

            }


            pushFollow(FOLLOW_expr_in_for_music_stmt1366);
            expr96=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr96.getTree());

            char_literal97=(Token)match(input,82,FOLLOW_82_in_for_music_stmt1368); 

            pushFollow(FOLLOW_list_assig_in_for_music_stmt1371);
            list_assig98=list_assig();

            state._fsp--;

            adaptor.addChild(root_0, list_assig98.getTree());

            char_literal99=(Token)match(input,78,FOLLOW_78_in_for_music_stmt1373); 

            char_literal100=(Token)match(input,84,FOLLOW_84_in_for_music_stmt1376); 

            pushFollow(FOLLOW_list_music_inst_in_for_music_stmt1379);
            list_music_inst101=list_music_inst();

            state._fsp--;

            adaptor.addChild(root_0, list_music_inst101.getTree());

            char_literal102=(Token)match(input,85,FOLLOW_85_in_for_music_stmt1381); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:122:1: list_assig : assig ( ',' assig )* -> ^( LIST_ASSIG ( assig )+ ) ;
    public final MusicParser.list_assig_return list_assig() throws RecognitionException {
        MusicParser.list_assig_return retval = new MusicParser.list_assig_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal104=null;
        MusicParser.assig_return assig103 =null;

        MusicParser.assig_return assig105 =null;


        AmlTree char_literal104_tree=null;
        RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
        RewriteRuleSubtreeStream stream_assig=new RewriteRuleSubtreeStream(adaptor,"rule assig");
        try {
            // src/parser/Music.g:122:13: ( assig ( ',' assig )* -> ^( LIST_ASSIG ( assig )+ ) )
            // src/parser/Music.g:122:17: assig ( ',' assig )*
            {
            pushFollow(FOLLOW_assig_in_list_assig1406);
            assig103=assig();

            state._fsp--;

            stream_assig.add(assig103.getTree());

            // src/parser/Music.g:122:23: ( ',' assig )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==79) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // src/parser/Music.g:122:24: ',' assig
            	    {
            	    char_literal104=(Token)match(input,79,FOLLOW_79_in_list_assig1409);  
            	    stream_79.add(char_literal104);


            	    pushFollow(FOLLOW_assig_in_list_assig1411);
            	    assig105=assig();

            	    state._fsp--;

            	    stream_assig.add(assig105.getTree());

            	    }
            	    break;

            	default :
            	    break loop19;
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
            // 122:36: -> ^( LIST_ASSIG ( assig )+ )
            {
                // src/parser/Music.g:122:39: ^( LIST_ASSIG ( assig )+ )
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
    // src/parser/Music.g:125:1: if_stmt : IF ^ '(' ! expr ')' ! '{' ! listInst '}' ! ( elseif_stmt )* ( else_stmt )? ;
    public final MusicParser.if_stmt_return if_stmt() throws RecognitionException {
        MusicParser.if_stmt_return retval = new MusicParser.if_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token IF106=null;
        Token char_literal107=null;
        Token char_literal109=null;
        Token char_literal110=null;
        Token char_literal112=null;
        MusicParser.expr_return expr108 =null;

        MusicParser.listInst_return listInst111 =null;

        MusicParser.elseif_stmt_return elseif_stmt113 =null;

        MusicParser.else_stmt_return else_stmt114 =null;


        AmlTree IF106_tree=null;
        AmlTree char_literal107_tree=null;
        AmlTree char_literal109_tree=null;
        AmlTree char_literal110_tree=null;
        AmlTree char_literal112_tree=null;

        try {
            // src/parser/Music.g:125:13: ( IF ^ '(' ! expr ')' ! '{' ! listInst '}' ! ( elseif_stmt )* ( else_stmt )? )
            // src/parser/Music.g:125:17: IF ^ '(' ! expr ')' ! '{' ! listInst '}' ! ( elseif_stmt )* ( else_stmt )?
            {
            root_0 = (AmlTree)adaptor.nil();


            IF106=(Token)match(input,IF,FOLLOW_IF_in_if_stmt1449); 
            IF106_tree = 
            (AmlTree)adaptor.create(IF106)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(IF106_tree, root_0);


            char_literal107=(Token)match(input,77,FOLLOW_77_in_if_stmt1452); 

            pushFollow(FOLLOW_expr_in_if_stmt1455);
            expr108=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr108.getTree());

            char_literal109=(Token)match(input,78,FOLLOW_78_in_if_stmt1457); 

            char_literal110=(Token)match(input,84,FOLLOW_84_in_if_stmt1460); 

            pushFollow(FOLLOW_listInst_in_if_stmt1463);
            listInst111=listInst();

            state._fsp--;

            adaptor.addChild(root_0, listInst111.getTree());

            char_literal112=(Token)match(input,85,FOLLOW_85_in_if_stmt1465); 

            // src/parser/Music.g:125:55: ( elseif_stmt )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==ELSE) ) {
                    int LA20_1 = input.LA(2);

                    if ( (LA20_1==IF) ) {
                        alt20=1;
                    }


                }


                switch (alt20) {
            	case 1 :
            	    // src/parser/Music.g:125:55: elseif_stmt
            	    {
            	    pushFollow(FOLLOW_elseif_stmt_in_if_stmt1468);
            	    elseif_stmt113=elseif_stmt();

            	    state._fsp--;

            	    adaptor.addChild(root_0, elseif_stmt113.getTree());

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            // src/parser/Music.g:125:68: ( else_stmt )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==ELSE) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // src/parser/Music.g:125:68: else_stmt
                    {
                    pushFollow(FOLLOW_else_stmt_in_if_stmt1471);
                    else_stmt114=else_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, else_stmt114.getTree());

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
    // src/parser/Music.g:128:1: elseif_stmt : ELSE IF '(' expr ')' '{' listInst '}' -> ^( ELSEIF expr listInst ) ;
    public final MusicParser.elseif_stmt_return elseif_stmt() throws RecognitionException {
        MusicParser.elseif_stmt_return retval = new MusicParser.elseif_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token ELSE115=null;
        Token IF116=null;
        Token char_literal117=null;
        Token char_literal119=null;
        Token char_literal120=null;
        Token char_literal122=null;
        MusicParser.expr_return expr118 =null;

        MusicParser.listInst_return listInst121 =null;


        AmlTree ELSE115_tree=null;
        AmlTree IF116_tree=null;
        AmlTree char_literal117_tree=null;
        AmlTree char_literal119_tree=null;
        AmlTree char_literal120_tree=null;
        AmlTree char_literal122_tree=null;
        RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
        RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");
        RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_listInst=new RewriteRuleSubtreeStream(adaptor,"rule listInst");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // src/parser/Music.g:128:13: ( ELSE IF '(' expr ')' '{' listInst '}' -> ^( ELSEIF expr listInst ) )
            // src/parser/Music.g:128:17: ELSE IF '(' expr ')' '{' listInst '}'
            {
            ELSE115=(Token)match(input,ELSE,FOLLOW_ELSE_in_elseif_stmt1495);  
            stream_ELSE.add(ELSE115);


            IF116=(Token)match(input,IF,FOLLOW_IF_in_elseif_stmt1497);  
            stream_IF.add(IF116);


            char_literal117=(Token)match(input,77,FOLLOW_77_in_elseif_stmt1499);  
            stream_77.add(char_literal117);


            pushFollow(FOLLOW_expr_in_elseif_stmt1501);
            expr118=expr();

            state._fsp--;

            stream_expr.add(expr118.getTree());

            char_literal119=(Token)match(input,78,FOLLOW_78_in_elseif_stmt1503);  
            stream_78.add(char_literal119);


            char_literal120=(Token)match(input,84,FOLLOW_84_in_elseif_stmt1505);  
            stream_84.add(char_literal120);


            pushFollow(FOLLOW_listInst_in_elseif_stmt1507);
            listInst121=listInst();

            state._fsp--;

            stream_listInst.add(listInst121.getTree());

            char_literal122=(Token)match(input,85,FOLLOW_85_in_elseif_stmt1509);  
            stream_85.add(char_literal122);


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
            // 128:55: -> ^( ELSEIF expr listInst )
            {
                // src/parser/Music.g:128:58: ^( ELSEIF expr listInst )
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
    // src/parser/Music.g:131:1: else_stmt : ELSE ^ '{' ! listInst '}' !;
    public final MusicParser.else_stmt_return else_stmt() throws RecognitionException {
        MusicParser.else_stmt_return retval = new MusicParser.else_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token ELSE123=null;
        Token char_literal124=null;
        Token char_literal126=null;
        MusicParser.listInst_return listInst125 =null;


        AmlTree ELSE123_tree=null;
        AmlTree char_literal124_tree=null;
        AmlTree char_literal126_tree=null;

        try {
            // src/parser/Music.g:131:13: ( ELSE ^ '{' ! listInst '}' !)
            // src/parser/Music.g:131:17: ELSE ^ '{' ! listInst '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            ELSE123=(Token)match(input,ELSE,FOLLOW_ELSE_in_else_stmt1544); 
            ELSE123_tree = 
            (AmlTree)adaptor.create(ELSE123)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(ELSE123_tree, root_0);


            char_literal124=(Token)match(input,84,FOLLOW_84_in_else_stmt1547); 

            pushFollow(FOLLOW_listInst_in_else_stmt1550);
            listInst125=listInst();

            state._fsp--;

            adaptor.addChild(root_0, listInst125.getTree());

            char_literal126=(Token)match(input,85,FOLLOW_85_in_else_stmt1552); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:134:1: if_music_stmt : IF ^ '(' ! expr ')' ! '{' ! list_music_inst '}' ! ( elseif_music_stmt )* ( else_music_stmt )? ;
    public final MusicParser.if_music_stmt_return if_music_stmt() throws RecognitionException {
        MusicParser.if_music_stmt_return retval = new MusicParser.if_music_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token IF127=null;
        Token char_literal128=null;
        Token char_literal130=null;
        Token char_literal131=null;
        Token char_literal133=null;
        MusicParser.expr_return expr129 =null;

        MusicParser.list_music_inst_return list_music_inst132 =null;

        MusicParser.elseif_music_stmt_return elseif_music_stmt134 =null;

        MusicParser.else_music_stmt_return else_music_stmt135 =null;


        AmlTree IF127_tree=null;
        AmlTree char_literal128_tree=null;
        AmlTree char_literal130_tree=null;
        AmlTree char_literal131_tree=null;
        AmlTree char_literal133_tree=null;

        try {
            // src/parser/Music.g:134:19: ( IF ^ '(' ! expr ')' ! '{' ! list_music_inst '}' ! ( elseif_music_stmt )* ( else_music_stmt )? )
            // src/parser/Music.g:134:23: IF ^ '(' ! expr ')' ! '{' ! list_music_inst '}' ! ( elseif_music_stmt )* ( else_music_stmt )?
            {
            root_0 = (AmlTree)adaptor.nil();


            IF127=(Token)match(input,IF,FOLLOW_IF_in_if_music_stmt1580); 
            IF127_tree = 
            (AmlTree)adaptor.create(IF127)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(IF127_tree, root_0);


            char_literal128=(Token)match(input,77,FOLLOW_77_in_if_music_stmt1583); 

            pushFollow(FOLLOW_expr_in_if_music_stmt1586);
            expr129=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr129.getTree());

            char_literal130=(Token)match(input,78,FOLLOW_78_in_if_music_stmt1588); 

            char_literal131=(Token)match(input,84,FOLLOW_84_in_if_music_stmt1591); 

            pushFollow(FOLLOW_list_music_inst_in_if_music_stmt1594);
            list_music_inst132=list_music_inst();

            state._fsp--;

            adaptor.addChild(root_0, list_music_inst132.getTree());

            char_literal133=(Token)match(input,85,FOLLOW_85_in_if_music_stmt1596); 

            // src/parser/Music.g:134:68: ( elseif_music_stmt )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==ELSE) ) {
                    int LA22_1 = input.LA(2);

                    if ( (LA22_1==IF) ) {
                        alt22=1;
                    }


                }


                switch (alt22) {
            	case 1 :
            	    // src/parser/Music.g:134:68: elseif_music_stmt
            	    {
            	    pushFollow(FOLLOW_elseif_music_stmt_in_if_music_stmt1599);
            	    elseif_music_stmt134=elseif_music_stmt();

            	    state._fsp--;

            	    adaptor.addChild(root_0, elseif_music_stmt134.getTree());

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            // src/parser/Music.g:134:87: ( else_music_stmt )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==ELSE) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // src/parser/Music.g:134:87: else_music_stmt
                    {
                    pushFollow(FOLLOW_else_music_stmt_in_if_music_stmt1602);
                    else_music_stmt135=else_music_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, else_music_stmt135.getTree());

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
    // src/parser/Music.g:137:1: elseif_music_stmt : ELSE IF '(' expr ')' '{' list_music_inst '}' -> ^( ELSEIF expr list_music_inst ) ;
    public final MusicParser.elseif_music_stmt_return elseif_music_stmt() throws RecognitionException {
        MusicParser.elseif_music_stmt_return retval = new MusicParser.elseif_music_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token ELSE136=null;
        Token IF137=null;
        Token char_literal138=null;
        Token char_literal140=null;
        Token char_literal141=null;
        Token char_literal143=null;
        MusicParser.expr_return expr139 =null;

        MusicParser.list_music_inst_return list_music_inst142 =null;


        AmlTree ELSE136_tree=null;
        AmlTree IF137_tree=null;
        AmlTree char_literal138_tree=null;
        AmlTree char_literal140_tree=null;
        AmlTree char_literal141_tree=null;
        AmlTree char_literal143_tree=null;
        RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
        RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");
        RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_list_music_inst=new RewriteRuleSubtreeStream(adaptor,"rule list_music_inst");
        try {
            // src/parser/Music.g:137:19: ( ELSE IF '(' expr ')' '{' list_music_inst '}' -> ^( ELSEIF expr list_music_inst ) )
            // src/parser/Music.g:137:23: ELSE IF '(' expr ')' '{' list_music_inst '}'
            {
            ELSE136=(Token)match(input,ELSE,FOLLOW_ELSE_in_elseif_music_stmt1626);  
            stream_ELSE.add(ELSE136);


            IF137=(Token)match(input,IF,FOLLOW_IF_in_elseif_music_stmt1628);  
            stream_IF.add(IF137);


            char_literal138=(Token)match(input,77,FOLLOW_77_in_elseif_music_stmt1630);  
            stream_77.add(char_literal138);


            pushFollow(FOLLOW_expr_in_elseif_music_stmt1632);
            expr139=expr();

            state._fsp--;

            stream_expr.add(expr139.getTree());

            char_literal140=(Token)match(input,78,FOLLOW_78_in_elseif_music_stmt1634);  
            stream_78.add(char_literal140);


            char_literal141=(Token)match(input,84,FOLLOW_84_in_elseif_music_stmt1636);  
            stream_84.add(char_literal141);


            pushFollow(FOLLOW_list_music_inst_in_elseif_music_stmt1638);
            list_music_inst142=list_music_inst();

            state._fsp--;

            stream_list_music_inst.add(list_music_inst142.getTree());

            char_literal143=(Token)match(input,85,FOLLOW_85_in_elseif_music_stmt1640);  
            stream_85.add(char_literal143);


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
            // 137:68: -> ^( ELSEIF expr list_music_inst )
            {
                // src/parser/Music.g:137:71: ^( ELSEIF expr list_music_inst )
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
    // src/parser/Music.g:140:1: else_music_stmt : ELSE ^ '{' ! list_music_inst '}' !;
    public final MusicParser.else_music_stmt_return else_music_stmt() throws RecognitionException {
        MusicParser.else_music_stmt_return retval = new MusicParser.else_music_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token ELSE144=null;
        Token char_literal145=null;
        Token char_literal147=null;
        MusicParser.list_music_inst_return list_music_inst146 =null;


        AmlTree ELSE144_tree=null;
        AmlTree char_literal145_tree=null;
        AmlTree char_literal147_tree=null;

        try {
            // src/parser/Music.g:140:19: ( ELSE ^ '{' ! list_music_inst '}' !)
            // src/parser/Music.g:140:23: ELSE ^ '{' ! list_music_inst '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            ELSE144=(Token)match(input,ELSE,FOLLOW_ELSE_in_else_music_stmt1675); 
            ELSE144_tree = 
            (AmlTree)adaptor.create(ELSE144)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(ELSE144_tree, root_0);


            char_literal145=(Token)match(input,84,FOLLOW_84_in_else_music_stmt1678); 

            pushFollow(FOLLOW_list_music_inst_in_else_music_stmt1681);
            list_music_inst146=list_music_inst();

            state._fsp--;

            adaptor.addChild(root_0, list_music_inst146.getTree());

            char_literal147=(Token)match(input,85,FOLLOW_85_in_else_music_stmt1683); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:143:1: song : SONG ^ ( ID )? '{' ! beat speed ( transport )? ( track )+ '}' !;
    public final MusicParser.song_return song() throws RecognitionException {
        MusicParser.song_return retval = new MusicParser.song_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token SONG148=null;
        Token ID149=null;
        Token char_literal150=null;
        Token char_literal155=null;
        MusicParser.beat_return beat151 =null;

        MusicParser.speed_return speed152 =null;

        MusicParser.transport_return transport153 =null;

        MusicParser.track_return track154 =null;


        AmlTree SONG148_tree=null;
        AmlTree ID149_tree=null;
        AmlTree char_literal150_tree=null;
        AmlTree char_literal155_tree=null;

        try {
            // src/parser/Music.g:143:13: ( SONG ^ ( ID )? '{' ! beat speed ( transport )? ( track )+ '}' !)
            // src/parser/Music.g:143:17: SONG ^ ( ID )? '{' ! beat speed ( transport )? ( track )+ '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            SONG148=(Token)match(input,SONG,FOLLOW_SONG_in_song1714); 
            SONG148_tree = 
            (AmlTree)adaptor.create(SONG148)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(SONG148_tree, root_0);


            // src/parser/Music.g:143:23: ( ID )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==ID) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // src/parser/Music.g:143:23: ID
                    {
                    ID149=(Token)match(input,ID,FOLLOW_ID_in_song1717); 
                    ID149_tree = 
                    (AmlTree)adaptor.create(ID149)
                    ;
                    adaptor.addChild(root_0, ID149_tree);


                    }
                    break;

            }


            char_literal150=(Token)match(input,84,FOLLOW_84_in_song1720); 

            pushFollow(FOLLOW_beat_in_song1723);
            beat151=beat();

            state._fsp--;

            adaptor.addChild(root_0, beat151.getTree());

            pushFollow(FOLLOW_speed_in_song1725);
            speed152=speed();

            state._fsp--;

            adaptor.addChild(root_0, speed152.getTree());

            // src/parser/Music.g:143:43: ( transport )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==TRANSPORT) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // src/parser/Music.g:143:43: transport
                    {
                    pushFollow(FOLLOW_transport_in_song1727);
                    transport153=transport();

                    state._fsp--;

                    adaptor.addChild(root_0, transport153.getTree());

                    }
                    break;

            }


            // src/parser/Music.g:143:54: ( track )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==TRACK) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // src/parser/Music.g:143:55: track
            	    {
            	    pushFollow(FOLLOW_track_in_song1731);
            	    track154=track();

            	    state._fsp--;

            	    adaptor.addChild(root_0, track154.getTree());

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


            char_literal155=(Token)match(input,85,FOLLOW_85_in_song1735); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:146:1: track : TRACK ^ ( ID )? STRING compas_aux ;
    public final MusicParser.track_return track() throws RecognitionException {
        MusicParser.track_return retval = new MusicParser.track_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token TRACK156=null;
        Token ID157=null;
        Token STRING158=null;
        MusicParser.compas_aux_return compas_aux159 =null;


        AmlTree TRACK156_tree=null;
        AmlTree ID157_tree=null;
        AmlTree STRING158_tree=null;

        try {
            // src/parser/Music.g:146:13: ( TRACK ^ ( ID )? STRING compas_aux )
            // src/parser/Music.g:146:17: TRACK ^ ( ID )? STRING compas_aux
            {
            root_0 = (AmlTree)adaptor.nil();


            TRACK156=(Token)match(input,TRACK,FOLLOW_TRACK_in_track1765); 
            TRACK156_tree = 
            (AmlTree)adaptor.create(TRACK156)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(TRACK156_tree, root_0);


            // src/parser/Music.g:146:24: ( ID )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==ID) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // src/parser/Music.g:146:24: ID
                    {
                    ID157=(Token)match(input,ID,FOLLOW_ID_in_track1768); 
                    ID157_tree = 
                    (AmlTree)adaptor.create(ID157)
                    ;
                    adaptor.addChild(root_0, ID157_tree);


                    }
                    break;

            }


            STRING158=(Token)match(input,STRING,FOLLOW_STRING_in_track1771); 
            STRING158_tree = 
            (AmlTree)adaptor.create(STRING158)
            ;
            adaptor.addChild(root_0, STRING158_tree);


            pushFollow(FOLLOW_compas_aux_in_track1773);
            compas_aux159=compas_aux();

            state._fsp--;

            adaptor.addChild(root_0, compas_aux159.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:149:1: compas_aux : compas_list -> ^( COMPAS_LIST compas_list ) ;
    public final MusicParser.compas_aux_return compas_aux() throws RecognitionException {
        MusicParser.compas_aux_return retval = new MusicParser.compas_aux_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        MusicParser.compas_list_return compas_list160 =null;


        RewriteRuleSubtreeStream stream_compas_list=new RewriteRuleSubtreeStream(adaptor,"rule compas_list");
        try {
            // src/parser/Music.g:149:13: ( compas_list -> ^( COMPAS_LIST compas_list ) )
            // src/parser/Music.g:149:17: compas_list
            {
            pushFollow(FOLLOW_compas_list_in_compas_aux1797);
            compas_list160=compas_list();

            state._fsp--;

            stream_compas_list.add(compas_list160.getTree());

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
            // 149:29: -> ^( COMPAS_LIST compas_list )
            {
                // src/parser/Music.g:149:32: ^( COMPAS_LIST compas_list )
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
    // src/parser/Music.g:152:1: compas_list : ( DOUBLE_BAR !| repetition ) ( compasses | repetition )* ( DOUBLE_BAR !) ;
    public final MusicParser.compas_list_return compas_list() throws RecognitionException {
        MusicParser.compas_list_return retval = new MusicParser.compas_list_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token DOUBLE_BAR161=null;
        Token DOUBLE_BAR165=null;
        MusicParser.repetition_return repetition162 =null;

        MusicParser.compasses_return compasses163 =null;

        MusicParser.repetition_return repetition164 =null;


        AmlTree DOUBLE_BAR161_tree=null;
        AmlTree DOUBLE_BAR165_tree=null;

        try {
            // src/parser/Music.g:152:13: ( ( DOUBLE_BAR !| repetition ) ( compasses | repetition )* ( DOUBLE_BAR !) )
            // src/parser/Music.g:152:15: ( DOUBLE_BAR !| repetition ) ( compasses | repetition )* ( DOUBLE_BAR !)
            {
            root_0 = (AmlTree)adaptor.nil();


            // src/parser/Music.g:152:15: ( DOUBLE_BAR !| repetition )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==DOUBLE_BAR) ) {
                alt28=1;
            }
            else if ( (LA28_0==NUM||LA28_0==START_REPETITION) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;

            }
            switch (alt28) {
                case 1 :
                    // src/parser/Music.g:152:16: DOUBLE_BAR !
                    {
                    DOUBLE_BAR161=(Token)match(input,DOUBLE_BAR,FOLLOW_DOUBLE_BAR_in_compas_list1827); 

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:152:30: repetition
                    {
                    pushFollow(FOLLOW_repetition_in_compas_list1832);
                    repetition162=repetition();

                    state._fsp--;

                    adaptor.addChild(root_0, repetition162.getTree());

                    }
                    break;

            }


            // src/parser/Music.g:152:42: ( compasses | repetition )*
            loop29:
            do {
                int alt29=3;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0 >= BEMOL && LA29_0 <= BOOL)||LA29_0==CHORD||LA29_0==DECR||LA29_0==FOR||(LA29_0 >= ID && LA29_0 <= INT)||LA29_0==NOTE||LA29_0==SONG||LA29_0==SUSTAIN||LA29_0==TONE||LA29_0==WHILE||LA29_0==77) ) {
                    alt29=1;
                }
                else if ( (LA29_0==NUM||LA29_0==START_REPETITION) ) {
                    alt29=2;
                }


                switch (alt29) {
            	case 1 :
            	    // src/parser/Music.g:152:43: compasses
            	    {
            	    pushFollow(FOLLOW_compasses_in_compas_list1836);
            	    compasses163=compasses();

            	    state._fsp--;

            	    adaptor.addChild(root_0, compasses163.getTree());

            	    }
            	    break;
            	case 2 :
            	    // src/parser/Music.g:152:55: repetition
            	    {
            	    pushFollow(FOLLOW_repetition_in_compas_list1840);
            	    repetition164=repetition();

            	    state._fsp--;

            	    adaptor.addChild(root_0, repetition164.getTree());

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            // src/parser/Music.g:152:68: ( DOUBLE_BAR !)
            // src/parser/Music.g:152:69: DOUBLE_BAR !
            {
            DOUBLE_BAR165=(Token)match(input,DOUBLE_BAR,FOLLOW_DOUBLE_BAR_in_compas_list1845); 

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
    // src/parser/Music.g:155:1: compasses : compas ( BAR ! compas )* ;
    public final MusicParser.compasses_return compasses() throws RecognitionException {
        MusicParser.compasses_return retval = new MusicParser.compasses_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token BAR167=null;
        MusicParser.compas_return compas166 =null;

        MusicParser.compas_return compas168 =null;


        AmlTree BAR167_tree=null;

        try {
            // src/parser/Music.g:155:13: ( compas ( BAR ! compas )* )
            // src/parser/Music.g:155:17: compas ( BAR ! compas )*
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_compas_in_compasses1872);
            compas166=compas();

            state._fsp--;

            adaptor.addChild(root_0, compas166.getTree());

            // src/parser/Music.g:155:24: ( BAR ! compas )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==BAR) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // src/parser/Music.g:155:25: BAR ! compas
            	    {
            	    BAR167=(Token)match(input,BAR,FOLLOW_BAR_in_compasses1875); 

            	    pushFollow(FOLLOW_compas_in_compasses1878);
            	    compas168=compas();

            	    state._fsp--;

            	    adaptor.addChild(root_0, compas168.getTree());

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
    // $ANTLR end "compasses"


    public static class repetition_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "repetition"
    // src/parser/Music.g:157:1: repetition : ( NUM 'x' )? START_REPETITION compasses END_REPETITION -> ^( REPETITION NUM compasses ) ;
    public final MusicParser.repetition_return repetition() throws RecognitionException {
        MusicParser.repetition_return retval = new MusicParser.repetition_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token NUM169=null;
        Token char_literal170=null;
        Token START_REPETITION171=null;
        Token END_REPETITION173=null;
        MusicParser.compasses_return compasses172 =null;


        AmlTree NUM169_tree=null;
        AmlTree char_literal170_tree=null;
        AmlTree START_REPETITION171_tree=null;
        AmlTree END_REPETITION173_tree=null;
        RewriteRuleTokenStream stream_NUM=new RewriteRuleTokenStream(adaptor,"token NUM");
        RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
        RewriteRuleTokenStream stream_END_REPETITION=new RewriteRuleTokenStream(adaptor,"token END_REPETITION");
        RewriteRuleTokenStream stream_START_REPETITION=new RewriteRuleTokenStream(adaptor,"token START_REPETITION");
        RewriteRuleSubtreeStream stream_compasses=new RewriteRuleSubtreeStream(adaptor,"rule compasses");
        try {
            // src/parser/Music.g:157:13: ( ( NUM 'x' )? START_REPETITION compasses END_REPETITION -> ^( REPETITION NUM compasses ) )
            // src/parser/Music.g:157:17: ( NUM 'x' )? START_REPETITION compasses END_REPETITION
            {
            // src/parser/Music.g:157:17: ( NUM 'x' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==NUM) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // src/parser/Music.g:157:18: NUM 'x'
                    {
                    NUM169=(Token)match(input,NUM,FOLLOW_NUM_in_repetition1892);  
                    stream_NUM.add(NUM169);


                    char_literal170=(Token)match(input,83,FOLLOW_83_in_repetition1894);  
                    stream_83.add(char_literal170);


                    }
                    break;

            }


            START_REPETITION171=(Token)match(input,START_REPETITION,FOLLOW_START_REPETITION_in_repetition1898);  
            stream_START_REPETITION.add(START_REPETITION171);


            pushFollow(FOLLOW_compasses_in_repetition1900);
            compasses172=compasses();

            state._fsp--;

            stream_compasses.add(compasses172.getTree());

            END_REPETITION173=(Token)match(input,END_REPETITION,FOLLOW_END_REPETITION_in_repetition1902);  
            stream_END_REPETITION.add(END_REPETITION173);


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
            // 157:73: -> ^( REPETITION NUM compasses )
            {
                // src/parser/Music.g:157:76: ^( REPETITION NUM compasses )
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
    // src/parser/Music.g:160:1: compas : ( tone )? ( options {greedy=true; } : music_inst )+ -> ^( COMPAS ( tone )? ( music_inst )+ ) ;
    public final MusicParser.compas_return compas() throws RecognitionException {
        MusicParser.compas_return retval = new MusicParser.compas_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        MusicParser.tone_return tone174 =null;

        MusicParser.music_inst_return music_inst175 =null;


        RewriteRuleSubtreeStream stream_tone=new RewriteRuleSubtreeStream(adaptor,"rule tone");
        RewriteRuleSubtreeStream stream_music_inst=new RewriteRuleSubtreeStream(adaptor,"rule music_inst");
        try {
            // src/parser/Music.g:160:13: ( ( tone )? ( options {greedy=true; } : music_inst )+ -> ^( COMPAS ( tone )? ( music_inst )+ ) )
            // src/parser/Music.g:160:17: ( tone )? ( options {greedy=true; } : music_inst )+
            {
            // src/parser/Music.g:160:17: ( tone )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==TONE) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // src/parser/Music.g:160:17: tone
                    {
                    pushFollow(FOLLOW_tone_in_compas1943);
                    tone174=tone();

                    state._fsp--;

                    stream_tone.add(tone174.getTree());

                    }
                    break;

            }


            // src/parser/Music.g:160:23: ( options {greedy=true; } : music_inst )+
            int cnt33=0;
            loop33:
            do {
                int alt33=2;
                switch ( input.LA(1) ) {
                case BOOL:
                case INT:
                    {
                    alt33=1;
                    }
                    break;
                case ID:
                    {
                    alt33=1;
                    }
                    break;
                case INCR:
                    {
                    alt33=1;
                    }
                    break;
                case DECR:
                    {
                    alt33=1;
                    }
                    break;
                case WHILE:
                    {
                    alt33=1;
                    }
                    break;
                case FOR:
                    {
                    alt33=1;
                    }
                    break;
                case IF:
                    {
                    alt33=1;
                    }
                    break;
                case SONG:
                    {
                    alt33=1;
                    }
                    break;
                case CHORD:
                    {
                    alt33=1;
                    }
                    break;
                case 77:
                    {
                    alt33=1;
                    }
                    break;
                case BEMOL:
                case SUSTAIN:
                    {
                    alt33=1;
                    }
                    break;
                case NOTE:
                    {
                    alt33=1;
                    }
                    break;

                }

                switch (alt33) {
            	case 1 :
            	    // src/parser/Music.g:160:49: music_inst
            	    {
            	    pushFollow(FOLLOW_music_inst_in_compas1956);
            	    music_inst175=music_inst();

            	    state._fsp--;

            	    stream_music_inst.add(music_inst175.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt33 >= 1 ) break loop33;
                        EarlyExitException eee =
                            new EarlyExitException(33, input);
                        throw eee;
                }
                cnt33++;
            } while (true);


            // AST REWRITE
            // elements: music_inst, tone
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AmlTree)adaptor.nil();
            // 160:65: -> ^( COMPAS ( tone )? ( music_inst )+ )
            {
                // src/parser/Music.g:160:68: ^( COMPAS ( tone )? ( music_inst )+ )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(COMPAS, "COMPAS")
                , root_1);

                // src/parser/Music.g:160:77: ( tone )?
                if ( stream_tone.hasNext() ) {
                    adaptor.addChild(root_1, stream_tone.nextTree());

                }
                stream_tone.reset();

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
    // src/parser/Music.g:163:1: tone : TONE ^ NUM ( SUSTAIN | BEMOL ) ;
    public final MusicParser.tone_return tone() throws RecognitionException {
        MusicParser.tone_return retval = new MusicParser.tone_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token TONE176=null;
        Token NUM177=null;
        Token set178=null;

        AmlTree TONE176_tree=null;
        AmlTree NUM177_tree=null;
        AmlTree set178_tree=null;

        try {
            // src/parser/Music.g:163:13: ( TONE ^ NUM ( SUSTAIN | BEMOL ) )
            // src/parser/Music.g:163:17: TONE ^ NUM ( SUSTAIN | BEMOL )
            {
            root_0 = (AmlTree)adaptor.nil();


            TONE176=(Token)match(input,TONE,FOLLOW_TONE_in_tone2003); 
            TONE176_tree = 
            (AmlTree)adaptor.create(TONE176)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(TONE176_tree, root_0);


            NUM177=(Token)match(input,NUM,FOLLOW_NUM_in_tone2006); 
            NUM177_tree = 
            (AmlTree)adaptor.create(NUM177)
            ;
            adaptor.addChild(root_0, NUM177_tree);


            set178=(Token)input.LT(1);

            if ( input.LA(1)==BEMOL||input.LA(1)==SUSTAIN ) {
                input.consume();
                adaptor.addChild(root_0, 
                (AmlTree)adaptor.create(set178)
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
    // src/parser/Music.g:166:1: notes_group : notes_type ( '.' FIGURE )? ( DOT )? ( TIE )? -> ^( NOTE_LIST notes_type ( FIGURE )? ( DOT )? ( TIE )? ) ;
    public final MusicParser.notes_group_return notes_group() throws RecognitionException {
        MusicParser.notes_group_return retval = new MusicParser.notes_group_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal180=null;
        Token FIGURE181=null;
        Token DOT182=null;
        Token TIE183=null;
        MusicParser.notes_type_return notes_type179 =null;


        AmlTree char_literal180_tree=null;
        AmlTree FIGURE181_tree=null;
        AmlTree DOT182_tree=null;
        AmlTree TIE183_tree=null;
        RewriteRuleTokenStream stream_TIE=new RewriteRuleTokenStream(adaptor,"token TIE");
        RewriteRuleTokenStream stream_80=new RewriteRuleTokenStream(adaptor,"token 80");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_FIGURE=new RewriteRuleTokenStream(adaptor,"token FIGURE");
        RewriteRuleSubtreeStream stream_notes_type=new RewriteRuleSubtreeStream(adaptor,"rule notes_type");
        try {
            // src/parser/Music.g:166:13: ( notes_type ( '.' FIGURE )? ( DOT )? ( TIE )? -> ^( NOTE_LIST notes_type ( FIGURE )? ( DOT )? ( TIE )? ) )
            // src/parser/Music.g:166:17: notes_type ( '.' FIGURE )? ( DOT )? ( TIE )?
            {
            pushFollow(FOLLOW_notes_type_in_notes_group2037);
            notes_type179=notes_type();

            state._fsp--;

            stream_notes_type.add(notes_type179.getTree());

            // src/parser/Music.g:166:28: ( '.' FIGURE )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==80) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // src/parser/Music.g:166:29: '.' FIGURE
                    {
                    char_literal180=(Token)match(input,80,FOLLOW_80_in_notes_group2040);  
                    stream_80.add(char_literal180);


                    FIGURE181=(Token)match(input,FIGURE,FOLLOW_FIGURE_in_notes_group2042);  
                    stream_FIGURE.add(FIGURE181);


                    }
                    break;

            }


            // src/parser/Music.g:166:42: ( DOT )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==DOT) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // src/parser/Music.g:166:42: DOT
                    {
                    DOT182=(Token)match(input,DOT,FOLLOW_DOT_in_notes_group2046);  
                    stream_DOT.add(DOT182);


                    }
                    break;

            }


            // src/parser/Music.g:166:47: ( TIE )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==TIE) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // src/parser/Music.g:166:47: TIE
                    {
                    TIE183=(Token)match(input,TIE,FOLLOW_TIE_in_notes_group2049);  
                    stream_TIE.add(TIE183);


                    }
                    break;

            }


            // AST REWRITE
            // elements: TIE, notes_type, DOT, FIGURE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AmlTree)adaptor.nil();
            // 166:52: -> ^( NOTE_LIST notes_type ( FIGURE )? ( DOT )? ( TIE )? )
            {
                // src/parser/Music.g:166:55: ^( NOTE_LIST notes_type ( FIGURE )? ( DOT )? ( TIE )? )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(NOTE_LIST, "NOTE_LIST")
                , root_1);

                adaptor.addChild(root_1, stream_notes_type.nextTree());

                // src/parser/Music.g:166:78: ( FIGURE )?
                if ( stream_FIGURE.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_FIGURE.nextNode()
                    );

                }
                stream_FIGURE.reset();

                // src/parser/Music.g:166:86: ( DOT )?
                if ( stream_DOT.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_DOT.nextNode()
                    );

                }
                stream_DOT.reset();

                // src/parser/Music.g:166:91: ( TIE )?
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
    // src/parser/Music.g:169:1: notes_type : ( chord | notes );
    public final MusicParser.notes_type_return notes_type() throws RecognitionException {
        MusicParser.notes_type_return retval = new MusicParser.notes_type_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        MusicParser.chord_return chord184 =null;

        MusicParser.notes_return notes185 =null;



        try {
            // src/parser/Music.g:169:13: ( chord | notes )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==CHORD) ) {
                alt37=1;
            }
            else if ( (LA37_0==BEMOL||LA37_0==NOTE||LA37_0==SUSTAIN||LA37_0==77) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;

            }
            switch (alt37) {
                case 1 :
                    // src/parser/Music.g:169:15: chord
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_chord_in_notes_type2089);
                    chord184=chord();

                    state._fsp--;

                    adaptor.addChild(root_0, chord184.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:169:23: notes
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_notes_in_notes_type2093);
                    notes185=notes();

                    state._fsp--;

                    adaptor.addChild(root_0, notes185.getTree());

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
    // src/parser/Music.g:171:1: chord : CHORD ^ '(' ! NOTE ( MINOR | PLUS | DIMINUTION )? ( SEVENTH | MAJ7 )? ')' !;
    public final MusicParser.chord_return chord() throws RecognitionException {
        MusicParser.chord_return retval = new MusicParser.chord_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token CHORD186=null;
        Token char_literal187=null;
        Token NOTE188=null;
        Token set189=null;
        Token set190=null;
        Token char_literal191=null;

        AmlTree CHORD186_tree=null;
        AmlTree char_literal187_tree=null;
        AmlTree NOTE188_tree=null;
        AmlTree set189_tree=null;
        AmlTree set190_tree=null;
        AmlTree char_literal191_tree=null;

        try {
            // src/parser/Music.g:171:13: ( CHORD ^ '(' ! NOTE ( MINOR | PLUS | DIMINUTION )? ( SEVENTH | MAJ7 )? ')' !)
            // src/parser/Music.g:171:17: CHORD ^ '(' ! NOTE ( MINOR | PLUS | DIMINUTION )? ( SEVENTH | MAJ7 )? ')' !
            {
            root_0 = (AmlTree)adaptor.nil();


            CHORD186=(Token)match(input,CHORD,FOLLOW_CHORD_in_chord2109); 
            CHORD186_tree = 
            (AmlTree)adaptor.create(CHORD186)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(CHORD186_tree, root_0);


            char_literal187=(Token)match(input,77,FOLLOW_77_in_chord2112); 

            NOTE188=(Token)match(input,NOTE,FOLLOW_NOTE_in_chord2115); 
            NOTE188_tree = 
            (AmlTree)adaptor.create(NOTE188)
            ;
            adaptor.addChild(root_0, NOTE188_tree);


            // src/parser/Music.g:171:34: ( MINOR | PLUS | DIMINUTION )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==DIMINUTION||LA38_0==MINOR||LA38_0==PLUS) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // src/parser/Music.g:
                    {
                    set189=(Token)input.LT(1);

                    if ( input.LA(1)==DIMINUTION||input.LA(1)==MINOR||input.LA(1)==PLUS ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (AmlTree)adaptor.create(set189)
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


            // src/parser/Music.g:171:59: ( SEVENTH | MAJ7 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==MAJ7||LA39_0==SEVENTH) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // src/parser/Music.g:
                    {
                    set190=(Token)input.LT(1);

                    if ( input.LA(1)==MAJ7||input.LA(1)==SEVENTH ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (AmlTree)adaptor.create(set190)
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


            char_literal191=(Token)match(input,78,FOLLOW_78_in_chord2133); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:174:1: notes : ( '(' ( note )+ ')' | note ) -> ^( NOTES ( note )+ ) ;
    public final MusicParser.notes_return notes() throws RecognitionException {
        MusicParser.notes_return retval = new MusicParser.notes_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal192=null;
        Token char_literal194=null;
        MusicParser.note_return note193 =null;

        MusicParser.note_return note195 =null;


        AmlTree char_literal192_tree=null;
        AmlTree char_literal194_tree=null;
        RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
        RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
        RewriteRuleSubtreeStream stream_note=new RewriteRuleSubtreeStream(adaptor,"rule note");
        try {
            // src/parser/Music.g:174:13: ( ( '(' ( note )+ ')' | note ) -> ^( NOTES ( note )+ ) )
            // src/parser/Music.g:174:17: ( '(' ( note )+ ')' | note )
            {
            // src/parser/Music.g:174:17: ( '(' ( note )+ ')' | note )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==77) ) {
                alt41=1;
            }
            else if ( (LA41_0==BEMOL||LA41_0==NOTE||LA41_0==SUSTAIN) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;

            }
            switch (alt41) {
                case 1 :
                    // src/parser/Music.g:174:19: '(' ( note )+ ')'
                    {
                    char_literal192=(Token)match(input,77,FOLLOW_77_in_notes2165);  
                    stream_77.add(char_literal192);


                    // src/parser/Music.g:174:23: ( note )+
                    int cnt40=0;
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==BEMOL||LA40_0==NOTE||LA40_0==SUSTAIN) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // src/parser/Music.g:174:24: note
                    	    {
                    	    pushFollow(FOLLOW_note_in_notes2168);
                    	    note193=note();

                    	    state._fsp--;

                    	    stream_note.add(note193.getTree());

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


                    char_literal194=(Token)match(input,78,FOLLOW_78_in_notes2172);  
                    stream_78.add(char_literal194);


                    }
                    break;
                case 2 :
                    // src/parser/Music.g:174:38: note
                    {
                    pushFollow(FOLLOW_note_in_notes2177);
                    note195=note();

                    state._fsp--;

                    stream_note.add(note195.getTree());

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
            // 174:44: -> ^( NOTES ( note )+ )
            {
                // src/parser/Music.g:174:47: ^( NOTES ( note )+ )
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
    // src/parser/Music.g:177:1: note : ( BEMOL | SUSTAIN )? NOTE ^ ( '-' ! NUM )? ;
    public final MusicParser.note_return note() throws RecognitionException {
        MusicParser.note_return retval = new MusicParser.note_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token set196=null;
        Token NOTE197=null;
        Token char_literal198=null;
        Token NUM199=null;

        AmlTree set196_tree=null;
        AmlTree NOTE197_tree=null;
        AmlTree char_literal198_tree=null;
        AmlTree NUM199_tree=null;

        try {
            // src/parser/Music.g:177:13: ( ( BEMOL | SUSTAIN )? NOTE ^ ( '-' ! NUM )? )
            // src/parser/Music.g:177:17: ( BEMOL | SUSTAIN )? NOTE ^ ( '-' ! NUM )?
            {
            root_0 = (AmlTree)adaptor.nil();


            // src/parser/Music.g:177:17: ( BEMOL | SUSTAIN )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==BEMOL||LA42_0==SUSTAIN) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // src/parser/Music.g:
                    {
                    set196=(Token)input.LT(1);

                    if ( input.LA(1)==BEMOL||input.LA(1)==SUSTAIN ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (AmlTree)adaptor.create(set196)
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


            NOTE197=(Token)match(input,NOTE,FOLLOW_NOTE_in_note2226); 
            NOTE197_tree = 
            (AmlTree)adaptor.create(NOTE197)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(NOTE197_tree, root_0);


            // src/parser/Music.g:177:42: ( '-' ! NUM )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==MINUS) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // src/parser/Music.g:177:43: '-' ! NUM
                    {
                    char_literal198=(Token)match(input,MINUS,FOLLOW_MINUS_in_note2230); 

                    NUM199=(Token)match(input,NUM,FOLLOW_NUM_in_note2233); 
                    NUM199_tree = 
                    (AmlTree)adaptor.create(NUM199)
                    ;
                    adaptor.addChild(root_0, NUM199_tree);


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
    // src/parser/Music.g:181:1: expr : boolterm ( OR ^ boolterm )* ;
    public final MusicParser.expr_return expr() throws RecognitionException {
        MusicParser.expr_return retval = new MusicParser.expr_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token OR201=null;
        MusicParser.boolterm_return boolterm200 =null;

        MusicParser.boolterm_return boolterm202 =null;


        AmlTree OR201_tree=null;

        try {
            // src/parser/Music.g:181:9: ( boolterm ( OR ^ boolterm )* )
            // src/parser/Music.g:181:13: boolterm ( OR ^ boolterm )*
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_boolterm_in_expr2262);
            boolterm200=boolterm();

            state._fsp--;

            adaptor.addChild(root_0, boolterm200.getTree());

            // src/parser/Music.g:181:22: ( OR ^ boolterm )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==OR) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // src/parser/Music.g:181:23: OR ^ boolterm
            	    {
            	    OR201=(Token)match(input,OR,FOLLOW_OR_in_expr2265); 
            	    OR201_tree = 
            	    (AmlTree)adaptor.create(OR201)
            	    ;
            	    root_0 = (AmlTree)adaptor.becomeRoot(OR201_tree, root_0);


            	    pushFollow(FOLLOW_boolterm_in_expr2268);
            	    boolterm202=boolterm();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolterm202.getTree());

            	    }
            	    break;

            	default :
            	    break loop44;
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
    // src/parser/Music.g:184:1: boolterm : boolfact ( AND ^ boolfact )* ;
    public final MusicParser.boolterm_return boolterm() throws RecognitionException {
        MusicParser.boolterm_return retval = new MusicParser.boolterm_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token AND204=null;
        MusicParser.boolfact_return boolfact203 =null;

        MusicParser.boolfact_return boolfact205 =null;


        AmlTree AND204_tree=null;

        try {
            // src/parser/Music.g:184:9: ( boolfact ( AND ^ boolfact )* )
            // src/parser/Music.g:184:13: boolfact ( AND ^ boolfact )*
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_boolfact_in_boolterm2282);
            boolfact203=boolfact();

            state._fsp--;

            adaptor.addChild(root_0, boolfact203.getTree());

            // src/parser/Music.g:184:22: ( AND ^ boolfact )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==AND) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // src/parser/Music.g:184:23: AND ^ boolfact
            	    {
            	    AND204=(Token)match(input,AND,FOLLOW_AND_in_boolterm2285); 
            	    AND204_tree = 
            	    (AmlTree)adaptor.create(AND204)
            	    ;
            	    root_0 = (AmlTree)adaptor.becomeRoot(AND204_tree, root_0);


            	    pushFollow(FOLLOW_boolfact_in_boolterm2288);
            	    boolfact205=boolfact();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolfact205.getTree());

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
    // $ANTLR end "boolterm"


    public static class boolfact_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolfact"
    // src/parser/Music.g:187:1: boolfact : num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? ;
    public final MusicParser.boolfact_return boolfact() throws RecognitionException {
        MusicParser.boolfact_return retval = new MusicParser.boolfact_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token EQUAL207=null;
        Token NOT_EQUAL208=null;
        Token LT209=null;
        Token LE210=null;
        Token GT211=null;
        Token GE212=null;
        MusicParser.num_expr_return num_expr206 =null;

        MusicParser.num_expr_return num_expr213 =null;


        AmlTree EQUAL207_tree=null;
        AmlTree NOT_EQUAL208_tree=null;
        AmlTree LT209_tree=null;
        AmlTree LE210_tree=null;
        AmlTree GT211_tree=null;
        AmlTree GE212_tree=null;

        try {
            // src/parser/Music.g:187:9: ( num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? )
            // src/parser/Music.g:187:13: num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_num_expr_in_boolfact2302);
            num_expr206=num_expr();

            state._fsp--;

            adaptor.addChild(root_0, num_expr206.getTree());

            // src/parser/Music.g:187:22: ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==EQUAL||(LA47_0 >= GE && LA47_0 <= GT)||LA47_0==LE||LA47_0==LT||LA47_0==NOT_EQUAL) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // src/parser/Music.g:187:23: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr
                    {
                    // src/parser/Music.g:187:23: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^)
                    int alt46=6;
                    switch ( input.LA(1) ) {
                    case EQUAL:
                        {
                        alt46=1;
                        }
                        break;
                    case NOT_EQUAL:
                        {
                        alt46=2;
                        }
                        break;
                    case LT:
                        {
                        alt46=3;
                        }
                        break;
                    case LE:
                        {
                        alt46=4;
                        }
                        break;
                    case GT:
                        {
                        alt46=5;
                        }
                        break;
                    case GE:
                        {
                        alt46=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 46, 0, input);

                        throw nvae;

                    }

                    switch (alt46) {
                        case 1 :
                            // src/parser/Music.g:187:24: EQUAL ^
                            {
                            EQUAL207=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_boolfact2306); 
                            EQUAL207_tree = 
                            (AmlTree)adaptor.create(EQUAL207)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(EQUAL207_tree, root_0);


                            }
                            break;
                        case 2 :
                            // src/parser/Music.g:187:33: NOT_EQUAL ^
                            {
                            NOT_EQUAL208=(Token)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_boolfact2311); 
                            NOT_EQUAL208_tree = 
                            (AmlTree)adaptor.create(NOT_EQUAL208)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(NOT_EQUAL208_tree, root_0);


                            }
                            break;
                        case 3 :
                            // src/parser/Music.g:187:46: LT ^
                            {
                            LT209=(Token)match(input,LT,FOLLOW_LT_in_boolfact2316); 
                            LT209_tree = 
                            (AmlTree)adaptor.create(LT209)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(LT209_tree, root_0);


                            }
                            break;
                        case 4 :
                            // src/parser/Music.g:187:52: LE ^
                            {
                            LE210=(Token)match(input,LE,FOLLOW_LE_in_boolfact2321); 
                            LE210_tree = 
                            (AmlTree)adaptor.create(LE210)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(LE210_tree, root_0);


                            }
                            break;
                        case 5 :
                            // src/parser/Music.g:187:58: GT ^
                            {
                            GT211=(Token)match(input,GT,FOLLOW_GT_in_boolfact2326); 
                            GT211_tree = 
                            (AmlTree)adaptor.create(GT211)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(GT211_tree, root_0);


                            }
                            break;
                        case 6 :
                            // src/parser/Music.g:187:64: GE ^
                            {
                            GE212=(Token)match(input,GE,FOLLOW_GE_in_boolfact2331); 
                            GE212_tree = 
                            (AmlTree)adaptor.create(GE212)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(GE212_tree, root_0);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_num_expr_in_boolfact2335);
                    num_expr213=num_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, num_expr213.getTree());

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
    // src/parser/Music.g:190:1: num_expr : term ( ( PLUS ^| MINUS ^) term )* ;
    public final MusicParser.num_expr_return num_expr() throws RecognitionException {
        MusicParser.num_expr_return retval = new MusicParser.num_expr_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token PLUS215=null;
        Token MINUS216=null;
        MusicParser.term_return term214 =null;

        MusicParser.term_return term217 =null;


        AmlTree PLUS215_tree=null;
        AmlTree MINUS216_tree=null;

        try {
            // src/parser/Music.g:190:9: ( term ( ( PLUS ^| MINUS ^) term )* )
            // src/parser/Music.g:190:13: term ( ( PLUS ^| MINUS ^) term )*
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_term_in_num_expr2349);
            term214=term();

            state._fsp--;

            adaptor.addChild(root_0, term214.getTree());

            // src/parser/Music.g:190:18: ( ( PLUS ^| MINUS ^) term )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==MINUS||LA49_0==PLUS) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // src/parser/Music.g:190:20: ( PLUS ^| MINUS ^) term
            	    {
            	    // src/parser/Music.g:190:20: ( PLUS ^| MINUS ^)
            	    int alt48=2;
            	    int LA48_0 = input.LA(1);

            	    if ( (LA48_0==PLUS) ) {
            	        alt48=1;
            	    }
            	    else if ( (LA48_0==MINUS) ) {
            	        alt48=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 48, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt48) {
            	        case 1 :
            	            // src/parser/Music.g:190:21: PLUS ^
            	            {
            	            PLUS215=(Token)match(input,PLUS,FOLLOW_PLUS_in_num_expr2354); 
            	            PLUS215_tree = 
            	            (AmlTree)adaptor.create(PLUS215)
            	            ;
            	            root_0 = (AmlTree)adaptor.becomeRoot(PLUS215_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // src/parser/Music.g:190:29: MINUS ^
            	            {
            	            MINUS216=(Token)match(input,MINUS,FOLLOW_MINUS_in_num_expr2359); 
            	            MINUS216_tree = 
            	            (AmlTree)adaptor.create(MINUS216)
            	            ;
            	            root_0 = (AmlTree)adaptor.becomeRoot(MINUS216_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_term_in_num_expr2363);
            	    term217=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term217.getTree());

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
    // $ANTLR end "num_expr"


    public static class term_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "term"
    // src/parser/Music.g:193:1: term : factor ( ( DOT ^| DIV ^| MOD ^) factor )* ;
    public final MusicParser.term_return term() throws RecognitionException {
        MusicParser.term_return retval = new MusicParser.term_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token DOT219=null;
        Token DIV220=null;
        Token MOD221=null;
        MusicParser.factor_return factor218 =null;

        MusicParser.factor_return factor222 =null;


        AmlTree DOT219_tree=null;
        AmlTree DIV220_tree=null;
        AmlTree MOD221_tree=null;

        try {
            // src/parser/Music.g:193:9: ( factor ( ( DOT ^| DIV ^| MOD ^) factor )* )
            // src/parser/Music.g:193:13: factor ( ( DOT ^| DIV ^| MOD ^) factor )*
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term2381);
            factor218=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor218.getTree());

            // src/parser/Music.g:193:20: ( ( DOT ^| DIV ^| MOD ^) factor )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==DIV||LA51_0==DOT||LA51_0==MOD) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // src/parser/Music.g:193:22: ( DOT ^| DIV ^| MOD ^) factor
            	    {
            	    // src/parser/Music.g:193:22: ( DOT ^| DIV ^| MOD ^)
            	    int alt50=3;
            	    switch ( input.LA(1) ) {
            	    case DOT:
            	        {
            	        alt50=1;
            	        }
            	        break;
            	    case DIV:
            	        {
            	        alt50=2;
            	        }
            	        break;
            	    case MOD:
            	        {
            	        alt50=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 50, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt50) {
            	        case 1 :
            	            // src/parser/Music.g:193:23: DOT ^
            	            {
            	            DOT219=(Token)match(input,DOT,FOLLOW_DOT_in_term2386); 
            	            DOT219_tree = 
            	            (AmlTree)adaptor.create(DOT219)
            	            ;
            	            root_0 = (AmlTree)adaptor.becomeRoot(DOT219_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // src/parser/Music.g:193:30: DIV ^
            	            {
            	            DIV220=(Token)match(input,DIV,FOLLOW_DIV_in_term2391); 
            	            DIV220_tree = 
            	            (AmlTree)adaptor.create(DIV220)
            	            ;
            	            root_0 = (AmlTree)adaptor.becomeRoot(DIV220_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // src/parser/Music.g:193:37: MOD ^
            	            {
            	            MOD221=(Token)match(input,MOD,FOLLOW_MOD_in_term2396); 
            	            MOD221_tree = 
            	            (AmlTree)adaptor.create(MOD221)
            	            ;
            	            root_0 = (AmlTree)adaptor.becomeRoot(MOD221_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_factor_in_term2400);
            	    factor222=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor222.getTree());

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
    // $ANTLR end "term"


    public static class factor_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "factor"
    // src/parser/Music.g:196:1: factor : ( NOT ^| PLUS ^| MINUS ^)? atom ;
    public final MusicParser.factor_return factor() throws RecognitionException {
        MusicParser.factor_return retval = new MusicParser.factor_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token NOT223=null;
        Token PLUS224=null;
        Token MINUS225=null;
        MusicParser.atom_return atom226 =null;


        AmlTree NOT223_tree=null;
        AmlTree PLUS224_tree=null;
        AmlTree MINUS225_tree=null;

        try {
            // src/parser/Music.g:196:9: ( ( NOT ^| PLUS ^| MINUS ^)? atom )
            // src/parser/Music.g:196:13: ( NOT ^| PLUS ^| MINUS ^)? atom
            {
            root_0 = (AmlTree)adaptor.nil();


            // src/parser/Music.g:196:13: ( NOT ^| PLUS ^| MINUS ^)?
            int alt52=4;
            switch ( input.LA(1) ) {
                case NOT:
                    {
                    alt52=1;
                    }
                    break;
                case PLUS:
                    {
                    alt52=2;
                    }
                    break;
                case MINUS:
                    {
                    alt52=3;
                    }
                    break;
            }

            switch (alt52) {
                case 1 :
                    // src/parser/Music.g:196:14: NOT ^
                    {
                    NOT223=(Token)match(input,NOT,FOLLOW_NOT_in_factor2417); 
                    NOT223_tree = 
                    (AmlTree)adaptor.create(NOT223)
                    ;
                    root_0 = (AmlTree)adaptor.becomeRoot(NOT223_tree, root_0);


                    }
                    break;
                case 2 :
                    // src/parser/Music.g:196:21: PLUS ^
                    {
                    PLUS224=(Token)match(input,PLUS,FOLLOW_PLUS_in_factor2422); 
                    PLUS224_tree = 
                    (AmlTree)adaptor.create(PLUS224)
                    ;
                    root_0 = (AmlTree)adaptor.becomeRoot(PLUS224_tree, root_0);


                    }
                    break;
                case 3 :
                    // src/parser/Music.g:196:29: MINUS ^
                    {
                    MINUS225=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor2427); 
                    MINUS225_tree = 
                    (AmlTree)adaptor.create(MINUS225)
                    ;
                    root_0 = (AmlTree)adaptor.becomeRoot(MINUS225_tree, root_0);


                    }
                    break;

            }


            pushFollow(FOLLOW_atom_in_factor2432);
            atom226=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom226.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:199:1: atom : ( ID | NUM | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | '(' ! expr ')' !);
    public final MusicParser.atom_return atom() throws RecognitionException {
        MusicParser.atom_return retval = new MusicParser.atom_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token b=null;
        Token ID227=null;
        Token NUM228=null;
        Token char_literal229=null;
        Token char_literal231=null;
        MusicParser.expr_return expr230 =null;


        AmlTree b_tree=null;
        AmlTree ID227_tree=null;
        AmlTree NUM228_tree=null;
        AmlTree char_literal229_tree=null;
        AmlTree char_literal231_tree=null;
        RewriteRuleTokenStream stream_TRUE=new RewriteRuleTokenStream(adaptor,"token TRUE");
        RewriteRuleTokenStream stream_FALSE=new RewriteRuleTokenStream(adaptor,"token FALSE");

        try {
            // src/parser/Music.g:199:9: ( ID | NUM | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | '(' ! expr ')' !)
            int alt54=4;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt54=1;
                }
                break;
            case NUM:
                {
                alt54=2;
                }
                break;
            case FALSE:
            case TRUE:
                {
                alt54=3;
                }
                break;
            case 77:
                {
                alt54=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;

            }

            switch (alt54) {
                case 1 :
                    // src/parser/Music.g:199:13: ID
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    ID227=(Token)match(input,ID,FOLLOW_ID_in_atom2448); 
                    ID227_tree = 
                    (AmlTree)adaptor.create(ID227)
                    ;
                    adaptor.addChild(root_0, ID227_tree);


                    }
                    break;
                case 2 :
                    // src/parser/Music.g:200:7: NUM
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    NUM228=(Token)match(input,NUM,FOLLOW_NUM_in_atom2456); 
                    NUM228_tree = 
                    (AmlTree)adaptor.create(NUM228)
                    ;
                    adaptor.addChild(root_0, NUM228_tree);


                    }
                    break;
                case 3 :
                    // src/parser/Music.g:201:7: (b= TRUE |b= FALSE )
                    {
                    // src/parser/Music.g:201:7: (b= TRUE |b= FALSE )
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==TRUE) ) {
                        alt53=1;
                    }
                    else if ( (LA53_0==FALSE) ) {
                        alt53=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 53, 0, input);

                        throw nvae;

                    }
                    switch (alt53) {
                        case 1 :
                            // src/parser/Music.g:201:8: b= TRUE
                            {
                            b=(Token)match(input,TRUE,FOLLOW_TRUE_in_atom2467);  
                            stream_TRUE.add(b);


                            }
                            break;
                        case 2 :
                            // src/parser/Music.g:201:17: b= FALSE
                            {
                            b=(Token)match(input,FALSE,FOLLOW_FALSE_in_atom2473);  
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
                    // 201:27: -> ^( BOOLEAN[$b,$b.text] )
                    {
                        // src/parser/Music.g:201:30: ^( BOOLEAN[$b,$b.text] )
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
                    // src/parser/Music.g:202:7: '(' ! expr ')' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    char_literal229=(Token)match(input,77,FOLLOW_77_in_atom2490); 

                    pushFollow(FOLLOW_expr_in_atom2493);
                    expr230=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr230.getTree());

                    char_literal231=(Token)match(input,78,FOLLOW_78_in_atom2495); 

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


 

    public static final BitSet FOLLOW_function_in_prog171 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_EOF_in_prog174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_function211 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_function213 = new BitSet(new long[]{0x0000001000000200L,0x0000000000004000L});
    public static final BitSet FOLLOW_list_arguments_in_function215 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_function217 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_function219 = new BitSet(new long[]{0x0080001E10108200L,0x000000000020080AL});
    public static final BitSet FOLLOW_listInst_in_function221 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_function223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_argument_in_list_arguments262 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_list_arguments265 = new BitSet(new long[]{0x0000001000000200L});
    public static final BitSet FOLLOW_argument_in_list_arguments267 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_set_in_argument309 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ID_in_argument316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_params343 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_params346 = new BitSet(new long[]{0x0284400204000000L,0x0000000000002400L});
    public static final BitSet FOLLOW_expr_in_params349 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_inst_in_listInst363 = new BitSet(new long[]{0x0080001E10108202L,0x000000000000080AL});
    public static final BitSet FOLLOW_music_inst_in_list_music_inst397 = new BitSet(new long[]{0x0008001E10008B02L,0x0000000000002822L});
    public static final BitSet FOLLOW_declaration_in_inst441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignation_in_inst459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_stmt_in_inst477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_inst495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_stmt_in_inst513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_stmt_in_inst531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_song_in_inst549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compas_list_in_inst567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_music_inst591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignation_in_music_inst609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_music_stmt_in_music_inst627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_music_inst645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_music_stmt_in_music_inst663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_music_stmt_in_music_inst681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_song_in_music_inst699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notes_group_in_music_inst726 = new BitSet(new long[]{0x0008000000000902L,0x0000000000042020L});
    public static final BitSet FOLLOW_82_in_music_inst730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_funcall761 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_funcall763 = new BitSet(new long[]{0x0284400204000000L,0x0000000000006400L});
    public static final BitSet FOLLOW_params_in_funcall765 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_funcall768 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_funcall770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_declaration803 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_assig_opt_in_declaration812 = new BitSet(new long[]{0x0000000000000000L,0x0000000000048000L});
    public static final BitSet FOLLOW_79_in_declaration815 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_assig_opt_in_declaration818 = new BitSet(new long[]{0x0000000000000000L,0x0000000000048000L});
    public static final BitSet FOLLOW_82_in_declaration822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assig_opt848 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ASSIG_in_assig_opt851 = new BitSet(new long[]{0x0284400204000000L,0x0000000000002400L});
    public static final BitSet FOLLOW_expr_in_assig_opt854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assig_in_assignation879 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_assignation881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assig911 = new BitSet(new long[]{0x2402800000040020L});
    public static final BitSet FOLLOW_set_in_assig913 = new BitSet(new long[]{0x0284400204000000L,0x0000000000002400L});
    public static final BitSet FOLLOW_expr_in_assig928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_post_in_assig946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pre_in_assig964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_post994 = new BitSet(new long[]{0x0000000800008000L});
    public static final BitSet FOLLOW_INCR_in_post999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECR_in_post1005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INCR_in_pre1052 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_DECR_in_pre1058 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ID_in_pre1061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BEAT_in_beat1104 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_NUM_in_beat1107 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_beat1109 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_NUM_in_beat1112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SPEED_in_speed1141 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_NUM_in_speed1144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRANSPORT_in_transport1169 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_NUM_in_transport1172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_stmt1201 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_while_stmt1204 = new BitSet(new long[]{0x0284400204000000L,0x0000000000002400L});
    public static final BitSet FOLLOW_expr_in_while_stmt1207 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_while_stmt1209 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_while_stmt1212 = new BitSet(new long[]{0x0080001E10108200L,0x000000000020080AL});
    public static final BitSet FOLLOW_listInst_in_while_stmt1215 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_while_stmt1217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_music_stmt1247 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_while_music_stmt1250 = new BitSet(new long[]{0x0284400204000000L,0x0000000000002400L});
    public static final BitSet FOLLOW_expr_in_while_music_stmt1253 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_while_music_stmt1255 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_while_music_stmt1258 = new BitSet(new long[]{0x0008001E10008B00L,0x0000000000202822L});
    public static final BitSet FOLLOW_list_music_inst_in_while_music_stmt1261 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_while_music_stmt1263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_for_stmt1290 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_for_stmt1293 = new BitSet(new long[]{0x0000001A00008200L});
    public static final BitSet FOLLOW_declaration_in_for_stmt1297 = new BitSet(new long[]{0x0284400204000000L,0x0000000000002400L});
    public static final BitSet FOLLOW_list_assig_in_for_stmt1301 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_for_stmt1303 = new BitSet(new long[]{0x0284400204000000L,0x0000000000002400L});
    public static final BitSet FOLLOW_expr_in_for_stmt1307 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_for_stmt1309 = new BitSet(new long[]{0x0000000A00008000L});
    public static final BitSet FOLLOW_list_assig_in_for_stmt1312 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_for_stmt1314 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_for_stmt1317 = new BitSet(new long[]{0x0080001E10108200L,0x000000000020080AL});
    public static final BitSet FOLLOW_listInst_in_for_stmt1320 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_for_stmt1322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_for_music_stmt1349 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_for_music_stmt1352 = new BitSet(new long[]{0x0000001A00008200L});
    public static final BitSet FOLLOW_declaration_in_for_music_stmt1356 = new BitSet(new long[]{0x0284400204000000L,0x0000000000002400L});
    public static final BitSet FOLLOW_list_assig_in_for_music_stmt1360 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_for_music_stmt1362 = new BitSet(new long[]{0x0284400204000000L,0x0000000000002400L});
    public static final BitSet FOLLOW_expr_in_for_music_stmt1366 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_for_music_stmt1368 = new BitSet(new long[]{0x0000000A00008000L});
    public static final BitSet FOLLOW_list_assig_in_for_music_stmt1371 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_for_music_stmt1373 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_for_music_stmt1376 = new BitSet(new long[]{0x0008001E10008B00L,0x0000000000202822L});
    public static final BitSet FOLLOW_list_music_inst_in_for_music_stmt1379 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_for_music_stmt1381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assig_in_list_assig1406 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_list_assig1409 = new BitSet(new long[]{0x0000000A00008000L});
    public static final BitSet FOLLOW_assig_in_list_assig1411 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_IF_in_if_stmt1449 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_if_stmt1452 = new BitSet(new long[]{0x0284400204000000L,0x0000000000002400L});
    public static final BitSet FOLLOW_expr_in_if_stmt1455 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_if_stmt1457 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_if_stmt1460 = new BitSet(new long[]{0x0080001E10108200L,0x000000000020080AL});
    public static final BitSet FOLLOW_listInst_in_if_stmt1463 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_if_stmt1465 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_elseif_stmt_in_if_stmt1468 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_else_stmt_in_if_stmt1471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_elseif_stmt1495 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IF_in_elseif_stmt1497 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_elseif_stmt1499 = new BitSet(new long[]{0x0284400204000000L,0x0000000000002400L});
    public static final BitSet FOLLOW_expr_in_elseif_stmt1501 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_elseif_stmt1503 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_elseif_stmt1505 = new BitSet(new long[]{0x0080001E10108200L,0x000000000020080AL});
    public static final BitSet FOLLOW_listInst_in_elseif_stmt1507 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_elseif_stmt1509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_else_stmt1544 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_else_stmt1547 = new BitSet(new long[]{0x0080001E10108200L,0x000000000020080AL});
    public static final BitSet FOLLOW_listInst_in_else_stmt1550 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_else_stmt1552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_if_music_stmt1580 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_if_music_stmt1583 = new BitSet(new long[]{0x0284400204000000L,0x0000000000002400L});
    public static final BitSet FOLLOW_expr_in_if_music_stmt1586 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_if_music_stmt1588 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_if_music_stmt1591 = new BitSet(new long[]{0x0008001E10008B00L,0x0000000000202822L});
    public static final BitSet FOLLOW_list_music_inst_in_if_music_stmt1594 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_if_music_stmt1596 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_elseif_music_stmt_in_if_music_stmt1599 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_else_music_stmt_in_if_music_stmt1602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_elseif_music_stmt1626 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IF_in_elseif_music_stmt1628 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_elseif_music_stmt1630 = new BitSet(new long[]{0x0284400204000000L,0x0000000000002400L});
    public static final BitSet FOLLOW_expr_in_elseif_music_stmt1632 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_elseif_music_stmt1634 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_elseif_music_stmt1636 = new BitSet(new long[]{0x0008001E10008B00L,0x0000000000202822L});
    public static final BitSet FOLLOW_list_music_inst_in_elseif_music_stmt1638 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_elseif_music_stmt1640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_else_music_stmt1675 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_else_music_stmt1678 = new BitSet(new long[]{0x0008001E10008B00L,0x0000000000202822L});
    public static final BitSet FOLLOW_list_music_inst_in_else_music_stmt1681 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_else_music_stmt1683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SONG_in_song1714 = new BitSet(new long[]{0x0000000200000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_song1717 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_song1720 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_beat_in_song1723 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_speed_in_song1725 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000300L});
    public static final BitSet FOLLOW_transport_in_song1727 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_track_in_song1731 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200100L});
    public static final BitSet FOLLOW_85_in_song1735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRACK_in_track1765 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_track1768 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_STRING_in_track1771 = new BitSet(new long[]{0x0080000000100000L,0x0000000000000008L});
    public static final BitSet FOLLOW_compas_aux_in_track1773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compas_list_in_compas_aux1797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_BAR_in_compas_list1827 = new BitSet(new long[]{0x0088001E10108B00L,0x00000000000028AAL});
    public static final BitSet FOLLOW_repetition_in_compas_list1832 = new BitSet(new long[]{0x0088001E10108B00L,0x00000000000028AAL});
    public static final BitSet FOLLOW_compasses_in_compas_list1836 = new BitSet(new long[]{0x0088001E10108B00L,0x00000000000028AAL});
    public static final BitSet FOLLOW_repetition_in_compas_list1840 = new BitSet(new long[]{0x0088001E10108B00L,0x00000000000028AAL});
    public static final BitSet FOLLOW_DOUBLE_BAR_in_compas_list1845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compas_in_compasses1872 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_BAR_in_compasses1875 = new BitSet(new long[]{0x0008001E10008B00L,0x00000000000028A2L});
    public static final BitSet FOLLOW_compas_in_compasses1878 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_NUM_in_repetition1892 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_repetition1894 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_START_REPETITION_in_repetition1898 = new BitSet(new long[]{0x0008001E10008B00L,0x00000000000028A2L});
    public static final BitSet FOLLOW_compasses_in_repetition1900 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_END_REPETITION_in_repetition1902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tone_in_compas1943 = new BitSet(new long[]{0x0008001E10008B00L,0x0000000000002822L});
    public static final BitSet FOLLOW_music_inst_in_compas1956 = new BitSet(new long[]{0x0008001E10008B02L,0x0000000000002822L});
    public static final BitSet FOLLOW_TONE_in_tone2003 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_NUM_in_tone2006 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000020L});
    public static final BitSet FOLLOW_set_in_tone2008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notes_type_in_notes_group2037 = new BitSet(new long[]{0x0000000000080002L,0x0000000000010040L});
    public static final BitSet FOLLOW_80_in_notes_group2040 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_FIGURE_in_notes_group2042 = new BitSet(new long[]{0x0000000000080002L,0x0000000000000040L});
    public static final BitSet FOLLOW_DOT_in_notes_group2046 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_TIE_in_notes_group2049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_chord_in_notes_type2089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notes_in_notes_type2093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHORD_in_chord2109 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_chord2112 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_NOTE_in_chord2115 = new BitSet(new long[]{0x0200300000010000L,0x0000000000004001L});
    public static final BitSet FOLLOW_78_in_chord2133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_notes2165 = new BitSet(new long[]{0x0008000000000100L,0x0000000000000020L});
    public static final BitSet FOLLOW_note_in_notes2168 = new BitSet(new long[]{0x0008000000000100L,0x0000000000004020L});
    public static final BitSet FOLLOW_78_in_notes2172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_note_in_notes2177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOTE_in_note2226 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_MINUS_in_note2230 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_NUM_in_note2233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolterm_in_expr2262 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_OR_in_expr2265 = new BitSet(new long[]{0x0284400204000000L,0x0000000000002400L});
    public static final BitSet FOLLOW_boolterm_in_expr2268 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_boolfact_in_boolterm2282 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_boolterm2285 = new BitSet(new long[]{0x0284400204000000L,0x0000000000002400L});
    public static final BitSet FOLLOW_boolfact_in_boolterm2288 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_num_expr_in_boolfact2302 = new BitSet(new long[]{0x0040082181000002L});
    public static final BitSet FOLLOW_EQUAL_in_boolfact2306 = new BitSet(new long[]{0x0284400204000000L,0x0000000000002400L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_boolfact2311 = new BitSet(new long[]{0x0284400204000000L,0x0000000000002400L});
    public static final BitSet FOLLOW_LT_in_boolfact2316 = new BitSet(new long[]{0x0284400204000000L,0x0000000000002400L});
    public static final BitSet FOLLOW_LE_in_boolfact2321 = new BitSet(new long[]{0x0284400204000000L,0x0000000000002400L});
    public static final BitSet FOLLOW_GT_in_boolfact2326 = new BitSet(new long[]{0x0284400204000000L,0x0000000000002400L});
    public static final BitSet FOLLOW_GE_in_boolfact2331 = new BitSet(new long[]{0x0284400204000000L,0x0000000000002400L});
    public static final BitSet FOLLOW_num_expr_in_boolfact2335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_num_expr2349 = new BitSet(new long[]{0x0200400000000002L});
    public static final BitSet FOLLOW_PLUS_in_num_expr2354 = new BitSet(new long[]{0x0284400204000000L,0x0000000000002400L});
    public static final BitSet FOLLOW_MINUS_in_num_expr2359 = new BitSet(new long[]{0x0284400204000000L,0x0000000000002400L});
    public static final BitSet FOLLOW_term_in_num_expr2363 = new BitSet(new long[]{0x0200400000000002L});
    public static final BitSet FOLLOW_factor_in_term2381 = new BitSet(new long[]{0x00010000000A0002L});
    public static final BitSet FOLLOW_DOT_in_term2386 = new BitSet(new long[]{0x0284400204000000L,0x0000000000002400L});
    public static final BitSet FOLLOW_DIV_in_term2391 = new BitSet(new long[]{0x0284400204000000L,0x0000000000002400L});
    public static final BitSet FOLLOW_MOD_in_term2396 = new BitSet(new long[]{0x0284400204000000L,0x0000000000002400L});
    public static final BitSet FOLLOW_factor_in_term2400 = new BitSet(new long[]{0x00010000000A0002L});
    public static final BitSet FOLLOW_NOT_in_factor2417 = new BitSet(new long[]{0x0080000204000000L,0x0000000000002400L});
    public static final BitSet FOLLOW_PLUS_in_factor2422 = new BitSet(new long[]{0x0080000204000000L,0x0000000000002400L});
    public static final BitSet FOLLOW_MINUS_in_factor2427 = new BitSet(new long[]{0x0080000204000000L,0x0000000000002400L});
    public static final BitSet FOLLOW_atom_in_factor2432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom2448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUM_in_atom2456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_atom2467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_atom2473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_atom2490 = new BitSet(new long[]{0x0284400204000000L,0x0000000000002400L});
    public static final BitSet FOLLOW_expr_in_atom2493 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_atom2495 = new BitSet(new long[]{0x0000000000000002L});

}