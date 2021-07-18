package ex;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import bean.*;
public class Ex04 {
	
	private Connection conn;
	private ResultSet rs;
	private PreparedStatement pst;
	private Statement st;
	
	public Ex04(){
		conn = DbConnection.getConnection();
		
	}

	public List<Item> getName() {
		List<Item> result = new ArrayList<>();
		String sql = "SELECT mh.MaMH, mh.TenMH, dh.ThoiGianDatHang,sum(ctdh.soluong) as TongSoLuong\n"
				+ "FROM MatHang mh  JOIN ChiTietDonHang ctdh ON mh.MaMH = ctdh.MaMH JOIN DonHang dh ON dh.MaDH = ctdh.MaDH \n"
				+ "WHERE Year(dh.ThoiGianDatHang) = 2020\n" 
				+ "GROUP BY mh.maMH\n" 
				+ "ORDER BY TongSoLuong DESC\n"
				+ "LIMIT 3;\n";
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				Item ig = new Item(rs.getString("TenMH"));
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