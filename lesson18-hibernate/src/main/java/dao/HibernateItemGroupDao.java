package dao;

import java.util.List;

import org.hibernate.query.NativeQuery;
import org.hibernate.type.StandardBasicTypes;

import persistence.ItemGroup;

public class HibernateItemGroupDao extends EntityDao implements ItemGroupDao {

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
		
		return openSession().createNamedQuery("somename", ItemGroup.class).getResultList();
		

		

	}
	
	public ItemGroup get(int igrId) {
		// Required: ItemGroup is a Entity
										// SELECT * FROM LoaiHang WHERE MaLoai = :maloai
		return openSession().createQuery("SELECT ig FROM ItemGroup ig WHERE ig.igrId = :maloai", ItemGroup.class)
				.setParameter("maloai", igrId, StandardBasicTypes.INTEGER)
				.getSingleResult();
	}

}