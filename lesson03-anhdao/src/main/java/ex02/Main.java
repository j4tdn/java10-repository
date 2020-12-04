package ex02;

import java.util.Scanner;

public class Main {
	public static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		Vehicle vehicle1 = new Vehicle(null, null, 0, 0);
		Vehicle vehicle2 = new Vehicle(null, null, 0, 0);
		Vehicle vehicle3 = new Vehicle(null, null, 0, 0);
        
		int select;
		do {

			System.out.println("Please select one item on the List: ");
			System.out.println("1.Enter information and create Object ");
			System.out.println("2.Output tax");
			System.out.println("3.Exit.");
			select = Integer.parseInt(ip.nextLine());
			switch (select) {
			case 1:
				System.out.println("veh1 (OwnerName, type, capacity, cost) ");
				vehicle1  = new Vehicle(ip.nextLine(), ip.nextLine(), Double.parseDouble(ip.nextLine()),
						Double.parseDouble(ip.nextLine()));

				System.out.println("veh2 (OwnerName, type, capacity, cost) ");
				vehicle2 = new Vehicle(ip.nextLine(), ip.nextLine(), Double.parseDouble(ip.nextLine()),
						Double.parseDouble(ip.nextLine()));

				System.out.println("veh3 (OwnerName, type, capacity, cost) ");
				vehicle3 = new Vehicle(ip.nextLine(), ip.nextLine(), Double.parseDouble(ip.nextLine()),
						Double.parseDouble(ip.nextLine()));
				
			case 2:
				System.out.println(
						"OwnerName" + "\t\t" + "Type" + "\t\t" + "Capacity" + "\t\t" + "Cost" + "\t\t" + "Tax");
				System.out.println(
						"----------------------------------------------------------------------------------------");
				System.out.println(vehicle1);
				System.out.println(vehicle2);
				System.out.println(vehicle3);
				break;
			case 3:
				System.out.println("Exit");
				break;
			}
		} while (select > 0 && select <= 3);

	}
	// create object veh1, veh2, veh3

}
