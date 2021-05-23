package untils;

import java.util.concurrent.TimeUnit;

public class ThreadUtils {
	public ThreadUtils() {
	}

	public static void sleep(int seconds) {
		try {
			TimeUnit.SECONDS.sleep(seconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
