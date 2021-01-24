package ex03;

/**
 * Hello world!
 *
 */
public class Ex03 
{
     public static void main(String[] args) {
       String str = "ABCD";
       permutation("", str);
     }
     private static void permutation(String prefix, String str) {
    	 int n = str.length();
		    if (n == 0) System.out.print(prefix+" ");
		    else {
		        for (int i = 0; i < n; i++)
		            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
		    }
    }     
}
