package exercises;

import java.util.Scanner;

/*Bài 1: Viết chương trình nhập vào ba số nguyên. Hãy in ba số này ra màn hình
theo thứ tự tăng dần và chỉ dùng tối đa một biến phụ
	 */
public class Ex01 {

	public static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr = new int[3];
		System.out.println("Enter 3 integers : \n");
		for (int i = 0; i < 3; i++) {
			System.out.print("a" + "[" + i + "] :");
			arr[i] = ip.nextInt();
		}

		sortArray(arr);
		System.out.println("Ascending order:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void sortArray(int[] arr) {
		int a = arr[0];
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					a = arr[j];
					arr[j] = arr[i];
					arr[i] = a;

				}
			}
		}
	}
}
