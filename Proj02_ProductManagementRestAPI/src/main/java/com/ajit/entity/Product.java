package com.ajit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "Product_tbl")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer pid;
	
	@NotNull(message = "Product name is mandatory.")
	private String pname;
	
	@NotNull(message = "Product Price is mandatory and must be greater than 0")
	private Double price;
	
	@NotNull(message = "Product quantity is mandatory and can't be negative")
	private Integer quantity;

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Product(@NotNull(message = "Product name is mandatory.") String pname,
			@NotNull(message = "Product Price is mandatory and must be greater than 0") Double price,
			@NotNull(message = "Product quantity is mandatory and can't be negative") Integer quantity) {
		super();
		this.pname = pname;
		this.price = price;
		this.quantity = quantity;
	}

	public Product() {
		
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
}