package ex;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Ex01 {
	public static void main(String[] args) {
		List<Integer> digits = Arrays.asList(1, 5 , 5, 10 ,9 , 8);
		System.out.println("Các phần tử chỉ xuất hiện một lần duy nhất trong dãy N: ");
		digits.stream()
				.filter(i -> Collections
				.frequency(digits, i) == 1)
				.collect(Collectors.toSet())
				.forEach(System.out::println);

		System.out.println("Các phần tử xuất nhiều hơn một lần trong dãy N:  ");
		digits.stream()
				.filter(i -> Collections
				.frequency(digits, i) > 1)
				.collect(Collectors.toSet())
				.forEach(System.out::println);

	}

}
