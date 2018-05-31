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
package org.nemesis.antlr.v4.ant.task;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.tools.ant.BuildException;

class ANTLRCodeGenerator extends ANTLRTool {
    public ANTLRCodeGenerator(String  antlrLibrary,
                              String importdir    ,
                              String  antlrDestdir,
                              boolean listener    ,
                              boolean visitor     ,
                              String  codePackage ,
                              boolean atn         ) {
        super(antlrLibrary, importdir, antlrDestdir, listener, visitor, codePackage, atn);
    }


    public void generateCodeFor(GrammarFile grammarFile) throws TaskException {
        ArrayList<String> processParameters = new ArrayList();
        processParameters.add(JAVA_EXEC);
        processParameters.add("-cp");
        if (antlrLibrary.contains(" ")) {
            processParameters.add("\"" + antlrLibrary + "\"");
        } else
            processParameters.add(antlrLibrary);
        processParameters.add("org.antlr.v4.Tool");
     // We determine the relative directory of the grammar file
        Path absoluteGrammarFilePath = grammarFile.getPath();
        FileConverter fileConverter = FileConverter.getInstance();
        if (fileConverter == null)
            throw new TaskException("You forgot to initialize the file converter");
        Path relativeGrammarFilePath = fileConverter.convertIntoRelativeSrcPath(absoluteGrammarFilePath.toString());
        Path grammarRootDir = relativeGrammarFilePath.getParent();
//        System.out.println("ANTLRCodeGenerator: relative grammar file path = " + grammarRootDir);
        if (grammarRootDir != null) {
            Path outputPath = Paths.get(antlrDestdir, grammarRootDir.toString());
            processParameters.add("-o");
            processParameters.add(outputPath.toString());
        } else {
            processParameters.add("-o");
            processParameters.add(antlrDestdir);
        }
        if (importdir != null) {
            processParameters.add("-lib");
            processParameters.add(importdir);
        }
        if (!listener)
            processParameters.add("-no-listener");
        if (visitor)
            processParameters.add("-visitor");
        if (codePackage != null) {
            processParameters.add("-package");
            processParameters.add(codePackage);
        }
        if (atn)
            processParameters.add("-atn");
        String filePathName = grammarFile.getPath().toString();
        processParameters.add(filePathName);    

        ProcessBuilder pb = new ProcessBuilder(processParameters);
        try {
            Process p = pb.start();
            ANTLROutputRecoverer standardConsumer =
                                   new ANTLROutputRecoverer(p.getInputStream());
            standardConsumer.start();
            ANTLROutputRecoverer errorConsumer =
                                   new ANTLROutputRecoverer(p.getErrorStream());
            errorConsumer.start();
         // We wait for the end of code generation process
            int result = p.waitFor();
         // We wait for the end of standard input collecting thread collecting
         // standard output of code generation process
            standardConsumer.join();
            errorConsumer.join();
         // If the code generation does not end with success
            if (result != 0) {
                System.err.println("Error during ANTLR code generation:");
                System.err.println(adaptToAntStandardLogger(errorConsumer.getOutput(), grammarFile));
                throw new BuildException("antlr4 task end due to error");
            }
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new BuildException("Strange! IO problem when running ANTLR code generator");
        } catch (NullPointerException ex) {
            ex.printStackTrace();
            throw new BuildException("Strange! Null pointer problem when running ANTLR code generator");
        } catch (IndexOutOfBoundsException ex) {
            ex.printStackTrace();
            throw new BuildException("Strange! Index out of bounds problem when running ANTLR code generator");
        } catch (SecurityException ex) {
            ex.printStackTrace();
            throw new BuildException("Strange! Security problem when running ANTLR code generator");
        } catch (InterruptedException ex) {
            ex.printStackTrace();
            throw new BuildException("Strange! ANTLR tool interrupted");
        }
    }
    
    protected String ANTLR_ERROR_PATTERN_STRING = "([a-zA-Z]+)\\(\\d+\\):[ ]*([a-zA-Z0-9_]+\\.g4):(\\d+):(\\d+):([^\\n]+)\\n";
    
    
    
    
    
    
    
    
    
    
    
    
    
    protected final Pattern ANTLR_ERROR_PATTERN = Pattern.compile(ANTLR_ERROR_PATTERN_STRING);


    protected String adaptToAntStandardLogger(String errorMessagesToBeAdapted, GrammarFile grammarFile) {
        Matcher matcher = ANTLR_ERROR_PATTERN.matcher(errorMessagesToBeAdapted);
        StringBuilder newMessage = new StringBuilder();
        while (matcher.find()) {
            
            int start = matcher.start();
            int end = matcher.end();
            
            String errorOrWarning = matcher.group(1);
            

            String line = matcher.group(3);
            
            String column = matcher.group(4);
            
            String description = matcher.group(5);
            
            newMessage.append(grammarFile.getPath());
            newMessage.append(":");
            newMessage.append(line);
            newMessage.append(": ");
            newMessage.append(errorOrWarning);
            newMessage.append(":");
            newMessage.append(description);
            newMessage.append("\n");
        }
        String answer = newMessage.toString();
        if (answer.equals("")) {
            answer = errorMessagesToBeAdapted;
        }
        return answer;
    }
}