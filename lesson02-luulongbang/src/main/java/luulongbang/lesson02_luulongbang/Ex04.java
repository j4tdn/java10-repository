package luulongbang.lesson02_luulongbang;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		/*
		 * Array with numbers
		 * Find odd numbers
		 * Find the 2. largest odd number
		 */
		Scanner scanner = new Scanner(System.in);
		int arr_length;
		System.out.println("Enter the length of arrary: ");
		arr_length = scanner.nextInt();
		// creat a empty array with length = arr_length
		int[] arr = new int[arr_length];
		//arr[3] = 6;
		for (int i=0; i<arr.length; i=i+1) {
			System.out.print("Enter a vaue for array at position ");
			System.out.println(i );
			arr[i] = scanner.nextInt();
		}
		
		
		//find odd numbers of array
		for (int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
			if (arr[i] % 2 != 0)  {
				System.out.println(" is odd number");
			}
			else {
				System.out.println("is even number");
			}
		}
		//find the 2.largest ...
	}
}
