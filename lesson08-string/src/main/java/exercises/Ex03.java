package exercises;

import java.text.Normalizer;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Ex03 {
	public static void main(String[] args) {
		Scanner td = new Scanner(System.in);
		String name = td.nextLine();
		
	      System.out.println(covertToString(name));
	}
	public static String covertToString(String value) {
	      try {
	            String temp = Normalizer.normalize(value, Normalizer.Form.NFD);
	            Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
	            return pattern.matcher(temp).replaceAll("").replace("đ", "d");
	     } catch (Exception ex) {
	            ex.printStackTrace();
	      }
	      return null;
	}
}
