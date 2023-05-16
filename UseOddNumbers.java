package com.Java8;

import java.util.ArrayList;
import java.util.List;

public class UseOddNumbers {
	public static void main(String[] args) {
		
		List<Integer> a=new ArrayList<>();
		
		List<Integer> c= new ArrayList<>();
		
		c.add(3);
		c.add(4);
		c.add(6);
		c.add(7);
		c.add(8);
		c.add(6);
		
		OddNumbers z=(q) -> {for(int i=0;i<c.size();i++) {
			
		}
		c.forEach(x->System.out.println(x));
		};
	

	}
}