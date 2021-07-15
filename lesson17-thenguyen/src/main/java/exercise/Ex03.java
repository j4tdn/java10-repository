package exercise;

import java.util.List;

import persistence.HangTonKho;
import service.HangTonKhoService;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import connection.DbConnection;

public class Ex03 {
	private static HangTonKhoService hangTonKhoService;
	static {
		hangTonKhoService = new HangTonKhoService();
	}

	public static void main(String[] args) {
		System.out.println("3. Thống kê số lượng hàng tồn kho của mỗi loại hàng");
		List<HangTonKho> r = hangTonKhoService.getAll();
		r.forEach(System.out::println);
	}
}
