package ddl;

import java.io.File;

import utils.FileUtils;

public class Ex01 {

	// private static final String dirPath = "D:\\home";
	private static final String path = "lesson12\\data\\..\\Trader.txt";

	public static void main(String[] args) {
		// FileUtils.createFile(dirPath + File.separator + path);
		
		FileUtils.createFile(path);
//		System.out.println("path:" + path);
//		
//		System.out.println("parent: "+ path.substring(0, path.lastIndexOf("\\")));
//		System.out.println("child: "+ path.substring(path.lastIndexOf("\\"), path.length()));
		
//		FileUtils.delete(path);
//		FileUtils.delete("data.txt");
		File file = FileUtils.createFile(path);
		FileUtils.info(file);
		
	}
}
