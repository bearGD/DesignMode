package com.csuft.simplefactory;

/**
 * 乘法操作
 * 
 * @author ZX
 *
 */
public class OperationMul implements Operation {

	@Override
	public double getResult(double numberA, double numberB) {
		return numberA * numberB;
	}

}
