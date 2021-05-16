package bai1;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Ex01 {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5, 6, 5, 5, 3, 1 };
		int[] uniqueNumbers = getNumbersWithPredicate(numbers, number -> number == 1);
		show(uniqueNumbers);
	}

	private static int[] getNumbersWithPredicate(int[] numbers, Predicate<Long> predicate) {
		int[] result = Arrays.stream(numbers).boxed()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet()
				.stream()
				.filter(entry -> predicate.test(entry.getValue()))
				.mapToInt(entry -> entry.getKey())
				.toArray();
		return result;
	}

	private static void show(int[] numbers) {
		for (int number : numbers) {
			System.out.println(number);
		}
	}
}
