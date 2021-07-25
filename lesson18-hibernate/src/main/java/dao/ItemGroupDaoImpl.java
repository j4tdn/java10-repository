package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.NativeQuery;

import persistence.ItemGroup;

public class ItemGroupDaoImpl extends AbstractHibernateDao implements ItemGroupDao {

	public List<ItemGroup> getAll() {
		List<ItemGroup> result = new ArrayList<>();
		String sql = "SELECT * FROM LoaiHang";
		Session session = openSession();

		NativeQuery<ItemGroup> query = session.createNativeQuery(sql, ItemGroup.class);
		result = query.getResultList();

		return result;
	}

}
