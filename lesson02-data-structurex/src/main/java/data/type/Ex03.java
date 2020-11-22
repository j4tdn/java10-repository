package data.type;

public class Ex03 {
  public static void main(String[] args) {
	int a=10;
	int b=20;
	swap(a,b);
	System.out.println("Main a:" +a);
	System.out.println("Main b:" +b);
}
   private static void swap(int a, int b) {
	   int tmp=a;
	   a=b;
	   b=tmp;
	   System.out.println("Swap a:" +a);
	   System.out.println("Swap b:" +b);
}
}
