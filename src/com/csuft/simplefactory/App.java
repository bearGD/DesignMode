package com.csuft.simplefactory;

public class App {

	public static void main(String[] args) {
		Operation op = OperationFactory.createOperation("-");
		double result = op.getResult(6, 7);
		System.out.println(result);
	}

}
