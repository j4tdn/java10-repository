package dao;

import org.hibernate.Session;

import utils.HibernateUtils;

public class AbstractHibernateDAO {
	public Session openSession() {
		return HibernateUtils.getSessionFactoryXml().openSession();
	}
	
	public Session getCurrentSession() {
		return HibernateUtils.getSessionFactoryXml().getCurrentSession();
	}
}
