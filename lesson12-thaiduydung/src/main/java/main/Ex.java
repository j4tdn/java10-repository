package main;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalInt;

import bean.Trader;
import bean.Transaction;

public class Ex {
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
		//1.Find all transactions in the year 2011 and sort them by value (small to high). 
		transactions.stream()
					.filter( t-> t.getYear()==2011)
					.sorted(Comparator.comparing(Transaction::getValue))
					.forEach(System.out::println);
		System.out.println("=========================");
		
		// 2. Find all transactions have value greater than 300 and sort them by trader’s city
		transactions.stream()
					.filter(t ->t.getValue() >=300)
					.sorted(( o1,o2) -> o1.getTrader().getCity().compareTo(o1.getTrader().getCity()))
					.forEach(System.out::println);
		System.out.println("=========================");	
		
		// 3. What are all the unique cities where the traders work? 
		transactions.stream()
					.map(Transaction::getTrader)
					.map(Trader::getCity)
					.distinct() //.collect(Collectors.toSet())
					.forEach(System.out::println);
		System.out.println("=========================");
		
		//4. Find all traders from Cambridge and sort them by name desc. 
		traders.stream()
				.filter(t->t.getCity().equals("Cambridge"))
				.sorted((o1,o2)-> o2.getName().compareTo(o1.getName()))
				.forEach(System.out::println);
		System.out.println("=========================");
		
		//5. Return a string of all traders’ names sorted alphabetically. 
		traders.stream()
				.filter(t->t.getCity().equals("Cambridge"))
				.sorted((o1,o2)-> o1.getName().compareTo(o2.getName()))
				.map(Trader::getName)
				.forEach(System.out::println);
		System.out.println("=========================");
		//6. Are any traders based in Milan? 
		boolean milan = traders.stream()
		       .anyMatch(t-> t.getCity().equals("Milan"));
	      System.out.println("Have trader based in MiLan : "+ milan );     ;
	      System.out.println("=========================");
	      
	     //7. Count the number of traders in Milan. 
	     long countMilan =  traders.stream()
	      		 .filter(t-> t.getCity().equals("Milan"))
	      		 .count();
	       System.out.println("countMilan: "+ countMilan);
	       System.out.println("=========================");
	       
		//8. Print all transactions’ values from the traders living in Cambridge. 
		transactions.stream()
					.filter(t-> t.getTrader().getCity().equals("Cambridge"))
					.map(Transaction::getValue)
					.forEach(System.out::println);
	       System.out.println("=========================");

	    //9. What’s the highest value of all the transactions? 
	     OptionalInt highestValue =  transactions.stream()
	       				                  .mapToInt(Transaction::getValue) 
	       				                  .max();
	     System.out.println("highest Value: "+ highestValue.getAsInt());
	     System.out.println("=========================");
	     
		//10. Find the transaction with the smallest value. 
	     transactions.stream()
	      	.sorted(Comparator.comparing(t-> t.getValue()))
	      	.limit(1)
	      	.forEach(System.out::println);
            
		
	}
}