package com.paracamplus.ilp1.ilp1tme1.sequence;

import com.paracamplus.ilp1.interfaces.IASTexpression;
import com.paracamplus.ilp1.interpreter.interfaces.EvaluationException;

public class ASTsequence extends com.paracamplus.ilp1.ast.ASTsequence implements IASTsequence {

	public ASTsequence(IASTexpression[] expressions) {
		super(expressions);
	}

	@Override
	public IASTexpression[] getAllButLastInstructions() throws EvaluationException {
		IASTexpression[] copy = new IASTexpression[super.getExpressions().length-1];
		for(int i=0;i<copy.length;i++) {
			copy[i]=super.getExpressions()[i];
		}
		return copy;
	}
}
