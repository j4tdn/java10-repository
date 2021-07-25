package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connection.DbConnection;
import persistence.ItemGroup;
import utils.SqlUtils;

public class ItemGroupDao {
	private Connection conn;
	private Statement st = null;
	private PreparedStatement pst = null;
	private ResultSet rs = null;

	public ItemGroupDao() {
		conn = DbConnection.getConnection();
	}

	// Câu 1: 20đ
	public List<ItemGroup> getItemToDay(Date date) {
		List<ItemGroup> result = new ArrayList<>();

		String sql = "select mh.MaMH, mh.TenMH, dh.thoigiandathang\n " 
				+ "from mathang mh \n" 
				+ "join chitietdonhang ctdh \n"
				+ "on mh.MaMH = ctdh.MaMH \n" 
				+ "join donhang dh \n" 
				+ "on dh.MaDH = ctdh.MaDH \n"
				// Giống bài Quốc: Xem review a đã review giúp a a đỡ copy lại nha
				// https://github.com/j4tdn/java10-repository/commit/aa4934c144fc549ad8dd21249bf535f948595684
				// Và thêm nữa. Là khi nào truy vấn có tham số truyền vào thì dùng PrepareStatement chứ ko nên
				// dùng Statement >> Avoid SQL Injection
				+ "where date(dh.thoigiandathang) = '" + date + "'";

		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				ItemGroup ig = new ItemGroup(rs.getInt("MaMH"), rs.getString("TenMH"), rs.getTime("thoigiandathang"));
				result.add(ig);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, st);
		}
		return result;
	}
}
