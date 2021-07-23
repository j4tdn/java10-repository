package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connection.DbConnection;
import persistence.ItemGroup;
import persistence.Items;
import persistence.ListItem;
import utils.SqlUtils;

// Đề yêu cầu có lấy danh sách mặt hàng, loại hàng
// Mà sao em code hết trong ItemGroupDao ri.

// Khi nào cần MatHang thì tạo ItemDao
// LoaiHang thì ItemGroupDao em nha
public class ItemGroupDao {
	private Connection conn;
	private Statement st;
	private ResultSet rs;

	public ItemGroupDao() {
		conn = DbConnection.getConnection();
	}

	// Câu 1: POINT: 20
	public List<ItemGroup> getItemToDay(Date date) {
		List<ItemGroup> result = new ArrayList<>();

		// Câu này em làm đúng rồi.
		// Yêu cầu where theo ngày tháng năm. Em dùng java.sql.Date chính xác
		// Khi lấy ra giờ phút giây rs.getTime là java.sql.Time cũng chính xác
		
		// Nhưng chỗ query em nên dùng PrepareStatement để tránh SQL Injection
		// A có sửa code bên dưới. Và cứ nhớ là có tham số là dùng PrepareStatement
		String sql = "select mh.MaMH, mh.TenMH, dh.thoigiandathang " + "from mathang mh " + "join chitietdonhang ctdh "
				+ "on mh.MaMH = ctdh.MaMH " + "join donhang dh " + "on dh.MaDH = ctdh.MaDH "
				+ "where date(dh.thoigiandathang) = '" + date + "'";
		// date(dh.thoigiandathang) = ?;

		try {
			
			// pst = conn.prepareStatement(sql);
			// pst.setDate(1, date);
			// rs = pst.executeQuery();
			
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				ItemGroup ig = new ItemGroup(rs.getInt("MaMH"), rs.getString("TenMH"), rs.getTime("thoigiandathang"));
				result.add(ig);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, st);
		}
		return result;
	}

	// Câu 2: 25
	// Code đúng rồi. Nhưng mà nên là List<ItemDto> e nha.
	// Same review với bài bạn Tài. E kích vào commit của Tài a review xem giúp a
	public List<Items> getItems() {
		List<Items> result = new ArrayList<>();
		String sql = "SELECT lh.*,\n" + "       SUM(kcmh.SoLuong) SoLuong\n" + "FROM MatHang mh\n"
				+ "JOIN LoaiHang lh\n" + " ON  mh.MaLoai = lh.MaLoai\n" + "JOIN KichCoMatHang kcmh\n"
				+ " ON  mh.MaMH = kcmh.MaMH \n" + "GROUP BY MaLoai";
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				Items ig = new Items(rs.getInt("MaLoai"), rs.getString("TenLoai"), rs.getInt("SoLuong"));
				result.add(ig);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, st);
		}
		return result;
	}

	// Xem code review ở đây giúp a https://github.com/j4tdn/java10-repository/commit/8b31cf357713741ae999415e7e4ded3a1a297810
	// Code 2 bạn khá same nhau
	// POINT 25
	public List<ListItem> getListItem() {
		List<ListItem> result = new ArrayList<>();
		String sql = "SELECT lh.MaLoai, lh.TenLoai, mh.MaMH, mh.TenMH, mh.GiaBan, mh.GiaMua, kcmh.SoLuong \n"
				+ "FROM LoaiHang lh JOIN MatHang mh ON mh.MaLoai = lh.MaLoai \n"
				+ "JOIN KichCoMatHang kcmh ON mh.MaMH = kcmh.MaMH \n";
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				ListItem ig = new ListItem(rs.getInt("MaLoai"), rs.getString("TenLoai"), rs.getInt("MaMH"),
						rs.getString("TenMH"), rs.getInt("GiaBan"), rs.getInt("GiaMua"), rs.getInt("SoLuong"));
				result.add(ig);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, st);
		}
		return result;
	}

	// POINT 20
	public List<String> getItem() {
		List<String> listItems = new ArrayList<>();
		
		// Em làm đúng rồi
		// Nhưng chỗ điều kiện như là năm 2020 hoặc lấy 3 mặt hàng
		// Nhưng tham số đó nên là tham số truyền vào
		// WHERE YEAR(ThoiGianDatHang) = ?
		//       LIMIT ?
		// Thì đúng hơn thay vì điền trực tiếp
		String sql = "SELECT mh.MaMH, mh.TenMH, dh.ThoiGianDatHang,sum(ctdh.soluong) as TongSoLuong\r\n"
				+ "FROM MatHang mh  JOIN ChiTietDonHang ctdh ON mh.MaMH = ctdh.MaMH JOIN DonHang dh ON dh.MaDH = ctdh.MaDH \r\n"
				+ "WHERE Year(dh.ThoiGianDatHang) = 2020\r\n" + "GROUP BY mh.maMH\r\n" + "ORDER BY TongSoLuong DESC\r\n"
				+ "LIMIT 3;\r\n" + "";

		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				listItems.add(rs.getString("TenMH"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listItems;
	}

}
