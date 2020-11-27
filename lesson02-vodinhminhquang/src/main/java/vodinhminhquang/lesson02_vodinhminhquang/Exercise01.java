package vodinhminhquang.lesson02_vodinhminhquang;

/*Viết chương trình nhập vào ba số nguyên. Hãy in ba số này ra màn hình
theo thứ tự tăng dần và chỉ dùng tối đa một biến phụ

VD: Input 5 9 8 => Output: 5 8 9
Gợi ý: Có thể cho sẵn giá trị 3 biến bất kì. Không cần nhập xuất mất thời gian*/

public class Exercise01 {
	public static void main(String[] args) {
		int[] arr = {5, 9, 8};
		System.out.print("Input: ");
		for (int i = 0; i < arr.length; i++) {
			String s1 = "" + arr[i];
			System.out.print(" " + s1);
		}
		System.out.println();
		System.out.print("Output: ");
		ascendingOrder(arr);

	}

	public static void ascendingOrder(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					swap(arr, i, j);
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			String s2 = "" + arr[i];
			System.out.print(" " + s2);
		}
	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
