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
import bean.ItemGroup2;
import bean.SqlUtils;

public class Ex02 {
	private Connection conn;
	private ResultSet rs;
	private PreparedStatement pst;
	private Statement st;
	
	public Ex02(){
		conn = DbConnection.getConnection();
		
	}

	public List<ItemGroup2> getItems() {
		List<ItemGroup2> result = new ArrayList<>();
		String sql = "SELECT lh.*,\n" 
				+ "SUM(kcmh.SoLuong) SoLuong\n" 
				+ "FROM MatHang mh\n"
				+ "JOIN LoaiHang lh\n" 
				+ " ON  mh.MaLoai = lh.MaLoai\n" 
				+ "JOIN KichCoMatHang kcmh\n"
				+ " ON  mh.MaMH = kcmh.MaMH \n" 
				+ "GROUP BY MaLoai";
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				ItemGroup2 ig = new ItemGroup2(rs.getInt("MaLoai"), rs.getString("TenLoai"), rs.getInt("SoLuong"));
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