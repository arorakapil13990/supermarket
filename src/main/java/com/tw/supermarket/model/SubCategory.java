package com.tw.supermarket.model;

import com.tw.supermarket.model.inteface.Categorizable;
import com.tw.supermarket.model.inteface.Discount;

public class SubCategory implements Categorizable {

	private String name;
	private Categorizable parentCategory;
	private Discount discount;
	
	
	public SubCategory(String name, Categorizable parentCategory, Discount discount) {
		super();
		this.name = name;
		this.parentCategory = parentCategory;
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
	public Categorizable getParentCategory() {
		return parentCategory;
	}
	public void setParentCategory(Categorizable parentCategory) {
		this.parentCategory = parentCategory;
	}
	
	
	
}
