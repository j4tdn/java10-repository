package lesson03_exercises_Ex02;

import java.util.Scanner;

public class VehicleInformation {
	public static void main(String[] args) {
		Vehicle vehicle1 = new Vehicle();
		Vehicle vehicle2 = new Vehicle();
		Vehicle vehicle3 = new Vehicle();
		int chon;
		do {
			Scanner scanner = new Scanner(System.in);
			System.out.println("1. Enter the list");
			System.out.println("2. Print");
			System.out.println("3. Exit");
			chon = Integer.parseInt(scanner.nextLine());
			switch (chon) {
			case 1:
				System.out.println("Enter the name of the vehicle owner 1: ");
				vehicle1.setcarOwnerName(scanner.nextLine());
				System.out.println("Enter the vehicle type 1: ");
				vehicle1.setrangeOfVehicle(scanner.nextLine());
				System.out.println("Enter the capacity 1: ");
				vehicle1.setcapacity(scanner.nextInt());
				System.out.println("Enter the vehicle value 1: ");
				vehicle1.setprice(scanner.nextInt());

				System.out.println("Enter the name of the vehicle owner 2: ");
				scanner.nextLine();
				vehicle2.setcarOwnerName(scanner.nextLine());
				System.out.println("Enter the vehicle type 2: ");
				vehicle2.setrangeOfVehicle(scanner.nextLine());
				System.out.println("Enter the capacity 2: ");
				vehicle2.setcapacity(scanner.nextInt());
				System.out.println("Enter the vehicle value 2: ");
				vehicle2.setprice(scanner.nextInt());
				scanner.nextLine();
				System.out.println("Enter the name of the vehicle owner 3: ");
				vehicle3.setcarOwnerName(scanner.nextLine());
				System.out.println("Enter the vehicle type 3: ");
				vehicle3.setrangeOfVehicle(scanner.nextLine());
				System.out.println("Enter the capacity 3: ");
				vehicle3.setcapacity(scanner.nextInt());
				System.out.println("Enter the vehicle value 3: ");
				vehicle3.setprice(scanner.nextInt());
				break;
			case 2:
				System.out.println("Car Owner Name\t\t\tRange Of Vehicle\t\tCapacity\tPrice\t\t\tTaxMustPaid\r\n"
						+ "==========================================================================================================");
				System.out.println("\n" + vehicle1
						+ "\n==========================================================================================================\n");
				System.out.println("\n" + vehicle2
						+ "\n==========================================================================================================\n");
				System.out.println("\n" + vehicle3
						+ "\n==========================================================================================================\n");
				break;
			case 3:
				System.out.println("Exited the program");
			}
		} while (chon != 3);

	}
}
