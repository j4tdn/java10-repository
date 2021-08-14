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

	private static final String GET_ITEM_DTOS = 
			"SELECT lh.MaLoai AS  "        + ItemGroupDto.ID   + ",\n"  + 
			"       lh.TenLoai AS "        + ItemGroupDto.NAME + ",\n" + 
			"       SUM(kcmh.SoLuong) AS " + ItemGroupDto.TOTAL_AMOUNT +"\n" + 
			"FROM LoaiHang lh\n" + 
			"JOIN MatHang  mh\n" + 
			"  ON lh.MaLoai = mh.MaLoai\n" + 
			"JOIN KichCoMatHang kcmh\n" + 
			"  ON mh.MaMH = kcmh.MaMH\n" + 
			"GROUP BY lh.MaLoai";
	
	
	public List<ItemGroup> getAll() {
		// Mapping: tableA = entityA
		// col1 = att1
		// co2 =att2

		// nativeQuery
		// E.g SELECT col1, col2 From table A

		// HibernateQueryLanguage
		// E.g SELECT FROM entity1 E1 WHERE E1.att1 = :val1

		// hQL/ JPQL: NameQueries (Name

		return openSession().createNamedQuery(ItemGroup.GET_ALL, ItemGroup.class).getResultList();
		
		//return openSession().createQuery(ItemGroup.getALL, ItemGroup.class).getResultList();
		//return openSession().createQuery("FROM ItemGroup", ItemGroup.class).getResultList();

		// return openSession().createNativeQuery("SELECT * FROM LoaiHang",
		// ItemGroup.class)
		// .getResultList();
	}

	@SuppressWarnings("deprecation")
	@Override
	public List<ItemGroupDto> getItemGroupDtos() {
		NativeQuery<?> query = openSession().createNativeQuery(GET_ITEM_DTOS);
		
		query.addScalar(ItemGroupDto.ID, StandardBasicTypes.INTEGER)
		     .addScalar(ItemGroupDto.NAME, StandardBasicTypes.STRING)
		     .addScalar(ItemGroupDto.TOTAL_AMOUNT, StandardBasicTypes.INTEGER)
		     .setResultTransformer(Transformers.aliasToBean(ItemGroupDto.class));
		
		return safeList(query);
	}
	
	public ItemGroup get(int igrId) {
		// Required: ItemGroup is an Entity
		return openSession().createQuery("SELECT ig FROM ItemGroup ig WHERE ig.igrId = :maloai", ItemGroup.class)
				            .setParameter("maloai", igrId, StandardBasicTypes.INTEGER)
				            .getSingleResult();
		
	}
	@Override
	public boolean save(ItemGroup itemGroup) {
		// Session >> save saveOfUpdate
		// EntityManager >> persist, merge
		
		Session session = openSession();
		Transaction transaction = session.beginTransaction();
		
		try {
			session.saveOrUpdate(itemGroup);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
		}
		
		return true;
	}
	
	
}
