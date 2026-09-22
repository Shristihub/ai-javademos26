package com.meth.exercises;

import java.util.Arrays;

public class MethMain {

	public static void main(String[] args) {
		ISports sports = new Games()::show;
		
		String[]  games =  sports.printGames();
		//use streams - covert array into a stream
		Arrays.stream(games).forEach(str-> System.out.println(str));
		
		
		IInsurance ins = Bank::getPremium;
		System.out.println(ins.calcInterest(2000));
		
	}
}
