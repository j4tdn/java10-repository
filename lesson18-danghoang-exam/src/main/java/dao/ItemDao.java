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
	
	// Câu 1: 5đ
	public List<Item> getItemByDate(LocalDate dateSale) {
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
					// A ko chạy code
					// Nhưng a đoán 99% code chạy sẽ lỗi. Phải thêm '' như bên này cast(dh.ThoiGianDatHang as date) = '2019-11-23'
					// Và vì sao em ko dùng PrepareStatement
					+"where cast(dh.ThoiGianDatHang as date) ?";
			conn = DbConnection.getConnection();
			try {
				pst = conn.prepareStatement(sql);
				// Chứ phía trên code cũ em có dấu ? tham số nào đâu mà dưới này setDate
				pst.setDate(1, dateSale);
				rs = pst.executeQuery();
				while (rs.next()) {
					// Tham số thứ 3: rs.getDate trả về java.sql.Date như trong constructor của em
					// Tham số thứ 3 là LocalDate nên e phải em kiểu qua LocalDate rồi mới trả về được
					// Nhưng đề yêu cầu là get ra LocalTime
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
