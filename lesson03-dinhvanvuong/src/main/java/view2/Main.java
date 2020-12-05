package view2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Vehicle vc1 = new Vehicle();
		Vehicle vc2 = new Vehicle();
		Vehicle vc3 = new Vehicle();
		int choose;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("1. Enter the list");
			System.out.println("2. Print the list");
			System.out.println("3. Exit");
			choose = new Scanner(System.in).nextInt();
			switch (choose) {
			case 1:
				System.out.println("Enter FullName One: ");
				vc1.setFullName(sc.nextLine());
				System.out.println("Enter Model One: ");
				vc1.setModel(sc.nextLine());
				System.out.println("Enter Capacity One: ");
				vc1.setCapacity(Integer.parseInt(null, sc.nextInt()));
				System.out.println("Enter Cost One : ");
				vc1.setCost(Double.parseDouble(sc.nextLine()));

				System.out.println("Enter FullName Two: ");
				vc2.setFullName(sc.nextLine());
				System.out.println("Enter Model Two : ");
				vc2.setModel(sc.nextLine());
				System.out.println("Enter Capacity Two : ");
				vc2.setCapacity(Integer.parseInt(null, sc.nextInt()));
				System.out.println("Enter Cost One Two : ");
				vc2.setCost(Double.parseDouble(sc.nextLine()));
				
				System.out.println("Enter FullName Three: ");
				vc3.setFullName(sc.nextLine());
				System.out.println("Enter Model Three: ");
				vc3.setModel(sc.nextLine());
				System.out.println("Enter Capacity Three: ");
				vc3.setCapacity(Integer.parseInt(null, sc.nextInt()));
				System.out.println("Enter Cost One Three: ");
				vc3.setCost(Double.parseDouble(sc.nextLine()));
				break;
			case 2:
				System.out.println("FullName \t Model \t Capacity \t Cost \t Tax \r \n"
						+ "================================= ");
				System.out.println("\n" + vc1
						+ "\n==============================\n");
				System.out.println("\n" + vc2
						+ "\n==============================\n");
				System.out.println("\n" + vc3
						+ "\n===========================\n");
				break;
			case 3:
				System.out.println("Exit");
			}
		} while (choose != 3);

	}	
		
		
	}


