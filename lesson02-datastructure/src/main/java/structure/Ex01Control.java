package structure;

public class Ex01Control {
	public static void main(String[] args) {
		// if else
		// switch case
		// condition operation
		System.out.println("max: " + max(6, 11, 8));
		
		demoSwitchCase(8);
	}
	
	private static void demoSwitchCase(int month) {
		switch (month) {
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30 days");
			break;
		case 2:
			System.out.println("29 days");
		default:
			System.out.println("31 days");
			break;
		}
	}

	// find max 2 digits
	private static int max(int first, int second) {
		return (first > second) ? first : second;
	}

	private static int max(int first, int second, int third) {
		return max(max(first, second), third);
	}

}
