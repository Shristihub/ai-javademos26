package com.oops.basics;

public class Greeter {
	
	void printMessage(String... names) {
		// iterate and print the message as "Great Day, PRIYA!!! "
		for (String name : names) {
			System.out.println("Great Day, "+name+" !!!");
		}
	}
	
	void printMessages(String name,String... messages) {
		//iterate thru messages and print as "message 1", +name => Hello Priya, Welcome Priya, Bye Bye Priya
		for (String message : messages) {
			System.out.println(message +", "+name);
		}
	}

	public static void main(String[] args) {
		Greeter greeter = new Greeter();
		greeter.printMessage("Ram","Priya","Raj");
		greeter.printMessages("Jo","Great Day","Hello","hi");
		
		
		
	}
}
