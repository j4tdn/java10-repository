package dml;

import static utils.FileUtils.print;
import static utils.FileUtils.readLines;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import bean.Trader;
import bean.Transaction;

public class Ex03 {
	private static final String transaction_path = "data/Transaction.txt";
	private static final String trader_path = "data/Trader.txt";

	
	public static void main(String[] args) throws IOException {
		Path traderPath = Paths.get(trader_path);
		Path transactionPath = Paths.get(transaction_path);
		
		List<Trader> traders = readLines(traderPath, Trader::transfer);
		print(traders);
		
		System.out.println("==================================");
		
		List<Transaction> transactions = readLines(transactionPath, Transaction::transfer);
		print(transactions);
	}
	
}
