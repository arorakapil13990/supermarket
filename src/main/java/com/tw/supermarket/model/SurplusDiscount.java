package com.tw.supermarket.model;

public class SurplusDiscount implements Discount {

	int baseQuantity, surplusQuantity; 

	public SurplusDiscount(int baseQty, int surplusQty) {
		super();
		this.baseQuantity = baseQty;
		this.surplusQuantity = surplusQty;
	}

	@Override
	public double getDiscountedPrice(int quantity, Product product) {
		int discountedPrice = 0;
		int price = product.getPrice();
		int n = quantity/(baseQuantity + surplusQuantity)  ;
		while (n > 0) {
			discountedPrice = discountedPrice + (baseQuantity * price);
			n--;
			quantity = quantity - (baseQuantity + surplusQuantity);
		}
		if (quantity > 0) {
			discountedPrice = discountedPrice + (quantity * price);
		}
		return discountedPrice;
	}

}
