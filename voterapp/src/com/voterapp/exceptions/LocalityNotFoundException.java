package com.voterapp.exceptions;

// custom exception
public class LocalityNotFoundException extends NotEligibleException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//add default and a parameterized const
	public LocalityNotFoundException() {
		super();
	}

	public LocalityNotFoundException(String message) {
		super(message);
	}
	
	

	
}
