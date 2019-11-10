package com.tw.supermarket.emums;

public enum SellingUnit {
	LITRES("lt"), KILOGRAMS("kg");

	private String unit;

	SellingUnit(String unit) {
		this.unit = unit;
	}

	public String getUnit() {
		return unit;
	}

}
