package ex03;

public class Ex03 {
	public static void main(String[] args) {
		String s = "xyz";
		
		String[] results = permutation(s, s.length());
		
		for(String ss : results) {
			System.out.println(ss);
		}
	}
	
	private static String[] permutation(String s, int index) {
		String[] results = new String[(int) getFactorial(index)];
		
		permutation(s, index - 1);
		
		String[] splits = s.split("");
		
		for(String ss : splits) {
			System.out.println(ss);
		}
		
		
		
		
		return results;
	}
	
	private static long getFactorial(int n) {
		return n*(n-1);
	}

}
