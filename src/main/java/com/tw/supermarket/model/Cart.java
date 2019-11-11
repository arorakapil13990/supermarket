package com.tw.supermarket.model;

import java.util.List;

public class Cart {

	private int id;
	private List<Item> items;
	private Customer customer;
	private double cartPriceBeforeDiscount;
	private double cartPriceAfterDiscount;
	
    public Cart(int id, List<Item> items, Customer customer) {
        this.id = id;
        this.items = items;
        this.customer = customer;
    }

    public double getCartPriceBeforeDiscount() {
        return cartPriceBeforeDiscount;
    }

    public void setCartPriceBeforeDiscount(double cartPriceBeforeDiscount) {
        this.cartPriceBeforeDiscount = cartPriceBeforeDiscount;
    }

    public double getCartPriceAfterDiscount() {
        return cartPriceAfterDiscount;
    }

    public void setCartPriceAfterDiscount(double cartPriceAfterDiscount) {
        this.cartPriceAfterDiscount = cartPriceAfterDiscount;
    }

    public void display() {
        String outputString = "";
        System.out.println("Customer :" + customer.getName());
        System.out.println("\nItem         Qty	     Amount");
        double cartPrice = calculateCartPriceAfterDiscount();
        for (Item item : items) {
            double itemPrice = getItemPrice(item);
            System.out.println(item.getProduct().getName() + "         " + item.getQuantity() + item.getProduct().getSellingUnit() + "         " + item.getItemPriceAfterDiscount());
        }
        System.out.println("--------------------------------------------");
        System.out.println("Total Amount	       		  " + cartPrice + "Rs");
        outputString = outputString + this.getCartPriceBeforeDiscount() + "-" + this.getCartPriceAfterDiscount() + " = ";
        System.out.println("You Saved 		" + outputString + (this.getCartPriceBeforeDiscount() - this.getCartPriceAfterDiscount()) + "Rs");
    }

    public double calculateCartPriceAfterDiscount() {
        for (Item item : items) {
            double itemPriceAfterDiscount = item.calculateItemPriceAfterDiscount();
            item.setItemPriceAfterDiscount(itemPriceAfterDiscount);
            this.setCartPriceAfterDiscount(this.getCartPriceAfterDiscount() + itemPriceAfterDiscount);
            this.setCartPriceBeforeDiscount(this.getCartPriceBeforeDiscount()+item.getItemPrice());
        }
        return cartPriceAfterDiscount;
    }

    public double getItemPrice(Item item){
        double totalItemPrice = 0;
        return totalItemPrice + item.getItemPrice();
    }

}
