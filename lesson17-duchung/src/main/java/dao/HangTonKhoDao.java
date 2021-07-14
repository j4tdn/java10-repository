package dao;

import static utils.SqlUtils.close;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connection.DbConnection;
import persistence.HangTonKho;

public class HangTonKhoDao {

	private Connection connection;
	private java.sql.Statement st = null;
	private ResultSet rs = null;

	public HangTonKhoDao() {
		connection = DbConnection.getConnection();
	}

	public List<HangTonKho> getAll() {
		List<HangTonKho> result = new ArrayList<>();
		String sql = "SELECT lh.*,group_concat(concat(mh.TenMH, ':',kcmh.SoLuong) SEPARATOR ', ') as danhSachMatHangvaSoLuong,"
				+ "	SUM(kcmh.SoLuong) AS TongSoLuong" + " FROM MatHang mh" + " JOIN LoaiHang lh "
				+ "	ON mh.MaLoai = lh.MaLoai " + "JOIN KichCoMatHang kcmh " + " ON mh.MaMH = kcmh.MaMH "
				+ " GROUP BY lh.MaLoai;";
		try {
			st = connection.createStatement();
			rs = st.executeQuery(sql); //
			while (rs.next()) {
				HangTonKho Group = new HangTonKho(rs.getInt("maloai"), rs.getString("tenloai"),
						rs.getString("danhSachMatHangvaSoLuong"), rs.getInt("tongSoLuong"));
				result.add(Group);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(rs, st);
		}
		return result;
	}
}
