package exercises;
import java.util.Scanner;

public class Ex02 {
	
	public static void main(String[] args) {
		System.out.print("Nhập tên: ");
		String input = checkInput();
		upperFirst(input);
	}
	
	private static String checkInput() {
		String input = new Scanner(System.in).nextLine().trim();
		if (!input.matches("[a-zA-Z\\s]+")) {
			System.out.print("chỉ nhập các chữ cái! nhập lại: ");
			return checkInput();
		}
		return input;
	}
	
	private static void upperFirst(String input) {
		input = input.toLowerCase();
		String[] toWord = input.split("\\s+");
		String result = "";
		for (String word : toWord) {
			word = word.replaceFirst(word.charAt(0) + "", (word.charAt(0) + "").toUpperCase());
			result += word + " ";
		}
		System.out.println("viết hoa chữ cái đầu: "+ result );
		
	}
}
