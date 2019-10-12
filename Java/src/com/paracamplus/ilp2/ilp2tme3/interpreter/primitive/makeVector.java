package com.paracamplus.ilp2.ilp2tme3.interpreter.primitive;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Vector;

import com.paracamplus.ilp1.interpreter.interfaces.EvaluationException;

public class makeVector extends com.paracamplus.ilp1.interpreter.primitive.Primitive  {

	public makeVector() {
		super("makeVector");
	}

	public Object apply(Object taille,Object valeur) throws EvaluationException {
	     if(taille instanceof BigInteger) {
	    	if(valeur instanceof BigInteger) {
	    		return new Vector<BigInteger>( ((BigInteger) taille).intValue(),((BigInteger) valeur).intValue());
	    	}else if(valeur instanceof BigDecimal) {
	    		return new Vector<BigDecimal>( ((BigInteger) taille).intValue(),((BigDecimal) valeur).intValue());
	    	}
		}
			throw new EvaluationException("Non numeric argument");
	}

	@Override
	public int getArity() {
		return 2;
	}

}
