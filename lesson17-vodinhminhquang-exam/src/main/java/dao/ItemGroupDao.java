package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import connection.DbConnetion;
import persistence.Item;
import persistence.ItemGroup;
import persistence.ItemGroupStorage;
import persistence.ItemGroupTime;
import utils.SqlUtils;

public class ItemGroupDao {

	private Connection myConn;
	private Statement stmt;
	private PreparedStatement preStmt;
	private ResultSet rs;

	public ItemGroupDao() {
		myConn = DbConnetion.getConnection();
	}

	public List<ItemGroup> getAll() {
		List<ItemGroup> result = new ArrayList<>();
		String sql = "SELECT lh.MaLoai, lh.TenLoai, mh.MaMH, mh.TenMH, mh.GiaBan, mh.GiaMua, kcmh.Soluong FROM loaihang lh\r\n"
				+ "JOIN mathang mh\r\n" + "ON lh.MaLoai = mh.MaLoai\r\n" + "JOIN kichcomathang kcmh\r\n"
				+ "ON mh.MaMH = kcmh.MaMH;";

		try {
			stmt = myConn.createStatement();
			rs = stmt.executeQuery(sql);

			while (rs.next()) {

				ItemGroup temp = new ItemGroup(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4),
						rs.getInt(5), rs.getInt(6), rs.getInt(7));

				result.add(temp);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, stmt);
		}

		return result;
	}

	public List<Item> getTopItems() {
		List<Item> result = new ArrayList<>();
		String sql = "SELECT mh.MaMH, mh.TenMH, sum(ctdh.SoLuong) AS SoLuong, dh.ThoiGianDatHang FROM mathang mh\r\n"
				+ "JOIN chitietdonhang ctdh\r\n" + "ON mh.MaMH = ctdh.MaMH\r\n" + "JOIN donhang dh\r\n"
				+ "ON ctdh.MaDH = dh.MaDH\r\n" + "WHERE year('2020-01-01')\r\n" + "GROUP BY mh.MaMH\r\n"
				+ "ORDER BY SoLuong DESC LIMIT 3";
		try {
			stmt = myConn.createStatement();
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				Item temp = new Item(rs.getString("TenMH"));
				result.add(temp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, stmt);
		}

		return result;
	}

	public List<ItemGroupStorage> getItemsInStorage() {
		List<ItemGroupStorage> result = new ArrayList<>();
		String sql = "SELECT lh.MaLoai, lh.TenLoai, sum(kcmh.Soluong) AS SoLuong FROM loaihang lh\r\n"
				+ "JOIN mathang mh\r\n" + "ON lh.MaLoai = mh.MaLoai\r\n" + "JOIN kichcomathang kcmh\r\n"
				+ "ON mh.MaMH = kcmh.MaMH\r\n" + "GROUP BY lh.MaLoai";

		try {
			stmt = myConn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				ItemGroupStorage temp = new ItemGroupStorage(rs.getInt("MaLoai"), rs.getString("TenLoai"),
						rs.getInt("SoLuong"));
				result.add(temp);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, stmt);
		}
		return result;
	}

	public List<ItemGroupTime> getItemInDay(LocalDate date) {
		List<ItemGroupTime> result = new ArrayList<>();

		String sql = "SELECT mh.MaMH, mh.TenMH, cast(dh.ThoiGianDatHang AS TIME) AS ThoiGianDatHang\r\n"
				+ "FROM mathang mh\r\n" + "JOIN chitietdonhang ctdh\r\n" + "ON mh.MaMH = ctdh.MaMH	\r\n"
				+ "JOIN donhang dh\r\n" + "ON ctdh.MaDH = dh.MaDH\r\n" + "WHERE cast(dh.ThoiGianDatHang AS DATE) = ?;";

		try {
			preStmt = myConn.prepareStatement(sql);
			preStmt.setDate(1, Date.valueOf(date));
			rs = preStmt.executeQuery();

			while (rs.next()) {
				ItemGroupTime temp = new ItemGroupTime(rs.getInt("MaMH"), rs.getString("TenMH"),
						LocalTime.parse(rs.getString("ThoiGianDatHang")));

				result.add(temp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, preStmt);
		}
		return result;
	}

}
