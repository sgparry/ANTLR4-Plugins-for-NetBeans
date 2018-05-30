// Generated from org\nemesis\antlr\v4\ant\task\depend\parser\impl\ANTLRv4.g4 by ANTLR 4.7.1
package org.nemesis.antlr.v4.ant.task.depend.parser.impl;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ANTLRv4Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ID_STARTING_WITH_UPPERCASE=1, ID_STARTING_WITH_LOWERCASE=2, LEXER_CHAR_SET=3, 
		DOC_COMMENT=4, BLOCK_COMMENT=5, LINE_COMMENT=6, INT=7, STRING_LITERAL=8, 
		UNTERMINATED_STRING_LITERAL=9, BEGIN_ARGUMENT=10, BEGIN_ACTION=11, OPTIONS=12, 
		TOKENS=13, CHANNELS=14, IMPORT=15, FRAGMENT=16, LEXER=17, PARSER=18, GRAMMAR=19, 
		PROTECTED=20, PUBLIC=21, PRIVATE=22, RETURNS=23, LOCALS=24, THROWS=25, 
		CATCH=26, FINALLY=27, MODE=28, COLON=29, COLONCOLON=30, COMMA=31, SEMI=32, 
		LPAREN=33, RPAREN=34, LBRACE=35, RBRACE=36, RARROW=37, LT=38, ASSOC=39, 
		RIGHT=40, LEFT=41, FAIL=42, GT=43, ASSIGN=44, QUESTION=45, STAR=46, PLUS_ASSIGN=47, 
		PLUS=48, OR=49, DOLLAR=50, RANGE=51, DOT=52, AT=53, HEADER=54, MEMBERS=55, 
		SHARP=56, NOT=57, ID=58, WS=59, ERRCHAR=60, END_ARGUMENT=61, UNTERMINATED_ARGUMENT=62, 
		ARGUMENT_CONTENT=63, END_ACTION=64, UNTERMINATED_ACTION=65, ACTION_CONTENT=66, 
		OPT_BLOCK_COMMENT=67, OPT_LINE_COMMENT=68, SUPER_CLASS=69, LANGUAGE=70, 
		TOKEN_VOCAB=71, TOKEN_LABEL_TYPE=72, OPT_WS=73, TOK_BLOCK_COMMENT=74, 
		TOK_LINE_COMMENT=75, TOK_ID=76, TOK_WS=77, CHN_BLOCK_COMMENT=78, CHN_LINE_COMMENT=79, 
		CHN_WS=80, LEXER_COMMAND_LINE_COMMENT=81, SKIP_COMMAND=82, MORE_COMMAND=83, 
		TYPE_COMMAND=84, CHANNEL_COMMAND=85, MODE_COMMAND=86, PUSHMODE_COMMAND=87, 
		POPMODE_COMMAND=88, LEXER_COMMAND_WS=89, UNTERMINATED_CHAR_SET=90;
	public static final int
		RULE_grammarFile = 0, RULE_grammarSpec = 1, RULE_grammarType = 2, RULE_analyzerDirectiveSpec = 3, 
		RULE_optionsSpec = 4, RULE_optionSpec = 5, RULE_superClassSpec = 6, RULE_languageSpec = 7, 
		RULE_tokenVocabSpec = 8, RULE_tokenLabelTypeSpec = 9, RULE_delegateGrammars = 10, 
		RULE_delegateGrammar = 11, RULE_grammarIdentifier = 12, RULE_tokensSpec = 13, 
		RULE_tokenList = 14, RULE_channelsSpec = 15, RULE_idList = 16, RULE_action = 17, 
		RULE_actionDestination = 18, RULE_actionScope = 19, RULE_actionBlock = 20, 
		RULE_modeSpec = 21, RULE_ruleSpec = 22, RULE_parserRuleSpec = 23, RULE_parserRuleDeclaration = 24, 
		RULE_exceptionGroup = 25, RULE_exceptionHandler = 26, RULE_finallyClause = 27, 
		RULE_parserRulePrequel = 28, RULE_parserRuleReturns = 29, RULE_throwsSpec = 30, 
		RULE_localsSpec = 31, RULE_ruleAction = 32, RULE_parserRuleVisibility = 33, 
		RULE_parserRuleDefinition = 34, RULE_parserRuleLabeledAlternative = 35, 
		RULE_altList = 36, RULE_parserRuleAlternative = 37, RULE_parserRuleElement = 38, 
		RULE_labeledParserRuleElement = 39, RULE_parserRuleAtom = 40, RULE_parserRuleReference = 41, 
		RULE_actionBlockArguments = 42, RULE_lexerRuleSpec = 43, RULE_lexerRuleDeclaration = 44, 
		RULE_tokenRuleDeclaration = 45, RULE_fragmentRuleDeclaration = 46, RULE_lexerRuleBlock = 47, 
		RULE_lexerRuleAlt = 48, RULE_lexerRuleElements = 49, RULE_lexerRuleElement = 50, 
		RULE_labeledLexerRuleElement = 51, RULE_lexerRuleElementBlock = 52, RULE_lexerCommands = 53, 
		RULE_lexerCommand = 54, RULE_lexerCommandExpr = 55, RULE_lexerRuleAtom = 56, 
		RULE_ebnf = 57, RULE_blockSuffix = 58, RULE_ebnfSuffix = 59, RULE_notSet = 60, 
		RULE_blockSet = 61, RULE_setElement = 62, RULE_block = 63, RULE_characterRange = 64, 
		RULE_terminal = 65, RULE_elementOptions = 66, RULE_elementOption = 67, 
		RULE_tokenOption = 68, RULE_identifier = 69, RULE_ruleElementIdentifier = 70, 
		RULE_classIdentifier = 71, RULE_parserRuleIdentifier = 72, RULE_tokenIdentifier = 73;
	public static final String[] ruleNames = {
		"grammarFile", "grammarSpec", "grammarType", "analyzerDirectiveSpec", 
		"optionsSpec", "optionSpec", "superClassSpec", "languageSpec", "tokenVocabSpec", 
		"tokenLabelTypeSpec", "delegateGrammars", "delegateGrammar", "grammarIdentifier", 
		"tokensSpec", "tokenList", "channelsSpec", "idList", "action", "actionDestination", 
		"actionScope", "actionBlock", "modeSpec", "ruleSpec", "parserRuleSpec", 
		"parserRuleDeclaration", "exceptionGroup", "exceptionHandler", "finallyClause", 
		"parserRulePrequel", "parserRuleReturns", "throwsSpec", "localsSpec", 
		"ruleAction", "parserRuleVisibility", "parserRuleDefinition", "parserRuleLabeledAlternative", 
		"altList", "parserRuleAlternative", "parserRuleElement", "labeledParserRuleElement", 
		"parserRuleAtom", "parserRuleReference", "actionBlockArguments", "lexerRuleSpec", 
		"lexerRuleDeclaration", "tokenRuleDeclaration", "fragmentRuleDeclaration", 
		"lexerRuleBlock", "lexerRuleAlt", "lexerRuleElements", "lexerRuleElement", 
		"labeledLexerRuleElement", "lexerRuleElementBlock", "lexerCommands", "lexerCommand", 
		"lexerCommandExpr", "lexerRuleAtom", "ebnf", "blockSuffix", "ebnfSuffix", 
		"notSet", "blockSet", "setElement", "block", "characterRange", "terminal", 
		"elementOptions", "elementOption", "tokenOption", "identifier", "ruleElementIdentifier", 
		"classIdentifier", "parserRuleIdentifier", "tokenIdentifier"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"'options'", "'tokens'", "'channels'", "'import'", "'fragment'", "'lexer'", 
		"'parser'", "'grammar'", "'protected'", "'public'", "'private'", "'returns'", 
		"'locals'", "'throws'", "'catch'", "'finally'", null, null, null, null, 
		null, null, null, null, null, null, null, "'assoc'", "'right'", "'left'", 
		"'fail'", null, null, null, null, null, null, null, null, null, null, 
		null, "'header'", "'members'", null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "'superClass'", "'language'", "'tokenVocab'", 
		"'TokenLabelType'", null, null, null, null, null, null, null, null, null, 
		"'skip'", "'more'", "'type'", "'channel'", null, "'pushMode'", "'popMode'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ID_STARTING_WITH_UPPERCASE", "ID_STARTING_WITH_LOWERCASE", "LEXER_CHAR_SET", 
		"DOC_COMMENT", "BLOCK_COMMENT", "LINE_COMMENT", "INT", "STRING_LITERAL", 
		"UNTERMINATED_STRING_LITERAL", "BEGIN_ARGUMENT", "BEGIN_ACTION", "OPTIONS", 
		"TOKENS", "CHANNELS", "IMPORT", "FRAGMENT", "LEXER", "PARSER", "GRAMMAR", 
		"PROTECTED", "PUBLIC", "PRIVATE", "RETURNS", "LOCALS", "THROWS", "CATCH", 
		"FINALLY", "MODE", "COLON", "COLONCOLON", "COMMA", "SEMI", "LPAREN", "RPAREN", 
		"LBRACE", "RBRACE", "RARROW", "LT", "ASSOC", "RIGHT", "LEFT", "FAIL", 
		"GT", "ASSIGN", "QUESTION", "STAR", "PLUS_ASSIGN", "PLUS", "OR", "DOLLAR", 
		"RANGE", "DOT", "AT", "HEADER", "MEMBERS", "SHARP", "NOT", "ID", "WS", 
		"ERRCHAR", "END_ARGUMENT", "UNTERMINATED_ARGUMENT", "ARGUMENT_CONTENT", 
		"END_ACTION", "UNTERMINATED_ACTION", "ACTION_CONTENT", "OPT_BLOCK_COMMENT", 
		"OPT_LINE_COMMENT", "SUPER_CLASS", "LANGUAGE", "TOKEN_VOCAB", "TOKEN_LABEL_TYPE", 
		"OPT_WS", "TOK_BLOCK_COMMENT", "TOK_LINE_COMMENT", "TOK_ID", "TOK_WS", 
		"CHN_BLOCK_COMMENT", "CHN_LINE_COMMENT", "CHN_WS", "LEXER_COMMAND_LINE_COMMENT", 
		"SKIP_COMMAND", "MORE_COMMAND", "TYPE_COMMAND", "CHANNEL_COMMAND", "MODE_COMMAND", 
		"PUSHMODE_COMMAND", "POPMODE_COMMAND", "LEXER_COMMAND_WS", "UNTERMINATED_CHAR_SET"
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
	public String getGrammarFileName() { return "ANTLRv4.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ANTLRv4Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class GrammarFileContext extends ParserRuleContext {
		public GrammarSpecContext grammarSpec() {
			return getRuleContext(GrammarSpecContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ANTLRv4Parser.EOF, 0); }
		public List<AnalyzerDirectiveSpecContext> analyzerDirectiveSpec() {
			return getRuleContexts(AnalyzerDirectiveSpecContext.class);
		}
		public AnalyzerDirectiveSpecContext analyzerDirectiveSpec(int i) {
			return getRuleContext(AnalyzerDirectiveSpecContext.class,i);
		}
		public List<RuleSpecContext> ruleSpec() {
			return getRuleContexts(RuleSpecContext.class);
		}
		public RuleSpecContext ruleSpec(int i) {
			return getRuleContext(RuleSpecContext.class,i);
		}
		public List<ModeSpecContext> modeSpec() {
			return getRuleContexts(ModeSpecContext.class);
		}
		public ModeSpecContext modeSpec(int i) {
			return getRuleContext(ModeSpecContext.class,i);
		}
		public GrammarFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grammarFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).enterGrammarFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).exitGrammarFile(this);
		}
	}

	public final GrammarFileContext grammarFile() throws RecognitionException {
		GrammarFileContext _localctx = new GrammarFileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_grammarFile);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			grammarSpec();
			setState(152);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(149);
					analyzerDirectiveSpec();
					}
					} 
				}
				setState(154);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID_STARTING_WITH_UPPERCASE) | (1L << ID_STARTING_WITH_LOWERCASE) | (1L << DOC_COMMENT) | (1L << FRAGMENT) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << PRIVATE))) != 0)) {
				{
				{
				setState(155);
				ruleSpec();
				}
				}
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MODE) {
				{
				{
				setState(161);
				modeSpec();
				}
				}
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(167);
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

	public static class GrammarSpecContext extends ParserRuleContext {
		public GrammarTypeContext grammarType() {
			return getRuleContext(GrammarTypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ANTLRv4Parser.SEMI, 0); }
		public List<TerminalNode> DOC_COMMENT() { return getTokens(ANTLRv4Parser.DOC_COMMENT); }
		public TerminalNode DOC_COMMENT(int i) {
			return getToken(ANTLRv4Parser.DOC_COMMENT, i);
		}
		public GrammarSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grammarSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).enterGrammarSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).exitGrammarSpec(this);
		}
	}

	public final GrammarSpecContext grammarSpec() throws RecognitionException {
		GrammarSpecContext _localctx = new GrammarSpecContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_grammarSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOC_COMMENT) {
				{
				{
				setState(169);
				match(DOC_COMMENT);
				}
				}
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(175);
			grammarType();
			setState(176);
			identifier();
			setState(177);
			match(SEMI);
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

	public static class GrammarTypeContext extends ParserRuleContext {
		public TerminalNode LEXER() { return getToken(ANTLRv4Parser.LEXER, 0); }
		public TerminalNode GRAMMAR() { return getToken(ANTLRv4Parser.GRAMMAR, 0); }
		public TerminalNode PARSER() { return getToken(ANTLRv4Parser.PARSER, 0); }
		public GrammarTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grammarType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).enterGrammarType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).exitGrammarType(this);
		}
	}

	public final GrammarTypeContext grammarType() throws RecognitionException {
		GrammarTypeContext _localctx = new GrammarTypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_grammarType);
		try {
			setState(184);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEXER:
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				match(LEXER);
				setState(180);
				match(GRAMMAR);
				}
				break;
			case PARSER:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				match(PARSER);
				setState(182);
				match(GRAMMAR);
				}
				break;
			case GRAMMAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(183);
				match(GRAMMAR);
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

	public static class AnalyzerDirectiveSpecContext extends ParserRuleContext {
		public OptionsSpecContext optionsSpec() {
			return getRuleContext(OptionsSpecContext.class,0);
		}
		public DelegateGrammarsContext delegateGrammars() {
			return getRuleContext(DelegateGrammarsContext.class,0);
		}
		public TokensSpecContext tokensSpec() {
			return getRuleContext(TokensSpecContext.class,0);
		}
		public ChannelsSpecContext channelsSpec() {
			return getRuleContext(ChannelsSpecContext.class,0);
		}
		public ActionContext action() {
			return getRuleContext(ActionContext.class,0);
		}
		public List<TerminalNode> DOC_COMMENT() { return getTokens(ANTLRv4Parser.DOC_COMMENT); }
		public TerminalNode DOC_COMMENT(int i) {
			return getToken(ANTLRv4Parser.DOC_COMMENT, i);
		}
		public AnalyzerDirectiveSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_analyzerDirectiveSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).enterAnalyzerDirectiveSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).exitAnalyzerDirectiveSpec(this);
		}
	}

	public final AnalyzerDirectiveSpecContext analyzerDirectiveSpec() throws RecognitionException {
		AnalyzerDirectiveSpecContext _localctx = new AnalyzerDirectiveSpecContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_analyzerDirectiveSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOC_COMMENT) {
				{
				{
				setState(186);
				match(DOC_COMMENT);
				}
				}
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(197);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPTIONS:
				{
				setState(192);
				optionsSpec();
				}
				break;
			case IMPORT:
				{
				setState(193);
				delegateGrammars();
				}
				break;
			case TOKENS:
				{
				setState(194);
				tokensSpec();
				}
				break;
			case CHANNELS:
				{
				setState(195);
				channelsSpec();
				}
				break;
			case AT:
				{
				setState(196);
				action();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class OptionsSpecContext extends ParserRuleContext {
		public TerminalNode OPTIONS() { return getToken(ANTLRv4Parser.OPTIONS, 0); }
		public TerminalNode LBRACE() { return getToken(ANTLRv4Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ANTLRv4Parser.RBRACE, 0); }
		public List<OptionSpecContext> optionSpec() {
			return getRuleContexts(OptionSpecContext.class);
		}
		public OptionSpecContext optionSpec(int i) {
			return getRuleContext(OptionSpecContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(ANTLRv4Parser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(ANTLRv4Parser.SEMI, i);
		}
		public OptionsSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionsSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).enterOptionsSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).exitOptionsSpec(this);
		}
	}

	public final OptionsSpecContext optionsSpec() throws RecognitionException {
		OptionsSpecContext _localctx = new OptionsSpecContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_optionsSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(OPTIONS);
			setState(200);
			match(LBRACE);
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (SUPER_CLASS - 69)) | (1L << (LANGUAGE - 69)) | (1L << (TOKEN_VOCAB - 69)) | (1L << (TOKEN_LABEL_TYPE - 69)))) != 0)) {
				{
				{
				setState(201);
				optionSpec();
				setState(202);
				match(SEMI);
				}
				}
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(209);
			match(RBRACE);
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

	public static class OptionSpecContext extends ParserRuleContext {
		public SuperClassSpecContext superClassSpec() {
			return getRuleContext(SuperClassSpecContext.class,0);
		}
		public LanguageSpecContext languageSpec() {
			return getRuleContext(LanguageSpecContext.class,0);
		}
		public TokenVocabSpecContext tokenVocabSpec() {
			return getRuleContext(TokenVocabSpecContext.class,0);
		}
		public TokenLabelTypeSpecContext tokenLabelTypeSpec() {
			return getRuleContext(TokenLabelTypeSpecContext.class,0);
		}
		public OptionSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).enterOptionSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).exitOptionSpec(this);
		}
	}

	public final OptionSpecContext optionSpec() throws RecognitionException {
		OptionSpecContext _localctx = new OptionSpecContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_optionSpec);
		try {
			setState(215);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUPER_CLASS:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				superClassSpec();
				}
				break;
			case LANGUAGE:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				languageSpec();
				}
				break;
			case TOKEN_VOCAB:
				enterOuterAlt(_localctx, 3);
				{
				setState(213);
				tokenVocabSpec();
				}
				break;
			case TOKEN_LABEL_TYPE:
				enterOuterAlt(_localctx, 4);
				{
				setState(214);
				tokenLabelTypeSpec();
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

	public static class SuperClassSpecContext extends ParserRuleContext {
		public TerminalNode SUPER_CLASS() { return getToken(ANTLRv4Parser.SUPER_CLASS, 0); }
		public TerminalNode ASSIGN() { return getToken(ANTLRv4Parser.ASSIGN, 0); }
		public ClassIdentifierContext classIdentifier() {
			return getRuleContext(ClassIdentifierContext.class,0);
		}
		public SuperClassSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superClassSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).enterSuperClassSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).exitSuperClassSpec(this);
		}
	}

	public final SuperClassSpecContext superClassSpec() throws RecognitionException {
		SuperClassSpecContext _localctx = new SuperClassSpecContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_superClassSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(SUPER_CLASS);
			setState(218);
			match(ASSIGN);
			setState(219);
			classIdentifier();
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

	public static class LanguageSpecContext extends ParserRuleContext {
		public TerminalNode LANGUAGE() { return getToken(ANTLRv4Parser.LANGUAGE, 0); }
		public TerminalNode ASSIGN() { return getToken(ANTLRv4Parser.ASSIGN, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ANTLRv4Parser.STRING_LITERAL, 0); }
		public LanguageSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_languageSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).enterLanguageSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).exitLanguageSpec(this);
		}
	}

	public final LanguageSpecContext languageSpec() throws RecognitionException {
		LanguageSpecContext _localctx = new LanguageSpecContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_languageSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(LANGUAGE);
			setState(222);
			match(ASSIGN);
			setState(223);
			match(STRING_LITERAL);
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

	public static class TokenVocabSpecContext extends ParserRuleContext {
		public TerminalNode TOKEN_VOCAB() { return getToken(ANTLRv4Parser.TOKEN_VOCAB, 0); }
		public TerminalNode ASSIGN() { return getToken(ANTLRv4Parser.ASSIGN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TokenVocabSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tokenVocabSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).enterTokenVocabSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).exitTokenVocabSpec(this);
		}
	}

	public final TokenVocabSpecContext tokenVocabSpec() throws RecognitionException {
		TokenVocabSpecContext _localctx = new TokenVocabSpecContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_tokenVocabSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(TOKEN_VOCAB);
			setState(226);
			match(ASSIGN);
			setState(227);
			identifier();
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

	public static class TokenLabelTypeSpecContext extends ParserRuleContext {
		public TerminalNode TOKEN_LABEL_TYPE() { return getToken(ANTLRv4Parser.TOKEN_LABEL_TYPE, 0); }
		public TerminalNode ASSIGN() { return getToken(ANTLRv4Parser.ASSIGN, 0); }
		public ClassIdentifierContext classIdentifier() {
			return getRuleContext(ClassIdentifierContext.class,0);
		}
		public TokenLabelTypeSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tokenLabelTypeSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).enterTokenLabelTypeSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).exitTokenLabelTypeSpec(this);
		}
	}

	public final TokenLabelTypeSpecContext tokenLabelTypeSpec() throws RecognitionException {
		TokenLabelTypeSpecContext _localctx = new TokenLabelTypeSpecContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_tokenLabelTypeSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(TOKEN_LABEL_TYPE);
			setState(230);
			match(ASSIGN);
			setState(231);
			classIdentifier();
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

	public static class DelegateGrammarsContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(ANTLRv4Parser.IMPORT, 0); }
		public List<DelegateGrammarContext> delegateGrammar() {
			return getRuleContexts(DelegateGrammarContext.class);
		}
		public DelegateGrammarContext delegateGrammar(int i) {
			return getRuleContext(DelegateGrammarContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(ANTLRv4Parser.SEMI, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ANTLRv4Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ANTLRv4Parser.COMMA, i);
		}
		public DelegateGrammarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delegateGrammars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).enterDelegateGrammars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).exitDelegateGrammars(this);
		}
	}

	public final DelegateGrammarsContext delegateGrammars() throws RecognitionException {
		DelegateGrammarsContext _localctx = new DelegateGrammarsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_delegateGrammars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(IMPORT);
			setState(234);
			delegateGrammar();
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(235);
				match(COMMA);
				setState(236);
				delegateGrammar();
				}
				}
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(242);
			match(SEMI);
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

	public static class DelegateGrammarContext extends ParserRuleContext {
		public GrammarIdentifierContext grammarIdentifier() {
			return getRuleContext(GrammarIdentifierContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(ANTLRv4Parser.ASSIGN, 0); }
		public DelegateGrammarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delegateGrammar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).enterDelegateGrammar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).exitDelegateGrammar(this);
		}
	}

	public final DelegateGrammarContext delegateGrammar() throws RecognitionException {
		DelegateGrammarContext _localctx = new DelegateGrammarContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_delegateGrammar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(244);
				identifier();
				setState(245);
				match(ASSIGN);
				}
				break;
			}
			setState(249);
			grammarIdentifier();
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

	public static class GrammarIdentifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public GrammarIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grammarIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).enterGrammarIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).exitGrammarIdentifier(this);
		}
	}

	public final GrammarIdentifierContext grammarIdentifier() throws RecognitionException {
		GrammarIdentifierContext _localctx = new GrammarIdentifierContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_grammarIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			identifier();
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

	public static class TokensSpecContext extends ParserRuleContext {
		public TerminalNode TOKENS() { return getToken(ANTLRv4Parser.TOKENS, 0); }
		public TerminalNode LBRACE() { return getToken(ANTLRv4Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ANTLRv4Parser.RBRACE, 0); }
		public TokenListContext tokenList() {
			return getRuleContext(TokenListContext.class,0);
		}
		public TokensSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tokensSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).enterTokensSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).exitTokensSpec(this);
		}
	}

	public final TokensSpecContext tokensSpec() throws RecognitionException {
		TokensSpecContext _localctx = new TokensSpecContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tokensSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(TOKENS);
			setState(254);
			match(LBRACE);
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID_STARTING_WITH_UPPERCASE) {
				{
				setState(255);
				tokenList();
				}
			}

			setState(258);
			match(RBRACE);
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

	public static class TokenListContext extends ParserRuleContext {
		public List<TokenIdentifierContext> tokenIdentifier() {
			return getRuleContexts(TokenIdentifierContext.class);
		}
		public TokenIdentifierContext tokenIdentifier(int i) {
			return getRuleContext(TokenIdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ANTLRv4Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ANTLRv4Parser.COMMA, i);
		}
		public TokenListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tokenList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).enterTokenList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).exitTokenList(this);
		}
	}

	public final TokenListContext tokenList() throws RecognitionException {
		TokenListContext _localctx = new TokenListContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_tokenList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			tokenIdentifier();
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(261);
				match(COMMA);
				setState(262);
				tokenIdentifier();
				}
				}
				setState(267);
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

	public static class ChannelsSpecContext extends ParserRuleContext {
		public TerminalNode CHANNELS() { return getToken(ANTLRv4Parser.CHANNELS, 0); }
		public TerminalNode LBRACE() { return getToken(ANTLRv4Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ANTLRv4Parser.RBRACE, 0); }
		public IdListContext idList() {
			return getRuleContext(IdListContext.class,0);
		}
		public ChannelsSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_channelsSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).enterChannelsSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).exitChannelsSpec(this);
		}
	}

	public final ChannelsSpecContext channelsSpec() throws RecognitionException {
		ChannelsSpecContext _localctx = new ChannelsSpecContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_channelsSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(CHANNELS);
			setState(269);
			match(LBRACE);
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(270);
				idList();
				}
			}

			setState(273);
			match(RBRACE);
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

	public static class IdListContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ANTLRv4Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ANTLRv4Parser.COMMA, i);
		}
		public IdListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).enterIdList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).exitIdList(this);
		}
	}

	public final IdListContext idList() throws RecognitionException {
		IdListContext _localctx = new IdListContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_idList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			identifier();
			setState(280);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(276);
					match(COMMA);
					setState(277);
					identifier();
					}
					} 
				}
				setState(282);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(283);
				match(COMMA);
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

	public static class ActionContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(ANTLRv4Parser.AT, 0); }
		public ActionScopeContext actionScope() {
			return getRuleContext(ActionScopeContext.class,0);
		}
		public ActionBlockContext actionBlock() {
			return getRuleContext(ActionBlockContext.class,0);
		}
		public ActionDestinationContext actionDestination() {
			return getRuleContext(ActionDestinationContext.class,0);
		}
		public TerminalNode COLONCOLON() { return getToken(ANTLRv4Parser.COLONCOLON, 0); }
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).enterAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).exitAction(this);
		}
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_action);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(AT);
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEXER || _la==PARSER) {
				{
				setState(287);
				actionDestination();
				setState(288);
				match(COLONCOLON);
				}
			}

			setState(292);
			actionScope();
			setState(293);
			actionBlock();
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

	public static class ActionDestinationContext extends ParserRuleContext {
		public TerminalNode LEXER() { return getToken(ANTLRv4Parser.LEXER, 0); }
		public TerminalNode PARSER() { return getToken(ANTLRv4Parser.PARSER, 0); }
		public ActionDestinationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actionDestination; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).enterActionDestination(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).exitActionDestination(this);
		}
	}

	public final ActionDestinationContext actionDestination() throws RecognitionException {
		ActionDestinationContext _localctx = new ActionDestinationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_actionDestination);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			_la = _input.LA(1);
			if ( !(_la==LEXER || _la==PARSER) ) {
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

	public static class ActionScopeContext extends ParserRuleContext {
		public TerminalNode HEADER() { return getToken(ANTLRv4Parser.HEADER, 0); }
		public TerminalNode MEMBERS() { return getToken(ANTLRv4Parser.MEMBERS, 0); }
		public ActionScopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actionScope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).enterActionScope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).exitActionScope(this);
		}
	}

	public final ActionScopeContext actionScope() throws RecognitionException {
		ActionScopeContext _localctx = new ActionScopeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_actionScope);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			_la = _input.LA(1);
			if ( !(_la==HEADER || _la==MEMBERS) ) {
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

	public static class ActionBlockContext extends ParserRuleContext {
		public TerminalNode BEGIN_ACTION() { return getToken(ANTLRv4Parser.BEGIN_ACTION, 0); }
		public TerminalNode END_ACTION() { return getToken(ANTLRv4Parser.END_ACTION, 0); }
		public List<TerminalNode> ACTION_CONTENT() { return getTokens(ANTLRv4Parser.ACTION_CONTENT); }
		public TerminalNode ACTION_CONTENT(int i) {
			return getToken(ANTLRv4Parser.ACTION_CONTENT, i);
		}
		public ActionBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actionBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).enterActionBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).exitActionBlock(this);
		}
	}

	public final ActionBlockContext actionBlock() throws RecognitionException {
		ActionBlockContext _localctx = new ActionBlockContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_actionBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(BEGIN_ACTION);
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ACTION_CONTENT) {
				{
				{
				setState(300);
				match(ACTION_CONTENT);
				}
				}
				setState(305);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(306);
			match(END_ACTION);
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

	public static class ModeSpecContext extends ParserRuleContext {
		public TerminalNode MODE() { return getToken(ANTLRv4Parser.MODE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ANTLRv4Parser.SEMI, 0); }
		public List<LexerRuleSpecContext> lexerRuleSpec() {
			return getRuleContexts(LexerRuleSpecContext.class);
		}
		public LexerRuleSpecContext lexerRuleSpec(int i) {
			return getRuleContext(LexerRuleSpecContext.class,i);
		}
		public ModeSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modeSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).enterModeSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).exitModeSpec(this);
		}
	}

	public final ModeSpecContext modeSpec() throws RecognitionException {
		ModeSpecContext _localctx = new ModeSpecContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_modeSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(MODE);
			setState(309);
			identifier();
			setState(310);
			match(SEMI);
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID_STARTING_WITH_UPPERCASE) | (1L << DOC_COMMENT) | (1L << FRAGMENT))) != 0)) {
				{
				{
				setState(311);
				lexerRuleSpec();
				}
				}
				setState(316);
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

	public static class RuleSpecContext extends ParserRuleContext {
		public ParserRuleSpecContext parserRuleSpec() {
			return getRuleContext(ParserRuleSpecContext.class,0);
		}
		public LexerRuleSpecContext lexerRuleSpec() {
			return getRuleContext(LexerRuleSpecContext.class,0);
		}
		public RuleSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).enterRuleSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).exitRuleSpec(this);
		}
	}

	public final RuleSpecContext ruleSpec() throws RecognitionException {
		RuleSpecContext _localctx = new RuleSpecContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_ruleSpec);
		try {
			setState(319);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(317);
				parserRuleSpec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(318);
				lexerRuleSpec();
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

	public static class ParserRuleSpecContext extends ParserRuleContext {
		public ParserRuleDeclarationContext parserRuleDeclaration() {
			return getRuleContext(ParserRuleDeclarationContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ANTLRv4Parser.COLON, 0); }
		public ParserRuleDefinitionContext parserRuleDefinition() {
			return getRuleContext(ParserRuleDefinitionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ANTLRv4Parser.SEMI, 0); }
		public ExceptionGroupContext exceptionGroup() {
			return getRuleContext(ExceptionGroupContext.class,0);
		}
		public List<TerminalNode> DOC_COMMENT() { return getTokens(ANTLRv4Parser.DOC_COMMENT); }
		public TerminalNode DOC_COMMENT(int i) {
			return getToken(ANTLRv4Parser.DOC_COMMENT, i);
		}
		public ParserRuleSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parserRuleSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).enterParserRuleSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).exitParserRuleSpec(this);
		}
	}

	public final ParserRuleSpecContext parserRuleSpec() throws RecognitionException {
		ParserRuleSpecContext _localctx = new ParserRuleSpecContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_parserRuleSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOC_COMMENT) {
				{
				{
				setState(321);
				match(DOC_COMMENT);
				}
				}
				setState(326);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(327);
			parserRuleDeclaration();
			setState(328);
			match(COLON);
			setState(329);
			parserRuleDefinition();
			setState(330);
			match(SEMI);
			setState(331);
			exceptionGroup();
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

	public static class ParserRuleDeclarationContext extends ParserRuleContext {
		public ParserRuleIdentifierContext parserRuleIdentifier() {
			return getRuleContext(ParserRuleIdentifierContext.class,0);
		}
		public ParserRuleVisibilityContext parserRuleVisibility() {
			return getRuleContext(ParserRuleVisibilityContext.class,0);
		}
		public ActionBlockArgumentsContext actionBlockArguments() {
			return getRuleContext(ActionBlockArgumentsContext.class,0);
		}
		public ParserRuleReturnsContext parserRuleReturns() {
			return getRuleContext(ParserRuleReturnsContext.class,0);
		}
		public ThrowsSpecContext throwsSpec() {
			return getRuleContext(ThrowsSpecContext.class,0);
		}
		public LocalsSpecContext localsSpec() {
			return getRuleContext(LocalsSpecContext.class,0);
		}
		public List<ParserRulePrequelContext> parserRulePrequel() {
			return getRuleContexts(ParserRulePrequelContext.class);
		}
		public ParserRulePrequelContext parserRulePrequel(int i) {
			return getRuleContext(ParserRulePrequelContext.class,i);
		}
		public ParserRuleDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parserRuleDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).enterParserRuleDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).exitParserRuleDeclaration(this);
		}
	}

	public final ParserRuleDeclarationContext parserRuleDeclaration() throws RecognitionException {
		ParserRuleDeclarationContext _localctx = new ParserRuleDeclarationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_parserRuleDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PROTECTED) | (1L << PUBLIC) | (1L << PRIVATE))) != 0)) {
				{
				setState(333);
				parserRuleVisibility();
				}
			}

			setState(336);
			parserRuleIdentifier();
			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BEGIN_ARGUMENT) {
				{
				setState(337);
				actionBlockArguments();
				}
			}

			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURNS) {
				{
				setState(340);
				parserRuleReturns();
				}
			}

			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(343);
				throwsSpec();
				}
			}

			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOCALS) {
				{
				setState(346);
				localsSpec();
				}
			}

			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPTIONS || _la==AT) {
				{
				{
				setState(349);
				parserRulePrequel();
				}
				}
				setState(354);
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

	public static class ExceptionGroupContext extends ParserRuleContext {
		public List<ExceptionHandlerContext> exceptionHandler() {
			return getRuleContexts(ExceptionHandlerContext.class);
		}
		public ExceptionHandlerContext exceptionHandler(int i) {
			return getRuleContext(ExceptionHandlerContext.class,i);
		}
		public FinallyClauseContext finallyClause() {
			return getRuleContext(FinallyClauseContext.class,0);
		}
		public ExceptionGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).enterExceptionGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).exitExceptionGroup(this);
		}
	}

	public final ExceptionGroupContext exceptionGroup() throws RecognitionException {
		ExceptionGroupContext _localctx = new ExceptionGroupContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_exceptionGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CATCH) {
				{
				{
				setState(355);
				exceptionHandler();
				}
				}
				setState(360);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINALLY) {
				{
				setState(361);
				finallyClause();
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

	public static class ExceptionHandlerContext extends ParserRuleContext {
		public TerminalNode CATCH() { return getToken(ANTLRv4Parser.CATCH, 0); }
		public ActionBlockArgumentsContext actionBlockArguments() {
			return getRuleContext(ActionBlockArgumentsContext.class,0);
		}
		public ActionBlockContext actionBlock() {
			return getRuleContext(ActionBlockContext.class,0);
		}
		public ExceptionHandlerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionHandler; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).enterExceptionHandler(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).exitExceptionHandler(this);
		}
	}

	public final ExceptionHandlerContext exceptionHandler() throws RecognitionException {
		ExceptionHandlerContext _localctx = new ExceptionHandlerContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_exceptionHandler);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			match(CATCH);
			setState(365);
			actionBlockArguments();
			setState(366);
			actionBlock();
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

	public static class FinallyClauseContext extends ParserRuleContext {
		public TerminalNode FINALLY() { return getToken(ANTLRv4Parser.FINALLY, 0); }
		public ActionBlockContext actionBlock() {
			return getRuleContext(ActionBlockContext.class,0);
		}
		public FinallyClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finallyClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).enterFinallyClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).exitFinallyClause(this);
		}
	}

	public final FinallyClauseContext finallyClause() throws RecognitionException {
		FinallyClauseContext _localctx = new FinallyClauseContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_finallyClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			match(FINALLY);
			setState(369);
			actionBlock();
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

	public static class ParserRulePrequelContext extends ParserRuleContext {
		public OptionsSpecContext optionsSpec() {
			return getRuleContext(OptionsSpecContext.class,0);
		}
		public RuleActionContext ruleAction() {
			return getRuleContext(RuleActionContext.class,0);
		}
		public ParserRulePrequelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parserRulePrequel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).enterParserRulePrequel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).exitParserRulePrequel(this);
		}
	}

	public final ParserRulePrequelContext parserRulePrequel() throws RecognitionException {
		ParserRulePrequelContext _localctx = new ParserRulePrequelContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_parserRulePrequel);
		try {
			setState(373);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPTIONS:
				enterOuterAlt(_localctx, 1);
				{
				setState(371);
				optionsSpec();
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(372);
				ruleAction();
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

	public static class ParserRuleReturnsContext extends ParserRuleContext {
		public TerminalNode RETURNS() { return getToken(ANTLRv4Parser.RETURNS, 0); }
		public ActionBlockArgumentsContext actionBlockArguments() {
			return getRuleContext(ActionBlockArgumentsContext.class,0);
		}
		public ParserRuleReturnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parserRuleReturns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).enterParserRuleReturns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).exitParserRuleReturns(this);
		}
	}

	public final ParserRuleReturnsContext parserRuleReturns() throws RecognitionException {
		ParserRuleReturnsContext _localctx = new ParserRuleReturnsContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_parserRuleReturns);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			match(RETURNS);
			setState(376);
			actionBlockArguments();
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

	public static class ThrowsSpecContext extends ParserRuleContext {
		public TerminalNode THROWS() { return getToken(ANTLRv4Parser.THROWS, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ANTLRv4Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ANTLRv4Parser.COMMA, i);
		}
		public ThrowsSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwsSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).enterThrowsSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).exitThrowsSpec(this);
		}
	}

	public final ThrowsSpecContext throwsSpec() throws RecognitionException {
		ThrowsSpecContext _localctx = new ThrowsSpecContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_throwsSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			match(THROWS);
			setState(379);
			identifier();
			setState(384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(380);
				match(COMMA);
				setState(381);
				identifier();
				}
				}
				setState(386);
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

	public static class LocalsSpecContext extends ParserRuleContext {
		public TerminalNode LOCALS() { return getToken(ANTLRv4Parser.LOCALS, 0); }
		public ActionBlockArgumentsContext actionBlockArguments() {
			return getRuleContext(ActionBlockArgumentsContext.class,0);
		}
		public LocalsSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localsSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).enterLocalsSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).exitLocalsSpec(this);
		}
	}

	public final LocalsSpecContext localsSpec() throws RecognitionException {
		LocalsSpecContext _localctx = new LocalsSpecContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_localsSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			match(LOCALS);
			setState(388);
			actionBlockArguments();
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

	public static class RuleActionContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(ANTLRv4Parser.AT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ActionBlockContext actionBlock() {
			return getRuleContext(ActionBlockContext.class,0);
		}
		public RuleActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).enterRuleAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).exitRuleAction(this);
		}
	}

	public final RuleActionContext ruleAction() throws RecognitionException {
		RuleActionContext _localctx = new RuleActionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_ruleAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			match(AT);
			setState(391);
			identifier();
			setState(392);
			actionBlock();
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

	public static class ParserRuleVisibilityContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(ANTLRv4Parser.PUBLIC, 0); }
		public TerminalNode PRIVATE() { return getToken(ANTLRv4Parser.PRIVATE, 0); }
		public TerminalNode PROTECTED() { return getToken(ANTLRv4Parser.PROTECTED, 0); }
		public ParserRuleVisibilityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parserRuleVisibility; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).enterParserRuleVisibility(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).exitParserRuleVisibility(this);
		}
	}

	public final ParserRuleVisibilityContext parserRuleVisibility() throws RecognitionException {
		ParserRuleVisibilityContext _localctx = new ParserRuleVisibilityContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_parserRuleVisibility);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PROTECTED) | (1L << PUBLIC) | (1L << PRIVATE))) != 0)) ) {
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

	public static class ParserRuleDefinitionContext extends ParserRuleContext {
		public List<ParserRuleLabeledAlternativeContext> parserRuleLabeledAlternative() {
			return getRuleContexts(ParserRuleLabeledAlternativeContext.class);
		}
		public ParserRuleLabeledAlternativeContext parserRuleLabeledAlternative(int i) {
			return getRuleContext(ParserRuleLabeledAlternativeContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(ANTLRv4Parser.OR); }
		public TerminalNode OR(int i) {
			return getToken(ANTLRv4Parser.OR, i);
		}
		public ParserRuleDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parserRuleDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).enterParserRuleDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).exitParserRuleDefinition(this);
		}
	}

	public final ParserRuleDefinitionContext parserRuleDefinition() throws RecognitionException {
		ParserRuleDefinitionContext _localctx = new ParserRuleDefinitionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_parserRuleDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			parserRuleLabeledAlternative();
			setState(401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(397);
				match(OR);
				setState(398);
				parserRuleLabeledAlternative();
				}
				}
				setState(403);
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

	public static class ParserRuleLabeledAlternativeContext extends ParserRuleContext {
		public ParserRuleAlternativeContext parserRuleAlternative() {
			return getRuleContext(ParserRuleAlternativeContext.class,0);
		}
		public TerminalNode SHARP() { return getToken(ANTLRv4Parser.SHARP, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ParserRuleLabeledAlternativeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parserRuleLabeledAlternative; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).enterParserRuleLabeledAlternative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).exitParserRuleLabeledAlternative(this);
		}
	}

	public final ParserRuleLabeledAlternativeContext parserRuleLabeledAlternative() throws RecognitionException {
		ParserRuleLabeledAlternativeContext _localctx = new ParserRuleLabeledAlternativeContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_parserRuleLabeledAlternative);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			parserRuleAlternative();
			setState(407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SHARP) {
				{
				setState(405);
				match(SHARP);
				setState(406);
				identifier();
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

	public static class AltListContext extends ParserRuleContext {
		public List<ParserRuleAlternativeContext> parserRuleAlternative() {
			return getRuleContexts(ParserRuleAlternativeContext.class);
		}
		public ParserRuleAlternativeContext parserRuleAlternative(int i) {
			return getRuleContext(ParserRuleAlternativeContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(ANTLRv4Parser.OR); }
		public TerminalNode OR(int i) {
			return getToken(ANTLRv4Parser.OR, i);
		}
		public AltListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_altList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).enterAltList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).exitAltList(this);
		}
	}

	public final AltListContext altList() throws RecognitionException {
		AltListContext _localctx = new AltListContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_altList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			parserRuleAlternative();
			setState(414);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(410);
				match(OR);
				setState(411);
				parserRuleAlternative();
				}
				}
				setState(416);
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

	public static class ParserRuleAlternativeContext extends ParserRuleContext {
		public ElementOptionsContext elementOptions() {
			return getRuleContext(ElementOptionsContext.class,0);
		}
		public List<ParserRuleElementContext> parserRuleElement() {
			return getRuleContexts(ParserRuleElementContext.class);
		}
		public ParserRuleElementContext parserRuleElement(int i) {
			return getRuleContext(ParserRuleElementContext.class,i);
		}
		public ParserRuleAlternativeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parserRuleAlternative; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).enterParserRuleAlternative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).exitParserRuleAlternative(this);
		}
	}

	public final ParserRuleAlternativeContext parserRuleAlternative() throws RecognitionException {
		ParserRuleAlternativeContext _localctx = new ParserRuleAlternativeContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_parserRuleAlternative);
		int _la;
		try {
			setState(426);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID_STARTING_WITH_UPPERCASE:
			case ID_STARTING_WITH_LOWERCASE:
			case STRING_LITERAL:
			case BEGIN_ACTION:
			case LPAREN:
			case LT:
			case DOT:
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(418);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(417);
					elementOptions();
					}
				}

				setState(421); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(420);
					parserRuleElement();
					}
					}
					setState(423); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID_STARTING_WITH_UPPERCASE) | (1L << ID_STARTING_WITH_LOWERCASE) | (1L << STRING_LITERAL) | (1L << BEGIN_ACTION) | (1L << LPAREN) | (1L << DOT) | (1L << NOT))) != 0) );
				}
				break;
			case SEMI:
			case RPAREN:
			case OR:
			case SHARP:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ParserRuleElementContext extends ParserRuleContext {
		public LabeledParserRuleElementContext labeledParserRuleElement() {
			return getRuleContext(LabeledParserRuleElementContext.class,0);
		}
		public EbnfSuffixContext ebnfSuffix() {
			return getRuleContext(EbnfSuffixContext.class,0);
		}
		public ParserRuleAtomContext parserRuleAtom() {
			return getRuleContext(ParserRuleAtomContext.class,0);
		}
		public EbnfContext ebnf() {
			return getRuleContext(EbnfContext.class,0);
		}
		public ActionBlockContext actionBlock() {
			return getRuleContext(ActionBlockContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(ANTLRv4Parser.QUESTION, 0); }
		public ParserRuleElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parserRuleElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).enterParserRuleElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).exitParserRuleElement(this);
		}
	}

	public final ParserRuleElementContext parserRuleElement() throws RecognitionException {
		ParserRuleElementContext _localctx = new ParserRuleElementContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_parserRuleElement);
		int _la;
		try {
			setState(442);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(428);
				labeledParserRuleElement();
				setState(430);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << QUESTION) | (1L << STAR) | (1L << PLUS))) != 0)) {
					{
					setState(429);
					ebnfSuffix();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(432);
				parserRuleAtom();
				setState(434);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << QUESTION) | (1L << STAR) | (1L << PLUS))) != 0)) {
					{
					setState(433);
					ebnfSuffix();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(436);
				ebnf();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(437);
				actionBlock();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(438);
				actionBlock();
				setState(440);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QUESTION) {
					{
					setState(439);
					match(QUESTION);
					}
				}

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

	public static class LabeledParserRuleElementContext extends ParserRuleContext {
		public RuleElementIdentifierContext ruleElementIdentifier() {
			return getRuleContext(RuleElementIdentifierContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(ANTLRv4Parser.ASSIGN, 0); }
		public TerminalNode PLUS_ASSIGN() { return getToken(ANTLRv4Parser.PLUS_ASSIGN, 0); }
		public ParserRuleAtomContext parserRuleAtom() {
			return getRuleContext(ParserRuleAtomContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LabeledParserRuleElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledParserRuleElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).enterLabeledParserRuleElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).exitLabeledParserRuleElement(this);
		}
	}

	public final LabeledParserRuleElementContext labeledParserRuleElement() throws RecognitionException {
		LabeledParserRuleElementContext _localctx = new LabeledParserRuleElementContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_labeledParserRuleElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			ruleElementIdentifier();
			setState(445);
			_la = _input.LA(1);
			if ( !(_la==ASSIGN || _la==PLUS_ASSIGN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(448);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID_STARTING_WITH_UPPERCASE:
			case ID_STARTING_WITH_LOWERCASE:
			case STRING_LITERAL:
			case DOT:
			case NOT:
				{
				setState(446);
				parserRuleAtom();
				}
				break;
			case LPAREN:
				{
				setState(447);
				block();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ParserRuleAtomContext extends ParserRuleContext {
		public CharacterRangeContext characterRange() {
			return getRuleContext(CharacterRangeContext.class,0);
		}
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public ParserRuleReferenceContext parserRuleReference() {
			return getRuleContext(ParserRuleReferenceContext.class,0);
		}
		public NotSetContext notSet() {
			return getRuleContext(NotSetContext.class,0);
		}
		public TerminalNode DOT() { return getToken(ANTLRv4Parser.DOT, 0); }
		public ElementOptionsContext elementOptions() {
			return getRuleContext(ElementOptionsContext.class,0);
		}
		public ParserRuleAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parserRuleAtom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).enterParserRuleAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).exitParserRuleAtom(this);
		}
	}

	public final ParserRuleAtomContext parserRuleAtom() throws RecognitionException {
		ParserRuleAtomContext _localctx = new ParserRuleAtomContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_parserRuleAtom);
		int _la;
		try {
			setState(458);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(450);
				characterRange();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(451);
				terminal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(452);
				parserRuleReference();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(453);
				notSet();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(454);
				match(DOT);
				setState(456);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(455);
					elementOptions();
					}
				}

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

	public static class ParserRuleReferenceContext extends ParserRuleContext {
		public ParserRuleIdentifierContext parserRuleIdentifier() {
			return getRuleContext(ParserRuleIdentifierContext.class,0);
		}
		public ActionBlockArgumentsContext actionBlockArguments() {
			return getRuleContext(ActionBlockArgumentsContext.class,0);
		}
		public ElementOptionsContext elementOptions() {
			return getRuleContext(ElementOptionsContext.class,0);
		}
		public ParserRuleReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parserRuleReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).enterParserRuleReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).exitParserRuleReference(this);
		}
	}

	public final ParserRuleReferenceContext parserRuleReference() throws RecognitionException {
		ParserRuleReferenceContext _localctx = new ParserRuleReferenceContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_parserRuleReference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			parserRuleIdentifier();
			setState(462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BEGIN_ARGUMENT) {
				{
				setState(461);
				actionBlockArguments();
				}
			}

			setState(465);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(464);
				elementOptions();
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

	public static class ActionBlockArgumentsContext extends ParserRuleContext {
		public TerminalNode BEGIN_ARGUMENT() { return getToken(ANTLRv4Parser.BEGIN_ARGUMENT, 0); }
		public TerminalNode END_ARGUMENT() { return getToken(ANTLRv4Parser.END_ARGUMENT, 0); }
		public List<TerminalNode> ARGUMENT_CONTENT() { return getTokens(ANTLRv4Parser.ARGUMENT_CONTENT); }
		public TerminalNode ARGUMENT_CONTENT(int i) {
			return getToken(ANTLRv4Parser.ARGUMENT_CONTENT, i);
		}
		public ActionBlockArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actionBlockArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).enterActionBlockArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).exitActionBlockArguments(this);
		}
	}

	public final ActionBlockArgumentsContext actionBlockArguments() throws RecognitionException {
		ActionBlockArgumentsContext _localctx = new ActionBlockArgumentsContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_actionBlockArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			match(BEGIN_ARGUMENT);
			setState(471);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ARGUMENT_CONTENT) {
				{
				{
				setState(468);
				match(ARGUMENT_CONTENT);
				}
				}
				setState(473);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(474);
			match(END_ARGUMENT);
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

	public static class LexerRuleSpecContext extends ParserRuleContext {
		public LexerRuleDeclarationContext lexerRuleDeclaration() {
			return getRuleContext(LexerRuleDeclarationContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ANTLRv4Parser.COLON, 0); }
		public LexerRuleBlockContext lexerRuleBlock() {
			return getRuleContext(LexerRuleBlockContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ANTLRv4Parser.SEMI, 0); }
		public List<TerminalNode> DOC_COMMENT() { return getTokens(ANTLRv4Parser.DOC_COMMENT); }
		public TerminalNode DOC_COMMENT(int i) {
			return getToken(ANTLRv4Parser.DOC_COMMENT, i);
		}
		public LexerRuleSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexerRuleSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).enterLexerRuleSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).exitLexerRuleSpec(this);
		}
	}

	public final LexerRuleSpecContext lexerRuleSpec() throws RecognitionException {
		LexerRuleSpecContext _localctx = new LexerRuleSpecContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_lexerRuleSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOC_COMMENT) {
				{
				{
				setState(476);
				match(DOC_COMMENT);
				}
				}
				setState(481);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(482);
			lexerRuleDeclaration();
			setState(483);
			match(COLON);
			setState(484);
			lexerRuleBlock();
			setState(485);
			match(SEMI);
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

	public static class LexerRuleDeclarationContext extends ParserRuleContext {
		public TokenRuleDeclarationContext tokenRuleDeclaration() {
			return getRuleContext(TokenRuleDeclarationContext.class,0);
		}
		public FragmentRuleDeclarationContext fragmentRuleDeclaration() {
			return getRuleContext(FragmentRuleDeclarationContext.class,0);
		}
		public LexerRuleDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexerRuleDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).enterLexerRuleDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).exitLexerRuleDeclaration(this);
		}
	}

	public final LexerRuleDeclarationContext lexerRuleDeclaration() throws RecognitionException {
		LexerRuleDeclarationContext _localctx = new LexerRuleDeclarationContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_lexerRuleDeclaration);
		try {
			setState(489);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID_STARTING_WITH_UPPERCASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(487);
				tokenRuleDeclaration();
				}
				break;
			case FRAGMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(488);
				fragmentRuleDeclaration();
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

	public static class TokenRuleDeclarationContext extends ParserRuleContext {
		public TokenIdentifierContext tokenIdentifier() {
			return getRuleContext(TokenIdentifierContext.class,0);
		}
		public TokenRuleDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tokenRuleDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).enterTokenRuleDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).exitTokenRuleDeclaration(this);
		}
	}

	public final TokenRuleDeclarationContext tokenRuleDeclaration() throws RecognitionException {
		TokenRuleDeclarationContext _localctx = new TokenRuleDeclarationContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_tokenRuleDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
			tokenIdentifier();
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

	public static class FragmentRuleDeclarationContext extends ParserRuleContext {
		public TerminalNode FRAGMENT() { return getToken(ANTLRv4Parser.FRAGMENT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FragmentRuleDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fragmentRuleDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).enterFragmentRuleDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).exitFragmentRuleDeclaration(this);
		}
	}

	public final FragmentRuleDeclarationContext fragmentRuleDeclaration() throws RecognitionException {
		FragmentRuleDeclarationContext _localctx = new FragmentRuleDeclarationContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_fragmentRuleDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			match(FRAGMENT);
			setState(494);
			identifier();
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

	public static class LexerRuleBlockContext extends ParserRuleContext {
		public List<LexerRuleAltContext> lexerRuleAlt() {
			return getRuleContexts(LexerRuleAltContext.class);
		}
		public LexerRuleAltContext lexerRuleAlt(int i) {
			return getRuleContext(LexerRuleAltContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(ANTLRv4Parser.OR); }
		public TerminalNode OR(int i) {
			return getToken(ANTLRv4Parser.OR, i);
		}
		public LexerRuleBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexerRuleBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).enterLexerRuleBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).exitLexerRuleBlock(this);
		}
	}

	public final LexerRuleBlockContext lexerRuleBlock() throws RecognitionException {
		LexerRuleBlockContext _localctx = new LexerRuleBlockContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_lexerRuleBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
			lexerRuleAlt();
			setState(501);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(497);
				match(OR);
				setState(498);
				lexerRuleAlt();
				}
				}
				setState(503);
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

	public static class LexerRuleAltContext extends ParserRuleContext {
		public LexerRuleElementsContext lexerRuleElements() {
			return getRuleContext(LexerRuleElementsContext.class,0);
		}
		public LexerCommandsContext lexerCommands() {
			return getRuleContext(LexerCommandsContext.class,0);
		}
		public LexerRuleAltContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexerRuleAlt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).enterLexerRuleAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).exitLexerRuleAlt(this);
		}
	}

	public final LexerRuleAltContext lexerRuleAlt() throws RecognitionException {
		LexerRuleAltContext _localctx = new LexerRuleAltContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_lexerRuleAlt);
		int _la;
		try {
			setState(509);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID_STARTING_WITH_UPPERCASE:
			case ID_STARTING_WITH_LOWERCASE:
			case LEXER_CHAR_SET:
			case STRING_LITERAL:
			case BEGIN_ACTION:
			case LPAREN:
			case DOT:
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(504);
				lexerRuleElements();
				setState(506);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RARROW) {
					{
					setState(505);
					lexerCommands();
					}
				}

				}
				break;
			case SEMI:
			case RPAREN:
			case OR:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class LexerRuleElementsContext extends ParserRuleContext {
		public List<LexerRuleElementContext> lexerRuleElement() {
			return getRuleContexts(LexerRuleElementContext.class);
		}
		public LexerRuleElementContext lexerRuleElement(int i) {
			return getRuleContext(LexerRuleElementContext.class,i);
		}
		public LexerRuleElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexerRuleElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).enterLexerRuleElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).exitLexerRuleElements(this);
		}
	}

	public final LexerRuleElementsContext lexerRuleElements() throws RecognitionException {
		LexerRuleElementsContext _localctx = new LexerRuleElementsContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_lexerRuleElements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(511);
				lexerRuleElement();
				}
				}
				setState(514); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID_STARTING_WITH_UPPERCASE) | (1L << ID_STARTING_WITH_LOWERCASE) | (1L << LEXER_CHAR_SET) | (1L << STRING_LITERAL) | (1L << BEGIN_ACTION) | (1L << LPAREN) | (1L << DOT) | (1L << NOT))) != 0) );
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

	public static class LexerRuleElementContext extends ParserRuleContext {
		public LabeledLexerRuleElementContext labeledLexerRuleElement() {
			return getRuleContext(LabeledLexerRuleElementContext.class,0);
		}
		public EbnfSuffixContext ebnfSuffix() {
			return getRuleContext(EbnfSuffixContext.class,0);
		}
		public LexerRuleAtomContext lexerRuleAtom() {
			return getRuleContext(LexerRuleAtomContext.class,0);
		}
		public LexerRuleElementBlockContext lexerRuleElementBlock() {
			return getRuleContext(LexerRuleElementBlockContext.class,0);
		}
		public ActionBlockContext actionBlock() {
			return getRuleContext(ActionBlockContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(ANTLRv4Parser.QUESTION, 0); }
		public LexerRuleElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexerRuleElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).enterLexerRuleElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).exitLexerRuleElement(this);
		}
	}

	public final LexerRuleElementContext lexerRuleElement() throws RecognitionException {
		LexerRuleElementContext _localctx = new LexerRuleElementContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_lexerRuleElement);
		int _la;
		try {
			setState(532);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(516);
				labeledLexerRuleElement();
				setState(518);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << QUESTION) | (1L << STAR) | (1L << PLUS))) != 0)) {
					{
					setState(517);
					ebnfSuffix();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(520);
				lexerRuleAtom();
				setState(522);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << QUESTION) | (1L << STAR) | (1L << PLUS))) != 0)) {
					{
					setState(521);
					ebnfSuffix();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(524);
				lexerRuleElementBlock();
				setState(526);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << QUESTION) | (1L << STAR) | (1L << PLUS))) != 0)) {
					{
					setState(525);
					ebnfSuffix();
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(528);
				actionBlock();
				setState(530);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QUESTION) {
					{
					setState(529);
					match(QUESTION);
					}
				}

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

	public static class LabeledLexerRuleElementContext extends ParserRuleContext {
		public RuleElementIdentifierContext ruleElementIdentifier() {
			return getRuleContext(RuleElementIdentifierContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(ANTLRv4Parser.ASSIGN, 0); }
		public TerminalNode PLUS_ASSIGN() { return getToken(ANTLRv4Parser.PLUS_ASSIGN, 0); }
		public LexerRuleAtomContext lexerRuleAtom() {
			return getRuleContext(LexerRuleAtomContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LabeledLexerRuleElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledLexerRuleElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).enterLabeledLexerRuleElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).exitLabeledLexerRuleElement(this);
		}
	}

	public final LabeledLexerRuleElementContext labeledLexerRuleElement() throws RecognitionException {
		LabeledLexerRuleElementContext _localctx = new LabeledLexerRuleElementContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_labeledLexerRuleElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			ruleElementIdentifier();
			setState(535);
			_la = _input.LA(1);
			if ( !(_la==ASSIGN || _la==PLUS_ASSIGN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(538);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID_STARTING_WITH_UPPERCASE:
			case LEXER_CHAR_SET:
			case STRING_LITERAL:
			case DOT:
			case NOT:
				{
				setState(536);
				lexerRuleAtom();
				}
				break;
			case LPAREN:
				{
				setState(537);
				block();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class LexerRuleElementBlockContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(ANTLRv4Parser.LPAREN, 0); }
		public LexerRuleBlockContext lexerRuleBlock() {
			return getRuleContext(LexerRuleBlockContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ANTLRv4Parser.RPAREN, 0); }
		public LexerRuleElementBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexerRuleElementBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).enterLexerRuleElementBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).exitLexerRuleElementBlock(this);
		}
	}

	public final LexerRuleElementBlockContext lexerRuleElementBlock() throws RecognitionException {
		LexerRuleElementBlockContext _localctx = new LexerRuleElementBlockContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_lexerRuleElementBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
			match(LPAREN);
			setState(541);
			lexerRuleBlock();
			setState(542);
			match(RPAREN);
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

	public static class LexerCommandsContext extends ParserRuleContext {
		public TerminalNode RARROW() { return getToken(ANTLRv4Parser.RARROW, 0); }
		public List<LexerCommandContext> lexerCommand() {
			return getRuleContexts(LexerCommandContext.class);
		}
		public LexerCommandContext lexerCommand(int i) {
			return getRuleContext(LexerCommandContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ANTLRv4Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ANTLRv4Parser.COMMA, i);
		}
		public LexerCommandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexerCommands; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).enterLexerCommands(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).exitLexerCommands(this);
		}
	}

	public final LexerCommandsContext lexerCommands() throws RecognitionException {
		LexerCommandsContext _localctx = new LexerCommandsContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_lexerCommands);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
			match(RARROW);
			setState(545);
			lexerCommand();
			setState(550);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(546);
				match(COMMA);
				setState(547);
				lexerCommand();
				}
				}
				setState(552);
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

	public static class LexerCommandContext extends ParserRuleContext {
		public TerminalNode SKIP_COMMAND() { return getToken(ANTLRv4Parser.SKIP_COMMAND, 0); }
		public TerminalNode MORE_COMMAND() { return getToken(ANTLRv4Parser.MORE_COMMAND, 0); }
		public TerminalNode TYPE_COMMAND() { return getToken(ANTLRv4Parser.TYPE_COMMAND, 0); }
		public TerminalNode LPAREN() { return getToken(ANTLRv4Parser.LPAREN, 0); }
		public LexerCommandExprContext lexerCommandExpr() {
			return getRuleContext(LexerCommandExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ANTLRv4Parser.RPAREN, 0); }
		public TerminalNode CHANNEL_COMMAND() { return getToken(ANTLRv4Parser.CHANNEL_COMMAND, 0); }
		public TerminalNode MODE_COMMAND() { return getToken(ANTLRv4Parser.MODE_COMMAND, 0); }
		public TerminalNode PUSHMODE_COMMAND() { return getToken(ANTLRv4Parser.PUSHMODE_COMMAND, 0); }
		public TerminalNode POPMODE_COMMAND() { return getToken(ANTLRv4Parser.POPMODE_COMMAND, 0); }
		public LexerCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexerCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).enterLexerCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).exitLexerCommand(this);
		}
	}

	public final LexerCommandContext lexerCommand() throws RecognitionException {
		LexerCommandContext _localctx = new LexerCommandContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_lexerCommand);
		try {
			setState(576);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SKIP_COMMAND:
				enterOuterAlt(_localctx, 1);
				{
				setState(553);
				match(SKIP_COMMAND);
				}
				break;
			case MORE_COMMAND:
				enterOuterAlt(_localctx, 2);
				{
				setState(554);
				match(MORE_COMMAND);
				}
				break;
			case TYPE_COMMAND:
				enterOuterAlt(_localctx, 3);
				{
				setState(555);
				match(TYPE_COMMAND);
				setState(556);
				match(LPAREN);
				setState(557);
				lexerCommandExpr();
				setState(558);
				match(RPAREN);
				}
				break;
			case CHANNEL_COMMAND:
				enterOuterAlt(_localctx, 4);
				{
				setState(560);
				match(CHANNEL_COMMAND);
				setState(561);
				match(LPAREN);
				setState(562);
				lexerCommandExpr();
				setState(563);
				match(RPAREN);
				}
				break;
			case MODE_COMMAND:
				enterOuterAlt(_localctx, 5);
				{
				setState(565);
				match(MODE_COMMAND);
				setState(566);
				match(LPAREN);
				setState(567);
				lexerCommandExpr();
				setState(568);
				match(RPAREN);
				}
				break;
			case PUSHMODE_COMMAND:
				enterOuterAlt(_localctx, 6);
				{
				setState(570);
				match(PUSHMODE_COMMAND);
				setState(571);
				match(LPAREN);
				setState(572);
				lexerCommandExpr();
				setState(573);
				match(RPAREN);
				}
				break;
			case POPMODE_COMMAND:
				enterOuterAlt(_localctx, 7);
				{
				setState(575);
				match(POPMODE_COMMAND);
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

	public static class LexerCommandExprContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode INT() { return getToken(ANTLRv4Parser.INT, 0); }
		public LexerCommandExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexerCommandExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).enterLexerCommandExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).exitLexerCommandExpr(this);
		}
	}

	public final LexerCommandExprContext lexerCommandExpr() throws RecognitionException {
		LexerCommandExprContext _localctx = new LexerCommandExprContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_lexerCommandExpr);
		try {
			setState(580);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(578);
				identifier();
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(579);
				match(INT);
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

	public static class LexerRuleAtomContext extends ParserRuleContext {
		public CharacterRangeContext characterRange() {
			return getRuleContext(CharacterRangeContext.class,0);
		}
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public NotSetContext notSet() {
			return getRuleContext(NotSetContext.class,0);
		}
		public TerminalNode LEXER_CHAR_SET() { return getToken(ANTLRv4Parser.LEXER_CHAR_SET, 0); }
		public TerminalNode DOT() { return getToken(ANTLRv4Parser.DOT, 0); }
		public ElementOptionsContext elementOptions() {
			return getRuleContext(ElementOptionsContext.class,0);
		}
		public LexerRuleAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexerRuleAtom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).enterLexerRuleAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).exitLexerRuleAtom(this);
		}
	}

	public final LexerRuleAtomContext lexerRuleAtom() throws RecognitionException {
		LexerRuleAtomContext _localctx = new LexerRuleAtomContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_lexerRuleAtom);
		int _la;
		try {
			setState(590);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(582);
				characterRange();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(583);
				terminal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(584);
				notSet();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(585);
				match(LEXER_CHAR_SET);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(586);
				match(DOT);
				setState(588);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(587);
					elementOptions();
					}
				}

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

	public static class EbnfContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BlockSuffixContext blockSuffix() {
			return getRuleContext(BlockSuffixContext.class,0);
		}
		public EbnfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ebnf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).enterEbnf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).exitEbnf(this);
		}
	}

	public final EbnfContext ebnf() throws RecognitionException {
		EbnfContext _localctx = new EbnfContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_ebnf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(592);
			block();
			setState(594);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << QUESTION) | (1L << STAR) | (1L << PLUS))) != 0)) {
				{
				setState(593);
				blockSuffix();
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

	public static class BlockSuffixContext extends ParserRuleContext {
		public EbnfSuffixContext ebnfSuffix() {
			return getRuleContext(EbnfSuffixContext.class,0);
		}
		public BlockSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).enterBlockSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).exitBlockSuffix(this);
		}
	}

	public final BlockSuffixContext blockSuffix() throws RecognitionException {
		BlockSuffixContext _localctx = new BlockSuffixContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_blockSuffix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(596);
			ebnfSuffix();
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

	public static class EbnfSuffixContext extends ParserRuleContext {
		public List<TerminalNode> QUESTION() { return getTokens(ANTLRv4Parser.QUESTION); }
		public TerminalNode QUESTION(int i) {
			return getToken(ANTLRv4Parser.QUESTION, i);
		}
		public TerminalNode STAR() { return getToken(ANTLRv4Parser.STAR, 0); }
		public TerminalNode PLUS() { return getToken(ANTLRv4Parser.PLUS, 0); }
		public EbnfSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ebnfSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).enterEbnfSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).exitEbnfSuffix(this);
		}
	}

	public final EbnfSuffixContext ebnfSuffix() throws RecognitionException {
		EbnfSuffixContext _localctx = new EbnfSuffixContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_ebnfSuffix);
		int _la;
		try {
			setState(610);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QUESTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(598);
				match(QUESTION);
				setState(600);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QUESTION) {
					{
					setState(599);
					match(QUESTION);
					}
				}

				}
				break;
			case STAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(602);
				match(STAR);
				setState(604);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QUESTION) {
					{
					setState(603);
					match(QUESTION);
					}
				}

				}
				break;
			case PLUS:
				enterOuterAlt(_localctx, 3);
				{
				setState(606);
				match(PLUS);
				setState(608);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QUESTION) {
					{
					setState(607);
					match(QUESTION);
					}
				}

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

	public static class NotSetContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(ANTLRv4Parser.NOT, 0); }
		public SetElementContext setElement() {
			return getRuleContext(SetElementContext.class,0);
		}
		public BlockSetContext blockSet() {
			return getRuleContext(BlockSetContext.class,0);
		}
		public NotSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).enterNotSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).exitNotSet(this);
		}
	}

	public final NotSetContext notSet() throws RecognitionException {
		NotSetContext _localctx = new NotSetContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_notSet);
		try {
			setState(616);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(612);
				match(NOT);
				setState(613);
				setElement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(614);
				match(NOT);
				setState(615);
				blockSet();
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

	public static class BlockSetContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(ANTLRv4Parser.LPAREN, 0); }
		public List<SetElementContext> setElement() {
			return getRuleContexts(SetElementContext.class);
		}
		public SetElementContext setElement(int i) {
			return getRuleContext(SetElementContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(ANTLRv4Parser.RPAREN, 0); }
		public List<TerminalNode> OR() { return getTokens(ANTLRv4Parser.OR); }
		public TerminalNode OR(int i) {
			return getToken(ANTLRv4Parser.OR, i);
		}
		public BlockSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).enterBlockSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).exitBlockSet(this);
		}
	}

	public final BlockSetContext blockSet() throws RecognitionException {
		BlockSetContext _localctx = new BlockSetContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_blockSet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(618);
			match(LPAREN);
			setState(619);
			setElement();
			setState(624);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(620);
				match(OR);
				setState(621);
				setElement();
				}
				}
				setState(626);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(627);
			match(RPAREN);
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

	public static class SetElementContext extends ParserRuleContext {
		public TokenIdentifierContext tokenIdentifier() {
			return getRuleContext(TokenIdentifierContext.class,0);
		}
		public ElementOptionsContext elementOptions() {
			return getRuleContext(ElementOptionsContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(ANTLRv4Parser.STRING_LITERAL, 0); }
		public CharacterRangeContext characterRange() {
			return getRuleContext(CharacterRangeContext.class,0);
		}
		public TerminalNode LEXER_CHAR_SET() { return getToken(ANTLRv4Parser.LEXER_CHAR_SET, 0); }
		public SetElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).enterSetElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).exitSetElement(this);
		}
	}

	public final SetElementContext setElement() throws RecognitionException {
		SetElementContext _localctx = new SetElementContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_setElement);
		int _la;
		try {
			setState(639);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(629);
				tokenIdentifier();
				setState(631);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(630);
					elementOptions();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(633);
				match(STRING_LITERAL);
				setState(635);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(634);
					elementOptions();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(637);
				characterRange();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(638);
				match(LEXER_CHAR_SET);
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(ANTLRv4Parser.LPAREN, 0); }
		public AltListContext altList() {
			return getRuleContext(AltListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ANTLRv4Parser.RPAREN, 0); }
		public TerminalNode COLON() { return getToken(ANTLRv4Parser.COLON, 0); }
		public OptionsSpecContext optionsSpec() {
			return getRuleContext(OptionsSpecContext.class,0);
		}
		public List<RuleActionContext> ruleAction() {
			return getRuleContexts(RuleActionContext.class);
		}
		public RuleActionContext ruleAction(int i) {
			return getRuleContext(RuleActionContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(641);
			match(LPAREN);
			setState(652);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPTIONS) | (1L << COLON) | (1L << AT))) != 0)) {
				{
				setState(643);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(642);
					optionsSpec();
					}
				}

				setState(648);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(645);
					ruleAction();
					}
					}
					setState(650);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(651);
				match(COLON);
				}
			}

			setState(654);
			altList();
			setState(655);
			match(RPAREN);
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

	public static class CharacterRangeContext extends ParserRuleContext {
		public List<TerminalNode> STRING_LITERAL() { return getTokens(ANTLRv4Parser.STRING_LITERAL); }
		public TerminalNode STRING_LITERAL(int i) {
			return getToken(ANTLRv4Parser.STRING_LITERAL, i);
		}
		public TerminalNode RANGE() { return getToken(ANTLRv4Parser.RANGE, 0); }
		public CharacterRangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_characterRange; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).enterCharacterRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).exitCharacterRange(this);
		}
	}

	public final CharacterRangeContext characterRange() throws RecognitionException {
		CharacterRangeContext _localctx = new CharacterRangeContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_characterRange);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(657);
			match(STRING_LITERAL);
			setState(658);
			match(RANGE);
			setState(659);
			match(STRING_LITERAL);
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

	public static class TerminalContext extends ParserRuleContext {
		public TokenIdentifierContext tokenIdentifier() {
			return getRuleContext(TokenIdentifierContext.class,0);
		}
		public ElementOptionsContext elementOptions() {
			return getRuleContext(ElementOptionsContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(ANTLRv4Parser.STRING_LITERAL, 0); }
		public TerminalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).enterTerminal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).exitTerminal(this);
		}
	}

	public final TerminalContext terminal() throws RecognitionException {
		TerminalContext _localctx = new TerminalContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_terminal);
		int _la;
		try {
			setState(669);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID_STARTING_WITH_UPPERCASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(661);
				tokenIdentifier();
				setState(663);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(662);
					elementOptions();
					}
				}

				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(665);
				match(STRING_LITERAL);
				setState(667);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(666);
					elementOptions();
					}
				}

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

	public static class ElementOptionsContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(ANTLRv4Parser.LT, 0); }
		public List<ElementOptionContext> elementOption() {
			return getRuleContexts(ElementOptionContext.class);
		}
		public ElementOptionContext elementOption(int i) {
			return getRuleContext(ElementOptionContext.class,i);
		}
		public TerminalNode GT() { return getToken(ANTLRv4Parser.GT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ANTLRv4Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ANTLRv4Parser.COMMA, i);
		}
		public ElementOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementOptions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).enterElementOptions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).exitElementOptions(this);
		}
	}

	public final ElementOptionsContext elementOptions() throws RecognitionException {
		ElementOptionsContext _localctx = new ElementOptionsContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_elementOptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(671);
			match(LT);
			setState(672);
			elementOption();
			setState(677);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(673);
				match(COMMA);
				setState(674);
				elementOption();
				}
				}
				setState(679);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(680);
			match(GT);
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

	public static class ElementOptionContext extends ParserRuleContext {
		public TokenOptionContext tokenOption() {
			return getRuleContext(TokenOptionContext.class,0);
		}
		public ElementOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementOption; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).enterElementOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).exitElementOption(this);
		}
	}

	public final ElementOptionContext elementOption() throws RecognitionException {
		ElementOptionContext _localctx = new ElementOptionContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_elementOption);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(682);
			tokenOption();
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

	public static class TokenOptionContext extends ParserRuleContext {
		public TerminalNode ASSOC() { return getToken(ANTLRv4Parser.ASSOC, 0); }
		public TerminalNode ASSIGN() { return getToken(ANTLRv4Parser.ASSIGN, 0); }
		public TerminalNode RIGHT() { return getToken(ANTLRv4Parser.RIGHT, 0); }
		public TerminalNode LEFT() { return getToken(ANTLRv4Parser.LEFT, 0); }
		public TerminalNode FAIL() { return getToken(ANTLRv4Parser.FAIL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ANTLRv4Parser.STRING_LITERAL, 0); }
		public ActionBlockContext actionBlock() {
			return getRuleContext(ActionBlockContext.class,0);
		}
		public TokenOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tokenOption; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).enterTokenOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).exitTokenOption(this);
		}
	}

	public final TokenOptionContext tokenOption() throws RecognitionException {
		TokenOptionContext _localctx = new TokenOptionContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_tokenOption);
		int _la;
		try {
			setState(693);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSOC:
				enterOuterAlt(_localctx, 1);
				{
				setState(684);
				match(ASSOC);
				setState(685);
				match(ASSIGN);
				setState(686);
				_la = _input.LA(1);
				if ( !(_la==RIGHT || _la==LEFT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case FAIL:
				enterOuterAlt(_localctx, 2);
				{
				setState(687);
				match(FAIL);
				setState(688);
				match(ASSIGN);
				setState(691);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRING_LITERAL:
					{
					setState(689);
					match(STRING_LITERAL);
					}
					break;
				case BEGIN_ACTION:
					{
					setState(690);
					actionBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ANTLRv4Parser.ID, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(695);
			match(ID);
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

	public static class RuleElementIdentifierContext extends ParserRuleContext {
		public TerminalNode ID_STARTING_WITH_UPPERCASE() { return getToken(ANTLRv4Parser.ID_STARTING_WITH_UPPERCASE, 0); }
		public TerminalNode ID_STARTING_WITH_LOWERCASE() { return getToken(ANTLRv4Parser.ID_STARTING_WITH_LOWERCASE, 0); }
		public RuleElementIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleElementIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).enterRuleElementIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).exitRuleElementIdentifier(this);
		}
	}

	public final RuleElementIdentifierContext ruleElementIdentifier() throws RecognitionException {
		RuleElementIdentifierContext _localctx = new RuleElementIdentifierContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_ruleElementIdentifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(697);
			_la = _input.LA(1);
			if ( !(_la==ID_STARTING_WITH_UPPERCASE || _la==ID_STARTING_WITH_LOWERCASE) ) {
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

	public static class ClassIdentifierContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(ANTLRv4Parser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(ANTLRv4Parser.DOT, i);
		}
		public ClassIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).enterClassIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).exitClassIdentifier(this);
		}
	}

	public final ClassIdentifierContext classIdentifier() throws RecognitionException {
		ClassIdentifierContext _localctx = new ClassIdentifierContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_classIdentifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(699);
			identifier();
			setState(704);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(700);
				match(DOT);
				setState(701);
				identifier();
				}
				}
				setState(706);
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

	public static class ParserRuleIdentifierContext extends ParserRuleContext {
		public TerminalNode ID_STARTING_WITH_LOWERCASE() { return getToken(ANTLRv4Parser.ID_STARTING_WITH_LOWERCASE, 0); }
		public ParserRuleIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parserRuleIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).enterParserRuleIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).exitParserRuleIdentifier(this);
		}
	}

	public final ParserRuleIdentifierContext parserRuleIdentifier() throws RecognitionException {
		ParserRuleIdentifierContext _localctx = new ParserRuleIdentifierContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_parserRuleIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(707);
			match(ID_STARTING_WITH_LOWERCASE);
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

	public static class TokenIdentifierContext extends ParserRuleContext {
		public TerminalNode ID_STARTING_WITH_UPPERCASE() { return getToken(ANTLRv4Parser.ID_STARTING_WITH_UPPERCASE, 0); }
		public TokenIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tokenIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).enterTokenIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv4Listener ) ((ANTLRv4Listener)listener).exitTokenIdentifier(this);
		}
	}

	public final TokenIdentifierContext tokenIdentifier() throws RecognitionException {
		TokenIdentifierContext _localctx = new TokenIdentifierContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_tokenIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(709);
			match(ID_STARTING_WITH_UPPERCASE);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\\\u02ca\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\3\2\3\2\7\2\u0099\n\2\f\2\16\2\u009c\13\2\3\2\7\2\u009f"+
		"\n\2\f\2\16\2\u00a2\13\2\3\2\7\2\u00a5\n\2\f\2\16\2\u00a8\13\2\3\2\3\2"+
		"\3\3\7\3\u00ad\n\3\f\3\16\3\u00b0\13\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\3\4\5\4\u00bb\n\4\3\5\7\5\u00be\n\5\f\5\16\5\u00c1\13\5\3\5\3\5\3\5\3"+
		"\5\3\5\5\5\u00c8\n\5\3\6\3\6\3\6\3\6\3\6\7\6\u00cf\n\6\f\6\16\6\u00d2"+
		"\13\6\3\6\3\6\3\7\3\7\3\7\3\7\5\7\u00da\n\7\3\b\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\7\f\u00f0\n"+
		"\f\f\f\16\f\u00f3\13\f\3\f\3\f\3\r\3\r\3\r\5\r\u00fa\n\r\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\17\5\17\u0103\n\17\3\17\3\17\3\20\3\20\3\20\7\20\u010a"+
		"\n\20\f\20\16\20\u010d\13\20\3\21\3\21\3\21\5\21\u0112\n\21\3\21\3\21"+
		"\3\22\3\22\3\22\7\22\u0119\n\22\f\22\16\22\u011c\13\22\3\22\5\22\u011f"+
		"\n\22\3\23\3\23\3\23\3\23\5\23\u0125\n\23\3\23\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\3\26\3\26\7\26\u0130\n\26\f\26\16\26\u0133\13\26\3\26\3\26\3\27"+
		"\3\27\3\27\3\27\7\27\u013b\n\27\f\27\16\27\u013e\13\27\3\30\3\30\5\30"+
		"\u0142\n\30\3\31\7\31\u0145\n\31\f\31\16\31\u0148\13\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\32\5\32\u0151\n\32\3\32\3\32\5\32\u0155\n\32\3\32\5"+
		"\32\u0158\n\32\3\32\5\32\u015b\n\32\3\32\5\32\u015e\n\32\3\32\7\32\u0161"+
		"\n\32\f\32\16\32\u0164\13\32\3\33\7\33\u0167\n\33\f\33\16\33\u016a\13"+
		"\33\3\33\5\33\u016d\n\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36"+
		"\5\36\u0178\n\36\3\37\3\37\3\37\3 \3 \3 \3 \7 \u0181\n \f \16 \u0184\13"+
		" \3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3$\3$\3$\7$\u0192\n$\f$\16$\u0195\13"+
		"$\3%\3%\3%\5%\u019a\n%\3&\3&\3&\7&\u019f\n&\f&\16&\u01a2\13&\3\'\5\'\u01a5"+
		"\n\'\3\'\6\'\u01a8\n\'\r\'\16\'\u01a9\3\'\5\'\u01ad\n\'\3(\3(\5(\u01b1"+
		"\n(\3(\3(\5(\u01b5\n(\3(\3(\3(\3(\5(\u01bb\n(\5(\u01bd\n(\3)\3)\3)\3)"+
		"\5)\u01c3\n)\3*\3*\3*\3*\3*\3*\5*\u01cb\n*\5*\u01cd\n*\3+\3+\5+\u01d1"+
		"\n+\3+\5+\u01d4\n+\3,\3,\7,\u01d8\n,\f,\16,\u01db\13,\3,\3,\3-\7-\u01e0"+
		"\n-\f-\16-\u01e3\13-\3-\3-\3-\3-\3-\3.\3.\5.\u01ec\n.\3/\3/\3\60\3\60"+
		"\3\60\3\61\3\61\3\61\7\61\u01f6\n\61\f\61\16\61\u01f9\13\61\3\62\3\62"+
		"\5\62\u01fd\n\62\3\62\5\62\u0200\n\62\3\63\6\63\u0203\n\63\r\63\16\63"+
		"\u0204\3\64\3\64\5\64\u0209\n\64\3\64\3\64\5\64\u020d\n\64\3\64\3\64\5"+
		"\64\u0211\n\64\3\64\3\64\5\64\u0215\n\64\5\64\u0217\n\64\3\65\3\65\3\65"+
		"\3\65\5\65\u021d\n\65\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\7\67\u0227"+
		"\n\67\f\67\16\67\u022a\13\67\38\38\38\38\38\38\38\38\38\38\38\38\38\3"+
		"8\38\38\38\38\38\38\38\38\38\58\u0243\n8\39\39\59\u0247\n9\3:\3:\3:\3"+
		":\3:\3:\5:\u024f\n:\5:\u0251\n:\3;\3;\5;\u0255\n;\3<\3<\3=\3=\5=\u025b"+
		"\n=\3=\3=\5=\u025f\n=\3=\3=\5=\u0263\n=\5=\u0265\n=\3>\3>\3>\3>\5>\u026b"+
		"\n>\3?\3?\3?\3?\7?\u0271\n?\f?\16?\u0274\13?\3?\3?\3@\3@\5@\u027a\n@\3"+
		"@\3@\5@\u027e\n@\3@\3@\5@\u0282\n@\3A\3A\5A\u0286\nA\3A\7A\u0289\nA\f"+
		"A\16A\u028c\13A\3A\5A\u028f\nA\3A\3A\3A\3B\3B\3B\3B\3C\3C\5C\u029a\nC"+
		"\3C\3C\5C\u029e\nC\5C\u02a0\nC\3D\3D\3D\3D\7D\u02a6\nD\fD\16D\u02a9\13"+
		"D\3D\3D\3E\3E\3F\3F\3F\3F\3F\3F\3F\5F\u02b6\nF\5F\u02b8\nF\3G\3G\3H\3"+
		"H\3I\3I\3I\7I\u02c1\nI\fI\16I\u02c4\13I\3J\3J\3K\3K\3K\2\2L\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\"+
		"^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090"+
		"\u0092\u0094\2\b\3\2\23\24\3\289\3\2\26\30\4\2..\61\61\3\2*+\3\2\3\4\2"+
		"\u02ec\2\u0096\3\2\2\2\4\u00ae\3\2\2\2\6\u00ba\3\2\2\2\b\u00bf\3\2\2\2"+
		"\n\u00c9\3\2\2\2\f\u00d9\3\2\2\2\16\u00db\3\2\2\2\20\u00df\3\2\2\2\22"+
		"\u00e3\3\2\2\2\24\u00e7\3\2\2\2\26\u00eb\3\2\2\2\30\u00f9\3\2\2\2\32\u00fd"+
		"\3\2\2\2\34\u00ff\3\2\2\2\36\u0106\3\2\2\2 \u010e\3\2\2\2\"\u0115\3\2"+
		"\2\2$\u0120\3\2\2\2&\u0129\3\2\2\2(\u012b\3\2\2\2*\u012d\3\2\2\2,\u0136"+
		"\3\2\2\2.\u0141\3\2\2\2\60\u0146\3\2\2\2\62\u0150\3\2\2\2\64\u0168\3\2"+
		"\2\2\66\u016e\3\2\2\28\u0172\3\2\2\2:\u0177\3\2\2\2<\u0179\3\2\2\2>\u017c"+
		"\3\2\2\2@\u0185\3\2\2\2B\u0188\3\2\2\2D\u018c\3\2\2\2F\u018e\3\2\2\2H"+
		"\u0196\3\2\2\2J\u019b\3\2\2\2L\u01ac\3\2\2\2N\u01bc\3\2\2\2P\u01be\3\2"+
		"\2\2R\u01cc\3\2\2\2T\u01ce\3\2\2\2V\u01d5\3\2\2\2X\u01e1\3\2\2\2Z\u01eb"+
		"\3\2\2\2\\\u01ed\3\2\2\2^\u01ef\3\2\2\2`\u01f2\3\2\2\2b\u01ff\3\2\2\2"+
		"d\u0202\3\2\2\2f\u0216\3\2\2\2h\u0218\3\2\2\2j\u021e\3\2\2\2l\u0222\3"+
		"\2\2\2n\u0242\3\2\2\2p\u0246\3\2\2\2r\u0250\3\2\2\2t\u0252\3\2\2\2v\u0256"+
		"\3\2\2\2x\u0264\3\2\2\2z\u026a\3\2\2\2|\u026c\3\2\2\2~\u0281\3\2\2\2\u0080"+
		"\u0283\3\2\2\2\u0082\u0293\3\2\2\2\u0084\u029f\3\2\2\2\u0086\u02a1\3\2"+
		"\2\2\u0088\u02ac\3\2\2\2\u008a\u02b7\3\2\2\2\u008c\u02b9\3\2\2\2\u008e"+
		"\u02bb\3\2\2\2\u0090\u02bd\3\2\2\2\u0092\u02c5\3\2\2\2\u0094\u02c7\3\2"+
		"\2\2\u0096\u009a\5\4\3\2\u0097\u0099\5\b\5\2\u0098\u0097\3\2\2\2\u0099"+
		"\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u00a0\3\2"+
		"\2\2\u009c\u009a\3\2\2\2\u009d\u009f\5.\30\2\u009e\u009d\3\2\2\2\u009f"+
		"\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a6\3\2"+
		"\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a5\5,\27\2\u00a4\u00a3\3\2\2\2\u00a5"+
		"\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a9\3\2"+
		"\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00aa\7\2\2\3\u00aa\3\3\2\2\2\u00ab\u00ad"+
		"\7\6\2\2\u00ac\u00ab\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae"+
		"\u00af\3\2\2\2\u00af\u00b1\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b2\5\6"+
		"\4\2\u00b2\u00b3\5\u008cG\2\u00b3\u00b4\7\"\2\2\u00b4\5\3\2\2\2\u00b5"+
		"\u00b6\7\23\2\2\u00b6\u00bb\7\25\2\2\u00b7\u00b8\7\24\2\2\u00b8\u00bb"+
		"\7\25\2\2\u00b9\u00bb\7\25\2\2\u00ba\u00b5\3\2\2\2\u00ba\u00b7\3\2\2\2"+
		"\u00ba\u00b9\3\2\2\2\u00bb\7\3\2\2\2\u00bc\u00be\7\6\2\2\u00bd\u00bc\3"+
		"\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0"+
		"\u00c7\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c8\5\n\6\2\u00c3\u00c8\5\26"+
		"\f\2\u00c4\u00c8\5\34\17\2\u00c5\u00c8\5 \21\2\u00c6\u00c8\5$\23\2\u00c7"+
		"\u00c2\3\2\2\2\u00c7\u00c3\3\2\2\2\u00c7\u00c4\3\2\2\2\u00c7\u00c5\3\2"+
		"\2\2\u00c7\u00c6\3\2\2\2\u00c8\t\3\2\2\2\u00c9\u00ca\7\16\2\2\u00ca\u00d0"+
		"\7%\2\2\u00cb\u00cc\5\f\7\2\u00cc\u00cd\7\"\2\2\u00cd\u00cf\3\2\2\2\u00ce"+
		"\u00cb\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2"+
		"\2\2\u00d1\u00d3\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d4\7&\2\2\u00d4"+
		"\13\3\2\2\2\u00d5\u00da\5\16\b\2\u00d6\u00da\5\20\t\2\u00d7\u00da\5\22"+
		"\n\2\u00d8\u00da\5\24\13\2\u00d9\u00d5\3\2\2\2\u00d9\u00d6\3\2\2\2\u00d9"+
		"\u00d7\3\2\2\2\u00d9\u00d8\3\2\2\2\u00da\r\3\2\2\2\u00db\u00dc\7G\2\2"+
		"\u00dc\u00dd\7.\2\2\u00dd\u00de\5\u0090I\2\u00de\17\3\2\2\2\u00df\u00e0"+
		"\7H\2\2\u00e0\u00e1\7.\2\2\u00e1\u00e2\7\n\2\2\u00e2\21\3\2\2\2\u00e3"+
		"\u00e4\7I\2\2\u00e4\u00e5\7.\2\2\u00e5\u00e6\5\u008cG\2\u00e6\23\3\2\2"+
		"\2\u00e7\u00e8\7J\2\2\u00e8\u00e9\7.\2\2\u00e9\u00ea\5\u0090I\2\u00ea"+
		"\25\3\2\2\2\u00eb\u00ec\7\21\2\2\u00ec\u00f1\5\30\r\2\u00ed\u00ee\7!\2"+
		"\2\u00ee\u00f0\5\30\r\2\u00ef\u00ed\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1"+
		"\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f4\3\2\2\2\u00f3\u00f1\3\2"+
		"\2\2\u00f4\u00f5\7\"\2\2\u00f5\27\3\2\2\2\u00f6\u00f7\5\u008cG\2\u00f7"+
		"\u00f8\7.\2\2\u00f8\u00fa\3\2\2\2\u00f9\u00f6\3\2\2\2\u00f9\u00fa\3\2"+
		"\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\5\32\16\2\u00fc\31\3\2\2\2\u00fd"+
		"\u00fe\5\u008cG\2\u00fe\33\3\2\2\2\u00ff\u0100\7\17\2\2\u0100\u0102\7"+
		"%\2\2\u0101\u0103\5\36\20\2\u0102\u0101\3\2\2\2\u0102\u0103\3\2\2\2\u0103"+
		"\u0104\3\2\2\2\u0104\u0105\7&\2\2\u0105\35\3\2\2\2\u0106\u010b\5\u0094"+
		"K\2\u0107\u0108\7!\2\2\u0108\u010a\5\u0094K\2\u0109\u0107\3\2\2\2\u010a"+
		"\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\37\3\2\2"+
		"\2\u010d\u010b\3\2\2\2\u010e\u010f\7\20\2\2\u010f\u0111\7%\2\2\u0110\u0112"+
		"\5\"\22\2\u0111\u0110\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0113\3\2\2\2"+
		"\u0113\u0114\7&\2\2\u0114!\3\2\2\2\u0115\u011a\5\u008cG\2\u0116\u0117"+
		"\7!\2\2\u0117\u0119\5\u008cG\2\u0118\u0116\3\2\2\2\u0119\u011c\3\2\2\2"+
		"\u011a\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a"+
		"\3\2\2\2\u011d\u011f\7!\2\2\u011e\u011d\3\2\2\2\u011e\u011f\3\2\2\2\u011f"+
		"#\3\2\2\2\u0120\u0124\7\67\2\2\u0121\u0122\5&\24\2\u0122\u0123\7 \2\2"+
		"\u0123\u0125\3\2\2\2\u0124\u0121\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0126"+
		"\3\2\2\2\u0126\u0127\5(\25\2\u0127\u0128\5*\26\2\u0128%\3\2\2\2\u0129"+
		"\u012a\t\2\2\2\u012a\'\3\2\2\2\u012b\u012c\t\3\2\2\u012c)\3\2\2\2\u012d"+
		"\u0131\7\r\2\2\u012e\u0130\7D\2\2\u012f\u012e\3\2\2\2\u0130\u0133\3\2"+
		"\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0134\3\2\2\2\u0133"+
		"\u0131\3\2\2\2\u0134\u0135\7B\2\2\u0135+\3\2\2\2\u0136\u0137\7\36\2\2"+
		"\u0137\u0138\5\u008cG\2\u0138\u013c\7\"\2\2\u0139\u013b\5X-\2\u013a\u0139"+
		"\3\2\2\2\u013b\u013e\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d"+
		"-\3\2\2\2\u013e\u013c\3\2\2\2\u013f\u0142\5\60\31\2\u0140\u0142\5X-\2"+
		"\u0141\u013f\3\2\2\2\u0141\u0140\3\2\2\2\u0142/\3\2\2\2\u0143\u0145\7"+
		"\6\2\2\u0144\u0143\3\2\2\2\u0145\u0148\3\2\2\2\u0146\u0144\3\2\2\2\u0146"+
		"\u0147\3\2\2\2\u0147\u0149\3\2\2\2\u0148\u0146\3\2\2\2\u0149\u014a\5\62"+
		"\32\2\u014a\u014b\7\37\2\2\u014b\u014c\5F$\2\u014c\u014d\7\"\2\2\u014d"+
		"\u014e\5\64\33\2\u014e\61\3\2\2\2\u014f\u0151\5D#\2\u0150\u014f\3\2\2"+
		"\2\u0150\u0151\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0154\5\u0092J\2\u0153"+
		"\u0155\5V,\2\u0154\u0153\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0157\3\2\2"+
		"\2\u0156\u0158\5<\37\2\u0157\u0156\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u015a"+
		"\3\2\2\2\u0159\u015b\5> \2\u015a\u0159\3\2\2\2\u015a\u015b\3\2\2\2\u015b"+
		"\u015d\3\2\2\2\u015c\u015e\5@!\2\u015d\u015c\3\2\2\2\u015d\u015e\3\2\2"+
		"\2\u015e\u0162\3\2\2\2\u015f\u0161\5:\36\2\u0160\u015f\3\2\2\2\u0161\u0164"+
		"\3\2\2\2\u0162\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163\63\3\2\2\2\u0164"+
		"\u0162\3\2\2\2\u0165\u0167\5\66\34\2\u0166\u0165\3\2\2\2\u0167\u016a\3"+
		"\2\2\2\u0168\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016c\3\2\2\2\u016a"+
		"\u0168\3\2\2\2\u016b\u016d\58\35\2\u016c\u016b\3\2\2\2\u016c\u016d\3\2"+
		"\2\2\u016d\65\3\2\2\2\u016e\u016f\7\34\2\2\u016f\u0170\5V,\2\u0170\u0171"+
		"\5*\26\2\u0171\67\3\2\2\2\u0172\u0173\7\35\2\2\u0173\u0174\5*\26\2\u0174"+
		"9\3\2\2\2\u0175\u0178\5\n\6\2\u0176\u0178\5B\"\2\u0177\u0175\3\2\2\2\u0177"+
		"\u0176\3\2\2\2\u0178;\3\2\2\2\u0179\u017a\7\31\2\2\u017a\u017b\5V,\2\u017b"+
		"=\3\2\2\2\u017c\u017d\7\33\2\2\u017d\u0182\5\u008cG\2\u017e\u017f\7!\2"+
		"\2\u017f\u0181\5\u008cG\2\u0180\u017e\3\2\2\2\u0181\u0184\3\2\2\2\u0182"+
		"\u0180\3\2\2\2\u0182\u0183\3\2\2\2\u0183?\3\2\2\2\u0184\u0182\3\2\2\2"+
		"\u0185\u0186\7\32\2\2\u0186\u0187\5V,\2\u0187A\3\2\2\2\u0188\u0189\7\67"+
		"\2\2\u0189\u018a\5\u008cG\2\u018a\u018b\5*\26\2\u018bC\3\2\2\2\u018c\u018d"+
		"\t\4\2\2\u018dE\3\2\2\2\u018e\u0193\5H%\2\u018f\u0190\7\63\2\2\u0190\u0192"+
		"\5H%\2\u0191\u018f\3\2\2\2\u0192\u0195\3\2\2\2\u0193\u0191\3\2\2\2\u0193"+
		"\u0194\3\2\2\2\u0194G\3\2\2\2\u0195\u0193\3\2\2\2\u0196\u0199\5L\'\2\u0197"+
		"\u0198\7:\2\2\u0198\u019a\5\u008cG\2\u0199\u0197\3\2\2\2\u0199\u019a\3"+
		"\2\2\2\u019aI\3\2\2\2\u019b\u01a0\5L\'\2\u019c\u019d\7\63\2\2\u019d\u019f"+
		"\5L\'\2\u019e\u019c\3\2\2\2\u019f\u01a2\3\2\2\2\u01a0\u019e\3\2\2\2\u01a0"+
		"\u01a1\3\2\2\2\u01a1K\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a3\u01a5\5\u0086"+
		"D\2\u01a4\u01a3\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a7\3\2\2\2\u01a6"+
		"\u01a8\5N(\2\u01a7\u01a6\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01a7\3\2\2"+
		"\2\u01a9\u01aa\3\2\2\2\u01aa\u01ad\3\2\2\2\u01ab\u01ad\3\2\2\2\u01ac\u01a4"+
		"\3\2\2\2\u01ac\u01ab\3\2\2\2\u01adM\3\2\2\2\u01ae\u01b0\5P)\2\u01af\u01b1"+
		"\5x=\2\u01b0\u01af\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01bd\3\2\2\2\u01b2"+
		"\u01b4\5R*\2\u01b3\u01b5\5x=\2\u01b4\u01b3\3\2\2\2\u01b4\u01b5\3\2\2\2"+
		"\u01b5\u01bd\3\2\2\2\u01b6\u01bd\5t;\2\u01b7\u01bd\5*\26\2\u01b8\u01ba"+
		"\5*\26\2\u01b9\u01bb\7/\2\2\u01ba\u01b9\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb"+
		"\u01bd\3\2\2\2\u01bc\u01ae\3\2\2\2\u01bc\u01b2\3\2\2\2\u01bc\u01b6\3\2"+
		"\2\2\u01bc\u01b7\3\2\2\2\u01bc\u01b8\3\2\2\2\u01bdO\3\2\2\2\u01be\u01bf"+
		"\5\u008eH\2\u01bf\u01c2\t\5\2\2\u01c0\u01c3\5R*\2\u01c1\u01c3\5\u0080"+
		"A\2\u01c2\u01c0\3\2\2\2\u01c2\u01c1\3\2\2\2\u01c3Q\3\2\2\2\u01c4\u01cd"+
		"\5\u0082B\2\u01c5\u01cd\5\u0084C\2\u01c6\u01cd\5T+\2\u01c7\u01cd\5z>\2"+
		"\u01c8\u01ca\7\66\2\2\u01c9\u01cb\5\u0086D\2\u01ca\u01c9\3\2\2\2\u01ca"+
		"\u01cb\3\2\2\2\u01cb\u01cd\3\2\2\2\u01cc\u01c4\3\2\2\2\u01cc\u01c5\3\2"+
		"\2\2\u01cc\u01c6\3\2\2\2\u01cc\u01c7\3\2\2\2\u01cc\u01c8\3\2\2\2\u01cd"+
		"S\3\2\2\2\u01ce\u01d0\5\u0092J\2\u01cf\u01d1\5V,\2\u01d0\u01cf\3\2\2\2"+
		"\u01d0\u01d1\3\2\2\2\u01d1\u01d3\3\2\2\2\u01d2\u01d4\5\u0086D\2\u01d3"+
		"\u01d2\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4U\3\2\2\2\u01d5\u01d9\7\f\2\2"+
		"\u01d6\u01d8\7A\2\2\u01d7\u01d6\3\2\2\2\u01d8\u01db\3\2\2\2\u01d9\u01d7"+
		"\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01dc\3\2\2\2\u01db\u01d9\3\2\2\2\u01dc"+
		"\u01dd\7?\2\2\u01ddW\3\2\2\2\u01de\u01e0\7\6\2\2\u01df\u01de\3\2\2\2\u01e0"+
		"\u01e3\3\2\2\2\u01e1\u01df\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e4\3\2"+
		"\2\2\u01e3\u01e1\3\2\2\2\u01e4\u01e5\5Z.\2\u01e5\u01e6\7\37\2\2\u01e6"+
		"\u01e7\5`\61\2\u01e7\u01e8\7\"\2\2\u01e8Y\3\2\2\2\u01e9\u01ec\5\\/\2\u01ea"+
		"\u01ec\5^\60\2\u01eb\u01e9\3\2\2\2\u01eb\u01ea\3\2\2\2\u01ec[\3\2\2\2"+
		"\u01ed\u01ee\5\u0094K\2\u01ee]\3\2\2\2\u01ef\u01f0\7\22\2\2\u01f0\u01f1"+
		"\5\u008cG\2\u01f1_\3\2\2\2\u01f2\u01f7\5b\62\2\u01f3\u01f4\7\63\2\2\u01f4"+
		"\u01f6\5b\62\2\u01f5\u01f3\3\2\2\2\u01f6\u01f9\3\2\2\2\u01f7\u01f5\3\2"+
		"\2\2\u01f7\u01f8\3\2\2\2\u01f8a\3\2\2\2\u01f9\u01f7\3\2\2\2\u01fa\u01fc"+
		"\5d\63\2\u01fb\u01fd\5l\67\2\u01fc\u01fb\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd"+
		"\u0200\3\2\2\2\u01fe\u0200\3\2\2\2\u01ff\u01fa\3\2\2\2\u01ff\u01fe\3\2"+
		"\2\2\u0200c\3\2\2\2\u0201\u0203\5f\64\2\u0202\u0201\3\2\2\2\u0203\u0204"+
		"\3\2\2\2\u0204\u0202\3\2\2\2\u0204\u0205\3\2\2\2\u0205e\3\2\2\2\u0206"+
		"\u0208\5h\65\2\u0207\u0209\5x=\2\u0208\u0207\3\2\2\2\u0208\u0209\3\2\2"+
		"\2\u0209\u0217\3\2\2\2\u020a\u020c\5r:\2\u020b\u020d\5x=\2\u020c\u020b"+
		"\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u0217\3\2\2\2\u020e\u0210\5j\66\2\u020f"+
		"\u0211\5x=\2\u0210\u020f\3\2\2\2\u0210\u0211\3\2\2\2\u0211\u0217\3\2\2"+
		"\2\u0212\u0214\5*\26\2\u0213\u0215\7/\2\2\u0214\u0213\3\2\2\2\u0214\u0215"+
		"\3\2\2\2\u0215\u0217\3\2\2\2\u0216\u0206\3\2\2\2\u0216\u020a\3\2\2\2\u0216"+
		"\u020e\3\2\2\2\u0216\u0212\3\2\2\2\u0217g\3\2\2\2\u0218\u0219\5\u008e"+
		"H\2\u0219\u021c\t\5\2\2\u021a\u021d\5r:\2\u021b\u021d\5\u0080A\2\u021c"+
		"\u021a\3\2\2\2\u021c\u021b\3\2\2\2\u021di\3\2\2\2\u021e\u021f\7#\2\2\u021f"+
		"\u0220\5`\61\2\u0220\u0221\7$\2\2\u0221k\3\2\2\2\u0222\u0223\7\'\2\2\u0223"+
		"\u0228\5n8\2\u0224\u0225\7!\2\2\u0225\u0227\5n8\2\u0226\u0224\3\2\2\2"+
		"\u0227\u022a\3\2\2\2\u0228\u0226\3\2\2\2\u0228\u0229\3\2\2\2\u0229m\3"+
		"\2\2\2\u022a\u0228\3\2\2\2\u022b\u0243\7T\2\2\u022c\u0243\7U\2\2\u022d"+
		"\u022e\7V\2\2\u022e\u022f\7#\2\2\u022f\u0230\5p9\2\u0230\u0231\7$\2\2"+
		"\u0231\u0243\3\2\2\2\u0232\u0233\7W\2\2\u0233\u0234\7#\2\2\u0234\u0235"+
		"\5p9\2\u0235\u0236\7$\2\2\u0236\u0243\3\2\2\2\u0237\u0238\7X\2\2\u0238"+
		"\u0239\7#\2\2\u0239\u023a\5p9\2\u023a\u023b\7$\2\2\u023b\u0243\3\2\2\2"+
		"\u023c\u023d\7Y\2\2\u023d\u023e\7#\2\2\u023e\u023f\5p9\2\u023f\u0240\7"+
		"$\2\2\u0240\u0243\3\2\2\2\u0241\u0243\7Z\2\2\u0242\u022b\3\2\2\2\u0242"+
		"\u022c\3\2\2\2\u0242\u022d\3\2\2\2\u0242\u0232\3\2\2\2\u0242\u0237\3\2"+
		"\2\2\u0242\u023c\3\2\2\2\u0242\u0241\3\2\2\2\u0243o\3\2\2\2\u0244\u0247"+
		"\5\u008cG\2\u0245\u0247\7\t\2\2\u0246\u0244\3\2\2\2\u0246\u0245\3\2\2"+
		"\2\u0247q\3\2\2\2\u0248\u0251\5\u0082B\2\u0249\u0251\5\u0084C\2\u024a"+
		"\u0251\5z>\2\u024b\u0251\7\5\2\2\u024c\u024e\7\66\2\2\u024d\u024f\5\u0086"+
		"D\2\u024e\u024d\3\2\2\2\u024e\u024f\3\2\2\2\u024f\u0251\3\2\2\2\u0250"+
		"\u0248\3\2\2\2\u0250\u0249\3\2\2\2\u0250\u024a\3\2\2\2\u0250\u024b\3\2"+
		"\2\2\u0250\u024c\3\2\2\2\u0251s\3\2\2\2\u0252\u0254\5\u0080A\2\u0253\u0255"+
		"\5v<\2\u0254\u0253\3\2\2\2\u0254\u0255\3\2\2\2\u0255u\3\2\2\2\u0256\u0257"+
		"\5x=\2\u0257w\3\2\2\2\u0258\u025a\7/\2\2\u0259\u025b\7/\2\2\u025a\u0259"+
		"\3\2\2\2\u025a\u025b\3\2\2\2\u025b\u0265\3\2\2\2\u025c\u025e\7\60\2\2"+
		"\u025d\u025f\7/\2\2\u025e\u025d\3\2\2\2\u025e\u025f\3\2\2\2\u025f\u0265"+
		"\3\2\2\2\u0260\u0262\7\62\2\2\u0261\u0263\7/\2\2\u0262\u0261\3\2\2\2\u0262"+
		"\u0263\3\2\2\2\u0263\u0265\3\2\2\2\u0264\u0258\3\2\2\2\u0264\u025c\3\2"+
		"\2\2\u0264\u0260\3\2\2\2\u0265y\3\2\2\2\u0266\u0267\7;\2\2\u0267\u026b"+
		"\5~@\2\u0268\u0269\7;\2\2\u0269\u026b\5|?\2\u026a\u0266\3\2\2\2\u026a"+
		"\u0268\3\2\2\2\u026b{\3\2\2\2\u026c\u026d\7#\2\2\u026d\u0272\5~@\2\u026e"+
		"\u026f\7\63\2\2\u026f\u0271\5~@\2\u0270\u026e\3\2\2\2\u0271\u0274\3\2"+
		"\2\2\u0272\u0270\3\2\2\2\u0272\u0273\3\2\2\2\u0273\u0275\3\2\2\2\u0274"+
		"\u0272\3\2\2\2\u0275\u0276\7$\2\2\u0276}\3\2\2\2\u0277\u0279\5\u0094K"+
		"\2\u0278\u027a\5\u0086D\2\u0279\u0278\3\2\2\2\u0279\u027a\3\2\2\2\u027a"+
		"\u0282\3\2\2\2\u027b\u027d\7\n\2\2\u027c\u027e\5\u0086D\2\u027d\u027c"+
		"\3\2\2\2\u027d\u027e\3\2\2\2\u027e\u0282\3\2\2\2\u027f\u0282\5\u0082B"+
		"\2\u0280\u0282\7\5\2\2\u0281\u0277\3\2\2\2\u0281\u027b\3\2\2\2\u0281\u027f"+
		"\3\2\2\2\u0281\u0280\3\2\2\2\u0282\177\3\2\2\2\u0283\u028e\7#\2\2\u0284"+
		"\u0286\5\n\6\2\u0285\u0284\3\2\2\2\u0285\u0286\3\2\2\2\u0286\u028a\3\2"+
		"\2\2\u0287\u0289\5B\"\2\u0288\u0287\3\2\2\2\u0289\u028c\3\2\2\2\u028a"+
		"\u0288\3\2\2\2\u028a\u028b\3\2\2\2\u028b\u028d\3\2\2\2\u028c\u028a\3\2"+
		"\2\2\u028d\u028f\7\37\2\2\u028e\u0285\3\2\2\2\u028e\u028f\3\2\2\2\u028f"+
		"\u0290\3\2\2\2\u0290\u0291\5J&\2\u0291\u0292\7$\2\2\u0292\u0081\3\2\2"+
		"\2\u0293\u0294\7\n\2\2\u0294\u0295\7\65\2\2\u0295\u0296\7\n\2\2\u0296"+
		"\u0083\3\2\2\2\u0297\u0299\5\u0094K\2\u0298\u029a\5\u0086D\2\u0299\u0298"+
		"\3\2\2\2\u0299\u029a\3\2\2\2\u029a\u02a0\3\2\2\2\u029b\u029d\7\n\2\2\u029c"+
		"\u029e\5\u0086D\2\u029d\u029c\3\2\2\2\u029d\u029e\3\2\2\2\u029e\u02a0"+
		"\3\2\2\2\u029f\u0297\3\2\2\2\u029f\u029b\3\2\2\2\u02a0\u0085\3\2\2\2\u02a1"+
		"\u02a2\7(\2\2\u02a2\u02a7\5\u0088E\2\u02a3\u02a4\7!\2\2\u02a4\u02a6\5"+
		"\u0088E\2\u02a5\u02a3\3\2\2\2\u02a6\u02a9\3\2\2\2\u02a7\u02a5\3\2\2\2"+
		"\u02a7\u02a8\3\2\2\2\u02a8\u02aa\3\2\2\2\u02a9\u02a7\3\2\2\2\u02aa\u02ab"+
		"\7-\2\2\u02ab\u0087\3\2\2\2\u02ac\u02ad\5\u008aF\2\u02ad\u0089\3\2\2\2"+
		"\u02ae\u02af\7)\2\2\u02af\u02b0\7.\2\2\u02b0\u02b8\t\6\2\2\u02b1\u02b2"+
		"\7,\2\2\u02b2\u02b5\7.\2\2\u02b3\u02b6\7\n\2\2\u02b4\u02b6\5*\26\2\u02b5"+
		"\u02b3\3\2\2\2\u02b5\u02b4\3\2\2\2\u02b6\u02b8\3\2\2\2\u02b7\u02ae\3\2"+
		"\2\2\u02b7\u02b1\3\2\2\2\u02b8\u008b\3\2\2\2\u02b9\u02ba\7<\2\2\u02ba"+
		"\u008d\3\2\2\2\u02bb\u02bc\t\7\2\2\u02bc\u008f\3\2\2\2\u02bd\u02c2\5\u008c"+
		"G\2\u02be\u02bf\7\66\2\2\u02bf\u02c1\5\u008cG\2\u02c0\u02be\3\2\2\2\u02c1"+
		"\u02c4\3\2\2\2\u02c2\u02c0\3\2\2\2\u02c2\u02c3\3\2\2\2\u02c3\u0091\3\2"+
		"\2\2\u02c4\u02c2\3\2\2\2\u02c5\u02c6\7\4\2\2\u02c6\u0093\3\2\2\2\u02c7"+
		"\u02c8\7\3\2\2\u02c8\u0095\3\2\2\2V\u009a\u00a0\u00a6\u00ae\u00ba\u00bf"+
		"\u00c7\u00d0\u00d9\u00f1\u00f9\u0102\u010b\u0111\u011a\u011e\u0124\u0131"+
		"\u013c\u0141\u0146\u0150\u0154\u0157\u015a\u015d\u0162\u0168\u016c\u0177"+
		"\u0182\u0193\u0199\u01a0\u01a4\u01a9\u01ac\u01b0\u01b4\u01ba\u01bc\u01c2"+
		"\u01ca\u01cc\u01d0\u01d3\u01d9\u01e1\u01eb\u01f7\u01fc\u01ff\u0204\u0208"+
		"\u020c\u0210\u0214\u0216\u021c\u0228\u0242\u0246\u024e\u0250\u0254\u025a"+
		"\u025e\u0262\u0264\u026a\u0272\u0279\u027d\u0281\u0285\u028a\u028e\u0299"+
		"\u029d\u029f\u02a7\u02b5\u02b7\u02c2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}