package ex03;

public class Permutation {
	public static void main(String[] args) {
		permutation("", "abc");
	}

	private static void permutation(String s, String str) {
	    int n = str.length();
	    if (n == 0) 
	    	System.out.println(s);
	    else {
	        for (int i = 0; i < n; i++)
	            permutation(s + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
	    }
	}
}

