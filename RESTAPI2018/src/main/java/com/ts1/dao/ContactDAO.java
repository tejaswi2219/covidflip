package com.ts1.dao;

import org.hibernate.SessionFactory;

import com.rest1.dto.Contact;
import com.ts1.db.HibernateTemplate;

public class ContactDAO {
	private SessionFactory factory = null;
	private static SessionFactory sessionFactory;
	public int store(Contact contact) {
		return HibernateTemplate.addObject(contact);
	}
}
