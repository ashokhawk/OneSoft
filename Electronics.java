package com.Java8;

//static and default
public interface Electronics {

	public int capacity(int capacity);
	

	public static int reSaleAmount(int price) {
		return price/2;
	}
	
	public default String onOff(boolean isOn) {
		if(isOn==true) {
		return "Working";
	}
		else {
			return "Not Working";
		}
	}
}
