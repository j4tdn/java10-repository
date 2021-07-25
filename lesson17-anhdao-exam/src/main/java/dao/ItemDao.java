package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import connection.DbConnection;
import persistence.Item;
import persistence.ItemDate;
import persistence.ItemDto;
import utils.SqlUtils;

// Hình như em chưa format code cho cả class
public class ItemDao {
	
	private Connection conn;
	private Statement st;
	private PreparedStatement pst;
	private ResultSet rs;
	public ItemDao() {
	}
	
	//1. Liệt kê các mặt hàng được bán trong ngày 23-11-2019. Với ngày bán là tham số truyền vào kiểu dữ liệu LocalDate.
	
	   // Câu 1: 25đ
	   // Tên hàm: getItemDates(LocalDate date)
	   // Tham số của em truyền vào là date rồi nên ko cần byDate nữa
       public List<ItemDate> getItembyDate(LocalDate date) {
		List<ItemDate>  result = new ArrayList<>();
			String sql = 
					"select mh.MaMH,\n"  
					+"       mh.TenMH,\n"  
					+"      cast(dh.ThoiGianDatHang as time) ThoiGianDH\n"  
					+"from mathang mh\n"  
					+"join chitietdonhang ctdh\n"  
					+"on ctdh.MaMH = mh.MaMH\n"  
					+"join donhang dh\n"  
					+"on dh.MaDH = ctdh.MaDH\n"  
					+"where cast(dh.ThoiGianDatHang as date)=?";
			conn = DbConnection.getConnection();
			try {
				pst = conn.prepareStatement(sql);
				pst.setDate(1, Date.valueOf(date));
				rs = pst.executeQuery();
				while (rs.next()) {
					ItemDate itemTime = new ItemDate(rs.getInt("MaMH"),
							rs.getString("TenMH"),
						  rs.getTime("hoiGianDH").toLocalTime());
					 result.add(itemTime);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				SqlUtils.close(rs,st);
			}
			return result;
		}
	
	
	
	
	
	
	//3.Liệt kê top 3 mặt hàng được bán nhiều nhất năm 2020. Với năm là tham số truyền vào.
	// Câu 3: 22đ	
	public List<String> getItemBestSeller( int year) {
		List<String>  result = new ArrayList<>();
			String sql = 
					"select mh.TenMH,\n" 
					+"     sum(ctdh.SoLuong) TôngSoluong\n" 
					+"from mathang mh\n" 
					+"join chitietdonhang ctdh\n" 
					+"on ctdh.MaMH = mh.MaMH\n" 
					+"join donhang dh\n" 
					+"on dh.MaDH = ctdh.MaDH\n" 
					+"where  year(dh.ThoiGianDatHang)=?\n" 
					+"group by  mh.TenMH\n" 
					+"order by sum(ctdh.Soluong) desc\n"
					// Nên cho tham số truyền vào
					// Sai chung cả lớp có thể do a ko nói kỹ đề
					+"limit 3;";
			conn = DbConnection.getConnection();
			try {
				pst = conn.prepareStatement(sql);
				pst.setInt(1, year);
				rs = pst.executeQuery();
				while (rs.next()) {
					 // Đỡ 1 dòng code
					 result.add(rs.getString("TenMH"));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				SqlUtils.close(rs,st);
			}
			return result;
		}
	
//	4. Liệt kê danh sách các mặt hàng của mỗi loại hàng
	// Câu 4: 25đ
	// Tương tự review của những bạn khác nên em nhờ a đọc code bên bạn a đã review rồi giúp a
	// A khỏi copy qua đây nha
	// https://github.com/j4tdn/java10-repository/commit/8b31cf357713741ae999415e7e4ded3a1a297810 >> class ListItems  
	public List<ItemDto> getItemByGroup() {
		List<ItemDto>  result = new ArrayList<>();
			String sql = 
					"SELECT mh.MaLoai,\n" 
							+ "       lh.TenLoai,\n" 
							+ "       mh.MaMH,\n"
							+ "       mh.TenMH,\n"  
							+ "       mh.GiaBan,\n"  
							+ "       mh.GiaMua,\n" 
							+ "       sum(kcmh.Soluong) TongSoluong\n" 
							+ "FROM mathang mh\n"  
							+ "join loaihang lh\n" 
							+ "on mh.MaLoai = lh.MaLoai\n"  
							+ "join kichcomathang kcmh\n" 
							+ "on mh.MaMH = kcmh.MaMH\n" 
							+ "group by  mh.MaMH";
			conn = DbConnection.getConnection();
			try {
				pst = conn.prepareStatement(sql);
				
				rs = pst.executeQuery();
				while (rs.next()) {
			ItemDto itemByGr = new ItemDto(rs.getInt("MaLoai"), 
					rs.getString("TenLoai"),
					rs.getInt("MaMH"), 
					rs.getString("TenMH"),
				    rs.getDouble("GiaBan"),
				    rs.getDouble("GiaMua"), 
				    rs.getInt("TongSoLuong"));
			result.add(itemByGr);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				SqlUtils.close(rs,st);
			}
			return result;
		}
	
	
	
}
