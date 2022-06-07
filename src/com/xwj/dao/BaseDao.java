package com.xwj.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class BaseDao {

	private static Configuration configuration = null;
	
	private static SessionFactory factory = null;
	
	private static Session session = null;
	
	static {
		try {
			configuration =  new Configuration().configure();
			factory =  configuration.buildSessionFactory();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public static Session getSession() {
		session = factory.openSession();
		return session;
	}
	
	public static void closeSession() {
		if(session != null) {
			session.close();
		}
	}
}
