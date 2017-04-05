// $ANTLR 3.4 src/parser/Music.g 2017-04-05 19:30:23

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
        RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
        RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
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
            // elements: list_arguments, listInst
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
    // src/parser/Music.g:46:1: list_arguments : ( argument ( ',' argument )* )? -> ^( LIST_ARGUMENTS ( argument )* ) ;
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
            // src/parser/Music.g:46:17: ( ( argument ( ',' argument )* )? -> ^( LIST_ARGUMENTS ( argument )* ) )
            // src/parser/Music.g:46:19: ( argument ( ',' argument )* )?
            {
            // src/parser/Music.g:46:19: ( argument ( ',' argument )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==BOOL||LA3_0==INT) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // src/parser/Music.g:46:20: argument ( ',' argument )*
                    {
                    pushFollow(FOLLOW_argument_in_list_arguments264);
                    argument9=argument();

                    state._fsp--;

                    stream_argument.add(argument9.getTree());

                    // src/parser/Music.g:46:29: ( ',' argument )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==79) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // src/parser/Music.g:46:30: ',' argument
                    	    {
                    	    char_literal10=(Token)match(input,79,FOLLOW_79_in_list_arguments267);  
                    	    stream_79.add(char_literal10);


                    	    pushFollow(FOLLOW_argument_in_list_arguments269);
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
            // 46:47: -> ^( LIST_ARGUMENTS ( argument )* )
            {
                // src/parser/Music.g:46:50: ^( LIST_ARGUMENTS ( argument )* )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(LIST_ARGUMENTS, "LIST_ARGUMENTS")
                , root_1);

                // src/parser/Music.g:46:67: ( argument )*
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
    // src/parser/Music.g:49:1: argument : ( ( INT | BOOL ) ^ ID ) ;
    public final MusicParser.argument_return argument() throws RecognitionException {
        MusicParser.argument_return retval = new MusicParser.argument_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token set12=null;
        Token ID13=null;

        AmlTree set12_tree=null;
        AmlTree ID13_tree=null;

        try {
            // src/parser/Music.g:49:11: ( ( ( INT | BOOL ) ^ ID ) )
            // src/parser/Music.g:49:15: ( ( INT | BOOL ) ^ ID )
            {
            root_0 = (AmlTree)adaptor.nil();


            // src/parser/Music.g:49:15: ( ( INT | BOOL ) ^ ID )
            // src/parser/Music.g:49:16: ( INT | BOOL ) ^ ID
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


            ID13=(Token)match(input,ID,FOLLOW_ID_in_argument318); 
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
    // src/parser/Music.g:52:1: params : expr ( ',' ! expr )* ;
    public final MusicParser.params_return params() throws RecognitionException {
        MusicParser.params_return retval = new MusicParser.params_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal15=null;
        MusicParser.expr_return expr14 =null;

        MusicParser.expr_return expr16 =null;


        AmlTree char_literal15_tree=null;

        try {
            // src/parser/Music.g:52:13: ( expr ( ',' ! expr )* )
            // src/parser/Music.g:52:17: expr ( ',' ! expr )*
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_expr_in_params345);
            expr14=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr14.getTree());

            // src/parser/Music.g:52:22: ( ',' ! expr )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==79) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // src/parser/Music.g:52:23: ',' ! expr
            	    {
            	    char_literal15=(Token)match(input,79,FOLLOW_79_in_params348); 

            	    pushFollow(FOLLOW_expr_in_params351);
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
    // src/parser/Music.g:54:1: listInst : ( inst )* -> ^( LIST_INSTRUCTIONS ( inst )* ) ;
    public final MusicParser.listInst_return listInst() throws RecognitionException {
        MusicParser.listInst_return retval = new MusicParser.listInst_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        MusicParser.inst_return inst17 =null;


        RewriteRuleSubtreeStream stream_inst=new RewriteRuleSubtreeStream(adaptor,"rule inst");
        try {
            // src/parser/Music.g:54:13: ( ( inst )* -> ^( LIST_INSTRUCTIONS ( inst )* ) )
            // src/parser/Music.g:54:17: ( inst )*
            {
            // src/parser/Music.g:54:17: ( inst )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==BOOL||LA5_0==DECR||LA5_0==FOR||(LA5_0 >= ID && LA5_0 <= INT)||LA5_0==SONG||LA5_0==WHILE) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // src/parser/Music.g:54:18: inst
            	    {
            	    pushFollow(FOLLOW_inst_in_listInst367);
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
            // 54:25: -> ^( LIST_INSTRUCTIONS ( inst )* )
            {
                // src/parser/Music.g:54:28: ^( LIST_INSTRUCTIONS ( inst )* )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(LIST_INSTRUCTIONS, "LIST_INSTRUCTIONS")
                , root_1);

                // src/parser/Music.g:54:48: ( inst )*
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
    // src/parser/Music.g:57:1: list_music_inst : ( music_inst )* -> ^( LIST_MUSIC_INST ( music_inst )* ) ;
    public final MusicParser.list_music_inst_return list_music_inst() throws RecognitionException {
        MusicParser.list_music_inst_return retval = new MusicParser.list_music_inst_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        MusicParser.music_inst_return music_inst18 =null;


        RewriteRuleSubtreeStream stream_music_inst=new RewriteRuleSubtreeStream(adaptor,"rule music_inst");
        try {
            // src/parser/Music.g:57:17: ( ( music_inst )* -> ^( LIST_MUSIC_INST ( music_inst )* ) )
            // src/parser/Music.g:57:21: ( music_inst )*
            {
            // src/parser/Music.g:57:21: ( music_inst )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= BEMOL && LA6_0 <= BOOL)||LA6_0==CHORD||LA6_0==DECR||LA6_0==FOR||(LA6_0 >= ID && LA6_0 <= INT)||LA6_0==NOTE||LA6_0==SONG||LA6_0==SUSTAIN||LA6_0==WHILE||LA6_0==77) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // src/parser/Music.g:57:21: music_inst
            	    {
            	    pushFollow(FOLLOW_music_inst_in_list_music_inst401);
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
            // 57:33: -> ^( LIST_MUSIC_INST ( music_inst )* )
            {
                // src/parser/Music.g:57:36: ^( LIST_MUSIC_INST ( music_inst )* )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(LIST_MUSIC_INST, "LIST_MUSIC_INST")
                , root_1);

                // src/parser/Music.g:57:54: ( music_inst )*
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
    // src/parser/Music.g:60:1: inst : ( declaration | assignation | while_stmt | funcall | for_stmt | if_stmt | song );
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



        try {
            // src/parser/Music.g:60:13: ( declaration | assignation | while_stmt | funcall | for_stmt | if_stmt | song )
            int alt7=7;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }

            switch (alt7) {
                case 1 :
                    // src/parser/Music.g:60:17: declaration
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_declaration_in_inst445);
                    declaration19=declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, declaration19.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:61:17: assignation
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_assignation_in_inst463);
                    assignation20=assignation();

                    state._fsp--;

                    adaptor.addChild(root_0, assignation20.getTree());

                    }
                    break;
                case 3 :
                    // src/parser/Music.g:62:17: while_stmt
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_while_stmt_in_inst481);
                    while_stmt21=while_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, while_stmt21.getTree());

                    }
                    break;
                case 4 :
                    // src/parser/Music.g:63:17: funcall
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_inst499);
                    funcall22=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall22.getTree());

                    }
                    break;
                case 5 :
                    // src/parser/Music.g:64:17: for_stmt
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_for_stmt_in_inst517);
                    for_stmt23=for_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, for_stmt23.getTree());

                    }
                    break;
                case 6 :
                    // src/parser/Music.g:65:17: if_stmt
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_if_stmt_in_inst535);
                    if_stmt24=if_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, if_stmt24.getTree());

                    }
                    break;
                case 7 :
                    // src/parser/Music.g:66:17: song
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_song_in_inst553);
                    song25=song();

                    state._fsp--;

                    adaptor.addChild(root_0, song25.getTree());

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
    // src/parser/Music.g:69:1: music_inst : ( declaration | assignation | while_music_stmt | funcall | for_music_stmt | if_music_stmt | song | ( notes_group )+ ';' !);
    public final MusicParser.music_inst_return music_inst() throws RecognitionException {
        MusicParser.music_inst_return retval = new MusicParser.music_inst_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal34=null;
        MusicParser.declaration_return declaration26 =null;

        MusicParser.assignation_return assignation27 =null;

        MusicParser.while_music_stmt_return while_music_stmt28 =null;

        MusicParser.funcall_return funcall29 =null;

        MusicParser.for_music_stmt_return for_music_stmt30 =null;

        MusicParser.if_music_stmt_return if_music_stmt31 =null;

        MusicParser.song_return song32 =null;

        MusicParser.notes_group_return notes_group33 =null;


        AmlTree char_literal34_tree=null;

        try {
            // src/parser/Music.g:69:13: ( declaration | assignation | while_music_stmt | funcall | for_music_stmt | if_music_stmt | song | ( notes_group )+ ';' !)
            int alt9=8;
            switch ( input.LA(1) ) {
            case BOOL:
            case INT:
                {
                alt9=1;
                }
                break;
            case ID:
                {
                int LA9_2 = input.LA(2);

                if ( (LA9_2==ASSIG||LA9_2==DECR||LA9_2==DIVIDE_ASSIG||LA9_2==INCR||LA9_2==MINUS_ASSIG||LA9_2==MOD_ASSIG||LA9_2==PLUS_ASSIG||LA9_2==PROD_ASSIG) ) {
                    alt9=2;
                }
                else if ( (LA9_2==77) ) {
                    alt9=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 2, input);

                    throw nvae;

                }
                }
                break;
            case DECR:
            case INCR:
                {
                alt9=2;
                }
                break;
            case WHILE:
                {
                alt9=3;
                }
                break;
            case FOR:
                {
                alt9=5;
                }
                break;
            case IF:
                {
                alt9=6;
                }
                break;
            case SONG:
                {
                alt9=7;
                }
                break;
            case BEMOL:
            case CHORD:
            case NOTE:
            case SUSTAIN:
            case 77:
                {
                alt9=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }

            switch (alt9) {
                case 1 :
                    // src/parser/Music.g:69:17: declaration
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_declaration_in_music_inst577);
                    declaration26=declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, declaration26.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:70:17: assignation
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_assignation_in_music_inst595);
                    assignation27=assignation();

                    state._fsp--;

                    adaptor.addChild(root_0, assignation27.getTree());

                    }
                    break;
                case 3 :
                    // src/parser/Music.g:71:17: while_music_stmt
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_while_music_stmt_in_music_inst613);
                    while_music_stmt28=while_music_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, while_music_stmt28.getTree());

                    }
                    break;
                case 4 :
                    // src/parser/Music.g:72:17: funcall
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_music_inst631);
                    funcall29=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall29.getTree());

                    }
                    break;
                case 5 :
                    // src/parser/Music.g:73:17: for_music_stmt
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_for_music_stmt_in_music_inst649);
                    for_music_stmt30=for_music_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, for_music_stmt30.getTree());

                    }
                    break;
                case 6 :
                    // src/parser/Music.g:74:17: if_music_stmt
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_if_music_stmt_in_music_inst667);
                    if_music_stmt31=if_music_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, if_music_stmt31.getTree());

                    }
                    break;
                case 7 :
                    // src/parser/Music.g:75:17: song
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_song_in_music_inst685);
                    song32=song();

                    state._fsp--;

                    adaptor.addChild(root_0, song32.getTree());

                    }
                    break;
                case 8 :
                    // src/parser/Music.g:76:16: ( notes_group )+ ';' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    // src/parser/Music.g:76:16: ( notes_group )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==BEMOL||LA8_0==CHORD||LA8_0==NOTE||LA8_0==SUSTAIN||LA8_0==77) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // src/parser/Music.g:76:16: notes_group
                    	    {
                    	    pushFollow(FOLLOW_notes_group_in_music_inst702);
                    	    notes_group33=notes_group();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, notes_group33.getTree());

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


                    char_literal34=(Token)match(input,82,FOLLOW_82_in_music_inst705); 

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
    // src/parser/Music.g:79:1: funcall : id= ID '(' ( params )? ')' ';' -> ^( FUNCALL[$id.text] ( params )? ) ;
    public final MusicParser.funcall_return funcall() throws RecognitionException {
        MusicParser.funcall_return retval = new MusicParser.funcall_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token id=null;
        Token char_literal35=null;
        Token char_literal37=null;
        Token char_literal38=null;
        MusicParser.params_return params36 =null;


        AmlTree id_tree=null;
        AmlTree char_literal35_tree=null;
        AmlTree char_literal37_tree=null;
        AmlTree char_literal38_tree=null;
        RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
        RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
        RewriteRuleSubtreeStream stream_params=new RewriteRuleSubtreeStream(adaptor,"rule params");
        try {
            // src/parser/Music.g:79:13: (id= ID '(' ( params )? ')' ';' -> ^( FUNCALL[$id.text] ( params )? ) )
            // src/parser/Music.g:79:17: id= ID '(' ( params )? ')' ';'
            {
            id=(Token)match(input,ID,FOLLOW_ID_in_funcall735);  
            stream_ID.add(id);


            char_literal35=(Token)match(input,77,FOLLOW_77_in_funcall737);  
            stream_77.add(char_literal35);


            // src/parser/Music.g:79:27: ( params )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==FALSE||LA10_0==ID||LA10_0==MINUS||LA10_0==NOT||LA10_0==NUM||LA10_0==PLUS||LA10_0==TRUE||LA10_0==77) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // src/parser/Music.g:79:27: params
                    {
                    pushFollow(FOLLOW_params_in_funcall739);
                    params36=params();

                    state._fsp--;

                    stream_params.add(params36.getTree());

                    }
                    break;

            }


            char_literal37=(Token)match(input,78,FOLLOW_78_in_funcall742);  
            stream_78.add(char_literal37);


            char_literal38=(Token)match(input,82,FOLLOW_82_in_funcall744);  
            stream_82.add(char_literal38);


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
            // 79:43: -> ^( FUNCALL[$id.text] ( params )? )
            {
                // src/parser/Music.g:79:46: ^( FUNCALL[$id.text] ( params )? )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(FUNCALL, (id!=null?id.getText():null))
                , root_1);

                // src/parser/Music.g:79:66: ( params )?
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
    // src/parser/Music.g:82:1: declaration : ( INT | BOOL ) ^ assig_opt ( ',' ! assig_opt )* ';' !;
    public final MusicParser.declaration_return declaration() throws RecognitionException {
        MusicParser.declaration_return retval = new MusicParser.declaration_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token set39=null;
        Token char_literal41=null;
        Token char_literal43=null;
        MusicParser.assig_opt_return assig_opt40 =null;

        MusicParser.assig_opt_return assig_opt42 =null;


        AmlTree set39_tree=null;
        AmlTree char_literal41_tree=null;
        AmlTree char_literal43_tree=null;

        try {
            // src/parser/Music.g:82:13: ( ( INT | BOOL ) ^ assig_opt ( ',' ! assig_opt )* ';' !)
            // src/parser/Music.g:82:17: ( INT | BOOL ) ^ assig_opt ( ',' ! assig_opt )* ';' !
            {
            root_0 = (AmlTree)adaptor.nil();


            set39=(Token)input.LT(1);

            set39=(Token)input.LT(1);

            if ( input.LA(1)==BOOL||input.LA(1)==INT ) {
                input.consume();
                root_0 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(set39)
                , root_0);
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            pushFollow(FOLLOW_assig_opt_in_declaration786);
            assig_opt40=assig_opt();

            state._fsp--;

            adaptor.addChild(root_0, assig_opt40.getTree());

            // src/parser/Music.g:82:41: ( ',' ! assig_opt )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==79) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // src/parser/Music.g:82:42: ',' ! assig_opt
            	    {
            	    char_literal41=(Token)match(input,79,FOLLOW_79_in_declaration789); 

            	    pushFollow(FOLLOW_assig_opt_in_declaration792);
            	    assig_opt42=assig_opt();

            	    state._fsp--;

            	    adaptor.addChild(root_0, assig_opt42.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            char_literal43=(Token)match(input,82,FOLLOW_82_in_declaration796); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:85:1: assig_opt : ID ( ASSIG ^ expr )? ;
    public final MusicParser.assig_opt_return assig_opt() throws RecognitionException {
        MusicParser.assig_opt_return retval = new MusicParser.assig_opt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token ID44=null;
        Token ASSIG45=null;
        MusicParser.expr_return expr46 =null;


        AmlTree ID44_tree=null;
        AmlTree ASSIG45_tree=null;

        try {
            // src/parser/Music.g:85:13: ( ID ( ASSIG ^ expr )? )
            // src/parser/Music.g:85:17: ID ( ASSIG ^ expr )?
            {
            root_0 = (AmlTree)adaptor.nil();


            ID44=(Token)match(input,ID,FOLLOW_ID_in_assig_opt822); 
            ID44_tree = 
            (AmlTree)adaptor.create(ID44)
            ;
            adaptor.addChild(root_0, ID44_tree);


            // src/parser/Music.g:85:20: ( ASSIG ^ expr )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==ASSIG) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // src/parser/Music.g:85:21: ASSIG ^ expr
                    {
                    ASSIG45=(Token)match(input,ASSIG,FOLLOW_ASSIG_in_assig_opt825); 
                    ASSIG45_tree = 
                    (AmlTree)adaptor.create(ASSIG45)
                    ;
                    root_0 = (AmlTree)adaptor.becomeRoot(ASSIG45_tree, root_0);


                    pushFollow(FOLLOW_expr_in_assig_opt828);
                    expr46=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr46.getTree());

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
    // src/parser/Music.g:88:1: assignation : assig ';' !;
    public final MusicParser.assignation_return assignation() throws RecognitionException {
        MusicParser.assignation_return retval = new MusicParser.assignation_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal48=null;
        MusicParser.assig_return assig47 =null;


        AmlTree char_literal48_tree=null;

        try {
            // src/parser/Music.g:88:13: ( assig ';' !)
            // src/parser/Music.g:88:17: assig ';' !
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_assig_in_assignation853);
            assig47=assig();

            state._fsp--;

            adaptor.addChild(root_0, assig47.getTree());

            char_literal48=(Token)match(input,82,FOLLOW_82_in_assignation855); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:91:1: assig : ( ID ( ASSIG | PLUS_ASSIG | MINUS_ASSIG | PROD_ASSIG | DIVIDE_ASSIG | MOD_ASSIG ) ^ expr | post | pre );
    public final MusicParser.assig_return assig() throws RecognitionException {
        MusicParser.assig_return retval = new MusicParser.assig_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token ID49=null;
        Token set50=null;
        MusicParser.expr_return expr51 =null;

        MusicParser.post_return post52 =null;

        MusicParser.pre_return pre53 =null;


        AmlTree ID49_tree=null;
        AmlTree set50_tree=null;

        try {
            // src/parser/Music.g:91:13: ( ID ( ASSIG | PLUS_ASSIG | MINUS_ASSIG | PROD_ASSIG | DIVIDE_ASSIG | MOD_ASSIG ) ^ expr | post | pre )
            int alt13=3;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==ID) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==ASSIG||LA13_1==DIVIDE_ASSIG||LA13_1==MINUS_ASSIG||LA13_1==MOD_ASSIG||LA13_1==PLUS_ASSIG||LA13_1==PROD_ASSIG) ) {
                    alt13=1;
                }
                else if ( (LA13_1==DECR||LA13_1==INCR) ) {
                    alt13=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA13_0==DECR||LA13_0==INCR) ) {
                alt13=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }
            switch (alt13) {
                case 1 :
                    // src/parser/Music.g:91:17: ID ( ASSIG | PLUS_ASSIG | MINUS_ASSIG | PROD_ASSIG | DIVIDE_ASSIG | MOD_ASSIG ) ^ expr
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    ID49=(Token)match(input,ID,FOLLOW_ID_in_assig885); 
                    ID49_tree = 
                    (AmlTree)adaptor.create(ID49)
                    ;
                    adaptor.addChild(root_0, ID49_tree);


                    set50=(Token)input.LT(1);

                    set50=(Token)input.LT(1);

                    if ( input.LA(1)==ASSIG||input.LA(1)==DIVIDE_ASSIG||input.LA(1)==MINUS_ASSIG||input.LA(1)==MOD_ASSIG||input.LA(1)==PLUS_ASSIG||input.LA(1)==PROD_ASSIG ) {
                        input.consume();
                        root_0 = (AmlTree)adaptor.becomeRoot(
                        (AmlTree)adaptor.create(set50)
                        , root_0);
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_expr_in_assig902);
                    expr51=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr51.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:92:17: post
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_post_in_assig920);
                    post52=post();

                    state._fsp--;

                    adaptor.addChild(root_0, post52.getTree());

                    }
                    break;
                case 3 :
                    // src/parser/Music.g:93:17: pre
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_pre_in_assig938);
                    pre53=pre();

                    state._fsp--;

                    adaptor.addChild(root_0, pre53.getTree());

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
    // src/parser/Music.g:96:1: post : ID (x= INCR |x= DECR ) -> ^( POST ID $x) ;
    public final MusicParser.post_return post() throws RecognitionException {
        MusicParser.post_return retval = new MusicParser.post_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token x=null;
        Token ID54=null;

        AmlTree x_tree=null;
        AmlTree ID54_tree=null;
        RewriteRuleTokenStream stream_DECR=new RewriteRuleTokenStream(adaptor,"token DECR");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_INCR=new RewriteRuleTokenStream(adaptor,"token INCR");

        try {
            // src/parser/Music.g:96:13: ( ID (x= INCR |x= DECR ) -> ^( POST ID $x) )
            // src/parser/Music.g:96:17: ID (x= INCR |x= DECR )
            {
            ID54=(Token)match(input,ID,FOLLOW_ID_in_post968);  
            stream_ID.add(ID54);


            // src/parser/Music.g:96:20: (x= INCR |x= DECR )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==INCR) ) {
                alt14=1;
            }
            else if ( (LA14_0==DECR) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }
            switch (alt14) {
                case 1 :
                    // src/parser/Music.g:96:21: x= INCR
                    {
                    x=(Token)match(input,INCR,FOLLOW_INCR_in_post973);  
                    stream_INCR.add(x);


                    }
                    break;
                case 2 :
                    // src/parser/Music.g:96:30: x= DECR
                    {
                    x=(Token)match(input,DECR,FOLLOW_DECR_in_post979);  
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
            // 96:38: -> ^( POST ID $x)
            {
                // src/parser/Music.g:96:42: ^( POST ID $x)
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
    // src/parser/Music.g:99:1: pre : (x= INCR |x= DECR ) ID -> ^( PRE ID $x) ;
    public final MusicParser.pre_return pre() throws RecognitionException {
        MusicParser.pre_return retval = new MusicParser.pre_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token x=null;
        Token ID55=null;

        AmlTree x_tree=null;
        AmlTree ID55_tree=null;
        RewriteRuleTokenStream stream_DECR=new RewriteRuleTokenStream(adaptor,"token DECR");
        RewriteRuleTokenStream stream_INCR=new RewriteRuleTokenStream(adaptor,"token INCR");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // src/parser/Music.g:99:13: ( (x= INCR |x= DECR ) ID -> ^( PRE ID $x) )
            // src/parser/Music.g:99:17: (x= INCR |x= DECR ) ID
            {
            // src/parser/Music.g:99:17: (x= INCR |x= DECR )
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
                    // src/parser/Music.g:99:18: x= INCR
                    {
                    x=(Token)match(input,INCR,FOLLOW_INCR_in_pre1026);  
                    stream_INCR.add(x);


                    }
                    break;
                case 2 :
                    // src/parser/Music.g:99:27: x= DECR
                    {
                    x=(Token)match(input,DECR,FOLLOW_DECR_in_pre1032);  
                    stream_DECR.add(x);


                    }
                    break;

            }


            ID55=(Token)match(input,ID,FOLLOW_ID_in_pre1035);  
            stream_ID.add(ID55);


            // AST REWRITE
            // elements: ID, x
            // token labels: x
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_x=new RewriteRuleTokenStream(adaptor,"token x",x);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AmlTree)adaptor.nil();
            // 99:39: -> ^( PRE ID $x)
            {
                // src/parser/Music.g:99:42: ^( PRE ID $x)
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
    // src/parser/Music.g:102:1: beat : BEAT ^ NUM ':' ! NUM ;
    public final MusicParser.beat_return beat() throws RecognitionException {
        MusicParser.beat_return retval = new MusicParser.beat_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token BEAT56=null;
        Token NUM57=null;
        Token char_literal58=null;
        Token NUM59=null;

        AmlTree BEAT56_tree=null;
        AmlTree NUM57_tree=null;
        AmlTree char_literal58_tree=null;
        AmlTree NUM59_tree=null;

        try {
            // src/parser/Music.g:102:13: ( BEAT ^ NUM ':' ! NUM )
            // src/parser/Music.g:102:17: BEAT ^ NUM ':' ! NUM
            {
            root_0 = (AmlTree)adaptor.nil();


            BEAT56=(Token)match(input,BEAT,FOLLOW_BEAT_in_beat1078); 
            BEAT56_tree = 
            (AmlTree)adaptor.create(BEAT56)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(BEAT56_tree, root_0);


            NUM57=(Token)match(input,NUM,FOLLOW_NUM_in_beat1081); 
            NUM57_tree = 
            (AmlTree)adaptor.create(NUM57)
            ;
            adaptor.addChild(root_0, NUM57_tree);


            char_literal58=(Token)match(input,81,FOLLOW_81_in_beat1083); 

            NUM59=(Token)match(input,NUM,FOLLOW_NUM_in_beat1086); 
            NUM59_tree = 
            (AmlTree)adaptor.create(NUM59)
            ;
            adaptor.addChild(root_0, NUM59_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:105:1: speed : SPEED ^ NUM ;
    public final MusicParser.speed_return speed() throws RecognitionException {
        MusicParser.speed_return retval = new MusicParser.speed_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token SPEED60=null;
        Token NUM61=null;

        AmlTree SPEED60_tree=null;
        AmlTree NUM61_tree=null;

        try {
            // src/parser/Music.g:105:13: ( SPEED ^ NUM )
            // src/parser/Music.g:105:17: SPEED ^ NUM
            {
            root_0 = (AmlTree)adaptor.nil();


            SPEED60=(Token)match(input,SPEED,FOLLOW_SPEED_in_speed1115); 
            SPEED60_tree = 
            (AmlTree)adaptor.create(SPEED60)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(SPEED60_tree, root_0);


            NUM61=(Token)match(input,NUM,FOLLOW_NUM_in_speed1118); 
            NUM61_tree = 
            (AmlTree)adaptor.create(NUM61)
            ;
            adaptor.addChild(root_0, NUM61_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:108:1: transport : TRANSPORT ^ NUM ;
    public final MusicParser.transport_return transport() throws RecognitionException {
        MusicParser.transport_return retval = new MusicParser.transport_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token TRANSPORT62=null;
        Token NUM63=null;

        AmlTree TRANSPORT62_tree=null;
        AmlTree NUM63_tree=null;

        try {
            // src/parser/Music.g:108:13: ( TRANSPORT ^ NUM )
            // src/parser/Music.g:108:17: TRANSPORT ^ NUM
            {
            root_0 = (AmlTree)adaptor.nil();


            TRANSPORT62=(Token)match(input,TRANSPORT,FOLLOW_TRANSPORT_in_transport1143); 
            TRANSPORT62_tree = 
            (AmlTree)adaptor.create(TRANSPORT62)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(TRANSPORT62_tree, root_0);


            NUM63=(Token)match(input,NUM,FOLLOW_NUM_in_transport1146); 
            NUM63_tree = 
            (AmlTree)adaptor.create(NUM63)
            ;
            adaptor.addChild(root_0, NUM63_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:111:1: while_stmt : WHILE ^ '(' ! expr ')' ! '{' ! listInst '}' !;
    public final MusicParser.while_stmt_return while_stmt() throws RecognitionException {
        MusicParser.while_stmt_return retval = new MusicParser.while_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token WHILE64=null;
        Token char_literal65=null;
        Token char_literal67=null;
        Token char_literal68=null;
        Token char_literal70=null;
        MusicParser.expr_return expr66 =null;

        MusicParser.listInst_return listInst69 =null;


        AmlTree WHILE64_tree=null;
        AmlTree char_literal65_tree=null;
        AmlTree char_literal67_tree=null;
        AmlTree char_literal68_tree=null;
        AmlTree char_literal70_tree=null;

        try {
            // src/parser/Music.g:111:18: ( WHILE ^ '(' ! expr ')' ! '{' ! listInst '}' !)
            // src/parser/Music.g:111:22: WHILE ^ '(' ! expr ')' ! '{' ! listInst '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            WHILE64=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_stmt1175); 
            WHILE64_tree = 
            (AmlTree)adaptor.create(WHILE64)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(WHILE64_tree, root_0);


            char_literal65=(Token)match(input,77,FOLLOW_77_in_while_stmt1178); 

            pushFollow(FOLLOW_expr_in_while_stmt1181);
            expr66=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr66.getTree());

            char_literal67=(Token)match(input,78,FOLLOW_78_in_while_stmt1183); 

            char_literal68=(Token)match(input,84,FOLLOW_84_in_while_stmt1186); 

            pushFollow(FOLLOW_listInst_in_while_stmt1189);
            listInst69=listInst();

            state._fsp--;

            adaptor.addChild(root_0, listInst69.getTree());

            char_literal70=(Token)match(input,85,FOLLOW_85_in_while_stmt1191); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:114:1: while_music_stmt : WHILE ^ '(' ! expr ')' ! '{' ! list_music_inst '}' !;
    public final MusicParser.while_music_stmt_return while_music_stmt() throws RecognitionException {
        MusicParser.while_music_stmt_return retval = new MusicParser.while_music_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token WHILE71=null;
        Token char_literal72=null;
        Token char_literal74=null;
        Token char_literal75=null;
        Token char_literal77=null;
        MusicParser.expr_return expr73 =null;

        MusicParser.list_music_inst_return list_music_inst76 =null;


        AmlTree WHILE71_tree=null;
        AmlTree char_literal72_tree=null;
        AmlTree char_literal74_tree=null;
        AmlTree char_literal75_tree=null;
        AmlTree char_literal77_tree=null;

        try {
            // src/parser/Music.g:114:24: ( WHILE ^ '(' ! expr ')' ! '{' ! list_music_inst '}' !)
            // src/parser/Music.g:114:28: WHILE ^ '(' ! expr ')' ! '{' ! list_music_inst '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            WHILE71=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_music_stmt1221); 
            WHILE71_tree = 
            (AmlTree)adaptor.create(WHILE71)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(WHILE71_tree, root_0);


            char_literal72=(Token)match(input,77,FOLLOW_77_in_while_music_stmt1224); 

            pushFollow(FOLLOW_expr_in_while_music_stmt1227);
            expr73=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr73.getTree());

            char_literal74=(Token)match(input,78,FOLLOW_78_in_while_music_stmt1229); 

            char_literal75=(Token)match(input,84,FOLLOW_84_in_while_music_stmt1232); 

            pushFollow(FOLLOW_list_music_inst_in_while_music_stmt1235);
            list_music_inst76=list_music_inst();

            state._fsp--;

            adaptor.addChild(root_0, list_music_inst76.getTree());

            char_literal77=(Token)match(input,85,FOLLOW_85_in_while_music_stmt1237); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:117:1: for_stmt : FOR ^ '(' ! ( declaration | list_assig ';' !) expr ';' ! list_assig ')' ! '{' ! listInst '}' !;
    public final MusicParser.for_stmt_return for_stmt() throws RecognitionException {
        MusicParser.for_stmt_return retval = new MusicParser.for_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token FOR78=null;
        Token char_literal79=null;
        Token char_literal82=null;
        Token char_literal84=null;
        Token char_literal86=null;
        Token char_literal87=null;
        Token char_literal89=null;
        MusicParser.declaration_return declaration80 =null;

        MusicParser.list_assig_return list_assig81 =null;

        MusicParser.expr_return expr83 =null;

        MusicParser.list_assig_return list_assig85 =null;

        MusicParser.listInst_return listInst88 =null;


        AmlTree FOR78_tree=null;
        AmlTree char_literal79_tree=null;
        AmlTree char_literal82_tree=null;
        AmlTree char_literal84_tree=null;
        AmlTree char_literal86_tree=null;
        AmlTree char_literal87_tree=null;
        AmlTree char_literal89_tree=null;

        try {
            // src/parser/Music.g:117:13: ( FOR ^ '(' ! ( declaration | list_assig ';' !) expr ';' ! list_assig ')' ! '{' ! listInst '}' !)
            // src/parser/Music.g:117:17: FOR ^ '(' ! ( declaration | list_assig ';' !) expr ';' ! list_assig ')' ! '{' ! listInst '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            FOR78=(Token)match(input,FOR,FOLLOW_FOR_in_for_stmt1264); 
            FOR78_tree = 
            (AmlTree)adaptor.create(FOR78)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(FOR78_tree, root_0);


            char_literal79=(Token)match(input,77,FOLLOW_77_in_for_stmt1267); 

            // src/parser/Music.g:117:27: ( declaration | list_assig ';' !)
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==BOOL||LA16_0==INT) ) {
                alt16=1;
            }
            else if ( (LA16_0==DECR||LA16_0==ID||LA16_0==INCR) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }
            switch (alt16) {
                case 1 :
                    // src/parser/Music.g:117:28: declaration
                    {
                    pushFollow(FOLLOW_declaration_in_for_stmt1271);
                    declaration80=declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, declaration80.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:117:42: list_assig ';' !
                    {
                    pushFollow(FOLLOW_list_assig_in_for_stmt1275);
                    list_assig81=list_assig();

                    state._fsp--;

                    adaptor.addChild(root_0, list_assig81.getTree());

                    char_literal82=(Token)match(input,82,FOLLOW_82_in_for_stmt1277); 

                    }
                    break;

            }


            pushFollow(FOLLOW_expr_in_for_stmt1281);
            expr83=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr83.getTree());

            char_literal84=(Token)match(input,82,FOLLOW_82_in_for_stmt1283); 

            pushFollow(FOLLOW_list_assig_in_for_stmt1286);
            list_assig85=list_assig();

            state._fsp--;

            adaptor.addChild(root_0, list_assig85.getTree());

            char_literal86=(Token)match(input,78,FOLLOW_78_in_for_stmt1288); 

            char_literal87=(Token)match(input,84,FOLLOW_84_in_for_stmt1291); 

            pushFollow(FOLLOW_listInst_in_for_stmt1294);
            listInst88=listInst();

            state._fsp--;

            adaptor.addChild(root_0, listInst88.getTree());

            char_literal89=(Token)match(input,85,FOLLOW_85_in_for_stmt1296); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:120:1: for_music_stmt : FOR ^ '(' ! ( declaration | list_assig ';' !) expr ';' ! list_assig ')' ! '{' ! list_music_inst '}' !;
    public final MusicParser.for_music_stmt_return for_music_stmt() throws RecognitionException {
        MusicParser.for_music_stmt_return retval = new MusicParser.for_music_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token FOR90=null;
        Token char_literal91=null;
        Token char_literal94=null;
        Token char_literal96=null;
        Token char_literal98=null;
        Token char_literal99=null;
        Token char_literal101=null;
        MusicParser.declaration_return declaration92 =null;

        MusicParser.list_assig_return list_assig93 =null;

        MusicParser.expr_return expr95 =null;

        MusicParser.list_assig_return list_assig97 =null;

        MusicParser.list_music_inst_return list_music_inst100 =null;


        AmlTree FOR90_tree=null;
        AmlTree char_literal91_tree=null;
        AmlTree char_literal94_tree=null;
        AmlTree char_literal96_tree=null;
        AmlTree char_literal98_tree=null;
        AmlTree char_literal99_tree=null;
        AmlTree char_literal101_tree=null;

        try {
            // src/parser/Music.g:120:19: ( FOR ^ '(' ! ( declaration | list_assig ';' !) expr ';' ! list_assig ')' ! '{' ! list_music_inst '}' !)
            // src/parser/Music.g:120:23: FOR ^ '(' ! ( declaration | list_assig ';' !) expr ';' ! list_assig ')' ! '{' ! list_music_inst '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            FOR90=(Token)match(input,FOR,FOLLOW_FOR_in_for_music_stmt1323); 
            FOR90_tree = 
            (AmlTree)adaptor.create(FOR90)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(FOR90_tree, root_0);


            char_literal91=(Token)match(input,77,FOLLOW_77_in_for_music_stmt1326); 

            // src/parser/Music.g:120:33: ( declaration | list_assig ';' !)
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
                    // src/parser/Music.g:120:34: declaration
                    {
                    pushFollow(FOLLOW_declaration_in_for_music_stmt1330);
                    declaration92=declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, declaration92.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:120:48: list_assig ';' !
                    {
                    pushFollow(FOLLOW_list_assig_in_for_music_stmt1334);
                    list_assig93=list_assig();

                    state._fsp--;

                    adaptor.addChild(root_0, list_assig93.getTree());

                    char_literal94=(Token)match(input,82,FOLLOW_82_in_for_music_stmt1336); 

                    }
                    break;

            }


            pushFollow(FOLLOW_expr_in_for_music_stmt1340);
            expr95=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr95.getTree());

            char_literal96=(Token)match(input,82,FOLLOW_82_in_for_music_stmt1342); 

            pushFollow(FOLLOW_list_assig_in_for_music_stmt1345);
            list_assig97=list_assig();

            state._fsp--;

            adaptor.addChild(root_0, list_assig97.getTree());

            char_literal98=(Token)match(input,78,FOLLOW_78_in_for_music_stmt1347); 

            char_literal99=(Token)match(input,84,FOLLOW_84_in_for_music_stmt1350); 

            pushFollow(FOLLOW_list_music_inst_in_for_music_stmt1353);
            list_music_inst100=list_music_inst();

            state._fsp--;

            adaptor.addChild(root_0, list_music_inst100.getTree());

            char_literal101=(Token)match(input,85,FOLLOW_85_in_for_music_stmt1355); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:123:1: list_assig : assig ( ',' assig )* -> ^( LIST_ASSIG ( assig )+ ) ;
    public final MusicParser.list_assig_return list_assig() throws RecognitionException {
        MusicParser.list_assig_return retval = new MusicParser.list_assig_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal103=null;
        MusicParser.assig_return assig102 =null;

        MusicParser.assig_return assig104 =null;


        AmlTree char_literal103_tree=null;
        RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
        RewriteRuleSubtreeStream stream_assig=new RewriteRuleSubtreeStream(adaptor,"rule assig");
        try {
            // src/parser/Music.g:123:13: ( assig ( ',' assig )* -> ^( LIST_ASSIG ( assig )+ ) )
            // src/parser/Music.g:123:17: assig ( ',' assig )*
            {
            pushFollow(FOLLOW_assig_in_list_assig1380);
            assig102=assig();

            state._fsp--;

            stream_assig.add(assig102.getTree());

            // src/parser/Music.g:123:23: ( ',' assig )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==79) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // src/parser/Music.g:123:24: ',' assig
            	    {
            	    char_literal103=(Token)match(input,79,FOLLOW_79_in_list_assig1383);  
            	    stream_79.add(char_literal103);


            	    pushFollow(FOLLOW_assig_in_list_assig1385);
            	    assig104=assig();

            	    state._fsp--;

            	    stream_assig.add(assig104.getTree());

            	    }
            	    break;

            	default :
            	    break loop18;
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
            // 123:36: -> ^( LIST_ASSIG ( assig )+ )
            {
                // src/parser/Music.g:123:39: ^( LIST_ASSIG ( assig )+ )
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
    // src/parser/Music.g:126:1: if_stmt : IF ^ '(' ! expr ')' ! '{' ! listInst '}' ! ( elseif_stmt )* ( else_stmt )? ;
    public final MusicParser.if_stmt_return if_stmt() throws RecognitionException {
        MusicParser.if_stmt_return retval = new MusicParser.if_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token IF105=null;
        Token char_literal106=null;
        Token char_literal108=null;
        Token char_literal109=null;
        Token char_literal111=null;
        MusicParser.expr_return expr107 =null;

        MusicParser.listInst_return listInst110 =null;

        MusicParser.elseif_stmt_return elseif_stmt112 =null;

        MusicParser.else_stmt_return else_stmt113 =null;


        AmlTree IF105_tree=null;
        AmlTree char_literal106_tree=null;
        AmlTree char_literal108_tree=null;
        AmlTree char_literal109_tree=null;
        AmlTree char_literal111_tree=null;

        try {
            // src/parser/Music.g:126:13: ( IF ^ '(' ! expr ')' ! '{' ! listInst '}' ! ( elseif_stmt )* ( else_stmt )? )
            // src/parser/Music.g:126:17: IF ^ '(' ! expr ')' ! '{' ! listInst '}' ! ( elseif_stmt )* ( else_stmt )?
            {
            root_0 = (AmlTree)adaptor.nil();


            IF105=(Token)match(input,IF,FOLLOW_IF_in_if_stmt1423); 
            IF105_tree = 
            (AmlTree)adaptor.create(IF105)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(IF105_tree, root_0);


            char_literal106=(Token)match(input,77,FOLLOW_77_in_if_stmt1426); 

            pushFollow(FOLLOW_expr_in_if_stmt1429);
            expr107=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr107.getTree());

            char_literal108=(Token)match(input,78,FOLLOW_78_in_if_stmt1431); 

            char_literal109=(Token)match(input,84,FOLLOW_84_in_if_stmt1434); 

            pushFollow(FOLLOW_listInst_in_if_stmt1437);
            listInst110=listInst();

            state._fsp--;

            adaptor.addChild(root_0, listInst110.getTree());

            char_literal111=(Token)match(input,85,FOLLOW_85_in_if_stmt1439); 

            // src/parser/Music.g:126:55: ( elseif_stmt )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==ELSE) ) {
                    int LA19_1 = input.LA(2);

                    if ( (LA19_1==IF) ) {
                        alt19=1;
                    }


                }


                switch (alt19) {
            	case 1 :
            	    // src/parser/Music.g:126:55: elseif_stmt
            	    {
            	    pushFollow(FOLLOW_elseif_stmt_in_if_stmt1442);
            	    elseif_stmt112=elseif_stmt();

            	    state._fsp--;

            	    adaptor.addChild(root_0, elseif_stmt112.getTree());

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            // src/parser/Music.g:126:68: ( else_stmt )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==ELSE) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // src/parser/Music.g:126:68: else_stmt
                    {
                    pushFollow(FOLLOW_else_stmt_in_if_stmt1445);
                    else_stmt113=else_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, else_stmt113.getTree());

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
    // src/parser/Music.g:129:1: elseif_stmt : ELSE IF '(' expr ')' '{' listInst '}' -> ^( ELSEIF expr listInst ) ;
    public final MusicParser.elseif_stmt_return elseif_stmt() throws RecognitionException {
        MusicParser.elseif_stmt_return retval = new MusicParser.elseif_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token ELSE114=null;
        Token IF115=null;
        Token char_literal116=null;
        Token char_literal118=null;
        Token char_literal119=null;
        Token char_literal121=null;
        MusicParser.expr_return expr117 =null;

        MusicParser.listInst_return listInst120 =null;


        AmlTree ELSE114_tree=null;
        AmlTree IF115_tree=null;
        AmlTree char_literal116_tree=null;
        AmlTree char_literal118_tree=null;
        AmlTree char_literal119_tree=null;
        AmlTree char_literal121_tree=null;
        RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
        RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");
        RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
        RewriteRuleSubtreeStream stream_listInst=new RewriteRuleSubtreeStream(adaptor,"rule listInst");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // src/parser/Music.g:129:13: ( ELSE IF '(' expr ')' '{' listInst '}' -> ^( ELSEIF expr listInst ) )
            // src/parser/Music.g:129:17: ELSE IF '(' expr ')' '{' listInst '}'
            {
            ELSE114=(Token)match(input,ELSE,FOLLOW_ELSE_in_elseif_stmt1469);  
            stream_ELSE.add(ELSE114);


            IF115=(Token)match(input,IF,FOLLOW_IF_in_elseif_stmt1471);  
            stream_IF.add(IF115);


            char_literal116=(Token)match(input,77,FOLLOW_77_in_elseif_stmt1473);  
            stream_77.add(char_literal116);


            pushFollow(FOLLOW_expr_in_elseif_stmt1475);
            expr117=expr();

            state._fsp--;

            stream_expr.add(expr117.getTree());

            char_literal118=(Token)match(input,78,FOLLOW_78_in_elseif_stmt1477);  
            stream_78.add(char_literal118);


            char_literal119=(Token)match(input,84,FOLLOW_84_in_elseif_stmt1479);  
            stream_84.add(char_literal119);


            pushFollow(FOLLOW_listInst_in_elseif_stmt1481);
            listInst120=listInst();

            state._fsp--;

            stream_listInst.add(listInst120.getTree());

            char_literal121=(Token)match(input,85,FOLLOW_85_in_elseif_stmt1483);  
            stream_85.add(char_literal121);


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
            // 129:55: -> ^( ELSEIF expr listInst )
            {
                // src/parser/Music.g:129:58: ^( ELSEIF expr listInst )
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
    // src/parser/Music.g:132:1: else_stmt : ELSE ^ '{' ! listInst '}' !;
    public final MusicParser.else_stmt_return else_stmt() throws RecognitionException {
        MusicParser.else_stmt_return retval = new MusicParser.else_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token ELSE122=null;
        Token char_literal123=null;
        Token char_literal125=null;
        MusicParser.listInst_return listInst124 =null;


        AmlTree ELSE122_tree=null;
        AmlTree char_literal123_tree=null;
        AmlTree char_literal125_tree=null;

        try {
            // src/parser/Music.g:132:13: ( ELSE ^ '{' ! listInst '}' !)
            // src/parser/Music.g:132:17: ELSE ^ '{' ! listInst '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            ELSE122=(Token)match(input,ELSE,FOLLOW_ELSE_in_else_stmt1518); 
            ELSE122_tree = 
            (AmlTree)adaptor.create(ELSE122)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(ELSE122_tree, root_0);


            char_literal123=(Token)match(input,84,FOLLOW_84_in_else_stmt1521); 

            pushFollow(FOLLOW_listInst_in_else_stmt1524);
            listInst124=listInst();

            state._fsp--;

            adaptor.addChild(root_0, listInst124.getTree());

            char_literal125=(Token)match(input,85,FOLLOW_85_in_else_stmt1526); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:135:1: if_music_stmt : IF ^ '(' ! expr ')' ! '{' ! list_music_inst '}' ! ( elseif_music_stmt )* ( else_music_stmt )? ;
    public final MusicParser.if_music_stmt_return if_music_stmt() throws RecognitionException {
        MusicParser.if_music_stmt_return retval = new MusicParser.if_music_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token IF126=null;
        Token char_literal127=null;
        Token char_literal129=null;
        Token char_literal130=null;
        Token char_literal132=null;
        MusicParser.expr_return expr128 =null;

        MusicParser.list_music_inst_return list_music_inst131 =null;

        MusicParser.elseif_music_stmt_return elseif_music_stmt133 =null;

        MusicParser.else_music_stmt_return else_music_stmt134 =null;


        AmlTree IF126_tree=null;
        AmlTree char_literal127_tree=null;
        AmlTree char_literal129_tree=null;
        AmlTree char_literal130_tree=null;
        AmlTree char_literal132_tree=null;

        try {
            // src/parser/Music.g:135:19: ( IF ^ '(' ! expr ')' ! '{' ! list_music_inst '}' ! ( elseif_music_stmt )* ( else_music_stmt )? )
            // src/parser/Music.g:135:23: IF ^ '(' ! expr ')' ! '{' ! list_music_inst '}' ! ( elseif_music_stmt )* ( else_music_stmt )?
            {
            root_0 = (AmlTree)adaptor.nil();


            IF126=(Token)match(input,IF,FOLLOW_IF_in_if_music_stmt1554); 
            IF126_tree = 
            (AmlTree)adaptor.create(IF126)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(IF126_tree, root_0);


            char_literal127=(Token)match(input,77,FOLLOW_77_in_if_music_stmt1557); 

            pushFollow(FOLLOW_expr_in_if_music_stmt1560);
            expr128=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr128.getTree());

            char_literal129=(Token)match(input,78,FOLLOW_78_in_if_music_stmt1562); 

            char_literal130=(Token)match(input,84,FOLLOW_84_in_if_music_stmt1565); 

            pushFollow(FOLLOW_list_music_inst_in_if_music_stmt1568);
            list_music_inst131=list_music_inst();

            state._fsp--;

            adaptor.addChild(root_0, list_music_inst131.getTree());

            char_literal132=(Token)match(input,85,FOLLOW_85_in_if_music_stmt1570); 

            // src/parser/Music.g:135:68: ( elseif_music_stmt )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==ELSE) ) {
                    int LA21_1 = input.LA(2);

                    if ( (LA21_1==IF) ) {
                        alt21=1;
                    }


                }


                switch (alt21) {
            	case 1 :
            	    // src/parser/Music.g:135:68: elseif_music_stmt
            	    {
            	    pushFollow(FOLLOW_elseif_music_stmt_in_if_music_stmt1573);
            	    elseif_music_stmt133=elseif_music_stmt();

            	    state._fsp--;

            	    adaptor.addChild(root_0, elseif_music_stmt133.getTree());

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            // src/parser/Music.g:135:87: ( else_music_stmt )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==ELSE) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // src/parser/Music.g:135:87: else_music_stmt
                    {
                    pushFollow(FOLLOW_else_music_stmt_in_if_music_stmt1576);
                    else_music_stmt134=else_music_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, else_music_stmt134.getTree());

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
    // src/parser/Music.g:138:1: elseif_music_stmt : ELSE IF '(' expr ')' '{' list_music_inst '}' -> ^( ELSEIF expr list_music_inst ) ;
    public final MusicParser.elseif_music_stmt_return elseif_music_stmt() throws RecognitionException {
        MusicParser.elseif_music_stmt_return retval = new MusicParser.elseif_music_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token ELSE135=null;
        Token IF136=null;
        Token char_literal137=null;
        Token char_literal139=null;
        Token char_literal140=null;
        Token char_literal142=null;
        MusicParser.expr_return expr138 =null;

        MusicParser.list_music_inst_return list_music_inst141 =null;


        AmlTree ELSE135_tree=null;
        AmlTree IF136_tree=null;
        AmlTree char_literal137_tree=null;
        AmlTree char_literal139_tree=null;
        AmlTree char_literal140_tree=null;
        AmlTree char_literal142_tree=null;
        RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
        RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");
        RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
        RewriteRuleSubtreeStream stream_list_music_inst=new RewriteRuleSubtreeStream(adaptor,"rule list_music_inst");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // src/parser/Music.g:138:19: ( ELSE IF '(' expr ')' '{' list_music_inst '}' -> ^( ELSEIF expr list_music_inst ) )
            // src/parser/Music.g:138:23: ELSE IF '(' expr ')' '{' list_music_inst '}'
            {
            ELSE135=(Token)match(input,ELSE,FOLLOW_ELSE_in_elseif_music_stmt1600);  
            stream_ELSE.add(ELSE135);


            IF136=(Token)match(input,IF,FOLLOW_IF_in_elseif_music_stmt1602);  
            stream_IF.add(IF136);


            char_literal137=(Token)match(input,77,FOLLOW_77_in_elseif_music_stmt1604);  
            stream_77.add(char_literal137);


            pushFollow(FOLLOW_expr_in_elseif_music_stmt1606);
            expr138=expr();

            state._fsp--;

            stream_expr.add(expr138.getTree());

            char_literal139=(Token)match(input,78,FOLLOW_78_in_elseif_music_stmt1608);  
            stream_78.add(char_literal139);


            char_literal140=(Token)match(input,84,FOLLOW_84_in_elseif_music_stmt1610);  
            stream_84.add(char_literal140);


            pushFollow(FOLLOW_list_music_inst_in_elseif_music_stmt1612);
            list_music_inst141=list_music_inst();

            state._fsp--;

            stream_list_music_inst.add(list_music_inst141.getTree());

            char_literal142=(Token)match(input,85,FOLLOW_85_in_elseif_music_stmt1614);  
            stream_85.add(char_literal142);


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
            // 138:68: -> ^( ELSEIF expr list_music_inst )
            {
                // src/parser/Music.g:138:71: ^( ELSEIF expr list_music_inst )
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
    // src/parser/Music.g:141:1: else_music_stmt : ELSE ^ '{' ! list_music_inst '}' !;
    public final MusicParser.else_music_stmt_return else_music_stmt() throws RecognitionException {
        MusicParser.else_music_stmt_return retval = new MusicParser.else_music_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token ELSE143=null;
        Token char_literal144=null;
        Token char_literal146=null;
        MusicParser.list_music_inst_return list_music_inst145 =null;


        AmlTree ELSE143_tree=null;
        AmlTree char_literal144_tree=null;
        AmlTree char_literal146_tree=null;

        try {
            // src/parser/Music.g:141:19: ( ELSE ^ '{' ! list_music_inst '}' !)
            // src/parser/Music.g:141:23: ELSE ^ '{' ! list_music_inst '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            ELSE143=(Token)match(input,ELSE,FOLLOW_ELSE_in_else_music_stmt1649); 
            ELSE143_tree = 
            (AmlTree)adaptor.create(ELSE143)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(ELSE143_tree, root_0);


            char_literal144=(Token)match(input,84,FOLLOW_84_in_else_music_stmt1652); 

            pushFollow(FOLLOW_list_music_inst_in_else_music_stmt1655);
            list_music_inst145=list_music_inst();

            state._fsp--;

            adaptor.addChild(root_0, list_music_inst145.getTree());

            char_literal146=(Token)match(input,85,FOLLOW_85_in_else_music_stmt1657); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:144:1: song : SONG ^ ( ID )? '{' ! beat speed ( transport )? ( track )+ '}' !;
    public final MusicParser.song_return song() throws RecognitionException {
        MusicParser.song_return retval = new MusicParser.song_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token SONG147=null;
        Token ID148=null;
        Token char_literal149=null;
        Token char_literal154=null;
        MusicParser.beat_return beat150 =null;

        MusicParser.speed_return speed151 =null;

        MusicParser.transport_return transport152 =null;

        MusicParser.track_return track153 =null;


        AmlTree SONG147_tree=null;
        AmlTree ID148_tree=null;
        AmlTree char_literal149_tree=null;
        AmlTree char_literal154_tree=null;

        try {
            // src/parser/Music.g:144:13: ( SONG ^ ( ID )? '{' ! beat speed ( transport )? ( track )+ '}' !)
            // src/parser/Music.g:144:17: SONG ^ ( ID )? '{' ! beat speed ( transport )? ( track )+ '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            SONG147=(Token)match(input,SONG,FOLLOW_SONG_in_song1688); 
            SONG147_tree = 
            (AmlTree)adaptor.create(SONG147)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(SONG147_tree, root_0);


            // src/parser/Music.g:144:23: ( ID )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==ID) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // src/parser/Music.g:144:23: ID
                    {
                    ID148=(Token)match(input,ID,FOLLOW_ID_in_song1691); 
                    ID148_tree = 
                    (AmlTree)adaptor.create(ID148)
                    ;
                    adaptor.addChild(root_0, ID148_tree);


                    }
                    break;

            }


            char_literal149=(Token)match(input,84,FOLLOW_84_in_song1694); 

            pushFollow(FOLLOW_beat_in_song1697);
            beat150=beat();

            state._fsp--;

            adaptor.addChild(root_0, beat150.getTree());

            pushFollow(FOLLOW_speed_in_song1699);
            speed151=speed();

            state._fsp--;

            adaptor.addChild(root_0, speed151.getTree());

            // src/parser/Music.g:144:43: ( transport )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==TRANSPORT) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // src/parser/Music.g:144:43: transport
                    {
                    pushFollow(FOLLOW_transport_in_song1701);
                    transport152=transport();

                    state._fsp--;

                    adaptor.addChild(root_0, transport152.getTree());

                    }
                    break;

            }


            // src/parser/Music.g:144:54: ( track )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==TRACK) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // src/parser/Music.g:144:55: track
            	    {
            	    pushFollow(FOLLOW_track_in_song1705);
            	    track153=track();

            	    state._fsp--;

            	    adaptor.addChild(root_0, track153.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt25 >= 1 ) break loop25;
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
            } while (true);


            char_literal154=(Token)match(input,85,FOLLOW_85_in_song1709); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:147:1: track : TRACK ^ ( ID )? STRING compas_aux ;
    public final MusicParser.track_return track() throws RecognitionException {
        MusicParser.track_return retval = new MusicParser.track_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token TRACK155=null;
        Token ID156=null;
        Token STRING157=null;
        MusicParser.compas_aux_return compas_aux158 =null;


        AmlTree TRACK155_tree=null;
        AmlTree ID156_tree=null;
        AmlTree STRING157_tree=null;

        try {
            // src/parser/Music.g:147:13: ( TRACK ^ ( ID )? STRING compas_aux )
            // src/parser/Music.g:147:17: TRACK ^ ( ID )? STRING compas_aux
            {
            root_0 = (AmlTree)adaptor.nil();


            TRACK155=(Token)match(input,TRACK,FOLLOW_TRACK_in_track1739); 
            TRACK155_tree = 
            (AmlTree)adaptor.create(TRACK155)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(TRACK155_tree, root_0);


            // src/parser/Music.g:147:24: ( ID )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==ID) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // src/parser/Music.g:147:24: ID
                    {
                    ID156=(Token)match(input,ID,FOLLOW_ID_in_track1742); 
                    ID156_tree = 
                    (AmlTree)adaptor.create(ID156)
                    ;
                    adaptor.addChild(root_0, ID156_tree);


                    }
                    break;

            }


            STRING157=(Token)match(input,STRING,FOLLOW_STRING_in_track1745); 
            STRING157_tree = 
            (AmlTree)adaptor.create(STRING157)
            ;
            adaptor.addChild(root_0, STRING157_tree);


            pushFollow(FOLLOW_compas_aux_in_track1747);
            compas_aux158=compas_aux();

            state._fsp--;

            adaptor.addChild(root_0, compas_aux158.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:150:1: compas_aux : compas_list -> ^( COMPAS_LIST compas_list ) ;
    public final MusicParser.compas_aux_return compas_aux() throws RecognitionException {
        MusicParser.compas_aux_return retval = new MusicParser.compas_aux_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        MusicParser.compas_list_return compas_list159 =null;


        RewriteRuleSubtreeStream stream_compas_list=new RewriteRuleSubtreeStream(adaptor,"rule compas_list");
        try {
            // src/parser/Music.g:150:13: ( compas_list -> ^( COMPAS_LIST compas_list ) )
            // src/parser/Music.g:150:17: compas_list
            {
            pushFollow(FOLLOW_compas_list_in_compas_aux1771);
            compas_list159=compas_list();

            state._fsp--;

            stream_compas_list.add(compas_list159.getTree());

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
            // 150:29: -> ^( COMPAS_LIST compas_list )
            {
                // src/parser/Music.g:150:32: ^( COMPAS_LIST compas_list )
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
    // src/parser/Music.g:153:1: compas_list : ( DOUBLE_BAR !| repetition ) ( compasses | repetition )* ( DOUBLE_BAR !|) ;
    public final MusicParser.compas_list_return compas_list() throws RecognitionException {
        MusicParser.compas_list_return retval = new MusicParser.compas_list_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token DOUBLE_BAR160=null;
        Token DOUBLE_BAR164=null;
        MusicParser.repetition_return repetition161 =null;

        MusicParser.compasses_return compasses162 =null;

        MusicParser.repetition_return repetition163 =null;


        AmlTree DOUBLE_BAR160_tree=null;
        AmlTree DOUBLE_BAR164_tree=null;

        try {
            // src/parser/Music.g:153:13: ( ( DOUBLE_BAR !| repetition ) ( compasses | repetition )* ( DOUBLE_BAR !|) )
            // src/parser/Music.g:153:15: ( DOUBLE_BAR !| repetition ) ( compasses | repetition )* ( DOUBLE_BAR !|)
            {
            root_0 = (AmlTree)adaptor.nil();


            // src/parser/Music.g:153:15: ( DOUBLE_BAR !| repetition )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==DOUBLE_BAR) ) {
                alt27=1;
            }
            else if ( (LA27_0==NUM||LA27_0==START_REPETITION) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;

            }
            switch (alt27) {
                case 1 :
                    // src/parser/Music.g:153:16: DOUBLE_BAR !
                    {
                    DOUBLE_BAR160=(Token)match(input,DOUBLE_BAR,FOLLOW_DOUBLE_BAR_in_compas_list1801); 

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:153:30: repetition
                    {
                    pushFollow(FOLLOW_repetition_in_compas_list1806);
                    repetition161=repetition();

                    state._fsp--;

                    adaptor.addChild(root_0, repetition161.getTree());

                    }
                    break;

            }


            // src/parser/Music.g:153:42: ( compasses | repetition )*
            loop28:
            do {
                int alt28=3;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0 >= BEMOL && LA28_0 <= BOOL)||LA28_0==CHORD||LA28_0==DECR||LA28_0==FOR||(LA28_0 >= ID && LA28_0 <= INT)||LA28_0==NOTE||LA28_0==SONG||LA28_0==SUSTAIN||LA28_0==TONE||LA28_0==WHILE||LA28_0==77) ) {
                    alt28=1;
                }
                else if ( (LA28_0==NUM||LA28_0==START_REPETITION) ) {
                    alt28=2;
                }


                switch (alt28) {
            	case 1 :
            	    // src/parser/Music.g:153:43: compasses
            	    {
            	    pushFollow(FOLLOW_compasses_in_compas_list1810);
            	    compasses162=compasses();

            	    state._fsp--;

            	    adaptor.addChild(root_0, compasses162.getTree());

            	    }
            	    break;
            	case 2 :
            	    // src/parser/Music.g:153:55: repetition
            	    {
            	    pushFollow(FOLLOW_repetition_in_compas_list1814);
            	    repetition163=repetition();

            	    state._fsp--;

            	    adaptor.addChild(root_0, repetition163.getTree());

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            // src/parser/Music.g:153:68: ( DOUBLE_BAR !|)
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==DOUBLE_BAR) ) {
                alt29=1;
            }
            else if ( (LA29_0==TRACK||LA29_0==85) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;

            }
            switch (alt29) {
                case 1 :
                    // src/parser/Music.g:153:69: DOUBLE_BAR !
                    {
                    DOUBLE_BAR164=(Token)match(input,DOUBLE_BAR,FOLLOW_DOUBLE_BAR_in_compas_list1819); 

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:153:83: 
                    {
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
    // src/parser/Music.g:156:1: compasses : compas ( BAR ! compas )* ;
    public final MusicParser.compasses_return compasses() throws RecognitionException {
        MusicParser.compasses_return retval = new MusicParser.compasses_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token BAR166=null;
        MusicParser.compas_return compas165 =null;

        MusicParser.compas_return compas167 =null;


        AmlTree BAR166_tree=null;

        try {
            // src/parser/Music.g:156:13: ( compas ( BAR ! compas )* )
            // src/parser/Music.g:156:17: compas ( BAR ! compas )*
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_compas_in_compasses1849);
            compas165=compas();

            state._fsp--;

            adaptor.addChild(root_0, compas165.getTree());

            // src/parser/Music.g:156:24: ( BAR ! compas )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==BAR) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // src/parser/Music.g:156:25: BAR ! compas
            	    {
            	    BAR166=(Token)match(input,BAR,FOLLOW_BAR_in_compasses1852); 

            	    pushFollow(FOLLOW_compas_in_compasses1855);
            	    compas167=compas();

            	    state._fsp--;

            	    adaptor.addChild(root_0, compas167.getTree());

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
    // src/parser/Music.g:158:1: repetition : ( NUM 'x' )? START_REPETITION compasses END_REPETITION -> ^( REPETITION NUM compasses ) ;
    public final MusicParser.repetition_return repetition() throws RecognitionException {
        MusicParser.repetition_return retval = new MusicParser.repetition_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token NUM168=null;
        Token char_literal169=null;
        Token START_REPETITION170=null;
        Token END_REPETITION172=null;
        MusicParser.compasses_return compasses171 =null;


        AmlTree NUM168_tree=null;
        AmlTree char_literal169_tree=null;
        AmlTree START_REPETITION170_tree=null;
        AmlTree END_REPETITION172_tree=null;
        RewriteRuleTokenStream stream_END_REPETITION=new RewriteRuleTokenStream(adaptor,"token END_REPETITION");
        RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
        RewriteRuleTokenStream stream_START_REPETITION=new RewriteRuleTokenStream(adaptor,"token START_REPETITION");
        RewriteRuleTokenStream stream_NUM=new RewriteRuleTokenStream(adaptor,"token NUM");
        RewriteRuleSubtreeStream stream_compasses=new RewriteRuleSubtreeStream(adaptor,"rule compasses");
        try {
            // src/parser/Music.g:158:13: ( ( NUM 'x' )? START_REPETITION compasses END_REPETITION -> ^( REPETITION NUM compasses ) )
            // src/parser/Music.g:158:17: ( NUM 'x' )? START_REPETITION compasses END_REPETITION
            {
            // src/parser/Music.g:158:17: ( NUM 'x' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==NUM) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // src/parser/Music.g:158:18: NUM 'x'
                    {
                    NUM168=(Token)match(input,NUM,FOLLOW_NUM_in_repetition1869);  
                    stream_NUM.add(NUM168);


                    char_literal169=(Token)match(input,83,FOLLOW_83_in_repetition1871);  
                    stream_83.add(char_literal169);


                    }
                    break;

            }


            START_REPETITION170=(Token)match(input,START_REPETITION,FOLLOW_START_REPETITION_in_repetition1875);  
            stream_START_REPETITION.add(START_REPETITION170);


            pushFollow(FOLLOW_compasses_in_repetition1877);
            compasses171=compasses();

            state._fsp--;

            stream_compasses.add(compasses171.getTree());

            END_REPETITION172=(Token)match(input,END_REPETITION,FOLLOW_END_REPETITION_in_repetition1879);  
            stream_END_REPETITION.add(END_REPETITION172);


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
            // 158:73: -> ^( REPETITION NUM compasses )
            {
                // src/parser/Music.g:158:76: ^( REPETITION NUM compasses )
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
    // src/parser/Music.g:161:1: compas : ( tone )? ( options {greedy=true; } : music_inst )+ -> ^( COMPAS ( tone )? ( music_inst )+ ) ;
    public final MusicParser.compas_return compas() throws RecognitionException {
        MusicParser.compas_return retval = new MusicParser.compas_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        MusicParser.tone_return tone173 =null;

        MusicParser.music_inst_return music_inst174 =null;


        RewriteRuleSubtreeStream stream_tone=new RewriteRuleSubtreeStream(adaptor,"rule tone");
        RewriteRuleSubtreeStream stream_music_inst=new RewriteRuleSubtreeStream(adaptor,"rule music_inst");
        try {
            // src/parser/Music.g:161:13: ( ( tone )? ( options {greedy=true; } : music_inst )+ -> ^( COMPAS ( tone )? ( music_inst )+ ) )
            // src/parser/Music.g:161:17: ( tone )? ( options {greedy=true; } : music_inst )+
            {
            // src/parser/Music.g:161:17: ( tone )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==TONE) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // src/parser/Music.g:161:17: tone
                    {
                    pushFollow(FOLLOW_tone_in_compas1920);
                    tone173=tone();

                    state._fsp--;

                    stream_tone.add(tone173.getTree());

                    }
                    break;

            }


            // src/parser/Music.g:161:23: ( options {greedy=true; } : music_inst )+
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
            	    // src/parser/Music.g:161:49: music_inst
            	    {
            	    pushFollow(FOLLOW_music_inst_in_compas1933);
            	    music_inst174=music_inst();

            	    state._fsp--;

            	    stream_music_inst.add(music_inst174.getTree());

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
            // elements: tone, music_inst
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AmlTree)adaptor.nil();
            // 161:65: -> ^( COMPAS ( tone )? ( music_inst )+ )
            {
                // src/parser/Music.g:161:68: ^( COMPAS ( tone )? ( music_inst )+ )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(COMPAS, "COMPAS")
                , root_1);

                // src/parser/Music.g:161:77: ( tone )?
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
    // src/parser/Music.g:164:1: tone : TONE ^ NUM ( SUSTAIN | BEMOL ) ;
    public final MusicParser.tone_return tone() throws RecognitionException {
        MusicParser.tone_return retval = new MusicParser.tone_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token TONE175=null;
        Token NUM176=null;
        Token set177=null;

        AmlTree TONE175_tree=null;
        AmlTree NUM176_tree=null;
        AmlTree set177_tree=null;

        try {
            // src/parser/Music.g:164:13: ( TONE ^ NUM ( SUSTAIN | BEMOL ) )
            // src/parser/Music.g:164:17: TONE ^ NUM ( SUSTAIN | BEMOL )
            {
            root_0 = (AmlTree)adaptor.nil();


            TONE175=(Token)match(input,TONE,FOLLOW_TONE_in_tone1980); 
            TONE175_tree = 
            (AmlTree)adaptor.create(TONE175)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(TONE175_tree, root_0);


            NUM176=(Token)match(input,NUM,FOLLOW_NUM_in_tone1983); 
            NUM176_tree = 
            (AmlTree)adaptor.create(NUM176)
            ;
            adaptor.addChild(root_0, NUM176_tree);


            set177=(Token)input.LT(1);

            if ( input.LA(1)==BEMOL||input.LA(1)==SUSTAIN ) {
                input.consume();
                adaptor.addChild(root_0, 
                (AmlTree)adaptor.create(set177)
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
    // src/parser/Music.g:167:1: notes_group : notes_type ( '.' FIGURE )? ( DOT )? ( TIE )? -> ^( NOTE_LIST notes_type ( FIGURE )? ( DOT )? ( TIE )? ) ;
    public final MusicParser.notes_group_return notes_group() throws RecognitionException {
        MusicParser.notes_group_return retval = new MusicParser.notes_group_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal179=null;
        Token FIGURE180=null;
        Token DOT181=null;
        Token TIE182=null;
        MusicParser.notes_type_return notes_type178 =null;


        AmlTree char_literal179_tree=null;
        AmlTree FIGURE180_tree=null;
        AmlTree DOT181_tree=null;
        AmlTree TIE182_tree=null;
        RewriteRuleTokenStream stream_FIGURE=new RewriteRuleTokenStream(adaptor,"token FIGURE");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_80=new RewriteRuleTokenStream(adaptor,"token 80");
        RewriteRuleTokenStream stream_TIE=new RewriteRuleTokenStream(adaptor,"token TIE");
        RewriteRuleSubtreeStream stream_notes_type=new RewriteRuleSubtreeStream(adaptor,"rule notes_type");
        try {
            // src/parser/Music.g:167:13: ( notes_type ( '.' FIGURE )? ( DOT )? ( TIE )? -> ^( NOTE_LIST notes_type ( FIGURE )? ( DOT )? ( TIE )? ) )
            // src/parser/Music.g:167:17: notes_type ( '.' FIGURE )? ( DOT )? ( TIE )?
            {
            pushFollow(FOLLOW_notes_type_in_notes_group2014);
            notes_type178=notes_type();

            state._fsp--;

            stream_notes_type.add(notes_type178.getTree());

            // src/parser/Music.g:167:28: ( '.' FIGURE )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==80) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // src/parser/Music.g:167:29: '.' FIGURE
                    {
                    char_literal179=(Token)match(input,80,FOLLOW_80_in_notes_group2017);  
                    stream_80.add(char_literal179);


                    FIGURE180=(Token)match(input,FIGURE,FOLLOW_FIGURE_in_notes_group2019);  
                    stream_FIGURE.add(FIGURE180);


                    }
                    break;

            }


            // src/parser/Music.g:167:42: ( DOT )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==DOT) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // src/parser/Music.g:167:42: DOT
                    {
                    DOT181=(Token)match(input,DOT,FOLLOW_DOT_in_notes_group2023);  
                    stream_DOT.add(DOT181);


                    }
                    break;

            }


            // src/parser/Music.g:167:47: ( TIE )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==TIE) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // src/parser/Music.g:167:47: TIE
                    {
                    TIE182=(Token)match(input,TIE,FOLLOW_TIE_in_notes_group2026);  
                    stream_TIE.add(TIE182);


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
            // 167:52: -> ^( NOTE_LIST notes_type ( FIGURE )? ( DOT )? ( TIE )? )
            {
                // src/parser/Music.g:167:55: ^( NOTE_LIST notes_type ( FIGURE )? ( DOT )? ( TIE )? )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(NOTE_LIST, "NOTE_LIST")
                , root_1);

                adaptor.addChild(root_1, stream_notes_type.nextTree());

                // src/parser/Music.g:167:78: ( FIGURE )?
                if ( stream_FIGURE.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_FIGURE.nextNode()
                    );

                }
                stream_FIGURE.reset();

                // src/parser/Music.g:167:86: ( DOT )?
                if ( stream_DOT.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_DOT.nextNode()
                    );

                }
                stream_DOT.reset();

                // src/parser/Music.g:167:91: ( TIE )?
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
    // src/parser/Music.g:170:1: notes_type : ( chord | notes );
    public final MusicParser.notes_type_return notes_type() throws RecognitionException {
        MusicParser.notes_type_return retval = new MusicParser.notes_type_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        MusicParser.chord_return chord183 =null;

        MusicParser.notes_return notes184 =null;



        try {
            // src/parser/Music.g:170:13: ( chord | notes )
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
                    // src/parser/Music.g:170:15: chord
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_chord_in_notes_type2066);
                    chord183=chord();

                    state._fsp--;

                    adaptor.addChild(root_0, chord183.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:170:23: notes
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_notes_in_notes_type2070);
                    notes184=notes();

                    state._fsp--;

                    adaptor.addChild(root_0, notes184.getTree());

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
    // src/parser/Music.g:172:1: chord : CHORD ^ '(' ! NOTE ( MINOR | PLUS | DIMINUTION )? ( SEVENTH | MAJ7 )? ')' !;
    public final MusicParser.chord_return chord() throws RecognitionException {
        MusicParser.chord_return retval = new MusicParser.chord_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token CHORD185=null;
        Token char_literal186=null;
        Token NOTE187=null;
        Token set188=null;
        Token set189=null;
        Token char_literal190=null;

        AmlTree CHORD185_tree=null;
        AmlTree char_literal186_tree=null;
        AmlTree NOTE187_tree=null;
        AmlTree set188_tree=null;
        AmlTree set189_tree=null;
        AmlTree char_literal190_tree=null;

        try {
            // src/parser/Music.g:172:13: ( CHORD ^ '(' ! NOTE ( MINOR | PLUS | DIMINUTION )? ( SEVENTH | MAJ7 )? ')' !)
            // src/parser/Music.g:172:17: CHORD ^ '(' ! NOTE ( MINOR | PLUS | DIMINUTION )? ( SEVENTH | MAJ7 )? ')' !
            {
            root_0 = (AmlTree)adaptor.nil();


            CHORD185=(Token)match(input,CHORD,FOLLOW_CHORD_in_chord2086); 
            CHORD185_tree = 
            (AmlTree)adaptor.create(CHORD185)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(CHORD185_tree, root_0);


            char_literal186=(Token)match(input,77,FOLLOW_77_in_chord2089); 

            NOTE187=(Token)match(input,NOTE,FOLLOW_NOTE_in_chord2092); 
            NOTE187_tree = 
            (AmlTree)adaptor.create(NOTE187)
            ;
            adaptor.addChild(root_0, NOTE187_tree);


            // src/parser/Music.g:172:34: ( MINOR | PLUS | DIMINUTION )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==DIMINUTION||LA38_0==MINOR||LA38_0==PLUS) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // src/parser/Music.g:
                    {
                    set188=(Token)input.LT(1);

                    if ( input.LA(1)==DIMINUTION||input.LA(1)==MINOR||input.LA(1)==PLUS ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (AmlTree)adaptor.create(set188)
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


            // src/parser/Music.g:172:59: ( SEVENTH | MAJ7 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==MAJ7||LA39_0==SEVENTH) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // src/parser/Music.g:
                    {
                    set189=(Token)input.LT(1);

                    if ( input.LA(1)==MAJ7||input.LA(1)==SEVENTH ) {
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


            char_literal190=(Token)match(input,78,FOLLOW_78_in_chord2110); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:175:1: notes : ( '(' ( note )+ ')' | note ) -> ^( NOTES ( note )+ ) ;
    public final MusicParser.notes_return notes() throws RecognitionException {
        MusicParser.notes_return retval = new MusicParser.notes_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal191=null;
        Token char_literal193=null;
        MusicParser.note_return note192 =null;

        MusicParser.note_return note194 =null;


        AmlTree char_literal191_tree=null;
        AmlTree char_literal193_tree=null;
        RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
        RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
        RewriteRuleSubtreeStream stream_note=new RewriteRuleSubtreeStream(adaptor,"rule note");
        try {
            // src/parser/Music.g:175:13: ( ( '(' ( note )+ ')' | note ) -> ^( NOTES ( note )+ ) )
            // src/parser/Music.g:175:17: ( '(' ( note )+ ')' | note )
            {
            // src/parser/Music.g:175:17: ( '(' ( note )+ ')' | note )
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
                    // src/parser/Music.g:175:19: '(' ( note )+ ')'
                    {
                    char_literal191=(Token)match(input,77,FOLLOW_77_in_notes2142);  
                    stream_77.add(char_literal191);


                    // src/parser/Music.g:175:23: ( note )+
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
                    	    // src/parser/Music.g:175:24: note
                    	    {
                    	    pushFollow(FOLLOW_note_in_notes2145);
                    	    note192=note();

                    	    state._fsp--;

                    	    stream_note.add(note192.getTree());

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


                    char_literal193=(Token)match(input,78,FOLLOW_78_in_notes2149);  
                    stream_78.add(char_literal193);


                    }
                    break;
                case 2 :
                    // src/parser/Music.g:175:38: note
                    {
                    pushFollow(FOLLOW_note_in_notes2154);
                    note194=note();

                    state._fsp--;

                    stream_note.add(note194.getTree());

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
            // 175:44: -> ^( NOTES ( note )+ )
            {
                // src/parser/Music.g:175:47: ^( NOTES ( note )+ )
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
    // src/parser/Music.g:178:1: note : ( BEMOL | SUSTAIN )? NOTE ^ ( '-' ! NUM )? ;
    public final MusicParser.note_return note() throws RecognitionException {
        MusicParser.note_return retval = new MusicParser.note_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token set195=null;
        Token NOTE196=null;
        Token char_literal197=null;
        Token NUM198=null;

        AmlTree set195_tree=null;
        AmlTree NOTE196_tree=null;
        AmlTree char_literal197_tree=null;
        AmlTree NUM198_tree=null;

        try {
            // src/parser/Music.g:178:13: ( ( BEMOL | SUSTAIN )? NOTE ^ ( '-' ! NUM )? )
            // src/parser/Music.g:178:17: ( BEMOL | SUSTAIN )? NOTE ^ ( '-' ! NUM )?
            {
            root_0 = (AmlTree)adaptor.nil();


            // src/parser/Music.g:178:17: ( BEMOL | SUSTAIN )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==BEMOL||LA42_0==SUSTAIN) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // src/parser/Music.g:
                    {
                    set195=(Token)input.LT(1);

                    if ( input.LA(1)==BEMOL||input.LA(1)==SUSTAIN ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (AmlTree)adaptor.create(set195)
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


            NOTE196=(Token)match(input,NOTE,FOLLOW_NOTE_in_note2203); 
            NOTE196_tree = 
            (AmlTree)adaptor.create(NOTE196)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(NOTE196_tree, root_0);


            // src/parser/Music.g:178:42: ( '-' ! NUM )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==MINUS) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // src/parser/Music.g:178:43: '-' ! NUM
                    {
                    char_literal197=(Token)match(input,MINUS,FOLLOW_MINUS_in_note2207); 

                    NUM198=(Token)match(input,NUM,FOLLOW_NUM_in_note2210); 
                    NUM198_tree = 
                    (AmlTree)adaptor.create(NUM198)
                    ;
                    adaptor.addChild(root_0, NUM198_tree);


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
    // src/parser/Music.g:182:1: expr : boolterm ( OR ^ boolterm )* ;
    public final MusicParser.expr_return expr() throws RecognitionException {
        MusicParser.expr_return retval = new MusicParser.expr_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token OR200=null;
        MusicParser.boolterm_return boolterm199 =null;

        MusicParser.boolterm_return boolterm201 =null;


        AmlTree OR200_tree=null;

        try {
            // src/parser/Music.g:182:9: ( boolterm ( OR ^ boolterm )* )
            // src/parser/Music.g:182:13: boolterm ( OR ^ boolterm )*
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_boolterm_in_expr2239);
            boolterm199=boolterm();

            state._fsp--;

            adaptor.addChild(root_0, boolterm199.getTree());

            // src/parser/Music.g:182:22: ( OR ^ boolterm )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==OR) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // src/parser/Music.g:182:23: OR ^ boolterm
            	    {
            	    OR200=(Token)match(input,OR,FOLLOW_OR_in_expr2242); 
            	    OR200_tree = 
            	    (AmlTree)adaptor.create(OR200)
            	    ;
            	    root_0 = (AmlTree)adaptor.becomeRoot(OR200_tree, root_0);


            	    pushFollow(FOLLOW_boolterm_in_expr2245);
            	    boolterm201=boolterm();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolterm201.getTree());

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
    // src/parser/Music.g:185:1: boolterm : boolfact ( AND ^ boolfact )* ;
    public final MusicParser.boolterm_return boolterm() throws RecognitionException {
        MusicParser.boolterm_return retval = new MusicParser.boolterm_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token AND203=null;
        MusicParser.boolfact_return boolfact202 =null;

        MusicParser.boolfact_return boolfact204 =null;


        AmlTree AND203_tree=null;

        try {
            // src/parser/Music.g:185:9: ( boolfact ( AND ^ boolfact )* )
            // src/parser/Music.g:185:13: boolfact ( AND ^ boolfact )*
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_boolfact_in_boolterm2259);
            boolfact202=boolfact();

            state._fsp--;

            adaptor.addChild(root_0, boolfact202.getTree());

            // src/parser/Music.g:185:22: ( AND ^ boolfact )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==AND) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // src/parser/Music.g:185:23: AND ^ boolfact
            	    {
            	    AND203=(Token)match(input,AND,FOLLOW_AND_in_boolterm2262); 
            	    AND203_tree = 
            	    (AmlTree)adaptor.create(AND203)
            	    ;
            	    root_0 = (AmlTree)adaptor.becomeRoot(AND203_tree, root_0);


            	    pushFollow(FOLLOW_boolfact_in_boolterm2265);
            	    boolfact204=boolfact();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolfact204.getTree());

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
    // src/parser/Music.g:188:1: boolfact : num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? ;
    public final MusicParser.boolfact_return boolfact() throws RecognitionException {
        MusicParser.boolfact_return retval = new MusicParser.boolfact_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token EQUAL206=null;
        Token NOT_EQUAL207=null;
        Token LT208=null;
        Token LE209=null;
        Token GT210=null;
        Token GE211=null;
        MusicParser.num_expr_return num_expr205 =null;

        MusicParser.num_expr_return num_expr212 =null;


        AmlTree EQUAL206_tree=null;
        AmlTree NOT_EQUAL207_tree=null;
        AmlTree LT208_tree=null;
        AmlTree LE209_tree=null;
        AmlTree GT210_tree=null;
        AmlTree GE211_tree=null;

        try {
            // src/parser/Music.g:188:9: ( num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? )
            // src/parser/Music.g:188:13: num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_num_expr_in_boolfact2279);
            num_expr205=num_expr();

            state._fsp--;

            adaptor.addChild(root_0, num_expr205.getTree());

            // src/parser/Music.g:188:22: ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==EQUAL||(LA47_0 >= GE && LA47_0 <= GT)||LA47_0==LE||LA47_0==LT||LA47_0==NOT_EQUAL) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // src/parser/Music.g:188:23: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr
                    {
                    // src/parser/Music.g:188:23: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^)
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
                            // src/parser/Music.g:188:24: EQUAL ^
                            {
                            EQUAL206=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_boolfact2283); 
                            EQUAL206_tree = 
                            (AmlTree)adaptor.create(EQUAL206)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(EQUAL206_tree, root_0);


                            }
                            break;
                        case 2 :
                            // src/parser/Music.g:188:33: NOT_EQUAL ^
                            {
                            NOT_EQUAL207=(Token)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_boolfact2288); 
                            NOT_EQUAL207_tree = 
                            (AmlTree)adaptor.create(NOT_EQUAL207)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(NOT_EQUAL207_tree, root_0);


                            }
                            break;
                        case 3 :
                            // src/parser/Music.g:188:46: LT ^
                            {
                            LT208=(Token)match(input,LT,FOLLOW_LT_in_boolfact2293); 
                            LT208_tree = 
                            (AmlTree)adaptor.create(LT208)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(LT208_tree, root_0);


                            }
                            break;
                        case 4 :
                            // src/parser/Music.g:188:52: LE ^
                            {
                            LE209=(Token)match(input,LE,FOLLOW_LE_in_boolfact2298); 
                            LE209_tree = 
                            (AmlTree)adaptor.create(LE209)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(LE209_tree, root_0);


                            }
                            break;
                        case 5 :
                            // src/parser/Music.g:188:58: GT ^
                            {
                            GT210=(Token)match(input,GT,FOLLOW_GT_in_boolfact2303); 
                            GT210_tree = 
                            (AmlTree)adaptor.create(GT210)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(GT210_tree, root_0);


                            }
                            break;
                        case 6 :
                            // src/parser/Music.g:188:64: GE ^
                            {
                            GE211=(Token)match(input,GE,FOLLOW_GE_in_boolfact2308); 
                            GE211_tree = 
                            (AmlTree)adaptor.create(GE211)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(GE211_tree, root_0);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_num_expr_in_boolfact2312);
                    num_expr212=num_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, num_expr212.getTree());

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
    // src/parser/Music.g:191:1: num_expr : term ( ( PLUS ^| MINUS ^) term )* ;
    public final MusicParser.num_expr_return num_expr() throws RecognitionException {
        MusicParser.num_expr_return retval = new MusicParser.num_expr_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token PLUS214=null;
        Token MINUS215=null;
        MusicParser.term_return term213 =null;

        MusicParser.term_return term216 =null;


        AmlTree PLUS214_tree=null;
        AmlTree MINUS215_tree=null;

        try {
            // src/parser/Music.g:191:9: ( term ( ( PLUS ^| MINUS ^) term )* )
            // src/parser/Music.g:191:13: term ( ( PLUS ^| MINUS ^) term )*
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_term_in_num_expr2326);
            term213=term();

            state._fsp--;

            adaptor.addChild(root_0, term213.getTree());

            // src/parser/Music.g:191:18: ( ( PLUS ^| MINUS ^) term )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==MINUS||LA49_0==PLUS) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // src/parser/Music.g:191:20: ( PLUS ^| MINUS ^) term
            	    {
            	    // src/parser/Music.g:191:20: ( PLUS ^| MINUS ^)
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
            	            // src/parser/Music.g:191:21: PLUS ^
            	            {
            	            PLUS214=(Token)match(input,PLUS,FOLLOW_PLUS_in_num_expr2331); 
            	            PLUS214_tree = 
            	            (AmlTree)adaptor.create(PLUS214)
            	            ;
            	            root_0 = (AmlTree)adaptor.becomeRoot(PLUS214_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // src/parser/Music.g:191:29: MINUS ^
            	            {
            	            MINUS215=(Token)match(input,MINUS,FOLLOW_MINUS_in_num_expr2336); 
            	            MINUS215_tree = 
            	            (AmlTree)adaptor.create(MINUS215)
            	            ;
            	            root_0 = (AmlTree)adaptor.becomeRoot(MINUS215_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_term_in_num_expr2340);
            	    term216=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term216.getTree());

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
    // src/parser/Music.g:194:1: term : factor ( ( DOT ^| DIV ^| MOD ^) factor )* ;
    public final MusicParser.term_return term() throws RecognitionException {
        MusicParser.term_return retval = new MusicParser.term_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token DOT218=null;
        Token DIV219=null;
        Token MOD220=null;
        MusicParser.factor_return factor217 =null;

        MusicParser.factor_return factor221 =null;


        AmlTree DOT218_tree=null;
        AmlTree DIV219_tree=null;
        AmlTree MOD220_tree=null;

        try {
            // src/parser/Music.g:194:9: ( factor ( ( DOT ^| DIV ^| MOD ^) factor )* )
            // src/parser/Music.g:194:13: factor ( ( DOT ^| DIV ^| MOD ^) factor )*
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term2358);
            factor217=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor217.getTree());

            // src/parser/Music.g:194:20: ( ( DOT ^| DIV ^| MOD ^) factor )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==DIV||LA51_0==DOT||LA51_0==MOD) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // src/parser/Music.g:194:22: ( DOT ^| DIV ^| MOD ^) factor
            	    {
            	    // src/parser/Music.g:194:22: ( DOT ^| DIV ^| MOD ^)
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
            	            // src/parser/Music.g:194:23: DOT ^
            	            {
            	            DOT218=(Token)match(input,DOT,FOLLOW_DOT_in_term2363); 
            	            DOT218_tree = 
            	            (AmlTree)adaptor.create(DOT218)
            	            ;
            	            root_0 = (AmlTree)adaptor.becomeRoot(DOT218_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // src/parser/Music.g:194:30: DIV ^
            	            {
            	            DIV219=(Token)match(input,DIV,FOLLOW_DIV_in_term2368); 
            	            DIV219_tree = 
            	            (AmlTree)adaptor.create(DIV219)
            	            ;
            	            root_0 = (AmlTree)adaptor.becomeRoot(DIV219_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // src/parser/Music.g:194:37: MOD ^
            	            {
            	            MOD220=(Token)match(input,MOD,FOLLOW_MOD_in_term2373); 
            	            MOD220_tree = 
            	            (AmlTree)adaptor.create(MOD220)
            	            ;
            	            root_0 = (AmlTree)adaptor.becomeRoot(MOD220_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_factor_in_term2377);
            	    factor221=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor221.getTree());

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
    // src/parser/Music.g:197:1: factor : ( NOT ^| PLUS ^| MINUS ^)? atom ;
    public final MusicParser.factor_return factor() throws RecognitionException {
        MusicParser.factor_return retval = new MusicParser.factor_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token NOT222=null;
        Token PLUS223=null;
        Token MINUS224=null;
        MusicParser.atom_return atom225 =null;


        AmlTree NOT222_tree=null;
        AmlTree PLUS223_tree=null;
        AmlTree MINUS224_tree=null;

        try {
            // src/parser/Music.g:197:9: ( ( NOT ^| PLUS ^| MINUS ^)? atom )
            // src/parser/Music.g:197:13: ( NOT ^| PLUS ^| MINUS ^)? atom
            {
            root_0 = (AmlTree)adaptor.nil();


            // src/parser/Music.g:197:13: ( NOT ^| PLUS ^| MINUS ^)?
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
                    // src/parser/Music.g:197:14: NOT ^
                    {
                    NOT222=(Token)match(input,NOT,FOLLOW_NOT_in_factor2394); 
                    NOT222_tree = 
                    (AmlTree)adaptor.create(NOT222)
                    ;
                    root_0 = (AmlTree)adaptor.becomeRoot(NOT222_tree, root_0);


                    }
                    break;
                case 2 :
                    // src/parser/Music.g:197:21: PLUS ^
                    {
                    PLUS223=(Token)match(input,PLUS,FOLLOW_PLUS_in_factor2399); 
                    PLUS223_tree = 
                    (AmlTree)adaptor.create(PLUS223)
                    ;
                    root_0 = (AmlTree)adaptor.becomeRoot(PLUS223_tree, root_0);


                    }
                    break;
                case 3 :
                    // src/parser/Music.g:197:29: MINUS ^
                    {
                    MINUS224=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor2404); 
                    MINUS224_tree = 
                    (AmlTree)adaptor.create(MINUS224)
                    ;
                    root_0 = (AmlTree)adaptor.becomeRoot(MINUS224_tree, root_0);


                    }
                    break;

            }


            pushFollow(FOLLOW_atom_in_factor2409);
            atom225=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom225.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:200:1: atom : ( ID | NUM | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | '(' ! expr ')' !);
    public final MusicParser.atom_return atom() throws RecognitionException {
        MusicParser.atom_return retval = new MusicParser.atom_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token b=null;
        Token ID226=null;
        Token NUM227=null;
        Token char_literal228=null;
        Token char_literal230=null;
        MusicParser.expr_return expr229 =null;


        AmlTree b_tree=null;
        AmlTree ID226_tree=null;
        AmlTree NUM227_tree=null;
        AmlTree char_literal228_tree=null;
        AmlTree char_literal230_tree=null;
        RewriteRuleTokenStream stream_FALSE=new RewriteRuleTokenStream(adaptor,"token FALSE");
        RewriteRuleTokenStream stream_TRUE=new RewriteRuleTokenStream(adaptor,"token TRUE");

        try {
            // src/parser/Music.g:200:9: ( ID | NUM | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | '(' ! expr ')' !)
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
                    // src/parser/Music.g:200:13: ID
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    ID226=(Token)match(input,ID,FOLLOW_ID_in_atom2425); 
                    ID226_tree = 
                    (AmlTree)adaptor.create(ID226)
                    ;
                    adaptor.addChild(root_0, ID226_tree);


                    }
                    break;
                case 2 :
                    // src/parser/Music.g:201:7: NUM
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    NUM227=(Token)match(input,NUM,FOLLOW_NUM_in_atom2433); 
                    NUM227_tree = 
                    (AmlTree)adaptor.create(NUM227)
                    ;
                    adaptor.addChild(root_0, NUM227_tree);


                    }
                    break;
                case 3 :
                    // src/parser/Music.g:202:7: (b= TRUE |b= FALSE )
                    {
                    // src/parser/Music.g:202:7: (b= TRUE |b= FALSE )
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
                            // src/parser/Music.g:202:8: b= TRUE
                            {
                            b=(Token)match(input,TRUE,FOLLOW_TRUE_in_atom2444);  
                            stream_TRUE.add(b);


                            }
                            break;
                        case 2 :
                            // src/parser/Music.g:202:17: b= FALSE
                            {
                            b=(Token)match(input,FALSE,FOLLOW_FALSE_in_atom2450);  
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
                    // 202:27: -> ^( BOOLEAN[$b,$b.text] )
                    {
                        // src/parser/Music.g:202:30: ^( BOOLEAN[$b,$b.text] )
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
                    // src/parser/Music.g:203:7: '(' ! expr ')' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    char_literal228=(Token)match(input,77,FOLLOW_77_in_atom2467); 

                    pushFollow(FOLLOW_expr_in_atom2470);
                    expr229=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr229.getTree());

                    char_literal230=(Token)match(input,78,FOLLOW_78_in_atom2472); 

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
    public static final BitSet FOLLOW_84_in_function219 = new BitSet(new long[]{0x0000001E10008200L,0x0000000000200802L});
    public static final BitSet FOLLOW_listInst_in_function221 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_function223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_argument_in_list_arguments264 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_list_arguments267 = new BitSet(new long[]{0x0000001000000200L});
    public static final BitSet FOLLOW_argument_in_list_arguments269 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_set_in_argument311 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ID_in_argument318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_params345 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_params348 = new BitSet(new long[]{0x0284400204000000L,0x0000000000002400L});
    public static final BitSet FOLLOW_expr_in_params351 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_inst_in_listInst367 = new BitSet(new long[]{0x0000001E10008202L,0x0000000000000802L});
    public static final BitSet FOLLOW_music_inst_in_list_music_inst401 = new BitSet(new long[]{0x0008001E10008B02L,0x0000000000002822L});
    public static final BitSet FOLLOW_declaration_in_inst445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignation_in_inst463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_stmt_in_inst481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_inst499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_stmt_in_inst517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_stmt_in_inst535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_song_in_inst553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_music_inst577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignation_in_music_inst595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_music_stmt_in_music_inst613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_music_inst631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_music_stmt_in_music_inst649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_music_stmt_in_music_inst667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_song_in_music_inst685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notes_group_in_music_inst702 = new BitSet(new long[]{0x0008000000000900L,0x0000000000042020L});
    public static final BitSet FOLLOW_82_in_music_inst705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_funcall735 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_funcall737 = new BitSet(new long[]{0x0284400204000000L,0x0000000000006400L});
    public static final BitSet FOLLOW_params_in_funcall739 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_funcall742 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_funcall744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_declaration777 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_assig_opt_in_declaration786 = new BitSet(new long[]{0x0000000000000000L,0x0000000000048000L});
    public static final BitSet FOLLOW_79_in_declaration789 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_assig_opt_in_declaration792 = new BitSet(new long[]{0x0000000000000000L,0x0000000000048000L});
    public static final BitSet FOLLOW_82_in_declaration796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assig_opt822 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ASSIG_in_assig_opt825 = new BitSet(new long[]{0x0284400204000000L,0x0000000000002400L});
    public static final BitSet FOLLOW_expr_in_assig_opt828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assig_in_assignation853 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_assignation855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assig885 = new BitSet(new long[]{0x2402800000040020L});
    public static final BitSet FOLLOW_set_in_assig887 = new BitSet(new long[]{0x0284400204000000L,0x0000000000002400L});
    public static final BitSet FOLLOW_expr_in_assig902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_post_in_assig920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pre_in_assig938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_post968 = new BitSet(new long[]{0x0000000800008000L});
    public static final BitSet FOLLOW_INCR_in_post973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECR_in_post979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INCR_in_pre1026 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_DECR_in_pre1032 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ID_in_pre1035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BEAT_in_beat1078 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_NUM_in_beat1081 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_beat1083 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_NUM_in_beat1086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SPEED_in_speed1115 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_NUM_in_speed1118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRANSPORT_in_transport1143 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_NUM_in_transport1146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_stmt1175 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_while_stmt1178 = new BitSet(new long[]{0x0284400204000000L,0x0000000000002400L});
    public static final BitSet FOLLOW_expr_in_while_stmt1181 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_while_stmt1183 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_while_stmt1186 = new BitSet(new long[]{0x0000001E10008200L,0x0000000000200802L});
    public static final BitSet FOLLOW_listInst_in_while_stmt1189 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_while_stmt1191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_music_stmt1221 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_while_music_stmt1224 = new BitSet(new long[]{0x0284400204000000L,0x0000000000002400L});
    public static final BitSet FOLLOW_expr_in_while_music_stmt1227 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_while_music_stmt1229 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_while_music_stmt1232 = new BitSet(new long[]{0x0008001E10008B00L,0x0000000000202822L});
    public static final BitSet FOLLOW_list_music_inst_in_while_music_stmt1235 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_while_music_stmt1237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_for_stmt1264 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_for_stmt1267 = new BitSet(new long[]{0x0000001A00008200L});
    public static final BitSet FOLLOW_declaration_in_for_stmt1271 = new BitSet(new long[]{0x0284400204000000L,0x0000000000002400L});
    public static final BitSet FOLLOW_list_assig_in_for_stmt1275 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_for_stmt1277 = new BitSet(new long[]{0x0284400204000000L,0x0000000000002400L});
    public static final BitSet FOLLOW_expr_in_for_stmt1281 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_for_stmt1283 = new BitSet(new long[]{0x0000000A00008000L});
    public static final BitSet FOLLOW_list_assig_in_for_stmt1286 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_for_stmt1288 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_for_stmt1291 = new BitSet(new long[]{0x0000001E10008200L,0x0000000000200802L});
    public static final BitSet FOLLOW_listInst_in_for_stmt1294 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_for_stmt1296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_for_music_stmt1323 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_for_music_stmt1326 = new BitSet(new long[]{0x0000001A00008200L});
    public static final BitSet FOLLOW_declaration_in_for_music_stmt1330 = new BitSet(new long[]{0x0284400204000000L,0x0000000000002400L});
    public static final BitSet FOLLOW_list_assig_in_for_music_stmt1334 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_for_music_stmt1336 = new BitSet(new long[]{0x0284400204000000L,0x0000000000002400L});
    public static final BitSet FOLLOW_expr_in_for_music_stmt1340 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_for_music_stmt1342 = new BitSet(new long[]{0x0000000A00008000L});
    public static final BitSet FOLLOW_list_assig_in_for_music_stmt1345 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_for_music_stmt1347 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_for_music_stmt1350 = new BitSet(new long[]{0x0008001E10008B00L,0x0000000000202822L});
    public static final BitSet FOLLOW_list_music_inst_in_for_music_stmt1353 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_for_music_stmt1355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assig_in_list_assig1380 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_list_assig1383 = new BitSet(new long[]{0x0000000A00008000L});
    public static final BitSet FOLLOW_assig_in_list_assig1385 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_IF_in_if_stmt1423 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_if_stmt1426 = new BitSet(new long[]{0x0284400204000000L,0x0000000000002400L});
    public static final BitSet FOLLOW_expr_in_if_stmt1429 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_if_stmt1431 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_if_stmt1434 = new BitSet(new long[]{0x0000001E10008200L,0x0000000000200802L});
    public static final BitSet FOLLOW_listInst_in_if_stmt1437 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_if_stmt1439 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_elseif_stmt_in_if_stmt1442 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_else_stmt_in_if_stmt1445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_elseif_stmt1469 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IF_in_elseif_stmt1471 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_elseif_stmt1473 = new BitSet(new long[]{0x0284400204000000L,0x0000000000002400L});
    public static final BitSet FOLLOW_expr_in_elseif_stmt1475 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_elseif_stmt1477 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_elseif_stmt1479 = new BitSet(new long[]{0x0000001E10008200L,0x0000000000200802L});
    public static final BitSet FOLLOW_listInst_in_elseif_stmt1481 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_elseif_stmt1483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_else_stmt1518 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_else_stmt1521 = new BitSet(new long[]{0x0000001E10008200L,0x0000000000200802L});
    public static final BitSet FOLLOW_listInst_in_else_stmt1524 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_else_stmt1526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_if_music_stmt1554 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_if_music_stmt1557 = new BitSet(new long[]{0x0284400204000000L,0x0000000000002400L});
    public static final BitSet FOLLOW_expr_in_if_music_stmt1560 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_if_music_stmt1562 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_if_music_stmt1565 = new BitSet(new long[]{0x0008001E10008B00L,0x0000000000202822L});
    public static final BitSet FOLLOW_list_music_inst_in_if_music_stmt1568 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_if_music_stmt1570 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_elseif_music_stmt_in_if_music_stmt1573 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_else_music_stmt_in_if_music_stmt1576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_elseif_music_stmt1600 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IF_in_elseif_music_stmt1602 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_elseif_music_stmt1604 = new BitSet(new long[]{0x0284400204000000L,0x0000000000002400L});
    public static final BitSet FOLLOW_expr_in_elseif_music_stmt1606 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_elseif_music_stmt1608 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_elseif_music_stmt1610 = new BitSet(new long[]{0x0008001E10008B00L,0x0000000000202822L});
    public static final BitSet FOLLOW_list_music_inst_in_elseif_music_stmt1612 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_elseif_music_stmt1614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_else_music_stmt1649 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_else_music_stmt1652 = new BitSet(new long[]{0x0008001E10008B00L,0x0000000000202822L});
    public static final BitSet FOLLOW_list_music_inst_in_else_music_stmt1655 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_else_music_stmt1657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SONG_in_song1688 = new BitSet(new long[]{0x0000000200000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_song1691 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_song1694 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_beat_in_song1697 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_speed_in_song1699 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000300L});
    public static final BitSet FOLLOW_transport_in_song1701 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_track_in_song1705 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200100L});
    public static final BitSet FOLLOW_85_in_song1709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRACK_in_track1739 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_track1742 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_STRING_in_track1745 = new BitSet(new long[]{0x0080000000100000L,0x0000000000000008L});
    public static final BitSet FOLLOW_compas_aux_in_track1747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compas_list_in_compas_aux1771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_BAR_in_compas_list1801 = new BitSet(new long[]{0x0088001E10108B02L,0x00000000000028AAL});
    public static final BitSet FOLLOW_repetition_in_compas_list1806 = new BitSet(new long[]{0x0088001E10108B02L,0x00000000000028AAL});
    public static final BitSet FOLLOW_compasses_in_compas_list1810 = new BitSet(new long[]{0x0088001E10108B02L,0x00000000000028AAL});
    public static final BitSet FOLLOW_repetition_in_compas_list1814 = new BitSet(new long[]{0x0088001E10108B02L,0x00000000000028AAL});
    public static final BitSet FOLLOW_DOUBLE_BAR_in_compas_list1819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compas_in_compasses1849 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_BAR_in_compasses1852 = new BitSet(new long[]{0x0008001E10008B00L,0x00000000000028A2L});
    public static final BitSet FOLLOW_compas_in_compasses1855 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_NUM_in_repetition1869 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_repetition1871 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_START_REPETITION_in_repetition1875 = new BitSet(new long[]{0x0008001E10008B00L,0x00000000000028A2L});
    public static final BitSet FOLLOW_compasses_in_repetition1877 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_END_REPETITION_in_repetition1879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tone_in_compas1920 = new BitSet(new long[]{0x0008001E10008B00L,0x0000000000002822L});
    public static final BitSet FOLLOW_music_inst_in_compas1933 = new BitSet(new long[]{0x0008001E10008B02L,0x0000000000002822L});
    public static final BitSet FOLLOW_TONE_in_tone1980 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_NUM_in_tone1983 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000020L});
    public static final BitSet FOLLOW_set_in_tone1985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notes_type_in_notes_group2014 = new BitSet(new long[]{0x0000000000080002L,0x0000000000010040L});
    public static final BitSet FOLLOW_80_in_notes_group2017 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_FIGURE_in_notes_group2019 = new BitSet(new long[]{0x0000000000080002L,0x0000000000000040L});
    public static final BitSet FOLLOW_DOT_in_notes_group2023 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_TIE_in_notes_group2026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_chord_in_notes_type2066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notes_in_notes_type2070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHORD_in_chord2086 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_chord2089 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_NOTE_in_chord2092 = new BitSet(new long[]{0x0200300000010000L,0x0000000000004001L});
    public static final BitSet FOLLOW_78_in_chord2110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_notes2142 = new BitSet(new long[]{0x0008000000000100L,0x0000000000000020L});
    public static final BitSet FOLLOW_note_in_notes2145 = new BitSet(new long[]{0x0008000000000100L,0x0000000000004020L});
    public static final BitSet FOLLOW_78_in_notes2149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_note_in_notes2154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOTE_in_note2203 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_MINUS_in_note2207 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_NUM_in_note2210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolterm_in_expr2239 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_OR_in_expr2242 = new BitSet(new long[]{0x0284400204000000L,0x0000000000002400L});
    public static final BitSet FOLLOW_boolterm_in_expr2245 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_boolfact_in_boolterm2259 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_boolterm2262 = new BitSet(new long[]{0x0284400204000000L,0x0000000000002400L});
    public static final BitSet FOLLOW_boolfact_in_boolterm2265 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_num_expr_in_boolfact2279 = new BitSet(new long[]{0x0040082181000002L});
    public static final BitSet FOLLOW_EQUAL_in_boolfact2283 = new BitSet(new long[]{0x0284400204000000L,0x0000000000002400L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_boolfact2288 = new BitSet(new long[]{0x0284400204000000L,0x0000000000002400L});
    public static final BitSet FOLLOW_LT_in_boolfact2293 = new BitSet(new long[]{0x0284400204000000L,0x0000000000002400L});
    public static final BitSet FOLLOW_LE_in_boolfact2298 = new BitSet(new long[]{0x0284400204000000L,0x0000000000002400L});
    public static final BitSet FOLLOW_GT_in_boolfact2303 = new BitSet(new long[]{0x0284400204000000L,0x0000000000002400L});
    public static final BitSet FOLLOW_GE_in_boolfact2308 = new BitSet(new long[]{0x0284400204000000L,0x0000000000002400L});
    public static final BitSet FOLLOW_num_expr_in_boolfact2312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_num_expr2326 = new BitSet(new long[]{0x0200400000000002L});
    public static final BitSet FOLLOW_PLUS_in_num_expr2331 = new BitSet(new long[]{0x0284400204000000L,0x0000000000002400L});
    public static final BitSet FOLLOW_MINUS_in_num_expr2336 = new BitSet(new long[]{0x0284400204000000L,0x0000000000002400L});
    public static final BitSet FOLLOW_term_in_num_expr2340 = new BitSet(new long[]{0x0200400000000002L});
    public static final BitSet FOLLOW_factor_in_term2358 = new BitSet(new long[]{0x00010000000A0002L});
    public static final BitSet FOLLOW_DOT_in_term2363 = new BitSet(new long[]{0x0284400204000000L,0x0000000000002400L});
    public static final BitSet FOLLOW_DIV_in_term2368 = new BitSet(new long[]{0x0284400204000000L,0x0000000000002400L});
    public static final BitSet FOLLOW_MOD_in_term2373 = new BitSet(new long[]{0x0284400204000000L,0x0000000000002400L});
    public static final BitSet FOLLOW_factor_in_term2377 = new BitSet(new long[]{0x00010000000A0002L});
    public static final BitSet FOLLOW_NOT_in_factor2394 = new BitSet(new long[]{0x0080000204000000L,0x0000000000002400L});
    public static final BitSet FOLLOW_PLUS_in_factor2399 = new BitSet(new long[]{0x0080000204000000L,0x0000000000002400L});
    public static final BitSet FOLLOW_MINUS_in_factor2404 = new BitSet(new long[]{0x0080000204000000L,0x0000000000002400L});
    public static final BitSet FOLLOW_atom_in_factor2409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom2425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUM_in_atom2433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_atom2444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_atom2450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_atom2467 = new BitSet(new long[]{0x0284400204000000L,0x0000000000002400L});
    public static final BitSet FOLLOW_expr_in_atom2470 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_atom2472 = new BitSet(new long[]{0x0000000000000002L});

}