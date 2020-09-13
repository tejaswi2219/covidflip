package com.ts1.dao;

import org.hibernate.SessionFactory;

import com.rest1.dto.Contact;
import com.rest1.dto.Hospital;
import com.ts1.db.HibernateTemplate;

public class HospitalDAO {
	private SessionFactory factory = null;
	private static SessionFactory sessionFactory;
	public int store(Hospital hospital) {
		return HibernateTemplate.addObject(hospital);
	}
}