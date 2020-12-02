package view;

import java.util.Scanner;

import bean.Vehicle;

public class Ex02 {
	public static void main(String[] args) {
		Vehicle vehicle1 = new Vehicle();
		Vehicle vehicle2 = new Vehicle();
		Vehicle vehicle3 = new Vehicle();
			int chon;
			do {
				Scanner scanner = new Scanner(System.in);
				System.out.println("1. Nhap danh sach");
			    System.out.println("2. In");
			    System.out.println("3. Thoat");
			    chon = Integer.parseInt(scanner.nextLine());
			    switch (chon) {
		        case 1:
		    		System.out.println("Input Car Owner Name 1: ");
		    		vehicle1.setCarOwnerName(scanner.nextLine());
		    		System.out.println("Input Types 1: ");
		    		vehicle1.setTypes(scanner.nextLine());
		    		System.out.println("Input Capacity 1: ");
		    		vehicle1.setCapacity(scanner.nextInt());
		    		System.out.println("Input Price 1: ");
		    		vehicle1.setPrice(scanner.nextInt());
		    		System.out.println("Input Car Owner Name 2: ");
		    		scanner.nextLine();
		    		vehicle2.setCarOwnerName(scanner.nextLine());
		    		System.out.println("Input Types 2: ");
		    		vehicle2.setTypes(scanner.nextLine());
		    		System.out.println("Input Capacity 2: ");
		    		vehicle2.setCapacity(scanner.nextInt());
		    		System.out.println("Input Price 2: ");
		    		vehicle2.setPrice(scanner.nextInt());
		    		scanner.nextLine();
		    		System.out.println("Input Car Owner Name 3: ");
		    		vehicle3.setCarOwnerName(scanner.nextLine());    		
		    		System.out.println("Input Types 3: ");
		    		vehicle3.setTypes(scanner.nextLine());    	
		    		System.out.println("Input Capacity 3: ");
		    		vehicle3.setCapacity(scanner.nextInt());
		    		System.out.println("Input Price 3: ");
		    		vehicle3.setPrice(scanner.nextInt());
		            break;
		        case 2:
		    		System.out.println("Car Owner Name\t\t\tTypes\t\tCapacity\tPrice\t\t\tTaxPayment\r\n"
		    				+	"==========================================================================================================");
		        	System.out.println("\n"+vehicle1 +
		        			"\n==========================================================================================================\n");
		        	System.out.println("\n"+vehicle2 +
		        			"\n==========================================================================================================\n");
		        	System.out.println("\n"+vehicle3 +
		        			"\n==========================================================================================================\n");
		            break;
		        case 3:
		        	
		        	System.out.println("Exit program!!!");
		    }
		} while (chon != 3);

	}
}

