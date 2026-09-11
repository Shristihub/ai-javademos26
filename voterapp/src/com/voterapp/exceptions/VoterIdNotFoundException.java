package com.voterapp.exceptions;

// custom exception
public class VoterIdNotFoundException extends NotEligibleException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//add default and a parameterized const
	public VoterIdNotFoundException() {
		super();
	}

	public VoterIdNotFoundException(String message) {
		super(message);
	}
	
	

	
}
