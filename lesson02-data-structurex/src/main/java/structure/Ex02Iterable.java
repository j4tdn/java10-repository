package structure;

public class Ex02Iterable {
	public static void main(String[] args) {
		// loop: for, while, do while
		// for: already known limitation
		// while do while: undefined
		// do while: ignore first checking
		// while: checking as always

		System.out.println("sumFor: " + sumFor(10) + "\nsumWhile: " + sumWhile(10) + "\nsumDoWhile: " + sumDoWhile(10));

		// break, continue: used in for, while, do while
		// break: switch case
		// break: pause and exit the LOOP
		// continue: ignore the below code and continue with next loop

		for (int i = 1; i <= 5; i++) {
			if (i == 3) {
				continue;
			}
			if (i == 4) {
				break;
			}
			System.out.println("i: " + i);
		}
		System.out.println("Come here !!!");

	}

	private static int sumFor(int n) {
		int result = 0;
		for (int i = 1; i < n; i++) {
			result += i;
		}
		return result;
	}

	private static int sumWhile(int n) {
		int result = 0;
		while ((n = n - 1) > 0) {
			result += n;
		}
		return result;
	}

	private static int sumDoWhile(int n) {
		int result = 0;
		int i = 1;
		do {
			result += i;
			i++;
		} while (i < n);
		return result;
	}
}
