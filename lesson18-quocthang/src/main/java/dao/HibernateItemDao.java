package dao;

import java.sql.Date;
import java.util.List;

import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.StandardBasicTypes;

import persistence.ItemDto;

public class HibernateItemDao extends EntityDao implements ItemDao {

	private static final String GET_ITEM_DTOS = 
			"SELECT "
			+ " mh.MaMH AS  "        + ItemDto.ID   + ",\n"  + 
		      "       mh.TenMH AS "        + ItemDto.NAME + ",\n" + 
		      "       dh.ThoiGianDatHang AS " + ItemDto.TIME_ORDER +"\n" + 
		      "FROM MatHang mh\n" + 
		      "JOIN ChiTietDonHang  ctdh\n" + 
		      "  ON mh.MaMH = ctdh.MaMH\n" + 
		      "JOIN DonHang dh\n" + 
		      "  ON dh.MaDH = ctdh.MaDH\n" + 
		      "WHERE Date(dh.ThoiGianDatHang) = :orderTime";

	@SuppressWarnings("deprecation")
	public List<ItemDto> getDay(Date date) {
		NativeQuery<?> query = openSession().createNativeQuery(GET_ITEM_DTOS).setParameter("date", date, StandardBasicTypes.TIME);
		
		query.addScalar(ItemDto.ID, StandardBasicTypes.INTEGER)
			.addScalar(ItemDto.NAME, StandardBasicTypes.STRING)
			.addScalar(ItemDto.TIME_ORDER, StandardBasicTypes.TIME)
			.setResultTransformer(Transformers.aliasToBean(ItemDto.class));
		
		return safeList(query);
		
	}

}
