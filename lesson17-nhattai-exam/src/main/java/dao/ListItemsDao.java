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
import persistence.ListItems;

public class ListItemsDao {
	private Connection connection;
	private PreparedStatement pst = null;
	private ResultSet rs = null;

	public ListItemsDao() {
		connection = DbConnection.getConnection();
	}

	// POINT: 20
	// Câu 4: Kết quả chính xác nhưng có thể code đẹp hơn
	// A review trong class ListItems. Xem ở đó nha
	public List<ListItems> getListItems() {
		List<ListItems> result = new ArrayList<>();
		String sql = "SELECT lh.MaLoai, lh.TenLoai, mh.MaMH, mh.TenMH, mh.GiaBan, mh.GiaMua, kcmh.SoLuong \n"
				+ "FROM LoaiHang lh JOIN MatHang mh ON mh.MaLoai = lh.MaLoai \n"
				+ "JOIN KichCoMatHang kcmh ON mh.MaMH = kcmh.MaMH \n";
		try {
			pst = connection.prepareStatement(sql);
			rs = pst.executeQuery();
			while (rs.next()) {
				ListItems items = new ListItems(rs.getInt("MaLoai"), rs.getString("TenLoai"), rs.getInt("MaMH"),
						rs.getString("TenMH"), rs.getInt("GiaBan"), rs.getInt("GiaMua"), rs.getInt("SoLuong"));
				result.add(items);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pst);
		}
		return result;
	}
}
