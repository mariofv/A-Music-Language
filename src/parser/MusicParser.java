// $ANTLR 3.4 src/parser/Music.g 2017-04-05 17:07:53

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ASSIG", "BAR", "BEAT", "BEMOL", "BOOL", "BOOLEAN", "CHORD", "COMMENT", "COMPAS", "COMPAS_LIST", "DECR", "DIMINUTION", "DIV", "DIVIDE_ASSIG", "DOT", "DOUBLE_BAR", "ELSE", "ELSEIF", "END_REPETITION", "EQUAL", "ESC_SEQ", "FALSE", "FIGURE", "FOR", "FUNCALL", "FUNCTION", "GE", "GT", "ID", "IF", "INCR", "INT", "LE", "LIST_ARGUMENTS", "LIST_FUNCTIONS", "LIST_INSTRUCTIONS", "LT", "MAJ7", "MINOR", "MINUS", "MINUS_ASSIG", "MOD", "MOD_ASSIG", "NOT", "NOTE", "NOTES", "NOTE_LIST", "NOT_EQUAL", "NUM", "OR", "PLUS", "PLUS_ASSIG", "POST", "PRE", "PROD_ASSIG", "REPETITION", "RETURN", "SEVENTH", "SONG", "SPEED", "START_REPETITION", "STRING", "SUSTAIN", "TIE", "TONE", "TRACK", "TRANSPORT", "TRUE", "WHILE", "WS", "'('", "')'", "','", "'.'", "':'", "';'", "'x'", "'{'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
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
    public static final int LIST_FUNCTIONS=39;
    public static final int LIST_INSTRUCTIONS=40;
    public static final int LT=41;
    public static final int MAJ7=42;
    public static final int MINOR=43;
    public static final int MINUS=44;
    public static final int MINUS_ASSIG=45;
    public static final int MOD=46;
    public static final int MOD_ASSIG=47;
    public static final int NOT=48;
    public static final int NOTE=49;
    public static final int NOTES=50;
    public static final int NOTE_LIST=51;
    public static final int NOT_EQUAL=52;
    public static final int NUM=53;
    public static final int OR=54;
    public static final int PLUS=55;
    public static final int PLUS_ASSIG=56;
    public static final int POST=57;
    public static final int PRE=58;
    public static final int PROD_ASSIG=59;
    public static final int REPETITION=60;
    public static final int RETURN=61;
    public static final int SEVENTH=62;
    public static final int SONG=63;
    public static final int SPEED=64;
    public static final int START_REPETITION=65;
    public static final int STRING=66;
    public static final int SUSTAIN=67;
    public static final int TIE=68;
    public static final int TONE=69;
    public static final int TRACK=70;
    public static final int TRANSPORT=71;
    public static final int TRUE=72;
    public static final int WHILE=73;
    public static final int WS=74;

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
    // src/parser/Music.g:37:1: prog : ( function )+ EOF -> ^( LIST_FUNCTIONS ( function )+ ) ;
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
            // src/parser/Music.g:37:10: ( ( function )+ EOF -> ^( LIST_FUNCTIONS ( function )+ ) )
            // src/parser/Music.g:37:14: ( function )+ EOF
            {
            // src/parser/Music.g:37:14: ( function )+
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
            	    // src/parser/Music.g:37:14: function
            	    {
            	    pushFollow(FOLLOW_function_in_prog164);
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


            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_prog167);  
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
            // 37:28: -> ^( LIST_FUNCTIONS ( function )+ )
            {
                // src/parser/Music.g:37:31: ^( LIST_FUNCTIONS ( function )+ )
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
    // src/parser/Music.g:40:1: function : id= ID '(' list_arguments ')' '{' listInst '}' -> ^( FUNCTION[$id.text] list_arguments listInst ) ;
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
        RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
        RewriteRuleSubtreeStream stream_listInst=new RewriteRuleSubtreeStream(adaptor,"rule listInst");
        RewriteRuleSubtreeStream stream_list_arguments=new RewriteRuleSubtreeStream(adaptor,"rule list_arguments");
        try {
            // src/parser/Music.g:40:13: (id= ID '(' list_arguments ')' '{' listInst '}' -> ^( FUNCTION[$id.text] list_arguments listInst ) )
            // src/parser/Music.g:40:17: id= ID '(' list_arguments ')' '{' listInst '}'
            {
            id=(Token)match(input,ID,FOLLOW_ID_in_function204);  
            stream_ID.add(id);


            char_literal3=(Token)match(input,75,FOLLOW_75_in_function206);  
            stream_75.add(char_literal3);


            pushFollow(FOLLOW_list_arguments_in_function208);
            list_arguments4=list_arguments();

            state._fsp--;

            stream_list_arguments.add(list_arguments4.getTree());

            char_literal5=(Token)match(input,76,FOLLOW_76_in_function210);  
            stream_76.add(char_literal5);


            char_literal6=(Token)match(input,82,FOLLOW_82_in_function212);  
            stream_82.add(char_literal6);


            pushFollow(FOLLOW_listInst_in_function214);
            listInst7=listInst();

            state._fsp--;

            stream_listInst.add(listInst7.getTree());

            char_literal8=(Token)match(input,83,FOLLOW_83_in_function216);  
            stream_83.add(char_literal8);


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
            // 40:66: -> ^( FUNCTION[$id.text] list_arguments listInst )
            {
                // src/parser/Music.g:40:71: ^( FUNCTION[$id.text] list_arguments listInst )
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
    // src/parser/Music.g:45:1: list_arguments : ( argument ( ',' argument )* )? -> ^( LIST_ARGUMENTS ( argument )* ) ;
    public final MusicParser.list_arguments_return list_arguments() throws RecognitionException {
        MusicParser.list_arguments_return retval = new MusicParser.list_arguments_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal10=null;
        MusicParser.argument_return argument9 =null;

        MusicParser.argument_return argument11 =null;


        AmlTree char_literal10_tree=null;
        RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
        RewriteRuleSubtreeStream stream_argument=new RewriteRuleSubtreeStream(adaptor,"rule argument");
        try {
            // src/parser/Music.g:45:17: ( ( argument ( ',' argument )* )? -> ^( LIST_ARGUMENTS ( argument )* ) )
            // src/parser/Music.g:45:19: ( argument ( ',' argument )* )?
            {
            // src/parser/Music.g:45:19: ( argument ( ',' argument )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==BOOL||LA3_0==INT) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // src/parser/Music.g:45:20: argument ( ',' argument )*
                    {
                    pushFollow(FOLLOW_argument_in_list_arguments257);
                    argument9=argument();

                    state._fsp--;

                    stream_argument.add(argument9.getTree());

                    // src/parser/Music.g:45:29: ( ',' argument )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==77) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // src/parser/Music.g:45:30: ',' argument
                    	    {
                    	    char_literal10=(Token)match(input,77,FOLLOW_77_in_list_arguments260);  
                    	    stream_77.add(char_literal10);


                    	    pushFollow(FOLLOW_argument_in_list_arguments262);
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
            // 45:47: -> ^( LIST_ARGUMENTS ( argument )* )
            {
                // src/parser/Music.g:45:50: ^( LIST_ARGUMENTS ( argument )* )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(LIST_ARGUMENTS, "LIST_ARGUMENTS")
                , root_1);

                // src/parser/Music.g:45:67: ( argument )*
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
    // src/parser/Music.g:48:1: argument : ( ( INT | BOOL ) ^ ID ) ;
    public final MusicParser.argument_return argument() throws RecognitionException {
        MusicParser.argument_return retval = new MusicParser.argument_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token set12=null;
        Token ID13=null;

        AmlTree set12_tree=null;
        AmlTree ID13_tree=null;

        try {
            // src/parser/Music.g:48:11: ( ( ( INT | BOOL ) ^ ID ) )
            // src/parser/Music.g:48:15: ( ( INT | BOOL ) ^ ID )
            {
            root_0 = (AmlTree)adaptor.nil();


            // src/parser/Music.g:48:15: ( ( INT | BOOL ) ^ ID )
            // src/parser/Music.g:48:16: ( INT | BOOL ) ^ ID
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


            ID13=(Token)match(input,ID,FOLLOW_ID_in_argument311); 
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
    // src/parser/Music.g:51:1: params : expr ( ',' ! expr )* ;
    public final MusicParser.params_return params() throws RecognitionException {
        MusicParser.params_return retval = new MusicParser.params_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal15=null;
        MusicParser.expr_return expr14 =null;

        MusicParser.expr_return expr16 =null;


        AmlTree char_literal15_tree=null;

        try {
            // src/parser/Music.g:51:13: ( expr ( ',' ! expr )* )
            // src/parser/Music.g:51:17: expr ( ',' ! expr )*
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_expr_in_params338);
            expr14=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr14.getTree());

            // src/parser/Music.g:51:22: ( ',' ! expr )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==77) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // src/parser/Music.g:51:23: ',' ! expr
            	    {
            	    char_literal15=(Token)match(input,77,FOLLOW_77_in_params341); 

            	    pushFollow(FOLLOW_expr_in_params344);
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
    // src/parser/Music.g:53:1: listInst : ( inst )* -> ^( LIST_INSTRUCTIONS ( inst )* ) ;
    public final MusicParser.listInst_return listInst() throws RecognitionException {
        MusicParser.listInst_return retval = new MusicParser.listInst_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        MusicParser.inst_return inst17 =null;


        RewriteRuleSubtreeStream stream_inst=new RewriteRuleSubtreeStream(adaptor,"rule inst");
        try {
            // src/parser/Music.g:53:13: ( ( inst )* -> ^( LIST_INSTRUCTIONS ( inst )* ) )
            // src/parser/Music.g:53:17: ( inst )*
            {
            // src/parser/Music.g:53:17: ( inst )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==BOOL||LA5_0==DECR||LA5_0==FOR||(LA5_0 >= ID && LA5_0 <= INT)||LA5_0==SONG||LA5_0==WHILE) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // src/parser/Music.g:53:18: inst
            	    {
            	    pushFollow(FOLLOW_inst_in_listInst360);
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
            // 53:25: -> ^( LIST_INSTRUCTIONS ( inst )* )
            {
                // src/parser/Music.g:53:28: ^( LIST_INSTRUCTIONS ( inst )* )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(LIST_INSTRUCTIONS, "LIST_INSTRUCTIONS")
                , root_1);

                // src/parser/Music.g:53:48: ( inst )*
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


    public static class inst_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "inst"
    // src/parser/Music.g:56:1: inst : ( declaration | assignation | while_stmt | funcall | for_stmt | if_stmt | song );
    public final MusicParser.inst_return inst() throws RecognitionException {
        MusicParser.inst_return retval = new MusicParser.inst_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        MusicParser.declaration_return declaration18 =null;

        MusicParser.assignation_return assignation19 =null;

        MusicParser.while_stmt_return while_stmt20 =null;

        MusicParser.funcall_return funcall21 =null;

        MusicParser.for_stmt_return for_stmt22 =null;

        MusicParser.if_stmt_return if_stmt23 =null;

        MusicParser.song_return song24 =null;



        try {
            // src/parser/Music.g:56:13: ( declaration | assignation | while_stmt | funcall | for_stmt | if_stmt | song )
            int alt6=7;
            switch ( input.LA(1) ) {
            case BOOL:
            case INT:
                {
                alt6=1;
                }
                break;
            case ID:
                {
                int LA6_2 = input.LA(2);

                if ( (LA6_2==ASSIG||LA6_2==DECR||LA6_2==DIVIDE_ASSIG||LA6_2==INCR||LA6_2==MINUS_ASSIG||LA6_2==MOD_ASSIG||LA6_2==PLUS_ASSIG||LA6_2==PROD_ASSIG) ) {
                    alt6=2;
                }
                else if ( (LA6_2==75) ) {
                    alt6=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;

                }
                }
                break;
            case DECR:
            case INCR:
                {
                alt6=2;
                }
                break;
            case WHILE:
                {
                alt6=3;
                }
                break;
            case FOR:
                {
                alt6=5;
                }
                break;
            case IF:
                {
                alt6=6;
                }
                break;
            case SONG:
                {
                alt6=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }

            switch (alt6) {
                case 1 :
                    // src/parser/Music.g:56:17: declaration
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_declaration_in_inst401);
                    declaration18=declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, declaration18.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:57:17: assignation
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_assignation_in_inst419);
                    assignation19=assignation();

                    state._fsp--;

                    adaptor.addChild(root_0, assignation19.getTree());

                    }
                    break;
                case 3 :
                    // src/parser/Music.g:58:17: while_stmt
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_while_stmt_in_inst437);
                    while_stmt20=while_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, while_stmt20.getTree());

                    }
                    break;
                case 4 :
                    // src/parser/Music.g:59:17: funcall
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_inst455);
                    funcall21=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall21.getTree());

                    }
                    break;
                case 5 :
                    // src/parser/Music.g:60:17: for_stmt
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_for_stmt_in_inst473);
                    for_stmt22=for_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, for_stmt22.getTree());

                    }
                    break;
                case 6 :
                    // src/parser/Music.g:61:17: if_stmt
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_if_stmt_in_inst491);
                    if_stmt23=if_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, if_stmt23.getTree());

                    }
                    break;
                case 7 :
                    // src/parser/Music.g:62:17: song
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_song_in_inst509);
                    song24=song();

                    state._fsp--;

                    adaptor.addChild(root_0, song24.getTree());

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


    public static class funcall_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "funcall"
    // src/parser/Music.g:65:1: funcall : id= ID '(' ( params )? ')' ';' -> ^( FUNCALL[$id.text] ( params )? ) ;
    public final MusicParser.funcall_return funcall() throws RecognitionException {
        MusicParser.funcall_return retval = new MusicParser.funcall_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token id=null;
        Token char_literal25=null;
        Token char_literal27=null;
        Token char_literal28=null;
        MusicParser.params_return params26 =null;


        AmlTree id_tree=null;
        AmlTree char_literal25_tree=null;
        AmlTree char_literal27_tree=null;
        AmlTree char_literal28_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_80=new RewriteRuleTokenStream(adaptor,"token 80");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
        RewriteRuleSubtreeStream stream_params=new RewriteRuleSubtreeStream(adaptor,"rule params");
        try {
            // src/parser/Music.g:65:13: (id= ID '(' ( params )? ')' ';' -> ^( FUNCALL[$id.text] ( params )? ) )
            // src/parser/Music.g:65:17: id= ID '(' ( params )? ')' ';'
            {
            id=(Token)match(input,ID,FOLLOW_ID_in_funcall538);  
            stream_ID.add(id);


            char_literal25=(Token)match(input,75,FOLLOW_75_in_funcall540);  
            stream_75.add(char_literal25);


            // src/parser/Music.g:65:27: ( params )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==FALSE||LA7_0==ID||LA7_0==MINUS||LA7_0==NOT||LA7_0==NUM||LA7_0==PLUS||LA7_0==TRUE||LA7_0==75) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // src/parser/Music.g:65:27: params
                    {
                    pushFollow(FOLLOW_params_in_funcall542);
                    params26=params();

                    state._fsp--;

                    stream_params.add(params26.getTree());

                    }
                    break;

            }


            char_literal27=(Token)match(input,76,FOLLOW_76_in_funcall545);  
            stream_76.add(char_literal27);


            char_literal28=(Token)match(input,80,FOLLOW_80_in_funcall547);  
            stream_80.add(char_literal28);


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
            // 65:43: -> ^( FUNCALL[$id.text] ( params )? )
            {
                // src/parser/Music.g:65:46: ^( FUNCALL[$id.text] ( params )? )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(FUNCALL, (id!=null?id.getText():null))
                , root_1);

                // src/parser/Music.g:65:66: ( params )?
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
    // src/parser/Music.g:68:1: declaration : ( INT | BOOL ) ^ assig_opt ( ',' ! assig_opt )* ';' !;
    public final MusicParser.declaration_return declaration() throws RecognitionException {
        MusicParser.declaration_return retval = new MusicParser.declaration_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token set29=null;
        Token char_literal31=null;
        Token char_literal33=null;
        MusicParser.assig_opt_return assig_opt30 =null;

        MusicParser.assig_opt_return assig_opt32 =null;


        AmlTree set29_tree=null;
        AmlTree char_literal31_tree=null;
        AmlTree char_literal33_tree=null;

        try {
            // src/parser/Music.g:68:13: ( ( INT | BOOL ) ^ assig_opt ( ',' ! assig_opt )* ';' !)
            // src/parser/Music.g:68:17: ( INT | BOOL ) ^ assig_opt ( ',' ! assig_opt )* ';' !
            {
            root_0 = (AmlTree)adaptor.nil();


            set29=(Token)input.LT(1);

            set29=(Token)input.LT(1);

            if ( input.LA(1)==BOOL||input.LA(1)==INT ) {
                input.consume();
                root_0 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(set29)
                , root_0);
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            pushFollow(FOLLOW_assig_opt_in_declaration589);
            assig_opt30=assig_opt();

            state._fsp--;

            adaptor.addChild(root_0, assig_opt30.getTree());

            // src/parser/Music.g:68:41: ( ',' ! assig_opt )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==77) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // src/parser/Music.g:68:42: ',' ! assig_opt
            	    {
            	    char_literal31=(Token)match(input,77,FOLLOW_77_in_declaration592); 

            	    pushFollow(FOLLOW_assig_opt_in_declaration595);
            	    assig_opt32=assig_opt();

            	    state._fsp--;

            	    adaptor.addChild(root_0, assig_opt32.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            char_literal33=(Token)match(input,80,FOLLOW_80_in_declaration599); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:71:1: assig_opt : ID ( ASSIG ^ expr )? ;
    public final MusicParser.assig_opt_return assig_opt() throws RecognitionException {
        MusicParser.assig_opt_return retval = new MusicParser.assig_opt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token ID34=null;
        Token ASSIG35=null;
        MusicParser.expr_return expr36 =null;


        AmlTree ID34_tree=null;
        AmlTree ASSIG35_tree=null;

        try {
            // src/parser/Music.g:71:13: ( ID ( ASSIG ^ expr )? )
            // src/parser/Music.g:71:17: ID ( ASSIG ^ expr )?
            {
            root_0 = (AmlTree)adaptor.nil();


            ID34=(Token)match(input,ID,FOLLOW_ID_in_assig_opt625); 
            ID34_tree = 
            (AmlTree)adaptor.create(ID34)
            ;
            adaptor.addChild(root_0, ID34_tree);


            // src/parser/Music.g:71:20: ( ASSIG ^ expr )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==ASSIG) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // src/parser/Music.g:71:21: ASSIG ^ expr
                    {
                    ASSIG35=(Token)match(input,ASSIG,FOLLOW_ASSIG_in_assig_opt628); 
                    ASSIG35_tree = 
                    (AmlTree)adaptor.create(ASSIG35)
                    ;
                    root_0 = (AmlTree)adaptor.becomeRoot(ASSIG35_tree, root_0);


                    pushFollow(FOLLOW_expr_in_assig_opt631);
                    expr36=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr36.getTree());

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
    // src/parser/Music.g:74:1: assignation : assig ';' !;
    public final MusicParser.assignation_return assignation() throws RecognitionException {
        MusicParser.assignation_return retval = new MusicParser.assignation_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal38=null;
        MusicParser.assig_return assig37 =null;


        AmlTree char_literal38_tree=null;

        try {
            // src/parser/Music.g:74:13: ( assig ';' !)
            // src/parser/Music.g:74:17: assig ';' !
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_assig_in_assignation656);
            assig37=assig();

            state._fsp--;

            adaptor.addChild(root_0, assig37.getTree());

            char_literal38=(Token)match(input,80,FOLLOW_80_in_assignation658); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:77:1: assig : ( ID ( ASSIG | PLUS_ASSIG | MINUS_ASSIG | PROD_ASSIG | DIVIDE_ASSIG | MOD_ASSIG ) ^ expr | post | pre );
    public final MusicParser.assig_return assig() throws RecognitionException {
        MusicParser.assig_return retval = new MusicParser.assig_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token ID39=null;
        Token set40=null;
        MusicParser.expr_return expr41 =null;

        MusicParser.post_return post42 =null;

        MusicParser.pre_return pre43 =null;


        AmlTree ID39_tree=null;
        AmlTree set40_tree=null;

        try {
            // src/parser/Music.g:77:13: ( ID ( ASSIG | PLUS_ASSIG | MINUS_ASSIG | PROD_ASSIG | DIVIDE_ASSIG | MOD_ASSIG ) ^ expr | post | pre )
            int alt10=3;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==ID) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==ASSIG||LA10_1==DIVIDE_ASSIG||LA10_1==MINUS_ASSIG||LA10_1==MOD_ASSIG||LA10_1==PLUS_ASSIG||LA10_1==PROD_ASSIG) ) {
                    alt10=1;
                }
                else if ( (LA10_1==DECR||LA10_1==INCR) ) {
                    alt10=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA10_0==DECR||LA10_0==INCR) ) {
                alt10=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }
            switch (alt10) {
                case 1 :
                    // src/parser/Music.g:77:17: ID ( ASSIG | PLUS_ASSIG | MINUS_ASSIG | PROD_ASSIG | DIVIDE_ASSIG | MOD_ASSIG ) ^ expr
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    ID39=(Token)match(input,ID,FOLLOW_ID_in_assig688); 
                    ID39_tree = 
                    (AmlTree)adaptor.create(ID39)
                    ;
                    adaptor.addChild(root_0, ID39_tree);


                    set40=(Token)input.LT(1);

                    set40=(Token)input.LT(1);

                    if ( input.LA(1)==ASSIG||input.LA(1)==DIVIDE_ASSIG||input.LA(1)==MINUS_ASSIG||input.LA(1)==MOD_ASSIG||input.LA(1)==PLUS_ASSIG||input.LA(1)==PROD_ASSIG ) {
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


                    pushFollow(FOLLOW_expr_in_assig705);
                    expr41=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr41.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:78:17: post
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_post_in_assig723);
                    post42=post();

                    state._fsp--;

                    adaptor.addChild(root_0, post42.getTree());

                    }
                    break;
                case 3 :
                    // src/parser/Music.g:79:17: pre
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_pre_in_assig741);
                    pre43=pre();

                    state._fsp--;

                    adaptor.addChild(root_0, pre43.getTree());

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
    // src/parser/Music.g:82:1: post : ID (x= INCR |x= DECR ) -> ^( POST ID $x) ;
    public final MusicParser.post_return post() throws RecognitionException {
        MusicParser.post_return retval = new MusicParser.post_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token x=null;
        Token ID44=null;

        AmlTree x_tree=null;
        AmlTree ID44_tree=null;
        RewriteRuleTokenStream stream_DECR=new RewriteRuleTokenStream(adaptor,"token DECR");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_INCR=new RewriteRuleTokenStream(adaptor,"token INCR");

        try {
            // src/parser/Music.g:82:13: ( ID (x= INCR |x= DECR ) -> ^( POST ID $x) )
            // src/parser/Music.g:82:17: ID (x= INCR |x= DECR )
            {
            ID44=(Token)match(input,ID,FOLLOW_ID_in_post771);  
            stream_ID.add(ID44);


            // src/parser/Music.g:82:20: (x= INCR |x= DECR )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==INCR) ) {
                alt11=1;
            }
            else if ( (LA11_0==DECR) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }
            switch (alt11) {
                case 1 :
                    // src/parser/Music.g:82:21: x= INCR
                    {
                    x=(Token)match(input,INCR,FOLLOW_INCR_in_post776);  
                    stream_INCR.add(x);


                    }
                    break;
                case 2 :
                    // src/parser/Music.g:82:30: x= DECR
                    {
                    x=(Token)match(input,DECR,FOLLOW_DECR_in_post782);  
                    stream_DECR.add(x);


                    }
                    break;

            }


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
            // 82:38: -> ^( POST ID $x)
            {
                // src/parser/Music.g:82:42: ^( POST ID $x)
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
    // src/parser/Music.g:85:1: pre : (x= INCR |x= DECR ) ID -> ^( PRE ID $x) ;
    public final MusicParser.pre_return pre() throws RecognitionException {
        MusicParser.pre_return retval = new MusicParser.pre_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token x=null;
        Token ID45=null;

        AmlTree x_tree=null;
        AmlTree ID45_tree=null;
        RewriteRuleTokenStream stream_DECR=new RewriteRuleTokenStream(adaptor,"token DECR");
        RewriteRuleTokenStream stream_INCR=new RewriteRuleTokenStream(adaptor,"token INCR");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // src/parser/Music.g:85:13: ( (x= INCR |x= DECR ) ID -> ^( PRE ID $x) )
            // src/parser/Music.g:85:17: (x= INCR |x= DECR ) ID
            {
            // src/parser/Music.g:85:17: (x= INCR |x= DECR )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==INCR) ) {
                alt12=1;
            }
            else if ( (LA12_0==DECR) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }
            switch (alt12) {
                case 1 :
                    // src/parser/Music.g:85:18: x= INCR
                    {
                    x=(Token)match(input,INCR,FOLLOW_INCR_in_pre829);  
                    stream_INCR.add(x);


                    }
                    break;
                case 2 :
                    // src/parser/Music.g:85:27: x= DECR
                    {
                    x=(Token)match(input,DECR,FOLLOW_DECR_in_pre835);  
                    stream_DECR.add(x);


                    }
                    break;

            }


            ID45=(Token)match(input,ID,FOLLOW_ID_in_pre838);  
            stream_ID.add(ID45);


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
            // 85:39: -> ^( PRE ID $x)
            {
                // src/parser/Music.g:85:42: ^( PRE ID $x)
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
    // src/parser/Music.g:88:1: beat : BEAT ^ NUM ':' ! NUM ;
    public final MusicParser.beat_return beat() throws RecognitionException {
        MusicParser.beat_return retval = new MusicParser.beat_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token BEAT46=null;
        Token NUM47=null;
        Token char_literal48=null;
        Token NUM49=null;

        AmlTree BEAT46_tree=null;
        AmlTree NUM47_tree=null;
        AmlTree char_literal48_tree=null;
        AmlTree NUM49_tree=null;

        try {
            // src/parser/Music.g:88:13: ( BEAT ^ NUM ':' ! NUM )
            // src/parser/Music.g:88:17: BEAT ^ NUM ':' ! NUM
            {
            root_0 = (AmlTree)adaptor.nil();


            BEAT46=(Token)match(input,BEAT,FOLLOW_BEAT_in_beat881); 
            BEAT46_tree = 
            (AmlTree)adaptor.create(BEAT46)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(BEAT46_tree, root_0);


            NUM47=(Token)match(input,NUM,FOLLOW_NUM_in_beat884); 
            NUM47_tree = 
            (AmlTree)adaptor.create(NUM47)
            ;
            adaptor.addChild(root_0, NUM47_tree);


            char_literal48=(Token)match(input,79,FOLLOW_79_in_beat886); 

            NUM49=(Token)match(input,NUM,FOLLOW_NUM_in_beat889); 
            NUM49_tree = 
            (AmlTree)adaptor.create(NUM49)
            ;
            adaptor.addChild(root_0, NUM49_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:91:1: speed : SPEED ^ NUM ;
    public final MusicParser.speed_return speed() throws RecognitionException {
        MusicParser.speed_return retval = new MusicParser.speed_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token SPEED50=null;
        Token NUM51=null;

        AmlTree SPEED50_tree=null;
        AmlTree NUM51_tree=null;

        try {
            // src/parser/Music.g:91:13: ( SPEED ^ NUM )
            // src/parser/Music.g:91:17: SPEED ^ NUM
            {
            root_0 = (AmlTree)adaptor.nil();


            SPEED50=(Token)match(input,SPEED,FOLLOW_SPEED_in_speed918); 
            SPEED50_tree = 
            (AmlTree)adaptor.create(SPEED50)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(SPEED50_tree, root_0);


            NUM51=(Token)match(input,NUM,FOLLOW_NUM_in_speed921); 
            NUM51_tree = 
            (AmlTree)adaptor.create(NUM51)
            ;
            adaptor.addChild(root_0, NUM51_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:94:1: transport : TRANSPORT ^ NUM ;
    public final MusicParser.transport_return transport() throws RecognitionException {
        MusicParser.transport_return retval = new MusicParser.transport_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token TRANSPORT52=null;
        Token NUM53=null;

        AmlTree TRANSPORT52_tree=null;
        AmlTree NUM53_tree=null;

        try {
            // src/parser/Music.g:94:13: ( TRANSPORT ^ NUM )
            // src/parser/Music.g:94:17: TRANSPORT ^ NUM
            {
            root_0 = (AmlTree)adaptor.nil();


            TRANSPORT52=(Token)match(input,TRANSPORT,FOLLOW_TRANSPORT_in_transport946); 
            TRANSPORT52_tree = 
            (AmlTree)adaptor.create(TRANSPORT52)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(TRANSPORT52_tree, root_0);


            NUM53=(Token)match(input,NUM,FOLLOW_NUM_in_transport949); 
            NUM53_tree = 
            (AmlTree)adaptor.create(NUM53)
            ;
            adaptor.addChild(root_0, NUM53_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:97:1: while_stmt : WHILE ^ '(' ! expr ')' ! '{' ! listInst '}' !;
    public final MusicParser.while_stmt_return while_stmt() throws RecognitionException {
        MusicParser.while_stmt_return retval = new MusicParser.while_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token WHILE54=null;
        Token char_literal55=null;
        Token char_literal57=null;
        Token char_literal58=null;
        Token char_literal60=null;
        MusicParser.expr_return expr56 =null;

        MusicParser.listInst_return listInst59 =null;


        AmlTree WHILE54_tree=null;
        AmlTree char_literal55_tree=null;
        AmlTree char_literal57_tree=null;
        AmlTree char_literal58_tree=null;
        AmlTree char_literal60_tree=null;

        try {
            // src/parser/Music.g:97:18: ( WHILE ^ '(' ! expr ')' ! '{' ! listInst '}' !)
            // src/parser/Music.g:97:22: WHILE ^ '(' ! expr ')' ! '{' ! listInst '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            WHILE54=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_stmt978); 
            WHILE54_tree = 
            (AmlTree)adaptor.create(WHILE54)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(WHILE54_tree, root_0);


            char_literal55=(Token)match(input,75,FOLLOW_75_in_while_stmt981); 

            pushFollow(FOLLOW_expr_in_while_stmt984);
            expr56=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr56.getTree());

            char_literal57=(Token)match(input,76,FOLLOW_76_in_while_stmt986); 

            char_literal58=(Token)match(input,82,FOLLOW_82_in_while_stmt989); 

            pushFollow(FOLLOW_listInst_in_while_stmt992);
            listInst59=listInst();

            state._fsp--;

            adaptor.addChild(root_0, listInst59.getTree());

            char_literal60=(Token)match(input,83,FOLLOW_83_in_while_stmt994); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:100:1: for_stmt : FOR ^ '(' ! ( declaration | assignation ) expr ';' ! assig ( ',' ! assig )* ')' ! '{' ! listInst '}' !;
    public final MusicParser.for_stmt_return for_stmt() throws RecognitionException {
        MusicParser.for_stmt_return retval = new MusicParser.for_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token FOR61=null;
        Token char_literal62=null;
        Token char_literal66=null;
        Token char_literal68=null;
        Token char_literal70=null;
        Token char_literal71=null;
        Token char_literal73=null;
        MusicParser.declaration_return declaration63 =null;

        MusicParser.assignation_return assignation64 =null;

        MusicParser.expr_return expr65 =null;

        MusicParser.assig_return assig67 =null;

        MusicParser.assig_return assig69 =null;

        MusicParser.listInst_return listInst72 =null;


        AmlTree FOR61_tree=null;
        AmlTree char_literal62_tree=null;
        AmlTree char_literal66_tree=null;
        AmlTree char_literal68_tree=null;
        AmlTree char_literal70_tree=null;
        AmlTree char_literal71_tree=null;
        AmlTree char_literal73_tree=null;

        try {
            // src/parser/Music.g:100:13: ( FOR ^ '(' ! ( declaration | assignation ) expr ';' ! assig ( ',' ! assig )* ')' ! '{' ! listInst '}' !)
            // src/parser/Music.g:100:17: FOR ^ '(' ! ( declaration | assignation ) expr ';' ! assig ( ',' ! assig )* ')' ! '{' ! listInst '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            FOR61=(Token)match(input,FOR,FOLLOW_FOR_in_for_stmt1021); 
            FOR61_tree = 
            (AmlTree)adaptor.create(FOR61)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(FOR61_tree, root_0);


            char_literal62=(Token)match(input,75,FOLLOW_75_in_for_stmt1024); 

            // src/parser/Music.g:100:27: ( declaration | assignation )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==BOOL||LA13_0==INT) ) {
                alt13=1;
            }
            else if ( (LA13_0==DECR||LA13_0==ID||LA13_0==INCR) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }
            switch (alt13) {
                case 1 :
                    // src/parser/Music.g:100:28: declaration
                    {
                    pushFollow(FOLLOW_declaration_in_for_stmt1028);
                    declaration63=declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, declaration63.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:100:42: assignation
                    {
                    pushFollow(FOLLOW_assignation_in_for_stmt1032);
                    assignation64=assignation();

                    state._fsp--;

                    adaptor.addChild(root_0, assignation64.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_expr_in_for_stmt1035);
            expr65=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr65.getTree());

            char_literal66=(Token)match(input,80,FOLLOW_80_in_for_stmt1037); 

            pushFollow(FOLLOW_assig_in_for_stmt1040);
            assig67=assig();

            state._fsp--;

            adaptor.addChild(root_0, assig67.getTree());

            // src/parser/Music.g:100:71: ( ',' ! assig )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==77) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // src/parser/Music.g:100:72: ',' ! assig
            	    {
            	    char_literal68=(Token)match(input,77,FOLLOW_77_in_for_stmt1043); 

            	    pushFollow(FOLLOW_assig_in_for_stmt1046);
            	    assig69=assig();

            	    state._fsp--;

            	    adaptor.addChild(root_0, assig69.getTree());

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            char_literal70=(Token)match(input,76,FOLLOW_76_in_for_stmt1050); 

            char_literal71=(Token)match(input,82,FOLLOW_82_in_for_stmt1053); 

            pushFollow(FOLLOW_listInst_in_for_stmt1056);
            listInst72=listInst();

            state._fsp--;

            adaptor.addChild(root_0, listInst72.getTree());

            char_literal73=(Token)match(input,83,FOLLOW_83_in_for_stmt1058); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:103:1: if_stmt : IF ^ '(' ! expr ')' ! '{' ! listInst '}' ! ( elseif_stmt )* ( else_stmt )? ;
    public final MusicParser.if_stmt_return if_stmt() throws RecognitionException {
        MusicParser.if_stmt_return retval = new MusicParser.if_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token IF74=null;
        Token char_literal75=null;
        Token char_literal77=null;
        Token char_literal78=null;
        Token char_literal80=null;
        MusicParser.expr_return expr76 =null;

        MusicParser.listInst_return listInst79 =null;

        MusicParser.elseif_stmt_return elseif_stmt81 =null;

        MusicParser.else_stmt_return else_stmt82 =null;


        AmlTree IF74_tree=null;
        AmlTree char_literal75_tree=null;
        AmlTree char_literal77_tree=null;
        AmlTree char_literal78_tree=null;
        AmlTree char_literal80_tree=null;

        try {
            // src/parser/Music.g:103:13: ( IF ^ '(' ! expr ')' ! '{' ! listInst '}' ! ( elseif_stmt )* ( else_stmt )? )
            // src/parser/Music.g:103:17: IF ^ '(' ! expr ')' ! '{' ! listInst '}' ! ( elseif_stmt )* ( else_stmt )?
            {
            root_0 = (AmlTree)adaptor.nil();


            IF74=(Token)match(input,IF,FOLLOW_IF_in_if_stmt1086); 
            IF74_tree = 
            (AmlTree)adaptor.create(IF74)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(IF74_tree, root_0);


            char_literal75=(Token)match(input,75,FOLLOW_75_in_if_stmt1089); 

            pushFollow(FOLLOW_expr_in_if_stmt1092);
            expr76=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr76.getTree());

            char_literal77=(Token)match(input,76,FOLLOW_76_in_if_stmt1094); 

            char_literal78=(Token)match(input,82,FOLLOW_82_in_if_stmt1097); 

            pushFollow(FOLLOW_listInst_in_if_stmt1100);
            listInst79=listInst();

            state._fsp--;

            adaptor.addChild(root_0, listInst79.getTree());

            char_literal80=(Token)match(input,83,FOLLOW_83_in_if_stmt1102); 

            // src/parser/Music.g:103:55: ( elseif_stmt )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==ELSE) ) {
                    int LA15_1 = input.LA(2);

                    if ( (LA15_1==IF) ) {
                        alt15=1;
                    }


                }


                switch (alt15) {
            	case 1 :
            	    // src/parser/Music.g:103:55: elseif_stmt
            	    {
            	    pushFollow(FOLLOW_elseif_stmt_in_if_stmt1105);
            	    elseif_stmt81=elseif_stmt();

            	    state._fsp--;

            	    adaptor.addChild(root_0, elseif_stmt81.getTree());

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            // src/parser/Music.g:103:68: ( else_stmt )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==ELSE) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // src/parser/Music.g:103:68: else_stmt
                    {
                    pushFollow(FOLLOW_else_stmt_in_if_stmt1108);
                    else_stmt82=else_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, else_stmt82.getTree());

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
    // src/parser/Music.g:106:1: elseif_stmt : ELSE IF '(' expr ')' '{' listInst '}' -> ^( ELSEIF expr listInst ) ;
    public final MusicParser.elseif_stmt_return elseif_stmt() throws RecognitionException {
        MusicParser.elseif_stmt_return retval = new MusicParser.elseif_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token ELSE83=null;
        Token IF84=null;
        Token char_literal85=null;
        Token char_literal87=null;
        Token char_literal88=null;
        Token char_literal90=null;
        MusicParser.expr_return expr86 =null;

        MusicParser.listInst_return listInst89 =null;


        AmlTree ELSE83_tree=null;
        AmlTree IF84_tree=null;
        AmlTree char_literal85_tree=null;
        AmlTree char_literal87_tree=null;
        AmlTree char_literal88_tree=null;
        AmlTree char_literal90_tree=null;
        RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
        RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
        RewriteRuleSubtreeStream stream_listInst=new RewriteRuleSubtreeStream(adaptor,"rule listInst");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // src/parser/Music.g:106:13: ( ELSE IF '(' expr ')' '{' listInst '}' -> ^( ELSEIF expr listInst ) )
            // src/parser/Music.g:106:17: ELSE IF '(' expr ')' '{' listInst '}'
            {
            ELSE83=(Token)match(input,ELSE,FOLLOW_ELSE_in_elseif_stmt1132);  
            stream_ELSE.add(ELSE83);


            IF84=(Token)match(input,IF,FOLLOW_IF_in_elseif_stmt1134);  
            stream_IF.add(IF84);


            char_literal85=(Token)match(input,75,FOLLOW_75_in_elseif_stmt1136);  
            stream_75.add(char_literal85);


            pushFollow(FOLLOW_expr_in_elseif_stmt1138);
            expr86=expr();

            state._fsp--;

            stream_expr.add(expr86.getTree());

            char_literal87=(Token)match(input,76,FOLLOW_76_in_elseif_stmt1140);  
            stream_76.add(char_literal87);


            char_literal88=(Token)match(input,82,FOLLOW_82_in_elseif_stmt1142);  
            stream_82.add(char_literal88);


            pushFollow(FOLLOW_listInst_in_elseif_stmt1144);
            listInst89=listInst();

            state._fsp--;

            stream_listInst.add(listInst89.getTree());

            char_literal90=(Token)match(input,83,FOLLOW_83_in_elseif_stmt1146);  
            stream_83.add(char_literal90);


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
            // 106:55: -> ^( ELSEIF expr listInst )
            {
                // src/parser/Music.g:106:58: ^( ELSEIF expr listInst )
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
    // src/parser/Music.g:109:1: else_stmt : ELSE ^ '{' ! listInst '}' !;
    public final MusicParser.else_stmt_return else_stmt() throws RecognitionException {
        MusicParser.else_stmt_return retval = new MusicParser.else_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token ELSE91=null;
        Token char_literal92=null;
        Token char_literal94=null;
        MusicParser.listInst_return listInst93 =null;


        AmlTree ELSE91_tree=null;
        AmlTree char_literal92_tree=null;
        AmlTree char_literal94_tree=null;

        try {
            // src/parser/Music.g:109:13: ( ELSE ^ '{' ! listInst '}' !)
            // src/parser/Music.g:109:17: ELSE ^ '{' ! listInst '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            ELSE91=(Token)match(input,ELSE,FOLLOW_ELSE_in_else_stmt1181); 
            ELSE91_tree = 
            (AmlTree)adaptor.create(ELSE91)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(ELSE91_tree, root_0);


            char_literal92=(Token)match(input,82,FOLLOW_82_in_else_stmt1184); 

            pushFollow(FOLLOW_listInst_in_else_stmt1187);
            listInst93=listInst();

            state._fsp--;

            adaptor.addChild(root_0, listInst93.getTree());

            char_literal94=(Token)match(input,83,FOLLOW_83_in_else_stmt1189); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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


    public static class song_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "song"
    // src/parser/Music.g:112:1: song : SONG ^ ( ID )? '{' ! beat speed ( transport )? ( track )+ '}' !;
    public final MusicParser.song_return song() throws RecognitionException {
        MusicParser.song_return retval = new MusicParser.song_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token SONG95=null;
        Token ID96=null;
        Token char_literal97=null;
        Token char_literal102=null;
        MusicParser.beat_return beat98 =null;

        MusicParser.speed_return speed99 =null;

        MusicParser.transport_return transport100 =null;

        MusicParser.track_return track101 =null;


        AmlTree SONG95_tree=null;
        AmlTree ID96_tree=null;
        AmlTree char_literal97_tree=null;
        AmlTree char_literal102_tree=null;

        try {
            // src/parser/Music.g:112:13: ( SONG ^ ( ID )? '{' ! beat speed ( transport )? ( track )+ '}' !)
            // src/parser/Music.g:112:17: SONG ^ ( ID )? '{' ! beat speed ( transport )? ( track )+ '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            SONG95=(Token)match(input,SONG,FOLLOW_SONG_in_song1220); 
            SONG95_tree = 
            (AmlTree)adaptor.create(SONG95)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(SONG95_tree, root_0);


            // src/parser/Music.g:112:23: ( ID )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==ID) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // src/parser/Music.g:112:23: ID
                    {
                    ID96=(Token)match(input,ID,FOLLOW_ID_in_song1223); 
                    ID96_tree = 
                    (AmlTree)adaptor.create(ID96)
                    ;
                    adaptor.addChild(root_0, ID96_tree);


                    }
                    break;

            }


            char_literal97=(Token)match(input,82,FOLLOW_82_in_song1226); 

            pushFollow(FOLLOW_beat_in_song1229);
            beat98=beat();

            state._fsp--;

            adaptor.addChild(root_0, beat98.getTree());

            pushFollow(FOLLOW_speed_in_song1231);
            speed99=speed();

            state._fsp--;

            adaptor.addChild(root_0, speed99.getTree());

            // src/parser/Music.g:112:43: ( transport )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==TRANSPORT) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // src/parser/Music.g:112:43: transport
                    {
                    pushFollow(FOLLOW_transport_in_song1233);
                    transport100=transport();

                    state._fsp--;

                    adaptor.addChild(root_0, transport100.getTree());

                    }
                    break;

            }


            // src/parser/Music.g:112:54: ( track )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==TRACK) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // src/parser/Music.g:112:55: track
            	    {
            	    pushFollow(FOLLOW_track_in_song1237);
            	    track101=track();

            	    state._fsp--;

            	    adaptor.addChild(root_0, track101.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
            } while (true);


            char_literal102=(Token)match(input,83,FOLLOW_83_in_song1241); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:115:1: track : TRACK ^ ( ID )? STRING compas_aux ;
    public final MusicParser.track_return track() throws RecognitionException {
        MusicParser.track_return retval = new MusicParser.track_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token TRACK103=null;
        Token ID104=null;
        Token STRING105=null;
        MusicParser.compas_aux_return compas_aux106 =null;


        AmlTree TRACK103_tree=null;
        AmlTree ID104_tree=null;
        AmlTree STRING105_tree=null;

        try {
            // src/parser/Music.g:115:13: ( TRACK ^ ( ID )? STRING compas_aux )
            // src/parser/Music.g:115:17: TRACK ^ ( ID )? STRING compas_aux
            {
            root_0 = (AmlTree)adaptor.nil();


            TRACK103=(Token)match(input,TRACK,FOLLOW_TRACK_in_track1271); 
            TRACK103_tree = 
            (AmlTree)adaptor.create(TRACK103)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(TRACK103_tree, root_0);


            // src/parser/Music.g:115:24: ( ID )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==ID) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // src/parser/Music.g:115:24: ID
                    {
                    ID104=(Token)match(input,ID,FOLLOW_ID_in_track1274); 
                    ID104_tree = 
                    (AmlTree)adaptor.create(ID104)
                    ;
                    adaptor.addChild(root_0, ID104_tree);


                    }
                    break;

            }


            STRING105=(Token)match(input,STRING,FOLLOW_STRING_in_track1277); 
            STRING105_tree = 
            (AmlTree)adaptor.create(STRING105)
            ;
            adaptor.addChild(root_0, STRING105_tree);


            pushFollow(FOLLOW_compas_aux_in_track1279);
            compas_aux106=compas_aux();

            state._fsp--;

            adaptor.addChild(root_0, compas_aux106.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:118:1: compas_aux : compas_list -> ^( COMPAS_LIST compas_list ) ;
    public final MusicParser.compas_aux_return compas_aux() throws RecognitionException {
        MusicParser.compas_aux_return retval = new MusicParser.compas_aux_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        MusicParser.compas_list_return compas_list107 =null;


        RewriteRuleSubtreeStream stream_compas_list=new RewriteRuleSubtreeStream(adaptor,"rule compas_list");
        try {
            // src/parser/Music.g:118:13: ( compas_list -> ^( COMPAS_LIST compas_list ) )
            // src/parser/Music.g:118:17: compas_list
            {
            pushFollow(FOLLOW_compas_list_in_compas_aux1303);
            compas_list107=compas_list();

            state._fsp--;

            stream_compas_list.add(compas_list107.getTree());

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
            // 118:29: -> ^( COMPAS_LIST compas_list )
            {
                // src/parser/Music.g:118:32: ^( COMPAS_LIST compas_list )
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
    // src/parser/Music.g:121:1: compas_list : ( DOUBLE_BAR !| repetition ) ( compasses | repetition )* ( DOUBLE_BAR !| repetition ) ;
    public final MusicParser.compas_list_return compas_list() throws RecognitionException {
        MusicParser.compas_list_return retval = new MusicParser.compas_list_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token DOUBLE_BAR108=null;
        Token DOUBLE_BAR112=null;
        MusicParser.repetition_return repetition109 =null;

        MusicParser.compasses_return compasses110 =null;

        MusicParser.repetition_return repetition111 =null;

        MusicParser.repetition_return repetition113 =null;


        AmlTree DOUBLE_BAR108_tree=null;
        AmlTree DOUBLE_BAR112_tree=null;

        try {
            // src/parser/Music.g:121:13: ( ( DOUBLE_BAR !| repetition ) ( compasses | repetition )* ( DOUBLE_BAR !| repetition ) )
            // src/parser/Music.g:121:15: ( DOUBLE_BAR !| repetition ) ( compasses | repetition )* ( DOUBLE_BAR !| repetition )
            {
            root_0 = (AmlTree)adaptor.nil();


            // src/parser/Music.g:121:15: ( DOUBLE_BAR !| repetition )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==DOUBLE_BAR) ) {
                alt21=1;
            }
            else if ( (LA21_0==NUM||LA21_0==START_REPETITION) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }
            switch (alt21) {
                case 1 :
                    // src/parser/Music.g:121:16: DOUBLE_BAR !
                    {
                    DOUBLE_BAR108=(Token)match(input,DOUBLE_BAR,FOLLOW_DOUBLE_BAR_in_compas_list1333); 

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:121:30: repetition
                    {
                    pushFollow(FOLLOW_repetition_in_compas_list1338);
                    repetition109=repetition();

                    state._fsp--;

                    adaptor.addChild(root_0, repetition109.getTree());

                    }
                    break;

            }


            // src/parser/Music.g:121:42: ( compasses | repetition )*
            loop22:
            do {
                int alt22=3;
                alt22 = dfa22.predict(input);
                switch (alt22) {
            	case 1 :
            	    // src/parser/Music.g:121:43: compasses
            	    {
            	    pushFollow(FOLLOW_compasses_in_compas_list1342);
            	    compasses110=compasses();

            	    state._fsp--;

            	    adaptor.addChild(root_0, compasses110.getTree());

            	    }
            	    break;
            	case 2 :
            	    // src/parser/Music.g:121:55: repetition
            	    {
            	    pushFollow(FOLLOW_repetition_in_compas_list1346);
            	    repetition111=repetition();

            	    state._fsp--;

            	    adaptor.addChild(root_0, repetition111.getTree());

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            // src/parser/Music.g:121:68: ( DOUBLE_BAR !| repetition )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==DOUBLE_BAR) ) {
                alt23=1;
            }
            else if ( (LA23_0==NUM||LA23_0==START_REPETITION) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }
            switch (alt23) {
                case 1 :
                    // src/parser/Music.g:121:69: DOUBLE_BAR !
                    {
                    DOUBLE_BAR112=(Token)match(input,DOUBLE_BAR,FOLLOW_DOUBLE_BAR_in_compas_list1351); 

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:121:83: repetition
                    {
                    pushFollow(FOLLOW_repetition_in_compas_list1356);
                    repetition113=repetition();

                    state._fsp--;

                    adaptor.addChild(root_0, repetition113.getTree());

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
    // src/parser/Music.g:124:1: compasses : compas ( BAR ! compas )* ;
    public final MusicParser.compasses_return compasses() throws RecognitionException {
        MusicParser.compasses_return retval = new MusicParser.compasses_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token BAR115=null;
        MusicParser.compas_return compas114 =null;

        MusicParser.compas_return compas116 =null;


        AmlTree BAR115_tree=null;

        try {
            // src/parser/Music.g:124:13: ( compas ( BAR ! compas )* )
            // src/parser/Music.g:124:17: compas ( BAR ! compas )*
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_compas_in_compasses1382);
            compas114=compas();

            state._fsp--;

            adaptor.addChild(root_0, compas114.getTree());

            // src/parser/Music.g:124:24: ( BAR ! compas )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==BAR) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // src/parser/Music.g:124:25: BAR ! compas
            	    {
            	    BAR115=(Token)match(input,BAR,FOLLOW_BAR_in_compasses1385); 

            	    pushFollow(FOLLOW_compas_in_compasses1388);
            	    compas116=compas();

            	    state._fsp--;

            	    adaptor.addChild(root_0, compas116.getTree());

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
    // $ANTLR end "compasses"


    public static class repetition_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "repetition"
    // src/parser/Music.g:126:1: repetition : ( NUM 'x' )? START_REPETITION compasses END_REPETITION -> ^( REPETITION NUM compasses ) ;
    public final MusicParser.repetition_return repetition() throws RecognitionException {
        MusicParser.repetition_return retval = new MusicParser.repetition_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token NUM117=null;
        Token char_literal118=null;
        Token START_REPETITION119=null;
        Token END_REPETITION121=null;
        MusicParser.compasses_return compasses120 =null;


        AmlTree NUM117_tree=null;
        AmlTree char_literal118_tree=null;
        AmlTree START_REPETITION119_tree=null;
        AmlTree END_REPETITION121_tree=null;
        RewriteRuleTokenStream stream_END_REPETITION=new RewriteRuleTokenStream(adaptor,"token END_REPETITION");
        RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
        RewriteRuleTokenStream stream_START_REPETITION=new RewriteRuleTokenStream(adaptor,"token START_REPETITION");
        RewriteRuleTokenStream stream_NUM=new RewriteRuleTokenStream(adaptor,"token NUM");
        RewriteRuleSubtreeStream stream_compasses=new RewriteRuleSubtreeStream(adaptor,"rule compasses");
        try {
            // src/parser/Music.g:126:13: ( ( NUM 'x' )? START_REPETITION compasses END_REPETITION -> ^( REPETITION NUM compasses ) )
            // src/parser/Music.g:126:17: ( NUM 'x' )? START_REPETITION compasses END_REPETITION
            {
            // src/parser/Music.g:126:17: ( NUM 'x' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==NUM) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // src/parser/Music.g:126:18: NUM 'x'
                    {
                    NUM117=(Token)match(input,NUM,FOLLOW_NUM_in_repetition1402);  
                    stream_NUM.add(NUM117);


                    char_literal118=(Token)match(input,81,FOLLOW_81_in_repetition1404);  
                    stream_81.add(char_literal118);


                    }
                    break;

            }


            START_REPETITION119=(Token)match(input,START_REPETITION,FOLLOW_START_REPETITION_in_repetition1408);  
            stream_START_REPETITION.add(START_REPETITION119);


            pushFollow(FOLLOW_compasses_in_repetition1410);
            compasses120=compasses();

            state._fsp--;

            stream_compasses.add(compasses120.getTree());

            END_REPETITION121=(Token)match(input,END_REPETITION,FOLLOW_END_REPETITION_in_repetition1412);  
            stream_END_REPETITION.add(END_REPETITION121);


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
            // 126:73: -> ^( REPETITION NUM compasses )
            {
                // src/parser/Music.g:126:76: ^( REPETITION NUM compasses )
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
    // src/parser/Music.g:129:1: compas : ( tone )? ( options {greedy=true; } : notes_group )+ -> ^( COMPAS ( tone )? ( notes_group )+ ) ;
    public final MusicParser.compas_return compas() throws RecognitionException {
        MusicParser.compas_return retval = new MusicParser.compas_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        MusicParser.tone_return tone122 =null;

        MusicParser.notes_group_return notes_group123 =null;


        RewriteRuleSubtreeStream stream_notes_group=new RewriteRuleSubtreeStream(adaptor,"rule notes_group");
        RewriteRuleSubtreeStream stream_tone=new RewriteRuleSubtreeStream(adaptor,"rule tone");
        try {
            // src/parser/Music.g:129:13: ( ( tone )? ( options {greedy=true; } : notes_group )+ -> ^( COMPAS ( tone )? ( notes_group )+ ) )
            // src/parser/Music.g:129:17: ( tone )? ( options {greedy=true; } : notes_group )+
            {
            // src/parser/Music.g:129:17: ( tone )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==NUM) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // src/parser/Music.g:129:17: tone
                    {
                    pushFollow(FOLLOW_tone_in_compas1453);
                    tone122=tone();

                    state._fsp--;

                    stream_tone.add(tone122.getTree());

                    }
                    break;

            }


            // src/parser/Music.g:129:23: ( options {greedy=true; } : notes_group )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                switch ( input.LA(1) ) {
                case CHORD:
                    {
                    alt27=1;
                    }
                    break;
                case 75:
                    {
                    alt27=1;
                    }
                    break;
                case BEMOL:
                case SUSTAIN:
                    {
                    alt27=1;
                    }
                    break;
                case NOTE:
                    {
                    alt27=1;
                    }
                    break;

                }

                switch (alt27) {
            	case 1 :
            	    // src/parser/Music.g:129:49: notes_group
            	    {
            	    pushFollow(FOLLOW_notes_group_in_compas1466);
            	    notes_group123=notes_group();

            	    state._fsp--;

            	    stream_notes_group.add(notes_group123.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt27 >= 1 ) break loop27;
                        EarlyExitException eee =
                            new EarlyExitException(27, input);
                        throw eee;
                }
                cnt27++;
            } while (true);


            // AST REWRITE
            // elements: notes_group, tone
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AmlTree)adaptor.nil();
            // 129:66: -> ^( COMPAS ( tone )? ( notes_group )+ )
            {
                // src/parser/Music.g:129:69: ^( COMPAS ( tone )? ( notes_group )+ )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(COMPAS, "COMPAS")
                , root_1);

                // src/parser/Music.g:129:78: ( tone )?
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
    // src/parser/Music.g:132:1: tone : NUM (x= SUSTAIN |x= BEMOL ) -> ^( TONE NUM $x) ;
    public final MusicParser.tone_return tone() throws RecognitionException {
        MusicParser.tone_return retval = new MusicParser.tone_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token x=null;
        Token NUM124=null;

        AmlTree x_tree=null;
        AmlTree NUM124_tree=null;
        RewriteRuleTokenStream stream_SUSTAIN=new RewriteRuleTokenStream(adaptor,"token SUSTAIN");
        RewriteRuleTokenStream stream_BEMOL=new RewriteRuleTokenStream(adaptor,"token BEMOL");
        RewriteRuleTokenStream stream_NUM=new RewriteRuleTokenStream(adaptor,"token NUM");

        try {
            // src/parser/Music.g:132:13: ( NUM (x= SUSTAIN |x= BEMOL ) -> ^( TONE NUM $x) )
            // src/parser/Music.g:132:17: NUM (x= SUSTAIN |x= BEMOL )
            {
            NUM124=(Token)match(input,NUM,FOLLOW_NUM_in_tone1513);  
            stream_NUM.add(NUM124);


            // src/parser/Music.g:132:21: (x= SUSTAIN |x= BEMOL )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==SUSTAIN) ) {
                alt28=1;
            }
            else if ( (LA28_0==BEMOL) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;

            }
            switch (alt28) {
                case 1 :
                    // src/parser/Music.g:132:22: x= SUSTAIN
                    {
                    x=(Token)match(input,SUSTAIN,FOLLOW_SUSTAIN_in_tone1518);  
                    stream_SUSTAIN.add(x);


                    }
                    break;
                case 2 :
                    // src/parser/Music.g:132:34: x= BEMOL
                    {
                    x=(Token)match(input,BEMOL,FOLLOW_BEMOL_in_tone1524);  
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
            // 132:45: -> ^( TONE NUM $x)
            {
                // src/parser/Music.g:132:49: ^( TONE NUM $x)
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
    // src/parser/Music.g:135:1: notes_group : notes_type ( '.' FIGURE )? ( DOT )? ( TIE )? -> ^( NOTE_LIST notes_type ( FIGURE )? ( DOT )? ( TIE )? ) ;
    public final MusicParser.notes_group_return notes_group() throws RecognitionException {
        MusicParser.notes_group_return retval = new MusicParser.notes_group_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal126=null;
        Token FIGURE127=null;
        Token DOT128=null;
        Token TIE129=null;
        MusicParser.notes_type_return notes_type125 =null;


        AmlTree char_literal126_tree=null;
        AmlTree FIGURE127_tree=null;
        AmlTree DOT128_tree=null;
        AmlTree TIE129_tree=null;
        RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
        RewriteRuleTokenStream stream_FIGURE=new RewriteRuleTokenStream(adaptor,"token FIGURE");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_TIE=new RewriteRuleTokenStream(adaptor,"token TIE");
        RewriteRuleSubtreeStream stream_notes_type=new RewriteRuleSubtreeStream(adaptor,"rule notes_type");
        try {
            // src/parser/Music.g:135:13: ( notes_type ( '.' FIGURE )? ( DOT )? ( TIE )? -> ^( NOTE_LIST notes_type ( FIGURE )? ( DOT )? ( TIE )? ) )
            // src/parser/Music.g:135:17: notes_type ( '.' FIGURE )? ( DOT )? ( TIE )?
            {
            pushFollow(FOLLOW_notes_type_in_notes_group1562);
            notes_type125=notes_type();

            state._fsp--;

            stream_notes_type.add(notes_type125.getTree());

            // src/parser/Music.g:135:28: ( '.' FIGURE )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==78) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // src/parser/Music.g:135:29: '.' FIGURE
                    {
                    char_literal126=(Token)match(input,78,FOLLOW_78_in_notes_group1565);  
                    stream_78.add(char_literal126);


                    FIGURE127=(Token)match(input,FIGURE,FOLLOW_FIGURE_in_notes_group1567);  
                    stream_FIGURE.add(FIGURE127);


                    }
                    break;

            }


            // src/parser/Music.g:135:42: ( DOT )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==DOT) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // src/parser/Music.g:135:42: DOT
                    {
                    DOT128=(Token)match(input,DOT,FOLLOW_DOT_in_notes_group1571);  
                    stream_DOT.add(DOT128);


                    }
                    break;

            }


            // src/parser/Music.g:135:47: ( TIE )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==TIE) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // src/parser/Music.g:135:47: TIE
                    {
                    TIE129=(Token)match(input,TIE,FOLLOW_TIE_in_notes_group1574);  
                    stream_TIE.add(TIE129);


                    }
                    break;

            }


            // AST REWRITE
            // elements: notes_type, DOT, FIGURE, TIE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AmlTree)adaptor.nil();
            // 135:52: -> ^( NOTE_LIST notes_type ( FIGURE )? ( DOT )? ( TIE )? )
            {
                // src/parser/Music.g:135:55: ^( NOTE_LIST notes_type ( FIGURE )? ( DOT )? ( TIE )? )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(NOTE_LIST, "NOTE_LIST")
                , root_1);

                adaptor.addChild(root_1, stream_notes_type.nextTree());

                // src/parser/Music.g:135:78: ( FIGURE )?
                if ( stream_FIGURE.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_FIGURE.nextNode()
                    );

                }
                stream_FIGURE.reset();

                // src/parser/Music.g:135:86: ( DOT )?
                if ( stream_DOT.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_DOT.nextNode()
                    );

                }
                stream_DOT.reset();

                // src/parser/Music.g:135:91: ( TIE )?
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
    // src/parser/Music.g:138:1: notes_type : ( chord | notes );
    public final MusicParser.notes_type_return notes_type() throws RecognitionException {
        MusicParser.notes_type_return retval = new MusicParser.notes_type_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        MusicParser.chord_return chord130 =null;

        MusicParser.notes_return notes131 =null;



        try {
            // src/parser/Music.g:138:13: ( chord | notes )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==CHORD) ) {
                alt32=1;
            }
            else if ( (LA32_0==BEMOL||LA32_0==NOTE||LA32_0==SUSTAIN||LA32_0==75) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;

            }
            switch (alt32) {
                case 1 :
                    // src/parser/Music.g:138:15: chord
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_chord_in_notes_type1614);
                    chord130=chord();

                    state._fsp--;

                    adaptor.addChild(root_0, chord130.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:138:23: notes
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_notes_in_notes_type1618);
                    notes131=notes();

                    state._fsp--;

                    adaptor.addChild(root_0, notes131.getTree());

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
    // src/parser/Music.g:140:1: chord : CHORD ^ '(' ! NOTE ( MINOR | PLUS | DIMINUTION )? ( SEVENTH | MAJ7 )? ')' !;
    public final MusicParser.chord_return chord() throws RecognitionException {
        MusicParser.chord_return retval = new MusicParser.chord_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token CHORD132=null;
        Token char_literal133=null;
        Token NOTE134=null;
        Token set135=null;
        Token set136=null;
        Token char_literal137=null;

        AmlTree CHORD132_tree=null;
        AmlTree char_literal133_tree=null;
        AmlTree NOTE134_tree=null;
        AmlTree set135_tree=null;
        AmlTree set136_tree=null;
        AmlTree char_literal137_tree=null;

        try {
            // src/parser/Music.g:140:13: ( CHORD ^ '(' ! NOTE ( MINOR | PLUS | DIMINUTION )? ( SEVENTH | MAJ7 )? ')' !)
            // src/parser/Music.g:140:17: CHORD ^ '(' ! NOTE ( MINOR | PLUS | DIMINUTION )? ( SEVENTH | MAJ7 )? ')' !
            {
            root_0 = (AmlTree)adaptor.nil();


            CHORD132=(Token)match(input,CHORD,FOLLOW_CHORD_in_chord1634); 
            CHORD132_tree = 
            (AmlTree)adaptor.create(CHORD132)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(CHORD132_tree, root_0);


            char_literal133=(Token)match(input,75,FOLLOW_75_in_chord1637); 

            NOTE134=(Token)match(input,NOTE,FOLLOW_NOTE_in_chord1640); 
            NOTE134_tree = 
            (AmlTree)adaptor.create(NOTE134)
            ;
            adaptor.addChild(root_0, NOTE134_tree);


            // src/parser/Music.g:140:34: ( MINOR | PLUS | DIMINUTION )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==DIMINUTION||LA33_0==MINOR||LA33_0==PLUS) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // src/parser/Music.g:
                    {
                    set135=(Token)input.LT(1);

                    if ( input.LA(1)==DIMINUTION||input.LA(1)==MINOR||input.LA(1)==PLUS ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (AmlTree)adaptor.create(set135)
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


            // src/parser/Music.g:140:59: ( SEVENTH | MAJ7 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==MAJ7||LA34_0==SEVENTH) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // src/parser/Music.g:
                    {
                    set136=(Token)input.LT(1);

                    if ( input.LA(1)==MAJ7||input.LA(1)==SEVENTH ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (AmlTree)adaptor.create(set136)
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


            char_literal137=(Token)match(input,76,FOLLOW_76_in_chord1658); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:143:1: notes : ( '(' ( note )+ ')' | note ) -> ^( NOTES ( note )+ ) ;
    public final MusicParser.notes_return notes() throws RecognitionException {
        MusicParser.notes_return retval = new MusicParser.notes_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal138=null;
        Token char_literal140=null;
        MusicParser.note_return note139 =null;

        MusicParser.note_return note141 =null;


        AmlTree char_literal138_tree=null;
        AmlTree char_literal140_tree=null;
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
        RewriteRuleSubtreeStream stream_note=new RewriteRuleSubtreeStream(adaptor,"rule note");
        try {
            // src/parser/Music.g:143:13: ( ( '(' ( note )+ ')' | note ) -> ^( NOTES ( note )+ ) )
            // src/parser/Music.g:143:17: ( '(' ( note )+ ')' | note )
            {
            // src/parser/Music.g:143:17: ( '(' ( note )+ ')' | note )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==75) ) {
                alt36=1;
            }
            else if ( (LA36_0==BEMOL||LA36_0==NOTE||LA36_0==SUSTAIN) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;

            }
            switch (alt36) {
                case 1 :
                    // src/parser/Music.g:143:19: '(' ( note )+ ')'
                    {
                    char_literal138=(Token)match(input,75,FOLLOW_75_in_notes1690);  
                    stream_75.add(char_literal138);


                    // src/parser/Music.g:143:23: ( note )+
                    int cnt35=0;
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==BEMOL||LA35_0==NOTE||LA35_0==SUSTAIN) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // src/parser/Music.g:143:24: note
                    	    {
                    	    pushFollow(FOLLOW_note_in_notes1693);
                    	    note139=note();

                    	    state._fsp--;

                    	    stream_note.add(note139.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt35 >= 1 ) break loop35;
                                EarlyExitException eee =
                                    new EarlyExitException(35, input);
                                throw eee;
                        }
                        cnt35++;
                    } while (true);


                    char_literal140=(Token)match(input,76,FOLLOW_76_in_notes1697);  
                    stream_76.add(char_literal140);


                    }
                    break;
                case 2 :
                    // src/parser/Music.g:143:38: note
                    {
                    pushFollow(FOLLOW_note_in_notes1702);
                    note141=note();

                    state._fsp--;

                    stream_note.add(note141.getTree());

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
            // 143:44: -> ^( NOTES ( note )+ )
            {
                // src/parser/Music.g:143:47: ^( NOTES ( note )+ )
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
    // src/parser/Music.g:146:1: note : ( BEMOL | SUSTAIN )? NOTE ^ ( '-' ! NUM )? ;
    public final MusicParser.note_return note() throws RecognitionException {
        MusicParser.note_return retval = new MusicParser.note_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token set142=null;
        Token NOTE143=null;
        Token char_literal144=null;
        Token NUM145=null;

        AmlTree set142_tree=null;
        AmlTree NOTE143_tree=null;
        AmlTree char_literal144_tree=null;
        AmlTree NUM145_tree=null;

        try {
            // src/parser/Music.g:146:13: ( ( BEMOL | SUSTAIN )? NOTE ^ ( '-' ! NUM )? )
            // src/parser/Music.g:146:17: ( BEMOL | SUSTAIN )? NOTE ^ ( '-' ! NUM )?
            {
            root_0 = (AmlTree)adaptor.nil();


            // src/parser/Music.g:146:17: ( BEMOL | SUSTAIN )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==BEMOL||LA37_0==SUSTAIN) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // src/parser/Music.g:
                    {
                    set142=(Token)input.LT(1);

                    if ( input.LA(1)==BEMOL||input.LA(1)==SUSTAIN ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (AmlTree)adaptor.create(set142)
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


            NOTE143=(Token)match(input,NOTE,FOLLOW_NOTE_in_note1751); 
            NOTE143_tree = 
            (AmlTree)adaptor.create(NOTE143)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(NOTE143_tree, root_0);


            // src/parser/Music.g:146:42: ( '-' ! NUM )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==MINUS) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // src/parser/Music.g:146:43: '-' ! NUM
                    {
                    char_literal144=(Token)match(input,MINUS,FOLLOW_MINUS_in_note1755); 

                    NUM145=(Token)match(input,NUM,FOLLOW_NUM_in_note1758); 
                    NUM145_tree = 
                    (AmlTree)adaptor.create(NUM145)
                    ;
                    adaptor.addChild(root_0, NUM145_tree);


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
    // src/parser/Music.g:150:1: expr : boolterm ( OR ^ boolterm )* ;
    public final MusicParser.expr_return expr() throws RecognitionException {
        MusicParser.expr_return retval = new MusicParser.expr_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token OR147=null;
        MusicParser.boolterm_return boolterm146 =null;

        MusicParser.boolterm_return boolterm148 =null;


        AmlTree OR147_tree=null;

        try {
            // src/parser/Music.g:150:9: ( boolterm ( OR ^ boolterm )* )
            // src/parser/Music.g:150:13: boolterm ( OR ^ boolterm )*
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_boolterm_in_expr1787);
            boolterm146=boolterm();

            state._fsp--;

            adaptor.addChild(root_0, boolterm146.getTree());

            // src/parser/Music.g:150:22: ( OR ^ boolterm )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==OR) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // src/parser/Music.g:150:23: OR ^ boolterm
            	    {
            	    OR147=(Token)match(input,OR,FOLLOW_OR_in_expr1790); 
            	    OR147_tree = 
            	    (AmlTree)adaptor.create(OR147)
            	    ;
            	    root_0 = (AmlTree)adaptor.becomeRoot(OR147_tree, root_0);


            	    pushFollow(FOLLOW_boolterm_in_expr1793);
            	    boolterm148=boolterm();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolterm148.getTree());

            	    }
            	    break;

            	default :
            	    break loop39;
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
    // src/parser/Music.g:153:1: boolterm : boolfact ( AND ^ boolfact )* ;
    public final MusicParser.boolterm_return boolterm() throws RecognitionException {
        MusicParser.boolterm_return retval = new MusicParser.boolterm_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token AND150=null;
        MusicParser.boolfact_return boolfact149 =null;

        MusicParser.boolfact_return boolfact151 =null;


        AmlTree AND150_tree=null;

        try {
            // src/parser/Music.g:153:9: ( boolfact ( AND ^ boolfact )* )
            // src/parser/Music.g:153:13: boolfact ( AND ^ boolfact )*
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_boolfact_in_boolterm1807);
            boolfact149=boolfact();

            state._fsp--;

            adaptor.addChild(root_0, boolfact149.getTree());

            // src/parser/Music.g:153:22: ( AND ^ boolfact )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==AND) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // src/parser/Music.g:153:23: AND ^ boolfact
            	    {
            	    AND150=(Token)match(input,AND,FOLLOW_AND_in_boolterm1810); 
            	    AND150_tree = 
            	    (AmlTree)adaptor.create(AND150)
            	    ;
            	    root_0 = (AmlTree)adaptor.becomeRoot(AND150_tree, root_0);


            	    pushFollow(FOLLOW_boolfact_in_boolterm1813);
            	    boolfact151=boolfact();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolfact151.getTree());

            	    }
            	    break;

            	default :
            	    break loop40;
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
    // src/parser/Music.g:156:1: boolfact : num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? ;
    public final MusicParser.boolfact_return boolfact() throws RecognitionException {
        MusicParser.boolfact_return retval = new MusicParser.boolfact_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token EQUAL153=null;
        Token NOT_EQUAL154=null;
        Token LT155=null;
        Token LE156=null;
        Token GT157=null;
        Token GE158=null;
        MusicParser.num_expr_return num_expr152 =null;

        MusicParser.num_expr_return num_expr159 =null;


        AmlTree EQUAL153_tree=null;
        AmlTree NOT_EQUAL154_tree=null;
        AmlTree LT155_tree=null;
        AmlTree LE156_tree=null;
        AmlTree GT157_tree=null;
        AmlTree GE158_tree=null;

        try {
            // src/parser/Music.g:156:9: ( num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? )
            // src/parser/Music.g:156:13: num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_num_expr_in_boolfact1827);
            num_expr152=num_expr();

            state._fsp--;

            adaptor.addChild(root_0, num_expr152.getTree());

            // src/parser/Music.g:156:22: ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==EQUAL||(LA42_0 >= GE && LA42_0 <= GT)||LA42_0==LE||LA42_0==LT||LA42_0==NOT_EQUAL) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // src/parser/Music.g:156:23: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr
                    {
                    // src/parser/Music.g:156:23: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^)
                    int alt41=6;
                    switch ( input.LA(1) ) {
                    case EQUAL:
                        {
                        alt41=1;
                        }
                        break;
                    case NOT_EQUAL:
                        {
                        alt41=2;
                        }
                        break;
                    case LT:
                        {
                        alt41=3;
                        }
                        break;
                    case LE:
                        {
                        alt41=4;
                        }
                        break;
                    case GT:
                        {
                        alt41=5;
                        }
                        break;
                    case GE:
                        {
                        alt41=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 41, 0, input);

                        throw nvae;

                    }

                    switch (alt41) {
                        case 1 :
                            // src/parser/Music.g:156:24: EQUAL ^
                            {
                            EQUAL153=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_boolfact1831); 
                            EQUAL153_tree = 
                            (AmlTree)adaptor.create(EQUAL153)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(EQUAL153_tree, root_0);


                            }
                            break;
                        case 2 :
                            // src/parser/Music.g:156:33: NOT_EQUAL ^
                            {
                            NOT_EQUAL154=(Token)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_boolfact1836); 
                            NOT_EQUAL154_tree = 
                            (AmlTree)adaptor.create(NOT_EQUAL154)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(NOT_EQUAL154_tree, root_0);


                            }
                            break;
                        case 3 :
                            // src/parser/Music.g:156:46: LT ^
                            {
                            LT155=(Token)match(input,LT,FOLLOW_LT_in_boolfact1841); 
                            LT155_tree = 
                            (AmlTree)adaptor.create(LT155)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(LT155_tree, root_0);


                            }
                            break;
                        case 4 :
                            // src/parser/Music.g:156:52: LE ^
                            {
                            LE156=(Token)match(input,LE,FOLLOW_LE_in_boolfact1846); 
                            LE156_tree = 
                            (AmlTree)adaptor.create(LE156)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(LE156_tree, root_0);


                            }
                            break;
                        case 5 :
                            // src/parser/Music.g:156:58: GT ^
                            {
                            GT157=(Token)match(input,GT,FOLLOW_GT_in_boolfact1851); 
                            GT157_tree = 
                            (AmlTree)adaptor.create(GT157)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(GT157_tree, root_0);


                            }
                            break;
                        case 6 :
                            // src/parser/Music.g:156:64: GE ^
                            {
                            GE158=(Token)match(input,GE,FOLLOW_GE_in_boolfact1856); 
                            GE158_tree = 
                            (AmlTree)adaptor.create(GE158)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(GE158_tree, root_0);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_num_expr_in_boolfact1860);
                    num_expr159=num_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, num_expr159.getTree());

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
    // src/parser/Music.g:159:1: num_expr : term ( ( PLUS ^| MINUS ^) term )* ;
    public final MusicParser.num_expr_return num_expr() throws RecognitionException {
        MusicParser.num_expr_return retval = new MusicParser.num_expr_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token PLUS161=null;
        Token MINUS162=null;
        MusicParser.term_return term160 =null;

        MusicParser.term_return term163 =null;


        AmlTree PLUS161_tree=null;
        AmlTree MINUS162_tree=null;

        try {
            // src/parser/Music.g:159:9: ( term ( ( PLUS ^| MINUS ^) term )* )
            // src/parser/Music.g:159:13: term ( ( PLUS ^| MINUS ^) term )*
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_term_in_num_expr1874);
            term160=term();

            state._fsp--;

            adaptor.addChild(root_0, term160.getTree());

            // src/parser/Music.g:159:18: ( ( PLUS ^| MINUS ^) term )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==MINUS||LA44_0==PLUS) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // src/parser/Music.g:159:20: ( PLUS ^| MINUS ^) term
            	    {
            	    // src/parser/Music.g:159:20: ( PLUS ^| MINUS ^)
            	    int alt43=2;
            	    int LA43_0 = input.LA(1);

            	    if ( (LA43_0==PLUS) ) {
            	        alt43=1;
            	    }
            	    else if ( (LA43_0==MINUS) ) {
            	        alt43=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 43, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt43) {
            	        case 1 :
            	            // src/parser/Music.g:159:21: PLUS ^
            	            {
            	            PLUS161=(Token)match(input,PLUS,FOLLOW_PLUS_in_num_expr1879); 
            	            PLUS161_tree = 
            	            (AmlTree)adaptor.create(PLUS161)
            	            ;
            	            root_0 = (AmlTree)adaptor.becomeRoot(PLUS161_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // src/parser/Music.g:159:29: MINUS ^
            	            {
            	            MINUS162=(Token)match(input,MINUS,FOLLOW_MINUS_in_num_expr1884); 
            	            MINUS162_tree = 
            	            (AmlTree)adaptor.create(MINUS162)
            	            ;
            	            root_0 = (AmlTree)adaptor.becomeRoot(MINUS162_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_term_in_num_expr1888);
            	    term163=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term163.getTree());

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
    // $ANTLR end "num_expr"


    public static class term_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "term"
    // src/parser/Music.g:162:1: term : factor ( ( DOT ^| DIV ^| MOD ^) factor )* ;
    public final MusicParser.term_return term() throws RecognitionException {
        MusicParser.term_return retval = new MusicParser.term_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token DOT165=null;
        Token DIV166=null;
        Token MOD167=null;
        MusicParser.factor_return factor164 =null;

        MusicParser.factor_return factor168 =null;


        AmlTree DOT165_tree=null;
        AmlTree DIV166_tree=null;
        AmlTree MOD167_tree=null;

        try {
            // src/parser/Music.g:162:9: ( factor ( ( DOT ^| DIV ^| MOD ^) factor )* )
            // src/parser/Music.g:162:13: factor ( ( DOT ^| DIV ^| MOD ^) factor )*
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term1906);
            factor164=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor164.getTree());

            // src/parser/Music.g:162:20: ( ( DOT ^| DIV ^| MOD ^) factor )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==DIV||LA46_0==DOT||LA46_0==MOD) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // src/parser/Music.g:162:22: ( DOT ^| DIV ^| MOD ^) factor
            	    {
            	    // src/parser/Music.g:162:22: ( DOT ^| DIV ^| MOD ^)
            	    int alt45=3;
            	    switch ( input.LA(1) ) {
            	    case DOT:
            	        {
            	        alt45=1;
            	        }
            	        break;
            	    case DIV:
            	        {
            	        alt45=2;
            	        }
            	        break;
            	    case MOD:
            	        {
            	        alt45=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 45, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt45) {
            	        case 1 :
            	            // src/parser/Music.g:162:23: DOT ^
            	            {
            	            DOT165=(Token)match(input,DOT,FOLLOW_DOT_in_term1911); 
            	            DOT165_tree = 
            	            (AmlTree)adaptor.create(DOT165)
            	            ;
            	            root_0 = (AmlTree)adaptor.becomeRoot(DOT165_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // src/parser/Music.g:162:30: DIV ^
            	            {
            	            DIV166=(Token)match(input,DIV,FOLLOW_DIV_in_term1916); 
            	            DIV166_tree = 
            	            (AmlTree)adaptor.create(DIV166)
            	            ;
            	            root_0 = (AmlTree)adaptor.becomeRoot(DIV166_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // src/parser/Music.g:162:37: MOD ^
            	            {
            	            MOD167=(Token)match(input,MOD,FOLLOW_MOD_in_term1921); 
            	            MOD167_tree = 
            	            (AmlTree)adaptor.create(MOD167)
            	            ;
            	            root_0 = (AmlTree)adaptor.becomeRoot(MOD167_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_factor_in_term1925);
            	    factor168=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor168.getTree());

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
    // $ANTLR end "term"


    public static class factor_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "factor"
    // src/parser/Music.g:165:1: factor : ( NOT ^| PLUS ^| MINUS ^)? atom ;
    public final MusicParser.factor_return factor() throws RecognitionException {
        MusicParser.factor_return retval = new MusicParser.factor_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token NOT169=null;
        Token PLUS170=null;
        Token MINUS171=null;
        MusicParser.atom_return atom172 =null;


        AmlTree NOT169_tree=null;
        AmlTree PLUS170_tree=null;
        AmlTree MINUS171_tree=null;

        try {
            // src/parser/Music.g:165:9: ( ( NOT ^| PLUS ^| MINUS ^)? atom )
            // src/parser/Music.g:165:13: ( NOT ^| PLUS ^| MINUS ^)? atom
            {
            root_0 = (AmlTree)adaptor.nil();


            // src/parser/Music.g:165:13: ( NOT ^| PLUS ^| MINUS ^)?
            int alt47=4;
            switch ( input.LA(1) ) {
                case NOT:
                    {
                    alt47=1;
                    }
                    break;
                case PLUS:
                    {
                    alt47=2;
                    }
                    break;
                case MINUS:
                    {
                    alt47=3;
                    }
                    break;
            }

            switch (alt47) {
                case 1 :
                    // src/parser/Music.g:165:14: NOT ^
                    {
                    NOT169=(Token)match(input,NOT,FOLLOW_NOT_in_factor1942); 
                    NOT169_tree = 
                    (AmlTree)adaptor.create(NOT169)
                    ;
                    root_0 = (AmlTree)adaptor.becomeRoot(NOT169_tree, root_0);


                    }
                    break;
                case 2 :
                    // src/parser/Music.g:165:21: PLUS ^
                    {
                    PLUS170=(Token)match(input,PLUS,FOLLOW_PLUS_in_factor1947); 
                    PLUS170_tree = 
                    (AmlTree)adaptor.create(PLUS170)
                    ;
                    root_0 = (AmlTree)adaptor.becomeRoot(PLUS170_tree, root_0);


                    }
                    break;
                case 3 :
                    // src/parser/Music.g:165:29: MINUS ^
                    {
                    MINUS171=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor1952); 
                    MINUS171_tree = 
                    (AmlTree)adaptor.create(MINUS171)
                    ;
                    root_0 = (AmlTree)adaptor.becomeRoot(MINUS171_tree, root_0);


                    }
                    break;

            }


            pushFollow(FOLLOW_atom_in_factor1957);
            atom172=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom172.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:168:1: atom : ( ID | NUM | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | '(' ! expr ')' !);
    public final MusicParser.atom_return atom() throws RecognitionException {
        MusicParser.atom_return retval = new MusicParser.atom_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token b=null;
        Token ID173=null;
        Token NUM174=null;
        Token char_literal175=null;
        Token char_literal177=null;
        MusicParser.expr_return expr176 =null;


        AmlTree b_tree=null;
        AmlTree ID173_tree=null;
        AmlTree NUM174_tree=null;
        AmlTree char_literal175_tree=null;
        AmlTree char_literal177_tree=null;
        RewriteRuleTokenStream stream_FALSE=new RewriteRuleTokenStream(adaptor,"token FALSE");
        RewriteRuleTokenStream stream_TRUE=new RewriteRuleTokenStream(adaptor,"token TRUE");

        try {
            // src/parser/Music.g:168:9: ( ID | NUM | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | '(' ! expr ')' !)
            int alt49=4;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt49=1;
                }
                break;
            case NUM:
                {
                alt49=2;
                }
                break;
            case FALSE:
            case TRUE:
                {
                alt49=3;
                }
                break;
            case 75:
                {
                alt49=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;

            }

            switch (alt49) {
                case 1 :
                    // src/parser/Music.g:168:13: ID
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    ID173=(Token)match(input,ID,FOLLOW_ID_in_atom1973); 
                    ID173_tree = 
                    (AmlTree)adaptor.create(ID173)
                    ;
                    adaptor.addChild(root_0, ID173_tree);


                    }
                    break;
                case 2 :
                    // src/parser/Music.g:169:7: NUM
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    NUM174=(Token)match(input,NUM,FOLLOW_NUM_in_atom1981); 
                    NUM174_tree = 
                    (AmlTree)adaptor.create(NUM174)
                    ;
                    adaptor.addChild(root_0, NUM174_tree);


                    }
                    break;
                case 3 :
                    // src/parser/Music.g:170:7: (b= TRUE |b= FALSE )
                    {
                    // src/parser/Music.g:170:7: (b= TRUE |b= FALSE )
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==TRUE) ) {
                        alt48=1;
                    }
                    else if ( (LA48_0==FALSE) ) {
                        alt48=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 48, 0, input);

                        throw nvae;

                    }
                    switch (alt48) {
                        case 1 :
                            // src/parser/Music.g:170:8: b= TRUE
                            {
                            b=(Token)match(input,TRUE,FOLLOW_TRUE_in_atom1992);  
                            stream_TRUE.add(b);


                            }
                            break;
                        case 2 :
                            // src/parser/Music.g:170:17: b= FALSE
                            {
                            b=(Token)match(input,FALSE,FOLLOW_FALSE_in_atom1998);  
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
                    // 170:27: -> ^( BOOLEAN[$b,$b.text] )
                    {
                        // src/parser/Music.g:170:30: ^( BOOLEAN[$b,$b.text] )
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
                    // src/parser/Music.g:171:7: '(' ! expr ')' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    char_literal175=(Token)match(input,75,FOLLOW_75_in_atom2015); 

                    pushFollow(FOLLOW_expr_in_atom2018);
                    expr176=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr176.getTree());

                    char_literal177=(Token)match(input,76,FOLLOW_76_in_atom2020); 

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


    protected DFA22 dfa22 = new DFA22(this);
    static final String DFA22_eotS =
        "\67\uffff";
    static final String DFA22_eofS =
        "\67\uffff";
    static final String DFA22_minS =
        "\1\10\1\uffff\2\10\1\uffff\1\101\1\10\1\113\1\10\1\61\1\6\2\10\2"+
        "\61\1\10\1\65\1\33\2\6\2\10\1\20\1\65\3\6\1\10\1\113\1\10\1\61\1"+
        "\6\1\uffff\1\52\1\114\1\6\3\10\2\61\1\10\1\65\1\33\2\6\1\20\1\65"+
        "\3\6\1\52\1\114\1\6\1\10";
    static final String DFA22_maxS =
        "\1\113\1\uffff\1\121\1\113\1\uffff\1\101\1\103\1\113\1\103\1\61"+
        "\1\116\2\113\2\61\1\114\1\65\1\33\3\113\1\123\1\114\1\65\2\116\1"+
        "\113\1\103\1\113\1\103\1\61\1\116\1\uffff\2\114\1\116\1\114\2\113"+
        "\2\61\1\114\1\65\1\33\2\113\1\114\1\65\2\116\1\113\2\114\1\116\1"+
        "\114";
    static final String DFA22_acceptS =
        "\1\uffff\1\3\2\uffff\1\1\33\uffff\1\2\26\uffff";
    static final String DFA22_specialS =
        "\67\uffff}>";
    static final String[] DFA22_transitionS = {
            "\1\4\2\uffff\1\4\10\uffff\1\1\34\uffff\1\4\3\uffff\1\2\13\uffff"+
            "\1\3\1\uffff\1\4\7\uffff\1\4",
            "",
            "\1\4\72\uffff\1\4\15\uffff\1\5",
            "\1\11\2\uffff\1\7\45\uffff\1\12\3\uffff\1\6\15\uffff\1\11\7"+
            "\uffff\1\10",
            "",
            "\1\3",
            "\1\14\72\uffff\1\13",
            "\1\15",
            "\1\16\50\uffff\1\17\21\uffff\1\16",
            "\1\12",
            "\1\24\1\uffff\1\11\2\uffff\1\7\7\uffff\1\22\3\uffff\1\25\24"+
            "\uffff\1\20\4\uffff\1\12\21\uffff\1\11\1\23\6\uffff\1\10\2\uffff"+
            "\1\21",
            "\1\11\2\uffff\1\7\45\uffff\1\12\21\uffff\1\11\7\uffff\1\10",
            "\1\11\2\uffff\1\7\45\uffff\1\12\21\uffff\1\11\7\uffff\1\10",
            "\1\26",
            "\1\17",
            "\1\16\43\uffff\1\27\4\uffff\1\17\21\uffff\1\16\10\uffff\1\30",
            "\1\31",
            "\1\32",
            "\1\24\1\uffff\1\11\2\uffff\1\7\13\uffff\1\25\31\uffff\1\12"+
            "\21\uffff\1\11\1\23\6\uffff\1\10",
            "\1\24\1\uffff\1\11\2\uffff\1\7\13\uffff\1\25\31\uffff\1\12"+
            "\21\uffff\1\11\7\uffff\1\10",
            "\1\36\2\uffff\1\34\45\uffff\1\37\3\uffff\1\33\15\uffff\1\36"+
            "\7\uffff\1\35",
            "\1\40\2\uffff\1\40\10\uffff\1\40\34\uffff\1\40\3\uffff\1\40"+
            "\13\uffff\1\40\1\uffff\1\40\2\uffff\1\1\4\uffff\1\40\7\uffff"+
            "\1\1",
            "\1\41\31\uffff\1\42\1\41\13\uffff\1\41\6\uffff\1\42\15\uffff"+
            "\1\43",
            "\1\44",
            "\1\24\1\uffff\1\11\2\uffff\1\7\7\uffff\1\22\3\uffff\1\25\31"+
            "\uffff\1\12\21\uffff\1\11\1\23\6\uffff\1\10\2\uffff\1\21",
            "\1\24\1\uffff\1\11\2\uffff\1\7\7\uffff\1\22\3\uffff\1\25\31"+
            "\uffff\1\12\21\uffff\1\11\1\23\6\uffff\1\10\2\uffff\1\21",
            "\1\24\1\uffff\1\11\2\uffff\1\7\7\uffff\1\22\3\uffff\1\25\31"+
            "\uffff\1\12\21\uffff\1\11\1\23\6\uffff\1\10",
            "\1\46\72\uffff\1\45",
            "\1\47",
            "\1\50\50\uffff\1\51\21\uffff\1\50",
            "\1\37",
            "\1\24\1\uffff\1\36\2\uffff\1\34\7\uffff\1\54\3\uffff\1\25\24"+
            "\uffff\1\52\4\uffff\1\37\21\uffff\1\36\1\55\6\uffff\1\35\2\uffff"+
            "\1\53",
            "",
            "\1\42\23\uffff\1\42\15\uffff\1\43",
            "\1\43",
            "\1\24\1\uffff\1\11\2\uffff\1\7\7\uffff\1\22\3\uffff\1\25\31"+
            "\uffff\1\12\21\uffff\1\11\1\23\6\uffff\1\10\2\uffff\1\21",
            "\1\16\50\uffff\1\17\21\uffff\1\16\10\uffff\1\30",
            "\1\36\2\uffff\1\34\45\uffff\1\37\21\uffff\1\36\7\uffff\1\35",
            "\1\36\2\uffff\1\34\45\uffff\1\37\21\uffff\1\36\7\uffff\1\35",
            "\1\56",
            "\1\51",
            "\1\50\43\uffff\1\57\4\uffff\1\51\21\uffff\1\50\10\uffff\1\60",
            "\1\61",
            "\1\62",
            "\1\24\1\uffff\1\36\2\uffff\1\34\13\uffff\1\25\31\uffff\1\37"+
            "\21\uffff\1\36\1\55\6\uffff\1\35",
            "\1\24\1\uffff\1\36\2\uffff\1\34\13\uffff\1\25\31\uffff\1\37"+
            "\21\uffff\1\36\7\uffff\1\35",
            "\1\63\31\uffff\1\64\1\63\13\uffff\1\63\6\uffff\1\64\15\uffff"+
            "\1\65",
            "\1\66",
            "\1\24\1\uffff\1\36\2\uffff\1\34\7\uffff\1\54\3\uffff\1\25\31"+
            "\uffff\1\37\21\uffff\1\36\1\55\6\uffff\1\35\2\uffff\1\53",
            "\1\24\1\uffff\1\36\2\uffff\1\34\7\uffff\1\54\3\uffff\1\25\31"+
            "\uffff\1\37\21\uffff\1\36\1\55\6\uffff\1\35\2\uffff\1\53",
            "\1\24\1\uffff\1\36\2\uffff\1\34\7\uffff\1\54\3\uffff\1\25\31"+
            "\uffff\1\37\21\uffff\1\36\1\55\6\uffff\1\35",
            "\1\64\23\uffff\1\64\15\uffff\1\65",
            "\1\65",
            "\1\24\1\uffff\1\36\2\uffff\1\34\7\uffff\1\54\3\uffff\1\25\31"+
            "\uffff\1\37\21\uffff\1\36\1\55\6\uffff\1\35\2\uffff\1\53",
            "\1\50\50\uffff\1\51\21\uffff\1\50\10\uffff\1\60"
    };

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "()* loopback of 121:42: ( compasses | repetition )*";
        }
    }
 

    public static final BitSet FOLLOW_function_in_prog164 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_EOF_in_prog167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_function204 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_function206 = new BitSet(new long[]{0x0000001000000200L,0x0000000000001000L});
    public static final BitSet FOLLOW_list_arguments_in_function208 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_function210 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_function212 = new BitSet(new long[]{0x8000001E10008200L,0x0000000000080200L});
    public static final BitSet FOLLOW_listInst_in_function214 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_function216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_argument_in_list_arguments257 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_list_arguments260 = new BitSet(new long[]{0x0000001000000200L});
    public static final BitSet FOLLOW_argument_in_list_arguments262 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_set_in_argument304 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ID_in_argument311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_params338 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_params341 = new BitSet(new long[]{0x00A1100204000000L,0x0000000000000900L});
    public static final BitSet FOLLOW_expr_in_params344 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_inst_in_listInst360 = new BitSet(new long[]{0x8000001E10008202L,0x0000000000000200L});
    public static final BitSet FOLLOW_declaration_in_inst401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignation_in_inst419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_stmt_in_inst437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_inst455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_stmt_in_inst473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_stmt_in_inst491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_song_in_inst509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_funcall538 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_funcall540 = new BitSet(new long[]{0x00A1100204000000L,0x0000000000001900L});
    public static final BitSet FOLLOW_params_in_funcall542 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_funcall545 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_funcall547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_declaration580 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_assig_opt_in_declaration589 = new BitSet(new long[]{0x0000000000000000L,0x0000000000012000L});
    public static final BitSet FOLLOW_77_in_declaration592 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_assig_opt_in_declaration595 = new BitSet(new long[]{0x0000000000000000L,0x0000000000012000L});
    public static final BitSet FOLLOW_80_in_declaration599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assig_opt625 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ASSIG_in_assig_opt628 = new BitSet(new long[]{0x00A1100204000000L,0x0000000000000900L});
    public static final BitSet FOLLOW_expr_in_assig_opt631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assig_in_assignation656 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_assignation658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assig688 = new BitSet(new long[]{0x0900A00000040020L});
    public static final BitSet FOLLOW_set_in_assig690 = new BitSet(new long[]{0x00A1100204000000L,0x0000000000000900L});
    public static final BitSet FOLLOW_expr_in_assig705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_post_in_assig723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pre_in_assig741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_post771 = new BitSet(new long[]{0x0000000800008000L});
    public static final BitSet FOLLOW_INCR_in_post776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECR_in_post782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INCR_in_pre829 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_DECR_in_pre835 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ID_in_pre838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BEAT_in_beat881 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_NUM_in_beat884 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_beat886 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_NUM_in_beat889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SPEED_in_speed918 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_NUM_in_speed921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRANSPORT_in_transport946 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_NUM_in_transport949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_stmt978 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_while_stmt981 = new BitSet(new long[]{0x00A1100204000000L,0x0000000000000900L});
    public static final BitSet FOLLOW_expr_in_while_stmt984 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_while_stmt986 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_while_stmt989 = new BitSet(new long[]{0x8000001E10008200L,0x0000000000080200L});
    public static final BitSet FOLLOW_listInst_in_while_stmt992 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_while_stmt994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_for_stmt1021 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_for_stmt1024 = new BitSet(new long[]{0x0000001A00008200L});
    public static final BitSet FOLLOW_declaration_in_for_stmt1028 = new BitSet(new long[]{0x00A1100204000000L,0x0000000000000900L});
    public static final BitSet FOLLOW_assignation_in_for_stmt1032 = new BitSet(new long[]{0x00A1100204000000L,0x0000000000000900L});
    public static final BitSet FOLLOW_expr_in_for_stmt1035 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_for_stmt1037 = new BitSet(new long[]{0x0000000A00008000L});
    public static final BitSet FOLLOW_assig_in_for_stmt1040 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_77_in_for_stmt1043 = new BitSet(new long[]{0x0000000A00008000L});
    public static final BitSet FOLLOW_assig_in_for_stmt1046 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_76_in_for_stmt1050 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_for_stmt1053 = new BitSet(new long[]{0x8000001E10008200L,0x0000000000080200L});
    public static final BitSet FOLLOW_listInst_in_for_stmt1056 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_for_stmt1058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_if_stmt1086 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_if_stmt1089 = new BitSet(new long[]{0x00A1100204000000L,0x0000000000000900L});
    public static final BitSet FOLLOW_expr_in_if_stmt1092 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_if_stmt1094 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_if_stmt1097 = new BitSet(new long[]{0x8000001E10008200L,0x0000000000080200L});
    public static final BitSet FOLLOW_listInst_in_if_stmt1100 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_if_stmt1102 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_elseif_stmt_in_if_stmt1105 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_else_stmt_in_if_stmt1108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_elseif_stmt1132 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IF_in_elseif_stmt1134 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_elseif_stmt1136 = new BitSet(new long[]{0x00A1100204000000L,0x0000000000000900L});
    public static final BitSet FOLLOW_expr_in_elseif_stmt1138 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_elseif_stmt1140 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_elseif_stmt1142 = new BitSet(new long[]{0x8000001E10008200L,0x0000000000080200L});
    public static final BitSet FOLLOW_listInst_in_elseif_stmt1144 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_elseif_stmt1146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_else_stmt1181 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_else_stmt1184 = new BitSet(new long[]{0x8000001E10008200L,0x0000000000080200L});
    public static final BitSet FOLLOW_listInst_in_else_stmt1187 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_else_stmt1189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SONG_in_song1220 = new BitSet(new long[]{0x0000000200000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_song1223 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_song1226 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_beat_in_song1229 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_speed_in_song1231 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_transport_in_song1233 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_track_in_song1237 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080040L});
    public static final BitSet FOLLOW_83_in_song1241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRACK_in_track1271 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_track1274 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_track1277 = new BitSet(new long[]{0x0020000000100000L,0x0000000000000002L});
    public static final BitSet FOLLOW_compas_aux_in_track1279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compas_list_in_compas_aux1303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_BAR_in_compas_list1333 = new BitSet(new long[]{0x0022000000100900L,0x000000000000080AL});
    public static final BitSet FOLLOW_repetition_in_compas_list1338 = new BitSet(new long[]{0x0022000000100900L,0x000000000000080AL});
    public static final BitSet FOLLOW_compasses_in_compas_list1342 = new BitSet(new long[]{0x0022000000100900L,0x000000000000080AL});
    public static final BitSet FOLLOW_repetition_in_compas_list1346 = new BitSet(new long[]{0x0022000000100900L,0x000000000000080AL});
    public static final BitSet FOLLOW_DOUBLE_BAR_in_compas_list1351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_repetition_in_compas_list1356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compas_in_compasses1382 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_BAR_in_compasses1385 = new BitSet(new long[]{0x0022000000000900L,0x0000000000000808L});
    public static final BitSet FOLLOW_compas_in_compasses1388 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_NUM_in_repetition1402 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_repetition1404 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_START_REPETITION_in_repetition1408 = new BitSet(new long[]{0x0022000000000900L,0x0000000000000808L});
    public static final BitSet FOLLOW_compasses_in_repetition1410 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_END_REPETITION_in_repetition1412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tone_in_compas1453 = new BitSet(new long[]{0x0002000000000900L,0x0000000000000808L});
    public static final BitSet FOLLOW_notes_group_in_compas1466 = new BitSet(new long[]{0x0002000000000902L,0x0000000000000808L});
    public static final BitSet FOLLOW_NUM_in_tone1513 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_SUSTAIN_in_tone1518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BEMOL_in_tone1524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notes_type_in_notes_group1562 = new BitSet(new long[]{0x0000000000080002L,0x0000000000004010L});
    public static final BitSet FOLLOW_78_in_notes_group1565 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_FIGURE_in_notes_group1567 = new BitSet(new long[]{0x0000000000080002L,0x0000000000000010L});
    public static final BitSet FOLLOW_DOT_in_notes_group1571 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_TIE_in_notes_group1574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_chord_in_notes_type1614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notes_in_notes_type1618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHORD_in_chord1634 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_chord1637 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_NOTE_in_chord1640 = new BitSet(new long[]{0x40800C0000010000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_chord1658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_notes1690 = new BitSet(new long[]{0x0002000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_note_in_notes1693 = new BitSet(new long[]{0x0002000000000100L,0x0000000000001008L});
    public static final BitSet FOLLOW_76_in_notes1697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_note_in_notes1702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOTE_in_note1751 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_MINUS_in_note1755 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_NUM_in_note1758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolterm_in_expr1787 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_OR_in_expr1790 = new BitSet(new long[]{0x00A1100204000000L,0x0000000000000900L});
    public static final BitSet FOLLOW_boolterm_in_expr1793 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_boolfact_in_boolterm1807 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_boolterm1810 = new BitSet(new long[]{0x00A1100204000000L,0x0000000000000900L});
    public static final BitSet FOLLOW_boolfact_in_boolterm1813 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_num_expr_in_boolfact1827 = new BitSet(new long[]{0x0010022181000002L});
    public static final BitSet FOLLOW_EQUAL_in_boolfact1831 = new BitSet(new long[]{0x00A1100204000000L,0x0000000000000900L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_boolfact1836 = new BitSet(new long[]{0x00A1100204000000L,0x0000000000000900L});
    public static final BitSet FOLLOW_LT_in_boolfact1841 = new BitSet(new long[]{0x00A1100204000000L,0x0000000000000900L});
    public static final BitSet FOLLOW_LE_in_boolfact1846 = new BitSet(new long[]{0x00A1100204000000L,0x0000000000000900L});
    public static final BitSet FOLLOW_GT_in_boolfact1851 = new BitSet(new long[]{0x00A1100204000000L,0x0000000000000900L});
    public static final BitSet FOLLOW_GE_in_boolfact1856 = new BitSet(new long[]{0x00A1100204000000L,0x0000000000000900L});
    public static final BitSet FOLLOW_num_expr_in_boolfact1860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_num_expr1874 = new BitSet(new long[]{0x0080100000000002L});
    public static final BitSet FOLLOW_PLUS_in_num_expr1879 = new BitSet(new long[]{0x00A1100204000000L,0x0000000000000900L});
    public static final BitSet FOLLOW_MINUS_in_num_expr1884 = new BitSet(new long[]{0x00A1100204000000L,0x0000000000000900L});
    public static final BitSet FOLLOW_term_in_num_expr1888 = new BitSet(new long[]{0x0080100000000002L});
    public static final BitSet FOLLOW_factor_in_term1906 = new BitSet(new long[]{0x00004000000A0002L});
    public static final BitSet FOLLOW_DOT_in_term1911 = new BitSet(new long[]{0x00A1100204000000L,0x0000000000000900L});
    public static final BitSet FOLLOW_DIV_in_term1916 = new BitSet(new long[]{0x00A1100204000000L,0x0000000000000900L});
    public static final BitSet FOLLOW_MOD_in_term1921 = new BitSet(new long[]{0x00A1100204000000L,0x0000000000000900L});
    public static final BitSet FOLLOW_factor_in_term1925 = new BitSet(new long[]{0x00004000000A0002L});
    public static final BitSet FOLLOW_NOT_in_factor1942 = new BitSet(new long[]{0x0020000204000000L,0x0000000000000900L});
    public static final BitSet FOLLOW_PLUS_in_factor1947 = new BitSet(new long[]{0x0020000204000000L,0x0000000000000900L});
    public static final BitSet FOLLOW_MINUS_in_factor1952 = new BitSet(new long[]{0x0020000204000000L,0x0000000000000900L});
    public static final BitSet FOLLOW_atom_in_factor1957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom1973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUM_in_atom1981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_atom1992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_atom1998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_atom2015 = new BitSet(new long[]{0x00A1100204000000L,0x0000000000000900L});
    public static final BitSet FOLLOW_expr_in_atom2018 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_atom2020 = new BitSet(new long[]{0x0000000000000002L});

}