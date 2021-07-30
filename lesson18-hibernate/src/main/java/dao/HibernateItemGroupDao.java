package dao;

import java.util.ArrayList;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.NativeQuery;
import org.hibernate.type.StandardBasicTypes;

import persistence.ItemGroup;

public class HibernateItemGroupDao extends EntityDao implements ItemGroupDao {

	public List<ItemGroup> getAll() {
		// Mapping: tableA = entityA
		// col1 = att1
		// co2 =att2

		// nativeQuery
		// E.g SELECT col1, col2 From table A

		// HibernateQueryLanguage
		// E.g SELECT FROM entity1 E1 WHERE E1.att1 = :val1

		// hQL/ JPQL: NameQueries (Name

		return openSession().createNamedQuery("somename", ItemGroup.class).getResultList();
		
		//return openSession().createQuery(ItemGroup.getALL, ItemGroup.class).getResultList();
		//return openSession().createQuery("FROM ItemGroup", ItemGroup.class).getResultList();

		// return openSession().createNativeQuery("SELECT * FROM LoaiHang",
		// ItemGroup.class)
		// .getResultList();
	}

	public ItemGroup get(int igrId) {
		// Required: ItemGroup is an Entity
		//		return  openSession().createNativeQuery("SELECT * FROM LoaiHang WHERE MaLoai = :maloai", ItemGroup.class)
		//		.setParameter("maloai", igrId, StandardBasicTypes.INTEGER)
		//		.getSingleResult();
		return openSession().createQuery("SELECT ig FROM ItemGroup ig WHERE ig.igrId = :maloai", ItemGroup.class)
				.setParameter("maloai", igrId, StandardBasicTypes.INTEGER).getSingleResult();

	}
}
