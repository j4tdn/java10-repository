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
import persistence.Items;
import persistence.ListItem;
import utils.SqlUtils;

public class ItemGroupDao {
	private Connection conn;
	private Statement st;
	private ResultSet rs;

	public ItemGroupDao() {
		conn = DbConnection.getConnection();
	}

	public List<ItemGroup> getItemToDay(Date date) {
		List<ItemGroup> result = new ArrayList<>();

		String sql = "select mh.MaMH, mh.TenMH, dh.thoigiandathang " + "from mathang mh " + "join chitietdonhang ctdh "
				+ "on mh.MaMH = ctdh.MaMH " + "join donhang dh " + "on dh.MaDH = ctdh.MaDH "
				+ "where date(dh.thoigiandathang) = '" + date + "'";

		try {
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

	public List<String> getItem() {
		List<String> listItems = new ArrayList<>();
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
