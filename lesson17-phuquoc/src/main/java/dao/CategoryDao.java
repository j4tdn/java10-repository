package dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.CallableStatement;

import connection.DbConnection;
import persistence.MatHang;

public class CategoryDao {
	private Connection conn;
	private Statement st;
	private PreparedStatement pst;
	private ResultSet rs;

	public CategoryDao() {
		conn = DbConnection.getConnection();

	}

	public boolean insertData() {
		boolean isSave = false;
		File f = new File("loaihang.txt");
		FileReader fr = null;
		BufferedReader br = null;
		String sql = "INSERT INTO loaihang values (?,?)";
		try {
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			String dr = "";

			while ((dr = br.readLine()) != null) {
				pst = conn.prepareStatement(sql);
				pst.setInt(1, Integer.parseInt(dr.substring(0, dr.indexOf(", "))));
				pst.setString(2, dr.substring(dr.indexOf(", ") + 1, dr.length()));
				isSave = pst.executeUpdate() > 0;
			}
		} catch (NumberFormatException | IOException | SQLException e2) {
			e2.printStackTrace();
		} finally {
			utils.Util.close(pst);
		}
		return isSave;
	}

	public MatHang getId(int itemId) {
		String sql = "CALL showItemsByGroupId(?)";
		MatHang category = null;
		try {
			pst = conn.prepareStatement(sql);
			pst.setInt(1, itemId);
			rs = pst.executeQuery();
			if (rs.next()) {
				category = new MatHang(rs.getInt("maMH"), rs.getString("tenMH"), rs.getDouble("giaBan"),
						rs.getDouble("giaMua"), rs.getInt("maLoai"), null);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return category;
	}


}
