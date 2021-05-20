grammar Python_grammar;

//tokeny
DEF : 'def';
RETURN : 'return';
IF : 'if';
ELIF : 'elif';
ELSE : 'else';
WHILE : 'while';
FOR : 'for';
IN : 'in';
OR : 'or';
AND : 'and';
NOT : 'not';
TRUE : 'True';
FALSE : 'False';

OPEN_PAREN : '(';
CLOSE_PAREN : ')';
COMMA : ',';
COLON : ':';
SEMI_COLON : ';';
ASSIGN : '=';
OPEN_BRACK : '[';
CLOSE_BRACK : ']';
ADD : '+';
MINUS : '-';
STAR : '*';
DIV : '/';
LESS_THAN : '<';
GREATER_THAN : '>';
EQUALS : '==';
GT_EQ : '>=';
LT_EQ : '<=';
NOT_EQ : '!=';

NEW_LINE : [\r\n]+ ;
INDENT : [\t] ;
VAR : [a-zA-Z][a-zA-Z0-9_]*;
INT : [0-9]+;
FLOAT : [0-9]+'.'[0-9]+;


//gramatyka

variable: VAR;
func_name: VAR;
list: '[' (variable ',' )* variable ']';

if_stmt: IF expr_bool ':' body ( ELIF expr_bool ':' NEW_LINE body )* ( ELSE ':' NEW_LINE body )?;

while_stmt: WHILE expr_bool ':' body;

for_stmt: FOR variable IN list ':' body;

func: func_def NEW_LINE func_body;

func_def: 'def ' func_name '(' func_args '):' NEW_LINE;
func_body: (INDENT func_line)* INDENT func_ret NEW_LINE ;
func_ret: 'return ' expr_math ;
func_line: expr NEW_LINE ;
func_args: (variable ',')* variable;
func_invoke_args: (expr_math ',')* expr_math;

expr
    : assign
    | expr_math;

expr_math: expr_math ('*'|'/') expr_math
    | expr_math ('+'|'-') expr_math
    | INT
    | func_call
    | VAR
    | '(' expr_math ')';

func_call: func_name '(' func_invoke_args ')';

assign: VAR '=' expr_math;

body: expr_math | NEWLINE INDENT compound_stmt+;

compound_stmt
     : if_stmt
     | while_stmt
     | for_stmt;

expr_bool: or_test | TRUE;

or_test: and_test ( OR and_test )*;

and_test: not_test ( AND not_test )*;

not_test: NOT not_test | comparison;

comparison: (VAR|INT) (comp_op (VAR|INT))*;

comp_op
     : LESS_THAN
     | GREATER_THAN
     | EQUALS
     | GT_EQ
     | LT_EQ
     | NOT_EQ;


