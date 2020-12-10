package io;

import java.util.Random;

public class Ex03 {
	public static void main(String[] args) {
		Random rd = new Random();
		String[] students = {"Teo", "Na", "Nam", "Hoa"};
		
		String rdStu1 = students[rd.nextInt(students.length)];
		System.out.println("Student: " + rdStu1);
		
		// Choose 2 students in class
		int firstIndex = rd.nextInt(students.length);
		String firstStu = students[firstIndex];
		
		while (true) {
			int secondIndex = rd.nextInt(students.length);
			if (secondIndex != firstIndex) {
				String secondStu = students[secondIndex];
				System.out.println("first: " + firstStu);
				System.out.println("second: " + secondStu);
				break;
			}
		}
	}
}
