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

	public List<ItemGroup> getItemToDay(Date date) {
		List<ItemGroup> result = new ArrayList<>();

		String sql = "select mh.MaMH, mh.TenMH, dh.thoigiandathang\n " 
				+ "from mathang mh \n" 
				+ "join chitietdonhang ctdh \n"
				+ "on mh.MaMH = ctdh.MaMH \n" 
				+ "join donhang dh \n" 
				+ "on dh.MaDH = ctdh.MaDH \n"
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
