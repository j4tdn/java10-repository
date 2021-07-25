package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import connection.DbConnection;
import persistence.CategoryGroup;
import persistence.ItemGroup;
import persistence.ItemSaleGroup;
import persistence.ItemTop;
import utils.SqlUtils;

public class ItemGroupDao {

	private Connection conn;
	private Statement st;
	private PreparedStatement pst;
	private ResultSet rs;

	public ItemGroupDao() {
		conn = DbConnection.getConnection();
	}
	
	// Câu 1: 25đ
	// Bài làm tốt
	public List<ItemSaleGroup> getItemSale(LocalDate dateSale) {
		// Chuyển compiler sang JDK 1.7 => Xóa cái ItemSaleGroup phía sau
		// List<T> result = new ArrayList<>();
		List<ItemSaleGroup> result = new ArrayList<ItemSaleGroup>();
		String sql = "SELECT mh.MaMH,\r\n"
				+ "		mh.TenMH,\r\n"
				+ "		dh.ThoiGianDatHang\r\n"
				+ "FROM MatHang mh\r\n"
				+ "JOIN chitietdonhang ctdh\r\n"
				+ "	ON mh.MaMH = ctdh.MaMH\r\n"
				+ "JOIN DonHang dh\r\n"
				+ "	ON dh.MaDH = ctdh.MaDH\r\n"
				// Hàm date(..) này cho ép kiểu từ DateTime về Date hả Quốc ?
				// Em thử chạy và kết quả giốn với cast(dh.ThoiGianDatHang as DATE) không ?
				+ "WHERE DATE(dh.ThoiGianDatHang) = ?";

		try {
			pst = conn.prepareStatement(sql);
			pst.setDate(1, Date.valueOf(dateSale));
			rs = pst.executeQuery();
			while (rs.next()) {
				ItemSaleGroup isg = new ItemSaleGroup(rs.getInt("MaMH"), rs.getString("TenMH"), rs.getTime("ThoiGianDatHang"));
				result.add(isg);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, pst);
		}
		return result;
	}
	
	// Câu 2: 25đ
	// Bài làm tốt rồi e nha như các đặt tên class trả về chưa được hay lắm
	// Đặt tên biến, class trong code là rất khó. Nên suy nghĩ các đặt chính xác nha
	public List<CategoryGroup> getToTalCategorys() {
		// Compiler 1.7 tương tự review ở trên
		List<CategoryGroup> result = new ArrayList<CategoryGroup>();
		String sql = "SELECT lh.*,\r\n"
				+ "		Sum(kcmh.Soluong) as SoLuong\r\n"
				+ "FROM LoaiHang lh\r\n"
				+ "JOIN MatHang mh\r\n"
				+ "	ON mh.MaLoai = lh.MaLoai\r\n"
				+ "JOIN kichcomathang kcmh\r\n"
				+ "	ON kcmh.MaMH = mh.MaMH\r\n"
				+ "GROUP BY MaLoai;";
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);

			while (rs.next()) {
				CategoryGroup cg = new CategoryGroup(rs.getInt("MaLoai"), rs.getString("TenLoai"), rs.getInt("SoLuong"));
				result.add(cg);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, st);
		}
		return result;
	}
	
	// Câu 3: 10đ
	// Em hiểu sai đề
	// Tìm top 3 MatHang có số lượng báo nhiều nhất
	// MatHang-ChiTietDonHang-DonHang và GROUP BY theo MaMH mới đúng
	// Còn em group by theo MaLoai là top 3 loại hàng rồi
	public List<ItemTop> getTopItemInYear() {
		List<ItemTop> result = new ArrayList<ItemTop>();
		String sql = 
				"SELECT lh.*,\r\n"
				+ "		mh.MaMH,\r\n"
				+ "		mh.TenMh,\r\n"
				+ "        mh.GiaBan,\r\n"
				+ "		mh.GiaMua,\r\n"
				+ "		kcmh.Soluong\r\n"
				+ "FROM LoaiHang lh\r\n"
				+ "JOIN MatHang mh\r\n"
				+ "	ON mh.MaLoai = lh.MaLoai\r\n"
				+ "JOIN kichcomathang kcmh\r\n"
				+ "	ON kcmh.MaMH = mh.MaMH\r\n"
				+ "JOIN chitietdonhang ctdh\r\n"
				+ "	ON ctdh.MaMH = kcmh.MaMh\r\n"
				+ "JOIN DonHang dh\r\n"
				+ "	ON dh.MaDH = ctdh.MaDH\r\n"
				+ "WHERE Year(dh.ThoiGianDatHang) = 2020\r\n"
				+ "GROUP BY MaLoai\r\n"
				+ "ORDER BY kcmh.Soluong DESC\r\n"
				+ "LIMIT 3;";
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);

			while (rs.next()) {
				ItemTop it = new ItemTop(rs.getString("TenMh"));
				result.add(it);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, st);
		}
		return result;
	}
	
	// Câu 3: 25đ
	// Tương tự review của những bạn khác nên em nhờ a đọc code bên bạn a đã review rồi giúp a
	// A khỏi copy qua đây nha
	// https://github.com/j4tdn/java10-repository/commit/8b31cf357713741ae999415e7e4ded3a1a297810 >> class ListItems
	public List<ItemGroup> getAllItems() {
		List<ItemGroup> result = new ArrayList<ItemGroup>();
		String sql = "SELECT lh.*,\r\n"
				+ "		mh.MaMH,\r\n"
				+ "		mh.TenMh,\r\n"
				+ "        mh.GiaBan,\r\n"
				+ "		mh.GiaMua,\r\n"
				+ "		kcmh.Soluong\r\n"
				+ "FROM LoaiHang lh\r\n"
				+ "JOIN MatHang mh\r\n"
				+ "	ON mh.MaLoai = lh.MaLoai\r\n"
				+ "JOIN kichcomathang kcmh\r\n"
				+ "	ON kcmh.MaMH = mh.MaMH\r\n"
				+ "GROUP BY TenMH;";
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);

			while (rs.next()) {
				ItemGroup ig = new ItemGroup(rs.getInt("MaLoai"), rs.getString("TenLoai"), rs.getInt("MaMH"),rs.getString("TenMH"), rs.getInt("GiaBan"), rs.getInt("GiaMua"), rs.getInt("SoLuong"));
				result.add(ig);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, st);
		}
		return result;
	}

}
