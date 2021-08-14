package dao;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.StandardBasicTypes;

import persistence.Item;
import persistence.ItemDate;
import persistence.ItemDto;
import persistence.ItemSizeDto;

public class HibernateItemDao extends EntityDao implements ItemDao {

	// Cau 1
	private static final String GET_ITEMS_DATE = "SELECT mh.MaMH AS " + ItemDate.ID + ",\n" + "	   mh.TenMH AS "
			+ ItemDate.NAME + ",\n" + "     cast(dh.ThoiGianDatHang as time) AS " + ItemDate.TIME + "\n"
			+ "FROM mathang mh\n" + "JOIN chitietdonhang ctdh ON ctdh.MaMH=mh.MaMH\n"
			+ "JOIN donhang dh ON dh.MaDH= ctdh.MaDH\n" + "where cast(dh.ThoiGianDatHang as date)=:saleDate";

	@Override
	public List<ItemDate> getItemDate(LocalDate date) {

		Session session = openSession();
		NativeQuery<?> query = session.createNativeQuery(GET_ITEMS_DATE);

		query.setParameter("saleDate", date)
				.addScalar(ItemDate.ID, StandardBasicTypes.INTEGER).addScalar(ItemDate.NAME, StandardBasicTypes.STRING)
				.addScalar(ItemDate.TIME, StandardBasicTypes.TIME)
				.setResultTransformer(Transformers.aliasToBean(ItemDate.class));
		return safeList(query);

	}

	// Câu 3
	private static final String GET_Item_BESTSELLER = "SELECT mh.MaMH AS " + ItemDto.IT_ID + ",\n"
			+ "	   	  mh.TenMH AS " + ItemDto.IT_NAME + ",\n" + "       SUM(ctdh.SoLuong) AS "
			+ ItemDto.TotalAmount_ITEMS + "\n" + "       FROM mathang mh\n"
			+ "		  JOIN chitietdonhang ctdh ON mh.MaMH=ctdh.MaMH\n"
			+ "		  JOIN donhang dh ON ctdh.MaDH=dh.MaDH\n"
			+ "		  WHERE year(dh.ThoiGianDatHang) = : ordertime \n" + "        GROUP BY mh.MaMH" + "		  ORDER BY "
			+ ItemDto.TotalAmount_ITEMS + " DESC\n" + "		  LIMIT = : limit";

	@Override
	public List<String> getItemBestSeller(int year, int top) {

		Session session = openSession();
		NativeQuery<?> query = session.createNativeQuery(GET_Item_BESTSELLER);
		query.setParameter("ordertime", year)
		.setParameter("limit", top)
		.addScalar(ItemDto.IT_NAME, StandardBasicTypes.STRING)
		.setResultTransformer(Transformers.aliasToBean(ItemDto.class));
		
		return safeList(query);
	}

	// Câu 4
	private static final String Q_GET_ALL = "SELECT lh.MaLoai AS " + ItemSizeDto.IG_ID + ",\n" + "	   lh.TenLoai AS "
			+ ItemSizeDto.IG_NAME + ",\n" + "       mh.MaMH AS " + ItemSizeDto.IT_ID + ",\n" + "       mh.TenMH AS "
			+ ItemSizeDto.IT_NAME + ",\n" + "       mh.GiaBan AS " + ItemSizeDto.SALE + ",\n" + "       mh.GiaMua AS "
			+ ItemSizeDto.BUY + ",\n" + "       kcmh.SoLuong AS " + ItemSizeDto.Total_Amount + "\n"
			+ " FROM mathang mh\n" + "JOIN loaihang lh ON lh.MaLoai=mh.MaLoai\n"
			+ "JOIN kichcomathang kcmh ON mh.MaMH=kcmh.MaMH;";

	@Override
	public List<ItemSizeDto> getItemByGroup() {
		Session session = openSession();
		NativeQuery<?> query = session.createNativeQuery(Q_GET_ALL);
		query.addScalar(ItemSizeDto.IG_ID, StandardBasicTypes.INTEGER)
				.addScalar(ItemSizeDto.IG_NAME, StandardBasicTypes.STRING)
				.addScalar(ItemSizeDto.IT_ID, StandardBasicTypes.INTEGER)
				.addScalar(ItemSizeDto.IT_NAME, StandardBasicTypes.STRING)
				.addScalar(ItemSizeDto.SALE, StandardBasicTypes.DOUBLE)
				.addScalar(ItemSizeDto.BUY, StandardBasicTypes.DOUBLE)
				.addScalar(ItemSizeDto.Total_Amount, StandardBasicTypes.INTEGER)
				.setResultTransformer(Transformers.aliasToBean(ItemSizeDto.class));
		return safeList(query);
	}

}
