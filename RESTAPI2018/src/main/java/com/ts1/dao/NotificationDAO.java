package com.ts1.dao;

import org.hibernate.SessionFactory;

import com.rest1.dto.Contact;
import com.rest1.dto.Notification;
import com.ts1.db.HibernateTemplate;

public class NotificationDAO {
	private SessionFactory factory = null;
	private static SessionFactory sessionFactory;
	public int store(Notification notification) {
		return HibernateTemplate.addObject(notification);
	}
}
