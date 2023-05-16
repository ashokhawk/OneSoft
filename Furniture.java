package com.Java8;

//default keyword
public interface Furniture {
	public String brand(String brand);
	
	public default int findNetPrice(String type) {
		if(type.equals("Wood")) {
			return 5000;
			}
		
		else {
			return 2000;
		}
	}
}
