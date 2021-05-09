package dml;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import bean.Trader;
import bean.Transaction;
import utils.FileUtils;

public class Ex02 {
	
		private static final String transacton_path = "data/Transaction.txt";
		private static final String trader_path = "data/Trader.txt";
		
		public static void main(String[] args) {
		List<Trader> traders = getTraders();
		List<Transaction> transactions = getTransactions(traders);
		
//		File file = new File(trader_path);
		Path traderPath = Paths.get(trader_path);
		Path transactionPath = Paths.get(transacton_path);
		
		FileUtils.writeFiles(traderPath, traders);
		FileUtils.writeFiles(transactionPath, transactions);
	}
		
		private static List<Trader> getTraders(){
			Trader raoul = new Trader("Raoul", "Cambridge");
			Trader mario = new Trader("Mario", "Milan");
			Trader alan = new Trader("Alan", "Cambridge");
			Trader brian = new Trader("Brian", "Cambridge");
			return Arrays.asList(raoul, mario, alan, brian);
		}
		
		private static List<Transaction> getTransactions(List<Trader> traders){
			return Arrays.asList(new Transaction(traders.get(3), 2011, 300),
					new Transaction(traders.get(0), 2012, 1000),
					new Transaction(traders.get(0), 2011, 400),
					new Transaction(traders.get(1), 2012, 710),
					new Transaction(traders.get(1), 2012, 700),
					new Transaction(traders.get(2), 2012, 950));
		}
		
		
}	
