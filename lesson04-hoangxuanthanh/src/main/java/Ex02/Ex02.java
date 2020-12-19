package Ex02;
 
public class Ex02 {
	public static void main(String[] args) {
	int []a = {21,7,5,20,45,20,49};
	
	Condition con = new Condition() {
		@Override
		public boolean test(int input) {
			return true;
		}
	}; 
	Condition con1 =  input -> input %7 ==0;
	Condition con2 =  input -> input %5  == 0 && input %7 ==0;
	Condition con3 =  input -> input %5 ==0;
	
	printf(a,con1);
	printf(a,con2);
	printf(a,con3);

	
}

	public static void printf(int []a, Condition con) {
		for(int i = 0; i< a.length;i++) {
			if (con.test(a[i])) {
				System.out.println(a[i]+ " ");
			}
		}
		System.out.println(" ");
	}
		
	}
