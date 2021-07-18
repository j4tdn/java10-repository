package ex;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import bean.DbConnection;
import bean.ItemGroup;
import bean.SqlUtils;

public class Ex01 {

	private Connection conn;
	private ResultSet rs;
	private PreparedStatement pst;
	private Statement st;

	public Ex01() {
		conn = DbConnection.getConnection();

	}

	public List<ItemGroup> getItemToDay(Date date) {
		List<ItemGroup> result = new ArrayList<>();

		String sql = "select mh.MaMH, mh.TenMH, dh.thoigiandathang " + "from mathang mh " + "join chitietdonhang ctdh "
				+ "on mh.MaMH = ctdh.MaMH " + "join donhang dh " + "on dh.MaDH = ctdh.MaDH "
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