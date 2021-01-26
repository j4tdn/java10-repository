package ex02;

import java.util.Arrays;
import java.util.Scanner;

public class Ex02 {
	public static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter n  : ");
		int n = Integer.parseInt(ip.nextLine());
		do {
			try {

				String[] arr = new String[n];
				int[] max = new int[n];
				int[] sort = new int[n];
				for (int i = 0; i < n; i++) {
					System.out.print("Enter String n: [" + i + "]");
					arr[i] = ip.nextLine();
					isValid(arr[i]);
					max[i] = getLargestNumbers(arr[i]);
					System.out.println("MAX n[" + i + "] : " + max[i]);
				}
				Arrays.sort(max);
				System.out.print("==================================== ");
				System.out.print("Sort : ");
				for (int i = 0; i < n; i++) {
					System.out.print(max[i] + ", ");
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
		String replace = input.replaceAll("[a-z\\s]+", "-");
		String[] item = replace.split("-");

		int[] convertToNumber = new int[item.length];
		int[] result = new int[item.length];
		for (int i = 0; i < item.length; i++) {
			try {
				convertToNumber[i] = Integer.parseInt(item[i]);
			} catch (NumberFormatException e) {
			}
		}
		int max = convertToNumber[0];
		for (int i = 0; i < convertToNumber.length; i++) {
			if (max < convertToNumber[i]) {
				max = convertToNumber[i];
			}
		}
		return max;

	}
}