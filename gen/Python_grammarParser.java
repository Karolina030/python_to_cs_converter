// Generated from /Users/karolinamatuszczyk/projekt_kompilatory/Python_grammar.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Python_grammarParser extends Parser {
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
		FLOAT=38, SKIP_=39, NEWLINE=40, TAB=41;
	public static final int
		RULE_program = 0, RULE_simple_stmt = 1, RULE_simple_stmt_line = 2, RULE_assignment_stmt = 3, 
		RULE_print_stmt = 4, RULE_compound_stmt = 5, RULE_if_stmt = 6, RULE_elif_stmt = 7, 
		RULE_else_stmt = 8, RULE_while_stmt = 9, RULE_for_stmt = 10, RULE_list = 11, 
		RULE_variable = 12, RULE_function = 13, RULE_func_def = 14, RULE_func_name = 15, 
		RULE_func_body = 16, RULE_func_ret = 17, RULE_func_args = 18, RULE_func_invoke_args = 19, 
		RULE_func_call = 20, RULE_body = 21, RULE_expr = 22, RULE_expr_bool = 23, 
		RULE_or_test = 24, RULE_and_test = 25, RULE_not_test = 26, RULE_comparison = 27, 
		RULE_comp_op = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "simple_stmt", "simple_stmt_line", "assignment_stmt", "print_stmt", 
			"compound_stmt", "if_stmt", "elif_stmt", "else_stmt", "while_stmt", "for_stmt", 
			"list", "variable", "function", "func_def", "func_name", "func_body", 
			"func_ret", "func_args", "func_invoke_args", "func_call", "body", "expr", 
			"expr_bool", "or_test", "and_test", "not_test", "comparison", "comp_op"
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
			"SKIP_", "NEWLINE", "TAB"
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

	@Override
	public String getGrammarFileName() { return "Python_grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Python_grammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<Simple_stmt_lineContext> simple_stmt_line() {
			return getRuleContexts(Simple_stmt_lineContext.class);
		}
		public Simple_stmt_lineContext simple_stmt_line(int i) {
			return getRuleContext(Simple_stmt_lineContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public List<Compound_stmtContext> compound_stmt() {
			return getRuleContexts(Compound_stmtContext.class);
		}
		public Compound_stmtContext compound_stmt(int i) {
			return getRuleContext(Compound_stmtContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Python_grammarListener ) ((Python_grammarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Python_grammarListener ) ((Python_grammarListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Python_grammarVisitor ) return ((Python_grammarVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << DEF) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << VAR))) != 0)) {
				{
				setState(61);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case VAR:
					{
					setState(58);
					simple_stmt_line();
					}
					break;
				case DEF:
					{
					setState(59);
					function();
					}
					break;
				case IF:
				case WHILE:
				case FOR:
					{
					setState(60);
					compound_stmt();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_stmtContext extends ParserRuleContext {
		public Assignment_stmtContext assignment_stmt() {
			return getRuleContext(Assignment_stmtContext.class,0);
		}
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public Print_stmtContext print_stmt() {
			return getRuleContext(Print_stmtContext.class,0);
		}
		public Simple_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Python_grammarListener ) ((Python_grammarListener)listener).enterSimple_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Python_grammarListener ) ((Python_grammarListener)listener).exitSimple_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Python_grammarVisitor ) return ((Python_grammarVisitor<? extends T>)visitor).visitSimple_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_stmtContext simple_stmt() throws RecognitionException {
		Simple_stmtContext _localctx = new Simple_stmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_simple_stmt);
		try {
			setState(69);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				assignment_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				func_call();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(68);
				print_stmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_stmt_lineContext extends ParserRuleContext {
		public Simple_stmtContext simple_stmt() {
			return getRuleContext(Simple_stmtContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(Python_grammarParser.NEWLINE, 0); }
		public Simple_stmt_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_stmt_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Python_grammarListener ) ((Python_grammarListener)listener).enterSimple_stmt_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Python_grammarListener ) ((Python_grammarListener)listener).exitSimple_stmt_line(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Python_grammarVisitor ) return ((Python_grammarVisitor<? extends T>)visitor).visitSimple_stmt_line(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_stmt_lineContext simple_stmt_line() throws RecognitionException {
		Simple_stmt_lineContext _localctx = new Simple_stmt_lineContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_simple_stmt_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			simple_stmt();
			setState(72);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_stmtContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(Python_grammarParser.VAR, 0); }
		public TerminalNode ASSIGN() { return getToken(Python_grammarParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Assignment_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Python_grammarListener ) ((Python_grammarListener)listener).enterAssignment_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Python_grammarListener ) ((Python_grammarListener)listener).exitAssignment_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Python_grammarVisitor ) return ((Python_grammarVisitor<? extends T>)visitor).visitAssignment_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_stmtContext assignment_stmt() throws RecognitionException {
		Assignment_stmtContext _localctx = new Assignment_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignment_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(VAR);
			setState(75);
			match(ASSIGN);
			setState(76);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Print_stmtContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(Python_grammarParser.OPEN_PAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(Python_grammarParser.CLOSE_PAREN, 0); }
		public Print_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Python_grammarListener ) ((Python_grammarListener)listener).enterPrint_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Python_grammarListener ) ((Python_grammarListener)listener).exitPrint_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Python_grammarVisitor ) return ((Python_grammarVisitor<? extends T>)visitor).visitPrint_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_stmtContext print_stmt() throws RecognitionException {
		Print_stmtContext _localctx = new Print_stmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_print_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(T__0);
			setState(79);
			match(OPEN_PAREN);
			setState(80);
			expr(0);
			setState(81);
			match(CLOSE_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Compound_stmtContext extends ParserRuleContext {
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public While_stmtContext while_stmt() {
			return getRuleContext(While_stmtContext.class,0);
		}
		public For_stmtContext for_stmt() {
			return getRuleContext(For_stmtContext.class,0);
		}
		public Compound_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Python_grammarListener ) ((Python_grammarListener)listener).enterCompound_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Python_grammarListener ) ((Python_grammarListener)listener).exitCompound_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Python_grammarVisitor ) return ((Python_grammarVisitor<? extends T>)visitor).visitCompound_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compound_stmtContext compound_stmt() throws RecognitionException {
		Compound_stmtContext _localctx = new Compound_stmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_compound_stmt);
		try {
			setState(86);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				if_stmt();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				while_stmt();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(85);
				for_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_stmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(Python_grammarParser.IF, 0); }
		public Expr_boolContext expr_bool() {
			return getRuleContext(Expr_boolContext.class,0);
		}
		public TerminalNode COLON() { return getToken(Python_grammarParser.COLON, 0); }
		public TerminalNode NEWLINE() { return getToken(Python_grammarParser.NEWLINE, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public List<Elif_stmtContext> elif_stmt() {
			return getRuleContexts(Elif_stmtContext.class);
		}
		public Elif_stmtContext elif_stmt(int i) {
			return getRuleContext(Elif_stmtContext.class,i);
		}
		public Else_stmtContext else_stmt() {
			return getRuleContext(Else_stmtContext.class,0);
		}
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Python_grammarListener ) ((Python_grammarListener)listener).enterIf_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Python_grammarListener ) ((Python_grammarListener)listener).exitIf_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Python_grammarVisitor ) return ((Python_grammarVisitor<? extends T>)visitor).visitIf_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_if_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(IF);
			setState(89);
			expr_bool();
			setState(90);
			match(COLON);
			setState(91);
			match(NEWLINE);
			setState(92);
			body();
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(93);
				elif_stmt();
				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(99);
				else_stmt();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Elif_stmtContext extends ParserRuleContext {
		public TerminalNode ELIF() { return getToken(Python_grammarParser.ELIF, 0); }
		public Expr_boolContext expr_bool() {
			return getRuleContext(Expr_boolContext.class,0);
		}
		public TerminalNode COLON() { return getToken(Python_grammarParser.COLON, 0); }
		public TerminalNode NEWLINE() { return getToken(Python_grammarParser.NEWLINE, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public Elif_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elif_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Python_grammarListener ) ((Python_grammarListener)listener).enterElif_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Python_grammarListener ) ((Python_grammarListener)listener).exitElif_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Python_grammarVisitor ) return ((Python_grammarVisitor<? extends T>)visitor).visitElif_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Elif_stmtContext elif_stmt() throws RecognitionException {
		Elif_stmtContext _localctx = new Elif_stmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_elif_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(ELIF);
			setState(103);
			expr_bool();
			setState(104);
			match(COLON);
			setState(105);
			match(NEWLINE);
			setState(106);
			body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Else_stmtContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(Python_grammarParser.ELSE, 0); }
		public TerminalNode COLON() { return getToken(Python_grammarParser.COLON, 0); }
		public TerminalNode NEWLINE() { return getToken(Python_grammarParser.NEWLINE, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public Else_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Python_grammarListener ) ((Python_grammarListener)listener).enterElse_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Python_grammarListener ) ((Python_grammarListener)listener).exitElse_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Python_grammarVisitor ) return ((Python_grammarVisitor<? extends T>)visitor).visitElse_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_stmtContext else_stmt() throws RecognitionException {
		Else_stmtContext _localctx = new Else_stmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_else_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(ELSE);
			setState(109);
			match(COLON);
			setState(110);
			match(NEWLINE);
			setState(111);
			body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_stmtContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(Python_grammarParser.WHILE, 0); }
		public Expr_boolContext expr_bool() {
			return getRuleContext(Expr_boolContext.class,0);
		}
		public TerminalNode COLON() { return getToken(Python_grammarParser.COLON, 0); }
		public TerminalNode NEWLINE() { return getToken(Python_grammarParser.NEWLINE, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public While_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Python_grammarListener ) ((Python_grammarListener)listener).enterWhile_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Python_grammarListener ) ((Python_grammarListener)listener).exitWhile_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Python_grammarVisitor ) return ((Python_grammarVisitor<? extends T>)visitor).visitWhile_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_while_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(WHILE);
			setState(114);
			expr_bool();
			setState(115);
			match(COLON);
			setState(116);
			match(NEWLINE);
			setState(117);
			body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_stmtContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(Python_grammarParser.FOR, 0); }
		public TerminalNode VAR() { return getToken(Python_grammarParser.VAR, 0); }
		public TerminalNode IN() { return getToken(Python_grammarParser.IN, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public TerminalNode COLON() { return getToken(Python_grammarParser.COLON, 0); }
		public TerminalNode NEWLINE() { return getToken(Python_grammarParser.NEWLINE, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public For_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Python_grammarListener ) ((Python_grammarListener)listener).enterFor_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Python_grammarListener ) ((Python_grammarListener)listener).exitFor_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Python_grammarVisitor ) return ((Python_grammarVisitor<? extends T>)visitor).visitFor_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_stmtContext for_stmt() throws RecognitionException {
		For_stmtContext _localctx = new For_stmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_for_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(FOR);
			setState(120);
			match(VAR);
			setState(121);
			match(IN);
			setState(122);
			list();
			setState(123);
			match(COLON);
			setState(124);
			match(NEWLINE);
			setState(125);
			body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACK() { return getToken(Python_grammarParser.OPEN_BRACK, 0); }
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public TerminalNode CLOSE_BRACK() { return getToken(Python_grammarParser.CLOSE_BRACK, 0); }
		public List<TerminalNode> COMMA() { return getTokens(Python_grammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Python_grammarParser.COMMA, i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Python_grammarListener ) ((Python_grammarListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Python_grammarListener ) ((Python_grammarListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Python_grammarVisitor ) return ((Python_grammarVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(OPEN_BRACK);
			setState(133);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(128);
					variable();
					setState(129);
					match(COMMA);
					}
					} 
				}
				setState(135);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(136);
			variable();
			setState(137);
			match(CLOSE_BRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(Python_grammarParser.VAR, 0); }
		public TerminalNode INT() { return getToken(Python_grammarParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(Python_grammarParser.FLOAT, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Python_grammarListener ) ((Python_grammarListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Python_grammarListener ) ((Python_grammarListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Python_grammarVisitor ) return ((Python_grammarVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << INT) | (1L << FLOAT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public Func_defContext func_def() {
			return getRuleContext(Func_defContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(Python_grammarParser.NEWLINE, 0); }
		public Func_bodyContext func_body() {
			return getRuleContext(Func_bodyContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Python_grammarListener ) ((Python_grammarListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Python_grammarListener ) ((Python_grammarListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Python_grammarVisitor ) return ((Python_grammarVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			func_def();
			setState(142);
			match(NEWLINE);
			setState(143);
			func_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_defContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(Python_grammarParser.DEF, 0); }
		public Func_nameContext func_name() {
			return getRuleContext(Func_nameContext.class,0);
		}
		public TerminalNode OPEN_PAREN() { return getToken(Python_grammarParser.OPEN_PAREN, 0); }
		public Func_argsContext func_args() {
			return getRuleContext(Func_argsContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(Python_grammarParser.CLOSE_PAREN, 0); }
		public TerminalNode COLON() { return getToken(Python_grammarParser.COLON, 0); }
		public Func_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Python_grammarListener ) ((Python_grammarListener)listener).enterFunc_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Python_grammarListener ) ((Python_grammarListener)listener).exitFunc_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Python_grammarVisitor ) return ((Python_grammarVisitor<? extends T>)visitor).visitFunc_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_defContext func_def() throws RecognitionException {
		Func_defContext _localctx = new Func_defContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_func_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(DEF);
			setState(146);
			func_name();
			setState(147);
			match(OPEN_PAREN);
			setState(148);
			func_args();
			setState(149);
			match(CLOSE_PAREN);
			setState(150);
			match(COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_nameContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(Python_grammarParser.VAR, 0); }
		public Func_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Python_grammarListener ) ((Python_grammarListener)listener).enterFunc_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Python_grammarListener ) ((Python_grammarListener)listener).exitFunc_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Python_grammarVisitor ) return ((Python_grammarVisitor<? extends T>)visitor).visitFunc_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_nameContext func_name() throws RecognitionException {
		Func_nameContext _localctx = new Func_nameContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_func_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(VAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_bodyContext extends ParserRuleContext {
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode TAB() { return getToken(Python_grammarParser.TAB, 0); }
		public Func_retContext func_ret() {
			return getRuleContext(Func_retContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(Python_grammarParser.NEWLINE, 0); }
		public Func_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Python_grammarListener ) ((Python_grammarListener)listener).enterFunc_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Python_grammarListener ) ((Python_grammarListener)listener).exitFunc_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Python_grammarVisitor ) return ((Python_grammarVisitor<? extends T>)visitor).visitFunc_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_bodyContext func_body() throws RecognitionException {
		Func_bodyContext _localctx = new Func_bodyContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_func_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			body();
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TAB) {
				{
				setState(155);
				match(TAB);
				setState(156);
				func_ret();
				setState(157);
				match(NEWLINE);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_retContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Func_retContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_ret; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Python_grammarListener ) ((Python_grammarListener)listener).enterFunc_ret(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Python_grammarListener ) ((Python_grammarListener)listener).exitFunc_ret(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Python_grammarVisitor ) return ((Python_grammarVisitor<? extends T>)visitor).visitFunc_ret(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_retContext func_ret() throws RecognitionException {
		Func_retContext _localctx = new Func_retContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_func_ret);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(T__1);
			setState(162);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_argsContext extends ParserRuleContext {
		public List<TerminalNode> VAR() { return getTokens(Python_grammarParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(Python_grammarParser.VAR, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Python_grammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Python_grammarParser.COMMA, i);
		}
		public Func_argsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Python_grammarListener ) ((Python_grammarListener)listener).enterFunc_args(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Python_grammarListener ) ((Python_grammarListener)listener).exitFunc_args(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Python_grammarVisitor ) return ((Python_grammarVisitor<? extends T>)visitor).visitFunc_args(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_argsContext func_args() throws RecognitionException {
		Func_argsContext _localctx = new Func_argsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_func_args);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(164);
					match(VAR);
					setState(165);
					match(COMMA);
					}
					} 
				}
				setState(170);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(171);
			match(VAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_invoke_argsContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Python_grammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Python_grammarParser.COMMA, i);
		}
		public Func_invoke_argsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_invoke_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Python_grammarListener ) ((Python_grammarListener)listener).enterFunc_invoke_args(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Python_grammarListener ) ((Python_grammarListener)listener).exitFunc_invoke_args(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Python_grammarVisitor ) return ((Python_grammarVisitor<? extends T>)visitor).visitFunc_invoke_args(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_invoke_argsContext func_invoke_args() throws RecognitionException {
		Func_invoke_argsContext _localctx = new Func_invoke_argsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_func_invoke_args);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(173);
					variable();
					setState(174);
					match(COMMA);
					}
					} 
				}
				setState(180);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(181);
			variable();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_callContext extends ParserRuleContext {
		public Func_nameContext func_name() {
			return getRuleContext(Func_nameContext.class,0);
		}
		public TerminalNode OPEN_PAREN() { return getToken(Python_grammarParser.OPEN_PAREN, 0); }
		public Func_invoke_argsContext func_invoke_args() {
			return getRuleContext(Func_invoke_argsContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(Python_grammarParser.CLOSE_PAREN, 0); }
		public Func_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Python_grammarListener ) ((Python_grammarListener)listener).enterFunc_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Python_grammarListener ) ((Python_grammarListener)listener).exitFunc_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Python_grammarVisitor ) return ((Python_grammarVisitor<? extends T>)visitor).visitFunc_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_callContext func_call() throws RecognitionException {
		Func_callContext _localctx = new Func_callContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_func_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			func_name();
			setState(184);
			match(OPEN_PAREN);
			setState(185);
			func_invoke_args();
			setState(186);
			match(CLOSE_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BodyContext extends ParserRuleContext {
		public List<TerminalNode> TAB() { return getTokens(Python_grammarParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(Python_grammarParser.TAB, i);
		}
		public List<Simple_stmt_lineContext> simple_stmt_line() {
			return getRuleContexts(Simple_stmt_lineContext.class);
		}
		public Simple_stmt_lineContext simple_stmt_line(int i) {
			return getRuleContext(Simple_stmt_lineContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Python_grammarListener ) ((Python_grammarListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Python_grammarListener ) ((Python_grammarListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Python_grammarVisitor ) return ((Python_grammarVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_body);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(188);
					match(TAB);
					setState(189);
					simple_stmt_line();
					}
					} 
				}
				setState(194);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(Python_grammarParser.VAR, 0); }
		public TerminalNode INT() { return getToken(Python_grammarParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(Python_grammarParser.FLOAT, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(Python_grammarParser.OPEN_PAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(Python_grammarParser.CLOSE_PAREN, 0); }
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public List<TerminalNode> STAR() { return getTokens(Python_grammarParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(Python_grammarParser.STAR, i);
		}
		public List<TerminalNode> DIV() { return getTokens(Python_grammarParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(Python_grammarParser.DIV, i);
		}
		public List<TerminalNode> ADD() { return getTokens(Python_grammarParser.ADD); }
		public TerminalNode ADD(int i) {
			return getToken(Python_grammarParser.ADD, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(Python_grammarParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(Python_grammarParser.MINUS, i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Python_grammarListener ) ((Python_grammarListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Python_grammarListener ) ((Python_grammarListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Python_grammarVisitor ) return ((Python_grammarVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(196);
				match(VAR);
				}
				break;
			case 2:
				{
				setState(197);
				match(INT);
				}
				break;
			case 3:
				{
				setState(198);
				match(FLOAT);
				}
				break;
			case 4:
				{
				setState(199);
				match(OPEN_PAREN);
				setState(200);
				expr(0);
				setState(201);
				match(CLOSE_PAREN);
				}
				break;
			case 5:
				{
				setState(203);
				func_call();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(222);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(220);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(206);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(209); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(207);
								_la = _input.LA(1);
								if ( !(_la==STAR || _la==DIV) ) {
								_errHandler.recoverInline(this);
								}
								else {
									if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								setState(208);
								expr(0);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(211); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(213);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(216); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(214);
								_la = _input.LA(1);
								if ( !(_la==ADD || _la==MINUS) ) {
								_errHandler.recoverInline(this);
								}
								else {
									if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								setState(215);
								expr(0);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(218); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					}
					} 
				}
				setState(224);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Expr_boolContext extends ParserRuleContext {
		public Or_testContext or_test() {
			return getRuleContext(Or_testContext.class,0);
		}
		public TerminalNode TRUE() { return getToken(Python_grammarParser.TRUE, 0); }
		public Expr_boolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Python_grammarListener ) ((Python_grammarListener)listener).enterExpr_bool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Python_grammarListener ) ((Python_grammarListener)listener).exitExpr_bool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Python_grammarVisitor ) return ((Python_grammarVisitor<? extends T>)visitor).visitExpr_bool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_boolContext expr_bool() throws RecognitionException {
		Expr_boolContext _localctx = new Expr_boolContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_expr_bool);
		try {
			setState(227);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
			case VAR:
			case INT:
			case FLOAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				or_test();
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
				match(TRUE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Or_testContext extends ParserRuleContext {
		public List<And_testContext> and_test() {
			return getRuleContexts(And_testContext.class);
		}
		public And_testContext and_test(int i) {
			return getRuleContext(And_testContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(Python_grammarParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(Python_grammarParser.OR, i);
		}
		public Or_testContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or_test; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Python_grammarListener ) ((Python_grammarListener)listener).enterOr_test(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Python_grammarListener ) ((Python_grammarListener)listener).exitOr_test(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Python_grammarVisitor ) return ((Python_grammarVisitor<? extends T>)visitor).visitOr_test(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Or_testContext or_test() throws RecognitionException {
		Or_testContext _localctx = new Or_testContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_or_test);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			and_test();
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(230);
				match(OR);
				setState(231);
				and_test();
				}
				}
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class And_testContext extends ParserRuleContext {
		public List<Not_testContext> not_test() {
			return getRuleContexts(Not_testContext.class);
		}
		public Not_testContext not_test(int i) {
			return getRuleContext(Not_testContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(Python_grammarParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(Python_grammarParser.AND, i);
		}
		public And_testContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_test; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Python_grammarListener ) ((Python_grammarListener)listener).enterAnd_test(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Python_grammarListener ) ((Python_grammarListener)listener).exitAnd_test(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Python_grammarVisitor ) return ((Python_grammarVisitor<? extends T>)visitor).visitAnd_test(this);
			else return visitor.visitChildren(this);
		}
	}

	public final And_testContext and_test() throws RecognitionException {
		And_testContext _localctx = new And_testContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_and_test);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			not_test();
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(238);
				match(AND);
				setState(239);
				not_test();
				}
				}
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Not_testContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(Python_grammarParser.NOT, 0); }
		public Not_testContext not_test() {
			return getRuleContext(Not_testContext.class,0);
		}
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public Not_testContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not_test; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Python_grammarListener ) ((Python_grammarListener)listener).enterNot_test(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Python_grammarListener ) ((Python_grammarListener)listener).exitNot_test(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Python_grammarVisitor ) return ((Python_grammarVisitor<? extends T>)visitor).visitNot_test(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Not_testContext not_test() throws RecognitionException {
		Not_testContext _localctx = new Not_testContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_not_test);
		try {
			setState(248);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				match(NOT);
				setState(246);
				not_test();
				}
				break;
			case VAR:
			case INT:
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				comparison();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparisonContext extends ParserRuleContext {
		public List<TerminalNode> VAR() { return getTokens(Python_grammarParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(Python_grammarParser.VAR, i);
		}
		public List<TerminalNode> INT() { return getTokens(Python_grammarParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(Python_grammarParser.INT, i);
		}
		public List<TerminalNode> FLOAT() { return getTokens(Python_grammarParser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(Python_grammarParser.FLOAT, i);
		}
		public List<Comp_opContext> comp_op() {
			return getRuleContexts(Comp_opContext.class);
		}
		public Comp_opContext comp_op(int i) {
			return getRuleContext(Comp_opContext.class,i);
		}
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Python_grammarListener ) ((Python_grammarListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Python_grammarListener ) ((Python_grammarListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Python_grammarVisitor ) return ((Python_grammarVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << INT) | (1L << FLOAT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS_THAN) | (1L << GREATER_THAN) | (1L << EQUALS) | (1L << GT_EQ) | (1L << LT_EQ) | (1L << NOT_EQ))) != 0)) {
				{
				{
				setState(251);
				comp_op();
				setState(252);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << INT) | (1L << FLOAT))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Comp_opContext extends ParserRuleContext {
		public TerminalNode LESS_THAN() { return getToken(Python_grammarParser.LESS_THAN, 0); }
		public TerminalNode GREATER_THAN() { return getToken(Python_grammarParser.GREATER_THAN, 0); }
		public TerminalNode EQUALS() { return getToken(Python_grammarParser.EQUALS, 0); }
		public TerminalNode GT_EQ() { return getToken(Python_grammarParser.GT_EQ, 0); }
		public TerminalNode LT_EQ() { return getToken(Python_grammarParser.LT_EQ, 0); }
		public TerminalNode NOT_EQ() { return getToken(Python_grammarParser.NOT_EQ, 0); }
		public Comp_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Python_grammarListener ) ((Python_grammarListener)listener).enterComp_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Python_grammarListener ) ((Python_grammarListener)listener).exitComp_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Python_grammarVisitor ) return ((Python_grammarVisitor<? extends T>)visitor).visitComp_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comp_opContext comp_op() throws RecognitionException {
		Comp_opContext _localctx = new Comp_opContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_comp_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS_THAN) | (1L << GREATER_THAN) | (1L << EQUALS) | (1L << GT_EQ) | (1L << LT_EQ) | (1L << NOT_EQ))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 22:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u0108\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\7\2@\n"+
		"\2\f\2\16\2C\13\2\3\3\3\3\3\3\5\3H\n\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\5\7Y\n\7\3\b\3\b\3\b\3\b\3\b\3\b\7\ba\n\b"+
		"\f\b\16\bd\13\b\3\b\5\bg\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\7\r\u0086\n\r\f\r\16\r\u0089\13\r\3\r\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\5\22\u00a2\n\22\3\23\3\23\3\23\3\24\3\24\7\24\u00a9\n"+
		"\24\f\24\16\24\u00ac\13\24\3\24\3\24\3\25\3\25\3\25\7\25\u00b3\n\25\f"+
		"\25\16\25\u00b6\13\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\7\27"+
		"\u00c1\n\27\f\27\16\27\u00c4\13\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\5\30\u00cf\n\30\3\30\3\30\3\30\6\30\u00d4\n\30\r\30\16\30\u00d5"+
		"\3\30\3\30\3\30\6\30\u00db\n\30\r\30\16\30\u00dc\7\30\u00df\n\30\f\30"+
		"\16\30\u00e2\13\30\3\31\3\31\5\31\u00e6\n\31\3\32\3\32\3\32\7\32\u00eb"+
		"\n\32\f\32\16\32\u00ee\13\32\3\33\3\33\3\33\7\33\u00f3\n\33\f\33\16\33"+
		"\u00f6\13\33\3\34\3\34\3\34\5\34\u00fb\n\34\3\35\3\35\3\35\3\35\7\35\u0101"+
		"\n\35\f\35\16\35\u0104\13\35\3\36\3\36\3\36\2\3.\37\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:\2\6\3\2&(\3\2\36\37\3\2\34"+
		"\35\3\2 %\2\u0105\2A\3\2\2\2\4G\3\2\2\2\6I\3\2\2\2\bL\3\2\2\2\nP\3\2\2"+
		"\2\fX\3\2\2\2\16Z\3\2\2\2\20h\3\2\2\2\22n\3\2\2\2\24s\3\2\2\2\26y\3\2"+
		"\2\2\30\u0081\3\2\2\2\32\u008d\3\2\2\2\34\u008f\3\2\2\2\36\u0093\3\2\2"+
		"\2 \u009a\3\2\2\2\"\u009c\3\2\2\2$\u00a3\3\2\2\2&\u00aa\3\2\2\2(\u00b4"+
		"\3\2\2\2*\u00b9\3\2\2\2,\u00c2\3\2\2\2.\u00ce\3\2\2\2\60\u00e5\3\2\2\2"+
		"\62\u00e7\3\2\2\2\64\u00ef\3\2\2\2\66\u00fa\3\2\2\28\u00fc\3\2\2\2:\u0105"+
		"\3\2\2\2<@\5\6\4\2=@\5\34\17\2>@\5\f\7\2?<\3\2\2\2?=\3\2\2\2?>\3\2\2\2"+
		"@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2B\3\3\2\2\2CA\3\2\2\2DH\5\b\5\2EH\5*\26"+
		"\2FH\5\n\6\2GD\3\2\2\2GE\3\2\2\2GF\3\2\2\2H\5\3\2\2\2IJ\5\4\3\2JK\7*\2"+
		"\2K\7\3\2\2\2LM\7&\2\2MN\7\27\2\2NO\5.\30\2O\t\3\2\2\2PQ\7\3\2\2QR\7\22"+
		"\2\2RS\5.\30\2ST\7\23\2\2T\13\3\2\2\2UY\5\16\b\2VY\5\24\13\2WY\5\26\f"+
		"\2XU\3\2\2\2XV\3\2\2\2XW\3\2\2\2Y\r\3\2\2\2Z[\7\7\2\2[\\\5\60\31\2\\]"+
		"\7\25\2\2]^\7*\2\2^b\5,\27\2_a\5\20\t\2`_\3\2\2\2ad\3\2\2\2b`\3\2\2\2"+
		"bc\3\2\2\2cf\3\2\2\2db\3\2\2\2eg\5\22\n\2fe\3\2\2\2fg\3\2\2\2g\17\3\2"+
		"\2\2hi\7\b\2\2ij\5\60\31\2jk\7\25\2\2kl\7*\2\2lm\5,\27\2m\21\3\2\2\2n"+
		"o\7\t\2\2op\7\25\2\2pq\7*\2\2qr\5,\27\2r\23\3\2\2\2st\7\n\2\2tu\5\60\31"+
		"\2uv\7\25\2\2vw\7*\2\2wx\5,\27\2x\25\3\2\2\2yz\7\13\2\2z{\7&\2\2{|\7\f"+
		"\2\2|}\5\30\r\2}~\7\25\2\2~\177\7*\2\2\177\u0080\5,\27\2\u0080\27\3\2"+
		"\2\2\u0081\u0087\7\30\2\2\u0082\u0083\5\32\16\2\u0083\u0084\7\24\2\2\u0084"+
		"\u0086\3\2\2\2\u0085\u0082\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2"+
		"\2\2\u0087\u0088\3\2\2\2\u0088\u008a\3\2\2\2\u0089\u0087\3\2\2\2\u008a"+
		"\u008b\5\32\16\2\u008b\u008c\7\31\2\2\u008c\31\3\2\2\2\u008d\u008e\t\2"+
		"\2\2\u008e\33\3\2\2\2\u008f\u0090\5\36\20\2\u0090\u0091\7*\2\2\u0091\u0092"+
		"\5\"\22\2\u0092\35\3\2\2\2\u0093\u0094\7\5\2\2\u0094\u0095\5 \21\2\u0095"+
		"\u0096\7\22\2\2\u0096\u0097\5&\24\2\u0097\u0098\7\23\2\2\u0098\u0099\7"+
		"\25\2\2\u0099\37\3\2\2\2\u009a\u009b\7&\2\2\u009b!\3\2\2\2\u009c\u00a1"+
		"\5,\27\2\u009d\u009e\7+\2\2\u009e\u009f\5$\23\2\u009f\u00a0\7*\2\2\u00a0"+
		"\u00a2\3\2\2\2\u00a1\u009d\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2#\3\2\2\2"+
		"\u00a3\u00a4\7\4\2\2\u00a4\u00a5\5.\30\2\u00a5%\3\2\2\2\u00a6\u00a7\7"+
		"&\2\2\u00a7\u00a9\7\24\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa"+
		"\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ad\3\2\2\2\u00ac\u00aa\3\2"+
		"\2\2\u00ad\u00ae\7&\2\2\u00ae\'\3\2\2\2\u00af\u00b0\5\32\16\2\u00b0\u00b1"+
		"\7\24\2\2\u00b1\u00b3\3\2\2\2\u00b2\u00af\3\2\2\2\u00b3\u00b6\3\2\2\2"+
		"\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00b4"+
		"\3\2\2\2\u00b7\u00b8\5\32\16\2\u00b8)\3\2\2\2\u00b9\u00ba\5 \21\2\u00ba"+
		"\u00bb\7\22\2\2\u00bb\u00bc\5(\25\2\u00bc\u00bd\7\23\2\2\u00bd+\3\2\2"+
		"\2\u00be\u00bf\7+\2\2\u00bf\u00c1\5\6\4\2\u00c0\u00be\3\2\2\2\u00c1\u00c4"+
		"\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3-\3\2\2\2\u00c4"+
		"\u00c2\3\2\2\2\u00c5\u00c6\b\30\1\2\u00c6\u00cf\7&\2\2\u00c7\u00cf\7\'"+
		"\2\2\u00c8\u00cf\7(\2\2\u00c9\u00ca\7\22\2\2\u00ca\u00cb\5.\30\2\u00cb"+
		"\u00cc\7\23\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cf\5*\26\2\u00ce\u00c5\3"+
		"\2\2\2\u00ce\u00c7\3\2\2\2\u00ce\u00c8\3\2\2\2\u00ce\u00c9\3\2\2\2\u00ce"+
		"\u00cd\3\2\2\2\u00cf\u00e0\3\2\2\2\u00d0\u00d3\f\t\2\2\u00d1\u00d2\t\3"+
		"\2\2\u00d2\u00d4\5.\30\2\u00d3\u00d1\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5"+
		"\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00df\3\2\2\2\u00d7\u00da\f\b"+
		"\2\2\u00d8\u00d9\t\4\2\2\u00d9\u00db\5.\30\2\u00da\u00d8\3\2\2\2\u00db"+
		"\u00dc\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00df\3\2"+
		"\2\2\u00de\u00d0\3\2\2\2\u00de\u00d7\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0"+
		"\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1/\3\2\2\2\u00e2\u00e0\3\2\2\2"+
		"\u00e3\u00e6\5\62\32\2\u00e4\u00e6\7\20\2\2\u00e5\u00e3\3\2\2\2\u00e5"+
		"\u00e4\3\2\2\2\u00e6\61\3\2\2\2\u00e7\u00ec\5\64\33\2\u00e8\u00e9\7\r"+
		"\2\2\u00e9\u00eb\5\64\33\2\u00ea\u00e8\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec"+
		"\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\63\3\2\2\2\u00ee\u00ec\3\2\2"+
		"\2\u00ef\u00f4\5\66\34\2\u00f0\u00f1\7\16\2\2\u00f1\u00f3\5\66\34\2\u00f2"+
		"\u00f0\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2"+
		"\2\2\u00f5\65\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00f8\7\17\2\2\u00f8\u00fb"+
		"\5\66\34\2\u00f9\u00fb\58\35\2\u00fa\u00f7\3\2\2\2\u00fa\u00f9\3\2\2\2"+
		"\u00fb\67\3\2\2\2\u00fc\u0102\t\2\2\2\u00fd\u00fe\5:\36\2\u00fe\u00ff"+
		"\t\2\2\2\u00ff\u0101\3\2\2\2\u0100\u00fd\3\2\2\2\u0101\u0104\3\2\2\2\u0102"+
		"\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u01039\3\2\2\2\u0104\u0102\3\2\2\2"+
		"\u0105\u0106\t\5\2\2\u0106;\3\2\2\2\27?AGXbf\u0087\u00a1\u00aa\u00b4\u00c2"+
		"\u00ce\u00d5\u00dc\u00de\u00e0\u00e5\u00ec\u00f4\u00fa\u0102";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}