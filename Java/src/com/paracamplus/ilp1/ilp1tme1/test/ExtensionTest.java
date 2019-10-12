package com.paracamplus.ilp1.ilp1tme1.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.paracamplus.ilp1.ast.ASTstring;
import com.paracamplus.ilp1.ilp1tme1.sequence.ASTfactory;
import com.paracamplus.ilp1.ilp1tme1.sequence.IASTsequence;
import com.paracamplus.ilp1.interfaces.IASTexpression;
import com.paracamplus.ilp1.interpreter.interfaces.EvaluationException;

public class ExtensionTest {

	@Test
	public void test() {
		IASTexpression [] expression = {
				new ASTstring("hichem"),new ASTstring("president"),new ASTstring("quelquechose")
		};
		ASTfactory f = new ASTfactory();
		IASTsequence seq =f.newSequence(expression);
		try {
			assertEquals(seq.getAllButLastInstructions().length,expression.length-1);
			for(int i=0;i<expression.length-1;i++) {
				assertEquals(seq.getAllButLastInstructions()[i],expression[i]);
			}
			
			
		} catch (EvaluationException e) {
			e.printStackTrace();
		}
	}
}
