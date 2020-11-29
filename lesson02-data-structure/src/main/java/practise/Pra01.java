package practise;

import java.util.Random;

public class Pra01 {
	private static final String username = "admin";
	private static final String password = "259";
	private static Random rd = new Random();

	public static void main(String[] args) throws InterruptedException {
		String[] A = new String[1000];
		int index = 0;
		String text ="";

		do {
			

			text = "" + rd.nextInt(10) + rd.nextInt(10) + rd.nextInt(10);

			if (contains(text, A)) {
				continue;
			}
			A[index++] = text;
			System.out.print(" " + text);
			if (index % 13 == 0) {
				System.out.println();
			}
		} while (!signIn("admin", text));
		System.out.println("=== Sign In successfully ====");
		System.out.println("Username: admin");
		System.out.println("Password: " + text);
	}

	private static boolean signIn(String ipUsername, String ipPassword) {
		return ipUsername.equals(username) && ipPassword.equals(password);
	}

	public static boolean contains(String rand, String[] Array) {
		for (int i = 0; i < Array.length; i++) {
			if (rand.equals(Array[i])) {
				return true;
			}
		}
		return false;
	}
}
