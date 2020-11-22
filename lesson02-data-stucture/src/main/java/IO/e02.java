package IO;

import java.util.Random;

public class e02 {
   public static void main(String[] args) throws InterruptedException {
	Random rd = new Random();
	
	// random a number: 0 -> bround -1
	// number: a - b: 22 56

	int first = 22+ rd.nextInt(35);
	System.out.println("first: " + first);
	Thread.sleep(1000);
	
	String[] students = { "bin","nha", "tai", "xum"};
	System.out.println("index 1:  " + students[2]); 
	System.out.println("index 2:  " + students[3]); 
	System.out.println("index 3:  " + students[0]); 
    
	int firstIndex = rd.nextInt(students.length);
	String firstStudent = students[firstIndex];
	System.out.println("first: " + firstStudent);
	
	while(true) {
	 int secondIndex = rd.nextInt(students.length) ;
	 if(secondIndex != firstIndex) {
		 String secondStudent = students[secondIndex];
		 System.out.println("second: " + secondStudent);
		 //exit the current loop
		 break;
			
		}
	}
	
	
	

   }
}

	//String rdStu1 = students[rd.nextInt(students.length)];
	//System.out.println("Student: " + rdStu1);
   

