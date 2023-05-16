package com.Java8;

import java.util.Scanner;

public class ScannerClass {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		String name=s.nextLine();
		

		
		System.out.println("Enter Your Age: ");
		int age=s.nextInt();
		
		System.out.println("Enter your weight: ");
		Float weight=s.nextFloat();
	
		System.out.println("Are u an Adult: ");
		boolean isAdult=s.nextBoolean();
		
		System.out.println();
		
		System.out.println("name is "+name+" age is "+age+"weight is "+weight+"is Adult: ");
	}

}
