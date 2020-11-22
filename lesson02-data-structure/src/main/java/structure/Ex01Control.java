package structure;

public class Ex01Control {
   public static void main(String[] args) {
	  //if else
	  //switch case
	  //condition operator
	   System.out.println("max: " + max(6, 11, 8));
}
     private static int max(int first, int second) {
    	 if (first > second) {
    		 return first;
    	 }
    	 return second;
     }
     
     private static int max(int first, int second, int third) {
        return max(max(first, second), third);
    
}
}
