package com.Java8;

public class UseMaxNumber {
	public static void main(String[] args) {
		
		Methods m=new Methods();
		
		MaxNumber z=m :: findMaxNum;
		
		int[] a= {3,4,5,6,7,8};
		
		System.out.println(z.maxNum(a));
		
	}

}
