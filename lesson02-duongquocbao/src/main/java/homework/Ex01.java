package homework;

public class Ex01 {
	public static void main(String[] args) {
		int a = 15;
		int b = 30;
		int c = 20;
		ascending(a, b, c);
		System.out.println("input a: "+ a);
		System.out.println("input b: "+ b);
		System.out.println("input c: "+ c);
	}
	private static void ascending(int a, int b, int c) {
		int tpm;
		if(a > b) {
			tpm = a;
			a = b;
			b = tpm;
		}
		if (a > b) {
			tpm = a;
			a = c;
			c = tpm;
		}
		if(b > c) {
			tpm = b;
			b = c;
			c= tpm;
		}
		System.out.println("output a1: "+ a);
		System.out.println("output b1: "+ b);
		System.out.println("output c1: "+ c);
	}
}
