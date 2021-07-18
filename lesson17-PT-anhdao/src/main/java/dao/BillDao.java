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
import persistence.ItemGroup;
import utils.SqlUtils;

public class BillDao {
	private Connection conn;
	private Statement st;
	private PreparedStatement pst;
	private ResultSet rs;
	
	public BillDao() {
	}

	public Double getToTalOfMoney( int id) {
	
		Double  result = null;
		String sql = 
				"select SUM(mh.GiaBan *ctdh.SoLuong)  TongTien\n" 
				+ "from donhang dh\n" 
				+ "join chitietdonhang ctdh\n"  
				+ "on dh.MaDH=ctdh.MaDH\n"  
				+ "join  mathang mh \n"  
				+ "on  mh.MaMH=ctdh.MaMH\n"  
				+ "WHERE  dh.MaDH = ?";
		conn = DbConnection.getConnection();
		try {
			pst = conn.prepareStatement(sql);
			pst.setInt(1, id);
			rs = pst.executeQuery();
			while (rs.next()) {
				 result = rs.getDouble("TongTien");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs,st);
		}
		return result;
	}
	// insert
		public boolean insertBill(int idBill, int codeOrder, Double TotalOfMoney) {
			boolean isinsert = false;
			String sql = "INSERT INTO HoaDon(MaHD, NgayXuat, SoTienCanThanhToan, MaDH)\n"
					+ "VAlUES(?, current_timestamp(), ?, ?)";
			conn = DbConnection.getConnection();
			try {
				pst = conn.prepareStatement(sql);
				
				pst.setInt(1, idBill);
				pst.setDouble(2, TotalOfMoney);
				pst.setInt(3, codeOrder);
				
				isinsert= pst.executeUpdate()>0;
				
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				SqlUtils.close(rs,st);
			}
			return isinsert;
		
		}
}

