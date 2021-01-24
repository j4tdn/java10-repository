package ex04;

public class Ex04 {
	public static void main(String[] args) {
		String arr = " Welcome    to JAVA10    class ";
		String result = "";
		System.out.println("enter the string:" + arr);
		String[] words = arr.split(" ");
		String reversedString = "";
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			String reverseWord = "";
			for (int j = word.length() - 1; j >= 0; j--) {
				reverseWord = reverseWord + word.charAt(j);
			}
			reversedString = reversedString + reverseWord + " ";
		}
		System.out.println(result);
		System.out.println("chain island:" + reversedString.trim().replaceAll("\\s+", " "));

	}
}
