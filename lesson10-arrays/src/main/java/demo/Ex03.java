package demo;

public class Ex03 {
	public static void main(String[] args) {
		int[] number = { 1, 9, 5, 36, 12, 33 };
		sumOfOdd(number);
		minMax(number);
	}

	private static void sumOfOdd(int[] number) {
		int sum = 0;
		for (int num : number) {
			if (num % 2 != 0) {
				sum = sum + num;
			}
		}
		System.out.print("tổng lẻ: " + sum);
		System.out.println("\n=============");
	}

	private static void minMax(int[] number) {
		int max = number[0];
		int min = number[0];
		for (int i = 0; i < number.length; i++) {
			if (number[i] > max) {
				max = number[i];
			}
			if (number[i] < min) {
				min = number[i];
			}
		}

		System.out.println("số lớn nhất là: " + max);
		System.out.println("=============");
		System.out.print("số bé nhất là: " + min);

	}
}
