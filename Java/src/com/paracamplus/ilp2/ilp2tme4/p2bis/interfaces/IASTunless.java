package com.paracamplus.ilp2.ilp2tme4.p2bis.interfaces;

import com.paracamplus.ilp1.interfaces.IASTexpression;

public interface IASTunless extends IASTexpression{
	IASTexpression getCondition();
	IASTexpression getBody();
}
