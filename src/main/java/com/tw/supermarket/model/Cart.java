package com.tw.supermarket.model;

import java.util.List;

public class Cart {

	private int id;
	private List<Item> items;
	private Customer customer;
	
	public Customer getCustomer() {
		return customer;
	}
	public int getId() {
		return id;
	}
	public List<Item> getItems() {
		return items;
	}

    public Cart(List<Item> items, Customer customer) {
        this.items = items;
        this.customer = customer;
    }
}
