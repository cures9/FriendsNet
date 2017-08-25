package com.everis.alicante.courses.beca.summer17.friendsnet.entity;

import java.util.Date;

public class Post implements FNEntity{

	private Long id;
	
	private String text;
	
	private Date creationDate;
	
	private PostType Date;
	
	private byte[] picture;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public PostType getDate() {
		return Date;
	}

	public void setDate(PostType date) {
		Date = date;
	}

	public byte[] getPicture() {
		return picture;
	}

	public void setPicture(byte[] picture) {
		this.picture = picture;
	}

	
}
