package com.tw.supermarket.model;

import com.tw.supermarket.model.inteface.SellingUnit;

public class VolumeInLitres implements SellingUnit {

	@Override
	public String getUnit() {
		return "Lt";
	}

}
