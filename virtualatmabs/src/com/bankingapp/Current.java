package com.bankingapp;

public class Current extends Account {
	String accountType;
//	Current(String accType,double balance){
//		super(balance);
//		accountType =accType;
//	}

	public Current(double balance, String accountType) {
		super(balance);
		this.accountType = accountType;
	}

	@Override
	void withdraw(double amount) {
		System.out.println("Withdraw in Current");
		balance = balance-amount-100;
	}

	@Override
	void deposit(double amount) {
		System.out.println("Deposit in Current");
		balance = balance+amount+50;
	}
	// own method of current class
	String[] showLoanTypes() {
		return new String[]{"short term", "long term","vehicle loan"};
	}
	



	

	
	
	

}
