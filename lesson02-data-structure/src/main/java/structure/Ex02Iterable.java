package structure;

public class Ex02Iterable {
	public static void main(String[] args) {
		// loop: for , while , do.. while
		
		// for : already known limitation
		//while do while  undefined
		//do while: ignore first checking- bỏ qua lặp ít nhất 1 lần
		// while: checking as always
		//break .....continue
		int sum = sumDoWhile(4);
		System.out.println("sum: " + sum);
		
	}
	private static int sumFor(int n) {
		//-----------------sum những số bé hơn n
		int result = 0;
		for (int i = 0; i< n ; i++) {
			result+=i;	
		}
		return result;
		
	}
	private static int sumWhile(int n) {
		int result = 0;
		int i = 0;
		while(i < n) {
			result+= i;
			i++;
		}
		return result;
	}
	private static int sumDoWhile(int n){
		int result = 0;
		int i = 0;
		do {
			result+=i;
			i++;
			
		}
		while(i < n);
			return result;
		
	}

}
