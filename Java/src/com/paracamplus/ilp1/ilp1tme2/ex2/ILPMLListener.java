package com.paracamplus.ilp1.ilp1tme2.ex2;

import com.paracamplus.ilp1.interfaces.IASTfactory;

import antlr4.ILPMLgrammar1Parser.ConstFalseContext;
import antlr4.ILPMLgrammar1Parser.ConstFloatContext;
import antlr4.ILPMLgrammar1Parser.ConstIntegerContext;
import antlr4.ILPMLgrammar1Parser.ConstStringContext;
import antlr4.ILPMLgrammar1Parser.ConstTrueContext;

public class ILPMLListener extends com.paracamplus.ilp1.parser.ilpml.ILPMLListener{

	private int cpt;
	
	public ILPMLListener(IASTfactory factory) {
		super(factory);
		cpt=0;
	}
	
	public void aff() {
		System.out.println(cpt);
		cpt=0;
	}
	
	@Override 
	public void exitConstFloat(
			ConstFloatContext ctx) { 
		ctx.node = factory.newFloatConstant(ctx.floatConst.getText());
		cpt++;
	}
	
	@Override 
	public void	exitConstInteger(
			ConstIntegerContext ctx) { 
		ctx.node = factory.newIntegerConstant(ctx.intConst.getText());
		cpt++;
	}
	
	@Override 
	public void exitConstFalse(
			ConstFalseContext ctx) { 
		ctx.node = factory.newBooleanConstant("false");
		cpt++;
	}
	
	@Override 
	public void exitConstTrue(
			ConstTrueContext ctx) {
		ctx.node = factory.newBooleanConstant("true");
		cpt++;
	}
	
	@Override 
	public void exitConstString(
			ConstStringContext ctx) { 
		/*
		 * On enlève le " initial et final, et on interprète les codes
		 * d'échapement \n, \r, \t, \"
		 */
		String s = ctx.getText();
		StringBuilder buf = new StringBuilder();
		for (int i = 1; i < s.length() - 1; i++) {
			if (s.charAt(i) == '\\' && i < s.length() - 2) {
				switch (s.charAt(i+1)) {
				case 'n': buf.append('\n'); i++; break;
				case 'r': buf.append('\r'); i++; break;
				case 't': buf.append('\t'); i++; break;
				case '"': buf.append('\"'); i++; break;
				default: buf.append(s.charAt(i));
				}
			}
			else buf.append(s.charAt(i));
		}
		ctx.node = factory.newStringConstant(buf.toString());
		cpt++;
	}

}
