package utils;

import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
public class HibernateUtils {
	private static SessionFactory sessionFactory;

	private HibernateUtils() {

	}

	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			Configuration configuration = new Configuration();
			sessionFactory = configuration.configure("hibernate.cfg.xml").buildSessionFactory();
		}
		return sessionFactory;
	}
}
