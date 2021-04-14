package main;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamMap {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("Java", "PHP", "Net", "Python");
		Set<Integer> lengths = words.stream().map(String::length).collect(Collectors.toSet());

		int[][] a2D = { { 1, 2, 3 }, { 4, 5 }, { 6, 7, 8 } };

		int[] evenNbs = Arrays.stream(a2D).flatMapToInt(Arrays::stream).filter(t -> t % 2 == 0).toArray();

		List<List<String>> cards = Arrays.asList(Arrays.asList("3 chuồn", "2 cơ", "4 rô"),
				Arrays.asList("7 chuồn", "3 cơ", "2 rô"), Arrays.asList("8 chuồn", "4 cơ", "5 rô"));

		Set<String> card2s = cards.stream().flatMap(t -> t.stream()).filter(t -> t.contains("2"))
				.collect(Collectors.toSet());

		card2s.forEach(System.out::println);
	}
}
