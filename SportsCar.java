package com.Java8;

public class SportsCar implements Car {

	public String brand(String brand) {
		return brand;
	}
	
	
	public int findNetPrice(int price) {
		return price+(price*5/100);
	}
}

