package ddl;


import java.io.File;

//import java.io.File;

import utils.FileUtils;

public class Ex01 
{
	public static final String path = "lesson12\\data\\..\\Trader.txt";
	
    public static void main( String[] args ) {
    	File file = FileUtils.createFile(path);
    	FileUtils.info(file);
//    	System.out.println("path: " + path);
//    	System.out.println("parent:" +path.substring(0, path.lastIndexOf("\\")));
//    	System.out.println(FileUtils.delete("x\\y\\data"));
    	
    }
}
