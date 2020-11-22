package structure;

import java.net.Socket;

public class Ex01Control {
	public static void main(String[] args) {
		// if else
		// switch case
		// condition operator

		// DTB: 5
		// Kiem Tra: Xep Loai
		// < 5: Bad
		// 5 - 6.9: Not bad
		// 7 - 8.4: Quite good
		// >= 8.5: Good
		float point = 5.7f; // validate: 0 - 10
		String ability = "";
		if (point < 5) {
			ability = "Bad";
		} else if (point <= 6.9f) {
			ability = "Not bad";
		} else if (point <= 8.4f) {
			ability = "Quite good";
		} else {
			ability = "Good";
		}
		System.out.println("XL: " + ability);

		System.out.println("==================");
		System.out.println("max: " + max(6, 11, 8));

		demoSwitchCase();
	}

	private static void demoSwitchCase() {
		// if else versus switch case
		// switch case: EQUAL ==
		// if else : expression (true || false)
		int month = 4;
		// 1 2 5 7 8 10 12
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
			break;
		default:
			// except above cases
			System.out.println("Invalid month");
		}
	}

	// find max 2 digits
	private static int max(int first, int second) {
		return first > second ? first : second;
	}

	// find max 3 digits
	private static int max(int first, int second, int third) {
		return (first > second ? first : second) > third ? (first > second ? first : second) : third;
		// return max(max(first, second), third);
	}
}
