grammar Music;

options {
	output = AST;
	ASTLabelType = AmlTree;
}

// Imaginary tokens to create some AST nodes

tokens {
    LIST_FUNCTIONS;
    FUNCTION;
    COMPAS_LIST;
    NOTE_LIST;
    BOOLEAN;
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

function    :   id=ID '('params?')' '{' listInst '}'    ->   ^(FUNCTION[$id.text] params? listInst)
            ;

params      :   expr (','! expr)*;

listInst    :   (inst)*;

inst        :   declaration
            |   assignation
            |   while_stmt
            |   for_stmt
            |   if_stmt
            |   song
            ;

declaration :   INT^ ID (EQUAL! atom)? ';'!
            |   BOOL^ ID (EQUAL! atom)? ';'!
            ;

assignation :   ID EQUAL^ atom
            ;

beat        :   BEAT^ NUM ':'! NUM
            ;

speed       :   SPEED^ NUM
            ;

//TODO:
while_stmt       :   WHILE^
            ;

for_stmt         :   FOR^
            ;

if_stmt          :   IF^
            ;
//END TODO

song        :   SONG^ '{'! beat speed (track)+ '}'!
            ;


track       :   TRACK^ ID compas_list
            ;

compas_list :   (DOUBLE_BAR compas) (BAR compas)* DOUBLE_BAR -> ^(COMPAS_LIST compas+)
            ;

compas      :   (note)+    -> ^(NOTE_LIST note+)
            ;

note        :   (BEMOL | SUSTAIN)? NOTE^ ('.'! FIGURE)? DOT? TIE?
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
		|   INT
		|   (b=TRUE | b=FALSE)  -> ^(BOOLEAN[$b,$b.text])
		|   '('! expr ')'!
		;

// Music tokens
BAR                 : '|';
DOUBLE_BAR           : '||';
START_REPETITION    : '||:';
END_REPETITION      : ':||';
BEMOL               : '&';
NOTE                : ('Do'|'Re'|'Mi'|'Fa'|'Sol'|'La'|'Si');
SUSTAIN             : '#';
FIGURE              : ('r'|'b'|'n'|'c'|'sc'|'f'|'sf');
DOT                 : '*';
TIE                 : '~';
BEAT                : 'Beat';
SPEED               : 'Speed';
SONG                : 'Song';
TRACK               : 'Track';

// Programming tokens
EQUAL	: '=' ;
NOT_EQUAL: '!=' ;
LT	    : '<' ;
LE	    : '<=';
GT	    : '>';
GE	    : '>=';
PLUS	: '+' ;
MINUS	: '-' ;
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


