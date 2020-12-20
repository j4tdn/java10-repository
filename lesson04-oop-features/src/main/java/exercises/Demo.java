package exercises;

import functional.iinterface.Condition;

public class Demo {
	public static void main(String[] args) {
		// Give an ONE direction array integer
		// Write method find sum of odd elements
		int[] a = { 1, 3, 10, 8 };
		Condition con = new Condition() {
			@Override
			public boolean test(int input) {
				return input % 2 == 0;
			}
		};
		System.out.println("Sum of even elements: " + sum(a, con));
		System.out.println("Sum of odd elements: " + sum(a, element -> {
			return element % 2 != 0;
		}));
	}

	public static int sum(int[] a, Condition con) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			if (con.test(a[i])) {
				sum += a[i];

			}
		}
		return sum;
	}
}
