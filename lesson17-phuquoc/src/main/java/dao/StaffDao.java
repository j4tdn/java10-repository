package dao;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import connection.DbConnection;
import persistence.Staff;

public class StaffDao {
	private Connection conn;
	private Statement st;
	private PreparedStatement pst;
	private ResultSet rs;

	public StaffDao() {
		conn = DbConnection.getConnection();
	}
	
	public static String cryptWithMD5(String pass){
		MessageDigest md;
	    try {
	        md = MessageDigest.getInstance("MD5");
	        byte[] passBytes = pass.getBytes();
	        md.reset();
	        byte[] digested = md.digest(passBytes);
	        StringBuffer sb = new StringBuffer();
	        for(int i=0;i<digested.length;i++){
	            sb.append(Integer.toHexString(0xff & digested[i]));
	        }
	        return sb.toString();
	    } catch (NoSuchAlgorithmException ex) {
	        Logger.getLogger(StaffDao.class.getName()).log(Level.SEVERE, null, ex);
	    }
	        return null;
	   }

	public boolean save(Staff staff) {
		boolean isSaved = false;
		String sql = "INSERT INTO nhanvien(MaNV, TenNV, Email, DiaChi, SoDienThoai, MatKhau)\r\n"
				+ "VALUES (?, ?, ?, ?, ?, ?)";
		try {
			pst = conn.prepareStatement(sql);
			pst.setInt(1, staff.getStaffId());
			pst.setString(2, staff.getStaffName());
			pst.setString(3, staff.getEmail());
			pst.setString(4, staff.getAddress());
			pst.setString(5, staff.getPhone());
			pst.setString(6, cryptWithMD5(staff.getPass()));
			isSaved = pst.executeUpdate() > 0;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return isSaved;
	}
	
}
