package structure;

public class Ex01Control {
	public static void main(String[] args) {
		// if else : expression ( true || false)
		// switch case : EQUAL ==
		// condition operator
		System.out.println("max: " + max(1, 2, 3));
		System.out.println("=================");
		demoSwitchCase();
	}
	
	

	// find max 2 digits
	private static int max(int first, int second) {
		// int result = first > second ? first : second;
		if (first > second) {
			return first;
		}
		return second;
	}
	// find max 3 digits
	private static int max(int first, int second, int third) {
		//return (first > second ? first : second) > third ? (first > second ? first : second) : third
		return max(max(first, second), third);
		
	}
	
	private static void demoSwitchCase() {
		int month = 12;
		switch(month) {
		case 1: 
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12: System.out.println("31 days");
		break;
		
		case 2: System.out.println("28 days");
		break;
		
		case 4: 
		case 6:
		case 9: 
		case 11: System.out.println("30 days");
		break;
		
		//except above cases
		default:
			System.out.println("Invalid month");
		}
	}
}
