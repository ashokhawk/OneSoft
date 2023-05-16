package com.Java8;

public class UseMaxStringLength {

	public static void main(String[] args) {
		
		MaxStringLength l=new MaxStringLength();
		
		MaxStringLengthh z=l :: findMaxLength;
		
		String[] words= {"Sun","moon","earth","venus","jupiter"};

		System.out.println(z.maxString(words));
		
	}
	
}
