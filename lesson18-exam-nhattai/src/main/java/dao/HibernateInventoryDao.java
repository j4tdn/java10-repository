package dao;

import java.util.List;

import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.StandardBasicTypes;

import persistence.InventoryDto;
import persistence.ItemDto;

public class HibernateInventoryDao extends AbstracHibernateDao implements InventoryDao{

	
	private static final String GET_ITEMS = 
			   "SELECT lh.MaLoai AS " 				+ InventoryDto.ID    	+ ",\n"
			            + "lh.TenLoai AS " 			+ InventoryDto.NAME  	+ ",\n"
			            + "SUM(kcmh.SoLuong) AS "   + InventoryDto.AMOUNT   + " \n"
			    + "FROM LoaiHang lh\n"
			    + "JOIN MatHang  mh\n"
			    + 		"ON lh.MaLoai = mh.MaLoai\n"
			    + "JOIN KichCoMatHang kcmh\n"
			            + "ON mh.MaMH = kcmh.MaMH\n"
			    + "GROUP BY lh.MaLoai";
	@Override
	@SuppressWarnings("deprecation")
	public List<InventoryDto> getItems() {
		NativeQuery<?> query = openSession().createNativeQuery(GET_ITEMS);

		query.addScalar(InventoryDto.ID, StandardBasicTypes.INTEGER)
				.addScalar(InventoryDto.NAME, StandardBasicTypes.STRING)
				.addScalar(InventoryDto.AMOUNT, StandardBasicTypes.INTEGER)
				.setResultTransformer(Transformers.aliasToBean(InventoryDto.class));

		return safeList(query);
	}
	
}
