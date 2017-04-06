// $ANTLR 3.4 src/parser/Music.g 2017-04-06 13:53:04

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ASSIG", "BAR", "BEAT", "BEMOL", "BOOL", "BOOLEAN", "CHORD", "COMMENT", "COMPAS", "COMPAS_LIST", "DECR", "DIMINUTION", "DIV", "DIVIDE_ASSIG", "DOT", "DOUBLE_BAR", "ELSE", "ELSEIF", "END_REPETITION", "EQUAL", "ESC_SEQ", "FALSE", "FIGURE", "FOR", "FRAGMENT", "FUNCALL", "FUNCTION", "GE", "GT", "ID", "IF", "INCR", "INSTRUMENT", "INT", "LE", "LIST_ARGUMENTS", "LIST_ASSIG", "LIST_FUNCTIONS", "LIST_INSTRUCTIONS", "LIST_MUSIC_INST", "LT", "MAJ7", "MINOR", "MINUS", "MINUS_ASSIG", "MOD", "MOD_ASSIG", "NOT", "NOTE", "NOTES", "NOTE_LIST", "NOTE_TYPE", "NOT_EQUAL", "NUM", "OR", "PLUS", "PLUS_ASSIG", "POST", "PRE", "PROD_ASSIG", "REPETITION", "RETURN", "SEVENTH", "SONG", "SPEED", "START_REPETITION", "STRING", "SUSTAIN", "TIE", "TONE", "TRACK", "TRANSPORT", "TRUE", "VOID", "WHILE", "WS", "'('", "')'", "','", "'.'", "':'", "';'", "'x'", "'{'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;
    public static final int T__88=88;
    public static final int T__89=89;
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
    public static final int LIST_ARGUMENTS=40;
    public static final int LIST_ASSIG=41;
    public static final int LIST_FUNCTIONS=42;
    public static final int LIST_INSTRUCTIONS=43;
    public static final int LIST_MUSIC_INST=44;
    public static final int LT=45;
    public static final int MAJ7=46;
    public static final int MINOR=47;
    public static final int MINUS=48;
    public static final int MINUS_ASSIG=49;
    public static final int MOD=50;
    public static final int MOD_ASSIG=51;
    public static final int NOT=52;
    public static final int NOTE=53;
    public static final int NOTES=54;
    public static final int NOTE_LIST=55;
    public static final int NOTE_TYPE=56;
    public static final int NOT_EQUAL=57;
    public static final int NUM=58;
    public static final int OR=59;
    public static final int PLUS=60;
    public static final int PLUS_ASSIG=61;
    public static final int POST=62;
    public static final int PRE=63;
    public static final int PROD_ASSIG=64;
    public static final int REPETITION=65;
    public static final int RETURN=66;
    public static final int SEVENTH=67;
    public static final int SONG=68;
    public static final int SPEED=69;
    public static final int START_REPETITION=70;
    public static final int STRING=71;
    public static final int SUSTAIN=72;
    public static final int TIE=73;
    public static final int TONE=74;
    public static final int TRACK=75;
    public static final int TRANSPORT=76;
    public static final int TRUE=77;
    public static final int VOID=78;
    public static final int WHILE=79;
    public static final int WS=80;

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
    // src/parser/Music.g:38:1: prog : ( global_stmt )+ EOF -> ^( LIST_FUNCTIONS ( global_stmt )+ ) ;
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
            // src/parser/Music.g:38:10: ( ( global_stmt )+ EOF -> ^( LIST_FUNCTIONS ( global_stmt )+ ) )
            // src/parser/Music.g:38:14: ( global_stmt )+ EOF
            {
            // src/parser/Music.g:38:14: ( global_stmt )+
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
            	    // src/parser/Music.g:38:15: global_stmt
            	    {
            	    pushFollow(FOLLOW_global_stmt_in_prog172);
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


            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_prog176);  
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
            // 38:33: -> ^( LIST_FUNCTIONS ( global_stmt )+ )
            {
                // src/parser/Music.g:38:36: ^( LIST_FUNCTIONS ( global_stmt )+ )
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
    // src/parser/Music.g:41:1: global_stmt : ( function | frag | song );
    public final MusicParser.global_stmt_return global_stmt() throws RecognitionException {
        MusicParser.global_stmt_return retval = new MusicParser.global_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        MusicParser.function_return function3 =null;

        MusicParser.frag_return frag4 =null;

        MusicParser.song_return song5 =null;



        try {
            // src/parser/Music.g:41:13: ( function | frag | song )
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
                    // src/parser/Music.g:41:17: function
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_function_in_global_stmt208);
                    function3=function();

                    state._fsp--;

                    adaptor.addChild(root_0, function3.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:42:17: frag
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_frag_in_global_stmt226);
                    frag4=frag();

                    state._fsp--;

                    adaptor.addChild(root_0, frag4.getTree());

                    }
                    break;
                case 3 :
                    // src/parser/Music.g:43:17: song
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_song_in_global_stmt244);
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


    public static class function_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "function"
    // src/parser/Music.g:46:1: function : type_void id= ID '(' list_arguments ')' '{' listInst '}' -> ^( FUNCTION[$id.text] type_void list_arguments listInst ) ;
    public final MusicParser.function_return function() throws RecognitionException {
        MusicParser.function_return retval = new MusicParser.function_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token id=null;
        Token char_literal7=null;
        Token char_literal9=null;
        Token char_literal10=null;
        Token char_literal12=null;
        MusicParser.type_void_return type_void6 =null;

        MusicParser.list_arguments_return list_arguments8 =null;

        MusicParser.listInst_return listInst11 =null;


        AmlTree id_tree=null;
        AmlTree char_literal7_tree=null;
        AmlTree char_literal9_tree=null;
        AmlTree char_literal10_tree=null;
        AmlTree char_literal12_tree=null;
        RewriteRuleTokenStream stream_88=new RewriteRuleTokenStream(adaptor,"token 88");
        RewriteRuleTokenStream stream_89=new RewriteRuleTokenStream(adaptor,"token 89");
        RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
        RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_listInst=new RewriteRuleSubtreeStream(adaptor,"rule listInst");
        RewriteRuleSubtreeStream stream_type_void=new RewriteRuleSubtreeStream(adaptor,"rule type_void");
        RewriteRuleSubtreeStream stream_list_arguments=new RewriteRuleSubtreeStream(adaptor,"rule list_arguments");
        try {
            // src/parser/Music.g:46:13: ( type_void id= ID '(' list_arguments ')' '{' listInst '}' -> ^( FUNCTION[$id.text] type_void list_arguments listInst ) )
            // src/parser/Music.g:46:16: type_void id= ID '(' list_arguments ')' '{' listInst '}'
            {
            pushFollow(FOLLOW_type_void_in_function269);
            type_void6=type_void();

            state._fsp--;

            stream_type_void.add(type_void6.getTree());

            id=(Token)match(input,ID,FOLLOW_ID_in_function273);  
            stream_ID.add(id);


            char_literal7=(Token)match(input,81,FOLLOW_81_in_function275);  
            stream_81.add(char_literal7);


            pushFollow(FOLLOW_list_arguments_in_function277);
            list_arguments8=list_arguments();

            state._fsp--;

            stream_list_arguments.add(list_arguments8.getTree());

            char_literal9=(Token)match(input,82,FOLLOW_82_in_function279);  
            stream_82.add(char_literal9);


            char_literal10=(Token)match(input,88,FOLLOW_88_in_function281);  
            stream_88.add(char_literal10);


            pushFollow(FOLLOW_listInst_in_function283);
            listInst11=listInst();

            state._fsp--;

            stream_listInst.add(listInst11.getTree());

            char_literal12=(Token)match(input,89,FOLLOW_89_in_function285);  
            stream_89.add(char_literal12);


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
            // 46:75: -> ^( FUNCTION[$id.text] type_void list_arguments listInst )
            {
                // src/parser/Music.g:46:80: ^( FUNCTION[$id.text] type_void list_arguments listInst )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(FUNCTION, (id!=null?id.getText():null))
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


    public static class frag_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "frag"
    // src/parser/Music.g:49:1: frag : FRAGMENT ^ ID '(' ! list_arguments ')' ! '{' ! list_music_inst '}' !;
    public final MusicParser.frag_return frag() throws RecognitionException {
        MusicParser.frag_return retval = new MusicParser.frag_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token FRAGMENT13=null;
        Token ID14=null;
        Token char_literal15=null;
        Token char_literal17=null;
        Token char_literal18=null;
        Token char_literal20=null;
        MusicParser.list_arguments_return list_arguments16 =null;

        MusicParser.list_music_inst_return list_music_inst19 =null;


        AmlTree FRAGMENT13_tree=null;
        AmlTree ID14_tree=null;
        AmlTree char_literal15_tree=null;
        AmlTree char_literal17_tree=null;
        AmlTree char_literal18_tree=null;
        AmlTree char_literal20_tree=null;

        try {
            // src/parser/Music.g:49:9: ( FRAGMENT ^ ID '(' ! list_arguments ')' ! '{' ! list_music_inst '}' !)
            // src/parser/Music.g:49:11: FRAGMENT ^ ID '(' ! list_arguments ')' ! '{' ! list_music_inst '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            FRAGMENT13=(Token)match(input,FRAGMENT,FOLLOW_FRAGMENT_in_frag327); 
            FRAGMENT13_tree = 
            (AmlTree)adaptor.create(FRAGMENT13)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(FRAGMENT13_tree, root_0);


            ID14=(Token)match(input,ID,FOLLOW_ID_in_frag330); 
            ID14_tree = 
            (AmlTree)adaptor.create(ID14)
            ;
            adaptor.addChild(root_0, ID14_tree);


            char_literal15=(Token)match(input,81,FOLLOW_81_in_frag332); 

            pushFollow(FOLLOW_list_arguments_in_frag335);
            list_arguments16=list_arguments();

            state._fsp--;

            adaptor.addChild(root_0, list_arguments16.getTree());

            char_literal17=(Token)match(input,82,FOLLOW_82_in_frag337); 

            char_literal18=(Token)match(input,88,FOLLOW_88_in_frag340); 

            pushFollow(FOLLOW_list_music_inst_in_frag343);
            list_music_inst19=list_music_inst();

            state._fsp--;

            adaptor.addChild(root_0, list_music_inst19.getTree());

            char_literal20=(Token)match(input,89,FOLLOW_89_in_frag345); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:52:1: list_arguments : ( argument ( ',' argument )* )? -> ^( LIST_ARGUMENTS ( argument )* ) ;
    public final MusicParser.list_arguments_return list_arguments() throws RecognitionException {
        MusicParser.list_arguments_return retval = new MusicParser.list_arguments_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal22=null;
        MusicParser.argument_return argument21 =null;

        MusicParser.argument_return argument23 =null;


        AmlTree char_literal22_tree=null;
        RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
        RewriteRuleSubtreeStream stream_argument=new RewriteRuleSubtreeStream(adaptor,"rule argument");
        try {
            // src/parser/Music.g:52:17: ( ( argument ( ',' argument )* )? -> ^( LIST_ARGUMENTS ( argument )* ) )
            // src/parser/Music.g:52:19: ( argument ( ',' argument )* )?
            {
            // src/parser/Music.g:52:19: ( argument ( ',' argument )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==BOOL||LA4_0==CHORD||LA4_0==INT||LA4_0==NOTE_TYPE) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // src/parser/Music.g:52:20: argument ( ',' argument )*
                    {
                    pushFollow(FOLLOW_argument_in_list_arguments365);
                    argument21=argument();

                    state._fsp--;

                    stream_argument.add(argument21.getTree());

                    // src/parser/Music.g:52:29: ( ',' argument )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==83) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // src/parser/Music.g:52:30: ',' argument
                    	    {
                    	    char_literal22=(Token)match(input,83,FOLLOW_83_in_list_arguments368);  
                    	    stream_83.add(char_literal22);


                    	    pushFollow(FOLLOW_argument_in_list_arguments370);
                    	    argument23=argument();

                    	    state._fsp--;

                    	    stream_argument.add(argument23.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
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
            // 52:47: -> ^( LIST_ARGUMENTS ( argument )* )
            {
                // src/parser/Music.g:52:50: ^( LIST_ARGUMENTS ( argument )* )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(LIST_ARGUMENTS, "LIST_ARGUMENTS")
                , root_1);

                // src/parser/Music.g:52:67: ( argument )*
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
    // src/parser/Music.g:55:1: argument : type ^ ID ;
    public final MusicParser.argument_return argument() throws RecognitionException {
        MusicParser.argument_return retval = new MusicParser.argument_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token ID25=null;
        MusicParser.type_return type24 =null;


        AmlTree ID25_tree=null;

        try {
            // src/parser/Music.g:55:11: ( type ^ ID )
            // src/parser/Music.g:55:15: type ^ ID
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_type_in_argument411);
            type24=type();

            state._fsp--;

            root_0 = (AmlTree)adaptor.becomeRoot(type24.getTree(), root_0);

            ID25=(Token)match(input,ID,FOLLOW_ID_in_argument414); 
            ID25_tree = 
            (AmlTree)adaptor.create(ID25)
            ;
            adaptor.addChild(root_0, ID25_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:58:1: params : expr ( ',' ! expr )* ;
    public final MusicParser.params_return params() throws RecognitionException {
        MusicParser.params_return retval = new MusicParser.params_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal27=null;
        MusicParser.expr_return expr26 =null;

        MusicParser.expr_return expr28 =null;


        AmlTree char_literal27_tree=null;

        try {
            // src/parser/Music.g:58:13: ( expr ( ',' ! expr )* )
            // src/parser/Music.g:58:17: expr ( ',' ! expr )*
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_expr_in_params440);
            expr26=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr26.getTree());

            // src/parser/Music.g:58:22: ( ',' ! expr )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==83) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // src/parser/Music.g:58:23: ',' ! expr
            	    {
            	    char_literal27=(Token)match(input,83,FOLLOW_83_in_params443); 

            	    pushFollow(FOLLOW_expr_in_params446);
            	    expr28=expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr28.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
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
    // src/parser/Music.g:61:1: listInst : ( inst )* -> ^( LIST_INSTRUCTIONS ( inst )* ) ;
    public final MusicParser.listInst_return listInst() throws RecognitionException {
        MusicParser.listInst_return retval = new MusicParser.listInst_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        MusicParser.inst_return inst29 =null;


        RewriteRuleSubtreeStream stream_inst=new RewriteRuleSubtreeStream(adaptor,"rule inst");
        try {
            // src/parser/Music.g:61:13: ( ( inst )* -> ^( LIST_INSTRUCTIONS ( inst )* ) )
            // src/parser/Music.g:61:16: ( inst )*
            {
            // src/parser/Music.g:61:16: ( inst )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==BEAT||LA6_0==BOOL||LA6_0==CHORD||LA6_0==DECR||LA6_0==DOUBLE_BAR||LA6_0==FOR||(LA6_0 >= ID && LA6_0 <= INT)||LA6_0==NOTE_TYPE||LA6_0==NUM||(LA6_0 >= SONG && LA6_0 <= START_REPETITION)||LA6_0==TONE||LA6_0==WHILE) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // src/parser/Music.g:61:16: inst
            	    {
            	    pushFollow(FOLLOW_inst_in_listInst473);
            	    inst29=inst();

            	    state._fsp--;

            	    stream_inst.add(inst29.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
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
            // 61:23: -> ^( LIST_INSTRUCTIONS ( inst )* )
            {
                // src/parser/Music.g:61:26: ^( LIST_INSTRUCTIONS ( inst )* )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(LIST_INSTRUCTIONS, "LIST_INSTRUCTIONS")
                , root_1);

                // src/parser/Music.g:61:46: ( inst )*
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
    // src/parser/Music.g:64:1: list_music_inst : ( music_inst )* -> ^( LIST_MUSIC_INST ( music_inst )* ) ;
    public final MusicParser.list_music_inst_return list_music_inst() throws RecognitionException {
        MusicParser.list_music_inst_return retval = new MusicParser.list_music_inst_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        MusicParser.music_inst_return music_inst30 =null;


        RewriteRuleSubtreeStream stream_music_inst=new RewriteRuleSubtreeStream(adaptor,"rule music_inst");
        try {
            // src/parser/Music.g:64:17: ( ( music_inst )* -> ^( LIST_MUSIC_INST ( music_inst )* ) )
            // src/parser/Music.g:64:21: ( music_inst )*
            {
            // src/parser/Music.g:64:21: ( music_inst )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0 >= BEMOL && LA7_0 <= BOOL)||LA7_0==CHORD||LA7_0==DECR||LA7_0==FOR||(LA7_0 >= ID && LA7_0 <= INCR)||LA7_0==INT||LA7_0==NOTE||LA7_0==NOTE_TYPE||LA7_0==SONG||LA7_0==SUSTAIN||LA7_0==WHILE||LA7_0==81) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // src/parser/Music.g:64:21: music_inst
            	    {
            	    pushFollow(FOLLOW_music_inst_in_list_music_inst507);
            	    music_inst30=music_inst();

            	    state._fsp--;

            	    stream_music_inst.add(music_inst30.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
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
            // 64:33: -> ^( LIST_MUSIC_INST ( music_inst )* )
            {
                // src/parser/Music.g:64:36: ^( LIST_MUSIC_INST ( music_inst )* )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(LIST_MUSIC_INST, "LIST_MUSIC_INST")
                , root_1);

                // src/parser/Music.g:64:54: ( music_inst )*
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
    // src/parser/Music.g:67:1: inst : ( declaration | tone | beat | speed | instrument | assignation | while_stmt | funcall | for_stmt | if_stmt | song | compas_list );
    public final MusicParser.inst_return inst() throws RecognitionException {
        MusicParser.inst_return retval = new MusicParser.inst_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        MusicParser.declaration_return declaration31 =null;

        MusicParser.tone_return tone32 =null;

        MusicParser.beat_return beat33 =null;

        MusicParser.speed_return speed34 =null;

        MusicParser.instrument_return instrument35 =null;

        MusicParser.assignation_return assignation36 =null;

        MusicParser.while_stmt_return while_stmt37 =null;

        MusicParser.funcall_return funcall38 =null;

        MusicParser.for_stmt_return for_stmt39 =null;

        MusicParser.if_stmt_return if_stmt40 =null;

        MusicParser.song_return song41 =null;

        MusicParser.compas_list_return compas_list42 =null;



        try {
            // src/parser/Music.g:67:13: ( declaration | tone | beat | speed | instrument | assignation | while_stmt | funcall | for_stmt | if_stmt | song | compas_list )
            int alt8=12;
            switch ( input.LA(1) ) {
            case BOOL:
            case CHORD:
            case INT:
            case NOTE_TYPE:
                {
                alt8=1;
                }
                break;
            case TONE:
                {
                alt8=2;
                }
                break;
            case BEAT:
                {
                alt8=3;
                }
                break;
            case SPEED:
                {
                alt8=4;
                }
                break;
            case INSTRUMENT:
                {
                alt8=5;
                }
                break;
            case ID:
                {
                int LA8_6 = input.LA(2);

                if ( (LA8_6==ASSIG||LA8_6==DECR||LA8_6==DIVIDE_ASSIG||LA8_6==INCR||LA8_6==MINUS_ASSIG||LA8_6==MOD_ASSIG||LA8_6==PLUS_ASSIG||LA8_6==PROD_ASSIG) ) {
                    alt8=6;
                }
                else if ( (LA8_6==81) ) {
                    alt8=8;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 6, input);

                    throw nvae;

                }
                }
                break;
            case DECR:
            case INCR:
                {
                alt8=6;
                }
                break;
            case WHILE:
                {
                alt8=7;
                }
                break;
            case FOR:
                {
                alt8=9;
                }
                break;
            case IF:
                {
                alt8=10;
                }
                break;
            case SONG:
                {
                alt8=11;
                }
                break;
            case DOUBLE_BAR:
            case NUM:
            case START_REPETITION:
                {
                alt8=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }

            switch (alt8) {
                case 1 :
                    // src/parser/Music.g:67:17: declaration
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_declaration_in_inst551);
                    declaration31=declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, declaration31.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:68:17: tone
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_tone_in_inst569);
                    tone32=tone();

                    state._fsp--;

                    adaptor.addChild(root_0, tone32.getTree());

                    }
                    break;
                case 3 :
                    // src/parser/Music.g:69:17: beat
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_beat_in_inst587);
                    beat33=beat();

                    state._fsp--;

                    adaptor.addChild(root_0, beat33.getTree());

                    }
                    break;
                case 4 :
                    // src/parser/Music.g:70:17: speed
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_speed_in_inst605);
                    speed34=speed();

                    state._fsp--;

                    adaptor.addChild(root_0, speed34.getTree());

                    }
                    break;
                case 5 :
                    // src/parser/Music.g:71:17: instrument
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_instrument_in_inst623);
                    instrument35=instrument();

                    state._fsp--;

                    adaptor.addChild(root_0, instrument35.getTree());

                    }
                    break;
                case 6 :
                    // src/parser/Music.g:72:17: assignation
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_assignation_in_inst641);
                    assignation36=assignation();

                    state._fsp--;

                    adaptor.addChild(root_0, assignation36.getTree());

                    }
                    break;
                case 7 :
                    // src/parser/Music.g:73:17: while_stmt
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_while_stmt_in_inst659);
                    while_stmt37=while_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, while_stmt37.getTree());

                    }
                    break;
                case 8 :
                    // src/parser/Music.g:74:17: funcall
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_inst677);
                    funcall38=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall38.getTree());

                    }
                    break;
                case 9 :
                    // src/parser/Music.g:75:17: for_stmt
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_for_stmt_in_inst695);
                    for_stmt39=for_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, for_stmt39.getTree());

                    }
                    break;
                case 10 :
                    // src/parser/Music.g:76:17: if_stmt
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_if_stmt_in_inst713);
                    if_stmt40=if_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, if_stmt40.getTree());

                    }
                    break;
                case 11 :
                    // src/parser/Music.g:77:17: song
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_song_in_inst731);
                    song41=song();

                    state._fsp--;

                    adaptor.addChild(root_0, song41.getTree());

                    }
                    break;
                case 12 :
                    // src/parser/Music.g:78:17: compas_list
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_compas_list_in_inst749);
                    compas_list42=compas_list();

                    state._fsp--;

                    adaptor.addChild(root_0, compas_list42.getTree());

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
    // src/parser/Music.g:81:1: music_inst : ( declaration | assignation | while_music_stmt | funcall | for_music_stmt | if_music_stmt | song | ( options {greedy=true; } : notes_group )+ ( ';' !)? );
    public final MusicParser.music_inst_return music_inst() throws RecognitionException {
        MusicParser.music_inst_return retval = new MusicParser.music_inst_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal51=null;
        MusicParser.declaration_return declaration43 =null;

        MusicParser.assignation_return assignation44 =null;

        MusicParser.while_music_stmt_return while_music_stmt45 =null;

        MusicParser.funcall_return funcall46 =null;

        MusicParser.for_music_stmt_return for_music_stmt47 =null;

        MusicParser.if_music_stmt_return if_music_stmt48 =null;

        MusicParser.song_return song49 =null;

        MusicParser.notes_group_return notes_group50 =null;


        AmlTree char_literal51_tree=null;

        try {
            // src/parser/Music.g:81:13: ( declaration | assignation | while_music_stmt | funcall | for_music_stmt | if_music_stmt | song | ( options {greedy=true; } : notes_group )+ ( ';' !)? )
            int alt11=8;
            switch ( input.LA(1) ) {
            case CHORD:
                {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==81) ) {
                    alt11=8;
                }
                else if ( (LA11_1==ID) ) {
                    alt11=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;

                }
                }
                break;
            case ID:
                {
                int LA11_2 = input.LA(2);

                if ( (LA11_2==ASSIG||LA11_2==DECR||LA11_2==DIVIDE_ASSIG||LA11_2==INCR||LA11_2==MINUS_ASSIG||LA11_2==MOD_ASSIG||LA11_2==PLUS_ASSIG||LA11_2==PROD_ASSIG) ) {
                    alt11=2;
                }
                else if ( (LA11_2==81) ) {
                    alt11=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 2, input);

                    throw nvae;

                }
                }
                break;
            case DECR:
            case INCR:
                {
                alt11=2;
                }
                break;
            case WHILE:
                {
                alt11=3;
                }
                break;
            case FOR:
                {
                alt11=5;
                }
                break;
            case IF:
                {
                alt11=6;
                }
                break;
            case SONG:
                {
                alt11=7;
                }
                break;
            case BOOL:
            case INT:
            case NOTE_TYPE:
                {
                alt11=1;
                }
                break;
            case BEMOL:
            case NOTE:
            case SUSTAIN:
            case 81:
                {
                alt11=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }

            switch (alt11) {
                case 1 :
                    // src/parser/Music.g:81:17: declaration
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_declaration_in_music_inst773);
                    declaration43=declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, declaration43.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:82:17: assignation
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_assignation_in_music_inst791);
                    assignation44=assignation();

                    state._fsp--;

                    adaptor.addChild(root_0, assignation44.getTree());

                    }
                    break;
                case 3 :
                    // src/parser/Music.g:83:17: while_music_stmt
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_while_music_stmt_in_music_inst809);
                    while_music_stmt45=while_music_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, while_music_stmt45.getTree());

                    }
                    break;
                case 4 :
                    // src/parser/Music.g:84:17: funcall
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_music_inst827);
                    funcall46=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall46.getTree());

                    }
                    break;
                case 5 :
                    // src/parser/Music.g:85:17: for_music_stmt
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_for_music_stmt_in_music_inst845);
                    for_music_stmt47=for_music_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, for_music_stmt47.getTree());

                    }
                    break;
                case 6 :
                    // src/parser/Music.g:86:17: if_music_stmt
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_if_music_stmt_in_music_inst863);
                    if_music_stmt48=if_music_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, if_music_stmt48.getTree());

                    }
                    break;
                case 7 :
                    // src/parser/Music.g:87:17: song
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_song_in_music_inst881);
                    song49=song();

                    state._fsp--;

                    adaptor.addChild(root_0, song49.getTree());

                    }
                    break;
                case 8 :
                    // src/parser/Music.g:88:16: ( options {greedy=true; } : notes_group )+ ( ';' !)?
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    // src/parser/Music.g:88:16: ( options {greedy=true; } : notes_group )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        switch ( input.LA(1) ) {
                        case CHORD:
                            {
                            alt9=1;
                            }
                            break;
                        case 81:
                            {
                            alt9=1;
                            }
                            break;
                        case BEMOL:
                        case SUSTAIN:
                            {
                            alt9=1;
                            }
                            break;
                        case NOTE:
                            {
                            alt9=1;
                            }
                            break;

                        }

                        switch (alt9) {
                    	case 1 :
                    	    // src/parser/Music.g:88:42: notes_group
                    	    {
                    	    pushFollow(FOLLOW_notes_group_in_music_inst908);
                    	    notes_group50=notes_group();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, notes_group50.getTree());

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


                    // src/parser/Music.g:88:59: ( ';' !)?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==86) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // src/parser/Music.g:88:59: ';' !
                            {
                            char_literal51=(Token)match(input,86,FOLLOW_86_in_music_inst912); 

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
    // src/parser/Music.g:91:1: funcall : id= ID '(' ( params )? ')' ';' -> ^( FUNCALL[$id.text] ( params )? ) ;
    public final MusicParser.funcall_return funcall() throws RecognitionException {
        MusicParser.funcall_return retval = new MusicParser.funcall_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token id=null;
        Token char_literal52=null;
        Token char_literal54=null;
        Token char_literal55=null;
        MusicParser.params_return params53 =null;


        AmlTree id_tree=null;
        AmlTree char_literal52_tree=null;
        AmlTree char_literal54_tree=null;
        AmlTree char_literal55_tree=null;
        RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
        RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
        RewriteRuleSubtreeStream stream_params=new RewriteRuleSubtreeStream(adaptor,"rule params");
        try {
            // src/parser/Music.g:91:13: (id= ID '(' ( params )? ')' ';' -> ^( FUNCALL[$id.text] ( params )? ) )
            // src/parser/Music.g:91:17: id= ID '(' ( params )? ')' ';'
            {
            id=(Token)match(input,ID,FOLLOW_ID_in_funcall943);  
            stream_ID.add(id);


            char_literal52=(Token)match(input,81,FOLLOW_81_in_funcall945);  
            stream_81.add(char_literal52);


            // src/parser/Music.g:91:27: ( params )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==FALSE||LA12_0==ID||LA12_0==MINUS||LA12_0==NOT||LA12_0==NUM||LA12_0==PLUS||LA12_0==TRUE||LA12_0==81) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // src/parser/Music.g:91:27: params
                    {
                    pushFollow(FOLLOW_params_in_funcall947);
                    params53=params();

                    state._fsp--;

                    stream_params.add(params53.getTree());

                    }
                    break;

            }


            char_literal54=(Token)match(input,82,FOLLOW_82_in_funcall950);  
            stream_82.add(char_literal54);


            char_literal55=(Token)match(input,86,FOLLOW_86_in_funcall952);  
            stream_86.add(char_literal55);


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
            // 91:43: -> ^( FUNCALL[$id.text] ( params )? )
            {
                // src/parser/Music.g:91:46: ^( FUNCALL[$id.text] ( params )? )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(FUNCALL, (id!=null?id.getText():null))
                , root_1);

                // src/parser/Music.g:91:66: ( params )?
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
    // src/parser/Music.g:94:1: declaration : type ^ assig_opt ( ',' ! assig_opt )* ';' !;
    public final MusicParser.declaration_return declaration() throws RecognitionException {
        MusicParser.declaration_return retval = new MusicParser.declaration_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal58=null;
        Token char_literal60=null;
        MusicParser.type_return type56 =null;

        MusicParser.assig_opt_return assig_opt57 =null;

        MusicParser.assig_opt_return assig_opt59 =null;


        AmlTree char_literal58_tree=null;
        AmlTree char_literal60_tree=null;

        try {
            // src/parser/Music.g:94:13: ( type ^ assig_opt ( ',' ! assig_opt )* ';' !)
            // src/parser/Music.g:94:17: type ^ assig_opt ( ',' ! assig_opt )* ';' !
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_type_in_declaration985);
            type56=type();

            state._fsp--;

            root_0 = (AmlTree)adaptor.becomeRoot(type56.getTree(), root_0);

            pushFollow(FOLLOW_assig_opt_in_declaration988);
            assig_opt57=assig_opt();

            state._fsp--;

            adaptor.addChild(root_0, assig_opt57.getTree());

            // src/parser/Music.g:94:33: ( ',' ! assig_opt )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==83) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // src/parser/Music.g:94:34: ',' ! assig_opt
            	    {
            	    char_literal58=(Token)match(input,83,FOLLOW_83_in_declaration991); 

            	    pushFollow(FOLLOW_assig_opt_in_declaration994);
            	    assig_opt59=assig_opt();

            	    state._fsp--;

            	    adaptor.addChild(root_0, assig_opt59.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            char_literal60=(Token)match(input,86,FOLLOW_86_in_declaration998); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:97:1: type : ( INT | BOOL | NOTE_TYPE | CHORD );
    public final MusicParser.type_return type() throws RecognitionException {
        MusicParser.type_return retval = new MusicParser.type_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token set61=null;

        AmlTree set61_tree=null;

        try {
            // src/parser/Music.g:97:13: ( INT | BOOL | NOTE_TYPE | CHORD )
            // src/parser/Music.g:
            {
            root_0 = (AmlTree)adaptor.nil();


            set61=(Token)input.LT(1);

            if ( input.LA(1)==BOOL||input.LA(1)==CHORD||input.LA(1)==INT||input.LA(1)==NOTE_TYPE ) {
                input.consume();
                adaptor.addChild(root_0, 
                (AmlTree)adaptor.create(set61)
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
    // src/parser/Music.g:102:1: type_void : ( type | VOID );
    public final MusicParser.type_void_return type_void() throws RecognitionException {
        MusicParser.type_void_return retval = new MusicParser.type_void_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token VOID63=null;
        MusicParser.type_return type62 =null;


        AmlTree VOID63_tree=null;

        try {
            // src/parser/Music.g:102:13: ( type | VOID )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==BOOL||LA14_0==CHORD||LA14_0==INT||LA14_0==NOTE_TYPE) ) {
                alt14=1;
            }
            else if ( (LA14_0==VOID) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }
            switch (alt14) {
                case 1 :
                    // src/parser/Music.g:102:17: type
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_type_in_type_void1107);
                    type62=type();

                    state._fsp--;

                    adaptor.addChild(root_0, type62.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:103:17: VOID
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    VOID63=(Token)match(input,VOID,FOLLOW_VOID_in_type_void1125); 
                    VOID63_tree = 
                    (AmlTree)adaptor.create(VOID63)
                    ;
                    adaptor.addChild(root_0, VOID63_tree);


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
    // src/parser/Music.g:106:1: assig_opt : ID ( ASSIG ^ ( expr | notes_variable ) )? ;
    public final MusicParser.assig_opt_return assig_opt() throws RecognitionException {
        MusicParser.assig_opt_return retval = new MusicParser.assig_opt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token ID64=null;
        Token ASSIG65=null;
        MusicParser.expr_return expr66 =null;

        MusicParser.notes_variable_return notes_variable67 =null;


        AmlTree ID64_tree=null;
        AmlTree ASSIG65_tree=null;

        try {
            // src/parser/Music.g:106:13: ( ID ( ASSIG ^ ( expr | notes_variable ) )? )
            // src/parser/Music.g:106:17: ID ( ASSIG ^ ( expr | notes_variable ) )?
            {
            root_0 = (AmlTree)adaptor.nil();


            ID64=(Token)match(input,ID,FOLLOW_ID_in_assig_opt1150); 
            ID64_tree = 
            (AmlTree)adaptor.create(ID64)
            ;
            adaptor.addChild(root_0, ID64_tree);


            // src/parser/Music.g:106:20: ( ASSIG ^ ( expr | notes_variable ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==ASSIG) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // src/parser/Music.g:106:21: ASSIG ^ ( expr | notes_variable )
                    {
                    ASSIG65=(Token)match(input,ASSIG,FOLLOW_ASSIG_in_assig_opt1153); 
                    ASSIG65_tree = 
                    (AmlTree)adaptor.create(ASSIG65)
                    ;
                    root_0 = (AmlTree)adaptor.becomeRoot(ASSIG65_tree, root_0);


                    // src/parser/Music.g:106:28: ( expr | notes_variable )
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
                    case 81:
                        {
                        int LA15_2 = input.LA(2);

                        if ( (LA15_2==FALSE||LA15_2==ID||LA15_2==MINUS||LA15_2==NOT||LA15_2==NUM||LA15_2==PLUS||LA15_2==TRUE||LA15_2==81) ) {
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
                            // src/parser/Music.g:106:29: expr
                            {
                            pushFollow(FOLLOW_expr_in_assig_opt1157);
                            expr66=expr();

                            state._fsp--;

                            adaptor.addChild(root_0, expr66.getTree());

                            }
                            break;
                        case 2 :
                            // src/parser/Music.g:106:36: notes_variable
                            {
                            pushFollow(FOLLOW_notes_variable_in_assig_opt1161);
                            notes_variable67=notes_variable();

                            state._fsp--;

                            adaptor.addChild(root_0, notes_variable67.getTree());

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
    // src/parser/Music.g:109:1: assignation : assig ';' !;
    public final MusicParser.assignation_return assignation() throws RecognitionException {
        MusicParser.assignation_return retval = new MusicParser.assignation_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal69=null;
        MusicParser.assig_return assig68 =null;


        AmlTree char_literal69_tree=null;

        try {
            // src/parser/Music.g:109:13: ( assig ';' !)
            // src/parser/Music.g:109:17: assig ';' !
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_assig_in_assignation1187);
            assig68=assig();

            state._fsp--;

            adaptor.addChild(root_0, assig68.getTree());

            char_literal69=(Token)match(input,86,FOLLOW_86_in_assignation1189); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:112:1: assig : ( ID ( ASSIG | PLUS_ASSIG | MINUS_ASSIG | PROD_ASSIG | DIVIDE_ASSIG | MOD_ASSIG ) ^ ( expr | notes_variable ) | post | pre );
    public final MusicParser.assig_return assig() throws RecognitionException {
        MusicParser.assig_return retval = new MusicParser.assig_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token ID70=null;
        Token set71=null;
        MusicParser.expr_return expr72 =null;

        MusicParser.notes_variable_return notes_variable73 =null;

        MusicParser.post_return post74 =null;

        MusicParser.pre_return pre75 =null;


        AmlTree ID70_tree=null;
        AmlTree set71_tree=null;

        try {
            // src/parser/Music.g:112:13: ( ID ( ASSIG | PLUS_ASSIG | MINUS_ASSIG | PROD_ASSIG | DIVIDE_ASSIG | MOD_ASSIG ) ^ ( expr | notes_variable ) | post | pre )
            int alt18=3;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==ID) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==ASSIG||LA18_1==DIVIDE_ASSIG||LA18_1==MINUS_ASSIG||LA18_1==MOD_ASSIG||LA18_1==PLUS_ASSIG||LA18_1==PROD_ASSIG) ) {
                    alt18=1;
                }
                else if ( (LA18_1==DECR||LA18_1==INCR) ) {
                    alt18=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA18_0==DECR||LA18_0==INCR) ) {
                alt18=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }
            switch (alt18) {
                case 1 :
                    // src/parser/Music.g:112:17: ID ( ASSIG | PLUS_ASSIG | MINUS_ASSIG | PROD_ASSIG | DIVIDE_ASSIG | MOD_ASSIG ) ^ ( expr | notes_variable )
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    ID70=(Token)match(input,ID,FOLLOW_ID_in_assig1219); 
                    ID70_tree = 
                    (AmlTree)adaptor.create(ID70)
                    ;
                    adaptor.addChild(root_0, ID70_tree);


                    set71=(Token)input.LT(1);

                    set71=(Token)input.LT(1);

                    if ( input.LA(1)==ASSIG||input.LA(1)==DIVIDE_ASSIG||input.LA(1)==MINUS_ASSIG||input.LA(1)==MOD_ASSIG||input.LA(1)==PLUS_ASSIG||input.LA(1)==PROD_ASSIG ) {
                        input.consume();
                        root_0 = (AmlTree)adaptor.becomeRoot(
                        (AmlTree)adaptor.create(set71)
                        , root_0);
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    // src/parser/Music.g:112:86: ( expr | notes_variable )
                    int alt17=2;
                    switch ( input.LA(1) ) {
                    case FALSE:
                    case ID:
                    case MINUS:
                    case NOT:
                    case NUM:
                    case PLUS:
                    case TRUE:
                        {
                        alt17=1;
                        }
                        break;
                    case 81:
                        {
                        int LA17_2 = input.LA(2);

                        if ( (LA17_2==FALSE||LA17_2==ID||LA17_2==MINUS||LA17_2==NOT||LA17_2==NUM||LA17_2==PLUS||LA17_2==TRUE||LA17_2==81) ) {
                            alt17=1;
                        }
                        else if ( (LA17_2==BEMOL||LA17_2==NOTE||LA17_2==SUSTAIN) ) {
                            alt17=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 17, 2, input);

                            throw nvae;

                        }
                        }
                        break;
                    case BEMOL:
                    case CHORD:
                    case NOTE:
                    case SUSTAIN:
                        {
                        alt17=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 0, input);

                        throw nvae;

                    }

                    switch (alt17) {
                        case 1 :
                            // src/parser/Music.g:112:87: expr
                            {
                            pushFollow(FOLLOW_expr_in_assig1237);
                            expr72=expr();

                            state._fsp--;

                            adaptor.addChild(root_0, expr72.getTree());

                            }
                            break;
                        case 2 :
                            // src/parser/Music.g:112:94: notes_variable
                            {
                            pushFollow(FOLLOW_notes_variable_in_assig1241);
                            notes_variable73=notes_variable();

                            state._fsp--;

                            adaptor.addChild(root_0, notes_variable73.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // src/parser/Music.g:113:17: post
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_post_in_assig1260);
                    post74=post();

                    state._fsp--;

                    adaptor.addChild(root_0, post74.getTree());

                    }
                    break;
                case 3 :
                    // src/parser/Music.g:114:17: pre
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_pre_in_assig1278);
                    pre75=pre();

                    state._fsp--;

                    adaptor.addChild(root_0, pre75.getTree());

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
    // src/parser/Music.g:117:1: post : ID (x= INCR |x= DECR ) -> ^( POST ID $x) ;
    public final MusicParser.post_return post() throws RecognitionException {
        MusicParser.post_return retval = new MusicParser.post_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token x=null;
        Token ID76=null;

        AmlTree x_tree=null;
        AmlTree ID76_tree=null;
        RewriteRuleTokenStream stream_INCR=new RewriteRuleTokenStream(adaptor,"token INCR");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_DECR=new RewriteRuleTokenStream(adaptor,"token DECR");

        try {
            // src/parser/Music.g:117:13: ( ID (x= INCR |x= DECR ) -> ^( POST ID $x) )
            // src/parser/Music.g:117:17: ID (x= INCR |x= DECR )
            {
            ID76=(Token)match(input,ID,FOLLOW_ID_in_post1308);  
            stream_ID.add(ID76);


            // src/parser/Music.g:117:20: (x= INCR |x= DECR )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==INCR) ) {
                alt19=1;
            }
            else if ( (LA19_0==DECR) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }
            switch (alt19) {
                case 1 :
                    // src/parser/Music.g:117:21: x= INCR
                    {
                    x=(Token)match(input,INCR,FOLLOW_INCR_in_post1313);  
                    stream_INCR.add(x);


                    }
                    break;
                case 2 :
                    // src/parser/Music.g:117:30: x= DECR
                    {
                    x=(Token)match(input,DECR,FOLLOW_DECR_in_post1319);  
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
            // 117:38: -> ^( POST ID $x)
            {
                // src/parser/Music.g:117:42: ^( POST ID $x)
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
    // src/parser/Music.g:120:1: pre : (x= INCR |x= DECR ) ID -> ^( PRE ID $x) ;
    public final MusicParser.pre_return pre() throws RecognitionException {
        MusicParser.pre_return retval = new MusicParser.pre_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token x=null;
        Token ID77=null;

        AmlTree x_tree=null;
        AmlTree ID77_tree=null;
        RewriteRuleTokenStream stream_INCR=new RewriteRuleTokenStream(adaptor,"token INCR");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_DECR=new RewriteRuleTokenStream(adaptor,"token DECR");

        try {
            // src/parser/Music.g:120:13: ( (x= INCR |x= DECR ) ID -> ^( PRE ID $x) )
            // src/parser/Music.g:120:17: (x= INCR |x= DECR ) ID
            {
            // src/parser/Music.g:120:17: (x= INCR |x= DECR )
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
                    // src/parser/Music.g:120:18: x= INCR
                    {
                    x=(Token)match(input,INCR,FOLLOW_INCR_in_pre1366);  
                    stream_INCR.add(x);


                    }
                    break;
                case 2 :
                    // src/parser/Music.g:120:27: x= DECR
                    {
                    x=(Token)match(input,DECR,FOLLOW_DECR_in_pre1372);  
                    stream_DECR.add(x);


                    }
                    break;

            }


            ID77=(Token)match(input,ID,FOLLOW_ID_in_pre1375);  
            stream_ID.add(ID77);


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
            // 120:39: -> ^( PRE ID $x)
            {
                // src/parser/Music.g:120:42: ^( PRE ID $x)
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
    // src/parser/Music.g:123:1: beat : BEAT ^ NUM ':' ! NUM ;
    public final MusicParser.beat_return beat() throws RecognitionException {
        MusicParser.beat_return retval = new MusicParser.beat_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token BEAT78=null;
        Token NUM79=null;
        Token char_literal80=null;
        Token NUM81=null;

        AmlTree BEAT78_tree=null;
        AmlTree NUM79_tree=null;
        AmlTree char_literal80_tree=null;
        AmlTree NUM81_tree=null;

        try {
            // src/parser/Music.g:123:13: ( BEAT ^ NUM ':' ! NUM )
            // src/parser/Music.g:123:17: BEAT ^ NUM ':' ! NUM
            {
            root_0 = (AmlTree)adaptor.nil();


            BEAT78=(Token)match(input,BEAT,FOLLOW_BEAT_in_beat1418); 
            BEAT78_tree = 
            (AmlTree)adaptor.create(BEAT78)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(BEAT78_tree, root_0);


            NUM79=(Token)match(input,NUM,FOLLOW_NUM_in_beat1421); 
            NUM79_tree = 
            (AmlTree)adaptor.create(NUM79)
            ;
            adaptor.addChild(root_0, NUM79_tree);


            char_literal80=(Token)match(input,85,FOLLOW_85_in_beat1423); 

            NUM81=(Token)match(input,NUM,FOLLOW_NUM_in_beat1426); 
            NUM81_tree = 
            (AmlTree)adaptor.create(NUM81)
            ;
            adaptor.addChild(root_0, NUM81_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:126:1: speed : SPEED ^ NUM ;
    public final MusicParser.speed_return speed() throws RecognitionException {
        MusicParser.speed_return retval = new MusicParser.speed_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token SPEED82=null;
        Token NUM83=null;

        AmlTree SPEED82_tree=null;
        AmlTree NUM83_tree=null;

        try {
            // src/parser/Music.g:126:13: ( SPEED ^ NUM )
            // src/parser/Music.g:126:17: SPEED ^ NUM
            {
            root_0 = (AmlTree)adaptor.nil();


            SPEED82=(Token)match(input,SPEED,FOLLOW_SPEED_in_speed1455); 
            SPEED82_tree = 
            (AmlTree)adaptor.create(SPEED82)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(SPEED82_tree, root_0);


            NUM83=(Token)match(input,NUM,FOLLOW_NUM_in_speed1458); 
            NUM83_tree = 
            (AmlTree)adaptor.create(NUM83)
            ;
            adaptor.addChild(root_0, NUM83_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:129:1: transport : TRANSPORT ^ NUM ;
    public final MusicParser.transport_return transport() throws RecognitionException {
        MusicParser.transport_return retval = new MusicParser.transport_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token TRANSPORT84=null;
        Token NUM85=null;

        AmlTree TRANSPORT84_tree=null;
        AmlTree NUM85_tree=null;

        try {
            // src/parser/Music.g:129:13: ( TRANSPORT ^ NUM )
            // src/parser/Music.g:129:17: TRANSPORT ^ NUM
            {
            root_0 = (AmlTree)adaptor.nil();


            TRANSPORT84=(Token)match(input,TRANSPORT,FOLLOW_TRANSPORT_in_transport1483); 
            TRANSPORT84_tree = 
            (AmlTree)adaptor.create(TRANSPORT84)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(TRANSPORT84_tree, root_0);


            NUM85=(Token)match(input,NUM,FOLLOW_NUM_in_transport1486); 
            NUM85_tree = 
            (AmlTree)adaptor.create(NUM85)
            ;
            adaptor.addChild(root_0, NUM85_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:132:1: instrument : INSTRUMENT ^ STRING ;
    public final MusicParser.instrument_return instrument() throws RecognitionException {
        MusicParser.instrument_return retval = new MusicParser.instrument_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token INSTRUMENT86=null;
        Token STRING87=null;

        AmlTree INSTRUMENT86_tree=null;
        AmlTree STRING87_tree=null;

        try {
            // src/parser/Music.g:132:13: ( INSTRUMENT ^ STRING )
            // src/parser/Music.g:132:17: INSTRUMENT ^ STRING
            {
            root_0 = (AmlTree)adaptor.nil();


            INSTRUMENT86=(Token)match(input,INSTRUMENT,FOLLOW_INSTRUMENT_in_instrument1510); 
            INSTRUMENT86_tree = 
            (AmlTree)adaptor.create(INSTRUMENT86)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(INSTRUMENT86_tree, root_0);


            STRING87=(Token)match(input,STRING,FOLLOW_STRING_in_instrument1513); 
            STRING87_tree = 
            (AmlTree)adaptor.create(STRING87)
            ;
            adaptor.addChild(root_0, STRING87_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:135:1: while_stmt : WHILE ^ '(' ! expr ')' ! '{' ! listInst '}' !;
    public final MusicParser.while_stmt_return while_stmt() throws RecognitionException {
        MusicParser.while_stmt_return retval = new MusicParser.while_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token WHILE88=null;
        Token char_literal89=null;
        Token char_literal91=null;
        Token char_literal92=null;
        Token char_literal94=null;
        MusicParser.expr_return expr90 =null;

        MusicParser.listInst_return listInst93 =null;


        AmlTree WHILE88_tree=null;
        AmlTree char_literal89_tree=null;
        AmlTree char_literal91_tree=null;
        AmlTree char_literal92_tree=null;
        AmlTree char_literal94_tree=null;

        try {
            // src/parser/Music.g:135:13: ( WHILE ^ '(' ! expr ')' ! '{' ! listInst '}' !)
            // src/parser/Music.g:135:17: WHILE ^ '(' ! expr ')' ! '{' ! listInst '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            WHILE88=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_stmt1537); 
            WHILE88_tree = 
            (AmlTree)adaptor.create(WHILE88)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(WHILE88_tree, root_0);


            char_literal89=(Token)match(input,81,FOLLOW_81_in_while_stmt1540); 

            pushFollow(FOLLOW_expr_in_while_stmt1543);
            expr90=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr90.getTree());

            char_literal91=(Token)match(input,82,FOLLOW_82_in_while_stmt1545); 

            char_literal92=(Token)match(input,88,FOLLOW_88_in_while_stmt1548); 

            pushFollow(FOLLOW_listInst_in_while_stmt1551);
            listInst93=listInst();

            state._fsp--;

            adaptor.addChild(root_0, listInst93.getTree());

            char_literal94=(Token)match(input,89,FOLLOW_89_in_while_stmt1553); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:138:1: while_music_stmt : WHILE ^ '(' ! expr ')' ! '{' ! list_music_inst '}' !;
    public final MusicParser.while_music_stmt_return while_music_stmt() throws RecognitionException {
        MusicParser.while_music_stmt_return retval = new MusicParser.while_music_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token WHILE95=null;
        Token char_literal96=null;
        Token char_literal98=null;
        Token char_literal99=null;
        Token char_literal101=null;
        MusicParser.expr_return expr97 =null;

        MusicParser.list_music_inst_return list_music_inst100 =null;


        AmlTree WHILE95_tree=null;
        AmlTree char_literal96_tree=null;
        AmlTree char_literal98_tree=null;
        AmlTree char_literal99_tree=null;
        AmlTree char_literal101_tree=null;

        try {
            // src/parser/Music.g:138:21: ( WHILE ^ '(' ! expr ')' ! '{' ! list_music_inst '}' !)
            // src/parser/Music.g:138:25: WHILE ^ '(' ! expr ')' ! '{' ! list_music_inst '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            WHILE95=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_music_stmt1580); 
            WHILE95_tree = 
            (AmlTree)adaptor.create(WHILE95)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(WHILE95_tree, root_0);


            char_literal96=(Token)match(input,81,FOLLOW_81_in_while_music_stmt1583); 

            pushFollow(FOLLOW_expr_in_while_music_stmt1586);
            expr97=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr97.getTree());

            char_literal98=(Token)match(input,82,FOLLOW_82_in_while_music_stmt1588); 

            char_literal99=(Token)match(input,88,FOLLOW_88_in_while_music_stmt1591); 

            pushFollow(FOLLOW_list_music_inst_in_while_music_stmt1594);
            list_music_inst100=list_music_inst();

            state._fsp--;

            adaptor.addChild(root_0, list_music_inst100.getTree());

            char_literal101=(Token)match(input,89,FOLLOW_89_in_while_music_stmt1596); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:141:1: for_stmt : FOR ^ '(' ! ( declaration | list_assig ';' !) expr ';' ! list_assig ')' ! '{' ! listInst '}' !;
    public final MusicParser.for_stmt_return for_stmt() throws RecognitionException {
        MusicParser.for_stmt_return retval = new MusicParser.for_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token FOR102=null;
        Token char_literal103=null;
        Token char_literal106=null;
        Token char_literal108=null;
        Token char_literal110=null;
        Token char_literal111=null;
        Token char_literal113=null;
        MusicParser.declaration_return declaration104 =null;

        MusicParser.list_assig_return list_assig105 =null;

        MusicParser.expr_return expr107 =null;

        MusicParser.list_assig_return list_assig109 =null;

        MusicParser.listInst_return listInst112 =null;


        AmlTree FOR102_tree=null;
        AmlTree char_literal103_tree=null;
        AmlTree char_literal106_tree=null;
        AmlTree char_literal108_tree=null;
        AmlTree char_literal110_tree=null;
        AmlTree char_literal111_tree=null;
        AmlTree char_literal113_tree=null;

        try {
            // src/parser/Music.g:141:13: ( FOR ^ '(' ! ( declaration | list_assig ';' !) expr ';' ! list_assig ')' ! '{' ! listInst '}' !)
            // src/parser/Music.g:141:17: FOR ^ '(' ! ( declaration | list_assig ';' !) expr ';' ! list_assig ')' ! '{' ! listInst '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            FOR102=(Token)match(input,FOR,FOLLOW_FOR_in_for_stmt1631); 
            FOR102_tree = 
            (AmlTree)adaptor.create(FOR102)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(FOR102_tree, root_0);


            char_literal103=(Token)match(input,81,FOLLOW_81_in_for_stmt1634); 

            // src/parser/Music.g:141:27: ( declaration | list_assig ';' !)
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==BOOL||LA21_0==CHORD||LA21_0==INT||LA21_0==NOTE_TYPE) ) {
                alt21=1;
            }
            else if ( (LA21_0==DECR||LA21_0==ID||LA21_0==INCR) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }
            switch (alt21) {
                case 1 :
                    // src/parser/Music.g:141:28: declaration
                    {
                    pushFollow(FOLLOW_declaration_in_for_stmt1638);
                    declaration104=declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, declaration104.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:141:42: list_assig ';' !
                    {
                    pushFollow(FOLLOW_list_assig_in_for_stmt1642);
                    list_assig105=list_assig();

                    state._fsp--;

                    adaptor.addChild(root_0, list_assig105.getTree());

                    char_literal106=(Token)match(input,86,FOLLOW_86_in_for_stmt1644); 

                    }
                    break;

            }


            pushFollow(FOLLOW_expr_in_for_stmt1648);
            expr107=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr107.getTree());

            char_literal108=(Token)match(input,86,FOLLOW_86_in_for_stmt1650); 

            pushFollow(FOLLOW_list_assig_in_for_stmt1653);
            list_assig109=list_assig();

            state._fsp--;

            adaptor.addChild(root_0, list_assig109.getTree());

            char_literal110=(Token)match(input,82,FOLLOW_82_in_for_stmt1655); 

            char_literal111=(Token)match(input,88,FOLLOW_88_in_for_stmt1658); 

            pushFollow(FOLLOW_listInst_in_for_stmt1661);
            listInst112=listInst();

            state._fsp--;

            adaptor.addChild(root_0, listInst112.getTree());

            char_literal113=(Token)match(input,89,FOLLOW_89_in_for_stmt1663); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:144:1: for_music_stmt : FOR ^ '(' ! ( declaration | list_assig ';' !) expr ';' ! list_assig ')' ! '{' ! list_music_inst '}' !;
    public final MusicParser.for_music_stmt_return for_music_stmt() throws RecognitionException {
        MusicParser.for_music_stmt_return retval = new MusicParser.for_music_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token FOR114=null;
        Token char_literal115=null;
        Token char_literal118=null;
        Token char_literal120=null;
        Token char_literal122=null;
        Token char_literal123=null;
        Token char_literal125=null;
        MusicParser.declaration_return declaration116 =null;

        MusicParser.list_assig_return list_assig117 =null;

        MusicParser.expr_return expr119 =null;

        MusicParser.list_assig_return list_assig121 =null;

        MusicParser.list_music_inst_return list_music_inst124 =null;


        AmlTree FOR114_tree=null;
        AmlTree char_literal115_tree=null;
        AmlTree char_literal118_tree=null;
        AmlTree char_literal120_tree=null;
        AmlTree char_literal122_tree=null;
        AmlTree char_literal123_tree=null;
        AmlTree char_literal125_tree=null;

        try {
            // src/parser/Music.g:144:17: ( FOR ^ '(' ! ( declaration | list_assig ';' !) expr ';' ! list_assig ')' ! '{' ! list_music_inst '}' !)
            // src/parser/Music.g:144:21: FOR ^ '(' ! ( declaration | list_assig ';' !) expr ';' ! list_assig ')' ! '{' ! list_music_inst '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            FOR114=(Token)match(input,FOR,FOLLOW_FOR_in_for_music_stmt1688); 
            FOR114_tree = 
            (AmlTree)adaptor.create(FOR114)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(FOR114_tree, root_0);


            char_literal115=(Token)match(input,81,FOLLOW_81_in_for_music_stmt1691); 

            // src/parser/Music.g:144:31: ( declaration | list_assig ';' !)
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==BOOL||LA22_0==CHORD||LA22_0==INT||LA22_0==NOTE_TYPE) ) {
                alt22=1;
            }
            else if ( (LA22_0==DECR||LA22_0==ID||LA22_0==INCR) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }
            switch (alt22) {
                case 1 :
                    // src/parser/Music.g:144:32: declaration
                    {
                    pushFollow(FOLLOW_declaration_in_for_music_stmt1695);
                    declaration116=declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, declaration116.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:144:46: list_assig ';' !
                    {
                    pushFollow(FOLLOW_list_assig_in_for_music_stmt1699);
                    list_assig117=list_assig();

                    state._fsp--;

                    adaptor.addChild(root_0, list_assig117.getTree());

                    char_literal118=(Token)match(input,86,FOLLOW_86_in_for_music_stmt1701); 

                    }
                    break;

            }


            pushFollow(FOLLOW_expr_in_for_music_stmt1705);
            expr119=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr119.getTree());

            char_literal120=(Token)match(input,86,FOLLOW_86_in_for_music_stmt1707); 

            pushFollow(FOLLOW_list_assig_in_for_music_stmt1710);
            list_assig121=list_assig();

            state._fsp--;

            adaptor.addChild(root_0, list_assig121.getTree());

            char_literal122=(Token)match(input,82,FOLLOW_82_in_for_music_stmt1712); 

            char_literal123=(Token)match(input,88,FOLLOW_88_in_for_music_stmt1715); 

            pushFollow(FOLLOW_list_music_inst_in_for_music_stmt1718);
            list_music_inst124=list_music_inst();

            state._fsp--;

            adaptor.addChild(root_0, list_music_inst124.getTree());

            char_literal125=(Token)match(input,89,FOLLOW_89_in_for_music_stmt1720); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:147:1: list_assig : assig ( ',' assig )* -> ^( LIST_ASSIG ( assig )+ ) ;
    public final MusicParser.list_assig_return list_assig() throws RecognitionException {
        MusicParser.list_assig_return retval = new MusicParser.list_assig_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal127=null;
        MusicParser.assig_return assig126 =null;

        MusicParser.assig_return assig128 =null;


        AmlTree char_literal127_tree=null;
        RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
        RewriteRuleSubtreeStream stream_assig=new RewriteRuleSubtreeStream(adaptor,"rule assig");
        try {
            // src/parser/Music.g:147:13: ( assig ( ',' assig )* -> ^( LIST_ASSIG ( assig )+ ) )
            // src/parser/Music.g:147:17: assig ( ',' assig )*
            {
            pushFollow(FOLLOW_assig_in_list_assig1749);
            assig126=assig();

            state._fsp--;

            stream_assig.add(assig126.getTree());

            // src/parser/Music.g:147:23: ( ',' assig )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==83) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // src/parser/Music.g:147:24: ',' assig
            	    {
            	    char_literal127=(Token)match(input,83,FOLLOW_83_in_list_assig1752);  
            	    stream_83.add(char_literal127);


            	    pushFollow(FOLLOW_assig_in_list_assig1754);
            	    assig128=assig();

            	    state._fsp--;

            	    stream_assig.add(assig128.getTree());

            	    }
            	    break;

            	default :
            	    break loop23;
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
            // 147:36: -> ^( LIST_ASSIG ( assig )+ )
            {
                // src/parser/Music.g:147:39: ^( LIST_ASSIG ( assig )+ )
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
    // src/parser/Music.g:150:1: if_stmt : IF ^ '(' ! expr ')' ! '{' ! listInst '}' ! ( elseif_stmt )* ( else_stmt )? ;
    public final MusicParser.if_stmt_return if_stmt() throws RecognitionException {
        MusicParser.if_stmt_return retval = new MusicParser.if_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token IF129=null;
        Token char_literal130=null;
        Token char_literal132=null;
        Token char_literal133=null;
        Token char_literal135=null;
        MusicParser.expr_return expr131 =null;

        MusicParser.listInst_return listInst134 =null;

        MusicParser.elseif_stmt_return elseif_stmt136 =null;

        MusicParser.else_stmt_return else_stmt137 =null;


        AmlTree IF129_tree=null;
        AmlTree char_literal130_tree=null;
        AmlTree char_literal132_tree=null;
        AmlTree char_literal133_tree=null;
        AmlTree char_literal135_tree=null;

        try {
            // src/parser/Music.g:150:13: ( IF ^ '(' ! expr ')' ! '{' ! listInst '}' ! ( elseif_stmt )* ( else_stmt )? )
            // src/parser/Music.g:150:17: IF ^ '(' ! expr ')' ! '{' ! listInst '}' ! ( elseif_stmt )* ( else_stmt )?
            {
            root_0 = (AmlTree)adaptor.nil();


            IF129=(Token)match(input,IF,FOLLOW_IF_in_if_stmt1792); 
            IF129_tree = 
            (AmlTree)adaptor.create(IF129)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(IF129_tree, root_0);


            char_literal130=(Token)match(input,81,FOLLOW_81_in_if_stmt1795); 

            pushFollow(FOLLOW_expr_in_if_stmt1798);
            expr131=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr131.getTree());

            char_literal132=(Token)match(input,82,FOLLOW_82_in_if_stmt1800); 

            char_literal133=(Token)match(input,88,FOLLOW_88_in_if_stmt1803); 

            pushFollow(FOLLOW_listInst_in_if_stmt1806);
            listInst134=listInst();

            state._fsp--;

            adaptor.addChild(root_0, listInst134.getTree());

            char_literal135=(Token)match(input,89,FOLLOW_89_in_if_stmt1808); 

            // src/parser/Music.g:150:55: ( elseif_stmt )*
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
            	    // src/parser/Music.g:150:55: elseif_stmt
            	    {
            	    pushFollow(FOLLOW_elseif_stmt_in_if_stmt1811);
            	    elseif_stmt136=elseif_stmt();

            	    state._fsp--;

            	    adaptor.addChild(root_0, elseif_stmt136.getTree());

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            // src/parser/Music.g:150:68: ( else_stmt )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==ELSE) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // src/parser/Music.g:150:68: else_stmt
                    {
                    pushFollow(FOLLOW_else_stmt_in_if_stmt1814);
                    else_stmt137=else_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, else_stmt137.getTree());

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
    // src/parser/Music.g:153:1: elseif_stmt : ELSE IF '(' expr ')' '{' listInst '}' -> ^( ELSEIF expr listInst ) ;
    public final MusicParser.elseif_stmt_return elseif_stmt() throws RecognitionException {
        MusicParser.elseif_stmt_return retval = new MusicParser.elseif_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token ELSE138=null;
        Token IF139=null;
        Token char_literal140=null;
        Token char_literal142=null;
        Token char_literal143=null;
        Token char_literal145=null;
        MusicParser.expr_return expr141 =null;

        MusicParser.listInst_return listInst144 =null;


        AmlTree ELSE138_tree=null;
        AmlTree IF139_tree=null;
        AmlTree char_literal140_tree=null;
        AmlTree char_literal142_tree=null;
        AmlTree char_literal143_tree=null;
        AmlTree char_literal145_tree=null;
        RewriteRuleTokenStream stream_88=new RewriteRuleTokenStream(adaptor,"token 88");
        RewriteRuleTokenStream stream_89=new RewriteRuleTokenStream(adaptor,"token 89");
        RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_listInst=new RewriteRuleSubtreeStream(adaptor,"rule listInst");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // src/parser/Music.g:153:13: ( ELSE IF '(' expr ')' '{' listInst '}' -> ^( ELSEIF expr listInst ) )
            // src/parser/Music.g:153:17: ELSE IF '(' expr ')' '{' listInst '}'
            {
            ELSE138=(Token)match(input,ELSE,FOLLOW_ELSE_in_elseif_stmt1838);  
            stream_ELSE.add(ELSE138);


            IF139=(Token)match(input,IF,FOLLOW_IF_in_elseif_stmt1840);  
            stream_IF.add(IF139);


            char_literal140=(Token)match(input,81,FOLLOW_81_in_elseif_stmt1842);  
            stream_81.add(char_literal140);


            pushFollow(FOLLOW_expr_in_elseif_stmt1844);
            expr141=expr();

            state._fsp--;

            stream_expr.add(expr141.getTree());

            char_literal142=(Token)match(input,82,FOLLOW_82_in_elseif_stmt1846);  
            stream_82.add(char_literal142);


            char_literal143=(Token)match(input,88,FOLLOW_88_in_elseif_stmt1848);  
            stream_88.add(char_literal143);


            pushFollow(FOLLOW_listInst_in_elseif_stmt1850);
            listInst144=listInst();

            state._fsp--;

            stream_listInst.add(listInst144.getTree());

            char_literal145=(Token)match(input,89,FOLLOW_89_in_elseif_stmt1852);  
            stream_89.add(char_literal145);


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
            // 153:55: -> ^( ELSEIF expr listInst )
            {
                // src/parser/Music.g:153:58: ^( ELSEIF expr listInst )
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
    // src/parser/Music.g:156:1: else_stmt : ELSE ^ '{' ! listInst '}' !;
    public final MusicParser.else_stmt_return else_stmt() throws RecognitionException {
        MusicParser.else_stmt_return retval = new MusicParser.else_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token ELSE146=null;
        Token char_literal147=null;
        Token char_literal149=null;
        MusicParser.listInst_return listInst148 =null;


        AmlTree ELSE146_tree=null;
        AmlTree char_literal147_tree=null;
        AmlTree char_literal149_tree=null;

        try {
            // src/parser/Music.g:156:13: ( ELSE ^ '{' ! listInst '}' !)
            // src/parser/Music.g:156:17: ELSE ^ '{' ! listInst '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            ELSE146=(Token)match(input,ELSE,FOLLOW_ELSE_in_else_stmt1887); 
            ELSE146_tree = 
            (AmlTree)adaptor.create(ELSE146)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(ELSE146_tree, root_0);


            char_literal147=(Token)match(input,88,FOLLOW_88_in_else_stmt1890); 

            pushFollow(FOLLOW_listInst_in_else_stmt1893);
            listInst148=listInst();

            state._fsp--;

            adaptor.addChild(root_0, listInst148.getTree());

            char_literal149=(Token)match(input,89,FOLLOW_89_in_else_stmt1895); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:159:1: if_music_stmt : IF ^ '(' ! expr ')' ! '{' ! list_music_inst '}' ! ( elseif_music_stmt )* ( else_music_stmt )? ;
    public final MusicParser.if_music_stmt_return if_music_stmt() throws RecognitionException {
        MusicParser.if_music_stmt_return retval = new MusicParser.if_music_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token IF150=null;
        Token char_literal151=null;
        Token char_literal153=null;
        Token char_literal154=null;
        Token char_literal156=null;
        MusicParser.expr_return expr152 =null;

        MusicParser.list_music_inst_return list_music_inst155 =null;

        MusicParser.elseif_music_stmt_return elseif_music_stmt157 =null;

        MusicParser.else_music_stmt_return else_music_stmt158 =null;


        AmlTree IF150_tree=null;
        AmlTree char_literal151_tree=null;
        AmlTree char_literal153_tree=null;
        AmlTree char_literal154_tree=null;
        AmlTree char_literal156_tree=null;

        try {
            // src/parser/Music.g:159:17: ( IF ^ '(' ! expr ')' ! '{' ! list_music_inst '}' ! ( elseif_music_stmt )* ( else_music_stmt )? )
            // src/parser/Music.g:159:21: IF ^ '(' ! expr ')' ! '{' ! list_music_inst '}' ! ( elseif_music_stmt )* ( else_music_stmt )?
            {
            root_0 = (AmlTree)adaptor.nil();


            IF150=(Token)match(input,IF,FOLLOW_IF_in_if_music_stmt1921); 
            IF150_tree = 
            (AmlTree)adaptor.create(IF150)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(IF150_tree, root_0);


            char_literal151=(Token)match(input,81,FOLLOW_81_in_if_music_stmt1924); 

            pushFollow(FOLLOW_expr_in_if_music_stmt1927);
            expr152=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr152.getTree());

            char_literal153=(Token)match(input,82,FOLLOW_82_in_if_music_stmt1929); 

            char_literal154=(Token)match(input,88,FOLLOW_88_in_if_music_stmt1932); 

            pushFollow(FOLLOW_list_music_inst_in_if_music_stmt1935);
            list_music_inst155=list_music_inst();

            state._fsp--;

            adaptor.addChild(root_0, list_music_inst155.getTree());

            char_literal156=(Token)match(input,89,FOLLOW_89_in_if_music_stmt1937); 

            // src/parser/Music.g:159:66: ( elseif_music_stmt )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==ELSE) ) {
                    int LA26_1 = input.LA(2);

                    if ( (LA26_1==IF) ) {
                        alt26=1;
                    }


                }


                switch (alt26) {
            	case 1 :
            	    // src/parser/Music.g:159:66: elseif_music_stmt
            	    {
            	    pushFollow(FOLLOW_elseif_music_stmt_in_if_music_stmt1940);
            	    elseif_music_stmt157=elseif_music_stmt();

            	    state._fsp--;

            	    adaptor.addChild(root_0, elseif_music_stmt157.getTree());

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            // src/parser/Music.g:159:85: ( else_music_stmt )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==ELSE) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // src/parser/Music.g:159:85: else_music_stmt
                    {
                    pushFollow(FOLLOW_else_music_stmt_in_if_music_stmt1943);
                    else_music_stmt158=else_music_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, else_music_stmt158.getTree());

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
    // src/parser/Music.g:162:1: elseif_music_stmt : ELSE IF '(' expr ')' '{' list_music_inst '}' -> ^( ELSEIF expr list_music_inst ) ;
    public final MusicParser.elseif_music_stmt_return elseif_music_stmt() throws RecognitionException {
        MusicParser.elseif_music_stmt_return retval = new MusicParser.elseif_music_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token ELSE159=null;
        Token IF160=null;
        Token char_literal161=null;
        Token char_literal163=null;
        Token char_literal164=null;
        Token char_literal166=null;
        MusicParser.expr_return expr162 =null;

        MusicParser.list_music_inst_return list_music_inst165 =null;


        AmlTree ELSE159_tree=null;
        AmlTree IF160_tree=null;
        AmlTree char_literal161_tree=null;
        AmlTree char_literal163_tree=null;
        AmlTree char_literal164_tree=null;
        AmlTree char_literal166_tree=null;
        RewriteRuleTokenStream stream_88=new RewriteRuleTokenStream(adaptor,"token 88");
        RewriteRuleTokenStream stream_89=new RewriteRuleTokenStream(adaptor,"token 89");
        RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_list_music_inst=new RewriteRuleSubtreeStream(adaptor,"rule list_music_inst");
        try {
            // src/parser/Music.g:162:21: ( ELSE IF '(' expr ')' '{' list_music_inst '}' -> ^( ELSEIF expr list_music_inst ) )
            // src/parser/Music.g:162:25: ELSE IF '(' expr ')' '{' list_music_inst '}'
            {
            ELSE159=(Token)match(input,ELSE,FOLLOW_ELSE_in_elseif_music_stmt1973);  
            stream_ELSE.add(ELSE159);


            IF160=(Token)match(input,IF,FOLLOW_IF_in_elseif_music_stmt1975);  
            stream_IF.add(IF160);


            char_literal161=(Token)match(input,81,FOLLOW_81_in_elseif_music_stmt1977);  
            stream_81.add(char_literal161);


            pushFollow(FOLLOW_expr_in_elseif_music_stmt1979);
            expr162=expr();

            state._fsp--;

            stream_expr.add(expr162.getTree());

            char_literal163=(Token)match(input,82,FOLLOW_82_in_elseif_music_stmt1981);  
            stream_82.add(char_literal163);


            char_literal164=(Token)match(input,88,FOLLOW_88_in_elseif_music_stmt1983);  
            stream_88.add(char_literal164);


            pushFollow(FOLLOW_list_music_inst_in_elseif_music_stmt1985);
            list_music_inst165=list_music_inst();

            state._fsp--;

            stream_list_music_inst.add(list_music_inst165.getTree());

            char_literal166=(Token)match(input,89,FOLLOW_89_in_elseif_music_stmt1987);  
            stream_89.add(char_literal166);


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
            // 162:70: -> ^( ELSEIF expr list_music_inst )
            {
                // src/parser/Music.g:162:73: ^( ELSEIF expr list_music_inst )
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
    // src/parser/Music.g:165:1: else_music_stmt : ELSE ^ '{' ! list_music_inst '}' !;
    public final MusicParser.else_music_stmt_return else_music_stmt() throws RecognitionException {
        MusicParser.else_music_stmt_return retval = new MusicParser.else_music_stmt_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token ELSE167=null;
        Token char_literal168=null;
        Token char_literal170=null;
        MusicParser.list_music_inst_return list_music_inst169 =null;


        AmlTree ELSE167_tree=null;
        AmlTree char_literal168_tree=null;
        AmlTree char_literal170_tree=null;

        try {
            // src/parser/Music.g:165:17: ( ELSE ^ '{' ! list_music_inst '}' !)
            // src/parser/Music.g:165:21: ELSE ^ '{' ! list_music_inst '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            ELSE167=(Token)match(input,ELSE,FOLLOW_ELSE_in_else_music_stmt2028); 
            ELSE167_tree = 
            (AmlTree)adaptor.create(ELSE167)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(ELSE167_tree, root_0);


            char_literal168=(Token)match(input,88,FOLLOW_88_in_else_music_stmt2031); 

            pushFollow(FOLLOW_list_music_inst_in_else_music_stmt2034);
            list_music_inst169=list_music_inst();

            state._fsp--;

            adaptor.addChild(root_0, list_music_inst169.getTree());

            char_literal170=(Token)match(input,89,FOLLOW_89_in_else_music_stmt2036); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:168:1: song : SONG ^ ( ID )? '{' ! ( beat )? ( speed )? ( transport )? ( track )+ '}' !;
    public final MusicParser.song_return song() throws RecognitionException {
        MusicParser.song_return retval = new MusicParser.song_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token SONG171=null;
        Token ID172=null;
        Token char_literal173=null;
        Token char_literal178=null;
        MusicParser.beat_return beat174 =null;

        MusicParser.speed_return speed175 =null;

        MusicParser.transport_return transport176 =null;

        MusicParser.track_return track177 =null;


        AmlTree SONG171_tree=null;
        AmlTree ID172_tree=null;
        AmlTree char_literal173_tree=null;
        AmlTree char_literal178_tree=null;

        try {
            // src/parser/Music.g:168:13: ( SONG ^ ( ID )? '{' ! ( beat )? ( speed )? ( transport )? ( track )+ '}' !)
            // src/parser/Music.g:168:17: SONG ^ ( ID )? '{' ! ( beat )? ( speed )? ( transport )? ( track )+ '}' !
            {
            root_0 = (AmlTree)adaptor.nil();


            SONG171=(Token)match(input,SONG,FOLLOW_SONG_in_song2071); 
            SONG171_tree = 
            (AmlTree)adaptor.create(SONG171)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(SONG171_tree, root_0);


            // src/parser/Music.g:168:23: ( ID )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==ID) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // src/parser/Music.g:168:23: ID
                    {
                    ID172=(Token)match(input,ID,FOLLOW_ID_in_song2074); 
                    ID172_tree = 
                    (AmlTree)adaptor.create(ID172)
                    ;
                    adaptor.addChild(root_0, ID172_tree);


                    }
                    break;

            }


            char_literal173=(Token)match(input,88,FOLLOW_88_in_song2077); 

            // src/parser/Music.g:168:32: ( beat )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==BEAT) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // src/parser/Music.g:168:32: beat
                    {
                    pushFollow(FOLLOW_beat_in_song2080);
                    beat174=beat();

                    state._fsp--;

                    adaptor.addChild(root_0, beat174.getTree());

                    }
                    break;

            }


            // src/parser/Music.g:168:38: ( speed )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==SPEED) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // src/parser/Music.g:168:38: speed
                    {
                    pushFollow(FOLLOW_speed_in_song2083);
                    speed175=speed();

                    state._fsp--;

                    adaptor.addChild(root_0, speed175.getTree());

                    }
                    break;

            }


            // src/parser/Music.g:168:45: ( transport )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==TRANSPORT) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // src/parser/Music.g:168:45: transport
                    {
                    pushFollow(FOLLOW_transport_in_song2086);
                    transport176=transport();

                    state._fsp--;

                    adaptor.addChild(root_0, transport176.getTree());

                    }
                    break;

            }


            // src/parser/Music.g:168:56: ( track )+
            int cnt32=0;
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==TRACK) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // src/parser/Music.g:168:57: track
            	    {
            	    pushFollow(FOLLOW_track_in_song2090);
            	    track177=track();

            	    state._fsp--;

            	    adaptor.addChild(root_0, track177.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt32 >= 1 ) break loop32;
                        EarlyExitException eee =
                            new EarlyExitException(32, input);
                        throw eee;
                }
                cnt32++;
            } while (true);


            char_literal178=(Token)match(input,89,FOLLOW_89_in_song2094); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:171:1: track : TRACK ^ ( ID )? ( STRING )? compas_aux ;
    public final MusicParser.track_return track() throws RecognitionException {
        MusicParser.track_return retval = new MusicParser.track_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token TRACK179=null;
        Token ID180=null;
        Token STRING181=null;
        MusicParser.compas_aux_return compas_aux182 =null;


        AmlTree TRACK179_tree=null;
        AmlTree ID180_tree=null;
        AmlTree STRING181_tree=null;

        try {
            // src/parser/Music.g:171:13: ( TRACK ^ ( ID )? ( STRING )? compas_aux )
            // src/parser/Music.g:171:17: TRACK ^ ( ID )? ( STRING )? compas_aux
            {
            root_0 = (AmlTree)adaptor.nil();


            TRACK179=(Token)match(input,TRACK,FOLLOW_TRACK_in_track2124); 
            TRACK179_tree = 
            (AmlTree)adaptor.create(TRACK179)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(TRACK179_tree, root_0);


            // src/parser/Music.g:171:24: ( ID )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==ID) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // src/parser/Music.g:171:24: ID
                    {
                    ID180=(Token)match(input,ID,FOLLOW_ID_in_track2127); 
                    ID180_tree = 
                    (AmlTree)adaptor.create(ID180)
                    ;
                    adaptor.addChild(root_0, ID180_tree);


                    }
                    break;

            }


            // src/parser/Music.g:171:28: ( STRING )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==STRING) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // src/parser/Music.g:171:28: STRING
                    {
                    STRING181=(Token)match(input,STRING,FOLLOW_STRING_in_track2130); 
                    STRING181_tree = 
                    (AmlTree)adaptor.create(STRING181)
                    ;
                    adaptor.addChild(root_0, STRING181_tree);


                    }
                    break;

            }


            pushFollow(FOLLOW_compas_aux_in_track2133);
            compas_aux182=compas_aux();

            state._fsp--;

            adaptor.addChild(root_0, compas_aux182.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:174:1: compas_aux : compas_list -> ^( COMPAS_LIST compas_list ) ;
    public final MusicParser.compas_aux_return compas_aux() throws RecognitionException {
        MusicParser.compas_aux_return retval = new MusicParser.compas_aux_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        MusicParser.compas_list_return compas_list183 =null;


        RewriteRuleSubtreeStream stream_compas_list=new RewriteRuleSubtreeStream(adaptor,"rule compas_list");
        try {
            // src/parser/Music.g:174:13: ( compas_list -> ^( COMPAS_LIST compas_list ) )
            // src/parser/Music.g:174:17: compas_list
            {
            pushFollow(FOLLOW_compas_list_in_compas_aux2157);
            compas_list183=compas_list();

            state._fsp--;

            stream_compas_list.add(compas_list183.getTree());

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
            // 174:29: -> ^( COMPAS_LIST compas_list )
            {
                // src/parser/Music.g:174:32: ^( COMPAS_LIST compas_list )
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
    // src/parser/Music.g:177:1: compas_list : ( DOUBLE_BAR !| repetition ) ( compasses | repetition )* ( DOUBLE_BAR !) ;
    public final MusicParser.compas_list_return compas_list() throws RecognitionException {
        MusicParser.compas_list_return retval = new MusicParser.compas_list_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token DOUBLE_BAR184=null;
        Token DOUBLE_BAR188=null;
        MusicParser.repetition_return repetition185 =null;

        MusicParser.compasses_return compasses186 =null;

        MusicParser.repetition_return repetition187 =null;


        AmlTree DOUBLE_BAR184_tree=null;
        AmlTree DOUBLE_BAR188_tree=null;

        try {
            // src/parser/Music.g:177:13: ( ( DOUBLE_BAR !| repetition ) ( compasses | repetition )* ( DOUBLE_BAR !) )
            // src/parser/Music.g:177:15: ( DOUBLE_BAR !| repetition ) ( compasses | repetition )* ( DOUBLE_BAR !)
            {
            root_0 = (AmlTree)adaptor.nil();


            // src/parser/Music.g:177:15: ( DOUBLE_BAR !| repetition )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==DOUBLE_BAR) ) {
                alt35=1;
            }
            else if ( (LA35_0==NUM||LA35_0==START_REPETITION) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;

            }
            switch (alt35) {
                case 1 :
                    // src/parser/Music.g:177:16: DOUBLE_BAR !
                    {
                    DOUBLE_BAR184=(Token)match(input,DOUBLE_BAR,FOLLOW_DOUBLE_BAR_in_compas_list2187); 

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:177:30: repetition
                    {
                    pushFollow(FOLLOW_repetition_in_compas_list2192);
                    repetition185=repetition();

                    state._fsp--;

                    adaptor.addChild(root_0, repetition185.getTree());

                    }
                    break;

            }


            // src/parser/Music.g:177:42: ( compasses | repetition )*
            loop36:
            do {
                int alt36=3;
                int LA36_0 = input.LA(1);

                if ( ((LA36_0 >= BEMOL && LA36_0 <= BOOL)||LA36_0==CHORD||LA36_0==DECR||LA36_0==FOR||(LA36_0 >= ID && LA36_0 <= INCR)||LA36_0==INT||LA36_0==NOTE||LA36_0==NOTE_TYPE||LA36_0==SONG||LA36_0==SUSTAIN||LA36_0==TONE||LA36_0==WHILE||LA36_0==81) ) {
                    alt36=1;
                }
                else if ( (LA36_0==NUM||LA36_0==START_REPETITION) ) {
                    alt36=2;
                }


                switch (alt36) {
            	case 1 :
            	    // src/parser/Music.g:177:43: compasses
            	    {
            	    pushFollow(FOLLOW_compasses_in_compas_list2196);
            	    compasses186=compasses();

            	    state._fsp--;

            	    adaptor.addChild(root_0, compasses186.getTree());

            	    }
            	    break;
            	case 2 :
            	    // src/parser/Music.g:177:55: repetition
            	    {
            	    pushFollow(FOLLOW_repetition_in_compas_list2200);
            	    repetition187=repetition();

            	    state._fsp--;

            	    adaptor.addChild(root_0, repetition187.getTree());

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


            // src/parser/Music.g:177:68: ( DOUBLE_BAR !)
            // src/parser/Music.g:177:69: DOUBLE_BAR !
            {
            DOUBLE_BAR188=(Token)match(input,DOUBLE_BAR,FOLLOW_DOUBLE_BAR_in_compas_list2205); 

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
    // src/parser/Music.g:180:1: compasses : compas ( BAR ! compas )* ;
    public final MusicParser.compasses_return compasses() throws RecognitionException {
        MusicParser.compasses_return retval = new MusicParser.compasses_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token BAR190=null;
        MusicParser.compas_return compas189 =null;

        MusicParser.compas_return compas191 =null;


        AmlTree BAR190_tree=null;

        try {
            // src/parser/Music.g:180:13: ( compas ( BAR ! compas )* )
            // src/parser/Music.g:180:17: compas ( BAR ! compas )*
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_compas_in_compasses2232);
            compas189=compas();

            state._fsp--;

            adaptor.addChild(root_0, compas189.getTree());

            // src/parser/Music.g:180:24: ( BAR ! compas )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==BAR) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // src/parser/Music.g:180:25: BAR ! compas
            	    {
            	    BAR190=(Token)match(input,BAR,FOLLOW_BAR_in_compasses2235); 

            	    pushFollow(FOLLOW_compas_in_compasses2238);
            	    compas191=compas();

            	    state._fsp--;

            	    adaptor.addChild(root_0, compas191.getTree());

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
    // $ANTLR end "compasses"


    public static class repetition_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "repetition"
    // src/parser/Music.g:183:1: repetition : ( NUM 'x' )? START_REPETITION compasses END_REPETITION -> ^( REPETITION NUM compasses ) ;
    public final MusicParser.repetition_return repetition() throws RecognitionException {
        MusicParser.repetition_return retval = new MusicParser.repetition_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token NUM192=null;
        Token char_literal193=null;
        Token START_REPETITION194=null;
        Token END_REPETITION196=null;
        MusicParser.compasses_return compasses195 =null;


        AmlTree NUM192_tree=null;
        AmlTree char_literal193_tree=null;
        AmlTree START_REPETITION194_tree=null;
        AmlTree END_REPETITION196_tree=null;
        RewriteRuleTokenStream stream_NUM=new RewriteRuleTokenStream(adaptor,"token NUM");
        RewriteRuleTokenStream stream_END_REPETITION=new RewriteRuleTokenStream(adaptor,"token END_REPETITION");
        RewriteRuleTokenStream stream_87=new RewriteRuleTokenStream(adaptor,"token 87");
        RewriteRuleTokenStream stream_START_REPETITION=new RewriteRuleTokenStream(adaptor,"token START_REPETITION");
        RewriteRuleSubtreeStream stream_compasses=new RewriteRuleSubtreeStream(adaptor,"rule compasses");
        try {
            // src/parser/Music.g:183:13: ( ( NUM 'x' )? START_REPETITION compasses END_REPETITION -> ^( REPETITION NUM compasses ) )
            // src/parser/Music.g:183:17: ( NUM 'x' )? START_REPETITION compasses END_REPETITION
            {
            // src/parser/Music.g:183:17: ( NUM 'x' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==NUM) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // src/parser/Music.g:183:18: NUM 'x'
                    {
                    NUM192=(Token)match(input,NUM,FOLLOW_NUM_in_repetition2265);  
                    stream_NUM.add(NUM192);


                    char_literal193=(Token)match(input,87,FOLLOW_87_in_repetition2267);  
                    stream_87.add(char_literal193);


                    }
                    break;

            }


            START_REPETITION194=(Token)match(input,START_REPETITION,FOLLOW_START_REPETITION_in_repetition2271);  
            stream_START_REPETITION.add(START_REPETITION194);


            pushFollow(FOLLOW_compasses_in_repetition2273);
            compasses195=compasses();

            state._fsp--;

            stream_compasses.add(compasses195.getTree());

            END_REPETITION196=(Token)match(input,END_REPETITION,FOLLOW_END_REPETITION_in_repetition2275);  
            stream_END_REPETITION.add(END_REPETITION196);


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
            // 183:73: -> ^( REPETITION NUM compasses )
            {
                // src/parser/Music.g:183:76: ^( REPETITION NUM compasses )
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
    // src/parser/Music.g:186:1: compas : ( tone )? ( options {greedy=true; } : music_inst )+ -> ^( COMPAS ( tone )? ( music_inst )+ ) ;
    public final MusicParser.compas_return compas() throws RecognitionException {
        MusicParser.compas_return retval = new MusicParser.compas_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        MusicParser.tone_return tone197 =null;

        MusicParser.music_inst_return music_inst198 =null;


        RewriteRuleSubtreeStream stream_tone=new RewriteRuleSubtreeStream(adaptor,"rule tone");
        RewriteRuleSubtreeStream stream_music_inst=new RewriteRuleSubtreeStream(adaptor,"rule music_inst");
        try {
            // src/parser/Music.g:186:13: ( ( tone )? ( options {greedy=true; } : music_inst )+ -> ^( COMPAS ( tone )? ( music_inst )+ ) )
            // src/parser/Music.g:186:17: ( tone )? ( options {greedy=true; } : music_inst )+
            {
            // src/parser/Music.g:186:17: ( tone )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==TONE) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // src/parser/Music.g:186:17: tone
                    {
                    pushFollow(FOLLOW_tone_in_compas2316);
                    tone197=tone();

                    state._fsp--;

                    stream_tone.add(tone197.getTree());

                    }
                    break;

            }


            // src/parser/Music.g:186:23: ( options {greedy=true; } : music_inst )+
            int cnt40=0;
            loop40:
            do {
                int alt40=2;
                switch ( input.LA(1) ) {
                case CHORD:
                    {
                    alt40=1;
                    }
                    break;
                case ID:
                    {
                    alt40=1;
                    }
                    break;
                case INCR:
                    {
                    alt40=1;
                    }
                    break;
                case DECR:
                    {
                    alt40=1;
                    }
                    break;
                case WHILE:
                    {
                    alt40=1;
                    }
                    break;
                case FOR:
                    {
                    alt40=1;
                    }
                    break;
                case IF:
                    {
                    alt40=1;
                    }
                    break;
                case SONG:
                    {
                    alt40=1;
                    }
                    break;
                case BOOL:
                case INT:
                case NOTE_TYPE:
                    {
                    alt40=1;
                    }
                    break;
                case 81:
                    {
                    alt40=1;
                    }
                    break;
                case BEMOL:
                case SUSTAIN:
                    {
                    alt40=1;
                    }
                    break;
                case NOTE:
                    {
                    alt40=1;
                    }
                    break;

                }

                switch (alt40) {
            	case 1 :
            	    // src/parser/Music.g:186:49: music_inst
            	    {
            	    pushFollow(FOLLOW_music_inst_in_compas2329);
            	    music_inst198=music_inst();

            	    state._fsp--;

            	    stream_music_inst.add(music_inst198.getTree());

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
            // 186:65: -> ^( COMPAS ( tone )? ( music_inst )+ )
            {
                // src/parser/Music.g:186:68: ^( COMPAS ( tone )? ( music_inst )+ )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(COMPAS, "COMPAS")
                , root_1);

                // src/parser/Music.g:186:77: ( tone )?
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
    // src/parser/Music.g:189:1: tone : TONE ^ NUM ( SUSTAIN | BEMOL ) ;
    public final MusicParser.tone_return tone() throws RecognitionException {
        MusicParser.tone_return retval = new MusicParser.tone_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token TONE199=null;
        Token NUM200=null;
        Token set201=null;

        AmlTree TONE199_tree=null;
        AmlTree NUM200_tree=null;
        AmlTree set201_tree=null;

        try {
            // src/parser/Music.g:189:13: ( TONE ^ NUM ( SUSTAIN | BEMOL ) )
            // src/parser/Music.g:189:17: TONE ^ NUM ( SUSTAIN | BEMOL )
            {
            root_0 = (AmlTree)adaptor.nil();


            TONE199=(Token)match(input,TONE,FOLLOW_TONE_in_tone2376); 
            TONE199_tree = 
            (AmlTree)adaptor.create(TONE199)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(TONE199_tree, root_0);


            NUM200=(Token)match(input,NUM,FOLLOW_NUM_in_tone2379); 
            NUM200_tree = 
            (AmlTree)adaptor.create(NUM200)
            ;
            adaptor.addChild(root_0, NUM200_tree);


            set201=(Token)input.LT(1);

            if ( input.LA(1)==BEMOL||input.LA(1)==SUSTAIN ) {
                input.consume();
                adaptor.addChild(root_0, 
                (AmlTree)adaptor.create(set201)
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
    // src/parser/Music.g:192:1: notes_group : notes_type ( '.' FIGURE ( DOT )? )? ( TIE )? -> ^( NOTE_LIST notes_type ( FIGURE )? ( DOT )? ( TIE )? ) ;
    public final MusicParser.notes_group_return notes_group() throws RecognitionException {
        MusicParser.notes_group_return retval = new MusicParser.notes_group_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal203=null;
        Token FIGURE204=null;
        Token DOT205=null;
        Token TIE206=null;
        MusicParser.notes_type_return notes_type202 =null;


        AmlTree char_literal203_tree=null;
        AmlTree FIGURE204_tree=null;
        AmlTree DOT205_tree=null;
        AmlTree TIE206_tree=null;
        RewriteRuleTokenStream stream_TIE=new RewriteRuleTokenStream(adaptor,"token TIE");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");
        RewriteRuleTokenStream stream_FIGURE=new RewriteRuleTokenStream(adaptor,"token FIGURE");
        RewriteRuleSubtreeStream stream_notes_type=new RewriteRuleSubtreeStream(adaptor,"rule notes_type");
        try {
            // src/parser/Music.g:192:13: ( notes_type ( '.' FIGURE ( DOT )? )? ( TIE )? -> ^( NOTE_LIST notes_type ( FIGURE )? ( DOT )? ( TIE )? ) )
            // src/parser/Music.g:192:17: notes_type ( '.' FIGURE ( DOT )? )? ( TIE )?
            {
            pushFollow(FOLLOW_notes_type_in_notes_group2410);
            notes_type202=notes_type();

            state._fsp--;

            stream_notes_type.add(notes_type202.getTree());

            // src/parser/Music.g:192:28: ( '.' FIGURE ( DOT )? )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==84) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // src/parser/Music.g:192:29: '.' FIGURE ( DOT )?
                    {
                    char_literal203=(Token)match(input,84,FOLLOW_84_in_notes_group2413);  
                    stream_84.add(char_literal203);


                    FIGURE204=(Token)match(input,FIGURE,FOLLOW_FIGURE_in_notes_group2415);  
                    stream_FIGURE.add(FIGURE204);


                    // src/parser/Music.g:192:40: ( DOT )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==DOT) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // src/parser/Music.g:192:40: DOT
                            {
                            DOT205=(Token)match(input,DOT,FOLLOW_DOT_in_notes_group2417);  
                            stream_DOT.add(DOT205);


                            }
                            break;

                    }


                    }
                    break;

            }


            // src/parser/Music.g:192:47: ( TIE )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==TIE) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // src/parser/Music.g:192:47: TIE
                    {
                    TIE206=(Token)match(input,TIE,FOLLOW_TIE_in_notes_group2422);  
                    stream_TIE.add(TIE206);


                    }
                    break;

            }


            // AST REWRITE
            // elements: TIE, FIGURE, DOT, notes_type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AmlTree)adaptor.nil();
            // 192:52: -> ^( NOTE_LIST notes_type ( FIGURE )? ( DOT )? ( TIE )? )
            {
                // src/parser/Music.g:192:55: ^( NOTE_LIST notes_type ( FIGURE )? ( DOT )? ( TIE )? )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(NOTE_LIST, "NOTE_LIST")
                , root_1);

                adaptor.addChild(root_1, stream_notes_type.nextTree());

                // src/parser/Music.g:192:78: ( FIGURE )?
                if ( stream_FIGURE.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_FIGURE.nextNode()
                    );

                }
                stream_FIGURE.reset();

                // src/parser/Music.g:192:86: ( DOT )?
                if ( stream_DOT.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_DOT.nextNode()
                    );

                }
                stream_DOT.reset();

                // src/parser/Music.g:192:91: ( TIE )?
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
    // src/parser/Music.g:195:1: notes_variable : notes_type ( '.' FIGURE ( DOT )? )? -> ^( NOTE_LIST notes_type ( FIGURE )? ( DOT )? ) ;
    public final MusicParser.notes_variable_return notes_variable() throws RecognitionException {
        MusicParser.notes_variable_return retval = new MusicParser.notes_variable_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal208=null;
        Token FIGURE209=null;
        Token DOT210=null;
        MusicParser.notes_type_return notes_type207 =null;


        AmlTree char_literal208_tree=null;
        AmlTree FIGURE209_tree=null;
        AmlTree DOT210_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");
        RewriteRuleTokenStream stream_FIGURE=new RewriteRuleTokenStream(adaptor,"token FIGURE");
        RewriteRuleSubtreeStream stream_notes_type=new RewriteRuleSubtreeStream(adaptor,"rule notes_type");
        try {
            // src/parser/Music.g:195:17: ( notes_type ( '.' FIGURE ( DOT )? )? -> ^( NOTE_LIST notes_type ( FIGURE )? ( DOT )? ) )
            // src/parser/Music.g:195:21: notes_type ( '.' FIGURE ( DOT )? )?
            {
            pushFollow(FOLLOW_notes_type_in_notes_variable2464);
            notes_type207=notes_type();

            state._fsp--;

            stream_notes_type.add(notes_type207.getTree());

            // src/parser/Music.g:195:32: ( '.' FIGURE ( DOT )? )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==84) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // src/parser/Music.g:195:33: '.' FIGURE ( DOT )?
                    {
                    char_literal208=(Token)match(input,84,FOLLOW_84_in_notes_variable2467);  
                    stream_84.add(char_literal208);


                    FIGURE209=(Token)match(input,FIGURE,FOLLOW_FIGURE_in_notes_variable2469);  
                    stream_FIGURE.add(FIGURE209);


                    // src/parser/Music.g:195:44: ( DOT )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==DOT) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // src/parser/Music.g:195:44: DOT
                            {
                            DOT210=(Token)match(input,DOT,FOLLOW_DOT_in_notes_variable2471);  
                            stream_DOT.add(DOT210);


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
            // 195:51: -> ^( NOTE_LIST notes_type ( FIGURE )? ( DOT )? )
            {
                // src/parser/Music.g:195:54: ^( NOTE_LIST notes_type ( FIGURE )? ( DOT )? )
                {
                AmlTree root_1 = (AmlTree)adaptor.nil();
                root_1 = (AmlTree)adaptor.becomeRoot(
                (AmlTree)adaptor.create(NOTE_LIST, "NOTE_LIST")
                , root_1);

                adaptor.addChild(root_1, stream_notes_type.nextTree());

                // src/parser/Music.g:195:77: ( FIGURE )?
                if ( stream_FIGURE.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_FIGURE.nextNode()
                    );

                }
                stream_FIGURE.reset();

                // src/parser/Music.g:195:85: ( DOT )?
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
    // src/parser/Music.g:198:1: notes_type : ( chord | notes );
    public final MusicParser.notes_type_return notes_type() throws RecognitionException {
        MusicParser.notes_type_return retval = new MusicParser.notes_type_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        MusicParser.chord_return chord211 =null;

        MusicParser.notes_return notes212 =null;



        try {
            // src/parser/Music.g:198:13: ( chord | notes )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==CHORD) ) {
                alt46=1;
            }
            else if ( (LA46_0==BEMOL||LA46_0==NOTE||LA46_0==SUSTAIN||LA46_0==81) ) {
                alt46=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;

            }
            switch (alt46) {
                case 1 :
                    // src/parser/Music.g:198:15: chord
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_chord_in_notes_type2514);
                    chord211=chord();

                    state._fsp--;

                    adaptor.addChild(root_0, chord211.getTree());

                    }
                    break;
                case 2 :
                    // src/parser/Music.g:198:23: notes
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    pushFollow(FOLLOW_notes_in_notes_type2518);
                    notes212=notes();

                    state._fsp--;

                    adaptor.addChild(root_0, notes212.getTree());

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
    // src/parser/Music.g:201:1: chord : CHORD ^ '(' ! NOTE ( MINOR | PLUS | DIMINUTION )? ( SEVENTH | MAJ7 )? ')' !;
    public final MusicParser.chord_return chord() throws RecognitionException {
        MusicParser.chord_return retval = new MusicParser.chord_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token CHORD213=null;
        Token char_literal214=null;
        Token NOTE215=null;
        Token set216=null;
        Token set217=null;
        Token char_literal218=null;

        AmlTree CHORD213_tree=null;
        AmlTree char_literal214_tree=null;
        AmlTree NOTE215_tree=null;
        AmlTree set216_tree=null;
        AmlTree set217_tree=null;
        AmlTree char_literal218_tree=null;

        try {
            // src/parser/Music.g:201:13: ( CHORD ^ '(' ! NOTE ( MINOR | PLUS | DIMINUTION )? ( SEVENTH | MAJ7 )? ')' !)
            // src/parser/Music.g:201:17: CHORD ^ '(' ! NOTE ( MINOR | PLUS | DIMINUTION )? ( SEVENTH | MAJ7 )? ')' !
            {
            root_0 = (AmlTree)adaptor.nil();


            CHORD213=(Token)match(input,CHORD,FOLLOW_CHORD_in_chord2547); 
            CHORD213_tree = 
            (AmlTree)adaptor.create(CHORD213)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(CHORD213_tree, root_0);


            char_literal214=(Token)match(input,81,FOLLOW_81_in_chord2550); 

            NOTE215=(Token)match(input,NOTE,FOLLOW_NOTE_in_chord2553); 
            NOTE215_tree = 
            (AmlTree)adaptor.create(NOTE215)
            ;
            adaptor.addChild(root_0, NOTE215_tree);


            // src/parser/Music.g:201:34: ( MINOR | PLUS | DIMINUTION )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==DIMINUTION||LA47_0==MINOR||LA47_0==PLUS) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // src/parser/Music.g:
                    {
                    set216=(Token)input.LT(1);

                    if ( input.LA(1)==DIMINUTION||input.LA(1)==MINOR||input.LA(1)==PLUS ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (AmlTree)adaptor.create(set216)
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


            // src/parser/Music.g:201:59: ( SEVENTH | MAJ7 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==MAJ7||LA48_0==SEVENTH) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // src/parser/Music.g:
                    {
                    set217=(Token)input.LT(1);

                    if ( input.LA(1)==MAJ7||input.LA(1)==SEVENTH ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (AmlTree)adaptor.create(set217)
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


            char_literal218=(Token)match(input,82,FOLLOW_82_in_chord2571); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:204:1: notes : ( '(' ( note )+ ')' | note ) -> ^( NOTES ( note )+ ) ;
    public final MusicParser.notes_return notes() throws RecognitionException {
        MusicParser.notes_return retval = new MusicParser.notes_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token char_literal219=null;
        Token char_literal221=null;
        MusicParser.note_return note220 =null;

        MusicParser.note_return note222 =null;


        AmlTree char_literal219_tree=null;
        AmlTree char_literal221_tree=null;
        RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
        RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
        RewriteRuleSubtreeStream stream_note=new RewriteRuleSubtreeStream(adaptor,"rule note");
        try {
            // src/parser/Music.g:204:13: ( ( '(' ( note )+ ')' | note ) -> ^( NOTES ( note )+ ) )
            // src/parser/Music.g:204:17: ( '(' ( note )+ ')' | note )
            {
            // src/parser/Music.g:204:17: ( '(' ( note )+ ')' | note )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==81) ) {
                alt50=1;
            }
            else if ( (LA50_0==BEMOL||LA50_0==NOTE||LA50_0==SUSTAIN) ) {
                alt50=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;

            }
            switch (alt50) {
                case 1 :
                    // src/parser/Music.g:204:19: '(' ( note )+ ')'
                    {
                    char_literal219=(Token)match(input,81,FOLLOW_81_in_notes2603);  
                    stream_81.add(char_literal219);


                    // src/parser/Music.g:204:23: ( note )+
                    int cnt49=0;
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==BEMOL||LA49_0==NOTE||LA49_0==SUSTAIN) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // src/parser/Music.g:204:24: note
                    	    {
                    	    pushFollow(FOLLOW_note_in_notes2606);
                    	    note220=note();

                    	    state._fsp--;

                    	    stream_note.add(note220.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt49 >= 1 ) break loop49;
                                EarlyExitException eee =
                                    new EarlyExitException(49, input);
                                throw eee;
                        }
                        cnt49++;
                    } while (true);


                    char_literal221=(Token)match(input,82,FOLLOW_82_in_notes2610);  
                    stream_82.add(char_literal221);


                    }
                    break;
                case 2 :
                    // src/parser/Music.g:204:38: note
                    {
                    pushFollow(FOLLOW_note_in_notes2615);
                    note222=note();

                    state._fsp--;

                    stream_note.add(note222.getTree());

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
            // 204:44: -> ^( NOTES ( note )+ )
            {
                // src/parser/Music.g:204:47: ^( NOTES ( note )+ )
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
    // src/parser/Music.g:207:1: note : ( BEMOL | SUSTAIN )? NOTE ^ ( '-' ! NUM )? ;
    public final MusicParser.note_return note() throws RecognitionException {
        MusicParser.note_return retval = new MusicParser.note_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token set223=null;
        Token NOTE224=null;
        Token char_literal225=null;
        Token NUM226=null;

        AmlTree set223_tree=null;
        AmlTree NOTE224_tree=null;
        AmlTree char_literal225_tree=null;
        AmlTree NUM226_tree=null;

        try {
            // src/parser/Music.g:207:13: ( ( BEMOL | SUSTAIN )? NOTE ^ ( '-' ! NUM )? )
            // src/parser/Music.g:207:17: ( BEMOL | SUSTAIN )? NOTE ^ ( '-' ! NUM )?
            {
            root_0 = (AmlTree)adaptor.nil();


            // src/parser/Music.g:207:17: ( BEMOL | SUSTAIN )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==BEMOL||LA51_0==SUSTAIN) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // src/parser/Music.g:
                    {
                    set223=(Token)input.LT(1);

                    if ( input.LA(1)==BEMOL||input.LA(1)==SUSTAIN ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (AmlTree)adaptor.create(set223)
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


            NOTE224=(Token)match(input,NOTE,FOLLOW_NOTE_in_note2664); 
            NOTE224_tree = 
            (AmlTree)adaptor.create(NOTE224)
            ;
            root_0 = (AmlTree)adaptor.becomeRoot(NOTE224_tree, root_0);


            // src/parser/Music.g:207:42: ( '-' ! NUM )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==MINUS) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // src/parser/Music.g:207:43: '-' ! NUM
                    {
                    char_literal225=(Token)match(input,MINUS,FOLLOW_MINUS_in_note2668); 

                    NUM226=(Token)match(input,NUM,FOLLOW_NUM_in_note2671); 
                    NUM226_tree = 
                    (AmlTree)adaptor.create(NUM226)
                    ;
                    adaptor.addChild(root_0, NUM226_tree);


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
    // src/parser/Music.g:211:1: expr : boolterm ( OR ^ boolterm )* ;
    public final MusicParser.expr_return expr() throws RecognitionException {
        MusicParser.expr_return retval = new MusicParser.expr_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token OR228=null;
        MusicParser.boolterm_return boolterm227 =null;

        MusicParser.boolterm_return boolterm229 =null;


        AmlTree OR228_tree=null;

        try {
            // src/parser/Music.g:211:9: ( boolterm ( OR ^ boolterm )* )
            // src/parser/Music.g:211:13: boolterm ( OR ^ boolterm )*
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_boolterm_in_expr2700);
            boolterm227=boolterm();

            state._fsp--;

            adaptor.addChild(root_0, boolterm227.getTree());

            // src/parser/Music.g:211:22: ( OR ^ boolterm )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==OR) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // src/parser/Music.g:211:23: OR ^ boolterm
            	    {
            	    OR228=(Token)match(input,OR,FOLLOW_OR_in_expr2703); 
            	    OR228_tree = 
            	    (AmlTree)adaptor.create(OR228)
            	    ;
            	    root_0 = (AmlTree)adaptor.becomeRoot(OR228_tree, root_0);


            	    pushFollow(FOLLOW_boolterm_in_expr2706);
            	    boolterm229=boolterm();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolterm229.getTree());

            	    }
            	    break;

            	default :
            	    break loop53;
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
    // src/parser/Music.g:214:1: boolterm : boolfact ( AND ^ boolfact )* ;
    public final MusicParser.boolterm_return boolterm() throws RecognitionException {
        MusicParser.boolterm_return retval = new MusicParser.boolterm_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token AND231=null;
        MusicParser.boolfact_return boolfact230 =null;

        MusicParser.boolfact_return boolfact232 =null;


        AmlTree AND231_tree=null;

        try {
            // src/parser/Music.g:214:13: ( boolfact ( AND ^ boolfact )* )
            // src/parser/Music.g:214:17: boolfact ( AND ^ boolfact )*
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_boolfact_in_boolterm2724);
            boolfact230=boolfact();

            state._fsp--;

            adaptor.addChild(root_0, boolfact230.getTree());

            // src/parser/Music.g:214:26: ( AND ^ boolfact )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==AND) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // src/parser/Music.g:214:27: AND ^ boolfact
            	    {
            	    AND231=(Token)match(input,AND,FOLLOW_AND_in_boolterm2727); 
            	    AND231_tree = 
            	    (AmlTree)adaptor.create(AND231)
            	    ;
            	    root_0 = (AmlTree)adaptor.becomeRoot(AND231_tree, root_0);


            	    pushFollow(FOLLOW_boolfact_in_boolterm2730);
            	    boolfact232=boolfact();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolfact232.getTree());

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
    // $ANTLR end "boolterm"


    public static class boolfact_return extends ParserRuleReturnScope {
        AmlTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolfact"
    // src/parser/Music.g:217:1: boolfact : num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? ;
    public final MusicParser.boolfact_return boolfact() throws RecognitionException {
        MusicParser.boolfact_return retval = new MusicParser.boolfact_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token EQUAL234=null;
        Token NOT_EQUAL235=null;
        Token LT236=null;
        Token LE237=null;
        Token GT238=null;
        Token GE239=null;
        MusicParser.num_expr_return num_expr233 =null;

        MusicParser.num_expr_return num_expr240 =null;


        AmlTree EQUAL234_tree=null;
        AmlTree NOT_EQUAL235_tree=null;
        AmlTree LT236_tree=null;
        AmlTree LE237_tree=null;
        AmlTree GT238_tree=null;
        AmlTree GE239_tree=null;

        try {
            // src/parser/Music.g:217:13: ( num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? )
            // src/parser/Music.g:217:17: num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_num_expr_in_boolfact2752);
            num_expr233=num_expr();

            state._fsp--;

            adaptor.addChild(root_0, num_expr233.getTree());

            // src/parser/Music.g:217:26: ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==EQUAL||(LA56_0 >= GE && LA56_0 <= GT)||LA56_0==LE||LA56_0==LT||LA56_0==NOT_EQUAL) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // src/parser/Music.g:217:27: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr
                    {
                    // src/parser/Music.g:217:27: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^)
                    int alt55=6;
                    switch ( input.LA(1) ) {
                    case EQUAL:
                        {
                        alt55=1;
                        }
                        break;
                    case NOT_EQUAL:
                        {
                        alt55=2;
                        }
                        break;
                    case LT:
                        {
                        alt55=3;
                        }
                        break;
                    case LE:
                        {
                        alt55=4;
                        }
                        break;
                    case GT:
                        {
                        alt55=5;
                        }
                        break;
                    case GE:
                        {
                        alt55=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 55, 0, input);

                        throw nvae;

                    }

                    switch (alt55) {
                        case 1 :
                            // src/parser/Music.g:217:28: EQUAL ^
                            {
                            EQUAL234=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_boolfact2756); 
                            EQUAL234_tree = 
                            (AmlTree)adaptor.create(EQUAL234)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(EQUAL234_tree, root_0);


                            }
                            break;
                        case 2 :
                            // src/parser/Music.g:217:37: NOT_EQUAL ^
                            {
                            NOT_EQUAL235=(Token)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_boolfact2761); 
                            NOT_EQUAL235_tree = 
                            (AmlTree)adaptor.create(NOT_EQUAL235)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(NOT_EQUAL235_tree, root_0);


                            }
                            break;
                        case 3 :
                            // src/parser/Music.g:217:50: LT ^
                            {
                            LT236=(Token)match(input,LT,FOLLOW_LT_in_boolfact2766); 
                            LT236_tree = 
                            (AmlTree)adaptor.create(LT236)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(LT236_tree, root_0);


                            }
                            break;
                        case 4 :
                            // src/parser/Music.g:217:56: LE ^
                            {
                            LE237=(Token)match(input,LE,FOLLOW_LE_in_boolfact2771); 
                            LE237_tree = 
                            (AmlTree)adaptor.create(LE237)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(LE237_tree, root_0);


                            }
                            break;
                        case 5 :
                            // src/parser/Music.g:217:62: GT ^
                            {
                            GT238=(Token)match(input,GT,FOLLOW_GT_in_boolfact2776); 
                            GT238_tree = 
                            (AmlTree)adaptor.create(GT238)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(GT238_tree, root_0);


                            }
                            break;
                        case 6 :
                            // src/parser/Music.g:217:68: GE ^
                            {
                            GE239=(Token)match(input,GE,FOLLOW_GE_in_boolfact2781); 
                            GE239_tree = 
                            (AmlTree)adaptor.create(GE239)
                            ;
                            root_0 = (AmlTree)adaptor.becomeRoot(GE239_tree, root_0);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_num_expr_in_boolfact2785);
                    num_expr240=num_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, num_expr240.getTree());

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
    // src/parser/Music.g:220:1: num_expr : term ( ( PLUS ^| MINUS ^) term )* ;
    public final MusicParser.num_expr_return num_expr() throws RecognitionException {
        MusicParser.num_expr_return retval = new MusicParser.num_expr_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token PLUS242=null;
        Token MINUS243=null;
        MusicParser.term_return term241 =null;

        MusicParser.term_return term244 =null;


        AmlTree PLUS242_tree=null;
        AmlTree MINUS243_tree=null;

        try {
            // src/parser/Music.g:220:13: ( term ( ( PLUS ^| MINUS ^) term )* )
            // src/parser/Music.g:220:17: term ( ( PLUS ^| MINUS ^) term )*
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_term_in_num_expr2807);
            term241=term();

            state._fsp--;

            adaptor.addChild(root_0, term241.getTree());

            // src/parser/Music.g:220:22: ( ( PLUS ^| MINUS ^) term )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==MINUS||LA58_0==PLUS) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // src/parser/Music.g:220:24: ( PLUS ^| MINUS ^) term
            	    {
            	    // src/parser/Music.g:220:24: ( PLUS ^| MINUS ^)
            	    int alt57=2;
            	    int LA57_0 = input.LA(1);

            	    if ( (LA57_0==PLUS) ) {
            	        alt57=1;
            	    }
            	    else if ( (LA57_0==MINUS) ) {
            	        alt57=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 57, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt57) {
            	        case 1 :
            	            // src/parser/Music.g:220:25: PLUS ^
            	            {
            	            PLUS242=(Token)match(input,PLUS,FOLLOW_PLUS_in_num_expr2812); 
            	            PLUS242_tree = 
            	            (AmlTree)adaptor.create(PLUS242)
            	            ;
            	            root_0 = (AmlTree)adaptor.becomeRoot(PLUS242_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // src/parser/Music.g:220:33: MINUS ^
            	            {
            	            MINUS243=(Token)match(input,MINUS,FOLLOW_MINUS_in_num_expr2817); 
            	            MINUS243_tree = 
            	            (AmlTree)adaptor.create(MINUS243)
            	            ;
            	            root_0 = (AmlTree)adaptor.becomeRoot(MINUS243_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_term_in_num_expr2821);
            	    term244=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term244.getTree());

            	    }
            	    break;

            	default :
            	    break loop58;
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
    // src/parser/Music.g:223:1: term : factor ( ( DOT ^| DIV ^| MOD ^) factor )* ;
    public final MusicParser.term_return term() throws RecognitionException {
        MusicParser.term_return retval = new MusicParser.term_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token DOT246=null;
        Token DIV247=null;
        Token MOD248=null;
        MusicParser.factor_return factor245 =null;

        MusicParser.factor_return factor249 =null;


        AmlTree DOT246_tree=null;
        AmlTree DIV247_tree=null;
        AmlTree MOD248_tree=null;

        try {
            // src/parser/Music.g:223:9: ( factor ( ( DOT ^| DIV ^| MOD ^) factor )* )
            // src/parser/Music.g:223:13: factor ( ( DOT ^| DIV ^| MOD ^) factor )*
            {
            root_0 = (AmlTree)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term2843);
            factor245=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor245.getTree());

            // src/parser/Music.g:223:20: ( ( DOT ^| DIV ^| MOD ^) factor )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==DIV||LA60_0==DOT||LA60_0==MOD) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // src/parser/Music.g:223:22: ( DOT ^| DIV ^| MOD ^) factor
            	    {
            	    // src/parser/Music.g:223:22: ( DOT ^| DIV ^| MOD ^)
            	    int alt59=3;
            	    switch ( input.LA(1) ) {
            	    case DOT:
            	        {
            	        alt59=1;
            	        }
            	        break;
            	    case DIV:
            	        {
            	        alt59=2;
            	        }
            	        break;
            	    case MOD:
            	        {
            	        alt59=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 59, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt59) {
            	        case 1 :
            	            // src/parser/Music.g:223:23: DOT ^
            	            {
            	            DOT246=(Token)match(input,DOT,FOLLOW_DOT_in_term2848); 
            	            DOT246_tree = 
            	            (AmlTree)adaptor.create(DOT246)
            	            ;
            	            root_0 = (AmlTree)adaptor.becomeRoot(DOT246_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // src/parser/Music.g:223:30: DIV ^
            	            {
            	            DIV247=(Token)match(input,DIV,FOLLOW_DIV_in_term2853); 
            	            DIV247_tree = 
            	            (AmlTree)adaptor.create(DIV247)
            	            ;
            	            root_0 = (AmlTree)adaptor.becomeRoot(DIV247_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // src/parser/Music.g:223:37: MOD ^
            	            {
            	            MOD248=(Token)match(input,MOD,FOLLOW_MOD_in_term2858); 
            	            MOD248_tree = 
            	            (AmlTree)adaptor.create(MOD248)
            	            ;
            	            root_0 = (AmlTree)adaptor.becomeRoot(MOD248_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_factor_in_term2862);
            	    factor249=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor249.getTree());

            	    }
            	    break;

            	default :
            	    break loop60;
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
    // src/parser/Music.g:226:1: factor : ( NOT ^| PLUS ^| MINUS ^)? atom ;
    public final MusicParser.factor_return factor() throws RecognitionException {
        MusicParser.factor_return retval = new MusicParser.factor_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token NOT250=null;
        Token PLUS251=null;
        Token MINUS252=null;
        MusicParser.atom_return atom253 =null;


        AmlTree NOT250_tree=null;
        AmlTree PLUS251_tree=null;
        AmlTree MINUS252_tree=null;

        try {
            // src/parser/Music.g:226:9: ( ( NOT ^| PLUS ^| MINUS ^)? atom )
            // src/parser/Music.g:226:13: ( NOT ^| PLUS ^| MINUS ^)? atom
            {
            root_0 = (AmlTree)adaptor.nil();


            // src/parser/Music.g:226:13: ( NOT ^| PLUS ^| MINUS ^)?
            int alt61=4;
            switch ( input.LA(1) ) {
                case NOT:
                    {
                    alt61=1;
                    }
                    break;
                case PLUS:
                    {
                    alt61=2;
                    }
                    break;
                case MINUS:
                    {
                    alt61=3;
                    }
                    break;
            }

            switch (alt61) {
                case 1 :
                    // src/parser/Music.g:226:14: NOT ^
                    {
                    NOT250=(Token)match(input,NOT,FOLLOW_NOT_in_factor2879); 
                    NOT250_tree = 
                    (AmlTree)adaptor.create(NOT250)
                    ;
                    root_0 = (AmlTree)adaptor.becomeRoot(NOT250_tree, root_0);


                    }
                    break;
                case 2 :
                    // src/parser/Music.g:226:21: PLUS ^
                    {
                    PLUS251=(Token)match(input,PLUS,FOLLOW_PLUS_in_factor2884); 
                    PLUS251_tree = 
                    (AmlTree)adaptor.create(PLUS251)
                    ;
                    root_0 = (AmlTree)adaptor.becomeRoot(PLUS251_tree, root_0);


                    }
                    break;
                case 3 :
                    // src/parser/Music.g:226:29: MINUS ^
                    {
                    MINUS252=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor2889); 
                    MINUS252_tree = 
                    (AmlTree)adaptor.create(MINUS252)
                    ;
                    root_0 = (AmlTree)adaptor.becomeRoot(MINUS252_tree, root_0);


                    }
                    break;

            }


            pushFollow(FOLLOW_atom_in_factor2894);
            atom253=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom253.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (AmlTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // src/parser/Music.g:229:1: atom : ( ID | NUM | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | '(' ! expr ')' !);
    public final MusicParser.atom_return atom() throws RecognitionException {
        MusicParser.atom_return retval = new MusicParser.atom_return();
        retval.start = input.LT(1);


        AmlTree root_0 = null;

        Token b=null;
        Token ID254=null;
        Token NUM255=null;
        Token char_literal256=null;
        Token char_literal258=null;
        MusicParser.expr_return expr257 =null;


        AmlTree b_tree=null;
        AmlTree ID254_tree=null;
        AmlTree NUM255_tree=null;
        AmlTree char_literal256_tree=null;
        AmlTree char_literal258_tree=null;
        RewriteRuleTokenStream stream_TRUE=new RewriteRuleTokenStream(adaptor,"token TRUE");
        RewriteRuleTokenStream stream_FALSE=new RewriteRuleTokenStream(adaptor,"token FALSE");

        try {
            // src/parser/Music.g:229:9: ( ID | NUM | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | '(' ! expr ')' !)
            int alt63=4;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt63=1;
                }
                break;
            case NUM:
                {
                alt63=2;
                }
                break;
            case FALSE:
            case TRUE:
                {
                alt63=3;
                }
                break;
            case 81:
                {
                alt63=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;

            }

            switch (alt63) {
                case 1 :
                    // src/parser/Music.g:229:13: ID
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    ID254=(Token)match(input,ID,FOLLOW_ID_in_atom2910); 
                    ID254_tree = 
                    (AmlTree)adaptor.create(ID254)
                    ;
                    adaptor.addChild(root_0, ID254_tree);


                    }
                    break;
                case 2 :
                    // src/parser/Music.g:230:7: NUM
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    NUM255=(Token)match(input,NUM,FOLLOW_NUM_in_atom2918); 
                    NUM255_tree = 
                    (AmlTree)adaptor.create(NUM255)
                    ;
                    adaptor.addChild(root_0, NUM255_tree);


                    }
                    break;
                case 3 :
                    // src/parser/Music.g:231:7: (b= TRUE |b= FALSE )
                    {
                    // src/parser/Music.g:231:7: (b= TRUE |b= FALSE )
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==TRUE) ) {
                        alt62=1;
                    }
                    else if ( (LA62_0==FALSE) ) {
                        alt62=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 62, 0, input);

                        throw nvae;

                    }
                    switch (alt62) {
                        case 1 :
                            // src/parser/Music.g:231:8: b= TRUE
                            {
                            b=(Token)match(input,TRUE,FOLLOW_TRUE_in_atom2929);  
                            stream_TRUE.add(b);


                            }
                            break;
                        case 2 :
                            // src/parser/Music.g:231:17: b= FALSE
                            {
                            b=(Token)match(input,FALSE,FOLLOW_FALSE_in_atom2935);  
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
                    // 231:27: -> ^( BOOLEAN[$b,$b.text] )
                    {
                        // src/parser/Music.g:231:30: ^( BOOLEAN[$b,$b.text] )
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
                    // src/parser/Music.g:232:7: '(' ! expr ')' !
                    {
                    root_0 = (AmlTree)adaptor.nil();


                    char_literal256=(Token)match(input,81,FOLLOW_81_in_atom2952); 

                    pushFollow(FOLLOW_expr_in_atom2955);
                    expr257=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr257.getTree());

                    char_literal258=(Token)match(input,82,FOLLOW_82_in_atom2957); 

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


 

    public static final BitSet FOLLOW_global_stmt_in_prog172 = new BitSet(new long[]{0x0100004020000A00L,0x0000000000004010L});
    public static final BitSet FOLLOW_EOF_in_prog176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_global_stmt208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_frag_in_global_stmt226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_song_in_global_stmt244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_void_in_function269 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ID_in_function273 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_function275 = new BitSet(new long[]{0x0100004000000A00L,0x0000000000040000L});
    public static final BitSet FOLLOW_list_arguments_in_function277 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_function279 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_function281 = new BitSet(new long[]{0x0500007C10108A80L,0x0000000002008470L});
    public static final BitSet FOLLOW_listInst_in_function283 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_function285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FRAGMENT_in_frag327 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ID_in_frag330 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_frag332 = new BitSet(new long[]{0x0100004000000A00L,0x0000000000040000L});
    public static final BitSet FOLLOW_list_arguments_in_frag335 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_frag337 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_frag340 = new BitSet(new long[]{0x0120005C10008B00L,0x0000000002028110L});
    public static final BitSet FOLLOW_list_music_inst_in_frag343 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_frag345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_argument_in_list_arguments365 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_list_arguments368 = new BitSet(new long[]{0x0100004000000A00L});
    public static final BitSet FOLLOW_argument_in_list_arguments370 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_type_in_argument411 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ID_in_argument414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_params440 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_params443 = new BitSet(new long[]{0x1411000404000000L,0x0000000000022000L});
    public static final BitSet FOLLOW_expr_in_params446 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_inst_in_listInst473 = new BitSet(new long[]{0x0500007C10108A82L,0x0000000000008470L});
    public static final BitSet FOLLOW_music_inst_in_list_music_inst507 = new BitSet(new long[]{0x0120005C10008B02L,0x0000000000028110L});
    public static final BitSet FOLLOW_declaration_in_inst551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tone_in_inst569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_beat_in_inst587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_speed_in_inst605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instrument_in_inst623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignation_in_inst641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_stmt_in_inst659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_inst677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_stmt_in_inst695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_stmt_in_inst713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_song_in_inst731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compas_list_in_inst749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_music_inst773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignation_in_music_inst791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_music_stmt_in_music_inst809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_music_inst827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_music_stmt_in_music_inst845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_music_stmt_in_music_inst863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_song_in_music_inst881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notes_group_in_music_inst908 = new BitSet(new long[]{0x0020000000000902L,0x0000000000420100L});
    public static final BitSet FOLLOW_86_in_music_inst912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_funcall943 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_funcall945 = new BitSet(new long[]{0x1411000404000000L,0x0000000000062000L});
    public static final BitSet FOLLOW_params_in_funcall947 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_funcall950 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_funcall952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_declaration985 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_assig_opt_in_declaration988 = new BitSet(new long[]{0x0000000000000000L,0x0000000000480000L});
    public static final BitSet FOLLOW_83_in_declaration991 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_assig_opt_in_declaration994 = new BitSet(new long[]{0x0000000000000000L,0x0000000000480000L});
    public static final BitSet FOLLOW_86_in_declaration998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_type_void1107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOID_in_type_void1125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assig_opt1150 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ASSIG_in_assig_opt1153 = new BitSet(new long[]{0x1431000404000900L,0x0000000000022100L});
    public static final BitSet FOLLOW_expr_in_assig_opt1157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notes_variable_in_assig_opt1161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assig_in_assignation1187 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_assignation1189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assig1219 = new BitSet(new long[]{0x200A000000040020L,0x0000000000000001L});
    public static final BitSet FOLLOW_set_in_assig1221 = new BitSet(new long[]{0x1431000404000900L,0x0000000000022100L});
    public static final BitSet FOLLOW_expr_in_assig1237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notes_variable_in_assig1241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_post_in_assig1260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pre_in_assig1278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_post1308 = new BitSet(new long[]{0x0000001000008000L});
    public static final BitSet FOLLOW_INCR_in_post1313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECR_in_post1319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INCR_in_pre1366 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_DECR_in_pre1372 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ID_in_pre1375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BEAT_in_beat1418 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_NUM_in_beat1421 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_beat1423 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_NUM_in_beat1426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SPEED_in_speed1455 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_NUM_in_speed1458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRANSPORT_in_transport1483 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_NUM_in_transport1486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUMENT_in_instrument1510 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_STRING_in_instrument1513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_stmt1537 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_while_stmt1540 = new BitSet(new long[]{0x1411000404000000L,0x0000000000022000L});
    public static final BitSet FOLLOW_expr_in_while_stmt1543 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_while_stmt1545 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_while_stmt1548 = new BitSet(new long[]{0x0500007C10108A80L,0x0000000002008470L});
    public static final BitSet FOLLOW_listInst_in_while_stmt1551 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_while_stmt1553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_music_stmt1580 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_while_music_stmt1583 = new BitSet(new long[]{0x1411000404000000L,0x0000000000022000L});
    public static final BitSet FOLLOW_expr_in_while_music_stmt1586 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_while_music_stmt1588 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_while_music_stmt1591 = new BitSet(new long[]{0x0120005C10008B00L,0x0000000002028110L});
    public static final BitSet FOLLOW_list_music_inst_in_while_music_stmt1594 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_while_music_stmt1596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_for_stmt1631 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_for_stmt1634 = new BitSet(new long[]{0x0100005400008A00L});
    public static final BitSet FOLLOW_declaration_in_for_stmt1638 = new BitSet(new long[]{0x1411000404000000L,0x0000000000022000L});
    public static final BitSet FOLLOW_list_assig_in_for_stmt1642 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_for_stmt1644 = new BitSet(new long[]{0x1411000404000000L,0x0000000000022000L});
    public static final BitSet FOLLOW_expr_in_for_stmt1648 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_for_stmt1650 = new BitSet(new long[]{0x0000001400008000L});
    public static final BitSet FOLLOW_list_assig_in_for_stmt1653 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_for_stmt1655 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_for_stmt1658 = new BitSet(new long[]{0x0500007C10108A80L,0x0000000002008470L});
    public static final BitSet FOLLOW_listInst_in_for_stmt1661 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_for_stmt1663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_for_music_stmt1688 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_for_music_stmt1691 = new BitSet(new long[]{0x0100005400008A00L});
    public static final BitSet FOLLOW_declaration_in_for_music_stmt1695 = new BitSet(new long[]{0x1411000404000000L,0x0000000000022000L});
    public static final BitSet FOLLOW_list_assig_in_for_music_stmt1699 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_for_music_stmt1701 = new BitSet(new long[]{0x1411000404000000L,0x0000000000022000L});
    public static final BitSet FOLLOW_expr_in_for_music_stmt1705 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_for_music_stmt1707 = new BitSet(new long[]{0x0000001400008000L});
    public static final BitSet FOLLOW_list_assig_in_for_music_stmt1710 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_for_music_stmt1712 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_for_music_stmt1715 = new BitSet(new long[]{0x0120005C10008B00L,0x0000000002028110L});
    public static final BitSet FOLLOW_list_music_inst_in_for_music_stmt1718 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_for_music_stmt1720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assig_in_list_assig1749 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_list_assig1752 = new BitSet(new long[]{0x0000001400008000L});
    public static final BitSet FOLLOW_assig_in_list_assig1754 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_IF_in_if_stmt1792 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_if_stmt1795 = new BitSet(new long[]{0x1411000404000000L,0x0000000000022000L});
    public static final BitSet FOLLOW_expr_in_if_stmt1798 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_if_stmt1800 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_if_stmt1803 = new BitSet(new long[]{0x0500007C10108A80L,0x0000000002008470L});
    public static final BitSet FOLLOW_listInst_in_if_stmt1806 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_if_stmt1808 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_elseif_stmt_in_if_stmt1811 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_else_stmt_in_if_stmt1814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_elseif_stmt1838 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_IF_in_elseif_stmt1840 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_elseif_stmt1842 = new BitSet(new long[]{0x1411000404000000L,0x0000000000022000L});
    public static final BitSet FOLLOW_expr_in_elseif_stmt1844 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_elseif_stmt1846 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_elseif_stmt1848 = new BitSet(new long[]{0x0500007C10108A80L,0x0000000002008470L});
    public static final BitSet FOLLOW_listInst_in_elseif_stmt1850 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_elseif_stmt1852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_else_stmt1887 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_else_stmt1890 = new BitSet(new long[]{0x0500007C10108A80L,0x0000000002008470L});
    public static final BitSet FOLLOW_listInst_in_else_stmt1893 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_else_stmt1895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_if_music_stmt1921 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_if_music_stmt1924 = new BitSet(new long[]{0x1411000404000000L,0x0000000000022000L});
    public static final BitSet FOLLOW_expr_in_if_music_stmt1927 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_if_music_stmt1929 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_if_music_stmt1932 = new BitSet(new long[]{0x0120005C10008B00L,0x0000000002028110L});
    public static final BitSet FOLLOW_list_music_inst_in_if_music_stmt1935 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_if_music_stmt1937 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_elseif_music_stmt_in_if_music_stmt1940 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_else_music_stmt_in_if_music_stmt1943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_elseif_music_stmt1973 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_IF_in_elseif_music_stmt1975 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_elseif_music_stmt1977 = new BitSet(new long[]{0x1411000404000000L,0x0000000000022000L});
    public static final BitSet FOLLOW_expr_in_elseif_music_stmt1979 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_elseif_music_stmt1981 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_elseif_music_stmt1983 = new BitSet(new long[]{0x0120005C10008B00L,0x0000000002028110L});
    public static final BitSet FOLLOW_list_music_inst_in_elseif_music_stmt1985 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_elseif_music_stmt1987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_else_music_stmt2028 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_else_music_stmt2031 = new BitSet(new long[]{0x0120005C10008B00L,0x0000000002028110L});
    public static final BitSet FOLLOW_list_music_inst_in_else_music_stmt2034 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_else_music_stmt2036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SONG_in_song2071 = new BitSet(new long[]{0x0000000400000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_song2074 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_song2077 = new BitSet(new long[]{0x0000000000000080L,0x0000000000001820L});
    public static final BitSet FOLLOW_beat_in_song2080 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001820L});
    public static final BitSet FOLLOW_speed_in_song2083 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_transport_in_song2086 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_track_in_song2090 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000800L});
    public static final BitSet FOLLOW_89_in_song2094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRACK_in_track2124 = new BitSet(new long[]{0x0400000400100000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_ID_in_track2127 = new BitSet(new long[]{0x0400000000100000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_STRING_in_track2130 = new BitSet(new long[]{0x0400000000100000L,0x0000000000000040L});
    public static final BitSet FOLLOW_compas_aux_in_track2133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compas_list_in_compas_aux2157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_BAR_in_compas_list2187 = new BitSet(new long[]{0x0520005C10108B00L,0x0000000000028550L});
    public static final BitSet FOLLOW_repetition_in_compas_list2192 = new BitSet(new long[]{0x0520005C10108B00L,0x0000000000028550L});
    public static final BitSet FOLLOW_compasses_in_compas_list2196 = new BitSet(new long[]{0x0520005C10108B00L,0x0000000000028550L});
    public static final BitSet FOLLOW_repetition_in_compas_list2200 = new BitSet(new long[]{0x0520005C10108B00L,0x0000000000028550L});
    public static final BitSet FOLLOW_DOUBLE_BAR_in_compas_list2205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compas_in_compasses2232 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_BAR_in_compasses2235 = new BitSet(new long[]{0x0120005C10008B00L,0x0000000000028510L});
    public static final BitSet FOLLOW_compas_in_compasses2238 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_NUM_in_repetition2265 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_repetition2267 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_START_REPETITION_in_repetition2271 = new BitSet(new long[]{0x0120005C10008B00L,0x0000000000028510L});
    public static final BitSet FOLLOW_compasses_in_repetition2273 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_END_REPETITION_in_repetition2275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tone_in_compas2316 = new BitSet(new long[]{0x0120005C10008B00L,0x0000000000028110L});
    public static final BitSet FOLLOW_music_inst_in_compas2329 = new BitSet(new long[]{0x0120005C10008B02L,0x0000000000028110L});
    public static final BitSet FOLLOW_TONE_in_tone2376 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_NUM_in_tone2379 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000100L});
    public static final BitSet FOLLOW_set_in_tone2381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notes_type_in_notes_group2410 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100200L});
    public static final BitSet FOLLOW_84_in_notes_group2413 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_FIGURE_in_notes_group2415 = new BitSet(new long[]{0x0000000000080002L,0x0000000000000200L});
    public static final BitSet FOLLOW_DOT_in_notes_group2417 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_TIE_in_notes_group2422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notes_type_in_notes_variable2464 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_notes_variable2467 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_FIGURE_in_notes_variable2469 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_DOT_in_notes_variable2471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_chord_in_notes_type2514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notes_in_notes_type2518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHORD_in_chord2547 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_chord2550 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_NOTE_in_chord2553 = new BitSet(new long[]{0x1000C00000010000L,0x0000000000040008L});
    public static final BitSet FOLLOW_82_in_chord2571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_notes2603 = new BitSet(new long[]{0x0020000000000100L,0x0000000000000100L});
    public static final BitSet FOLLOW_note_in_notes2606 = new BitSet(new long[]{0x0020000000000100L,0x0000000000040100L});
    public static final BitSet FOLLOW_82_in_notes2610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_note_in_notes2615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOTE_in_note2664 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_MINUS_in_note2668 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_NUM_in_note2671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolterm_in_expr2700 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_OR_in_expr2703 = new BitSet(new long[]{0x1411000404000000L,0x0000000000022000L});
    public static final BitSet FOLLOW_boolterm_in_expr2706 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_boolfact_in_boolterm2724 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_boolterm2727 = new BitSet(new long[]{0x1411000404000000L,0x0000000000022000L});
    public static final BitSet FOLLOW_boolfact_in_boolterm2730 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_num_expr_in_boolfact2752 = new BitSet(new long[]{0x0200208301000002L});
    public static final BitSet FOLLOW_EQUAL_in_boolfact2756 = new BitSet(new long[]{0x1411000404000000L,0x0000000000022000L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_boolfact2761 = new BitSet(new long[]{0x1411000404000000L,0x0000000000022000L});
    public static final BitSet FOLLOW_LT_in_boolfact2766 = new BitSet(new long[]{0x1411000404000000L,0x0000000000022000L});
    public static final BitSet FOLLOW_LE_in_boolfact2771 = new BitSet(new long[]{0x1411000404000000L,0x0000000000022000L});
    public static final BitSet FOLLOW_GT_in_boolfact2776 = new BitSet(new long[]{0x1411000404000000L,0x0000000000022000L});
    public static final BitSet FOLLOW_GE_in_boolfact2781 = new BitSet(new long[]{0x1411000404000000L,0x0000000000022000L});
    public static final BitSet FOLLOW_num_expr_in_boolfact2785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_num_expr2807 = new BitSet(new long[]{0x1001000000000002L});
    public static final BitSet FOLLOW_PLUS_in_num_expr2812 = new BitSet(new long[]{0x1411000404000000L,0x0000000000022000L});
    public static final BitSet FOLLOW_MINUS_in_num_expr2817 = new BitSet(new long[]{0x1411000404000000L,0x0000000000022000L});
    public static final BitSet FOLLOW_term_in_num_expr2821 = new BitSet(new long[]{0x1001000000000002L});
    public static final BitSet FOLLOW_factor_in_term2843 = new BitSet(new long[]{0x00040000000A0002L});
    public static final BitSet FOLLOW_DOT_in_term2848 = new BitSet(new long[]{0x1411000404000000L,0x0000000000022000L});
    public static final BitSet FOLLOW_DIV_in_term2853 = new BitSet(new long[]{0x1411000404000000L,0x0000000000022000L});
    public static final BitSet FOLLOW_MOD_in_term2858 = new BitSet(new long[]{0x1411000404000000L,0x0000000000022000L});
    public static final BitSet FOLLOW_factor_in_term2862 = new BitSet(new long[]{0x00040000000A0002L});
    public static final BitSet FOLLOW_NOT_in_factor2879 = new BitSet(new long[]{0x0400000404000000L,0x0000000000022000L});
    public static final BitSet FOLLOW_PLUS_in_factor2884 = new BitSet(new long[]{0x0400000404000000L,0x0000000000022000L});
    public static final BitSet FOLLOW_MINUS_in_factor2889 = new BitSet(new long[]{0x0400000404000000L,0x0000000000022000L});
    public static final BitSet FOLLOW_atom_in_factor2894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom2910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUM_in_atom2918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_atom2929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_atom2935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_atom2952 = new BitSet(new long[]{0x1411000404000000L,0x0000000000022000L});
    public static final BitSet FOLLOW_expr_in_atom2955 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_atom2957 = new BitSet(new long[]{0x0000000000000002L});

}