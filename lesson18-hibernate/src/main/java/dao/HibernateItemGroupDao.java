package dao;

import java.util.List;

import persistence.ItemGroup;

public class HibernateItemGroupDao extends AbstractHibernateDao implements ItemGroupDao {

	public List<ItemGroup> getAll() {
		// Required: ItemGroup is a ENTITY
		return openSession().createNativeQuery("SELECT * FROM LoaiHang", ItemGroup.class).getResultList();
	}
}
