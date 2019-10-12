package com.paracamplus.ilp1.ilp1tme1.test;

import java.io.File;
import java.util.Collection;

import org.junit.runners.Parameterized.Parameters;

import com.paracamplus.ilp1.compiler.test.CompilerRunner;
import com.paracamplus.ilp1.interpreter.test.InterpreterTest;

public class DiscriminantInterpreterTest extends InterpreterTest{
	
    protected static String[] samplesDirName = { "SamplesTME1" };
    protected static String pattern = ".*";
    
	public DiscriminantInterpreterTest(File file) {
		super(file);
	}
	
    
    @Parameters(name = "{0}")
    public static Collection<File[]> data() throws Exception {
    	return CompilerRunner.getFileList(samplesDirName, pattern);
    }    	
    
}
