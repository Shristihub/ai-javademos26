package com.meth.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MethStreams {

	public static void main(String[] args) {
		Consumer<String> con = str->System.out.println(str);
		Consumer<String> con1 = System.out::println;
		
		
		List<String> courses = 
				Arrays.asList("Java","Css","Html","Angular","Spring","Microservices");
		courses.forEach(System.out::println);
		courses.forEach(str->{
			System.out.println(str.charAt(1));
		});
		// convert the names into uppercase
		//referring to an arbitrary method of an existing class
		courses.stream().map(String::toUpperCase)
					.forEach(System.out::println);
		
		
		
		
	}
}
