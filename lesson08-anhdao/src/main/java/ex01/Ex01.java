package ex01;

import java.util.Scanner;

/**
 * Bài 1: Viết chương trình nhập vào một chuỗi kí tự bất kì sau đó thực hiện các
 * công việc sau : Yêu cầu: Chuỗi chỉ chứa các kí tự tiếng việt có dấu, phím space. 
 * + In ra mỗi kí tự trên một dòng 
 * + In ra mỗi từ trên mỗi dòng, các từ các nhau bởi kí tự trống
 * + In ra chuỗi đảo ngược theo từ và theo kí tự
 *
 */
public class Ex01 {
	public static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter a character string : ");
		String s = ip.nextLine();
		// In ra mỗi kí tự trên 1 dòng
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i) + " ");
		}
		System.out.println("===================================");

		// In ra mỗi từ trên mỗi dòng, các từ các nhau bởi kí tự trống
		String[] elements = s.split(" ");
		for (String element : elements) {
			System.out.println(element);
		}
		System.out.println("==================================");

		// In ra chuỗi đảo ngược theo từ và theo kí tự
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.println(s.charAt(i) );
		}
		System.out.println("==================================");
		for (int i = elements.length - 1; i >= 0; i--) {
			System.out.println(elements[i] );
		}
	}

}
