package main;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;

public class StreamMatch {
	public static void main(String[] args) {
		int[] digits = { 1, 2, 1, 4, 5, 8, 10, 4, 12 };
//	
//	1 st: is there any element that is divisible by 10
		boolean anyMatch = Arrays.stream(digits).anyMatch(digit -> digit % 10 == 0);
		System.out.println("anyMatch: " + anyMatch);

//	2 nd: find the first element that is divisible by 4
		OptionalInt optInt = Arrays.stream(digits).filter(digit -> digit % 4 == 0).findFirst();
		if (optInt.isPresent()) {
			System.out.println("VALUE: " + optInt.getAsInt());
		}
//	3 nd: find the element that is divisible by 5 in the list
		OptionalInt optInt3 = Arrays.stream(digits).filter(digit -> digit % 5 == 0).findAny();
		if (optInt3.isPresent()) {
			System.out.println("optInt: " + optInt3.getAsInt());
		}
//	4 th: does all elements less than 100
		boolean allMatch = Arrays.stream(digits).allMatch(digit -> digit < 100);
		System.out.println("allMatch: " + allMatch);
//	5 th: does no elements greater than 0
		boolean noneMatch = Arrays.stream(digits).noneMatch(digit -> digit > 0);
		System.out.println("noneMatch: " + noneMatch);

	}
}
