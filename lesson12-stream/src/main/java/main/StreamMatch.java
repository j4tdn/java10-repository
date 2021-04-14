package main;

import java.util.Arrays;
import java.util.OptionalInt;

public class StreamMatch {
//	 Example: Give a list of numbers: 1, 2, 1, 4, 5, 8, 10, 4, 12
//	 1
//	st: is there any element that is divisible by 10 - any match
//	 2
//	nd: find the first element that is divisible by 4
//	 3
//	nd: find the element that is divisible by 5 in the list
//	 4
//	th: does all elements less than 100
//	 5
//	th: does no elements greater than 0
	public static void main(String[] args) {
		int[] digits = { 1, 2, 1, 4, 5, 8, 10, 4, 12 };
		boolean anyMatch = Arrays.stream(digits).anyMatch(digit -> digit % 10 == 0);
		System.out.println("anyMatch: " + anyMatch);

		OptionalInt findFirst = Arrays.stream(digits).filter(d -> d % 4 == 0).findFirst();
		if (findFirst.isPresent()) {
			System.out.println("2: " + findFirst.getAsInt());
		}

		OptionalInt opInt3 = Arrays.stream(digits).filter(d -> d % 4 == 0).findAny();
		if (opInt3.isPresent()) {
			System.out.println("3: " + opInt3.getAsInt());
		}

		boolean allMatch = Arrays.stream(digits).allMatch(d -> d < 100);
		System.out.println(allMatch);

		boolean noneMatch = Arrays.stream(digits).noneMatch(d -> d > 0);
		System.out.println(noneMatch);
	}

}
