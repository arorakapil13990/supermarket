package com.tw.supermarket.model;

import com.tw.supermarket.model.inteface.SellingUnit;

public class WeightInKiloGram implements SellingUnit {

	@Override
	public String getUnit() {
		return "kg";
	}

}
