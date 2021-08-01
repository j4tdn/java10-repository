package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import persistence.Item;

public class HibernateItemDao extends EnityDao implements ItemDao {

	@Override
	public List<Item> getAll() {
		return openSession().createNativeQuery("select * from mathang", Item.class).getResultList();
	}

	@Override
	public Item get(int id) {
		// using createNativeQuery not sp level cache
		// using getCurrentSession create transaction
//		return openSession().createNativeQuery("select * from mathang where MaMH = :MaMH", Item.class)
//				.setParameter("MaMH", id, StandardBasicTypes.INTEGER).getSingleResult();
		
		// check create session:
//		Session session = openSession();
//		Session sessionX = openSession();
//		Item item1 = session.get(Item.class, 1);
//		System.out.println(item1);
//		Item item2 = session.get(Item.class, 2);
//		System.out.println(item2);
//		Item item3 = session.get(Item.class, 1);
//		System.out.println(item3);
//		Item item4 = session.get(Item.class, 2);
//		System.out.println(item4);
//		return null;
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
}
