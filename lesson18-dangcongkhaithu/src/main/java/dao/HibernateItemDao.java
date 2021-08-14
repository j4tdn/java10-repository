package dao;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.StandardBasicTypes;

import persistence.Item;
import persistence.ItemDto;
import persistence.ItemDtoAmount;
import persistence.ItemGroupDto;

public class HibernateItemDao extends EntityDao implements ItemDao {
	
			
	public List<Item> getAll() {
		return openSession().createNativeQuery("SELECT * FROM MatHang", Item.class)
	            .getResultList();
	}

	@SuppressWarnings("deprecation")
	@Override
	public List<ItemDto> getItemDtos(LocalDate date) {
		 String GET_ITEM_DTOS = "SELECT mh.MaMH AS " + ItemDto.ID + ",\n"
				 + "mh.TenMH AS " + ItemDto.NAME + ",\n"
				 + "CAST(dh.ThoiGianDatHang AS TIME) AS " + ItemDto.TIME + "\n"
				 + "FROM mathang mh\n"
					+ "JOIN chitietdonhang ctdh\n"
					+ "	ON mh.MaMH = ctdh.MaMH\n"
					+ "JOIN donhang dh\n"
					+ "	ON dh.MaDH = ctdh.MaDH\n"
					+ "WHERE CAST(dh.ThoiGianDatHang AS DATE) = " + date + "";
		 
		 NativeQuery<?> query = openSession().createNativeQuery(GET_ITEM_DTOS);

		query.addScalar(ItemDto.ID, StandardBasicTypes.INTEGER)
					.addScalar(ItemDto.NAME, StandardBasicTypes.STRING)
					.addScalar(ItemDto.TIME, StandardBasicTypes.TIME)
					.setResultTransformer(Transformers.aliasToBean(ItemDto.class));

		return safeList(query);
		
	}

	@SuppressWarnings("deprecation")
	@Override
	public List<ItemDtoAmount> getTopThree(int year) {
		String GET_ITEM_DTOS = "SELECT mh.MaMH AS " + ItemDtoAmount.ID + ",\n"
				+ "		mh.TenMH AS " + ItemDtoAmount.NAME +  ",\n"
				+ "        SUM(ctdh.SoLuong) AS " + ItemDtoAmount.TOTAL_AMOUNT + ",\n"
				+ "FROM mathang mh\n"
				+ "JOIN chitietdonhang ctdh\n"
				+ "	ON mh.MaMH = ctdh.MaMH\n"
				+ "JOIN donhang dh\n"
				+ "	ON dh.MaDH = ctdh.MaDH\r\n"
				+ "WHERE year(dh.ThoiGianDatHang) = " + year + "\n"
				+ "GROUP BY mh.MaMH\n"
				+ "ORDER BY SoLuong DESC, \n"
				+ "		mh.MaMH\n"
				+ "LIMIT 3;";
		
		NativeQuery<?> query = openSession().createNativeQuery(GET_ITEM_DTOS);

		query.addScalar(ItemDtoAmount.ID, StandardBasicTypes.INTEGER)
					.addScalar(ItemDtoAmount.NAME, StandardBasicTypes.STRING)
					.addScalar(ItemDtoAmount.TOTAL_AMOUNT, StandardBasicTypes.INTEGER)
					.setResultTransformer(Transformers.aliasToBean(ItemDtoAmount.class));

		return safeList(query);
	}

}
