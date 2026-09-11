package com.productapp.service;

import com.productapp.model.Product;

public class ProductServiceImpl implements IProductService {

	@Override
	public Product[] getAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product getById(int productId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product[] getByBrand(String brand) {
		// TODO Auto-generated method stub
		return null;
	}

	Product[] showProducts() {
		
		// create a Product array
//		Product[] products =  new Product[4];
//		products[0] = new Product("Mobile", 20000, 1,"Samsung");
//		products[1] = new Product("Mobile", 20000, 1,"Samsung");
//		products[2] = new Product("Mobile", 20000, 1,"Samsung");
//		products[3] = new Product("Mobile", 20000, 1,"Samsung");
		
//		String[] names = new String[] {"Priya","Radha","Raju"};
		Product[] products =  new Product[] {
		               new Product("Mobile", 20000, 1,"Samsung"),
		               new Product("Televison", 200000, 2,"Samsung"),
		               new Product("Pen", 200, 1,"Classmate"),
		               new Product("Mobile", 20000, 1,"Samsung")
		               };
		 return products; 
	}
	
}
