package java10.lesson12_dangcongkhaithu;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Demo {
	public static void main(String[] args) {
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");
		List<Trader> traders = Arrays.asList(raoul, mario, alan, brian);
		List<Transaction> transactions = Arrays.asList(new Transaction(brian, 2011, 300),
				new Transaction(raoul, 2012, 1000), new Transaction(raoul, 2011, 400),
				new Transaction(mario, 2012, 710), new Transaction(mario, 2012, 700), new Transaction(alan, 2012, 950));

		final List<Dish> menu = Arrays.asList(new Dish("1", "pork", 308, false), new Dish("2", "beef", 105, true),
				new Dish("3", "chicken", 329, true), new Dish("4", "dog", 302, false),
				new Dish("5", "meomeo", 480, true));

		// 1
		transactions.stream().filter(t -> t.getYear() == 2011).sorted((o1, o2) -> o1.getValue() - o2.getValue());

		// 2
		transactions.stream().filter(t -> t.getValue() > 200)
				.sorted((o1, o2) -> o1.getTrader().getCity().compareTo(o2.getTrader().getCity()));

		// 3
		transactions.stream().filter(distinctBy(t -> t.getTrader().getCity())).map(t -> t.getTrader().getCity());

		// 4
		traders.stream().filter(t -> "Cambridge".equals(t.getCity()))
				.sorted((o1, o2) -> o2.getName().compareTo(o1.getName()));

		// 5
		traders.stream().map(Trader::getName).sorted((o1, o2) -> o1.compareTo(o2));

		// 6
		traders.stream().anyMatch(t -> "Milan".equals(t.getCity()));

		// 7
		traders.stream().filter(t -> "Milan".equals(t.getCity())).count();

		// 8
		transactions.stream().filter(t -> "Cambridge".equals(t.getTrader().getCity())).map(Transaction::getValue)
				.collect(Collectors.toList()).forEach(System.out::println);

		// 9
		Integer max = transactions.stream().map(Transaction::getValue).reduce(Integer.MIN_VALUE,
				(a, b) -> a > b ? a : b);

		// 10
		transactions.stream().filter(t -> t.getValue() == transactions.stream().map(Transaction::getValue)
				.reduce(Integer.MAX_VALUE, (a, b) -> a < b ? a : b));
	}

	private static <T, R> Predicate<T> distinctBy(Function<T, R> fun) {
		Set<R> noDup = new HashSet<>();
		return t -> noDup.add(fun.apply(t));
	}
}
