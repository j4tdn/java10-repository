package luulongbang.lesson02_luulongbang;

public class Ex02 {
	 public static void main(String[] args) {
		 
         int a = 4;
         int b = 7;
         int c = 12;
         int d = 18;
         
         
         long mySum= factorial(a) + factorial(b) + factorial(c) + factorial(d) ;	           
         System.out.println("Sum of three factorials");
         System.out.println(mySum);
     }
	 public static long factorial(int n) {
         if (n > 0) {
     
        	 long prod = 1;
        	 for (int i =1; i <=n; i++) {
        		 prod = prod * i;
        	 }
             return prod;
         } else {
             return 1;
         }
     }
}
  