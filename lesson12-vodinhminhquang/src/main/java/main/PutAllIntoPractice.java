package main;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import bean.Trader;
import bean.Transaction;

public class PutAllIntoPractice {
	public static void main(String[] args) {
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");
		
		List<Trader> traders = Arrays.asList(raoul, mario, alan, brian);
		List<Transaction> transactions = Arrays.asList(
				new Transaction(brian, 2011, 300),
				new Transaction(raoul, 2012, 1000),
				new Transaction(raoul, 2011, 400),
				new Transaction(mario, 2012, 710),
				new Transaction(mario, 2012, 700),
				new Transaction(alan, 2012, 950)
		);
		
		
		// Find all transactions in the year 2011 and sort them by value (small to high).
		System.out.println("Find all transactions in the year 2011 and sort them by value (small to high)");
		transactions.stream()
		.filter(year -> year.getYear() == 2011)
		.sorted(Comparator.comparing(Transaction::getYear))
		.collect(Collectors.toList())
		.forEach(System.out::println);
		System.out.println("============================");
		
		// Find all transactions have value greater than 300 and sort them by trader’s city
		System.out.println("Find all transactions have value greater than 300 and sort them by trader’s city");
//		transactions.stream()
//			.filter(t -> t.getValue() > 300)
//			.sorted(new Comparator<Transaction>() {
//				@Override
//				public int compare(Transaction o1, Transaction o2) {
//					// TODO Auto-generated method stub
//					return o1.getTrader().getCity().compareTo(o2.getTrader().getCity());
//				}
//			})
//			.forEach(System.out::println);
		transactions.stream()
		.filter(t -> t.getValue() > 300)
		.sorted(Comparator.comparing(t -> t.getTrader().getCity()))
		.forEach(System.out::println);
		
		System.out.println("===========================");
		
		// What are all the unique cities where the traders work?
		System.out.println("All the unique cities where the traders work");
		transactions.stream().map(Transaction::getTrader)
			.filter(distinctByCity(Trader::getCity))
			.map(Trader::getCity)
			.forEach(System.out::println);
		
		System.out.println("===========================");
		
		// Find all traders from Cambridge and sort them by name desc.
		System.out.println("Find all traders from Cambridge and sort them by name desc");
		transactions.stream().map(Transaction::getTrader)
							.filter(t -> "Cambridge".compareTo(t.getCity()) == 0)
							.sorted((Trader o1, Trader o2) -> o1.getName().compareTo(o2.getName()) * -1)
							.forEach(System.out::println);
		
		System.out.println("===========================");
		// Return a string of all traders’ names sorted alphabetically.
		System.out.println("A string of all traders’ names sorted alphabetically");
		traders.stream().sorted(Comparator.comparing(Trader::getName)).forEach(System.out::println);
		// Are any traders based in Milan?
		System.out.println("===========================");
		System.out.println("Are any traders based in Milan? " + traders.stream().anyMatch(t -> t.getCity().equals("Milan")));
		
		// Count the number of traders in Milan.
		System.out.println("===========================");
		System.out.println("How many traders in Milan? " + traders.stream().filter(t -> t.getCity().equals("Milan")).count());
		
		// Print all transactions’ values from the traders living in Cambridge.
		System.out.println("===========================");
		System.out.println("Print all transactions’ values from the traders living in Cambridge.");
		transactions.stream()
			.filter(t -> t.getTrader().getCity().equals("Cambridge"))
			.forEach(System.out::println);
		
		// What’s the highest value of all the transactions?
		System.out.println("===========================");
		System.out.println("The highest value of all the transactions");
		transactions.stream()
			.sorted((Transaction t1, Transaction t2) -> t2.getValue() - t1.getValue())
			.limit(1)
			.map(Transaction::getValue)
			.forEach(System.out::println);
		// Find the transaction with the smallest value.
		System.out.println("===========================");
		System.out.println("The transaction with the smallest value");
		transactions.stream()
		.sorted((Transaction t1, Transaction t2) -> t1.getValue() - t2.getValue())
		.limit(1)
		.map(Transaction::getTrader)
		.forEach(System.out::println);
		
		
		
		
		
		
		
	}
	
	private static <T, R> Predicate<T> distinctByCity(Function<T, R> func){
		Set<R> uniqueCity = new HashSet<R>();
		Predicate<T> pred = t -> uniqueCity.add(func.apply(t));
		return pred;
	}
}
