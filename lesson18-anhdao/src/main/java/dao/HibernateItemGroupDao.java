package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.StandardBasicTypes;

import persistence.ItemDate;
import persistence.ItemDto;
import persistence.ItemGroup;
import persistence.ItemGroupDto;

public class HibernateItemGroupDao extends EntityDao implements ItemGroupDao {
//Câu 2
	private static final String GET_Item_Group = 
			"SELECT lh.MaLoai AS "+ItemGroupDto.ID+",\n"
					+ "	   lh.TenLoai AS "+ItemGroupDto.NAME+",\n"
					+ "    SUM(kcmh.SoLuong) AS "+ItemGroupDto.TOTAL_AMOUNT+"\n"
					+ "FROM loaihang lh\n"
					+ "JOIN mathang mh\n"
					+ "ON lh.MaLoai=mh.MaLoai\n"
					+ "JOIN kichcomathang kcmh\n"
					+ "ON kcmh.MaMH=mh.MaMH\n"
					+ "GROUP BY lh.MaLoai";
	
	@SuppressWarnings("deprecation")
	@Override
	public List<ItemGroupDto> getAll() {
		Session session = openSession();
		NativeQuery<?> query = session.createNativeQuery(GET_Item_Group);
		query.addScalar(ItemGroupDto.ID, StandardBasicTypes.INTEGER)
		    .addScalar(ItemGroupDto.NAME, StandardBasicTypes.STRING);
		query.setResultTransformer(Transformers.aliasToBean(ItemGroupDto.class));
		return safeList(query);
	}

//	

}
