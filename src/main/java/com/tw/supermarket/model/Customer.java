package com.tw.supermarket.model;

public class Customer {

	private int id;
	private String name;

    public Customer(String name) {
        this.name = name;
    }

	public String getName() {
		return name;
	}
}
