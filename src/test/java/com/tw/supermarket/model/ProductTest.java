package com.tw.supermarket.model;

import com.tw.supermarket.emums.SellingUnit;
import org.junit.Assert;
import org.junit.Test;

public class ProductTest {

    @Test
    public void testPriceAfterProductDiscount() {
        Category produce = new Category("Produce", new PercentageDiscount(10), null);
        Category fruits = new Category("Fruits", new PercentageDiscount(18), produce);
        Product orange = new Product("Orange", 80, fruits, SellingUnit.KILOGRAMS.getUnit(), new PercentageDiscount(20));
        Assert.assertEquals(128, orange.getPriceAfterProductDiscount(2), 0);
    }
}
