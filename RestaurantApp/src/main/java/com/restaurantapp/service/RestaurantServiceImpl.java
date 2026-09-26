package com.restaurantapp.service;

import java.time.LocalDateTime;
import java.util.List;

import com.restaurantapp.dao.IRestaurantDao;
import com.restaurantapp.dao.RestaurantDaoImpl;
import com.restaurantapp.model.Restaurant;

public class RestaurantServiceImpl implements IRestaurantService{
	
    private IRestaurantDao restaurantDao = new RestaurantDaoImpl();
	
	@Override
	public void addRestaurant(Restaurant restaurant) {
		//call the method of dao
		restaurantDao.addRestaurant(restaurant); 
	}

	@Override
	public void updateRestaurant(int restaurantId, double cost) {
		//call the method of dao
		restaurantDao.updateRestaurant(restaurantId, cost);
		
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
		//call the method dao
		List<Restaurant> restaurants = restaurantDao.findAllRestaurants();
		// sort by name, change the name to upper case and print it
		
		return restaurants;
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
