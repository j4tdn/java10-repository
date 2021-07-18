package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import connection.DbConnection;
import persistence.Item;
import utils.SqlUtils;

public class ItemDao {
	private Connection conn;
	private Statement st = null;
	private PreparedStatement pst = null;
	private ResultSet rs = null;

	public ItemDao() {
		conn = DbConnection.getConnection();
	}
	public List<Item> getItemByDate( LocalDate dateSale) {
		List<Item>  result = new ArrayList<>();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		String dateString = dateSale.format(dtf);
			String sql = 
					"select mh.MaMH,\n" 
					+ "mh.TenMH,\n"
					+"dh.ThoiGianDatHang\n"
					+"from mathang mh\n"  
					+"join chitietdonhang ctdh\n"  
					+"on ctdh.MaMH = mh.MaMH\n" 
					+"join donhang dh\n" 
					+"on dh.MaDH = ctdh.MaDH\n" 
					+"where cast(dh.ThoiGianDatHang as date) = 23/11/2019";
			conn = DbConnection.getConnection();
			try {
				pst = conn.prepareStatement(sql);
				pst.setDate (1, dateSale);
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
	

}
