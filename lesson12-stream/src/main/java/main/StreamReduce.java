package main;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduce {
	public static void main(String[] args) {
		List<Integer> digits = Arrays.asList(1, 2, 3);

		Integer sum = digits.stream().reduce(0, (a, b) -> a + b);
		System.out.println("sum: " + sum);
		
		Optional<Integer> result = digits.stream().reduce(StreamReduce::LCM);
		System.out.println("Result: " + result.orElse(0));
	}
	
	private static int LCM(int a, int b) {
		return (a*b) / GCD(a,b);
	}

	private static int GCD(int a, int b) {
		if(a == 0) return b;
		if(b == 0) return a;
		while (a != b) {
			if (a > b) {
				a = a - b;
			} else {
				b = b - a;
			}
		}
		return a;
	}
}
