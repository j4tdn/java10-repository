package view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import org.apache.commons.codec.digest.DigestUtils;

import connection.DbConnection;
import entity.Staff;

public class Ex08 {

	public static void main(String[] args) {
		Staff staff1 = new Staff(6, "Le Van A", "A@email.com", "202 Le Duan", "012836269", "abc123");
		if (insertStaffWithPasswordEncryption(staff1, DigestUtils::md5Hex)) {
			System.out.println("Insert a staff with MD5 Encryption successfully");
		}

		Staff staff2 = new Staff(7, "Le Van B", "B@email.com", "202 Le Duan", "012836269", "levanb");
		if (insertStaffWithPasswordEncryption(staff2, DigestUtils::sha256Hex)) {
			System.out.println("Insert a staff with SHA256 Encryption successfully");
		}

	}

	public static boolean insertStaffWithPasswordEncryption(Staff staff, Function<String, String> func) {
		String sql = "INSERT INTO nhanvien(MaNV, TenNV, Email, DiaChi, SoDienThoai, MatKhau) VALUES (?, ?, ?, ?, ?, ?)";
		Connection myConn = DbConnection.getConnection();
		try {
			PreparedStatement stmt = myConn.prepareStatement(sql);
			stmt.setInt(1, staff.getId());
			stmt.setString(2, staff.getName());
			stmt.setString(3, staff.getEmail());
			stmt.setString(4, staff.getAddress());
			stmt.setString(5, staff.getPhoneNumber());
			stmt.setString(6, func.apply(staff.getPassword()).toUpperCase());

			if (stmt.executeUpdate() > 0) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
