package com.tw.supermarket.model;

import com.tw.supermarket.model.inteface.Discount;
import com.tw.supermarket.model.inteface.SellingUnit;

public class Item {

	private int quantity;
	private SellingUnit sellingUnit;
	private Product product;
	private Discount discount;
	
	public Item(int quantity, SellingUnit sellingUnit, Product product, Discount discount) {
		super();
		this.quantity = quantity;
		this.sellingUnit = sellingUnit;
		this.product = product;
		this.discount = discount;
	}
	public Discount getDiscount() {
		return discount;
	}
	public void setDiscount(Discount discount) {
		this.discount = discount;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public SellingUnit getSellingUnit() {
		return sellingUnit;
	}
	public void setSellingUnit(SellingUnit sellingUnit) {
		this.sellingUnit = sellingUnit;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
	
	
}
