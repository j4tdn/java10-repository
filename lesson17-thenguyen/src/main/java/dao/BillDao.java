package dao;

import static utils.SqlUtils.close;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import connection.DbConnection;

public class BillDao {
	private Connection connection;
	private java.sql.PreparedStatement pst = null;
	private ResultSet rs = null;

	public BillDao() {
		connection = DbConnection.getConnection();
	}

	public double getTotalOfMoney(int orderId) {
		double getTotalOfMoney = 0;
		String sql = "SELECT SUM(mh.GiaBan * ctdh.SoLuong) as TongTien FROM chitietdonhang ctdh, mathang mh WHERE mh.MaMH=ctdh.MaMH and ctdh.MaDH=?";
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

	public boolean creatBill(int orderId, double TotalOfMoney) {
		String sql = "INSERT INTO hoadon(maHD,maDH,soTienCanThanhToan,NgayXuat) VALUES (?,?,?,current_timestamp())";
		boolean isSave = false;
		try {
			pst = connection.prepareStatement(sql);
			pst.setInt(1, orderId);
			pst.setInt(2, orderId);
			pst.setDouble(3, TotalOfMoney);
			isSave = pst.executeUpdate() > 0;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pst);
		}
		return isSave;

	}
}