package main;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMap {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("java", "php", "Net", "python");
		Set<Integer> set = words.stream().map(String::length) // 4 3 3 6 Stream<Integer>
				.collect(Collectors.toSet()); // 3

		System.out.println("size: " + set.size());

		int[][] a2D = { { 1, 2, 3 }, { 4, 5 }, { 6, 7, 8 } };
		int[] evenNbrs = Arrays.stream(a2D) // Stream<Array>
				.flatMapToInt(Arrays::stream) // Stream<intstream>
				.filter(t -> t % 2 == 0) // Arrayid<intstream>
				.toArray();
		Arrays.stream(evenNbrs).forEach(System.out::println);
		System.out.println("=======================");

		List<List<String>> cards = Arrays.asList(
				Arrays.asList("3 chuồn", "2 cơ", "4 rô"),
				Arrays.asList("7 chuồn", "3 cơ", "2 rô"),
				Arrays.asList("8 chuồn", "4 cơ", "5 rô"));

		Set<String> cardResult = cards.stream()
				.flatMap(l -> l.stream())
				.filter(c -> c.startsWith("2"))
				.collect(Collectors.toSet());
		cardResult.forEach(System.out::println);
	}
}
