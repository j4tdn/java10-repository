package Ex04;

import java.util.Scanner;

public class Main {
private static Scanner sc = new Scanner(System.in);
	
	private static Manager listNhanSu = new Manager();
	public static void main(String[] args) {
		int choose;
		do {
			System.out.println("====Quản lí nhân sự====");
			System.out.println("1. Nhập thông tin nhân viên");
			System.out.println("2. Hiển thị danh sách nhân viên");
			System.out.println("3. Hiển thị bảng lương nhân viên");
			System.out.println("0. Dừng chương trình");
			System.out.println("Chọn chức năng chương trình");
			choose = Integer.parseInt(sc.nextLine());
			switch (choose) {
			case 1:
				input();
				break;
			case 2: 
				System.out.println("\t\t\t\t\tDanh sách nhân sự:");
				System.out.println("-------------------");
				listNhanSu.display();
				System.out.println("-------------------");
				break;
			case 3:
				System.out.println("\t\t\t\t\tBảng lương nhân sự:");
				System.out.println("-------------------");
				listNhanSu.displaySalary();
				break;
			
			}
		} while (choose!=0);
	}
	
	private static void input() {
		
		do {
			System.out.println("-------------------");
			System.out.println("1. Nhập thông tin Giám đốc");
			System.out.println("2. Nhập thông tin Trưởng phòng");
			System.out.println("3. Nhập thông tin Nhân viên");
			System.out.println("4. Thoát");
			int choose = Integer.parseInt(sc.nextLine());
			switch (choose) {
			case 1:	
				People gd = new GiamDoc();
				gd.input();
				listNhanSu.add(gd);
				break;
			case 2:	
				People tp = new TruongPhong();
				tp.input();
				listNhanSu.add(tp);
				break;
			case 3:	
				People nv = new NhanVien();
				nv.input();
				listNhanSu.add(nv);
				break;
			case 4:
				return;
			}
		} while (true);
	}
}
