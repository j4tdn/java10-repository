package exercises;

import javax.lang.model.element.Element;

import functional.iinterface.Condition;

public class Demo {
	public static void main(String[] args) {
		// Give an ONE direction array integer
		// Write method find sum of odd elements
		// even
		// power of 2
		// prime
		int a[] = { 1, 3, 5, 8 };
		System.out.println(sum(a, e -> {
			return e % 2 == 0;
		}));
	}

	private static int sum(int[] a, Condition con) {
		int sum = 0;
		for (int element : a) {
			if (con.test(element)) {
				sum += element;
			}
		}
		return sum;
	}
}
