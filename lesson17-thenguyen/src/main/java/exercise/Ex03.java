package exercise;

import static utils.Utils.print;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import bean.HangTonKho;
import bean.MatHang;
import connection.DbConnection;

public class Ex03 {
	private static Connection connection = DbConnection.getConnection();

	public static void main(String[] args) {
		System.out.println("3. Thống kê số lượng hàng tồn kho của mỗi loại hàng");
		List<HangTonKho> select = select();
		print(select);
	}

	private static List<HangTonKho> select() {
		List<HangTonKho> listItems = new ArrayList<>();
		try {
			Statement selectStmt = connection.createStatement();
			ResultSet rs = selectStmt
					.executeQuery("SELECT lh.*,group_concat(concat(mh.TenMH, ':',kcmh.SoLuong) SEPARATOR ', ') as DSMHSL,"
							+ "	SUM(kcmh.SoLuong) AS TongSoLuong" + " FROM MatHang mh" + " JOIN LoaiHang lh "
							+ "	ON mh.MaLoai = lh.MaLoai " + "JOIN KichCoMatHang kcmh " + " ON mh.MaMH = kcmh.MaMH "
							+ " GROUP BY lh.MaLoai;");
			while (rs.next()) {
				HangTonKho Group = new HangTonKho(rs.getInt("maloai"), rs.getString("tenloai"),
						rs.getString("DSMHSL"), rs.getInt("tongSoLuong"));
				listItems.add(Group);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listItems;
	}
}
