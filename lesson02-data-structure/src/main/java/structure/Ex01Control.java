package structure;

public class Ex01Control {
	public static void main(String[] args) {
		//if else
		//switch case
		//condition operator
		System.out.println("max: " + max(1, 2, 3));
		System.out.println();
		demoSwitchCase();
		
		
		
		
		
	}
	private static void demoSwichCase() {
		int month = 4;
		switch (month) {
		case 1:
			System.out.println("31 days");
			break;
		case 3:
		case 7:	
			System.out.println("30 days");
			break;
			
		
		case 12:
			System.out.println("30 days");
			break;
		}
		
	}
	private static void demoSwitchCase() {
		// TODO Auto-generated method stub
		
	}
	//find max 2 digits
	
	private static int max(int first, int second) {
		return first > second ? first :second ;
		//int max = first;
		//if(first > second ) {
			
		//	return first;
		}
		//return second;
	//}
	//find max 3 digits
	
	private static int max(int first, int second, int third) {
		return max(max(10, 9, 7), 8);
		
	}
	

}
