package hoangxuanthanh.lesson02_hoangxuanthanh;

/**
 * Hello world!
 *
 */
public class ex01 
{
	public static void main(String[] args) {
		int a=5;
		int b=9;
		int c=8;
		ascending (a, b, c);
		System.out.println("a: " +a);
	    System.out.println("b: " +b);
		System.out.println("c: " +c);
		
	}
	private static void ascending (int a, int b, int c) {
		int tmp;
		if (a > b) {
			tmp = a;
			a = b;
			b = tmp;
			
		}
		if(a > c) {
			tmp = a;
			a = c;
			c = tmp;
		}
		if(b > c) {
			tmp = b;
			b = c;
			c = tmp;
			
		}
		System.out.println("a1: " +a);
		System.out.println("b1: " +b);
		System.out.println("c1: " +c);
	}

}

