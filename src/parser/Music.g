grammar Music;

options {
	output = AST;
	ASTLabelType = AmlTree;
}

// Imaginary tokens to create some AST nodes

tokens {
    BOOLEAN;
    POST;
    PRE;
    ELSEIF;
    LIST_FUNCTIONS;
    LIST_ASSIG;
    FUNCTION;
    FUNCALL;
    FRAGCALL;
    ATTR_ACCESS;
    VAR_FUNCALL;
    LIST_INSTRUCTIONS;
    LIST_MUSIC_INST;
    LIST_ARGUMENTS;
    COMPAS_LIST;
    COMPAS;
    DRUM_FIGURE;
    FIGURE;
    DRUM_NOTES;
    DRUM_NOTE;
    NOTES;
    REPETITION;
    ID;
    NUM;
    TRIPLET;
}

@header {
package parser;
    import interpreter.AmlTree;
}

@lexer::header {
    package parser;
}

prog	    :   (global_stmt)+ EOF -> ^(LIST_FUNCTIONS global_stmt+)
            ;

global_stmt :   function
            |   frag
            |   song
            ;

function    :  type_void id=id_rule '(' list_arguments ')' '{' listInst '}'    ->   ^(FUNCTION[$id.text] type_void list_arguments listInst)
            ;

funcall     :  id=id_rule '(' params? ')' -> ^(FUNCALL[$id.text] params?)
            ;

fragcall     :   'F:' id=id_rule '(' params? ')' -> ^(FRAGCALL[$id.text] params?)
            ;

frag    : FRAGMENT^ id_rule '('! list_arguments ')'! '{'! list_music_inst '}'!
        ;

list_arguments  : (argument (',' argument)*)? -> ^(LIST_ARGUMENTS argument*)
                ;

argument  :   type^ id_rule
          ;

params      :   (expr | notes_variable) (','! (expr | notes_variable))*
            ;

listInst    :  inst+  -> ^(LIST_INSTRUCTIONS inst+)
            ;

list_music_inst :   music_inst+ -> ^(LIST_MUSIC_INST music_inst+)
                ;

inst        :   declaration
            |   volume ';'
            |   'return'^ (expr | notes_variable) ';'!
            |   READ^ var_access ';'
            |   WRITE^ (expr | notes_variable) ';'
            |   var_funcall ';'
            |   tone ';'!
            |   beat ';'!
            |   speed ';'!
            |   instrument ';'!
            |   transport ';'!
            |   assignation
            |   while_stmt
            |   funcall ';'!
            |   for_stmt
            |   if_stmt
            |   song
            |   compas_aux
            ;

music_inst  :   declaration
            |   READ^ var_access ';'
            |   WRITE^ (expr | notes_variable) ';'
            |   volume ';'!
            |   tone ';'!
            |   beat ';'!
            |   speed ';'!
            |   instrument ';'!
            |   transport ';'!
            |   var_funcall ';'
            |   assignation
            |   while_music_stmt
            |   funcall ';'!
            |   fragcall ';'!
            |   for_music_stmt
            |   if_music_stmt
            | 	(options {greedy=true;} : notes_group)+ ';'!?
            |   triplet
            ;

declaration :   type^ assig_opt (','! assig_opt)* ';'!
            ;

type        :   INT
            |   BOOL
            |   NOTE_TYPE
            |   DRUMS_NOTE_TYPE
            |   CHORD
            |   STRING_TYPE
            |   FIGURE_TYPE
            ;

type_void   :   type
            |   VOID
            ;

assig_opt   :   id_rule (ASSIG^ (expr | notes_variable))?
            ;

assignation :   assig ';'!
            ;

assig       :   var_access (ASSIG|PLUS_ASSIG|MINUS_ASSIG|PROD_ASSIG|DIVIDE_ASSIG|MOD_ASSIG)^ (expr | notes_variable | FIGURE_NAME)
            |   post
            |   pre
            ;

var_funcall :   id=id_rule '.' id2=id_rule '(' params? ')'  ->  ^(VAR_FUNCALL[$id.text] $id2 params?)
            ;

var_access  :   id1=id_rule ('.' id2=id_rule) -> ^(ATTR_ACCESS[$id1.text] $id2)
            |   id_rule
            ;

