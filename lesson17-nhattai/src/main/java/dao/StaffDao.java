package dao;

import static utils.SqlUtils.close;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import connection.DbConnection;
import persistence.Staff;

public class StaffDao {
	private Connection connection;
	private PreparedStatement pst;

	public StaffDao() {
		connection = DbConnection.getConnection();
	}

	public boolean insertStaff(Staff staff) {
		boolean isInserted = false;
		String sql = "insert into nhanvien values (?,?,?,?,?,?)";

		try {
			MessageDigest md = MessageDigest.getInstance("MD5"); // SHA-256 or MD5
			byte[] hashInBytes = md.digest(staff.getPassword().getBytes(StandardCharsets.UTF_8));
			StringBuilder sb = new StringBuilder();
			for (byte b : hashInBytes) {
				sb.append(String.format("%02x", b));
			}
			pst = connection.prepareStatement(sql);
			pst.setInt(1, staff.getStaffId());
			pst.setString(2, staff.getStaffName());
			pst.setString(3, staff.getEmail());
			pst.setString(4, staff.getAddress());
			pst.setString(5, staff.getPhone());
			pst.setString(6, sb.toString());
			isInserted = pst.executeUpdate() > 0;
		} catch (NoSuchAlgorithmException | SQLException e) {
			e.printStackTrace();
		} finally {
			close(pst);
		}
		return isInserted;
	}
}
