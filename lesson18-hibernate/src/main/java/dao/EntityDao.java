package dao;

import org.hibernate.Session;

import utils.HibernateUtils;

public class EntityDao {
	
	public Session openSession() {
		return HibernateUtils.getSessionFactory().openSession();
	}
}
