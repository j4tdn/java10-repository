package dao;

import static utils.SqlUtils.close;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import connection.DbConnection;

public class BillDao {
	private Connection connection;
	private PreparedStatement pst;
	private ResultSet rs;

	public BillDao() {
		connection = DbConnection.getConnection();
	}

	public double getTotalOfMoney(int orderId) {
		double getTotalOfMoney = 0;
		String sql = "SELECT SUM(mh.GiaBan * ctdh.SoLuong) AS TongTien \n" + "FROM MatHang mh, ChiTietDonHang ctdh \n"
				+ "WHERE mh.MaMH = ctdh.MaMH AND ctdh.MaDH = ?";
		try {
			pst = connection.prepareStatement(sql);
			pst.setInt(1, orderId);
			rs = pst.executeQuery();
			while (rs.next()) {
				getTotalOfMoney = rs.getDouble(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rs, pst);
		}
		return getTotalOfMoney;
	}

	public boolean creatBill( int orderId, double TotalOfMoney) {
		String sql = "INSERT INTO hoadon( maDH,soTienCanThanhToan,NgayXuat) VALUES (?,?,current_timestamp())";
		boolean isSave = false;
		try {
			pst = connection.prepareStatement(sql);
			
			pst.setInt(1, orderId);
			pst.setDouble(2, TotalOfMoney);
			isSave = pst.executeUpdate() > 0;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pst);
		}
		return isSave;

	}

}
