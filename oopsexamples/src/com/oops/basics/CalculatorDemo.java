package com.oops.basics;

public class CalculatorDemo {
	public static void main(String[] args) {
		Calculator calc= new Calculator();
		System.out.println(calc.square(200));
		
		calc.sum(10,20,30);
		calc.sum(10,20,30,40);
		calc.sum(10,20,30,40,50);
		calc.sum();
	}

}
