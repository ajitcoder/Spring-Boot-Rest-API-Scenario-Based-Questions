package com.ajit.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ajit.entity.Product;
import com.ajit.service.IProductService;

@RestController
@RequestMapping("/product")
public class ProductMgmtController {

	@Autowired
	private IProductService productService;
	
	@PostMapping("/add")
	public ResponseEntity<String> addProduct(@RequestBody Product prod){
		
		System.out.println("Model: "+prod);
		
		String msg = productService.addProduct(prod);
		
		return new ResponseEntity<String>(msg, HttpStatus.CREATED);
	}
	
	@GetMapping("/find/{id}")
	public ResponseEntity<Product> findProductById(@PathVariable Integer id){
		
		Product prod = productService.findProductById(id);
		
		return ResponseEntity.ok(prod);
	}
	
	@GetMapping("/findAll")
	public ResponseEntity<List<Product>> showAllProducts(){
		
		List<Product> prodList = productService.findAllProducts();
		
		if(prodList.isEmpty()) {
			
			return ResponseEntity.noContent().build();
		}
		
		return ResponseEntity.ok(prodList);
	}
}