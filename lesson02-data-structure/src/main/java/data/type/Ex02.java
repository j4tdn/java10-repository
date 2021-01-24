package data.type;

public class Ex02 {

	public static void main(String[] args) {
		char c = '6';
		System.out.println("isDigit: " + isDigit(c));
		System.out.println("isDigit: " + (c >= '0' && c <= '9'));
		System.out.println("is Digit " + Character.isDigit(c));
		System.out.println("==================");
		System.out.println("isNumber: " + isNumber("123"));
	}

	// kiem tra 1 phuong thuc 1 ki tu co phai la 1 so hay khong ?
	private static boolean isDigit(char c) {
		return c >= 0 && c <= 9;

	}

	private static boolean isNumber(String input) {
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (!Character.isDigit(c)) {
				return false;
			}
		}
		return true;
	}
}
