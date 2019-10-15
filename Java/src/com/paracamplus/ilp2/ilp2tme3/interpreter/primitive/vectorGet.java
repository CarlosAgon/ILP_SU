package com.paracamplus.ilp2.ilp2tme3.interpreter.primitive;

import java.math.BigInteger;
import java.util.Vector;

import com.paracamplus.ilp1.interpreter.interfaces.EvaluationException;

public class vectorGet extends com.paracamplus.ilp1.interpreter.primitive.Primitive  {

	public vectorGet() {
		super("vectorGet");
	}

	@Override
		public Object apply(Object vector,Object index) throws EvaluationException {
	    if((vector instanceof Vector) && (index instanceof BigInteger)){
	    	 return ((Vector<?>) vector).get(((BigInteger) index).intValue());
		}
		throw new EvaluationException("Non numeric argument 2");
	}


	@Override
	public int getArity() {
		return 2;
	}
}
