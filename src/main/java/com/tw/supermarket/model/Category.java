package com.tw.supermarket.model;

import com.tw.supermarket.model.inteface.Categorizable;
import com.tw.supermarket.model.inteface.Discount;

public class Category implements Categorizable {

	private String name;
	private Discount discount;

	public Category(String name, Discount discount) {
		super();
		this.name = name;
		this.discount = discount;
	}

	public Discount getDiscount() {
		return discount;
	}

	public void setDiscount(Discount discount) {
		this.discount = discount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
