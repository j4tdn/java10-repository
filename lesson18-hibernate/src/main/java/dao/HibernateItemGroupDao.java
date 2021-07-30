package dao;

import java.util.List;

import org.hibernate.type.StandardBasicTypes;

import persistence.ItemGroup;

public class HibernateItemGroupDao extends EntityDao implements ItemGroupDao {

	public List<ItemGroup> getAll() {
		// Required: ItemGroup is a ENTITY
		
		// Mapping: tableA = entityA
		// 			col1   = attr1
		// 			col2   = attr2
		
		// NativeQuery: E.g: SELECT col1, col2 FROM tableA 
		// HibernateQueryLanguage (HQL): Java Persistence Language (JPQL)
		// e.g: SELECT E1 FROM entity1 E1 WHERE E1.att1 = :val1
		// return openSession().createQuery("ItemGroup.GET_ALL", ItemGroup.class).getResultList();

		// HQL/JPQL: NamesQueries
		return openSession().createNamedQuery("somename", ItemGroup.class).getResultList();
		
				// return openSession().createQuery("FROM ItemGroup", ItemGroup.class).getResultList();
		
		// return openSession().createNativeQuery("SELECT * FROM LoaiHang", ItemGroup.class).getResultList();
	}
	
	public ItemGroup get(int igrId) {
		// Required: ItemGroup is a ENTITY
		 return openSession().createQuery("SELECT ig FROM ItemGroup ig WHERE ig.igrId = :maloai", ItemGroup.class)
				 	.setParameter("maloai", igrId, StandardBasicTypes.INTEGER).getSingleResult();
	}
	
}
