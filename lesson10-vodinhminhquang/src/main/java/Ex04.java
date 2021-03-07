import java.util.Arrays;

public class Ex04 {
	public static void main(String[] args) {
		int[] numbers = {3, 6, 1, 5, 7, 2};
		int[] result1 = add(numbers, 9, 2);
		System.out.println(Arrays.toString(result1));
		
		int[] result2 = remove(numbers, 4);
		System.out.println(Arrays.toString(result2));
		
	}
	private static int[] add(int[] arr, int newValue, int pos){
		if(pos < 0 || pos >= arr.length) {
			throw new ArrayIndexOutOfBoundsException();
		}
		int[] result = new int[arr.length + 1];
		for(int i = 0; i < pos; i++) {
			result[i] = arr[i];
		}
		result[pos] = newValue;
		for(int i = arr.length; i > pos; i--) {
			result[i] = arr[i - 1];
		}
		return result;
	}
	private static int[] remove(int[] arr, int pos) {
		int[] tmp = Arrays.copyOfRange(arr, 0, arr.length);
		// Shift left
		for(int i = pos; i < arr.length - 1; i++) {
			tmp[i] = tmp[i + 1];
		}
		return Arrays.copyOfRange(tmp, 0, arr.length - 1);
	}
}