id_rule     :   (id=ID_ |   id=LETTER_X) -> ^(ID[$id])
            ;


post        :   var_access (x=INCR | x=DECR) ->  ^(POST var_access $x)
            ;

pre         :   (x=INCR | x=DECR) var_access  -> ^(PRE  var_access $x)
            ;

beat        :   BEAT^ num_expr ':'! num_expr
            ;

speed       :   SPEED^ num_expr
            ;

volume      :   VOLUME^ num_expr;

transport   :   TRANSPORT^ num_expr
            ;

instrument  :   INSTRUMENT^ STRING
            ;

while_stmt  :   WHILE^ '('! expr ')'! '{'! listInst '}'!
            ;

while_music_stmt    :   WHILE^ '('! expr ')'! '{'! list_music_inst '}'!
                    ;

for_stmt    :   FOR^ '('! (declaration | list_assig ';'!) expr ';'! list_assig ')'! '{'! listInst '}'!
            ;

for_music_stmt  :   FOR^ '('! (declaration | list_assig ';'!) expr ';'! list_assig ')'! '{'! list_music_inst '}'!
                ;

list_assig  :   assig (',' assig)* -> ^(LIST_ASSIG assig+)
            ;

if_stmt     :   IF^ '('! expr ')'! '{'! listInst '}'! elseif_stmt* else_stmt?
            ;

elseif_stmt :   ELSE IF '(' expr ')' '{' listInst '}' -> ^(ELSEIF expr listInst)
            ;

else_stmt   :   ELSE^ '{'! listInst '}'!
            ;

if_music_stmt   :   IF^ '('! expr ')'! '{'! list_music_inst '}'! elseif_music_stmt* else_music_stmt?
                ;

elseif_music_stmt   :   ELSE IF '(' expr ')' '{' list_music_inst '}' -> ^(ELSEIF expr list_music_inst)
                    ;

else_music_stmt :   ELSE^ '{'! list_music_inst '}'!
                ;

song        :   SONG^ id_rule? '{'! (beat ';'!)? (speed ';'!)? (tone ';'!)? (transport ';'!)?  (track)+ drums_track? '}'!
            ;

track       :   TRACK^ id_rule!? STRING? compas_aux
            ;

drums_track :   DRUMS^ compas_aux
            ;

compas_aux  :   compas_list -> ^(COMPAS_LIST compas_list)
            ;

compas_list : (DOUBLE_BAR! | repetition) compas_or_repetition (DOUBLE_BAR!)
            ;

compasses   :   compas (BAR! compas)*
            ;

repetition  :   (POS_NUM LETTER_X)? START_REPETITION repetition_aux END_REPETITION    -> ^(REPETITION POS_NUM? repetition_aux)
            ;

repetition_aux : compas_or_repetition -> ^(COMPAS_LIST compas_or_repetition);

compas_or_repetition : (compasses | repetition)*;

compas      :  (options {greedy=true;} : music_inst)+    -> ^(COMPAS music_inst+)
            ;

tone        :   TONE^ expr (SUSTAIN | BEMOL)
            ;


notes_group :   notes_type ('.' (FIGURE_NAME POS_NUM?) DOT?)? TIE? -> ^(FIGURE notes_type FIGURE_NAME? DOT? TIE?)
	        |  ':'! id_rule
            ;

notes_variable  :   notes_type ('.' (FIGURE_NAME POS_NUM?) DOT?)? TIE? -> ^(FIGURE notes_type FIGURE_NAME? DOT? TIE?)
                ;

notes_type  :	chord | notes | drumsnotes
            ;

chord       :   CHORD^ '('! note (MINOR|PLUS|DIMINUTION)? (SEVENTH | MAJ7)? ')'!
            ;

notes       :   ( '(' (note)+ ')'  | note) -> ^(NOTES note+)
            ;

triplet     :   '[' notes_type notes_type notes_type ']' FIGURE_NAME? -> ^(TRIPLET FIGURE_NAME? notes_type notes_type notes_type)
            ;

drumsnotes  :   ( '(' (drum_note)+ ')'  | drum_note) -> ^(DRUM_NOTES drum_note+)
            ;

