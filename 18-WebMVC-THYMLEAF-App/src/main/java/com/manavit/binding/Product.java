package com.manavit.binding;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Product {

	private Integer pid;

	@NotNull(message = "Name is required")
	@Size(min = 3, max = 15, message = "Name should have min 3 max 15 characters")
	private String pname;

	@NotNull(message = "Price is required")
	private Double price;

	

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

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + "]";
	}

	

}
