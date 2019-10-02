package com.tw.supermarket.dto;

import java.util.List;

import com.tw.supermarket.model.Item;

public class Cart {

	private int id;
	private List<Item> items;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	
	
}
