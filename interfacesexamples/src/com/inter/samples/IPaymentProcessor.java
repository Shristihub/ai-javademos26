package com.inter.samples;

public interface IPaymentProcessor {
	
	String message = "Payment Gateway App";
	
	//public abstract method
	void payAmount(double amount);
	//static method- can be called only by interface name
	//common for all implementation classes
	
	static void printReceipt(double amount) {
		System.out.println("Recipt for amount paid "+amount);
	}
	
	//public default method - can be overridden in subclasses
	default void checkOffers() {
		System.out.println("offers on dining and movies");
	}

}
