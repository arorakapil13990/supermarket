package com.tw.supermarket;

import com.tw.supermarket.emums.SellingUnit;
import com.tw.supermarket.model.*;

import java.util.ArrayList;
import java.util.List;

public class SuperMarketApplication {

    public static void main(String[] args) {

        displayOutput();
    }

    private static List<Item> getItems() {
        Category produce = new Category("Produce", new PercentageDiscount(10), null);
        Category fruits = new Category("Fruits", new PercentageDiscount(18), produce);
        Category veg = new Category("Veg", new PercentageDiscount(5), produce);

        Category dairy = new Category("Dairy", new PercentageDiscount(15), null);
        Category milk = new Category("Milk", new PercentageDiscount(20), dairy);
        Category cheese = new Category("Cheese", new PercentageDiscount(20), dairy);

        Product apple = new Product("Apple", 50, fruits, SellingUnit.KILOGRAMS.getUnit(), new SurplusDiscount(3, 1));
        Product potato = new Product("Potato", 30, veg, SellingUnit.KILOGRAMS.getUnit(), new SurplusDiscount(5, 2));
        Product cowMilk = new Product("Cow Milk", 50, milk, SellingUnit.LITRES.getUnit(), new SurplusDiscount(3, 1));

        Product orange = new Product("Orange", 80, fruits, SellingUnit.KILOGRAMS.getUnit(), new PercentageDiscount(20));
        Product tomato = new Product("Tomato", 70, veg, SellingUnit.KILOGRAMS.getUnit(), new PercentageDiscount(10));
        Product gouda = new Product("Gouda", 80, cheese, SellingUnit.KILOGRAMS.getUnit(), new PercentageDiscount(10));

        Item appleItem = new Item(6, apple);
        Item orangeItem = new Item(2, orange);
        Item potatoItem = new Item(14, potato);
        Item tomatoItem = new Item(3, tomato);
        Item cowMilkItem = new Item(8, cowMilk);
        Item goudaItem = new Item(2, gouda);

        List<Item> items = new ArrayList<Item>();

        items.add(goudaItem);
        items.add(orangeItem);
        items.add(potatoItem);
        items.add(appleItem);
        items.add(tomatoItem);
        items.add(cowMilkItem);

        return items;
    }

    private static Price getPrice() {
        Price price = new Price();
        for (Item item : getItems()) {
            double itemDiscountedPrice = item.getItemDiscountedPrice();
            price.setTotalItemPrice(price.getTotalItemPrice() + item.getItemPrice());
            System.out.println(item.getProduct().getName() + "         " + item.getQuantity() + item.getProduct().getSellingUnit() + "         " + itemDiscountedPrice);
            price.setTotalPrice(price.getTotalPrice() + itemDiscountedPrice);
        }
        return price;
    }

    private static void displayOutput() {
        Customer customer = new Customer("Anish Kumar");
        String outputString = "";
        System.out.println("Customer :" + customer.getName());
        System.out.println("\nItem         Qty	     Amount");
        Price price = getPrice();
        System.out.println("--------------------------------------------");
        System.out.println("Total Amount	       		  " + price.getTotalPrice() + "Rs");
        outputString = outputString + price.getTotalItemPrice() + "-" + price.getTotalPrice() + " = ";
        System.out.println("You Saved 		" + outputString + (price.getTotalItemPrice() - price.getTotalPrice()) + "Rs");
    }

}
