package com.tw.supermarket.model;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CategoryTest {

	List<Item> items = new ArrayList<Item>();

	@Before
	public void setup() {
		SellingUnit inKG = new WeightInKiloGram();
		Category produce = new Category("Produce", new PercentageDiscount(10), null);
		Category fruits = new Category("Fruits", new PercentageDiscount(18), produce);
		Product apple = new Product("Apple", 50, fruits, inKG, new SurplusDiscount(3, 1));
		Item appleItem = new Item(6, inKG, apple);
		items.add(appleItem);
	}

	@Test
	public void testDiscountedPrice() {
	Assert.assertEquals(250, items.get(0).getItemDiscountedPrice(),0);
	}
	
	@Test
	public void testItemPrice() {
	Assert.assertEquals(300, items.get(0).getItemPrice(),0);
	}
}
