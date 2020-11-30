package hoangxuanthanh.lesson02_hoangxuanthanh;

public class Ex02 {
	private static final Ex02 ex02 = null;
	public static void main(String[] args) {
		int a = 4;
		int b = 7;
		int c = 12;
		int d = 18;
	        System.out.println("factorial " + a + " : "
	                + ex02.factorials(a));
	        System.out.println("factorial " + b + " : "
	                + ex02.factorials(b));
	        System.out.println("factorial " + c + " : "
	                + ex02.factorials(c));
	        System.out.println("factorial " + d + " : "
	        		+ ex02.factorials(d));
	     long Sum = factorials(4) + factorials(7) + factorials(12) + factorials(18);
			System.out.println("sum (S =4!+7! +12!+18!)  = " + Sum);
	       // System.out.println("sum = " +a +b +c +d);
	}      
		public static long factorials(int n) {
	        long factorial = 1;
	        if (n == 0 || n == 1) {
	            return factorial;
	        } 
	        else {
	            for (int i = 2; i <= n; i++) {
	            	factorial *= i;
	            }
	            return factorial;
	            
	        }
	    }
}

