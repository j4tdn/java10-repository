package lesson02_ngophanphuc;

public class Ex05 {
	public static void main(String[] args) {
		decimalToBinary(1234);
	}

	public static void decimalToBinary(int n) {
		int i = 0;
		int arr[] = new int[1000];

		while (n > 0) {
			arr[i] = n % 2;
			n /= 2;
			i++;
		}

		for (int j = i - 1; j >= 0; j--) {
			System.out.print(arr[j]);
		}
	}
}
