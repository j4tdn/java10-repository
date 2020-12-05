package lesson03;

import java.util.Scanner;

public class Ex01 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		    Scanner ip = new Scanner(System.in) ; {
			System.out.print("Enter x0: ");
			int x0 = Integer.parseInt(ip.nextLine());
			System.out.print("Enter y0: ");
			int y0 = Integer.parseInt(ip.nextLine());
			System.out.print("Enter x1: ");
			int x1 = Integer.parseInt(ip.nextLine());  
			System.out.print("Enter y1: ");
			int y1 = Integer.parseInt(ip.nextLine()); 
			System.out.print("Enter R: ");
			int R = Integer.parseInt(ip.nextLine()); 
			int distance= (x1 - x0) * (x1 - x0) + (y1 - y0) * (y1 - y0);
			if(distance<(R*R)) {
				System.out.println("Điểm nằm trong đường tròn");

			}else if(distance>(R*R)) {
				System.out.println("Điểm nằm ngoài đường tròn");

			}else 
				System.out.println("Điểm nằm trên đường tròn");
		}
		}
	
}