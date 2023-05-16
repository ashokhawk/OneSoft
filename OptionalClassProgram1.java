package com.Java8;

//ofNullable
import java.util.Optional;

public class OptionalClassProgram1 {
	public static void main(String[] args) {
		
		String word=null;
		
		Optional<String> a=Optional.ofNullable(word);
		
		if(a.isPresent()) {
			System.out.println(word.toUpperCase());
		}
		
		else {
			System.out.println("It is null");
		}
		System.out.println(a.orElse(word));
 	}

}
