package com.inter.samples;

public class UpiPayment implements IPaymentProcessor {

	@Override
	public void payAmount(double amount) {
		System.out.println("Paying the amount "+amount +"using UPI");
	}

	// override checkOffers
	@Override
	public void checkOffers() {
		System.out.println("10% discount of Dining and Shopping");
	}
	
	public void transactionStatus() {
		System.out.println("Checking status...");
	}
	

}
