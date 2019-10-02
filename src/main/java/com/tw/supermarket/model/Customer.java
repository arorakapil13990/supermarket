package com.tw.supermarket.model;

import com.tw.supermarket.dto.Cart;

public class Customer {

	private String name;
	private Cart cart;

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
