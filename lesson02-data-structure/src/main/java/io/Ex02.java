package io;

import java.util.Random;

public class Ex02 {
	public static void main(String[] args) throws InterruptedException {
		Random rd = new Random();

		// random a number
		// while (true) {
		int first = 22 + rd.nextInt(35);

		System.out.println("first: " + first);

		Thread.sleep(1000);
		// }

		// Array: index= 0 lenght-1
		String[] students = { "teo", "na", "hoang", "phuc" };
		System.out.println("index 3: " + students[3]);

//		String rdStu1 = students[rd.nextInt(students.length)];
//		System.out.println("Student :" + rdStu1);

		// choose 2 students in class
		int firstIndex = rd.nextInt(students.length);
		String firstStudent = students[firstIndex];
		System.out.println("firstStudent: " + firstStudent);
		
		while(true) {
			int secondIndex = rd.nextInt(students.length);
			if (secondIndex != firstIndex) {
				String secondStudent = students[secondIndex];
				System.out.println("second :" + secondStudent);
				break;
			}
		}


	}
}