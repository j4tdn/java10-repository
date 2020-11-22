package io;

import java.util.Random;

public class Ex02 {
	public static void main(String[] args) throws InterruptedException {
		Random rd = new Random();

		// random a number: 0 -> bound-1
		// random number: a - b: 22 ->56
		int first = 22 + rd.nextInt(35);
		System.out.println("first: " + first);
		Thread.sleep(1000);

		// Array: index = 0 -> length - 1
		String[] students = { "TNT", "Na", "Nam", "Hoa" };
		System.out.println("index 1: " + students[1]);
		System.out.println("index 2: " + students[2]);

		String rdStu1 = students[rd.nextInt(students.length)];
		System.out.println("student: " + rdStu1);

		// choose 2 students in class
		
		int firstIndex = rd.nextInt(students.length);
		String firstStudent = students[firstIndex];
		System.out.println("first: " + firstStudent);
		while (true) {
			int secondIndex = rd.nextInt(students.length);
			if (secondIndex != firstIndex) {
				String secondStudent = students[secondIndex];
				System.out.println("second: " + secondStudent);
				break; // exit the current loop
			}

		}

	}
}
