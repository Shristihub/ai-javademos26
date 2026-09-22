package com.meth.examples;

public class CalcMethRef {

	public static void main(String[] args) {
		
		Processor.sum(10,20); //calling static method
		
//		referring to a static method - call using lass name
		ICalculator ref = Processor::sum; // refer the method
		ref.calculate(10, 20);
		

		Processor proref = new Processor();
		proref.product(1, 20);
		
//		refer to a non static method - call using object name
		
		ICalculator ref1 = proref::product;// implementation
		ref1.calculate(10, 20); //calling
		
		ref1 = new Processor()::product;
		ref1.calculate(10, 20);
		
		
		
		
		
		
	}
}
