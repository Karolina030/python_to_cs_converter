grammar Python_grammar;

//gramatyka

// symbol startowy:
program: (simple_stmt_line |  function | compound_stmt )*;

simple_stmt
    : assignment_stmt
    | func_call
    | print_stmt
    | list_assignment_stmt;

simple_stmt_line: simple_stmt NEWLINE;

assignment_stmt: VAR '=' expr;
list_assignment_stmt: VAR '=' '[' (variable ',' )* variable ']';

print_stmt: 'print' '(' expr ')';

compound_stmt
    : if_stmt
    | while_stmt
    | for_stmt;

if_stmt: 'if' expr_bool ':' NEWLINE body elif_stmt* else_stmt?;
elif_stmt: 'elif' expr_bool ':' NEWLINE body;
else_stmt: 'else' ':' NEWLINE body;
while_stmt: 'while' expr_bool ':' NEWLINE body;
for_stmt: 'for' VAR 'in' VAR ':'  NEWLINE body;

//list: '[' (variable ',' )* variable ']';
variable: VAR|INT|FLOAT;

function: func_def NEWLINE func_body;
func_def: 'def' func_name '(' func_args ')' ':';
func_name: VAR;
func_body: body (TAB func_ret NEWLINE)?;
func_ret: 'return ' expr;
func_args: (VAR ',')* VAR;
func_invoke_args: (variable ',')* variable;
func_call: func_name '(' func_invoke_args ')';

body: (TAB simple_stmt_line)* ;

expr:
   expr (( '*' | '/' ) expr)+
 | expr (( '+' | '-' ) expr)+
 | VAR
 | INT
 | FLOAT
 | '(' expr ')'
 | func_call
;

expr_bool: or_test | TRUE;
or_test: and_test ( OR and_test )*;
and_test: not_test ( AND not_test )*;
not_test: NOT not_test | comparison;
comparison: (VAR|INT|FLOAT) (comp_op (VAR|INT|FLOAT))*;

comp_op
     : LESS_THAN
     | GREATER_THAN
     | EQUALS
     | GT_EQ
     | LT_EQ
     | NOT_EQ;


// tokeny

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
OPEN_BRACE : '{';
CLOSE_BRACE : '}';
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


VAR : [a-zA-Z][a-zA-Z0-9_]*;
INT
 : NON_ZERO_DIGIT DIGIT*
 | '0'+
 ;
FLOAT : INT+'.'[0-9]+;


SKIP_
 : ( ' ' | COMMENT | LINE_JOINING ) -> skip
 ;

NEWLINE : [\r\n]+;

TAB : [\t];

fragment NON_ZERO_DIGIT
 : [1-9]
 ;

fragment DIGIT
 : [0-9]
 ;

fragment SPACES
 : [ \t]+
 ;

fragment COMMENT
 : '#' ~[\r\n\f]*
 ;

fragment LINE_JOINING
 : '\\' SPACES? ( '\r'? '\n' | '\r' | '\f' )
 ;