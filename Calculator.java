package com.Java8;


@FunctionalInterface
public interface Calculator {
	public int math(int a,int b);


public default int cube(int num) {
	return num*num*num;
}

public static int quad(int num) {
	return num*num*num*num;
	
}


	
}
