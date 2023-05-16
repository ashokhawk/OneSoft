package com.Java8;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;


public class UsePredicate {

	public static void main(String[] args) {
		
		Predicate<Integer> p=(a) ->a%2==0;
		System.out.println(p.test(10));
	
	
	Person person =new Person();
	Consumer<Person> setName=t ->t.setName("Ashok");
	setName.accept(person);
	System.out.println(person.getName());
	
	Supplier<Double> getRandomDouble = () ->Math.random();
	System.out.println(getRandomDouble.get());
	
	Function<Integer,String> getInt= t ->t*10+" ismultiplied by 10";
	System.out.println(getInt.apply(3));
}
}