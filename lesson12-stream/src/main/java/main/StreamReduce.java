package main;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class StreamReduce {
	public static void main(String[] args) {
		List<Integer> digits = Arrays.asList(1,2,3);
		
		//get sum
		Integer sum = digits.stream()
				.reduce(0, (a,b) -> a+b);
		// .reduce(0, Integer::sum);
		// max: .reduce(0,(a,b)-> a<b ? a:b);
		// min: reduce(Integer.MAX_VALUE, (a,b) -> a<b  a:b);
		System.out.println("Sum: " + sum);
		
		
		//get sum
				OptionalInt optInt = digits.stream()
						.mapToInt(digit -> digit)
						.min();
				// .reduce(0, Integer::sum);
				// max: .reduce(0,(a,b)-> a<b ? a:b);
				// min: reduce(Integer.MAX_VALUE, (a,b) -> a<b  a:b);
				System.out.println("optInt " + optInt.orElse(0));
				Optional<Integer> result = digits.stream()
						.reduce(StreamReduce::LCM);
				System.out.println("LCM: " + result.orElse(0));
	}
	
	private static int LCM(int a, int b) {
		return (a*b) / GCD(a,b);
	}
	
	private static int GCD(int a, int b) {
		if (a== 0) return b;
		if (b== 0) return a;
		
		while (a!= b) {
			if (a>b) {
				a= a-b;
			}
			else {
				b= b-a;
			}
		}
		return a;
	}
}
