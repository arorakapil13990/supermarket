package com.tw.supermarket.model;

import com.tw.supermarket.model.inteface.Discount;

public class NoDiscount implements Discount {

	@Override
	public double getDiscountedPrice(int itemPrice, int quantity) {
		return itemPrice*quantity;
	}

}
