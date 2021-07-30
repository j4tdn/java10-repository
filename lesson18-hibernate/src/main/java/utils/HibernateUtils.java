package utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import com.sun.xml.fastinfoset.sax.Properties;

import persistence.ItemGroup;

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
	
	public static SessionFactory getSessionFactoryJava() {
		if (sessionFactory == null) {
			Configuration cfg = new Configuration();
			java.util.Properties props = new java.util.Properties();
			props.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
			props.put(Environment.URL, "jdbc:mysql://localhost:3306/java09_shopping");
			props.put(Environment.USER, "root");
			props.put(Environment.PASS, "1234");
			props.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
			props.put(Environment.SHOW_SQL, "true");
			props.put(Environment.FORMAT_SQL, "true");
			props.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
			cfg.setProperties(props);
			
			cfg.addAnnotatedClass(ItemGroup.class);
			
			
			sessionFactory = cfg.buildSessionFactory();
		}
		return sessionFactory;
	}
	
	
}
