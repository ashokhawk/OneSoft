package com.Java8;

//static keyowrd
public interface Car {
	
	public String brand(String brand);
	
	public static int findNetPrice(int price) {
		return price+(price*5/100);
	}

	
}
