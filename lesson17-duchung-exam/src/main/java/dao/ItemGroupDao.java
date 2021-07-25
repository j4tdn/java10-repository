package dao;

import static utils.SqlUtils.close;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connection.DbConnection;
import persistence.ItemGroup;

public class ItemGroupDao {
	private Connection connection;
	private java.sql.Statement st = null;
	private ResultSet rs = null;

	public ItemGroupDao() {
		connection = DbConnection.getConnection();
	}

	// Câu 2: 25đ
	// Nên trả về ItemGroupDto hơn là ItemGroup
	public List<ItemGroup> getAll() {
		List<ItemGroup> result = new ArrayList<>();
		String sql = "SELECT lh.maLoai, lh.TenLoai,\r\n" + 
				"		SUM(kcmh.SoLuong) as TongSoLuong\r\n" + 
				"FROM MatHang mh\r\n" + 
				"JOIN LoaiHang lh\r\n" + 
				"	ON mh.MaLoai = lh.MaLoai\r\n" + 
				"JOIN KichCoMatHang kcmh\r\n" + 
				"	ON mh.MaMH = kcmh.MaMH\r\n" + 
				"GROUP BY lh.maLoai";
		try {
			st = connection.createStatement();
			rs = st.executeQuery(sql); 
			while (rs.next()) {
				ItemGroup ig = new ItemGroup(rs.getInt("maloai"), rs.getString("tenloai"),rs.getInt("TongSoLuong"));
				result.add(ig);
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
