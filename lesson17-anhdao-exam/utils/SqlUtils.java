package utils;

import java.sql.SQLException;

public class SqlUtils {
public SqlUtils() {
}

public static void close(AutoCloseable ...autoCloseables) {
	for (AutoCloseable closeable: autoCloseables) {
		try {
			if(closeable != null) {
				closeable.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
}
