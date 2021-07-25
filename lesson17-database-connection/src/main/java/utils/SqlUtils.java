package utils;

import java.util.Arrays;

public class SqlUtils {

	private SqlUtils() {

	}

	public static void close(AutoCloseable... autoCloseables) {
		Arrays.stream(autoCloseables).forEach(t -> {
			try {
				if (t != null) {
					t.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}
}