drum_note_aux : DN '(' num_expr ')' -> ^(DRUM_NOTE num_expr);

drum_note   :  drum_note_aux
            |   'DN:'! id_rule
            ;

note_aux    :   (BEMOL | SUSTAIN | ARMOR)? NOTE^ (NEG_NUM)?
            ;

note        :   note_aux
            |   'N:'! id_rule
            ;

// Grammar for expressions with boolean, relational and aritmetic operators
expr    :   boolterm (OR^ boolterm)*
		;

boolterm    :   boolfact (AND^ boolfact)*
		    ;

boolfact    :   num_expr ((EQUAL^ | NOT_EQUAL^ | LT^ | LE^ | GT^ | GE^) num_expr)?
		    ;

num_expr    :   term ( (PLUS^ | MINUS^) term)*
		    ;

term    :   factor ( (DOT^ | DIV^ | MOD^) factor)*
		;

factor  :   (NOT^ | PLUS^ | MINUS^)? atom
		;

atom    :   var_access
		|   nnum
		|   'N:'! note_aux
		|   'DN:'! drum_note_aux
		|   STRING
		|   funcall
		|   var_funcall
		|   TRUE
		|   FALSE
		|   '('! expr ')'!
		;

nnum     :   (x=POS_NUM | x=NEG_NUM) -> ^(NUM[$x])
        ;

// Music tokens
TONE                : 'Tone';
BAR                 : '|';
DOUBLE_BAR           : '||';
START_REPETITION    : '||:';
END_REPETITION      : ':||';
CHORD               : 'Chord';
TRANSPORT           : 'Transport';
VOLUME              : 'Volume';
MINOR               : 'm';
DIMINUTION          : 'º';
MAJ7                : 'maj7';
SEVENTH             : '7th';
NOTE_TYPE           : 'Note';
DRUMS_NOTE_TYPE     : 'DrumsNote';
FIGURE_TYPE         : 'Figure';
DN                  :  'DN';
NOTE                : ('Do'|'Re'|'Mi'|'Fa'|'Sol'|'La'|'Si'|'Silence');
DRUMS               : 'Drums';
SUSTAIN             : '#';
BEMOL               : '&';
ARMOR               : '$';
FIGURE_NAME              : ('r'|'b'|'n'|'c'|'sc'|'f'|'sf');
DOT                 : '*';
TIE                 : '~';
BEAT                : 'Beat';
SPEED               : 'Speed';
SONG                : 'Song';
TRACK               : 'Track';
DRUMS_TRACK         : 'Drums_Track';
INSTRUMENT          : 'Instrument';

// Programming tokens
READ    : 'Read';
WRITE   : 'Write';
LETTER_X:   'x';
FRAGMENT: 'Fragment';
VOID    : 'void';
EQUAL	: '==' ;
NOT_EQUAL: '!=' ;
ASSIG:  '=';
PLUS_ASSIG: '+=';
MINUS_ASSIG: '-=';
PROD_ASSIG: '*=';
DIVIDE_ASSIG: '/=';
MOD_ASSIG: '%=';
LT	    : '<' ;
LE	    : '<=';
GT	    : '>';
GE	    : '>=';
PLUS	: '+' ;
INCR    : '++';
MINUS	: '-' ;
DECR    : '--';
DIV	    : '/';
MOD	    : '%' ;
NOT	    : 'not';
AND	    : 'and' ;
OR	    : 'or' ;
IF  	: 'if' ;
ELSE	: 'else' ;
WHILE	: 'while' ;
FOR     : 'for' ;
RETURN	: 'return' ;
TRUE    : 'true' ;
FALSE   : 'false';
INT     : 'int';
BOOL    : 'bool';
STRING_TYPE : 'string';
ID_  	:	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')* ;
POS_NUM :	'0'..'9'+;
NEG_NUM :   '-' '0'..'9'+;

// C-style comments
COMMENT	: '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
		| '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
		;

// Strings (in quotes) with escape sequences
STRING  :  '"' ( ESC_SEQ | ~('\\'|'"') )* '"'
		;

fragment
ESC_SEQ
	:   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
	;

// White spaces
WS  	: ( ' '
		| '\t'
		| '\r'
		| '\n'
		) {$channel=HIDDEN;}
		;