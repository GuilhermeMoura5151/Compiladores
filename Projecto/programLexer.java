// Generated from program.g4 by ANTLR 4.6
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class programLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, IMAGE=11, INT=12, VAR=13, WORD=14, FORMAT=15, NEWLINE=16;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "IMAGE", "INT", "VAR", "WORD", "FORMAT", "NEWLINE"
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


	public programLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "program.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\22\u00b3\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\6\ra\n\r\r\r\16\rb\3\16\6\16f\n\16"+
		"\r\16\16\16g\3\17\6\17k\n\17\r\17\16\17l\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\5\20\u00ad\n\20\3\21\5\21\u00b0\n\21\3\21\3\21\2\2\22\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22\3\2\5"+
		"\3\2\62;\3\2c|\5\2\62;C\\c|\u00c4\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\3#\3\2\2\2\5\'\3\2\2\2\7-\3\2\2\2\t\65\3\2"+
		"\2\2\13\67\3\2\2\2\r:\3\2\2\2\17B\3\2\2\2\21I\3\2\2\2\23O\3\2\2\2\25V"+
		"\3\2\2\2\27\\\3\2\2\2\31`\3\2\2\2\33e\3\2\2\2\35j\3\2\2\2\37\u00ac\3\2"+
		"\2\2!\u00af\3\2\2\2#$\7\"\2\2$%\7?\2\2%&\7\"\2\2&\4\3\2\2\2\'(\7u\2\2"+
		"()\7j\2\2)*\7q\2\2*+\7y\2\2+,\7\"\2\2,\6\3\2\2\2-.\7t\2\2./\7g\2\2/\60"+
		"\7u\2\2\60\61\7k\2\2\61\62\7|\2\2\62\63\7g\2\2\63\64\7\"\2\2\64\b\3\2"+
		"\2\2\65\66\7\"\2\2\66\n\3\2\2\2\678\7.\2\289\7\"\2\29\f\3\2\2\2:;\7t\2"+
		"\2;<\7q\2\2<=\7v\2\2=>\7c\2\2>?\7v\2\2?@\7g\2\2@A\7\"\2\2A\16\3\2\2\2"+
		"BC\7e\2\2CD\7c\2\2DE\7p\2\2EF\7p\2\2FG\7{\2\2GH\7\"\2\2H\20\3\2\2\2IJ"+
		"\7d\2\2JK\7n\2\2KL\7w\2\2LM\7t\2\2MN\7\"\2\2N\22\3\2\2\2OP\7d\2\2PQ\7"+
		"n\2\2QR\7g\2\2RS\7p\2\2ST\7f\2\2TU\7\"\2\2U\24\3\2\2\2VW\7u\2\2WX\7c\2"+
		"\2XY\7x\2\2YZ\7g\2\2Z[\7\"\2\2[\26\3\2\2\2\\]\5\35\17\2]^\5\37\20\2^\30"+
		"\3\2\2\2_a\t\2\2\2`_\3\2\2\2ab\3\2\2\2b`\3\2\2\2bc\3\2\2\2c\32\3\2\2\2"+
		"df\t\3\2\2ed\3\2\2\2fg\3\2\2\2ge\3\2\2\2gh\3\2\2\2h\34\3\2\2\2ik\t\4\2"+
		"\2ji\3\2\2\2kl\3\2\2\2lj\3\2\2\2lm\3\2\2\2m\36\3\2\2\2no\7\60\2\2op\7"+
		"d\2\2pq\7o\2\2q\u00ad\7r\2\2rs\7\60\2\2st\7f\2\2tu\7k\2\2u\u00ad\7d\2"+
		"\2vw\7\60\2\2wx\7l\2\2xy\7r\2\2yz\7g\2\2z\u00ad\7i\2\2{|\7\60\2\2|}\7"+
		"l\2\2}~\7r\2\2~\u00ad\7i\2\2\177\u0080\7\60\2\2\u0080\u0081\7l\2\2\u0081"+
		"\u0082\7r\2\2\u0082\u00ad\7g\2\2\u0083\u0084\7\60\2\2\u0084\u0085\7l\2"+
		"\2\u0085\u0086\7r\2\2\u0086\u00ad\7\64\2\2\u0087\u0088\7\60\2\2\u0088"+
		"\u0089\7r\2\2\u0089\u008a\7p\2\2\u008a\u00ad\7i\2\2\u008b\u008c\7\60\2"+
		"\2\u008c\u008d\7y\2\2\u008d\u008e\7g\2\2\u008e\u008f\7d\2\2\u008f\u00ad"+
		"\7r\2\2\u0090\u0091\7\60\2\2\u0091\u0092\7r\2\2\u0092\u0093\7d\2\2\u0093"+
		"\u00ad\7o\2\2\u0094\u0095\7\60\2\2\u0095\u0096\7r\2\2\u0096\u0097\7i\2"+
		"\2\u0097\u00ad\7o\2\2\u0098\u0099\7\60\2\2\u0099\u009a\7r\2\2\u009a\u009b"+
		"\7r\2\2\u009b\u00ad\7o\2\2\u009c\u009d\7\60\2\2\u009d\u009e\7u\2\2\u009e"+
		"\u00ad\7t\2\2\u009f\u00a0\7\60\2\2\u00a0\u00a1\7t\2\2\u00a1\u00a2\7c\2"+
		"\2\u00a2\u00ad\7u\2\2\u00a3\u00a4\7\60\2\2\u00a4\u00a5\7v\2\2\u00a5\u00a6"+
		"\7k\2\2\u00a6\u00a7\7h\2\2\u00a7\u00ad\7h\2\2\u00a8\u00a9\7\60\2\2\u00a9"+
		"\u00aa\7v\2\2\u00aa\u00ab\7k\2\2\u00ab\u00ad\7h\2\2\u00acn\3\2\2\2\u00ac"+
		"r\3\2\2\2\u00acv\3\2\2\2\u00ac{\3\2\2\2\u00ac\177\3\2\2\2\u00ac\u0083"+
		"\3\2\2\2\u00ac\u0087\3\2\2\2\u00ac\u008b\3\2\2\2\u00ac\u0090\3\2\2\2\u00ac"+
		"\u0094\3\2\2\2\u00ac\u0098\3\2\2\2\u00ac\u009c\3\2\2\2\u00ac\u009f\3\2"+
		"\2\2\u00ac\u00a3\3\2\2\2\u00ac\u00a8\3\2\2\2\u00ad \3\2\2\2\u00ae\u00b0"+
		"\7\17\2\2\u00af\u00ae\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\3\2\2\2"+
		"\u00b1\u00b2\7\f\2\2\u00b2\"\3\2\2\2\b\2bgl\u00ac\u00af\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}