package structure;

public class Ex02Itlerable {
	public static void main(String[] args) {
		//loop: for, while, do while
		//for: already know limitation
		//while do while:undefined
		//dowhile: ignore first checking
		//while: checking as always
		System.out.println("sumFor: " + sumFor(10) + 
		"\nsumWhile: " + sumWhile(10) + 
		"\nsumdoWhile: "+ sumdoWhile(10));
		//break, continue: used in for, while, do while
		//break; swith case
		//break: pause and exist the LOOP
		//continue: ignore the below code and continue with next loop
		for(int i = 0; i < 5; i++) {
			if(i==4) {
				continue;
			}
			System.out.println("i:" +i);
		}
		System.out.println("come hear !!!");
	}
	 private static int sumFor(int n) {
		 int result = 0;
		 for(int i=0; i<n; i++) {
			 result +=i;	 
		 }
		 return result;
	 }
	 private static int sumWhile(int n) {
		 int result = 0;
		 int i = 1;
		 while(i < n) {
			 result +=i;
			 i++;
		 }
		 return result;
	 }
	 private static int sumdoWhile(int n) {
		 int result = 0;
		 int i = 1;
		 do {
			 result +=i;
			 i++;
		 }while (i < n);
		 return result;
	 }

}
