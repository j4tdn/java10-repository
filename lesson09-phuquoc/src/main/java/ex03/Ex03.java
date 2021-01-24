package ex03;

public class Ex03 {
	public static void main(String[] args) {
		stringPermutation("", "abc");
	}

	private static void stringPermutation(String s, String str) {
		int x = str.length();
		if (x == 0)
			System.out.println(s);
		else {
			for (int i = 0; i < x; i++)
				stringPermutation(s + str.charAt(i), str.substring(0, i) + str.substring(i + 1, x));
		}
	}

}
