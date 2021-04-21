package main;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalInt;
import java.util.function.Predicate;

import bean.Trader;
import bean.Transaction;

public class Ex {
	public static void main(String[] args) {
		List<Transaction> transactions = allTransaction();
		
		
		System.out.println("1. Find all transactions in the year 2011 and sort them by value (small to high).\n");
		transactions.stream()
					.filter(tr -> tr.getYear() == 2011)
					.sorted(Comparator.comparing(Transaction::getValue))
					.forEach(System.out::println);
		
		
		System.out.println("======================");
		System.out.println("2. Find all transactions have value greater than 300 and sort them by trader’s city\n");
		transactions.stream()
					.filter(tr -> tr.getValue() > 300)
					.sorted(Comparator.comparing(tr -> tr.getTrader().getCity()))
					.forEach(System.out::println);
		
		
		System.out.println("=======================");
		System.out.println("3. What are all the unique cities where the traders work?\n");
		transactions.stream()
					.map(tr -> tr.getTrader().getCity())
					.distinct()
					.forEach(System.out::println);;
			
					
		System.out.println("=======================");
		System.out.println("4. Find all traders from Cambridge and sort them by name desc.\n");
		transactions.stream()
					.filter(tr -> tr.getTrader().getCity() == "Cambridge")
					.sorted((n1, n2) -> n2.getTrader().getName().compareTo(n1.getTrader().getName()))
					.forEach(System.out::println);;
		
					
		System.out.println("=======================");
		System.out.println("5. Return a string of all traders’ names sorted alphabetically.\n");
		transactions.stream()
					.map(tr -> tr.getTrader().getName())
					.distinct()
					.sorted()
					.forEach(System.out::println);
		
		
		System.out.println("=======================");
		System.out.println("6. Are any traders based in Milan?\n");
		boolean anyMatchMiLan = transactions.stream()
					.anyMatch(tr -> "Milan".equals(tr.getTrader().getCity()));
		System.out.println("\t\t"+anyMatchMiLan);
		
		
		System.out.println("=======================");
		System.out.println("7. Count the number of traders in Milan.\n");	
		long countMilan = transactions.stream()
				.filter(tr -> "Milan".equals(tr.getTrader().getCity()))
				.distinct()
				.count();
		System.out.println("\t\t"+countMilan);
		
		
		System.out.println("=======================");
		System.out.println("8. Print all transactions’ values from the traders living in Cambridge.");
		transactions.stream()
					.filter(tr -> "Cambridge".equals(tr.getTrader().getCity()))
					.map(Transaction::getValue)
					.forEach(System.out::println);
		
		
		System.out.println("=======================");
		System.out.println("9. What’s the highest value of all the transactions?");
		int maxValue = transactions.stream()
					.mapToInt(tr -> tr.getValue())
					.max().orElse(0);
		
		System.out.println("\t\t"+maxValue);
					
		
		System.out.println("=======================");
		System.out.println("10. Find the transaction with the smallest value.");
		int minValue = transactions.stream()
				.mapToInt(tr -> tr.getValue())
				.min().orElse(0);
		
		transactions.stream()
				.filter(tr -> tr.getValue() == minValue)
		.forEach(System.out::println);			
	
	}
	
	
	private static List<Transaction> allTransaction(){
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");
		
		return Arrays.asList(
				new Transaction(brian, 2011, 300),
				new Transaction(raoul, 2012, 1000),
				new Transaction(raoul, 2011, 400),
				new Transaction(mario, 2012, 710),
				new Transaction(mario, 2012, 700),
				new Transaction(alan, 2012, 950)
		);
	}
}
