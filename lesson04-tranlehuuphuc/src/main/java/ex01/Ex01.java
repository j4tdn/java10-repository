package ex01;

import java.util.Scanner;

public class Ex01 {
	static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		Constructor sv1 =new Constructor(1, "Teo", 8.5f, 8.2f);
		System.out.println(sv1);
		Constructor sv2 = new Constructor(2, "Ty", 8.6f, 7.6f);
		System.out.println(sv2);

		Constructor sv3 = new Constructor();
		System.out.println("Enter sv3: ");
		System.out.println("ip: ");
		sv3.setIp(Integer.parseInt(ip.nextLine()));
		System.out.println("Name: ");
		sv3.setName(ip.nextLine());
		System.out.println("LT: ");
		sv3.setLT(ip.nextFloat());
		System.out.println("TH: ");
		sv3.setTH(ip.nextFloat());

	}
}