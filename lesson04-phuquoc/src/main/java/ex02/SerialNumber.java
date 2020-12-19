package ex02;

public class SerialNumber {
	public static void main(String[] args) {
		int[] a = { 5, 7, 35, 14, 21, 40, 70, 140, 28, 65 };

		Condition con1 = input -> input % 7 == 0 && input % 5 != 0;
		Condition con2 = input -> input % 5 == 0 && input % 7 == 0;
		Condition con3 = input -> input % 5 == 0 && input % 7 != 0;
		System.out.println("Cac phan tu trong mang chia het cho 7, cho 5 va 7, cho 5 theo thu tu: ");
		printf(a, con1);
		printf(a, con2);
		printf(a, con3);
	}

	public static void printf(int[] a, Condition con) {
		for (int i = 0; i < a.length; i++) {
			if (con.test(a[i])) {
				System.out.println(a[i] + "   ");
			}
		}
	}

}
