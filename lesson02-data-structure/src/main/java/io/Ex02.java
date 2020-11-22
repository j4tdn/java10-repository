package io;

import java.util.Random;

public class Ex02 {
	// random

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Random rd = new Random();

		// random a number
		// while(true) {
		int first = 22 + rd.nextInt(35);
		// random tu 22 -> 56
		System.out.println("first: " + first);
		Thread.sleep(1000);
		// }ZZ

		// -------------------------------
		// Array: index = 0 => (n-1)
		String[] students = { "Teo", "Na", "Nam", "Hoang" };
		System.out.println("index 1 : " + students[1]);
		System.out.println("index 2 : " + students[2]);
		// ---------------------------------------- chỉ số index
		String rdStu1 = students[rd.nextInt(students.length)];
		System.out.println("Random students: " + rdStu1);

		// choose 2 students in class: chọn hai bạn không trùng tên
		int firstIndex = rd.nextInt(students.length);
		String firstStudent = students[firstIndex];
		System.out.println("First student: " + firstStudent);
		while (true) {
			int secondIndex = rd.nextInt(rd.nextInt(students.length));
			if (secondIndex != firstIndex) {
				String secondStudent = students[secondIndex];
				System.out.println("Second student: " + secondStudent);
				break;
			}
		}
	}

}
