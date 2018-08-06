package com.csuft.simplefactory;

/**
 * 减法操作
 * 
 * @author ZX
 *
 */
public class OperationSub implements Operation {

	@Override
	public double getResult(double numberA, double numberB) {
		return numberA - numberB;
	}

}
