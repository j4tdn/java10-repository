package dml;

import java.io.File;
import java.util.Arrays;
import java.util.List;

import bean.Trader;
import utils.FileUtils;

public class Ex05 {
	private static final String path = "data02" + File.separator + "Trader.txt";

	public static void main(String[] args) {
		File file = new File(path);
		file = FileUtils.createFile(path);
		List<Trader> traders = getTraders();
		
		FileUtils.writeObject(file, traders);
		FileUtils.readObject(file).forEach(System.out::println);
	}

	private static List<Trader> getTraders() {
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");
		return Arrays.asList(raoul, mario, alan, brian);
	}
}
