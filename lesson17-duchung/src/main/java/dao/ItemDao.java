package dao;

import static utils.SqlUtils.close;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connection.DbConnection;
import persistence.Items;

public class ItemDao {
	private Connection connection;
	private java.sql.PreparedStatement pst = null;
	private ResultSet rs = null;

	public ItemDao() {
		connection = DbConnection.getConnection();
	}

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
				Items items2 = new Items(rs.getInt("maMH"), rs.getString("tenMH"), rs.getInt("giaBan"));
				result.add(items2);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(rs, pst);
		}
		return result;
	}

	public List<Items> getItems(Date salesDate) {
		List<Items> listItems = new ArrayList<>();
		String sql = "SELECT mh.MaMH, mh.TenMH, dh.ThoiGianDatHang FROM MatHang mh "
				+ " JOIN ChiTietDonHang ctdh ON mh.MaMH = ctdh.MaMH JOIN DonHang dh"
				+ " ON dh.MaDH = ctdh.MaDH WHERE DATE(dh.ThoiGianDatHang) = ?";

		try {
			pst = connection.prepareStatement(sql);
			pst.setDate(1, salesDate);
			rs = pst.executeQuery();
			while (rs.next()) {
				Items item = new Items(rs.getInt("maMH"), rs.getString("tenMH"), rs.getDate("ThoiGianDatHang"));
				listItems.add(item);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(pst);
		}
		return listItems;
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(pst);
		}
		return listItems;
	}

}
