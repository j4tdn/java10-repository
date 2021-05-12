package dml;

import static utils.FileUtils.readObject;
import static utils.FileUtils.safeList;
import static utils.FileUtils.writeObject;

import java.io.File;
import java.util.Arrays;
import java.util.List;

import bean.Trader;

public class Ex04 {
	private static final String path = "data" + File.separator + "Trader.txt";

	public static void main(String[] args) {
		File file = new File(path);
		List<Trader> traders = getAll();
		writeObject(file, traders);

		List<Trader> result = safeList(readObject(file));
//		print(result);
	}

	private static List<Trader> getAll() {
		return Arrays.asList(new Trader("Adam", "Milan"), new Trader("Join", "London"), new Trader("Kate", "Milan"),
				new Trader("Mount", "Cambridge"), new Trader("Oliver", "Inter"));
	}
}
