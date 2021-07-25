package dao;

import org.hibernate.Session;

import utils.HibernateUtils;

public class AbstractHibernateDao {
	
	Session openSession() {
		return HibernateUtils.getSessionFactory().openSession();		
	}

}