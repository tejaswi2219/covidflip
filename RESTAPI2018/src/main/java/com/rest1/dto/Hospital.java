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
public class Hospital {
	@Id@GeneratedValue
	private int sId;
	private int ruralhospitals;
	private int ruralbeds;
	private String state;
	private int urbanhospitals;
	private int urbanbeds;
	private int totalhospitals;
	private int totalbeds;
	public Hospital() {
		
	}
	private int getsId() {
		return sId;
	}
	private void setsId(int sId) {
		this.sId = sId;
	}
	private int getRuralhospitals() {
		return ruralhospitals;
	}
	private void setRuralhospitals(int ruralhospitals) {
		this.ruralhospitals = ruralhospitals;
	}
	private int getRuralbeds() {
		return ruralbeds;
	}
	private void setRuralbeds(int ruralbeds) {
		this.ruralbeds = ruralbeds;
	}
	private String getState() {
		return state;
	}
	private void setState(String state) {
		this.state = state;
	}
	private int getUrbanhospitals() {
		return urbanhospitals;
	}
	private void setUrbanhospitals(int urbanhospitals) {
		this.urbanhospitals = urbanhospitals;
	}
	private int getUrbanbeds() {
		return urbanbeds;
	}
	private void setUrbanbeds(int urbanbeds) {
		this.urbanbeds = urbanbeds;
	}
	private int getTotalhospitals() {
		return totalhospitals;
	}
	private void setTotalhospitals(int totalhospitals) {
		this.totalhospitals = totalhospitals;
	}
	private int getTotalbeds() {
		return totalbeds;
	}
	private void setTotalbeds(int totalbeds) {
		this.totalbeds = totalbeds;
	}
	public Hospital(int sId, int ruralhospitals, int ruralbeds, String state, int urbanhospitals, int urbanbeds,
			int totalhospitals, int totalbeds) {
		super();
		this.sId = sId;
		this.ruralhospitals = ruralhospitals;
		this.ruralbeds = ruralbeds;
		this.state = state;
		this.urbanhospitals = urbanhospitals;
		this.urbanbeds = urbanbeds;
		this.totalhospitals = totalhospitals;
		this.totalbeds = totalbeds;
	}

	
	
}
