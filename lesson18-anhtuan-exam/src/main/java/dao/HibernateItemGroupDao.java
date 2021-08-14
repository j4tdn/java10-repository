package dao;

import java.util.List;

import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.StandardBasicTypes;

import persistence.ItemGroupDto;

public class HibernateItemGroupDao extends EntityDao implements ItemGroupDao {

	private static final String ITEM_GROUP_DTOS = "SELECT lh.maLoai AS " + ItemGroupDto.ID
			+ "" + ", lh.TenLoai AS " + ItemGroupDto.NAME + "" + ", mh.maMH AS " + ItemGroupDto.ITEM_ID
			+ "" + ", mh.TenMH AS " + ItemGroupDto.ITEM_NAME + "" + ", mh.GiaBan AS " + ItemGroupDto.PRICE
			+ "" + ", mh.GiaMua AS " + ItemGroupDto.PURCHAS_PRICE + ", " + " SUM(kcmh.SoLuong) AS "
			+ ItemGroupDto.NUMBER + " FROM MatHang mh JOIN LoaiHang lh "
			+ " ON mh.MaLoai = lh.MaLoai JOIN KichCoMatHang kcmh  ON mh.MaMH = kcmh.MaMH "
			+ " GROUP BY mh.maLoai,mh.maMH";

	@SuppressWarnings("deprecation")
	@Override
	public List<ItemGroupDto> Items() {
		NativeQuery<?> query = openSession().createNativeQuery(ITEM_GROUP_DTOS);
		query.addScalar(ItemGroupDto.ID, StandardBasicTypes.INTEGER)
				.addScalar(ItemGroupDto.NAME, StandardBasicTypes.STRING)
				.addScalar(ItemGroupDto.ITEM_ID, StandardBasicTypes.INTEGER)
				.addScalar(ItemGroupDto.ITEM_NAME, StandardBasicTypes.STRING)
				.addScalar(ItemGroupDto.PRICE, StandardBasicTypes.DOUBLE)
				.addScalar(ItemGroupDto.PURCHAS_PRICE, StandardBasicTypes.DOUBLE)
				.addScalar(ItemGroupDto.NUMBER, StandardBasicTypes.INTEGER)
				.setResultTransformer(Transformers.aliasToBean(ItemGroupDto.class));
		return safeList(query);
	}

}
