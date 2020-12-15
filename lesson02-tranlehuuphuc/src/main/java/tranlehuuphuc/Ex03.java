package tranlehuuphuc;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		int n;
		boolean name;
		Scanner sc;
		do {
			System.out.println("put on n: ");
			sc = new Scanner(System.in);
			n = sc.nextInt();
		} while (n <= 0);
		name = isPalindromeNum(n);
		if (name) {
			System.out.println(n + ":symmetrical numbers");
		} else {
			System.out.println(n + ":number is not symmetrical");
		}
		sc.close();

	}

	private static boolean isPalindromeNum(int n) {
		// TODO Auto-generated method stub
		int name = 0, tmp = n;
		while (tmp > 0) {
			name = name * 10 + tmp % 10;
			tmp /= 10;
		}
		if (name == n) {
			return true;
		} else {
			return false;
		}

	}

}
