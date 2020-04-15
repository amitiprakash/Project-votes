package com.projectvotes.Entities;


import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Vote {
	
	
	private boolean upvote;
	private VoteId pk;
	
	
	public boolean isUpvote() {
		return upvote;
	}
	public void setUpvote(boolean upvote) {
		this.upvote = upvote;
	}
	@EmbeddedId
	public VoteId getPk() {
		return pk;
	}
	public void setPk(VoteId pk) {
		this.pk = pk;
	}


}
