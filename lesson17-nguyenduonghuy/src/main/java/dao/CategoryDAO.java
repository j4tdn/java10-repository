package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connection.DatabaseConnection;
import model.Category;
import model.CategoryDto;

public class CategoryDAO {
	private static Connection con;
	private static PreparedStatement ps;
	private static ResultSet rs;
	
	private CategoryDAO() {
	}
	
	public static Category getById(Integer categoryId) {
		Category category = null;
		String sql = "SELECT * \r\n"
						+ "FROM loaihang\r\n"
						+ "WHERE MaLoai = ?;";
		con = DatabaseConnection.getConnection();
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, categoryId);
			rs = ps.executeQuery();
			if (rs.next()) {
				category = new Category(rs.getInt(1), rs.getString(2));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return category;
	}
	
	public static Category getByName(String categoryName) {
		Category category = null;
		String sql = "SELECT * \r\n"
				+ "FROM loaihang\r\n"
				+ "WHERE TenLoai = ?;";
		con = DatabaseConnection.getConnection();
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, categoryName);
			rs = ps.executeQuery();
			if (rs.next()) {
				category = new Category(rs.getInt(1), rs.getString(2));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return category;
	}
	
	public static List<CategoryDto> getDetail() {
		List<CategoryDto> list = new ArrayList<>();
		String sql = "SELECT lh.*, \r\n"
					+ "		group_concat(concat(mh.TenMH, ':', kcmh.Soluong) SEPARATOR ' - '),\r\n"
					+ "        SUM(kcmh.Soluong)\r\n"
					+ "FROM loaihang lh\r\n"
					+ "JOIN mathang mh\r\n"
					+ "	on mh.MaLoai = lh.MaLoai\r\n"
					+ "JOIN kichcomathang kcmh\r\n"
					+ "	on mh.MaMH = kcmh.MaMH\r\n"
					+ "GROUP BY lh.MaLoai;";
		con = DatabaseConnection.getConnection();
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				CategoryDto categoryDto = new CategoryDto(rs.getInt(1), rs.getString(2), 
														rs.getString(3), rs.getInt(4));
				list.add(categoryDto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
}
