package com.tw.supermarket.model;

public class Product {
	
	private String name;
	private int price;
	private Category parentCategory;
	private SellingUnit sellingUnit;
	private Discount discount;
	
	public Product(String name, int price, Category parentCategory, SellingUnit sellingUnit, Discount discount) {
		super();
		this.name = name;
		this.price = price;
		this.parentCategory = parentCategory;
		this.sellingUnit = sellingUnit;
		this.discount = discount;
	}
	
	
	public Discount getDiscount() {
		return discount;
	}

	public void setDiscount(Discount discount) {
		this.discount = discount;
	}

	public Category getParentCategory() {
		return parentCategory;
	}
	public void setParentCategory(Category parentCategory) {
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
	
	public double getDiscountedPrice(int quantity) {
		double parentCategoryDiscountedPrice = 0;
		
		boolean isCategoryDiscountApplicable = true;
		
		if(this.getDiscount().getClass().equals(SurplusDiscount.class)){
			isCategoryDiscountApplicable = false;
		}
		if (parentCategory != null && isCategoryDiscountApplicable) {
			parentCategoryDiscountedPrice = parentCategory.getDiscountedPrice(quantity, this);
		}

		double categoryPrice = discount.getDiscountedPrice(quantity, this);
		if (isCategoryDiscountApplicable && categoryPrice > parentCategoryDiscountedPrice) {
			return parentCategoryDiscountedPrice;
		}
		return categoryPrice;
	}
	
}
