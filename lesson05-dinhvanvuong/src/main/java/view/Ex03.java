package view;

public class Ex03 {
	public static void main(String[] args) {
		int a = 8;
		int b = 2;
		isPowerOf(a, b);
		System.out.println("isPowerOf: ");
	}
	
	public static boolean isPowerOf(int a,int b) {
		if( 0 == a|| 1 == a && 0 == b || 1 == b ) return true;
		int x = (a+b)/2;
		int y = (a+b)%2;
		if (1 == y) return false;
		return isPowerOf(x, y);
	}
}
