package com.paracamplus.ilp2.ilp2tme4.p2.interfaces;

import com.paracamplus.ilp1.interfaces.IASTexpression;

public interface IASTfactory extends com.paracamplus.ilp2.interfaces.IASTfactory{
	
	public IASTunless newUnless(IASTexpression body, IASTexpression condition);
}
