package com.restaurantapp.client;

import java.time.LocalTime;

import com.restaurantapp.model.Cuisine;
import com.restaurantapp.model.Restaurant;
import com.restaurantapp.model.RestaurantType;
import com.restaurantapp.service.IRestaurantService;
import com.restaurantapp.service.RestaurantServiceImpl;

public class User {

	public static void main(String[] args) {
		//create a restaurant object
		Restaurant restaurant =  
			new Restaurant("Mainland China",1900 ,Cuisine.CH.getCuisineType(),
					RestaurantType.NONVEG.name(), 4, "Bengaluru",LocalTime.of(7, 30), LocalTime.of(11, 30));
		//create an object of RestaurantServiceImpl
		IRestaurantService restaurantService = new RestaurantServiceImpl();
		//call add method
//		restaurantService.addRestaurant(restaurant);
		
		//update the restaurant
		restaurantService.updateRestaurant(3, 2000);
		
		// get the list of all restaurants
		restaurantService.getAllRestaurants()
						 .forEach(System.out::println);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
