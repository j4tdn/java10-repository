package dao;

import java.util.List;

import persistence.Item;

public class HibernateItemDao extends EntityDao implements ItemDao {

	@Override
	public List<Item> getAll() {
		return openSession().createNativeQuery("SELECT * FROM MatHang", Item.class )
				.getResultList();
	}

}
