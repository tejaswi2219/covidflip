package com.ts1.db;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class HibernateTemplate {
	

	private static SessionFactory sessionFactory;
	
	static {
		sessionFactory = new Configuration().configure().buildSessionFactory();
	}
	
	public static int addObject(Object obj){
		System.out.println("Inside Template...");
		int result=0;
		Transaction tx=null;		
		try {
			Session session=sessionFactory.openSession();
			tx=session.beginTransaction();
			session.save(obj);
			tx.commit();
			result=1;		
		} catch (Exception e) {
			System.out.println("failure...");		
			tx.rollback();			
			e.printStackTrace();
		}		
		return result;
	}
	
}
	   
	