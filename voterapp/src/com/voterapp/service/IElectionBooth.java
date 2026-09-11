package com.voterapp.service;

import com.voterapp.exceptions.NotEligibleException;

public interface IElectionBooth {

	  boolean checkEligibility(int age, String locality, long voterId) throws NotEligibleException ;
}
