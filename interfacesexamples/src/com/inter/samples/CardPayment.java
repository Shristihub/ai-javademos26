package com.inter.samples;

public abstract class CardPayment implements IPaymentProcessor {
	// concrete method - own method
	void cardType(String type) {
		System.out.println("Card type is  " + type);
	}
}

class CreditCardPayment extends CardPayment {

	@Override
	public void payAmount(double amount) {
		System.out.println("Paying thourgh cerdit card " + amount);
	}

	// concrete method
	void cardLimit(double amount) {
		System.out.println("Card Limit is raised to " + amount);
	}
}

class DebitCardPayment extends CardPayment {

	@Override
	public void payAmount(double amount) {
		System.out.println("Paying thourgh debit card " + amount);
	}
  // this only will be called
	public void checkOffers() {
		
		System.out.println("offers only on purchase above 50000");
	}
}
