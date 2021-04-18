package main;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class StreamReduce {
	//BinaryOperator : truyền vào T T trả về T 
	public static void main(String[] args) {
		List<Integer> digits = Arrays.asList(1, 2, 3);
		//get SUM
		Integer sum = digits.stream()//Stream<Integer>
				.reduce(0, (a,b)-> a+b);
		//max: .reduce( Integer.MAX_VALUE, (a,b)->a<b? a:b);
		//cách 2 .reduce(0, Integer::sum);
		// subtract: 
		System.out.println("sum: "+ sum);
		//get SUM
			OptionalInt optInt = digits.stream()//Stream<Integer>
						.mapToInt(digit->digit)
						.min();
				System.out.println("optInt: "+ optInt.orElse(0));
				
				
				//============================================//
				
				
				Optional<Integer> result = digits.stream()
				.reduce( StreamReduce::LCM);
				System.out.println("LCM: " +result.orElse(0));
				
	}
	private static int LCM(int a, int b) {
		return (a*b) / GCD(a, b);
	}
	
	private static int GCD(int a, int b) {
		if (a == 0) return b;
		if (b == 0) return a;
		while (a!=b) {
			if (a>b) {
				a=a-b;
			}else {
				b=b-a;
			}
		}
		return a;
	}

}
