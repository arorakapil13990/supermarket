package com.tw.supermarket.model;

import java.util.Optional;

public class Product {
	
	private String name;
	private int price;
	private Category parentCategory;
	private String sellingUnit;
	private Discount discount;
	
	public Product(String name, int price, Category parentCategory, String sellingUnit, Discount discount) {
		this.name = name;
		this.price = price;
		this.parentCategory = parentCategory;
		this.sellingUnit = sellingUnit;
		this.discount = discount;
	}


    public Discount getDiscount() {
        return discount;
    }

    public String getSellingUnit() {
        return sellingUnit;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public double getPriceAfterProductDiscount(int quantity) {
        boolean isCategoryDiscountApplicable = this.getDiscount().getClass().equals(SurplusDiscount.class) ? false : true;
        double priceAfterParentCategoryDiscount = getPriceAfterParentCategoryDiscount(quantity, isCategoryDiscountApplicable);;
        if (isCategoryDiscountApplicable && getCategoryPrice(quantity) > priceAfterParentCategoryDiscount) {
            return priceAfterParentCategoryDiscount;
        }
        return getCategoryPrice(quantity);
    }

	private double getCategoryPrice(int quantity){
		return discount.getPriceAfterDiscount(quantity, this);
	}

	private double getPriceAfterParentCategoryDiscount(int quantity, boolean isCategoryDiscountApplicable){
		if (Optional.ofNullable(parentCategory).isPresent() && isCategoryDiscountApplicable) {
			return parentCategory.getPriceAfterCategoryDiscount(quantity, this);
		}else
			return 0;
	}
	
}
