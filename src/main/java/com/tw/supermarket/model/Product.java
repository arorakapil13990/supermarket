package com.tw.supermarket.model;

import com.tw.supermarket.model.inteface.Categorizable;
import com.tw.supermarket.model.inteface.SellingUnit;

public class Product implements Categorizable {
	
	private String name;
	private int price;
	private Categorizable parentCategory;
	private SellingUnit sellingUnit;
	
	public Product(String name, int price, Categorizable parentCategory, SellingUnit sellingUnit) {
		super();
		this.name = name;
		this.price = price;
		this.parentCategory = parentCategory;
		this.sellingUnit = sellingUnit;
	}
	public Categorizable getParentCategory() {
		return parentCategory;
	}
	public void setParentCategory(Categorizable parentCategory) {
		this.parentCategory = parentCategory;
	}
	public SellingUnit getSellingUnit() {
		return sellingUnit;
	}
	public void setSellingUnit(SellingUnit sellingUnit) {
		this.sellingUnit = sellingUnit;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	

}
