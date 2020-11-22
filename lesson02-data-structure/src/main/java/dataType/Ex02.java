package dataType;

public class Ex02 {
	public static void main(String[] args) {
		char c = '7';
		System.out.println(isDigit('x'));
		System.out.println(c >= '0'  && c <= '9');
		System.out.println("isDigit: " + Character.isDigit('9'));
		
		System.out.println("-----------");
		System.out.println("isNumber: " + isNumber("123x"));
	}
	
	// Write method whether character is a digit?
	private static boolean isDigit(char c) {
		return c >= '0'  && c <= '9';
	}
	
	private static boolean isNumber(String input) {
		for (int i = 0; i < input.length(); i++) {
			if (!Character.isDigit(input.charAt(i))) {
				return false;
			}
		}
		return true;
	}
}
