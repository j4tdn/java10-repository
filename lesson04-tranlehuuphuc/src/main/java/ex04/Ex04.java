package ex04;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {

		Scanner ip = new Scanner(System.in);

		GD GD1 = new GD ("Huu Phuc", 20, 30000000, 4);
		GD1.getSalaryGD();
		System.out.println(GD1);

		TP TP1 = new TP("Xuan Thanh", 21, 20000000, 3); 
		TP1.getSalaryTP();
		System.out.println(TP1);
		
		NV NV1 = new NV("Ngoc Thuan", 20, 10000000, 1);
		NV1.getSalaryNV();
		System.out.println(NV1);
		
		NV NV2 = new NV("Van Vuong", 20, 15000000, 2);
		NV2.getSalaryNV();
		System.out.println(NV2);
	}

}
