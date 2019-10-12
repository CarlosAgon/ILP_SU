package com.paracamplus.ilp1.ilp1tme1;

import java.io.File;

import com.paracamplus.ilp1.interpreter.test.InterpreterTest;

public class FileInterpreter extends InterpreterTest{
	
	public FileInterpreter(File file) {
		super(file);
	}

	public static void main (String[] args) {
		FileInterpreter f=new FileInterpreter(new File(args[0]));
		try {
			f.processFile();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
