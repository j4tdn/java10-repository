package dao;

import java.sql.Date;
import java.util.List;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;
import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.StandardBasicTypes;

import persistence.ItemDto;
import persistence.ItemmDto;
import persistence.ItemDto;

public class HibernateItemDao extends EntityDao implements ItemDao{
	//Câu 4
	private static final String GET_ITEM=
			"SELECT lh.MaLoai AS "+ ItemDto.ID_ITEMGROUP+  ", \n"
			+ "	    lh.TenLoai AS"+ ItemDto.NAME_ITEMGROUP+", \n"
			+ "     mh.MaMH AS"+    ItemDto.ID_ITEM+", \n"
			+ "     mh.TenMH AS"+   ItemDto.NAME_ITEM+",\n"
			+ "     mh.GiaBan AS"+  ItemDto.SALES_OUT+",\n"
			+ "	    mh.GiaMua AS"+  ItemDto.SALES_IN+",\n"
			+ "     kcmh.SoLuong AS"+ ItemDto.TOTAL_AMOUNT+"\n"
			+ "FROM LoaiHang lh \n"
			+ "JOIN MatHang mh\n"
			+ "ON mh.MaLoai = lh.MaLoai \n"
			+ "JOIN KichCoMatHang kcmh \n"
			+ "ON mh.MaMH = kcmh.MaMH";
	
	
	
	//Câu1
	private static final String GET_ITEM_DTOS = 
			"SELECT mh.MaMH AS  "+ ItemmDto.ID   + ",\n"  + 
            "       mh.TenMH AS "+ ItemmDto.NAME + ",\n" + 
            "       dh.ThoiGianDatHang AS " + ItemmDto.TIME_ORDER +"\n" + 
            "FROM MatHang mh\n" + 
            "JOIN ChiTietDonHang  ctdh\n" + 
            "  ON mh.MaMH = ctdh.MaMH\n" + 
            "JOIN DonHang dh\n" + 
            "  ON dh.MaDH = ctdh.MaDH\n" + 
            "WHERE Date(dh.ThoiGianDatHang) = :date";
	
	@Override
	public List<ItemmDto> getDayDtos(Date date) {
		NativeQuery<?> query = openSession().createNativeQuery(GET_ITEM_DTOS).setParameter("date", date,
                StandardBasicTypes.TIME);

        query.addScalar(ItemmDto.ID, StandardBasicTypes.INTEGER)
                .addScalar(ItemmDto.NAME, StandardBasicTypes.STRING)
                .addScalar(ItemmDto.TIME_ORDER, StandardBasicTypes.TIME)
                .setResultTransformer(Transformers.aliasToBean(ItemmDto.class));

        return safeList(query);
	}
	@Override
	public List<ItemDto> get() {
		
		NativeQuery<?> query = openSession().createNativeQuery(GET_ITEM);
		query.addScalar(ItemDto.ID_ITEMGROUP, StandardBasicTypes.INTEGER)
			 .addScalar(ItemDto.NAME_ITEMGROUP, StandardBasicTypes.STRING)
			 .addScalar(ItemDto.ID_ITEM, StandardBasicTypes.INTEGER)
			 .addScalar(ItemDto.NAME_ITEM, StandardBasicTypes.STRING)
			 .addScalar(ItemDto.SALES_OUT, StandardBasicTypes.DOUBLE)
			 .addScalar(ItemDto.SALES_IN, StandardBasicTypes.DOUBLE)
			 .addScalar(ItemDto.TOTAL_AMOUNT, StandardBasicTypes.INTEGER)
			 .setResultTransformer(Transformers.aliasToBean(ItemDto.class));
			
		return safeList(query);
	}

}
