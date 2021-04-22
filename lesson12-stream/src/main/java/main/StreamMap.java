package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMap {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("Java", "PHP", "Net", "Python");
		
		Set<Integer> set = words.stream()
				.map(String::length) // 4 3 3 6 Stream<Integer>
				.collect(Collectors.toSet()); // 4 3 36
		System.out.println("size: " + set.size());
		set.forEach(System.out::println);
		
		System.out.println("===============");
		int[][] a2D = {{1, 2, 3}, {4, 5}, {6, 7, 8}};
		
//		int[] evenNbrs =  Arrays.stream(a2D)
//									// không lỗi vì lúc này tham số trong labda expression chưa đc define kiểu
//									// --> tham số lúc này được nhìn nhận như một generic type
//									// không lỗi ở compile
//									.flatMapToInt(Arrays::stream) // t -> Arrays.stream(t) ~ lambda expression
//									.filter(t -> t % 2 == 0)
//									.toArray();
//		Arrays.stream(evenNbrs).forEach(System.out::println);
		
		
		
//		int[] evenNumbers = Arrays.stream(a2D)
//								.flatMapToInt(new Function<int[], IntStream>() {
//									@Override
//									public IntStream apply(int[] t) {
//										// TODO Auto-generated method stub
//										return Arrays.stream(t);
//									}
//								})
//								.filter(t -> t % 2 == 0)
//								.toArray();
//		
//		Arrays.stream(evenNumbers).forEach(System.out::println);
		
//		int[] evenNbrs = Arrays.stream(a2D)
//				.flatMapToInt(Arrays::stream)
//				.filter(t -> t % 2 == 0)
//				.toArray();
//		Arrays.stream(evenNbrs).forEach(System.out::println);
		
		List<Number> evenNbrs = Arrays.stream(a2D)
										.flatMap(new Function<int[], Stream<? extends Number>>() {
											@Override
											public Stream<? extends Number> apply(int[] t) {
												// TODO Auto-generated method stub
												return Arrays.stream(t).boxed();
											}
										})
										.collect(Collectors.toList());
		
		System.out.println("=====================");
		
		List<List<String>> cards = Arrays.asList(
				Arrays.asList("3 chuồn", "2 cơ", "4 rô"),
				Arrays.asList("7 chuồn", "3 cơ", "2 rô"),
				Arrays.asList("8 chuồn", "4 cơ", "5 rô")
				);
		// filters cards are 2
		// List<String>: 2 cơ, 2 rô
//		Set<String> twoCards = cards.stream()
//				.flatMap(new Function<List, Stream<? extends String>>() {
//					@Override
//					public Stream<? extends String> apply(List t) {
//						// TODO Auto-generated method stub
//						return t.stream();
//					}
//				})
//				.filter(t -> t.startsWith("2"))
//				.collect(Collectors.toSet());
//		twoCards.stream().forEach(System.out::println);
		
		
		Set<String> cardResult = cards.stream()
			.flatMap(Collection::stream)
			.filter(t -> t.startsWith("2"))
			.collect(Collectors.toSet());
		
		cardResult.forEach(System.out::println);
		
		
		
		
		
		
		
		
		
		
		
	}
}
