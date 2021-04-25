package ddl;

import java.io.File;

import utils.FileUtils;

public class Ex01 {
	
	private static final String path = "data\\Trader.txt"; //"lesson12\\data\\..\\Trader.txt" lùi
	
	public static void main(String[] args) {
		
		File file = FileUtils.createFile(path);
		FileUtils.info(file);
		
//		FileUtils.delete("x\\y\\data");
//		System.out.println("path: " + path);
//		System.out.println("parent: " + path.substring(0, path.lastIndexOf("\\")));
//		System.out.println("child: " + path.substring(path.lastIndexOf("\\")+1, path.length()));
	}
}
