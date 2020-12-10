package structure;

public class Ex01Control {
	public static void main(String[] args) {
		// if else
		// switch case
		// condition operator
		System.out.println("max: " + max(6, 11, 8));
		
		
		demoSwitchCase();
		
	}
	
	private static void demoSwitchCase() {
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
				System.out.println("30 days");
				break;
			case 2: 
				System.out.println("28 days");
			default:
			System.out.println("Invalid month");
		}
	}

	private static int max(int a, int b) {
		return a > b ? a : b;
	}
	
	private static int max(int a, int b, int c) {
//		int max = a;
//		if (b > max) {
//			max = b;
//		}
//		if (c > max) {
//			max = c;
//		}
//		return max;
		
//		return max(max(a, b), c);
		
		return (a > b ? a : b) > c ? (a > b ? a : b) : c;
	}

}
