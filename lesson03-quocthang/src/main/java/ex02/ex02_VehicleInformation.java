package ex02;

import java.util.Scanner;

public class ex02_VehicleInformation {
	public static void main(String[] args) {
		ex02_Vehicle vehicle01 = new ex02_Vehicle();
		ex02_Vehicle vehicle02 = new ex02_Vehicle();
		ex02_Vehicle vehicle03 = new ex02_Vehicle();
		int choose;
		do {
			Scanner scanner = new Scanner(System.in);
			System.out.println("1. Enter the list");
			System.out.println("2. Print the list");
			System.out.println("3. Exit");
			choose = Integer.parseInt(scanner.nextLine());
			switch (choose) {
			case 1:
				System.out.println("Enter the name of the vehicle owner 1: ");
				vehicle01.setvehicleOwnerName(scanner.nextLine());
				System.out.println("Enter the vehicle type 1: ");
				vehicle01.setrangeOfVehicle(scanner.nextLine());
				System.out.println("Enter the capacity 1: ");
				vehicle01.setcapacity(scanner.nextInt());
				System.out.println("Enter the vehicle value 1: ");
				vehicle01.setprice(scanner.nextInt());

				System.out.println("Enter the name of the vehicle owner 2: ");
				scanner.nextLine();
				vehicle02.setvehicleOwnerName(scanner.nextLine());
				System.out.println("Enter the vehicle type 2: ");
				vehicle02.setrangeOfVehicle(scanner.nextLine());
				System.out.println("Enter the capacity 2: ");
				vehicle02.setcapacity(scanner.nextInt());
				System.out.println("Enter the vehicle value 2: ");
				vehicle02.setprice(scanner.nextInt());
				scanner.nextLine();
				System.out.println("Enter the name of the vehicle owner 3: ");
				vehicle03.setvehicleOwnerName(scanner.nextLine());
				System.out.println("Enter the vehicle type 3: ");
				vehicle03.setrangeOfVehicle(scanner.nextLine());
				System.out.println("Enter the capacity 3: ");
				vehicle03.setcapacity(scanner.nextInt());
				System.out.println("Enter the vehicle value 3: ");
				vehicle03.setprice(scanner.nextInt());
				break;
			case 2:
				System.out.println("Vehicle Owner Name\t\t\tRange Of Vehicle\t\tCapacity\tPrice\t\t\tTaxMustPaid\r\n"
						+ "==========================================================================================================");
				System.out.println("\n" + vehicle01
						+ "\n==========================================================================================================\n");
				System.out.println("\n" + vehicle02
						+ "\n==========================================================================================================\n");
				System.out.println("\n" + vehicle03
						+ "\n==========================================================================================================\n");
				break;
			case 3:
				System.out.println("Exited the program");
			}
		} while (choose != 3);

	}
}
