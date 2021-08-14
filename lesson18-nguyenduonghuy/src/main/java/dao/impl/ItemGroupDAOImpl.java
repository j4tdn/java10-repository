package dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.StandardBasicTypes;

import dao.EntityDAO;
import dao.ItemGroupDAO;
import persistence.ItemGroup;
import persistence.ItemGroupDto;

public class ItemGroupDAOImpl extends EntityDAO implements ItemGroupDAO {

	private static String GET_ALL_DTOS = "SELECT lh.MaLoai AS " + ItemGroupDto.ID + ",\n"
									+ "       lh.TenLoai AS " + ItemGroupDto.NAME + ",\n"
									+ "       SUM(kcmh.SoLuong) AS " + ItemGroupDto.TOTAL_AMOUNT + "\n"
									+ "FROM LoaiHang lh\n"
									+ "JOIN MatHang  mh\n"
									+ "  ON lh.MaLoai = mh.MaLoai\n"
									+ "JOIN KichCoMatHang kcmh\n"
									+ "  ON mh.MaMH = kcmh.MaMH\n"
									+ "GROUP BY lh.MaLoai";
	
	@Override
	public List<ItemGroup> getAllQuantity() {
		Session session = openSession();
		List<ItemGroup> itemGroups = session.createNativeQuery("SELECT lh.*,\n"
									+ "FROM loaihang lh\n"
									+ "JOIN mathang mh\n"
									+ "	ON mh.MaLoai = lh.MaLoai\n"
									+ "JOIN kichcomathang kcmh\n"
									+ "	ON kcmh.MaMH = mh.MaMH\n"
									+ "GROUP BY lh.MaLoai;", ItemGroup.class)
							.getResultList();
		
		return itemGroups;
	}
	
	// Cau 2
	@SuppressWarnings("deprecation")
	@Override
	public List<ItemGroupDto> getItemGroupDtos() {
		NativeQuery<?> query = openSession().createNativeQuery(GET_ALL_DTOS);
		
		query.addScalar(ItemGroupDto.ID, StandardBasicTypes.INTEGER)
			 .addScalar(ItemGroupDto.NAME, StandardBasicTypes.STRING)
			 .addScalar(ItemGroupDto.TOTAL_AMOUNT, StandardBasicTypes.INTEGER)
			 .setResultTransformer(Transformers.aliasToBean(ItemGroupDto.class));
			 
		return safeList(query);
	}

}
