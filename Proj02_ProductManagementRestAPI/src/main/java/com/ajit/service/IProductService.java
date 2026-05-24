package com.ajit.service;

import java.util.List;

import com.ajit.entity.Product;

public interface IProductService {

	public String addProduct(Product product);
	
	public List<Product> findAllProducts();
	
	public Product findProductById(Integer id);
}