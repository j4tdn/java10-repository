package ex04;

public class Ex04 {
	public static void main(String[] args) {
		String arr = " Welcome    to JAVA10    class ";
		String[] words = arr.split(" ");
		String reversedString = "";
		
		
		System.out.println("String:" + arr);
		System.out.println("*String:" + arr.trim().replaceAll("\\s+", " "));

		for (int i = 0; i < words.length; i++) {
			String result = words[i];
			String reverseWord = "";
			for (int j = result.length() - 1; j >= 0; j--) {
				reverseWord += result.charAt(j);
			}
			reversedString += reverseWord + " ";
		}
		System.out.println("Reversed String:" + reversedString.trim().replaceAll("\\s+", " "));

	}

}
