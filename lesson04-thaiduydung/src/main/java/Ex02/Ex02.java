package Ex02;

public class Ex02 {
	public static void main(String[] args) {
		int[] n = { 5, 7, 6, 8, 16, 33, 10, 21, 15, 14, 20, 24, 30, 35, 28, 42 };
		Condition con = new Condition() {
			@Override
			public boolean test(int input) {
				return input % 5 == 0;
			}
		};

		printf(n, element -> element % 5 == 0);
		printf(n, element -> element % 7 == 0);
	}

	public static void printf(int[] n, Condition con) {
		for (int i = 0; i < n.length; i++) {
			if (con.test(n[i])) {
				System.out.print(n[i] + "   ");
			}
		}
		System.out.println("\n==========================");
	}
}