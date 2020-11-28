package exercises;

public class Ex03 {
	public static void main(String[] args) {
		int a = 13331;

		if (a == reverseDigit(a)) {
			System.out.println("Là số đối xứng");
		} else {
			System.out.println("Không là số đối xứng");
		}
	}

	private static int reverseDigit(int input) {
		int result = 0;
		while (input != 0) {
			result = (result * 10) + input % 10;
			input = input / 10;
		}
		return result;
	}
}
