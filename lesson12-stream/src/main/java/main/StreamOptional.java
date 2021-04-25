package main;

import java.util.Optional;
import java.util.function.Consumer;

public class StreamOptional {
	public static void main(String[] args) {
		String value = null;
		
		// ofNullable xử lý những trường hợp có khả năng gây ra nullPointerException
		Optional<String> ov = Optional.ofNullable(value);
		
		System.out.println("isPresent: " + ov.isPresent());
		System.out.println("orElse: " + ov.orElse("bye"));
		ov.ifPresent(o -> System.out.println("In ifPresent() "));
	//	System.out.println("value 2: " + ov.get());
		
		
		
		
	}
}
