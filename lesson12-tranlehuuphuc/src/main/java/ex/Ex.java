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
		List<Transaction> trans = AllTransactions();
		// 1. Find all transactions in the year 2011 and sort them by value (small to high).
		// Tìm tất cả các giao dịch trong năm 2011 và sắp xếp chúng theo giá trị (nhỏ đến cao).
		

		System.out.println("1.Find all transactions in the year 2011 and sort them by value");
		trans.stream().filter(year -> year.getYear() == 2011)
				.sorted(Comparator.comparing(Transaction::getYear))
				.collect(Collectors.toList())
				.forEach(System.out::println);

		// 2. Find all transactions have value greater than 300 and sort them by trader’s city.
		// Tìm tất cả các giao dịch có giá trị lớn hơn 300 và sắp xếp chúng theo thành phố của nhà giao dịch.
		
		System.out.println("2.Find all transactions have value greater than 300 and sort them by trader’s city");
		trans.stream().filter(t -> t.getValue() > 300)
				.sorted(Comparator.comparing(t -> t.getTrader().getCity()))
				.forEach(System.out::println);

		// 3. What are all the unique cities where the traders work?
		// Tất cả các thành phố độc đáo nơi các thương nhân làm việc là gì?
		System.out.println("3.What are all the unique cities where the traders work?");
		trans.stream().map(t -> t.getTrader().getCity())
				.distinct()
				.forEach(System.out::println);

		// 4. Find all traders from Cambridge and sort them by name desc.
		// Tìm tất cả các nhà giao dịch từ Cambridge và sắp xếp chúng theo tên desc(giảm dần).
		
		System.out.println("4.Find all traders from Cambridge and sort them by name desc");
		trans.stream().filter(t -> "Cambridge".equals(t.getTrader().getCity()))
				.sorted((n1, n2) -> n2.getTrader().getName().compareTo(n1.getTrader().getName()))
				.map(t -> t.getTrader().getName())
				.distinct()
				.forEach(System.out::println);

		// 5. Return a string of all traders’ names sorted alphabetically.
		// Trả về một chuỗi tên của tất cả các nhà giao dịch được sắp xếp theo thứ tự bảng chữ cái.
		
		System.out.println("5.Return a string of all traders’ names sorted alphabetically");
		trans.stream().map(t -> t.getTrader().getName()).sorted()
				.distinct()
				.forEach(System.out::println);

		// 6. Are any traders based in Milan?
		// Có nhà giao dịch nào ở Milan không?
		System.out.println("6.Are any traders based in Milan? ");
		boolean anyMilan = trans.stream()
				.anyMatch(t -> "Milan".equals(t.getTrader().getCity()));
		System.out.println(anyMilan);

		// 7. Count the number of traders in Milan.
		// Đếm số lượng thương nhân ở Milan.
		System.out.println("7.Count the number of traders in Milan");
		long count = trans.stream().filter(t -> "Milan".equals(t.getTrader().getCity()))
				.map(t -> t.getTrader().getName())
				.distinct()
				.count();
		System.out.println(count);
		// 8. Print all transactions’ values from the traders living in Cambridge.
		// In tất cả các giá trị của giao dịch từ các nhà giao dịch sống ở Cambridge.
		System.out.println("8.Print all transactions’ values from the traders living in Cambridge");
		trans.stream().filter(t -> "Cambridge".equals(t.getTrader().getCity()))
				.map(t -> t.getValue())
				.forEach(System.out::println);
		// 9. What’s the highest value of all the transactions?
		// Giá trị cao nhất của tất cả các giao dịch là bao nhiêu?
		System.out.println("9.What’s the highest value of all the transactions? ");
		OptionalInt maxValue = trans.stream()
				.mapToInt(t -> t.getValue())
				.max();
		System.out.println("MAX:" + maxValue.orElse(0));
		// 10. Find the transaction with the smallest value.
		// Tìm giao dịch có giá trị nhỏ nhất.
		System.out.println("10.Find the transaction with the smallest value");
		OptionalInt minValue = trans.stream()
				.mapToInt(t -> t.getValue()) 
				.min();
		System.out.println("MIN: " + minValue.orElse(0));

	}

	private static List<Transaction> AllTransactions() {
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
