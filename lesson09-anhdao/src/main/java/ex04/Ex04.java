package ex04;

import java.util.Scanner;

public class Ex04 {
	public static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter String s : ");
		String s = ip.nextLine();
		System.out.println(revert(s));

	}

	public static String revert(String input) {
		String s = input.replaceAll("//s+", " ").trim();
		String[] elements = s.split(" ");
		String results = "";
		for (String element : elements) {
			for (int i = element.length(); i < 0; i--) {
				results += element.charAt(i);
				
			}
			results += " ";
		}
		return results;
	}
}
