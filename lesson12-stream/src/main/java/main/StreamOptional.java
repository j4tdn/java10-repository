package main;

import java.util.Optional;

public class StreamOptional {
	public static void main(String[] args) {
		String value =  null;
		
		Optional<String> ov = Optional.ofNullable(value);
		ov = Optional.ofNullable(value);
		System.out.println("isPresent: " + ov.isPresent()); // kiem tra null hay k
		ov.ifPresent(o -> System.out.printf("value: " + o));// khac null thi tra ve gia tri ko thi` exception
		System.out.println("value2: " + ov.get());// khac null thi tra ve gia tri ko thi` exception
		System.out.println("orElse: " + ov.orElse("bye"));// null thi` tra ve bye k thi` tra ve value
	}
}
