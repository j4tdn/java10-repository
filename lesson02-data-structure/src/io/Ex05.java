package io;
public class Ex05 {
	
	 
	        public static void main(String[] args) {
	            int a = 4;
	            int b = 7;
	            int c = 12;
	            int d = 18;
	            int sum= a + b + c + d ;	           
	            System.out.println("sum");
	        }
	        return sum;
}
	     
	     
	        public static long tinhGiaithua(int n) {
	            if (n > 0) {
	                return n * tinhGiaithua(n - 1);
	            } else {
	                return 1;
	            }
	        }
	    }

	


