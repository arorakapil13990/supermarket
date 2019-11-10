package com.tw.supermarket.model;

public class Item {

	private int quantity;
	private Product product;

	public Item(int quantity, Product product) {
		this.quantity = quantity;
		this.product = product;
	}
	
	public double getItemDiscountedPrice(){
		return this.getProduct().getPriceAfterProductDiscount(this.getQuantity());
	}

	public double getItemPrice() {
		return quantity*product.getPrice();
	}

	public int getQuantity() {
		return quantity;
	}
	public Product getProduct() {
		return product;
	}
	
}
