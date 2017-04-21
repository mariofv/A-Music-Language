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
    ATTR_ACCESS;
    VAR_FUNCALL;
    LIST_INSTRUCTIONS;
    LIST_MUSIC_INST;
    LIST_ARGUMENTS;
    COMPAS_LIST;
    COMPAS;
    NOTE_LIST;
    NOTES;
    REPETITION;
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

var_funcall :   id=id_rule '.' id2=id_rule '(' params? ')' ';'  ->  ^(VAR_FUNCALL[$id.text] $id2 params?)
            ;

var_access  :   id1=id_rule ('.' id2=id_rule) -> ^(ATTR_ACCESS[$id1.text] $id2)
            |   id_rule
            ;

id_rule     :   ID
            |   LETTER_X
            ;

function    :  type_void id=id_rule '(' list_arguments ')' '{' listInst '}'    ->   ^(FUNCTION[$id.text] type_void list_arguments listInst)
            ;

funcall     :   id=id_rule '(' params? ')' -> ^(FUNCALL[$id.text] params?)
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
            |   'return'^ (expr | notes_group) ';'!
            |   var_funcall
            |   tone ';'!
            |   beat ';'!
            |   speed ';'!
            |   instrument ';'!
            |   assignation
            |   while_stmt
            |   funcall ';'!
            |   for_stmt
            |   if_stmt
            |   song
            |   compas_list
            ;

music_inst  :   declaration
            |   tone ';'!
            |   beat ';'!
            |   speed ';'!
            |   instrument ';'!
            |   var_funcall
            |   assignation
            |   while_music_stmt
            |   funcall ';'!
            |   for_music_stmt
            |   if_music_stmt
            |   song
            | 	(options {greedy=true;} : notes_group)+ ';'!?
            ;

declaration :   type^ assig_opt (','! assig_opt)* ';'!
            ;

type        :   INT
            |   BOOL
            |   NOTE_TYPE
            |   CHORD
            |   STRING_TYPE
            ;

type_void   :   type
            |   VOID
            ;

assig_opt   :   id_rule (ASSIG^ (expr | notes_variable))?
            ;

assignation :   assig ';'!
            ;

assig       :   var_access (ASSIG|PLUS_ASSIG|MINUS_ASSIG|PROD_ASSIG|DIVIDE_ASSIG|MOD_ASSIG)^ (expr | notes_variable | FIGURE)
            |   post
            |   pre
            ;

post        :   var_access (x=INCR | x=DECR) ->  ^(POST var_access $x)
            ;

pre         :   (x=INCR | x=DECR) var_access  -> ^(PRE  var_access $x)
            ;

beat        :   BEAT^ NUM ':'! NUM
            ;

speed       :   SPEED^ NUM
            ;

transport   :   TRANSPORT^ expr
            ;

instrument  :   INSTRUMENT^ STRING ';'
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

song        :   SONG^ id_rule? '{'! (beat ';'!)? (speed ';'!)? (tone ';'!)? (transport ';'!)?  (track)+ '}'!
            ;

track       :   TRACK^ id_rule? STRING? compas_aux
            ;

compas_aux  :   compas_list -> ^(COMPAS_LIST compas_list)
            ;

compas_list : (DOUBLE_BAR! | repetition) (compasses | repetition)* (DOUBLE_BAR!)
            ;

compasses   :   compas (BAR! compas)*
            ;

repetition  :   (NUM LETTER_X)? START_REPETITION compasses END_REPETITION    -> ^(REPETITION NUM? compasses)
            ;

compas      :  (options {greedy=true;} : music_inst)+    -> ^(COMPAS music_inst+)
            ;

tone        :   TONE^ NUM (SUSTAIN | BEMOL)
            ;

notes_group :   notes_type ('.' FIGURE DOT?)? TIE? -> ^(NOTES notes_type FIGURE? DOT? TIE?)
            ;

notes_variable  :   notes_type ('.' FIGURE DOT?)? -> ^(NOTES notes_type FIGURE? DOT?)
                ;

notes_type  :	chord | notes
            ;

chord       :   CHORD^ '('! note (MINOR|PLUS|DIMINUTION)? (SEVENTH | MAJ7)? ')'!
            ;

notes       :   ( '(' (note)+ ')'  | note) -> ^(NOTE_LIST note+)
            ;

note        :   (BEMOL | SUSTAIN)? NOTE^ ('-'! NUM)?
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
		|   NUM
		|   STRING
		|   funcall
		|   (b=TRUE | b=FALSE)  -> ^(BOOLEAN[$b,$b.text])
		|   '('! expr ')'!
		;

// Music tokens
TONE                : 'Tone';
BAR                 : '|';
DOUBLE_BAR           : '||';
START_REPETITION    : '||:';
END_REPETITION      : ':||';
BEMOL               : '&';
CHORD               : 'Chord';
TRANSPORT           : 'Transport';
MINOR               : 'm';
DIMINUTION          : 'º';
MAJ7                : 'maj7';
SEVENTH             : '7th';
NOTE_TYPE           : 'Note';
NOTE                : ('Do'|'Re'|'Mi'|'Fa'|'Sol'|'La'|'Si'|'Silence');
SUSTAIN             : '#';
FIGURE              : ('r'|'b'|'n'|'c'|'sc'|'f'|'sf');
DOT                 : '*';
TIE                 : '~';
BEAT                : 'Beat';
SPEED               : 'Speed';
SONG                : 'Song';
TRACK               : 'Track';
INSTRUMENT          : 'Instrument';

// Programming tokens
LETTER_X:   'x';
FRAGMENT: 'fragment';
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
ID  	:	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')* ;
NUM 	:	'0'..'9'+ ;

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