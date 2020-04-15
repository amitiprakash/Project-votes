package com.projectvotes.Entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Comment {
	
	private String text;
	private CommentId commentid;
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	@EmbeddedId
	public CommentId getCommentid() {
		return commentid;
	}
	public void setCommentid(CommentId commentid) {
		this.commentid = commentid;
	}
	
	
	

}
