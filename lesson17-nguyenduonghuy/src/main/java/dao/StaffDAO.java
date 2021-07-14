package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.codec.digest.DigestUtils;

import connection.DatabaseConnection;
import entities.Staff;

public class StaffDAO {
	private static Connection con;
	private static PreparedStatement ps;
	private static ResultSet rs;
	
	private StaffDAO() {
	}
	
	public static List<Staff> getAll() {
		List<Staff> list = new ArrayList<>();
		String sql = "SELECT * FROM nhanvien";
		con = DatabaseConnection.getConnection();
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				Staff staff = new Staff(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
				list.add(staff);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public static boolean save(Staff staff) {
		boolean isSaved = false;
		String sql = "INSERT INTO nhanvien(MaNV, TenNV, Email, DiaChi, SoDienThoai, MatKhau)\r\n"
					+ "VALUES (?, ?, ?, ?, ?, ?)";
		con = DatabaseConnection.getConnection();
		try {
			ps =con.prepareStatement(sql);
			ps.setInt(1, staff.getId());
			ps.setString(2, staff.getName());
			ps.setString(3, staff.getEmail());
			ps.setString(4, staff.getAddress());
			ps.setString(5, staff.getPhone());
			ps.setString(6,DigestUtils.md5Hex(staff.getPassword()));
			isSaved = ps.executeUpdate() > 0;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return isSaved;
	}
}
