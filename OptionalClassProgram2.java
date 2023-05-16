package com.Java8;

//of
import java.util.Optional;

public class OptionalClassProgram2 {
	public static void main(String[] args) {
		
		String word="ahawk";
		
		Optional<String> a=Optional.of(word);
		
		if(a.isEmpty()) {
			System.out.println("true");
		}
		
		else {
			System.out.println("false");
		}
		System.out.println(a.orElse(word));
}
}
