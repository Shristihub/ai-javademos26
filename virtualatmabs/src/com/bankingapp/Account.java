package com.bankingapp;

public abstract class Account {
	double balance;
	//constant
    static final String BANKNAME = "ABC Bank";
    static String idProof = "Aadhar Details";
	public Account(double balance) {
		super();
		this.balance = balance;
	}
	//must be overridden
	abstract void withdraw(double amount);
	abstract void deposit(double amount);
	double getBalance() {
		return balance;
	}
	//cannot be ovverridden
	final void printInfo() {
		loanApproval(); //can be called only in same class
		System.out.println("Loan approved member details");
	}
	private void loanApproval() {
		System.out.println("Loan approval process");
	}
   //static method
	static void documentsNeeded() {
		System.out.println("Id Proof Needed " + idProof);
		System.out.println("Address Proof needed ");
	}
	
}
