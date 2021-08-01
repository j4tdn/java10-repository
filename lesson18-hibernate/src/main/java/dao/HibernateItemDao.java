package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.type.StandardBasicTypes;



import persistence.Item;
import persistence.ItemGroup;

public class HibernateItemDao extends EntityDao implements ItemDao {

	@Override
	public List<Item> getAll() {
		return openSession().createNativeQuery("SELECT * FROM MatHang", Item.class )
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
		
		System.out.println(session);
		
//		Item item1 = session.get(Item.class, 1);
//		System.out.println(item1);
//		Item item2 = session.get(Item.class, 1);
//		System.out.println(item2);
		return item;

		
//			return openSession().createNativeQuery("SELECT * FROM MatHang WHERE MaMH = :MaMH", Item.class)
//					.setParameter("MaMH", id, StandardBasicTypes.INTEGER)
//					.getSingleResult();
		}
	

}
