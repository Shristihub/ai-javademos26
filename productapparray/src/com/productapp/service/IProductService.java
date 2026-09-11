package com.productapp.service;

import com.productapp.model.Product;

public interface IProductService {

	 Product[] getAllProducts();
	 Product getById(int productId);
	 Product[] getByBrand(String brand);
}
