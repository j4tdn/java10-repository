package exercise02;

import java.util.Scanner;

public class Exercise02 {
	public static void main(String[] args) {
		menuInput();
	}
	
	public static void menuInput() {
		Scanner console = new Scanner(System.in);
		int choice;
		
		Vehicle[] arr = new Vehicle[3];
		do {
			printMenu();
			choice = console.nextInt();
			
			switch(choice) {
			case 1:
				arrayCar(arr);
				inputCarInformation(arr);
				break;
			case 2:
				printIntro();
				printInfo(arr);
				break;
			case 3:
				System.out.println("Bye!");
				break;
			default:
				System.out.println("Choose Again!");
				System.out.println();
				break;	
			}	
		}while(choice != 3);
	}
	public static void printIntro() {
		System.out.println("Tên chủ xe\t Loại xe\t Dung tích\t Trị giá\t Thuế phải nộp");
		System.out.println("=============================================================================="
				+ "");
	}
	public static void printMenu() {
		System.out.println("===========================");
		System.out.println("1 - Nhập thông tin xe");
		System.out.println("2 - Xuất bảng kê khai tiền thuế trước bạ của các xe");
		System.out.println("3 - Thoát");
		System.out.println("===========================");
	}
	public static Vehicle[] inputCarInformation(Vehicle[] arr) {
			Scanner console = new Scanner(System.in);
			for(int i = 0; i < arr.length; i++) {
				System.out.print("Name: " );
				arr[i].setName(console.nextLine());
				System.out.print("Model: ");
				arr[i].setModel(console.nextLine());
				System.out.print("Volume: ");
				arr[i].setVolume(Integer.parseInt(console.nextLine()));
				System.out.print("Price: ");
				arr[i].setPrice(Long.parseLong(console.nextLine()));
				System.out.println("===========================");
			}
			return arr;
		}

	public static Vehicle[] arrayCar(Vehicle[] arr) {
		Vehicle[] arrayCar = arr;
		for(int i = 0; i < arr.length; i++) {
			arr[i] = new Vehicle();
		}
		return arrayCar;
	}
	public static void printInfo(Vehicle[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
