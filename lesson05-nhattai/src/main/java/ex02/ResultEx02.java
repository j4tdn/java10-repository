package ex02;

public class ResultEx02 {
	public static void main(String[] args) {
		int max = 6;
		int min = 1;
		int[] digits = {3 , 2, 1, 6, 5};
		int number = getMissingNumber(digits);
		System.out.println("missed number : " + number);
	}
	private static int getMissingNumber(int[] digits) {
		//1,n = n*(n+1)/2
		int max = digits.length + 1;
		int initalSum =(max * (max + 1))/2;
		
		int sum = sum(digits);
		return initalSum - sum;
	}
	
	private static int sum(int[] digits) {
		int result = 0;
		for(int digit: digits) {
			result += digit;
		}
		return result;
	}
}
