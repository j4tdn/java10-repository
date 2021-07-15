package utils;

public class SqlUtils {
	private SqlUtils() {
		
	}

	public static void close(AutoCloseable... autoCloseables) {
		for (AutoCloseable aCloseable : autoCloseables) {
			try {
				if (aCloseable != null) {
					aCloseable.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
