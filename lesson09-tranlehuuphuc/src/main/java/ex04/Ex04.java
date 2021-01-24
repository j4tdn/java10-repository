package ex04;

import javax.sound.sampled.ReverbType;

public class Ex04 {
	public static void main(String[] args) {
		String input = Revert("Welcome to JAVA10 class");
		System.out.println(input);

	}
	public static String  Ci(String s) {
		String removed = s.trim().replaceAll("\\s", " ");
		return removed;
	}
	public static String Revert(String removed) {
		int i, n = removed.length();
		StringBuilder output = new StringBuilder(n);
		for (i = (n-1);i>=0;i--) {
			output.append(removed.charAt(i));
		}
		return output.toString();
	}
}