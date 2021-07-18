package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import connection.DBConnection;
import entities.Item;
import utils.DateUtils;

public class ItemDao {
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;

	public ItemDao() {
	}

	public List<Item> getItemBySaleOut(LocalDate date) {
		List<Item> results = new ArrayList<Item>();
		String query = "select mh.MaMH, mh.TenMH, dh.ThoiGianDatHang from MatHang mh join ChitietDonhang ctdh on mh.MaMH = ctdh.MaMH join DonHang dh on ctdh.MaDH = dh.MaDH\r\n"
				+ "where dh.ThoiGianDatHang like '?%';";

		con = DBConnection.getConnection();
		try {
			ps = con.prepareStatement(query);
			ps.setDate(1, (Date) DateUtils.convertToDate(date));
			rs = ps.executeQuery();
			while (rs.next()) {
				Item item = new Item();
				item.setId(rs.getInt("MaMH"));
				item.setName(rs.getString("TenMH"));
				item.setOrderTimne(DateUtils.convertToDate(rs.getDate("ThoiGianDathang")));

				results.add(item);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return results;
	}

	public List<String> getItemByAmount(int year) {
		List<String> items = new ArrayList<String>();
		String query = "select mh.TenMH from MatHang mh join  ChiTietDonHang ctdh on mh.MaMH = ctdh.MaMH join DonHang dh on dh.MaDH = ctdh.MaDH\r\n"
				+ "where dh.ThoiGianDatHang like '%?%'\r\n" + "order by ctdh.SoLuong desc\r\n" + "limit 3;";

		try {
			ps = con.prepareStatement(query);
			ps.setInt(1, year);
			rs = ps.executeQuery();
			while (rs.next()) {
				String itemName = rs.getString("TenMH");
				items.add(itemName);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return items;
	}

}
