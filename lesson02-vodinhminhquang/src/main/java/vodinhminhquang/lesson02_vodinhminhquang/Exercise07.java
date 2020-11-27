package vodinhminhquang.lesson02_vodinhminhquang;

import java.util.Random;

/*	
	Viết chương trình random 5 số nguyên ngẫu nhiên từ 20 – 30.
	Yêu cầu: 5 số ngẫu nhiên không được trùng nhau và trả về mảng 1 chiều
	Gợi ý: Cách khai báo mảng:
	1. int [] a = new int [5]; // a gồm 5 phần tử, giá trị mặc định bằng 0
	2. int [] a = {7, 2, 9, 4}; // a gồm 4 phần tử, với a[0] = 7, ... a[3] = 4
*/

public class Exercise07 {
	public static void main(String[] args) {
		Random rd = new Random();
		int[] arr = new int[5];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = 20 + rd.nextInt(11);
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(sieve(arr)[i] + " ");
		}
	}

	public static int[] sieve(int[] oldArray) {
		Random rd = new Random();
		int[] newArray = oldArray;
		for (int i = 0; i < newArray.length; i++) {
			for (int j = 0; j < newArray.length; j++) {
				if (i != j && newArray[i] == newArray[j]) {
					newArray[i] = 20 + rd.nextInt(11);
				}
			}
		}
		return newArray;
	}
}
