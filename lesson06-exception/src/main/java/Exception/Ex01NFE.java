package Exception;
import java.util.Scanner;

public class Ex01NFE {
	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		
		int number = 0;
		do {
			try {
				System.out.print("Enter a number: ");
				number = Integer.parseInt(ip.nextLine());
				break;
			} catch (NumberFormatException nfe) {
				System.out.println("Invalid number !");
			}
		} while (true);
		
		System.out.println("result: " + number);
		System.out.println("Back to main thread");
		
	}
}
