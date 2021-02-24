package ex02;

public class Ex02 {
	public static void main(String[] args) {
		NumberOdd();
		NumberEven();		
	}
	public static void NumberOdd() {
		int[] a = {1,2,3,4,5,6};
		for(int i = 0 ; i < a.length ; i++) {
			if (a[i]%2==1) {
				System.out.println(a[i]);
			}
		}
		System.out.println("====================");
	}
	public static void NumberEven() {
		int[] b = {1,2,3,4,5,6};
		for(int i = 0 ; i < b.length ; i++) {
			if (b[i]%2==1) {
				System.out.println(b[i]);
			}				
		}				
	}				
}
