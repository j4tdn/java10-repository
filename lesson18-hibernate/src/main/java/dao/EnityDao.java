package dao;

import org.hibernate.Session;

import utils.HibernateUtils;

public class EnityDao {
	Session openSession() {
		return HibernateUtils.getSessionFactory().openSession();
		//		return HibernateUtils.getSessionFactoryJava().openSession();

	}
}
