package exercises;

public class Ex05 {
	public static void main(String[] args) {
		int a = 100;
		System.out.println("Số ở hệ 2: " + convert(a));
	}

	private static String convert(int input) {
		String s = "";
		String result = "";
		while (input != 0) {
			s = s + input % 2;
			input = input / 2;
		}
		for (int i = s.length() - 1; i >= 0; i--) {
			result += s.charAt(i);
		}
		return result;
	}
}
