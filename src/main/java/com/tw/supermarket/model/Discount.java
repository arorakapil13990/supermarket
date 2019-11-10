package com.tw.supermarket.model;

public interface Discount {
	
	double getDiscountedPrice(int quantity, Product product);

}
