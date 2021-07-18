package dao;

import static utils.SqlUtils.close;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connection.DbConnection;
import persistence.Items;
import persistence.ListItems;

public class ListItemDao {
	private Connection connection;
	private Statement st=null;
	private ResultSet rs = null;

	public ListItemDao() {
	} {
		connection = DbConnection.getConnection();
	}
	public List<ListItems> getListItems() {
		List<ListItems> result = new ArrayList<>();
		String sql = "SELECT lh.MaLoai,"
							 + "lh.TenLoai,\n"
							 + " mh.MaMH,\n"
							 + " mh.TenMH,\n"
							 + " mh.GiaBan,\n"
							 + " mh.GiaMua,\n"
							 + " kcmh.SoLuong\n"
							 + "FROM LoaiHang lh \n"
							 + "JOIN MatHang mh \n"
							 + "ON mh.MaLoai = lh.MaLoai\n"
							 + "JOIN KichCoMatHang kcmh \n"
							 + "ON mh.MaMH = kcmh.MaMH \n";
		try {
			st = connection.createStatement();
			rs = st.executeQuery(sql); 
			while (rs.next()) {
				ListItems listig = new ListItems(rs.getInt("MaLoai"), rs.getString("TenLoai")
							,rs.getInt("MaMH"),rs.getString("TenMH"),rs.getInt("GiaBan"),rs.getInt("GiaMua"),
							rs.getInt("SoLuong"));
				result.add(listig);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rs, st);
		}
		return result;
	}
}
