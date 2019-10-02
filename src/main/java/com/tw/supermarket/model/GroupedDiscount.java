package com.tw.supermarket.model;

import com.tw.supermarket.model.inteface.Discount;

public class GroupedDiscount implements Discount {

	int x, y; // will change x,y and will also use weight

	public GroupedDiscount(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public double getDiscountedPrice(int itemPrice, int quantity) {
		int discountedPrice = 0;
		int n = (x + y) / quantity;
		while (n > 0) {
			discountedPrice = discountedPrice + x * itemPrice;
			n--;
			quantity = quantity - (x + y);
		}
		if (quantity > 0) {
			discountedPrice = discountedPrice + (quantity * itemPrice);
		}
		return discountedPrice;
	}

}
