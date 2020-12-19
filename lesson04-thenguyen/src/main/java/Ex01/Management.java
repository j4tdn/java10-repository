package Ex01;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Management 
{
	
    public static void main( String[] args )
    {
        Scanner s =new Scanner(System.in);
        Students sv1=new Students(123, "Dang The Nguyen", 7.5f, 8.5f);
        Students sv2=new Students(456, "Tran Nhat Tai", 7, 9);
        Students sv3= new Students();
        System.out.println("Student 3");
		System.out.println("Enter ID: ");
		sv3.setId(Integer.parseInt(s.nextLine()));
		System.out.println("Enter full name: ");
		sv3.setFullName(s.nextLine());
		System.out.println("Enter theoretical: ");
		sv3.setTheoreticalPoint(s.nextFloat());
		System.out.println("Enter practical: ");
		sv3.setPracticePoint(s.nextFloat());
		
		
		System.out.println("Student List: ");
		System.out.println(sv1);
		System.out.println(sv2);
		System.out.println(sv3);
    }
}
