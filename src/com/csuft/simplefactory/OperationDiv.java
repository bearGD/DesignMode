package com.csuft.simplefactory;

/**
 * 除法操作
 * 
 * @author ZX
 *
 */
public class OperationDiv implements Operation {

	@Override
	public double getResult(double numberA, double numberB) {
		if(numberB == 0) {
			System.out.println("除数为0,除法无意义!");
			return 0;
		}
		return numberA / numberB;
	}

}
