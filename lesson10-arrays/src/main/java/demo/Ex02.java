  
package demo;

public class Ex02 {
	public static void main(String[] args) {

		int[] number = { 1, 2, 3, 4, 5 };
		Reverse(number);

	}

	private static void Reverse(int[] number) {
		for (int i = 0; i < number.length; i++) {
			for (int j = i + 1; j < number.length; j++) {
					int temp = number[j]; 
					number[j] = number[i];
					number[i] = temp;
			}
			System.out.print(number[i] + " ");
		}
	}
}