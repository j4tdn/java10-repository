package io;

import java.util.Random;

public class Ex02 {
	public static void main(String[] args) throws InterruptedException {
		Random rd = new Random();
		
		//random a number: 0-> bound -1
		//number : a - b : 22-56
		int first = 22 + rd.nextInt(35);
		System.out.println("first: " + first);
		Thread.sleep(1000);
		
		
		String [] students = { "Teo", "Thuan ngu", "Thanh ngu", "Nam"};
		System.out.println("index 1: " + students[1]);
		System.out.println("index 2: " + students[2]);
		System.out.println("index 3: " + students[3]);
		//choose 2 students in class
	//	int amount =0;
		//int randIndex = -1 ;
		//while(true) {
			int firstIndex =rd.nextInt(students.length);
			String firstStudent = students[firstIndex];
			System.out.println("first: " + firstStudent);
			while(true) {
				int secondIndex =rd.nextInt(students.length);
				if (secondIndex != firstIndex) {
					String secondStudent = students[secondIndex];
					System.out.println("second:" + secondStudent);
					break;
			
			//int rand = rd.nextInt(students.length);
			//String firstStudents = students[rand ];
		//	amount ++;
			//if (amount == 1) {
				//while (rand == rd.nextInt(student.length));
				
			}
		}
		
		//String rdStu1 = students[rd.nextInt(students.length)];
		//System.out.println("students: " + rdStu1);
		
		
	}

}
