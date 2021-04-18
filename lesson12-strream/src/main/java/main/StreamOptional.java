package main;

import java.util.Optional;

public class StreamOptional {
	public static void main(String[] args) {
		String value = null;
		
		Optional<String> ov = Optional.ofNullable(value);
		// isPresent kiểm tra hàm có tồn tại hay k
		System.out.println("isPresent: "+ ov.isPresent());
		ov.ifPresent(o -> System.out.print("value1: "+ o));
		System.out.println("valueq: " + ov.get());
		System.out.println("orElse: " + ov.orElse("bye"));
	}
}
