package utils;

import java.util.List;

public class Util {
	private Util() {

	}

	public static void close(AutoCloseable... autoCloseables) {
		for (AutoCloseable closeable : autoCloseables) {
			try {
				if (closeable != null) {
					closeable.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	public static <T> void print(List<T> lists) {
		
		for (T list : lists) {
			System.out.println(list);
		}
		
	}
}