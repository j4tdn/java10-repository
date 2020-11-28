package homework;

public class Ex06 {	
		public static boolean checkPrime(int n) {
			if (n < 2) {
				return false;
			} 
			for (int i = 2; i <= Math.sqrt(n); i++) {
				if (n % i == 0) {
					return false;
				}
			}
			return true;
		}
				public static void main(String[] args) {
			int i = 0;
			int count = 1;
			do {
				i++;
				if (checkPrime(i)) {
					count++;
				}
			} while (count <= 200);
			System.out.println("The prime number 200th: " + i);
		}
}
