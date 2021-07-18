package utils;

import java.util.Arrays;

public class SqlUtils {
	private SqlUtils() {

	}

	public static void close(AutoCloseable... closeables) {
		Arrays.stream(closeables).forEach(t -> {
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
