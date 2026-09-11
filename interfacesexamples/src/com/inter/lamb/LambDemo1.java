package com.inter.lamb;

public class LambDemo1 {

	public static void main(String[] args) {
		
		ICuisine cuisine = (String... items)->{
			for (String item : items) {
				System.out.println("item "+item);
			};
		};
		cuisine.printMenu("Roti");
		cuisine.printMenu("Pizza","Burger");
		cuisine.printMenu("FriedRice","Noodles");
		
		
	}
}
