package dml;

import java.io.File;
import java.util.Arrays;
import java.util.List;

import bean.Trader;
import utils.FileUtils;
import static utils.FileUtils.*;



public class Ex04 {
	private static final String path = "data" +File.separator + "Trader.txt";
	public static void main(String[] args) {
		File file = new File(path);
		//List<Trader> traders = getAll();
		//FileUtils.writeObject(file, traders);
		
		List<Trader> result =  FileUtils.safeList(FileUtils.readObject(file));
		FileUtils.print(result);
	}
	
	private static List<Trader> getAll() {
		return Arrays.asList(
				new Trader("Adam", "Milan"),
				new Trader("Join", "London"),
				new Trader("Kate", "Milan"),
				new Trader("Mount", "Cambridge"),
				new Trader("Oliver", "Inter")
				);
	}
}
