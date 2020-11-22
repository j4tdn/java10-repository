package structure;

public class Ex01Control {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// if else
		// switch case
		// condition operator : câu hỏi điều kiện

		// Điểm trung bình : 5
		// Kiểm tra: xếp loại gì
		// < 5 YẾU .. 5-7 TB .. 7-8.4 quite >=8.5 good
		

		System.out.println(max(10, 20));

		System.out.println(max(10, 20, 80));

		demoSwitchCase();

	}

	private static void demoSwitchCase() {
		int month = 8;

		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31day");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30day");
			break;
		case 2:
			System.out.println("29day");
			break;
		default:
			// except above cases
			
			System.out.println("invalid month");

		}

	}

	// tim max 2 số
	private static int max(int first, int second) {

		return first > second ? first : second;

//		if(first > second) {
//			return first;
//		}
//		return second;

	}

	private static int max(int first, int second, int third) {
		return (first > second ? first : second) > third ? (first > second ? first : second) : third;
//		int max= max(max(first,second),third);
//		return max;
	}

}