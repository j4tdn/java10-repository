package demo;

public class Ex02 {
	public static void main(String[] args) {  
		int[] input = { 1, 2, 3, 4, 5 };     
		Reverse(input);
	}

	private static void Reverse(int[] items) {
		int temp;
		System.out.println("Output: ");
		for (int i = 0; i < items.length; i++) {
			for (int j = i + 1; j < items.length; j++) {
				temp = items[i];
				items[i] = items[j];
				items[j] = temp;
			}
			System.out.print(items[i] + " ");
		}
	}
}
