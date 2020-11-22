package io;

import java.util.Random;

public class Ex02 {
	public static void main(String[] args) throws InterruptedException {
		Random rd = new Random();

		// Random a numbe
		// Random a -> b: a + rd(b - a + 1);

		int first = 22 + rd.nextInt(35);
		System.out.println(first);
		// Thread.sleep(1000);

		String[] students = { "Teo", "Na", "Nam", "Hoa" };
		
		int firstIndex = rd.nextInt(students.length);
		String firstStudent = students[firstIndex];
		String secondStudent;
		while(true) {
			int secondIndex = rd.nextInt(students.length);
			if(secondIndex != firstIndex) {
				secondStudent = students[secondIndex];
				break;
			}
		}
		System.out.println("First Student: " + firstStudent);
		System.out.println("Second Student: " + secondStudent);
		

	}
	
}
