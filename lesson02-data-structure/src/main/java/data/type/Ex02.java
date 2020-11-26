package data.type;

public class Ex02 {
	public static void main(String[] args) {
		char c='6';
		System.out.println("isDigit: "+ isDigit(c));
		System.out.println("isDigit: "+ (c>='0' && c<='9'));
		System.out.println("isDigit: "+ Character.isDigit(c));
		System.out.println("==================================");
		System.out.println("isNumber: "+ isNumber("12x3"));
	}
	private static boolean isDigit(char c) {
		if (c>='0' && c<='9') {
			return true;
		}
		return false;
	}
	private static boolean isNumber(String input) {
		for (int i = 0; i < input.length(); i++) {
			char c= input.charAt(i);
			if (!Character.isDigit(c)) {
				return false;
			}
			
		}
		return true;
		
	}
}
