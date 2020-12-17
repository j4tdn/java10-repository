package ex04;

public class LeastCommonMultiples {
	public static void main(String[] args) {
		System.out.println(getLeastCommonMultiples(2, 3, 7));
	}
	
	private static int gcd(int a, int b) {
		return a == 0 ? b : gcd(b % a, a);
	}
	
	private static int lcm(int a, int b) {
		return a * b / gcd(a, b);
	}
	
	private static int getLeastCommonMultiples(int...digits) { 
		if (digits.length == 1) {
			return digits[0];
		}
		
		int lcm = lcm(digits[0], digits[1]);
		if (digits.length == 2) {
			return lcm;
		}
		
		for (int i = 2; i < digits.length; i++) {
			lcm = lcm(lcm, digits[i]);
		}
		
		return lcm;
	}
}