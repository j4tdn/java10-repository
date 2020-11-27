package vodinhminhquang.lesson02_vodinhminhquang;
//Bài 5: Viết chương trình chuyển đổi một số tự nhiên ở hệ cơ số 10 thành số ở hệ cơ số 2
// 182 -> 10110110
public class Exercise05 {
	public static void main(String[] args) {
		int n = 182;
		System.out.println("" + binary(n));
	}
	public static String binary(int n) {
		int remainder;
		String result = "";
		while(n > 0) {
			remainder = n % 2;
			n /= 2;			
			result = remainder + result;
		}
		return result;
	}
}
