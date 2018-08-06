package com.csuft.simplefactory;

/**
 * 加法操作
 * 
 * @author ZX
 *
 */
public class OperationAdd implements Operation {

	@Override
	public double getResult(double numberA, double numberB) {
		return numberA + numberB;
	}

}
