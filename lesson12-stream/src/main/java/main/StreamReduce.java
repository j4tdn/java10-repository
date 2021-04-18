package main;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class StreamReduce {
	public static void main(String[] args) {
		List<Integer> digits = Arrays.asList(1, 2, 3);

		// Get SUM
		Integer sum = digits.stream()
				.reduce(0, Integer::sum); // sum (a,b) ->a+b
		Integer sub = digits.stream()
				.reduce(0, Math::subtractExact); // sum (a,b) ->a+b
	OptionalInt	min = digits.stream()
			.mapToInt(digit -> digit)
			.min();
		System.out.println("sum: " + sum);
		System.out.println("min: " + min.getAsInt());
		Optional<Integer> result = digits.stream()
				.reduce(StreamReduce::lcm);
		System.out.println("result" + result.orElse(0));
	}
	private static int gcd(int a, int b) {
		
		if (a == 0) return b;
		if (b == 0) return a;
		while(a != b) {
			if (a > b) {
				a = a - b;
			} else {
				b = b - a;
			}
		}
		return a;
	}

	private static int lcm(int a, int b) {
		return a * b / gcd(a,b);
	}
}
