package com.tw.supermarket.model.inteface;

import com.tw.supermarket.model.Product;

public interface Discount {
	
	double getDiscountedPrice(int quantity, Product product);

}
