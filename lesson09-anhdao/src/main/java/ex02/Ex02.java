package ex02;

import java.util.Arrays;
import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class Ex02 {
	public static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter number of String  : ");
		int n = Integer.parseInt(ip.nextLine());
		do {
			try {

				String[] arr = new String[n];
				for (int i = 0; i < n; i++) {
					System.out.print("Enter String n: [" + i + "]");
					arr[i] = ip.nextLine();
					isValid(arr[i]);
					System.out.println(getLargestNumbers(arr[i]));
				}
				break;
			} catch (InvalidCharacter e) {
				System.out.println(e.getMessage());
			}
			System.out.println(" ========================== ");
		} while (true);
	}

	private static void isValid(String input) {
		if (!input.matches("[a-z0-9\\s]+")) {
			throw new InvalidCharacter("String just includes a-z and 0-9 ");
		}
	}

	private static int getLargestNumbers(String input) {
		String[] num = new String[input.length()];

		int k = 0;
		String child = "";
		for (int i = 0; i < input.length(); i++) {

			if (Character.isDigit(input.charAt(i))) {
				child += input.charAt(i);

			} else {
				k++;
			}
			num[k] = child;
			child = "";
			System.out.print(num[k] + " ");
		}
		String[] numbers = new String[k];
		numbers = Arrays.copyOfRange(num, 0, k);
		int[] convertNumber = new int[numbers.length];
		for (int i = 0; i < numbers.length; i++) {
			convertNumber[i] = Integer.parseInt(numbers[i]);

		}

		int max = convertNumber[0];
		int indexMax = 0;
		for (int i = 0; i < convertNumber.length; i++) {
			if (max < convertNumber[i]) {
				max = convertNumber[i];
				indexMax = i;
			}
		}
		return max;

	}
}
