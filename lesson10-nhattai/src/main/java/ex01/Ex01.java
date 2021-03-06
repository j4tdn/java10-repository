package ex01;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		int[] digits = { 5, 4, 5, 7, 4, 3, 8, 9, 5, 3 };
		System.out.println("Xoá phần tử trùng nhau:");
		System.out.println(Arrays.toString(removeDuplicates(digits)));
		System.out.println("\n==================");
		System.out.println("so sánh tổng 5pt trước với 5 pt sau: ");
		compare(digits);
		System.out.println("\n==================");
		System.out.println("sắp xếp tăng dần ");
		insertionSort(digits);
		forEach(digits);
		

	}

	private static void compare(int a[]) {
		int before = 0;
		int after = 0;
		for (int i = 0; i < a.length / 2; i++) {
			before = before + a[i];
			
		}
		for (int i = a.length/2; i < a.length; i++) {
			after = after + a[i];

		}
		if (before > after) {
			System.out.println("before > after");
		} else if (before == after) {
			System.out.println("before = after");
		}
		System.out.println("before < after");
		
		

	}
	
	private static void insertionSort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
	private static int[] removeDuplicates(int[] a) {

		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length - 1; j++) {
				if (a[j] == a[i]) {
					a[j] = 0;
				}
			}
		}
		a[a.length - 1] = 0;
		return a;
	}
	

	private static void forEach(int[] items) {
		System.out.println();
		for (int item : items) {
			System.out.print(item + " ");
		}
	}
}
