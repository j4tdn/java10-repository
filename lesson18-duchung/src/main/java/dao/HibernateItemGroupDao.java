package dao;

import java.util.List;

import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.StandardBasicTypes;

import persistence.ItemGroupDto;

public class HibernateItemGroupDao extends AbstractHibernateDao implements ItemGroupDao {
	private static final String GET_ITEM_GROUP_DTOS = "SELECT lh.maLoai as "+ItemGroupDto.ID+", lh.TenLoai as "+ItemGroupDto.NAME+"," 
				+"	SUM(kcmh.SoLuong) as "+ItemGroupDto.NUMBER+" "
						+" FROM MatHang mh " 
						+" JOIN LoaiHang lh " 
						+" ON mh.MaLoai = lh.MaLoai "  
						+"JOIN KichCoMatHang kcmh " 
						+"ON mh.MaMH = kcmh.MaMH " 
						+" GROUP BY lh.maLoai";
	//2. Thống kê số lượng mặt hàng tồn kho của mỗi loại hàng.
	@SuppressWarnings("deprecation")
	@Override
	public List<ItemGroupDto> getItemGroupDaoById() {
		NativeQuery<?> query = openSession().createNativeQuery(GET_ITEM_GROUP_DTOS);
		    query.addScalar(ItemGroupDto.ID, StandardBasicTypes.INTEGER)
				.addScalar(ItemGroupDto.NAME, StandardBasicTypes.STRING)
				.addScalar(ItemGroupDto.NUMBER, StandardBasicTypes.INTEGER)
				.setResultTransformer(Transformers.aliasToBean(ItemGroupDto.class));
		return safeList(query);
	}

}
