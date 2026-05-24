package com.ajit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ajit.entity.Product;
import com.ajit.exception.ProductNotFoundException;
import com.ajit.repository.IProductRepository;

@Service
public class ProductServiceImpl implements IProductService {

	@Autowired
	private IProductRepository productRepo;
	
	@Override
	public String addProduct(Product product) {
		
		if(product==null) {
			
			throw new ProductNotFoundException("Product can't be null");
		}
		
		Integer pid = productRepo.save(product).getPid();
		
		return "Product is added with PID: "+pid;
	}

	@Override
	public List<Product> findAllProducts() {
		
		return productRepo.findAll();
	}

	@Override
	public Product findProductById(Integer id) {
		
		Product prod = productRepo.findById(id)
		.orElseThrow(()-> new ProductNotFoundException("Product PID Not Found in database"));
	
		return prod;
	}

}