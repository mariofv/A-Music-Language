// $ANTLR 3.4 src/parser/Music.g 2017-04-07 11:59:48

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ASSIG", "BAR", "BEAT", "BEMOL", "BOOL", "BOOLEAN", "CHORD", "COMMENT", "COMPAS", "COMPAS_LIST", "DECR", "DIMINUTION", "DIV", "DIVIDE_ASSIG", "DOT", "DOUBLE_BAR", "ELSE", "ELSEIF", "END_REPETITION", "EQUAL", "ESC_SEQ", "FALSE", "FIGURE", "FOR", "FRAGMENT", "FUNCALL", "FUNCTION", "GE", "GT", "ID", "IF", "INCR", "INSTRUMENT", "INT", "LE", "LETTER_X", "LIST_ARGUMENTS", "LIST_ASSIG", "LIST_FUNCTIONS", "LIST_INSTRUCTIONS", "LIST_MUSIC_INST", "LT", "MAJ7", "MINOR", "MINUS", "MINUS_ASSIG", "MOD", "MOD_ASSIG", "NOT", "NOTE", "NOTES", "NOTE_LIST", "NOTE_TYPE", "NOT_EQUAL", "NUM", "OR", "PLUS", "PLUS_ASSIG", "POST", "PRE", "PROD_ASSIG", "REPETITION", "RETURN", "SEVENTH", "SONG", "SPEED", "START_REPETITION", "STRING", "SUSTAIN", "TIE", "TONE", "TRACK", "TRANSPORT", "TRUE", "VAR_ACCESS", "VOID", "WHILE", "WS", "'('", "')'", "','", "'.'", "':'", "';'", "'{'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__83=83;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__90=90;
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
    public static final int FRAGMENT=29;
    public static final int FUNCALL=30;
    public static final int FUNCTION=31;
    public static final int GE=32;
    public static final int GT=33;
    public static final int ID=34;
    public static final int IF=35;
    public static final int INCR=36;
    public static final int INSTRUMENT=37;
    public static final int INT=38;
    public static final int LE=39;
    public static final int LETTER_X=40;
    public static final int LIST_ARGUMENTS=41;
    public static final int LIST_ASSIG=42;
    public static final int LIST_FUNCTIONS=43;
    public static final int LIST_INSTRUCTIONS=44;
    public static final int LIST_MUSIC_INST=45;
    public static final int LT=46;
    public static final int MAJ7=47;
    public static final int MINOR=48;
    public static final int MINUS=49;
    public static final int MINUS_ASSIG=50;
    public static final int MOD=51;
    public static final int MOD_ASSIG=52;
    public static final int NOT=53;
    public static final int NOTE=54;
    public static final int NOTES=55;
    public static final int NOTE_LIST=56;
    public static final int NOTE_TYPE=57;
    public static final int NOT_EQUAL=58;
    public static final int NUM=59;
    public static final int OR=60;
    public static final int PLUS=61;
    public static final int PLUS_ASSIG=62;
    public static final int POST=63;
    public static final int PRE=64;
    public static final int PROD_ASSIG=65;
    public static final int REPETITION=66;
    public static final int RETURN=67;
    public static final int SEVENTH=68;
    public static final int SONG=69;
    public static final int SPEED=70;
    public static final int START_REPETITION=71;
    public static final int STRING=72;
    public static final int SUSTAIN=73;
    public static final int TIE=74;
    public static final int TONE=75;
    public static final int TRACK=76;
    public static final int TRANSPORT=77;
    public static final int TRUE=78;
    public static final int VAR_ACCESS=79;
    public static final int VOID=80;
    public static final int WHILE=81;
    public static final int WS=82;

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
    // src/parser/Music.g:39:1: prog : ( global_stmt )+ EOF -> ^( LIST_FUNCTIONS ( global_stmt )+ ) ;
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
            // src/parser/Music.g:39:10: ( ( global_stmt )+ EOF -> ^( LIST_FUNCTIONS ( global_stmt )+ ) )
            // src/parser/Music.g:39:14: ( global_stmt )+ EOF
            {
            // src/parser/Music.g:39:14: ( global_stmt )+
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
            	    // src/parser/Music.g:39:15: global_stmt
            	    {
            	    pushFollow(FOLLOW_global_stmt_in_prog179);
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


            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_prog183);  
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
            // 39:33: -> ^( LIST_FUNCTIONS ( global_stmt )+ )
            {
                // src/parser/Music.g:39:36: ^( LIST_FUNCTIONS ( global_stmt )+ )
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
    // src/parser/Music.g:42:1: global_stmt : ( function | frag | song );
    public final MusicParser.global_stmt_return global_stmt() throws RecognitionException {
        MusicParser.global_stmt_return retval = new MusicParser.global_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        MusicParser.function_return function3 =null;

        MusicParser.frag_return frag4 =null;

        MusicParser.song_return song5 =null;



        try {
            // src/parser/Music.g:42:13: ( function | frag | song )
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
                    // src/parser/Music.g:42:17: function
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_function_in_global_stmt215);
                    function3=function();

                    state._fsp--;

                    adaptor.addChild(root_0, function3.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:43:17: frag
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_frag_in_global_stmt233);
                    frag4=frag();

                    state._fsp--;

                    adaptor.addChild(root_0, frag4.getTree());

                    }
                    break;
                case 3 :
                    // src/parser/Music.g:44:17: song
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_song_in_global_stmt251);
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


    public static class var_access_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "var_access"
    // src/parser/Music.g:47:1: var_access : id= id_rule '.' id2= id_rule ( '(' params ')' )? ';' -> ^( VAR_ACCESS[$id.text] $id2 ( params )? ) ;
    public final MusicParser.var_access_return var_access() throws RecognitionException {
        MusicParser.var_access_return retval = new MusicParser.var_access_return();
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
        RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
        RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
        RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");
        RewriteRuleTokenStream stream_88=new RewriteRuleTokenStream(adaptor,"token 88");
        RewriteRuleSubtreeStream stream_id_rule=new RewriteRuleSubtreeStream(adaptor,"rule id_rule");
        RewriteRuleSubtreeStream stream_params=new RewriteRuleSubtreeStream(adaptor,"rule params");
        try {
            // src/parser/Music.g:47:13: (id= id_rule '.' id2= id_rule ( '(' params ')' )? ';' -> ^( VAR_ACCESS[$id.text] $id2 ( params )? ) )
            // src/parser/Music.g:47:17: id= id_rule '.' id2= id_rule ( '(' params ')' )? ';'
            {
            pushFollow(FOLLOW_id_rule_in_var_access277);
            id=id_rule();

            state._fsp--;

            stream_id_rule.add(id.getTree());

            char_literal6=(Token)match(input,86,FOLLOW_86_in_var_access278);  
            stream_86.add(char_literal6);


            pushFollow(FOLLOW_id_rule_in_var_access281);
            id2=id_rule();

            state._fsp--;

            stream_id_rule.add(id2.getTree());

            // src/parser/Music.g:47:42: ( '(' params ')' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==83) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // src/parser/Music.g:47:43: '(' params ')'
                    {
                    char_literal7=(Token)match(input,83,FOLLOW_83_in_var_access284);  
                    stream_83.add(char_literal7);


                    pushFollow(FOLLOW_params_in_var_access286);
                    params8=params();

                    state._fsp--;

                    stream_params.add(params8.getTree());

                    char_literal9=(Token)match(input,84,FOLLOW_84_in_var_access288);  
                    stream_84.add(char_literal9);


                    }
                    break;

            }


            char_literal10=(Token)match(input,88,FOLLOW_88_in_var_access292);  
            stream_88.add(char_literal10);


            // AST REWRITE
            // elements: params, id2
            // token labels: 
            // rule labels: retval, id2
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_id2=new RewriteRuleSubtreeStream(adaptor,"rule id2",id2!=null?id2.tree:null);

            root_0 = (AmlTree)adaptor.nil();
            // 47:66: -> ^( VAR_ACCESS[$id.text] $id2 ( params )? )
            {
                // src/parser/Music.g:47:70: ^( VAR_ACCESS[$id.text] $id2 ( params )? )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(VAR_ACCESS, (id!=null?input.toString(id.start,id.stop):null))
                , root_1);

                adaptor.addChild(root_1, stream_id2.nextTree());

                // src/parser/Music.g:47:98: ( params )?
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
    // $ANTLR end "var_access"


    public static class id_rule_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "id_rule"
    // src/parser/Music.g:50:1: id_rule : ( ID | LETTER_X );
    public final MusicParser.id_rule_return id_rule() throws RecognitionException {
        MusicParser.id_rule_return retval = new MusicParser.id_rule_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token set11=null;

        AmlTree set11_tree=null;

        try {
            // src/parser/Music.g:50:13: ( ID | LETTER_X )
            // src/parser/Music.g:
            {
            root_0 = (AmlTree)adaptor.nil();


            set11=(Token)input.LT(1);

            if ( input.LA(1)==ID||input.LA(1)==LETTER_X ) {
                input.consume();
                adaptor.addChild(root_0, 
                (AmlTree)adaptor.create(set11)
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
    // src/parser/Music.g:54:1: function : type_void id= id_rule '(' list_arguments ')' '{' listInst '}' -> ^( FUNCTION[$id.text] type_void list_arguments listInst ) ;
    public final MusicParser.function_return function() throws RecognitionException {
        MusicParser.function_return retval = new MusicParser.function_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal13=null;
        Token char_literal15=null;
        Token char_literal16=null;
        Token char_literal18=null;
        MusicParser.id_rule_return id =null;

        MusicParser.type_void_return type_void12 =null;

        MusicParser.list_arguments_return list_arguments14 =null;

        MusicParser.listInst_return listInst17 =null;


        AmlTree char_literal13_tree=null;
        AmlTree char_literal15_tree=null;
        AmlTree char_literal16_tree=null;
        AmlTree char_literal18_tree=null;
        RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
        RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
        RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");
        RewriteRuleTokenStream stream_89=new RewriteRuleTokenStream(adaptor,"token 89");
        RewriteRuleSubtreeStream stream_listInst=new RewriteRuleSubtreeStream(adaptor,"rule listInst");
        RewriteRuleSubtreeStream stream_list_arguments=new RewriteRuleSubtreeStream(adaptor,"rule list_arguments");
        RewriteRuleSubtreeStream stream_type_void=new RewriteRuleSubtreeStream(adaptor,"rule type_void");
        RewriteRuleSubtreeStream stream_id_rule=new RewriteRuleSubtreeStream(adaptor,"rule id_rule");
        try {
            // src/parser/Music.g:54:13: ( type_void id= id_rule '(' list_arguments ')' '{' listInst '}' -> ^( FUNCTION[$id.text] type_void list_arguments listInst ) )
            // src/parser/Music.g:54:16: type_void id= id_rule '(' list_arguments ')' '{' listInst '}'
            {
            pushFollow(FOLLOW_type_void_in_function378);
            type_void12=type_void();

            state._fsp--;

            stream_type_void.add(type_void12.getTree());

            pushFollow(FOLLOW_id_rule_in_function382);
            id=id_rule();

            state._fsp--;

            stream_id_rule.add(id.getTree());

            char_literal13=(Token)match(input,83,FOLLOW_83_in_function384);  
            stream_83.add(char_literal13);


            pushFollow(FOLLOW_list_arguments_in_function386);
            list_arguments14=list_arguments();

            state._fsp--;

            stream_list_arguments.add(list_arguments14.getTree());

            char_literal15=(Token)match(input,84,FOLLOW_84_in_function388);  
            stream_84.add(char_literal15);


            char_literal16=(Token)match(input,89,FOLLOW_89_in_function390);  
            stream_89.add(char_literal16);


            pushFollow(FOLLOW_listInst_in_function392);
            listInst17=listInst();

            state._fsp--;

            stream_listInst.add(listInst17.getTree());

            char_literal18=(Token)match(input,90,FOLLOW_90_in_function394);  
            stream_90.add(char_literal18);


            // AST REWRITE
            // elements: listInst, list_arguments, type_void
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AmlTree)adaptor.nil();
            // 54:80: -> ^( FUNCTION[$id.text] type_void list_arguments listInst )
            {
                // src/parser/Music.g:54:85: ^( FUNCTION[$id.text] type_void list_arguments listInst )
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
    // src/parser/Music.g:57:1: funcall : id= id_rule '(' ( params )? ')' ';' -> ^( FUNCALL[$id.text] ( params )? ) ;
    public final MusicParser.funcall_return funcall() throws RecognitionException {
        MusicParser.funcall_return retval = new MusicParser.funcall_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal19=null;
        Token char_literal21=null;
        Token char_literal22=null;
        MusicParser.id_rule_return id =null;

        MusicParser.params_return params20 =null;


        AmlTree char_literal19_tree=null;
        AmlTree char_literal21_tree=null;
        AmlTree char_literal22_tree=null;
        RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
        RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");
        RewriteRuleTokenStream stream_88=new RewriteRuleTokenStream(adaptor,"token 88");
        RewriteRuleSubtreeStream stream_id_rule=new RewriteRuleSubtreeStream(adaptor,"rule id_rule");
        RewriteRuleSubtreeStream stream_params=new RewriteRuleSubtreeStream(adaptor,"rule params");
        try {
            // src/parser/Music.g:57:13: (id= id_rule '(' ( params )? ')' ';' -> ^( FUNCALL[$id.text] ( params )? ) )
            // src/parser/Music.g:57:17: id= id_rule '(' ( params )? ')' ';'
            {
            pushFollow(FOLLOW_id_rule_in_funcall441);
            id=id_rule();

            state._fsp--;

            stream_id_rule.add(id.getTree());

            char_literal19=(Token)match(input,83,FOLLOW_83_in_funcall443);  
            stream_83.add(char_literal19);


            // src/parser/Music.g:57:32: ( params )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==FALSE||LA4_0==ID||LA4_0==LETTER_X||LA4_0==MINUS||LA4_0==NOT||LA4_0==NUM||LA4_0==PLUS||LA4_0==TRUE||LA4_0==83) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // src/parser/Music.g:57:32: params
                    {
                    pushFollow(FOLLOW_params_in_funcall445);
                    params20=params();

                    state._fsp--;

                    stream_params.add(params20.getTree());

                    }
                    break;

            }


            char_literal21=(Token)match(input,84,FOLLOW_84_in_funcall448);  
            stream_84.add(char_literal21);


            char_literal22=(Token)match(input,88,FOLLOW_88_in_funcall450);  
            stream_88.add(char_literal22);


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
            // 57:48: -> ^( FUNCALL[$id.text] ( params )? )
            {
                // src/parser/Music.g:57:51: ^( FUNCALL[$id.text] ( params )? )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(FUNCALL, (id!=null?input.toString(id.start,id.stop):null))
                , root_1);

                // src/parser/Music.g:57:71: ( params )?
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
    // src/parser/Music.g:60:1: frag : FRAGMENT ^ id_rule '(' ! list_arguments ')' ! '{' ! list_music_inst '}' !;
    public final MusicParser.frag_return frag() throws RecognitionException {
        MusicParser.frag_return retval = new MusicParser.frag_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token FRAGMENT23=null;
        Token char_literal25=null;
        Token char_literal27=null;
        Token char_literal28=null;
        Token char_literal30=null;
        MusicParser.id_rule_return id_rule24 =null;

        MusicParser.list_arguments_return list_arguments26 =null;

        MusicParser.list_music_inst_return list_music_inst29 =null;


        AmlTree FRAGMENT23_tree=null;
        AmlTree char_literal25_tree=null;
        AmlTree char_literal27_tree=null;
        AmlTree char_literal28_tree=null;
        AmlTree char_literal30_tree=null;

        try {
            // src/parser/Music.g:60:9: ( FRAGMENT ^ id_rule '(' ! list_arguments ')' ! '{' ! list_music_inst '}' !)
            // src/parser/Music.g:60:11: FRAGMENT ^ id_rule '(' ! list_arguments ')' ! '{' ! list_music_inst '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            FRAGMENT23=(Token)match(input,FRAGMENT,FOLLOW_FRAGMENT_in_frag484); 
            FRAGMENT23_tree = 
            (AmlTree)adaptor.create(FRAGMENT23)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(FRAGMENT23_tree, root_0);


            pushFollow(FOLLOW_id_rule_in_frag487);
            id_rule24=id_rule();

            state._fsp--;

            adaptor.addChild(root_0, id_rule24.getTree());

            char_literal25=(Token)match(input,83,FOLLOW_83_in_frag489); 

            pushFollow(FOLLOW_list_arguments_in_frag492);
            list_arguments26=list_arguments();

            state._fsp--;

            adaptor.addChild(root_0, list_arguments26.getTree());

            char_literal27=(Token)match(input,84,FOLLOW_84_in_frag494); 

            char_literal28=(Token)match(input,89,FOLLOW_89_in_frag497); 

            pushFollow(FOLLOW_list_music_inst_in_frag500);
            list_music_inst29=list_music_inst();

            state._fsp--;

            adaptor.addChild(root_0, list_music_inst29.getTree());

            char_literal30=(Token)match(input,90,FOLLOW_90_in_frag502); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:63:1: list_arguments : ( argument ( ',' argument )* )? -> ^( LIST_ARGUMENTS ( argument )* ) ;
    public final MusicParser.list_arguments_return list_arguments() throws RecognitionException {
        MusicParser.list_arguments_return retval = new MusicParser.list_arguments_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal32=null;
        MusicParser.argument_return argument31 =null;

        MusicParser.argument_return argument33 =null;


        AmlTree char_literal32_tree=null;
        RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
        RewriteRuleSubtreeStream stream_argument=new RewriteRuleSubtreeStream(adaptor,"rule argument");
        try {
            // src/parser/Music.g:63:17: ( ( argument ( ',' argument )* )? -> ^( LIST_ARGUMENTS ( argument )* ) )
            // src/parser/Music.g:63:19: ( argument ( ',' argument )* )?
            {
            // src/parser/Music.g:63:19: ( argument ( ',' argument )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==BOOL||LA6_0==CHORD||LA6_0==INT||LA6_0==NOTE_TYPE) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // src/parser/Music.g:63:20: argument ( ',' argument )*
                    {
                    pushFollow(FOLLOW_argument_in_list_arguments522);
                    argument31=argument();

                    state._fsp--;

                    stream_argument.add(argument31.getTree());

                    // src/parser/Music.g:63:29: ( ',' argument )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==85) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // src/parser/Music.g:63:30: ',' argument
                    	    {
                    	    char_literal32=(Token)match(input,85,FOLLOW_85_in_list_arguments525);  
                    	    stream_85.add(char_literal32);


                    	    pushFollow(FOLLOW_argument_in_list_arguments527);
                    	    argument33=argument();

                    	    state._fsp--;

                    	    stream_argument.add(argument33.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
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
            // 63:47: -> ^( LIST_ARGUMENTS ( argument )* )
            {
                // src/parser/Music.g:63:50: ^( LIST_ARGUMENTS ( argument )* )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(LIST_ARGUMENTS, "LIST_ARGUMENTS")
                , root_1);

                // src/parser/Music.g:63:67: ( argument )*
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
    // src/parser/Music.g:66:1: argument : type ^ id_rule ;
    public final MusicParser.argument_return argument() throws RecognitionException {
        MusicParser.argument_return retval = new MusicParser.argument_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        MusicParser.type_return type34 =null;

        MusicParser.id_rule_return id_rule35 =null;



        try {
            // src/parser/Music.g:66:11: ( type ^ id_rule )
            // src/parser/Music.g:66:15: type ^ id_rule
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_type_in_argument568);
            type34=type();

            state._fsp--;

            root_0 = (AmlTree)adaptor.becomeRoot(type34.getTree(), root_0);

            pushFollow(FOLLOW_id_rule_in_argument571);
            id_rule35=id_rule();

            state._fsp--;

            adaptor.addChild(root_0, id_rule35.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:69:1: params : expr ( ',' ! expr )* ;
    public final MusicParser.params_return params() throws RecognitionException {
        MusicParser.params_return retval = new MusicParser.params_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal37=null;
        MusicParser.expr_return expr36 =null;

        MusicParser.expr_return expr38 =null;


        AmlTree char_literal37_tree=null;

        try {
            // src/parser/Music.g:69:13: ( expr ( ',' ! expr )* )
            // src/parser/Music.g:69:17: expr ( ',' ! expr )*
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_expr_in_params597);
            expr36=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr36.getTree());

            // src/parser/Music.g:69:22: ( ',' ! expr )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==85) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // src/parser/Music.g:69:23: ',' ! expr
            	    {
            	    char_literal37=(Token)match(input,85,FOLLOW_85_in_params600); 

            	    pushFollow(FOLLOW_expr_in_params603);
            	    expr38=expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr38.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
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
    // src/parser/Music.g:72:1: listInst : ( inst )* -> ^( LIST_INSTRUCTIONS ( inst )* ) ;
    public final MusicParser.listInst_return listInst() throws RecognitionException {
        MusicParser.listInst_return retval = new MusicParser.listInst_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        MusicParser.inst_return inst39 =null;


        RewriteRuleSubtreeStream stream_inst=new RewriteRuleSubtreeStream(adaptor,"rule inst");
        try {
            // src/parser/Music.g:72:13: ( ( inst )* -> ^( LIST_INSTRUCTIONS ( inst )* ) )
            // src/parser/Music.g:72:16: ( inst )*
            {
            // src/parser/Music.g:72:16: ( inst )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==BEAT||LA8_0==BOOL||LA8_0==CHORD||LA8_0==DECR||LA8_0==DOUBLE_BAR||LA8_0==FOR||(LA8_0 >= ID && LA8_0 <= INT)||LA8_0==LETTER_X||LA8_0==NOTE_TYPE||LA8_0==NUM||(LA8_0 >= SONG && LA8_0 <= START_REPETITION)||LA8_0==TONE||LA8_0==WHILE) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // src/parser/Music.g:72:16: inst
            	    {
            	    pushFollow(FOLLOW_inst_in_listInst630);
            	    inst39=inst();

            	    state._fsp--;

            	    stream_inst.add(inst39.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
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
            // 72:23: -> ^( LIST_INSTRUCTIONS ( inst )* )
            {
                // src/parser/Music.g:72:26: ^( LIST_INSTRUCTIONS ( inst )* )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(LIST_INSTRUCTIONS, "LIST_INSTRUCTIONS")
                , root_1);

                // src/parser/Music.g:72:46: ( inst )*
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
    // src/parser/Music.g:75:1: list_music_inst : ( music_inst )* -> ^( LIST_MUSIC_INST ( music_inst )* ) ;
    public final MusicParser.list_music_inst_return list_music_inst() throws RecognitionException {
        MusicParser.list_music_inst_return retval = new MusicParser.list_music_inst_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        MusicParser.music_inst_return music_inst40 =null;


        RewriteRuleSubtreeStream stream_music_inst=new RewriteRuleSubtreeStream(adaptor,"rule music_inst");
        try {
            // src/parser/Music.g:75:17: ( ( music_inst )* -> ^( LIST_MUSIC_INST ( music_inst )* ) )
            // src/parser/Music.g:75:21: ( music_inst )*
            {
            // src/parser/Music.g:75:21: ( music_inst )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0 >= BEMOL && LA9_0 <= BOOL)||LA9_0==CHORD||LA9_0==DECR||LA9_0==FOR||(LA9_0 >= ID && LA9_0 <= INCR)||LA9_0==INT||LA9_0==LETTER_X||LA9_0==NOTE||LA9_0==NOTE_TYPE||LA9_0==SONG||LA9_0==SUSTAIN||LA9_0==WHILE||LA9_0==83) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // src/parser/Music.g:75:21: music_inst
            	    {
            	    pushFollow(FOLLOW_music_inst_in_list_music_inst664);
            	    music_inst40=music_inst();

            	    state._fsp--;

            	    stream_music_inst.add(music_inst40.getTree());

            	    }
            	    break;

            	default :
            	    break loop9;
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
            // 75:33: -> ^( LIST_MUSIC_INST ( music_inst )* )
            {
                // src/parser/Music.g:75:36: ^( LIST_MUSIC_INST ( music_inst )* )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(LIST_MUSIC_INST, "LIST_MUSIC_INST")
                , root_1);

                // src/parser/Music.g:75:54: ( music_inst )*
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
    // src/parser/Music.g:78:1: inst : ( declaration | var_access | tone | beat | speed | instrument | assignation | while_stmt | funcall | for_stmt | if_stmt | song | compas_list );
    public final MusicParser.inst_return inst() throws RecognitionException {
        MusicParser.inst_return retval = new MusicParser.inst_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        MusicParser.declaration_return declaration41 =null;

        MusicParser.var_access_return var_access42 =null;

        MusicParser.tone_return tone43 =null;

        MusicParser.beat_return beat44 =null;

        MusicParser.speed_return speed45 =null;

        MusicParser.instrument_return instrument46 =null;

        MusicParser.assignation_return assignation47 =null;

        MusicParser.while_stmt_return while_stmt48 =null;

        MusicParser.funcall_return funcall49 =null;

        MusicParser.for_stmt_return for_stmt50 =null;

        MusicParser.if_stmt_return if_stmt51 =null;

        MusicParser.song_return song52 =null;

        MusicParser.compas_list_return compas_list53 =null;



        try {
            // src/parser/Music.g:78:13: ( declaration | var_access | tone | beat | speed | instrument | assignation | while_stmt | funcall | for_stmt | if_stmt | song | compas_list )
            int alt10=13;
            switch ( input.LA(1) ) {
            case BOOL:
            case CHORD:
            case INT:
            case NOTE_TYPE:
                {
                alt10=1;
                }
                break;
            case ID:
            case LETTER_X:
                {
                switch ( input.LA(2) ) {
                case 86:
                    {
                    alt10=2;
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
                    alt10=7;
                    }
                    break;
                case 83:
                    {
                    alt10=9;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 2, input);

                    throw nvae;

                }

                }
                break;
            case TONE:
                {
                alt10=3;
                }
                break;
            case BEAT:
                {
                alt10=4;
                }
                break;
            case SPEED:
                {
                alt10=5;
                }
                break;
            case INSTRUMENT:
                {
                alt10=6;
                }
                break;
            case DECR:
            case INCR:
                {
                alt10=7;
                }
                break;
            case WHILE:
                {
                alt10=8;
                }
                break;
            case FOR:
                {
                alt10=10;
                }
                break;
            case IF:
                {
                alt10=11;
                }
                break;
            case SONG:
                {
                alt10=12;
                }
                break;
            case DOUBLE_BAR:
            case NUM:
            case START_REPETITION:
                {
                alt10=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }

            switch (alt10) {
                case 1 :
                    // src/parser/Music.g:78:17: declaration
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_declaration_in_inst708);
                    declaration41=declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, declaration41.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:79:17: var_access
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_var_access_in_inst726);
                    var_access42=var_access();

                    state._fsp--;

                    adaptor.addChild(root_0, var_access42.getTree());

                    }
                    break;
                case 3 :
                    // src/parser/Music.g:80:17: tone
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_tone_in_inst744);
                    tone43=tone();

                    state._fsp--;

                    adaptor.addChild(root_0, tone43.getTree());

                    }
                    break;
                case 4 :
                    // src/parser/Music.g:81:17: beat
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_beat_in_inst762);
                    beat44=beat();

                    state._fsp--;

                    adaptor.addChild(root_0, beat44.getTree());

                    }
                    break;
                case 5 :
                    // src/parser/Music.g:82:17: speed
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_speed_in_inst780);
                    speed45=speed();

                    state._fsp--;

                    adaptor.addChild(root_0, speed45.getTree());

                    }
                    break;
                case 6 :
                    // src/parser/Music.g:83:17: instrument
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_instrument_in_inst798);
                    instrument46=instrument();

                    state._fsp--;

                    adaptor.addChild(root_0, instrument46.getTree());

                    }
                    break;
                case 7 :
                    // src/parser/Music.g:84:17: assignation
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_assignation_in_inst816);
                    assignation47=assignation();

                    state._fsp--;

                    adaptor.addChild(root_0, assignation47.getTree());

                    }
                    break;
                case 8 :
                    // src/parser/Music.g:85:17: while_stmt
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_while_stmt_in_inst834);
                    while_stmt48=while_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, while_stmt48.getTree());

                    }
                    break;
                case 9 :
                    // src/parser/Music.g:86:17: funcall
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_inst852);
                    funcall49=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall49.getTree());

                    }
                    break;
                case 10 :
                    // src/parser/Music.g:87:17: for_stmt
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_for_stmt_in_inst870);
                    for_stmt50=for_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, for_stmt50.getTree());

                    }
                    break;
                case 11 :
                    // src/parser/Music.g:88:17: if_stmt
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_if_stmt_in_inst888);
                    if_stmt51=if_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, if_stmt51.getTree());

                    }
                    break;
                case 12 :
                    // src/parser/Music.g:89:17: song
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_song_in_inst906);
                    song52=song();

                    state._fsp--;

                    adaptor.addChild(root_0, song52.getTree());

                    }
                    break;
                case 13 :
                    // src/parser/Music.g:90:17: compas_list
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_compas_list_in_inst924);
                    compas_list53=compas_list();

                    state._fsp--;

                    adaptor.addChild(root_0, compas_list53.getTree());

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
    // src/parser/Music.g:93:1: music_inst : ( declaration | var_access | assignation | while_music_stmt | funcall | for_music_stmt | if_music_stmt | song | ( options {greedy=true; } : notes_group )+ ( ';' !)? );
    public final MusicParser.music_inst_return music_inst() throws RecognitionException {
        MusicParser.music_inst_return retval = new MusicParser.music_inst_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal63=null;
        MusicParser.declaration_return declaration54 =null;

        MusicParser.var_access_return var_access55 =null;

        MusicParser.assignation_return assignation56 =null;

        MusicParser.while_music_stmt_return while_music_stmt57 =null;

        MusicParser.funcall_return funcall58 =null;

        MusicParser.for_music_stmt_return for_music_stmt59 =null;

        MusicParser.if_music_stmt_return if_music_stmt60 =null;

        MusicParser.song_return song61 =null;

        MusicParser.notes_group_return notes_group62 =null;


        AmlTree char_literal63_tree=null;

        try {
            // src/parser/Music.g:93:13: ( declaration | var_access | assignation | while_music_stmt | funcall | for_music_stmt | if_music_stmt | song | ( options {greedy=true; } : notes_group )+ ( ';' !)? )
            int alt13=9;
            switch ( input.LA(1) ) {
            case CHORD:
                {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==83) ) {
                    alt13=9;
                }
                else if ( (LA13_1==ID||LA13_1==LETTER_X) ) {
                    alt13=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;

                }
                }
                break;
            case ID:
            case LETTER_X:
                {
                switch ( input.LA(2) ) {
                case 86:
                    {
                    alt13=2;
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
                    alt13=3;
                    }
                    break;
                case 83:
                    {
                    alt13=5;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 2, input);

                    throw nvae;

                }

                }
                break;
            case DECR:
            case INCR:
                {
                alt13=3;
                }
                break;
            case WHILE:
                {
                alt13=4;
                }
                break;
            case FOR:
                {
                alt13=6;
                }
                break;
            case IF:
                {
                alt13=7;
                }
                break;
            case SONG:
                {
                alt13=8;
                }
                break;
            case BOOL:
            case INT:
            case NOTE_TYPE:
                {
                alt13=1;
                }
                break;
            case BEMOL:
            case NOTE:
            case SUSTAIN:
            case 83:
                {
                alt13=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }

            switch (alt13) {
                case 1 :
                    // src/parser/Music.g:93:17: declaration
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_declaration_in_music_inst948);
                    declaration54=declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, declaration54.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:94:17: var_access
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_var_access_in_music_inst966);
                    var_access55=var_access();

                    state._fsp--;

                    adaptor.addChild(root_0, var_access55.getTree());

                    }
                    break;
                case 3 :
                    // src/parser/Music.g:95:17: assignation
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_assignation_in_music_inst984);
                    assignation56=assignation();

                    state._fsp--;

                    adaptor.addChild(root_0, assignation56.getTree());

                    }
                    break;
                case 4 :
                    // src/parser/Music.g:96:17: while_music_stmt
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_while_music_stmt_in_music_inst1002);
                    while_music_stmt57=while_music_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, while_music_stmt57.getTree());

                    }
                    break;
                case 5 :
                    // src/parser/Music.g:97:17: funcall
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_music_inst1020);
                    funcall58=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall58.getTree());

                    }
                    break;
                case 6 :
                    // src/parser/Music.g:98:17: for_music_stmt
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_for_music_stmt_in_music_inst1038);
                    for_music_stmt59=for_music_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, for_music_stmt59.getTree());

                    }
                    break;
                case 7 :
                    // src/parser/Music.g:99:17: if_music_stmt
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_if_music_stmt_in_music_inst1056);
                    if_music_stmt60=if_music_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, if_music_stmt60.getTree());

                    }
                    break;
                case 8 :
                    // src/parser/Music.g:100:17: song
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_song_in_music_inst1074);
                    song61=song();

                    state._fsp--;

                    adaptor.addChild(root_0, song61.getTree());

                    }
                    break;
                case 9 :
                    // src/parser/Music.g:101:16: ( options {greedy=true; } : notes_group )+ ( ';' !)?
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    // src/parser/Music.g:101:16: ( options {greedy=true; } : notes_group )+
                    int cnt11=0;
                    loop11:
                    do {
                        int alt11=2;
                        switch ( input.LA(1) ) {
                        case CHORD:
                            {
                            alt11=1;
                            }
                            break;
                        case 83:
                            {
                            alt11=1;
                            }
                            break;
                        case BEMOL:
                        case SUSTAIN:
                            {
                            alt11=1;
                            }
                            break;
                        case NOTE:
                            {
                            alt11=1;
                            }
                            break;

                        }

                        switch (alt11) {
                    	case 1 :
                    	    // src/parser/Music.g:101:42: notes_group
                    	    {
                    	    pushFollow(FOLLOW_notes_group_in_music_inst1101);
                    	    notes_group62=notes_group();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, notes_group62.getTree());

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


                    // src/parser/Music.g:101:59: ( ';' !)?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==88) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // src/parser/Music.g:101:59: ';' !
                            {
                            char_literal63=(Token)match(input,88,FOLLOW_88_in_music_inst1105); 

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
    // src/parser/Music.g:104:1: declaration : type ^ assig_opt ( ',' ! assig_opt )* ';' !;
    public final MusicParser.declaration_return declaration() throws RecognitionException {
        MusicParser.declaration_return retval = new MusicParser.declaration_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal66=null;
        Token char_literal68=null;
        MusicParser.type_return type64 =null;

        MusicParser.assig_opt_return assig_opt65 =null;

        MusicParser.assig_opt_return assig_opt67 =null;


        AmlTree char_literal66_tree=null;
        AmlTree char_literal68_tree=null;

        try {
            // src/parser/Music.g:104:13: ( type ^ assig_opt ( ',' ! assig_opt )* ';' !)
            // src/parser/Music.g:104:17: type ^ assig_opt ( ',' ! assig_opt )* ';' !
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_type_in_declaration1130);
            type64=type();

            state._fsp--;

            root_0 = (AmlTree)adaptor.becomeRoot(type64.getTree(), root_0);

            pushFollow(FOLLOW_assig_opt_in_declaration1133);
            assig_opt65=assig_opt();

            state._fsp--;

            adaptor.addChild(root_0, assig_opt65.getTree());

            // src/parser/Music.g:104:33: ( ',' ! assig_opt )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==85) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // src/parser/Music.g:104:34: ',' ! assig_opt
            	    {
            	    char_literal66=(Token)match(input,85,FOLLOW_85_in_declaration1136); 

            	    pushFollow(FOLLOW_assig_opt_in_declaration1139);
            	    assig_opt67=assig_opt();

            	    state._fsp--;

            	    adaptor.addChild(root_0, assig_opt67.getTree());

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            char_literal68=(Token)match(input,88,FOLLOW_88_in_declaration1143); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:107:1: type : ( INT | BOOL | NOTE_TYPE | CHORD );
    public final MusicParser.type_return type() throws RecognitionException {
        MusicParser.type_return retval = new MusicParser.type_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token set69=null;

        AmlTree set69_tree=null;

        try {
            // src/parser/Music.g:107:13: ( INT | BOOL | NOTE_TYPE | CHORD )
            // src/parser/Music.g:
            {
            root_0 = (AmlTree)adaptor.nil();


            set69=(Token)input.LT(1);

            if ( input.LA(1)==BOOL||input.LA(1)==CHORD||input.LA(1)==INT||input.LA(1)==NOTE_TYPE ) {
                input.consume();
                adaptor.addChild(root_0, 
                (AmlTree)adaptor.create(set69)
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
    // src/parser/Music.g:112:1: type_void : ( type | VOID );
    public final MusicParser.type_void_return type_void() throws RecognitionException {
        MusicParser.type_void_return retval = new MusicParser.type_void_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token VOID71=null;
        MusicParser.type_return type70 =null;


        AmlTree VOID71_tree=null;

        try {
            // src/parser/Music.g:112:13: ( type | VOID )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==BOOL||LA15_0==CHORD||LA15_0==INT||LA15_0==NOTE_TYPE) ) {
                alt15=1;
            }
            else if ( (LA15_0==VOID) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }
            switch (alt15) {
                case 1 :
                    // src/parser/Music.g:112:17: type
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_type_in_type_void1252);
                    type70=type();

                    state._fsp--;

                    adaptor.addChild(root_0, type70.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:113:17: VOID
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    VOID71=(Token)match(input,VOID,FOLLOW_VOID_in_type_void1270); 
                    VOID71_tree = 
                    (AmlTree)adaptor.create(VOID71)
                    ;
                    adaptor.addChild(root_0, VOID71_tree);


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
    // src/parser/Music.g:116:1: assig_opt : id_rule ( ASSIG ^ ( expr | notes_variable ) )? ;
    public final MusicParser.assig_opt_return assig_opt() throws RecognitionException {
        MusicParser.assig_opt_return retval = new MusicParser.assig_opt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token ASSIG73=null;
        MusicParser.id_rule_return id_rule72 =null;

        MusicParser.expr_return expr74 =null;

        MusicParser.notes_variable_return notes_variable75 =null;


        AmlTree ASSIG73_tree=null;

        try {
            // src/parser/Music.g:116:13: ( id_rule ( ASSIG ^ ( expr | notes_variable ) )? )
            // src/parser/Music.g:116:17: id_rule ( ASSIG ^ ( expr | notes_variable ) )?
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_id_rule_in_assig_opt1295);
            id_rule72=id_rule();

            state._fsp--;

            adaptor.addChild(root_0, id_rule72.getTree());

            // src/parser/Music.g:116:25: ( ASSIG ^ ( expr | notes_variable ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==ASSIG) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // src/parser/Music.g:116:26: ASSIG ^ ( expr | notes_variable )
                    {
                    ASSIG73=(Token)match(input,ASSIG,FOLLOW_ASSIG_in_assig_opt1298); 
                    ASSIG73_tree = 
                    (AmlTree)adaptor.create(ASSIG73)
                    ;
                    root_0 = (AmlTree)adaptor.becomeRoot(ASSIG73_tree, root_0);


                    // src/parser/Music.g:116:33: ( expr | notes_variable )
                    int alt16=2;
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
                        alt16=1;
                        }
                        break;
                    case 83:
                        {
                        int LA16_2 = input.LA(2);

                        if ( (LA16_2==FALSE||LA16_2==ID||LA16_2==LETTER_X||LA16_2==MINUS||LA16_2==NOT||LA16_2==NUM||LA16_2==PLUS||LA16_2==TRUE||LA16_2==83) ) {
                            alt16=1;
                        }
                        else if ( (LA16_2==BEMOL||LA16_2==NOTE||LA16_2==SUSTAIN) ) {
                            alt16=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 16, 2, input);

                            throw nvae;

                        }
                        }
                        break;
                    case BEMOL:
                    case CHORD:
                    case NOTE:
                    case SUSTAIN:
                        {
                        alt16=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 0, input);

                        throw nvae;

                    }

                    switch (alt16) {
                        case 1 :
                            // src/parser/Music.g:116:34: expr
                            {
                            pushFollow(FOLLOW_expr_in_assig_opt1302);
                            expr74=expr();

                            state._fsp--;

                            adaptor.addChild(root_0, expr74.getTree());

                            }
                            break;
                        case 2 :
                            // src/parser/Music.g:116:41: notes_variable
                            {
                            pushFollow(FOLLOW_notes_variable_in_assig_opt1306);
                            notes_variable75=notes_variable();

                            state._fsp--;

                            adaptor.addChild(root_0, notes_variable75.getTree());

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
    // src/parser/Music.g:119:1: assignation : assig ';' !;
    public final MusicParser.assignation_return assignation() throws RecognitionException {
        MusicParser.assignation_return retval = new MusicParser.assignation_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal77=null;
        MusicParser.assig_return assig76 =null;


        AmlTree char_literal77_tree=null;

        try {
            // src/parser/Music.g:119:13: ( assig ';' !)
            // src/parser/Music.g:119:17: assig ';' !
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_assig_in_assignation1332);
            assig76=assig();

            state._fsp--;

            adaptor.addChild(root_0, assig76.getTree());

            char_literal77=(Token)match(input,88,FOLLOW_88_in_assignation1334); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:122:1: assig : ( id_rule ( ASSIG | PLUS_ASSIG | MINUS_ASSIG | PROD_ASSIG | DIVIDE_ASSIG | MOD_ASSIG ) ^ ( expr | notes_variable ) | post | pre );
    public final MusicParser.assig_return assig() throws RecognitionException {
        MusicParser.assig_return retval = new MusicParser.assig_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token set79=null;
        MusicParser.id_rule_return id_rule78 =null;

        MusicParser.expr_return expr80 =null;

        MusicParser.notes_variable_return notes_variable81 =null;

        MusicParser.post_return post82 =null;

        MusicParser.pre_return pre83 =null;


        AmlTree set79_tree=null;

        try {
            // src/parser/Music.g:122:13: ( id_rule ( ASSIG | PLUS_ASSIG | MINUS_ASSIG | PROD_ASSIG | DIVIDE_ASSIG | MOD_ASSIG ) ^ ( expr | notes_variable ) | post | pre )
            int alt19=3;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==ID||LA19_0==LETTER_X) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==ASSIG||LA19_1==DIVIDE_ASSIG||LA19_1==MINUS_ASSIG||LA19_1==MOD_ASSIG||LA19_1==PLUS_ASSIG||LA19_1==PROD_ASSIG) ) {
                    alt19=1;
                }
                else if ( (LA19_1==DECR||LA19_1==INCR) ) {
                    alt19=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA19_0==DECR||LA19_0==INCR) ) {
                alt19=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }
            switch (alt19) {
                case 1 :
                    // src/parser/Music.g:122:17: id_rule ( ASSIG | PLUS_ASSIG | MINUS_ASSIG | PROD_ASSIG | DIVIDE_ASSIG | MOD_ASSIG ) ^ ( expr | notes_variable )
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_id_rule_in_assig1364);
                    id_rule78=id_rule();

                    state._fsp--;

                    adaptor.addChild(root_0, id_rule78.getTree());

                    set79=(Token)input.LT(1);

                    set79=(Token)input.LT(1);

                    if ( input.LA(1)==ASSIG||input.LA(1)==DIVIDE_ASSIG||input.LA(1)==MINUS_ASSIG||input.LA(1)==MOD_ASSIG||input.LA(1)==PLUS_ASSIG||input.LA(1)==PROD_ASSIG ) {
                        input.consume();
                        root_0 = (AmlTree)adaptor.becomeRoot(
                        (AmlTree)adaptor.create(set79)
                        , root_0);
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    // src/parser/Music.g:122:91: ( expr | notes_variable )
                    int alt18=2;
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
                        alt18=1;
                        }
                        break;
                    case 83:
                        {
                        int LA18_2 = input.LA(2);

                        if ( (LA18_2==FALSE||LA18_2==ID||LA18_2==LETTER_X||LA18_2==MINUS||LA18_2==NOT||LA18_2==NUM||LA18_2==PLUS||LA18_2==TRUE||LA18_2==83) ) {
                            alt18=1;
                        }
                        else if ( (LA18_2==BEMOL||LA18_2==NOTE||LA18_2==SUSTAIN) ) {
                            alt18=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 18, 2, input);

                            throw nvae;

                        }
                        }
                        break;
                    case BEMOL:
                    case CHORD:
                    case NOTE:
                    case SUSTAIN:
                        {
                        alt18=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 0, input);

                        throw nvae;

                    }

                    switch (alt18) {
                        case 1 :
                            // src/parser/Music.g:122:92: expr
                            {
                            pushFollow(FOLLOW_expr_in_assig1382);
                            expr80=expr();

                            state._fsp--;

                            adaptor.addChild(root_0, expr80.getTree());

                            }
                            break;
                        case 2 :
                            // src/parser/Music.g:122:99: notes_variable
                            {
                            pushFollow(FOLLOW_notes_variable_in_assig1386);
                            notes_variable81=notes_variable();

                            state._fsp--;

                            adaptor.addChild(root_0, notes_variable81.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // src/parser/Music.g:123:17: post
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_post_in_assig1405);
                    post82=post();

                    state._fsp--;

                    adaptor.addChild(root_0, post82.getTree());

                    }
                    break;
                case 3 :
                    // src/parser/Music.g:124:17: pre
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_pre_in_assig1423);
                    pre83=pre();

                    state._fsp--;

                    adaptor.addChild(root_0, pre83.getTree());

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
    // src/parser/Music.g:127:1: post : id_rule (x= INCR |x= DECR ) -> ^( POST id_rule $x) ;
    public final MusicParser.post_return post() throws RecognitionException {
        MusicParser.post_return retval = new MusicParser.post_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token x=null;
        MusicParser.id_rule_return id_rule84 =null;


        AmlTree x_tree=null;
        RewriteRuleTokenStream stream_DECR=new RewriteRuleTokenStream(adaptor,"token DECR");
        RewriteRuleTokenStream stream_INCR=new RewriteRuleTokenStream(adaptor,"token INCR");
        RewriteRuleSubtreeStream stream_id_rule=new RewriteRuleSubtreeStream(adaptor,"rule id_rule");
        try {
            // src/parser/Music.g:127:13: ( id_rule (x= INCR |x= DECR ) -> ^( POST id_rule $x) )
            // src/parser/Music.g:127:17: id_rule (x= INCR |x= DECR )
            {
            pushFollow(FOLLOW_id_rule_in_post1453);
            id_rule84=id_rule();

            state._fsp--;

            stream_id_rule.add(id_rule84.getTree());

            // src/parser/Music.g:127:25: (x= INCR |x= DECR )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==INCR) ) {
                alt20=1;
            }
            else if ( (LA20_0==DECR) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }
            switch (alt20) {
                case 1 :
                    // src/parser/Music.g:127:26: x= INCR
                    {
                    x=(Token)match(input,INCR,FOLLOW_INCR_in_post1458);  
                    stream_INCR.add(x);


                    }
                    break;
                case 2 :
                    // src/parser/Music.g:127:35: x= DECR
                    {
                    x=(Token)match(input,DECR,FOLLOW_DECR_in_post1464);  
                    stream_DECR.add(x);


                    }
                    break;

            }


            // AST REWRITE
            // elements: x, id_rule
            // token labels: x
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_x=new RewriteRuleTokenStream(adaptor,"token x",x);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AmlTree)adaptor.nil();
            // 127:43: -> ^( POST id_rule $x)
            {
                // src/parser/Music.g:127:47: ^( POST id_rule $x)
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(POST, "POST")
                , root_1);

                adaptor.addChild(root_1, stream_id_rule.nextTree());

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
    // src/parser/Music.g:130:1: pre : (x= INCR |x= DECR ) id_rule -> ^( PRE id_rule $x) ;
    public final MusicParser.pre_return pre() throws RecognitionException {
        MusicParser.pre_return retval = new MusicParser.pre_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token x=null;
        MusicParser.id_rule_return id_rule85 =null;


        AmlTree x_tree=null;
        RewriteRuleTokenStream stream_DECR=new RewriteRuleTokenStream(adaptor,"token DECR");
        RewriteRuleTokenStream stream_INCR=new RewriteRuleTokenStream(adaptor,"token INCR");
        RewriteRuleSubtreeStream stream_id_rule=new RewriteRuleSubtreeStream(adaptor,"rule id_rule");
        try {
            // src/parser/Music.g:130:13: ( (x= INCR |x= DECR ) id_rule -> ^( PRE id_rule $x) )
            // src/parser/Music.g:130:17: (x= INCR |x= DECR ) id_rule
            {
            // src/parser/Music.g:130:17: (x= INCR |x= DECR )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==INCR) ) {
                alt21=1;
            }
            else if ( (LA21_0==DECR) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }
            switch (alt21) {
                case 1 :
                    // src/parser/Music.g:130:18: x= INCR
                    {
                    x=(Token)match(input,INCR,FOLLOW_INCR_in_pre1511);  
                    stream_INCR.add(x);


                    }
                    break;
                case 2 :
                    // src/parser/Music.g:130:27: x= DECR
                    {
                    x=(Token)match(input,DECR,FOLLOW_DECR_in_pre1517);  
                    stream_DECR.add(x);


                    }
                    break;

            }


            pushFollow(FOLLOW_id_rule_in_pre1520);
            id_rule85=id_rule();

            state._fsp--;

            stream_id_rule.add(id_rule85.getTree());

            // AST REWRITE
            // elements: x, id_rule
            // token labels: x
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_x=new RewriteRuleTokenStream(adaptor,"token x",x);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AmlTree)adaptor.nil();
            // 130:44: -> ^( PRE id_rule $x)
            {
                // src/parser/Music.g:130:47: ^( PRE id_rule $x)
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(PRE, "PRE")
                , root_1);

                adaptor.addChild(root_1, stream_id_rule.nextTree());

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
    // src/parser/Music.g:133:1: beat : BEAT ^ NUM ':' ! NUM ;
    public final MusicParser.beat_return beat() throws RecognitionException {
        MusicParser.beat_return retval = new MusicParser.beat_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token BEAT86=null;
        Token NUM87=null;
        Token char_literal88=null;
        Token NUM89=null;

        AmlTree BEAT86_tree=null;
        AmlTree NUM87_tree=null;
        AmlTree char_literal88_tree=null;
        AmlTree NUM89_tree=null;

        try {
            // src/parser/Music.g:133:13: ( BEAT ^ NUM ':' ! NUM )
            // src/parser/Music.g:133:17: BEAT ^ NUM ':' ! NUM
            {
            root_0 = (AmlTree)adaptor.nil();


            BEAT86=(Token)match(input,BEAT,FOLLOW_BEAT_in_beat1563); 
            BEAT86_tree = 
            (AmlTree)adaptor.create(BEAT86)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(BEAT86_tree, root_0);


            NUM87=(Token)match(input,NUM,FOLLOW_NUM_in_beat1566); 
            NUM87_tree = 
            (AmlTree)adaptor.create(NUM87)
            ;
            adaptor.addChild(root_0, NUM87_tree);


            char_literal88=(Token)match(input,87,FOLLOW_87_in_beat1568); 

            NUM89=(Token)match(input,NUM,FOLLOW_NUM_in_beat1571); 
            NUM89_tree = 
            (AmlTree)adaptor.create(NUM89)
            ;
            adaptor.addChild(root_0, NUM89_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:136:1: speed : SPEED ^ NUM ;
    public final MusicParser.speed_return speed() throws RecognitionException {
        MusicParser.speed_return retval = new MusicParser.speed_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token SPEED90=null;
        Token NUM91=null;

        AmlTree SPEED90_tree=null;
        AmlTree NUM91_tree=null;

        try {
            // src/parser/Music.g:136:13: ( SPEED ^ NUM )
            // src/parser/Music.g:136:17: SPEED ^ NUM
            {
            root_0 = (AmlTree)adaptor.nil();


            SPEED90=(Token)match(input,SPEED,FOLLOW_SPEED_in_speed1600); 
            SPEED90_tree = 
            (AmlTree)adaptor.create(SPEED90)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(SPEED90_tree, root_0);


            NUM91=(Token)match(input,NUM,FOLLOW_NUM_in_speed1603); 
            NUM91_tree = 
            (AmlTree)adaptor.create(NUM91)
            ;
            adaptor.addChild(root_0, NUM91_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:139:1: transport : TRANSPORT ^ NUM ;
    public final MusicParser.transport_return transport() throws RecognitionException {
        MusicParser.transport_return retval = new MusicParser.transport_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token TRANSPORT92=null;
        Token NUM93=null;

        AmlTree TRANSPORT92_tree=null;
        AmlTree NUM93_tree=null;

        try {
            // src/parser/Music.g:139:13: ( TRANSPORT ^ NUM )
            // src/parser/Music.g:139:17: TRANSPORT ^ NUM
            {
            root_0 = (AmlTree)adaptor.nil();


            TRANSPORT92=(Token)match(input,TRANSPORT,FOLLOW_TRANSPORT_in_transport1628); 
            TRANSPORT92_tree = 
            (AmlTree)adaptor.create(TRANSPORT92)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(TRANSPORT92_tree, root_0);


            NUM93=(Token)match(input,NUM,FOLLOW_NUM_in_transport1631); 
            NUM93_tree = 
            (AmlTree)adaptor.create(NUM93)
            ;
            adaptor.addChild(root_0, NUM93_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:142:1: instrument : INSTRUMENT ^ STRING ;
    public final MusicParser.instrument_return instrument() throws RecognitionException {
        MusicParser.instrument_return retval = new MusicParser.instrument_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token INSTRUMENT94=null;
        Token STRING95=null;

        AmlTree INSTRUMENT94_tree=null;
        AmlTree STRING95_tree=null;

        try {
            // src/parser/Music.g:142:13: ( INSTRUMENT ^ STRING )
            // src/parser/Music.g:142:17: INSTRUMENT ^ STRING
            {
            root_0 = (AmlTree)adaptor.nil();


            INSTRUMENT94=(Token)match(input,INSTRUMENT,FOLLOW_INSTRUMENT_in_instrument1655); 
            INSTRUMENT94_tree = 
            (AmlTree)adaptor.create(INSTRUMENT94)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(INSTRUMENT94_tree, root_0);


            STRING95=(Token)match(input,STRING,FOLLOW_STRING_in_instrument1658); 
            STRING95_tree = 
            (AmlTree)adaptor.create(STRING95)
            ;
            adaptor.addChild(root_0, STRING95_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:145:1: while_stmt : WHILE ^ '(' ! expr ')' ! '{' ! listInst '}' !;
    public final MusicParser.while_stmt_return while_stmt() throws RecognitionException {
        MusicParser.while_stmt_return retval = new MusicParser.while_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token WHILE96=null;
        Token char_literal97=null;
        Token char_literal99=null;
        Token char_literal100=null;
        Token char_literal102=null;
        MusicParser.expr_return expr98 =null;

        MusicParser.listInst_return listInst101 =null;


        AmlTree WHILE96_tree=null;
        AmlTree char_literal97_tree=null;
        AmlTree char_literal99_tree=null;
        AmlTree char_literal100_tree=null;
        AmlTree char_literal102_tree=null;

        try {
            // src/parser/Music.g:145:13: ( WHILE ^ '(' ! expr ')' ! '{' ! listInst '}' !)
            // src/parser/Music.g:145:17: WHILE ^ '(' ! expr ')' ! '{' ! listInst '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            WHILE96=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_stmt1682); 
            WHILE96_tree = 
            (AmlTree)adaptor.create(WHILE96)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(WHILE96_tree, root_0);


            char_literal97=(Token)match(input,83,FOLLOW_83_in_while_stmt1685); 

            pushFollow(FOLLOW_expr_in_while_stmt1688);
            expr98=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr98.getTree());

            char_literal99=(Token)match(input,84,FOLLOW_84_in_while_stmt1690); 

            char_literal100=(Token)match(input,89,FOLLOW_89_in_while_stmt1693); 

            pushFollow(FOLLOW_listInst_in_while_stmt1696);
            listInst101=listInst();

            state._fsp--;

            adaptor.addChild(root_0, listInst101.getTree());

            char_literal102=(Token)match(input,90,FOLLOW_90_in_while_stmt1698); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:148:1: while_music_stmt : WHILE ^ '(' ! expr ')' ! '{' ! list_music_inst '}' !;
    public final MusicParser.while_music_stmt_return while_music_stmt() throws RecognitionException {
        MusicParser.while_music_stmt_return retval = new MusicParser.while_music_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token WHILE103=null;
        Token char_literal104=null;
        Token char_literal106=null;
        Token char_literal107=null;
        Token char_literal109=null;
        MusicParser.expr_return expr105 =null;

        MusicParser.list_music_inst_return list_music_inst108 =null;


        AmlTree WHILE103_tree=null;
        AmlTree char_literal104_tree=null;
        AmlTree char_literal106_tree=null;
        AmlTree char_literal107_tree=null;
        AmlTree char_literal109_tree=null;

        try {
            // src/parser/Music.g:148:21: ( WHILE ^ '(' ! expr ')' ! '{' ! list_music_inst '}' !)
            // src/parser/Music.g:148:25: WHILE ^ '(' ! expr ')' ! '{' ! list_music_inst '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            WHILE103=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_music_stmt1725); 
            WHILE103_tree = 
            (AmlTree)adaptor.create(WHILE103)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(WHILE103_tree, root_0);


            char_literal104=(Token)match(input,83,FOLLOW_83_in_while_music_stmt1728); 

            pushFollow(FOLLOW_expr_in_while_music_stmt1731);
            expr105=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr105.getTree());

            char_literal106=(Token)match(input,84,FOLLOW_84_in_while_music_stmt1733); 

            char_literal107=(Token)match(input,89,FOLLOW_89_in_while_music_stmt1736); 

            pushFollow(FOLLOW_list_music_inst_in_while_music_stmt1739);
            list_music_inst108=list_music_inst();

            state._fsp--;

            adaptor.addChild(root_0, list_music_inst108.getTree());

            char_literal109=(Token)match(input,90,FOLLOW_90_in_while_music_stmt1741); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:151:1: for_stmt : FOR ^ '(' ! ( declaration | list_assig ';' !) expr ';' ! list_assig ')' ! '{' ! listInst '}' !;
    public final MusicParser.for_stmt_return for_stmt() throws RecognitionException {
        MusicParser.for_stmt_return retval = new MusicParser.for_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token FOR110=null;
        Token char_literal111=null;
        Token char_literal114=null;
        Token char_literal116=null;
        Token char_literal118=null;
        Token char_literal119=null;
        Token char_literal121=null;
        MusicParser.declaration_return declaration112 =null;

        MusicParser.list_assig_return list_assig113 =null;

        MusicParser.expr_return expr115 =null;

        MusicParser.list_assig_return list_assig117 =null;

        MusicParser.listInst_return listInst120 =null;


        AmlTree FOR110_tree=null;
        AmlTree char_literal111_tree=null;
        AmlTree char_literal114_tree=null;
        AmlTree char_literal116_tree=null;
        AmlTree char_literal118_tree=null;
        AmlTree char_literal119_tree=null;
        AmlTree char_literal121_tree=null;

        try {
            // src/parser/Music.g:151:13: ( FOR ^ '(' ! ( declaration | list_assig ';' !) expr ';' ! list_assig ')' ! '{' ! listInst '}' !)
            // src/parser/Music.g:151:17: FOR ^ '(' ! ( declaration | list_assig ';' !) expr ';' ! list_assig ')' ! '{' ! listInst '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            FOR110=(Token)match(input,FOR,FOLLOW_FOR_in_for_stmt1776); 
            FOR110_tree = 
            (AmlTree)adaptor.create(FOR110)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(FOR110_tree, root_0);


            char_literal111=(Token)match(input,83,FOLLOW_83_in_for_stmt1779); 

            // src/parser/Music.g:151:27: ( declaration | list_assig ';' !)
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==BOOL||LA22_0==CHORD||LA22_0==INT||LA22_0==NOTE_TYPE) ) {
                alt22=1;
            }
            else if ( (LA22_0==DECR||LA22_0==ID||LA22_0==INCR||LA22_0==LETTER_X) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }
            switch (alt22) {
                case 1 :
                    // src/parser/Music.g:151:28: declaration
                    {
                    pushFollow(FOLLOW_declaration_in_for_stmt1783);
                    declaration112=declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, declaration112.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:151:42: list_assig ';' !
                    {
                    pushFollow(FOLLOW_list_assig_in_for_stmt1787);
                    list_assig113=list_assig();

                    state._fsp--;

                    adaptor.addChild(root_0, list_assig113.getTree());

                    char_literal114=(Token)match(input,88,FOLLOW_88_in_for_stmt1789); 

                    }
                    break;

            }


            pushFollow(FOLLOW_expr_in_for_stmt1793);
            expr115=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr115.getTree());

            char_literal116=(Token)match(input,88,FOLLOW_88_in_for_stmt1795); 

            pushFollow(FOLLOW_list_assig_in_for_stmt1798);
            list_assig117=list_assig();

            state._fsp--;

            adaptor.addChild(root_0, list_assig117.getTree());

            char_literal118=(Token)match(input,84,FOLLOW_84_in_for_stmt1800); 

            char_literal119=(Token)match(input,89,FOLLOW_89_in_for_stmt1803); 

            pushFollow(FOLLOW_listInst_in_for_stmt1806);
            listInst120=listInst();

            state._fsp--;

            adaptor.addChild(root_0, listInst120.getTree());

            char_literal121=(Token)match(input,90,FOLLOW_90_in_for_stmt1808); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:154:1: for_music_stmt : FOR ^ '(' ! ( declaration | list_assig ';' !) expr ';' ! list_assig ')' ! '{' ! list_music_inst '}' !;
    public final MusicParser.for_music_stmt_return for_music_stmt() throws RecognitionException {
        MusicParser.for_music_stmt_return retval = new MusicParser.for_music_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token FOR122=null;
        Token char_literal123=null;
        Token char_literal126=null;
        Token char_literal128=null;
        Token char_literal130=null;
        Token char_literal131=null;
        Token char_literal133=null;
        MusicParser.declaration_return declaration124 =null;

        MusicParser.list_assig_return list_assig125 =null;

        MusicParser.expr_return expr127 =null;

        MusicParser.list_assig_return list_assig129 =null;

        MusicParser.list_music_inst_return list_music_inst132 =null;


        AmlTree FOR122_tree=null;
        AmlTree char_literal123_tree=null;
        AmlTree char_literal126_tree=null;
        AmlTree char_literal128_tree=null;
        AmlTree char_literal130_tree=null;
        AmlTree char_literal131_tree=null;
        AmlTree char_literal133_tree=null;

        try {
            // src/parser/Music.g:154:17: ( FOR ^ '(' ! ( declaration | list_assig ';' !) expr ';' ! list_assig ')' ! '{' ! list_music_inst '}' !)
            // src/parser/Music.g:154:21: FOR ^ '(' ! ( declaration | list_assig ';' !) expr ';' ! list_assig ')' ! '{' ! list_music_inst '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            FOR122=(Token)match(input,FOR,FOLLOW_FOR_in_for_music_stmt1833); 
            FOR122_tree = 
            (AmlTree)adaptor.create(FOR122)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(FOR122_tree, root_0);


            char_literal123=(Token)match(input,83,FOLLOW_83_in_for_music_stmt1836); 

            // src/parser/Music.g:154:31: ( declaration | list_assig ';' !)
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==BOOL||LA23_0==CHORD||LA23_0==INT||LA23_0==NOTE_TYPE) ) {
                alt23=1;
            }
            else if ( (LA23_0==DECR||LA23_0==ID||LA23_0==INCR||LA23_0==LETTER_X) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }
            switch (alt23) {
                case 1 :
                    // src/parser/Music.g:154:32: declaration
                    {
                    pushFollow(FOLLOW_declaration_in_for_music_stmt1840);
                    declaration124=declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, declaration124.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:154:46: list_assig ';' !
                    {
                    pushFollow(FOLLOW_list_assig_in_for_music_stmt1844);
                    list_assig125=list_assig();

                    state._fsp--;

                    adaptor.addChild(root_0, list_assig125.getTree());

                    char_literal126=(Token)match(input,88,FOLLOW_88_in_for_music_stmt1846); 

                    }
                    break;

            }


            pushFollow(FOLLOW_expr_in_for_music_stmt1850);
            expr127=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr127.getTree());

            char_literal128=(Token)match(input,88,FOLLOW_88_in_for_music_stmt1852); 

            pushFollow(FOLLOW_list_assig_in_for_music_stmt1855);
            list_assig129=list_assig();

            state._fsp--;

            adaptor.addChild(root_0, list_assig129.getTree());

            char_literal130=(Token)match(input,84,FOLLOW_84_in_for_music_stmt1857); 

            char_literal131=(Token)match(input,89,FOLLOW_89_in_for_music_stmt1860); 

            pushFollow(FOLLOW_list_music_inst_in_for_music_stmt1863);
            list_music_inst132=list_music_inst();

            state._fsp--;

            adaptor.addChild(root_0, list_music_inst132.getTree());

            char_literal133=(Token)match(input,90,FOLLOW_90_in_for_music_stmt1865); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:157:1: list_assig : assig ( ',' assig )* -> ^( LIST_ASSIG ( assig )+ ) ;
    public final MusicParser.list_assig_return list_assig() throws RecognitionException {
        MusicParser.list_assig_return retval = new MusicParser.list_assig_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal135=null;
        MusicParser.assig_return assig134 =null;

        MusicParser.assig_return assig136 =null;


        AmlTree char_literal135_tree=null;
        RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
        RewriteRuleSubtreeStream stream_assig=new RewriteRuleSubtreeStream(adaptor,"rule assig");
        try {
            // src/parser/Music.g:157:13: ( assig ( ',' assig )* -> ^( LIST_ASSIG ( assig )+ ) )
            // src/parser/Music.g:157:17: assig ( ',' assig )*
            {
            pushFollow(FOLLOW_assig_in_list_assig1894);
            assig134=assig();

            state._fsp--;

            stream_assig.add(assig134.getTree());

            // src/parser/Music.g:157:23: ( ',' assig )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==85) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // src/parser/Music.g:157:24: ',' assig
            	    {
            	    char_literal135=(Token)match(input,85,FOLLOW_85_in_list_assig1897);  
            	    stream_85.add(char_literal135);


            	    pushFollow(FOLLOW_assig_in_list_assig1899);
            	    assig136=assig();

            	    state._fsp--;

            	    stream_assig.add(assig136.getTree());

            	    }
            	    break;

            	default :
            	    break loop24;
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
            // 157:36: -> ^( LIST_ASSIG ( assig )+ )
            {
                // src/parser/Music.g:157:39: ^( LIST_ASSIG ( assig )+ )
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
    // src/parser/Music.g:160:1: if_stmt : IF ^ '(' ! expr ')' ! '{' ! listInst '}' ! ( elseif_stmt )* ( else_stmt )? ;
    public final MusicParser.if_stmt_return if_stmt() throws RecognitionException {
        MusicParser.if_stmt_return retval = new MusicParser.if_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token IF137=null;
        Token char_literal138=null;
        Token char_literal140=null;
        Token char_literal141=null;
        Token char_literal143=null;
        MusicParser.expr_return expr139 =null;

        MusicParser.listInst_return listInst142 =null;

        MusicParser.elseif_stmt_return elseif_stmt144 =null;

        MusicParser.else_stmt_return else_stmt145 =null;


        AmlTree IF137_tree=null;
        AmlTree char_literal138_tree=null;
        AmlTree char_literal140_tree=null;
        AmlTree char_literal141_tree=null;
        AmlTree char_literal143_tree=null;

        try {
            // src/parser/Music.g:160:13: ( IF ^ '(' ! expr ')' ! '{' ! listInst '}' ! ( elseif_stmt )* ( else_stmt )? )
            // src/parser/Music.g:160:17: IF ^ '(' ! expr ')' ! '{' ! listInst '}' ! ( elseif_stmt )* ( else_stmt )?
            {
            root_0 = (AmlTree)adaptor.nil();


            IF137=(Token)match(input,IF,FOLLOW_IF_in_if_stmt1937); 
            IF137_tree = 
            (AmlTree)adaptor.create(IF137)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(IF137_tree, root_0);


            char_literal138=(Token)match(input,83,FOLLOW_83_in_if_stmt1940); 

            pushFollow(FOLLOW_expr_in_if_stmt1943);
            expr139=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr139.getTree());

            char_literal140=(Token)match(input,84,FOLLOW_84_in_if_stmt1945); 

            char_literal141=(Token)match(input,89,FOLLOW_89_in_if_stmt1948); 

            pushFollow(FOLLOW_listInst_in_if_stmt1951);
            listInst142=listInst();

            state._fsp--;

            adaptor.addChild(root_0, listInst142.getTree());

            char_literal143=(Token)match(input,90,FOLLOW_90_in_if_stmt1953); 

            // src/parser/Music.g:160:55: ( elseif_stmt )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==ELSE) ) {
                    int LA25_1 = input.LA(2);

                    if ( (LA25_1==IF) ) {
                        alt25=1;
                    }


                }


                switch (alt25) {
            	case 1 :
            	    // src/parser/Music.g:160:55: elseif_stmt
            	    {
            	    pushFollow(FOLLOW_elseif_stmt_in_if_stmt1956);
            	    elseif_stmt144=elseif_stmt();

            	    state._fsp--;

            	    adaptor.addChild(root_0, elseif_stmt144.getTree());

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            // src/parser/Music.g:160:68: ( else_stmt )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==ELSE) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // src/parser/Music.g:160:68: else_stmt
                    {
                    pushFollow(FOLLOW_else_stmt_in_if_stmt1959);
                    else_stmt145=else_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, else_stmt145.getTree());

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
    // src/parser/Music.g:163:1: elseif_stmt : ELSE IF '(' expr ')' '{' listInst '}' -> ^( ELSEIF expr listInst ) ;
    public final MusicParser.elseif_stmt_return elseif_stmt() throws RecognitionException {
        MusicParser.elseif_stmt_return retval = new MusicParser.elseif_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token ELSE146=null;
        Token IF147=null;
        Token char_literal148=null;
        Token char_literal150=null;
        Token char_literal151=null;
        Token char_literal153=null;
        MusicParser.expr_return expr149 =null;

        MusicParser.listInst_return listInst152 =null;


        AmlTree ELSE146_tree=null;
        AmlTree IF147_tree=null;
        AmlTree char_literal148_tree=null;
        AmlTree char_literal150_tree=null;
        AmlTree char_literal151_tree=null;
        AmlTree char_literal153_tree=null;
        RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
        RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");
        RewriteRuleTokenStream stream_89=new RewriteRuleTokenStream(adaptor,"token 89");
        RewriteRuleSubtreeStream stream_listInst=new RewriteRuleSubtreeStream(adaptor,"rule listInst");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // src/parser/Music.g:163:13: ( ELSE IF '(' expr ')' '{' listInst '}' -> ^( ELSEIF expr listInst ) )
            // src/parser/Music.g:163:17: ELSE IF '(' expr ')' '{' listInst '}'
            {
            ELSE146=(Token)match(input,ELSE,FOLLOW_ELSE_in_elseif_stmt1983);  
            stream_ELSE.add(ELSE146);


            IF147=(Token)match(input,IF,FOLLOW_IF_in_elseif_stmt1985);  
            stream_IF.add(IF147);


            char_literal148=(Token)match(input,83,FOLLOW_83_in_elseif_stmt1987);  
            stream_83.add(char_literal148);


            pushFollow(FOLLOW_expr_in_elseif_stmt1989);
            expr149=expr();

            state._fsp--;

            stream_expr.add(expr149.getTree());

            char_literal150=(Token)match(input,84,FOLLOW_84_in_elseif_stmt1991);  
            stream_84.add(char_literal150);


            char_literal151=(Token)match(input,89,FOLLOW_89_in_elseif_stmt1993);  
            stream_89.add(char_literal151);


            pushFollow(FOLLOW_listInst_in_elseif_stmt1995);
            listInst152=listInst();

            state._fsp--;

            stream_listInst.add(listInst152.getTree());

            char_literal153=(Token)match(input,90,FOLLOW_90_in_elseif_stmt1997);  
            stream_90.add(char_literal153);


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
            // 163:55: -> ^( ELSEIF expr listInst )
            {
                // src/parser/Music.g:163:58: ^( ELSEIF expr listInst )
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
    // src/parser/Music.g:166:1: else_stmt : ELSE ^ '{' ! listInst '}' !;
    public final MusicParser.else_stmt_return else_stmt() throws RecognitionException {
        MusicParser.else_stmt_return retval = new MusicParser.else_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token ELSE154=null;
        Token char_literal155=null;
        Token char_literal157=null;
        MusicParser.listInst_return listInst156 =null;


        AmlTree ELSE154_tree=null;
        AmlTree char_literal155_tree=null;
        AmlTree char_literal157_tree=null;

        try {
            // src/parser/Music.g:166:13: ( ELSE ^ '{' ! listInst '}' !)
            // src/parser/Music.g:166:17: ELSE ^ '{' ! listInst '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            ELSE154=(Token)match(input,ELSE,FOLLOW_ELSE_in_else_stmt2032); 
            ELSE154_tree = 
            (AmlTree)adaptor.create(ELSE154)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(ELSE154_tree, root_0);


            char_literal155=(Token)match(input,89,FOLLOW_89_in_else_stmt2035); 

            pushFollow(FOLLOW_listInst_in_else_stmt2038);
            listInst156=listInst();

            state._fsp--;

            adaptor.addChild(root_0, listInst156.getTree());

            char_literal157=(Token)match(input,90,FOLLOW_90_in_else_stmt2040); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:169:1: if_music_stmt : IF ^ '(' ! expr ')' ! '{' ! list_music_inst '}' ! ( elseif_music_stmt )* ( else_music_stmt )? ;
    public final MusicParser.if_music_stmt_return if_music_stmt() throws RecognitionException {
        MusicParser.if_music_stmt_return retval = new MusicParser.if_music_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token IF158=null;
        Token char_literal159=null;
        Token char_literal161=null;
        Token char_literal162=null;
        Token char_literal164=null;
        MusicParser.expr_return expr160 =null;

        MusicParser.list_music_inst_return list_music_inst163 =null;

        MusicParser.elseif_music_stmt_return elseif_music_stmt165 =null;

        MusicParser.else_music_stmt_return else_music_stmt166 =null;


        AmlTree IF158_tree=null;
        AmlTree char_literal159_tree=null;
        AmlTree char_literal161_tree=null;
        AmlTree char_literal162_tree=null;
        AmlTree char_literal164_tree=null;

        try {
            // src/parser/Music.g:169:17: ( IF ^ '(' ! expr ')' ! '{' ! list_music_inst '}' ! ( elseif_music_stmt )* ( else_music_stmt )? )
            // src/parser/Music.g:169:21: IF ^ '(' ! expr ')' ! '{' ! list_music_inst '}' ! ( elseif_music_stmt )* ( else_music_stmt )?
            {
            root_0 = (AmlTree)adaptor.nil();


            IF158=(Token)match(input,IF,FOLLOW_IF_in_if_music_stmt2066); 
            IF158_tree = 
            (AmlTree)adaptor.create(IF158)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(IF158_tree, root_0);


            char_literal159=(Token)match(input,83,FOLLOW_83_in_if_music_stmt2069); 

            pushFollow(FOLLOW_expr_in_if_music_stmt2072);
            expr160=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr160.getTree());

            char_literal161=(Token)match(input,84,FOLLOW_84_in_if_music_stmt2074); 

            char_literal162=(Token)match(input,89,FOLLOW_89_in_if_music_stmt2077); 

            pushFollow(FOLLOW_list_music_inst_in_if_music_stmt2080);
            list_music_inst163=list_music_inst();

            state._fsp--;

            adaptor.addChild(root_0, list_music_inst163.getTree());

            char_literal164=(Token)match(input,90,FOLLOW_90_in_if_music_stmt2082); 

            // src/parser/Music.g:169:66: ( elseif_music_stmt )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==ELSE) ) {
                    int LA27_1 = input.LA(2);

                    if ( (LA27_1==IF) ) {
                        alt27=1;
                    }


                }


                switch (alt27) {
            	case 1 :
            	    // src/parser/Music.g:169:66: elseif_music_stmt
            	    {
            	    pushFollow(FOLLOW_elseif_music_stmt_in_if_music_stmt2085);
            	    elseif_music_stmt165=elseif_music_stmt();

            	    state._fsp--;

            	    adaptor.addChild(root_0, elseif_music_stmt165.getTree());

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            // src/parser/Music.g:169:85: ( else_music_stmt )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==ELSE) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // src/parser/Music.g:169:85: else_music_stmt
                    {
                    pushFollow(FOLLOW_else_music_stmt_in_if_music_stmt2088);
                    else_music_stmt166=else_music_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, else_music_stmt166.getTree());

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
    // src/parser/Music.g:172:1: elseif_music_stmt : ELSE IF '(' expr ')' '{' list_music_inst '}' -> ^( ELSEIF expr list_music_inst ) ;
    public final MusicParser.elseif_music_stmt_return elseif_music_stmt() throws RecognitionException {
        MusicParser.elseif_music_stmt_return retval = new MusicParser.elseif_music_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token ELSE167=null;
        Token IF168=null;
        Token char_literal169=null;
        Token char_literal171=null;
        Token char_literal172=null;
        Token char_literal174=null;
        MusicParser.expr_return expr170 =null;

        MusicParser.list_music_inst_return list_music_inst173 =null;


        AmlTree ELSE167_tree=null;
        AmlTree IF168_tree=null;
        AmlTree char_literal169_tree=null;
        AmlTree char_literal171_tree=null;
        AmlTree char_literal172_tree=null;
        AmlTree char_literal174_tree=null;
        RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
        RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");
        RewriteRuleTokenStream stream_89=new RewriteRuleTokenStream(adaptor,"token 89");
        RewriteRuleSubtreeStream stream_list_music_inst=new RewriteRuleSubtreeStream(adaptor,"rule list_music_inst");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // src/parser/Music.g:172:21: ( ELSE IF '(' expr ')' '{' list_music_inst '}' -> ^( ELSEIF expr list_music_inst ) )
            // src/parser/Music.g:172:25: ELSE IF '(' expr ')' '{' list_music_inst '}'
            {
            ELSE167=(Token)match(input,ELSE,FOLLOW_ELSE_in_elseif_music_stmt2118);  
            stream_ELSE.add(ELSE167);


            IF168=(Token)match(input,IF,FOLLOW_IF_in_elseif_music_stmt2120);  
            stream_IF.add(IF168);


            char_literal169=(Token)match(input,83,FOLLOW_83_in_elseif_music_stmt2122);  
            stream_83.add(char_literal169);


            pushFollow(FOLLOW_expr_in_elseif_music_stmt2124);
            expr170=expr();

            state._fsp--;

            stream_expr.add(expr170.getTree());

            char_literal171=(Token)match(input,84,FOLLOW_84_in_elseif_music_stmt2126);  
            stream_84.add(char_literal171);


            char_literal172=(Token)match(input,89,FOLLOW_89_in_elseif_music_stmt2128);  
            stream_89.add(char_literal172);


            pushFollow(FOLLOW_list_music_inst_in_elseif_music_stmt2130);
            list_music_inst173=list_music_inst();

            state._fsp--;

            stream_list_music_inst.add(list_music_inst173.getTree());

            char_literal174=(Token)match(input,90,FOLLOW_90_in_elseif_music_stmt2132);  
            stream_90.add(char_literal174);


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
            // 172:70: -> ^( ELSEIF expr list_music_inst )
            {
                // src/parser/Music.g:172:73: ^( ELSEIF expr list_music_inst )
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
    // src/parser/Music.g:175:1: else_music_stmt : ELSE ^ '{' ! list_music_inst '}' !;
    public final MusicParser.else_music_stmt_return else_music_stmt() throws RecognitionException {
        MusicParser.else_music_stmt_return retval = new MusicParser.else_music_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token ELSE175=null;
        Token char_literal176=null;
        Token char_literal178=null;
        MusicParser.list_music_inst_return list_music_inst177 =null;


        AmlTree ELSE175_tree=null;
        AmlTree char_literal176_tree=null;
        AmlTree char_literal178_tree=null;

        try {
            // src/parser/Music.g:175:17: ( ELSE ^ '{' ! list_music_inst '}' !)
            // src/parser/Music.g:175:21: ELSE ^ '{' ! list_music_inst '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            ELSE175=(Token)match(input,ELSE,FOLLOW_ELSE_in_else_music_stmt2173); 
            ELSE175_tree = 
            (AmlTree)adaptor.create(ELSE175)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(ELSE175_tree, root_0);


            char_literal176=(Token)match(input,89,FOLLOW_89_in_else_music_stmt2176); 

            pushFollow(FOLLOW_list_music_inst_in_else_music_stmt2179);
            list_music_inst177=list_music_inst();

            state._fsp--;

            adaptor.addChild(root_0, list_music_inst177.getTree());

            char_literal178=(Token)match(input,90,FOLLOW_90_in_else_music_stmt2181); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:178:1: song : SONG ^ ( id_rule )? '{' ! ( beat )? ( speed )? ( transport )? ( track )+ '}' !;
    public final MusicParser.song_return song() throws RecognitionException {
        MusicParser.song_return retval = new MusicParser.song_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token SONG179=null;
        Token char_literal181=null;
        Token char_literal186=null;
        MusicParser.id_rule_return id_rule180 =null;

        MusicParser.beat_return beat182 =null;

        MusicParser.speed_return speed183 =null;

        MusicParser.transport_return transport184 =null;

        MusicParser.track_return track185 =null;


        AmlTree SONG179_tree=null;
        AmlTree char_literal181_tree=null;
        AmlTree char_literal186_tree=null;

        try {
            // src/parser/Music.g:178:13: ( SONG ^ ( id_rule )? '{' ! ( beat )? ( speed )? ( transport )? ( track )+ '}' !)
            // src/parser/Music.g:178:17: SONG ^ ( id_rule )? '{' ! ( beat )? ( speed )? ( transport )? ( track )+ '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            SONG179=(Token)match(input,SONG,FOLLOW_SONG_in_song2216); 
            SONG179_tree = 
            (AmlTree)adaptor.create(SONG179)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(SONG179_tree, root_0);


            // src/parser/Music.g:178:23: ( id_rule )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==ID||LA29_0==LETTER_X) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // src/parser/Music.g:178:23: id_rule
                    {
                    pushFollow(FOLLOW_id_rule_in_song2219);
                    id_rule180=id_rule();

                    state._fsp--;

                    adaptor.addChild(root_0, id_rule180.getTree());

                    }
                    break;

            }


            char_literal181=(Token)match(input,89,FOLLOW_89_in_song2222); 

            // src/parser/Music.g:178:37: ( beat )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==BEAT) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // src/parser/Music.g:178:37: beat
                    {
                    pushFollow(FOLLOW_beat_in_song2225);
                    beat182=beat();

                    state._fsp--;

                    adaptor.addChild(root_0, beat182.getTree());

                    }
                    break;

            }


            // src/parser/Music.g:178:43: ( speed )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==SPEED) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // src/parser/Music.g:178:43: speed
                    {
                    pushFollow(FOLLOW_speed_in_song2228);
                    speed183=speed();

                    state._fsp--;

                    adaptor.addChild(root_0, speed183.getTree());

                    }
                    break;

            }


            // src/parser/Music.g:178:50: ( transport )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==TRANSPORT) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // src/parser/Music.g:178:50: transport
                    {
                    pushFollow(FOLLOW_transport_in_song2231);
                    transport184=transport();

                    state._fsp--;

                    adaptor.addChild(root_0, transport184.getTree());

                    }
                    break;

            }


            // src/parser/Music.g:178:61: ( track )+
            int cnt33=0;
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==TRACK) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // src/parser/Music.g:178:62: track
            	    {
            	    pushFollow(FOLLOW_track_in_song2235);
            	    track185=track();

            	    state._fsp--;

            	    adaptor.addChild(root_0, track185.getTree());

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


            char_literal186=(Token)match(input,90,FOLLOW_90_in_song2239); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:181:1: track : TRACK ^ ( id_rule )? ( STRING )? compas_aux ;
    public final MusicParser.track_return track() throws RecognitionException {
        MusicParser.track_return retval = new MusicParser.track_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token TRACK187=null;
        Token STRING189=null;
        MusicParser.id_rule_return id_rule188 =null;

        MusicParser.compas_aux_return compas_aux190 =null;


        AmlTree TRACK187_tree=null;
        AmlTree STRING189_tree=null;

        try {
            // src/parser/Music.g:181:13: ( TRACK ^ ( id_rule )? ( STRING )? compas_aux )
            // src/parser/Music.g:181:17: TRACK ^ ( id_rule )? ( STRING )? compas_aux
            {
            root_0 = (AmlTree)adaptor.nil();


            TRACK187=(Token)match(input,TRACK,FOLLOW_TRACK_in_track2269); 
            TRACK187_tree = 
            (AmlTree)adaptor.create(TRACK187)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(TRACK187_tree, root_0);


            // src/parser/Music.g:181:24: ( id_rule )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==ID||LA34_0==LETTER_X) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // src/parser/Music.g:181:24: id_rule
                    {
                    pushFollow(FOLLOW_id_rule_in_track2272);
                    id_rule188=id_rule();

                    state._fsp--;

                    adaptor.addChild(root_0, id_rule188.getTree());

                    }
                    break;

            }


            // src/parser/Music.g:181:33: ( STRING )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==STRING) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // src/parser/Music.g:181:33: STRING
                    {
                    STRING189=(Token)match(input,STRING,FOLLOW_STRING_in_track2275); 
                    STRING189_tree = 
                    (AmlTree)adaptor.create(STRING189)
                    ;
                    adaptor.addChild(root_0, STRING189_tree);


                    }
                    break;

            }


            pushFollow(FOLLOW_compas_aux_in_track2278);
            compas_aux190=compas_aux();

            state._fsp--;

            adaptor.addChild(root_0, compas_aux190.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:184:1: compas_aux : compas_list -> ^( COMPAS_LIST compas_list ) ;
    public final MusicParser.compas_aux_return compas_aux() throws RecognitionException {
        MusicParser.compas_aux_return retval = new MusicParser.compas_aux_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        MusicParser.compas_list_return compas_list191 =null;


        RewriteRuleSubtreeStream stream_compas_list=new RewriteRuleSubtreeStream(adaptor,"rule compas_list");
        try {
            // src/parser/Music.g:184:13: ( compas_list -> ^( COMPAS_LIST compas_list ) )
            // src/parser/Music.g:184:17: compas_list
            {
            pushFollow(FOLLOW_compas_list_in_compas_aux2302);
            compas_list191=compas_list();

            state._fsp--;

            stream_compas_list.add(compas_list191.getTree());

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
            // 184:29: -> ^( COMPAS_LIST compas_list )
            {
                // src/parser/Music.g:184:32: ^( COMPAS_LIST compas_list )
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
    // src/parser/Music.g:187:1: compas_list : ( DOUBLE_BAR !| repetition ) ( compasses | repetition )* ( DOUBLE_BAR !) ;
    public final MusicParser.compas_list_return compas_list() throws RecognitionException {
        MusicParser.compas_list_return retval = new MusicParser.compas_list_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token DOUBLE_BAR192=null;
        Token DOUBLE_BAR196=null;
        MusicParser.repetition_return repetition193 =null;

        MusicParser.compasses_return compasses194 =null;

        MusicParser.repetition_return repetition195 =null;


        AmlTree DOUBLE_BAR192_tree=null;
        AmlTree DOUBLE_BAR196_tree=null;

        try {
            // src/parser/Music.g:187:13: ( ( DOUBLE_BAR !| repetition ) ( compasses | repetition )* ( DOUBLE_BAR !) )
            // src/parser/Music.g:187:15: ( DOUBLE_BAR !| repetition ) ( compasses | repetition )* ( DOUBLE_BAR !)
            {
            root_0 = (AmlTree)adaptor.nil();


            // src/parser/Music.g:187:15: ( DOUBLE_BAR !| repetition )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==DOUBLE_BAR) ) {
                alt36=1;
            }
            else if ( (LA36_0==NUM||LA36_0==START_REPETITION) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;

            }
            switch (alt36) {
                case 1 :
                    // src/parser/Music.g:187:16: DOUBLE_BAR !
                    {
                    DOUBLE_BAR192=(Token)match(input,DOUBLE_BAR,FOLLOW_DOUBLE_BAR_in_compas_list2332); 

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:187:30: repetition
                    {
                    pushFollow(FOLLOW_repetition_in_compas_list2337);
                    repetition193=repetition();

                    state._fsp--;

                    adaptor.addChild(root_0, repetition193.getTree());

                    }
                    break;

            }


            // src/parser/Music.g:187:42: ( compasses | repetition )*
            loop37:
            do {
                int alt37=3;
                int LA37_0 = input.LA(1);

                if ( ((LA37_0 >= BEMOL && LA37_0 <= BOOL)||LA37_0==CHORD||LA37_0==DECR||LA37_0==FOR||(LA37_0 >= ID && LA37_0 <= INCR)||LA37_0==INT||LA37_0==LETTER_X||LA37_0==NOTE||LA37_0==NOTE_TYPE||LA37_0==SONG||LA37_0==SUSTAIN||LA37_0==TONE||LA37_0==WHILE||LA37_0==83) ) {
                    alt37=1;
                }
                else if ( (LA37_0==NUM||LA37_0==START_REPETITION) ) {
                    alt37=2;
                }


                switch (alt37) {
            	case 1 :
            	    // src/parser/Music.g:187:43: compasses
            	    {
            	    pushFollow(FOLLOW_compasses_in_compas_list2341);
            	    compasses194=compasses();

            	    state._fsp--;

            	    adaptor.addChild(root_0, compasses194.getTree());

            	    }
            	    break;
            	case 2 :
            	    // src/parser/Music.g:187:55: repetition
            	    {
            	    pushFollow(FOLLOW_repetition_in_compas_list2345);
            	    repetition195=repetition();

            	    state._fsp--;

            	    adaptor.addChild(root_0, repetition195.getTree());

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);


            // src/parser/Music.g:187:68: ( DOUBLE_BAR !)
            // src/parser/Music.g:187:69: DOUBLE_BAR !
            {
            DOUBLE_BAR196=(Token)match(input,DOUBLE_BAR,FOLLOW_DOUBLE_BAR_in_compas_list2350); 

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
    // src/parser/Music.g:190:1: compasses : compas ( BAR ! compas )* ;
    public final MusicParser.compasses_return compasses() throws RecognitionException {
        MusicParser.compasses_return retval = new MusicParser.compasses_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token BAR198=null;
        MusicParser.compas_return compas197 =null;

        MusicParser.compas_return compas199 =null;


        AmlTree BAR198_tree=null;

        try {
            // src/parser/Music.g:190:13: ( compas ( BAR ! compas )* )
            // src/parser/Music.g:190:17: compas ( BAR ! compas )*
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_compas_in_compasses2377);
            compas197=compas();

            state._fsp--;

            adaptor.addChild(root_0, compas197.getTree());

            // src/parser/Music.g:190:24: ( BAR ! compas )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==BAR) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // src/parser/Music.g:190:25: BAR ! compas
            	    {
            	    BAR198=(Token)match(input,BAR,FOLLOW_BAR_in_compasses2380); 

            	    pushFollow(FOLLOW_compas_in_compasses2383);
            	    compas199=compas();

            	    state._fsp--;

            	    adaptor.addChild(root_0, compas199.getTree());

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
    // $ANTLR end "compasses"


    public static class repetition_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "repetition"
    // src/parser/Music.g:193:1: repetition : ( NUM LETTER_X )? START_REPETITION compasses END_REPETITION -> ^( REPETITION NUM compasses ) ;
    public final MusicParser.repetition_return repetition() throws RecognitionException {
        MusicParser.repetition_return retval = new MusicParser.repetition_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token NUM200=null;
        Token LETTER_X201=null;
        Token START_REPETITION202=null;
        Token END_REPETITION204=null;
        MusicParser.compasses_return compasses203 =null;


        AmlTree NUM200_tree=null;
        AmlTree LETTER_X201_tree=null;
        AmlTree START_REPETITION202_tree=null;
        AmlTree END_REPETITION204_tree=null;
        RewriteRuleTokenStream stream_LETTER_X=new RewriteRuleTokenStream(adaptor,"token LETTER_X");
        RewriteRuleTokenStream stream_END_REPETITION=new RewriteRuleTokenStream(adaptor,"token END_REPETITION");
        RewriteRuleTokenStream stream_START_REPETITION=new RewriteRuleTokenStream(adaptor,"token START_REPETITION");
        RewriteRuleTokenStream stream_NUM=new RewriteRuleTokenStream(adaptor,"token NUM");
        RewriteRuleSubtreeStream stream_compasses=new RewriteRuleSubtreeStream(adaptor,"rule compasses");
        try {
            // src/parser/Music.g:193:13: ( ( NUM LETTER_X )? START_REPETITION compasses END_REPETITION -> ^( REPETITION NUM compasses ) )
            // src/parser/Music.g:193:17: ( NUM LETTER_X )? START_REPETITION compasses END_REPETITION
            {
            // src/parser/Music.g:193:17: ( NUM LETTER_X )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==NUM) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // src/parser/Music.g:193:18: NUM LETTER_X
                    {
                    NUM200=(Token)match(input,NUM,FOLLOW_NUM_in_repetition2410);  
                    stream_NUM.add(NUM200);


                    LETTER_X201=(Token)match(input,LETTER_X,FOLLOW_LETTER_X_in_repetition2412);  
                    stream_LETTER_X.add(LETTER_X201);


                    }
                    break;

            }


            START_REPETITION202=(Token)match(input,START_REPETITION,FOLLOW_START_REPETITION_in_repetition2416);  
            stream_START_REPETITION.add(START_REPETITION202);


            pushFollow(FOLLOW_compasses_in_repetition2418);
            compasses203=compasses();

            state._fsp--;

            stream_compasses.add(compasses203.getTree());

            END_REPETITION204=(Token)match(input,END_REPETITION,FOLLOW_END_REPETITION_in_repetition2420);  
            stream_END_REPETITION.add(END_REPETITION204);


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
            // 193:78: -> ^( REPETITION NUM compasses )
            {
                // src/parser/Music.g:193:81: ^( REPETITION NUM compasses )
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
    // src/parser/Music.g:196:1: compas : ( tone )? ( options {greedy=true; } : music_inst )+ -> ^( COMPAS ( tone )? ( music_inst )+ ) ;
    public final MusicParser.compas_return compas() throws RecognitionException {
        MusicParser.compas_return retval = new MusicParser.compas_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        MusicParser.tone_return tone205 =null;

        MusicParser.music_inst_return music_inst206 =null;


        RewriteRuleSubtreeStream stream_tone=new RewriteRuleSubtreeStream(adaptor,"rule tone");
        RewriteRuleSubtreeStream stream_music_inst=new RewriteRuleSubtreeStream(adaptor,"rule music_inst");
        try {
            // src/parser/Music.g:196:13: ( ( tone )? ( options {greedy=true; } : music_inst )+ -> ^( COMPAS ( tone )? ( music_inst )+ ) )
            // src/parser/Music.g:196:17: ( tone )? ( options {greedy=true; } : music_inst )+
            {
            // src/parser/Music.g:196:17: ( tone )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==TONE) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // src/parser/Music.g:196:17: tone
                    {
                    pushFollow(FOLLOW_tone_in_compas2461);
                    tone205=tone();

                    state._fsp--;

                    stream_tone.add(tone205.getTree());

                    }
                    break;

            }


            // src/parser/Music.g:196:23: ( options {greedy=true; } : music_inst )+
            int cnt41=0;
            loop41:
            do {
                int alt41=2;
                switch ( input.LA(1) ) {
                case CHORD:
                    {
                    alt41=1;
                    }
                    break;
                case ID:
                case LETTER_X:
                    {
                    alt41=1;
                    }
                    break;
                case INCR:
                    {
                    alt41=1;
                    }
                    break;
                case DECR:
                    {
                    alt41=1;
                    }
                    break;
                case WHILE:
                    {
                    alt41=1;
                    }
                    break;
                case FOR:
                    {
                    alt41=1;
                    }
                    break;
                case IF:
                    {
                    alt41=1;
                    }
                    break;
                case SONG:
                    {
                    alt41=1;
                    }
                    break;
                case BOOL:
                case INT:
                case NOTE_TYPE:
                    {
                    alt41=1;
                    }
                    break;
                case 83:
                    {
                    alt41=1;
                    }
                    break;
                case BEMOL:
                case SUSTAIN:
                    {
                    alt41=1;
                    }
                    break;
                case NOTE:
                    {
                    alt41=1;
                    }
                    break;

                }

                switch (alt41) {
            	case 1 :
            	    // src/parser/Music.g:196:49: music_inst
            	    {
            	    pushFollow(FOLLOW_music_inst_in_compas2474);
            	    music_inst206=music_inst();

            	    state._fsp--;

            	    stream_music_inst.add(music_inst206.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt41 >= 1 ) break loop41;
                        EarlyExitException eee =
                            new EarlyExitException(41, input);
                        throw eee;
                }
                cnt41++;
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
            // 196:65: -> ^( COMPAS ( tone )? ( music_inst )+ )
            {
                // src/parser/Music.g:196:68: ^( COMPAS ( tone )? ( music_inst )+ )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(COMPAS, "COMPAS")
                , root_1);

                // src/parser/Music.g:196:77: ( tone )?
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
    // src/parser/Music.g:199:1: tone : TONE ^ NUM ( SUSTAIN | BEMOL ) ;
    public final MusicParser.tone_return tone() throws RecognitionException {
        MusicParser.tone_return retval = new MusicParser.tone_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token TONE207=null;
        Token NUM208=null;
        Token set209=null;

        AmlTree TONE207_tree=null;
        AmlTree NUM208_tree=null;
        AmlTree set209_tree=null;

        try {
            // src/parser/Music.g:199:13: ( TONE ^ NUM ( SUSTAIN | BEMOL ) )
            // src/parser/Music.g:199:17: TONE ^ NUM ( SUSTAIN | BEMOL )
            {
            root_0 = (AmlTree)adaptor.nil();


            TONE207=(Token)match(input,TONE,FOLLOW_TONE_in_tone2521); 
            TONE207_tree = 
            (AmlTree)adaptor.create(TONE207)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(TONE207_tree, root_0);


            NUM208=(Token)match(input,NUM,FOLLOW_NUM_in_tone2524); 
            NUM208_tree = 
            (AmlTree)adaptor.create(NUM208)
            ;
            adaptor.addChild(root_0, NUM208_tree);


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

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:202:1: notes_group : notes_type ( '.' FIGURE ( DOT )? )? ( TIE )? -> ^( NOTE_LIST notes_type ( FIGURE )? ( DOT )? ( TIE )? ) ;
    public final MusicParser.notes_group_return notes_group() throws RecognitionException {
        MusicParser.notes_group_return retval = new MusicParser.notes_group_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal211=null;
        Token FIGURE212=null;
        Token DOT213=null;
        Token TIE214=null;
        MusicParser.notes_type_return notes_type210 =null;


        AmlTree char_literal211_tree=null;
        AmlTree FIGURE212_tree=null;
        AmlTree DOT213_tree=null;
        AmlTree TIE214_tree=null;
        RewriteRuleTokenStream stream_FIGURE=new RewriteRuleTokenStream(adaptor,"token FIGURE");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_TIE=new RewriteRuleTokenStream(adaptor,"token TIE");
        RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
        RewriteRuleSubtreeStream stream_notes_type=new RewriteRuleSubtreeStream(adaptor,"rule notes_type");
        try {
            // src/parser/Music.g:202:13: ( notes_type ( '.' FIGURE ( DOT )? )? ( TIE )? -> ^( NOTE_LIST notes_type ( FIGURE )? ( DOT )? ( TIE )? ) )
            // src/parser/Music.g:202:17: notes_type ( '.' FIGURE ( DOT )? )? ( TIE )?
            {
            pushFollow(FOLLOW_notes_type_in_notes_group2555);
            notes_type210=notes_type();

            state._fsp--;

            stream_notes_type.add(notes_type210.getTree());

            // src/parser/Music.g:202:28: ( '.' FIGURE ( DOT )? )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==86) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // src/parser/Music.g:202:29: '.' FIGURE ( DOT )?
                    {
                    char_literal211=(Token)match(input,86,FOLLOW_86_in_notes_group2558);  
                    stream_86.add(char_literal211);


                    FIGURE212=(Token)match(input,FIGURE,FOLLOW_FIGURE_in_notes_group2560);  
                    stream_FIGURE.add(FIGURE212);


                    // src/parser/Music.g:202:40: ( DOT )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==DOT) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // src/parser/Music.g:202:40: DOT
                            {
                            DOT213=(Token)match(input,DOT,FOLLOW_DOT_in_notes_group2562);  
                            stream_DOT.add(DOT213);


                            }
                            break;

                    }


                    }
                    break;

            }


            // src/parser/Music.g:202:47: ( TIE )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==TIE) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // src/parser/Music.g:202:47: TIE
                    {
                    TIE214=(Token)match(input,TIE,FOLLOW_TIE_in_notes_group2567);  
                    stream_TIE.add(TIE214);


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
            // 202:52: -> ^( NOTE_LIST notes_type ( FIGURE )? ( DOT )? ( TIE )? )
            {
                // src/parser/Music.g:202:55: ^( NOTE_LIST notes_type ( FIGURE )? ( DOT )? ( TIE )? )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(NOTE_LIST, "NOTE_LIST")
                , root_1);

                adaptor.addChild(root_1, stream_notes_type.nextTree());

                // src/parser/Music.g:202:78: ( FIGURE )?
                if ( stream_FIGURE.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_FIGURE.nextNode()
                    );

                }
                stream_FIGURE.reset();

                // src/parser/Music.g:202:86: ( DOT )?
                if ( stream_DOT.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_DOT.nextNode()
                    );

                }
                stream_DOT.reset();

                // src/parser/Music.g:202:91: ( TIE )?
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
    // src/parser/Music.g:205:1: notes_variable : notes_type ( '.' FIGURE ( DOT )? )? -> ^( NOTE_LIST notes_type ( FIGURE )? ( DOT )? ) ;
    public final MusicParser.notes_variable_return notes_variable() throws RecognitionException {
        MusicParser.notes_variable_return retval = new MusicParser.notes_variable_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal216=null;
        Token FIGURE217=null;
        Token DOT218=null;
        MusicParser.notes_type_return notes_type215 =null;


        AmlTree char_literal216_tree=null;
        AmlTree FIGURE217_tree=null;
        AmlTree DOT218_tree=null;
        RewriteRuleTokenStream stream_FIGURE=new RewriteRuleTokenStream(adaptor,"token FIGURE");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
        RewriteRuleSubtreeStream stream_notes_type=new RewriteRuleSubtreeStream(adaptor,"rule notes_type");
        try {
            // src/parser/Music.g:205:17: ( notes_type ( '.' FIGURE ( DOT )? )? -> ^( NOTE_LIST notes_type ( FIGURE )? ( DOT )? ) )
            // src/parser/Music.g:205:21: notes_type ( '.' FIGURE ( DOT )? )?
            {
            pushFollow(FOLLOW_notes_type_in_notes_variable2609);
            notes_type215=notes_type();

            state._fsp--;

            stream_notes_type.add(notes_type215.getTree());

            // src/parser/Music.g:205:32: ( '.' FIGURE ( DOT )? )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==86) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // src/parser/Music.g:205:33: '.' FIGURE ( DOT )?
                    {
                    char_literal216=(Token)match(input,86,FOLLOW_86_in_notes_variable2612);  
                    stream_86.add(char_literal216);


                    FIGURE217=(Token)match(input,FIGURE,FOLLOW_FIGURE_in_notes_variable2614);  
                    stream_FIGURE.add(FIGURE217);


                    // src/parser/Music.g:205:44: ( DOT )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==DOT) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // src/parser/Music.g:205:44: DOT
                            {
                            DOT218=(Token)match(input,DOT,FOLLOW_DOT_in_notes_variable2616);  
                            stream_DOT.add(DOT218);


                            }
                            break;

                    }


                    }
                    break;

            }


            // AST REWRITE
            // elements: FIGURE, notes_type, DOT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AmlTree)adaptor.nil();
            // 205:51: -> ^( NOTE_LIST notes_type ( FIGURE )? ( DOT )? )
            {
                // src/parser/Music.g:205:54: ^( NOTE_LIST notes_type ( FIGURE )? ( DOT )? )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(NOTE_LIST, "NOTE_LIST")
                , root_1);

                adaptor.addChild(root_1, stream_notes_type.nextTree());

                // src/parser/Music.g:205:77: ( FIGURE )?
                if ( stream_FIGURE.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_FIGURE.nextNode()
                    );

                }
                stream_FIGURE.reset();

                // src/parser/Music.g:205:85: ( DOT )?
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
    // src/parser/Music.g:208:1: notes_type : ( chord | notes );
    public final MusicParser.notes_type_return notes_type() throws RecognitionException {
        MusicParser.notes_type_return retval = new MusicParser.notes_type_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        MusicParser.chord_return chord219 =null;

        MusicParser.notes_return notes220 =null;



        try {
            // src/parser/Music.g:208:13: ( chord | notes )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==CHORD) ) {
                alt47=1;
            }
            else if ( (LA47_0==BEMOL||LA47_0==NOTE||LA47_0==SUSTAIN||LA47_0==83) ) {
                alt47=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;

            }
            switch (alt47) {
                case 1 :
                    // src/parser/Music.g:208:15: chord
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_chord_in_notes_type2659);
                    chord219=chord();

                    state._fsp--;

                    adaptor.addChild(root_0, chord219.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:208:23: notes
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_notes_in_notes_type2663);
                    notes220=notes();

                    state._fsp--;

                    adaptor.addChild(root_0, notes220.getTree());

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
    // src/parser/Music.g:211:1: chord : CHORD ^ '(' ! NOTE ( MINOR | PLUS | DIMINUTION )? ( SEVENTH | MAJ7 )? ')' !;
    public final MusicParser.chord_return chord() throws RecognitionException {
        MusicParser.chord_return retval = new MusicParser.chord_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token CHORD221=null;
        Token char_literal222=null;
        Token NOTE223=null;
        Token set224=null;
        Token set225=null;
        Token char_literal226=null;

        AmlTree CHORD221_tree=null;
        AmlTree char_literal222_tree=null;
        AmlTree NOTE223_tree=null;
        AmlTree set224_tree=null;
        AmlTree set225_tree=null;
        AmlTree char_literal226_tree=null;

        try {
            // src/parser/Music.g:211:13: ( CHORD ^ '(' ! NOTE ( MINOR | PLUS | DIMINUTION )? ( SEVENTH | MAJ7 )? ')' !)
            // src/parser/Music.g:211:17: CHORD ^ '(' ! NOTE ( MINOR | PLUS | DIMINUTION )? ( SEVENTH | MAJ7 )? ')' !
            {
            root_0 = (AmlTree)adaptor.nil();


            CHORD221=(Token)match(input,CHORD,FOLLOW_CHORD_in_chord2692); 
            CHORD221_tree = 
            (AmlTree)adaptor.create(CHORD221)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(CHORD221_tree, root_0);


            char_literal222=(Token)match(input,83,FOLLOW_83_in_chord2695); 

            NOTE223=(Token)match(input,NOTE,FOLLOW_NOTE_in_chord2698); 
            NOTE223_tree = 
            (AmlTree)adaptor.create(NOTE223)
            ;
            adaptor.addChild(root_0, NOTE223_tree);


            // src/parser/Music.g:211:34: ( MINOR | PLUS | DIMINUTION )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==DIMINUTION||LA48_0==MINOR||LA48_0==PLUS) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // src/parser/Music.g:
                    {
                    set224=(Token)input.LT(1);

                    if ( input.LA(1)==DIMINUTION||input.LA(1)==MINOR||input.LA(1)==PLUS ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (AmlTree)adaptor.create(set224)
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


            // src/parser/Music.g:211:59: ( SEVENTH | MAJ7 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==MAJ7||LA49_0==SEVENTH) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // src/parser/Music.g:
                    {
                    set225=(Token)input.LT(1);

                    if ( input.LA(1)==MAJ7||input.LA(1)==SEVENTH ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (AmlTree)adaptor.create(set225)
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


            char_literal226=(Token)match(input,84,FOLLOW_84_in_chord2716); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:214:1: notes : ( '(' ( note )+ ')' | note ) -> ^( NOTES ( note )+ ) ;
    public final MusicParser.notes_return notes() throws RecognitionException {
        MusicParser.notes_return retval = new MusicParser.notes_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal227=null;
        Token char_literal229=null;
        MusicParser.note_return note228 =null;

        MusicParser.note_return note230 =null;


        AmlTree char_literal227_tree=null;
        AmlTree char_literal229_tree=null;
        RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
        RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");
        RewriteRuleSubtreeStream stream_note=new RewriteRuleSubtreeStream(adaptor,"rule note");
        try {
            // src/parser/Music.g:214:13: ( ( '(' ( note )+ ')' | note ) -> ^( NOTES ( note )+ ) )
            // src/parser/Music.g:214:17: ( '(' ( note )+ ')' | note )
            {
            // src/parser/Music.g:214:17: ( '(' ( note )+ ')' | note )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==83) ) {
                alt51=1;
            }
            else if ( (LA51_0==BEMOL||LA51_0==NOTE||LA51_0==SUSTAIN) ) {
                alt51=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;

            }
            switch (alt51) {
                case 1 :
                    // src/parser/Music.g:214:19: '(' ( note )+ ')'
                    {
                    char_literal227=(Token)match(input,83,FOLLOW_83_in_notes2748);  
                    stream_83.add(char_literal227);


                    // src/parser/Music.g:214:23: ( note )+
                    int cnt50=0;
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==BEMOL||LA50_0==NOTE||LA50_0==SUSTAIN) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // src/parser/Music.g:214:24: note
                    	    {
                    	    pushFollow(FOLLOW_note_in_notes2751);
                    	    note228=note();

                    	    state._fsp--;

                    	    stream_note.add(note228.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt50 >= 1 ) break loop50;
                                EarlyExitException eee =
                                    new EarlyExitException(50, input);
                                throw eee;
                        }
                        cnt50++;
                    } while (true);


                    char_literal229=(Token)match(input,84,FOLLOW_84_in_notes2755);  
                    stream_84.add(char_literal229);


                    }
                    break;
                case 2 :
                    // src/parser/Music.g:214:38: note
                    {
                    pushFollow(FOLLOW_note_in_notes2760);
                    note230=note();

                    state._fsp--;

                    stream_note.add(note230.getTree());

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
            // 214:44: -> ^( NOTES ( note )+ )
            {
                // src/parser/Music.g:214:47: ^( NOTES ( note )+ )
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
    // src/parser/Music.g:217:1: note : ( BEMOL | SUSTAIN )? NOTE ^ ( '-' ! NUM )? ;
    public final MusicParser.note_return note() throws RecognitionException {
        MusicParser.note_return retval = new MusicParser.note_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token set231=null;
        Token NOTE232=null;
        Token char_literal233=null;
        Token NUM234=null;

        AmlTree set231_tree=null;
        AmlTree NOTE232_tree=null;
        AmlTree char_literal233_tree=null;
        AmlTree NUM234_tree=null;

        try {
            // src/parser/Music.g:217:13: ( ( BEMOL | SUSTAIN )? NOTE ^ ( '-' ! NUM )? )
            // src/parser/Music.g:217:17: ( BEMOL | SUSTAIN )? NOTE ^ ( '-' ! NUM )?
            {
            root_0 = (AmlTree)adaptor.nil();


            // src/parser/Music.g:217:17: ( BEMOL | SUSTAIN )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==BEMOL||LA52_0==SUSTAIN) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // src/parser/Music.g:
                    {
                    set231=(Token)input.LT(1);

                    if ( input.LA(1)==BEMOL||input.LA(1)==SUSTAIN ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (AmlTree)adaptor.create(set231)
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


            NOTE232=(Token)match(input,NOTE,FOLLOW_NOTE_in_note2809); 
            NOTE232_tree = 
            (AmlTree)adaptor.create(NOTE232)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(NOTE232_tree, root_0);


            // src/parser/Music.g:217:42: ( '-' ! NUM )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==MINUS) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // src/parser/Music.g:217:43: '-' ! NUM
                    {
                    char_literal233=(Token)match(input,MINUS,FOLLOW_MINUS_in_note2813); 

                    NUM234=(Token)match(input,NUM,FOLLOW_NUM_in_note2816); 
                    NUM234_tree = 
                    (AmlTree)adaptor.create(NUM234)
                    ;
                    adaptor.addChild(root_0, NUM234_tree);


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
    // src/parser/Music.g:221:1: expr : boolterm ( OR ^ boolterm )* ;
    public final MusicParser.expr_return expr() throws RecognitionException {
        MusicParser.expr_return retval = new MusicParser.expr_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token OR236=null;
        MusicParser.boolterm_return boolterm235 =null;

        MusicParser.boolterm_return boolterm237 =null;


        AmlTree OR236_tree=null;

        try {
            // src/parser/Music.g:221:9: ( boolterm ( OR ^ boolterm )* )
            // src/parser/Music.g:221:13: boolterm ( OR ^ boolterm )*
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_boolterm_in_expr2845);
            boolterm235=boolterm();

            state._fsp--;

            adaptor.addChild(root_0, boolterm235.getTree());

            // src/parser/Music.g:221:22: ( OR ^ boolterm )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==OR) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // src/parser/Music.g:221:23: OR ^ boolterm
            	    {
            	    OR236=(Token)match(input,OR,FOLLOW_OR_in_expr2848); 
            	    OR236_tree = 
            	    (AmlTree)adaptor.create(OR236)
            	    ;
            	    root_0 = (AmlTree)adaptor.becomeRoot(OR236_tree, root_0);


            	    pushFollow(FOLLOW_boolterm_in_expr2851);
            	    boolterm237=boolterm();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolterm237.getTree());

            	    }
            	    break;

            	default :
            	    break loop54;
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
    // src/parser/Music.g:224:1: boolterm : boolfact ( AND ^ boolfact )* ;
    public final MusicParser.boolterm_return boolterm() throws RecognitionException {
        MusicParser.boolterm_return retval = new MusicParser.boolterm_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token AND239=null;
        MusicParser.boolfact_return boolfact238 =null;

        MusicParser.boolfact_return boolfact240 =null;


        AmlTree AND239_tree=null;

        try {
            // src/parser/Music.g:224:13: ( boolfact ( AND ^ boolfact )* )
            // src/parser/Music.g:224:17: boolfact ( AND ^ boolfact )*
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_boolfact_in_boolterm2869);
            boolfact238=boolfact();

            state._fsp--;

            adaptor.addChild(root_0, boolfact238.getTree());

            // src/parser/Music.g:224:26: ( AND ^ boolfact )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==AND) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // src/parser/Music.g:224:27: AND ^ boolfact
            	    {
            	    AND239=(Token)match(input,AND,FOLLOW_AND_in_boolterm2872); 
            	    AND239_tree = 
            	    (AmlTree)adaptor.create(AND239)
            	    ;
            	    root_0 = (AmlTree)adaptor.becomeRoot(AND239_tree, root_0);


            	    pushFollow(FOLLOW_boolfact_in_boolterm2875);
            	    boolfact240=boolfact();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolfact240.getTree());

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
    // $ANTLR end "boolterm"


    public static class boolfact_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolfact"
    // src/parser/Music.g:227:1: boolfact : num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? ;
    public final MusicParser.boolfact_return boolfact() throws RecognitionException {
        MusicParser.boolfact_return retval = new MusicParser.boolfact_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token EQUAL242=null;
        Token NOT_EQUAL243=null;
        Token LT244=null;
        Token LE245=null;
        Token GT246=null;
        Token GE247=null;
        MusicParser.num_expr_return num_expr241 =null;

        MusicParser.num_expr_return num_expr248 =null;


        AmlTree EQUAL242_tree=null;
        AmlTree NOT_EQUAL243_tree=null;
        AmlTree LT244_tree=null;
        AmlTree LE245_tree=null;
        AmlTree GT246_tree=null;
        AmlTree GE247_tree=null;

        try {
            // src/parser/Music.g:227:13: ( num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? )
            // src/parser/Music.g:227:17: num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_num_expr_in_boolfact2897);
            num_expr241=num_expr();

            state._fsp--;

            adaptor.addChild(root_0, num_expr241.getTree());

            // src/parser/Music.g:227:26: ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==EQUAL||(LA57_0 >= GE && LA57_0 <= GT)||LA57_0==LE||LA57_0==LT||LA57_0==NOT_EQUAL) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // src/parser/Music.g:227:27: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr
                    {
                    // src/parser/Music.g:227:27: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^)
                    int alt56=6;
                    switch ( input.LA(1) ) {
                    case EQUAL:
                        {
                        alt56=1;
                        }
                        break;
                    case NOT_EQUAL:
                        {
                        alt56=2;
                        }
                        break;
                    case LT:
                        {
                        alt56=3;
                        }
                        break;
                    case LE:
                        {
                        alt56=4;
                        }
                        break;
                    case GT:
                        {
                        alt56=5;
                        }
                        break;
                    case GE:
                        {
                        alt56=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 56, 0, input);

                        throw nvae;

                    }

                    switch (alt56) {
                        case 1 :
                            // src/parser/Music.g:227:28: EQUAL ^
                            {
                            EQUAL242=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_boolfact2901); 
                            EQUAL242_tree = 
                            (AmlTree)adaptor.create(EQUAL242)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(EQUAL242_tree, root_0);


                            }
                            break;
                        case 2 :
                            // src/parser/Music.g:227:37: NOT_EQUAL ^
                            {
                            NOT_EQUAL243=(Token)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_boolfact2906); 
                            NOT_EQUAL243_tree = 
                            (AmlTree)adaptor.create(NOT_EQUAL243)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(NOT_EQUAL243_tree, root_0);


                            }
                            break;
                        case 3 :
                            // src/parser/Music.g:227:50: LT ^
                            {
                            LT244=(Token)match(input,LT,FOLLOW_LT_in_boolfact2911); 
                            LT244_tree = 
                            (AmlTree)adaptor.create(LT244)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(LT244_tree, root_0);


                            }
                            break;
                        case 4 :
                            // src/parser/Music.g:227:56: LE ^
                            {
                            LE245=(Token)match(input,LE,FOLLOW_LE_in_boolfact2916); 
                            LE245_tree = 
                            (AmlTree)adaptor.create(LE245)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(LE245_tree, root_0);


                            }
                            break;
                        case 5 :
                            // src/parser/Music.g:227:62: GT ^
                            {
                            GT246=(Token)match(input,GT,FOLLOW_GT_in_boolfact2921); 
                            GT246_tree = 
                            (AmlTree)adaptor.create(GT246)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(GT246_tree, root_0);


                            }
                            break;
                        case 6 :
                            // src/parser/Music.g:227:68: GE ^
                            {
                            GE247=(Token)match(input,GE,FOLLOW_GE_in_boolfact2926); 
                            GE247_tree = 
                            (AmlTree)adaptor.create(GE247)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(GE247_tree, root_0);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_num_expr_in_boolfact2930);
                    num_expr248=num_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, num_expr248.getTree());

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
    // src/parser/Music.g:230:1: num_expr : term ( ( PLUS ^| MINUS ^) term )* ;
    public final MusicParser.num_expr_return num_expr() throws RecognitionException {
        MusicParser.num_expr_return retval = new MusicParser.num_expr_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token PLUS250=null;
        Token MINUS251=null;
        MusicParser.term_return term249 =null;

        MusicParser.term_return term252 =null;


        AmlTree PLUS250_tree=null;
        AmlTree MINUS251_tree=null;

        try {
            // src/parser/Music.g:230:13: ( term ( ( PLUS ^| MINUS ^) term )* )
            // src/parser/Music.g:230:17: term ( ( PLUS ^| MINUS ^) term )*
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_term_in_num_expr2952);
            term249=term();

            state._fsp--;

            adaptor.addChild(root_0, term249.getTree());

            // src/parser/Music.g:230:22: ( ( PLUS ^| MINUS ^) term )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==MINUS||LA59_0==PLUS) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // src/parser/Music.g:230:24: ( PLUS ^| MINUS ^) term
            	    {
            	    // src/parser/Music.g:230:24: ( PLUS ^| MINUS ^)
            	    int alt58=2;
            	    int LA58_0 = input.LA(1);

            	    if ( (LA58_0==PLUS) ) {
            	        alt58=1;
            	    }
            	    else if ( (LA58_0==MINUS) ) {
            	        alt58=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 58, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt58) {
            	        case 1 :
            	            // src/parser/Music.g:230:25: PLUS ^
            	            {
            	            PLUS250=(Token)match(input,PLUS,FOLLOW_PLUS_in_num_expr2957); 
            	            PLUS250_tree = 
            	            (AmlTree)adaptor.create(PLUS250)
            	            ;
            	            root_0 = (AmlTree)adaptor.becomeRoot(PLUS250_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // src/parser/Music.g:230:33: MINUS ^
            	            {
            	            MINUS251=(Token)match(input,MINUS,FOLLOW_MINUS_in_num_expr2962); 
            	            MINUS251_tree = 
            	            (AmlTree)adaptor.create(MINUS251)
            	            ;
            	            root_0 = (AmlTree)adaptor.becomeRoot(MINUS251_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_term_in_num_expr2966);
            	    term252=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term252.getTree());

            	    }
            	    break;

            	default :
            	    break loop59;
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
    // src/parser/Music.g:233:1: term : factor ( ( DOT ^| DIV ^| MOD ^) factor )* ;
    public final MusicParser.term_return term() throws RecognitionException {
        MusicParser.term_return retval = new MusicParser.term_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token DOT254=null;
        Token DIV255=null;
        Token MOD256=null;
        MusicParser.factor_return factor253 =null;

        MusicParser.factor_return factor257 =null;


        AmlTree DOT254_tree=null;
        AmlTree DIV255_tree=null;
        AmlTree MOD256_tree=null;

        try {
            // src/parser/Music.g:233:9: ( factor ( ( DOT ^| DIV ^| MOD ^) factor )* )
            // src/parser/Music.g:233:13: factor ( ( DOT ^| DIV ^| MOD ^) factor )*
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term2988);
            factor253=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor253.getTree());

            // src/parser/Music.g:233:20: ( ( DOT ^| DIV ^| MOD ^) factor )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==DIV||LA61_0==DOT||LA61_0==MOD) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // src/parser/Music.g:233:22: ( DOT ^| DIV ^| MOD ^) factor
            	    {
            	    // src/parser/Music.g:233:22: ( DOT ^| DIV ^| MOD ^)
            	    int alt60=3;
            	    switch ( input.LA(1) ) {
            	    case DOT:
            	        {
            	        alt60=1;
            	        }
            	        break;
            	    case DIV:
            	        {
            	        alt60=2;
            	        }
            	        break;
            	    case MOD:
            	        {
            	        alt60=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 60, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt60) {
            	        case 1 :
            	            // src/parser/Music.g:233:23: DOT ^
            	            {
            	            DOT254=(Token)match(input,DOT,FOLLOW_DOT_in_term2993); 
            	            DOT254_tree = 
            	            (AmlTree)adaptor.create(DOT254)
            	            ;
            	            root_0 = (AmlTree)adaptor.becomeRoot(DOT254_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // src/parser/Music.g:233:30: DIV ^
            	            {
            	            DIV255=(Token)match(input,DIV,FOLLOW_DIV_in_term2998); 
            	            DIV255_tree = 
            	            (AmlTree)adaptor.create(DIV255)
            	            ;
            	            root_0 = (AmlTree)adaptor.becomeRoot(DIV255_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // src/parser/Music.g:233:37: MOD ^
            	            {
            	            MOD256=(Token)match(input,MOD,FOLLOW_MOD_in_term3003); 
            	            MOD256_tree = 
            	            (AmlTree)adaptor.create(MOD256)
            	            ;
            	            root_0 = (AmlTree)adaptor.becomeRoot(MOD256_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_factor_in_term3007);
            	    factor257=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor257.getTree());

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
    // $ANTLR end "term"


    public static class factor_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "factor"
    // src/parser/Music.g:236:1: factor : ( NOT ^| PLUS ^| MINUS ^)? atom ;
    public final MusicParser.factor_return factor() throws RecognitionException {
        MusicParser.factor_return retval = new MusicParser.factor_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token NOT258=null;
        Token PLUS259=null;
        Token MINUS260=null;
        MusicParser.atom_return atom261 =null;


        AmlTree NOT258_tree=null;
        AmlTree PLUS259_tree=null;
        AmlTree MINUS260_tree=null;

        try {
            // src/parser/Music.g:236:9: ( ( NOT ^| PLUS ^| MINUS ^)? atom )
            // src/parser/Music.g:236:13: ( NOT ^| PLUS ^| MINUS ^)? atom
            {
            root_0 = (AmlTree)adaptor.nil();


            // src/parser/Music.g:236:13: ( NOT ^| PLUS ^| MINUS ^)?
            int alt62=4;
            switch ( input.LA(1) ) {
                case NOT:
                    {
                    alt62=1;
                    }
                    break;
                case PLUS:
                    {
                    alt62=2;
                    }
                    break;
                case MINUS:
                    {
                    alt62=3;
                    }
                    break;
            }

            switch (alt62) {
                case 1 :
                    // src/parser/Music.g:236:14: NOT ^
                    {
                    NOT258=(Token)match(input,NOT,FOLLOW_NOT_in_factor3024); 
                    NOT258_tree = 
                    (AmlTree)adaptor.create(NOT258)
                    ;
                    root_0 = (AmlTree)adaptor.becomeRoot(NOT258_tree, root_0);


                    }
                    break;
                case 2 :
                    // src/parser/Music.g:236:21: PLUS ^
                    {
                    PLUS259=(Token)match(input,PLUS,FOLLOW_PLUS_in_factor3029); 
                    PLUS259_tree = 
                    (AmlTree)adaptor.create(PLUS259)
                    ;
                    root_0 = (AmlTree)adaptor.becomeRoot(PLUS259_tree, root_0);


                    }
                    break;
                case 3 :
                    // src/parser/Music.g:236:29: MINUS ^
                    {
                    MINUS260=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor3034); 
                    MINUS260_tree = 
                    (AmlTree)adaptor.create(MINUS260)
                    ;
                    root_0 = (AmlTree)adaptor.becomeRoot(MINUS260_tree, root_0);


                    }
                    break;

            }


            pushFollow(FOLLOW_atom_in_factor3039);
            atom261=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom261.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:239:1: atom : ( id_rule | NUM | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | '(' ! expr ')' !);
    public final MusicParser.atom_return atom() throws RecognitionException {
        MusicParser.atom_return retval = new MusicParser.atom_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token b=null;
        Token NUM263=null;
        Token char_literal264=null;
        Token char_literal266=null;
        MusicParser.id_rule_return id_rule262 =null;

        MusicParser.expr_return expr265 =null;


        AmlTree b_tree=null;
        AmlTree NUM263_tree=null;
        AmlTree char_literal264_tree=null;
        AmlTree char_literal266_tree=null;
        RewriteRuleTokenStream stream_FALSE=new RewriteRuleTokenStream(adaptor,"token FALSE");
        RewriteRuleTokenStream stream_TRUE=new RewriteRuleTokenStream(adaptor,"token TRUE");

        try {
            // src/parser/Music.g:239:9: ( id_rule | NUM | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | '(' ! expr ')' !)
            int alt64=4;
            switch ( input.LA(1) ) {
            case ID:
            case LETTER_X:
                {
                alt64=1;
                }
                break;
            case NUM:
                {
                alt64=2;
                }
                break;
            case FALSE:
            case TRUE:
                {
                alt64=3;
                }
                break;
            case 83:
                {
                alt64=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;

            }

            switch (alt64) {
                case 1 :
                    // src/parser/Music.g:239:13: id_rule
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_id_rule_in_atom3055);
                    id_rule262=id_rule();

                    state._fsp--;

                    adaptor.addChild(root_0, id_rule262.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:240:7: NUM
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    NUM263=(Token)match(input,NUM,FOLLOW_NUM_in_atom3063); 
                    NUM263_tree = 
                    (AmlTree)adaptor.create(NUM263)
                    ;
                    adaptor.addChild(root_0, NUM263_tree);


                    }
                    break;
                case 3 :
                    // src/parser/Music.g:241:7: (b= TRUE |b= FALSE )
                    {
                    // src/parser/Music.g:241:7: (b= TRUE |b= FALSE )
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==TRUE) ) {
                        alt63=1;
                    }
                    else if ( (LA63_0==FALSE) ) {
                        alt63=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 63, 0, input);

                        throw nvae;

                    }
                    switch (alt63) {
                        case 1 :
                            // src/parser/Music.g:241:8: b= TRUE
                            {
                            b=(Token)match(input,TRUE,FOLLOW_TRUE_in_atom3074);  
                            stream_TRUE.add(b);


                            }
                            break;
                        case 2 :
                            // src/parser/Music.g:241:17: b= FALSE
                            {
                            b=(Token)match(input,FALSE,FOLLOW_FALSE_in_atom3080);  
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
                    // 241:27: -> ^( BOOLEAN[$b,$b.text] )
                    {
                        // src/parser/Music.g:241:30: ^( BOOLEAN[$b,$b.text] )
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
                    // src/parser/Music.g:242:7: '(' ! expr ')' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    char_literal264=(Token)match(input,83,FOLLOW_83_in_atom3097); 

                    pushFollow(FOLLOW_expr_in_atom3100);
                    expr265=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr265.getTree());

                    char_literal266=(Token)match(input,84,FOLLOW_84_in_atom3102); 

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


 

    public static final BitSet FOLLOW_global_stmt_in_prog179 = new BitSet(new long[]{0x0200004020000A00L,0x0000000000010020L});
    public static final BitSet FOLLOW_EOF_in_prog183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_global_stmt215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_frag_in_global_stmt233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_song_in_global_stmt251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_rule_in_var_access277 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_var_access278 = new BitSet(new long[]{0x0000010400000000L});
    public static final BitSet FOLLOW_id_rule_in_var_access281 = new BitSet(new long[]{0x0000000000000000L,0x0000000001080000L});
    public static final BitSet FOLLOW_83_in_var_access284 = new BitSet(new long[]{0x2822010404000000L,0x0000000000084000L});
    public static final BitSet FOLLOW_params_in_var_access286 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_var_access288 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_var_access292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_void_in_function378 = new BitSet(new long[]{0x0000010400000000L});
    public static final BitSet FOLLOW_id_rule_in_function382 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_function384 = new BitSet(new long[]{0x0200004000000A00L,0x0000000000100000L});
    public static final BitSet FOLLOW_list_arguments_in_function386 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_function388 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_function390 = new BitSet(new long[]{0x0A00017C10108A80L,0x00000000040208E0L});
    public static final BitSet FOLLOW_listInst_in_function392 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_function394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_rule_in_funcall441 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_funcall443 = new BitSet(new long[]{0x2822010404000000L,0x0000000000184000L});
    public static final BitSet FOLLOW_params_in_funcall445 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_funcall448 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_funcall450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FRAGMENT_in_frag484 = new BitSet(new long[]{0x0000010400000000L});
    public static final BitSet FOLLOW_id_rule_in_frag487 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_frag489 = new BitSet(new long[]{0x0200004000000A00L,0x0000000000100000L});
    public static final BitSet FOLLOW_list_arguments_in_frag492 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_frag494 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_frag497 = new BitSet(new long[]{0x0240015C10008B00L,0x00000000040A0220L});
    public static final BitSet FOLLOW_list_music_inst_in_frag500 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_frag502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_argument_in_list_arguments522 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_list_arguments525 = new BitSet(new long[]{0x0200004000000A00L});
    public static final BitSet FOLLOW_argument_in_list_arguments527 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_type_in_argument568 = new BitSet(new long[]{0x0000010400000000L});
    public static final BitSet FOLLOW_id_rule_in_argument571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_params597 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_params600 = new BitSet(new long[]{0x2822010404000000L,0x0000000000084000L});
    public static final BitSet FOLLOW_expr_in_params603 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_inst_in_listInst630 = new BitSet(new long[]{0x0A00017C10108A82L,0x00000000000208E0L});
    public static final BitSet FOLLOW_music_inst_in_list_music_inst664 = new BitSet(new long[]{0x0240015C10008B02L,0x00000000000A0220L});
    public static final BitSet FOLLOW_declaration_in_inst708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_access_in_inst726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tone_in_inst744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_beat_in_inst762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_speed_in_inst780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instrument_in_inst798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignation_in_inst816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_stmt_in_inst834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_inst852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_stmt_in_inst870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_stmt_in_inst888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_song_in_inst906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compas_list_in_inst924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_music_inst948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_access_in_music_inst966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignation_in_music_inst984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_music_stmt_in_music_inst1002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_music_inst1020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_music_stmt_in_music_inst1038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_music_stmt_in_music_inst1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_song_in_music_inst1074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notes_group_in_music_inst1101 = new BitSet(new long[]{0x0040000000000902L,0x0000000001080200L});
    public static final BitSet FOLLOW_88_in_music_inst1105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_declaration1130 = new BitSet(new long[]{0x0000010400000000L});
    public static final BitSet FOLLOW_assig_opt_in_declaration1133 = new BitSet(new long[]{0x0000000000000000L,0x0000000001200000L});
    public static final BitSet FOLLOW_85_in_declaration1136 = new BitSet(new long[]{0x0000010400000000L});
    public static final BitSet FOLLOW_assig_opt_in_declaration1139 = new BitSet(new long[]{0x0000000000000000L,0x0000000001200000L});
    public static final BitSet FOLLOW_88_in_declaration1143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_type_void1252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOID_in_type_void1270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_rule_in_assig_opt1295 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ASSIG_in_assig_opt1298 = new BitSet(new long[]{0x2862010404000900L,0x0000000000084200L});
    public static final BitSet FOLLOW_expr_in_assig_opt1302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notes_variable_in_assig_opt1306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assig_in_assignation1332 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_assignation1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_rule_in_assig1364 = new BitSet(new long[]{0x4014000000040020L,0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_assig1366 = new BitSet(new long[]{0x2862010404000900L,0x0000000000084200L});
    public static final BitSet FOLLOW_expr_in_assig1382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notes_variable_in_assig1386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_post_in_assig1405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pre_in_assig1423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_rule_in_post1453 = new BitSet(new long[]{0x0000001000008000L});
    public static final BitSet FOLLOW_INCR_in_post1458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECR_in_post1464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INCR_in_pre1511 = new BitSet(new long[]{0x0000010400000000L});
    public static final BitSet FOLLOW_DECR_in_pre1517 = new BitSet(new long[]{0x0000010400000000L});
    public static final BitSet FOLLOW_id_rule_in_pre1520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BEAT_in_beat1563 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_NUM_in_beat1566 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_beat1568 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_NUM_in_beat1571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SPEED_in_speed1600 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_NUM_in_speed1603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRANSPORT_in_transport1628 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_NUM_in_transport1631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUMENT_in_instrument1655 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_STRING_in_instrument1658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_stmt1682 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_while_stmt1685 = new BitSet(new long[]{0x2822010404000000L,0x0000000000084000L});
    public static final BitSet FOLLOW_expr_in_while_stmt1688 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_while_stmt1690 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_while_stmt1693 = new BitSet(new long[]{0x0A00017C10108A80L,0x00000000040208E0L});
    public static final BitSet FOLLOW_listInst_in_while_stmt1696 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_while_stmt1698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_music_stmt1725 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_while_music_stmt1728 = new BitSet(new long[]{0x2822010404000000L,0x0000000000084000L});
    public static final BitSet FOLLOW_expr_in_while_music_stmt1731 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_while_music_stmt1733 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_while_music_stmt1736 = new BitSet(new long[]{0x0240015C10008B00L,0x00000000040A0220L});
    public static final BitSet FOLLOW_list_music_inst_in_while_music_stmt1739 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_while_music_stmt1741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_for_stmt1776 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_for_stmt1779 = new BitSet(new long[]{0x0200015400008A00L});
    public static final BitSet FOLLOW_declaration_in_for_stmt1783 = new BitSet(new long[]{0x2822010404000000L,0x0000000000084000L});
    public static final BitSet FOLLOW_list_assig_in_for_stmt1787 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_for_stmt1789 = new BitSet(new long[]{0x2822010404000000L,0x0000000000084000L});
    public static final BitSet FOLLOW_expr_in_for_stmt1793 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_for_stmt1795 = new BitSet(new long[]{0x0000011400008000L});
    public static final BitSet FOLLOW_list_assig_in_for_stmt1798 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_for_stmt1800 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_for_stmt1803 = new BitSet(new long[]{0x0A00017C10108A80L,0x00000000040208E0L});
    public static final BitSet FOLLOW_listInst_in_for_stmt1806 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_for_stmt1808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_for_music_stmt1833 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_for_music_stmt1836 = new BitSet(new long[]{0x0200015400008A00L});
    public static final BitSet FOLLOW_declaration_in_for_music_stmt1840 = new BitSet(new long[]{0x2822010404000000L,0x0000000000084000L});
    public static final BitSet FOLLOW_list_assig_in_for_music_stmt1844 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_for_music_stmt1846 = new BitSet(new long[]{0x2822010404000000L,0x0000000000084000L});
    public static final BitSet FOLLOW_expr_in_for_music_stmt1850 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_for_music_stmt1852 = new BitSet(new long[]{0x0000011400008000L});
    public static final BitSet FOLLOW_list_assig_in_for_music_stmt1855 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_for_music_stmt1857 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_for_music_stmt1860 = new BitSet(new long[]{0x0240015C10008B00L,0x00000000040A0220L});
    public static final BitSet FOLLOW_list_music_inst_in_for_music_stmt1863 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_for_music_stmt1865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assig_in_list_assig1894 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_list_assig1897 = new BitSet(new long[]{0x0000011400008000L});
    public static final BitSet FOLLOW_assig_in_list_assig1899 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_IF_in_if_stmt1937 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_if_stmt1940 = new BitSet(new long[]{0x2822010404000000L,0x0000000000084000L});
    public static final BitSet FOLLOW_expr_in_if_stmt1943 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_if_stmt1945 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_if_stmt1948 = new BitSet(new long[]{0x0A00017C10108A80L,0x00000000040208E0L});
    public static final BitSet FOLLOW_listInst_in_if_stmt1951 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_if_stmt1953 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_elseif_stmt_in_if_stmt1956 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_else_stmt_in_if_stmt1959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_elseif_stmt1983 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_IF_in_elseif_stmt1985 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_elseif_stmt1987 = new BitSet(new long[]{0x2822010404000000L,0x0000000000084000L});
    public static final BitSet FOLLOW_expr_in_elseif_stmt1989 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_elseif_stmt1991 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_elseif_stmt1993 = new BitSet(new long[]{0x0A00017C10108A80L,0x00000000040208E0L});
    public static final BitSet FOLLOW_listInst_in_elseif_stmt1995 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_elseif_stmt1997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_else_stmt2032 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_else_stmt2035 = new BitSet(new long[]{0x0A00017C10108A80L,0x00000000040208E0L});
    public static final BitSet FOLLOW_listInst_in_else_stmt2038 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_else_stmt2040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_if_music_stmt2066 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_if_music_stmt2069 = new BitSet(new long[]{0x2822010404000000L,0x0000000000084000L});
    public static final BitSet FOLLOW_expr_in_if_music_stmt2072 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_if_music_stmt2074 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_if_music_stmt2077 = new BitSet(new long[]{0x0240015C10008B00L,0x00000000040A0220L});
    public static final BitSet FOLLOW_list_music_inst_in_if_music_stmt2080 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_if_music_stmt2082 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_elseif_music_stmt_in_if_music_stmt2085 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_else_music_stmt_in_if_music_stmt2088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_elseif_music_stmt2118 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_IF_in_elseif_music_stmt2120 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_elseif_music_stmt2122 = new BitSet(new long[]{0x2822010404000000L,0x0000000000084000L});
    public static final BitSet FOLLOW_expr_in_elseif_music_stmt2124 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_elseif_music_stmt2126 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_elseif_music_stmt2128 = new BitSet(new long[]{0x0240015C10008B00L,0x00000000040A0220L});
    public static final BitSet FOLLOW_list_music_inst_in_elseif_music_stmt2130 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_elseif_music_stmt2132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_else_music_stmt2173 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_else_music_stmt2176 = new BitSet(new long[]{0x0240015C10008B00L,0x00000000040A0220L});
    public static final BitSet FOLLOW_list_music_inst_in_else_music_stmt2179 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_else_music_stmt2181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SONG_in_song2216 = new BitSet(new long[]{0x0000010400000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_id_rule_in_song2219 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_song2222 = new BitSet(new long[]{0x0000000000000080L,0x0000000000003040L});
    public static final BitSet FOLLOW_beat_in_song2225 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003040L});
    public static final BitSet FOLLOW_speed_in_song2228 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_transport_in_song2231 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_track_in_song2235 = new BitSet(new long[]{0x0000000000000000L,0x0000000004001000L});
    public static final BitSet FOLLOW_90_in_song2239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRACK_in_track2269 = new BitSet(new long[]{0x0800010400100000L,0x0000000000000180L});
    public static final BitSet FOLLOW_id_rule_in_track2272 = new BitSet(new long[]{0x0800000000100000L,0x0000000000000180L});
    public static final BitSet FOLLOW_STRING_in_track2275 = new BitSet(new long[]{0x0800000000100000L,0x0000000000000080L});
    public static final BitSet FOLLOW_compas_aux_in_track2278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compas_list_in_compas_aux2302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_BAR_in_compas_list2332 = new BitSet(new long[]{0x0A40015C10108B00L,0x00000000000A0AA0L});
    public static final BitSet FOLLOW_repetition_in_compas_list2337 = new BitSet(new long[]{0x0A40015C10108B00L,0x00000000000A0AA0L});
    public static final BitSet FOLLOW_compasses_in_compas_list2341 = new BitSet(new long[]{0x0A40015C10108B00L,0x00000000000A0AA0L});
    public static final BitSet FOLLOW_repetition_in_compas_list2345 = new BitSet(new long[]{0x0A40015C10108B00L,0x00000000000A0AA0L});
    public static final BitSet FOLLOW_DOUBLE_BAR_in_compas_list2350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compas_in_compasses2377 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_BAR_in_compasses2380 = new BitSet(new long[]{0x0240015C10008B00L,0x00000000000A0A20L});
    public static final BitSet FOLLOW_compas_in_compasses2383 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_NUM_in_repetition2410 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_LETTER_X_in_repetition2412 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_START_REPETITION_in_repetition2416 = new BitSet(new long[]{0x0240015C10008B00L,0x00000000000A0A20L});
    public static final BitSet FOLLOW_compasses_in_repetition2418 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_END_REPETITION_in_repetition2420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tone_in_compas2461 = new BitSet(new long[]{0x0240015C10008B00L,0x00000000000A0220L});
    public static final BitSet FOLLOW_music_inst_in_compas2474 = new BitSet(new long[]{0x0240015C10008B02L,0x00000000000A0220L});
    public static final BitSet FOLLOW_TONE_in_tone2521 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_NUM_in_tone2524 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000200L});
    public static final BitSet FOLLOW_set_in_tone2526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notes_type_in_notes_group2555 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400400L});
    public static final BitSet FOLLOW_86_in_notes_group2558 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_FIGURE_in_notes_group2560 = new BitSet(new long[]{0x0000000000080002L,0x0000000000000400L});
    public static final BitSet FOLLOW_DOT_in_notes_group2562 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_TIE_in_notes_group2567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notes_type_in_notes_variable2609 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_notes_variable2612 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_FIGURE_in_notes_variable2614 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_DOT_in_notes_variable2616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_chord_in_notes_type2659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notes_in_notes_type2663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHORD_in_chord2692 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_chord2695 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_NOTE_in_chord2698 = new BitSet(new long[]{0x2001800000010000L,0x0000000000100010L});
    public static final BitSet FOLLOW_84_in_chord2716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_notes2748 = new BitSet(new long[]{0x0040000000000100L,0x0000000000000200L});
    public static final BitSet FOLLOW_note_in_notes2751 = new BitSet(new long[]{0x0040000000000100L,0x0000000000100200L});
    public static final BitSet FOLLOW_84_in_notes2755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_note_in_notes2760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOTE_in_note2809 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_MINUS_in_note2813 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_NUM_in_note2816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolterm_in_expr2845 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_OR_in_expr2848 = new BitSet(new long[]{0x2822010404000000L,0x0000000000084000L});
    public static final BitSet FOLLOW_boolterm_in_expr2851 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_boolfact_in_boolterm2869 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_boolterm2872 = new BitSet(new long[]{0x2822010404000000L,0x0000000000084000L});
    public static final BitSet FOLLOW_boolfact_in_boolterm2875 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_num_expr_in_boolfact2897 = new BitSet(new long[]{0x0400408301000002L});
    public static final BitSet FOLLOW_EQUAL_in_boolfact2901 = new BitSet(new long[]{0x2822010404000000L,0x0000000000084000L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_boolfact2906 = new BitSet(new long[]{0x2822010404000000L,0x0000000000084000L});
    public static final BitSet FOLLOW_LT_in_boolfact2911 = new BitSet(new long[]{0x2822010404000000L,0x0000000000084000L});
    public static final BitSet FOLLOW_LE_in_boolfact2916 = new BitSet(new long[]{0x2822010404000000L,0x0000000000084000L});
    public static final BitSet FOLLOW_GT_in_boolfact2921 = new BitSet(new long[]{0x2822010404000000L,0x0000000000084000L});
    public static final BitSet FOLLOW_GE_in_boolfact2926 = new BitSet(new long[]{0x2822010404000000L,0x0000000000084000L});
    public static final BitSet FOLLOW_num_expr_in_boolfact2930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_num_expr2952 = new BitSet(new long[]{0x2002000000000002L});
    public static final BitSet FOLLOW_PLUS_in_num_expr2957 = new BitSet(new long[]{0x2822010404000000L,0x0000000000084000L});
    public static final BitSet FOLLOW_MINUS_in_num_expr2962 = new BitSet(new long[]{0x2822010404000000L,0x0000000000084000L});
    public static final BitSet FOLLOW_term_in_num_expr2966 = new BitSet(new long[]{0x2002000000000002L});
    public static final BitSet FOLLOW_factor_in_term2988 = new BitSet(new long[]{0x00080000000A0002L});
    public static final BitSet FOLLOW_DOT_in_term2993 = new BitSet(new long[]{0x2822010404000000L,0x0000000000084000L});
    public static final BitSet FOLLOW_DIV_in_term2998 = new BitSet(new long[]{0x2822010404000000L,0x0000000000084000L});
    public static final BitSet FOLLOW_MOD_in_term3003 = new BitSet(new long[]{0x2822010404000000L,0x0000000000084000L});
    public static final BitSet FOLLOW_factor_in_term3007 = new BitSet(new long[]{0x00080000000A0002L});
    public static final BitSet FOLLOW_NOT_in_factor3024 = new BitSet(new long[]{0x0800010404000000L,0x0000000000084000L});
    public static final BitSet FOLLOW_PLUS_in_factor3029 = new BitSet(new long[]{0x0800010404000000L,0x0000000000084000L});
    public static final BitSet FOLLOW_MINUS_in_factor3034 = new BitSet(new long[]{0x0800010404000000L,0x0000000000084000L});
    public static final BitSet FOLLOW_atom_in_factor3039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_rule_in_atom3055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUM_in_atom3063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_atom3074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_atom3080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_atom3097 = new BitSet(new long[]{0x2822010404000000L,0x0000000000084000L});
    public static final BitSet FOLLOW_expr_in_atom3100 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_atom3102 = new BitSet(new long[]{0x0000000000000002L});

}