package ddl;

import java.io.File;
import util.FileUtil;

public class Ex01 {

	private static final String dirPath = "x\\y\\data\\data.txt";
	private static final String path = "data.txt";

	public static void main(String[] args) {
		FileUtil.createFile(dirPath);
		FileUtil.delete(dirPath);
		
		File file = FileUtil.createFile(dirPath);
		FileUtil.info(file);
		
	}
}
