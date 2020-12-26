package exercises;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
        int aNumber, bNumber;
     
        try {
        	@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in) ;
			System.out.println("Nhập vào số a: ");
			aNumber = scanner.nextInt();
			System.out.println("Nhập vào số b: ");
			bNumber = scanner.nextInt();
		
        	System.out.println("Phương trình bạn vừa nhập vào là: " + aNumber + "x + " + bNumber + " = 0.");
        }
		 catch (Exception e) {
			System.out.println("Lỗi chia cho 0 !");
		}
        
    }

}
