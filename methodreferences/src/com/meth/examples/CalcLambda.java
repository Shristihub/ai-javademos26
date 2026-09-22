package com.meth.examples;

public class CalcLambda {

	public static void main(String[] args) {
		// add
		ICalculator ref = (a,b)->System.out.println(a+b); // implementation
		ref.calculate(10, 20);//calling
		
		// sub
		ref = (a,b)->System.out.println(a-b); // implementation
		ref.calculate(10, 20);
		
		// multiplication
		ref = (a,b)->System.out.println(a*b); // implementation
		ref.calculate(10, 20);
		
		
		IGreeter gref =  name->{
			return "Hello " + name;
		};
		String res = gref.greetUser("Priya");
		System.out.println(res);
		
		gref =  name->"Welcome " + name; // returns this
		System.out.println(gref.greetUser("Sri"));
		
		
	}

}
