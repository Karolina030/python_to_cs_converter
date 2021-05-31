// Generated from E:/Programming/python_to_cs_converter\Python_grammar.g4 by ANTLR 4.9.1
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
		FLOAT=38, SKIP_=39, NEWLINE=40, INDENT=41, DEDENT=42;
	public static final int
		RULE_program = 0, RULE_stmt = 1, RULE_simple_stmt = 2, RULE_assignment_stmt = 3, 
		RULE_print_stmt = 4, RULE_compound_stmt = 5, RULE_if_stmt = 6, RULE_while_stmt = 7, 
		RULE_for_stmt = 8, RULE_list = 9, RULE_variable = 10, RULE_function = 11, 
		RULE_func_def = 12, RULE_func_name = 13, RULE_func_body = 14, RULE_func_ret = 15, 
		RULE_func_args = 16, RULE_func_invoke_args = 17, RULE_func_call = 18, 
		RULE_body = 19, RULE_expr = 20, RULE_expr_bool = 21, RULE_or_test = 22, 
		RULE_and_test = 23, RULE_not_test = 24, RULE_comparison = 25, RULE_comp_op = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "stmt", "simple_stmt", "assignment_stmt", "print_stmt", "compound_stmt", 
			"if_stmt", "while_stmt", "for_stmt", "list", "variable", "function", 
			"func_def", "func_name", "func_body", "func_ret", "func_args", "func_invoke_args", 
			"func_call", "body", "expr", "expr_bool", "or_test", "and_test", "not_test", 
			"comparison", "comp_op"
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
			"SKIP_", "NEWLINE", "INDENT", "DEDENT"
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
		public List<TerminalNode> NEWLINE() { return getTokens(Python_grammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(Python_grammarParser.NEWLINE, i);
		}
		public List<Simple_stmtContext> simple_stmt() {
			return getRuleContexts(Simple_stmtContext.class);
		}
		public Simple_stmtContext simple_stmt(int i) {
			return getRuleContext(Simple_stmtContext.class,i);
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
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << DEF) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << VAR) | (1L << NEWLINE))) != 0)) {
				{
				setState(62);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NEWLINE:
					{
					setState(54);
					match(NEWLINE);
					}
					break;
				case T__0:
				case VAR:
					{
					setState(55);
					simple_stmt();
					}
					break;
				case DEF:
					{
					setState(56);
					function();
					setState(57);
					match(NEWLINE);
					}
					break;
				case IF:
				case WHILE:
				case FOR:
					{
					setState(59);
					compound_stmt();
					setState(60);
					match(NEWLINE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(66);
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

	public static class StmtContext extends ParserRuleContext {
		public Simple_stmtContext simple_stmt() {
			return getRuleContext(Simple_stmtContext.class,0);
		}
		public Compound_stmtContext compound_stmt() {
			return getRuleContext(Compound_stmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Python_grammarListener ) ((Python_grammarListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Python_grammarListener ) ((Python_grammarListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Python_grammarVisitor ) return ((Python_grammarVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt);
		try {
			setState(69);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				simple_stmt();
				}
				break;
			case IF:
			case WHILE:
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				compound_stmt();
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

	public static class Simple_stmtContext extends ParserRuleContext {
		public Assignment_stmtContext assignment_stmt() {
			return getRuleContext(Assignment_stmtContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(Python_grammarParser.NEWLINE, 0); }
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
		enterRule(_localctx, 4, RULE_simple_stmt);
		try {
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				assignment_stmt();
				setState(72);
				match(NEWLINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				func_call();
				setState(75);
				match(NEWLINE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(77);
				print_stmt();
				setState(78);
				match(NEWLINE);
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
			setState(82);
			match(VAR);
			setState(83);
			match(ASSIGN);
			setState(84);
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
			setState(86);
			match(T__0);
			setState(87);
			match(OPEN_PAREN);
			setState(88);
			expr(0);
			setState(89);
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
			setState(94);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				if_stmt();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				while_stmt();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(93);
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
		public List<Expr_boolContext> expr_bool() {
			return getRuleContexts(Expr_boolContext.class);
		}
		public Expr_boolContext expr_bool(int i) {
			return getRuleContext(Expr_boolContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(Python_grammarParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(Python_grammarParser.COLON, i);
		}
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public List<TerminalNode> ELIF() { return getTokens(Python_grammarParser.ELIF); }
		public TerminalNode ELIF(int i) {
			return getToken(Python_grammarParser.ELIF, i);
		}
		public TerminalNode ELSE() { return getToken(Python_grammarParser.ELSE, 0); }
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(IF);
			setState(97);
			expr_bool();
			setState(98);
			match(COLON);
			setState(99);
			body();
			setState(107);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(100);
					match(ELIF);
					setState(101);
					expr_bool();
					setState(102);
					match(COLON);
					setState(103);
					body();
					}
					} 
				}
				setState(109);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(110);
				match(ELSE);
				setState(111);
				match(COLON);
				setState(112);
				body();
				}
				break;
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

	public static class While_stmtContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(Python_grammarParser.WHILE, 0); }
		public Expr_boolContext expr_bool() {
			return getRuleContext(Expr_boolContext.class,0);
		}
		public TerminalNode COLON() { return getToken(Python_grammarParser.COLON, 0); }
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
		enterRule(_localctx, 14, RULE_while_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(WHILE);
			setState(116);
			expr_bool();
			setState(117);
			match(COLON);
			setState(118);
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
		enterRule(_localctx, 16, RULE_for_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(FOR);
			setState(121);
			match(VAR);
			setState(122);
			match(IN);
			setState(123);
			list();
			setState(124);
			match(COLON);
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
		enterRule(_localctx, 18, RULE_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(OPEN_BRACK);
			setState(133);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
		enterRule(_localctx, 20, RULE_variable);
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
		enterRule(_localctx, 22, RULE_function);
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
		enterRule(_localctx, 24, RULE_func_def);
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
		enterRule(_localctx, 26, RULE_func_name);
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
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public Func_retContext func_ret() {
			return getRuleContext(Func_retContext.class,0);
		}
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
		enterRule(_localctx, 28, RULE_func_body);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(154);
					body();
					}
					} 
				}
				setState(159);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(160);
				func_ret();
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
		enterRule(_localctx, 30, RULE_func_ret);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(T__1);
			setState(164);
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
		enterRule(_localctx, 32, RULE_func_args);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(166);
					match(VAR);
					setState(167);
					match(COMMA);
					}
					} 
				}
				setState(172);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(173);
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
		enterRule(_localctx, 34, RULE_func_invoke_args);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(175);
					variable();
					setState(176);
					match(COMMA);
					}
					} 
				}
				setState(182);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(183);
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
		enterRule(_localctx, 36, RULE_func_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			func_name();
			setState(186);
			match(OPEN_PAREN);
			setState(187);
			func_invoke_args();
			setState(188);
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
		public Simple_stmtContext simple_stmt() {
			return getRuleContext(Simple_stmtContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(Python_grammarParser.NEWLINE, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
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
		enterRule(_localctx, 38, RULE_body);
		try {
			int _alt;
			setState(197);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				simple_stmt();
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				match(NEWLINE);
				setState(193); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(192);
						stmt();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(195); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(200);
				match(VAR);
				}
				break;
			case 2:
				{
				setState(201);
				match(INT);
				}
				break;
			case 3:
				{
				setState(202);
				match(FLOAT);
				}
				break;
			case 4:
				{
				setState(203);
				match(OPEN_PAREN);
				setState(204);
				expr(0);
				setState(205);
				match(CLOSE_PAREN);
				}
				break;
			case 5:
				{
				setState(207);
				func_call();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(226);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(224);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(210);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(213); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(211);
								_la = _input.LA(1);
								if ( !(_la==STAR || _la==DIV) ) {
								_errHandler.recoverInline(this);
								}
								else {
									if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								setState(212);
								expr(0);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(215); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(217);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(220); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(218);
								_la = _input.LA(1);
								if ( !(_la==ADD || _la==MINUS) ) {
								_errHandler.recoverInline(this);
								}
								else {
									if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								setState(219);
								expr(0);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(222); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					}
					} 
				}
				setState(228);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
		enterRule(_localctx, 42, RULE_expr_bool);
		try {
			setState(231);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
			case VAR:
			case INT:
			case FLOAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				or_test();
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
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
		enterRule(_localctx, 44, RULE_or_test);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			and_test();
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(234);
				match(OR);
				setState(235);
				and_test();
				}
				}
				setState(240);
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
		enterRule(_localctx, 46, RULE_and_test);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			not_test();
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(242);
				match(AND);
				setState(243);
				not_test();
				}
				}
				setState(248);
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
		enterRule(_localctx, 48, RULE_not_test);
		try {
			setState(252);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
				match(NOT);
				setState(250);
				not_test();
				}
				break;
			case VAR:
			case INT:
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
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
		enterRule(_localctx, 50, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << INT) | (1L << FLOAT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS_THAN) | (1L << GREATER_THAN) | (1L << EQUALS) | (1L << GT_EQ) | (1L << LT_EQ) | (1L << NOT_EQ))) != 0)) {
				{
				{
				setState(255);
				comp_op();
				setState(256);
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
				setState(262);
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
		enterRule(_localctx, 52, RULE_comp_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
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
		case 20:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u010c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2A\n"+
		"\2\f\2\16\2D\13\2\3\3\3\3\5\3H\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\5\4S\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\5\7a\n\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\bl\n\b\f\b\16\bo\13\b\3\b\3\b\3\b\5"+
		"\bt\n\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\7\13\u0086\n\13\f\13\16\13\u0089\13\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\7\20"+
		"\u009e\n\20\f\20\16\20\u00a1\13\20\3\20\5\20\u00a4\n\20\3\21\3\21\3\21"+
		"\3\22\3\22\7\22\u00ab\n\22\f\22\16\22\u00ae\13\22\3\22\3\22\3\23\3\23"+
		"\3\23\7\23\u00b5\n\23\f\23\16\23\u00b8\13\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\6\25\u00c4\n\25\r\25\16\25\u00c5\5\25\u00c8"+
		"\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00d3\n\26\3\26"+
		"\3\26\3\26\6\26\u00d8\n\26\r\26\16\26\u00d9\3\26\3\26\3\26\6\26\u00df"+
		"\n\26\r\26\16\26\u00e0\7\26\u00e3\n\26\f\26\16\26\u00e6\13\26\3\27\3\27"+
		"\5\27\u00ea\n\27\3\30\3\30\3\30\7\30\u00ef\n\30\f\30\16\30\u00f2\13\30"+
		"\3\31\3\31\3\31\7\31\u00f7\n\31\f\31\16\31\u00fa\13\31\3\32\3\32\3\32"+
		"\5\32\u00ff\n\32\3\33\3\33\3\33\3\33\7\33\u0105\n\33\f\33\16\33\u0108"+
		"\13\33\3\34\3\34\3\34\2\3*\35\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 "+
		"\"$&(*,.\60\62\64\66\2\6\3\2&(\3\2\36\37\3\2\34\35\3\2 %\2\u010f\2B\3"+
		"\2\2\2\4G\3\2\2\2\6R\3\2\2\2\bT\3\2\2\2\nX\3\2\2\2\f`\3\2\2\2\16b\3\2"+
		"\2\2\20u\3\2\2\2\22z\3\2\2\2\24\u0081\3\2\2\2\26\u008d\3\2\2\2\30\u008f"+
		"\3\2\2\2\32\u0093\3\2\2\2\34\u009a\3\2\2\2\36\u009f\3\2\2\2 \u00a5\3\2"+
		"\2\2\"\u00ac\3\2\2\2$\u00b6\3\2\2\2&\u00bb\3\2\2\2(\u00c7\3\2\2\2*\u00d2"+
		"\3\2\2\2,\u00e9\3\2\2\2.\u00eb\3\2\2\2\60\u00f3\3\2\2\2\62\u00fe\3\2\2"+
		"\2\64\u0100\3\2\2\2\66\u0109\3\2\2\28A\7*\2\29A\5\6\4\2:;\5\30\r\2;<\7"+
		"*\2\2<A\3\2\2\2=>\5\f\7\2>?\7*\2\2?A\3\2\2\2@8\3\2\2\2@9\3\2\2\2@:\3\2"+
		"\2\2@=\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2C\3\3\2\2\2DB\3\2\2\2EH\5"+
		"\6\4\2FH\5\f\7\2GE\3\2\2\2GF\3\2\2\2H\5\3\2\2\2IJ\5\b\5\2JK\7*\2\2KS\3"+
		"\2\2\2LM\5&\24\2MN\7*\2\2NS\3\2\2\2OP\5\n\6\2PQ\7*\2\2QS\3\2\2\2RI\3\2"+
		"\2\2RL\3\2\2\2RO\3\2\2\2S\7\3\2\2\2TU\7&\2\2UV\7\27\2\2VW\5*\26\2W\t\3"+
		"\2\2\2XY\7\3\2\2YZ\7\22\2\2Z[\5*\26\2[\\\7\23\2\2\\\13\3\2\2\2]a\5\16"+
		"\b\2^a\5\20\t\2_a\5\22\n\2`]\3\2\2\2`^\3\2\2\2`_\3\2\2\2a\r\3\2\2\2bc"+
		"\7\7\2\2cd\5,\27\2de\7\25\2\2em\5(\25\2fg\7\b\2\2gh\5,\27\2hi\7\25\2\2"+
		"ij\5(\25\2jl\3\2\2\2kf\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2ns\3\2\2\2"+
		"om\3\2\2\2pq\7\t\2\2qr\7\25\2\2rt\5(\25\2sp\3\2\2\2st\3\2\2\2t\17\3\2"+
		"\2\2uv\7\n\2\2vw\5,\27\2wx\7\25\2\2xy\5(\25\2y\21\3\2\2\2z{\7\13\2\2{"+
		"|\7&\2\2|}\7\f\2\2}~\5\24\13\2~\177\7\25\2\2\177\u0080\5(\25\2\u0080\23"+
		"\3\2\2\2\u0081\u0087\7\30\2\2\u0082\u0083\5\26\f\2\u0083\u0084\7\24\2"+
		"\2\u0084\u0086\3\2\2\2\u0085\u0082\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085"+
		"\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008a\3\2\2\2\u0089\u0087\3\2\2\2\u008a"+
		"\u008b\5\26\f\2\u008b\u008c\7\31\2\2\u008c\25\3\2\2\2\u008d\u008e\t\2"+
		"\2\2\u008e\27\3\2\2\2\u008f\u0090\5\32\16\2\u0090\u0091\7*\2\2\u0091\u0092"+
		"\5\36\20\2\u0092\31\3\2\2\2\u0093\u0094\7\5\2\2\u0094\u0095\5\34\17\2"+
		"\u0095\u0096\7\22\2\2\u0096\u0097\5\"\22\2\u0097\u0098\7\23\2\2\u0098"+
		"\u0099\7\25\2\2\u0099\33\3\2\2\2\u009a\u009b\7&\2\2\u009b\35\3\2\2\2\u009c"+
		"\u009e\5(\25\2\u009d\u009c\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2"+
		"\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2"+
		"\u00a4\5 \21\2\u00a3\u00a2\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\37\3\2\2"+
		"\2\u00a5\u00a6\7\4\2\2\u00a6\u00a7\5*\26\2\u00a7!\3\2\2\2\u00a8\u00a9"+
		"\7&\2\2\u00a9\u00ab\7\24\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac"+
		"\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00af\3\2\2\2\u00ae\u00ac\3\2"+
		"\2\2\u00af\u00b0\7&\2\2\u00b0#\3\2\2\2\u00b1\u00b2\5\26\f\2\u00b2\u00b3"+
		"\7\24\2\2\u00b3\u00b5\3\2\2\2\u00b4\u00b1\3\2\2\2\u00b5\u00b8\3\2\2\2"+
		"\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b9\3\2\2\2\u00b8\u00b6"+
		"\3\2\2\2\u00b9\u00ba\5\26\f\2\u00ba%\3\2\2\2\u00bb\u00bc\5\34\17\2\u00bc"+
		"\u00bd\7\22\2\2\u00bd\u00be\5$\23\2\u00be\u00bf\7\23\2\2\u00bf\'\3\2\2"+
		"\2\u00c0\u00c8\5\6\4\2\u00c1\u00c3\7*\2\2\u00c2\u00c4\5\4\3\2\u00c3\u00c2"+
		"\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6"+
		"\u00c8\3\2\2\2\u00c7\u00c0\3\2\2\2\u00c7\u00c1\3\2\2\2\u00c8)\3\2\2\2"+
		"\u00c9\u00ca\b\26\1\2\u00ca\u00d3\7&\2\2\u00cb\u00d3\7\'\2\2\u00cc\u00d3"+
		"\7(\2\2\u00cd\u00ce\7\22\2\2\u00ce\u00cf\5*\26\2\u00cf\u00d0\7\23\2\2"+
		"\u00d0\u00d3\3\2\2\2\u00d1\u00d3\5&\24\2\u00d2\u00c9\3\2\2\2\u00d2\u00cb"+
		"\3\2\2\2\u00d2\u00cc\3\2\2\2\u00d2\u00cd\3\2\2\2\u00d2\u00d1\3\2\2\2\u00d3"+
		"\u00e4\3\2\2\2\u00d4\u00d7\f\t\2\2\u00d5\u00d6\t\3\2\2\u00d6\u00d8\5*"+
		"\26\2\u00d7\u00d5\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9"+
		"\u00da\3\2\2\2\u00da\u00e3\3\2\2\2\u00db\u00de\f\b\2\2\u00dc\u00dd\t\4"+
		"\2\2\u00dd\u00df\5*\26\2\u00de\u00dc\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0"+
		"\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e3\3\2\2\2\u00e2\u00d4\3\2"+
		"\2\2\u00e2\u00db\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4"+
		"\u00e5\3\2\2\2\u00e5+\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00ea\5.\30\2"+
		"\u00e8\u00ea\7\20\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00e8\3\2\2\2\u00ea-\3"+
		"\2\2\2\u00eb\u00f0\5\60\31\2\u00ec\u00ed\7\r\2\2\u00ed\u00ef\5\60\31\2"+
		"\u00ee\u00ec\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1"+
		"\3\2\2\2\u00f1/\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00f8\5\62\32\2\u00f4"+
		"\u00f5\7\16\2\2\u00f5\u00f7\5\62\32\2\u00f6\u00f4\3\2\2\2\u00f7\u00fa"+
		"\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\61\3\2\2\2\u00fa"+
		"\u00f8\3\2\2\2\u00fb\u00fc\7\17\2\2\u00fc\u00ff\5\62\32\2\u00fd\u00ff"+
		"\5\64\33\2\u00fe\u00fb\3\2\2\2\u00fe\u00fd\3\2\2\2\u00ff\63\3\2\2\2\u0100"+
		"\u0106\t\2\2\2\u0101\u0102\5\66\34\2\u0102\u0103\t\2\2\2\u0103\u0105\3"+
		"\2\2\2\u0104\u0101\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104\3\2\2\2\u0106"+
		"\u0107\3\2\2\2\u0107\65\3\2\2\2\u0108\u0106\3\2\2\2\u0109\u010a\t\5\2"+
		"\2\u010a\67\3\2\2\2\32@BGR`ms\u0087\u009f\u00a3\u00ac\u00b6\u00c5\u00c7"+
		"\u00d2\u00d9\u00e0\u00e2\u00e4\u00e9\u00f0\u00f8\u00fe\u0106";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}