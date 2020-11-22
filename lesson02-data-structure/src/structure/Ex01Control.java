package structure;

public class Ex01Control {
	public static void main(String[] args) {
		// if else
		// switch case
		// condition operator
		System.out.println("Max: " + max(10, 20));
		System.out.println("Max: " + max(1, 2, 10));
		
		demoSwitchCase();
	}
	
	private static void demoSwitchCase() {
		// switch case: EQUAL ==
		int month = 4;
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31 days");
			break;
		case 4:
		case 6:
		case 9:
			System.out.println("28 days");
			break;
		default:
			//except above
			System.out.println("Invalid month");
		}
	}
   // find max 2 digits
	private static int max(int first, int second) {
		if (first > second) {
			return first;
		}
		return second;
	}
	private static int max(int first, int second, int third) {
		return (first > second ? first : second) > third ? (first > second ? first :second) : third;
			
}
}
