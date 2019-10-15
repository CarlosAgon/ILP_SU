package com.paracamplus.ilp2.ilp2tme3.interpreter.primitive;

import java.util.Vector;

import com.paracamplus.ilp1.interpreter.interfaces.EvaluationException;

public class vectorLength extends com.paracamplus.ilp1.interpreter.primitive.UnaryPrimitive  {

	public vectorLength() {
		super("vectorLength");
	}

	@Override
	public Object apply(Object vector) throws EvaluationException {
		if(vector instanceof Vector){
	    	 return ((Vector<?>) vector).size();
		}
		throw new EvaluationException("Non vector argument");
	}

}
