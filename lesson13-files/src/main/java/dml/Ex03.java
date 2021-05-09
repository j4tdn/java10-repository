package dml;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import bean.Trader;
import bean.Transaction;
import utils.FileUtils;

public class Ex03 {
	private static final String transacton_path = "data/Transaction.txt";
	private static final String trader_path = "data/Trader.txt";
	
	
	public static void main(String[] args) throws IOException {
		Path traderPath = Paths.get(trader_path);
		Path transactionPath = Paths.get(transacton_path);
		
		
		List<Trader> traders = FileUtils.readLines(traderPath, Trader::transfer);
		FileUtils.print(traders);
		System.out.println("=================");
		
		List<Transaction> transactions = FileUtils.readLines(transactionPath, Transaction::transfer);
		FileUtils.print(transactions);
	}
	
	
	
}