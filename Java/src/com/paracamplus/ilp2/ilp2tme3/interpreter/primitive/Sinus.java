package com.paracamplus.ilp2.ilp2tme3.interpreter.primitive;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.paracamplus.ilp1.interpreter.interfaces.EvaluationException;

public class Sinus extends com.paracamplus.ilp1.interpreter.primitive.UnaryPrimitive {

	
	public Sinus() {
		super("sinus");
	}

	@Override
	public Object apply(Object arg1) throws EvaluationException {
		if(arg1 instanceof BigInteger) {
			return Math.sin((((BigInteger) arg1).intValue()));
		} else
		if(arg1 instanceof BigDecimal) {
			return Math.sin((((BigDecimal) arg1).doubleValue()));
		} else {
			throw new EvaluationException("Non numeric argument");
		}
	}

}
