package nguyenduonghuy.lesson02_nguyenduonghuy;

import java.util.Random;

public class HackAccDoNotOverlap {
	private static final String username = "admin";
	private static final String password = "259";
	private static Random rd = new Random();

	public static void main(String[] args) {
		String[] a = new String[1000];
		for (int i = 0; i < a.length; i++) {
			boolean flag = false;
			while (!flag) {
				flag = true;
				a[i] = "" + rd.nextInt(10) + rd.nextInt(10) + rd.nextInt(10);
				for (int j = 0; j < i; j++) {
					if (a[j].equalsIgnoreCase(a[i])) {
						flag = false;
						break;
					}
				}
			}
		}

		int breakLine = 0;
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "   ");
			breakLine++;
			if (breakLine % 20 == 0) {
				System.out.println();
			}
			if (signIn("admin", a[i])) {
				System.out.println("\nSign in successfully!");
				System.out.println("User: " + username);
				System.out.println("Password: " + a[i]);
				break;
			}
		}
	}

	private static boolean signIn(String ipUsername, String ipPassword) {
		return ipUsername.equalsIgnoreCase(username) && ipPassword.equalsIgnoreCase(password);
	}
}