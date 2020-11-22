package data.type;


public class Ex04 {
      public static void main(String[] args) {
    	  Integer a = 10;
		  Integer b = 20;
		  hash("Origin A Hash: ", a);
		  hash("Origin B Hash: ", b);
		  swap(a, b);
		  hash("after swap A hash: ", a);
		  hash("after swap N hash: ", b);
		  System.out.println("Main A: " + a);
		  System.out.println("Main B: " + b);
		  
		  //Integer , String , Float : Imutable Object
		  // Inmutable: Cannot change origin value in HEAP
		  Integer origin = 55;
		  Integer assign = 55;
		  hash("origin 1: ", origin);
		  hash("assign: ", assign);
		  origin = 66;
		  System.out.println("origin: " + origin);
		  
		  String s1 = "Hello";
	      hash("s1:", s1);
		  s1 = "xinchao";
		  hash("Changed s1: ", s1);
	}
      private static void swap(Integer a, Integer b) {
    	  Integer tmp =a;
    	  a = b;
    	  b = tmp;
    	  System.out.println("Swap A: " + a);
		  System.out.println("Swap B: " +b);
	}
      
    private static void hash(String text, Integer Input) {
    	// origin allocated address from JVM 
    	System.out.println(text + ":" + System.identityHashCode(Input));
    }
    private static void hash(String text, String Input) {
    	// origin allocated address from JVM 
    	System.out.println(text + ":" + System.identityHashCode(Input));
	}
}
