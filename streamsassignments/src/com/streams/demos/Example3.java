package com.streams.demos;

import java.util.List;

public class Example3 {

	public static void main(String[] args) {
		 
		List<Integer> nums =  List.of(20,54,33,91,11);
		// get the even numbers from the list
		nums.stream()
			.filter(num-> num%2==0)
			.forEach(num->System.out.println(num));
		
		// get the first odd number from the list
		int oddNum =  nums.stream()
			.filter(num-> num%2!=0)
			.findFirst()
			.orElseThrow(()->new RuntimeException());
	
		
		// get each number multiplied by 2 and print the result
		nums.stream()
		    .map(num->num*2)
		    .forEach(num->System.out.println(num));
		
		// get each number multiplied by 2 and print the result in ascending order
		nums.stream()
	    .map(num->num*2)
	    .sorted()
	    .forEach(num->System.out.println(num));
	
		
		// get each number multiplied by 2 and sort them and print the first 3 results
		nums.stream()
	    .map(num->num*2)
	    .limit(3)
	    .forEach(num->System.out.println(num));
	}
}
