package com.projectvotes.Entities;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;



@Embeddable
public class VoteId implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -929818338708624115L;
	private User user;
	private Features feature;
	
	@ManyToOne
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	@ManyToOne
	public Features getFeatures() {
		return feature;
	}
	public void setFeatures(Features feature) {
		this.feature = feature;
	}
	
	

}
