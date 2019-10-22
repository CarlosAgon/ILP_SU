package com.paracamplus.ilp2.ilp2tme4.p3.ast;

import com.paracamplus.ilp1.ast.ASTexpression;
import com.paracamplus.ilp1.interfaces.IASTexpression;
import com.paracamplus.ilp2.ilp2tme4.p2bis.interfaces.IASTvisitor;
import com.paracamplus.ilp2.ilp2tme4.p2bis.interfaces.IASTunless;

public class ASTunless extends ASTexpression
implements IASTunless{

	private final IASTexpression body;
	private final IASTexpression condition;
    
	public ASTunless(IASTexpression body,
                          IASTexpression condition ) {
		this.body = body;
		this.condition = condition;
	}

	public <Result, Data, Anomaly extends Throwable> Result accept(
			IASTvisitor<Result, Data, Anomaly> visitor, Data data) throws Anomaly {
		return visitor.visit(this, data);
	}

	@Override
	public <Result, Data, Anomaly extends Throwable> Result accept(
			com.paracamplus.ilp1.interfaces.IASTvisitor<Result, Data, Anomaly> visitor, Data data) throws Anomaly {
		// TODO Auto-generated method stub
		return ((IASTvisitor <Result, Data, Anomaly>) visitor).visit(this, data);
	}

	@Override
	public IASTexpression getCondition() {
		return condition;
	}

	@Override
	public IASTexpression getBody() {
		return body;
	}



}
