package com.Java8;

public class UsePen {
	
	public static void main(String[] args) {
		
		
		Pen quality=(a)->{ if(a<20) {
			return "bad quality";
		 }
		
		else {
			return "good quality";
		}
		};
		
		System.out.println(quality.findQuality(100));
	}
	
	
	
}


