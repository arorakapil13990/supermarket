package com.tw.supermarket.model;

import com.tw.supermarket.emums.SellingUnit;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class CategoryTest {

	List<Item> items = new ArrayList<Item>();

	@BeforeEach
	public void setup() {
		Category produce = new Category("Produce", new PercentageDiscount(10), null);
		Category fruits = new Category("Fruits", new PercentageDiscount(18), produce);
		Product apple = new Product("Apple", 50, fruits, SellingUnit.KILOGRAMS.getUnit(), new SurplusDiscount(3, 1));
		Item appleItem = new Item(6, apple);
		items.add(appleItem);
	}

	@Test
	public void testPriceAfterCategoryDiscount() {
	Assert.assertEquals(250, items.get(0).calculateItemPriceAfterDiscount(),0);
	}
	
	@Test
	public void testItemPrice() {
	Assert.assertEquals(300, items.get(0).getItemPrice(),0);
	}
}
