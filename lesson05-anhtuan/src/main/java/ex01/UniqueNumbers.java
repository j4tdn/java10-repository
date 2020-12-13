package ex01;

public class UniqueNumbers {
	public static void main(String[] args) {
		int s[] = { 3, 15, 21, 0, 15, 17, 21 };
		uniNumber(s);
	}

	public static int[] uniNumber(int s[]) {
		int temp = s[0];
		for (int i = 0; i < s.length-1; i++) {
			for (int j = i + 1; j < s.length; j++) {
				if (s[i] > s[j]) {
					temp = s[j];
					s[j] = s[i];
					s[i] = temp;
				}
			}
		}
		for (int i = 0; i < s.length; i++) {

			if (i == 0) {
				if (s[i] != s[i + 1]) {
					System.out.println("Phần tử xuất hiện một lần duy nhất: " + s[i]);
				}
			}

			else if (i == s.length - 1) {
				if (s[i] != s[i - 1]) {
					System.out.println("Phần tử xuất hiện một lần duy nhất: " + s[i]);
				}
			}

			else {
				if (s[i] != s[i + 1] && s[i] != s[i - 1]) {

					System.out.println("Phần tử xuất hiện một lần duy nhất: " + s[i]);
				}

			}

		}
		return s;
	}
}
