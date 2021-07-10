package exercises;

import static utils.Utils.print;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import bean.HangTonKho;
import connection.DbConnection;

public class Ex03 {
	private static Connection connection = DbConnection.getConnection();

	public static void main(String[] args) {
		System.out.println("3. Thống kê số lượng hàng tồn kho của mỗi loại hàng");
		List<HangTonKho> select = select();
		print(select);
	}

	private static List<HangTonKho> select() {
		List<HangTonKho> lists = new ArrayList<>();
		try {
			Statement selectStmt = connection.createStatement();
			ResultSet rs = selectStmt.executeQuery(
					"select lh.*, group_concat(concat(mh.TenMH, ':',kcmh.SoLuong) SEPARATOR ', ') as danhSachMatHangvaSoLuong, sum(kcmh.SoLuong) as tongSoLuong from MatHang mh join LoaiHang lh on mh.MaLoai = lh.MaLoai join KichCoMatHang kcmh on mh.MaMH = kcmh.MaMH group by lh.MaLoai;");
			while (rs.next()) {
				HangTonKho Group = new HangTonKho(rs.getInt("maLoai"), rs.getString("tenLoai"),
						rs.getString("danhSachMatHangvaSoLuong"), rs.getInt("tongSoLuong"));
				lists.add(Group);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return lists;
	}

}
