package com.inter.samples;

public class AppStore {

	public static void main(String[] args) {
		// interface ref = implementation class
		IPaymentProcessor paymentProcessor = new UpiPayment();
		paymentProcessor.payAmount(1000);
		//calls the overridden method
		paymentProcessor.checkOffers(); //overridden default method in upi payment
	
		IPaymentProcessor.printReceipt(1000); //static method using interface name
		System.out.println(IPaymentProcessor.message);// call static variable
		
		//own method of UpiPayment
		UpiPayment upiPayment = (UpiPayment)paymentProcessor;
		upiPayment.checkOffers(); //print from upi payment
		System.out.println();
		
		//card payment
		paymentProcessor = new CreditCardPayment();
		paymentProcessor.checkOffers(); //calls from interface
		
		CreditCardPayment credit = (CreditCardPayment) paymentProcessor; 
		// all methods in credit card 
		credit.cardLimit(20000);
		//super class method
		credit.cardType("VISA"); // from cardpayment class
		//call interface method
		credit.payAmount(4500); //from credicard payment class
		//default method
		credit.checkOffers(); // print from interface
		
		
		paymentProcessor = new DebitCardPayment();
		paymentProcessor.payAmount(3000);
		paymentProcessor.checkOffers(); //calls from debitcardpayment
		
		
		
		
		
		
		
		
		
	}

}
