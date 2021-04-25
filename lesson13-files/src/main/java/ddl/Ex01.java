package ddl;

import java.io.File;

import utils.FilesUtils;

public class Ex01 {

	private static final String path = "lesson12\\data\\..\\Trader.txt";

	public static void main(String[] args) {
		 File file = FilesUtils.createFile(path);
		 FilesUtils.info(file);

	}

}
