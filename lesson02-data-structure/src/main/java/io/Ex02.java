package io;

import java.util.Random;

public class Ex02 {
	public static void main(String[] args) throws InterruptedException {

		Random rd = new Random();
		// random a number
		while (true) {
			int first = 22 + rd.nextInt(35);
			System.out.println(" first :" + first);
			Thread.sleep(1000);
			String[] student = { " teo", "na", "nam", " hoa" };
			System.out.println(" index 2:" + student[2]);
			System.out.println(" index 3:" + student[3]);
			String rdStu1 = student[rd.nextInt(student.length)];
			System.out.println(" student" + rdStu1);
			// chose 2 students in class
		 int firstIndex = rd.nextInt( student.length);
		 String firstStudent = student[firstIndex];
		 System.out.println(" first :" + firstStudent);
		 while(true) {
			 int secondIndex = rd.nextInt(student.length);
				if (secondIndex != firstIndex) {
			 String secondStudent = student[secondIndex];
			 System.out.println("second:" + secondStudent);
			 }
					 
		 }
			}
				

		}
	}

