package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connection.DatabaseConnection;
import persistence.ItemGroupDto;

public class ItemGroupDao {
	private Connection conn;
	private PreparedStatement pst;
	private ResultSet rs;
	
	public ItemGroupDao() {
		conn = DatabaseConnection.getConnection();
	}
	
	public List<ItemGroupDto> getAllItemGroupDto() {
		List<ItemGroupDto> list = new ArrayList<>();
		String sql = "SELECT lh.MaLoai,\r\n"
					+ "		lh.TenLoai,\r\n"
					+ "        SUM(kcmh.Soluong)\r\n"
					+ "FROM loaihang lh\r\n"
					+ "JOIN mathang mh\r\n"
					+ "	ON mh.MaLoai = lh.MaLoai\r\n"
					+ "JOIN kichcomathang kcmh\r\n"
					+ "	ON kcmh.MaMH = mh.MaMH\r\n"
					+ "GROUP BY lh.MaLoai;";
		try {
			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();
			while (rs.next()) {
				ItemGroupDto igr =  new ItemGroupDto(rs.getInt(1), rs.getString(2), rs.getInt(3));
				list.add(igr);
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
