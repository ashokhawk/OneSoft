package com.Java8;

import java.util.Scanner;

public class ScannerArithmeticAndRelational {
	public static void main(String[] args) {
		
	
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter num1: ");
	int num1=sc.nextInt();


	System.out.println("Enter num2: ");
	int num2=sc.nextInt();
	
	System.out.println("addition is "+(num1+num2));
	System.out.println("subraction is "+(num1-num2));
	System.out.println("multiply is "+(num1*num2));
	System.out.println("Division is "+(num1/num2));

	System.out.println("num1 is greater is "+(num1>num2));
	System.out.println("num1 is lesser is "+(num1<num2));
	System.out.println("lesser than or equal to "+(num1<=num2));
	System.out.println("greater than or greater to "+(num1>=num2));
}

}