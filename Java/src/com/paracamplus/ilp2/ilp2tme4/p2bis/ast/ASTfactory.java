package com.paracamplus.ilp2.ilp2tme4.p2bis.ast;


import com.paracamplus.ilp1.interfaces.IASTexpression;
import com.paracamplus.ilp1.interfaces.IASTvariable;
import com.paracamplus.ilp2.ast.ASTassignment;
import com.paracamplus.ilp2.ast.ASTfunctionDefinition;
import com.paracamplus.ilp2.ast.ASTloop;
import com.paracamplus.ilp2.ast.ASTprogram;
import com.paracamplus.ilp2.ilp2tme4.p2bis.interfaces.IASTunless;
import com.paracamplus.ilp2.ilp2tme4.p2bis.ast.ASTunless;
import com.paracamplus.ilp2.interfaces.IASTassignment;
import com.paracamplus.ilp2.ilp2tme4.p2bis.interfaces.IASTfactory;
import com.paracamplus.ilp2.interfaces.IASTloop;
import com.paracamplus.ilp2.interfaces.IASTprogram;
import com.paracamplus.ilp2.interfaces.IASTfunctionDefinition;



public class ASTfactory extends com.paracamplus.ilp1.ast.ASTfactory 
	implements IASTfactory{

    @Override
	public IASTprogram newProgram(IASTfunctionDefinition[] functions, 
                                  IASTexpression expression) {
        return new ASTprogram(functions, expression);
    }
    

    @Override
	public IASTassignment newAssignment(IASTvariable variable,
                                        IASTexpression value) {
        return new ASTassignment(variable, value);
    }


    @Override
	public IASTloop newLoop(IASTexpression body, IASTexpression condition) {
        return new ASTloop( body,condition);
    }

    @Override
	public IASTfunctionDefinition newFunctionDefinition(
            IASTvariable functionVariable,
            IASTvariable[] variables, 
            IASTexpression body) {
        return new ASTfunctionDefinition(functionVariable, variables, body);
    }
    
	public IASTunless newUnless(IASTexpression body, IASTexpression condition) {
        return new ASTunless(body, condition);
    }
}
