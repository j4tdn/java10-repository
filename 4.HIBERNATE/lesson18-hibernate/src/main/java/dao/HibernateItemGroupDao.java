package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.NativeQuery;

import persistence.ItemGroup;

public class HibernateItemGroupDao extends AbstractHibernateDao implements ItemGroupDao {
	public List<ItemGroup> getAll() {
		String sql = "select * from loaihang";
		Session session = openSession();
		NativeQuery<ItemGroup> query = session.createNativeQuery(sql, ItemGroup.class);
		// require: ItemGroup is a Enity
		// return openSession().createNativeQuery(sql, ItemGroup.class).getResultList();
		return query.getResultList();
	}
}
