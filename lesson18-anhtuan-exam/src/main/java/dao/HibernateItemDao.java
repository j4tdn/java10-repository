package dao;

import java.sql.Date;
import java.util.List;

import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.StandardBasicTypes;

import persistence.ItemDto;

public class HibernateItemDao extends EntityDao implements ItemDao {

	// 1111111
	private static final String GET_ITEM_DTOS = 
			"SELECT mh.MaMH AS  "        	+ ItemDto.ID   + ",\n"  + 
            "       mh.TenMH AS "        	+ ItemDto.NAME + ",\n" + 
            "       dh.ThoiGianDatHang AS " + ItemDto.TIME_ORDER +"\n" + 
            "FROM MatHang mh\n" + 
            "JOIN ChiTietDonHang  ctdh\n" + 
            "  ON mh.MaMH = ctdh.MaMH\n" + 
            "JOIN DonHang dh\n" + 
            "  ON dh.MaDH = ctdh.MaDH\n" + 
            "WHERE Date(dh.ThoiGianDatHang) = :date";

	@SuppressWarnings("deprecation")
	public List<ItemDto> getDayDtos(Date date) {
		NativeQuery<?> query = openSession().createNativeQuery(GET_ITEM_DTOS).setParameter("date", date,
				StandardBasicTypes.TIME);

		query.addScalar(ItemDto.ID, StandardBasicTypes.INTEGER)
				.addScalar(ItemDto.NAME, StandardBasicTypes.STRING)
				.addScalar(ItemDto.TIME_ORDER, StandardBasicTypes.TIME)
				.setResultTransformer(Transformers.aliasToBean(ItemDto.class));

		return safeList(query);
	}

	//3333333333333
	@Override
	public List<String> getTop(Integer year, Integer limit) {
		return openSession().createNativeQuery("SELECT mh.MaMH,\r\n"
					+ "		mh.TenMH,\r\n"
					+ "        SUM(ctdh.SoLuong) SoLuong\r\n"
					+ "FROM mathang mh\r\n"
					+ "JOIN chitietdonhang ctdh\r\n"
					+ "	ON mh.MaMH = ctdh.MaMH\r\n"
					+ "JOIN donhang dh\r\n"
					+ "	ON dh.MaDH = ctdh.MaDH\r\n"
					+ "WHERE year(dh.ThoiGianDatHang) = :date\r\n"
					+ "GROUP BY mh.MaMH\r\n"
					+ "ORDER BY SoLuong DESC,	\r\n"
					+ "		mh.MaMH\r\n"
					+ "LIMIT :limit").setParameter("date", year,
							StandardBasicTypes.INTEGER).setParameter("limit", limit,
									StandardBasicTypes.INTEGER).setResultTransformer(Transformers.TO_LIST).getResultList();
	}

}
