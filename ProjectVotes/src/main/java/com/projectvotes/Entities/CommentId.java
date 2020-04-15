package com.projectvotes.Entities;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class CommentId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8297597094690202044L;
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
	public Features getFeature() {
		return feature;
	}
	public void setFeature(Features feature) {
		this.feature = feature;
	}
	
	

}
