package com.oops.basics;

public class Calculator {

	void sum( int...nums ) {
		// iterate nums and calculate sum
		int sum = 0;
		for (int num : nums) {
			sum += num;
		}
		System.out.println(sum);
	}

	void show(String name, int...marks) {
		
	}
	
	
	double square(int a) {
		// calculate square using inbuilt method of Math class
		return Math.pow(a, 2);
	}

}
