package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connection.DbConnection;
import persistence.Item;
import utils.SqlUtils;

public class ItemDao {
	
	private Connection conn;
	private Statement st;
	private PreparedStatement pst;
	private ResultSet rs;
	public ItemDao() {
	}
	//2. Liệt kê các mặt hàng theo mã loại và giá bán trung bình từ 100 đến 500 trong hệ thống

	public List<Item> getItemfor( int id) {
	List<Item>  result = new ArrayList<>();
		String sql = "SELECT *\n"
				+ " FROM mathang\n"
				+ "where GiaBan between 100 and 300 and MaLoai =?";
		conn = DbConnection.getConnection();
		try {
			pst = conn.prepareStatement(sql);
			pst.setInt(1, id);
			rs = pst.executeQuery();
			while (rs.next()) {
				Item item = new Item(rs.getInt("MaMH"), rs.getString("TenMH"), rs.getDouble("GiaBan"), rs.getDouble("GiaMua"), rs.getInt("MaLoai"));
				 result.add(item);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs,st);
		}
		return result;
	}
	
	
	//5. Liệt kê các mặt hàng được bán trong ngày bất kì
	 public List<Item> getItemByDate( Date date) {
		List<Item>  result = new ArrayList<>();
			String sql = 
					"select mh.MaMH,\n" 
					+ "mh.TenMH,\n"
					+"dh.ThoiGianDatHang\n"
					+"from mathang mh\n"  
					+"join chitietdonhang ctdh\n"  
					+"on ctdh.MaMH = mh.MaMH\n" 
					+"join donhang dh\n" 
					+"on dh.MaDH = ctdh.MaDH\n" 
					+"where cast(dh.ThoiGianDatHang as date) = ?";
			conn = DbConnection.getConnection();
			try {
				pst = conn.prepareStatement(sql);
				pst.setDate (1, date);
				rs = pst.executeQuery();
				while (rs.next()) {
					Item item = new Item(rs.getInt("MaMH"), rs.getString("TenMH"), rs.getDate("ThoiGianDatHang"));
					 result.add(item);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				SqlUtils.close(rs,st);
			}
			return result;
		}
		
	 public List<Item> getItemsProcedure(int itemGroupId) {
			List<Item> result = new ArrayList<>();
			String sql = "CALL showItemsByGroupId(?);";
			conn = DbConnection.getConnection();
			try {
				pst = conn.prepareStatement(sql);
				pst.setInt(1, itemGroupId);
				rs = pst.executeQuery();
				while (rs.next()) {
					Item item = new Item(rs.getInt("maMH"),
							rs.getString("tenMH"),
							rs.getDouble("giaBan"),
							rs.getDouble("giaMua"),
							rs.getInt("MaLoai"));
					result.add(item);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				SqlUtils.close(rs,st);
			}
			return result;
		}
}
