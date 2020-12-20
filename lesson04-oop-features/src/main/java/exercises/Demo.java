package exercises;

import functional.iinterface.Condition;

public class Demo {
	public static void main(String[] args) {
		// give a One direction array int
		// Write method find sum of odd elements

		int[] a = { 1, 3, 10, 8 };
	

//		Condition con = new Condition() {
//			@Override
//			public boolean test(int input) {
//				return input % 2 == 0;
//			}
//		};
		System.out.println(sum(a, element -> element % 2 == 0));
		//sum(a, element -> element % 2 == 0);

	}

	public static int sum(int[] a, Condition con) {
		int sum = 0;
		for (int element : a) {
			if (con.test(element)) {
				sum+= element;
			}
		}
		return sum;
	}

}
