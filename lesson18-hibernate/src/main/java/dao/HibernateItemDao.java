package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import persistence.Item;

public class HibernateItemDao extends EntityDao implements ItemDao{

	@Override
	public List<Item> getAll() {
		return openSession().createNativeQuery("SELECT * FROM MatHang", Item.class)
				            .getResultList();
	}

	@Override
	public Item get(int id) {
		Item item = null;
		Session session = getCurrentSession();
		Session session2 = getCurrentSession();
		
		System.out.println(session);
		System.out.println(session2);
		
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
	public boolean save(Item item) {
		// Session >> save saveOfUpdate
		// EntityManager >> persist, merge
		
		Session session = openSession();
		Transaction transaction = session.beginTransaction();
		
		try {
			session.saveOrUpdate(item);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
		}
		
		return true;
	}
}