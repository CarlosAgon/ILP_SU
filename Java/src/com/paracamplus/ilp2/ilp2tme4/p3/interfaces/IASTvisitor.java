package com.paracamplus.ilp2.ilp2tme4.p3.interfaces;

import com.paracamplus.ilp2.interfaces.IASTassignment;
import com.paracamplus.ilp2.interfaces.IASTloop;

public interface IASTvisitor<Result, Data, Anomaly extends Throwable>
extends com.paracamplus.ilp1.interfaces.IASTvisitor<Result, Data, Anomaly>{

   Result visit(IASTassignment iast, Data data) throws Anomaly;
   Result visit(IASTloop iast, Data data) throws Anomaly;
   Result visit(IASTunless iast, Data data) throws Anomaly;

}
