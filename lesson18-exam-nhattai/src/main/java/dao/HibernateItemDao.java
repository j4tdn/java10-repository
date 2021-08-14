package dao;

import java.sql.Date;
import java.util.List;

import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.StandardBasicTypes;

import persistence.ItemDto;
import persistence.ListItemOfIGroupDto;

public class HibernateItemDao extends AbstracHibernateDao implements ItemDao {

	
	// 1. Liệt kê các mặt hàng được bán trong ngày 23-11-2019 kiểu LocalDate.
	private static final String GET_ITEM_DTOS = 
			"SELECT mh.MaMH AS  "   + ItemDto.ITEM_ID + ",\n" + "      "
					+ " mh.TenMH AS " + ItemDto.ITEM_NAME + ",\n" + "       "
					+ "dh.ThoiGianDatHang AS " + ItemDto.ORDER_TIME + "\n" + 
			"FROM MatHang mh\n" + "JOIN ChiTietDonHang  ctdh\n" + 
			"  ON mh.MaMH = ctdh.MaMH\n" + 
			"JOIN DonHang dh\n" + 
			"  ON dh.MaDH = ctdh.MaDH\n" + 
			"WHERE Date(dh.ThoiGianDatHang) = :orderDate";

	@SuppressWarnings("deprecation")
	public List<ItemDto> getItemDtos(Date orderDate) {
		NativeQuery<?> query = openSession().createNativeQuery(GET_ITEM_DTOS).setParameter("orderDate", orderDate);

		query.addScalar(ItemDto.ITEM_ID, StandardBasicTypes.INTEGER)
				.addScalar(ItemDto.ITEM_NAME, StandardBasicTypes.STRING)
				.addScalar(ItemDto.ORDER_TIME, StandardBasicTypes.TIME)
				.setResultTransformer(Transformers.aliasToBean(ItemDto.class));

		return safeList(query);
	}
	
	// 3. Liệt kê top 3 mặt hàng được bán nhiều nhất năm 2020. Với năm, limit là tham số truyền vào.
	private static final String GET_TOP_ITEM = 
			"SELECT mh.MaMH,\n"
					+ "mh.TenMH,\n"
					+ "        SUM(ctdh.SoLuong) SoLuong\n"
					+ "FROM mathang mh\n"
					+ "JOIN chitietdonhang ctdh\n"
					+ "	ON mh.MaMH = ctdh.MaMH\n"
					+ "JOIN donhang dh\n"
					+ "	ON dh.MaDH = ctdh.MaDH\n"
					+ "WHERE year(dh.ThoiGianDatHang) = :year\n"
					+ "GROUP BY mh.MaMH\n"
					+ "ORDER BY SoLuong DESC,	\n"
					+ "		mh.MaMH\n"
					+ "LIMIT  :limit";

	@SuppressWarnings("deprecation")
	@Override
	public List<String> getTopItem(Integer year, Integer limit) {
		NativeQuery<?> query = openSession().createNativeQuery(GET_TOP_ITEM).setParameter("year", year,StandardBasicTypes.INTEGER).setParameter("limit", limit,StandardBasicTypes.INTEGER);
		query.setResultTransformer(Transformers.TO_LIST);
		return safeList(query);
	}
	
	//4. Liệt kê danh sách các mặt hàng của mỗi loại hàng. 
	private static final String LIST_ITEM_BY_ID = 
			"SELECT lh.maLoai AS "+ ListItemOfIGroupDto.ID + ""
			+ ", lh.TenLoai AS "+ ListItemOfIGroupDto.NAME + ""
			+ ", mh.maMH AS "+ ListItemOfIGroupDto.ITEM_ID + ""
			+ ", mh.TenMH AS " + ListItemOfIGroupDto.ITEM_NAME + ""
			+ ", mh.GiaBan AS " + ListItemOfIGroupDto.PRICE + ""
			+ ", mh.GiaMua AS " + ListItemOfIGroupDto.PURCHAS_PRICE + ", " + 
			" SUM(kcmh.SoLuong) AS "
			+ ListItemOfIGroupDto.NUMBER
			+" FROM MatHang mh JOIN LoaiHang lh " + 
			" ON mh.MaLoai = lh.MaLoai JOIN KichCoMatHang kcmh  ON mh.MaMH = kcmh.MaMH " + 
			" GROUP BY mh.maLoai,mh.maMH"; 
	
	@SuppressWarnings("deprecation")
	@Override
	public List<ListItemOfIGroupDto> getListItemOfIGroupDto() {
		NativeQuery<?> query = openSession().createNativeQuery(LIST_ITEM_BY_ID);
			query.addScalar(ListItemOfIGroupDto.ID, StandardBasicTypes.INTEGER)
			     .addScalar(ListItemOfIGroupDto.NAME, StandardBasicTypes.STRING)
			     .addScalar(ListItemOfIGroupDto.ITEM_ID, StandardBasicTypes.INTEGER)
				 .addScalar(ListItemOfIGroupDto.ITEM_NAME, StandardBasicTypes.STRING)
				 .addScalar(ListItemOfIGroupDto.PRICE, StandardBasicTypes.DOUBLE)
				 .addScalar(ListItemOfIGroupDto.PURCHAS_PRICE, StandardBasicTypes.DOUBLE)
				 .addScalar(ListItemOfIGroupDto.NUMBER, StandardBasicTypes.INTEGER)
				 .setResultTransformer(Transformers.aliasToBean(ListItemOfIGroupDto.class));
		return safeList(query);
	}


}
