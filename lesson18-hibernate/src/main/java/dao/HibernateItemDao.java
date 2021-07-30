package dao;

import java.util.List;

import persistence.Item;

public class HibernateItemDao extends EnityDao implements ItemDao{

	@Override
	public List<Item> getAll() {
		return openSession().createNativeQuery("select * from mathang", Item.class).getResultList();
	}
}
