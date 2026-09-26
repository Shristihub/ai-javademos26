package com.restaurantapp.util;

public class Queries {

	public static final String INSERTQUERY = 
		"""
		insert into restaurant
		(restaurant_name, city,cuisine,restaurant_type,cost_for_two,opening_time,closing_time,ratings)
		values(?,?,?,?,?,?,?,?)
			""";
	public static final String UPDATEQUERY = "update restaurant set cost_for_two=? where restaurant_id=?";
	public static final String GETALLQUERY = "select * from restaurant";
	public static final String GETBYCITYQUERY = "select * from restaurant where city=?";
}
