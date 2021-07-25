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
import persistence.Items2;
public class ItemDao {
	private Connection connection;
	private Statement st=null;
	private ResultSet rs = null;

	public ItemDao() {
		connection = DbConnection.getConnection();
	}
	
	// Câu 2: 22đ
	// SELECT lh.* bị thừa
	// Đề yêu cầu và em chỉ lấy ra MaLoai, TenLoai, SoLuong trong Java
	// Thì chỗ SQL em cũng nên lấy ra chừng đó column thôi. SELECT ra mà ko sử dụng
	// trong JAVA thì thừa và tốn memory cho ResultSet
	public List<Items> getItems() {
		List<Items> result = new ArrayList<>();
		String sql = "SELECT lh.*,\n"
				+ "       SUM(kcmh.SoLuong) SoLuong\n"
				+ "FROM MatHang mh\n"
				+ "JOIN LoaiHang lh\n"
				+ " ON  mh.MaLoai = lh.MaLoai\n"
				+ "JOIN KichCoMatHang kcmh\n"
				+ " ON  mh.MaMH = kcmh.MaMH \n"
				+ "GROUP BY MaLoai";
		try {
			st = connection.createStatement();
			rs = st.executeQuery(sql); 
			while (rs.next()) {
				Items ig = new Items(rs.getInt("MaLoai"), rs.getString("TenLoai"),rs.getInt("SoLuong"));
				result.add(ig);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rs, st);
		}
		return result;
	}
	
	// Câu 3: 18 
	// Cùng vấn đề với câu 2
	// Để chỉ yêu cầu lấy ra tên mặt hàng
	// Thì lúc xử lý SQL em chỉ SELECT ..TenMH là được rồi
	// Phía dưới JOIN hay WHERE blabla là tùy đề bài. Còn yêu cầu lấy gì
	// Thì mình SELECT cái đó thôi
	public List<Items2> getItems2() {
		List<Items2> Items2 = new ArrayList<>();
		String sql = "SELECT mh.MaMH,\n"
						 + " mh.TenMH,\n"
						 + " dh.ThoiGianDatHang,\n"
						 + " sum(ctdh.soluong) as TongSoLuong\n"
						 + "FROM MatHang mh  \n"
						 + "JOIN ChiTietDonHang ctdh \n"
						 + "ON mh.MaMH = ctdh.MaMH \n"
						 + "JOIN DonHang dh \n"
						 + "ON dh.MaDH = ctdh.MaDH \n"
						 + "WHERE Year(dh.ThoiGianDatHang) = 2020\n" 
						 + "GROUP BY mh.maMH\n" 
						 + "ORDER BY TongSoLuong DESC\n"
						 + "LIMIT 3;\n" + "";

		try {
			st = connection.createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				// Đồng thời yêu cầu trả về danh sách tên mặt hàng
				// Thì e trả về List<String> thôi. Ko cần tạo Items2 chứa thuộc tính String
				// bên trong
				Items2 item = new Items2(rs.getString("TenMH"));
				Items2.add(item);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(rs, st);
		}
		return Items2;
	}
	
}
