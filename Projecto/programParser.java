// Generated from program.g4 by ANTLR 4.6
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class programParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, IMAGE=11, INT=12, VAR=13, WORD=14, FORMAT=15, NEWLINE=16;
	public static final int
		RULE_run = 0, RULE_scheme = 1, RULE_operations = 2, RULE_assign = 3, RULE_show = 4, 
		RULE_resize = 5, RULE_rotate = 6, RULE_canny = 7, RULE_blur = 8, RULE_blend = 9, 
		RULE_save = 10;
	public static final String[] ruleNames = {
		"run", "scheme", "operations", "assign", "show", "resize", "rotate", "canny", 
		"blur", "blend", "save"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "' = '", "'show '", "'resize '", "' '", "', '", "'rotate '", "'canny '", 
		"'blur '", "'blend '", "'save '"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "IMAGE", 
		"INT", "VAR", "WORD", "FORMAT", "NEWLINE"
	};
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
	public String getGrammarFileName() { return "program.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public programParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class RunContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(programParser.EOF, 0); }
		public List<SchemeContext> scheme() {
			return getRuleContexts(SchemeContext.class);
		}
		public SchemeContext scheme(int i) {
			return getRuleContext(SchemeContext.class,i);
		}
		public RunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_run; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programListener ) ((programListener)listener).enterRun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programListener ) ((programListener)listener).exitRun(this);
		}
	}

	public final RunContext run() throws RecognitionException {
		RunContext _localctx = new RunContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_run);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << VAR) | (1L << NEWLINE))) != 0)) {
				{
				{
				setState(22);
				scheme();
				}
				}
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(28);
			match(EOF);
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

	public static class SchemeContext extends ParserRuleContext {
		public OperationsContext operations() {
			return getRuleContext(OperationsContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(programParser.NEWLINE, 0); }
		public SchemeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scheme; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programListener ) ((programListener)listener).enterScheme(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programListener ) ((programListener)listener).exitScheme(this);
		}
	}

	public final SchemeContext scheme() throws RecognitionException {
		SchemeContext _localctx = new SchemeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_scheme);
		try {
			setState(33);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__2:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				operations();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				assign();
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 3);
				{
				setState(32);
				match(NEWLINE);
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

	public static class OperationsContext extends ParserRuleContext {
		public ShowContext show() {
			return getRuleContext(ShowContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(programParser.NEWLINE, 0); }
		public ResizeContext resize() {
			return getRuleContext(ResizeContext.class,0);
		}
		public RotateContext rotate() {
			return getRuleContext(RotateContext.class,0);
		}
		public CannyContext canny() {
			return getRuleContext(CannyContext.class,0);
		}
		public BlurContext blur() {
			return getRuleContext(BlurContext.class,0);
		}
		public BlendContext blend() {
			return getRuleContext(BlendContext.class,0);
		}
		public SaveContext save() {
			return getRuleContext(SaveContext.class,0);
		}
		public OperationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programListener ) ((programListener)listener).enterOperations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programListener ) ((programListener)listener).exitOperations(this);
		}
	}

	public final OperationsContext operations() throws RecognitionException {
		OperationsContext _localctx = new OperationsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_operations);
		try {
			setState(56);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				show();
				setState(36);
				match(NEWLINE);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				resize();
				setState(39);
				match(NEWLINE);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(41);
				rotate();
				setState(42);
				match(NEWLINE);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 4);
				{
				setState(44);
				canny();
				setState(45);
				match(NEWLINE);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 5);
				{
				setState(47);
				blur();
				setState(48);
				match(NEWLINE);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 6);
				{
				setState(50);
				blend();
				setState(51);
				match(NEWLINE);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 7);
				{
				setState(53);
				save();
				setState(54);
				match(NEWLINE);
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

	public static class AssignContext extends ParserRuleContext {
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
	 
		public AssignContext() { }
		public void copyFrom(AssignContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignImageContext extends AssignContext {
		public TerminalNode VAR() { return getToken(programParser.VAR, 0); }
		public TerminalNode IMAGE() { return getToken(programParser.IMAGE, 0); }
		public AssignImageContext(AssignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programListener ) ((programListener)listener).enterAssignImage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programListener ) ((programListener)listener).exitAssignImage(this);
		}
	}
	public static class AssignOperationContext extends AssignContext {
		public TerminalNode VAR() { return getToken(programParser.VAR, 0); }
		public OperationsContext operations() {
			return getRuleContext(OperationsContext.class,0);
		}
		public AssignOperationContext(AssignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programListener ) ((programListener)listener).enterAssignOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programListener ) ((programListener)listener).exitAssignOperation(this);
		}
	}
	public static class AssignVarContext extends AssignContext {
		public List<TerminalNode> VAR() { return getTokens(programParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(programParser.VAR, i);
		}
		public AssignVarContext(AssignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programListener ) ((programListener)listener).enterAssignVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programListener ) ((programListener)listener).exitAssignVar(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assign);
		try {
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new AssignOperationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				match(VAR);
				setState(59);
				match(T__0);
				setState(60);
				operations();
				}
				break;
			case 2:
				_localctx = new AssignImageContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				match(VAR);
				setState(62);
				match(T__0);
				setState(63);
				match(IMAGE);
				}
				break;
			case 3:
				_localctx = new AssignVarContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(64);
				match(VAR);
				setState(65);
				match(T__0);
				setState(66);
				match(VAR);
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

	public static class ShowContext extends ParserRuleContext {
		public ShowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_show; }
	 
		public ShowContext() { }
		public void copyFrom(ShowContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ShowVarContext extends ShowContext {
		public TerminalNode VAR() { return getToken(programParser.VAR, 0); }
		public ShowVarContext(ShowContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programListener ) ((programListener)listener).enterShowVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programListener ) ((programListener)listener).exitShowVar(this);
		}
	}
	public static class ShowImageContext extends ShowContext {
		public TerminalNode IMAGE() { return getToken(programParser.IMAGE, 0); }
		public ShowImageContext(ShowContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programListener ) ((programListener)listener).enterShowImage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programListener ) ((programListener)listener).exitShowImage(this);
		}
	}

	public final ShowContext show() throws RecognitionException {
		ShowContext _localctx = new ShowContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_show);
		try {
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new ShowImageContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				match(T__1);
				setState(70);
				match(IMAGE);
				}
				break;
			case 2:
				_localctx = new ShowVarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				match(T__1);
				setState(72);
				match(VAR);
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

	public static class ResizeContext extends ParserRuleContext {
		public ResizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resize; }
	 
		public ResizeContext() { }
		public void copyFrom(ResizeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ResizeVarContext extends ResizeContext {
		public TerminalNode VAR() { return getToken(programParser.VAR, 0); }
		public List<TerminalNode> INT() { return getTokens(programParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(programParser.INT, i);
		}
		public ResizeVarContext(ResizeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programListener ) ((programListener)listener).enterResizeVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programListener ) ((programListener)listener).exitResizeVar(this);
		}
	}
	public static class ResizeImageContext extends ResizeContext {
		public TerminalNode IMAGE() { return getToken(programParser.IMAGE, 0); }
		public List<TerminalNode> INT() { return getTokens(programParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(programParser.INT, i);
		}
		public ResizeImageContext(ResizeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programListener ) ((programListener)listener).enterResizeImage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programListener ) ((programListener)listener).exitResizeImage(this);
		}
	}

	public final ResizeContext resize() throws RecognitionException {
		ResizeContext _localctx = new ResizeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_resize);
		try {
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new ResizeImageContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				match(T__2);
				setState(76);
				match(IMAGE);
				setState(77);
				match(T__3);
				setState(78);
				match(INT);
				setState(79);
				match(T__4);
				setState(80);
				match(INT);
				}
				break;
			case 2:
				_localctx = new ResizeVarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				match(T__2);
				setState(82);
				match(VAR);
				setState(83);
				match(T__3);
				setState(84);
				match(INT);
				setState(85);
				match(T__4);
				setState(86);
				match(INT);
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

	public static class RotateContext extends ParserRuleContext {
		public RotateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rotate; }
	 
		public RotateContext() { }
		public void copyFrom(RotateContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RotateImageContext extends RotateContext {
		public TerminalNode IMAGE() { return getToken(programParser.IMAGE, 0); }
		public TerminalNode INT() { return getToken(programParser.INT, 0); }
		public RotateImageContext(RotateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programListener ) ((programListener)listener).enterRotateImage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programListener ) ((programListener)listener).exitRotateImage(this);
		}
	}
	public static class RotateVarContext extends RotateContext {
		public TerminalNode VAR() { return getToken(programParser.VAR, 0); }
		public TerminalNode INT() { return getToken(programParser.INT, 0); }
		public RotateVarContext(RotateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programListener ) ((programListener)listener).enterRotateVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programListener ) ((programListener)listener).exitRotateVar(this);
		}
	}

	public final RotateContext rotate() throws RecognitionException {
		RotateContext _localctx = new RotateContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_rotate);
		try {
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new RotateImageContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				match(T__5);
				setState(90);
				match(IMAGE);
				setState(91);
				match(T__3);
				setState(92);
				match(INT);
				}
				break;
			case 2:
				_localctx = new RotateVarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				match(T__5);
				setState(94);
				match(VAR);
				setState(95);
				match(T__3);
				setState(96);
				match(INT);
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

	public static class CannyContext extends ParserRuleContext {
		public CannyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_canny; }
	 
		public CannyContext() { }
		public void copyFrom(CannyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CannyVarContext extends CannyContext {
		public TerminalNode VAR() { return getToken(programParser.VAR, 0); }
		public CannyVarContext(CannyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programListener ) ((programListener)listener).enterCannyVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programListener ) ((programListener)listener).exitCannyVar(this);
		}
	}
	public static class CannyImageContext extends CannyContext {
		public TerminalNode IMAGE() { return getToken(programParser.IMAGE, 0); }
		public CannyImageContext(CannyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programListener ) ((programListener)listener).enterCannyImage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programListener ) ((programListener)listener).exitCannyImage(this);
		}
	}

	public final CannyContext canny() throws RecognitionException {
		CannyContext _localctx = new CannyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_canny);
		try {
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new CannyImageContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				match(T__6);
				setState(100);
				match(IMAGE);
				}
				break;
			case 2:
				_localctx = new CannyVarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				match(T__6);
				setState(102);
				match(VAR);
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

	public static class BlurContext extends ParserRuleContext {
		public BlurContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blur; }
	 
		public BlurContext() { }
		public void copyFrom(BlurContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BlurVarContext extends BlurContext {
		public TerminalNode VAR() { return getToken(programParser.VAR, 0); }
		public BlurVarContext(BlurContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programListener ) ((programListener)listener).enterBlurVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programListener ) ((programListener)listener).exitBlurVar(this);
		}
	}
	public static class BlurImageContext extends BlurContext {
		public TerminalNode IMAGE() { return getToken(programParser.IMAGE, 0); }
		public BlurImageContext(BlurContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programListener ) ((programListener)listener).enterBlurImage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programListener ) ((programListener)listener).exitBlurImage(this);
		}
	}

	public final BlurContext blur() throws RecognitionException {
		BlurContext _localctx = new BlurContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_blur);
		try {
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new BlurImageContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				match(T__7);
				setState(106);
				match(IMAGE);
				}
				break;
			case 2:
				_localctx = new BlurVarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				match(T__7);
				setState(108);
				match(VAR);
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

	public static class BlendContext extends ParserRuleContext {
		public BlendContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blend; }
	 
		public BlendContext() { }
		public void copyFrom(BlendContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BlendImageVarContext extends BlendContext {
		public TerminalNode IMAGE() { return getToken(programParser.IMAGE, 0); }
		public TerminalNode VAR() { return getToken(programParser.VAR, 0); }
		public BlendImageVarContext(BlendContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programListener ) ((programListener)listener).enterBlendImageVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programListener ) ((programListener)listener).exitBlendImageVar(this);
		}
	}
	public static class BlendVarImageContext extends BlendContext {
		public TerminalNode VAR() { return getToken(programParser.VAR, 0); }
		public TerminalNode IMAGE() { return getToken(programParser.IMAGE, 0); }
		public BlendVarImageContext(BlendContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programListener ) ((programListener)listener).enterBlendVarImage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programListener ) ((programListener)listener).exitBlendVarImage(this);
		}
	}
	public static class BlendImageContext extends BlendContext {
		public List<TerminalNode> IMAGE() { return getTokens(programParser.IMAGE); }
		public TerminalNode IMAGE(int i) {
			return getToken(programParser.IMAGE, i);
		}
		public BlendImageContext(BlendContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programListener ) ((programListener)listener).enterBlendImage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programListener ) ((programListener)listener).exitBlendImage(this);
		}
	}
	public static class BlendVarContext extends BlendContext {
		public List<TerminalNode> VAR() { return getTokens(programParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(programParser.VAR, i);
		}
		public BlendVarContext(BlendContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programListener ) ((programListener)listener).enterBlendVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programListener ) ((programListener)listener).exitBlendVar(this);
		}
	}

	public final BlendContext blend() throws RecognitionException {
		BlendContext _localctx = new BlendContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_blend);
		try {
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new BlendImageContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				match(T__8);
				setState(112);
				match(IMAGE);
				setState(113);
				match(T__4);
				setState(114);
				match(IMAGE);
				}
				break;
			case 2:
				_localctx = new BlendImageVarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				match(T__8);
				setState(116);
				match(IMAGE);
				setState(117);
				match(T__4);
				setState(118);
				match(VAR);
				}
				break;
			case 3:
				_localctx = new BlendVarImageContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(119);
				match(T__8);
				setState(120);
				match(VAR);
				setState(121);
				match(T__4);
				setState(122);
				match(IMAGE);
				}
				break;
			case 4:
				_localctx = new BlendVarContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(123);
				match(T__8);
				setState(124);
				match(VAR);
				setState(125);
				match(T__4);
				setState(126);
				match(VAR);
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

	public static class SaveContext extends ParserRuleContext {
		public SaveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_save; }
	 
		public SaveContext() { }
		public void copyFrom(SaveContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SaveVarContext extends SaveContext {
		public TerminalNode VAR() { return getToken(programParser.VAR, 0); }
		public SaveVarContext(SaveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programListener ) ((programListener)listener).enterSaveVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programListener ) ((programListener)listener).exitSaveVar(this);
		}
	}
	public static class SaveImageContext extends SaveContext {
		public TerminalNode IMAGE() { return getToken(programParser.IMAGE, 0); }
		public SaveImageContext(SaveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programListener ) ((programListener)listener).enterSaveImage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programListener ) ((programListener)listener).exitSaveImage(this);
		}
	}

	public final SaveContext save() throws RecognitionException {
		SaveContext _localctx = new SaveContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_save);
		try {
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new SaveImageContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				match(T__9);
				setState(130);
				match(IMAGE);
				}
				break;
			case 2:
				_localctx = new SaveVarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				match(T__9);
				setState(132);
				match(VAR);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\22\u008a\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\3\2\7\2\32\n\2\f\2\16\2\35\13\2\3\2\3\2\3\3\3\3\3\3\5\3"+
		"$\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\5\4;\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5"+
		"F\n\5\3\6\3\6\3\6\3\6\5\6L\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\5\7Z\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bd\n\b\3\t\3\t\3\t"+
		"\3\t\5\tj\n\t\3\n\3\n\3\n\3\n\5\np\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0082\n\13\3\f\3"+
		"\f\3\f\3\f\5\f\u0088\n\f\3\f\2\2\r\2\4\6\b\n\f\16\20\22\24\26\2\2\u0092"+
		"\2\33\3\2\2\2\4#\3\2\2\2\6:\3\2\2\2\bE\3\2\2\2\nK\3\2\2\2\fY\3\2\2\2\16"+
		"c\3\2\2\2\20i\3\2\2\2\22o\3\2\2\2\24\u0081\3\2\2\2\26\u0087\3\2\2\2\30"+
		"\32\5\4\3\2\31\30\3\2\2\2\32\35\3\2\2\2\33\31\3\2\2\2\33\34\3\2\2\2\34"+
		"\36\3\2\2\2\35\33\3\2\2\2\36\37\7\2\2\3\37\3\3\2\2\2 $\5\6\4\2!$\5\b\5"+
		"\2\"$\7\22\2\2# \3\2\2\2#!\3\2\2\2#\"\3\2\2\2$\5\3\2\2\2%&\5\n\6\2&\'"+
		"\7\22\2\2\';\3\2\2\2()\5\f\7\2)*\7\22\2\2*;\3\2\2\2+,\5\16\b\2,-\7\22"+
		"\2\2-;\3\2\2\2./\5\20\t\2/\60\7\22\2\2\60;\3\2\2\2\61\62\5\22\n\2\62\63"+
		"\7\22\2\2\63;\3\2\2\2\64\65\5\24\13\2\65\66\7\22\2\2\66;\3\2\2\2\678\5"+
		"\26\f\289\7\22\2\29;\3\2\2\2:%\3\2\2\2:(\3\2\2\2:+\3\2\2\2:.\3\2\2\2:"+
		"\61\3\2\2\2:\64\3\2\2\2:\67\3\2\2\2;\7\3\2\2\2<=\7\17\2\2=>\7\3\2\2>F"+
		"\5\6\4\2?@\7\17\2\2@A\7\3\2\2AF\7\r\2\2BC\7\17\2\2CD\7\3\2\2DF\7\17\2"+
		"\2E<\3\2\2\2E?\3\2\2\2EB\3\2\2\2F\t\3\2\2\2GH\7\4\2\2HL\7\r\2\2IJ\7\4"+
		"\2\2JL\7\17\2\2KG\3\2\2\2KI\3\2\2\2L\13\3\2\2\2MN\7\5\2\2NO\7\r\2\2OP"+
		"\7\6\2\2PQ\7\16\2\2QR\7\7\2\2RZ\7\16\2\2ST\7\5\2\2TU\7\17\2\2UV\7\6\2"+
		"\2VW\7\16\2\2WX\7\7\2\2XZ\7\16\2\2YM\3\2\2\2YS\3\2\2\2Z\r\3\2\2\2[\\\7"+
		"\b\2\2\\]\7\r\2\2]^\7\6\2\2^d\7\16\2\2_`\7\b\2\2`a\7\17\2\2ab\7\6\2\2"+
		"bd\7\16\2\2c[\3\2\2\2c_\3\2\2\2d\17\3\2\2\2ef\7\t\2\2fj\7\r\2\2gh\7\t"+
		"\2\2hj\7\17\2\2ie\3\2\2\2ig\3\2\2\2j\21\3\2\2\2kl\7\n\2\2lp\7\r\2\2mn"+
		"\7\n\2\2np\7\17\2\2ok\3\2\2\2om\3\2\2\2p\23\3\2\2\2qr\7\13\2\2rs\7\r\2"+
		"\2st\7\7\2\2t\u0082\7\r\2\2uv\7\13\2\2vw\7\r\2\2wx\7\7\2\2x\u0082\7\17"+
		"\2\2yz\7\13\2\2z{\7\17\2\2{|\7\7\2\2|\u0082\7\r\2\2}~\7\13\2\2~\177\7"+
		"\17\2\2\177\u0080\7\7\2\2\u0080\u0082\7\17\2\2\u0081q\3\2\2\2\u0081u\3"+
		"\2\2\2\u0081y\3\2\2\2\u0081}\3\2\2\2\u0082\25\3\2\2\2\u0083\u0084\7\f"+
		"\2\2\u0084\u0088\7\r\2\2\u0085\u0086\7\f\2\2\u0086\u0088\7\17\2\2\u0087"+
		"\u0083\3\2\2\2\u0087\u0085\3\2\2\2\u0088\27\3\2\2\2\r\33#:EKYcio\u0081"+
		"\u0087";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}