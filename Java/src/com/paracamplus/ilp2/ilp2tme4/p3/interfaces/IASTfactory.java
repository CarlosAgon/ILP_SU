package com.paracamplus.ilp2.ilp2tme4.p3.interfaces;



import com.paracamplus.ilp1.interfaces.IASTexpression;
import com.paracamplus.ilp1.interfaces.IASTvariable;
import com.paracamplus.ilp2.interfaces.IASTfunctionDefinition;
import com.paracamplus.ilp2.interfaces.IASTprogram;

public interface IASTfactory extends com.paracamplus.ilp1.interfaces.IASTfactory {
    IASTprogram newProgram(
    		IASTfunctionDefinition[] functions,
            IASTexpression expression);
    
    IASTexpression newLoop(IASTexpression condition,
                           IASTexpression body);

    IASTfunctionDefinition newFunctionDefinition(
            IASTvariable functionVariable,
            IASTvariable[] variables,
            IASTexpression body);
    
    IASTexpression newAssignment(IASTvariable variable,
            IASTexpression value);
    
    IASTunless newUnless(IASTexpression body, IASTexpression condition);
}
