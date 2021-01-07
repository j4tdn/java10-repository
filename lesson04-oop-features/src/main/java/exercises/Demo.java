package exercises;

import java.io.File;
import java.io.FileReader;

import functional.iinterface.Condition;

public class Demo {
	public static void main(String[] args) {
		// Give an ONE direction array integer
		// Write method find sum of odd elements
		// even
		// power of 2
		// prime
		int[] a = {1,3,5,8};
		
		int sum = sum(a, e -> {
			try {
				System.out.println(5/0);
			} catch (Exception e2) {
				System.out.println("LOG: " + e2.getMessage());
			}
			
			return e % 2 == 0;
		});
		System.out.println("result: " + sum);
	}
	
	private static int sum(int[] a, Condition con) {
		int sum = 0;
		for (int element: a) {
			if (con.test(element)) {
				sum += element;
			}
		}
		return sum;
	}
	
}
