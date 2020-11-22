package structure;

public class Ex01Control {

	public static void main(String[] args) {
		
		System.out.println("max: " +max(6,11,8));
		demoSwitchcase();
		
		
		
	}
	private static void demoSwitchcase() {
		int month = 4;
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
			System.out.println("30 days");
			break;
		case 2:
			System.out.println("28 days ");
			break;
			default:
				System.out.println("Invalid month");
		}
	}
	//tim max 2 so
	private static int max(int first, int second) {
		return first > second ? first : second;
			}
 private static int max(int first, int second, int third)
 {
	 return max(max(first,second),third);
 }
}
