grammar Python_grammar;

//poniższy kod odpowiedzialny jest za obsługę wcięć

tokens { INDENT, DEDENT }

@lexer::header {
import org.antlr.v4.runtime.misc.Interval;
import java.util.*;
}

@lexer::members {
private Stack<Integer> indentLengths = new Stack<>();
private LinkedList<Token> pendingTokens = new LinkedList<>();
private int lastPendingTokenType;
private int opened = 0;
private boolean wasSpaceIndentation = false;
private boolean wasTabIndentation = false;
private List<String> warnings = new ArrayList<>();
private List<String> errors = new ArrayList<>();
public static final String TEXT_LEXER = "lexer --> ";
public static final String TEXT_INSERTED_INDENT = "inserted INDENT";
@Override
public Token nextToken() {
    if (_input.size() == 0) {
        return new CommonToken(EOF, "<EOF>");
    } else {
        checkNextToken();
        return this.pendingTokens.pollFirst();
    }
}

private void checkNextToken() {
    if (this.indentLengths != null) {
        final int startSize = this.pendingTokens.size();
        Token curToken;
        do {
            curToken = super.nextToken();
            checkStartOfInput(curToken);
            switch (curToken.getType()) {
                case OPEN_PAREN:
                case OPEN_BRACK:
                case OPEN_BRACE:
                    this.opened++;
                    this.pendingTokens.addLast(curToken);
                    break;
                case CLOSE_PAREN:
                case CLOSE_BRACK:
                case CLOSE_BRACE:
                    this.opened--;
                    this.pendingTokens.addLast(curToken);
                    break;
                case NEWLINE:
                    handleNewLineToken(curToken);
                    break;
                case EOF:
                    handleEofToken(curToken);
                    break;
                default:
                    this.pendingTokens.addLast(curToken);
            }
        } while (this.pendingTokens.size() == startSize);
        this.lastPendingTokenType = curToken.getType();
    }
}

private void checkStartOfInput(Token curToken) {
    if (indentLengths.size() == 0) {
        indentLengths.push(0);
        if (_input.getText(new Interval(0, 0)).trim().length() == 0) {
            this.insertLeadingTokens(curToken.getType(), curToken.getStartIndex());
        }
    }
}

private void handleNewLineToken(Token curToken) {
    if (this.opened == 0) {
        switch (_input.LA(1) /* next symbol */) {
            case '\r':
            case '\n':
            case '\f':
            case '#':
            case EOF:
                return;

            default:
                this.pendingTokens.addLast(curToken);
                this.insertIndentDedentTokens(this.getIndentationLength(curToken.getText()));
        }
    }
}

private void handleEofToken(Token curToken) {
    this.insertTrailingTokens(this.lastPendingTokenType); // indentLengths stack will be null!
    this.pendingTokens.addLast(curToken); // insert the current EOF token
    this.checkSpaceAndTabIndentation();
}

private void insertLeadingTokens(int type, int startIndex) {
    if (type != NEWLINE && type != EOF) { // (after a whitespace) The first token is visible, so We insert a NEWLINE and an INDENT token before it to raise an 'unexpected indent' error later by the parser
        this.insertToken(0, startIndex - 1, "<inserted leading NEWLINE>" + " ".repeat(startIndex), NEWLINE, 1, 0);
        this.insertToken(startIndex, startIndex - 1, "<" + TEXT_INSERTED_INDENT + ", " + this.getIndentationDescription(startIndex) + ">", Python3Parser.INDENT, 1, startIndex);
        this.indentLengths.push(startIndex);
    }
}

private void insertIndentDedentTokens(int curIndentLength) {
    int prevIndentLength = this.indentLengths.peek();
    if (curIndentLength > prevIndentLength) { // insert an INDENT token
        this.insertToken("<" + TEXT_INSERTED_INDENT + ", " + this.getIndentationDescription(curIndentLength) + ">", Python3Parser.INDENT);
        this.indentLengths.push(curIndentLength);
    } else {
        while (curIndentLength < prevIndentLength) {   // More than 1 DEDENT token may be inserted
            this.indentLengths.pop();
            prevIndentLength = this.indentLengths.peek();
            if (curIndentLength <= prevIndentLength) {
                this.insertToken("<inserted DEDENT, " + this.getIndentationDescription(prevIndentLength) + ">", Python3Parser.DEDENT);
            } else {
                this.insertToken("<inserted inconsistent DEDENT, " + "length=" + curIndentLength + ">", Python3Parser.DEDENT);
                this.errors.add(TEXT_LEXER + "line " + getLine() + ":" + getCharPositionInLine() + "\t IndentationError: unindent does not match any outer indentation level");
            }
        }
    }
}

private void insertTrailingTokens(int type) {
    if (type != NEWLINE && type != Python3Parser.DEDENT) {
        this.insertToken("<inserted trailing NEWLINE>", NEWLINE); // insert an extra trailing NEWLINE token that serves as the end of the statement
    }

    while (this.indentLengths.size() > 1) {
        this.insertToken("<inserted trailing DEDENT, " + this.getIndentationDescription(this.indentLengths.pop()) + ">", Python3Parser.DEDENT);
    }
    this.indentLengths = null; // there will be no more token read from the input stream
}

private String getIndentationDescription(int lengthOfIndent) {
    return "length=" + lengthOfIndent + ", level=" + this.indentLengths.size();
}

private void insertToken(String text, int type) {
    final int startIndex = _tokenStartCharIndex + getText().length(); //*** https://www.antlr.org/api/Java/org/antlr/v4/runtime/Lexer.html#_tokenStartCharIndex
    this.insertToken(startIndex, startIndex - 1, text, type, getLine(), getCharPositionInLine());
}

private void insertToken(int startIndex, int stopIndex, String text, int type, int line, int charPositionInLine) {
    CommonToken token = new CommonToken(_tokenFactorySourcePair, type, DEFAULT_TOKEN_CHANNEL, startIndex, stopIndex); //*** https://www.antlr.org/api/Java/org/antlr/v4/runtime/CommonToken.html
    token.setText(text);
    token.setLine(line);
    token.setCharPositionInLine(charPositionInLine);
    this.pendingTokens.addLast(token);
}

private int getIndentationLength(String textOfMatchedNEWLINE) {
    int count = 0;
    for (char ch : textOfMatchedNEWLINE.toCharArray()) {
        switch (ch) {
            case ' ': // A normal space char
                this.wasSpaceIndentation = true;
                count++;
                break;
            case '\t':
                this.wasTabIndentation = true;
                count += 8 - (count % 8);
                break;
        }
    }
    return count;
}

private void checkSpaceAndTabIndentation() {
    if (this.wasSpaceIndentation && this.wasTabIndentation) {
        this.warnings.add("Mixture of space and tab were used for indentation.");
    }
}

public List<String> getWarnings() {
    return this.warnings;
}

public List<String> getErrorMessages() {
    return this.errors;
}
}

