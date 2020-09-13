package com.rest1.dto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

@Entity
public class Notification {
	@Id@GeneratedValue
	private int sId;
	private Date date;
	private String title;
	//private String email;
	
	public Notification() {
		
	}

	private int getsId() {
		return sId;
	}

	private void setsId(int sId) {
		this.sId = sId;
	}

	private Date getDate() {
		return date;
	}

	private void setDate(Date date) {
		this.date = date;
	}

	private String getTitle() {
		return title;
	}

	private void setTitle(String title) {
		this.title = title;
	}

	public Notification(int sId, Date date, String title) {
		super();
		this.sId = sId;
		this.date = date;
		this.title = title;
	}

	

	
	
}
