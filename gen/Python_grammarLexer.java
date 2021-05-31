// Generated from E:/Programming/python_to_cs_converter\Python_grammar.g4 by ANTLR 4.9.1

import org.antlr.v4.runtime.misc.Interval;
import java.util.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Python_grammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, DEF=3, RETURN=4, IF=5, ELIF=6, ELSE=7, WHILE=8, FOR=9, 
		IN=10, OR=11, AND=12, NOT=13, TRUE=14, FALSE=15, OPEN_PAREN=16, CLOSE_PAREN=17, 
		COMMA=18, COLON=19, SEMI_COLON=20, ASSIGN=21, OPEN_BRACK=22, CLOSE_BRACK=23, 
		OPEN_BRACE=24, CLOSE_BRACE=25, ADD=26, MINUS=27, STAR=28, DIV=29, LESS_THAN=30, 
		GREATER_THAN=31, EQUALS=32, GT_EQ=33, LT_EQ=34, NOT_EQ=35, VAR=36, INT=37, 
		FLOAT=38, SKIP_=39, NEWLINE=40;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "DEF", "RETURN", "IF", "ELIF", "ELSE", "WHILE", "FOR", 
			"IN", "OR", "AND", "NOT", "TRUE", "FALSE", "OPEN_PAREN", "CLOSE_PAREN", 
			"COMMA", "COLON", "SEMI_COLON", "ASSIGN", "OPEN_BRACK", "CLOSE_BRACK", 
			"OPEN_BRACE", "CLOSE_BRACE", "ADD", "MINUS", "STAR", "DIV", "LESS_THAN", 
			"GREATER_THAN", "EQUALS", "GT_EQ", "LT_EQ", "NOT_EQ", "VAR", "INT", "FLOAT", 
			"SKIP_", "NEWLINE", "NON_ZERO_DIGIT", "DIGIT", "SPACES", "COMMENT", "LINE_JOINING"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'print'", "'return '", "'def'", "'return'", "'if'", "'elif'", 
			"'else'", "'while'", "'for'", "'in'", "'or'", "'and'", "'not'", "'True'", 
			"'False'", "'('", "')'", "','", "':'", "';'", "'='", "'['", "']'", "'{'", 
			"'}'", "'+'", "'-'", "'*'", "'/'", "'<'", "'>'", "'=='", "'>='", "'<='", 
			"'!='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "DEF", "RETURN", "IF", "ELIF", "ELSE", "WHILE", "FOR", 
			"IN", "OR", "AND", "NOT", "TRUE", "FALSE", "OPEN_PAREN", "CLOSE_PAREN", 
			"COMMA", "COLON", "SEMI_COLON", "ASSIGN", "OPEN_BRACK", "CLOSE_BRACK", 
			"OPEN_BRACE", "CLOSE_BRACE", "ADD", "MINUS", "STAR", "DIV", "LESS_THAN", 
			"GREATER_THAN", "EQUALS", "GT_EQ", "LT_EQ", "NOT_EQ", "VAR", "INT", "FLOAT", 
			"SKIP_", "NEWLINE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


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


	public Python_grammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Python_grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2*\u011e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32"+
		"\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3"+
		"!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\7%\u00d5\n%\f%\16%\u00d8\13%\3&"+
		"\3&\7&\u00dc\n&\f&\16&\u00df\13&\3&\6&\u00e2\n&\r&\16&\u00e3\5&\u00e6"+
		"\n&\3\'\6\'\u00e9\n\'\r\'\16\'\u00ea\3\'\3\'\6\'\u00ef\n\'\r\'\16\'\u00f0"+
		"\3(\3(\3(\5(\u00f6\n(\3(\3(\3)\5)\u00fb\n)\3)\3)\5)\u00ff\n)\3)\5)\u0102"+
		"\n)\3*\3*\3+\3+\3,\6,\u0109\n,\r,\16,\u010a\3-\3-\7-\u010f\n-\f-\16-\u0112"+
		"\13-\3.\3.\5.\u0116\n.\3.\5.\u0119\n.\3.\3.\5.\u011d\n.\2\2/\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$G%I&K\'M(O)Q*S\2U\2W\2Y\2[\2\3\2\b\4\2C\\c|\6\2\62;C\\aac|\3\2\62;"+
		"\3\2\63;\4\2\13\13\"\"\4\2\f\f\16\17\2\u0128\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2"+
		"\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2"+
		"M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\3]\3\2\2\2\5c\3\2\2\2\7k\3\2\2\2\to\3"+
		"\2\2\2\13v\3\2\2\2\ry\3\2\2\2\17~\3\2\2\2\21\u0083\3\2\2\2\23\u0089\3"+
		"\2\2\2\25\u008d\3\2\2\2\27\u0090\3\2\2\2\31\u0093\3\2\2\2\33\u0097\3\2"+
		"\2\2\35\u009b\3\2\2\2\37\u00a0\3\2\2\2!\u00a6\3\2\2\2#\u00a8\3\2\2\2%"+
		"\u00aa\3\2\2\2\'\u00ac\3\2\2\2)\u00ae\3\2\2\2+\u00b0\3\2\2\2-\u00b2\3"+
		"\2\2\2/\u00b4\3\2\2\2\61\u00b6\3\2\2\2\63\u00b8\3\2\2\2\65\u00ba\3\2\2"+
		"\2\67\u00bc\3\2\2\29\u00be\3\2\2\2;\u00c0\3\2\2\2=\u00c2\3\2\2\2?\u00c4"+
		"\3\2\2\2A\u00c6\3\2\2\2C\u00c9\3\2\2\2E\u00cc\3\2\2\2G\u00cf\3\2\2\2I"+
		"\u00d2\3\2\2\2K\u00e5\3\2\2\2M\u00e8\3\2\2\2O\u00f5\3\2\2\2Q\u00fe\3\2"+
		"\2\2S\u0103\3\2\2\2U\u0105\3\2\2\2W\u0108\3\2\2\2Y\u010c\3\2\2\2[\u0113"+
		"\3\2\2\2]^\7r\2\2^_\7t\2\2_`\7k\2\2`a\7p\2\2ab\7v\2\2b\4\3\2\2\2cd\7t"+
		"\2\2de\7g\2\2ef\7v\2\2fg\7w\2\2gh\7t\2\2hi\7p\2\2ij\7\"\2\2j\6\3\2\2\2"+
		"kl\7f\2\2lm\7g\2\2mn\7h\2\2n\b\3\2\2\2op\7t\2\2pq\7g\2\2qr\7v\2\2rs\7"+
		"w\2\2st\7t\2\2tu\7p\2\2u\n\3\2\2\2vw\7k\2\2wx\7h\2\2x\f\3\2\2\2yz\7g\2"+
		"\2z{\7n\2\2{|\7k\2\2|}\7h\2\2}\16\3\2\2\2~\177\7g\2\2\177\u0080\7n\2\2"+
		"\u0080\u0081\7u\2\2\u0081\u0082\7g\2\2\u0082\20\3\2\2\2\u0083\u0084\7"+
		"y\2\2\u0084\u0085\7j\2\2\u0085\u0086\7k\2\2\u0086\u0087\7n\2\2\u0087\u0088"+
		"\7g\2\2\u0088\22\3\2\2\2\u0089\u008a\7h\2\2\u008a\u008b\7q\2\2\u008b\u008c"+
		"\7t\2\2\u008c\24\3\2\2\2\u008d\u008e\7k\2\2\u008e\u008f\7p\2\2\u008f\26"+
		"\3\2\2\2\u0090\u0091\7q\2\2\u0091\u0092\7t\2\2\u0092\30\3\2\2\2\u0093"+
		"\u0094\7c\2\2\u0094\u0095\7p\2\2\u0095\u0096\7f\2\2\u0096\32\3\2\2\2\u0097"+
		"\u0098\7p\2\2\u0098\u0099\7q\2\2\u0099\u009a\7v\2\2\u009a\34\3\2\2\2\u009b"+
		"\u009c\7V\2\2\u009c\u009d\7t\2\2\u009d\u009e\7w\2\2\u009e\u009f\7g\2\2"+
		"\u009f\36\3\2\2\2\u00a0\u00a1\7H\2\2\u00a1\u00a2\7c\2\2\u00a2\u00a3\7"+
		"n\2\2\u00a3\u00a4\7u\2\2\u00a4\u00a5\7g\2\2\u00a5 \3\2\2\2\u00a6\u00a7"+
		"\7*\2\2\u00a7\"\3\2\2\2\u00a8\u00a9\7+\2\2\u00a9$\3\2\2\2\u00aa\u00ab"+
		"\7.\2\2\u00ab&\3\2\2\2\u00ac\u00ad\7<\2\2\u00ad(\3\2\2\2\u00ae\u00af\7"+
		"=\2\2\u00af*\3\2\2\2\u00b0\u00b1\7?\2\2\u00b1,\3\2\2\2\u00b2\u00b3\7]"+
		"\2\2\u00b3.\3\2\2\2\u00b4\u00b5\7_\2\2\u00b5\60\3\2\2\2\u00b6\u00b7\7"+
		"}\2\2\u00b7\62\3\2\2\2\u00b8\u00b9\7\177\2\2\u00b9\64\3\2\2\2\u00ba\u00bb"+
		"\7-\2\2\u00bb\66\3\2\2\2\u00bc\u00bd\7/\2\2\u00bd8\3\2\2\2\u00be\u00bf"+
		"\7,\2\2\u00bf:\3\2\2\2\u00c0\u00c1\7\61\2\2\u00c1<\3\2\2\2\u00c2\u00c3"+
		"\7>\2\2\u00c3>\3\2\2\2\u00c4\u00c5\7@\2\2\u00c5@\3\2\2\2\u00c6\u00c7\7"+
		"?\2\2\u00c7\u00c8\7?\2\2\u00c8B\3\2\2\2\u00c9\u00ca\7@\2\2\u00ca\u00cb"+
		"\7?\2\2\u00cbD\3\2\2\2\u00cc\u00cd\7>\2\2\u00cd\u00ce\7?\2\2\u00ceF\3"+
		"\2\2\2\u00cf\u00d0\7#\2\2\u00d0\u00d1\7?\2\2\u00d1H\3\2\2\2\u00d2\u00d6"+
		"\t\2\2\2\u00d3\u00d5\t\3\2\2\u00d4\u00d3\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6"+
		"\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7J\3\2\2\2\u00d8\u00d6\3\2\2\2"+
		"\u00d9\u00dd\5S*\2\u00da\u00dc\5U+\2\u00db\u00da\3\2\2\2\u00dc\u00df\3"+
		"\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00e6\3\2\2\2\u00df"+
		"\u00dd\3\2\2\2\u00e0\u00e2\7\62\2\2\u00e1\u00e0\3\2\2\2\u00e2\u00e3\3"+
		"\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e6\3\2\2\2\u00e5"+
		"\u00d9\3\2\2\2\u00e5\u00e1\3\2\2\2\u00e6L\3\2\2\2\u00e7\u00e9\5K&\2\u00e8"+
		"\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2"+
		"\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ee\7\60\2\2\u00ed\u00ef\t\4\2\2\u00ee"+
		"\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2"+
		"\2\2\u00f1N\3\2\2\2\u00f2\u00f6\5W,\2\u00f3\u00f6\5Y-\2\u00f4\u00f6\5"+
		"[.\2\u00f5\u00f2\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f4\3\2\2\2\u00f6"+
		"\u00f7\3\2\2\2\u00f7\u00f8\b(\2\2\u00f8P\3\2\2\2\u00f9\u00fb\7\17\2\2"+
		"\u00fa\u00f9\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00ff"+
		"\7\f\2\2\u00fd\u00ff\4\16\17\2\u00fe\u00fa\3\2\2\2\u00fe\u00fd\3\2\2\2"+
		"\u00ff\u0101\3\2\2\2\u0100\u0102\5W,\2\u0101\u0100\3\2\2\2\u0101\u0102"+
		"\3\2\2\2\u0102R\3\2\2\2\u0103\u0104\t\5\2\2\u0104T\3\2\2\2\u0105\u0106"+
		"\t\4\2\2\u0106V\3\2\2\2\u0107\u0109\t\6\2\2\u0108\u0107\3\2\2\2\u0109"+
		"\u010a\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010bX\3\2\2\2"+
		"\u010c\u0110\7%\2\2\u010d\u010f\n\7\2\2\u010e\u010d\3\2\2\2\u010f\u0112"+
		"\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111Z\3\2\2\2\u0112"+
		"\u0110\3\2\2\2\u0113\u0115\7^\2\2\u0114\u0116\5W,\2\u0115\u0114\3\2\2"+
		"\2\u0115\u0116\3\2\2\2\u0116\u011c\3\2\2\2\u0117\u0119\7\17\2\2\u0118"+
		"\u0117\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011d\7\f"+
		"\2\2\u011b\u011d\4\16\17\2\u011c\u0118\3\2\2\2\u011c\u011b\3\2\2\2\u011d"+
		"\\\3\2\2\2\22\2\u00d6\u00dd\u00e3\u00e5\u00ea\u00f0\u00f5\u00fa\u00fe"+
		"\u0101\u010a\u0110\u0115\u0118\u011c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}