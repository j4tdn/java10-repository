
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		int xA, yA, xO, yO, r;
		Scanner input = new Scanner(System.in);
		System.out.print("xA: ");
		xA = input.nextInt();
		System.out.print("yA: ");
		yA = input.nextInt();
		System.out.print("xO: ");
		xO = input.nextInt();
		System.out.print("yO: ");
		yO = input.nextInt();
		System.out.print("R: ");
		r = input.nextInt();
		
		int rSquare = r * r;
		
		int oaSquare = (xA - xO) * (xA - xO) + (yA - yO) * (yA - yO);
		
		if (oaSquare < rSquare) {
			System.out.println("A is in the circle");
		} else if (oaSquare == rSquare) {
			System.out.println("A is on the circle");
		} else {
			System.out.println("A is outside the circle");
		}
	}
}

