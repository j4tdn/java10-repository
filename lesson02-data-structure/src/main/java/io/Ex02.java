package io;

import java.util.Random;

public class Ex02 {
	public static void main(String[] args) throws InterruptedException {
		Random rd = new Random();
		
		// random a number: 0 -> bound-1
		while (true) {
			int first = rd.nextInt(10);
			System.out.println("first: " +first);
			Thread.sleep(1000);
			if (first == 9) {
				System.out.println("Bye");
				System.exit(0);
			}
		}
		
		// random a -> b: [ a + rd.nextInt(a + b -1) ]
	}

}
