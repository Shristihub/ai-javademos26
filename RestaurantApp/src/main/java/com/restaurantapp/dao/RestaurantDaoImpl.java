package com.restaurantapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import com.restaurantapp.model.Restaurant;
import com.restaurantapp.util.Queries;
import com.restaurantapp.util.RestaurantConnect;

public class RestaurantDaoImpl implements IRestaurantDao {

	@Override
	public void addRestaurant(Restaurant restaurant) {
//	     get the connection 
		Connection connection = RestaurantConnect.openConnection();
//	     create the PreparedStatement using connection obj
//		 no finally as we use try with resources

		try (PreparedStatement preparedStatement = connection.prepareStatement(Queries.INSERTQUERY);) {
//			 set the values
			preparedStatement.setString(1, restaurant.getRestaurantName());
			preparedStatement.setString(2, restaurant.getCity());
			preparedStatement.setString(3, restaurant.getCuisine());
			preparedStatement.setString(4, restaurant.getType());
			preparedStatement.setDouble(5, restaurant.getCostForTwo());
			// convert LocalTime to Time of db
			preparedStatement.setObject(6, restaurant.getOpeningTime());
			preparedStatement.setObject(7, restaurant.getClosingTime());
			preparedStatement.setInt(8, restaurant.getRatings());
//			 call execute
			int updatedCount = preparedStatement.executeUpdate();
			System.out.println("Inserted row count " + updatedCount);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

	@Override
	public void updateRestaurant(int restaurantId, double cost) {
//	     get the connection 
		Connection connection = RestaurantConnect.openConnection();
//	     create the PreparedStatement using connection obj
		try (PreparedStatement preparedStatement = connection.prepareStatement(Queries.UPDATEQUERY);) {
//			 set the values
			preparedStatement.setDouble(1, cost);
			preparedStatement.setInt(2, restaurantId);
//			 call execute
			int updatedCount = preparedStatement.executeUpdate();
			System.out.println("Inserted row count " + updatedCount);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public Restaurant findById(int restaurantId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteRestaurant(int restaurantId) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Restaurant> findAllRestaurants() {
		// create a temp list
		List<Restaurant> restaurants = new ArrayList<Restaurant>();
//	     get the connection 
		Connection connection = RestaurantConnect.openConnection();
//	     create the PreparedStatement using connection obj
		try (PreparedStatement preparedStatement = connection.prepareStatement(Queries.GETALLQUERY);) {
			ResultSet rs = preparedStatement.executeQuery();

			// iterate thru the sresult set
			while (rs.next()) {
				// create a restaurant object
				Restaurant restaurant = new Restaurant();
				// get the columns
				String restaurantName = rs.getString(1);
				// set it
				restaurant.setRestaurantName(restaurantName);
				// get the columns from rs and set it in restaurant
				restaurant.setRestaurantId(rs.getInt(2));
				restaurant.setCity(rs.getString("city"));
				restaurant.setCuisine(rs.getString("cuisine"));
				restaurant.setType(rs.getString(5));
				restaurant.setCostForTwo(rs.getDouble(6));
				restaurant.setRatings(rs.getInt("ratings"));
				LocalTime openingTime = rs.getObject("opening_time", LocalTime.class);
				restaurant.setOpeningTime(openingTime);
				LocalTime closingTime = rs.getObject(8, LocalTime.class);
				restaurant.setClosingTime(closingTime);
				// add it to a list and return the list
				restaurants.add(restaurant);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return restaurants;
	}

	@Override
	public List<Restaurant> findByCuisineLesserCost(String cuisine, double cost) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Restaurant> findByTypeLesserCost(String type, double cost) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Restaurant> findByTime(LocalDateTime availabiltyTime) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Restaurant> findByRatingsAndType(String type, int ratings) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Restaurant> findByCity(String city) {
		// TODO Auto-generated method stub
		return null;
	}

}
