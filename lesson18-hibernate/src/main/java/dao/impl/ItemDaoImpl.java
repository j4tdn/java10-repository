package dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import dao.EntityDao;
import dao.ItemDao;
import persistence.Item;

public class ItemDaoImpl extends EntityDao implements ItemDao {
	
	@Override
	public List<Item> getAll() {
		return openSession()
				.createNativeQuery("SELECT * FROM MatHang", Item.class)
				.getResultList();
	}
	
	@Override
	public Item get(int id) {
		Item item = null;
		Session session = getCurrentSession();
		Transaction transaction = session.beginTransaction();
		try {
			item = session.get(Item.class, id);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
		}
		return item;
	}
	
	@Override
	public void save(Item item) {
		Session session = getCurrentSession();
		Transaction transaction = session.beginTransaction();
		try {
			session.saveOrUpdate(item);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
		}
	}
}
