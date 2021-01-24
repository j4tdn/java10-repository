package ex04;

public class Ex04 {

	
	public static void main(String[] args) {
		String arr = " Welcome    to JAVA10    class ";
		String result = "";
		String result1 = "";
		System.out.println("Nhập vào chuỗi:" + arr);

		String arrPrint = arr.trim().replaceAll("\\s+", " ");

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
		System.out.println("Đảo chuỗi:" + reversedString.trim().replaceAll("\\s+", " "));

	}

}