package com.productapp.main;

import com.productapp.exception.ProductNotFoundException;
import com.productapp.model.Product;
import com.productapp.service.IProductService;
import com.productapp.service.ProductServiceImpl;

public class Customer {

	public static void main(String[] args)  {
		// call the methods
		// interface name = implementation class
		IProductService productService = new ProductServiceImpl();
		Product[] products = productService.getAllProducts();
		for (Product nproduct : products) {
			System.out.println(nproduct);
		}
		System.out.println("Product By Brand");
		try {
			products = productService.getByBrand("Samsung1");
			for (Product nproduct : products) {
				System.out.println(nproduct);
			}
		} catch (ProductNotFoundException e) {
			System.out.println(e.getMessage());
		}
		System.out.println();
		System.out.println("Product By Id");
		Product productById = null;
		try {
			productById = productService.getById(1);
			System.out.println(productById);
		} catch (ProductNotFoundException e) {
			System.out.println(e.getMessage());
		}

	}
}
