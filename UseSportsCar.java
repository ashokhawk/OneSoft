package com.Java8;

public class UseSportsCar {

	
	public static void main(String[] args) {
		
		SportsCar sc=new SportsCar();
		
		System.out.println(sc.brand("ABC"));
		
		System.out.println(Car.findNetPrice(50000));
		
		System.out.println(sc.findNetPrice(54000));
		
	}
}
