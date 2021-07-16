package dao;

import static utils.SqlUtils.close;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connection.DbConnection;
import persistence.Items;

public class ItemsDao {
	private Connection connection;
	private Statement st = null;
	private PreparedStatement pst = null;
	private ResultSet rs = null;

	public ItemsDao() {
		connection = DbConnection.getConnection();
	}

	// Liệt kê các mặt hàng theo mã loại và giá bán trung bình từ 100 đến 500 trong
	// hệ thống
	public List<Items> getAll(int itemGroupId, int saleIn, int saleOut) {
		List<Items> result = new ArrayList<>();
		String sql = "SELECT * from mathang where maloai = ? and GiaBan BETWEEN ? and ?";
		try {
			pst = connection.prepareStatement(sql);
			pst.setInt(1, itemGroupId);
			pst.setInt(2, saleIn);
			pst.setInt(3, saleOut);
			rs = pst.executeQuery();
			while (rs.next()) {
				Items items = new Items(rs.getInt("MaMH"), rs.getString("TenMH"), rs.getInt("GiaBan"));
				result.add(items);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rs, pst);
		}
		return result;
	}

	// Liệt kê các mặt hàng được bán trong ngày bất kì
	public List<Items> getItems(Date doSale) {
		List<Items> result = new ArrayList<>();
		String sql = "SELECT mh.MaMH, mh.TenMH, dh.ThoiGianDatHang \n"
				+ "FROM MatHang mh JOIN ChiTietDonHang ctdh ON mh.MaMH = ctdh.MaMH \n"
				+ "JOIN DonHang dh ON dh.MaDH = ctdh.MaDH \n" + "WHERE DATE(dh.ThoiGianDatHang) = ?";
		try {
			pst = connection.prepareStatement(sql);
			pst.setDate(1, doSale);
			rs = pst.executeQuery();
			while (rs.next()) {
				Items items = new Items(rs.getInt("MaMH"), rs.getString("TenMH"), rs.getDate("ThoiGianDatHang"));
				result.add(items);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pst);
		}
		return result;
	}

	public List<Items> getItemsByIdUsingProcedure(int itemGroupId) {
		List<Items> listItems = new ArrayList<>();
		String sql = "CALL showItemsByGroupId(?)";

		try {
			pst = connection.prepareStatement(sql);
			pst.setInt(1, itemGroupId);
			rs = pst.executeQuery();
			while (rs.next()) {
				Items item = new Items(rs.getInt("maMH"), rs.getString("tenMH"), rs.getInt("giaBan"));
				listItems.add(item);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pst);
		}
		return listItems;
	}

}
