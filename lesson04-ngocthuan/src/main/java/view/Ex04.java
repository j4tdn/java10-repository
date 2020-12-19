package view;

import java.util.Scanner;

public class Ex04{
	public static void main(String[] args) {
		
	Scanner ip = new Scanner(System.in);
	
	GiamDoc GD1 = new GiamDoc("ngoc thuan", 21, 30000000, 2);
	GD1.getSalaryG();
	System.out.println(GD1);
		
	TruongPhong TP1 = new TruongPhong("xuan thanh", 21, 10000000, 2);
	TP1.getSalaryT();
	System.out.println(TP1);
	NhanVien NV1 = new NhanVien("huu phuc", 21, 5000000, 2);
	NV1.getSalaryN();
	System.out.println(NV1);
	NhanVien NV2 = new NhanVien("van vuong", 21, 5000000, 2);
	NV2.getSalaryN();
	System.out.println(NV2);
}
}