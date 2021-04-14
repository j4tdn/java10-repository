package main;

import java.util.Arrays;
import java.util.OptionalInt;

public class StreamMatch {
	public static void main(String[] args) {
		
	
	int[] digits =  {1, 35, 1, 4, 5, 8, 10, 4, 12};
	// 1st: is there any element that is divisible by 10
	boolean anyMatch = Arrays.stream(digits)
	.anyMatch(digit  -> digit %10 == 0);
	System.out.println("anyMatch: " + anyMatch);
			
	//2nd: find the first element that is divisible by 4
	OptionalInt optInt =  Arrays.stream(digits)
	.filter(digit-> digit % 4 == 0)
	.findFirst();
	if (optInt.isPresent()) {
		System.out.println("VALUE: " + optInt.getAsInt());
		
	}
	//3nd: find the element that is divisible by 5 in the list
	OptionalInt optInt3 =  Arrays.stream(digits)
			.filter(digit-> digit % 5 == 0)
			.findAny();
	if (optInt3.isPresent()) {
		System.out.println("optInt3" + optInt3);
		
	}
	//4th: does all elements less than 100
	Boolean optInt4 =  Arrays.stream(digits)
						.allMatch(digit-> digit < 100);
	System.out.println("optInt4: " + optInt4);
	//5th: does no elements greater than 0
	Boolean optInt5 =  Arrays.stream(digits)
			.noneMatch(digit-> digit > 0);
	System.out.println("optInt5: " + optInt5);
}
}
	