package com.streams.demos;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Example1 {

	public static void main(String[] args) {
		// get the names containing r - filter
		List<String> names = Arrays.asList("Raju","Manav","Shaily","Arun","Roni","Monu","Anu","Bhanu");
		
		 List<String> newNames =  names.stream()
		     .filter(str->str.startsWith("R"))
		     .collect(Collectors.toList());
		
		 System.out.println(newNames);
		 
		 // get the first five names only, sort it and print directly
		 // limit, sorted
		 names.stream()
		 	  .sorted()
		 	  .limit(5)
		 	  .forEach(str->System.out.println(str.toUpperCase()));
		 
		 System.out.println();
//		 Function<String, String> fun = str->str.toUpperCase();
		 // get the names and convert to uppercase
		 names.stream()
		      .map(str->str.toUpperCase())
		      .forEach(str->System.out.println(str));
		 
		 
		 // input is str -> output is length of each string value
		  names.stream().map(s->s.length()).forEach(num-> System.out.println(num));
		 
		 //convert list to stream, filter by names having o, sort them
		  // add hello with each element and print them o/p is ->Hello Manav,Hello Raju
		  names.stream()
		    .filter(n->n.contains("o"))
		    .sorted()
		    .map(str->{
		    	return "Hello "+str;
		    })
		    .forEach(str->System.out.println(str));
		 		 
		 
		  
		 		 
		 
		 
		 
		 
		 
		
	}
}
