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

	// Câu 1: POINT 10
	// Tham số nên dùng LocalDate. Vì đề yêu cầu where theo Ngày Tháng Năm = LocalDate
	// Còn java.util.Date là ngày tháng năm giờ phút giây
	public List<ItemGroup> getItemToDay(Date date) {
		List<ItemGroup> result = new ArrayList<>();

		// Em nên dùng PrepareStatement điền dấu ? vào
		// Tránh bị SQL Injection
		String sql = "select mh.MaMH, mh.TenMH, dh.thoigiandathang " + "from mathang mh " + "join chitietdonhang ctdh "
				+ "on mh.MaMH = ctdh.MaMH " + "join donhang dh " + "on dh.MaDH = ctdh.MaDH "
				+ "where date(dh.thoigiandathang) = '" + date + "'";

		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				// Hàm khởi tạo int id, String name, Date date
				// Mà cái thứ 3 của em rs.getTime trả về java.sql.Time nên sai
				// Em phải em cái java.sql.Time về java.util.Date nữa
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