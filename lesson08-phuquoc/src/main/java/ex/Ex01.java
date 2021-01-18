package ex;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		String chuoi;
		char kyTu;
		String result= "";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào một chuỗi:");
		chuoi = scanner.nextLine();
		System.out.println("Chuỗi vừa nhập:"+chuoi);
        System.out.println("Kí tự trên mỗi dòng:");
		
		for (int i = 0; i < chuoi.length(); i++) {
	        kyTu = chuoi.charAt(i);
	           

	        System.out.println(kyTu);
	    }
		
		String [] chuoiArr = chuoi.split(" ");
        System.out.println("Mỗi từ trên mỗi dòng:");
		iterate(chuoiArr);
	    
		for (int i = chuoi.length() - 1; i >= 0; i--) {
			result = result + chuoi.charAt(i);	           

	    }
        System.out.println("Chuỗi đảo ngược:"+result);
	}
	
	private static void iterate(String[]elements) {
		for(String element: elements) {
			System.out.println(element);
			System.out.println();
		}
		
		
}
}
