package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import connection.DatabaseConnection;
import model.Product;

public class ProductDAO {
	private static Connection con;
	private static PreparedStatement ps;
	private static ResultSet rs;
	
	private ProductDAO() {
	}
	
	public static List<Product> getByCategoryIdAndSaleOut(Integer categoryId, Double from, Double to) {
		List<Product> list = new ArrayList<>();
		String sql = "SELECT *\r\n"
				+ "FROM mathang \r\n"
				+ "WHERE MaLoai = ?\r\n"
				+ "AND GiaBan BETWEEN ? AND ?;";
		con = DatabaseConnection.getConnection();
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, categoryId);
			ps.setDouble(2, from);
			ps.setDouble(3, to);
			rs = ps.executeQuery();
			while (rs.next()) {
				Product product = new Product(rs.getInt(1), rs.getString(2), rs.getString(3), 
									rs.getString(4), rs.getDouble(5), rs.getDouble(6), 
									rs.getString(7), CategoryDAO.getById(rs.getInt(8)).getId());
				list.add(product);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public static List<Product> getByCategoryName(String categoryName) {
		List<Product> list = new ArrayList<>();
		String sql = "SELECT mh.*\r\n"
				+ "FROM mathang mh\r\n"
				+ "WHERE mh.MaLoai = (SELECT lh.MaLoai\r\n"
				+ "					FROM loaihang lh\r\n"
				+ "                    WHERE lh.TenLoai = ?);";
		con = DatabaseConnection.getConnection();
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, categoryName);
			rs = ps.executeQuery();
			while (rs.next()) {
				Product product = new Product(rs.getInt(1), rs.getString(2), rs.getString(3), 
											rs.getString(4), rs.getDouble(5), rs.getDouble(6), 
											rs.getString(7), rs.getInt(8));
				list.add(product);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public static List<Product> getByDate(LocalDate date) {
		List<Product> list = new ArrayList<>();
		String sql = "SELECT mh.* \r\n"
				+ "FROM mathang mh\r\n"
				+ "JOIN chitietdonhang ctdh\r\n"
				+ "	ON mh.MaMH = ctdh.MaMH\r\n"
				+ "JOIN donhang dh\r\n"
				+ "	on ctdh.MaDH = dh.MaDH\r\n"
				+ "WHERE cast(dh.ThoiGianDatHang as DATE) = ?;";
		con = DatabaseConnection.getConnection();
		try {
			ps = con.prepareStatement(sql);
			ps.setDate(1, Date.valueOf(date));
			rs = ps.executeQuery();
			while (rs.next()) {
				Product product = new Product(rs.getInt(1), rs.getString(2), rs.getString(3), 
											rs.getString(4), rs.getDouble(5), rs.getDouble(6), 
											rs.getString(7), rs.getInt(8));
				list.add(product);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
}
