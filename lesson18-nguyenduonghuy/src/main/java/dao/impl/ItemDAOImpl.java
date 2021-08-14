package dao.impl;

import java.time.LocalDate;
import java.util.List;

import dao.EntityDAO;
import dao.ItemDAO;
import persistence.Item;

public class ItemDAOImpl extends EntityDAO implements ItemDAO{

	// Cau 4
	@Override
	public List<Item> getAll() {
		return openSession().createNativeQuery("SELECT mh.*\n"
											+ "FROM mathang mh\n"
											+ "JOIN loaihang lh\n"
											+ "	ON mh.MaLoai = lh.MaLoai\n"
											+ "JOIN kichcomathang kcmh\n"
											+ "	ON kcmh.MaMH = mh.MaMH\n"
											+ "GROUP BY mh.MaMH;", Item.class)
							.getResultList();
	}
	
	// Cau 3
	@Override
	public List<Item> getQuantity(int year, int limit) {
		return openSession().createNativeQuery("SELECT mh.*\n"
											+ "FROM mathang mh\n"
											+ "JOIN chitietdonhang ctdh\n"
											+ "	ON mh.MaMH = ctdh.MaMH\n"
											+ "JOIN donhang dh\n"
											+ "	ON dh.MaDH = ctdh.MaDH\n"
											+ "WHERE year(dh.ThoiGianDatHang) = :year\n"
											+ "GROUP BY mh.MaMH\n"
											+ "ORDER BY SoLuong DESC,	\n"
											+ "		mh.MaMH\n"
											+ "LIMIT " + limit +";", Item.class)
							.setParameter("year", year)
							.getResultList();
	}
	
	// Cau 1
	@Override
	public List<Item> get(LocalDate date) {
		return openSession().createNativeQuery("SELECT mh.*,\n"
											+ "		mh.*,\n"
											+ "     dh.* \n"
											+ "FROM mathang mh\n"
											+ "JOIN chitietdonhang ctdh\n"
											+ "	ON mh.MaMH = ctdh.MaMH\n"
											+ "JOIN donhang dh\n"
											+ "	ON dh.MaDH = ctdh.MaDH\n"
											+ "WHERE CAST(dh.ThoiGianDatHang AS DATE) = :date", Item.class)
							.setParameter("date", date)
							.getResultList();
	}
}