//gramatyka

// symbol startowy:
program: (NEWLINE | simple_stmt |  function NEWLINE | compound_stmt NEWLINE )*;

stmt: simple_stmt | compound_stmt;
simple_stmt: assignment_stmt NEWLINE | func_call NEWLINE| print_stmt NEWLINE;

assignment_stmt: VAR '=' expr;
print_stmt: 'print' '(' expr ')';

compound_stmt
    : if_stmt
    | while_stmt
    | for_stmt;

if_stmt: 'if' expr_bool ':' body ('elif' expr_bool ':' body)* ('else' ':' body)?;
while_stmt: 'while' expr_bool ':' body;
for_stmt: 'for' VAR 'in' list ':' body;

list: '[' (variable ',' )* variable ']';
variable: VAR|INT|FLOAT;

function: func_def NEWLINE func_body;
func_def: 'def' func_name '(' func_args ')' ':';
func_name: VAR;
func_body: (body)* func_ret? ;
func_ret: 'return ' expr ;
func_args: (VAR ',')* VAR;
func_invoke_args: (variable ',')* variable;
func_call: func_name '(' func_invoke_args ')';

body: simple_stmt | NEWLINE stmt+;

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
 : ( SPACES | COMMENT | LINE_JOINING ) -> skip
 ;

NEWLINE
 : ( '\r'? '\n' | '\r' | '\f' ) SPACES?
 ;


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
