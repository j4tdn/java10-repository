package dao;

import java.util.List;

import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.StandardBasicTypes;
import org.hibernate.type.Type;

import persistence.ItemGroup;
import persistence.ItemGroupDto;

public class HibernateItemGroupDao extends EntityDao implements ItemGroupDao {
	
	private static final String GET_ITEM_DTOS=
			"SELECT lh.MaLoai AS " + ItemGroupDto.ID + ",\r\n"
			+ "       lh.TenLoai AS " + ItemGroupDto.NAME + ",\r\n"
			+ "       SUM(kcmh.SoLuong) AS " + ItemGroupDto.TOTAL_AMOUNT + " \r\n"
			+ "FROM LoaiHang lh\r\n"
			+ "JOIN MatHang  mh\r\n"
			+ "  ON lh.MaLoai = mh.MaLoai\r\n"
			+ "JOIN KichCoMatHang kcmh\r\n"
			+ "  ON mh.MaMH = kcmh.MaMH\r\n"
			+ "GROUP BY lh.MaLoai";
	
	public List<ItemGroup> getAll() {
		// Required: ItemGroup is a Entity
		// Mapping: tableA = entityA
		//			col1 	= att1
		//			col2 	= att2
		
		// NativeQuery: E.g SELECT col1, col2 From tableA
		
//		return openSession().createNativeQuery("SELECT * FROM LoaiHang", ItemGroup.class)
//		.getResultList();
		
		
		// HibernateQueryLanguage(HQL): JavaPersistenceLanguage (JPQL)
		// E.g SELECT F1 FROM entity1 E1 WHERE E1.att1 = :val1
		
//		return openSession().createQuery("FROM ItemGroup", ItemGroup.class)
//							.getResultList();
		
		// HQL/JPQL: NamesQueries(NameQuery(name =?, query = ? ))
		
		return openSession().createNamedQuery( ItemGroup.GET_ALL , ItemGroup.class).getResultList();
		

		

	}
	
	public ItemGroup get(int igrId) {
		// Required: ItemGroup is a Entity
										// SELECT * FROM LoaiHang WHERE MaLoai = :maloai
		return openSession().createQuery("SELECT ig FROM ItemGroup ig WHERE ig.igrId = :maloai", ItemGroup.class)
				.setParameter("maloai", igrId, StandardBasicTypes.INTEGER)
				.getSingleResult();
	}

	@Override
	public List<ItemGroupDto> getItemGroupDtos() {
		NativeQuery<?> query = openSession().createNativeQuery(GET_ITEM_DTOS);
		
		query.addScalar(ItemGroupDto.ID, StandardBasicTypes.INTEGER)
			.addScalar(ItemGroupDto.NAME, StandardBasicTypes.STRING)
			.addScalar(ItemGroupDto.TOTAL_AMOUNT, StandardBasicTypes.INTEGER)
			.setResultTransformer(Transformers.aliasToBean(ItemGroupDto.class));
		
		return safeList(query);
	}

	

}