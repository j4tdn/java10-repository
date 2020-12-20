package exercises;

import functional.iinterface.Condition;

public class Demo {
	// Give an ONE direction array Integer
	// Write a method find sum of odd element
	// even
	// power of 2
	// prime
	public static void main(String[] args) {
		int[] a = {1, 3, 10, 8};
		System.out.println(sum(a, (element) -> element % 2 != 0));
		System.out.println(sum(a, null));
		
	}
	
	private static int sum(int[] a, Condition con) {
		int sum = 0;
		for (int i : a) {
			if (con.test(i)) {
				sum += i;
			}
		}
		return sum;
	}
}