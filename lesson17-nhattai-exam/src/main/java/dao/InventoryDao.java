package dao;

import static utils.SqlUtils.close;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connection.DbConnection;
import persistence.Inventory;

public class InventoryDao {
	private Connection connection;
	private PreparedStatement pst = null;
	private ResultSet rs = null;

	public InventoryDao() {
		connection = DbConnection.getConnection();
	}

	// Câu 2: POINT 25
	public List<Inventory> getItems() {
		List<Inventory> result = new ArrayList<>();
		String sql = "SELECT lh.*,\n" + " SUM(kcmh.SoLuong) SoLuong\n" + "FROM MatHang mh\n"
				+ "JOIN LoaiHang lh\n" + " ON  mh.MaLoai = lh.MaLoai\n" + "JOIN KichCoMatHang kcmh\n"
				+ " ON  mh.MaMH = kcmh.MaMH \n" + "GROUP BY MaLoai";
		try {
			pst = connection.prepareStatement(sql);
			rs = pst.executeQuery();
			while (rs.next()) {
				Inventory ig = new Inventory(rs.getInt("MaLoai"), rs.getString("TenLoai"), rs.getInt("SoLuong"));
				result.add(ig);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rs, pst);
		}
		return result;
	}
}
