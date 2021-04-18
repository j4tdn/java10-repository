package main;

import java.util.Optional;

public class StreamOptional {
	public static void main(String[] args) {
		String value = null;
		Optional<String> ov = Optional.ofNullable(value);

		System.out.println("isPresent: " + ov.isPresent());
		ov.ifPresent(o -> System.out.println("value1: " + o));
		System.out.println("value2: " + ov.get());
		System.out.println("orElse: " + ov.orElse("bye"));
	}

}
