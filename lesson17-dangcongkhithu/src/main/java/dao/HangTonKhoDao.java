package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connection.DBConnection;
import model.HangTonKho;

public class HangTonKhoDao {

	private Connection connection = DBConnection.getConnection();;
	private Statement stm;
	private ResultSet rs;

	public List<HangTonKho> select() {
		List<HangTonKho> listItems = new ArrayList<>();
		try {
			stm = connection.createStatement();
			rs = stm.executeQuery(
					"SELECT lh.*,group_concat(concat(mh.TenMH, ':',kcmh.SoLuong) SEPARATOR ', ') as DSMHSL,"
							+ "	SUM(kcmh.SoLuong) AS TongSoLuong" + " FROM MatHang mh" + " JOIN LoaiHang lh "
							+ "	ON mh.MaLoai = lh.MaLoai " + "JOIN KichCoMatHang kcmh " + " ON mh.MaMH = kcmh.MaMH "
							+ " GROUP BY lh.MaLoai;");
			while (rs.next()) {
				HangTonKho Group = new HangTonKho(rs.getInt("maloai"), rs.getString("tenloai"), rs.getString("DSMHSL"),
						rs.getInt("tongSoLuong"));
				listItems.add(Group);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stm.close();
				rs.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			};
		}
		return listItems;
	}

}
