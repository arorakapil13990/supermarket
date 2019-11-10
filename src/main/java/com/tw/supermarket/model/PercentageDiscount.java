package com.tw.supermarket.model;

public class PercentageDiscount implements Discount {

	private int percentageValue;

	public PercentageDiscount(int value) {
		this.percentageValue = value;
	}

	@Override
	public double getPriceAfterDiscount(int quantity, Product product) {
		int price = product.getPrice();
		int itemCost = quantity * price;
		return itemCost - ((itemCost*percentageValue)/100);
	}

}
