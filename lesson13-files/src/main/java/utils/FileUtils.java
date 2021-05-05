package utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileUtils {
	private FileUtils() {

	}

	public static void writeLine(File file, String...lines) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			//open file -connection
			fw = new FileWriter(file,true);
			bw = new BufferedWriter(fw);
			
			//manipulate with file
//			bw.newLine();
//			bw.write("Line 2: Student A");
			for(String student: lines) {
				bw.newLine();
				bw.write(student);
				
			}
			//save and close
			bw.close();
			fw.close();
			System.out.println("Write file "+ file .getName()+ "sucessful   !!");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close(fw);
			close(bw);
		}
		
	}
	
	public static List<String> readLines(File file){
		
		List<String> lines = new ArrayList<>();
		FileReader fr = null;
		BufferedReader br =null;
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			String line =null;
			while ((line = br.readLine()) != null) {
				lines.add(line);
			}
		} catch ( IOException e) {
			e.printStackTrace();
		}finally {
			close(br,fr);
		}
		return lines;
	}
	
	public static File createFile(String path) {
		File file = new File(path);
		try {
			if(!file.exists()) {
			File parent =	file.getParentFile();
			//System.out.println("parent: "+ parent.getPath());
			if(!parent.exists()) {
				parent.mkdirs();
			}
				file.createNewFile();
				System.out.println("File is created successfully !!!");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return file;
	}
	public static File createDir (String path) {
		File dir = new File(path);
		dir.mkdirs();
		return dir;
	}
	
	public static boolean delete(String path) {
		File file = new File(path);
		return file.delete();
	}
	 
	public static void info(File file) {
		System.out.println("path: " + file.getPath());
		System.out.println("AbsolutePath: " + file.getAbsolutePath());
		try {
			System.out.println("CanonicalPath: " + file.getCanonicalPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void print (List<String>list) {
		 list.stream().forEach(f-> System.out.println(f));
	}
	private static void close(AutoCloseable ...closeables) {
		Arrays.stream(closeables).forEach(c-> {
			try {
				c.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
	}
}
