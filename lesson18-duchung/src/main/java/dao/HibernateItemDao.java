package dao;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.StandardBasicTypes;

import persistence.ItemDto;
import persistence.ItemTop3Dto;
import persistence.ListItemByGroudIdDto;

public class HibernateItemDao extends AbstractHibernateDao implements ItemDao {
	private static final String GET_ITEM_DTOS = "SELECT mh.MaMH as "+ItemDto.ITEM_ID+""
			+ ", mh.TenMH as "+ItemDto.ITEM_NAME+""
			+ ", dh.ThoiGianDatHang as "+ItemDto.ODER_TIME+" FROM MatHang mh"
			+ " JOIN ChiTietDonHang ctdh ON mh.MaMH = ctdh.MaMH JOIN DonHang dh "
			+ " ON dh.MaDH = ctdh.MaDH WHERE DATE(dh.ThoiGianDatHang) = :DATE";
	private static final String GET_ITEM_TOP3_BY_YEAR ="SELECT mh.TenMH as "+ItemTop3Dto.ITEM_NAME+",sum(ctdh.soluong) as TongSoLuong "  
			+ " FROM MatHang mh  JOIN ChiTietDonHang ctdh ON mh.MaMH = ctdh.MaMH JOIN DonHang dh ON dh.MaDH = ctdh.MaDH  "  
			+ " WHERE Year(dh.ThoiGianDatHang) = :year " + "GROUP BY mh.maMH ORDER BY TongSoLuong DESC " 
			+ " LIMIT 3 ";
	
	private static final String LIST_ITEM_BY_ID = "SELECT lh.maLoai as "+ListItemByGroudIdDto.ID+""
			+ ", lh.TenLoai as "+ListItemByGroudIdDto.NAME+""
			+ ", mh.maMH as "+ListItemByGroudIdDto.ITEM_ID+""
			+ ", mh.TenMH as "+ListItemByGroudIdDto.ITEM_NAME+""
			+ ", mh.GiaBan as "+ListItemByGroudIdDto.PRICE+""
			+ ", mh.GiaMua as "+ListItemByGroudIdDto.PURCHAS_PRICE+", " + 
			"	SUM(kcmh.SoLuong) as "+ListItemByGroudIdDto.NUMBER+" FROM MatHang mh JOIN LoaiHang lh " + 
			"	ON mh.MaLoai = lh.MaLoai JOIN KichCoMatHang kcmh  ON mh.MaMH = kcmh.MaMH " + 
			" GROUP BY mh.maLoai,mh.maMH"; 
	// 1. Liệt kê các mặt hàng được bán trong ngày 23-11-2019 kiểu LocalDate.
	@SuppressWarnings("deprecation")
	public List<ItemDto> getItemBySalesDate(LocalDate salesDate) {
		NativeQuery<?> query = openSession().createNativeQuery(GET_ITEM_DTOS)
				.setParameter("DATE",Date.valueOf(salesDate));
		   query.addScalar(ItemDto.ITEM_ID, StandardBasicTypes.INTEGER)
				.addScalar(ItemDto.ITEM_NAME, StandardBasicTypes.STRING)
				.addScalar(ItemDto.ODER_TIME,StandardBasicTypes.TIME)
				.setResultTransformer(Transformers.aliasToBean(ItemDto.class));
		return safeList(query);
	}
	// 3. Liệt kê top 3 mặt hàng được bán nhiều nhất năm 2020. Với năm là tham số truyền vào.
	@SuppressWarnings("deprecation")
	@Override
	public List<ItemTop3Dto> getItemTop3ByYear(Integer year) {
		NativeQuery<?> query = openSession().createNativeQuery(GET_ITEM_TOP3_BY_YEAR)
				.setParameter("year",year);
		   query.addScalar(ItemTop3Dto.ITEM_NAME, StandardBasicTypes.STRING)
				.setResultTransformer(Transformers.aliasToBean(ItemTop3Dto.class));
		return safeList(query);
	}
	//4. Liệt kê danh sách các mặt hàng của mỗi loại hàng. 
	@SuppressWarnings("deprecation")
	@Override
	public List<ListItemByGroudIdDto> getListItemByGroudIdDto() {
		NativeQuery<?> query = openSession().createNativeQuery(LIST_ITEM_BY_ID);
			query.addScalar(ListItemByGroudIdDto.ID, StandardBasicTypes.INTEGER)
			     .addScalar(ListItemByGroudIdDto.NAME, StandardBasicTypes.STRING)
			     .addScalar(ListItemByGroudIdDto.ITEM_ID, StandardBasicTypes.INTEGER)
				 .addScalar(ListItemByGroudIdDto.ITEM_NAME, StandardBasicTypes.STRING)
				 .addScalar(ListItemByGroudIdDto.PRICE, StandardBasicTypes.DOUBLE)
				 .addScalar(ListItemByGroudIdDto.PURCHAS_PRICE, StandardBasicTypes.DOUBLE)
				 .addScalar(ListItemByGroudIdDto.NUMBER, StandardBasicTypes.INTEGER)
				 .setResultTransformer(Transformers.aliasToBean(ListItemByGroudIdDto.class));
		return safeList(query);
	}

}
