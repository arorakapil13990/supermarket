package com.tw.supermarket.main;

import com.tw.supermarket.model.Category;
import com.tw.supermarket.model.VolumeInLitres;
import com.tw.supermarket.model.WeightInKiloGram;
import com.tw.supermarket.model.inteface.Categorizable;
import com.tw.supermarket.model.inteface.SellingUnit;

public class SuperMarketApplication {

	public static void main(String[] args) {
		
		SellingUnit inKG = new WeightInKiloGram();
		SellingUnit inLitres = new  VolumeInLitres();
		

	}

}
