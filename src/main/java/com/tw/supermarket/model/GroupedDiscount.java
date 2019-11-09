package com.tw.supermarket.model;

import com.tw.supermarket.model.inteface.Discount;

public class GroupedDiscount implements Discount {

	int x, y; 

	public GroupedDiscount(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public double getDiscountedPrice(int quantity, Product product) {
		int discountedPrice = 0;
		int price = product.getPrice();
		int n = quantity/(x + y)  ;
		while (n > 0) {
			discountedPrice = discountedPrice + (x * price);
			n--;
			quantity = quantity - (x + y);
		}
		if (quantity > 0) {
			discountedPrice = discountedPrice + (quantity * price);
		}
		return discountedPrice;
	}

}
