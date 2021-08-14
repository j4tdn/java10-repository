package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.StandardBasicTypes;

import persistence.ItemGroup;
import persistence.ItemGroupDto;

public class HibernateItemGroupDao extends EntityDao implements ItemGroupDao {

	private static final String GET_ITEM_DTOS = "SELECT lh.MaLoai AS  " 
			+ ItemGroupDto.ID + ",\n"
			+ "       lh.TenLoai AS " 
			+ ItemGroupDto.NAME + ",\n" 
			+ "       SUM(kcmh.SoLuong) AS "
			+ ItemGroupDto.TOTAL_AMOUNT 
			+ "\n" 
			+ "FROM LoaiHang lh\n" 
			+ "JOIN MatHang  mh\n"
			+ "  ON lh.MaLoai = mh.MaLoai\n" 
			+ "JOIN KichCoMatHang kcmh\n" 
			+ "  ON mh.MaMH = kcmh.MaMH\n"
			+ "GROUP BY lh.MaLoai";

	@Override
	public List<ItemGroupDto> getItemGroupDtos() {
		NativeQuery<?> query = openSession().createNativeQuery(GET_ITEM_DTOS);

		query.addScalar(ItemGroupDto.ID, StandardBasicTypes.INTEGER)
				.addScalar(ItemGroupDto.NAME, StandardBasicTypes.STRING)
				.addScalar(ItemGroupDto.TOTAL_AMOUNT, StandardBasicTypes.INTEGER)
				.setResultTransformer(Transformers.aliasToBean(ItemGroupDto.class));

		return safeList(query);
	}

	@Override
	public List<ItemGroup> getAll() {
		return openSession().createNativeQuery("SELECT * FROM LoaiHang", ItemGroup.class).getResultList();
	}

}
