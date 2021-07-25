package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import connection.DatabaseConnection;
import persistence.ItemDto;
import persistence.ItemDtoFullInfo;

public class ItemDao {
	private Connection conn;
	private PreparedStatement pst;
	private ResultSet rs;
	
	public ItemDao() {
		conn =  DatabaseConnection.getConnection();
	}
	
	// Câu 1: 22 (A trừ điểm vì dùng getInt(1), getString(2))
	// Tên hàm: getItemDtos
	// Trong hàm em truyền vào date thì biết là bydate rồi
	public List<ItemDto> getItemDtoByDate(LocalDate date) {
		List<ItemDto> list = new ArrayList<>();
		String sql = "SELECT mh.MaMH,\r\n"
					+ "		mh.TenMH,\r\n"
					+ "        CAST(dh.ThoiGianDatHang AS TIME) ThoiGianDatHang\r\n"
					+ "FROM mathang mh\r\n"
					+ "JOIN chitietdonhang ctdh\r\n"
					+ "	ON mh.MaMH = ctdh.MaMH\r\n"
					+ "JOIN donhang dh\r\n"
					+ "	ON dh.MaDH = ctdh.MaDH\r\n"
					+ "WHERE CAST(dh.ThoiGianDatHang AS DATE) = ?;";
		try {
			pst = conn.prepareStatement(sql);
			pst.setDate(1, Date.valueOf(date));
			rs = pst.executeQuery();
			while (rs.next()) {
				// Không nên, không được dùng getInt, String truyền vào STT như vậy
				// A nói lúc làm rồi. TH có > 20columns lấy về mà code như này thì không được
				ItemDto item = new ItemDto(rs.getInt(1), rs.getString(2), LocalTime.parse(rs.getString(3)));
				list.add(item);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rs, pst);
		}
		return list;
	}
	
	// Câu 3: 20đ
	// Tên hàm: getTopItems >> Còn 3 là tham số truyền vào
	// year dùng int được rồi
	public List<String> getTop3Item(Integer year) {
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
					// Nên là tham số truyền vào
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
	
	// Câu 3: 22đ
	// Tương tự review của những bạn khác nên em nhờ a đọc code bên bạn a đã review rồi giúp a
	// A khỏi copy qua đây nha
	// https://github.com/j4tdn/java10-repository/commit/8b31cf357713741ae999415e7e4ded3a1a297810 >> class ListItems
	public List<ItemDtoFullInfo> getFullInfo() {
		List<ItemDtoFullInfo> list = new ArrayList<>();
		String sql = "SELECT lh.MaLoai,\r\n"
					+ "		lh.TenLoai,\r\n"
					+ "        mh.MaMH,\r\n"
					+ "        mh.TenMH,\r\n"
					+ "        mh.GiaBan,\r\n"
					+ "        mh.GiaMua,\r\n"
					+ "        SUM(kcmh.Soluong) SoLuong\r\n"
					+ "FROM mathang mh\r\n"
					+ "JOIN loaihang lh\r\n"
					+ "	ON mh.MaLoai = lh.MaLoai\r\n"
					+ "JOIN kichcomathang kcmh\r\n"
					+ "	ON kcmh.MaMH = mh.MaMH\r\n"
					+ "GROUP BY mh.MaMH;";
		try {
			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();
			while (rs.next()) {
				ItemDtoFullInfo item = new ItemDtoFullInfo(rs.getInt(1), rs.getString(2), 
															rs.getInt(3), rs.getString(4), 
															rs.getInt(5), rs.getInt(6), rs.getInt(7));
				list.add(item);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rs, pst);
		}
		return list;
	}
	
	private void close(AutoCloseable ...autoCloseables) {
		for (AutoCloseable autoCloseable : autoCloseables) {
			try {
				if (autoCloseable != null) {
					autoCloseable.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
