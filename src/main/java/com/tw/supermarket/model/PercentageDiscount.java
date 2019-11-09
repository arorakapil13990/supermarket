package com.tw.supermarket.model;

import com.tw.supermarket.model.inteface.Discount;

public class PercentageDiscount implements Discount {

	private int x;

	public PercentageDiscount(int x) {
		super();
		this.x = x;
	}

	@Override
	public double getDiscountedPrice(int quantity, Product product) {
		int price = product.getPrice();
		int itemCost = quantity * price;
		return itemCost - ((itemCost*x)/100);
	}

}
