package exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Ex01 {
	public static void main(String[] args) {
		List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5, 6, 5, 5, 3, 1);
		numbers1
		  .stream()
		  .filter(n -> numbers1
		        .stream()
		        .filter(x -> x == n)
		        .count() == 1)
		   .forEach(System.out::println);
		
		System.out.println("====================");
		List<Integer> numbers2 = Arrays.asList(5, 7, 9, 10, 20, 9, 7, 11);
		Set<Integer> set2 = numbers2
		  .stream()
		  .filter(n -> numbers2
		        .stream()
		        .filter(x -> x == n)
		        .count() == 2)
		   .collect(Collectors.toSet());
		set2.stream().forEach(System.out::println);
		
	}
}
