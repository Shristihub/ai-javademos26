package com.bankingapp;

public class Savings extends Account{

	public Savings(double balance) {
		super(balance);
	}
	void withdraw(double amount) {
		System.out.println("Withdraw in Savings");
//		balance = balance-amount;
		balance-=amount;
	}
	@Override
	void deposit(double amount) {
		System.out.println("Deposit in Savings");
		balance+=amount;
	}
	
	

	
}
