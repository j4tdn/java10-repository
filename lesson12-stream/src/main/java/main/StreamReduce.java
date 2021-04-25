package main;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.BinaryOperator;

public class StreamReduce {
	public static void main(String[] args) {
		List<Integer> digits = Arrays.asList(1, 2, 3);
		
//		Integer sum01 = digits.stream() // Stream<Integer>
//				.reduce(0, new BinaryOperator<Integer>() {
//					@Override
//					public Integer apply(Integer t, Integer u) {
//						// TODO Auto-generated method stub
//						return Integer.sum(t, u);
//					}
//				});
		// Get SUM
		Integer sum = digits.stream()
				.reduce(0, (a, b) -> a + b);
		
		Optional<Integer> sumOpInt = digits.stream()
				.reduce(Integer::sum);
		
		Integer max = digits.stream()
				.reduce(Integer.MIN_VALUE ,(a, b) -> a > b ? a : b);
		Integer min = digits.stream()
				.reduce(Integer.MAX_VALUE, (a, b) -> a < b ? a : b);
		System.out.println("sum: " + sum);
		// orElse(<givenValue>) -> if value's null, take the given number
		System.out.println("sumOpInt: " + sumOpInt.orElse(0));
		
		System.out.println("maxOpInt: " + max);
		System.out.println("minOpInt: " + min);
		
		System.out.println(digits.stream()
				.mapToInt(d -> d)
				.max().getAsInt()
				);
		
		Optional<Integer> result = digits.stream()
				// StreamReduce là class, LCM là hàm trong class
				// (a, b) -> LCM(a, b)
		.reduce(StreamReduce::LCM);
		
		System.out.println("LCM: " + result.orElse(0));
		
	}
	
	// Bội chung nhỏ nhất
	private static int LCM(int a, int b) {
		// Bội chung nhỏ nhất bằng tích hai số hạng chia cho ước chung lớn nhất
		return (a * b) / GCD(a, b);
	}
	
	// Greatest Common Divisor (Ước chung lớn nhất)
	private static int GCD (int a, int b) {
		if(a == 0) {
			return b;
		}
		if(b == 0) {
			return a;
		}
		
		while(a != b) {
			if(a > b) {
				a = a - b;
			} else {
				b = b - a;
			}
		}
		return a;
	}
}
