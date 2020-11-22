package data.type;

public class Ex02 {
	public static void main(String[] args) {
		System.out.println("isDigit: " + isDigit('6'));
		char c = '6';
		System.out.println("isDigit: " + (c >= '0' && c <= '9'));
		System.out.println("isDigit: " + Character.isDigit(c));
		System.out.println("===============");

	}

	// write method whether character is a digit
	private static boolean isDigit(char c) {
		return c >= '0' && c <= '9';
	}

	private static boolean isNumber(String input) {
		for ( int i = 0; i < input.length(); i++) {

		char d = input.charAt(i);
		if (! Character.isDigit(d))
		return false;
		}
		return true;
	}
}
