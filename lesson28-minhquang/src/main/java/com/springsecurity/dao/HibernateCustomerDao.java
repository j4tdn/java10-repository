package com.springsecurity.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.hibernate.type.IntegerType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springsecurity.entity.Customer;

@Repository
public class HibernateCustomerDao implements CustomerDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Customer> getAll(int offset, int rowcount) {
		Session session = sessionFactory.getCurrentSession();
		return session.createNativeQuery("SELECT * FROM customer LIMIT :offset, :rowcount", Customer.class)
					  .setParameter("offset", offset)
					  .setParameter("rowcount", rowcount)
				      .getResultList();
	}
	
	@Override
	public List<Customer> getAll(int offset, int rowcount, String sort) {
		Session session = sessionFactory.getCurrentSession();
		return session.createNativeQuery(
				"SELECT * FROM customer LIMIT :offset, :rowcount" + sort, 
				Customer.class)
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
	
	@Override
	public Customer get(Integer customerId) {
		Session session = sessionFactory.getCurrentSession();
		return session.get(Customer.class, customerId);
	}

	@Override
	public List<Customer> search(String customerName) {
        Session currentSession = sessionFactory.getCurrentSession();
        
        Query query = null;
        
        if (customerName != null && customerName.trim().length() > 0) {
        	query = currentSession.createQuery(
            		"FROM Customer WHERE lower(firstName) like :theName or lower(lastName) like :customerName", 
            		Customer.class);
        	query.setParameter("customerName", "%" + customerName.toLowerCase() + "%");
        }
        else {
        	query = currentSession.createQuery("from Customer", Customer.class);            
        }
        
        List<Customer> customers = query.getResultList();
                
        // return the results        
        return customers;
	}

	@Override
	public void save(Customer customer) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(customer);
	}

	@Override
	public void delete(Integer customerId) {
		Session session = sessionFactory.getCurrentSession();
		session.createNativeQuery("DELETE FROM customer WHERE id=:id")
			   .setParameter("id", customerId)
			   .executeUpdate();
	}

}
