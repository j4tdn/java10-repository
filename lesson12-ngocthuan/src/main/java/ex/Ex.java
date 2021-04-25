package ex;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

import bean.Trader;
import bean.Transaction;

public class Ex {
	public static void main(String[] args) {
		List<Transaction> transactions = getAllTransactions();
		// 1. Find all transactions in the year 2011 and sort them by value (small to high)
		System.out.println("1.Find all transactions in the year 2011 and sort them by value");
		transactions.stream().filter(year -> year.getYear() == 2011)
				.sorted(Comparator.comparing(Transaction::getYear))
				.collect(Collectors.toList())
				.forEach(System.out::println);

		// 2. Find all transactions have value greater than 300 and sort them by trader’s city
		System.out.println("2.Find all transactions have value greater than 300 and sort them by trader’s city");
		transactions.stream().filter(t -> t.getValue() > 300)
				.sorted(Comparator.comparing(t -> t.getTrader().getCity()))
				.forEach(System.out::println);

		// 3. What are all the unique cities where the traders work
		System.out.println("3.What are all the unique cities where the traders work");
		transactions.stream().map(t -> t.getTrader().getCity())
				.distinct()
				.forEach(System.out::println);

		// 4. Find all traders from Cambridge and sort them by name desc
		System.out.println("4.Find all traders from Cambridge and sort them by name desc");
		transactions.stream().filter(t -> "Cambridge".equals(t.getTrader().getCity()))
				.sorted((n1, n2) -> n2.getTrader().getName().compareTo(n1.getTrader().getName()))
				.map(t -> t.getTrader().getName())
				.distinct()
				.forEach(System.out::println);

		// 5. Return a string of all traders’ names sorted alphabetically
		System.out.println("5.Return a string of all traders’ names sorted alphabetically");
		transactions.stream().map(t -> t.getTrader().getName()).sorted()
				.distinct()
				.forEach(System.out::println);

		// 6. Are any traders based in Milan
		System.out.println("6.Are any traders based in Milan ");
		boolean anyMilan = transactions.stream()
				.anyMatch(t -> "Milan".equals(t.getTrader().getCity()));
		System.out.println(anyMilan);

		// 7. Count the number of traders in Milan
		System.out.println("7.Count the number of traders in Milan");
		long count = transactions.stream().filter(t -> "Milan".equals(t.getTrader().getCity()))
				.map(t -> t.getTrader().getName())
				.distinct()
				.count();
		System.out.println(count);
		// 8. Print all transactions’ values from the traders living in Cambridge
		System.out.println("8.Print all transactions’ values from the traders living in Cambridge");
		transactions.stream().filter(t -> "Cambridge".equals(t.getTrader().getCity()))
				.map(t -> t.getValue())
				.forEach(System.out::println);
		// 9. What’s the highest value of all the transactions
		System.out.println("9.What’s the highest value of all the transactions ");
		OptionalInt maxValue = transactions.stream()
				.mapToInt(t -> t.getValue())
				.max();
		System.out.println("max:" + maxValue.orElse(0));
		
		//10. Find the transaction with the smallest value.
		System.out.println("10.Find the transaction with the smallest value"); 
		OptionalInt minValue = transactions.stream()
				.mapToInt(t -> t.getValue()) 
				.min();
		System.out.println("min: " + minValue.orElse(0));

	}

	private static List<Transaction> getAllTransactions() {
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");

		return Arrays.asList(new Transaction(brian, 2011, 300),
				new Transaction(raoul, 2012, 1000),
				new Transaction(raoul, 2011, 400),
				new Transaction(mario, 2012, 710),
				new Transaction(mario, 2012, 700),
				new Transaction(alan, 2012, 950));
	}
}