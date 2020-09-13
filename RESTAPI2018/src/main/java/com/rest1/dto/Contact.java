package com.rest1.dto;

import java.util.ArrayList;
import java.util.Collection;
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
public class Contact {
	@Id@GeneratedValue
	private int sId;
	private String state;
	//private String email;
	@Embedded
	private Number mobile;
	public Contact() {
		
	}

	

	


	private int getsId() {
		return sId;
	}






	private void setsId(int sId) {
		this.sId = sId;
	}






	private String getState() {
		return state;
	}






	private void setState(String state) {
		this.state = state;
	}






	private Number getMobile() {
		return mobile;
	}






	private void setMobile(Number mobile) {
		this.mobile = mobile;
	}



	public Contact(int sId, String state,Number mobile) {
		super();
		this.sId = sId;
		this.state = state;
		this.mobile = mobile;
	}

	
	
}
