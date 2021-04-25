package exercises;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalLong;
import java.util.function.BiFunction;

import bean.Trader;
import bean.Transaction;

public class Ex {
	public static void main(String[] args) {
		List<Transaction> transactions = getAllTransaction();
		//1.
		transactions.stream().filter(t->t.getYear()==2011).sorted(Comparator.comparingInt(Transaction::getValue)).forEach(System.out::println);
		System.out.println("---------------------------");
	
		//2.
		transactions.stream()
		.filter(t -> t.getValue() > 300).sorted(Comparator.comparing(t -> t.getTrader().getCity())).forEach(System.out::println);
		System.out.println("---------------------------");
		//3.
		transactions.stream()
		.map(t -> t.getTrader().getCity()).distinct().forEach(System.out::println);
		System.out.println("---------------------------");
		transactions.stream()
		.filter(t -> "Cambridge".equals(t.getTrader().getCity())).sorted((p1, p2)-> (p1.getTrader().getName()).compareTo( p2.getTrader().getName()))
		.forEach(System.out::println);
		System.out.println("---------------------------");
		transactions.stream().map(t->t.getTrader().getName()).sorted().distinct().forEach(System.out::println);
		System.out.println("-------------------------");
		boolean Milan = transactions.stream().allMatch(t->"Milan".equals(t.getTrader().getCity()));
		System.out.println(Milan);
		System.out.println("---------------------------");
		long Milan1 = transactions.stream().filter(t->"Milan".equals(t.getTrader().getCity())).count();
		System.out.println("Number trader in Milan: " + Milan1);
		System.out.println("---------------------------");
		transactions.stream().filter(t->"Cambridge".equals(t.getTrader().getCity())).sorted(Comparator.comparingInt(Transaction::getValue)).forEach(System.out::println);
		System.out.println("---------------------------");
		OptionalLong Highest = transactions.stream().mapToLong(Transaction::getValue).max();
		System.out.println("Highest value: " + Highest);
		System.out.println("---------------------------");
		OptionalLong Min = transactions.stream().mapToLong(Transaction::getValue).min();
		System.out.println("Min value: " + Min);
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

