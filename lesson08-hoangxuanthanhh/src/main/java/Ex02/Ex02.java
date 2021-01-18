package Ex02;

import java.util.Scanner;

public class Ex02 {
		public static void main(String[] args) {
			Scanner ip = new Scanner(System.in);
			System.out.println("Nhap ten: ");
			String input = ip.nextLine();
			if(!input.matches("[a-zA-Z\\\\s]+")) {
				System.out.println("moi nhap lai ");		
			}
		}
}
