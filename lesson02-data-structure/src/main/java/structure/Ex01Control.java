package structure;

public class Ex01Control {
	public static void main(String[] args) {
		// if else
		// switch case
//	condition operation\
	demoSwitchcase();

	
	}
	private static void demoSwitchcase() {
		int  month =5;
		switch( month) {
		case 1:
		case 3:
		case 5:
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
			System.out.println(" 29 days");
			break;
			default:
				System.out.println(" Invalid month");
		}
	}
	//find max 2 digits
	private static int max( int first, int second) {
		return first > second ? first: second;
	}
	
}