package dao;

import java.time.LocalDate;
import java.util.List;

import persistence.Item;

public class HibernateItemDao extends EntityDao implements ItemDao {

	// Question1
	@Override
	public List<Item> getItem(LocalDate date) {
		return openSession().createNativeQuery(
				"SELECT mh.MaMH, mh.TenMH, cast(dh.thoigiandathang AS TIME) AS ThoiGianDatHang FROM MatHang mh\r\n"
						+ "JOIN ChiTietDonHang ctdh\r\n" + " ON mh.MaMH = ctdh.MaMH\r\n" + "JOIN DonHang dh \r\n"
						+ " ON ctdh.MaDH = dh.MaDH\r\n" + " WHERE cast(dh.thoigiandathang AS DATE) = :date",
				Item.class).setParameter("date", date).getResultList();
	}

	// Question 4:
	@Override
	public List<Item> getAll() {
		return openSession().createNativeQuery(
				"SELECT lh.MaLoai, lh.TenLoai, mh.MaMH, mh.TenMH, mh.GiaBan, mh.GiaMua, kcmh.Soluong FROM loaihang lh\r\n"
						+ "JOIN mathang mh\r\n" + "ON lh.MaLoai = mh.MaLoai\r\n" + "JOIN kichcomathang kcmh\r\n"
						+ "ON mh.MaMH = kcmh.MaMH",
				Item.class).getResultList();
	}

	// Question3:
	@Override
	public List<Item> getTopItems(Integer year, Integer limit) {
		return openSession().createNativeQuery(
				"SELECT mh.MaMH, mh.TenMH, ctdh.SoLuong FROM mathang mh\r\n" + "JOIN chitietdonhang ctdh\r\n"
						+ "ON mh.MaMH = ctdh.MaDH\r\n" + "JOIN donhang dh\r\n" + "ON ctdh.MaDH = dh.MaDH\r\n"
						+ "WHERE year(dh.thoigiandathang) = :year \r\n" + "ORDER BY SoLuong DESC LIMIT :limit",
				Item.class).setParameter("year", year).setParameter("limit", limit).getResultList();
	}

}
