package data.type;

public class Ex04 {
	 public static void main(String[] args) {
			Integer a=10;
			Integer b=20;
			hash("Origin A Hash:",a);
			hash("Origin B Hash:",b);
			swap(a,b);
			hash("After swap A Hash:",a);
			hash("After swap B Hash:",b);
			System.out.println("Main a:" +a);
			System.out.println("Main b:" +b);
			//Integer, Float: immutable Object
			//immutable: cannot change origin value in HEAP
			Integer origin=55;
			Integer assign=55;
			hash("origin 1:	", origin);
			hash("assign:	", assign);
			origin=60;
			hash("origin 2:	", origin);
			System.out.println("origin: "+origin);
		}
		   private static void swap(Integer a, Integer b) {
			   Integer tmp=a;
			   a=b;
			   b=tmp;
			   System.out.println("Swap a:" +a);
			   System.out.println("Swap b:" +b);
		}
		   protected static void hash(String text, Integer input) {
			   System.out.println(text+":"+System.identityHashCode(input));
		   }
}
