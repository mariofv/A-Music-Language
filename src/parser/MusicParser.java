// $ANTLR 3.4 src/parser/Music.g 2017-04-06 13:18:12

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ASSIG", "BAR", "BEAT", "BEMOL", "BOOL", "BOOLEAN", "CHORD", "COMMENT", "COMPAS", "COMPAS_LIST", "DECR", "DIMINUTION", "DIV", "DIVIDE_ASSIG", "DOT", "DOUBLE_BAR", "ELSE", "ELSEIF", "END_REPETITION", "EQUAL", "ESC_SEQ", "FALSE", "FIGURE", "FOR", "FUNCALL", "FUNCTION", "GE", "GT", "ID", "IF", "INCR", "INSTRUMENT", "INT", "LE", "LIST_ARGUMENTS", "LIST_ASSIG", "LIST_FUNCTIONS", "LIST_INSTRUCTIONS", "LIST_MUSIC_INST", "LT", "MAJ7", "MINOR", "MINUS", "MINUS_ASSIG", "MOD", "MOD_ASSIG", "NOT", "NOTE", "NOTES", "NOTE_LIST", "NOTE_TYPE", "NOT_EQUAL", "NUM", "OR", "PLUS", "PLUS_ASSIG", "POST", "PRE", "PROD_ASSIG", "REPETITION", "RETURN", "SEVENTH", "SONG", "SPEED", "START_REPETITION", "STRING", "SUSTAIN", "TIE", "TONE", "TRACK", "TRANSPORT", "TRUE", "WHILE", "WS", "'('", "')'", "','", "'.'", "':'", "';'", "'x'", "'{'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__79=79;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;
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
    public static final int INSTRUMENT=36;
    public static final int INT=37;
    public static final int LE=38;
    public static final int LIST_ARGUMENTS=39;
    public static final int LIST_ASSIG=40;
    public static final int LIST_FUNCTIONS=41;
    public static final int LIST_INSTRUCTIONS=42;
    public static final int LIST_MUSIC_INST=43;
    public static final int LT=44;
    public static final int MAJ7=45;
    public static final int MINOR=46;
    public static final int MINUS=47;
    public static final int MINUS_ASSIG=48;
    public static final int MOD=49;
    public static final int MOD_ASSIG=50;
    public static final int NOT=51;
    public static final int NOTE=52;
    public static final int NOTES=53;
    public static final int NOTE_LIST=54;
    public static final int NOTE_TYPE=55;
    public static final int NOT_EQUAL=56;
    public static final int NUM=57;
    public static final int OR=58;
    public static final int PLUS=59;
    public static final int PLUS_ASSIG=60;
    public static final int POST=61;
    public static final int PRE=62;
    public static final int PROD_ASSIG=63;
    public static final int REPETITION=64;
    public static final int RETURN=65;
    public static final int SEVENTH=66;
    public static final int SONG=67;
    public static final int SPEED=68;
    public static final int START_REPETITION=69;
    public static final int STRING=70;
    public static final int SUSTAIN=71;
    public static final int TIE=72;
    public static final int TONE=73;
    public static final int TRACK=74;
    public static final int TRANSPORT=75;
    public static final int TRUE=76;
    public static final int WHILE=77;
    public static final int WS=78;

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
        RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
        RewriteRuleTokenStream stream_80=new RewriteRuleTokenStream(adaptor,"token 80");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
        RewriteRuleTokenStream stream_87=new RewriteRuleTokenStream(adaptor,"token 87");
        RewriteRuleSubtreeStream stream_listInst=new RewriteRuleSubtreeStream(adaptor,"rule listInst");
        RewriteRuleSubtreeStream stream_list_arguments=new RewriteRuleSubtreeStream(adaptor,"rule list_arguments");
        try {
            // src/parser/Music.g:41:13: (id= ID '(' list_arguments ')' '{' listInst '}' -> ^( FUNCTION[$id.text] list_arguments listInst ) )
            // src/parser/Music.g:41:17: id= ID '(' list_arguments ')' '{' listInst '}'
            {
            id=(Token)match(input,ID,FOLLOW_ID_in_function211);  
            stream_ID.add(id);


            char_literal3=(Token)match(input,79,FOLLOW_79_in_function213);  
            stream_79.add(char_literal3);


            pushFollow(FOLLOW_list_arguments_in_function215);
            list_arguments4=list_arguments();

            state._fsp--;

            stream_list_arguments.add(list_arguments4.getTree());

            char_literal5=(Token)match(input,80,FOLLOW_80_in_function217);  
            stream_80.add(char_literal5);


            char_literal6=(Token)match(input,86,FOLLOW_86_in_function219);  
            stream_86.add(char_literal6);


            pushFollow(FOLLOW_listInst_in_function221);
            listInst7=listInst();

            state._fsp--;

            stream_listInst.add(listInst7.getTree());

            char_literal8=(Token)match(input,87,FOLLOW_87_in_function223);  
            stream_87.add(char_literal8);


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
        RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
        RewriteRuleSubtreeStream stream_argument=new RewriteRuleSubtreeStream(adaptor,"rule argument");
        try {
            // src/parser/Music.g:44:17: ( ( argument ( ',' argument )* )? -> ^( LIST_ARGUMENTS ( argument )* ) )
            // src/parser/Music.g:44:19: ( argument ( ',' argument )* )?
            {
            // src/parser/Music.g:44:19: ( argument ( ',' argument )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==BOOL||LA3_0==CHORD||LA3_0==INT||LA3_0==NOTE_TYPE) ) {
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

                        if ( (LA2_0==81) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // src/parser/Music.g:44:30: ',' argument
                    	    {
                    	    char_literal10=(Token)match(input,81,FOLLOW_81_in_list_arguments265);  
                    	    stream_81.add(char_literal10);


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
    // src/parser/Music.g:47:1: argument : type ^ ID ;
    public final MusicParser.argument_return argument() throws RecognitionException {
        MusicParser.argument_return retval = new MusicParser.argument_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token ID13=null;
        MusicParser.type_return type12 =null;


        AmlTree ID13_tree=null;

        try {
            // src/parser/Music.g:47:11: ( type ^ ID )
            // src/parser/Music.g:47:15: type ^ ID
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_type_in_argument308);
            type12=type();

            state._fsp--;

            root_0 = (AmlTree)adaptor.becomeRoot(type12.getTree(), root_0);

            ID13=(Token)match(input,ID,FOLLOW_ID_in_argument311); 
            ID13_tree = 
            (AmlTree)adaptor.create(ID13)
            ;
            adaptor.addChild(root_0, ID13_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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


            pushFollow(FOLLOW_expr_in_params337);
            expr14=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr14.getTree());

            // src/parser/Music.g:50:22: ( ',' ! expr )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==81) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // src/parser/Music.g:50:23: ',' ! expr
            	    {
            	    char_literal15=(Token)match(input,81,FOLLOW_81_in_params340); 

            	    pushFollow(FOLLOW_expr_in_params343);
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
            // src/parser/Music.g:53:16: ( inst )*
            {
            // src/parser/Music.g:53:16: ( inst )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==BEAT||LA5_0==BOOL||LA5_0==CHORD||LA5_0==DECR||LA5_0==DOUBLE_BAR||LA5_0==FOR||(LA5_0 >= ID && LA5_0 <= INT)||LA5_0==NOTE_TYPE||LA5_0==NUM||(LA5_0 >= SONG && LA5_0 <= START_REPETITION)||LA5_0==TONE||LA5_0==WHILE) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // src/parser/Music.g:53:16: inst
            	    {
            	    pushFollow(FOLLOW_inst_in_listInst370);
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
            // 53:23: -> ^( LIST_INSTRUCTIONS ( inst )* )
            {
                // src/parser/Music.g:53:26: ^( LIST_INSTRUCTIONS ( inst )* )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(LIST_INSTRUCTIONS, "LIST_INSTRUCTIONS")
                , root_1);

                // src/parser/Music.g:53:46: ( inst )*
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
    // src/parser/Music.g:56:1: list_music_inst : ( music_inst )* -> ^( LIST_MUSIC_INST ( music_inst )* ) ;
    public final MusicParser.list_music_inst_return list_music_inst() throws RecognitionException {
        MusicParser.list_music_inst_return retval = new MusicParser.list_music_inst_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        MusicParser.music_inst_return music_inst18 =null;


        RewriteRuleSubtreeStream stream_music_inst=new RewriteRuleSubtreeStream(adaptor,"rule music_inst");
        try {
            // src/parser/Music.g:56:17: ( ( music_inst )* -> ^( LIST_MUSIC_INST ( music_inst )* ) )
            // src/parser/Music.g:56:21: ( music_inst )*
            {
            // src/parser/Music.g:56:21: ( music_inst )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= BEMOL && LA6_0 <= BOOL)||LA6_0==CHORD||LA6_0==DECR||LA6_0==FOR||(LA6_0 >= ID && LA6_0 <= INCR)||LA6_0==INT||LA6_0==NOTE||LA6_0==NOTE_TYPE||LA6_0==SONG||LA6_0==SUSTAIN||LA6_0==WHILE||LA6_0==79) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // src/parser/Music.g:56:21: music_inst
            	    {
            	    pushFollow(FOLLOW_music_inst_in_list_music_inst404);
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
            // 56:33: -> ^( LIST_MUSIC_INST ( music_inst )* )
            {
                // src/parser/Music.g:56:36: ^( LIST_MUSIC_INST ( music_inst )* )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(LIST_MUSIC_INST, "LIST_MUSIC_INST")
                , root_1);

                // src/parser/Music.g:56:54: ( music_inst )*
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
    // src/parser/Music.g:59:1: inst : ( declaration | tone | beat | speed | instrument | assignation | while_stmt | funcall | for_stmt | if_stmt | song | compas_list );
    public final MusicParser.inst_return inst() throws RecognitionException {
        MusicParser.inst_return retval = new MusicParser.inst_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        MusicParser.declaration_return declaration19 =null;

        MusicParser.tone_return tone20 =null;

        MusicParser.beat_return beat21 =null;

        MusicParser.speed_return speed22 =null;

        MusicParser.instrument_return instrument23 =null;

        MusicParser.assignation_return assignation24 =null;

        MusicParser.while_stmt_return while_stmt25 =null;

        MusicParser.funcall_return funcall26 =null;

        MusicParser.for_stmt_return for_stmt27 =null;

        MusicParser.if_stmt_return if_stmt28 =null;

        MusicParser.song_return song29 =null;

        MusicParser.compas_list_return compas_list30 =null;



        try {
            // src/parser/Music.g:59:13: ( declaration | tone | beat | speed | instrument | assignation | while_stmt | funcall | for_stmt | if_stmt | song | compas_list )
            int alt7=12;
            switch ( input.LA(1) ) {
            case BOOL:
            case CHORD:
            case INT:
            case NOTE_TYPE:
                {
                alt7=1;
                }
                break;
            case TONE:
                {
                alt7=2;
                }
                break;
            case BEAT:
                {
                alt7=3;
                }
                break;
            case SPEED:
                {
                alt7=4;
                }
                break;
            case INSTRUMENT:
                {
                alt7=5;
                }
                break;
            case ID:
                {
                int LA7_6 = input.LA(2);

                if ( (LA7_6==ASSIG||LA7_6==DECR||LA7_6==DIVIDE_ASSIG||LA7_6==INCR||LA7_6==MINUS_ASSIG||LA7_6==MOD_ASSIG||LA7_6==PLUS_ASSIG||LA7_6==PROD_ASSIG) ) {
                    alt7=6;
                }
                else if ( (LA7_6==79) ) {
                    alt7=8;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 6, input);

                    throw nvae;

                }
                }
                break;
            case DECR:
            case INCR:
                {
                alt7=6;
                }
                break;
            case WHILE:
                {
                alt7=7;
                }
                break;
            case FOR:
                {
                alt7=9;
                }
                break;
            case IF:
                {
                alt7=10;
                }
                break;
            case SONG:
                {
                alt7=11;
                }
                break;
            case DOUBLE_BAR:
            case NUM:
            case START_REPETITION:
                {
                alt7=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }

            switch (alt7) {
                case 1 :
                    // src/parser/Music.g:59:17: declaration
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_declaration_in_inst448);
                    declaration19=declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, declaration19.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:60:17: tone
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_tone_in_inst466);
                    tone20=tone();

                    state._fsp--;

                    adaptor.addChild(root_0, tone20.getTree());

                    }
                    break;
                case 3 :
                    // src/parser/Music.g:61:17: beat
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_beat_in_inst484);
                    beat21=beat();

                    state._fsp--;

                    adaptor.addChild(root_0, beat21.getTree());

                    }
                    break;
                case 4 :
                    // src/parser/Music.g:62:17: speed
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_speed_in_inst502);
                    speed22=speed();

                    state._fsp--;

                    adaptor.addChild(root_0, speed22.getTree());

                    }
                    break;
                case 5 :
                    // src/parser/Music.g:63:17: instrument
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_instrument_in_inst520);
                    instrument23=instrument();

                    state._fsp--;

                    adaptor.addChild(root_0, instrument23.getTree());

                    }
                    break;
                case 6 :
                    // src/parser/Music.g:64:17: assignation
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_assignation_in_inst538);
                    assignation24=assignation();

                    state._fsp--;

                    adaptor.addChild(root_0, assignation24.getTree());

                    }
                    break;
                case 7 :
                    // src/parser/Music.g:65:17: while_stmt
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_while_stmt_in_inst556);
                    while_stmt25=while_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, while_stmt25.getTree());

                    }
                    break;
                case 8 :
                    // src/parser/Music.g:66:17: funcall
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_inst574);
                    funcall26=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall26.getTree());

                    }
                    break;
                case 9 :
                    // src/parser/Music.g:67:17: for_stmt
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_for_stmt_in_inst592);
                    for_stmt27=for_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, for_stmt27.getTree());

                    }
                    break;
                case 10 :
                    // src/parser/Music.g:68:17: if_stmt
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_if_stmt_in_inst610);
                    if_stmt28=if_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, if_stmt28.getTree());

                    }
                    break;
                case 11 :
                    // src/parser/Music.g:69:17: song
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_song_in_inst628);
                    song29=song();

                    state._fsp--;

                    adaptor.addChild(root_0, song29.getTree());

                    }
                    break;
                case 12 :
                    // src/parser/Music.g:70:17: compas_list
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_compas_list_in_inst646);
                    compas_list30=compas_list();

                    state._fsp--;

                    adaptor.addChild(root_0, compas_list30.getTree());

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
    // src/parser/Music.g:73:1: music_inst : ( declaration | assignation | while_music_stmt | funcall | for_music_stmt | if_music_stmt | song | ( options {greedy=true; } : notes_group )+ ( ';' !)? );
    public final MusicParser.music_inst_return music_inst() throws RecognitionException {
        MusicParser.music_inst_return retval = new MusicParser.music_inst_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal39=null;
        MusicParser.declaration_return declaration31 =null;

        MusicParser.assignation_return assignation32 =null;

        MusicParser.while_music_stmt_return while_music_stmt33 =null;

        MusicParser.funcall_return funcall34 =null;

        MusicParser.for_music_stmt_return for_music_stmt35 =null;

        MusicParser.if_music_stmt_return if_music_stmt36 =null;

        MusicParser.song_return song37 =null;

        MusicParser.notes_group_return notes_group38 =null;


        AmlTree char_literal39_tree=null;

        try {
            // src/parser/Music.g:73:13: ( declaration | assignation | while_music_stmt | funcall | for_music_stmt | if_music_stmt | song | ( options {greedy=true; } : notes_group )+ ( ';' !)? )
            int alt10=8;
            switch ( input.LA(1) ) {
            case CHORD:
                {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==79) ) {
                    alt10=8;
                }
                else if ( (LA10_1==ID) ) {
                    alt10=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;

                }
                }
                break;
            case ID:
                {
                int LA10_2 = input.LA(2);

                if ( (LA10_2==ASSIG||LA10_2==DECR||LA10_2==DIVIDE_ASSIG||LA10_2==INCR||LA10_2==MINUS_ASSIG||LA10_2==MOD_ASSIG||LA10_2==PLUS_ASSIG||LA10_2==PROD_ASSIG) ) {
                    alt10=2;
                }
                else if ( (LA10_2==79) ) {
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
            case BOOL:
            case INT:
            case NOTE_TYPE:
                {
                alt10=1;
                }
                break;
            case BEMOL:
            case NOTE:
            case SUSTAIN:
            case 79:
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
                    // src/parser/Music.g:73:17: declaration
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_declaration_in_music_inst670);
                    declaration31=declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, declaration31.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:74:17: assignation
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_assignation_in_music_inst688);
                    assignation32=assignation();

                    state._fsp--;

                    adaptor.addChild(root_0, assignation32.getTree());

                    }
                    break;
                case 3 :
                    // src/parser/Music.g:75:17: while_music_stmt
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_while_music_stmt_in_music_inst706);
                    while_music_stmt33=while_music_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, while_music_stmt33.getTree());

                    }
                    break;
                case 4 :
                    // src/parser/Music.g:76:17: funcall
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_music_inst724);
                    funcall34=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall34.getTree());

                    }
                    break;
                case 5 :
                    // src/parser/Music.g:77:17: for_music_stmt
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_for_music_stmt_in_music_inst742);
                    for_music_stmt35=for_music_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, for_music_stmt35.getTree());

                    }
                    break;
                case 6 :
                    // src/parser/Music.g:78:17: if_music_stmt
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_if_music_stmt_in_music_inst760);
                    if_music_stmt36=if_music_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, if_music_stmt36.getTree());

                    }
                    break;
                case 7 :
                    // src/parser/Music.g:79:17: song
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_song_in_music_inst778);
                    song37=song();

                    state._fsp--;

                    adaptor.addChild(root_0, song37.getTree());

                    }
                    break;
                case 8 :
                    // src/parser/Music.g:80:16: ( options {greedy=true; } : notes_group )+ ( ';' !)?
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    // src/parser/Music.g:80:16: ( options {greedy=true; } : notes_group )+
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
                        case 79:
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
                    	    // src/parser/Music.g:80:42: notes_group
                    	    {
                    	    pushFollow(FOLLOW_notes_group_in_music_inst805);
                    	    notes_group38=notes_group();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, notes_group38.getTree());

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


                    // src/parser/Music.g:80:59: ( ';' !)?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==84) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // src/parser/Music.g:80:59: ';' !
                            {
                            char_literal39=(Token)match(input,84,FOLLOW_84_in_music_inst809); 

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
    // src/parser/Music.g:83:1: funcall : id= ID '(' ( params )? ')' ';' -> ^( FUNCALL[$id.text] ( params )? ) ;
    public final MusicParser.funcall_return funcall() throws RecognitionException {
        MusicParser.funcall_return retval = new MusicParser.funcall_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token id=null;
        Token char_literal40=null;
        Token char_literal42=null;
        Token char_literal43=null;
        MusicParser.params_return params41 =null;


        AmlTree id_tree=null;
        AmlTree char_literal40_tree=null;
        AmlTree char_literal42_tree=null;
        AmlTree char_literal43_tree=null;
        RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
        RewriteRuleTokenStream stream_80=new RewriteRuleTokenStream(adaptor,"token 80");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");
        RewriteRuleSubtreeStream stream_params=new RewriteRuleSubtreeStream(adaptor,"rule params");
        try {
            // src/parser/Music.g:83:13: (id= ID '(' ( params )? ')' ';' -> ^( FUNCALL[$id.text] ( params )? ) )
            // src/parser/Music.g:83:17: id= ID '(' ( params )? ')' ';'
            {
            id=(Token)match(input,ID,FOLLOW_ID_in_funcall840);  
            stream_ID.add(id);


            char_literal40=(Token)match(input,79,FOLLOW_79_in_funcall842);  
            stream_79.add(char_literal40);


            // src/parser/Music.g:83:27: ( params )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==FALSE||LA11_0==ID||LA11_0==MINUS||LA11_0==NOT||LA11_0==NUM||LA11_0==PLUS||LA11_0==TRUE||LA11_0==79) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // src/parser/Music.g:83:27: params
                    {
                    pushFollow(FOLLOW_params_in_funcall844);
                    params41=params();

                    state._fsp--;

                    stream_params.add(params41.getTree());

                    }
                    break;

            }


            char_literal42=(Token)match(input,80,FOLLOW_80_in_funcall847);  
            stream_80.add(char_literal42);


            char_literal43=(Token)match(input,84,FOLLOW_84_in_funcall849);  
            stream_84.add(char_literal43);


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
            // 83:43: -> ^( FUNCALL[$id.text] ( params )? )
            {
                // src/parser/Music.g:83:46: ^( FUNCALL[$id.text] ( params )? )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(FUNCALL, (id!=null?id.getText():null))
                , root_1);

                // src/parser/Music.g:83:66: ( params )?
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
    // src/parser/Music.g:86:1: declaration : type ^ assig_opt ( ',' ! assig_opt )* ';' !;
    public final MusicParser.declaration_return declaration() throws RecognitionException {
        MusicParser.declaration_return retval = new MusicParser.declaration_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal46=null;
        Token char_literal48=null;
        MusicParser.type_return type44 =null;

        MusicParser.assig_opt_return assig_opt45 =null;

        MusicParser.assig_opt_return assig_opt47 =null;


        AmlTree char_literal46_tree=null;
        AmlTree char_literal48_tree=null;

        try {
            // src/parser/Music.g:86:13: ( type ^ assig_opt ( ',' ! assig_opt )* ';' !)
            // src/parser/Music.g:86:17: type ^ assig_opt ( ',' ! assig_opt )* ';' !
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_type_in_declaration882);
            type44=type();

            state._fsp--;

            root_0 = (AmlTree)adaptor.becomeRoot(type44.getTree(), root_0);

            pushFollow(FOLLOW_assig_opt_in_declaration885);
            assig_opt45=assig_opt();

            state._fsp--;

            adaptor.addChild(root_0, assig_opt45.getTree());

            // src/parser/Music.g:86:33: ( ',' ! assig_opt )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==81) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // src/parser/Music.g:86:34: ',' ! assig_opt
            	    {
            	    char_literal46=(Token)match(input,81,FOLLOW_81_in_declaration888); 

            	    pushFollow(FOLLOW_assig_opt_in_declaration891);
            	    assig_opt47=assig_opt();

            	    state._fsp--;

            	    adaptor.addChild(root_0, assig_opt47.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            char_literal48=(Token)match(input,84,FOLLOW_84_in_declaration895); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:89:1: type : ( INT | BOOL | NOTE_TYPE | CHORD );
    public final MusicParser.type_return type() throws RecognitionException {
        MusicParser.type_return retval = new MusicParser.type_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token set49=null;

        AmlTree set49_tree=null;

        try {
            // src/parser/Music.g:89:13: ( INT | BOOL | NOTE_TYPE | CHORD )
            // src/parser/Music.g:
            {
            root_0 = (AmlTree)adaptor.nil();


            set49=(Token)input.LT(1);

            if ( input.LA(1)==BOOL||input.LA(1)==CHORD||input.LA(1)==INT||input.LA(1)==NOTE_TYPE ) {
                input.consume();
                adaptor.addChild(root_0, 
                (AmlTree)adaptor.create(set49)
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


    public static class assig_opt_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assig_opt"
    // src/parser/Music.g:95:1: assig_opt : ID ( ASSIG ^ ( expr | notes_variable ) )? ;
    public final MusicParser.assig_opt_return assig_opt() throws RecognitionException {
        MusicParser.assig_opt_return retval = new MusicParser.assig_opt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token ID50=null;
        Token ASSIG51=null;
        MusicParser.expr_return expr52 =null;

        MusicParser.notes_variable_return notes_variable53 =null;


        AmlTree ID50_tree=null;
        AmlTree ASSIG51_tree=null;

        try {
            // src/parser/Music.g:95:13: ( ID ( ASSIG ^ ( expr | notes_variable ) )? )
            // src/parser/Music.g:95:17: ID ( ASSIG ^ ( expr | notes_variable ) )?
            {
            root_0 = (AmlTree)adaptor.nil();


            ID50=(Token)match(input,ID,FOLLOW_ID_in_assig_opt1005); 
            ID50_tree = 
            (AmlTree)adaptor.create(ID50)
            ;
            adaptor.addChild(root_0, ID50_tree);


            // src/parser/Music.g:95:20: ( ASSIG ^ ( expr | notes_variable ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==ASSIG) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // src/parser/Music.g:95:21: ASSIG ^ ( expr | notes_variable )
                    {
                    ASSIG51=(Token)match(input,ASSIG,FOLLOW_ASSIG_in_assig_opt1008); 
                    ASSIG51_tree = 
                    (AmlTree)adaptor.create(ASSIG51)
                    ;
                    root_0 = (AmlTree)adaptor.becomeRoot(ASSIG51_tree, root_0);


                    // src/parser/Music.g:95:28: ( expr | notes_variable )
                    int alt13=2;
                    switch ( input.LA(1) ) {
                    case FALSE:
                    case ID:
                    case MINUS:
                    case NOT:
                    case NUM:
                    case PLUS:
                    case TRUE:
                        {
                        alt13=1;
                        }
                        break;
                    case 79:
                        {
                        int LA13_2 = input.LA(2);

                        if ( (LA13_2==FALSE||LA13_2==ID||LA13_2==MINUS||LA13_2==NOT||LA13_2==NUM||LA13_2==PLUS||LA13_2==TRUE||LA13_2==79) ) {
                            alt13=1;
                        }
                        else if ( (LA13_2==BEMOL||LA13_2==NOTE||LA13_2==SUSTAIN) ) {
                            alt13=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 13, 2, input);

                            throw nvae;

                        }
                        }
                        break;
                    case BEMOL:
                    case CHORD:
                    case NOTE:
                    case SUSTAIN:
                        {
                        alt13=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        throw nvae;

                    }

                    switch (alt13) {
                        case 1 :
                            // src/parser/Music.g:95:29: expr
                            {
                            pushFollow(FOLLOW_expr_in_assig_opt1012);
                            expr52=expr();

                            state._fsp--;

                            adaptor.addChild(root_0, expr52.getTree());

                            }
                            break;
                        case 2 :
                            // src/parser/Music.g:95:36: notes_variable
                            {
                            pushFollow(FOLLOW_notes_variable_in_assig_opt1016);
                            notes_variable53=notes_variable();

                            state._fsp--;

                            adaptor.addChild(root_0, notes_variable53.getTree());

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
    // src/parser/Music.g:98:1: assignation : assig ';' !;
    public final MusicParser.assignation_return assignation() throws RecognitionException {
        MusicParser.assignation_return retval = new MusicParser.assignation_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal55=null;
        MusicParser.assig_return assig54 =null;


        AmlTree char_literal55_tree=null;

        try {
            // src/parser/Music.g:98:13: ( assig ';' !)
            // src/parser/Music.g:98:17: assig ';' !
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_assig_in_assignation1042);
            assig54=assig();

            state._fsp--;

            adaptor.addChild(root_0, assig54.getTree());

            char_literal55=(Token)match(input,84,FOLLOW_84_in_assignation1044); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:101:1: assig : ( ID ( ASSIG | PLUS_ASSIG | MINUS_ASSIG | PROD_ASSIG | DIVIDE_ASSIG | MOD_ASSIG ) ^ ( expr | notes_variable ) | post | pre );
    public final MusicParser.assig_return assig() throws RecognitionException {
        MusicParser.assig_return retval = new MusicParser.assig_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token ID56=null;
        Token set57=null;
        MusicParser.expr_return expr58 =null;

        MusicParser.notes_variable_return notes_variable59 =null;

        MusicParser.post_return post60 =null;

        MusicParser.pre_return pre61 =null;


        AmlTree ID56_tree=null;
        AmlTree set57_tree=null;

        try {
            // src/parser/Music.g:101:13: ( ID ( ASSIG | PLUS_ASSIG | MINUS_ASSIG | PROD_ASSIG | DIVIDE_ASSIG | MOD_ASSIG ) ^ ( expr | notes_variable ) | post | pre )
            int alt16=3;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==ID) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==ASSIG||LA16_1==DIVIDE_ASSIG||LA16_1==MINUS_ASSIG||LA16_1==MOD_ASSIG||LA16_1==PLUS_ASSIG||LA16_1==PROD_ASSIG) ) {
                    alt16=1;
                }
                else if ( (LA16_1==DECR||LA16_1==INCR) ) {
                    alt16=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA16_0==DECR||LA16_0==INCR) ) {
                alt16=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }
            switch (alt16) {
                case 1 :
                    // src/parser/Music.g:101:17: ID ( ASSIG | PLUS_ASSIG | MINUS_ASSIG | PROD_ASSIG | DIVIDE_ASSIG | MOD_ASSIG ) ^ ( expr | notes_variable )
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    ID56=(Token)match(input,ID,FOLLOW_ID_in_assig1074); 
                    ID56_tree = 
                    (AmlTree)adaptor.create(ID56)
                    ;
                    adaptor.addChild(root_0, ID56_tree);


                    set57=(Token)input.LT(1);

                    set57=(Token)input.LT(1);

                    if ( input.LA(1)==ASSIG||input.LA(1)==DIVIDE_ASSIG||input.LA(1)==MINUS_ASSIG||input.LA(1)==MOD_ASSIG||input.LA(1)==PLUS_ASSIG||input.LA(1)==PROD_ASSIG ) {
                        input.consume();
                        root_0 = (AmlTree)adaptor.becomeRoot(
                        (AmlTree)adaptor.create(set57)
                        , root_0);
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    // src/parser/Music.g:101:86: ( expr | notes_variable )
                    int alt15=2;
                    switch ( input.LA(1) ) {
                    case FALSE:
                    case ID:
                    case MINUS:
                    case NOT:
                    case NUM:
                    case PLUS:
                    case TRUE:
                        {
                        alt15=1;
                        }
                        break;
                    case 79:
                        {
                        int LA15_2 = input.LA(2);

                        if ( (LA15_2==FALSE||LA15_2==ID||LA15_2==MINUS||LA15_2==NOT||LA15_2==NUM||LA15_2==PLUS||LA15_2==TRUE||LA15_2==79) ) {
                            alt15=1;
                        }
                        else if ( (LA15_2==BEMOL||LA15_2==NOTE||LA15_2==SUSTAIN) ) {
                            alt15=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 15, 2, input);

                            throw nvae;

                        }
                        }
                        break;
                    case BEMOL:
                    case CHORD:
                    case NOTE:
                    case SUSTAIN:
                        {
                        alt15=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 0, input);

                        throw nvae;

                    }

                    switch (alt15) {
                        case 1 :
                            // src/parser/Music.g:101:87: expr
                            {
                            pushFollow(FOLLOW_expr_in_assig1092);
                            expr58=expr();

                            state._fsp--;

                            adaptor.addChild(root_0, expr58.getTree());

                            }
                            break;
                        case 2 :
                            // src/parser/Music.g:101:94: notes_variable
                            {
                            pushFollow(FOLLOW_notes_variable_in_assig1096);
                            notes_variable59=notes_variable();

                            state._fsp--;

                            adaptor.addChild(root_0, notes_variable59.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // src/parser/Music.g:102:17: post
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_post_in_assig1115);
                    post60=post();

                    state._fsp--;

                    adaptor.addChild(root_0, post60.getTree());

                    }
                    break;
                case 3 :
                    // src/parser/Music.g:103:17: pre
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_pre_in_assig1133);
                    pre61=pre();

                    state._fsp--;

                    adaptor.addChild(root_0, pre61.getTree());

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
    // src/parser/Music.g:106:1: post : ID (x= INCR |x= DECR ) -> ^( POST ID $x) ;
    public final MusicParser.post_return post() throws RecognitionException {
        MusicParser.post_return retval = new MusicParser.post_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token x=null;
        Token ID62=null;

        AmlTree x_tree=null;
        AmlTree ID62_tree=null;
        RewriteRuleTokenStream stream_INCR=new RewriteRuleTokenStream(adaptor,"token INCR");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_DECR=new RewriteRuleTokenStream(adaptor,"token DECR");

        try {
            // src/parser/Music.g:106:13: ( ID (x= INCR |x= DECR ) -> ^( POST ID $x) )
            // src/parser/Music.g:106:17: ID (x= INCR |x= DECR )
            {
            ID62=(Token)match(input,ID,FOLLOW_ID_in_post1163);  
            stream_ID.add(ID62);


            // src/parser/Music.g:106:20: (x= INCR |x= DECR )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==INCR) ) {
                alt17=1;
            }
            else if ( (LA17_0==DECR) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;

            }
            switch (alt17) {
                case 1 :
                    // src/parser/Music.g:106:21: x= INCR
                    {
                    x=(Token)match(input,INCR,FOLLOW_INCR_in_post1168);  
                    stream_INCR.add(x);


                    }
                    break;
                case 2 :
                    // src/parser/Music.g:106:30: x= DECR
                    {
                    x=(Token)match(input,DECR,FOLLOW_DECR_in_post1174);  
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
            // 106:38: -> ^( POST ID $x)
            {
                // src/parser/Music.g:106:42: ^( POST ID $x)
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
    // src/parser/Music.g:109:1: pre : (x= INCR |x= DECR ) ID -> ^( PRE ID $x) ;
    public final MusicParser.pre_return pre() throws RecognitionException {
        MusicParser.pre_return retval = new MusicParser.pre_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token x=null;
        Token ID63=null;

        AmlTree x_tree=null;
        AmlTree ID63_tree=null;
        RewriteRuleTokenStream stream_INCR=new RewriteRuleTokenStream(adaptor,"token INCR");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_DECR=new RewriteRuleTokenStream(adaptor,"token DECR");

        try {
            // src/parser/Music.g:109:13: ( (x= INCR |x= DECR ) ID -> ^( PRE ID $x) )
            // src/parser/Music.g:109:17: (x= INCR |x= DECR ) ID
            {
            // src/parser/Music.g:109:17: (x= INCR |x= DECR )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==INCR) ) {
                alt18=1;
            }
            else if ( (LA18_0==DECR) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }
            switch (alt18) {
                case 1 :
                    // src/parser/Music.g:109:18: x= INCR
                    {
                    x=(Token)match(input,INCR,FOLLOW_INCR_in_pre1221);  
                    stream_INCR.add(x);


                    }
                    break;
                case 2 :
                    // src/parser/Music.g:109:27: x= DECR
                    {
                    x=(Token)match(input,DECR,FOLLOW_DECR_in_pre1227);  
                    stream_DECR.add(x);


                    }
                    break;

            }


            ID63=(Token)match(input,ID,FOLLOW_ID_in_pre1230);  
            stream_ID.add(ID63);


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
            // 109:39: -> ^( PRE ID $x)
            {
                // src/parser/Music.g:109:42: ^( PRE ID $x)
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
    // src/parser/Music.g:112:1: beat : BEAT ^ NUM ':' ! NUM ;
    public final MusicParser.beat_return beat() throws RecognitionException {
        MusicParser.beat_return retval = new MusicParser.beat_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token BEAT64=null;
        Token NUM65=null;
        Token char_literal66=null;
        Token NUM67=null;

        AmlTree BEAT64_tree=null;
        AmlTree NUM65_tree=null;
        AmlTree char_literal66_tree=null;
        AmlTree NUM67_tree=null;

        try {
            // src/parser/Music.g:112:13: ( BEAT ^ NUM ':' ! NUM )
            // src/parser/Music.g:112:17: BEAT ^ NUM ':' ! NUM
            {
            root_0 = (AmlTree)adaptor.nil();


            BEAT64=(Token)match(input,BEAT,FOLLOW_BEAT_in_beat1273); 
            BEAT64_tree = 
            (AmlTree)adaptor.create(BEAT64)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(BEAT64_tree, root_0);


            NUM65=(Token)match(input,NUM,FOLLOW_NUM_in_beat1276); 
            NUM65_tree = 
            (AmlTree)adaptor.create(NUM65)
            ;
            adaptor.addChild(root_0, NUM65_tree);


            char_literal66=(Token)match(input,83,FOLLOW_83_in_beat1278); 

            NUM67=(Token)match(input,NUM,FOLLOW_NUM_in_beat1281); 
            NUM67_tree = 
            (AmlTree)adaptor.create(NUM67)
            ;
            adaptor.addChild(root_0, NUM67_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:115:1: speed : SPEED ^ NUM ;
    public final MusicParser.speed_return speed() throws RecognitionException {
        MusicParser.speed_return retval = new MusicParser.speed_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token SPEED68=null;
        Token NUM69=null;

        AmlTree SPEED68_tree=null;
        AmlTree NUM69_tree=null;

        try {
            // src/parser/Music.g:115:13: ( SPEED ^ NUM )
            // src/parser/Music.g:115:17: SPEED ^ NUM
            {
            root_0 = (AmlTree)adaptor.nil();


            SPEED68=(Token)match(input,SPEED,FOLLOW_SPEED_in_speed1310); 
            SPEED68_tree = 
            (AmlTree)adaptor.create(SPEED68)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(SPEED68_tree, root_0);


            NUM69=(Token)match(input,NUM,FOLLOW_NUM_in_speed1313); 
            NUM69_tree = 
            (AmlTree)adaptor.create(NUM69)
            ;
            adaptor.addChild(root_0, NUM69_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:118:1: transport : TRANSPORT ^ NUM ;
    public final MusicParser.transport_return transport() throws RecognitionException {
        MusicParser.transport_return retval = new MusicParser.transport_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token TRANSPORT70=null;
        Token NUM71=null;

        AmlTree TRANSPORT70_tree=null;
        AmlTree NUM71_tree=null;

        try {
            // src/parser/Music.g:118:13: ( TRANSPORT ^ NUM )
            // src/parser/Music.g:118:17: TRANSPORT ^ NUM
            {
            root_0 = (AmlTree)adaptor.nil();


            TRANSPORT70=(Token)match(input,TRANSPORT,FOLLOW_TRANSPORT_in_transport1338); 
            TRANSPORT70_tree = 
            (AmlTree)adaptor.create(TRANSPORT70)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(TRANSPORT70_tree, root_0);


            NUM71=(Token)match(input,NUM,FOLLOW_NUM_in_transport1341); 
            NUM71_tree = 
            (AmlTree)adaptor.create(NUM71)
            ;
            adaptor.addChild(root_0, NUM71_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:121:1: instrument : INSTRUMENT ^ STRING ;
    public final MusicParser.instrument_return instrument() throws RecognitionException {
        MusicParser.instrument_return retval = new MusicParser.instrument_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token INSTRUMENT72=null;
        Token STRING73=null;

        AmlTree INSTRUMENT72_tree=null;
        AmlTree STRING73_tree=null;

        try {
            // src/parser/Music.g:121:13: ( INSTRUMENT ^ STRING )
            // src/parser/Music.g:121:17: INSTRUMENT ^ STRING
            {
            root_0 = (AmlTree)adaptor.nil();


            INSTRUMENT72=(Token)match(input,INSTRUMENT,FOLLOW_INSTRUMENT_in_instrument1365); 
            INSTRUMENT72_tree = 
            (AmlTree)adaptor.create(INSTRUMENT72)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(INSTRUMENT72_tree, root_0);


            STRING73=(Token)match(input,STRING,FOLLOW_STRING_in_instrument1368); 
            STRING73_tree = 
            (AmlTree)adaptor.create(STRING73)
            ;
            adaptor.addChild(root_0, STRING73_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:124:1: while_stmt : WHILE ^ '(' ! expr ')' ! '{' ! listInst '}' !;
    public final MusicParser.while_stmt_return while_stmt() throws RecognitionException {
        MusicParser.while_stmt_return retval = new MusicParser.while_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token WHILE74=null;
        Token char_literal75=null;
        Token char_literal77=null;
        Token char_literal78=null;
        Token char_literal80=null;
        MusicParser.expr_return expr76 =null;

        MusicParser.listInst_return listInst79 =null;


        AmlTree WHILE74_tree=null;
        AmlTree char_literal75_tree=null;
        AmlTree char_literal77_tree=null;
        AmlTree char_literal78_tree=null;
        AmlTree char_literal80_tree=null;

        try {
            // src/parser/Music.g:124:13: ( WHILE ^ '(' ! expr ')' ! '{' ! listInst '}' !)
            // src/parser/Music.g:124:17: WHILE ^ '(' ! expr ')' ! '{' ! listInst '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            WHILE74=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_stmt1392); 
            WHILE74_tree = 
            (AmlTree)adaptor.create(WHILE74)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(WHILE74_tree, root_0);


            char_literal75=(Token)match(input,79,FOLLOW_79_in_while_stmt1395); 

            pushFollow(FOLLOW_expr_in_while_stmt1398);
            expr76=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr76.getTree());

            char_literal77=(Token)match(input,80,FOLLOW_80_in_while_stmt1400); 

            char_literal78=(Token)match(input,86,FOLLOW_86_in_while_stmt1403); 

            pushFollow(FOLLOW_listInst_in_while_stmt1406);
            listInst79=listInst();

            state._fsp--;

            adaptor.addChild(root_0, listInst79.getTree());

            char_literal80=(Token)match(input,87,FOLLOW_87_in_while_stmt1408); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:127:1: while_music_stmt : WHILE ^ '(' ! expr ')' ! '{' ! list_music_inst '}' !;
    public final MusicParser.while_music_stmt_return while_music_stmt() throws RecognitionException {
        MusicParser.while_music_stmt_return retval = new MusicParser.while_music_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token WHILE81=null;
        Token char_literal82=null;
        Token char_literal84=null;
        Token char_literal85=null;
        Token char_literal87=null;
        MusicParser.expr_return expr83 =null;

        MusicParser.list_music_inst_return list_music_inst86 =null;


        AmlTree WHILE81_tree=null;
        AmlTree char_literal82_tree=null;
        AmlTree char_literal84_tree=null;
        AmlTree char_literal85_tree=null;
        AmlTree char_literal87_tree=null;

        try {
            // src/parser/Music.g:127:21: ( WHILE ^ '(' ! expr ')' ! '{' ! list_music_inst '}' !)
            // src/parser/Music.g:127:25: WHILE ^ '(' ! expr ')' ! '{' ! list_music_inst '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            WHILE81=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_music_stmt1435); 
            WHILE81_tree = 
            (AmlTree)adaptor.create(WHILE81)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(WHILE81_tree, root_0);


            char_literal82=(Token)match(input,79,FOLLOW_79_in_while_music_stmt1438); 

            pushFollow(FOLLOW_expr_in_while_music_stmt1441);
            expr83=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr83.getTree());

            char_literal84=(Token)match(input,80,FOLLOW_80_in_while_music_stmt1443); 

            char_literal85=(Token)match(input,86,FOLLOW_86_in_while_music_stmt1446); 

            pushFollow(FOLLOW_list_music_inst_in_while_music_stmt1449);
            list_music_inst86=list_music_inst();

            state._fsp--;

            adaptor.addChild(root_0, list_music_inst86.getTree());

            char_literal87=(Token)match(input,87,FOLLOW_87_in_while_music_stmt1451); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:130:1: for_stmt : FOR ^ '(' ! ( declaration | list_assig ';' !) expr ';' ! list_assig ')' ! '{' ! listInst '}' !;
    public final MusicParser.for_stmt_return for_stmt() throws RecognitionException {
        MusicParser.for_stmt_return retval = new MusicParser.for_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token FOR88=null;
        Token char_literal89=null;
        Token char_literal92=null;
        Token char_literal94=null;
        Token char_literal96=null;
        Token char_literal97=null;
        Token char_literal99=null;
        MusicParser.declaration_return declaration90 =null;

        MusicParser.list_assig_return list_assig91 =null;

        MusicParser.expr_return expr93 =null;

        MusicParser.list_assig_return list_assig95 =null;

        MusicParser.listInst_return listInst98 =null;


        AmlTree FOR88_tree=null;
        AmlTree char_literal89_tree=null;
        AmlTree char_literal92_tree=null;
        AmlTree char_literal94_tree=null;
        AmlTree char_literal96_tree=null;
        AmlTree char_literal97_tree=null;
        AmlTree char_literal99_tree=null;

        try {
            // src/parser/Music.g:130:13: ( FOR ^ '(' ! ( declaration | list_assig ';' !) expr ';' ! list_assig ')' ! '{' ! listInst '}' !)
            // src/parser/Music.g:130:17: FOR ^ '(' ! ( declaration | list_assig ';' !) expr ';' ! list_assig ')' ! '{' ! listInst '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            FOR88=(Token)match(input,FOR,FOLLOW_FOR_in_for_stmt1486); 
            FOR88_tree = 
            (AmlTree)adaptor.create(FOR88)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(FOR88_tree, root_0);


            char_literal89=(Token)match(input,79,FOLLOW_79_in_for_stmt1489); 

            // src/parser/Music.g:130:27: ( declaration | list_assig ';' !)
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==BOOL||LA19_0==CHORD||LA19_0==INT||LA19_0==NOTE_TYPE) ) {
                alt19=1;
            }
            else if ( (LA19_0==DECR||LA19_0==ID||LA19_0==INCR) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }
            switch (alt19) {
                case 1 :
                    // src/parser/Music.g:130:28: declaration
                    {
                    pushFollow(FOLLOW_declaration_in_for_stmt1493);
                    declaration90=declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, declaration90.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:130:42: list_assig ';' !
                    {
                    pushFollow(FOLLOW_list_assig_in_for_stmt1497);
                    list_assig91=list_assig();

                    state._fsp--;

                    adaptor.addChild(root_0, list_assig91.getTree());

                    char_literal92=(Token)match(input,84,FOLLOW_84_in_for_stmt1499); 

                    }
                    break;

            }


            pushFollow(FOLLOW_expr_in_for_stmt1503);
            expr93=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr93.getTree());

            char_literal94=(Token)match(input,84,FOLLOW_84_in_for_stmt1505); 

            pushFollow(FOLLOW_list_assig_in_for_stmt1508);
            list_assig95=list_assig();

            state._fsp--;

            adaptor.addChild(root_0, list_assig95.getTree());

            char_literal96=(Token)match(input,80,FOLLOW_80_in_for_stmt1510); 

            char_literal97=(Token)match(input,86,FOLLOW_86_in_for_stmt1513); 

            pushFollow(FOLLOW_listInst_in_for_stmt1516);
            listInst98=listInst();

            state._fsp--;

            adaptor.addChild(root_0, listInst98.getTree());

            char_literal99=(Token)match(input,87,FOLLOW_87_in_for_stmt1518); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:133:1: for_music_stmt : FOR ^ '(' ! ( declaration | list_assig ';' !) expr ';' ! list_assig ')' ! '{' ! list_music_inst '}' !;
    public final MusicParser.for_music_stmt_return for_music_stmt() throws RecognitionException {
        MusicParser.for_music_stmt_return retval = new MusicParser.for_music_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token FOR100=null;
        Token char_literal101=null;
        Token char_literal104=null;
        Token char_literal106=null;
        Token char_literal108=null;
        Token char_literal109=null;
        Token char_literal111=null;
        MusicParser.declaration_return declaration102 =null;

        MusicParser.list_assig_return list_assig103 =null;

        MusicParser.expr_return expr105 =null;

        MusicParser.list_assig_return list_assig107 =null;

        MusicParser.list_music_inst_return list_music_inst110 =null;


        AmlTree FOR100_tree=null;
        AmlTree char_literal101_tree=null;
        AmlTree char_literal104_tree=null;
        AmlTree char_literal106_tree=null;
        AmlTree char_literal108_tree=null;
        AmlTree char_literal109_tree=null;
        AmlTree char_literal111_tree=null;

        try {
            // src/parser/Music.g:133:17: ( FOR ^ '(' ! ( declaration | list_assig ';' !) expr ';' ! list_assig ')' ! '{' ! list_music_inst '}' !)
            // src/parser/Music.g:133:21: FOR ^ '(' ! ( declaration | list_assig ';' !) expr ';' ! list_assig ')' ! '{' ! list_music_inst '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            FOR100=(Token)match(input,FOR,FOLLOW_FOR_in_for_music_stmt1543); 
            FOR100_tree = 
            (AmlTree)adaptor.create(FOR100)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(FOR100_tree, root_0);


            char_literal101=(Token)match(input,79,FOLLOW_79_in_for_music_stmt1546); 

            // src/parser/Music.g:133:31: ( declaration | list_assig ';' !)
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==BOOL||LA20_0==CHORD||LA20_0==INT||LA20_0==NOTE_TYPE) ) {
                alt20=1;
            }
            else if ( (LA20_0==DECR||LA20_0==ID||LA20_0==INCR) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }
            switch (alt20) {
                case 1 :
                    // src/parser/Music.g:133:32: declaration
                    {
                    pushFollow(FOLLOW_declaration_in_for_music_stmt1550);
                    declaration102=declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, declaration102.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:133:46: list_assig ';' !
                    {
                    pushFollow(FOLLOW_list_assig_in_for_music_stmt1554);
                    list_assig103=list_assig();

                    state._fsp--;

                    adaptor.addChild(root_0, list_assig103.getTree());

                    char_literal104=(Token)match(input,84,FOLLOW_84_in_for_music_stmt1556); 

                    }
                    break;

            }


            pushFollow(FOLLOW_expr_in_for_music_stmt1560);
            expr105=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr105.getTree());

            char_literal106=(Token)match(input,84,FOLLOW_84_in_for_music_stmt1562); 

            pushFollow(FOLLOW_list_assig_in_for_music_stmt1565);
            list_assig107=list_assig();

            state._fsp--;

            adaptor.addChild(root_0, list_assig107.getTree());

            char_literal108=(Token)match(input,80,FOLLOW_80_in_for_music_stmt1567); 

            char_literal109=(Token)match(input,86,FOLLOW_86_in_for_music_stmt1570); 

            pushFollow(FOLLOW_list_music_inst_in_for_music_stmt1573);
            list_music_inst110=list_music_inst();

            state._fsp--;

            adaptor.addChild(root_0, list_music_inst110.getTree());

            char_literal111=(Token)match(input,87,FOLLOW_87_in_for_music_stmt1575); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:136:1: list_assig : assig ( ',' assig )* -> ^( LIST_ASSIG ( assig )+ ) ;
    public final MusicParser.list_assig_return list_assig() throws RecognitionException {
        MusicParser.list_assig_return retval = new MusicParser.list_assig_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal113=null;
        MusicParser.assig_return assig112 =null;

        MusicParser.assig_return assig114 =null;


        AmlTree char_literal113_tree=null;
        RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
        RewriteRuleSubtreeStream stream_assig=new RewriteRuleSubtreeStream(adaptor,"rule assig");
        try {
            // src/parser/Music.g:136:13: ( assig ( ',' assig )* -> ^( LIST_ASSIG ( assig )+ ) )
            // src/parser/Music.g:136:17: assig ( ',' assig )*
            {
            pushFollow(FOLLOW_assig_in_list_assig1604);
            assig112=assig();

            state._fsp--;

            stream_assig.add(assig112.getTree());

            // src/parser/Music.g:136:23: ( ',' assig )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==81) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // src/parser/Music.g:136:24: ',' assig
            	    {
            	    char_literal113=(Token)match(input,81,FOLLOW_81_in_list_assig1607);  
            	    stream_81.add(char_literal113);


            	    pushFollow(FOLLOW_assig_in_list_assig1609);
            	    assig114=assig();

            	    state._fsp--;

            	    stream_assig.add(assig114.getTree());

            	    }
            	    break;

            	default :
            	    break loop21;
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
            // 136:36: -> ^( LIST_ASSIG ( assig )+ )
            {
                // src/parser/Music.g:136:39: ^( LIST_ASSIG ( assig )+ )
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
    // src/parser/Music.g:139:1: if_stmt : IF ^ '(' ! expr ')' ! '{' ! listInst '}' ! ( elseif_stmt )* ( else_stmt )? ;
    public final MusicParser.if_stmt_return if_stmt() throws RecognitionException {
        MusicParser.if_stmt_return retval = new MusicParser.if_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token IF115=null;
        Token char_literal116=null;
        Token char_literal118=null;
        Token char_literal119=null;
        Token char_literal121=null;
        MusicParser.expr_return expr117 =null;

        MusicParser.listInst_return listInst120 =null;

        MusicParser.elseif_stmt_return elseif_stmt122 =null;

        MusicParser.else_stmt_return else_stmt123 =null;


        AmlTree IF115_tree=null;
        AmlTree char_literal116_tree=null;
        AmlTree char_literal118_tree=null;
        AmlTree char_literal119_tree=null;
        AmlTree char_literal121_tree=null;

        try {
            // src/parser/Music.g:139:13: ( IF ^ '(' ! expr ')' ! '{' ! listInst '}' ! ( elseif_stmt )* ( else_stmt )? )
            // src/parser/Music.g:139:17: IF ^ '(' ! expr ')' ! '{' ! listInst '}' ! ( elseif_stmt )* ( else_stmt )?
            {
            root_0 = (AmlTree)adaptor.nil();


            IF115=(Token)match(input,IF,FOLLOW_IF_in_if_stmt1647); 
            IF115_tree = 
            (AmlTree)adaptor.create(IF115)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(IF115_tree, root_0);


            char_literal116=(Token)match(input,79,FOLLOW_79_in_if_stmt1650); 

            pushFollow(FOLLOW_expr_in_if_stmt1653);
            expr117=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr117.getTree());

            char_literal118=(Token)match(input,80,FOLLOW_80_in_if_stmt1655); 

            char_literal119=(Token)match(input,86,FOLLOW_86_in_if_stmt1658); 

            pushFollow(FOLLOW_listInst_in_if_stmt1661);
            listInst120=listInst();

            state._fsp--;

            adaptor.addChild(root_0, listInst120.getTree());

            char_literal121=(Token)match(input,87,FOLLOW_87_in_if_stmt1663); 

            // src/parser/Music.g:139:55: ( elseif_stmt )*
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
            	    // src/parser/Music.g:139:55: elseif_stmt
            	    {
            	    pushFollow(FOLLOW_elseif_stmt_in_if_stmt1666);
            	    elseif_stmt122=elseif_stmt();

            	    state._fsp--;

            	    adaptor.addChild(root_0, elseif_stmt122.getTree());

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            // src/parser/Music.g:139:68: ( else_stmt )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==ELSE) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // src/parser/Music.g:139:68: else_stmt
                    {
                    pushFollow(FOLLOW_else_stmt_in_if_stmt1669);
                    else_stmt123=else_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, else_stmt123.getTree());

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
    // src/parser/Music.g:142:1: elseif_stmt : ELSE IF '(' expr ')' '{' listInst '}' -> ^( ELSEIF expr listInst ) ;
    public final MusicParser.elseif_stmt_return elseif_stmt() throws RecognitionException {
        MusicParser.elseif_stmt_return retval = new MusicParser.elseif_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token ELSE124=null;
        Token IF125=null;
        Token char_literal126=null;
        Token char_literal128=null;
        Token char_literal129=null;
        Token char_literal131=null;
        MusicParser.expr_return expr127 =null;

        MusicParser.listInst_return listInst130 =null;


        AmlTree ELSE124_tree=null;
        AmlTree IF125_tree=null;
        AmlTree char_literal126_tree=null;
        AmlTree char_literal128_tree=null;
        AmlTree char_literal129_tree=null;
        AmlTree char_literal131_tree=null;
        RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
        RewriteRuleTokenStream stream_80=new RewriteRuleTokenStream(adaptor,"token 80");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
        RewriteRuleTokenStream stream_87=new RewriteRuleTokenStream(adaptor,"token 87");
        RewriteRuleSubtreeStream stream_listInst=new RewriteRuleSubtreeStream(adaptor,"rule listInst");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // src/parser/Music.g:142:13: ( ELSE IF '(' expr ')' '{' listInst '}' -> ^( ELSEIF expr listInst ) )
            // src/parser/Music.g:142:17: ELSE IF '(' expr ')' '{' listInst '}'
            {
            ELSE124=(Token)match(input,ELSE,FOLLOW_ELSE_in_elseif_stmt1693);  
            stream_ELSE.add(ELSE124);


            IF125=(Token)match(input,IF,FOLLOW_IF_in_elseif_stmt1695);  
            stream_IF.add(IF125);


            char_literal126=(Token)match(input,79,FOLLOW_79_in_elseif_stmt1697);  
            stream_79.add(char_literal126);


            pushFollow(FOLLOW_expr_in_elseif_stmt1699);
            expr127=expr();

            state._fsp--;

            stream_expr.add(expr127.getTree());

            char_literal128=(Token)match(input,80,FOLLOW_80_in_elseif_stmt1701);  
            stream_80.add(char_literal128);


            char_literal129=(Token)match(input,86,FOLLOW_86_in_elseif_stmt1703);  
            stream_86.add(char_literal129);


            pushFollow(FOLLOW_listInst_in_elseif_stmt1705);
            listInst130=listInst();

            state._fsp--;

            stream_listInst.add(listInst130.getTree());

            char_literal131=(Token)match(input,87,FOLLOW_87_in_elseif_stmt1707);  
            stream_87.add(char_literal131);


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
            // 142:55: -> ^( ELSEIF expr listInst )
            {
                // src/parser/Music.g:142:58: ^( ELSEIF expr listInst )
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
    // src/parser/Music.g:145:1: else_stmt : ELSE ^ '{' ! listInst '}' !;
    public final MusicParser.else_stmt_return else_stmt() throws RecognitionException {
        MusicParser.else_stmt_return retval = new MusicParser.else_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token ELSE132=null;
        Token char_literal133=null;
        Token char_literal135=null;
        MusicParser.listInst_return listInst134 =null;


        AmlTree ELSE132_tree=null;
        AmlTree char_literal133_tree=null;
        AmlTree char_literal135_tree=null;

        try {
            // src/parser/Music.g:145:13: ( ELSE ^ '{' ! listInst '}' !)
            // src/parser/Music.g:145:17: ELSE ^ '{' ! listInst '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            ELSE132=(Token)match(input,ELSE,FOLLOW_ELSE_in_else_stmt1742); 
            ELSE132_tree = 
            (AmlTree)adaptor.create(ELSE132)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(ELSE132_tree, root_0);


            char_literal133=(Token)match(input,86,FOLLOW_86_in_else_stmt1745); 

            pushFollow(FOLLOW_listInst_in_else_stmt1748);
            listInst134=listInst();

            state._fsp--;

            adaptor.addChild(root_0, listInst134.getTree());

            char_literal135=(Token)match(input,87,FOLLOW_87_in_else_stmt1750); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:148:1: if_music_stmt : IF ^ '(' ! expr ')' ! '{' ! list_music_inst '}' ! ( elseif_music_stmt )* ( else_music_stmt )? ;
    public final MusicParser.if_music_stmt_return if_music_stmt() throws RecognitionException {
        MusicParser.if_music_stmt_return retval = new MusicParser.if_music_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token IF136=null;
        Token char_literal137=null;
        Token char_literal139=null;
        Token char_literal140=null;
        Token char_literal142=null;
        MusicParser.expr_return expr138 =null;

        MusicParser.list_music_inst_return list_music_inst141 =null;

        MusicParser.elseif_music_stmt_return elseif_music_stmt143 =null;

        MusicParser.else_music_stmt_return else_music_stmt144 =null;


        AmlTree IF136_tree=null;
        AmlTree char_literal137_tree=null;
        AmlTree char_literal139_tree=null;
        AmlTree char_literal140_tree=null;
        AmlTree char_literal142_tree=null;

        try {
            // src/parser/Music.g:148:17: ( IF ^ '(' ! expr ')' ! '{' ! list_music_inst '}' ! ( elseif_music_stmt )* ( else_music_stmt )? )
            // src/parser/Music.g:148:21: IF ^ '(' ! expr ')' ! '{' ! list_music_inst '}' ! ( elseif_music_stmt )* ( else_music_stmt )?
            {
            root_0 = (AmlTree)adaptor.nil();


            IF136=(Token)match(input,IF,FOLLOW_IF_in_if_music_stmt1776); 
            IF136_tree = 
            (AmlTree)adaptor.create(IF136)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(IF136_tree, root_0);


            char_literal137=(Token)match(input,79,FOLLOW_79_in_if_music_stmt1779); 

            pushFollow(FOLLOW_expr_in_if_music_stmt1782);
            expr138=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr138.getTree());

            char_literal139=(Token)match(input,80,FOLLOW_80_in_if_music_stmt1784); 

            char_literal140=(Token)match(input,86,FOLLOW_86_in_if_music_stmt1787); 

            pushFollow(FOLLOW_list_music_inst_in_if_music_stmt1790);
            list_music_inst141=list_music_inst();

            state._fsp--;

            adaptor.addChild(root_0, list_music_inst141.getTree());

            char_literal142=(Token)match(input,87,FOLLOW_87_in_if_music_stmt1792); 

            // src/parser/Music.g:148:66: ( elseif_music_stmt )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==ELSE) ) {
                    int LA24_1 = input.LA(2);

                    if ( (LA24_1==IF) ) {
                        alt24=1;
                    }


                }


                switch (alt24) {
            	case 1 :
            	    // src/parser/Music.g:148:66: elseif_music_stmt
            	    {
            	    pushFollow(FOLLOW_elseif_music_stmt_in_if_music_stmt1795);
            	    elseif_music_stmt143=elseif_music_stmt();

            	    state._fsp--;

            	    adaptor.addChild(root_0, elseif_music_stmt143.getTree());

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            // src/parser/Music.g:148:85: ( else_music_stmt )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==ELSE) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // src/parser/Music.g:148:85: else_music_stmt
                    {
                    pushFollow(FOLLOW_else_music_stmt_in_if_music_stmt1798);
                    else_music_stmt144=else_music_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, else_music_stmt144.getTree());

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
    // src/parser/Music.g:151:1: elseif_music_stmt : ELSE IF '(' expr ')' '{' list_music_inst '}' -> ^( ELSEIF expr list_music_inst ) ;
    public final MusicParser.elseif_music_stmt_return elseif_music_stmt() throws RecognitionException {
        MusicParser.elseif_music_stmt_return retval = new MusicParser.elseif_music_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token ELSE145=null;
        Token IF146=null;
        Token char_literal147=null;
        Token char_literal149=null;
        Token char_literal150=null;
        Token char_literal152=null;
        MusicParser.expr_return expr148 =null;

        MusicParser.list_music_inst_return list_music_inst151 =null;


        AmlTree ELSE145_tree=null;
        AmlTree IF146_tree=null;
        AmlTree char_literal147_tree=null;
        AmlTree char_literal149_tree=null;
        AmlTree char_literal150_tree=null;
        AmlTree char_literal152_tree=null;
        RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
        RewriteRuleTokenStream stream_80=new RewriteRuleTokenStream(adaptor,"token 80");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
        RewriteRuleTokenStream stream_87=new RewriteRuleTokenStream(adaptor,"token 87");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_list_music_inst=new RewriteRuleSubtreeStream(adaptor,"rule list_music_inst");
        try {
            // src/parser/Music.g:151:21: ( ELSE IF '(' expr ')' '{' list_music_inst '}' -> ^( ELSEIF expr list_music_inst ) )
            // src/parser/Music.g:151:25: ELSE IF '(' expr ')' '{' list_music_inst '}'
            {
            ELSE145=(Token)match(input,ELSE,FOLLOW_ELSE_in_elseif_music_stmt1828);  
            stream_ELSE.add(ELSE145);


            IF146=(Token)match(input,IF,FOLLOW_IF_in_elseif_music_stmt1830);  
            stream_IF.add(IF146);


            char_literal147=(Token)match(input,79,FOLLOW_79_in_elseif_music_stmt1832);  
            stream_79.add(char_literal147);


            pushFollow(FOLLOW_expr_in_elseif_music_stmt1834);
            expr148=expr();

            state._fsp--;

            stream_expr.add(expr148.getTree());

            char_literal149=(Token)match(input,80,FOLLOW_80_in_elseif_music_stmt1836);  
            stream_80.add(char_literal149);


            char_literal150=(Token)match(input,86,FOLLOW_86_in_elseif_music_stmt1838);  
            stream_86.add(char_literal150);


            pushFollow(FOLLOW_list_music_inst_in_elseif_music_stmt1840);
            list_music_inst151=list_music_inst();

            state._fsp--;

            stream_list_music_inst.add(list_music_inst151.getTree());

            char_literal152=(Token)match(input,87,FOLLOW_87_in_elseif_music_stmt1842);  
            stream_87.add(char_literal152);


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
            // 151:70: -> ^( ELSEIF expr list_music_inst )
            {
                // src/parser/Music.g:151:73: ^( ELSEIF expr list_music_inst )
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
    // src/parser/Music.g:154:1: else_music_stmt : ELSE ^ '{' ! list_music_inst '}' !;
    public final MusicParser.else_music_stmt_return else_music_stmt() throws RecognitionException {
        MusicParser.else_music_stmt_return retval = new MusicParser.else_music_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token ELSE153=null;
        Token char_literal154=null;
        Token char_literal156=null;
        MusicParser.list_music_inst_return list_music_inst155 =null;


        AmlTree ELSE153_tree=null;
        AmlTree char_literal154_tree=null;
        AmlTree char_literal156_tree=null;

        try {
            // src/parser/Music.g:154:17: ( ELSE ^ '{' ! list_music_inst '}' !)
            // src/parser/Music.g:154:21: ELSE ^ '{' ! list_music_inst '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            ELSE153=(Token)match(input,ELSE,FOLLOW_ELSE_in_else_music_stmt1883); 
            ELSE153_tree = 
            (AmlTree)adaptor.create(ELSE153)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(ELSE153_tree, root_0);


            char_literal154=(Token)match(input,86,FOLLOW_86_in_else_music_stmt1886); 

            pushFollow(FOLLOW_list_music_inst_in_else_music_stmt1889);
            list_music_inst155=list_music_inst();

            state._fsp--;

            adaptor.addChild(root_0, list_music_inst155.getTree());

            char_literal156=(Token)match(input,87,FOLLOW_87_in_else_music_stmt1891); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:157:1: song : SONG ^ ( ID )? '{' ! ( beat )? ( speed )? ( transport )? ( track )+ '}' !;
    public final MusicParser.song_return song() throws RecognitionException {
        MusicParser.song_return retval = new MusicParser.song_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token SONG157=null;
        Token ID158=null;
        Token char_literal159=null;
        Token char_literal164=null;
        MusicParser.beat_return beat160 =null;

        MusicParser.speed_return speed161 =null;

        MusicParser.transport_return transport162 =null;

        MusicParser.track_return track163 =null;


        AmlTree SONG157_tree=null;
        AmlTree ID158_tree=null;
        AmlTree char_literal159_tree=null;
        AmlTree char_literal164_tree=null;

        try {
            // src/parser/Music.g:157:13: ( SONG ^ ( ID )? '{' ! ( beat )? ( speed )? ( transport )? ( track )+ '}' !)
            // src/parser/Music.g:157:17: SONG ^ ( ID )? '{' ! ( beat )? ( speed )? ( transport )? ( track )+ '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            SONG157=(Token)match(input,SONG,FOLLOW_SONG_in_song1926); 
            SONG157_tree = 
            (AmlTree)adaptor.create(SONG157)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(SONG157_tree, root_0);


            // src/parser/Music.g:157:23: ( ID )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==ID) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // src/parser/Music.g:157:23: ID
                    {
                    ID158=(Token)match(input,ID,FOLLOW_ID_in_song1929); 
                    ID158_tree = 
                    (AmlTree)adaptor.create(ID158)
                    ;
                    adaptor.addChild(root_0, ID158_tree);


                    }
                    break;

            }


            char_literal159=(Token)match(input,86,FOLLOW_86_in_song1932); 

            // src/parser/Music.g:157:32: ( beat )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==BEAT) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // src/parser/Music.g:157:32: beat
                    {
                    pushFollow(FOLLOW_beat_in_song1935);
                    beat160=beat();

                    state._fsp--;

                    adaptor.addChild(root_0, beat160.getTree());

                    }
                    break;

            }


            // src/parser/Music.g:157:38: ( speed )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==SPEED) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // src/parser/Music.g:157:38: speed
                    {
                    pushFollow(FOLLOW_speed_in_song1938);
                    speed161=speed();

                    state._fsp--;

                    adaptor.addChild(root_0, speed161.getTree());

                    }
                    break;

            }


            // src/parser/Music.g:157:45: ( transport )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==TRANSPORT) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // src/parser/Music.g:157:45: transport
                    {
                    pushFollow(FOLLOW_transport_in_song1941);
                    transport162=transport();

                    state._fsp--;

                    adaptor.addChild(root_0, transport162.getTree());

                    }
                    break;

            }


            // src/parser/Music.g:157:56: ( track )+
            int cnt30=0;
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==TRACK) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // src/parser/Music.g:157:57: track
            	    {
            	    pushFollow(FOLLOW_track_in_song1945);
            	    track163=track();

            	    state._fsp--;

            	    adaptor.addChild(root_0, track163.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt30 >= 1 ) break loop30;
                        EarlyExitException eee =
                            new EarlyExitException(30, input);
                        throw eee;
                }
                cnt30++;
            } while (true);


            char_literal164=(Token)match(input,87,FOLLOW_87_in_song1949); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:160:1: track : TRACK ^ ( ID )? STRING compas_aux ;
    public final MusicParser.track_return track() throws RecognitionException {
        MusicParser.track_return retval = new MusicParser.track_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token TRACK165=null;
        Token ID166=null;
        Token STRING167=null;
        MusicParser.compas_aux_return compas_aux168 =null;


        AmlTree TRACK165_tree=null;
        AmlTree ID166_tree=null;
        AmlTree STRING167_tree=null;

        try {
            // src/parser/Music.g:160:13: ( TRACK ^ ( ID )? STRING compas_aux )
            // src/parser/Music.g:160:17: TRACK ^ ( ID )? STRING compas_aux
            {
            root_0 = (AmlTree)adaptor.nil();


            TRACK165=(Token)match(input,TRACK,FOLLOW_TRACK_in_track1979); 
            TRACK165_tree = 
            (AmlTree)adaptor.create(TRACK165)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(TRACK165_tree, root_0);


            // src/parser/Music.g:160:24: ( ID )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==ID) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // src/parser/Music.g:160:24: ID
                    {
                    ID166=(Token)match(input,ID,FOLLOW_ID_in_track1982); 
                    ID166_tree = 
                    (AmlTree)adaptor.create(ID166)
                    ;
                    adaptor.addChild(root_0, ID166_tree);


                    }
                    break;

            }


            STRING167=(Token)match(input,STRING,FOLLOW_STRING_in_track1985); 
            STRING167_tree = 
            (AmlTree)adaptor.create(STRING167)
            ;
            adaptor.addChild(root_0, STRING167_tree);


            pushFollow(FOLLOW_compas_aux_in_track1987);
            compas_aux168=compas_aux();

            state._fsp--;

            adaptor.addChild(root_0, compas_aux168.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:163:1: compas_aux : compas_list -> ^( COMPAS_LIST compas_list ) ;
    public final MusicParser.compas_aux_return compas_aux() throws RecognitionException {
        MusicParser.compas_aux_return retval = new MusicParser.compas_aux_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        MusicParser.compas_list_return compas_list169 =null;


        RewriteRuleSubtreeStream stream_compas_list=new RewriteRuleSubtreeStream(adaptor,"rule compas_list");
        try {
            // src/parser/Music.g:163:13: ( compas_list -> ^( COMPAS_LIST compas_list ) )
            // src/parser/Music.g:163:17: compas_list
            {
            pushFollow(FOLLOW_compas_list_in_compas_aux2011);
            compas_list169=compas_list();

            state._fsp--;

            stream_compas_list.add(compas_list169.getTree());

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
            // 163:29: -> ^( COMPAS_LIST compas_list )
            {
                // src/parser/Music.g:163:32: ^( COMPAS_LIST compas_list )
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
    // src/parser/Music.g:166:1: compas_list : ( DOUBLE_BAR !| repetition ) ( compasses | repetition )* ( DOUBLE_BAR !) ;
    public final MusicParser.compas_list_return compas_list() throws RecognitionException {
        MusicParser.compas_list_return retval = new MusicParser.compas_list_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token DOUBLE_BAR170=null;
        Token DOUBLE_BAR174=null;
        MusicParser.repetition_return repetition171 =null;

        MusicParser.compasses_return compasses172 =null;

        MusicParser.repetition_return repetition173 =null;


        AmlTree DOUBLE_BAR170_tree=null;
        AmlTree DOUBLE_BAR174_tree=null;

        try {
            // src/parser/Music.g:166:13: ( ( DOUBLE_BAR !| repetition ) ( compasses | repetition )* ( DOUBLE_BAR !) )
            // src/parser/Music.g:166:15: ( DOUBLE_BAR !| repetition ) ( compasses | repetition )* ( DOUBLE_BAR !)
            {
            root_0 = (AmlTree)adaptor.nil();


            // src/parser/Music.g:166:15: ( DOUBLE_BAR !| repetition )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==DOUBLE_BAR) ) {
                alt32=1;
            }
            else if ( (LA32_0==NUM||LA32_0==START_REPETITION) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;

            }
            switch (alt32) {
                case 1 :
                    // src/parser/Music.g:166:16: DOUBLE_BAR !
                    {
                    DOUBLE_BAR170=(Token)match(input,DOUBLE_BAR,FOLLOW_DOUBLE_BAR_in_compas_list2041); 

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:166:30: repetition
                    {
                    pushFollow(FOLLOW_repetition_in_compas_list2046);
                    repetition171=repetition();

                    state._fsp--;

                    adaptor.addChild(root_0, repetition171.getTree());

                    }
                    break;

            }


            // src/parser/Music.g:166:42: ( compasses | repetition )*
            loop33:
            do {
                int alt33=3;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0 >= BEMOL && LA33_0 <= BOOL)||LA33_0==CHORD||LA33_0==DECR||LA33_0==FOR||(LA33_0 >= ID && LA33_0 <= INCR)||LA33_0==INT||LA33_0==NOTE||LA33_0==NOTE_TYPE||LA33_0==SONG||LA33_0==SUSTAIN||LA33_0==TONE||LA33_0==WHILE||LA33_0==79) ) {
                    alt33=1;
                }
                else if ( (LA33_0==NUM||LA33_0==START_REPETITION) ) {
                    alt33=2;
                }


                switch (alt33) {
            	case 1 :
            	    // src/parser/Music.g:166:43: compasses
            	    {
            	    pushFollow(FOLLOW_compasses_in_compas_list2050);
            	    compasses172=compasses();

            	    state._fsp--;

            	    adaptor.addChild(root_0, compasses172.getTree());

            	    }
            	    break;
            	case 2 :
            	    // src/parser/Music.g:166:55: repetition
            	    {
            	    pushFollow(FOLLOW_repetition_in_compas_list2054);
            	    repetition173=repetition();

            	    state._fsp--;

            	    adaptor.addChild(root_0, repetition173.getTree());

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            // src/parser/Music.g:166:68: ( DOUBLE_BAR !)
            // src/parser/Music.g:166:69: DOUBLE_BAR !
            {
            DOUBLE_BAR174=(Token)match(input,DOUBLE_BAR,FOLLOW_DOUBLE_BAR_in_compas_list2059); 

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
    // src/parser/Music.g:169:1: compasses : compas ( BAR ! compas )* ;
    public final MusicParser.compasses_return compasses() throws RecognitionException {
        MusicParser.compasses_return retval = new MusicParser.compasses_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token BAR176=null;
        MusicParser.compas_return compas175 =null;

        MusicParser.compas_return compas177 =null;


        AmlTree BAR176_tree=null;

        try {
            // src/parser/Music.g:169:13: ( compas ( BAR ! compas )* )
            // src/parser/Music.g:169:17: compas ( BAR ! compas )*
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_compas_in_compasses2086);
            compas175=compas();

            state._fsp--;

            adaptor.addChild(root_0, compas175.getTree());

            // src/parser/Music.g:169:24: ( BAR ! compas )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==BAR) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // src/parser/Music.g:169:25: BAR ! compas
            	    {
            	    BAR176=(Token)match(input,BAR,FOLLOW_BAR_in_compasses2089); 

            	    pushFollow(FOLLOW_compas_in_compasses2092);
            	    compas177=compas();

            	    state._fsp--;

            	    adaptor.addChild(root_0, compas177.getTree());

            	    }
            	    break;

            	default :
            	    break loop34;
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
    // src/parser/Music.g:172:1: repetition : ( NUM 'x' )? START_REPETITION compasses END_REPETITION -> ^( REPETITION NUM compasses ) ;
    public final MusicParser.repetition_return repetition() throws RecognitionException {
        MusicParser.repetition_return retval = new MusicParser.repetition_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token NUM178=null;
        Token char_literal179=null;
        Token START_REPETITION180=null;
        Token END_REPETITION182=null;
        MusicParser.compasses_return compasses181 =null;


        AmlTree NUM178_tree=null;
        AmlTree char_literal179_tree=null;
        AmlTree START_REPETITION180_tree=null;
        AmlTree END_REPETITION182_tree=null;
        RewriteRuleTokenStream stream_NUM=new RewriteRuleTokenStream(adaptor,"token NUM");
        RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
        RewriteRuleTokenStream stream_END_REPETITION=new RewriteRuleTokenStream(adaptor,"token END_REPETITION");
        RewriteRuleTokenStream stream_START_REPETITION=new RewriteRuleTokenStream(adaptor,"token START_REPETITION");
        RewriteRuleSubtreeStream stream_compasses=new RewriteRuleSubtreeStream(adaptor,"rule compasses");
        try {
            // src/parser/Music.g:172:13: ( ( NUM 'x' )? START_REPETITION compasses END_REPETITION -> ^( REPETITION NUM compasses ) )
            // src/parser/Music.g:172:17: ( NUM 'x' )? START_REPETITION compasses END_REPETITION
            {
            // src/parser/Music.g:172:17: ( NUM 'x' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==NUM) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // src/parser/Music.g:172:18: NUM 'x'
                    {
                    NUM178=(Token)match(input,NUM,FOLLOW_NUM_in_repetition2119);  
                    stream_NUM.add(NUM178);


                    char_literal179=(Token)match(input,85,FOLLOW_85_in_repetition2121);  
                    stream_85.add(char_literal179);


                    }
                    break;

            }


            START_REPETITION180=(Token)match(input,START_REPETITION,FOLLOW_START_REPETITION_in_repetition2125);  
            stream_START_REPETITION.add(START_REPETITION180);


            pushFollow(FOLLOW_compasses_in_repetition2127);
            compasses181=compasses();

            state._fsp--;

            stream_compasses.add(compasses181.getTree());

            END_REPETITION182=(Token)match(input,END_REPETITION,FOLLOW_END_REPETITION_in_repetition2129);  
            stream_END_REPETITION.add(END_REPETITION182);


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
            // 172:73: -> ^( REPETITION NUM compasses )
            {
                // src/parser/Music.g:172:76: ^( REPETITION NUM compasses )
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
    // src/parser/Music.g:175:1: compas : ( tone )? ( options {greedy=true; } : music_inst )+ -> ^( COMPAS ( tone )? ( music_inst )+ ) ;
    public final MusicParser.compas_return compas() throws RecognitionException {
        MusicParser.compas_return retval = new MusicParser.compas_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        MusicParser.tone_return tone183 =null;

        MusicParser.music_inst_return music_inst184 =null;


        RewriteRuleSubtreeStream stream_tone=new RewriteRuleSubtreeStream(adaptor,"rule tone");
        RewriteRuleSubtreeStream stream_music_inst=new RewriteRuleSubtreeStream(adaptor,"rule music_inst");
        try {
            // src/parser/Music.g:175:13: ( ( tone )? ( options {greedy=true; } : music_inst )+ -> ^( COMPAS ( tone )? ( music_inst )+ ) )
            // src/parser/Music.g:175:17: ( tone )? ( options {greedy=true; } : music_inst )+
            {
            // src/parser/Music.g:175:17: ( tone )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==TONE) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // src/parser/Music.g:175:17: tone
                    {
                    pushFollow(FOLLOW_tone_in_compas2170);
                    tone183=tone();

                    state._fsp--;

                    stream_tone.add(tone183.getTree());

                    }
                    break;

            }


            // src/parser/Music.g:175:23: ( options {greedy=true; } : music_inst )+
            int cnt37=0;
            loop37:
            do {
                int alt37=2;
                switch ( input.LA(1) ) {
                case CHORD:
                    {
                    alt37=1;
                    }
                    break;
                case ID:
                    {
                    alt37=1;
                    }
                    break;
                case INCR:
                    {
                    alt37=1;
                    }
                    break;
                case DECR:
                    {
                    alt37=1;
                    }
                    break;
                case WHILE:
                    {
                    alt37=1;
                    }
                    break;
                case FOR:
                    {
                    alt37=1;
                    }
                    break;
                case IF:
                    {
                    alt37=1;
                    }
                    break;
                case SONG:
                    {
                    alt37=1;
                    }
                    break;
                case BOOL:
                case INT:
                case NOTE_TYPE:
                    {
                    alt37=1;
                    }
                    break;
                case 79:
                    {
                    alt37=1;
                    }
                    break;
                case BEMOL:
                case SUSTAIN:
                    {
                    alt37=1;
                    }
                    break;
                case NOTE:
                    {
                    alt37=1;
                    }
                    break;

                }

                switch (alt37) {
            	case 1 :
            	    // src/parser/Music.g:175:49: music_inst
            	    {
            	    pushFollow(FOLLOW_music_inst_in_compas2183);
            	    music_inst184=music_inst();

            	    state._fsp--;

            	    stream_music_inst.add(music_inst184.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt37 >= 1 ) break loop37;
                        EarlyExitException eee =
                            new EarlyExitException(37, input);
                        throw eee;
                }
                cnt37++;
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
            // 175:65: -> ^( COMPAS ( tone )? ( music_inst )+ )
            {
                // src/parser/Music.g:175:68: ^( COMPAS ( tone )? ( music_inst )+ )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(COMPAS, "COMPAS")
                , root_1);

                // src/parser/Music.g:175:77: ( tone )?
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
    // src/parser/Music.g:178:1: tone : TONE ^ NUM ( SUSTAIN | BEMOL ) ;
    public final MusicParser.tone_return tone() throws RecognitionException {
        MusicParser.tone_return retval = new MusicParser.tone_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token TONE185=null;
        Token NUM186=null;
        Token set187=null;

        AmlTree TONE185_tree=null;
        AmlTree NUM186_tree=null;
        AmlTree set187_tree=null;

        try {
            // src/parser/Music.g:178:13: ( TONE ^ NUM ( SUSTAIN | BEMOL ) )
            // src/parser/Music.g:178:17: TONE ^ NUM ( SUSTAIN | BEMOL )
            {
            root_0 = (AmlTree)adaptor.nil();


            TONE185=(Token)match(input,TONE,FOLLOW_TONE_in_tone2230); 
            TONE185_tree = 
            (AmlTree)adaptor.create(TONE185)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(TONE185_tree, root_0);


            NUM186=(Token)match(input,NUM,FOLLOW_NUM_in_tone2233); 
            NUM186_tree = 
            (AmlTree)adaptor.create(NUM186)
            ;
            adaptor.addChild(root_0, NUM186_tree);


            set187=(Token)input.LT(1);

            if ( input.LA(1)==BEMOL||input.LA(1)==SUSTAIN ) {
                input.consume();
                adaptor.addChild(root_0, 
                (AmlTree)adaptor.create(set187)
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
    // src/parser/Music.g:181:1: notes_group : notes_type ( '.' FIGURE ( DOT )? )? ( TIE )? -> ^( NOTE_LIST notes_type ( FIGURE )? ( DOT )? ( TIE )? ) ;
    public final MusicParser.notes_group_return notes_group() throws RecognitionException {
        MusicParser.notes_group_return retval = new MusicParser.notes_group_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal189=null;
        Token FIGURE190=null;
        Token DOT191=null;
        Token TIE192=null;
        MusicParser.notes_type_return notes_type188 =null;


        AmlTree char_literal189_tree=null;
        AmlTree FIGURE190_tree=null;
        AmlTree DOT191_tree=null;
        AmlTree TIE192_tree=null;
        RewriteRuleTokenStream stream_TIE=new RewriteRuleTokenStream(adaptor,"token TIE");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
        RewriteRuleTokenStream stream_FIGURE=new RewriteRuleTokenStream(adaptor,"token FIGURE");
        RewriteRuleSubtreeStream stream_notes_type=new RewriteRuleSubtreeStream(adaptor,"rule notes_type");
        try {
            // src/parser/Music.g:181:13: ( notes_type ( '.' FIGURE ( DOT )? )? ( TIE )? -> ^( NOTE_LIST notes_type ( FIGURE )? ( DOT )? ( TIE )? ) )
            // src/parser/Music.g:181:17: notes_type ( '.' FIGURE ( DOT )? )? ( TIE )?
            {
            pushFollow(FOLLOW_notes_type_in_notes_group2264);
            notes_type188=notes_type();

            state._fsp--;

            stream_notes_type.add(notes_type188.getTree());

            // src/parser/Music.g:181:28: ( '.' FIGURE ( DOT )? )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==82) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // src/parser/Music.g:181:29: '.' FIGURE ( DOT )?
                    {
                    char_literal189=(Token)match(input,82,FOLLOW_82_in_notes_group2267);  
                    stream_82.add(char_literal189);


                    FIGURE190=(Token)match(input,FIGURE,FOLLOW_FIGURE_in_notes_group2269);  
                    stream_FIGURE.add(FIGURE190);


                    // src/parser/Music.g:181:40: ( DOT )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==DOT) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // src/parser/Music.g:181:40: DOT
                            {
                            DOT191=(Token)match(input,DOT,FOLLOW_DOT_in_notes_group2271);  
                            stream_DOT.add(DOT191);


                            }
                            break;

                    }


                    }
                    break;

            }


            // src/parser/Music.g:181:47: ( TIE )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==TIE) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // src/parser/Music.g:181:47: TIE
                    {
                    TIE192=(Token)match(input,TIE,FOLLOW_TIE_in_notes_group2276);  
                    stream_TIE.add(TIE192);


                    }
                    break;

            }


            // AST REWRITE
            // elements: DOT, notes_type, FIGURE, TIE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AmlTree)adaptor.nil();
            // 181:52: -> ^( NOTE_LIST notes_type ( FIGURE )? ( DOT )? ( TIE )? )
            {
                // src/parser/Music.g:181:55: ^( NOTE_LIST notes_type ( FIGURE )? ( DOT )? ( TIE )? )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(NOTE_LIST, "NOTE_LIST")
                , root_1);

                adaptor.addChild(root_1, stream_notes_type.nextTree());

                // src/parser/Music.g:181:78: ( FIGURE )?
                if ( stream_FIGURE.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_FIGURE.nextNode()
                    );

                }
                stream_FIGURE.reset();

                // src/parser/Music.g:181:86: ( DOT )?
                if ( stream_DOT.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_DOT.nextNode()
                    );

                }
                stream_DOT.reset();

                // src/parser/Music.g:181:91: ( TIE )?
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
    // src/parser/Music.g:184:1: notes_variable : notes_type ( '.' FIGURE ( DOT )? )? -> ^( NOTE_LIST notes_type ( FIGURE )? ( DOT )? ) ;
    public final MusicParser.notes_variable_return notes_variable() throws RecognitionException {
        MusicParser.notes_variable_return retval = new MusicParser.notes_variable_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal194=null;
        Token FIGURE195=null;
        Token DOT196=null;
        MusicParser.notes_type_return notes_type193 =null;


        AmlTree char_literal194_tree=null;
        AmlTree FIGURE195_tree=null;
        AmlTree DOT196_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
        RewriteRuleTokenStream stream_FIGURE=new RewriteRuleTokenStream(adaptor,"token FIGURE");
        RewriteRuleSubtreeStream stream_notes_type=new RewriteRuleSubtreeStream(adaptor,"rule notes_type");
        try {
            // src/parser/Music.g:184:17: ( notes_type ( '.' FIGURE ( DOT )? )? -> ^( NOTE_LIST notes_type ( FIGURE )? ( DOT )? ) )
            // src/parser/Music.g:184:21: notes_type ( '.' FIGURE ( DOT )? )?
            {
            pushFollow(FOLLOW_notes_type_in_notes_variable2318);
            notes_type193=notes_type();

            state._fsp--;

            stream_notes_type.add(notes_type193.getTree());

            // src/parser/Music.g:184:32: ( '.' FIGURE ( DOT )? )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==82) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // src/parser/Music.g:184:33: '.' FIGURE ( DOT )?
                    {
                    char_literal194=(Token)match(input,82,FOLLOW_82_in_notes_variable2321);  
                    stream_82.add(char_literal194);


                    FIGURE195=(Token)match(input,FIGURE,FOLLOW_FIGURE_in_notes_variable2323);  
                    stream_FIGURE.add(FIGURE195);


                    // src/parser/Music.g:184:44: ( DOT )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==DOT) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // src/parser/Music.g:184:44: DOT
                            {
                            DOT196=(Token)match(input,DOT,FOLLOW_DOT_in_notes_variable2325);  
                            stream_DOT.add(DOT196);


                            }
                            break;

                    }


                    }
                    break;

            }


            // AST REWRITE
            // elements: DOT, FIGURE, notes_type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AmlTree)adaptor.nil();
            // 184:51: -> ^( NOTE_LIST notes_type ( FIGURE )? ( DOT )? )
            {
                // src/parser/Music.g:184:54: ^( NOTE_LIST notes_type ( FIGURE )? ( DOT )? )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(NOTE_LIST, "NOTE_LIST")
                , root_1);

                adaptor.addChild(root_1, stream_notes_type.nextTree());

                // src/parser/Music.g:184:77: ( FIGURE )?
                if ( stream_FIGURE.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_FIGURE.nextNode()
                    );

                }
                stream_FIGURE.reset();

                // src/parser/Music.g:184:85: ( DOT )?
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
    // src/parser/Music.g:187:1: notes_type : ( chord | notes );
    public final MusicParser.notes_type_return notes_type() throws RecognitionException {
        MusicParser.notes_type_return retval = new MusicParser.notes_type_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        MusicParser.chord_return chord197 =null;

        MusicParser.notes_return notes198 =null;



        try {
            // src/parser/Music.g:187:13: ( chord | notes )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==CHORD) ) {
                alt43=1;
            }
            else if ( (LA43_0==BEMOL||LA43_0==NOTE||LA43_0==SUSTAIN||LA43_0==79) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;

            }
            switch (alt43) {
                case 1 :
                    // src/parser/Music.g:187:15: chord
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_chord_in_notes_type2368);
                    chord197=chord();

                    state._fsp--;

                    adaptor.addChild(root_0, chord197.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:187:23: notes
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_notes_in_notes_type2372);
                    notes198=notes();

                    state._fsp--;

                    adaptor.addChild(root_0, notes198.getTree());

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
    // src/parser/Music.g:189:1: chord : CHORD ^ '(' ! NOTE ( MINOR | PLUS | DIMINUTION )? ( SEVENTH | MAJ7 )? ')' !;
    public final MusicParser.chord_return chord() throws RecognitionException {
        MusicParser.chord_return retval = new MusicParser.chord_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token CHORD199=null;
        Token char_literal200=null;
        Token NOTE201=null;
        Token set202=null;
        Token set203=null;
        Token char_literal204=null;

        AmlTree CHORD199_tree=null;
        AmlTree char_literal200_tree=null;
        AmlTree NOTE201_tree=null;
        AmlTree set202_tree=null;
        AmlTree set203_tree=null;
        AmlTree char_literal204_tree=null;

        try {
            // src/parser/Music.g:189:13: ( CHORD ^ '(' ! NOTE ( MINOR | PLUS | DIMINUTION )? ( SEVENTH | MAJ7 )? ')' !)
            // src/parser/Music.g:189:17: CHORD ^ '(' ! NOTE ( MINOR | PLUS | DIMINUTION )? ( SEVENTH | MAJ7 )? ')' !
            {
            root_0 = (AmlTree)adaptor.nil();


            CHORD199=(Token)match(input,CHORD,FOLLOW_CHORD_in_chord2388); 
            CHORD199_tree = 
            (AmlTree)adaptor.create(CHORD199)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(CHORD199_tree, root_0);


            char_literal200=(Token)match(input,79,FOLLOW_79_in_chord2391); 

            NOTE201=(Token)match(input,NOTE,FOLLOW_NOTE_in_chord2394); 
            NOTE201_tree = 
            (AmlTree)adaptor.create(NOTE201)
            ;
            adaptor.addChild(root_0, NOTE201_tree);


            // src/parser/Music.g:189:34: ( MINOR | PLUS | DIMINUTION )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==DIMINUTION||LA44_0==MINOR||LA44_0==PLUS) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // src/parser/Music.g:
                    {
                    set202=(Token)input.LT(1);

                    if ( input.LA(1)==DIMINUTION||input.LA(1)==MINOR||input.LA(1)==PLUS ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (AmlTree)adaptor.create(set202)
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


            // src/parser/Music.g:189:59: ( SEVENTH | MAJ7 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==MAJ7||LA45_0==SEVENTH) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // src/parser/Music.g:
                    {
                    set203=(Token)input.LT(1);

                    if ( input.LA(1)==MAJ7||input.LA(1)==SEVENTH ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (AmlTree)adaptor.create(set203)
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


            char_literal204=(Token)match(input,80,FOLLOW_80_in_chord2412); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:192:1: notes : ( '(' ( note )+ ')' | note ) -> ^( NOTES ( note )+ ) ;
    public final MusicParser.notes_return notes() throws RecognitionException {
        MusicParser.notes_return retval = new MusicParser.notes_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal205=null;
        Token char_literal207=null;
        MusicParser.note_return note206 =null;

        MusicParser.note_return note208 =null;


        AmlTree char_literal205_tree=null;
        AmlTree char_literal207_tree=null;
        RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
        RewriteRuleTokenStream stream_80=new RewriteRuleTokenStream(adaptor,"token 80");
        RewriteRuleSubtreeStream stream_note=new RewriteRuleSubtreeStream(adaptor,"rule note");
        try {
            // src/parser/Music.g:192:13: ( ( '(' ( note )+ ')' | note ) -> ^( NOTES ( note )+ ) )
            // src/parser/Music.g:192:17: ( '(' ( note )+ ')' | note )
            {
            // src/parser/Music.g:192:17: ( '(' ( note )+ ')' | note )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==79) ) {
                alt47=1;
            }
            else if ( (LA47_0==BEMOL||LA47_0==NOTE||LA47_0==SUSTAIN) ) {
                alt47=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;

            }
            switch (alt47) {
                case 1 :
                    // src/parser/Music.g:192:19: '(' ( note )+ ')'
                    {
                    char_literal205=(Token)match(input,79,FOLLOW_79_in_notes2444);  
                    stream_79.add(char_literal205);


                    // src/parser/Music.g:192:23: ( note )+
                    int cnt46=0;
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==BEMOL||LA46_0==NOTE||LA46_0==SUSTAIN) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // src/parser/Music.g:192:24: note
                    	    {
                    	    pushFollow(FOLLOW_note_in_notes2447);
                    	    note206=note();

                    	    state._fsp--;

                    	    stream_note.add(note206.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt46 >= 1 ) break loop46;
                                EarlyExitException eee =
                                    new EarlyExitException(46, input);
                                throw eee;
                        }
                        cnt46++;
                    } while (true);


                    char_literal207=(Token)match(input,80,FOLLOW_80_in_notes2451);  
                    stream_80.add(char_literal207);


                    }
                    break;
                case 2 :
                    // src/parser/Music.g:192:38: note
                    {
                    pushFollow(FOLLOW_note_in_notes2456);
                    note208=note();

                    state._fsp--;

                    stream_note.add(note208.getTree());

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
            // 192:44: -> ^( NOTES ( note )+ )
            {
                // src/parser/Music.g:192:47: ^( NOTES ( note )+ )
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
    // src/parser/Music.g:195:1: note : ( BEMOL | SUSTAIN )? NOTE ^ ( '-' ! NUM )? ;
    public final MusicParser.note_return note() throws RecognitionException {
        MusicParser.note_return retval = new MusicParser.note_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token set209=null;
        Token NOTE210=null;
        Token char_literal211=null;
        Token NUM212=null;

        AmlTree set209_tree=null;
        AmlTree NOTE210_tree=null;
        AmlTree char_literal211_tree=null;
        AmlTree NUM212_tree=null;

        try {
            // src/parser/Music.g:195:13: ( ( BEMOL | SUSTAIN )? NOTE ^ ( '-' ! NUM )? )
            // src/parser/Music.g:195:17: ( BEMOL | SUSTAIN )? NOTE ^ ( '-' ! NUM )?
            {
            root_0 = (AmlTree)adaptor.nil();


            // src/parser/Music.g:195:17: ( BEMOL | SUSTAIN )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==BEMOL||LA48_0==SUSTAIN) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // src/parser/Music.g:
                    {
                    set209=(Token)input.LT(1);

                    if ( input.LA(1)==BEMOL||input.LA(1)==SUSTAIN ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (AmlTree)adaptor.create(set209)
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


            NOTE210=(Token)match(input,NOTE,FOLLOW_NOTE_in_note2505); 
            NOTE210_tree = 
            (AmlTree)adaptor.create(NOTE210)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(NOTE210_tree, root_0);


            // src/parser/Music.g:195:42: ( '-' ! NUM )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==MINUS) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // src/parser/Music.g:195:43: '-' ! NUM
                    {
                    char_literal211=(Token)match(input,MINUS,FOLLOW_MINUS_in_note2509); 

                    NUM212=(Token)match(input,NUM,FOLLOW_NUM_in_note2512); 
                    NUM212_tree = 
                    (AmlTree)adaptor.create(NUM212)
                    ;
                    adaptor.addChild(root_0, NUM212_tree);


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
    // src/parser/Music.g:199:1: expr : boolterm ( OR ^ boolterm )* ;
    public final MusicParser.expr_return expr() throws RecognitionException {
        MusicParser.expr_return retval = new MusicParser.expr_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token OR214=null;
        MusicParser.boolterm_return boolterm213 =null;

        MusicParser.boolterm_return boolterm215 =null;


        AmlTree OR214_tree=null;

        try {
            // src/parser/Music.g:199:9: ( boolterm ( OR ^ boolterm )* )
            // src/parser/Music.g:199:13: boolterm ( OR ^ boolterm )*
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_boolterm_in_expr2541);
            boolterm213=boolterm();

            state._fsp--;

            adaptor.addChild(root_0, boolterm213.getTree());

            // src/parser/Music.g:199:22: ( OR ^ boolterm )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==OR) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // src/parser/Music.g:199:23: OR ^ boolterm
            	    {
            	    OR214=(Token)match(input,OR,FOLLOW_OR_in_expr2544); 
            	    OR214_tree = 
            	    (AmlTree)adaptor.create(OR214)
            	    ;
            	    root_0 = (AmlTree)adaptor.becomeRoot(OR214_tree, root_0);


            	    pushFollow(FOLLOW_boolterm_in_expr2547);
            	    boolterm215=boolterm();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolterm215.getTree());

            	    }
            	    break;

            	default :
            	    break loop50;
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
    // src/parser/Music.g:202:1: boolterm : boolfact ( AND ^ boolfact )* ;
    public final MusicParser.boolterm_return boolterm() throws RecognitionException {
        MusicParser.boolterm_return retval = new MusicParser.boolterm_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token AND217=null;
        MusicParser.boolfact_return boolfact216 =null;

        MusicParser.boolfact_return boolfact218 =null;


        AmlTree AND217_tree=null;

        try {
            // src/parser/Music.g:202:9: ( boolfact ( AND ^ boolfact )* )
            // src/parser/Music.g:202:13: boolfact ( AND ^ boolfact )*
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_boolfact_in_boolterm2561);
            boolfact216=boolfact();

            state._fsp--;

            adaptor.addChild(root_0, boolfact216.getTree());

            // src/parser/Music.g:202:22: ( AND ^ boolfact )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==AND) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // src/parser/Music.g:202:23: AND ^ boolfact
            	    {
            	    AND217=(Token)match(input,AND,FOLLOW_AND_in_boolterm2564); 
            	    AND217_tree = 
            	    (AmlTree)adaptor.create(AND217)
            	    ;
            	    root_0 = (AmlTree)adaptor.becomeRoot(AND217_tree, root_0);


            	    pushFollow(FOLLOW_boolfact_in_boolterm2567);
            	    boolfact218=boolfact();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolfact218.getTree());

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
    // $ANTLR end "boolterm"


    public static class boolfact_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolfact"
    // src/parser/Music.g:205:1: boolfact : num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? ;
    public final MusicParser.boolfact_return boolfact() throws RecognitionException {
        MusicParser.boolfact_return retval = new MusicParser.boolfact_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token EQUAL220=null;
        Token NOT_EQUAL221=null;
        Token LT222=null;
        Token LE223=null;
        Token GT224=null;
        Token GE225=null;
        MusicParser.num_expr_return num_expr219 =null;

        MusicParser.num_expr_return num_expr226 =null;


        AmlTree EQUAL220_tree=null;
        AmlTree NOT_EQUAL221_tree=null;
        AmlTree LT222_tree=null;
        AmlTree LE223_tree=null;
        AmlTree GT224_tree=null;
        AmlTree GE225_tree=null;

        try {
            // src/parser/Music.g:205:9: ( num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? )
            // src/parser/Music.g:205:13: num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_num_expr_in_boolfact2581);
            num_expr219=num_expr();

            state._fsp--;

            adaptor.addChild(root_0, num_expr219.getTree());

            // src/parser/Music.g:205:22: ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==EQUAL||(LA53_0 >= GE && LA53_0 <= GT)||LA53_0==LE||LA53_0==LT||LA53_0==NOT_EQUAL) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // src/parser/Music.g:205:23: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr
                    {
                    // src/parser/Music.g:205:23: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^)
                    int alt52=6;
                    switch ( input.LA(1) ) {
                    case EQUAL:
                        {
                        alt52=1;
                        }
                        break;
                    case NOT_EQUAL:
                        {
                        alt52=2;
                        }
                        break;
                    case LT:
                        {
                        alt52=3;
                        }
                        break;
                    case LE:
                        {
                        alt52=4;
                        }
                        break;
                    case GT:
                        {
                        alt52=5;
                        }
                        break;
                    case GE:
                        {
                        alt52=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 52, 0, input);

                        throw nvae;

                    }

                    switch (alt52) {
                        case 1 :
                            // src/parser/Music.g:205:24: EQUAL ^
                            {
                            EQUAL220=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_boolfact2585); 
                            EQUAL220_tree = 
                            (AmlTree)adaptor.create(EQUAL220)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(EQUAL220_tree, root_0);


                            }
                            break;
                        case 2 :
                            // src/parser/Music.g:205:33: NOT_EQUAL ^
                            {
                            NOT_EQUAL221=(Token)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_boolfact2590); 
                            NOT_EQUAL221_tree = 
                            (AmlTree)adaptor.create(NOT_EQUAL221)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(NOT_EQUAL221_tree, root_0);


                            }
                            break;
                        case 3 :
                            // src/parser/Music.g:205:46: LT ^
                            {
                            LT222=(Token)match(input,LT,FOLLOW_LT_in_boolfact2595); 
                            LT222_tree = 
                            (AmlTree)adaptor.create(LT222)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(LT222_tree, root_0);


                            }
                            break;
                        case 4 :
                            // src/parser/Music.g:205:52: LE ^
                            {
                            LE223=(Token)match(input,LE,FOLLOW_LE_in_boolfact2600); 
                            LE223_tree = 
                            (AmlTree)adaptor.create(LE223)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(LE223_tree, root_0);


                            }
                            break;
                        case 5 :
                            // src/parser/Music.g:205:58: GT ^
                            {
                            GT224=(Token)match(input,GT,FOLLOW_GT_in_boolfact2605); 
                            GT224_tree = 
                            (AmlTree)adaptor.create(GT224)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(GT224_tree, root_0);


                            }
                            break;
                        case 6 :
                            // src/parser/Music.g:205:64: GE ^
                            {
                            GE225=(Token)match(input,GE,FOLLOW_GE_in_boolfact2610); 
                            GE225_tree = 
                            (AmlTree)adaptor.create(GE225)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(GE225_tree, root_0);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_num_expr_in_boolfact2614);
                    num_expr226=num_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, num_expr226.getTree());

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
    // src/parser/Music.g:208:1: num_expr : term ( ( PLUS ^| MINUS ^) term )* ;
    public final MusicParser.num_expr_return num_expr() throws RecognitionException {
        MusicParser.num_expr_return retval = new MusicParser.num_expr_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token PLUS228=null;
        Token MINUS229=null;
        MusicParser.term_return term227 =null;

        MusicParser.term_return term230 =null;


        AmlTree PLUS228_tree=null;
        AmlTree MINUS229_tree=null;

        try {
            // src/parser/Music.g:208:9: ( term ( ( PLUS ^| MINUS ^) term )* )
            // src/parser/Music.g:208:13: term ( ( PLUS ^| MINUS ^) term )*
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_term_in_num_expr2628);
            term227=term();

            state._fsp--;

            adaptor.addChild(root_0, term227.getTree());

            // src/parser/Music.g:208:18: ( ( PLUS ^| MINUS ^) term )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==MINUS||LA55_0==PLUS) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // src/parser/Music.g:208:20: ( PLUS ^| MINUS ^) term
            	    {
            	    // src/parser/Music.g:208:20: ( PLUS ^| MINUS ^)
            	    int alt54=2;
            	    int LA54_0 = input.LA(1);

            	    if ( (LA54_0==PLUS) ) {
            	        alt54=1;
            	    }
            	    else if ( (LA54_0==MINUS) ) {
            	        alt54=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 54, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt54) {
            	        case 1 :
            	            // src/parser/Music.g:208:21: PLUS ^
            	            {
            	            PLUS228=(Token)match(input,PLUS,FOLLOW_PLUS_in_num_expr2633); 
            	            PLUS228_tree = 
            	            (AmlTree)adaptor.create(PLUS228)
            	            ;
            	            root_0 = (AmlTree)adaptor.becomeRoot(PLUS228_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // src/parser/Music.g:208:29: MINUS ^
            	            {
            	            MINUS229=(Token)match(input,MINUS,FOLLOW_MINUS_in_num_expr2638); 
            	            MINUS229_tree = 
            	            (AmlTree)adaptor.create(MINUS229)
            	            ;
            	            root_0 = (AmlTree)adaptor.becomeRoot(MINUS229_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_term_in_num_expr2642);
            	    term230=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term230.getTree());

            	    }
            	    break;

            	default :
            	    break loop55;
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
    // src/parser/Music.g:211:1: term : factor ( ( DOT ^| DIV ^| MOD ^) factor )* ;
    public final MusicParser.term_return term() throws RecognitionException {
        MusicParser.term_return retval = new MusicParser.term_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token DOT232=null;
        Token DIV233=null;
        Token MOD234=null;
        MusicParser.factor_return factor231 =null;

        MusicParser.factor_return factor235 =null;


        AmlTree DOT232_tree=null;
        AmlTree DIV233_tree=null;
        AmlTree MOD234_tree=null;

        try {
            // src/parser/Music.g:211:9: ( factor ( ( DOT ^| DIV ^| MOD ^) factor )* )
            // src/parser/Music.g:211:13: factor ( ( DOT ^| DIV ^| MOD ^) factor )*
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term2660);
            factor231=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor231.getTree());

            // src/parser/Music.g:211:20: ( ( DOT ^| DIV ^| MOD ^) factor )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==DIV||LA57_0==DOT||LA57_0==MOD) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // src/parser/Music.g:211:22: ( DOT ^| DIV ^| MOD ^) factor
            	    {
            	    // src/parser/Music.g:211:22: ( DOT ^| DIV ^| MOD ^)
            	    int alt56=3;
            	    switch ( input.LA(1) ) {
            	    case DOT:
            	        {
            	        alt56=1;
            	        }
            	        break;
            	    case DIV:
            	        {
            	        alt56=2;
            	        }
            	        break;
            	    case MOD:
            	        {
            	        alt56=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 56, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt56) {
            	        case 1 :
            	            // src/parser/Music.g:211:23: DOT ^
            	            {
            	            DOT232=(Token)match(input,DOT,FOLLOW_DOT_in_term2665); 
            	            DOT232_tree = 
            	            (AmlTree)adaptor.create(DOT232)
            	            ;
            	            root_0 = (AmlTree)adaptor.becomeRoot(DOT232_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // src/parser/Music.g:211:30: DIV ^
            	            {
            	            DIV233=(Token)match(input,DIV,FOLLOW_DIV_in_term2670); 
            	            DIV233_tree = 
            	            (AmlTree)adaptor.create(DIV233)
            	            ;
            	            root_0 = (AmlTree)adaptor.becomeRoot(DIV233_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // src/parser/Music.g:211:37: MOD ^
            	            {
            	            MOD234=(Token)match(input,MOD,FOLLOW_MOD_in_term2675); 
            	            MOD234_tree = 
            	            (AmlTree)adaptor.create(MOD234)
            	            ;
            	            root_0 = (AmlTree)adaptor.becomeRoot(MOD234_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_factor_in_term2679);
            	    factor235=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor235.getTree());

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
    // $ANTLR end "term"


    public static class factor_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "factor"
    // src/parser/Music.g:214:1: factor : ( NOT ^| PLUS ^| MINUS ^)? atom ;
    public final MusicParser.factor_return factor() throws RecognitionException {
        MusicParser.factor_return retval = new MusicParser.factor_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token NOT236=null;
        Token PLUS237=null;
        Token MINUS238=null;
        MusicParser.atom_return atom239 =null;


        AmlTree NOT236_tree=null;
        AmlTree PLUS237_tree=null;
        AmlTree MINUS238_tree=null;

        try {
            // src/parser/Music.g:214:9: ( ( NOT ^| PLUS ^| MINUS ^)? atom )
            // src/parser/Music.g:214:13: ( NOT ^| PLUS ^| MINUS ^)? atom
            {
            root_0 = (AmlTree)adaptor.nil();


            // src/parser/Music.g:214:13: ( NOT ^| PLUS ^| MINUS ^)?
            int alt58=4;
            switch ( input.LA(1) ) {
                case NOT:
                    {
                    alt58=1;
                    }
                    break;
                case PLUS:
                    {
                    alt58=2;
                    }
                    break;
                case MINUS:
                    {
                    alt58=3;
                    }
                    break;
            }

            switch (alt58) {
                case 1 :
                    // src/parser/Music.g:214:14: NOT ^
                    {
                    NOT236=(Token)match(input,NOT,FOLLOW_NOT_in_factor2696); 
                    NOT236_tree = 
                    (AmlTree)adaptor.create(NOT236)
                    ;
                    root_0 = (AmlTree)adaptor.becomeRoot(NOT236_tree, root_0);


                    }
                    break;
                case 2 :
                    // src/parser/Music.g:214:21: PLUS ^
                    {
                    PLUS237=(Token)match(input,PLUS,FOLLOW_PLUS_in_factor2701); 
                    PLUS237_tree = 
                    (AmlTree)adaptor.create(PLUS237)
                    ;
                    root_0 = (AmlTree)adaptor.becomeRoot(PLUS237_tree, root_0);


                    }
                    break;
                case 3 :
                    // src/parser/Music.g:214:29: MINUS ^
                    {
                    MINUS238=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor2706); 
                    MINUS238_tree = 
                    (AmlTree)adaptor.create(MINUS238)
                    ;
                    root_0 = (AmlTree)adaptor.becomeRoot(MINUS238_tree, root_0);


                    }
                    break;

            }


            pushFollow(FOLLOW_atom_in_factor2711);
            atom239=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom239.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:217:1: atom : ( ID | NUM | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | '(' ! expr ')' !);
    public final MusicParser.atom_return atom() throws RecognitionException {
        MusicParser.atom_return retval = new MusicParser.atom_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token b=null;
        Token ID240=null;
        Token NUM241=null;
        Token char_literal242=null;
        Token char_literal244=null;
        MusicParser.expr_return expr243 =null;


        AmlTree b_tree=null;
        AmlTree ID240_tree=null;
        AmlTree NUM241_tree=null;
        AmlTree char_literal242_tree=null;
        AmlTree char_literal244_tree=null;
        RewriteRuleTokenStream stream_TRUE=new RewriteRuleTokenStream(adaptor,"token TRUE");
        RewriteRuleTokenStream stream_FALSE=new RewriteRuleTokenStream(adaptor,"token FALSE");

        try {
            // src/parser/Music.g:217:9: ( ID | NUM | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | '(' ! expr ')' !)
            int alt60=4;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt60=1;
                }
                break;
            case NUM:
                {
                alt60=2;
                }
                break;
            case FALSE:
            case TRUE:
                {
                alt60=3;
                }
                break;
            case 79:
                {
                alt60=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;

            }

            switch (alt60) {
                case 1 :
                    // src/parser/Music.g:217:13: ID
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    ID240=(Token)match(input,ID,FOLLOW_ID_in_atom2727); 
                    ID240_tree = 
                    (AmlTree)adaptor.create(ID240)
                    ;
                    adaptor.addChild(root_0, ID240_tree);


                    }
                    break;
                case 2 :
                    // src/parser/Music.g:218:7: NUM
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    NUM241=(Token)match(input,NUM,FOLLOW_NUM_in_atom2735); 
                    NUM241_tree = 
                    (AmlTree)adaptor.create(NUM241)
                    ;
                    adaptor.addChild(root_0, NUM241_tree);


                    }
                    break;
                case 3 :
                    // src/parser/Music.g:219:7: (b= TRUE |b= FALSE )
                    {
                    // src/parser/Music.g:219:7: (b= TRUE |b= FALSE )
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==TRUE) ) {
                        alt59=1;
                    }
                    else if ( (LA59_0==FALSE) ) {
                        alt59=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 59, 0, input);

                        throw nvae;

                    }
                    switch (alt59) {
                        case 1 :
                            // src/parser/Music.g:219:8: b= TRUE
                            {
                            b=(Token)match(input,TRUE,FOLLOW_TRUE_in_atom2746);  
                            stream_TRUE.add(b);


                            }
                            break;
                        case 2 :
                            // src/parser/Music.g:219:17: b= FALSE
                            {
                            b=(Token)match(input,FALSE,FOLLOW_FALSE_in_atom2752);  
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
                    // 219:27: -> ^( BOOLEAN[$b,$b.text] )
                    {
                        // src/parser/Music.g:219:30: ^( BOOLEAN[$b,$b.text] )
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
                    // src/parser/Music.g:220:7: '(' ! expr ')' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    char_literal242=(Token)match(input,79,FOLLOW_79_in_atom2769); 

                    pushFollow(FOLLOW_expr_in_atom2772);
                    expr243=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr243.getTree());

                    char_literal244=(Token)match(input,80,FOLLOW_80_in_atom2774); 

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
    public static final BitSet FOLLOW_ID_in_function211 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_function213 = new BitSet(new long[]{0x0080002000000A00L,0x0000000000010000L});
    public static final BitSet FOLLOW_list_arguments_in_function215 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_function217 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_function219 = new BitSet(new long[]{0x0280003E10108A80L,0x0000000000802238L});
    public static final BitSet FOLLOW_listInst_in_function221 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_function223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_argument_in_list_arguments262 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_list_arguments265 = new BitSet(new long[]{0x0080002000000A00L});
    public static final BitSet FOLLOW_argument_in_list_arguments267 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_type_in_argument308 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ID_in_argument311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_params337 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_params340 = new BitSet(new long[]{0x0A08800204000000L,0x0000000000009000L});
    public static final BitSet FOLLOW_expr_in_params343 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_inst_in_listInst370 = new BitSet(new long[]{0x0280003E10108A82L,0x0000000000002238L});
    public static final BitSet FOLLOW_music_inst_in_list_music_inst404 = new BitSet(new long[]{0x0090002E10008B02L,0x000000000000A088L});
    public static final BitSet FOLLOW_declaration_in_inst448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tone_in_inst466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_beat_in_inst484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_speed_in_inst502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instrument_in_inst520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignation_in_inst538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_stmt_in_inst556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_inst574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_stmt_in_inst592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_stmt_in_inst610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_song_in_inst628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compas_list_in_inst646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_music_inst670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignation_in_music_inst688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_music_stmt_in_music_inst706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_music_inst724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_music_stmt_in_music_inst742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_music_stmt_in_music_inst760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_song_in_music_inst778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notes_group_in_music_inst805 = new BitSet(new long[]{0x0010000000000902L,0x0000000000108080L});
    public static final BitSet FOLLOW_84_in_music_inst809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_funcall840 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_funcall842 = new BitSet(new long[]{0x0A08800204000000L,0x0000000000019000L});
    public static final BitSet FOLLOW_params_in_funcall844 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_funcall847 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_funcall849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_declaration882 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_assig_opt_in_declaration885 = new BitSet(new long[]{0x0000000000000000L,0x0000000000120000L});
    public static final BitSet FOLLOW_81_in_declaration888 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_assig_opt_in_declaration891 = new BitSet(new long[]{0x0000000000000000L,0x0000000000120000L});
    public static final BitSet FOLLOW_84_in_declaration895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assig_opt1005 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ASSIG_in_assig_opt1008 = new BitSet(new long[]{0x0A18800204000900L,0x0000000000009080L});
    public static final BitSet FOLLOW_expr_in_assig_opt1012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notes_variable_in_assig_opt1016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assig_in_assignation1042 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_assignation1044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assig1074 = new BitSet(new long[]{0x9005000000040020L});
    public static final BitSet FOLLOW_set_in_assig1076 = new BitSet(new long[]{0x0A18800204000900L,0x0000000000009080L});
    public static final BitSet FOLLOW_expr_in_assig1092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notes_variable_in_assig1096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_post_in_assig1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pre_in_assig1133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_post1163 = new BitSet(new long[]{0x0000000800008000L});
    public static final BitSet FOLLOW_INCR_in_post1168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECR_in_post1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INCR_in_pre1221 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_DECR_in_pre1227 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ID_in_pre1230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BEAT_in_beat1273 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_NUM_in_beat1276 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_beat1278 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_NUM_in_beat1281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SPEED_in_speed1310 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_NUM_in_speed1313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRANSPORT_in_transport1338 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_NUM_in_transport1341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUMENT_in_instrument1365 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_STRING_in_instrument1368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_stmt1392 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_while_stmt1395 = new BitSet(new long[]{0x0A08800204000000L,0x0000000000009000L});
    public static final BitSet FOLLOW_expr_in_while_stmt1398 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_while_stmt1400 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_while_stmt1403 = new BitSet(new long[]{0x0280003E10108A80L,0x0000000000802238L});
    public static final BitSet FOLLOW_listInst_in_while_stmt1406 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_while_stmt1408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_music_stmt1435 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_while_music_stmt1438 = new BitSet(new long[]{0x0A08800204000000L,0x0000000000009000L});
    public static final BitSet FOLLOW_expr_in_while_music_stmt1441 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_while_music_stmt1443 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_while_music_stmt1446 = new BitSet(new long[]{0x0090002E10008B00L,0x000000000080A088L});
    public static final BitSet FOLLOW_list_music_inst_in_while_music_stmt1449 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_while_music_stmt1451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_for_stmt1486 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_for_stmt1489 = new BitSet(new long[]{0x0080002A00008A00L});
    public static final BitSet FOLLOW_declaration_in_for_stmt1493 = new BitSet(new long[]{0x0A08800204000000L,0x0000000000009000L});
    public static final BitSet FOLLOW_list_assig_in_for_stmt1497 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_for_stmt1499 = new BitSet(new long[]{0x0A08800204000000L,0x0000000000009000L});
    public static final BitSet FOLLOW_expr_in_for_stmt1503 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_for_stmt1505 = new BitSet(new long[]{0x0000000A00008000L});
    public static final BitSet FOLLOW_list_assig_in_for_stmt1508 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_for_stmt1510 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_for_stmt1513 = new BitSet(new long[]{0x0280003E10108A80L,0x0000000000802238L});
    public static final BitSet FOLLOW_listInst_in_for_stmt1516 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_for_stmt1518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_for_music_stmt1543 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_for_music_stmt1546 = new BitSet(new long[]{0x0080002A00008A00L});
    public static final BitSet FOLLOW_declaration_in_for_music_stmt1550 = new BitSet(new long[]{0x0A08800204000000L,0x0000000000009000L});
    public static final BitSet FOLLOW_list_assig_in_for_music_stmt1554 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_for_music_stmt1556 = new BitSet(new long[]{0x0A08800204000000L,0x0000000000009000L});
    public static final BitSet FOLLOW_expr_in_for_music_stmt1560 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_for_music_stmt1562 = new BitSet(new long[]{0x0000000A00008000L});
    public static final BitSet FOLLOW_list_assig_in_for_music_stmt1565 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_for_music_stmt1567 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_for_music_stmt1570 = new BitSet(new long[]{0x0090002E10008B00L,0x000000000080A088L});
    public static final BitSet FOLLOW_list_music_inst_in_for_music_stmt1573 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_for_music_stmt1575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assig_in_list_assig1604 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_list_assig1607 = new BitSet(new long[]{0x0000000A00008000L});
    public static final BitSet FOLLOW_assig_in_list_assig1609 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_IF_in_if_stmt1647 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_if_stmt1650 = new BitSet(new long[]{0x0A08800204000000L,0x0000000000009000L});
    public static final BitSet FOLLOW_expr_in_if_stmt1653 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_if_stmt1655 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_if_stmt1658 = new BitSet(new long[]{0x0280003E10108A80L,0x0000000000802238L});
    public static final BitSet FOLLOW_listInst_in_if_stmt1661 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_if_stmt1663 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_elseif_stmt_in_if_stmt1666 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_else_stmt_in_if_stmt1669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_elseif_stmt1693 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IF_in_elseif_stmt1695 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_elseif_stmt1697 = new BitSet(new long[]{0x0A08800204000000L,0x0000000000009000L});
    public static final BitSet FOLLOW_expr_in_elseif_stmt1699 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_elseif_stmt1701 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_elseif_stmt1703 = new BitSet(new long[]{0x0280003E10108A80L,0x0000000000802238L});
    public static final BitSet FOLLOW_listInst_in_elseif_stmt1705 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_elseif_stmt1707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_else_stmt1742 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_else_stmt1745 = new BitSet(new long[]{0x0280003E10108A80L,0x0000000000802238L});
    public static final BitSet FOLLOW_listInst_in_else_stmt1748 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_else_stmt1750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_if_music_stmt1776 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_if_music_stmt1779 = new BitSet(new long[]{0x0A08800204000000L,0x0000000000009000L});
    public static final BitSet FOLLOW_expr_in_if_music_stmt1782 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_if_music_stmt1784 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_if_music_stmt1787 = new BitSet(new long[]{0x0090002E10008B00L,0x000000000080A088L});
    public static final BitSet FOLLOW_list_music_inst_in_if_music_stmt1790 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_if_music_stmt1792 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_elseif_music_stmt_in_if_music_stmt1795 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_else_music_stmt_in_if_music_stmt1798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_elseif_music_stmt1828 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IF_in_elseif_music_stmt1830 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_elseif_music_stmt1832 = new BitSet(new long[]{0x0A08800204000000L,0x0000000000009000L});
    public static final BitSet FOLLOW_expr_in_elseif_music_stmt1834 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_elseif_music_stmt1836 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_elseif_music_stmt1838 = new BitSet(new long[]{0x0090002E10008B00L,0x000000000080A088L});
    public static final BitSet FOLLOW_list_music_inst_in_elseif_music_stmt1840 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_elseif_music_stmt1842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_else_music_stmt1883 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_else_music_stmt1886 = new BitSet(new long[]{0x0090002E10008B00L,0x000000000080A088L});
    public static final BitSet FOLLOW_list_music_inst_in_else_music_stmt1889 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_else_music_stmt1891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SONG_in_song1926 = new BitSet(new long[]{0x0000000200000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_ID_in_song1929 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_song1932 = new BitSet(new long[]{0x0000000000000080L,0x0000000000000C10L});
    public static final BitSet FOLLOW_beat_in_song1935 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000C10L});
    public static final BitSet FOLLOW_speed_in_song1938 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_transport_in_song1941 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_track_in_song1945 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800400L});
    public static final BitSet FOLLOW_87_in_song1949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRACK_in_track1979 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ID_in_track1982 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_STRING_in_track1985 = new BitSet(new long[]{0x0200000000100000L,0x0000000000000020L});
    public static final BitSet FOLLOW_compas_aux_in_track1987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compas_list_in_compas_aux2011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_BAR_in_compas_list2041 = new BitSet(new long[]{0x0290002E10108B00L,0x000000000000A2A8L});
    public static final BitSet FOLLOW_repetition_in_compas_list2046 = new BitSet(new long[]{0x0290002E10108B00L,0x000000000000A2A8L});
    public static final BitSet FOLLOW_compasses_in_compas_list2050 = new BitSet(new long[]{0x0290002E10108B00L,0x000000000000A2A8L});
    public static final BitSet FOLLOW_repetition_in_compas_list2054 = new BitSet(new long[]{0x0290002E10108B00L,0x000000000000A2A8L});
    public static final BitSet FOLLOW_DOUBLE_BAR_in_compas_list2059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compas_in_compasses2086 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_BAR_in_compasses2089 = new BitSet(new long[]{0x0090002E10008B00L,0x000000000000A288L});
    public static final BitSet FOLLOW_compas_in_compasses2092 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_NUM_in_repetition2119 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_repetition2121 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_START_REPETITION_in_repetition2125 = new BitSet(new long[]{0x0090002E10008B00L,0x000000000000A288L});
    public static final BitSet FOLLOW_compasses_in_repetition2127 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_END_REPETITION_in_repetition2129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tone_in_compas2170 = new BitSet(new long[]{0x0090002E10008B00L,0x000000000000A088L});
    public static final BitSet FOLLOW_music_inst_in_compas2183 = new BitSet(new long[]{0x0090002E10008B02L,0x000000000000A088L});
    public static final BitSet FOLLOW_TONE_in_tone2230 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_NUM_in_tone2233 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000080L});
    public static final BitSet FOLLOW_set_in_tone2235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notes_type_in_notes_group2264 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040100L});
    public static final BitSet FOLLOW_82_in_notes_group2267 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_FIGURE_in_notes_group2269 = new BitSet(new long[]{0x0000000000080002L,0x0000000000000100L});
    public static final BitSet FOLLOW_DOT_in_notes_group2271 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_TIE_in_notes_group2276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notes_type_in_notes_variable2318 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_notes_variable2321 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_FIGURE_in_notes_variable2323 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_DOT_in_notes_variable2325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_chord_in_notes_type2368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notes_in_notes_type2372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHORD_in_chord2388 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_chord2391 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_NOTE_in_chord2394 = new BitSet(new long[]{0x0800600000010000L,0x0000000000010004L});
    public static final BitSet FOLLOW_80_in_chord2412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_notes2444 = new BitSet(new long[]{0x0010000000000100L,0x0000000000000080L});
    public static final BitSet FOLLOW_note_in_notes2447 = new BitSet(new long[]{0x0010000000000100L,0x0000000000010080L});
    public static final BitSet FOLLOW_80_in_notes2451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_note_in_notes2456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOTE_in_note2505 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_MINUS_in_note2509 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_NUM_in_note2512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolterm_in_expr2541 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_OR_in_expr2544 = new BitSet(new long[]{0x0A08800204000000L,0x0000000000009000L});
    public static final BitSet FOLLOW_boolterm_in_expr2547 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_boolfact_in_boolterm2561 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_boolterm2564 = new BitSet(new long[]{0x0A08800204000000L,0x0000000000009000L});
    public static final BitSet FOLLOW_boolfact_in_boolterm2567 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_num_expr_in_boolfact2581 = new BitSet(new long[]{0x0100104181000002L});
    public static final BitSet FOLLOW_EQUAL_in_boolfact2585 = new BitSet(new long[]{0x0A08800204000000L,0x0000000000009000L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_boolfact2590 = new BitSet(new long[]{0x0A08800204000000L,0x0000000000009000L});
    public static final BitSet FOLLOW_LT_in_boolfact2595 = new BitSet(new long[]{0x0A08800204000000L,0x0000000000009000L});
    public static final BitSet FOLLOW_LE_in_boolfact2600 = new BitSet(new long[]{0x0A08800204000000L,0x0000000000009000L});
    public static final BitSet FOLLOW_GT_in_boolfact2605 = new BitSet(new long[]{0x0A08800204000000L,0x0000000000009000L});
    public static final BitSet FOLLOW_GE_in_boolfact2610 = new BitSet(new long[]{0x0A08800204000000L,0x0000000000009000L});
    public static final BitSet FOLLOW_num_expr_in_boolfact2614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_num_expr2628 = new BitSet(new long[]{0x0800800000000002L});
    public static final BitSet FOLLOW_PLUS_in_num_expr2633 = new BitSet(new long[]{0x0A08800204000000L,0x0000000000009000L});
    public static final BitSet FOLLOW_MINUS_in_num_expr2638 = new BitSet(new long[]{0x0A08800204000000L,0x0000000000009000L});
    public static final BitSet FOLLOW_term_in_num_expr2642 = new BitSet(new long[]{0x0800800000000002L});
    public static final BitSet FOLLOW_factor_in_term2660 = new BitSet(new long[]{0x00020000000A0002L});
    public static final BitSet FOLLOW_DOT_in_term2665 = new BitSet(new long[]{0x0A08800204000000L,0x0000000000009000L});
    public static final BitSet FOLLOW_DIV_in_term2670 = new BitSet(new long[]{0x0A08800204000000L,0x0000000000009000L});
    public static final BitSet FOLLOW_MOD_in_term2675 = new BitSet(new long[]{0x0A08800204000000L,0x0000000000009000L});
    public static final BitSet FOLLOW_factor_in_term2679 = new BitSet(new long[]{0x00020000000A0002L});
    public static final BitSet FOLLOW_NOT_in_factor2696 = new BitSet(new long[]{0x0200000204000000L,0x0000000000009000L});
    public static final BitSet FOLLOW_PLUS_in_factor2701 = new BitSet(new long[]{0x0200000204000000L,0x0000000000009000L});
    public static final BitSet FOLLOW_MINUS_in_factor2706 = new BitSet(new long[]{0x0200000204000000L,0x0000000000009000L});
    public static final BitSet FOLLOW_atom_in_factor2711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom2727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUM_in_atom2735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_atom2746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_atom2752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_atom2769 = new BitSet(new long[]{0x0A08800204000000L,0x0000000000009000L});
    public static final BitSet FOLLOW_expr_in_atom2772 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_atom2774 = new BitSet(new long[]{0x0000000000000002L});

}