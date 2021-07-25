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
import persistence.ItemGroup;
import persistence.ItemGroup2;
import persistence.ItemGroup3;
import utils.SqlUtils;

public class ItemGroupDao {

	private Connection conn;
	private ResultSet rs;
	private PreparedStatement pst;
	private Statement st;

	public ItemGroupDao() {
		conn = DbConnection.getConnection();

	}

	// Câu 1: 25đ
	// Tên hàm nên sửa là getItems
	public List<ItemGroup> getItemToDay(Date date) {
		List<ItemGroup> result = new ArrayList<>();

		// Bài làm tốt rồi
		// Convention. Các từ khóa của SQL như SELECT FROM ...
		// Em nên đặt viết hoa hết. Lỡ đi làm có code review cũng pass
		String sql = "SELECT mh.MaMH, mh.TenMH, dh.thoigiandathang " 
				+ "from mathang mh " 
				+ "join chitietdonhang ctdh "
				+ "on mh.MaMH = ctdh.MaMH " 
				+ "join donhang dh " 
				+ "on dh.MaDH = ctdh.MaDH "
				+ "where date(dh.thoigiandathang) = ? ";

		try {
			pst = conn.prepareStatement(sql);
			pst.setDate(1, date);
			rs = pst.executeQuery();
			while (rs.next()) {
				ItemGroup ig = new ItemGroup(rs.getInt("MaMH"), rs.getString("TenMH"), rs.getTime("thoigiandathang"));
				result.add(ig);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, pst);
		}
		return result;
	}

	// Không nên đặt ItemGroup2,3,4 => Confused
	// Câu 2: 25đ
	public List<ItemGroup2> getItems() {
		List<ItemGroup2> result = new ArrayList<>();
		String sql = "SELECT lh.*,\n" 
				+ "SUM(kcmh.SoLuong) SoLuong\n" 
				+ "FROM MatHang mh\n"
				+ "JOIN LoaiHang lh\n" 
				+ " ON  mh.MaLoai = lh.MaLoai\n" 
				+ "JOIN KichCoMatHang kcmh\n"
				+ " ON  mh.MaMH = kcmh.MaMH \n" 
				+ "GROUP BY MaLoai";
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				ItemGroup2 ig = new ItemGroup2(rs.getInt("MaLoai"), rs.getString("TenLoai"), rs.getInt("SoLuong"));
				result.add(ig);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, st);
		}
		return result;
	}

	// Câu 4: 25 
	// Cơ bản code đúng rồi. Chạy được như trường hợp tổng quát làm như này hơi cực
	// Khi giả sử lấy hết các columns từ 3 tables. Thì làm như em rất mệt
	// A có review ở đây bài bạn Tài: https://github.com/j4tdn/java10-repository/commit/8b31cf357713741ae999415e7e4ded3a1a297810
	// Xem class ListsItem giúp a cách làm
	
	public List<ItemGroup3> Items() {
		List<ItemGroup3> result = new ArrayList<>();
		String sql = "SELECT lh.MaLoai, lh.TenLoai, mh.MaMH, mh.TenMH, mh.GiaBan, mh.GiaMua, kcmh.SoLuong \n"
				+ "FROM LoaiHang lh JOIN MatHang mh ON mh.MaLoai = lh.MaLoai \n"
				+ "JOIN KichCoMatHang kcmh ON mh.MaMH = kcmh.MaMH \n";
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				ItemGroup3 ig = new ItemGroup3(rs.getInt("MaLoai"), rs.getString("TenLoai"), rs.getInt("MaMH"), rs.getString("TenMH"), rs.getInt("GiaBan"), rs.getInt("GiaMua"), rs.getInt("SoLuong"));
				result.add(ig);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, st);
		}
		return result;
	}
	
	// Câu 3: 22đ
	// Em làm chính xác. Chỉ cố chỗ LIMIT 3 => Em nên để 3 là tham số truyền vào thay vì gán trực tiếp
	// Tên hàm. getItemsAsName || getItems
	public List<String> getTop(Integer year) {
		List<String> list = new ArrayList<>();
		String sql = "SELECT mh.MaMH,\r\n"
					+ "		mh.TenMH,\r\n"
					+ "        SUM(ctdh.SoLuong) SoLuong\r\n"
					+ "FROM mathang mh\r\n"
					+ "JOIN chitietdonhang ctdh\r\n"
					+ "	ON mh.MaMH = ctdh.MaMH\r\n"
					+ "JOIN donhang dh\r\n"
					+ "	ON dh.MaDH = ctdh.MaDH\r\n"
					+ "WHERE year(dh.ThoiGianDatHang) = ?\r\n"
					+ "GROUP BY mh.MaMH\r\n"
					+ "ORDER BY SoLuong DESC,	\r\n"
					+ "		mh.MaMH\r\n"
					+ "LIMIT 3;";
		try {
			pst = conn.prepareStatement(sql);
			pst.setInt(1, year);
			rs = pst.executeQuery();
			while (rs.next()) {
				list.add(rs.getString("TenMH"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
}
