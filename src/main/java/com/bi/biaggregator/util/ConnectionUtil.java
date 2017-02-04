package com.bi.biaggregator.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ConnectionUtil {
	
	private ConnectionUtil() {

	}

	/**
	 * 
	 */
	private static final SessionFactory SESSIONFACTORY = buildSessionFactory();

	/**
	 * 
	 * @return sessionFactory
	 */
	private static SessionFactory buildSessionFactory() {
		SessionFactory sessionFactory = null;
		synchronized (ConnectionUtil.class) {
			try {
				/*final Configuration configuration = new Configuration();
				configuration.configure("/resources/hibernate/hibernate.cfg.xml");
				final ServiceRegistryBuilder serviceBuilder = new ServiceRegistryBuilder()
						.applySettings(configuration.getProperties());
				sessionFactory = configuration
						.buildSessionFactory(serviceBuilder
								.buildServiceRegistry());*/
				sessionFactory = new Configuration().configure().buildSessionFactory();

			} 
			catch (Exception e) {
			}

		}

		return sessionFactory;
	}

	/**
	 * 
	 * @return SessionFactory
	 */
	public static SessionFactory getSessionFactory() {
		return SESSIONFACTORY;
	}

	public static void shutdown() {
		getSessionFactory().close();
	}

}
