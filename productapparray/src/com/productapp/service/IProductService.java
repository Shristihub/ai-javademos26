package com.productapp.service;

import com.productapp.exception.ProductNotFoundException;
import com.productapp.model.Product;

public interface IProductService {

	 Product[] getAllProducts();
	 Product getById(int productId) throws ProductNotFoundException;
	 Product[] getByBrand(String brand) throws ProductNotFoundException;
}
