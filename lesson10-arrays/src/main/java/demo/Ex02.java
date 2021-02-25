package demo;

public class Ex02 {
	public static void main(String[] args) {
		int[] a = { 1, 9, 5, 36, 12, 33 };
		reverse(a);
	}
	public static void reverse(int[] input) {
		System.out.print("Mảng sau khi đảo ngược: ");
		for (int k = input.length ; k >0 ; k--) {
			System.out.print(input[k-1] + " ");
		}

	}
}
