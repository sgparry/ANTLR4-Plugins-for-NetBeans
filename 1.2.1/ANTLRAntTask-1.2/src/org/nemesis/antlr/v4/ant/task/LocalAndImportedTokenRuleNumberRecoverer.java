/*  *** ORIGNAL SOURCE MISSING - REVERSE ENGINEERED ****
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
package org.nemesis.antlr.v4.ant.task;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.apache.tools.ant.BuildException;
import org.nemesis.antlr.v4.ant.task.depend.parser.impl.ANTLRv4Lexer;
import org.nemesis.antlr.v4.ant.task.depend.parser.impl.ANTLRv4Parser;
import org.nemesis.antlr.v4.ant.task.depend.parser.listener.TokenRuleNumberCollector;










public class LocalAndImportedTokenRuleNumberRecoverer {
    protected final String absoluteSrcDir;
    protected final String absoluteImportDir;
    protected final Path relativeGrammarFileDirPath;
    protected int importedTokenRuleNumber;
    protected final List<String> importedGrammars;
    
    public int getImportedTokenRuleNumber() {
        return importedTokenRuleNumber;
    }
    
    public boolean isAtLeastOneTokenRule() {
        return importedTokenRuleNumber != 0;
    }
    
    public List<String> getImportedGrammars() {
        return importedGrammars;
    }
    


    public LocalAndImportedTokenRuleNumberRecoverer(String absoluteSrcDir          , 
                                                    String absoluteImportDir       , 
                                                    Path relativeGrammarFileDirPath) {
        this.absoluteSrcDir = absoluteSrcDir;
        this.absoluteImportDir = absoluteImportDir;
        this.relativeGrammarFileDirPath = relativeGrammarFileDirPath;
        importedTokenRuleNumber = 0;
        importedGrammars = new ArrayList();
    }
    







    
    public void retrieveImportedTokenRuleNumber(Path grammarFilePath) {
        try (
            InputStream is = new FileInputStream(grammarFilePath.toFile())
        ) {
            CharStream input = CharStreams.fromStream(is);
            ANTLRv4Lexer lexer = new ANTLRv4Lexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            ANTLRv4Parser parser = new ANTLRv4Parser(tokens);
            TokenRuleNumberCollector trnc = new TokenRuleNumberCollector
                (absoluteSrcDir            , 
                 absoluteImportDir         ,
                 relativeGrammarFileDirPath);
            parser.addParseListener(trnc);
            parser.grammarFile();
            importedTokenRuleNumber += trnc.getTokenRuleNumber();


            ArrayList<String> importedGrammarFiles = trnc.getImportedGrammarFiles();
            if (!importedGrammarFiles.isEmpty()) {
                importedGrammars.addAll(importedGrammarFiles);
                Iterator<String> grammarFileIt = importedGrammarFiles.iterator();

                while (grammarFileIt.hasNext()) {
                    String importedGrammarFile = (String)grammarFileIt.next();
                    Path importedGrammarFilePath =
                            Paths.get(absoluteSrcDir, 
                                      relativeGrammarFileDirPath.toString(),
                                      importedGrammarFile );
                    if (Files.exists(importedGrammarFilePath, new LinkOption[0])) {
                        retrieveImportedTokenRuleNumber(importedGrammarFilePath);
                    } else {
                        importedGrammarFilePath = 
                                Paths.get(absoluteImportDir   , 
                                          importedGrammarFile );
                    }
                }
            }
        } catch (IOException ex) {
                throw new BuildException("LAI : Unable to read file " + grammarFilePath.toString());
        }
    }
}
