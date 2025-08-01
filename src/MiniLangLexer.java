// Generated from C:/antlr/antlrProjects/Tarea3_2/src/MiniLang.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class MiniLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, NUMERO=16, 
		ID=17, NL=18, WS=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "NUMERO", "ID", 
			"NL", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'let'", "'='", "'print'", "'if'", "'then'", "'endif'", "'while'", 
			"'do'", "'endwhile'", "'*'", "'/'", "'+'", "'-'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "NUMERO", "ID", "NL", "WS"
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


	public MiniLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MiniLang.g4"; }

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
		"\u0004\u0000\u0013w\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0004\u000f"+
		"a\b\u000f\u000b\u000f\f\u000fb\u0001\u0010\u0001\u0010\u0005\u0010g\b"+
		"\u0010\n\u0010\f\u0010j\t\u0010\u0001\u0011\u0003\u0011m\b\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0004\u0012r\b\u0012\u000b\u0012\f\u0012"+
		"s\u0001\u0012\u0001\u0012\u0000\u0000\u0013\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n"+
		"\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"#\u0012%\u0013\u0001\u0000\u0004\u0001\u000009\u0003\u0000AZ__az\u0004"+
		"\u000009AZ__az\u0002\u0000\t\t  z\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f"+
		"\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013"+
		"\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017"+
		"\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b"+
		"\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f"+
		"\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000"+
		"\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0001\'\u0001\u0000\u0000"+
		"\u0000\u0003+\u0001\u0000\u0000\u0000\u0005-\u0001\u0000\u0000\u0000\u0007"+
		"3\u0001\u0000\u0000\u0000\t6\u0001\u0000\u0000\u0000\u000b;\u0001\u0000"+
		"\u0000\u0000\rA\u0001\u0000\u0000\u0000\u000fG\u0001\u0000\u0000\u0000"+
		"\u0011J\u0001\u0000\u0000\u0000\u0013S\u0001\u0000\u0000\u0000\u0015U"+
		"\u0001\u0000\u0000\u0000\u0017W\u0001\u0000\u0000\u0000\u0019Y\u0001\u0000"+
		"\u0000\u0000\u001b[\u0001\u0000\u0000\u0000\u001d]\u0001\u0000\u0000\u0000"+
		"\u001f`\u0001\u0000\u0000\u0000!d\u0001\u0000\u0000\u0000#l\u0001\u0000"+
		"\u0000\u0000%q\u0001\u0000\u0000\u0000\'(\u0005l\u0000\u0000()\u0005e"+
		"\u0000\u0000)*\u0005t\u0000\u0000*\u0002\u0001\u0000\u0000\u0000+,\u0005"+
		"=\u0000\u0000,\u0004\u0001\u0000\u0000\u0000-.\u0005p\u0000\u0000./\u0005"+
		"r\u0000\u0000/0\u0005i\u0000\u000001\u0005n\u0000\u000012\u0005t\u0000"+
		"\u00002\u0006\u0001\u0000\u0000\u000034\u0005i\u0000\u000045\u0005f\u0000"+
		"\u00005\b\u0001\u0000\u0000\u000067\u0005t\u0000\u000078\u0005h\u0000"+
		"\u000089\u0005e\u0000\u00009:\u0005n\u0000\u0000:\n\u0001\u0000\u0000"+
		"\u0000;<\u0005e\u0000\u0000<=\u0005n\u0000\u0000=>\u0005d\u0000\u0000"+
		">?\u0005i\u0000\u0000?@\u0005f\u0000\u0000@\f\u0001\u0000\u0000\u0000"+
		"AB\u0005w\u0000\u0000BC\u0005h\u0000\u0000CD\u0005i\u0000\u0000DE\u0005"+
		"l\u0000\u0000EF\u0005e\u0000\u0000F\u000e\u0001\u0000\u0000\u0000GH\u0005"+
		"d\u0000\u0000HI\u0005o\u0000\u0000I\u0010\u0001\u0000\u0000\u0000JK\u0005"+
		"e\u0000\u0000KL\u0005n\u0000\u0000LM\u0005d\u0000\u0000MN\u0005w\u0000"+
		"\u0000NO\u0005h\u0000\u0000OP\u0005i\u0000\u0000PQ\u0005l\u0000\u0000"+
		"QR\u0005e\u0000\u0000R\u0012\u0001\u0000\u0000\u0000ST\u0005*\u0000\u0000"+
		"T\u0014\u0001\u0000\u0000\u0000UV\u0005/\u0000\u0000V\u0016\u0001\u0000"+
		"\u0000\u0000WX\u0005+\u0000\u0000X\u0018\u0001\u0000\u0000\u0000YZ\u0005"+
		"-\u0000\u0000Z\u001a\u0001\u0000\u0000\u0000[\\\u0005(\u0000\u0000\\\u001c"+
		"\u0001\u0000\u0000\u0000]^\u0005)\u0000\u0000^\u001e\u0001\u0000\u0000"+
		"\u0000_a\u0007\u0000\u0000\u0000`_\u0001\u0000\u0000\u0000ab\u0001\u0000"+
		"\u0000\u0000b`\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000c \u0001"+
		"\u0000\u0000\u0000dh\u0007\u0001\u0000\u0000eg\u0007\u0002\u0000\u0000"+
		"fe\u0001\u0000\u0000\u0000gj\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000"+
		"\u0000hi\u0001\u0000\u0000\u0000i\"\u0001\u0000\u0000\u0000jh\u0001\u0000"+
		"\u0000\u0000km\u0005\r\u0000\u0000lk\u0001\u0000\u0000\u0000lm\u0001\u0000"+
		"\u0000\u0000mn\u0001\u0000\u0000\u0000no\u0005\n\u0000\u0000o$\u0001\u0000"+
		"\u0000\u0000pr\u0007\u0003\u0000\u0000qp\u0001\u0000\u0000\u0000rs\u0001"+
		"\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000"+
		"tu\u0001\u0000\u0000\u0000uv\u0006\u0012\u0000\u0000v&\u0001\u0000\u0000"+
		"\u0000\u0005\u0000bhls\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}