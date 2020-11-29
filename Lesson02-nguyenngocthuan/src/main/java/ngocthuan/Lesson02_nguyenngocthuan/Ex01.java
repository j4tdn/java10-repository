package ngocthuan.Lesson02_nguyenngocthuan;

public class Ex01 {
   public static void main(String[] args) {
	   int a=3; 
	   int b=9;
	   int c=6;
       increase (a, b, c);
	   //System.out.println("a: " + a);
	  // System.out.println("b: " + b);
	  // System.out.println("c: " + c);
   }
	   private static void increase (int a,int b, int c) {
		   int tpm;
		 if (a > b) {
			 tpm = a ;
			 a = b ;
			 b = tpm ;
		 }
		 
		 if (a > c) {
			 tpm = a;
			 a = c;
			 c = tpm;
		 }
		 
		 if (b > c) {
			 tpm = b;
			 b = c;
			 c = tpm;
		 }
		 System.out.println("a1: " + a);
		 System.out.println("b1: " + b);
		 System.out.println("c1: " + c);
}
}
