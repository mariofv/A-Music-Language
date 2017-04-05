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
    FUNCTION;
    FUNCALL;
    LIST_INSTRUCTIONS;
    LIST_ARGUMENTS;
    COMPAS_LIST;
    COMPAS;
    NOTE_LIST;
    NOTES;
    REPETITION;
    TONE;
}

@header {
package parser;
    import interpreter.AmlTree;
}

@lexer::header {
    package parser;
}

prog	    :   function+ EOF -> ^(LIST_FUNCTIONS function+)
            ;

function    :   id=ID '(' list_arguments ')' '{' listInst '}'    ->   ^(FUNCTION[$id.text] list_arguments listInst)
            ;



list_arguments  : (argument (',' argument)*)? -> ^(LIST_ARGUMENTS argument*)
                ;

argument  :   ((INT|BOOL)^ ID)
          ;

params      :   expr (','! expr)*;

listInst    :   (inst)* -> ^(LIST_INSTRUCTIONS inst*)
            ;

inst        :   declaration
            |   assignation
            |   while_stmt
            |   funcall
            |   for_stmt
            |   if_stmt
            |   song
            ;

funcall     :   id=ID '(' params? ')' ';' -> ^(FUNCALL[$id.text] params?)
            ;

declaration :   (INT | BOOL)^ assig_opt (','! assig_opt)* ';'!
            ;

assig_opt   :   ID (ASSIG^ expr)?
            ;

assignation :   assig ';'!
            ;

assig       :   ID (ASSIG|PLUS_ASSIG|MINUS_ASSIG|PROD_ASSIG|DIVIDE_ASSIG|MOD_ASSIG)^ expr
            |   post
            |   pre
            ;

post        :   ID (x=INCR | x=DECR) ->  ^(POST ID $x)
            ;

pre         :   (x=INCR | x=DECR) ID  -> ^(PRE  ID $x)
            ;

beat        :   BEAT^ NUM ':'! NUM
            ;

speed       :   SPEED^ NUM
            ;

transport   :   TRANSPORT^ NUM
            ;

while_stmt       :   WHILE^ '('! expr ')'! '{'! listInst '}'!
            ;

for_stmt    :   FOR^ '('! (declaration | assignation) expr ';'! assig (','! assig)* ')'! '{'! listInst '}'!
            ;

if_stmt     :   IF^ '('! expr ')'! '{'! listInst '}'! elseif_stmt* else_stmt?
            ;

elseif_stmt :   ELSE IF '(' expr ')' '{' listInst '}' -> ^(ELSEIF expr listInst)
            ;

else_stmt   :   ELSE^ '{'! listInst '}'!
            ;

song        :   SONG^ ID? '{'! beat speed transport? (track)+ '}'!
            ;

track       :   TRACK^ ID? STRING compas_aux
            ;

compas_aux  :   compas_list -> ^(COMPAS_LIST compas_list)
            ;

compas_list : (DOUBLE_BAR! | repetition) (compasses | repetition)* (DOUBLE_BAR! | repetition)
            ;

compasses   :   compas (BAR! compas)*;

repetition  :   (NUM 'x')? START_REPETITION compasses END_REPETITION    -> ^(REPETITION NUM compasses)
            ;

compas      :   tone? (options {greedy=true;} : notes_group)+    -> ^(COMPAS tone? notes_group+)
            ;

tone        :   NUM (x=SUSTAIN | x=BEMOL)   ->  ^(TONE NUM $x)
            ;

notes_group :   notes_type ('.' FIGURE)? DOT? TIE? -> ^(NOTE_LIST notes_type FIGURE? DOT? TIE?)
            ;

notes_type  :	chord | notes;

chord       :   CHORD^ '('! NOTE (MINOR|PLUS|DIMINUTION)? (SEVENTH|MAJ7)? ')'!
            ;

notes       :   ( '(' (note)+ ')'  | note) -> ^(NOTES note+)
            ;

note        :   (BEMOL | SUSTAIN)? NOTE^ ('-'! NUM)?
            ;

// Grammar for expressions with boolean, relational and aritmetic operators
expr    :   boolterm (OR^ boolterm)*
		;

boolterm:   boolfact (AND^ boolfact)*
		;

boolfact:   num_expr ((EQUAL^ | NOT_EQUAL^ | LT^ | LE^ | GT^ | GE^) num_expr)?
		;

num_expr:   term ( (PLUS^ | MINUS^) term)*
		;

term    :   factor ( (DOT^ | DIV^ | MOD^) factor)*
		;

factor  :   (NOT^ | PLUS^ | MINUS^)? atom
		;

atom    :   ID
		|   NUM
		|   (b=TRUE | b=FALSE)  -> ^(BOOLEAN[$b,$b.text])
		|   '('! expr ')'!
		;

// Music tokens
BAR                 : '|';
DOUBLE_BAR           : '||';
START_REPETITION    : '||:';
END_REPETITION      : ':||';
BEMOL               : '&';
CHORD               : 'Chord';
TONE                : 'Tone';
TRANSPORT           : 'Transport';
MINOR               : 'm';
DIMINUTION          : 'º';
MAJ7                : 'maj7';
SEVENTH             : '7th';

NOTE                : ('Do'|'Re'|'Mi'|'Fa'|'Sol'|'La'|'Si'|'Silence');
SUSTAIN             : '#';
FIGURE              : ('r'|'b'|'n'|'c'|'sc'|'f'|'sf');
DOT                 : '*';
TIE                 : '~';
BEAT                : 'Beat';
SPEED               : 'Speed';
SONG                : 'Song';
TRACK               : 'Track';

// Programming tokens
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


