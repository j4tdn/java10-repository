package structure;

public class Ex01Control {
	public static void main(String[] args) {
		// if else
		// switch case
		// condition operator
		System.out.println("max: " +max(6, 11, 8));
		
		demoSwitchCase();
	}
	
	private static void demoSwitchCase() {
		int month = 2;
		switch(month) {
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
		case 11:
			System.out.println("30 days");
			break;
		case 2:
			System.out.println("28 days");
			break;
		default:
			System.out.println("Invalid month");
		}
	}
	
	// find max 2 digits
	private static int max(int first, int second) {
		//return first > second ? first : second;
		if(first > second) {
			return first;
		}
		return second;
	}
	
	// find max 3 digits
	private static int max(int first, int second, int third) {
		// return (first > second ? first : second) > (third ? return first > second ? first : second) : third;
		return max(max(first, second), third);
	}
	
}
