// $ANTLR 3.4 src/parser/Music.g 2017-04-05 16:52:07

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ASSIG", "BAR", "BEAT", "BEMOL", "BOOL", "BOOLEAN", "CHORD", "COMMENT", "COMPAS", "COMPAS_LIST", "DECR", "DIMINUTION", "DIV", "DIVIDE_ASSIG", "DOT", "DOUBLE_BAR", "ELSE", "ELSEIF", "END_REPETITION", "EQUAL", "ESC_SEQ", "FALSE", "FIGURE", "FOR", "FUNCALL", "FUNCTION", "GE", "GT", "ID", "IF", "INCR", "INT", "LE", "LIST_ARGUMENTS", "LIST_FUNCTIONS", "LIST_INSTRUCTIONS", "LT", "MAJ7", "MINOR", "MINUS", "MINUS_ASSIG", "MOD", "MOD_ASSIG", "NOT", "NOTE", "NOTES", "NOTE_LIST", "NOT_EQUAL", "NUM", "OR", "PLUS", "PLUS_ASSIG", "POST", "PRE", "PROD_ASSIG", "REPETITION", "RETURN", "SEVENTH", "SONG", "SPEED", "START_REPETITION", "STRING", "SUSTAIN", "TIE", "TONE", "TRACK", "TRUE", "WHILE", "WS", "'('", "')'", "','", "'.'", "':'", "';'", "'x'", "'{'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
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
    public static final int TRUE=71;
    public static final int WHILE=72;
    public static final int WS=73;

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
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
        RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleSubtreeStream stream_listInst=new RewriteRuleSubtreeStream(adaptor,"rule listInst");
        RewriteRuleSubtreeStream stream_list_arguments=new RewriteRuleSubtreeStream(adaptor,"rule list_arguments");
        try {
            // src/parser/Music.g:40:13: (id= ID '(' list_arguments ')' '{' listInst '}' -> ^( FUNCTION[$id.text] list_arguments listInst ) )
            // src/parser/Music.g:40:17: id= ID '(' list_arguments ')' '{' listInst '}'
            {
            id=(Token)match(input,ID,FOLLOW_ID_in_function204);  
            stream_ID.add(id);


            char_literal3=(Token)match(input,74,FOLLOW_74_in_function206);  
            stream_74.add(char_literal3);


            pushFollow(FOLLOW_list_arguments_in_function208);
            list_arguments4=list_arguments();

            state._fsp--;

            stream_list_arguments.add(list_arguments4.getTree());

            char_literal5=(Token)match(input,75,FOLLOW_75_in_function210);  
            stream_75.add(char_literal5);


            char_literal6=(Token)match(input,81,FOLLOW_81_in_function212);  
            stream_81.add(char_literal6);


            pushFollow(FOLLOW_listInst_in_function214);
            listInst7=listInst();

            state._fsp--;

            stream_listInst.add(listInst7.getTree());

            char_literal8=(Token)match(input,82,FOLLOW_82_in_function216);  
            stream_82.add(char_literal8);


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
        RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
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

                        if ( (LA2_0==76) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // src/parser/Music.g:45:30: ',' argument
                    	    {
                    	    char_literal10=(Token)match(input,76,FOLLOW_76_in_list_arguments260);  
                    	    stream_76.add(char_literal10);


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

                if ( (LA4_0==76) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // src/parser/Music.g:51:23: ',' ! expr
            	    {
            	    char_literal15=(Token)match(input,76,FOLLOW_76_in_params341); 

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
                else if ( (LA6_2==74) ) {
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
        RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleSubtreeStream stream_params=new RewriteRuleSubtreeStream(adaptor,"rule params");
        try {
            // src/parser/Music.g:65:13: (id= ID '(' ( params )? ')' ';' -> ^( FUNCALL[$id.text] ( params )? ) )
            // src/parser/Music.g:65:17: id= ID '(' ( params )? ')' ';'
            {
            id=(Token)match(input,ID,FOLLOW_ID_in_funcall538);  
            stream_ID.add(id);


            char_literal25=(Token)match(input,74,FOLLOW_74_in_funcall540);  
            stream_74.add(char_literal25);


            // src/parser/Music.g:65:27: ( params )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==FALSE||LA7_0==ID||LA7_0==MINUS||LA7_0==NOT||LA7_0==NUM||LA7_0==PLUS||LA7_0==TRUE||LA7_0==74) ) {
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


            char_literal27=(Token)match(input,75,FOLLOW_75_in_funcall545);  
            stream_75.add(char_literal27);


            char_literal28=(Token)match(input,79,FOLLOW_79_in_funcall547);  
            stream_79.add(char_literal28);


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

                if ( (LA8_0==76) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // src/parser/Music.g:68:42: ',' ! assig_opt
            	    {
            	    char_literal31=(Token)match(input,76,FOLLOW_76_in_declaration592); 

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


            char_literal33=(Token)match(input,79,FOLLOW_79_in_declaration599); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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

            char_literal38=(Token)match(input,79,FOLLOW_79_in_assignation658); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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


            char_literal48=(Token)match(input,78,FOLLOW_78_in_beat886); 

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


    public static class while_stmt_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "while_stmt"
    // src/parser/Music.g:94:1: while_stmt : WHILE ^ '(' ! expr ')' ! '{' ! listInst '}' !;
    public final MusicParser.while_stmt_return while_stmt() throws RecognitionException {
        MusicParser.while_stmt_return retval = new MusicParser.while_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token WHILE52=null;
        Token char_literal53=null;
        Token char_literal55=null;
        Token char_literal56=null;
        Token char_literal58=null;
        MusicParser.expr_return expr54 =null;

        MusicParser.listInst_return listInst57 =null;


        AmlTree WHILE52_tree=null;
        AmlTree char_literal53_tree=null;
        AmlTree char_literal55_tree=null;
        AmlTree char_literal56_tree=null;
        AmlTree char_literal58_tree=null;

        try {
            // src/parser/Music.g:94:18: ( WHILE ^ '(' ! expr ')' ! '{' ! listInst '}' !)
            // src/parser/Music.g:94:22: WHILE ^ '(' ! expr ')' ! '{' ! listInst '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            WHILE52=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_stmt950); 
            WHILE52_tree = 
            (AmlTree)adaptor.create(WHILE52)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(WHILE52_tree, root_0);


            char_literal53=(Token)match(input,74,FOLLOW_74_in_while_stmt953); 

            pushFollow(FOLLOW_expr_in_while_stmt956);
            expr54=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr54.getTree());

            char_literal55=(Token)match(input,75,FOLLOW_75_in_while_stmt958); 

            char_literal56=(Token)match(input,81,FOLLOW_81_in_while_stmt961); 

            pushFollow(FOLLOW_listInst_in_while_stmt964);
            listInst57=listInst();

            state._fsp--;

            adaptor.addChild(root_0, listInst57.getTree());

            char_literal58=(Token)match(input,82,FOLLOW_82_in_while_stmt966); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:97:1: for_stmt : FOR ^ '(' ! ( declaration | assignation ) expr ';' ! assig ( ',' ! assig )* ')' ! '{' ! listInst '}' !;
    public final MusicParser.for_stmt_return for_stmt() throws RecognitionException {
        MusicParser.for_stmt_return retval = new MusicParser.for_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token FOR59=null;
        Token char_literal60=null;
        Token char_literal64=null;
        Token char_literal66=null;
        Token char_literal68=null;
        Token char_literal69=null;
        Token char_literal71=null;
        MusicParser.declaration_return declaration61 =null;

        MusicParser.assignation_return assignation62 =null;

        MusicParser.expr_return expr63 =null;

        MusicParser.assig_return assig65 =null;

        MusicParser.assig_return assig67 =null;

        MusicParser.listInst_return listInst70 =null;


        AmlTree FOR59_tree=null;
        AmlTree char_literal60_tree=null;
        AmlTree char_literal64_tree=null;
        AmlTree char_literal66_tree=null;
        AmlTree char_literal68_tree=null;
        AmlTree char_literal69_tree=null;
        AmlTree char_literal71_tree=null;

        try {
            // src/parser/Music.g:97:13: ( FOR ^ '(' ! ( declaration | assignation ) expr ';' ! assig ( ',' ! assig )* ')' ! '{' ! listInst '}' !)
            // src/parser/Music.g:97:17: FOR ^ '(' ! ( declaration | assignation ) expr ';' ! assig ( ',' ! assig )* ')' ! '{' ! listInst '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            FOR59=(Token)match(input,FOR,FOLLOW_FOR_in_for_stmt993); 
            FOR59_tree = 
            (AmlTree)adaptor.create(FOR59)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(FOR59_tree, root_0);


            char_literal60=(Token)match(input,74,FOLLOW_74_in_for_stmt996); 

            // src/parser/Music.g:97:27: ( declaration | assignation )
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
                    // src/parser/Music.g:97:28: declaration
                    {
                    pushFollow(FOLLOW_declaration_in_for_stmt1000);
                    declaration61=declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, declaration61.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:97:42: assignation
                    {
                    pushFollow(FOLLOW_assignation_in_for_stmt1004);
                    assignation62=assignation();

                    state._fsp--;

                    adaptor.addChild(root_0, assignation62.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_expr_in_for_stmt1007);
            expr63=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr63.getTree());

            char_literal64=(Token)match(input,79,FOLLOW_79_in_for_stmt1009); 

            pushFollow(FOLLOW_assig_in_for_stmt1012);
            assig65=assig();

            state._fsp--;

            adaptor.addChild(root_0, assig65.getTree());

            // src/parser/Music.g:97:71: ( ',' ! assig )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==76) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // src/parser/Music.g:97:72: ',' ! assig
            	    {
            	    char_literal66=(Token)match(input,76,FOLLOW_76_in_for_stmt1015); 

            	    pushFollow(FOLLOW_assig_in_for_stmt1018);
            	    assig67=assig();

            	    state._fsp--;

            	    adaptor.addChild(root_0, assig67.getTree());

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            char_literal68=(Token)match(input,75,FOLLOW_75_in_for_stmt1022); 

            char_literal69=(Token)match(input,81,FOLLOW_81_in_for_stmt1025); 

            pushFollow(FOLLOW_listInst_in_for_stmt1028);
            listInst70=listInst();

            state._fsp--;

            adaptor.addChild(root_0, listInst70.getTree());

            char_literal71=(Token)match(input,82,FOLLOW_82_in_for_stmt1030); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:100:1: if_stmt : IF ^ '(' ! expr ')' ! '{' ! listInst '}' ! ( elseif_stmt )* ( else_stmt )? ;
    public final MusicParser.if_stmt_return if_stmt() throws RecognitionException {
        MusicParser.if_stmt_return retval = new MusicParser.if_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token IF72=null;
        Token char_literal73=null;
        Token char_literal75=null;
        Token char_literal76=null;
        Token char_literal78=null;
        MusicParser.expr_return expr74 =null;

        MusicParser.listInst_return listInst77 =null;

        MusicParser.elseif_stmt_return elseif_stmt79 =null;

        MusicParser.else_stmt_return else_stmt80 =null;


        AmlTree IF72_tree=null;
        AmlTree char_literal73_tree=null;
        AmlTree char_literal75_tree=null;
        AmlTree char_literal76_tree=null;
        AmlTree char_literal78_tree=null;

        try {
            // src/parser/Music.g:100:13: ( IF ^ '(' ! expr ')' ! '{' ! listInst '}' ! ( elseif_stmt )* ( else_stmt )? )
            // src/parser/Music.g:100:17: IF ^ '(' ! expr ')' ! '{' ! listInst '}' ! ( elseif_stmt )* ( else_stmt )?
            {
            root_0 = (AmlTree)adaptor.nil();


            IF72=(Token)match(input,IF,FOLLOW_IF_in_if_stmt1058); 
            IF72_tree = 
            (AmlTree)adaptor.create(IF72)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(IF72_tree, root_0);


            char_literal73=(Token)match(input,74,FOLLOW_74_in_if_stmt1061); 

            pushFollow(FOLLOW_expr_in_if_stmt1064);
            expr74=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr74.getTree());

            char_literal75=(Token)match(input,75,FOLLOW_75_in_if_stmt1066); 

            char_literal76=(Token)match(input,81,FOLLOW_81_in_if_stmt1069); 

            pushFollow(FOLLOW_listInst_in_if_stmt1072);
            listInst77=listInst();

            state._fsp--;

            adaptor.addChild(root_0, listInst77.getTree());

            char_literal78=(Token)match(input,82,FOLLOW_82_in_if_stmt1074); 

            // src/parser/Music.g:100:55: ( elseif_stmt )*
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
            	    // src/parser/Music.g:100:55: elseif_stmt
            	    {
            	    pushFollow(FOLLOW_elseif_stmt_in_if_stmt1077);
            	    elseif_stmt79=elseif_stmt();

            	    state._fsp--;

            	    adaptor.addChild(root_0, elseif_stmt79.getTree());

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            // src/parser/Music.g:100:68: ( else_stmt )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==ELSE) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // src/parser/Music.g:100:68: else_stmt
                    {
                    pushFollow(FOLLOW_else_stmt_in_if_stmt1080);
                    else_stmt80=else_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, else_stmt80.getTree());

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
    // src/parser/Music.g:103:1: elseif_stmt : ELSE IF '(' expr ')' '{' listInst '}' -> ^( ELSEIF expr listInst ) ;
    public final MusicParser.elseif_stmt_return elseif_stmt() throws RecognitionException {
        MusicParser.elseif_stmt_return retval = new MusicParser.elseif_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token ELSE81=null;
        Token IF82=null;
        Token char_literal83=null;
        Token char_literal85=null;
        Token char_literal86=null;
        Token char_literal88=null;
        MusicParser.expr_return expr84 =null;

        MusicParser.listInst_return listInst87 =null;


        AmlTree ELSE81_tree=null;
        AmlTree IF82_tree=null;
        AmlTree char_literal83_tree=null;
        AmlTree char_literal85_tree=null;
        AmlTree char_literal86_tree=null;
        AmlTree char_literal88_tree=null;
        RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
        RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleSubtreeStream stream_listInst=new RewriteRuleSubtreeStream(adaptor,"rule listInst");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // src/parser/Music.g:103:13: ( ELSE IF '(' expr ')' '{' listInst '}' -> ^( ELSEIF expr listInst ) )
            // src/parser/Music.g:103:17: ELSE IF '(' expr ')' '{' listInst '}'
            {
            ELSE81=(Token)match(input,ELSE,FOLLOW_ELSE_in_elseif_stmt1104);  
            stream_ELSE.add(ELSE81);


            IF82=(Token)match(input,IF,FOLLOW_IF_in_elseif_stmt1106);  
            stream_IF.add(IF82);


            char_literal83=(Token)match(input,74,FOLLOW_74_in_elseif_stmt1108);  
            stream_74.add(char_literal83);


            pushFollow(FOLLOW_expr_in_elseif_stmt1110);
            expr84=expr();

            state._fsp--;

            stream_expr.add(expr84.getTree());

            char_literal85=(Token)match(input,75,FOLLOW_75_in_elseif_stmt1112);  
            stream_75.add(char_literal85);


            char_literal86=(Token)match(input,81,FOLLOW_81_in_elseif_stmt1114);  
            stream_81.add(char_literal86);


            pushFollow(FOLLOW_listInst_in_elseif_stmt1116);
            listInst87=listInst();

            state._fsp--;

            stream_listInst.add(listInst87.getTree());

            char_literal88=(Token)match(input,82,FOLLOW_82_in_elseif_stmt1118);  
            stream_82.add(char_literal88);


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
            // 103:55: -> ^( ELSEIF expr listInst )
            {
                // src/parser/Music.g:103:58: ^( ELSEIF expr listInst )
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
    // src/parser/Music.g:106:1: else_stmt : ELSE ^ '{' ! listInst '}' !;
    public final MusicParser.else_stmt_return else_stmt() throws RecognitionException {
        MusicParser.else_stmt_return retval = new MusicParser.else_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token ELSE89=null;
        Token char_literal90=null;
        Token char_literal92=null;
        MusicParser.listInst_return listInst91 =null;


        AmlTree ELSE89_tree=null;
        AmlTree char_literal90_tree=null;
        AmlTree char_literal92_tree=null;

        try {
            // src/parser/Music.g:106:13: ( ELSE ^ '{' ! listInst '}' !)
            // src/parser/Music.g:106:17: ELSE ^ '{' ! listInst '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            ELSE89=(Token)match(input,ELSE,FOLLOW_ELSE_in_else_stmt1153); 
            ELSE89_tree = 
            (AmlTree)adaptor.create(ELSE89)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(ELSE89_tree, root_0);


            char_literal90=(Token)match(input,81,FOLLOW_81_in_else_stmt1156); 

            pushFollow(FOLLOW_listInst_in_else_stmt1159);
            listInst91=listInst();

            state._fsp--;

            adaptor.addChild(root_0, listInst91.getTree());

            char_literal92=(Token)match(input,82,FOLLOW_82_in_else_stmt1161); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:109:1: song : SONG ^ ( ID )? '{' ! beat speed ( track )+ '}' !;
    public final MusicParser.song_return song() throws RecognitionException {
        MusicParser.song_return retval = new MusicParser.song_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token SONG93=null;
        Token ID94=null;
        Token char_literal95=null;
        Token char_literal99=null;
        MusicParser.beat_return beat96 =null;

        MusicParser.speed_return speed97 =null;

        MusicParser.track_return track98 =null;


        AmlTree SONG93_tree=null;
        AmlTree ID94_tree=null;
        AmlTree char_literal95_tree=null;
        AmlTree char_literal99_tree=null;

        try {
            // src/parser/Music.g:109:13: ( SONG ^ ( ID )? '{' ! beat speed ( track )+ '}' !)
            // src/parser/Music.g:109:17: SONG ^ ( ID )? '{' ! beat speed ( track )+ '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            SONG93=(Token)match(input,SONG,FOLLOW_SONG_in_song1192); 
            SONG93_tree = 
            (AmlTree)adaptor.create(SONG93)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(SONG93_tree, root_0);


            // src/parser/Music.g:109:23: ( ID )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==ID) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // src/parser/Music.g:109:23: ID
                    {
                    ID94=(Token)match(input,ID,FOLLOW_ID_in_song1195); 
                    ID94_tree = 
                    (AmlTree)adaptor.create(ID94)
                    ;
                    adaptor.addChild(root_0, ID94_tree);


                    }
                    break;

            }


            char_literal95=(Token)match(input,81,FOLLOW_81_in_song1198); 

            pushFollow(FOLLOW_beat_in_song1201);
            beat96=beat();

            state._fsp--;

            adaptor.addChild(root_0, beat96.getTree());

            pushFollow(FOLLOW_speed_in_song1203);
            speed97=speed();

            state._fsp--;

            adaptor.addChild(root_0, speed97.getTree());

            // src/parser/Music.g:109:43: ( track )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==TRACK) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // src/parser/Music.g:109:44: track
            	    {
            	    pushFollow(FOLLOW_track_in_song1206);
            	    track98=track();

            	    state._fsp--;

            	    adaptor.addChild(root_0, track98.getTree());

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


            char_literal99=(Token)match(input,82,FOLLOW_82_in_song1210); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:112:1: track : TRACK ^ ( ID )? STRING compas_aux ;
    public final MusicParser.track_return track() throws RecognitionException {
        MusicParser.track_return retval = new MusicParser.track_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token TRACK100=null;
        Token ID101=null;
        Token STRING102=null;
        MusicParser.compas_aux_return compas_aux103 =null;


        AmlTree TRACK100_tree=null;
        AmlTree ID101_tree=null;
        AmlTree STRING102_tree=null;

        try {
            // src/parser/Music.g:112:13: ( TRACK ^ ( ID )? STRING compas_aux )
            // src/parser/Music.g:112:17: TRACK ^ ( ID )? STRING compas_aux
            {
            root_0 = (AmlTree)adaptor.nil();


            TRACK100=(Token)match(input,TRACK,FOLLOW_TRACK_in_track1240); 
            TRACK100_tree = 
            (AmlTree)adaptor.create(TRACK100)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(TRACK100_tree, root_0);


            // src/parser/Music.g:112:24: ( ID )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==ID) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // src/parser/Music.g:112:24: ID
                    {
                    ID101=(Token)match(input,ID,FOLLOW_ID_in_track1243); 
                    ID101_tree = 
                    (AmlTree)adaptor.create(ID101)
                    ;
                    adaptor.addChild(root_0, ID101_tree);


                    }
                    break;

            }


            STRING102=(Token)match(input,STRING,FOLLOW_STRING_in_track1246); 
            STRING102_tree = 
            (AmlTree)adaptor.create(STRING102)
            ;
            adaptor.addChild(root_0, STRING102_tree);


            pushFollow(FOLLOW_compas_aux_in_track1248);
            compas_aux103=compas_aux();

            state._fsp--;

            adaptor.addChild(root_0, compas_aux103.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:115:1: compas_aux : compas_list -> ^( COMPAS_LIST compas_list ) ;
    public final MusicParser.compas_aux_return compas_aux() throws RecognitionException {
        MusicParser.compas_aux_return retval = new MusicParser.compas_aux_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        MusicParser.compas_list_return compas_list104 =null;


        RewriteRuleSubtreeStream stream_compas_list=new RewriteRuleSubtreeStream(adaptor,"rule compas_list");
        try {
            // src/parser/Music.g:115:13: ( compas_list -> ^( COMPAS_LIST compas_list ) )
            // src/parser/Music.g:115:17: compas_list
            {
            pushFollow(FOLLOW_compas_list_in_compas_aux1272);
            compas_list104=compas_list();

            state._fsp--;

            stream_compas_list.add(compas_list104.getTree());

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
            // 115:29: -> ^( COMPAS_LIST compas_list )
            {
                // src/parser/Music.g:115:32: ^( COMPAS_LIST compas_list )
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
    // src/parser/Music.g:118:1: compas_list : ( DOUBLE_BAR !| repetition ) ( compasses | repetition )* ( DOUBLE_BAR !| repetition ) ;
    public final MusicParser.compas_list_return compas_list() throws RecognitionException {
        MusicParser.compas_list_return retval = new MusicParser.compas_list_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token DOUBLE_BAR105=null;
        Token DOUBLE_BAR109=null;
        MusicParser.repetition_return repetition106 =null;

        MusicParser.compasses_return compasses107 =null;

        MusicParser.repetition_return repetition108 =null;

        MusicParser.repetition_return repetition110 =null;


        AmlTree DOUBLE_BAR105_tree=null;
        AmlTree DOUBLE_BAR109_tree=null;

        try {
            // src/parser/Music.g:118:13: ( ( DOUBLE_BAR !| repetition ) ( compasses | repetition )* ( DOUBLE_BAR !| repetition ) )
            // src/parser/Music.g:118:15: ( DOUBLE_BAR !| repetition ) ( compasses | repetition )* ( DOUBLE_BAR !| repetition )
            {
            root_0 = (AmlTree)adaptor.nil();


            // src/parser/Music.g:118:15: ( DOUBLE_BAR !| repetition )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==DOUBLE_BAR) ) {
                alt20=1;
            }
            else if ( (LA20_0==NUM||LA20_0==START_REPETITION) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }
            switch (alt20) {
                case 1 :
                    // src/parser/Music.g:118:16: DOUBLE_BAR !
                    {
                    DOUBLE_BAR105=(Token)match(input,DOUBLE_BAR,FOLLOW_DOUBLE_BAR_in_compas_list1302); 

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:118:30: repetition
                    {
                    pushFollow(FOLLOW_repetition_in_compas_list1307);
                    repetition106=repetition();

                    state._fsp--;

                    adaptor.addChild(root_0, repetition106.getTree());

                    }
                    break;

            }


            // src/parser/Music.g:118:42: ( compasses | repetition )*
            loop21:
            do {
                int alt21=3;
                alt21 = dfa21.predict(input);
                switch (alt21) {
            	case 1 :
            	    // src/parser/Music.g:118:43: compasses
            	    {
            	    pushFollow(FOLLOW_compasses_in_compas_list1311);
            	    compasses107=compasses();

            	    state._fsp--;

            	    adaptor.addChild(root_0, compasses107.getTree());

            	    }
            	    break;
            	case 2 :
            	    // src/parser/Music.g:118:55: repetition
            	    {
            	    pushFollow(FOLLOW_repetition_in_compas_list1315);
            	    repetition108=repetition();

            	    state._fsp--;

            	    adaptor.addChild(root_0, repetition108.getTree());

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            // src/parser/Music.g:118:68: ( DOUBLE_BAR !| repetition )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==DOUBLE_BAR) ) {
                alt22=1;
            }
            else if ( (LA22_0==NUM||LA22_0==START_REPETITION) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }
            switch (alt22) {
                case 1 :
                    // src/parser/Music.g:118:69: DOUBLE_BAR !
                    {
                    DOUBLE_BAR109=(Token)match(input,DOUBLE_BAR,FOLLOW_DOUBLE_BAR_in_compas_list1320); 

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:118:83: repetition
                    {
                    pushFollow(FOLLOW_repetition_in_compas_list1325);
                    repetition110=repetition();

                    state._fsp--;

                    adaptor.addChild(root_0, repetition110.getTree());

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
    // src/parser/Music.g:121:1: compasses : compas ( BAR ! compas )* ;
    public final MusicParser.compasses_return compasses() throws RecognitionException {
        MusicParser.compasses_return retval = new MusicParser.compasses_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token BAR112=null;
        MusicParser.compas_return compas111 =null;

        MusicParser.compas_return compas113 =null;


        AmlTree BAR112_tree=null;

        try {
            // src/parser/Music.g:121:13: ( compas ( BAR ! compas )* )
            // src/parser/Music.g:121:17: compas ( BAR ! compas )*
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_compas_in_compasses1351);
            compas111=compas();

            state._fsp--;

            adaptor.addChild(root_0, compas111.getTree());

            // src/parser/Music.g:121:24: ( BAR ! compas )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==BAR) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // src/parser/Music.g:121:25: BAR ! compas
            	    {
            	    BAR112=(Token)match(input,BAR,FOLLOW_BAR_in_compasses1354); 

            	    pushFollow(FOLLOW_compas_in_compasses1357);
            	    compas113=compas();

            	    state._fsp--;

            	    adaptor.addChild(root_0, compas113.getTree());

            	    }
            	    break;

            	default :
            	    break loop23;
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
    // src/parser/Music.g:123:1: repetition : ( NUM 'x' )? START_REPETITION compasses END_REPETITION -> ^( REPETITION NUM compasses ) ;
    public final MusicParser.repetition_return repetition() throws RecognitionException {
        MusicParser.repetition_return retval = new MusicParser.repetition_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token NUM114=null;
        Token char_literal115=null;
        Token START_REPETITION116=null;
        Token END_REPETITION118=null;
        MusicParser.compasses_return compasses117 =null;


        AmlTree NUM114_tree=null;
        AmlTree char_literal115_tree=null;
        AmlTree START_REPETITION116_tree=null;
        AmlTree END_REPETITION118_tree=null;
        RewriteRuleTokenStream stream_END_REPETITION=new RewriteRuleTokenStream(adaptor,"token END_REPETITION");
        RewriteRuleTokenStream stream_80=new RewriteRuleTokenStream(adaptor,"token 80");
        RewriteRuleTokenStream stream_START_REPETITION=new RewriteRuleTokenStream(adaptor,"token START_REPETITION");
        RewriteRuleTokenStream stream_NUM=new RewriteRuleTokenStream(adaptor,"token NUM");
        RewriteRuleSubtreeStream stream_compasses=new RewriteRuleSubtreeStream(adaptor,"rule compasses");
        try {
            // src/parser/Music.g:123:13: ( ( NUM 'x' )? START_REPETITION compasses END_REPETITION -> ^( REPETITION NUM compasses ) )
            // src/parser/Music.g:123:17: ( NUM 'x' )? START_REPETITION compasses END_REPETITION
            {
            // src/parser/Music.g:123:17: ( NUM 'x' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==NUM) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // src/parser/Music.g:123:18: NUM 'x'
                    {
                    NUM114=(Token)match(input,NUM,FOLLOW_NUM_in_repetition1371);  
                    stream_NUM.add(NUM114);


                    char_literal115=(Token)match(input,80,FOLLOW_80_in_repetition1373);  
                    stream_80.add(char_literal115);


                    }
                    break;

            }


            START_REPETITION116=(Token)match(input,START_REPETITION,FOLLOW_START_REPETITION_in_repetition1377);  
            stream_START_REPETITION.add(START_REPETITION116);


            pushFollow(FOLLOW_compasses_in_repetition1379);
            compasses117=compasses();

            state._fsp--;

            stream_compasses.add(compasses117.getTree());

            END_REPETITION118=(Token)match(input,END_REPETITION,FOLLOW_END_REPETITION_in_repetition1381);  
            stream_END_REPETITION.add(END_REPETITION118);


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
            // 123:73: -> ^( REPETITION NUM compasses )
            {
                // src/parser/Music.g:123:76: ^( REPETITION NUM compasses )
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
    // src/parser/Music.g:126:1: compas : ( tone )? ( options {greedy=true; } : notes_group )+ -> ^( COMPAS ( tone )? ( notes_group )+ ) ;
    public final MusicParser.compas_return compas() throws RecognitionException {
        MusicParser.compas_return retval = new MusicParser.compas_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        MusicParser.tone_return tone119 =null;

        MusicParser.notes_group_return notes_group120 =null;


        RewriteRuleSubtreeStream stream_notes_group=new RewriteRuleSubtreeStream(adaptor,"rule notes_group");
        RewriteRuleSubtreeStream stream_tone=new RewriteRuleSubtreeStream(adaptor,"rule tone");
        try {
            // src/parser/Music.g:126:13: ( ( tone )? ( options {greedy=true; } : notes_group )+ -> ^( COMPAS ( tone )? ( notes_group )+ ) )
            // src/parser/Music.g:126:17: ( tone )? ( options {greedy=true; } : notes_group )+
            {
            // src/parser/Music.g:126:17: ( tone )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==NUM) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // src/parser/Music.g:126:17: tone
                    {
                    pushFollow(FOLLOW_tone_in_compas1422);
                    tone119=tone();

                    state._fsp--;

                    stream_tone.add(tone119.getTree());

                    }
                    break;

            }


            // src/parser/Music.g:126:23: ( options {greedy=true; } : notes_group )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                switch ( input.LA(1) ) {
                case CHORD:
                    {
                    alt26=1;
                    }
                    break;
                case 74:
                    {
                    alt26=1;
                    }
                    break;
                case BEMOL:
                case SUSTAIN:
                    {
                    alt26=1;
                    }
                    break;
                case NOTE:
                    {
                    alt26=1;
                    }
                    break;

                }

                switch (alt26) {
            	case 1 :
            	    // src/parser/Music.g:126:49: notes_group
            	    {
            	    pushFollow(FOLLOW_notes_group_in_compas1435);
            	    notes_group120=notes_group();

            	    state._fsp--;

            	    stream_notes_group.add(notes_group120.getTree());

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
            // 126:66: -> ^( COMPAS ( tone )? ( notes_group )+ )
            {
                // src/parser/Music.g:126:69: ^( COMPAS ( tone )? ( notes_group )+ )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(COMPAS, "COMPAS")
                , root_1);

                // src/parser/Music.g:126:78: ( tone )?
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
    // src/parser/Music.g:129:1: tone : NUM (x= SUSTAIN |x= BEMOL ) -> ^( TONE NUM $x) ;
    public final MusicParser.tone_return tone() throws RecognitionException {
        MusicParser.tone_return retval = new MusicParser.tone_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token x=null;
        Token NUM121=null;

        AmlTree x_tree=null;
        AmlTree NUM121_tree=null;
        RewriteRuleTokenStream stream_SUSTAIN=new RewriteRuleTokenStream(adaptor,"token SUSTAIN");
        RewriteRuleTokenStream stream_BEMOL=new RewriteRuleTokenStream(adaptor,"token BEMOL");
        RewriteRuleTokenStream stream_NUM=new RewriteRuleTokenStream(adaptor,"token NUM");

        try {
            // src/parser/Music.g:129:13: ( NUM (x= SUSTAIN |x= BEMOL ) -> ^( TONE NUM $x) )
            // src/parser/Music.g:129:17: NUM (x= SUSTAIN |x= BEMOL )
            {
            NUM121=(Token)match(input,NUM,FOLLOW_NUM_in_tone1482);  
            stream_NUM.add(NUM121);


            // src/parser/Music.g:129:21: (x= SUSTAIN |x= BEMOL )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==SUSTAIN) ) {
                alt27=1;
            }
            else if ( (LA27_0==BEMOL) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;

            }
            switch (alt27) {
                case 1 :
                    // src/parser/Music.g:129:22: x= SUSTAIN
                    {
                    x=(Token)match(input,SUSTAIN,FOLLOW_SUSTAIN_in_tone1487);  
                    stream_SUSTAIN.add(x);


                    }
                    break;
                case 2 :
                    // src/parser/Music.g:129:34: x= BEMOL
                    {
                    x=(Token)match(input,BEMOL,FOLLOW_BEMOL_in_tone1493);  
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
            // 129:45: -> ^( TONE NUM $x)
            {
                // src/parser/Music.g:129:49: ^( TONE NUM $x)
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
    // src/parser/Music.g:132:1: notes_group : notes_type ( '.' FIGURE )? ( DOT )? ( TIE )? -> ^( NOTE_LIST notes_type ( FIGURE )? ( DOT )? ( TIE )? ) ;
    public final MusicParser.notes_group_return notes_group() throws RecognitionException {
        MusicParser.notes_group_return retval = new MusicParser.notes_group_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal123=null;
        Token FIGURE124=null;
        Token DOT125=null;
        Token TIE126=null;
        MusicParser.notes_type_return notes_type122 =null;


        AmlTree char_literal123_tree=null;
        AmlTree FIGURE124_tree=null;
        AmlTree DOT125_tree=null;
        AmlTree TIE126_tree=null;
        RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
        RewriteRuleTokenStream stream_FIGURE=new RewriteRuleTokenStream(adaptor,"token FIGURE");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_TIE=new RewriteRuleTokenStream(adaptor,"token TIE");
        RewriteRuleSubtreeStream stream_notes_type=new RewriteRuleSubtreeStream(adaptor,"rule notes_type");
        try {
            // src/parser/Music.g:132:13: ( notes_type ( '.' FIGURE )? ( DOT )? ( TIE )? -> ^( NOTE_LIST notes_type ( FIGURE )? ( DOT )? ( TIE )? ) )
            // src/parser/Music.g:132:17: notes_type ( '.' FIGURE )? ( DOT )? ( TIE )?
            {
            pushFollow(FOLLOW_notes_type_in_notes_group1531);
            notes_type122=notes_type();

            state._fsp--;

            stream_notes_type.add(notes_type122.getTree());

            // src/parser/Music.g:132:28: ( '.' FIGURE )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==77) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // src/parser/Music.g:132:29: '.' FIGURE
                    {
                    char_literal123=(Token)match(input,77,FOLLOW_77_in_notes_group1534);  
                    stream_77.add(char_literal123);


                    FIGURE124=(Token)match(input,FIGURE,FOLLOW_FIGURE_in_notes_group1536);  
                    stream_FIGURE.add(FIGURE124);


                    }
                    break;

            }


            // src/parser/Music.g:132:42: ( DOT )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==DOT) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // src/parser/Music.g:132:42: DOT
                    {
                    DOT125=(Token)match(input,DOT,FOLLOW_DOT_in_notes_group1540);  
                    stream_DOT.add(DOT125);


                    }
                    break;

            }


            // src/parser/Music.g:132:47: ( TIE )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==TIE) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // src/parser/Music.g:132:47: TIE
                    {
                    TIE126=(Token)match(input,TIE,FOLLOW_TIE_in_notes_group1543);  
                    stream_TIE.add(TIE126);


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
            // 132:52: -> ^( NOTE_LIST notes_type ( FIGURE )? ( DOT )? ( TIE )? )
            {
                // src/parser/Music.g:132:55: ^( NOTE_LIST notes_type ( FIGURE )? ( DOT )? ( TIE )? )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(NOTE_LIST, "NOTE_LIST")
                , root_1);

                adaptor.addChild(root_1, stream_notes_type.nextTree());

                // src/parser/Music.g:132:78: ( FIGURE )?
                if ( stream_FIGURE.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_FIGURE.nextNode()
                    );

                }
                stream_FIGURE.reset();

                // src/parser/Music.g:132:86: ( DOT )?
                if ( stream_DOT.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_DOT.nextNode()
                    );

                }
                stream_DOT.reset();

                // src/parser/Music.g:132:91: ( TIE )?
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
    // src/parser/Music.g:135:1: notes_type : ( chord | notes );
    public final MusicParser.notes_type_return notes_type() throws RecognitionException {
        MusicParser.notes_type_return retval = new MusicParser.notes_type_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        MusicParser.chord_return chord127 =null;

        MusicParser.notes_return notes128 =null;



        try {
            // src/parser/Music.g:135:13: ( chord | notes )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==CHORD) ) {
                alt31=1;
            }
            else if ( (LA31_0==BEMOL||LA31_0==NOTE||LA31_0==SUSTAIN||LA31_0==74) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;

            }
            switch (alt31) {
                case 1 :
                    // src/parser/Music.g:135:15: chord
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_chord_in_notes_type1583);
                    chord127=chord();

                    state._fsp--;

                    adaptor.addChild(root_0, chord127.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:135:23: notes
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_notes_in_notes_type1587);
                    notes128=notes();

                    state._fsp--;

                    adaptor.addChild(root_0, notes128.getTree());

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
    // src/parser/Music.g:137:1: chord : CHORD ^ '(' ! NOTE ( MINOR | PLUS | DIMINUTION )? ( SEVENTH | MAJ7 )? ')' !;
    public final MusicParser.chord_return chord() throws RecognitionException {
        MusicParser.chord_return retval = new MusicParser.chord_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token CHORD129=null;
        Token char_literal130=null;
        Token NOTE131=null;
        Token set132=null;
        Token set133=null;
        Token char_literal134=null;

        AmlTree CHORD129_tree=null;
        AmlTree char_literal130_tree=null;
        AmlTree NOTE131_tree=null;
        AmlTree set132_tree=null;
        AmlTree set133_tree=null;
        AmlTree char_literal134_tree=null;

        try {
            // src/parser/Music.g:137:13: ( CHORD ^ '(' ! NOTE ( MINOR | PLUS | DIMINUTION )? ( SEVENTH | MAJ7 )? ')' !)
            // src/parser/Music.g:137:17: CHORD ^ '(' ! NOTE ( MINOR | PLUS | DIMINUTION )? ( SEVENTH | MAJ7 )? ')' !
            {
            root_0 = (AmlTree)adaptor.nil();


            CHORD129=(Token)match(input,CHORD,FOLLOW_CHORD_in_chord1603); 
            CHORD129_tree = 
            (AmlTree)adaptor.create(CHORD129)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(CHORD129_tree, root_0);


            char_literal130=(Token)match(input,74,FOLLOW_74_in_chord1606); 

            NOTE131=(Token)match(input,NOTE,FOLLOW_NOTE_in_chord1609); 
            NOTE131_tree = 
            (AmlTree)adaptor.create(NOTE131)
            ;
            adaptor.addChild(root_0, NOTE131_tree);


            // src/parser/Music.g:137:34: ( MINOR | PLUS | DIMINUTION )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==DIMINUTION||LA32_0==MINOR||LA32_0==PLUS) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // src/parser/Music.g:
                    {
                    set132=(Token)input.LT(1);

                    if ( input.LA(1)==DIMINUTION||input.LA(1)==MINOR||input.LA(1)==PLUS ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (AmlTree)adaptor.create(set132)
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


            // src/parser/Music.g:137:59: ( SEVENTH | MAJ7 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==MAJ7||LA33_0==SEVENTH) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // src/parser/Music.g:
                    {
                    set133=(Token)input.LT(1);

                    if ( input.LA(1)==MAJ7||input.LA(1)==SEVENTH ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (AmlTree)adaptor.create(set133)
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


            char_literal134=(Token)match(input,75,FOLLOW_75_in_chord1627); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:140:1: notes : ( '(' ( note )+ ')' | note ) -> ^( NOTES ( note )+ ) ;
    public final MusicParser.notes_return notes() throws RecognitionException {
        MusicParser.notes_return retval = new MusicParser.notes_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal135=null;
        Token char_literal137=null;
        MusicParser.note_return note136 =null;

        MusicParser.note_return note138 =null;


        AmlTree char_literal135_tree=null;
        AmlTree char_literal137_tree=null;
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleSubtreeStream stream_note=new RewriteRuleSubtreeStream(adaptor,"rule note");
        try {
            // src/parser/Music.g:140:13: ( ( '(' ( note )+ ')' | note ) -> ^( NOTES ( note )+ ) )
            // src/parser/Music.g:140:17: ( '(' ( note )+ ')' | note )
            {
            // src/parser/Music.g:140:17: ( '(' ( note )+ ')' | note )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==74) ) {
                alt35=1;
            }
            else if ( (LA35_0==BEMOL||LA35_0==NOTE||LA35_0==SUSTAIN) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;

            }
            switch (alt35) {
                case 1 :
                    // src/parser/Music.g:140:19: '(' ( note )+ ')'
                    {
                    char_literal135=(Token)match(input,74,FOLLOW_74_in_notes1659);  
                    stream_74.add(char_literal135);


                    // src/parser/Music.g:140:23: ( note )+
                    int cnt34=0;
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==BEMOL||LA34_0==NOTE||LA34_0==SUSTAIN) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // src/parser/Music.g:140:24: note
                    	    {
                    	    pushFollow(FOLLOW_note_in_notes1662);
                    	    note136=note();

                    	    state._fsp--;

                    	    stream_note.add(note136.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt34 >= 1 ) break loop34;
                                EarlyExitException eee =
                                    new EarlyExitException(34, input);
                                throw eee;
                        }
                        cnt34++;
                    } while (true);


                    char_literal137=(Token)match(input,75,FOLLOW_75_in_notes1666);  
                    stream_75.add(char_literal137);


                    }
                    break;
                case 2 :
                    // src/parser/Music.g:140:38: note
                    {
                    pushFollow(FOLLOW_note_in_notes1671);
                    note138=note();

                    state._fsp--;

                    stream_note.add(note138.getTree());

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
            // 140:44: -> ^( NOTES ( note )+ )
            {
                // src/parser/Music.g:140:47: ^( NOTES ( note )+ )
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
    // src/parser/Music.g:143:1: note : ( BEMOL | SUSTAIN )? NOTE ^ ( '-' ! NUM )? ;
    public final MusicParser.note_return note() throws RecognitionException {
        MusicParser.note_return retval = new MusicParser.note_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token set139=null;
        Token NOTE140=null;
        Token char_literal141=null;
        Token NUM142=null;

        AmlTree set139_tree=null;
        AmlTree NOTE140_tree=null;
        AmlTree char_literal141_tree=null;
        AmlTree NUM142_tree=null;

        try {
            // src/parser/Music.g:143:13: ( ( BEMOL | SUSTAIN )? NOTE ^ ( '-' ! NUM )? )
            // src/parser/Music.g:143:17: ( BEMOL | SUSTAIN )? NOTE ^ ( '-' ! NUM )?
            {
            root_0 = (AmlTree)adaptor.nil();


            // src/parser/Music.g:143:17: ( BEMOL | SUSTAIN )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==BEMOL||LA36_0==SUSTAIN) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // src/parser/Music.g:
                    {
                    set139=(Token)input.LT(1);

                    if ( input.LA(1)==BEMOL||input.LA(1)==SUSTAIN ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (AmlTree)adaptor.create(set139)
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


            NOTE140=(Token)match(input,NOTE,FOLLOW_NOTE_in_note1720); 
            NOTE140_tree = 
            (AmlTree)adaptor.create(NOTE140)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(NOTE140_tree, root_0);


            // src/parser/Music.g:143:42: ( '-' ! NUM )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==MINUS) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // src/parser/Music.g:143:43: '-' ! NUM
                    {
                    char_literal141=(Token)match(input,MINUS,FOLLOW_MINUS_in_note1724); 

                    NUM142=(Token)match(input,NUM,FOLLOW_NUM_in_note1727); 
                    NUM142_tree = 
                    (AmlTree)adaptor.create(NUM142)
                    ;
                    adaptor.addChild(root_0, NUM142_tree);


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
    // src/parser/Music.g:147:1: expr : boolterm ( OR ^ boolterm )* ;
    public final MusicParser.expr_return expr() throws RecognitionException {
        MusicParser.expr_return retval = new MusicParser.expr_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token OR144=null;
        MusicParser.boolterm_return boolterm143 =null;

        MusicParser.boolterm_return boolterm145 =null;


        AmlTree OR144_tree=null;

        try {
            // src/parser/Music.g:147:9: ( boolterm ( OR ^ boolterm )* )
            // src/parser/Music.g:147:13: boolterm ( OR ^ boolterm )*
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_boolterm_in_expr1756);
            boolterm143=boolterm();

            state._fsp--;

            adaptor.addChild(root_0, boolterm143.getTree());

            // src/parser/Music.g:147:22: ( OR ^ boolterm )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==OR) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // src/parser/Music.g:147:23: OR ^ boolterm
            	    {
            	    OR144=(Token)match(input,OR,FOLLOW_OR_in_expr1759); 
            	    OR144_tree = 
            	    (AmlTree)adaptor.create(OR144)
            	    ;
            	    root_0 = (AmlTree)adaptor.becomeRoot(OR144_tree, root_0);


            	    pushFollow(FOLLOW_boolterm_in_expr1762);
            	    boolterm145=boolterm();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolterm145.getTree());

            	    }
            	    break;

            	default :
            	    break loop38;
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
    // src/parser/Music.g:150:1: boolterm : boolfact ( AND ^ boolfact )* ;
    public final MusicParser.boolterm_return boolterm() throws RecognitionException {
        MusicParser.boolterm_return retval = new MusicParser.boolterm_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token AND147=null;
        MusicParser.boolfact_return boolfact146 =null;

        MusicParser.boolfact_return boolfact148 =null;


        AmlTree AND147_tree=null;

        try {
            // src/parser/Music.g:150:9: ( boolfact ( AND ^ boolfact )* )
            // src/parser/Music.g:150:13: boolfact ( AND ^ boolfact )*
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_boolfact_in_boolterm1776);
            boolfact146=boolfact();

            state._fsp--;

            adaptor.addChild(root_0, boolfact146.getTree());

            // src/parser/Music.g:150:22: ( AND ^ boolfact )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==AND) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // src/parser/Music.g:150:23: AND ^ boolfact
            	    {
            	    AND147=(Token)match(input,AND,FOLLOW_AND_in_boolterm1779); 
            	    AND147_tree = 
            	    (AmlTree)adaptor.create(AND147)
            	    ;
            	    root_0 = (AmlTree)adaptor.becomeRoot(AND147_tree, root_0);


            	    pushFollow(FOLLOW_boolfact_in_boolterm1782);
            	    boolfact148=boolfact();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolfact148.getTree());

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
    // $ANTLR end "boolterm"


    public static class boolfact_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolfact"
    // src/parser/Music.g:153:1: boolfact : num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? ;
    public final MusicParser.boolfact_return boolfact() throws RecognitionException {
        MusicParser.boolfact_return retval = new MusicParser.boolfact_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token EQUAL150=null;
        Token NOT_EQUAL151=null;
        Token LT152=null;
        Token LE153=null;
        Token GT154=null;
        Token GE155=null;
        MusicParser.num_expr_return num_expr149 =null;

        MusicParser.num_expr_return num_expr156 =null;


        AmlTree EQUAL150_tree=null;
        AmlTree NOT_EQUAL151_tree=null;
        AmlTree LT152_tree=null;
        AmlTree LE153_tree=null;
        AmlTree GT154_tree=null;
        AmlTree GE155_tree=null;

        try {
            // src/parser/Music.g:153:9: ( num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? )
            // src/parser/Music.g:153:13: num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_num_expr_in_boolfact1796);
            num_expr149=num_expr();

            state._fsp--;

            adaptor.addChild(root_0, num_expr149.getTree());

            // src/parser/Music.g:153:22: ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==EQUAL||(LA41_0 >= GE && LA41_0 <= GT)||LA41_0==LE||LA41_0==LT||LA41_0==NOT_EQUAL) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // src/parser/Music.g:153:23: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr
                    {
                    // src/parser/Music.g:153:23: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^)
                    int alt40=6;
                    switch ( input.LA(1) ) {
                    case EQUAL:
                        {
                        alt40=1;
                        }
                        break;
                    case NOT_EQUAL:
                        {
                        alt40=2;
                        }
                        break;
                    case LT:
                        {
                        alt40=3;
                        }
                        break;
                    case LE:
                        {
                        alt40=4;
                        }
                        break;
                    case GT:
                        {
                        alt40=5;
                        }
                        break;
                    case GE:
                        {
                        alt40=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 40, 0, input);

                        throw nvae;

                    }

                    switch (alt40) {
                        case 1 :
                            // src/parser/Music.g:153:24: EQUAL ^
                            {
                            EQUAL150=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_boolfact1800); 
                            EQUAL150_tree = 
                            (AmlTree)adaptor.create(EQUAL150)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(EQUAL150_tree, root_0);


                            }
                            break;
                        case 2 :
                            // src/parser/Music.g:153:33: NOT_EQUAL ^
                            {
                            NOT_EQUAL151=(Token)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_boolfact1805); 
                            NOT_EQUAL151_tree = 
                            (AmlTree)adaptor.create(NOT_EQUAL151)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(NOT_EQUAL151_tree, root_0);


                            }
                            break;
                        case 3 :
                            // src/parser/Music.g:153:46: LT ^
                            {
                            LT152=(Token)match(input,LT,FOLLOW_LT_in_boolfact1810); 
                            LT152_tree = 
                            (AmlTree)adaptor.create(LT152)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(LT152_tree, root_0);


                            }
                            break;
                        case 4 :
                            // src/parser/Music.g:153:52: LE ^
                            {
                            LE153=(Token)match(input,LE,FOLLOW_LE_in_boolfact1815); 
                            LE153_tree = 
                            (AmlTree)adaptor.create(LE153)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(LE153_tree, root_0);


                            }
                            break;
                        case 5 :
                            // src/parser/Music.g:153:58: GT ^
                            {
                            GT154=(Token)match(input,GT,FOLLOW_GT_in_boolfact1820); 
                            GT154_tree = 
                            (AmlTree)adaptor.create(GT154)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(GT154_tree, root_0);


                            }
                            break;
                        case 6 :
                            // src/parser/Music.g:153:64: GE ^
                            {
                            GE155=(Token)match(input,GE,FOLLOW_GE_in_boolfact1825); 
                            GE155_tree = 
                            (AmlTree)adaptor.create(GE155)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(GE155_tree, root_0);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_num_expr_in_boolfact1829);
                    num_expr156=num_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, num_expr156.getTree());

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
    // src/parser/Music.g:156:1: num_expr : term ( ( PLUS ^| MINUS ^) term )* ;
    public final MusicParser.num_expr_return num_expr() throws RecognitionException {
        MusicParser.num_expr_return retval = new MusicParser.num_expr_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token PLUS158=null;
        Token MINUS159=null;
        MusicParser.term_return term157 =null;

        MusicParser.term_return term160 =null;


        AmlTree PLUS158_tree=null;
        AmlTree MINUS159_tree=null;

        try {
            // src/parser/Music.g:156:9: ( term ( ( PLUS ^| MINUS ^) term )* )
            // src/parser/Music.g:156:13: term ( ( PLUS ^| MINUS ^) term )*
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_term_in_num_expr1843);
            term157=term();

            state._fsp--;

            adaptor.addChild(root_0, term157.getTree());

            // src/parser/Music.g:156:18: ( ( PLUS ^| MINUS ^) term )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==MINUS||LA43_0==PLUS) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // src/parser/Music.g:156:20: ( PLUS ^| MINUS ^) term
            	    {
            	    // src/parser/Music.g:156:20: ( PLUS ^| MINUS ^)
            	    int alt42=2;
            	    int LA42_0 = input.LA(1);

            	    if ( (LA42_0==PLUS) ) {
            	        alt42=1;
            	    }
            	    else if ( (LA42_0==MINUS) ) {
            	        alt42=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 42, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt42) {
            	        case 1 :
            	            // src/parser/Music.g:156:21: PLUS ^
            	            {
            	            PLUS158=(Token)match(input,PLUS,FOLLOW_PLUS_in_num_expr1848); 
            	            PLUS158_tree = 
            	            (AmlTree)adaptor.create(PLUS158)
            	            ;
            	            root_0 = (AmlTree)adaptor.becomeRoot(PLUS158_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // src/parser/Music.g:156:29: MINUS ^
            	            {
            	            MINUS159=(Token)match(input,MINUS,FOLLOW_MINUS_in_num_expr1853); 
            	            MINUS159_tree = 
            	            (AmlTree)adaptor.create(MINUS159)
            	            ;
            	            root_0 = (AmlTree)adaptor.becomeRoot(MINUS159_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_term_in_num_expr1857);
            	    term160=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term160.getTree());

            	    }
            	    break;

            	default :
            	    break loop43;
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
    // src/parser/Music.g:159:1: term : factor ( ( DOT ^| DIV ^| MOD ^) factor )* ;
    public final MusicParser.term_return term() throws RecognitionException {
        MusicParser.term_return retval = new MusicParser.term_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token DOT162=null;
        Token DIV163=null;
        Token MOD164=null;
        MusicParser.factor_return factor161 =null;

        MusicParser.factor_return factor165 =null;


        AmlTree DOT162_tree=null;
        AmlTree DIV163_tree=null;
        AmlTree MOD164_tree=null;

        try {
            // src/parser/Music.g:159:9: ( factor ( ( DOT ^| DIV ^| MOD ^) factor )* )
            // src/parser/Music.g:159:13: factor ( ( DOT ^| DIV ^| MOD ^) factor )*
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term1875);
            factor161=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor161.getTree());

            // src/parser/Music.g:159:20: ( ( DOT ^| DIV ^| MOD ^) factor )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==DIV||LA45_0==DOT||LA45_0==MOD) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // src/parser/Music.g:159:22: ( DOT ^| DIV ^| MOD ^) factor
            	    {
            	    // src/parser/Music.g:159:22: ( DOT ^| DIV ^| MOD ^)
            	    int alt44=3;
            	    switch ( input.LA(1) ) {
            	    case DOT:
            	        {
            	        alt44=1;
            	        }
            	        break;
            	    case DIV:
            	        {
            	        alt44=2;
            	        }
            	        break;
            	    case MOD:
            	        {
            	        alt44=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 44, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt44) {
            	        case 1 :
            	            // src/parser/Music.g:159:23: DOT ^
            	            {
            	            DOT162=(Token)match(input,DOT,FOLLOW_DOT_in_term1880); 
            	            DOT162_tree = 
            	            (AmlTree)adaptor.create(DOT162)
            	            ;
            	            root_0 = (AmlTree)adaptor.becomeRoot(DOT162_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // src/parser/Music.g:159:30: DIV ^
            	            {
            	            DIV163=(Token)match(input,DIV,FOLLOW_DIV_in_term1885); 
            	            DIV163_tree = 
            	            (AmlTree)adaptor.create(DIV163)
            	            ;
            	            root_0 = (AmlTree)adaptor.becomeRoot(DIV163_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // src/parser/Music.g:159:37: MOD ^
            	            {
            	            MOD164=(Token)match(input,MOD,FOLLOW_MOD_in_term1890); 
            	            MOD164_tree = 
            	            (AmlTree)adaptor.create(MOD164)
            	            ;
            	            root_0 = (AmlTree)adaptor.becomeRoot(MOD164_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_factor_in_term1894);
            	    factor165=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor165.getTree());

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
    // $ANTLR end "term"


    public static class factor_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "factor"
    // src/parser/Music.g:162:1: factor : ( NOT ^| PLUS ^| MINUS ^)? atom ;
    public final MusicParser.factor_return factor() throws RecognitionException {
        MusicParser.factor_return retval = new MusicParser.factor_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token NOT166=null;
        Token PLUS167=null;
        Token MINUS168=null;
        MusicParser.atom_return atom169 =null;


        AmlTree NOT166_tree=null;
        AmlTree PLUS167_tree=null;
        AmlTree MINUS168_tree=null;

        try {
            // src/parser/Music.g:162:9: ( ( NOT ^| PLUS ^| MINUS ^)? atom )
            // src/parser/Music.g:162:13: ( NOT ^| PLUS ^| MINUS ^)? atom
            {
            root_0 = (AmlTree)adaptor.nil();


            // src/parser/Music.g:162:13: ( NOT ^| PLUS ^| MINUS ^)?
            int alt46=4;
            switch ( input.LA(1) ) {
                case NOT:
                    {
                    alt46=1;
                    }
                    break;
                case PLUS:
                    {
                    alt46=2;
                    }
                    break;
                case MINUS:
                    {
                    alt46=3;
                    }
                    break;
            }

            switch (alt46) {
                case 1 :
                    // src/parser/Music.g:162:14: NOT ^
                    {
                    NOT166=(Token)match(input,NOT,FOLLOW_NOT_in_factor1911); 
                    NOT166_tree = 
                    (AmlTree)adaptor.create(NOT166)
                    ;
                    root_0 = (AmlTree)adaptor.becomeRoot(NOT166_tree, root_0);


                    }
                    break;
                case 2 :
                    // src/parser/Music.g:162:21: PLUS ^
                    {
                    PLUS167=(Token)match(input,PLUS,FOLLOW_PLUS_in_factor1916); 
                    PLUS167_tree = 
                    (AmlTree)adaptor.create(PLUS167)
                    ;
                    root_0 = (AmlTree)adaptor.becomeRoot(PLUS167_tree, root_0);


                    }
                    break;
                case 3 :
                    // src/parser/Music.g:162:29: MINUS ^
                    {
                    MINUS168=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor1921); 
                    MINUS168_tree = 
                    (AmlTree)adaptor.create(MINUS168)
                    ;
                    root_0 = (AmlTree)adaptor.becomeRoot(MINUS168_tree, root_0);


                    }
                    break;

            }


            pushFollow(FOLLOW_atom_in_factor1926);
            atom169=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom169.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:165:1: atom : ( ID | NUM | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | '(' ! expr ')' !);
    public final MusicParser.atom_return atom() throws RecognitionException {
        MusicParser.atom_return retval = new MusicParser.atom_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token b=null;
        Token ID170=null;
        Token NUM171=null;
        Token char_literal172=null;
        Token char_literal174=null;
        MusicParser.expr_return expr173 =null;


        AmlTree b_tree=null;
        AmlTree ID170_tree=null;
        AmlTree NUM171_tree=null;
        AmlTree char_literal172_tree=null;
        AmlTree char_literal174_tree=null;
        RewriteRuleTokenStream stream_FALSE=new RewriteRuleTokenStream(adaptor,"token FALSE");
        RewriteRuleTokenStream stream_TRUE=new RewriteRuleTokenStream(adaptor,"token TRUE");

        try {
            // src/parser/Music.g:165:9: ( ID | NUM | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | '(' ! expr ')' !)
            int alt48=4;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt48=1;
                }
                break;
            case NUM:
                {
                alt48=2;
                }
                break;
            case FALSE:
            case TRUE:
                {
                alt48=3;
                }
                break;
            case 74:
                {
                alt48=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;

            }

            switch (alt48) {
                case 1 :
                    // src/parser/Music.g:165:13: ID
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    ID170=(Token)match(input,ID,FOLLOW_ID_in_atom1942); 
                    ID170_tree = 
                    (AmlTree)adaptor.create(ID170)
                    ;
                    adaptor.addChild(root_0, ID170_tree);


                    }
                    break;
                case 2 :
                    // src/parser/Music.g:166:7: NUM
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    NUM171=(Token)match(input,NUM,FOLLOW_NUM_in_atom1950); 
                    NUM171_tree = 
                    (AmlTree)adaptor.create(NUM171)
                    ;
                    adaptor.addChild(root_0, NUM171_tree);


                    }
                    break;
                case 3 :
                    // src/parser/Music.g:167:7: (b= TRUE |b= FALSE )
                    {
                    // src/parser/Music.g:167:7: (b= TRUE |b= FALSE )
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==TRUE) ) {
                        alt47=1;
                    }
                    else if ( (LA47_0==FALSE) ) {
                        alt47=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 47, 0, input);

                        throw nvae;

                    }
                    switch (alt47) {
                        case 1 :
                            // src/parser/Music.g:167:8: b= TRUE
                            {
                            b=(Token)match(input,TRUE,FOLLOW_TRUE_in_atom1961);  
                            stream_TRUE.add(b);


                            }
                            break;
                        case 2 :
                            // src/parser/Music.g:167:17: b= FALSE
                            {
                            b=(Token)match(input,FALSE,FOLLOW_FALSE_in_atom1967);  
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
                    // 167:27: -> ^( BOOLEAN[$b,$b.text] )
                    {
                        // src/parser/Music.g:167:30: ^( BOOLEAN[$b,$b.text] )
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
                    // src/parser/Music.g:168:7: '(' ! expr ')' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    char_literal172=(Token)match(input,74,FOLLOW_74_in_atom1984); 

                    pushFollow(FOLLOW_expr_in_atom1987);
                    expr173=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr173.getTree());

                    char_literal174=(Token)match(input,75,FOLLOW_75_in_atom1989); 

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


    protected DFA21 dfa21 = new DFA21(this);
    static final String DFA21_eotS =
        "\67\uffff";
    static final String DFA21_eofS =
        "\67\uffff";
    static final String DFA21_minS =
        "\1\10\1\uffff\2\10\1\uffff\1\101\1\10\1\112\1\10\1\61\1\6\2\10\2"+
        "\61\1\10\1\65\1\33\2\6\2\10\1\20\1\65\3\6\1\10\1\112\1\10\1\61\1"+
        "\6\1\uffff\1\52\1\113\1\6\3\10\2\61\1\10\1\65\1\33\2\6\1\20\1\65"+
        "\3\6\1\52\1\113\1\6\1\10";
    static final String DFA21_maxS =
        "\1\112\1\uffff\1\120\1\112\1\uffff\1\101\1\103\1\112\1\103\1\61"+
        "\1\115\2\112\2\61\1\113\1\65\1\33\3\112\1\122\1\113\1\65\2\115\1"+
        "\112\1\103\1\112\1\103\1\61\1\115\1\uffff\2\113\1\115\1\113\2\112"+
        "\2\61\1\113\1\65\1\33\2\112\1\113\1\65\2\115\1\112\2\113\1\115\1"+
        "\113";
    static final String DFA21_acceptS =
        "\1\uffff\1\3\2\uffff\1\1\33\uffff\1\2\26\uffff";
    static final String DFA21_specialS =
        "\67\uffff}>";
    static final String[] DFA21_transitionS = {
            "\1\4\2\uffff\1\4\10\uffff\1\1\34\uffff\1\4\3\uffff\1\2\13\uffff"+
            "\1\3\1\uffff\1\4\6\uffff\1\4",
            "",
            "\1\4\72\uffff\1\4\14\uffff\1\5",
            "\1\11\2\uffff\1\7\45\uffff\1\12\3\uffff\1\6\15\uffff\1\11\6"+
            "\uffff\1\10",
            "",
            "\1\3",
            "\1\14\72\uffff\1\13",
            "\1\15",
            "\1\16\50\uffff\1\17\21\uffff\1\16",
            "\1\12",
            "\1\24\1\uffff\1\11\2\uffff\1\7\7\uffff\1\22\3\uffff\1\25\24"+
            "\uffff\1\20\4\uffff\1\12\21\uffff\1\11\1\23\5\uffff\1\10\2\uffff"+
            "\1\21",
            "\1\11\2\uffff\1\7\45\uffff\1\12\21\uffff\1\11\6\uffff\1\10",
            "\1\11\2\uffff\1\7\45\uffff\1\12\21\uffff\1\11\6\uffff\1\10",
            "\1\26",
            "\1\17",
            "\1\16\43\uffff\1\27\4\uffff\1\17\21\uffff\1\16\7\uffff\1\30",
            "\1\31",
            "\1\32",
            "\1\24\1\uffff\1\11\2\uffff\1\7\13\uffff\1\25\31\uffff\1\12"+
            "\21\uffff\1\11\1\23\5\uffff\1\10",
            "\1\24\1\uffff\1\11\2\uffff\1\7\13\uffff\1\25\31\uffff\1\12"+
            "\21\uffff\1\11\6\uffff\1\10",
            "\1\36\2\uffff\1\34\45\uffff\1\37\3\uffff\1\33\15\uffff\1\36"+
            "\6\uffff\1\35",
            "\1\40\2\uffff\1\40\10\uffff\1\40\34\uffff\1\40\3\uffff\1\40"+
            "\13\uffff\1\40\1\uffff\1\40\2\uffff\1\1\3\uffff\1\40\7\uffff"+
            "\1\1",
            "\1\41\31\uffff\1\42\1\41\13\uffff\1\41\6\uffff\1\42\14\uffff"+
            "\1\43",
            "\1\44",
            "\1\24\1\uffff\1\11\2\uffff\1\7\7\uffff\1\22\3\uffff\1\25\31"+
            "\uffff\1\12\21\uffff\1\11\1\23\5\uffff\1\10\2\uffff\1\21",
            "\1\24\1\uffff\1\11\2\uffff\1\7\7\uffff\1\22\3\uffff\1\25\31"+
            "\uffff\1\12\21\uffff\1\11\1\23\5\uffff\1\10\2\uffff\1\21",
            "\1\24\1\uffff\1\11\2\uffff\1\7\7\uffff\1\22\3\uffff\1\25\31"+
            "\uffff\1\12\21\uffff\1\11\1\23\5\uffff\1\10",
            "\1\46\72\uffff\1\45",
            "\1\47",
            "\1\50\50\uffff\1\51\21\uffff\1\50",
            "\1\37",
            "\1\24\1\uffff\1\36\2\uffff\1\34\7\uffff\1\54\3\uffff\1\25\24"+
            "\uffff\1\52\4\uffff\1\37\21\uffff\1\36\1\55\5\uffff\1\35\2\uffff"+
            "\1\53",
            "",
            "\1\42\23\uffff\1\42\14\uffff\1\43",
            "\1\43",
            "\1\24\1\uffff\1\11\2\uffff\1\7\7\uffff\1\22\3\uffff\1\25\31"+
            "\uffff\1\12\21\uffff\1\11\1\23\5\uffff\1\10\2\uffff\1\21",
            "\1\16\50\uffff\1\17\21\uffff\1\16\7\uffff\1\30",
            "\1\36\2\uffff\1\34\45\uffff\1\37\21\uffff\1\36\6\uffff\1\35",
            "\1\36\2\uffff\1\34\45\uffff\1\37\21\uffff\1\36\6\uffff\1\35",
            "\1\56",
            "\1\51",
            "\1\50\43\uffff\1\57\4\uffff\1\51\21\uffff\1\50\7\uffff\1\60",
            "\1\61",
            "\1\62",
            "\1\24\1\uffff\1\36\2\uffff\1\34\13\uffff\1\25\31\uffff\1\37"+
            "\21\uffff\1\36\1\55\5\uffff\1\35",
            "\1\24\1\uffff\1\36\2\uffff\1\34\13\uffff\1\25\31\uffff\1\37"+
            "\21\uffff\1\36\6\uffff\1\35",
            "\1\63\31\uffff\1\64\1\63\13\uffff\1\63\6\uffff\1\64\14\uffff"+
            "\1\65",
            "\1\66",
            "\1\24\1\uffff\1\36\2\uffff\1\34\7\uffff\1\54\3\uffff\1\25\31"+
            "\uffff\1\37\21\uffff\1\36\1\55\5\uffff\1\35\2\uffff\1\53",
            "\1\24\1\uffff\1\36\2\uffff\1\34\7\uffff\1\54\3\uffff\1\25\31"+
            "\uffff\1\37\21\uffff\1\36\1\55\5\uffff\1\35\2\uffff\1\53",
            "\1\24\1\uffff\1\36\2\uffff\1\34\7\uffff\1\54\3\uffff\1\25\31"+
            "\uffff\1\37\21\uffff\1\36\1\55\5\uffff\1\35",
            "\1\64\23\uffff\1\64\14\uffff\1\65",
            "\1\65",
            "\1\24\1\uffff\1\36\2\uffff\1\34\7\uffff\1\54\3\uffff\1\25\31"+
            "\uffff\1\37\21\uffff\1\36\1\55\5\uffff\1\35\2\uffff\1\53",
            "\1\50\50\uffff\1\51\21\uffff\1\50\7\uffff\1\60"
    };

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "()* loopback of 118:42: ( compasses | repetition )*";
        }
    }
 

    public static final BitSet FOLLOW_function_in_prog164 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_EOF_in_prog167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_function204 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_function206 = new BitSet(new long[]{0x0000001000000200L,0x0000000000000800L});
    public static final BitSet FOLLOW_list_arguments_in_function208 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_function210 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_function212 = new BitSet(new long[]{0x8000001E10008200L,0x0000000000040100L});
    public static final BitSet FOLLOW_listInst_in_function214 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_function216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_argument_in_list_arguments257 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_list_arguments260 = new BitSet(new long[]{0x0000001000000200L});
    public static final BitSet FOLLOW_argument_in_list_arguments262 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_set_in_argument304 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ID_in_argument311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_params338 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_params341 = new BitSet(new long[]{0x00A1100204000000L,0x0000000000000480L});
    public static final BitSet FOLLOW_expr_in_params344 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_inst_in_listInst360 = new BitSet(new long[]{0x8000001E10008202L,0x0000000000000100L});
    public static final BitSet FOLLOW_declaration_in_inst401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignation_in_inst419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_stmt_in_inst437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_inst455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_stmt_in_inst473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_stmt_in_inst491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_song_in_inst509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_funcall538 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_funcall540 = new BitSet(new long[]{0x00A1100204000000L,0x0000000000000C80L});
    public static final BitSet FOLLOW_params_in_funcall542 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_funcall545 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_funcall547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_declaration580 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_assig_opt_in_declaration589 = new BitSet(new long[]{0x0000000000000000L,0x0000000000009000L});
    public static final BitSet FOLLOW_76_in_declaration592 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_assig_opt_in_declaration595 = new BitSet(new long[]{0x0000000000000000L,0x0000000000009000L});
    public static final BitSet FOLLOW_79_in_declaration599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assig_opt625 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ASSIG_in_assig_opt628 = new BitSet(new long[]{0x00A1100204000000L,0x0000000000000480L});
    public static final BitSet FOLLOW_expr_in_assig_opt631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assig_in_assignation656 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_assignation658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assig688 = new BitSet(new long[]{0x0900A00000040020L});
    public static final BitSet FOLLOW_set_in_assig690 = new BitSet(new long[]{0x00A1100204000000L,0x0000000000000480L});
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
    public static final BitSet FOLLOW_NUM_in_beat884 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_beat886 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_NUM_in_beat889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SPEED_in_speed918 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_NUM_in_speed921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_stmt950 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_while_stmt953 = new BitSet(new long[]{0x00A1100204000000L,0x0000000000000480L});
    public static final BitSet FOLLOW_expr_in_while_stmt956 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_while_stmt958 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_while_stmt961 = new BitSet(new long[]{0x8000001E10008200L,0x0000000000040100L});
    public static final BitSet FOLLOW_listInst_in_while_stmt964 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_while_stmt966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_for_stmt993 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_for_stmt996 = new BitSet(new long[]{0x0000001A00008200L});
    public static final BitSet FOLLOW_declaration_in_for_stmt1000 = new BitSet(new long[]{0x00A1100204000000L,0x0000000000000480L});
    public static final BitSet FOLLOW_assignation_in_for_stmt1004 = new BitSet(new long[]{0x00A1100204000000L,0x0000000000000480L});
    public static final BitSet FOLLOW_expr_in_for_stmt1007 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_for_stmt1009 = new BitSet(new long[]{0x0000000A00008000L});
    public static final BitSet FOLLOW_assig_in_for_stmt1012 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_76_in_for_stmt1015 = new BitSet(new long[]{0x0000000A00008000L});
    public static final BitSet FOLLOW_assig_in_for_stmt1018 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_75_in_for_stmt1022 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_for_stmt1025 = new BitSet(new long[]{0x8000001E10008200L,0x0000000000040100L});
    public static final BitSet FOLLOW_listInst_in_for_stmt1028 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_for_stmt1030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_if_stmt1058 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_if_stmt1061 = new BitSet(new long[]{0x00A1100204000000L,0x0000000000000480L});
    public static final BitSet FOLLOW_expr_in_if_stmt1064 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_if_stmt1066 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_if_stmt1069 = new BitSet(new long[]{0x8000001E10008200L,0x0000000000040100L});
    public static final BitSet FOLLOW_listInst_in_if_stmt1072 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_if_stmt1074 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_elseif_stmt_in_if_stmt1077 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_else_stmt_in_if_stmt1080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_elseif_stmt1104 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IF_in_elseif_stmt1106 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_elseif_stmt1108 = new BitSet(new long[]{0x00A1100204000000L,0x0000000000000480L});
    public static final BitSet FOLLOW_expr_in_elseif_stmt1110 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_elseif_stmt1112 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_elseif_stmt1114 = new BitSet(new long[]{0x8000001E10008200L,0x0000000000040100L});
    public static final BitSet FOLLOW_listInst_in_elseif_stmt1116 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_elseif_stmt1118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_else_stmt1153 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_else_stmt1156 = new BitSet(new long[]{0x8000001E10008200L,0x0000000000040100L});
    public static final BitSet FOLLOW_listInst_in_else_stmt1159 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_else_stmt1161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SONG_in_song1192 = new BitSet(new long[]{0x0000000200000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_ID_in_song1195 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_song1198 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_beat_in_song1201 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_speed_in_song1203 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_track_in_song1206 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040040L});
    public static final BitSet FOLLOW_82_in_song1210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRACK_in_track1240 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_track1243 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_track1246 = new BitSet(new long[]{0x0020000000100000L,0x0000000000000002L});
    public static final BitSet FOLLOW_compas_aux_in_track1248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compas_list_in_compas_aux1272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_BAR_in_compas_list1302 = new BitSet(new long[]{0x0022000000100900L,0x000000000000040AL});
    public static final BitSet FOLLOW_repetition_in_compas_list1307 = new BitSet(new long[]{0x0022000000100900L,0x000000000000040AL});
    public static final BitSet FOLLOW_compasses_in_compas_list1311 = new BitSet(new long[]{0x0022000000100900L,0x000000000000040AL});
    public static final BitSet FOLLOW_repetition_in_compas_list1315 = new BitSet(new long[]{0x0022000000100900L,0x000000000000040AL});
    public static final BitSet FOLLOW_DOUBLE_BAR_in_compas_list1320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_repetition_in_compas_list1325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compas_in_compasses1351 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_BAR_in_compasses1354 = new BitSet(new long[]{0x0022000000000900L,0x0000000000000408L});
    public static final BitSet FOLLOW_compas_in_compasses1357 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_NUM_in_repetition1371 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_repetition1373 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_START_REPETITION_in_repetition1377 = new BitSet(new long[]{0x0022000000000900L,0x0000000000000408L});
    public static final BitSet FOLLOW_compasses_in_repetition1379 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_END_REPETITION_in_repetition1381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tone_in_compas1422 = new BitSet(new long[]{0x0002000000000900L,0x0000000000000408L});
    public static final BitSet FOLLOW_notes_group_in_compas1435 = new BitSet(new long[]{0x0002000000000902L,0x0000000000000408L});
    public static final BitSet FOLLOW_NUM_in_tone1482 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_SUSTAIN_in_tone1487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BEMOL_in_tone1493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notes_type_in_notes_group1531 = new BitSet(new long[]{0x0000000000080002L,0x0000000000002010L});
    public static final BitSet FOLLOW_77_in_notes_group1534 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_FIGURE_in_notes_group1536 = new BitSet(new long[]{0x0000000000080002L,0x0000000000000010L});
    public static final BitSet FOLLOW_DOT_in_notes_group1540 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_TIE_in_notes_group1543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_chord_in_notes_type1583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notes_in_notes_type1587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHORD_in_chord1603 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_chord1606 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_NOTE_in_chord1609 = new BitSet(new long[]{0x40800C0000010000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_chord1627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_notes1659 = new BitSet(new long[]{0x0002000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_note_in_notes1662 = new BitSet(new long[]{0x0002000000000100L,0x0000000000000808L});
    public static final BitSet FOLLOW_75_in_notes1666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_note_in_notes1671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOTE_in_note1720 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_MINUS_in_note1724 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_NUM_in_note1727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolterm_in_expr1756 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_OR_in_expr1759 = new BitSet(new long[]{0x00A1100204000000L,0x0000000000000480L});
    public static final BitSet FOLLOW_boolterm_in_expr1762 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_boolfact_in_boolterm1776 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_boolterm1779 = new BitSet(new long[]{0x00A1100204000000L,0x0000000000000480L});
    public static final BitSet FOLLOW_boolfact_in_boolterm1782 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_num_expr_in_boolfact1796 = new BitSet(new long[]{0x0010022181000002L});
    public static final BitSet FOLLOW_EQUAL_in_boolfact1800 = new BitSet(new long[]{0x00A1100204000000L,0x0000000000000480L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_boolfact1805 = new BitSet(new long[]{0x00A1100204000000L,0x0000000000000480L});
    public static final BitSet FOLLOW_LT_in_boolfact1810 = new BitSet(new long[]{0x00A1100204000000L,0x0000000000000480L});
    public static final BitSet FOLLOW_LE_in_boolfact1815 = new BitSet(new long[]{0x00A1100204000000L,0x0000000000000480L});
    public static final BitSet FOLLOW_GT_in_boolfact1820 = new BitSet(new long[]{0x00A1100204000000L,0x0000000000000480L});
    public static final BitSet FOLLOW_GE_in_boolfact1825 = new BitSet(new long[]{0x00A1100204000000L,0x0000000000000480L});
    public static final BitSet FOLLOW_num_expr_in_boolfact1829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_num_expr1843 = new BitSet(new long[]{0x0080100000000002L});
    public static final BitSet FOLLOW_PLUS_in_num_expr1848 = new BitSet(new long[]{0x00A1100204000000L,0x0000000000000480L});
    public static final BitSet FOLLOW_MINUS_in_num_expr1853 = new BitSet(new long[]{0x00A1100204000000L,0x0000000000000480L});
    public static final BitSet FOLLOW_term_in_num_expr1857 = new BitSet(new long[]{0x0080100000000002L});
    public static final BitSet FOLLOW_factor_in_term1875 = new BitSet(new long[]{0x00004000000A0002L});
    public static final BitSet FOLLOW_DOT_in_term1880 = new BitSet(new long[]{0x00A1100204000000L,0x0000000000000480L});
    public static final BitSet FOLLOW_DIV_in_term1885 = new BitSet(new long[]{0x00A1100204000000L,0x0000000000000480L});
    public static final BitSet FOLLOW_MOD_in_term1890 = new BitSet(new long[]{0x00A1100204000000L,0x0000000000000480L});
    public static final BitSet FOLLOW_factor_in_term1894 = new BitSet(new long[]{0x00004000000A0002L});
    public static final BitSet FOLLOW_NOT_in_factor1911 = new BitSet(new long[]{0x0020000204000000L,0x0000000000000480L});
    public static final BitSet FOLLOW_PLUS_in_factor1916 = new BitSet(new long[]{0x0020000204000000L,0x0000000000000480L});
    public static final BitSet FOLLOW_MINUS_in_factor1921 = new BitSet(new long[]{0x0020000204000000L,0x0000000000000480L});
    public static final BitSet FOLLOW_atom_in_factor1926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom1942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUM_in_atom1950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_atom1961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_atom1967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_atom1984 = new BitSet(new long[]{0x00A1100204000000L,0x0000000000000480L});
    public static final BitSet FOLLOW_expr_in_atom1987 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_atom1989 = new BitSet(new long[]{0x0000000000000002L});

}