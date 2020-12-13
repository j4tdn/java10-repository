package ex02;

import java.util.ArrayList;
import java.util.Scanner;

public class missingNumber {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		ArrayList <Integer> arra = new ArrayList<Integer>();
		System.out.println("Nhập số phần tử của mảng:");
		int n=scanner.nextInt();
		int s[]= new int [n];
		System.out.println("Nhập các phần tử trong mảng");
		for(int i=1;i<n;i++) {
			do {
				System.out.print("Phần tử thứ "+i+":");
				s[i]=scanner.nextInt();
			}while(s[i]>n);
		}
		int j = s[0];
		for (int i = 0; i < s.length; i++) {
			if (j == s[i]) {
				j++;
				continue;
			} else {
				arra.add(j);
				i--;
				j++;
			}
		}
		System.out.println(" số còn thiếu là:");
		for (int r : arra) {
			System.out.print(" " + r);
		}
	} 
}
