package com.voterapp.main;

import com.voterapp.exceptions.LocalityNotFoundException;
import com.voterapp.exceptions.NotEligibleException;
import com.voterapp.exceptions.UnderAgeException;
import com.voterapp.exceptions.VoterIdNotFoundException;
import com.voterapp.service.ElectionBoothImpl;
import com.voterapp.service.IElectionBooth;

public class Voter {

	public static void main(String[] args) {

		IElectionBooth electionBooth =  new ElectionBoothImpl();
		try {
			boolean isEligible = electionBooth.checkEligibility(18,"JP Nagar", 1001);
			int y  = Integer.parseInt("priya");
			
			if(isEligible)
				System.out.println("You are eligible to vote");
		}catch(UnderAgeException | LocalityNotFoundException| VoterIdNotFoundException  e) {
			System.out.println(e.getMessage());
		} catch (NotEligibleException e) {
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("done");
	}

}
