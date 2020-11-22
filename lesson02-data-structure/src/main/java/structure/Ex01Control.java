package structure;
//F2 to rename the class
public class Ex01Control {
	public static void main(String[] args) {
		//if else
		//switch case
		//condition operator
		System.out.println("max: " + max(6, 11, 8));
		
		demoSwitchCase();
	}
	
	
	private static void demoSwitchCase() {
		int month = 4;
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 12:
			System.out.println("31 days");
			break;
		
		case 4:
		case 6:
		case 9:
			System.out.println("30 days");
			break;
		case 2:
			System.out.println("28 days");
		default:
			System.out.println("Invalid month");
		}
	}



	//find max 2 digits
	private static int max(int first, int second) {
		return (first > second ? first : second);
	}
	
	//find max 3 digits
	private static int max(int first, int second, int third) {
		return max(max(first, second),third);
	}
}
