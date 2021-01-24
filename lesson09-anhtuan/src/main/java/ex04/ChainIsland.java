package ex04;

public class ChainIsland {
	public static void main(String[] args) {
		String arr = "      Welcome   to JAVA10   class   ";
		// regex: replace 1 or n while spaces to 1 whitespace
		String removed = arr.trim().replaceAll("\\s+", " ");
		System.out.println("Chuỗi ban đầu:" + arr);
		System.out.println("Chuỗi sau khi định dạng:" + removed);

		String[] words = removed.split(" ");
		String reversedString = "";
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			String reverseWord = "";
			for (int j = word.length() - 1; j >= 0; j--) {
				reverseWord = reverseWord + word.charAt(j);
			}
			reversedString = reversedString + reverseWord + " ";
		}
		System.out.println("Chuỗi sau khi đảo ngược:" + reversedString);
	}
}
