package view;

public class Ex04 {
	public static void main(String[] args) {
		System.out.println("result: " + getLeastCommonMultiples(2,5,7));
	}
	//Bcnn: lcm stands for least common multiple
	//ucll gcd stands for greaest common divisor
	// lcm(a, b) = (a * b) / gcd(a,b)
	private static int gcd(int a, int b) {		
		//16 12 => 4
		// 4 12
		// 4 8
		// 4 4 
		if ( a == 0)return b;
		if ( b == 0)return a;
		while(a != b) {
			if ( a>b) {
				a = a -b;
			} else {
				b = b -a;
			}
		}
		return a;
	}
	
	private static int lcm(int a, int b) {		
		return a * b / gcd(a,b);
	}
	
	
	private static int getLeastCommonMultiples(int...digits) {
		if (digits.length == 1) return digits[0];
		int lcm = lcm(digits[0], digits[1]);
		if (digits.length == 2) return lcm;
		
		for (int i = 2; i < digits.length; i ++) {
			lcm = lcm(lcm, digits[i]);
		}
		
		return lcm;
	}
}
