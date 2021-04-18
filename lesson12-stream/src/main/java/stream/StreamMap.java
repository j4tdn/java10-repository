package stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamMap {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("Java", "PHP", ".Net", "Python", "Ruby", "JavaScript");
		Set<Integer> lengths = words.stream().map(String::length).collect(Collectors.toSet());
		lengths.forEach(System.out::println);
		
		System.out.println("----------------");
		
		int[][] a2D = {{1, 2, 3, 4}, {5, 6}, {7, 8, 9}};
		int[] evenNumbers = Arrays.stream(a2D).flatMapToInt(Arrays::stream).filter(t -> t % 2 == 0).toArray();
		Arrays.stream(evenNumbers).forEach(System.out::println);
		
		System.out.println("----------------");
		
		List<List<String>> cards = Arrays.asList(
											Arrays.asList("3 chuồn", "2 cơ", "4 rô"),
											Arrays.asList("7 chuồn", "3 cơ", "2 rô"),
											Arrays.asList("8 chuồn", "4 cơ", "5 rô"));
		Set<String> cardContain2 =	cards.stream()
										.flatMap(Collection::stream)
										.filter(s -> s.contains("2"))
										.collect(Collectors.toSet());
		cardContain2.forEach(System.out::println);
		
		Arrays.stream(evenNumbers).reduce((a, b) -> a + b).getAsInt();
	}
}
