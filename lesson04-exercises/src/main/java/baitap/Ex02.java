package baitap;

public class Ex02 {
	public static void main(String[] args) {
		int a[] = { 3, 55, 20, 8, 14, 15, 15, 15, 42, 35, 55 };
		System.out.println("\nMang ban dau: ");
		outputArr(a);

		int a2[] = new int[a.length];
		int count = 0;
		int n2 = a.length;

		for (int i = 0; i < a.length; i++) {
			if (a[i] % 7 == 0 && a[i] % 5 != 0) {
				a2[count] = a[i];
				count++;
			} else if (a[i] % 7 != 0 && a[i] % 5 == 0) {
				a2[n2 - 1] = a[i];
				n2--;
			}
		}

		for (int i = 0; i < a.length; i++) {
			if (Exited(a2, a[i])) {
				continue;
			}
			a2[count] = a[i];
			count++;
		}
		System.out.println("\nMang sau khi xu ly: ");
		outputArr(a2);

	}

	public static void outputArr(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "   ");
		}
		System.out.println();
	}

	public static boolean Exited(int arr[], int n) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == n) {
				return true;
			}
		}
		return false;
	}

}
