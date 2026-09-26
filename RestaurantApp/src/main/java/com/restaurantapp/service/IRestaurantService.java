package com.restaurantapp.service;

import java.time.LocalDateTime;
import java.util.List;

import com.restaurantapp.exceptions.RestaurantNotFoundException;
import com.restaurantapp.model.Restaurant;

public interface IRestaurantService {

	// CRUD operation
	void addRestaurant(Restaurant restaurant);
	void updateRestaurant(int restaurantId,double cost);
	Restaurant getById(int restaurantId);
	void deleteRestaurant(int restaurantId);
	
	// by the user
	List<Restaurant> getAllRestaurants();
	// get by cuisine , lessercost
	List<Restaurant> getByCuisineLesserCost(String cuisine, double cost) throws RestaurantNotFoundException;
	// get by type , lessercost
	List<Restaurant> getByTypeLesserCost(String type, double cost) throws RestaurantNotFoundException;
	// get the restaurants by Time
	List<Restaurant> getByTime(LocalDateTime availabiltyTime)  throws RestaurantNotFoundException;
	// get by type , high ratings
	List<Restaurant> getByRatingsAndType(String type, int ratings)  throws RestaurantNotFoundException;
	
	// get by city
	List<Restaurant> getByCity(String city)  throws RestaurantNotFoundException;
	
	
	
	
}
