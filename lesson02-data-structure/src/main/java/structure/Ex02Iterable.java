package structure;

public class Ex02Iterable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("sumFor: " + sumFor(10)
		+ "\nsumWhile: " + sumWhile(10)
		+"\nsumdoWhile: " + sumdoWhile(10));
	}
	private static int sumFor(int n) {
		int result = 0;
		for (int i=1; i<n; i++) {
			result +=i;
		}
		return result;
	}

	private static int sumWhile(int n) {
		int result = 0;
		n-=1;
				while(n>0) {
			result += n;
			n--;
		} 
		return result;
	}
	private static int sumdoWhile(int n) {
		int result = 0;
		int i = 1;
		do {
			result +=i;
			i++;
		} while(i<n);
		return result;
	}
	

}
