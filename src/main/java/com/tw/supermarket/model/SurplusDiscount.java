package com.tw.supermarket.model;

public class SurplusDiscount implements Discount {

	int baseQuantity, surplusQuantity; 

	public SurplusDiscount(int baseQty, int surplusQty) {
		this.baseQuantity = baseQty;
		this.surplusQuantity = surplusQty;
	}

	@Override
	public double getPriceAfterDiscount(int quantity, Product product) {
        int discountedPrice = 0;
        int price = product.getPrice();
        int value = quantity/(baseQuantity + surplusQuantity)  ;
        while (value > 0) {
            discountedPrice = discountedPrice + (baseQuantity * price);
            value--;
            quantity = quantity - (baseQuantity + surplusQuantity);
        }
        if (quantity > 0) {
            discountedPrice = discountedPrice + (quantity * price);
        }
        return discountedPrice;
    }
}
