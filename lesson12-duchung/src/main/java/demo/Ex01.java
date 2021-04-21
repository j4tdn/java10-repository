package demo;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalInt;
import java.util.function.BiFunction;

import bean.Trader;
import bean.Transaction;
public class Ex01 {
	public static void main(String[] args) {
		List<Transaction> transactions = getAllTransaction();
		System.out.println("1. Find all transactions in the year 2011 and sort them by value (small to high).");
		transactions.stream()
					.filter(t -> t.getYear() == 2011)
					.sorted(Comparator.comparing(Transaction::getValue))
					.forEach(System.out::println);
		
		System.out.println("2. Find all transactions have value greater than 300 and sort them by trader’s city");
		transactions.stream()
					.filter(t -> t.getValue() > 300)
					.sorted(Comparator.comparing(t -> t.getTrader().getCity()))
					.forEach(System.out::println);
		
		System.out.println("3. What are all the unique cities where the traders work?");
		transactions.stream()
					.map(t -> t.getTrader().getCity())
					.distinct().
					forEach(System.out::println);
		
		
		System.out.println("4. Find all traders from Cambridge and sort them by name desc.");
		//Comparator<Transaction> c = (n1, n2)-> n2.getTrader().getName().compareTo( n2.getTrader().getName());
		transactions.stream()
		.filter(t -> "Cambridge".equals(t.getTrader().getCity()))
		.sorted((n1, n2)-> n2.getTrader().getName().compareTo( n1.getTrader().getName()))
		.forEach(System.out::println);
		
		
		System.out.println("5. Return a string of all traders’ names sorted alphabetically.");
		transactions.stream().map(t -> t.getTrader().getName())
					.sorted()
					.distinct()
					.forEach(System.out::println);
		
		
		System.out.println("6. Are any traders based in Milan?");
		boolean anyMilan = transactions.stream()
									   .anyMatch(t -> "Milan".equals(t.getTrader().getCity()));
		System.out.println("Are any traders based in Milan? " + anyMilan);
		
		
		System.out.println("7. Count the number of traders in Milan.");
		long count = transactions.stream()
								 .filter(t -> "Milan".equals(t.getTrader().getCity()))
								 .count();
		System.out.println("The number of traders in Milan: " + count);
		
		
		System.out.println("8. Print all transactions’ values from the traders living in Cambridge.");	
		transactions.stream()
					.filter(t -> "Cambridge".equals(t.getTrader().getCity()))
					.map(Transaction::getValue)
					.forEach(System.out::println);
		
		
		System.out.println("9. What’s the highest value of all the transactions?");
		OptionalInt maxValue = transactions.stream()
								   .mapToInt(Transaction::getValue)//Stream<intStream>
								   .max();
		System.out.println("The highest value of all the transactions: " + maxValue.orElse(0));
		
		
		System.out.println("10. Find the transaction with the smallest value.");
		int minValue = transactions.stream()
									.mapToInt(Transaction::getValue) 
									.min().getAsInt();
		transactions.stream().filter(t -> t.getValue() == minValue)
							.forEach(System.out::println);
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
