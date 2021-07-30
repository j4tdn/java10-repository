package dao;

import java.util.List;

import javax.persistence.NamedQueries;

import org.hibernate.Session;
import org.hibernate.query.NativeQuery;
import org.hibernate.type.StandardBasicTypes;

import persistence.ItemGroup;

public class HibernateItemGroupDao extends EnityDao implements ItemGroupDao {
	// NativeQuery: E.g select col1,col2 from tableA
	// mapping: tableA = EnityA
	//          col1=att1	
	//          col2=att2
	// HibernateQueryLanguage(HQL) same with javaPersistenceLanguage :
	// selsect e1 from enity1 e1 where e1.att1 = val1
	
	//c1. NativeQuery
//	public List<ItemGroup> getAll() {
//		String sql = "select * from loaihang";
//		Session session = openSession();
//		NativeQuery<ItemGroup> query = session.createNativeQuery(sql, ItemGroup.class);
//		// require: ItemGroup is a Enity
//		// return openSession().createNativeQuery(sql, ItemGroup.class).getResultList();
//		return query.getResultList();
//	}
	//c2.  HQL/JPQL
	public List<ItemGroup> getAll() {
		// In HQL/JPQL have sp @NamedQueries: can add @NamedQueries in class Enity replace sql in createQuery  
		String name = "someName";
		Session session = openSession();
		return  session.createNamedQuery(name, ItemGroup.class).getResultList();
		
		//HQL:
		// "select ig from ItemGroup ig" same with "from ItemGroup"
		//String sql = "from ItemGroup";
		// Session session = openSession();
		//return  session.createQuery(sql, ItemGroup.class).getResultList();
	}

	public ItemGroup get(int igrId) {
		// "select ig from ItemGroup ig where ig.igrId = :maloai" using createQuery replace createNativeQuery
		NativeQuery<ItemGroup> query2 = openSession().createNativeQuery("select * from loaihang where Maloai = :Maloai",
				ItemGroup.class);
		//  StandardBasicTypes.INTEGER: [make the code clearer]
		query2.setParameter("Maloai", igrId, StandardBasicTypes.INTEGER);
		return query2.getSingleResult();
		// or return openSession().createNativeQuery("select * from loaihang where Maloai = :xyz",
		// ItemGroup.class).setParameter("xyz", igrId, StandardBasicTypes.INTEGER).getSingleResult();
	}
}
