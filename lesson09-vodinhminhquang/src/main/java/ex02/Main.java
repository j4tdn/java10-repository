package ex02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		 String input1 = "01a2b3456cde478";
		 String delimiters = "[a-z]+";
		 
		 System.out.println(input1);
		 getLargestNumbers(input1, delimiters);
		 
		 System.out.println("=====================");
		 String input2 = "aa6b546c6e22h, aa6b326c6e22h";
		 String delimiters2 = "[a-z,\\\\s]+";
		 String[] tokens = input2.split(delimiters2);

			/*
			 * for(int i = 0; i < tokens.length; i++) { System.out.println("token[" +
			 * tokens[i] +"] = " + tokens[i].length()); }
			 */
		 int maxLength = tokens[0].length();
		 for(int i = 0; i < tokens.length; i++) {
			 if(maxLength < tokens[i].length()) {
				 maxLength = tokens[i].length();
			 }
		 }
			/*
			 * System.out.println(maxLength);
			 */		 
		 List<String> f = new ArrayList<>();
		 for(int i = 0; i < tokens.length; i++) {
			 if(tokens[i].length() == maxLength) {
				 f.add(tokens[i]);
			 }
		 }
		 Collections.sort(f);
		 System.out.println(input2);
		 System.out.println(f);
		 
		 
	}
	
	private static void getLargestNumbers(String input, String delimiters) {
		String text = input;
		
		String[] tokens = text.split(delimiters);
		int pos = 0;
		int temp = tokens[0].length();

		for(int i = 0; i < tokens.length; i++) {
			 if(temp < tokens[i].length()) {
				 temp = tokens[i].length();
				 pos = i;
			 }
		 }
		 System.out.println(tokens[pos]);
	}
}
