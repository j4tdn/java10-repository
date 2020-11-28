package lesson02_excercise;

public class Bai6_FindPrime {
	public static void main(String[] args) {
		int i = 0;
		int count = 1;
		while(count <= 200) {
			i++;
			if (FindPrime(i)) {
				count++;
			}
	}
		System.out.println("Prime number 200th : " + i);
	}
	public static boolean FindPrime(int num) {
		if(num < 2) {
			return false;
		}
		for(int i = 2; i < (num-1); i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
}

