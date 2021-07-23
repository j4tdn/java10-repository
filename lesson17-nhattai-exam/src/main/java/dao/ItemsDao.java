package dao;

import static utils.SqlUtils.close;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connection.DbConnection;
import persistence.Items;

// ClassName: "ItemDao" thôi em nha
// Có khi cũng Items. Nhưng trường hợp này của mình
// Mỗi phần tử là 1 Item nên e đặt Item là được rồi

// Items là class Items có chứa nhiều thuộc tính Item bên trong
public class ItemsDao {
	private Connection connection;
	private PreparedStatement pst = null;
	private ResultSet rs = null;

	public ItemsDao() {
		connection = DbConnection.getConnection();
	}

	// Câu 1: POINT: 25
	// orderTime là kiểu java.sql.Date
	// java.sql.Date chỉ chứa ngày tháng năm đúng yêu cầu
	// Còn nếu java.util.Date thì chứa luôn ngày tháng năm giờ phút giây là sai
	// Câu này em code đúng rồi. Sửa convention thôi
	
	// orderTime -> orderDate
	public List<Items> getItems(Date orderTime) {
		List<Items> result = new ArrayList<>();
		String sql = "SELECT mh.MaMH, mh.TenMH, dh.ThoiGianDatHang \n"
				+ "FROM MatHang mh JOIN ChiTietDonHang ctdh ON mh.MaMH = ctdh.MaMH \n"
				+ "JOIN DonHang dh ON dh.MaDH = ctdh.MaDH \n" + "WHERE DATE(dh.ThoiGianDatHang) = ?";
		try {
			pst = connection.prepareStatement(sql);
			pst.setDate(1, orderTime);
			rs = pst.executeQuery();
			while (rs.next()) {
				Items items = new Items(rs.getInt("MaMH"), rs.getString("TenMH"), rs.getTime("ThoiGianDatHang"));
				result.add(items);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pst);
		}
		return result;
	}
	
	// Câu 3: Great: POINT 25
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
					+ "LIMIT 3;";
		try {
			pst = connection.prepareStatement(sql);
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
