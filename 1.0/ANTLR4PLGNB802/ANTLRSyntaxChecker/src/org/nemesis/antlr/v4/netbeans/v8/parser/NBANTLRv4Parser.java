/*
BSD License

Copyright (c) 2016, Frédéric Yvon Vinet
All rights reserved.

Redistribution and use in source and binary forms, with or without
modification, are permitted provided that the following conditions are met:

* Redistributions of source code must retain the above copyright
  notice, this list of conditions and the following disclaimer.
* Redistributions in binary form must reproduce the above copyright
  notice, this list of conditions and the following disclaimer in the
  documentation and/or other materials provided with the distribution.
* The name of its author may not be used to endorse or promote products
  derived from this software without specific prior written permission.

THIS SOFTWARE IS PROVIDED BY THE AUTHOR ``AS IS'' AND ANY
EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
DISCLAIMED. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY DIRECT, INDIRECT,
INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT 
LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR 
PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF 
LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE
OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF 
ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/
package org.nemesis.antlr.v4.netbeans.v8.parser;

/**
 *
 * @author Frédéric Yvon Vinet
 */

import java.io.File;

import java.util.List;

import java.util.logging.Logger;

import javax.swing.event.ChangeListener;

import org.netbeans.modules.csl.spi.ParserResult;
import org.netbeans.modules.csl.api.Error;
import org.netbeans.modules.csl.api.Severity;

import org.netbeans.modules.parsing.api.Snapshot;
import org.netbeans.modules.parsing.api.Task;
import org.netbeans.modules.parsing.spi.Parser;
import org.netbeans.modules.parsing.spi.SourceModificationEvent;

import org.nemesis.antlr.v4.netbeans.v8.parser.error.semantic.ANTLRv4SemanticParser;
import org.nemesis.antlr.v4.netbeans.v8.parser.error.syntactic.ANTLRv4SyntacticErrorListener;
import org.nemesis.antlr.v4.netbeans.v8.parser.impl.ANTLRv4Lexer;

import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileUtil;

public class NBANTLRv4Parser extends Parser {
    private static final Logger LOG = Logger.getLogger("ANTLR plugin:semantic parser");
    
    private Snapshot             snapshot;
    private ANTLRv4Lexer         lexer;
    private ANTLRv4GrammarChecker grammarChecker;
    private ANTLRv4SyntacticErrorListener errorListener;
    private ParserResult                  result ;
    
    public ANTLRv4Lexer getLexer() {
        return lexer;
    }

    @Override
    public void parse
            (Snapshot                snapshot,
             Task                    task    ,
             SourceModificationEvent event   ) {
        this.snapshot = snapshot;
        String contentToBeParsed = snapshot.getText().toString();
        FileObject sourceFileObject = snapshot.getSource().getFileObject();
        File sourceFile = FileUtil.toFile(sourceFileObject) ;
        String sourceFilePath = sourceFile.getPath();
        
        grammarChecker = new ANTLRv4GrammarChecker();
        grammarChecker.check(contentToBeParsed, sourceFilePath);
        errorListener = grammarChecker.getSyntacticErrorListener();
        ANTLRv4SemanticParser semanticParser = grammarChecker.getSemanticParser();
        result = new ANTLRv4ParserResult (snapshot, errorListener, semanticParser);
    }

    @Override
    public Result getResult (Task task) {
        return result;
    }

    @Deprecated
    @Override
    public void cancel () {
    }

    @Override
    public void addChangeListener (ChangeListener changeListener) {
    }

    @Override
    public void removeChangeListener (ChangeListener changeListener) {
    }

 /**
  * Now ANTLRv4ParserResult cannot just inherit from Parser.Result.
  * It must inherit from ParserResult (CSL module) that inherits from 
  * Parser.Result.
  * As a result, we have to provide an implementation to a new method called
  * getDiagnostics().
  **/
    public static class ANTLRv4ParserResult extends ParserResult {
        private       boolean                       valid;
        private final ANTLRv4SyntacticErrorListener errorListener;
        private final ANTLRv4SemanticParser         semanticParser;

        ANTLRv4ParserResult
             (Snapshot                      snapshot      ,
              ANTLRv4SyntacticErrorListener errorListener ,
              ANTLRv4SemanticParser         semanticParser) {
            super (snapshot);
            this.errorListener = errorListener;
            this.semanticParser = semanticParser;
            this.valid = true;
        }

        @Override
        protected void invalidate () {
            valid = false;
        }
        
        @Override
        public List<? extends Error> getDiagnostics() {
            List<? extends Error> answer = errorListener.getParsingError();
            if (semanticParser != null)
                answer = semanticParser.getSemanticError();
            return answer;
        }
    }
}