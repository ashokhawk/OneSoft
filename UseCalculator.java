package com.Java8;

public class UseCalculator {

	public static void main(String[] args) {
		
		Calculator add=(num1,num2) ->num1+num2;
		System.out.println(add.math(10, 3));
		
		Calculator sub=(num1,num2) ->num1-num2;
		System.out.println(sub.math(10, 3));
		
		Calculator mul=(num1,num2) ->num1*num2;
		System.out.println(mul.math(10, 3));
		
		Calculator square=(num1,num2) ->num1*num1;
		System.out.println(square.math(10, 3));
		
		Calculator division=(num1,num2) ->num1/num2;
		System.out.println(add.math(10, 3));
		
		System.out.println(Calculator.quad(7));
		System.out.println(add.cube(5));
		
		
	}
}
