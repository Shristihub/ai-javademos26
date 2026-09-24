package com.restaurantapp.service;

import java.time.LocalDateTime;
import java.util.List;

import com.restaurantapp.model.Restaurant;

public class RestaurantServiceImpl implements IRestaurantService{

	@Override
	public void addRestaurant(Restaurant restaurant) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateRestaurant(int restaurantId, double cost) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Restaurant getById(int restaurantId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteRestaurant(int restaurantId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Restaurant> getAllRestaurants() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Restaurant> getByCuisineLesserCost(String cuisine, double cost) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Restaurant> getByTypeLesserCost(String type, double cost) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Restaurant> getByTime(LocalDateTime availabiltyTime) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Restaurant> getByRatingsAndType(String type, int ratings) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Restaurant> getByCity(String city) {
		// TODO Auto-generated method stub
		return null;
	}

}
