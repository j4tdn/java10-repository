package demo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalInt;
import java.util.function.BiFunction;

import bean.Trader;
import bean.Transaction;

public class Exercise {
	public static void main(String[] args) {
		List<Transaction> trans = getAllTransaction();
//		1. Find all transactions in the year 2011 and sort them by value (small to high).
		System.out.println("1. Find all transactions in the year 2011 and sort them by value (small to high) :");
		trans.stream()
			.filter(t -> t.getYear() == 2011)
			.sorted(Comparator.comparing(Transaction::getValue))
			.forEach(System.out::println);
		System.out.println("===================================");
		
//		2. Find all transactions have value greater than 300 and sort them by trader’s city
		System.out.println("2. Find all transactions have value greater than 300 and sort them by trader’s city :");
		trans.stream()
			.filter(t -> t.getValue() > 300)
			.sorted(Comparator.comparing(t -> t.getTrader().getCity()))
			.forEach(System.out::println);
		System.out.println("===================================");
		
//		3. What are all the unique cities where the traders work?
		System.out.println("3. What are all the unique cities where the traders work?");
		trans.stream()
			.map(t -> t.getTrader().getCity())
			.distinct()
			.forEach(System.out::println);
		System.out.println("===================================");
		
//		4. Find all traders from Cambridge and sort them by name desc.
		System.out.println("4. Find all traders from Cambridge and sort them by name desc.");
		trans.stream()
			.filter(t -> "Cambridge".equals(t.getTrader().getCity()))
			.sorted((t1,t2) -> t2.getTrader().getName().compareTo( t1.getTrader().getName()))
			.map(t -> t.getTrader().getName())
			.distinct()
			.forEach(System.out::println);
		System.out.println("===================================");
		
//		5. Return a string of all traders’ names sorted alphabetically.
		System.out.println("5. Return a string of all traders’ names sorted alphabetically.");
		trans.stream()
			.map(t -> t.getTrader().getName())
			.sorted()
			.distinct()
			.forEach(System.out::println);
		System.out.println("===================================");
		
//		6. Are any traders based in Milan?
		System.out.println("6. Are any traders based in Milan?");
		boolean anyMilan = trans.stream()
			.anyMatch(t -> "Milan".equals(t.getTrader().getCity()));
			System.out.println(anyMilan);
			System.out.println("===================================");
			
//			7. Count the number of traders in Milan.
			System.out.println("7. Count the number of traders in Milan.");
			long count = trans.stream()
				.filter(t -> "Milan".equals(t.getTrader().getCity()))  
				.map(t -> t.getTrader().getName())	
				.distinct()
				.count();
				System.out.println(count);
			System.out.println("===================================");
			
//				8. Print all transactions’ values from the traders living in Cambridge.
			System.out.println("8. Print all transactions’ values from the traders living in Cambridge.");
				trans.stream()
					.filter(t -> "Cambridge".equals(t.getTrader().getCity()))
					.map(t -> t.getValue())
					.forEach(System.out::println);
			System.out.println("===================================");
			
//				9. What’s the highest value of all the transactions?
			System.out.println("9. What’s the highest value of all the transactions?");
			OptionalInt maxValue =	trans.stream()
					.mapToInt(t -> t.getValue())
					.max();
				System.out.println("The highest value of all the transactions: " + maxValue.orElse(0));
				System.out.println("===================================");
				
//				10. Find the transaction with the smallest value.
				System.out.println("10. Find the transaction with the smallest value.");
			OptionalInt minValue = trans.stream()
						.mapToInt(t -> t.getValue()) 
						.min();
				System.out.println("The smallest value of all the transactions: " + minValue.orElse(0));
						
				
	}
	private static List<Transaction> getAllTransaction() {
		BiFunction<String, String, Trader> bf = Trader::new;
		Trader raoul = bf.apply("Raoul", "Cambridge");
		Trader mario = bf.apply("Mario", "Milan");
		Trader alan = bf.apply("Alan", "Cambridge");
		Trader brian = bf.apply("Brian", "Cambridge");
		
		return Arrays.asList(
				new Transaction(brian, 2011, 300),
				new Transaction(raoul, 2012, 1000),
				new Transaction(raoul, 2011, 400),
				new Transaction(mario, 2012, 710),
				new Transaction(mario, 2012, 700),
				new Transaction(alan, 2012, 950));
	}
}
