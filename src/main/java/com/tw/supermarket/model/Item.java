package com.tw.supermarket.model;

public class Item {

	private int quantity;
	private Product product;
	private double itemPriceAfterDiscount;

	public Item(int quantity, Product product) {
		this.quantity = quantity;
		this.product = product;
	}
	
	public double calculateItemPriceAfterDiscount(){
		return this.getProduct().getPriceAfterProductDiscount(this.getQuantity());
	}

    public double getItemPriceAfterDiscount() {
        return itemPriceAfterDiscount;
    }

    public void setItemPriceAfterDiscount(double itemPriceAfterDiscount) {
        this.itemPriceAfterDiscount = itemPriceAfterDiscount;
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
