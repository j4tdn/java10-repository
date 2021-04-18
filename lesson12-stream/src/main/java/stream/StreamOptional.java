package stream;

import java.util.Optional;

public class StreamOptional {
	public static void main(String[] args) {
		String value = "Hello";
		Optional<String> ov = Optional.of(value);
		
		System.out.println("is present: " + ov.isPresent());
		ov.ifPresent(System.out::println);
		System.out.println("value 2: " + ov.get());
		System.out.println("orElse: " + ov.orElse("Bye"));
	}	
}
