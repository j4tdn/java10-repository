package Ex02;

import java.util.Scanner;

import javax.sql.rowset.CachedRowSet;

public class VehicleInformation {
	public static void main(String[] args) {
		Vehicle vehicle1 = new Vehicle();
		Vehicle vehicle2 = new Vehicle();
		Vehicle vehicle3 = new Vehicle();
		int choose;
		do {
			Scanner ip = new Scanner(System.in);
			System.out.println("1.enter list:");
			System.out.println("2.print list:");
			System.out.println("1.exit:");
			choose = Integer.parseInt(ip.nextLine());
			switch (choose) {
			case 1:
				System.out.println("Enter the name of the vehicle owner 1: ");
				vehicle1.setcarownername(ip.nextLine());
				System.out.println("Enter the vehicle type 1: ");
				vehicle1.setrangeofvehicle(ip.nextLine());
				System.out.println("Enter the capacity 1: ");
				vehicle1.setcapacity(ip.nextInt());
				System.out.println("Enter the vehicle value 1: ");
				vehicle1.setprice(ip.nextInt());

				System.out.println("Enter the name of the vehicle owner 2: ");
				ip.nextLine();
				vehicle2.setcarownername(ip.nextLine());
				System.out.println("Enter the vehicle type 2: ");
				vehicle2.setrangeofvehicle(ip.nextLine());
				System.out.println("Enter the capacity 2: ");
				vehicle2.setcapacity(ip.nextInt());
				System.out.println("Enter the vehicle value 2: ");
				vehicle2.setprice(ip.nextInt());
				ip.nextLine();

				System.out.println("Enter the name of the vehicle owner 3: ");
				vehicle3.setcarownername(ip.nextLine());
				System.out.println("Enter the vehicle type 3: ");
				vehicle3.setrangeofvehicle(ip.nextLine());
				System.out.println("Enter the capacity 3: ");
				vehicle3.setcapacity(ip.nextInt());
				System.out.println("Enter the vehicle value 3: ");
				vehicle3.setprice(ip.nextInt());
				break;
			case 2:
				System.out.println("Car Owner Name\tRange Of Vehicle\tCapacity\tPrice\t\t\tTaxMustPaid\r\n"
						+ "==========================================================================================================");
				System.out.println(vehicle1 + "\t"
						+ "\n==========================================================================================================");
				System.out.println(vehicle2 + "\t"
						+ "\n==========================================================================================================");
				System.out.println(vehicle3 + "\t"
						+ "\n==========================================================================================================");
				break;
			case 3:
				System.out.println("Exited the program");
			}
		} while (choose != 3);
	}
}
