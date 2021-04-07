package main;

import java.util.Arrays;
import java.util.List;

import bean.Dish;
import bean.Trader;
import bean.Transaction;

public class PutAllIntoPrac {
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
		
		final List<Dish> menu = Arrays.asList(new Dish("1", "pork", 308, false),
				new Dish("2", "beef", 105, true),
				new Dish("3", "chicken", 329, true),
				new Dish("4", "dog", 302, false),
				new Dish("5", "meomeo", 480, true));
	}
}
