package main;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMap {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("Java", "PHP", "Net", "Python");
		Set<Integer> set = words.stream().map(String::length) // String
				.collect(Collectors.toSet());
		System.out.println("size: " + set.size());

		int[][] a2D = { { 1, 2, 3 }, { 4, 5 }, { 6, 7, 8 } };
		int[] evenNbrs = Arrays.stream(a2D).flatMapToInt(Arrays::stream).filter(t -> t % 2 == 0).toArray();
		Arrays.stream(evenNbrs).forEach(System.out::println);
		

		List<List<String>> cards = Arrays.asList(Arrays.asList("3 chuon ", "2 co ", "4 ro"),
				Arrays.asList("7 chuon ", "3 co ", "2 ro"), Arrays.asList("8 chuon ", "4 co ", "5 ro")

		);
		System.out.println("===========================");
		Set<String> cardResult = cards.stream()
		.flatMap(l -> l.stream())
		.filter(c -> c.startsWith("2"))
		.collect(Collectors.toSet());
			
		cardResult.forEach(System.out::println);
	}
}
