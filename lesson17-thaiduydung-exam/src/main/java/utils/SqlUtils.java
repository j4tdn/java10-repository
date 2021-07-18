package utils;

public class SqlUtils {
	private SqlUtils() {
		// TODO Auto-generated constructor stub
	}

	public static void close(AutoCloseable... autoCloseables) {
		for (AutoCloseable aCloseable : autoCloseables) {
			try {
				if (aCloseable != null) {
					aCloseable.close();
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
