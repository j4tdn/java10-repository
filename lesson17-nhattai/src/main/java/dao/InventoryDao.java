package dao;

import static utils.SqlUtils.close;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connection.DbConnection;
import persistence.Inventory;

public class InventoryDao {

	private Connection connection;
	private java.sql.Statement st = null;
	private ResultSet rs = null;

	public InventoryDao() {
		connection = DbConnection.getConnection();
	}
	
	public List<Inventory> getAllInventory(){
		List<Inventory> result = new ArrayList<>();
		String sql = "SELECT lh.*,group_concat(concat(mh.TenMH, ':',kcmh.SoLuong) SEPARATOR ', ') as DSMatHangSoLuong,"
				+ "	SUM(kcmh.SoLuong) AS TongSoLuong" + " FROM MatHang mh" + " JOIN LoaiHang lh "
				+ "	ON mh.MaLoai = lh.MaLoai " + "JOIN KichCoMatHang kcmh " + " ON mh.MaMH = kcmh.MaMH "
				+ " GROUP BY lh.MaLoai;";
		try {
			st = connection.createStatement();
			rs = st.executeQuery(sql); //
			while (rs.next()) {
				Inventory Group = new Inventory(rs.getInt("maLoai"), rs.getString("tenLoai"),
						rs.getString("dsMatHangSoLuong"), rs.getInt("tongSoLuong"));
				result.add(Group);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rs, st);
		}
		return result;
	}
}
