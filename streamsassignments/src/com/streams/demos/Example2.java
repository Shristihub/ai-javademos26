package com.streams.demos;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Example2 {

	public static void main(String[] args) {
		List<String> courses = 
				Arrays.asList("Java","Css","Html","Angular","Spring","Microservices");
		
		// sort and get the first element
		Optional<String> opt =  courses.stream()
		    .sorted()
		    .findFirst();
		
		// retrieve the value
//		If a value is present, returns the value, otherwise throws NoSuchElementException .
		String course = opt.get();
		System.out.println(course);
		
		
		// filter and get the first element
		opt =  courses.stream()
				    .filter(str->str.startsWith("M"))
				    .findFirst();
//		String course1 = opt.get();
//		System.out.println(course1); // exception NoSuchElementException
		
		//always check optional before printing
		// if it has value
		if(opt.isPresent()) {
		//call get method
			String course1 = opt.get();
			System.out.println(course1);
		}
		
		// check if it has value
		//if yes print it else return a substitute value
		String ncourse = courses.stream()
			    .filter(str->str.startsWith("S"))
			    .findFirst()
			    // If a value is present, returns the value, otherwise returns substitute .
			    .orElse("No course available");
		 System.out.println(ncourse);
		
		
		
		 String str =courses.stream().sorted().findFirst().orElse("no");
		 System.out.println(str);
		
		
		
		
		
		
		
		
		// if yes print it else throw exception
		
				    
		
				
		
		
		
	}
}
