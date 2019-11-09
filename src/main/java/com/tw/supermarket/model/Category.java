package com.tw.supermarket.model;

import com.tw.supermarket.model.inteface.Discount;

public class Category {

	private String name;
	private Discount discount;
	private Category parentCategory;
	
	public Category(String name, Discount discount,Category parentCategory) {
		super();
		this.name = name;
		this.discount = discount;
		this.parentCategory = parentCategory;
	}
	
	public Category getParentCategory() {
		return parentCategory;
	}

	public void setParentCategory(Category parentCategory) {
		this.parentCategory = parentCategory;
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
	
	public double getDiscountedPrice(int quantity, Product product) {
		double parentCategoryDiscountedPrice = 0;
		if (parentCategory != null) {
			parentCategoryDiscountedPrice = parentCategory.getDiscountedPrice(quantity, product);
		}

		double categoryPrice = discount.getDiscountedPrice(quantity, product);
		if (parentCategory != null && categoryPrice > parentCategoryDiscountedPrice) {
			return parentCategoryDiscountedPrice;
		}
		return categoryPrice;
	}

}
