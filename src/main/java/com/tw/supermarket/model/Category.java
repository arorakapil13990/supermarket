package com.tw.supermarket.model;

import java.util.Optional;

public class Category {

	private String name;
	private Discount discount;
	private Category parentCategory;
	
	public Category(String name, Discount discount,Category parentCategory) {
		this.name = name;
		this.discount = discount;
		this.parentCategory = parentCategory;
	}

	public double getPriceAfterCategoryDiscount(int quantity, Product product) {
		double parentCategoryDiscountedPrice = Optional.ofNullable(parentCategory).isPresent() ? parentCategory.getPriceAfterCategoryDiscount(quantity, product) : 0;
		double categoryPrice = discount.getPriceAfterDiscount(quantity, product);

		if (Optional.ofNullable(parentCategory).isPresent() && categoryPrice > parentCategoryDiscountedPrice) {
			return parentCategoryDiscountedPrice;
		}
		return categoryPrice;
	}

}
