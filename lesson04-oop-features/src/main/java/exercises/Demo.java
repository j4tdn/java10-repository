package exercises;

import javax.lang.model.element.Element;

import functional.iinterface.Condition;

public class Demo {
	public static void main(String[] args) {
		// Give an one direction array integer
		// Write method find sum of odd elements
		int[] a = { 1, 3, 10, 8 };
		System.out.println(sum(a, e -> e %2 == 0));
		System.out.println("" +sum(a, element -> {
			return element %2 != 0;
		}));

	}

	public static int sum(int[] a, Condition con) {
		int sum = 0;
		for (int element : a) {

			if (con.test(element)) {
				sum += element;
			}

		}
		return sum;
	}

}
