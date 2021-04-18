package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduce {
	public static void main(String[] args) {
		List<Integer> digits = Arrays.asList(1, 2, 3);
		Integer sum = digits.stream().reduce(0, Integer::sum);
		Integer sub = digits.stream().reduce(0, Math::subtractExact);
		Integer max = digits.stream().reduce(Integer.MIN_VALUE, (a, b) -> a > b ? a : b);
		
		int min = digits.stream().mapToInt(d -> d.intValue()).min().orElse(0);
		
		// get lcm of List
		Optional<Integer> lcm =  digits.stream().reduce(StreamReduce::lcm);
		System.out.println("lcm: " + lcm.orElse(0));
	}
	
	private static int gcd(int a, int b) {
		if (a == 0) {
			return b;
		}
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}
	
	private static int lcm(int a, int b) {
		return (a * b) / gcd(a, b);
	}
}
