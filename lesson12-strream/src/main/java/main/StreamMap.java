package main;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMap {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("java", "PHP", "net", "python");
		Set<Integer> set = words.stream()
			 .map(String :: length)
			 .collect(Collectors.toSet());
		System.out.println("size: " + set.size());	
		
		//get even digits -> filter
		//Stream: 1 2 3 4 5 6 7 8		
		int[][] a2D = {{1,2,3},{4,5}, {6,7,8}};		
		int[] evenNbrs = Arrays.stream(a2D) // Stream<int[]>
				.flatMapToInt(i -> Arrays.stream(i)) // int[] -> IntStream => IntStream
				.filter(t -> t % 2 == 0)
				.toArray();
		Arrays.stream(evenNbrs).forEach(System.out::println);
		
		List<List<String>> cards = Arrays.asList(
				Arrays.asList("3 Chuồn", "2 Cơ", "4 Rô"),
				Arrays.asList("7 Chuồn", "3 Cơ", "2 Rô"),
				Arrays.asList("8 Chuồn", "4 Cơ", "5 Rô")
		);
		System.out.println("===============");
		// filter cards are 2
		//list<String>: 2 cơ, 2 rô
		Set<String> cardResult = cards.stream()
			 .flatMap(Collection :: stream)
			 .filter(c -> c.startsWith("2"))
			 .collect(Collectors.toSet());
		cardResult.forEach(System.out::println);
	}
}
