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
	public double getDiscountedPrice(Item item) {
		int quant = item.getQuantity();
		int price = 0;
		int n = (x + y) / quant;
		while (n > 0) {
			price = price + x * item.getProduct().getPrice();
			n--;
			quant = quant - (x + y);
		}
		if (quant > 0) {
			price = price + (quant * item.getProduct().getPrice());
		}
		return price;
	}

}
