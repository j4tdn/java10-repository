package dml;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;

import bean.Trader;
import bean.Transaction;
import utils.FileUtils;

public class Ex04 {
	private static final String transaction_path = "data/Transaction.txt";
	private static final String trader_path = "data/Trader.txt";
	
	public static void main(String[] args) throws IOException {
		List<Trader> traders = FileUtils.readLines(Paths.get(trader_path), Trader::transfer);
		traders.forEach(System.out::println);
		
		System.out.println("====================");
		
		List<Transaction> transactions = FileUtils.readLines(Paths.get(transaction_path), Transaction::transfer);
		transactions.forEach(System.out::println);
	}
}
