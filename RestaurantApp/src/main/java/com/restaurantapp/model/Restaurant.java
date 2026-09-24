package com.restaurantapp.model;

import java.time.LocalDateTime;

public class Restaurant {

	private String restaurantName;
	private Integer restaurantId;
	private double costForTwo;
	private String cuisine;
	private String type;
	private int ratings;
	private String city;

//	private LocalDateTime openingTime;
//	private LocalDateTime closingTime;
//	
	public Restaurant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Restaurant(String restaurantName, Integer restaurantId, double costForTwo, String cuisine, String type,
			int ratings, String city) {
		super();
		this.restaurantName = restaurantName;
		this.restaurantId = restaurantId;
		this.costForTwo = costForTwo;
		this.cuisine = cuisine;
		this.type = type;
		this.ratings = ratings;
		this.city = city;
	}

	public String getRestaurantName() {
		return restaurantName;
	}

	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}

	public Integer getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(Integer restaurantId) {
		this.restaurantId = restaurantId;
	}

	public double getCostForTwo() {
		return costForTwo;
	}

	public void setCostForTwo(double costForTwo) {
		this.costForTwo = costForTwo;
	}

	public String getCuisine() {
		return cuisine;
	}

	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getRatings() {
		return ratings;
	}

	public void setRatings(int ratings) {
		this.ratings = ratings;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Restaurant [restaurantName=" + restaurantName + ", restaurantId=" + restaurantId + ", costForTwo="
				+ costForTwo + ", cuisine=" + cuisine + ", type=" + type + ", ratings=" + ratings + ", city=" + city
				+ "]";
	}

}
