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
	    		System.out.println(((BigInteger) taille).intValue());
	    		System.out.println(((BigInteger) valeur).intValue());
	    		Vector<BigInteger> v=new Vector<BigInteger>(((BigInteger) taille).intValue());
	    		for(int i=0;i<(((BigInteger) taille).intValue());i++) {
	    			v.add(i,(BigInteger) valeur);
	    		}
	    		System.out.println(v);
	    		return v;
	    	}else if(valeur instanceof BigDecimal) {
	    		Vector<BigDecimal> v=new Vector<BigDecimal>(((BigInteger) taille).intValue());
	    		for(int i=0;i<(((BigInteger) taille).intValue());i++) {
	    			v.add(i,(BigDecimal) valeur);
	    		}
	    	}
		}
			throw new EvaluationException("Non numeric argument");
	}

	@Override
	public int getArity() {
		return 2;
	}

}
