package com.restaurantapp.model;

public enum Cuisine {

	SI("SOUTH INDIAN"),
	NI("NORTH INDIAN"),
	IT("ITALIAN"),
	CH("CHINESE"),
	CO("CONTINENTAL"); // similar to new Employee("Sripriya");

	private String cuisineType;    //similar to instance variable
	// similar to para constructor of class
	private Cuisine(String type) {
		this.cuisineType = type;
	}
	// create a public method to access the type
	public String getCuisineType() {
		return cuisineType;
	}
	
}

