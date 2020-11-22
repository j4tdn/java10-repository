package io;

import java.util.Random;

public class Ex02 {
     public static void main(String[] args) throws InterruptedException {
		Random rd = new Random();
		
		// random a number: 0 -> bound - 1
	while (true) {
		int first = 22 + rd.nextInt(35);
		System.out.println("first: " + first);
		Thread.sleep(1000);
		
		//Array: index = 0 -> length - 1
		String[] student = {"Teo", "Na", "Nam", "Hoa"};
		System.out.println("index 1 :" + student[1]);
		System.out.println("index 2 :" + student[2]);

        int firstIndex = rd.nextInt(student.length);
        String firstStudent = students[firstIndex];
        System.out.println("first: " + firstStudent);
        
        while(true) {
        	int secondIndex = rd.nextInt(student.length);
        	if (secondIndex != firstIndex) {
        		String secondStudent = students[secondIndex];
        		System.out.println("second" + secondIndex);
        	}
        	
        	break;
					
		}
		
	}
  }
}