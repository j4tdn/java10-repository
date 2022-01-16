package com.springmvc.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.type.IntegerType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springmvc.entity.Customer;

@Repository
public class HibernateCustomerDao implements CustomerDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Customer> getAll(int offset, int rowcount) {
		Session session = sessionFactory.getCurrentSession();
		return session.createNativeQuery("SELECT * FROM Customer LIMIT :offset, :rowcount", Customer.class)
					  .setParameter("offset", offset)	
					  .setParameter("rowcount", rowcount)
				      .getResultList();
	}
	
	@Override
	public int countTotalRecords() {
		Session session = sessionFactory.getCurrentSession();
		final String sql = "SELECT COUNT(*) totalRecords FROM customer";
		return (int)session.createNativeQuery(sql)
					  .addScalar("totalRecords", IntegerType.INSTANCE)
					  .getSingleResult();
	}
	
}
