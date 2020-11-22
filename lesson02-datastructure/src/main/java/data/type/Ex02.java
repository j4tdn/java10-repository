package data.type;

public class Ex02 {
	public static void main(String[] args) {
		char c = '6';
		System.out.println(isDigit(c));

		System.out.println("Is Digit: " + (c >= '0' && c <= '9'));
		System.out.println("Is Digit: " + Character.isDigit(c));

		String s = "123x4";
		System.out.println("Is Number: " + isNumber(s));
	}

	// Write method whether character is digits ?
	public static boolean isDigit(char c) {
		if (c >= '0' && c <= '9') {
			return true;
		}
		return false;
	}

	private static boolean isNumber(String input) {
		for (int i = 0; i < input.length(); i++) {
			if (Character.isDigit(input.charAt(i))) {
				return false;
			}
		}

		return true;
	}
}
