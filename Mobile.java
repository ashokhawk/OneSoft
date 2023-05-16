package com.Java8;

public class Mobile implements Electronics {

	public int capacity(int capacity) {
		return capacity;
	}
	
	public String onOff(boolean isOn) {
		if(isOn==false) {
		return " is Working";
	}
		else {
			return "Display gone";
		}
}
	
	
}
